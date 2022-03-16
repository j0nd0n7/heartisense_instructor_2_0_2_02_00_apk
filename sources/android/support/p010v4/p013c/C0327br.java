package android.support.p010v4.p013c;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.support.annotation.C0007ae;
import java.lang.reflect.InvocationTargetException;

@C0007ae(mo1a = 19)
@TargetApi(19)
/* renamed from: android.support.v4.c.br */
class C0327br {

    /* renamed from: a */
    private static final String f1798a = "checkOpNoThrow";

    /* renamed from: b */
    private static final String f1799b = "OP_POST_NOTIFICATION";

    C0327br() {
    }

    /* renamed from: a */
    public static boolean m1967a(Context context) {
        AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String packageName = context.getApplicationContext().getPackageName();
        int i = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            return ((Integer) cls.getMethod(f1798a, new Class[]{Integer.TYPE, Integer.TYPE, String.class}).invoke(appOpsManager, new Object[]{Integer.valueOf(((Integer) cls.getDeclaredField(f1799b).get(Integer.class)).intValue()), Integer.valueOf(i), packageName})).intValue() == 0;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException e) {
            return true;
        }
    }
}
