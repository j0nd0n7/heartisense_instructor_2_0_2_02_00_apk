package android.support.p010v4.p018f.p019a;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.annotation.C0007ae;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

@C0007ae(mo1a = 9)
@TargetApi(9)
/* renamed from: android.support.v4.f.a.c */
class C0493c {
    C0493c() {
    }

    /* renamed from: a */
    public static Drawable m2613a(Drawable drawable) {
        return !(drawable instanceof C0512p) ? new C0499i(drawable) : drawable;
    }

    /* renamed from: a */
    public static void m2614a(Drawable drawable, int i) {
        if (drawable instanceof C0512p) {
            ((C0512p) drawable).setTint(i);
        }
    }

    /* renamed from: a */
    public static void m2615a(Drawable drawable, ColorStateList colorStateList) {
        if (drawable instanceof C0512p) {
            ((C0512p) drawable).setTintList(colorStateList);
        }
    }

    /* renamed from: a */
    public static void m2616a(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        drawable.inflate(resources, xmlPullParser, attributeSet);
    }

    /* renamed from: a */
    public static void m2617a(Drawable drawable, PorterDuff.Mode mode) {
        if (drawable instanceof C0512p) {
            ((C0512p) drawable).setTintMode(mode);
        }
    }
}
