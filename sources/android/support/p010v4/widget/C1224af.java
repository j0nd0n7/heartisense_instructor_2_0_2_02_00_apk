package android.support.p010v4.widget;

import android.content.Context;
import android.os.Build;
import android.view.animation.Interpolator;
import android.widget.OverScroller;

/* renamed from: android.support.v4.widget.af */
public final class C1224af {

    /* renamed from: a */
    OverScroller f3793a;

    /* renamed from: b */
    private final boolean f3794b;

    C1224af(boolean z, Context context, Interpolator interpolator) {
        this.f3794b = z;
        this.f3793a = interpolator != null ? new OverScroller(context, interpolator) : new OverScroller(context);
    }

    /* renamed from: a */
    public static C1224af m7262a(Context context) {
        return m7263a(context, (Interpolator) null);
    }

    /* renamed from: a */
    public static C1224af m7263a(Context context, Interpolator interpolator) {
        return new C1224af(Build.VERSION.SDK_INT >= 14, context, interpolator);
    }

    /* renamed from: a */
    public void mo4123a(int i, int i2, int i3) {
        this.f3793a.notifyHorizontalEdgeReached(i, i2, i3);
    }

    /* renamed from: a */
    public void mo4124a(int i, int i2, int i3, int i4) {
        this.f3793a.startScroll(i, i2, i3, i4);
    }

    /* renamed from: a */
    public void mo4125a(int i, int i2, int i3, int i4, int i5) {
        this.f3793a.startScroll(i, i2, i3, i4, i5);
    }

    /* renamed from: a */
    public void mo4126a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f3793a.fling(i, i2, i3, i4, i5, i6, i7, i8);
    }

    /* renamed from: a */
    public void mo4127a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        this.f3793a.fling(i, i2, i3, i4, i5, i6, i7, i8, i9, i10);
    }

    /* renamed from: a */
    public boolean mo4128a() {
        return this.f3793a.isFinished();
    }

    /* renamed from: a */
    public boolean mo4129a(int i, int i2, int i3, int i4, int i5, int i6) {
        return this.f3793a.springBack(i, i2, i3, i4, i5, i6);
    }

    /* renamed from: b */
    public int mo4130b() {
        return this.f3793a.getCurrX();
    }

    /* renamed from: b */
    public void mo4131b(int i, int i2, int i3) {
        this.f3793a.notifyVerticalEdgeReached(i, i2, i3);
    }

    /* renamed from: c */
    public int mo4132c() {
        return this.f3793a.getCurrY();
    }

    /* renamed from: d */
    public int mo4133d() {
        return this.f3793a.getFinalX();
    }

    /* renamed from: e */
    public int mo4134e() {
        return this.f3793a.getFinalY();
    }

    /* renamed from: f */
    public float mo4135f() {
        if (this.f3794b) {
            return C1225ag.m7280a(this.f3793a);
        }
        return 0.0f;
    }

    /* renamed from: g */
    public boolean mo4136g() {
        return this.f3793a.computeScrollOffset();
    }

    /* renamed from: h */
    public void mo4137h() {
        this.f3793a.abortAnimation();
    }

    /* renamed from: i */
    public boolean mo4138i() {
        return this.f3793a.isOverScrolled();
    }
}
