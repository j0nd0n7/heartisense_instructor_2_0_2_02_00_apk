package android.support.p010v4.view.p034a;

import android.annotation.TargetApi;
import android.support.annotation.C0007ae;
import android.view.accessibility.AccessibilityEvent;

@C0007ae(mo1a = 16)
@TargetApi(16)
/* renamed from: android.support.v4.view.a.c */
class C0930c {
    C0930c() {
    }

    /* renamed from: a */
    public static int m4649a(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getMovementGranularity();
    }

    /* renamed from: a */
    public static void m4650a(AccessibilityEvent accessibilityEvent, int i) {
        accessibilityEvent.setMovementGranularity(i);
    }

    /* renamed from: b */
    public static int m4651b(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getAction();
    }

    /* renamed from: b */
    public static void m4652b(AccessibilityEvent accessibilityEvent, int i) {
        accessibilityEvent.setAction(i);
    }
}
