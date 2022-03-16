package com.p048a.p049a.p053d.p063d.p064a;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import com.p048a.p049a.p053d.C1915b;
import com.p048a.p049a.p053d.C2144e;
import com.p048a.p049a.p053d.C2145f;
import com.p048a.p049a.p053d.p060c.C2046g;
import com.p048a.p049a.p053d.p060c.C2047h;
import com.p048a.p049a.p073g.C2173b;
import java.io.File;
import java.io.InputStream;

/* renamed from: com.a.a.d.d.a.o */
public class C2085o implements C2173b<C2046g, Bitmap> {

    /* renamed from: a */
    private final C2084n f6977a;

    /* renamed from: b */
    private final C2144e<File, Bitmap> f6978b;

    /* renamed from: c */
    private final C2145f<Bitmap> f6979c;

    /* renamed from: d */
    private final C2047h f6980d;

    public C2085o(C2173b<InputStream, Bitmap> bVar, C2173b<ParcelFileDescriptor, Bitmap> bVar2) {
        this.f6979c = bVar.mo7962d();
        this.f6980d = new C2047h(bVar.mo7961c(), bVar2.mo7961c());
        this.f6978b = bVar.mo7959a();
        this.f6977a = new C2084n(bVar.mo7960b(), bVar2.mo7960b());
    }

    /* renamed from: a */
    public C2144e<File, Bitmap> mo7959a() {
        return this.f6978b;
    }

    /* renamed from: b */
    public C2144e<C2046g, Bitmap> mo7960b() {
        return this.f6977a;
    }

    /* renamed from: c */
    public C1915b<C2046g> mo7961c() {
        return this.f6980d;
    }

    /* renamed from: d */
    public C2145f<Bitmap> mo7962d() {
        return this.f6979c;
    }
}
