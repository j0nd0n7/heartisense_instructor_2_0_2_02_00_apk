package android.support.p010v4.p013c;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.support.annotation.C0007ae;

@C0007ae(mo1a = 16)
@TargetApi(16)
/* renamed from: android.support.v4.c.i */
class C0387i {
    C0387i() {
    }

    /* renamed from: a */
    public static void m2163a(Activity activity) {
        activity.finishAffinity();
    }

    /* renamed from: a */
    public static void m2164a(Activity activity, Intent intent, int i, Bundle bundle) {
        activity.startActivityForResult(intent, i, bundle);
    }

    /* renamed from: a */
    public static void m2165a(Activity activity, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }
}
