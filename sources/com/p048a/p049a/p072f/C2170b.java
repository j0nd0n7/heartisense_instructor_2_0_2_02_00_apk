package com.p048a.p049a.p072f;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.a.a.f.b */
public final class C2170b {

    /* renamed from: a */
    private static final String f7143a = "GlideModule";

    /* renamed from: b */
    private final Context f7144b;

    public C2170b(Context context) {
        this.f7144b = context;
    }

    /* renamed from: a */
    private static C2169a m12360a(String str) {
        Object obj;
        Object obj2;
        try {
            try {
                Object newInstance = Class.forName(str).newInstance();
                if (newInstance instanceof C2169a) {
                    return (C2169a) newInstance;
                }
                throw new RuntimeException("Expected instanceof GlideModule, but found: " + newInstance);
            } catch (InstantiationException e) {
                throw new RuntimeException("Unable to instantiate GlideModule implementation for " + obj2, e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("Unable to instantiate GlideModule implementation for " + obj, e2);
            }
        } catch (ClassNotFoundException e3) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e3);
        }
    }

    /* renamed from: a */
    public List<C2169a> mo8166a() {
        ArrayList arrayList = new ArrayList();
        try {
            ApplicationInfo applicationInfo = this.f7144b.getPackageManager().getApplicationInfo(this.f7144b.getPackageName(), 128);
            if (applicationInfo.metaData != null) {
                for (String str : applicationInfo.metaData.keySet()) {
                    if (f7143a.equals(applicationInfo.metaData.get(str))) {
                        arrayList.add(m12360a(str));
                    }
                }
            }
            return arrayList;
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("Unable to find metadata to parse GlideModules", e);
        }
    }
}
