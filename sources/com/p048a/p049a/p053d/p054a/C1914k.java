package com.p048a.p049a.p053d.p054a;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import java.io.InputStream;

/* renamed from: com.a.a.d.a.k */
public class C1914k extends C1905h<InputStream> {
    public C1914k(Context context, Uri uri) {
        super(context, uri);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public InputStream mo7728b(Uri uri, ContentResolver contentResolver) {
        return contentResolver.openInputStream(uri);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7727a(InputStream inputStream) {
        inputStream.close();
    }
}
