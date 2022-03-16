package android.support.p010v4.p013c;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.support.p010v4.p013c.C0241at;
import android.support.p010v4.p028k.C0798c;
import android.util.Log;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: android.support.v4.c.bo */
public final class C0313bo {

    /* renamed from: a */
    public static final String f1749a = "android.support.useSideChannel";

    /* renamed from: b */
    public static final String f1750b = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL";

    /* renamed from: c */
    static final int f1751c = 19;

    /* renamed from: d */
    static final int f1752d = f1769w.mo1539a();

    /* renamed from: e */
    public static final int f1753e = -1000;

    /* renamed from: f */
    public static final int f1754f = 0;

    /* renamed from: g */
    public static final int f1755g = 1;

    /* renamed from: h */
    public static final int f1756h = 2;

    /* renamed from: i */
    public static final int f1757i = 3;

    /* renamed from: j */
    public static final int f1758j = 4;

    /* renamed from: k */
    public static final int f1759k = 5;

    /* renamed from: l */
    private static final String f1760l = "NotifManCompat";

    /* renamed from: m */
    private static final int f1761m = 1000;

    /* renamed from: n */
    private static final int f1762n = 6;

    /* renamed from: o */
    private static final String f1763o = "enabled_notification_listeners";

    /* renamed from: p */
    private static final Object f1764p = new Object();

    /* renamed from: q */
    private static String f1765q;

    /* renamed from: r */
    private static Set<String> f1766r = new HashSet();

    /* renamed from: u */
    private static final Object f1767u = new Object();

    /* renamed from: v */
    private static C0322i f1768v;

    /* renamed from: w */
    private static final C0315b f1769w;

    /* renamed from: s */
    private final Context f1770s;

    /* renamed from: t */
    private final NotificationManager f1771t = ((NotificationManager) this.f1770s.getSystemService("notification"));

    /* renamed from: android.support.v4.c.bo$a */
    private static class C0314a implements C0324j {

        /* renamed from: a */
        final String f1772a;

        /* renamed from: b */
        final int f1773b;

        /* renamed from: c */
        final String f1774c;

        /* renamed from: d */
        final boolean f1775d;

        public C0314a(String str) {
            this.f1772a = str;
            this.f1773b = 0;
            this.f1774c = null;
            this.f1775d = true;
        }

        public C0314a(String str, int i, String str2) {
            this.f1772a = str;
            this.f1773b = i;
            this.f1774c = str2;
            this.f1775d = false;
        }

        /* renamed from: a */
        public void mo1537a(C0241at atVar) {
            if (this.f1775d) {
                atVar.mo1270a(this.f1772a);
            } else {
                atVar.mo1271a(this.f1772a, this.f1773b, this.f1774c);
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("CancelTask[");
            sb.append("packageName:").append(this.f1772a);
            sb.append(", id:").append(this.f1773b);
            sb.append(", tag:").append(this.f1774c);
            sb.append(", all:").append(this.f1775d);
            sb.append("]");
            return sb.toString();
        }
    }

    /* renamed from: android.support.v4.c.bo$b */
    interface C0315b {
        /* renamed from: a */
        int mo1539a();

        /* renamed from: a */
        int mo1540a(NotificationManager notificationManager);

        /* renamed from: a */
        void mo1541a(NotificationManager notificationManager, String str, int i);

        /* renamed from: a */
        void mo1542a(NotificationManager notificationManager, String str, int i, Notification notification);

        /* renamed from: a */
        boolean mo1543a(Context context, NotificationManager notificationManager);
    }

    /* renamed from: android.support.v4.c.bo$c */
    static class C0316c extends C0319f {
        C0316c() {
        }

        /* renamed from: a */
        public int mo1540a(NotificationManager notificationManager) {
            return C0325bp.m1966b(notificationManager);
        }

        /* renamed from: a */
        public boolean mo1543a(Context context, NotificationManager notificationManager) {
            return C0325bp.m1965a(notificationManager);
        }
    }

    /* renamed from: android.support.v4.c.bo$d */
    static class C0317d implements C0315b {
        C0317d() {
        }

        /* renamed from: a */
        public int mo1539a() {
            return 1;
        }

        /* renamed from: a */
        public int mo1540a(NotificationManager notificationManager) {
            return C0313bo.f1753e;
        }

        /* renamed from: a */
        public void mo1541a(NotificationManager notificationManager, String str, int i) {
            notificationManager.cancel(str, i);
        }

        /* renamed from: a */
        public void mo1542a(NotificationManager notificationManager, String str, int i, Notification notification) {
            notificationManager.notify(str, i, notification);
        }

        /* renamed from: a */
        public boolean mo1543a(Context context, NotificationManager notificationManager) {
            return true;
        }
    }

    /* renamed from: android.support.v4.c.bo$e */
    static class C0318e extends C0317d {
        C0318e() {
        }

        /* renamed from: a */
        public int mo1539a() {
            return 33;
        }
    }

    /* renamed from: android.support.v4.c.bo$f */
    static class C0319f extends C0318e {
        C0319f() {
        }

        /* renamed from: a */
        public boolean mo1543a(Context context, NotificationManager notificationManager) {
            return C0327br.m1967a(context);
        }
    }

    /* renamed from: android.support.v4.c.bo$g */
    private static class C0320g implements C0324j {

        /* renamed from: a */
        final String f1776a;

        /* renamed from: b */
        final int f1777b;

        /* renamed from: c */
        final String f1778c;

        /* renamed from: d */
        final Notification f1779d;

        public C0320g(String str, int i, String str2, Notification notification) {
            this.f1776a = str;
            this.f1777b = i;
            this.f1778c = str2;
            this.f1779d = notification;
        }

        /* renamed from: a */
        public void mo1537a(C0241at atVar) {
            atVar.mo1272a(this.f1776a, this.f1777b, this.f1778c, this.f1779d);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("NotifyTask[");
            sb.append("packageName:").append(this.f1776a);
            sb.append(", id:").append(this.f1777b);
            sb.append(", tag:").append(this.f1778c);
            sb.append("]");
            return sb.toString();
        }
    }

    /* renamed from: android.support.v4.c.bo$h */
    private static class C0321h {

        /* renamed from: a */
        final ComponentName f1780a;

        /* renamed from: b */
        final IBinder f1781b;

        public C0321h(ComponentName componentName, IBinder iBinder) {
            this.f1780a = componentName;
            this.f1781b = iBinder;
        }
    }

    /* renamed from: android.support.v4.c.bo$i */
    private static class C0322i implements ServiceConnection, Handler.Callback {

        /* renamed from: a */
        private static final int f1782a = 0;

        /* renamed from: b */
        private static final int f1783b = 1;

        /* renamed from: c */
        private static final int f1784c = 2;

        /* renamed from: d */
        private static final int f1785d = 3;

        /* renamed from: e */
        private static final String f1786e = "binder";

        /* renamed from: f */
        private final Context f1787f;

        /* renamed from: g */
        private final HandlerThread f1788g;

        /* renamed from: h */
        private final Handler f1789h;

        /* renamed from: i */
        private final Map<ComponentName, C0323a> f1790i = new HashMap();

        /* renamed from: j */
        private Set<String> f1791j = new HashSet();

        /* renamed from: android.support.v4.c.bo$i$a */
        private static class C0323a {

            /* renamed from: a */
            public final ComponentName f1792a;

            /* renamed from: b */
            public boolean f1793b = false;

            /* renamed from: c */
            public C0241at f1794c;

            /* renamed from: d */
            public LinkedList<C0324j> f1795d = new LinkedList<>();

            /* renamed from: e */
            public int f1796e = 0;

            public C0323a(ComponentName componentName) {
                this.f1792a = componentName;
            }
        }

        public C0322i(Context context) {
            this.f1787f = context;
            this.f1788g = new HandlerThread("NotificationManagerCompat");
            this.f1788g.start();
            this.f1789h = new Handler(this.f1788g.getLooper(), this);
        }

        /* renamed from: a */
        private void m1954a() {
            Set<String> b = C0313bo.m1930b(this.f1787f);
            if (!b.equals(this.f1791j)) {
                this.f1791j = b;
                List<ResolveInfo> queryIntentServices = this.f1787f.getPackageManager().queryIntentServices(new Intent().setAction(C0313bo.f1750b), 4);
                HashSet<ComponentName> hashSet = new HashSet<>();
                for (ResolveInfo next : queryIntentServices) {
                    if (b.contains(next.serviceInfo.packageName)) {
                        ComponentName componentName = new ComponentName(next.serviceInfo.packageName, next.serviceInfo.name);
                        if (next.serviceInfo.permission != null) {
                            Log.w(C0313bo.f1760l, "Permission present on component " + componentName + ", not adding listener record.");
                        } else {
                            hashSet.add(componentName);
                        }
                    }
                }
                for (ComponentName componentName2 : hashSet) {
                    if (!this.f1790i.containsKey(componentName2)) {
                        if (Log.isLoggable(C0313bo.f1760l, 3)) {
                            Log.d(C0313bo.f1760l, "Adding listener record for " + componentName2);
                        }
                        this.f1790i.put(componentName2, new C0323a(componentName2));
                    }
                }
                Iterator<Map.Entry<ComponentName, C0323a>> it = this.f1790i.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry next2 = it.next();
                    if (!hashSet.contains(next2.getKey())) {
                        if (Log.isLoggable(C0313bo.f1760l, 3)) {
                            Log.d(C0313bo.f1760l, "Removing listener record for " + next2.getKey());
                        }
                        m1959b((C0323a) next2.getValue());
                        it.remove();
                    }
                }
            }
        }

        /* renamed from: a */
        private void m1955a(ComponentName componentName) {
            C0323a aVar = this.f1790i.get(componentName);
            if (aVar != null) {
                m1959b(aVar);
            }
        }

        /* renamed from: a */
        private void m1956a(ComponentName componentName, IBinder iBinder) {
            C0323a aVar = this.f1790i.get(componentName);
            if (aVar != null) {
                aVar.f1794c = C0241at.C0242a.m1486a(iBinder);
                aVar.f1796e = 0;
                m1962d(aVar);
            }
        }

        /* renamed from: a */
        private boolean m1957a(C0323a aVar) {
            if (aVar.f1793b) {
                return true;
            }
            aVar.f1793b = this.f1787f.bindService(new Intent(C0313bo.f1750b).setComponent(aVar.f1792a), this, C0313bo.f1752d);
            if (aVar.f1793b) {
                aVar.f1796e = 0;
            } else {
                Log.w(C0313bo.f1760l, "Unable to bind to listener " + aVar.f1792a);
                this.f1787f.unbindService(this);
            }
            return aVar.f1793b;
        }

        /* renamed from: b */
        private void m1958b(ComponentName componentName) {
            C0323a aVar = this.f1790i.get(componentName);
            if (aVar != null) {
                m1962d(aVar);
            }
        }

        /* renamed from: b */
        private void m1959b(C0323a aVar) {
            if (aVar.f1793b) {
                this.f1787f.unbindService(this);
                aVar.f1793b = false;
            }
            aVar.f1794c = null;
        }

        /* renamed from: b */
        private void m1960b(C0324j jVar) {
            m1954a();
            for (C0323a next : this.f1790i.values()) {
                next.f1795d.add(jVar);
                m1962d(next);
            }
        }

        /* renamed from: c */
        private void m1961c(C0323a aVar) {
            if (!this.f1789h.hasMessages(3, aVar.f1792a)) {
                aVar.f1796e++;
                if (aVar.f1796e > 6) {
                    Log.w(C0313bo.f1760l, "Giving up on delivering " + aVar.f1795d.size() + " tasks to " + aVar.f1792a + " after " + aVar.f1796e + " retries");
                    aVar.f1795d.clear();
                    return;
                }
                int i = (1 << (aVar.f1796e - 1)) * 1000;
                if (Log.isLoggable(C0313bo.f1760l, 3)) {
                    Log.d(C0313bo.f1760l, "Scheduling retry for " + i + " ms");
                }
                this.f1789h.sendMessageDelayed(this.f1789h.obtainMessage(3, aVar.f1792a), (long) i);
            }
        }

        /* renamed from: d */
        private void m1962d(C0323a aVar) {
            if (Log.isLoggable(C0313bo.f1760l, 3)) {
                Log.d(C0313bo.f1760l, "Processing component " + aVar.f1792a + ", " + aVar.f1795d.size() + " queued tasks");
            }
            if (!aVar.f1795d.isEmpty()) {
                if (!m1957a(aVar) || aVar.f1794c == null) {
                    m1961c(aVar);
                    return;
                }
                while (true) {
                    C0324j peek = aVar.f1795d.peek();
                    if (peek == null) {
                        break;
                    }
                    try {
                        if (Log.isLoggable(C0313bo.f1760l, 3)) {
                            Log.d(C0313bo.f1760l, "Sending task " + peek);
                        }
                        peek.mo1537a(aVar.f1794c);
                        aVar.f1795d.remove();
                    } catch (DeadObjectException e) {
                        if (Log.isLoggable(C0313bo.f1760l, 3)) {
                            Log.d(C0313bo.f1760l, "Remote service has died: " + aVar.f1792a);
                        }
                    } catch (RemoteException e2) {
                        Log.w(C0313bo.f1760l, "RemoteException communicating with " + aVar.f1792a, e2);
                    }
                }
                if (!aVar.f1795d.isEmpty()) {
                    m1961c(aVar);
                }
            }
        }

        /* renamed from: a */
        public void mo1545a(C0324j jVar) {
            this.f1789h.obtainMessage(0, jVar).sendToTarget();
        }

        public boolean handleMessage(Message message) {
            switch (message.what) {
                case 0:
                    m1960b((C0324j) message.obj);
                    return true;
                case 1:
                    C0321h hVar = (C0321h) message.obj;
                    m1956a(hVar.f1780a, hVar.f1781b);
                    return true;
                case 2:
                    m1955a((ComponentName) message.obj);
                    return true;
                case 3:
                    m1958b((ComponentName) message.obj);
                    return true;
                default:
                    return false;
            }
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable(C0313bo.f1760l, 3)) {
                Log.d(C0313bo.f1760l, "Connected to service " + componentName);
            }
            this.f1789h.obtainMessage(1, new C0321h(componentName, iBinder)).sendToTarget();
        }

        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable(C0313bo.f1760l, 3)) {
                Log.d(C0313bo.f1760l, "Disconnected from service " + componentName);
            }
            this.f1789h.obtainMessage(2, componentName).sendToTarget();
        }
    }

    /* renamed from: android.support.v4.c.bo$j */
    private interface C0324j {
        /* renamed from: a */
        void mo1537a(C0241at atVar);
    }

    static {
        if (C0798c.m4072a()) {
            f1769w = new C0316c();
        } else if (Build.VERSION.SDK_INT >= 19) {
            f1769w = new C0319f();
        } else if (Build.VERSION.SDK_INT >= 14) {
            f1769w = new C0318e();
        } else {
            f1769w = new C0317d();
        }
    }

    private C0313bo(Context context) {
        this.f1770s = context;
    }

    /* renamed from: a */
    public static C0313bo m1927a(Context context) {
        return new C0313bo(context);
    }

    /* renamed from: a */
    private void m1928a(C0324j jVar) {
        synchronized (f1767u) {
            if (f1768v == null) {
                f1768v = new C0322i(this.f1770s.getApplicationContext());
            }
            f1768v.mo1545a(jVar);
        }
    }

    /* renamed from: a */
    private static boolean m1929a(Notification notification) {
        Bundle a = C0261bc.m1576a(notification);
        return a != null && a.getBoolean(f1749a);
    }

    /* renamed from: b */
    public static Set<String> m1930b(Context context) {
        Set<String> set;
        String string = Settings.Secure.getString(context.getContentResolver(), f1763o);
        synchronized (f1764p) {
            if (string != null) {
                if (!string.equals(f1765q)) {
                    String[] split = string.split(":");
                    HashSet hashSet = new HashSet(split.length);
                    for (String unflattenFromString : split) {
                        ComponentName unflattenFromString2 = ComponentName.unflattenFromString(unflattenFromString);
                        if (unflattenFromString2 != null) {
                            hashSet.add(unflattenFromString2.getPackageName());
                        }
                    }
                    f1766r = hashSet;
                    f1765q = string;
                }
            }
            set = f1766r;
        }
        return set;
    }

    /* renamed from: a */
    public void mo1530a() {
        this.f1771t.cancelAll();
        if (Build.VERSION.SDK_INT <= 19) {
            m1928a((C0324j) new C0314a(this.f1770s.getPackageName()));
        }
    }

    /* renamed from: a */
    public void mo1531a(int i) {
        mo1533a((String) null, i);
    }

    /* renamed from: a */
    public void mo1532a(int i, Notification notification) {
        mo1534a((String) null, i, notification);
    }

    /* renamed from: a */
    public void mo1533a(String str, int i) {
        f1769w.mo1541a(this.f1771t, str, i);
        if (Build.VERSION.SDK_INT <= 19) {
            m1928a((C0324j) new C0314a(this.f1770s.getPackageName(), i, str));
        }
    }

    /* renamed from: a */
    public void mo1534a(String str, int i, Notification notification) {
        if (m1929a(notification)) {
            m1928a((C0324j) new C0320g(this.f1770s.getPackageName(), i, str, notification));
            f1769w.mo1541a(this.f1771t, str, i);
            return;
        }
        f1769w.mo1542a(this.f1771t, str, i, notification);
    }

    /* renamed from: b */
    public boolean mo1535b() {
        return f1769w.mo1543a(this.f1770s, this.f1771t);
    }

    /* renamed from: c */
    public int mo1536c() {
        return f1769w.mo1540a(this.f1771t);
    }
}
