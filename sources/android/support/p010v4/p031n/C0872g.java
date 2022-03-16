package android.support.p010v4.p031n;

import android.os.Build;
import android.support.annotation.C0003aa;
import android.support.annotation.C0047z;
import java.util.Locale;

/* renamed from: android.support.v4.n.g */
public final class C0872g {

    /* renamed from: a */
    public static final Locale f3016a = new Locale("", "");

    /* renamed from: b */
    static String f3017b = "Arab";

    /* renamed from: c */
    static String f3018c = "Hebr";

    /* renamed from: d */
    private static final C0873a f3019d;

    /* renamed from: android.support.v4.n.g$a */
    private static class C0873a {
        C0873a() {
        }

        /* renamed from: b */
        private static int m4347b(@C0047z Locale locale) {
            switch (Character.getDirectionality(locale.getDisplayName(locale).charAt(0))) {
                case 1:
                case 2:
                    return 1;
                default:
                    return 0;
            }
        }

        /* renamed from: a */
        public int mo2783a(@C0003aa Locale locale) {
            if (locale != null && !locale.equals(C0872g.f3016a)) {
                String a = C0857b.m4323a(locale);
                if (a == null) {
                    return m4347b(locale);
                }
                if (a.equalsIgnoreCase(C0872g.f3017b) || a.equalsIgnoreCase(C0872g.f3018c)) {
                    return 1;
                }
            }
            return 0;
        }

        @C0047z
        /* renamed from: a */
        public String mo2784a(@C0047z String str) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                switch (charAt) {
                    case '\"':
                        sb.append("&quot;");
                        break;
                    case '&':
                        sb.append("&amp;");
                        break;
                    case '\'':
                        sb.append("&#39;");
                        break;
                    case '<':
                        sb.append("&lt;");
                        break;
                    case '>':
                        sb.append("&gt;");
                        break;
                    default:
                        sb.append(charAt);
                        break;
                }
            }
            return sb.toString();
        }
    }

    /* renamed from: android.support.v4.n.g$b */
    private static class C0874b extends C0873a {
        C0874b() {
        }

        /* renamed from: a */
        public int mo2783a(@C0003aa Locale locale) {
            return C0875h.m4352a(locale);
        }

        @C0047z
        /* renamed from: a */
        public String mo2784a(@C0047z String str) {
            return C0875h.m4353a(str);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 17) {
            f3019d = new C0874b();
        } else {
            f3019d = new C0873a();
        }
    }

    private C0872g() {
    }

    /* renamed from: a */
    public static int m4345a(@C0003aa Locale locale) {
        return f3019d.mo2783a(locale);
    }

    @C0047z
    /* renamed from: a */
    public static String m4346a(@C0047z String str) {
        return f3019d.mo2784a(str);
    }
}
