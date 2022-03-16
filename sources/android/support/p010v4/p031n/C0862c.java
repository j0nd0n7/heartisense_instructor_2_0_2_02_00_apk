package android.support.p010v4.p031n;

import android.annotation.TargetApi;
import android.support.annotation.C0007ae;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

@C0007ae(mo1a = 23)
@TargetApi(23)
/* renamed from: android.support.v4.n.c */
class C0862c {

    /* renamed from: a */
    private static final String f2995a = "ICUCompatIcs";

    /* renamed from: b */
    private static Method f2996b;

    static {
        try {
            f2996b = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", new Class[]{Locale.class});
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    C0862c() {
    }

    /* renamed from: a */
    public static String m4328a(Locale locale) {
        try {
            return ((Locale) f2996b.invoke((Object) null, new Object[]{locale})).getScript();
        } catch (InvocationTargetException e) {
            Log.w(f2995a, e);
        } catch (IllegalAccessException e2) {
            Log.w(f2995a, e2);
        }
        return locale.getScript();
    }
}
