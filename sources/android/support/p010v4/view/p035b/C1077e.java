package android.support.p010v4.view.p035b;

import android.graphics.Path;
import android.os.Build;
import android.view.animation.Interpolator;

/* renamed from: android.support.v4.view.b.e */
public final class C1077e {
    private C1077e() {
    }

    /* renamed from: a */
    public static Interpolator m6474a(float f, float f2) {
        return Build.VERSION.SDK_INT >= 21 ? C1078f.m6477a(f, f2) : C1079g.m6480a(f, f2);
    }

    /* renamed from: a */
    public static Interpolator m6475a(float f, float f2, float f3, float f4) {
        return Build.VERSION.SDK_INT >= 21 ? C1078f.m6478a(f, f2, f3, f4) : C1079g.m6481a(f, f2, f3, f4);
    }

    /* renamed from: a */
    public static Interpolator m6476a(Path path) {
        return Build.VERSION.SDK_INT >= 21 ? C1078f.m6479a(path) : C1079g.m6482a(path);
    }
}
