package android.support.p010v4.view.p034a;

import android.annotation.TargetApi;
import android.support.annotation.C0007ae;
import android.view.accessibility.AccessibilityRecord;

@C0007ae(mo1a = 15)
@TargetApi(15)
/* renamed from: android.support.v4.view.a.w */
class C0999w {
    C0999w() {
    }

    /* renamed from: a */
    public static int m5681a(Object obj) {
        return ((AccessibilityRecord) obj).getMaxScrollX();
    }

    /* renamed from: a */
    public static void m5682a(Object obj, int i) {
        ((AccessibilityRecord) obj).setMaxScrollX(i);
    }

    /* renamed from: b */
    public static int m5683b(Object obj) {
        return ((AccessibilityRecord) obj).getMaxScrollY();
    }

    /* renamed from: b */
    public static void m5684b(Object obj, int i) {
        ((AccessibilityRecord) obj).setMaxScrollY(i);
    }
}
