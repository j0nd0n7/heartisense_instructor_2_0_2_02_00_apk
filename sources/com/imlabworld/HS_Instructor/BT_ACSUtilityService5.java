package com.imlabworld.HS_Instructor;

import android.app.Service;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.bluetooth.BluetoothManager;
import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.util.Log;
import java.util.List;
import java.util.Stack;
import java.util.UUID;

public class BT_ACSUtilityService5 extends Service {

    /* renamed from: a */
    public static final String f7580a = "com.example.bluetooth.le.ACTION_GATT_CONNECTED";

    /* renamed from: b */
    public static final String f7581b = "com.example.bluetooth.le.ACTION_GATT_DISCONNECTED";

    /* renamed from: c */
    public static final String f7582c = "com.example.bluetooth.le.ACTION_GATT_SERVICES_DISCOVERED";

    /* renamed from: d */
    public static final String f7583d = "com.example.bluetooth.le.ACTION_DATA_AVAILABLE";

    /* renamed from: e */
    public static final int f7584e = 3;

    /* renamed from: f */
    public static final int f7585f = 6;

    /* renamed from: g */
    public static final int f7586g = 7;

    /* renamed from: i */
    private static final int f7587i = 1;

    /* renamed from: j */
    private static final int f7588j = 2;

    /* renamed from: k */
    private static final int f7589k = 4;

    /* renamed from: l */
    private static final int f7590l = 5;

    /* renamed from: m */
    private static final String f7591m = "EXTRA_DATA";

    /* renamed from: n */
    private static final String f7592n = "ACSUtilityService";

    /* renamed from: o */
    private static final int f7593o = 0;

    /* renamed from: p */
    private static final int f7594p = 1;

    /* renamed from: q */
    private static final int f7595q = 2;

    /* renamed from: A */
    private final Stack<Handler> f7596A = new Stack<>();
    /* access modifiers changed from: private */

    /* renamed from: B */
    public Handler f7597B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public boolean f7598C = true;

    /* renamed from: D */
    private final BluetoothGattCallback f7599D = new BluetoothGattCallback() {
        public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            bluetoothGattCharacteristic.getValue();
            Message message = null;
            if (bluetoothGattCharacteristic.getUuid().equals(BT_ACSUtilityService5.this.f7605u)) {
                message = BT_ACSUtilityService5.this.f7597B.obtainMessage(5);
                Bundle bundle = new Bundle();
                bundle.putByteArray("EXTRA_DATA", bluetoothGattCharacteristic.getValue());
                message.setData(bundle);
            }
            message.sendToTarget();
        }

        public void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            if (i == 0) {
            }
        }

        public void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            if (BT_ACSUtilityService5.this.f7598C) {
                Log.i(BT_ACSUtilityService5.f7592n, "data has written!");
                boolean unused = BT_ACSUtilityService5.this.f7598C = false;
                BT_ACSUtilityService5.this.f7597B.obtainMessage(4).sendToTarget();
            }
        }

        public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
            Message message;
            if (i2 == 2) {
                int unused = BT_ACSUtilityService5.this.f7610z = 2;
                message = BT_ACSUtilityService5.this.f7597B.obtainMessage(1);
                Log.i(BT_ACSUtilityService5.f7592n, "Connected to GATT server.");
                Log.i(BT_ACSUtilityService5.f7592n, "Attempting to start service discovery:" + BT_ACSUtilityService5.this.f7601h.discoverServices());
            } else if (i2 == 0) {
                int unused2 = BT_ACSUtilityService5.this.f7610z = 0;
                Log.i(BT_ACSUtilityService5.f7592n, "Disconnected from GATT server.");
                BT_ACSUtilityService5.this.mo8541d();
                message = BT_ACSUtilityService5.this.f7597B.obtainMessage(2);
                String unused3 = BT_ACSUtilityService5.this.f7609y = null;
            } else {
                message = null;
            }
            message.sendToTarget();
        }

        public void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
            super.onDescriptorWrite(bluetoothGatt, bluetoothGattDescriptor, i);
            Log.i(BT_ACSUtilityService5.f7592n, "onDescriptorWrite");
            Log.i(BT_ACSUtilityService5.f7592n, bluetoothGattDescriptor.getCharacteristic().getUuid() + " Notification Enabled");
            if (bluetoothGattDescriptor.getCharacteristic().getUuid().equals(BT_ACSUtilityService5.this.f7605u)) {
                boolean unused = BT_ACSUtilityService5.this.f7598C = false;
                BT_ACSUtilityService5.this.f7597B.obtainMessage(4).sendToTarget();
            }
        }

        public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
            boolean unused = BT_ACSUtilityService5.this.m12981a(BT_ACSUtilityService5.this.f7605u);
        }
    };

    /* renamed from: E */
    private final IBinder f7600E = new C2276a();

    /* renamed from: h */
    public BluetoothGatt f7601h;

    /* renamed from: r */
    private final boolean f7602r = false;

    /* renamed from: s */
    private final boolean f7603s = true;

    /* renamed from: t */
    private UUID f7604t = UUID.fromString("0000ffb0-0000-1000-8000-00805f9b34fb");
    /* access modifiers changed from: private */

    /* renamed from: u */
    public UUID f7605u = UUID.fromString("0000ffb2-0000-1000-8000-00805f9b34fb");

    /* renamed from: v */
    private final UUID f7606v = UUID.fromString("00002902-0000-1000-8000-00805f9b34fb");

    /* renamed from: w */
    private BluetoothManager f7607w;

    /* renamed from: x */
    private BluetoothAdapter f7608x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public String f7609y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public int f7610z = 0;

    /* renamed from: com.imlabworld.HS_Instructor.BT_ACSUtilityService5$a */
    public class C2276a extends Binder {
        public C2276a() {
        }

        /* renamed from: a */
        public BT_ACSUtilityService5 mo8553a() {
            return BT_ACSUtilityService5.this;
        }
    }

    /* renamed from: a */
    private boolean m12978a(BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z) {
        if (this.f7608x == null || this.f7601h == null) {
            return false;
        }
        this.f7601h.setCharacteristicNotification(bluetoothGattCharacteristic, z);
        BluetoothGattDescriptor descriptor = bluetoothGattCharacteristic.getDescriptor(this.f7606v);
        descriptor.setValue(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
        return this.f7601h.writeDescriptor(descriptor);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m12981a(UUID uuid) {
        BluetoothGattCharacteristic b;
        if (this.f7608x == null || this.f7601h == null || (b = m12982b(uuid)) == null) {
            return false;
        }
        return m12978a(b, true);
    }

    /* renamed from: b */
    private BluetoothGattCharacteristic m12982b(UUID uuid) {
        BluetoothGattService service;
        if (this.f7608x == null || this.f7601h == null || (service = this.f7601h.getService(this.f7604t)) == null) {
            return null;
        }
        return service.getCharacteristic(uuid);
    }

    /* renamed from: a */
    public void mo8533a() {
        this.f7596A.pop();
        if (!this.f7596A.empty()) {
            this.f7597B = this.f7596A.peek();
        }
    }

    /* renamed from: a */
    public void mo8534a(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        if (this.f7608x != null && this.f7601h != null) {
            this.f7601h.readCharacteristic(bluetoothGattCharacteristic);
        }
    }

    /* renamed from: a */
    public void mo8535a(Handler handler) {
        this.f7596A.push(handler);
        this.f7597B = handler;
    }

    /* renamed from: a */
    public void mo8536a(String str, String str2) {
        this.f7604t = UUID.fromString(str);
        this.f7605u = UUID.fromString(str2);
    }

    /* renamed from: a */
    public void mo8537a(byte[] bArr) {
        BluetoothGattService service;
        BluetoothGattCharacteristic characteristic;
        if (this.f7601h != null && (service = this.f7601h.getService(this.f7604t)) != null && (characteristic = service.getCharacteristic(this.f7605u)) != null) {
            characteristic.setValue(bArr);
            this.f7601h.writeCharacteristic(characteristic);
        }
    }

    /* renamed from: a */
    public boolean mo8538a(String str) {
        if (this.f7608x == null || str == null) {
            return false;
        }
        if (this.f7609y == null || !str.equals(this.f7609y) || this.f7601h == null) {
            BluetoothDevice remoteDevice = this.f7608x.getRemoteDevice(str);
            if (remoteDevice == null) {
                return false;
            }
            if (this.f7601h != null) {
                this.f7601h.close();
                this.f7601h = null;
            }
            this.f7601h = remoteDevice.connectGatt(this, false, this.f7599D);
            this.f7609y = str;
            this.f7610z = 1;
            return true;
        } else if (!this.f7601h.connect()) {
            return false;
        } else {
            this.f7610z = 1;
            return true;
        }
    }

    /* renamed from: b */
    public boolean mo8539b() {
        Log.i(f7592n, "Initializing ACSUtilityService");
        if (this.f7607w == null) {
            this.f7607w = (BluetoothManager) getSystemService("bluetooth");
            if (this.f7607w == null) {
                return false;
            }
        }
        this.f7608x = this.f7607w.getAdapter();
        return this.f7608x != null;
    }

    /* renamed from: c */
    public void mo8540c() {
        if (this.f7608x != null && this.f7601h != null) {
            this.f7601h.disconnect();
        }
    }

    /* renamed from: d */
    public void mo8541d() {
        if (this.f7601h != null) {
            this.f7601h.close();
            this.f7601h = null;
        }
    }

    /* renamed from: e */
    public List<BluetoothGattService> mo8542e() {
        if (this.f7601h == null) {
            return null;
        }
        return this.f7601h.getServices();
    }

    public IBinder onBind(Intent intent) {
        return this.f7600E;
    }

    public void onCreate() {
        super.onCreate();
        this.f7598C = true;
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public boolean onUnbind(Intent intent) {
        Log.i(f7592n, "onUnbind");
        return super.onUnbind(intent);
    }
}
