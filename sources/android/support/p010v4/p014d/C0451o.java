package android.support.p010v4.p014d;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Intent;
import android.support.annotation.C0007ae;

@C0007ae(mo1a = 11)
@TargetApi(11)
/* renamed from: android.support.v4.d.o */
class C0451o {
    C0451o() {
    }

    /* renamed from: a */
    public static Intent m2448a(ComponentName componentName) {
        return Intent.makeMainActivity(componentName);
    }

    /* renamed from: b */
    public static Intent m2449b(ComponentName componentName) {
        return Intent.makeRestartActivityTask(componentName);
    }
}
