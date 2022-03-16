package com.p048a.p049a.p053d.p063d.p064a;

import android.support.p010v4.p023h.p024a.C0538a;
import android.support.p010v4.view.C1200x;
import android.util.Log;
import com.p048a.p049a.p053d.C2010c;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.a.a.d.d.a.m */
public class C2080m {

    /* renamed from: a */
    private static final String f6950a = "ImageHeaderParser";

    /* renamed from: b */
    private static final int f6951b = 4671814;

    /* renamed from: c */
    private static final int f6952c = -1991225785;

    /* renamed from: d */
    private static final int f6953d = 65496;

    /* renamed from: e */
    private static final int f6954e = 19789;

    /* renamed from: f */
    private static final int f6955f = 18761;

    /* renamed from: g */
    private static final String f6956g = "Exif\u0000\u0000";

    /* renamed from: h */
    private static final byte[] f6957h;

    /* renamed from: i */
    private static final int f6958i = 218;

    /* renamed from: j */
    private static final int f6959j = 217;

    /* renamed from: k */
    private static final int f6960k = 255;

    /* renamed from: l */
    private static final int f6961l = 225;

    /* renamed from: m */
    private static final int f6962m = 274;

    /* renamed from: n */
    private static final int[] f6963n = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* renamed from: o */
    private final C2083c f6964o;

    /* renamed from: com.a.a.d.d.a.m$a */
    public enum C2081a {
        GIF(true),
        JPEG(false),
        PNG_A(true),
        PNG(false),
        UNKNOWN(false);
        

        /* renamed from: f */
        private final boolean f6971f;

        private C2081a(boolean z) {
            this.f6971f = z;
        }

        /* renamed from: a */
        public boolean mo7988a() {
            return this.f6971f;
        }
    }

    /* renamed from: com.a.a.d.d.a.m$b */
    private static class C2082b {

        /* renamed from: a */
        private final ByteBuffer f6972a;

        public C2082b(byte[] bArr) {
            this.f6972a = ByteBuffer.wrap(bArr);
            this.f6972a.order(ByteOrder.BIG_ENDIAN);
        }

        /* renamed from: a */
        public int mo7989a() {
            return this.f6972a.array().length;
        }

        /* renamed from: a */
        public int mo7990a(int i) {
            return this.f6972a.getInt(i);
        }

        /* renamed from: a */
        public void mo7991a(ByteOrder byteOrder) {
            this.f6972a.order(byteOrder);
        }

        /* renamed from: b */
        public short mo7992b(int i) {
            return this.f6972a.getShort(i);
        }
    }

    /* renamed from: com.a.a.d.d.a.m$c */
    private static class C2083c {

        /* renamed from: a */
        private final InputStream f6973a;

        public C2083c(InputStream inputStream) {
            this.f6973a = inputStream;
        }

        /* renamed from: a */
        public int mo7993a() {
            return ((this.f6973a.read() << 8) & C1200x.f3685g) | (this.f6973a.read() & 255);
        }

        /* renamed from: a */
        public int mo7994a(byte[] bArr) {
            int length = bArr.length;
            while (length > 0) {
                int read = this.f6973a.read(bArr, bArr.length - length, length);
                if (read == -1) {
                    break;
                }
                length -= read;
            }
            return bArr.length - length;
        }

        /* renamed from: a */
        public long mo7995a(long j) {
            if (j < 0) {
                return 0;
            }
            long j2 = j;
            while (j2 > 0) {
                long skip = this.f6973a.skip(j2);
                if (skip > 0) {
                    j2 -= skip;
                } else if (this.f6973a.read() == -1) {
                    break;
                } else {
                    j2--;
                }
            }
            return j - j2;
        }

        /* renamed from: b */
        public short mo7996b() {
            return (short) (this.f6973a.read() & 255);
        }

        /* renamed from: c */
        public int mo7997c() {
            return this.f6973a.read();
        }
    }

    static {
        byte[] bArr = new byte[0];
        try {
            bArr = f6956g.getBytes(C2010c.f6851a);
        } catch (UnsupportedEncodingException e) {
        }
        f6957h = bArr;
    }

    public C2080m(InputStream inputStream) {
        this.f6964o = new C2083c(inputStream);
    }

    /* renamed from: a */
    private static int m12008a(int i, int i2) {
        return i + 2 + (i2 * 12);
    }

    /* renamed from: a */
    private static int m12009a(C2082b bVar) {
        ByteOrder byteOrder;
        int length = f6956g.length();
        short b = bVar.mo7992b(length);
        if (b == f6954e) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else if (b == f6955f) {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        } else {
            if (Log.isLoggable(f6950a, 3)) {
                Log.d(f6950a, "Unknown endianness = " + b);
            }
            byteOrder = ByteOrder.BIG_ENDIAN;
        }
        bVar.mo7991a(byteOrder);
        int a = length + bVar.mo7990a(length + 4);
        short b2 = bVar.mo7992b(a);
        for (int i = 0; i < b2; i++) {
            int a2 = m12008a(a, i);
            short b3 = bVar.mo7992b(a2);
            if (b3 == f6962m) {
                short b4 = bVar.mo7992b(a2 + 2);
                if (b4 >= 1 && b4 <= 12) {
                    int a3 = bVar.mo7990a(a2 + 4);
                    if (a3 >= 0) {
                        if (Log.isLoggable(f6950a, 3)) {
                            Log.d(f6950a, "Got tagIndex=" + i + " tagType=" + b3 + " formatCode=" + b4 + " componentCount=" + a3);
                        }
                        int i2 = a3 + f6963n[b4];
                        if (i2 <= 4) {
                            int i3 = a2 + 8;
                            if (i3 < 0 || i3 > bVar.mo7989a()) {
                                if (Log.isLoggable(f6950a, 3)) {
                                    Log.d(f6950a, "Illegal tagValueOffset=" + i3 + " tagType=" + b3);
                                }
                            } else if (i2 >= 0 && i3 + i2 <= bVar.mo7989a()) {
                                return bVar.mo7992b(i3);
                            } else {
                                if (Log.isLoggable(f6950a, 3)) {
                                    Log.d(f6950a, "Illegal number of bytes for TI tag data tagType=" + b3);
                                }
                            }
                        } else if (Log.isLoggable(f6950a, 3)) {
                            Log.d(f6950a, "Got byte count > 4, not orientation, continuing, formatCode=" + b4);
                        }
                    } else if (Log.isLoggable(f6950a, 3)) {
                        Log.d(f6950a, "Negative tiff component count");
                    }
                } else if (Log.isLoggable(f6950a, 3)) {
                    Log.d(f6950a, "Got invalid format code=" + b4);
                }
            }
        }
        return -1;
    }

    /* renamed from: a */
    private static boolean m12010a(int i) {
        return (i & f6953d) == f6953d || i == f6954e || i == f6955f;
    }

    /* renamed from: d */
    private byte[] m12011d() {
        short b;
        int a;
        long a2;
        do {
            short b2 = this.f6964o.mo7996b();
            if (b2 == 255) {
                b = this.f6964o.mo7996b();
                if (b == f6958i) {
                    return null;
                }
                if (b != f6959j) {
                    a = this.f6964o.mo7993a() - 2;
                    if (b != f6961l) {
                        a2 = this.f6964o.mo7995a((long) a);
                    } else {
                        byte[] bArr = new byte[a];
                        int a3 = this.f6964o.mo7994a(bArr);
                        if (a3 == a) {
                            return bArr;
                        }
                        if (!Log.isLoggable(f6950a, 3)) {
                            return null;
                        }
                        Log.d(f6950a, "Unable to read segment data, type: " + b + ", length: " + a + ", actually read: " + a3);
                        return null;
                    }
                } else if (!Log.isLoggable(f6950a, 3)) {
                    return null;
                } else {
                    Log.d(f6950a, "Found MARKER_EOI in exif segment");
                    return null;
                }
            } else if (!Log.isLoggable(f6950a, 3)) {
                return null;
            } else {
                Log.d(f6950a, "Unknown segmentId=" + b2);
                return null;
            }
        } while (a2 == ((long) a));
        if (!Log.isLoggable(f6950a, 3)) {
            return null;
        }
        Log.d(f6950a, "Unable to skip enough data, type: " + b + ", wanted to skip: " + a + ", but actually skipped: " + a2);
        return null;
    }

    /* renamed from: a */
    public boolean mo7985a() {
        return mo7986b().mo7988a();
    }

    /* renamed from: b */
    public C2081a mo7986b() {
        int a = this.f6964o.mo7993a();
        if (a == f6953d) {
            return C2081a.JPEG;
        }
        int a2 = ((a << 16) & C0538a.f2113c) | (this.f6964o.mo7993a() & C0538a.f2111a);
        if (a2 != f6952c) {
            return (a2 >> 8) == f6951b ? C2081a.GIF : C2081a.UNKNOWN;
        }
        this.f6964o.mo7995a(21);
        return this.f6964o.mo7997c() >= 3 ? C2081a.PNG_A : C2081a.PNG;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003e  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo7987c() {
        /*
            r7 = this;
            r2 = -1
            r1 = 0
            com.a.a.d.d.a.m$c r0 = r7.f6964o
            int r0 = r0.mo7993a()
            boolean r0 = m12010a((int) r0)
            if (r0 != 0) goto L_0x0010
            r0 = r2
        L_0x000f:
            return r0
        L_0x0010:
            byte[] r4 = r7.m12011d()
            if (r4 == 0) goto L_0x0039
            int r0 = r4.length
            byte[] r3 = f6957h
            int r3 = r3.length
            if (r0 <= r3) goto L_0x0039
            r3 = 1
        L_0x001d:
            if (r3 == 0) goto L_0x0040
            r0 = r1
        L_0x0020:
            byte[] r5 = f6957h
            int r5 = r5.length
            if (r0 >= r5) goto L_0x0040
            byte r5 = r4[r0]
            byte[] r6 = f6957h
            byte r6 = r6[r0]
            if (r5 == r6) goto L_0x003b
        L_0x002d:
            if (r1 == 0) goto L_0x003e
            com.a.a.d.d.a.m$b r0 = new com.a.a.d.d.a.m$b
            r0.<init>(r4)
            int r0 = m12009a((com.p048a.p049a.p053d.p063d.p064a.C2080m.C2082b) r0)
            goto L_0x000f
        L_0x0039:
            r3 = r1
            goto L_0x001d
        L_0x003b:
            int r0 = r0 + 1
            goto L_0x0020
        L_0x003e:
            r0 = r2
            goto L_0x000f
        L_0x0040:
            r1 = r3
            goto L_0x002d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p048a.p049a.p053d.p063d.p064a.C2080m.mo7987c():int");
    }
}
