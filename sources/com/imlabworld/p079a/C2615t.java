package com.imlabworld.p079a;

import java.util.Arrays;

/* renamed from: com.imlabworld.a.t */
public class C2615t {

    /* renamed from: a */
    int f10688a;

    /* renamed from: b */
    int f10689b;

    /* renamed from: c */
    boolean f10690c;

    /* renamed from: d */
    private double f10691d;

    /* renamed from: e */
    private int f10692e;

    /* renamed from: f */
    private int f10693f;

    /* renamed from: g */
    private int f10694g;

    /* renamed from: h */
    private double f10695h;

    /* renamed from: i */
    private boolean[] f10696i;

    public C2615t(double d, int i, int i2, int i3, int i4, int i5, double d2, boolean z, boolean[] zArr) {
        this.f10691d = d;
        this.f10692e = i;
        this.f10693f = i2;
        this.f10688a = i3;
        this.f10689b = i4;
        this.f10694g = i5;
        this.f10695h = d2;
        this.f10690c = z;
        this.f10696i = (boolean[]) zArr.clone();
    }

    /* renamed from: a */
    public double mo10000a() {
        return this.f10691d;
    }

    /* renamed from: a */
    public void mo10001a(double d) {
        this.f10691d = d;
    }

    /* renamed from: a */
    public void mo10002a(int i) {
        this.f10692e = i;
    }

    /* renamed from: a */
    public void mo10003a(boolean z) {
        this.f10690c = z;
    }

    /* renamed from: a */
    public void mo10004a(boolean[] zArr) {
        this.f10696i = zArr;
    }

    /* renamed from: b */
    public int mo10005b() {
        return this.f10692e;
    }

    /* renamed from: b */
    public void mo10006b(double d) {
        this.f10695h = d;
    }

    /* renamed from: b */
    public void mo10007b(int i) {
        this.f10693f = i;
    }

    /* renamed from: c */
    public int mo10008c() {
        return this.f10693f;
    }

    /* renamed from: c */
    public void mo10009c(int i) {
        this.f10688a = i;
    }

    /* renamed from: d */
    public int mo10010d() {
        return this.f10688a;
    }

    /* renamed from: d */
    public void mo10011d(int i) {
        this.f10689b = i;
    }

    /* renamed from: e */
    public int mo10012e() {
        return this.f10689b;
    }

    /* renamed from: e */
    public void mo10013e(int i) {
        this.f10694g = i;
    }

    /* renamed from: f */
    public int mo10014f() {
        return this.f10694g;
    }

    /* renamed from: g */
    public double mo10015g() {
        return this.f10695h;
    }

    /* renamed from: h */
    public boolean mo10016h() {
        return this.f10690c;
    }

    /* renamed from: i */
    public boolean[] mo10017i() {
        return this.f10696i;
    }

    public String toString() {
        return "ResultCPREvent [event_time=" + this.f10691d + ", cycle_num=" + this.f10692e + ", stroke_num=" + this.f10693f + ", depth=" + this.f10688a + ", recoil=" + this.f10689b + ", volume=" + this.f10694g + ", rate=" + this.f10695h + ", is_comp=" + this.f10690c + ", position=" + Arrays.toString(this.f10696i) + "]";
    }
}
