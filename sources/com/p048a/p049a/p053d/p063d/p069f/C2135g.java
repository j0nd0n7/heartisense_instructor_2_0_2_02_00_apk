package com.p048a.p049a.p053d.p063d.p069f;

import android.graphics.Bitmap;
import com.p048a.p049a.p053d.C1915b;
import com.p048a.p049a.p053d.C2144e;
import com.p048a.p049a.p053d.C2145f;
import com.p048a.p049a.p053d.p055b.p056a.C1921c;
import com.p048a.p049a.p053d.p060c.C2046g;
import com.p048a.p049a.p053d.p063d.p067d.C2101c;
import com.p048a.p049a.p053d.p063d.p068e.C2108b;
import com.p048a.p049a.p073g.C2173b;
import java.io.File;
import java.io.InputStream;

/* renamed from: com.a.a.d.d.f.g */
public class C2135g implements C2173b<C2046g, C2127a> {

    /* renamed from: a */
    private final C2144e<File, C2127a> f7097a;

    /* renamed from: b */
    private final C2144e<C2046g, C2127a> f7098b;

    /* renamed from: c */
    private final C2145f<C2127a> f7099c;

    /* renamed from: d */
    private final C1915b<C2046g> f7100d;

    public C2135g(C2173b<C2046g, Bitmap> bVar, C2173b<InputStream, C2108b> bVar2, C1921c cVar) {
        C2129c cVar2 = new C2129c(bVar.mo7960b(), bVar2.mo7960b(), cVar);
        this.f7097a = new C2101c(new C2133e(cVar2));
        this.f7098b = cVar2;
        this.f7099c = new C2132d(bVar.mo7962d(), bVar2.mo7962d());
        this.f7100d = bVar.mo7961c();
    }

    /* renamed from: a */
    public C2144e<File, C2127a> mo7959a() {
        return this.f7097a;
    }

    /* renamed from: b */
    public C2144e<C2046g, C2127a> mo7960b() {
        return this.f7098b;
    }

    /* renamed from: c */
    public C1915b<C2046g> mo7961c() {
        return this.f7100d;
    }

    /* renamed from: d */
    public C2145f<C2127a> mo7962d() {
        return this.f7099c;
    }
}
