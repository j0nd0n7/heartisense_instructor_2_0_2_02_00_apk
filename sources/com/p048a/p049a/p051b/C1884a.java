package com.p048a.p049a.p051b;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Build;
import android.support.p010v4.p013c.C0226aq;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: com.a.a.b.a */
public class C1884a {

    /* renamed from: a */
    public static final int f6428a = 0;

    /* renamed from: b */
    public static final int f6429b = 1;

    /* renamed from: c */
    public static final int f6430c = 2;

    /* renamed from: d */
    public static final int f6431d = 3;

    /* renamed from: e */
    private static final String f6432e = C1884a.class.getSimpleName();

    /* renamed from: f */
    private static final int f6433f = 4096;

    /* renamed from: g */
    private static final int f6434g = 0;

    /* renamed from: h */
    private static final int f6435h = 1;

    /* renamed from: i */
    private static final int f6436i = 2;

    /* renamed from: j */
    private static final int f6437j = 3;

    /* renamed from: k */
    private static final int f6438k = -1;

    /* renamed from: l */
    private static final int f6439l = -1;

    /* renamed from: m */
    private static final Bitmap.Config f6440m = Bitmap.Config.ARGB_8888;

    /* renamed from: A */
    private Bitmap f6441A;

    /* renamed from: B */
    private boolean f6442B;

    /* renamed from: C */
    private int f6443C;

    /* renamed from: n */
    private int[] f6444n;

    /* renamed from: o */
    private ByteBuffer f6445o;

    /* renamed from: p */
    private final byte[] f6446p = new byte[256];

    /* renamed from: q */
    private C1888d f6447q;

    /* renamed from: r */
    private short[] f6448r;

    /* renamed from: s */
    private byte[] f6449s;

    /* renamed from: t */
    private byte[] f6450t;

    /* renamed from: u */
    private byte[] f6451u;

    /* renamed from: v */
    private int[] f6452v;

    /* renamed from: w */
    private int f6453w;

    /* renamed from: x */
    private byte[] f6454x;

    /* renamed from: y */
    private C1887c f6455y;

    /* renamed from: z */
    private C1885a f6456z;

    /* renamed from: com.a.a.b.a$a */
    public interface C1885a {
        /* renamed from: a */
        Bitmap mo7668a(int i, int i2, Bitmap.Config config);

        /* renamed from: a */
        void mo7669a(Bitmap bitmap);
    }

    public C1884a(C1885a aVar) {
        this.f6456z = aVar;
        this.f6455y = new C1887c();
    }

    /* renamed from: a */
    private Bitmap m11413a(C1886b bVar, C1886b bVar2) {
        int i;
        int i2 = this.f6455y.f6473f;
        int i3 = this.f6455y.f6474g;
        int[] iArr = this.f6452v;
        if (bVar2 != null && bVar2.f6463g > 0) {
            if (bVar2.f6463g == 2) {
                int i4 = 0;
                if (!bVar.f6462f) {
                    i4 = this.f6455y.f6479l;
                }
                Arrays.fill(iArr, i4);
            } else if (bVar2.f6463g == 3 && this.f6441A != null) {
                this.f6441A.getPixels(iArr, 0, i2, 0, 0, i2, i3);
            }
        }
        m11415a(bVar);
        int i5 = 1;
        int i6 = 8;
        int i7 = 0;
        for (int i8 = 0; i8 < bVar.f6460d; i8++) {
            if (bVar.f6461e) {
                if (i7 >= bVar.f6460d) {
                    i5++;
                    switch (i5) {
                        case 2:
                            i7 = 4;
                            break;
                        case 3:
                            i7 = 2;
                            i6 = 4;
                            break;
                        case 4:
                            i7 = 1;
                            i6 = 2;
                            break;
                    }
                }
                int i9 = i7;
                i7 += i6;
                i = i9;
            } else {
                i = i8;
            }
            int i10 = i + bVar.f6458b;
            if (i10 < this.f6455y.f6474g) {
                int i11 = this.f6455y.f6473f * i10;
                int i12 = i11 + bVar.f6457a;
                int i13 = bVar.f6459c + i12;
                if (this.f6455y.f6473f + i11 < i13) {
                    i13 = this.f6455y.f6473f + i11;
                }
                int i14 = bVar.f6459c * i8;
                int i15 = i12;
                while (i15 < i13) {
                    int i16 = i14 + 1;
                    int i17 = this.f6444n[this.f6451u[i14] & 255];
                    if (i17 != 0) {
                        iArr[i15] = i17;
                    }
                    i15++;
                    i14 = i16;
                }
            }
        }
        if (this.f6442B && (bVar.f6463g == 0 || bVar.f6463g == 1)) {
            if (this.f6441A == null) {
                this.f6441A = m11419p();
            }
            this.f6441A.setPixels(iArr, 0, i2, 0, 0, i2, i3);
        }
        Bitmap p = m11419p();
        p.setPixels(iArr, 0, i2, 0, 0, i2, i3);
        return p;
    }

    @TargetApi(12)
    /* renamed from: a */
    private static void m11414a(Bitmap bitmap) {
        if (Build.VERSION.SDK_INT >= 12) {
            bitmap.setHasAlpha(true);
        }
    }

    /* JADX WARNING: type inference failed for: r8v15, types: [short[]] */
    /* JADX WARNING: type inference failed for: r8v16, types: [short] */
    /* renamed from: a */
    private void m11415a(C1886b bVar) {
        byte b;
        if (bVar != null) {
            this.f6445o.position(bVar.f6466j);
        }
        int i = bVar == null ? this.f6455y.f6473f * this.f6455y.f6474g : bVar.f6459c * bVar.f6460d;
        if (this.f6451u == null || this.f6451u.length < i) {
            this.f6451u = new byte[i];
        }
        if (this.f6448r == null) {
            this.f6448r = new short[4096];
        }
        if (this.f6449s == null) {
            this.f6449s = new byte[4096];
        }
        if (this.f6450t == null) {
            this.f6450t = new byte[C0226aq.f1332I];
        }
        int n = m11417n();
        int i2 = 1 << n;
        int i3 = i2 + 1;
        int i4 = i2 + 2;
        byte b2 = -1;
        int i5 = n + 1;
        int i6 = (1 << i5) - 1;
        for (int i7 = 0; i7 < i2; i7++) {
            this.f6448r[i7] = 0;
            this.f6449s[i7] = (byte) i7;
        }
        byte b3 = 0;
        int i8 = 0;
        int i9 = 0;
        byte b4 = 0;
        byte b5 = 0;
        int i10 = i5;
        int i11 = i6;
        int i12 = i4;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            if (i8 < i) {
                if (i14 == 0) {
                    i14 = m11418o();
                    if (i14 <= 0) {
                        this.f6443C = 3;
                        break;
                    }
                    i13 = 0;
                }
                int i16 = b3 + ((this.f6446p[i13] & 255) << b5);
                int i17 = i13 + 1;
                int i18 = i14 - 1;
                int i19 = i10;
                int i20 = i11;
                byte b6 = b4;
                int i21 = b5 + 8;
                byte b7 = i16;
                int i22 = i15;
                int i23 = i12;
                int i24 = i21;
                while (true) {
                    if (i24 < i19) {
                        b4 = b6;
                        i11 = i20;
                        i14 = i18;
                        i10 = i19;
                        i13 = i17;
                        byte b8 = i24;
                        i12 = i23;
                        i15 = i22;
                        b3 = b7;
                        b5 = b8;
                        break;
                    }
                    byte b9 = b7 & i20;
                    int i25 = b7 >> i19;
                    i24 -= i19;
                    if (b9 == i2) {
                        i19 = n + 1;
                        i20 = (1 << i19) - 1;
                        i23 = i2 + 2;
                        b7 = i25;
                        b2 = -1;
                    } else if (b9 > i23) {
                        this.f6443C = 3;
                        b4 = b6;
                        b5 = i24;
                        i10 = i19;
                        i12 = i23;
                        i13 = i17;
                        i15 = i22;
                        b3 = i25;
                        i11 = i20;
                        i14 = i18;
                        break;
                    } else if (b9 == i3) {
                        b4 = b6;
                        b5 = i24;
                        i10 = i19;
                        i12 = i23;
                        i13 = i17;
                        i15 = i22;
                        b3 = i25;
                        i11 = i20;
                        i14 = i18;
                        break;
                    } else if (b2 == -1) {
                        this.f6450t[i9] = this.f6449s[b9];
                        i9++;
                        b6 = b9;
                        b2 = b9;
                        b7 = i25;
                    } else {
                        if (b9 >= i23) {
                            this.f6450t[i9] = (byte) b6;
                            i9++;
                            b = b2;
                        } else {
                            b = b9;
                        }
                        while (b >= i2) {
                            this.f6450t[i9] = this.f6449s[b];
                            b = this.f6448r[b];
                            i9++;
                        }
                        b6 = this.f6449s[b] & 255;
                        int i26 = i9 + 1;
                        this.f6450t[i9] = (byte) b6;
                        if (i23 < 4096) {
                            this.f6448r[i23] = (short) b2;
                            this.f6449s[i23] = (byte) b6;
                            i23++;
                            if ((i23 & i20) == 0 && i23 < 4096) {
                                i19++;
                                i20 += i23;
                            }
                        }
                        int i27 = i8;
                        while (i26 > 0) {
                            int i28 = i26 - 1;
                            this.f6451u[i22] = this.f6450t[i28];
                            i27++;
                            i22++;
                            i26 = i28;
                        }
                        i8 = i27;
                        b2 = b9;
                        i9 = i26;
                        b7 = i25;
                    }
                }
            } else {
                break;
            }
        }
        for (int i29 = i15; i29 < i; i29++) {
            this.f6451u[i29] = 0;
        }
    }

    /* renamed from: m */
    private C1888d m11416m() {
        if (this.f6447q == null) {
            this.f6447q = new C1888d();
        }
        return this.f6447q;
    }

    /* renamed from: n */
    private int m11417n() {
        try {
            return this.f6445o.get() & 255;
        } catch (Exception e) {
            this.f6443C = 1;
            return 0;
        }
    }

    /* renamed from: o */
    private int m11418o() {
        int n = m11417n();
        int i = 0;
        if (n > 0) {
            while (i < n) {
                int i2 = n - i;
                try {
                    this.f6445o.get(this.f6446p, i, i2);
                    i += i2;
                } catch (Exception e) {
                    Log.w(f6432e, "Error Reading Block", e);
                    this.f6443C = 1;
                }
            }
        }
        return i;
    }

    /* renamed from: p */
    private Bitmap m11419p() {
        Bitmap a = this.f6456z.mo7668a(this.f6455y.f6473f, this.f6455y.f6474g, f6440m);
        if (a == null) {
            a = Bitmap.createBitmap(this.f6455y.f6473f, this.f6455y.f6474g, f6440m);
        }
        m11414a(a);
        return a;
    }

    /* renamed from: a */
    public int mo7652a() {
        return this.f6455y.f6473f;
    }

    /* renamed from: a */
    public int mo7653a(int i) {
        if (i < 0 || i >= this.f6455y.f6470c) {
            return -1;
        }
        return this.f6455y.f6472e.get(i).f6465i;
    }

    /* renamed from: a */
    public int mo7654a(InputStream inputStream, int i) {
        int i2 = 16384;
        if (inputStream != null) {
            if (i > 0) {
                i2 = i + 4096;
            }
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i2);
                byte[] bArr = new byte[16384];
                while (true) {
                    int read = inputStream.read(bArr, 0, bArr.length);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
                byteArrayOutputStream.flush();
                mo7655a(byteArrayOutputStream.toByteArray());
            } catch (IOException e) {
                Log.w(f6432e, "Error reading data from stream", e);
            }
        } else {
            this.f6443C = 2;
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e2) {
                Log.w(f6432e, "Error closing stream", e2);
            }
        }
        return this.f6443C;
    }

    /* renamed from: a */
    public int mo7655a(byte[] bArr) {
        this.f6454x = bArr;
        this.f6455y = m11416m().mo7674a(bArr).mo7676b();
        if (bArr != null) {
            this.f6445o = ByteBuffer.wrap(bArr);
            this.f6445o.rewind();
            this.f6445o.order(ByteOrder.LITTLE_ENDIAN);
            this.f6451u = new byte[(this.f6455y.f6473f * this.f6455y.f6474g)];
            this.f6452v = new int[(this.f6455y.f6473f * this.f6455y.f6474g)];
            this.f6442B = false;
            Iterator<C1886b> it = this.f6455y.f6472e.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().f6463g == 3) {
                        this.f6442B = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        return this.f6443C;
    }

    /* renamed from: a */
    public void mo7656a(C1887c cVar, byte[] bArr) {
        this.f6455y = cVar;
        this.f6454x = bArr;
        this.f6443C = 0;
        this.f6453w = -1;
        this.f6445o = ByteBuffer.wrap(bArr);
        this.f6445o.rewind();
        this.f6445o.order(ByteOrder.LITTLE_ENDIAN);
        this.f6442B = false;
        Iterator<C1886b> it = cVar.f6472e.iterator();
        while (true) {
            if (it.hasNext()) {
                if (it.next().f6463g == 3) {
                    this.f6442B = true;
                    break;
                }
            } else {
                break;
            }
        }
        this.f6451u = new byte[(cVar.f6473f * cVar.f6474g)];
        this.f6452v = new int[(cVar.f6473f * cVar.f6474g)];
    }

    /* renamed from: b */
    public int mo7657b() {
        return this.f6455y.f6474g;
    }

    /* renamed from: c */
    public byte[] mo7658c() {
        return this.f6454x;
    }

    /* renamed from: d */
    public int mo7659d() {
        return this.f6443C;
    }

    /* renamed from: e */
    public void mo7660e() {
        this.f6453w = (this.f6453w + 1) % this.f6455y.f6470c;
    }

    /* renamed from: f */
    public int mo7661f() {
        if (this.f6455y.f6470c <= 0 || this.f6453w < 0) {
            return -1;
        }
        return mo7653a(this.f6453w);
    }

    /* renamed from: g */
    public int mo7662g() {
        return this.f6455y.f6470c;
    }

    /* renamed from: h */
    public int mo7663h() {
        return this.f6453w;
    }

    /* renamed from: i */
    public void mo7664i() {
        this.f6453w = -1;
    }

    /* renamed from: j */
    public int mo7665j() {
        return this.f6455y.f6480m;
    }

    /* renamed from: k */
    public synchronized Bitmap mo7666k() {
        Bitmap bitmap;
        int i = 0;
        synchronized (this) {
            if (this.f6455y.f6470c <= 0 || this.f6453w < 0) {
                if (Log.isLoggable(f6432e, 3)) {
                    Log.d(f6432e, "unable to decode frame, frameCount=" + this.f6455y.f6470c + " framePointer=" + this.f6453w);
                }
                this.f6443C = 1;
            }
            if (this.f6443C == 1 || this.f6443C == 2) {
                if (Log.isLoggable(f6432e, 3)) {
                    Log.d(f6432e, "Unable to decode frame, status=" + this.f6443C);
                }
                bitmap = null;
            } else {
                this.f6443C = 0;
                C1886b bVar = this.f6455y.f6472e.get(this.f6453w);
                int i2 = this.f6453w - 1;
                C1886b bVar2 = i2 >= 0 ? this.f6455y.f6472e.get(i2) : null;
                if (bVar.f6467k == null) {
                    this.f6444n = this.f6455y.f6468a;
                } else {
                    this.f6444n = bVar.f6467k;
                    if (this.f6455y.f6477j == bVar.f6464h) {
                        this.f6455y.f6479l = 0;
                    }
                }
                if (bVar.f6462f) {
                    int i3 = this.f6444n[bVar.f6464h];
                    this.f6444n[bVar.f6464h] = 0;
                    i = i3;
                }
                if (this.f6444n == null) {
                    if (Log.isLoggable(f6432e, 3)) {
                        Log.d(f6432e, "No Valid Color Table");
                    }
                    this.f6443C = 1;
                    bitmap = null;
                } else {
                    Bitmap a = m11413a(bVar, bVar2);
                    if (bVar.f6462f) {
                        this.f6444n[bVar.f6464h] = i;
                    }
                    bitmap = a;
                }
            }
        }
        return bitmap;
    }

    /* renamed from: l */
    public void mo7667l() {
        this.f6455y = null;
        this.f6454x = null;
        this.f6451u = null;
        this.f6452v = null;
        if (this.f6441A != null) {
            this.f6456z.mo7669a(this.f6441A);
        }
        this.f6441A = null;
        this.f6445o = null;
    }
}
