package android.support.p010v4.p014d;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.support.annotation.C0011ag;
import android.util.Log;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: android.support.v4.d.s */
abstract class C0461s<Params, Progress, Result> {

    /* renamed from: a */
    private static final String f2017a = "AsyncTask";

    /* renamed from: b */
    private static final int f2018b = 5;

    /* renamed from: c */
    public static final Executor f2019c = new ThreadPoolExecutor(5, 128, 1, TimeUnit.SECONDS, f2023g, f2022f);

    /* renamed from: d */
    private static final int f2020d = 128;

    /* renamed from: e */
    private static final int f2021e = 1;

    /* renamed from: f */
    private static final ThreadFactory f2022f = new ThreadFactory() {

        /* renamed from: a */
        private final AtomicInteger f2033a = new AtomicInteger(1);

        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "ModernAsyncTask #" + this.f2033a.getAndIncrement());
        }
    };

    /* renamed from: g */
    private static final BlockingQueue<Runnable> f2023g = new LinkedBlockingQueue(10);

    /* renamed from: h */
    private static final int f2024h = 1;

    /* renamed from: i */
    private static final int f2025i = 2;

    /* renamed from: j */
    private static C0467b f2026j;

    /* renamed from: k */
    private static volatile Executor f2027k = f2019c;

    /* renamed from: l */
    private final C0469d<Params, Result> f2028l = new C0469d<Params, Result>() {
        public Result call() {
            C0461s.this.f2032p.set(true);
            Result result = null;
            try {
                Process.setThreadPriority(10);
                result = C0461s.this.mo1717a((Params[]) this.f2043b);
                Binder.flushPendingCommands();
                C0461s.this.mo1798d(result);
                return result;
            } catch (Throwable th) {
                C0461s.this.mo1798d(result);
                throw th;
            }
        }
    };

    /* renamed from: m */
    private final FutureTask<Result> f2029m = new FutureTask<Result>(this.f2028l) {
        /* access modifiers changed from: protected */
        public void done() {
            try {
                C0461s.this.mo1797c(get());
            } catch (InterruptedException e) {
                Log.w(C0461s.f2017a, e);
            } catch (ExecutionException e2) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e2.getCause());
            } catch (CancellationException e3) {
                C0461s.this.mo1797c(null);
            } catch (Throwable th) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th);
            }
        }
    };

    /* renamed from: n */
    private volatile C0468c f2030n = C0468c.PENDING;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final AtomicBoolean f2031o = new AtomicBoolean();
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final AtomicBoolean f2032p = new AtomicBoolean();

    /* renamed from: android.support.v4.d.s$a */
    private static class C0466a<Data> {

        /* renamed from: a */
        final C0461s f2037a;

        /* renamed from: b */
        final Data[] f2038b;

        C0466a(C0461s sVar, Data... dataArr) {
            this.f2037a = sVar;
            this.f2038b = dataArr;
        }
    }

    /* renamed from: android.support.v4.d.s$b */
    private static class C0467b extends Handler {
        public C0467b() {
            super(Looper.getMainLooper());
        }

        public void handleMessage(Message message) {
            C0466a aVar = (C0466a) message.obj;
            switch (message.what) {
                case 1:
                    aVar.f2037a.mo1801e(aVar.f2038b[0]);
                    return;
                case 2:
                    aVar.f2037a.mo1794b((Progress[]) aVar.f2038b);
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: android.support.v4.d.s$c */
    public enum C0468c {
        PENDING,
        RUNNING,
        FINISHED
    }

    /* renamed from: android.support.v4.d.s$d */
    private static abstract class C0469d<Params, Result> implements Callable<Result> {

        /* renamed from: b */
        Params[] f2043b;

        C0469d() {
        }
    }

    /* renamed from: a */
    private static Handler mo1719a() {
        C0467b bVar;
        synchronized (C0461s.class) {
            if (f2026j == null) {
                f2026j = new C0467b();
            }
            bVar = f2026j;
        }
        return bVar;
    }

    /* renamed from: a */
    public static void m2491a(Runnable runnable) {
        f2027k.execute(runnable);
    }

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    /* renamed from: a */
    public static void m2492a(Executor executor) {
        f2027k = executor;
    }

    /* renamed from: a */
    public final C0461s<Params, Progress, Result> mo1790a(Executor executor, Params... paramsArr) {
        if (this.f2030n != C0468c.PENDING) {
            switch (this.f2030n) {
                case RUNNING:
                    throw new IllegalStateException("Cannot execute task: the task is already running.");
                case FINISHED:
                    throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
        }
        this.f2030n = C0468c.RUNNING;
        mo1796c();
        this.f2028l.f2043b = paramsArr;
        executor.execute(this.f2029m);
        return this;
    }

    /* renamed from: a */
    public final Result mo1791a(long j, TimeUnit timeUnit) {
        return this.f2029m.get(j, timeUnit);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Result mo1717a(Params... paramsArr);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1720a(Result result) {
    }

    /* renamed from: a */
    public final boolean mo1792a(boolean z) {
        this.f2031o.set(true);
        return this.f2029m.cancel(z);
    }

    /* renamed from: b */
    public final C0468c mo1793b() {
        return this.f2030n;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo1721b(Result result) {
        mo1799d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo1794b(Progress... progressArr) {
    }

    /* renamed from: c */
    public final C0461s<Params, Progress, Result> mo1795c(Params... paramsArr) {
        return mo1790a(f2027k, paramsArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo1796c() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo1797c(Result result) {
        if (!this.f2032p.get()) {
            mo1798d(result);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Result mo1798d(Result result) {
        mo1719a().obtainMessage(1, new C0466a(this, result)).sendToTarget();
        return result;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo1799d() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo1800d(Progress... progressArr) {
        if (!mo1802e()) {
            mo1719a().obtainMessage(2, new C0466a(this, progressArr)).sendToTarget();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo1801e(Result result) {
        if (mo1802e()) {
            mo1721b(result);
        } else {
            mo1720a(result);
        }
        this.f2030n = C0468c.FINISHED;
    }

    /* renamed from: e */
    public final boolean mo1802e() {
        return this.f2031o.get();
    }

    /* renamed from: f */
    public final Result mo1803f() {
        return this.f2029m.get();
    }
}
