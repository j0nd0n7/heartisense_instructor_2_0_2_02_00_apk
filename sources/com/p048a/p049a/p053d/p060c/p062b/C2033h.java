package com.p048a.p049a.p053d.p060c.p062b;

import android.content.Context;
import android.net.Uri;
import com.p048a.p049a.C2243l;
import com.p048a.p049a.p053d.p060c.C2039c;
import com.p048a.p049a.p053d.p060c.C2055l;
import com.p048a.p049a.p053d.p060c.C2056m;
import com.p048a.p049a.p053d.p060c.C2059p;
import java.io.InputStream;

/* renamed from: com.a.a.d.c.b.h */
public class C2033h extends C2059p<InputStream> implements C2030f<String> {

    /* renamed from: com.a.a.d.c.b.h$a */
    public static class C2034a implements C2056m<String, InputStream> {
        /* renamed from: a */
        public C2055l<String, InputStream> mo7896a(Context context, C2039c cVar) {
            return new C2033h((C2055l<Uri, InputStream>) cVar.mo7910b(Uri.class, InputStream.class));
        }

        /* renamed from: a */
        public void mo7897a() {
        }
    }

    public C2033h(Context context) {
        this(C2243l.m12744a(Uri.class, context));
    }

    public C2033h(C2055l<Uri, InputStream> lVar) {
        super(lVar);
    }
}
