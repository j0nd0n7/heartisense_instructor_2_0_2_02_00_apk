package android.support.p036v7.app;

/* renamed from: android.support.v7.app.z */
class C1475z {

    /* renamed from: a */
    public static final int f4572a = 0;

    /* renamed from: b */
    public static final int f4573b = 1;

    /* renamed from: f */
    private static C1475z f4574f = null;

    /* renamed from: g */
    private static final float f4575g = 0.017453292f;

    /* renamed from: h */
    private static final float f4576h = 9.0E-4f;

    /* renamed from: i */
    private static final float f4577i = -0.10471976f;

    /* renamed from: j */
    private static final float f4578j = 0.0334196f;

    /* renamed from: k */
    private static final float f4579k = 3.49066E-4f;

    /* renamed from: l */
    private static final float f4580l = 5.236E-6f;

    /* renamed from: m */
    private static final float f4581m = 0.4092797f;

    /* renamed from: n */
    private static final long f4582n = 946728000000L;

    /* renamed from: c */
    public long f4583c;

    /* renamed from: d */
    public long f4584d;

    /* renamed from: e */
    public int f4585e;

    C1475z() {
    }

    /* renamed from: a */
    static C1475z m8682a() {
        if (f4574f == null) {
            f4574f = new C1475z();
        }
        return f4574f;
    }

    /* renamed from: a */
    public void mo4978a(long j, double d, double d2) {
        float f = ((float) (j - f4582n)) / 8.64E7f;
        float f2 = 6.24006f + (0.01720197f * f);
        double sin = ((double) f2) + (0.03341960161924362d * Math.sin((double) f2)) + (3.4906598739326E-4d * Math.sin((double) (2.0f * f2))) + (5.236000106378924E-6d * Math.sin((double) (3.0f * f2))) + 1.796593063d + 3.141592653589793d;
        double d3 = (-d2) / 360.0d;
        double sin2 = (Math.sin((double) f2) * 0.0053d) + d3 + ((double) (((float) Math.round(((double) (f - f4576h)) - d3)) + f4576h)) + (-0.0069d * Math.sin(2.0d * sin));
        double asin = Math.asin(Math.sin(sin) * Math.sin(0.4092797040939331d));
        double d4 = 0.01745329238474369d * d;
        double sin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(d4) * Math.sin(asin))) / (Math.cos(asin) * Math.cos(d4));
        if (sin3 >= 1.0d) {
            this.f4585e = 1;
            this.f4583c = -1;
            this.f4584d = -1;
        } else if (sin3 <= -1.0d) {
            this.f4585e = 0;
            this.f4583c = -1;
            this.f4584d = -1;
        } else {
            float acos = (float) (Math.acos(sin3) / 6.283185307179586d);
            this.f4583c = Math.round((((double) acos) + sin2) * 8.64E7d) + f4582n;
            this.f4584d = Math.round((sin2 - ((double) acos)) * 8.64E7d) + f4582n;
            if (this.f4584d >= j || this.f4583c <= j) {
                this.f4585e = 1;
            } else {
                this.f4585e = 0;
            }
        }
    }
}
