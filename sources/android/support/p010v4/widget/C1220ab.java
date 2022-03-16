package android.support.p010v4.widget;

import android.annotation.TargetApi;
import android.support.annotation.C0007ae;
import android.util.Log;
import android.widget.PopupWindow;
import java.lang.reflect.Field;

@C0007ae(mo1a = 21)
@TargetApi(21)
/* renamed from: android.support.v4.widget.ab */
class C1220ab {

    /* renamed from: a */
    private static final String f3788a = "PopupWindowCompatApi21";

    /* renamed from: b */
    private static Field f3789b;

    static {
        try {
            f3789b = PopupWindow.class.getDeclaredField("mOverlapAnchor");
            f3789b.setAccessible(true);
        } catch (NoSuchFieldException e) {
            Log.i(f3788a, "Could not fetch mOverlapAnchor field from PopupWindow", e);
        }
    }

    C1220ab() {
    }

    /* renamed from: a */
    static void m7251a(PopupWindow popupWindow, boolean z) {
        if (f3789b != null) {
            try {
                f3789b.set(popupWindow, Boolean.valueOf(z));
            } catch (IllegalAccessException e) {
                Log.i(f3788a, "Could not set overlap anchor field in PopupWindow", e);
            }
        }
    }

    /* renamed from: a */
    static boolean m7252a(PopupWindow popupWindow) {
        if (f3789b != null) {
            try {
                return ((Boolean) f3789b.get(popupWindow)).booleanValue();
            } catch (IllegalAccessException e) {
                Log.i(f3788a, "Could not get overlap anchor field in PopupWindow", e);
            }
        }
        return false;
    }
}
