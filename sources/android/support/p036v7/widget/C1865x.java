package android.support.p036v7.widget;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.annotation.C0003aa;
import android.support.annotation.C0007ae;
import android.support.p010v4.p018f.p019a.C0484a;
import android.support.p010v4.view.C1040ar;
import android.support.p036v7.p037a.C1359b;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* renamed from: android.support.v7.widget.x */
class C1865x extends C1861t {

    /* renamed from: a */
    private final SeekBar f6333a;

    /* renamed from: b */
    private Drawable f6334b;

    /* renamed from: c */
    private ColorStateList f6335c = null;

    /* renamed from: d */
    private PorterDuff.Mode f6336d = null;

    /* renamed from: e */
    private boolean f6337e = false;

    /* renamed from: f */
    private boolean f6338f = false;

    C1865x(SeekBar seekBar) {
        super(seekBar);
        this.f6333a = seekBar;
    }

    /* renamed from: g */
    private void m11243g() {
        if (this.f6334b == null) {
            return;
        }
        if (this.f6337e || this.f6338f) {
            this.f6334b = C0484a.m2551g(this.f6334b.mutate());
            if (this.f6337e) {
                C0484a.m2540a(this.f6334b, this.f6335c);
            }
            if (this.f6338f) {
                C0484a.m2543a(this.f6334b, this.f6336d);
            }
            if (this.f6334b.isStateful()) {
                this.f6334b.setState(this.f6333a.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7496a(@C0003aa ColorStateList colorStateList) {
        this.f6335c = colorStateList;
        this.f6337e = true;
        m11243g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7497a(Canvas canvas) {
        int max;
        int i = 1;
        if (this.f6334b != null && (max = this.f6333a.getMax()) > 1) {
            int intrinsicWidth = this.f6334b.getIntrinsicWidth();
            int intrinsicHeight = this.f6334b.getIntrinsicHeight();
            int i2 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
            if (intrinsicHeight >= 0) {
                i = intrinsicHeight / 2;
            }
            this.f6334b.setBounds(-i2, -i, i2, i);
            float width = ((float) ((this.f6333a.getWidth() - this.f6333a.getPaddingLeft()) - this.f6333a.getPaddingRight())) / ((float) max);
            int save = canvas.save();
            canvas.translate((float) this.f6333a.getPaddingLeft(), (float) (this.f6333a.getHeight() / 2));
            for (int i3 = 0; i3 <= max; i3++) {
                this.f6334b.draw(canvas);
                canvas.translate(width, 0.0f);
            }
            canvas.restoreToCount(save);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7498a(@C0003aa PorterDuff.Mode mode) {
        this.f6336d = mode;
        this.f6338f = true;
        m11243g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7499a(@C0003aa Drawable drawable) {
        if (this.f6334b != null) {
            this.f6334b.setCallback((Drawable.Callback) null);
        }
        this.f6334b = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f6333a);
            C0484a.m2546b(drawable, C1040ar.m5947k(this.f6333a));
            if (drawable.isStateful()) {
                drawable.setState(this.f6333a.getDrawableState());
            }
            m11243g();
        }
        this.f6333a.invalidate();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7488a(AttributeSet attributeSet, int i) {
        super.mo7488a(attributeSet, i);
        C1807bp a = C1807bp.m10923a(this.f6333a.getContext(), attributeSet, C1359b.C1371l.AppCompatSeekBar, i, 0);
        Drawable b = a.mo7299b(C1359b.C1371l.AppCompatSeekBar_android_thumb);
        if (b != null) {
            this.f6333a.setThumb(b);
        }
        mo7499a(a.mo7293a(C1359b.C1371l.AppCompatSeekBar_tickMark));
        if (a.mo7316j(C1359b.C1371l.AppCompatSeekBar_tickMarkTintMode)) {
            this.f6336d = C1683ah.m10099a(a.mo7291a(C1359b.C1371l.AppCompatSeekBar_tickMarkTintMode, -1), this.f6336d);
            this.f6338f = true;
        }
        if (a.mo7316j(C1359b.C1371l.AppCompatSeekBar_tickMarkTint)) {
            this.f6335c = a.mo7313g(C1359b.C1371l.AppCompatSeekBar_tickMarkTint);
            this.f6337e = true;
        }
        a.mo7308e();
        m11243g();
    }

    /* access modifiers changed from: package-private */
    @C0003aa
    /* renamed from: b */
    public Drawable mo7500b() {
        return this.f6334b;
    }

    /* access modifiers changed from: package-private */
    @C0003aa
    /* renamed from: c */
    public ColorStateList mo7501c() {
        return this.f6335c;
    }

    /* access modifiers changed from: package-private */
    @C0003aa
    /* renamed from: d */
    public PorterDuff.Mode mo7502d() {
        return this.f6336d;
    }

    /* access modifiers changed from: package-private */
    @C0007ae(mo1a = 11)
    @TargetApi(11)
    /* renamed from: e */
    public void mo7503e() {
        if (this.f6334b != null) {
            this.f6334b.jumpToCurrentState();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo7504f() {
        Drawable drawable = this.f6334b;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f6333a.getDrawableState())) {
            this.f6333a.invalidateDrawable(drawable);
        }
    }
}
