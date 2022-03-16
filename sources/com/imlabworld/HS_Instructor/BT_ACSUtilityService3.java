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

public class BT_ACSUtilityService3 extends Service {

    /* renamed from: a */
    public static final String f7514a = "com.example.bluetooth.le.ACTION_GATT_CONNECTED";

    /* renamed from: b */
    public static final String f7515b = "com.example.bluetooth.le.ACTION_GATT_DISCONNECTED";

    /* renamed from: c */
    public static final String f7516c = "com.example.bluetooth.le.ACTION_GATT_SERVICES_DISCOVERED";

    /* renamed from: d */
    public static final String f7517d = "com.example.bluetooth.le.ACTION_DATA_AVAILABLE";

    /* renamed from: e */
    public static final int f7518e = 3;

    /* renamed from: f */
    public static final int f7519f = 6;

    /* renamed from: g */
    public static final int f7520g = 7;

    /* renamed from: i */
    private static final int f7521i = 1;

    /* renamed from: j */
    private static final int f7522j = 2;

    /* renamed from: k */
    private static final int f7523k = 4;

    /* renamed from: l */
    private static final int f7524l = 5;

    /* renamed from: m */
    private static final String f7525m = "EXTRA_DATA";

    /* renamed from: n */
    private static final String f7526n = "ACSUtilityService";

    /* renamed from: o */
    private static final int f7527o = 0;

    /* renamed from: p */
    private static final int f7528p = 1;

    /* renamed from: q */
    private static final int f7529q = 2;

    /* renamed from: A */
    private final Stack<Handler> f7530A = new Stack<>();
    /* access modifiers changed from: private */

    /* renamed from: B */
    public Handler f7531B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public boolean f7532C = true;

    /* renamed from: D */
    private final BluetoothGattCallback f7533D = new BluetoothGattCallback() {
        public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            bluetoothGattCharacteristic.getValue();
            Message message = null;
            if (bluetoothGattCharacteristic.getUuid().equals(BT_ACSUtilityService3.this.f7539u)) {
                message = BT_ACSUtilityService3.this.f7531B.obtainMessage(5);
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
            if (BT_ACSUtilityService3.this.f7532C) {
                Log.i(BT_ACSUtilityService3.f7526n, "data has written!");
                boolean unused = BT_ACSUtilityService3.this.f7532C = false;
                BT_ACSUtilityService3.this.f7531B.obtainMessage(4).sendToTarget();
            }
        }

        public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
            Message message;
            if (i2 == 2) {
                int unused = BT_ACSUtilityService3.this.f7544z = 2;
                message = BT_ACSUtilityService3.this.f7531B.obtainMessage(1);
                Log.i(BT_ACSUtilityService3.f7526n, "Connected to GATT server.");
                Log.i(BT_ACSUtilityService3.f7526n, "Attempting to start service discovery:" + BT_ACSUtilityService3.this.f7535h.discoverServices());
            } else if (i2 == 0) {
                int unused2 = BT_ACSUtilityService3.this.f7544z = 0;
                Log.i(BT_ACSUtilityService3.f7526n, "Disconnected from GATT server.");
                BT_ACSUtilityService3.this.mo8499d();
                message = BT_ACSUtilityService3.this.f7531B.obtainMessage(2);
                String unused3 = BT_ACSUtilityService3.this.f7543y = null;
            } else {
                message = null;
            }
            message.sendToTarget();
        }

        public void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
            super.onDescriptorWrite(bluetoothGatt, bluetoothGattDescriptor, i);
            Log.i(BT_ACSUtilityService3.f7526n, "onDescriptorWrite");
            Log.i(BT_ACSUtilityService3.f7526n, bluetoothGattDescriptor.getCharacteristic().getUuid() + " Notification Enabled");
            if (bluetoothGattDescriptor.getCharacteristic().getUuid().equals(BT_ACSUtilityService3.this.f7539u)) {
                boolean unused = BT_ACSUtilityService3.this.f7532C = false;
                BT_ACSUtilityService3.this.f7531B.obtainMessage(4).sendToTarget();
            }
        }

        public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
            boolean unused = BT_ACSUtilityService3.this.m12939a(BT_ACSUtilityService3.this.f7539u);
        }
    };

    /* renamed from: E */
    private final IBinder f7534E = new C2272a();

    /* renamed from: h */
    public BluetoothGatt f7535h;

    /* renamed from: r */
    private final boolean f7536r = false;

    /* renamed from: s */
    private final boolean f7537s = true;

    /* renamed from: t */
    private UUID f7538t = UUID.fromString("0000ffb0-0000-1000-8000-00805f9b34fb");
    /* access modifiers changed from: private */

    /* renamed from: u */
    public UUID f7539u = UUID.fromString("0000ffb2-0000-1000-8000-00805f9b34fb");

    /* renamed from: v */
    private final UUID f7540v = UUID.fromString("00002902-0000-1000-8000-00805f9b34fb");

    /* renamed from: w */
    private BluetoothManager f7541w;

    /* renamed from: x */
    private BluetoothAdapter f7542x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public String f7543y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public int f7544z = 0;

    /* renamed from: com.imlabworld.HS_Instructor.BT_ACSUtilityService3$a */
    public class C2272a extends Binder {
        public C2272a() {
        }

        /* renamed from: a */
        public BT_ACSUtilityService3 mo8511a() {
            return BT_ACSUtilityService3.this;
        }
    }

    /* renamed from: a */
    private boolean m12936a(BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z) {
        if (this.f7542x == null || this.f7535h == null) {
            return false;
        }
        this.f7535h.setCharacteristicNotification(bluetoothGattCharacteristic, z);
        BluetoothGattDescriptor descriptor = bluetoothGattCharacteristic.getDescriptor(this.f7540v);
        descriptor.setValue(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
        return this.f7535h.writeDescriptor(descriptor);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m12939a(UUID uuid) {
        BluetoothGattCharacteristic b;
        if (this.f7542x == null || this.f7535h == null || (b = m12940b(uuid)) == null) {
            return false;
        }
        return m12936a(b, true);
    }

    /* renamed from: b */
    private BluetoothGattCharacteristic m12940b(UUID uuid) {
        BluetoothGattService service;
        if (this.f7542x == null || this.f7535h == null || (service = this.f7535h.getService(this.f7538t)) == null) {
            return null;
        }
        return service.getCharacteristic(uuid);
    }

    /* renamed from: a */
    public void mo8491a() {
        this.f7530A.pop();
        if (!this.f7530A.empty()) {
            this.f7531B = this.f7530A.peek();
        }
    }

    /* renamed from: a */
    public void mo8492a(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        if (this.f7542x != null && this.f7535h != null) {
            this.f7535h.readCharacteristic(bluetoothGattCharacteristic);
        }
    }

    /* renamed from: a */
    public void mo8493a(Handler handler) {
        this.f7530A.push(handler);
        this.f7531B = handler;
    }

    /* renamed from: a */
    public void mo8494a(String str, String str2) {
        this.f7538t = UUID.fromString(str);
        this.f7539u = UUID.fromString(str2);
    }

    /* renamed from: a */
    public void mo8495a(byte[] bArr) {
        BluetoothGattService service;
        BluetoothGattCharacteristic characteristic;
        if (this.f7535h != null && (service = this.f7535h.getService(this.f7538t)) != null && (characteristic = service.getCharacteristic(this.f7539u)) != null) {
            characteristic.setValue(bArr);
            this.f7535h.writeCharacteristic(characteristic);
        }
    }

    /* renamed from: a */
    public boolean mo8496a(String str) {
        if (this.f7542x == null || str == null) {
            return false;
        }
        if (this.f7543y == null || !str.equals(this.f7543y) || this.f7535h == null) {
            BluetoothDevice remoteDevice = this.f7542x.getRemoteDevice(str);
            if (remoteDevice == null) {
                return false;
            }
            if (this.f7535h != null) {
                this.f7535h.close();
                this.f7535h = null;
            }
            this.f7535h = remoteDevice.connectGatt(this, false, this.f7533D);
            this.f7543y = str;
            this.f7544z = 1;
            return true;
        } else if (!this.f7535h.connect()) {
            return false;
        } else {
            this.f7544z = 1;
            return true;
        }
    }

    /* renamed from: b */
    public boolean mo8497b() {
        Log.i(f7526n, "Initializing ACSUtilityService");
        if (this.f7541w == null) {
            this.f7541w = (BluetoothManager) getSystemService("bluetooth");
            if (this.f7541w == null) {
                return false;
            }
        }
        this.f7542x = this.f7541w.getAdapter();
        return this.f7542x != null;
    }

    /* renamed from: c */
    public void mo8498c() {
        if (this.f7542x != null && this.f7535h != null) {
            this.f7535h.disconnect();
        }
    }

    /* renamed from: d */
    public void mo8499d() {
        if (this.f7535h != null) {
            this.f7535h.close();
            this.f7535h = null;
        }
    }

    /* renamed from: e */
    public List<BluetoothGattService> mo8500e() {
        if (this.f7535h == null) {
            return null;
        }
        return this.f7535h.getServices();
    }

    public IBinder onBind(Intent intent) {
        return this.f7534E;
    }

    public void onCreate() {
        super.onCreate();
        this.f7532C = true;
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public boolean onUnbind(Intent intent) {
        Log.i(f7526n, "onUnbind");
        return super.onUnbind(intent);
    }
}
