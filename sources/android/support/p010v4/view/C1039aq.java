package android.support.p010v4.view;

import android.annotation.TargetApi;
import android.support.annotation.C0007ae;
import android.view.VelocityTracker;

@C0007ae(mo1a = 11)
@TargetApi(11)
/* renamed from: android.support.v4.view.aq */
class C1039aq {
    C1039aq() {
    }

    /* renamed from: a */
    public static float m5849a(VelocityTracker velocityTracker, int i) {
        return velocityTracker.getXVelocity(i);
    }

    /* renamed from: b */
    public static float m5850b(VelocityTracker velocityTracker, int i) {
        return velocityTracker.getYVelocity(i);
    }
}
