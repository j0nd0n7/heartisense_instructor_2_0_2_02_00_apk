package com.p048a.p049a.p073g;

import com.p048a.p049a.p078j.C2237h;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.a.a.g.c */
public class C2174c {

    /* renamed from: a */
    private static final C2237h f7154a = new C2237h();

    /* renamed from: b */
    private final Map<C2237h, C2173b<?, ?>> f7155b = new HashMap();

    /* renamed from: a */
    public <T, Z> C2173b<T, Z> mo8178a(Class<T> cls, Class<Z> cls2) {
        C2173b<T, Z> bVar;
        synchronized (f7154a) {
            f7154a.mo8346a(cls, cls2);
            bVar = this.f7155b.get(f7154a);
        }
        return bVar == null ? C2175d.m12386e() : bVar;
    }

    /* renamed from: a */
    public <T, Z> void mo8179a(Class<T> cls, Class<Z> cls2, C2173b<T, Z> bVar) {
        this.f7155b.put(new C2237h(cls, cls2), bVar);
    }
}
