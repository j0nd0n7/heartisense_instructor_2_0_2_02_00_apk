package com.p048a.p049a.p053d.p063d.p069f;

import android.graphics.Bitmap;
import com.p048a.p049a.p053d.p055b.C2006l;
import com.p048a.p049a.p053d.p063d.p068e.C2108b;

/* renamed from: com.a.a.d.d.f.a */
public class C2127a {

    /* renamed from: a */
    private final C2006l<C2108b> f7079a;

    /* renamed from: b */
    private final C2006l<Bitmap> f7080b;

    public C2127a(C2006l<Bitmap> lVar, C2006l<C2108b> lVar2) {
        if (lVar != null && lVar2 != null) {
            throw new IllegalArgumentException("Can only contain either a bitmap resource or a gif resource, not both");
        } else if (lVar == null && lVar2 == null) {
            throw new IllegalArgumentException("Must contain either a bitmap resource or a gif resource");
        } else {
            this.f7080b = lVar;
            this.f7079a = lVar2;
        }
    }

    /* renamed from: a */
    public int mo8066a() {
        return this.f7080b != null ? this.f7080b.mo7888c() : this.f7079a.mo7888c();
    }

    /* renamed from: b */
    public C2006l<Bitmap> mo8067b() {
        return this.f7080b;
    }

    /* renamed from: c */
    public C2006l<C2108b> mo8068c() {
        return this.f7079a;
    }
}
