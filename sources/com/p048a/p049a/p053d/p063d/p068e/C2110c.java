package com.p048a.p049a.p053d.p063d.p068e;

import android.content.Context;
import com.p048a.p049a.p053d.C1915b;
import com.p048a.p049a.p053d.C2144e;
import com.p048a.p049a.p053d.C2145f;
import com.p048a.p049a.p053d.p055b.p056a.C1921c;
import com.p048a.p049a.p053d.p060c.C2058o;
import com.p048a.p049a.p053d.p063d.p067d.C2101c;
import com.p048a.p049a.p073g.C2173b;
import java.io.File;
import java.io.InputStream;

/* renamed from: com.a.a.d.d.e.c */
public class C2110c implements C2173b<InputStream, C2108b> {

    /* renamed from: a */
    private final C2122i f7040a;

    /* renamed from: b */
    private final C2125j f7041b;

    /* renamed from: c */
    private final C2058o f7042c;

    /* renamed from: d */
    private final C2101c<C2108b> f7043d = new C2101c<>(this.f7040a);

    public C2110c(Context context, C1921c cVar) {
        this.f7040a = new C2122i(context, cVar);
        this.f7041b = new C2125j(cVar);
        this.f7042c = new C2058o();
    }

    /* renamed from: a */
    public C2144e<File, C2108b> mo7959a() {
        return this.f7043d;
    }

    /* renamed from: b */
    public C2144e<InputStream, C2108b> mo7960b() {
        return this.f7040a;
    }

    /* renamed from: c */
    public C1915b<InputStream> mo7961c() {
        return this.f7042c;
    }

    /* renamed from: d */
    public C2145f<C2108b> mo7962d() {
        return this.f7041b;
    }
}
