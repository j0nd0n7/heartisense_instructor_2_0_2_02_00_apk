package com.p048a.p049a.p053d.p060c.p062b;

import android.content.Context;
import android.net.Uri;
import com.p048a.p049a.C2243l;
import com.p048a.p049a.p053d.p060c.C2021b;
import com.p048a.p049a.p053d.p060c.C2039c;
import com.p048a.p049a.p053d.p060c.C2055l;
import com.p048a.p049a.p053d.p060c.C2056m;
import java.io.File;
import java.io.InputStream;

/* renamed from: com.a.a.d.c.b.e */
public class C2028e extends C2021b<InputStream> implements C2030f<File> {

    /* renamed from: com.a.a.d.c.b.e$a */
    public static class C2029a implements C2056m<File, InputStream> {
        /* renamed from: a */
        public C2055l<File, InputStream> mo7896a(Context context, C2039c cVar) {
            return new C2028e((C2055l<Uri, InputStream>) cVar.mo7910b(Uri.class, InputStream.class));
        }

        /* renamed from: a */
        public void mo7897a() {
        }
    }

    public C2028e(Context context) {
        this(C2243l.m12744a(Uri.class, context));
    }

    public C2028e(C2055l<Uri, InputStream> lVar) {
        super(lVar);
    }
}
