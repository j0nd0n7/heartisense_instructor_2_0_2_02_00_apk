package com.imlabworld.HS_Instructor;

import java.sql.Timestamp;

/* renamed from: com.imlabworld.HS_Instructor.v */
public class C2554v {

    /* renamed from: a */
    private int f9766a;

    /* renamed from: b */
    private String f9767b;

    /* renamed from: c */
    private String f9768c;

    /* renamed from: d */
    private String f9769d;

    /* renamed from: e */
    private Timestamp f9770e;

    /* renamed from: f */
    private int f9771f;

    /* renamed from: g */
    private int f9772g;

    /* renamed from: h */
    private int f9773h;

    /* renamed from: i */
    private int f9774i;

    /* renamed from: j */
    private int f9775j;

    /* renamed from: k */
    private int f9776k;

    /* renamed from: l */
    private int f9777l;

    /* renamed from: m */
    private int f9778m;

    /* renamed from: n */
    private int f9779n;

    public C2554v(int i, String str, String str2, String str3, Timestamp timestamp, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        this.f9766a = i;
        this.f9767b = str;
        this.f9768c = str2;
        this.f9769d = str3;
        this.f9770e = timestamp;
        this.f9771f = i2;
        this.f9772g = i3;
        this.f9773h = i4;
        this.f9774i = i5;
        this.f9775j = i6;
        this.f9776k = i7;
        this.f9777l = i8;
        this.f9778m = i9;
        this.f9779n = i10;
    }

    public C2554v(C2553u uVar) {
        this.f9766a = uVar.mo9715b();
        this.f9767b = uVar.mo9718c();
        this.f9768c = uVar.mo9722d();
        this.f9769d = uVar.mo9723e();
        this.f9770e = uVar.mo9726h();
        this.f9771f = uVar.mo9724f();
        this.f9772g = uVar.mo9725g();
        this.f9773h = 1;
        this.f9774i = 1;
        this.f9775j = 1;
        this.f9776k = 1;
        this.f9777l = 1;
        this.f9778m = 1;
        this.f9779n = 1;
    }

    public C2554v(String str, String str2) {
        this.f9767b = str;
        this.f9768c = str2;
        this.f9769d = "";
        this.f9770e = new Timestamp(System.currentTimeMillis());
        this.f9771f = -1;
        this.f9772g = 1;
        this.f9773h = 1;
        this.f9774i = 1;
        this.f9775j = 1;
        this.f9776k = 1;
        this.f9777l = 1;
        this.f9778m = 1;
        this.f9779n = 1;
    }

    public C2554v(String str, String str2, String str3, Timestamp timestamp, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.f9767b = str;
        this.f9768c = str2;
        this.f9769d = str3;
        this.f9770e = timestamp;
        this.f9771f = i;
        this.f9772g = i2;
        this.f9773h = i3;
        this.f9774i = i4;
        this.f9775j = i5;
        this.f9776k = i6;
        this.f9777l = i7;
        this.f9778m = i8;
        this.f9779n = i9;
    }

    /* renamed from: a */
    public C2553u mo9727a() {
        return new C2553u(this.f9766a, this.f9767b, this.f9768c, this.f9769d, this.f9770e, this.f9771f, this.f9772g);
    }

    /* renamed from: a */
    public void mo9728a(int i) {
        this.f9766a = i;
    }

    /* renamed from: a */
    public void mo9729a(String str) {
        this.f9767b = str;
    }

    /* renamed from: a */
    public void mo9730a(Timestamp timestamp) {
        this.f9770e = timestamp;
    }

    /* renamed from: b */
    public int mo9731b() {
        return this.f9766a;
    }

    /* renamed from: b */
    public void mo9732b(int i) {
        this.f9771f = i;
    }

    /* renamed from: b */
    public void mo9733b(String str) {
        this.f9768c = str;
    }

    /* renamed from: c */
    public String mo9734c() {
        return this.f9767b;
    }

    /* renamed from: c */
    public void mo9735c(int i) {
        this.f9772g = i;
    }

    /* renamed from: c */
    public void mo9736c(String str) {
        this.f9769d = str;
    }

    /* renamed from: d */
    public String mo9737d() {
        return this.f9768c;
    }

    /* renamed from: d */
    public void mo9738d(int i) {
        this.f9773h = i;
    }

    /* renamed from: e */
    public String mo9739e() {
        return this.f9769d;
    }

    /* renamed from: e */
    public void mo9740e(int i) {
        this.f9774i = i;
    }

    /* renamed from: f */
    public Timestamp mo9741f() {
        return this.f9770e;
    }

    /* renamed from: f */
    public void mo9742f(int i) {
        this.f9775j = i;
    }

    /* renamed from: g */
    public int mo9743g() {
        return this.f9771f;
    }

    /* renamed from: g */
    public void mo9744g(int i) {
        this.f9776k = i;
    }

    /* renamed from: h */
    public int mo9745h() {
        return this.f9772g;
    }

    /* renamed from: h */
    public void mo9746h(int i) {
        this.f9777l = i;
    }

    /* renamed from: i */
    public int mo9747i() {
        return this.f9773h;
    }

    /* renamed from: i */
    public void mo9748i(int i) {
        this.f9778m = i;
    }

    /* renamed from: j */
    public int mo9749j() {
        return this.f9774i;
    }

    /* renamed from: j */
    public void mo9750j(int i) {
        this.f9779n = i;
    }

    /* renamed from: k */
    public int mo9751k() {
        return this.f9775j;
    }

    /* renamed from: l */
    public int mo9752l() {
        return this.f9776k;
    }

    /* renamed from: m */
    public int mo9753m() {
        return this.f9777l;
    }

    /* renamed from: n */
    public int mo9754n() {
        return this.f9778m;
    }

    /* renamed from: o */
    public int mo9755o() {
        return this.f9779n;
    }
}
