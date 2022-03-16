package com.p048a.p049a.p078j;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.a.a.j.f */
public class C2235f<T, Y> {

    /* renamed from: a */
    private final LinkedHashMap<T, Y> f7325a = new LinkedHashMap<>(100, 0.75f, true);

    /* renamed from: b */
    private int f7326b;

    /* renamed from: c */
    private final int f7327c;

    /* renamed from: d */
    private int f7328d = 0;

    public C2235f(int i) {
        this.f7327c = i;
        this.f7326b = i;
    }

    /* renamed from: d */
    private void m12707d() {
        mo8335b(this.f7326b);
    }

    /* renamed from: a */
    public int mo8331a() {
        return this.f7328d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo7812a(Y y) {
        return 1;
    }

    /* renamed from: a */
    public void mo8332a(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Multiplier must be >= 0");
        }
        this.f7326b = Math.round(((float) this.f7327c) * f);
        m12707d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7817a(T t, Y y) {
    }

    /* renamed from: b */
    public int mo8333b() {
        return this.f7326b;
    }

    /* renamed from: b */
    public Y mo8334b(T t, Y y) {
        if (mo7812a(y) >= this.f7326b) {
            mo7817a(t, y);
            return null;
        }
        Y put = this.f7325a.put(t, y);
        if (y != null) {
            this.f7328d += mo7812a(y);
        }
        if (put != null) {
            this.f7328d -= mo7812a(put);
        }
        m12707d();
        return put;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo8335b(int i) {
        while (this.f7328d > i) {
            Map.Entry next = this.f7325a.entrySet().iterator().next();
            Object value = next.getValue();
            this.f7328d -= mo7812a(value);
            Object key = next.getKey();
            this.f7325a.remove(key);
            mo7817a(key, value);
        }
    }

    /* renamed from: b */
    public boolean mo8336b(T t) {
        return this.f7325a.containsKey(t);
    }

    /* renamed from: c */
    public Y mo8337c(T t) {
        return this.f7325a.get(t);
    }

    /* renamed from: c */
    public void mo8338c() {
        mo8335b(0);
    }

    /* renamed from: d */
    public Y mo8339d(T t) {
        Y remove = this.f7325a.remove(t);
        if (remove != null) {
            this.f7328d -= mo7812a(remove);
        }
        return remove;
    }
}
