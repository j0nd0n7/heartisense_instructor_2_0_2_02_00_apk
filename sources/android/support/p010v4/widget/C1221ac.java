package android.support.p010v4.widget;

import android.annotation.TargetApi;
import android.support.annotation.C0007ae;
import android.widget.PopupWindow;

@C0007ae(mo1a = 23)
@TargetApi(23)
/* renamed from: android.support.v4.widget.ac */
class C1221ac {
    C1221ac() {
    }

    /* renamed from: a */
    static void m7253a(PopupWindow popupWindow, int i) {
        popupWindow.setWindowLayoutType(i);
    }

    /* renamed from: a */
    static void m7254a(PopupWindow popupWindow, boolean z) {
        popupWindow.setOverlapAnchor(z);
    }

    /* renamed from: a */
    static boolean m7255a(PopupWindow popupWindow) {
        return popupWindow.getOverlapAnchor();
    }

    /* renamed from: b */
    static int m7256b(PopupWindow popupWindow) {
        return popupWindow.getWindowLayoutType();
    }
}
