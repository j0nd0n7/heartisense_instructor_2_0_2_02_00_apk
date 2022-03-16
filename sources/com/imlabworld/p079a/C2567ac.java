package com.imlabworld.p079a;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.imlabworld.a.ac */
class C2567ac extends C2564aa {
    C2567ac() {
    }

    /* renamed from: a */
    private int m14330a(boolean[] zArr) {
        for (int i = 0; i < 4; i++) {
            if (zArr[i]) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    private void mo10032a() {
        int d = this.f9949I.f10737R.mo9977d();
        if ((this.f9960x.f10114a == C2590az.ALL_FINITE || this.f9960x.f10114a == C2590az.ALL_INFINITE) && d != 0) {
            this.f9949I.f10737R.f10670a.get(d - 1).mo9985b(((double) (this.f9948H - this.f9949I.f10728I)) / 1000.0d);
        }
        C2619w wVar = this.f9949I;
        C2619w wVar2 = this.f9949I;
        long j = this.f9948H;
        wVar2.f10752n = j;
        wVar.f10751m = j;
        this.f9949I.f10745g = true;
    }

    /* renamed from: a */
    private boolean[] m14332a(int i, double d, double d2) {
        boolean[] zArr = {false, false, false, false};
        for (int i2 = 0; i2 < 4; i2++) {
            if (i2 % 2 == 1) {
                if (i > this.f9923f[i2]) {
                    zArr[i2] = true;
                }
            } else if (i > this.f9923f[i2] && d <= 4.0d && d2 <= 4.0d) {
                zArr[i2] = true;
            }
        }
        return zArr;
    }

    /* renamed from: b */
    private double m14333b(int i, int i2) {
        if (i2 == 0) {
            return 5.0d;
        }
        return (((double) i) * 1.0d) / ((double) i2);
    }

    /* renamed from: b */
    private void mo10034b() {
        int i;
        int i2;
        double c = mo10035c();
        this.f9949I.f10726G = 60.0d / c;
        this.f9949I.f10742d = this.f9948H;
        this.f9949I.f10740b = this.f9948H;
        this.f9949I.f10721B = this.f9949I.f10763y;
        this.f9949I.f10720A = this.f9949I.f10762x;
        this.f9949I.f10722C = this.f9949I.f10764z;
        if (this.f9949I.f10761w) {
            this.f9949I.f10723D = mo9794a((double) this.f9949I.f10755q) / 10.0d;
        } else {
            this.f9949I.f10723D = 0.0d;
        }
        this.f9949I.f10724E = this.f9949I.f10726G;
        if (this.f9949I.f10761w) {
            if (this.f9949I.f10764z == 1) {
                this.f9949I.f10741c = C2589ay.Not_Recoil;
            } else if (this.f9949I.f10763y == 1) {
                this.f9949I.f10741c = C2589ay.Too_Weak;
            } else if (this.f9949I.f10763y == 2) {
                this.f9949I.f10741c = C2589ay.Too_Strong;
            } else if (this.f9949I.f10762x == 1) {
                this.f9949I.f10741c = C2589ay.Too_Fast;
            } else if (this.f9949I.f10762x == 2) {
                this.f9949I.f10741c = C2589ay.Too_Slow;
            } else if (this.f9949I.f10763y == 0 && this.f9949I.f10762x == 0 && this.f9949I.f10764z == 0) {
                this.f9949I.f10741c = C2589ay.Good;
            } else {
                this.f9949I.f10741c = C2589ay.NONE;
            }
        }
        boolean z = this.f9949I.f10763y == 0 && this.f9949I.f10764z == 0;
        if (this.f9949I.f10761w) {
            i = this.f9949I.f10755q;
            i2 = this.f9949I.f10756r;
        } else {
            i = 0;
            i2 = 0;
        }
        this.f9949I.f10737R.f10671b.add(new C2615t((double) this.f9948H, mo9827w(), mo9829y(), i, i2, -1, 60.0d / c, true, this.f9949I.f10725F));
        this.f9949I.f10739a.mo9983a(z, this.f9949I.f10725F, this.f9949I.f10763y == 0, this.f9949I.f10762x == 0, this.f9949I.f10764z == 0, this.f9949I.f10761w, mo9794a((double) i), this.f9948H - this.f9949I.f10751m);
        this.f9949I.f10754p = false;
    }

    /* renamed from: c */
    private double mo10035c() {
        double d = ((double) (this.f9948H - this.f9949I.f10752n)) / 1000.0d;
        if (this.f9949I.f10739a.mo9979a() == 0) {
            d = 0.55d;
        }
        if (d < 0.5d) {
            this.f9949I.f10762x = 1;
        } else if (d <= 0.6d) {
            this.f9949I.f10762x = 0;
        } else {
            this.f9949I.f10762x = 2;
        }
        this.f9949I.f10752n = this.f9948H;
        this.f9949I.f10753o = this.f9948H;
        return d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9802a(int i, int i2) {
        int i3 = 100;
        boolean z = true;
        if (!this.f9949I.f10761w) {
            return;
        }
        if (i <= 10 || i - 10 > this.f9949I.f10756r) {
            this.f9949I.f10747i = true;
            if (i <= 10 || this.f9949I.f10756r <= 10) {
                this.f9949I.f10756r = 0;
                this.f9949I.f10764z = 0;
            } else {
                int min = Math.min(i, this.f9949I.f10756r);
                if (min <= 100) {
                    i3 = min;
                }
                int min2 = Math.min(i3, this.f9949I.f10755q);
                int max = Math.max(i3, this.f9949I.f10755q);
                this.f9949I.f10756r = min2;
                this.f9949I.f10755q = max;
                this.f9949I.f10764z = 1;
            }
            if (!this.f9949I.f10750l) {
                this.f9949I.f10758t = Math.min(this.f9949I.f10758t, i2);
                ArrayList<C2598f> arrayList = this.f9949I.f10749k;
                int i4 = this.f9949I.f10757s;
                int i5 = this.f9949I.f10758t;
                boolean z2 = this.f9949I.f10763y == 0;
                if (this.f9949I.f10764z != 0) {
                    z = false;
                }
                arrayList.add(new C2598f(i4, i5, z2, z, this.f9949I.f10737R.mo9977d(), this.f9949I.f10737R.mo9978e()));
            }
            mo10034b();
            this.f9949I.mo10027a();
        } else if (i <= this.f9949I.f10756r) {
            this.f9949I.f10756r = i;
            this.f9949I.f10758t = i2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9803a(int i, int i2, double[] dArr) {
        if (this.f9949I.f10761w) {
            if (!this.f9949I.f10745g && i > 10 && dArr[2] > 1.0d) {
                mo10032a();
            }
            if (!this.f9949I.f10754p && i > 10) {
                this.f9949I.f10754p = true;
            }
            if ((this.f9949I.f10755q > 10 || i > 10) && i < this.f9949I.f10755q) {
                this.f9949I.f10747i = false;
                if (this.f9949I.f10755q < this.f9942B) {
                    this.f9949I.f10763y = 1;
                } else if (this.f9949I.f10755q > this.f9943C) {
                    this.f9949I.f10763y = 2;
                } else {
                    this.f9949I.f10763y = 0;
                }
            } else if (i >= this.f9949I.f10755q) {
                this.f9949I.f10755q = i;
                this.f9949I.f10757s = i2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9804a(boolean[] zArr, int i, int i2, int i3, double[] dArr) {
        boolean[] a = m14332a(i, m14333b(i2, i3), m14333b(i3, i2));
        for (int i4 = 0; i4 < 4; i4++) {
            if (!zArr[i4] || a[i4] || dArr[2] <= 1.0d) {
                this.f9949I.f10748j[i4] = false;
                if (this.f9949I.f10760v == i4 && i <= 10) {
                    this.f9949I.f10760v = m14330a(zArr);
                    if (this.f9949I.f10760v == -1) {
                        this.f9949I.f10738S.mo9962a();
                        this.f9949I.f10764z = 3;
                        this.f9949I.f10763y = 3;
                        mo10034b();
                        this.f9949I.mo10027a();
                    }
                }
            } else {
                this.f9949I.f10748j[i4] = true;
                this.f9949I.f10725F[i4] = true;
                this.f9949I.f10761w = false;
                this.f9949I.f10740b = this.f9948H;
                this.f9949I.f10741c = C2589ay.Wrong_Position;
                if (!this.f9949I.f10745g) {
                    mo10032a();
                }
                if (!this.f9949I.f10754p) {
                    this.f9949I.f10754p = true;
                }
                if (!this.f9949I.f10759u) {
                    this.f9949I.f10759u = true;
                    this.f9949I.f10760v = i4;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo9805g() {
        ArrayList arrayList = new ArrayList();
        Iterator<C2598f> it = this.f9949I.f10749k.iterator();
        while (it.hasNext()) {
            C2598f next = it.next();
            int a = mo9796a(next.f10121a, this.f9962z, this.f9941A, this.f9944D);
            int a2 = mo9796a(next.f10122b, this.f9962z, this.f9941A, this.f9944D);
            int a3 = mo9795a(a, 10, 100);
            int a4 = mo9795a(a2, 10, 100);
            boolean z = a3 >= this.f9942B && a3 <= this.f9943C;
            boolean z2 = next.f10123c;
            boolean z3 = next.f10124d;
            if (z3) {
                a4 = 0;
            }
            int i = next.f10125e;
            int i2 = next.f10126f;
            if (z2 || !z) {
                if (z2 && !z) {
                    if (this.f9949I.f10737R.mo9977d() == i) {
                        if (z3) {
                            C2614s sVar = this.f9949I.f10739a;
                            sVar.f10674b--;
                        }
                        C2614s sVar2 = this.f9949I.f10739a;
                        sVar2.f10675c--;
                    } else {
                        if (z3) {
                            C2614s sVar3 = this.f9949I.f10737R.f10670a.get(i);
                            sVar3.f10674b--;
                        }
                        C2614s sVar4 = this.f9949I.f10737R.f10670a.get(i);
                        sVar4.f10675c--;
                    }
                }
            } else if (this.f9949I.f10737R.mo9977d() == i) {
                if (z3) {
                    this.f9949I.f10739a.f10674b++;
                }
                this.f9949I.f10739a.f10675c++;
            } else {
                if (z3) {
                    this.f9949I.f10737R.f10670a.get(i).f10674b++;
                }
                this.f9949I.f10737R.f10670a.get(i).f10675c++;
            }
            this.f9949I.f10737R.f10671b.get(i2).f10688a = a3;
            this.f9949I.f10737R.f10671b.get(i2).f10689b = a4;
            arrayList.add(Double.valueOf(mo9794a((double) a3)));
        }
        this.f9949I.f10739a.mo9981a((ArrayList<Double>) arrayList);
        this.f9949I.f10750l = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo9806h() {
        if (this.f9949I.f10745g) {
            this.f9949I.f10743e = ((double) (this.f9948H - this.f9949I.f10751m)) / 1000.0d;
            if (!this.f9949I.f10754p) {
                this.f9949I.f10744f = ((double) (this.f9948H - this.f9949I.f10753o)) / 1000.0d;
            } else {
                this.f9949I.f10744f = 0.0d;
            }
            if (this.f9961y == C2594bb.COMPRESSION_IDLE) {
                this.f9961y = C2594bb.COMPRESSION;
            }
        } else {
            this.f9949I.f10743e = 0.0d;
            this.f9949I.f10744f = 0.0d;
        }
        if (this.f9948H - this.f9949I.f10740b > 400) {
            this.f9949I.f10741c = C2589ay.NONE;
            this.f9949I.f10720A = 3;
            this.f9949I.f10721B = 3;
            this.f9949I.f10722C = 3;
        }
    }
}
