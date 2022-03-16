package com.p048a.p049a.p053d.p055b;

import com.p048a.p049a.p053d.C2010c;
import java.security.MessageDigest;

/* renamed from: com.a.a.d.b.k */
class C2005k implements C2010c {

    /* renamed from: b */
    private final String f6846b;

    /* renamed from: c */
    private final C2010c f6847c;

    public C2005k(String str, C2010c cVar) {
        this.f6846b = str;
        this.f6847c = cVar;
    }

    /* renamed from: a */
    public void mo7853a(MessageDigest messageDigest) {
        messageDigest.update(this.f6846b.getBytes(C2010c.f6851a));
        this.f6847c.mo7853a(messageDigest);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2005k kVar = (C2005k) obj;
        if (!this.f6846b.equals(kVar.f6846b)) {
            return false;
        }
        return this.f6847c.equals(kVar.f6847c);
    }

    public int hashCode() {
        return (this.f6846b.hashCode() * 31) + this.f6847c.hashCode();
    }
}
