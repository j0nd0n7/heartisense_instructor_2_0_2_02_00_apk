package android.support.p010v4.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.annotation.C0007ae;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;

@C0007ae(mo1a = 21)
@TargetApi(21)
/* renamed from: android.support.v4.widget.k */
class C1320k {

    /* renamed from: a */
    private static final int[] f4097a = {16843828};

    /* renamed from: android.support.v4.widget.k$a */
    static class C1321a implements View.OnApplyWindowInsetsListener {
        C1321a() {
        }

        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            ((C1322l) view).mo4397a(windowInsets, windowInsets.getSystemWindowInsetTop() > 0);
            return windowInsets.consumeSystemWindowInsets();
        }
    }

    C1320k() {
    }

    /* renamed from: a */
    public static int m7750a(Object obj) {
        if (obj != null) {
            return ((WindowInsets) obj).getSystemWindowInsetTop();
        }
        return 0;
    }

    /* renamed from: a */
    public static Drawable m7751a(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f4097a);
        try {
            return obtainStyledAttributes.getDrawable(0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: a */
    public static void m7752a(View view) {
        if (view instanceof C1322l) {
            view.setOnApplyWindowInsetsListener(new C1321a());
            view.setSystemUiVisibility(1280);
        }
    }

    /* renamed from: a */
    public static void m7753a(View view, Object obj, int i) {
        WindowInsets windowInsets = (WindowInsets) obj;
        if (i == 3) {
            windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), 0, windowInsets.getSystemWindowInsetBottom());
        } else if (i == 5) {
            windowInsets = windowInsets.replaceSystemWindowInsets(0, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        view.dispatchApplyWindowInsets(windowInsets);
    }

    /* renamed from: a */
    public static void m7754a(ViewGroup.MarginLayoutParams marginLayoutParams, Object obj, int i) {
        WindowInsets windowInsets = (WindowInsets) obj;
        if (i == 3) {
            windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), 0, windowInsets.getSystemWindowInsetBottom());
        } else if (i == 5) {
            windowInsets = windowInsets.replaceSystemWindowInsets(0, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        marginLayoutParams.leftMargin = windowInsets.getSystemWindowInsetLeft();
        marginLayoutParams.topMargin = windowInsets.getSystemWindowInsetTop();
        marginLayoutParams.rightMargin = windowInsets.getSystemWindowInsetRight();
        marginLayoutParams.bottomMargin = windowInsets.getSystemWindowInsetBottom();
    }
}
