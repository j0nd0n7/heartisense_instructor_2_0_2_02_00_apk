package android.support.p036v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.annotation.C0003aa;
import android.support.annotation.C0011ag;
import android.support.annotation.C0036o;
import android.support.p010v4.view.C1034ao;
import android.support.p036v7.p037a.C1359b;
import android.util.AttributeSet;
import android.widget.ImageButton;

/* renamed from: android.support.v7.widget.o */
public class C1855o extends ImageButton implements C1034ao {

    /* renamed from: a */
    private C1843h f6313a;

    /* renamed from: b */
    private C1856p f6314b;

    public C1855o(Context context) {
        this(context, (AttributeSet) null);
    }

    public C1855o(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1359b.C1361b.imageButtonStyle);
    }

    public C1855o(Context context, AttributeSet attributeSet, int i) {
        super(C1804bm.m10918a(context), attributeSet, i);
        this.f6313a = new C1843h(this);
        this.f6313a.mo7425a(attributeSet, i);
        this.f6314b = new C1856p(this);
        this.f6314b.mo7469a(attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f6313a != null) {
            this.f6313a.mo7428c();
        }
    }

    @C0003aa
    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    public ColorStateList getSupportBackgroundTintList() {
        if (this.f6313a != null) {
            return this.f6313a.mo7420a();
        }
        return null;
    }

    @C0003aa
    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (this.f6313a != null) {
            return this.f6313a.mo7426b();
        }
        return null;
    }

    public boolean hasOverlappingRendering() {
        return this.f6314b.mo7470a() && super.hasOverlappingRendering();
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f6313a != null) {
            this.f6313a.mo7424a(drawable);
        }
    }

    public void setBackgroundResource(@C0036o int i) {
        super.setBackgroundResource(i);
        if (this.f6313a != null) {
            this.f6313a.mo7421a(i);
        }
    }

    public void setImageResource(@C0036o int i) {
        this.f6314b.mo7468a(i);
    }

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    public void setSupportBackgroundTintList(@C0003aa ColorStateList colorStateList) {
        if (this.f6313a != null) {
            this.f6313a.mo7422a(colorStateList);
        }
    }

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    public void setSupportBackgroundTintMode(@C0003aa PorterDuff.Mode mode) {
        if (this.f6313a != null) {
            this.f6313a.mo7423a(mode);
        }
    }
}
