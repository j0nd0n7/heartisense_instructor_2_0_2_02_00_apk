package android.support.p010v4.p014d;

import android.annotation.TargetApi;
import android.content.Context;
import android.support.annotation.C0007ae;
import java.io.File;

@C0007ae(mo1a = 19)
@TargetApi(19)
/* renamed from: android.support.v4.d.j */
class C0440j {
    C0440j() {
    }

    /* renamed from: a */
    public static File[] m2399a(Context context) {
        return context.getExternalCacheDirs();
    }

    /* renamed from: a */
    public static File[] m2400a(Context context, String str) {
        return context.getExternalFilesDirs(str);
    }

    /* renamed from: b */
    public static File[] m2401b(Context context) {
        return context.getObbDirs();
    }
}
