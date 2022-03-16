package android.support.p010v4.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.support.annotation.C0011ag;
import android.support.p010v4.p028k.C0798c;

/* renamed from: android.support.v4.view.aj */
public final class C1023aj {

    /* renamed from: a */
    public static final int f3433a = 0;

    /* renamed from: b */
    public static final int f3434b = 1000;

    /* renamed from: c */
    public static final int f3435c = 1001;

    /* renamed from: d */
    public static final int f3436d = 1002;

    /* renamed from: e */
    public static final int f3437e = 1003;

    /* renamed from: f */
    public static final int f3438f = 1004;

    /* renamed from: g */
    public static final int f3439g = 1006;

    /* renamed from: h */
    public static final int f3440h = 1007;

    /* renamed from: i */
    public static final int f3441i = 1008;

    /* renamed from: j */
    public static final int f3442j = 1009;

    /* renamed from: k */
    public static final int f3443k = 1010;

    /* renamed from: l */
    public static final int f3444l = 1011;

    /* renamed from: m */
    public static final int f3445m = 1012;

    /* renamed from: n */
    public static final int f3446n = 1013;

    /* renamed from: o */
    public static final int f3447o = 1014;

    /* renamed from: p */
    public static final int f3448p = 1015;

    /* renamed from: q */
    public static final int f3449q = 1016;

    /* renamed from: r */
    public static final int f3450r = 1017;

    /* renamed from: s */
    public static final int f3451s = 1018;

    /* renamed from: t */
    public static final int f3452t = 1019;

    /* renamed from: u */
    public static final int f3453u = 1020;

    /* renamed from: v */
    public static final int f3454v = 1021;

    /* renamed from: w */
    public static final int f3455w = 1000;

    /* renamed from: x */
    static final C1026c f3456x;

    /* renamed from: y */
    private Object f3457y;

    /* renamed from: android.support.v4.view.aj$a */
    static class C1024a extends C1025b {
        C1024a() {
        }

        /* renamed from: a */
        public Object mo3629a(Context context, int i) {
            return C1027ak.m5828a(context, i);
        }

        /* renamed from: a */
        public Object mo3630a(Resources resources, int i) {
            return C1027ak.m5829a(resources, i);
        }

        /* renamed from: a */
        public Object mo3631a(Bitmap bitmap, float f, float f2) {
            return C1027ak.m5830a(bitmap, f, f2);
        }
    }

    /* renamed from: android.support.v4.view.aj$b */
    static class C1025b implements C1026c {
        C1025b() {
        }

        /* renamed from: a */
        public Object mo3629a(Context context, int i) {
            return null;
        }

        /* renamed from: a */
        public Object mo3630a(Resources resources, int i) {
            return null;
        }

        /* renamed from: a */
        public Object mo3631a(Bitmap bitmap, float f, float f2) {
            return null;
        }
    }

    /* renamed from: android.support.v4.view.aj$c */
    interface C1026c {
        /* renamed from: a */
        Object mo3629a(Context context, int i);

        /* renamed from: a */
        Object mo3630a(Resources resources, int i);

        /* renamed from: a */
        Object mo3631a(Bitmap bitmap, float f, float f2);
    }

    static {
        if (C0798c.m4072a()) {
            f3456x = new C1024a();
        } else {
            f3456x = new C1025b();
        }
    }

    private C1023aj(Object obj) {
        this.f3457y = obj;
    }

    /* renamed from: a */
    public static C1023aj m5815a(Context context, int i) {
        return new C1023aj(f3456x.mo3629a(context, i));
    }

    /* renamed from: a */
    public static C1023aj m5816a(Resources resources, int i) {
        return new C1023aj(f3456x.mo3630a(resources, i));
    }

    /* renamed from: a */
    public static C1023aj m5817a(Bitmap bitmap, float f, float f2) {
        return new C1023aj(f3456x.mo3631a(bitmap, f, f2));
    }

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    /* renamed from: a */
    public Object mo3628a() {
        return this.f3457y;
    }
}
