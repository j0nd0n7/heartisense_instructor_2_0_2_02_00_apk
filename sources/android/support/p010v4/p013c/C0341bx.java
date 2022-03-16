package android.support.p010v4.p013c;

import android.app.Service;
import android.support.annotation.C0011ag;
import android.support.p010v4.p028k.C0798c;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: android.support.v4.c.bx */
public final class C0341bx {

    /* renamed from: a */
    public static final int f1825a = 1;

    /* renamed from: b */
    public static final int f1826b = 1;

    /* renamed from: c */
    public static final int f1827c = 2;

    /* renamed from: d */
    static final C0344c f1828d;

    /* renamed from: android.support.v4.c.bx$a */
    static class C0342a implements C0344c {
        C0342a() {
        }

        /* renamed from: a */
        public void mo1570a(Service service, int i) {
            C0346by.m2016a(service, i);
        }
    }

    /* renamed from: android.support.v4.c.bx$b */
    static class C0343b implements C0344c {
        C0343b() {
        }

        /* renamed from: a */
        public void mo1570a(Service service, int i) {
            service.stopForeground((i & 1) != 0);
        }
    }

    /* renamed from: android.support.v4.c.bx$c */
    interface C0344c {
        /* renamed from: a */
        void mo1570a(Service service, int i);
    }

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: android.support.v4.c.bx$d */
    public @interface C0345d {
    }

    static {
        if (C0798c.m4072a()) {
            f1828d = new C0342a();
        } else {
            f1828d = new C0343b();
        }
    }

    private C0341bx() {
    }

    /* renamed from: a */
    public static void m2012a(Service service, int i) {
        f1828d.mo1570a(service, i);
    }
}
