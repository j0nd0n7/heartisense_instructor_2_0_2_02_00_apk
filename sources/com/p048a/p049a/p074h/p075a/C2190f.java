package com.p048a.p049a.p074h.p075a;

import android.view.View;
import android.view.animation.Animation;
import com.p048a.p049a.p074h.p075a.C2185c;

/* renamed from: com.a.a.h.a.f */
public class C2190f<R> implements C2185c<R> {

    /* renamed from: a */
    private final C2191a f7202a;

    /* renamed from: com.a.a.h.a.f$a */
    interface C2191a {
        /* renamed from: a */
        Animation mo8188a();
    }

    C2190f(C2191a aVar) {
        this.f7202a = aVar;
    }

    /* renamed from: a */
    public boolean mo8190a(R r, C2185c.C2186a aVar) {
        View a = aVar.mo8191a();
        if (a == null) {
            return false;
        }
        a.clearAnimation();
        a.startAnimation(this.f7202a.mo8188a());
        return false;
    }
}
