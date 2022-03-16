package android.support.p010v4.view.p034a;

import android.annotation.TargetApi;
import android.support.annotation.C0007ae;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityRecord;

@C0007ae(mo1a = 14)
@TargetApi(14)
/* renamed from: android.support.v4.view.a.b */
class C0929b {
    C0929b() {
    }

    /* renamed from: a */
    public static int m4645a(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getRecordCount();
    }

    /* renamed from: a */
    public static Object m4646a(AccessibilityEvent accessibilityEvent, int i) {
        return accessibilityEvent.getRecord(i);
    }

    /* renamed from: a */
    public static void m4647a(AccessibilityEvent accessibilityEvent, Object obj) {
        accessibilityEvent.appendRecord((AccessibilityRecord) obj);
    }

    /* renamed from: a */
    public static void m4648a(AccessibilityEvent accessibilityEvent, boolean z) {
        accessibilityEvent.setScrollable(z);
    }
}
