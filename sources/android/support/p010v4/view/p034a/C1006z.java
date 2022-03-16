package android.support.p010v4.view.p034a;

import android.annotation.TargetApi;
import android.graphics.Rect;
import android.support.annotation.C0007ae;
import android.view.accessibility.AccessibilityWindowInfo;

@C0007ae(mo1a = 21)
@TargetApi(21)
/* renamed from: android.support.v4.view.a.z */
class C1006z {
    C1006z() {
    }

    /* renamed from: a */
    public static Object m5752a() {
        return AccessibilityWindowInfo.obtain();
    }

    /* renamed from: a */
    public static Object m5753a(Object obj) {
        return AccessibilityWindowInfo.obtain((AccessibilityWindowInfo) obj);
    }

    /* renamed from: a */
    public static Object m5754a(Object obj, int i) {
        return ((AccessibilityWindowInfo) obj).getChild(i);
    }

    /* renamed from: a */
    public static void m5755a(Object obj, Rect rect) {
        ((AccessibilityWindowInfo) obj).getBoundsInScreen(rect);
    }

    /* renamed from: b */
    public static int m5756b(Object obj) {
        return ((AccessibilityWindowInfo) obj).getType();
    }

    /* renamed from: c */
    public static int m5757c(Object obj) {
        return ((AccessibilityWindowInfo) obj).getLayer();
    }

    /* renamed from: d */
    public static Object m5758d(Object obj) {
        return ((AccessibilityWindowInfo) obj).getRoot();
    }

    /* renamed from: e */
    public static Object m5759e(Object obj) {
        return ((AccessibilityWindowInfo) obj).getParent();
    }

    /* renamed from: f */
    public static int m5760f(Object obj) {
        return ((AccessibilityWindowInfo) obj).getId();
    }

    /* renamed from: g */
    public static boolean m5761g(Object obj) {
        return ((AccessibilityWindowInfo) obj).isActive();
    }

    /* renamed from: h */
    public static boolean m5762h(Object obj) {
        return ((AccessibilityWindowInfo) obj).isFocused();
    }

    /* renamed from: i */
    public static boolean m5763i(Object obj) {
        return ((AccessibilityWindowInfo) obj).isAccessibilityFocused();
    }

    /* renamed from: j */
    public static int m5764j(Object obj) {
        return ((AccessibilityWindowInfo) obj).getChildCount();
    }

    /* renamed from: k */
    public static void m5765k(Object obj) {
        ((AccessibilityWindowInfo) obj).recycle();
    }
}
