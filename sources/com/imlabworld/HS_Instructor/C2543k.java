package com.imlabworld.HS_Instructor;

import java.sql.Timestamp;

/* renamed from: com.imlabworld.HS_Instructor.k */
public class C2543k {

    /* renamed from: a */
    private int f9668a;

    /* renamed from: b */
    private String f9669b;

    /* renamed from: c */
    private Timestamp f9670c;

    /* renamed from: d */
    private Timestamp f9671d;

    /* renamed from: e */
    private int f9672e;

    /* renamed from: f */
    private int f9673f;

    /* renamed from: g */
    private int f9674g;

    public C2543k(int i, String str, Timestamp timestamp, Timestamp timestamp2, int i2, int i3, int i4) {
        this.f9668a = i;
        this.f9669b = str;
        this.f9670c = timestamp;
        this.f9671d = timestamp2;
        this.f9672e = i2;
        this.f9673f = i3;
        this.f9674g = i4;
    }

    public C2543k(String str) {
        this.f9669b = str;
        this.f9670c = new Timestamp(System.currentTimeMillis());
        this.f9671d = new Timestamp(System.currentTimeMillis());
        this.f9672e = 0;
        this.f9673f = -1;
        this.f9674g = 0;
    }

    public C2543k(String str, Timestamp timestamp, Timestamp timestamp2, int i, int i2, int i3) {
        this.f9669b = str;
        this.f9670c = timestamp;
        this.f9671d = timestamp2;
        this.f9672e = i;
        this.f9673f = i2;
        this.f9674g = i3;
    }

    /* renamed from: a */
    public int mo9455a() {
        return this.f9668a;
    }

    /* renamed from: a */
    public void mo9456a(int i) {
        this.f9668a = i;
    }

    /* renamed from: a */
    public void mo9457a(String str) {
        this.f9669b = str;
    }

    /* renamed from: a */
    public void mo9458a(Timestamp timestamp) {
        this.f9670c = timestamp;
    }

    /* renamed from: b */
    public String mo9459b() {
        return this.f9669b;
    }

    /* renamed from: b */
    public void mo9460b(int i) {
        this.f9672e = i;
    }

    /* renamed from: b */
    public void mo9461b(Timestamp timestamp) {
        this.f9671d = timestamp;
    }

    /* renamed from: c */
    public Timestamp mo9462c() {
        return this.f9670c;
    }

    /* renamed from: c */
    public void mo9463c(int i) {
        this.f9673f = i;
    }

    /* renamed from: d */
    public Timestamp mo9464d() {
        return this.f9671d;
    }

    /* renamed from: d */
    public void mo9465d(int i) {
        this.f9674g = i;
    }

    /* renamed from: e */
    public int mo9466e() {
        return this.f9672e;
    }

    /* renamed from: f */
    public int mo9467f() {
        return this.f9673f;
    }

    /* renamed from: g */
    public int mo9468g() {
        return this.f9674g;
    }

    public String toString() {
        return String.format("idx:%d name:%s date:%s editTime:%s isOrg:%d serverIdx:%d isSent:%d", new Object[]{Integer.valueOf(this.f9668a), this.f9669b, this.f9670c.toString(), this.f9671d.toString(), Integer.valueOf(this.f9672e), Integer.valueOf(this.f9673f), Integer.valueOf(this.f9674g)});
    }
}
