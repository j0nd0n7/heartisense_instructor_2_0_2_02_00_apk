package android.support.p010v4.p013c;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.annotation.C0007ae;
import android.support.p010v4.p013c.C0298bh;
import android.support.p010v4.p013c.C0337bv;
import android.widget.RemoteViews;
import java.util.ArrayList;

@C0007ae(mo1a = 20)
@TargetApi(20)
/* renamed from: android.support.v4.c.bd */
class C0291bd {

    /* renamed from: android.support.v4.c.bd$a */
    public static class C0292a implements C0259ba, C0260bb {

        /* renamed from: a */
        private Notification.Builder f1658a;

        /* renamed from: b */
        private Bundle f1659b;

        /* renamed from: c */
        private RemoteViews f1660c;

        /* renamed from: d */
        private RemoteViews f1661d;

        public C0292a(Context context, Notification notification, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, RemoteViews remoteViews, int i, PendingIntent pendingIntent, PendingIntent pendingIntent2, Bitmap bitmap, int i2, int i3, boolean z, boolean z2, boolean z3, int i4, CharSequence charSequence4, boolean z4, ArrayList<String> arrayList, Bundle bundle, String str, boolean z5, String str2, RemoteViews remoteViews2, RemoteViews remoteViews3) {
            this.f1658a = new Notification.Builder(context).setWhen(notification.when).setShowWhen(z2).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, remoteViews).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(charSequence).setContentText(charSequence2).setSubText(charSequence4).setContentInfo(charSequence3).setContentIntent(pendingIntent).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(pendingIntent2, (notification.flags & 128) != 0).setLargeIcon(bitmap).setNumber(i).setUsesChronometer(z3).setPriority(i4).setProgress(i2, i3, z).setLocalOnly(z4).setGroup(str).setGroupSummary(z5).setSortKey(str2);
            this.f1659b = new Bundle();
            if (bundle != null) {
                this.f1659b.putAll(bundle);
            }
            if (arrayList != null && !arrayList.isEmpty()) {
                this.f1659b.putStringArray(C0261bc.f1453N, (String[]) arrayList.toArray(new String[arrayList.size()]));
            }
            this.f1660c = remoteViews2;
            this.f1661d = remoteViews3;
        }

        /* renamed from: a */
        public Notification.Builder mo1326a() {
            return this.f1658a;
        }

        /* renamed from: a */
        public void mo1325a(C0298bh.C0299a aVar) {
            C0291bd.m1847a(this.f1658a, aVar);
        }

        /* renamed from: b */
        public Notification mo1327b() {
            this.f1658a.setExtras(this.f1659b);
            Notification build = this.f1658a.build();
            if (this.f1660c != null) {
                build.contentView = this.f1660c;
            }
            if (this.f1661d != null) {
                build.bigContentView = this.f1661d;
            }
            return build;
        }
    }

    C0291bd() {
    }

    /* renamed from: a */
    private static Notification.Action m1843a(C0298bh.C0299a aVar) {
        Notification.Action.Builder builder = new Notification.Action.Builder(aVar.mo1328a(), aVar.mo1329b(), aVar.mo1330c());
        Bundle bundle = aVar.mo1331d() != null ? new Bundle(aVar.mo1331d()) : new Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.mo1332e());
        builder.addExtras(bundle);
        C0337bv.C0338a[] g = aVar.mo1334g();
        if (g != null) {
            for (RemoteInput addRemoteInput : C0336bu.m1997a(g)) {
                builder.addRemoteInput(addRemoteInput);
            }
        }
        return builder.build();
    }

    /* renamed from: a */
    private static C0298bh.C0299a m1844a(Notification.Action action, C0298bh.C0299a.C0300a aVar, C0337bv.C0338a.C0339a aVar2) {
        return aVar.mo1335a(action.icon, action.title, action.actionIntent, action.getExtras(), C0336bu.m1998a(action.getRemoteInputs(), aVar2), action.getExtras().getBoolean("android.support.allowGeneratedReplies"));
    }

    /* renamed from: a */
    public static C0298bh.C0299a m1845a(Notification notification, int i, C0298bh.C0299a.C0300a aVar, C0337bv.C0338a.C0339a aVar2) {
        return m1844a(notification.actions[i], aVar, aVar2);
    }

    /* renamed from: a */
    public static ArrayList<Parcelable> m1846a(C0298bh.C0299a[] aVarArr) {
        if (aVarArr == null) {
            return null;
        }
        ArrayList<Parcelable> arrayList = new ArrayList<>(aVarArr.length);
        for (C0298bh.C0299a a : aVarArr) {
            arrayList.add(m1843a(a));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static void m1847a(Notification.Builder builder, C0298bh.C0299a aVar) {
        Notification.Action.Builder builder2 = new Notification.Action.Builder(aVar.mo1328a(), aVar.mo1329b(), aVar.mo1330c());
        if (aVar.mo1334g() != null) {
            for (RemoteInput addRemoteInput : C0336bu.m1997a(aVar.mo1334g())) {
                builder2.addRemoteInput(addRemoteInput);
            }
        }
        Bundle bundle = aVar.mo1331d() != null ? new Bundle(aVar.mo1331d()) : new Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.mo1332e());
        builder2.addExtras(bundle);
        builder.addAction(builder2.build());
    }

    /* renamed from: a */
    public static boolean m1848a(Notification notification) {
        return (notification.flags & 256) != 0;
    }

    /* renamed from: a */
    public static C0298bh.C0299a[] m1849a(ArrayList<Parcelable> arrayList, C0298bh.C0299a.C0300a aVar, C0337bv.C0338a.C0339a aVar2) {
        if (arrayList == null) {
            return null;
        }
        C0298bh.C0299a[] b = aVar.mo1337b(arrayList.size());
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= b.length) {
                return b;
            }
            b[i2] = m1844a((Notification.Action) arrayList.get(i2), aVar, aVar2);
            i = i2 + 1;
        }
    }

    /* renamed from: b */
    public static String m1850b(Notification notification) {
        return notification.getGroup();
    }

    /* renamed from: c */
    public static boolean m1851c(Notification notification) {
        return (notification.flags & 512) != 0;
    }

    /* renamed from: d */
    public static String m1852d(Notification notification) {
        return notification.getSortKey();
    }
}
