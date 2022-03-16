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
import android.support.p036v7.p038b.p039a.C1477b;
import android.util.AttributeSet;
import android.widget.MultiAutoCompleteTextView;
import android.widget.TextView;

/* renamed from: android.support.v7.widget.r */
public class C1858r extends MultiAutoCompleteTextView implements C1034ao {

    /* renamed from: a */
    private static final int[] f6318a = {16843126};

    /* renamed from: b */
    private C1843h f6319b;

    /* renamed from: c */
    private C1873z f6320c;

    public C1858r(Context context) {
        this(context, (AttributeSet) null);
    }

    public C1858r(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1359b.C1361b.autoCompleteTextViewStyle);
    }

    public C1858r(Context context, AttributeSet attributeSet, int i) {
        super(C1804bm.m10918a(context), attributeSet, i);
        C1807bp a = C1807bp.m10923a(getContext(), attributeSet, f6318a, i, 0);
        if (a.mo7316j(0)) {
            setDropDownBackgroundDrawable(a.mo7293a(0));
        }
        a.mo7308e();
        this.f6319b = new C1843h(this);
        this.f6319b.mo7425a(attributeSet, i);
        this.f6320c = C1873z.m11265a((TextView) this);
        this.f6320c.mo6244a(attributeSet, i);
        this.f6320c.mo6243a();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f6319b != null) {
            this.f6319b.mo7428c();
        }
        if (this.f6320c != null) {
            this.f6320c.mo6243a();
        }
    }

    @C0003aa
    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    public ColorStateList getSupportBackgroundTintList() {
        if (this.f6319b != null) {
            return this.f6319b.mo7420a();
        }
        return null;
    }

    @C0003aa
    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (this.f6319b != null) {
            return this.f6319b.mo7426b();
        }
        return null;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f6319b != null) {
            this.f6319b.mo7424a(drawable);
        }
    }

    public void setBackgroundResource(@C0036o int i) {
        super.setBackgroundResource(i);
        if (this.f6319b != null) {
            this.f6319b.mo7421a(i);
        }
    }

    public void setDropDownBackgroundResource(@C0036o int i) {
        setDropDownBackgroundDrawable(C1477b.m8692b(getContext(), i));
    }

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    public void setSupportBackgroundTintList(@C0003aa ColorStateList colorStateList) {
        if (this.f6319b != null) {
            this.f6319b.mo7422a(colorStateList);
        }
    }

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    public void setSupportBackgroundTintMode(@C0003aa PorterDuff.Mode mode) {
        if (this.f6319b != null) {
            this.f6319b.mo7423a(mode);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.f6320c != null) {
            this.f6320c.mo7547a(context, i);
        }
    }
}
