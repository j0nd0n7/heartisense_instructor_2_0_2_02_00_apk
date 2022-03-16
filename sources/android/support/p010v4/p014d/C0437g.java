package android.support.p010v4.p014d;

import android.annotation.TargetApi;
import android.content.Context;
import android.support.annotation.C0007ae;
import java.io.File;

@C0007ae(mo1a = 24)
@TargetApi(24)
/* renamed from: android.support.v4.d.g */
class C0437g {
    C0437g() {
    }

    /* renamed from: a */
    public static File m2392a(Context context) {
        return context.getDataDir();
    }

    /* renamed from: b */
    public static Context m2393b(Context context) {
        return context.createDeviceProtectedStorageContext();
    }

    /* renamed from: c */
    public static boolean m2394c(Context context) {
        return context.isDeviceProtectedStorage();
    }
}
