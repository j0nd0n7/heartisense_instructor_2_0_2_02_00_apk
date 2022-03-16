package com.p048a.p049a.p053d.p063d.p068e;

import android.graphics.Bitmap;
import com.p048a.p049a.p053d.C2146g;
import com.p048a.p049a.p053d.p055b.C2006l;
import com.p048a.p049a.p053d.p055b.p056a.C1921c;
import com.p048a.p049a.p053d.p063d.p064a.C2067d;

/* renamed from: com.a.a.d.d.e.e */
public class C2112e implements C2146g<C2108b> {

    /* renamed from: a */
    private final C2146g<Bitmap> f7044a;

    /* renamed from: b */
    private final C1921c f7045b;

    public C2112e(C2146g<Bitmap> gVar, C1921c cVar) {
        this.f7044a = gVar;
        this.f7045b = cVar;
    }

    /* renamed from: a */
    public C2006l<C2108b> mo7947a(C2006l<C2108b> lVar, int i, int i2) {
        C2108b b = lVar.mo7887b();
        Bitmap b2 = lVar.mo7887b().mo8020b();
        Bitmap b3 = this.f7044a.mo7947a(new C2067d(b2, this.f7045b), i, i2).mo7887b();
        return !b3.equals(b2) ? new C2111d(new C2108b(b, b3, this.f7044a)) : lVar;
    }

    /* renamed from: a */
    public String mo7948a() {
        return this.f7044a.mo7948a();
    }
}
