package android.support.p010v4.p018f;

import android.graphics.Color;
import android.support.annotation.C0020ao;
import android.support.annotation.C0032k;
import android.support.annotation.C0037p;
import android.support.annotation.C0041t;
import android.support.annotation.C0047z;

/* renamed from: android.support.v4.f.e */
public final class C0516e {

    /* renamed from: a */
    private static final double f2085a = 95.047d;

    /* renamed from: b */
    private static final double f2086b = 100.0d;

    /* renamed from: c */
    private static final double f2087c = 108.883d;

    /* renamed from: d */
    private static final double f2088d = 0.008856d;

    /* renamed from: e */
    private static final double f2089e = 903.3d;

    /* renamed from: f */
    private static final int f2090f = 10;

    /* renamed from: g */
    private static final int f2091g = 1;

    /* renamed from: h */
    private static final ThreadLocal<double[]> f2092h = new ThreadLocal<>();

    private C0516e() {
    }

    /* renamed from: a */
    private static double m2684a(double d) {
        return d > f2088d ? Math.pow(d, 0.3333333333333333d) : ((f2089e * d) + 16.0d) / 116.0d;
    }

    @C0037p(mo18a = 0.0d, mo19b = 1.0d)
    /* renamed from: a */
    public static double m2685a(@C0032k int i) {
        double[] a = m2701a();
        m2708b(i, a);
        return a[1] / f2086b;
    }

    /* renamed from: a */
    public static double m2686a(@C0047z double[] dArr, @C0047z double[] dArr2) {
        return Math.sqrt(Math.pow(dArr[0] - dArr2[0], 2.0d) + Math.pow(dArr[1] - dArr2[1], 2.0d) + Math.pow(dArr[2] - dArr2[2], 2.0d));
    }

    @C0020ao
    /* renamed from: a */
    static float m2687a(float f, float f2, float f3) {
        if (Math.abs(f2 - f) > 180.0f) {
            if (f2 > f) {
                f += 360.0f;
            } else {
                f2 += 360.0f;
            }
        }
        return (((f2 - f) * f3) + f) % 360.0f;
    }

    @C0032k
    /* renamed from: a */
    public static int m2688a(@C0037p(mo18a = 0.0d, mo19b = 95.047d) double d, @C0037p(mo18a = 0.0d, mo19b = 100.0d) double d2, @C0037p(mo18a = 0.0d, mo19b = 108.883d) double d3) {
        double d4 = (((3.2406d * d) + (-1.5372d * d2)) + (-0.4986d * d3)) / f2086b;
        double d5 = (((-0.9689d * d) + (1.8758d * d2)) + (0.0415d * d3)) / f2086b;
        double d6 = (((0.0557d * d) + (-0.204d * d2)) + (1.057d * d3)) / f2086b;
        return Color.rgb(m2691a((int) Math.round((d4 > 0.0031308d ? (Math.pow(d4, 0.4166666666666667d) * 1.055d) - 0.055d : d4 * 12.92d) * 255.0d), 0, 255), m2691a((int) Math.round((d5 > 0.0031308d ? (1.055d * Math.pow(d5, 0.4166666666666667d)) - 0.055d : 12.92d * d5) * 255.0d), 0, 255), m2691a((int) Math.round((d6 > 0.0031308d ? (1.055d * Math.pow(d6, 0.4166666666666667d)) - 0.055d : 12.92d * d6) * 255.0d), 0, 255));
    }

    /* renamed from: a */
    public static int m2689a(@C0032k int i, @C0032k int i2) {
        int alpha = Color.alpha(i2);
        int alpha2 = Color.alpha(i);
        int d = m2710d(alpha2, alpha);
        return Color.argb(d, m2692a(Color.red(i), alpha2, Color.red(i2), alpha, d), m2692a(Color.green(i), alpha2, Color.green(i2), alpha, d), m2692a(Color.blue(i), alpha2, Color.blue(i2), alpha, d));
    }

    /* renamed from: a */
    public static int m2690a(@C0032k int i, @C0032k int i2, float f) {
        int i3 = 0;
        int i4 = 255;
        if (Color.alpha(i2) != 255) {
            throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i2));
        } else if (m2702b(m2709c(i, 255), i2) < ((double) f)) {
            return -1;
        } else {
            int i5 = 0;
            while (i5 <= 10 && i4 - i3 > 1) {
                int i6 = (i3 + i4) / 2;
                if (m2702b(m2709c(i, i6), i2) >= ((double) f)) {
                    i4 = i6;
                    i6 = i3;
                }
                i5++;
                i3 = i6;
            }
            return i4;
        }
    }

    /* renamed from: a */
    private static int m2691a(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    /* renamed from: a */
    private static int m2692a(int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        return (((i * 255) * i2) + ((i3 * i4) * (255 - i2))) / (i5 * 255);
    }

    @C0032k
    /* renamed from: a */
    public static int m2693a(@C0047z float[] fArr) {
        int round;
        int round2;
        int round3;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float abs = (1.0f - Math.abs((2.0f * f3) - 1.0f)) * f2;
        float f4 = f3 - (0.5f * abs);
        float abs2 = abs * (1.0f - Math.abs(((f / 60.0f) % 2.0f) - 1.0f));
        switch (((int) f) / 60) {
            case 0:
                round = Math.round((abs + f4) * 255.0f);
                round2 = Math.round((abs2 + f4) * 255.0f);
                round3 = Math.round(255.0f * f4);
                break;
            case 1:
                round = Math.round((abs2 + f4) * 255.0f);
                round2 = Math.round((abs + f4) * 255.0f);
                round3 = Math.round(255.0f * f4);
                break;
            case 2:
                round = Math.round(255.0f * f4);
                round2 = Math.round((abs + f4) * 255.0f);
                round3 = Math.round((abs2 + f4) * 255.0f);
                break;
            case 3:
                round = Math.round(255.0f * f4);
                round2 = Math.round((abs2 + f4) * 255.0f);
                round3 = Math.round((abs + f4) * 255.0f);
                break;
            case 4:
                round = Math.round((abs2 + f4) * 255.0f);
                round2 = Math.round(255.0f * f4);
                round3 = Math.round((abs + f4) * 255.0f);
                break;
            case 5:
            case 6:
                round = Math.round((abs + f4) * 255.0f);
                round2 = Math.round(255.0f * f4);
                round3 = Math.round((abs2 + f4) * 255.0f);
                break;
            default:
                round3 = 0;
                round2 = 0;
                round = 0;
                break;
        }
        return Color.rgb(m2691a(round, 0, 255), m2691a(round2, 0, 255), m2691a(round3, 0, 255));
    }

    /* renamed from: a */
    public static void m2694a(@C0037p(mo18a = 0.0d, mo19b = 95.047d) double d, @C0037p(mo18a = 0.0d, mo19b = 100.0d) double d2, @C0037p(mo18a = 0.0d, mo19b = 108.883d) double d3, @C0047z double[] dArr) {
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outLab must have a length of 3.");
        }
        double a = m2684a(d / f2085a);
        double a2 = m2684a(d2 / f2086b);
        double a3 = m2684a(d3 / f2087c);
        dArr[0] = Math.max(0.0d, (116.0d * a2) - 16.0d);
        dArr[1] = (a - a2) * 500.0d;
        dArr[2] = (a2 - a3) * 200.0d;
    }

    /* renamed from: a */
    public static void m2695a(@C0041t(mo24a = 0, mo25b = 255) int i, @C0041t(mo24a = 0, mo25b = 255) int i2, @C0041t(mo24a = 0, mo25b = 255) int i3, @C0047z double[] dArr) {
        m2707b(i, i2, i3, dArr);
        m2694a(dArr[0], dArr[1], dArr[2], dArr);
    }

    /* renamed from: a */
    public static void m2696a(@C0041t(mo24a = 0, mo25b = 255) int i, @C0041t(mo24a = 0, mo25b = 255) int i2, @C0041t(mo24a = 0, mo25b = 255) int i3, @C0047z float[] fArr) {
        float f;
        float abs;
        float f2 = ((float) i) / 255.0f;
        float f3 = ((float) i2) / 255.0f;
        float f4 = ((float) i3) / 255.0f;
        float max = Math.max(f2, Math.max(f3, f4));
        float min = Math.min(f2, Math.min(f3, f4));
        float f5 = max - min;
        float f6 = (max + min) / 2.0f;
        if (max == min) {
            abs = 0.0f;
            f = 0.0f;
        } else {
            f = max == f2 ? ((f3 - f4) / f5) % 6.0f : max == f3 ? ((f4 - f2) / f5) + 2.0f : ((f2 - f3) / f5) + 4.0f;
            abs = f5 / (1.0f - Math.abs((2.0f * f6) - 1.0f));
        }
        float f7 = (f * 60.0f) % 360.0f;
        if (f7 < 0.0f) {
            f7 += 360.0f;
        }
        fArr[0] = m2703b(f7, 0.0f, 360.0f);
        fArr[1] = m2703b(abs, 0.0f, 1.0f);
        fArr[2] = m2703b(f6, 0.0f, 1.0f);
    }

    /* renamed from: a */
    public static void m2697a(@C0032k int i, @C0047z double[] dArr) {
        m2695a(Color.red(i), Color.green(i), Color.blue(i), dArr);
    }

    /* renamed from: a */
    public static void m2698a(@C0032k int i, @C0047z float[] fArr) {
        m2696a(Color.red(i), Color.green(i), Color.blue(i), fArr);
    }

    /* renamed from: a */
    public static void m2699a(@C0047z double[] dArr, @C0047z double[] dArr2, @C0037p(mo18a = 0.0d, mo19b = 1.0d) double d, @C0047z double[] dArr3) {
        if (dArr3.length != 3) {
            throw new IllegalArgumentException("outResult must have a length of 3.");
        }
        double d2 = 1.0d - d;
        dArr3[0] = (dArr[0] * d2) + (dArr2[0] * d);
        dArr3[1] = (dArr[1] * d2) + (dArr2[1] * d);
        dArr3[2] = (d2 * dArr[2]) + (dArr2[2] * d);
    }

    /* renamed from: a */
    public static void m2700a(@C0047z float[] fArr, @C0047z float[] fArr2, @C0037p(mo18a = 0.0d, mo19b = 1.0d) float f, @C0047z float[] fArr3) {
        if (fArr3.length != 3) {
            throw new IllegalArgumentException("result must have a length of 3.");
        }
        float f2 = 1.0f - f;
        fArr3[0] = m2687a(fArr[0], fArr2[0], f);
        fArr3[1] = (fArr[1] * f2) + (fArr2[1] * f);
        fArr3[2] = (f2 * fArr[2]) + (fArr2[2] * f);
    }

    /* renamed from: a */
    private static double[] m2701a() {
        double[] dArr = f2092h.get();
        if (dArr != null) {
            return dArr;
        }
        double[] dArr2 = new double[3];
        f2092h.set(dArr2);
        return dArr2;
    }

    /* renamed from: b */
    public static double m2702b(@C0032k int i, @C0032k int i2) {
        if (Color.alpha(i2) != 255) {
            throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i2));
        }
        if (Color.alpha(i) < 255) {
            i = m2689a(i, i2);
        }
        double a = m2685a(i) + 0.05d;
        double a2 = m2685a(i2) + 0.05d;
        return Math.max(a, a2) / Math.min(a, a2);
    }

    /* renamed from: b */
    private static float m2703b(float f, float f2, float f3) {
        return f < f2 ? f2 : f > f3 ? f3 : f;
    }

    @C0032k
    /* renamed from: b */
    public static int m2704b(@C0037p(mo18a = 0.0d, mo19b = 100.0d) double d, @C0037p(mo18a = -128.0d, mo19b = 127.0d) double d2, @C0037p(mo18a = -128.0d, mo19b = 127.0d) double d3) {
        double[] a = m2701a();
        m2706b(d, d2, d3, a);
        return m2688a(a[0], a[1], a[2]);
    }

    @C0032k
    /* renamed from: b */
    public static int m2705b(@C0032k int i, @C0032k int i2, @C0037p(mo18a = 0.0d, mo19b = 1.0d) float f) {
        float f2 = 1.0f - f;
        return Color.argb((int) ((((float) Color.alpha(i)) * f2) + (((float) Color.alpha(i2)) * f)), (int) ((((float) Color.red(i)) * f2) + (((float) Color.red(i2)) * f)), (int) ((((float) Color.green(i)) * f2) + (((float) Color.green(i2)) * f)), (int) ((f2 * ((float) Color.blue(i))) + (((float) Color.blue(i2)) * f)));
    }

    /* renamed from: b */
    public static void m2706b(@C0037p(mo18a = 0.0d, mo19b = 100.0d) double d, @C0037p(mo18a = -128.0d, mo19b = 127.0d) double d2, @C0037p(mo18a = -128.0d, mo19b = 127.0d) double d3, @C0047z double[] dArr) {
        double d4 = (16.0d + d) / 116.0d;
        double d5 = (d2 / 500.0d) + d4;
        double d6 = d4 - (d3 / 200.0d);
        double pow = Math.pow(d5, 3.0d);
        double d7 = pow > f2088d ? pow : ((116.0d * d5) - 16.0d) / f2089e;
        double pow2 = d > 7.9996247999999985d ? Math.pow(d4, 3.0d) : d / f2089e;
        double pow3 = Math.pow(d6, 3.0d);
        if (pow3 <= f2088d) {
            pow3 = ((116.0d * d6) - 16.0d) / f2089e;
        }
        dArr[0] = d7 * f2085a;
        dArr[1] = pow2 * f2086b;
        dArr[2] = pow3 * f2087c;
    }

    /* renamed from: b */
    public static void m2707b(@C0041t(mo24a = 0, mo25b = 255) int i, @C0041t(mo24a = 0, mo25b = 255) int i2, @C0041t(mo24a = 0, mo25b = 255) int i3, @C0047z double[] dArr) {
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d = ((double) i) / 255.0d;
        double pow = d < 0.04045d ? d / 12.92d : Math.pow((d + 0.055d) / 1.055d, 2.4d);
        double d2 = ((double) i2) / 255.0d;
        double pow2 = d2 < 0.04045d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
        double d3 = ((double) i3) / 255.0d;
        double pow3 = d3 < 0.04045d ? d3 / 12.92d : Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = f2086b * ((0.4124d * pow) + (0.3576d * pow2) + (0.1805d * pow3));
        dArr[1] = f2086b * ((0.2126d * pow) + (0.7152d * pow2) + (0.0722d * pow3));
        dArr[2] = ((pow3 * 0.9505d) + (pow2 * 0.1192d) + (pow * 0.0193d)) * f2086b;
    }

    /* renamed from: b */
    public static void m2708b(@C0032k int i, @C0047z double[] dArr) {
        m2707b(Color.red(i), Color.green(i), Color.blue(i), dArr);
    }

    @C0032k
    /* renamed from: c */
    public static int m2709c(@C0032k int i, @C0041t(mo24a = 0, mo25b = 255) int i2) {
        if (i2 >= 0 && i2 <= 255) {
            return (16777215 & i) | (i2 << 24);
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }

    /* renamed from: d */
    private static int m2710d(int i, int i2) {
        return 255 - (((255 - i2) * (255 - i)) / 255);
    }
}
