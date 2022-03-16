package android.support.p010v4.p025i;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.support.annotation.C0007ae;
import android.support.annotation.C0047z;
import java.util.List;

@C0007ae(mo1a = 21)
@TargetApi(21)
/* renamed from: android.support.v4.i.b */
class C0676b {

    /* renamed from: a */
    static final String f2584a = "android.support.v4.media.MediaBrowserCompat.NULL_MEDIA_ITEM";

    /* renamed from: android.support.v4.i.b$a */
    interface C0677a {
        /* renamed from: a */
        void mo1963a();

        /* renamed from: b */
        void mo1964b();

        /* renamed from: c */
        void mo1965c();
    }

    /* renamed from: android.support.v4.i.b$b */
    static class C0678b<T extends C0677a> extends MediaBrowser.ConnectionCallback {

        /* renamed from: a */
        protected final T f2585a;

        public C0678b(T t) {
            this.f2585a = t;
        }

        public void onConnected() {
            this.f2585a.mo1963a();
        }

        public void onConnectionFailed() {
            this.f2585a.mo1965c();
        }

        public void onConnectionSuspended() {
            this.f2585a.mo1964b();
        }
    }

    /* renamed from: android.support.v4.i.b$c */
    static class C0679c {
        C0679c() {
        }

        /* renamed from: a */
        public static int m3709a(Object obj) {
            return ((MediaBrowser.MediaItem) obj).getFlags();
        }

        /* renamed from: b */
        public static Object m3710b(Object obj) {
            return ((MediaBrowser.MediaItem) obj).getDescription();
        }
    }

    /* renamed from: android.support.v4.i.b$d */
    interface C0680d {
        /* renamed from: a */
        void mo2035a(@C0047z String str);

        /* renamed from: a */
        void mo2036a(@C0047z String str, List<?> list);
    }

    /* renamed from: android.support.v4.i.b$e */
    static class C0681e<T extends C0680d> extends MediaBrowser.SubscriptionCallback {

        /* renamed from: a */
        protected final T f2586a;

        public C0681e(T t) {
            this.f2586a = t;
        }

        public void onChildrenLoaded(@C0047z String str, List<MediaBrowser.MediaItem> list) {
            this.f2586a.mo2036a(str, list);
        }

        public void onError(@C0047z String str) {
            this.f2586a.mo2035a(str);
        }
    }

    C0676b() {
    }

    /* renamed from: a */
    public static Object m3694a(Context context, ComponentName componentName, Object obj, Bundle bundle) {
        return new MediaBrowser(context, componentName, (MediaBrowser.ConnectionCallback) obj, bundle);
    }

    /* renamed from: a */
    public static Object m3695a(C0677a aVar) {
        return new C0678b(aVar);
    }

    /* renamed from: a */
    public static Object m3696a(C0680d dVar) {
        return new C0681e(dVar);
    }

    /* renamed from: a */
    public static void m3697a(Object obj) {
        ((MediaBrowser) obj).connect();
    }

    /* renamed from: a */
    public static void m3698a(Object obj, String str) {
        ((MediaBrowser) obj).unsubscribe(str);
    }

    /* renamed from: a */
    public static void m3699a(Object obj, String str, Object obj2) {
        ((MediaBrowser) obj).subscribe(str, (MediaBrowser.SubscriptionCallback) obj2);
    }

    /* renamed from: b */
    public static void m3700b(Object obj) {
        ((MediaBrowser) obj).disconnect();
    }

    /* renamed from: c */
    public static boolean m3701c(Object obj) {
        return ((MediaBrowser) obj).isConnected();
    }

    /* renamed from: d */
    public static ComponentName m3702d(Object obj) {
        return ((MediaBrowser) obj).getServiceComponent();
    }

    /* renamed from: e */
    public static String m3703e(Object obj) {
        return ((MediaBrowser) obj).getRoot();
    }

    /* renamed from: f */
    public static Bundle m3704f(Object obj) {
        return ((MediaBrowser) obj).getExtras();
    }

    /* renamed from: g */
    public static Object m3705g(Object obj) {
        return ((MediaBrowser) obj).getSessionToken();
    }
}
