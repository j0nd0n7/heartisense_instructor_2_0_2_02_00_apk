package android.support.p006e.p007a;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;
import android.support.annotation.C0007ae;
import android.support.annotation.C0047z;

/* renamed from: android.support.e.a.b */
public interface C0117b extends Animatable {

    /* renamed from: android.support.e.a.b$a */
    public static abstract class C0118a {

        /* renamed from: a */
        Animatable2.AnimationCallback f882a;

        /* access modifiers changed from: package-private */
        @C0007ae(mo1a = 23)
        /* renamed from: a */
        public Animatable2.AnimationCallback mo557a() {
            if (this.f882a == null) {
                this.f882a = new Animatable2.AnimationCallback() {
                    public void onAnimationEnd(Drawable drawable) {
                        C0118a.this.mo559b(drawable);
                    }

                    public void onAnimationStart(Drawable drawable) {
                        C0118a.this.mo558a(drawable);
                    }
                };
            }
            return this.f882a;
        }

        /* renamed from: a */
        public void mo558a(Drawable drawable) {
        }

        /* renamed from: b */
        public void mo559b(Drawable drawable) {
        }
    }

    /* renamed from: a */
    void mo554a();

    /* renamed from: a */
    void mo555a(@C0047z C0118a aVar);

    /* renamed from: b */
    boolean mo556b(@C0047z C0118a aVar);
}
