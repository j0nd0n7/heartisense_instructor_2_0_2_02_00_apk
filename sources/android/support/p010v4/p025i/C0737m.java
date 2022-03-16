package android.support.p010v4.p025i;

import android.annotation.TargetApi;
import android.media.MediaDescription;
import android.net.Uri;
import android.support.annotation.C0007ae;
import android.support.p010v4.p025i.C0735l;

@C0007ae(mo1a = 23)
@TargetApi(23)
/* renamed from: android.support.v4.i.m */
class C0737m extends C0735l {

    /* renamed from: android.support.v4.i.m$a */
    static class C0738a extends C0735l.C0736a {
        C0738a() {
        }

        /* renamed from: b */
        public static void m3864b(Object obj, Uri uri) {
            ((MediaDescription.Builder) obj).setMediaUri(uri);
        }
    }

    C0737m() {
    }

    /* renamed from: h */
    public static Uri m3863h(Object obj) {
        return ((MediaDescription) obj).getMediaUri();
    }
}
