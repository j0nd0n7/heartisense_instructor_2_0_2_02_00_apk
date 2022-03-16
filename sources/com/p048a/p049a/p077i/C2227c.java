package com.p048a.p049a.p077i;

import com.p048a.p049a.p053d.C2010c;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: com.a.a.i.c */
public class C2227c implements C2010c {

    /* renamed from: b */
    private final String f7306b;

    /* renamed from: c */
    private final long f7307c;

    /* renamed from: d */
    private final int f7308d;

    public C2227c(String str, long j, int i) {
        this.f7306b = str;
        this.f7307c = j;
        this.f7308d = i;
    }

    /* renamed from: a */
    public void mo7853a(MessageDigest messageDigest) {
        messageDigest.update(ByteBuffer.allocate(12).putLong(this.f7307c).putInt(this.f7308d).array());
        messageDigest.update(this.f7306b.getBytes(C2010c.f6851a));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2227c cVar = (C2227c) obj;
        if (this.f7307c != cVar.f7307c) {
            return false;
        }
        if (this.f7308d != cVar.f7308d) {
            return false;
        }
        if (this.f7306b != null) {
            if (this.f7306b.equals(cVar.f7306b)) {
                return true;
            }
        } else if (cVar.f7306b == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f7306b != null ? this.f7306b.hashCode() : 0) * 31) + ((int) (this.f7307c ^ (this.f7307c >>> 32)))) * 31) + this.f7308d;
    }
}
