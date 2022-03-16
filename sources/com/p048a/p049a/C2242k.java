package com.p048a.p049a;

import com.p048a.p049a.C2256q;
import com.p048a.p049a.p053d.p060c.C2055l;
import com.p048a.p049a.p053d.p063d.p068e.C2108b;
import com.p048a.p049a.p053d.p063d.p070g.C2139d;
import com.p048a.p049a.p053d.p063d.p070g.C2141f;
import java.io.InputStream;

/* renamed from: com.a.a.k */
public class C2242k<ModelType> extends C2229j<ModelType> {

    /* renamed from: g */
    private final C2055l<ModelType, InputStream> f7340g;

    /* renamed from: h */
    private final C2256q.C2262d f7341h;

    C2242k(C2178h<ModelType, ?, ?, ?> hVar, C2055l<ModelType, InputStream> lVar, C2256q.C2262d dVar) {
        super(m12741a(hVar.f7165c, lVar, C2108b.class, (C2141f) null), C2108b.class, hVar);
        this.f7340g = lVar;
        this.f7341h = dVar;
        mo8081c();
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Class, java.lang.Class<R>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static <A, R> com.p048a.p049a.p073g.C2176e<A, java.io.InputStream, com.p048a.p049a.p053d.p063d.p068e.C2108b, R> m12741a(com.p048a.p049a.C2243l r2, com.p048a.p049a.p053d.p060c.C2055l<A, java.io.InputStream> r3, java.lang.Class<R> r4, com.p048a.p049a.p053d.p063d.p070g.C2141f<com.p048a.p049a.p053d.p063d.p068e.C2108b, R> r5) {
        /*
            if (r3 != 0) goto L_0x0004
            r0 = 0
        L_0x0003:
            return r0
        L_0x0004:
            if (r5 != 0) goto L_0x000c
            java.lang.Class<com.a.a.d.d.e.b> r0 = com.p048a.p049a.p053d.p063d.p068e.C2108b.class
            com.a.a.d.d.g.f r5 = r2.mo8353a(r0, r4)
        L_0x000c:
            java.lang.Class<java.io.InputStream> r0 = java.io.InputStream.class
            java.lang.Class<com.a.a.d.d.e.b> r1 = com.p048a.p049a.p053d.p063d.p068e.C2108b.class
            com.a.a.g.b r1 = r2.mo8359b(r0, r1)
            com.a.a.g.e r0 = new com.a.a.g.e
            r0.<init>(r3, r5, r1)
            goto L_0x0003
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p048a.p049a.C2242k.m12741a(com.a.a.l, com.a.a.d.c.l, java.lang.Class, com.a.a.d.d.g.f):com.a.a.g.e");
    }

    /* renamed from: a */
    public <R> C2178h<ModelType, InputStream, C2108b, R> mo8351a(C2141f<C2108b, R> fVar, Class<R> cls) {
        return this.f7341h.mo8426a(new C2178h(m12741a(this.f7165c, this.f7340g, cls, fVar), cls, this));
    }

    /* renamed from: j */
    public C2178h<ModelType, InputStream, C2108b, byte[]> mo8352j() {
        return mo8351a(new C2139d(), byte[].class);
    }
}
