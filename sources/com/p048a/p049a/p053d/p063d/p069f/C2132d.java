package com.p048a.p049a.p053d.p063d.p069f;

import android.graphics.Bitmap;
import com.p048a.p049a.p053d.C2145f;
import com.p048a.p049a.p053d.p055b.C2006l;
import com.p048a.p049a.p053d.p063d.p068e.C2108b;
import java.io.OutputStream;

/* renamed from: com.a.a.d.d.f.d */
public class C2132d implements C2145f<C2127a> {

    /* renamed from: a */
    private final C2145f<Bitmap> f7091a;

    /* renamed from: b */
    private final C2145f<C2108b> f7092b;

    /* renamed from: c */
    private String f7093c;

    public C2132d(C2145f<Bitmap> fVar, C2145f<C2108b> fVar2) {
        this.f7091a = fVar;
        this.f7092b = fVar2;
    }

    /* renamed from: a */
    public String mo7743a() {
        if (this.f7093c == null) {
            this.f7093c = this.f7091a.mo7743a() + this.f7092b.mo7743a();
        }
        return this.f7093c;
    }

    /* renamed from: a */
    public boolean mo7744a(C2006l<C2127a> lVar, OutputStream outputStream) {
        C2127a b = lVar.mo7887b();
        C2006l<Bitmap> b2 = b.mo8067b();
        return b2 != null ? this.f7091a.mo7744a(b2, outputStream) : this.f7092b.mo7744a(b.mo8068c(), outputStream);
    }
}
