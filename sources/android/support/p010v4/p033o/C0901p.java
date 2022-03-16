package android.support.p010v4.p033o;

/* renamed from: android.support.v4.o.p */
public class C0901p<E> implements Cloneable {

    /* renamed from: a */
    private static final Object f3125a = new Object();

    /* renamed from: b */
    private boolean f3126b;

    /* renamed from: c */
    private int[] f3127c;

    /* renamed from: d */
    private Object[] f3128d;

    /* renamed from: e */
    private int f3129e;

    public C0901p() {
        this(10);
    }

    public C0901p(int i) {
        this.f3126b = false;
        if (i == 0) {
            this.f3127c = C0883f.f3048a;
            this.f3128d = C0883f.f3050c;
        } else {
            int a = C0883f.m4422a(i);
            this.f3127c = new int[a];
            this.f3128d = new Object[a];
        }
        this.f3129e = 0;
    }

    /* renamed from: d */
    private void m4505d() {
        int i = this.f3129e;
        int[] iArr = this.f3127c;
        Object[] objArr = this.f3128d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f3125a) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f3126b = false;
        this.f3129e = i2;
    }

    /* renamed from: a */
    public int mo2981a(E e) {
        if (this.f3126b) {
            m4505d();
        }
        for (int i = 0; i < this.f3129e; i++) {
            if (this.f3128d[i] == e) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public C0901p<E> clone() {
        try {
            C0901p<E> pVar = (C0901p) super.clone();
            try {
                pVar.f3127c = (int[]) this.f3127c.clone();
                pVar.f3128d = (Object[]) this.f3128d.clone();
                return pVar;
            } catch (CloneNotSupportedException e) {
                return pVar;
            }
        } catch (CloneNotSupportedException e2) {
            return null;
        }
    }

    /* renamed from: a */
    public E mo2983a(int i) {
        return mo2984a(i, (Object) null);
    }

    /* renamed from: a */
    public E mo2984a(int i, E e) {
        int a = C0883f.m4423a(this.f3127c, this.f3129e, i);
        return (a < 0 || this.f3128d[a] == f3125a) ? e : this.f3128d[a];
    }

    /* renamed from: a */
    public void mo2985a(int i, int i2) {
        int min = Math.min(this.f3129e, i + i2);
        while (i < min) {
            mo2993d(i);
            i++;
        }
    }

    /* renamed from: b */
    public int mo2986b() {
        if (this.f3126b) {
            m4505d();
        }
        return this.f3129e;
    }

    /* renamed from: b */
    public void mo2987b(int i) {
        int a = C0883f.m4423a(this.f3127c, this.f3129e, i);
        if (a >= 0 && this.f3128d[a] != f3125a) {
            this.f3128d[a] = f3125a;
            this.f3126b = true;
        }
    }

    /* renamed from: b */
    public void mo2988b(int i, E e) {
        int a = C0883f.m4423a(this.f3127c, this.f3129e, i);
        if (a >= 0) {
            this.f3128d[a] = e;
            return;
        }
        int i2 = a ^ -1;
        if (i2 >= this.f3129e || this.f3128d[i2] != f3125a) {
            if (this.f3126b && this.f3129e >= this.f3127c.length) {
                m4505d();
                i2 = C0883f.m4423a(this.f3127c, this.f3129e, i) ^ -1;
            }
            if (this.f3129e >= this.f3127c.length) {
                int a2 = C0883f.m4422a(this.f3129e + 1);
                int[] iArr = new int[a2];
                Object[] objArr = new Object[a2];
                System.arraycopy(this.f3127c, 0, iArr, 0, this.f3127c.length);
                System.arraycopy(this.f3128d, 0, objArr, 0, this.f3128d.length);
                this.f3127c = iArr;
                this.f3128d = objArr;
            }
            if (this.f3129e - i2 != 0) {
                System.arraycopy(this.f3127c, i2, this.f3127c, i2 + 1, this.f3129e - i2);
                System.arraycopy(this.f3128d, i2, this.f3128d, i2 + 1, this.f3129e - i2);
            }
            this.f3127c[i2] = i;
            this.f3128d[i2] = e;
            this.f3129e++;
            return;
        }
        this.f3127c[i2] = i;
        this.f3128d[i2] = e;
    }

    /* renamed from: c */
    public void mo2989c() {
        int i = this.f3129e;
        Object[] objArr = this.f3128d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f3129e = 0;
        this.f3126b = false;
    }

    /* renamed from: c */
    public void mo2990c(int i) {
        mo2987b(i);
    }

    /* renamed from: c */
    public void mo2991c(int i, E e) {
        if (this.f3126b) {
            m4505d();
        }
        this.f3128d[i] = e;
    }

    /* renamed from: d */
    public void mo2993d(int i) {
        if (this.f3128d[i] != f3125a) {
            this.f3128d[i] = f3125a;
            this.f3126b = true;
        }
    }

    /* renamed from: d */
    public void mo2994d(int i, E e) {
        if (this.f3129e == 0 || i > this.f3127c[this.f3129e - 1]) {
            if (this.f3126b && this.f3129e >= this.f3127c.length) {
                m4505d();
            }
            int i2 = this.f3129e;
            if (i2 >= this.f3127c.length) {
                int a = C0883f.m4422a(i2 + 1);
                int[] iArr = new int[a];
                Object[] objArr = new Object[a];
                System.arraycopy(this.f3127c, 0, iArr, 0, this.f3127c.length);
                System.arraycopy(this.f3128d, 0, objArr, 0, this.f3128d.length);
                this.f3127c = iArr;
                this.f3128d = objArr;
            }
            this.f3127c[i2] = i;
            this.f3128d[i2] = e;
            this.f3129e = i2 + 1;
            return;
        }
        mo2988b(i, e);
    }

    /* renamed from: e */
    public int mo2995e(int i) {
        if (this.f3126b) {
            m4505d();
        }
        return this.f3127c[i];
    }

    /* renamed from: f */
    public E mo2996f(int i) {
        if (this.f3126b) {
            m4505d();
        }
        return this.f3128d[i];
    }

    /* renamed from: g */
    public int mo2997g(int i) {
        if (this.f3126b) {
            m4505d();
        }
        return C0883f.m4423a(this.f3127c, this.f3129e, i);
    }

    public String toString() {
        if (mo2986b() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f3129e * 28);
        sb.append('{');
        for (int i = 0; i < this.f3129e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(mo2995e(i));
            sb.append('=');
            Object f = mo2996f(i);
            if (f != this) {
                sb.append(f);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
