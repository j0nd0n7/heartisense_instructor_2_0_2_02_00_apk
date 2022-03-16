package com.p048a.p049a.p050a;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* renamed from: com.a.a.a.b */
class C1880b implements Closeable {

    /* renamed from: a */
    private static final byte f6413a = 13;

    /* renamed from: b */
    private static final byte f6414b = 10;

    /* renamed from: c */
    private final InputStream f6415c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Charset f6416d;

    /* renamed from: e */
    private byte[] f6417e;

    /* renamed from: f */
    private int f6418f;

    /* renamed from: g */
    private int f6419g;

    public C1880b(InputStream inputStream, int i, Charset charset) {
        if (inputStream == null || charset == null) {
            throw new NullPointerException();
        } else if (i < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        } else if (!charset.equals(C1882c.f6421a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        } else {
            this.f6415c = inputStream;
            this.f6416d = charset;
            this.f6417e = new byte[i];
        }
    }

    public C1880b(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    /* renamed from: c */
    private void m11335c() {
        int read = this.f6415c.read(this.f6417e, 0, this.f6417e.length);
        if (read == -1) {
            throw new EOFException();
        }
        this.f6418f = 0;
        this.f6419g = read;
    }

    /* renamed from: a */
    public String mo7578a() {
        int i;
        String byteArrayOutputStream;
        synchronized (this.f6415c) {
            if (this.f6417e == null) {
                throw new IOException("LineReader is closed");
            }
            if (this.f6418f >= this.f6419g) {
                m11335c();
            }
            int i2 = this.f6418f;
            while (true) {
                if (i2 == this.f6419g) {
                    C18811 r1 = new ByteArrayOutputStream((this.f6419g - this.f6418f) + 80) {
                        public String toString() {
                            try {
                                return new String(this.buf, 0, (this.count <= 0 || this.buf[this.count + -1] != 13) ? this.count : this.count - 1, C1880b.this.f6416d.name());
                            } catch (UnsupportedEncodingException e) {
                                throw new AssertionError(e);
                            }
                        }
                    };
                    loop1:
                    while (true) {
                        r1.write(this.f6417e, this.f6418f, this.f6419g - this.f6418f);
                        this.f6419g = -1;
                        m11335c();
                        i = this.f6418f;
                        while (true) {
                            if (i != this.f6419g) {
                                if (this.f6417e[i] == 10) {
                                    break loop1;
                                }
                                i++;
                            }
                        }
                    }
                    if (i != this.f6418f) {
                        r1.write(this.f6417e, this.f6418f, i - this.f6418f);
                    }
                    this.f6418f = i + 1;
                    byteArrayOutputStream = r1.toString();
                } else if (this.f6417e[i2] == 10) {
                    byteArrayOutputStream = new String(this.f6417e, this.f6418f, ((i2 == this.f6418f || this.f6417e[i2 + -1] != 13) ? i2 : i2 - 1) - this.f6418f, this.f6416d.name());
                    this.f6418f = i2 + 1;
                } else {
                    i2++;
                }
            }
        }
        return byteArrayOutputStream;
    }

    /* renamed from: b */
    public boolean mo7579b() {
        return this.f6419g == -1;
    }

    public void close() {
        synchronized (this.f6415c) {
            if (this.f6417e != null) {
                this.f6417e = null;
                this.f6415c.close();
            }
        }
    }
}
