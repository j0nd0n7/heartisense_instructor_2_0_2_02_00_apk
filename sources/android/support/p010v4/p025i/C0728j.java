package android.support.p010v4.p025i;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import android.support.annotation.C0007ae;
import android.support.p010v4.p025i.C0725i;
import android.util.Log;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

@C0007ae(mo1a = 24)
@TargetApi(24)
/* renamed from: android.support.v4.i.j */
class C0728j {

    /* renamed from: a */
    private static final String f2716a = "MBSCompatApi24";
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static Field f2717b;

    /* renamed from: android.support.v4.i.j$a */
    static class C0729a extends C0725i.C0726a {
        C0729a(Context context, C0731c cVar) {
            super(context, cVar);
        }

        public void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result, Bundle bundle) {
            ((C0731c) this.f2714a).mo2469a(str, new C0730b(result), bundle);
        }
    }

    /* renamed from: android.support.v4.i.j$b */
    static class C0730b {

        /* renamed from: a */
        MediaBrowserService.Result f2718a;

        C0730b(MediaBrowserService.Result result) {
            this.f2718a = result;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public List<MediaBrowser.MediaItem> mo2506a(List<Parcel> list) {
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
        public void mo2507a() {
            this.f2718a.detach();
        }

        /* renamed from: a */
        public void mo2508a(List<Parcel> list, int i) {
            try {
                C0728j.f2717b.setInt(this.f2718a, i);
            } catch (IllegalAccessException e) {
                Log.w(C0728j.f2716a, e);
            }
            this.f2718a.sendResult(mo2506a(list));
        }
    }

    /* renamed from: android.support.v4.i.j$c */
    public interface C0731c extends C0725i.C0727b {
        /* renamed from: a */
        void mo2469a(String str, C0730b bVar, Bundle bundle);
    }

    static {
        try {
            f2717b = MediaBrowserService.Result.class.getDeclaredField("mFlags");
            f2717b.setAccessible(true);
        } catch (NoSuchFieldException e) {
            Log.w(f2716a, e);
        }
    }

    C0728j() {
    }

    /* renamed from: a */
    public static Bundle m3816a(Object obj) {
        return ((MediaBrowserService) obj).getBrowserRootHints();
    }

    /* renamed from: a */
    public static Object m3817a(Context context, C0731c cVar) {
        return new C0729a(context, cVar);
    }

    /* renamed from: a */
    public static void m3819a(Object obj, String str, Bundle bundle) {
        ((MediaBrowserService) obj).notifyChildrenChanged(str, bundle);
    }
}
