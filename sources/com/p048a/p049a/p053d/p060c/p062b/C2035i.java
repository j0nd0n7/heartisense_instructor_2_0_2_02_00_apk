package com.p048a.p049a.p053d.p060c.p062b;

import android.content.Context;
import android.net.Uri;
import com.p048a.p049a.C2243l;
import com.p048a.p049a.p053d.p054a.C1897c;
import com.p048a.p049a.p053d.p054a.C1913j;
import com.p048a.p049a.p053d.p054a.C1914k;
import com.p048a.p049a.p053d.p060c.C2039c;
import com.p048a.p049a.p053d.p060c.C2041d;
import com.p048a.p049a.p053d.p060c.C2055l;
import com.p048a.p049a.p053d.p060c.C2056m;
import com.p048a.p049a.p053d.p060c.C2060q;
import java.io.InputStream;

/* renamed from: com.a.a.d.c.b.i */
public class C2035i extends C2060q<InputStream> implements C2030f<Uri> {

    /* renamed from: com.a.a.d.c.b.i$a */
    public static class C2036a implements C2056m<Uri, InputStream> {
        /* renamed from: a */
        public C2055l<Uri, InputStream> mo7896a(Context context, C2039c cVar) {
            return new C2035i(context, cVar.mo7910b(C2041d.class, InputStream.class));
        }

        /* renamed from: a */
        public void mo7897a() {
        }
    }

    public C2035i(Context context) {
        this(context, C2243l.m12744a(C2041d.class, context));
    }

    public C2035i(Context context, C2055l<C2041d, InputStream> lVar) {
        super(context, lVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C1897c<InputStream> mo7898a(Context context, Uri uri) {
        return new C1914k(context, uri);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C1897c<InputStream> mo7899a(Context context, String str) {
        return new C1913j(context.getApplicationContext().getAssets(), str);
    }
}
