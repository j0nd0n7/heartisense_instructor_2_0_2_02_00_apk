package com.p048a.p049a.p074h.p076b;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.p048a.p049a.p074h.p075a.C2185c;

/* renamed from: com.a.a.h.b.f */
public abstract class C2205f<Z> extends C2214n<ImageView, Z> implements C2185c.C2186a {
    public C2205f(ImageView imageView) {
        super(imageView);
    }

    /* renamed from: a */
    public void mo8208a(Drawable drawable) {
        ((ImageView) this.f7277b).setImageDrawable(drawable);
    }

    /* renamed from: a */
    public void mo8210a(Exception exc, Drawable drawable) {
        ((ImageView) this.f7277b).setImageDrawable(drawable);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo8214a(Z z);

    /* renamed from: a */
    public void mo8051a(Z z, C2185c<? super Z> cVar) {
        if (cVar == null || !cVar.mo8190a(z, this)) {
            mo8214a(z);
        }
    }

    /* renamed from: b */
    public Drawable mo8192b() {
        return ((ImageView) this.f7277b).getDrawable();
    }

    /* renamed from: b */
    public void mo8211b(Drawable drawable) {
        ((ImageView) this.f7277b).setImageDrawable(drawable);
    }

    /* renamed from: c */
    public void mo8193c(Drawable drawable) {
        ((ImageView) this.f7277b).setImageDrawable(drawable);
    }
}
