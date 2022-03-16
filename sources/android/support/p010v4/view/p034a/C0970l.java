package android.support.p010v4.view.p034a;

import android.annotation.TargetApi;
import android.support.annotation.C0007ae;
import android.view.accessibility.AccessibilityNodeInfo;

@C0007ae(mo1a = 24)
@TargetApi(24)
/* renamed from: android.support.v4.view.a.l */
class C0970l {
    C0970l() {
    }

    /* renamed from: a */
    public static int m5311a(Object obj) {
        return ((AccessibilityNodeInfo) obj).getDrawingOrder();
    }

    /* renamed from: a */
    public static Object m5312a() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS;
    }

    /* renamed from: a */
    public static void m5313a(Object obj, int i) {
        ((AccessibilityNodeInfo) obj).setDrawingOrder(i);
    }

    /* renamed from: a */
    public static void m5314a(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setImportantForAccessibility(z);
    }

    /* renamed from: b */
    public static boolean m5315b(Object obj) {
        return ((AccessibilityNodeInfo) obj).isImportantForAccessibility();
    }
}
