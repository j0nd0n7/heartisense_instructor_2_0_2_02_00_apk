package android.support.p010v4.p011a;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;

/* renamed from: android.support.v4.a.a */
public final class C0153a {

    /* renamed from: a */
    public static final int f1044a = 1;

    /* renamed from: b */
    public static final int f1045b = 2;

    /* renamed from: c */
    public static final int f1046c = 4;

    /* renamed from: d */
    public static final int f1047d = 8;

    /* renamed from: e */
    public static final int f1048e = 32;

    /* renamed from: f */
    public static final int f1049f = -1;

    /* renamed from: g */
    public static final int f1050g = 1;

    /* renamed from: h */
    public static final int f1051h = 2;

    /* renamed from: i */
    public static final int f1052i = 4;

    /* renamed from: j */
    public static final int f1053j = 8;

    /* renamed from: k */
    public static final int f1054k = 16;

    /* renamed from: l */
    public static final int f1055l = 32;

    /* renamed from: m */
    private static final C0158e f1056m;

    /* renamed from: android.support.v4.a.a$a */
    static class C0154a extends C0157d {
        C0154a() {
        }

        /* renamed from: a */
        public boolean mo711a(AccessibilityServiceInfo accessibilityServiceInfo) {
            return C0159b.m791a(accessibilityServiceInfo);
        }

        /* renamed from: b */
        public String mo712b(AccessibilityServiceInfo accessibilityServiceInfo) {
            return C0159b.m792b(accessibilityServiceInfo);
        }

        /* renamed from: c */
        public String mo713c(AccessibilityServiceInfo accessibilityServiceInfo) {
            return C0159b.m793c(accessibilityServiceInfo);
        }

        /* renamed from: d */
        public ResolveInfo mo714d(AccessibilityServiceInfo accessibilityServiceInfo) {
            return C0159b.m794d(accessibilityServiceInfo);
        }

        /* renamed from: e */
        public String mo715e(AccessibilityServiceInfo accessibilityServiceInfo) {
            return C0159b.m795e(accessibilityServiceInfo);
        }

        /* renamed from: f */
        public int mo716f(AccessibilityServiceInfo accessibilityServiceInfo) {
            return mo711a(accessibilityServiceInfo) ? 1 : 0;
        }
    }

    /* renamed from: android.support.v4.a.a$b */
    static class C0155b extends C0154a {
        C0155b() {
        }

        /* renamed from: a */
        public String mo717a(AccessibilityServiceInfo accessibilityServiceInfo, PackageManager packageManager) {
            return C0160c.m796a(accessibilityServiceInfo, packageManager);
        }
    }

    /* renamed from: android.support.v4.a.a$c */
    static class C0156c extends C0155b {
        C0156c() {
        }

        /* renamed from: f */
        public int mo716f(AccessibilityServiceInfo accessibilityServiceInfo) {
            return C0161d.m797a(accessibilityServiceInfo);
        }
    }

    /* renamed from: android.support.v4.a.a$d */
    static class C0157d implements C0158e {
        C0157d() {
        }

        /* renamed from: a */
        public String mo717a(AccessibilityServiceInfo accessibilityServiceInfo, PackageManager packageManager) {
            return null;
        }

        /* renamed from: a */
        public boolean mo711a(AccessibilityServiceInfo accessibilityServiceInfo) {
            return false;
        }

        /* renamed from: b */
        public String mo712b(AccessibilityServiceInfo accessibilityServiceInfo) {
            return null;
        }

        /* renamed from: c */
        public String mo713c(AccessibilityServiceInfo accessibilityServiceInfo) {
            return null;
        }

        /* renamed from: d */
        public ResolveInfo mo714d(AccessibilityServiceInfo accessibilityServiceInfo) {
            return null;
        }

        /* renamed from: e */
        public String mo715e(AccessibilityServiceInfo accessibilityServiceInfo) {
            return null;
        }

        /* renamed from: f */
        public int mo716f(AccessibilityServiceInfo accessibilityServiceInfo) {
            return 0;
        }
    }

    /* renamed from: android.support.v4.a.a$e */
    interface C0158e {
        /* renamed from: a */
        String mo717a(AccessibilityServiceInfo accessibilityServiceInfo, PackageManager packageManager);

        /* renamed from: a */
        boolean mo711a(AccessibilityServiceInfo accessibilityServiceInfo);

        /* renamed from: b */
        String mo712b(AccessibilityServiceInfo accessibilityServiceInfo);

        /* renamed from: c */
        String mo713c(AccessibilityServiceInfo accessibilityServiceInfo);

        /* renamed from: d */
        ResolveInfo mo714d(AccessibilityServiceInfo accessibilityServiceInfo);

        /* renamed from: e */
        String mo715e(AccessibilityServiceInfo accessibilityServiceInfo);

        /* renamed from: f */
        int mo716f(AccessibilityServiceInfo accessibilityServiceInfo);
    }

    static {
        if (Build.VERSION.SDK_INT >= 18) {
            f1056m = new C0156c();
        } else if (Build.VERSION.SDK_INT >= 16) {
            f1056m = new C0155b();
        } else if (Build.VERSION.SDK_INT >= 14) {
            f1056m = new C0154a();
        } else {
            f1056m = new C0157d();
        }
    }

    private C0153a() {
    }

    /* renamed from: a */
    public static String m759a(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        while (i > 0) {
            int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(i);
            i &= numberOfTrailingZeros ^ -1;
            if (sb.length() > 1) {
                sb.append(", ");
            }
            switch (numberOfTrailingZeros) {
                case 1:
                    sb.append("FEEDBACK_SPOKEN");
                    break;
                case 2:
                    sb.append("FEEDBACK_HAPTIC");
                    break;
                case 4:
                    sb.append("FEEDBACK_AUDIBLE");
                    break;
                case 8:
                    sb.append("FEEDBACK_VISUAL");
                    break;
                case 16:
                    sb.append("FEEDBACK_GENERIC");
                    break;
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: a */
    public static String m760a(AccessibilityServiceInfo accessibilityServiceInfo) {
        return f1056m.mo713c(accessibilityServiceInfo);
    }

    /* renamed from: a */
    public static String m761a(AccessibilityServiceInfo accessibilityServiceInfo, PackageManager packageManager) {
        return f1056m.mo717a(accessibilityServiceInfo, packageManager);
    }

    /* renamed from: b */
    public static ResolveInfo m762b(AccessibilityServiceInfo accessibilityServiceInfo) {
        return f1056m.mo714d(accessibilityServiceInfo);
    }

    /* renamed from: b */
    public static String m763b(int i) {
        switch (i) {
            case 1:
                return "DEFAULT";
            case 2:
                return "FLAG_INCLUDE_NOT_IMPORTANT_VIEWS";
            case 4:
                return "FLAG_REQUEST_TOUCH_EXPLORATION_MODE";
            case 8:
                return "FLAG_REQUEST_ENHANCED_WEB_ACCESSIBILITY";
            case 16:
                return "FLAG_REPORT_VIEW_IDS";
            case 32:
                return "FLAG_REQUEST_FILTER_KEY_EVENTS";
            default:
                return null;
        }
    }

    /* renamed from: c */
    public static String m764c(int i) {
        switch (i) {
            case 1:
                return "CAPABILITY_CAN_RETRIEVE_WINDOW_CONTENT";
            case 2:
                return "CAPABILITY_CAN_REQUEST_TOUCH_EXPLORATION";
            case 4:
                return "CAPABILITY_CAN_REQUEST_ENHANCED_WEB_ACCESSIBILITY";
            case 8:
                return "CAPABILITY_CAN_FILTER_KEY_EVENTS";
            default:
                return "UNKNOWN";
        }
    }

    /* renamed from: c */
    public static String m765c(AccessibilityServiceInfo accessibilityServiceInfo) {
        return f1056m.mo715e(accessibilityServiceInfo);
    }

    /* renamed from: d */
    public static boolean m766d(AccessibilityServiceInfo accessibilityServiceInfo) {
        return f1056m.mo711a(accessibilityServiceInfo);
    }

    /* renamed from: e */
    public static String m767e(AccessibilityServiceInfo accessibilityServiceInfo) {
        return f1056m.mo712b(accessibilityServiceInfo);
    }

    /* renamed from: f */
    public static int m768f(AccessibilityServiceInfo accessibilityServiceInfo) {
        return f1056m.mo716f(accessibilityServiceInfo);
    }
}
