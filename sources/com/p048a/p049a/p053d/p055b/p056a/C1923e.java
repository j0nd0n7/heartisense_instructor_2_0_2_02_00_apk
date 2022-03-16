package com.p048a.p049a.p053d.p055b.p056a;

import com.p048a.p049a.p053d.p055b.p056a.C1931h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.a.a.d.b.a.e */
class C1923e<K extends C1931h, V> {

    /* renamed from: a */
    private final C1924a<K, V> f6635a = new C1924a<>();

    /* renamed from: b */
    private final Map<K, C1924a<K, V>> f6636b = new HashMap();

    /* renamed from: com.a.a.d.b.a.e$a */
    private static class C1924a<K, V> {

        /* renamed from: a */
        C1924a<K, V> f6637a;

        /* renamed from: b */
        C1924a<K, V> f6638b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final K f6639c;

        /* renamed from: d */
        private List<V> f6640d;

        public C1924a() {
            this((Object) null);
        }

        public C1924a(K k) {
            this.f6638b = this;
            this.f6637a = this;
            this.f6639c = k;
        }

        /* renamed from: a */
        public V mo7774a() {
            int b = mo7776b();
            if (b > 0) {
                return this.f6640d.remove(b - 1);
            }
            return null;
        }

        /* renamed from: a */
        public void mo7775a(V v) {
            if (this.f6640d == null) {
                this.f6640d = new ArrayList();
            }
            this.f6640d.add(v);
        }

        /* renamed from: b */
        public int mo7776b() {
            if (this.f6640d != null) {
                return this.f6640d.size();
            }
            return 0;
        }
    }

    C1923e() {
    }

    /* renamed from: a */
    private void m11605a(C1924a<K, V> aVar) {
        m11608d(aVar);
        aVar.f6638b = this.f6635a;
        aVar.f6637a = this.f6635a.f6637a;
        m11607c(aVar);
    }

    /* renamed from: b */
    private void m11606b(C1924a<K, V> aVar) {
        m11608d(aVar);
        aVar.f6638b = this.f6635a.f6638b;
        aVar.f6637a = this.f6635a;
        m11607c(aVar);
    }

    /* renamed from: c */
    private static <K, V> void m11607c(C1924a<K, V> aVar) {
        aVar.f6637a.f6638b = aVar;
        aVar.f6638b.f6637a = aVar;
    }

    /* renamed from: d */
    private static <K, V> void m11608d(C1924a<K, V> aVar) {
        aVar.f6638b.f6637a = aVar.f6637a;
        aVar.f6637a.f6638b = aVar.f6638b;
    }

    /* renamed from: a */
    public V mo7770a() {
        C1924a<K, V> aVar = this.f6635a.f6638b;
        while (true) {
            C1924a<K, V> aVar2 = aVar;
            if (aVar2.equals(this.f6635a)) {
                return null;
            }
            V a = aVar2.mo7774a();
            if (a != null) {
                return a;
            }
            m11608d(aVar2);
            this.f6636b.remove(aVar2.f6639c);
            ((C1931h) aVar2.f6639c).mo7753a();
            aVar = aVar2.f6638b;
        }
    }

    /* renamed from: a */
    public V mo7771a(K k) {
        C1924a aVar = this.f6636b.get(k);
        if (aVar == null) {
            aVar = new C1924a(k);
            this.f6636b.put(k, aVar);
        } else {
            k.mo7753a();
        }
        m11605a(aVar);
        return aVar.mo7774a();
    }

    /* renamed from: a */
    public void mo7772a(K k, V v) {
        C1924a aVar = this.f6636b.get(k);
        if (aVar == null) {
            aVar = new C1924a(k);
            m11606b(aVar);
            this.f6636b.put(k, aVar);
        } else {
            k.mo7753a();
        }
        aVar.mo7775a(v);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        boolean z = false;
        for (C1924a<K, V> aVar = this.f6635a.f6637a; !aVar.equals(this.f6635a); aVar = aVar.f6637a) {
            z = true;
            sb.append('{').append(aVar.f6639c).append(':').append(aVar.mo7776b()).append("}, ");
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        return sb.append(" )").toString();
    }
}
