package com.p048a.p049a.p078j;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.SystemClock;

/* renamed from: com.a.a.j.e */
public final class C2234e {

    /* renamed from: a */
    private static final double f7324a;

    static {
        double d = 1.0d;
        if (17 <= Build.VERSION.SDK_INT) {
            d = 1.0d / Math.pow(10.0d, 6.0d);
        }
        f7324a = d;
    }

    private C2234e() {
    }

    /* renamed from: a */
    public static double m12705a(long j) {
        return ((double) (m12706a() - j)) * f7324a;
    }

    @TargetApi(17)
    /* renamed from: a */
    public static long m12706a() {
        return 17 <= Build.VERSION.SDK_INT ? SystemClock.elapsedRealtimeNanos() : System.currentTimeMillis();
    }
}
