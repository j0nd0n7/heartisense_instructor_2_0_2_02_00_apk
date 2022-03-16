package android.support.p010v4.view;

import android.annotation.TargetApi;
import android.support.annotation.C0007ae;
import android.view.View;

@C0007ae(mo1a = 23)
@TargetApi(23)
/* renamed from: android.support.v4.view.bc */
class C1085bc {
    C1085bc() {
    }

    /* renamed from: a */
    public static int m6520a(View view) {
        return view.getScrollIndicators();
    }

    /* renamed from: a */
    public static void m6521a(View view, int i) {
        view.setScrollIndicators(i);
    }

    /* renamed from: a */
    public static void m6522a(View view, int i, int i2) {
        view.setScrollIndicators(i, i2);
    }

    /* renamed from: b */
    static void m6523b(View view, int i) {
        view.offsetTopAndBottom(i);
    }

    /* renamed from: c */
    static void m6524c(View view, int i) {
        view.offsetLeftAndRight(i);
    }
}
