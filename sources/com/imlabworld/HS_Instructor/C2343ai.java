package com.imlabworld.HS_Instructor;

import android.app.AlertDialog;
import android.bluetooth.BluetoothDevice;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.imlabworld.HS_Instructor.C2426b;
import com.imlabworld.HS_Instructor.C2528c;
import com.imlabworld.p079a.C2570af;
import com.imlabworld.p079a.C2572ah;
import com.imlabworld.p079a.C2577am;
import com.imlabworld.p079a.C2590az;
import com.imlabworld.p079a.C2597e;
import com.imlabworld.p079a.C2608p;
import com.imlabworld.p079a.C2616u;
import com.imlabworld.p079a.C2621y;
import com.woxthebox.draglistview.C2656R;
import java.util.ArrayList;

/* renamed from: com.imlabworld.HS_Instructor.ai */
public class C2343ai extends C2341ah {

    /* renamed from: aA */
    private final Handler f7941aA = new Handler() {
        public void handleMessage(Message message) {
            try {
                C2343ai.this.mo8710a(message.what, C2426b.C2428a.START_CODE);
            } catch (Exception e) {
            }
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: aB */
    public final Handler f7942aB = new Handler() {
        public void handleMessage(Message message) {
            try {
                C2343ai.this.mo8710a(message.what, C2426b.C2428a.PRODUCT_CHECK_CODE);
            } catch (Exception e) {
            }
        }
    };

    /* renamed from: aw */
    Handler f7943aw = new Handler() {
        public void handleMessage(Message message) {
            try {
                C2343ai.this.mo8710a(message.what, C2426b.C2428a.STOP_CODE);
            } catch (Exception e) {
            }
        }
    };

    /* renamed from: ax */
    private final String f7944ax = "UI_A_MAIN_2BLE";
    /* access modifiers changed from: private */

    /* renamed from: ay */
    public final Handler f7945ay = new Handler() {
        public void handleMessage(Message message) {
            try {
                int i = message.what;
                C2343ai.this.f7928at[i].f7876z = false;
                C2343ai.this.f7928at[i].f7828A = false;
                Log.e("sibala", C2556x.f9799p[i] + "");
                C2343ai.this.f7928at[i].f7851a.mo9320b(C2343ai.this.f7928at[i].f7869s);
                C2343ai.this.f7928at[i].f7860j.mo9020b(3);
                C2343ai.this.f7928at[i].f7833F = 0;
                C2343ai.this.f7928at[i].f7834G = true;
                if (C2557y.f9845q[i] != null) {
                    C2557y.f9845q[i].mo10022c();
                    C2557y.f9845q[i] = null;
                }
                C2557y.f9845q[i] = new C2616u(C2343ai.this.f7928at[i].f7835H, 0.1d);
                C2557y.f9845q[i].mo10021b();
            } catch (Exception e) {
            }
        }
    };

    /* renamed from: az */
    private final Handler f7946az = new Handler() {
        public void handleMessage(Message message) {
            try {
                C2343ai.this.mo8710a(message.what, C2426b.C2428a.D_VALUE_EDIT);
            } catch (Exception e) {
            }
        }
    };

    /* renamed from: A */
    private void m13209A(int i) {
        int o = mo8709o(i);
        C2556x.f9799p[i] = 1300;
        C2556x.f9800q[i] = (o * 10) + 50;
        C2556x.f9802s[i] = C2556x.f9801r[i] + C2556x.f9799p[i];
        C2556x.f9804u[i] = C2556x.f9803t[i] + C2556x.f9800q[i];
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public boolean m13210B(int i) {
        while (this.f7928at[i].f7843P.size() > 0 && this.f7928at[i].f7843P.get(0).byteValue() != 2) {
            this.f7928at[i].f7843P.remove(0);
        }
        if (this.f7928at[i].f7843P.size() <= 2) {
            return false;
        }
        int size = this.f7928at[i].f7843P.size();
        byte[] bArr = new byte[size];
        for (int i2 = 0; i2 < size; i2++) {
            bArr[i2] = this.f7928at[i].f7843P.get(i2).byteValue();
        }
        byte b = bArr[1];
        if (size >= 5 && bArr[1] == -120 && bArr[2] == 9 && ((bArr[3] == 0 || bArr[3] == 1) && bArr[4] == 3)) {
            m13213a(i, m13215a(i, bArr, 5));
            return true;
        } else if (b < 5 || b > 20) {
            this.f7928at[i].f7843P.remove(0);
            return true;
        } else if (b > size) {
            return false;
        } else {
            if (bArr[b - 1] == 3) {
                m13213a(i, m13215a(i, bArr, (int) b));
                return true;
            }
            this.f7928at[i].f7843P.remove(0);
            return true;
        }
    }

    /* renamed from: a */
    private void m13212a(int i, int i2, byte[] bArr) {
    }

    /* renamed from: a */
    private void m13213a(int i, byte[] bArr) {
        byte b = bArr[2] & 255;
        if (b == 16) {
            m13217b(i, bArr);
        } else if (b == 1) {
        } else {
            if (b >= 2 && b <= 6) {
                m13219c(i, bArr);
            } else if (b == 7) {
            } else {
                if (b == 8) {
                    m13223e(i, bArr);
                } else if (b == 9) {
                    m13225f(i, bArr);
                } else if (b == 15) {
                    m13221d(i, bArr);
                } else if (b == 17) {
                    m13212a(i, 0, bArr);
                    m13227g(i, bArr);
                }
            }
        }
    }

    /* renamed from: a */
    private byte[] m13215a(int i, byte[] bArr, int i2) {
        byte[] bArr2 = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            this.f7928at[i].f7843P.remove(0);
            bArr2[i3] = bArr[i3];
        }
        return bArr2;
    }

    /* renamed from: b */
    private void m13217b(int i, byte[] bArr) {
        int i2 = ((bArr[3] << 8) & 65280) + (bArr[4] & 255);
        int i3 = (bArr[6] & 255) + ((bArr[5] << 8) & 65280);
        int a = mo8930a(i2);
        int a2 = mo8930a(i3);
        int max = Math.max(a, a2);
        double[] dArr = new double[3];
        double[] dArr2 = new double[3];
        for (int i4 = 0; i4 < 3; i4++) {
            dArr[i4] = ((double) bArr[(i4 * 2) + 8]) / 10.0d;
            dArr2[i4] = ((double) bArr[(i4 * 2) + 9]) / 10.0d;
        }
        int i5 = (bArr[18] & 255) + ((bArr[17] << 8) & 65280);
        byte b = bArr[7] & 255;
        boolean[] zArr = new boolean[4];
        if ((b & 16) > 0) {
            zArr[0] = false;
        } else {
            zArr[0] = true;
        }
        if ((b & 32) > 0) {
            zArr[3] = false;
        } else {
            zArr[3] = true;
        }
        if ((b & 64) > 0) {
            zArr[2] = false;
        } else {
            zArr[2] = true;
        }
        if ((b & 128) > 0) {
            zArr[1] = false;
        } else {
            zArr[1] = true;
        }
        C2570af afVar = new C2570af(a, a2, max, dArr, dArr2, i5, b, zArr, new byte[]{bArr[14], bArr[15], bArr[16]}, new double[]{0.0d, 0.0d, 0.0d});
        if (this.f7928at[i].f7875y) {
            switch (this.f7928at[i].f7865o.mo8998d()) {
                case 0:
                    this.f7928at[i].f7846S.mo9812h(500 + C2556x.f9803t[i]);
                    break;
                case 1:
                case 2:
                    this.f7928at[i].f7846S.mo9812h(C2556x.f9803t[i] + this.f7928at[i].f7865o.mo8999e());
                    break;
            }
        }
        this.f7928at[i].f7870t = this.f7928at[i].f7846S.mo10031a(afVar);
        this.f7928at[i].f7871u = true;
    }

    /* renamed from: c */
    private void m13219c(int i, byte[] bArr) {
        if (C2557y.f9848t[i] != null) {
            C2557y.f9848t[i].mo10022c();
        }
        byte b = bArr[2] & 255;
        byte b2 = bArr[3] & 255;
        switch (b) {
            case 3:
                this.f7928at[i].f7829B = b2;
                mo8710a(i, C2426b.C2428a.ATM_CODE);
                return;
            case 4:
                this.f7928at[i].f7830C = b2;
                m13234z(i);
                return;
            case 6:
                if (this.f7928at[i].f7876z) {
                    this.f7928at[i].f7846S = new C2621y(new C2597e(C2590az.ADJUST_ZERO, 1, C2557y.f9832d.f9755k, C2557y.f9832d.f9747c, C2557y.f9832d.f9751g, C2557y.f9832d.f9752h, C2557y.f9832d.f9753i), 0, C2556x.f9799p[i], 0, C2556x.f9800q[i]);
                    m13212a(i, 0, bArr);
                    if (b2 == 0) {
                        this.f7928at[i].f7832E = 0;
                        mo8712g(i, 12);
                        if (!this.f7928at[i].f7850W) {
                            this.f7946az.sendEmptyMessageDelayed(i, 1000);
                            this.f7941aA.sendEmptyMessageDelayed(i, 3000);
                        }
                        this.f7928at[i].f7850W = true;
                        return;
                    }
                    if (!this.f7928at[i].f7850W) {
                        mo8710a(i, C2426b.C2428a.D_VALUE_EDIT);
                        this.f7941aA.sendEmptyMessageDelayed(i, 1500);
                    }
                    this.f7928at[i].f7850W = false;
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: d */
    private void m13221d(int i, byte[] bArr) {
        if (C2557y.f9848t[i] != null) {
            C2557y.f9848t[i].mo10022c();
        }
        byte b = bArr[3] & 255;
        if (b == 2 || b == 3 || b == 4 || b == 5) {
            this.f7928at[i].f7844Q = b;
            mo8710a(i, C2426b.C2428a.LABEL_CHECK_CODE);
            return;
        }
        m13233y(i);
    }

    /* renamed from: e */
    private void m13223e(int i, byte[] bArr) {
        if (C2557y.f9848t[i] != null) {
            C2557y.f9848t[i].mo10022c();
        }
        if ((bArr[3] & 255) == 0) {
            mo8710a(i, C2426b.C2428a.ACCEL_CODE);
        } else {
            m13233y(i);
        }
    }

    /* renamed from: f */
    private void m13225f(int i, byte[] bArr) {
        if (C2557y.f9848t[i] != null) {
            C2557y.f9848t[i].mo10022c();
        }
    }

    /* renamed from: g */
    private void m13227g(int i, byte[] bArr) {
        if (!this.f7923ao) {
            if (C2557y.f9849u[i] != null) {
                C2557y.f9849u[i].mo10022c();
            }
            switch (bArr[4] & 255) {
                case 1:
                    this.f7928at[i].f7832E = 0;
                    mo8631k(i);
                    return;
                case 2:
                    this.f7928at[i].f7832E = 0;
                    m13230v(i);
                    return;
                case 3:
                    this.f7928at[i].f7832E = 0;
                    m13231w(i);
                    return;
                case 4:
                    Log.e("Bypass", "Completed!");
                    this.f7928at[i].f7850W = false;
                    return;
                case 5:
                    switch (this.f7928at[i].f7874x) {
                        case 22:
                            this.f7928at[i].f7850W = true;
                            this.f7928at[i].f7832E = 0;
                            Log.e("Bypass", "Started!");
                            mo8628j(i);
                            return;
                        default:
                            return;
                    }
                default:
                    return;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void mo8628j(int i) {
        byte[] bArr = new byte[11];
        bArr[0] = 2;
        bArr[1] = 11;
        bArr[2] = 17;
        bArr[3] = 1;
        bArr[4] = (byte) (C2557y.f9832d.f9750f + 1);
        bArr[5] = (byte) C2557y.f9832d.f9751g;
        bArr[6] = (byte) C2557y.f9832d.f9752h;
        bArr[7] = (byte) C2557y.f9832d.f9753i;
        bArr[8] = (byte) C2557y.f9832d.f9755k;
        if (C2557y.f9832d.f9756l == 0) {
            C2557y.f9832d.f9756l = 1;
        }
        bArr[9] = (byte) C2557y.f9832d.f9756l;
        bArr[10] = 3;
        this.f7928at[i].f7851a.mo9318a(bArr);
        this.f7928at[i].f7840M = 1;
        if (C2557y.f9849u[i] != null) {
            C2557y.f9849u[i].mo10021b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public void mo8631k(int i) {
        byte[] bArr = {2, 10, 17, 2, 1, 1, 1, 1, 1, 3};
        this.f7928at[i].f7851a.mo9318a(bArr);
        m13212a(i, 1, bArr);
        this.f7928at[i].f7840M = 2;
        if (C2557y.f9849u[i] != null) {
            C2557y.f9849u[i].mo10021b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public void m13230v(int i) {
        byte[] bArr = {2, 10, 17, 3, (byte) C2557y.f9832d.f9745a, (byte) C2557y.f9832d.f9746b, (byte) C2557y.f9832d.f9747c, (byte) C2557y.f9832d.f9748d, (byte) C2557y.f9832d.f9749e, 3};
        this.f7928at[i].f7851a.mo9318a(bArr);
        m13212a(i, 1, bArr);
        this.f7928at[i].f7840M = 3;
        if (C2557y.f9849u[i] != null) {
            C2557y.f9849u[i].mo10021b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public void m13231w(int i) {
        int i2 = 20;
        byte[] bArr = new byte[8];
        int i3 = (this.f7928at[i].f7848U.f9714a < 0 || this.f7928at[i].f7848U.f9714a > 100) ? 20 : this.f7928at[i].f7848U.f9714a;
        int i4 = (this.f7928at[i].f7848U.f9715b < 0 || this.f7928at[i].f7848U.f9715b > 100) ? 20 : this.f7928at[i].f7848U.f9715b;
        if (this.f7928at[i].f7848U.f9716c >= 0 && this.f7928at[i].f7848U.f9716c <= 100) {
            i2 = this.f7928at[i].f7848U.f9716c;
        }
        bArr[0] = 2;
        bArr[1] = 8;
        bArr[2] = 17;
        bArr[3] = 4;
        bArr[4] = (byte) (i3 + 1);
        bArr[5] = (byte) (i4 + 1);
        bArr[6] = (byte) (i2 + 1);
        bArr[7] = 3;
        this.f7928at[i].f7851a.mo9318a(bArr);
        m13212a(i, 1, bArr);
        this.f7928at[i].f7840M = 4;
        if (C2557y.f9849u[i] != null) {
            C2557y.f9849u[i].mo10021b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public void m13232x(int i) {
        if (this.f7928at[i].f7851a.f9568a && this.f7928at[i].f7871u && !this.f7923ao) {
            this.f7928at[i].f7871u = false;
            switch (this.f7928at[i].f7870t) {
                case CP_DISCONNECT:
                case BM_DISCONNECT:
                    C2577am t = this.f7928at[i].f7846S.mo9824t();
                    switch (t.mo9885b()) {
                        case CP_DISCONNECT:
                            mo8589a(i, this.f7928at[i].f7874x);
                            return;
                        case BM_DISCONNECT:
                            mo8611b(i, this.f7928at[i].f7874x);
                            return;
                        default:
                            return;
                    }
                case NONE:
                    if (this.f7928at[i].f7875y) {
                        switch (this.f7928at[i].f7846S.mo9814j()) {
                            case CALIBRATION_BREATH:
                                this.f7928at[i].f7865o.mo8994a(this.f7928at[i].f7846S.mo9822r());
                                return;
                            case CALIBRATION_NORMAL:
                                if (this.f7928at[i].f7865o.mo8998d() == 0) {
                                    this.f7928at[i].f7865o.mo8996b();
                                    this.f7928at[i].f7865o.mo8993a(this.f7928at[i].f7846S.mo9822r().mo9872g());
                                }
                                this.f7928at[i].f7865o.mo8994a(this.f7928at[i].f7846S.mo9822r());
                                return;
                            default:
                                return;
                        }
                    } else {
                        switch (this.f7928at[i].f7874x) {
                            case 10:
                            case 18:
                            case 19:
                                switch (this.f7928at[i].f7846S.mo9814j()) {
                                    case COMPRESSION:
                                        if ((C2556x.f9805v[i] != null && this.f7928at[i].f7847T < C2556x.f9805v[i].mo9977d()) || this.f7928at[i].f7874x != 18) {
                                            this.f7928at[i].f7874x = 18;
                                            mo8702a(C2337ad.FullCPRScenarioCPR);
                                            mo8704e(i, 18);
                                        }
                                        if (this.f7892J.getVisibility() == 4) {
                                            this.f7928at[i].f7862l.mo9007a(this.f7928at[i].f7846S.mo9820p(), this.f7928at[i].f7846S.mo9827w(), this.f7928at[i].f7846S.mo9813i().mo9925b());
                                        } else {
                                            this.f7893K.mo8860a(i, this.f7928at[i].f7846S.mo9820p(), this.f7928at[i].f7846S.mo9827w(), this.f7928at[i].f7846S.mo9813i().mo9925b());
                                        }
                                        if (C2556x.f9805v[i] != null) {
                                            this.f7928at[i].f7847T = C2556x.f9805v[i].mo9977d();
                                            return;
                                        }
                                        return;
                                    case BREATH:
                                        if (this.f7928at[i].f7874x != 19) {
                                            this.f7928at[i].f7874x = 19;
                                            mo8702a(C2337ad.FullCPRScenarioCPR);
                                            mo8705f(i, 19);
                                        }
                                        if (this.f7892J.getVisibility() == 4) {
                                            this.f7928at[i].f7863m.mo8984a(this.f7928at[i].f7846S.mo9821q(), this.f7928at[i].f7846S.mo9827w(), this.f7928at[i].f7846S.mo9813i().mo9925b());
                                            return;
                                        } else {
                                            this.f7893K.mo8859a(i, this.f7928at[i].f7846S.mo9821q(), this.f7928at[i].f7846S.mo9827w(), this.f7928at[i].f7846S.mo9813i().mo9925b());
                                            return;
                                        }
                                    case CPR_END:
                                        if (this.f7928at[i].f7874x != 20) {
                                            this.f7928at[i].f7874x = 20;
                                            C2556x.f9805v[i] = this.f7928at[i].f7846S.mo9819o();
                                            mo8622g(i);
                                            return;
                                        }
                                        return;
                                    default:
                                        return;
                                }
                            case 13:
                                switch (this.f7928at[i].f7846S.mo9814j()) {
                                    case COMPRESSION:
                                        this.f7891I.mo9047a(this.f7928at[i].f7846S.mo9820p(), this.f7928at[i].f7846S.mo9827w());
                                        return;
                                    case BREATH:
                                        this.f7891I.mo9046a(this.f7928at[i].f7846S.mo9821q(), this.f7928at[i].f7846S.mo9827w());
                                        return;
                                    case CPR_END:
                                        if (!this.f7928at[i].f7849V) {
                                            this.f7891I.mo9051b(this.f7928at[i].f7846S.mo9827w());
                                            this.f7928at[i].f7849V = true;
                                            break;
                                        }
                                        break;
                                }
                                this.f7891I.mo9057f();
                                return;
                            case 16:
                            case 17:
                                switch (this.f7928at[i].f7846S.mo9814j()) {
                                    case COMPRESSION:
                                        if (this.f7928at[i].f7874x != 16) {
                                            mo8704e(i, 16);
                                            this.f7928at[i].f7874x = 16;
                                        }
                                        if (this.f7892J.getVisibility() == 4) {
                                            this.f7928at[i].f7862l.mo9007a(this.f7928at[i].f7846S.mo9820p(), 0, 0);
                                            return;
                                        } else {
                                            this.f7893K.mo8860a(i, this.f7928at[i].f7846S.mo9820p(), 0, 0);
                                            return;
                                        }
                                    case BREATH:
                                        if (this.f7928at[i].f7874x != 17) {
                                            mo8705f(i, 17);
                                            this.f7928at[i].f7874x = 17;
                                        }
                                        if (this.f7892J.getVisibility() == 4) {
                                            this.f7928at[i].f7863m.mo8984a(this.f7928at[i].f7846S.mo9821q(), 0, 0);
                                            return;
                                        } else {
                                            this.f7893K.mo8859a(i, this.f7928at[i].f7846S.mo9821q(), 0, 0);
                                            return;
                                        }
                                    default:
                                        return;
                                }
                            case 22:
                            case C2608p.f10611n /*221*/:
                                if (this.f7928at[i].f7876z && !this.f7928at[i].f7828A) {
                                    switch (this.f7928at[i].f7846S.mo9814j()) {
                                        case ADJUST_ZERO_END:
                                            mo8710a(i, C2426b.C2428a.STOP_CODE);
                                            C2572ah s = this.f7928at[i].f7846S.mo9823s();
                                            C2556x.f9801r[i] = s.mo9853b();
                                            C2556x.f9802s[i] = s.mo9854c();
                                            C2556x.f9803t[i] = s.mo9855d();
                                            C2556x.f9804u[i] = s.mo9856e();
                                            this.f7928at[i].f7828A = true;
                                            mo8934h(this.f7928at[i].f7848U.mo9553b());
                                            this.f7928at[i].f7834G = false;
                                            if (C2557y.f9845q[i] != null) {
                                                C2557y.f9845q[i].mo10022c();
                                            }
                                            C2557y.f9845q[i] = null;
                                            this.f7928at[i].f7860j.mo9021b(this.f7928at[i].f7848U.mo9553b());
                                            this.f7928at[i].f7860j.mo9020b(4);
                                            for (int i2 = 0; i2 < 6; i2++) {
                                                if (this.f7928at[i].f7851a.f9568a && this.f7928at[i2].f7874x != 22) {
                                                    switch (this.f7928at[i2].f7874x) {
                                                        case 1:
                                                        case 2:
                                                        case 3:
                                                        case 4:
                                                        case 5:
                                                        case 6:
                                                        case 7:
                                                        case 8:
                                                        case 16:
                                                        case 17:
                                                            this.f7928at[i].f7860j.mo9019b();
                                                            break;
                                                        case 9:
                                                        case 10:
                                                        case 11:
                                                        case 18:
                                                        case 19:
                                                        case 20:
                                                            this.f7928at[i].f7860j.mo9019b();
                                                            break;
                                                    }
                                                }
                                            }
                                            this.f7906X.setImageResource(C2656R.drawable.btn_control_red);
                                            this.f7901S.mo8817b(this.f7928at);
                                            this.f7893K.mo8863a(this.f7928at);
                                            this.f7891I.mo9045a(i);
                                            this.f7891I.mo9052b(this.f7928at);
                                            if (this.f7928at[i].f7874x == 221) {
                                                this.f7928at[i].f7874x = 13;
                                                return;
                                            }
                                            return;
                                        default:
                                            return;
                                    }
                                } else {
                                    return;
                                }
                            default:
                                return;
                        }
                    }
                default:
                    return;
            }
        }
    }

    /* renamed from: y */
    private void m13233y(int i) {
        new AlertDialog.Builder(this).setTitle(C2557y.f9835g.f10215bI).setMessage(C2557y.f9835g.f10172aS).setPositiveButton(C2557y.f9835g.f10209bC, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        }).show().setCanceledOnTouchOutside(false);
        this.f7928at[i].f7851a.mo9325e();
        this.f7928at[i].f7834G = false;
        if (C2557y.f9845q[i] != null) {
            C2557y.f9845q[i].mo10022c();
        }
        C2557y.f9845q[i] = null;
        if (C2557y.f9848t[i] != null) {
            C2557y.f9848t[i].mo10022c();
        }
        this.f7928at[i].f7833F = 0;
        mo8706l(i);
    }

    /* renamed from: z */
    private void m13234z(final int i) {
        String str;
        int i2;
        String str2;
        char c;
        if (this.f7928at[i].f7829B == 2 || this.f7928at[i].f7830C == 2) {
            if (this.f7928at[i].f7829B == 2) {
                str = "" + C2557y.f9835g.f10136J;
                i2 = 1;
            } else {
                str = "";
                i2 = 0;
            }
            if (this.f7928at[i].f7830C == 2) {
                if (i2 >= 1) {
                    str = str + C2557y.f9835g.f10138L;
                }
                str = str + C2557y.f9835g.f10137K;
                i2++;
            }
            this.f7924ap[i] = new AlertDialog.Builder(this).setTitle(C2557y.f9835g.f10215bI).setMessage(((i2 == 2 ? str + C2557y.f9835g.f10170aQ : str + C2557y.f9835g.f10169aP) + "(" + this.f7928at[i].f7848U.mo9553b() + ")") + C2557y.f9835g.f10169aP).setPositiveButton(C2557y.f9835g.f10209bC, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    C2343ai.this.f7928at[i].f7834G = false;
                    if (C2557y.f9845q[i] != null) {
                        C2557y.f9845q[i].mo10022c();
                    }
                    C2557y.f9845q[i] = null;
                    C2343ai.this.f7928at[i].f7833F = 0;
                    C2343ai.this.mo8706l(i);
                }
            }).show();
            this.f7924ap[i].setCanceledOnTouchOutside(false);
            this.f7928at[i].f7851a.mo9325e();
        } else if (this.f7928at[i].f7829B == 1 || this.f7928at[i].f7830C == 1) {
            if (this.f7928at[i].f7829B == 1) {
                str2 = "" + C2557y.f9835g.f10136J;
                c = 1;
            } else {
                str2 = "";
                c = 0;
            }
            if (this.f7928at[i].f7830C == 1) {
                if (c >= 1) {
                    str2 = str2 + C2557y.f9835g.f10138L;
                }
                str2 = str2 + C2557y.f9835g.f10137K;
            }
            this.f7924ap[i] = new AlertDialog.Builder(this).setTitle(C2557y.f9835g.f10215bI).setMessage(((c == 2 ? str2 + C2557y.f9835g.f10170aQ : str2 + C2557y.f9835g.f10169aP) + "(" + this.f7928at[i].f7848U.mo9553b() + ")") + C2557y.f9835g.f10169aP).setPositiveButton(C2557y.f9835g.f10209bC, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    C2343ai.this.f7928at[i].f7834G = false;
                    if (C2557y.f9845q[i] != null) {
                        C2557y.f9845q[i].mo10022c();
                    }
                    C2557y.f9845q[i] = null;
                    C2343ai.this.f7928at[i].f7833F = 0;
                    C2343ai.this.mo8706l(i);
                }
            }).show();
            this.f7924ap[i].setCanceledOnTouchOutside(false);
            this.f7928at[i].f7851a.mo9325e();
        } else {
            this.f7928at[i].f7876z = true;
            m13209A(i);
            mo8710a(i, C2426b.C2428a.BT2_CODE);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo8710a(int i, C2426b.C2428a aVar) {
        switch (aVar) {
            case START_CODE:
                this.f7928at[i].f7851a.mo9318a(new byte[]{2, 5, 9, 0, 3});
                this.f7928at[i].f7839L = C2426b.C2428a.START_CODE;
                if (C2557y.f9848t[i] != null) {
                    C2557y.f9848t[i].mo10021b();
                    return;
                }
                return;
            case STOP_CODE:
                this.f7928at[i].f7851a.mo9318a(new byte[]{2, 5, 9, 1, 3});
                this.f7928at[i].f7839L = C2426b.C2428a.STOP_CODE;
                if (C2557y.f9848t[i] != null) {
                    C2557y.f9848t[i].mo10021b();
                    return;
                }
                return;
            case ACCEL_CODE:
                this.f7928at[i].f7851a.mo9318a(new byte[]{2, 5, 3, 3, 3});
                this.f7928at[i].f7839L = C2426b.C2428a.ACCEL_CODE;
                if (C2557y.f9848t[i] != null) {
                    C2557y.f9848t[i].mo10021b();
                    return;
                }
                return;
            case ATM_CODE:
                this.f7928at[i].f7851a.mo9318a(new byte[]{2, 5, 4, 3, 3});
                this.f7928at[i].f7839L = C2426b.C2428a.ATM_CODE;
                if (C2557y.f9848t[i] != null) {
                    C2557y.f9848t[i].mo10021b();
                    return;
                }
                return;
            case BT1_CODE:
                this.f7928at[i].f7851a.mo9318a(new byte[]{2, 5, 5, 3, 3});
                this.f7928at[i].f7839L = C2426b.C2428a.BT1_CODE;
                if (C2557y.f9848t[i] != null) {
                    C2557y.f9848t[i].mo10021b();
                    return;
                }
                return;
            case BT2_CODE:
                this.f7928at[i].f7851a.mo9318a(new byte[]{2, 5, 6, 3, 3});
                this.f7928at[i].f7839L = C2426b.C2428a.BT2_CODE;
                if (C2557y.f9848t[i] != null) {
                    C2557y.f9848t[i].mo10021b();
                    return;
                }
                return;
            case PRODUCT_CHECK_CODE:
                this.f7928at[i].f7851a.mo9318a(new byte[]{2, 5, 15, 3, 3});
                this.f7928at[i].f7839L = C2426b.C2428a.PRODUCT_CHECK_CODE;
                if (C2557y.f9848t[i] != null) {
                    C2557y.f9848t[i].mo10021b();
                    return;
                }
                return;
            case LABEL_CHECK_CODE:
                this.f7928at[i].f7851a.mo9318a(new byte[]{2, 5, 8, (byte) this.f7928at[i].f7844Q, 3});
                this.f7928at[i].f7839L = C2426b.C2428a.LABEL_CHECK_CODE;
                if (C2557y.f9848t[i] != null) {
                    C2557y.f9848t[i].mo10021b();
                    return;
                }
                return;
            case D_VALUE_EDIT:
                byte[] bArr = {2, 7, 10, 1, 3, -44, 3};
                bArr[6] = 3;
                this.f7928at[i].f7851a.mo9318a(bArr);
                return;
            default:
                return;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo8711a(Intent intent, int i) {
        C2338ae aeVar = this.f7928at[i];
        C2528c cVar = this.f7928at[i].f7851a;
        cVar.getClass();
        aeVar.f7869s = new C2528c.C2534b((BluetoothDevice) intent.getExtras().getParcelable("android.bluetooth.device.extra.DEVICE"));
        this.f7945ay.sendEmptyMessageDelayed(i, 500);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo8712g(int i, int i2) {
        this.f7928at[i].f7851a.mo9318a(new byte[]{2, 6, 17, 5, (byte) i2, 3});
        this.f7928at[i].f7840M = 5;
        this.f7928at[i].f7841N = i2;
        if (C2557y.f9849u[i] != null) {
            C2557y.f9849u[i].mo10021b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo8713h(int i, int i2) {
        this.f7928at[i].f7851a.mo9318a(new byte[]{2, 6, 17, 7, (byte) i2, 3});
        Log.e("pause", "pause " + i2);
        this.f7928at[i].f7840M = 7;
        this.f7928at[i].f7842O = i2;
        if (C2557y.f9849u[i] != null) {
            C2557y.f9849u[i].mo10021b();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo8714p(int i) {
        if (this.f7928at[i].f7872v || this.f7928at[i].f7851a.f9568a) {
            this.f7928at[i].f7873w = false;
            return;
        }
        this.f7928at[i].f7860j.mo9020b(3);
        this.f7928at[i].f7833F = 0;
        this.f7928at[i].f7834G = true;
        if (C2557y.f9845q[i] != null) {
            C2557y.f9845q[i].mo10022c();
            C2557y.f9845q[i] = null;
        }
        C2557y.f9845q[i] = new C2616u(this.f7928at[i].f7835H, 0.1d);
        C2557y.f9845q[i].mo10021b();
        if (this.f7928at[i].f7851a.mo9323c()) {
            mo8715q(i);
        }
        this.f7928at[i].f7851a.mo9314a(0.0f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo8715q(int i) {
        this.f7928at[i].f7851a.mo9324d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo8716r(final int i) {
        this.f7928at[i].f7835H = new Handler() {
            public void handleMessage(Message message) {
                try {
                    switch (message.what) {
                        case 3:
                            if (C2343ai.this.f7928at[i].f7834G && !C2343ai.this.f7923ao) {
                                C2343ai.this.f7928at[i].f7833F++;
                                C2343ai.this.f7928at[i].f7860j.mo9016a(C2343ai.this.f7928at[i].f7833F);
                                if (!C2343ai.this.f7928at[i].f7873w) {
                                    if (C2343ai.this.f7928at[i].f7833F > 150) {
                                        C2343ai.this.mo8610b(i);
                                        return;
                                    }
                                    return;
                                } else if (C2343ai.this.f7928at[i].f7833F > 50) {
                                    C2343ai.this.f7928at[i].f7834G = false;
                                    if (C2557y.f9845q[i] != null) {
                                        C2557y.f9845q[i].mo10022c();
                                    }
                                    C2557y.f9845q[i] = null;
                                    C2343ai.this.f7928at[i].f7833F = 0;
                                    C2343ai.this.f7928at[i].f7873w = false;
                                    C2343ai.this.mo8715q(i);
                                    C2343ai.this.mo8933g(C2343ai.this.f7928at[i].f7848U.mo9553b());
                                    C2343ai.this.mo8706l(i);
                                    return;
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                        default:
                            return;
                    }
                } catch (Exception e) {
                }
            }
        };
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo8717s(final int i) {
        this.f7928at[i].f7852b = new C2528c.C2533a() {
            /* renamed from: a */
            public void mo8579a() {
            }

            /* renamed from: a */
            public void mo8580a(C2528c.C2534b bVar) {
                if (bVar != null && bVar.f9598a != null && bVar.f9598a.getAddress() != null) {
                    if (C2343ai.this.f7928at[i].f7848U.mo9556c().equals(bVar.f9598a.getAddress()) && !C2343ai.this.f7928at[i].f7851a.f9568a) {
                        C2343ai.this.f7928at[i].f7873w = false;
                        C2343ai.this.mo8715q(i);
                        C2343ai.this.f7928at[i].f7869s = bVar;
                        C2343ai.this.f7945ay.sendEmptyMessageDelayed(i, 500);
                    }
                }
            }

            /* renamed from: a */
            public void mo8581a(C2528c.C2534b bVar, Boolean bool) {
                String str;
                C2555w.f9782c[i] = true;
                C2555w.f9783d[i] = bVar;
                String address = bVar.f9598a.getAddress() != null ? bVar.f9598a.getAddress() : null;
                if (bVar.f9598a.getName() != null) {
                    String substring = bVar.f9598a.getName().substring(4);
                    str = substring.length() > 5 ? substring.substring(0, 5) : substring;
                } else {
                    str = null;
                }
                C2540h c = C2343ai.this.f7929au.mo9629c();
                int[] b = c.mo9403b();
                int i = 0;
                while (true) {
                    int i2 = i;
                    if (i2 < 6) {
                        if (i2 != i && C2343ai.this.f7928at[i2].f7848U != null && C2343ai.this.f7928at[i2].f7848U.mo9556c().equals(address)) {
                            C2343ai.this.f7928at[i2].f7848U = new C2547o(-1, "null", "null", -1, -1, -1);
                            b[i2] = -1;
                            C2343ai.this.f7928at[i2].f7872v = true;
                            C2343ai.this.f7928at[i2].f7860j.mo9020b(1);
                            break;
                        }
                        i = i2 + 1;
                    } else {
                        break;
                    }
                }
                String str2 = str == null ? "-" : str;
                if (address != null) {
                    C2547o a = C2343ai.this.f7929au.mo9621a(address);
                    if (a != null) {
                        C2343ai.this.f7928at[i].f7848U = a;
                        b[i] = a.mo9550a();
                        Log.e("BB add", b[i] + "");
                    } else {
                        int a2 = C2343ai.this.f7929au.mo9619a(new C2547o(str2, address, -1, -1, -1));
                        C2343ai.this.f7928at[i].f7848U = C2343ai.this.f7929au.mo9621a(address);
                        Log.e("Kit!!", C2343ai.this.f7928at[i].f7848U.mo9553b());
                        b[i] = a2;
                        Log.e("BB add", b[i] + "");
                    }
                }
                c.mo9401a(b);
                C2343ai.this.f7929au.mo9623a(c);
                C2557y.f9834f = C2343ai.this.f7929au.mo9629c();
                C2343ai.this.f7928at[i].f7843P = new ArrayList<>();
                C2343ai.this.f7928at[i].f7872v = false;
                C2343ai.this.f7928at[i].f7850W = false;
                C2343ai.this.f7928at[i].f7871u = false;
                C2343ai.this.f7942aB.sendEmptyMessageDelayed(i, 500);
            }

            /* renamed from: a */
            public void mo8582a(C2528c.C2534b bVar, byte[] bArr) {
                if (bArr != null) {
                    try {
                        for (byte valueOf : bArr) {
                            C2343ai.this.f7928at[i].f7843P.add(Byte.valueOf(valueOf));
                        }
                        boolean z = true;
                        while (z) {
                            z = C2343ai.this.m13210B(i);
                        }
                        if (C2343ai.this.f7928at[i].f7871u) {
                            C2343ai.this.m13232x(i);
                        }
                    } catch (Exception e) {
                    }
                }
            }

            /* renamed from: b */
            public void mo8583b() {
            }

            /* renamed from: b */
            public void mo8584b(C2528c.C2534b bVar) {
                if (!C2343ai.this.f7923ao) {
                    C2557y.f9854z[i] = null;
                    if (C2557y.f9848t[i] != null) {
                        C2557y.f9848t[i].mo10022c();
                    }
                    if (C2557y.f9849u[i] != null) {
                        C2557y.f9849u[i].mo10022c();
                    }
                    if (C2557y.f9847s[i] != null) {
                        C2557y.f9847s[i].mo10022c();
                    }
                    C2343ai.this.mo8935i(C2343ai.this.f7928at[i].f7848U.mo9553b());
                    if (C2343ai.this.f7928at[i].f7874x == 13 || C2343ai.this.f7928at[i].f7874x == 221) {
                        C2343ai.this.f7928at[i].f7874x = C2608p.f10611n;
                    } else {
                        C2343ai.this.f7928at[i].f7874x = 22;
                    }
                    C2343ai.this.mo8706l(i);
                    boolean z = true;
                    for (int i = 0; i < 6; i++) {
                        if (C2343ai.this.f7928at[i].f7851a.mo9322b()) {
                            z = false;
                        }
                    }
                    if (z) {
                        for (int i2 = 0; i2 < 6; i2++) {
                            C2343ai.this.mo8613c(i2, 1);
                            C2343ai.this.mo8626i(i2);
                            C2343ai.this.f7928at[i2].f7874x = 22;
                            C2343ai.this.mo8706l(i);
                        }
                        C2343ai.this.f7906X.setImageResource(C2656R.drawable.btn_control_gray);
                    }
                    C2343ai.this.mo8701a(i, (String) null);
                    C2343ai.this.f7901S.mo8817b(C2343ai.this.f7928at);
                    C2343ai.this.f7893K.mo8863a(C2343ai.this.f7928at);
                    C2343ai.this.f7891I.mo9052b(C2343ai.this.f7928at);
                }
            }

            /* renamed from: c */
            public void mo8585c() {
            }
        };
        this.f7928at[i].f7866p = new Handler() {
            public void handleMessage(Message message) {
                try {
                    switch (message.what) {
                        case 3:
                            if (C2343ai.this.f7928at[i].f7836I) {
                                C2343ai.this.f7928at[i].f7837J++;
                                if (C2343ai.this.f7928at[i].f7837J >= 8) {
                                    C2343ai.this.mo8626i(i);
                                    C2343ai.this.f7928at[i].f7874x = 11;
                                    C2343ai.this.mo8624h(i);
                                    return;
                                }
                                return;
                            }
                            return;
                        default:
                            return;
                    }
                } catch (Exception e) {
                }
            }
        };
        this.f7928at[i].f7867q = new Handler() {
            public void handleMessage(Message message) {
                try {
                    switch (message.what) {
                        case 3:
                            if (C2557y.f9848t[i] != null) {
                                C2557y.f9848t[i].mo10022c();
                            }
                            switch (C23546.f7964a[C2343ai.this.f7928at[i].f7839L.ordinal()]) {
                                case 1:
                                    C2343ai.this.mo8710a(i, C2426b.C2428a.START_CODE);
                                    return;
                                case 2:
                                    C2343ai.this.mo8710a(i, C2426b.C2428a.STOP_CODE);
                                    return;
                                case 3:
                                    C2343ai.this.mo8710a(i, C2426b.C2428a.ACCEL_CODE);
                                    return;
                                case 4:
                                    C2343ai.this.mo8710a(i, C2426b.C2428a.ATM_CODE);
                                    return;
                                case 5:
                                    C2343ai.this.mo8710a(i, C2426b.C2428a.BT1_CODE);
                                    return;
                                case 6:
                                    C2343ai.this.mo8710a(i, C2426b.C2428a.BT2_CODE);
                                    return;
                                case 7:
                                    C2343ai.this.mo8710a(i, C2426b.C2428a.PRODUCT_CHECK_CODE);
                                    return;
                                case 8:
                                    C2343ai.this.mo8710a(i, C2426b.C2428a.LABEL_CHECK_CODE);
                                    return;
                                default:
                                    return;
                            }
                        default:
                            return;
                    }
                } catch (Exception e) {
                }
            }
        };
        this.f7928at[i].f7868r = new Handler() {
            public void handleMessage(Message message) {
                try {
                    switch (message.what) {
                        case 3:
                            if (C2557y.f9849u[i] != null) {
                                C2557y.f9849u[i].mo10022c();
                            }
                            switch (C2343ai.this.f7928at[i].f7840M) {
                                case 1:
                                    if (C2343ai.this.f7928at[i].f7832E < 10) {
                                        C2343ai.this.mo8628j(i);
                                        C2343ai.this.f7928at[i].f7832E++;
                                        return;
                                    } else if (C2343ai.this.f7928at[i].f7850W) {
                                        C2343ai.this.mo8710a(i, C2426b.C2428a.BT2_CODE);
                                        return;
                                    } else {
                                        return;
                                    }
                                case 2:
                                    if (C2343ai.this.f7928at[i].f7832E < 10) {
                                        C2343ai.this.mo8631k(i);
                                        C2343ai.this.f7928at[i].f7832E++;
                                        return;
                                    } else if (C2343ai.this.f7928at[i].f7850W) {
                                        C2343ai.this.mo8710a(i, C2426b.C2428a.BT2_CODE);
                                        return;
                                    } else {
                                        return;
                                    }
                                case 3:
                                    if (C2343ai.this.f7928at[i].f7832E < 10) {
                                        C2343ai.this.m13230v(i);
                                        C2343ai.this.f7928at[i].f7832E++;
                                        return;
                                    } else if (C2343ai.this.f7928at[i].f7850W) {
                                        C2343ai.this.mo8710a(i, C2426b.C2428a.BT2_CODE);
                                        return;
                                    } else {
                                        return;
                                    }
                                case 4:
                                    if (C2343ai.this.f7928at[i].f7832E < 10) {
                                        C2343ai.this.m13231w(i);
                                        C2343ai.this.f7928at[i].f7832E++;
                                        return;
                                    } else if (C2343ai.this.f7928at[i].f7850W) {
                                        C2343ai.this.mo8710a(i, C2426b.C2428a.BT2_CODE);
                                        return;
                                    } else {
                                        return;
                                    }
                                case 5:
                                    if (C2343ai.this.f7928at[i].f7832E < 10) {
                                        C2343ai.this.mo8712g(i, C2343ai.this.f7928at[i].f7841N);
                                        C2343ai.this.f7928at[i].f7832E++;
                                        return;
                                    }
                                    return;
                                case 6:
                                    if (C2343ai.this.f7928at[i].f7832E < 10) {
                                        C2343ai.this.mo8718t(i);
                                        C2343ai.this.f7928at[i].f7832E++;
                                        return;
                                    }
                                    return;
                                case 7:
                                    if (C2343ai.this.f7928at[i].f7832E < 10) {
                                        C2343ai.this.mo8713h(i, C2343ai.this.f7928at[i].f7842O);
                                        C2343ai.this.f7928at[i].f7832E++;
                                        return;
                                    }
                                    return;
                                case 8:
                                    if (C2343ai.this.f7928at[i].f7832E < 10) {
                                        C2343ai.this.mo8719u(i);
                                        C2343ai.this.f7928at[i].f7832E++;
                                        return;
                                    }
                                    return;
                                default:
                                    return;
                            }
                        default:
                            return;
                    }
                } catch (Exception e) {
                }
            }
        };
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo8718t(int i) {
        this.f7928at[i].f7851a.mo9318a(new byte[]{2, 9, 17, 6, (byte) ((int) ((C2556x.f9807x[i].mo9904j() * 100.0d) + 1.0d)), (byte) ((int) ((C2556x.f9807x[i].mo9898g() * 100.0d) + 1.0d)), (byte) ((int) ((C2556x.f9807x[i].mo9900h() * 100.0d) + 1.0d)), (byte) ((int) ((C2556x.f9807x[i].mo9902i() * 100.0d) + 1.0d)), 3});
        this.f7928at[i].f7840M = 6;
        if (C2557y.f9849u[i] != null) {
            C2557y.f9849u[i].mo10021b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo8719u(int i) {
        this.f7928at[i].f7851a.mo9318a(new byte[]{2, 5, 17, 8, 3});
        this.f7928at[i].f7840M = 8;
        if (C2557y.f9849u[i] != null) {
            C2557y.f9849u[i].mo10021b();
        }
    }
}
