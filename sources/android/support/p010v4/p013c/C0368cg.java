package android.support.p010v4.p013c;

import android.annotation.TargetApi;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.C0007ae;

@C0007ae(mo1a = 11)
@TargetApi(11)
/* renamed from: android.support.v4.c.cg */
class C0368cg {
    C0368cg() {
    }

    /* renamed from: a */
    public static PendingIntent m2109a(Context context, int i, Intent[] intentArr, int i2) {
        return PendingIntent.getActivities(context, i, intentArr, i2);
    }
}
