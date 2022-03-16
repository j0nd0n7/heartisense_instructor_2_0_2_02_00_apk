package android.support.p010v4.p013c;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.annotation.C0003aa;
import android.support.p010v4.p014d.C0446n;
import android.util.Log;

/* renamed from: android.support.v4.c.ax */
public final class C0251ax {

    /* renamed from: a */
    public static final String f1432a = "android.support.PARENT_ACTIVITY";

    /* renamed from: b */
    private static final String f1433b = "NavUtils";

    /* renamed from: c */
    private static final C0252a f1434c;

    /* renamed from: android.support.v4.c.ax$a */
    interface C0252a {
        /* renamed from: a */
        Intent mo1318a(Activity activity);

        /* renamed from: a */
        String mo1319a(Context context, ActivityInfo activityInfo);

        /* renamed from: a */
        boolean mo1320a(Activity activity, Intent intent);

        /* renamed from: b */
        void mo1321b(Activity activity, Intent intent);
    }

    /* renamed from: android.support.v4.c.ax$b */
    static class C0253b implements C0252a {
        C0253b() {
        }

        /* renamed from: a */
        public Intent mo1318a(Activity activity) {
            String c = C0251ax.m1551c(activity);
            if (c == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(activity, c);
            try {
                return C0251ax.m1549b((Context) activity, componentName) == null ? C0446n.m2436a(componentName) : new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException e) {
                Log.e(C0251ax.f1433b, "getParentActivityIntent: bad parentActivityName '" + c + "' in manifest");
                return null;
            }
        }

        /* renamed from: a */
        public String mo1319a(Context context, ActivityInfo activityInfo) {
            if (activityInfo.metaData == null) {
                return null;
            }
            String string = activityInfo.metaData.getString(C0251ax.f1432a);
            if (string == null) {
                return null;
            }
            return string.charAt(0) == '.' ? context.getPackageName() + string : string;
        }

        /* renamed from: a */
        public boolean mo1320a(Activity activity, Intent intent) {
            String action = activity.getIntent().getAction();
            return action != null && !action.equals("android.intent.action.MAIN");
        }

        /* renamed from: b */
        public void mo1321b(Activity activity, Intent intent) {
            intent.addFlags(67108864);
            activity.startActivity(intent);
            activity.finish();
        }
    }

    /* renamed from: android.support.v4.c.ax$c */
    static class C0254c extends C0253b {
        C0254c() {
        }

        /* renamed from: a */
        public Intent mo1318a(Activity activity) {
            Intent a = C0255ay.m1565a(activity);
            return a == null ? mo1322b(activity) : a;
        }

        /* renamed from: a */
        public String mo1319a(Context context, ActivityInfo activityInfo) {
            String a = C0255ay.m1566a(activityInfo);
            return a == null ? super.mo1319a(context, activityInfo) : a;
        }

        /* renamed from: a */
        public boolean mo1320a(Activity activity, Intent intent) {
            return C0255ay.m1567a(activity, intent);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public Intent mo1322b(Activity activity) {
            return super.mo1318a(activity);
        }

        /* renamed from: b */
        public void mo1321b(Activity activity, Intent intent) {
            C0255ay.m1568b(activity, intent);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 16) {
            f1434c = new C0254c();
        } else {
            f1434c = new C0253b();
        }
    }

    private C0251ax() {
    }

    /* renamed from: a */
    public static Intent m1544a(Context context, ComponentName componentName) {
        String b = m1549b(context, componentName);
        if (b == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), b);
        return m1549b(context, componentName2) == null ? C0446n.m2436a(componentName2) : new Intent().setComponent(componentName2);
    }

    /* renamed from: a */
    public static Intent m1545a(Context context, Class<?> cls) {
        String b = m1549b(context, new ComponentName(context, cls));
        if (b == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(context, b);
        return m1549b(context, componentName) == null ? C0446n.m2436a(componentName) : new Intent().setComponent(componentName);
    }

    /* renamed from: a */
    public static void m1546a(Activity activity) {
        Intent b = m1548b(activity);
        if (b == null) {
            throw new IllegalArgumentException("Activity " + activity.getClass().getSimpleName() + " does not have a parent activity name specified." + " (Did you forget to add the android.support.PARENT_ACTIVITY <meta-data> " + " element in your manifest?)");
        }
        m1550b(activity, b);
    }

    /* renamed from: a */
    public static boolean m1547a(Activity activity, Intent intent) {
        return f1434c.mo1320a(activity, intent);
    }

    /* renamed from: b */
    public static Intent m1548b(Activity activity) {
        return f1434c.mo1318a(activity);
    }

    @C0003aa
    /* renamed from: b */
    public static String m1549b(Context context, ComponentName componentName) {
        return f1434c.mo1319a(context, context.getPackageManager().getActivityInfo(componentName, 128));
    }

    /* renamed from: b */
    public static void m1550b(Activity activity, Intent intent) {
        f1434c.mo1321b(activity, intent);
    }

    @C0003aa
    /* renamed from: c */
    public static String m1551c(Activity activity) {
        try {
            return m1549b((Context) activity, activity.getComponentName());
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
