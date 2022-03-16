package android.support.p010v4.p018f.p019a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.C0003aa;
import android.support.annotation.C0032k;
import android.support.annotation.C0047z;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: android.support.v4.f.a.a */
public final class C0484a {

    /* renamed from: a */
    static final C0486b f2053a;

    /* renamed from: android.support.v4.f.a.a$a */
    static class C0485a implements C0486b {
        C0485a() {
        }

        /* renamed from: a */
        public void mo1813a(Drawable drawable) {
        }

        /* renamed from: a */
        public void mo1814a(Drawable drawable, float f, float f2) {
        }

        /* renamed from: a */
        public void mo1815a(Drawable drawable, int i) {
            C0493c.m2614a(drawable, i);
        }

        /* renamed from: a */
        public void mo1816a(Drawable drawable, int i, int i2, int i3, int i4) {
        }

        /* renamed from: a */
        public void mo1817a(Drawable drawable, ColorStateList colorStateList) {
            C0493c.m2615a(drawable, colorStateList);
        }

        /* renamed from: a */
        public void mo1818a(Drawable drawable, Resources.Theme theme) {
        }

        /* renamed from: a */
        public void mo1819a(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            C0493c.m2616a(drawable, resources, xmlPullParser, attributeSet, theme);
        }

        /* renamed from: a */
        public void mo1820a(Drawable drawable, PorterDuff.Mode mode) {
            C0493c.m2617a(drawable, mode);
        }

        /* renamed from: a */
        public void mo1821a(Drawable drawable, boolean z) {
        }

        /* renamed from: b */
        public boolean mo1822b(Drawable drawable) {
            return false;
        }

        /* renamed from: b */
        public boolean mo1823b(Drawable drawable, int i) {
            return false;
        }

        /* renamed from: c */
        public Drawable mo1824c(Drawable drawable) {
            return C0493c.m2613a(drawable);
        }

        /* renamed from: d */
        public int mo1825d(Drawable drawable) {
            return 0;
        }

        /* renamed from: e */
        public int mo1826e(Drawable drawable) {
            return 0;
        }

        /* renamed from: f */
        public boolean mo1827f(Drawable drawable) {
            return false;
        }

        /* renamed from: g */
        public ColorFilter mo1828g(Drawable drawable) {
            return null;
        }

        /* renamed from: h */
        public void mo1829h(Drawable drawable) {
            drawable.clearColorFilter();
        }
    }

    /* renamed from: android.support.v4.f.a.a$b */
    interface C0486b {
        /* renamed from: a */
        void mo1813a(Drawable drawable);

        /* renamed from: a */
        void mo1814a(Drawable drawable, float f, float f2);

        /* renamed from: a */
        void mo1815a(Drawable drawable, int i);

        /* renamed from: a */
        void mo1816a(Drawable drawable, int i, int i2, int i3, int i4);

        /* renamed from: a */
        void mo1817a(Drawable drawable, ColorStateList colorStateList);

        /* renamed from: a */
        void mo1818a(Drawable drawable, Resources.Theme theme);

        /* renamed from: a */
        void mo1819a(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);

        /* renamed from: a */
        void mo1820a(Drawable drawable, PorterDuff.Mode mode);

        /* renamed from: a */
        void mo1821a(Drawable drawable, boolean z);

        /* renamed from: b */
        boolean mo1822b(Drawable drawable);

        /* renamed from: b */
        boolean mo1823b(Drawable drawable, int i);

        /* renamed from: c */
        Drawable mo1824c(Drawable drawable);

        /* renamed from: d */
        int mo1825d(Drawable drawable);

        /* renamed from: e */
        int mo1826e(Drawable drawable);

        /* renamed from: f */
        boolean mo1827f(Drawable drawable);

        /* renamed from: g */
        ColorFilter mo1828g(Drawable drawable);

        /* renamed from: h */
        void mo1829h(Drawable drawable);
    }

    /* renamed from: android.support.v4.f.a.a$c */
    static class C0487c extends C0485a {
        C0487c() {
        }

        /* renamed from: a */
        public void mo1813a(Drawable drawable) {
            C0494d.m2618a(drawable);
        }

        /* renamed from: c */
        public Drawable mo1824c(Drawable drawable) {
            return C0494d.m2619b(drawable);
        }
    }

    /* renamed from: android.support.v4.f.a.a$d */
    static class C0488d extends C0487c {
        C0488d() {
        }

        /* renamed from: b */
        public boolean mo1823b(Drawable drawable, int i) {
            return C0495e.m2621a(drawable, i);
        }

        /* renamed from: d */
        public int mo1825d(Drawable drawable) {
            int a = C0495e.m2620a(drawable);
            if (a >= 0) {
                return a;
            }
            return 0;
        }
    }

    /* renamed from: android.support.v4.f.a.a$e */
    static class C0489e extends C0488d {
        C0489e() {
        }

        /* renamed from: a */
        public void mo1821a(Drawable drawable, boolean z) {
            C0496f.m2622a(drawable, z);
        }

        /* renamed from: b */
        public boolean mo1822b(Drawable drawable) {
            return C0496f.m2623a(drawable);
        }

        /* renamed from: c */
        public Drawable mo1824c(Drawable drawable) {
            return C0496f.m2624b(drawable);
        }

        /* renamed from: e */
        public int mo1826e(Drawable drawable) {
            return C0496f.m2625c(drawable);
        }
    }

    /* renamed from: android.support.v4.f.a.a$f */
    static class C0490f extends C0489e {
        C0490f() {
        }

        /* renamed from: a */
        public void mo1814a(Drawable drawable, float f, float f2) {
            C0497g.m2627a(drawable, f, f2);
        }

        /* renamed from: a */
        public void mo1815a(Drawable drawable, int i) {
            C0497g.m2628a(drawable, i);
        }

        /* renamed from: a */
        public void mo1816a(Drawable drawable, int i, int i2, int i3, int i4) {
            C0497g.m2629a(drawable, i, i2, i3, i4);
        }

        /* renamed from: a */
        public void mo1817a(Drawable drawable, ColorStateList colorStateList) {
            C0497g.m2630a(drawable, colorStateList);
        }

        /* renamed from: a */
        public void mo1818a(Drawable drawable, Resources.Theme theme) {
            C0497g.m2631a(drawable, theme);
        }

        /* renamed from: a */
        public void mo1819a(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            C0497g.m2632a(drawable, resources, xmlPullParser, attributeSet, theme);
        }

        /* renamed from: a */
        public void mo1820a(Drawable drawable, PorterDuff.Mode mode) {
            C0497g.m2633a(drawable, mode);
        }

        /* renamed from: c */
        public Drawable mo1824c(Drawable drawable) {
            return C0497g.m2626a(drawable);
        }

        /* renamed from: f */
        public boolean mo1827f(Drawable drawable) {
            return C0497g.m2634b(drawable);
        }

        /* renamed from: g */
        public ColorFilter mo1828g(Drawable drawable) {
            return C0497g.m2635c(drawable);
        }

        /* renamed from: h */
        public void mo1829h(Drawable drawable) {
            C0497g.m2636d(drawable);
        }
    }

    /* renamed from: android.support.v4.f.a.a$g */
    static class C0491g extends C0490f {
        C0491g() {
        }

        /* renamed from: b */
        public boolean mo1823b(Drawable drawable, int i) {
            return C0492b.m2612a(drawable, i);
        }

        /* renamed from: c */
        public Drawable mo1824c(Drawable drawable) {
            return drawable;
        }

        /* renamed from: d */
        public int mo1825d(Drawable drawable) {
            return C0492b.m2611a(drawable);
        }

        /* renamed from: h */
        public void mo1829h(Drawable drawable) {
            drawable.clearColorFilter();
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            f2053a = new C0491g();
        } else if (i >= 21) {
            f2053a = new C0490f();
        } else if (i >= 19) {
            f2053a = new C0489e();
        } else if (i >= 17) {
            f2053a = new C0488d();
        } else if (i >= 11) {
            f2053a = new C0487c();
        } else {
            f2053a = new C0485a();
        }
    }

    private C0484a() {
    }

    /* renamed from: a */
    public static void m2536a(@C0047z Drawable drawable) {
        f2053a.mo1813a(drawable);
    }

    /* renamed from: a */
    public static void m2537a(@C0047z Drawable drawable, float f, float f2) {
        f2053a.mo1814a(drawable, f, f2);
    }

    /* renamed from: a */
    public static void m2538a(@C0047z Drawable drawable, @C0032k int i) {
        f2053a.mo1815a(drawable, i);
    }

    /* renamed from: a */
    public static void m2539a(@C0047z Drawable drawable, int i, int i2, int i3, int i4) {
        f2053a.mo1816a(drawable, i, i2, i3, i4);
    }

    /* renamed from: a */
    public static void m2540a(@C0047z Drawable drawable, @C0003aa ColorStateList colorStateList) {
        f2053a.mo1817a(drawable, colorStateList);
    }

    /* renamed from: a */
    public static void m2541a(@C0047z Drawable drawable, @C0047z Resources.Theme theme) {
        f2053a.mo1818a(drawable, theme);
    }

    /* renamed from: a */
    public static void m2542a(@C0047z Drawable drawable, @C0047z Resources resources, @C0047z XmlPullParser xmlPullParser, @C0047z AttributeSet attributeSet, @C0003aa Resources.Theme theme) {
        f2053a.mo1819a(drawable, resources, xmlPullParser, attributeSet, theme);
    }

    /* renamed from: a */
    public static void m2543a(@C0047z Drawable drawable, @C0003aa PorterDuff.Mode mode) {
        f2053a.mo1820a(drawable, mode);
    }

    /* renamed from: a */
    public static void m2544a(@C0047z Drawable drawable, boolean z) {
        f2053a.mo1821a(drawable, z);
    }

    /* renamed from: b */
    public static boolean m2545b(@C0047z Drawable drawable) {
        return f2053a.mo1822b(drawable);
    }

    /* renamed from: b */
    public static boolean m2546b(@C0047z Drawable drawable, int i) {
        return f2053a.mo1823b(drawable, i);
    }

    /* renamed from: c */
    public static int m2547c(@C0047z Drawable drawable) {
        return f2053a.mo1826e(drawable);
    }

    /* renamed from: d */
    public static boolean m2548d(@C0047z Drawable drawable) {
        return f2053a.mo1827f(drawable);
    }

    /* renamed from: e */
    public static ColorFilter m2549e(@C0047z Drawable drawable) {
        return f2053a.mo1828g(drawable);
    }

    /* renamed from: f */
    public static void m2550f(@C0047z Drawable drawable) {
        f2053a.mo1829h(drawable);
    }

    /* renamed from: g */
    public static Drawable m2551g(@C0047z Drawable drawable) {
        return f2053a.mo1824c(drawable);
    }

    /* renamed from: h */
    public static <T extends Drawable> T m2552h(@C0047z Drawable drawable) {
        return drawable instanceof C0498h ? ((C0498h) drawable).mo1830a() : drawable;
    }

    /* renamed from: i */
    public static int m2553i(@C0047z Drawable drawable) {
        return f2053a.mo1825d(drawable);
    }
}
