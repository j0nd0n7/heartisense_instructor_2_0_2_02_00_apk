package android.support.p036v7.p038b.p039a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.C0003aa;
import android.support.annotation.C0033l;
import android.support.annotation.C0036o;
import android.support.annotation.C0047z;
import android.support.p010v4.p014d.C0434d;
import android.support.p036v7.widget.C1849m;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;

/* renamed from: android.support.v7.b.a.b */
public final class C1477b {

    /* renamed from: a */
    private static final String f4587a = "AppCompatResources";

    /* renamed from: b */
    private static final ThreadLocal<TypedValue> f4588b = new ThreadLocal<>();

    /* renamed from: c */
    private static final WeakHashMap<Context, SparseArray<C1478a>> f4589c = new WeakHashMap<>(0);

    /* renamed from: d */
    private static final Object f4590d = new Object();

    /* renamed from: android.support.v7.b.a.b$a */
    private static class C1478a {

        /* renamed from: a */
        final ColorStateList f4591a;

        /* renamed from: b */
        final Configuration f4592b;

        C1478a(@C0047z ColorStateList colorStateList, @C0047z Configuration configuration) {
            this.f4591a = colorStateList;
            this.f4592b = configuration;
        }
    }

    private C1477b() {
    }

    /* renamed from: a */
    public static ColorStateList m8689a(@C0047z Context context, @C0033l int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        ColorStateList d = m8694d(context, i);
        if (d != null) {
            return d;
        }
        ColorStateList c = m8693c(context, i);
        if (c == null) {
            return C0434d.m2379b(context, i);
        }
        m8691a(context, i, c);
        return c;
    }

    @C0047z
    /* renamed from: a */
    private static TypedValue m8690a() {
        TypedValue typedValue = f4588b.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        f4588b.set(typedValue2);
        return typedValue2;
    }

    /* renamed from: a */
    private static void m8691a(@C0047z Context context, @C0033l int i, @C0047z ColorStateList colorStateList) {
        synchronized (f4590d) {
            SparseArray sparseArray = f4589c.get(context);
            if (sparseArray == null) {
                sparseArray = new SparseArray();
                f4589c.put(context, sparseArray);
            }
            sparseArray.append(i, new C1478a(colorStateList, context.getResources().getConfiguration()));
        }
    }

    @C0003aa
    /* renamed from: b */
    public static Drawable m8692b(@C0047z Context context, @C0036o int i) {
        return C1849m.m11201a().mo7451a(context, i);
    }

    @C0003aa
    /* renamed from: c */
    private static ColorStateList m8693c(Context context, int i) {
        if (m8695e(context, i)) {
            return null;
        }
        Resources resources = context.getResources();
        try {
            return C1476a.m8685a(resources, resources.getXml(i), context.getTheme());
        } catch (Exception e) {
            Log.e(f4587a, "Failed to inflate ColorStateList, leaving it to the framework", e);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return null;
     */
    @android.support.annotation.C0003aa
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.res.ColorStateList m8694d(@android.support.annotation.C0047z android.content.Context r5, @android.support.annotation.C0033l int r6) {
        /*
            java.lang.Object r2 = f4590d
            monitor-enter(r2)
            java.util.WeakHashMap<android.content.Context, android.util.SparseArray<android.support.v7.b.a.b$a>> r0 = f4589c     // Catch:{ all -> 0x0035 }
            java.lang.Object r0 = r0.get(r5)     // Catch:{ all -> 0x0035 }
            android.util.SparseArray r0 = (android.util.SparseArray) r0     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x0032
            int r1 = r0.size()     // Catch:{ all -> 0x0035 }
            if (r1 <= 0) goto L_0x0032
            java.lang.Object r1 = r0.get(r6)     // Catch:{ all -> 0x0035 }
            android.support.v7.b.a.b$a r1 = (android.support.p036v7.p038b.p039a.C1477b.C1478a) r1     // Catch:{ all -> 0x0035 }
            if (r1 == 0) goto L_0x0032
            android.content.res.Configuration r3 = r1.f4592b     // Catch:{ all -> 0x0035 }
            android.content.res.Resources r4 = r5.getResources()     // Catch:{ all -> 0x0035 }
            android.content.res.Configuration r4 = r4.getConfiguration()     // Catch:{ all -> 0x0035 }
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x0035 }
            if (r3 == 0) goto L_0x002f
            android.content.res.ColorStateList r0 = r1.f4591a     // Catch:{ all -> 0x0035 }
            monitor-exit(r2)     // Catch:{ all -> 0x0035 }
        L_0x002e:
            return r0
        L_0x002f:
            r0.remove(r6)     // Catch:{ all -> 0x0035 }
        L_0x0032:
            monitor-exit(r2)     // Catch:{ all -> 0x0035 }
            r0 = 0
            goto L_0x002e
        L_0x0035:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0035 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p036v7.p038b.p039a.C1477b.m8694d(android.content.Context, int):android.content.res.ColorStateList");
    }

    /* renamed from: e */
    private static boolean m8695e(@C0047z Context context, @C0033l int i) {
        Resources resources = context.getResources();
        TypedValue a = m8690a();
        resources.getValue(i, a, true);
        return a.type >= 28 && a.type <= 31;
    }
}
