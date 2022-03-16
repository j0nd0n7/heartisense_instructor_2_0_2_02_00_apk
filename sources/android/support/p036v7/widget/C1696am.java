package android.support.p036v7.widget;

import android.support.p036v7.widget.C1732az;
import android.view.View;

/* renamed from: android.support.v7.widget.am */
class C1696am {

    /* renamed from: a */
    static final String f5671a = "LayoutState";

    /* renamed from: b */
    static final int f5672b = -1;

    /* renamed from: c */
    static final int f5673c = 1;

    /* renamed from: d */
    static final int f5674d = Integer.MIN_VALUE;

    /* renamed from: e */
    static final int f5675e = -1;

    /* renamed from: f */
    static final int f5676f = 1;

    /* renamed from: g */
    boolean f5677g = true;

    /* renamed from: h */
    int f5678h;

    /* renamed from: i */
    int f5679i;

    /* renamed from: j */
    int f5680j;

    /* renamed from: k */
    int f5681k;

    /* renamed from: l */
    int f5682l = 0;

    /* renamed from: m */
    int f5683m = 0;

    /* renamed from: n */
    boolean f5684n;

    /* renamed from: o */
    boolean f5685o;

    C1696am() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public View mo6390a(C1732az.C1762o oVar) {
        View c = oVar.mo6995c(this.f5679i);
        this.f5679i += this.f5680j;
        return c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo6391a(C1732az.C1771u uVar) {
        return this.f5679i >= 0 && this.f5679i < uVar.mo7056i();
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f5678h + ", mCurrentPosition=" + this.f5679i + ", mItemDirection=" + this.f5680j + ", mLayoutDirection=" + this.f5681k + ", mStartLine=" + this.f5682l + ", mEndLine=" + this.f5683m + '}';
    }
}
