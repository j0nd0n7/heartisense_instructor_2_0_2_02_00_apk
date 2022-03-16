package android.support.p010v4.view;

import android.annotation.TargetApi;
import android.support.annotation.C0007ae;
import android.view.View;

@C0007ae(mo1a = 19)
@TargetApi(19)
/* renamed from: android.support.v4.view.ba */
class C1081ba {
    C1081ba() {
    }

    /* renamed from: a */
    public static int m6485a(View view) {
        return view.getAccessibilityLiveRegion();
    }

    /* renamed from: a */
    public static void m6486a(View view, int i) {
        view.setAccessibilityLiveRegion(i);
    }

    /* renamed from: b */
    public static boolean m6487b(View view) {
        return view.isLaidOut();
    }

    /* renamed from: c */
    public static boolean m6488c(View view) {
        return view.isAttachedToWindow();
    }

    /* renamed from: d */
    public static boolean m6489d(View view) {
        return view.isLayoutDirectionResolved();
    }
}
