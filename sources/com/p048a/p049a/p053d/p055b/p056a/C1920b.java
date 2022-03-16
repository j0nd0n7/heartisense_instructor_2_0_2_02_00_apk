package com.p048a.p049a.p053d.p055b.p056a;

import com.p048a.p049a.p053d.p055b.p056a.C1931h;
import com.p048a.p049a.p078j.C2238i;
import java.util.Queue;

/* renamed from: com.a.a.d.b.a.b */
abstract class C1920b<T extends C1931h> {

    /* renamed from: a */
    private static final int f6633a = 20;

    /* renamed from: b */
    private final Queue<T> f6634b = C2238i.m12728a(20);

    C1920b() {
    }

    /* renamed from: a */
    public void mo7761a(T t) {
        if (this.f6634b.size() < 20) {
            this.f6634b.offer(t);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract T mo7760b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public T mo7762c() {
        T t = (C1931h) this.f6634b.poll();
        return t == null ? mo7760b() : t;
    }
}
