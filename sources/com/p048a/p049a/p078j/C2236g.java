package com.p048a.p049a.p078j;

import java.io.FilterInputStream;
import java.io.InputStream;

/* renamed from: com.a.a.j.g */
public class C2236g extends FilterInputStream {

    /* renamed from: a */
    private static final int f7329a = Integer.MIN_VALUE;

    /* renamed from: b */
    private static final int f7330b = -1;

    /* renamed from: c */
    private int f7331c = Integer.MIN_VALUE;

    public C2236g(InputStream inputStream) {
        super(inputStream);
    }

    /* renamed from: a */
    private long m12719a(long j) {
        if (this.f7331c == 0) {
            return -1;
        }
        return (this.f7331c == Integer.MIN_VALUE || j <= ((long) this.f7331c)) ? j : (long) this.f7331c;
    }

    /* renamed from: b */
    private void m12720b(long j) {
        if (this.f7331c != Integer.MIN_VALUE && j != -1) {
            this.f7331c = (int) (((long) this.f7331c) - j);
        }
    }

    public int available() {
        return this.f7331c == Integer.MIN_VALUE ? super.available() : Math.min(this.f7331c, super.available());
    }

    public void mark(int i) {
        super.mark(i);
        this.f7331c = i;
    }

    public int read() {
        if (m12719a(1) == -1) {
            return -1;
        }
        int read = super.read();
        m12720b(1);
        return read;
    }

    public int read(byte[] bArr, int i, int i2) {
        int a = (int) m12719a((long) i2);
        if (a == -1) {
            return -1;
        }
        int read = super.read(bArr, i, a);
        m12720b((long) read);
        return read;
    }

    public void reset() {
        super.reset();
        this.f7331c = Integer.MIN_VALUE;
    }

    public long skip(long j) {
        long a = m12719a(j);
        if (a == -1) {
            return -1;
        }
        long skip = super.skip(a);
        m12720b(skip);
        return skip;
    }
}
