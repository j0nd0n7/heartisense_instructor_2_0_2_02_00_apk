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

public class BT_ACSUtilityService_auto extends Service {

    /* renamed from: a */
    public static final String f7613a = "com.example.bluetooth.le.ACTION_GATT_CONNECTED";

    /* renamed from: b */
    public static final String f7614b = "com.example.bluetooth.le.ACTION_GATT_DISCONNECTED";

    /* renamed from: c */
    public static final String f7615c = "com.example.bluetooth.le.ACTION_GATT_SERVICES_DISCOVERED";

    /* renamed from: d */
    public static final String f7616d = "com.example.bluetooth.le.ACTION_DATA_AVAILABLE";

    /* renamed from: e */
    public static final int f7617e = 3;

    /* renamed from: f */
    public static final int f7618f = 6;

    /* renamed from: g */
    public static final int f7619g = 7;

    /* renamed from: i */
    private static final int f7620i = 1;

    /* renamed from: j */
    private static final int f7621j = 2;

    /* renamed from: k */
    private static final int f7622k = 4;

    /* renamed from: l */
    private static final int f7623l = 5;

    /* renamed from: m */
    private static final String f7624m = "EXTRA_DATA";

    /* renamed from: n */
    private static final String f7625n = "ACSUtilityService";

    /* renamed from: o */
    private static final int f7626o = 0;

    /* renamed from: p */
    private static final int f7627p = 1;

    /* renamed from: q */
    private static final int f7628q = 2;

    /* renamed from: A */
    private final Stack<Handler> f7629A = new Stack<>();
    /* access modifiers changed from: private */

    /* renamed from: B */
    public Handler f7630B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public boolean f7631C = true;

    /* renamed from: D */
    private final BluetoothGattCallback f7632D = new BluetoothGattCallback() {
        public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            bluetoothGattCharacteristic.getValue();
            Message message = null;
            if (bluetoothGattCharacteristic.getUuid().equals(BT_ACSUtilityService_auto.this.f7638u)) {
                message = BT_ACSUtilityService_auto.this.f7630B.obtainMessage(5);
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
            if (BT_ACSUtilityService_auto.this.f7631C) {
                Log.i(BT_ACSUtilityService_auto.f7625n, "data has written!");
                boolean unused = BT_ACSUtilityService_auto.this.f7631C = false;
                BT_ACSUtilityService_auto.this.f7630B.obtainMessage(4).sendToTarget();
            }
        }

        public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
            Message message;
            if (i2 == 2) {
                int unused = BT_ACSUtilityService_auto.this.f7643z = 2;
                message = BT_ACSUtilityService_auto.this.f7630B.obtainMessage(1);
                Log.i(BT_ACSUtilityService_auto.f7625n, "Connected to GATT server.");
                Log.i(BT_ACSUtilityService_auto.f7625n, "Attempting to start service discovery:" + BT_ACSUtilityService_auto.this.f7634h.discoverServices());
            } else if (i2 == 0) {
                int unused2 = BT_ACSUtilityService_auto.this.f7643z = 0;
                Log.i(BT_ACSUtilityService_auto.f7625n, "Disconnected from GATT server.");
                BT_ACSUtilityService_auto.this.mo8562d();
                message = BT_ACSUtilityService_auto.this.f7630B.obtainMessage(2);
                String unused3 = BT_ACSUtilityService_auto.this.f7642y = null;
            } else {
                message = null;
            }
            message.sendToTarget();
        }

        public void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
            super.onDescriptorWrite(bluetoothGatt, bluetoothGattDescriptor, i);
            Log.i(BT_ACSUtilityService_auto.f7625n, "onDescriptorWrite");
            Log.i(BT_ACSUtilityService_auto.f7625n, bluetoothGattDescriptor.getCharacteristic().getUuid() + " Notification Enabled");
            if (bluetoothGattDescriptor.getCharacteristic().getUuid().equals(BT_ACSUtilityService_auto.this.f7638u)) {
                boolean unused = BT_ACSUtilityService_auto.this.f7631C = false;
                BT_ACSUtilityService_auto.this.f7630B.obtainMessage(4).sendToTarget();
            }
        }

        public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
            boolean unused = BT_ACSUtilityService_auto.this.m13002a(BT_ACSUtilityService_auto.this.f7638u);
        }
    };

    /* renamed from: E */
    private final IBinder f7633E = new C2278a();

    /* renamed from: h */
    public BluetoothGatt f7634h;

    /* renamed from: r */
    private final boolean f7635r = false;

    /* renamed from: s */
    private final boolean f7636s = true;

    /* renamed from: t */
    private UUID f7637t = UUID.fromString("0000ffb0-0000-1000-8000-00805f9b34fb");
    /* access modifiers changed from: private */

    /* renamed from: u */
    public UUID f7638u = UUID.fromString("0000ffb2-0000-1000-8000-00805f9b34fb");

    /* renamed from: v */
    private final UUID f7639v = UUID.fromString("00002902-0000-1000-8000-00805f9b34fb");

    /* renamed from: w */
    private BluetoothManager f7640w;

    /* renamed from: x */
    private BluetoothAdapter f7641x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public String f7642y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public int f7643z = 0;

    /* renamed from: com.imlabworld.HS_Instructor.BT_ACSUtilityService_auto$a */
    public class C2278a extends Binder {
        public C2278a() {
        }

        /* renamed from: a */
        public BT_ACSUtilityService_auto mo8574a() {
            return BT_ACSUtilityService_auto.this;
        }
    }

    /* renamed from: a */
    private boolean m12999a(BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z) {
        if (this.f7641x == null || this.f7634h == null) {
            return false;
        }
        this.f7634h.setCharacteristicNotification(bluetoothGattCharacteristic, z);
        BluetoothGattDescriptor descriptor = bluetoothGattCharacteristic.getDescriptor(this.f7639v);
        descriptor.setValue(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
        return this.f7634h.writeDescriptor(descriptor);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m13002a(UUID uuid) {
        BluetoothGattCharacteristic b;
        if (this.f7641x == null || this.f7634h == null || (b = m13003b(uuid)) == null) {
            return false;
        }
        return m12999a(b, true);
    }

    /* renamed from: b */
    private BluetoothGattCharacteristic m13003b(UUID uuid) {
        BluetoothGattService service;
        if (this.f7641x == null || this.f7634h == null || (service = this.f7634h.getService(this.f7637t)) == null) {
            return null;
        }
        return service.getCharacteristic(uuid);
    }

    /* renamed from: a */
    public void mo8554a() {
        this.f7629A.pop();
        if (!this.f7629A.empty()) {
            this.f7630B = this.f7629A.peek();
        }
    }

    /* renamed from: a */
    public void mo8555a(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        if (this.f7641x != null && this.f7634h != null) {
            this.f7634h.readCharacteristic(bluetoothGattCharacteristic);
        }
    }

    /* renamed from: a */
    public void mo8556a(Handler handler) {
        this.f7629A.push(handler);
        this.f7630B = handler;
    }

    /* renamed from: a */
    public void mo8557a(String str, String str2) {
        this.f7637t = UUID.fromString(str);
        this.f7638u = UUID.fromString(str2);
    }

    /* renamed from: a */
    public void mo8558a(byte[] bArr) {
        BluetoothGattService service;
        BluetoothGattCharacteristic characteristic;
        if (this.f7634h != null && (service = this.f7634h.getService(this.f7637t)) != null && (characteristic = service.getCharacteristic(this.f7638u)) != null) {
            characteristic.setValue(bArr);
            this.f7634h.writeCharacteristic(characteristic);
        }
    }

    /* renamed from: a */
    public boolean mo8559a(String str) {
        if (this.f7641x == null || str == null) {
            return false;
        }
        if (this.f7642y == null || !str.equals(this.f7642y) || this.f7634h == null) {
            BluetoothDevice remoteDevice = this.f7641x.getRemoteDevice(str);
            if (remoteDevice == null) {
                return false;
            }
            if (this.f7634h != null) {
                this.f7634h.close();
                this.f7634h = null;
            }
            this.f7634h = remoteDevice.connectGatt(this, false, this.f7632D);
            this.f7642y = str;
            this.f7643z = 1;
            return true;
        } else if (!this.f7634h.connect()) {
            return false;
        } else {
            this.f7643z = 1;
            return true;
        }
    }

    /* renamed from: b */
    public boolean mo8560b() {
        Log.i(f7625n, "Initializing ACSUtilityService");
        if (this.f7640w == null) {
            this.f7640w = (BluetoothManager) getSystemService("bluetooth");
            if (this.f7640w == null) {
                return false;
            }
        }
        this.f7641x = this.f7640w.getAdapter();
        return this.f7641x != null;
    }

    /* renamed from: c */
    public void mo8561c() {
        if (this.f7641x != null && this.f7634h != null) {
            this.f7634h.disconnect();
        }
    }

    /* renamed from: d */
    public void mo8562d() {
        if (this.f7634h != null) {
            this.f7634h.close();
            this.f7634h = null;
        }
    }

    /* renamed from: e */
    public List<BluetoothGattService> mo8563e() {
        if (this.f7634h == null) {
            return null;
        }
        return this.f7634h.getServices();
    }

    public IBinder onBind(Intent intent) {
        return this.f7633E;
    }

    public void onCreate() {
        super.onCreate();
        this.f7631C = true;
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public boolean onUnbind(Intent intent) {
        Log.i(f7625n, "onUnbind");
        return super.onUnbind(intent);
    }
}
