package com.p048a.p049a.p053d.p060c.p061a;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.p048a.p049a.C2243l;
import com.p048a.p049a.p053d.p060c.C2021b;
import com.p048a.p049a.p053d.p060c.C2039c;
import com.p048a.p049a.p053d.p060c.C2055l;
import com.p048a.p049a.p053d.p060c.C2056m;
import java.io.File;

/* renamed from: com.a.a.d.c.a.a */
public class C2012a extends C2021b<ParcelFileDescriptor> implements C2014b<File> {

    /* renamed from: com.a.a.d.c.a.a$a */
    public static class C2013a implements C2056m<File, ParcelFileDescriptor> {
        /* renamed from: a */
        public C2055l<File, ParcelFileDescriptor> mo7896a(Context context, C2039c cVar) {
            return new C2012a((C2055l<Uri, ParcelFileDescriptor>) cVar.mo7910b(Uri.class, ParcelFileDescriptor.class));
        }

        /* renamed from: a */
        public void mo7897a() {
        }
    }

    public C2012a(Context context) {
        this(C2243l.m12759b(Uri.class, context));
    }

    public C2012a(C2055l<Uri, ParcelFileDescriptor> lVar) {
        super(lVar);
    }
}
