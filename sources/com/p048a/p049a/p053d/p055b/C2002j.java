package com.p048a.p049a.p053d.p055b;

import android.util.Log;
import com.p048a.p049a.C2255p;
import com.p048a.p049a.p053d.p055b.p058c.C1978b;
import com.p048a.p049a.p074h.C2222g;

/* renamed from: com.a.a.d.b.j */
class C2002j implements C1978b, Runnable {

    /* renamed from: a */
    private static final String f6837a = "EngineRunnable";

    /* renamed from: b */
    private final C2255p f6838b;

    /* renamed from: c */
    private final C2003a f6839c;

    /* renamed from: d */
    private final C1940b<?, ?, ?> f6840d;

    /* renamed from: e */
    private C2004b f6841e = C2004b.CACHE;

    /* renamed from: f */
    private volatile boolean f6842f;

    /* renamed from: com.a.a.d.b.j$a */
    interface C2003a extends C2222g {
        /* renamed from: b */
        void mo7875b(C2002j jVar);
    }

    /* renamed from: com.a.a.d.b.j$b */
    private enum C2004b {
        CACHE,
        SOURCE
    }

    public C2002j(C2003a aVar, C1940b<?, ?, ?> bVar, C2255p pVar) {
        this.f6839c = aVar;
        this.f6840d = bVar;
        this.f6838b = pVar;
    }

    /* renamed from: a */
    private void m11828a(C2006l lVar) {
        this.f6839c.mo7872a((C2006l<?>) lVar);
    }

    /* renamed from: a */
    private void m11829a(Exception exc) {
        if (m11830c()) {
            this.f6841e = C2004b.SOURCE;
            this.f6839c.mo7875b(this);
            return;
        }
        this.f6839c.mo7874a(exc);
    }

    /* renamed from: c */
    private boolean m11830c() {
        return this.f6841e == C2004b.CACHE;
    }

    /* renamed from: d */
    private C2006l<?> m11831d() {
        return m11830c() ? m11832e() : m11833f();
    }

    /* renamed from: e */
    private C2006l<?> m11832e() {
        C2006l<?> lVar;
        try {
            lVar = this.f6840d.mo7794a();
        } catch (Exception e) {
            if (Log.isLoggable(f6837a, 3)) {
                Log.d(f6837a, "Exception decoding result from cache: " + e);
            }
            lVar = null;
        }
        return lVar == null ? this.f6840d.mo7795b() : lVar;
    }

    /* renamed from: f */
    private C2006l<?> m11833f() {
        return this.f6840d.mo7796c();
    }

    /* renamed from: a */
    public void mo7892a() {
        this.f6842f = true;
        this.f6840d.mo7797d();
    }

    /* renamed from: b */
    public int mo7840b() {
        return this.f6838b.ordinal();
    }

    public void run() {
        C2006l<?> lVar;
        Exception exc = null;
        if (!this.f6842f) {
            try {
                lVar = m11831d();
            } catch (Exception e) {
                if (Log.isLoggable(f6837a, 2)) {
                    Log.v(f6837a, "Exception decoding", e);
                }
                exc = e;
                lVar = null;
            }
            if (this.f6842f) {
                if (lVar != null) {
                    lVar.mo7889d();
                }
            } else if (lVar == null) {
                m11829a(exc);
            } else {
                m11828a((C2006l) lVar);
            }
        }
    }
}
