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
import java.util.Iterator;

@C0007ae(mo1a = 21)
@TargetApi(21)
/* renamed from: android.support.v4.c.be */
class C0293be {

    /* renamed from: a */
    public static final String f1662a = "call";

    /* renamed from: b */
    public static final String f1663b = "msg";

    /* renamed from: c */
    public static final String f1664c = "email";

    /* renamed from: d */
    public static final String f1665d = "event";

    /* renamed from: e */
    public static final String f1666e = "promo";

    /* renamed from: f */
    public static final String f1667f = "alarm";

    /* renamed from: g */
    public static final String f1668g = "progress";

    /* renamed from: h */
    public static final String f1669h = "social";

    /* renamed from: i */
    public static final String f1670i = "err";

    /* renamed from: j */
    public static final String f1671j = "transport";

    /* renamed from: k */
    public static final String f1672k = "sys";

    /* renamed from: l */
    public static final String f1673l = "service";

    /* renamed from: m */
    public static final String f1674m = "recommendation";

    /* renamed from: n */
    public static final String f1675n = "status";

    /* renamed from: o */
    private static final String f1676o = "author";

    /* renamed from: p */
    private static final String f1677p = "text";

    /* renamed from: q */
    private static final String f1678q = "messages";

    /* renamed from: r */
    private static final String f1679r = "remote_input";

    /* renamed from: s */
    private static final String f1680s = "on_reply";

    /* renamed from: t */
    private static final String f1681t = "on_read";

    /* renamed from: u */
    private static final String f1682u = "participants";

    /* renamed from: v */
    private static final String f1683v = "timestamp";

    /* renamed from: android.support.v4.c.be$a */
    public static class C0294a implements C0259ba, C0260bb {

        /* renamed from: a */
        private Notification.Builder f1684a;

        /* renamed from: b */
        private Bundle f1685b;

        /* renamed from: c */
        private RemoteViews f1686c;

        /* renamed from: d */
        private RemoteViews f1687d;

        /* renamed from: e */
        private RemoteViews f1688e;

        public C0294a(Context context, Notification notification, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, RemoteViews remoteViews, int i, PendingIntent pendingIntent, PendingIntent pendingIntent2, Bitmap bitmap, int i2, int i3, boolean z, boolean z2, boolean z3, int i4, CharSequence charSequence4, boolean z4, String str, ArrayList<String> arrayList, Bundle bundle, int i5, int i6, Notification notification2, String str2, boolean z5, String str3, RemoteViews remoteViews2, RemoteViews remoteViews3, RemoteViews remoteViews4) {
            this.f1684a = new Notification.Builder(context).setWhen(notification.when).setShowWhen(z2).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, remoteViews).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(charSequence).setContentText(charSequence2).setSubText(charSequence4).setContentInfo(charSequence3).setContentIntent(pendingIntent).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(pendingIntent2, (notification.flags & 128) != 0).setLargeIcon(bitmap).setNumber(i).setUsesChronometer(z3).setPriority(i4).setProgress(i2, i3, z).setLocalOnly(z4).setGroup(str2).setGroupSummary(z5).setSortKey(str3).setCategory(str).setColor(i5).setVisibility(i6).setPublicVersion(notification2);
            this.f1685b = new Bundle();
            if (bundle != null) {
                this.f1685b.putAll(bundle);
            }
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                this.f1684a.addPerson(it.next());
            }
            this.f1686c = remoteViews2;
            this.f1687d = remoteViews3;
            this.f1688e = remoteViews4;
        }

        /* renamed from: a */
        public Notification.Builder mo1326a() {
            return this.f1684a;
        }

        /* renamed from: a */
        public void mo1325a(C0298bh.C0299a aVar) {
            C0291bd.m1847a(this.f1684a, aVar);
        }

        /* renamed from: b */
        public Notification mo1327b() {
            this.f1684a.setExtras(this.f1685b);
            Notification build = this.f1684a.build();
            if (this.f1686c != null) {
                build.contentView = this.f1686c;
            }
            if (this.f1687d != null) {
                build.bigContentView = this.f1687d;
            }
            if (this.f1688e != null) {
                build.headsUpContentView = this.f1688e;
            }
            return build;
        }
    }

    C0293be() {
    }

    /* renamed from: a */
    private static RemoteInput m1856a(C0337bv.C0338a aVar) {
        return new RemoteInput.Builder(aVar.mo1553a()).setLabel(aVar.mo1554b()).setChoices(aVar.mo1555c()).setAllowFreeFormInput(aVar.mo1556d()).addExtras(aVar.mo1557e()).build();
    }

    /* renamed from: a */
    static Bundle m1857a(C0298bh.C0301b bVar) {
        String str = null;
        if (bVar == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        if (bVar.mo1436e() != null && bVar.mo1436e().length > 1) {
            str = bVar.mo1436e()[0];
        }
        Parcelable[] parcelableArr = new Parcelable[bVar.mo1432a().length];
        for (int i = 0; i < parcelableArr.length; i++) {
            Bundle bundle2 = new Bundle();
            bundle2.putString(f1677p, bVar.mo1432a()[i]);
            bundle2.putString(f1676o, str);
            parcelableArr[i] = bundle2;
        }
        bundle.putParcelableArray(f1678q, parcelableArr);
        C0337bv.C0338a h = bVar.mo1439h();
        if (h != null) {
            bundle.putParcelable(f1679r, m1856a(h));
        }
        bundle.putParcelable(f1680s, bVar.mo1434c());
        bundle.putParcelable(f1681t, bVar.mo1435d());
        bundle.putStringArray(f1682u, bVar.mo1436e());
        bundle.putLong(f1683v, bVar.mo1438g());
        return bundle;
    }

    /* renamed from: a */
    static C0298bh.C0301b m1858a(Bundle bundle, C0298bh.C0301b.C0302a aVar, C0337bv.C0338a.C0339a aVar2) {
        String[] strArr;
        boolean z = false;
        if (bundle == null) {
            return null;
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray(f1678q);
        if (parcelableArray != null) {
            String[] strArr2 = new String[parcelableArray.length];
            int i = 0;
            while (true) {
                if (i < strArr2.length) {
                    if (parcelableArray[i] instanceof Bundle) {
                        strArr2[i] = ((Bundle) parcelableArray[i]).getString(f1677p);
                        if (strArr2[i] == null) {
                            break;
                        }
                        i++;
                    } else {
                        break;
                    }
                } else {
                    z = true;
                    break;
                }
            }
            if (!z) {
                return null;
            }
            strArr = strArr2;
        } else {
            strArr = null;
        }
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable(f1681t);
        PendingIntent pendingIntent2 = (PendingIntent) bundle.getParcelable(f1680s);
        RemoteInput remoteInput = (RemoteInput) bundle.getParcelable(f1679r);
        String[] stringArray = bundle.getStringArray(f1682u);
        if (stringArray == null || stringArray.length != 1) {
            return null;
        }
        return aVar.mo1441b(strArr, remoteInput != null ? m1859a(remoteInput, aVar2) : null, pendingIntent2, pendingIntent, stringArray, bundle.getLong(f1683v));
    }

    /* renamed from: a */
    private static C0337bv.C0338a m1859a(RemoteInput remoteInput, C0337bv.C0338a.C0339a aVar) {
        return aVar.mo1560b(remoteInput.getResultKey(), remoteInput.getLabel(), remoteInput.getChoices(), remoteInput.getAllowFreeFormInput(), remoteInput.getExtras());
    }

    /* renamed from: a */
    public static String m1860a(Notification notification) {
        return notification.category;
    }
}
