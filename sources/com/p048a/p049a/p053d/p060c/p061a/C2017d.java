package com.p048a.p049a.p053d.p060c.p061a;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.p048a.p049a.C2243l;
import com.p048a.p049a.p053d.p060c.C2039c;
import com.p048a.p049a.p053d.p060c.C2055l;
import com.p048a.p049a.p053d.p060c.C2056m;
import com.p048a.p049a.p053d.p060c.C2059p;

/* renamed from: com.a.a.d.c.a.d */
public class C2017d extends C2059p<ParcelFileDescriptor> implements C2014b<String> {

    /* renamed from: com.a.a.d.c.a.d$a */
    public static class C2018a implements C2056m<String, ParcelFileDescriptor> {
        /* renamed from: a */
        public C2055l<String, ParcelFileDescriptor> mo7896a(Context context, C2039c cVar) {
            return new C2017d((C2055l<Uri, ParcelFileDescriptor>) cVar.mo7910b(Uri.class, ParcelFileDescriptor.class));
        }

        /* renamed from: a */
        public void mo7897a() {
        }
    }

    public C2017d(Context context) {
        this(C2243l.m12759b(Uri.class, context));
    }

    public C2017d(C2055l<Uri, ParcelFileDescriptor> lVar) {
        super(lVar);
    }
}
