package com.p048a.p049a.p053d.p054a;

import android.content.res.AssetManager;
import android.util.Log;
import com.p048a.p049a.C2255p;
import java.io.IOException;

/* renamed from: com.a.a.d.a.a */
public abstract class C1895a<T> implements C1897c<T> {

    /* renamed from: a */
    private static final String f6583a = "AssetUriFetcher";

    /* renamed from: b */
    private final String f6584b;

    /* renamed from: c */
    private final AssetManager f6585c;

    /* renamed from: d */
    private T f6586d;

    public C1895a(AssetManager assetManager, String str) {
        this.f6585c = assetManager;
        this.f6584b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo7710a(AssetManager assetManager, String str);

    /* renamed from: a */
    public T mo7711a(C2255p pVar) {
        this.f6586d = mo7710a(this.f6585c, this.f6584b);
        return this.f6586d;
    }

    /* renamed from: a */
    public void mo7712a() {
        if (this.f6586d != null) {
            try {
                mo7713a(this.f6586d);
            } catch (IOException e) {
                if (Log.isLoggable(f6583a, 2)) {
                    Log.v(f6583a, "Failed to close data", e);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo7713a(T t);

    /* renamed from: b */
    public String mo7714b() {
        return this.f6584b;
    }

    /* renamed from: c */
    public void mo7715c() {
    }
}
