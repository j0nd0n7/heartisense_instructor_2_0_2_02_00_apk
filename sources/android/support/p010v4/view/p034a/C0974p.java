package android.support.p010v4.view.p034a;

import android.annotation.TargetApi;
import android.support.annotation.C0007ae;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.List;

@C0007ae(mo1a = 18)
@TargetApi(18)
/* renamed from: android.support.v4.view.a.p */
class C0974p {
    C0974p() {
    }

    /* renamed from: a */
    public static String m5382a(Object obj) {
        return ((AccessibilityNodeInfo) obj).getViewIdResourceName();
    }

    /* renamed from: a */
    public static void m5383a(Object obj, int i, int i2) {
        ((AccessibilityNodeInfo) obj).setTextSelection(i, i2);
    }

    /* renamed from: a */
    public static void m5384a(Object obj, String str) {
        ((AccessibilityNodeInfo) obj).setViewIdResourceName(str);
    }

    /* renamed from: a */
    public static void m5385a(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setEditable(z);
    }

    /* renamed from: b */
    public static int m5386b(Object obj) {
        return ((AccessibilityNodeInfo) obj).getTextSelectionStart();
    }

    /* renamed from: b */
    public static List<Object> m5387b(Object obj, String str) {
        return ((AccessibilityNodeInfo) obj).findAccessibilityNodeInfosByViewId(str);
    }

    /* renamed from: c */
    public static int m5388c(Object obj) {
        return ((AccessibilityNodeInfo) obj).getTextSelectionEnd();
    }

    /* renamed from: d */
    public static boolean m5389d(Object obj) {
        return ((AccessibilityNodeInfo) obj).isEditable();
    }

    /* renamed from: e */
    public static boolean m5390e(Object obj) {
        return ((AccessibilityNodeInfo) obj).refresh();
    }
}
