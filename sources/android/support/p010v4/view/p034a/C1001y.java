package android.support.p010v4.view.p034a;

import android.graphics.Rect;
import android.os.Build;

/* renamed from: android.support.v4.view.a.y */
public class C1001y {

    /* renamed from: a */
    public static final int f3365a = 1;

    /* renamed from: b */
    public static final int f3366b = 2;

    /* renamed from: c */
    public static final int f3367c = 3;

    /* renamed from: d */
    public static final int f3368d = 4;

    /* renamed from: e */
    public static final int f3369e = 5;

    /* renamed from: f */
    private static final C1004c f3370f;

    /* renamed from: h */
    private static final int f3371h = -1;

    /* renamed from: g */
    private Object f3372g;

    /* renamed from: android.support.v4.view.a.y$a */
    private static class C1002a extends C1005d {
        C1002a() {
        }

        /* renamed from: a */
        public Object mo3537a() {
            return C1006z.m5752a();
        }

        /* renamed from: a */
        public Object mo3538a(Object obj) {
            return C1006z.m5753a(obj);
        }

        /* renamed from: a */
        public Object mo3539a(Object obj, int i) {
            return C1006z.m5754a(obj, i);
        }

        /* renamed from: a */
        public void mo3540a(Object obj, Rect rect) {
            C1006z.m5755a(obj, rect);
        }

        /* renamed from: b */
        public int mo3541b(Object obj) {
            return C1006z.m5756b(obj);
        }

        /* renamed from: c */
        public int mo3542c(Object obj) {
            return C1006z.m5757c(obj);
        }

        /* renamed from: d */
        public Object mo3543d(Object obj) {
            return C1006z.m5758d(obj);
        }

        /* renamed from: e */
        public Object mo3544e(Object obj) {
            return C1006z.m5759e(obj);
        }

        /* renamed from: f */
        public int mo3545f(Object obj) {
            return C1006z.m5760f(obj);
        }

        /* renamed from: g */
        public boolean mo3546g(Object obj) {
            return C1006z.m5761g(obj);
        }

        /* renamed from: h */
        public boolean mo3547h(Object obj) {
            return C1006z.m5762h(obj);
        }

        /* renamed from: i */
        public boolean mo3548i(Object obj) {
            return C1006z.m5763i(obj);
        }

        /* renamed from: j */
        public int mo3549j(Object obj) {
            return C1006z.m5764j(obj);
        }

        /* renamed from: k */
        public void mo3550k(Object obj) {
            C1006z.m5765k(obj);
        }
    }

    /* renamed from: android.support.v4.view.a.y$b */
    private static class C1003b extends C1002a {
        C1003b() {
        }

        /* renamed from: l */
        public CharSequence mo3551l(Object obj) {
            return C0928aa.m4643a(obj);
        }

        /* renamed from: m */
        public Object mo3552m(Object obj) {
            return C0928aa.m4644b(obj);
        }
    }

    /* renamed from: android.support.v4.view.a.y$c */
    private interface C1004c {
        /* renamed from: a */
        Object mo3537a();

        /* renamed from: a */
        Object mo3538a(Object obj);

        /* renamed from: a */
        Object mo3539a(Object obj, int i);

        /* renamed from: a */
        void mo3540a(Object obj, Rect rect);

        /* renamed from: b */
        int mo3541b(Object obj);

        /* renamed from: c */
        int mo3542c(Object obj);

        /* renamed from: d */
        Object mo3543d(Object obj);

        /* renamed from: e */
        Object mo3544e(Object obj);

        /* renamed from: f */
        int mo3545f(Object obj);

        /* renamed from: g */
        boolean mo3546g(Object obj);

        /* renamed from: h */
        boolean mo3547h(Object obj);

        /* renamed from: i */
        boolean mo3548i(Object obj);

        /* renamed from: j */
        int mo3549j(Object obj);

        /* renamed from: k */
        void mo3550k(Object obj);

        /* renamed from: l */
        CharSequence mo3551l(Object obj);

        /* renamed from: m */
        Object mo3552m(Object obj);
    }

    /* renamed from: android.support.v4.view.a.y$d */
    private static class C1005d implements C1004c {
        C1005d() {
        }

        /* renamed from: a */
        public Object mo3537a() {
            return null;
        }

        /* renamed from: a */
        public Object mo3538a(Object obj) {
            return null;
        }

        /* renamed from: a */
        public Object mo3539a(Object obj, int i) {
            return null;
        }

        /* renamed from: a */
        public void mo3540a(Object obj, Rect rect) {
        }

        /* renamed from: b */
        public int mo3541b(Object obj) {
            return -1;
        }

        /* renamed from: c */
        public int mo3542c(Object obj) {
            return -1;
        }

        /* renamed from: d */
        public Object mo3543d(Object obj) {
            return null;
        }

        /* renamed from: e */
        public Object mo3544e(Object obj) {
            return null;
        }

        /* renamed from: f */
        public int mo3545f(Object obj) {
            return -1;
        }

        /* renamed from: g */
        public boolean mo3546g(Object obj) {
            return true;
        }

        /* renamed from: h */
        public boolean mo3547h(Object obj) {
            return true;
        }

        /* renamed from: i */
        public boolean mo3548i(Object obj) {
            return true;
        }

        /* renamed from: j */
        public int mo3549j(Object obj) {
            return 0;
        }

        /* renamed from: k */
        public void mo3550k(Object obj) {
        }

        /* renamed from: l */
        public CharSequence mo3551l(Object obj) {
            return null;
        }

        /* renamed from: m */
        public Object mo3552m(Object obj) {
            return null;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 24) {
            f3370f = new C1003b();
        } else if (Build.VERSION.SDK_INT >= 21) {
            f3370f = new C1002a();
        } else {
            f3370f = new C1005d();
        }
    }

    private C1001y(Object obj) {
        this.f3372g = obj;
    }

    /* renamed from: a */
    public static C1001y m5686a(C1001y yVar) {
        if (yVar == null) {
            return null;
        }
        return m5687a(f3370f.mo3538a(yVar.f3372g));
    }

    /* renamed from: a */
    static C1001y m5687a(Object obj) {
        if (obj != null) {
            return new C1001y(obj);
        }
        return null;
    }

    /* renamed from: b */
    private static String m5688b(int i) {
        switch (i) {
            case 1:
                return "TYPE_APPLICATION";
            case 2:
                return "TYPE_INPUT_METHOD";
            case 3:
                return "TYPE_SYSTEM";
            case 4:
                return "TYPE_ACCESSIBILITY_OVERLAY";
            default:
                return "<UNKNOWN>";
        }
    }

    /* renamed from: l */
    public static C1001y m5689l() {
        return m5687a(f3370f.mo3537a());
    }

    /* renamed from: a */
    public int mo3520a() {
        return f3370f.mo3541b(this.f3372g);
    }

    /* renamed from: a */
    public C1001y mo3521a(int i) {
        return m5687a(f3370f.mo3539a(this.f3372g, i));
    }

    /* renamed from: a */
    public void mo3522a(Rect rect) {
        f3370f.mo3540a(this.f3372g, rect);
    }

    /* renamed from: b */
    public int mo3523b() {
        return f3370f.mo3542c(this.f3372g);
    }

    /* renamed from: c */
    public C0949h mo3524c() {
        return C0949h.m4706a(f3370f.mo3543d(this.f3372g));
    }

    /* renamed from: d */
    public C1001y mo3525d() {
        return m5687a(f3370f.mo3544e(this.f3372g));
    }

    /* renamed from: e */
    public int mo3526e() {
        return f3370f.mo3545f(this.f3372g);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        C1001y yVar = (C1001y) obj;
        return this.f3372g == null ? yVar.f3372g == null : this.f3372g.equals(yVar.f3372g);
    }

    /* renamed from: f */
    public boolean mo3528f() {
        return f3370f.mo3546g(this.f3372g);
    }

    /* renamed from: g */
    public boolean mo3529g() {
        return f3370f.mo3547h(this.f3372g);
    }

    /* renamed from: h */
    public boolean mo3530h() {
        return f3370f.mo3548i(this.f3372g);
    }

    public int hashCode() {
        if (this.f3372g == null) {
            return 0;
        }
        return this.f3372g.hashCode();
    }

    /* renamed from: i */
    public int mo3532i() {
        return f3370f.mo3549j(this.f3372g);
    }

    /* renamed from: j */
    public CharSequence mo3533j() {
        return f3370f.mo3551l(this.f3372g);
    }

    /* renamed from: k */
    public C0949h mo3534k() {
        return C0949h.m4706a(f3370f.mo3552m(this.f3372g));
    }

    /* renamed from: m */
    public void mo3535m() {
        f3370f.mo3550k(this.f3372g);
    }

    public String toString() {
        boolean z = true;
        StringBuilder sb = new StringBuilder();
        Rect rect = new Rect();
        mo3522a(rect);
        sb.append("AccessibilityWindowInfo[");
        sb.append("id=").append(mo3526e());
        sb.append(", type=").append(m5688b(mo3520a()));
        sb.append(", layer=").append(mo3523b());
        sb.append(", bounds=").append(rect);
        sb.append(", focused=").append(mo3529g());
        sb.append(", active=").append(mo3528f());
        sb.append(", hasParent=").append(mo3525d() != null);
        StringBuilder append = sb.append(", hasChildren=");
        if (mo3532i() <= 0) {
            z = false;
        }
        append.append(z);
        sb.append(']');
        return sb.toString();
    }
}
