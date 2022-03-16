package android.support.p010v4.p014d;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Process;
import android.support.annotation.C0003aa;
import android.support.annotation.C0032k;
import android.support.annotation.C0033l;
import android.support.annotation.C0036o;
import android.support.annotation.C0047z;
import android.support.p010v4.p028k.C0798c;
import android.util.Log;
import android.util.TypedValue;
import java.io.File;

/* renamed from: android.support.v4.d.d */
public class C0434d {

    /* renamed from: a */
    private static final String f1954a = "ContextCompat";

    /* renamed from: b */
    private static final String f1955b = "Android";

    /* renamed from: c */
    private static final String f1956c = "obb";

    /* renamed from: d */
    private static final Object f1957d = new Object();

    /* renamed from: e */
    private static TypedValue f1958e;

    protected C0434d() {
    }

    /* renamed from: a */
    public static final Drawable m2370a(Context context, @C0036o int i) {
        int i2;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 21) {
            return C0435e.m2387a(context, i);
        }
        if (i3 >= 16) {
            return context.getResources().getDrawable(i);
        }
        synchronized (f1957d) {
            if (f1958e == null) {
                f1958e = new TypedValue();
            }
            context.getResources().getValue(i, f1958e, true);
            i2 = f1958e.resourceId;
        }
        return context.getResources().getDrawable(i2);
    }

    /* renamed from: a */
    public static File m2371a(Context context) {
        if (C0798c.m4072a()) {
            return C0437g.m2392a(context);
        }
        String str = context.getApplicationInfo().dataDir;
        if (str != null) {
            return new File(str);
        }
        return null;
    }

    /* renamed from: a */
    private static synchronized File m2372a(File file) {
        synchronized (C0434d.class) {
            if (!file.exists() && !file.mkdirs() && !file.exists()) {
                Log.w(f1954a, "Unable to create files subdir " + file.getPath());
                file = null;
            }
        }
        return file;
    }

    /* renamed from: a */
    private static File m2373a(File file, String... strArr) {
        int length = strArr.length;
        int i = 0;
        File file2 = file;
        while (i < length) {
            String str = strArr[i];
            i++;
            file2 = file2 == null ? new File(str) : str != null ? new File(file2, str) : file2;
        }
        return file2;
    }

    /* renamed from: a */
    public static void m2374a(Context context, Intent intent, @C0003aa Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            C0439i.m2397a(context, intent, bundle);
        } else {
            context.startActivity(intent);
        }
    }

    /* renamed from: a */
    public static boolean m2375a(Context context, Intent[] intentArr) {
        return m2376a(context, intentArr, (Bundle) null);
    }

    /* renamed from: a */
    public static boolean m2376a(Context context, Intent[] intentArr, Bundle bundle) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 16) {
            C0439i.m2398a(context, intentArr, bundle);
            return true;
        } else if (i < 11) {
            return false;
        } else {
            C0438h.m2396a(context, intentArr);
            return true;
        }
    }

    /* renamed from: a */
    public static File[] m2377a(Context context, String str) {
        if (Build.VERSION.SDK_INT >= 19) {
            return C0440j.m2400a(context, str);
        }
        return new File[]{context.getExternalFilesDir(str)};
    }

    /* renamed from: b */
    public static int m2378b(@C0047z Context context, @C0047z String str) {
        if (str != null) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        throw new IllegalArgumentException("permission is null");
    }

    /* renamed from: b */
    public static final ColorStateList m2379b(Context context, @C0033l int i) {
        return Build.VERSION.SDK_INT >= 23 ? C0436f.m2390a(context, i) : context.getResources().getColorStateList(i);
    }

    /* renamed from: b */
    public static File[] m2380b(Context context) {
        File a;
        int i = Build.VERSION.SDK_INT;
        if (i >= 19) {
            return C0440j.m2401b(context);
        }
        if (i >= 11) {
            a = C0438h.m2395a(context);
        } else {
            a = m2373a(Environment.getExternalStorageDirectory(), f1955b, f1956c, context.getPackageName());
        }
        return new File[]{a};
    }

    @C0032k
    /* renamed from: c */
    public static final int m2381c(Context context, @C0033l int i) {
        return Build.VERSION.SDK_INT >= 23 ? C0436f.m2391b(context, i) : context.getResources().getColor(i);
    }

    /* renamed from: c */
    public static File[] m2382c(Context context) {
        if (Build.VERSION.SDK_INT >= 19) {
            return C0440j.m2399a(context);
        }
        return new File[]{context.getExternalCacheDir()};
    }

    /* renamed from: d */
    public static final File m2383d(Context context) {
        return Build.VERSION.SDK_INT >= 21 ? C0435e.m2388a(context) : m2372a(new File(context.getApplicationInfo().dataDir, "no_backup"));
    }

    /* renamed from: e */
    public static File m2384e(Context context) {
        return Build.VERSION.SDK_INT >= 21 ? C0435e.m2389b(context) : m2372a(new File(context.getApplicationInfo().dataDir, "code_cache"));
    }

    /* renamed from: f */
    public static Context m2385f(Context context) {
        if (C0798c.m4072a()) {
            return C0437g.m2393b(context);
        }
        return null;
    }

    /* renamed from: g */
    public static boolean m2386g(Context context) {
        if (C0798c.m4072a()) {
            return C0437g.m2394c(context);
        }
        return false;
    }
}
