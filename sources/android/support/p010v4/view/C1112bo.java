package android.support.p010v4.view;

import android.graphics.Paint;
import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* renamed from: android.support.v4.view.bo */
public final class C1112bo {

    /* renamed from: d */
    static final int f3530d = 2113929216;

    /* renamed from: e */
    static final C1121g f3531e;

    /* renamed from: f */
    private static final String f3532f = "ViewAnimatorCompat";

    /* renamed from: a */
    Runnable f3533a = null;

    /* renamed from: b */
    Runnable f3534b = null;

    /* renamed from: c */
    int f3535c = -1;

    /* renamed from: g */
    private WeakReference<View> f3536g;

    /* renamed from: android.support.v4.view.bo$a */
    static class C1113a implements C1121g {

        /* renamed from: a */
        WeakHashMap<View, Runnable> f3537a = null;

        /* renamed from: android.support.v4.view.bo$a$a */
        class C1114a implements Runnable {

            /* renamed from: a */
            WeakReference<View> f3538a;

            /* renamed from: b */
            C1112bo f3539b;

            C1114a(C1112bo boVar, View view) {
                this.f3538a = new WeakReference<>(view);
                this.f3539b = boVar;
            }

            public void run() {
                View view = (View) this.f3538a.get();
                if (view != null) {
                    C1113a.this.mo3873g(this.f3539b, view);
                }
            }
        }

        C1113a() {
        }

        /* renamed from: a */
        private void m6649a(View view) {
            Runnable runnable;
            if (this.f3537a != null && (runnable = this.f3537a.get(view)) != null) {
                view.removeCallbacks(runnable);
            }
        }

        /* renamed from: h */
        private void m6650h(C1112bo boVar, View view) {
            Runnable runnable = null;
            if (this.f3537a != null) {
                runnable = this.f3537a.get(view);
            }
            if (runnable == null) {
                runnable = new C1114a(boVar, view);
                if (this.f3537a == null) {
                    this.f3537a = new WeakHashMap<>();
                }
                this.f3537a.put(view, runnable);
            }
            view.removeCallbacks(runnable);
            view.post(runnable);
        }

        /* renamed from: a */
        public long mo3854a(C1112bo boVar, View view) {
            return 0;
        }

        /* renamed from: a */
        public void mo3855a(C1112bo boVar, View view, float f) {
            m6650h(boVar, view);
        }

        /* renamed from: a */
        public void mo3856a(C1112bo boVar, View view, long j) {
        }

        /* renamed from: a */
        public void mo3857a(C1112bo boVar, View view, C1130bu buVar) {
            view.setTag(C1112bo.f3530d, buVar);
        }

        /* renamed from: a */
        public void mo3858a(C1112bo boVar, View view, C1132bw bwVar) {
        }

        /* renamed from: a */
        public void mo3859a(C1112bo boVar, View view, Interpolator interpolator) {
        }

        /* renamed from: a */
        public void mo3860a(C1112bo boVar, View view, Runnable runnable) {
            boVar.f3534b = runnable;
            m6650h(boVar, view);
        }

        /* renamed from: b */
        public Interpolator mo3861b(C1112bo boVar, View view) {
            return null;
        }

        /* renamed from: b */
        public void mo3862b(C1112bo boVar, View view, float f) {
            m6650h(boVar, view);
        }

        /* renamed from: b */
        public void mo3863b(C1112bo boVar, View view, long j) {
        }

        /* renamed from: b */
        public void mo3864b(C1112bo boVar, View view, Runnable runnable) {
            boVar.f3533a = runnable;
            m6650h(boVar, view);
        }

        /* renamed from: c */
        public long mo3865c(C1112bo boVar, View view) {
            return 0;
        }

        /* renamed from: c */
        public void mo3866c(C1112bo boVar, View view, float f) {
            m6650h(boVar, view);
        }

        /* renamed from: d */
        public void mo3867d(C1112bo boVar, View view) {
            m6650h(boVar, view);
        }

        /* renamed from: d */
        public void mo3868d(C1112bo boVar, View view, float f) {
            m6650h(boVar, view);
        }

        /* renamed from: e */
        public void mo3869e(C1112bo boVar, View view) {
            m6649a(view);
            mo3873g(boVar, view);
        }

        /* renamed from: e */
        public void mo3870e(C1112bo boVar, View view, float f) {
            m6650h(boVar, view);
        }

        /* renamed from: f */
        public void mo3871f(C1112bo boVar, View view) {
        }

        /* renamed from: f */
        public void mo3872f(C1112bo boVar, View view, float f) {
            m6650h(boVar, view);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo3873g(C1112bo boVar, View view) {
            Object tag = view.getTag(C1112bo.f3530d);
            C1130bu buVar = tag instanceof C1130bu ? (C1130bu) tag : null;
            Runnable runnable = boVar.f3533a;
            Runnable runnable2 = boVar.f3534b;
            boVar.f3533a = null;
            boVar.f3534b = null;
            if (runnable != null) {
                runnable.run();
            }
            if (buVar != null) {
                buVar.mo3893a(view);
                buVar.mo3894b(view);
            }
            if (runnable2 != null) {
                runnable2.run();
            }
            if (this.f3537a != null) {
                this.f3537a.remove(view);
            }
        }

        /* renamed from: g */
        public void mo3874g(C1112bo boVar, View view, float f) {
            m6650h(boVar, view);
        }

        /* renamed from: h */
        public void mo3875h(C1112bo boVar, View view, float f) {
            m6650h(boVar, view);
        }

        /* renamed from: i */
        public void mo3876i(C1112bo boVar, View view, float f) {
            m6650h(boVar, view);
        }

        /* renamed from: j */
        public void mo3877j(C1112bo boVar, View view, float f) {
            m6650h(boVar, view);
        }

        /* renamed from: k */
        public void mo3878k(C1112bo boVar, View view, float f) {
            m6650h(boVar, view);
        }

        /* renamed from: l */
        public void mo3879l(C1112bo boVar, View view, float f) {
            m6650h(boVar, view);
        }

        /* renamed from: m */
        public void mo3880m(C1112bo boVar, View view, float f) {
            m6650h(boVar, view);
        }

        /* renamed from: n */
        public void mo3881n(C1112bo boVar, View view, float f) {
            m6650h(boVar, view);
        }

        /* renamed from: o */
        public void mo3882o(C1112bo boVar, View view, float f) {
            m6650h(boVar, view);
        }

        /* renamed from: p */
        public void mo3883p(C1112bo boVar, View view, float f) {
            m6650h(boVar, view);
        }

        /* renamed from: q */
        public void mo3884q(C1112bo boVar, View view, float f) {
            m6650h(boVar, view);
        }

        /* renamed from: r */
        public void mo3885r(C1112bo boVar, View view, float f) {
            m6650h(boVar, view);
        }

        /* renamed from: s */
        public void mo3886s(C1112bo boVar, View view, float f) {
        }

        /* renamed from: t */
        public void mo3887t(C1112bo boVar, View view, float f) {
        }

        /* renamed from: u */
        public void mo3888u(C1112bo boVar, View view, float f) {
            m6650h(boVar, view);
        }

        /* renamed from: v */
        public void mo3889v(C1112bo boVar, View view, float f) {
            m6650h(boVar, view);
        }

        /* renamed from: w */
        public void mo3890w(C1112bo boVar, View view, float f) {
        }

        /* renamed from: x */
        public void mo3891x(C1112bo boVar, View view, float f) {
        }
    }

    /* renamed from: android.support.v4.view.bo$b */
    static class C1115b extends C1113a {

        /* renamed from: b */
        WeakHashMap<View, Integer> f3541b = null;

        /* renamed from: android.support.v4.view.bo$b$a */
        static class C1116a implements C1130bu {

            /* renamed from: a */
            C1112bo f3542a;

            /* renamed from: b */
            boolean f3543b;

            C1116a(C1112bo boVar) {
                this.f3542a = boVar;
            }

            /* renamed from: a */
            public void mo3893a(View view) {
                this.f3543b = false;
                if (this.f3542a.f3535c >= 0) {
                    C1040ar.m5884a(view, 2, (Paint) null);
                }
                if (this.f3542a.f3533a != null) {
                    Runnable runnable = this.f3542a.f3533a;
                    this.f3542a.f3533a = null;
                    runnable.run();
                }
                Object tag = view.getTag(C1112bo.f3530d);
                C1130bu buVar = tag instanceof C1130bu ? (C1130bu) tag : null;
                if (buVar != null) {
                    buVar.mo3893a(view);
                }
            }

            /* renamed from: b */
            public void mo3894b(View view) {
                if (this.f3542a.f3535c >= 0) {
                    C1040ar.m5884a(view, this.f3542a.f3535c, (Paint) null);
                    this.f3542a.f3535c = -1;
                }
                if (Build.VERSION.SDK_INT >= 16 || !this.f3543b) {
                    if (this.f3542a.f3534b != null) {
                        Runnable runnable = this.f3542a.f3534b;
                        this.f3542a.f3534b = null;
                        runnable.run();
                    }
                    Object tag = view.getTag(C1112bo.f3530d);
                    C1130bu buVar = tag instanceof C1130bu ? (C1130bu) tag : null;
                    if (buVar != null) {
                        buVar.mo3894b(view);
                    }
                    this.f3543b = true;
                }
            }

            /* renamed from: c */
            public void mo3895c(View view) {
                Object tag = view.getTag(C1112bo.f3530d);
                C1130bu buVar = tag instanceof C1130bu ? (C1130bu) tag : null;
                if (buVar != null) {
                    buVar.mo3895c(view);
                }
            }
        }

        C1115b() {
        }

        /* renamed from: a */
        public long mo3854a(C1112bo boVar, View view) {
            return C1122bp.m6770a(view);
        }

        /* renamed from: a */
        public void mo3855a(C1112bo boVar, View view, float f) {
            C1122bp.m6771a(view, f);
        }

        /* renamed from: a */
        public void mo3856a(C1112bo boVar, View view, long j) {
            C1122bp.m6772a(view, j);
        }

        /* renamed from: a */
        public void mo3857a(C1112bo boVar, View view, C1130bu buVar) {
            view.setTag(C1112bo.f3530d, buVar);
            C1122bp.m6773a(view, (C1130bu) new C1116a(boVar));
        }

        /* renamed from: a */
        public void mo3859a(C1112bo boVar, View view, Interpolator interpolator) {
            C1122bp.m6774a(view, interpolator);
        }

        /* renamed from: a */
        public void mo3860a(C1112bo boVar, View view, Runnable runnable) {
            C1122bp.m6773a(view, (C1130bu) new C1116a(boVar));
            boVar.f3534b = runnable;
        }

        /* renamed from: b */
        public void mo3862b(C1112bo boVar, View view, float f) {
            C1122bp.m6776b(view, f);
        }

        /* renamed from: b */
        public void mo3863b(C1112bo boVar, View view, long j) {
            C1122bp.m6777b(view, j);
        }

        /* renamed from: b */
        public void mo3864b(C1112bo boVar, View view, Runnable runnable) {
            C1122bp.m6773a(view, (C1130bu) new C1116a(boVar));
            boVar.f3533a = runnable;
        }

        /* renamed from: c */
        public long mo3865c(C1112bo boVar, View view) {
            return C1122bp.m6775b(view);
        }

        /* renamed from: c */
        public void mo3866c(C1112bo boVar, View view, float f) {
            C1122bp.m6779c(view, f);
        }

        /* renamed from: d */
        public void mo3867d(C1112bo boVar, View view) {
            C1122bp.m6778c(view);
        }

        /* renamed from: d */
        public void mo3868d(C1112bo boVar, View view, float f) {
            C1122bp.m6781d(view, f);
        }

        /* renamed from: e */
        public void mo3869e(C1112bo boVar, View view) {
            C1122bp.m6780d(view);
        }

        /* renamed from: e */
        public void mo3870e(C1112bo boVar, View view, float f) {
            C1122bp.m6782e(view, f);
        }

        /* renamed from: f */
        public void mo3871f(C1112bo boVar, View view) {
            boVar.f3535c = C1040ar.m5941i(view);
            C1122bp.m6773a(view, (C1130bu) new C1116a(boVar));
        }

        /* renamed from: f */
        public void mo3872f(C1112bo boVar, View view, float f) {
            C1122bp.m6783f(view, f);
        }

        /* renamed from: g */
        public void mo3874g(C1112bo boVar, View view, float f) {
            C1122bp.m6784g(view, f);
        }

        /* renamed from: h */
        public void mo3875h(C1112bo boVar, View view, float f) {
            C1122bp.m6785h(view, f);
        }

        /* renamed from: i */
        public void mo3876i(C1112bo boVar, View view, float f) {
            C1122bp.m6786i(view, f);
        }

        /* renamed from: j */
        public void mo3877j(C1112bo boVar, View view, float f) {
            C1122bp.m6787j(view, f);
        }

        /* renamed from: k */
        public void mo3878k(C1112bo boVar, View view, float f) {
            C1122bp.m6788k(view, f);
        }

        /* renamed from: l */
        public void mo3879l(C1112bo boVar, View view, float f) {
            C1122bp.m6789l(view, f);
        }

        /* renamed from: m */
        public void mo3880m(C1112bo boVar, View view, float f) {
            C1122bp.m6790m(view, f);
        }

        /* renamed from: n */
        public void mo3881n(C1112bo boVar, View view, float f) {
            C1122bp.m6791n(view, f);
        }

        /* renamed from: o */
        public void mo3882o(C1112bo boVar, View view, float f) {
            C1122bp.m6792o(view, f);
        }

        /* renamed from: p */
        public void mo3883p(C1112bo boVar, View view, float f) {
            C1122bp.m6793p(view, f);
        }

        /* renamed from: q */
        public void mo3884q(C1112bo boVar, View view, float f) {
            C1122bp.m6794q(view, f);
        }

        /* renamed from: r */
        public void mo3885r(C1112bo boVar, View view, float f) {
            C1122bp.m6795r(view, f);
        }

        /* renamed from: u */
        public void mo3888u(C1112bo boVar, View view, float f) {
            C1122bp.m6796s(view, f);
        }

        /* renamed from: v */
        public void mo3889v(C1112bo boVar, View view, float f) {
            C1122bp.m6797t(view, f);
        }
    }

    /* renamed from: android.support.v4.view.bo$c */
    static class C1117c extends C1118d {
        C1117c() {
        }

        /* renamed from: b */
        public Interpolator mo3861b(C1112bo boVar, View view) {
            return C1126br.m6802a(view);
        }
    }

    /* renamed from: android.support.v4.view.bo$d */
    static class C1118d extends C1115b {
        C1118d() {
        }

        /* renamed from: a */
        public void mo3857a(C1112bo boVar, View view, C1130bu buVar) {
            C1124bq.m6799a(view, buVar);
        }

        /* renamed from: a */
        public void mo3860a(C1112bo boVar, View view, Runnable runnable) {
            C1124bq.m6801b(view, runnable);
        }

        /* renamed from: b */
        public void mo3864b(C1112bo boVar, View view, Runnable runnable) {
            C1124bq.m6800a(view, runnable);
        }

        /* renamed from: f */
        public void mo3871f(C1112bo boVar, View view) {
            C1124bq.m6798a(view);
        }
    }

    /* renamed from: android.support.v4.view.bo$e */
    static class C1119e extends C1117c {
        C1119e() {
        }

        /* renamed from: a */
        public void mo3858a(C1112bo boVar, View view, C1132bw bwVar) {
            C1127bs.m6803a(view, bwVar);
        }
    }

    /* renamed from: android.support.v4.view.bo$f */
    static class C1120f extends C1119e {
        C1120f() {
        }

        /* renamed from: s */
        public void mo3886s(C1112bo boVar, View view, float f) {
            C1129bt.m6806c(view, f);
        }

        /* renamed from: t */
        public void mo3887t(C1112bo boVar, View view, float f) {
            C1129bt.m6807d(view, f);
        }

        /* renamed from: w */
        public void mo3890w(C1112bo boVar, View view, float f) {
            C1129bt.m6804a(view, f);
        }

        /* renamed from: x */
        public void mo3891x(C1112bo boVar, View view, float f) {
            C1129bt.m6805b(view, f);
        }
    }

    /* renamed from: android.support.v4.view.bo$g */
    interface C1121g {
        /* renamed from: a */
        long mo3854a(C1112bo boVar, View view);

        /* renamed from: a */
        void mo3855a(C1112bo boVar, View view, float f);

        /* renamed from: a */
        void mo3856a(C1112bo boVar, View view, long j);

        /* renamed from: a */
        void mo3857a(C1112bo boVar, View view, C1130bu buVar);

        /* renamed from: a */
        void mo3858a(C1112bo boVar, View view, C1132bw bwVar);

        /* renamed from: a */
        void mo3859a(C1112bo boVar, View view, Interpolator interpolator);

        /* renamed from: a */
        void mo3860a(C1112bo boVar, View view, Runnable runnable);

        /* renamed from: b */
        Interpolator mo3861b(C1112bo boVar, View view);

        /* renamed from: b */
        void mo3862b(C1112bo boVar, View view, float f);

        /* renamed from: b */
        void mo3863b(C1112bo boVar, View view, long j);

        /* renamed from: b */
        void mo3864b(C1112bo boVar, View view, Runnable runnable);

        /* renamed from: c */
        long mo3865c(C1112bo boVar, View view);

        /* renamed from: c */
        void mo3866c(C1112bo boVar, View view, float f);

        /* renamed from: d */
        void mo3867d(C1112bo boVar, View view);

        /* renamed from: d */
        void mo3868d(C1112bo boVar, View view, float f);

        /* renamed from: e */
        void mo3869e(C1112bo boVar, View view);

        /* renamed from: e */
        void mo3870e(C1112bo boVar, View view, float f);

        /* renamed from: f */
        void mo3871f(C1112bo boVar, View view);

        /* renamed from: f */
        void mo3872f(C1112bo boVar, View view, float f);

        /* renamed from: g */
        void mo3874g(C1112bo boVar, View view, float f);

        /* renamed from: h */
        void mo3875h(C1112bo boVar, View view, float f);

        /* renamed from: i */
        void mo3876i(C1112bo boVar, View view, float f);

        /* renamed from: j */
        void mo3877j(C1112bo boVar, View view, float f);

        /* renamed from: k */
        void mo3878k(C1112bo boVar, View view, float f);

        /* renamed from: l */
        void mo3879l(C1112bo boVar, View view, float f);

        /* renamed from: m */
        void mo3880m(C1112bo boVar, View view, float f);

        /* renamed from: n */
        void mo3881n(C1112bo boVar, View view, float f);

        /* renamed from: o */
        void mo3882o(C1112bo boVar, View view, float f);

        /* renamed from: p */
        void mo3883p(C1112bo boVar, View view, float f);

        /* renamed from: q */
        void mo3884q(C1112bo boVar, View view, float f);

        /* renamed from: r */
        void mo3885r(C1112bo boVar, View view, float f);

        /* renamed from: s */
        void mo3886s(C1112bo boVar, View view, float f);

        /* renamed from: t */
        void mo3887t(C1112bo boVar, View view, float f);

        /* renamed from: u */
        void mo3888u(C1112bo boVar, View view, float f);

        /* renamed from: v */
        void mo3889v(C1112bo boVar, View view, float f);

        /* renamed from: w */
        void mo3890w(C1112bo boVar, View view, float f);

        /* renamed from: x */
        void mo3891x(C1112bo boVar, View view, float f);
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            f3531e = new C1120f();
        } else if (i >= 19) {
            f3531e = new C1119e();
        } else if (i >= 18) {
            f3531e = new C1117c();
        } else if (i >= 16) {
            f3531e = new C1118d();
        } else if (i >= 14) {
            f3531e = new C1115b();
        } else {
            f3531e = new C1113a();
        }
    }

    C1112bo(View view) {
        this.f3536g = new WeakReference<>(view);
    }

    /* renamed from: a */
    public long mo3817a() {
        View view = (View) this.f3536g.get();
        if (view != null) {
            return f3531e.mo3854a(this, view);
        }
        return 0;
    }

    /* renamed from: a */
    public C1112bo mo3818a(float f) {
        View view = (View) this.f3536g.get();
        if (view != null) {
            f3531e.mo3855a(this, view, f);
        }
        return this;
    }

    /* renamed from: a */
    public C1112bo mo3819a(long j) {
        View view = (View) this.f3536g.get();
        if (view != null) {
            f3531e.mo3856a(this, view, j);
        }
        return this;
    }

    /* renamed from: a */
    public C1112bo mo3820a(C1130bu buVar) {
        View view = (View) this.f3536g.get();
        if (view != null) {
            f3531e.mo3857a(this, view, buVar);
        }
        return this;
    }

    /* renamed from: a */
    public C1112bo mo3821a(C1132bw bwVar) {
        View view = (View) this.f3536g.get();
        if (view != null) {
            f3531e.mo3858a(this, view, bwVar);
        }
        return this;
    }

    /* renamed from: a */
    public C1112bo mo3822a(Interpolator interpolator) {
        View view = (View) this.f3536g.get();
        if (view != null) {
            f3531e.mo3859a(this, view, interpolator);
        }
        return this;
    }

    /* renamed from: a */
    public C1112bo mo3823a(Runnable runnable) {
        View view = (View) this.f3536g.get();
        if (view != null) {
            f3531e.mo3860a(this, view, runnable);
        }
        return this;
    }

    /* renamed from: b */
    public C1112bo mo3824b(float f) {
        View view = (View) this.f3536g.get();
        if (view != null) {
            f3531e.mo3868d(this, view, f);
        }
        return this;
    }

    /* renamed from: b */
    public C1112bo mo3825b(long j) {
        View view = (View) this.f3536g.get();
        if (view != null) {
            f3531e.mo3863b(this, view, j);
        }
        return this;
    }

    /* renamed from: b */
    public C1112bo mo3826b(Runnable runnable) {
        View view = (View) this.f3536g.get();
        if (view != null) {
            f3531e.mo3864b(this, view, runnable);
        }
        return this;
    }

    /* renamed from: b */
    public Interpolator mo3827b() {
        View view = (View) this.f3536g.get();
        if (view != null) {
            return f3531e.mo3861b(this, view);
        }
        return null;
    }

    /* renamed from: c */
    public long mo3828c() {
        View view = (View) this.f3536g.get();
        if (view != null) {
            return f3531e.mo3865c(this, view);
        }
        return 0;
    }

    /* renamed from: c */
    public C1112bo mo3829c(float f) {
        View view = (View) this.f3536g.get();
        if (view != null) {
            f3531e.mo3862b(this, view, f);
        }
        return this;
    }

    /* renamed from: d */
    public C1112bo mo3830d(float f) {
        View view = (View) this.f3536g.get();
        if (view != null) {
            f3531e.mo3866c(this, view, f);
        }
        return this;
    }

    /* renamed from: d */
    public void mo3831d() {
        View view = (View) this.f3536g.get();
        if (view != null) {
            f3531e.mo3867d(this, view);
        }
    }

    /* renamed from: e */
    public C1112bo mo3832e(float f) {
        View view = (View) this.f3536g.get();
        if (view != null) {
            f3531e.mo3870e(this, view, f);
        }
        return this;
    }

    /* renamed from: e */
    public void mo3833e() {
        View view = (View) this.f3536g.get();
        if (view != null) {
            f3531e.mo3869e(this, view);
        }
    }

    /* renamed from: f */
    public C1112bo mo3834f() {
        View view = (View) this.f3536g.get();
        if (view != null) {
            f3531e.mo3871f(this, view);
        }
        return this;
    }

    /* renamed from: f */
    public C1112bo mo3835f(float f) {
        View view = (View) this.f3536g.get();
        if (view != null) {
            f3531e.mo3872f(this, view, f);
        }
        return this;
    }

    /* renamed from: g */
    public C1112bo mo3836g(float f) {
        View view = (View) this.f3536g.get();
        if (view != null) {
            f3531e.mo3874g(this, view, f);
        }
        return this;
    }

    /* renamed from: h */
    public C1112bo mo3837h(float f) {
        View view = (View) this.f3536g.get();
        if (view != null) {
            f3531e.mo3875h(this, view, f);
        }
        return this;
    }

    /* renamed from: i */
    public C1112bo mo3838i(float f) {
        View view = (View) this.f3536g.get();
        if (view != null) {
            f3531e.mo3876i(this, view, f);
        }
        return this;
    }

    /* renamed from: j */
    public C1112bo mo3839j(float f) {
        View view = (View) this.f3536g.get();
        if (view != null) {
            f3531e.mo3877j(this, view, f);
        }
        return this;
    }

    /* renamed from: k */
    public C1112bo mo3840k(float f) {
        View view = (View) this.f3536g.get();
        if (view != null) {
            f3531e.mo3878k(this, view, f);
        }
        return this;
    }

    /* renamed from: l */
    public C1112bo mo3841l(float f) {
        View view = (View) this.f3536g.get();
        if (view != null) {
            f3531e.mo3879l(this, view, f);
        }
        return this;
    }

    /* renamed from: m */
    public C1112bo mo3842m(float f) {
        View view = (View) this.f3536g.get();
        if (view != null) {
            f3531e.mo3880m(this, view, f);
        }
        return this;
    }

    /* renamed from: n */
    public C1112bo mo3843n(float f) {
        View view = (View) this.f3536g.get();
        if (view != null) {
            f3531e.mo3881n(this, view, f);
        }
        return this;
    }

    /* renamed from: o */
    public C1112bo mo3844o(float f) {
        View view = (View) this.f3536g.get();
        if (view != null) {
            f3531e.mo3882o(this, view, f);
        }
        return this;
    }

    /* renamed from: p */
    public C1112bo mo3845p(float f) {
        View view = (View) this.f3536g.get();
        if (view != null) {
            f3531e.mo3883p(this, view, f);
        }
        return this;
    }

    /* renamed from: q */
    public C1112bo mo3846q(float f) {
        View view = (View) this.f3536g.get();
        if (view != null) {
            f3531e.mo3884q(this, view, f);
        }
        return this;
    }

    /* renamed from: r */
    public C1112bo mo3847r(float f) {
        View view = (View) this.f3536g.get();
        if (view != null) {
            f3531e.mo3885r(this, view, f);
        }
        return this;
    }

    /* renamed from: s */
    public C1112bo mo3848s(float f) {
        View view = (View) this.f3536g.get();
        if (view != null) {
            f3531e.mo3888u(this, view, f);
        }
        return this;
    }

    /* renamed from: t */
    public C1112bo mo3849t(float f) {
        View view = (View) this.f3536g.get();
        if (view != null) {
            f3531e.mo3889v(this, view, f);
        }
        return this;
    }

    /* renamed from: u */
    public C1112bo mo3850u(float f) {
        View view = (View) this.f3536g.get();
        if (view != null) {
            f3531e.mo3891x(this, view, f);
        }
        return this;
    }

    /* renamed from: v */
    public C1112bo mo3851v(float f) {
        View view = (View) this.f3536g.get();
        if (view != null) {
            f3531e.mo3890w(this, view, f);
        }
        return this;
    }

    /* renamed from: w */
    public C1112bo mo3852w(float f) {
        View view = (View) this.f3536g.get();
        if (view != null) {
            f3531e.mo3886s(this, view, f);
        }
        return this;
    }

    /* renamed from: x */
    public C1112bo mo3853x(float f) {
        View view = (View) this.f3536g.get();
        if (view != null) {
            f3531e.mo3887t(this, view, f);
        }
        return this;
    }
}
