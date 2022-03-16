package android.support.p006e.p007a;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.support.p010v4.p018f.p019a.C0484a;
import android.support.p010v4.p018f.p019a.C0512p;
import android.util.AttributeSet;

/* renamed from: android.support.e.a.h */
abstract class C0131h extends Drawable implements C0512p {

    /* renamed from: c */
    Drawable f915c;

    C0131h() {
    }

    /* renamed from: a */
    protected static TypedArray m673a(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public void applyTheme(Resources.Theme theme) {
        if (this.f915c != null) {
            C0484a.m2541a(this.f915c, theme);
        }
    }

    public void clearColorFilter() {
        if (this.f915c != null) {
            this.f915c.clearColorFilter();
        } else {
            super.clearColorFilter();
        }
    }

    public ColorFilter getColorFilter() {
        if (this.f915c != null) {
            return C0484a.m2549e(this.f915c);
        }
        return null;
    }

    public Drawable getCurrent() {
        return this.f915c != null ? this.f915c.getCurrent() : super.getCurrent();
    }

    public int getMinimumHeight() {
        return this.f915c != null ? this.f915c.getMinimumHeight() : super.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f915c != null ? this.f915c.getMinimumWidth() : super.getMinimumWidth();
    }

    public boolean getPadding(Rect rect) {
        return this.f915c != null ? this.f915c.getPadding(rect) : super.getPadding(rect);
    }

    public int[] getState() {
        return this.f915c != null ? this.f915c.getState() : super.getState();
    }

    public Region getTransparentRegion() {
        return this.f915c != null ? this.f915c.getTransparentRegion() : super.getTransparentRegion();
    }

    public void jumpToCurrentState() {
        if (this.f915c != null) {
            C0484a.m2536a(this.f915c);
        }
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        if (this.f915c != null) {
            this.f915c.setBounds(rect);
        } else {
            super.onBoundsChange(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        return this.f915c != null ? this.f915c.setLevel(i) : super.onLevelChange(i);
    }

    public void setChangingConfigurations(int i) {
        if (this.f915c != null) {
            this.f915c.setChangingConfigurations(i);
        } else {
            super.setChangingConfigurations(i);
        }
    }

    public void setColorFilter(int i, PorterDuff.Mode mode) {
        if (this.f915c != null) {
            this.f915c.setColorFilter(i, mode);
        } else {
            super.setColorFilter(i, mode);
        }
    }

    public void setFilterBitmap(boolean z) {
        if (this.f915c != null) {
            this.f915c.setFilterBitmap(z);
        }
    }

    public void setHotspot(float f, float f2) {
        if (this.f915c != null) {
            C0484a.m2537a(this.f915c, f, f2);
        }
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        if (this.f915c != null) {
            C0484a.m2539a(this.f915c, i, i2, i3, i4);
        }
    }

    public boolean setState(int[] iArr) {
        return this.f915c != null ? this.f915c.setState(iArr) : super.setState(iArr);
    }
}
