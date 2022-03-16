package android.support.p010v4.view;

import android.os.Build;
import android.os.Bundle;
import android.support.p010v4.view.C1140c;
import android.support.p010v4.view.C1144d;
import android.support.p010v4.view.p034a.C0949h;
import android.support.p010v4.view.p034a.C0979r;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: android.support.v4.view.b */
public class C1066b {

    /* renamed from: b */
    private static final C1069b f3507b;

    /* renamed from: c */
    private static final Object f3508c = f3507b.mo3770a();

    /* renamed from: a */
    final Object f3509a = f3507b.mo3771a(this);

    /* renamed from: android.support.v4.view.b$a */
    static class C1067a extends C1072d {
        C1067a() {
        }

        /* renamed from: a */
        public Object mo3770a() {
            return C1140c.m6898a();
        }

        /* renamed from: a */
        public Object mo3771a(final C1066b bVar) {
            return C1140c.m6899a(new C1140c.C1142a() {
                /* renamed from: a */
                public void mo3779a(View view, int i) {
                    bVar.mo3765a(view, i);
                }

                /* renamed from: a */
                public void mo3780a(View view, Object obj) {
                    bVar.mo3076a(view, new C0949h(obj));
                }

                /* renamed from: a */
                public boolean mo3781a(View view, AccessibilityEvent accessibilityEvent) {
                    return bVar.mo3768b(view, accessibilityEvent);
                }

                /* renamed from: a */
                public boolean mo3782a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
                    return bVar.mo3767a(viewGroup, view, accessibilityEvent);
                }

                /* renamed from: b */
                public void mo3783b(View view, AccessibilityEvent accessibilityEvent) {
                    bVar.mo3078d(view, accessibilityEvent);
                }

                /* renamed from: c */
                public void mo3784c(View view, AccessibilityEvent accessibilityEvent) {
                    bVar.mo3769c(view, accessibilityEvent);
                }

                /* renamed from: d */
                public void mo3785d(View view, AccessibilityEvent accessibilityEvent) {
                    bVar.mo3766a(view, accessibilityEvent);
                }
            });
        }

        /* renamed from: a */
        public void mo3772a(Object obj, View view, int i) {
            C1140c.m6900a(obj, view, i);
        }

        /* renamed from: a */
        public void mo3773a(Object obj, View view, C0949h hVar) {
            C1140c.m6901a(obj, view, hVar.mo3155a());
        }

        /* renamed from: a */
        public boolean mo3774a(Object obj, View view, AccessibilityEvent accessibilityEvent) {
            return C1140c.m6902a(obj, view, accessibilityEvent);
        }

        /* renamed from: a */
        public boolean mo3775a(Object obj, ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return C1140c.m6903a(obj, viewGroup, view, accessibilityEvent);
        }

        /* renamed from: b */
        public void mo3776b(Object obj, View view, AccessibilityEvent accessibilityEvent) {
            C1140c.m6904b(obj, view, accessibilityEvent);
        }

        /* renamed from: c */
        public void mo3777c(Object obj, View view, AccessibilityEvent accessibilityEvent) {
            C1140c.m6905c(obj, view, accessibilityEvent);
        }

        /* renamed from: d */
        public void mo3778d(Object obj, View view, AccessibilityEvent accessibilityEvent) {
            C1140c.m6906d(obj, view, accessibilityEvent);
        }
    }

    /* renamed from: android.support.v4.view.b$b */
    interface C1069b {
        /* renamed from: a */
        C0979r mo3786a(Object obj, View view);

        /* renamed from: a */
        Object mo3770a();

        /* renamed from: a */
        Object mo3771a(C1066b bVar);

        /* renamed from: a */
        void mo3772a(Object obj, View view, int i);

        /* renamed from: a */
        void mo3773a(Object obj, View view, C0949h hVar);

        /* renamed from: a */
        boolean mo3787a(Object obj, View view, int i, Bundle bundle);

        /* renamed from: a */
        boolean mo3774a(Object obj, View view, AccessibilityEvent accessibilityEvent);

        /* renamed from: a */
        boolean mo3775a(Object obj, ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent);

        /* renamed from: b */
        void mo3776b(Object obj, View view, AccessibilityEvent accessibilityEvent);

        /* renamed from: c */
        void mo3777c(Object obj, View view, AccessibilityEvent accessibilityEvent);

        /* renamed from: d */
        void mo3778d(Object obj, View view, AccessibilityEvent accessibilityEvent);
    }

    /* renamed from: android.support.v4.view.b$c */
    static class C1070c extends C1067a {
        C1070c() {
        }

        /* renamed from: a */
        public C0979r mo3786a(Object obj, View view) {
            Object a = C1144d.m6923a(obj, view);
            if (a != null) {
                return new C0979r(a);
            }
            return null;
        }

        /* renamed from: a */
        public Object mo3771a(final C1066b bVar) {
            return C1144d.m6922a(new C1144d.C1146a() {
                /* renamed from: a */
                public Object mo3788a(View view) {
                    C0979r a = bVar.mo3763a(view);
                    if (a != null) {
                        return a.mo3408a();
                    }
                    return null;
                }

                /* renamed from: a */
                public void mo3789a(View view, int i) {
                    bVar.mo3765a(view, i);
                }

                /* renamed from: a */
                public void mo3790a(View view, Object obj) {
                    bVar.mo3076a(view, new C0949h(obj));
                }

                /* renamed from: a */
                public boolean mo3791a(View view, int i, Bundle bundle) {
                    return bVar.mo3077a(view, i, bundle);
                }

                /* renamed from: a */
                public boolean mo3792a(View view, AccessibilityEvent accessibilityEvent) {
                    return bVar.mo3768b(view, accessibilityEvent);
                }

                /* renamed from: a */
                public boolean mo3793a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
                    return bVar.mo3767a(viewGroup, view, accessibilityEvent);
                }

                /* renamed from: b */
                public void mo3794b(View view, AccessibilityEvent accessibilityEvent) {
                    bVar.mo3078d(view, accessibilityEvent);
                }

                /* renamed from: c */
                public void mo3795c(View view, AccessibilityEvent accessibilityEvent) {
                    bVar.mo3769c(view, accessibilityEvent);
                }

                /* renamed from: d */
                public void mo3796d(View view, AccessibilityEvent accessibilityEvent) {
                    bVar.mo3766a(view, accessibilityEvent);
                }
            });
        }

        /* renamed from: a */
        public boolean mo3787a(Object obj, View view, int i, Bundle bundle) {
            return C1144d.m6924a(obj, view, i, bundle);
        }
    }

    /* renamed from: android.support.v4.view.b$d */
    static class C1072d implements C1069b {
        C1072d() {
        }

        /* renamed from: a */
        public C0979r mo3786a(Object obj, View view) {
            return null;
        }

        /* renamed from: a */
        public Object mo3770a() {
            return null;
        }

        /* renamed from: a */
        public Object mo3771a(C1066b bVar) {
            return null;
        }

        /* renamed from: a */
        public void mo3772a(Object obj, View view, int i) {
        }

        /* renamed from: a */
        public void mo3773a(Object obj, View view, C0949h hVar) {
        }

        /* renamed from: a */
        public boolean mo3787a(Object obj, View view, int i, Bundle bundle) {
            return false;
        }

        /* renamed from: a */
        public boolean mo3774a(Object obj, View view, AccessibilityEvent accessibilityEvent) {
            return false;
        }

        /* renamed from: a */
        public boolean mo3775a(Object obj, ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return true;
        }

        /* renamed from: b */
        public void mo3776b(Object obj, View view, AccessibilityEvent accessibilityEvent) {
        }

        /* renamed from: c */
        public void mo3777c(Object obj, View view, AccessibilityEvent accessibilityEvent) {
        }

        /* renamed from: d */
        public void mo3778d(Object obj, View view, AccessibilityEvent accessibilityEvent) {
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 16) {
            f3507b = new C1070c();
        } else if (Build.VERSION.SDK_INT >= 14) {
            f3507b = new C1067a();
        } else {
            f3507b = new C1072d();
        }
    }

    /* renamed from: a */
    public C0979r mo3763a(View view) {
        return f3507b.mo3786a(f3508c, view);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Object mo3764a() {
        return this.f3509a;
    }

    /* renamed from: a */
    public void mo3765a(View view, int i) {
        f3507b.mo3772a(f3508c, view, i);
    }

    /* renamed from: a */
    public void mo3076a(View view, C0949h hVar) {
        f3507b.mo3773a(f3508c, view, hVar);
    }

    /* renamed from: a */
    public void mo3766a(View view, AccessibilityEvent accessibilityEvent) {
        f3507b.mo3778d(f3508c, view, accessibilityEvent);
    }

    /* renamed from: a */
    public boolean mo3077a(View view, int i, Bundle bundle) {
        return f3507b.mo3787a(f3508c, view, i, bundle);
    }

    /* renamed from: a */
    public boolean mo3767a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return f3507b.mo3775a(f3508c, viewGroup, view, accessibilityEvent);
    }

    /* renamed from: b */
    public boolean mo3768b(View view, AccessibilityEvent accessibilityEvent) {
        return f3507b.mo3774a(f3508c, view, accessibilityEvent);
    }

    /* renamed from: c */
    public void mo3769c(View view, AccessibilityEvent accessibilityEvent) {
        f3507b.mo3777c(f3508c, view, accessibilityEvent);
    }

    /* renamed from: d */
    public void mo3078d(View view, AccessibilityEvent accessibilityEvent) {
        f3507b.mo3776b(f3508c, view, accessibilityEvent);
    }
}
