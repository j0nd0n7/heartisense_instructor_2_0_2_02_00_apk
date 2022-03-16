package com.p048a.p049a.p053d.p054a;

import android.content.res.AssetManager;
import java.io.InputStream;

/* renamed from: com.a.a.d.a.j */
public class C1913j extends C1895a<InputStream> {
    public C1913j(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7713a(InputStream inputStream) {
        inputStream.close();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public InputStream mo7710a(AssetManager assetManager, String str) {
        return assetManager.open(str);
    }
}
