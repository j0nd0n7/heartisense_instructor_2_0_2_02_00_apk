package android.support.p010v4.p033o;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: android.support.v4.o.a */
public class C0876a<K, V> extends C0900o<K, V> implements Map<K, V> {

    /* renamed from: a */
    C0888k<K, V> f3020a;

    public C0876a() {
    }

    public C0876a(int i) {
        super(i);
    }

    public C0876a(C0900o oVar) {
        super(oVar);
    }

    /* renamed from: b */
    private C0888k<K, V> m4354b() {
        if (this.f3020a == null) {
            this.f3020a = new C0888k<K, V>() {
                /* access modifiers changed from: protected */
                /* renamed from: a */
                public int mo2792a() {
                    return C0876a.this.f3124h;
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public int mo2793a(Object obj) {
                    return C0876a.this.mo2961a(obj);
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public Object mo2794a(int i, int i2) {
                    return C0876a.this.f3123g[(i << 1) + i2];
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public V mo2795a(int i, V v) {
                    return C0876a.this.mo2963a(i, v);
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public void mo2796a(int i) {
                    C0876a.this.mo2972d(i);
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public void mo2797a(K k, V v) {
                    C0876a.this.put(k, v);
                }

                /* access modifiers changed from: protected */
                /* renamed from: b */
                public int mo2798b(Object obj) {
                    return C0876a.this.mo2966b(obj);
                }

                /* access modifiers changed from: protected */
                /* renamed from: b */
                public Map<K, V> mo2799b() {
                    return C0876a.this;
                }

                /* access modifiers changed from: protected */
                /* renamed from: c */
                public void mo2800c() {
                    C0876a.this.clear();
                }
            };
        }
        return this.f3020a;
    }

    /* renamed from: a */
    public boolean mo2785a(Collection<?> collection) {
        return C0888k.m4464a(this, collection);
    }

    /* renamed from: b */
    public boolean mo2786b(Collection<?> collection) {
        return C0888k.m4466b(this, collection);
    }

    /* renamed from: c */
    public boolean mo2787c(Collection<?> collection) {
        return C0888k.m4467c(this, collection);
    }

    public Set<Map.Entry<K, V>> entrySet() {
        return m4354b().mo2895d();
    }

    public Set<K> keySet() {
        return m4354b().mo2896e();
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        mo2964a(this.f3124h + map.size());
        for (Map.Entry next : map.entrySet()) {
            put(next.getKey(), next.getValue());
        }
    }

    public Collection<V> values() {
        return m4354b().mo2897f();
    }
}
