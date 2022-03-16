package com.p048a.p049a.p053d.p060c.p061a;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.p048a.p049a.C2243l;
import com.p048a.p049a.p053d.p060c.C2039c;
import com.p048a.p049a.p053d.p060c.C2055l;
import com.p048a.p049a.p053d.p060c.C2056m;
import com.p048a.p049a.p053d.p060c.C2057n;

/* renamed from: com.a.a.d.c.a.c */
public class C2015c extends C2057n<ParcelFileDescriptor> implements C2014b<Integer> {

    /* renamed from: com.a.a.d.c.a.c$a */
    public static class C2016a implements C2056m<Integer, ParcelFileDescriptor> {
        /* renamed from: a */
        public C2055l<Integer, ParcelFileDescriptor> mo7896a(Context context, C2039c cVar) {
            return new C2015c(context, cVar.mo7910b(Uri.class, ParcelFileDescriptor.class));
        }

        /* renamed from: a */
        public void mo7897a() {
        }
    }

    public C2015c(Context context) {
        this(context, C2243l.m12759b(Uri.class, context));
    }

    public C2015c(Context context, C2055l<Uri, ParcelFileDescriptor> lVar) {
        super(context, lVar);
    }
}
