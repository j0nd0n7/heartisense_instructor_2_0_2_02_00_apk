package android.support.p010v4.p025i;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import android.support.annotation.C0007ae;
import android.support.p010v4.p025i.C0720h;

@C0007ae(mo1a = 23)
@TargetApi(23)
/* renamed from: android.support.v4.i.i */
class C0725i {

    /* renamed from: android.support.v4.i.i$a */
    static class C0726a extends C0720h.C0722b {
        C0726a(Context context, C0727b bVar) {
            super(context, bVar);
        }

        public void onLoadItem(String str, MediaBrowserService.Result<MediaBrowser.MediaItem> result) {
            ((C0727b) this.f2714a).mo2467b(str, new C0720h.C0723c(result));
        }
    }

    /* renamed from: android.support.v4.i.i$b */
    public interface C0727b extends C0720h.C0724d {
        /* renamed from: b */
        void mo2467b(String str, C0720h.C0723c<Parcel> cVar);
    }

    C0725i() {
    }

    /* renamed from: a */
    public static Object m3814a(Context context, C0727b bVar) {
        return new C0726a(context, bVar);
    }
}
