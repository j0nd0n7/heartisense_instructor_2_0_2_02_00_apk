package com.p048a.p049a.p053d.p063d.p070g;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import com.p048a.p049a.C2243l;
import com.p048a.p049a.p053d.p055b.C2006l;
import com.p048a.p049a.p053d.p055b.p056a.C1921c;
import com.p048a.p049a.p053d.p063d.p064a.C2077k;
import com.p048a.p049a.p053d.p063d.p064a.C2079l;

/* renamed from: com.a.a.d.d.g.e */
public class C2140e implements C2141f<Bitmap, C2077k> {

    /* renamed from: a */
    private final Resources f7105a;

    /* renamed from: b */
    private final C1921c f7106b;

    public C2140e(Context context) {
        this(context.getResources(), C2243l.m12761b(context).mo8360c());
    }

    public C2140e(Resources resources, C1921c cVar) {
        this.f7105a = resources;
        this.f7106b = cVar;
    }

    /* renamed from: a */
    public C2006l<C2077k> mo8075a(C2006l<Bitmap> lVar) {
        return new C2079l(new C2077k(this.f7105a, lVar.mo7887b()), this.f7106b);
    }

    /* renamed from: a */
    public String mo8076a() {
        return "GlideBitmapDrawableTranscoder.com.bumptech.glide.load.resource.transcode";
    }
}
