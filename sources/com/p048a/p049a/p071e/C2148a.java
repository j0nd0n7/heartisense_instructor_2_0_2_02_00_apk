package com.p048a.p049a.p071e;

import com.p048a.p049a.p078j.C2238i;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.a.a.e.a */
class C2148a implements C2156g {

    /* renamed from: a */
    private final Set<C2157h> f7110a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    private boolean f7111b;

    /* renamed from: c */
    private boolean f7112c;

    C2148a() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo8083a() {
        this.f7111b = true;
        for (T g : C2238i.m12727a(this.f7110a)) {
            g.mo8089g();
        }
    }

    /* renamed from: a */
    public void mo8084a(C2157h hVar) {
        this.f7110a.add(hVar);
        if (this.f7112c) {
            hVar.mo8091i();
        } else if (this.f7111b) {
            hVar.mo8089g();
        } else {
            hVar.mo8090h();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo8085b() {
        this.f7111b = false;
        for (T h : C2238i.m12727a(this.f7110a)) {
            h.mo8090h();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo8086c() {
        this.f7112c = true;
        for (T i : C2238i.m12727a(this.f7110a)) {
            i.mo8091i();
        }
    }
}
