package android.support.p010v4.view.p034a;

import android.annotation.TargetApi;
import android.support.annotation.C0007ae;
import android.view.accessibility.AccessibilityNodeInfo;

@C0007ae(mo1a = 23)
@TargetApi(23)
/* renamed from: android.support.v4.view.a.k */
class C0969k {
    C0969k() {
    }

    /* renamed from: a */
    public static Object m5302a() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION;
    }

    /* renamed from: a */
    public static void m5303a(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setContextClickable(z);
    }

    /* renamed from: a */
    public static boolean m5304a(Object obj) {
        return ((AccessibilityNodeInfo) obj).isContextClickable();
    }

    /* renamed from: b */
    public static Object m5305b() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN;
    }

    /* renamed from: c */
    public static Object m5306c() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP;
    }

    /* renamed from: d */
    public static Object m5307d() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN;
    }

    /* renamed from: e */
    public static Object m5308e() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT;
    }

    /* renamed from: f */
    public static Object m5309f() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT;
    }

    /* renamed from: g */
    public static Object m5310g() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK;
    }
}
