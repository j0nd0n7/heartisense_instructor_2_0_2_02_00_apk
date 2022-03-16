package android.support.p036v7.p045g;

/* renamed from: android.support.v7.g.b */
public class C1496b implements C1505d {

    /* renamed from: f */
    private static final int f4652f = 0;

    /* renamed from: g */
    private static final int f4653g = 1;

    /* renamed from: h */
    private static final int f4654h = 2;

    /* renamed from: i */
    private static final int f4655i = 3;

    /* renamed from: a */
    final C1505d f4656a;

    /* renamed from: b */
    int f4657b = 0;

    /* renamed from: c */
    int f4658c = -1;

    /* renamed from: d */
    int f4659d = -1;

    /* renamed from: e */
    Object f4660e = null;

    public C1496b(C1505d dVar) {
        this.f4656a = dVar;
    }

    /* renamed from: a */
    public void mo5062a() {
        if (this.f4657b != 0) {
            switch (this.f4657b) {
                case 1:
                    this.f4656a.mo5063a(this.f4658c, this.f4659d);
                    break;
                case 2:
                    this.f4656a.mo5065b(this.f4658c, this.f4659d);
                    break;
                case 3:
                    this.f4656a.mo5064a(this.f4658c, this.f4659d, this.f4660e);
                    break;
            }
            this.f4660e = null;
            this.f4657b = 0;
        }
    }

    /* renamed from: a */
    public void mo5063a(int i, int i2) {
        if (this.f4657b != 1 || i < this.f4658c || i > this.f4658c + this.f4659d) {
            mo5062a();
            this.f4658c = i;
            this.f4659d = i2;
            this.f4657b = 1;
            return;
        }
        this.f4659d += i2;
        this.f4658c = Math.min(i, this.f4658c);
    }

    /* renamed from: a */
    public void mo5064a(int i, int i2, Object obj) {
        if (this.f4657b != 3 || i > this.f4658c + this.f4659d || i + i2 < this.f4658c || this.f4660e != obj) {
            mo5062a();
            this.f4658c = i;
            this.f4659d = i2;
            this.f4660e = obj;
            this.f4657b = 3;
            return;
        }
        int i3 = this.f4658c + this.f4659d;
        this.f4658c = Math.min(i, this.f4658c);
        this.f4659d = Math.max(i3, i + i2) - this.f4658c;
    }

    /* renamed from: b */
    public void mo5065b(int i, int i2) {
        if (this.f4657b != 2 || this.f4658c < i || this.f4658c > i + i2) {
            mo5062a();
            this.f4658c = i;
            this.f4659d = i2;
            this.f4657b = 2;
            return;
        }
        this.f4659d += i2;
        this.f4658c = i;
    }

    /* renamed from: c */
    public void mo5066c(int i, int i2) {
        mo5062a();
        this.f4656a.mo5066c(i, i2);
    }
}
