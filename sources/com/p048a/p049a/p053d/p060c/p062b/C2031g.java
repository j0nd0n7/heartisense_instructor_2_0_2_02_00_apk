package com.p048a.p049a.p053d.p060c.p062b;

import android.content.Context;
import android.net.Uri;
import com.p048a.p049a.C2243l;
import com.p048a.p049a.p053d.p060c.C2039c;
import com.p048a.p049a.p053d.p060c.C2055l;
import com.p048a.p049a.p053d.p060c.C2056m;
import com.p048a.p049a.p053d.p060c.C2057n;
import java.io.InputStream;

/* renamed from: com.a.a.d.c.b.g */
public class C2031g extends C2057n<InputStream> implements C2030f<Integer> {

    /* renamed from: com.a.a.d.c.b.g$a */
    public static class C2032a implements C2056m<Integer, InputStream> {
        /* renamed from: a */
        public C2055l<Integer, InputStream> mo7896a(Context context, C2039c cVar) {
            return new C2031g(context, cVar.mo7910b(Uri.class, InputStream.class));
        }

        /* renamed from: a */
        public void mo7897a() {
        }
    }

    public C2031g(Context context) {
        this(context, C2243l.m12744a(Uri.class, context));
    }

    public C2031g(Context context, C2055l<Uri, InputStream> lVar) {
        super(context, lVar);
    }
}
