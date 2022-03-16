package android.support.p010v4.p018f.p019a;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.support.annotation.C0003aa;
import android.support.annotation.C0007ae;
import android.support.annotation.C0047z;
import android.support.p010v4.p018f.p019a.C0499i;

@C0007ae(mo1a = 21)
@TargetApi(21)
/* renamed from: android.support.v4.f.a.l */
class C0506l extends C0504k {

    /* renamed from: android.support.v4.f.a.l$a */
    private static class C0507a extends C0499i.C0500a {
        C0507a(@C0003aa C0499i.C0500a aVar, @C0003aa Resources resources) {
            super(aVar, resources);
        }

        public Drawable newDrawable(@C0003aa Resources resources) {
            return new C0506l(this, resources);
        }
    }

    C0506l(Drawable drawable) {
        super(drawable);
    }

    C0506l(C0499i.C0500a aVar, Resources resources) {
        super(aVar, resources);
    }

    /* access modifiers changed from: package-private */
    @C0047z
    /* renamed from: b */
    public C0499i.C0500a mo1833b() {
        return new C0507a(this.f2060b, (Resources) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo1834c() {
        if (Build.VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.f2061c;
        return (drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable);
    }

    public Rect getDirtyBounds() {
        return this.f2061c.getDirtyBounds();
    }

    public void getOutline(Outline outline) {
        this.f2061c.getOutline(outline);
    }

    public void setHotspot(float f, float f2) {
        this.f2061c.setHotspot(f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.f2061c.setHotspotBounds(i, i2, i3, i4);
    }

    public boolean setState(int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    public void setTint(int i) {
        if (mo1834c()) {
            super.setTint(i);
        } else {
            this.f2061c.setTint(i);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (mo1834c()) {
            super.setTintList(colorStateList);
        } else {
            this.f2061c.setTintList(colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        if (mo1834c()) {
            super.setTintMode(mode);
        } else {
            this.f2061c.setTintMode(mode);
        }
    }
}
