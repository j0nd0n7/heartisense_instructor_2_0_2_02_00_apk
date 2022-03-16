package android.support.p010v4.p014d;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.support.annotation.C0011ag;
import android.support.p010v4.p028k.C0807i;
import android.support.p010v4.p033o.C0902q;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* renamed from: android.support.v4.d.a */
public abstract class C0413a<D> extends C0453q<D> {

    /* renamed from: a */
    static final String f1940a = "AsyncTaskLoader";

    /* renamed from: b */
    static final boolean f1941b = false;

    /* renamed from: c */
    volatile C0413a<D>.a f1942c;

    /* renamed from: d */
    volatile C0413a<D>.a f1943d;

    /* renamed from: e */
    long f1944e;

    /* renamed from: f */
    long f1945f;

    /* renamed from: g */
    Handler f1946g;

    /* renamed from: h */
    private final Executor f1947h;

    /* renamed from: android.support.v4.d.a$a */
    final class C0414a extends C0461s<Void, Void, D> implements Runnable {

        /* renamed from: a */
        boolean f1948a;

        /* renamed from: d */
        private final CountDownLatch f1950d = new CountDownLatch(1);

        C0414a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public D mo1717a(Void... voidArr) {
            try {
                return C0413a.this.mo1713e();
            } catch (C0807i e) {
                if (mo1802e()) {
                    return null;
                }
                throw e;
            }
        }

        /* renamed from: a */
        public void mo1719a() {
            try {
                this.f1950d.await();
            } catch (InterruptedException e) {
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo1720a(D d) {
            try {
                C0413a.this.mo1709b(this, d);
            } finally {
                this.f1950d.countDown();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo1721b(D d) {
            try {
                C0413a.this.mo1706a(this, d);
            } finally {
                this.f1950d.countDown();
            }
        }

        public void run() {
            this.f1948a = false;
            C0413a.this.mo1711c();
        }
    }

    public C0413a(Context context) {
        this(context, C0461s.f2019c);
    }

    private C0413a(Context context, Executor executor) {
        super(context);
        this.f1945f = -10000;
        this.f1947h = executor;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1704a() {
        super.mo1704a();
        mo1780y();
        this.f1942c = new C0414a();
        mo1711c();
    }

    /* renamed from: a */
    public void mo1705a(long j) {
        this.f1944e = j;
        if (j != 0) {
            this.f1946g = new Handler();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1706a(C0413a<D>.a aVar, D d) {
        mo1707a(d);
        if (this.f1943d == aVar) {
            mo1765G();
            this.f1945f = SystemClock.uptimeMillis();
            this.f1943d = null;
            mo1772r();
            mo1711c();
        }
    }

    /* renamed from: a */
    public void mo1707a(D d) {
    }

    /* renamed from: a */
    public void mo1708a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.mo1708a(str, fileDescriptor, printWriter, strArr);
        if (this.f1942c != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.f1942c);
            printWriter.print(" waiting=");
            printWriter.println(this.f1942c.f1948a);
        }
        if (this.f1943d != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.f1943d);
            printWriter.print(" waiting=");
            printWriter.println(this.f1943d.f1948a);
        }
        if (this.f1944e != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            C0902q.m4526a(this.f1944e, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            C0902q.m4525a(this.f1945f, SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo1709b(C0413a<D>.a aVar, D d) {
        if (this.f1942c != aVar) {
            mo1706a(aVar, d);
        } else if (mo1777v()) {
            mo1707a(d);
        } else {
            mo1764F();
            this.f1945f = SystemClock.uptimeMillis();
            this.f1942c = null;
            mo1733b(d);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo1710b() {
        boolean z = false;
        if (this.f1942c != null) {
            if (!this.f1995t) {
                this.f1998w = true;
            }
            if (this.f1943d != null) {
                if (this.f1942c.f1948a) {
                    this.f1942c.f1948a = false;
                    this.f1946g.removeCallbacks(this.f1942c);
                }
                this.f1942c = null;
            } else if (this.f1942c.f1948a) {
                this.f1942c.f1948a = false;
                this.f1946g.removeCallbacks(this.f1942c);
                this.f1942c = null;
            } else {
                z = this.f1942c.mo1792a(false);
                if (z) {
                    this.f1943d = this.f1942c;
                    mo1714f();
                }
                this.f1942c = null;
            }
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo1711c() {
        if (this.f1943d == null && this.f1942c != null) {
            if (this.f1942c.f1948a) {
                this.f1942c.f1948a = false;
                this.f1946g.removeCallbacks(this.f1942c);
            }
            if (this.f1944e <= 0 || SystemClock.uptimeMillis() >= this.f1945f + this.f1944e) {
                this.f1942c.mo1790a(this.f1947h, (Params[]) null);
                return;
            }
            this.f1942c.f1948a = true;
            this.f1946g.postAtTime(this.f1942c, this.f1945f + this.f1944e);
        }
    }

    /* renamed from: d */
    public abstract D mo1712d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public D mo1713e() {
        return mo1712d();
    }

    /* renamed from: f */
    public void mo1714f() {
    }

    /* renamed from: g */
    public boolean mo1715g() {
        return this.f1943d != null;
    }

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    /* renamed from: h */
    public void mo1716h() {
        C0413a<D>.a aVar = this.f1942c;
        if (aVar != null) {
            aVar.mo1719a();
        }
    }
}
