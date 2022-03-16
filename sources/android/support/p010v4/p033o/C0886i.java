package android.support.p010v4.p033o;

/* renamed from: android.support.v4.o.i */
public class C0886i<E> implements Cloneable {

    /* renamed from: a */
    private static final Object f3053a = new Object();

    /* renamed from: b */
    private boolean f3054b;

    /* renamed from: c */
    private long[] f3055c;

    /* renamed from: d */
    private Object[] f3056d;

    /* renamed from: e */
    private int f3057e;

    public C0886i() {
        this(10);
    }

    public C0886i(int i) {
        this.f3054b = false;
        if (i == 0) {
            this.f3055c = C0883f.f3049b;
            this.f3056d = C0883f.f3050c;
        } else {
            int b = C0883f.m4426b(i);
            this.f3055c = new long[b];
            this.f3056d = new Object[b];
        }
        this.f3057e = 0;
    }

    /* renamed from: d */
    private void m4430d() {
        int i = this.f3057e;
        long[] jArr = this.f3055c;
        Object[] objArr = this.f3056d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f3053a) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f3054b = false;
        this.f3057e = i2;
    }

    /* renamed from: a */
    public int mo2858a(E e) {
        if (this.f3054b) {
            m4430d();
        }
        for (int i = 0; i < this.f3057e; i++) {
            if (this.f3056d[i] == e) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public C0886i<E> clone() {
        try {
            C0886i<E> iVar = (C0886i) super.clone();
            try {
                iVar.f3055c = (long[]) this.f3055c.clone();
                iVar.f3056d = (Object[]) this.f3056d.clone();
                return iVar;
            } catch (CloneNotSupportedException e) {
                return iVar;
            }
        } catch (CloneNotSupportedException e2) {
            return null;
        }
    }

    /* renamed from: a */
    public E mo2860a(long j) {
        return mo2861a(j, (Object) null);
    }

    /* renamed from: a */
    public E mo2861a(long j, E e) {
        int a = C0883f.m4424a(this.f3055c, this.f3057e, j);
        return (a < 0 || this.f3056d[a] == f3053a) ? e : this.f3056d[a];
    }

    /* renamed from: a */
    public void mo2862a(int i) {
        if (this.f3056d[i] != f3053a) {
            this.f3056d[i] = f3053a;
            this.f3054b = true;
        }
    }

    /* renamed from: a */
    public void mo2863a(int i, E e) {
        if (this.f3054b) {
            m4430d();
        }
        this.f3056d[i] = e;
    }

    /* renamed from: b */
    public int mo2864b() {
        if (this.f3054b) {
            m4430d();
        }
        return this.f3057e;
    }

    /* renamed from: b */
    public long mo2865b(int i) {
        if (this.f3054b) {
            m4430d();
        }
        return this.f3055c[i];
    }

    /* renamed from: b */
    public void mo2866b(long j) {
        int a = C0883f.m4424a(this.f3055c, this.f3057e, j);
        if (a >= 0 && this.f3056d[a] != f3053a) {
            this.f3056d[a] = f3053a;
            this.f3054b = true;
        }
    }

    /* renamed from: b */
    public void mo2867b(long j, E e) {
        int a = C0883f.m4424a(this.f3055c, this.f3057e, j);
        if (a >= 0) {
            this.f3056d[a] = e;
            return;
        }
        int i = a ^ -1;
        if (i >= this.f3057e || this.f3056d[i] != f3053a) {
            if (this.f3054b && this.f3057e >= this.f3055c.length) {
                m4430d();
                i = C0883f.m4424a(this.f3055c, this.f3057e, j) ^ -1;
            }
            if (this.f3057e >= this.f3055c.length) {
                int b = C0883f.m4426b(this.f3057e + 1);
                long[] jArr = new long[b];
                Object[] objArr = new Object[b];
                System.arraycopy(this.f3055c, 0, jArr, 0, this.f3055c.length);
                System.arraycopy(this.f3056d, 0, objArr, 0, this.f3056d.length);
                this.f3055c = jArr;
                this.f3056d = objArr;
            }
            if (this.f3057e - i != 0) {
                System.arraycopy(this.f3055c, i, this.f3055c, i + 1, this.f3057e - i);
                System.arraycopy(this.f3056d, i, this.f3056d, i + 1, this.f3057e - i);
            }
            this.f3055c[i] = j;
            this.f3056d[i] = e;
            this.f3057e++;
            return;
        }
        this.f3055c[i] = j;
        this.f3056d[i] = e;
    }

    /* renamed from: c */
    public E mo2868c(int i) {
        if (this.f3054b) {
            m4430d();
        }
        return this.f3056d[i];
    }

    /* renamed from: c */
    public void mo2869c() {
        int i = this.f3057e;
        Object[] objArr = this.f3056d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f3057e = 0;
        this.f3054b = false;
    }

    /* renamed from: c */
    public void mo2870c(long j) {
        mo2866b(j);
    }

    /* renamed from: c */
    public void mo2871c(long j, E e) {
        if (this.f3057e == 0 || j > this.f3055c[this.f3057e - 1]) {
            if (this.f3054b && this.f3057e >= this.f3055c.length) {
                m4430d();
            }
            int i = this.f3057e;
            if (i >= this.f3055c.length) {
                int b = C0883f.m4426b(i + 1);
                long[] jArr = new long[b];
                Object[] objArr = new Object[b];
                System.arraycopy(this.f3055c, 0, jArr, 0, this.f3055c.length);
                System.arraycopy(this.f3056d, 0, objArr, 0, this.f3056d.length);
                this.f3055c = jArr;
                this.f3056d = objArr;
            }
            this.f3055c[i] = j;
            this.f3056d[i] = e;
            this.f3057e = i + 1;
            return;
        }
        mo2867b(j, e);
    }

    /* renamed from: d */
    public int mo2873d(long j) {
        if (this.f3054b) {
            m4430d();
        }
        return C0883f.m4424a(this.f3055c, this.f3057e, j);
    }

    public String toString() {
        if (mo2864b() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f3057e * 28);
        sb.append('{');
        for (int i = 0; i < this.f3057e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(mo2865b(i));
            sb.append('=');
            Object c = mo2868c(i);
            if (c != this) {
                sb.append(c);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
