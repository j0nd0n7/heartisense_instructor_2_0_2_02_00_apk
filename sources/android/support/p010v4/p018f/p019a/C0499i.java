package android.support.p010v4.p018f.p019a;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.support.annotation.C0003aa;
import android.support.annotation.C0007ae;
import android.support.annotation.C0047z;

@C0007ae(mo1a = 9)
@TargetApi(9)
/* renamed from: android.support.v4.f.a.i */
class C0499i extends Drawable implements Drawable.Callback, C0498h, C0512p {

    /* renamed from: a */
    static final PorterDuff.Mode f2059a = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    C0500a f2060b;

    /* renamed from: c */
    Drawable f2061c;

    /* renamed from: d */
    private int f2062d;

    /* renamed from: e */
    private PorterDuff.Mode f2063e;

    /* renamed from: f */
    private boolean f2064f;

    /* renamed from: g */
    private boolean f2065g;

    /* renamed from: android.support.v4.f.a.i$a */
    protected static abstract class C0500a extends Drawable.ConstantState {

        /* renamed from: a */
        int f2066a;

        /* renamed from: b */
        Drawable.ConstantState f2067b;

        /* renamed from: c */
        ColorStateList f2068c = null;

        /* renamed from: d */
        PorterDuff.Mode f2069d = C0499i.f2059a;

        C0500a(@C0003aa C0500a aVar, @C0003aa Resources resources) {
            if (aVar != null) {
                this.f2066a = aVar.f2066a;
                this.f2067b = aVar.f2067b;
                this.f2068c = aVar.f2068c;
                this.f2069d = aVar.f2069d;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo1861a() {
            return this.f2067b != null;
        }

        public int getChangingConfigurations() {
            return (this.f2067b != null ? this.f2067b.getChangingConfigurations() : 0) | this.f2066a;
        }

        public Drawable newDrawable() {
            return newDrawable((Resources) null);
        }

        public abstract Drawable newDrawable(@C0003aa Resources resources);
    }

    /* renamed from: android.support.v4.f.a.i$b */
    private static class C0501b extends C0500a {
        C0501b(@C0003aa C0500a aVar, @C0003aa Resources resources) {
            super(aVar, resources);
        }

        public Drawable newDrawable(@C0003aa Resources resources) {
            return new C0499i(this, resources);
        }
    }

    C0499i(@C0003aa Drawable drawable) {
        this.f2060b = mo1833b();
        mo1831a(drawable);
    }

    C0499i(@C0047z C0500a aVar, @C0003aa Resources resources) {
        this.f2060b = aVar;
        m2639a(resources);
    }

    /* renamed from: a */
    private void m2639a(@C0003aa Resources resources) {
        if (this.f2060b != null && this.f2060b.f2067b != null) {
            mo1831a(mo1832a(this.f2060b.f2067b, resources));
        }
    }

    /* renamed from: a */
    private boolean m2640a(int[] iArr) {
        if (!mo1834c()) {
            return false;
        }
        ColorStateList colorStateList = this.f2060b.f2068c;
        PorterDuff.Mode mode = this.f2060b.f2069d;
        if (colorStateList == null || mode == null) {
            this.f2064f = false;
            clearColorFilter();
            return false;
        }
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.f2064f && colorForState == this.f2062d && mode == this.f2063e) {
            return false;
        }
        setColorFilter(colorForState, mode);
        this.f2062d = colorForState;
        this.f2063e = mode;
        this.f2064f = true;
        return true;
    }

    /* renamed from: a */
    public final Drawable mo1830a() {
        return this.f2061c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Drawable mo1832a(@C0047z Drawable.ConstantState constantState, @C0003aa Resources resources) {
        return constantState.newDrawable(resources);
    }

    /* renamed from: a */
    public final void mo1831a(Drawable drawable) {
        if (this.f2061c != null) {
            this.f2061c.setCallback((Drawable.Callback) null);
        }
        this.f2061c = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            if (this.f2060b != null) {
                this.f2060b.f2067b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    @C0047z
    /* renamed from: b */
    public C0500a mo1833b() {
        return new C0501b(this.f2060b, (Resources) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo1834c() {
        return true;
    }

    public void draw(Canvas canvas) {
        this.f2061c.draw(canvas);
    }

    public int getChangingConfigurations() {
        return (this.f2060b != null ? this.f2060b.getChangingConfigurations() : 0) | super.getChangingConfigurations() | this.f2061c.getChangingConfigurations();
    }

    @C0003aa
    public Drawable.ConstantState getConstantState() {
        if (this.f2060b == null || !this.f2060b.mo1861a()) {
            return null;
        }
        this.f2060b.f2066a = getChangingConfigurations();
        return this.f2060b;
    }

    public Drawable getCurrent() {
        return this.f2061c.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f2061c.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f2061c.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f2061c.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f2061c.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f2061c.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f2061c.getPadding(rect);
    }

    public int[] getState() {
        return this.f2061c.getState();
    }

    public Region getTransparentRegion() {
        return this.f2061c.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isStateful() {
        ColorStateList colorStateList = (!mo1834c() || this.f2060b == null) ? null : this.f2060b.f2068c;
        return (colorStateList != null && colorStateList.isStateful()) || this.f2061c.isStateful();
    }

    public Drawable mutate() {
        if (!this.f2065g && super.mutate() == this) {
            this.f2060b = mo1833b();
            if (this.f2061c != null) {
                this.f2061c.mutate();
            }
            if (this.f2060b != null) {
                this.f2060b.f2067b = this.f2061c != null ? this.f2061c.getConstantState() : null;
            }
            this.f2065g = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        if (this.f2061c != null) {
            this.f2061c.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        return this.f2061c.setLevel(i);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.f2061c.setAlpha(i);
    }

    public void setChangingConfigurations(int i) {
        this.f2061c.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f2061c.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f2061c.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f2061c.setFilterBitmap(z);
    }

    public boolean setState(int[] iArr) {
        return m2640a(iArr) || this.f2061c.setState(iArr);
    }

    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f2060b.f2068c = colorStateList;
        m2640a(getState());
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.f2060b.f2069d = mode;
        m2640a(getState());
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f2061c.setVisible(z, z2);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
