package android.support.p036v7.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.C0007ae;
import android.support.p036v7.p037a.C1359b;
import android.support.p036v7.p043e.C1489a;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;

@C0007ae(mo1a = 9)
@TargetApi(9)
/* renamed from: android.support.v7.widget.z */
class C1873z {

    /* renamed from: a */
    final TextView f6366a;

    /* renamed from: b */
    private C1805bn f6367b;

    /* renamed from: c */
    private C1805bn f6368c;

    /* renamed from: d */
    private C1805bn f6369d;

    /* renamed from: e */
    private C1805bn f6370e;

    C1873z(TextView textView) {
        this.f6366a = textView;
    }

    /* renamed from: a */
    protected static C1805bn m11264a(Context context, C1849m mVar, int i) {
        ColorStateList b = mVar.mo7455b(context, i);
        if (b == null) {
            return null;
        }
        C1805bn bnVar = new C1805bn();
        bnVar.f6103d = true;
        bnVar.f6100a = b;
        return bnVar;
    }

    /* renamed from: a */
    static C1873z m11265a(TextView textView) {
        return Build.VERSION.SDK_INT >= 17 ? new C1663aa(textView) : new C1873z(textView);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo6243a() {
        if (this.f6367b != null || this.f6368c != null || this.f6369d != null || this.f6370e != null) {
            Drawable[] compoundDrawables = this.f6366a.getCompoundDrawables();
            mo7548a(compoundDrawables[0], this.f6367b);
            mo7548a(compoundDrawables[1], this.f6368c);
            mo7548a(compoundDrawables[2], this.f6369d);
            mo7548a(compoundDrawables[3], this.f6370e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7547a(Context context, int i) {
        ColorStateList g;
        C1807bp a = C1807bp.m10921a(context, i, C1359b.C1371l.TextAppearance);
        if (a.mo7316j(C1359b.C1371l.TextAppearance_textAllCaps)) {
            mo7549a(a.mo7295a(C1359b.C1371l.TextAppearance_textAllCaps, false));
        }
        if (Build.VERSION.SDK_INT < 23 && a.mo7316j(C1359b.C1371l.TextAppearance_android_textColor) && (g = a.mo7313g(C1359b.C1371l.TextAppearance_android_textColor)) != null) {
            this.f6366a.setTextColor(g);
        }
        a.mo7308e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo7548a(Drawable drawable, C1805bn bnVar) {
        if (drawable != null && bnVar != null) {
            C1849m.m11204a(drawable, bnVar, this.f6366a.getDrawableState());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo6244a(AttributeSet attributeSet, int i) {
        ColorStateList colorStateList;
        boolean z;
        boolean z2;
        ColorStateList colorStateList2 = null;
        Context context = this.f6366a.getContext();
        C1849m a = C1849m.m11201a();
        C1807bp a2 = C1807bp.m10923a(context, attributeSet, C1359b.C1371l.AppCompatTextHelper, i, 0);
        int g = a2.mo7312g(C1359b.C1371l.AppCompatTextHelper_android_textAppearance, -1);
        if (a2.mo7316j(C1359b.C1371l.AppCompatTextHelper_android_drawableLeft)) {
            this.f6367b = m11264a(context, a, a2.mo7312g(C1359b.C1371l.AppCompatTextHelper_android_drawableLeft, 0));
        }
        if (a2.mo7316j(C1359b.C1371l.AppCompatTextHelper_android_drawableTop)) {
            this.f6368c = m11264a(context, a, a2.mo7312g(C1359b.C1371l.AppCompatTextHelper_android_drawableTop, 0));
        }
        if (a2.mo7316j(C1359b.C1371l.AppCompatTextHelper_android_drawableRight)) {
            this.f6369d = m11264a(context, a, a2.mo7312g(C1359b.C1371l.AppCompatTextHelper_android_drawableRight, 0));
        }
        if (a2.mo7316j(C1359b.C1371l.AppCompatTextHelper_android_drawableBottom)) {
            this.f6370e = m11264a(context, a, a2.mo7312g(C1359b.C1371l.AppCompatTextHelper_android_drawableBottom, 0));
        }
        a2.mo7308e();
        boolean z3 = this.f6366a.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (g != -1) {
            C1807bp a3 = C1807bp.m10921a(context, g, C1359b.C1371l.TextAppearance);
            if (z3 || !a3.mo7316j(C1359b.C1371l.TextAppearance_textAllCaps)) {
                z = false;
                z2 = false;
            } else {
                z2 = a3.mo7295a(C1359b.C1371l.TextAppearance_textAllCaps, false);
                z = true;
            }
            if (Build.VERSION.SDK_INT < 23) {
                colorStateList = a3.mo7316j(C1359b.C1371l.TextAppearance_android_textColor) ? a3.mo7313g(C1359b.C1371l.TextAppearance_android_textColor) : null;
                if (a3.mo7316j(C1359b.C1371l.TextAppearance_android_textColorHint)) {
                    colorStateList2 = a3.mo7313g(C1359b.C1371l.TextAppearance_android_textColorHint);
                }
            } else {
                colorStateList = null;
            }
            a3.mo7308e();
        } else {
            colorStateList = null;
            z = false;
            z2 = false;
        }
        C1807bp a4 = C1807bp.m10923a(context, attributeSet, C1359b.C1371l.TextAppearance, i, 0);
        if (!z3 && a4.mo7316j(C1359b.C1371l.TextAppearance_textAllCaps)) {
            z2 = a4.mo7295a(C1359b.C1371l.TextAppearance_textAllCaps, false);
            z = true;
        }
        if (Build.VERSION.SDK_INT < 23) {
            if (a4.mo7316j(C1359b.C1371l.TextAppearance_android_textColor)) {
                colorStateList = a4.mo7313g(C1359b.C1371l.TextAppearance_android_textColor);
            }
            if (a4.mo7316j(C1359b.C1371l.TextAppearance_android_textColorHint)) {
                colorStateList2 = a4.mo7313g(C1359b.C1371l.TextAppearance_android_textColorHint);
            }
        }
        a4.mo7308e();
        if (colorStateList != null) {
            this.f6366a.setTextColor(colorStateList);
        }
        if (colorStateList2 != null) {
            this.f6366a.setHintTextColor(colorStateList2);
        }
        if (!z3 && z) {
            mo7549a(z2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7549a(boolean z) {
        this.f6366a.setTransformationMethod(z ? new C1489a(this.f6366a.getContext()) : null);
    }
}
