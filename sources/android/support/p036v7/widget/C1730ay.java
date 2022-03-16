package android.support.p036v7.widget;

import java.util.ArrayList;

/* renamed from: android.support.v7.widget.ay */
class C1730ay<E> implements Cloneable {

    /* renamed from: a */
    private static final Object f5823a = new Object();

    /* renamed from: b */
    private boolean f5824b;

    /* renamed from: c */
    private int[] f5825c;

    /* renamed from: d */
    private Object[] f5826d;

    /* renamed from: e */
    private int f5827e;

    /* renamed from: android.support.v7.widget.ay$a */
    static class C1731a {

        /* renamed from: a */
        static final boolean[] f5828a = new boolean[0];

        /* renamed from: b */
        static final int[] f5829b = new int[0];

        /* renamed from: c */
        static final long[] f5830c = new long[0];

        /* renamed from: d */
        static final Object[] f5831d = new Object[0];

        C1731a() {
        }

        /* renamed from: a */
        static int m10386a(int[] iArr, int i, int i2) {
            int i3 = 0;
            int i4 = i - 1;
            while (i3 <= i4) {
                int i5 = (i3 + i4) >>> 1;
                int i6 = iArr[i5];
                if (i6 < i2) {
                    i3 = i5 + 1;
                } else if (i6 <= i2) {
                    return i5;
                } else {
                    i4 = i5 - 1;
                }
            }
            return i3 ^ -1;
        }
    }

    public C1730ay() {
        this(10);
    }

    public C1730ay(int i) {
        this.f5824b = false;
        if (i == 0) {
            this.f5825c = C1731a.f5829b;
            this.f5826d = C1731a.f5831d;
        } else {
            int l = m10364l(i);
            this.f5825c = new int[l];
            this.f5826d = new Object[l];
        }
        this.f5827e = 0;
    }

    /* renamed from: d */
    private void m10359d() {
        int i = this.f5827e;
        int[] iArr = this.f5825c;
        Object[] objArr = this.f5826d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f5823a) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f5824b = false;
        this.f5827e = i2;
    }

    /* renamed from: h */
    static int m10360h(int i) {
        for (int i2 = 4; i2 < 32; i2++) {
            if (i <= (1 << i2) - 12) {
                return (1 << i2) - 12;
            }
        }
        return i;
    }

    /* renamed from: i */
    static int m10361i(int i) {
        return m10360h(i);
    }

    /* renamed from: j */
    static int m10362j(int i) {
        return m10360h(i * 2) / 2;
    }

    /* renamed from: k */
    static int m10363k(int i) {
        return m10360h(i * 2) / 2;
    }

    /* renamed from: l */
    static int m10364l(int i) {
        return m10360h(i * 4) / 4;
    }

    /* renamed from: m */
    static int m10365m(int i) {
        return m10360h(i * 4) / 4;
    }

    /* renamed from: n */
    static int m10366n(int i) {
        return m10360h(i * 4) / 4;
    }

    /* renamed from: o */
    static int m10367o(int i) {
        return m10360h(i * 8) / 8;
    }

    /* renamed from: a */
    public int mo6571a(E e) {
        if (this.f5824b) {
            m10359d();
        }
        for (int i = 0; i < this.f5827e; i++) {
            if (this.f5826d[i] == e) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public C1730ay<E> clone() {
        try {
            C1730ay<E> ayVar = (C1730ay) super.clone();
            try {
                ayVar.f5825c = (int[]) this.f5825c.clone();
                ayVar.f5826d = (Object[]) this.f5826d.clone();
                return ayVar;
            } catch (CloneNotSupportedException e) {
                return ayVar;
            }
        } catch (CloneNotSupportedException e2) {
            return null;
        }
    }

    /* renamed from: a */
    public E mo6573a(int i) {
        return mo6574a(i, (Object) null);
    }

    /* renamed from: a */
    public E mo6574a(int i, E e) {
        int a = C1731a.m10386a(this.f5825c, this.f5827e, i);
        return (a < 0 || this.f5826d[a] == f5823a) ? e : this.f5826d[a];
    }

    /* renamed from: a */
    public void mo6575a(int i, int i2) {
        int min = Math.min(this.f5827e, i + i2);
        while (i < min) {
            mo6585d(i);
            i++;
        }
    }

    /* renamed from: a */
    public void mo6576a(ArrayList<E> arrayList, int i, int i2) {
    }

    /* renamed from: b */
    public int mo6577b() {
        if (this.f5824b) {
            m10359d();
        }
        return this.f5827e;
    }

    /* renamed from: b */
    public void mo6578b(int i) {
        int a = C1731a.m10386a(this.f5825c, this.f5827e, i);
        if (a >= 0 && this.f5826d[a] != f5823a) {
            this.f5826d[a] = f5823a;
            this.f5824b = true;
        }
    }

    /* renamed from: b */
    public void mo6579b(int i, int i2) {
    }

    /* renamed from: b */
    public void mo6580b(int i, E e) {
        int a = C1731a.m10386a(this.f5825c, this.f5827e, i);
        if (a >= 0) {
            this.f5826d[a] = e;
            return;
        }
        int i2 = a ^ -1;
        if (i2 >= this.f5827e || this.f5826d[i2] != f5823a) {
            if (this.f5824b && this.f5827e >= this.f5825c.length) {
                m10359d();
                i2 = C1731a.m10386a(this.f5825c, this.f5827e, i) ^ -1;
            }
            if (this.f5827e >= this.f5825c.length) {
                int l = m10364l(this.f5827e + 1);
                int[] iArr = new int[l];
                Object[] objArr = new Object[l];
                System.arraycopy(this.f5825c, 0, iArr, 0, this.f5825c.length);
                System.arraycopy(this.f5826d, 0, objArr, 0, this.f5826d.length);
                this.f5825c = iArr;
                this.f5826d = objArr;
            }
            if (this.f5827e - i2 != 0) {
                System.arraycopy(this.f5825c, i2, this.f5825c, i2 + 1, this.f5827e - i2);
                System.arraycopy(this.f5826d, i2, this.f5826d, i2 + 1, this.f5827e - i2);
            }
            this.f5825c[i2] = i;
            this.f5826d[i2] = e;
            this.f5827e++;
            return;
        }
        this.f5825c[i2] = i;
        this.f5826d[i2] = e;
    }

    /* renamed from: c */
    public void mo6581c() {
        int i = this.f5827e;
        Object[] objArr = this.f5826d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f5827e = 0;
        this.f5824b = false;
    }

    /* renamed from: c */
    public void mo6582c(int i) {
        mo6578b(i);
    }

    /* renamed from: c */
    public void mo6583c(int i, E e) {
        if (this.f5824b) {
            m10359d();
        }
        this.f5826d[i] = e;
    }

    /* renamed from: d */
    public void mo6585d(int i) {
        if (this.f5826d[i] != f5823a) {
            this.f5826d[i] = f5823a;
            this.f5824b = true;
        }
    }

    /* renamed from: d */
    public void mo6586d(int i, E e) {
        if (this.f5827e == 0 || i > this.f5825c[this.f5827e - 1]) {
            if (this.f5824b && this.f5827e >= this.f5825c.length) {
                m10359d();
            }
            int i2 = this.f5827e;
            if (i2 >= this.f5825c.length) {
                int l = m10364l(i2 + 1);
                int[] iArr = new int[l];
                Object[] objArr = new Object[l];
                System.arraycopy(this.f5825c, 0, iArr, 0, this.f5825c.length);
                System.arraycopy(this.f5826d, 0, objArr, 0, this.f5826d.length);
                this.f5825c = iArr;
                this.f5826d = objArr;
            }
            this.f5825c[i2] = i;
            this.f5826d[i2] = e;
            this.f5827e = i2 + 1;
            return;
        }
        mo6580b(i, e);
    }

    /* renamed from: e */
    public int mo6587e(int i) {
        if (this.f5824b) {
            m10359d();
        }
        return this.f5825c[i];
    }

    /* renamed from: f */
    public E mo6588f(int i) {
        if (this.f5824b) {
            m10359d();
        }
        return this.f5826d[i];
    }

    /* renamed from: g */
    public int mo6589g(int i) {
        if (this.f5824b) {
            m10359d();
        }
        return C1731a.m10386a(this.f5825c, this.f5827e, i);
    }

    public String toString() {
        if (mo6577b() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f5827e * 28);
        sb.append('{');
        for (int i = 0; i < this.f5827e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(mo6587e(i));
            sb.append('=');
            Object f = mo6588f(i);
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
