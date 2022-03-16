package com.p048a.p049a.p053d.p063d.p064a;

import android.content.Context;
import android.graphics.Bitmap;
import com.p048a.p049a.C2243l;
import com.p048a.p049a.p053d.C1894a;
import com.p048a.p049a.p053d.C2144e;
import com.p048a.p049a.p053d.p055b.C2006l;
import com.p048a.p049a.p053d.p055b.p056a.C1921c;
import java.io.InputStream;

/* renamed from: com.a.a.d.d.a.r */
public class C2089r implements C2144e<InputStream, Bitmap> {

    /* renamed from: a */
    private static final String f6992a = "StreamBitmapDecoder.com.bumptech.glide.load.resource.bitmap";

    /* renamed from: b */
    private final C2070g f6993b;

    /* renamed from: c */
    private C1921c f6994c;

    /* renamed from: d */
    private C1894a f6995d;

    /* renamed from: e */
    private String f6996e;

    public C2089r(Context context) {
        this(C2243l.m12761b(context).mo8360c());
    }

    public C2089r(Context context, C1894a aVar) {
        this(C2243l.m12761b(context).mo8360c(), aVar);
    }

    public C2089r(C1921c cVar) {
        this(cVar, C1894a.f6581d);
    }

    public C2089r(C1921c cVar, C1894a aVar) {
        this(C2070g.f6923a, cVar, aVar);
    }

    public C2089r(C2070g gVar, C1921c cVar, C1894a aVar) {
        this.f6993b = gVar;
        this.f6994c = cVar;
        this.f6995d = aVar;
    }

    /* renamed from: a */
    public C2006l<Bitmap> mo7949a(InputStream inputStream, int i, int i2) {
        return C2067d.m11960a(this.f6993b.mo7951a(inputStream, this.f6994c, i, i2, this.f6995d), this.f6994c);
    }

    /* renamed from: a */
    public String mo7950a() {
        if (this.f6996e == null) {
            this.f6996e = f6992a + this.f6993b.mo7952a() + this.f6995d.name();
        }
        return this.f6996e;
    }
}
