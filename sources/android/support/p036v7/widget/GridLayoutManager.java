package android.support.p036v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.p010v4.view.p034a.C0949h;
import android.support.p036v7.widget.C1732az;
import android.support.p036v7.widget.LinearLayoutManager;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.Arrays;

/* renamed from: android.support.v7.widget.GridLayoutManager */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: E */
    private static final boolean f5192E = false;

    /* renamed from: F */
    private static final String f5193F = "GridLayoutManager";

    /* renamed from: a */
    public static final int f5194a = -1;

    /* renamed from: b */
    boolean f5195b = false;

    /* renamed from: c */
    int f5196c = -1;

    /* renamed from: d */
    int[] f5197d;

    /* renamed from: e */
    View[] f5198e;

    /* renamed from: f */
    final SparseIntArray f5199f = new SparseIntArray();

    /* renamed from: g */
    final SparseIntArray f5200g = new SparseIntArray();

    /* renamed from: h */
    C1598c f5201h = new C1596a();

    /* renamed from: i */
    final Rect f5202i = new Rect();

    /* renamed from: android.support.v7.widget.GridLayoutManager$a */
    public static final class C1596a extends C1598c {
        /* renamed from: a */
        public int mo5805a(int i) {
            return 1;
        }

        /* renamed from: a */
        public int mo5806a(int i, int i2) {
            return i % i2;
        }
    }

    /* renamed from: android.support.v7.widget.GridLayoutManager$b */
    public static class C1597b extends C1732az.C1755i {

        /* renamed from: a */
        public static final int f5203a = -1;

        /* renamed from: b */
        int f5204b = -1;

        /* renamed from: c */
        int f5205c = 0;

        public C1597b(int i, int i2) {
            super(i, i2);
        }

        public C1597b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C1597b(C1732az.C1755i iVar) {
            super(iVar);
        }

        public C1597b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C1597b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        /* renamed from: a */
        public int mo5807a() {
            return this.f5204b;
        }

        /* renamed from: b */
        public int mo5808b() {
            return this.f5205c;
        }
    }

    /* renamed from: android.support.v7.widget.GridLayoutManager$c */
    public static abstract class C1598c {

        /* renamed from: a */
        final SparseIntArray f5206a = new SparseIntArray();

        /* renamed from: b */
        private boolean f5207b = false;

        /* renamed from: a */
        public abstract int mo5805a(int i);

        /* renamed from: a */
        public int mo5806a(int i, int i2) {
            int i3;
            int i4;
            int b;
            int a = mo5805a(i);
            if (a == i2) {
                return 0;
            }
            if (!this.f5207b || this.f5206a.size() <= 0 || (b = mo5811b(i)) < 0) {
                i3 = 0;
                i4 = 0;
            } else {
                i4 = this.f5206a.get(b) + mo5805a(b);
                i3 = b + 1;
            }
            int i5 = i3;
            while (i5 < i) {
                int a2 = mo5805a(i5);
                int i6 = i4 + a2;
                if (i6 == i2) {
                    a2 = 0;
                } else if (i6 <= i2) {
                    a2 = i6;
                }
                i5++;
                i4 = a2;
            }
            if (i4 + a <= i2) {
                return i4;
            }
            return 0;
        }

        /* renamed from: a */
        public void mo5809a() {
            this.f5206a.clear();
        }

        /* renamed from: a */
        public void mo5810a(boolean z) {
            this.f5207b = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo5811b(int i) {
            int i2 = 0;
            int size = this.f5206a.size() - 1;
            while (i2 <= size) {
                int i3 = (i2 + size) >>> 1;
                if (this.f5206a.keyAt(i3) < i) {
                    i2 = i3 + 1;
                } else {
                    size = i3 - 1;
                }
            }
            int i4 = i2 - 1;
            if (i4 < 0 || i4 >= this.f5206a.size()) {
                return -1;
            }
            return this.f5206a.keyAt(i4);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo5812b(int i, int i2) {
            if (!this.f5207b) {
                return mo5806a(i, i2);
            }
            int i3 = this.f5206a.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int a = mo5806a(i, i2);
            this.f5206a.put(i, a);
            return a;
        }

        /* renamed from: b */
        public boolean mo5813b() {
            return this.f5207b;
        }

        /* renamed from: c */
        public int mo5814c(int i, int i2) {
            int a = mo5805a(i);
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (i3 < i) {
                int a2 = mo5805a(i3);
                int i6 = i5 + a2;
                if (i6 == i2) {
                    i4++;
                    a2 = 0;
                } else if (i6 > i2) {
                    i4++;
                } else {
                    a2 = i6;
                }
                i3++;
                i5 = a2;
            }
            return i5 + a > i2 ? i4 + 1 : i4;
        }
    }

    public GridLayoutManager(Context context, int i) {
        super(context);
        mo5784a(i);
    }

    public GridLayoutManager(Context context, int i, int i2, boolean z) {
        super(context, i2, z);
        mo5784a(i);
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo5784a(m10462a(context, attributeSet, i, i2).f5875b);
    }

    /* renamed from: a */
    private int m9384a(C1732az.C1762o oVar, C1732az.C1771u uVar, int i) {
        if (!uVar.mo7050c()) {
            return this.f5201h.mo5814c(i, this.f5196c);
        }
        int b = oVar.mo6989b(i);
        if (b != -1) {
            return this.f5201h.mo5814c(b, this.f5196c);
        }
        Log.w(f5193F, "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    /* renamed from: a */
    private void m9385a(float f, int i) {
        m9397n(Math.max(Math.round(((float) this.f5196c) * f), i));
    }

    /* renamed from: a */
    private void m9386a(C1732az.C1762o oVar, C1732az.C1771u uVar, int i, int i2, boolean z) {
        int i3;
        int i4;
        if (z) {
            i4 = 1;
            i3 = 0;
        } else {
            int i5 = i - 1;
            i = -1;
            i3 = i5;
            i4 = -1;
        }
        int i6 = 0;
        for (int i7 = i3; i7 != i; i7 += i4) {
            View view = this.f5198e[i7];
            C1597b bVar = (C1597b) view.getLayoutParams();
            bVar.f5205c = m9396c(oVar, uVar, mo6912e(view));
            bVar.f5204b = i6;
            i6 += bVar.f5205c;
        }
    }

    /* renamed from: a */
    private void m9387a(View view, int i, int i2, boolean z) {
        C1732az.C1755i iVar = (C1732az.C1755i) view.getLayoutParams();
        if (z ? mo6884a(view, i, i2, iVar) : mo6900b(view, i, i2, iVar)) {
            view.measure(i, i2);
        }
    }

    /* renamed from: a */
    private void m9388a(View view, int i, boolean z) {
        int a;
        int i2;
        C1597b bVar = (C1597b) view.getLayoutParams();
        Rect rect = bVar.f5879e;
        int i3 = rect.top + rect.bottom + bVar.topMargin + bVar.bottomMargin;
        int i4 = bVar.rightMargin + rect.right + rect.left + bVar.leftMargin;
        int a2 = mo5776a(bVar.f5204b, bVar.f5205c);
        if (this.f5222n == 1) {
            a = m10460a(a2, i, i4, bVar.width, false);
            i2 = m10460a(this.f5223o.mo6552f(), mo6841J(), i3, bVar.height, true);
        } else {
            int a3 = m10460a(a2, i, i3, bVar.height, false);
            a = m10460a(this.f5223o.mo6552f(), mo6840I(), i4, bVar.width, true);
            i2 = a3;
        }
        m9387a(view, a, i2, z);
    }

    /* renamed from: a */
    static int[] m9389a(int[] iArr, int i, int i2) {
        int i3;
        int i4 = 0;
        if (!(iArr != null && iArr.length == i + 1 && iArr[iArr.length - 1] == i2)) {
            iArr = new int[(i + 1)];
        }
        iArr[0] = 0;
        int i5 = i2 / i;
        int i6 = i2 % i;
        int i7 = 0;
        for (int i8 = 1; i8 <= i; i8++) {
            i4 += i6;
            if (i4 <= 0 || i - i4 >= i6) {
                i3 = i5;
            } else {
                i3 = i5 + 1;
                i4 -= i;
            }
            i7 += i3;
            iArr[i8] = i7;
        }
        return iArr;
    }

    /* renamed from: ac */
    private void m9390ac() {
        this.f5199f.clear();
        this.f5200g.clear();
    }

    /* renamed from: ad */
    private void m9391ad() {
        int H = mo6839H();
        for (int i = 0; i < H; i++) {
            C1597b bVar = (C1597b) mo6928j(i).getLayoutParams();
            int h = bVar.mo6956h();
            this.f5199f.put(h, bVar.mo5808b());
            this.f5200g.put(h, bVar.mo5807a());
        }
    }

    /* renamed from: ae */
    private void m9392ae() {
        m9397n(mo5849j() == 1 ? (mo6842K() - mo6846O()) - mo6844M() : (mo6843L() - mo6847P()) - mo6845N());
    }

    /* renamed from: af */
    private void m9393af() {
        if (this.f5198e == null || this.f5198e.length != this.f5196c) {
            this.f5198e = new View[this.f5196c];
        }
    }

    /* renamed from: b */
    private int m9394b(C1732az.C1762o oVar, C1732az.C1771u uVar, int i) {
        if (!uVar.mo7050c()) {
            return this.f5201h.mo5812b(i, this.f5196c);
        }
        int i2 = this.f5200g.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int b = oVar.mo6989b(i);
        if (b != -1) {
            return this.f5201h.mo5812b(b, this.f5196c);
        }
        Log.w(f5193F, "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    /* renamed from: b */
    private void m9395b(C1732az.C1762o oVar, C1732az.C1771u uVar, LinearLayoutManager.C1599a aVar, int i) {
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        int b = m9394b(oVar, uVar, aVar.f5229a);
        if (z) {
            while (b > 0 && aVar.f5229a > 0) {
                aVar.f5229a--;
                b = m9394b(oVar, uVar, aVar.f5229a);
            }
            return;
        }
        int i2 = uVar.mo7056i() - 1;
        int i3 = aVar.f5229a;
        int i4 = b;
        while (i3 < i2) {
            int b2 = m9394b(oVar, uVar, i3 + 1);
            if (b2 <= i4) {
                break;
            }
            i3++;
            i4 = b2;
        }
        aVar.f5229a = i3;
    }

    /* renamed from: c */
    private int m9396c(C1732az.C1762o oVar, C1732az.C1771u uVar, int i) {
        if (!uVar.mo7050c()) {
            return this.f5201h.mo5805a(i);
        }
        int i2 = this.f5199f.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int b = oVar.mo6989b(i);
        if (b != -1) {
            return this.f5201h.mo5805a(b);
        }
        Log.w(f5193F, "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    /* renamed from: n */
    private void m9397n(int i) {
        this.f5197d = m9389a(this.f5197d, this.f5196c, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo5776a(int i, int i2) {
        return (this.f5222n != 1 || !mo5851l()) ? this.f5197d[i + i2] - this.f5197d[i] : this.f5197d[this.f5196c - i] - this.f5197d[(this.f5196c - i) - i2];
    }

    /* renamed from: a */
    public int mo5777a(int i, C1732az.C1762o oVar, C1732az.C1771u uVar) {
        m9392ae();
        m9393af();
        return super.mo5777a(i, oVar, uVar);
    }

    /* renamed from: a */
    public int mo5778a(C1732az.C1762o oVar, C1732az.C1771u uVar) {
        if (this.f5222n == 0) {
            return this.f5196c;
        }
        if (uVar.mo7056i() < 1) {
            return 0;
        }
        return m9384a(oVar, uVar, uVar.mo7056i() - 1) + 1;
    }

    /* renamed from: a */
    public C1732az.C1755i mo5779a() {
        return this.f5222n == 0 ? new C1597b(-2, -1) : new C1597b(-1, -2);
    }

    /* renamed from: a */
    public C1732az.C1755i mo5780a(Context context, AttributeSet attributeSet) {
        return new C1597b(context, attributeSet);
    }

    /* renamed from: a */
    public C1732az.C1755i mo5781a(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C1597b((ViewGroup.MarginLayoutParams) layoutParams) : new C1597b(layoutParams);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public View mo5782a(C1732az.C1762o oVar, C1732az.C1771u uVar, int i, int i2, int i3) {
        View view;
        View view2 = null;
        mo5852m();
        int c = this.f5223o.mo6546c();
        int d = this.f5223o.mo6548d();
        int i4 = i2 > i ? 1 : -1;
        View view3 = null;
        while (i != i2) {
            View j = mo6928j(i);
            int e = mo6912e(j);
            if (e >= 0 && e < i3) {
                if (m9394b(oVar, uVar, e) != 0) {
                    view = view2;
                    j = view3;
                } else if (((C1732az.C1755i) j.getLayoutParams()).mo6953e()) {
                    if (view3 == null) {
                        view = view2;
                    }
                } else if (this.f5223o.mo6540a(j) < d && this.f5223o.mo6545b(j) >= c) {
                    return j;
                } else {
                    if (view2 == null) {
                        view = j;
                        j = view3;
                    }
                }
                i += i4;
                view2 = view;
                view3 = j;
            }
            view = view2;
            j = view3;
            i += i4;
            view2 = view;
            view3 = j;
        }
        if (view2 == null) {
            view2 = view3;
        }
        return view2;
    }

    /* renamed from: a */
    public View mo5783a(View view, int i, C1732az.C1762o oVar, C1732az.C1771u uVar) {
        int i2;
        int i3;
        int H;
        int i4;
        int min;
        View view2;
        int i5;
        int i6;
        View view3;
        View g = mo6921g(view);
        if (g == null) {
            return null;
        }
        C1597b bVar = (C1597b) g.getLayoutParams();
        int i7 = bVar.f5204b;
        int i8 = bVar.f5204b + bVar.f5205c;
        if (super.mo5783a(view, i, oVar, uVar) == null) {
            return null;
        }
        if ((mo5843g(i) == 1) != this.f5224p) {
            i2 = mo6839H() - 1;
            i3 = -1;
            H = -1;
        } else {
            i2 = 0;
            i3 = 1;
            H = mo6839H();
        }
        boolean z = this.f5222n == 1 && mo5851l();
        View view4 = null;
        int i9 = -1;
        int i10 = 0;
        View view5 = null;
        int i11 = -1;
        int i12 = 0;
        int a = m9384a(oVar, uVar, i2);
        int i13 = i2;
        while (i13 != H) {
            int a2 = m9384a(oVar, uVar, i13);
            View j = mo6928j(i13);
            if (j == g) {
                break;
            }
            if (j.hasFocusable() && a2 != a) {
                if (view4 != null) {
                    break;
                }
            } else {
                C1597b bVar2 = (C1597b) j.getLayoutParams();
                int i14 = bVar2.f5204b;
                int i15 = bVar2.f5204b + bVar2.f5205c;
                if (j.hasFocusable() && i14 == i7 && i15 == i8) {
                    return j;
                }
                boolean z2 = false;
                if ((!j.hasFocusable() || view4 != null) && (j.hasFocusable() || view5 != null)) {
                    int min2 = Math.min(i15, i8) - Math.max(i14, i7);
                    if (j.hasFocusable()) {
                        if (min2 > i10) {
                            z2 = true;
                        } else if (min2 == i10) {
                            if (z == (i14 > i9)) {
                                z2 = true;
                            }
                        }
                    } else if (view4 == null && mo6886a(j, false, true)) {
                        if (min2 > i12) {
                            z2 = true;
                        } else if (min2 == i12) {
                            if (z == (i14 > i11)) {
                                z2 = true;
                            }
                        }
                    }
                } else {
                    z2 = true;
                }
                if (z2) {
                    if (j.hasFocusable()) {
                        int i16 = bVar2.f5204b;
                        int i17 = i12;
                        i4 = i11;
                        view2 = view5;
                        i5 = Math.min(i15, i8) - Math.max(i14, i7);
                        min = i17;
                        int i18 = i16;
                        view3 = j;
                        i6 = i18;
                    } else {
                        i4 = bVar2.f5204b;
                        min = Math.min(i15, i8) - Math.max(i14, i7);
                        view2 = j;
                        i5 = i10;
                        i6 = i9;
                        view3 = view4;
                    }
                    i13 += i3;
                    view4 = view3;
                    i10 = i5;
                    i9 = i6;
                    view5 = view2;
                    i11 = i4;
                    i12 = min;
                }
            }
            min = i12;
            i6 = i9;
            i4 = i11;
            view2 = view5;
            i5 = i10;
            view3 = view4;
            i13 += i3;
            view4 = view3;
            i10 = i5;
            i9 = i6;
            view5 = view2;
            i11 = i4;
            i12 = min;
        }
        if (view4 == null) {
            view4 = view5;
        }
        return view4;
    }

    /* renamed from: a */
    public void mo5784a(int i) {
        if (i != this.f5196c) {
            this.f5195b = true;
            if (i < 1) {
                throw new IllegalArgumentException("Span count should be at least 1. Provided " + i);
            }
            this.f5196c = i;
            this.f5201h.mo5809a();
            mo6942y();
        }
    }

    /* renamed from: a */
    public void mo5785a(Rect rect, int i, int i2) {
        int a;
        int a2;
        if (this.f5197d == null) {
            super.mo5785a(rect, i, i2);
        }
        int O = mo6846O() + mo6844M();
        int N = mo6845N() + mo6847P();
        if (this.f5222n == 1) {
            a2 = m10459a(i2, N + rect.height(), mo6856Y());
            a = m10459a(i, O + this.f5197d[this.f5197d.length - 1], mo6855X());
        } else {
            a = m10459a(i, O + rect.width(), mo6855X());
            a2 = m10459a(i2, N + this.f5197d[this.f5197d.length - 1], mo6856Y());
        }
        mo6922g(a, a2);
    }

    /* renamed from: a */
    public void mo5786a(C1598c cVar) {
        this.f5201h = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo5787a(C1732az.C1762o oVar, C1732az.C1771u uVar, LinearLayoutManager.C1599a aVar, int i) {
        super.mo5787a(oVar, uVar, aVar, i);
        m9392ae();
        if (uVar.mo7056i() > 0 && !uVar.mo7050c()) {
            m9395b(oVar, uVar, aVar, i);
        }
        m9393af();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo5788a(C1732az.C1762o oVar, C1732az.C1771u uVar, LinearLayoutManager.C1601c cVar, LinearLayoutManager.C1600b bVar) {
        int i;
        int i2;
        int i3;
        int makeMeasureSpec;
        int a;
        View a2;
        int i4 = this.f5223o.mo6556i();
        boolean z = i4 != 1073741824;
        int i5 = mo6839H() > 0 ? this.f5197d[this.f5196c] : 0;
        if (z) {
            m9392ae();
        }
        boolean z2 = cVar.f5249l == 1;
        int i6 = 0;
        int i7 = 0;
        int i8 = this.f5196c;
        if (!z2) {
            i8 = m9394b(oVar, uVar, cVar.f5248k) + m9396c(oVar, uVar, cVar.f5248k);
        }
        while (i6 < this.f5196c && cVar.mo5874a(uVar) && i8 > 0) {
            int i9 = cVar.f5248k;
            int c = m9396c(oVar, uVar, i9);
            if (c <= this.f5196c) {
                i8 -= c;
                if (i8 < 0 || (a2 = cVar.mo5871a(oVar)) == null) {
                    break;
                }
                i7 += c;
                this.f5198e[i6] = a2;
                i6++;
            } else {
                throw new IllegalArgumentException("Item at position " + i9 + " requires " + c + " spans but GridLayoutManager has only " + this.f5196c + " spans.");
            }
        }
        if (i6 == 0) {
            bVar.f5235b = true;
            return;
        }
        m9386a(oVar, uVar, i6, i7, z2);
        int i10 = 0;
        float f = 0.0f;
        int i11 = 0;
        while (i10 < i6) {
            View view = this.f5198e[i10];
            if (cVar.f5255r == null) {
                if (z2) {
                    mo6905c(view);
                } else {
                    mo6894b(view, 0);
                }
            } else if (z2) {
                mo6893b(view);
            } else {
                mo6867a(view, 0);
            }
            mo6897b(view, this.f5202i);
            m9388a(view, i4, false);
            int e = this.f5223o.mo6551e(view);
            if (e > i11) {
                i11 = e;
            }
            float f2 = (((float) this.f5223o.mo6553f(view)) * 1.0f) / ((float) ((C1597b) view.getLayoutParams()).f5205c);
            if (f2 <= f) {
                f2 = f;
            }
            i10++;
            f = f2;
        }
        if (z) {
            m9385a(f, i5);
            i11 = 0;
            int i12 = 0;
            while (i12 < i6) {
                View view2 = this.f5198e[i12];
                m9388a(view2, 1073741824, true);
                int e2 = this.f5223o.mo6551e(view2);
                if (e2 <= i11) {
                    e2 = i11;
                }
                i12++;
                i11 = e2;
            }
        }
        for (int i13 = 0; i13 < i6; i13++) {
            View view3 = this.f5198e[i13];
            if (this.f5223o.mo6551e(view3) != i11) {
                C1597b bVar2 = (C1597b) view3.getLayoutParams();
                Rect rect = bVar2.f5879e;
                int i14 = rect.top + rect.bottom + bVar2.topMargin + bVar2.bottomMargin;
                int i15 = rect.right + rect.left + bVar2.leftMargin + bVar2.rightMargin;
                int a3 = mo5776a(bVar2.f5204b, bVar2.f5205c);
                if (this.f5222n == 1) {
                    makeMeasureSpec = m10460a(a3, 1073741824, i15, bVar2.width, false);
                    a = View.MeasureSpec.makeMeasureSpec(i11 - i14, 1073741824);
                } else {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11 - i15, 1073741824);
                    a = m10460a(a3, 1073741824, i14, bVar2.height, false);
                }
                m9387a(view3, makeMeasureSpec, a, true);
            }
        }
        bVar.f5234a = i11;
        int i16 = 0;
        if (this.f5222n == 1) {
            if (cVar.f5250m == -1) {
                i16 = cVar.f5246i;
                i3 = i16 - i11;
                i2 = 0;
                i = 0;
            } else {
                int i17 = cVar.f5246i;
                i16 = i17 + i11;
                i3 = i17;
                i2 = 0;
                i = 0;
            }
        } else if (cVar.f5250m == -1) {
            int i18 = cVar.f5246i;
            i2 = i18;
            i = i18 - i11;
            i3 = 0;
        } else {
            i = cVar.f5246i;
            i2 = i11 + i;
            i3 = 0;
        }
        int i19 = i16;
        int i20 = i3;
        int i21 = i2;
        int i22 = i;
        for (int i23 = 0; i23 < i6; i23++) {
            View view4 = this.f5198e[i23];
            C1597b bVar3 = (C1597b) view4.getLayoutParams();
            if (this.f5222n != 1) {
                i20 = mo6845N() + this.f5197d[bVar3.f5204b];
                i19 = i20 + this.f5223o.mo6553f(view4);
            } else if (mo5851l()) {
                i21 = mo6844M() + this.f5197d[this.f5196c - bVar3.f5204b];
                i22 = i21 - this.f5223o.mo6553f(view4);
            } else {
                i22 = mo6844M() + this.f5197d[bVar3.f5204b];
                i21 = i22 + this.f5223o.mo6553f(view4);
            }
            mo6896b(view4, i22, i20, i21, i19);
            if (bVar3.mo6953e() || bVar3.mo6954f()) {
                bVar.f5236c = true;
            }
            bVar.f5237d |= view4.hasFocusable();
        }
        Arrays.fill(this.f5198e, (Object) null);
    }

    /* renamed from: a */
    public void mo5789a(C1732az.C1762o oVar, C1732az.C1771u uVar, View view, C0949h hVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C1597b)) {
            super.mo6872a(view, hVar);
            return;
        }
        C1597b bVar = (C1597b) layoutParams;
        int a = m9384a(oVar, uVar, bVar.mo6956h());
        if (this.f5222n == 0) {
            hVar.mo3180c((Object) C0949h.C0963n.m5267a(bVar.mo5807a(), bVar.mo5808b(), a, 1, this.f5196c > 1 && bVar.mo5808b() == this.f5196c, false));
        } else {
            hVar.mo3180c((Object) C0949h.C0963n.m5267a(a, 1, bVar.mo5807a(), bVar.mo5808b(), this.f5196c > 1 && bVar.mo5808b() == this.f5196c, false));
        }
    }

    /* renamed from: a */
    public void mo5790a(C1732az.C1771u uVar) {
        super.mo5790a(uVar);
        this.f5195b = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo5791a(C1732az.C1771u uVar, LinearLayoutManager.C1601c cVar, C1732az.C1750h.C1753a aVar) {
        int i = this.f5196c;
        for (int i2 = 0; i2 < this.f5196c && cVar.mo5874a(uVar) && i > 0; i2++) {
            int i3 = cVar.f5248k;
            aVar.mo6388b(i3, Math.max(0, cVar.f5251n));
            i -= this.f5201h.mo5805a(i3);
            cVar.f5248k += cVar.f5249l;
        }
    }

    /* renamed from: a */
    public void mo5792a(C1732az azVar) {
        this.f5201h.mo5809a();
    }

    /* renamed from: a */
    public void mo5793a(C1732az azVar, int i, int i2) {
        this.f5201h.mo5809a();
    }

    /* renamed from: a */
    public void mo5794a(C1732az azVar, int i, int i2, int i3) {
        this.f5201h.mo5809a();
    }

    /* renamed from: a */
    public void mo5795a(C1732az azVar, int i, int i2, Object obj) {
        this.f5201h.mo5809a();
    }

    /* renamed from: a */
    public void mo5796a(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.mo5796a(false);
    }

    /* renamed from: a */
    public boolean mo5797a(C1732az.C1755i iVar) {
        return iVar instanceof C1597b;
    }

    /* renamed from: b */
    public int mo5798b(int i, C1732az.C1762o oVar, C1732az.C1771u uVar) {
        m9392ae();
        m9393af();
        return super.mo5798b(i, oVar, uVar);
    }

    /* renamed from: b */
    public int mo5799b(C1732az.C1762o oVar, C1732az.C1771u uVar) {
        if (this.f5222n == 1) {
            return this.f5196c;
        }
        if (uVar.mo7056i() < 1) {
            return 0;
        }
        return m9384a(oVar, uVar, uVar.mo7056i() - 1) + 1;
    }

    /* renamed from: b */
    public C1598c mo5800b() {
        return this.f5201h;
    }

    /* renamed from: b */
    public void mo5801b(C1732az azVar, int i, int i2) {
        this.f5201h.mo5809a();
    }

    /* renamed from: c */
    public int mo5802c() {
        return this.f5196c;
    }

    /* renamed from: c */
    public void mo5803c(C1732az.C1762o oVar, C1732az.C1771u uVar) {
        if (uVar.mo7050c()) {
            m9391ad();
        }
        super.mo5803c(oVar, uVar);
        m9390ac();
    }

    /* renamed from: d */
    public boolean mo5804d() {
        return this.f5227s == null && !this.f5195b;
    }
}
