package android.support.p010v4.p014d.p016b;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.C0003aa;
import android.support.annotation.C0032k;
import android.support.annotation.C0033l;
import android.support.annotation.C0036o;
import android.support.annotation.C0047z;

/* renamed from: android.support.v4.d.b.e */
public final class C0428e {
    private C0428e() {
    }

    @C0003aa
    /* renamed from: a */
    public static Drawable m2351a(@C0047z Resources resources, @C0036o int i, int i2, @C0003aa Resources.Theme theme) {
        return Build.VERSION.SDK_INT >= 21 ? C0429f.m2355a(resources, i, i2, theme) : Build.VERSION.SDK_INT >= 15 ? C0431h.m2359a(resources, i, i2) : resources.getDrawable(i);
    }

    @C0003aa
    /* renamed from: a */
    public static Drawable m2352a(@C0047z Resources resources, @C0036o int i, @C0003aa Resources.Theme theme) {
        return Build.VERSION.SDK_INT >= 21 ? C0429f.m2356a(resources, i, theme) : resources.getDrawable(i);
    }

    @C0032k
    /* renamed from: b */
    public static int m2353b(@C0047z Resources resources, @C0033l int i, @C0003aa Resources.Theme theme) {
        return Build.VERSION.SDK_INT >= 23 ? C0430g.m2357a(resources, i, theme) : resources.getColor(i);
    }

    @C0003aa
    /* renamed from: c */
    public static ColorStateList m2354c(@C0047z Resources resources, @C0033l int i, @C0003aa Resources.Theme theme) {
        return Build.VERSION.SDK_INT >= 23 ? C0430g.m2358b(resources, i, theme) : resources.getColorStateList(i);
    }
}
