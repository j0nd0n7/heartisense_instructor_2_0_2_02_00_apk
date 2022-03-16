package com.p048a.p049a.p053d.p063d.p069f;

import android.os.ParcelFileDescriptor;
import com.p048a.p049a.p053d.C2144e;
import com.p048a.p049a.p053d.p055b.C2006l;
import com.p048a.p049a.p053d.p060c.C2046g;
import java.io.InputStream;

/* renamed from: com.a.a.d.d.f.e */
public class C2133e implements C2144e<InputStream, C2127a> {

    /* renamed from: a */
    private final C2144e<C2046g, C2127a> f7094a;

    public C2133e(C2144e<C2046g, C2127a> eVar) {
        this.f7094a = eVar;
    }

    /* renamed from: a */
    public C2006l<C2127a> mo7949a(InputStream inputStream, int i, int i2) {
        return this.f7094a.mo7949a(new C2046g(inputStream, (ParcelFileDescriptor) null), i, i2);
    }

    /* renamed from: a */
    public String mo7950a() {
        return this.f7094a.mo7950a();
    }
}
