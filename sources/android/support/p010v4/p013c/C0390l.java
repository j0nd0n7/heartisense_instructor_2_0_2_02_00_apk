package android.support.p010v4.p013c;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.C0003aa;
import android.support.annotation.C0007ae;
import android.support.p010v4.p033o.C0894l;
import android.view.View;

/* renamed from: android.support.v4.c.l */
public class C0390l {

    /* renamed from: a */
    public static final String f1869a = "android.activity.usage_time";

    /* renamed from: b */
    public static final String f1870b = "android.usage_time_packages";

    @C0007ae(mo1a = 21)
    @TargetApi(21)
    /* renamed from: android.support.v4.c.l$a */
    private static class C0391a extends C0390l {

        /* renamed from: c */
        private final C0395m f1871c;

        C0391a(C0395m mVar) {
            this.f1871c = mVar;
        }

        /* renamed from: a */
        public void mo1663a(C0390l lVar) {
            if (lVar instanceof C0391a) {
                this.f1871c.mo1666a(((C0391a) lVar).f1871c);
            }
        }

        /* renamed from: d */
        public Bundle mo1665d() {
            return this.f1871c.mo1667b();
        }
    }

    @C0007ae(mo1a = 23)
    @TargetApi(23)
    /* renamed from: android.support.v4.c.l$b */
    private static class C0392b extends C0390l {

        /* renamed from: c */
        private final C0396n f1872c;

        C0392b(C0396n nVar) {
            this.f1872c = nVar;
        }

        /* renamed from: a */
        public void mo1662a(PendingIntent pendingIntent) {
            this.f1872c.mo1668a(pendingIntent);
        }

        /* renamed from: a */
        public void mo1663a(C0390l lVar) {
            if (lVar instanceof C0392b) {
                this.f1872c.mo1669a(((C0392b) lVar).f1872c);
            }
        }

        /* renamed from: d */
        public Bundle mo1665d() {
            return this.f1872c.mo1670c();
        }
    }

    @C0007ae(mo1a = 24)
    @TargetApi(24)
    /* renamed from: android.support.v4.c.l$c */
    private static class C0393c extends C0390l {

        /* renamed from: c */
        private final C0397o f1873c;

        C0393c(C0397o oVar) {
            this.f1873c = oVar;
        }

        /* renamed from: a */
        public C0390l mo1661a(@C0003aa Rect rect) {
            return new C0393c(this.f1873c.mo1671a(rect));
        }

        /* renamed from: a */
        public void mo1662a(PendingIntent pendingIntent) {
            this.f1873c.mo1672a(pendingIntent);
        }

        /* renamed from: a */
        public void mo1663a(C0390l lVar) {
            if (lVar instanceof C0393c) {
                this.f1873c.mo1673a(((C0393c) lVar).f1873c);
            }
        }

        /* renamed from: c */
        public Rect mo1664c() {
            return this.f1873c.mo1674c();
        }

        /* renamed from: d */
        public Bundle mo1665d() {
            return this.f1873c.mo1675d();
        }
    }

    @C0007ae(mo1a = 16)
    @TargetApi(16)
    /* renamed from: android.support.v4.c.l$d */
    private static class C0394d extends C0390l {

        /* renamed from: c */
        private final C0398p f1874c;

        C0394d(C0398p pVar) {
            this.f1874c = pVar;
        }

        /* renamed from: a */
        public void mo1663a(C0390l lVar) {
            if (lVar instanceof C0394d) {
                this.f1874c.mo1677a(((C0394d) lVar).f1874c);
            }
        }

        /* renamed from: d */
        public Bundle mo1665d() {
            return this.f1874c.mo1676a();
        }
    }

    protected C0390l() {
    }

    /* renamed from: a */
    public static C0390l m2168a() {
        return Build.VERSION.SDK_INT >= 24 ? new C0393c(C0397o.m2212a()) : Build.VERSION.SDK_INT >= 23 ? new C0392b(C0396n.m2201a()) : Build.VERSION.SDK_INT >= 21 ? new C0391a(C0395m.m2193a()) : new C0390l();
    }

    /* renamed from: a */
    public static C0390l m2169a(Activity activity, View view, String str) {
        return Build.VERSION.SDK_INT >= 24 ? new C0393c(C0397o.m2213a(activity, view, str)) : Build.VERSION.SDK_INT >= 23 ? new C0392b(C0396n.m2202a(activity, view, str)) : Build.VERSION.SDK_INT >= 21 ? new C0391a(C0395m.m2194a(activity, view, str)) : new C0390l();
    }

    /* renamed from: a */
    public static C0390l m2170a(Activity activity, C0894l<View, String>... lVarArr) {
        View[] viewArr;
        String[] strArr = null;
        if (Build.VERSION.SDK_INT < 21) {
            return new C0390l();
        }
        if (lVarArr != null) {
            View[] viewArr2 = new View[lVarArr.length];
            String[] strArr2 = new String[lVarArr.length];
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= lVarArr.length) {
                    break;
                }
                viewArr2[i2] = (View) lVarArr[i2].f3081a;
                strArr2[i2] = (String) lVarArr[i2].f3082b;
                i = i2 + 1;
            }
            strArr = strArr2;
            viewArr = viewArr2;
        } else {
            viewArr = null;
        }
        return Build.VERSION.SDK_INT >= 24 ? new C0393c(C0397o.m2214a(activity, viewArr, strArr)) : Build.VERSION.SDK_INT >= 23 ? new C0392b(C0396n.m2203a(activity, viewArr, strArr)) : new C0391a(C0395m.m2195a(activity, viewArr, strArr));
    }

    /* renamed from: a */
    public static C0390l m2171a(Context context, int i, int i2) {
        return Build.VERSION.SDK_INT >= 24 ? new C0393c(C0397o.m2215a(context, i, i2)) : Build.VERSION.SDK_INT >= 23 ? new C0392b(C0396n.m2204a(context, i, i2)) : Build.VERSION.SDK_INT >= 21 ? new C0391a(C0395m.m2196a(context, i, i2)) : Build.VERSION.SDK_INT >= 16 ? new C0394d(C0398p.m2225a(context, i, i2)) : new C0390l();
    }

    /* renamed from: a */
    public static C0390l m2172a(View view, int i, int i2, int i3, int i4) {
        return Build.VERSION.SDK_INT >= 24 ? new C0393c(C0397o.m2216a(view, i, i2, i3, i4)) : Build.VERSION.SDK_INT >= 23 ? new C0392b(C0396n.m2205a(view, i, i2, i3, i4)) : Build.VERSION.SDK_INT >= 21 ? new C0391a(C0395m.m2197a(view, i, i2, i3, i4)) : Build.VERSION.SDK_INT >= 16 ? new C0394d(C0398p.m2226a(view, i, i2, i3, i4)) : new C0390l();
    }

    /* renamed from: a */
    public static C0390l m2173a(View view, Bitmap bitmap, int i, int i2) {
        return Build.VERSION.SDK_INT >= 24 ? new C0393c(C0397o.m2217a(view, bitmap, i, i2)) : Build.VERSION.SDK_INT >= 23 ? new C0392b(C0396n.m2206a(view, bitmap, i, i2)) : Build.VERSION.SDK_INT >= 21 ? new C0391a(C0395m.m2198a(view, bitmap, i, i2)) : Build.VERSION.SDK_INT >= 16 ? new C0394d(C0398p.m2227a(view, bitmap, i, i2)) : new C0390l();
    }

    /* renamed from: b */
    public static C0390l m2174b() {
        return Build.VERSION.SDK_INT >= 24 ? new C0393c(C0397o.m2218b()) : Build.VERSION.SDK_INT >= 23 ? new C0392b(C0396n.m2207b()) : new C0390l();
    }

    /* renamed from: b */
    public static C0390l m2175b(View view, int i, int i2, int i3, int i4) {
        return Build.VERSION.SDK_INT >= 24 ? new C0393c(C0397o.m2219b(view, i, i2, i3, i4)) : Build.VERSION.SDK_INT >= 23 ? new C0392b(C0396n.m2208b(view, i, i2, i3, i4)) : new C0390l();
    }

    /* renamed from: a */
    public C0390l mo1661a(@C0003aa Rect rect) {
        return null;
    }

    /* renamed from: a */
    public void mo1662a(PendingIntent pendingIntent) {
    }

    /* renamed from: a */
    public void mo1663a(C0390l lVar) {
    }

    @C0003aa
    /* renamed from: c */
    public Rect mo1664c() {
        return null;
    }

    /* renamed from: d */
    public Bundle mo1665d() {
        return null;
    }
}
