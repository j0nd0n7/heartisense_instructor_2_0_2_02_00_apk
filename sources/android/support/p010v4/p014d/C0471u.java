package android.support.p010v4.p014d;

import android.content.Context;
import android.os.Binder;
import android.os.Process;
import android.support.annotation.C0047z;
import android.support.p010v4.p013c.C0400r;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: android.support.v4.d.u */
public final class C0471u {

    /* renamed from: a */
    public static final int f2044a = 0;

    /* renamed from: b */
    public static final int f2045b = -1;

    /* renamed from: c */
    public static final int f2046c = -2;

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: android.support.v4.d.u$a */
    public @interface C0472a {
    }

    private C0471u() {
    }

    /* renamed from: a */
    public static int m2512a(@C0047z Context context, @C0047z String str) {
        return m2513a(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }

    /* renamed from: a */
    public static int m2513a(@C0047z Context context, @C0047z String str, int i, int i2, String str2) {
        if (context.checkPermission(str, i, i2) == -1) {
            return -1;
        }
        String a = C0400r.m2234a(str);
        if (a == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i2);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        return C0400r.m2233a(context, a, str2) != 0 ? -2 : 0;
    }

    /* renamed from: a */
    public static int m2514a(@C0047z Context context, @C0047z String str, String str2) {
        if (Binder.getCallingPid() == Process.myPid()) {
            return -1;
        }
        return m2513a(context, str, Binder.getCallingPid(), Binder.getCallingUid(), str2);
    }

    /* renamed from: b */
    public static int m2515b(@C0047z Context context, @C0047z String str) {
        return m2513a(context, str, Binder.getCallingPid(), Binder.getCallingUid(), Binder.getCallingPid() == Process.myPid() ? context.getPackageName() : null);
    }
}
