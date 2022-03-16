package com.imlabworld.p079a;

/* renamed from: com.imlabworld.a.z */
class C2623z extends C2567ac {
    C2623z() {
    }

    /* renamed from: a */
    private void mo10032a() {
        double b = mo10034b();
        this.f9949I.f10742d = this.f9948H;
        this.f9949I.f10740b = this.f9948H;
        this.f9949I.f10733N = this.f9949I.f10731L;
        this.f9949I.f10734O = this.f9949I.f10732M;
        this.f9949I.f10735P = mo9799b((double) this.f9949I.f10730K);
        this.f9949I.f10736Q = 60.0d / b;
        if (this.f9949I.f10731L == 1) {
            this.f9949I.f10741c = C2589ay.Too_Weak;
        } else if (this.f9949I.f10731L == 2) {
            this.f9949I.f10741c = C2589ay.Too_Strong;
        } else if (this.f9949I.f10731L == 0) {
            this.f9949I.f10741c = C2589ay.Good;
        } else {
            this.f9949I.f10741c = C2589ay.NONE;
        }
        this.f9949I.f10737R.f10671b.add(new C2615t((double) this.f9948H, mo9827w(), mo9830z(), -1, -1, this.f9949I.f10730K, 60.0d / b, false, new boolean[]{false, false, false, false}));
        this.f9949I.f10739a.mo9982a(this.f9949I.f10731L == 0, mo9799b((double) this.f9949I.f10730K), this.f9948H - this.f9949I.f10728I);
    }

    /* renamed from: b */
    private double mo10034b() {
        double d = ((double) (this.f9948H - this.f9949I.f10729J)) / 1000.0d;
        if (this.f9949I.f10739a.mo9992i() == 0) {
            d = 7.5d;
        }
        if (d < 5.0d) {
            this.f9949I.f10732M = 1;
        } else if (d <= 15.0d) {
            this.f9949I.f10732M = 0;
        } else {
            this.f9949I.f10732M = 2;
        }
        this.f9949I.f10729J = this.f9948H;
        return d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10037a(int i) {
        if ((this.f9960x.f10114a == C2590az.BREATH_FINITE || this.f9960x.f10114a == C2590az.BREATH_INFINITE) && !this.f9949I.f10745g && i > 10) {
            C2619w wVar = this.f9949I;
            C2619w wVar2 = this.f9949I;
            long j = this.f9948H;
            wVar2.f10729J = j;
            wVar.f10728I = j;
            this.f9949I.f10745g = true;
        }
        if (i > 10 && i + 3 < this.f9949I.f10730K) {
            this.f9949I.f10727H = false;
            if (this.f9949I.f10730K < 35) {
                this.f9949I.f10731L = 1;
            } else if (this.f9949I.f10730K > 70) {
                this.f9949I.f10731L = 2;
            } else {
                this.f9949I.f10731L = 0;
            }
        } else if (i >= this.f9949I.f10730K) {
            this.f9949I.f10730K = i;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo10038b(int i) {
        if (i <= 10) {
            this.f9949I.f10727H = true;
            mo10032a();
            this.f9949I.mo10030c();
            if (this.f9960x.f10114a == C2590az.ALL_FINITE && this.f9949I.f10739a.mo9992i() == 2 && this.f9949I.f10737R.mo9977d() == this.f9960x.f10115b - 1) {
                this.f9949I.f10739a.f10678f = ((double) (this.f9949I.f10742d - this.f9949I.f10728I)) / 1000.0d;
                this.f9949I.f10737R.f10670a.add(this.f9949I.f10739a);
                this.f9961y = C2594bb.CPR_END;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo10039e() {
        if (this.f9949I.f10745g) {
            this.f9949I.f10743e = ((double) (this.f9948H - this.f9949I.f10728I)) / 1000.0d;
            this.f9949I.f10744f = ((double) (this.f9948H - this.f9949I.f10728I)) / 1000.0d;
            if (this.f9961y == C2594bb.BREATH_IDLE) {
                this.f9961y = C2594bb.BREATH;
            }
        } else {
            this.f9949I.f10743e = 0.0d;
            this.f9949I.f10744f = 0.0d;
        }
        if (this.f9948H - this.f9949I.f10740b > 400) {
            this.f9949I.f10741c = C2589ay.NONE;
            this.f9949I.f10734O = 3;
            this.f9949I.f10733N = 3;
        }
    }
}
