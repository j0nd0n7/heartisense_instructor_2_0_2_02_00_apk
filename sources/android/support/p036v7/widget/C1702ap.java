package android.support.p036v7.widget;

import android.graphics.PointF;
import android.support.annotation.C0003aa;
import android.support.annotation.C0047z;
import android.support.p036v7.widget.ActivityChooserView;
import android.support.p036v7.widget.C1732az;
import android.view.View;

/* renamed from: android.support.v7.widget.ap */
public class C1702ap extends C1793bh {

    /* renamed from: c */
    private static final float f5728c = 1.0f;
    @C0003aa

    /* renamed from: d */
    private C1719av f5729d;
    @C0003aa

    /* renamed from: e */
    private C1719av f5730e;

    /* renamed from: a */
    private int m10181a(C1732az.C1750h hVar, C1719av avVar, int i, int i2) {
        int[] b = mo7216b(i, i2);
        float b2 = m10184b(hVar, avVar);
        if (b2 <= 0.0f) {
            return 0;
        }
        int i3 = Math.abs(b[0]) > Math.abs(b[1]) ? b[0] : b[1];
        return i3 > 0 ? (int) Math.floor((double) (((float) i3) / b2)) : (int) Math.ceil((double) (((float) i3) / b2));
    }

    /* renamed from: a */
    private int m10182a(@C0047z C1732az.C1750h hVar, @C0047z View view, C1719av avVar) {
        return ((avVar.mo6551e(view) / 2) + avVar.mo6540a(view)) - (hVar.mo6834C() ? avVar.mo6546c() + (avVar.mo6552f() / 2) : avVar.mo6550e() / 2);
    }

    @C0003aa
    /* renamed from: a */
    private View m10183a(C1732az.C1750h hVar, C1719av avVar) {
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

    /* renamed from: b */
    private float m10184b(C1732az.C1750h hVar, C1719av avVar) {
        int i;
        View view;
        View view2;
        View view3 = null;
        int i2 = ActivityChooserView.C1593a.f5166a;
        int H = hVar.mo6839H();
        if (H == 0) {
            return f5728c;
        }
        int i3 = 0;
        View view4 = null;
        int i4 = Integer.MIN_VALUE;
        while (i3 < H) {
            View j = hVar.mo6928j(i3);
            int e = hVar.mo6912e(j);
            if (e == -1) {
                i = i2;
                view = view3;
                view2 = view4;
            } else {
                if (e < i2) {
                    i2 = e;
                    view4 = j;
                }
                if (e > i4) {
                    i4 = e;
                    view2 = view4;
                    i = i2;
                    view = j;
                } else {
                    i = i2;
                    view = view3;
                    view2 = view4;
                }
            }
            i3++;
            view4 = view2;
            view3 = view;
            i2 = i;
        }
        if (view4 == null || view3 == null) {
            return f5728c;
        }
        int max = Math.max(avVar.mo6545b(view4), avVar.mo6545b(view3)) - Math.min(avVar.mo6540a(view4), avVar.mo6540a(view3));
        return max == 0 ? f5728c : (((float) max) * f5728c) / ((float) ((i4 - i2) + 1));
    }

    @C0047z
    /* renamed from: c */
    private C1719av m10185c(@C0047z C1732az.C1750h hVar) {
        if (this.f5729d == null || this.f5729d.f5806a != hVar) {
            this.f5729d = C1719av.m10282b(hVar);
        }
        return this.f5729d;
    }

    @C0047z
    /* renamed from: d */
    private C1719av m10186d(@C0047z C1732az.C1750h hVar) {
        if (this.f5730e == null || this.f5730e.f5806a != hVar) {
            this.f5730e = C1719av.m10280a(hVar);
        }
        return this.f5730e;
    }

    /* renamed from: a */
    public int mo6449a(C1732az.C1750h hVar, int i, int i2) {
        int i3;
        int i4;
        if (!(hVar instanceof C1732az.C1768t.C1770b)) {
            return -1;
        }
        int V = hVar.mo6853V();
        if (V == 0) {
            return -1;
        }
        View a = mo6450a(hVar);
        if (a == null) {
            return -1;
        }
        int e = hVar.mo6912e(a);
        if (e == -1) {
            return -1;
        }
        PointF d = ((C1732az.C1768t.C1770b) hVar).mo5835d(V - 1);
        if (d == null) {
            return -1;
        }
        if (hVar.mo5845g()) {
            i3 = m10181a(hVar, m10186d(hVar), i, 0);
            if (d.x < 0.0f) {
                i3 = -i3;
            }
        } else {
            i3 = 0;
        }
        if (hVar.mo5847h()) {
            i4 = m10181a(hVar, m10185c(hVar), 0, i2);
            if (d.y < 0.0f) {
                i4 = -i4;
            }
        } else {
            i4 = 0;
        }
        if (!hVar.mo5847h()) {
            i4 = i3;
        }
        if (i4 == 0) {
            return -1;
        }
        int i5 = e + i4;
        if (i5 < 0) {
            i5 = 0;
        }
        return i5 >= V ? V - 1 : i5;
    }

    /* renamed from: a */
    public View mo6450a(C1732az.C1750h hVar) {
        if (hVar.mo5847h()) {
            return m10183a(hVar, m10185c(hVar));
        }
        if (hVar.mo5845g()) {
            return m10183a(hVar, m10186d(hVar));
        }
        return null;
    }

    /* renamed from: a */
    public int[] mo6451a(@C0047z C1732az.C1750h hVar, @C0047z View view) {
        int[] iArr = new int[2];
        if (hVar.mo5845g()) {
            iArr[0] = m10182a(hVar, view, m10186d(hVar));
        } else {
            iArr[0] = 0;
        }
        if (hVar.mo5847h()) {
            iArr[1] = m10182a(hVar, view, m10185c(hVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }
}
