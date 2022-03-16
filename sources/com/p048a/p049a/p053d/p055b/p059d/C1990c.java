package com.p048a.p049a.p053d.p055b.p059d;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.a.a.d.b.d.c */
final class C1990c {

    /* renamed from: a */
    private final Map<C1991d, Integer> f6784a;

    /* renamed from: b */
    private final List<C1991d> f6785b;

    /* renamed from: c */
    private int f6786c;

    /* renamed from: d */
    private int f6787d;

    public C1990c(Map<C1991d, Integer> map) {
        this.f6784a = map;
        this.f6785b = new ArrayList(map.keySet());
        for (Integer intValue : map.values()) {
            this.f6786c = intValue.intValue() + this.f6786c;
        }
    }

    /* renamed from: a */
    public C1991d mo7856a() {
        C1991d dVar = this.f6785b.get(this.f6787d);
        Integer num = this.f6784a.get(dVar);
        if (num.intValue() == 1) {
            this.f6784a.remove(dVar);
            this.f6785b.remove(this.f6787d);
        } else {
            this.f6784a.put(dVar, Integer.valueOf(num.intValue() - 1));
        }
        this.f6786c--;
        this.f6787d = this.f6785b.isEmpty() ? 0 : (this.f6787d + 1) % this.f6785b.size();
        return dVar;
    }

    /* renamed from: b */
    public int mo7857b() {
        return this.f6786c;
    }

    /* renamed from: c */
    public boolean mo7858c() {
        return this.f6786c == 0;
    }
}
