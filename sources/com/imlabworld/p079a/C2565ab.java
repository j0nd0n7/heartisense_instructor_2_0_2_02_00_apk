package com.imlabworld.p079a;

/* renamed from: com.imlabworld.a.ab */
class C2565ab extends C2569ae {
    C2565ab() {
    }

    /* renamed from: a */
    private void mo10032a() {
        switch (this.f9960x.f10117d) {
            case 1:
                if (this.f9960x.f10118e != 1) {
                    this.f9947G = 12.0d;
                    this.f9942B = 58;
                    switch (this.f9960x.f10116c) {
                        case 1:
                        case 2:
                        case 3:
                        case 7:
                            this.f9943C = 84;
                            break;
                        case 4:
                        case 5:
                        case 6:
                        case 8:
                            this.f9943C = 100;
                            break;
                        case 9:
                            this.f9943C = 84;
                            this.f9942B = 45;
                            break;
                        case 10:
                            this.f9943C = 100;
                            this.f9942B = 45;
                            break;
                    }
                } else {
                    this.f9947G = 13.0d;
                    this.f9942B = 58;
                    switch (this.f9960x.f10116c) {
                        case 1:
                        case 2:
                        case 3:
                        case 7:
                            this.f9943C = 84;
                            break;
                        case 4:
                        case 5:
                        case 6:
                        case 8:
                            this.f9943C = 100;
                            break;
                        case 9:
                            this.f9943C = 84;
                            this.f9942B = 45;
                            break;
                        case 10:
                            this.f9943C = 100;
                            this.f9942B = 45;
                            break;
                    }
                }
            case 2:
                this.f9947G = 13.0d;
                this.f9942B = 45;
                this.f9943C = 65;
                break;
        }
        this.f9944D = ((13.0d / this.f9947G) * 11.5d) / 13.0d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public double mo9794a(double d) {
        return (this.f9960x.f10117d != 2 ? d < 58.0d ? (d * 5.0d) / 58.0d : d <= 84.0d ? (((d - 58.0d) * 1.0d) / 26.0d) + 5.0d : (6.0d * d) / 84.0d : d < 45.0d ? (d * 4.0d) / 45.0d : d <= 65.0d ? (((d - 45.0d) * 1.0d) / 20.0d) + 4.0d : (d * 5.0d) / 65.0d) * 10.0d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo9795a(int i, int i2, int i3) {
        return i > i3 ? i3 : i < i2 ? 0 : i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo9796a(int i, int i2, int i3, double d) {
        return (int) ((((double) (i - i2)) / ((double) (i3 - i2))) * 100.0d * d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9797a(int i, int i2, double[] dArr, int i3) {
        if (this.f9949I.f10745g) {
            return;
        }
        if ((i2 > 10 && dArr[2] > 1.0d) || (i < 240 && dArr[2] > 1.0d)) {
            C2619w wVar = this.f9949I;
            C2619w wVar2 = this.f9949I;
            long j = this.f9948H;
            wVar2.f10752n = j;
            wVar.f10751m = j;
            this.f9949I.f10745g = true;
            this.f9961y = C2594bb.COMPRESSION;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo9798a(byte[] bArr) {
        if ((bArr[0] == -1 || bArr[0] == 0) && ((bArr[1] == -1 || bArr[1] == 0 || bArr[1] == 3) && bArr[2] == 0)) {
            this.f9952L++;
            if (this.f9952L > 20) {
                return false;
            }
        } else {
            this.f9952L = 0;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public double mo9799b(double d) {
        return this.f9960x.f10117d != 2 ? d < 35.0d ? (d * 400.0d) / 35.0d : d <= 70.0d ? (((d - 35.0d) * 300.0d) / 35.0d) + 400.0d : (700.0d * d) / 70.0d : d < 35.0d ? (d * 140.0d) / 35.0d : d <= 70.0d ? (((d - 35.0d) * 210.0d) / 35.0d) + 140.0d : (350.0d * d) / 70.0d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo9800d(int i) {
        if (i == 0) {
            this.f9953M++;
            if (this.f9953M > 20) {
                return false;
            }
        } else {
            this.f9953M = 0;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo9801f() {
        switch (this.f9960x.f10114a) {
            case BREATH_FINITE:
            case BREATH_INFINITE:
                this.f9961y = C2594bb.BREATH_IDLE;
                this.f9960x.f10115b = 1;
                break;
            case COMPRESSION_FINITE:
            case COMPRESSION_INFINITE:
                this.f9961y = C2594bb.COMPRESSION_IDLE;
                this.f9960x.f10115b = 1;
                break;
            case ALL_FINITE:
            case ALL_INFINITE:
                this.f9961y = C2594bb.IDLE;
                break;
            case ADJUST_ZERO:
                this.f9961y = C2594bb.ADJUSTING_ZERO;
                break;
            case CALIBRATION:
                this.f9961y = C2594bb.CALIBRATION_BREATH;
                break;
        }
        mo10032a();
    }
}
