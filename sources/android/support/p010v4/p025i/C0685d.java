package android.support.p010v4.p025i;

import android.annotation.TargetApi;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.support.annotation.C0007ae;
import android.support.annotation.C0047z;
import android.support.p010v4.p025i.C0676b;
import java.util.List;

@C0007ae(mo1a = 24)
@TargetApi(24)
/* renamed from: android.support.v4.i.d */
class C0685d {

    /* renamed from: android.support.v4.i.d$a */
    interface C0686a extends C0676b.C0680d {
        /* renamed from: a */
        void mo2037a(@C0047z String str, @C0047z Bundle bundle);

        /* renamed from: a */
        void mo2038a(@C0047z String str, List<?> list, @C0047z Bundle bundle);
    }

    /* renamed from: android.support.v4.i.d$b */
    static class C0687b<T extends C0686a> extends C0676b.C0681e<T> {
        public C0687b(T t) {
            super(t);
        }

        public void onChildrenLoaded(@C0047z String str, List<MediaBrowser.MediaItem> list, @C0047z Bundle bundle) {
            ((C0686a) this.f2586a).mo2038a(str, list, bundle);
        }

        public void onError(@C0047z String str, @C0047z Bundle bundle) {
            ((C0686a) this.f2586a).mo2037a(str, bundle);
        }
    }

    C0685d() {
    }

    /* renamed from: a */
    public static Object m3717a(C0686a aVar) {
        return new C0687b(aVar);
    }

    /* renamed from: a */
    public static void m3718a(Object obj, String str, Bundle bundle, Object obj2) {
        ((MediaBrowser) obj).subscribe(str, bundle, (MediaBrowser.SubscriptionCallback) obj2);
    }

    /* renamed from: a */
    public static void m3719a(Object obj, String str, Object obj2) {
        ((MediaBrowser) obj).unsubscribe(str, (MediaBrowser.SubscriptionCallback) obj2);
    }
}
