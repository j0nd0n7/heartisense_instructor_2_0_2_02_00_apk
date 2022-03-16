package android.support.p010v4.view;

import android.annotation.TargetApi;
import android.support.annotation.C0007ae;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;

@C0007ae(mo1a = 14)
@TargetApi(14)
/* renamed from: android.support.v4.view.bl */
class C1109bl {
    C1109bl() {
    }

    /* renamed from: a */
    public static boolean m6603a(ViewParent viewParent, View view, AccessibilityEvent accessibilityEvent) {
        return viewParent.requestSendAccessibilityEvent(view, accessibilityEvent);
    }
}
