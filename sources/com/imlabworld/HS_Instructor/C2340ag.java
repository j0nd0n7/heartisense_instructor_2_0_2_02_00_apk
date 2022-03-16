package com.imlabworld.HS_Instructor;

/* renamed from: com.imlabworld.HS_Instructor.ag */
public class C2340ag {

    /* renamed from: a */
    boolean f7880a;

    /* renamed from: b */
    boolean f7881b;

    /* renamed from: c */
    boolean f7882c;

    public C2340ag() {
        this.f7880a = true;
        this.f7881b = false;
        this.f7882c = false;
    }

    private C2340ag(boolean z, boolean z2, boolean z3) {
        this.f7880a = z;
        this.f7881b = z2;
        this.f7882c = z3;
    }

    /* renamed from: a */
    public void mo8691a(boolean z) {
        this.f7880a = z;
    }

    /* renamed from: a */
    public boolean mo8692a() {
        return this.f7880a;
    }

    /* renamed from: b */
    public void mo8693b(boolean z) {
        this.f7881b = z;
    }

    /* renamed from: b */
    public boolean mo8694b() {
        return this.f7881b;
    }

    /* renamed from: c */
    public void mo8695c(boolean z) {
        this.f7882c = z;
    }

    /* renamed from: c */
    public boolean mo8696c() {
        return this.f7882c;
    }

    /* renamed from: d */
    public C2340ag clone() {
        return new C2340ag(this.f7880a, this.f7881b, this.f7882c);
    }
}
