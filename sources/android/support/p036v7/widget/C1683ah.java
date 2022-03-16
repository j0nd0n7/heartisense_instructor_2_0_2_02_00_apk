package android.support.p036v7.widget;

import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build;
import android.support.annotation.C0011ag;
import android.support.annotation.C0047z;
import android.support.p010v4.p018f.p019a.C0484a;
import android.support.p010v4.p018f.p019a.C0498h;
import android.support.p036v7.p040c.p041a.C1480a;
import android.util.Log;
import java.lang.reflect.Field;

@C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
/* renamed from: android.support.v7.widget.ah */
public class C1683ah {

    /* renamed from: a */
    public static final Rect f5633a = new Rect();

    /* renamed from: b */
    private static final String f5634b = "DrawableUtils";

    /* renamed from: c */
    private static Class<?> f5635c = null;

    /* renamed from: d */
    private static final String f5636d = "android.graphics.drawable.VectorDrawable";

    static {
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                f5635c = Class.forName("android.graphics.Insets");
            } catch (ClassNotFoundException e) {
            }
        }
    }

    private C1683ah() {
    }

    /* renamed from: a */
    static PorterDuff.Mode m10099a(int i, PorterDuff.Mode mode) {
        switch (i) {
            case 3:
                return PorterDuff.Mode.SRC_OVER;
            case 5:
                return PorterDuff.Mode.SRC_IN;
            case 9:
                return PorterDuff.Mode.SRC_ATOP;
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return Build.VERSION.SDK_INT >= 11 ? PorterDuff.Mode.valueOf("ADD") : mode;
            default:
                return mode;
        }
    }

    /* renamed from: a */
    public static Rect m10100a(Drawable drawable) {
        if (f5635c != null) {
            try {
                Drawable h = C0484a.m2552h(drawable);
                Object invoke = h.getClass().getMethod("getOpticalInsets", new Class[0]).invoke(h, new Object[0]);
                if (invoke != null) {
                    Rect rect = new Rect();
                    for (Field field : f5635c.getFields()) {
                        String name = field.getName();
                        char c = 65535;
                        switch (name.hashCode()) {
                            case -1383228885:
                                if (name.equals("bottom")) {
                                    c = 3;
                                    break;
                                }
                                break;
                            case 115029:
                                if (name.equals("top")) {
                                    c = 1;
                                    break;
                                }
                                break;
                            case 3317767:
                                if (name.equals("left")) {
                                    c = 0;
                                    break;
                                }
                                break;
                            case 108511772:
                                if (name.equals("right")) {
                                    c = 2;
                                    break;
                                }
                                break;
                        }
                        switch (c) {
                            case 0:
                                rect.left = field.getInt(invoke);
                                break;
                            case 1:
                                rect.top = field.getInt(invoke);
                                break;
                            case 2:
                                rect.right = field.getInt(invoke);
                                break;
                            case 3:
                                rect.bottom = field.getInt(invoke);
                                break;
                        }
                    }
                    return rect;
                }
            } catch (Exception e) {
                Log.e(f5634b, "Couldn't obtain the optical insets. Ignoring.");
            }
        }
        return f5633a;
    }

    /* renamed from: b */
    static void m10101b(@C0047z Drawable drawable) {
        if (Build.VERSION.SDK_INT == 21 && f5636d.equals(drawable.getClass().getName())) {
            m10103d(drawable);
        }
    }

    /* renamed from: c */
    public static boolean m10102c(@C0047z Drawable drawable) {
        if (Build.VERSION.SDK_INT < 15 && (drawable instanceof InsetDrawable)) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 15 && (drawable instanceof GradientDrawable)) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 17 && (drawable instanceof LayerDrawable)) {
            return false;
        }
        if (drawable instanceof DrawableContainer) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState instanceof DrawableContainer.DrawableContainerState) {
                for (Drawable c : ((DrawableContainer.DrawableContainerState) constantState).getChildren()) {
                    if (!m10102c(c)) {
                        return false;
                    }
                }
            }
        } else if (drawable instanceof C0498h) {
            return m10102c(((C0498h) drawable).mo1830a());
        } else {
            if (drawable instanceof C1480a) {
                return m10102c(((C1480a) drawable).mo4979a());
            }
            if (drawable instanceof ScaleDrawable) {
                return m10102c(((ScaleDrawable) drawable).getDrawable());
            }
        }
        return true;
    }

    /* renamed from: d */
    private static void m10103d(Drawable drawable) {
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(C1801bk.f6087e);
        } else {
            drawable.setState(C1801bk.f6090h);
        }
        drawable.setState(state);
    }
}
