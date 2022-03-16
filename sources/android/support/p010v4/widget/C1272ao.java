package android.support.p010v4.widget;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.C0003aa;
import android.support.annotation.C0016ak;
import android.support.annotation.C0036o;
import android.support.annotation.C0047z;
import android.widget.TextView;

/* renamed from: android.support.v4.widget.ao */
public final class C1272ao {

    /* renamed from: a */
    static final C1278f f3932a;

    /* renamed from: android.support.v4.widget.ao$a */
    static class C1273a extends C1276d {
        C1273a() {
        }

        /* renamed from: a */
        public void mo4299a(@C0047z TextView textView, @C0016ak int i) {
            C1279ap.m7518a(textView, i);
        }
    }

    /* renamed from: android.support.v4.widget.ao$b */
    static class C1274b implements C1278f {
        C1274b() {
        }

        /* renamed from: a */
        public int mo4300a(TextView textView) {
            return C1280aq.m7519a(textView);
        }

        /* renamed from: a */
        public void mo4299a(TextView textView, @C0016ak int i) {
            C1280aq.m7522a(textView, i);
        }

        /* renamed from: a */
        public void mo4301a(@C0047z TextView textView, @C0036o int i, @C0036o int i2, @C0036o int i3, @C0036o int i4) {
            textView.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
        }

        /* renamed from: a */
        public void mo4302a(@C0047z TextView textView, @C0003aa Drawable drawable, @C0003aa Drawable drawable2, @C0003aa Drawable drawable3, @C0003aa Drawable drawable4) {
            textView.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        }

        /* renamed from: b */
        public int mo4303b(TextView textView) {
            return C1280aq.m7523b(textView);
        }

        /* renamed from: b */
        public void mo4304b(@C0047z TextView textView, @C0003aa Drawable drawable, @C0003aa Drawable drawable2, @C0003aa Drawable drawable3, @C0003aa Drawable drawable4) {
            textView.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        /* renamed from: c */
        public Drawable[] mo4305c(@C0047z TextView textView) {
            return C1280aq.m7524c(textView);
        }
    }

    /* renamed from: android.support.v4.widget.ao$c */
    static class C1275c extends C1277e {
        C1275c() {
        }

        /* renamed from: a */
        public void mo4301a(@C0047z TextView textView, @C0036o int i, @C0036o int i2, @C0036o int i3, @C0036o int i4) {
            C1282as.m7527a(textView, i, i2, i3, i4);
        }

        /* renamed from: a */
        public void mo4302a(@C0047z TextView textView, @C0003aa Drawable drawable, @C0003aa Drawable drawable2, @C0003aa Drawable drawable3, @C0003aa Drawable drawable4) {
            C1282as.m7528a(textView, drawable, drawable2, drawable3, drawable4);
        }

        /* renamed from: b */
        public void mo4304b(@C0047z TextView textView, @C0003aa Drawable drawable, @C0003aa Drawable drawable2, @C0003aa Drawable drawable3, @C0003aa Drawable drawable4) {
            C1282as.m7530b(textView, drawable, drawable2, drawable3, drawable4);
        }

        /* renamed from: c */
        public Drawable[] mo4305c(@C0047z TextView textView) {
            return C1282as.m7529a(textView);
        }
    }

    /* renamed from: android.support.v4.widget.ao$d */
    static class C1276d extends C1275c {
        C1276d() {
        }

        /* renamed from: a */
        public void mo4301a(@C0047z TextView textView, @C0036o int i, @C0036o int i2, @C0036o int i3, @C0036o int i4) {
            C1283at.m7531a(textView, i, i2, i3, i4);
        }

        /* renamed from: a */
        public void mo4302a(@C0047z TextView textView, @C0003aa Drawable drawable, @C0003aa Drawable drawable2, @C0003aa Drawable drawable3, @C0003aa Drawable drawable4) {
            C1283at.m7532a(textView, drawable, drawable2, drawable3, drawable4);
        }

        /* renamed from: b */
        public void mo4304b(@C0047z TextView textView, @C0003aa Drawable drawable, @C0003aa Drawable drawable2, @C0003aa Drawable drawable3, @C0003aa Drawable drawable4) {
            C1283at.m7534b(textView, drawable, drawable2, drawable3, drawable4);
        }

        /* renamed from: c */
        public Drawable[] mo4305c(@C0047z TextView textView) {
            return C1283at.m7533a(textView);
        }
    }

    /* renamed from: android.support.v4.widget.ao$e */
    static class C1277e extends C1274b {
        C1277e() {
        }

        /* renamed from: a */
        public int mo4300a(TextView textView) {
            return C1281ar.m7525a(textView);
        }

        /* renamed from: b */
        public int mo4303b(TextView textView) {
            return C1281ar.m7526b(textView);
        }
    }

    /* renamed from: android.support.v4.widget.ao$f */
    interface C1278f {
        /* renamed from: a */
        int mo4300a(TextView textView);

        /* renamed from: a */
        void mo4299a(@C0047z TextView textView, @C0016ak int i);

        /* renamed from: a */
        void mo4301a(@C0047z TextView textView, @C0036o int i, @C0036o int i2, @C0036o int i3, @C0036o int i4);

        /* renamed from: a */
        void mo4302a(@C0047z TextView textView, @C0003aa Drawable drawable, @C0003aa Drawable drawable2, @C0003aa Drawable drawable3, @C0003aa Drawable drawable4);

        /* renamed from: b */
        int mo4303b(TextView textView);

        /* renamed from: b */
        void mo4304b(@C0047z TextView textView, @C0003aa Drawable drawable, @C0003aa Drawable drawable2, @C0003aa Drawable drawable3, @C0003aa Drawable drawable4);

        /* renamed from: c */
        Drawable[] mo4305c(@C0047z TextView textView);
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            f3932a = new C1273a();
        } else if (i >= 18) {
            f3932a = new C1276d();
        } else if (i >= 17) {
            f3932a = new C1275c();
        } else if (i >= 16) {
            f3932a = new C1277e();
        } else {
            f3932a = new C1274b();
        }
    }

    private C1272ao() {
    }

    /* renamed from: a */
    public static int m7486a(@C0047z TextView textView) {
        return f3932a.mo4300a(textView);
    }

    /* renamed from: a */
    public static void m7487a(@C0047z TextView textView, @C0016ak int i) {
        f3932a.mo4299a(textView, i);
    }

    /* renamed from: a */
    public static void m7488a(@C0047z TextView textView, @C0036o int i, @C0036o int i2, @C0036o int i3, @C0036o int i4) {
        f3932a.mo4301a(textView, i, i2, i3, i4);
    }

    /* renamed from: a */
    public static void m7489a(@C0047z TextView textView, @C0003aa Drawable drawable, @C0003aa Drawable drawable2, @C0003aa Drawable drawable3, @C0003aa Drawable drawable4) {
        f3932a.mo4302a(textView, drawable, drawable2, drawable3, drawable4);
    }

    /* renamed from: b */
    public static int m7490b(@C0047z TextView textView) {
        return f3932a.mo4303b(textView);
    }

    /* renamed from: b */
    public static void m7491b(@C0047z TextView textView, @C0003aa Drawable drawable, @C0003aa Drawable drawable2, @C0003aa Drawable drawable3, @C0003aa Drawable drawable4) {
        f3932a.mo4304b(textView, drawable, drawable2, drawable3, drawable4);
    }

    /* renamed from: c */
    public static Drawable[] m7492c(@C0047z TextView textView) {
        return f3932a.mo4305c(textView);
    }
}
