package android.support.p010v4.view.p034a;

import android.annotation.TargetApi;
import android.support.annotation.C0007ae;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

@C0007ae(mo1a = 22)
@TargetApi(22)
/* renamed from: android.support.v4.view.a.j */
class C0968j {
    C0968j() {
    }

    /* renamed from: a */
    public static Object m5296a(Object obj) {
        return ((AccessibilityNodeInfo) obj).getTraversalBefore();
    }

    /* renamed from: a */
    public static void m5297a(Object obj, View view) {
        ((AccessibilityNodeInfo) obj).setTraversalBefore(view);
    }

    /* renamed from: a */
    public static void m5298a(Object obj, View view, int i) {
        ((AccessibilityNodeInfo) obj).setTraversalBefore(view, i);
    }

    /* renamed from: b */
    public static Object m5299b(Object obj) {
        return ((AccessibilityNodeInfo) obj).getTraversalAfter();
    }

    /* renamed from: b */
    public static void m5300b(Object obj, View view) {
        ((AccessibilityNodeInfo) obj).setTraversalAfter(view);
    }

    /* renamed from: b */
    public static void m5301b(Object obj, View view, int i) {
        ((AccessibilityNodeInfo) obj).setTraversalAfter(view, i);
    }
}
