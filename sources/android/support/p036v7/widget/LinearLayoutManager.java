package android.support.p036v7.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.C0011ag;
import android.support.p010v4.p013c.C0226aq;
import android.support.p010v4.p025i.C0755t;
import android.support.p010v4.view.p034a.C0922a;
import android.support.p010v4.view.p034a.C0992u;
import android.support.p036v7.widget.ActivityChooserView;
import android.support.p036v7.widget.C1732az;
import android.support.p036v7.widget.p046a.C1644a;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

/* renamed from: android.support.v7.widget.LinearLayoutManager */
public class LinearLayoutManager extends C1732az.C1750h implements C1644a.C1657e, C1732az.C1768t.C1770b {

    /* renamed from: a */
    private static final String f5208a = "LinearLayoutManager";

    /* renamed from: b */
    private static final float f5209b = 0.33333334f;

    /* renamed from: j */
    static final boolean f5210j = false;

    /* renamed from: k */
    public static final int f5211k = 0;

    /* renamed from: l */
    public static final int f5212l = 1;

    /* renamed from: m */
    public static final int f5213m = Integer.MIN_VALUE;

    /* renamed from: E */
    private int f5214E;

    /* renamed from: c */
    private C1601c f5215c;

    /* renamed from: d */
    private boolean f5216d;

    /* renamed from: e */
    private boolean f5217e;

    /* renamed from: f */
    private boolean f5218f;

    /* renamed from: g */
    private boolean f5219g;

    /* renamed from: h */
    private boolean f5220h;

    /* renamed from: i */
    private final C1600b f5221i;

    /* renamed from: n */
    int f5222n;

    /* renamed from: o */
    C1719av f5223o;

    /* renamed from: p */
    boolean f5224p;

    /* renamed from: q */
    int f5225q;

    /* renamed from: r */
    int f5226r;

    /* renamed from: s */
    C1602d f5227s;

    /* renamed from: t */
    final C1599a f5228t;

    /* renamed from: android.support.v7.widget.LinearLayoutManager$a */
    class C1599a {

        /* renamed from: a */
        int f5229a;

        /* renamed from: b */
        int f5230b;

        /* renamed from: c */
        boolean f5231c;

        /* renamed from: d */
        boolean f5232d;

        C1599a() {
            mo5864a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo5864a() {
            this.f5229a = -1;
            this.f5230b = Integer.MIN_VALUE;
            this.f5231c = false;
            this.f5232d = false;
        }

        /* renamed from: a */
        public void mo5865a(View view) {
            int b = LinearLayoutManager.this.f5223o.mo6544b();
            if (b >= 0) {
                mo5868b(view);
                return;
            }
            this.f5229a = LinearLayoutManager.this.mo6912e(view);
            if (this.f5231c) {
                int d = (LinearLayoutManager.this.f5223o.mo6548d() - b) - LinearLayoutManager.this.f5223o.mo6545b(view);
                this.f5230b = LinearLayoutManager.this.f5223o.mo6548d() - d;
                if (d > 0) {
                    int e = this.f5230b - LinearLayoutManager.this.f5223o.mo6551e(view);
                    int c = LinearLayoutManager.this.f5223o.mo6546c();
                    int min = e - (c + Math.min(LinearLayoutManager.this.f5223o.mo6540a(view) - c, 0));
                    if (min < 0) {
                        this.f5230b = Math.min(d, -min) + this.f5230b;
                        return;
                    }
                    return;
                }
                return;
            }
            int a = LinearLayoutManager.this.f5223o.mo6540a(view);
            int c2 = a - LinearLayoutManager.this.f5223o.mo6546c();
            this.f5230b = a;
            if (c2 > 0) {
                int d2 = (LinearLayoutManager.this.f5223o.mo6548d() - Math.min(0, (LinearLayoutManager.this.f5223o.mo6548d() - b) - LinearLayoutManager.this.f5223o.mo6545b(view))) - (a + LinearLayoutManager.this.f5223o.mo6551e(view));
                if (d2 < 0) {
                    this.f5230b -= Math.min(c2, -d2);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo5866a(View view, C1732az.C1771u uVar) {
            C1732az.C1755i iVar = (C1732az.C1755i) view.getLayoutParams();
            return !iVar.mo6953e() && iVar.mo6956h() >= 0 && iVar.mo6956h() < uVar.mo7056i();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo5867b() {
            this.f5230b = this.f5231c ? LinearLayoutManager.this.f5223o.mo6548d() : LinearLayoutManager.this.f5223o.mo6546c();
        }

        /* renamed from: b */
        public void mo5868b(View view) {
            if (this.f5231c) {
                this.f5230b = LinearLayoutManager.this.f5223o.mo6545b(view) + LinearLayoutManager.this.f5223o.mo6544b();
            } else {
                this.f5230b = LinearLayoutManager.this.f5223o.mo6540a(view);
            }
            this.f5229a = LinearLayoutManager.this.mo6912e(view);
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f5229a + ", mCoordinate=" + this.f5230b + ", mLayoutFromEnd=" + this.f5231c + ", mValid=" + this.f5232d + '}';
        }
    }

    /* renamed from: android.support.v7.widget.LinearLayoutManager$b */
    protected static class C1600b {

        /* renamed from: a */
        public int f5234a;

        /* renamed from: b */
        public boolean f5235b;

        /* renamed from: c */
        public boolean f5236c;

        /* renamed from: d */
        public boolean f5237d;

        protected C1600b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo5870a() {
            this.f5234a = 0;
            this.f5235b = false;
            this.f5236c = false;
            this.f5237d = false;
        }
    }

    /* renamed from: android.support.v7.widget.LinearLayoutManager$c */
    static class C1601c {

        /* renamed from: a */
        static final String f5238a = "LLM#LayoutState";

        /* renamed from: b */
        static final int f5239b = -1;

        /* renamed from: c */
        static final int f5240c = 1;

        /* renamed from: d */
        static final int f5241d = Integer.MIN_VALUE;

        /* renamed from: e */
        static final int f5242e = -1;

        /* renamed from: f */
        static final int f5243f = 1;

        /* renamed from: g */
        static final int f5244g = Integer.MIN_VALUE;

        /* renamed from: h */
        boolean f5245h = true;

        /* renamed from: i */
        int f5246i;

        /* renamed from: j */
        int f5247j;

        /* renamed from: k */
        int f5248k;

        /* renamed from: l */
        int f5249l;

        /* renamed from: m */
        int f5250m;

        /* renamed from: n */
        int f5251n;

        /* renamed from: o */
        int f5252o = 0;

        /* renamed from: p */
        boolean f5253p = false;

        /* renamed from: q */
        int f5254q;

        /* renamed from: r */
        List<C1732az.C1774x> f5255r = null;

        /* renamed from: s */
        boolean f5256s;

        C1601c() {
        }

        /* renamed from: c */
        private View m9538c() {
            int size = this.f5255r.size();
            for (int i = 0; i < size; i++) {
                View view = this.f5255r.get(i).itemView;
                C1732az.C1755i iVar = (C1732az.C1755i) view.getLayoutParams();
                if (!iVar.mo6953e() && this.f5248k == iVar.mo6956h()) {
                    mo5873a(view);
                    return view;
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public View mo5871a(C1732az.C1762o oVar) {
            if (this.f5255r != null) {
                return m9538c();
            }
            View c = oVar.mo6995c(this.f5248k);
            this.f5248k += this.f5249l;
            return c;
        }

        /* renamed from: a */
        public void mo5872a() {
            mo5873a((View) null);
        }

        /* renamed from: a */
        public void mo5873a(View view) {
            View b = mo5875b(view);
            if (b == null) {
                this.f5248k = -1;
            } else {
                this.f5248k = ((C1732az.C1755i) b.getLayoutParams()).mo6956h();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo5874a(C1732az.C1771u uVar) {
            return this.f5248k >= 0 && this.f5248k < uVar.mo7056i();
        }

        /* renamed from: b */
        public View mo5875b(View view) {
            int i;
            View view2;
            int size = this.f5255r.size();
            View view3 = null;
            int i2 = ActivityChooserView.C1593a.f5166a;
            int i3 = 0;
            while (i3 < size) {
                View view4 = this.f5255r.get(i3).itemView;
                C1732az.C1755i iVar = (C1732az.C1755i) view4.getLayoutParams();
                if (view4 != view) {
                    if (iVar.mo6953e()) {
                        i = i2;
                        view2 = view3;
                    } else {
                        i = (iVar.mo6956h() - this.f5248k) * this.f5249l;
                        if (i < 0) {
                            i = i2;
                            view2 = view3;
                        } else if (i < i2) {
                            if (i == 0) {
                                return view4;
                            }
                            view2 = view4;
                        }
                    }
                    i3++;
                    view3 = view2;
                    i2 = i;
                }
                i = i2;
                view2 = view3;
                i3++;
                view3 = view2;
                i2 = i;
            }
            return view3;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo5876b() {
            Log.d(f5238a, "avail:" + this.f5247j + ", ind:" + this.f5248k + ", dir:" + this.f5249l + ", offset:" + this.f5246i + ", layoutDir:" + this.f5250m);
        }
    }

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    /* renamed from: android.support.v7.widget.LinearLayoutManager$d */
    public static class C1602d implements Parcelable {
        public static final Parcelable.Creator<C1602d> CREATOR = new Parcelable.Creator<C1602d>() {
            /* renamed from: a */
            public C1602d createFromParcel(Parcel parcel) {
                return new C1602d(parcel);
            }

            /* renamed from: a */
            public C1602d[] newArray(int i) {
                return new C1602d[i];
            }
        };

        /* renamed from: a */
        int f5257a;

        /* renamed from: b */
        int f5258b;

        /* renamed from: c */
        boolean f5259c;

        public C1602d() {
        }

        C1602d(Parcel parcel) {
            boolean z = true;
            this.f5257a = parcel.readInt();
            this.f5258b = parcel.readInt();
            this.f5259c = parcel.readInt() != 1 ? false : z;
        }

        public C1602d(C1602d dVar) {
            this.f5257a = dVar.f5257a;
            this.f5258b = dVar.f5258b;
            this.f5259c = dVar.f5259c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo5877a() {
            return this.f5257a >= 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo5878b() {
            this.f5257a = -1;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f5257a);
            parcel.writeInt(this.f5258b);
            parcel.writeInt(this.f5259c ? 1 : 0);
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    public LinearLayoutManager(Context context, int i, boolean z) {
        this.f5217e = false;
        this.f5224p = false;
        this.f5218f = false;
        this.f5219g = true;
        this.f5225q = -1;
        this.f5226r = Integer.MIN_VALUE;
        this.f5227s = null;
        this.f5228t = new C1599a();
        this.f5221i = new C1600b();
        this.f5214E = 2;
        mo5826b(i);
        mo5833c(z);
        mo6915e(true);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f5217e = false;
        this.f5224p = false;
        this.f5218f = false;
        this.f5219g = true;
        this.f5225q = -1;
        this.f5226r = Integer.MIN_VALUE;
        this.f5227s = null;
        this.f5228t = new C1599a();
        this.f5221i = new C1600b();
        this.f5214E = 2;
        C1732az.C1750h.C1754b a = m10462a(context, attributeSet, i, i2);
        mo5826b(a.f5874a);
        mo5833c(a.f5876c);
        mo5796a(a.f5877d);
        mo6915e(true);
    }

    /* renamed from: a */
    private int m9439a(int i, C1732az.C1762o oVar, C1732az.C1771u uVar, boolean z) {
        int d;
        int d2 = this.f5223o.mo6548d() - i;
        if (d2 <= 0) {
            return 0;
        }
        int i2 = -mo5829c(-d2, oVar, uVar);
        int i3 = i + i2;
        if (!z || (d = this.f5223o.mo6548d() - i3) <= 0) {
            return i2;
        }
        this.f5223o.mo6542a(d);
        return i2 + d;
    }

    /* renamed from: a */
    private View m9440a(boolean z, boolean z2) {
        return this.f5224p ? mo5816a(mo6839H() - 1, -1, z, z2) : mo5816a(0, mo6839H(), z, z2);
    }

    /* renamed from: a */
    private void mo5776a(int i, int i2) {
        this.f5215c.f5247j = this.f5223o.mo6548d() - i2;
        this.f5215c.f5249l = this.f5224p ? -1 : 1;
        this.f5215c.f5248k = i;
        this.f5215c.f5250m = 1;
        this.f5215c.f5246i = i2;
        this.f5215c.f5251n = Integer.MIN_VALUE;
    }

    /* renamed from: a */
    private void m9442a(int i, int i2, boolean z, C1732az.C1771u uVar) {
        int c;
        int i3 = -1;
        int i4 = 1;
        this.f5215c.f5256s = mo5855p();
        this.f5215c.f5252o = mo5825b(uVar);
        this.f5215c.f5250m = i;
        if (i == 1) {
            this.f5215c.f5252o += this.f5223o.mo6554g();
            View ac = m9449ac();
            C1601c cVar = this.f5215c;
            if (!this.f5224p) {
                i3 = 1;
            }
            cVar.f5249l = i3;
            this.f5215c.f5248k = mo6912e(ac) + this.f5215c.f5249l;
            this.f5215c.f5246i = this.f5223o.mo6545b(ac);
            c = this.f5223o.mo6545b(ac) - this.f5223o.mo6548d();
        } else {
            View c2 = mo5802c();
            this.f5215c.f5252o += this.f5223o.mo6546c();
            C1601c cVar2 = this.f5215c;
            if (!this.f5224p) {
                i4 = -1;
            }
            cVar2.f5249l = i4;
            this.f5215c.f5248k = mo6912e(c2) + this.f5215c.f5249l;
            this.f5215c.f5246i = this.f5223o.mo6540a(c2);
            c = (-this.f5223o.mo6540a(c2)) + this.f5223o.mo6546c();
        }
        this.f5215c.f5247j = i2;
        if (z) {
            this.f5215c.f5247j -= c;
        }
        this.f5215c.f5251n = c;
    }

    /* renamed from: a */
    private void m9443a(C1599a aVar) {
        mo5776a(aVar.f5229a, aVar.f5230b);
    }

    /* renamed from: a */
    private void m9444a(C1732az.C1762o oVar, int i) {
        if (i >= 0) {
            int H = mo6839H();
            if (this.f5224p) {
                for (int i2 = H - 1; i2 >= 0; i2--) {
                    View j = mo6928j(i2);
                    if (this.f5223o.mo6545b(j) > i || this.f5223o.mo6547c(j) > i) {
                        m9445a(oVar, H - 1, i2);
                        return;
                    }
                }
                return;
            }
            for (int i3 = 0; i3 < H; i3++) {
                View j2 = mo6928j(i3);
                if (this.f5223o.mo6545b(j2) > i || this.f5223o.mo6547c(j2) > i) {
                    m9445a(oVar, 0, i3);
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    private void m9445a(C1732az.C1762o oVar, int i, int i2) {
        if (i != i2) {
            if (i2 > i) {
                for (int i3 = i2 - 1; i3 >= i; i3--) {
                    mo6889b(i3, oVar);
                }
                return;
            }
            while (i > i2) {
                mo6889b(i, oVar);
                i--;
            }
        }
    }

    /* renamed from: a */
    private void m9446a(C1732az.C1762o oVar, C1601c cVar) {
        if (cVar.f5245h && !cVar.f5256s) {
            if (cVar.f5250m == -1) {
                m9455b(oVar, cVar.f5251n);
            } else {
                m9444a(oVar, cVar.f5251n);
            }
        }
    }

    /* renamed from: a */
    private void m9447a(C1732az.C1762o oVar, C1732az.C1771u uVar, C1599a aVar) {
        if (!m9448a(uVar, aVar) && !m9457b(oVar, uVar, aVar)) {
            aVar.mo5867b();
            aVar.f5229a = this.f5218f ? uVar.mo7056i() - 1 : 0;
        }
    }

    /* renamed from: a */
    private boolean m9448a(C1732az.C1771u uVar, C1599a aVar) {
        boolean z = false;
        if (uVar.mo7050c() || this.f5225q == -1) {
            return false;
        }
        if (this.f5225q < 0 || this.f5225q >= uVar.mo7056i()) {
            this.f5225q = -1;
            this.f5226r = Integer.MIN_VALUE;
            return false;
        }
        aVar.f5229a = this.f5225q;
        if (this.f5227s != null && this.f5227s.mo5877a()) {
            aVar.f5231c = this.f5227s.f5259c;
            if (aVar.f5231c) {
                aVar.f5230b = this.f5223o.mo6548d() - this.f5227s.f5258b;
                return true;
            }
            aVar.f5230b = this.f5223o.mo6546c() + this.f5227s.f5258b;
            return true;
        } else if (this.f5226r == Integer.MIN_VALUE) {
            View c = mo5831c(this.f5225q);
            if (c == null) {
                if (mo6839H() > 0) {
                    if ((this.f5225q < mo6912e(mo6928j(0))) == this.f5224p) {
                        z = true;
                    }
                    aVar.f5231c = z;
                }
                aVar.mo5867b();
                return true;
            } else if (this.f5223o.mo6551e(c) > this.f5223o.mo6552f()) {
                aVar.mo5867b();
                return true;
            } else if (this.f5223o.mo6540a(c) - this.f5223o.mo6546c() < 0) {
                aVar.f5230b = this.f5223o.mo6546c();
                aVar.f5231c = false;
                return true;
            } else if (this.f5223o.mo6548d() - this.f5223o.mo6545b(c) < 0) {
                aVar.f5230b = this.f5223o.mo6548d();
                aVar.f5231c = true;
                return true;
            } else {
                aVar.f5230b = aVar.f5231c ? this.f5223o.mo6545b(c) + this.f5223o.mo6544b() : this.f5223o.mo6540a(c);
                return true;
            }
        } else {
            aVar.f5231c = this.f5224p;
            if (this.f5224p) {
                aVar.f5230b = this.f5223o.mo6548d() - this.f5226r;
                return true;
            }
            aVar.f5230b = this.f5223o.mo6546c() + this.f5226r;
            return true;
        }
    }

    /* renamed from: ac */
    private View m9449ac() {
        return mo6928j(this.f5224p ? 0 : mo6839H() - 1);
    }

    /* renamed from: ad */
    private void m9450ad() {
        Log.d(f5208a, "internal representation of views on the screen");
        for (int i = 0; i < mo6839H(); i++) {
            View j = mo6928j(i);
            Log.d(f5208a, "item " + mo6912e(j) + ", coord:" + this.f5223o.mo6540a(j));
        }
        Log.d(f5208a, "==============");
    }

    /* renamed from: b */
    private int m9451b(int i, C1732az.C1762o oVar, C1732az.C1771u uVar, boolean z) {
        int c;
        int c2 = i - this.f5223o.mo6546c();
        if (c2 <= 0) {
            return 0;
        }
        int i2 = -mo5829c(c2, oVar, uVar);
        int i3 = i + i2;
        if (!z || (c = i3 - this.f5223o.mo6546c()) <= 0) {
            return i2;
        }
        this.f5223o.mo6542a(-c);
        return i2 - c;
    }

    /* renamed from: b */
    private View m9452b(boolean z, boolean z2) {
        return this.f5224p ? mo5816a(0, mo6839H(), z, z2) : mo5816a(mo6839H() - 1, -1, z, z2);
    }

    /* renamed from: b */
    private void mo5800b() {
        boolean z = true;
        if (this.f5222n == 1 || !mo5851l()) {
            this.f5224p = this.f5217e;
            return;
        }
        if (this.f5217e) {
            z = false;
        }
        this.f5224p = z;
    }

    /* renamed from: b */
    private void m9454b(C1599a aVar) {
        m9462h(aVar.f5229a, aVar.f5230b);
    }

    /* renamed from: b */
    private void m9455b(C1732az.C1762o oVar, int i) {
        int H = mo6839H();
        if (i >= 0) {
            int e = this.f5223o.mo6550e() - i;
            if (this.f5224p) {
                for (int i2 = 0; i2 < H; i2++) {
                    View j = mo6928j(i2);
                    if (this.f5223o.mo6540a(j) < e || this.f5223o.mo6549d(j) < e) {
                        m9445a(oVar, 0, i2);
                        return;
                    }
                }
                return;
            }
            for (int i3 = H - 1; i3 >= 0; i3--) {
                View j2 = mo6928j(i3);
                if (this.f5223o.mo6540a(j2) < e || this.f5223o.mo6549d(j2) < e) {
                    m9445a(oVar, H - 1, i3);
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    private void m9456b(C1732az.C1762o oVar, C1732az.C1771u uVar, int i, int i2) {
        int e;
        int i3;
        if (uVar.mo7051d() && mo6839H() != 0 && !uVar.mo7050c() && mo5804d()) {
            int i4 = 0;
            int i5 = 0;
            List<C1732az.C1774x> c = oVar.mo6996c();
            int size = c.size();
            int e2 = mo6912e(mo6928j(0));
            int i6 = 0;
            while (i6 < size) {
                C1732az.C1774x xVar = c.get(i6);
                if (xVar.isRemoved()) {
                    e = i5;
                    i3 = i4;
                } else {
                    if (((xVar.getLayoutPosition() < e2) != this.f5224p ? (char) 65535 : 1) == 65535) {
                        i3 = this.f5223o.mo6551e(xVar.itemView) + i4;
                        e = i5;
                    } else {
                        e = this.f5223o.mo6551e(xVar.itemView) + i5;
                        i3 = i4;
                    }
                }
                i6++;
                i4 = i3;
                i5 = e;
            }
            this.f5215c.f5255r = c;
            if (i4 > 0) {
                m9462h(mo6912e(mo5802c()), i);
                this.f5215c.f5252o = i4;
                this.f5215c.f5247j = 0;
                this.f5215c.mo5872a();
                mo5815a(oVar, this.f5215c, uVar, false);
            }
            if (i5 > 0) {
                mo5776a(mo6912e(m9449ac()), i2);
                this.f5215c.f5252o = i5;
                this.f5215c.f5247j = 0;
                this.f5215c.mo5872a();
                mo5815a(oVar, this.f5215c, uVar, false);
            }
            this.f5215c.f5255r = null;
        }
    }

    /* renamed from: b */
    private boolean m9457b(C1732az.C1762o oVar, C1732az.C1771u uVar, C1599a aVar) {
        boolean z = false;
        if (mo6839H() == 0) {
            return false;
        }
        View U = mo6852U();
        if (U != null && aVar.mo5866a(U, uVar)) {
            aVar.mo5865a(U);
            return true;
        } else if (this.f5216d != this.f5218f) {
            return false;
        } else {
            View f = aVar.f5231c ? m9459f(oVar, uVar) : m9460g(oVar, uVar);
            if (f == null) {
                return false;
            }
            aVar.mo5868b(f);
            if (!uVar.mo7050c() && mo5804d()) {
                if (this.f5223o.mo6540a(f) >= this.f5223o.mo6548d() || this.f5223o.mo6545b(f) < this.f5223o.mo6546c()) {
                    z = true;
                }
                if (z) {
                    aVar.f5230b = aVar.f5231c ? this.f5223o.mo6548d() : this.f5223o.mo6546c();
                }
            }
            return true;
        }
    }

    /* renamed from: c */
    private View mo5802c() {
        return mo6928j(this.f5224p ? mo6839H() - 1 : 0);
    }

    /* renamed from: f */
    private View m9459f(C1732az.C1762o oVar, C1732az.C1771u uVar) {
        return this.f5224p ? m9461h(oVar, uVar) : m9464i(oVar, uVar);
    }

    /* renamed from: g */
    private View m9460g(C1732az.C1762o oVar, C1732az.C1771u uVar) {
        return this.f5224p ? m9464i(oVar, uVar) : m9461h(oVar, uVar);
    }

    /* renamed from: h */
    private View m9461h(C1732az.C1762o oVar, C1732az.C1771u uVar) {
        return mo5782a(oVar, uVar, 0, mo6839H(), uVar.mo7056i());
    }

    /* renamed from: h */
    private void m9462h(int i, int i2) {
        this.f5215c.f5247j = i2 - this.f5223o.mo6546c();
        this.f5215c.f5248k = i;
        this.f5215c.f5249l = this.f5224p ? 1 : -1;
        this.f5215c.f5250m = -1;
        this.f5215c.f5246i = i2;
        this.f5215c.f5251n = Integer.MIN_VALUE;
    }

    /* renamed from: i */
    private int m9463i(C1732az.C1771u uVar) {
        boolean z = false;
        if (mo6839H() == 0) {
            return 0;
        }
        mo5852m();
        C1719av avVar = this.f5223o;
        View a = m9440a(!this.f5219g, true);
        if (!this.f5219g) {
            z = true;
        }
        return C1781bd.m10798a(uVar, avVar, a, m9452b(z, true), this, this.f5219g, this.f5224p);
    }

    /* renamed from: i */
    private View m9464i(C1732az.C1762o oVar, C1732az.C1771u uVar) {
        return mo5782a(oVar, uVar, mo6839H() - 1, -1, uVar.mo7056i());
    }

    /* renamed from: j */
    private int m9465j(C1732az.C1771u uVar) {
        boolean z = false;
        if (mo6839H() == 0) {
            return 0;
        }
        mo5852m();
        C1719av avVar = this.f5223o;
        View a = m9440a(!this.f5219g, true);
        if (!this.f5219g) {
            z = true;
        }
        return C1781bd.m10797a(uVar, avVar, a, m9452b(z, true), this, this.f5219g);
    }

    /* renamed from: j */
    private View m9466j(C1732az.C1762o oVar, C1732az.C1771u uVar) {
        return this.f5224p ? m9469l(oVar, uVar) : m9470m(oVar, uVar);
    }

    /* renamed from: k */
    private int m9467k(C1732az.C1771u uVar) {
        boolean z = false;
        if (mo6839H() == 0) {
            return 0;
        }
        mo5852m();
        C1719av avVar = this.f5223o;
        View a = m9440a(!this.f5219g, true);
        if (!this.f5219g) {
            z = true;
        }
        return C1781bd.m10799b(uVar, avVar, a, m9452b(z, true), this, this.f5219g);
    }

    /* renamed from: k */
    private View m9468k(C1732az.C1762o oVar, C1732az.C1771u uVar) {
        return this.f5224p ? m9470m(oVar, uVar) : m9469l(oVar, uVar);
    }

    /* renamed from: l */
    private View m9469l(C1732az.C1762o oVar, C1732az.C1771u uVar) {
        return mo5832c(0, mo6839H());
    }

    /* renamed from: m */
    private View m9470m(C1732az.C1762o oVar, C1732az.C1771u uVar) {
        return mo5832c(mo6839H() - 1, -1);
    }

    /* renamed from: a */
    public int mo5777a(int i, C1732az.C1762o oVar, C1732az.C1771u uVar) {
        if (this.f5222n == 1) {
            return 0;
        }
        return mo5829c(i, oVar, uVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo5815a(C1732az.C1762o oVar, C1601c cVar, C1732az.C1771u uVar, boolean z) {
        int i = cVar.f5247j;
        if (cVar.f5251n != Integer.MIN_VALUE) {
            if (cVar.f5247j < 0) {
                cVar.f5251n += cVar.f5247j;
            }
            m9446a(oVar, cVar);
        }
        int i2 = cVar.f5247j + cVar.f5252o;
        C1600b bVar = this.f5221i;
        while (true) {
            if ((!cVar.f5256s && i2 <= 0) || !cVar.mo5874a(uVar)) {
                break;
            }
            bVar.mo5870a();
            mo5788a(oVar, uVar, cVar, bVar);
            if (!bVar.f5235b) {
                cVar.f5246i += bVar.f5234a * cVar.f5250m;
                if (!bVar.f5236c || this.f5215c.f5255r != null || !uVar.mo7050c()) {
                    cVar.f5247j -= bVar.f5234a;
                    i2 -= bVar.f5234a;
                }
                if (cVar.f5251n != Integer.MIN_VALUE) {
                    cVar.f5251n += bVar.f5234a;
                    if (cVar.f5247j < 0) {
                        cVar.f5251n += cVar.f5247j;
                    }
                    m9446a(oVar, cVar);
                }
                if (z && bVar.f5237d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - cVar.f5247j;
    }

    /* renamed from: a */
    public C1732az.C1755i mo5779a() {
        return new C1732az.C1755i(-2, -2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public View mo5816a(int i, int i2, boolean z, boolean z2) {
        int i3 = 320;
        mo5852m();
        int i4 = z ? 24579 : 320;
        if (!z2) {
            i3 = 0;
        }
        return this.f5222n == 0 ? this.f5868w.mo7321a(i, i2, i4, i3) : this.f5869x.mo7321a(i, i2, i4, i3);
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
                if (((C1732az.C1755i) j.getLayoutParams()).mo6953e()) {
                    if (view3 == null) {
                        view = view2;
                        i += i4;
                        view2 = view;
                        view3 = j;
                    }
                } else if (this.f5223o.mo6540a(j) < d && this.f5223o.mo6545b(j) >= c) {
                    return j;
                } else {
                    if (view2 == null) {
                        view = j;
                        j = view3;
                        i += i4;
                        view2 = view;
                        view3 = j;
                    }
                }
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
        mo5800b();
        if (mo6839H() == 0) {
            return null;
        }
        int g = mo5843g(i);
        if (g == Integer.MIN_VALUE) {
            return null;
        }
        mo5852m();
        mo5852m();
        m9442a(g, (int) (f5209b * ((float) this.f5223o.mo6552f())), false, uVar);
        this.f5215c.f5251n = Integer.MIN_VALUE;
        this.f5215c.f5245h = false;
        mo5815a(oVar, this.f5215c, uVar, true);
        View k = g == -1 ? m9468k(oVar, uVar) : m9466j(oVar, uVar);
        View c = g == -1 ? mo5802c() : m9449ac();
        if (!c.hasFocusable()) {
            return k;
        }
        if (k == null) {
            return null;
        }
        return c;
    }

    /* renamed from: a */
    public void mo5817a(int i, int i2, C1732az.C1771u uVar, C1732az.C1750h.C1753a aVar) {
        if (this.f5222n != 0) {
            i = i2;
        }
        if (mo6839H() != 0 && i != 0) {
            m9442a(i > 0 ? 1 : -1, Math.abs(i), true, uVar);
            mo5791a(uVar, this.f5215c, aVar);
        }
    }

    /* renamed from: a */
    public void mo5818a(int i, C1732az.C1750h.C1753a aVar) {
        int i2;
        boolean z;
        if (this.f5227s == null || !this.f5227s.mo5877a()) {
            mo5800b();
            boolean z2 = this.f5224p;
            if (this.f5225q == -1) {
                i2 = z2 ? i - 1 : 0;
                z = z2;
            } else {
                i2 = this.f5225q;
                z = z2;
            }
        } else {
            z = this.f5227s.f5259c;
            i2 = this.f5227s.f5257a;
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.f5214E && i2 >= 0 && i2 < i; i4++) {
            aVar.mo6388b(i2, 0);
            i2 += i3;
        }
    }

    /* renamed from: a */
    public void mo5819a(Parcelable parcelable) {
        if (parcelable instanceof C1602d) {
            this.f5227s = (C1602d) parcelable;
            mo6942y();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo5787a(C1732az.C1762o oVar, C1732az.C1771u uVar, C1599a aVar, int i) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo5788a(C1732az.C1762o oVar, C1732az.C1771u uVar, C1601c cVar, C1600b bVar) {
        int N;
        int f;
        int i;
        int i2;
        int f2;
        View a = cVar.mo5871a(oVar);
        if (a == null) {
            bVar.f5235b = true;
            return;
        }
        C1732az.C1755i iVar = (C1732az.C1755i) a.getLayoutParams();
        if (cVar.f5255r == null) {
            if (this.f5224p == (cVar.f5250m == -1)) {
                mo6905c(a);
            } else {
                mo6894b(a, 0);
            }
        } else {
            if (this.f5224p == (cVar.f5250m == -1)) {
                mo6893b(a);
            } else {
                mo6867a(a, 0);
            }
        }
        mo6895b(a, 0, 0);
        bVar.f5234a = this.f5223o.mo6551e(a);
        if (this.f5222n == 1) {
            if (mo5851l()) {
                f2 = mo6842K() - mo6846O();
                i = f2 - this.f5223o.mo6553f(a);
            } else {
                i = mo6844M();
                f2 = this.f5223o.mo6553f(a) + i;
            }
            if (cVar.f5250m == -1) {
                f = cVar.f5246i;
                N = cVar.f5246i - bVar.f5234a;
                i2 = f2;
            } else {
                N = cVar.f5246i;
                f = bVar.f5234a + cVar.f5246i;
                i2 = f2;
            }
        } else {
            N = mo6845N();
            f = N + this.f5223o.mo6553f(a);
            if (cVar.f5250m == -1) {
                int i3 = cVar.f5246i;
                i = cVar.f5246i - bVar.f5234a;
                i2 = i3;
            } else {
                i = cVar.f5246i;
                i2 = cVar.f5246i + bVar.f5234a;
            }
        }
        mo6896b(a, i, N, i2, f);
        if (iVar.mo6953e() || iVar.mo6954f()) {
            bVar.f5236c = true;
        }
        bVar.f5237d = a.hasFocusable();
    }

    /* renamed from: a */
    public void mo5790a(C1732az.C1771u uVar) {
        super.mo5790a(uVar);
        this.f5227s = null;
        this.f5225q = -1;
        this.f5226r = Integer.MIN_VALUE;
        this.f5228t.mo5864a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo5791a(C1732az.C1771u uVar, C1601c cVar, C1732az.C1750h.C1753a aVar) {
        int i = cVar.f5248k;
        if (i >= 0 && i < uVar.mo7056i()) {
            aVar.mo6388b(i, Math.max(0, cVar.f5251n));
        }
    }

    /* renamed from: a */
    public void mo5820a(C1732az azVar, C1732az.C1762o oVar) {
        super.mo5820a(azVar, oVar);
        if (this.f5220h) {
            mo6902c(oVar);
            oVar.mo6978a();
        }
    }

    /* renamed from: a */
    public void mo5821a(C1732az azVar, C1732az.C1771u uVar, int i) {
        C1701ao aoVar = new C1701ao(azVar.getContext());
        aoVar.mo7022d(i);
        mo6865a((C1732az.C1768t) aoVar);
    }

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    /* renamed from: a */
    public void mo5822a(View view, View view2, int i, int i2) {
        mo5824a("Cannot drop a view during a scroll or layout calculation");
        mo5852m();
        mo5800b();
        int e = mo6912e(view);
        int e2 = mo6912e(view2);
        boolean z = e < e2 ? true : true;
        if (this.f5224p) {
            if (z) {
                mo5827b(e2, this.f5223o.mo6548d() - (this.f5223o.mo6540a(view2) + this.f5223o.mo6551e(view)));
            } else {
                mo5827b(e2, this.f5223o.mo6548d() - this.f5223o.mo6545b(view2));
            }
        } else if (z) {
            mo5827b(e2, this.f5223o.mo6540a(view2));
        } else {
            mo5827b(e2, this.f5223o.mo6545b(view2) - this.f5223o.mo6551e(view));
        }
    }

    /* renamed from: a */
    public void mo5823a(AccessibilityEvent accessibilityEvent) {
        super.mo5823a(accessibilityEvent);
        if (mo6839H() > 0) {
            C0992u b = C0922a.m4609b(accessibilityEvent);
            b.mo3438c(mo5859t());
            b.mo3442d(mo5861v());
        }
    }

    /* renamed from: a */
    public void mo5824a(String str) {
        if (this.f5227s == null) {
            super.mo5824a(str);
        }
    }

    /* renamed from: a */
    public void mo5796a(boolean z) {
        mo5824a((String) null);
        if (this.f5218f != z) {
            this.f5218f = z;
            mo6942y();
        }
    }

    /* renamed from: b */
    public int mo5798b(int i, C1732az.C1762o oVar, C1732az.C1771u uVar) {
        if (this.f5222n == 0) {
            return 0;
        }
        return mo5829c(i, oVar, uVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo5825b(C1732az.C1771u uVar) {
        if (uVar.mo7054g()) {
            return this.f5223o.mo6552f();
        }
        return 0;
    }

    /* renamed from: b */
    public void mo5826b(int i) {
        if (i == 0 || i == 1) {
            mo5824a((String) null);
            if (i != this.f5222n) {
                this.f5222n = i;
                this.f5223o = null;
                mo6942y();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation:" + i);
    }

    /* renamed from: b */
    public void mo5827b(int i, int i2) {
        this.f5225q = i;
        this.f5226r = i2;
        if (this.f5227s != null) {
            this.f5227s.mo5878b();
        }
        mo6942y();
    }

    /* renamed from: b */
    public void mo5828b(boolean z) {
        this.f5220h = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo5829c(int i, C1732az.C1762o oVar, C1732az.C1771u uVar) {
        if (mo6839H() == 0 || i == 0) {
            return 0;
        }
        this.f5215c.f5245h = true;
        mo5852m();
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        m9442a(i2, abs, true, uVar);
        int a = this.f5215c.f5251n + mo5815a(oVar, this.f5215c, uVar, false);
        if (a < 0) {
            return 0;
        }
        if (abs > a) {
            i = i2 * a;
        }
        this.f5223o.mo6542a(-i);
        this.f5215c.f5254q = i;
        return i;
    }

    /* renamed from: c */
    public int mo5830c(C1732az.C1771u uVar) {
        return m9463i(uVar);
    }

    /* renamed from: c */
    public View mo5831c(int i) {
        int H = mo6839H();
        if (H == 0) {
            return null;
        }
        int e = i - mo6912e(mo6928j(0));
        if (e >= 0 && e < H) {
            View j = mo6928j(e);
            if (mo6912e(j) == i) {
                return j;
            }
        }
        return super.mo5831c(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public View mo5832c(int i, int i2) {
        int i3;
        int i4;
        mo5852m();
        if ((i2 > i ? 1 : i2 < i ? (char) 65535 : 0) == 0) {
            return mo6928j(i);
        }
        if (this.f5223o.mo6540a(mo6928j(i)) < this.f5223o.mo6546c()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = C0226aq.f1332I;
        }
        return this.f5222n == 0 ? this.f5868w.mo7321a(i, i2, i3, i4) : this.f5869x.mo7321a(i, i2, i3, i4);
    }

    /* renamed from: c */
    public void mo5803c(C1732az.C1762o oVar, C1732az.C1771u uVar) {
        int i;
        int i2;
        int i3;
        int i4;
        View c;
        int a;
        int i5 = -1;
        if (!(this.f5227s == null && this.f5225q == -1) && uVar.mo7056i() == 0) {
            mo6902c(oVar);
            return;
        }
        if (this.f5227s != null && this.f5227s.mo5877a()) {
            this.f5225q = this.f5227s.f5257a;
        }
        mo5852m();
        this.f5215c.f5245h = false;
        mo5800b();
        if (!(this.f5228t.f5232d && this.f5225q == -1 && this.f5227s == null)) {
            this.f5228t.mo5864a();
            this.f5228t.f5231c = this.f5224p ^ this.f5218f;
            m9447a(oVar, uVar, this.f5228t);
            this.f5228t.f5232d = true;
        }
        int b = mo5825b(uVar);
        if (this.f5215c.f5254q >= 0) {
            i = 0;
        } else {
            i = b;
            b = 0;
        }
        int c2 = i + this.f5223o.mo6546c();
        int g = b + this.f5223o.mo6554g();
        if (!(!uVar.mo7050c() || this.f5225q == -1 || this.f5226r == Integer.MIN_VALUE || (c = mo5831c(this.f5225q)) == null)) {
            if (this.f5224p) {
                a = (this.f5223o.mo6548d() - this.f5223o.mo6545b(c)) - this.f5226r;
            } else {
                a = this.f5226r - (this.f5223o.mo6540a(c) - this.f5223o.mo6546c());
            }
            if (a > 0) {
                c2 += a;
            } else {
                g -= a;
            }
        }
        if (this.f5228t.f5231c) {
            if (this.f5224p) {
                i5 = 1;
            }
        } else if (!this.f5224p) {
            i5 = 1;
        }
        mo5787a(oVar, uVar, this.f5228t, i5);
        mo6861a(oVar);
        this.f5215c.f5256s = mo5855p();
        this.f5215c.f5253p = uVar.mo7050c();
        if (this.f5228t.f5231c) {
            m9454b(this.f5228t);
            this.f5215c.f5252o = c2;
            mo5815a(oVar, this.f5215c, uVar, false);
            int i6 = this.f5215c.f5246i;
            int i7 = this.f5215c.f5248k;
            if (this.f5215c.f5247j > 0) {
                g += this.f5215c.f5247j;
            }
            m9443a(this.f5228t);
            this.f5215c.f5252o = g;
            this.f5215c.f5248k += this.f5215c.f5249l;
            mo5815a(oVar, this.f5215c, uVar, false);
            int i8 = this.f5215c.f5246i;
            if (this.f5215c.f5247j > 0) {
                int i9 = this.f5215c.f5247j;
                m9462h(i7, i6);
                this.f5215c.f5252o = i9;
                mo5815a(oVar, this.f5215c, uVar, false);
                i4 = this.f5215c.f5246i;
            } else {
                i4 = i6;
            }
            i3 = i4;
            i2 = i8;
        } else {
            m9443a(this.f5228t);
            this.f5215c.f5252o = g;
            mo5815a(oVar, this.f5215c, uVar, false);
            i2 = this.f5215c.f5246i;
            int i10 = this.f5215c.f5248k;
            if (this.f5215c.f5247j > 0) {
                c2 += this.f5215c.f5247j;
            }
            m9454b(this.f5228t);
            this.f5215c.f5252o = c2;
            this.f5215c.f5248k += this.f5215c.f5249l;
            mo5815a(oVar, this.f5215c, uVar, false);
            i3 = this.f5215c.f5246i;
            if (this.f5215c.f5247j > 0) {
                int i11 = this.f5215c.f5247j;
                mo5776a(i10, i2);
                this.f5215c.f5252o = i11;
                mo5815a(oVar, this.f5215c, uVar, false);
                i2 = this.f5215c.f5246i;
            }
        }
        if (mo6839H() > 0) {
            if (this.f5224p ^ this.f5218f) {
                int a2 = m9439a(i2, oVar, uVar, true);
                int i12 = i3 + a2;
                int b2 = m9451b(i12, oVar, uVar, false);
                i3 = i12 + b2;
                i2 = i2 + a2 + b2;
            } else {
                int b3 = m9451b(i3, oVar, uVar, true);
                int i13 = i2 + b3;
                int a3 = m9439a(i13, oVar, uVar, false);
                i3 = i3 + b3 + a3;
                i2 = i13 + a3;
            }
        }
        m9456b(oVar, uVar, i3, i2);
        if (!uVar.mo7050c()) {
            this.f5223o.mo6541a();
        } else {
            this.f5228t.mo5864a();
        }
        this.f5216d = this.f5218f;
    }

    /* renamed from: c */
    public void mo5833c(boolean z) {
        mo5824a((String) null);
        if (z != this.f5217e) {
            this.f5217e = z;
            mo6942y();
        }
    }

    /* renamed from: d */
    public int mo5834d(C1732az.C1771u uVar) {
        return m9463i(uVar);
    }

    /* renamed from: d */
    public PointF mo5835d(int i) {
        int i2 = 1;
        boolean z = false;
        if (mo6839H() == 0) {
            return null;
        }
        if (i < mo6912e(mo6928j(0))) {
            z = true;
        }
        if (z != this.f5224p) {
            i2 = -1;
        }
        return this.f5222n == 0 ? new PointF((float) i2, 0.0f) : new PointF(0.0f, (float) i2);
    }

    /* renamed from: d */
    public void mo5836d(boolean z) {
        this.f5219g = z;
    }

    /* renamed from: d */
    public boolean mo5804d() {
        return this.f5227s == null && this.f5216d == this.f5218f;
    }

    /* renamed from: e */
    public int mo5837e(C1732az.C1771u uVar) {
        return m9465j(uVar);
    }

    /* renamed from: e */
    public void mo5838e(int i) {
        this.f5225q = i;
        this.f5226r = Integer.MIN_VALUE;
        if (this.f5227s != null) {
            this.f5227s.mo5878b();
        }
        mo6942y();
    }

    /* renamed from: e */
    public boolean mo5839e() {
        return this.f5220h;
    }

    /* renamed from: f */
    public int mo5840f(C1732az.C1771u uVar) {
        return m9465j(uVar);
    }

    /* renamed from: f */
    public Parcelable mo5841f() {
        if (this.f5227s != null) {
            return new C1602d(this.f5227s);
        }
        C1602d dVar = new C1602d();
        if (mo6839H() > 0) {
            mo5852m();
            boolean z = this.f5216d ^ this.f5224p;
            dVar.f5259c = z;
            if (z) {
                View ac = m9449ac();
                dVar.f5258b = this.f5223o.mo6548d() - this.f5223o.mo6545b(ac);
                dVar.f5257a = mo6912e(ac);
                return dVar;
            }
            View c = mo5802c();
            dVar.f5257a = mo6912e(c);
            dVar.f5258b = this.f5223o.mo6540a(c) - this.f5223o.mo6546c();
            return dVar;
        }
        dVar.mo5878b();
        return dVar;
    }

    /* renamed from: f */
    public void mo5842f(int i) {
        this.f5214E = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo5843g(int i) {
        int i2 = Integer.MIN_VALUE;
        int i3 = 1;
        switch (i) {
            case 1:
                return (this.f5222n == 1 || !mo5851l()) ? -1 : 1;
            case 2:
                if (this.f5222n == 1) {
                    return 1;
                }
                return !mo5851l() ? 1 : -1;
            case 17:
                return this.f5222n != 0 ? Integer.MIN_VALUE : -1;
            case 33:
                return this.f5222n != 1 ? Integer.MIN_VALUE : -1;
            case 66:
                if (this.f5222n != 0) {
                    i3 = Integer.MIN_VALUE;
                }
                return i3;
            case C0755t.f2804k:
                if (this.f5222n == 1) {
                    i2 = 1;
                }
                return i2;
            default:
                return Integer.MIN_VALUE;
        }
    }

    /* renamed from: g */
    public int mo5844g(C1732az.C1771u uVar) {
        return m9467k(uVar);
    }

    /* renamed from: g */
    public boolean mo5845g() {
        return this.f5222n == 0;
    }

    /* renamed from: h */
    public int mo5846h(C1732az.C1771u uVar) {
        return m9467k(uVar);
    }

    /* renamed from: h */
    public boolean mo5847h() {
        return this.f5222n == 1;
    }

    /* renamed from: i */
    public boolean mo5848i() {
        return this.f5218f;
    }

    /* renamed from: j */
    public int mo5849j() {
        return this.f5222n;
    }

    /* renamed from: k */
    public boolean mo5850k() {
        return this.f5217e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public boolean mo5851l() {
        return mo6836E() == 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo5852m() {
        if (this.f5215c == null) {
            this.f5215c = mo5853n();
        }
        if (this.f5223o == null) {
            this.f5223o = C1719av.m10281a((C1732az.C1750h) this, this.f5222n);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public C1601c mo5853n() {
        return new C1601c();
    }

    /* renamed from: o */
    public boolean mo5854o() {
        return this.f5219g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean mo5855p() {
        return this.f5223o.mo6555h() == 0 && this.f5223o.mo6550e() == 0;
    }

    /* renamed from: q */
    public int mo5856q() {
        return this.f5214E;
    }

    @Deprecated
    /* renamed from: r */
    public int mo5857r() {
        return mo5856q();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public boolean mo5858s() {
        return (mo6841J() == 1073741824 || mo6840I() == 1073741824 || !mo6888ab()) ? false : true;
    }

    /* renamed from: t */
    public int mo5859t() {
        View a = mo5816a(0, mo6839H(), false, true);
        if (a == null) {
            return -1;
        }
        return mo6912e(a);
    }

    /* renamed from: u */
    public int mo5860u() {
        View a = mo5816a(0, mo6839H(), true, false);
        if (a == null) {
            return -1;
        }
        return mo6912e(a);
    }

    /* renamed from: v */
    public int mo5861v() {
        View a = mo5816a(mo6839H() - 1, -1, false, true);
        if (a == null) {
            return -1;
        }
        return mo6912e(a);
    }

    /* renamed from: w */
    public int mo5862w() {
        View a = mo5816a(mo6839H() - 1, -1, true, false);
        if (a == null) {
            return -1;
        }
        return mo6912e(a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo5863x() {
        boolean z = true;
        Log.d(f5208a, "validating child count " + mo6839H());
        if (mo6839H() >= 1) {
            int e = mo6912e(mo6928j(0));
            int a = this.f5223o.mo6540a(mo6928j(0));
            if (this.f5224p) {
                int i = 1;
                while (i < mo6839H()) {
                    View j = mo6928j(i);
                    int e2 = mo6912e(j);
                    int a2 = this.f5223o.mo6540a(j);
                    if (e2 < e) {
                        m9450ad();
                        StringBuilder append = new StringBuilder().append("detected invalid position. loc invalid? ");
                        if (a2 >= a) {
                            z = false;
                        }
                        throw new RuntimeException(append.append(z).toString());
                    } else if (a2 > a) {
                        m9450ad();
                        throw new RuntimeException("detected invalid location");
                    } else {
                        i++;
                    }
                }
                return;
            }
            int i2 = 1;
            while (i2 < mo6839H()) {
                View j2 = mo6928j(i2);
                int e3 = mo6912e(j2);
                int a3 = this.f5223o.mo6540a(j2);
                if (e3 < e) {
                    m9450ad();
                    StringBuilder append2 = new StringBuilder().append("detected invalid position. loc invalid? ");
                    if (a3 >= a) {
                        z = false;
                    }
                    throw new RuntimeException(append2.append(z).toString());
                } else if (a3 < a) {
                    m9450ad();
                    throw new RuntimeException("detected invalid location");
                } else {
                    i2++;
                }
            }
        }
    }
}
