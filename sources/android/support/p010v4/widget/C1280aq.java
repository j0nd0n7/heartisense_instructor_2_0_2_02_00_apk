package android.support.p010v4.widget;

import android.annotation.TargetApi;
import android.graphics.drawable.Drawable;
import android.support.annotation.C0007ae;
import android.support.annotation.C0047z;
import android.util.Log;
import android.widget.TextView;
import java.lang.reflect.Field;

@C0007ae(mo1a = 9)
@TargetApi(9)
/* renamed from: android.support.v4.widget.aq */
class C1280aq {

    /* renamed from: a */
    private static final String f3933a = "TextViewCompatGingerbread";

    /* renamed from: b */
    private static final int f3934b = 1;

    /* renamed from: c */
    private static Field f3935c;

    /* renamed from: d */
    private static boolean f3936d;

    /* renamed from: e */
    private static Field f3937e;

    /* renamed from: f */
    private static boolean f3938f;

    /* renamed from: g */
    private static Field f3939g;

    /* renamed from: h */
    private static boolean f3940h;

    /* renamed from: i */
    private static Field f3941i;

    /* renamed from: j */
    private static boolean f3942j;

    C1280aq() {
    }

    /* renamed from: a */
    static int m7519a(TextView textView) {
        if (!f3938f) {
            f3937e = m7521a("mMaxMode");
            f3938f = true;
        }
        if (f3937e != null && m7520a(f3937e, textView) == 1) {
            if (!f3936d) {
                f3935c = m7521a("mMaximum");
                f3936d = true;
            }
            if (f3935c != null) {
                return m7520a(f3935c, textView);
            }
        }
        return -1;
    }

    /* renamed from: a */
    private static int m7520a(Field field, TextView textView) {
        try {
            return field.getInt(textView);
        } catch (IllegalAccessException e) {
            Log.d(f3933a, "Could not retrieve value of " + field.getName() + " field.");
            return -1;
        }
    }

    /* renamed from: a */
    private static Field m7521a(String str) {
        Field field = null;
        try {
            field = TextView.class.getDeclaredField(str);
            field.setAccessible(true);
            return field;
        } catch (NoSuchFieldException e) {
            Log.e(f3933a, "Could not retrieve " + str + " field.");
            return field;
        }
    }

    /* renamed from: a */
    static void m7522a(TextView textView, int i) {
        textView.setTextAppearance(textView.getContext(), i);
    }

    /* renamed from: b */
    static int m7523b(TextView textView) {
        if (!f3942j) {
            f3941i = m7521a("mMinMode");
            f3942j = true;
        }
        if (f3941i != null && m7520a(f3941i, textView) == 1) {
            if (!f3940h) {
                f3939g = m7521a("mMinimum");
                f3940h = true;
            }
            if (f3939g != null) {
                return m7520a(f3939g, textView);
            }
        }
        return -1;
    }

    /* renamed from: c */
    static Drawable[] m7524c(@C0047z TextView textView) {
        return textView.getCompoundDrawables();
    }
}
