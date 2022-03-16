package android.support.p010v4.view;

import android.os.Build;
import android.view.ViewGroup;

/* renamed from: android.support.v4.view.r */
public final class C1183r {

    /* renamed from: a */
    static final C1184a f3639a;

    /* renamed from: android.support.v4.view.r$a */
    interface C1184a {
        /* renamed from: a */
        int mo4004a(ViewGroup.MarginLayoutParams marginLayoutParams);

        /* renamed from: a */
        void mo4005a(ViewGroup.MarginLayoutParams marginLayoutParams, int i);

        /* renamed from: b */
        int mo4006b(ViewGroup.MarginLayoutParams marginLayoutParams);

        /* renamed from: b */
        void mo4007b(ViewGroup.MarginLayoutParams marginLayoutParams, int i);

        /* renamed from: c */
        void mo4008c(ViewGroup.MarginLayoutParams marginLayoutParams, int i);

        /* renamed from: c */
        boolean mo4009c(ViewGroup.MarginLayoutParams marginLayoutParams);

        /* renamed from: d */
        int mo4010d(ViewGroup.MarginLayoutParams marginLayoutParams);

        /* renamed from: d */
        void mo4011d(ViewGroup.MarginLayoutParams marginLayoutParams, int i);
    }

    /* renamed from: android.support.v4.view.r$b */
    static class C1185b implements C1184a {
        C1185b() {
        }

        /* renamed from: a */
        public int mo4004a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.leftMargin;
        }

        /* renamed from: a */
        public void mo4005a(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
            marginLayoutParams.leftMargin = i;
        }

        /* renamed from: b */
        public int mo4006b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.rightMargin;
        }

        /* renamed from: b */
        public void mo4007b(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
            marginLayoutParams.rightMargin = i;
        }

        /* renamed from: c */
        public void mo4008c(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        }

        /* renamed from: c */
        public boolean mo4009c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return false;
        }

        /* renamed from: d */
        public int mo4010d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return 0;
        }

        /* renamed from: d */
        public void mo4011d(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        }
    }

    /* renamed from: android.support.v4.view.r$c */
    static class C1186c implements C1184a {
        C1186c() {
        }

        /* renamed from: a */
        public int mo4004a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return C1187s.m7069a(marginLayoutParams);
        }

        /* renamed from: a */
        public void mo4005a(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
            C1187s.m7070a(marginLayoutParams, i);
        }

        /* renamed from: b */
        public int mo4006b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return C1187s.m7071b(marginLayoutParams);
        }

        /* renamed from: b */
        public void mo4007b(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
            C1187s.m7072b(marginLayoutParams, i);
        }

        /* renamed from: c */
        public void mo4008c(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
            C1187s.m7073c(marginLayoutParams, i);
        }

        /* renamed from: c */
        public boolean mo4009c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return C1187s.m7074c(marginLayoutParams);
        }

        /* renamed from: d */
        public int mo4010d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return C1187s.m7075d(marginLayoutParams);
        }

        /* renamed from: d */
        public void mo4011d(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
            C1187s.m7076d(marginLayoutParams, i);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 17) {
            f3639a = new C1186c();
        } else {
            f3639a = new C1185b();
        }
    }

    private C1183r() {
    }

    /* renamed from: a */
    public static int m7037a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return f3639a.mo4004a(marginLayoutParams);
    }

    /* renamed from: a */
    public static void m7038a(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        f3639a.mo4005a(marginLayoutParams, i);
    }

    /* renamed from: b */
    public static int m7039b(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return f3639a.mo4006b(marginLayoutParams);
    }

    /* renamed from: b */
    public static void m7040b(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        f3639a.mo4007b(marginLayoutParams, i);
    }

    /* renamed from: c */
    public static void m7041c(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        f3639a.mo4008c(marginLayoutParams, i);
    }

    /* renamed from: c */
    public static boolean m7042c(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return f3639a.mo4009c(marginLayoutParams);
    }

    /* renamed from: d */
    public static int m7043d(ViewGroup.MarginLayoutParams marginLayoutParams) {
        int d = f3639a.mo4010d(marginLayoutParams);
        if (d == 0 || d == 1) {
            return d;
        }
        return 0;
    }

    /* renamed from: d */
    public static void m7044d(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        f3639a.mo4011d(marginLayoutParams, i);
    }
}
