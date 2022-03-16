package android.support.p010v4.p018f;

import android.graphics.Paint;
import android.os.Build;
import android.support.annotation.C0047z;

/* renamed from: android.support.v4.f.f */
public final class C0517f {
    private C0517f() {
    }

    /* renamed from: a */
    public static boolean m2711a(@C0047z Paint paint, @C0047z String str) {
        return Build.VERSION.SDK_INT >= 23 ? C0518g.m2712a(paint, str) : C0519h.m2714a(paint, str);
    }
}
