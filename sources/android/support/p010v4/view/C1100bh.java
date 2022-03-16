package android.support.p010v4.view;

import android.annotation.TargetApi;
import android.support.annotation.C0007ae;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

@C0007ae(mo1a = 14)
@TargetApi(14)
/* renamed from: android.support.v4.view.bh */
class C1100bh {
    C1100bh() {
    }

    /* renamed from: a */
    public static boolean m6561a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return viewGroup.onRequestSendAccessibilityEvent(view, accessibilityEvent);
    }
}
