package android.support.p010v4.view;

import android.annotation.TargetApi;
import android.support.annotation.C0007ae;
import android.view.ViewGroup;

@C0007ae(mo1a = 17)
@TargetApi(17)
/* renamed from: android.support.v4.view.s */
class C1187s {
    C1187s() {
    }

    /* renamed from: a */
    public static int m7069a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getMarginStart();
    }

    /* renamed from: a */
    public static void m7070a(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        marginLayoutParams.setMarginStart(i);
    }

    /* renamed from: b */
    public static int m7071b(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getMarginEnd();
    }

    /* renamed from: b */
    public static void m7072b(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        marginLayoutParams.setMarginEnd(i);
    }

    /* renamed from: c */
    public static void m7073c(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        marginLayoutParams.setLayoutDirection(i);
    }

    /* renamed from: c */
    public static boolean m7074c(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.isMarginRelative();
    }

    /* renamed from: d */
    public static int m7075d(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getLayoutDirection();
    }

    /* renamed from: d */
    public static void m7076d(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        marginLayoutParams.resolveLayoutDirection(i);
    }
}
