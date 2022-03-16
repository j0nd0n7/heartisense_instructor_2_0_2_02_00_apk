package android.support.p010v4.p029l;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.support.p010v4.p029l.C0836e;

/* renamed from: android.support.v4.l.a */
public final class C0821a {

    /* renamed from: a */
    public static final int f2890a = 1;

    /* renamed from: b */
    public static final int f2891b = 2;

    /* renamed from: c */
    public static final int f2892c = 1;

    /* renamed from: d */
    public static final int f2893d = 2;

    /* renamed from: e */
    public static final int f2894e = 1;

    /* renamed from: f */
    public static final int f2895f = 2;

    /* renamed from: g */
    C0832h f2896g;

    /* renamed from: android.support.v4.l.a$a */
    public interface C0823a {
        /* renamed from: a */
        void mo2702a();
    }

    /* renamed from: android.support.v4.l.a$b */
    private static final class C0824b extends C0827e<C0833b> {
        C0824b(Context context) {
            super(new C0833b(context));
        }
    }

    /* renamed from: android.support.v4.l.a$c */
    private static final class C0825c extends C0827e<C0834c> {
        C0825c(Context context) {
            super(new C0834c(context));
        }
    }

    /* renamed from: android.support.v4.l.a$d */
    private static final class C0826d extends C0827e<C0835d> {
        C0826d(Context context) {
            super(new C0835d(context));
        }
    }

    /* renamed from: android.support.v4.l.a$e */
    private static class C0827e<RealHelper extends C0836e> implements C0832h {

        /* renamed from: a */
        private final RealHelper f2897a;

        protected C0827e(RealHelper realhelper) {
            this.f2897a = realhelper;
        }

        /* renamed from: a */
        public int mo2703a() {
            return this.f2897a.mo2713a();
        }

        /* renamed from: a */
        public void mo2704a(int i) {
            this.f2897a.mo2714a(i);
        }

        /* renamed from: a */
        public void mo2705a(String str, Bitmap bitmap, final C0823a aVar) {
            C08281 r0 = null;
            if (aVar != null) {
                r0 = new C0836e.C0842a() {
                    /* renamed from: a */
                    public void mo2711a() {
                        aVar.mo2702a();
                    }
                };
            }
            this.f2897a.mo2715a(str, bitmap, (C0836e.C0842a) r0);
        }

        /* renamed from: a */
        public void mo2706a(String str, Uri uri, final C0823a aVar) {
            C08292 r0 = null;
            if (aVar != null) {
                r0 = new C0836e.C0842a() {
                    /* renamed from: a */
                    public void mo2711a() {
                        aVar.mo2702a();
                    }
                };
            }
            this.f2897a.mo2716a(str, uri, (C0836e.C0842a) r0);
        }

        /* renamed from: b */
        public int mo2707b() {
            return this.f2897a.mo2719c();
        }

        /* renamed from: b */
        public void mo2708b(int i) {
            this.f2897a.mo2718b(i);
        }

        /* renamed from: c */
        public int mo2709c() {
            return this.f2897a.mo2717b();
        }

        /* renamed from: c */
        public void mo2710c(int i) {
            this.f2897a.mo2720c(i);
        }
    }

    /* renamed from: android.support.v4.l.a$f */
    private static final class C0830f extends C0827e<C0836e> {
        C0830f(Context context) {
            super(new C0836e(context));
        }
    }

    /* renamed from: android.support.v4.l.a$g */
    private static final class C0831g implements C0832h {

        /* renamed from: a */
        int f2902a;

        /* renamed from: b */
        int f2903b;

        /* renamed from: c */
        int f2904c;

        private C0831g() {
            this.f2902a = 2;
            this.f2903b = 2;
            this.f2904c = 1;
        }

        /* renamed from: a */
        public int mo2703a() {
            return this.f2902a;
        }

        /* renamed from: a */
        public void mo2704a(int i) {
            this.f2902a = i;
        }

        /* renamed from: a */
        public void mo2705a(String str, Bitmap bitmap, C0823a aVar) {
        }

        /* renamed from: a */
        public void mo2706a(String str, Uri uri, C0823a aVar) {
        }

        /* renamed from: b */
        public int mo2707b() {
            return this.f2903b;
        }

        /* renamed from: b */
        public void mo2708b(int i) {
            this.f2903b = i;
        }

        /* renamed from: c */
        public int mo2709c() {
            return this.f2904c;
        }

        /* renamed from: c */
        public void mo2710c(int i) {
            this.f2904c = i;
        }
    }

    /* renamed from: android.support.v4.l.a$h */
    interface C0832h {
        /* renamed from: a */
        int mo2703a();

        /* renamed from: a */
        void mo2704a(int i);

        /* renamed from: a */
        void mo2705a(String str, Bitmap bitmap, C0823a aVar);

        /* renamed from: a */
        void mo2706a(String str, Uri uri, C0823a aVar);

        /* renamed from: b */
        int mo2707b();

        /* renamed from: b */
        void mo2708b(int i);

        /* renamed from: c */
        int mo2709c();

        /* renamed from: c */
        void mo2710c(int i);
    }

    public C0821a(Context context) {
        if (!m4105a()) {
            this.f2896g = new C0831g();
        } else if (Build.VERSION.SDK_INT >= 24) {
            this.f2896g = new C0826d(context);
        } else if (Build.VERSION.SDK_INT >= 23) {
            this.f2896g = new C0825c(context);
        } else if (Build.VERSION.SDK_INT >= 20) {
            this.f2896g = new C0824b(context);
        } else {
            this.f2896g = new C0830f(context);
        }
    }

    /* renamed from: a */
    public static boolean m4105a() {
        return Build.VERSION.SDK_INT >= 19;
    }

    /* renamed from: a */
    public void mo2692a(int i) {
        this.f2896g.mo2704a(i);
    }

    /* renamed from: a */
    public void mo2693a(String str, Bitmap bitmap) {
        this.f2896g.mo2705a(str, bitmap, (C0823a) null);
    }

    /* renamed from: a */
    public void mo2694a(String str, Bitmap bitmap, C0823a aVar) {
        this.f2896g.mo2705a(str, bitmap, aVar);
    }

    /* renamed from: a */
    public void mo2695a(String str, Uri uri) {
        this.f2896g.mo2706a(str, uri, (C0823a) null);
    }

    /* renamed from: a */
    public void mo2696a(String str, Uri uri, C0823a aVar) {
        this.f2896g.mo2706a(str, uri, aVar);
    }

    /* renamed from: b */
    public int mo2697b() {
        return this.f2896g.mo2703a();
    }

    /* renamed from: b */
    public void mo2698b(int i) {
        this.f2896g.mo2708b(i);
    }

    /* renamed from: c */
    public int mo2699c() {
        return this.f2896g.mo2707b();
    }

    /* renamed from: c */
    public void mo2700c(int i) {
        this.f2896g.mo2710c(i);
    }

    /* renamed from: d */
    public int mo2701d() {
        return this.f2896g.mo2709c();
    }
}
