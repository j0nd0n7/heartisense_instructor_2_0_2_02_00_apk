package com.p048a.p049a.p053d.p055b;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.p048a.p049a.p053d.C2010c;
import com.p048a.p049a.p053d.p055b.C2002j;
import com.p048a.p049a.p074h.C2222g;
import com.p048a.p049a.p078j.C2238i;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* renamed from: com.a.a.d.b.e */
class C1993e implements C2002j.C2003a {

    /* renamed from: a */
    private static final C1995a f6797a = new C1995a();

    /* renamed from: b */
    private static final Handler f6798b = new Handler(Looper.getMainLooper(), new C1996b());

    /* renamed from: c */
    private static final int f6799c = 1;

    /* renamed from: d */
    private static final int f6800d = 2;

    /* renamed from: e */
    private final List<C2222g> f6801e;

    /* renamed from: f */
    private final C1995a f6802f;

    /* renamed from: g */
    private final C1997f f6803g;

    /* renamed from: h */
    private final C2010c f6804h;

    /* renamed from: i */
    private final ExecutorService f6805i;

    /* renamed from: j */
    private final ExecutorService f6806j;

    /* renamed from: k */
    private final boolean f6807k;

    /* renamed from: l */
    private boolean f6808l;

    /* renamed from: m */
    private C2006l<?> f6809m;

    /* renamed from: n */
    private boolean f6810n;

    /* renamed from: o */
    private Exception f6811o;

    /* renamed from: p */
    private boolean f6812p;

    /* renamed from: q */
    private Set<C2222g> f6813q;

    /* renamed from: r */
    private C2002j f6814r;

    /* renamed from: s */
    private C2000i<?> f6815s;

    /* renamed from: t */
    private volatile Future<?> f6816t;

    /* renamed from: com.a.a.d.b.e$a */
    static class C1995a {
        C1995a() {
        }

        /* renamed from: a */
        public <R> C2000i<R> mo7878a(C2006l<R> lVar, boolean z) {
            return new C2000i<>(lVar, z);
        }
    }

    /* renamed from: com.a.a.d.b.e$b */
    private static class C1996b implements Handler.Callback {
        private C1996b() {
        }

        public boolean handleMessage(Message message) {
            if (1 != message.what && 2 != message.what) {
                return false;
            }
            C1993e eVar = (C1993e) message.obj;
            if (1 == message.what) {
                eVar.m11802c();
            } else {
                eVar.m11804d();
            }
            return true;
        }
    }

    public C1993e(C2010c cVar, ExecutorService executorService, ExecutorService executorService2, boolean z, C1997f fVar) {
        this(cVar, executorService, executorService2, z, fVar, f6797a);
    }

    public C1993e(C2010c cVar, ExecutorService executorService, ExecutorService executorService2, boolean z, C1997f fVar, C1995a aVar) {
        this.f6801e = new ArrayList();
        this.f6804h = cVar;
        this.f6805i = executorService;
        this.f6806j = executorService2;
        this.f6807k = z;
        this.f6803g = fVar;
        this.f6802f = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m11802c() {
        if (this.f6808l) {
            this.f6809m.mo7889d();
        } else if (this.f6801e.isEmpty()) {
            throw new IllegalStateException("Received a resource without any callbacks to notify");
        } else {
            this.f6815s = this.f6802f.mo7878a(this.f6809m, this.f6807k);
            this.f6810n = true;
            this.f6815s.mo7890e();
            this.f6803g.mo7845a(this.f6804h, this.f6815s);
            for (C2222g next : this.f6801e) {
                if (!m11805d(next)) {
                    this.f6815s.mo7890e();
                    next.mo7872a((C2006l<?>) this.f6815s);
                }
            }
            this.f6815s.mo7891f();
        }
    }

    /* renamed from: c */
    private void m11803c(C2222g gVar) {
        if (this.f6813q == null) {
            this.f6813q = new HashSet();
        }
        this.f6813q.add(gVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m11804d() {
        if (!this.f6808l) {
            if (this.f6801e.isEmpty()) {
                throw new IllegalStateException("Received an exception without any callbacks to notify");
            }
            this.f6812p = true;
            this.f6803g.mo7845a(this.f6804h, (C2000i<?>) null);
            for (C2222g next : this.f6801e) {
                if (!m11805d(next)) {
                    next.mo7874a(this.f6811o);
                }
            }
        }
    }

    /* renamed from: d */
    private boolean m11805d(C2222g gVar) {
        return this.f6813q != null && this.f6813q.contains(gVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7870a() {
        if (!this.f6812p && !this.f6810n && !this.f6808l) {
            this.f6814r.mo7892a();
            Future<?> future = this.f6816t;
            if (future != null) {
                future.cancel(true);
            }
            this.f6808l = true;
            this.f6803g.mo7843a(this, this.f6804h);
        }
    }

    /* renamed from: a */
    public void mo7871a(C2002j jVar) {
        this.f6814r = jVar;
        this.f6816t = this.f6805i.submit(jVar);
    }

    /* renamed from: a */
    public void mo7872a(C2006l<?> lVar) {
        this.f6809m = lVar;
        f6798b.obtainMessage(1, this).sendToTarget();
    }

    /* renamed from: a */
    public void mo7873a(C2222g gVar) {
        C2238i.m12729a();
        if (this.f6810n) {
            gVar.mo7872a((C2006l<?>) this.f6815s);
        } else if (this.f6812p) {
            gVar.mo7874a(this.f6811o);
        } else {
            this.f6801e.add(gVar);
        }
    }

    /* renamed from: a */
    public void mo7874a(Exception exc) {
        this.f6811o = exc;
        f6798b.obtainMessage(2, this).sendToTarget();
    }

    /* renamed from: b */
    public void mo7875b(C2002j jVar) {
        this.f6816t = this.f6806j.submit(jVar);
    }

    /* renamed from: b */
    public void mo7876b(C2222g gVar) {
        C2238i.m12729a();
        if (this.f6810n || this.f6812p) {
            m11803c(gVar);
            return;
        }
        this.f6801e.remove(gVar);
        if (this.f6801e.isEmpty()) {
            mo7870a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo7877b() {
        return this.f6808l;
    }
}
