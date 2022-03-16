package com.p048a.p049a.p053d.p063d.p069f;

import android.graphics.Bitmap;
import com.p048a.p049a.p053d.C2144e;
import com.p048a.p049a.p053d.p055b.C2006l;
import com.p048a.p049a.p053d.p055b.p056a.C1921c;
import com.p048a.p049a.p053d.p060c.C2046g;
import com.p048a.p049a.p053d.p063d.p064a.C2067d;
import com.p048a.p049a.p053d.p063d.p064a.C2080m;
import com.p048a.p049a.p053d.p063d.p064a.C2086p;
import com.p048a.p049a.p053d.p063d.p068e.C2108b;
import com.p048a.p049a.p078j.C2230a;
import java.io.InputStream;

/* renamed from: com.a.a.d.d.f.c */
public class C2129c implements C2144e<C2046g, C2127a> {

    /* renamed from: a */
    static final int f7082a = 2048;

    /* renamed from: b */
    private static final C2131b f7083b = new C2131b();

    /* renamed from: c */
    private static final C2130a f7084c = new C2130a();

    /* renamed from: d */
    private final C2144e<C2046g, Bitmap> f7085d;

    /* renamed from: e */
    private final C2144e<InputStream, C2108b> f7086e;

    /* renamed from: f */
    private final C1921c f7087f;

    /* renamed from: g */
    private final C2131b f7088g;

    /* renamed from: h */
    private final C2130a f7089h;

    /* renamed from: i */
    private String f7090i;

    /* renamed from: com.a.a.d.d.f.c$a */
    static class C2130a {
        C2130a() {
        }

        /* renamed from: a */
        public InputStream mo8071a(InputStream inputStream, byte[] bArr) {
            return new C2086p(inputStream, bArr);
        }
    }

    /* renamed from: com.a.a.d.d.f.c$b */
    static class C2131b {
        C2131b() {
        }

        /* renamed from: a */
        public C2080m.C2081a mo8072a(InputStream inputStream) {
            return new C2080m(inputStream).mo7986b();
        }
    }

    public C2129c(C2144e<C2046g, Bitmap> eVar, C2144e<InputStream, C2108b> eVar2, C1921c cVar) {
        this(eVar, eVar2, cVar, f7083b, f7084c);
    }

    C2129c(C2144e<C2046g, Bitmap> eVar, C2144e<InputStream, C2108b> eVar2, C1921c cVar, C2131b bVar, C2130a aVar) {
        this.f7085d = eVar;
        this.f7086e = eVar2;
        this.f7087f = cVar;
        this.f7088g = bVar;
        this.f7089h = aVar;
    }

    /* renamed from: a */
    private C2127a m12169a(C2046g gVar, int i, int i2, byte[] bArr) {
        return gVar.mo7921a() != null ? m12172b(gVar, i, i2, bArr) : m12171b(gVar, i, i2);
    }

    /* renamed from: a */
    private C2127a m12170a(InputStream inputStream, int i, int i2) {
        C2006l<C2108b> a = this.f7086e.mo7949a(inputStream, i, i2);
        if (a == null) {
            return null;
        }
        C2108b b = a.mo7887b();
        return b.mo8026f() > 1 ? new C2127a((C2006l<Bitmap>) null, a) : new C2127a(new C2067d(b.mo8020b(), this.f7087f), (C2006l<C2108b>) null);
    }

    /* renamed from: b */
    private C2127a m12171b(C2046g gVar, int i, int i2) {
        C2006l<Bitmap> a = this.f7085d.mo7949a(gVar, i, i2);
        if (a != null) {
            return new C2127a(a, (C2006l<C2108b>) null);
        }
        return null;
    }

    /* renamed from: b */
    private C2127a m12172b(C2046g gVar, int i, int i2, byte[] bArr) {
        InputStream a = this.f7089h.mo8071a(gVar.mo7921a(), bArr);
        a.mark(2048);
        C2080m.C2081a a2 = this.f7088g.mo8072a(a);
        a.reset();
        C2127a aVar = null;
        if (a2 == C2080m.C2081a.GIF) {
            aVar = m12170a(a, i, i2);
        }
        return aVar == null ? m12171b(new C2046g(a, gVar.mo7922b()), i, i2) : aVar;
    }

    /* renamed from: a */
    public C2006l<C2127a> mo7949a(C2046g gVar, int i, int i2) {
        C2230a a = C2230a.m12691a();
        byte[] c = a.mo8313c();
        try {
            C2127a a2 = m12169a(gVar, i, i2, c);
            if (a2 != null) {
                return new C2128b(a2);
            }
            return null;
        } finally {
            a.mo8311a(c);
        }
    }

    /* renamed from: a */
    public String mo7950a() {
        if (this.f7090i == null) {
            this.f7090i = this.f7086e.mo7950a() + this.f7085d.mo7950a();
        }
        return this.f7090i;
    }
}
