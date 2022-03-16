package android.support.p010v4.p030m;

import android.content.Context;
import android.net.Uri;

/* renamed from: android.support.v4.m.f */
class C0848f extends C0843a {

    /* renamed from: b */
    private Context f2957b;

    /* renamed from: c */
    private Uri f2958c;

    C0848f(C0843a aVar, Context context, Uri uri) {
        super(aVar);
        this.f2957b = context;
        this.f2958c = uri;
    }

    /* renamed from: a */
    public Uri mo2739a() {
        return this.f2958c;
    }

    /* renamed from: a */
    public C0843a mo2740a(String str) {
        Uri a = C0845c.m4214a(this.f2957b, this.f2958c, str);
        if (a != null) {
            return new C0848f(this, this.f2957b, a);
        }
        return null;
    }

    /* renamed from: a */
    public C0843a mo2741a(String str, String str2) {
        Uri a = C0845c.m4215a(this.f2957b, this.f2958c, str, str2);
        if (a != null) {
            return new C0848f(this, this.f2957b, a);
        }
        return null;
    }

    /* renamed from: b */
    public String mo2743b() {
        return C0844b.m4202c(this.f2957b, this.f2958c);
    }

    /* renamed from: c */
    public String mo2744c() {
        return C0844b.m4203d(this.f2957b, this.f2958c);
    }

    /* renamed from: c */
    public boolean mo2745c(String str) {
        Uri b = C0845c.m4219b(this.f2957b, this.f2958c, str);
        if (b == null) {
            return false;
        }
        this.f2958c = b;
        return true;
    }

    /* renamed from: e */
    public boolean mo2747e() {
        return C0844b.m4205f(this.f2957b, this.f2958c);
    }

    /* renamed from: f */
    public boolean mo2748f() {
        return C0844b.m4206g(this.f2957b, this.f2958c);
    }

    /* renamed from: g */
    public boolean mo2749g() {
        return C0844b.m4201b(this.f2957b, this.f2958c);
    }

    /* renamed from: h */
    public long mo2750h() {
        return C0844b.m4207h(this.f2957b, this.f2958c);
    }

    /* renamed from: i */
    public long mo2751i() {
        return C0844b.m4208i(this.f2957b, this.f2958c);
    }

    /* renamed from: j */
    public boolean mo2752j() {
        return C0844b.m4209j(this.f2957b, this.f2958c);
    }

    /* renamed from: k */
    public boolean mo2753k() {
        return C0844b.m4210k(this.f2957b, this.f2958c);
    }

    /* renamed from: l */
    public boolean mo2754l() {
        return C0844b.m4211l(this.f2957b, this.f2958c);
    }

    /* renamed from: m */
    public boolean mo2755m() {
        return C0844b.m4212m(this.f2957b, this.f2958c);
    }

    /* renamed from: n */
    public C0843a[] mo2756n() {
        Uri[] a = C0845c.m4218a(this.f2957b, this.f2958c);
        C0843a[] aVarArr = new C0843a[a.length];
        for (int i = 0; i < a.length; i++) {
            aVarArr[i] = new C0848f(this, this.f2957b, a[i]);
        }
        return aVarArr;
    }
}
