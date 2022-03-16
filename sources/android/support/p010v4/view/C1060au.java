package android.support.p010v4.view;

import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.support.annotation.C0007ae;
import android.view.View;
import android.view.ViewParent;

@C0007ae(mo1a = 11)
@TargetApi(11)
/* renamed from: android.support.v4.view.au */
class C1060au {
    C1060au() {
    }

    /* renamed from: a */
    public static float m6336a(View view) {
        return view.getAlpha();
    }

    /* renamed from: a */
    public static int m6337a(int i, int i2) {
        return View.combineMeasuredStates(i, i2);
    }

    /* renamed from: a */
    public static int m6338a(int i, int i2, int i3) {
        return View.resolveSizeAndState(i, i2, i3);
    }

    /* renamed from: a */
    static long m6339a() {
        return ValueAnimator.getFrameDelay();
    }

    /* renamed from: a */
    public static void m6340a(View view, float f) {
        view.setTranslationX(f);
    }

    /* renamed from: a */
    static void m6341a(View view, int i) {
        view.offsetTopAndBottom(i);
        if (view.getVisibility() == 0) {
            m6374s(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                m6374s((View) parent);
            }
        }
    }

    /* renamed from: a */
    public static void m6342a(View view, int i, Paint paint) {
        view.setLayerType(i, paint);
    }

    /* renamed from: a */
    public static void m6343a(View view, boolean z) {
        view.setSaveFromParentEnabled(z);
    }

    /* renamed from: b */
    public static int m6344b(View view) {
        return view.getLayerType();
    }

    /* renamed from: b */
    public static void m6345b(View view, float f) {
        view.setTranslationY(f);
    }

    /* renamed from: b */
    static void m6346b(View view, int i) {
        view.offsetLeftAndRight(i);
        if (view.getVisibility() == 0) {
            m6374s(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                m6374s((View) parent);
            }
        }
    }

    /* renamed from: b */
    public static void m6347b(View view, boolean z) {
        view.setActivated(z);
    }

    /* renamed from: c */
    public static int m6348c(View view) {
        return view.getMeasuredWidthAndState();
    }

    /* renamed from: c */
    public static void m6349c(View view, float f) {
        view.setAlpha(f);
    }

    /* renamed from: d */
    public static int m6350d(View view) {
        return view.getMeasuredHeightAndState();
    }

    /* renamed from: d */
    public static void m6351d(View view, float f) {
        view.setX(f);
    }

    /* renamed from: e */
    public static int m6352e(View view) {
        return view.getMeasuredState();
    }

    /* renamed from: e */
    public static void m6353e(View view, float f) {
        view.setY(f);
    }

    /* renamed from: f */
    public static float m6354f(View view) {
        return view.getTranslationX();
    }

    /* renamed from: f */
    public static void m6355f(View view, float f) {
        view.setRotation(f);
    }

    /* renamed from: g */
    public static float m6356g(View view) {
        return view.getTranslationY();
    }

    /* renamed from: g */
    public static void m6357g(View view, float f) {
        view.setRotationX(f);
    }

    /* renamed from: h */
    public static float m6358h(View view) {
        return view.getX();
    }

    /* renamed from: h */
    public static void m6359h(View view, float f) {
        view.setRotationY(f);
    }

    /* renamed from: i */
    public static float m6360i(View view) {
        return view.getY();
    }

    /* renamed from: i */
    public static void m6361i(View view, float f) {
        view.setScaleX(f);
    }

    /* renamed from: j */
    public static float m6362j(View view) {
        return view.getRotation();
    }

    /* renamed from: j */
    public static void m6363j(View view, float f) {
        view.setScaleY(f);
    }

    /* renamed from: k */
    public static float m6364k(View view) {
        return view.getRotationX();
    }

    /* renamed from: k */
    public static void m6365k(View view, float f) {
        view.setPivotX(f);
    }

    /* renamed from: l */
    public static float m6366l(View view) {
        return view.getRotationY();
    }

    /* renamed from: l */
    public static void m6367l(View view, float f) {
        view.setPivotY(f);
    }

    /* renamed from: m */
    public static float m6368m(View view) {
        return view.getScaleX();
    }

    /* renamed from: n */
    public static float m6369n(View view) {
        return view.getScaleY();
    }

    /* renamed from: o */
    public static Matrix m6370o(View view) {
        return view.getMatrix();
    }

    /* renamed from: p */
    public static float m6371p(View view) {
        return view.getPivotX();
    }

    /* renamed from: q */
    public static float m6372q(View view) {
        return view.getPivotY();
    }

    /* renamed from: r */
    public static void m6373r(View view) {
        view.jumpDrawablesToCurrentState();
    }

    /* renamed from: s */
    private static void m6374s(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }
}
