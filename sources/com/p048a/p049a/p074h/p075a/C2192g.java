package com.p048a.p049a.p074h.p075a;

import android.content.Context;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.p048a.p049a.p074h.p075a.C2190f;

/* renamed from: com.a.a.h.a.g */
public class C2192g<R> implements C2187d<R> {

    /* renamed from: a */
    private final C2190f.C2191a f7203a;

    /* renamed from: b */
    private C2185c<R> f7204b;

    /* renamed from: com.a.a.h.a.g$a */
    private static class C2193a implements C2190f.C2191a {

        /* renamed from: a */
        private final Animation f7205a;

        public C2193a(Animation animation) {
            this.f7205a = animation;
        }

        /* renamed from: a */
        public Animation mo8188a() {
            return this.f7205a;
        }
    }

    /* renamed from: com.a.a.h.a.g$b */
    private static class C2194b implements C2190f.C2191a {

        /* renamed from: a */
        private final Context f7206a;

        /* renamed from: b */
        private final int f7207b;

        public C2194b(Context context, int i) {
            this.f7206a = context.getApplicationContext();
            this.f7207b = i;
        }

        /* renamed from: a */
        public Animation mo8188a() {
            return AnimationUtils.loadAnimation(this.f7206a, this.f7207b);
        }
    }

    public C2192g(Context context, int i) {
        this((C2190f.C2191a) new C2194b(context, i));
    }

    public C2192g(Animation animation) {
        this((C2190f.C2191a) new C2193a(animation));
    }

    C2192g(C2190f.C2191a aVar) {
        this.f7203a = aVar;
    }

    /* renamed from: a */
    public C2185c<R> mo8187a(boolean z, boolean z2) {
        if (z || !z2) {
            return C2188e.m12452b();
        }
        if (this.f7204b == null) {
            this.f7204b = new C2190f(this.f7203a);
        }
        return this.f7204b;
    }
}
