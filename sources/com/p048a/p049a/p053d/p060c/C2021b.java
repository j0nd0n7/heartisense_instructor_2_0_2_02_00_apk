package com.p048a.p049a.p053d.p060c;

import android.net.Uri;
import com.p048a.p049a.p053d.p054a.C1897c;
import java.io.File;

/* renamed from: com.a.a.d.c.b */
public class C2021b<T> implements C2055l<File, T> {

    /* renamed from: a */
    private final C2055l<Uri, T> f6855a;

    public C2021b(C2055l<Uri, T> lVar) {
        this.f6855a = lVar;
    }

    /* renamed from: a */
    public C1897c<T> mo7901a(File file, int i, int i2) {
        return this.f6855a.mo7901a(Uri.fromFile(file), i, i2);
    }
}
