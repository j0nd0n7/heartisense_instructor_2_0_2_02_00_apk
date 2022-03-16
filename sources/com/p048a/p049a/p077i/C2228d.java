package com.p048a.p049a.p077i;

import com.p048a.p049a.p053d.C2010c;
import java.security.MessageDigest;

/* renamed from: com.a.a.i.d */
public class C2228d implements C2010c {

    /* renamed from: b */
    private final String f7309b;

    public C2228d(String str) {
        if (str == null) {
            throw new NullPointerException("Signature cannot be null!");
        }
        this.f7309b = str;
    }

    /* renamed from: a */
    public void mo7853a(MessageDigest messageDigest) {
        messageDigest.update(this.f7309b.getBytes(C2010c.f6851a));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f7309b.equals(((C2228d) obj).f7309b);
    }

    public int hashCode() {
        return this.f7309b.hashCode();
    }

    public String toString() {
        return "StringSignature{signature='" + this.f7309b + '\'' + '}';
    }
}
