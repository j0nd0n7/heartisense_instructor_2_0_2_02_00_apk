package com.p048a.p049a;

import android.os.ParcelFileDescriptor;
import com.p048a.p049a.C2256q;
import com.p048a.p049a.p053d.p060c.C2044f;
import com.p048a.p049a.p053d.p060c.C2046g;
import com.p048a.p049a.p053d.p060c.C2055l;
import com.p048a.p049a.p053d.p063d.p070g.C2141f;
import com.p048a.p049a.p073g.C2176e;
import com.p048a.p049a.p074h.C2181a;
import com.p048a.p049a.p074h.p076b.C2213m;
import java.io.File;
import java.io.InputStream;

/* renamed from: com.a.a.g */
public class C2171g<ModelType> extends C2168f<ModelType> implements C1893d {

    /* renamed from: g */
    private final C2055l<ModelType, InputStream> f7145g;

    /* renamed from: h */
    private final C2055l<ModelType, ParcelFileDescriptor> f7146h;

    /* renamed from: i */
    private final C2256q.C2262d f7147i;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C2171g(java.lang.Class<ModelType> r8, com.p048a.p049a.p053d.p060c.C2055l<ModelType, java.io.InputStream> r9, com.p048a.p049a.p053d.p060c.C2055l<ModelType, android.os.ParcelFileDescriptor> r10, android.content.Context r11, com.p048a.p049a.C2243l r12, com.p048a.p049a.p071e.C2164m r13, com.p048a.p049a.p071e.C2156g r14, com.p048a.p049a.C2256q.C2262d r15) {
        /*
            r7 = this;
            java.lang.Class<com.a.a.d.d.f.a> r3 = com.p048a.p049a.p053d.p063d.p069f.C2127a.class
            java.lang.Class<com.a.a.d.d.c.b> r4 = com.p048a.p049a.p053d.p063d.p066c.C2097b.class
            r5 = 0
            r0 = r12
            r1 = r9
            r2 = r10
            com.a.a.g.e r3 = m12362a(r0, r1, r2, r3, r4, r5)
            r0 = r7
            r1 = r11
            r2 = r8
            r4 = r12
            r5 = r13
            r6 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.f7145g = r9
            r7.f7146h = r10
            r7.f7147i = r15
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p048a.p049a.C2171g.<init>(java.lang.Class, com.a.a.d.c.l, com.a.a.d.c.l, android.content.Context, com.a.a.l, com.a.a.e.m, com.a.a.e.g, com.a.a.q$d):void");
    }

    /* renamed from: a */
    private static <A, Z, R> C2176e<A, C2046g, Z, R> m12362a(C2243l lVar, C2055l<A, InputStream> lVar2, C2055l<A, ParcelFileDescriptor> lVar3, Class<Z> cls, Class<R> cls2, C2141f<Z, R> fVar) {
        if (lVar2 == null && lVar3 == null) {
            return null;
        }
        if (fVar == null) {
            fVar = lVar.mo8353a(cls, cls2);
        }
        return new C2176e<>(new C2044f(lVar2, lVar3), fVar, lVar.mo8359b(C2046g.class, cls));
    }

    /* renamed from: r */
    private C2224i<ModelType, InputStream, File> m12363r() {
        return (C2224i) this.f7147i.mo8426a(new C2224i(File.class, this, this.f7145g, InputStream.class, File.class, this.f7147i));
    }

    /* renamed from: a */
    public C2181a<File> mo7708a(int i, int i2) {
        return m12363r().mo7708a(i, i2);
    }

    /* renamed from: a */
    public <Y extends C2213m<File>> Y mo7709a(Y y) {
        return m12363r().mo7709a(y);
    }

    /* renamed from: j */
    public C1889c<ModelType> mo8167j() {
        return (C1889c) this.f7147i.mo8426a(new C1889c(this, this.f7145g, this.f7146h, this.f7147i));
    }

    /* renamed from: p */
    public C2242k<ModelType> mo8168p() {
        return (C2242k) this.f7147i.mo8426a(new C2242k(this, this.f7145g, this.f7147i));
    }
}
