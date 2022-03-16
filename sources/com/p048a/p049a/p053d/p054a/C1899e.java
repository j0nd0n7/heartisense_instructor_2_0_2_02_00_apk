package com.p048a.p049a.p053d.p054a;

import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;

/* renamed from: com.a.a.d.a.e */
public class C1899e extends C1895a<ParcelFileDescriptor> {
    public C1899e(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7713a(ParcelFileDescriptor parcelFileDescriptor) {
        parcelFileDescriptor.close();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public ParcelFileDescriptor mo7710a(AssetManager assetManager, String str) {
        return assetManager.openFd(str).getParcelFileDescriptor();
    }
}
