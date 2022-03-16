package android.support.p010v4.p013c;

import android.annotation.TargetApi;
import android.os.Bundle;
import android.os.IBinder;
import android.support.annotation.C0007ae;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@C0007ae(mo1a = 9)
@TargetApi(9)
/* renamed from: android.support.v4.c.z */
class C0412z {

    /* renamed from: a */
    private static final String f1935a = "BundleCompatGingerbread";

    /* renamed from: b */
    private static Method f1936b;

    /* renamed from: c */
    private static boolean f1937c;

    /* renamed from: d */
    private static Method f1938d;

    /* renamed from: e */
    private static boolean f1939e;

    C0412z() {
    }

    /* renamed from: a */
    public static IBinder m2303a(Bundle bundle, String str) {
        if (!f1937c) {
            try {
                f1936b = Bundle.class.getMethod("getIBinder", new Class[]{String.class});
                f1936b.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i(f1935a, "Failed to retrieve getIBinder method", e);
            }
            f1937c = true;
        }
        if (f1936b != null) {
            try {
                return (IBinder) f1936b.invoke(bundle, new Object[]{str});
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
                Log.i(f1935a, "Failed to invoke getIBinder via reflection", e2);
                f1936b = null;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static void m2304a(Bundle bundle, String str, IBinder iBinder) {
        if (!f1939e) {
            try {
                f1938d = Bundle.class.getMethod("putIBinder", new Class[]{String.class, IBinder.class});
                f1938d.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i(f1935a, "Failed to retrieve putIBinder method", e);
            }
            f1939e = true;
        }
        if (f1938d != null) {
            try {
                f1938d.invoke(bundle, new Object[]{str, iBinder});
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
                Log.i(f1935a, "Failed to invoke putIBinder via reflection", e2);
                f1938d = null;
            }
        }
    }
}
