package android.support.p010v4.p014d.p016b;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.support.annotation.C0007ae;
import android.support.annotation.C0047z;
import android.util.DisplayMetrics;

@C0007ae(mo1a = 9)
@TargetApi(9)
/* renamed from: android.support.v4.d.b.b */
class C0425b {
    C0425b() {
    }

    /* renamed from: a */
    static int m2343a(@C0047z Resources resources) {
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        return (int) (((float) displayMetrics.heightPixels) / displayMetrics.density);
    }

    /* renamed from: b */
    static int m2344b(@C0047z Resources resources) {
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        return (int) (((float) displayMetrics.widthPixels) / displayMetrics.density);
    }

    /* renamed from: c */
    static int m2345c(@C0047z Resources resources) {
        return Math.min(m2344b(resources), m2343a(resources));
    }

    /* renamed from: d */
    static int m2346d(@C0047z Resources resources) {
        return resources.getDisplayMetrics().densityDpi;
    }
}
