package com.p048a.p049a.p074h.p075a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import com.p048a.p049a.p074h.p075a.C2190f;

/* renamed from: com.a.a.h.a.a */
public class C2182a<T extends Drawable> implements C2187d<T> {

    /* renamed from: a */
    private static final int f7192a = 300;

    /* renamed from: b */
    private final C2192g<T> f7193b;

    /* renamed from: c */
    private final int f7194c;

    /* renamed from: d */
    private C2184b<T> f7195d;

    /* renamed from: e */
    private C2184b<T> f7196e;

    /* renamed from: com.a.a.h.a.a$a */
    private static class C2183a implements C2190f.C2191a {

        /* renamed from: a */
        private final int f7197a;

        C2183a(int i) {
            this.f7197a = i;
        }

        /* renamed from: a */
        public Animation mo8188a() {
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration((long) this.f7197a);
            return alphaAnimation;
        }
    }

    public C2182a() {
        this(f7192a);
    }

    public C2182a(int i) {
        this(new C2192g((C2190f.C2191a) new C2183a(i)), i);
    }

    public C2182a(Context context, int i, int i2) {
        this(new C2192g(context, i), i2);
    }

    public C2182a(Animation animation, int i) {
        this(new C2192g(animation), i);
    }

    C2182a(C2192g<T> gVar, int i) {
        this.f7193b = gVar;
        this.f7194c = i;
    }

    /* renamed from: a */
    private C2185c<T> m12440a() {
        if (this.f7195d == null) {
            this.f7195d = new C2184b<>(this.f7193b.mo8187a(false, true), this.f7194c);
        }
        return this.f7195d;
    }

    /* renamed from: b */
    private C2185c<T> m12441b() {
        if (this.f7196e == null) {
            this.f7196e = new C2184b<>(this.f7193b.mo8187a(false, false), this.f7194c);
        }
        return this.f7196e;
    }

    /* renamed from: a */
    public C2185c<T> mo8187a(boolean z, boolean z2) {
        return z ? C2188e.m12452b() : z2 ? m12440a() : m12441b();
    }
}
