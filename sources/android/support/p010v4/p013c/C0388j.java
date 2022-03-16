package android.support.p010v4.p013c;

import android.app.ActivityManager;
import android.os.Build;
import android.support.annotation.C0047z;

/* renamed from: android.support.v4.c.j */
public final class C0388j {
    private C0388j() {
    }

    /* renamed from: a */
    public static boolean m2166a(@C0047z ActivityManager activityManager) {
        if (Build.VERSION.SDK_INT >= 19) {
            return C0389k.m2167a(activityManager);
        }
        return false;
    }
}
