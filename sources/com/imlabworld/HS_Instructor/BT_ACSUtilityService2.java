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

public class BT_ACSUtilityService2 extends Service {

    /* renamed from: a */
    public static final String f7481a = "com.example.bluetooth.le.ACTION_GATT_CONNECTED";

    /* renamed from: b */
    public static final String f7482b = "com.example.bluetooth.le.ACTION_GATT_DISCONNECTED";

    /* renamed from: c */
    public static final String f7483c = "com.example.bluetooth.le.ACTION_GATT_SERVICES_DISCOVERED";

    /* renamed from: d */
    public static final String f7484d = "com.example.bluetooth.le.ACTION_DATA_AVAILABLE";

    /* renamed from: e */
    public static final int f7485e = 3;

    /* renamed from: f */
    public static final int f7486f = 6;

    /* renamed from: g */
    public static final int f7487g = 7;

    /* renamed from: i */
    private static final int f7488i = 1;

    /* renamed from: j */
    private static final int f7489j = 2;

    /* renamed from: k */
    private static final int f7490k = 4;

    /* renamed from: l */
    private static final int f7491l = 5;

    /* renamed from: m */
    private static final String f7492m = "EXTRA_DATA";

    /* renamed from: n */
    private static final String f7493n = "ACSUtilityService";

    /* renamed from: o */
    private static final int f7494o = 0;

    /* renamed from: p */
    private static final int f7495p = 1;

    /* renamed from: q */
    private static final int f7496q = 2;

    /* renamed from: A */
    private final Stack<Handler> f7497A = new Stack<>();
    /* access modifiers changed from: private */

    /* renamed from: B */
    public Handler f7498B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public boolean f7499C = true;

    /* renamed from: D */
    private final BluetoothGattCallback f7500D = new BluetoothGattCallback() {
        public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            bluetoothGattCharacteristic.getValue();
            Message message = null;
            if (bluetoothGattCharacteristic.getUuid().equals(BT_ACSUtilityService2.this.f7506u)) {
                message = BT_ACSUtilityService2.this.f7498B.obtainMessage(5);
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
            if (BT_ACSUtilityService2.this.f7499C) {
                Log.i(BT_ACSUtilityService2.f7493n, "data has written!");
                boolean unused = BT_ACSUtilityService2.this.f7499C = false;
                BT_ACSUtilityService2.this.f7498B.obtainMessage(4).sendToTarget();
            }
        }

        public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
            Message message;
            if (i2 == 2) {
                int unused = BT_ACSUtilityService2.this.f7511z = 2;
                message = BT_ACSUtilityService2.this.f7498B.obtainMessage(1);
                Log.i(BT_ACSUtilityService2.f7493n, "Connected to GATT server.");
                Log.i(BT_ACSUtilityService2.f7493n, "Attempting to start service discovery:" + BT_ACSUtilityService2.this.f7502h.discoverServices());
            } else if (i2 == 0) {
                int unused2 = BT_ACSUtilityService2.this.f7511z = 0;
                Log.i(BT_ACSUtilityService2.f7493n, "Disconnected from GATT server.");
                BT_ACSUtilityService2.this.mo8478d();
                message = BT_ACSUtilityService2.this.f7498B.obtainMessage(2);
                String unused3 = BT_ACSUtilityService2.this.f7510y = null;
            } else {
                message = null;
            }
            message.sendToTarget();
        }

        public void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
            super.onDescriptorWrite(bluetoothGatt, bluetoothGattDescriptor, i);
            Log.i(BT_ACSUtilityService2.f7493n, "onDescriptorWrite");
            Log.i(BT_ACSUtilityService2.f7493n, bluetoothGattDescriptor.getCharacteristic().getUuid() + " Notification Enabled");
            if (bluetoothGattDescriptor.getCharacteristic().getUuid().equals(BT_ACSUtilityService2.this.f7506u)) {
                boolean unused = BT_ACSUtilityService2.this.f7499C = false;
                BT_ACSUtilityService2.this.f7498B.obtainMessage(4).sendToTarget();
            }
        }

        public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
            boolean unused = BT_ACSUtilityService2.this.m12918a(BT_ACSUtilityService2.this.f7506u);
        }
    };

    /* renamed from: E */
    private final IBinder f7501E = new C2270a();

    /* renamed from: h */
    public BluetoothGatt f7502h;

    /* renamed from: r */
    private final boolean f7503r = false;

    /* renamed from: s */
    private final boolean f7504s = true;

    /* renamed from: t */
    private UUID f7505t = UUID.fromString("0000ffb0-0000-1000-8000-00805f9b34fb");
    /* access modifiers changed from: private */

    /* renamed from: u */
    public UUID f7506u = UUID.fromString("0000ffb2-0000-1000-8000-00805f9b34fb");

    /* renamed from: v */
    private final UUID f7507v = UUID.fromString("00002902-0000-1000-8000-00805f9b34fb");

    /* renamed from: w */
    private BluetoothManager f7508w;

    /* renamed from: x */
    private BluetoothAdapter f7509x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public String f7510y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public int f7511z = 0;

    /* renamed from: com.imlabworld.HS_Instructor.BT_ACSUtilityService2$a */
    public class C2270a extends Binder {
        public C2270a() {
        }

        /* renamed from: a */
        public BT_ACSUtilityService2 mo8490a() {
            return BT_ACSUtilityService2.this;
        }
    }

    /* renamed from: a */
    private boolean m12915a(BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z) {
        if (this.f7509x == null || this.f7502h == null) {
            return false;
        }
        this.f7502h.setCharacteristicNotification(bluetoothGattCharacteristic, z);
        BluetoothGattDescriptor descriptor = bluetoothGattCharacteristic.getDescriptor(this.f7507v);
        descriptor.setValue(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
        return this.f7502h.writeDescriptor(descriptor);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m12918a(UUID uuid) {
        BluetoothGattCharacteristic b;
        if (this.f7509x == null || this.f7502h == null || (b = m12919b(uuid)) == null) {
            return false;
        }
        return m12915a(b, true);
    }

    /* renamed from: b */
    private BluetoothGattCharacteristic m12919b(UUID uuid) {
        BluetoothGattService service;
        if (this.f7509x == null || this.f7502h == null || (service = this.f7502h.getService(this.f7505t)) == null) {
            return null;
        }
        return service.getCharacteristic(uuid);
    }

    /* renamed from: a */
    public void mo8470a() {
        this.f7497A.pop();
        if (!this.f7497A.empty()) {
            this.f7498B = this.f7497A.peek();
        }
    }

    /* renamed from: a */
    public void mo8471a(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        if (this.f7509x != null && this.f7502h != null) {
            this.f7502h.readCharacteristic(bluetoothGattCharacteristic);
        }
    }

    /* renamed from: a */
    public void mo8472a(Handler handler) {
        this.f7497A.push(handler);
        this.f7498B = handler;
    }

    /* renamed from: a */
    public void mo8473a(String str, String str2) {
        this.f7505t = UUID.fromString(str);
        this.f7506u = UUID.fromString(str2);
    }

    /* renamed from: a */
    public void mo8474a(byte[] bArr) {
        BluetoothGattService service;
        BluetoothGattCharacteristic characteristic;
        if (this.f7502h != null && (service = this.f7502h.getService(this.f7505t)) != null && (characteristic = service.getCharacteristic(this.f7506u)) != null) {
            characteristic.setValue(bArr);
            this.f7502h.writeCharacteristic(characteristic);
        }
    }

    /* renamed from: a */
    public boolean mo8475a(String str) {
        if (this.f7509x == null || str == null) {
            return false;
        }
        if (this.f7510y == null || !str.equals(this.f7510y) || this.f7502h == null) {
            BluetoothDevice remoteDevice = this.f7509x.getRemoteDevice(str);
            if (remoteDevice == null) {
                return false;
            }
            if (this.f7502h != null) {
                this.f7502h.close();
                this.f7502h = null;
            }
            this.f7502h = remoteDevice.connectGatt(this, false, this.f7500D);
            this.f7510y = str;
            this.f7511z = 1;
            return true;
        } else if (!this.f7502h.connect()) {
            return false;
        } else {
            this.f7511z = 1;
            return true;
        }
    }

    /* renamed from: b */
    public boolean mo8476b() {
        Log.i(f7493n, "Initializing ACSUtilityService");
        if (this.f7508w == null) {
            this.f7508w = (BluetoothManager) getSystemService("bluetooth");
            if (this.f7508w == null) {
                return false;
            }
        }
        this.f7509x = this.f7508w.getAdapter();
        return this.f7509x != null;
    }

    /* renamed from: c */
    public void mo8477c() {
        if (this.f7509x != null && this.f7502h != null) {
            this.f7502h.disconnect();
        }
    }

    /* renamed from: d */
    public void mo8478d() {
        if (this.f7502h != null) {
            this.f7502h.close();
            this.f7502h = null;
        }
    }

    /* renamed from: e */
    public List<BluetoothGattService> mo8479e() {
        if (this.f7502h == null) {
            return null;
        }
        return this.f7502h.getServices();
    }

    public IBinder onBind(Intent intent) {
        return this.f7501E;
    }

    public void onCreate() {
        super.onCreate();
        this.f7499C = true;
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public boolean onUnbind(Intent intent) {
        Log.i(f7493n, "onUnbind");
        return super.onUnbind(intent);
    }
}
