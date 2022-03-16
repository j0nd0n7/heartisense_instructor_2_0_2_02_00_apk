package com.p048a.p049a.p053d.p063d.p064a;

import android.util.Log;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.a.a.d.d.a.p */
public class C2086p extends FilterInputStream {

    /* renamed from: a */
    private static final String f6981a = "BufferedIs";

    /* renamed from: b */
    private volatile byte[] f6982b;

    /* renamed from: c */
    private int f6983c;

    /* renamed from: d */
    private int f6984d;

    /* renamed from: e */
    private int f6985e = -1;

    /* renamed from: f */
    private int f6986f;

    /* renamed from: com.a.a.d.d.a.p$a */
    public static class C2087a extends RuntimeException {

        /* renamed from: a */
        private static final long f6987a = -4338378848813561757L;

        public C2087a(String str) {
            super(str);
        }
    }

    public C2086p(InputStream inputStream, byte[] bArr) {
        super(inputStream);
        if (bArr == null || bArr.length == 0) {
            throw new IllegalArgumentException("buffer is null or empty");
        }
        this.f6982b = bArr;
    }

    /* renamed from: a */
    private int m12032a(InputStream inputStream, byte[] bArr) {
        if (this.f6985e == -1 || this.f6986f - this.f6985e >= this.f6984d) {
            int read = inputStream.read(bArr);
            if (read <= 0) {
                return read;
            }
            this.f6985e = -1;
            this.f6986f = 0;
            this.f6983c = read;
            return read;
        }
        if (this.f6985e == 0 && this.f6984d > bArr.length && this.f6983c == bArr.length) {
            int length = bArr.length * 2;
            if (length > this.f6984d) {
                length = this.f6984d;
            }
            if (Log.isLoggable(f6981a, 3)) {
                Log.d(f6981a, "allocate buffer of length: " + length);
            }
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.f6982b = bArr2;
            bArr = bArr2;
        } else if (this.f6985e > 0) {
            System.arraycopy(bArr, this.f6985e, bArr, 0, bArr.length - this.f6985e);
        }
        this.f6986f -= this.f6985e;
        this.f6985e = 0;
        this.f6983c = 0;
        int read2 = inputStream.read(bArr, this.f6986f, bArr.length - this.f6986f);
        this.f6983c = read2 <= 0 ? this.f6986f : this.f6986f + read2;
        return read2;
    }

    /* renamed from: b */
    private static IOException m12033b() {
        throw new IOException("BufferedInputStream is closed");
    }

    /* renamed from: a */
    public synchronized void mo7999a() {
        this.f6984d = this.f6982b.length;
    }

    public synchronized int available() {
        InputStream inputStream;
        inputStream = this.in;
        if (this.f6982b == null || inputStream == null) {
            throw m12033b();
        }
        return inputStream.available() + (this.f6983c - this.f6986f);
    }

    public void close() {
        this.f6982b = null;
        InputStream inputStream = this.in;
        this.in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public synchronized void mark(int i) {
        this.f6984d = Math.max(this.f6984d, i);
        this.f6985e = this.f6986f;
    }

    public boolean markSupported() {
        return true;
    }

    public synchronized int read() {
        byte b = -1;
        synchronized (this) {
            byte[] bArr = this.f6982b;
            InputStream inputStream = this.in;
            if (bArr == null || inputStream == null) {
                throw m12033b();
            } else if (this.f6986f < this.f6983c || m12032a(inputStream, bArr) != -1) {
                if (bArr != this.f6982b && (bArr = this.f6982b) == null) {
                    throw m12033b();
                } else if (this.f6983c - this.f6986f > 0) {
                    int i = this.f6986f;
                    this.f6986f = i + 1;
                    b = bArr[i] & 255;
                }
            }
        }
        return b;
    }

    public synchronized int read(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5 = -1;
        synchronized (this) {
            byte[] bArr2 = this.f6982b;
            if (bArr2 == null) {
                throw m12033b();
            } else if (i2 == 0) {
                i5 = 0;
            } else {
                InputStream inputStream = this.in;
                if (inputStream == null) {
                    throw m12033b();
                }
                if (this.f6986f < this.f6983c) {
                    int i6 = this.f6983c - this.f6986f >= i2 ? i2 : this.f6983c - this.f6986f;
                    System.arraycopy(bArr2, this.f6986f, bArr, i, i6);
                    this.f6986f += i6;
                    if (i6 == i2 || inputStream.available() == 0) {
                        i5 = i6;
                    } else {
                        i += i6;
                        i3 = i2 - i6;
                    }
                } else {
                    i3 = i2;
                }
                while (true) {
                    if (this.f6985e == -1 && i3 >= bArr2.length) {
                        i4 = inputStream.read(bArr, i, i3);
                        if (i4 == -1) {
                            if (i3 != i2) {
                                i5 = i2 - i3;
                            }
                        }
                    } else if (m12032a(inputStream, bArr2) == -1) {
                        if (i3 != i2) {
                            i5 = i2 - i3;
                        }
                    } else if (bArr2 == this.f6982b || (bArr2 = this.f6982b) != null) {
                        i4 = this.f6983c - this.f6986f >= i3 ? i3 : this.f6983c - this.f6986f;
                        System.arraycopy(bArr2, this.f6986f, bArr, i, i4);
                        this.f6986f += i4;
                    } else {
                        throw m12033b();
                    }
                    i3 -= i4;
                    if (i3 == 0) {
                        i5 = i2;
                        break;
                    } else if (inputStream.available() == 0) {
                        i5 = i2 - i3;
                        break;
                    } else {
                        i += i4;
                    }
                }
            }
        }
        return i5;
    }

    public synchronized void reset() {
        if (this.f6982b == null) {
            throw new IOException("Stream is closed");
        } else if (-1 == this.f6985e) {
            throw new C2087a("Mark has been invalidated");
        } else {
            this.f6986f = this.f6985e;
        }
    }

    public synchronized long skip(long j) {
        byte[] bArr = this.f6982b;
        InputStream inputStream = this.in;
        if (bArr == null) {
            throw m12033b();
        } else if (j < 1) {
            j = 0;
        } else if (inputStream == null) {
            throw m12033b();
        } else if (((long) (this.f6983c - this.f6986f)) >= j) {
            this.f6986f = (int) (((long) this.f6986f) + j);
        } else {
            long j2 = (long) (this.f6983c - this.f6986f);
            this.f6986f = this.f6983c;
            if (this.f6985e == -1 || j > ((long) this.f6984d)) {
                j = j2 + inputStream.skip(j - j2);
            } else if (m12032a(inputStream, bArr) == -1) {
                j = j2;
            } else if (((long) (this.f6983c - this.f6986f)) >= j - j2) {
                this.f6986f = (int) ((j - j2) + ((long) this.f6986f));
            } else {
                j = (j2 + ((long) this.f6983c)) - ((long) this.f6986f);
                this.f6986f = this.f6983c;
            }
        }
        return j;
    }
}
