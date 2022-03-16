package android.support.p010v4.view;

import android.annotation.TargetApi;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.C0007ae;
import android.view.View;
import android.view.ViewParent;

@C0007ae(mo1a = 16)
@TargetApi(16)
/* renamed from: android.support.v4.view.ax */
class C1063ax {
    C1063ax() {
    }

    /* renamed from: a */
    public static void m6383a(View view, int i) {
        view.setImportantForAccessibility(i);
    }

    /* renamed from: a */
    public static void m6384a(View view, int i, int i2, int i3, int i4) {
        view.postInvalidate(i, i2, i3, i4);
    }

    /* renamed from: a */
    public static void m6385a(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    /* renamed from: a */
    public static void m6386a(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    /* renamed from: a */
    public static void m6387a(View view, Runnable runnable, long j) {
        view.postOnAnimationDelayed(runnable, j);
    }

    /* renamed from: a */
    public static void m6388a(View view, boolean z) {
        view.setHasTransientState(z);
    }

    /* renamed from: a */
    public static boolean m6389a(View view) {
        return view.hasTransientState();
    }

    /* renamed from: a */
    public static boolean m6390a(View view, int i, Bundle bundle) {
        return view.performAccessibilityAction(i, bundle);
    }

    /* renamed from: b */
    public static void m6391b(View view) {
        view.postInvalidateOnAnimation();
    }

    /* renamed from: c */
    public static int m6392c(View view) {
        return view.getImportantForAccessibility();
    }

    /* renamed from: d */
    public static Object m6393d(View view) {
        return view.getAccessibilityNodeProvider();
    }

    /* renamed from: e */
    public static ViewParent m6394e(View view) {
        return view.getParentForAccessibility();
    }

    /* renamed from: f */
    public static int m6395f(View view) {
        return view.getMinimumWidth();
    }

    /* renamed from: g */
    public static int m6396g(View view) {
        return view.getMinimumHeight();
    }

    /* renamed from: h */
    public static void m6397h(View view) {
        view.requestFitSystemWindows();
    }

    /* renamed from: i */
    public static boolean m6398i(View view) {
        return view.getFitsSystemWindows();
    }

    /* renamed from: j */
    public static boolean m6399j(View view) {
        return view.hasOverlappingRendering();
    }
}
