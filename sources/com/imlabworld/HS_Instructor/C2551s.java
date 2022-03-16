package com.imlabworld.HS_Instructor;

/* renamed from: com.imlabworld.HS_Instructor.s */
public class C2551s {

    /* renamed from: a */
    private int f9737a;

    /* renamed from: b */
    private int f9738b;

    /* renamed from: c */
    private int f9739c;

    /* renamed from: d */
    private int f9740d;

    /* renamed from: e */
    private int f9741e;

    /* renamed from: f */
    private int f9742f;

    /* renamed from: g */
    private int f9743g;

    /* renamed from: h */
    private double f9744h;

    public C2551s() {
        this.f9737a = 1;
        this.f9738b = 1;
        this.f9739c = 1;
        this.f9740d = 1;
        this.f9741e = 1;
        this.f9742f = 1;
        this.f9743g = 0;
        this.f9744h = 0.75d;
    }

    public C2551s(int i, int i2, int i3, int i4, int i5, int i6, int i7, double d) {
        this.f9737a = i;
        this.f9738b = i2;
        this.f9739c = i3;
        this.f9740d = i4;
        this.f9741e = i5;
        this.f9742f = i6;
        this.f9743g = i7;
        this.f9744h = d;
    }

    /* renamed from: a */
    public int mo9659a() {
        return this.f9737a;
    }

    /* renamed from: a */
    public void mo9660a(double d) {
        this.f9744h = d;
    }

    /* renamed from: a */
    public void mo9661a(int i) {
        this.f9737a = i;
    }

    /* renamed from: b */
    public int mo9662b() {
        return this.f9738b;
    }

    /* renamed from: b */
    public void mo9663b(int i) {
        this.f9738b = i;
    }

    /* renamed from: c */
    public int mo9664c() {
        return this.f9739c;
    }

    /* renamed from: c */
    public void mo9665c(int i) {
        this.f9739c = i;
    }

    /* renamed from: d */
    public int mo9666d() {
        return this.f9740d;
    }

    /* renamed from: d */
    public void mo9667d(int i) {
        this.f9740d = i;
    }

    /* renamed from: e */
    public int mo9668e() {
        return this.f9741e;
    }

    /* renamed from: e */
    public void mo9669e(int i) {
        this.f9741e = i;
    }

    /* renamed from: f */
    public int mo9670f() {
        return this.f9742f;
    }

    /* renamed from: f */
    public void mo9671f(int i) {
        this.f9742f = i;
    }

    /* renamed from: g */
    public int mo9672g() {
        return this.f9743g;
    }

    /* renamed from: g */
    public void mo9673g(int i) {
        this.f9743g = i;
    }

    /* renamed from: h */
    public double mo9674h() {
        return this.f9744h;
    }

    public String toString() {
        return String.format("CC: %d %d %d %d %d, RP: %d %d %d, Ratio: %f", new Object[]{Integer.valueOf(this.f9738b), Integer.valueOf(this.f9739c), Integer.valueOf(this.f9740d), Integer.valueOf(this.f9741e), Integer.valueOf(this.f9742f), Integer.valueOf(this.f9743g), Double.valueOf(this.f9744h)});
    }
}
