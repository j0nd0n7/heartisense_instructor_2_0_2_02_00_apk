package com.p048a.p049a.p053d.p063d.p068e;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.p048a.p049a.C2178h;
import com.p048a.p049a.C2243l;
import com.p048a.p049a.p051b.C1884a;
import com.p048a.p049a.p053d.C2010c;
import com.p048a.p049a.p053d.C2146g;
import com.p048a.p049a.p053d.p055b.C1969c;
import com.p048a.p049a.p053d.p055b.p056a.C1921c;
import com.p048a.p049a.p053d.p063d.C2093b;
import com.p048a.p049a.p074h.p075a.C2185c;
import com.p048a.p049a.p074h.p076b.C2209j;
import com.p048a.p049a.p074h.p076b.C2213m;
import java.security.MessageDigest;
import java.util.UUID;

/* renamed from: com.a.a.d.d.e.f */
class C2113f {

    /* renamed from: a */
    private final C2116b f7046a;

    /* renamed from: b */
    private final C1884a f7047b;

    /* renamed from: c */
    private final Handler f7048c;

    /* renamed from: d */
    private boolean f7049d;

    /* renamed from: e */
    private boolean f7050e;

    /* renamed from: f */
    private C2178h<C1884a, C1884a, Bitmap, Bitmap> f7051f;

    /* renamed from: g */
    private C2115a f7052g;

    /* renamed from: h */
    private boolean f7053h;

    /* renamed from: com.a.a.d.d.e.f$a */
    static class C2115a extends C2209j<Bitmap> {

        /* renamed from: b */
        private final Handler f7054b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final int f7055c;

        /* renamed from: d */
        private final long f7056d;

        /* renamed from: e */
        private Bitmap f7057e;

        public C2115a(Handler handler, int i, long j) {
            this.f7054b = handler;
            this.f7055c = i;
            this.f7056d = j;
        }

        /* renamed from: a */
        public Bitmap mo8049a() {
            return this.f7057e;
        }

        /* renamed from: a */
        public void mo8051a(Bitmap bitmap, C2185c<? super Bitmap> cVar) {
            this.f7057e = bitmap;
            this.f7054b.sendMessageAtTime(this.f7054b.obtainMessage(1, this), this.f7056d);
        }
    }

    /* renamed from: com.a.a.d.d.e.f$b */
    public interface C2116b {
        /* renamed from: b */
        void mo8021b(int i);
    }

    /* renamed from: com.a.a.d.d.e.f$c */
    private class C2117c implements Handler.Callback {

        /* renamed from: a */
        public static final int f7058a = 1;

        /* renamed from: b */
        public static final int f7059b = 2;

        private C2117c() {
        }

        public boolean handleMessage(Message message) {
            if (message.what == 1) {
                C2113f.this.mo8044a((C2115a) message.obj);
                return true;
            }
            if (message.what == 2) {
                C2243l.m12756a((C2213m<?>) (C2115a) message.obj);
            }
            return false;
        }
    }

    /* renamed from: com.a.a.d.d.e.f$d */
    static class C2118d implements C2010c {

        /* renamed from: b */
        private final UUID f7061b;

        public C2118d() {
            this(UUID.randomUUID());
        }

        C2118d(UUID uuid) {
            this.f7061b = uuid;
        }

        /* renamed from: a */
        public void mo7853a(MessageDigest messageDigest) {
            throw new UnsupportedOperationException("Not implemented");
        }

        public boolean equals(Object obj) {
            if (obj instanceof C2118d) {
                return ((C2118d) obj).f7061b.equals(this.f7061b);
            }
            return false;
        }

        public int hashCode() {
            return this.f7061b.hashCode();
        }
    }

    public C2113f(Context context, C2116b bVar, C1884a aVar, int i, int i2) {
        this(bVar, aVar, (Handler) null, m12118a(context, aVar, i, i2, C2243l.m12761b(context).mo8360c()));
    }

    C2113f(C2116b bVar, C1884a aVar, Handler handler, C2178h<C1884a, C1884a, Bitmap, Bitmap> hVar) {
        this.f7049d = false;
        this.f7050e = false;
        handler = handler == null ? new Handler(Looper.getMainLooper(), new C2117c()) : handler;
        this.f7046a = bVar;
        this.f7047b = aVar;
        this.f7048c = handler;
        this.f7051f = hVar;
    }

    /* renamed from: a */
    private static C2178h<C1884a, C1884a, Bitmap, Bitmap> m12118a(Context context, C1884a aVar, int i, int i2, C1921c cVar) {
        C2121h hVar = new C2121h(cVar);
        C2119g gVar = new C2119g();
        return C2243l.m12763c(context).mo8399a(gVar, C1884a.class).mo8422a(aVar).mo8423a(Bitmap.class).mo7611b(C2093b.m12057b()).mo7640f(hVar).mo7620b(true).mo7610b(C1969c.NONE).mo7608b(i, i2);
    }

    /* renamed from: e */
    private void m12119e() {
        if (this.f7049d && !this.f7050e) {
            this.f7050e = true;
            this.f7047b.mo7660e();
            this.f7051f.mo7612b((C2010c) new C2118d()).mo8181b(new C2115a(this.f7048c, this.f7047b.mo7663h(), SystemClock.uptimeMillis() + ((long) this.f7047b.mo7661f())));
        }
    }

    /* renamed from: a */
    public void mo8043a() {
        if (!this.f7049d) {
            this.f7049d = true;
            this.f7053h = false;
            m12119e();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo8044a(C2115a aVar) {
        if (this.f7053h) {
            this.f7048c.obtainMessage(2, aVar).sendToTarget();
            return;
        }
        C2115a aVar2 = this.f7052g;
        this.f7052g = aVar;
        this.f7046a.mo8021b(aVar.f7055c);
        if (aVar2 != null) {
            this.f7048c.obtainMessage(2, aVar2).sendToTarget();
        }
        this.f7050e = false;
        m12119e();
    }

    /* renamed from: a */
    public void mo8045a(C2146g<Bitmap> gVar) {
        if (gVar == null) {
            throw new NullPointerException("Transformation must not be null");
        }
        this.f7051f = this.f7051f.mo7621b((C2146g<ResourceType>[]) new C2146g[]{gVar});
    }

    /* renamed from: b */
    public void mo8046b() {
        this.f7049d = false;
    }

    /* renamed from: c */
    public void mo8047c() {
        mo8046b();
        if (this.f7052g != null) {
            C2243l.m12756a((C2213m<?>) this.f7052g);
            this.f7052g = null;
        }
        this.f7053h = true;
    }

    /* renamed from: d */
    public Bitmap mo8048d() {
        if (this.f7052g != null) {
            return this.f7052g.mo8049a();
        }
        return null;
    }
}
