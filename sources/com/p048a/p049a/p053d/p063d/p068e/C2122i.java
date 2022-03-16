package com.p048a.p049a.p053d.p063d.p068e;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import com.p048a.p049a.C2243l;
import com.p048a.p049a.p051b.C1884a;
import com.p048a.p049a.p051b.C1887c;
import com.p048a.p049a.p051b.C1888d;
import com.p048a.p049a.p053d.C2144e;
import com.p048a.p049a.p053d.p055b.p056a.C1921c;
import com.p048a.p049a.p053d.p063d.C2106e;
import com.p048a.p049a.p078j.C2238i;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* renamed from: com.a.a.d.d.e.i */
public class C2122i implements C2144e<InputStream, C2108b> {

    /* renamed from: a */
    private static final String f7064a = "GifResourceDecoder";

    /* renamed from: b */
    private static final C2124b f7065b = new C2124b();

    /* renamed from: c */
    private static final C2123a f7066c = new C2123a();

    /* renamed from: d */
    private final Context f7067d;

    /* renamed from: e */
    private final C2124b f7068e;

    /* renamed from: f */
    private final C1921c f7069f;

    /* renamed from: g */
    private final C2123a f7070g;

    /* renamed from: h */
    private final C2107a f7071h;

    /* renamed from: com.a.a.d.d.e.i$a */
    static class C2123a {

        /* renamed from: a */
        private final Queue<C1884a> f7072a = C2238i.m12728a(0);

        C2123a() {
        }

        /* renamed from: a */
        public synchronized C1884a mo8057a(C1884a.C1885a aVar) {
            C1884a poll;
            poll = this.f7072a.poll();
            if (poll == null) {
                poll = new C1884a(aVar);
            }
            return poll;
        }

        /* renamed from: a */
        public synchronized void mo8058a(C1884a aVar) {
            aVar.mo7667l();
            this.f7072a.offer(aVar);
        }
    }

    /* renamed from: com.a.a.d.d.e.i$b */
    static class C2124b {

        /* renamed from: a */
        private final Queue<C1888d> f7073a = C2238i.m12728a(0);

        C2124b() {
        }

        /* renamed from: a */
        public synchronized C1888d mo8059a(byte[] bArr) {
            C1888d poll;
            poll = this.f7073a.poll();
            if (poll == null) {
                poll = new C1888d();
            }
            return poll.mo7674a(bArr);
        }

        /* renamed from: a */
        public synchronized void mo8060a(C1888d dVar) {
            dVar.mo7675a();
            this.f7073a.offer(dVar);
        }
    }

    public C2122i(Context context) {
        this(context, C2243l.m12761b(context).mo8360c());
    }

    public C2122i(Context context, C1921c cVar) {
        this(context, cVar, f7065b, f7066c);
    }

    C2122i(Context context, C1921c cVar, C2124b bVar, C2123a aVar) {
        this.f7067d = context;
        this.f7069f = cVar;
        this.f7070g = aVar;
        this.f7071h = new C2107a(cVar);
        this.f7068e = bVar;
    }

    /* renamed from: a */
    private Bitmap m12142a(C1884a aVar, C1887c cVar, byte[] bArr) {
        aVar.mo7656a(cVar, bArr);
        aVar.mo7660e();
        return aVar.mo7666k();
    }

    /* renamed from: a */
    private C2111d m12143a(byte[] bArr, int i, int i2, C1888d dVar, C1884a aVar) {
        Bitmap a;
        C1887c b = dVar.mo7676b();
        if (b.mo7672c() <= 0 || b.mo7673d() != 0 || (a = m12142a(aVar, b, bArr)) == null) {
            return null;
        }
        return new C2111d(new C2108b(this.f7067d, this.f7071h, this.f7069f, C2106e.m12089b(), i, i2, b, bArr, a));
    }

    /* renamed from: a */
    private static byte[] m12144a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            byteArrayOutputStream.flush();
        } catch (IOException e) {
            Log.w(f7064a, "Error reading data from stream", e);
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: a */
    public C2111d mo7949a(InputStream inputStream, int i, int i2) {
        byte[] a = m12144a(inputStream);
        C1888d a2 = this.f7068e.mo8059a(a);
        C1884a a3 = this.f7070g.mo8057a((C1884a.C1885a) this.f7071h);
        try {
            return m12143a(a, i, i2, a2, a3);
        } finally {
            this.f7068e.mo8060a(a2);
            this.f7070g.mo8058a(a3);
        }
    }

    /* renamed from: a */
    public String mo7950a() {
        return "";
    }
}
