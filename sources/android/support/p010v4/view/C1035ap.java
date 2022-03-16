package android.support.p010v4.view;

import android.os.Build;
import android.view.VelocityTracker;

/* renamed from: android.support.v4.view.ap */
public final class C1035ap {

    /* renamed from: a */
    static final C1038c f3459a;

    /* renamed from: android.support.v4.view.ap$a */
    static class C1036a implements C1038c {
        C1036a() {
        }

        /* renamed from: a */
        public float mo3644a(VelocityTracker velocityTracker, int i) {
            return velocityTracker.getXVelocity();
        }

        /* renamed from: b */
        public float mo3645b(VelocityTracker velocityTracker, int i) {
            return velocityTracker.getYVelocity();
        }
    }

    /* renamed from: android.support.v4.view.ap$b */
    static class C1037b implements C1038c {
        C1037b() {
        }

        /* renamed from: a */
        public float mo3644a(VelocityTracker velocityTracker, int i) {
            return C1039aq.m5849a(velocityTracker, i);
        }

        /* renamed from: b */
        public float mo3645b(VelocityTracker velocityTracker, int i) {
            return C1039aq.m5850b(velocityTracker, i);
        }
    }

    /* renamed from: android.support.v4.view.ap$c */
    interface C1038c {
        /* renamed from: a */
        float mo3644a(VelocityTracker velocityTracker, int i);

        /* renamed from: b */
        float mo3645b(VelocityTracker velocityTracker, int i);
    }

    static {
        if (Build.VERSION.SDK_INT >= 11) {
            f3459a = new C1037b();
        } else {
            f3459a = new C1036a();
        }
    }

    private C1035ap() {
    }

    /* renamed from: a */
    public static float m5841a(VelocityTracker velocityTracker, int i) {
        return f3459a.mo3644a(velocityTracker, i);
    }

    /* renamed from: b */
    public static float m5842b(VelocityTracker velocityTracker, int i) {
        return f3459a.mo3645b(velocityTracker, i);
    }
}
