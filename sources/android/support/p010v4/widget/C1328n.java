package android.support.p010v4.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.support.annotation.C0007ae;
import android.widget.EdgeEffect;

@C0007ae(mo1a = 14)
@TargetApi(14)
/* renamed from: android.support.v4.widget.n */
class C1328n {
    C1328n() {
    }

    /* renamed from: a */
    public static Object m7792a(Context context) {
        return new EdgeEffect(context);
    }

    /* renamed from: a */
    public static void m7793a(Object obj, int i, int i2) {
        ((EdgeEffect) obj).setSize(i, i2);
    }

    /* renamed from: a */
    public static boolean m7794a(Object obj) {
        return ((EdgeEffect) obj).isFinished();
    }

    /* renamed from: a */
    public static boolean m7795a(Object obj, float f) {
        ((EdgeEffect) obj).onPull(f);
        return true;
    }

    /* renamed from: a */
    public static boolean m7796a(Object obj, int i) {
        ((EdgeEffect) obj).onAbsorb(i);
        return true;
    }

    /* renamed from: a */
    public static boolean m7797a(Object obj, Canvas canvas) {
        return ((EdgeEffect) obj).draw(canvas);
    }

    /* renamed from: b */
    public static void m7798b(Object obj) {
        ((EdgeEffect) obj).finish();
    }

    /* renamed from: c */
    public static boolean m7799c(Object obj) {
        EdgeEffect edgeEffect = (EdgeEffect) obj;
        edgeEffect.onRelease();
        return edgeEffect.isFinished();
    }
}
