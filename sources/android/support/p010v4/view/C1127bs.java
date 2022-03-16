package android.support.p010v4.view;

import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.support.annotation.C0007ae;
import android.view.View;

@C0007ae(mo1a = 19)
@TargetApi(19)
/* renamed from: android.support.v4.view.bs */
class C1127bs {
    C1127bs() {
    }

    /* renamed from: a */
    public static void m6803a(final View view, final C1132bw bwVar) {
        C11281 r0 = null;
        if (bwVar != null) {
            r0 = new ValueAnimator.AnimatorUpdateListener() {
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    bwVar.mo3903a(view);
                }
            };
        }
        view.animate().setUpdateListener(r0);
    }
}
