package com.p048a.p049a.p053d.p055b.p057b;

import com.p048a.p049a.p053d.p055b.p057b.C1944a;
import java.io.File;

/* renamed from: com.a.a.d.b.b.d */
public class C1952d implements C1944a.C1945a {

    /* renamed from: a */
    private final int f6697a;

    /* renamed from: b */
    private final C1955a f6698b;

    /* renamed from: com.a.a.d.b.b.d$a */
    public interface C1955a {
        /* renamed from: a */
        File mo7810a();
    }

    public C1952d(C1955a aVar, int i) {
        this.f6697a = i;
        this.f6698b = aVar;
    }

    public C1952d(final String str, int i) {
        this((C1955a) new C1955a() {
            /* renamed from: a */
            public File mo7810a() {
                return new File(str);
            }
        }, i);
    }

    public C1952d(final String str, final String str2, int i) {
        this((C1955a) new C1955a() {
            /* renamed from: a */
            public File mo7810a() {
                return new File(str, str2);
            }
        }, i);
    }

    /* renamed from: a */
    public C1944a mo7805a() {
        File a = this.f6698b.mo7810a();
        if (a == null) {
            return null;
        }
        if (a.mkdirs() || (a.exists() && a.isDirectory())) {
            return C1956e.m11711a(a, this.f6697a);
        }
        return null;
    }
}
