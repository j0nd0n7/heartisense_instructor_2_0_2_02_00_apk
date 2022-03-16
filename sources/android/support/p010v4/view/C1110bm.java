package android.support.p010v4.view;

import android.annotation.TargetApi;
import android.support.annotation.C0007ae;
import android.view.View;
import android.view.ViewParent;

@C0007ae(mo1a = 19)
@TargetApi(19)
/* renamed from: android.support.v4.view.bm */
class C1110bm {
    C1110bm() {
    }

    /* renamed from: a */
    public static void m6604a(ViewParent viewParent, View view, View view2, int i) {
        viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i);
    }
}
