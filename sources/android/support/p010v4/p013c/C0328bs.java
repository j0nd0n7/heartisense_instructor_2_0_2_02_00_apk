package android.support.p010v4.p013c;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: android.support.v4.c.bs */
class C0328bs implements View.OnAttachStateChangeListener, ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    private final View f1800a;

    /* renamed from: b */
    private ViewTreeObserver f1801b;

    /* renamed from: c */
    private final Runnable f1802c;

    private C0328bs(View view, Runnable runnable) {
        this.f1800a = view;
        this.f1801b = view.getViewTreeObserver();
        this.f1802c = runnable;
    }

    /* renamed from: a */
    public static C0328bs m1968a(View view, Runnable runnable) {
        C0328bs bsVar = new C0328bs(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(bsVar);
        view.addOnAttachStateChangeListener(bsVar);
        return bsVar;
    }

    /* renamed from: a */
    public void mo1549a() {
        if (this.f1801b.isAlive()) {
            this.f1801b.removeOnPreDrawListener(this);
        } else {
            this.f1800a.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f1800a.removeOnAttachStateChangeListener(this);
    }

    public boolean onPreDraw() {
        mo1549a();
        this.f1802c.run();
        return true;
    }

    public void onViewAttachedToWindow(View view) {
        this.f1801b = view.getViewTreeObserver();
    }

    public void onViewDetachedFromWindow(View view) {
        mo1549a();
    }
}
