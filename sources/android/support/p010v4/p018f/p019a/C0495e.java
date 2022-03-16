package android.support.p010v4.p018f.p019a;

import android.annotation.TargetApi;
import android.graphics.drawable.Drawable;
import android.support.annotation.C0007ae;
import android.util.Log;
import java.lang.reflect.Method;

@C0007ae(mo1a = 17)
@TargetApi(17)
/* renamed from: android.support.v4.f.a.e */
class C0495e {

    /* renamed from: a */
    private static final String f2054a = "DrawableCompatJellybeanMr1";

    /* renamed from: b */
    private static Method f2055b;

    /* renamed from: c */
    private static boolean f2056c;

    /* renamed from: d */
    private static Method f2057d;

    /* renamed from: e */
    private static boolean f2058e;

    C0495e() {
    }

    /* renamed from: a */
    public static int m2620a(Drawable drawable) {
        if (!f2058e) {
            try {
                f2057d = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                f2057d.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i(f2054a, "Failed to retrieve getLayoutDirection() method", e);
            }
            f2058e = true;
        }
        if (f2057d != null) {
            try {
                return ((Integer) f2057d.invoke(drawable, new Object[0])).intValue();
            } catch (Exception e2) {
                Log.i(f2054a, "Failed to invoke getLayoutDirection() via reflection", e2);
                f2057d = null;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static boolean m2621a(Drawable drawable, int i) {
        if (!f2056c) {
            Class<Drawable> cls = Drawable.class;
            try {
                f2055b = cls.getDeclaredMethod("setLayoutDirection", new Class[]{Integer.TYPE});
                f2055b.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i(f2054a, "Failed to retrieve setLayoutDirection(int) method", e);
            }
            f2056c = true;
        }
        if (f2055b != null) {
            try {
                f2055b.invoke(drawable, new Object[]{Integer.valueOf(i)});
                return true;
            } catch (Exception e2) {
                Log.i(f2054a, "Failed to invoke setLayoutDirection(int) via reflection", e2);
                f2055b = null;
            }
        }
        return false;
    }
}
