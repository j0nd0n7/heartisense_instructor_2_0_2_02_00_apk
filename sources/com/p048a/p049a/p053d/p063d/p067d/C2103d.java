package com.p048a.p049a.p053d.p063d.p067d;

import com.p048a.p049a.p053d.C1915b;
import com.p048a.p049a.p053d.C2144e;
import com.p048a.p049a.p053d.C2145f;
import com.p048a.p049a.p053d.p055b.C2006l;
import com.p048a.p049a.p053d.p060c.C2058o;
import com.p048a.p049a.p053d.p063d.C2095c;
import com.p048a.p049a.p073g.C2173b;
import java.io.File;
import java.io.InputStream;

/* renamed from: com.a.a.d.d.d.d */
public class C2103d implements C2173b<InputStream, File> {

    /* renamed from: a */
    private static final C2105a f7013a = new C2105a();

    /* renamed from: b */
    private final C2144e<File, File> f7014b = new C2099a();

    /* renamed from: c */
    private final C1915b<InputStream> f7015c = new C2058o();

    /* renamed from: com.a.a.d.d.d.d$a */
    private static class C2105a implements C2144e<InputStream, File> {
        private C2105a() {
        }

        /* renamed from: a */
        public C2006l<File> mo7949a(InputStream inputStream, int i, int i2) {
            throw new Error("You cannot decode a File from an InputStream by default, try either #diskCacheStratey(DiskCacheStrategy.SOURCE) to avoid this call or #decoder(ResourceDecoder) to replace this Decoder");
        }

        /* renamed from: a */
        public String mo7950a() {
            return "";
        }
    }

    /* renamed from: a */
    public C2144e<File, File> mo7959a() {
        return this.f7014b;
    }

    /* renamed from: b */
    public C2144e<InputStream, File> mo7960b() {
        return f7013a;
    }

    /* renamed from: c */
    public C1915b<InputStream> mo7961c() {
        return this.f7015c;
    }

    /* renamed from: d */
    public C2145f<File> mo7962d() {
        return C2095c.m12064b();
    }
}
