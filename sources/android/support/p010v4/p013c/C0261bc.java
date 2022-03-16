package android.support.p010v4.p013c;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.annotation.C0011ag;
import android.support.annotation.C0032k;
import android.support.annotation.C0047z;
import android.support.p010v4.p013c.C0291bd;
import android.support.p010v4.p013c.C0293be;
import android.support.p010v4.p013c.C0296bg;
import android.support.p010v4.p013c.C0298bh;
import android.support.p010v4.p013c.C0305bk;
import android.support.p010v4.p013c.C0307bl;
import android.support.p010v4.p013c.C0309bm;
import android.support.p010v4.p013c.C0337bv;
import android.support.p010v4.p028k.C0798c;
import android.widget.RemoteViews;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: android.support.v4.c.bc */
public class C0261bc {

    /* renamed from: A */
    public static final String f1440A = "android.summaryText";

    /* renamed from: B */
    public static final String f1441B = "android.bigText";

    /* renamed from: C */
    public static final String f1442C = "android.icon";

    /* renamed from: D */
    public static final String f1443D = "android.largeIcon";

    /* renamed from: E */
    public static final String f1444E = "android.largeIcon.big";

    /* renamed from: F */
    public static final String f1445F = "android.progress";

    /* renamed from: G */
    public static final String f1446G = "android.progressMax";

    /* renamed from: H */
    public static final String f1447H = "android.progressIndeterminate";

    /* renamed from: I */
    public static final String f1448I = "android.showChronometer";

    /* renamed from: J */
    public static final String f1449J = "android.showWhen";

    /* renamed from: K */
    public static final String f1450K = "android.picture";

    /* renamed from: L */
    public static final String f1451L = "android.textLines";

    /* renamed from: M */
    public static final String f1452M = "android.template";

    /* renamed from: N */
    public static final String f1453N = "android.people";

    /* renamed from: O */
    public static final String f1454O = "android.backgroundImageUri";

    /* renamed from: P */
    public static final String f1455P = "android.mediaSession";

    /* renamed from: Q */
    public static final String f1456Q = "android.compactActions";

    /* renamed from: R */
    public static final String f1457R = "android.selfDisplayName";

    /* renamed from: S */
    public static final String f1458S = "android.conversationTitle";

    /* renamed from: T */
    public static final String f1459T = "android.messages";
    @C0032k

    /* renamed from: U */
    public static final int f1460U = 0;

    /* renamed from: V */
    public static final int f1461V = 1;

    /* renamed from: W */
    public static final int f1462W = 0;

    /* renamed from: X */
    public static final int f1463X = -1;

    /* renamed from: Y */
    public static final String f1464Y = "call";

    /* renamed from: Z */
    public static final String f1465Z = "msg";

    /* renamed from: a */
    public static final int f1466a = -1;

    /* renamed from: aa */
    public static final String f1467aa = "email";

    /* renamed from: ab */
    public static final String f1468ab = "event";

    /* renamed from: ac */
    public static final String f1469ac = "promo";

    /* renamed from: ad */
    public static final String f1470ad = "alarm";

    /* renamed from: ae */
    public static final String f1471ae = "progress";

    /* renamed from: af */
    public static final String f1472af = "social";

    /* renamed from: ag */
    public static final String f1473ag = "err";

    /* renamed from: ah */
    public static final String f1474ah = "transport";

    /* renamed from: ai */
    public static final String f1475ai = "sys";

    /* renamed from: aj */
    public static final String f1476aj = "service";

    /* renamed from: ak */
    public static final String f1477ak = "reminder";

    /* renamed from: al */
    public static final String f1478al = "recommendation";

    /* renamed from: am */
    public static final String f1479am = "status";

    /* renamed from: an */
    static final C0279j f1480an;

    /* renamed from: b */
    public static final int f1481b = 1;

    /* renamed from: c */
    public static final int f1482c = 2;

    /* renamed from: d */
    public static final int f1483d = 4;

    /* renamed from: e */
    public static final int f1484e = -1;

    /* renamed from: f */
    public static final int f1485f = 1;

    /* renamed from: g */
    public static final int f1486g = 2;

    /* renamed from: h */
    public static final int f1487h = 4;

    /* renamed from: i */
    public static final int f1488i = 8;

    /* renamed from: j */
    public static final int f1489j = 16;

    /* renamed from: k */
    public static final int f1490k = 32;

    /* renamed from: l */
    public static final int f1491l = 64;
    @Deprecated

    /* renamed from: m */
    public static final int f1492m = 128;

    /* renamed from: n */
    public static final int f1493n = 256;

    /* renamed from: o */
    public static final int f1494o = 512;

    /* renamed from: p */
    public static final int f1495p = 0;

    /* renamed from: q */
    public static final int f1496q = -1;

    /* renamed from: r */
    public static final int f1497r = -2;

    /* renamed from: s */
    public static final int f1498s = 1;

    /* renamed from: t */
    public static final int f1499t = 2;

    /* renamed from: u */
    public static final String f1500u = "android.title";

    /* renamed from: v */
    public static final String f1501v = "android.title.big";

    /* renamed from: w */
    public static final String f1502w = "android.text";

    /* renamed from: x */
    public static final String f1503x = "android.subText";

    /* renamed from: y */
    public static final String f1504y = "android.remoteInputHistory";

    /* renamed from: z */
    public static final String f1505z = "android.infoText";

    /* renamed from: android.support.v4.c.bc$a */
    public static class C0262a extends C0298bh.C0299a {
        @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})

        /* renamed from: e */
        public static final C0298bh.C0299a.C0300a f1506e = new C0298bh.C0299a.C0300a() {
            /* renamed from: a */
            public C0298bh.C0299a mo1335a(int i, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, C0337bv.C0338a[] aVarArr, boolean z) {
                return new C0262a(i, charSequence, pendingIntent, bundle, (C0329bt[]) aVarArr, z);
            }

            /* renamed from: a */
            public C0262a[] mo1337b(int i) {
                return new C0262a[i];
            }
        };

        /* renamed from: a */
        final Bundle f1507a;

        /* renamed from: b */
        public int f1508b;

        /* renamed from: c */
        public CharSequence f1509c;

        /* renamed from: d */
        public PendingIntent f1510d;

        /* renamed from: f */
        private final C0329bt[] f1511f;

        /* renamed from: g */
        private boolean f1512g;

        /* renamed from: android.support.v4.c.bc$a$a */
        public static final class C0264a {

            /* renamed from: a */
            private final int f1513a;

            /* renamed from: b */
            private final CharSequence f1514b;

            /* renamed from: c */
            private final PendingIntent f1515c;

            /* renamed from: d */
            private boolean f1516d;

            /* renamed from: e */
            private final Bundle f1517e;

            /* renamed from: f */
            private ArrayList<C0329bt> f1518f;

            public C0264a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
                this(i, charSequence, pendingIntent, new Bundle(), (C0329bt[]) null, true);
            }

            private C0264a(int i, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, C0329bt[] btVarArr, boolean z) {
                this.f1516d = true;
                this.f1513a = i;
                this.f1514b = C0269d.m1628f(charSequence);
                this.f1515c = pendingIntent;
                this.f1517e = bundle;
                this.f1518f = btVarArr == null ? null : new ArrayList<>(Arrays.asList(btVarArr));
                this.f1516d = z;
            }

            public C0264a(C0262a aVar) {
                this(aVar.f1508b, aVar.f1509c, aVar.f1510d, new Bundle(aVar.f1507a), aVar.mo1334g(), aVar.mo1332e());
            }

            /* renamed from: a */
            public Bundle mo1338a() {
                return this.f1517e;
            }

            /* renamed from: a */
            public C0264a mo1339a(Bundle bundle) {
                if (bundle != null) {
                    this.f1517e.putAll(bundle);
                }
                return this;
            }

            /* renamed from: a */
            public C0264a mo1340a(C0265b bVar) {
                bVar.mo1344a(this);
                return this;
            }

            /* renamed from: a */
            public C0264a mo1341a(C0329bt btVar) {
                if (this.f1518f == null) {
                    this.f1518f = new ArrayList<>();
                }
                this.f1518f.add(btVar);
                return this;
            }

            /* renamed from: a */
            public C0264a mo1342a(boolean z) {
                this.f1516d = z;
                return this;
            }

            /* renamed from: b */
            public C0262a mo1343b() {
                return new C0262a(this.f1513a, this.f1514b, this.f1515c, this.f1517e, this.f1518f != null ? (C0329bt[]) this.f1518f.toArray(new C0329bt[this.f1518f.size()]) : null, this.f1516d);
            }
        }

        /* renamed from: android.support.v4.c.bc$a$b */
        public interface C0265b {
            /* renamed from: a */
            C0264a mo1344a(C0264a aVar);
        }

        /* renamed from: android.support.v4.c.bc$a$c */
        public static final class C0266c implements C0265b {

            /* renamed from: a */
            private static final String f1519a = "android.wearable.EXTENSIONS";

            /* renamed from: b */
            private static final String f1520b = "flags";

            /* renamed from: c */
            private static final String f1521c = "inProgressLabel";

            /* renamed from: d */
            private static final String f1522d = "confirmLabel";

            /* renamed from: e */
            private static final String f1523e = "cancelLabel";

            /* renamed from: f */
            private static final int f1524f = 1;

            /* renamed from: g */
            private static final int f1525g = 2;

            /* renamed from: h */
            private static final int f1526h = 4;

            /* renamed from: i */
            private static final int f1527i = 1;

            /* renamed from: j */
            private int f1528j = 1;

            /* renamed from: k */
            private CharSequence f1529k;

            /* renamed from: l */
            private CharSequence f1530l;

            /* renamed from: m */
            private CharSequence f1531m;

            public C0266c() {
            }

            public C0266c(C0262a aVar) {
                Bundle bundle = aVar.mo1331d().getBundle(f1519a);
                if (bundle != null) {
                    this.f1528j = bundle.getInt(f1520b, 1);
                    this.f1529k = bundle.getCharSequence(f1521c);
                    this.f1530l = bundle.getCharSequence(f1522d);
                    this.f1531m = bundle.getCharSequence(f1523e);
                }
            }

            /* renamed from: a */
            private void m1605a(int i, boolean z) {
                if (z) {
                    this.f1528j |= i;
                } else {
                    this.f1528j &= i ^ -1;
                }
            }

            /* renamed from: a */
            public C0264a mo1344a(C0264a aVar) {
                Bundle bundle = new Bundle();
                if (this.f1528j != 1) {
                    bundle.putInt(f1520b, this.f1528j);
                }
                if (this.f1529k != null) {
                    bundle.putCharSequence(f1521c, this.f1529k);
                }
                if (this.f1530l != null) {
                    bundle.putCharSequence(f1522d, this.f1530l);
                }
                if (this.f1531m != null) {
                    bundle.putCharSequence(f1523e, this.f1531m);
                }
                aVar.mo1338a().putBundle(f1519a, bundle);
                return aVar;
            }

            /* renamed from: a */
            public C0266c clone() {
                C0266c cVar = new C0266c();
                cVar.f1528j = this.f1528j;
                cVar.f1529k = this.f1529k;
                cVar.f1530l = this.f1530l;
                cVar.f1531m = this.f1531m;
                return cVar;
            }

            /* renamed from: a */
            public C0266c mo1346a(CharSequence charSequence) {
                this.f1529k = charSequence;
                return this;
            }

            /* renamed from: a */
            public C0266c mo1347a(boolean z) {
                m1605a(1, z);
                return this;
            }

            /* renamed from: b */
            public C0266c mo1348b(CharSequence charSequence) {
                this.f1530l = charSequence;
                return this;
            }

            /* renamed from: b */
            public C0266c mo1349b(boolean z) {
                m1605a(2, z);
                return this;
            }

            /* renamed from: b */
            public boolean mo1350b() {
                return (this.f1528j & 1) != 0;
            }

            /* renamed from: c */
            public C0266c mo1351c(CharSequence charSequence) {
                this.f1531m = charSequence;
                return this;
            }

            /* renamed from: c */
            public C0266c mo1352c(boolean z) {
                m1605a(4, z);
                return this;
            }

            /* renamed from: c */
            public CharSequence mo1353c() {
                return this.f1529k;
            }

            /* renamed from: d */
            public CharSequence mo1355d() {
                return this.f1530l;
            }

            /* renamed from: e */
            public CharSequence mo1356e() {
                return this.f1531m;
            }

            /* renamed from: f */
            public boolean mo1357f() {
                return (this.f1528j & 2) != 0;
            }

            /* renamed from: g */
            public boolean mo1358g() {
                return (this.f1528j & 4) != 0;
            }
        }

        public C0262a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i, charSequence, pendingIntent, new Bundle(), (C0329bt[]) null, true);
        }

        C0262a(int i, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, C0329bt[] btVarArr, boolean z) {
            this.f1508b = i;
            this.f1509c = C0269d.m1628f(charSequence);
            this.f1510d = pendingIntent;
            this.f1507a = bundle == null ? new Bundle() : bundle;
            this.f1511f = btVarArr;
            this.f1512g = z;
        }

        /* renamed from: a */
        public int mo1328a() {
            return this.f1508b;
        }

        /* renamed from: b */
        public CharSequence mo1329b() {
            return this.f1509c;
        }

        /* renamed from: c */
        public PendingIntent mo1330c() {
            return this.f1510d;
        }

        /* renamed from: d */
        public Bundle mo1331d() {
            return this.f1507a;
        }

        /* renamed from: e */
        public boolean mo1332e() {
            return this.f1512g;
        }

        /* renamed from: f */
        public C0329bt[] mo1334g() {
            return this.f1511f;
        }
    }

    /* renamed from: android.support.v4.c.bc$b */
    public static class C0267b extends C0289t {

        /* renamed from: a */
        Bitmap f1532a;

        /* renamed from: b */
        Bitmap f1533b;

        /* renamed from: c */
        boolean f1534c;

        public C0267b() {
        }

        public C0267b(C0269d dVar) {
            mo1477a(dVar);
        }

        /* renamed from: a */
        public C0267b mo1359a(Bitmap bitmap) {
            this.f1532a = bitmap;
            return this;
        }

        /* renamed from: a */
        public C0267b mo1360a(CharSequence charSequence) {
            this.f1607f = C0269d.m1628f(charSequence);
            return this;
        }

        /* renamed from: b */
        public C0267b mo1361b(Bitmap bitmap) {
            this.f1533b = bitmap;
            this.f1534c = true;
            return this;
        }

        /* renamed from: b */
        public C0267b mo1362b(CharSequence charSequence) {
            this.f1608g = C0269d.m1628f(charSequence);
            this.f1609h = true;
            return this;
        }
    }

    /* renamed from: android.support.v4.c.bc$c */
    public static class C0268c extends C0289t {

        /* renamed from: a */
        CharSequence f1535a;

        public C0268c() {
        }

        public C0268c(C0269d dVar) {
            mo1477a(dVar);
        }

        /* renamed from: a */
        public C0268c mo1363a(CharSequence charSequence) {
            this.f1607f = C0269d.m1628f(charSequence);
            return this;
        }

        /* renamed from: b */
        public C0268c mo1364b(CharSequence charSequence) {
            this.f1608g = C0269d.m1628f(charSequence);
            this.f1609h = true;
            return this;
        }

        /* renamed from: c */
        public C0268c mo1365c(CharSequence charSequence) {
            this.f1535a = C0269d.m1628f(charSequence);
            return this;
        }
    }

    /* renamed from: android.support.v4.c.bc$d */
    public static class C0269d {

        /* renamed from: H */
        private static final int f1536H = 5120;

        /* renamed from: A */
        int f1537A = 0;

        /* renamed from: B */
        Notification f1538B;

        /* renamed from: C */
        RemoteViews f1539C;

        /* renamed from: D */
        RemoteViews f1540D;

        /* renamed from: E */
        RemoteViews f1541E;
        @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})

        /* renamed from: F */
        public Notification f1542F = new Notification();

        /* renamed from: G */
        public ArrayList<String> f1543G;
        @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})

        /* renamed from: a */
        public Context f1544a;
        @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})

        /* renamed from: b */
        public CharSequence f1545b;
        @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})

        /* renamed from: c */
        public CharSequence f1546c;

        /* renamed from: d */
        PendingIntent f1547d;

        /* renamed from: e */
        PendingIntent f1548e;

        /* renamed from: f */
        RemoteViews f1549f;
        @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})

        /* renamed from: g */
        public Bitmap f1550g;
        @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})

        /* renamed from: h */
        public CharSequence f1551h;
        @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})

        /* renamed from: i */
        public int f1552i;

        /* renamed from: j */
        int f1553j;

        /* renamed from: k */
        boolean f1554k = true;
        @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})

        /* renamed from: l */
        public boolean f1555l;
        @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})

        /* renamed from: m */
        public C0289t f1556m;
        @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})

        /* renamed from: n */
        public CharSequence f1557n;
        @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})

        /* renamed from: o */
        public CharSequence[] f1558o;

        /* renamed from: p */
        int f1559p;

        /* renamed from: q */
        int f1560q;

        /* renamed from: r */
        boolean f1561r;

        /* renamed from: s */
        String f1562s;

        /* renamed from: t */
        boolean f1563t;

        /* renamed from: u */
        String f1564u;
        @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})

        /* renamed from: v */
        public ArrayList<C0262a> f1565v = new ArrayList<>();

        /* renamed from: w */
        boolean f1566w = false;

        /* renamed from: x */
        String f1567x;

        /* renamed from: y */
        Bundle f1568y;

        /* renamed from: z */
        int f1569z = 0;

        public C0269d(Context context) {
            this.f1544a = context;
            this.f1542F.when = System.currentTimeMillis();
            this.f1542F.audioStreamType = -1;
            this.f1553j = 0;
            this.f1543G = new ArrayList<>();
        }

        /* renamed from: a */
        private void m1627a(int i, boolean z) {
            if (z) {
                this.f1542F.flags |= i;
                return;
            }
            this.f1542F.flags &= i ^ -1;
        }

        /* renamed from: f */
        protected static CharSequence m1628f(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > f1536H) ? charSequence.subSequence(0, f1536H) : charSequence;
        }

        /* renamed from: a */
        public Bundle mo1366a() {
            if (this.f1568y == null) {
                this.f1568y = new Bundle();
            }
            return this.f1568y;
        }

        /* renamed from: a */
        public C0269d mo1367a(int i) {
            this.f1542F.icon = i;
            return this;
        }

        /* renamed from: a */
        public C0269d mo1368a(int i, int i2) {
            this.f1542F.icon = i;
            this.f1542F.iconLevel = i2;
            return this;
        }

        /* renamed from: a */
        public C0269d mo1369a(@C0032k int i, int i2, int i3) {
            int i4 = 1;
            this.f1542F.ledARGB = i;
            this.f1542F.ledOnMS = i2;
            this.f1542F.ledOffMS = i3;
            boolean z = (this.f1542F.ledOnMS == 0 || this.f1542F.ledOffMS == 0) ? false : true;
            Notification notification = this.f1542F;
            int i5 = this.f1542F.flags & -2;
            if (!z) {
                i4 = 0;
            }
            notification.flags = i5 | i4;
            return this;
        }

        /* renamed from: a */
        public C0269d mo1370a(int i, int i2, boolean z) {
            this.f1559p = i;
            this.f1560q = i2;
            this.f1561r = z;
            return this;
        }

        /* renamed from: a */
        public C0269d mo1371a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f1565v.add(new C0262a(i, charSequence, pendingIntent));
            return this;
        }

        /* renamed from: a */
        public C0269d mo1372a(long j) {
            this.f1542F.when = j;
            return this;
        }

        /* renamed from: a */
        public C0269d mo1373a(Notification notification) {
            this.f1538B = notification;
            return this;
        }

        /* renamed from: a */
        public C0269d mo1374a(PendingIntent pendingIntent) {
            this.f1547d = pendingIntent;
            return this;
        }

        /* renamed from: a */
        public C0269d mo1375a(PendingIntent pendingIntent, boolean z) {
            this.f1548e = pendingIntent;
            m1627a(128, z);
            return this;
        }

        /* renamed from: a */
        public C0269d mo1376a(Bitmap bitmap) {
            this.f1550g = bitmap;
            return this;
        }

        /* renamed from: a */
        public C0269d mo1377a(Uri uri) {
            this.f1542F.sound = uri;
            this.f1542F.audioStreamType = -1;
            return this;
        }

        /* renamed from: a */
        public C0269d mo1378a(Uri uri, int i) {
            this.f1542F.sound = uri;
            this.f1542F.audioStreamType = i;
            return this;
        }

        /* renamed from: a */
        public C0269d mo1379a(Bundle bundle) {
            if (bundle != null) {
                if (this.f1568y == null) {
                    this.f1568y = new Bundle(bundle);
                } else {
                    this.f1568y.putAll(bundle);
                }
            }
            return this;
        }

        /* renamed from: a */
        public C0269d mo1380a(C0262a aVar) {
            this.f1565v.add(aVar);
            return this;
        }

        /* renamed from: a */
        public C0269d mo1381a(C0275g gVar) {
            gVar.mo1426a(this);
            return this;
        }

        /* renamed from: a */
        public C0269d mo1382a(C0289t tVar) {
            if (this.f1556m != tVar) {
                this.f1556m = tVar;
                if (this.f1556m != null) {
                    this.f1556m.mo1477a(this);
                }
            }
            return this;
        }

        /* renamed from: a */
        public C0269d mo1383a(RemoteViews remoteViews) {
            this.f1542F.contentView = remoteViews;
            return this;
        }

        /* renamed from: a */
        public C0269d mo1384a(CharSequence charSequence) {
            this.f1545b = m1628f(charSequence);
            return this;
        }

        /* renamed from: a */
        public C0269d mo1385a(CharSequence charSequence, RemoteViews remoteViews) {
            this.f1542F.tickerText = m1628f(charSequence);
            this.f1549f = remoteViews;
            return this;
        }

        /* renamed from: a */
        public C0269d mo1386a(String str) {
            this.f1567x = str;
            return this;
        }

        /* renamed from: a */
        public C0269d mo1387a(boolean z) {
            this.f1554k = z;
            return this;
        }

        /* renamed from: a */
        public C0269d mo1388a(long[] jArr) {
            this.f1542F.vibrate = jArr;
            return this;
        }

        /* renamed from: a */
        public C0269d mo1389a(CharSequence[] charSequenceArr) {
            this.f1558o = charSequenceArr;
            return this;
        }

        @Deprecated
        /* renamed from: b */
        public Notification mo1390b() {
            return mo1398c();
        }

        /* renamed from: b */
        public C0269d mo1391b(int i) {
            this.f1552i = i;
            return this;
        }

        /* renamed from: b */
        public C0269d mo1392b(PendingIntent pendingIntent) {
            this.f1542F.deleteIntent = pendingIntent;
            return this;
        }

        /* renamed from: b */
        public C0269d mo1393b(Bundle bundle) {
            this.f1568y = bundle;
            return this;
        }

        /* renamed from: b */
        public C0269d mo1394b(RemoteViews remoteViews) {
            this.f1539C = remoteViews;
            return this;
        }

        /* renamed from: b */
        public C0269d mo1395b(CharSequence charSequence) {
            this.f1546c = m1628f(charSequence);
            return this;
        }

        /* renamed from: b */
        public C0269d mo1396b(String str) {
            this.f1543G.add(str);
            return this;
        }

        /* renamed from: b */
        public C0269d mo1397b(boolean z) {
            this.f1555l = z;
            return this;
        }

        /* renamed from: c */
        public Notification mo1398c() {
            return C0261bc.f1480an.mo1464a(this, mo1409d());
        }

        /* renamed from: c */
        public C0269d mo1399c(int i) {
            this.f1542F.defaults = i;
            if ((i & 4) != 0) {
                this.f1542F.flags |= 1;
            }
            return this;
        }

        /* renamed from: c */
        public C0269d mo1400c(RemoteViews remoteViews) {
            this.f1540D = remoteViews;
            return this;
        }

        /* renamed from: c */
        public C0269d mo1401c(CharSequence charSequence) {
            this.f1557n = m1628f(charSequence);
            return this;
        }

        /* renamed from: c */
        public C0269d mo1402c(String str) {
            this.f1562s = str;
            return this;
        }

        /* renamed from: c */
        public C0269d mo1403c(boolean z) {
            m1627a(2, z);
            return this;
        }

        /* renamed from: d */
        public C0269d mo1404d(int i) {
            this.f1553j = i;
            return this;
        }

        /* renamed from: d */
        public C0269d mo1405d(RemoteViews remoteViews) {
            this.f1541E = remoteViews;
            return this;
        }

        /* renamed from: d */
        public C0269d mo1406d(CharSequence charSequence) {
            this.f1551h = m1628f(charSequence);
            return this;
        }

        /* renamed from: d */
        public C0269d mo1407d(String str) {
            this.f1564u = str;
            return this;
        }

        /* renamed from: d */
        public C0269d mo1408d(boolean z) {
            m1627a(8, z);
            return this;
        }

        /* access modifiers changed from: protected */
        @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
        /* renamed from: d */
        public C0270e mo1409d() {
            return new C0270e();
        }

        /* renamed from: e */
        public C0269d mo1410e(@C0032k int i) {
            this.f1569z = i;
            return this;
        }

        /* renamed from: e */
        public C0269d mo1411e(CharSequence charSequence) {
            this.f1542F.tickerText = m1628f(charSequence);
            return this;
        }

        /* renamed from: e */
        public C0269d mo1412e(boolean z) {
            m1627a(16, z);
            return this;
        }

        @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
        /* renamed from: e */
        public RemoteViews mo1413e() {
            return this.f1539C;
        }

        /* renamed from: f */
        public C0269d mo1414f(int i) {
            this.f1537A = i;
            return this;
        }

        /* renamed from: f */
        public C0269d mo1415f(boolean z) {
            this.f1566w = z;
            return this;
        }

        @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
        /* renamed from: f */
        public RemoteViews mo1416f() {
            return this.f1540D;
        }

        /* renamed from: g */
        public C0269d mo1417g(boolean z) {
            this.f1563t = z;
            return this;
        }

        @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
        /* renamed from: g */
        public RemoteViews mo1418g() {
            return this.f1541E;
        }

        @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
        /* renamed from: h */
        public long mo1419h() {
            if (this.f1554k) {
                return this.f1542F.when;
            }
            return 0;
        }

        @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
        /* renamed from: i */
        public int mo1420i() {
            return this.f1553j;
        }

        @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
        /* renamed from: j */
        public int mo1421j() {
            return this.f1569z;
        }

        /* access modifiers changed from: protected */
        @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
        /* renamed from: k */
        public CharSequence mo1422k() {
            return this.f1546c;
        }

        /* access modifiers changed from: protected */
        @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
        /* renamed from: l */
        public CharSequence mo1423l() {
            return this.f1545b;
        }
    }

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    /* renamed from: android.support.v4.c.bc$e */
    protected static class C0270e {
        protected C0270e() {
        }

        /* renamed from: a */
        public Notification mo1424a(C0269d dVar, C0260bb bbVar) {
            Notification b = bbVar.mo1327b();
            if (dVar.f1539C != null) {
                b.contentView = dVar.f1539C;
            }
            return b;
        }
    }

    /* renamed from: android.support.v4.c.bc$f */
    public static final class C0271f implements C0275g {

        /* renamed from: a */
        private static final String f1570a = "CarExtender";

        /* renamed from: b */
        private static final String f1571b = "android.car.EXTENSIONS";

        /* renamed from: c */
        private static final String f1572c = "large_icon";

        /* renamed from: d */
        private static final String f1573d = "car_conversation";

        /* renamed from: e */
        private static final String f1574e = "app_color";

        /* renamed from: f */
        private Bitmap f1575f;

        /* renamed from: g */
        private C0272a f1576g;

        /* renamed from: h */
        private int f1577h = 0;

        /* renamed from: android.support.v4.c.bc$f$a */
        public static class C0272a extends C0298bh.C0301b {

            /* renamed from: a */
            static final C0298bh.C0301b.C0302a f1578a = new C0298bh.C0301b.C0302a() {
                /* renamed from: a */
                public C0272a mo1441b(String[] strArr, C0337bv.C0338a aVar, PendingIntent pendingIntent, PendingIntent pendingIntent2, String[] strArr2, long j) {
                    return new C0272a(strArr, (C0329bt) aVar, pendingIntent, pendingIntent2, strArr2, j);
                }
            };

            /* renamed from: b */
            private final String[] f1579b;

            /* renamed from: c */
            private final C0329bt f1580c;

            /* renamed from: d */
            private final PendingIntent f1581d;

            /* renamed from: e */
            private final PendingIntent f1582e;

            /* renamed from: f */
            private final String[] f1583f;

            /* renamed from: g */
            private final long f1584g;

            /* renamed from: android.support.v4.c.bc$f$a$a */
            public static class C0274a {

                /* renamed from: a */
                private final List<String> f1585a = new ArrayList();

                /* renamed from: b */
                private final String f1586b;

                /* renamed from: c */
                private C0329bt f1587c;

                /* renamed from: d */
                private PendingIntent f1588d;

                /* renamed from: e */
                private PendingIntent f1589e;

                /* renamed from: f */
                private long f1590f;

                public C0274a(String str) {
                    this.f1586b = str;
                }

                /* renamed from: a */
                public C0274a mo1442a(long j) {
                    this.f1590f = j;
                    return this;
                }

                /* renamed from: a */
                public C0274a mo1443a(PendingIntent pendingIntent) {
                    this.f1588d = pendingIntent;
                    return this;
                }

                /* renamed from: a */
                public C0274a mo1444a(PendingIntent pendingIntent, C0329bt btVar) {
                    this.f1587c = btVar;
                    this.f1589e = pendingIntent;
                    return this;
                }

                /* renamed from: a */
                public C0274a mo1445a(String str) {
                    this.f1585a.add(str);
                    return this;
                }

                /* renamed from: a */
                public C0272a mo1446a() {
                    return new C0272a((String[]) this.f1585a.toArray(new String[this.f1585a.size()]), this.f1587c, this.f1589e, this.f1588d, new String[]{this.f1586b}, this.f1590f);
                }
            }

            C0272a(String[] strArr, C0329bt btVar, PendingIntent pendingIntent, PendingIntent pendingIntent2, String[] strArr2, long j) {
                this.f1579b = strArr;
                this.f1580c = btVar;
                this.f1582e = pendingIntent2;
                this.f1581d = pendingIntent;
                this.f1583f = strArr2;
                this.f1584g = j;
            }

            /* renamed from: a */
            public String[] mo1432a() {
                return this.f1579b;
            }

            /* renamed from: b */
            public C0329bt mo1439h() {
                return this.f1580c;
            }

            /* renamed from: c */
            public PendingIntent mo1434c() {
                return this.f1581d;
            }

            /* renamed from: d */
            public PendingIntent mo1435d() {
                return this.f1582e;
            }

            /* renamed from: e */
            public String[] mo1436e() {
                return this.f1583f;
            }

            /* renamed from: f */
            public String mo1437f() {
                if (this.f1583f.length > 0) {
                    return this.f1583f[0];
                }
                return null;
            }

            /* renamed from: g */
            public long mo1438g() {
                return this.f1584g;
            }
        }

        public C0271f() {
        }

        public C0271f(Notification notification) {
            if (Build.VERSION.SDK_INT >= 21) {
                Bundle bundle = C0261bc.m1576a(notification) == null ? null : C0261bc.m1576a(notification).getBundle(f1571b);
                if (bundle != null) {
                    this.f1575f = (Bitmap) bundle.getParcelable(f1572c);
                    this.f1577h = bundle.getInt(f1574e, 0);
                    this.f1576g = (C0272a) C0261bc.f1480an.mo1468a(bundle.getBundle(f1573d), C0272a.f1578a, C0329bt.f1805c);
                }
            }
        }

        @C0032k
        /* renamed from: a */
        public int mo1425a() {
            return this.f1577h;
        }

        /* renamed from: a */
        public C0269d mo1426a(C0269d dVar) {
            if (Build.VERSION.SDK_INT >= 21) {
                Bundle bundle = new Bundle();
                if (this.f1575f != null) {
                    bundle.putParcelable(f1572c, this.f1575f);
                }
                if (this.f1577h != 0) {
                    bundle.putInt(f1574e, this.f1577h);
                }
                if (this.f1576g != null) {
                    bundle.putBundle(f1573d, C0261bc.f1480an.mo1466a((C0298bh.C0301b) this.f1576g));
                }
                dVar.mo1366a().putBundle(f1571b, bundle);
            }
            return dVar;
        }

        /* renamed from: a */
        public C0271f mo1427a(@C0032k int i) {
            this.f1577h = i;
            return this;
        }

        /* renamed from: a */
        public C0271f mo1428a(Bitmap bitmap) {
            this.f1575f = bitmap;
            return this;
        }

        /* renamed from: a */
        public C0271f mo1429a(C0272a aVar) {
            this.f1576g = aVar;
            return this;
        }

        /* renamed from: b */
        public Bitmap mo1430b() {
            return this.f1575f;
        }

        /* renamed from: c */
        public C0272a mo1431c() {
            return this.f1576g;
        }
    }

    /* renamed from: android.support.v4.c.bc$g */
    public interface C0275g {
        /* renamed from: a */
        C0269d mo1426a(C0269d dVar);
    }

    /* renamed from: android.support.v4.c.bc$h */
    public static class C0276h extends C0289t {

        /* renamed from: a */
        ArrayList<CharSequence> f1591a = new ArrayList<>();

        public C0276h() {
        }

        public C0276h(C0269d dVar) {
            mo1477a(dVar);
        }

        /* renamed from: a */
        public C0276h mo1447a(CharSequence charSequence) {
            this.f1607f = C0269d.m1628f(charSequence);
            return this;
        }

        /* renamed from: b */
        public C0276h mo1448b(CharSequence charSequence) {
            this.f1608g = C0269d.m1628f(charSequence);
            this.f1609h = true;
            return this;
        }

        /* renamed from: c */
        public C0276h mo1449c(CharSequence charSequence) {
            this.f1591a.add(C0269d.m1628f(charSequence));
            return this;
        }
    }

    /* renamed from: android.support.v4.c.bc$i */
    public static class C0277i extends C0289t {

        /* renamed from: a */
        public static final int f1592a = 25;

        /* renamed from: b */
        CharSequence f1593b;

        /* renamed from: c */
        CharSequence f1594c;

        /* renamed from: d */
        List<C0278a> f1595d = new ArrayList();

        /* renamed from: android.support.v4.c.bc$i$a */
        public static final class C0278a {

            /* renamed from: a */
            static final String f1596a = "text";

            /* renamed from: b */
            static final String f1597b = "time";

            /* renamed from: c */
            static final String f1598c = "sender";

            /* renamed from: d */
            static final String f1599d = "type";

            /* renamed from: e */
            static final String f1600e = "uri";

            /* renamed from: f */
            private final CharSequence f1601f;

            /* renamed from: g */
            private final long f1602g;

            /* renamed from: h */
            private final CharSequence f1603h;

            /* renamed from: i */
            private String f1604i;

            /* renamed from: j */
            private Uri f1605j;

            public C0278a(CharSequence charSequence, long j, CharSequence charSequence2) {
                this.f1601f = charSequence;
                this.f1602g = j;
                this.f1603h = charSequence2;
            }

            /* renamed from: a */
            static C0278a m1723a(Bundle bundle) {
                try {
                    if (!bundle.containsKey(f1596a) || !bundle.containsKey(f1597b)) {
                        return null;
                    }
                    C0278a aVar = new C0278a(bundle.getCharSequence(f1596a), bundle.getLong(f1597b), bundle.getCharSequence(f1598c));
                    if (bundle.containsKey(f1599d) && bundle.containsKey(f1600e)) {
                        aVar.mo1458a(bundle.getString(f1599d), (Uri) bundle.getParcelable(f1600e));
                    }
                    return aVar;
                } catch (ClassCastException e) {
                    return null;
                }
            }

            /* renamed from: a */
            static List<C0278a> m1724a(Parcelable[] parcelableArr) {
                C0278a a;
                ArrayList arrayList = new ArrayList(parcelableArr.length);
                int i = 0;
                while (true) {
                    int i2 = i;
                    if (i2 >= parcelableArr.length) {
                        return arrayList;
                    }
                    if ((parcelableArr[i2] instanceof Bundle) && (a = m1723a(parcelableArr[i2])) != null) {
                        arrayList.add(a);
                    }
                    i = i2 + 1;
                }
            }

            /* renamed from: a */
            static Bundle[] m1725a(List<C0278a> list) {
                Bundle[] bundleArr = new Bundle[list.size()];
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    bundleArr[i] = list.get(i).m1726f();
                }
                return bundleArr;
            }

            /* renamed from: f */
            private Bundle m1726f() {
                Bundle bundle = new Bundle();
                if (this.f1601f != null) {
                    bundle.putCharSequence(f1596a, this.f1601f);
                }
                bundle.putLong(f1597b, this.f1602g);
                if (this.f1603h != null) {
                    bundle.putCharSequence(f1598c, this.f1603h);
                }
                if (this.f1604i != null) {
                    bundle.putString(f1599d, this.f1604i);
                }
                if (this.f1605j != null) {
                    bundle.putParcelable(f1600e, this.f1605j);
                }
                return bundle;
            }

            /* renamed from: a */
            public C0278a mo1458a(String str, Uri uri) {
                this.f1604i = str;
                this.f1605j = uri;
                return this;
            }

            /* renamed from: a */
            public CharSequence mo1459a() {
                return this.f1601f;
            }

            /* renamed from: b */
            public long mo1460b() {
                return this.f1602g;
            }

            /* renamed from: c */
            public CharSequence mo1461c() {
                return this.f1603h;
            }

            /* renamed from: d */
            public String mo1462d() {
                return this.f1604i;
            }

            /* renamed from: e */
            public Uri mo1463e() {
                return this.f1605j;
            }
        }

        C0277i() {
        }

        public C0277i(@C0047z CharSequence charSequence) {
            this.f1593b = charSequence;
        }

        /* renamed from: a */
        public static C0277i m1714a(Notification notification) {
            Bundle a = C0261bc.f1480an.mo1465a(notification);
            if (a != null && !a.containsKey(C0261bc.f1457R)) {
                return null;
            }
            try {
                C0277i iVar = new C0277i();
                iVar.mo1456b(a);
                return iVar;
            } catch (ClassCastException e) {
                return null;
            }
        }

        /* renamed from: a */
        public C0277i mo1450a(C0278a aVar) {
            this.f1595d.add(aVar);
            if (this.f1595d.size() > 25) {
                this.f1595d.remove(0);
            }
            return this;
        }

        /* renamed from: a */
        public C0277i mo1451a(CharSequence charSequence) {
            this.f1594c = charSequence;
            return this;
        }

        /* renamed from: a */
        public C0277i mo1452a(CharSequence charSequence, long j, CharSequence charSequence2) {
            this.f1595d.add(new C0278a(charSequence, j, charSequence2));
            if (this.f1595d.size() > 25) {
                this.f1595d.remove(0);
            }
            return this;
        }

        /* renamed from: a */
        public CharSequence mo1453a() {
            return this.f1593b;
        }

        /* renamed from: a */
        public void mo1454a(Bundle bundle) {
            super.mo1454a(bundle);
            if (this.f1593b != null) {
                bundle.putCharSequence(C0261bc.f1457R, this.f1593b);
            }
            if (this.f1594c != null) {
                bundle.putCharSequence(C0261bc.f1458S, this.f1594c);
            }
            if (!this.f1595d.isEmpty()) {
                bundle.putParcelableArray(C0261bc.f1459T, C0278a.m1725a(this.f1595d));
            }
        }

        /* renamed from: b */
        public CharSequence mo1455b() {
            return this.f1594c;
        }

        /* access modifiers changed from: protected */
        @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
        /* renamed from: b */
        public void mo1456b(Bundle bundle) {
            this.f1595d.clear();
            this.f1593b = bundle.getString(C0261bc.f1457R);
            this.f1594c = bundle.getString(C0261bc.f1458S);
            Parcelable[] parcelableArray = bundle.getParcelableArray(C0261bc.f1459T);
            if (parcelableArray != null) {
                this.f1595d = C0278a.m1724a(parcelableArray);
            }
        }

        /* renamed from: c */
        public List<C0278a> mo1457c() {
            return this.f1595d;
        }
    }

    /* renamed from: android.support.v4.c.bc$j */
    interface C0279j {
        /* renamed from: a */
        Notification mo1464a(C0269d dVar, C0270e eVar);

        /* renamed from: a */
        Bundle mo1465a(Notification notification);

        /* renamed from: a */
        Bundle mo1466a(C0298bh.C0301b bVar);

        /* renamed from: a */
        C0262a mo1467a(Notification notification, int i);

        /* renamed from: a */
        C0298bh.C0301b mo1468a(Bundle bundle, C0298bh.C0301b.C0302a aVar, C0337bv.C0338a.C0339a aVar2);

        /* renamed from: a */
        ArrayList<Parcelable> mo1469a(C0262a[] aVarArr);

        /* renamed from: a */
        C0262a[] mo1470a(ArrayList<Parcelable> arrayList);

        /* renamed from: b */
        int mo1471b(Notification notification);

        /* renamed from: c */
        String mo1472c(Notification notification);

        /* renamed from: d */
        boolean mo1473d(Notification notification);

        /* renamed from: e */
        String mo1474e(Notification notification);

        /* renamed from: f */
        boolean mo1475f(Notification notification);

        /* renamed from: g */
        String mo1476g(Notification notification);
    }

    /* renamed from: android.support.v4.c.bc$k */
    static class C0280k extends C0287r {
        C0280k() {
        }

        /* renamed from: a */
        public Notification mo1464a(C0269d dVar, C0270e eVar) {
            C0291bd.C0292a aVar = new C0291bd.C0292a(dVar.f1544a, dVar.f1542F, dVar.mo1423l(), dVar.mo1422k(), dVar.f1551h, dVar.f1549f, dVar.f1552i, dVar.f1547d, dVar.f1548e, dVar.f1550g, dVar.f1559p, dVar.f1560q, dVar.f1561r, dVar.f1554k, dVar.f1555l, dVar.f1553j, dVar.f1557n, dVar.f1566w, dVar.f1543G, dVar.f1568y, dVar.f1562s, dVar.f1563t, dVar.f1564u, dVar.f1539C, dVar.f1540D);
            C0261bc.m1578a((C0259ba) aVar, dVar.f1565v);
            C0261bc.m1579a((C0260bb) aVar, dVar.f1556m);
            Notification a = eVar.mo1424a(dVar, aVar);
            if (dVar.f1556m != null) {
                dVar.f1556m.mo1454a(mo1465a(a));
            }
            return a;
        }

        /* renamed from: a */
        public C0262a mo1467a(Notification notification, int i) {
            return (C0262a) C0291bd.m1845a(notification, i, C0262a.f1506e, C0329bt.f1805c);
        }

        /* renamed from: a */
        public ArrayList<Parcelable> mo1469a(C0262a[] aVarArr) {
            return C0291bd.m1846a((C0298bh.C0299a[]) aVarArr);
        }

        /* renamed from: a */
        public C0262a[] mo1470a(ArrayList<Parcelable> arrayList) {
            return (C0262a[]) C0291bd.m1849a(arrayList, C0262a.f1506e, C0329bt.f1805c);
        }

        /* renamed from: d */
        public boolean mo1473d(Notification notification) {
            return C0291bd.m1848a(notification);
        }

        /* renamed from: e */
        public String mo1474e(Notification notification) {
            return C0291bd.m1850b(notification);
        }

        /* renamed from: f */
        public boolean mo1475f(Notification notification) {
            return C0291bd.m1851c(notification);
        }

        /* renamed from: g */
        public String mo1476g(Notification notification) {
            return C0291bd.m1852d(notification);
        }
    }

    /* renamed from: android.support.v4.c.bc$l */
    static class C0281l extends C0280k {
        C0281l() {
        }

        /* renamed from: a */
        public Notification mo1464a(C0269d dVar, C0270e eVar) {
            C0293be.C0294a aVar = new C0293be.C0294a(dVar.f1544a, dVar.f1542F, dVar.mo1423l(), dVar.mo1422k(), dVar.f1551h, dVar.f1549f, dVar.f1552i, dVar.f1547d, dVar.f1548e, dVar.f1550g, dVar.f1559p, dVar.f1560q, dVar.f1561r, dVar.f1554k, dVar.f1555l, dVar.f1553j, dVar.f1557n, dVar.f1566w, dVar.f1567x, dVar.f1543G, dVar.f1568y, dVar.f1569z, dVar.f1537A, dVar.f1538B, dVar.f1562s, dVar.f1563t, dVar.f1564u, dVar.f1539C, dVar.f1540D, dVar.f1541E);
            C0261bc.m1578a((C0259ba) aVar, dVar.f1565v);
            C0261bc.m1579a((C0260bb) aVar, dVar.f1556m);
            Notification a = eVar.mo1424a(dVar, aVar);
            if (dVar.f1556m != null) {
                dVar.f1556m.mo1454a(mo1465a(a));
            }
            return a;
        }

        /* renamed from: a */
        public Bundle mo1466a(C0298bh.C0301b bVar) {
            return C0293be.m1857a(bVar);
        }

        /* renamed from: a */
        public C0298bh.C0301b mo1468a(Bundle bundle, C0298bh.C0301b.C0302a aVar, C0337bv.C0338a.C0339a aVar2) {
            return C0293be.m1858a(bundle, aVar, aVar2);
        }

        /* renamed from: c */
        public String mo1472c(Notification notification) {
            return C0293be.m1860a(notification);
        }
    }

    /* renamed from: android.support.v4.c.bc$m */
    static class C0282m extends C0281l {
        C0282m() {
        }

        /* renamed from: a */
        public Notification mo1464a(C0269d dVar, C0270e eVar) {
            C0296bg.C0297a aVar = new C0296bg.C0297a(dVar.f1544a, dVar.f1542F, dVar.f1545b, dVar.f1546c, dVar.f1551h, dVar.f1549f, dVar.f1552i, dVar.f1547d, dVar.f1548e, dVar.f1550g, dVar.f1559p, dVar.f1560q, dVar.f1561r, dVar.f1554k, dVar.f1555l, dVar.f1553j, dVar.f1557n, dVar.f1566w, dVar.f1567x, dVar.f1543G, dVar.f1568y, dVar.f1569z, dVar.f1537A, dVar.f1538B, dVar.f1562s, dVar.f1563t, dVar.f1564u, dVar.f1558o, dVar.f1539C, dVar.f1540D, dVar.f1541E);
            C0261bc.m1578a((C0259ba) aVar, dVar.f1565v);
            C0261bc.m1582b(aVar, dVar.f1556m);
            Notification a = eVar.mo1424a(dVar, aVar);
            if (dVar.f1556m != null) {
                dVar.f1556m.mo1454a(mo1465a(a));
            }
            return a;
        }
    }

    /* renamed from: android.support.v4.c.bc$n */
    static class C0283n implements C0279j {
        C0283n() {
        }

        /* renamed from: a */
        public Notification mo1464a(C0269d dVar, C0270e eVar) {
            Notification a = C0298bh.m1868a(dVar.f1542F, dVar.f1544a, dVar.mo1423l(), dVar.mo1422k(), dVar.f1547d, dVar.f1548e);
            if (dVar.f1553j > 0) {
                a.flags |= 128;
            }
            if (dVar.f1539C != null) {
                a.contentView = dVar.f1539C;
            }
            return a;
        }

        /* renamed from: a */
        public Bundle mo1465a(Notification notification) {
            return null;
        }

        /* renamed from: a */
        public Bundle mo1466a(C0298bh.C0301b bVar) {
            return null;
        }

        /* renamed from: a */
        public C0262a mo1467a(Notification notification, int i) {
            return null;
        }

        /* renamed from: a */
        public C0298bh.C0301b mo1468a(Bundle bundle, C0298bh.C0301b.C0302a aVar, C0337bv.C0338a.C0339a aVar2) {
            return null;
        }

        /* renamed from: a */
        public ArrayList<Parcelable> mo1469a(C0262a[] aVarArr) {
            return null;
        }

        /* renamed from: a */
        public C0262a[] mo1470a(ArrayList<Parcelable> arrayList) {
            return null;
        }

        /* renamed from: b */
        public int mo1471b(Notification notification) {
            return 0;
        }

        /* renamed from: c */
        public String mo1472c(Notification notification) {
            return null;
        }

        /* renamed from: d */
        public boolean mo1473d(Notification notification) {
            return false;
        }

        /* renamed from: e */
        public String mo1474e(Notification notification) {
            return null;
        }

        /* renamed from: f */
        public boolean mo1475f(Notification notification) {
            return false;
        }

        /* renamed from: g */
        public String mo1476g(Notification notification) {
            return null;
        }
    }

    /* renamed from: android.support.v4.c.bc$o */
    static class C0284o extends C0283n {
        C0284o() {
        }

        /* renamed from: a */
        public Notification mo1464a(C0269d dVar, C0270e eVar) {
            Notification a = C0304bj.m1885a(dVar.f1544a, dVar.f1542F, dVar.mo1423l(), dVar.mo1422k(), dVar.f1551h, dVar.f1549f, dVar.f1552i, dVar.f1547d, dVar.f1548e, dVar.f1550g);
            if (dVar.f1539C != null) {
                a.contentView = dVar.f1539C;
            }
            return a;
        }
    }

    /* renamed from: android.support.v4.c.bc$p */
    static class C0285p extends C0283n {
        C0285p() {
        }

        /* renamed from: a */
        public Notification mo1464a(C0269d dVar, C0270e eVar) {
            return eVar.mo1424a(dVar, new C0305bk.C0306a(dVar.f1544a, dVar.f1542F, dVar.mo1423l(), dVar.mo1422k(), dVar.f1551h, dVar.f1549f, dVar.f1552i, dVar.f1547d, dVar.f1548e, dVar.f1550g, dVar.f1559p, dVar.f1560q, dVar.f1561r));
        }
    }

    /* renamed from: android.support.v4.c.bc$q */
    static class C0286q extends C0283n {
        C0286q() {
        }

        /* renamed from: a */
        public Notification mo1464a(C0269d dVar, C0270e eVar) {
            Bundle a;
            C0307bl.C0308a aVar = new C0307bl.C0308a(dVar.f1544a, dVar.f1542F, dVar.mo1423l(), dVar.mo1422k(), dVar.f1551h, dVar.f1549f, dVar.f1552i, dVar.f1547d, dVar.f1548e, dVar.f1550g, dVar.f1559p, dVar.f1560q, dVar.f1561r, dVar.f1555l, dVar.f1553j, dVar.f1557n, dVar.f1566w, dVar.f1568y, dVar.f1562s, dVar.f1563t, dVar.f1564u, dVar.f1539C, dVar.f1540D);
            C0261bc.m1578a((C0259ba) aVar, dVar.f1565v);
            C0261bc.m1579a((C0260bb) aVar, dVar.f1556m);
            Notification a2 = eVar.mo1424a(dVar, aVar);
            if (!(dVar.f1556m == null || (a = mo1465a(a2)) == null)) {
                dVar.f1556m.mo1454a(a);
            }
            return a2;
        }

        /* renamed from: a */
        public Bundle mo1465a(Notification notification) {
            return C0307bl.m1889a(notification);
        }

        /* renamed from: a */
        public C0262a mo1467a(Notification notification, int i) {
            return (C0262a) C0307bl.m1891a(notification, i, C0262a.f1506e, C0329bt.f1805c);
        }

        /* renamed from: a */
        public ArrayList<Parcelable> mo1469a(C0262a[] aVarArr) {
            return C0307bl.m1895a((C0298bh.C0299a[]) aVarArr);
        }

        /* renamed from: a */
        public C0262a[] mo1470a(ArrayList<Parcelable> arrayList) {
            return (C0262a[]) C0307bl.m1900a(arrayList, C0262a.f1506e, C0329bt.f1805c);
        }

        /* renamed from: b */
        public int mo1471b(Notification notification) {
            return C0307bl.m1901b(notification);
        }

        /* renamed from: d */
        public boolean mo1473d(Notification notification) {
            return C0307bl.m1902c(notification);
        }

        /* renamed from: e */
        public String mo1474e(Notification notification) {
            return C0307bl.m1903d(notification);
        }

        /* renamed from: f */
        public boolean mo1475f(Notification notification) {
            return C0307bl.m1904e(notification);
        }

        /* renamed from: g */
        public String mo1476g(Notification notification) {
            return C0307bl.m1905f(notification);
        }
    }

    /* renamed from: android.support.v4.c.bc$r */
    static class C0287r extends C0286q {
        C0287r() {
        }

        /* renamed from: a */
        public Notification mo1464a(C0269d dVar, C0270e eVar) {
            C0309bm.C0310a aVar = new C0309bm.C0310a(dVar.f1544a, dVar.f1542F, dVar.mo1423l(), dVar.mo1422k(), dVar.f1551h, dVar.f1549f, dVar.f1552i, dVar.f1547d, dVar.f1548e, dVar.f1550g, dVar.f1559p, dVar.f1560q, dVar.f1561r, dVar.f1554k, dVar.f1555l, dVar.f1553j, dVar.f1557n, dVar.f1566w, dVar.f1543G, dVar.f1568y, dVar.f1562s, dVar.f1563t, dVar.f1564u, dVar.f1539C, dVar.f1540D);
            C0261bc.m1578a((C0259ba) aVar, dVar.f1565v);
            C0261bc.m1579a((C0260bb) aVar, dVar.f1556m);
            return eVar.mo1424a(dVar, aVar);
        }

        /* renamed from: a */
        public Bundle mo1465a(Notification notification) {
            return C0309bm.m1910a(notification);
        }

        /* renamed from: a */
        public C0262a mo1467a(Notification notification, int i) {
            return (C0262a) C0309bm.m1911a(notification, i, C0262a.f1506e, C0329bt.f1805c);
        }

        /* renamed from: b */
        public int mo1471b(Notification notification) {
            return C0309bm.m1912b(notification);
        }

        /* renamed from: d */
        public boolean mo1473d(Notification notification) {
            return C0309bm.m1913c(notification);
        }

        /* renamed from: e */
        public String mo1474e(Notification notification) {
            return C0309bm.m1914d(notification);
        }

        /* renamed from: f */
        public boolean mo1475f(Notification notification) {
            return C0309bm.m1915e(notification);
        }

        /* renamed from: g */
        public String mo1476g(Notification notification) {
            return C0309bm.m1916f(notification);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: android.support.v4.c.bc$s */
    public @interface C0288s {
    }

    /* renamed from: android.support.v4.c.bc$t */
    public static abstract class C0289t {

        /* renamed from: e */
        C0269d f1606e;

        /* renamed from: f */
        CharSequence f1607f;

        /* renamed from: g */
        CharSequence f1608g;

        /* renamed from: h */
        boolean f1609h = false;

        @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
        /* renamed from: a */
        public void mo1454a(Bundle bundle) {
        }

        /* renamed from: a */
        public void mo1477a(C0269d dVar) {
            if (this.f1606e != dVar) {
                this.f1606e = dVar;
                if (this.f1606e != null) {
                    this.f1606e.mo1382a(this);
                }
            }
        }

        /* access modifiers changed from: protected */
        @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
        /* renamed from: b */
        public void mo1456b(Bundle bundle) {
        }

        /* renamed from: d */
        public Notification mo1478d() {
            if (this.f1606e != null) {
                return this.f1606e.mo1398c();
            }
            return null;
        }
    }

    /* renamed from: android.support.v4.c.bc$u */
    public static final class C0290u implements C0275g {

        /* renamed from: A */
        private static final int f1610A = 4;

        /* renamed from: B */
        private static final int f1611B = 8;

        /* renamed from: C */
        private static final int f1612C = 16;

        /* renamed from: D */
        private static final int f1613D = 32;

        /* renamed from: E */
        private static final int f1614E = 64;

        /* renamed from: F */
        private static final int f1615F = 1;

        /* renamed from: G */
        private static final int f1616G = 8388613;

        /* renamed from: H */
        private static final int f1617H = 80;

        /* renamed from: a */
        public static final int f1618a = -1;

        /* renamed from: b */
        public static final int f1619b = 0;

        /* renamed from: c */
        public static final int f1620c = 1;

        /* renamed from: d */
        public static final int f1621d = 2;

        /* renamed from: e */
        public static final int f1622e = 3;

        /* renamed from: f */
        public static final int f1623f = 4;

        /* renamed from: g */
        public static final int f1624g = 5;

        /* renamed from: h */
        public static final int f1625h = 0;

        /* renamed from: i */
        public static final int f1626i = -1;

        /* renamed from: j */
        private static final String f1627j = "android.wearable.EXTENSIONS";

        /* renamed from: k */
        private static final String f1628k = "actions";

        /* renamed from: l */
        private static final String f1629l = "flags";

        /* renamed from: m */
        private static final String f1630m = "displayIntent";

        /* renamed from: n */
        private static final String f1631n = "pages";

        /* renamed from: o */
        private static final String f1632o = "background";

        /* renamed from: p */
        private static final String f1633p = "contentIcon";

        /* renamed from: q */
        private static final String f1634q = "contentIconGravity";

        /* renamed from: r */
        private static final String f1635r = "contentActionIndex";

        /* renamed from: s */
        private static final String f1636s = "customSizePreset";

        /* renamed from: t */
        private static final String f1637t = "customContentHeight";

        /* renamed from: u */
        private static final String f1638u = "gravity";

        /* renamed from: v */
        private static final String f1639v = "hintScreenTimeout";

        /* renamed from: w */
        private static final String f1640w = "dismissalId";

        /* renamed from: x */
        private static final String f1641x = "bridgeTag";

        /* renamed from: y */
        private static final int f1642y = 1;

        /* renamed from: z */
        private static final int f1643z = 2;

        /* renamed from: I */
        private ArrayList<C0262a> f1644I = new ArrayList<>();

        /* renamed from: J */
        private int f1645J = 1;

        /* renamed from: K */
        private PendingIntent f1646K;

        /* renamed from: L */
        private ArrayList<Notification> f1647L = new ArrayList<>();

        /* renamed from: M */
        private Bitmap f1648M;

        /* renamed from: N */
        private int f1649N;

        /* renamed from: O */
        private int f1650O = 8388613;

        /* renamed from: P */
        private int f1651P = -1;

        /* renamed from: Q */
        private int f1652Q = 0;

        /* renamed from: R */
        private int f1653R;

        /* renamed from: S */
        private int f1654S = 80;

        /* renamed from: T */
        private int f1655T;

        /* renamed from: U */
        private String f1656U;

        /* renamed from: V */
        private String f1657V;

        public C0290u() {
        }

        public C0290u(Notification notification) {
            Bundle a = C0261bc.m1576a(notification);
            Bundle bundle = a != null ? a.getBundle(f1627j) : null;
            if (bundle != null) {
                C0262a[] a2 = C0261bc.f1480an.mo1470a((ArrayList<Parcelable>) bundle.getParcelableArrayList(f1628k));
                if (a2 != null) {
                    Collections.addAll(this.f1644I, a2);
                }
                this.f1645J = bundle.getInt(f1629l, 1);
                this.f1646K = (PendingIntent) bundle.getParcelable(f1630m);
                Notification[] a3 = C0261bc.m1580a(bundle, f1631n);
                if (a3 != null) {
                    Collections.addAll(this.f1647L, a3);
                }
                this.f1648M = (Bitmap) bundle.getParcelable(f1632o);
                this.f1649N = bundle.getInt(f1633p);
                this.f1650O = bundle.getInt(f1634q, 8388613);
                this.f1651P = bundle.getInt(f1635r, -1);
                this.f1652Q = bundle.getInt(f1636s, 0);
                this.f1653R = bundle.getInt(f1637t);
                this.f1654S = bundle.getInt(f1638u, 80);
                this.f1655T = bundle.getInt(f1639v);
                this.f1656U = bundle.getString(f1640w);
                this.f1657V = bundle.getString(f1641x);
            }
        }

        /* renamed from: a */
        private void m1796a(int i, boolean z) {
            if (z) {
                this.f1645J |= i;
            } else {
                this.f1645J &= i ^ -1;
            }
        }

        /* renamed from: a */
        public C0269d mo1426a(C0269d dVar) {
            Bundle bundle = new Bundle();
            if (!this.f1644I.isEmpty()) {
                bundle.putParcelableArrayList(f1628k, C0261bc.f1480an.mo1469a((C0262a[]) this.f1644I.toArray(new C0262a[this.f1644I.size()])));
            }
            if (this.f1645J != 1) {
                bundle.putInt(f1629l, this.f1645J);
            }
            if (this.f1646K != null) {
                bundle.putParcelable(f1630m, this.f1646K);
            }
            if (!this.f1647L.isEmpty()) {
                bundle.putParcelableArray(f1631n, (Parcelable[]) this.f1647L.toArray(new Notification[this.f1647L.size()]));
            }
            if (this.f1648M != null) {
                bundle.putParcelable(f1632o, this.f1648M);
            }
            if (this.f1649N != 0) {
                bundle.putInt(f1633p, this.f1649N);
            }
            if (this.f1650O != 8388613) {
                bundle.putInt(f1634q, this.f1650O);
            }
            if (this.f1651P != -1) {
                bundle.putInt(f1635r, this.f1651P);
            }
            if (this.f1652Q != 0) {
                bundle.putInt(f1636s, this.f1652Q);
            }
            if (this.f1653R != 0) {
                bundle.putInt(f1637t, this.f1653R);
            }
            if (this.f1654S != 80) {
                bundle.putInt(f1638u, this.f1654S);
            }
            if (this.f1655T != 0) {
                bundle.putInt(f1639v, this.f1655T);
            }
            if (this.f1656U != null) {
                bundle.putString(f1640w, this.f1656U);
            }
            if (this.f1657V != null) {
                bundle.putString(f1641x, this.f1657V);
            }
            dVar.mo1366a().putBundle(f1627j, bundle);
            return dVar;
        }

        /* renamed from: a */
        public C0290u clone() {
            C0290u uVar = new C0290u();
            uVar.f1644I = new ArrayList<>(this.f1644I);
            uVar.f1645J = this.f1645J;
            uVar.f1646K = this.f1646K;
            uVar.f1647L = new ArrayList<>(this.f1647L);
            uVar.f1648M = this.f1648M;
            uVar.f1649N = this.f1649N;
            uVar.f1650O = this.f1650O;
            uVar.f1651P = this.f1651P;
            uVar.f1652Q = this.f1652Q;
            uVar.f1653R = this.f1653R;
            uVar.f1654S = this.f1654S;
            uVar.f1655T = this.f1655T;
            uVar.f1656U = this.f1656U;
            uVar.f1657V = this.f1657V;
            return uVar;
        }

        /* renamed from: a */
        public C0290u mo1480a(int i) {
            this.f1649N = i;
            return this;
        }

        /* renamed from: a */
        public C0290u mo1481a(Notification notification) {
            this.f1647L.add(notification);
            return this;
        }

        /* renamed from: a */
        public C0290u mo1482a(PendingIntent pendingIntent) {
            this.f1646K = pendingIntent;
            return this;
        }

        /* renamed from: a */
        public C0290u mo1483a(Bitmap bitmap) {
            this.f1648M = bitmap;
            return this;
        }

        /* renamed from: a */
        public C0290u mo1484a(C0262a aVar) {
            this.f1644I.add(aVar);
            return this;
        }

        /* renamed from: a */
        public C0290u mo1485a(String str) {
            this.f1656U = str;
            return this;
        }

        /* renamed from: a */
        public C0290u mo1486a(List<C0262a> list) {
            this.f1644I.addAll(list);
            return this;
        }

        /* renamed from: a */
        public C0290u mo1487a(boolean z) {
            m1796a(8, z);
            return this;
        }

        /* renamed from: b */
        public C0290u mo1488b() {
            this.f1644I.clear();
            return this;
        }

        /* renamed from: b */
        public C0290u mo1489b(int i) {
            this.f1650O = i;
            return this;
        }

        /* renamed from: b */
        public C0290u mo1490b(String str) {
            this.f1657V = str;
            return this;
        }

        /* renamed from: b */
        public C0290u mo1491b(List<Notification> list) {
            this.f1647L.addAll(list);
            return this;
        }

        /* renamed from: b */
        public C0290u mo1492b(boolean z) {
            m1796a(1, z);
            return this;
        }

        /* renamed from: c */
        public C0290u mo1493c(int i) {
            this.f1651P = i;
            return this;
        }

        /* renamed from: c */
        public C0290u mo1494c(boolean z) {
            m1796a(2, z);
            return this;
        }

        /* renamed from: c */
        public List<C0262a> mo1495c() {
            return this.f1644I;
        }

        /* renamed from: d */
        public PendingIntent mo1497d() {
            return this.f1646K;
        }

        /* renamed from: d */
        public C0290u mo1498d(int i) {
            this.f1654S = i;
            return this;
        }

        /* renamed from: d */
        public C0290u mo1499d(boolean z) {
            m1796a(4, z);
            return this;
        }

        /* renamed from: e */
        public C0290u mo1500e() {
            this.f1647L.clear();
            return this;
        }

        /* renamed from: e */
        public C0290u mo1501e(int i) {
            this.f1652Q = i;
            return this;
        }

        /* renamed from: e */
        public C0290u mo1502e(boolean z) {
            m1796a(16, z);
            return this;
        }

        /* renamed from: f */
        public C0290u mo1503f(int i) {
            this.f1653R = i;
            return this;
        }

        /* renamed from: f */
        public C0290u mo1504f(boolean z) {
            m1796a(32, z);
            return this;
        }

        /* renamed from: f */
        public List<Notification> mo1505f() {
            return this.f1647L;
        }

        /* renamed from: g */
        public Bitmap mo1506g() {
            return this.f1648M;
        }

        /* renamed from: g */
        public C0290u mo1507g(int i) {
            this.f1655T = i;
            return this;
        }

        /* renamed from: g */
        public C0290u mo1508g(boolean z) {
            m1796a(64, z);
            return this;
        }

        /* renamed from: h */
        public int mo1509h() {
            return this.f1649N;
        }

        /* renamed from: i */
        public int mo1510i() {
            return this.f1650O;
        }

        /* renamed from: j */
        public int mo1511j() {
            return this.f1651P;
        }

        /* renamed from: k */
        public int mo1512k() {
            return this.f1654S;
        }

        /* renamed from: l */
        public int mo1513l() {
            return this.f1652Q;
        }

        /* renamed from: m */
        public int mo1514m() {
            return this.f1653R;
        }

        /* renamed from: n */
        public boolean mo1515n() {
            return (this.f1645J & 8) != 0;
        }

        /* renamed from: o */
        public boolean mo1516o() {
            return (this.f1645J & 1) != 0;
        }

        /* renamed from: p */
        public boolean mo1517p() {
            return (this.f1645J & 2) != 0;
        }

        /* renamed from: q */
        public boolean mo1518q() {
            return (this.f1645J & 4) != 0;
        }

        /* renamed from: r */
        public boolean mo1519r() {
            return (this.f1645J & 16) != 0;
        }

        /* renamed from: s */
        public int mo1520s() {
            return this.f1655T;
        }

        /* renamed from: t */
        public boolean mo1521t() {
            return (this.f1645J & 32) != 0;
        }

        /* renamed from: u */
        public boolean mo1522u() {
            return (this.f1645J & 64) != 0;
        }

        /* renamed from: v */
        public String mo1523v() {
            return this.f1656U;
        }

        /* renamed from: w */
        public String mo1524w() {
            return this.f1657V;
        }
    }

    static {
        if (C0798c.m4072a()) {
            f1480an = new C0282m();
        } else if (Build.VERSION.SDK_INT >= 21) {
            f1480an = new C0281l();
        } else if (Build.VERSION.SDK_INT >= 20) {
            f1480an = new C0280k();
        } else if (Build.VERSION.SDK_INT >= 19) {
            f1480an = new C0287r();
        } else if (Build.VERSION.SDK_INT >= 16) {
            f1480an = new C0286q();
        } else if (Build.VERSION.SDK_INT >= 14) {
            f1480an = new C0285p();
        } else if (Build.VERSION.SDK_INT >= 11) {
            f1480an = new C0284o();
        } else {
            f1480an = new C0283n();
        }
    }

    /* renamed from: a */
    public static Bundle m1576a(Notification notification) {
        return f1480an.mo1465a(notification);
    }

    /* renamed from: a */
    public static C0262a m1577a(Notification notification, int i) {
        return f1480an.mo1467a(notification, i);
    }

    /* renamed from: a */
    static void m1578a(C0259ba baVar, ArrayList<C0262a> arrayList) {
        Iterator<C0262a> it = arrayList.iterator();
        while (it.hasNext()) {
            baVar.mo1325a(it.next());
        }
    }

    /* renamed from: a */
    static void m1579a(C0260bb bbVar, C0289t tVar) {
        if (tVar == null) {
            return;
        }
        if (tVar instanceof C0268c) {
            C0268c cVar = (C0268c) tVar;
            C0307bl.m1897a(bbVar, cVar.f1607f, cVar.f1609h, cVar.f1608g, cVar.f1535a);
        } else if (tVar instanceof C0276h) {
            C0276h hVar = (C0276h) tVar;
            C0307bl.m1898a(bbVar, hVar.f1607f, hVar.f1609h, hVar.f1608g, hVar.f1591a);
        } else if (tVar instanceof C0267b) {
            C0267b bVar = (C0267b) tVar;
            C0307bl.m1896a(bbVar, bVar.f1607f, bVar.f1609h, bVar.f1608g, bVar.f1532a, bVar.f1533b, bVar.f1534c);
        }
    }

    /* renamed from: a */
    static Notification[] m1580a(Bundle bundle, String str) {
        Parcelable[] parcelableArray = bundle.getParcelableArray(str);
        if ((parcelableArray instanceof Notification[]) || parcelableArray == null) {
            return (Notification[]) parcelableArray;
        }
        Notification[] notificationArr = new Notification[parcelableArray.length];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < parcelableArray.length) {
                notificationArr[i2] = (Notification) parcelableArray[i2];
                i = i2 + 1;
            } else {
                bundle.putParcelableArray(str, notificationArr);
                return notificationArr;
            }
        }
    }

    /* renamed from: b */
    public static int m1581b(Notification notification) {
        return f1480an.mo1471b(notification);
    }

    /* renamed from: b */
    static void m1582b(C0260bb bbVar, C0289t tVar) {
        if (tVar == null) {
            return;
        }
        if (tVar instanceof C0277i) {
            C0277i iVar = (C0277i) tVar;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            for (C0277i.C0278a next : iVar.f1595d) {
                arrayList.add(next.mo1459a());
                arrayList2.add(Long.valueOf(next.mo1460b()));
                arrayList3.add(next.mo1461c());
                arrayList4.add(next.mo1462d());
                arrayList5.add(next.mo1463e());
            }
            C0296bg.m1864a(bbVar, iVar.f1593b, iVar.f1594c, arrayList, arrayList2, arrayList3, arrayList4, arrayList5);
            return;
        }
        m1579a(bbVar, tVar);
    }

    /* renamed from: c */
    public static String m1583c(Notification notification) {
        return f1480an.mo1472c(notification);
    }

    /* renamed from: d */
    public static boolean m1584d(Notification notification) {
        return f1480an.mo1473d(notification);
    }

    /* renamed from: e */
    public static String m1585e(Notification notification) {
        return f1480an.mo1474e(notification);
    }

    /* renamed from: f */
    public static boolean m1586f(Notification notification) {
        return f1480an.mo1475f(notification);
    }

    /* renamed from: g */
    public static String m1587g(Notification notification) {
        return f1480an.mo1476g(notification);
    }
}
