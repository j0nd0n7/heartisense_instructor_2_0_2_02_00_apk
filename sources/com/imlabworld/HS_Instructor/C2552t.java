package com.imlabworld.HS_Instructor;

import com.imlabworld.p079a.C2590az;

/* renamed from: com.imlabworld.HS_Instructor.t */
public class C2552t {

    /* renamed from: a */
    int f9745a;

    /* renamed from: b */
    int f9746b;

    /* renamed from: c */
    int f9747c;

    /* renamed from: d */
    int f9748d;

    /* renamed from: e */
    int f9749e;

    /* renamed from: f */
    int f9750f;

    /* renamed from: g */
    int f9751g;

    /* renamed from: h */
    int f9752h;

    /* renamed from: i */
    int f9753i;

    /* renamed from: j */
    String f9754j;

    /* renamed from: k */
    int f9755k;

    /* renamed from: l */
    int f9756l;

    /* renamed from: m */
    private int f9757m;

    /* renamed from: n */
    private int f9758n;

    public C2552t() {
        this.f9745a = 1;
        this.f9746b = 3;
        this.f9747c = 1;
        this.f9748d = 2;
        this.f9749e = 6;
        this.f9758n = 1;
        this.f9750f = 1;
        this.f9751g = 1;
        this.f9752h = 1;
        this.f9753i = 1;
        this.f9754j = "kr";
        this.f9755k = 8;
        this.f9756l = 1;
    }

    public C2552t(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, String str, int i12, int i13) {
        this.f9757m = i;
        this.f9745a = i2;
        this.f9746b = i3;
        this.f9747c = i4;
        this.f9748d = i5;
        this.f9749e = i6;
        this.f9758n = i7;
        this.f9750f = i8;
        this.f9751g = i9;
        this.f9752h = i10;
        this.f9753i = i11;
        this.f9754j = str;
        this.f9755k = i12;
        this.f9756l = i13;
    }

    /* renamed from: a */
    public C2552t clone() {
        return new C2552t(this.f9757m, this.f9745a, this.f9746b, this.f9747c, this.f9748d, this.f9749e, this.f9758n, this.f9750f, this.f9751g, this.f9752h, this.f9753i, this.f9754j, this.f9755k, this.f9756l);
    }

    /* renamed from: a */
    public C2590az mo9677a(int i) {
        C2590az azVar = C2590az.ALL_INFINITE;
        switch (i) {
            case 9:
            case 10:
                switch (this.f9746b) {
                    case 1:
                        return this.f9749e != 6 ? C2590az.COMPRESSION_FINITE : C2590az.COMPRESSION_FINITE;
                    case 2:
                        return this.f9749e != 6 ? C2590az.BREATH_FINITE : C2590az.BREATH_FINITE;
                    case 3:
                        return this.f9749e != 6 ? C2590az.ALL_FINITE : C2590az.ALL_INFINITE;
                    default:
                        return azVar;
                }
            case 13:
                switch (this.f9746b) {
                    case 1:
                        return this.f9749e != 6 ? C2590az.COMPRESSION_FINITE : C2590az.COMPRESSION_FINITE;
                    case 2:
                        return this.f9749e != 6 ? C2590az.BREATH_FINITE : C2590az.BREATH_FINITE;
                    case 3:
                        return this.f9749e != 6 ? C2590az.ALL_FINITE : C2590az.ALL_INFINITE;
                    default:
                        return azVar;
                }
            case 16:
            case 17:
                switch (this.f9746b) {
                    case 1:
                        return C2590az.COMPRESSION_INFINITE;
                    case 2:
                        return C2590az.BREATH_INFINITE;
                    case 3:
                        return C2590az.ALL_INFINITE;
                    default:
                        return azVar;
                }
            default:
                return azVar;
        }
    }

    /* renamed from: a */
    public void mo9678a(String str) {
        this.f9754j = str;
    }

    /* renamed from: b */
    public int mo9679b(int i) {
        switch (i) {
            case 9:
            case 10:
                switch (this.f9746b) {
                    case 1:
                        if (this.f9749e != 6) {
                        }
                        return 1;
                    case 2:
                        if (this.f9749e != 6) {
                        }
                        return 1;
                    case 3:
                        if (this.f9749e != 6) {
                            return this.f9749e;
                        }
                        return 1;
                    default:
                        return 1;
                }
            case 13:
                switch (this.f9746b) {
                    case 1:
                        if (this.f9749e != 6) {
                        }
                        return 1;
                    case 2:
                        if (this.f9749e != 6) {
                        }
                        return 1;
                    case 3:
                        if (this.f9749e != 6) {
                            return this.f9749e;
                        }
                        return 1;
                    default:
                        return 1;
                }
            case 16:
            case 17:
                switch (this.f9746b) {
                }
                return 1;
            default:
                return 1;
        }
    }

    /* renamed from: b */
    public C2590az mo9680b() {
        C2590az azVar = C2590az.ALL_INFINITE;
        switch (this.f9746b) {
            case 1:
                return this.f9749e != 6 ? C2590az.COMPRESSION_FINITE : C2590az.COMPRESSION_FINITE;
            case 2:
                return this.f9749e != 6 ? C2590az.BREATH_FINITE : C2590az.BREATH_FINITE;
            case 3:
                return this.f9749e != 6 ? C2590az.ALL_FINITE : C2590az.ALL_INFINITE;
            default:
                return azVar;
        }
    }

    /* renamed from: c */
    public int mo9681c() {
        switch (this.f9746b) {
            case 1:
                if (this.f9749e != 6) {
                }
                return 1;
            case 2:
                if (this.f9749e != 6) {
                }
                return 1;
            case 3:
                if (this.f9749e != 6) {
                    return this.f9749e;
                }
                return 1;
            default:
                return 1;
        }
    }

    /* renamed from: c */
    public void mo9682c(int i) {
        this.f9757m = i;
    }

    /* renamed from: d */
    public int mo9684d() {
        return this.f9757m;
    }

    /* renamed from: d */
    public void mo9685d(int i) {
        this.f9745a = i;
    }

    /* renamed from: e */
    public int mo9686e() {
        return this.f9745a;
    }

    /* renamed from: e */
    public void mo9687e(int i) {
        this.f9746b = i;
    }

    /* renamed from: f */
    public int mo9688f() {
        return this.f9746b;
    }

    /* renamed from: f */
    public void mo9689f(int i) {
        this.f9747c = i;
    }

    /* renamed from: g */
    public int mo9690g() {
        return this.f9747c;
    }

    /* renamed from: g */
    public void mo9691g(int i) {
        this.f9748d = i;
    }

    /* renamed from: h */
    public int mo9692h() {
        return this.f9748d;
    }

    /* renamed from: h */
    public void mo9693h(int i) {
        this.f9749e = i;
    }

    /* renamed from: i */
    public int mo9694i() {
        return this.f9749e;
    }

    /* renamed from: i */
    public void mo9695i(int i) {
        this.f9758n = i;
    }

    /* renamed from: j */
    public int mo9696j() {
        return this.f9758n;
    }

    /* renamed from: j */
    public void mo9697j(int i) {
        this.f9750f = i;
    }

    /* renamed from: k */
    public int mo9698k() {
        return this.f9750f;
    }

    /* renamed from: k */
    public void mo9699k(int i) {
        this.f9751g = i;
    }

    /* renamed from: l */
    public int mo9700l() {
        return this.f9751g;
    }

    /* renamed from: l */
    public void mo9701l(int i) {
        this.f9752h = i;
    }

    /* renamed from: m */
    public int mo9702m() {
        return this.f9752h;
    }

    /* renamed from: m */
    public void mo9703m(int i) {
        this.f9753i = i;
    }

    /* renamed from: n */
    public int mo9704n() {
        return this.f9753i;
    }

    /* renamed from: n */
    public void mo9705n(int i) {
        this.f9755k = i;
    }

    /* renamed from: o */
    public String mo9706o() {
        return this.f9754j;
    }

    /* renamed from: o */
    public void mo9707o(int i) {
        this.f9756l = i;
    }

    /* renamed from: p */
    public int mo9708p() {
        return this.f9755k;
    }

    /* renamed from: q */
    public int mo9709q() {
        return this.f9756l;
    }

    public String toString() {
        return String.format("%d %d %d %d %d %d %d %d %d %d %s %d %d", new Object[]{Integer.valueOf(this.f9745a), Integer.valueOf(this.f9746b), Integer.valueOf(this.f9747c), Integer.valueOf(this.f9748d), Integer.valueOf(this.f9749e), Integer.valueOf(this.f9758n), Integer.valueOf(this.f9750f), Integer.valueOf(this.f9751g), Integer.valueOf(this.f9752h), Integer.valueOf(this.f9753i), this.f9754j, Integer.valueOf(this.f9755k), Integer.valueOf(this.f9756l)});
    }
}
