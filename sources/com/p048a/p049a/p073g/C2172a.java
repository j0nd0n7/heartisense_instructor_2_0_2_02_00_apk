package com.p048a.p049a.p073g;

import com.p048a.p049a.p053d.C1915b;
import com.p048a.p049a.p053d.C2144e;
import com.p048a.p049a.p053d.C2145f;
import com.p048a.p049a.p053d.p060c.C2055l;
import com.p048a.p049a.p053d.p063d.p070g.C2141f;
import java.io.File;

/* renamed from: com.a.a.g.a */
public class C2172a<A, T, Z, R> implements C2177f<A, T, Z, R>, Cloneable {

    /* renamed from: a */
    private final C2177f<A, T, Z, R> f7148a;

    /* renamed from: b */
    private C2144e<File, Z> f7149b;

    /* renamed from: c */
    private C2144e<T, Z> f7150c;

    /* renamed from: d */
    private C2145f<Z> f7151d;

    /* renamed from: e */
    private C2141f<Z, R> f7152e;

    /* renamed from: f */
    private C1915b<T> f7153f;

    public C2172a(C2177f<A, T, Z, R> fVar) {
        this.f7148a = fVar;
    }

    /* renamed from: a */
    public C2144e<File, Z> mo7959a() {
        return this.f7149b != null ? this.f7149b : this.f7148a.mo7959a();
    }

    /* renamed from: a */
    public void mo8169a(C1915b<T> bVar) {
        this.f7153f = bVar;
    }

    /* renamed from: a */
    public void mo8170a(C2141f<Z, R> fVar) {
        this.f7152e = fVar;
    }

    /* renamed from: a */
    public void mo8171a(C2144e<File, Z> eVar) {
        this.f7149b = eVar;
    }

    /* renamed from: a */
    public void mo8172a(C2145f<Z> fVar) {
        this.f7151d = fVar;
    }

    /* renamed from: b */
    public C2144e<T, Z> mo7960b() {
        return this.f7150c != null ? this.f7150c : this.f7148a.mo7960b();
    }

    /* renamed from: b */
    public void mo8173b(C2144e<T, Z> eVar) {
        this.f7150c = eVar;
    }

    /* renamed from: c */
    public C1915b<T> mo7961c() {
        return this.f7153f != null ? this.f7153f : this.f7148a.mo7961c();
    }

    /* renamed from: d */
    public C2145f<Z> mo7962d() {
        return this.f7151d != null ? this.f7151d : this.f7148a.mo7962d();
    }

    /* renamed from: e */
    public C2055l<A, T> mo8175e() {
        return this.f7148a.mo8175e();
    }

    /* renamed from: f */
    public C2141f<Z, R> mo8176f() {
        return this.f7152e != null ? this.f7152e : this.f7148a.mo8176f();
    }

    /* renamed from: g */
    public C2172a<A, T, Z, R> clone() {
        try {
            return (C2172a) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
