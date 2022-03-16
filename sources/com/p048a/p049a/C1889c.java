package com.p048a.p049a;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import com.p048a.p049a.C2256q;
import com.p048a.p049a.p053d.p060c.C2055l;
import com.p048a.p049a.p053d.p063d.p070g.C2136a;
import com.p048a.p049a.p053d.p063d.p070g.C2141f;
import java.io.InputStream;

/* renamed from: com.a.a.c */
public class C1889c<ModelType> extends C1883b<ModelType, Bitmap> {

    /* renamed from: g */
    private final C2055l<ModelType, InputStream> f6489g;

    /* renamed from: h */
    private final C2055l<ModelType, ParcelFileDescriptor> f6490h;

    /* renamed from: i */
    private final C2243l f6491i;

    /* renamed from: j */
    private final C2256q.C2262d f6492j;

    C1889c(C2178h<ModelType, ?, ?, ?> hVar, C2055l<ModelType, InputStream> lVar, C2055l<ModelType, ParcelFileDescriptor> lVar2, C2256q.C2262d dVar) {
        super(m11459a(hVar.f7165c, lVar, lVar2, Bitmap.class, (C2141f) null), Bitmap.class, hVar);
        this.f6489g = lVar;
        this.f6490h = lVar2;
        this.f6491i = hVar.f7165c;
        this.f6492j = dVar;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.Class, java.lang.Class<R>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static <A, R> com.p048a.p049a.p073g.C2176e<A, com.p048a.p049a.p053d.p060c.C2046g, android.graphics.Bitmap, R> m11459a(com.p048a.p049a.C2243l r3, com.p048a.p049a.p053d.p060c.C2055l<A, java.io.InputStream> r4, com.p048a.p049a.p053d.p060c.C2055l<A, android.os.ParcelFileDescriptor> r5, java.lang.Class<R> r6, com.p048a.p049a.p053d.p063d.p070g.C2141f<android.graphics.Bitmap, R> r7) {
        /*
            if (r4 != 0) goto L_0x0006
            if (r5 != 0) goto L_0x0006
            r0 = 0
        L_0x0005:
            return r0
        L_0x0006:
            if (r7 != 0) goto L_0x000e
            java.lang.Class<android.graphics.Bitmap> r0 = android.graphics.Bitmap.class
            com.a.a.d.d.g.f r7 = r3.mo8353a(r0, r6)
        L_0x000e:
            java.lang.Class<com.a.a.d.c.g> r0 = com.p048a.p049a.p053d.p060c.C2046g.class
            java.lang.Class<android.graphics.Bitmap> r1 = android.graphics.Bitmap.class
            com.a.a.g.b r1 = r3.mo8359b(r0, r1)
            com.a.a.d.c.f r2 = new com.a.a.d.c.f
            r2.<init>(r4, r5)
            com.a.a.g.e r0 = new com.a.a.g.e
            r0.<init>(r2, r7, r1)
            goto L_0x0005
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p048a.p049a.C1889c.m11459a(com.a.a.l, com.a.a.d.c.l, com.a.a.d.c.l, java.lang.Class, com.a.a.d.d.g.f):com.a.a.g.e");
    }

    /* renamed from: a */
    public C1883b<ModelType, byte[]> mo7677a(Bitmap.CompressFormat compressFormat, int i) {
        return mo7678a(new C2136a(compressFormat, i), byte[].class);
    }

    /* renamed from: a */
    public <R> C1883b<ModelType, R> mo7678a(C2141f<Bitmap, R> fVar, Class<R> cls) {
        return (C1883b) this.f6492j.mo8426a(new C1883b(m11459a(this.f6491i, this.f6489g, this.f6490h, cls, fVar), cls, this));
    }

    /* renamed from: p */
    public C1883b<ModelType, byte[]> mo7679p() {
        return mo7678a(new C2136a(), byte[].class);
    }
}
