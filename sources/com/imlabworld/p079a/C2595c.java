package com.imlabworld.p079a;

/* renamed from: com.imlabworld.a.c */
class C2595c {

    /* renamed from: a */
    private final double f10099a;

    /* renamed from: b */
    private final double f10100b;

    /* renamed from: c */
    private final double f10101c;

    /* renamed from: d */
    private final double f10102d;

    /* renamed from: e */
    private final double f10103e;

    /* renamed from: f */
    private final double f10104f;

    /* renamed from: g */
    private final double f10105g;

    /* renamed from: h */
    private final double f10106h;

    public C2595c(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8) {
        this.f10103e = d;
        this.f10104f = d2;
        this.f10105g = d3 / 100.0d;
        this.f10106h = d4 / 100.0d;
        double d9 = d7 / 100.0d;
        this.f10101c = (Math.log((1.0d / d9) - 1.0d) - Math.log((1.0d / (d8 / 100.0d)) - 1.0d)) / (d6 - d5);
        this.f10102d = (Math.log((1.0d / d9) - 1.0d) / this.f10101c) + d5;
        double exp = 1.0d + Math.exp((-this.f10101c) * (this.f10103e - this.f10102d));
        double exp2 = 1.0d + Math.exp((-this.f10101c) * (this.f10104f - this.f10102d));
        this.f10099a = ((this.f10106h * exp2) - (this.f10105g * exp)) / (exp2 - exp);
        this.f10100b = (this.f10105g * exp) - ((exp - 1.0d) * this.f10099a);
    }

    /* renamed from: a */
    public double mo9907a(double d) {
        if (d <= this.f10103e) {
            return this.f10105g;
        }
        if (d >= this.f10104f) {
            return this.f10106h;
        }
        double exp = this.f10099a + ((this.f10100b - this.f10099a) / (1.0d + Math.exp((-this.f10101c) * (d - this.f10102d))));
        if (exp > Math.max(this.f10105g, this.f10106h)) {
            exp = Math.max(this.f10105g, this.f10106h);
        }
        return exp < Math.min(this.f10105g, this.f10106h) ? Math.min(this.f10105g, this.f10106h) : exp;
    }
}
