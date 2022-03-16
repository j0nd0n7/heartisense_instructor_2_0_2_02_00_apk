package com.p048a.p049a.p053d.p055b.p057b;

import android.content.Context;
import com.p048a.p049a.p053d.p055b.p057b.C1944a;
import com.p048a.p049a.p053d.p055b.p057b.C1952d;
import java.io.File;

/* renamed from: com.a.a.d.b.b.f */
public final class C1957f extends C1952d {
    public C1957f(Context context) {
        this(context, C1944a.C1945a.f6690d, C1944a.C1945a.f6689c);
    }

    public C1957f(Context context, int i) {
        this(context, C1944a.C1945a.f6690d, i);
    }

    public C1957f(final Context context, final String str, int i) {
        super((C1952d.C1955a) new C1952d.C1955a() {
            /* renamed from: a */
            public File mo7810a() {
                File externalCacheDir = context.getExternalCacheDir();
                if (externalCacheDir == null) {
                    return null;
                }
                return str != null ? new File(externalCacheDir, str) : externalCacheDir;
            }
        }, i);
    }
}
