package android.support.p010v4.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
import android.support.annotation.C0007ae;
import android.view.View;
import android.view.animation.Interpolator;

@C0007ae(mo1a = 14)
@TargetApi(14)
/* renamed from: android.support.v4.view.bp */
class C1122bp {
    C1122bp() {
    }

    /* renamed from: a */
    public static long m6770a(View view) {
        return view.animate().getDuration();
    }

    /* renamed from: a */
    public static void m6771a(View view, float f) {
        view.animate().alpha(f);
    }

    /* renamed from: a */
    public static void m6772a(View view, long j) {
        view.animate().setDuration(j);
    }

    /* renamed from: a */
    public static void m6773a(final View view, final C1130bu buVar) {
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
    public static void m6774a(View view, Interpolator interpolator) {
        view.animate().setInterpolator(interpolator);
    }

    /* renamed from: b */
    public static long m6775b(View view) {
        return view.animate().getStartDelay();
    }

    /* renamed from: b */
    public static void m6776b(View view, float f) {
        view.animate().translationX(f);
    }

    /* renamed from: b */
    public static void m6777b(View view, long j) {
        view.animate().setStartDelay(j);
    }

    /* renamed from: c */
    public static void m6778c(View view) {
        view.animate().cancel();
    }

    /* renamed from: c */
    public static void m6779c(View view, float f) {
        view.animate().translationY(f);
    }

    /* renamed from: d */
    public static void m6780d(View view) {
        view.animate().start();
    }

    /* renamed from: d */
    public static void m6781d(View view, float f) {
        view.animate().alphaBy(f);
    }

    /* renamed from: e */
    public static void m6782e(View view, float f) {
        view.animate().rotation(f);
    }

    /* renamed from: f */
    public static void m6783f(View view, float f) {
        view.animate().rotationBy(f);
    }

    /* renamed from: g */
    public static void m6784g(View view, float f) {
        view.animate().rotationX(f);
    }

    /* renamed from: h */
    public static void m6785h(View view, float f) {
        view.animate().rotationXBy(f);
    }

    /* renamed from: i */
    public static void m6786i(View view, float f) {
        view.animate().rotationY(f);
    }

    /* renamed from: j */
    public static void m6787j(View view, float f) {
        view.animate().rotationYBy(f);
    }

    /* renamed from: k */
    public static void m6788k(View view, float f) {
        view.animate().scaleX(f);
    }

    /* renamed from: l */
    public static void m6789l(View view, float f) {
        view.animate().scaleXBy(f);
    }

    /* renamed from: m */
    public static void m6790m(View view, float f) {
        view.animate().scaleY(f);
    }

    /* renamed from: n */
    public static void m6791n(View view, float f) {
        view.animate().scaleYBy(f);
    }

    /* renamed from: o */
    public static void m6792o(View view, float f) {
        view.animate().x(f);
    }

    /* renamed from: p */
    public static void m6793p(View view, float f) {
        view.animate().xBy(f);
    }

    /* renamed from: q */
    public static void m6794q(View view, float f) {
        view.animate().y(f);
    }

    /* renamed from: r */
    public static void m6795r(View view, float f) {
        view.animate().yBy(f);
    }

    /* renamed from: s */
    public static void m6796s(View view, float f) {
        view.animate().translationXBy(f);
    }

    /* renamed from: t */
    public static void m6797t(View view, float f) {
        view.animate().translationYBy(f);
    }
}
