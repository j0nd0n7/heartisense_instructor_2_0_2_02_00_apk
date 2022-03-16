package android.support.p036v7.widget;

import android.content.Context;
import android.support.annotation.C0036o;
import android.support.p036v7.p038b.p039a.C1477b;
import android.util.AttributeSet;
import android.widget.CheckedTextView;
import android.widget.TextView;

/* renamed from: android.support.v7.widget.k */
public class C1846k extends CheckedTextView {

    /* renamed from: a */
    private static final int[] f6283a = {16843016};

    /* renamed from: b */
    private C1873z f6284b;

    public C1846k(Context context) {
        this(context, (AttributeSet) null);
    }

    public C1846k(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16843720);
    }

    public C1846k(Context context, AttributeSet attributeSet, int i) {
        super(C1804bm.m10918a(context), attributeSet, i);
        this.f6284b = C1873z.m11265a((TextView) this);
        this.f6284b.mo6244a(attributeSet, i);
        this.f6284b.mo6243a();
        C1807bp a = C1807bp.m10923a(getContext(), attributeSet, f6283a, i, 0);
        setCheckMarkDrawable(a.mo7293a(0));
        a.mo7308e();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f6284b != null) {
            this.f6284b.mo6243a();
        }
    }

    public void setCheckMarkDrawable(@C0036o int i) {
        setCheckMarkDrawable(C1477b.m8692b(getContext(), i));
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.f6284b != null) {
            this.f6284b.mo7547a(context, i);
        }
    }
}
