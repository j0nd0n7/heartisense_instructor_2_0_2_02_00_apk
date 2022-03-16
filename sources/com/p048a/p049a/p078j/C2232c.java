package com.p048a.p049a.p078j;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* renamed from: com.a.a.j.c */
public class C2232c extends InputStream {

    /* renamed from: a */
    private static final Queue<C2232c> f7320a = C2238i.m12728a(0);

    /* renamed from: b */
    private InputStream f7321b;

    /* renamed from: c */
    private IOException f7322c;

    C2232c() {
    }

    /* renamed from: a */
    public static C2232c m12699a(InputStream inputStream) {
        C2232c poll;
        synchronized (f7320a) {
            poll = f7320a.poll();
        }
        if (poll == null) {
            poll = new C2232c();
        }
        poll.mo8320b(inputStream);
        return poll;
    }

    /* renamed from: a */
    static void m12700a() {
        while (!f7320a.isEmpty()) {
            f7320a.remove();
        }
    }

    public int available() {
        return this.f7321b.available();
    }

    /* renamed from: b */
    public IOException mo8319b() {
        return this.f7322c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo8320b(InputStream inputStream) {
        this.f7321b = inputStream;
    }

    /* renamed from: c */
    public void mo8321c() {
        this.f7322c = null;
        this.f7321b = null;
        synchronized (f7320a) {
            f7320a.offer(this);
        }
    }

    public void close() {
        this.f7321b.close();
    }

    public void mark(int i) {
        this.f7321b.mark(i);
    }

    public boolean markSupported() {
        return this.f7321b.markSupported();
    }

    public int read() {
        try {
            return this.f7321b.read();
        } catch (IOException e) {
            this.f7322c = e;
            return -1;
        }
    }

    public int read(byte[] bArr) {
        try {
            return this.f7321b.read(bArr);
        } catch (IOException e) {
            this.f7322c = e;
            return -1;
        }
    }

    public int read(byte[] bArr, int i, int i2) {
        try {
            return this.f7321b.read(bArr, i, i2);
        } catch (IOException e) {
            this.f7322c = e;
            return -1;
        }
    }

    public synchronized void reset() {
        this.f7321b.reset();
    }

    public long skip(long j) {
        try {
            return this.f7321b.skip(j);
        } catch (IOException e) {
            this.f7322c = e;
            return 0;
        }
    }
}
