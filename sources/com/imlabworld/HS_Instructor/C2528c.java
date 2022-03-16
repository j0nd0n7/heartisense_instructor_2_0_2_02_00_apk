package com.imlabworld.HS_Instructor;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.util.Log;
import com.imlabworld.HS_Instructor.BT_ACSUtilityService0;
import com.imlabworld.HS_Instructor.BT_ACSUtilityService1;
import com.imlabworld.HS_Instructor.BT_ACSUtilityService2;
import com.imlabworld.HS_Instructor.BT_ACSUtilityService3;
import com.imlabworld.HS_Instructor.BT_ACSUtilityService4;
import com.imlabworld.HS_Instructor.BT_ACSUtilityService5;
import com.imlabworld.HS_Instructor.BT_ACSUtilityService_auto;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.imlabworld.HS_Instructor.c */
class C2528c {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public final Handler f9564A = new Handler() {
        public void handleMessage(Message message) {
            if (C2528c.this.f9593z != null) {
                switch (message.what) {
                    case 2:
                        C2528c.this.f9568a = false;
                        C2528c.this.f9593z.mo8584b(C2528c.this.f9576i);
                        return;
                    case 4:
                        Log.e("BT_ACSUtility", C2528c.this.f9593z.toString());
                        C2528c.this.f9568a = true;
                        C2528c.this.f9593z.mo8581a(C2528c.this.f9576i, (Boolean) true);
                        return;
                    case 5:
                        C2528c.this.f9593z.mo8582a(C2528c.this.f9576i, message.getData().getByteArray(BT_ACSUtilityService0.f7426l));
                        return;
                    case 7:
                        C2528c.this.f9593z.mo8585c();
                        return;
                    default:
                        return;
                }
            }
        }
    };

    /* renamed from: B */
    private final ServiceConnection f9565B = new ServiceConnection() {
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Log.d("BT_ACSUtility", "ACSUtilityService is connected!" + C2528c.this.f9591x);
            if (C2528c.this.f9591x == 0) {
                BT_ACSUtilityService0 unused = C2528c.this.f9584q = ((BT_ACSUtilityService0.C2266a) iBinder).mo8448a();
                C2528c.this.f9584q.mo8434b();
                C2528c.this.f9584q.mo8430a(C2528c.this.f9564A);
            } else if (C2528c.this.f9591x == 1) {
                BT_ACSUtilityService1 unused2 = C2528c.this.f9585r = ((BT_ACSUtilityService1.C2268a) iBinder).mo8469a();
                C2528c.this.f9585r.mo8455b();
                C2528c.this.f9585r.mo8451a(C2528c.this.f9564A);
            } else if (C2528c.this.f9591x == 2) {
                BT_ACSUtilityService2 unused3 = C2528c.this.f9586s = ((BT_ACSUtilityService2.C2270a) iBinder).mo8490a();
                C2528c.this.f9586s.mo8476b();
                C2528c.this.f9586s.mo8472a(C2528c.this.f9564A);
            } else if (C2528c.this.f9591x == 3) {
                BT_ACSUtilityService3 unused4 = C2528c.this.f9587t = ((BT_ACSUtilityService3.C2272a) iBinder).mo8511a();
                C2528c.this.f9587t.mo8497b();
                C2528c.this.f9587t.mo8493a(C2528c.this.f9564A);
            } else if (C2528c.this.f9591x == 4) {
                BT_ACSUtilityService4 unused5 = C2528c.this.f9588u = ((BT_ACSUtilityService4.C2274a) iBinder).mo8532a();
                C2528c.this.f9588u.mo8518b();
                C2528c.this.f9588u.mo8514a(C2528c.this.f9564A);
            } else if (C2528c.this.f9591x == 5) {
                BT_ACSUtilityService5 unused6 = C2528c.this.f9589v = ((BT_ACSUtilityService5.C2276a) iBinder).mo8553a();
                C2528c.this.f9589v.mo8539b();
                C2528c.this.f9589v.mo8535a(C2528c.this.f9564A);
            } else if (C2528c.this.f9591x == 6) {
                BT_ACSUtilityService_auto unused7 = C2528c.this.f9590w = ((BT_ACSUtilityService_auto.C2278a) iBinder).mo8574a();
                C2528c.this.f9590w.mo8560b();
                C2528c.this.f9590w.mo8556a(C2528c.this.f9564A);
            }
            C2528c.this.f9593z.mo8579a();
        }

        public void onServiceDisconnected(ComponentName componentName) {
            BT_ACSUtilityService0 unused = C2528c.this.f9584q = null;
            BT_ACSUtilityService1 unused2 = C2528c.this.f9585r = null;
            BT_ACSUtilityService2 unused3 = C2528c.this.f9586s = null;
            BT_ACSUtilityService3 unused4 = C2528c.this.f9587t = null;
            BT_ACSUtilityService4 unused5 = C2528c.this.f9588u = null;
            BT_ACSUtilityService5 unused6 = C2528c.this.f9589v = null;
            BT_ACSUtilityService_auto unused7 = C2528c.this.f9590w = null;
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: C */
    public final BluetoothAdapter.LeScanCallback f9566C = new BluetoothAdapter.LeScanCallback() {
        public void onLeScan(BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
            if (!C2528c.this.m13823a(bluetoothDevice).booleanValue()) {
                if (C2528c.this.f9575h == null) {
                    ArrayList unused = C2528c.this.f9575h = new ArrayList();
                }
                C2534b bVar = new C2534b(bluetoothDevice);
                C2528c.this.f9575h.add(bVar);
                if (C2528c.this.f9593z != null) {
                    C2528c.this.f9593z.mo8580a(bVar);
                }
            }
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: D */
    public final Handler f9567D = new Handler() {
        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    Boolean unused = C2528c.this.f9579l = false;
                    C2528c.this.f9582o.stopLeScan(C2528c.this.f9566C);
                    if (C2528c.this.f9593z != null) {
                        C2528c.this.f9593z.mo8583b();
                        break;
                    }
                    break;
            }
            super.handleMessage(message);
        }
    };

    /* renamed from: a */
    boolean f9568a;

    /* renamed from: b */
    byte[] f9569b;

    /* renamed from: c */
    private final boolean f9570c = false;

    /* renamed from: d */
    private final String f9571d = "BT_ACSUtility";

    /* renamed from: e */
    private final int f9572e = 1;

    /* renamed from: f */
    private Context f9573f;

    /* renamed from: g */
    private Thread f9574g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public ArrayList<C2534b> f9575h = null;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C2534b f9576i = null;

    /* renamed from: j */
    private int f9577j = 10;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public float f9578k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public Boolean f9579l;

    /* renamed from: m */
    private byte[] f9580m;

    /* renamed from: n */
    private boolean f9581n = true;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public BluetoothAdapter f9582o;

    /* renamed from: p */
    private BluetoothDevice f9583p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public BT_ACSUtilityService0 f9584q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public BT_ACSUtilityService1 f9585r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public BT_ACSUtilityService2 f9586s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public BT_ACSUtilityService3 f9587t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public BT_ACSUtilityService4 f9588u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public BT_ACSUtilityService5 f9589v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public BT_ACSUtilityService_auto f9590w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public int f9591x;

    /* renamed from: y */
    private BluetoothManager f9592y = null;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public C2533a f9593z;

    /* renamed from: com.imlabworld.HS_Instructor.c$a */
    public interface C2533a {
        /* renamed from: a */
        void mo8579a();

        /* renamed from: a */
        void mo8580a(C2534b bVar);

        /* renamed from: a */
        void mo8581a(C2534b bVar, Boolean bool);

        /* renamed from: a */
        void mo8582a(C2534b bVar, byte[] bArr);

        /* renamed from: b */
        void mo8583b();

        /* renamed from: b */
        void mo8584b(C2534b bVar);

        /* renamed from: c */
        void mo8585c();
    }

    /* renamed from: com.imlabworld.HS_Instructor.c$b */
    public class C2534b implements Serializable {

        /* renamed from: a */
        public final BluetoothDevice f9598a;

        public C2534b(BluetoothDevice bluetoothDevice) {
            this.f9598a = bluetoothDevice;
        }
    }

    /* renamed from: com.imlabworld.HS_Instructor.c$c */
    private class C2535c implements Runnable {
        private C2535c() {
        }

        public void run() {
            try {
                Thread.sleep(((long) C2528c.this.f9578k) * 1000);
                if (C2528c.this.f9579l.booleanValue()) {
                    Message message = new Message();
                    message.what = 1;
                    C2528c.this.f9567D.sendMessage(message);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public C2528c() {
    }

    public C2528c(Context context, C2533a aVar, int i) {
        this.f9573f = context;
        this.f9593z = aVar;
        this.f9577j = 10;
        this.f9579l = false;
        this.f9568a = false;
        this.f9591x = i;
        this.f9592y = (BluetoothManager) context.getSystemService("bluetooth");
        this.f9582o = this.f9592y.getAdapter();
        if (this.f9582o != null) {
            Intent intent = new Intent();
            if (this.f9591x == 0) {
                intent.setClass(context, BT_ACSUtilityService0.class);
                context.startService(intent);
                context.bindService(intent, this.f9565B, 1);
            } else if (this.f9591x == 1) {
                intent.setClass(context, BT_ACSUtilityService1.class);
                context.startService(intent);
                context.bindService(intent, this.f9565B, 1);
            } else if (this.f9591x == 2) {
                intent.setClass(context, BT_ACSUtilityService2.class);
                context.startService(intent);
                context.bindService(intent, this.f9565B, 1);
            } else if (this.f9591x == 3) {
                intent.setClass(context, BT_ACSUtilityService3.class);
                context.startService(intent);
                context.bindService(intent, this.f9565B, 1);
            } else if (this.f9591x == 4) {
                intent.setClass(context, BT_ACSUtilityService4.class);
                context.startService(intent);
                context.bindService(intent, this.f9565B, 1);
            } else if (this.f9591x == 5) {
                intent.setClass(context, BT_ACSUtilityService5.class);
                context.startService(intent);
                context.bindService(intent, this.f9565B, 1);
            } else if (this.f9591x == 6) {
                intent.setClass(context, BT_ACSUtilityService_auto.class);
                context.startService(intent);
                context.bindService(intent, this.f9565B, 1);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Boolean m13823a(BluetoothDevice bluetoothDevice) {
        if (this.f9575h == null) {
            return false;
        }
        Iterator<C2534b> it = this.f9575h.iterator();
        while (it.hasNext()) {
            if (it.next().f9598a.getAddress().equals(bluetoothDevice.getAddress())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private void m13827a(byte[] bArr, byte[] bArr2, int i, int i2, int i3) {
        if (bArr.length < i3) {
            i3 = bArr.length;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            bArr2[i4 + i2] = bArr[i4 + i];
        }
    }

    /* renamed from: c */
    private String m13830c(byte[] bArr) {
        StringBuilder sb = new StringBuilder("");
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() < 2) {
                sb.append(0);
            }
            sb.append(hexString);
        }
        sb.append(10);
        return sb.toString();
    }

    /* renamed from: d */
    private void m13832d(byte[] bArr) {
        if (this.f9580m != null) {
            byte[] bArr2 = new byte[(this.f9580m.length + bArr.length)];
            m13827a(this.f9580m, bArr2, 0, 0, this.f9580m.length);
            m13827a(bArr, bArr2, 0, this.f9580m.length, bArr.length);
            this.f9580m = null;
            this.f9580m = bArr2;
        } else {
            this.f9580m = new byte[bArr.length];
            m13827a(bArr, this.f9580m, 0, 0, bArr.length);
        }
        if (this.f9580m.length >= this.f9577j) {
            byte[] bArr3 = new byte[this.f9577j];
            byte[] bArr4 = new byte[(this.f9580m.length - this.f9577j)];
            m13827a(this.f9580m, bArr3, 0, 0, this.f9577j);
            m13827a(this.f9580m, bArr4, this.f9577j, 0, bArr4.length);
            this.f9580m = null;
            this.f9580m = bArr4;
            this.f9593z.mo8582a(this.f9576i, bArr3);
        }
    }

    /* renamed from: g */
    private void m13836g() {
        if (this.f9593z != null) {
            this.f9593z.mo8581a(this.f9576i, (Boolean) false);
        }
    }

    /* renamed from: h */
    private void m13838h() {
        if (this.f9593z != null) {
            this.f9593z.mo8581a(this.f9576i, (Boolean) true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C2533a mo9313a() {
        return this.f9593z;
    }

    /* renamed from: a */
    public void mo9314a(float f) {
        this.f9575h = null;
        this.f9578k = f;
        if (this.f9579l.booleanValue()) {
            Log.e("BT_ACSUtility", "enum in progress,could not execute again");
            return;
        }
        Log.d("BT_ACSUtility", "start scan now");
        this.f9582o.stopLeScan(this.f9566C);
        this.f9582o.startLeScan(this.f9566C);
        this.f9579l = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9315a(C2533a aVar) {
        this.f9593z = aVar;
    }

    /* renamed from: a */
    public void mo9316a(C2534b bVar, int i) {
        this.f9577j = i;
    }

    /* renamed from: a */
    public void mo9317a(String str, String str2) {
    }

    /* renamed from: a */
    public void mo9318a(byte[] bArr) {
        if (bArr == null) {
            return;
        }
        if (this.f9591x == 0) {
            this.f9584q.mo8432a(bArr);
        } else if (this.f9591x == 1) {
            this.f9585r.mo8453a(bArr);
        } else if (this.f9591x == 2) {
            this.f9586s.mo8474a(bArr);
        } else if (this.f9591x == 3) {
            this.f9587t.mo8495a(bArr);
        } else if (this.f9591x == 4) {
            this.f9588u.mo8516a(bArr);
        } else if (this.f9591x == 5) {
            this.f9589v.mo8537a(bArr);
        } else if (this.f9591x == 6) {
            this.f9590w.mo8558a(bArr);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0034 A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo9319a(com.imlabworld.HS_Instructor.C2528c.C2534b r6) {
        /*
            r5 = this;
            r4 = 7
            r3 = 2
            r0 = 1
            int r1 = r5.f9591x
            if (r1 != 0) goto L_0x001c
            com.imlabworld.HS_Instructor.BT_ACSUtilityService0 r1 = r5.f9584q
            if (r1 == 0) goto L_0x0034
            com.imlabworld.HS_Instructor.BT_ACSUtilityService0 r1 = r5.f9584q
            android.bluetooth.BluetoothGatt r1 = r1.f7436m
            if (r1 == 0) goto L_0x0034
            android.bluetooth.BluetoothManager r1 = r5.f9592y
            android.bluetooth.BluetoothDevice r2 = r6.f9598a
            int r1 = r1.getConnectionState(r2, r4)
            if (r1 != r3) goto L_0x0034
        L_0x001b:
            return r0
        L_0x001c:
            int r1 = r5.f9591x
            if (r1 != r0) goto L_0x0036
            com.imlabworld.HS_Instructor.BT_ACSUtilityService1 r1 = r5.f9585r
            if (r1 == 0) goto L_0x0034
            com.imlabworld.HS_Instructor.BT_ACSUtilityService1 r1 = r5.f9585r
            android.bluetooth.BluetoothGatt r1 = r1.f7469h
            if (r1 == 0) goto L_0x0034
            android.bluetooth.BluetoothManager r1 = r5.f9592y
            android.bluetooth.BluetoothDevice r2 = r6.f9598a
            int r1 = r1.getConnectionState(r2, r4)
            if (r1 == r3) goto L_0x001b
        L_0x0034:
            r0 = 0
            goto L_0x001b
        L_0x0036:
            int r1 = r5.f9591x
            if (r1 != r3) goto L_0x004f
            com.imlabworld.HS_Instructor.BT_ACSUtilityService2 r1 = r5.f9586s
            if (r1 == 0) goto L_0x0034
            com.imlabworld.HS_Instructor.BT_ACSUtilityService2 r1 = r5.f9586s
            android.bluetooth.BluetoothGatt r1 = r1.f7502h
            if (r1 == 0) goto L_0x0034
            android.bluetooth.BluetoothManager r1 = r5.f9592y
            android.bluetooth.BluetoothDevice r2 = r6.f9598a
            int r1 = r1.getConnectionState(r2, r4)
            if (r1 != r3) goto L_0x0034
            goto L_0x001b
        L_0x004f:
            int r1 = r5.f9591x
            r2 = 3
            if (r1 != r2) goto L_0x0069
            com.imlabworld.HS_Instructor.BT_ACSUtilityService3 r1 = r5.f9587t
            if (r1 == 0) goto L_0x0034
            com.imlabworld.HS_Instructor.BT_ACSUtilityService3 r1 = r5.f9587t
            android.bluetooth.BluetoothGatt r1 = r1.f7535h
            if (r1 == 0) goto L_0x0034
            android.bluetooth.BluetoothManager r1 = r5.f9592y
            android.bluetooth.BluetoothDevice r2 = r6.f9598a
            int r1 = r1.getConnectionState(r2, r4)
            if (r1 != r3) goto L_0x0034
            goto L_0x001b
        L_0x0069:
            int r1 = r5.f9591x
            r2 = 4
            if (r1 != r2) goto L_0x0083
            com.imlabworld.HS_Instructor.BT_ACSUtilityService4 r1 = r5.f9588u
            if (r1 == 0) goto L_0x0034
            com.imlabworld.HS_Instructor.BT_ACSUtilityService4 r1 = r5.f9588u
            android.bluetooth.BluetoothGatt r1 = r1.f7568h
            if (r1 == 0) goto L_0x0034
            android.bluetooth.BluetoothManager r1 = r5.f9592y
            android.bluetooth.BluetoothDevice r2 = r6.f9598a
            int r1 = r1.getConnectionState(r2, r4)
            if (r1 != r3) goto L_0x0034
            goto L_0x001b
        L_0x0083:
            int r1 = r5.f9591x
            r2 = 5
            if (r1 != r2) goto L_0x009e
            com.imlabworld.HS_Instructor.BT_ACSUtilityService5 r1 = r5.f9589v
            if (r1 == 0) goto L_0x0034
            com.imlabworld.HS_Instructor.BT_ACSUtilityService5 r1 = r5.f9589v
            android.bluetooth.BluetoothGatt r1 = r1.f7601h
            if (r1 == 0) goto L_0x0034
            android.bluetooth.BluetoothManager r1 = r5.f9592y
            android.bluetooth.BluetoothDevice r2 = r6.f9598a
            int r1 = r1.getConnectionState(r2, r4)
            if (r1 != r3) goto L_0x0034
            goto L_0x001b
        L_0x009e:
            int r1 = r5.f9591x
            r2 = 6
            if (r1 != r2) goto L_0x0034
            com.imlabworld.HS_Instructor.BT_ACSUtilityService_auto r1 = r5.f9590w
            if (r1 == 0) goto L_0x0034
            com.imlabworld.HS_Instructor.BT_ACSUtilityService_auto r1 = r5.f9590w
            android.bluetooth.BluetoothGatt r1 = r1.f7634h
            if (r1 == 0) goto L_0x0034
            android.bluetooth.BluetoothManager r1 = r5.f9592y
            android.bluetooth.BluetoothDevice r2 = r6.f9598a
            int r1 = r1.getConnectionState(r2, r4)
            if (r1 != r3) goto L_0x0034
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.imlabworld.HS_Instructor.C2528c.mo9319a(com.imlabworld.HS_Instructor.c$b):boolean");
    }

    /* renamed from: b */
    public void mo9320b(C2534b bVar) {
        Log.e("BT_ACSUtility", this.f9593z.toString() + "connect");
        if (this.f9591x == 0) {
            if (this.f9584q != null && bVar != null) {
                this.f9576i = bVar;
                this.f9584q.mo8433a(bVar.f9598a.getAddress());
            }
        } else if (this.f9591x == 1) {
            if (this.f9585r != null && bVar != null) {
                this.f9576i = bVar;
                this.f9585r.mo8454a(bVar.f9598a.getAddress());
            }
        } else if (this.f9591x == 2) {
            if (this.f9586s != null && bVar != null) {
                this.f9576i = bVar;
                this.f9586s.mo8475a(bVar.f9598a.getAddress());
            }
        } else if (this.f9591x == 3) {
            if (this.f9587t != null && bVar != null) {
                this.f9576i = bVar;
                this.f9587t.mo8496a(bVar.f9598a.getAddress());
            }
        } else if (this.f9591x == 4) {
            if (this.f9588u != null && bVar != null) {
                this.f9576i = bVar;
                this.f9588u.mo8517a(bVar.f9598a.getAddress());
            }
        } else if (this.f9591x == 5) {
            if (this.f9589v != null && bVar != null) {
                this.f9576i = bVar;
                this.f9589v.mo8538a(bVar.f9598a.getAddress());
            }
        } else if (this.f9591x == 6 && this.f9590w != null && bVar != null) {
            this.f9576i = bVar;
            this.f9590w.mo8559a(bVar.f9598a.getAddress());
        }
    }

    /* renamed from: b */
    public void mo9321b(byte[] bArr) {
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() == 1) {
                '0' + hexString;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo9322b() {
        return this.f9568a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo9323c() {
        return this.f9579l.booleanValue();
    }

    /* renamed from: d */
    public void mo9324d() {
        this.f9579l = false;
        this.f9582o.stopLeScan(this.f9566C);
    }

    /* renamed from: e */
    public void mo9325e() {
        if (this.f9591x == 0) {
            this.f9584q.mo8435c();
        } else if (this.f9591x == 1) {
            this.f9585r.mo8456c();
        } else if (this.f9591x == 2) {
            this.f9586s.mo8477c();
        } else if (this.f9591x == 3) {
            this.f9587t.mo8498c();
        } else if (this.f9591x == 4) {
            this.f9588u.mo8519c();
        } else if (this.f9591x == 5) {
            this.f9589v.mo8540c();
        } else if (this.f9591x == 6) {
            this.f9590w.mo8561c();
        }
    }

    /* renamed from: f */
    public void mo9326f() {
        if (this.f9591x == 0) {
            this.f9584q.mo8436d();
        } else if (this.f9591x == 1) {
            this.f9585r.mo8457d();
        } else if (this.f9591x == 2) {
            this.f9586s.mo8478d();
        } else if (this.f9591x == 3) {
            this.f9587t.mo8499d();
        } else if (this.f9591x == 4) {
            this.f9588u.mo8520d();
        } else if (this.f9591x == 5) {
            this.f9589v.mo8541d();
        } else if (this.f9591x == 6) {
            this.f9590w.mo8562d();
        }
        this.f9573f.unbindService(this.f9565B);
        Intent intent = new Intent();
        intent.setClass(this.f9573f, BT_ACSUtilityService0.class);
        this.f9573f.stopService(intent);
    }
}
