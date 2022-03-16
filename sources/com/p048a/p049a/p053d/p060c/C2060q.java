package com.p048a.p049a.p053d.p060c;

import android.content.Context;
import android.net.Uri;
import com.p048a.p049a.p053d.p054a.C1897c;

/* renamed from: com.a.a.d.c.q */
public abstract class C2060q<T> implements C2055l<Uri, T> {

    /* renamed from: a */
    private final Context f6909a;

    /* renamed from: b */
    private final C2055l<C2041d, T> f6910b;

    public C2060q(Context context, C2055l<C2041d, T> lVar) {
        this.f6909a = context;
        this.f6910b = lVar;
    }

    /* renamed from: a */
    private static boolean m11940a(String str) {
        return "file".equals(str) || "content".equals(str) || "android.resource".equals(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C1897c<T> mo7898a(Context context, Uri uri);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C1897c<T> mo7899a(Context context, String str);

    /* renamed from: a */
    public final C1897c<T> mo7901a(Uri uri, int i, int i2) {
        String scheme = uri.getScheme();
        if (m11940a(scheme)) {
            if (!C2011a.m11843a(uri)) {
                return mo7898a(this.f6909a, uri);
            }
            return mo7899a(this.f6909a, C2011a.m11844b(uri));
        } else if (this.f6910b == null) {
            return null;
        } else {
            if ("http".equals(scheme) || "https".equals(scheme)) {
                return this.f6910b.mo7901a(new C2041d(uri.toString()), i, i2);
            }
            return null;
        }
    }
}
