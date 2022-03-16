package android.support.p036v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.annotation.C0003aa;
import android.support.annotation.C0011ag;
import android.support.annotation.C0036o;
import android.support.p010v4.view.C1034ao;
import android.util.AttributeSet;
import android.widget.TextView;

/* renamed from: android.support.v7.widget.ab */
public class C1664ab extends TextView implements C1034ao {

    /* renamed from: a */
    private C1843h f5569a;

    /* renamed from: b */
    private C1873z f5570b;

    public C1664ab(Context context) {
        this(context, (AttributeSet) null);
    }

    public C1664ab(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public C1664ab(Context context, AttributeSet attributeSet, int i) {
        super(C1804bm.m10918a(context), attributeSet, i);
        this.f5569a = new C1843h(this);
        this.f5569a.mo7425a(attributeSet, i);
        this.f5570b = C1873z.m11265a((TextView) this);
        this.f5570b.mo6244a(attributeSet, i);
        this.f5570b.mo6243a();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f5569a != null) {
            this.f5569a.mo7428c();
        }
        if (this.f5570b != null) {
            this.f5570b.mo6243a();
        }
    }

    @C0003aa
    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    public ColorStateList getSupportBackgroundTintList() {
        if (this.f5569a != null) {
            return this.f5569a.mo7420a();
        }
        return null;
    }

    @C0003aa
    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (this.f5569a != null) {
            return this.f5569a.mo7426b();
        }
        return null;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f5569a != null) {
            this.f5569a.mo7424a(drawable);
        }
    }

    public void setBackgroundResource(@C0036o int i) {
        super.setBackgroundResource(i);
        if (this.f5569a != null) {
            this.f5569a.mo7421a(i);
        }
    }

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    public void setSupportBackgroundTintList(@C0003aa ColorStateList colorStateList) {
        if (this.f5569a != null) {
            this.f5569a.mo7422a(colorStateList);
        }
    }

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    public void setSupportBackgroundTintMode(@C0003aa PorterDuff.Mode mode) {
        if (this.f5569a != null) {
            this.f5569a.mo7423a(mode);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.f5570b != null) {
            this.f5570b.mo7547a(context, i);
        }
    }
}
