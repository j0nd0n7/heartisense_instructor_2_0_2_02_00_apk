package android.support.p010v4.p012b;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.support.annotation.C0007ae;
import android.view.View;

@C0007ae(mo1a = 12)
@TargetApi(12)
/* renamed from: android.support.v4.b.f */
class C0170f implements C0165c {

    /* renamed from: a */
    private TimeInterpolator f1068a;

    /* renamed from: android.support.v4.b.f$a */
    static class C0171a implements Animator.AnimatorListener {

        /* renamed from: a */
        final C0164b f1069a;

        /* renamed from: b */
        final C0174g f1070b;

        public C0171a(C0164b bVar, C0174g gVar) {
            this.f1069a = bVar;
            this.f1070b = gVar;
        }

        public void onAnimationCancel(Animator animator) {
            this.f1069a.mo720c(this.f1070b);
        }

        public void onAnimationEnd(Animator animator) {
            this.f1069a.mo719b(this.f1070b);
        }

        public void onAnimationRepeat(Animator animator) {
            this.f1069a.mo721d(this.f1070b);
        }

        public void onAnimationStart(Animator animator) {
            this.f1069a.mo718a(this.f1070b);
        }
    }

    /* renamed from: android.support.v4.b.f$b */
    static class C0172b implements C0174g {

        /* renamed from: a */
        final Animator f1071a;

        public C0172b(Animator animator) {
            this.f1071a = animator;
        }

        /* renamed from: a */
        public void mo725a() {
            this.f1071a.start();
        }

        /* renamed from: a */
        public void mo726a(long j) {
            this.f1071a.setDuration(j);
        }

        /* renamed from: a */
        public void mo727a(C0164b bVar) {
            this.f1071a.addListener(new C0171a(bVar, this));
        }

        /* renamed from: a */
        public void mo728a(final C0166d dVar) {
            if (this.f1071a instanceof ValueAnimator) {
                ((ValueAnimator) this.f1071a).addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        dVar.mo724a(C0172b.this);
                    }
                });
            }
        }

        /* renamed from: a */
        public void mo729a(View view) {
            this.f1071a.setTarget(view);
        }

        /* renamed from: b */
        public void mo730b() {
            this.f1071a.cancel();
        }

        /* renamed from: c */
        public float mo731c() {
            return ((ValueAnimator) this.f1071a).getAnimatedFraction();
        }
    }

    C0170f() {
    }

    /* renamed from: a */
    public C0174g mo722a() {
        return new C0172b(ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}));
    }

    /* renamed from: a */
    public void mo723a(View view) {
        if (this.f1068a == null) {
            this.f1068a = new ValueAnimator().getInterpolator();
        }
        view.animate().setInterpolator(this.f1068a);
    }
}
