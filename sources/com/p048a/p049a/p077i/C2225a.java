package com.p048a.p049a.p077i;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.p048a.p049a.p053d.C2010c;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.a.a.i.a */
public final class C2225a {

    /* renamed from: a */
    private static final ConcurrentHashMap<String, C2010c> f7304a = new ConcurrentHashMap<>();

    private C2225a() {
    }

    /* renamed from: a */
    public static C2010c m12610a(Context context) {
        String packageName = context.getPackageName();
        C2010c cVar = f7304a.get(packageName);
        if (cVar != null) {
            return cVar;
        }
        C2010c b = m12612b(context);
        C2010c putIfAbsent = f7304a.putIfAbsent(packageName, b);
        return putIfAbsent == null ? b : putIfAbsent;
    }

    /* renamed from: a */
    static void m12611a() {
        f7304a.clear();
    }

    /* renamed from: b */
    private static C2010c m12612b(Context context) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            packageInfo = null;
        }
        return new C2228d(packageInfo != null ? String.valueOf(packageInfo.versionCode) : UUID.randomUUID().toString());
    }
}
