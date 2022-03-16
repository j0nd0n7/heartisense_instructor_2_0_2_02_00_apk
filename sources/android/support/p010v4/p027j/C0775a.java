package android.support.p010v4.p027j;

import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.support.annotation.C0011ag;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: android.support.v4.j.a */
public final class C0775a {

    /* renamed from: a */
    public static final int f2864a = 1;

    /* renamed from: b */
    public static final int f2865b = 2;

    /* renamed from: c */
    public static final int f2866c = 3;

    /* renamed from: d */
    private static final C0778c f2867d;

    /* renamed from: android.support.v4.j.a$a */
    static class C0776a extends C0780e {
        C0776a() {
        }

        /* renamed from: a */
        public int mo2639a(ConnectivityManager connectivityManager) {
            return C0782b.m4017a(connectivityManager);
        }
    }

    /* renamed from: android.support.v4.j.a$b */
    static class C0777b implements C0778c {
        C0777b() {
        }

        /* renamed from: a */
        public int mo2639a(ConnectivityManager connectivityManager) {
            return 3;
        }

        /* renamed from: b */
        public boolean mo2640b(ConnectivityManager connectivityManager) {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return true;
            }
            switch (activeNetworkInfo.getType()) {
                case 1:
                    return false;
                default:
                    return true;
            }
        }
    }

    /* renamed from: android.support.v4.j.a$c */
    interface C0778c {
        /* renamed from: a */
        int mo2639a(ConnectivityManager connectivityManager);

        /* renamed from: b */
        boolean mo2640b(ConnectivityManager connectivityManager);
    }

    /* renamed from: android.support.v4.j.a$d */
    static class C0779d extends C0777b {
        C0779d() {
        }

        /* renamed from: b */
        public boolean mo2640b(ConnectivityManager connectivityManager) {
            return C0783c.m4018a(connectivityManager);
        }
    }

    /* renamed from: android.support.v4.j.a$e */
    static class C0780e extends C0779d {
        C0780e() {
        }

        /* renamed from: b */
        public boolean mo2640b(ConnectivityManager connectivityManager) {
            return C0784d.m4019a(connectivityManager);
        }
    }

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: android.support.v4.j.a$f */
    public @interface C0781f {
    }

    static {
        if (Build.VERSION.SDK_INT >= 24) {
            f2867d = new C0776a();
        } else if (Build.VERSION.SDK_INT >= 16) {
            f2867d = new C0780e();
        } else if (Build.VERSION.SDK_INT >= 13) {
            f2867d = new C0779d();
        } else {
            f2867d = new C0777b();
        }
    }

    private C0775a() {
    }

    /* renamed from: a */
    public static NetworkInfo m4007a(ConnectivityManager connectivityManager, Intent intent) {
        NetworkInfo networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo");
        if (networkInfo != null) {
            return connectivityManager.getNetworkInfo(networkInfo.getType());
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m4008a(ConnectivityManager connectivityManager) {
        return f2867d.mo2640b(connectivityManager);
    }

    /* renamed from: b */
    public static int m4009b(ConnectivityManager connectivityManager) {
        return f2867d.mo2639a(connectivityManager);
    }
}
