package android.support.p010v4.view;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: android.support.v4.view.bf */
public final class C1092bf {

    /* renamed from: a */
    public static final int f3525a = 0;

    /* renamed from: b */
    public static final int f3526b = 1;

    /* renamed from: c */
    static final C1095c f3527c;

    /* renamed from: android.support.v4.view.bf$a */
    static class C1093a extends C1098f {
        C1093a() {
        }

        /* renamed from: a */
        public void mo3801a(ViewGroup viewGroup, boolean z) {
            C1099bg.m6560a(viewGroup, z);
        }
    }

    /* renamed from: android.support.v4.view.bf$b */
    static class C1094b extends C1093a {
        C1094b() {
        }

        /* renamed from: a */
        public boolean mo3802a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return C1100bh.m6561a(viewGroup, view, accessibilityEvent);
        }
    }

    /* renamed from: android.support.v4.view.bf$c */
    interface C1095c {
        /* renamed from: a */
        int mo3803a(ViewGroup viewGroup);

        /* renamed from: a */
        void mo3804a(ViewGroup viewGroup, int i);

        /* renamed from: a */
        void mo3801a(ViewGroup viewGroup, boolean z);

        /* renamed from: a */
        boolean mo3802a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent);

        /* renamed from: b */
        void mo3805b(ViewGroup viewGroup, boolean z);

        /* renamed from: b */
        boolean mo3806b(ViewGroup viewGroup);

        /* renamed from: c */
        int mo3807c(ViewGroup viewGroup);
    }

    /* renamed from: android.support.v4.view.bf$d */
    static class C1096d extends C1094b {
        C1096d() {
        }

        /* renamed from: a */
        public int mo3803a(ViewGroup viewGroup) {
            return C1101bi.m6562a(viewGroup);
        }

        /* renamed from: a */
        public void mo3804a(ViewGroup viewGroup, int i) {
            C1101bi.m6563a(viewGroup, i);
        }
    }

    /* renamed from: android.support.v4.view.bf$e */
    static class C1097e extends C1096d {
        C1097e() {
        }

        /* renamed from: b */
        public void mo3805b(ViewGroup viewGroup, boolean z) {
            C1102bj.m6564a(viewGroup, z);
        }

        /* renamed from: b */
        public boolean mo3806b(ViewGroup viewGroup) {
            return C1102bj.m6565a(viewGroup);
        }

        /* renamed from: c */
        public int mo3807c(ViewGroup viewGroup) {
            return C1102bj.m6566b(viewGroup);
        }
    }

    /* renamed from: android.support.v4.view.bf$f */
    static class C1098f implements C1095c {
        C1098f() {
        }

        /* renamed from: a */
        public int mo3803a(ViewGroup viewGroup) {
            return 0;
        }

        /* renamed from: a */
        public void mo3804a(ViewGroup viewGroup, int i) {
        }

        /* renamed from: a */
        public void mo3801a(ViewGroup viewGroup, boolean z) {
        }

        /* renamed from: a */
        public boolean mo3802a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return true;
        }

        /* renamed from: b */
        public void mo3805b(ViewGroup viewGroup, boolean z) {
        }

        /* renamed from: b */
        public boolean mo3806b(ViewGroup viewGroup) {
            return false;
        }

        /* renamed from: c */
        public int mo3807c(ViewGroup viewGroup) {
            if (viewGroup instanceof C1009ac) {
                return ((C1009ac) viewGroup).getNestedScrollAxes();
            }
            return 0;
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            f3527c = new C1097e();
        } else if (i >= 18) {
            f3527c = new C1096d();
        } else if (i >= 14) {
            f3527c = new C1094b();
        } else if (i >= 11) {
            f3527c = new C1093a();
        } else {
            f3527c = new C1098f();
        }
    }

    private C1092bf() {
    }

    /* renamed from: a */
    public static int m6532a(ViewGroup viewGroup) {
        return f3527c.mo3803a(viewGroup);
    }

    /* renamed from: a */
    public static void m6533a(ViewGroup viewGroup, int i) {
        f3527c.mo3804a(viewGroup, i);
    }

    /* renamed from: a */
    public static void m6534a(ViewGroup viewGroup, boolean z) {
        f3527c.mo3801a(viewGroup, z);
    }

    /* renamed from: a */
    public static boolean m6535a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return f3527c.mo3802a(viewGroup, view, accessibilityEvent);
    }

    /* renamed from: b */
    public static void m6536b(ViewGroup viewGroup, boolean z) {
        f3527c.mo3805b(viewGroup, z);
    }

    /* renamed from: b */
    public static boolean m6537b(ViewGroup viewGroup) {
        return f3527c.mo3806b(viewGroup);
    }

    /* renamed from: c */
    public static int m6538c(ViewGroup viewGroup) {
        return f3527c.mo3807c(viewGroup);
    }
}
