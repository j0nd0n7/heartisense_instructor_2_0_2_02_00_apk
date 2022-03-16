package android.support.p036v7.widget;

import android.support.annotation.C0003aa;
import android.support.annotation.C0047z;
import android.support.p036v7.widget.ActivityChooserView;
import android.support.p036v7.widget.C1732az;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;

/* renamed from: android.support.v7.widget.bh */
public abstract class C1793bh extends C1732az.C1757k {

    /* renamed from: a */
    static final float f5996a = 100.0f;

    /* renamed from: b */
    C1732az f5997b;

    /* renamed from: c */
    private Scroller f5998c;

    /* renamed from: d */
    private final C1732az.C1759m f5999d = new C1732az.C1759m() {

        /* renamed from: a */
        boolean f6000a = false;

        public void onScrollStateChanged(C1732az azVar, int i) {
            super.onScrollStateChanged(azVar, i);
            if (i == 0 && this.f6000a) {
                this.f6000a = false;
                C1793bh.this.mo7214a();
            }
        }

        public void onScrolled(C1732az azVar, int i, int i2) {
            if (i != 0 || i2 != 0) {
                this.f6000a = true;
            }
        }
    };

    /* renamed from: b */
    private void m10857b() {
        if (this.f5997b.getOnFlingListener() != null) {
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
        this.f5997b.addOnScrollListener(this.f5999d);
        this.f5997b.setOnFlingListener(this);
    }

    /* renamed from: b */
    private boolean m10858b(@C0047z C1732az.C1750h hVar, int i, int i2) {
        C1701ao b;
        int a;
        if (!(hVar instanceof C1732az.C1768t.C1770b) || (b = mo6557b(hVar)) == null || (a = mo6449a(hVar, i, i2)) == -1) {
            return false;
        }
        b.mo7022d(a);
        hVar.mo6865a((C1732az.C1768t) b);
        return true;
    }

    /* renamed from: c */
    private void m10859c() {
        this.f5997b.removeOnScrollListener(this.f5999d);
        this.f5997b.setOnFlingListener((C1732az.C1757k) null);
    }

    /* renamed from: a */
    public abstract int mo6449a(C1732az.C1750h hVar, int i, int i2);

    @C0003aa
    /* renamed from: a */
    public abstract View mo6450a(C1732az.C1750h hVar);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7214a() {
        C1732az.C1750h layoutManager;
        View a;
        if (this.f5997b != null && (layoutManager = this.f5997b.getLayoutManager()) != null && (a = mo6450a(layoutManager)) != null) {
            int[] a2 = mo6451a(layoutManager, a);
            if (a2[0] != 0 || a2[1] != 0) {
                this.f5997b.smoothScrollBy(a2[0], a2[1]);
            }
        }
    }

    /* renamed from: a */
    public void mo7215a(@C0003aa C1732az azVar) {
        if (this.f5997b != azVar) {
            if (this.f5997b != null) {
                m10859c();
            }
            this.f5997b = azVar;
            if (this.f5997b != null) {
                m10857b();
                this.f5998c = new Scroller(this.f5997b.getContext(), new DecelerateInterpolator());
                mo7214a();
            }
        }
    }

    /* renamed from: a */
    public boolean mo6958a(int i, int i2) {
        C1732az.C1750h layoutManager = this.f5997b.getLayoutManager();
        if (layoutManager == null || this.f5997b.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f5997b.getMinFlingVelocity();
        return (Math.abs(i2) > minFlingVelocity || Math.abs(i) > minFlingVelocity) && m10858b(layoutManager, i, i2);
    }

    @C0003aa
    /* renamed from: a */
    public abstract int[] mo6451a(@C0047z C1732az.C1750h hVar, @C0047z View view);

    /* access modifiers changed from: protected */
    @C0003aa
    /* renamed from: b */
    public C1701ao mo6557b(C1732az.C1750h hVar) {
        if (!(hVar instanceof C1732az.C1768t.C1770b)) {
            return null;
        }
        return new C1701ao(this.f5997b.getContext()) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public float mo6435a(DisplayMetrics displayMetrics) {
                return C1793bh.f5996a / ((float) displayMetrics.densityDpi);
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo6442a(View view, C1732az.C1771u uVar, C1732az.C1768t.C1769a aVar) {
                int[] a = C1793bh.this.mo6451a(C1793bh.this.f5997b.getLayoutManager(), view);
                int i = a[0];
                int i2 = a[1];
                int a2 = mo6436a(Math.max(Math.abs(i), Math.abs(i2)));
                if (a2 > 0) {
                    aVar.mo7032a(i, i2, a2, this.f5723e);
                }
            }
        };
    }

    /* renamed from: b */
    public int[] mo7216b(int i, int i2) {
        this.f5998c.fling(0, 0, i, i2, Integer.MIN_VALUE, ActivityChooserView.C1593a.f5166a, Integer.MIN_VALUE, ActivityChooserView.C1593a.f5166a);
        return new int[]{this.f5998c.getFinalX(), this.f5998c.getFinalY()};
    }
}
