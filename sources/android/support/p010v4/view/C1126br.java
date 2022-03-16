package android.support.p010v4.view;

import android.annotation.TargetApi;
import android.support.annotation.C0007ae;
import android.view.View;
import android.view.animation.Interpolator;

@C0007ae(mo1a = 18)
@TargetApi(18)
/* renamed from: android.support.v4.view.br */
class C1126br {
    C1126br() {
    }

    /* renamed from: a */
    public static Interpolator m6802a(View view) {
        return (Interpolator) view.animate().getInterpolator();
    }
}
