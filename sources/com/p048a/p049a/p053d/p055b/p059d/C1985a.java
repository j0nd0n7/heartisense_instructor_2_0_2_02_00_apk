package com.p048a.p049a.p053d.p055b.p059d;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import com.p048a.p049a.p053d.C2010c;
import com.p048a.p049a.p053d.p055b.p056a.C1921c;
import com.p048a.p049a.p053d.p055b.p057b.C1962i;
import com.p048a.p049a.p053d.p063d.p064a.C2067d;
import com.p048a.p049a.p078j.C2238i;
import java.security.MessageDigest;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: com.a.a.d.b.d.a */
final class C1985a implements Runnable {

    /* renamed from: a */
    static final long f6765a = 32;

    /* renamed from: b */
    static final long f6766b = 40;

    /* renamed from: c */
    static final int f6767c = 4;

    /* renamed from: d */
    static final long f6768d = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: e */
    private static final String f6769e = "PreFillRunner";

    /* renamed from: f */
    private static final C1987a f6770f = new C1987a();

    /* renamed from: g */
    private final C1921c f6771g;

    /* renamed from: h */
    private final C1962i f6772h;

    /* renamed from: i */
    private final C1990c f6773i;

    /* renamed from: j */
    private final C1987a f6774j;

    /* renamed from: k */
    private final Set<C1991d> f6775k;

    /* renamed from: l */
    private final Handler f6776l;

    /* renamed from: m */
    private long f6777m;

    /* renamed from: n */
    private boolean f6778n;

    /* renamed from: com.a.a.d.b.d.a$a */
    static class C1987a {
        C1987a() {
        }

        /* renamed from: a */
        public long mo7852a() {
            return SystemClock.currentThreadTimeMillis();
        }
    }

    /* renamed from: com.a.a.d.b.d.a$b */
    private static class C1988b implements C2010c {
        private C1988b() {
        }

        /* renamed from: a */
        public void mo7853a(MessageDigest messageDigest) {
        }
    }

    public C1985a(C1921c cVar, C1962i iVar, C1990c cVar2) {
        this(cVar, iVar, cVar2, f6770f, new Handler(Looper.getMainLooper()));
    }

    C1985a(C1921c cVar, C1962i iVar, C1990c cVar2, C1987a aVar, Handler handler) {
        this.f6775k = new HashSet();
        this.f6777m = f6766b;
        this.f6771g = cVar;
        this.f6772h = iVar;
        this.f6773i = cVar2;
        this.f6774j = aVar;
        this.f6776l = handler;
    }

    /* renamed from: a */
    private void m11778a(C1991d dVar, Bitmap bitmap) {
        Bitmap a;
        if (this.f6775k.add(dVar) && (a = this.f6771g.mo7764a(dVar.mo7859a(), dVar.mo7860b(), dVar.mo7861c())) != null) {
            this.f6771g.mo7767a(a);
        }
        this.f6771g.mo7767a(bitmap);
    }

    /* renamed from: a */
    private boolean m11779a(long j) {
        return this.f6774j.mo7852a() - j >= 32;
    }

    /* renamed from: b */
    private boolean m11780b() {
        long a = this.f6774j.mo7852a();
        while (!this.f6773i.mo7858c() && !m11779a(a)) {
            C1991d a2 = this.f6773i.mo7856a();
            Bitmap createBitmap = Bitmap.createBitmap(a2.mo7859a(), a2.mo7860b(), a2.mo7861c());
            if (m11781c() >= C2238i.m12731b(createBitmap)) {
                this.f6772h.mo7818b(new C1988b(), C2067d.m11960a(createBitmap, this.f6771g));
            } else {
                m11778a(a2, createBitmap);
            }
            if (Log.isLoggable(f6769e, 3)) {
                Log.d(f6769e, "allocated [" + a2.mo7859a() + "x" + a2.mo7860b() + "] " + a2.mo7861c() + " size: " + C2238i.m12731b(createBitmap));
            }
        }
        return !this.f6778n && !this.f6773i.mo7858c();
    }

    /* renamed from: c */
    private int m11781c() {
        return this.f6772h.mo7821b() - this.f6772h.mo7819a();
    }

    /* renamed from: d */
    private long m11782d() {
        long j = this.f6777m;
        this.f6777m = Math.min(this.f6777m * 4, f6768d);
        return j;
    }

    /* renamed from: a */
    public void mo7850a() {
        this.f6778n = true;
    }

    public void run() {
        if (m11780b()) {
            this.f6776l.postDelayed(this, m11782d());
        }
    }
}
