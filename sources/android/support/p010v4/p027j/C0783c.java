package android.support.p010v4.p027j;

import android.annotation.TargetApi;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.annotation.C0007ae;

@C0007ae(mo1a = 13)
@TargetApi(13)
/* renamed from: android.support.v4.j.c */
class C0783c {
    C0783c() {
    }

    /* renamed from: a */
    public static boolean m4018a(ConnectivityManager connectivityManager) {
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return true;
        }
        switch (activeNetworkInfo.getType()) {
            case 1:
            case 7:
            case 9:
                return false;
            default:
                return true;
        }
    }
}
