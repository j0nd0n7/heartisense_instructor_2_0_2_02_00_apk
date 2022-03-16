package com.imlabworld.p079a;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.imlabworld.a.a */
public class C2562a {

    /* renamed from: A */
    private final C2595c f9887A;

    /* renamed from: B */
    private final C2595c f9888B;

    /* renamed from: C */
    private double f9889C;

    /* renamed from: a */
    private final boolean f9890a = false;

    /* renamed from: b */
    private final double f9891b = 13.0d;

    /* renamed from: c */
    private final int f9892c = 45;

    /* renamed from: d */
    private final int f9893d = 65;

    /* renamed from: e */
    private final int f9894e = 58;

    /* renamed from: f */
    private final int f9895f = 84;

    /* renamed from: g */
    private final int f9896g;

    /* renamed from: h */
    private final int f9897h;

    /* renamed from: i */
    private final int f9898i = 35;

    /* renamed from: j */
    private final int f9899j = 70;

    /* renamed from: k */
    private final C2597e f9900k;

    /* renamed from: l */
    private final int f9901l;

    /* renamed from: m */
    private final int f9902m;

    /* renamed from: n */
    private boolean f9903n;

    /* renamed from: o */
    private boolean f9904o;

    /* renamed from: p */
    private boolean f9905p;

    /* renamed from: q */
    private boolean f9906q;

    /* renamed from: r */
    private boolean f9907r;

    /* renamed from: s */
    private boolean f9908s;

    /* renamed from: t */
    private final C2595c f9909t;

    /* renamed from: u */
    private final C2595c f9910u;

    /* renamed from: v */
    private final C2595c f9911v;

    /* renamed from: w */
    private final C2595c f9912w;

    /* renamed from: x */
    private final C2595c f9913x;

    /* renamed from: y */
    private final C2595c f9914y;

    /* renamed from: z */
    private final C2595c f9915z;

    public C2562a(C2596d dVar, C2597e eVar) {
        this.f9903n = dVar.f10107a;
        this.f9904o = dVar.f10108b;
        this.f9905p = dVar.f10109c;
        this.f9906q = dVar.f10110d;
        this.f9907r = dVar.f10111e;
        this.f9908s = dVar.f10112f;
        this.f9889C = dVar.f10113g;
        this.f9900k = eVar;
        this.f9909t = new C2595c(0.0d, 100.0d, 0.0d, 100.0d, 9.64d, 90.36d, 7.27d, 92.73d);
        this.f9910u = new C2595c(54.9d, 100.0d, 20.0d, 100.0d, 62.2d, 92.7d, 13.2d, 86.8d);
        this.f9911v = new C2595c(120.0d, 165.1d, 100.0d, 20.0d, 127.3d, 157.8d, 86.8d, 13.2d);
        if (eVar.f10117d != 2) {
            this.f9912w = new C2595c(32.0d, 50.0d, 0.0d, 100.0d, 38.0d, 44.0d, 39.4d, 60.6d);
            this.f9913x = new C2595c(60.0d, 78.0d, 100.0d, 0.0d, 66.0d, 72.0d, 60.6d, 39.4d);
            this.f9901l = 50;
            this.f9902m = 60;
            this.f9896g = 58;
            this.f9897h = 84;
        } else {
            this.f9912w = new C2595c(22.0d, 40.0d, 0.0d, 100.0d, 28.0d, 34.0d, 39.4d, 60.6d);
            this.f9913x = new C2595c(50.0d, 68.0d, 100.0d, 0.0d, 56.0d, 62.0d, 60.6d, 39.4d);
            this.f9901l = 40;
            this.f9902m = 50;
            this.f9896g = 45;
            this.f9897h = 65;
        }
        this.f9914y = new C2595c(5.0d, 18.1d, 100.0d, 0.0d, 8.45d, 14.65d, 3.65d, 96.35d);
        this.f9915z = new C2595c(0.0d, 35.0d, 35.0d, 100.0d, 13.3d, 21.7d, 35.9d, 64.1d);
        this.f9887A = new C2595c(70.0d, 105.0d, 100.0d, 35.0d, 83.3d, 91.7d, 64.1d, 35.9d);
        this.f9888B = new C2595c(40.0d, 70.0d, 0.0d, 100.0d, 46.88d, 63.12d, 8.68d, 91.32d);
    }

    /* renamed from: a */
    private double m14308a(double d) {
        return 60.0d / d;
    }

    /* renamed from: a */
    private double m14309a(int i) {
        switch (Math.abs(2 - i)) {
            case 0:
                return 1.0d;
            case 1:
                return 0.6d;
            default:
                return 0.0d;
        }
    }

    /* renamed from: b */
    private double m14310b(double d) {
        return (this.f9900k.f10117d != 2 ? d < ((double) this.f9896g) ? (d * 5.0d) / ((double) this.f9896g) : d <= ((double) this.f9897h) ? (((d - ((double) this.f9896g)) * 1.0d) / ((double) (this.f9897h - this.f9896g))) + 5.0d : (6.0d * d) / ((double) this.f9897h) : d < ((double) this.f9896g) ? (d * 4.0d) / ((double) this.f9896g) : d <= ((double) this.f9897h) ? (((d - ((double) this.f9896g)) * 1.0d) / ((double) (this.f9897h - this.f9896g))) + 4.0d : (d * 5.0d) / ((double) this.f9897h)) * 10.0d;
    }

    /* renamed from: b */
    private double m14311b(int i) {
        switch (Math.abs(8 - i)) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                return 1.0d;
            case 5:
                return 0.75d;
            case 6:
                return 0.5d;
            case 7:
                return 0.25d;
            default:
                return 0.0d;
        }
    }

    /* renamed from: b */
    private double m14312b(ArrayList<C2615t> arrayList, ArrayList<C2614s> arrayList2) {
        int i;
        int i2 = 0;
        int size = arrayList2 == null ? 0 : arrayList2.size();
        double d = 0.0d;
        double d2 = 0.0d;
        int i3 = 0;
        while (i3 < size) {
            C2614s sVar = arrayList2.get(i3);
            double d3 = 0.0d;
            if (sVar.mo9979a() != 0) {
                int i4 = 0;
                i = i2;
                while (true) {
                    int i5 = i4;
                    if (i5 >= sVar.mo9979a()) {
                        break;
                    }
                    d3 += 60.0d / arrayList.get(i).mo10015g();
                    i++;
                    i4 = i5 + 1;
                }
            } else {
                i = i2;
            }
            i2 = i + sVar.mo9992i();
            d2 += sVar.mo9994k() + d3;
            i3++;
            d = d3 + d;
        }
        return (100.0d * d) / d2;
    }

    /* renamed from: a */
    public C2591b mo9790a(ArrayList<C2615t> arrayList, ArrayList<C2614s> arrayList2) {
        int i;
        int i2;
        int i3;
        double d;
        double d2;
        double d3;
        double d4;
        double d5;
        double d6;
        double d7;
        double d8;
        double d9;
        double d10;
        double d11;
        double d12;
        double d13;
        double a;
        double d14;
        double d15;
        double d16;
        double d17;
        double d18;
        double d19;
        double d20;
        double d21;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        double d22 = 0.0d;
        double d23 = 0.0d;
        double d24 = 0.0d;
        double d25 = 0.0d;
        double d26 = 0.0d;
        boolean z = true;
        boolean z2 = true;
        Iterator<C2615t> it = arrayList.iterator();
        while (true) {
            i = i4;
            i2 = i6;
            double d27 = d26;
            boolean z3 = z;
            i3 = i5;
            d = d25;
            boolean z4 = z2;
            d2 = d24;
            d3 = d23;
            d4 = d22;
            d5 = d27;
            if (!it.hasNext()) {
                break;
            }
            C2615t next = it.next();
            if (next.f10690c) {
                int d28 = next.mo10010d();
                int e = next.mo10012e();
                double g = next.mo10015g();
                i3++;
                if (this.f9903n && d28 == 0) {
                    i++;
                }
                if (this.f9904o) {
                    d4 = z3 ? d4 + 1.0d : g < 100.0d ? d4 + this.f9910u.mo9907a(g) : g <= 120.0d ? d4 + 1.0d : d4 + this.f9911v.mo9907a(g);
                }
                if (this.f9905p) {
                    double b = m14310b((double) d28);
                    d3 = b < ((double) this.f9901l) ? d3 + this.f9912w.mo9907a(b) : (this.f9900k.f10116c == 4 || this.f9900k.f10116c == 8 || this.f9900k.f10116c == 5 || this.f9900k.f10116c == 6 || b <= ((double) this.f9902m)) ? d3 + 1.0d : d3 + this.f9913x.mo9907a(b);
                }
                if (this.f9906q) {
                    d2 += this.f9914y.mo9907a(m14310b((double) e));
                }
                if (z3) {
                    z3 = false;
                }
                z2 = true;
            } else {
                int f = next.mo10014f();
                double g2 = next.mo10015g();
                i2++;
                if (this.f9908s) {
                    d5 = z4 ? d5 + 1.0d : d5 + m14311b((int) Math.round(g2));
                }
                if (this.f9907r) {
                    d = f < 35 ? d + this.f9915z.mo9907a((double) f) : f <= 70 ? d + 1.0d : d + this.f9887A.mo9907a((double) f);
                }
                if (z4) {
                    z4 = false;
                }
                z3 = true;
                z2 = z4;
            }
            z = z3;
            double d29 = d5;
            d22 = d4;
            d23 = d3;
            d24 = d2;
            d25 = d;
            i6 = i2;
            i5 = i3;
            d26 = d29;
            i4 = i;
        }
        double b2 = arrayList.size() != 0 ? m14312b(arrayList, arrayList2) : 0.0d;
        if (i3 != 0) {
            if (this.f9905p) {
                d19 = d3 / ((double) i3);
                d20 = 1.0d * d19;
            } else {
                d19 = -1.0d;
                d20 = 1.0d;
            }
            if (this.f9904o) {
                double d30 = d4 / ((double) i3);
                double d31 = d30;
                d21 = d20 * d30;
                d8 = d31;
            } else {
                d21 = d20;
                d8 = -1.0d;
            }
            if (this.f9906q) {
                d6 = d2 / ((double) i3);
                d21 *= d6;
            } else {
                d6 = -1.0d;
            }
            if (this.f9903n) {
                double a2 = this.f9909t.mo9907a((1.0d - (((double) i) / ((double) i3))) * 100.0d);
                d9 = d21 * a2;
                d10 = a2;
                d7 = d19;
            } else {
                d7 = d19;
                d9 = d21;
                d10 = -1.0d;
            }
        } else {
            d6 = -1.0d;
            d7 = -1.0d;
            d8 = -1.0d;
            d9 = 0.0d;
            d10 = -1.0d;
        }
        if (i2 != 0) {
            if (this.f9907r) {
                d17 = d / ((double) i2);
                d18 = 1.0d * d17;
            } else {
                d17 = -1.0d;
                d18 = 1.0d;
            }
            if (this.f9908s) {
                double d32 = d5 / ((double) i2);
                double d33 = d18 * d32;
                double d34 = d32;
                d11 = d17;
                d12 = d33;
                d13 = d34;
            } else {
                d11 = d17;
                d12 = d18;
                d13 = -1.0d;
            }
        } else {
            d11 = -1.0d;
            d12 = 0.0d;
            d13 = -1.0d;
        }
        switch (this.f9900k.f10114a) {
            case COMPRESSION_FINITE:
            case COMPRESSION_INFINITE:
                a = this.f9888B.mo9907a(b2 - 30.0d);
                d14 = d9 * a;
                d15 = d9;
                d16 = -1.0d;
                break;
            case BREATH_FINITE:
            case BREATH_INFINITE:
                d15 = -1.0d;
                a = -1.0d;
                d16 = d12;
                d14 = d12;
                break;
            case ALL_FINITE:
            case ALL_INFINITE:
                a = this.f9888B.mo9907a(b2);
                d14 = ((this.f9889C * d9) + ((1.0d - this.f9889C) * d12)) * a;
                d15 = d9;
                d16 = d12;
                break;
            default:
                a = 1.0d;
                d15 = d9;
                d14 = 1.0d;
                d16 = d12;
                break;
        }
        return new C2591b(d7, d6, d8, d10, d11, d13, d15, d16, a, d14);
    }

    /* renamed from: a */
    public void mo9791a(C2596d dVar) {
        this.f9903n = dVar.f10107a;
        this.f9904o = dVar.f10108b;
        this.f9905p = dVar.f10109c;
        this.f9906q = dVar.f10110d;
        this.f9907r = dVar.f10111e;
        this.f9908s = dVar.f10112f;
        this.f9889C = dVar.f10113g;
    }
}
