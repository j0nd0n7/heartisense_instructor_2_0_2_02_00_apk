package android.support.p010v4.view.p035b;

import android.annotation.TargetApi;
import android.graphics.Path;
import android.support.annotation.C0007ae;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

@C0007ae(mo1a = 21)
@TargetApi(21)
/* renamed from: android.support.v4.view.b.f */
class C1078f {
    private C1078f() {
    }

    /* renamed from: a */
    public static Interpolator m6477a(float f, float f2) {
        return new PathInterpolator(f, f2);
    }

    /* renamed from: a */
    public static Interpolator m6478a(float f, float f2, float f3, float f4) {
        return new PathInterpolator(f, f2, f3, f4);
    }

    /* renamed from: a */
    public static Interpolator m6479a(Path path) {
        return new PathInterpolator(path);
    }
}
