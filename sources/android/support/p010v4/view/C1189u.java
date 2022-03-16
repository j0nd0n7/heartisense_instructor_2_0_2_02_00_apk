package android.support.p010v4.view;

import android.os.Build;
import android.support.p010v4.p023h.p024a.C0539b;
import android.support.p010v4.view.C1197w;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;

/* renamed from: android.support.v4.view.u */
public final class C1189u {

    /* renamed from: a */
    public static final int f3640a = 0;

    /* renamed from: b */
    public static final int f3641b = 1;

    /* renamed from: c */
    public static final int f3642c = 2;

    /* renamed from: d */
    public static final int f3643d = 4;

    /* renamed from: e */
    public static final int f3644e = 8;

    /* renamed from: f */
    static final C1194d f3645f;

    /* renamed from: g */
    private static final String f3646g = "MenuItemCompat";

    /* renamed from: android.support.v4.view.u$a */
    static class C1190a implements C1194d {
        C1190a() {
        }

        /* renamed from: a */
        public MenuItem mo4012a(MenuItem menuItem, C1195e eVar) {
            return menuItem;
        }

        /* renamed from: a */
        public MenuItem mo4013a(MenuItem menuItem, View view) {
            return menuItem;
        }

        /* renamed from: a */
        public View mo4014a(MenuItem menuItem) {
            return null;
        }

        /* renamed from: a */
        public void mo4015a(MenuItem menuItem, int i) {
        }

        /* renamed from: b */
        public MenuItem mo4016b(MenuItem menuItem, int i) {
            return menuItem;
        }

        /* renamed from: b */
        public boolean mo4017b(MenuItem menuItem) {
            return false;
        }

        /* renamed from: c */
        public boolean mo4018c(MenuItem menuItem) {
            return false;
        }

        /* renamed from: d */
        public boolean mo4019d(MenuItem menuItem) {
            return false;
        }
    }

    /* renamed from: android.support.v4.view.u$b */
    static class C1191b implements C1194d {
        C1191b() {
        }

        /* renamed from: a */
        public MenuItem mo4012a(MenuItem menuItem, C1195e eVar) {
            return menuItem;
        }

        /* renamed from: a */
        public MenuItem mo4013a(MenuItem menuItem, View view) {
            return C1196v.m7120a(menuItem, view);
        }

        /* renamed from: a */
        public View mo4014a(MenuItem menuItem) {
            return C1196v.m7121a(menuItem);
        }

        /* renamed from: a */
        public void mo4015a(MenuItem menuItem, int i) {
            C1196v.m7122a(menuItem, i);
        }

        /* renamed from: b */
        public MenuItem mo4016b(MenuItem menuItem, int i) {
            return C1196v.m7123b(menuItem, i);
        }

        /* renamed from: b */
        public boolean mo4017b(MenuItem menuItem) {
            return false;
        }

        /* renamed from: c */
        public boolean mo4018c(MenuItem menuItem) {
            return false;
        }

        /* renamed from: d */
        public boolean mo4019d(MenuItem menuItem) {
            return false;
        }
    }

    /* renamed from: android.support.v4.view.u$c */
    static class C1192c extends C1191b {
        C1192c() {
        }

        /* renamed from: a */
        public MenuItem mo4012a(MenuItem menuItem, final C1195e eVar) {
            return eVar == null ? C1197w.m7124a(menuItem, (C1197w.C1199b) null) : C1197w.m7124a(menuItem, new C1197w.C1199b() {
                /* renamed from: a */
                public boolean mo4020a(MenuItem menuItem) {
                    return eVar.mo4022a(menuItem);
                }

                /* renamed from: b */
                public boolean mo4021b(MenuItem menuItem) {
                    return eVar.mo4023b(menuItem);
                }
            });
        }

        /* renamed from: b */
        public boolean mo4017b(MenuItem menuItem) {
            return C1197w.m7125a(menuItem);
        }

        /* renamed from: c */
        public boolean mo4018c(MenuItem menuItem) {
            return C1197w.m7126b(menuItem);
        }

        /* renamed from: d */
        public boolean mo4019d(MenuItem menuItem) {
            return C1197w.m7127c(menuItem);
        }
    }

    /* renamed from: android.support.v4.view.u$d */
    interface C1194d {
        /* renamed from: a */
        MenuItem mo4012a(MenuItem menuItem, C1195e eVar);

        /* renamed from: a */
        MenuItem mo4013a(MenuItem menuItem, View view);

        /* renamed from: a */
        View mo4014a(MenuItem menuItem);

        /* renamed from: a */
        void mo4015a(MenuItem menuItem, int i);

        /* renamed from: b */
        MenuItem mo4016b(MenuItem menuItem, int i);

        /* renamed from: b */
        boolean mo4017b(MenuItem menuItem);

        /* renamed from: c */
        boolean mo4018c(MenuItem menuItem);

        /* renamed from: d */
        boolean mo4019d(MenuItem menuItem);
    }

    /* renamed from: android.support.v4.view.u$e */
    public interface C1195e {
        /* renamed from: a */
        boolean mo4022a(MenuItem menuItem);

        /* renamed from: b */
        boolean mo4023b(MenuItem menuItem);
    }

    static {
        if (Build.VERSION.SDK_INT >= 14) {
            f3645f = new C1192c();
        } else if (Build.VERSION.SDK_INT >= 11) {
            f3645f = new C1191b();
        } else {
            f3645f = new C1190a();
        }
    }

    private C1189u() {
    }

    /* renamed from: a */
    public static MenuItem m7078a(MenuItem menuItem, C1147e eVar) {
        if (menuItem instanceof C0539b) {
            return ((C0539b) menuItem).mo1930a(eVar);
        }
        Log.w(f3646g, "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }

    /* renamed from: a */
    public static MenuItem m7079a(MenuItem menuItem, C1195e eVar) {
        return menuItem instanceof C0539b ? ((C0539b) menuItem).mo1931a(eVar) : f3645f.mo4012a(menuItem, eVar);
    }

    /* renamed from: a */
    public static MenuItem m7080a(MenuItem menuItem, View view) {
        return menuItem instanceof C0539b ? ((C0539b) menuItem).setActionView(view) : f3645f.mo4013a(menuItem, view);
    }

    /* renamed from: a */
    public static View m7081a(MenuItem menuItem) {
        return menuItem instanceof C0539b ? ((C0539b) menuItem).getActionView() : f3645f.mo4014a(menuItem);
    }

    /* renamed from: a */
    public static void m7082a(MenuItem menuItem, int i) {
        if (menuItem instanceof C0539b) {
            ((C0539b) menuItem).setShowAsAction(i);
        } else {
            f3645f.mo4015a(menuItem, i);
        }
    }

    /* renamed from: b */
    public static C1147e m7083b(MenuItem menuItem) {
        if (menuItem instanceof C0539b) {
            return ((C0539b) menuItem).mo1932a();
        }
        Log.w(f3646g, "getActionProvider: item does not implement SupportMenuItem; returning null");
        return null;
    }

    /* renamed from: b */
    public static MenuItem m7084b(MenuItem menuItem, int i) {
        return menuItem instanceof C0539b ? ((C0539b) menuItem).setActionView(i) : f3645f.mo4016b(menuItem, i);
    }

    /* renamed from: c */
    public static boolean m7085c(MenuItem menuItem) {
        return menuItem instanceof C0539b ? ((C0539b) menuItem).expandActionView() : f3645f.mo4017b(menuItem);
    }

    /* renamed from: d */
    public static boolean m7086d(MenuItem menuItem) {
        return menuItem instanceof C0539b ? ((C0539b) menuItem).collapseActionView() : f3645f.mo4018c(menuItem);
    }

    /* renamed from: e */
    public static boolean m7087e(MenuItem menuItem) {
        return menuItem instanceof C0539b ? ((C0539b) menuItem).isActionViewExpanded() : f3645f.mo4019d(menuItem);
    }
}
