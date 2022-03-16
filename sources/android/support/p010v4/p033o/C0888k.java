package android.support.p010v4.p033o;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: android.support.v4.o.k */
abstract class C0888k<K, V> {

    /* renamed from: b */
    C0888k<K, V>.b f3066b;

    /* renamed from: c */
    C0888k<K, V>.c f3067c;

    /* renamed from: d */
    C0888k<K, V>.e f3068d;

    /* renamed from: android.support.v4.o.k$a */
    final class C0889a<T> implements Iterator<T> {

        /* renamed from: a */
        final int f3069a;

        /* renamed from: b */
        int f3070b;

        /* renamed from: c */
        int f3071c;

        /* renamed from: d */
        boolean f3072d = false;

        C0889a(int i) {
            this.f3069a = i;
            this.f3070b = C0888k.this.mo2792a();
        }

        public boolean hasNext() {
            return this.f3071c < this.f3070b;
        }

        public T next() {
            T a = C0888k.this.mo2794a(this.f3071c, this.f3069a);
            this.f3071c++;
            this.f3072d = true;
            return a;
        }

        public void remove() {
            if (!this.f3072d) {
                throw new IllegalStateException();
            }
            this.f3071c--;
            this.f3070b--;
            this.f3072d = false;
            C0888k.this.mo2796a(this.f3071c);
        }
    }

    /* renamed from: android.support.v4.o.k$b */
    final class C0890b implements Set<Map.Entry<K, V>> {
        C0890b() {
        }

        /* renamed from: a */
        public boolean add(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int a = C0888k.this.mo2792a();
            for (Map.Entry entry : collection) {
                C0888k.this.mo2797a(entry.getKey(), entry.getValue());
            }
            return a != C0888k.this.mo2792a();
        }

        public void clear() {
            C0888k.this.mo2800c();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int a = C0888k.this.mo2793a(entry.getKey());
            if (a >= 0) {
                return C0883f.m4425a(C0888k.this.mo2794a(a, 1), entry.getValue());
            }
            return false;
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
            return C0888k.m4465a(this, obj);
        }

        public int hashCode() {
            int a = C0888k.this.mo2792a() - 1;
            int i = 0;
            while (a >= 0) {
                Object a2 = C0888k.this.mo2794a(a, 0);
                Object a3 = C0888k.this.mo2794a(a, 1);
                a--;
                i += (a3 == null ? 0 : a3.hashCode()) ^ (a2 == null ? 0 : a2.hashCode());
            }
            return i;
        }

        public boolean isEmpty() {
            return C0888k.this.mo2792a() == 0;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new C0892d();
        }

        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public int size() {
            return C0888k.this.mo2792a();
        }

        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: android.support.v4.o.k$c */
    final class C0891c implements Set<K> {
        C0891c() {
        }

        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            C0888k.this.mo2800c();
        }

        public boolean contains(Object obj) {
            return C0888k.this.mo2793a(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            return C0888k.m4464a(C0888k.this.mo2799b(), collection);
        }

        public boolean equals(Object obj) {
            return C0888k.m4465a(this, obj);
        }

        public int hashCode() {
            int i = 0;
            for (int a = C0888k.this.mo2792a() - 1; a >= 0; a--) {
                Object a2 = C0888k.this.mo2794a(a, 0);
                i += a2 == null ? 0 : a2.hashCode();
            }
            return i;
        }

        public boolean isEmpty() {
            return C0888k.this.mo2792a() == 0;
        }

        public Iterator<K> iterator() {
            return new C0889a(0);
        }

        public boolean remove(Object obj) {
            int a = C0888k.this.mo2793a(obj);
            if (a < 0) {
                return false;
            }
            C0888k.this.mo2796a(a);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            return C0888k.m4466b(C0888k.this.mo2799b(), collection);
        }

        public boolean retainAll(Collection<?> collection) {
            return C0888k.m4467c(C0888k.this.mo2799b(), collection);
        }

        public int size() {
            return C0888k.this.mo2792a();
        }

        public Object[] toArray() {
            return C0888k.this.mo2894b(0);
        }

        public <T> T[] toArray(T[] tArr) {
            return C0888k.this.mo2893a(tArr, 0);
        }
    }

    /* renamed from: android.support.v4.o.k$d */
    final class C0892d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: a */
        int f3076a;

        /* renamed from: b */
        int f3077b;

        /* renamed from: c */
        boolean f3078c = false;

        C0892d() {
            this.f3076a = C0888k.this.mo2792a() - 1;
            this.f3077b = -1;
        }

        /* renamed from: a */
        public Map.Entry<K, V> next() {
            this.f3077b++;
            this.f3078c = true;
            return this;
        }

        public final boolean equals(Object obj) {
            boolean z = true;
            if (!this.f3078c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } else if (!(obj instanceof Map.Entry)) {
                return false;
            } else {
                Map.Entry entry = (Map.Entry) obj;
                if (!C0883f.m4425a(entry.getKey(), C0888k.this.mo2794a(this.f3077b, 0)) || !C0883f.m4425a(entry.getValue(), C0888k.this.mo2794a(this.f3077b, 1))) {
                    z = false;
                }
                return z;
            }
        }

        public K getKey() {
            if (this.f3078c) {
                return C0888k.this.mo2794a(this.f3077b, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public V getValue() {
            if (this.f3078c) {
                return C0888k.this.mo2794a(this.f3077b, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public boolean hasNext() {
            return this.f3077b < this.f3076a;
        }

        public final int hashCode() {
            int i = 0;
            if (!this.f3078c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            Object a = C0888k.this.mo2794a(this.f3077b, 0);
            Object a2 = C0888k.this.mo2794a(this.f3077b, 1);
            int hashCode = a == null ? 0 : a.hashCode();
            if (a2 != null) {
                i = a2.hashCode();
            }
            return i ^ hashCode;
        }

        public void remove() {
            if (!this.f3078c) {
                throw new IllegalStateException();
            }
            C0888k.this.mo2796a(this.f3077b);
            this.f3077b--;
            this.f3076a--;
            this.f3078c = false;
        }

        public V setValue(V v) {
            if (this.f3078c) {
                return C0888k.this.mo2795a(this.f3077b, v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* renamed from: android.support.v4.o.k$e */
    final class C0893e implements Collection<V> {
        C0893e() {
        }

        public boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            C0888k.this.mo2800c();
        }

        public boolean contains(Object obj) {
            return C0888k.this.mo2798b(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean isEmpty() {
            return C0888k.this.mo2792a() == 0;
        }

        public Iterator<V> iterator() {
            return new C0889a(1);
        }

        public boolean remove(Object obj) {
            int b = C0888k.this.mo2798b(obj);
            if (b < 0) {
                return false;
            }
            C0888k.this.mo2796a(b);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            int i = 0;
            int a = C0888k.this.mo2792a();
            boolean z = false;
            while (i < a) {
                if (collection.contains(C0888k.this.mo2794a(i, 1))) {
                    C0888k.this.mo2796a(i);
                    i--;
                    a--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public boolean retainAll(Collection<?> collection) {
            int i = 0;
            int a = C0888k.this.mo2792a();
            boolean z = false;
            while (i < a) {
                if (!collection.contains(C0888k.this.mo2794a(i, 1))) {
                    C0888k.this.mo2796a(i);
                    i--;
                    a--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public int size() {
            return C0888k.this.mo2792a();
        }

        public Object[] toArray() {
            return C0888k.this.mo2894b(1);
        }

        public <T> T[] toArray(T[] tArr) {
            return C0888k.this.mo2893a(tArr, 1);
        }
    }

    C0888k() {
    }

    /* renamed from: a */
    public static <K, V> boolean m4464a(Map<K, V> map, Collection<?> collection) {
        for (Object containsKey : collection) {
            if (!map.containsKey(containsKey)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static <T> boolean m4465a(Set<T> set, Object obj) {
        boolean z = true;
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            if (set.size() != set2.size() || !set.containsAll(set2)) {
                z = false;
            }
            return z;
        } catch (ClassCastException | NullPointerException e) {
            return false;
        }
    }

    /* renamed from: b */
    public static <K, V> boolean m4466b(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        for (Object remove : collection) {
            map.remove(remove);
        }
        return size != map.size();
    }

    /* renamed from: c */
    public static <K, V> boolean m4467c(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo2792a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo2793a(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo2794a(int i, int i2);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract V mo2795a(int i, V v);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo2796a(int i);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo2797a(K k, V v);

    /* renamed from: a */
    public <T> T[] mo2893a(T[] tArr, int i) {
        int a = mo2792a();
        T[] tArr2 = tArr.length < a ? (Object[]) Array.newInstance(tArr.getClass().getComponentType(), a) : tArr;
        for (int i2 = 0; i2 < a; i2++) {
            tArr2[i2] = mo2794a(i2, i);
        }
        if (tArr2.length > a) {
            tArr2[a] = null;
        }
        return tArr2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract int mo2798b(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Map<K, V> mo2799b();

    /* renamed from: b */
    public Object[] mo2894b(int i) {
        int a = mo2792a();
        Object[] objArr = new Object[a];
        for (int i2 = 0; i2 < a; i2++) {
            objArr[i2] = mo2794a(i2, i);
        }
        return objArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo2800c();

    /* renamed from: d */
    public Set<Map.Entry<K, V>> mo2895d() {
        if (this.f3066b == null) {
            this.f3066b = new C0890b();
        }
        return this.f3066b;
    }

    /* renamed from: e */
    public Set<K> mo2896e() {
        if (this.f3067c == null) {
            this.f3067c = new C0891c();
        }
        return this.f3067c;
    }

    /* renamed from: f */
    public Collection<V> mo2897f() {
        if (this.f3068d == null) {
            this.f3068d = new C0893e();
        }
        return this.f3068d;
    }
}
