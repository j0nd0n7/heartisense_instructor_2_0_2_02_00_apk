package android.support.p010v4.p014d.p016b;

import android.content.res.Resources;
import android.os.Build;
import android.support.annotation.C0047z;

/* renamed from: android.support.v4.d.b.a */
public final class C0420a {

    /* renamed from: a */
    private static final C0421a f1953a;

    /* renamed from: android.support.v4.d.b.a$a */
    private interface C0421a {
        /* renamed from: a */
        int mo1724a(@C0047z Resources resources);

        /* renamed from: b */
        int mo1725b(@C0047z Resources resources);

        /* renamed from: c */
        int mo1726c(@C0047z Resources resources);

        /* renamed from: d */
        int mo1727d(@C0047z Resources resources);
    }

    /* renamed from: android.support.v4.d.b.a$b */
    private static class C0422b implements C0421a {
        C0422b() {
        }

        /* renamed from: a */
        public int mo1724a(@C0047z Resources resources) {
            return C0425b.m2343a(resources);
        }

        /* renamed from: b */
        public int mo1725b(@C0047z Resources resources) {
            return C0425b.m2344b(resources);
        }

        /* renamed from: c */
        public int mo1726c(@C0047z Resources resources) {
            return C0425b.m2345c(resources);
        }

        /* renamed from: d */
        public int mo1727d(@C0047z Resources resources) {
            return C0425b.m2346d(resources);
        }
    }

    /* renamed from: android.support.v4.d.b.a$c */
    private static class C0423c extends C0422b {
        C0423c() {
        }

        /* renamed from: a */
        public int mo1724a(@C0047z Resources resources) {
            return C0426c.m2347a(resources);
        }

        /* renamed from: b */
        public int mo1725b(@C0047z Resources resources) {
            return C0426c.m2348b(resources);
        }

        /* renamed from: c */
        public int mo1726c(@C0047z Resources resources) {
            return C0426c.m2349c(resources);
        }
    }

    /* renamed from: android.support.v4.d.b.a$d */
    private static class C0424d extends C0423c {
        C0424d() {
        }

        /* renamed from: d */
        public int mo1727d(@C0047z Resources resources) {
            return C0427d.m2350a(resources);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 17) {
            f1953a = new C0424d();
        } else if (i >= 13) {
            f1953a = new C0423c();
        } else {
            f1953a = new C0422b();
        }
    }

    private C0420a() {
    }

    /* renamed from: a */
    public static int m2327a(@C0047z Resources resources) {
        return f1953a.mo1724a(resources);
    }

    /* renamed from: b */
    public static int m2328b(@C0047z Resources resources) {
        return f1953a.mo1725b(resources);
    }

    /* renamed from: c */
    public static int m2329c(@C0047z Resources resources) {
        return f1953a.mo1726c(resources);
    }

    /* renamed from: d */
    public static int m2330d(@C0047z Resources resources) {
        return f1953a.mo1727d(resources);
    }
}
