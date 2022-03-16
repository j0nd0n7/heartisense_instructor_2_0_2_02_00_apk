package com.imlabworld.p079a;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.imlabworld.a.s */
public class C2614s {

    /* renamed from: a */
    double f10673a;

    /* renamed from: b */
    int f10674b = 0;

    /* renamed from: c */
    int f10675c;

    /* renamed from: d */
    int f10676d;

    /* renamed from: e */
    int f10677e;

    /* renamed from: f */
    double f10678f;

    /* renamed from: g */
    private int f10679g = 0;

    /* renamed from: h */
    private final int[] f10680h = new int[4];

    /* renamed from: i */
    private int f10681i;

    /* renamed from: j */
    private int f10682j;

    /* renamed from: k */
    private int f10683k;

    /* renamed from: l */
    private double f10684l;

    /* renamed from: m */
    private double f10685m;

    /* renamed from: n */
    private double f10686n;

    /* renamed from: o */
    private double f10687o;

    public C2614s() {
        for (int i = 0; i < 5; i++) {
            this.f10680h[0] = 0;
        }
        this.f10675c = 0;
        this.f10681i = 0;
        this.f10682j = 0;
        this.f10683k = 0;
        this.f10676d = 0;
        this.f10677e = 0;
        this.f10684l = 0.0d;
        this.f10685m = 0.0d;
        this.f10686n = 0.0d;
        this.f10687o = 0.0d;
    }

    /* renamed from: a */
    public int mo9979a() {
        return this.f10679g;
    }

    /* renamed from: a */
    public void mo9980a(double d) {
        this.f10673a = d;
    }

    /* renamed from: a */
    public void mo9981a(ArrayList<Double> arrayList) {
        Iterator<Double> it = arrayList.iterator();
        double d = 0.0d;
        while (it.hasNext()) {
            d = it.next().doubleValue() + d;
        }
        if (this.f10683k != 0) {
            this.f10684l = d / ((double) this.f10683k);
        } else {
            this.f10684l = 0.0d;
        }
    }

    /* renamed from: a */
    public void mo9982a(boolean z, double d, long j) {
        this.f10676d++;
        this.f10686n = ((this.f10686n * ((double) (this.f10676d - 1))) + d) / ((double) this.f10676d);
        if (this.f10676d == 1) {
            this.f10687o = 110.0d;
        } else {
            this.f10687o = (((double) this.f10676d) / (((double) j) / 1000.0d)) * 60.0d;
        }
        if (z) {
            this.f10677e++;
        }
    }

    /* renamed from: a */
    public void mo9983a(boolean z, boolean[] zArr, boolean z2, boolean z3, boolean z4, boolean z5, double d, long j) {
        this.f10679g++;
        if (z) {
            this.f10674b++;
        }
        if (z2) {
            this.f10675c++;
        }
        if (z3) {
            this.f10681i++;
        }
        if (z4) {
            this.f10682j++;
        }
        if (z5) {
            this.f10683k++;
        }
        for (int i = 0; i < 4; i++) {
            if (zArr[i]) {
                int[] iArr = this.f10680h;
                iArr[i] = iArr[i] + 1;
            }
        }
        if (this.f10683k == 0) {
            this.f10684l = 0.0d;
        } else if (z5) {
            this.f10684l = ((this.f10684l * ((double) (this.f10683k - 1))) + d) / ((double) this.f10683k);
        }
        if (this.f10679g == 1) {
            this.f10685m = 110.0d;
        } else {
            this.f10685m = (((double) this.f10679g) / (((double) j) / 1000.0d)) * 60.0d;
        }
    }

    /* renamed from: b */
    public double mo9984b() {
        return this.f10673a;
    }

    /* renamed from: b */
    public void mo9985b(double d) {
        this.f10678f = d;
    }

    /* renamed from: c */
    public int mo9986c() {
        return this.f10674b;
    }

    /* renamed from: d */
    public int[] mo9987d() {
        return this.f10680h;
    }

    /* renamed from: e */
    public int mo9988e() {
        return this.f10675c;
    }

    /* renamed from: f */
    public int mo9989f() {
        return this.f10681i;
    }

    /* renamed from: g */
    public int mo9990g() {
        return this.f10682j;
    }

    /* renamed from: h */
    public int mo9991h() {
        return this.f10683k;
    }

    /* renamed from: i */
    public int mo9992i() {
        return this.f10676d;
    }

    /* renamed from: j */
    public int mo9993j() {
        return this.f10677e;
    }

    /* renamed from: k */
    public double mo9994k() {
        return this.f10678f;
    }

    /* renamed from: l */
    public double mo9995l() {
        return this.f10684l;
    }

    /* renamed from: m */
    public double mo9996m() {
        return this.f10685m;
    }

    /* renamed from: n */
    public double mo9997n() {
        return this.f10686n;
    }

    /* renamed from: o */
    public double mo9998o() {
        return this.f10687o;
    }

    /* renamed from: p */
    public boolean mo9999p() {
        return this.f10678f >= 2.0d;
    }
}
