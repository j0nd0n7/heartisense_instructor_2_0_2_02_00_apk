package android.support.p010v4.p025i.p026a;

import android.annotation.TargetApi;
import android.media.session.MediaController;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.C0007ae;
import android.support.p010v4.p025i.p026a.C0609e;

@C0007ae(mo1a = 23)
@TargetApi(23)
/* renamed from: android.support.v4.i.a.f */
class C0614f {

    /* renamed from: android.support.v4.i.a.f$a */
    public static class C0615a extends C0609e.C0613d {
        /* renamed from: a */
        public static void m3289a(Object obj, Uri uri, Bundle bundle) {
            ((MediaController.TransportControls) obj).playFromUri(uri, bundle);
        }
    }

    C0614f() {
    }
}
