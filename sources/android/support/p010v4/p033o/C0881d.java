package android.support.p010v4.p033o;

/* renamed from: android.support.v4.o.d */
public final class C0881d<E> {

    /* renamed from: a */
    private E[] f3040a;

    /* renamed from: b */
    private int f3041b;

    /* renamed from: c */
    private int f3042c;

    /* renamed from: d */
    private int f3043d;

    public C0881d() {
        this(8);
    }

    public C0881d(int i) {
        if (i < 1) {
            throw new IllegalArgumentException("capacity must be >= 1");
        } else if (i > 1073741824) {
            throw new IllegalArgumentException("capacity must be <= 2^30");
        } else {
            i = Integer.bitCount(i) != 1 ? Integer.highestOneBit(i - 1) << 1 : i;
            this.f3043d = i - 1;
            this.f3040a = (Object[]) new Object[i];
        }
    }

    /* renamed from: h */
    private void m4396h() {
        int length = this.f3040a.length;
        int i = length - this.f3041b;
        int i2 = length << 1;
        if (i2 < 0) {
            throw new RuntimeException("Max array capacity exceeded");
        }
        E[] eArr = new Object[i2];
        System.arraycopy(this.f3040a, this.f3041b, eArr, 0, i);
        System.arraycopy(this.f3040a, 0, eArr, i, this.f3041b);
        this.f3040a = (Object[]) eArr;
        this.f3041b = 0;
        this.f3042c = length;
        this.f3043d = i2 - 1;
    }

    /* renamed from: a */
    public E mo2831a() {
        if (this.f3041b == this.f3042c) {
            throw new ArrayIndexOutOfBoundsException();
        }
        E e = this.f3040a[this.f3041b];
        this.f3040a[this.f3041b] = null;
        this.f3041b = (this.f3041b + 1) & this.f3043d;
        return e;
    }

    /* renamed from: a */
    public void mo2832a(int i) {
        if (i > 0) {
            if (i > mo2841f()) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int length = this.f3040a.length;
            if (i < length - this.f3041b) {
                length = this.f3041b + i;
            }
            for (int i2 = this.f3041b; i2 < length; i2++) {
                this.f3040a[i2] = null;
            }
            int i3 = length - this.f3041b;
            int i4 = i - i3;
            this.f3041b = (i3 + this.f3041b) & this.f3043d;
            if (i4 > 0) {
                for (int i5 = 0; i5 < i4; i5++) {
                    this.f3040a[i5] = null;
                }
                this.f3041b = i4;
            }
        }
    }

    /* renamed from: a */
    public void mo2833a(E e) {
        this.f3041b = (this.f3041b - 1) & this.f3043d;
        this.f3040a[this.f3041b] = e;
        if (this.f3041b == this.f3042c) {
            m4396h();
        }
    }

    /* renamed from: b */
    public E mo2834b() {
        if (this.f3041b == this.f3042c) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i = (this.f3042c - 1) & this.f3043d;
        E e = this.f3040a[i];
        this.f3040a[i] = null;
        this.f3042c = i;
        return e;
    }

    /* renamed from: b */
    public void mo2835b(int i) {
        if (i > 0) {
            if (i > mo2841f()) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i2 = 0;
            if (i < this.f3042c) {
                i2 = this.f3042c - i;
            }
            for (int i3 = i2; i3 < this.f3042c; i3++) {
                this.f3040a[i3] = null;
            }
            int i4 = this.f3042c - i2;
            int i5 = i - i4;
            this.f3042c -= i4;
            if (i5 > 0) {
                this.f3042c = this.f3040a.length;
                int i6 = this.f3042c - i5;
                for (int i7 = i6; i7 < this.f3042c; i7++) {
                    this.f3040a[i7] = null;
                }
                this.f3042c = i6;
            }
        }
    }

    /* renamed from: b */
    public void mo2836b(E e) {
        this.f3040a[this.f3042c] = e;
        this.f3042c = (this.f3042c + 1) & this.f3043d;
        if (this.f3042c == this.f3041b) {
            m4396h();
        }
    }

    /* renamed from: c */
    public E mo2837c(int i) {
        if (i >= 0 && i < mo2841f()) {
            return this.f3040a[(this.f3041b + i) & this.f3043d];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    /* renamed from: c */
    public void mo2838c() {
        mo2832a(mo2841f());
    }

    /* renamed from: d */
    public E mo2839d() {
        if (this.f3041b != this.f3042c) {
            return this.f3040a[this.f3041b];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    /* renamed from: e */
    public E mo2840e() {
        if (this.f3041b != this.f3042c) {
            return this.f3040a[(this.f3042c - 1) & this.f3043d];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    /* renamed from: f */
    public int mo2841f() {
        return (this.f3042c - this.f3041b) & this.f3043d;
    }

    /* renamed from: g */
    public boolean mo2842g() {
        return this.f3041b == this.f3042c;
    }
}
