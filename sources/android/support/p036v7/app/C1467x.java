package android.support.p036v7.app;

import android.content.res.Resources;
import android.os.Build;
import android.support.annotation.C0047z;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
import java.util.Map;

/* renamed from: android.support.v7.app.x */
class C1467x {

    /* renamed from: a */
    private static final String f4547a = "ResourcesFlusher";

    /* renamed from: b */
    private static Field f4548b;

    /* renamed from: c */
    private static boolean f4549c;

    /* renamed from: d */
    private static Class f4550d;

    /* renamed from: e */
    private static boolean f4551e;

    /* renamed from: f */
    private static Field f4552f;

    /* renamed from: g */
    private static boolean f4553g;

    /* renamed from: h */
    private static Field f4554h;

    /* renamed from: i */
    private static boolean f4555i;

    C1467x() {
    }

    /* renamed from: a */
    static boolean m8595a(@C0047z Resources resources) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            return m8599d(resources);
        }
        if (i >= 23) {
            return m8598c(resources);
        }
        if (i >= 21) {
            return m8597b(resources);
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m8596a(@C0047z Object obj) {
        LongSparseArray longSparseArray;
        if (!f4551e) {
            try {
                f4550d = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e) {
                Log.e(f4547a, "Could not find ThemedResourceCache class", e);
            }
            f4551e = true;
        }
        if (f4550d == null) {
            return false;
        }
        if (!f4553g) {
            try {
                f4552f = f4550d.getDeclaredField("mUnthemedEntries");
                f4552f.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e(f4547a, "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e2);
            }
            f4553g = true;
        }
        if (f4552f == null) {
            return false;
        }
        try {
            longSparseArray = (LongSparseArray) f4552f.get(obj);
        } catch (IllegalAccessException e3) {
            Log.e(f4547a, "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e3);
            longSparseArray = null;
        }
        if (longSparseArray == null) {
            return false;
        }
        longSparseArray.clear();
        return true;
    }

    /* renamed from: b */
    private static boolean m8597b(@C0047z Resources resources) {
        Map map;
        if (!f4549c) {
            try {
                f4548b = Resources.class.getDeclaredField("mDrawableCache");
                f4548b.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e(f4547a, "Could not retrieve Resources#mDrawableCache field", e);
            }
            f4549c = true;
        }
        if (f4548b != null) {
            try {
                map = (Map) f4548b.get(resources);
            } catch (IllegalAccessException e2) {
                Log.e(f4547a, "Could not retrieve value from Resources#mDrawableCache", e2);
                map = null;
            }
            if (map != null) {
                map.clear();
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0039 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m8598c(@android.support.annotation.C0047z android.content.res.Resources r6) {
        /*
            r1 = 0
            r0 = 1
            boolean r2 = f4549c
            if (r2 != 0) goto L_0x0018
            java.lang.Class<android.content.res.Resources> r2 = android.content.res.Resources.class
            java.lang.String r3 = "mDrawableCache"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch:{ NoSuchFieldException -> 0x0026 }
            f4548b = r2     // Catch:{ NoSuchFieldException -> 0x0026 }
            java.lang.reflect.Field r2 = f4548b     // Catch:{ NoSuchFieldException -> 0x0026 }
            r3 = 1
            r2.setAccessible(r3)     // Catch:{ NoSuchFieldException -> 0x0026 }
        L_0x0016:
            f4549c = r0
        L_0x0018:
            r3 = 0
            java.lang.reflect.Field r2 = f4548b
            if (r2 == 0) goto L_0x0037
            java.lang.reflect.Field r2 = f4548b     // Catch:{ IllegalAccessException -> 0x002f }
            java.lang.Object r2 = r2.get(r6)     // Catch:{ IllegalAccessException -> 0x002f }
        L_0x0023:
            if (r2 != 0) goto L_0x0039
        L_0x0025:
            return r1
        L_0x0026:
            r2 = move-exception
            java.lang.String r3 = "ResourcesFlusher"
            java.lang.String r4 = "Could not retrieve Resources#mDrawableCache field"
            android.util.Log.e(r3, r4, r2)
            goto L_0x0016
        L_0x002f:
            r2 = move-exception
            java.lang.String r4 = "ResourcesFlusher"
            java.lang.String r5 = "Could not retrieve value from Resources#mDrawableCache"
            android.util.Log.e(r4, r5, r2)
        L_0x0037:
            r2 = r3
            goto L_0x0023
        L_0x0039:
            if (r2 == 0) goto L_0x0043
            boolean r2 = m8596a((java.lang.Object) r2)
            if (r2 == 0) goto L_0x0043
        L_0x0041:
            r1 = r0
            goto L_0x0025
        L_0x0043:
            r0 = r1
            goto L_0x0041
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p036v7.app.C1467x.m8598c(android.content.res.Resources):boolean");
    }

    /* renamed from: d */
    private static boolean m8599d(@C0047z Resources resources) {
        Object obj;
        Object obj2;
        boolean z = true;
        if (!f4555i) {
            try {
                f4554h = Resources.class.getDeclaredField("mResourcesImpl");
                f4554h.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e(f4547a, "Could not retrieve Resources#mResourcesImpl field", e);
            }
            f4555i = true;
        }
        if (f4554h == null) {
            return false;
        }
        try {
            obj = f4554h.get(resources);
        } catch (IllegalAccessException e2) {
            Log.e(f4547a, "Could not retrieve value from Resources#mResourcesImpl", e2);
            obj = null;
        }
        if (obj == null) {
            return false;
        }
        if (!f4549c) {
            try {
                f4548b = obj.getClass().getDeclaredField("mDrawableCache");
                f4548b.setAccessible(true);
            } catch (NoSuchFieldException e3) {
                Log.e(f4547a, "Could not retrieve ResourcesImpl#mDrawableCache field", e3);
            }
            f4549c = true;
        }
        if (f4548b != null) {
            try {
                obj2 = f4548b.get(obj);
            } catch (IllegalAccessException e4) {
                Log.e(f4547a, "Could not retrieve value from ResourcesImpl#mDrawableCache", e4);
            }
            if (obj2 == null || !m8596a(obj2)) {
                z = false;
            }
            return z;
        }
        obj2 = null;
        z = false;
        return z;
    }
}
