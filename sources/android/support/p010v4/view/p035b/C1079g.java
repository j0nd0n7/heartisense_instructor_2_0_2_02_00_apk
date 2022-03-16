package android.support.p010v4.view.p035b;

import android.annotation.TargetApi;
import android.graphics.Path;
import android.support.annotation.C0007ae;
import android.view.animation.Interpolator;

@C0007ae(mo1a = 9)
@TargetApi(9)
/* renamed from: android.support.v4.view.b.g */
class C1079g {
    private C1079g() {
    }

    /* renamed from: a */
    public static Interpolator m6480a(float f, float f2) {
        return new C1080h(f, f2);
    }

    /* renamed from: a */
    public static Interpolator m6481a(float f, float f2, float f3, float f4) {
        return new C1080h(f, f2, f3, f4);
    }

    /* renamed from: a */
    public static Interpolator m6482a(Path path) {
        return new C1080h(path);
    }
}
