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

public class BT_ACSUtilityService1 extends Service {

    /* renamed from: a */
    public static final String f7448a = "com.example.bluetooth.le.ACTION_GATT_CONNECTED";

    /* renamed from: b */
    public static final String f7449b = "com.example.bluetooth.le.ACTION_GATT_DISCONNECTED";

    /* renamed from: c */
    public static final String f7450c = "com.example.bluetooth.le.ACTION_GATT_SERVICES_DISCOVERED";

    /* renamed from: d */
    public static final String f7451d = "com.example.bluetooth.le.ACTION_DATA_AVAILABLE";

    /* renamed from: e */
    public static final int f7452e = 3;

    /* renamed from: f */
    public static final int f7453f = 6;

    /* renamed from: g */
    public static final int f7454g = 7;

    /* renamed from: i */
    private static final int f7455i = 1;

    /* renamed from: j */
    private static final int f7456j = 2;

    /* renamed from: k */
    private static final int f7457k = 4;

    /* renamed from: l */
    private static final int f7458l = 5;

    /* renamed from: m */
    private static final String f7459m = "EXTRA_DATA";

    /* renamed from: n */
    private static final String f7460n = "ACSUtilityService";

    /* renamed from: o */
    private static final int f7461o = 0;

    /* renamed from: p */
    private static final int f7462p = 1;

    /* renamed from: q */
    private static final int f7463q = 2;

    /* renamed from: A */
    private final Stack<Handler> f7464A = new Stack<>();
    /* access modifiers changed from: private */

    /* renamed from: B */
    public Handler f7465B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public boolean f7466C = true;

    /* renamed from: D */
    private final BluetoothGattCallback f7467D = new BluetoothGattCallback() {
        public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            bluetoothGattCharacteristic.getValue();
            Message message = null;
            if (bluetoothGattCharacteristic.getUuid().equals(BT_ACSUtilityService1.this.f7473u)) {
                message = BT_ACSUtilityService1.this.f7465B.obtainMessage(5);
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
            if (BT_ACSUtilityService1.this.f7466C) {
                Log.i(BT_ACSUtilityService1.f7460n, "data has written!");
                boolean unused = BT_ACSUtilityService1.this.f7466C = false;
                BT_ACSUtilityService1.this.f7465B.obtainMessage(4).sendToTarget();
            }
        }

        public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
            Message message;
            if (i2 == 2) {
                int unused = BT_ACSUtilityService1.this.f7478z = 2;
                message = BT_ACSUtilityService1.this.f7465B.obtainMessage(1);
                Log.i(BT_ACSUtilityService1.f7460n, "Connected to GATT server.");
                Log.i(BT_ACSUtilityService1.f7460n, "Attempting to start service discovery:" + BT_ACSUtilityService1.this.f7469h.discoverServices());
            } else if (i2 == 0) {
                int unused2 = BT_ACSUtilityService1.this.f7478z = 0;
                Log.i(BT_ACSUtilityService1.f7460n, "Disconnected from GATT server.");
                BT_ACSUtilityService1.this.mo8457d();
                message = BT_ACSUtilityService1.this.f7465B.obtainMessage(2);
                String unused3 = BT_ACSUtilityService1.this.f7477y = null;
            } else {
                message = null;
            }
            message.sendToTarget();
        }

        public void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
            super.onDescriptorWrite(bluetoothGatt, bluetoothGattDescriptor, i);
            Log.i(BT_ACSUtilityService1.f7460n, "onDescriptorWrite");
            Log.i(BT_ACSUtilityService1.f7460n, bluetoothGattDescriptor.getCharacteristic().getUuid() + " Notification Enabled");
            if (bluetoothGattDescriptor.getCharacteristic().getUuid().equals(BT_ACSUtilityService1.this.f7473u)) {
                boolean unused = BT_ACSUtilityService1.this.f7466C = false;
                BT_ACSUtilityService1.this.f7465B.obtainMessage(4).sendToTarget();
            }
        }

        public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
            boolean unused = BT_ACSUtilityService1.this.m12897a(BT_ACSUtilityService1.this.f7473u);
        }
    };

    /* renamed from: E */
    private final IBinder f7468E = new C2268a();

    /* renamed from: h */
    public BluetoothGatt f7469h;

    /* renamed from: r */
    private final boolean f7470r = false;

    /* renamed from: s */
    private final boolean f7471s = true;

    /* renamed from: t */
    private UUID f7472t = UUID.fromString("0000ffb0-0000-1000-8000-00805f9b34fb");
    /* access modifiers changed from: private */

    /* renamed from: u */
    public UUID f7473u = UUID.fromString("0000ffb2-0000-1000-8000-00805f9b34fb");

    /* renamed from: v */
    private final UUID f7474v = UUID.fromString("00002902-0000-1000-8000-00805f9b34fb");

    /* renamed from: w */
    private BluetoothManager f7475w;

    /* renamed from: x */
    private BluetoothAdapter f7476x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public String f7477y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public int f7478z = 0;

    /* renamed from: com.imlabworld.HS_Instructor.BT_ACSUtilityService1$a */
    public class C2268a extends Binder {
        public C2268a() {
        }

        /* renamed from: a */
        public BT_ACSUtilityService1 mo8469a() {
            return BT_ACSUtilityService1.this;
        }
    }

    /* renamed from: a */
    private boolean m12894a(BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z) {
        if (this.f7476x == null || this.f7469h == null) {
            return false;
        }
        this.f7469h.setCharacteristicNotification(bluetoothGattCharacteristic, z);
        BluetoothGattDescriptor descriptor = bluetoothGattCharacteristic.getDescriptor(this.f7474v);
        descriptor.setValue(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
        return this.f7469h.writeDescriptor(descriptor);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m12897a(UUID uuid) {
        BluetoothGattCharacteristic b;
        if (this.f7476x == null || this.f7469h == null || (b = m12898b(uuid)) == null) {
            return false;
        }
        return m12894a(b, true);
    }

    /* renamed from: b */
    private BluetoothGattCharacteristic m12898b(UUID uuid) {
        BluetoothGattService service;
        if (this.f7476x == null || this.f7469h == null || (service = this.f7469h.getService(this.f7472t)) == null) {
            return null;
        }
        return service.getCharacteristic(uuid);
    }

    /* renamed from: a */
    public void mo8449a() {
        this.f7464A.pop();
        if (!this.f7464A.empty()) {
            this.f7465B = this.f7464A.peek();
        }
    }

    /* renamed from: a */
    public void mo8450a(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        if (this.f7476x != null && this.f7469h != null) {
            this.f7469h.readCharacteristic(bluetoothGattCharacteristic);
        }
    }

    /* renamed from: a */
    public void mo8451a(Handler handler) {
        this.f7464A.push(handler);
        this.f7465B = handler;
    }

    /* renamed from: a */
    public void mo8452a(String str, String str2) {
        this.f7472t = UUID.fromString(str);
        this.f7473u = UUID.fromString(str2);
    }

    /* renamed from: a */
    public void mo8453a(byte[] bArr) {
        BluetoothGattService service;
        BluetoothGattCharacteristic characteristic;
        if (this.f7469h != null && (service = this.f7469h.getService(this.f7472t)) != null && (characteristic = service.getCharacteristic(this.f7473u)) != null) {
            characteristic.setValue(bArr);
            this.f7469h.writeCharacteristic(characteristic);
        }
    }

    /* renamed from: a */
    public boolean mo8454a(String str) {
        if (this.f7476x == null || str == null) {
            return false;
        }
        if (this.f7477y == null || !str.equals(this.f7477y) || this.f7469h == null) {
            BluetoothDevice remoteDevice = this.f7476x.getRemoteDevice(str);
            if (remoteDevice == null) {
                return false;
            }
            if (this.f7469h != null) {
                this.f7469h.close();
                this.f7469h = null;
            }
            this.f7469h = remoteDevice.connectGatt(this, false, this.f7467D);
            this.f7477y = str;
            this.f7478z = 1;
            return true;
        } else if (!this.f7469h.connect()) {
            return false;
        } else {
            this.f7478z = 1;
            return true;
        }
    }

    /* renamed from: b */
    public boolean mo8455b() {
        Log.i(f7460n, "Initializing ACSUtilityService");
        if (this.f7475w == null) {
            this.f7475w = (BluetoothManager) getSystemService("bluetooth");
            if (this.f7475w == null) {
                return false;
            }
        }
        this.f7476x = this.f7475w.getAdapter();
        return this.f7476x != null;
    }

    /* renamed from: c */
    public void mo8456c() {
        if (this.f7476x != null && this.f7469h != null) {
            this.f7469h.disconnect();
        }
    }

    /* renamed from: d */
    public void mo8457d() {
        if (this.f7469h != null) {
            this.f7469h.close();
            this.f7469h = null;
        }
    }

    /* renamed from: e */
    public List<BluetoothGattService> mo8458e() {
        if (this.f7469h == null) {
            return null;
        }
        return this.f7469h.getServices();
    }

    public IBinder onBind(Intent intent) {
        return this.f7468E;
    }

    public void onCreate() {
        super.onCreate();
        this.f7466C = true;
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public boolean onUnbind(Intent intent) {
        Log.i(f7460n, "onUnbind");
        return super.onUnbind(intent);
    }
}
