package com.p048a.p049a.p053d.p055b;

import android.os.Looper;
import android.os.MessageQueue;
import android.util.Log;
import com.p048a.p049a.C2255p;
import com.p048a.p049a.p053d.C2010c;
import com.p048a.p049a.p053d.C2146g;
import com.p048a.p049a.p053d.p054a.C1897c;
import com.p048a.p049a.p053d.p055b.C1940b;
import com.p048a.p049a.p053d.p055b.C2000i;
import com.p048a.p049a.p053d.p055b.p057b.C1944a;
import com.p048a.p049a.p053d.p055b.p057b.C1947b;
import com.p048a.p049a.p053d.p055b.p057b.C1962i;
import com.p048a.p049a.p053d.p063d.p070g.C2141f;
import com.p048a.p049a.p073g.C2173b;
import com.p048a.p049a.p074h.C2222g;
import com.p048a.p049a.p078j.C2234e;
import com.p048a.p049a.p078j.C2238i;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* renamed from: com.a.a.d.b.d */
public class C1979d implements C1962i.C1963a, C1997f, C2000i.C2001a {

    /* renamed from: a */
    private static final String f6746a = "Engine";

    /* renamed from: b */
    private final Map<C2010c, C1993e> f6747b;

    /* renamed from: c */
    private final C1999h f6748c;

    /* renamed from: d */
    private final C1962i f6749d;

    /* renamed from: e */
    private final C1980a f6750e;

    /* renamed from: f */
    private final Map<C2010c, WeakReference<C2000i<?>>> f6751f;

    /* renamed from: g */
    private final C2007m f6752g;

    /* renamed from: h */
    private final C1981b f6753h;

    /* renamed from: i */
    private ReferenceQueue<C2000i<?>> f6754i;

    /* renamed from: com.a.a.d.b.d$a */
    static class C1980a {

        /* renamed from: a */
        private final ExecutorService f6755a;

        /* renamed from: b */
        private final ExecutorService f6756b;

        /* renamed from: c */
        private final C1997f f6757c;

        public C1980a(ExecutorService executorService, ExecutorService executorService2, C1997f fVar) {
            this.f6755a = executorService;
            this.f6756b = executorService2;
            this.f6757c = fVar;
        }

        /* renamed from: a */
        public C1993e mo7847a(C2010c cVar, boolean z) {
            return new C1993e(cVar, this.f6755a, this.f6756b, z, this.f6757c);
        }
    }

    /* renamed from: com.a.a.d.b.d$b */
    private static class C1981b implements C1940b.C1941a {

        /* renamed from: a */
        private final C1944a.C1945a f6758a;

        /* renamed from: b */
        private volatile C1944a f6759b;

        public C1981b(C1944a.C1945a aVar) {
            this.f6758a = aVar;
        }

        /* renamed from: a */
        public C1944a mo7798a() {
            if (this.f6759b == null) {
                synchronized (this) {
                    if (this.f6759b == null) {
                        this.f6759b = this.f6758a.mo7805a();
                    }
                    if (this.f6759b == null) {
                        this.f6759b = new C1947b();
                    }
                }
            }
            return this.f6759b;
        }
    }

    /* renamed from: com.a.a.d.b.d$c */
    public static class C1982c {

        /* renamed from: a */
        private final C1993e f6760a;

        /* renamed from: b */
        private final C2222g f6761b;

        public C1982c(C2222g gVar, C1993e eVar) {
            this.f6761b = gVar;
            this.f6760a = eVar;
        }

        /* renamed from: a */
        public void mo7848a() {
            this.f6760a.mo7876b(this.f6761b);
        }
    }

    /* renamed from: com.a.a.d.b.d$d */
    private static class C1983d implements MessageQueue.IdleHandler {

        /* renamed from: a */
        private final Map<C2010c, WeakReference<C2000i<?>>> f6762a;

        /* renamed from: b */
        private final ReferenceQueue<C2000i<?>> f6763b;

        public C1983d(Map<C2010c, WeakReference<C2000i<?>>> map, ReferenceQueue<C2000i<?>> referenceQueue) {
            this.f6762a = map;
            this.f6763b = referenceQueue;
        }

        public boolean queueIdle() {
            C1984e eVar = (C1984e) this.f6763b.poll();
            if (eVar == null) {
                return true;
            }
            this.f6762a.remove(eVar.f6764a);
            return true;
        }
    }

    /* renamed from: com.a.a.d.b.d$e */
    private static class C1984e extends WeakReference<C2000i<?>> {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C2010c f6764a;

        public C1984e(C2010c cVar, C2000i<?> iVar, ReferenceQueue<? super C2000i<?>> referenceQueue) {
            super(iVar, referenceQueue);
            this.f6764a = cVar;
        }
    }

    public C1979d(C1962i iVar, C1944a.C1945a aVar, ExecutorService executorService, ExecutorService executorService2) {
        this(iVar, aVar, executorService, executorService2, (Map<C2010c, C1993e>) null, (C1999h) null, (Map<C2010c, WeakReference<C2000i<?>>>) null, (C1980a) null, (C2007m) null);
    }

    C1979d(C1962i iVar, C1944a.C1945a aVar, ExecutorService executorService, ExecutorService executorService2, Map<C2010c, C1993e> map, C1999h hVar, Map<C2010c, WeakReference<C2000i<?>>> map2, C1980a aVar2, C2007m mVar) {
        this.f6749d = iVar;
        this.f6753h = new C1981b(aVar);
        this.f6751f = map2 == null ? new HashMap<>() : map2;
        this.f6748c = hVar == null ? new C1999h() : hVar;
        this.f6747b = map == null ? new HashMap<>() : map;
        this.f6750e = aVar2 == null ? new C1980a(executorService, executorService2, this) : aVar2;
        this.f6752g = mVar == null ? new C2007m() : mVar;
        iVar.mo7815a((C1962i.C1963a) this);
    }

    /* renamed from: a */
    private C2000i<?> m11762a(C2010c cVar) {
        C2006l<?> a = this.f6749d.mo7813a(cVar);
        if (a == null) {
            return null;
        }
        return a instanceof C2000i ? (C2000i) a : new C2000i<>(a, true);
    }

    /* renamed from: a */
    private C2000i<?> m11763a(C2010c cVar, boolean z) {
        C2000i<?> iVar;
        if (!z) {
            return null;
        }
        WeakReference weakReference = this.f6751f.get(cVar);
        if (weakReference != null) {
            iVar = (C2000i) weakReference.get();
            if (iVar != null) {
                iVar.mo7890e();
            } else {
                this.f6751f.remove(cVar);
            }
        } else {
            iVar = null;
        }
        return iVar;
    }

    /* renamed from: a */
    private static void m11764a(String str, long j, C2010c cVar) {
        Log.v(f6746a, str + " in " + C2234e.m12705a(j) + "ms, key: " + cVar);
    }

    /* renamed from: b */
    private C2000i<?> m11765b(C2010c cVar, boolean z) {
        if (!z) {
            return null;
        }
        C2000i<?> a = m11762a(cVar);
        if (a == null) {
            return a;
        }
        a.mo7890e();
        this.f6751f.put(cVar, new C1984e(cVar, a, m11766b()));
        return a;
    }

    /* renamed from: b */
    private ReferenceQueue<C2000i<?>> m11766b() {
        if (this.f6754i == null) {
            this.f6754i = new ReferenceQueue<>();
            Looper.myQueue().addIdleHandler(new C1983d(this.f6751f, this.f6754i));
        }
        return this.f6754i;
    }

    /* renamed from: a */
    public <T, Z, R> C1982c mo7841a(C2010c cVar, int i, int i2, C1897c<T> cVar2, C2173b<T, Z> bVar, C2146g<Z> gVar, C2141f<Z, R> fVar, C2255p pVar, boolean z, C1969c cVar3, C2222g gVar2) {
        C2238i.m12729a();
        long a = C2234e.m12706a();
        C1998g a2 = this.f6748c.mo7884a(cVar2.mo7714b(), cVar, i, i2, bVar.mo7959a(), bVar.mo7960b(), gVar, bVar.mo7962d(), fVar, bVar.mo7961c());
        C2000i<?> b = m11765b((C2010c) a2, z);
        if (b != null) {
            gVar2.mo7872a((C2006l<?>) b);
            if (Log.isLoggable(f6746a, 2)) {
                m11764a("Loaded resource from cache", a, a2);
            }
            return null;
        }
        C2000i<?> a3 = m11763a((C2010c) a2, z);
        if (a3 != null) {
            gVar2.mo7872a((C2006l<?>) a3);
            if (Log.isLoggable(f6746a, 2)) {
                m11764a("Loaded resource from active resources", a, a2);
            }
            return null;
        }
        C1993e eVar = this.f6747b.get(a2);
        if (eVar != null) {
            eVar.mo7873a(gVar2);
            if (Log.isLoggable(f6746a, 2)) {
                m11764a("Added to existing load", a, a2);
            }
            return new C1982c(gVar2, eVar);
        }
        C1993e a4 = this.f6750e.mo7847a(a2, z);
        C2002j jVar = new C2002j(a4, new C1940b(a2, i, i2, cVar2, bVar, gVar, fVar, this.f6753h, cVar3, pVar), pVar);
        this.f6747b.put(a2, a4);
        a4.mo7873a(gVar2);
        a4.mo7871a(jVar);
        if (Log.isLoggable(f6746a, 2)) {
            m11764a("Started new load", a, a2);
        }
        return new C1982c(gVar2, a4);
    }

    /* renamed from: a */
    public void mo7842a() {
        this.f6753h.mo7798a().mo7802a();
    }

    /* renamed from: a */
    public void mo7843a(C1993e eVar, C2010c cVar) {
        C2238i.m12729a();
        if (eVar.equals(this.f6747b.get(cVar))) {
            this.f6747b.remove(cVar);
        }
    }

    /* renamed from: a */
    public void mo7844a(C2006l lVar) {
        C2238i.m12729a();
        if (lVar instanceof C2000i) {
            ((C2000i) lVar).mo7891f();
            return;
        }
        throw new IllegalArgumentException("Cannot release anything but an EngineResource");
    }

    /* renamed from: a */
    public void mo7845a(C2010c cVar, C2000i<?> iVar) {
        C2238i.m12729a();
        if (iVar != null) {
            iVar.mo7885a(cVar, this);
            if (iVar.mo7886a()) {
                this.f6751f.put(cVar, new C1984e(cVar, iVar, m11766b()));
            }
        }
        this.f6747b.remove(cVar);
    }

    /* renamed from: b */
    public void mo7823b(C2006l<?> lVar) {
        C2238i.m12729a();
        this.f6752g.mo7894a(lVar);
    }

    /* renamed from: b */
    public void mo7846b(C2010c cVar, C2000i iVar) {
        C2238i.m12729a();
        this.f6751f.remove(cVar);
        if (iVar.mo7886a()) {
            this.f6749d.mo7818b(cVar, iVar);
        } else {
            this.f6752g.mo7894a(iVar);
        }
    }
}
