package android.support.p010v4.view;

import android.os.Build;
import android.view.ViewConfiguration;

/* renamed from: android.support.v4.view.bd */
public final class C1086bd {

    /* renamed from: a */
    static final C1090d f3524a;

    /* renamed from: android.support.v4.view.bd$a */
    static class C1087a implements C1090d {
        C1087a() {
        }

        /* renamed from: a */
        public boolean mo3800a(ViewConfiguration viewConfiguration) {
            return true;
        }
    }

    /* renamed from: android.support.v4.view.bd$b */
    static class C1088b extends C1087a {
        C1088b() {
        }

        /* renamed from: a */
        public boolean mo3800a(ViewConfiguration viewConfiguration) {
            return false;
        }
    }

    /* renamed from: android.support.v4.view.bd$c */
    static class C1089c extends C1088b {
        C1089c() {
        }

        /* renamed from: a */
        public boolean mo3800a(ViewConfiguration viewConfiguration) {
            return C1091be.m6531a(viewConfiguration);
        }
    }

    /* renamed from: android.support.v4.view.bd$d */
    interface C1090d {
        /* renamed from: a */
        boolean mo3800a(ViewConfiguration viewConfiguration);
    }

    static {
        if (Build.VERSION.SDK_INT >= 14) {
            f3524a = new C1089c();
        } else if (Build.VERSION.SDK_INT >= 11) {
            f3524a = new C1088b();
        } else {
            f3524a = new C1087a();
        }
    }

    private C1086bd() {
    }

    @Deprecated
    /* renamed from: a */
    public static int m6525a(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledPagingTouchSlop();
    }

    /* renamed from: b */
    public static boolean m6526b(ViewConfiguration viewConfiguration) {
        return f3524a.mo3800a(viewConfiguration);
    }
}
