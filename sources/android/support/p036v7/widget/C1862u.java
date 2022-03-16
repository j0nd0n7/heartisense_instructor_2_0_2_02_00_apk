package android.support.p036v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.annotation.C0003aa;
import android.support.annotation.C0011ag;
import android.support.annotation.C0036o;
import android.support.p010v4.widget.C1284au;
import android.support.p036v7.p037a.C1359b;
import android.support.p036v7.p038b.p039a.C1477b;
import android.util.AttributeSet;
import android.widget.RadioButton;

/* renamed from: android.support.v7.widget.u */
public class C1862u extends RadioButton implements C1284au {

    /* renamed from: a */
    private C1847l f6330a;

    public C1862u(Context context) {
        this(context, (AttributeSet) null);
    }

    public C1862u(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1359b.C1361b.radioButtonStyle);
    }

    public C1862u(Context context, AttributeSet attributeSet, int i) {
        super(C1804bm.m10918a(context), attributeSet, i);
        this.f6330a = new C1847l(this);
        this.f6330a.mo7446a(attributeSet, i);
    }

    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        return this.f6330a != null ? this.f6330a.mo7442a(compoundPaddingLeft) : compoundPaddingLeft;
    }

    @C0003aa
    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    public ColorStateList getSupportButtonTintList() {
        if (this.f6330a != null) {
            return this.f6330a.mo7443a();
        }
        return null;
    }

    @C0003aa
    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    public PorterDuff.Mode getSupportButtonTintMode() {
        if (this.f6330a != null) {
            return this.f6330a.mo7447b();
        }
        return null;
    }

    public void setButtonDrawable(@C0036o int i) {
        setButtonDrawable(C1477b.m8692b(getContext(), i));
    }

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        if (this.f6330a != null) {
            this.f6330a.mo7448c();
        }
    }

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    public void setSupportButtonTintList(@C0003aa ColorStateList colorStateList) {
        if (this.f6330a != null) {
            this.f6330a.mo7444a(colorStateList);
        }
    }

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    public void setSupportButtonTintMode(@C0003aa PorterDuff.Mode mode) {
        if (this.f6330a != null) {
            this.f6330a.mo7445a(mode);
        }
    }
}
