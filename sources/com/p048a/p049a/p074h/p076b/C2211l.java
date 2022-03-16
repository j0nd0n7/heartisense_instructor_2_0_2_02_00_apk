package com.p048a.p049a.p074h.p076b;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.p048a.p049a.p053d.p063d.p066c.C2097b;

/* renamed from: com.a.a.h.b.l */
public class C2211l extends C2097b {

    /* renamed from: c */
    private C2097b f7268c;

    /* renamed from: d */
    private C2212a f7269d;

    /* renamed from: e */
    private boolean f7270e;

    /* renamed from: com.a.a.h.b.l$a */
    static class C2212a extends Drawable.ConstantState {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final Drawable.ConstantState f7271a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final int f7272b;

        C2212a(Drawable.ConstantState constantState, int i) {
            this.f7271a = constantState;
            this.f7272b = i;
        }

        C2212a(C2212a aVar) {
            this(aVar.f7271a, aVar.f7272b);
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public Drawable newDrawable() {
            return newDrawable((Resources) null);
        }

        public Drawable newDrawable(Resources resources) {
            return new C2211l(this, (C2097b) null, resources);
        }
    }

    public C2211l(C2097b bVar, int i) {
        this(new C2212a(bVar.getConstantState(), i), bVar, (Resources) null);
    }

    C2211l(C2212a aVar, C2097b bVar, Resources resources) {
        this.f7269d = aVar;
        if (bVar != null) {
            this.f7268c = bVar;
        } else if (resources != null) {
            this.f7268c = (C2097b) aVar.f7271a.newDrawable(resources);
        } else {
            this.f7268c = (C2097b) aVar.f7271a.newDrawable();
        }
    }

    /* renamed from: a */
    public void mo7964a(int i) {
        this.f7268c.mo7964a(i);
    }

    /* renamed from: a */
    public boolean mo7965a() {
        return this.f7268c.mo7965a();
    }

    public void clearColorFilter() {
        this.f7268c.clearColorFilter();
    }

    public void draw(Canvas canvas) {
        this.f7268c.draw(canvas);
    }

    @TargetApi(19)
    public int getAlpha() {
        return this.f7268c.getAlpha();
    }

    @TargetApi(11)
    public Drawable.Callback getCallback() {
        return this.f7268c.getCallback();
    }

    public int getChangingConfigurations() {
        return this.f7268c.getChangingConfigurations();
    }

    public Drawable.ConstantState getConstantState() {
        return this.f7269d;
    }

    public Drawable getCurrent() {
        return this.f7268c.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f7269d.f7272b;
    }

    public int getIntrinsicWidth() {
        return this.f7269d.f7272b;
    }

    public int getMinimumHeight() {
        return this.f7268c.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f7268c.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f7268c.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f7268c.getPadding(rect);
    }

    public void invalidateSelf() {
        super.invalidateSelf();
        this.f7268c.invalidateSelf();
    }

    public boolean isRunning() {
        return this.f7268c.isRunning();
    }

    public Drawable mutate() {
        if (!this.f7270e && super.mutate() == this) {
            this.f7268c = (C2097b) this.f7268c.mutate();
            this.f7269d = new C2212a(this.f7269d);
            this.f7270e = true;
        }
        return this;
    }

    public void scheduleSelf(Runnable runnable, long j) {
        super.scheduleSelf(runnable, j);
        this.f7268c.scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.f7268c.setAlpha(i);
    }

    public void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.f7268c.setBounds(i, i2, i3, i4);
    }

    public void setBounds(Rect rect) {
        super.setBounds(rect);
        this.f7268c.setBounds(rect);
    }

    public void setChangingConfigurations(int i) {
        this.f7268c.setChangingConfigurations(i);
    }

    public void setColorFilter(int i, PorterDuff.Mode mode) {
        this.f7268c.setColorFilter(i, mode);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f7268c.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f7268c.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f7268c.setFilterBitmap(z);
    }

    public boolean setVisible(boolean z, boolean z2) {
        return this.f7268c.setVisible(z, z2);
    }

    public void start() {
        this.f7268c.start();
    }

    public void stop() {
        this.f7268c.stop();
    }

    public void unscheduleSelf(Runnable runnable) {
        super.unscheduleSelf(runnable);
        this.f7268c.unscheduleSelf(runnable);
    }
}
