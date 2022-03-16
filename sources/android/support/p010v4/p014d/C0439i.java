package android.support.p010v4.p014d;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.C0007ae;

@C0007ae(mo1a = 16)
@TargetApi(16)
/* renamed from: android.support.v4.d.i */
class C0439i {
    C0439i() {
    }

    /* renamed from: a */
    public static void m2397a(Context context, Intent intent, Bundle bundle) {
        context.startActivity(intent, bundle);
    }

    /* renamed from: a */
    public static void m2398a(Context context, Intent[] intentArr, Bundle bundle) {
        context.startActivities(intentArr, bundle);
    }
}
