package android.support.p010v4.view;

import android.annotation.TargetApi;
import android.graphics.Paint;
import android.support.annotation.C0007ae;
import android.view.Display;
import android.view.View;

@C0007ae(mo1a = 17)
@TargetApi(17)
/* renamed from: android.support.v4.view.ay */
class C1064ay {
    C1064ay() {
    }

    /* renamed from: a */
    public static int m6400a(View view) {
        return view.getLabelFor();
    }

    /* renamed from: a */
    public static void m6401a(View view, int i) {
        view.setLabelFor(i);
    }

    /* renamed from: a */
    public static void m6402a(View view, int i, int i2, int i3, int i4) {
        view.setPaddingRelative(i, i2, i3, i4);
    }

    /* renamed from: a */
    public static void m6403a(View view, Paint paint) {
        view.setLayerPaint(paint);
    }

    /* renamed from: b */
    public static int m6404b(View view) {
        return view.getLayoutDirection();
    }

    /* renamed from: b */
    public static void m6405b(View view, int i) {
        view.setLayoutDirection(i);
    }

    /* renamed from: c */
    public static int m6406c(View view) {
        return view.getPaddingStart();
    }

    /* renamed from: d */
    public static int m6407d(View view) {
        return view.getPaddingEnd();
    }

    /* renamed from: e */
    public static int m6408e(View view) {
        return view.getWindowSystemUiVisibility();
    }

    /* renamed from: f */
    public static boolean m6409f(View view) {
        return view.isPaddingRelative();
    }

    /* renamed from: g */
    public static Display m6410g(View view) {
        return view.getDisplay();
    }
}
