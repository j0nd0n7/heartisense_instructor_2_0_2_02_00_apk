package com.p048a.p049a.p053d.p054a;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;

/* renamed from: com.a.a.d.a.f */
public class C1900f extends C1905h<ParcelFileDescriptor> {
    public C1900f(Context context, Uri uri) {
        super(context, uri);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public ParcelFileDescriptor mo7728b(Uri uri, ContentResolver contentResolver) {
        return contentResolver.openAssetFileDescriptor(uri, "r").getParcelFileDescriptor();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7727a(ParcelFileDescriptor parcelFileDescriptor) {
        parcelFileDescriptor.close();
    }
}
