package com.p048a.p049a.p053d.p060c.p062b;

import android.content.Context;
import com.p048a.p049a.p053d.p054a.C1896b;
import com.p048a.p049a.p053d.p054a.C1897c;
import com.p048a.p049a.p053d.p060c.C2039c;
import com.p048a.p049a.p053d.p060c.C2055l;
import com.p048a.p049a.p053d.p060c.C2056m;
import java.io.InputStream;

/* renamed from: com.a.a.d.c.b.d */
public class C2026d implements C2030f<byte[]> {

    /* renamed from: a */
    private final String f6862a;

    /* renamed from: com.a.a.d.c.b.d$a */
    public static class C2027a implements C2056m<byte[], InputStream> {
        /* renamed from: a */
        public C2055l<byte[], InputStream> mo7896a(Context context, C2039c cVar) {
            return new C2026d();
        }

        /* renamed from: a */
        public void mo7897a() {
        }
    }

    public C2026d() {
        this("");
    }

    @Deprecated
    public C2026d(String str) {
        this.f6862a = str;
    }

    /* renamed from: a */
    public C1897c<InputStream> mo7901a(byte[] bArr, int i, int i2) {
        return new C1896b(bArr, this.f6862a);
    }
}
