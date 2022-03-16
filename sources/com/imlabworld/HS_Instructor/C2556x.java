package com.imlabworld.HS_Instructor;

import com.imlabworld.p079a.C2591b;
import com.imlabworld.p079a.C2613r;

/* renamed from: com.imlabworld.HS_Instructor.x */
class C2556x {

    /* renamed from: a */
    static final int f9784a = 45;

    /* renamed from: b */
    static final int f9785b = 65;

    /* renamed from: c */
    static final int f9786c = 58;

    /* renamed from: d */
    static final int f9787d = 84;

    /* renamed from: e */
    static int f9788e = 58;

    /* renamed from: f */
    static int f9789f = 84;

    /* renamed from: g */
    static final double f9790g = 0.5d;

    /* renamed from: h */
    static final double f9791h = 0.6d;

    /* renamed from: i */
    static final double f9792i = 5.0d;

    /* renamed from: j */
    static final double f9793j = 15.0d;

    /* renamed from: k */
    static final int f9794k = 35;

    /* renamed from: l */
    static final int f9795l = 70;

    /* renamed from: m */
    static double f9796m = f9809z;

    /* renamed from: n */
    static double f9797n = 12.0d;

    /* renamed from: o */
    static double f9798o = f9809z;

    /* renamed from: p */
    static final int[] f9799p = new int[6];

    /* renamed from: q */
    static final int[] f9800q = new int[6];

    /* renamed from: r */
    static final int[] f9801r = new int[6];

    /* renamed from: s */
    static final int[] f9802s = new int[6];

    /* renamed from: t */
    static final int[] f9803t = new int[6];

    /* renamed from: u */
    static final int[] f9804u = new int[6];

    /* renamed from: v */
    static final C2613r[] f9805v = new C2613r[6];

    /* renamed from: w */
    static final C2334ac[] f9806w = new C2334ac[6];

    /* renamed from: x */
    static final C2591b[] f9807x = new C2591b[6];

    /* renamed from: y */
    static int f9808y = 0;

    /* renamed from: z */
    private static final double f9809z = 13.0d;

    C2556x() {
    }

    /* renamed from: a */
    static double m14293a(double d, C2552t tVar) {
        return (tVar.f9747c != 2 ? d < 58.0d ? (d * f9792i) / 58.0d : d <= 84.0d ? (((d - 58.0d) * 1.0d) / 26.0d) + f9792i : (6.0d * d) / 84.0d : d < 45.0d ? (d * 4.0d) / 45.0d : d <= 65.0d ? (((d - 45.0d) * 1.0d) / 20.0d) + 4.0d : (d * f9792i) / 65.0d) * 10.0d;
    }

    /* renamed from: b */
    static double m14294b(double d, C2552t tVar) {
        return tVar.f9747c != 2 ? d < 35.0d ? (d * 400.0d) / 35.0d : d <= 70.0d ? (((d - 35.0d) * 300.0d) / 35.0d) + 400.0d : (700.0d * d) / 70.0d : d < 35.0d ? (d * 140.0d) / 35.0d : d <= 70.0d ? (((d - 35.0d) * 210.0d) / 35.0d) + 140.0d : (350.0d * d) / 70.0d;
    }
}
