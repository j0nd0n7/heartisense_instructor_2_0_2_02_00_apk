package android.support.p010v4.view;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.support.annotation.C0007ae;
import android.view.Display;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowManager;
import java.lang.reflect.Field;

@C0007ae(mo1a = 9)
@TargetApi(9)
/* renamed from: android.support.v4.view.at */
class C1059at {

    /* renamed from: a */
    private static final String f3502a = "ViewCompatBase";

    /* renamed from: b */
    private static Field f3503b;

    /* renamed from: c */
    private static boolean f3504c;

    /* renamed from: d */
    private static Field f3505d;

    /* renamed from: e */
    private static boolean f3506e;

    C1059at() {
    }

    /* renamed from: a */
    static ColorStateList m6325a(View view) {
        if (view instanceof C1034ao) {
            return ((C1034ao) view).getSupportBackgroundTintList();
        }
        return null;
    }

    /* renamed from: a */
    static void m6326a(View view, int i) {
        int top = view.getTop();
        view.offsetTopAndBottom(i);
        if (i != 0) {
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                int abs = Math.abs(i);
                ((View) parent).invalidate(view.getLeft(), top - abs, view.getRight(), top + view.getHeight() + abs);
                return;
            }
            view.invalidate();
        }
    }

    /* renamed from: a */
    static void m6327a(View view, ColorStateList colorStateList) {
        if (view instanceof C1034ao) {
            ((C1034ao) view).setSupportBackgroundTintList(colorStateList);
        }
    }

    /* renamed from: a */
    static void m6328a(View view, PorterDuff.Mode mode) {
        if (view instanceof C1034ao) {
            ((C1034ao) view).setSupportBackgroundTintMode(mode);
        }
    }

    /* renamed from: b */
    static PorterDuff.Mode m6329b(View view) {
        if (view instanceof C1034ao) {
            return ((C1034ao) view).getSupportBackgroundTintMode();
        }
        return null;
    }

    /* renamed from: b */
    static void m6330b(View view, int i) {
        int left = view.getLeft();
        view.offsetLeftAndRight(i);
        if (i != 0) {
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                int abs = Math.abs(i);
                ((View) parent).invalidate(left - abs, view.getTop(), left + view.getWidth() + abs, view.getBottom());
                return;
            }
            view.invalidate();
        }
    }

    /* renamed from: c */
    static boolean m6331c(View view) {
        return view.getWidth() > 0 && view.getHeight() > 0;
    }

    /* renamed from: d */
    static int m6332d(View view) {
        if (!f3504c) {
            try {
                f3503b = View.class.getDeclaredField("mMinWidth");
                f3503b.setAccessible(true);
            } catch (NoSuchFieldException e) {
            }
            f3504c = true;
        }
        if (f3503b != null) {
            try {
                return ((Integer) f3503b.get(view)).intValue();
            } catch (Exception e2) {
            }
        }
        return 0;
    }

    /* renamed from: e */
    static int m6333e(View view) {
        if (!f3506e) {
            try {
                f3505d = View.class.getDeclaredField("mMinHeight");
                f3505d.setAccessible(true);
            } catch (NoSuchFieldException e) {
            }
            f3506e = true;
        }
        if (f3505d != null) {
            try {
                return ((Integer) f3505d.get(view)).intValue();
            } catch (Exception e2) {
            }
        }
        return 0;
    }

    /* renamed from: f */
    static boolean m6334f(View view) {
        return view.getWindowToken() != null;
    }

    /* renamed from: g */
    static Display m6335g(View view) {
        if (m6334f(view)) {
            return ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay();
        }
        return null;
    }
}
