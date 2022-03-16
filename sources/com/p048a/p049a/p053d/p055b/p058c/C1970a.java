package com.p048a.p049a.p053d.p055b.p058c;

import android.os.Process;
import android.util.Log;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.a.a.d.b.c.a */
public class C1970a extends ThreadPoolExecutor {

    /* renamed from: a */
    private static final String f6735a = "PriorityExecutor";

    /* renamed from: b */
    private final AtomicInteger f6736b;

    /* renamed from: c */
    private final C1975c f6737c;

    /* renamed from: com.a.a.d.b.c.a$a */
    public static class C1972a implements ThreadFactory {

        /* renamed from: a */
        int f6738a = 0;

        public Thread newThread(Runnable runnable) {
            C19731 r0 = new Thread(runnable, "fifo-pool-thread-" + this.f6738a) {
                public void run() {
                    Process.setThreadPriority(10);
                    super.run();
                }
            };
            this.f6738a++;
            return r0;
        }
    }

    /* renamed from: com.a.a.d.b.c.a$b */
    static class C1974b<T> extends FutureTask<T> implements Comparable<C1974b<?>> {

        /* renamed from: a */
        private final int f6740a;

        /* renamed from: b */
        private final int f6741b;

        public C1974b(Runnable runnable, T t, int i) {
            super(runnable, t);
            if (!(runnable instanceof C1978b)) {
                throw new IllegalArgumentException("FifoPriorityThreadPoolExecutor must be given Runnables that implement Prioritized");
            }
            this.f6740a = ((C1978b) runnable).mo7840b();
            this.f6741b = i;
        }

        /* renamed from: a */
        public int compareTo(C1974b<?> bVar) {
            int i = this.f6740a - bVar.f6740a;
            return i == 0 ? this.f6741b - bVar.f6741b : i;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C1974b)) {
                return false;
            }
            C1974b bVar = (C1974b) obj;
            return this.f6741b == bVar.f6741b && this.f6740a == bVar.f6740a;
        }

        public int hashCode() {
            return (this.f6740a * 31) + this.f6741b;
        }
    }

    /* renamed from: com.a.a.d.b.c.a$c */
    public enum C1975c {
        IGNORE,
        LOG {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo7839a(Throwable th) {
                if (Log.isLoggable(C1970a.f6735a, 6)) {
                    Log.e(C1970a.f6735a, "Request threw uncaught throwable", th);
                }
            }
        },
        THROW {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo7839a(Throwable th) {
                super.mo7839a(th);
                throw new RuntimeException(th);
            }
        };

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo7839a(Throwable th) {
        }
    }

    public C1970a(int i) {
        this(i, C1975c.LOG);
    }

    public C1970a(int i, int i2, long j, TimeUnit timeUnit, ThreadFactory threadFactory, C1975c cVar) {
        super(i, i2, j, timeUnit, new PriorityBlockingQueue(), threadFactory);
        this.f6736b = new AtomicInteger();
        this.f6737c = cVar;
    }

    public C1970a(int i, C1975c cVar) {
        this(i, i, 0, TimeUnit.MILLISECONDS, new C1972a(), cVar);
    }

    /* access modifiers changed from: protected */
    public void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
        if (th == null && (runnable instanceof Future)) {
            Future future = (Future) runnable;
            if (future.isDone() && !future.isCancelled()) {
                try {
                    future.get();
                } catch (InterruptedException e) {
                    this.f6737c.mo7839a(e);
                } catch (ExecutionException e2) {
                    this.f6737c.mo7839a(e2);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
        return new C1974b(runnable, t, this.f6736b.getAndIncrement());
    }
}
