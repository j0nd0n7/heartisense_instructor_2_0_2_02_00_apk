package android.support.p010v4.view.p034a;

import android.annotation.TargetApi;
import android.support.annotation.C0007ae;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

@C0007ae(mo1a = 17)
@TargetApi(17)
/* renamed from: android.support.v4.view.a.o */
class C0973o {
    C0973o() {
    }

    /* renamed from: a */
    public static Object m5376a(Object obj) {
        return ((AccessibilityNodeInfo) obj).getLabelFor();
    }

    /* renamed from: a */
    public static void m5377a(Object obj, View view) {
        ((AccessibilityNodeInfo) obj).setLabelFor(view);
    }

    /* renamed from: a */
    public static void m5378a(Object obj, View view, int i) {
        ((AccessibilityNodeInfo) obj).setLabelFor(view, i);
    }

    /* renamed from: b */
    public static Object m5379b(Object obj) {
        return ((AccessibilityNodeInfo) obj).getLabeledBy();
    }

    /* renamed from: b */
    public static void m5380b(Object obj, View view) {
        ((AccessibilityNodeInfo) obj).setLabeledBy(view);
    }

    /* renamed from: b */
    public static void m5381b(Object obj, View view, int i) {
        ((AccessibilityNodeInfo) obj).setLabeledBy(view, i);
    }
}
