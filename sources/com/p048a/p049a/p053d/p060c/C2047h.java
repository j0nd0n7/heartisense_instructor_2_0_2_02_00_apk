package com.p048a.p049a.p053d.p060c;

import android.os.ParcelFileDescriptor;
import com.p048a.p049a.p053d.C1915b;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.a.a.d.c.h */
public class C2047h implements C1915b<C2046g> {

    /* renamed from: a */
    private final C1915b<InputStream> f6882a;

    /* renamed from: b */
    private final C1915b<ParcelFileDescriptor> f6883b;

    /* renamed from: c */
    private String f6884c;

    public C2047h(C1915b<InputStream> bVar, C1915b<ParcelFileDescriptor> bVar2) {
        this.f6882a = bVar;
        this.f6883b = bVar2;
    }

    /* renamed from: a */
    public String mo7743a() {
        if (this.f6884c == null) {
            this.f6884c = this.f6882a.mo7743a() + this.f6883b.mo7743a();
        }
        return this.f6884c;
    }

    /* renamed from: a */
    public boolean mo7744a(C2046g gVar, OutputStream outputStream) {
        return gVar.mo7921a() != null ? this.f6882a.mo7744a(gVar.mo7921a(), outputStream) : this.f6883b.mo7744a(gVar.mo7922b(), outputStream);
    }
}
