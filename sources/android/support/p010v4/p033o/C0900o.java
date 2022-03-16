package android.support.p010v4.p033o;

import java.util.Map;

/* renamed from: android.support.v4.o.o */
public class C0900o<K, V> {

    /* renamed from: a */
    private static final boolean f3114a = false;

    /* renamed from: b */
    static Object[] f3115b = null;

    /* renamed from: c */
    static int f3116c = 0;

    /* renamed from: d */
    static Object[] f3117d = null;

    /* renamed from: e */
    static int f3118e = 0;

    /* renamed from: i */
    private static final String f3119i = "ArrayMap";

    /* renamed from: j */
    private static final int f3120j = 4;

    /* renamed from: k */
    private static final int f3121k = 10;

    /* renamed from: f */
    int[] f3122f;

    /* renamed from: g */
    Object[] f3123g;

    /* renamed from: h */
    int f3124h;

    public C0900o() {
        this.f3122f = C0883f.f3048a;
        this.f3123g = C0883f.f3050c;
        this.f3124h = 0;
    }

    public C0900o(int i) {
        if (i == 0) {
            this.f3122f = C0883f.f3048a;
            this.f3123g = C0883f.f3050c;
        } else {
            m4494e(i);
        }
        this.f3124h = 0;
    }

    public C0900o(C0900o oVar) {
        this();
        if (oVar != null) {
            mo2965a(oVar);
        }
    }

    /* renamed from: a */
    private static void m4493a(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C0876a.class) {
                if (f3118e < 10) {
                    objArr[0] = f3117d;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f3117d = objArr;
                    f3118e++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (C0876a.class) {
                if (f3116c < 10) {
                    objArr[0] = f3115b;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f3115b = objArr;
                    f3116c++;
                }
            }
        }
    }

    /* renamed from: e */
    private void m4494e(int i) {
        if (i == 8) {
            synchronized (C0876a.class) {
                if (f3117d != null) {
                    Object[] objArr = f3117d;
                    this.f3123g = objArr;
                    f3117d = (Object[]) objArr[0];
                    this.f3122f = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f3118e--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C0876a.class) {
                if (f3115b != null) {
                    Object[] objArr2 = f3115b;
                    this.f3123g = objArr2;
                    f3115b = (Object[]) objArr2[0];
                    this.f3122f = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f3116c--;
                    return;
                }
            }
        }
        this.f3122f = new int[i];
        this.f3123g = new Object[(i << 1)];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo2960a() {
        int i = this.f3124h;
        if (i == 0) {
            return -1;
        }
        int a = C0883f.m4423a(this.f3122f, i, 0);
        if (a < 0 || this.f3123g[a << 1] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.f3122f[i2] == 0) {
            if (this.f3123g[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = a - 1;
        while (i3 >= 0 && this.f3122f[i3] == 0) {
            if (this.f3123g[i3 << 1] == null) {
                return i3;
            }
            i3--;
        }
        return i2 ^ -1;
    }

    /* renamed from: a */
    public int mo2961a(Object obj) {
        return obj == null ? mo2960a() : mo2962a(obj, obj.hashCode());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo2962a(Object obj, int i) {
        int i2 = this.f3124h;
        if (i2 == 0) {
            return -1;
        }
        int a = C0883f.m4423a(this.f3122f, i2, i);
        if (a < 0 || obj.equals(this.f3123g[a << 1])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.f3122f[i3] == i) {
            if (obj.equals(this.f3123g[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        int i4 = a - 1;
        while (i4 >= 0 && this.f3122f[i4] == i) {
            if (obj.equals(this.f3123g[i4 << 1])) {
                return i4;
            }
            i4--;
        }
        return i3 ^ -1;
    }

    /* renamed from: a */
    public V mo2963a(int i, V v) {
        int i2 = (i << 1) + 1;
        V v2 = this.f3123g[i2];
        this.f3123g[i2] = v;
        return v2;
    }

    /* renamed from: a */
    public void mo2964a(int i) {
        if (this.f3122f.length < i) {
            int[] iArr = this.f3122f;
            Object[] objArr = this.f3123g;
            m4494e(i);
            if (this.f3124h > 0) {
                System.arraycopy(iArr, 0, this.f3122f, 0, this.f3124h);
                System.arraycopy(objArr, 0, this.f3123g, 0, this.f3124h << 1);
            }
            m4493a(iArr, objArr, this.f3124h);
        }
    }

    /* renamed from: a */
    public void mo2965a(C0900o<? extends K, ? extends V> oVar) {
        int i = oVar.f3124h;
        mo2964a(this.f3124h + i);
        if (this.f3124h != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(oVar.mo2967b(i2), oVar.mo2968c(i2));
            }
        } else if (i > 0) {
            System.arraycopy(oVar.f3122f, 0, this.f3122f, 0, i);
            System.arraycopy(oVar.f3123g, 0, this.f3123g, 0, i << 1);
            this.f3124h = i;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo2966b(Object obj) {
        int i = 1;
        int i2 = this.f3124h * 2;
        Object[] objArr = this.f3123g;
        if (obj == null) {
            while (i < i2) {
                if (objArr[i] == null) {
                    return i >> 1;
                }
                i += 2;
            }
        } else {
            while (i < i2) {
                if (obj.equals(objArr[i])) {
                    return i >> 1;
                }
                i += 2;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public K mo2967b(int i) {
        return this.f3123g[i << 1];
    }

    /* renamed from: c */
    public V mo2968c(int i) {
        return this.f3123g[(i << 1) + 1];
    }

    public void clear() {
        if (this.f3124h != 0) {
            m4493a(this.f3122f, this.f3123g, this.f3124h);
            this.f3122f = C0883f.f3048a;
            this.f3123g = C0883f.f3050c;
            this.f3124h = 0;
        }
    }

    public boolean containsKey(Object obj) {
        return mo2961a(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return mo2966b(obj) >= 0;
    }

    /* renamed from: d */
    public V mo2972d(int i) {
        int i2 = 8;
        V v = this.f3123g[(i << 1) + 1];
        if (this.f3124h <= 1) {
            m4493a(this.f3122f, this.f3123g, this.f3124h);
            this.f3122f = C0883f.f3048a;
            this.f3123g = C0883f.f3050c;
            this.f3124h = 0;
        } else if (this.f3122f.length <= 8 || this.f3124h >= this.f3122f.length / 3) {
            this.f3124h--;
            if (i < this.f3124h) {
                System.arraycopy(this.f3122f, i + 1, this.f3122f, i, this.f3124h - i);
                System.arraycopy(this.f3123g, (i + 1) << 1, this.f3123g, i << 1, (this.f3124h - i) << 1);
            }
            this.f3123g[this.f3124h << 1] = null;
            this.f3123g[(this.f3124h << 1) + 1] = null;
        } else {
            if (this.f3124h > 8) {
                i2 = this.f3124h + (this.f3124h >> 1);
            }
            int[] iArr = this.f3122f;
            Object[] objArr = this.f3123g;
            m4494e(i2);
            this.f3124h--;
            if (i > 0) {
                System.arraycopy(iArr, 0, this.f3122f, 0, i);
                System.arraycopy(objArr, 0, this.f3123g, 0, i << 1);
            }
            if (i < this.f3124h) {
                System.arraycopy(iArr, i + 1, this.f3122f, i, this.f3124h - i);
                System.arraycopy(objArr, (i + 1) << 1, this.f3123g, i << 1, (this.f3124h - i) << 1);
            }
        }
        return v;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0900o) {
            C0900o oVar = (C0900o) obj;
            if (size() != oVar.size()) {
                return false;
            }
            int i = 0;
            while (i < this.f3124h) {
                try {
                    Object b = mo2967b(i);
                    Object c = mo2968c(i);
                    Object obj2 = oVar.get(b);
                    if (c == null) {
                        if (obj2 != null || !oVar.containsKey(b)) {
                            return false;
                        }
                    } else if (!c.equals(obj2)) {
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
        } else if (!(obj instanceof Map)) {
            return false;
        } else {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            int i2 = 0;
            while (i2 < this.f3124h) {
                try {
                    Object b2 = mo2967b(i2);
                    Object c2 = mo2968c(i2);
                    Object obj3 = map.get(b2);
                    if (c2 == null) {
                        if (obj3 != null || !map.containsKey(b2)) {
                            return false;
                        }
                    } else if (!c2.equals(obj3)) {
                        return false;
                    }
                    i2++;
                } catch (NullPointerException e3) {
                    return false;
                } catch (ClassCastException e4) {
                    return false;
                }
            }
            return true;
        }
    }

    public V get(Object obj) {
        int a = mo2961a(obj);
        if (a >= 0) {
            return this.f3123g[(a << 1) + 1];
        }
        return null;
    }

    public int hashCode() {
        int[] iArr = this.f3122f;
        Object[] objArr = this.f3123g;
        int i = this.f3124h;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    public boolean isEmpty() {
        return this.f3124h <= 0;
    }

    public V put(K k, V v) {
        int hashCode;
        int a;
        int i = 8;
        if (k == null) {
            a = mo2960a();
            hashCode = 0;
        } else {
            hashCode = k.hashCode();
            a = mo2962a((Object) k, hashCode);
        }
        if (a >= 0) {
            int i2 = (a << 1) + 1;
            V v2 = this.f3123g[i2];
            this.f3123g[i2] = v;
            return v2;
        }
        int i3 = a ^ -1;
        if (this.f3124h >= this.f3122f.length) {
            if (this.f3124h >= 8) {
                i = this.f3124h + (this.f3124h >> 1);
            } else if (this.f3124h < 4) {
                i = 4;
            }
            int[] iArr = this.f3122f;
            Object[] objArr = this.f3123g;
            m4494e(i);
            if (this.f3122f.length > 0) {
                System.arraycopy(iArr, 0, this.f3122f, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f3123g, 0, objArr.length);
            }
            m4493a(iArr, objArr, this.f3124h);
        }
        if (i3 < this.f3124h) {
            System.arraycopy(this.f3122f, i3, this.f3122f, i3 + 1, this.f3124h - i3);
            System.arraycopy(this.f3123g, i3 << 1, this.f3123g, (i3 + 1) << 1, (this.f3124h - i3) << 1);
        }
        this.f3122f[i3] = hashCode;
        this.f3123g[i3 << 1] = k;
        this.f3123g[(i3 << 1) + 1] = v;
        this.f3124h++;
        return null;
    }

    public V remove(Object obj) {
        int a = mo2961a(obj);
        if (a >= 0) {
            return mo2972d(a);
        }
        return null;
    }

    public int size() {
        return this.f3124h;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f3124h * 28);
        sb.append('{');
        for (int i = 0; i < this.f3124h; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object b = mo2967b(i);
            if (b != this) {
                sb.append(b);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object c = mo2968c(i);
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
