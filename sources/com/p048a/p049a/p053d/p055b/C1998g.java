package com.p048a.p049a.p053d.p055b;

import com.p048a.p049a.p053d.C1915b;
import com.p048a.p049a.p053d.C2010c;
import com.p048a.p049a.p053d.C2144e;
import com.p048a.p049a.p053d.C2145f;
import com.p048a.p049a.p053d.C2146g;
import com.p048a.p049a.p053d.p063d.p070g.C2141f;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: com.a.a.d.b.g */
class C1998g implements C2010c {

    /* renamed from: b */
    private static final String f6817b = "";

    /* renamed from: c */
    private final String f6818c;

    /* renamed from: d */
    private final int f6819d;

    /* renamed from: e */
    private final int f6820e;

    /* renamed from: f */
    private final C2144e f6821f;

    /* renamed from: g */
    private final C2144e f6822g;

    /* renamed from: h */
    private final C2146g f6823h;

    /* renamed from: i */
    private final C2145f f6824i;

    /* renamed from: j */
    private final C2141f f6825j;

    /* renamed from: k */
    private final C1915b f6826k;

    /* renamed from: l */
    private final C2010c f6827l;

    /* renamed from: m */
    private String f6828m;

    /* renamed from: n */
    private int f6829n;

    /* renamed from: o */
    private C2010c f6830o;

    public C1998g(String str, C2010c cVar, int i, int i2, C2144e eVar, C2144e eVar2, C2146g gVar, C2145f fVar, C2141f fVar2, C1915b bVar) {
        this.f6818c = str;
        this.f6827l = cVar;
        this.f6819d = i;
        this.f6820e = i2;
        this.f6821f = eVar;
        this.f6822g = eVar2;
        this.f6823h = gVar;
        this.f6824i = fVar;
        this.f6825j = fVar2;
        this.f6826k = bVar;
    }

    /* renamed from: a */
    public C2010c mo7880a() {
        if (this.f6830o == null) {
            this.f6830o = new C2005k(this.f6818c, this.f6827l);
        }
        return this.f6830o;
    }

    /* renamed from: a */
    public void mo7853a(MessageDigest messageDigest) {
        byte[] array = ByteBuffer.allocate(8).putInt(this.f6819d).putInt(this.f6820e).array();
        this.f6827l.mo7853a(messageDigest);
        messageDigest.update(this.f6818c.getBytes(C2010c.f6851a));
        messageDigest.update(array);
        messageDigest.update((this.f6821f != null ? this.f6821f.mo7950a() : "").getBytes(C2010c.f6851a));
        messageDigest.update((this.f6822g != null ? this.f6822g.mo7950a() : "").getBytes(C2010c.f6851a));
        messageDigest.update((this.f6823h != null ? this.f6823h.mo7948a() : "").getBytes(C2010c.f6851a));
        messageDigest.update((this.f6824i != null ? this.f6824i.mo7743a() : "").getBytes(C2010c.f6851a));
        messageDigest.update((this.f6826k != null ? this.f6826k.mo7743a() : "").getBytes(C2010c.f6851a));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1998g gVar = (C1998g) obj;
        if (!this.f6818c.equals(gVar.f6818c) || !this.f6827l.equals(gVar.f6827l) || this.f6820e != gVar.f6820e || this.f6819d != gVar.f6819d) {
            return false;
        }
        if ((this.f6823h == null) ^ (gVar.f6823h == null)) {
            return false;
        }
        if (this.f6823h != null && !this.f6823h.mo7948a().equals(gVar.f6823h.mo7948a())) {
            return false;
        }
        if ((this.f6822g == null) ^ (gVar.f6822g == null)) {
            return false;
        }
        if (this.f6822g != null && !this.f6822g.mo7950a().equals(gVar.f6822g.mo7950a())) {
            return false;
        }
        if ((this.f6821f == null) ^ (gVar.f6821f == null)) {
            return false;
        }
        if (this.f6821f != null && !this.f6821f.mo7950a().equals(gVar.f6821f.mo7950a())) {
            return false;
        }
        if ((this.f6824i == null) ^ (gVar.f6824i == null)) {
            return false;
        }
        if (this.f6824i != null && !this.f6824i.mo7743a().equals(gVar.f6824i.mo7743a())) {
            return false;
        }
        if ((this.f6825j == null) ^ (gVar.f6825j == null)) {
            return false;
        }
        if (this.f6825j != null && !this.f6825j.mo8076a().equals(gVar.f6825j.mo8076a())) {
            return false;
        }
        if (!((this.f6826k == null) ^ (gVar.f6826k == null))) {
            return this.f6826k == null || this.f6826k.mo7743a().equals(gVar.f6826k.mo7743a());
        }
        return false;
    }

    public int hashCode() {
        int i = 0;
        if (this.f6829n == 0) {
            this.f6829n = this.f6818c.hashCode();
            this.f6829n = (this.f6829n * 31) + this.f6827l.hashCode();
            this.f6829n = (this.f6829n * 31) + this.f6819d;
            this.f6829n = (this.f6829n * 31) + this.f6820e;
            this.f6829n = (this.f6821f != null ? this.f6821f.mo7950a().hashCode() : 0) + (this.f6829n * 31);
            this.f6829n = (this.f6822g != null ? this.f6822g.mo7950a().hashCode() : 0) + (this.f6829n * 31);
            this.f6829n = (this.f6823h != null ? this.f6823h.mo7948a().hashCode() : 0) + (this.f6829n * 31);
            this.f6829n = (this.f6824i != null ? this.f6824i.mo7743a().hashCode() : 0) + (this.f6829n * 31);
            this.f6829n = (this.f6825j != null ? this.f6825j.mo8076a().hashCode() : 0) + (this.f6829n * 31);
            int i2 = this.f6829n * 31;
            if (this.f6826k != null) {
                i = this.f6826k.mo7743a().hashCode();
            }
            this.f6829n = i2 + i;
        }
        return this.f6829n;
    }

    public String toString() {
        if (this.f6828m == null) {
            this.f6828m = "EngineKey{" + this.f6818c + '+' + this.f6827l + "+[" + this.f6819d + 'x' + this.f6820e + "]+" + '\'' + (this.f6821f != null ? this.f6821f.mo7950a() : "") + '\'' + '+' + '\'' + (this.f6822g != null ? this.f6822g.mo7950a() : "") + '\'' + '+' + '\'' + (this.f6823h != null ? this.f6823h.mo7948a() : "") + '\'' + '+' + '\'' + (this.f6824i != null ? this.f6824i.mo7743a() : "") + '\'' + '+' + '\'' + (this.f6825j != null ? this.f6825j.mo8076a() : "") + '\'' + '+' + '\'' + (this.f6826k != null ? this.f6826k.mo7743a() : "") + '\'' + '}';
        }
        return this.f6828m;
    }
}
