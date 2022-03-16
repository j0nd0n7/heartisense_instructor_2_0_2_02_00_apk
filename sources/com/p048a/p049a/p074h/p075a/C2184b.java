package com.p048a.p049a.p074h.p075a;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import com.p048a.p049a.p074h.p075a.C2185c;

/* renamed from: com.a.a.h.a.b */
public class C2184b<T extends Drawable> implements C2185c<T> {

    /* renamed from: a */
    private final C2185c<T> f7198a;

    /* renamed from: b */
    private final int f7199b;

    public C2184b(C2185c<T> cVar, int i) {
        this.f7198a = cVar;
        this.f7199b = i;
    }

    /* renamed from: a */
    public boolean mo8190a(T t, C2185c.C2186a aVar) {
        Drawable b = aVar.mo8192b();
        if (b != null) {
            TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{b, t});
            transitionDrawable.setCrossFadeEnabled(true);
            transitionDrawable.startTransition(this.f7199b);
            aVar.mo8193c(transitionDrawable);
            return true;
        }
        this.f7198a.mo8190a(t, aVar);
        return false;
    }
}
