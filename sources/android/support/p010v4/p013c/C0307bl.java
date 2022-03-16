package android.support.p010v4.p013c;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.annotation.C0007ae;
import android.support.p010v4.p013c.C0298bh;
import android.support.p010v4.p013c.C0337bv;
import android.util.Log;
import android.util.SparseArray;
import android.widget.RemoteViews;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@C0007ae(mo1a = 16)
@TargetApi(16)
/* renamed from: android.support.v4.c.bl */
class C0307bl {

    /* renamed from: a */
    public static final String f1713a = "NotificationCompat";

    /* renamed from: b */
    static final String f1714b = "android.support.localOnly";

    /* renamed from: c */
    static final String f1715c = "android.support.actionExtras";

    /* renamed from: d */
    static final String f1716d = "android.support.remoteInputs";

    /* renamed from: e */
    static final String f1717e = "android.support.groupKey";

    /* renamed from: f */
    static final String f1718f = "android.support.isGroupSummary";

    /* renamed from: g */
    static final String f1719g = "android.support.sortKey";

    /* renamed from: h */
    static final String f1720h = "android.support.useSideChannel";

    /* renamed from: i */
    static final String f1721i = "android.support.allowGeneratedReplies";

    /* renamed from: j */
    private static final String f1722j = "icon";

    /* renamed from: k */
    private static final String f1723k = "title";

    /* renamed from: l */
    private static final String f1724l = "actionIntent";

    /* renamed from: m */
    private static final String f1725m = "extras";

    /* renamed from: n */
    private static final String f1726n = "remoteInputs";

    /* renamed from: o */
    private static final String f1727o = "allowGeneratedReplies";

    /* renamed from: p */
    private static final Object f1728p = new Object();

    /* renamed from: q */
    private static Field f1729q;

    /* renamed from: r */
    private static boolean f1730r;

    /* renamed from: s */
    private static final Object f1731s = new Object();

    /* renamed from: t */
    private static Class<?> f1732t;

    /* renamed from: u */
    private static Field f1733u;

    /* renamed from: v */
    private static Field f1734v;

    /* renamed from: w */
    private static Field f1735w;

    /* renamed from: x */
    private static Field f1736x;

    /* renamed from: y */
    private static boolean f1737y;

    /* renamed from: android.support.v4.c.bl$a */
    public static class C0308a implements C0259ba, C0260bb {

        /* renamed from: a */
        private Notification.Builder f1738a;

        /* renamed from: b */
        private final Bundle f1739b;

        /* renamed from: c */
        private List<Bundle> f1740c = new ArrayList();

        /* renamed from: d */
        private RemoteViews f1741d;

        /* renamed from: e */
        private RemoteViews f1742e;

        public C0308a(Context context, Notification notification, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, RemoteViews remoteViews, int i, PendingIntent pendingIntent, PendingIntent pendingIntent2, Bitmap bitmap, int i2, int i3, boolean z, boolean z2, int i4, CharSequence charSequence4, boolean z3, Bundle bundle, String str, boolean z4, String str2, RemoteViews remoteViews2, RemoteViews remoteViews3) {
            this.f1738a = new Notification.Builder(context).setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, remoteViews).setSound(notification.sound, notification.audioStreamType).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(charSequence).setContentText(charSequence2).setSubText(charSequence4).setContentInfo(charSequence3).setContentIntent(pendingIntent).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(pendingIntent2, (notification.flags & 128) != 0).setLargeIcon(bitmap).setNumber(i).setUsesChronometer(z2).setPriority(i4).setProgress(i2, i3, z);
            this.f1739b = new Bundle();
            if (bundle != null) {
                this.f1739b.putAll(bundle);
            }
            if (z3) {
                this.f1739b.putBoolean("android.support.localOnly", true);
            }
            if (str != null) {
                this.f1739b.putString("android.support.groupKey", str);
                if (z4) {
                    this.f1739b.putBoolean("android.support.isGroupSummary", true);
                } else {
                    this.f1739b.putBoolean("android.support.useSideChannel", true);
                }
            }
            if (str2 != null) {
                this.f1739b.putString("android.support.sortKey", str2);
            }
            this.f1741d = remoteViews2;
            this.f1742e = remoteViews3;
        }

        /* renamed from: a */
        public Notification.Builder mo1326a() {
            return this.f1738a;
        }

        /* renamed from: a */
        public void mo1325a(C0298bh.C0299a aVar) {
            this.f1740c.add(C0307bl.m1888a(this.f1738a, aVar));
        }

        /* renamed from: b */
        public Notification mo1327b() {
            Notification build = this.f1738a.build();
            Bundle a = C0307bl.m1889a(build);
            Bundle bundle = new Bundle(this.f1739b);
            for (String str : this.f1739b.keySet()) {
                if (a.containsKey(str)) {
                    bundle.remove(str);
                }
            }
            a.putAll(bundle);
            SparseArray<Bundle> a2 = C0307bl.m1894a(this.f1740c);
            if (a2 != null) {
                C0307bl.m1889a(build).putSparseParcelableArray("android.support.actionExtras", a2);
            }
            if (this.f1741d != null) {
                build.contentView = this.f1741d;
            }
            if (this.f1742e != null) {
                build.bigContentView = this.f1742e;
            }
            return build;
        }
    }

    C0307bl() {
    }

    /* renamed from: a */
    public static Bundle m1888a(Notification.Builder builder, C0298bh.C0299a aVar) {
        builder.addAction(aVar.mo1328a(), aVar.mo1329b(), aVar.mo1330c());
        Bundle bundle = new Bundle(aVar.mo1331d());
        if (aVar.mo1334g() != null) {
            bundle.putParcelableArray("android.support.remoteInputs", C0340bw.m2010a(aVar.mo1334g()));
        }
        bundle.putBoolean(f1721i, aVar.mo1332e());
        return bundle;
    }

    /* renamed from: a */
    public static Bundle m1889a(Notification notification) {
        synchronized (f1728p) {
            if (f1730r) {
                return null;
            }
            try {
                if (f1729q == null) {
                    Field declaredField = Notification.class.getDeclaredField(f1725m);
                    if (!Bundle.class.isAssignableFrom(declaredField.getType())) {
                        Log.e(f1713a, "Notification.extras field is not of type Bundle");
                        f1730r = true;
                        return null;
                    }
                    declaredField.setAccessible(true);
                    f1729q = declaredField;
                }
                Bundle bundle = (Bundle) f1729q.get(notification);
                if (bundle == null) {
                    bundle = new Bundle();
                    f1729q.set(notification, bundle);
                }
                return bundle;
            } catch (IllegalAccessException e) {
                Log.e(f1713a, "Unable to access notification extras", e);
                f1730r = true;
                return null;
            } catch (NoSuchFieldException e2) {
                Log.e(f1713a, "Unable to access notification extras", e2);
                f1730r = true;
                return null;
            }
        }
    }

    /* renamed from: a */
    private static Bundle m1890a(C0298bh.C0299a aVar) {
        Bundle bundle = new Bundle();
        bundle.putInt(f1722j, aVar.mo1328a());
        bundle.putCharSequence(f1723k, aVar.mo1329b());
        bundle.putParcelable(f1724l, aVar.mo1330c());
        Bundle bundle2 = aVar.mo1331d() != null ? new Bundle(aVar.mo1331d()) : new Bundle();
        bundle2.putBoolean(f1721i, aVar.mo1332e());
        bundle.putBundle(f1725m, bundle2);
        bundle.putParcelableArray(f1726n, C0340bw.m2010a(aVar.mo1334g()));
        return bundle;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0012, code lost:
        r0 = r0.getSparseParcelableArray("android.support.actionExtras");
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.support.p010v4.p013c.C0298bh.C0299a m1891a(android.app.Notification r8, int r9, android.support.p010v4.p013c.C0298bh.C0299a.C0300a r10, android.support.p010v4.p013c.C0337bv.C0338a.C0339a r11) {
        /*
            r6 = 0
            java.lang.Object r7 = f1731s
            monitor-enter(r7)
            java.lang.Object[] r0 = m1906g(r8)     // Catch:{ IllegalAccessException -> 0x003f }
            if (r0 == 0) goto L_0x004a
            r1 = r0[r9]     // Catch:{ IllegalAccessException -> 0x003f }
            android.os.Bundle r0 = m1889a((android.app.Notification) r8)     // Catch:{ IllegalAccessException -> 0x003f }
            if (r0 == 0) goto L_0x0050
            java.lang.String r2 = "android.support.actionExtras"
            android.util.SparseArray r0 = r0.getSparseParcelableArray(r2)     // Catch:{ IllegalAccessException -> 0x003f }
            if (r0 == 0) goto L_0x0050
            java.lang.Object r0 = r0.get(r9)     // Catch:{ IllegalAccessException -> 0x003f }
            android.os.Bundle r0 = (android.os.Bundle) r0     // Catch:{ IllegalAccessException -> 0x003f }
            r5 = r0
        L_0x0021:
            java.lang.reflect.Field r0 = f1734v     // Catch:{ IllegalAccessException -> 0x003f }
            int r2 = r0.getInt(r1)     // Catch:{ IllegalAccessException -> 0x003f }
            java.lang.reflect.Field r0 = f1735w     // Catch:{ IllegalAccessException -> 0x003f }
            java.lang.Object r3 = r0.get(r1)     // Catch:{ IllegalAccessException -> 0x003f }
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch:{ IllegalAccessException -> 0x003f }
            java.lang.reflect.Field r0 = f1736x     // Catch:{ IllegalAccessException -> 0x003f }
            java.lang.Object r4 = r0.get(r1)     // Catch:{ IllegalAccessException -> 0x003f }
            android.app.PendingIntent r4 = (android.app.PendingIntent) r4     // Catch:{ IllegalAccessException -> 0x003f }
            r0 = r10
            r1 = r11
            android.support.v4.c.bh$a r0 = m1893a(r0, r1, r2, r3, r4, r5)     // Catch:{ IllegalAccessException -> 0x003f }
            monitor-exit(r7)     // Catch:{ all -> 0x004d }
        L_0x003e:
            return r0
        L_0x003f:
            r0 = move-exception
            java.lang.String r1 = "NotificationCompat"
            java.lang.String r2 = "Unable to access notification actions"
            android.util.Log.e(r1, r2, r0)     // Catch:{ all -> 0x004d }
            r0 = 1
            f1737y = r0     // Catch:{ all -> 0x004d }
        L_0x004a:
            monitor-exit(r7)     // Catch:{ all -> 0x004d }
            r0 = r6
            goto L_0x003e
        L_0x004d:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x004d }
            throw r0
        L_0x0050:
            r5 = r6
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p010v4.p013c.C0307bl.m1891a(android.app.Notification, int, android.support.v4.c.bh$a$a, android.support.v4.c.bv$a$a):android.support.v4.c.bh$a");
    }

    /* renamed from: a */
    private static C0298bh.C0299a m1892a(Bundle bundle, C0298bh.C0299a.C0300a aVar, C0337bv.C0338a.C0339a aVar2) {
        boolean z = false;
        Bundle bundle2 = bundle.getBundle(f1725m);
        if (bundle2 != null) {
            z = bundle2.getBoolean(f1721i, false);
        }
        return aVar.mo1335a(bundle.getInt(f1722j), bundle.getCharSequence(f1723k), (PendingIntent) bundle.getParcelable(f1724l), bundle.getBundle(f1725m), C0340bw.m2011a(C0184ab.m881a(bundle, f1726n), aVar2), z);
    }

    /* renamed from: a */
    public static C0298bh.C0299a m1893a(C0298bh.C0299a.C0300a aVar, C0337bv.C0338a.C0339a aVar2, int i, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle) {
        C0337bv.C0338a[] aVarArr = null;
        boolean z = false;
        if (bundle != null) {
            aVarArr = C0340bw.m2011a(C0184ab.m881a(bundle, "android.support.remoteInputs"), aVar2);
            z = bundle.getBoolean(f1721i);
        }
        return aVar.mo1335a(i, charSequence, pendingIntent, bundle, aVarArr, z);
    }

    /* renamed from: a */
    public static SparseArray<Bundle> m1894a(List<Bundle> list) {
        SparseArray<Bundle> sparseArray = null;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Bundle bundle = list.get(i);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                sparseArray.put(i, bundle);
            }
        }
        return sparseArray;
    }

    /* renamed from: a */
    public static ArrayList<Parcelable> m1895a(C0298bh.C0299a[] aVarArr) {
        if (aVarArr == null) {
            return null;
        }
        ArrayList<Parcelable> arrayList = new ArrayList<>(aVarArr.length);
        for (C0298bh.C0299a a : aVarArr) {
            arrayList.add(m1890a(a));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static void m1896a(C0260bb bbVar, CharSequence charSequence, boolean z, CharSequence charSequence2, Bitmap bitmap, Bitmap bitmap2, boolean z2) {
        Notification.BigPictureStyle bigPicture = new Notification.BigPictureStyle(bbVar.mo1326a()).setBigContentTitle(charSequence).bigPicture(bitmap);
        if (z2) {
            bigPicture.bigLargeIcon(bitmap2);
        }
        if (z) {
            bigPicture.setSummaryText(charSequence2);
        }
    }

    /* renamed from: a */
    public static void m1897a(C0260bb bbVar, CharSequence charSequence, boolean z, CharSequence charSequence2, CharSequence charSequence3) {
        Notification.BigTextStyle bigText = new Notification.BigTextStyle(bbVar.mo1326a()).setBigContentTitle(charSequence).bigText(charSequence3);
        if (z) {
            bigText.setSummaryText(charSequence2);
        }
    }

    /* renamed from: a */
    public static void m1898a(C0260bb bbVar, CharSequence charSequence, boolean z, CharSequence charSequence2, ArrayList<CharSequence> arrayList) {
        Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(bbVar.mo1326a()).setBigContentTitle(charSequence);
        if (z) {
            bigContentTitle.setSummaryText(charSequence2);
        }
        Iterator<CharSequence> it = arrayList.iterator();
        while (it.hasNext()) {
            bigContentTitle.addLine(it.next());
        }
    }

    /* renamed from: a */
    private static boolean m1899a() {
        boolean z = true;
        if (f1737y) {
            return false;
        }
        try {
            if (f1733u == null) {
                f1732t = Class.forName("android.app.Notification$Action");
                f1734v = f1732t.getDeclaredField(f1722j);
                f1735w = f1732t.getDeclaredField(f1723k);
                f1736x = f1732t.getDeclaredField(f1724l);
                f1733u = Notification.class.getDeclaredField("actions");
                f1733u.setAccessible(true);
            }
        } catch (ClassNotFoundException e) {
            Log.e(f1713a, "Unable to access notification actions", e);
            f1737y = true;
        } catch (NoSuchFieldException e2) {
            Log.e(f1713a, "Unable to access notification actions", e2);
            f1737y = true;
        }
        if (f1737y) {
            z = false;
        }
        return z;
    }

    /* renamed from: a */
    public static C0298bh.C0299a[] m1900a(ArrayList<Parcelable> arrayList, C0298bh.C0299a.C0300a aVar, C0337bv.C0338a.C0339a aVar2) {
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
            b[i2] = m1892a((Bundle) arrayList.get(i2), aVar, aVar2);
            i = i2 + 1;
        }
    }

    /* renamed from: b */
    public static int m1901b(Notification notification) {
        int length;
        synchronized (f1731s) {
            Object[] g = m1906g(notification);
            length = g != null ? g.length : 0;
        }
        return length;
    }

    /* renamed from: c */
    public static boolean m1902c(Notification notification) {
        return m1889a(notification).getBoolean("android.support.localOnly");
    }

    /* renamed from: d */
    public static String m1903d(Notification notification) {
        return m1889a(notification).getString("android.support.groupKey");
    }

    /* renamed from: e */
    public static boolean m1904e(Notification notification) {
        return m1889a(notification).getBoolean("android.support.isGroupSummary");
    }

    /* renamed from: f */
    public static String m1905f(Notification notification) {
        return m1889a(notification).getString("android.support.sortKey");
    }

    /* renamed from: g */
    private static Object[] m1906g(Notification notification) {
        synchronized (f1731s) {
            if (!m1899a()) {
                return null;
            }
            try {
                Object[] objArr = (Object[]) f1733u.get(notification);
                return objArr;
            } catch (IllegalAccessException e) {
                Log.e(f1713a, "Unable to access notification actions", e);
                f1737y = true;
                return null;
            }
        }
    }
}
