package com.p048a.p049a.p051b;

import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* renamed from: com.a.a.b.d */
public class C1888d {

    /* renamed from: a */
    public static final String f6481a = "GifHeaderParser";

    /* renamed from: b */
    static final int f6482b = 3;

    /* renamed from: c */
    static final int f6483c = 10;

    /* renamed from: d */
    private static final int f6484d = 256;

    /* renamed from: e */
    private final byte[] f6485e = new byte[256];

    /* renamed from: f */
    private ByteBuffer f6486f;

    /* renamed from: g */
    private C1887c f6487g;

    /* renamed from: h */
    private int f6488h = 0;

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0040  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int[] m11442a(int r11) {
        /*
            r10 = this;
            r2 = 0
            int r0 = r11 * 3
            r1 = 0
            byte[] r4 = new byte[r0]
            java.nio.ByteBuffer r0 = r10.f6486f     // Catch:{ BufferUnderflowException -> 0x0033 }
            r0.get(r4)     // Catch:{ BufferUnderflowException -> 0x0033 }
            r0 = 256(0x100, float:3.59E-43)
            int[] r0 = new int[r0]     // Catch:{ BufferUnderflowException -> 0x0033 }
            r1 = r2
        L_0x0010:
            if (r2 >= r11) goto L_0x004c
            int r3 = r1 + 1
            byte r1 = r4[r1]     // Catch:{ BufferUnderflowException -> 0x004d }
            r5 = r1 & 255(0xff, float:3.57E-43)
            int r6 = r3 + 1
            byte r1 = r4[r3]     // Catch:{ BufferUnderflowException -> 0x004d }
            r7 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r6 + 1
            byte r3 = r4[r6]     // Catch:{ BufferUnderflowException -> 0x004d }
            r6 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r2 + 1
            r8 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            int r5 = r5 << 16
            r5 = r5 | r8
            int r7 = r7 << 8
            r5 = r5 | r7
            r5 = r5 | r6
            r0[r2] = r5     // Catch:{ BufferUnderflowException -> 0x004d }
            r2 = r3
            goto L_0x0010
        L_0x0033:
            r0 = move-exception
            r9 = r0
            r0 = r1
            r1 = r9
        L_0x0037:
            java.lang.String r2 = "GifHeaderParser"
            r3 = 3
            boolean r2 = android.util.Log.isLoggable(r2, r3)
            if (r2 == 0) goto L_0x0047
            java.lang.String r2 = "GifHeaderParser"
            java.lang.String r3 = "Format Error Reading Color Table"
            android.util.Log.d(r2, r3, r1)
        L_0x0047:
            com.a.a.b.c r1 = r10.f6487g
            r2 = 1
            r1.f6469b = r2
        L_0x004c:
            return r0
        L_0x004d:
            r1 = move-exception
            goto L_0x0037
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p048a.p049a.p051b.C1888d.m11442a(int):int[]");
    }

    /* renamed from: c */
    private void m11443c() {
        this.f6486f = null;
        Arrays.fill(this.f6485e, (byte) 0);
        this.f6487g = new C1887c();
        this.f6488h = 0;
    }

    /* renamed from: d */
    private void m11444d() {
        boolean z = false;
        while (!z && !m11455o()) {
            switch (m11453m()) {
                case 33:
                    switch (m11453m()) {
                        case 1:
                            m11451k();
                            break;
                        case 249:
                            this.f6487g.f6471d = new C1886b();
                            m11445e();
                            break;
                        case 254:
                            m11451k();
                            break;
                        case 255:
                            m11452l();
                            String str = "";
                            for (int i = 0; i < 11; i++) {
                                str = str + ((char) this.f6485e[i]);
                            }
                            if (!str.equals("NETSCAPE2.0")) {
                                m11451k();
                                break;
                            } else {
                                m11447g();
                                break;
                            }
                        default:
                            m11451k();
                            break;
                    }
                case 44:
                    if (this.f6487g.f6471d == null) {
                        this.f6487g.f6471d = new C1886b();
                    }
                    m11446f();
                    break;
                case 59:
                    z = true;
                    break;
                default:
                    this.f6487g.f6469b = 1;
                    break;
            }
        }
    }

    /* renamed from: e */
    private void m11445e() {
        boolean z = true;
        m11453m();
        int m = m11453m();
        this.f6487g.f6471d.f6463g = (m & 28) >> 2;
        if (this.f6487g.f6471d.f6463g == 0) {
            this.f6487g.f6471d.f6463g = 1;
        }
        C1886b bVar = this.f6487g.f6471d;
        if ((m & 1) == 0) {
            z = false;
        }
        bVar.f6462f = z;
        int n = m11454n();
        if (n < 3) {
            n = 10;
        }
        this.f6487g.f6471d.f6465i = n * 10;
        this.f6487g.f6471d.f6464h = m11453m();
        m11453m();
    }

    /* renamed from: f */
    private void m11446f() {
        boolean z = true;
        this.f6487g.f6471d.f6457a = m11454n();
        this.f6487g.f6471d.f6458b = m11454n();
        this.f6487g.f6471d.f6459c = m11454n();
        this.f6487g.f6471d.f6460d = m11454n();
        int m = m11453m();
        boolean z2 = (m & 128) != 0;
        int pow = (int) Math.pow(2.0d, (double) ((m & 7) + 1));
        C1886b bVar = this.f6487g.f6471d;
        if ((m & 64) == 0) {
            z = false;
        }
        bVar.f6461e = z;
        if (z2) {
            this.f6487g.f6471d.f6467k = m11442a(pow);
        } else {
            this.f6487g.f6471d.f6467k = null;
        }
        this.f6487g.f6471d.f6466j = this.f6486f.position();
        m11450j();
        if (!m11455o()) {
            this.f6487g.f6470c++;
            this.f6487g.f6472e.add(this.f6487g.f6471d);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x000b  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m11447g() {
        /*
            r4 = this;
            r3 = 1
        L_0x0001:
            r4.m11452l()
            byte[] r0 = r4.f6485e
            r1 = 0
            byte r0 = r0[r1]
            if (r0 != r3) goto L_0x001f
            byte[] r0 = r4.f6485e
            byte r0 = r0[r3]
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte[] r1 = r4.f6485e
            r2 = 2
            byte r1 = r1[r2]
            r1 = r1 & 255(0xff, float:3.57E-43)
            com.a.a.b.c r2 = r4.f6487g
            int r1 = r1 << 8
            r0 = r0 | r1
            r2.f6480m = r0
        L_0x001f:
            int r0 = r4.f6488h
            if (r0 <= 0) goto L_0x0029
            boolean r0 = r4.m11455o()
            if (r0 == 0) goto L_0x0001
        L_0x0029:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p048a.p049a.p051b.C1888d.m11447g():void");
    }

    /* renamed from: h */
    private void m11448h() {
        String str = "";
        for (int i = 0; i < 6; i++) {
            str = str + ((char) m11453m());
        }
        if (!str.startsWith("GIF")) {
            this.f6487g.f6469b = 1;
            return;
        }
        m11449i();
        if (this.f6487g.f6475h && !m11455o()) {
            this.f6487g.f6468a = m11442a(this.f6487g.f6476i);
            this.f6487g.f6479l = this.f6487g.f6468a[this.f6487g.f6477j];
        }
    }

    /* renamed from: i */
    private void m11449i() {
        this.f6487g.f6473f = m11454n();
        this.f6487g.f6474g = m11454n();
        int m = m11453m();
        this.f6487g.f6475h = (m & 128) != 0;
        this.f6487g.f6476i = 2 << (m & 7);
        this.f6487g.f6477j = m11453m();
        this.f6487g.f6478k = m11453m();
    }

    /* renamed from: j */
    private void m11450j() {
        m11453m();
        m11451k();
    }

    /* renamed from: k */
    private void m11451k() {
        int m;
        do {
            m = m11453m();
            this.f6486f.position(this.f6486f.position() + m);
        } while (m > 0);
    }

    /* renamed from: l */
    private int m11452l() {
        int i = 0;
        this.f6488h = m11453m();
        if (this.f6488h > 0) {
            int i2 = 0;
            while (i < this.f6488h) {
                try {
                    i2 = this.f6488h - i;
                    this.f6486f.get(this.f6485e, i, i2);
                    i += i2;
                } catch (Exception e) {
                    if (Log.isLoggable(f6481a, 3)) {
                        Log.d(f6481a, "Error Reading Block n: " + i + " count: " + i2 + " blockSize: " + this.f6488h, e);
                    }
                    this.f6487g.f6469b = 1;
                }
            }
        }
        return i;
    }

    /* renamed from: m */
    private int m11453m() {
        try {
            return this.f6486f.get() & 255;
        } catch (Exception e) {
            this.f6487g.f6469b = 1;
            return 0;
        }
    }

    /* renamed from: n */
    private int m11454n() {
        return this.f6486f.getShort();
    }

    /* renamed from: o */
    private boolean m11455o() {
        return this.f6487g.f6469b != 0;
    }

    /* renamed from: a */
    public C1888d mo7674a(byte[] bArr) {
        m11443c();
        if (bArr != null) {
            this.f6486f = ByteBuffer.wrap(bArr);
            this.f6486f.rewind();
            this.f6486f.order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.f6486f = null;
            this.f6487g.f6469b = 2;
        }
        return this;
    }

    /* renamed from: a */
    public void mo7675a() {
        this.f6486f = null;
        this.f6487g = null;
    }

    /* renamed from: b */
    public C1887c mo7676b() {
        if (this.f6486f == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        } else if (m11455o()) {
            return this.f6487g;
        } else {
            m11448h();
            if (!m11455o()) {
                m11444d();
                if (this.f6487g.f6470c < 0) {
                    this.f6487g.f6469b = 1;
                }
            }
            return this.f6487g;
        }
    }
}
