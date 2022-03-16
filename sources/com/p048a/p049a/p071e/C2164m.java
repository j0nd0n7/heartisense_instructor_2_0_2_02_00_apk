package com.p048a.p049a.p071e;

import com.p048a.p049a.p074h.C2217c;
import com.p048a.p049a.p078j.C2238i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.a.a.e.m */
public class C2164m {

    /* renamed from: a */
    private final Set<C2217c> f7134a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    private final List<C2217c> f7135b = new ArrayList();

    /* renamed from: c */
    private boolean f7136c;

    /* renamed from: a */
    public void mo8116a(C2217c cVar) {
        this.f7134a.add(cVar);
        if (!this.f7136c) {
            cVar.mo8197b();
        } else {
            this.f7135b.add(cVar);
        }
    }

    /* renamed from: a */
    public boolean mo8117a() {
        return this.f7136c;
    }

    /* renamed from: b */
    public void mo8118b() {
        this.f7136c = true;
        for (T t : C2238i.m12727a(this.f7134a)) {
            if (t.mo8202g()) {
                t.mo8201f();
                this.f7135b.add(t);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo8119b(C2217c cVar) {
        this.f7134a.add(cVar);
    }

    /* renamed from: c */
    public void mo8120c() {
        this.f7136c = false;
        for (T t : C2238i.m12727a(this.f7134a)) {
            if (!t.mo8203h() && !t.mo8205j() && !t.mo8202g()) {
                t.mo8197b();
            }
        }
        this.f7135b.clear();
    }

    /* renamed from: c */
    public void mo8121c(C2217c cVar) {
        this.f7134a.remove(cVar);
        this.f7135b.remove(cVar);
    }

    /* renamed from: d */
    public void mo8122d() {
        for (T d : C2238i.m12727a(this.f7134a)) {
            d.mo8199d();
        }
        this.f7135b.clear();
    }

    /* renamed from: e */
    public void mo8123e() {
        for (T t : C2238i.m12727a(this.f7134a)) {
            if (!t.mo8203h() && !t.mo8205j()) {
                t.mo8201f();
                if (!this.f7136c) {
                    t.mo8197b();
                } else {
                    this.f7135b.add(t);
                }
            }
        }
    }
}
