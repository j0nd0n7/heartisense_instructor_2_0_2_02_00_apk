package android.support.p010v4.p013c;

import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;

/* renamed from: android.support.v4.c.y */
public final class C0411y {
    private C0411y() {
    }

    /* renamed from: a */
    public static IBinder m2301a(Bundle bundle, String str) {
        return Build.VERSION.SDK_INT >= 18 ? C0183aa.m879a(bundle, str) : C0412z.m2303a(bundle, str);
    }

    /* renamed from: a */
    public static void m2302a(Bundle bundle, String str, IBinder iBinder) {
        if (Build.VERSION.SDK_INT >= 18) {
            C0183aa.m880a(bundle, str, iBinder);
        } else {
            C0412z.m2304a(bundle, str, iBinder);
        }
    }
}
