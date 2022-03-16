package com.p048a.p049a.p074h;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import com.p048a.p049a.p074h.p075a.C2185c;
import com.p048a.p049a.p074h.p076b.C2210k;
import com.p048a.p049a.p078j.C2238i;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.a.a.h.e */
public class C2219e<T, R> implements C2181a<R>, Runnable {

    /* renamed from: b */
    private static final C2220a f7285b = new C2220a();

    /* renamed from: c */
    private final Handler f7286c;

    /* renamed from: d */
    private final int f7287d;

    /* renamed from: e */
    private final int f7288e;

    /* renamed from: f */
    private final boolean f7289f;

    /* renamed from: g */
    private final C2220a f7290g;

    /* renamed from: h */
    private R f7291h;

    /* renamed from: i */
    private C2217c f7292i;

    /* renamed from: j */
    private boolean f7293j;

    /* renamed from: k */
    private Exception f7294k;

    /* renamed from: l */
    private boolean f7295l;

    /* renamed from: m */
    private boolean f7296m;

    /* renamed from: com.a.a.h.e$a */
    static class C2220a {
        C2220a() {
        }

        /* renamed from: a */
        public void mo8267a(Object obj) {
            obj.notifyAll();
        }

        /* renamed from: a */
        public void mo8268a(Object obj, long j) {
            obj.wait(j);
        }
    }

    public C2219e(Handler handler, int i, int i2) {
        this(handler, i, i2, true, f7285b);
    }

    C2219e(Handler handler, int i, int i2, boolean z, C2220a aVar) {
        this.f7286c = handler;
        this.f7287d = i;
        this.f7288e = i2;
        this.f7289f = z;
        this.f7290g = aVar;
    }

    /* renamed from: a */
    private synchronized R m12569a(Long l) {
        R r;
        if (this.f7289f) {
            C2238i.m12733b();
        }
        if (this.f7293j) {
            throw new CancellationException();
        } else if (this.f7296m) {
            throw new ExecutionException(this.f7294k);
        } else if (this.f7295l) {
            r = this.f7291h;
        } else {
            if (l == null) {
                this.f7290g.mo8268a(this, 0);
            } else if (l.longValue() > 0) {
                this.f7290g.mo8268a(this, l.longValue());
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            } else if (this.f7296m) {
                throw new ExecutionException(this.f7294k);
            } else if (this.f7293j) {
                throw new CancellationException();
            } else if (!this.f7295l) {
                throw new TimeoutException();
            } else {
                r = this.f7291h;
            }
        }
        return r;
    }

    /* renamed from: a */
    public void mo8186a() {
        this.f7286c.post(this);
    }

    /* renamed from: a */
    public void mo8208a(Drawable drawable) {
    }

    /* renamed from: a */
    public void mo8220a(C2210k kVar) {
        kVar.mo8196a(this.f7287d, this.f7288e);
    }

    /* renamed from: a */
    public void mo8209a(C2217c cVar) {
        this.f7292i = cVar;
    }

    /* renamed from: a */
    public synchronized void mo8210a(Exception exc, Drawable drawable) {
        this.f7296m = true;
        this.f7294k = exc;
        this.f7290g.mo8267a(this);
    }

    /* renamed from: a */
    public synchronized void mo8051a(R r, C2185c<? super R> cVar) {
        this.f7295l = true;
        this.f7291h = r;
        this.f7290g.mo8267a(this);
    }

    /* renamed from: b */
    public void mo8211b(Drawable drawable) {
    }

    public synchronized boolean cancel(boolean z) {
        boolean z2 = true;
        synchronized (this) {
            if (!this.f7293j) {
                if (isDone()) {
                    z2 = false;
                }
                if (z2) {
                    this.f7293j = true;
                    if (z) {
                        mo8186a();
                    }
                    this.f7290g.mo8267a(this);
                }
            }
        }
        return z2;
    }

    /* renamed from: d_ */
    public C2217c mo8212d_() {
        return this.f7292i;
    }

    /* renamed from: g */
    public void mo8089g() {
    }

    public R get() {
        try {
            return m12569a((Long) null);
        } catch (TimeoutException e) {
            throw new AssertionError(e);
        }
    }

    public R get(long j, TimeUnit timeUnit) {
        return m12569a(Long.valueOf(timeUnit.toMillis(j)));
    }

    /* renamed from: h */
    public void mo8090h() {
    }

    /* renamed from: i */
    public void mo8091i() {
    }

    public synchronized boolean isCancelled() {
        return this.f7293j;
    }

    public synchronized boolean isDone() {
        return this.f7293j || this.f7295l;
    }

    public void run() {
        if (this.f7292i != null) {
            this.f7292i.mo8199d();
            cancel(false);
        }
    }
}
