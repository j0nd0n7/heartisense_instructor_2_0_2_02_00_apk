package com.p048a.p049a.p053d.p063d.p070g;

import android.graphics.Bitmap;
import com.p048a.p049a.p053d.p055b.C2006l;
import com.p048a.p049a.p053d.p063d.p064a.C2077k;
import com.p048a.p049a.p053d.p063d.p066c.C2097b;
import com.p048a.p049a.p053d.p063d.p069f.C2127a;

/* renamed from: com.a.a.d.d.g.c */
public class C2138c implements C2141f<C2127a, C2097b> {

    /* renamed from: a */
    private final C2141f<Bitmap, C2077k> f7104a;

    public C2138c(C2141f<Bitmap, C2077k> fVar) {
        this.f7104a = fVar;
    }

    /* renamed from: a */
    public C2006l<C2097b> mo8075a(C2006l<C2127a> lVar) {
        C2127a b = lVar.mo7887b();
        C2006l<Bitmap> b2 = b.mo8067b();
        return b2 != null ? this.f7104a.mo8075a(b2) : b.mo8068c();
    }

    /* renamed from: a */
    public String mo8076a() {
        return "GifBitmapWrapperDrawableTranscoder.com.bumptech.glide.load.resource.transcode";
    }
}
