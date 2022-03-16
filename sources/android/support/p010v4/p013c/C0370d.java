package android.support.p010v4.p013c;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.support.annotation.C0003aa;
import android.support.annotation.C0041t;
import android.support.annotation.C0047z;
import android.support.p010v4.p013c.C0357cc;
import android.support.p010v4.p013c.C0376e;
import android.support.p010v4.p013c.C0380g;
import android.support.p010v4.p014d.C0434d;
import android.view.View;
import java.util.List;
import java.util.Map;

/* renamed from: android.support.v4.c.d */
public class C0370d extends C0434d {

    /* renamed from: android.support.v4.c.d$a */
    public interface C0372a {
        void onRequestPermissionsResult(int i, @C0047z String[] strArr, @C0047z int[] iArr);
    }

    /* renamed from: android.support.v4.c.d$b */
    private static class C0373b extends C0376e.C0377a {

        /* renamed from: a */
        private C0357cc f1861a;

        public C0373b(C0357cc ccVar) {
            this.f1861a = ccVar;
        }

        /* renamed from: a */
        public Parcelable mo1640a(View view, Matrix matrix, RectF rectF) {
            return this.f1861a.mo1613a(view, matrix, rectF);
        }

        /* renamed from: a */
        public View mo1641a(Context context, Parcelable parcelable) {
            return this.f1861a.mo1614a(context, parcelable);
        }

        /* renamed from: a */
        public void mo1642a(List<View> list) {
            this.f1861a.mo1615a(list);
        }

        /* renamed from: a */
        public void mo1643a(List<String> list, List<View> list2, List<View> list3) {
            this.f1861a.mo1617a(list, list2, list3);
        }

        /* renamed from: a */
        public void mo1644a(List<String> list, Map<String, View> map) {
            this.f1861a.mo1618a(list, map);
        }

        /* renamed from: b */
        public void mo1645b(List<String> list, List<View> list2, List<View> list3) {
            this.f1861a.mo1619b(list, list2, list3);
        }
    }

    /* renamed from: android.support.v4.c.d$c */
    private static class C0374c extends C0380g.C0383c {

        /* renamed from: a */
        private C0357cc f1862a;

        public C0374c(C0357cc ccVar) {
            this.f1862a = ccVar;
        }

        /* renamed from: a */
        public Parcelable mo1640a(View view, Matrix matrix, RectF rectF) {
            return this.f1862a.mo1613a(view, matrix, rectF);
        }

        /* renamed from: a */
        public View mo1641a(Context context, Parcelable parcelable) {
            return this.f1862a.mo1614a(context, parcelable);
        }

        /* renamed from: a */
        public void mo1642a(List<View> list) {
            this.f1862a.mo1615a(list);
        }

        /* renamed from: a */
        public void mo1646a(List<String> list, List<View> list2, final C0380g.C0381a aVar) {
            this.f1862a.mo1616a(list, list2, (C0357cc.C0358a) new C0357cc.C0358a() {
                /* renamed from: a */
                public void mo1620a() {
                    aVar.mo1653a();
                }
            });
        }

        /* renamed from: a */
        public void mo1643a(List<String> list, List<View> list2, List<View> list3) {
            this.f1862a.mo1617a(list, list2, list3);
        }

        /* renamed from: a */
        public void mo1644a(List<String> list, Map<String, View> map) {
            this.f1862a.mo1618a(list, map);
        }

        /* renamed from: b */
        public void mo1645b(List<String> list, List<View> list2, List<View> list3) {
            this.f1862a.mo1619b(list, list2, list3);
        }
    }

    protected C0370d() {
    }

    /* renamed from: a */
    private static C0376e.C0377a m2111a(C0357cc ccVar) {
        if (ccVar != null) {
            return new C0373b(ccVar);
        }
        return null;
    }

    /* renamed from: a */
    public static void m2112a(Activity activity, Intent intent, int i, @C0003aa Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            C0387i.m2164a(activity, intent, i, bundle);
        } else {
            activity.startActivityForResult(intent, i);
        }
    }

    /* renamed from: a */
    public static void m2113a(Activity activity, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, @C0003aa Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            C0387i.m2165a(activity, intentSender, i, intent, i2, i3, i4, bundle);
        } else {
            activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
        }
    }

    /* renamed from: a */
    public static void m2114a(Activity activity, C0357cc ccVar) {
        if (Build.VERSION.SDK_INT >= 23) {
            C0380g.m2153a(activity, m2118b(ccVar));
        } else if (Build.VERSION.SDK_INT >= 21) {
            C0376e.m2141a(activity, m2111a(ccVar));
        }
    }

    /* renamed from: a */
    public static void m2115a(@C0047z final Activity activity, @C0047z final String[] strArr, @C0041t(mo24a = 0) final int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            C0380g.m2154a(activity, strArr, i);
        } else if (activity instanceof C0372a) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public void run() {
                    int[] iArr = new int[strArr.length];
                    PackageManager packageManager = activity.getPackageManager();
                    String packageName = activity.getPackageName();
                    int length = strArr.length;
                    for (int i = 0; i < length; i++) {
                        iArr[i] = packageManager.checkPermission(strArr[i], packageName);
                    }
                    ((C0372a) activity).onRequestPermissionsResult(i, strArr, iArr);
                }
            });
        }
    }

    /* renamed from: a */
    public static boolean m2116a(Activity activity) {
        if (Build.VERSION.SDK_INT < 11) {
            return false;
        }
        C0386h.m2161a(activity);
        return true;
    }

    /* renamed from: a */
    public static boolean m2117a(@C0047z Activity activity, @C0047z String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C0380g.m2155a(activity, str);
        }
        return false;
    }

    /* renamed from: b */
    private static C0380g.C0383c m2118b(C0357cc ccVar) {
        if (ccVar != null) {
            return new C0374c(ccVar);
        }
        return null;
    }

    /* renamed from: b */
    public static void m2119b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 16) {
            C0387i.m2163a(activity);
        } else {
            activity.finish();
        }
    }

    /* renamed from: b */
    public static void m2120b(Activity activity, C0357cc ccVar) {
        if (Build.VERSION.SDK_INT >= 23) {
            C0380g.m2156b(activity, m2118b(ccVar));
        } else if (Build.VERSION.SDK_INT >= 21) {
            C0376e.m2143b(activity, m2111a(ccVar));
        }
    }

    /* renamed from: c */
    public static void m2121c(Activity activity) {
        if (Build.VERSION.SDK_INT >= 21) {
            C0376e.m2140a(activity);
        } else {
            activity.finish();
        }
    }

    @C0003aa
    /* renamed from: d */
    public static Uri m2122d(Activity activity) {
        if (Build.VERSION.SDK_INT >= 22) {
            return C0379f.m2151a(activity);
        }
        Intent intent = activity.getIntent();
        Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.REFERRER");
        if (uri != null) {
            return uri;
        }
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        if (stringExtra != null) {
            return Uri.parse(stringExtra);
        }
        return null;
    }

    /* renamed from: e */
    public static void m2123e(Activity activity) {
        if (Build.VERSION.SDK_INT >= 21) {
            C0376e.m2142b(activity);
        }
    }

    /* renamed from: f */
    public static void m2124f(Activity activity) {
        if (Build.VERSION.SDK_INT >= 21) {
            C0376e.m2144c(activity);
        }
    }
}
