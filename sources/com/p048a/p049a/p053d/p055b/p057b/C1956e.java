package com.p048a.p049a.p053d.p055b.p057b;

import android.util.Log;
import com.p048a.p049a.p050a.C1875a;
import com.p048a.p049a.p053d.C2010c;
import com.p048a.p049a.p053d.p055b.p057b.C1944a;
import java.io.File;
import java.io.IOException;

/* renamed from: com.a.a.d.b.b.e */
public class C1956e implements C1944a {

    /* renamed from: a */
    private static final String f6702a = "DiskLruCacheWrapper";

    /* renamed from: b */
    private static final int f6703b = 1;

    /* renamed from: c */
    private static final int f6704c = 1;

    /* renamed from: d */
    private static C1956e f6705d = null;

    /* renamed from: e */
    private final C1948c f6706e = new C1948c();

    /* renamed from: f */
    private final C1968l f6707f;

    /* renamed from: g */
    private final File f6708g;

    /* renamed from: h */
    private final int f6709h;

    /* renamed from: i */
    private C1875a f6710i;

    protected C1956e(File file, int i) {
        this.f6708g = file;
        this.f6709h = i;
        this.f6707f = new C1968l();
    }

    /* renamed from: a */
    public static synchronized C1944a m11711a(File file, int i) {
        C1956e eVar;
        synchronized (C1956e.class) {
            if (f6705d == null) {
                f6705d = new C1956e(file, i);
            }
            eVar = f6705d;
        }
        return eVar;
    }

    /* renamed from: b */
    private synchronized C1875a m11712b() {
        if (this.f6710i == null) {
            this.f6710i = C1875a.m11276a(this.f6708g, 1, 1, (long) this.f6709h);
        }
        return this.f6710i;
    }

    /* renamed from: c */
    private synchronized void m11713c() {
        this.f6710i = null;
    }

    /* renamed from: a */
    public File mo7801a(C2010c cVar) {
        try {
            C1875a.C1879c a = m11712b().mo7552a(this.f6707f.mo7828a(cVar));
            if (a != null) {
                return a.mo7575a(0);
            }
            return null;
        } catch (IOException e) {
            if (!Log.isLoggable(f6702a, 5)) {
                return null;
            }
            Log.w(f6702a, "Unable to get from disk cache", e);
            return null;
        }
    }

    /* renamed from: a */
    public synchronized void mo7802a() {
        try {
            m11712b().mo7562f();
            m11713c();
        } catch (IOException e) {
            if (Log.isLoggable(f6702a, 5)) {
                Log.w(f6702a, "Unable to clear disk cache", e);
            }
        }
    }

    /* renamed from: a */
    public void mo7803a(C2010c cVar, C1944a.C1946b bVar) {
        C1875a.C1877a b;
        String a = this.f6707f.mo7828a(cVar);
        this.f6706e.mo7806a(cVar);
        try {
            b = m11712b().mo7556b(a);
            if (b != null) {
                if (bVar.mo7800a(b.mo7568b(0))) {
                    b.mo7566a();
                }
                b.mo7570c();
            }
            this.f6706e.mo7807b(cVar);
        } catch (IOException e) {
            try {
                if (Log.isLoggable(f6702a, 5)) {
                    Log.w(f6702a, "Unable to put to disk cache", e);
                }
            } finally {
                this.f6706e.mo7807b(cVar);
            }
        } catch (Throwable th) {
            b.mo7570c();
            throw th;
        }
    }

    /* renamed from: b */
    public void mo7804b(C2010c cVar) {
        try {
            m11712b().mo7558c(this.f6707f.mo7828a(cVar));
        } catch (IOException e) {
            if (Log.isLoggable(f6702a, 5)) {
                Log.w(f6702a, "Unable to delete from disk cache", e);
            }
        }
    }
}
