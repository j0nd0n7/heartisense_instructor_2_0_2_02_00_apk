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

public class BT_ACSUtilityService0 extends Service {

    /* renamed from: a */
    public static final String f7415a = "com.example.bluetooth.le.ACTION_GATT_CONNECTED";

    /* renamed from: b */
    public static final String f7416b = "com.example.bluetooth.le.ACTION_GATT_DISCONNECTED";

    /* renamed from: c */
    public static final String f7417c = "com.example.bluetooth.le.ACTION_GATT_SERVICES_DISCOVERED";

    /* renamed from: d */
    public static final String f7418d = "com.example.bluetooth.le.ACTION_DATA_AVAILABLE";

    /* renamed from: e */
    public static final int f7419e = 1;

    /* renamed from: f */
    public static final int f7420f = 2;

    /* renamed from: g */
    public static final int f7421g = 3;

    /* renamed from: h */
    public static final int f7422h = 4;

    /* renamed from: i */
    public static final int f7423i = 5;

    /* renamed from: j */
    public static final int f7424j = 6;

    /* renamed from: k */
    public static final int f7425k = 7;

    /* renamed from: l */
    public static final String f7426l = "EXTRA_DATA";

    /* renamed from: n */
    private static final String f7427n = "ACSUtilityService";

    /* renamed from: o */
    private static final int f7428o = 0;

    /* renamed from: p */
    private static final int f7429p = 1;

    /* renamed from: q */
    private static final int f7430q = 2;

    /* renamed from: A */
    private final Stack<Handler> f7431A = new Stack<>();
    /* access modifiers changed from: private */

    /* renamed from: B */
    public Handler f7432B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public boolean f7433C = true;

    /* renamed from: D */
    private final BluetoothGattCallback f7434D = new BluetoothGattCallback() {
        public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            bluetoothGattCharacteristic.getValue();
            Message message = null;
            if (bluetoothGattCharacteristic.getUuid().equals(BT_ACSUtilityService0.this.f7440u)) {
                message = BT_ACSUtilityService0.this.f7432B.obtainMessage(5);
                Bundle bundle = new Bundle();
                bundle.putByteArray(BT_ACSUtilityService0.f7426l, bluetoothGattCharacteristic.getValue());
                message.setData(bundle);
            }
            message.sendToTarget();
        }

        public void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            if (i == 0) {
            }
        }

        public void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            if (BT_ACSUtilityService0.this.f7433C) {
                Log.i(BT_ACSUtilityService0.f7427n, "data has written!");
                boolean unused = BT_ACSUtilityService0.this.f7433C = false;
                BT_ACSUtilityService0.this.f7432B.obtainMessage(4).sendToTarget();
            }
        }

        public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
            Message message;
            if (i2 == 2) {
                int unused = BT_ACSUtilityService0.this.f7445z = 2;
                message = BT_ACSUtilityService0.this.f7432B.obtainMessage(1);
                Log.i(BT_ACSUtilityService0.f7427n, "Connected to GATT server.");
                Log.i(BT_ACSUtilityService0.f7427n, "Attempting to start service discovery:" + BT_ACSUtilityService0.this.f7436m.discoverServices());
            } else if (i2 == 0) {
                int unused2 = BT_ACSUtilityService0.this.f7445z = 0;
                Log.i(BT_ACSUtilityService0.f7427n, "Disconnected from GATT server.");
                BT_ACSUtilityService0.this.mo8436d();
                message = BT_ACSUtilityService0.this.f7432B.obtainMessage(2);
                String unused3 = BT_ACSUtilityService0.this.f7444y = null;
            } else {
                message = null;
            }
            message.sendToTarget();
        }

        public void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
            super.onDescriptorWrite(bluetoothGatt, bluetoothGattDescriptor, i);
            Log.i(BT_ACSUtilityService0.f7427n, "onDescriptorWrite");
            Log.i(BT_ACSUtilityService0.f7427n, bluetoothGattDescriptor.getCharacteristic().getUuid() + " Notification Enabled");
            if (bluetoothGattDescriptor.getCharacteristic().getUuid().equals(BT_ACSUtilityService0.this.f7440u)) {
                boolean unused = BT_ACSUtilityService0.this.f7433C = false;
                BT_ACSUtilityService0.this.f7432B.obtainMessage(4).sendToTarget();
            }
        }

        public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
            boolean unused = BT_ACSUtilityService0.this.m12876a(BT_ACSUtilityService0.this.f7440u);
        }
    };

    /* renamed from: E */
    private final IBinder f7435E = new C2266a();

    /* renamed from: m */
    public BluetoothGatt f7436m;

    /* renamed from: r */
    private final boolean f7437r = false;

    /* renamed from: s */
    private final boolean f7438s = true;

    /* renamed from: t */
    private UUID f7439t = UUID.fromString("0000ffb0-0000-1000-8000-00805f9b34fb");
    /* access modifiers changed from: private */

    /* renamed from: u */
    public UUID f7440u = UUID.fromString("0000ffb2-0000-1000-8000-00805f9b34fb");

    /* renamed from: v */
    private final UUID f7441v = UUID.fromString("00002902-0000-1000-8000-00805f9b34fb");

    /* renamed from: w */
    private BluetoothManager f7442w;

    /* renamed from: x */
    private BluetoothAdapter f7443x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public String f7444y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public int f7445z = 0;

    /* renamed from: com.imlabworld.HS_Instructor.BT_ACSUtilityService0$a */
    public class C2266a extends Binder {
        public C2266a() {
        }

        /* renamed from: a */
        public BT_ACSUtilityService0 mo8448a() {
            return BT_ACSUtilityService0.this;
        }
    }

    /* renamed from: a */
    private boolean m12873a(BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z) {
        if (this.f7443x == null || this.f7436m == null) {
            return false;
        }
        this.f7436m.setCharacteristicNotification(bluetoothGattCharacteristic, z);
        BluetoothGattDescriptor descriptor = bluetoothGattCharacteristic.getDescriptor(this.f7441v);
        descriptor.setValue(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
        return this.f7436m.writeDescriptor(descriptor);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m12876a(UUID uuid) {
        BluetoothGattCharacteristic b;
        if (this.f7443x == null || this.f7436m == null || (b = m12877b(uuid)) == null) {
            return false;
        }
        return m12873a(b, true);
    }

    /* renamed from: b */
    private BluetoothGattCharacteristic m12877b(UUID uuid) {
        BluetoothGattService service;
        if (this.f7443x == null || this.f7436m == null || (service = this.f7436m.getService(this.f7439t)) == null) {
            return null;
        }
        return service.getCharacteristic(uuid);
    }

    /* renamed from: a */
    public void mo8428a() {
        this.f7431A.pop();
        if (!this.f7431A.empty()) {
            this.f7432B = this.f7431A.peek();
        }
    }

    /* renamed from: a */
    public void mo8429a(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        if (this.f7443x != null && this.f7436m != null) {
            this.f7436m.readCharacteristic(bluetoothGattCharacteristic);
        }
    }

    /* renamed from: a */
    public void mo8430a(Handler handler) {
        this.f7431A.push(handler);
        this.f7432B = handler;
    }

    /* renamed from: a */
    public void mo8431a(String str, String str2) {
        this.f7439t = UUID.fromString(str);
        this.f7440u = UUID.fromString(str2);
    }

    /* renamed from: a */
    public void mo8432a(byte[] bArr) {
        BluetoothGattService service;
        BluetoothGattCharacteristic characteristic;
        if (this.f7436m != null && (service = this.f7436m.getService(this.f7439t)) != null && (characteristic = service.getCharacteristic(this.f7440u)) != null) {
            characteristic.setValue(bArr);
            this.f7436m.writeCharacteristic(characteristic);
        }
    }

    /* renamed from: a */
    public boolean mo8433a(String str) {
        if (this.f7443x == null || str == null) {
            return false;
        }
        if (this.f7444y == null || !str.equals(this.f7444y) || this.f7436m == null) {
            BluetoothDevice remoteDevice = this.f7443x.getRemoteDevice(str);
            if (remoteDevice == null) {
                return false;
            }
            if (this.f7436m != null) {
                this.f7436m.close();
                this.f7436m = null;
            }
            this.f7436m = remoteDevice.connectGatt(this, false, this.f7434D);
            this.f7444y = str;
            this.f7445z = 1;
            return true;
        } else if (!this.f7436m.connect()) {
            return false;
        } else {
            this.f7445z = 1;
            return true;
        }
    }

    /* renamed from: b */
    public boolean mo8434b() {
        Log.i(f7427n, "Initializing ACSUtilityService");
        if (this.f7442w == null) {
            this.f7442w = (BluetoothManager) getSystemService("bluetooth");
            if (this.f7442w == null) {
                return false;
            }
        }
        this.f7443x = this.f7442w.getAdapter();
        return this.f7443x != null;
    }

    /* renamed from: c */
    public void mo8435c() {
        if (this.f7443x != null && this.f7436m != null) {
            this.f7436m.disconnect();
        }
    }

    /* renamed from: d */
    public void mo8436d() {
        if (this.f7436m != null) {
            this.f7436m.close();
            this.f7436m = null;
        }
    }

    /* renamed from: e */
    public List<BluetoothGattService> mo8437e() {
        if (this.f7436m == null) {
            return null;
        }
        return this.f7436m.getServices();
    }

    public IBinder onBind(Intent intent) {
        return this.f7435E;
    }

    public void onCreate() {
        super.onCreate();
        this.f7433C = true;
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public boolean onUnbind(Intent intent) {
        Log.i(f7427n, "onUnbind");
        return super.onUnbind(intent);
    }
}
