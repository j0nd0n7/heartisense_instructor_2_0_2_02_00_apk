package android.support.p036v7.widget;

import android.support.annotation.C0003aa;
import android.support.annotation.C0047z;
import android.support.p036v7.widget.C1732az;
import android.view.View;

/* renamed from: android.support.v7.widget.bg */
public abstract class C1792bg extends C1732az.C1743e {

    /* renamed from: a */
    private static final boolean f5993a = false;

    /* renamed from: b */
    private static final String f5994b = "SimpleItemAnimator";

    /* renamed from: m */
    boolean f5995m = true;

    /* renamed from: a */
    public final void mo7196a(C1732az.C1774x xVar, boolean z) {
        mo7200d(xVar, z);
        mo6816f(xVar);
    }

    /* renamed from: a */
    public void mo7197a(boolean z) {
        this.f5995m = z;
    }

    /* renamed from: a */
    public abstract boolean mo6346a(C1732az.C1774x xVar);

    /* renamed from: a */
    public abstract boolean mo6347a(C1732az.C1774x xVar, int i, int i2, int i3, int i4);

    /* renamed from: a */
    public boolean mo6807a(@C0047z C1732az.C1774x xVar, @C0047z C1732az.C1743e.C1747d dVar, @C0003aa C1732az.C1743e.C1747d dVar2) {
        int i = dVar.f5848a;
        int i2 = dVar.f5849b;
        View view = xVar.itemView;
        int left = dVar2 == null ? view.getLeft() : dVar2.f5848a;
        int top = dVar2 == null ? view.getTop() : dVar2.f5849b;
        if (xVar.isRemoved() || (i == left && i2 == top)) {
            return mo6346a(xVar);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return mo6347a(xVar, i, i2, left, top);
    }

    /* renamed from: a */
    public abstract boolean mo6348a(C1732az.C1774x xVar, C1732az.C1774x xVar2, int i, int i2, int i3, int i4);

    /* renamed from: a */
    public boolean mo6808a(@C0047z C1732az.C1774x xVar, @C0047z C1732az.C1774x xVar2, @C0047z C1732az.C1743e.C1747d dVar, @C0047z C1732az.C1743e.C1747d dVar2) {
        int i;
        int i2;
        int i3 = dVar.f5848a;
        int i4 = dVar.f5849b;
        if (xVar2.shouldIgnore()) {
            i = dVar.f5848a;
            i2 = dVar.f5849b;
        } else {
            i = dVar2.f5848a;
            i2 = dVar2.f5849b;
        }
        return mo6348a(xVar, xVar2, i3, i4, i, i2);
    }

    /* renamed from: b */
    public final void mo7198b(C1732az.C1774x xVar, boolean z) {
        mo7199c(xVar, z);
    }

    /* renamed from: b */
    public abstract boolean mo6352b(C1732az.C1774x xVar);

    /* renamed from: b */
    public boolean mo6810b(@C0047z C1732az.C1774x xVar, @C0003aa C1732az.C1743e.C1747d dVar, @C0047z C1732az.C1743e.C1747d dVar2) {
        if (dVar == null || (dVar.f5848a == dVar2.f5848a && dVar.f5849b == dVar2.f5849b)) {
            return mo6352b(xVar);
        }
        return mo6347a(xVar, dVar.f5848a, dVar.f5849b, dVar2.f5848a, dVar2.f5849b);
    }

    /* renamed from: c */
    public void mo7199c(C1732az.C1774x xVar, boolean z) {
    }

    /* renamed from: c */
    public boolean mo6812c(@C0047z C1732az.C1774x xVar, @C0047z C1732az.C1743e.C1747d dVar, @C0047z C1732az.C1743e.C1747d dVar2) {
        if (dVar.f5848a == dVar2.f5848a && dVar.f5849b == dVar2.f5849b) {
            mo7203l(xVar);
            return false;
        }
        return mo6347a(xVar, dVar.f5848a, dVar.f5849b, dVar2.f5848a, dVar2.f5849b);
    }

    /* renamed from: d */
    public void mo7200d(C1732az.C1774x xVar, boolean z) {
    }

    /* renamed from: j */
    public boolean mo6824j(@C0047z C1732az.C1774x xVar) {
        return !this.f5995m || xVar.isInvalid();
    }

    /* renamed from: k */
    public final void mo7201k(C1732az.C1774x xVar) {
        mo7209r(xVar);
        mo6816f(xVar);
    }

    /* renamed from: k */
    public boolean mo7202k() {
        return this.f5995m;
    }

    /* renamed from: l */
    public final void mo7203l(C1732az.C1774x xVar) {
        mo7213v(xVar);
        mo6816f(xVar);
    }

    /* renamed from: m */
    public final void mo7204m(C1732az.C1774x xVar) {
        mo7211t(xVar);
        mo6816f(xVar);
    }

    /* renamed from: n */
    public final void mo7205n(C1732az.C1774x xVar) {
        mo7208q(xVar);
    }

    /* renamed from: o */
    public final void mo7206o(C1732az.C1774x xVar) {
        mo7212u(xVar);
    }

    /* renamed from: p */
    public final void mo7207p(C1732az.C1774x xVar) {
        mo7210s(xVar);
    }

    /* renamed from: q */
    public void mo7208q(C1732az.C1774x xVar) {
    }

    /* renamed from: r */
    public void mo7209r(C1732az.C1774x xVar) {
    }

    /* renamed from: s */
    public void mo7210s(C1732az.C1774x xVar) {
    }

    /* renamed from: t */
    public void mo7211t(C1732az.C1774x xVar) {
    }

    /* renamed from: u */
    public void mo7212u(C1732az.C1774x xVar) {
    }

    /* renamed from: v */
    public void mo7213v(C1732az.C1774x xVar) {
    }
}
