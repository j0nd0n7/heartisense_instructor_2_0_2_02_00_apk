package android.support.p010v4.p018f.p019a;

import android.annotation.TargetApi;
import android.graphics.drawable.Drawable;
import android.support.annotation.C0007ae;

@C0007ae(mo1a = 11)
@TargetApi(11)
/* renamed from: android.support.v4.f.a.d */
class C0494d {
    C0494d() {
    }

    /* renamed from: a */
    public static void m2618a(Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    /* renamed from: b */
    public static Drawable m2619b(Drawable drawable) {
        return !(drawable instanceof C0512p) ? new C0502j(drawable) : drawable;
    }
}
