package android.support.p010v4.p031n;

import android.os.Build;
import java.util.Locale;

/* renamed from: android.support.v4.n.b */
public final class C0857b {

    /* renamed from: a */
    private static final C0858a f2994a;

    /* renamed from: android.support.v4.n.b$a */
    interface C0858a {
        /* renamed from: a */
        String mo2778a(Locale locale);
    }

    /* renamed from: android.support.v4.n.b$b */
    static class C0859b implements C0858a {
        C0859b() {
        }

        /* renamed from: a */
        public String mo2778a(Locale locale) {
            return null;
        }
    }

    /* renamed from: android.support.v4.n.b$c */
    static class C0860c implements C0858a {
        C0860c() {
        }

        /* renamed from: a */
        public String mo2778a(Locale locale) {
            return C0863d.m4330a(locale);
        }
    }

    /* renamed from: android.support.v4.n.b$d */
    static class C0861d implements C0858a {
        C0861d() {
        }

        /* renamed from: a */
        public String mo2778a(Locale locale) {
            return C0862c.m4328a(locale);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            f2994a = new C0861d();
        } else if (i >= 14) {
            f2994a = new C0860c();
        } else {
            f2994a = new C0859b();
        }
    }

    private C0857b() {
    }

    /* renamed from: a */
    public static String m4323a(Locale locale) {
        return f2994a.mo2778a(locale);
    }
}
