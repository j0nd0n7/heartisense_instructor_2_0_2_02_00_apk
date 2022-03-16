package android.support.p036v7.widget;

import android.graphics.Rect;
import android.os.Build;
import android.support.annotation.C0011ag;
import android.support.p010v4.view.C1040ar;
import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
/* renamed from: android.support.v7.widget.bu */
public class C1819bu {

    /* renamed from: a */
    private static final String f6177a = "ViewUtils";

    /* renamed from: b */
    private static Method f6178b;

    static {
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                f6178b = View.class.getDeclaredMethod("computeFitSystemWindows", new Class[]{Rect.class, Rect.class});
                if (!f6178b.isAccessible()) {
                    f6178b.setAccessible(true);
                }
            } catch (NoSuchMethodException e) {
                Log.d(f6177a, "Could not find method computeFitSystemWindows. Oh well.");
            }
        }
    }

    private C1819bu() {
    }

    /* renamed from: a */
    public static int m11061a(int i, int i2) {
        return i | i2;
    }

    /* renamed from: a */
    public static void m11062a(View view, Rect rect, Rect rect2) {
        if (f6178b != null) {
            try {
                f6178b.invoke(view, new Object[]{rect, rect2});
            } catch (Exception e) {
                Log.d(f6177a, "Could not invoke computeFitSystemWindows", e);
            }
        }
    }

    /* renamed from: a */
    public static boolean m11063a(View view) {
        return C1040ar.m5947k(view) == 1;
    }

    /* renamed from: b */
    public static void m11064b(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            try {
                Method method = view.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
                if (!method.isAccessible()) {
                    method.setAccessible(true);
                }
                method.invoke(view, new Object[0]);
            } catch (NoSuchMethodException e) {
                Log.d(f6177a, "Could not find method makeOptionalFitsSystemWindows. Oh well...");
            } catch (InvocationTargetException e2) {
                Log.d(f6177a, "Could not invoke makeOptionalFitsSystemWindows", e2);
            } catch (IllegalAccessException e3) {
                Log.d(f6177a, "Could not invoke makeOptionalFitsSystemWindows", e3);
            }
        }
    }
}
