package com.imlabworld.HS_Instructor;

import java.sql.Timestamp;

/* renamed from: com.imlabworld.HS_Instructor.u */
public class C2553u {

    /* renamed from: a */
    int f9759a;

    /* renamed from: b */
    String f9760b;

    /* renamed from: c */
    int f9761c;

    /* renamed from: d */
    private String f9762d;

    /* renamed from: e */
    private String f9763e;

    /* renamed from: f */
    private Timestamp f9764f;

    /* renamed from: g */
    private int f9765g;

    public C2553u(int i, String str, String str2, String str3, Timestamp timestamp, int i2, int i3) {
        this.f9759a = i;
        this.f9760b = str;
        this.f9762d = str2;
        this.f9763e = str3;
        this.f9764f = timestamp;
        this.f9765g = i2;
        this.f9761c = i3;
    }

    public C2553u(String str, String str2) {
        this.f9760b = str;
        this.f9762d = str2;
        this.f9763e = "";
        this.f9764f = new Timestamp(System.currentTimeMillis());
        this.f9765g = -1;
        this.f9761c = 0;
    }

    public C2553u(String str, String str2, String str3, Timestamp timestamp, int i, int i2) {
        this.f9760b = str;
        this.f9762d = str2;
        this.f9763e = str3;
        this.f9764f = timestamp;
        this.f9765g = i;
        this.f9761c = i2;
    }

    /* renamed from: a */
    public C2553u clone() {
        return new C2553u(this.f9759a, this.f9760b, this.f9762d, this.f9763e, this.f9764f, this.f9765g, this.f9761c);
    }

    /* renamed from: a */
    public void mo9712a(int i) {
        this.f9759a = i;
    }

    /* renamed from: a */
    public void mo9713a(String str) {
        this.f9760b = str;
    }

    /* renamed from: a */
    public void mo9714a(Timestamp timestamp) {
        this.f9764f = timestamp;
    }

    /* renamed from: b */
    public int mo9715b() {
        return this.f9759a;
    }

    /* renamed from: b */
    public void mo9716b(int i) {
        this.f9765g = i;
    }

    /* renamed from: b */
    public void mo9717b(String str) {
        this.f9762d = str;
    }

    /* renamed from: c */
    public String mo9718c() {
        return this.f9760b;
    }

    /* renamed from: c */
    public void mo9719c(int i) {
        this.f9761c = i;
    }

    /* renamed from: c */
    public void mo9720c(String str) {
        this.f9763e = str;
    }

    /* renamed from: d */
    public String mo9722d() {
        return this.f9762d;
    }

    /* renamed from: e */
    public String mo9723e() {
        return this.f9763e;
    }

    /* renamed from: f */
    public int mo9724f() {
        return this.f9765g;
    }

    /* renamed from: g */
    public int mo9725g() {
        return this.f9761c;
    }

    /* renamed from: h */
    public Timestamp mo9726h() {
        return this.f9764f;
    }
}
