package com.p048a.p049a.p078j;

import android.util.Log;
import java.util.Queue;

/* renamed from: com.a.a.j.a */
public final class C2230a {

    /* renamed from: a */
    private static final String f7310a = "ByteArrayPool";

    /* renamed from: b */
    private static final int f7311b = 65536;

    /* renamed from: c */
    private static final int f7312c = 2146304;

    /* renamed from: d */
    private static final int f7313d = 32;

    /* renamed from: f */
    private static final C2230a f7314f = new C2230a();

    /* renamed from: e */
    private final Queue<byte[]> f7315e = C2238i.m12728a(0);

    private C2230a() {
    }

    /* renamed from: a */
    public static C2230a m12691a() {
        return f7314f;
    }

    /* renamed from: a */
    public boolean mo8311a(byte[] bArr) {
        boolean z = false;
        if (bArr.length == 65536) {
            synchronized (this.f7315e) {
                if (this.f7315e.size() < 32) {
                    z = true;
                    this.f7315e.offer(bArr);
                }
            }
        }
        return z;
    }

    /* renamed from: b */
    public void mo8312b() {
        synchronized (this.f7315e) {
            this.f7315e.clear();
        }
    }

    /* renamed from: c */
    public byte[] mo8313c() {
        byte[] poll;
        synchronized (this.f7315e) {
            poll = this.f7315e.poll();
        }
        if (poll == null) {
            poll = new byte[65536];
            if (Log.isLoggable(f7310a, 3)) {
                Log.d(f7310a, "Created temp bytes");
            }
        }
        return poll;
    }
}
