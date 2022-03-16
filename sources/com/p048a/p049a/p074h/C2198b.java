package com.p048a.p049a.p074h;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.p048a.p049a.C2255p;
import com.p048a.p049a.p053d.C2010c;
import com.p048a.p049a.p053d.C2146g;
import com.p048a.p049a.p053d.p054a.C1897c;
import com.p048a.p049a.p053d.p055b.C1969c;
import com.p048a.p049a.p053d.p055b.C1979d;
import com.p048a.p049a.p053d.p055b.C2006l;
import com.p048a.p049a.p053d.p063d.p070g.C2141f;
import com.p048a.p049a.p073g.C2177f;
import com.p048a.p049a.p074h.p075a.C2187d;
import com.p048a.p049a.p074h.p076b.C2210k;
import com.p048a.p049a.p074h.p076b.C2213m;
import com.p048a.p049a.p078j.C2234e;
import com.p048a.p049a.p078j.C2238i;
import java.util.Queue;

/* renamed from: com.a.a.h.b */
public final class C2198b<A, T, Z, R> implements C2210k, C2217c, C2222g {

    /* renamed from: a */
    private static final String f7211a = "GenericRequest";

    /* renamed from: b */
    private static final Queue<C2198b<?, ?, ?, ?>> f7212b = C2238i.m12728a(0);

    /* renamed from: c */
    private static final double f7213c = 9.5367431640625E-7d;

    /* renamed from: A */
    private Drawable f7214A;

    /* renamed from: B */
    private boolean f7215B;

    /* renamed from: C */
    private C2006l<?> f7216C;

    /* renamed from: D */
    private C1979d.C1982c f7217D;

    /* renamed from: E */
    private long f7218E;

    /* renamed from: F */
    private C2199a f7219F;

    /* renamed from: d */
    private final String f7220d = String.valueOf(hashCode());

    /* renamed from: e */
    private C2010c f7221e;

    /* renamed from: f */
    private Drawable f7222f;

    /* renamed from: g */
    private int f7223g;

    /* renamed from: h */
    private int f7224h;

    /* renamed from: i */
    private int f7225i;

    /* renamed from: j */
    private Context f7226j;

    /* renamed from: k */
    private C2146g<Z> f7227k;

    /* renamed from: l */
    private C2177f<A, T, Z, R> f7228l;

    /* renamed from: m */
    private C2218d f7229m;

    /* renamed from: n */
    private A f7230n;

    /* renamed from: o */
    private Class<R> f7231o;

    /* renamed from: p */
    private boolean f7232p;

    /* renamed from: q */
    private C2255p f7233q;

    /* renamed from: r */
    private C2213m<R> f7234r;

    /* renamed from: s */
    private C2221f<? super A, R> f7235s;

    /* renamed from: t */
    private float f7236t;

    /* renamed from: u */
    private C1979d f7237u;

    /* renamed from: v */
    private C2187d<R> f7238v;

    /* renamed from: w */
    private int f7239w;

    /* renamed from: x */
    private int f7240x;

    /* renamed from: y */
    private C1969c f7241y;

    /* renamed from: z */
    private Drawable f7242z;

    /* renamed from: com.a.a.h.b$a */
    private enum C2199a {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CANCELLED,
        CLEARED,
        PAUSED
    }

    private C2198b() {
    }

    /* renamed from: a */
    public static <A, T, Z, R> C2198b<A, T, Z, R> m12464a(C2177f<A, T, Z, R> fVar, A a, C2010c cVar, Context context, C2255p pVar, C2213m<R> mVar, float f, Drawable drawable, int i, Drawable drawable2, int i2, Drawable drawable3, int i3, C2221f<? super A, R> fVar2, C2218d dVar, C1979d dVar2, C2146g<Z> gVar, Class<R> cls, boolean z, C2187d<R> dVar3, int i4, int i5, C1969c cVar2) {
        C2198b<A, T, Z, R> poll = f7212b.poll();
        if (poll == null) {
            poll = new C2198b<>();
        }
        poll.m12469b(fVar, a, cVar, context, pVar, mVar, f, drawable, i, drawable2, i2, drawable3, i3, fVar2, dVar, dVar2, gVar, cls, z, dVar3, i4, i5, cVar2);
        return poll;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001b, code lost:
        if (r6.f7235s.mo8270a(r8, r6.f7230n, r6.f7234r, r6.f7215B, r5) == false) goto L_0x001d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m12465a(com.p048a.p049a.p053d.p055b.C2006l<?> r7, R r8) {
        /*
            r6 = this;
            boolean r5 = r6.m12476q()
            com.a.a.h.b$a r0 = com.p048a.p049a.p074h.C2198b.C2199a.COMPLETE
            r6.f7219F = r0
            r6.f7216C = r7
            com.a.a.h.f<? super A, R> r0 = r6.f7235s
            if (r0 == 0) goto L_0x001d
            com.a.a.h.f<? super A, R> r0 = r6.f7235s
            A r2 = r6.f7230n
            com.a.a.h.b.m<R> r3 = r6.f7234r
            boolean r4 = r6.f7215B
            r1 = r8
            boolean r0 = r0.mo8270a(r1, r2, r3, r4, r5)
            if (r0 != 0) goto L_0x002a
        L_0x001d:
            com.a.a.h.a.d<R> r0 = r6.f7238v
            boolean r1 = r6.f7215B
            com.a.a.h.a.c r0 = r0.mo8187a(r1, r5)
            com.a.a.h.b.m<R> r1 = r6.f7234r
            r1.mo8051a(r8, r0)
        L_0x002a:
            r6.m12477r()
            java.lang.String r0 = "GenericRequest"
            r1 = 2
            boolean r0 = android.util.Log.isLoggable(r0, r1)
            if (r0 == 0) goto L_0x0070
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Resource ready in "
            java.lang.StringBuilder r0 = r0.append(r1)
            long r2 = r6.f7218E
            double r2 = com.p048a.p049a.p078j.C2234e.m12705a(r2)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r1 = " size: "
            java.lang.StringBuilder r0 = r0.append(r1)
            int r1 = r7.mo7888c()
            double r2 = (double) r1
            r4 = 4517110426252607488(0x3eb0000000000000, double:9.5367431640625E-7)
            double r2 = r2 * r4
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r1 = " fromCache: "
            java.lang.StringBuilder r0 = r0.append(r1)
            boolean r1 = r6.f7215B
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.m12466a((java.lang.String) r0)
        L_0x0070:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p048a.p049a.p074h.C2198b.m12465a(com.a.a.d.b.l, java.lang.Object):void");
    }

    /* renamed from: a */
    private void m12466a(String str) {
        Log.v(f7211a, str + " this: " + this.f7220d);
    }

    /* renamed from: a */
    private static void m12467a(String str, Object obj, String str2) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder(str);
            sb.append(" must not be null");
            if (str2 != null) {
                sb.append(", ");
                sb.append(str2);
            }
            throw new NullPointerException(sb.toString());
        }
    }

    /* renamed from: b */
    private void m12468b(C2006l lVar) {
        this.f7237u.mo7844a(lVar);
        this.f7216C = null;
    }

    /* renamed from: b */
    private void m12469b(C2177f<A, T, Z, R> fVar, A a, C2010c cVar, Context context, C2255p pVar, C2213m<R> mVar, float f, Drawable drawable, int i, Drawable drawable2, int i2, Drawable drawable3, int i3, C2221f<? super A, R> fVar2, C2218d dVar, C1979d dVar2, C2146g<Z> gVar, Class<R> cls, boolean z, C2187d<R> dVar3, int i4, int i5, C1969c cVar2) {
        this.f7228l = fVar;
        this.f7230n = a;
        this.f7221e = cVar;
        this.f7222f = drawable3;
        this.f7223g = i3;
        this.f7226j = context.getApplicationContext();
        this.f7233q = pVar;
        this.f7234r = mVar;
        this.f7236t = f;
        this.f7242z = drawable;
        this.f7224h = i;
        this.f7214A = drawable2;
        this.f7225i = i2;
        this.f7235s = fVar2;
        this.f7229m = dVar;
        this.f7237u = dVar2;
        this.f7227k = gVar;
        this.f7231o = cls;
        this.f7232p = z;
        this.f7238v = dVar3;
        this.f7239w = i4;
        this.f7240x = i5;
        this.f7241y = cVar2;
        this.f7219F = C2199a.PENDING;
        if (a != null) {
            m12467a("ModelLoader", fVar.mo8175e(), "try .using(ModelLoader)");
            m12467a("Transcoder", fVar.mo8176f(), "try .as*(Class).transcode(ResourceTranscoder)");
            m12467a("Transformation", gVar, "try .transform(UnitTransformation.get())");
            if (cVar2.mo7829a()) {
                m12467a("SourceEncoder", fVar.mo7961c(), "try .sourceEncoder(Encoder) or .diskCacheStrategy(NONE/RESULT)");
            } else {
                m12467a("SourceDecoder", fVar.mo7960b(), "try .decoder/.imageDecoder/.videoDecoder(ResourceDecoder) or .diskCacheStrategy(ALL/SOURCE)");
            }
            if (cVar2.mo7829a() || cVar2.mo7830b()) {
                m12467a("CacheDecoder", fVar.mo7959a(), "try .cacheDecoder(ResouceDecoder) or .diskCacheStrategy(NONE)");
            }
            if (cVar2.mo7830b()) {
                m12467a("Encoder", fVar.mo7962d(), "try .encode(ResourceEncoder) or .diskCacheStrategy(NONE/SOURCE)");
            }
        }
    }

    /* renamed from: b */
    private void m12470b(Exception exc) {
        if (m12475p()) {
            Drawable l = this.f7230n == null ? m12471l() : null;
            if (l == null) {
                l = m12472m();
            }
            if (l == null) {
                l = m12473n();
            }
            this.f7234r.mo8210a(exc, l);
        }
    }

    /* renamed from: l */
    private Drawable m12471l() {
        if (this.f7222f == null && this.f7223g > 0) {
            this.f7222f = this.f7226j.getResources().getDrawable(this.f7223g);
        }
        return this.f7222f;
    }

    /* renamed from: m */
    private Drawable m12472m() {
        if (this.f7214A == null && this.f7225i > 0) {
            this.f7214A = this.f7226j.getResources().getDrawable(this.f7225i);
        }
        return this.f7214A;
    }

    /* renamed from: n */
    private Drawable m12473n() {
        if (this.f7242z == null && this.f7224h > 0) {
            this.f7242z = this.f7226j.getResources().getDrawable(this.f7224h);
        }
        return this.f7242z;
    }

    /* renamed from: o */
    private boolean m12474o() {
        return this.f7229m == null || this.f7229m.mo8257a(this);
    }

    /* renamed from: p */
    private boolean m12475p() {
        return this.f7229m == null || this.f7229m.mo8258b(this);
    }

    /* renamed from: q */
    private boolean m12476q() {
        return this.f7229m == null || !this.f7229m.mo8260c();
    }

    /* renamed from: r */
    private void m12477r() {
        if (this.f7229m != null) {
            this.f7229m.mo8259c(this);
        }
    }

    /* renamed from: a */
    public void mo8195a() {
        this.f7228l = null;
        this.f7230n = null;
        this.f7226j = null;
        this.f7234r = null;
        this.f7242z = null;
        this.f7214A = null;
        this.f7222f = null;
        this.f7235s = null;
        this.f7229m = null;
        this.f7227k = null;
        this.f7238v = null;
        this.f7215B = false;
        this.f7217D = null;
        f7212b.offer(this);
    }

    /* renamed from: a */
    public void mo8196a(int i, int i2) {
        if (Log.isLoggable(f7211a, 2)) {
            m12466a("Got onSizeReady in " + C2234e.m12705a(this.f7218E));
        }
        if (this.f7219F == C2199a.WAITING_FOR_SIZE) {
            this.f7219F = C2199a.RUNNING;
            int round = Math.round(this.f7236t * ((float) i));
            int round2 = Math.round(this.f7236t * ((float) i2));
            C1897c<T> a = this.f7228l.mo8175e().mo7901a(this.f7230n, round, round2);
            if (a == null) {
                mo7874a(new Exception("Failed to load model: '" + this.f7230n + "'"));
                return;
            }
            C2141f<Z, R> f = this.f7228l.mo8176f();
            if (Log.isLoggable(f7211a, 2)) {
                m12466a("finished setup for calling load in " + C2234e.m12705a(this.f7218E));
            }
            this.f7215B = true;
            this.f7217D = this.f7237u.mo7841a(this.f7221e, round, round2, a, this.f7228l, this.f7227k, f, this.f7233q, this.f7232p, this.f7241y, this);
            this.f7215B = this.f7216C != null;
            if (Log.isLoggable(f7211a, 2)) {
                m12466a("finished onSizeReady in " + C2234e.m12705a(this.f7218E));
            }
        }
    }

    /* renamed from: a */
    public void mo7872a(C2006l<?> lVar) {
        if (lVar == null) {
            mo7874a(new Exception("Expected to receive a Resource<R> with an object of " + this.f7231o + " inside, but instead got null."));
            return;
        }
        Object b = lVar.mo7887b();
        if (b == null || !this.f7231o.isAssignableFrom(b.getClass())) {
            m12468b((C2006l) lVar);
            mo7874a(new Exception("Expected to receive an object of " + this.f7231o + " but instead got " + (b != null ? b.getClass() : "") + "{" + b + "}" + " inside Resource{" + lVar + "}." + (b != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.")));
        } else if (!m12474o()) {
            m12468b((C2006l) lVar);
            this.f7219F = C2199a.COMPLETE;
        } else {
            m12465a(lVar, b);
        }
    }

    /* renamed from: a */
    public void mo7874a(Exception exc) {
        if (Log.isLoggable(f7211a, 3)) {
            Log.d(f7211a, "load failed", exc);
        }
        this.f7219F = C2199a.FAILED;
        if (this.f7235s == null || !this.f7235s.mo8269a(exc, this.f7230n, this.f7234r, m12476q())) {
            m12470b(exc);
        }
    }

    /* renamed from: b */
    public void mo8197b() {
        this.f7218E = C2234e.m12706a();
        if (this.f7230n == null) {
            mo7874a((Exception) null);
            return;
        }
        this.f7219F = C2199a.WAITING_FOR_SIZE;
        if (C2238i.m12730a(this.f7239w, this.f7240x)) {
            mo8196a(this.f7239w, this.f7240x);
        } else {
            this.f7234r.mo8220a((C2210k) this);
        }
        if (!mo8203h() && !mo8206k() && m12475p()) {
            this.f7234r.mo8208a(m12473n());
        }
        if (Log.isLoggable(f7211a, 2)) {
            m12466a("finished run method in " + C2234e.m12705a(this.f7218E));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo8198c() {
        this.f7219F = C2199a.CANCELLED;
        if (this.f7217D != null) {
            this.f7217D.mo7848a();
            this.f7217D = null;
        }
    }

    /* renamed from: d */
    public void mo8199d() {
        C2238i.m12729a();
        if (this.f7219F != C2199a.CLEARED) {
            mo8198c();
            if (this.f7216C != null) {
                m12468b((C2006l) this.f7216C);
            }
            if (m12475p()) {
                this.f7234r.mo8211b(m12473n());
            }
            this.f7219F = C2199a.CLEARED;
        }
    }

    /* renamed from: e */
    public boolean mo8200e() {
        return this.f7219F == C2199a.PAUSED;
    }

    /* renamed from: f */
    public void mo8201f() {
        mo8199d();
        this.f7219F = C2199a.PAUSED;
    }

    /* renamed from: g */
    public boolean mo8202g() {
        return this.f7219F == C2199a.RUNNING || this.f7219F == C2199a.WAITING_FOR_SIZE;
    }

    /* renamed from: h */
    public boolean mo8203h() {
        return this.f7219F == C2199a.COMPLETE;
    }

    /* renamed from: i */
    public boolean mo8204i() {
        return mo8203h();
    }

    /* renamed from: j */
    public boolean mo8205j() {
        return this.f7219F == C2199a.CANCELLED || this.f7219F == C2199a.CLEARED;
    }

    /* renamed from: k */
    public boolean mo8206k() {
        return this.f7219F == C2199a.FAILED;
    }
}
