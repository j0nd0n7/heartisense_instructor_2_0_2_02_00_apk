package com.p048a.p049a.p078j;

/* renamed from: com.a.a.j.h */
public class C2237h {

    /* renamed from: a */
    private Class<?> f7332a;

    /* renamed from: b */
    private Class<?> f7333b;

    public C2237h() {
    }

    public C2237h(Class<?> cls, Class<?> cls2) {
        mo8346a(cls, cls2);
    }

    /* renamed from: a */
    public void mo8346a(Class<?> cls, Class<?> cls2) {
        this.f7332a = cls;
        this.f7333b = cls2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2237h hVar = (C2237h) obj;
        if (!this.f7332a.equals(hVar.f7332a)) {
            return false;
        }
        return this.f7333b.equals(hVar.f7333b);
    }

    public int hashCode() {
        return (this.f7332a.hashCode() * 31) + this.f7333b.hashCode();
    }

    public String toString() {
        return "MultiClassKey{first=" + this.f7332a + ", second=" + this.f7333b + '}';
    }
}
