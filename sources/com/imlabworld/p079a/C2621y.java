package com.imlabworld.p079a;

import android.util.Log;
import com.imlabworld.p079a.C2609q;

/* renamed from: com.imlabworld.a.y */
public class C2621y extends C2623z {
    public C2621y(C2597e eVar, int i, int i2, int i3, int i4) {
        this.f9960x = eVar;
        mo9801f();
        this.f9962z = i;
        this.f9941A = i2;
        this.f9945E = i3;
        this.f9946F = i4;
        this.f9949I = new C2619w(this.f9962z, 0.5d, 10);
        this.f9952L = 0;
        this.f9953M = 0;
        this.f9950J = new C2618v();
        this.f9951K = new C2620x(this.f9962z, this.f9941A, this.f9945E, this.f9946F);
    }

    /* renamed from: a */
    private void m14589a(int i, int i2, boolean z, double[] dArr) {
        int d = this.f9949I.f10737R.mo9977d();
        int a = this.f9949I.f10739a.mo9979a();
        int i3 = this.f9949I.f10739a.mo9992i();
        switch (this.f9960x.f10114a) {
            case BREATH_FINITE:
                switch (this.f9961y) {
                    case BREATH:
                        if (((double) (this.f9948H - this.f9949I.f10742d)) / 1000.0d > 9.0d && i3 > 0) {
                            this.f9949I.f10739a.f10678f = ((double) (this.f9949I.f10742d - this.f9949I.f10728I)) / 1000.0d;
                            this.f9949I.f10737R.f10670a.add(this.f9949I.f10739a);
                            this.f9961y = C2594bb.CPR_END;
                            return;
                        }
                        return;
                    default:
                        return;
                }
            case COMPRESSION_FINITE:
                switch (this.f9961y) {
                    case COMPRESSION:
                        double d2 = ((double) (this.f9948H - this.f9949I.f10753o)) / 1000.0d;
                        if (!this.f9949I.f10754p && d2 >= 9.0d && a > 0) {
                            this.f9949I.f10739a.f10673a = ((double) (this.f9949I.f10753o - this.f9949I.f10751m)) / 1000.0d;
                            this.f9949I.f10737R.f10670a.add(this.f9949I.f10739a);
                            this.f9961y = C2594bb.CPR_END;
                            return;
                        }
                        return;
                    default:
                        return;
                }
            case ALL_FINITE:
            case ALL_INFINITE:
                switch (this.f9961y) {
                    case COMPRESSION:
                        double d3 = ((double) (this.f9948H - this.f9949I.f10753o)) / 1000.0d;
                        if (!this.f9949I.f10754p && d3 >= 3.0d && this.f9960x.f10114a == C2590az.ALL_FINITE && d + 1 == this.f9960x.f10115b && a > 0) {
                            this.f9949I.f10739a.f10673a = ((double) (this.f9949I.f10753o - this.f9949I.f10751m)) / 1000.0d;
                            Log.e("Comp CPRTime" + mo9827w(), this.f9949I.f10739a.f10673a + "");
                            this.f9961y = C2594bb.BREATH;
                            this.f9949I.f10742d = this.f9949I.f10753o + 9000;
                            this.f9949I.f10728I = this.f9949I.f10753o;
                            this.f9949I.mo10029b();
                            return;
                        } else if (!this.f9949I.f10754p && d3 >= 1.0d && i2 > i && a > 0) {
                            this.f9949I.f10739a.f10673a = ((double) (this.f9949I.f10753o - this.f9949I.f10751m)) / 1000.0d;
                            Log.e("Comp CPRTime" + mo9827w(), this.f9949I.f10739a.f10673a + "");
                            this.f9961y = C2594bb.BREATH;
                            if (this.f9960x.f10114a == C2590az.ALL_FINITE && d + 1 == this.f9960x.f10115b) {
                                this.f9949I.f10742d = this.f9949I.f10753o + 9000;
                            }
                            this.f9949I.f10728I = this.f9949I.f10753o;
                            this.f9949I.mo10029b();
                            return;
                        } else if (!this.f9949I.f10754p && d3 >= 1.0d) {
                            if ((i <= i2 && (!z || dArr[2] <= 1.0d)) || a <= 0) {
                                return;
                            }
                            if (this.f9960x.f10114a == C2590az.ALL_INFINITE || d + 1 < this.f9960x.f10115b) {
                                this.f9949I.f10739a.f10673a = ((double) (this.f9949I.f10753o - this.f9949I.f10751m)) / 1000.0d;
                                Log.e("Comp CPRTime" + mo9827w(), this.f9949I.f10739a.f10673a + "");
                                this.f9949I.f10728I = this.f9949I.f10753o;
                                this.f9949I.f10739a.f10678f = ((double) (this.f9948H - this.f9949I.f10728I)) / 1000.0d;
                                Log.e("Breath CPRTime" + mo9827w(), this.f9949I.f10739a.f10678f + "");
                                this.f9949I.mo10028a(false, this.f9962z, 0.5d, 10);
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    case BREATH:
                        double d4 = ((double) (this.f9948H - this.f9949I.f10728I)) / 1000.0d;
                        if (this.f9960x.f10114a == C2590az.ALL_FINITE && d + 1 == this.f9960x.f10115b && d4 > 9.0d) {
                            this.f9949I.f10739a.f10678f = ((double) (this.f9949I.f10742d - this.f9949I.f10728I)) / 1000.0d;
                            Log.e("Breath CPRTime" + mo9827w(), this.f9949I.f10739a.f10678f + "");
                            this.f9949I.f10737R.f10670a.add(this.f9949I.f10739a);
                            this.f9961y = C2594bb.CPR_END;
                            return;
                        } else if (i2 >= 10) {
                            return;
                        } else {
                            if ((this.f9960x.f10114a != C2590az.ALL_INFINITE && d + 1 >= this.f9960x.f10115b) || d4 < 2.0d) {
                                return;
                            }
                            if (i > 20 || (z && dArr[2] > 1.0d)) {
                                this.f9961y = C2594bb.COMPRESSION;
                                this.f9949I.f10739a.f10678f = ((double) (this.f9948H - this.f9949I.f10728I)) / 1000.0d;
                                Log.e("Breath CPRTime" + mo9827w(), this.f9949I.f10739a.f10678f + "");
                                this.f9949I.mo10028a(false, this.f9962z, 0.5d, 10);
                                return;
                            }
                            return;
                        }
                    default:
                        return;
                }
            default:
                return;
        }
    }

    /* renamed from: b */
    private C2571ag m14590b(C2570af afVar) {
        int c = afVar.mo9839c();
        int a = mo9796a(afVar.mo9839c(), this.f9962z, this.f9941A, this.f9944D);
        int a2 = mo9796a(afVar.mo9831a(), this.f9962z, this.f9941A, this.f9944D);
        int a3 = mo9796a(afVar.mo9836b(), this.f9962z, this.f9941A, this.f9944D);
        int a4 = mo9795a(a, 10, 100);
        int a5 = mo9795a(a2, 10, 100);
        int a6 = mo9795a(a3, 10, 100);
        boolean[] h = afVar.mo9848h();
        int g = afVar.mo9847g();
        double[] d = afVar.mo9843d();
        double[] e = afVar.mo9845e();
        int a7 = mo9795a(mo9796a(afVar.mo9846f(), this.f9945E, this.f9946F, 1.0d), 10, 100);
        m14589a(a4, a7, g < 240, e);
        switch (this.f9961y) {
            case COMPRESSION:
            case COMPRESSION_IDLE:
                if (this.f9949I.f10747i) {
                    mo9804a(h, a4, a5, a6, e);
                    mo9803a(a4, c, e);
                } else {
                    mo9802a(a4, c);
                }
                C2609q.C2610a a8 = this.f9949I.f10738S.mo9961a(c, d, e, this.f9941A - this.f9962z, (int) this.f9949I.f10726G, this.f9949I.f10739a.mo9979a());
                int h2 = a8.mo9956h();
                C2609q.C2612c a9 = a8.mo9937a();
                this.f9962z = a9.mo9964a();
                this.f9941A = a9.mo9967b() + this.f9962z;
                if (h2 == 1 && !this.f9949I.f10750l) {
                    mo9805g();
                }
                mo9806h();
                return new C2576al(C2593ba.COMPRESSION, this.f9949I.f10741c, this.f9949I.f10743e, this.f9949I.f10744f, a4, this.f9949I.f10748j, this.f9949I.f10723D, this.f9949I.f10724E, this.f9949I.f10721B, this.f9949I.f10720A, this.f9949I.f10722C, this.f9949I.f10761w, this.f9949I.f10739a.mo9979a(), this.f9949I.f10739a.f10674b, a8);
            case BREATH:
            case BREATH_IDLE:
                if (this.f9949I.f10727H) {
                    mo10037a(a7);
                } else {
                    mo10038b(a7);
                }
                mo10039e();
                return new C2573ai(C2593ba.BREATH, this.f9949I.f10741c, this.f9949I.f10743e, this.f9949I.f10744f, a7, this.f9949I.f10735P, this.f9949I.f10736Q, this.f9949I.f10733N, this.f9949I.f10734O, this.f9949I.f10739a.mo9992i(), this.f9949I.f10739a.f10677e);
            case IDLE:
                mo9797a(g, a4, e, a7);
                return new C2571ag(C2593ba.IDLE);
            default:
                return new C2571ag(C2593ba.NORMAL);
        }
    }

    /* renamed from: c */
    private C2571ag m14591c(C2570af afVar) {
        C2571ag agVar = new C2571ag(C2593ba.NORMAL);
        int c = afVar.mo9839c();
        int f = afVar.mo9846f();
        switch (this.f9961y) {
            case ADJUSTING_ZERO:
                if (this.f9950J.f10714a < 10) {
                    if (Math.abs(this.f9950J.f10718e - f) < 100) {
                        C2618v vVar = this.f9950J;
                        vVar.f10716c = f + vVar.f10716c;
                        this.f9950J.f10714a++;
                    } else {
                        this.f9950J.f10716c = f;
                        this.f9950J.f10714a = 1;
                        this.f9950J.f10718e = f;
                    }
                }
                if (this.f9950J.f10715b < 10) {
                    if (Math.abs(this.f9950J.f10719f - c) < 100) {
                        C2618v vVar2 = this.f9950J;
                        vVar2.f10717d = c + vVar2.f10717d;
                        this.f9950J.f10715b++;
                    } else {
                        this.f9950J.f10717d = c;
                        this.f9950J.f10715b = 1;
                        this.f9950J.f10719f = c;
                    }
                }
                if (this.f9950J.f10714a != 10 || this.f9950J.f10715b != 10) {
                    return agVar;
                }
                int i = this.f9950J.f10716c / 10;
                int i2 = i + (this.f9946F - this.f9945E);
                int i3 = this.f9950J.f10717d / 10;
                int i4 = i3 + (this.f9941A - this.f9962z);
                this.f9945E = i;
                this.f9946F = i2;
                this.f9962z = i3;
                this.f9941A = i4;
                this.f9961y = C2594bb.ADJUST_ZERO_END;
                return new C2572ah(C2593ba.ADJUST_ZERO, i3, i4, i, i2);
            case ADJUST_ZERO_END:
                return new C2572ah(C2593ba.ADJUST_ZERO, this.f9962z, this.f9941A, this.f9945E, this.f9946F);
            default:
                return agVar;
        }
    }

    /* renamed from: d */
    private C2571ag m14592d(C2570af afVar) {
        C2571ag agVar = new C2571ag(C2593ba.NORMAL);
        int c = afVar.mo9839c();
        int a = mo9795a(mo9796a(afVar.mo9839c(), this.f9962z, this.f9941A, this.f9944D), 10, 100);
        double[] d = afVar.mo9843d();
        double[] e = afVar.mo9845e();
        int f = afVar.mo9846f();
        int a2 = mo9795a(mo9796a(f, this.f9945E, this.f9946F, 1.0d), 10, 100);
        switch (this.f9961y) {
            case CALIBRATION_COMPRESSION:
                mo9792a(c, d, e);
                return new C2575ak(C2593ba.CALIBRATION, a, a2, this.f9951K.f10776l, this.f9951K.f10785u, this.f9951K.f10777m, this.f9951K.f10786v);
            case CALIBRATION_BREATH:
                mo9793c(f);
                return new C2575ak(C2593ba.CALIBRATION, a, a2, this.f9951K.f10776l, this.f9951K.f10785u, this.f9951K.f10777m, this.f9951K.f10786v);
            case CALIBRATION_NORMAL:
                return new C2575ak(C2593ba.CALIBRATION, a, a2, this.f9951K.f10776l, this.f9951K.f10785u, this.f9951K.f10777m, this.f9951K.f10786v);
            default:
                return agVar;
        }
    }

    /* renamed from: a */
    public C2588ax mo10031a(C2570af afVar) {
        C2571ag c;
        if (!mo9798a(afVar.mo9849i())) {
            this.f9958R = new C2577am(C2593ba.ERROR, C2588ax.CP_DISCONNECT);
            return C2588ax.CP_DISCONNECT;
        } else if (!mo9800d(afVar.mo9846f())) {
            this.f9958R = new C2577am(C2593ba.ERROR, C2588ax.BM_DISCONNECT);
            return C2588ax.BM_DISCONNECT;
        } else {
            if (!this.f9949I.f10746h) {
                this.f9948H += 50;
                switch (this.f9960x.f10114a) {
                    case BREATH_FINITE:
                    case BREATH_INFINITE:
                    case COMPRESSION_FINITE:
                    case COMPRESSION_INFINITE:
                    case ALL_FINITE:
                    case ALL_INFINITE:
                        C2571ag b = m14590b(afVar);
                        switch (b.mo9852a()) {
                            case COMPRESSION:
                                this.f9954N = (C2576al) b;
                                break;
                            case BREATH:
                                this.f9955O = (C2573ai) b;
                                break;
                            case NORMAL:
                                this.f9959S = b;
                                break;
                        }
                    case CALIBRATION:
                        this.f9956P = (C2575ak) m14592d(afVar);
                        break;
                    case ADJUST_ZERO:
                        switch (m14591c(afVar).mo9852a()) {
                            case ADJUST_ZERO:
                                this.f9957Q = (C2572ah) c;
                                break;
                        }
                }
            }
            return C2588ax.NONE;
        }
    }

    /* renamed from: a */
    public void mo10032a() {
        this.f9949I.f10746h = true;
    }

    /* renamed from: a */
    public void mo10033a(C2597e eVar, int i, int i2, int i3, int i4) {
        this.f9960x = eVar;
        mo9801f();
        this.f9962z = i;
        this.f9941A = i2;
        this.f9945E = i3;
        this.f9946F = i4;
        this.f9949I = new C2619w(this.f9962z, 0.5d, 10);
        this.f9952L = 0;
        this.f9953M = 0;
        this.f9950J = new C2618v();
        this.f9951K = new C2620x(this.f9962z, this.f9941A, this.f9945E, this.f9946F);
    }

    /* renamed from: b */
    public void mo10034b() {
        this.f9949I.f10746h = false;
    }

    /* renamed from: c */
    public void mo10035c() {
        double d = 0.0d;
        if (this.f9961y != C2594bb.CPR_END) {
            switch (this.f9961y) {
                case COMPRESSION:
                    this.f9949I.f10739a.f10673a = ((double) (this.f9949I.f10753o - this.f9949I.f10751m)) / 1000.0d;
                    this.f9949I.f10739a.f10678f = 0.0d;
                    break;
                case BREATH:
                    double d2 = ((double) (this.f9949I.f10742d - this.f9949I.f10728I)) / 1000.0d;
                    if (this.f9949I.f10739a.f10676d != 0) {
                        d = d2;
                    }
                    this.f9949I.f10739a.f10678f = d;
                    break;
            }
            this.f9949I.f10737R.f10670a.add(this.f9949I.f10739a);
            this.f9961y = C2594bb.CPR_END;
        }
    }

    /* renamed from: d */
    public long mo10036d() {
        return this.f9948H;
    }
}
