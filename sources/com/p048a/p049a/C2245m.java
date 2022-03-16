package com.p048a.p049a;

import android.content.Context;
import android.os.Build;
import com.p048a.p049a.p053d.C1894a;
import com.p048a.p049a.p053d.p055b.C1979d;
import com.p048a.p049a.p053d.p055b.p056a.C1921c;
import com.p048a.p049a.p053d.p055b.p056a.C1922d;
import com.p048a.p049a.p053d.p055b.p056a.C1925f;
import com.p048a.p049a.p053d.p055b.p057b.C1944a;
import com.p048a.p049a.p053d.p055b.p057b.C1959g;
import com.p048a.p049a.p053d.p055b.p057b.C1961h;
import com.p048a.p049a.p053d.p055b.p057b.C1962i;
import com.p048a.p049a.p053d.p055b.p057b.C1965k;
import com.p048a.p049a.p053d.p055b.p058c.C1970a;
import java.util.concurrent.ExecutorService;

/* renamed from: com.a.a.m */
public class C2245m {

    /* renamed from: a */
    private final Context f7358a;

    /* renamed from: b */
    private C1979d f7359b;

    /* renamed from: c */
    private C1921c f7360c;

    /* renamed from: d */
    private C1962i f7361d;

    /* renamed from: e */
    private ExecutorService f7362e;

    /* renamed from: f */
    private ExecutorService f7363f;

    /* renamed from: g */
    private C1894a f7364g;

    /* renamed from: h */
    private C1944a.C1945a f7365h;

    public C2245m(Context context) {
        this.f7358a = context.getApplicationContext();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C2243l mo8371a() {
        if (this.f7362e == null) {
            this.f7362e = new C1970a(Math.max(1, Runtime.getRuntime().availableProcessors()));
        }
        if (this.f7363f == null) {
            this.f7363f = new C1970a(1);
        }
        C1965k kVar = new C1965k(this.f7358a);
        if (this.f7360c == null) {
            if (Build.VERSION.SDK_INT >= 11) {
                this.f7360c = new C1925f(kVar.mo7825b());
            } else {
                this.f7360c = new C1922d();
            }
        }
        if (this.f7361d == null) {
            this.f7361d = new C1961h(kVar.mo7824a());
        }
        if (this.f7365h == null) {
            this.f7365h = new C1959g(this.f7358a);
        }
        if (this.f7359b == null) {
            this.f7359b = new C1979d(this.f7361d, this.f7365h, this.f7363f, this.f7362e);
        }
        if (this.f7364g == null) {
            this.f7364g = C1894a.f6581d;
        }
        return new C2243l(this.f7359b, this.f7361d, this.f7360c, this.f7358a, this.f7364g);
    }

    /* renamed from: a */
    public C2245m mo8372a(C1894a aVar) {
        this.f7364g = aVar;
        return this;
    }

    /* renamed from: a */
    public C2245m mo8373a(C1921c cVar) {
        this.f7360c = cVar;
        return this;
    }

    /* renamed from: a */
    public C2245m mo8374a(C1944a.C1945a aVar) {
        this.f7365h = aVar;
        return this;
    }

    @Deprecated
    /* renamed from: a */
    public C2245m mo8375a(final C1944a aVar) {
        return mo8374a((C1944a.C1945a) new C1944a.C1945a() {
            /* renamed from: a */
            public C1944a mo7805a() {
                return aVar;
            }
        });
    }

    /* renamed from: a */
    public C2245m mo8376a(C1962i iVar) {
        this.f7361d = iVar;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C2245m mo8377a(C1979d dVar) {
        this.f7359b = dVar;
        return this;
    }

    /* renamed from: a */
    public C2245m mo8378a(ExecutorService executorService) {
        this.f7362e = executorService;
        return this;
    }

    /* renamed from: b */
    public C2245m mo8379b(ExecutorService executorService) {
        this.f7363f = executorService;
        return this;
    }
}
