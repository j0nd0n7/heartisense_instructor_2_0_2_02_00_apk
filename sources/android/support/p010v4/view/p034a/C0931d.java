package android.support.p010v4.view.p034a;

import android.annotation.TargetApi;
import android.support.annotation.C0007ae;
import android.view.accessibility.AccessibilityEvent;

@C0007ae(mo1a = 19)
@TargetApi(19)
/* renamed from: android.support.v4.view.a.d */
class C0931d {
    C0931d() {
    }

    /* renamed from: a */
    public static int m4653a(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getContentChangeTypes();
    }

    /* renamed from: a */
    public static void m4654a(AccessibilityEvent accessibilityEvent, int i) {
        accessibilityEvent.setContentChangeTypes(i);
    }
}
