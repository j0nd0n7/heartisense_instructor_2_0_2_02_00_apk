package com.p048a.p049a.p053d.p063d.p068e;

import android.graphics.Bitmap;
import android.util.Log;
import com.p048a.p049a.p051b.C1884a;
import com.p048a.p049a.p051b.C1887c;
import com.p048a.p049a.p051b.C1888d;
import com.p048a.p049a.p052c.C1890a;
import com.p048a.p049a.p053d.C2145f;
import com.p048a.p049a.p053d.C2146g;
import com.p048a.p049a.p053d.p055b.C2006l;
import com.p048a.p049a.p053d.p055b.p056a.C1921c;
import com.p048a.p049a.p053d.p063d.C2106e;
import com.p048a.p049a.p053d.p063d.p064a.C2067d;
import com.p048a.p049a.p078j.C2234e;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.a.a.d.d.e.j */
public class C2125j implements C2145f<C2108b> {

    /* renamed from: a */
    private static final C2126a f7074a = new C2126a();

    /* renamed from: b */
    private static final String f7075b = "GifEncoder";

    /* renamed from: c */
    private final C1884a.C1885a f7076c;

    /* renamed from: d */
    private final C1921c f7077d;

    /* renamed from: e */
    private final C2126a f7078e;

    /* renamed from: com.a.a.d.d.e.j$a */
    static class C2126a {
        C2126a() {
        }

        /* renamed from: a */
        public C1884a mo8062a(C1884a.C1885a aVar) {
            return new C1884a(aVar);
        }

        /* renamed from: a */
        public C1888d mo8063a() {
            return new C1888d();
        }

        /* renamed from: a */
        public C2006l<Bitmap> mo8064a(Bitmap bitmap, C1921c cVar) {
            return new C2067d(bitmap, cVar);
        }

        /* renamed from: b */
        public C1890a mo8065b() {
            return new C1890a();
        }
    }

    public C2125j(C1921c cVar) {
        this(cVar, f7074a);
    }

    C2125j(C1921c cVar, C2126a aVar) {
        this.f7077d = cVar;
        this.f7076c = new C2107a(cVar);
        this.f7078e = aVar;
    }

    /* renamed from: a */
    private C1884a m12152a(byte[] bArr) {
        C1888d a = this.f7078e.mo8063a();
        a.mo7674a(bArr);
        C1887c b = a.mo7676b();
        C1884a a2 = this.f7078e.mo8062a(this.f7076c);
        a2.mo7656a(b, bArr);
        a2.mo7660e();
        return a2;
    }

    /* renamed from: a */
    private C2006l<Bitmap> m12153a(Bitmap bitmap, C2146g<Bitmap> gVar, C2108b bVar) {
        C2006l a = this.f7078e.mo8064a(bitmap, this.f7077d);
        C2006l<Bitmap> a2 = gVar.mo7947a(a, bVar.getIntrinsicWidth(), bVar.getIntrinsicHeight());
        if (!a.equals(a2)) {
            a.mo7889d();
        }
        return a2;
    }

    /* renamed from: a */
    private boolean m12154a(byte[] bArr, OutputStream outputStream) {
        try {
            outputStream.write(bArr);
            return true;
        } catch (IOException e) {
            if (Log.isLoggable(f7075b, 3)) {
                Log.d(f7075b, "Failed to write data to output stream in GifResourceEncoder", e);
            }
            return false;
        }
    }

    /* renamed from: a */
    public String mo7743a() {
        return "";
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public boolean mo7744a(C2006l<C2108b> lVar, OutputStream outputStream) {
        long a = C2234e.m12706a();
        C2108b b = lVar.mo7887b();
        C2146g<Bitmap> d = b.mo8023d();
        if (d instanceof C2106e) {
            return m12154a(b.mo8025e(), outputStream);
        }
        C1884a a2 = m12152a(b.mo8025e());
        C1890a b2 = this.f7078e.mo8065b();
        if (!b2.mo7685a(outputStream)) {
            return false;
        }
        int i = 0;
        while (i < a2.mo7662g()) {
            C2006l<Bitmap> a3 = m12153a(a2.mo7666k(), d, b);
            try {
                if (!b2.mo7684a(a3.mo7887b())) {
                    a3.mo7889d();
                    return false;
                }
                b2.mo7681a(a2.mo7653a(a2.mo7663h()));
                a2.mo7660e();
                a3.mo7889d();
                i++;
            } catch (Throwable th) {
                a3.mo7889d();
                throw th;
            }
        }
        boolean a4 = b2.mo7683a();
        if (!Log.isLoggable(f7075b, 2)) {
            return a4;
        }
        Log.v(f7075b, "Encoded gif with " + a2.mo7662g() + " frames and " + b.mo8025e().length + " bytes in " + C2234e.m12705a(a) + " ms");
        return a4;
    }
}
