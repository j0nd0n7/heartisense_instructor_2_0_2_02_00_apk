package com.p048a.p049a.p053d.p054a;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.p048a.p049a.C2255p;
import java.io.IOException;

/* renamed from: com.a.a.d.a.h */
public abstract class C1905h<T> implements C1897c<T> {

    /* renamed from: a */
    private static final String f6603a = "LocalUriFetcher";

    /* renamed from: b */
    private final Uri f6604b;

    /* renamed from: c */
    private final Context f6605c;

    /* renamed from: d */
    private T f6606d;

    public C1905h(Context context, Uri uri) {
        this.f6605c = context.getApplicationContext();
        this.f6604b = uri;
    }

    /* renamed from: a */
    public final T mo7711a(C2255p pVar) {
        this.f6606d = mo7728b(this.f6604b, this.f6605c.getContentResolver());
        return this.f6606d;
    }

    /* renamed from: a */
    public void mo7712a() {
        if (this.f6606d != null) {
            try {
                mo7727a(this.f6606d);
            } catch (IOException e) {
                if (Log.isLoggable(f6603a, 2)) {
                    Log.v(f6603a, "failed to close data", e);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo7727a(T t);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract T mo7728b(Uri uri, ContentResolver contentResolver);

    /* renamed from: b */
    public String mo7714b() {
        return this.f6604b.toString();
    }

    /* renamed from: c */
    public void mo7715c() {
    }
}
