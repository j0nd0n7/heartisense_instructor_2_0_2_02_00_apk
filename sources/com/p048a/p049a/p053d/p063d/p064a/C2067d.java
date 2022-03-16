package com.p048a.p049a.p053d.p063d.p064a;

import android.graphics.Bitmap;
import com.p048a.p049a.p053d.p055b.C2006l;
import com.p048a.p049a.p053d.p055b.p056a.C1921c;
import com.p048a.p049a.p078j.C2238i;

/* renamed from: com.a.a.d.d.a.d */
public class C2067d implements C2006l<Bitmap> {

    /* renamed from: a */
    private final Bitmap f6920a;

    /* renamed from: b */
    private final C1921c f6921b;

    public C2067d(Bitmap bitmap, C1921c cVar) {
        if (bitmap == null) {
            throw new NullPointerException("Bitmap must not be null");
        } else if (cVar == null) {
            throw new NullPointerException("BitmapPool must not be null");
        } else {
            this.f6920a = bitmap;
            this.f6921b = cVar;
        }
    }

    /* renamed from: a */
    public static C2067d m11960a(Bitmap bitmap, C1921c cVar) {
        if (bitmap == null) {
            return null;
        }
        return new C2067d(bitmap, cVar);
    }

    /* renamed from: a */
    public Bitmap mo7887b() {
        return this.f6920a;
    }

    /* renamed from: c */
    public int mo7888c() {
        return C2238i.m12731b(this.f6920a);
    }

    /* renamed from: d */
    public void mo7889d() {
        if (!this.f6921b.mo7767a(this.f6920a)) {
            this.f6920a.recycle();
        }
    }
}
