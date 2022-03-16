package android.support.p036v7.widget;

/* renamed from: android.support.v7.widget.bc */
class C1780bc {

    /* renamed from: a */
    public static final int f5947a = Integer.MIN_VALUE;

    /* renamed from: b */
    private int f5948b = 0;

    /* renamed from: c */
    private int f5949c = 0;

    /* renamed from: d */
    private int f5950d = Integer.MIN_VALUE;

    /* renamed from: e */
    private int f5951e = Integer.MIN_VALUE;

    /* renamed from: f */
    private int f5952f = 0;

    /* renamed from: g */
    private int f5953g = 0;

    /* renamed from: h */
    private boolean f5954h = false;

    /* renamed from: i */
    private boolean f5955i = false;

    C1780bc() {
    }

    /* renamed from: a */
    public int mo7153a() {
        return this.f5948b;
    }

    /* renamed from: a */
    public void mo7154a(int i, int i2) {
        this.f5950d = i;
        this.f5951e = i2;
        this.f5955i = true;
        if (this.f5954h) {
            if (i2 != Integer.MIN_VALUE) {
                this.f5948b = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f5949c = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f5948b = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f5949c = i2;
        }
    }

    /* renamed from: a */
    public void mo7155a(boolean z) {
        if (z != this.f5954h) {
            this.f5954h = z;
            if (!this.f5955i) {
                this.f5948b = this.f5952f;
                this.f5949c = this.f5953g;
            } else if (z) {
                this.f5948b = this.f5951e != Integer.MIN_VALUE ? this.f5951e : this.f5952f;
                this.f5949c = this.f5950d != Integer.MIN_VALUE ? this.f5950d : this.f5953g;
            } else {
                this.f5948b = this.f5950d != Integer.MIN_VALUE ? this.f5950d : this.f5952f;
                this.f5949c = this.f5951e != Integer.MIN_VALUE ? this.f5951e : this.f5953g;
            }
        }
    }

    /* renamed from: b */
    public int mo7156b() {
        return this.f5949c;
    }

    /* renamed from: b */
    public void mo7157b(int i, int i2) {
        this.f5955i = false;
        if (i != Integer.MIN_VALUE) {
            this.f5952f = i;
            this.f5948b = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f5953g = i2;
            this.f5949c = i2;
        }
    }

    /* renamed from: c */
    public int mo7158c() {
        return this.f5954h ? this.f5949c : this.f5948b;
    }

    /* renamed from: d */
    public int mo7159d() {
        return this.f5954h ? this.f5948b : this.f5949c;
    }
}
