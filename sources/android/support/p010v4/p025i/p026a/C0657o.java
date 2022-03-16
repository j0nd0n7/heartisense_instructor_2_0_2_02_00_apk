package android.support.p010v4.p025i.p026a;

import android.annotation.TargetApi;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.C0007ae;
import android.support.p010v4.p025i.p026a.C0654n;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;

@C0007ae(mo1a = 24)
@TargetApi(24)
/* renamed from: android.support.v4.i.a.o */
class C0657o {

    /* renamed from: a */
    private static final String f2496a = "MediaSessionCompatApi24";

    /* renamed from: android.support.v4.i.a.o$a */
    public interface C0658a extends C0654n.C0655a {
        /* renamed from: b */
        void mo2282b(Uri uri, Bundle bundle);

        /* renamed from: d */
        void mo2283d(String str, Bundle bundle);

        /* renamed from: e */
        void mo2284e(String str, Bundle bundle);

        /* renamed from: h */
        void mo2285h();
    }

    /* renamed from: android.support.v4.i.a.o$b */
    static class C0659b<T extends C0658a> extends C0654n.C0656b<T> {
        public C0659b(T t) {
            super(t);
        }

        public void onPrepare() {
            ((C0658a) this.f2495a).mo2285h();
        }

        public void onPrepareFromMediaId(String str, Bundle bundle) {
            ((C0658a) this.f2495a).mo2283d(str, bundle);
        }

        public void onPrepareFromSearch(String str, Bundle bundle) {
            ((C0658a) this.f2495a).mo2284e(str, bundle);
        }

        public void onPrepareFromUri(Uri uri, Bundle bundle) {
            ((C0658a) this.f2495a).mo2282b(uri, bundle);
        }
    }

    C0657o() {
    }

    /* renamed from: a */
    public static Object m3632a(C0658a aVar) {
        return new C0659b(aVar);
    }

    /* renamed from: a */
    public static String m3633a(Object obj) {
        MediaSession mediaSession = (MediaSession) obj;
        try {
            return (String) mediaSession.getClass().getMethod("getCallingPackage", new Class[0]).invoke(mediaSession, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            Log.e(f2496a, "Cannot execute MediaSession.getCallingPackage()", e);
            return null;
        }
    }
}
