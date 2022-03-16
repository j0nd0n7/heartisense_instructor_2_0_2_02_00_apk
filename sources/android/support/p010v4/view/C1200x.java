package android.support.p010v4.view;

import android.os.Build;
import android.view.MotionEvent;

/* renamed from: android.support.v4.view.x */
public final class C1200x {

    /* renamed from: A */
    public static final int f3650A = 16;

    /* renamed from: B */
    public static final int f3651B = 17;

    /* renamed from: C */
    public static final int f3652C = 18;

    /* renamed from: D */
    public static final int f3653D = 19;

    /* renamed from: E */
    public static final int f3654E = 20;

    /* renamed from: F */
    public static final int f3655F = 21;

    /* renamed from: G */
    public static final int f3656G = 22;

    /* renamed from: H */
    public static final int f3657H = 23;

    /* renamed from: I */
    public static final int f3658I = 24;

    /* renamed from: J */
    public static final int f3659J = 25;

    /* renamed from: K */
    public static final int f3660K = 27;

    /* renamed from: L */
    public static final int f3661L = 28;

    /* renamed from: M */
    public static final int f3662M = 32;

    /* renamed from: N */
    public static final int f3663N = 33;

    /* renamed from: O */
    public static final int f3664O = 34;

    /* renamed from: P */
    public static final int f3665P = 35;

    /* renamed from: Q */
    public static final int f3666Q = 36;

    /* renamed from: R */
    public static final int f3667R = 37;

    /* renamed from: S */
    public static final int f3668S = 38;

    /* renamed from: T */
    public static final int f3669T = 39;

    /* renamed from: U */
    public static final int f3670U = 40;

    /* renamed from: V */
    public static final int f3671V = 41;

    /* renamed from: W */
    public static final int f3672W = 42;

    /* renamed from: X */
    public static final int f3673X = 43;

    /* renamed from: Y */
    public static final int f3674Y = 44;

    /* renamed from: Z */
    public static final int f3675Z = 45;

    /* renamed from: a */
    static final C1204d f3676a;

    /* renamed from: aa */
    public static final int f3677aa = 46;

    /* renamed from: ab */
    public static final int f3678ab = 47;

    /* renamed from: ac */
    public static final int f3679ac = 1;

    /* renamed from: b */
    public static final int f3680b = 255;

    /* renamed from: c */
    public static final int f3681c = 5;

    /* renamed from: d */
    public static final int f3682d = 6;

    /* renamed from: e */
    public static final int f3683e = 7;

    /* renamed from: f */
    public static final int f3684f = 8;

    /* renamed from: g */
    public static final int f3685g = 65280;

    /* renamed from: h */
    public static final int f3686h = 8;

    /* renamed from: i */
    public static final int f3687i = 9;

    /* renamed from: j */
    public static final int f3688j = 10;

    /* renamed from: k */
    public static final int f3689k = 0;

    /* renamed from: l */
    public static final int f3690l = 1;

    /* renamed from: m */
    public static final int f3691m = 2;

    /* renamed from: n */
    public static final int f3692n = 3;

    /* renamed from: o */
    public static final int f3693o = 4;

    /* renamed from: p */
    public static final int f3694p = 5;

    /* renamed from: q */
    public static final int f3695q = 6;

    /* renamed from: r */
    public static final int f3696r = 7;

    /* renamed from: s */
    public static final int f3697s = 8;

    /* renamed from: t */
    public static final int f3698t = 9;

    /* renamed from: u */
    public static final int f3699u = 10;

    /* renamed from: v */
    public static final int f3700v = 11;

    /* renamed from: w */
    public static final int f3701w = 12;

    /* renamed from: x */
    public static final int f3702x = 13;

    /* renamed from: y */
    public static final int f3703y = 14;

    /* renamed from: z */
    public static final int f3704z = 15;

    /* renamed from: android.support.v4.view.x$a */
    static class C1201a implements C1204d {
        C1201a() {
        }

        /* renamed from: a */
        public float mo4026a(MotionEvent motionEvent, int i) {
            return 0.0f;
        }

        /* renamed from: a */
        public float mo4027a(MotionEvent motionEvent, int i, int i2) {
            return 0.0f;
        }

        /* renamed from: a */
        public int mo4028a(MotionEvent motionEvent) {
            return 0;
        }
    }

    /* renamed from: android.support.v4.view.x$b */
    static class C1202b extends C1201a {
        C1202b() {
        }

        /* renamed from: a */
        public float mo4026a(MotionEvent motionEvent, int i) {
            return C1205y.m7151a(motionEvent, i);
        }

        /* renamed from: a */
        public float mo4027a(MotionEvent motionEvent, int i, int i2) {
            return C1205y.m7152a(motionEvent, i, i2);
        }
    }

    /* renamed from: android.support.v4.view.x$c */
    private static class C1203c extends C1202b {
        C1203c() {
        }

        /* renamed from: a */
        public int mo4028a(MotionEvent motionEvent) {
            return C1206z.m7153a(motionEvent);
        }
    }

    /* renamed from: android.support.v4.view.x$d */
    interface C1204d {
        /* renamed from: a */
        float mo4026a(MotionEvent motionEvent, int i);

        /* renamed from: a */
        float mo4027a(MotionEvent motionEvent, int i, int i2);

        /* renamed from: a */
        int mo4028a(MotionEvent motionEvent);
    }

    static {
        if (Build.VERSION.SDK_INT >= 14) {
            f3676a = new C1203c();
        } else if (Build.VERSION.SDK_INT >= 12) {
            f3676a = new C1202b();
        } else {
            f3676a = new C1201a();
        }
    }

    private C1200x() {
    }

    /* renamed from: a */
    public static float m7130a(MotionEvent motionEvent, int i, int i2) {
        return f3676a.mo4027a(motionEvent, i, i2);
    }

    /* renamed from: a */
    public static int m7131a(MotionEvent motionEvent) {
        return motionEvent.getAction() & 255;
    }

    @Deprecated
    /* renamed from: a */
    public static int m7132a(MotionEvent motionEvent, int i) {
        return motionEvent.findPointerIndex(i);
    }

    /* renamed from: b */
    public static int m7133b(MotionEvent motionEvent) {
        return (motionEvent.getAction() & f3685g) >> 8;
    }

    @Deprecated
    /* renamed from: b */
    public static int m7134b(MotionEvent motionEvent, int i) {
        return motionEvent.getPointerId(i);
    }

    @Deprecated
    /* renamed from: c */
    public static float m7135c(MotionEvent motionEvent, int i) {
        return motionEvent.getX(i);
    }

    @Deprecated
    /* renamed from: c */
    public static int m7136c(MotionEvent motionEvent) {
        return motionEvent.getPointerCount();
    }

    @Deprecated
    /* renamed from: d */
    public static float m7137d(MotionEvent motionEvent, int i) {
        return motionEvent.getY(i);
    }

    @Deprecated
    /* renamed from: d */
    public static int m7138d(MotionEvent motionEvent) {
        return motionEvent.getSource();
    }

    /* renamed from: e */
    public static int m7139e(MotionEvent motionEvent) {
        return f3676a.mo4028a(motionEvent);
    }

    /* renamed from: e */
    public static boolean m7140e(MotionEvent motionEvent, int i) {
        return (motionEvent.getSource() & i) == i;
    }

    /* renamed from: f */
    public static float m7141f(MotionEvent motionEvent, int i) {
        return f3676a.mo4026a(motionEvent, i);
    }
}
