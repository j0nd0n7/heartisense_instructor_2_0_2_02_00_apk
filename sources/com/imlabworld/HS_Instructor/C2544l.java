package com.imlabworld.HS_Instructor;

import java.sql.Timestamp;

/* renamed from: com.imlabworld.HS_Instructor.l */
public class C2544l {

    /* renamed from: a */
    private int f9675a;

    /* renamed from: b */
    private int f9676b;

    /* renamed from: c */
    private int f9677c;

    /* renamed from: d */
    private int f9678d;

    /* renamed from: e */
    private Timestamp f9679e;

    /* renamed from: f */
    private int f9680f;

    /* renamed from: g */
    private int f9681g;

    /* renamed from: h */
    private int f9682h;

    /* renamed from: i */
    private int f9683i;

    /* renamed from: j */
    private int f9684j;

    /* renamed from: k */
    private int f9685k;

    /* renamed from: l */
    private int f9686l;

    public C2544l(int i, int i2, int i3, int i4, Timestamp timestamp, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        this.f9675a = i;
        this.f9676b = i2;
        this.f9677c = i3;
        this.f9678d = i4;
        this.f9679e = timestamp;
        this.f9680f = i5;
        this.f9681g = i6;
        this.f9682h = i7;
        this.f9683i = i8;
        this.f9684j = i9;
        this.f9685k = i10;
        this.f9686l = i11;
    }

    public C2544l(int i, int i2, int i3, Timestamp timestamp, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        this.f9676b = i;
        this.f9677c = i2;
        this.f9678d = i3;
        this.f9679e = timestamp;
        this.f9680f = i4;
        this.f9681g = i5;
        this.f9682h = i6;
        this.f9683i = i7;
        this.f9684j = i8;
        this.f9685k = i9;
        this.f9686l = i10;
    }

    /* renamed from: a */
    public int mo9470a() {
        return this.f9675a;
    }

    /* renamed from: a */
    public void mo9471a(int i) {
        this.f9675a = i;
    }

    /* renamed from: a */
    public void mo9472a(Timestamp timestamp) {
        this.f9679e = timestamp;
    }

    /* renamed from: b */
    public int mo9473b() {
        return this.f9676b;
    }

    /* renamed from: b */
    public void mo9474b(int i) {
        this.f9676b = i;
    }

    /* renamed from: c */
    public int mo9475c() {
        return this.f9677c;
    }

    /* renamed from: c */
    public void mo9476c(int i) {
        this.f9677c = i;
    }

    /* renamed from: d */
    public int mo9477d() {
        return this.f9678d;
    }

    /* renamed from: d */
    public void mo9478d(int i) {
        this.f9678d = i;
    }

    /* renamed from: e */
    public Timestamp mo9479e() {
        return this.f9679e;
    }

    /* renamed from: e */
    public void mo9480e(int i) {
        this.f9680f = i;
    }

    /* renamed from: f */
    public int mo9481f() {
        return this.f9680f;
    }

    /* renamed from: f */
    public void mo9482f(int i) {
        this.f9681g = i;
    }

    /* renamed from: g */
    public int mo9483g() {
        return this.f9681g;
    }

    /* renamed from: g */
    public void mo9484g(int i) {
        this.f9682h = i;
    }

    /* renamed from: h */
    public int mo9485h() {
        return this.f9682h;
    }

    /* renamed from: h */
    public void mo9486h(int i) {
        this.f9683i = i;
    }

    /* renamed from: i */
    public int mo9487i() {
        return this.f9683i;
    }

    /* renamed from: i */
    public void mo9488i(int i) {
        this.f9684j = i;
    }

    /* renamed from: j */
    public int mo9489j() {
        return this.f9684j;
    }

    /* renamed from: j */
    public void mo9490j(int i) {
        this.f9685k = i;
    }

    /* renamed from: k */
    public int mo9491k() {
        return this.f9685k;
    }

    /* renamed from: k */
    public void mo9492k(int i) {
        this.f9686l = i;
    }

    /* renamed from: l */
    public int mo9493l() {
        return this.f9686l;
    }

    public String toString() {
        return String.format("idx:%d class:%d student:%d pass:%d time:%s manikin:%d patient:%d cpr:%d rescuer:%d isTest:%d server:%d isSent:%d", new Object[]{Integer.valueOf(this.f9675a), Integer.valueOf(this.f9676b), Integer.valueOf(this.f9677c), Integer.valueOf(this.f9678d), this.f9679e.toString(), Integer.valueOf(this.f9680f), Integer.valueOf(this.f9681g), Integer.valueOf(this.f9682h), Integer.valueOf(this.f9683i), Integer.valueOf(this.f9684j), Integer.valueOf(this.f9685k), Integer.valueOf(this.f9686l)});
    }
}
