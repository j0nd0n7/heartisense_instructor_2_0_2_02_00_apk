package com.p048a.p049a.p053d.p054a;

import java.io.FilterInputStream;
import java.io.InputStream;

/* renamed from: com.a.a.d.a.d */
public class C1898d extends FilterInputStream {

    /* renamed from: a */
    private static final int f6589a = 2;

    /* renamed from: b */
    private static final byte[] f6590b = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};

    /* renamed from: c */
    private static final int f6591c = f6590b.length;

    /* renamed from: d */
    private static final int f6592d = (f6591c + 2);

    /* renamed from: e */
    private final byte f6593e;

    /* renamed from: f */
    private int f6594f;

    public C1898d(InputStream inputStream, int i) {
        super(inputStream);
        if (i < -1 || i > 8) {
            throw new IllegalArgumentException("Cannot add invalid orientation: " + i);
        }
        this.f6593e = (byte) i;
    }

    public void mark(int i) {
        throw new UnsupportedOperationException();
    }

    public boolean markSupported() {
        return false;
    }

    public int read() {
        int read = (this.f6594f < 2 || this.f6594f > f6592d) ? super.read() : this.f6594f == f6592d ? this.f6593e : f6590b[this.f6594f - 2] & 255;
        if (read != -1) {
            this.f6594f++;
        }
        return read;
    }

    public int read(byte[] bArr, int i, int i2) {
        int min;
        if (this.f6594f > f6592d) {
            min = super.read(bArr, i, i2);
        } else if (this.f6594f == f6592d) {
            bArr[i] = this.f6593e;
            min = 1;
        } else if (this.f6594f < 2) {
            min = super.read(bArr, i, 2 - this.f6594f);
        } else {
            min = Math.min(f6592d - this.f6594f, i2);
            System.arraycopy(f6590b, this.f6594f - 2, bArr, i, min);
        }
        if (min > 0) {
            this.f6594f += min;
        }
        return min;
    }

    public void reset() {
        throw new UnsupportedOperationException();
    }

    public long skip(long j) {
        long skip = super.skip(j);
        if (skip > 0) {
            this.f6594f = (int) (((long) this.f6594f) + skip);
        }
        return skip;
    }
}
