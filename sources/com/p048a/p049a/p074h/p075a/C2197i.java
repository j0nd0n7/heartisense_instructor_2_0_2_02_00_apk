package com.p048a.p049a.p074h.p075a;

import com.p048a.p049a.p074h.p075a.C2195h;

/* renamed from: com.a.a.h.a.i */
public class C2197i<R> implements C2187d<R> {

    /* renamed from: a */
    private final C2195h.C2196a f7209a;

    /* renamed from: b */
    private C2195h<R> f7210b;

    public C2197i(C2195h.C2196a aVar) {
        this.f7209a = aVar;
    }

    /* renamed from: a */
    public C2185c<R> mo8187a(boolean z, boolean z2) {
        if (z || !z2) {
            return C2188e.m12452b();
        }
        if (this.f7210b == null) {
            this.f7210b = new C2195h<>(this.f7209a);
        }
        return this.f7210b;
    }
}
