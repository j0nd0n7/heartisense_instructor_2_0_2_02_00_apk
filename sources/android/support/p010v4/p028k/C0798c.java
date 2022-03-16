package android.support.p010v4.p028k;

import android.os.Build;

/* renamed from: android.support.v4.k.c */
public class C0798c {
    private C0798c() {
    }

    /* renamed from: a */
    public static boolean m4072a() {
        return Build.VERSION.SDK_INT >= 24;
    }

    /* renamed from: b */
    public static boolean m4073b() {
        return Build.VERSION.SDK_INT >= 25;
    }

    /* renamed from: c */
    public static boolean m4074c() {
        return !"REL".equals(Build.VERSION.CODENAME) && ("O".equals(Build.VERSION.CODENAME) || Build.VERSION.CODENAME.startsWith("OMR"));
    }
}
