package android.support.p036v7.p045g;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

/* renamed from: android.support.v7.g.f */
public class C1513f<T> {

    /* renamed from: a */
    public static final int f4721a = -1;

    /* renamed from: c */
    private static final int f4722c = 10;

    /* renamed from: d */
    private static final int f4723d = 10;

    /* renamed from: e */
    private static final int f4724e = 1;

    /* renamed from: f */
    private static final int f4725f = 2;

    /* renamed from: g */
    private static final int f4726g = 4;

    /* renamed from: b */
    T[] f4727b;

    /* renamed from: h */
    private T[] f4728h;

    /* renamed from: i */
    private int f4729i;

    /* renamed from: j */
    private int f4730j;

    /* renamed from: k */
    private int f4731k;

    /* renamed from: l */
    private C1515b f4732l;

    /* renamed from: m */
    private C1514a f4733m;

    /* renamed from: n */
    private int f4734n;

    /* renamed from: o */
    private final Class<T> f4735o;

    /* renamed from: android.support.v7.g.f$a */
    public static class C1514a<T2> extends C1515b<T2> {

        /* renamed from: a */
        final C1515b<T2> f4736a;

        /* renamed from: b */
        private final C1496b f4737b = new C1496b(this.f4736a);

        public C1514a(C1515b<T2> bVar) {
            this.f4736a = bVar;
        }

        /* renamed from: a */
        public void mo5100a() {
            this.f4737b.mo5062a();
        }

        /* renamed from: a */
        public void mo5063a(int i, int i2) {
            this.f4737b.mo5063a(i, i2);
        }

        /* renamed from: a */
        public boolean mo5101a(T2 t2, T2 t22) {
            return this.f4736a.mo5101a(t2, t22);
        }

        /* renamed from: b */
        public void mo5065b(int i, int i2) {
            this.f4737b.mo5065b(i, i2);
        }

        /* renamed from: b */
        public boolean mo5102b(T2 t2, T2 t22) {
            return this.f4736a.mo5102b(t2, t22);
        }

        /* renamed from: c */
        public void mo5066c(int i, int i2) {
            this.f4737b.mo5066c(i, i2);
        }

        public int compare(T2 t2, T2 t22) {
            return this.f4736a.compare(t2, t22);
        }

        /* renamed from: d */
        public void mo5104d(int i, int i2) {
            this.f4737b.mo5064a(i, i2, (Object) null);
        }
    }

    /* renamed from: android.support.v7.g.f$b */
    public static abstract class C1515b<T2> implements C1505d, Comparator<T2> {
        /* renamed from: a */
        public void mo5064a(int i, int i2, Object obj) {
            mo5104d(i, i2);
        }

        /* renamed from: a */
        public abstract boolean mo5101a(T2 t2, T2 t22);

        /* renamed from: b */
        public abstract boolean mo5102b(T2 t2, T2 t22);

        public abstract int compare(T2 t2, T2 t22);

        /* renamed from: d */
        public abstract void mo5104d(int i, int i2);
    }

    public C1513f(Class<T> cls, C1515b<T> bVar) {
        this(cls, bVar, 10);
    }

    public C1513f(Class<T> cls, C1515b<T> bVar, int i) {
        this.f4735o = cls;
        this.f4727b = (Object[]) Array.newInstance(cls, i);
        this.f4732l = bVar;
        this.f4734n = 0;
    }

    /* renamed from: a */
    private int m8817a(T t, int i, int i2, int i3) {
        int i4 = i - 1;
        while (i4 >= i2) {
            T t2 = this.f4727b[i4];
            if (this.f4732l.compare(t2, t) != 0) {
                break;
            } else if (this.f4732l.mo5102b(t2, t)) {
                return i4;
            } else {
                i4--;
            }
        }
        int i5 = i + 1;
        while (i5 < i3) {
            T t3 = this.f4727b[i5];
            if (this.f4732l.compare(t3, t) != 0) {
                break;
            } else if (this.f4732l.mo5102b(t3, t)) {
                return i5;
            } else {
                i5++;
            }
        }
        return -1;
    }

    /* renamed from: a */
    private int m8818a(T t, boolean z) {
        int i = 0;
        int a = m8820a(t, this.f4727b, 0, this.f4734n, 1);
        if (a != -1) {
            if (a < this.f4734n) {
                T t2 = this.f4727b[a];
                if (this.f4732l.mo5102b(t2, t)) {
                    if (this.f4732l.mo5101a(t2, t)) {
                        this.f4727b[a] = t;
                        return a;
                    }
                    this.f4727b[a] = t;
                    this.f4732l.mo5104d(a, 1);
                    return a;
                }
            }
            i = a;
        }
        m8823b(i, t);
        if (z) {
            this.f4732l.mo5063a(i, 1);
        }
        return i;
    }

    /* renamed from: a */
    private int m8819a(T t, T[] tArr, int i, int i2) {
        for (int i3 = i; i3 < i2; i3++) {
            if (this.f4732l.mo5102b(tArr[i3], t)) {
                return i3;
            }
        }
        return -1;
    }

    /* renamed from: a */
    private int m8820a(T t, T[] tArr, int i, int i2, int i3) {
        int i4;
        int i5 = i2;
        int i6 = i;
        while (i6 < i5) {
            int i7 = (i6 + i5) / 2;
            T t2 = tArr[i7];
            int compare = this.f4732l.compare(t2, t);
            if (compare < 0) {
                int i8 = i5;
                i4 = i7 + 1;
                i7 = i8;
            } else if (compare != 0) {
                i4 = i6;
            } else if (this.f4732l.mo5102b(t2, t)) {
                return i7;
            } else {
                int a = m8817a(t, i7, i6, i5);
                return i3 == 1 ? a != -1 ? a : i7 : a;
            }
            i6 = i4;
            i5 = i7;
        }
        if (i3 != 1) {
            i6 = -1;
        }
        return i6;
    }

    /* renamed from: a */
    private void m8821a(int i, boolean z) {
        System.arraycopy(this.f4727b, i + 1, this.f4727b, i, (this.f4734n - i) - 1);
        this.f4734n--;
        this.f4727b[this.f4734n] = null;
        if (z) {
            this.f4732l.mo5065b(i, 1);
        }
    }

    /* renamed from: a */
    private void m8822a(T[] tArr, int i) {
        this.f4727b = (Object[]) Array.newInstance(this.f4735o, this.f4734n + i + 10);
        this.f4731k = 0;
        int i2 = 0;
        while (true) {
            if (this.f4729i >= this.f4730j && i2 >= i) {
                return;
            }
            if (this.f4729i == this.f4730j) {
                int i3 = i - i2;
                System.arraycopy(tArr, i2, this.f4727b, this.f4731k, i3);
                this.f4731k += i3;
                this.f4734n += i3;
                this.f4732l.mo5063a(this.f4731k - i3, i3);
                return;
            } else if (i2 == i) {
                int i4 = this.f4730j - this.f4729i;
                System.arraycopy(this.f4728h, this.f4729i, this.f4727b, this.f4731k, i4);
                this.f4731k = i4 + this.f4731k;
                return;
            } else {
                T t = this.f4728h[this.f4729i];
                T t2 = tArr[i2];
                int compare = this.f4732l.compare(t, t2);
                if (compare > 0) {
                    T[] tArr2 = this.f4727b;
                    int i5 = this.f4731k;
                    this.f4731k = i5 + 1;
                    tArr2[i5] = t2;
                    this.f4734n++;
                    i2++;
                    this.f4732l.mo5063a(this.f4731k - 1, 1);
                } else if (compare != 0 || !this.f4732l.mo5102b(t, t2)) {
                    T[] tArr3 = this.f4727b;
                    int i6 = this.f4731k;
                    this.f4731k = i6 + 1;
                    tArr3[i6] = t;
                    this.f4729i++;
                } else {
                    T[] tArr4 = this.f4727b;
                    int i7 = this.f4731k;
                    this.f4731k = i7 + 1;
                    tArr4[i7] = t2;
                    i2++;
                    this.f4729i++;
                    if (!this.f4732l.mo5101a(t, t2)) {
                        this.f4732l.mo5104d(this.f4731k - 1, 1);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    private void m8823b(int i, T t) {
        if (i > this.f4734n) {
            throw new IndexOutOfBoundsException("cannot add item to " + i + " because size is " + this.f4734n);
        }
        if (this.f4734n == this.f4727b.length) {
            T[] tArr = (Object[]) Array.newInstance(this.f4735o, this.f4727b.length + 10);
            System.arraycopy(this.f4727b, 0, tArr, 0, i);
            tArr[i] = t;
            System.arraycopy(this.f4727b, i, tArr, i + 1, this.f4734n - i);
            this.f4727b = tArr;
        } else {
            System.arraycopy(this.f4727b, i, this.f4727b, i + 1, this.f4734n - i);
            this.f4727b[i] = t;
        }
        this.f4734n++;
    }

    /* renamed from: b */
    private void m8824b(T[] tArr) {
        boolean z = !(this.f4732l instanceof C1514a);
        if (z) {
            mo5093b();
        }
        this.f4728h = this.f4727b;
        this.f4729i = 0;
        this.f4730j = this.f4734n;
        Arrays.sort(tArr, this.f4732l);
        int c = m8826c(tArr);
        if (this.f4734n == 0) {
            this.f4727b = tArr;
            this.f4734n = c;
            this.f4731k = c;
            this.f4732l.mo5063a(0, c);
        } else {
            m8822a(tArr, c);
        }
        this.f4728h = null;
        if (z) {
            mo5098c();
        }
    }

    /* renamed from: b */
    private boolean m8825b(T t, boolean z) {
        int a = m8820a(t, this.f4727b, 0, this.f4734n, 2);
        if (a == -1) {
            return false;
        }
        m8821a(a, z);
        return true;
    }

    /* renamed from: c */
    private int m8826c(T[] tArr) {
        if (tArr.length == 0) {
            throw new IllegalArgumentException("Input array must be non-empty");
        }
        int i = 0;
        int i2 = 1;
        for (int i3 = 1; i3 < tArr.length; i3++) {
            T t = tArr[i3];
            int compare = this.f4732l.compare(tArr[i], t);
            if (compare > 0) {
                throw new IllegalArgumentException("Input must be sorted in ascending order.");
            }
            if (compare == 0) {
                int a = m8819a(t, tArr, i, i2);
                if (a != -1) {
                    tArr[a] = t;
                } else {
                    if (i2 != i3) {
                        tArr[i2] = t;
                    }
                    i2++;
                }
            } else {
                if (i2 != i3) {
                    tArr[i2] = t;
                }
                i = i2;
                i2++;
            }
        }
        return i2;
    }

    /* renamed from: e */
    private void m8827e() {
        if (this.f4728h != null) {
            throw new IllegalStateException("Cannot call this method from within addAll");
        }
    }

    /* renamed from: a */
    public int mo5086a() {
        return this.f4734n;
    }

    /* renamed from: a */
    public int mo5087a(T t) {
        m8827e();
        return m8818a(t, true);
    }

    /* renamed from: a */
    public T mo5088a(int i) {
        m8827e();
        T c = mo5097c(i);
        m8821a(i, true);
        return c;
    }

    /* renamed from: a */
    public void mo5089a(int i, T t) {
        m8827e();
        T c = mo5097c(i);
        boolean z = c == t || !this.f4732l.mo5101a(c, t);
        if (c == t || this.f4732l.compare(c, t) != 0) {
            if (z) {
                this.f4732l.mo5104d(i, 1);
            }
            m8821a(i, false);
            int a = m8818a(t, false);
            if (i != a) {
                this.f4732l.mo5066c(i, a);
                return;
            }
            return;
        }
        this.f4727b[i] = t;
        if (z) {
            this.f4732l.mo5104d(i, 1);
        }
    }

    /* renamed from: a */
    public void mo5090a(Collection<T> collection) {
        mo5092a((T[]) collection.toArray((Object[]) Array.newInstance(this.f4735o, collection.size())), true);
    }

    /* renamed from: a */
    public void mo5091a(T... tArr) {
        mo5092a(tArr, false);
    }

    /* renamed from: a */
    public void mo5092a(T[] tArr, boolean z) {
        m8827e();
        if (tArr.length != 0) {
            if (z) {
                m8824b(tArr);
                return;
            }
            Object[] objArr = (Object[]) Array.newInstance(this.f4735o, tArr.length);
            System.arraycopy(tArr, 0, objArr, 0, tArr.length);
            m8824b((T[]) objArr);
        }
    }

    /* renamed from: b */
    public void mo5093b() {
        m8827e();
        if (!(this.f4732l instanceof C1514a)) {
            if (this.f4733m == null) {
                this.f4733m = new C1514a(this.f4732l);
            }
            this.f4732l = this.f4733m;
        }
    }

    /* renamed from: b */
    public void mo5094b(int i) {
        m8827e();
        Object c = mo5097c(i);
        m8821a(i, false);
        int a = m8818a(c, false);
        if (i != a) {
            this.f4732l.mo5066c(i, a);
        }
    }

    /* renamed from: b */
    public boolean mo5095b(T t) {
        m8827e();
        return m8825b(t, true);
    }

    /* renamed from: c */
    public int mo5096c(T t) {
        if (this.f4728h != null) {
            int a = m8820a(t, this.f4727b, 0, this.f4731k, 4);
            if (a != -1) {
                return a;
            }
            int a2 = m8820a(t, this.f4728h, this.f4729i, this.f4730j, 4);
            if (a2 != -1) {
                return (a2 - this.f4729i) + this.f4731k;
            }
            return -1;
        }
        return m8820a(t, this.f4727b, 0, this.f4734n, 4);
    }

    /* renamed from: c */
    public T mo5097c(int i) {
        if (i < this.f4734n && i >= 0) {
            return (this.f4728h == null || i < this.f4731k) ? this.f4727b[i] : this.f4728h[(i - this.f4731k) + this.f4729i];
        }
        throw new IndexOutOfBoundsException("Asked to get item at " + i + " but size is " + this.f4734n);
    }

    /* renamed from: c */
    public void mo5098c() {
        m8827e();
        if (this.f4732l instanceof C1514a) {
            ((C1514a) this.f4732l).mo5100a();
        }
        if (this.f4732l == this.f4733m) {
            this.f4732l = this.f4733m.f4736a;
        }
    }

    /* renamed from: d */
    public void mo5099d() {
        m8827e();
        if (this.f4734n != 0) {
            int i = this.f4734n;
            Arrays.fill(this.f4727b, 0, i, (Object) null);
            this.f4734n = 0;
            this.f4732l.mo5065b(0, i);
        }
    }
}
