package android.support.p010v4.view.p034a;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.os.Build;
import android.support.p010v4.view.p034a.C0942f;
import android.support.p010v4.view.p034a.C0945g;
import android.view.accessibility.AccessibilityManager;
import java.util.Collections;
import java.util.List;

/* renamed from: android.support.v4.view.a.e */
public final class C0932e {

    /* renamed from: a */
    private static final C0938d f3259a;

    /* renamed from: android.support.v4.view.a.e$a */
    static class C0933a extends C0937c {
        C0933a() {
        }

        /* renamed from: a */
        public C0942f.C0944b mo3109a(final C0939e eVar) {
            return new C0942f.C0944b(eVar, new C0942f.C0943a() {
                /* renamed from: a */
                public void mo3115a(boolean z) {
                    eVar.mo3120a(z);
                }
            });
        }

        /* renamed from: a */
        public List<AccessibilityServiceInfo> mo3110a(AccessibilityManager accessibilityManager) {
            return C0942f.m4693a(accessibilityManager);
        }

        /* renamed from: a */
        public List<AccessibilityServiceInfo> mo3111a(AccessibilityManager accessibilityManager, int i) {
            return C0942f.m4694a(accessibilityManager, i);
        }

        /* renamed from: a */
        public boolean mo3112a(AccessibilityManager accessibilityManager, C0939e eVar) {
            return C0942f.m4695a(accessibilityManager, mo3109a(eVar));
        }

        /* renamed from: b */
        public boolean mo3113b(AccessibilityManager accessibilityManager) {
            return C0942f.m4696b(accessibilityManager);
        }

        /* renamed from: b */
        public boolean mo3114b(AccessibilityManager accessibilityManager, C0939e eVar) {
            return C0942f.m4697b(accessibilityManager, mo3109a(eVar));
        }
    }

    /* renamed from: android.support.v4.view.a.e$b */
    static class C0935b extends C0933a {
        C0935b() {
        }

        /* renamed from: a */
        public C0945g.C0948b mo3116a(final C0941g gVar) {
            return new C0945g.C0948b(gVar, new C0945g.C0947a() {
                /* renamed from: a */
                public void mo3119a(boolean z) {
                    gVar.mo3121a(z);
                }
            });
        }

        /* renamed from: a */
        public boolean mo3117a(AccessibilityManager accessibilityManager, C0941g gVar) {
            return C0945g.m4700a(accessibilityManager, mo3116a(gVar));
        }

        /* renamed from: b */
        public boolean mo3118b(AccessibilityManager accessibilityManager, C0941g gVar) {
            return C0945g.m4701b(accessibilityManager, mo3116a(gVar));
        }
    }

    /* renamed from: android.support.v4.view.a.e$c */
    static class C0937c implements C0938d {
        C0937c() {
        }

        /* renamed from: a */
        public C0942f.C0944b mo3109a(C0939e eVar) {
            return null;
        }

        /* renamed from: a */
        public C0945g.C0948b mo3116a(C0941g gVar) {
            return null;
        }

        /* renamed from: a */
        public List<AccessibilityServiceInfo> mo3110a(AccessibilityManager accessibilityManager) {
            return Collections.emptyList();
        }

        /* renamed from: a */
        public List<AccessibilityServiceInfo> mo3111a(AccessibilityManager accessibilityManager, int i) {
            return Collections.emptyList();
        }

        /* renamed from: a */
        public boolean mo3112a(AccessibilityManager accessibilityManager, C0939e eVar) {
            return false;
        }

        /* renamed from: a */
        public boolean mo3117a(AccessibilityManager accessibilityManager, C0941g gVar) {
            return false;
        }

        /* renamed from: b */
        public boolean mo3113b(AccessibilityManager accessibilityManager) {
            return false;
        }

        /* renamed from: b */
        public boolean mo3114b(AccessibilityManager accessibilityManager, C0939e eVar) {
            return false;
        }

        /* renamed from: b */
        public boolean mo3118b(AccessibilityManager accessibilityManager, C0941g gVar) {
            return false;
        }
    }

    /* renamed from: android.support.v4.view.a.e$d */
    interface C0938d {
        /* renamed from: a */
        C0942f.C0944b mo3109a(C0939e eVar);

        /* renamed from: a */
        C0945g.C0948b mo3116a(C0941g gVar);

        /* renamed from: a */
        List<AccessibilityServiceInfo> mo3110a(AccessibilityManager accessibilityManager);

        /* renamed from: a */
        List<AccessibilityServiceInfo> mo3111a(AccessibilityManager accessibilityManager, int i);

        /* renamed from: a */
        boolean mo3112a(AccessibilityManager accessibilityManager, C0939e eVar);

        /* renamed from: a */
        boolean mo3117a(AccessibilityManager accessibilityManager, C0941g gVar);

        /* renamed from: b */
        boolean mo3113b(AccessibilityManager accessibilityManager);

        /* renamed from: b */
        boolean mo3114b(AccessibilityManager accessibilityManager, C0939e eVar);

        /* renamed from: b */
        boolean mo3118b(AccessibilityManager accessibilityManager, C0941g gVar);
    }

    /* renamed from: android.support.v4.view.a.e$e */
    public interface C0939e {
        /* renamed from: a */
        void mo3120a(boolean z);
    }

    @Deprecated
    /* renamed from: android.support.v4.view.a.e$f */
    public static abstract class C0940f implements C0939e {
    }

    /* renamed from: android.support.v4.view.a.e$g */
    public interface C0941g {
        /* renamed from: a */
        void mo3121a(boolean z);
    }

    static {
        if (Build.VERSION.SDK_INT >= 19) {
            f3259a = new C0935b();
        } else if (Build.VERSION.SDK_INT >= 14) {
            f3259a = new C0933a();
        } else {
            f3259a = new C0937c();
        }
    }

    private C0932e() {
    }

    /* renamed from: a */
    public static List<AccessibilityServiceInfo> m4655a(AccessibilityManager accessibilityManager) {
        return f3259a.mo3110a(accessibilityManager);
    }

    /* renamed from: a */
    public static List<AccessibilityServiceInfo> m4656a(AccessibilityManager accessibilityManager, int i) {
        return f3259a.mo3111a(accessibilityManager, i);
    }

    /* renamed from: a */
    public static boolean m4657a(AccessibilityManager accessibilityManager, C0939e eVar) {
        return f3259a.mo3112a(accessibilityManager, eVar);
    }

    /* renamed from: a */
    public static boolean m4658a(AccessibilityManager accessibilityManager, C0941g gVar) {
        return f3259a.mo3117a(accessibilityManager, gVar);
    }

    /* renamed from: b */
    public static boolean m4659b(AccessibilityManager accessibilityManager) {
        return f3259a.mo3113b(accessibilityManager);
    }

    /* renamed from: b */
    public static boolean m4660b(AccessibilityManager accessibilityManager, C0939e eVar) {
        return f3259a.mo3114b(accessibilityManager, eVar);
    }

    /* renamed from: b */
    public static boolean m4661b(AccessibilityManager accessibilityManager, C0941g gVar) {
        return f3259a.mo3118b(accessibilityManager, gVar);
    }
}
