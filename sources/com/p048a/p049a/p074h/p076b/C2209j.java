package com.p048a.p049a.p074h.p076b;

import com.p048a.p049a.p078j.C2238i;

/* renamed from: com.a.a.h.b.j */
public abstract class C2209j<Z> extends C2201b<Z> {

    /* renamed from: b */
    private final int f7266b;

    /* renamed from: c */
    private final int f7267c;

    public C2209j() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public C2209j(int i, int i2) {
        this.f7266b = i;
        this.f7267c = i2;
    }

    /* renamed from: a */
    public final void mo8220a(C2210k kVar) {
        if (!C2238i.m12730a(this.f7266b, this.f7267c)) {
            throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + this.f7266b + " and height: " + this.f7267c + ", either provide dimensions in the constructor" + " or call override()");
        }
        kVar.mo8196a(this.f7266b, this.f7267c);
    }
}
