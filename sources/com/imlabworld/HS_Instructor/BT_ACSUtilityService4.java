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

public class BT_ACSUtilityService4 extends Service {

    /* renamed from: a */
    public static final String f7547a = "com.example.bluetooth.le.ACTION_GATT_CONNECTED";

    /* renamed from: b */
    public static final String f7548b = "com.example.bluetooth.le.ACTION_GATT_DISCONNECTED";

    /* renamed from: c */
    public static final String f7549c = "com.example.bluetooth.le.ACTION_GATT_SERVICES_DISCOVERED";

    /* renamed from: d */
    public static final String f7550d = "com.example.bluetooth.le.ACTION_DATA_AVAILABLE";

    /* renamed from: e */
    public static final int f7551e = 3;

    /* renamed from: f */
    public static final int f7552f = 6;

    /* renamed from: g */
    public static final int f7553g = 7;

    /* renamed from: i */
    private static final int f7554i = 1;

    /* renamed from: j */
    private static final int f7555j = 2;

    /* renamed from: k */
    private static final int f7556k = 4;

    /* renamed from: l */
    private static final int f7557l = 5;

    /* renamed from: m */
    private static final String f7558m = "EXTRA_DATA";

    /* renamed from: n */
    private static final String f7559n = "ACSUtilityService";

    /* renamed from: o */
    private static final int f7560o = 0;

    /* renamed from: p */
    private static final int f7561p = 1;

    /* renamed from: q */
    private static final int f7562q = 2;

    /* renamed from: A */
    private final Stack<Handler> f7563A = new Stack<>();
    /* access modifiers changed from: private */

    /* renamed from: B */
    public Handler f7564B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public boolean f7565C = true;

    /* renamed from: D */
    private final BluetoothGattCallback f7566D = new BluetoothGattCallback() {
        public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            bluetoothGattCharacteristic.getValue();
            Message message = null;
            if (bluetoothGattCharacteristic.getUuid().equals(BT_ACSUtilityService4.this.f7572u)) {
                message = BT_ACSUtilityService4.this.f7564B.obtainMessage(5);
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
            if (BT_ACSUtilityService4.this.f7565C) {
                Log.i(BT_ACSUtilityService4.f7559n, "data has written!");
                boolean unused = BT_ACSUtilityService4.this.f7565C = false;
                BT_ACSUtilityService4.this.f7564B.obtainMessage(4).sendToTarget();
            }
        }

        public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
            Message message;
            if (i2 == 2) {
                int unused = BT_ACSUtilityService4.this.f7577z = 2;
                message = BT_ACSUtilityService4.this.f7564B.obtainMessage(1);
                Log.i(BT_ACSUtilityService4.f7559n, "Connected to GATT server.");
                Log.i(BT_ACSUtilityService4.f7559n, "Attempting to start service discovery:" + BT_ACSUtilityService4.this.f7568h.discoverServices());
            } else if (i2 == 0) {
                int unused2 = BT_ACSUtilityService4.this.f7577z = 0;
                Log.i(BT_ACSUtilityService4.f7559n, "Disconnected from GATT server.");
                BT_ACSUtilityService4.this.mo8520d();
                message = BT_ACSUtilityService4.this.f7564B.obtainMessage(2);
                String unused3 = BT_ACSUtilityService4.this.f7576y = null;
            } else {
                message = null;
            }
            message.sendToTarget();
        }

        public void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
            super.onDescriptorWrite(bluetoothGatt, bluetoothGattDescriptor, i);
            Log.i(BT_ACSUtilityService4.f7559n, "onDescriptorWrite");
            Log.i(BT_ACSUtilityService4.f7559n, bluetoothGattDescriptor.getCharacteristic().getUuid() + " Notification Enabled");
            if (bluetoothGattDescriptor.getCharacteristic().getUuid().equals(BT_ACSUtilityService4.this.f7572u)) {
                boolean unused = BT_ACSUtilityService4.this.f7565C = false;
                BT_ACSUtilityService4.this.f7564B.obtainMessage(4).sendToTarget();
            }
        }

        public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
            boolean unused = BT_ACSUtilityService4.this.m12960a(BT_ACSUtilityService4.this.f7572u);
        }
    };

    /* renamed from: E */
    private final IBinder f7567E = new C2274a();

    /* renamed from: h */
    public BluetoothGatt f7568h;

    /* renamed from: r */
    private final boolean f7569r = false;

    /* renamed from: s */
    private final boolean f7570s = true;

    /* renamed from: t */
    private UUID f7571t = UUID.fromString("0000ffb0-0000-1000-8000-00805f9b34fb");
    /* access modifiers changed from: private */

    /* renamed from: u */
    public UUID f7572u = UUID.fromString("0000ffb2-0000-1000-8000-00805f9b34fb");

    /* renamed from: v */
    private final UUID f7573v = UUID.fromString("00002902-0000-1000-8000-00805f9b34fb");

    /* renamed from: w */
    private BluetoothManager f7574w;

    /* renamed from: x */
    private BluetoothAdapter f7575x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public String f7576y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public int f7577z = 0;

    /* renamed from: com.imlabworld.HS_Instructor.BT_ACSUtilityService4$a */
    public class C2274a extends Binder {
        public C2274a() {
        }

        /* renamed from: a */
        public BT_ACSUtilityService4 mo8532a() {
            return BT_ACSUtilityService4.this;
        }
    }

    /* renamed from: a */
    private boolean m12957a(BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z) {
        if (this.f7575x == null || this.f7568h == null) {
            return false;
        }
        this.f7568h.setCharacteristicNotification(bluetoothGattCharacteristic, z);
        BluetoothGattDescriptor descriptor = bluetoothGattCharacteristic.getDescriptor(this.f7573v);
        descriptor.setValue(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
        return this.f7568h.writeDescriptor(descriptor);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m12960a(UUID uuid) {
        BluetoothGattCharacteristic b;
        if (this.f7575x == null || this.f7568h == null || (b = m12961b(uuid)) == null) {
            return false;
        }
        return m12957a(b, true);
    }

    /* renamed from: b */
    private BluetoothGattCharacteristic m12961b(UUID uuid) {
        BluetoothGattService service;
        if (this.f7575x == null || this.f7568h == null || (service = this.f7568h.getService(this.f7571t)) == null) {
            return null;
        }
        return service.getCharacteristic(uuid);
    }

    /* renamed from: a */
    public void mo8512a() {
        this.f7563A.pop();
        if (!this.f7563A.empty()) {
            this.f7564B = this.f7563A.peek();
        }
    }

    /* renamed from: a */
    public void mo8513a(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        if (this.f7575x != null && this.f7568h != null) {
            this.f7568h.readCharacteristic(bluetoothGattCharacteristic);
        }
    }

    /* renamed from: a */
    public void mo8514a(Handler handler) {
        this.f7563A.push(handler);
        this.f7564B = handler;
    }

    /* renamed from: a */
    public void mo8515a(String str, String str2) {
        this.f7571t = UUID.fromString(str);
        this.f7572u = UUID.fromString(str2);
    }

    /* renamed from: a */
    public void mo8516a(byte[] bArr) {
        BluetoothGattService service;
        BluetoothGattCharacteristic characteristic;
        if (this.f7568h != null && (service = this.f7568h.getService(this.f7571t)) != null && (characteristic = service.getCharacteristic(this.f7572u)) != null) {
            characteristic.setValue(bArr);
            this.f7568h.writeCharacteristic(characteristic);
        }
    }

    /* renamed from: a */
    public boolean mo8517a(String str) {
        if (this.f7575x == null || str == null) {
            return false;
        }
        if (this.f7576y == null || !str.equals(this.f7576y) || this.f7568h == null) {
            BluetoothDevice remoteDevice = this.f7575x.getRemoteDevice(str);
            if (remoteDevice == null) {
                return false;
            }
            if (this.f7568h != null) {
                this.f7568h.close();
                this.f7568h = null;
            }
            this.f7568h = remoteDevice.connectGatt(this, false, this.f7566D);
            this.f7576y = str;
            this.f7577z = 1;
            return true;
        } else if (!this.f7568h.connect()) {
            return false;
        } else {
            this.f7577z = 1;
            return true;
        }
    }

    /* renamed from: b */
    public boolean mo8518b() {
        Log.i(f7559n, "Initializing ACSUtilityService");
        if (this.f7574w == null) {
            this.f7574w = (BluetoothManager) getSystemService("bluetooth");
            if (this.f7574w == null) {
                return false;
            }
        }
        this.f7575x = this.f7574w.getAdapter();
        return this.f7575x != null;
    }

    /* renamed from: c */
    public void mo8519c() {
        if (this.f7575x != null && this.f7568h != null) {
            this.f7568h.disconnect();
        }
    }

    /* renamed from: d */
    public void mo8520d() {
        if (this.f7568h != null) {
            this.f7568h.close();
            this.f7568h = null;
        }
    }

    /* renamed from: e */
    public List<BluetoothGattService> mo8521e() {
        if (this.f7568h == null) {
            return null;
        }
        return this.f7568h.getServices();
    }

    public IBinder onBind(Intent intent) {
        return this.f7567E;
    }

    public void onCreate() {
        super.onCreate();
        this.f7565C = true;
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public boolean onUnbind(Intent intent) {
        Log.i(f7559n, "onUnbind");
        return super.onUnbind(intent);
    }
}
