package com.p048a.p049a.p053d.p055b.p057b;

import com.p048a.p049a.p053d.C2010c;
import com.p048a.p049a.p078j.C2235f;
import com.p048a.p049a.p078j.C2238i;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.a.a.d.b.b.l */
class C1968l {

    /* renamed from: a */
    private final C2235f<C2010c, String> f6727a = new C2235f<>(1000);

    C1968l() {
    }

    /* renamed from: a */
    public String mo7828a(C2010c cVar) {
        String c;
        synchronized (this.f6727a) {
            c = this.f6727a.mo8337c(cVar);
        }
        if (c == null) {
            try {
                MessageDigest instance = MessageDigest.getInstance("SHA-256");
                cVar.mo7853a(instance);
                c = C2238i.m12725a(instance.digest());
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            } catch (NoSuchAlgorithmException e2) {
                e2.printStackTrace();
            }
            synchronized (this.f6727a) {
                this.f6727a.mo8334b(cVar, c);
            }
        }
        return c;
    }
}
