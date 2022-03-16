package android.support.p010v4.p028k;

import android.os.Build;

/* renamed from: android.support.v4.k.d */
public final class C0799d {

    /* renamed from: a */
    private boolean f2872a;

    /* renamed from: b */
    private C0800a f2873b;

    /* renamed from: c */
    private Object f2874c;

    /* renamed from: d */
    private boolean f2875d;

    /* renamed from: android.support.v4.k.d$a */
    public interface C0800a {
        /* renamed from: a */
        void mo2671a();
    }

    /* renamed from: e */
    private void m4075e() {
        while (this.f2875d) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2666a(android.support.p010v4.p028k.C0799d.C0800a r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            r1.m4075e()     // Catch:{ all -> 0x0014 }
            android.support.v4.k.d$a r0 = r1.f2873b     // Catch:{ all -> 0x0014 }
            if (r0 != r2) goto L_0x000a
            monitor-exit(r1)     // Catch:{ all -> 0x0014 }
        L_0x0009:
            return
        L_0x000a:
            r1.f2873b = r2     // Catch:{ all -> 0x0014 }
            boolean r0 = r1.f2872a     // Catch:{ all -> 0x0014 }
            if (r0 == 0) goto L_0x0012
            if (r2 != 0) goto L_0x0017
        L_0x0012:
            monitor-exit(r1)     // Catch:{ all -> 0x0014 }
            goto L_0x0009
        L_0x0014:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0014 }
            throw r0
        L_0x0017:
            monitor-exit(r1)     // Catch:{ all -> 0x0014 }
            r2.mo2671a()
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p010v4.p028k.C0799d.mo2666a(android.support.v4.k.d$a):void");
    }

    /* renamed from: a */
    public boolean mo2667a() {
        boolean z;
        synchronized (this) {
            z = this.f2872a;
        }
        return z;
    }

    /* renamed from: b */
    public void mo2668b() {
        if (mo2667a()) {
            throw new C0807i();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        if (r1 == null) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0019, code lost:
        android.support.p010v4.p028k.C0801e.m4083a(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r2.f2875d = false;
        notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0023, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x002b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x002c, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r2.f2875d = false;
        notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0034, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0012, code lost:
        if (r0 == null) goto L_0x0017;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r0.mo2671a();
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2669c() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f2872a     // Catch:{ all -> 0x0028 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r2)     // Catch:{ all -> 0x0028 }
        L_0x0006:
            return
        L_0x0007:
            r0 = 1
            r2.f2872a = r0     // Catch:{ all -> 0x0028 }
            r0 = 1
            r2.f2875d = r0     // Catch:{ all -> 0x0028 }
            android.support.v4.k.d$a r0 = r2.f2873b     // Catch:{ all -> 0x0028 }
            java.lang.Object r1 = r2.f2874c     // Catch:{ all -> 0x0028 }
            monitor-exit(r2)     // Catch:{ all -> 0x0028 }
            if (r0 == 0) goto L_0x0017
            r0.mo2671a()     // Catch:{ all -> 0x002b }
        L_0x0017:
            if (r1 == 0) goto L_0x001c
            android.support.p010v4.p028k.C0801e.m4083a(r1)     // Catch:{ all -> 0x002b }
        L_0x001c:
            monitor-enter(r2)
            r0 = 0
            r2.f2875d = r0     // Catch:{ all -> 0x0025 }
            r2.notifyAll()     // Catch:{ all -> 0x0025 }
            monitor-exit(r2)     // Catch:{ all -> 0x0025 }
            goto L_0x0006
        L_0x0025:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0025 }
            throw r0
        L_0x0028:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0028 }
            throw r0
        L_0x002b:
            r0 = move-exception
            monitor-enter(r2)
            r1 = 0
            r2.f2875d = r1     // Catch:{ all -> 0x0035 }
            r2.notifyAll()     // Catch:{ all -> 0x0035 }
            monitor-exit(r2)     // Catch:{ all -> 0x0035 }
            throw r0
        L_0x0035:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0035 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p010v4.p028k.C0799d.mo2669c():void");
    }

    /* renamed from: d */
    public Object mo2670d() {
        Object obj;
        if (Build.VERSION.SDK_INT < 16) {
            return null;
        }
        synchronized (this) {
            if (this.f2874c == null) {
                this.f2874c = C0801e.m4082a();
                if (this.f2872a) {
                    C0801e.m4083a(this.f2874c);
                }
            }
            obj = this.f2874c;
        }
        return obj;
    }
}
