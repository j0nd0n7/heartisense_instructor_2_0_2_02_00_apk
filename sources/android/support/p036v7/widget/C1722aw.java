package android.support.p036v7.widget;

import android.graphics.PointF;
import android.support.annotation.C0003aa;
import android.support.annotation.C0047z;
import android.support.p036v7.widget.ActivityChooserView;
import android.support.p036v7.widget.C1732az;
import android.util.DisplayMetrics;
import android.view.View;

/* renamed from: android.support.v7.widget.aw */
public class C1722aw extends C1793bh {

    /* renamed from: c */
    private static final int f5809c = 100;
    @C0003aa

    /* renamed from: d */
    private C1719av f5810d;
    @C0003aa

    /* renamed from: e */
    private C1719av f5811e;

    /* renamed from: a */
    private int m10330a(@C0047z C1732az.C1750h hVar, @C0047z View view, C1719av avVar) {
        return ((avVar.mo6551e(view) / 2) + avVar.mo6540a(view)) - (hVar.mo6834C() ? avVar.mo6546c() + (avVar.mo6552f() / 2) : avVar.mo6550e() / 2);
    }

    @C0003aa
    /* renamed from: a */
    private View m10331a(C1732az.C1750h hVar, C1719av avVar) {
        View view;
        View view2 = null;
        int H = hVar.mo6839H();
        if (H != 0) {
            int c = hVar.mo6834C() ? avVar.mo6546c() + (avVar.mo6552f() / 2) : avVar.mo6550e() / 2;
            int i = ActivityChooserView.C1593a.f5166a;
            int i2 = 0;
            while (i2 < H) {
                View j = hVar.mo6928j(i2);
                int abs = Math.abs((avVar.mo6540a(j) + (avVar.mo6551e(j) / 2)) - c);
                if (abs < i) {
                    view = j;
                } else {
                    abs = i;
                    view = view2;
                }
                i2++;
                view2 = view;
                i = abs;
            }
        }
        return view2;
    }

    @C0003aa
    /* renamed from: b */
    private View m10332b(C1732az.C1750h hVar, C1719av avVar) {
        View view;
        View view2 = null;
        int H = hVar.mo6839H();
        if (H != 0) {
            int i = ActivityChooserView.C1593a.f5166a;
            int i2 = 0;
            while (i2 < H) {
                View j = hVar.mo6928j(i2);
                int a = avVar.mo6540a(j);
                if (a < i) {
                    view = j;
                } else {
                    a = i;
                    view = view2;
                }
                i2++;
                view2 = view;
                i = a;
            }
        }
        return view2;
    }

    @C0047z
    /* renamed from: c */
    private C1719av m10333c(@C0047z C1732az.C1750h hVar) {
        if (this.f5810d == null || this.f5810d.f5806a != hVar) {
            this.f5810d = C1719av.m10282b(hVar);
        }
        return this.f5810d;
    }

    @C0047z
    /* renamed from: d */
    private C1719av m10334d(@C0047z C1732az.C1750h hVar) {
        if (this.f5811e == null || this.f5811e.f5806a != hVar) {
            this.f5811e = C1719av.m10280a(hVar);
        }
        return this.f5811e;
    }

    /* renamed from: a */
    public int mo6449a(C1732az.C1750h hVar, int i, int i2) {
        int e;
        PointF d;
        boolean z = false;
        int V = hVar.mo6853V();
        if (V == 0) {
            return -1;
        }
        View view = null;
        if (hVar.mo5847h()) {
            view = m10332b(hVar, m10333c(hVar));
        } else if (hVar.mo5845g()) {
            view = m10332b(hVar, m10334d(hVar));
        }
        if (view == null || (e = hVar.mo6912e(view)) == -1) {
            return -1;
        }
        boolean z2 = hVar.mo5845g() ? i > 0 : i2 > 0;
        if ((hVar instanceof C1732az.C1768t.C1770b) && (d = ((C1732az.C1768t.C1770b) hVar).mo5835d(V - 1)) != null && (d.x < 0.0f || d.y < 0.0f)) {
            z = true;
        }
        return z ? z2 ? e - 1 : e : z2 ? e + 1 : e;
    }

    @C0003aa
    /* renamed from: a */
    public View mo6450a(C1732az.C1750h hVar) {
        if (hVar.mo5847h()) {
            return m10331a(hVar, m10333c(hVar));
        }
        if (hVar.mo5845g()) {
            return m10331a(hVar, m10334d(hVar));
        }
        return null;
    }

    @C0003aa
    /* renamed from: a */
    public int[] mo6451a(@C0047z C1732az.C1750h hVar, @C0047z View view) {
        int[] iArr = new int[2];
        if (hVar.mo5845g()) {
            iArr[0] = m10330a(hVar, view, m10334d(hVar));
        } else {
            iArr[0] = 0;
        }
        if (hVar.mo5847h()) {
            iArr[1] = m10330a(hVar, view, m10333c(hVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C1701ao mo6557b(C1732az.C1750h hVar) {
        if (!(hVar instanceof C1732az.C1768t.C1770b)) {
            return null;
        }
        return new C1701ao(this.f5997b.getContext()) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public float mo6435a(DisplayMetrics displayMetrics) {
                return 100.0f / ((float) displayMetrics.densityDpi);
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo6442a(View view, C1732az.C1771u uVar, C1732az.C1768t.C1769a aVar) {
                int[] a = C1722aw.this.mo6451a(C1722aw.this.f5997b.getLayoutManager(), view);
                int i = a[0];
                int i2 = a[1];
                int a2 = mo6436a(Math.max(Math.abs(i), Math.abs(i2)));
                if (a2 > 0) {
                    aVar.mo7032a(i, i2, a2, this.f5723e);
                }
            }

            /* access modifiers changed from: protected */
            /* renamed from: b */
            public int mo6443b(int i) {
                return Math.min(100, super.mo6443b(i));
            }
        };
    }
}
