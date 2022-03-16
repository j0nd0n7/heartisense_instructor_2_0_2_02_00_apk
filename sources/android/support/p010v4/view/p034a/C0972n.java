package android.support.p010v4.view.p034a;

import android.annotation.TargetApi;
import android.os.Bundle;
import android.support.annotation.C0007ae;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

@C0007ae(mo1a = 16)
@TargetApi(16)
/* renamed from: android.support.v4.view.a.n */
class C0972n {
    C0972n() {
    }

    /* renamed from: a */
    public static Object m5363a(View view, int i) {
        return AccessibilityNodeInfo.obtain(view, i);
    }

    /* renamed from: a */
    public static void m5364a(Object obj, int i) {
        ((AccessibilityNodeInfo) obj).setMovementGranularities(i);
    }

    /* renamed from: a */
    public static void m5365a(Object obj, View view, int i) {
        ((AccessibilityNodeInfo) obj).addChild(view, i);
    }

    /* renamed from: a */
    public static void m5366a(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setVisibleToUser(z);
    }

    /* renamed from: a */
    public static boolean m5367a(Object obj) {
        return ((AccessibilityNodeInfo) obj).isVisibleToUser();
    }

    /* renamed from: a */
    public static boolean m5368a(Object obj, int i, Bundle bundle) {
        return ((AccessibilityNodeInfo) obj).performAction(i, bundle);
    }

    /* renamed from: b */
    public static int m5369b(Object obj) {
        return ((AccessibilityNodeInfo) obj).getMovementGranularities();
    }

    /* renamed from: b */
    public static Object m5370b(Object obj, int i) {
        return ((AccessibilityNodeInfo) obj).findFocus(i);
    }

    /* renamed from: b */
    public static void m5371b(Object obj, View view, int i) {
        ((AccessibilityNodeInfo) obj).setSource(view, i);
    }

    /* renamed from: b */
    public static void m5372b(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setAccessibilityFocused(z);
    }

    /* renamed from: c */
    public static Object m5373c(Object obj, int i) {
        return ((AccessibilityNodeInfo) obj).focusSearch(i);
    }

    /* renamed from: c */
    public static void m5374c(Object obj, View view, int i) {
        ((AccessibilityNodeInfo) obj).setParent(view, i);
    }

    /* renamed from: c */
    public static boolean m5375c(Object obj) {
        return ((AccessibilityNodeInfo) obj).isAccessibilityFocused();
    }
}
