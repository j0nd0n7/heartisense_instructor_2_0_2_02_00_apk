package com.p048a.p049a.p053d.p063d.p064a;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import com.p048a.p049a.p053d.C1894a;
import com.p048a.p049a.p053d.C1915b;
import com.p048a.p049a.p053d.C2144e;
import com.p048a.p049a.p053d.C2145f;
import com.p048a.p049a.p053d.p055b.p056a.C1921c;
import com.p048a.p049a.p053d.p063d.C2093b;
import com.p048a.p049a.p053d.p063d.p067d.C2101c;
import com.p048a.p049a.p073g.C2173b;
import java.io.File;

/* renamed from: com.a.a.d.d.a.h */
public class C2074h implements C2173b<ParcelFileDescriptor, Bitmap> {

    /* renamed from: a */
    private final C2144e<File, Bitmap> f6930a;

    /* renamed from: b */
    private final C2075i f6931b;

    /* renamed from: c */
    private final C2066c f6932c = new C2066c();

    /* renamed from: d */
    private final C1915b<ParcelFileDescriptor> f6933d = C2093b.m12057b();

    public C2074h(C1921c cVar, C1894a aVar) {
        this.f6930a = new C2101c(new C2089r(cVar, aVar));
        this.f6931b = new C2075i(cVar, aVar);
    }

    /* renamed from: a */
    public C2144e<File, Bitmap> mo7959a() {
        return this.f6930a;
    }

    /* renamed from: b */
    public C2144e<ParcelFileDescriptor, Bitmap> mo7960b() {
        return this.f6931b;
    }

    /* renamed from: c */
    public C1915b<ParcelFileDescriptor> mo7961c() {
        return this.f6933d;
    }

    /* renamed from: d */
    public C2145f<Bitmap> mo7962d() {
        return this.f6932c;
    }
}
