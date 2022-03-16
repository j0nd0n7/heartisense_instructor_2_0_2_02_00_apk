package android.support.p036v7.app;

import android.annotation.TargetApi;
import android.app.Notification;
import android.media.session.MediaSession;
import android.support.annotation.C0007ae;
import android.support.p010v4.p013c.C0260bb;

@C0007ae(mo1a = 21)
@TargetApi(21)
/* renamed from: android.support.v7.app.t */
class C1463t {
    C1463t() {
    }

    /* renamed from: a */
    public static void m8573a(C0260bb bbVar, int[] iArr, Object obj) {
        Notification.MediaStyle mediaStyle = new Notification.MediaStyle(bbVar.mo1326a());
        if (iArr != null) {
            mediaStyle.setShowActionsInCompactView(iArr);
        }
        if (obj != null) {
            mediaStyle.setMediaSession((MediaSession.Token) obj);
        }
    }
}
