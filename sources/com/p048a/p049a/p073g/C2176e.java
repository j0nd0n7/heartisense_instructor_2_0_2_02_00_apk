package com.p048a.p049a.p073g;

import com.p048a.p049a.p053d.C1915b;
import com.p048a.p049a.p053d.C2144e;
import com.p048a.p049a.p053d.C2145f;
import com.p048a.p049a.p053d.p060c.C2055l;
import com.p048a.p049a.p053d.p063d.p070g.C2141f;
import java.io.File;

/* renamed from: com.a.a.g.e */
public class C2176e<A, T, Z, R> implements C2177f<A, T, Z, R> {

    /* renamed from: a */
    private final C2055l<A, T> f7157a;

    /* renamed from: b */
    private final C2141f<Z, R> f7158b;

    /* renamed from: c */
    private final C2173b<T, Z> f7159c;

    public C2176e(C2055l<A, T> lVar, C2141f<Z, R> fVar, C2173b<T, Z> bVar) {
        if (lVar == null) {
            throw new NullPointerException("ModelLoader must not be null");
        }
        this.f7157a = lVar;
        if (fVar == null) {
            throw new NullPointerException("Transcoder must not be null");
        }
        this.f7158b = fVar;
        if (bVar == null) {
            throw new NullPointerException("DataLoadProvider must not be null");
        }
        this.f7159c = bVar;
    }

    /* renamed from: a */
    public C2144e<File, Z> mo7959a() {
        return this.f7159c.mo7959a();
    }

    /* renamed from: b */
    public C2144e<T, Z> mo7960b() {
        return this.f7159c.mo7960b();
    }

    /* renamed from: c */
    public C1915b<T> mo7961c() {
        return this.f7159c.mo7961c();
    }

    /* renamed from: d */
    public C2145f<Z> mo7962d() {
        return this.f7159c.mo7962d();
    }

    /* renamed from: e */
    public C2055l<A, T> mo8175e() {
        return this.f7157a;
    }

    /* renamed from: f */
    public C2141f<Z, R> mo8176f() {
        return this.f7158b;
    }
}
