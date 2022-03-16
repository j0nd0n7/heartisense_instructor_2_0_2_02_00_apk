package android.support.p010v4.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
import android.support.annotation.C0007ae;
import android.view.View;

@C0007ae(mo1a = 16)
@TargetApi(16)
/* renamed from: android.support.v4.view.bq */
class C1124bq {
    C1124bq() {
    }

    /* renamed from: a */
    public static void m6798a(View view) {
        view.animate().withLayer();
    }

    /* renamed from: a */
    public static void m6799a(final View view, final C1130bu buVar) {
        if (buVar != null) {
            view.animate().setListener(new AnimatorListenerAdapter() {
                public void onAnimationCancel(Animator animator) {
                    buVar.mo3895c(view);
                }

                public void onAnimationEnd(Animator animator) {
                    buVar.mo3894b(view);
                }

                public void onAnimationStart(Animator animator) {
                    buVar.mo3893a(view);
                }
            });
        } else {
            view.animate().setListener((Animator.AnimatorListener) null);
        }
    }

    /* renamed from: a */
    public static void m6800a(View view, Runnable runnable) {
        view.animate().withStartAction(runnable);
    }

    /* renamed from: b */
    public static void m6801b(View view, Runnable runnable) {
        view.animate().withEndAction(runnable);
    }
}
