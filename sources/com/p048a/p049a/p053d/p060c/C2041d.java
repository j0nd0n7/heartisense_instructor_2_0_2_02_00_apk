package com.p048a.p049a.p053d.p060c;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.util.Map;

/* renamed from: com.a.a.d.c.d */
public class C2041d {

    /* renamed from: a */
    private static final String f6867a = "@#&=*+-_.,:!?()/~'%";

    /* renamed from: b */
    private final URL f6868b;

    /* renamed from: c */
    private final C2042e f6869c;

    /* renamed from: d */
    private final String f6870d;

    /* renamed from: e */
    private String f6871e;

    /* renamed from: f */
    private URL f6872f;

    public C2041d(String str) {
        this(str, C2042e.f6874b);
    }

    public C2041d(String str, C2042e eVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("String url must not be empty or null: " + str);
        } else if (eVar == null) {
            throw new IllegalArgumentException("Headers must not be null");
        } else {
            this.f6870d = str;
            this.f6868b = null;
            this.f6869c = eVar;
        }
    }

    public C2041d(URL url) {
        this(url, C2042e.f6874b);
    }

    public C2041d(URL url, C2042e eVar) {
        if (url == null) {
            throw new IllegalArgumentException("URL must not be null!");
        } else if (eVar == null) {
            throw new IllegalArgumentException("Headers must not be null");
        } else {
            this.f6868b = url;
            this.f6870d = null;
            this.f6869c = eVar;
        }
    }

    /* renamed from: e */
    private URL m11891e() {
        if (this.f6872f == null) {
            this.f6872f = new URL(m11892f());
        }
        return this.f6872f;
    }

    /* renamed from: f */
    private String m11892f() {
        if (TextUtils.isEmpty(this.f6871e)) {
            String str = this.f6870d;
            if (TextUtils.isEmpty(str)) {
                str = this.f6868b.toString();
            }
            this.f6871e = Uri.encode(str, f6867a);
        }
        return this.f6871e;
    }

    /* renamed from: a */
    public URL mo7912a() {
        return m11891e();
    }

    /* renamed from: b */
    public String mo7913b() {
        return m11892f();
    }

    /* renamed from: c */
    public Map<String, String> mo7914c() {
        return this.f6869c.mo7919a();
    }

    /* renamed from: d */
    public String mo7915d() {
        return this.f6870d != null ? this.f6870d : this.f6868b.toString();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2041d)) {
            return false;
        }
        C2041d dVar = (C2041d) obj;
        return mo7915d().equals(dVar.mo7915d()) && this.f6869c.equals(dVar.f6869c);
    }

    public int hashCode() {
        return (mo7915d().hashCode() * 31) + this.f6869c.hashCode();
    }

    public String toString() {
        return mo7915d() + 10 + this.f6869c.toString();
    }
}
