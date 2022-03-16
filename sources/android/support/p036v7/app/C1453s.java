package android.support.p036v7.app;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.C0007ae;
import android.support.annotation.C0011ag;
import android.support.p010v4.p013c.C0260bb;
import android.support.p010v4.p013c.C0261bc;
import android.support.p010v4.p013c.C0411y;
import android.support.p010v4.p025i.p026a.C0618h;
import android.support.p010v4.p031n.C0849a;
import android.support.p010v4.view.C1040ar;
import android.support.p036v7.p037a.C1359b;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v7.app.s */
public class C1453s extends C0261bc {

    /* renamed from: android.support.v7.app.s$a */
    private static class C1455a extends C0261bc.C0270e {
        private C1455a() {
        }

        /* renamed from: a */
        public Notification mo1424a(C0261bc.C0269d dVar, C0260bb bbVar) {
            C1453s.m8554e(bbVar, dVar);
            return bbVar.mo1327b();
        }
    }

    /* renamed from: android.support.v7.app.s$b */
    public static class C1456b extends C0261bc.C0269d {
        public C1456b(Context context) {
            super(context);
        }

        /* access modifiers changed from: protected */
        @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
        /* renamed from: d */
        public C0261bc.C0270e mo1409d() {
            return Build.VERSION.SDK_INT >= 24 ? new C1455a() : Build.VERSION.SDK_INT >= 21 ? new C1461g() : Build.VERSION.SDK_INT >= 16 ? new C1460f() : Build.VERSION.SDK_INT >= 14 ? new C1459e() : super.mo1409d();
        }

        /* access modifiers changed from: protected */
        @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
        /* renamed from: k */
        public CharSequence mo1422k() {
            if (this.f1556m instanceof C0261bc.C0277i) {
                C0261bc.C0277i iVar = (C0261bc.C0277i) this.f1556m;
                C0261bc.C0277i.C0278a a = C1453s.m8545b(iVar);
                CharSequence b = iVar.mo1455b();
                if (a != null) {
                    return b != null ? C1453s.m8547b(this, iVar, a) : a.mo1459a();
                }
            }
            return super.mo1422k();
        }

        /* access modifiers changed from: protected */
        @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
        /* renamed from: l */
        public CharSequence mo1423l() {
            if (this.f1556m instanceof C0261bc.C0277i) {
                C0261bc.C0277i iVar = (C0261bc.C0277i) this.f1556m;
                C0261bc.C0277i.C0278a a = C1453s.m8545b(iVar);
                CharSequence b = iVar.mo1455b();
                if (!(b == null && a == null)) {
                    return b != null ? b : a.mo1461c();
                }
            }
            return super.mo1423l();
        }
    }

    /* renamed from: android.support.v7.app.s$c */
    public static class C1457c extends C0261bc.C0289t {
    }

    /* renamed from: android.support.v7.app.s$d */
    public static class C1458d extends C1462h {
    }

    /* renamed from: android.support.v7.app.s$e */
    private static class C1459e extends C0261bc.C0270e {
        C1459e() {
        }

        /* renamed from: a */
        public Notification mo1424a(C0261bc.C0269d dVar, C0260bb bbVar) {
            RemoteViews a = C1453s.m8560h(bbVar, dVar);
            Notification b = bbVar.mo1327b();
            if (a != null) {
                b.contentView = a;
            } else if (dVar.mo1413e() != null) {
                b.contentView = dVar.mo1413e();
            }
            return b;
        }
    }

    /* renamed from: android.support.v7.app.s$f */
    private static class C1460f extends C0261bc.C0270e {
        C1460f() {
        }

        /* renamed from: a */
        public Notification mo1424a(C0261bc.C0269d dVar, C0260bb bbVar) {
            RemoteViews b = C1453s.m8557g(bbVar, dVar);
            Notification b2 = bbVar.mo1327b();
            if (b != null) {
                b2.contentView = b;
            }
            C1453s.m8551d(b2, dVar);
            return b2;
        }
    }

    /* renamed from: android.support.v7.app.s$g */
    private static class C1461g extends C0261bc.C0270e {
        C1461g() {
        }

        /* renamed from: a */
        public Notification mo1424a(C0261bc.C0269d dVar, C0260bb bbVar) {
            RemoteViews c = C1453s.m8555f(bbVar, dVar);
            Notification b = bbVar.mo1327b();
            if (c != null) {
                b.contentView = c;
            }
            C1453s.m8558g(b, dVar);
            C1453s.m8561h(b, dVar);
            return b;
        }
    }

    /* renamed from: android.support.v7.app.s$h */
    public static class C1462h extends C0261bc.C0289t {

        /* renamed from: a */
        int[] f4540a = null;

        /* renamed from: b */
        C0618h.C0640i f4541b;

        /* renamed from: c */
        boolean f4542c;

        /* renamed from: d */
        PendingIntent f4543d;

        public C1462h() {
        }

        public C1462h(C0261bc.C0269d dVar) {
            mo1477a(dVar);
        }

        /* renamed from: a */
        public C1462h mo4968a(PendingIntent pendingIntent) {
            this.f4543d = pendingIntent;
            return this;
        }

        /* renamed from: a */
        public C1462h mo4969a(C0618h.C0640i iVar) {
            this.f4541b = iVar;
            return this;
        }

        /* renamed from: a */
        public C1462h mo4970a(boolean z) {
            this.f4542c = z;
            return this;
        }

        /* renamed from: a */
        public C1462h mo4971a(int... iArr) {
            this.f4540a = iArr;
            return this;
        }
    }

    /* renamed from: a */
    private static TextAppearanceSpan m8537a(int i) {
        return new TextAppearanceSpan((String) null, 0, 0, ColorStateList.valueOf(i), (ColorStateList) null);
    }

    /* renamed from: a */
    private static RemoteViews m8539a(C0261bc.C0269d dVar) {
        if (dVar.mo1413e() == null) {
            return null;
        }
        RemoteViews a = C1465v.m8586a(dVar.f1544a, dVar.f1545b, dVar.f1546c, dVar.f1551h, dVar.f1552i, dVar.f1542F.icon, dVar.f1550g, dVar.f1557n, dVar.f1555l, dVar.mo1419h(), dVar.mo1420i(), dVar.mo1421j(), C1359b.C1368i.notification_template_custom_big, false, (ArrayList<C0261bc.C0262a>) null);
        C1465v.m8591a(dVar.f1544a, a, dVar.mo1413e());
        return a;
    }

    /* renamed from: a */
    private static void m8542a(Context context, RemoteViews remoteViews, int i) {
        if (i == 0) {
            i = context.getResources().getColor(C1359b.C1363d.notification_material_background_media_default_color);
        }
        remoteViews.setInt(C1359b.C1366g.status_bar_latest_event_content, "setBackgroundColor", i);
    }

    /* renamed from: a */
    private static void m8543a(C0261bc.C0277i iVar, C0260bb bbVar, C0261bc.C0269d dVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        List<C0261bc.C0277i.C0278a> c = iVar.mo1457c();
        boolean z = iVar.mo1455b() != null || m8544a(iVar.mo1457c());
        for (int size = c.size() - 1; size >= 0; size--) {
            C0261bc.C0277i.C0278a aVar = c.get(size);
            CharSequence b = z ? m8547b(dVar, iVar, aVar) : aVar.mo1459a();
            if (size != c.size() - 1) {
                spannableStringBuilder.insert(0, "\n");
            }
            spannableStringBuilder.insert(0, b);
        }
        C1466w.m8594a(bbVar, spannableStringBuilder);
    }

    /* renamed from: a */
    private static boolean m8544a(List<C0261bc.C0277i.C0278a> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            if (list.get(size).mo1461c() == null) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static C0261bc.C0277i.C0278a m8545b(C0261bc.C0277i iVar) {
        List<C0261bc.C0277i.C0278a> c = iVar.mo1457c();
        for (int size = c.size() - 1; size >= 0; size--) {
            C0261bc.C0277i.C0278a aVar = c.get(size);
            if (!TextUtils.isEmpty(aVar.mo1461c())) {
                return aVar;
            }
        }
        if (!c.isEmpty()) {
            return c.get(c.size() - 1);
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static CharSequence m8547b(C0261bc.C0269d dVar, C0261bc.C0277i iVar, C0261bc.C0277i.C0278a aVar) {
        int i;
        CharSequence charSequence;
        C0849a a = C0849a.m4270a();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean z = Build.VERSION.SDK_INT >= 21;
        int i2 = (z || Build.VERSION.SDK_INT <= 10) ? C1040ar.f3485s : -1;
        CharSequence c = aVar.mo1461c();
        if (TextUtils.isEmpty(aVar.mo1461c())) {
            String a2 = iVar.mo1453a() == null ? "" : iVar.mo1453a();
            if (z && dVar.mo1421j() != 0) {
                i2 = dVar.mo1421j();
            }
            CharSequence charSequence2 = a2;
            i = i2;
            charSequence = charSequence2;
        } else {
            CharSequence charSequence3 = c;
            i = i2;
            charSequence = charSequence3;
        }
        CharSequence b = a.mo2765b(charSequence);
        spannableStringBuilder.append(b);
        spannableStringBuilder.setSpan(m8537a(i), spannableStringBuilder.length() - b.length(), spannableStringBuilder.length(), 33);
        spannableStringBuilder.append("  ").append(a.mo2765b(aVar.mo1459a() == null ? "" : aVar.mo1459a()));
        return spannableStringBuilder;
    }

    /* access modifiers changed from: private */
    @C0007ae(mo1a = 16)
    @TargetApi(16)
    /* renamed from: d */
    public static void m8551d(Notification notification, C0261bc.C0269d dVar) {
        if (dVar.f1556m instanceof C1462h) {
            C1462h hVar = (C1462h) dVar.f1556m;
            RemoteViews f = dVar.mo1416f() != null ? dVar.mo1416f() : dVar.mo1413e();
            boolean z = (dVar.f1556m instanceof C1458d) && f != null;
            C1465v.m8590a(notification, dVar.f1544a, dVar.f1545b, dVar.f1546c, dVar.f1551h, dVar.f1552i, dVar.f1550g, dVar.f1557n, dVar.f1555l, dVar.mo1419h(), dVar.mo1420i(), 0, dVar.f1565v, hVar.f4542c, hVar.f4543d, z);
            if (z) {
                C1465v.m8591a(dVar.f1544a, notification.bigContentView, f);
            }
        } else if (dVar.f1556m instanceof C1457c) {
            m8553e(notification, dVar);
        }
    }

    @C0007ae(mo1a = 16)
    @TargetApi(16)
    /* renamed from: e */
    private static void m8553e(Notification notification, C0261bc.C0269d dVar) {
        RemoteViews f = dVar.mo1416f();
        if (f == null) {
            f = dVar.mo1413e();
        }
        if (f != null) {
            RemoteViews a = C1465v.m8586a(dVar.f1544a, dVar.f1545b, dVar.f1546c, dVar.f1551h, dVar.f1552i, notification.icon, dVar.f1550g, dVar.f1557n, dVar.f1555l, dVar.mo1419h(), dVar.mo1420i(), dVar.mo1421j(), C1359b.C1368i.notification_template_custom_big, false, dVar.f1565v);
            C1465v.m8591a(dVar.f1544a, a, f);
            notification.bigContentView = a;
        }
    }

    /* access modifiers changed from: private */
    @C0007ae(mo1a = 24)
    @TargetApi(24)
    /* renamed from: e */
    public static void m8554e(C0260bb bbVar, C0261bc.C0269d dVar) {
        if (dVar.f1556m instanceof C1457c) {
            C1464u.m8574a(bbVar);
        } else if (dVar.f1556m instanceof C1458d) {
            C1464u.m8575b(bbVar);
        } else if (!(dVar.f1556m instanceof C0261bc.C0277i)) {
            m8555f(bbVar, dVar);
        }
    }

    /* access modifiers changed from: private */
    @C0007ae(mo1a = 21)
    @TargetApi(21)
    /* renamed from: f */
    public static RemoteViews m8555f(C0260bb bbVar, C0261bc.C0269d dVar) {
        if (!(dVar.f1556m instanceof C1462h)) {
            return dVar.f1556m instanceof C1457c ? m8539a(dVar) : m8557g(bbVar, dVar);
        }
        C1462h hVar = (C1462h) dVar.f1556m;
        C1463t.m8573a(bbVar, hVar.f4540a, hVar.f4541b != null ? hVar.f4541b.mo2341a() : null);
        boolean z = dVar.mo1413e() != null;
        boolean z2 = z || ((Build.VERSION.SDK_INT >= 21 && Build.VERSION.SDK_INT <= 23) && dVar.mo1416f() != null);
        if (!(dVar.f1556m instanceof C1458d) || !z2) {
            return null;
        }
        RemoteViews a = C1465v.m8589a(bbVar, dVar.f1544a, dVar.f1545b, dVar.f1546c, dVar.f1551h, dVar.f1552i, dVar.f1550g, dVar.f1557n, dVar.f1555l, dVar.mo1419h(), dVar.mo1420i(), dVar.f1565v, hVar.f4540a, false, (PendingIntent) null, z);
        if (z) {
            C1465v.m8591a(dVar.f1544a, a, dVar.mo1413e());
        }
        m8542a(dVar.f1544a, a, dVar.mo1421j());
        return a;
    }

    @C0007ae(mo1a = 21)
    @TargetApi(21)
    /* renamed from: f */
    private static void m8556f(Notification notification, C0261bc.C0269d dVar) {
        RemoteViews g = dVar.mo1418g();
        RemoteViews e = g != null ? g : dVar.mo1413e();
        if (g != null) {
            RemoteViews a = C1465v.m8586a(dVar.f1544a, dVar.f1545b, dVar.f1546c, dVar.f1551h, dVar.f1552i, notification.icon, dVar.f1550g, dVar.f1557n, dVar.f1555l, dVar.mo1419h(), dVar.mo1420i(), dVar.mo1421j(), C1359b.C1368i.notification_template_custom_big, false, dVar.f1565v);
            C1465v.m8591a(dVar.f1544a, a, e);
            notification.headsUpContentView = a;
        }
    }

    /* access modifiers changed from: private */
    @C0007ae(mo1a = 16)
    @TargetApi(16)
    /* renamed from: g */
    public static RemoteViews m8557g(C0260bb bbVar, C0261bc.C0269d dVar) {
        if (dVar.f1556m instanceof C0261bc.C0277i) {
            m8543a((C0261bc.C0277i) dVar.f1556m, bbVar, dVar);
        }
        return m8560h(bbVar, dVar);
    }

    /* access modifiers changed from: private */
    @C0007ae(mo1a = 21)
    @TargetApi(21)
    /* renamed from: g */
    public static void m8558g(Notification notification, C0261bc.C0269d dVar) {
        RemoteViews f = dVar.mo1416f() != null ? dVar.mo1416f() : dVar.mo1413e();
        if ((dVar.f1556m instanceof C1458d) && f != null) {
            C1465v.m8590a(notification, dVar.f1544a, dVar.f1545b, dVar.f1546c, dVar.f1551h, dVar.f1552i, dVar.f1550g, dVar.f1557n, dVar.f1555l, dVar.mo1419h(), dVar.mo1420i(), 0, dVar.f1565v, false, (PendingIntent) null, true);
            C1465v.m8591a(dVar.f1544a, notification.bigContentView, f);
            m8542a(dVar.f1544a, notification.bigContentView, dVar.mo1421j());
        } else if (dVar.f1556m instanceof C1457c) {
            m8553e(notification, dVar);
        }
    }

    /* renamed from: h */
    public static C0618h.C0640i m8559h(Notification notification) {
        Bundle a = m1576a(notification);
        if (a != null) {
            if (Build.VERSION.SDK_INT >= 21) {
                Parcelable parcelable = a.getParcelable(C0261bc.f1455P);
                if (parcelable != null) {
                    return C0618h.C0640i.m3565a(parcelable);
                }
            } else {
                IBinder a2 = C0411y.m2301a(a, C0261bc.f1455P);
                if (a2 != null) {
                    Parcel obtain = Parcel.obtain();
                    obtain.writeStrongBinder(a2);
                    obtain.setDataPosition(0);
                    C0618h.C0640i createFromParcel = C0618h.C0640i.CREATOR.createFromParcel(obtain);
                    obtain.recycle();
                    return createFromParcel;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    @C0007ae(mo1a = 14)
    @TargetApi(14)
    /* renamed from: h */
    public static RemoteViews m8560h(C0260bb bbVar, C0261bc.C0269d dVar) {
        if (dVar.f1556m instanceof C1462h) {
            C1462h hVar = (C1462h) dVar.f1556m;
            boolean z = (dVar.f1556m instanceof C1458d) && dVar.mo1413e() != null;
            RemoteViews a = C1465v.m8589a(bbVar, dVar.f1544a, dVar.f1545b, dVar.f1546c, dVar.f1551h, dVar.f1552i, dVar.f1550g, dVar.f1557n, dVar.f1555l, dVar.mo1419h(), dVar.mo1420i(), dVar.f1565v, hVar.f4540a, hVar.f4542c, hVar.f4543d, z);
            if (z) {
                C1465v.m8591a(dVar.f1544a, a, dVar.mo1413e());
                return a;
            }
        } else if (dVar.f1556m instanceof C1457c) {
            return m8539a(dVar);
        }
        return null;
    }

    /* access modifiers changed from: private */
    @C0007ae(mo1a = 21)
    @TargetApi(21)
    /* renamed from: h */
    public static void m8561h(Notification notification, C0261bc.C0269d dVar) {
        RemoteViews g = dVar.mo1418g() != null ? dVar.mo1418g() : dVar.mo1413e();
        if ((dVar.f1556m instanceof C1458d) && g != null) {
            notification.headsUpContentView = C1465v.m8587a(dVar.f1544a, dVar.f1545b, dVar.f1546c, dVar.f1551h, dVar.f1552i, dVar.f1550g, dVar.f1557n, dVar.f1555l, dVar.mo1419h(), dVar.mo1420i(), 0, dVar.f1565v, false, (PendingIntent) null, true);
            C1465v.m8591a(dVar.f1544a, notification.headsUpContentView, g);
            m8542a(dVar.f1544a, notification.headsUpContentView, dVar.mo1421j());
        } else if (dVar.f1556m instanceof C1457c) {
            m8556f(notification, dVar);
        }
    }
}
