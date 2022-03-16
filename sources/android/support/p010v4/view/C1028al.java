package android.support.p010v4.view;

import android.os.Build;

/* renamed from: android.support.v4.view.al */
public final class C1028al {

    /* renamed from: a */
    static final C1031c f3458a;

    /* renamed from: android.support.v4.view.al$a */
    private static class C1029a implements C1031c {
        C1029a() {
        }

        /* renamed from: a */
        public void mo3632a(Object obj, boolean z) {
        }

        /* renamed from: a */
        public boolean mo3633a(Object obj) {
            return false;
        }
    }

    /* renamed from: android.support.v4.view.al$b */
    private static class C1030b implements C1031c {
        C1030b() {
        }

        /* renamed from: a */
        public void mo3632a(Object obj, boolean z) {
            C1032am.m5839a(obj, z);
        }

        /* renamed from: a */
        public boolean mo3633a(Object obj) {
            return C1032am.m5840a(obj);
        }
    }

    /* renamed from: android.support.v4.view.al$c */
    interface C1031c {
        /* renamed from: a */
        void mo3632a(Object obj, boolean z);

        /* renamed from: a */
        boolean mo3633a(Object obj);
    }

    static {
        if (Build.VERSION.SDK_INT >= 19) {
            f3458a = new C1030b();
        } else {
            f3458a = new C1029a();
        }
    }

    private C1028al() {
    }

    /* renamed from: a */
    public static void m5831a(Object obj, boolean z) {
        f3458a.mo3632a(obj, z);
    }

    /* renamed from: a */
    public static boolean m5832a(Object obj) {
        return f3458a.mo3633a(obj);
    }
}
