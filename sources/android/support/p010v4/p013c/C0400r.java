package android.support.p010v4.p013c;

import android.content.Context;
import android.os.Build;
import android.support.annotation.C0047z;

/* renamed from: android.support.v4.c.r */
public final class C0400r {

    /* renamed from: a */
    public static final int f1881a = 0;

    /* renamed from: b */
    public static final int f1882b = 1;

    /* renamed from: c */
    public static final int f1883c = 3;

    /* renamed from: d */
    private static final C0402b f1884d;

    /* renamed from: android.support.v4.c.r$a */
    private static class C0401a extends C0402b {
        C0401a() {
        }

        /* renamed from: a */
        public int mo1678a(Context context, String str, int i, String str2) {
            return C0403s.m2241a(context, str, i, str2);
        }

        /* renamed from: a */
        public int mo1679a(Context context, String str, String str2) {
            return C0403s.m2242a(context, str, str2);
        }

        /* renamed from: a */
        public String mo1680a(String str) {
            return C0403s.m2243a(str);
        }
    }

    /* renamed from: android.support.v4.c.r$b */
    private static class C0402b {
        C0402b() {
        }

        /* renamed from: a */
        public int mo1678a(Context context, String str, int i, String str2) {
            return 1;
        }

        /* renamed from: a */
        public int mo1679a(Context context, String str, String str2) {
            return 1;
        }

        /* renamed from: a */
        public String mo1680a(String str) {
            return null;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 23) {
            f1884d = new C0401a();
        } else {
            f1884d = new C0402b();
        }
    }

    private C0400r() {
    }

    /* renamed from: a */
    public static int m2232a(@C0047z Context context, @C0047z String str, int i, @C0047z String str2) {
        return f1884d.mo1678a(context, str, i, str2);
    }

    /* renamed from: a */
    public static int m2233a(@C0047z Context context, @C0047z String str, @C0047z String str2) {
        return f1884d.mo1679a(context, str, str2);
    }

    /* renamed from: a */
    public static String m2234a(@C0047z String str) {
        return f1884d.mo1680a(str);
    }
}
