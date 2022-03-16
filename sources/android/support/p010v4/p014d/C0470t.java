package android.support.p010v4.p014d;

import android.os.Build;
import java.util.concurrent.Executor;

/* renamed from: android.support.v4.d.t */
public final class C0470t {
    private C0470t() {
    }

    /* renamed from: a */
    public static Executor m2511a() {
        return Build.VERSION.SDK_INT >= 11 ? C0442l.m2423a() : C0461s.f2019c;
    }
}
