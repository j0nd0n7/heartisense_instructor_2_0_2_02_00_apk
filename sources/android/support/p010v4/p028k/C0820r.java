package android.support.p010v4.p028k;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.UserManager;
import android.support.annotation.C0007ae;
import android.support.annotation.C0011ag;

@C0007ae(mo1a = 24)
@TargetApi(24)
@C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
/* renamed from: android.support.v4.k.r */
public class C0820r {
    /* renamed from: a */
    public static boolean m4104a(Context context) {
        return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
    }
}
