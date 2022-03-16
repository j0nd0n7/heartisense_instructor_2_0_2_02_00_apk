package com.p048a.p049a.p052c;

import android.support.p036v7.widget.ActivityChooserView;

/* renamed from: com.a.a.c.c */
class C1892c {

    /* renamed from: A */
    protected static final int f6542A = 18;

    /* renamed from: B */
    protected static final int f6543B = 262144;

    /* renamed from: a */
    protected static final int f6544a = 256;

    /* renamed from: b */
    protected static final int f6545b = 499;

    /* renamed from: c */
    protected static final int f6546c = 491;

    /* renamed from: d */
    protected static final int f6547d = 487;

    /* renamed from: e */
    protected static final int f6548e = 503;

    /* renamed from: f */
    protected static final int f6549f = 1509;

    /* renamed from: g */
    protected static final int f6550g = 255;

    /* renamed from: h */
    protected static final int f6551h = 4;

    /* renamed from: i */
    protected static final int f6552i = 100;

    /* renamed from: j */
    protected static final int f6553j = 16;

    /* renamed from: k */
    protected static final int f6554k = 65536;

    /* renamed from: l */
    protected static final int f6555l = 10;

    /* renamed from: m */
    protected static final int f6556m = 1024;

    /* renamed from: n */
    protected static final int f6557n = 10;

    /* renamed from: o */
    protected static final int f6558o = 64;

    /* renamed from: p */
    protected static final int f6559p = 65536;

    /* renamed from: q */
    protected static final int f6560q = 32;

    /* renamed from: r */
    protected static final int f6561r = 6;

    /* renamed from: s */
    protected static final int f6562s = 64;

    /* renamed from: t */
    protected static final int f6563t = 2048;

    /* renamed from: u */
    protected static final int f6564u = 30;

    /* renamed from: v */
    protected static final int f6565v = 10;

    /* renamed from: w */
    protected static final int f6566w = 1024;

    /* renamed from: y */
    protected static final int f6567y = 8;

    /* renamed from: z */
    protected static final int f6568z = 256;

    /* renamed from: C */
    protected byte[] f6569C;

    /* renamed from: D */
    protected int f6570D;

    /* renamed from: E */
    protected int f6571E;

    /* renamed from: F */
    protected int[][] f6572F;

    /* renamed from: G */
    protected int[] f6573G = new int[256];

    /* renamed from: H */
    protected int[] f6574H = new int[256];

    /* renamed from: I */
    protected int[] f6575I = new int[256];

    /* renamed from: J */
    protected int[] f6576J = new int[32];

    /* renamed from: x */
    protected int f6577x;

    public C1892c(byte[] bArr, int i, int i2) {
        this.f6569C = bArr;
        this.f6570D = i;
        this.f6571E = i2;
        this.f6572F = new int[256][];
        for (int i3 = 0; i3 < 256; i3++) {
            this.f6572F[i3] = new int[4];
            int[] iArr = this.f6572F[i3];
            int i4 = (i3 << 12) / 256;
            iArr[2] = i4;
            iArr[1] = i4;
            iArr[0] = i4;
            this.f6575I[i3] = 256;
            this.f6574H[i3] = 0;
        }
    }

    /* renamed from: a */
    public int mo7699a(int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7 = this.f6573G[i2];
        int i8 = -1;
        int i9 = 1000;
        int i10 = i7 - 1;
        int i11 = i7;
        while (true) {
            if (i11 >= 256 && i10 < 0) {
                return i8;
            }
            if (i11 < 256) {
                int[] iArr = this.f6572F[i11];
                int i12 = iArr[1] - i2;
                if (i12 >= i9) {
                    i5 = i9;
                    i4 = 256;
                    i6 = i8;
                } else {
                    i4 = i11 + 1;
                    if (i12 < 0) {
                        i12 = -i12;
                    }
                    int i13 = iArr[0] - i;
                    if (i13 < 0) {
                        i13 = -i13;
                    }
                    int i14 = i13 + i12;
                    if (i14 < i9) {
                        int i15 = iArr[2] - i3;
                        if (i15 < 0) {
                            i15 = -i15;
                        }
                        i5 = i14 + i15;
                        if (i5 < i9) {
                            i6 = iArr[3];
                        }
                    }
                    i5 = i9;
                    i6 = i8;
                }
            } else {
                i4 = i11;
                i5 = i9;
                i6 = i8;
            }
            if (i10 >= 0) {
                int[] iArr2 = this.f6572F[i10];
                int i16 = i2 - iArr2[1];
                if (i16 >= i5) {
                    i8 = i6;
                    i10 = -1;
                    i9 = i5;
                    i11 = i4;
                } else {
                    i10--;
                    if (i16 < 0) {
                        i16 = -i16;
                    }
                    int i17 = iArr2[0] - i;
                    if (i17 < 0) {
                        i17 = -i17;
                    }
                    int i18 = i17 + i16;
                    if (i18 < i5) {
                        int i19 = iArr2[2] - i3;
                        if (i19 < 0) {
                            i19 = -i19;
                        }
                        int i20 = i19 + i18;
                        if (i20 < i5) {
                            i8 = iArr2[3];
                            i11 = i4;
                            i9 = i20;
                        }
                    }
                }
            }
            i8 = i6;
            i9 = i5;
            i11 = i4;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7700a(int i, int i2, int i3, int i4, int i5) {
        int i6;
        int i7 = i2 - i;
        int i8 = i7 < -1 ? -1 : i7;
        int i9 = i2 + i;
        if (i9 > 256) {
            i9 = 256;
        }
        int i10 = 1;
        int i11 = i2 - 1;
        int i12 = i2 + 1;
        while (true) {
            if (i12 < i9 || i11 > i8) {
                int i13 = i10 + 1;
                int i14 = this.f6576J[i10];
                if (i12 < i9) {
                    i6 = i12 + 1;
                    int[] iArr = this.f6572F[i12];
                    try {
                        iArr[0] = iArr[0] - (((iArr[0] - i3) * i14) / 262144);
                        iArr[1] = iArr[1] - (((iArr[1] - i4) * i14) / 262144);
                        iArr[2] = iArr[2] - (((iArr[2] - i5) * i14) / 262144);
                    } catch (Exception e) {
                    }
                } else {
                    i6 = i12;
                }
                if (i11 > i8) {
                    int i15 = i11 - 1;
                    int[] iArr2 = this.f6572F[i11];
                    try {
                        iArr2[0] = iArr2[0] - (((iArr2[0] - i3) * i14) / 262144);
                        iArr2[1] = iArr2[1] - (((iArr2[1] - i4) * i14) / 262144);
                        iArr2[2] = iArr2[2] - ((i14 * (iArr2[2] - i5)) / 262144);
                        i11 = i15;
                        i12 = i6;
                        i10 = i13;
                    } catch (Exception e2) {
                        i11 = i15;
                        i12 = i6;
                        i10 = i13;
                    }
                } else {
                    i12 = i6;
                    i10 = i13;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public byte[] mo7701a() {
        byte[] bArr = new byte[768];
        int[] iArr = new int[256];
        for (int i = 0; i < 256; i++) {
            iArr[this.f6572F[i][3]] = i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 256; i3++) {
            int i4 = iArr[i3];
            int i5 = i2 + 1;
            bArr[i2] = (byte) this.f6572F[i4][0];
            int i6 = i5 + 1;
            bArr[i5] = (byte) this.f6572F[i4][1];
            i2 = i6 + 1;
            bArr[i6] = (byte) this.f6572F[i4][2];
        }
        return bArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo7702b(int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7 = ActivityChooserView.C1593a.f5166a;
        int i8 = -1;
        int i9 = Integer.MAX_VALUE;
        int i10 = -1;
        int i11 = 0;
        while (i11 < 256) {
            int[] iArr = this.f6572F[i11];
            int i12 = iArr[0] - i;
            if (i12 < 0) {
                i12 = -i12;
            }
            int i13 = iArr[1] - i2;
            if (i13 < 0) {
                i13 = -i13;
            }
            int i14 = i13 + i12;
            int i15 = iArr[2] - i3;
            if (i15 < 0) {
                i15 = -i15;
            }
            int i16 = i14 + i15;
            if (i16 < i9) {
                i4 = i16;
                i5 = i11;
            } else {
                i4 = i9;
                i5 = i10;
            }
            int i17 = i16 - (this.f6574H[i11] >> 12);
            if (i17 < i7) {
                i6 = i11;
            } else {
                i17 = i7;
                i6 = i8;
            }
            int i18 = this.f6575I[i11] >> 10;
            int[] iArr2 = this.f6575I;
            iArr2[i11] = iArr2[i11] - i18;
            int[] iArr3 = this.f6574H;
            iArr3[i11] = (i18 << 10) + iArr3[i11];
            i11++;
            i7 = i17;
            i8 = i6;
            i10 = i5;
            i9 = i4;
        }
        int[] iArr4 = this.f6575I;
        iArr4[i10] = iArr4[i10] + 64;
        int[] iArr5 = this.f6574H;
        iArr5[i10] = iArr5[i10] - 65536;
        return i8;
    }

    /* renamed from: b */
    public void mo7703b() {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i5 < 256) {
            int[] iArr = this.f6572F[i5];
            int i6 = iArr[1];
            int i7 = i5;
            for (int i8 = i5 + 1; i8 < 256; i8++) {
                int[] iArr2 = this.f6572F[i8];
                if (iArr2[1] < i6) {
                    i6 = iArr2[1];
                    i7 = i8;
                }
            }
            int[] iArr3 = this.f6572F[i7];
            if (i5 != i7) {
                int i9 = iArr3[0];
                iArr3[0] = iArr[0];
                iArr[0] = i9;
                int i10 = iArr3[1];
                iArr3[1] = iArr[1];
                iArr[1] = i10;
                int i11 = iArr3[2];
                iArr3[2] = iArr[2];
                iArr[2] = i11;
                int i12 = iArr3[3];
                iArr3[3] = iArr[3];
                iArr[3] = i12;
            }
            if (i6 != i4) {
                this.f6573G[i4] = (i3 + i5) >> 1;
                for (int i13 = i4 + 1; i13 < i6; i13++) {
                    this.f6573G[i13] = i5;
                }
                i2 = i6;
                i = i5;
            } else {
                i = i3;
                i2 = i4;
            }
            i5++;
            i3 = i;
            i4 = i2;
        }
        this.f6573G[i4] = (i3 + 255) >> 1;
        for (int i14 = i4 + 1; i14 < 256; i14++) {
            this.f6573G[i14] = 255;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7704b(int i, int i2, int i3, int i4, int i5) {
        int[] iArr = this.f6572F[i2];
        iArr[0] = iArr[0] - (((iArr[0] - i3) * i) / 1024);
        iArr[1] = iArr[1] - (((iArr[1] - i4) * i) / 1024);
        iArr[2] = iArr[2] - (((iArr[2] - i5) * i) / 1024);
    }

    /* renamed from: c */
    public void mo7705c() {
        if (this.f6570D < f6549f) {
            this.f6571E = 1;
        }
        this.f6577x = ((this.f6571E - 1) / 3) + 30;
        byte[] bArr = this.f6569C;
        int i = this.f6570D;
        int i2 = this.f6570D / (this.f6571E * 3);
        int i3 = i2 / 100;
        for (int i4 = 0; i4 < 32; i4++) {
            this.f6576J[i4] = (((1024 - (i4 * i4)) * 256) / 1024) * 1024;
        }
        int i5 = this.f6570D < f6549f ? 3 : this.f6570D % f6545b != 0 ? 1497 : this.f6570D % f6546c != 0 ? 1473 : this.f6570D % f6547d != 0 ? 1461 : f6549f;
        int i6 = 0;
        int i7 = 32;
        int i8 = 2048;
        int i9 = 0;
        int i10 = 1024;
        while (i9 < i2) {
            int i11 = (bArr[i6 + 0] & 255) << 4;
            int i12 = (bArr[i6 + 1] & 255) << 4;
            int i13 = (bArr[i6 + 2] & 255) << 4;
            int b = mo7702b(i11, i12, i13);
            mo7704b(i10, b, i11, i12, i13);
            if (i7 != 0) {
                mo7700a(i7, b, i11, i12, i13);
            }
            int i14 = i6 + i5;
            int i15 = i14 >= i ? i14 - this.f6570D : i14;
            int i16 = i9 + 1;
            int i17 = i3 == 0 ? 1 : i3;
            if (i16 % i17 == 0) {
                int i18 = i10 - (i10 / this.f6577x);
                int i19 = i8 - (i8 / 30);
                int i20 = i19 >> 6;
                if (i20 <= 1) {
                    i20 = 0;
                }
                for (int i21 = 0; i21 < i20; i21++) {
                    this.f6576J[i21] = ((((i20 * i20) - (i21 * i21)) * 256) / (i20 * i20)) * i18;
                }
                i6 = i15;
                i3 = i17;
                i7 = i20;
                i8 = i19;
                i9 = i16;
                i10 = i18;
            } else {
                i6 = i15;
                i3 = i17;
                i9 = i16;
            }
        }
    }

    /* renamed from: d */
    public byte[] mo7706d() {
        mo7705c();
        mo7707e();
        mo7703b();
        return mo7701a();
    }

    /* renamed from: e */
    public void mo7707e() {
        for (int i = 0; i < 256; i++) {
            int[] iArr = this.f6572F[i];
            iArr[0] = iArr[0] >> 4;
            int[] iArr2 = this.f6572F[i];
            iArr2[1] = iArr2[1] >> 4;
            int[] iArr3 = this.f6572F[i];
            iArr3[2] = iArr3[2] >> 4;
            this.f6572F[i][3] = i;
        }
    }
}
