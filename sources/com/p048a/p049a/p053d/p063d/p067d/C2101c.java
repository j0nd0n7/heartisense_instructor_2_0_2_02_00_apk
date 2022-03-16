package com.p048a.p049a.p053d.p063d.p067d;

import com.p048a.p049a.p053d.C2144e;
import com.p048a.p049a.p053d.p055b.C2006l;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.a.a.d.d.d.c */
public class C2101c<T> implements C2144e<File, T> {

    /* renamed from: a */
    private static final C2102a f7010a = new C2102a();

    /* renamed from: b */
    private C2144e<InputStream, T> f7011b;

    /* renamed from: c */
    private final C2102a f7012c;

    /* renamed from: com.a.a.d.d.d.c$a */
    static class C2102a {
        C2102a() {
        }

        /* renamed from: a */
        public InputStream mo8016a(File file) {
            return new FileInputStream(file);
        }
    }

    public C2101c(C2144e<InputStream, T> eVar) {
        this(eVar, f7010a);
    }

    C2101c(C2144e<InputStream, T> eVar, C2102a aVar) {
        this.f7011b = eVar;
        this.f7012c = aVar;
    }

    /* renamed from: a */
    public C2006l<T> mo7949a(File file, int i, int i2) {
        InputStream inputStream = null;
        try {
            inputStream = this.f7012c.mo8016a(file);
            return this.f7011b.mo7949a(inputStream, i, i2);
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                }
            }
        }
    }

    /* renamed from: a */
    public String mo7950a() {
        return "";
    }
}
