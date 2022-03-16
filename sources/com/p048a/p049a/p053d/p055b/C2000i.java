package com.p048a.p049a.p053d.p055b;

import android.os.Looper;
import com.p048a.p049a.p053d.C2010c;

/* renamed from: com.a.a.d.b.i */
class C2000i<Z> implements C2006l<Z> {

    /* renamed from: a */
    private final C2006l<Z> f6831a;

    /* renamed from: b */
    private final boolean f6832b;

    /* renamed from: c */
    private C2001a f6833c;

    /* renamed from: d */
    private C2010c f6834d;

    /* renamed from: e */
    private int f6835e;

    /* renamed from: f */
    private boolean f6836f;

    /* renamed from: com.a.a.d.b.i$a */
    interface C2001a {
        /* renamed from: b */
        void mo7846b(C2010c cVar, C2000i<?> iVar);
    }

    C2000i(C2006l<Z> lVar, boolean z) {
        if (lVar == null) {
            throw new NullPointerException("Wrapped resource must not be null");
        }
        this.f6831a = lVar;
        this.f6832b = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7885a(C2010c cVar, C2001a aVar) {
        this.f6834d = cVar;
        this.f6833c = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo7886a() {
        return this.f6832b;
    }

    /* renamed from: b */
    public Z mo7887b() {
        return this.f6831a.mo7887b();
    }

    /* renamed from: c */
    public int mo7888c() {
        return this.f6831a.mo7888c();
    }

    /* renamed from: d */
    public void mo7889d() {
        if (this.f6835e > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        } else if (this.f6836f) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        } else {
            this.f6836f = true;
            this.f6831a.mo7889d();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo7890e() {
        if (this.f6836f) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        } else if (!Looper.getMainLooper().equals(Looper.myLooper())) {
            throw new IllegalThreadStateException("Must call acquire on the main thread");
        } else {
            this.f6835e++;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo7891f() {
        if (this.f6835e <= 0) {
            throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
        } else if (!Looper.getMainLooper().equals(Looper.myLooper())) {
            throw new IllegalThreadStateException("Must call release on the main thread");
        } else {
            int i = this.f6835e - 1;
            this.f6835e = i;
            if (i == 0) {
                this.f6833c.mo7846b(this.f6834d, this);
            }
        }
    }
}
