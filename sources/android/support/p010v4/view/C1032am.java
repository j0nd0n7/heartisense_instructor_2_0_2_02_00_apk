package android.support.p010v4.view;

import android.annotation.TargetApi;
import android.support.annotation.C0007ae;
import android.view.ScaleGestureDetector;

@C0007ae(mo1a = 19)
@TargetApi(19)
/* renamed from: android.support.v4.view.am */
class C1032am {
    private C1032am() {
    }

    /* renamed from: a */
    public static void m5839a(Object obj, boolean z) {
        ((ScaleGestureDetector) obj).setQuickScaleEnabled(z);
    }

    /* renamed from: a */
    public static boolean m5840a(Object obj) {
        return ((ScaleGestureDetector) obj).isQuickScaleEnabled();
    }
}
