package android.support.p010v4.p013c;

import android.annotation.TargetApi;
import android.os.Bundle;
import android.os.IBinder;
import android.support.annotation.C0007ae;

@C0007ae(mo1a = 18)
@TargetApi(18)
/* renamed from: android.support.v4.c.aa */
class C0183aa {
    C0183aa() {
    }

    /* renamed from: a */
    public static IBinder m879a(Bundle bundle, String str) {
        return bundle.getBinder(str);
    }

    /* renamed from: a */
    public static void m880a(Bundle bundle, String str, IBinder iBinder) {
        bundle.putBinder(str, iBinder);
    }
}
