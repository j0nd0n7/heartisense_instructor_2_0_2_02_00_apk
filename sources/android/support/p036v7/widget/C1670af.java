package android.support.p036v7.widget;

import android.support.annotation.C0047z;
import android.support.p010v4.p012b.C0163a;
import android.support.p010v4.view.C1040ar;
import android.support.p010v4.view.C1112bo;
import android.support.p010v4.view.C1130bu;
import android.support.p036v7.widget.C1732az;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: android.support.v7.widget.af */
public class C1670af extends C1792bg {

    /* renamed from: n */
    private static final boolean f5580n = false;

    /* renamed from: a */
    ArrayList<ArrayList<C1732az.C1774x>> f5581a = new ArrayList<>();

    /* renamed from: b */
    ArrayList<ArrayList<C1680b>> f5582b = new ArrayList<>();

    /* renamed from: c */
    ArrayList<ArrayList<C1679a>> f5583c = new ArrayList<>();

    /* renamed from: d */
    ArrayList<C1732az.C1774x> f5584d = new ArrayList<>();

    /* renamed from: e */
    ArrayList<C1732az.C1774x> f5585e = new ArrayList<>();

    /* renamed from: f */
    ArrayList<C1732az.C1774x> f5586f = new ArrayList<>();

    /* renamed from: g */
    ArrayList<C1732az.C1774x> f5587g = new ArrayList<>();

    /* renamed from: o */
    private ArrayList<C1732az.C1774x> f5588o = new ArrayList<>();

    /* renamed from: p */
    private ArrayList<C1732az.C1774x> f5589p = new ArrayList<>();

    /* renamed from: q */
    private ArrayList<C1680b> f5590q = new ArrayList<>();

    /* renamed from: r */
    private ArrayList<C1679a> f5591r = new ArrayList<>();

    /* renamed from: android.support.v7.widget.af$a */
    private static class C1679a {

        /* renamed from: a */
        public C1732az.C1774x f5616a;

        /* renamed from: b */
        public C1732az.C1774x f5617b;

        /* renamed from: c */
        public int f5618c;

        /* renamed from: d */
        public int f5619d;

        /* renamed from: e */
        public int f5620e;

        /* renamed from: f */
        public int f5621f;

        private C1679a(C1732az.C1774x xVar, C1732az.C1774x xVar2) {
            this.f5616a = xVar;
            this.f5617b = xVar2;
        }

        C1679a(C1732az.C1774x xVar, C1732az.C1774x xVar2, int i, int i2, int i3, int i4) {
            this(xVar, xVar2);
            this.f5618c = i;
            this.f5619d = i2;
            this.f5620e = i3;
            this.f5621f = i4;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f5616a + ", newHolder=" + this.f5617b + ", fromX=" + this.f5618c + ", fromY=" + this.f5619d + ", toX=" + this.f5620e + ", toY=" + this.f5621f + '}';
        }
    }

    /* renamed from: android.support.v7.widget.af$b */
    private static class C1680b {

        /* renamed from: a */
        public C1732az.C1774x f5622a;

        /* renamed from: b */
        public int f5623b;

        /* renamed from: c */
        public int f5624c;

        /* renamed from: d */
        public int f5625d;

        /* renamed from: e */
        public int f5626e;

        C1680b(C1732az.C1774x xVar, int i, int i2, int i3, int i4) {
            this.f5622a = xVar;
            this.f5623b = i;
            this.f5624c = i2;
            this.f5625d = i3;
            this.f5626e = i4;
        }
    }

    /* renamed from: android.support.v7.widget.af$c */
    private static class C1681c implements C1130bu {
        C1681c() {
        }

        /* renamed from: a */
        public void mo3893a(View view) {
        }

        /* renamed from: b */
        public void mo3894b(View view) {
        }

        /* renamed from: c */
        public void mo3895c(View view) {
        }
    }

    /* renamed from: a */
    private void m10061a(List<C1679a> list, C1732az.C1774x xVar) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C1679a aVar = list.get(size);
            if (m10062a(aVar, xVar) && aVar.f5616a == null && aVar.f5617b == null) {
                list.remove(aVar);
            }
        }
    }

    /* renamed from: a */
    private boolean m10062a(C1679a aVar, C1732az.C1774x xVar) {
        boolean z = false;
        if (aVar.f5617b == xVar) {
            aVar.f5617b = null;
        } else if (aVar.f5616a != xVar) {
            return false;
        } else {
            aVar.f5616a = null;
            z = true;
        }
        C1040ar.m5920c(xVar.itemView, 1.0f);
        C1040ar.m5881a(xVar.itemView, 0.0f);
        C1040ar.m5914b(xVar.itemView, 0.0f);
        mo7196a(xVar, z);
        return true;
    }

    /* renamed from: b */
    private void m10063b(C1679a aVar) {
        if (aVar.f5616a != null) {
            m10062a(aVar, aVar.f5616a);
        }
        if (aVar.f5617b != null) {
            m10062a(aVar, aVar.f5617b);
        }
    }

    /* renamed from: w */
    private void m10064w(final C1732az.C1774x xVar) {
        final C1112bo A = C1040ar.m5851A(xVar.itemView);
        this.f5586f.add(xVar);
        A.mo3819a(mo6817g()).mo3818a(0.0f).mo3820a((C1130bu) new C1681c() {
            /* renamed from: a */
            public void mo3893a(View view) {
                C1670af.this.mo7205n(xVar);
            }

            /* renamed from: b */
            public void mo3894b(View view) {
                A.mo3820a((C1130bu) null);
                C1040ar.m5920c(view, 1.0f);
                C1670af.this.mo7201k(xVar);
                C1670af.this.f5586f.remove(xVar);
                C1670af.this.mo6353c();
            }
        }).mo3833e();
    }

    /* renamed from: x */
    private void m10065x(C1732az.C1774x xVar) {
        C0163a.m799a(xVar.itemView);
        mo6356d(xVar);
    }

    /* renamed from: a */
    public void mo6343a() {
        boolean z = !this.f5588o.isEmpty();
        boolean z2 = !this.f5590q.isEmpty();
        boolean z3 = !this.f5591r.isEmpty();
        boolean z4 = !this.f5589p.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator<C1732az.C1774x> it = this.f5588o.iterator();
            while (it.hasNext()) {
                m10064w(it.next());
            }
            this.f5588o.clear();
            if (z2) {
                final ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.f5590q);
                this.f5582b.add(arrayList);
                this.f5590q.clear();
                C16711 r8 = new Runnable() {
                    public void run() {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            C1680b bVar = (C1680b) it.next();
                            C1670af.this.mo6350b(bVar.f5622a, bVar.f5623b, bVar.f5624c, bVar.f5625d, bVar.f5626e);
                        }
                        arrayList.clear();
                        C1670af.this.f5582b.remove(arrayList);
                    }
                };
                if (z) {
                    C1040ar.m5896a(((C1680b) arrayList.get(0)).f5622a.itemView, (Runnable) r8, mo6817g());
                } else {
                    r8.run();
                }
            }
            if (z3) {
                final ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.f5591r);
                this.f5583c.add(arrayList2);
                this.f5591r.clear();
                C16722 r82 = new Runnable() {
                    public void run() {
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            C1670af.this.mo6344a((C1679a) it.next());
                        }
                        arrayList2.clear();
                        C1670af.this.f5583c.remove(arrayList2);
                    }
                };
                if (z) {
                    C1040ar.m5896a(((C1679a) arrayList2.get(0)).f5616a.itemView, (Runnable) r82, mo6817g());
                } else {
                    r82.run();
                }
            }
            if (z4) {
                final ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(this.f5589p);
                this.f5581a.add(arrayList3);
                this.f5589p.clear();
                C16733 r12 = new Runnable() {
                    public void run() {
                        Iterator it = arrayList3.iterator();
                        while (it.hasNext()) {
                            C1670af.this.mo6354c((C1732az.C1774x) it.next());
                        }
                        arrayList3.clear();
                        C1670af.this.f5581a.remove(arrayList3);
                    }
                };
                if (z || z2 || z3) {
                    C1040ar.m5896a(((C1732az.C1774x) arrayList3.get(0)).itemView, (Runnable) r12, (z ? mo6817g() : 0) + Math.max(z2 ? mo6814e() : 0, z3 ? mo6819h() : 0));
                } else {
                    r12.run();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo6344a(final C1679a aVar) {
        final View view = null;
        C1732az.C1774x xVar = aVar.f5616a;
        View view2 = xVar == null ? null : xVar.itemView;
        C1732az.C1774x xVar2 = aVar.f5617b;
        if (xVar2 != null) {
            view = xVar2.itemView;
        }
        if (view2 != null) {
            final C1112bo a = C1040ar.m5851A(view2).mo3819a(mo6819h());
            this.f5587g.add(aVar.f5616a);
            a.mo3829c((float) (aVar.f5620e - aVar.f5618c));
            a.mo3830d((float) (aVar.f5621f - aVar.f5619d));
            a.mo3818a(0.0f).mo3820a((C1130bu) new C1681c() {
                /* renamed from: a */
                public void mo3893a(View view) {
                    C1670af.this.mo7198b(aVar.f5616a, true);
                }

                /* renamed from: b */
                public void mo3894b(View view) {
                    a.mo3820a((C1130bu) null);
                    C1040ar.m5920c(view, 1.0f);
                    C1040ar.m5881a(view, 0.0f);
                    C1040ar.m5914b(view, 0.0f);
                    C1670af.this.mo7196a(aVar.f5616a, true);
                    C1670af.this.f5587g.remove(aVar.f5616a);
                    C1670af.this.mo6353c();
                }
            }).mo3833e();
        }
        if (view != null) {
            final C1112bo A = C1040ar.m5851A(view);
            this.f5587g.add(aVar.f5617b);
            A.mo3829c(0.0f).mo3830d(0.0f).mo3819a(mo6819h()).mo3818a(1.0f).mo3820a((C1130bu) new C1681c() {
                /* renamed from: a */
                public void mo3893a(View view) {
                    C1670af.this.mo7198b(aVar.f5617b, false);
                }

                /* renamed from: b */
                public void mo3894b(View view) {
                    A.mo3820a((C1130bu) null);
                    C1040ar.m5920c(view, 1.0f);
                    C1040ar.m5881a(view, 0.0f);
                    C1040ar.m5914b(view, 0.0f);
                    C1670af.this.mo7196a(aVar.f5617b, false);
                    C1670af.this.f5587g.remove(aVar.f5617b);
                    C1670af.this.mo6353c();
                }
            }).mo3833e();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo6345a(List<C1732az.C1774x> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C1040ar.m5851A(list.get(size).itemView).mo3831d();
        }
    }

    /* renamed from: a */
    public boolean mo6346a(C1732az.C1774x xVar) {
        m10065x(xVar);
        this.f5588o.add(xVar);
        return true;
    }

    /* renamed from: a */
    public boolean mo6347a(C1732az.C1774x xVar, int i, int i2, int i3, int i4) {
        View view = xVar.itemView;
        int v = (int) (((float) i) + C1040ar.m5964v(xVar.itemView));
        int w = (int) (((float) i2) + C1040ar.m5965w(xVar.itemView));
        m10065x(xVar);
        int i5 = i3 - v;
        int i6 = i4 - w;
        if (i5 == 0 && i6 == 0) {
            mo7203l(xVar);
            return false;
        }
        if (i5 != 0) {
            C1040ar.m5881a(view, (float) (-i5));
        }
        if (i6 != 0) {
            C1040ar.m5914b(view, (float) (-i6));
        }
        this.f5590q.add(new C1680b(xVar, v, w, i3, i4));
        return true;
    }

    /* renamed from: a */
    public boolean mo6348a(C1732az.C1774x xVar, C1732az.C1774x xVar2, int i, int i2, int i3, int i4) {
        if (xVar == xVar2) {
            return mo6347a(xVar, i, i2, i3, i4);
        }
        float v = C1040ar.m5964v(xVar.itemView);
        float w = C1040ar.m5965w(xVar.itemView);
        float h = C1040ar.m5938h(xVar.itemView);
        m10065x(xVar);
        int i5 = (int) (((float) (i3 - i)) - v);
        int i6 = (int) (((float) (i4 - i2)) - w);
        C1040ar.m5881a(xVar.itemView, v);
        C1040ar.m5914b(xVar.itemView, w);
        C1040ar.m5920c(xVar.itemView, h);
        if (xVar2 != null) {
            m10065x(xVar2);
            C1040ar.m5881a(xVar2.itemView, (float) (-i5));
            C1040ar.m5914b(xVar2.itemView, (float) (-i6));
            C1040ar.m5920c(xVar2.itemView, 0.0f);
        }
        this.f5591r.add(new C1679a(xVar, xVar2, i, i2, i3, i4));
        return true;
    }

    /* renamed from: a */
    public boolean mo6349a(@C0047z C1732az.C1774x xVar, @C0047z List<Object> list) {
        return !list.isEmpty() || super.mo6349a(xVar, list);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo6350b(C1732az.C1774x xVar, int i, int i2, int i3, int i4) {
        View view = xVar.itemView;
        final int i5 = i3 - i;
        final int i6 = i4 - i2;
        if (i5 != 0) {
            C1040ar.m5851A(view).mo3829c(0.0f);
        }
        if (i6 != 0) {
            C1040ar.m5851A(view).mo3830d(0.0f);
        }
        final C1112bo A = C1040ar.m5851A(view);
        this.f5585e.add(xVar);
        final C1732az.C1774x xVar2 = xVar;
        A.mo3819a(mo6814e()).mo3820a((C1130bu) new C1681c() {
            /* renamed from: a */
            public void mo3893a(View view) {
                C1670af.this.mo7206o(xVar2);
            }

            /* renamed from: b */
            public void mo3894b(View view) {
                A.mo3820a((C1130bu) null);
                C1670af.this.mo7203l(xVar2);
                C1670af.this.f5585e.remove(xVar2);
                C1670af.this.mo6353c();
            }

            /* renamed from: c */
            public void mo3895c(View view) {
                if (i5 != 0) {
                    C1040ar.m5881a(view, 0.0f);
                }
                if (i6 != 0) {
                    C1040ar.m5914b(view, 0.0f);
                }
            }
        }).mo3833e();
    }

    /* renamed from: b */
    public boolean mo6351b() {
        return !this.f5589p.isEmpty() || !this.f5591r.isEmpty() || !this.f5590q.isEmpty() || !this.f5588o.isEmpty() || !this.f5585e.isEmpty() || !this.f5586f.isEmpty() || !this.f5584d.isEmpty() || !this.f5587g.isEmpty() || !this.f5582b.isEmpty() || !this.f5581a.isEmpty() || !this.f5583c.isEmpty();
    }

    /* renamed from: b */
    public boolean mo6352b(C1732az.C1774x xVar) {
        m10065x(xVar);
        C1040ar.m5920c(xVar.itemView, 0.0f);
        this.f5589p.add(xVar);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo6353c() {
        if (!mo6351b()) {
            mo6821i();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo6354c(final C1732az.C1774x xVar) {
        final C1112bo A = C1040ar.m5851A(xVar.itemView);
        this.f5584d.add(xVar);
        A.mo3818a(1.0f).mo3819a(mo6815f()).mo3820a((C1130bu) new C1681c() {
            /* renamed from: a */
            public void mo3893a(View view) {
                C1670af.this.mo7207p(xVar);
            }

            /* renamed from: b */
            public void mo3894b(View view) {
                A.mo3820a((C1130bu) null);
                C1670af.this.mo7204m(xVar);
                C1670af.this.f5584d.remove(xVar);
                C1670af.this.mo6353c();
            }

            /* renamed from: c */
            public void mo3895c(View view) {
                C1040ar.m5920c(view, 1.0f);
            }
        }).mo3833e();
    }

    /* renamed from: d */
    public void mo6355d() {
        for (int size = this.f5590q.size() - 1; size >= 0; size--) {
            C1680b bVar = this.f5590q.get(size);
            View view = bVar.f5622a.itemView;
            C1040ar.m5914b(view, 0.0f);
            C1040ar.m5881a(view, 0.0f);
            mo7203l(bVar.f5622a);
            this.f5590q.remove(size);
        }
        for (int size2 = this.f5588o.size() - 1; size2 >= 0; size2--) {
            mo7201k(this.f5588o.get(size2));
            this.f5588o.remove(size2);
        }
        for (int size3 = this.f5589p.size() - 1; size3 >= 0; size3--) {
            C1732az.C1774x xVar = this.f5589p.get(size3);
            C1040ar.m5920c(xVar.itemView, 1.0f);
            mo7204m(xVar);
            this.f5589p.remove(size3);
        }
        for (int size4 = this.f5591r.size() - 1; size4 >= 0; size4--) {
            m10063b(this.f5591r.get(size4));
        }
        this.f5591r.clear();
        if (mo6351b()) {
            for (int size5 = this.f5582b.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = this.f5582b.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    C1680b bVar2 = (C1680b) arrayList.get(size6);
                    View view2 = bVar2.f5622a.itemView;
                    C1040ar.m5914b(view2, 0.0f);
                    C1040ar.m5881a(view2, 0.0f);
                    mo7203l(bVar2.f5622a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f5582b.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f5581a.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = this.f5581a.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    C1732az.C1774x xVar2 = (C1732az.C1774x) arrayList2.get(size8);
                    C1040ar.m5920c(xVar2.itemView, 1.0f);
                    mo7204m(xVar2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f5581a.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f5583c.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = this.f5583c.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    m10063b((C1679a) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f5583c.remove(arrayList3);
                    }
                }
            }
            mo6345a((List<C1732az.C1774x>) this.f5586f);
            mo6345a((List<C1732az.C1774x>) this.f5585e);
            mo6345a((List<C1732az.C1774x>) this.f5584d);
            mo6345a((List<C1732az.C1774x>) this.f5587g);
            mo6821i();
        }
    }

    /* renamed from: d */
    public void mo6356d(C1732az.C1774x xVar) {
        View view = xVar.itemView;
        C1040ar.m5851A(view).mo3831d();
        for (int size = this.f5590q.size() - 1; size >= 0; size--) {
            if (this.f5590q.get(size).f5622a == xVar) {
                C1040ar.m5914b(view, 0.0f);
                C1040ar.m5881a(view, 0.0f);
                mo7203l(xVar);
                this.f5590q.remove(size);
            }
        }
        m10061a((List<C1679a>) this.f5591r, xVar);
        if (this.f5588o.remove(xVar)) {
            C1040ar.m5920c(view, 1.0f);
            mo7201k(xVar);
        }
        if (this.f5589p.remove(xVar)) {
            C1040ar.m5920c(view, 1.0f);
            mo7204m(xVar);
        }
        for (int size2 = this.f5583c.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = this.f5583c.get(size2);
            m10061a((List<C1679a>) arrayList, xVar);
            if (arrayList.isEmpty()) {
                this.f5583c.remove(size2);
            }
        }
        for (int size3 = this.f5582b.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = this.f5582b.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((C1680b) arrayList2.get(size4)).f5622a == xVar) {
                    C1040ar.m5914b(view, 0.0f);
                    C1040ar.m5881a(view, 0.0f);
                    mo7203l(xVar);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f5582b.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f5581a.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = this.f5581a.get(size5);
            if (arrayList3.remove(xVar)) {
                C1040ar.m5920c(view, 1.0f);
                mo7204m(xVar);
                if (arrayList3.isEmpty()) {
                    this.f5581a.remove(size5);
                }
            }
        }
        if (this.f5586f.remove(xVar)) {
        }
        if (this.f5584d.remove(xVar)) {
        }
        if (this.f5587g.remove(xVar)) {
        }
        if (this.f5585e.remove(xVar)) {
        }
        mo6353c();
    }
}
