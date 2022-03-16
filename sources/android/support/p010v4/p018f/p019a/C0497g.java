package android.support.p010v4.p018f.p019a;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.support.annotation.C0007ae;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

@C0007ae(mo1a = 21)
@TargetApi(21)
/* renamed from: android.support.v4.f.a.g */
class C0497g {
    C0497g() {
    }

    /* renamed from: a */
    public static Drawable m2626a(Drawable drawable) {
        return !(drawable instanceof C0512p) ? new C0506l(drawable) : drawable;
    }

    /* renamed from: a */
    public static void m2627a(Drawable drawable, float f, float f2) {
        drawable.setHotspot(f, f2);
    }

    /* renamed from: a */
    public static void m2628a(Drawable drawable, int i) {
        drawable.setTint(i);
    }

    /* renamed from: a */
    public static void m2629a(Drawable drawable, int i, int i2, int i3, int i4) {
        drawable.setHotspotBounds(i, i2, i3, i4);
    }

    /* renamed from: a */
    public static void m2630a(Drawable drawable, ColorStateList colorStateList) {
        drawable.setTintList(colorStateList);
    }

    /* renamed from: a */
    public static void m2631a(Drawable drawable, Resources.Theme theme) {
        drawable.applyTheme(theme);
    }

    /* renamed from: a */
    public static void m2632a(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        drawable.inflate(resources, xmlPullParser, attributeSet, theme);
    }

    /* renamed from: a */
    public static void m2633a(Drawable drawable, PorterDuff.Mode mode) {
        drawable.setTintMode(mode);
    }

    /* renamed from: b */
    public static boolean m2634b(Drawable drawable) {
        return drawable.canApplyTheme();
    }

    /* renamed from: c */
    public static ColorFilter m2635c(Drawable drawable) {
        return drawable.getColorFilter();
    }

    /* renamed from: d */
    public static void m2636d(Drawable drawable) {
        DrawableContainer.DrawableContainerState drawableContainerState;
        drawable.clearColorFilter();
        if (drawable instanceof InsetDrawable) {
            m2636d(((InsetDrawable) drawable).getDrawable());
        } else if (drawable instanceof C0498h) {
            m2636d(((C0498h) drawable).mo1830a());
        } else if ((drawable instanceof DrawableContainer) && (drawableContainerState = (DrawableContainer.DrawableContainerState) ((DrawableContainer) drawable).getConstantState()) != null) {
            int childCount = drawableContainerState.getChildCount();
            for (int i = 0; i < childCount; i++) {
                Drawable child = drawableContainerState.getChild(i);
                if (child != null) {
                    m2636d(child);
                }
            }
        }
    }
}
