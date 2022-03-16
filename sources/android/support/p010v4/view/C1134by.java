package android.support.p010v4.view;

import android.graphics.Rect;
import android.os.Build;

/* renamed from: android.support.v4.view.by */
public class C1134by {

    /* renamed from: a */
    private static final C1138d f3553a;

    /* renamed from: b */
    private final Object f3554b;

    /* renamed from: android.support.v4.view.by$a */
    private static class C1135a extends C1137c {
        C1135a() {
        }

        /* renamed from: a */
        public C1134by mo3923a(Object obj) {
            return new C1134by(C1139bz.m6888a(obj));
        }

        /* renamed from: a */
        public C1134by mo3924a(Object obj, int i, int i2, int i3, int i4) {
            return new C1134by(C1139bz.m6889a(obj, i, i2, i3, i4));
        }

        /* renamed from: b */
        public int mo3925b(Object obj) {
            return C1139bz.m6890b(obj);
        }

        /* renamed from: c */
        public int mo3926c(Object obj) {
            return C1139bz.m6891c(obj);
        }

        /* renamed from: d */
        public int mo3927d(Object obj) {
            return C1139bz.m6892d(obj);
        }

        /* renamed from: e */
        public int mo3928e(Object obj) {
            return C1139bz.m6893e(obj);
        }

        /* renamed from: f */
        public boolean mo3929f(Object obj) {
            return C1139bz.m6894f(obj);
        }

        /* renamed from: g */
        public boolean mo3930g(Object obj) {
            return C1139bz.m6895g(obj);
        }

        /* renamed from: h */
        public boolean mo3931h(Object obj) {
            return C1139bz.m6896h(obj);
        }

        /* renamed from: i */
        public Object mo3932i(Object obj) {
            return C1139bz.m6897i(obj);
        }
    }

    /* renamed from: android.support.v4.view.by$b */
    private static class C1136b extends C1135a {
        C1136b() {
        }

        /* renamed from: a */
        public C1134by mo3933a(Object obj, Rect rect) {
            return new C1134by(C1143ca.m6915a(obj, rect));
        }

        /* renamed from: j */
        public C1134by mo3934j(Object obj) {
            return new C1134by(C1143ca.m6914a(obj));
        }

        /* renamed from: k */
        public int mo3935k(Object obj) {
            return C1143ca.m6916b(obj);
        }

        /* renamed from: l */
        public int mo3936l(Object obj) {
            return C1143ca.m6917c(obj);
        }

        /* renamed from: m */
        public int mo3937m(Object obj) {
            return C1143ca.m6918d(obj);
        }

        /* renamed from: n */
        public int mo3938n(Object obj) {
            return C1143ca.m6919e(obj);
        }

        /* renamed from: o */
        public boolean mo3939o(Object obj) {
            return C1143ca.m6920f(obj);
        }

        /* renamed from: p */
        public boolean mo3940p(Object obj) {
            return C1143ca.m6921g(obj);
        }
    }

    /* renamed from: android.support.v4.view.by$c */
    private static class C1137c implements C1138d {
        C1137c() {
        }

        /* renamed from: a */
        public C1134by mo3923a(Object obj) {
            return null;
        }

        /* renamed from: a */
        public C1134by mo3924a(Object obj, int i, int i2, int i3, int i4) {
            return null;
        }

        /* renamed from: a */
        public C1134by mo3933a(Object obj, Rect rect) {
            return null;
        }

        /* renamed from: b */
        public int mo3925b(Object obj) {
            return 0;
        }

        /* renamed from: c */
        public int mo3926c(Object obj) {
            return 0;
        }

        /* renamed from: d */
        public int mo3927d(Object obj) {
            return 0;
        }

        /* renamed from: e */
        public int mo3928e(Object obj) {
            return 0;
        }

        /* renamed from: f */
        public boolean mo3929f(Object obj) {
            return false;
        }

        /* renamed from: g */
        public boolean mo3930g(Object obj) {
            return false;
        }

        /* renamed from: h */
        public boolean mo3931h(Object obj) {
            return false;
        }

        /* renamed from: i */
        public Object mo3932i(Object obj) {
            return null;
        }

        /* renamed from: j */
        public C1134by mo3934j(Object obj) {
            return null;
        }

        /* renamed from: k */
        public int mo3935k(Object obj) {
            return 0;
        }

        /* renamed from: l */
        public int mo3936l(Object obj) {
            return 0;
        }

        /* renamed from: m */
        public int mo3937m(Object obj) {
            return 0;
        }

        /* renamed from: n */
        public int mo3938n(Object obj) {
            return 0;
        }

        /* renamed from: o */
        public boolean mo3939o(Object obj) {
            return false;
        }

        /* renamed from: p */
        public boolean mo3940p(Object obj) {
            return false;
        }
    }

    /* renamed from: android.support.v4.view.by$d */
    private interface C1138d {
        /* renamed from: a */
        C1134by mo3923a(Object obj);

        /* renamed from: a */
        C1134by mo3924a(Object obj, int i, int i2, int i3, int i4);

        /* renamed from: a */
        C1134by mo3933a(Object obj, Rect rect);

        /* renamed from: b */
        int mo3925b(Object obj);

        /* renamed from: c */
        int mo3926c(Object obj);

        /* renamed from: d */
        int mo3927d(Object obj);

        /* renamed from: e */
        int mo3928e(Object obj);

        /* renamed from: f */
        boolean mo3929f(Object obj);

        /* renamed from: g */
        boolean mo3930g(Object obj);

        /* renamed from: h */
        boolean mo3931h(Object obj);

        /* renamed from: i */
        Object mo3932i(Object obj);

        /* renamed from: j */
        C1134by mo3934j(Object obj);

        /* renamed from: k */
        int mo3935k(Object obj);

        /* renamed from: l */
        int mo3936l(Object obj);

        /* renamed from: m */
        int mo3937m(Object obj);

        /* renamed from: n */
        int mo3938n(Object obj);

        /* renamed from: o */
        boolean mo3939o(Object obj);

        /* renamed from: p */
        boolean mo3940p(Object obj);
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            f3553a = new C1136b();
        } else if (i >= 20) {
            f3553a = new C1135a();
        } else {
            f3553a = new C1137c();
        }
    }

    public C1134by(C1134by byVar) {
        this.f3554b = byVar == null ? null : f3553a.mo3932i(byVar.f3554b);
    }

    C1134by(Object obj) {
        this.f3554b = obj;
    }

    /* renamed from: a */
    static C1134by m6815a(Object obj) {
        if (obj == null) {
            return null;
        }
        return new C1134by(obj);
    }

    /* renamed from: a */
    static Object m6816a(C1134by byVar) {
        if (byVar == null) {
            return null;
        }
        return byVar.f3554b;
    }

    /* renamed from: a */
    public int mo3904a() {
        return f3553a.mo3926c(this.f3554b);
    }

    /* renamed from: a */
    public C1134by mo3905a(int i, int i2, int i3, int i4) {
        return f3553a.mo3924a(this.f3554b, i, i2, i3, i4);
    }

    /* renamed from: a */
    public C1134by mo3906a(Rect rect) {
        return f3553a.mo3933a(this.f3554b, rect);
    }

    /* renamed from: b */
    public int mo3907b() {
        return f3553a.mo3928e(this.f3554b);
    }

    /* renamed from: c */
    public int mo3908c() {
        return f3553a.mo3927d(this.f3554b);
    }

    /* renamed from: d */
    public int mo3909d() {
        return f3553a.mo3925b(this.f3554b);
    }

    /* renamed from: e */
    public boolean mo3910e() {
        return f3553a.mo3930g(this.f3554b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1134by byVar = (C1134by) obj;
        return this.f3554b == null ? byVar.f3554b == null : this.f3554b.equals(byVar.f3554b);
    }

    /* renamed from: f */
    public boolean mo3912f() {
        return f3553a.mo3929f(this.f3554b);
    }

    /* renamed from: g */
    public boolean mo3913g() {
        return f3553a.mo3940p(this.f3554b);
    }

    /* renamed from: h */
    public boolean mo3914h() {
        return f3553a.mo3931h(this.f3554b);
    }

    public int hashCode() {
        if (this.f3554b == null) {
            return 0;
        }
        return this.f3554b.hashCode();
    }

    /* renamed from: i */
    public C1134by mo3916i() {
        return f3553a.mo3923a(this.f3554b);
    }

    /* renamed from: j */
    public int mo3917j() {
        return f3553a.mo3938n(this.f3554b);
    }

    /* renamed from: k */
    public int mo3918k() {
        return f3553a.mo3936l(this.f3554b);
    }

    /* renamed from: l */
    public int mo3919l() {
        return f3553a.mo3937m(this.f3554b);
    }

    /* renamed from: m */
    public int mo3920m() {
        return f3553a.mo3935k(this.f3554b);
    }

    /* renamed from: n */
    public boolean mo3921n() {
        return f3553a.mo3939o(this.f3554b);
    }

    /* renamed from: o */
    public C1134by mo3922o() {
        return f3553a.mo3934j(this.f3554b);
    }
}
