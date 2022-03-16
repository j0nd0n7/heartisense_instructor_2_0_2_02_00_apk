package com.p048a.p049a.p053d.p060c.p061a;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.p048a.p049a.C2243l;
import com.p048a.p049a.p053d.p054a.C1897c;
import com.p048a.p049a.p053d.p054a.C1899e;
import com.p048a.p049a.p053d.p054a.C1900f;
import com.p048a.p049a.p053d.p060c.C2039c;
import com.p048a.p049a.p053d.p060c.C2041d;
import com.p048a.p049a.p053d.p060c.C2055l;
import com.p048a.p049a.p053d.p060c.C2056m;
import com.p048a.p049a.p053d.p060c.C2060q;

/* renamed from: com.a.a.d.c.a.e */
public class C2019e extends C2060q<ParcelFileDescriptor> implements C2014b<Uri> {

    /* renamed from: com.a.a.d.c.a.e$a */
    public static class C2020a implements C2056m<Uri, ParcelFileDescriptor> {
        /* renamed from: a */
        public C2055l<Uri, ParcelFileDescriptor> mo7896a(Context context, C2039c cVar) {
            return new C2019e(context, cVar.mo7910b(C2041d.class, ParcelFileDescriptor.class));
        }

        /* renamed from: a */
        public void mo7897a() {
        }
    }

    public C2019e(Context context) {
        this(context, C2243l.m12759b(C2041d.class, context));
    }

    public C2019e(Context context, C2055l<C2041d, ParcelFileDescriptor> lVar) {
        super(context, lVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C1897c<ParcelFileDescriptor> mo7898a(Context context, Uri uri) {
        return new C1900f(context, uri);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C1897c<ParcelFileDescriptor> mo7899a(Context context, String str) {
        return new C1899e(context.getApplicationContext().getAssets(), str);
    }
}
