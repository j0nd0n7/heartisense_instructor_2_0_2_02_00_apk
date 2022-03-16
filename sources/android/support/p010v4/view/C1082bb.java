package android.support.p010v4.view;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.C0007ae;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;

@C0007ae(mo1a = 21)
@TargetApi(21)
/* renamed from: android.support.v4.view.bb */
class C1082bb {

    /* renamed from: a */
    private static ThreadLocal<Rect> f3522a;

    /* renamed from: android.support.v4.view.bb$a */
    public interface C1084a {
        /* renamed from: a */
        Object mo3762a(View view, Object obj);
    }

    C1082bb() {
    }

    /* renamed from: a */
    private static Rect m6490a() {
        if (f3522a == null) {
            f3522a = new ThreadLocal<>();
        }
        Rect rect = f3522a.get();
        if (rect == null) {
            rect = new Rect();
            f3522a.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    /* renamed from: a */
    public static Object m6491a(View view, Object obj) {
        WindowInsets windowInsets = (WindowInsets) obj;
        WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(windowInsets);
        return onApplyWindowInsets != windowInsets ? new WindowInsets(onApplyWindowInsets) : obj;
    }

    /* renamed from: a */
    public static String m6492a(View view) {
        return view.getTransitionName();
    }

    /* renamed from: a */
    public static void m6493a(View view, float f) {
        view.setElevation(f);
    }

    /* renamed from: a */
    static void m6494a(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
        if (Build.VERSION.SDK_INT == 21) {
            Drawable background = view.getBackground();
            boolean z = (view.getBackgroundTintList() == null || view.getBackgroundTintMode() == null) ? false : true;
            if (background != null && z) {
                if (background.isStateful()) {
                    background.setState(view.getDrawableState());
                }
                view.setBackground(background);
            }
        }
    }

    /* renamed from: a */
    static void m6495a(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
        if (Build.VERSION.SDK_INT == 21) {
            Drawable background = view.getBackground();
            boolean z = (view.getBackgroundTintList() == null || view.getBackgroundTintMode() == null) ? false : true;
            if (background != null && z) {
                if (background.isStateful()) {
                    background.setState(view.getDrawableState());
                }
                view.setBackground(background);
            }
        }
    }

    /* renamed from: a */
    public static void m6496a(View view, final C1084a aVar) {
        if (aVar == null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) null);
        } else {
            view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() {
                public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    return (WindowInsets) aVar.mo3762a(view, windowInsets);
                }
            });
        }
    }

    /* renamed from: a */
    public static void m6497a(View view, String str) {
        view.setTransitionName(str);
    }

    /* renamed from: a */
    public static void m6498a(View view, boolean z) {
        view.setNestedScrollingEnabled(z);
    }

    /* renamed from: a */
    public static boolean m6499a(View view, float f, float f2) {
        return view.dispatchNestedPreFling(f, f2);
    }

    /* renamed from: a */
    public static boolean m6500a(View view, float f, float f2, boolean z) {
        return view.dispatchNestedFling(f, f2, z);
    }

    /* renamed from: a */
    public static boolean m6501a(View view, int i) {
        return view.startNestedScroll(i);
    }

    /* renamed from: a */
    public static boolean m6502a(View view, int i, int i2, int i3, int i4, int[] iArr) {
        return view.dispatchNestedScroll(i, i2, i3, i4, iArr);
    }

    /* renamed from: a */
    public static boolean m6503a(View view, int i, int i2, int[] iArr, int[] iArr2) {
        return view.dispatchNestedPreScroll(i, i2, iArr, iArr2);
    }

    /* renamed from: b */
    public static Object m6504b(View view, Object obj) {
        WindowInsets windowInsets = (WindowInsets) obj;
        WindowInsets dispatchApplyWindowInsets = view.dispatchApplyWindowInsets(windowInsets);
        return dispatchApplyWindowInsets != windowInsets ? new WindowInsets(dispatchApplyWindowInsets) : obj;
    }

    /* renamed from: b */
    public static void m6505b(View view) {
        view.requestApplyInsets();
    }

    /* renamed from: b */
    public static void m6506b(View view, float f) {
        view.setTranslationZ(f);
    }

    /* renamed from: b */
    static void m6507b(View view, int i) {
        boolean z;
        Rect a = m6490a();
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            a.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z = !a.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        } else {
            z = false;
        }
        C1060au.m6341a(view, i);
        if (z && a.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(a);
        }
    }

    /* renamed from: c */
    public static float m6508c(View view) {
        return view.getElevation();
    }

    /* renamed from: c */
    public static void m6509c(View view, float f) {
        view.setZ(f);
    }

    /* renamed from: c */
    static void m6510c(View view, int i) {
        boolean z;
        Rect a = m6490a();
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            a.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z = !a.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        } else {
            z = false;
        }
        C1060au.m6346b(view, i);
        if (z && a.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(a);
        }
    }

    /* renamed from: d */
    public static float m6511d(View view) {
        return view.getTranslationZ();
    }

    /* renamed from: e */
    public static boolean m6512e(View view) {
        return view.isImportantForAccessibility();
    }

    /* renamed from: f */
    static ColorStateList m6513f(View view) {
        return view.getBackgroundTintList();
    }

    /* renamed from: g */
    static PorterDuff.Mode m6514g(View view) {
        return view.getBackgroundTintMode();
    }

    /* renamed from: h */
    public static boolean m6515h(View view) {
        return view.isNestedScrollingEnabled();
    }

    /* renamed from: i */
    public static void m6516i(View view) {
        view.stopNestedScroll();
    }

    /* renamed from: j */
    public static boolean m6517j(View view) {
        return view.hasNestedScrollingParent();
    }

    /* renamed from: k */
    public static float m6518k(View view) {
        return view.getZ();
    }
}
