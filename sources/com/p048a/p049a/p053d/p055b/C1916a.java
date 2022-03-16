package com.p048a.p049a.p053d.p055b;

import android.util.Log;
import com.p048a.p049a.p053d.C2010c;
import com.p048a.p049a.p053d.C2144e;
import com.p048a.p049a.p053d.p055b.p057b.C1944a;
import java.io.File;
import java.io.IOException;

/* renamed from: com.a.a.d.b.a */
class C1916a {

    /* renamed from: a */
    private static final String f6625a = "CacheLoader";

    /* renamed from: b */
    private final C1944a f6626b;

    public C1916a(C1944a aVar) {
        this.f6626b = aVar;
    }

    /* renamed from: a */
    public <Z> C2006l<Z> mo7745a(C2010c cVar, C2144e<File, Z> eVar, int i, int i2) {
        C2006l<Z> lVar = null;
        File a = this.f6626b.mo7801a(cVar);
        if (a != null) {
            try {
                lVar = eVar.mo7949a(a, i, i2);
            } catch (IOException e) {
                if (Log.isLoggable(f6625a, 3)) {
                    Log.d(f6625a, "Exception decoding image from cache", e);
                }
            }
            if (lVar == null) {
                if (Log.isLoggable(f6625a, 3)) {
                    Log.d(f6625a, "Failed to decode image from cache or not present in cache");
                }
                this.f6626b.mo7804b(cVar);
            }
        }
        return lVar;
    }
}
