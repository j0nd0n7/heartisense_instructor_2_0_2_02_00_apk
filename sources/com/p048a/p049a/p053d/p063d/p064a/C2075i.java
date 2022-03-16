package com.p048a.p049a.p053d.p063d.p064a;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import com.p048a.p049a.C2243l;
import com.p048a.p049a.p053d.C1894a;
import com.p048a.p049a.p053d.C2144e;
import com.p048a.p049a.p053d.p055b.C2006l;
import com.p048a.p049a.p053d.p055b.p056a.C1921c;

/* renamed from: com.a.a.d.d.a.i */
public class C2075i implements C2144e<ParcelFileDescriptor, Bitmap> {

    /* renamed from: a */
    private final C2091t f6934a;

    /* renamed from: b */
    private final C1921c f6935b;

    /* renamed from: c */
    private C1894a f6936c;

    public C2075i(Context context) {
        this(C2243l.m12761b(context).mo8360c(), C1894a.f6581d);
    }

    public C2075i(Context context, C1894a aVar) {
        this(C2243l.m12761b(context).mo8360c(), aVar);
    }

    public C2075i(C1921c cVar, C1894a aVar) {
        this(new C2091t(), cVar, aVar);
    }

    public C2075i(C2091t tVar, C1921c cVar, C1894a aVar) {
        this.f6934a = tVar;
        this.f6935b = cVar;
        this.f6936c = aVar;
    }

    /* renamed from: a */
    public C2006l<Bitmap> mo7949a(ParcelFileDescriptor parcelFileDescriptor, int i, int i2) {
        return C2067d.m11960a(this.f6934a.mo7951a(parcelFileDescriptor, this.f6935b, i, i2, this.f6936c), this.f6935b);
    }

    /* renamed from: a */
    public String mo7950a() {
        return "FileDescriptorBitmapDecoder.com.bumptech.glide.load.data.bitmap";
    }
}
