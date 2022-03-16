package android.support.p010v4.p031n;

import android.annotation.TargetApi;
import android.support.annotation.C0007ae;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

@C0007ae(mo1a = 14)
@TargetApi(14)
/* renamed from: android.support.v4.n.d */
class C0863d {

    /* renamed from: a */
    private static final String f2997a = "ICUCompatIcs";

    /* renamed from: b */
    private static Method f2998b;

    /* renamed from: c */
    private static Method f2999c;

    static {
        try {
            Class<?> cls = Class.forName("libcore.icu.ICU");
            if (cls != null) {
                f2998b = cls.getMethod("getScript", new Class[]{String.class});
                f2999c = cls.getMethod("addLikelySubtags", new Class[]{String.class});
            }
        } catch (Exception e) {
            f2998b = null;
            f2999c = null;
            Log.w(f2997a, e);
        }
    }

    C0863d() {
    }

    /* renamed from: a */
    private static String m4329a(String str) {
        try {
            if (f2998b != null) {
                return (String) f2998b.invoke((Object) null, new Object[]{str});
            }
        } catch (IllegalAccessException e) {
            Log.w(f2997a, e);
        } catch (InvocationTargetException e2) {
            Log.w(f2997a, e2);
        }
        return null;
    }

    /* renamed from: a */
    public static String m4330a(Locale locale) {
        String b = m4331b(locale);
        if (b != null) {
            return m4329a(b);
        }
        return null;
    }

    /* renamed from: b */
    private static String m4331b(Locale locale) {
        String locale2 = locale.toString();
        try {
            if (f2999c != null) {
                return (String) f2999c.invoke((Object) null, new Object[]{locale2});
            }
        } catch (IllegalAccessException e) {
            Log.w(f2997a, e);
        } catch (InvocationTargetException e2) {
            Log.w(f2997a, e2);
        }
        return locale2;
    }
}
