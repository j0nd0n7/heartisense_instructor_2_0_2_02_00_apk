package android.support.p010v4.widget;

import android.annotation.TargetApi;
import android.graphics.drawable.Drawable;
import android.support.annotation.C0003aa;
import android.support.annotation.C0007ae;
import android.support.annotation.C0036o;
import android.support.annotation.C0047z;
import android.widget.TextView;

@C0007ae(mo1a = 18)
@TargetApi(18)
/* renamed from: android.support.v4.widget.at */
class C1283at {
    C1283at() {
    }

    /* renamed from: a */
    public static void m7531a(@C0047z TextView textView, @C0036o int i, @C0036o int i2, @C0036o int i3, @C0036o int i4) {
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
    }

    /* renamed from: a */
    public static void m7532a(@C0047z TextView textView, @C0003aa Drawable drawable, @C0003aa Drawable drawable2, @C0003aa Drawable drawable3, @C0003aa Drawable drawable4) {
        textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    /* renamed from: a */
    public static Drawable[] m7533a(@C0047z TextView textView) {
        return textView.getCompoundDrawablesRelative();
    }

    /* renamed from: b */
    public static void m7534b(@C0047z TextView textView, @C0003aa Drawable drawable, @C0003aa Drawable drawable2, @C0003aa Drawable drawable3, @C0003aa Drawable drawable4) {
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }
}
