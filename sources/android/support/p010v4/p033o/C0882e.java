package android.support.p010v4.p033o;

/* renamed from: android.support.v4.o.e */
public final class C0882e {

    /* renamed from: a */
    private int[] f3044a;

    /* renamed from: b */
    private int f3045b;

    /* renamed from: c */
    private int f3046c;

    /* renamed from: d */
    private int f3047d;

    public C0882e() {
        this(8);
    }

    public C0882e(int i) {
        if (i < 1) {
            throw new IllegalArgumentException("capacity must be >= 1");
        } else if (i > 1073741824) {
            throw new IllegalArgumentException("capacity must be <= 2^30");
        } else {
            i = Integer.bitCount(i) != 1 ? Integer.highestOneBit(i - 1) << 1 : i;
            this.f3047d = i - 1;
            this.f3044a = new int[i];
        }
    }

    /* renamed from: h */
    private void m4409h() {
        int length = this.f3044a.length;
        int i = length - this.f3045b;
        int i2 = length << 1;
        if (i2 < 0) {
            throw new RuntimeException("Max array capacity exceeded");
        }
        int[] iArr = new int[i2];
        System.arraycopy(this.f3044a, this.f3045b, iArr, 0, i);
        System.arraycopy(this.f3044a, 0, iArr, i, this.f3045b);
        this.f3044a = iArr;
        this.f3045b = 0;
        this.f3046c = length;
        this.f3047d = i2 - 1;
    }

    /* renamed from: a */
    public int mo2843a() {
        if (this.f3045b == this.f3046c) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i = this.f3044a[this.f3045b];
        this.f3045b = (this.f3045b + 1) & this.f3047d;
        return i;
    }

    /* renamed from: a */
    public void mo2844a(int i) {
        this.f3045b = (this.f3045b - 1) & this.f3047d;
        this.f3044a[this.f3045b] = i;
        if (this.f3045b == this.f3046c) {
            m4409h();
        }
    }

    /* renamed from: b */
    public int mo2845b() {
        if (this.f3045b == this.f3046c) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i = (this.f3046c - 1) & this.f3047d;
        int i2 = this.f3044a[i];
        this.f3046c = i;
        return i2;
    }

    /* renamed from: b */
    public void mo2846b(int i) {
        this.f3044a[this.f3046c] = i;
        this.f3046c = (this.f3046c + 1) & this.f3047d;
        if (this.f3046c == this.f3045b) {
            m4409h();
        }
    }

    /* renamed from: c */
    public void mo2847c() {
        this.f3046c = this.f3045b;
    }

    /* renamed from: c */
    public void mo2848c(int i) {
        if (i > 0) {
            if (i > mo2853f()) {
                throw new ArrayIndexOutOfBoundsException();
            }
            this.f3045b = (this.f3045b + i) & this.f3047d;
        }
    }

    /* renamed from: d */
    public int mo2849d() {
        if (this.f3045b != this.f3046c) {
            return this.f3044a[this.f3045b];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    /* renamed from: d */
    public void mo2850d(int i) {
        if (i > 0) {
            if (i > mo2853f()) {
                throw new ArrayIndexOutOfBoundsException();
            }
            this.f3046c = (this.f3046c - i) & this.f3047d;
        }
    }

    /* renamed from: e */
    public int mo2851e() {
        if (this.f3045b != this.f3046c) {
            return this.f3044a[(this.f3046c - 1) & this.f3047d];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    /* renamed from: e */
    public int mo2852e(int i) {
        if (i >= 0 && i < mo2853f()) {
            return this.f3044a[(this.f3045b + i) & this.f3047d];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    /* renamed from: f */
    public int mo2853f() {
        return (this.f3046c - this.f3045b) & this.f3047d;
    }

    /* renamed from: g */
    public boolean mo2854g() {
        return this.f3045b == this.f3046c;
    }
}
