package android.support.p010v4.view;

import android.annotation.TargetApi;
import android.support.annotation.C0003aa;
import android.support.annotation.C0007ae;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

@C0007ae(mo1a = 14)
@TargetApi(14)
/* renamed from: android.support.v4.view.av */
class C1061av {
    C1061av() {
    }

    /* renamed from: a */
    public static void m6375a(View view, AccessibilityEvent accessibilityEvent) {
        view.onPopulateAccessibilityEvent(accessibilityEvent);
    }

    /* renamed from: a */
    public static void m6376a(View view, @C0003aa Object obj) {
        view.setAccessibilityDelegate((View.AccessibilityDelegate) obj);
    }

    /* renamed from: a */
    public static void m6377a(View view, boolean z) {
        view.setFitsSystemWindows(z);
    }

    /* renamed from: a */
    public static boolean m6378a(View view, int i) {
        return view.canScrollHorizontally(i);
    }

    /* renamed from: b */
    public static void m6379b(View view, AccessibilityEvent accessibilityEvent) {
        view.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    /* renamed from: b */
    public static void m6380b(View view, Object obj) {
        view.onInitializeAccessibilityNodeInfo((AccessibilityNodeInfo) obj);
    }

    /* renamed from: b */
    public static boolean m6381b(View view, int i) {
        return view.canScrollVertically(i);
    }
}
