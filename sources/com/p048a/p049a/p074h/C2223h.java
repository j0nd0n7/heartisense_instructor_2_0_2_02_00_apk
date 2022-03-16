package com.p048a.p049a.p074h;

/* renamed from: com.a.a.h.h */
public class C2223h implements C2217c, C2218d {

    /* renamed from: a */
    private C2217c f7297a;

    /* renamed from: b */
    private C2217c f7298b;

    /* renamed from: c */
    private C2218d f7299c;

    public C2223h() {
        this((C2218d) null);
    }

    public C2223h(C2218d dVar) {
        this.f7299c = dVar;
    }

    /* renamed from: l */
    private boolean m12587l() {
        return this.f7299c == null || this.f7299c.mo8257a(this);
    }

    /* renamed from: m */
    private boolean m12588m() {
        return this.f7299c == null || this.f7299c.mo8258b(this);
    }

    /* renamed from: n */
    private boolean m12589n() {
        return this.f7299c != null && this.f7299c.mo8260c();
    }

    /* renamed from: a */
    public void mo8195a() {
        this.f7297a.mo8195a();
        this.f7298b.mo8195a();
    }

    /* renamed from: a */
    public void mo8271a(C2217c cVar, C2217c cVar2) {
        this.f7297a = cVar;
        this.f7298b = cVar2;
    }

    /* renamed from: a */
    public boolean mo8257a(C2217c cVar) {
        return m12587l() && (cVar.equals(this.f7297a) || !this.f7297a.mo8204i());
    }

    /* renamed from: b */
    public void mo8197b() {
        if (!this.f7298b.mo8202g()) {
            this.f7298b.mo8197b();
        }
        if (!this.f7297a.mo8202g()) {
            this.f7297a.mo8197b();
        }
    }

    /* renamed from: b */
    public boolean mo8258b(C2217c cVar) {
        return m12588m() && cVar.equals(this.f7297a) && !mo8260c();
    }

    /* renamed from: c */
    public void mo8259c(C2217c cVar) {
        if (!cVar.equals(this.f7298b)) {
            if (this.f7299c != null) {
                this.f7299c.mo8259c(this);
            }
            if (!this.f7298b.mo8203h()) {
                this.f7298b.mo8199d();
            }
        }
    }

    /* renamed from: c */
    public boolean mo8260c() {
        return m12589n() || mo8204i();
    }

    /* renamed from: d */
    public void mo8199d() {
        this.f7298b.mo8199d();
        this.f7297a.mo8199d();
    }

    /* renamed from: e */
    public boolean mo8200e() {
        return this.f7297a.mo8200e();
    }

    /* renamed from: f */
    public void mo8201f() {
        this.f7297a.mo8201f();
        this.f7298b.mo8201f();
    }

    /* renamed from: g */
    public boolean mo8202g() {
        return this.f7297a.mo8202g();
    }

    /* renamed from: h */
    public boolean mo8203h() {
        return this.f7297a.mo8203h() || this.f7298b.mo8203h();
    }

    /* renamed from: i */
    public boolean mo8204i() {
        return this.f7297a.mo8204i() || this.f7298b.mo8204i();
    }

    /* renamed from: j */
    public boolean mo8205j() {
        return this.f7297a.mo8205j();
    }

    /* renamed from: k */
    public boolean mo8206k() {
        return this.f7297a.mo8206k();
    }
}
