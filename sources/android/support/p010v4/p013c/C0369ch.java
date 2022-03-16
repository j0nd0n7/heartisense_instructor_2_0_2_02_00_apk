package android.support.p010v4.p013c;

import android.annotation.TargetApi;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.C0007ae;

@C0007ae(mo1a = 16)
@TargetApi(16)
/* renamed from: android.support.v4.c.ch */
class C0369ch {
    C0369ch() {
    }

    /* renamed from: a */
    public static PendingIntent m2110a(Context context, int i, Intent[] intentArr, int i2, Bundle bundle) {
        return PendingIntent.getActivities(context, i, intentArr, i2, bundle);
    }
}
