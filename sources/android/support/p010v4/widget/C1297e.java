package android.support.p010v4.widget;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.annotation.C0007ae;
import android.util.Log;
import android.widget.CompoundButton;
import java.lang.reflect.Field;

@C0007ae(mo1a = 9)
@TargetApi(9)
/* renamed from: android.support.v4.widget.e */
class C1297e {

    /* renamed from: a */
    private static final String f3995a = "CompoundButtonCompatGingerbread";

    /* renamed from: b */
    private static Field f3996b;

    /* renamed from: c */
    private static boolean f3997c;

    C1297e() {
    }

    /* renamed from: a */
    static ColorStateList m7622a(CompoundButton compoundButton) {
        if (compoundButton instanceof C1284au) {
            return ((C1284au) compoundButton).getSupportButtonTintList();
        }
        return null;
    }

    /* renamed from: a */
    static void m7623a(CompoundButton compoundButton, ColorStateList colorStateList) {
        if (compoundButton instanceof C1284au) {
            ((C1284au) compoundButton).setSupportButtonTintList(colorStateList);
        }
    }

    /* renamed from: a */
    static void m7624a(CompoundButton compoundButton, PorterDuff.Mode mode) {
        if (compoundButton instanceof C1284au) {
            ((C1284au) compoundButton).setSupportButtonTintMode(mode);
        }
    }

    /* renamed from: b */
    static PorterDuff.Mode m7625b(CompoundButton compoundButton) {
        if (compoundButton instanceof C1284au) {
            return ((C1284au) compoundButton).getSupportButtonTintMode();
        }
        return null;
    }

    /* renamed from: c */
    static Drawable m7626c(CompoundButton compoundButton) {
        if (!f3997c) {
            try {
                f3996b = CompoundButton.class.getDeclaredField("mButtonDrawable");
                f3996b.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.i(f3995a, "Failed to retrieve mButtonDrawable field", e);
            }
            f3997c = true;
        }
        if (f3996b != null) {
            try {
                return (Drawable) f3996b.get(compoundButton);
            } catch (IllegalAccessException e2) {
                Log.i(f3995a, "Failed to get button drawable via reflection", e2);
                f3996b = null;
            }
        }
        return null;
    }
}
