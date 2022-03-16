package android.support.p010v4.view;

import android.os.Build;
import android.view.KeyEvent;
import android.view.View;

/* renamed from: android.support.v4.view.k */
public final class C1167k {

    /* renamed from: a */
    static final C1170c f3631a;

    /* renamed from: android.support.v4.view.k$a */
    static class C1168a implements C1170c {

        /* renamed from: a */
        private static final int f3632a = 247;

        /* renamed from: b */
        private static final int f3633b = 247;

        C1168a() {
        }

        /* renamed from: a */
        private static int m7006a(int i, int i2, int i3, int i4, int i5) {
            boolean z = true;
            boolean z2 = (i2 & i3) != 0;
            int i6 = i4 | i5;
            if ((i2 & i6) == 0) {
                z = false;
            }
            if (!z2) {
                return z ? i & (i3 ^ -1) : i;
            }
            if (!z) {
                return i & (i6 ^ -1);
            }
            throw new IllegalArgumentException("bad arguments");
        }

        /* renamed from: a */
        public int mo3995a(int i) {
            int i2 = (i & 192) != 0 ? i | 1 : i;
            if ((i2 & 48) != 0) {
                i2 |= 2;
            }
            return i2 & 247;
        }

        /* renamed from: a */
        public boolean mo3996a(int i, int i2) {
            return m7006a(m7006a(mo3995a(i) & 247, i2, 1, 64, 128), i2, 2, 16, 32) == i2;
        }

        /* renamed from: a */
        public boolean mo3997a(KeyEvent keyEvent) {
            return false;
        }

        /* renamed from: b */
        public boolean mo3998b(int i) {
            return (mo3995a(i) & 247) == 0;
        }
    }

    /* renamed from: android.support.v4.view.k$b */
    static class C1169b extends C1168a {
        C1169b() {
        }

        /* renamed from: a */
        public int mo3995a(int i) {
            return C1171l.m7019a(i);
        }

        /* renamed from: a */
        public boolean mo3996a(int i, int i2) {
            return C1171l.m7020a(i, i2);
        }

        /* renamed from: a */
        public boolean mo3997a(KeyEvent keyEvent) {
            return C1171l.m7021a(keyEvent);
        }

        /* renamed from: b */
        public boolean mo3998b(int i) {
            return C1171l.m7022b(i);
        }
    }

    /* renamed from: android.support.v4.view.k$c */
    interface C1170c {
        /* renamed from: a */
        int mo3995a(int i);

        /* renamed from: a */
        boolean mo3996a(int i, int i2);

        /* renamed from: a */
        boolean mo3997a(KeyEvent keyEvent);

        /* renamed from: b */
        boolean mo3998b(int i);
    }

    static {
        if (Build.VERSION.SDK_INT >= 11) {
            f3631a = new C1169b();
        } else {
            f3631a = new C1168a();
        }
    }

    private C1167k() {
    }

    /* renamed from: a */
    public static int m6996a(int i) {
        return f3631a.mo3995a(i);
    }

    @Deprecated
    /* renamed from: a */
    public static Object m6997a(View view) {
        return view.getKeyDispatcherState();
    }

    /* renamed from: a */
    public static boolean m6998a(int i, int i2) {
        return f3631a.mo3996a(i, i2);
    }

    /* renamed from: a */
    public static boolean m6999a(KeyEvent keyEvent) {
        return f3631a.mo3998b(keyEvent.getMetaState());
    }

    /* renamed from: a */
    public static boolean m7000a(KeyEvent keyEvent, int i) {
        return f3631a.mo3996a(keyEvent.getMetaState(), i);
    }

    @Deprecated
    /* renamed from: a */
    public static boolean m7001a(KeyEvent keyEvent, KeyEvent.Callback callback, Object obj, Object obj2) {
        return keyEvent.dispatch(callback, (KeyEvent.DispatcherState) obj, obj2);
    }

    @Deprecated
    /* renamed from: b */
    public static void m7002b(KeyEvent keyEvent) {
        keyEvent.startTracking();
    }

    /* renamed from: b */
    public static boolean m7003b(int i) {
        return f3631a.mo3998b(i);
    }

    @Deprecated
    /* renamed from: c */
    public static boolean m7004c(KeyEvent keyEvent) {
        return keyEvent.isTracking();
    }

    /* renamed from: d */
    public static boolean m7005d(KeyEvent keyEvent) {
        return f3631a.mo3997a(keyEvent);
    }
}
