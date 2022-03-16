package android.support.p010v4.p013c;

import android.annotation.TargetApi;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.annotation.C0007ae;
import android.util.AttributeSet;

@C0007ae(mo1a = 18)
@TargetApi(18)
/* renamed from: android.support.v4.c.c */
class C0354c {

    /* renamed from: a */
    private static final String f1845a = "ActionBarDrawerToggleImplJellybeanMR2";

    /* renamed from: b */
    private static final int[] f1846b = {16843531};

    C0354c() {
    }

    /* renamed from: a */
    public static Drawable m2073a(Activity activity) {
        ActionBar actionBar = activity.getActionBar();
        Context context = activity;
        if (actionBar != null) {
            context = actionBar.getThemedContext();
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, f1846b, 16843470, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        return drawable;
    }

    /* renamed from: a */
    public static Object m2074a(Object obj, Activity activity, int i) {
        ActionBar actionBar = activity.getActionBar();
        if (actionBar != null) {
            actionBar.setHomeActionContentDescription(i);
        }
        return obj;
    }

    /* renamed from: a */
    public static Object m2075a(Object obj, Activity activity, Drawable drawable, int i) {
        ActionBar actionBar = activity.getActionBar();
        if (actionBar != null) {
            actionBar.setHomeAsUpIndicator(drawable);
            actionBar.setHomeActionContentDescription(i);
        }
        return obj;
    }
}
