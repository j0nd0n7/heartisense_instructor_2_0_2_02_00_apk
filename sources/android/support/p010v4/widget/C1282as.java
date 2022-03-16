package android.support.p010v4.widget;

import android.annotation.TargetApi;
import android.graphics.drawable.Drawable;
import android.support.annotation.C0003aa;
import android.support.annotation.C0007ae;
import android.support.annotation.C0047z;
import android.widget.TextView;

@C0007ae(mo1a = 17)
@TargetApi(17)
/* renamed from: android.support.v4.widget.as */
class C1282as {
    C1282as() {
    }

    /* renamed from: a */
    public static void m7527a(@C0047z TextView textView, int i, int i2, int i3, int i4) {
        boolean z = textView.getLayoutDirection() == 1;
        int i5 = z ? i3 : i;
        if (!z) {
            i = i3;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds(i5, i2, i, i4);
    }

    /* renamed from: a */
    public static void m7528a(@C0047z TextView textView, @C0003aa Drawable drawable, @C0003aa Drawable drawable2, @C0003aa Drawable drawable3, @C0003aa Drawable drawable4) {
        boolean z = textView.getLayoutDirection() == 1;
        Drawable drawable5 = z ? drawable3 : drawable;
        if (!z) {
            drawable = drawable3;
        }
        textView.setCompoundDrawables(drawable5, drawable2, drawable, drawable4);
    }

    /* renamed from: a */
    public static Drawable[] m7529a(@C0047z TextView textView) {
        boolean z = true;
        if (textView.getLayoutDirection() != 1) {
            z = false;
        }
        Drawable[] compoundDrawables = textView.getCompoundDrawables();
        if (z) {
            Drawable drawable = compoundDrawables[2];
            Drawable drawable2 = compoundDrawables[0];
            compoundDrawables[0] = drawable;
            compoundDrawables[2] = drawable2;
        }
        return compoundDrawables;
    }

    /* renamed from: b */
    public static void m7530b(@C0047z TextView textView, @C0003aa Drawable drawable, @C0003aa Drawable drawable2, @C0003aa Drawable drawable3, @C0003aa Drawable drawable4) {
        boolean z = textView.getLayoutDirection() == 1;
        Drawable drawable5 = z ? drawable3 : drawable;
        if (!z) {
            drawable = drawable3;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds(drawable5, drawable2, drawable, drawable4);
    }
}
