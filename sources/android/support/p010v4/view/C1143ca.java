package android.support.p010v4.view;

import android.annotation.TargetApi;
import android.graphics.Rect;
import android.support.annotation.C0007ae;
import android.view.WindowInsets;

@C0007ae(mo1a = 21)
@TargetApi(21)
/* renamed from: android.support.v4.view.ca */
class C1143ca {
    C1143ca() {
    }

    /* renamed from: a */
    public static Object m6914a(Object obj) {
        return ((WindowInsets) obj).consumeStableInsets();
    }

    /* renamed from: a */
    public static Object m6915a(Object obj, Rect rect) {
        return ((WindowInsets) obj).replaceSystemWindowInsets(rect);
    }

    /* renamed from: b */
    public static int m6916b(Object obj) {
        return ((WindowInsets) obj).getStableInsetBottom();
    }

    /* renamed from: c */
    public static int m6917c(Object obj) {
        return ((WindowInsets) obj).getStableInsetLeft();
    }

    /* renamed from: d */
    public static int m6918d(Object obj) {
        return ((WindowInsets) obj).getStableInsetRight();
    }

    /* renamed from: e */
    public static int m6919e(Object obj) {
        return ((WindowInsets) obj).getStableInsetTop();
    }

    /* renamed from: f */
    public static boolean m6920f(Object obj) {
        return ((WindowInsets) obj).hasStableInsets();
    }

    /* renamed from: g */
    public static boolean m6921g(Object obj) {
        return ((WindowInsets) obj).isConsumed();
    }
}
