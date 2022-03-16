package android.support.p036v7.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.annotation.C0007ae;
import android.support.p036v7.p037a.C1359b;
import android.util.AttributeSet;
import android.widget.TextView;

@C0007ae(mo1a = 17)
@TargetApi(17)
/* renamed from: android.support.v7.widget.aa */
class C1663aa extends C1873z {

    /* renamed from: b */
    private C1805bn f5567b;

    /* renamed from: c */
    private C1805bn f5568c;

    C1663aa(TextView textView) {
        super(textView);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo6243a() {
        super.mo6243a();
        if (this.f5567b != null || this.f5568c != null) {
            Drawable[] compoundDrawablesRelative = this.f6366a.getCompoundDrawablesRelative();
            mo7548a(compoundDrawablesRelative[0], this.f5567b);
            mo7548a(compoundDrawablesRelative[2], this.f5568c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo6244a(AttributeSet attributeSet, int i) {
        super.mo6244a(attributeSet, i);
        Context context = this.f6366a.getContext();
        C1849m a = C1849m.m11201a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1359b.C1371l.AppCompatTextHelper, i, 0);
        if (obtainStyledAttributes.hasValue(C1359b.C1371l.AppCompatTextHelper_android_drawableStart)) {
            this.f5567b = m11264a(context, a, obtainStyledAttributes.getResourceId(C1359b.C1371l.AppCompatTextHelper_android_drawableStart, 0));
        }
        if (obtainStyledAttributes.hasValue(C1359b.C1371l.AppCompatTextHelper_android_drawableEnd)) {
            this.f5568c = m11264a(context, a, obtainStyledAttributes.getResourceId(C1359b.C1371l.AppCompatTextHelper_android_drawableEnd, 0));
        }
        obtainStyledAttributes.recycle();
    }
}
