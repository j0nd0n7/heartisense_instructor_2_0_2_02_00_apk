package com.p048a.p049a.p053d.p063d.p069f;

import android.graphics.Bitmap;
import com.p048a.p049a.p053d.C2146g;
import com.p048a.p049a.p053d.p055b.C2006l;
import com.p048a.p049a.p053d.p055b.p056a.C1921c;
import com.p048a.p049a.p053d.p063d.p068e.C2108b;
import com.p048a.p049a.p053d.p063d.p068e.C2112e;

/* renamed from: com.a.a.d.d.f.f */
public class C2134f implements C2146g<C2127a> {

    /* renamed from: a */
    private final C2146g<Bitmap> f7095a;

    /* renamed from: b */
    private final C2146g<C2108b> f7096b;

    public C2134f(C1921c cVar, C2146g<Bitmap> gVar) {
        this(gVar, (C2146g<C2108b>) new C2112e(gVar, cVar));
    }

    C2134f(C2146g<Bitmap> gVar, C2146g<C2108b> gVar2) {
        this.f7095a = gVar;
        this.f7096b = gVar2;
    }

    /* renamed from: a */
    public C2006l<C2127a> mo7947a(C2006l<C2127a> lVar, int i, int i2) {
        C2006l<Bitmap> b = lVar.mo7887b().mo8067b();
        C2006l<C2108b> c = lVar.mo7887b().mo8068c();
        if (b != null && this.f7095a != null) {
            C2006l<Bitmap> a = this.f7095a.mo7947a(b, i, i2);
            return !b.equals(a) ? new C2128b(new C2127a(a, lVar.mo7887b().mo8068c())) : lVar;
        } else if (c == null || this.f7096b == null) {
            return lVar;
        } else {
            C2006l<C2108b> a2 = this.f7096b.mo7947a(c, i, i2);
            return !c.equals(a2) ? new C2128b(new C2127a(lVar.mo7887b().mo8067b(), a2)) : lVar;
        }
    }

    /* renamed from: a */
    public String mo7948a() {
        return this.f7095a.mo7948a();
    }
}
