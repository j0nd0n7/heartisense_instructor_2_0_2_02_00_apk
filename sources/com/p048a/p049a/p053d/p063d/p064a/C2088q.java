package com.p048a.p049a.p053d.p063d.p064a;

import android.graphics.Bitmap;
import com.p048a.p049a.p053d.C1894a;
import com.p048a.p049a.p053d.C1915b;
import com.p048a.p049a.p053d.C2144e;
import com.p048a.p049a.p053d.C2145f;
import com.p048a.p049a.p053d.p055b.p056a.C1921c;
import com.p048a.p049a.p053d.p060c.C2058o;
import com.p048a.p049a.p053d.p063d.p067d.C2101c;
import com.p048a.p049a.p073g.C2173b;
import java.io.File;
import java.io.InputStream;

/* renamed from: com.a.a.d.d.a.q */
public class C2088q implements C2173b<InputStream, Bitmap> {

    /* renamed from: a */
    private final C2089r f6988a;

    /* renamed from: b */
    private final C2066c f6989b;

    /* renamed from: c */
    private final C2058o f6990c = new C2058o();

    /* renamed from: d */
    private final C2101c<Bitmap> f6991d;

    public C2088q(C1921c cVar, C1894a aVar) {
        this.f6988a = new C2089r(cVar, aVar);
        this.f6989b = new C2066c();
        this.f6991d = new C2101c<>(this.f6988a);
    }

    /* renamed from: a */
    public C2144e<File, Bitmap> mo7959a() {
        return this.f6991d;
    }

    /* renamed from: b */
    public C2144e<InputStream, Bitmap> mo7960b() {
        return this.f6988a;
    }

    /* renamed from: c */
    public C1915b<InputStream> mo7961c() {
        return this.f6990c;
    }

    /* renamed from: d */
    public C2145f<Bitmap> mo7962d() {
        return this.f6989b;
    }
}
