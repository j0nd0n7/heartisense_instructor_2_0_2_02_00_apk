package android.support.p010v4.p013c;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.annotation.C0007ae;

@C0007ae(mo1a = 16)
@TargetApi(16)
/* renamed from: android.support.v4.c.ay */
class C0255ay {
    C0255ay() {
    }

    /* renamed from: a */
    public static Intent m1565a(Activity activity) {
        return activity.getParentActivityIntent();
    }

    /* renamed from: a */
    public static String m1566a(ActivityInfo activityInfo) {
        return activityInfo.parentActivityName;
    }

    /* renamed from: a */
    public static boolean m1567a(Activity activity, Intent intent) {
        return activity.shouldUpRecreateTask(intent);
    }

    /* renamed from: b */
    public static void m1568b(Activity activity, Intent intent) {
        activity.navigateUpTo(intent);
    }
}
