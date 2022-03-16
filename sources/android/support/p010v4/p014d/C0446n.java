package android.support.p010v4.p014d;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Build;

/* renamed from: android.support.v4.d.n */
public final class C0446n {

    /* renamed from: a */
    public static final String f1982a = "android.intent.action.EXTERNAL_APPLICATIONS_AVAILABLE";

    /* renamed from: b */
    public static final String f1983b = "android.intent.action.EXTERNAL_APPLICATIONS_UNAVAILABLE";

    /* renamed from: c */
    public static final String f1984c = "android.intent.extra.changed_package_list";

    /* renamed from: d */
    public static final String f1985d = "android.intent.extra.changed_uid_list";

    /* renamed from: e */
    public static final String f1986e = "android.intent.extra.HTML_TEXT";

    /* renamed from: f */
    public static final String f1987f = "android.intent.category.LEANBACK_LAUNCHER";

    /* renamed from: g */
    public static final int f1988g = 16384;

    /* renamed from: h */
    public static final int f1989h = 32768;

    /* renamed from: i */
    private static final C0447a f1990i;

    /* renamed from: android.support.v4.d.n$a */
    interface C0447a {
        /* renamed from: a */
        Intent mo1756a(ComponentName componentName);

        /* renamed from: a */
        Intent mo1757a(String str, String str2);

        /* renamed from: b */
        Intent mo1758b(ComponentName componentName);
    }

    /* renamed from: android.support.v4.d.n$b */
    static class C0448b implements C0447a {
        C0448b() {
        }

        /* renamed from: a */
        public Intent mo1756a(ComponentName componentName) {
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.setComponent(componentName);
            intent.addCategory("android.intent.category.LAUNCHER");
            return intent;
        }

        /* renamed from: a */
        public Intent mo1757a(String str, String str2) {
            Intent intent = new Intent(str);
            intent.addCategory(str2);
            return intent;
        }

        /* renamed from: b */
        public Intent mo1758b(ComponentName componentName) {
            Intent a = mo1756a(componentName);
            a.addFlags(268468224);
            return a;
        }
    }

    /* renamed from: android.support.v4.d.n$c */
    static class C0449c extends C0448b {
        C0449c() {
        }

        /* renamed from: a */
        public Intent mo1756a(ComponentName componentName) {
            return C0451o.m2448a(componentName);
        }

        /* renamed from: b */
        public Intent mo1758b(ComponentName componentName) {
            return C0451o.m2449b(componentName);
        }
    }

    /* renamed from: android.support.v4.d.n$d */
    static class C0450d extends C0449c {
        C0450d() {
        }

        /* renamed from: a */
        public Intent mo1757a(String str, String str2) {
            return C0452p.m2450a(str, str2);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 15) {
            f1990i = new C0450d();
        } else if (i >= 11) {
            f1990i = new C0449c();
        } else {
            f1990i = new C0448b();
        }
    }

    private C0446n() {
    }

    /* renamed from: a */
    public static Intent m2436a(ComponentName componentName) {
        return f1990i.mo1756a(componentName);
    }

    /* renamed from: a */
    public static Intent m2437a(String str, String str2) {
        return f1990i.mo1757a(str, str2);
    }

    /* renamed from: b */
    public static Intent m2438b(ComponentName componentName) {
        return f1990i.mo1758b(componentName);
    }
}
