package android.support.p010v4.view.p034a;

import android.os.Build;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: android.support.v4.view.a.a */
public final class C0922a {

    /* renamed from: a */
    public static final int f3235a = 128;

    /* renamed from: b */
    public static final int f3236b = 256;

    /* renamed from: c */
    public static final int f3237c = 512;

    /* renamed from: d */
    public static final int f3238d = 1024;

    /* renamed from: e */
    public static final int f3239e = 2048;

    /* renamed from: f */
    public static final int f3240f = 4096;

    /* renamed from: g */
    public static final int f3241g = 8192;

    /* renamed from: h */
    public static final int f3242h = 16384;

    /* renamed from: i */
    public static final int f3243i = 32768;

    /* renamed from: j */
    public static final int f3244j = 65536;

    /* renamed from: k */
    public static final int f3245k = 131072;

    /* renamed from: l */
    public static final int f3246l = 262144;

    /* renamed from: m */
    public static final int f3247m = 524288;

    /* renamed from: n */
    public static final int f3248n = 1048576;

    /* renamed from: o */
    public static final int f3249o = 2097152;

    /* renamed from: p */
    public static final int f3250p = 4194304;

    /* renamed from: q */
    public static final int f3251q = 8388608;

    /* renamed from: r */
    public static final int f3252r = 16777216;

    /* renamed from: s */
    public static final int f3253s = 0;

    /* renamed from: t */
    public static final int f3254t = 1;

    /* renamed from: u */
    public static final int f3255u = 2;

    /* renamed from: v */
    public static final int f3256v = 4;

    /* renamed from: w */
    public static final int f3257w = -1;

    /* renamed from: x */
    private static final C0927e f3258x;

    /* renamed from: android.support.v4.view.a.a$a */
    static class C0923a extends C0926d {
        C0923a() {
        }

        /* renamed from: a */
        public int mo3100a(AccessibilityEvent accessibilityEvent) {
            return C0929b.m4645a(accessibilityEvent);
        }

        /* renamed from: a */
        public Object mo3101a(AccessibilityEvent accessibilityEvent, int i) {
            return C0929b.m4646a(accessibilityEvent, i);
        }

        /* renamed from: a */
        public void mo3102a(AccessibilityEvent accessibilityEvent, Object obj) {
            C0929b.m4647a(accessibilityEvent, obj);
        }
    }

    /* renamed from: android.support.v4.view.a.a$b */
    static class C0924b extends C0923a {
        C0924b() {
        }

        /* renamed from: b */
        public int mo3103b(AccessibilityEvent accessibilityEvent) {
            return C0930c.m4649a(accessibilityEvent);
        }

        /* renamed from: b */
        public void mo3104b(AccessibilityEvent accessibilityEvent, int i) {
            C0930c.m4650a(accessibilityEvent, i);
        }

        /* renamed from: c */
        public int mo3105c(AccessibilityEvent accessibilityEvent) {
            return C0930c.m4651b(accessibilityEvent);
        }

        /* renamed from: c */
        public void mo3106c(AccessibilityEvent accessibilityEvent, int i) {
            C0930c.m4652b(accessibilityEvent, i);
        }
    }

    /* renamed from: android.support.v4.view.a.a$c */
    static class C0925c extends C0924b {
        C0925c() {
        }

        /* renamed from: d */
        public int mo3107d(AccessibilityEvent accessibilityEvent) {
            return C0931d.m4653a(accessibilityEvent);
        }

        /* renamed from: d */
        public void mo3108d(AccessibilityEvent accessibilityEvent, int i) {
            C0931d.m4654a(accessibilityEvent, i);
        }
    }

    /* renamed from: android.support.v4.view.a.a$d */
    static class C0926d implements C0927e {
        C0926d() {
        }

        /* renamed from: a */
        public int mo3100a(AccessibilityEvent accessibilityEvent) {
            return 0;
        }

        /* renamed from: a */
        public Object mo3101a(AccessibilityEvent accessibilityEvent, int i) {
            return null;
        }

        /* renamed from: a */
        public void mo3102a(AccessibilityEvent accessibilityEvent, Object obj) {
        }

        /* renamed from: b */
        public int mo3103b(AccessibilityEvent accessibilityEvent) {
            return 0;
        }

        /* renamed from: b */
        public void mo3104b(AccessibilityEvent accessibilityEvent, int i) {
        }

        /* renamed from: c */
        public int mo3105c(AccessibilityEvent accessibilityEvent) {
            return 0;
        }

        /* renamed from: c */
        public void mo3106c(AccessibilityEvent accessibilityEvent, int i) {
        }

        /* renamed from: d */
        public int mo3107d(AccessibilityEvent accessibilityEvent) {
            return 0;
        }

        /* renamed from: d */
        public void mo3108d(AccessibilityEvent accessibilityEvent, int i) {
        }
    }

    /* renamed from: android.support.v4.view.a.a$e */
    interface C0927e {
        /* renamed from: a */
        int mo3100a(AccessibilityEvent accessibilityEvent);

        /* renamed from: a */
        Object mo3101a(AccessibilityEvent accessibilityEvent, int i);

        /* renamed from: a */
        void mo3102a(AccessibilityEvent accessibilityEvent, Object obj);

        /* renamed from: b */
        int mo3103b(AccessibilityEvent accessibilityEvent);

        /* renamed from: b */
        void mo3104b(AccessibilityEvent accessibilityEvent, int i);

        /* renamed from: c */
        int mo3105c(AccessibilityEvent accessibilityEvent);

        /* renamed from: c */
        void mo3106c(AccessibilityEvent accessibilityEvent, int i);

        /* renamed from: d */
        int mo3107d(AccessibilityEvent accessibilityEvent);

        /* renamed from: d */
        void mo3108d(AccessibilityEvent accessibilityEvent, int i);
    }

    static {
        if (Build.VERSION.SDK_INT >= 19) {
            f3258x = new C0925c();
        } else if (Build.VERSION.SDK_INT >= 16) {
            f3258x = new C0924b();
        } else if (Build.VERSION.SDK_INT >= 14) {
            f3258x = new C0923a();
        } else {
            f3258x = new C0926d();
        }
    }

    private C0922a() {
    }

    /* renamed from: a */
    public static int m4606a(AccessibilityEvent accessibilityEvent) {
        return f3258x.mo3100a(accessibilityEvent);
    }

    /* renamed from: a */
    public static C0992u m4607a(AccessibilityEvent accessibilityEvent, int i) {
        return new C0992u(f3258x.mo3101a(accessibilityEvent, i));
    }

    /* renamed from: a */
    public static void m4608a(AccessibilityEvent accessibilityEvent, C0992u uVar) {
        f3258x.mo3102a(accessibilityEvent, uVar.mo3427a());
    }

    /* renamed from: b */
    public static C0992u m4609b(AccessibilityEvent accessibilityEvent) {
        return new C0992u(accessibilityEvent);
    }

    /* renamed from: b */
    public static void m4610b(AccessibilityEvent accessibilityEvent, int i) {
        f3258x.mo3108d(accessibilityEvent, i);
    }

    /* renamed from: c */
    public static int m4611c(AccessibilityEvent accessibilityEvent) {
        return f3258x.mo3107d(accessibilityEvent);
    }

    /* renamed from: c */
    public void mo3096c(AccessibilityEvent accessibilityEvent, int i) {
        f3258x.mo3104b(accessibilityEvent, i);
    }

    /* renamed from: d */
    public int mo3097d(AccessibilityEvent accessibilityEvent) {
        return f3258x.mo3103b(accessibilityEvent);
    }

    /* renamed from: d */
    public void mo3098d(AccessibilityEvent accessibilityEvent, int i) {
        f3258x.mo3106c(accessibilityEvent, i);
    }

    /* renamed from: e */
    public int mo3099e(AccessibilityEvent accessibilityEvent) {
        return f3258x.mo3105c(accessibilityEvent);
    }
}
