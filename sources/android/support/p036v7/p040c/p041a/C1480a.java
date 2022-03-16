package android.support.p036v7.p040c.p041a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.support.annotation.C0011ag;
import android.support.p010v4.p018f.p019a.C0484a;

@C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
/* renamed from: android.support.v7.c.a.a */
public class C1480a extends Drawable implements Drawable.Callback {

    /* renamed from: a */
    private Drawable f4594a;

    public C1480a(Drawable drawable) {
        mo4980a(drawable);
    }

    /* renamed from: a */
    public Drawable mo4979a() {
        return this.f4594a;
    }

    /* renamed from: a */
    public void mo4980a(Drawable drawable) {
        if (this.f4594a != null) {
            this.f4594a.setCallback((Drawable.Callback) null);
        }
        this.f4594a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    public void draw(Canvas canvas) {
        this.f4594a.draw(canvas);
    }

    public int getChangingConfigurations() {
        return this.f4594a.getChangingConfigurations();
    }

    public Drawable getCurrent() {
        return this.f4594a.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f4594a.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f4594a.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f4594a.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f4594a.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f4594a.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f4594a.getPadding(rect);
    }

    public int[] getState() {
        return this.f4594a.getState();
    }

    public Region getTransparentRegion() {
        return this.f4594a.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return C0484a.m2545b(this.f4594a);
    }

    public boolean isStateful() {
        return this.f4594a.isStateful();
    }

    public void jumpToCurrentState() {
        C0484a.m2536a(this.f4594a);
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f4594a.setBounds(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        return this.f4594a.setLevel(i);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.f4594a.setAlpha(i);
    }

    public void setAutoMirrored(boolean z) {
        C0484a.m2544a(this.f4594a, z);
    }

    public void setChangingConfigurations(int i) {
        this.f4594a.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f4594a.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f4594a.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f4594a.setFilterBitmap(z);
    }

    public void setHotspot(float f, float f2) {
        C0484a.m2537a(this.f4594a, f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        C0484a.m2539a(this.f4594a, i, i2, i3, i4);
    }

    public boolean setState(int[] iArr) {
        return this.f4594a.setState(iArr);
    }

    public void setTint(int i) {
        C0484a.m2538a(this.f4594a, i);
    }

    public void setTintList(ColorStateList colorStateList) {
        C0484a.m2540a(this.f4594a, colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        C0484a.m2543a(this.f4594a, mode);
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f4594a.setVisible(z, z2);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
