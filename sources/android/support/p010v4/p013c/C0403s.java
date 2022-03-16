package android.support.p010v4.p013c;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.support.annotation.C0007ae;

@C0007ae(mo1a = 23)
@TargetApi(23)
/* renamed from: android.support.v4.c.s */
class C0403s {
    C0403s() {
    }

    /* renamed from: a */
    public static int m2241a(Context context, String str, int i, String str2) {
        return ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteOp(str, i, str2);
    }

    /* renamed from: a */
    public static int m2242a(Context context, String str, String str2) {
        return ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOp(str, str2);
    }

    /* renamed from: a */
    public static String m2243a(String str) {
        return AppOpsManager.permissionToOp(str);
    }
}
