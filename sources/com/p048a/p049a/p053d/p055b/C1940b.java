package com.p048a.p049a.p053d.p055b;

import android.util.Log;
import com.p048a.p049a.C2255p;
import com.p048a.p049a.p053d.C1915b;
import com.p048a.p049a.p053d.C2010c;
import com.p048a.p049a.p053d.C2146g;
import com.p048a.p049a.p053d.p054a.C1897c;
import com.p048a.p049a.p053d.p055b.p057b.C1944a;
import com.p048a.p049a.p053d.p063d.p070g.C2141f;
import com.p048a.p049a.p073g.C2173b;
import com.p048a.p049a.p078j.C2234e;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.a.a.d.b.b */
class C1940b<A, T, Z> {

    /* renamed from: a */
    private static final String f6672a = "DecodeJob";

    /* renamed from: b */
    private static final C1942b f6673b = new C1942b();

    /* renamed from: c */
    private final C1998g f6674c;

    /* renamed from: d */
    private final int f6675d;

    /* renamed from: e */
    private final int f6676e;

    /* renamed from: f */
    private final C1897c<A> f6677f;

    /* renamed from: g */
    private final C2173b<A, T> f6678g;

    /* renamed from: h */
    private final C2146g<T> f6679h;

    /* renamed from: i */
    private final C2141f<T, Z> f6680i;

    /* renamed from: j */
    private final C1941a f6681j;

    /* renamed from: k */
    private final C1969c f6682k;

    /* renamed from: l */
    private final C2255p f6683l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final C1942b f6684m;

    /* renamed from: n */
    private volatile boolean f6685n;

    /* renamed from: com.a.a.d.b.b$a */
    interface C1941a {
        /* renamed from: a */
        C1944a mo7798a();
    }

    /* renamed from: com.a.a.d.b.b$b */
    static class C1942b {
        C1942b() {
        }

        /* renamed from: a */
        public OutputStream mo7799a(File file) {
            return new BufferedOutputStream(new FileOutputStream(file));
        }
    }

    /* renamed from: com.a.a.d.b.b$c */
    class C1943c<DataType> implements C1944a.C1946b {

        /* renamed from: b */
        private final C1915b<DataType> f6687b;

        /* renamed from: c */
        private final DataType f6688c;

        public C1943c(C1915b<DataType> bVar, DataType datatype) {
            this.f6687b = bVar;
            this.f6688c = datatype;
        }

        /* renamed from: a */
        public boolean mo7800a(File file) {
            boolean z = false;
            OutputStream outputStream = null;
            try {
                outputStream = C1940b.this.f6684m.mo7799a(file);
                z = this.f6687b.mo7744a(this.f6688c, outputStream);
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (IOException e) {
                    }
                }
            } catch (FileNotFoundException e2) {
                if (Log.isLoggable(C1940b.f6672a, 3)) {
                    Log.d(C1940b.f6672a, "Failed to find file to write to disk cache", e2);
                }
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (IOException e3) {
                    }
                }
            } catch (Throwable th) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (IOException e4) {
                    }
                }
                throw th;
            }
            return z;
        }
    }

    public C1940b(C1998g gVar, int i, int i2, C1897c<A> cVar, C2173b<A, T> bVar, C2146g<T> gVar2, C2141f<T, Z> fVar, C1941a aVar, C1969c cVar2, C2255p pVar) {
        this(gVar, i, i2, cVar, bVar, gVar2, fVar, aVar, cVar2, pVar, f6673b);
    }

    C1940b(C1998g gVar, int i, int i2, C1897c<A> cVar, C2173b<A, T> bVar, C2146g<T> gVar2, C2141f<T, Z> fVar, C1941a aVar, C1969c cVar2, C2255p pVar, C1942b bVar2) {
        this.f6674c = gVar;
        this.f6675d = i;
        this.f6676e = i2;
        this.f6677f = cVar;
        this.f6678g = bVar;
        this.f6679h = gVar2;
        this.f6680i = fVar;
        this.f6681j = aVar;
        this.f6682k = cVar2;
        this.f6683l = pVar;
        this.f6684m = bVar2;
    }

    /* renamed from: a */
    private C2006l<Z> m11677a(C2006l<T> lVar) {
        long a = C2234e.m12706a();
        C2006l<T> c = m11683c(lVar);
        if (Log.isLoggable(f6672a, 2)) {
            m11680a("Transformed resource from source", a);
        }
        m11682b(c);
        long a2 = C2234e.m12706a();
        C2006l<Z> d = m11684d(c);
        if (Log.isLoggable(f6672a, 2)) {
            m11680a("Transcoded transformed from source", a2);
        }
        return d;
    }

    /* renamed from: a */
    private C2006l<T> m11678a(C2010c cVar) {
        C2006l<T> lVar = null;
        File a = this.f6681j.mo7798a().mo7801a(cVar);
        if (a != null) {
            try {
                lVar = this.f6678g.mo7959a().mo7949a(a, this.f6675d, this.f6676e);
                if (lVar == null) {
                    this.f6681j.mo7798a().mo7804b(cVar);
                }
            } catch (Throwable th) {
                if (0 == 0) {
                    this.f6681j.mo7798a().mo7804b(cVar);
                }
                throw th;
            }
        }
        return lVar;
    }

    /* renamed from: a */
    private C2006l<T> m11679a(A a) {
        if (this.f6682k.mo7829a()) {
            return m11681b(a);
        }
        long a2 = C2234e.m12706a();
        C2006l<T> a3 = this.f6678g.mo7960b().mo7949a(a, this.f6675d, this.f6676e);
        if (!Log.isLoggable(f6672a, 2)) {
            return a3;
        }
        m11680a("Decoded from source", a2);
        return a3;
    }

    /* renamed from: a */
    private void m11680a(String str, long j) {
        Log.v(f6672a, str + " in " + C2234e.m12705a(j) + ", key: " + this.f6674c);
    }

    /* renamed from: b */
    private C2006l<T> m11681b(A a) {
        long a2 = C2234e.m12706a();
        this.f6681j.mo7798a().mo7803a(this.f6674c.mo7880a(), new C1943c(this.f6678g.mo7961c(), a));
        if (Log.isLoggable(f6672a, 2)) {
            m11680a("Wrote source to cache", a2);
        }
        long a3 = C2234e.m12706a();
        C2006l<T> a4 = m11678a(this.f6674c.mo7880a());
        if (Log.isLoggable(f6672a, 2) && a4 != null) {
            m11680a("Decoded source from cache", a3);
        }
        return a4;
    }

    /* renamed from: b */
    private void m11682b(C2006l<T> lVar) {
        if (lVar != null && this.f6682k.mo7830b()) {
            long a = C2234e.m12706a();
            this.f6681j.mo7798a().mo7803a(this.f6674c, new C1943c(this.f6678g.mo7962d(), lVar));
            if (Log.isLoggable(f6672a, 2)) {
                m11680a("Wrote transformed from source to cache", a);
            }
        }
    }

    /* renamed from: c */
    private C2006l<T> m11683c(C2006l<T> lVar) {
        if (lVar == null) {
            return null;
        }
        C2006l<T> a = this.f6679h.mo7947a(lVar, this.f6675d, this.f6676e);
        if (lVar.equals(a)) {
            return a;
        }
        lVar.mo7889d();
        return a;
    }

    /* renamed from: d */
    private C2006l<Z> m11684d(C2006l<T> lVar) {
        if (lVar == null) {
            return null;
        }
        return this.f6680i.mo8075a(lVar);
    }

    /* renamed from: e */
    private C2006l<T> m11685e() {
        try {
            long a = C2234e.m12706a();
            A a2 = this.f6677f.mo7711a(this.f6683l);
            if (Log.isLoggable(f6672a, 2)) {
                m11680a("Fetched data", a);
            }
            if (this.f6685n) {
                return null;
            }
            C2006l<T> a3 = m11679a(a2);
            this.f6677f.mo7712a();
            return a3;
        } finally {
            this.f6677f.mo7712a();
        }
    }

    /* renamed from: a */
    public C2006l<Z> mo7794a() {
        if (!this.f6682k.mo7830b()) {
            return null;
        }
        long a = C2234e.m12706a();
        C2006l a2 = m11678a((C2010c) this.f6674c);
        if (Log.isLoggable(f6672a, 2)) {
            m11680a("Decoded transformed from cache", a);
        }
        long a3 = C2234e.m12706a();
        C2006l<Z> d = m11684d(a2);
        if (!Log.isLoggable(f6672a, 2)) {
            return d;
        }
        m11680a("Transcoded transformed from cache", a3);
        return d;
    }

    /* renamed from: b */
    public C2006l<Z> mo7795b() {
        if (!this.f6682k.mo7829a()) {
            return null;
        }
        long a = C2234e.m12706a();
        C2006l a2 = m11678a(this.f6674c.mo7880a());
        if (Log.isLoggable(f6672a, 2)) {
            m11680a("Decoded source from cache", a);
        }
        return m11677a(a2);
    }

    /* renamed from: c */
    public C2006l<Z> mo7796c() {
        return m11677a(m11685e());
    }

    /* renamed from: d */
    public void mo7797d() {
        this.f6685n = true;
        this.f6677f.mo7715c();
    }
}
