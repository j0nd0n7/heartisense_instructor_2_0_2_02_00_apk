package com.p048a.p049a.p053d.p060c.p062b;

import android.content.Context;
import android.net.Uri;
import com.p048a.p049a.p053d.p054a.C1897c;
import com.p048a.p049a.p053d.p054a.C1906i;
import com.p048a.p049a.p053d.p060c.C2055l;
import java.io.InputStream;

/* renamed from: com.a.a.d.c.b.c */
public class C2025c implements C2055l<Uri, InputStream> {

    /* renamed from: a */
    private final Context f6860a;

    /* renamed from: b */
    private final C2055l<Uri, InputStream> f6861b;

    public C2025c(Context context, C2055l<Uri, InputStream> lVar) {
        this.f6860a = context;
        this.f6861b = lVar;
    }

    /* renamed from: a */
    public C1897c<InputStream> mo7901a(Uri uri, int i, int i2) {
        return new C1906i(this.f6860a, uri, this.f6861b.mo7901a(uri, i, i2), i, i2);
    }
}
