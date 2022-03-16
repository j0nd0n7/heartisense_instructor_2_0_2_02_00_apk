package com.p048a.p049a.p053d.p063d.p069f;

import android.graphics.Bitmap;
import com.p048a.p049a.p053d.p055b.C2006l;
import com.p048a.p049a.p053d.p063d.p068e.C2108b;

/* renamed from: com.a.a.d.d.f.b */
public class C2128b implements C2006l<C2127a> {

    /* renamed from: a */
    private final C2127a f7081a;

    public C2128b(C2127a aVar) {
        if (aVar == null) {
            throw new NullPointerException("Data must not be null");
        }
        this.f7081a = aVar;
    }

    /* renamed from: a */
    public C2127a mo7887b() {
        return this.f7081a;
    }

    /* renamed from: c */
    public int mo7888c() {
        return this.f7081a.mo8066a();
    }

    /* renamed from: d */
    public void mo7889d() {
        C2006l<Bitmap> b = this.f7081a.mo8067b();
        if (b != null) {
            b.mo7889d();
        }
        C2006l<C2108b> c = this.f7081a.mo8068c();
        if (c != null) {
            c.mo7889d();
        }
    }
}
