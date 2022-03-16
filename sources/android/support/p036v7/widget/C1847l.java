package android.support.p036v7.widget;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.annotation.C0003aa;
import android.support.p010v4.p018f.p019a.C0484a;
import android.support.p010v4.widget.C1291c;
import android.support.p036v7.p037a.C1359b;
import android.support.p036v7.p038b.p039a.C1477b;
import android.util.AttributeSet;
import android.widget.CompoundButton;

/* renamed from: android.support.v7.widget.l */
class C1847l {

    /* renamed from: a */
    private final CompoundButton f6285a;

    /* renamed from: b */
    private ColorStateList f6286b = null;

    /* renamed from: c */
    private PorterDuff.Mode f6287c = null;

    /* renamed from: d */
    private boolean f6288d = false;

    /* renamed from: e */
    private boolean f6289e = false;

    /* renamed from: f */
    private boolean f6290f;

    /* renamed from: android.support.v7.widget.l$a */
    interface C1848a {
        /* renamed from: a */
        void mo7450a(Drawable drawable);
    }

    C1847l(CompoundButton compoundButton) {
        this.f6285a = compoundButton;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = android.support.p010v4.widget.C1291c.m7605c(r2.f6285a);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo7442a(int r3) {
        /*
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 17
            if (r0 >= r1) goto L_0x0013
            android.widget.CompoundButton r0 = r2.f6285a
            android.graphics.drawable.Drawable r0 = android.support.p010v4.widget.C1291c.m7605c(r0)
            if (r0 == 0) goto L_0x0013
            int r0 = r0.getIntrinsicWidth()
            int r3 = r3 + r0
        L_0x0013:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p036v7.widget.C1847l.mo7442a(int):int");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public ColorStateList mo7443a() {
        return this.f6286b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7444a(ColorStateList colorStateList) {
        this.f6286b = colorStateList;
        this.f6288d = true;
        mo7449d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7445a(@C0003aa PorterDuff.Mode mode) {
        this.f6287c = mode;
        this.f6289e = true;
        mo7449d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7446a(AttributeSet attributeSet, int i) {
        int resourceId;
        TypedArray obtainStyledAttributes = this.f6285a.getContext().obtainStyledAttributes(attributeSet, C1359b.C1371l.CompoundButton, i, 0);
        try {
            if (obtainStyledAttributes.hasValue(C1359b.C1371l.CompoundButton_android_button) && (resourceId = obtainStyledAttributes.getResourceId(C1359b.C1371l.CompoundButton_android_button, 0)) != 0) {
                this.f6285a.setButtonDrawable(C1477b.m8692b(this.f6285a.getContext(), resourceId));
            }
            if (obtainStyledAttributes.hasValue(C1359b.C1371l.CompoundButton_buttonTint)) {
                C1291c.m7602a(this.f6285a, obtainStyledAttributes.getColorStateList(C1359b.C1371l.CompoundButton_buttonTint));
            }
            if (obtainStyledAttributes.hasValue(C1359b.C1371l.CompoundButton_buttonTintMode)) {
                C1291c.m7603a(this.f6285a, C1683ah.m10099a(obtainStyledAttributes.getInt(C1359b.C1371l.CompoundButton_buttonTintMode, -1), (PorterDuff.Mode) null));
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public PorterDuff.Mode mo7447b() {
        return this.f6287c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo7448c() {
        if (this.f6290f) {
            this.f6290f = false;
            return;
        }
        this.f6290f = true;
        mo7449d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo7449d() {
        Drawable c = C1291c.m7605c(this.f6285a);
        if (c == null) {
            return;
        }
        if (this.f6288d || this.f6289e) {
            Drawable mutate = C0484a.m2551g(c).mutate();
            if (this.f6288d) {
                C0484a.m2540a(mutate, this.f6286b);
            }
            if (this.f6289e) {
                C0484a.m2543a(mutate, this.f6287c);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.f6285a.getDrawableState());
            }
            this.f6285a.setButtonDrawable(mutate);
        }
    }
}
