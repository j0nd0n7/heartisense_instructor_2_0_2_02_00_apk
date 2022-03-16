package com.p048a.p049a.p053d.p063d.p064a;

import android.content.Context;
import android.graphics.Bitmap;
import com.p048a.p049a.p053d.p055b.p056a.C1921c;

/* renamed from: com.a.a.d.d.a.f */
public class C2069f extends C2068e {
    public C2069f(Context context) {
        super(context);
    }

    public C2069f(C1921c cVar) {
        super(cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Bitmap mo7955a(C1921c cVar, Bitmap bitmap, int i, int i2) {
        Bitmap a = cVar.mo7764a(i, i2, bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
        Bitmap a2 = C2090s.m12046a(a, bitmap, i, i2);
        if (!(a == null || a == a2 || cVar.mo7767a(a))) {
            a.recycle();
        }
        return a2;
    }

    /* renamed from: a */
    public String mo7948a() {
        return "CenterCrop.com.bumptech.glide.load.resource.bitmap";
    }
}
