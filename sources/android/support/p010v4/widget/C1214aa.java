package android.support.p010v4.widget;

import android.os.Build;
import android.support.p010v4.view.C1040ar;
import android.support.p010v4.view.C1161h;
import android.view.View;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* renamed from: android.support.v4.widget.aa */
public final class C1214aa {

    /* renamed from: a */
    static final C1219e f3783a;

    /* renamed from: android.support.v4.widget.aa$a */
    static class C1215a extends C1218d {
        C1215a() {
        }

        /* renamed from: a */
        public void mo4114a(PopupWindow popupWindow, boolean z) {
            C1220ab.m7251a(popupWindow, z);
        }

        /* renamed from: a */
        public boolean mo4115a(PopupWindow popupWindow) {
            return C1220ab.m7252a(popupWindow);
        }
    }

    /* renamed from: android.support.v4.widget.aa$b */
    static class C1216b extends C1215a {
        C1216b() {
        }

        /* renamed from: a */
        public void mo4116a(PopupWindow popupWindow, int i) {
            C1221ac.m7253a(popupWindow, i);
        }

        /* renamed from: a */
        public void mo4114a(PopupWindow popupWindow, boolean z) {
            C1221ac.m7254a(popupWindow, z);
        }

        /* renamed from: a */
        public boolean mo4115a(PopupWindow popupWindow) {
            return C1221ac.m7255a(popupWindow);
        }

        /* renamed from: b */
        public int mo4117b(PopupWindow popupWindow) {
            return C1221ac.m7256b(popupWindow);
        }
    }

    /* renamed from: android.support.v4.widget.aa$c */
    static class C1217c implements C1219e {

        /* renamed from: a */
        private static Method f3784a;

        /* renamed from: b */
        private static boolean f3785b;

        /* renamed from: c */
        private static Method f3786c;

        /* renamed from: d */
        private static boolean f3787d;

        C1217c() {
        }

        /* renamed from: a */
        public void mo4116a(PopupWindow popupWindow, int i) {
            if (!f3785b) {
                Class<PopupWindow> cls = PopupWindow.class;
                try {
                    f3784a = cls.getDeclaredMethod("setWindowLayoutType", new Class[]{Integer.TYPE});
                    f3784a.setAccessible(true);
                } catch (Exception e) {
                }
                f3785b = true;
            }
            if (f3784a != null) {
                try {
                    f3784a.invoke(popupWindow, new Object[]{Integer.valueOf(i)});
                } catch (Exception e2) {
                }
            }
        }

        /* renamed from: a */
        public void mo4118a(PopupWindow popupWindow, View view, int i, int i2, int i3) {
            if ((C1161h.m6976a(i3, C1040ar.m5947k(view)) & 7) == 5) {
                i -= popupWindow.getWidth() - view.getWidth();
            }
            popupWindow.showAsDropDown(view, i, i2);
        }

        /* renamed from: a */
        public void mo4114a(PopupWindow popupWindow, boolean z) {
        }

        /* renamed from: a */
        public boolean mo4115a(PopupWindow popupWindow) {
            return false;
        }

        /* renamed from: b */
        public int mo4117b(PopupWindow popupWindow) {
            if (!f3787d) {
                try {
                    f3786c = PopupWindow.class.getDeclaredMethod("getWindowLayoutType", new Class[0]);
                    f3786c.setAccessible(true);
                } catch (Exception e) {
                }
                f3787d = true;
            }
            if (f3786c != null) {
                try {
                    return ((Integer) f3786c.invoke(popupWindow, new Object[0])).intValue();
                } catch (Exception e2) {
                }
            }
            return 0;
        }
    }

    /* renamed from: android.support.v4.widget.aa$d */
    static class C1218d extends C1217c {
        C1218d() {
        }

        /* renamed from: a */
        public void mo4118a(PopupWindow popupWindow, View view, int i, int i2, int i3) {
            C1222ad.m7257a(popupWindow, view, i, i2, i3);
        }
    }

    /* renamed from: android.support.v4.widget.aa$e */
    interface C1219e {
        /* renamed from: a */
        void mo4116a(PopupWindow popupWindow, int i);

        /* renamed from: a */
        void mo4118a(PopupWindow popupWindow, View view, int i, int i2, int i3);

        /* renamed from: a */
        void mo4114a(PopupWindow popupWindow, boolean z);

        /* renamed from: a */
        boolean mo4115a(PopupWindow popupWindow);

        /* renamed from: b */
        int mo4117b(PopupWindow popupWindow);
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            f3783a = new C1216b();
        } else if (i >= 21) {
            f3783a = new C1215a();
        } else if (i >= 19) {
            f3783a = new C1218d();
        } else {
            f3783a = new C1217c();
        }
    }

    private C1214aa() {
    }

    /* renamed from: a */
    public static void m7229a(PopupWindow popupWindow, int i) {
        f3783a.mo4116a(popupWindow, i);
    }

    /* renamed from: a */
    public static void m7230a(PopupWindow popupWindow, View view, int i, int i2, int i3) {
        f3783a.mo4118a(popupWindow, view, i, i2, i3);
    }

    /* renamed from: a */
    public static void m7231a(PopupWindow popupWindow, boolean z) {
        f3783a.mo4114a(popupWindow, z);
    }

    /* renamed from: a */
    public static boolean m7232a(PopupWindow popupWindow) {
        return f3783a.mo4115a(popupWindow);
    }

    /* renamed from: b */
    public static int m7233b(PopupWindow popupWindow) {
        return f3783a.mo4117b(popupWindow);
    }
}
