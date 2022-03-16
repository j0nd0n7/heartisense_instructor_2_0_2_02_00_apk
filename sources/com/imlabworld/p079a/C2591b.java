package com.imlabworld.p079a;

import android.util.Pair;
import java.util.ArrayList;

/* renamed from: com.imlabworld.a.b */
public class C2591b {

    /* renamed from: a */
    private double f10060a;

    /* renamed from: b */
    private double f10061b;

    /* renamed from: c */
    private double f10062c;

    /* renamed from: d */
    private double f10063d;

    /* renamed from: e */
    private double f10064e;

    /* renamed from: f */
    private double f10065f;

    /* renamed from: g */
    private double f10066g;

    /* renamed from: h */
    private double f10067h;

    /* renamed from: i */
    private double f10068i;

    /* renamed from: j */
    private double f10069j;

    /* renamed from: com.imlabworld.a.b$a */
    public enum C2592a {
        CompressionDepth,
        CompressionRecoil,
        CompressionRate,
        CompressionPos,
        BreathVolume,
        BreathRate,
        Fraction
    }

    public C2591b(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10) {
        this.f10060a = d;
        this.f10061b = d2;
        this.f10062c = d3;
        this.f10063d = d4;
        this.f10064e = d5;
        this.f10065f = d6;
        this.f10066g = d7;
        this.f10067h = d8;
        this.f10068i = d9;
        this.f10069j = d10;
    }

    /* renamed from: a */
    public double mo9886a() {
        return this.f10060a;
    }

    /* renamed from: a */
    public void mo9887a(double d) {
        this.f10060a = d;
    }

    /* renamed from: b */
    public double mo9888b() {
        return this.f10061b;
    }

    /* renamed from: b */
    public void mo9889b(double d) {
        this.f10061b = d;
    }

    /* renamed from: c */
    public double mo9890c() {
        return this.f10062c;
    }

    /* renamed from: c */
    public void mo9891c(double d) {
        this.f10062c = d;
    }

    /* renamed from: d */
    public double mo9892d() {
        return this.f10063d;
    }

    /* renamed from: d */
    public void mo9893d(double d) {
        this.f10063d = d;
    }

    /* renamed from: e */
    public double mo9894e() {
        return this.f10064e;
    }

    /* renamed from: e */
    public void mo9895e(double d) {
        this.f10064e = d;
    }

    /* renamed from: f */
    public double mo9896f() {
        return this.f10065f;
    }

    /* renamed from: f */
    public void mo9897f(double d) {
        this.f10065f = d;
    }

    /* renamed from: g */
    public double mo9898g() {
        return this.f10066g;
    }

    /* renamed from: g */
    public void mo9899g(double d) {
        this.f10066g = d;
    }

    /* renamed from: h */
    public double mo9900h() {
        return this.f10067h;
    }

    /* renamed from: h */
    public void mo9901h(double d) {
        this.f10067h = d;
    }

    /* renamed from: i */
    public double mo9902i() {
        return this.f10068i;
    }

    /* renamed from: i */
    public void mo9903i(double d) {
        this.f10068i = d;
    }

    /* renamed from: j */
    public double mo9904j() {
        return this.f10069j;
    }

    /* renamed from: j */
    public void mo9905j(double d) {
        this.f10069j = d;
    }

    /* renamed from: k */
    public ArrayList<Pair<Double, C2592a>> mo9906k() {
        ArrayList<Pair<Double, C2592a>> arrayList = new ArrayList<>();
        if (this.f10060a >= 0.0d) {
            arrayList.add(new Pair(Double.valueOf(this.f10060a), C2592a.CompressionDepth));
        }
        if (this.f10061b >= 0.0d) {
            arrayList.add(new Pair(Double.valueOf(this.f10061b), C2592a.CompressionRecoil));
        }
        if (this.f10062c >= 0.0d) {
            arrayList.add(new Pair(Double.valueOf(this.f10062c), C2592a.CompressionRate));
        }
        if (this.f10063d >= 0.0d) {
            arrayList.add(new Pair(Double.valueOf(this.f10063d), C2592a.CompressionPos));
        }
        if (this.f10064e >= 0.0d) {
            arrayList.add(new Pair(Double.valueOf(this.f10064e), C2592a.BreathVolume));
        }
        if (this.f10065f >= 0.0d) {
            arrayList.add(new Pair(Double.valueOf(this.f10065f), C2592a.BreathRate));
        }
        if (this.f10068i >= 0.0d || Double.isNaN(this.f10068i)) {
            if (Double.isNaN(this.f10068i)) {
                this.f10068i = 0.0d;
            }
            arrayList.add(new Pair(Double.valueOf(this.f10068i), C2592a.Fraction));
        }
        for (int size = arrayList.size(); size > 0; size--) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= size - 1) {
                    break;
                }
                if (((Double) arrayList.get(i2).first).doubleValue() > ((Double) arrayList.get(i2 + 1).first).doubleValue()) {
                    arrayList.set(i2, arrayList.get(i2 + 1));
                    arrayList.set(i2 + 1, arrayList.get(i2));
                }
                i = i2 + 1;
            }
        }
        return arrayList;
    }
}
