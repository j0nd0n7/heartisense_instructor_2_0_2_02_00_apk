package android.support.p010v4.widget;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.support.p010v4.widget.C1237ai;
import android.view.View;

/* renamed from: android.support.v4.widget.ah */
public final class C1226ah {

    /* renamed from: a */
    private static final C1235g f3795a;

    /* renamed from: android.support.v4.widget.ah$a */
    public interface C1227a {
        /* renamed from: a */
        boolean mo4139a();
    }

    @Deprecated
    /* renamed from: android.support.v4.widget.ah$b */
    public static abstract class C1228b implements C1227a {
        /* renamed from: a */
        public boolean mo4139a() {
            return false;
        }
    }

    /* renamed from: android.support.v4.widget.ah$c */
    public interface C1229c {
        /* renamed from: a */
        boolean mo4140a(String str);

        /* renamed from: b */
        boolean mo4141b(String str);
    }

    @Deprecated
    /* renamed from: android.support.v4.widget.ah$d */
    public static abstract class C1230d implements C1229c {
        /* renamed from: a */
        public boolean mo4140a(String str) {
            return false;
        }

        /* renamed from: b */
        public boolean mo4141b(String str) {
            return false;
        }
    }

    /* renamed from: android.support.v4.widget.ah$e */
    static class C1231e extends C1236h {
        C1231e() {
        }

        /* renamed from: a */
        public View mo4142a(Context context) {
            return C1237ai.m7362a(context);
        }

        /* renamed from: a */
        public CharSequence mo4143a(View view) {
            mo4158e(view);
            return C1237ai.m7372b(view);
        }

        /* renamed from: a */
        public Object mo4144a(final C1227a aVar) {
            return C1237ai.m7363a((C1237ai.C1240a) new C1237ai.C1240a() {
                /* renamed from: a */
                public boolean mo4161a() {
                    return aVar.mo4139a();
                }
            });
        }

        /* renamed from: a */
        public Object mo4145a(final C1229c cVar) {
            return C1237ai.m7364a((C1237ai.C1241b) new C1237ai.C1241b() {
                /* renamed from: a */
                public boolean mo4159a(String str) {
                    return cVar.mo4140a(str);
                }

                /* renamed from: b */
                public boolean mo4160b(String str) {
                    return cVar.mo4141b(str);
                }
            });
        }

        /* renamed from: a */
        public void mo4146a(View view, int i) {
            mo4158e(view);
            C1237ai.m7366a(view, i);
        }

        /* renamed from: a */
        public void mo4147a(View view, ComponentName componentName) {
            mo4158e(view);
            C1237ai.m7367a(view, componentName);
        }

        /* renamed from: a */
        public void mo4148a(View view, C1227a aVar) {
            mo4158e(view);
            C1237ai.m7373b(view, mo4144a(aVar));
        }

        /* renamed from: a */
        public void mo4149a(View view, C1229c cVar) {
            mo4158e(view);
            C1237ai.m7370a(view, mo4145a(cVar));
        }

        /* renamed from: a */
        public void mo4150a(View view, CharSequence charSequence) {
            mo4158e(view);
            C1237ai.m7368a(view, charSequence);
        }

        /* renamed from: a */
        public void mo4151a(View view, CharSequence charSequence, boolean z) {
            mo4158e(view);
            C1237ai.m7369a(view, charSequence, z);
        }

        /* renamed from: a */
        public void mo4152a(View view, boolean z) {
            mo4158e(view);
            C1237ai.m7371a(view, z);
        }

        /* renamed from: b */
        public void mo4153b(View view, boolean z) {
            mo4158e(view);
            C1237ai.m7374b(view, z);
        }

        /* renamed from: b */
        public boolean mo4154b(View view) {
            mo4158e(view);
            return C1237ai.m7376c(view);
        }

        /* renamed from: c */
        public void mo4155c(View view, boolean z) {
            mo4158e(view);
            C1237ai.m7375c(view, z);
        }

        /* renamed from: c */
        public boolean mo4156c(View view) {
            mo4158e(view);
            return C1237ai.m7377d(view);
        }

        /* renamed from: d */
        public boolean mo4157d(View view) {
            mo4158e(view);
            return C1237ai.m7378e(view);
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public void mo4158e(View view) {
            C1237ai.m7365a(view);
        }
    }

    /* renamed from: android.support.v4.widget.ah$f */
    static class C1234f extends C1231e {
        C1234f() {
        }

        /* renamed from: a */
        public View mo4142a(Context context) {
            return C1242aj.m7382a(context);
        }

        /* renamed from: b */
        public void mo4162b(View view, int i) {
            mo4158e(view);
            C1242aj.m7383a(view, i);
        }

        /* renamed from: c */
        public void mo4163c(View view, int i) {
            mo4158e(view);
            C1242aj.m7384b(view, i);
        }
    }

    /* renamed from: android.support.v4.widget.ah$g */
    interface C1235g {
        /* renamed from: a */
        View mo4142a(Context context);

        /* renamed from: a */
        CharSequence mo4143a(View view);

        /* renamed from: a */
        Object mo4144a(C1227a aVar);

        /* renamed from: a */
        Object mo4145a(C1229c cVar);

        /* renamed from: a */
        void mo4146a(View view, int i);

        /* renamed from: a */
        void mo4147a(View view, ComponentName componentName);

        /* renamed from: a */
        void mo4148a(View view, C1227a aVar);

        /* renamed from: a */
        void mo4149a(View view, C1229c cVar);

        /* renamed from: a */
        void mo4150a(View view, CharSequence charSequence);

        /* renamed from: a */
        void mo4151a(View view, CharSequence charSequence, boolean z);

        /* renamed from: a */
        void mo4152a(View view, boolean z);

        /* renamed from: b */
        void mo4162b(View view, int i);

        /* renamed from: b */
        void mo4153b(View view, boolean z);

        /* renamed from: b */
        boolean mo4154b(View view);

        /* renamed from: c */
        void mo4163c(View view, int i);

        /* renamed from: c */
        void mo4155c(View view, boolean z);

        /* renamed from: c */
        boolean mo4156c(View view);

        /* renamed from: d */
        boolean mo4157d(View view);
    }

    /* renamed from: android.support.v4.widget.ah$h */
    static class C1236h implements C1235g {
        C1236h() {
        }

        /* renamed from: a */
        public View mo4142a(Context context) {
            return null;
        }

        /* renamed from: a */
        public CharSequence mo4143a(View view) {
            return null;
        }

        /* renamed from: a */
        public Object mo4144a(C1227a aVar) {
            return null;
        }

        /* renamed from: a */
        public Object mo4145a(C1229c cVar) {
            return null;
        }

        /* renamed from: a */
        public void mo4146a(View view, int i) {
        }

        /* renamed from: a */
        public void mo4147a(View view, ComponentName componentName) {
        }

        /* renamed from: a */
        public void mo4148a(View view, C1227a aVar) {
        }

        /* renamed from: a */
        public void mo4149a(View view, C1229c cVar) {
        }

        /* renamed from: a */
        public void mo4150a(View view, CharSequence charSequence) {
        }

        /* renamed from: a */
        public void mo4151a(View view, CharSequence charSequence, boolean z) {
        }

        /* renamed from: a */
        public void mo4152a(View view, boolean z) {
        }

        /* renamed from: b */
        public void mo4162b(View view, int i) {
        }

        /* renamed from: b */
        public void mo4153b(View view, boolean z) {
        }

        /* renamed from: b */
        public boolean mo4154b(View view) {
            return true;
        }

        /* renamed from: c */
        public void mo4163c(View view, int i) {
        }

        /* renamed from: c */
        public void mo4155c(View view, boolean z) {
        }

        /* renamed from: c */
        public boolean mo4156c(View view) {
            return false;
        }

        /* renamed from: d */
        public boolean mo4157d(View view) {
            return false;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 14) {
            f3795a = new C1234f();
        } else if (Build.VERSION.SDK_INT >= 11) {
            f3795a = new C1231e();
        } else {
            f3795a = new C1236h();
        }
    }

    private C1226ah(Context context) {
    }

    /* renamed from: a */
    public static View m7281a(Context context) {
        return f3795a.mo4142a(context);
    }

    /* renamed from: a */
    public static CharSequence m7282a(View view) {
        return f3795a.mo4143a(view);
    }

    /* renamed from: a */
    public static void m7283a(View view, int i) {
        f3795a.mo4162b(view, i);
    }

    /* renamed from: a */
    public static void m7284a(View view, ComponentName componentName) {
        f3795a.mo4147a(view, componentName);
    }

    /* renamed from: a */
    public static void m7285a(View view, C1227a aVar) {
        f3795a.mo4148a(view, aVar);
    }

    /* renamed from: a */
    public static void m7286a(View view, C1229c cVar) {
        f3795a.mo4149a(view, cVar);
    }

    /* renamed from: a */
    public static void m7287a(View view, CharSequence charSequence) {
        f3795a.mo4150a(view, charSequence);
    }

    /* renamed from: a */
    public static void m7288a(View view, CharSequence charSequence, boolean z) {
        f3795a.mo4151a(view, charSequence, z);
    }

    /* renamed from: a */
    public static void m7289a(View view, boolean z) {
        f3795a.mo4152a(view, z);
    }

    /* renamed from: b */
    public static void m7290b(View view, int i) {
        f3795a.mo4163c(view, i);
    }

    /* renamed from: b */
    public static void m7291b(View view, boolean z) {
        f3795a.mo4153b(view, z);
    }

    /* renamed from: b */
    public static boolean m7292b(View view) {
        return f3795a.mo4154b(view);
    }

    /* renamed from: c */
    public static void m7293c(View view, int i) {
        f3795a.mo4146a(view, i);
    }

    /* renamed from: c */
    public static void m7294c(View view, boolean z) {
        f3795a.mo4155c(view, z);
    }

    /* renamed from: c */
    public static boolean m7295c(View view) {
        return f3795a.mo4156c(view);
    }

    /* renamed from: d */
    public static boolean m7296d(View view) {
        return f3795a.mo4157d(view);
    }
}
