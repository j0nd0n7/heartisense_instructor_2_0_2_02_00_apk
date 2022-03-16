package com.p048a.p049a.p071e;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.support.p010v4.p013c.C0186ad;
import com.p048a.p049a.C2256q;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.a.a.e.n */
public class C2165n extends C0186ad {

    /* renamed from: a */
    private C2256q f7137a;

    /* renamed from: b */
    private final C2148a f7138b;

    /* renamed from: c */
    private final C2163l f7139c;

    /* renamed from: d */
    private final HashSet<C2165n> f7140d;

    /* renamed from: e */
    private C2165n f7141e;

    /* renamed from: com.a.a.e.n$a */
    private class C2167a implements C2163l {
        private C2167a() {
        }

        /* renamed from: a */
        public Set<C2256q> mo8093a() {
            Set<C2165n> d = C2165n.this.mo8126d();
            HashSet hashSet = new HashSet(d.size());
            for (C2165n next : d) {
                if (next.mo772b() != null) {
                    hashSet.add(next.mo772b());
                }
            }
            return hashSet;
        }
    }

    public C2165n() {
        this(new C2148a());
    }

    @SuppressLint({"ValidFragment"})
    public C2165n(C2148a aVar) {
        this.f7139c = new C2167a();
        this.f7140d = new HashSet<>();
        this.f7138b = aVar;
    }

    /* renamed from: a */
    private void m12270a(C2165n nVar) {
        this.f7140d.add(nVar);
    }

    /* renamed from: b */
    private void m12271b(C2165n nVar) {
        this.f7140d.remove(nVar);
    }

    /* renamed from: c */
    private boolean m12272c(C0186ad adVar) {
        C0186ad x = mo922x();
        while (adVar.mo922x() != null) {
            if (adVar.mo922x() == x) {
                return true;
            }
            adVar = adVar.mo922x();
        }
        return false;
    }

    /* renamed from: N */
    public void mo801N() {
        super.mo801N();
        this.f7138b.mo8086c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C2148a mo764a() {
        return this.f7138b;
    }

    /* renamed from: a */
    public void mo821a(Activity activity) {
        super.mo821a(activity);
        this.f7141e = C2162k.m12249a().mo8107a(mo915r().mo958j());
        if (this.f7141e != this) {
            this.f7141e.m12270a(this);
        }
    }

    /* renamed from: a */
    public void mo8124a(C2256q qVar) {
        this.f7137a = qVar;
    }

    /* renamed from: b */
    public C2256q mo772b() {
        return this.f7137a;
    }

    /* renamed from: c */
    public C2163l mo8125c() {
        return this.f7139c;
    }

    /* renamed from: d */
    public Set<C2165n> mo8126d() {
        if (this.f7141e == null) {
            return Collections.emptySet();
        }
        if (this.f7141e == this) {
            return Collections.unmodifiableSet(this.f7140d);
        }
        HashSet hashSet = new HashSet();
        for (C2165n next : this.f7141e.mo8126d()) {
            if (m12272c(next.mo922x())) {
                hashSet.add(next);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: g */
    public void mo782g() {
        super.mo782g();
        if (this.f7141e != null) {
            this.f7141e.m12271b(this);
            this.f7141e = null;
        }
    }

    /* renamed from: h */
    public void mo783h() {
        super.mo783h();
        this.f7138b.mo8083a();
    }

    /* renamed from: i */
    public void mo784i() {
        super.mo784i();
        this.f7138b.mo8085b();
    }

    public void onLowMemory() {
        super.onLowMemory();
        if (this.f7137a != null) {
            this.f7137a.mo8403a();
        }
    }
}
