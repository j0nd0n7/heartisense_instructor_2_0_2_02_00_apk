package android.support.p010v4.p018f.p019a;

import android.annotation.TargetApi;
import android.graphics.drawable.Drawable;
import android.support.annotation.C0007ae;

@C0007ae(mo1a = 19)
@TargetApi(19)
/* renamed from: android.support.v4.f.a.f */
class C0496f {
    C0496f() {
    }

    /* renamed from: a */
    public static void m2622a(Drawable drawable, boolean z) {
        drawable.setAutoMirrored(z);
    }

    /* renamed from: a */
    public static boolean m2623a(Drawable drawable) {
        return drawable.isAutoMirrored();
    }

    /* renamed from: b */
    public static Drawable m2624b(Drawable drawable) {
        return !(drawable instanceof C0512p) ? new C0504k(drawable) : drawable;
    }

    /* renamed from: c */
    public static int m2625c(Drawable drawable) {
        return drawable.getAlpha();
    }
}
