package android.support.p006e.p007a;

import android.graphics.Path;
import android.util.Log;
import java.util.ArrayList;

/* renamed from: android.support.e.a.e */
class C0126e {

    /* renamed from: a */
    private static final String f909a = "PathParser";

    /* renamed from: android.support.e.a.e$a */
    private static class C0127a {

        /* renamed from: a */
        int f910a;

        /* renamed from: b */
        boolean f911b;

        C0127a() {
        }
    }

    /* renamed from: android.support.e.a.e$b */
    public static class C0128b {

        /* renamed from: a */
        char f912a;

        /* renamed from: b */
        float[] f913b;

        C0128b(char c, float[] fArr) {
            this.f912a = c;
            this.f913b = fArr;
        }

        C0128b(C0128b bVar) {
            this.f912a = bVar.f912a;
            this.f913b = C0126e.m658a(bVar.f913b, 0, bVar.f913b.length);
        }

        /* renamed from: a */
        private static void m663a(Path path, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
            int ceil = (int) Math.ceil(Math.abs((4.0d * d9) / 3.141592653589793d));
            double cos = Math.cos(d7);
            double sin = Math.sin(d7);
            double cos2 = Math.cos(d8);
            double sin2 = Math.sin(d8);
            double d10 = (((-d3) * cos) * sin2) - ((d4 * sin) * cos2);
            double d11 = d9 / ((double) ceil);
            int i = 0;
            double d12 = (sin2 * (-d3) * sin) + (cos2 * d4 * cos);
            double d13 = d10;
            while (i < ceil) {
                double d14 = d8 + d11;
                double sin3 = Math.sin(d14);
                double cos3 = Math.cos(d14);
                double d15 = (((d3 * cos) * cos3) + d) - ((d4 * sin) * sin3);
                double d16 = (d4 * cos * sin3) + (d3 * sin * cos3) + d2;
                double d17 = (((-d3) * cos) * sin3) - ((d4 * sin) * cos3);
                double d18 = (cos3 * d4 * cos) + (sin3 * (-d3) * sin);
                double tan = Math.tan((d14 - d8) / 2.0d);
                double sqrt = ((Math.sqrt((tan * (3.0d * tan)) + 4.0d) - 1.0d) * Math.sin(d14 - d8)) / 3.0d;
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) ((d13 * sqrt) + d5), (float) (d6 + (d12 * sqrt)), (float) (d15 - (sqrt * d17)), (float) (d16 - (sqrt * d18)), (float) d15, (float) d16);
                i++;
                d13 = d17;
                d8 = d14;
                d6 = d16;
                d5 = d15;
                d12 = d18;
            }
        }

        /* renamed from: a */
        private static void m664a(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
            double d;
            double d2;
            double radians = Math.toRadians((double) f7);
            double cos = Math.cos(radians);
            double sin = Math.sin(radians);
            double d3 = ((((double) f) * cos) + (((double) f2) * sin)) / ((double) f5);
            double d4 = ((((double) (-f)) * sin) + (((double) f2) * cos)) / ((double) f6);
            double d5 = ((((double) f3) * cos) + (((double) f4) * sin)) / ((double) f5);
            double d6 = ((((double) (-f3)) * sin) + (((double) f4) * cos)) / ((double) f6);
            double d7 = d3 - d5;
            double d8 = d4 - d6;
            double d9 = (d3 + d5) / 2.0d;
            double d10 = (d4 + d6) / 2.0d;
            double d11 = (d7 * d7) + (d8 * d8);
            if (d11 == 0.0d) {
                Log.w(C0126e.f909a, " Points are coincident");
                return;
            }
            double d12 = (1.0d / d11) - 0.25d;
            if (d12 < 0.0d) {
                Log.w(C0126e.f909a, "Points are too far apart " + d11);
                float sqrt = (float) (Math.sqrt(d11) / 1.99999d);
                m664a(path, f, f2, f3, f4, f5 * sqrt, f6 * sqrt, f7, z, z2);
                return;
            }
            double sqrt2 = Math.sqrt(d12);
            double d13 = d7 * sqrt2;
            double d14 = d8 * sqrt2;
            if (z == z2) {
                d = d9 - d14;
                d2 = d13 + d10;
            } else {
                d = d14 + d9;
                d2 = d10 - d13;
            }
            double atan2 = Math.atan2(d4 - d2, d3 - d);
            double atan22 = Math.atan2(d6 - d2, d5 - d) - atan2;
            if (z2 != (atan22 >= 0.0d)) {
                atan22 = atan22 > 0.0d ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
            }
            double d15 = ((double) f5) * d;
            double d16 = d2 * ((double) f6);
            m663a(path, (d15 * cos) - (d16 * sin), (d15 * sin) + (d16 * cos), (double) f5, (double) f6, (double) f, (double) f2, radians, atan2, atan22);
        }

        /* renamed from: a */
        private static void m665a(Path path, float[] fArr, char c, char c2, float[] fArr2) {
            int i;
            float f;
            float f2;
            int i2;
            float f3;
            int i3;
            int i4;
            float f4;
            float f5;
            float f6;
            float f7;
            float f8;
            float f9;
            int i5 = fArr[0];
            int i6 = fArr[1];
            int i7 = fArr[2];
            int i8 = fArr[3];
            int i9 = fArr[4];
            int i10 = fArr[5];
            switch (c2) {
                case 'A':
                case 'a':
                    i = 7;
                    break;
                case 'C':
                case 'c':
                    i = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i = 1;
                    break;
                case 'L':
                case 'M':
                case 'T':
                case 'l':
                case 'm':
                case 't':
                    i = 2;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(i9, i10);
                    i8 = i10;
                    i7 = i9;
                    i6 = i10;
                    i5 = i9;
                    i = 2;
                    break;
                default:
                    i = 2;
                    break;
            }
            int i11 = 0;
            int i12 = i10;
            int i13 = i9;
            int i14 = i6;
            int i15 = i5;
            while (i11 < fArr2.length) {
                switch (c2) {
                    case 'A':
                        m664a(path, i15, i14, fArr2[i11 + 5], fArr2[i11 + 6], fArr2[i11 + 0], fArr2[i11 + 1], fArr2[i11 + 2], fArr2[i11 + 3] != 0.0f, fArr2[i11 + 4] != 0.0f);
                        int i16 = fArr2[i11 + 5];
                        int i17 = fArr2[i11 + 6];
                        f = i12;
                        f2 = i13;
                        i2 = i16;
                        f3 = i17;
                        i3 = i16;
                        i4 = i17;
                        break;
                    case 'C':
                        path.cubicTo(fArr2[i11 + 0], fArr2[i11 + 1], fArr2[i11 + 2], fArr2[i11 + 3], fArr2[i11 + 4], fArr2[i11 + 5]);
                        float f10 = fArr2[i11 + 4];
                        int i18 = fArr2[i11 + 5];
                        i2 = fArr2[i11 + 2];
                        f3 = i18;
                        i3 = f10;
                        f = i12;
                        f2 = i13;
                        i4 = fArr2[i11 + 3];
                        break;
                    case 'H':
                        path.lineTo(fArr2[i11 + 0], i14);
                        f = i12;
                        i2 = i7;
                        f3 = i14;
                        i3 = fArr2[i11 + 0];
                        i4 = i8;
                        f2 = i13;
                        break;
                    case 'L':
                        path.lineTo(fArr2[i11 + 0], fArr2[i11 + 1]);
                        float f11 = fArr2[i11 + 0];
                        i2 = i7;
                        f3 = fArr2[i11 + 1];
                        i3 = f11;
                        f = i12;
                        f2 = i13;
                        i4 = i8;
                        break;
                    case 'M':
                        f2 = fArr2[i11 + 0];
                        f = fArr2[i11 + 1];
                        if (i11 <= 0) {
                            path.moveTo(fArr2[i11 + 0], fArr2[i11 + 1]);
                            i2 = i7;
                            f3 = f;
                            i3 = f2;
                            i4 = i8;
                            break;
                        } else {
                            path.lineTo(fArr2[i11 + 0], fArr2[i11 + 1]);
                            i2 = i7;
                            f3 = f;
                            i3 = f2;
                            f = i12;
                            f2 = i13;
                            i4 = i8;
                            break;
                        }
                    case 'Q':
                        path.quadTo(fArr2[i11 + 0], fArr2[i11 + 1], fArr2[i11 + 2], fArr2[i11 + 3]);
                        float f12 = fArr2[i11 + 0];
                        int i19 = fArr2[i11 + 1];
                        float f13 = fArr2[i11 + 2];
                        i2 = f12;
                        f3 = fArr2[i11 + 3];
                        i3 = f13;
                        f = i12;
                        f2 = i13;
                        i4 = i19;
                        break;
                    case 'S':
                        if (c == 'c' || c == 's' || c == 'C' || c == 'S') {
                            f7 = (2.0f * i15) - i7;
                            f6 = (2.0f * i14) - i8;
                        } else {
                            f6 = i14;
                            f7 = i15;
                        }
                        path.cubicTo(f7, f6, fArr2[i11 + 0], fArr2[i11 + 1], fArr2[i11 + 2], fArr2[i11 + 3]);
                        int i20 = fArr2[i11 + 0];
                        int i21 = fArr2[i11 + 1];
                        float f14 = fArr2[i11 + 2];
                        i2 = i20;
                        f3 = fArr2[i11 + 3];
                        i3 = f14;
                        f = i12;
                        f2 = i13;
                        i4 = i21;
                        break;
                    case 'T':
                        if (c == 'q' || c == 't' || c == 'Q' || c == 'T') {
                            i15 = (2.0f * i15) - i7;
                            i14 = (2.0f * i14) - i8;
                        }
                        path.quadTo(i15, i14, fArr2[i11 + 0], fArr2[i11 + 1]);
                        float f15 = fArr2[i11 + 0];
                        i4 = i14;
                        i2 = i15;
                        f3 = fArr2[i11 + 1];
                        i3 = f15;
                        f = i12;
                        f2 = i13;
                        break;
                    case 'V':
                        path.lineTo(i15, fArr2[i11 + 0]);
                        f2 = i13;
                        i2 = i7;
                        f3 = fArr2[i11 + 0];
                        i3 = i15;
                        i4 = i8;
                        f = i12;
                        break;
                    case 'a':
                        m664a(path, i15, i14, fArr2[i11 + 5] + i15, fArr2[i11 + 6] + i14, fArr2[i11 + 0], fArr2[i11 + 1], fArr2[i11 + 2], fArr2[i11 + 3] != 0.0f, fArr2[i11 + 4] != 0.0f);
                        float f16 = i15 + fArr2[i11 + 5];
                        float f17 = fArr2[i11 + 6] + i14;
                        f = i12;
                        f2 = i13;
                        i2 = f16;
                        f3 = f17;
                        i3 = f16;
                        i4 = f17;
                        break;
                    case 'c':
                        path.rCubicTo(fArr2[i11 + 0], fArr2[i11 + 1], fArr2[i11 + 2], fArr2[i11 + 3], fArr2[i11 + 4], fArr2[i11 + 5]);
                        float f18 = i15 + fArr2[i11 + 2];
                        float f19 = i15 + fArr2[i11 + 4];
                        i2 = f18;
                        f3 = fArr2[i11 + 5] + i14;
                        i3 = f19;
                        f = i12;
                        f2 = i13;
                        i4 = fArr2[i11 + 3] + i14;
                        break;
                    case 'h':
                        path.rLineTo(fArr2[i11 + 0], 0.0f);
                        f = i12;
                        i2 = i7;
                        f3 = i14;
                        i3 = i15 + fArr2[i11 + 0];
                        i4 = i8;
                        f2 = i13;
                        break;
                    case 'l':
                        path.rLineTo(fArr2[i11 + 0], fArr2[i11 + 1]);
                        float f20 = i15 + fArr2[i11 + 0];
                        i2 = i7;
                        f3 = fArr2[i11 + 1] + i14;
                        i3 = f20;
                        f = i12;
                        f2 = i13;
                        i4 = i8;
                        break;
                    case 'm':
                        f2 = i15 + fArr2[i11 + 0];
                        f = fArr2[i11 + 1] + i14;
                        if (i11 <= 0) {
                            path.rMoveTo(fArr2[i11 + 0], fArr2[i11 + 1]);
                            i2 = i7;
                            f3 = f;
                            i3 = f2;
                            i4 = i8;
                            break;
                        } else {
                            path.rLineTo(fArr2[i11 + 0], fArr2[i11 + 1]);
                            i2 = i7;
                            f3 = f;
                            i3 = f2;
                            f = i12;
                            f2 = i13;
                            i4 = i8;
                            break;
                        }
                    case 'q':
                        path.rQuadTo(fArr2[i11 + 0], fArr2[i11 + 1], fArr2[i11 + 2], fArr2[i11 + 3]);
                        float f21 = i15 + fArr2[i11 + 0];
                        float f22 = i15 + fArr2[i11 + 2];
                        i2 = f21;
                        f3 = fArr2[i11 + 3] + i14;
                        i3 = f22;
                        f = i12;
                        f2 = i13;
                        i4 = fArr2[i11 + 1] + i14;
                        break;
                    case 's':
                        if (c == 'c' || c == 's' || c == 'C' || c == 'S') {
                            f9 = i15 - i7;
                            f8 = i14 - i8;
                        } else {
                            f8 = 0.0f;
                            f9 = 0.0f;
                        }
                        path.rCubicTo(f9, f8, fArr2[i11 + 0], fArr2[i11 + 1], fArr2[i11 + 2], fArr2[i11 + 3]);
                        float f23 = i15 + fArr2[i11 + 0];
                        float f24 = i15 + fArr2[i11 + 2];
                        i2 = f23;
                        f3 = fArr2[i11 + 3] + i14;
                        i3 = f24;
                        f = i12;
                        f2 = i13;
                        i4 = fArr2[i11 + 1] + i14;
                        break;
                    case 't':
                        if (c == 'q' || c == 't' || c == 'Q' || c == 'T') {
                            f4 = i15 - i7;
                            f5 = i14 - i8;
                        } else {
                            f5 = 0.0f;
                            f4 = 0.0f;
                        }
                        path.rQuadTo(f4, f5, fArr2[i11 + 0], fArr2[i11 + 1]);
                        float f25 = i15 + fArr2[i11 + 0];
                        i2 = i15 + f4;
                        f3 = fArr2[i11 + 1] + i14;
                        i3 = f25;
                        f = i12;
                        f2 = i13;
                        i4 = f5 + i14;
                        break;
                    case 'v':
                        path.rLineTo(0.0f, fArr2[i11 + 0]);
                        f2 = i13;
                        i2 = i7;
                        f3 = fArr2[i11 + 0] + i14;
                        i3 = i15;
                        i4 = i8;
                        f = i12;
                        break;
                    default:
                        f = i12;
                        f2 = i13;
                        i2 = i7;
                        f3 = i14;
                        i3 = i15;
                        i4 = i8;
                        break;
                }
                i11 += i;
                i12 = f;
                i13 = f2;
                i14 = f3;
                i15 = i3;
                c = c2;
                i8 = i4;
                i7 = i2;
            }
            fArr[0] = i15;
            fArr[1] = i14;
            fArr[2] = i7;
            fArr[3] = i8;
            fArr[4] = i13;
            fArr[5] = i12;
        }

        /* renamed from: a */
        public static void m666a(C0128b[] bVarArr, Path path) {
            float[] fArr = new float[6];
            char c = 'm';
            for (int i = 0; i < bVarArr.length; i++) {
                m665a(path, fArr, c, bVarArr[i].f912a, bVarArr[i].f913b);
                c = bVarArr[i].f912a;
            }
        }

        /* renamed from: a */
        public void mo618a(C0128b bVar, C0128b bVar2, float f) {
            for (int i = 0; i < bVar.f913b.length; i++) {
                this.f913b[i] = (bVar.f913b[i] * (1.0f - f)) + (bVar2.f913b[i] * f);
            }
        }
    }

    C0126e() {
    }

    /* renamed from: a */
    private static int m653a(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (((charAt - 'A') * (charAt - 'Z') <= 0 || (charAt - 'a') * (charAt - 'z') <= 0) && charAt != 'e' && charAt != 'E') {
                break;
            }
            i++;
        }
        return i;
    }

    /* renamed from: a */
    public static Path m654a(String str) {
        Path path = new Path();
        C0128b[] b = m661b(str);
        if (b == null) {
            return null;
        }
        try {
            C0128b.m666a(b, path);
            return path;
        } catch (RuntimeException e) {
            throw new RuntimeException("Error in parsing " + str, e);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m655a(java.lang.String r7, int r8, android.support.p006e.p007a.C0126e.C0127a r9) {
        /*
            r1 = 0
            r5 = 1
            r9.f911b = r1
            r0 = r1
            r2 = r1
            r3 = r1
            r4 = r8
        L_0x0008:
            int r6 = r7.length()
            if (r4 >= r6) goto L_0x0018
            char r6 = r7.charAt(r4)
            switch(r6) {
                case 32: goto L_0x001b;
                case 44: goto L_0x001b;
                case 45: goto L_0x001e;
                case 46: goto L_0x0027;
                case 69: goto L_0x0031;
                case 101: goto L_0x0031;
                default: goto L_0x0015;
            }
        L_0x0015:
            r0 = r1
        L_0x0016:
            if (r3 == 0) goto L_0x0033
        L_0x0018:
            r9.f910a = r4
            return
        L_0x001b:
            r0 = r1
            r3 = r5
            goto L_0x0016
        L_0x001e:
            if (r4 == r8) goto L_0x0015
            if (r0 != 0) goto L_0x0015
            r9.f911b = r5
            r0 = r1
            r3 = r5
            goto L_0x0016
        L_0x0027:
            if (r2 != 0) goto L_0x002c
            r0 = r1
            r2 = r5
            goto L_0x0016
        L_0x002c:
            r9.f911b = r5
            r0 = r1
            r3 = r5
            goto L_0x0016
        L_0x0031:
            r0 = r5
            goto L_0x0016
        L_0x0033:
            int r4 = r4 + 1
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p006e.p007a.C0126e.m655a(java.lang.String, int, android.support.e.a.e$a):void");
    }

    /* renamed from: a */
    private static void m656a(ArrayList<C0128b> arrayList, char c, float[] fArr) {
        arrayList.add(new C0128b(c, fArr));
    }

    /* renamed from: a */
    public static boolean m657a(C0128b[] bVarArr, C0128b[] bVarArr2) {
        if (bVarArr == null || bVarArr2 == null || bVarArr.length != bVarArr2.length) {
            return false;
        }
        for (int i = 0; i < bVarArr.length; i++) {
            if (bVarArr[i].f912a != bVarArr2[i].f912a || bVarArr[i].f913b.length != bVarArr2[i].f913b.length) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    static float[] m658a(float[] fArr, int i, int i2) {
        if (i > i2) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (i < 0 || i > length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i3 = i2 - i;
        int min = Math.min(i3, length - i);
        float[] fArr2 = new float[i3];
        System.arraycopy(fArr, i, fArr2, 0, min);
        return fArr2;
    }

    /* renamed from: a */
    public static C0128b[] m659a(C0128b[] bVarArr) {
        if (bVarArr == null) {
            return null;
        }
        C0128b[] bVarArr2 = new C0128b[bVarArr.length];
        for (int i = 0; i < bVarArr.length; i++) {
            bVarArr2[i] = new C0128b(bVarArr[i]);
        }
        return bVarArr2;
    }

    /* renamed from: b */
    public static void m660b(C0128b[] bVarArr, C0128b[] bVarArr2) {
        for (int i = 0; i < bVarArr2.length; i++) {
            bVarArr[i].f912a = bVarArr2[i].f912a;
            for (int i2 = 0; i2 < bVarArr2[i].f913b.length; i2++) {
                bVarArr[i].f913b[i2] = bVarArr2[i].f913b[i2];
            }
        }
    }

    /* renamed from: b */
    public static C0128b[] m661b(String str) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i = 1;
        int i2 = 0;
        while (i < str.length()) {
            int a = m653a(str, i);
            String trim = str.substring(i2, a).trim();
            if (trim.length() > 0) {
                m656a((ArrayList<C0128b>) arrayList, trim.charAt(0), m662c(trim));
            }
            i = a + 1;
            i2 = a;
        }
        if (i - i2 == 1 && i2 < str.length()) {
            m656a((ArrayList<C0128b>) arrayList, str.charAt(i2), new float[0]);
        }
        return (C0128b[]) arrayList.toArray(new C0128b[arrayList.size()]);
    }

    /* renamed from: c */
    private static float[] m662c(String str) {
        int i;
        if ((str.charAt(0) == 'z') || (str.charAt(0) == 'Z')) {
            return new float[0];
        }
        try {
            float[] fArr = new float[str.length()];
            C0127a aVar = new C0127a();
            int length = str.length();
            int i2 = 0;
            int i3 = 1;
            while (i3 < length) {
                m655a(str, i3, aVar);
                int i4 = aVar.f910a;
                if (i3 < i4) {
                    i = i2 + 1;
                    fArr[i2] = Float.parseFloat(str.substring(i3, i4));
                } else {
                    i = i2;
                }
                if (aVar.f911b) {
                    i3 = i4;
                    i2 = i;
                } else {
                    i3 = i4 + 1;
                    i2 = i;
                }
            }
            return m658a(fArr, 0, i2);
        } catch (NumberFormatException e) {
            throw new RuntimeException("error in parsing \"" + str + "\"", e);
        }
    }
}
