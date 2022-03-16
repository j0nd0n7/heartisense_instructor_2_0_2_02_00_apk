package com.imlabworld.p079a;

import java.lang.reflect.Array;

/* renamed from: com.imlabworld.a.aa */
class C2564aa extends C2565ab {
    C2564aa() {
    }

    /* renamed from: a */
    private double m14315a(double d, double d2, double d3) {
        return Math.sqrt(Math.pow(d, 2.0d) + Math.pow(d2, 2.0d) + Math.pow(d3, 2.0d));
    }

    /* renamed from: a */
    private void mo10032a() {
        double d;
        double d2;
        double[] dArr = new double[100];
        double[] dArr2 = new double[100];
        double d3 = 0.0d;
        double d4 = 0.0d;
        int i = 1;
        while (true) {
            d = d4;
            d2 = d3;
            if (i >= 15) {
                break;
            }
            dArr[i - 1] = C2609q.m14473a(m14315a((Math.abs(this.f9951K.f10770f[0][i][0] - this.f9951K.f10770f[1][i][0]) + Math.abs(this.f9951K.f10770f[0][i][0] - this.f9951K.f10770f[1][i - 1][0])) / 2.0d, (Math.abs(this.f9951K.f10770f[0][i][1] - this.f9951K.f10770f[1][i][1]) + Math.abs(this.f9951K.f10770f[0][i][1] - this.f9951K.f10770f[1][i - 1][1])) / 2.0d, (Math.abs(this.f9951K.f10770f[0][i][2] - this.f9951K.f10770f[1][i][2]) + Math.abs(this.f9951K.f10770f[0][i][2] - this.f9951K.f10770f[1][i - 1][2])) / 2.0d), (int) this.f9951K.f10779o[i]);
            dArr2[i - 1] = (double) ((Math.abs(this.f9951K.f10775k[0][i] - this.f9951K.f10775k[1][i]) + Math.abs(this.f9951K.f10775k[0][i] - this.f9951K.f10775k[1][i - 1])) / 2);
            d3 = d2 + (dArr[i - 1] * dArr[i - 1]);
            d4 = (dArr[i - 1] * dArr2[i - 1]) + d;
            i++;
        }
        this.f9951K.f10777m = (int) (((100.0d * d) / d2) / 13.0d);
        if (this.f9951K.f10777m < 20) {
            this.f9951K.f10777m = 20;
        }
        if (this.f9951K.f10777m > 3220) {
            this.f9951K.f10777m = 3220;
        }
    }

    /* renamed from: a */
    private void mo10037a(int i) {
        int i2 = this.f9962z + ((this.f9941A - this.f9962z) / 20);
        if (this.f9951K.f10772h) {
            if ((this.f9951K.f10773i > i2 || i > i2) && i < this.f9951K.f10773i) {
                this.f9951K.f10772h = false;
                this.f9951K.f10773i = this.f9962z;
            } else if (i > this.f9951K.f10773i) {
                this.f9951K.f10773i = i;
                if (this.f9951K.f10776l < 15) {
                    this.f9951K.f10775k[0][this.f9951K.f10776l] = i;
                }
            }
        } else if (i - 100 > this.f9951K.f10774j || i <= i2) {
            this.f9951K.f10772h = true;
            if (i < this.f9951K.f10774j) {
                this.f9951K.f10774j = i;
                this.f9951K.f10775k[1][this.f9951K.f10776l] = i;
            }
            this.f9951K.f10779o[this.f9951K.f10776l] = (double) ((int) (60.0d / (((double) (this.f9948H - this.f9951K.f10778n)) / 1000.0d)));
            this.f9951K.f10778n = this.f9948H;
            this.f9951K.f10774j = this.f9941A;
            this.f9951K.f10776l++;
            if (this.f9951K.f10776l == 15) {
                mo10032a();
                this.f9961y = C2594bb.CALIBRATION_BREATH;
            }
        } else if (i < this.f9951K.f10774j) {
            this.f9951K.f10774j = i;
            this.f9951K.f10775k[1][this.f9951K.f10776l] = i;
        }
    }

    /* renamed from: a */
    private void m14318a(double[][] dArr) {
        for (int i = 0; i < 2; i++) {
            if (this.f9951K.f10765a) {
                if (dArr[i][2] + 0.5d < this.f9951K.f10768d) {
                    this.f9951K.f10765a = false;
                } else if (dArr[i][2] > this.f9951K.f10768d) {
                    this.f9951K.f10768d = dArr[i][2];
                    this.f9951K.f10770f[0][this.f9951K.f10771g][0] = dArr[i][0];
                    this.f9951K.f10770f[0][this.f9951K.f10771g][1] = dArr[i][1];
                    this.f9951K.f10770f[0][this.f9951K.f10771g][2] = dArr[i][2];
                }
            } else if (dArr[i][2] - 0.5d > this.f9951K.f10769e) {
                this.f9951K.f10765a = true;
                this.f9951K.f10769e = 100.0d;
                this.f9951K.f10768d = -100.0d;
                this.f9951K.f10771g++;
            } else if (dArr[i][2] < this.f9951K.f10769e) {
                this.f9951K.f10769e = dArr[i][2];
                this.f9951K.f10770f[1][this.f9951K.f10771g][0] = dArr[i][0];
                this.f9951K.f10770f[1][this.f9951K.f10771g][1] = dArr[i][1];
                this.f9951K.f10770f[1][this.f9951K.f10771g][2] = dArr[i][2];
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9792a(int i, double[] dArr, double[] dArr2) {
        double[][] dArr3 = (double[][]) Array.newInstance(Double.TYPE, new int[]{2, 3});
        if (this.f9951K.f10765a) {
            if (this.f9951K.f10767c <= dArr[2]) {
                for (int i2 = 0; i2 < 3; i2++) {
                    dArr3[0][i2] = dArr[i2];
                    dArr3[1][i2] = dArr2[i2];
                }
            } else {
                for (int i3 = 0; i3 < 3; i3++) {
                    dArr3[0][i3] = dArr2[i3];
                    dArr3[1][i3] = dArr[i3];
                }
            }
            C2620x xVar = this.f9951K;
            C2620x xVar2 = this.f9951K;
            double d = dArr2[2];
            xVar2.f10766b = d;
            xVar.f10767c = d;
        } else {
            if (this.f9951K.f10766b >= dArr2[2]) {
                for (int i4 = 0; i4 < 3; i4++) {
                    dArr3[0][i4] = dArr2[i4];
                    dArr3[1][i4] = dArr[i4];
                }
            } else {
                for (int i5 = 0; i5 < 3; i5++) {
                    dArr3[0][i5] = dArr[i5];
                    dArr3[1][i5] = dArr2[i5];
                }
            }
            C2620x xVar3 = this.f9951K;
            C2620x xVar4 = this.f9951K;
            double d2 = dArr[2];
            xVar4.f10766b = d2;
            xVar3.f10767c = d2;
        }
        m14318a(dArr3);
        mo10037a(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo9793c(int i) {
        int i2 = ((this.f9951K.f10781q - this.f9945E) / 2) + this.f9945E;
        if (this.f9951K.f10780p) {
            if ((this.f9951K.f10785u != 0 || i > this.f9945E + 10) && ((this.f9951K.f10785u <= 0 || i > i2) && i + 10 < this.f9951K.f10782r)) {
                this.f9951K.f10780p = false;
                this.f9951K.f10784t += this.f9951K.f10782r;
                this.f9951K.f10781q = this.f9951K.f10782r;
                this.f9951K.f10782r = this.f9945E - 100;
                this.f9951K.f10785u++;
            } else if (i >= this.f9951K.f10782r) {
                this.f9951K.f10782r = i;
            }
        } else if (i <= i2) {
            this.f9951K.f10780p = true;
            this.f9951K.f10783s = this.f9946F + 100;
            if (this.f9951K.f10785u == 5) {
                this.f9951K.f10786v = (((this.f9951K.f10784t / 5) - this.f9945E) * 100) / 52;
                if (this.f9951K.f10786v < 50) {
                    this.f9951K.f10786v = 50;
                }
                if (this.f9951K.f10786v > 1050) {
                    this.f9951K.f10786v = 1050;
                }
                this.f9961y = C2594bb.CALIBRATION_NORMAL;
            }
        }
    }
}
