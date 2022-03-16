package android.support.p010v4.p025i;

import android.annotation.TargetApi;
import android.media.browse.MediaBrowser;
import android.os.Parcel;
import android.support.annotation.C0007ae;
import android.support.annotation.C0047z;

@C0007ae(mo1a = 23)
@TargetApi(23)
/* renamed from: android.support.v4.i.c */
class C0682c {

    /* renamed from: android.support.v4.i.c$a */
    interface C0683a {
        /* renamed from: a */
        void mo1968a(Parcel parcel);

        /* renamed from: a */
        void mo1969a(@C0047z String str);
    }

    /* renamed from: android.support.v4.i.c$b */
    static class C0684b<T extends C0683a> extends MediaBrowser.ItemCallback {

        /* renamed from: a */
        protected final T f2587a;

        public C0684b(T t) {
            this.f2587a = t;
        }

        public void onError(@C0047z String str) {
            this.f2587a.mo1969a(str);
        }

        public void onItemLoaded(MediaBrowser.MediaItem mediaItem) {
            if (mediaItem == null) {
                this.f2587a.mo1968a((Parcel) null);
                return;
            }
            Parcel obtain = Parcel.obtain();
            mediaItem.writeToParcel(obtain, 0);
            this.f2587a.mo1968a(obtain);
        }
    }

    C0682c() {
    }

    /* renamed from: a */
    public static Object m3713a(C0683a aVar) {
        return new C0684b(aVar);
    }

    /* renamed from: a */
    public static void m3714a(Object obj, String str, Object obj2) {
        ((MediaBrowser) obj).getItem(str, (MediaBrowser.ItemCallback) obj2);
    }
}
