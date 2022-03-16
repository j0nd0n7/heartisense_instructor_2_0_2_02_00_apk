package android.support.p036v7.widget;

import android.support.annotation.C0003aa;
import android.support.annotation.C0020ao;
import android.support.annotation.C0047z;
import android.support.p010v4.p033o.C0876a;
import android.support.p010v4.p033o.C0886i;
import android.support.p010v4.p033o.C0896n;
import android.support.p036v7.widget.C1732az;

/* renamed from: android.support.v7.widget.bt */
class C1816bt {

    /* renamed from: c */
    private static final boolean f6163c = false;
    @C0020ao

    /* renamed from: a */
    final C0876a<C1732az.C1774x, C1817a> f6164a = new C0876a<>();
    @C0020ao

    /* renamed from: b */
    final C0886i<C1732az.C1774x> f6165b = new C0886i<>();

    /* renamed from: android.support.v7.widget.bt$a */
    static class C1817a {

        /* renamed from: a */
        static final int f6166a = 1;

        /* renamed from: b */
        static final int f6167b = 2;

        /* renamed from: c */
        static final int f6168c = 4;

        /* renamed from: d */
        static final int f6169d = 8;

        /* renamed from: e */
        static final int f6170e = 3;

        /* renamed from: f */
        static final int f6171f = 12;

        /* renamed from: g */
        static final int f6172g = 14;

        /* renamed from: k */
        static C0896n.C0897a<C1817a> f6173k = new C0896n.C0898b(20);

        /* renamed from: h */
        int f6174h;
        @C0003aa

        /* renamed from: i */
        C1732az.C1743e.C1747d f6175i;
        @C0003aa

        /* renamed from: j */
        C1732az.C1743e.C1747d f6176j;

        private C1817a() {
        }

        /* renamed from: a */
        static C1817a m11054a() {
            C1817a a = f6173k.mo2958a();
            return a == null ? new C1817a() : a;
        }

        /* renamed from: a */
        static void m11055a(C1817a aVar) {
            aVar.f6174h = 0;
            aVar.f6175i = null;
            aVar.f6176j = null;
            f6173k.mo2959a(aVar);
        }

        /* renamed from: b */
        static void m11056b() {
            do {
            } while (f6173k.mo2958a() != null);
        }
    }

    /* renamed from: android.support.v7.widget.bt$b */
    interface C1818b {
        /* renamed from: a */
        void mo6747a(C1732az.C1774x xVar);

        /* renamed from: a */
        void mo6748a(C1732az.C1774x xVar, @C0047z C1732az.C1743e.C1747d dVar, @C0003aa C1732az.C1743e.C1747d dVar2);

        /* renamed from: b */
        void mo6749b(C1732az.C1774x xVar, @C0003aa C1732az.C1743e.C1747d dVar, C1732az.C1743e.C1747d dVar2);

        /* renamed from: c */
        void mo6750c(C1732az.C1774x xVar, @C0047z C1732az.C1743e.C1747d dVar, @C0047z C1732az.C1743e.C1747d dVar2);
    }

    C1816bt() {
    }

    /* renamed from: a */
    private C1732az.C1743e.C1747d m11037a(C1732az.C1774x xVar, int i) {
        C1817a c;
        C1732az.C1743e.C1747d dVar = null;
        int a = this.f6164a.mo2961a((Object) xVar);
        if (!(a < 0 || (c = this.f6164a.mo2968c(a)) == null || (c.f6174h & i) == 0)) {
            c.f6174h &= i ^ -1;
            if (i == 4) {
                dVar = c.f6175i;
            } else if (i == 8) {
                dVar = c.f6176j;
            } else {
                throw new IllegalArgumentException("Must provide flag PRE or POST");
            }
            if ((c.f6174h & 12) == 0) {
                this.f6164a.mo2972d(a);
                C1817a.m11055a(c);
            }
        }
        return dVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C1732az.C1774x mo7329a(long j) {
        return this.f6165b.mo2860a(j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7330a() {
        this.f6164a.clear();
        this.f6165b.mo2869c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7331a(long j, C1732az.C1774x xVar) {
        this.f6165b.mo2867b(j, xVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7332a(C1732az.C1774x xVar, C1732az.C1743e.C1747d dVar) {
        C1817a aVar = this.f6164a.get(xVar);
        if (aVar == null) {
            aVar = C1817a.m11054a();
            this.f6164a.put(xVar, aVar);
        }
        aVar.f6175i = dVar;
        aVar.f6174h |= 4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7333a(C1818b bVar) {
        for (int size = this.f6164a.size() - 1; size >= 0; size--) {
            C1732az.C1774x b = this.f6164a.mo2967b(size);
            C1817a d = this.f6164a.mo2972d(size);
            if ((d.f6174h & 3) == 3) {
                bVar.mo6747a(b);
            } else if ((d.f6174h & 1) != 0) {
                if (d.f6175i == null) {
                    bVar.mo6747a(b);
                } else {
                    bVar.mo6748a(b, d.f6175i, d.f6176j);
                }
            } else if ((d.f6174h & 14) == 14) {
                bVar.mo6749b(b, d.f6175i, d.f6176j);
            } else if ((d.f6174h & 12) == 12) {
                bVar.mo6750c(b, d.f6175i, d.f6176j);
            } else if ((d.f6174h & 4) != 0) {
                bVar.mo6748a(b, d.f6175i, (C1732az.C1743e.C1747d) null);
            } else if ((d.f6174h & 8) != 0) {
                bVar.mo6749b(b, d.f6175i, d.f6176j);
            } else if ((d.f6174h & 2) != 0) {
            }
            C1817a.m11055a(d);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo7334a(C1732az.C1774x xVar) {
        C1817a aVar = this.f6164a.get(xVar);
        return (aVar == null || (aVar.f6174h & 1) == 0) ? false : true;
    }

    /* access modifiers changed from: package-private */
    @C0003aa
    /* renamed from: b */
    public C1732az.C1743e.C1747d mo7335b(C1732az.C1774x xVar) {
        return m11037a(xVar, 4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo7336b() {
        C1817a.m11056b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo7337b(C1732az.C1774x xVar, C1732az.C1743e.C1747d dVar) {
        C1817a aVar = this.f6164a.get(xVar);
        if (aVar == null) {
            aVar = C1817a.m11054a();
            this.f6164a.put(xVar, aVar);
        }
        aVar.f6174h |= 2;
        aVar.f6175i = dVar;
    }

    /* access modifiers changed from: package-private */
    @C0003aa
    /* renamed from: c */
    public C1732az.C1743e.C1747d mo7338c(C1732az.C1774x xVar) {
        return m11037a(xVar, 8);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo7339c(C1732az.C1774x xVar, C1732az.C1743e.C1747d dVar) {
        C1817a aVar = this.f6164a.get(xVar);
        if (aVar == null) {
            aVar = C1817a.m11054a();
            this.f6164a.put(xVar, aVar);
        }
        aVar.f6176j = dVar;
        aVar.f6174h |= 8;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo7340d(C1732az.C1774x xVar) {
        C1817a aVar = this.f6164a.get(xVar);
        return (aVar == null || (aVar.f6174h & 4) == 0) ? false : true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo7341e(C1732az.C1774x xVar) {
        C1817a aVar = this.f6164a.get(xVar);
        if (aVar == null) {
            aVar = C1817a.m11054a();
            this.f6164a.put(xVar, aVar);
        }
        aVar.f6174h |= 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo7342f(C1732az.C1774x xVar) {
        C1817a aVar = this.f6164a.get(xVar);
        if (aVar != null) {
            aVar.f6174h &= -2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo7343g(C1732az.C1774x xVar) {
        int b = this.f6165b.mo2864b() - 1;
        while (true) {
            if (b < 0) {
                break;
            } else if (xVar == this.f6165b.mo2868c(b)) {
                this.f6165b.mo2862a(b);
                break;
            } else {
                b--;
            }
        }
        C1817a remove = this.f6164a.remove(xVar);
        if (remove != null) {
            C1817a.m11055a(remove);
        }
    }

    /* renamed from: h */
    public void mo7344h(C1732az.C1774x xVar) {
        mo7342f(xVar);
    }
}
