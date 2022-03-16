package com.p048a.p049a.p053d.p063d.p064a;

import android.content.Context;
import android.graphics.Bitmap;
import com.p048a.p049a.C2243l;
import com.p048a.p049a.p053d.C2146g;
import com.p048a.p049a.p053d.p055b.C2006l;
import com.p048a.p049a.p053d.p055b.p056a.C1921c;
import com.p048a.p049a.p078j.C2238i;

/* renamed from: com.a.a.d.d.a.e */
public abstract class C2068e implements C2146g<Bitmap> {

    /* renamed from: a */
    private C1921c f6922a;

    public C2068e(Context context) {
        this(C2243l.m12761b(context).mo8360c());
    }

    public C2068e(C1921c cVar) {
        this.f6922a = cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Bitmap mo7955a(C1921c cVar, Bitmap bitmap, int i, int i2);

    /* renamed from: a */
    public final C2006l<Bitmap> mo7947a(C2006l<Bitmap> lVar, int i, int i2) {
        if (!C2238i.m12730a(i, i2)) {
            throw new IllegalArgumentException("Cannot apply transformation on width: " + i + " or height: " + i2 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
        }
        Bitmap b = lVar.mo7887b();
        if (i == Integer.MIN_VALUE) {
            i = b.getWidth();
        }
        if (i2 == Integer.MIN_VALUE) {
            i2 = b.getHeight();
        }
        Bitmap a = mo7955a(this.f6922a, b, i, i2);
        return b.equals(a) ? lVar : C2067d.m11960a(a, this.f6922a);
    }
}
