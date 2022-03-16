package android.support.p010v4.p025i.p026a;

import android.annotation.TargetApi;
import android.media.session.MediaController;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.C0007ae;
import android.support.p010v4.p025i.p026a.C0614f;

@C0007ae(mo1a = 24)
@TargetApi(24)
/* renamed from: android.support.v4.i.a.g */
class C0616g {

    /* renamed from: android.support.v4.i.a.g$a */
    public static class C0617a extends C0614f.C0615a {
        /* renamed from: b */
        public static void m3290b(Object obj, Uri uri, Bundle bundle) {
            ((MediaController.TransportControls) obj).prepareFromUri(uri, bundle);
        }

        /* renamed from: d */
        public static void m3291d(Object obj, String str, Bundle bundle) {
            ((MediaController.TransportControls) obj).prepareFromMediaId(str, bundle);
        }

        /* renamed from: e */
        public static void m3292e(Object obj, String str, Bundle bundle) {
            ((MediaController.TransportControls) obj).prepareFromSearch(str, bundle);
        }

        /* renamed from: h */
        public static void m3293h(Object obj) {
            ((MediaController.TransportControls) obj).prepare();
        }
    }

    C0616g() {
    }
}
