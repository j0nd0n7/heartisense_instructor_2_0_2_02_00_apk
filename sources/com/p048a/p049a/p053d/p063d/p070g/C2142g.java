package com.p048a.p049a.p053d.p063d.p070g;

import com.p048a.p049a.p078j.C2237h;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.a.a.d.d.g.g */
public class C2142g {

    /* renamed from: a */
    private static final C2237h f7107a = new C2237h();

    /* renamed from: b */
    private final Map<C2237h, C2141f<?, ?>> f7108b = new HashMap();

    /* renamed from: a */
    public <Z, R> C2141f<Z, R> mo8077a(Class<Z> cls, Class<R> cls2) {
        C2141f<Z, R> fVar;
        if (cls.equals(cls2)) {
            return C2143h.m12204b();
        }
        synchronized (f7107a) {
            f7107a.mo8346a(cls, cls2);
            fVar = this.f7108b.get(f7107a);
        }
        if (fVar != null) {
            return fVar;
        }
        throw new IllegalArgumentException("No transcoder registered for " + cls + " and " + cls2);
    }

    /* renamed from: a */
    public <Z, R> void mo8078a(Class<Z> cls, Class<R> cls2, C2141f<Z, R> fVar) {
        this.f7108b.put(new C2237h(cls, cls2), fVar);
    }
}
