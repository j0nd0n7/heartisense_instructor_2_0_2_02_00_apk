package com.p048a.p049a.p053d.p060c.p062b;

import android.content.Context;
import com.p048a.p049a.p053d.p054a.C1897c;
import com.p048a.p049a.p053d.p054a.C1901g;
import com.p048a.p049a.p053d.p060c.C2039c;
import com.p048a.p049a.p053d.p060c.C2041d;
import com.p048a.p049a.p053d.p060c.C2052k;
import com.p048a.p049a.p053d.p060c.C2055l;
import com.p048a.p049a.p053d.p060c.C2056m;
import java.io.InputStream;

/* renamed from: com.a.a.d.c.b.b */
public class C2023b implements C2055l<C2041d, InputStream> {

    /* renamed from: a */
    private final C2052k<C2041d, C2041d> f6858a;

    /* renamed from: com.a.a.d.c.b.b$a */
    public static class C2024a implements C2056m<C2041d, InputStream> {

        /* renamed from: a */
        private final C2052k<C2041d, C2041d> f6859a = new C2052k<>(500);

        /* renamed from: a */
        public C2055l<C2041d, InputStream> mo7896a(Context context, C2039c cVar) {
            return new C2023b(this.f6859a);
        }

        /* renamed from: a */
        public void mo7897a() {
        }
    }

    public C2023b() {
        this((C2052k<C2041d, C2041d>) null);
    }

    public C2023b(C2052k<C2041d, C2041d> kVar) {
        this.f6858a = kVar;
    }

    /* renamed from: a */
    public C1897c<InputStream> mo7901a(C2041d dVar, int i, int i2) {
        if (this.f6858a != null) {
            C2041d a = this.f6858a.mo7936a(dVar, 0, 0);
            if (a == null) {
                this.f6858a.mo7937a(dVar, 0, 0, dVar);
            } else {
                dVar = a;
            }
        }
        return new C1901g(dVar);
    }
}
