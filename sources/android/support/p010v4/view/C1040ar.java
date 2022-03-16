package android.support.p010v4.view;

import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.C0003aa;
import android.support.annotation.C0011ag;
import android.support.annotation.C0037p;
import android.support.annotation.C0039r;
import android.support.annotation.C0047z;
import android.support.p010v4.p028k.C0798c;
import android.support.p010v4.view.C1082bb;
import android.support.p010v4.view.p034a.C0949h;
import android.support.p010v4.view.p034a.C0979r;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* renamed from: android.support.v4.view.ar */
public class C1040ar {

    /* renamed from: A */
    public static final int f3460A = 4;

    /* renamed from: B */
    public static final int f3461B = 8;

    /* renamed from: C */
    public static final int f3462C = 16;

    /* renamed from: D */
    public static final int f3463D = 32;

    /* renamed from: E */
    static final C1057p f3464E;

    /* renamed from: F */
    private static final String f3465F = "ViewCompat";

    /* renamed from: G */
    private static final long f3466G = 10;
    @Deprecated

    /* renamed from: a */
    public static final int f3467a = 0;
    @Deprecated

    /* renamed from: b */
    public static final int f3468b = 1;
    @Deprecated

    /* renamed from: c */
    public static final int f3469c = 2;

    /* renamed from: d */
    public static final int f3470d = 0;

    /* renamed from: e */
    public static final int f3471e = 1;

    /* renamed from: f */
    public static final int f3472f = 2;

    /* renamed from: g */
    public static final int f3473g = 4;

    /* renamed from: h */
    public static final int f3474h = 0;

    /* renamed from: i */
    public static final int f3475i = 1;

    /* renamed from: j */
    public static final int f3476j = 2;

    /* renamed from: k */
    public static final int f3477k = 0;

    /* renamed from: l */
    public static final int f3478l = 1;

    /* renamed from: m */
    public static final int f3479m = 2;

    /* renamed from: n */
    public static final int f3480n = 0;

    /* renamed from: o */
    public static final int f3481o = 1;

    /* renamed from: p */
    public static final int f3482p = 2;

    /* renamed from: q */
    public static final int f3483q = 3;

    /* renamed from: r */
    public static final int f3484r = 16777215;

    /* renamed from: s */
    public static final int f3485s = -16777216;

    /* renamed from: t */
    public static final int f3486t = 16;

    /* renamed from: u */
    public static final int f3487u = 16777216;

    /* renamed from: v */
    public static final int f3488v = 0;

    /* renamed from: w */
    public static final int f3489w = 1;

    /* renamed from: x */
    public static final int f3490x = 2;

    /* renamed from: y */
    public static final int f3491y = 1;

    /* renamed from: z */
    public static final int f3492z = 2;

    /* renamed from: android.support.v4.view.ar$a */
    static class C1041a extends C1055n {
        C1041a() {
        }

        /* renamed from: a */
        public void mo3646a(View view, C1023aj ajVar) {
            C1058as.m6324a(view, ajVar != null ? ajVar.mo3628a() : null);
        }
    }

    /* renamed from: android.support.v4.view.ar$b */
    static class C1042b implements C1057p {

        /* renamed from: e */
        private static Method f3493e;

        /* renamed from: a */
        WeakHashMap<View, C1112bo> f3494a = null;

        /* renamed from: b */
        private Method f3495b;

        /* renamed from: c */
        private Method f3496c;

        /* renamed from: d */
        private boolean f3497d;

        C1042b() {
        }

        /* renamed from: a */
        private boolean m5970a(C1033an anVar, int i) {
            int computeHorizontalScrollOffset = anVar.computeHorizontalScrollOffset();
            int computeHorizontalScrollRange = anVar.computeHorizontalScrollRange() - anVar.computeHorizontalScrollExtent();
            if (computeHorizontalScrollRange == 0) {
                return false;
            }
            return i < 0 ? computeHorizontalScrollOffset > 0 : computeHorizontalScrollOffset < computeHorizontalScrollRange + -1;
        }

        /* renamed from: b */
        private void m5971b() {
            try {
                this.f3495b = View.class.getDeclaredMethod("dispatchStartTemporaryDetach", new Class[0]);
                this.f3496c = View.class.getDeclaredMethod("dispatchFinishTemporaryDetach", new Class[0]);
            } catch (NoSuchMethodException e) {
                Log.e(C1040ar.f3465F, "Couldn't find method", e);
            }
            this.f3497d = true;
        }

        /* renamed from: b */
        private boolean m5972b(C1033an anVar, int i) {
            int computeVerticalScrollOffset = anVar.computeVerticalScrollOffset();
            int computeVerticalScrollRange = anVar.computeVerticalScrollRange() - anVar.computeVerticalScrollExtent();
            if (computeVerticalScrollRange == 0) {
                return false;
            }
            return i < 0 ? computeVerticalScrollOffset > 0 : computeVerticalScrollOffset < computeVerticalScrollRange + -1;
        }

        /* renamed from: A */
        public float mo3647A(View view) {
            return 0.0f;
        }

        /* renamed from: B */
        public float mo3648B(View view) {
            return 0.0f;
        }

        /* renamed from: C */
        public float mo3649C(View view) {
            return 0.0f;
        }

        /* renamed from: D */
        public Matrix mo3650D(View view) {
            return null;
        }

        /* renamed from: E */
        public int mo3651E(View view) {
            return C1059at.m6332d(view);
        }

        /* renamed from: F */
        public int mo3652F(View view) {
            return C1059at.m6333e(view);
        }

        /* renamed from: G */
        public C1112bo mo3653G(View view) {
            return new C1112bo(view);
        }

        /* renamed from: H */
        public float mo3654H(View view) {
            return 0.0f;
        }

        /* renamed from: I */
        public float mo3655I(View view) {
            return 0.0f;
        }

        /* renamed from: J */
        public String mo3656J(View view) {
            return null;
        }

        /* renamed from: K */
        public int mo3657K(View view) {
            return 0;
        }

        /* renamed from: L */
        public void mo3658L(View view) {
        }

        /* renamed from: M */
        public float mo3659M(View view) {
            return 0.0f;
        }

        /* renamed from: N */
        public float mo3660N(View view) {
            return 0.0f;
        }

        /* renamed from: O */
        public Rect mo3661O(View view) {
            return null;
        }

        /* renamed from: P */
        public boolean mo3662P(View view) {
            return false;
        }

        /* renamed from: Q */
        public void mo3663Q(View view) {
        }

        /* renamed from: R */
        public boolean mo3664R(View view) {
            return false;
        }

        /* renamed from: S */
        public boolean mo3665S(View view) {
            if (view instanceof C1007aa) {
                return ((C1007aa) view).isNestedScrollingEnabled();
            }
            return false;
        }

        /* renamed from: T */
        public ColorStateList mo3666T(View view) {
            return C1059at.m6325a(view);
        }

        /* renamed from: U */
        public PorterDuff.Mode mo3667U(View view) {
            return C1059at.m6329b(view);
        }

        /* renamed from: V */
        public void mo3668V(View view) {
            if (view instanceof C1007aa) {
                ((C1007aa) view).stopNestedScroll();
            }
        }

        /* renamed from: W */
        public boolean mo3669W(View view) {
            if (view instanceof C1007aa) {
                return ((C1007aa) view).hasNestedScrollingParent();
            }
            return false;
        }

        /* renamed from: X */
        public boolean mo3670X(View view) {
            return false;
        }

        /* renamed from: Y */
        public boolean mo3671Y(View view) {
            return C1059at.m6331c(view);
        }

        /* renamed from: Z */
        public boolean mo3672Z(View view) {
            return false;
        }

        /* renamed from: a */
        public int mo3673a(int i, int i2) {
            return i | i2;
        }

        /* renamed from: a */
        public int mo3674a(int i, int i2, int i3) {
            return View.resolveSize(i, i2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public long mo3675a() {
            return C1040ar.f3466G;
        }

        /* renamed from: a */
        public C1134by mo3676a(View view, C1134by byVar) {
            return byVar;
        }

        /* renamed from: a */
        public void mo3677a(View view, float f) {
        }

        /* renamed from: a */
        public void mo3678a(View view, int i, int i2) {
        }

        /* renamed from: a */
        public void mo3679a(View view, int i, int i2, int i3, int i4) {
            view.invalidate(i, i2, i3, i4);
        }

        /* renamed from: a */
        public void mo3680a(View view, int i, Paint paint) {
        }

        /* renamed from: a */
        public void mo3681a(View view, ColorStateList colorStateList) {
            C1059at.m6327a(view, colorStateList);
        }

        /* renamed from: a */
        public void mo3682a(View view, Paint paint) {
        }

        /* renamed from: a */
        public void mo3683a(View view, PorterDuff.Mode mode) {
            C1059at.m6328a(view, mode);
        }

        /* renamed from: a */
        public void mo3684a(View view, Rect rect) {
        }

        /* renamed from: a */
        public void mo3685a(View view, Drawable drawable) {
            view.setBackgroundDrawable(drawable);
        }

        /* renamed from: a */
        public void mo3686a(View view, C0949h hVar) {
        }

        /* renamed from: a */
        public void mo3687a(View view, C1011ae aeVar) {
        }

        /* renamed from: a */
        public void mo3646a(View view, C1023aj ajVar) {
        }

        /* renamed from: a */
        public void mo3688a(View view, C1066b bVar) {
        }

        /* renamed from: a */
        public void mo3689a(View view, AccessibilityEvent accessibilityEvent) {
        }

        /* renamed from: a */
        public void mo3690a(View view, Runnable runnable) {
            view.postDelayed(runnable, mo3675a());
        }

        /* renamed from: a */
        public void mo3691a(View view, Runnable runnable, long j) {
            view.postDelayed(runnable, mo3675a() + j);
        }

        /* renamed from: a */
        public void mo3692a(View view, String str) {
        }

        /* renamed from: a */
        public void mo3693a(View view, boolean z) {
        }

        /* renamed from: a */
        public void mo3694a(ViewGroup viewGroup, boolean z) {
            if (f3493e == null) {
                Class<ViewGroup> cls = ViewGroup.class;
                try {
                    f3493e = cls.getDeclaredMethod("setChildrenDrawingOrderEnabled", new Class[]{Boolean.TYPE});
                } catch (NoSuchMethodException e) {
                    Log.e(C1040ar.f3465F, "Unable to find childrenDrawingOrderEnabled", e);
                }
                f3493e.setAccessible(true);
            }
            try {
                f3493e.invoke(viewGroup, new Object[]{Boolean.valueOf(z)});
            } catch (IllegalAccessException e2) {
                Log.e(C1040ar.f3465F, "Unable to invoke childrenDrawingOrderEnabled", e2);
            } catch (IllegalArgumentException e3) {
                Log.e(C1040ar.f3465F, "Unable to invoke childrenDrawingOrderEnabled", e3);
            } catch (InvocationTargetException e4) {
                Log.e(C1040ar.f3465F, "Unable to invoke childrenDrawingOrderEnabled", e4);
            }
        }

        /* renamed from: a */
        public boolean mo3695a(View view) {
            return false;
        }

        /* renamed from: a */
        public boolean mo3696a(View view, float f, float f2) {
            if (view instanceof C1007aa) {
                return ((C1007aa) view).dispatchNestedPreFling(f, f2);
            }
            return false;
        }

        /* renamed from: a */
        public boolean mo3697a(View view, float f, float f2, boolean z) {
            if (view instanceof C1007aa) {
                return ((C1007aa) view).dispatchNestedFling(f, f2, z);
            }
            return false;
        }

        /* renamed from: a */
        public boolean mo3698a(View view, int i) {
            return (view instanceof C1033an) && m5970a((C1033an) view, i);
        }

        /* renamed from: a */
        public boolean mo3699a(View view, int i, int i2, int i3, int i4, int[] iArr) {
            if (view instanceof C1007aa) {
                return ((C1007aa) view).dispatchNestedScroll(i, i2, i3, i4, iArr);
            }
            return false;
        }

        /* renamed from: a */
        public boolean mo3700a(View view, int i, int i2, int[] iArr, int[] iArr2) {
            if (view instanceof C1007aa) {
                return ((C1007aa) view).dispatchNestedPreScroll(i, i2, iArr, iArr2);
            }
            return false;
        }

        /* renamed from: a */
        public boolean mo3701a(View view, int i, Bundle bundle) {
            return false;
        }

        /* renamed from: aa */
        public float mo3702aa(View view) {
            return mo3660N(view) + mo3659M(view);
        }

        /* renamed from: ab */
        public boolean mo3703ab(View view) {
            return C1059at.m6334f(view);
        }

        /* renamed from: ac */
        public boolean mo3704ac(View view) {
            return false;
        }

        /* renamed from: ad */
        public int mo3705ad(View view) {
            return 0;
        }

        /* renamed from: ae */
        public Display mo3706ae(View view) {
            return C1059at.m6335g(view);
        }

        /* renamed from: b */
        public C1134by mo3707b(View view, C1134by byVar) {
            return byVar;
        }

        /* renamed from: b */
        public void mo3708b(View view, float f) {
        }

        /* renamed from: b */
        public void mo3709b(View view, int i, int i2, int i3, int i4) {
            view.setPadding(i, i2, i3, i4);
        }

        /* renamed from: b */
        public void mo3710b(View view, AccessibilityEvent accessibilityEvent) {
        }

        /* renamed from: b */
        public void mo3711b(View view, boolean z) {
        }

        /* renamed from: b */
        public boolean mo3712b(View view) {
            return false;
        }

        /* renamed from: b */
        public boolean mo3713b(View view, int i) {
            return (view instanceof C1033an) && m5972b((C1033an) view, i);
        }

        /* renamed from: c */
        public void mo3714c(View view) {
            view.invalidate();
        }

        /* renamed from: c */
        public void mo3715c(View view, float f) {
        }

        /* renamed from: c */
        public void mo3716c(View view, int i) {
        }

        /* renamed from: c */
        public void mo3717c(View view, boolean z) {
        }

        /* renamed from: d */
        public int mo3718d(View view) {
            return 0;
        }

        /* renamed from: d */
        public void mo3719d(View view, float f) {
        }

        /* renamed from: d */
        public void mo3720d(View view, int i) {
        }

        /* renamed from: d */
        public void mo3721d(View view, boolean z) {
        }

        /* renamed from: e */
        public void mo3722e(View view, float f) {
        }

        /* renamed from: e */
        public void mo3723e(View view, int i) {
        }

        /* renamed from: e */
        public void mo3724e(View view, boolean z) {
            if (view instanceof C1007aa) {
                ((C1007aa) view).setNestedScrollingEnabled(z);
            }
        }

        /* renamed from: e */
        public boolean mo3725e(View view) {
            return true;
        }

        /* renamed from: f */
        public C0979r mo3726f(View view) {
            return null;
        }

        /* renamed from: f */
        public void mo3727f(View view, float f) {
        }

        /* renamed from: f */
        public void mo3728f(View view, int i) {
        }

        /* renamed from: g */
        public float mo3729g(View view) {
            return 1.0f;
        }

        /* renamed from: g */
        public void mo3730g(View view, float f) {
        }

        /* renamed from: g */
        public boolean mo3731g(View view, int i) {
            if (view instanceof C1007aa) {
                return ((C1007aa) view).startNestedScroll(i);
            }
            return false;
        }

        /* renamed from: h */
        public int mo3732h(View view) {
            return 0;
        }

        /* renamed from: h */
        public void mo3733h(View view, float f) {
        }

        /* renamed from: h */
        public void mo3734h(View view, int i) {
        }

        /* renamed from: i */
        public int mo3735i(View view) {
            return 0;
        }

        /* renamed from: i */
        public void mo3736i(View view, float f) {
        }

        /* renamed from: i */
        public void mo3737i(View view, int i) {
            C1059at.m6330b(view, i);
        }

        /* renamed from: j */
        public int mo3738j(View view) {
            return 0;
        }

        /* renamed from: j */
        public void mo3739j(View view, float f) {
        }

        /* renamed from: j */
        public void mo3740j(View view, int i) {
            C1059at.m6326a(view, i);
        }

        /* renamed from: k */
        public ViewParent mo3741k(View view) {
            return view.getParent();
        }

        /* renamed from: k */
        public void mo3742k(View view, float f) {
        }

        /* renamed from: l */
        public int mo3743l(View view) {
            return view.getMeasuredWidth();
        }

        /* renamed from: l */
        public void mo3744l(View view, float f) {
        }

        /* renamed from: m */
        public int mo3745m(View view) {
            return view.getMeasuredHeight();
        }

        /* renamed from: m */
        public void mo3746m(View view, float f) {
        }

        /* renamed from: n */
        public int mo3747n(View view) {
            return 0;
        }

        /* renamed from: n */
        public void mo3748n(View view, float f) {
        }

        /* renamed from: o */
        public int mo3749o(View view) {
            return 0;
        }

        /* renamed from: o */
        public void mo3750o(View view, float f) {
        }

        /* renamed from: p */
        public int mo3751p(View view) {
            return view.getPaddingLeft();
        }

        /* renamed from: q */
        public int mo3752q(View view) {
            return view.getPaddingRight();
        }

        /* renamed from: r */
        public void mo3753r(View view) {
            if (!this.f3497d) {
                m5971b();
            }
            if (this.f3495b != null) {
                try {
                    this.f3495b.invoke(view, new Object[0]);
                } catch (Exception e) {
                    Log.d(C1040ar.f3465F, "Error calling dispatchStartTemporaryDetach", e);
                }
            } else {
                view.onStartTemporaryDetach();
            }
        }

        /* renamed from: s */
        public void mo3754s(View view) {
            if (!this.f3497d) {
                m5971b();
            }
            if (this.f3496c != null) {
                try {
                    this.f3496c.invoke(view, new Object[0]);
                } catch (Exception e) {
                    Log.d(C1040ar.f3465F, "Error calling dispatchFinishTemporaryDetach", e);
                }
            } else {
                view.onFinishTemporaryDetach();
            }
        }

        /* renamed from: t */
        public boolean mo3755t(View view) {
            return true;
        }

        /* renamed from: u */
        public float mo3756u(View view) {
            return 0.0f;
        }

        /* renamed from: v */
        public float mo3757v(View view) {
            return 0.0f;
        }

        /* renamed from: w */
        public float mo3758w(View view) {
            return (float) view.getLeft();
        }

        /* renamed from: x */
        public float mo3759x(View view) {
            return (float) view.getTop();
        }

        /* renamed from: y */
        public float mo3760y(View view) {
            return 0.0f;
        }

        /* renamed from: z */
        public float mo3761z(View view) {
            return 0.0f;
        }
    }

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: android.support.v4.view.ar$c */
    public @interface C1043c {
    }

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: android.support.v4.view.ar$d */
    public @interface C1044d {
    }

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: android.support.v4.view.ar$e */
    public @interface C1045e {
    }

    /* renamed from: android.support.v4.view.ar$f */
    static class C1046f extends C1042b {
        C1046f() {
        }

        /* renamed from: A */
        public float mo3647A(View view) {
            return C1060au.m6366l(view);
        }

        /* renamed from: B */
        public float mo3648B(View view) {
            return C1060au.m6368m(view);
        }

        /* renamed from: C */
        public float mo3649C(View view) {
            return C1060au.m6369n(view);
        }

        /* renamed from: D */
        public Matrix mo3650D(View view) {
            return C1060au.m6370o(view);
        }

        /* renamed from: H */
        public float mo3654H(View view) {
            return C1060au.m6371p(view);
        }

        /* renamed from: I */
        public float mo3655I(View view) {
            return C1060au.m6372q(view);
        }

        /* renamed from: Q */
        public void mo3663Q(View view) {
            C1060au.m6373r(view);
        }

        /* renamed from: a */
        public int mo3673a(int i, int i2) {
            return C1060au.m6337a(i, i2);
        }

        /* renamed from: a */
        public int mo3674a(int i, int i2, int i3) {
            return C1060au.m6338a(i, i2, i3);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public long mo3675a() {
            return C1060au.m6339a();
        }

        /* renamed from: a */
        public void mo3677a(View view, float f) {
            C1060au.m6355f(view, f);
        }

        /* renamed from: a */
        public void mo3680a(View view, int i, Paint paint) {
            C1060au.m6342a(view, i, paint);
        }

        /* renamed from: a */
        public void mo3682a(View view, Paint paint) {
            mo3680a(view, mo3732h(view), paint);
            view.invalidate();
        }

        /* renamed from: b */
        public void mo3708b(View view, float f) {
            C1060au.m6340a(view, f);
        }

        /* renamed from: c */
        public void mo3715c(View view, float f) {
            C1060au.m6345b(view, f);
        }

        /* renamed from: c */
        public void mo3717c(View view, boolean z) {
            C1060au.m6343a(view, z);
        }

        /* renamed from: d */
        public void mo3719d(View view, float f) {
            C1060au.m6349c(view, f);
        }

        /* renamed from: d */
        public void mo3721d(View view, boolean z) {
            C1060au.m6347b(view, z);
        }

        /* renamed from: e */
        public void mo3722e(View view, float f) {
            C1060au.m6357g(view, f);
        }

        /* renamed from: f */
        public void mo3727f(View view, float f) {
            C1060au.m6359h(view, f);
        }

        /* renamed from: g */
        public float mo3729g(View view) {
            return C1060au.m6336a(view);
        }

        /* renamed from: g */
        public void mo3730g(View view, float f) {
            C1060au.m6361i(view, f);
        }

        /* renamed from: h */
        public int mo3732h(View view) {
            return C1060au.m6344b(view);
        }

        /* renamed from: h */
        public void mo3733h(View view, float f) {
            C1060au.m6363j(view, f);
        }

        /* renamed from: i */
        public void mo3736i(View view, float f) {
            C1060au.m6351d(view, f);
        }

        /* renamed from: i */
        public void mo3737i(View view, int i) {
            C1060au.m6346b(view, i);
        }

        /* renamed from: j */
        public void mo3739j(View view, float f) {
            C1060au.m6353e(view, f);
        }

        /* renamed from: j */
        public void mo3740j(View view, int i) {
            C1060au.m6341a(view, i);
        }

        /* renamed from: k */
        public void mo3742k(View view, float f) {
            C1060au.m6365k(view, f);
        }

        /* renamed from: l */
        public int mo3743l(View view) {
            return C1060au.m6348c(view);
        }

        /* renamed from: l */
        public void mo3744l(View view, float f) {
            C1060au.m6367l(view, f);
        }

        /* renamed from: m */
        public int mo3745m(View view) {
            return C1060au.m6350d(view);
        }

        /* renamed from: n */
        public int mo3747n(View view) {
            return C1060au.m6352e(view);
        }

        /* renamed from: u */
        public float mo3756u(View view) {
            return C1060au.m6354f(view);
        }

        /* renamed from: v */
        public float mo3757v(View view) {
            return C1060au.m6356g(view);
        }

        /* renamed from: w */
        public float mo3758w(View view) {
            return C1060au.m6358h(view);
        }

        /* renamed from: x */
        public float mo3759x(View view) {
            return C1060au.m6360i(view);
        }

        /* renamed from: y */
        public float mo3760y(View view) {
            return C1060au.m6362j(view);
        }

        /* renamed from: z */
        public float mo3761z(View view) {
            return C1060au.m6364k(view);
        }
    }

    /* renamed from: android.support.v4.view.ar$g */
    static class C1047g extends C1048h {
        C1047g() {
        }

        /* renamed from: ac */
        public boolean mo3704ac(View view) {
            return C1062aw.m6382a(view);
        }
    }

    /* renamed from: android.support.v4.view.ar$h */
    static class C1048h extends C1046f {

        /* renamed from: b */
        static Field f3498b;

        /* renamed from: c */
        static boolean f3499c = false;

        C1048h() {
        }

        /* renamed from: G */
        public C1112bo mo3653G(View view) {
            if (this.f3494a == null) {
                this.f3494a = new WeakHashMap();
            }
            C1112bo boVar = (C1112bo) this.f3494a.get(view);
            if (boVar != null) {
                return boVar;
            }
            C1112bo boVar2 = new C1112bo(view);
            this.f3494a.put(view, boVar2);
            return boVar2;
        }

        /* renamed from: a */
        public void mo3686a(View view, C0949h hVar) {
            C1061av.m6380b(view, hVar.mo3155a());
        }

        /* renamed from: a */
        public void mo3688a(View view, @C0003aa C1066b bVar) {
            C1061av.m6376a(view, bVar == null ? null : bVar.mo3764a());
        }

        /* renamed from: a */
        public void mo3689a(View view, AccessibilityEvent accessibilityEvent) {
            C1061av.m6375a(view, accessibilityEvent);
        }

        /* renamed from: a */
        public boolean mo3695a(View view) {
            boolean z = true;
            if (f3499c) {
                return false;
            }
            if (f3498b == null) {
                try {
                    f3498b = View.class.getDeclaredField("mAccessibilityDelegate");
                    f3498b.setAccessible(true);
                } catch (Throwable th) {
                    f3499c = true;
                    return false;
                }
            }
            try {
                if (f3498b.get(view) == null) {
                    z = false;
                }
                return z;
            } catch (Throwable th2) {
                f3499c = true;
                return false;
            }
        }

        /* renamed from: a */
        public boolean mo3698a(View view, int i) {
            return C1061av.m6378a(view, i);
        }

        /* renamed from: b */
        public void mo3710b(View view, AccessibilityEvent accessibilityEvent) {
            C1061av.m6379b(view, accessibilityEvent);
        }

        /* renamed from: b */
        public void mo3711b(View view, boolean z) {
            C1061av.m6377a(view, z);
        }

        /* renamed from: b */
        public boolean mo3713b(View view, int i) {
            return C1061av.m6381b(view, i);
        }
    }

    /* renamed from: android.support.v4.view.ar$i */
    static class C1049i extends C1047g {
        C1049i() {
        }

        /* renamed from: E */
        public int mo3651E(View view) {
            return C1063ax.m6395f(view);
        }

        /* renamed from: F */
        public int mo3652F(View view) {
            return C1063ax.m6396g(view);
        }

        /* renamed from: L */
        public void mo3658L(View view) {
            C1063ax.m6397h(view);
        }

        /* renamed from: P */
        public boolean mo3662P(View view) {
            return C1063ax.m6398i(view);
        }

        /* renamed from: a */
        public void mo3679a(View view, int i, int i2, int i3, int i4) {
            C1063ax.m6384a(view, i, i2, i3, i4);
        }

        /* renamed from: a */
        public void mo3685a(View view, Drawable drawable) {
            C1063ax.m6385a(view, drawable);
        }

        /* renamed from: a */
        public void mo3690a(View view, Runnable runnable) {
            C1063ax.m6386a(view, runnable);
        }

        /* renamed from: a */
        public void mo3691a(View view, Runnable runnable, long j) {
            C1063ax.m6387a(view, runnable, j);
        }

        /* renamed from: a */
        public void mo3693a(View view, boolean z) {
            C1063ax.m6388a(view, z);
        }

        /* renamed from: a */
        public boolean mo3701a(View view, int i, Bundle bundle) {
            return C1063ax.m6390a(view, i, bundle);
        }

        /* renamed from: b */
        public boolean mo3712b(View view) {
            return C1063ax.m6389a(view);
        }

        /* renamed from: c */
        public void mo3714c(View view) {
            C1063ax.m6391b(view);
        }

        /* renamed from: c */
        public void mo3716c(View view, int i) {
            if (i == 4) {
                i = 2;
            }
            C1063ax.m6383a(view, i);
        }

        /* renamed from: d */
        public int mo3718d(View view) {
            return C1063ax.m6392c(view);
        }

        /* renamed from: f */
        public C0979r mo3726f(View view) {
            Object d = C1063ax.m6393d(view);
            if (d != null) {
                return new C0979r(d);
            }
            return null;
        }

        /* renamed from: k */
        public ViewParent mo3741k(View view) {
            return C1063ax.m6394e(view);
        }

        /* renamed from: t */
        public boolean mo3755t(View view) {
            return C1063ax.m6399j(view);
        }
    }

    /* renamed from: android.support.v4.view.ar$j */
    static class C1050j extends C1049i {
        C1050j() {
        }

        /* renamed from: K */
        public int mo3657K(View view) {
            return C1064ay.m6408e(view);
        }

        /* renamed from: R */
        public boolean mo3664R(View view) {
            return C1064ay.m6409f(view);
        }

        /* renamed from: a */
        public void mo3682a(View view, Paint paint) {
            C1064ay.m6403a(view, paint);
        }

        /* renamed from: ae */
        public Display mo3706ae(View view) {
            return C1064ay.m6410g(view);
        }

        /* renamed from: b */
        public void mo3709b(View view, int i, int i2, int i3, int i4) {
            C1064ay.m6402a(view, i, i2, i3, i4);
        }

        /* renamed from: d */
        public void mo3720d(View view, int i) {
            C1064ay.m6401a(view, i);
        }

        /* renamed from: e */
        public void mo3723e(View view, int i) {
            C1064ay.m6405b(view, i);
        }

        /* renamed from: i */
        public int mo3735i(View view) {
            return C1064ay.m6400a(view);
        }

        /* renamed from: j */
        public int mo3738j(View view) {
            return C1064ay.m6404b(view);
        }

        /* renamed from: p */
        public int mo3751p(View view) {
            return C1064ay.m6406c(view);
        }

        /* renamed from: q */
        public int mo3752q(View view) {
            return C1064ay.m6407d(view);
        }
    }

    /* renamed from: android.support.v4.view.ar$k */
    static class C1051k extends C1050j {
        C1051k() {
        }

        /* renamed from: O */
        public Rect mo3661O(View view) {
            return C1065az.m6411a(view);
        }

        /* renamed from: X */
        public boolean mo3670X(View view) {
            return C1065az.m6413b(view);
        }

        /* renamed from: a */
        public void mo3684a(View view, Rect rect) {
            C1065az.m6412a(view, rect);
        }
    }

    /* renamed from: android.support.v4.view.ar$l */
    static class C1052l extends C1051k {
        C1052l() {
        }

        /* renamed from: Y */
        public boolean mo3671Y(View view) {
            return C1081ba.m6487b(view);
        }

        /* renamed from: Z */
        public boolean mo3672Z(View view) {
            return C1081ba.m6489d(view);
        }

        /* renamed from: ab */
        public boolean mo3703ab(View view) {
            return C1081ba.m6488c(view);
        }

        /* renamed from: c */
        public void mo3716c(View view, int i) {
            C1063ax.m6383a(view, i);
        }

        /* renamed from: f */
        public void mo3728f(View view, int i) {
            C1081ba.m6486a(view, i);
        }

        /* renamed from: o */
        public int mo3749o(View view) {
            return C1081ba.m6485a(view);
        }
    }

    /* renamed from: android.support.v4.view.ar$m */
    static class C1053m extends C1052l {
        C1053m() {
        }

        /* renamed from: J */
        public String mo3656J(View view) {
            return C1082bb.m6492a(view);
        }

        /* renamed from: L */
        public void mo3658L(View view) {
            C1082bb.m6505b(view);
        }

        /* renamed from: M */
        public float mo3659M(View view) {
            return C1082bb.m6508c(view);
        }

        /* renamed from: N */
        public float mo3660N(View view) {
            return C1082bb.m6511d(view);
        }

        /* renamed from: S */
        public boolean mo3665S(View view) {
            return C1082bb.m6515h(view);
        }

        /* renamed from: T */
        public ColorStateList mo3666T(View view) {
            return C1082bb.m6513f(view);
        }

        /* renamed from: U */
        public PorterDuff.Mode mo3667U(View view) {
            return C1082bb.m6514g(view);
        }

        /* renamed from: V */
        public void mo3668V(View view) {
            C1082bb.m6516i(view);
        }

        /* renamed from: W */
        public boolean mo3669W(View view) {
            return C1082bb.m6517j(view);
        }

        /* renamed from: a */
        public C1134by mo3676a(View view, C1134by byVar) {
            return C1134by.m6815a(C1082bb.m6491a(view, C1134by.m6816a(byVar)));
        }

        /* renamed from: a */
        public void mo3681a(View view, ColorStateList colorStateList) {
            C1082bb.m6494a(view, colorStateList);
        }

        /* renamed from: a */
        public void mo3683a(View view, PorterDuff.Mode mode) {
            C1082bb.m6495a(view, mode);
        }

        /* renamed from: a */
        public void mo3687a(View view, final C1011ae aeVar) {
            if (aeVar == null) {
                C1082bb.m6496a(view, (C1082bb.C1084a) null);
            } else {
                C1082bb.m6496a(view, (C1082bb.C1084a) new C1082bb.C1084a() {
                    /* renamed from: a */
                    public Object mo3762a(View view, Object obj) {
                        return C1134by.m6816a(aeVar.mo3075a(view, C1134by.m6815a(obj)));
                    }
                });
            }
        }

        /* renamed from: a */
        public void mo3692a(View view, String str) {
            C1082bb.m6497a(view, str);
        }

        /* renamed from: a */
        public boolean mo3696a(View view, float f, float f2) {
            return C1082bb.m6499a(view, f, f2);
        }

        /* renamed from: a */
        public boolean mo3697a(View view, float f, float f2, boolean z) {
            return C1082bb.m6500a(view, f, f2, z);
        }

        /* renamed from: a */
        public boolean mo3699a(View view, int i, int i2, int i3, int i4, int[] iArr) {
            return C1082bb.m6502a(view, i, i2, i3, i4, iArr);
        }

        /* renamed from: a */
        public boolean mo3700a(View view, int i, int i2, int[] iArr, int[] iArr2) {
            return C1082bb.m6503a(view, i, i2, iArr, iArr2);
        }

        /* renamed from: aa */
        public float mo3702aa(View view) {
            return C1082bb.m6518k(view);
        }

        /* renamed from: b */
        public C1134by mo3707b(View view, C1134by byVar) {
            return C1134by.m6815a(C1082bb.m6504b(view, C1134by.m6816a(byVar)));
        }

        /* renamed from: e */
        public void mo3724e(View view, boolean z) {
            C1082bb.m6498a(view, z);
        }

        /* renamed from: e */
        public boolean mo3725e(View view) {
            return C1082bb.m6512e(view);
        }

        /* renamed from: g */
        public boolean mo3731g(View view, int i) {
            return C1082bb.m6501a(view, i);
        }

        /* renamed from: i */
        public void mo3737i(View view, int i) {
            C1082bb.m6510c(view, i);
        }

        /* renamed from: j */
        public void mo3740j(View view, int i) {
            C1082bb.m6507b(view, i);
        }

        /* renamed from: m */
        public void mo3746m(View view, float f) {
            C1082bb.m6493a(view, f);
        }

        /* renamed from: n */
        public void mo3748n(View view, float f) {
            C1082bb.m6506b(view, f);
        }

        /* renamed from: o */
        public void mo3750o(View view, float f) {
            C1082bb.m6509c(view, f);
        }
    }

    /* renamed from: android.support.v4.view.ar$n */
    static class C1055n extends C1053m {
        C1055n() {
        }

        /* renamed from: a */
        public void mo3678a(View view, int i, int i2) {
            C1085bc.m6522a(view, i, i2);
        }

        /* renamed from: ad */
        public int mo3705ad(View view) {
            return C1085bc.m6520a(view);
        }

        /* renamed from: h */
        public void mo3734h(View view, int i) {
            C1085bc.m6521a(view, i);
        }

        /* renamed from: i */
        public void mo3737i(View view, int i) {
            C1085bc.m6524c(view, i);
        }

        /* renamed from: j */
        public void mo3740j(View view, int i) {
            C1085bc.m6523b(view, i);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: android.support.v4.view.ar$o */
    public @interface C1056o {
    }

    /* renamed from: android.support.v4.view.ar$p */
    interface C1057p {
        /* renamed from: A */
        float mo3647A(View view);

        /* renamed from: B */
        float mo3648B(View view);

        /* renamed from: C */
        float mo3649C(View view);

        @C0003aa
        /* renamed from: D */
        Matrix mo3650D(View view);

        /* renamed from: E */
        int mo3651E(View view);

        /* renamed from: F */
        int mo3652F(View view);

        /* renamed from: G */
        C1112bo mo3653G(View view);

        /* renamed from: H */
        float mo3654H(View view);

        /* renamed from: I */
        float mo3655I(View view);

        /* renamed from: J */
        String mo3656J(View view);

        /* renamed from: K */
        int mo3657K(View view);

        /* renamed from: L */
        void mo3658L(View view);

        /* renamed from: M */
        float mo3659M(View view);

        /* renamed from: N */
        float mo3660N(View view);

        /* renamed from: O */
        Rect mo3661O(View view);

        /* renamed from: P */
        boolean mo3662P(View view);

        /* renamed from: Q */
        void mo3663Q(View view);

        /* renamed from: R */
        boolean mo3664R(View view);

        /* renamed from: S */
        boolean mo3665S(View view);

        /* renamed from: T */
        ColorStateList mo3666T(View view);

        /* renamed from: U */
        PorterDuff.Mode mo3667U(View view);

        /* renamed from: V */
        void mo3668V(View view);

        /* renamed from: W */
        boolean mo3669W(View view);

        /* renamed from: X */
        boolean mo3670X(View view);

        /* renamed from: Y */
        boolean mo3671Y(View view);

        /* renamed from: Z */
        boolean mo3672Z(View view);

        /* renamed from: a */
        int mo3673a(int i, int i2);

        /* renamed from: a */
        int mo3674a(int i, int i2, int i3);

        /* renamed from: a */
        C1134by mo3676a(View view, C1134by byVar);

        /* renamed from: a */
        void mo3677a(View view, float f);

        /* renamed from: a */
        void mo3678a(View view, int i, int i2);

        /* renamed from: a */
        void mo3679a(View view, int i, int i2, int i3, int i4);

        /* renamed from: a */
        void mo3680a(View view, int i, Paint paint);

        /* renamed from: a */
        void mo3681a(View view, ColorStateList colorStateList);

        /* renamed from: a */
        void mo3682a(View view, Paint paint);

        /* renamed from: a */
        void mo3683a(View view, PorterDuff.Mode mode);

        /* renamed from: a */
        void mo3684a(View view, Rect rect);

        /* renamed from: a */
        void mo3685a(View view, Drawable drawable);

        /* renamed from: a */
        void mo3686a(View view, C0949h hVar);

        /* renamed from: a */
        void mo3687a(View view, C1011ae aeVar);

        /* renamed from: a */
        void mo3646a(View view, C1023aj ajVar);

        /* renamed from: a */
        void mo3688a(View view, @C0003aa C1066b bVar);

        /* renamed from: a */
        void mo3689a(View view, AccessibilityEvent accessibilityEvent);

        /* renamed from: a */
        void mo3690a(View view, Runnable runnable);

        /* renamed from: a */
        void mo3691a(View view, Runnable runnable, long j);

        /* renamed from: a */
        void mo3692a(View view, String str);

        /* renamed from: a */
        void mo3693a(View view, boolean z);

        /* renamed from: a */
        void mo3694a(ViewGroup viewGroup, boolean z);

        /* renamed from: a */
        boolean mo3695a(View view);

        /* renamed from: a */
        boolean mo3696a(View view, float f, float f2);

        /* renamed from: a */
        boolean mo3697a(View view, float f, float f2, boolean z);

        /* renamed from: a */
        boolean mo3698a(View view, int i);

        /* renamed from: a */
        boolean mo3699a(View view, int i, int i2, int i3, int i4, int[] iArr);

        /* renamed from: a */
        boolean mo3700a(View view, int i, int i2, int[] iArr, int[] iArr2);

        /* renamed from: a */
        boolean mo3701a(View view, int i, Bundle bundle);

        /* renamed from: aa */
        float mo3702aa(View view);

        /* renamed from: ab */
        boolean mo3703ab(View view);

        /* renamed from: ac */
        boolean mo3704ac(View view);

        /* renamed from: ad */
        int mo3705ad(View view);

        /* renamed from: ae */
        Display mo3706ae(View view);

        /* renamed from: b */
        C1134by mo3707b(View view, C1134by byVar);

        /* renamed from: b */
        void mo3708b(View view, float f);

        /* renamed from: b */
        void mo3709b(View view, int i, int i2, int i3, int i4);

        /* renamed from: b */
        void mo3710b(View view, AccessibilityEvent accessibilityEvent);

        /* renamed from: b */
        void mo3711b(View view, boolean z);

        /* renamed from: b */
        boolean mo3712b(View view);

        /* renamed from: b */
        boolean mo3713b(View view, int i);

        /* renamed from: c */
        void mo3714c(View view);

        /* renamed from: c */
        void mo3715c(View view, float f);

        /* renamed from: c */
        void mo3716c(View view, int i);

        /* renamed from: c */
        void mo3717c(View view, boolean z);

        /* renamed from: d */
        int mo3718d(View view);

        /* renamed from: d */
        void mo3719d(View view, float f);

        /* renamed from: d */
        void mo3720d(View view, int i);

        /* renamed from: d */
        void mo3721d(View view, boolean z);

        /* renamed from: e */
        void mo3722e(View view, float f);

        /* renamed from: e */
        void mo3723e(View view, int i);

        /* renamed from: e */
        void mo3724e(View view, boolean z);

        /* renamed from: e */
        boolean mo3725e(View view);

        /* renamed from: f */
        C0979r mo3726f(View view);

        /* renamed from: f */
        void mo3727f(View view, float f);

        /* renamed from: f */
        void mo3728f(View view, int i);

        /* renamed from: g */
        float mo3729g(View view);

        /* renamed from: g */
        void mo3730g(View view, float f);

        /* renamed from: g */
        boolean mo3731g(View view, int i);

        /* renamed from: h */
        int mo3732h(View view);

        /* renamed from: h */
        void mo3733h(View view, float f);

        /* renamed from: h */
        void mo3734h(View view, int i);

        /* renamed from: i */
        int mo3735i(View view);

        /* renamed from: i */
        void mo3736i(View view, float f);

        /* renamed from: i */
        void mo3737i(View view, int i);

        /* renamed from: j */
        int mo3738j(View view);

        /* renamed from: j */
        void mo3739j(View view, float f);

        /* renamed from: j */
        void mo3740j(View view, int i);

        /* renamed from: k */
        ViewParent mo3741k(View view);

        /* renamed from: k */
        void mo3742k(View view, float f);

        /* renamed from: l */
        int mo3743l(View view);

        /* renamed from: l */
        void mo3744l(View view, float f);

        /* renamed from: m */
        int mo3745m(View view);

        /* renamed from: m */
        void mo3746m(View view, float f);

        /* renamed from: n */
        int mo3747n(View view);

        /* renamed from: n */
        void mo3748n(View view, float f);

        /* renamed from: o */
        int mo3749o(View view);

        /* renamed from: o */
        void mo3750o(View view, float f);

        /* renamed from: p */
        int mo3751p(View view);

        /* renamed from: q */
        int mo3752q(View view);

        /* renamed from: r */
        void mo3753r(View view);

        /* renamed from: s */
        void mo3754s(View view);

        /* renamed from: t */
        boolean mo3755t(View view);

        /* renamed from: u */
        float mo3756u(View view);

        /* renamed from: v */
        float mo3757v(View view);

        /* renamed from: w */
        float mo3758w(View view);

        /* renamed from: x */
        float mo3759x(View view);

        /* renamed from: y */
        float mo3760y(View view);

        /* renamed from: z */
        float mo3761z(View view);
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (C0798c.m4072a()) {
            f3464E = new C1041a();
        } else if (i >= 23) {
            f3464E = new C1055n();
        } else if (i >= 21) {
            f3464E = new C1053m();
        } else if (i >= 19) {
            f3464E = new C1052l();
        } else if (i >= 18) {
            f3464E = new C1051k();
        } else if (i >= 17) {
            f3464E = new C1050j();
        } else if (i >= 16) {
            f3464E = new C1049i();
        } else if (i >= 15) {
            f3464E = new C1047g();
        } else if (i >= 14) {
            f3464E = new C1048h();
        } else if (i >= 11) {
            f3464E = new C1046f();
        } else {
            f3464E = new C1042b();
        }
    }

    protected C1040ar() {
    }

    /* renamed from: A */
    public static C1112bo m5851A(View view) {
        return f3464E.mo3653G(view);
    }

    /* renamed from: B */
    public static float m5852B(View view) {
        return f3464E.mo3654H(view);
    }

    /* renamed from: C */
    public static float m5853C(View view) {
        return f3464E.mo3655I(view);
    }

    /* renamed from: D */
    public static float m5854D(View view) {
        return f3464E.mo3760y(view);
    }

    /* renamed from: E */
    public static float m5855E(View view) {
        return f3464E.mo3761z(view);
    }

    /* renamed from: F */
    public static float m5856F(View view) {
        return f3464E.mo3647A(view);
    }

    /* renamed from: G */
    public static float m5857G(View view) {
        return f3464E.mo3648B(view);
    }

    /* renamed from: H */
    public static float m5858H(View view) {
        return f3464E.mo3649C(view);
    }

    /* renamed from: I */
    public static float m5859I(View view) {
        return f3464E.mo3758w(view);
    }

    /* renamed from: J */
    public static float m5860J(View view) {
        return f3464E.mo3759x(view);
    }

    /* renamed from: K */
    public static float m5861K(View view) {
        return f3464E.mo3659M(view);
    }

    /* renamed from: L */
    public static float m5862L(View view) {
        return f3464E.mo3660N(view);
    }

    /* renamed from: M */
    public static String m5863M(View view) {
        return f3464E.mo3656J(view);
    }

    /* renamed from: N */
    public static int m5864N(View view) {
        return f3464E.mo3657K(view);
    }

    /* renamed from: O */
    public static void m5865O(View view) {
        f3464E.mo3658L(view);
    }

    /* renamed from: P */
    public static boolean m5866P(View view) {
        return f3464E.mo3662P(view);
    }

    /* renamed from: Q */
    public static void m5867Q(View view) {
        f3464E.mo3663Q(view);
    }

    /* renamed from: R */
    public static boolean m5868R(View view) {
        return f3464E.mo3755t(view);
    }

    /* renamed from: S */
    public static boolean m5869S(View view) {
        return f3464E.mo3664R(view);
    }

    /* renamed from: T */
    public static ColorStateList m5870T(View view) {
        return f3464E.mo3666T(view);
    }

    /* renamed from: U */
    public static PorterDuff.Mode m5871U(View view) {
        return f3464E.mo3667U(view);
    }

    /* renamed from: V */
    public static boolean m5872V(View view) {
        return f3464E.mo3665S(view);
    }

    /* renamed from: W */
    public static void m5873W(View view) {
        f3464E.mo3668V(view);
    }

    /* renamed from: X */
    public static boolean m5874X(View view) {
        return f3464E.mo3669W(view);
    }

    /* renamed from: Y */
    public static boolean m5875Y(View view) {
        return f3464E.mo3670X(view);
    }

    /* renamed from: Z */
    public static boolean m5876Z(View view) {
        return f3464E.mo3671Y(view);
    }

    /* renamed from: a */
    public static int m5877a(int i, int i2) {
        return f3464E.mo3673a(i, i2);
    }

    /* renamed from: a */
    public static int m5878a(int i, int i2, int i3) {
        return f3464E.mo3674a(i, i2, i3);
    }

    @Deprecated
    /* renamed from: a */
    public static int m5879a(View view) {
        return view.getOverScrollMode();
    }

    /* renamed from: a */
    public static C1134by m5880a(View view, C1134by byVar) {
        return f3464E.mo3676a(view, byVar);
    }

    /* renamed from: a */
    public static void m5881a(View view, float f) {
        f3464E.mo3708b(view, f);
    }

    /* renamed from: a */
    public static void m5882a(@C0047z View view, int i, int i2) {
        f3464E.mo3678a(view, i, i2);
    }

    /* renamed from: a */
    public static void m5883a(View view, int i, int i2, int i3, int i4) {
        f3464E.mo3679a(view, i, i2, i3, i4);
    }

    /* renamed from: a */
    public static void m5884a(View view, int i, Paint paint) {
        f3464E.mo3680a(view, i, paint);
    }

    /* renamed from: a */
    public static void m5885a(View view, ColorStateList colorStateList) {
        f3464E.mo3681a(view, colorStateList);
    }

    /* renamed from: a */
    public static void m5886a(View view, Paint paint) {
        f3464E.mo3682a(view, paint);
    }

    /* renamed from: a */
    public static void m5887a(View view, PorterDuff.Mode mode) {
        f3464E.mo3683a(view, mode);
    }

    /* renamed from: a */
    public static void m5888a(View view, Rect rect) {
        f3464E.mo3684a(view, rect);
    }

    /* renamed from: a */
    public static void m5889a(View view, Drawable drawable) {
        f3464E.mo3685a(view, drawable);
    }

    /* renamed from: a */
    public static void m5890a(View view, C0949h hVar) {
        f3464E.mo3686a(view, hVar);
    }

    /* renamed from: a */
    public static void m5891a(View view, C1011ae aeVar) {
        f3464E.mo3687a(view, aeVar);
    }

    /* renamed from: a */
    public static void m5892a(@C0047z View view, C1023aj ajVar) {
        f3464E.mo3646a(view, ajVar);
    }

    /* renamed from: a */
    public static void m5893a(View view, C1066b bVar) {
        f3464E.mo3688a(view, bVar);
    }

    /* renamed from: a */
    public static void m5894a(View view, AccessibilityEvent accessibilityEvent) {
        f3464E.mo3689a(view, accessibilityEvent);
    }

    /* renamed from: a */
    public static void m5895a(View view, Runnable runnable) {
        f3464E.mo3690a(view, runnable);
    }

    /* renamed from: a */
    public static void m5896a(View view, Runnable runnable, long j) {
        f3464E.mo3691a(view, runnable, j);
    }

    /* renamed from: a */
    public static void m5897a(View view, String str) {
        f3464E.mo3692a(view, str);
    }

    /* renamed from: a */
    public static void m5898a(View view, boolean z) {
        f3464E.mo3693a(view, z);
    }

    /* renamed from: a */
    public static void m5899a(ViewGroup viewGroup, boolean z) {
        f3464E.mo3694a(viewGroup, z);
    }

    /* renamed from: a */
    public static boolean m5900a(View view, float f, float f2) {
        return f3464E.mo3696a(view, f, f2);
    }

    /* renamed from: a */
    public static boolean m5901a(View view, float f, float f2, boolean z) {
        return f3464E.mo3697a(view, f, f2, z);
    }

    /* renamed from: a */
    public static boolean m5902a(View view, int i) {
        return f3464E.mo3698a(view, i);
    }

    /* renamed from: a */
    public static boolean m5903a(View view, int i, int i2, int i3, int i4, int[] iArr) {
        return f3464E.mo3699a(view, i, i2, i3, i4, iArr);
    }

    /* renamed from: a */
    public static boolean m5904a(View view, int i, int i2, int[] iArr, int[] iArr2) {
        return f3464E.mo3700a(view, i, i2, iArr, iArr2);
    }

    /* renamed from: a */
    public static boolean m5905a(View view, int i, Bundle bundle) {
        return f3464E.mo3701a(view, i, bundle);
    }

    /* renamed from: aa */
    public static boolean m5906aa(View view) {
        return f3464E.mo3672Z(view);
    }

    /* renamed from: ab */
    public static float m5907ab(View view) {
        return f3464E.mo3702aa(view);
    }

    /* renamed from: ac */
    public static Rect m5908ac(View view) {
        return f3464E.mo3661O(view);
    }

    /* renamed from: ad */
    public static boolean m5909ad(View view) {
        return f3464E.mo3703ab(view);
    }

    /* renamed from: ae */
    public static boolean m5910ae(View view) {
        return f3464E.mo3704ac(view);
    }

    /* renamed from: af */
    public static int m5911af(@C0047z View view) {
        return f3464E.mo3705ad(view);
    }

    /* renamed from: ag */
    public static Display m5912ag(@C0047z View view) {
        return f3464E.mo3706ae(view);
    }

    /* renamed from: b */
    public static C1134by m5913b(View view, C1134by byVar) {
        return f3464E.mo3707b(view, byVar);
    }

    /* renamed from: b */
    public static void m5914b(View view, float f) {
        f3464E.mo3715c(view, f);
    }

    /* renamed from: b */
    public static void m5915b(View view, int i, int i2, int i3, int i4) {
        f3464E.mo3709b(view, i, i2, i3, i4);
    }

    /* renamed from: b */
    public static void m5916b(View view, AccessibilityEvent accessibilityEvent) {
        f3464E.mo3710b(view, accessibilityEvent);
    }

    /* renamed from: b */
    public static void m5917b(View view, boolean z) {
        f3464E.mo3711b(view, z);
    }

    /* renamed from: b */
    public static boolean m5918b(View view) {
        return f3464E.mo3695a(view);
    }

    /* renamed from: b */
    public static boolean m5919b(View view, int i) {
        return f3464E.mo3713b(view, i);
    }

    /* renamed from: c */
    public static void m5920c(View view, @C0037p(mo18a = 0.0d, mo19b = 1.0d) float f) {
        f3464E.mo3719d(view, f);
    }

    @Deprecated
    /* renamed from: c */
    public static void m5921c(View view, int i) {
        view.setOverScrollMode(i);
    }

    /* renamed from: c */
    public static void m5922c(View view, boolean z) {
        f3464E.mo3717c(view, z);
    }

    /* renamed from: c */
    public static boolean m5923c(View view) {
        return f3464E.mo3712b(view);
    }

    /* renamed from: d */
    public static void m5924d(View view) {
        f3464E.mo3714c(view);
    }

    /* renamed from: d */
    public static void m5925d(View view, float f) {
        f3464E.mo3736i(view, f);
    }

    /* renamed from: d */
    public static void m5926d(View view, int i) {
        f3464E.mo3716c(view, i);
    }

    /* renamed from: d */
    public static void m5927d(View view, boolean z) {
        f3464E.mo3721d(view, z);
    }

    /* renamed from: e */
    public static int m5928e(View view) {
        return f3464E.mo3718d(view);
    }

    /* renamed from: e */
    public static void m5929e(View view, float f) {
        f3464E.mo3739j(view, f);
    }

    /* renamed from: e */
    public static void m5930e(View view, @C0039r int i) {
        f3464E.mo3720d(view, i);
    }

    /* renamed from: e */
    public static void m5931e(View view, boolean z) {
        f3464E.mo3724e(view, z);
    }

    /* renamed from: f */
    public static void m5932f(View view, float f) {
        f3464E.mo3677a(view, f);
    }

    /* renamed from: f */
    public static void m5933f(View view, int i) {
        f3464E.mo3723e(view, i);
    }

    /* renamed from: f */
    public static boolean m5934f(View view) {
        return f3464E.mo3725e(view);
    }

    /* renamed from: g */
    public static C0979r m5935g(View view) {
        return f3464E.mo3726f(view);
    }

    /* renamed from: g */
    public static void m5936g(View view, float f) {
        f3464E.mo3722e(view, f);
    }

    /* renamed from: g */
    public static void m5937g(View view, int i) {
        f3464E.mo3728f(view, i);
    }

    /* renamed from: h */
    public static float m5938h(View view) {
        return f3464E.mo3729g(view);
    }

    /* renamed from: h */
    public static void m5939h(View view, float f) {
        f3464E.mo3727f(view, f);
    }

    /* renamed from: h */
    public static boolean m5940h(View view, int i) {
        return f3464E.mo3731g(view, i);
    }

    /* renamed from: i */
    public static int m5941i(View view) {
        return f3464E.mo3732h(view);
    }

    /* renamed from: i */
    public static void m5942i(View view, float f) {
        f3464E.mo3730g(view, f);
    }

    /* renamed from: i */
    public static void m5943i(View view, int i) {
        f3464E.mo3740j(view, i);
    }

    /* renamed from: j */
    public static int m5944j(View view) {
        return f3464E.mo3735i(view);
    }

    /* renamed from: j */
    public static void m5945j(View view, float f) {
        f3464E.mo3733h(view, f);
    }

    /* renamed from: j */
    public static void m5946j(View view, int i) {
        f3464E.mo3737i(view, i);
    }

    /* renamed from: k */
    public static int m5947k(View view) {
        return f3464E.mo3738j(view);
    }

    /* renamed from: k */
    public static void m5948k(View view, float f) {
        f3464E.mo3742k(view, f);
    }

    /* renamed from: k */
    public static void m5949k(@C0047z View view, int i) {
        f3464E.mo3734h(view, i);
    }

    /* renamed from: l */
    public static ViewParent m5950l(View view) {
        return f3464E.mo3741k(view);
    }

    /* renamed from: l */
    public static void m5951l(View view, float f) {
        f3464E.mo3744l(view, f);
    }

    /* renamed from: m */
    public static void m5952m(View view, float f) {
        f3464E.mo3746m(view, f);
    }

    @Deprecated
    /* renamed from: m */
    public static boolean m5953m(View view) {
        return view.isOpaque();
    }

    /* renamed from: n */
    public static int m5954n(View view) {
        return f3464E.mo3743l(view);
    }

    /* renamed from: n */
    public static void m5955n(View view, float f) {
        f3464E.mo3748n(view, f);
    }

    /* renamed from: o */
    public static int m5956o(View view) {
        return f3464E.mo3745m(view);
    }

    /* renamed from: o */
    public static void m5957o(View view, float f) {
        f3464E.mo3750o(view, f);
    }

    /* renamed from: p */
    public static int m5958p(View view) {
        return f3464E.mo3747n(view);
    }

    /* renamed from: q */
    public static int m5959q(View view) {
        return f3464E.mo3749o(view);
    }

    /* renamed from: r */
    public static int m5960r(View view) {
        return f3464E.mo3751p(view);
    }

    /* renamed from: s */
    public static int m5961s(View view) {
        return f3464E.mo3752q(view);
    }

    /* renamed from: t */
    public static void m5962t(View view) {
        f3464E.mo3753r(view);
    }

    /* renamed from: u */
    public static void m5963u(View view) {
        f3464E.mo3754s(view);
    }

    /* renamed from: v */
    public static float m5964v(View view) {
        return f3464E.mo3756u(view);
    }

    /* renamed from: w */
    public static float m5965w(View view) {
        return f3464E.mo3757v(view);
    }

    @C0003aa
    /* renamed from: x */
    public static Matrix m5966x(View view) {
        return f3464E.mo3650D(view);
    }

    /* renamed from: y */
    public static int m5967y(View view) {
        return f3464E.mo3651E(view);
    }

    /* renamed from: z */
    public static int m5968z(View view) {
        return f3464E.mo3652F(view);
    }
}
