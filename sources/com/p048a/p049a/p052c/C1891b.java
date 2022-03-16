package com.p048a.p049a.p052c;

import android.support.p010v4.p023h.p024a.C0538a;
import android.support.p010v4.p025i.C0755t;
import java.io.OutputStream;

/* renamed from: com.a.a.c.b */
class C1891b {

    /* renamed from: a */
    static final int f6516a = 12;

    /* renamed from: b */
    static final int f6517b = 5003;

    /* renamed from: t */
    private static final int f6518t = -1;

    /* renamed from: c */
    int f6519c;

    /* renamed from: d */
    int f6520d = 12;

    /* renamed from: e */
    int f6521e;

    /* renamed from: f */
    int f6522f = 4096;

    /* renamed from: g */
    int[] f6523g = new int[f6517b];

    /* renamed from: h */
    int[] f6524h = new int[f6517b];

    /* renamed from: i */
    int f6525i = f6517b;

    /* renamed from: j */
    int f6526j = 0;

    /* renamed from: k */
    boolean f6527k = false;

    /* renamed from: l */
    int f6528l;

    /* renamed from: m */
    int f6529m;

    /* renamed from: n */
    int f6530n;

    /* renamed from: o */
    int f6531o = 0;

    /* renamed from: p */
    int f6532p = 0;

    /* renamed from: q */
    int[] f6533q = {0, 1, 3, 7, 15, 31, 63, C0755t.f2803j, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, C0538a.f2111a};

    /* renamed from: r */
    int f6534r;

    /* renamed from: s */
    byte[] f6535s = new byte[256];

    /* renamed from: u */
    private int f6536u;

    /* renamed from: v */
    private int f6537v;

    /* renamed from: w */
    private byte[] f6538w;

    /* renamed from: x */
    private int f6539x;

    /* renamed from: y */
    private int f6540y;

    /* renamed from: z */
    private int f6541z;

    C1891b(int i, int i2, byte[] bArr, int i3) {
        this.f6536u = i;
        this.f6537v = i2;
        this.f6538w = bArr;
        this.f6539x = Math.max(2, i3);
    }

    /* renamed from: a */
    private int m11485a() {
        if (this.f6540y == 0) {
            return -1;
        }
        this.f6540y--;
        byte[] bArr = this.f6538w;
        int i = this.f6541z;
        this.f6541z = i + 1;
        return bArr[i] & 255;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7691a(byte b, OutputStream outputStream) {
        byte[] bArr = this.f6535s;
        int i = this.f6534r;
        this.f6534r = i + 1;
        bArr[i] = b;
        if (this.f6534r >= 254) {
            mo7698c(outputStream);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7692a(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            this.f6523g[i2] = -1;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7693a(int i, OutputStream outputStream) {
        int i2 = 0;
        this.f6528l = i;
        this.f6527k = false;
        this.f6519c = this.f6528l;
        this.f6521e = mo7695b(this.f6519c);
        this.f6529m = 1 << (i - 1);
        this.f6530n = this.f6529m + 1;
        this.f6526j = this.f6529m + 2;
        this.f6534r = 0;
        int a = m11485a();
        for (int i3 = this.f6525i; i3 < 65536; i3 *= 2) {
            i2++;
        }
        int i4 = 8 - i2;
        int i5 = this.f6525i;
        mo7692a(i5);
        mo7696b(this.f6529m, outputStream);
        while (true) {
            int a2 = m11485a();
            if (a2 != -1) {
                int i6 = (a2 << this.f6520d) + a;
                int i7 = (a2 << i4) ^ a;
                if (this.f6523g[i7] == i6) {
                    a = this.f6524h[i7];
                } else if (this.f6523g[i7] >= 0) {
                    int i8 = i5 - i7;
                    if (i7 == 0) {
                        i8 = 1;
                    }
                    while (true) {
                        i7 -= i8;
                        if (i7 < 0) {
                            i7 += i5;
                        }
                        if (this.f6523g[i7] != i6) {
                            if (this.f6523g[i7] < 0) {
                                break;
                            }
                        } else {
                            a = this.f6524h[i7];
                            break;
                        }
                    }
                } else {
                    mo7696b(a, outputStream);
                    if (this.f6526j < this.f6522f) {
                        int[] iArr = this.f6524h;
                        int i9 = this.f6526j;
                        this.f6526j = i9 + 1;
                        iArr[i7] = i9;
                        this.f6523g[i7] = i6;
                        a = a2;
                    } else {
                        mo7694a(outputStream);
                        a = a2;
                    }
                }
            } else {
                mo7696b(a, outputStream);
                mo7696b(this.f6530n, outputStream);
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7694a(OutputStream outputStream) {
        mo7692a(this.f6525i);
        this.f6526j = this.f6529m + 2;
        this.f6527k = true;
        mo7696b(this.f6529m, outputStream);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo7695b(int i) {
        return (1 << i) - 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo7696b(int i, OutputStream outputStream) {
        this.f6531o &= this.f6533q[this.f6532p];
        if (this.f6532p > 0) {
            this.f6531o |= i << this.f6532p;
        } else {
            this.f6531o = i;
        }
        this.f6532p += this.f6519c;
        while (this.f6532p >= 8) {
            mo7691a((byte) (this.f6531o & 255), outputStream);
            this.f6531o >>= 8;
            this.f6532p -= 8;
        }
        if (this.f6526j > this.f6521e || this.f6527k) {
            if (this.f6527k) {
                int i2 = this.f6528l;
                this.f6519c = i2;
                this.f6521e = mo7695b(i2);
                this.f6527k = false;
            } else {
                this.f6519c++;
                if (this.f6519c == this.f6520d) {
                    this.f6521e = this.f6522f;
                } else {
                    this.f6521e = mo7695b(this.f6519c);
                }
            }
        }
        if (i == this.f6530n) {
            while (this.f6532p > 0) {
                mo7691a((byte) (this.f6531o & 255), outputStream);
                this.f6531o >>= 8;
                this.f6532p -= 8;
            }
            mo7698c(outputStream);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo7697b(OutputStream outputStream) {
        outputStream.write(this.f6539x);
        this.f6540y = this.f6536u * this.f6537v;
        this.f6541z = 0;
        mo7693a(this.f6539x + 1, outputStream);
        outputStream.write(0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo7698c(OutputStream outputStream) {
        if (this.f6534r > 0) {
            outputStream.write(this.f6534r);
            outputStream.write(this.f6535s, 0, this.f6534r);
            this.f6534r = 0;
        }
    }
}
