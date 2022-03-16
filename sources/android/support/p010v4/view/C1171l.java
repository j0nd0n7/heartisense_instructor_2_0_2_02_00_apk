package android.support.p010v4.view;

import android.annotation.TargetApi;
import android.support.annotation.C0007ae;
import android.view.KeyEvent;

@C0007ae(mo1a = 11)
@TargetApi(11)
/* renamed from: android.support.v4.view.l */
class C1171l {
    C1171l() {
    }

    /* renamed from: a */
    public static int m7019a(int i) {
        return KeyEvent.normalizeMetaState(i);
    }

    /* renamed from: a */
    public static boolean m7020a(int i, int i2) {
        return KeyEvent.metaStateHasModifiers(i, i2);
    }

    /* renamed from: a */
    public static boolean m7021a(KeyEvent keyEvent) {
        return keyEvent.isCtrlPressed();
    }

    /* renamed from: b */
    public static boolean m7022b(int i) {
        return KeyEvent.metaStateHasNoModifiers(i);
    }
}
