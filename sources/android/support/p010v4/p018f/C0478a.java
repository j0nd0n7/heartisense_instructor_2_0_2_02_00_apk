package android.support.p010v4.p018f;

import android.graphics.Bitmap;
import android.os.Build;

/* renamed from: android.support.v4.f.a */
public final class C0478a {

    /* renamed from: a */
    static final C0480b f2052a;

    /* renamed from: android.support.v4.f.a$a */
    static class C0479a implements C0480b {
        C0479a() {
        }

        /* renamed from: a */
        public void mo1810a(Bitmap bitmap, boolean z) {
        }

        /* renamed from: a */
        public boolean mo1811a(Bitmap bitmap) {
            return false;
        }

        /* renamed from: b */
        public int mo1812b(Bitmap bitmap) {
            return bitmap.getRowBytes() * bitmap.getHeight();
        }
    }

    /* renamed from: android.support.v4.f.a$b */
    interface C0480b {
        /* renamed from: a */
        void mo1810a(Bitmap bitmap, boolean z);

        /* renamed from: a */
        boolean mo1811a(Bitmap bitmap);

        /* renamed from: b */
        int mo1812b(Bitmap bitmap);
    }

    /* renamed from: android.support.v4.f.a$c */
    static class C0481c extends C0479a {
        C0481c() {
        }

        /* renamed from: b */
        public int mo1812b(Bitmap bitmap) {
            return C0513b.m2680a(bitmap);
        }
    }

    /* renamed from: android.support.v4.f.a$d */
    static class C0482d extends C0481c {
        C0482d() {
        }

        /* renamed from: a */
        public void mo1810a(Bitmap bitmap, boolean z) {
            C0514c.m2681a(bitmap, z);
        }

        /* renamed from: a */
        public boolean mo1811a(Bitmap bitmap) {
            return C0514c.m2682a(bitmap);
        }
    }

    /* renamed from: android.support.v4.f.a$e */
    static class C0483e extends C0482d {
        C0483e() {
        }

        /* renamed from: b */
        public int mo1812b(Bitmap bitmap) {
            return C0515d.m2683a(bitmap);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 19) {
            f2052a = new C0483e();
        } else if (i >= 18) {
            f2052a = new C0482d();
        } else if (i >= 12) {
            f2052a = new C0481c();
        } else {
            f2052a = new C0479a();
        }
    }

    private C0478a() {
    }

    /* renamed from: a */
    public static void m2523a(Bitmap bitmap, boolean z) {
        f2052a.mo1810a(bitmap, z);
    }

    /* renamed from: a */
    public static boolean m2524a(Bitmap bitmap) {
        return f2052a.mo1811a(bitmap);
    }

    /* renamed from: b */
    public static int m2525b(Bitmap bitmap) {
        return f2052a.mo1812b(bitmap);
    }
}
