package com.imlabworld.p079a;

import java.util.Arrays;

/* renamed from: com.imlabworld.a.af */
public class C2570af {

    /* renamed from: a */
    private int f9963a;

    /* renamed from: b */
    private int f9964b;

    /* renamed from: c */
    private int f9965c;

    /* renamed from: d */
    private double[] f9966d = new double[3];

    /* renamed from: e */
    private double[] f9967e = new double[3];

    /* renamed from: f */
    private int f9968f;

    /* renamed from: g */
    private int f9969g;

    /* renamed from: h */
    private boolean[] f9970h = new boolean[4];

    /* renamed from: i */
    private byte[] f9971i = new byte[3];

    /* renamed from: j */
    private double[] f9972j = new double[3];

    public C2570af(int i, int i2, int i3, double[] dArr, double[] dArr2, int i4, int i5, boolean[] zArr, byte[] bArr, double[] dArr3) {
        this.f9963a = i;
        this.f9964b = i2;
        this.f9965c = i3;
        this.f9966d = dArr;
        this.f9967e = dArr2;
        this.f9968f = i4;
        this.f9969g = i5;
        this.f9970h = zArr;
        this.f9971i = bArr;
        this.f9972j = dArr3;
    }

    /* renamed from: a */
    public int mo9831a() {
        return this.f9963a;
    }

    /* renamed from: a */
    public void mo9832a(int i) {
        this.f9963a = i;
    }

    /* renamed from: a */
    public void mo9833a(byte[] bArr) {
        this.f9971i = bArr;
    }

    /* renamed from: a */
    public void mo9834a(double[] dArr) {
        this.f9966d = dArr;
    }

    /* renamed from: a */
    public void mo9835a(boolean[] zArr) {
        this.f9970h = zArr;
    }

    /* renamed from: b */
    public int mo9836b() {
        return this.f9964b;
    }

    /* renamed from: b */
    public void mo9837b(int i) {
        this.f9964b = i;
    }

    /* renamed from: b */
    public void mo9838b(double[] dArr) {
        this.f9967e = dArr;
    }

    /* renamed from: c */
    public int mo9839c() {
        return this.f9965c;
    }

    /* renamed from: c */
    public void mo9840c(int i) {
        this.f9965c = i;
    }

    /* renamed from: c */
    public void mo9841c(double[] dArr) {
        this.f9972j = dArr;
    }

    /* renamed from: d */
    public void mo9842d(int i) {
        this.f9968f = i;
    }

    /* renamed from: d */
    public double[] mo9843d() {
        return this.f9966d;
    }

    /* renamed from: e */
    public void mo9844e(int i) {
        this.f9969g = i;
    }

    /* renamed from: e */
    public double[] mo9845e() {
        return this.f9967e;
    }

    /* renamed from: f */
    public int mo9846f() {
        return this.f9968f;
    }

    /* renamed from: g */
    public int mo9847g() {
        return this.f9969g;
    }

    /* renamed from: h */
    public boolean[] mo9848h() {
        return this.f9970h;
    }

    /* renamed from: i */
    public byte[] mo9849i() {
        return this.f9971i;
    }

    /* renamed from: j */
    public double[] mo9850j() {
        return this.f9972j;
    }

    public String toString() {
        return "SensorPacket [force_h=" + this.f9963a + ", force_s=" + this.f9964b + ", force=" + this.f9965c + ", acc_depth_min=" + Arrays.toString(this.f9966d) + ", acc_depth_max=" + Arrays.toString(this.f9967e) + ", atm=" + this.f9968f + ", pos_raw=" + this.f9969g + ", pos=" + Arrays.toString(this.f9970h) + ", acc_raw=" + Arrays.toString(this.f9971i) + ", acc=" + Arrays.toString(this.f9972j) + "]";
    }
}
