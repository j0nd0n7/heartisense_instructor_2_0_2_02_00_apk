package android.support.p010v4.view;

import android.annotation.TargetApi;
import android.support.annotation.C0007ae;
import android.view.MotionEvent;

@C0007ae(mo1a = 12)
@TargetApi(12)
/* renamed from: android.support.v4.view.y */
class C1205y {
    C1205y() {
    }

    /* renamed from: a */
    static float m7151a(MotionEvent motionEvent, int i) {
        return motionEvent.getAxisValue(i);
    }

    /* renamed from: a */
    static float m7152a(MotionEvent motionEvent, int i, int i2) {
        return motionEvent.getAxisValue(i, i2);
    }
}
