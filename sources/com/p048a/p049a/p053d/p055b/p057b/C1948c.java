package com.p048a.p049a.p053d.p055b.p057b;

import com.p048a.p049a.p053d.C2010c;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.a.a.d.b.b.c */
final class C1948c {

    /* renamed from: a */
    private final Map<C2010c, C1950a> f6691a = new HashMap();

    /* renamed from: b */
    private final C1951b f6692b = new C1951b();

    /* renamed from: com.a.a.d.b.b.c$a */
    private static class C1950a {

        /* renamed from: a */
        final Lock f6693a;

        /* renamed from: b */
        int f6694b;

        private C1950a() {
            this.f6693a = new ReentrantLock();
        }
    }

    /* renamed from: com.a.a.d.b.b.c$b */
    private static class C1951b {

        /* renamed from: a */
        private static final int f6695a = 10;

        /* renamed from: b */
        private final Queue<C1950a> f6696b;

        private C1951b() {
            this.f6696b = new ArrayDeque();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C1950a mo7808a() {
            C1950a poll;
            synchronized (this.f6696b) {
                poll = this.f6696b.poll();
            }
            return poll == null ? new C1950a() : poll;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo7809a(C1950a aVar) {
            synchronized (this.f6696b) {
                if (this.f6696b.size() < 10) {
                    this.f6696b.offer(aVar);
                }
            }
        }
    }

    C1948c() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7806a(C2010c cVar) {
        C1950a aVar;
        synchronized (this) {
            aVar = this.f6691a.get(cVar);
            if (aVar == null) {
                aVar = this.f6692b.mo7808a();
                this.f6691a.put(cVar, aVar);
            }
            aVar.f6694b++;
        }
        aVar.f6693a.lock();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo7807b(C2010c cVar) {
        C1950a aVar;
        synchronized (this) {
            aVar = this.f6691a.get(cVar);
            if (aVar == null || aVar.f6694b <= 0) {
                throw new IllegalArgumentException("Cannot release a lock that is not held, key: " + cVar + ", interestedThreads: " + (aVar == null ? 0 : aVar.f6694b));
            }
            int i = aVar.f6694b - 1;
            aVar.f6694b = i;
            if (i == 0) {
                C1950a remove = this.f6691a.remove(cVar);
                if (!remove.equals(aVar)) {
                    throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + remove + ", key: " + cVar);
                }
                this.f6692b.mo7809a(remove);
            }
        }
        aVar.f6693a.unlock();
    }
}
