package android.support.p010v4.p025i;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.media.browse.MediaBrowser;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import android.support.annotation.C0007ae;
import java.util.ArrayList;
import java.util.List;

@C0007ae(mo1a = 21)
@TargetApi(21)
/* renamed from: android.support.v4.i.h */
class C0720h {

    /* renamed from: android.support.v4.i.h$a */
    static class C0721a {

        /* renamed from: a */
        final String f2712a;

        /* renamed from: b */
        final Bundle f2713b;

        C0721a(String str, Bundle bundle) {
            this.f2712a = str;
            this.f2713b = bundle;
        }
    }

    /* renamed from: android.support.v4.i.h$b */
    static class C0722b extends MediaBrowserService {

        /* renamed from: a */
        final C0724d f2714a;

        C0722b(Context context, C0724d dVar) {
            attachBaseContext(context);
            this.f2714a = dVar;
        }

        public MediaBrowserService.BrowserRoot onGetRoot(String str, int i, Bundle bundle) {
            C0721a a = this.f2714a.mo2462a(str, i, bundle);
            if (a == null) {
                return null;
            }
            return new MediaBrowserService.BrowserRoot(a.f2712a, a.f2713b);
        }

        public void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result) {
            this.f2714a.mo2463a(str, new C0723c(result));
        }
    }

    /* renamed from: android.support.v4.i.h$c */
    static class C0723c<T> {

        /* renamed from: a */
        MediaBrowserService.Result f2715a;

        C0723c(MediaBrowserService.Result result) {
            this.f2715a = result;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public List<MediaBrowser.MediaItem> mo2501a(List<Parcel> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Parcel next : list) {
                next.setDataPosition(0);
                arrayList.add(MediaBrowser.MediaItem.CREATOR.createFromParcel(next));
                next.recycle();
            }
            return arrayList;
        }

        /* renamed from: a */
        public void mo2502a() {
            this.f2715a.detach();
        }

        /* renamed from: a */
        public void mo2503a(T t) {
            if (t instanceof List) {
                this.f2715a.sendResult(mo2501a((List<Parcel>) (List) t));
            } else if (t instanceof Parcel) {
                Parcel parcel = (Parcel) t;
                parcel.setDataPosition(0);
                this.f2715a.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
                parcel.recycle();
            } else {
                this.f2715a.sendResult((Object) null);
            }
        }
    }

    /* renamed from: android.support.v4.i.h$d */
    public interface C0724d {
        /* renamed from: a */
        C0721a mo2462a(String str, int i, Bundle bundle);

        /* renamed from: a */
        void mo2463a(String str, C0723c<List<Parcel>> cVar);
    }

    C0720h() {
    }

    /* renamed from: a */
    public static IBinder m3804a(Object obj, Intent intent) {
        return ((MediaBrowserService) obj).onBind(intent);
    }

    /* renamed from: a */
    public static Object m3805a(Context context, C0724d dVar) {
        return new C0722b(context, dVar);
    }

    /* renamed from: a */
    public static void m3806a(Object obj) {
        ((MediaBrowserService) obj).onCreate();
    }

    /* renamed from: a */
    public static void m3807a(Object obj, Object obj2) {
        ((MediaBrowserService) obj).setSessionToken((MediaSession.Token) obj2);
    }

    /* renamed from: a */
    public static void m3808a(Object obj, String str) {
        ((MediaBrowserService) obj).notifyChildrenChanged(str);
    }
}
