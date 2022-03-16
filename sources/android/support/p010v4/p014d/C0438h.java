package android.support.p010v4.p014d;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.C0007ae;
import java.io.File;

@C0007ae(mo1a = 11)
@TargetApi(11)
/* renamed from: android.support.v4.d.h */
class C0438h {
    C0438h() {
    }

    /* renamed from: a */
    public static File m2395a(Context context) {
        return context.getObbDir();
    }

    /* renamed from: a */
    static void m2396a(Context context, Intent[] intentArr) {
        context.startActivities(intentArr);
    }
}
