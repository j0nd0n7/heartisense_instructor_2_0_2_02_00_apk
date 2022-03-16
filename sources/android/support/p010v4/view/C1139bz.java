package android.support.p010v4.view;

import android.annotation.TargetApi;
import android.support.annotation.C0007ae;
import android.view.WindowInsets;

@C0007ae(mo1a = 20)
@TargetApi(20)
/* renamed from: android.support.v4.view.bz */
class C1139bz {
    C1139bz() {
    }

    /* renamed from: a */
    public static Object m6888a(Object obj) {
        return ((WindowInsets) obj).consumeSystemWindowInsets();
    }

    /* renamed from: a */
    public static Object m6889a(Object obj, int i, int i2, int i3, int i4) {
        return ((WindowInsets) obj).replaceSystemWindowInsets(i, i2, i3, i4);
    }

    /* renamed from: b */
    public static int m6890b(Object obj) {
        return ((WindowInsets) obj).getSystemWindowInsetBottom();
    }

    /* renamed from: c */
    public static int m6891c(Object obj) {
        return ((WindowInsets) obj).getSystemWindowInsetLeft();
    }

    /* renamed from: d */
    public static int m6892d(Object obj) {
        return ((WindowInsets) obj).getSystemWindowInsetRight();
    }

    /* renamed from: e */
    public static int m6893e(Object obj) {
        return ((WindowInsets) obj).getSystemWindowInsetTop();
    }

    /* renamed from: f */
    public static boolean m6894f(Object obj) {
        return ((WindowInsets) obj).hasInsets();
    }

    /* renamed from: g */
    public static boolean m6895g(Object obj) {
        return ((WindowInsets) obj).hasSystemWindowInsets();
    }

    /* renamed from: h */
    public static boolean m6896h(Object obj) {
        return ((WindowInsets) obj).isRound();
    }

    /* renamed from: i */
    public static Object m6897i(Object obj) {
        return new WindowInsets((WindowInsets) obj);
    }
}
