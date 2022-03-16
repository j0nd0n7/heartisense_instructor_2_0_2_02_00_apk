package com.p048a.p049a;

import android.content.Context;
import com.p048a.p049a.C2256q;
import com.p048a.p049a.p053d.p055b.C1969c;
import com.p048a.p049a.p053d.p060c.C2055l;
import com.p048a.p049a.p053d.p063d.p070g.C2141f;
import com.p048a.p049a.p053d.p063d.p070g.C2143h;
import com.p048a.p049a.p071e.C2156g;
import com.p048a.p049a.p071e.C2164m;
import com.p048a.p049a.p073g.C2176e;
import com.p048a.p049a.p073g.C2177f;
import com.p048a.p049a.p074h.C2181a;
import com.p048a.p049a.p074h.p076b.C2213m;
import java.io.File;

/* renamed from: com.a.a.i */
public class C2224i<ModelType, DataType, ResourceType> extends C2178h<ModelType, DataType, ResourceType, ResourceType> implements C1893d {

    /* renamed from: g */
    private final C2055l<ModelType, DataType> f7300g;

    /* renamed from: h */
    private final Class<DataType> f7301h;

    /* renamed from: i */
    private final Class<ResourceType> f7302i;

    /* renamed from: j */
    private final C2256q.C2262d f7303j;

    C2224i(Context context, C2243l lVar, Class<ModelType> cls, C2055l<ModelType, DataType> lVar2, Class<DataType> cls2, Class<ResourceType> cls3, C2164m mVar, C2156g gVar, C2256q.C2262d dVar) {
        super(context, cls, m12605a(lVar, lVar2, cls2, cls3, C2143h.m12204b()), cls3, lVar, mVar, gVar);
        this.f7300g = lVar2;
        this.f7301h = cls2;
        this.f7302i = cls3;
        this.f7303j = dVar;
    }

    C2224i(Class<ResourceType> cls, C2178h<ModelType, ?, ?, ?> hVar, C2055l<ModelType, DataType> lVar, Class<DataType> cls2, Class<ResourceType> cls3, C2256q.C2262d dVar) {
        super(m12605a(hVar.f7165c, lVar, cls2, cls3, C2143h.m12204b()), cls, hVar);
        this.f7300g = lVar;
        this.f7301h = cls2;
        this.f7302i = cls3;
        this.f7303j = dVar;
    }

    /* renamed from: a */
    private static <A, T, Z, R> C2177f<A, T, Z, R> m12605a(C2243l lVar, C2055l<A, T> lVar2, Class<T> cls, Class<Z> cls2, C2141f<Z, R> fVar) {
        return new C2176e(lVar2, fVar, lVar.mo8359b(cls, cls2));
    }

    /* renamed from: a */
    private C2178h<ModelType, DataType, File, File> m12606a() {
        return this.f7303j.mo8426a(new C2178h(new C2176e(this.f7300g, C2143h.m12204b(), this.f7165c.mo8359b(this.f7301h, File.class)), File.class, this)).mo7618b(C2255p.LOW).mo7610b(C1969c.SOURCE).mo7620b(true);
    }

    /* renamed from: a */
    public C2181a<File> mo7708a(int i, int i2) {
        return m12606a().mo8182f(i, i2);
    }

    /* renamed from: a */
    public <Y extends C2213m<File>> Y mo7709a(Y y) {
        return m12606a().mo8181b(y);
    }

    /* renamed from: a */
    public <TranscodeType> C2178h<ModelType, DataType, ResourceType, TranscodeType> mo8272a(C2141f<ResourceType, TranscodeType> fVar, Class<TranscodeType> cls) {
        return this.f7303j.mo8426a(new C2178h(m12605a(this.f7165c, this.f7300g, this.f7301h, this.f7302i, fVar), cls, this));
    }
}
