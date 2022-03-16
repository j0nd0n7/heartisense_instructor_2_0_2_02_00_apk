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
import android.widget.CheckBox;

/* renamed from: android.support.v7.widget.j */
public class C1845j extends CheckBox implements C1284au {

    /* renamed from: a */
    private C1847l f6282a;

    public C1845j(Context context) {
        this(context, (AttributeSet) null);
    }

    public C1845j(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1359b.C1361b.checkboxStyle);
    }

    public C1845j(Context context, AttributeSet attributeSet, int i) {
        super(C1804bm.m10918a(context), attributeSet, i);
        this.f6282a = new C1847l(this);
        this.f6282a.mo7446a(attributeSet, i);
    }

    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        return this.f6282a != null ? this.f6282a.mo7442a(compoundPaddingLeft) : compoundPaddingLeft;
    }

    @C0003aa
    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    public ColorStateList getSupportButtonTintList() {
        if (this.f6282a != null) {
            return this.f6282a.mo7443a();
        }
        return null;
    }

    @C0003aa
    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    public PorterDuff.Mode getSupportButtonTintMode() {
        if (this.f6282a != null) {
            return this.f6282a.mo7447b();
        }
        return null;
    }

    public void setButtonDrawable(@C0036o int i) {
        setButtonDrawable(C1477b.m8692b(getContext(), i));
    }

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        if (this.f6282a != null) {
            this.f6282a.mo7448c();
        }
    }

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    public void setSupportButtonTintList(@C0003aa ColorStateList colorStateList) {
        if (this.f6282a != null) {
            this.f6282a.mo7444a(colorStateList);
        }
    }

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    public void setSupportButtonTintMode(@C0003aa PorterDuff.Mode mode) {
        if (this.f6282a != null) {
            this.f6282a.mo7445a(mode);
        }
    }
}
