package android.support.p010v4.p028k;

import android.annotation.TargetApi;
import android.os.CancellationSignal;
import android.support.annotation.C0007ae;

@C0007ae(mo1a = 16)
@TargetApi(16)
/* renamed from: android.support.v4.k.e */
class C0801e {
    C0801e() {
    }

    /* renamed from: a */
    public static Object m4082a() {
        return new CancellationSignal();
    }

    /* renamed from: a */
    public static void m4083a(Object obj) {
        ((CancellationSignal) obj).cancel();
    }
}
