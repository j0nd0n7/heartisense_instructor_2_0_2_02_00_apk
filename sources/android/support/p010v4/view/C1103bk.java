package android.support.p010v4.view;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;

/* renamed from: android.support.v4.view.bk */
public final class C1103bk {

    /* renamed from: a */
    static final C1105b f3528a;

    /* renamed from: android.support.v4.view.bk$a */
    static class C1104a extends C1108e {
        C1104a() {
        }

        /* renamed from: a */
        public boolean mo3808a(ViewParent viewParent, View view, AccessibilityEvent accessibilityEvent) {
            return C1109bl.m6603a(viewParent, view, accessibilityEvent);
        }
    }

    /* renamed from: android.support.v4.view.bk$b */
    interface C1105b {
        /* renamed from: a */
        void mo3809a(ViewParent viewParent, View view);

        /* renamed from: a */
        void mo3810a(ViewParent viewParent, View view, int i, int i2, int i3, int i4);

        /* renamed from: a */
        void mo3811a(ViewParent viewParent, View view, int i, int i2, int[] iArr);

        /* renamed from: a */
        boolean mo3812a(ViewParent viewParent, View view, float f, float f2);

        /* renamed from: a */
        boolean mo3813a(ViewParent viewParent, View view, float f, float f2, boolean z);

        /* renamed from: a */
        boolean mo3814a(ViewParent viewParent, View view, View view2, int i);

        /* renamed from: a */
        boolean mo3808a(ViewParent viewParent, View view, AccessibilityEvent accessibilityEvent);

        /* renamed from: b */
        void mo3815b(ViewParent viewParent, View view, View view2, int i);

        /* renamed from: c */
        void mo3816c(ViewParent viewParent, View view, View view2, int i);
    }

    /* renamed from: android.support.v4.view.bk$c */
    static class C1106c extends C1104a {
        C1106c() {
        }

        /* renamed from: c */
        public void mo3816c(ViewParent viewParent, View view, View view2, int i) {
            C1110bm.m6604a(viewParent, view, view2, i);
        }
    }

    /* renamed from: android.support.v4.view.bk$d */
    static class C1107d extends C1106c {
        C1107d() {
        }

        /* renamed from: a */
        public void mo3809a(ViewParent viewParent, View view) {
            C1111bn.m6605a(viewParent, view);
        }

        /* renamed from: a */
        public void mo3810a(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
            C1111bn.m6606a(viewParent, view, i, i2, i3, i4);
        }

        /* renamed from: a */
        public void mo3811a(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
            C1111bn.m6607a(viewParent, view, i, i2, iArr);
        }

        /* renamed from: a */
        public boolean mo3812a(ViewParent viewParent, View view, float f, float f2) {
            return C1111bn.m6608a(viewParent, view, f, f2);
        }

        /* renamed from: a */
        public boolean mo3813a(ViewParent viewParent, View view, float f, float f2, boolean z) {
            return C1111bn.m6609a(viewParent, view, f, f2, z);
        }

        /* renamed from: a */
        public boolean mo3814a(ViewParent viewParent, View view, View view2, int i) {
            return C1111bn.m6610a(viewParent, view, view2, i);
        }

        /* renamed from: b */
        public void mo3815b(ViewParent viewParent, View view, View view2, int i) {
            C1111bn.m6611b(viewParent, view, view2, i);
        }
    }

    /* renamed from: android.support.v4.view.bk$e */
    static class C1108e implements C1105b {
        C1108e() {
        }

        /* renamed from: a */
        public void mo3809a(ViewParent viewParent, View view) {
            if (viewParent instanceof C1009ac) {
                ((C1009ac) viewParent).onStopNestedScroll(view);
            }
        }

        /* renamed from: a */
        public void mo3810a(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
            if (viewParent instanceof C1009ac) {
                ((C1009ac) viewParent).onNestedScroll(view, i, i2, i3, i4);
            }
        }

        /* renamed from: a */
        public void mo3811a(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
            if (viewParent instanceof C1009ac) {
                ((C1009ac) viewParent).onNestedPreScroll(view, i, i2, iArr);
            }
        }

        /* renamed from: a */
        public boolean mo3812a(ViewParent viewParent, View view, float f, float f2) {
            if (viewParent instanceof C1009ac) {
                return ((C1009ac) viewParent).onNestedPreFling(view, f, f2);
            }
            return false;
        }

        /* renamed from: a */
        public boolean mo3813a(ViewParent viewParent, View view, float f, float f2, boolean z) {
            if (viewParent instanceof C1009ac) {
                return ((C1009ac) viewParent).onNestedFling(view, f, f2, z);
            }
            return false;
        }

        /* renamed from: a */
        public boolean mo3814a(ViewParent viewParent, View view, View view2, int i) {
            if (viewParent instanceof C1009ac) {
                return ((C1009ac) viewParent).onStartNestedScroll(view, view2, i);
            }
            return false;
        }

        /* renamed from: a */
        public boolean mo3808a(ViewParent viewParent, View view, AccessibilityEvent accessibilityEvent) {
            if (view == null) {
                return false;
            }
            ((AccessibilityManager) view.getContext().getSystemService("accessibility")).sendAccessibilityEvent(accessibilityEvent);
            return true;
        }

        /* renamed from: b */
        public void mo3815b(ViewParent viewParent, View view, View view2, int i) {
            if (viewParent instanceof C1009ac) {
                ((C1009ac) viewParent).onNestedScrollAccepted(view, view2, i);
            }
        }

        /* renamed from: c */
        public void mo3816c(ViewParent viewParent, View view, View view2, int i) {
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            f3528a = new C1107d();
        } else if (i >= 19) {
            f3528a = new C1106c();
        } else if (i >= 14) {
            f3528a = new C1104a();
        } else {
            f3528a = new C1108e();
        }
    }

    private C1103bk() {
    }

    /* renamed from: a */
    public static void m6567a(ViewParent viewParent, View view) {
        f3528a.mo3809a(viewParent, view);
    }

    /* renamed from: a */
    public static void m6568a(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
        f3528a.mo3810a(viewParent, view, i, i2, i3, i4);
    }

    /* renamed from: a */
    public static void m6569a(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
        f3528a.mo3811a(viewParent, view, i, i2, iArr);
    }

    /* renamed from: a */
    public static boolean m6570a(ViewParent viewParent, View view, float f, float f2) {
        return f3528a.mo3812a(viewParent, view, f, f2);
    }

    /* renamed from: a */
    public static boolean m6571a(ViewParent viewParent, View view, float f, float f2, boolean z) {
        return f3528a.mo3813a(viewParent, view, f, f2, z);
    }

    /* renamed from: a */
    public static boolean m6572a(ViewParent viewParent, View view, View view2, int i) {
        return f3528a.mo3814a(viewParent, view, view2, i);
    }

    /* renamed from: a */
    public static boolean m6573a(ViewParent viewParent, View view, AccessibilityEvent accessibilityEvent) {
        return f3528a.mo3808a(viewParent, view, accessibilityEvent);
    }

    /* renamed from: b */
    public static void m6574b(ViewParent viewParent, View view, View view2, int i) {
        f3528a.mo3815b(viewParent, view, view2, i);
    }

    /* renamed from: c */
    public static void m6575c(ViewParent viewParent, View view, View view2, int i) {
        f3528a.mo3816c(viewParent, view, view2, i);
    }
}
