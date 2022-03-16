package com.p048a.p049a.p078j;

import android.text.TextUtils;
import android.util.Log;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.a.a.j.b */
public final class C2231b extends FilterInputStream {

    /* renamed from: a */
    private static final String f7316a = "ContentLengthStream";

    /* renamed from: b */
    private static final int f7317b = -1;

    /* renamed from: c */
    private final long f7318c;

    /* renamed from: d */
    private int f7319d;

    C2231b(InputStream inputStream, long j) {
        super(inputStream);
        this.f7318c = j;
    }

    /* renamed from: a */
    private int m12695a(int i) {
        if (i >= 0) {
            this.f7319d += i;
        } else if (this.f7318c - ((long) this.f7319d) > 0) {
            throw new IOException("Failed to read all expected data, expected: " + this.f7318c + ", but read: " + this.f7319d);
        }
        return i;
    }

    /* renamed from: a */
    private static int m12696a(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            if (!Log.isLoggable(f7316a, 3)) {
                return -1;
            }
            Log.d(f7316a, "failed to parse content length header: " + str, e);
            return -1;
        }
    }

    /* renamed from: a */
    public static InputStream m12697a(InputStream inputStream, long j) {
        return new C2231b(inputStream, j);
    }

    /* renamed from: a */
    public static InputStream m12698a(InputStream inputStream, String str) {
        return m12697a(inputStream, (long) m12696a(str));
    }

    public synchronized int available() {
        return (int) Math.max(this.f7318c - ((long) this.f7319d), (long) this.in.available());
    }

    public synchronized int read() {
        return m12695a(super.read());
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public synchronized int read(byte[] bArr, int i, int i2) {
        return m12695a(super.read(bArr, i, i2));
    }
}
