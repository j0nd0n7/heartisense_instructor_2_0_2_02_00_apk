package android.support.p010v4.p013c;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.C0007ae;
import android.support.p010v4.p013c.C0298bh;
import android.support.p010v4.p013c.C0337bv;
import android.util.SparseArray;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.List;

@C0007ae(mo1a = 19)
@TargetApi(19)
/* renamed from: android.support.v4.c.bm */
class C0309bm {

    /* renamed from: android.support.v4.c.bm$a */
    public static class C0310a implements C0259ba, C0260bb {

        /* renamed from: a */
        private Notification.Builder f1743a;

        /* renamed from: b */
        private Bundle f1744b;

        /* renamed from: c */
        private List<Bundle> f1745c = new ArrayList();

        /* renamed from: d */
        private RemoteViews f1746d;

        /* renamed from: e */
        private RemoteViews f1747e;

        public C0310a(Context context, Notification notification, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, RemoteViews remoteViews, int i, PendingIntent pendingIntent, PendingIntent pendingIntent2, Bitmap bitmap, int i2, int i3, boolean z, boolean z2, boolean z3, int i4, CharSequence charSequence4, boolean z4, ArrayList<String> arrayList, Bundle bundle, String str, boolean z5, String str2, RemoteViews remoteViews2, RemoteViews remoteViews3) {
            this.f1743a = new Notification.Builder(context).setWhen(notification.when).setShowWhen(z2).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, remoteViews).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(charSequence).setContentText(charSequence2).setSubText(charSequence4).setContentInfo(charSequence3).setContentIntent(pendingIntent).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(pendingIntent2, (notification.flags & 128) != 0).setLargeIcon(bitmap).setNumber(i).setUsesChronometer(z3).setPriority(i4).setProgress(i2, i3, z);
            this.f1744b = new Bundle();
            if (bundle != null) {
                this.f1744b.putAll(bundle);
            }
            if (arrayList != null && !arrayList.isEmpty()) {
                this.f1744b.putStringArray(C0261bc.f1453N, (String[]) arrayList.toArray(new String[arrayList.size()]));
            }
            if (z4) {
                this.f1744b.putBoolean(C0303bi.f1706a, true);
            }
            if (str != null) {
                this.f1744b.putString(C0303bi.f1707b, str);
                if (z5) {
                    this.f1744b.putBoolean(C0303bi.f1708c, true);
                } else {
                    this.f1744b.putBoolean(C0313bo.f1749a, true);
                }
            }
            if (str2 != null) {
                this.f1744b.putString(C0303bi.f1709d, str2);
            }
            this.f1746d = remoteViews2;
            this.f1747e = remoteViews3;
        }

        /* renamed from: a */
        public Notification.Builder mo1326a() {
            return this.f1743a;
        }

        /* renamed from: a */
        public void mo1325a(C0298bh.C0299a aVar) {
            this.f1745c.add(C0307bl.m1888a(this.f1743a, aVar));
        }

        /* renamed from: b */
        public Notification mo1327b() {
            SparseArray<Bundle> a = C0307bl.m1894a(this.f1745c);
            if (a != null) {
                this.f1744b.putSparseParcelableArray(C0303bi.f1710e, a);
            }
            this.f1743a.setExtras(this.f1744b);
            Notification build = this.f1743a.build();
            if (this.f1746d != null) {
                build.contentView = this.f1746d;
            }
            if (this.f1747e != null) {
                build.bigContentView = this.f1747e;
            }
            return build;
        }
    }

    C0309bm() {
    }

    /* renamed from: a */
    public static Bundle m1910a(Notification notification) {
        return notification.extras;
    }

    /* renamed from: a */
    public static C0298bh.C0299a m1911a(Notification notification, int i, C0298bh.C0299a.C0300a aVar, C0337bv.C0338a.C0339a aVar2) {
        Notification.Action action = notification.actions[i];
        Bundle bundle = null;
        SparseArray sparseParcelableArray = notification.extras.getSparseParcelableArray(C0303bi.f1710e);
        if (sparseParcelableArray != null) {
            bundle = (Bundle) sparseParcelableArray.get(i);
        }
        return C0307bl.m1893a(aVar, aVar2, action.icon, action.title, action.actionIntent, bundle);
    }

    /* renamed from: b */
    public static int m1912b(Notification notification) {
        if (notification.actions != null) {
            return notification.actions.length;
        }
        return 0;
    }

    /* renamed from: c */
    public static boolean m1913c(Notification notification) {
        return notification.extras.getBoolean(C0303bi.f1706a);
    }

    /* renamed from: d */
    public static String m1914d(Notification notification) {
        return notification.extras.getString(C0303bi.f1707b);
    }

    /* renamed from: e */
    public static boolean m1915e(Notification notification) {
        return notification.extras.getBoolean(C0303bi.f1708c);
    }

    /* renamed from: f */
    public static String m1916f(Notification notification) {
        return notification.extras.getString(C0303bi.f1709d);
    }
}
