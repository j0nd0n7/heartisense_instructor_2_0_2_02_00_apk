package android.support.p010v4.p013c;

import android.annotation.TargetApi;
import android.app.NotificationManager;
import android.support.annotation.C0007ae;

@C0007ae(mo1a = 24)
@TargetApi(24)
/* renamed from: android.support.v4.c.bp */
class C0325bp {
    C0325bp() {
    }

    /* renamed from: a */
    public static boolean m1965a(NotificationManager notificationManager) {
        return notificationManager.areNotificationsEnabled();
    }

    /* renamed from: b */
    public static int m1966b(NotificationManager notificationManager) {
        return notificationManager.getImportance();
    }
}
