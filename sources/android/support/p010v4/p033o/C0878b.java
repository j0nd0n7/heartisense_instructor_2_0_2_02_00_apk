package android.support.p010v4.p033o;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: android.support.v4.o.b */
public final class C0878b<E> implements Collection<E>, Set<E> {

    /* renamed from: a */
    static Object[] f3022a = null;

    /* renamed from: b */
    static int f3023b = 0;

    /* renamed from: c */
    static Object[] f3024c = null;

    /* renamed from: d */
    static int f3025d = 0;

    /* renamed from: j */
    private static final boolean f3026j = false;

    /* renamed from: k */
    private static final String f3027k = "ArraySet";

    /* renamed from: l */
    private static final int[] f3028l = new int[0];

    /* renamed from: m */
    private static final Object[] f3029m = new Object[0];

    /* renamed from: n */
    private static final int f3030n = 4;

    /* renamed from: o */
    private static final int f3031o = 10;

    /* renamed from: e */
    final boolean f3032e;

    /* renamed from: f */
    int[] f3033f;

    /* renamed from: g */
    Object[] f3034g;

    /* renamed from: h */
    int f3035h;

    /* renamed from: i */
    C0888k<E, E> f3036i;

    public C0878b() {
        this(0, false);
    }

    public C0878b(int i) {
        this(i, false);
    }

    public C0878b(int i, boolean z) {
        this.f3032e = z;
        if (i == 0) {
            this.f3033f = f3028l;
            this.f3034g = f3029m;
        } else {
            m4371d(i);
        }
        this.f3035h = 0;
    }

    public C0878b(C0878b<E> bVar) {
        this();
        if (bVar != null) {
            mo2803a(bVar);
        }
    }

    public C0878b(Collection<E> collection) {
        this();
        if (collection != null) {
            addAll(collection);
        }
    }

    /* renamed from: a */
    private int m4367a() {
        int i = this.f3035h;
        if (i == 0) {
            return -1;
        }
        int a = C0883f.m4423a(this.f3033f, i, 0);
        if (a < 0 || this.f3034g[a] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.f3033f[i2] == 0) {
            if (this.f3034g[i2] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = a - 1;
        while (i3 >= 0 && this.f3033f[i3] == 0) {
            if (this.f3034g[i3] == null) {
                return i3;
            }
            i3--;
        }
        return i2 ^ -1;
    }

    /* renamed from: a */
    private int m4368a(Object obj, int i) {
        int i2 = this.f3035h;
        if (i2 == 0) {
            return -1;
        }
        int a = C0883f.m4423a(this.f3033f, i2, i);
        if (a < 0 || obj.equals(this.f3034g[a])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.f3033f[i3] == i) {
            if (obj.equals(this.f3034g[i3])) {
                return i3;
            }
            i3++;
        }
        int i4 = a - 1;
        while (i4 >= 0 && this.f3033f[i4] == i) {
            if (obj.equals(this.f3034g[i4])) {
                return i4;
            }
            i4--;
        }
        return i3 ^ -1;
    }

    /* renamed from: a */
    private static void m4369a(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C0878b.class) {
                if (f3025d < 10) {
                    objArr[0] = f3024c;
                    objArr[1] = iArr;
                    for (int i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f3024c = objArr;
                    f3025d++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (C0878b.class) {
                if (f3023b < 10) {
                    objArr[0] = f3022a;
                    objArr[1] = iArr;
                    for (int i3 = i - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f3022a = objArr;
                    f3023b++;
                }
            }
        }
    }

    /* renamed from: b */
    private C0888k<E, E> m4370b() {
        if (this.f3036i == null) {
            this.f3036i = new C0888k<E, E>() {
                /* access modifiers changed from: protected */
                /* renamed from: a */
                public int mo2792a() {
                    return C0878b.this.f3035h;
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public int mo2793a(Object obj) {
                    return C0878b.this.mo2801a(obj);
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public Object mo2794a(int i, int i2) {
                    return C0878b.this.f3034g[i];
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public E mo2795a(int i, E e) {
                    throw new UnsupportedOperationException("not a map");
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public void mo2796a(int i) {
                    C0878b.this.mo2809c(i);
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public void mo2797a(E e, E e2) {
                    C0878b.this.add(e);
                }

                /* access modifiers changed from: protected */
                /* renamed from: b */
                public int mo2798b(Object obj) {
                    return C0878b.this.mo2801a(obj);
                }

                /* access modifiers changed from: protected */
                /* renamed from: b */
                public Map<E, E> mo2799b() {
                    throw new UnsupportedOperationException("not a map");
                }

                /* access modifiers changed from: protected */
                /* renamed from: c */
                public void mo2800c() {
                    C0878b.this.clear();
                }
            };
        }
        return this.f3036i;
    }

    /* renamed from: d */
    private void m4371d(int i) {
        if (i == 8) {
            synchronized (C0878b.class) {
                if (f3024c != null) {
                    Object[] objArr = f3024c;
                    this.f3034g = objArr;
                    f3024c = (Object[]) objArr[0];
                    this.f3033f = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f3025d--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C0878b.class) {
                if (f3022a != null) {
                    Object[] objArr2 = f3022a;
                    this.f3034g = objArr2;
                    f3022a = (Object[]) objArr2[0];
                    this.f3033f = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f3023b--;
                    return;
                }
            }
        }
        this.f3033f = new int[i];
        this.f3034g = new Object[i];
    }

    /* renamed from: a */
    public int mo2801a(Object obj) {
        if (obj == null) {
            return m4367a();
        }
        return m4368a(obj, this.f3032e ? System.identityHashCode(obj) : obj.hashCode());
    }

    /* renamed from: a */
    public void mo2802a(int i) {
        if (this.f3033f.length < i) {
            int[] iArr = this.f3033f;
            Object[] objArr = this.f3034g;
            m4371d(i);
            if (this.f3035h > 0) {
                System.arraycopy(iArr, 0, this.f3033f, 0, this.f3035h);
                System.arraycopy(objArr, 0, this.f3034g, 0, this.f3035h);
            }
            m4369a(iArr, objArr, this.f3035h);
        }
    }

    /* renamed from: a */
    public void mo2803a(C0878b<? extends E> bVar) {
        int i = bVar.f3035h;
        mo2802a(this.f3035h + i);
        if (this.f3035h != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                add(bVar.mo2806b(i2));
            }
        } else if (i > 0) {
            System.arraycopy(bVar.f3033f, 0, this.f3033f, 0, i);
            System.arraycopy(bVar.f3034g, 0, this.f3034g, 0, i);
            this.f3035h = i;
        }
    }

    public boolean add(E e) {
        int i;
        int a;
        if (e == null) {
            a = m4367a();
            i = 0;
        } else {
            int identityHashCode = this.f3032e ? System.identityHashCode(e) : e.hashCode();
            i = identityHashCode;
            a = m4368a(e, identityHashCode);
        }
        if (a >= 0) {
            return false;
        }
        int i2 = a ^ -1;
        if (this.f3035h >= this.f3033f.length) {
            int i3 = this.f3035h >= 8 ? this.f3035h + (this.f3035h >> 1) : this.f3035h >= 4 ? 8 : 4;
            int[] iArr = this.f3033f;
            Object[] objArr = this.f3034g;
            m4371d(i3);
            if (this.f3033f.length > 0) {
                System.arraycopy(iArr, 0, this.f3033f, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f3034g, 0, objArr.length);
            }
            m4369a(iArr, objArr, this.f3035h);
        }
        if (i2 < this.f3035h) {
            System.arraycopy(this.f3033f, i2, this.f3033f, i2 + 1, this.f3035h - i2);
            System.arraycopy(this.f3034g, i2, this.f3034g, i2 + 1, this.f3035h - i2);
        }
        this.f3033f[i2] = i;
        this.f3034g[i2] = e;
        this.f3035h++;
        return true;
    }

    public boolean addAll(Collection<? extends E> collection) {
        mo2802a(this.f3035h + collection.size());
        boolean z = false;
        for (Object add : collection) {
            z |= add(add);
        }
        return z;
    }

    /* renamed from: b */
    public E mo2806b(int i) {
        return this.f3034g[i];
    }

    /* renamed from: b */
    public void mo2807b(E e) {
        int i = this.f3035h;
        int identityHashCode = e == null ? 0 : this.f3032e ? System.identityHashCode(e) : e.hashCode();
        if (i >= this.f3033f.length) {
            throw new IllegalStateException("Array is full");
        } else if (i <= 0 || this.f3033f[i - 1] <= identityHashCode) {
            this.f3035h = i + 1;
            this.f3033f[i] = identityHashCode;
            this.f3034g[i] = e;
        } else {
            add(e);
        }
    }

    /* renamed from: b */
    public boolean mo2808b(C0878b<? extends E> bVar) {
        int i = bVar.f3035h;
        int i2 = this.f3035h;
        for (int i3 = 0; i3 < i; i3++) {
            remove(bVar.mo2806b(i3));
        }
        return i2 != this.f3035h;
    }

    /* renamed from: c */
    public E mo2809c(int i) {
        int i2 = 8;
        E e = this.f3034g[i];
        if (this.f3035h <= 1) {
            m4369a(this.f3033f, this.f3034g, this.f3035h);
            this.f3033f = f3028l;
            this.f3034g = f3029m;
            this.f3035h = 0;
        } else if (this.f3033f.length <= 8 || this.f3035h >= this.f3033f.length / 3) {
            this.f3035h--;
            if (i < this.f3035h) {
                System.arraycopy(this.f3033f, i + 1, this.f3033f, i, this.f3035h - i);
                System.arraycopy(this.f3034g, i + 1, this.f3034g, i, this.f3035h - i);
            }
            this.f3034g[this.f3035h] = null;
        } else {
            if (this.f3035h > 8) {
                i2 = this.f3035h + (this.f3035h >> 1);
            }
            int[] iArr = this.f3033f;
            Object[] objArr = this.f3034g;
            m4371d(i2);
            this.f3035h--;
            if (i > 0) {
                System.arraycopy(iArr, 0, this.f3033f, 0, i);
                System.arraycopy(objArr, 0, this.f3034g, 0, i);
            }
            if (i < this.f3035h) {
                System.arraycopy(iArr, i + 1, this.f3033f, i, this.f3035h - i);
                System.arraycopy(objArr, i + 1, this.f3034g, i, this.f3035h - i);
            }
        }
        return e;
    }

    public void clear() {
        if (this.f3035h != 0) {
            m4369a(this.f3033f, this.f3034g, this.f3035h);
            this.f3033f = f3028l;
            this.f3034g = f3029m;
            this.f3035h = 0;
        }
    }

    public boolean contains(Object obj) {
        return mo2801a(obj) >= 0;
    }

    public boolean containsAll(Collection<?> collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (size() != set.size()) {
            return false;
        }
        int i = 0;
        while (i < this.f3035h) {
            try {
                if (!set.contains(mo2806b(i))) {
                    return false;
                }
                i++;
            } catch (NullPointerException e) {
                return false;
            } catch (ClassCastException e2) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int[] iArr = this.f3033f;
        int i = this.f3035h;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    public boolean isEmpty() {
        return this.f3035h <= 0;
    }

    public Iterator<E> iterator() {
        return m4370b().mo2896e().iterator();
    }

    public boolean remove(Object obj) {
        int a = mo2801a(obj);
        if (a < 0) {
            return false;
        }
        mo2809c(a);
        return true;
    }

    public boolean removeAll(Collection<?> collection) {
        boolean z = false;
        for (Object remove : collection) {
            z |= remove(remove);
        }
        return z;
    }

    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i = this.f3035h - 1; i >= 0; i--) {
            if (!collection.contains(this.f3034g[i])) {
                mo2809c(i);
                z = true;
            }
        }
        return z;
    }

    public int size() {
        return this.f3035h;
    }

    public Object[] toArray() {
        Object[] objArr = new Object[this.f3035h];
        System.arraycopy(this.f3034g, 0, objArr, 0, this.f3035h);
        return objArr;
    }

    public <T> T[] toArray(T[] tArr) {
        T[] tArr2 = tArr.length < this.f3035h ? (Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f3035h) : tArr;
        System.arraycopy(this.f3034g, 0, tArr2, 0, this.f3035h);
        if (tArr2.length > this.f3035h) {
            tArr2[this.f3035h] = null;
        }
        return tArr2;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f3035h * 14);
        sb.append('{');
        for (int i = 0; i < this.f3035h; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object b = mo2806b(i);
            if (b != this) {
                sb.append(b);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
