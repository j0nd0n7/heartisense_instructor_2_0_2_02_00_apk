package android.support.p036v7.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.C0047z;
import android.support.p010v4.view.C1040ar;
import android.support.p036v7.p037a.C1359b;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: android.support.v7.widget.h */
class C1843h {

    /* renamed from: a */
    private final View f6274a;

    /* renamed from: b */
    private final C1849m f6275b;

    /* renamed from: c */
    private int f6276c = -1;

    /* renamed from: d */
    private C1805bn f6277d;

    /* renamed from: e */
    private C1805bn f6278e;

    /* renamed from: f */
    private C1805bn f6279f;

    C1843h(View view) {
        this.f6274a = view;
        this.f6275b = C1849m.m11201a();
    }

    /* renamed from: b */
    private boolean m11175b(@C0047z Drawable drawable) {
        if (this.f6279f == null) {
            this.f6279f = new C1805bn();
        }
        C1805bn bnVar = this.f6279f;
        bnVar.mo7287a();
        ColorStateList T = C1040ar.m5870T(this.f6274a);
        if (T != null) {
            bnVar.f6103d = true;
            bnVar.f6100a = T;
        }
        PorterDuff.Mode U = C1040ar.m5871U(this.f6274a);
        if (U != null) {
            bnVar.f6102c = true;
            bnVar.f6101b = U;
        }
        if (!bnVar.f6103d && !bnVar.f6102c) {
            return false;
        }
        C1849m.m11204a(drawable, bnVar, this.f6274a.getDrawableState());
        return true;
    }

    /* renamed from: d */
    private boolean m11176d() {
        int i = Build.VERSION.SDK_INT;
        if (i < 21) {
            return false;
        }
        return i == 21 || this.f6277d != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public ColorStateList mo7420a() {
        if (this.f6278e != null) {
            return this.f6278e.f6100a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7421a(int i) {
        this.f6276c = i;
        mo7427b(this.f6275b != null ? this.f6275b.mo7455b(this.f6274a.getContext(), i) : null);
        mo7428c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7422a(ColorStateList colorStateList) {
        if (this.f6278e == null) {
            this.f6278e = new C1805bn();
        }
        this.f6278e.f6100a = colorStateList;
        this.f6278e.f6103d = true;
        mo7428c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7423a(PorterDuff.Mode mode) {
        if (this.f6278e == null) {
            this.f6278e = new C1805bn();
        }
        this.f6278e.f6101b = mode;
        this.f6278e.f6102c = true;
        mo7428c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7424a(Drawable drawable) {
        this.f6276c = -1;
        mo7427b((ColorStateList) null);
        mo7428c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7425a(AttributeSet attributeSet, int i) {
        C1807bp a = C1807bp.m10923a(this.f6274a.getContext(), attributeSet, C1359b.C1371l.ViewBackgroundHelper, i, 0);
        try {
            if (a.mo7316j(C1359b.C1371l.ViewBackgroundHelper_android_background)) {
                this.f6276c = a.mo7312g(C1359b.C1371l.ViewBackgroundHelper_android_background, -1);
                ColorStateList b = this.f6275b.mo7455b(this.f6274a.getContext(), this.f6276c);
                if (b != null) {
                    mo7427b(b);
                }
            }
            if (a.mo7316j(C1359b.C1371l.ViewBackgroundHelper_backgroundTint)) {
                C1040ar.m5885a(this.f6274a, a.mo7313g(C1359b.C1371l.ViewBackgroundHelper_backgroundTint));
            }
            if (a.mo7316j(C1359b.C1371l.ViewBackgroundHelper_backgroundTintMode)) {
                C1040ar.m5887a(this.f6274a, C1683ah.m10099a(a.mo7291a(C1359b.C1371l.ViewBackgroundHelper_backgroundTintMode, -1), (PorterDuff.Mode) null));
            }
        } finally {
            a.mo7308e();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public PorterDuff.Mode mo7426b() {
        if (this.f6278e != null) {
            return this.f6278e.f6101b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo7427b(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f6277d == null) {
                this.f6277d = new C1805bn();
            }
            this.f6277d.f6100a = colorStateList;
            this.f6277d.f6103d = true;
        } else {
            this.f6277d = null;
        }
        mo7428c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo7428c() {
        Drawable background = this.f6274a.getBackground();
        if (background == null) {
            return;
        }
        if (m11176d() && m11175b(background)) {
            return;
        }
        if (this.f6278e != null) {
            C1849m.m11204a(background, this.f6278e, this.f6274a.getDrawableState());
        } else if (this.f6277d != null) {
            C1849m.m11204a(background, this.f6277d, this.f6274a.getDrawableState());
        }
    }
}
