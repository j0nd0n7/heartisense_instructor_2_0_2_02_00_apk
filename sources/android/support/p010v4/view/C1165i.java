package android.support.p010v4.view;

import android.annotation.TargetApi;
import android.graphics.Rect;
import android.support.annotation.C0007ae;
import android.view.Gravity;

@C0007ae(mo1a = 17)
@TargetApi(17)
/* renamed from: android.support.v4.view.i */
class C1165i {
    C1165i() {
    }

    /* renamed from: a */
    public static int m6992a(int i, int i2) {
        return Gravity.getAbsoluteGravity(i, i2);
    }

    /* renamed from: a */
    public static void m6993a(int i, int i2, int i3, Rect rect, int i4, int i5, Rect rect2, int i6) {
        Gravity.apply(i, i2, i3, rect, i4, i5, rect2, i6);
    }

    /* renamed from: a */
    public static void m6994a(int i, int i2, int i3, Rect rect, Rect rect2, int i4) {
        Gravity.apply(i, i2, i3, rect, rect2, i4);
    }

    /* renamed from: a */
    public static void m6995a(int i, Rect rect, Rect rect2, int i2) {
        Gravity.applyDisplay(i, rect, rect2, i2);
    }
}
