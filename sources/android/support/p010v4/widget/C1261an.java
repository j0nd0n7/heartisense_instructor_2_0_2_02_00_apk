package android.support.p010v4.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.C0003aa;
import android.support.annotation.C0020ao;
import android.support.annotation.C0032k;
import android.support.annotation.C0033l;
import android.support.p010v4.p014d.C0434d;
import android.support.p010v4.view.C1007aa;
import android.support.p010v4.view.C1008ab;
import android.support.p010v4.view.C1009ac;
import android.support.p010v4.view.C1010ad;
import android.support.p010v4.view.C1040ar;
import android.support.p010v4.view.C1200x;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.AbsListView;

/* renamed from: android.support.v4.widget.an */
public class C1261an extends ViewGroup implements C1007aa, C1009ac {

    /* renamed from: A */
    private static final int f3865A = 200;

    /* renamed from: B */
    private static final int f3866B = -328966;

    /* renamed from: C */
    private static final int f3867C = 64;

    /* renamed from: T */
    private static final int[] f3868T = {16842766};

    /* renamed from: a */
    public static final int f3869a = 0;

    /* renamed from: b */
    public static final int f3870b = 1;
    @C0020ao

    /* renamed from: c */
    static final int f3871c = 40;
    @C0020ao

    /* renamed from: d */
    static final int f3872d = 56;

    /* renamed from: q */
    private static final String f3873q = C1261an.class.getSimpleName();

    /* renamed from: r */
    private static final int f3874r = 255;

    /* renamed from: s */
    private static final int f3875s = 76;

    /* renamed from: t */
    private static final float f3876t = 2.0f;

    /* renamed from: u */
    private static final int f3877u = -1;

    /* renamed from: v */
    private static final float f3878v = 0.5f;

    /* renamed from: w */
    private static final float f3879w = 0.8f;

    /* renamed from: x */
    private static final int f3880x = 150;

    /* renamed from: y */
    private static final int f3881y = 300;

    /* renamed from: z */
    private static final int f3882z = 200;

    /* renamed from: D */
    private View f3883D;

    /* renamed from: E */
    private int f3884E;

    /* renamed from: F */
    private float f3885F;

    /* renamed from: G */
    private float f3886G;

    /* renamed from: H */
    private final C1010ad f3887H;

    /* renamed from: I */
    private final C1008ab f3888I;

    /* renamed from: J */
    private final int[] f3889J;

    /* renamed from: K */
    private final int[] f3890K;

    /* renamed from: L */
    private boolean f3891L;

    /* renamed from: M */
    private int f3892M;

    /* renamed from: N */
    private float f3893N;

    /* renamed from: O */
    private float f3894O;

    /* renamed from: P */
    private boolean f3895P;

    /* renamed from: Q */
    private int f3896Q;

    /* renamed from: R */
    private boolean f3897R;

    /* renamed from: S */
    private final DecelerateInterpolator f3898S;

    /* renamed from: U */
    private int f3899U;

    /* renamed from: V */
    private Animation f3900V;

    /* renamed from: W */
    private Animation f3901W;

    /* renamed from: aa */
    private Animation f3902aa;

    /* renamed from: ab */
    private Animation f3903ab;

    /* renamed from: ac */
    private Animation f3904ac;

    /* renamed from: ad */
    private int f3905ad;

    /* renamed from: ae */
    private C1270a f3906ae;

    /* renamed from: af */
    private Animation.AnimationListener f3907af;

    /* renamed from: ag */
    private final Animation f3908ag;

    /* renamed from: ah */
    private final Animation f3909ah;

    /* renamed from: e */
    C1271b f3910e;

    /* renamed from: f */
    boolean f3911f;

    /* renamed from: g */
    int f3912g;

    /* renamed from: h */
    boolean f3913h;

    /* renamed from: i */
    C1289b f3914i;

    /* renamed from: j */
    protected int f3915j;

    /* renamed from: k */
    float f3916k;

    /* renamed from: l */
    protected int f3917l;

    /* renamed from: m */
    int f3918m;

    /* renamed from: n */
    C1347x f3919n;

    /* renamed from: o */
    boolean f3920o;

    /* renamed from: p */
    boolean f3921p;

    /* renamed from: android.support.v4.widget.an$a */
    public interface C1270a {
        /* renamed from: a */
        boolean mo4297a(C1261an anVar, @C0003aa View view);
    }

    /* renamed from: android.support.v4.widget.an$b */
    public interface C1271b {
        /* renamed from: a */
        void mo4298a();
    }

    public C1261an(Context context) {
        this(context, (AttributeSet) null);
    }

    public C1261an(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3911f = false;
        this.f3885F = -1.0f;
        this.f3889J = new int[2];
        this.f3890K = new int[2];
        this.f3896Q = -1;
        this.f3899U = -1;
        this.f3907af = new Animation.AnimationListener() {
            @SuppressLint({"NewApi"})
            public void onAnimationEnd(Animation animation) {
                if (C1261an.this.f3911f) {
                    C1261an.this.f3919n.setAlpha(255);
                    C1261an.this.f3919n.start();
                    if (C1261an.this.f3920o && C1261an.this.f3910e != null) {
                        C1261an.this.f3910e.mo4298a();
                    }
                    C1261an.this.f3912g = C1261an.this.f3914i.getTop();
                    return;
                }
                C1261an.this.mo4254a();
            }

            public void onAnimationRepeat(Animation animation) {
            }

            public void onAnimationStart(Animation animation) {
            }
        };
        this.f3908ag = new Animation() {
            public void applyTransformation(float f, Transformation transformation) {
                C1261an.this.mo4256a((((int) (((float) ((!C1261an.this.f3921p ? C1261an.this.f3918m - Math.abs(C1261an.this.f3917l) : C1261an.this.f3918m) - C1261an.this.f3915j)) * f)) + C1261an.this.f3915j) - C1261an.this.f3914i.getTop(), false);
                C1261an.this.f3919n.mo4516a(1.0f - f);
            }
        };
        this.f3909ah = new Animation() {
            public void applyTransformation(float f, Transformation transformation) {
                C1261an.this.mo4255a(f);
            }
        };
        this.f3884E = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f3892M = getResources().getInteger(17694721);
        setWillNotDraw(false);
        this.f3898S = new DecelerateInterpolator(f3876t);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f3905ad = (int) (40.0f * displayMetrics.density);
        m7470d();
        C1040ar.m5899a((ViewGroup) this, true);
        this.f3918m = (int) (displayMetrics.density * 64.0f);
        this.f3885F = (float) this.f3918m;
        this.f3887H = new C1010ad(this);
        this.f3888I = new C1008ab(this);
        setNestedScrollingEnabled(true);
        int i = -this.f3905ad;
        this.f3912g = i;
        this.f3917l = i;
        mo4255a(1.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f3868T);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    private Animation m7460a(final int i, final int i2) {
        if (this.f3913h && m7472e()) {
            return null;
        }
        C12654 r1 = new Animation() {
            public void applyTransformation(float f, Transformation transformation) {
                C1261an.this.f3919n.setAlpha((int) (((float) i) + (((float) (i2 - i)) * f)));
            }
        };
        r1.setDuration(300);
        this.f3914i.mo4345a((Animation.AnimationListener) null);
        this.f3914i.clearAnimation();
        this.f3914i.startAnimation(r1);
        return r1;
    }

    /* renamed from: a */
    private void m7461a(int i, Animation.AnimationListener animationListener) {
        this.f3915j = i;
        this.f3908ag.reset();
        this.f3908ag.setDuration(200);
        this.f3908ag.setInterpolator(this.f3898S);
        if (animationListener != null) {
            this.f3914i.mo4345a(animationListener);
        }
        this.f3914i.clearAnimation();
        this.f3914i.startAnimation(this.f3908ag);
    }

    /* renamed from: a */
    private void m7462a(MotionEvent motionEvent) {
        int b = C1200x.m7133b(motionEvent);
        if (motionEvent.getPointerId(b) == this.f3896Q) {
            this.f3896Q = motionEvent.getPointerId(b == 0 ? 1 : 0);
        }
    }

    /* renamed from: a */
    private void m7463a(boolean z, boolean z2) {
        if (this.f3911f != z) {
            this.f3920o = z2;
            m7475h();
            this.f3911f = z;
            if (this.f3911f) {
                m7461a(this.f3912g, this.f3907af);
            } else {
                mo4257a(this.f3907af);
            }
        }
    }

    /* renamed from: a */
    private boolean m7464a(Animation animation) {
        return animation != null && animation.hasStarted() && !animation.hasEnded();
    }

    @SuppressLint({"NewApi"})
    /* renamed from: b */
    private void m7465b(float f) {
        this.f3919n.mo4520a(true);
        float min = Math.min(1.0f, Math.abs(f / this.f3885F));
        float max = (((float) Math.max(((double) min) - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float abs = Math.abs(f) - this.f3885F;
        float f2 = this.f3921p ? (float) (this.f3918m - this.f3917l) : (float) this.f3918m;
        float max2 = Math.max(0.0f, Math.min(abs, f2 * f3876t) / f2);
        float pow = ((float) (((double) (max2 / 4.0f)) - Math.pow((double) (max2 / 4.0f), 2.0d))) * f3876t;
        int i = ((int) ((f2 * min) + (f2 * pow * f3876t))) + this.f3917l;
        if (this.f3914i.getVisibility() != 0) {
            this.f3914i.setVisibility(0);
        }
        if (!this.f3913h) {
            C1040ar.m5942i((View) this.f3914i, 1.0f);
            C1040ar.m5945j((View) this.f3914i, 1.0f);
        }
        if (this.f3913h) {
            setAnimationProgress(Math.min(1.0f, f / this.f3885F));
        }
        if (f < this.f3885F) {
            if (this.f3919n.getAlpha() > 76 && !m7464a(this.f3902aa)) {
                m7473f();
            }
        } else if (this.f3919n.getAlpha() < 255 && !m7464a(this.f3903ab)) {
            m7474g();
        }
        this.f3919n.mo4517a(0.0f, Math.min(f3879w, max * f3879w));
        this.f3919n.mo4516a(Math.min(1.0f, max));
        this.f3919n.mo4522b((-0.25f + (max * 0.4f) + (pow * f3876t)) * f3878v);
        mo4256a(i - this.f3912g, true);
    }

    /* renamed from: b */
    private void m7466b(int i, Animation.AnimationListener animationListener) {
        if (this.f3913h) {
            m7469c(i, animationListener);
            return;
        }
        this.f3915j = i;
        this.f3909ah.reset();
        this.f3909ah.setDuration(200);
        this.f3909ah.setInterpolator(this.f3898S);
        if (animationListener != null) {
            this.f3914i.mo4345a(animationListener);
        }
        this.f3914i.clearAnimation();
        this.f3914i.startAnimation(this.f3909ah);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: b */
    private void m7467b(Animation.AnimationListener animationListener) {
        this.f3914i.setVisibility(0);
        if (Build.VERSION.SDK_INT >= 11) {
            this.f3919n.setAlpha(255);
        }
        this.f3900V = new Animation() {
            public void applyTransformation(float f, Transformation transformation) {
                C1261an.this.setAnimationProgress(f);
            }
        };
        this.f3900V.setDuration((long) this.f3892M);
        if (animationListener != null) {
            this.f3914i.mo4345a(animationListener);
        }
        this.f3914i.clearAnimation();
        this.f3914i.startAnimation(this.f3900V);
    }

    /* renamed from: c */
    private void m7468c(float f) {
        if (f > this.f3885F) {
            m7463a(true, true);
            return;
        }
        this.f3911f = false;
        this.f3919n.mo4517a(0.0f, 0.0f);
        C12665 r0 = null;
        if (!this.f3913h) {
            r0 = new Animation.AnimationListener() {
                public void onAnimationEnd(Animation animation) {
                    if (!C1261an.this.f3913h) {
                        C1261an.this.mo4257a((Animation.AnimationListener) null);
                    }
                }

                public void onAnimationRepeat(Animation animation) {
                }

                public void onAnimationStart(Animation animation) {
                }
            };
        }
        m7466b(this.f3912g, r0);
        this.f3919n.mo4520a(false);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: c */
    private void m7469c(int i, Animation.AnimationListener animationListener) {
        this.f3915j = i;
        if (m7472e()) {
            this.f3916k = (float) this.f3919n.getAlpha();
        } else {
            this.f3916k = C1040ar.m5857G(this.f3914i);
        }
        this.f3904ac = new Animation() {
            public void applyTransformation(float f, Transformation transformation) {
                C1261an.this.setAnimationProgress(C1261an.this.f3916k + ((-C1261an.this.f3916k) * f));
                C1261an.this.mo4255a(f);
            }
        };
        this.f3904ac.setDuration(150);
        if (animationListener != null) {
            this.f3914i.mo4345a(animationListener);
        }
        this.f3914i.clearAnimation();
        this.f3914i.startAnimation(this.f3904ac);
    }

    /* renamed from: d */
    private void m7470d() {
        this.f3914i = new C1289b(getContext(), f3866B);
        this.f3919n = new C1347x(getContext(), this);
        this.f3919n.mo4524b((int) f3866B);
        this.f3914i.setImageDrawable(this.f3919n);
        this.f3914i.setVisibility(8);
        addView(this.f3914i);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: d */
    private void m7471d(float f) {
        if (f - this.f3894O > ((float) this.f3884E) && !this.f3895P) {
            this.f3893N = this.f3894O + ((float) this.f3884E);
            this.f3895P = true;
            this.f3919n.setAlpha(76);
        }
    }

    /* renamed from: e */
    private boolean m7472e() {
        return Build.VERSION.SDK_INT < 11;
    }

    @SuppressLint({"NewApi"})
    /* renamed from: f */
    private void m7473f() {
        this.f3902aa = m7460a(this.f3919n.getAlpha(), 76);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: g */
    private void m7474g() {
        this.f3903ab = m7460a(this.f3919n.getAlpha(), 255);
    }

    /* renamed from: h */
    private void m7475h() {
        if (this.f3883D == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.f3914i)) {
                    this.f3883D = childAt;
                    return;
                }
            }
        }
    }

    @SuppressLint({"NewApi"})
    private void setColorViewAlpha(int i) {
        this.f3914i.getBackground().setAlpha(i);
        this.f3919n.setAlpha(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4254a() {
        this.f3914i.clearAnimation();
        this.f3919n.stop();
        this.f3914i.setVisibility(8);
        setColorViewAlpha(255);
        if (this.f3913h) {
            setAnimationProgress(0.0f);
        } else {
            mo4256a(this.f3917l - this.f3912g, true);
        }
        this.f3912g = this.f3914i.getTop();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4255a(float f) {
        mo4256a((this.f3915j + ((int) (((float) (this.f3917l - this.f3915j)) * f))) - this.f3914i.getTop(), false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4256a(int i, boolean z) {
        this.f3914i.bringToFront();
        C1040ar.m5943i((View) this.f3914i, i);
        this.f3912g = this.f3914i.getTop();
        if (z && Build.VERSION.SDK_INT < 11) {
            invalidate();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4257a(Animation.AnimationListener animationListener) {
        this.f3901W = new Animation() {
            public void applyTransformation(float f, Transformation transformation) {
                C1261an.this.setAnimationProgress(1.0f - f);
            }
        };
        this.f3901W.setDuration(150);
        this.f3914i.mo4345a(animationListener);
        this.f3914i.clearAnimation();
        this.f3914i.startAnimation(this.f3901W);
    }

    /* renamed from: a */
    public void mo4258a(boolean z, int i) {
        this.f3918m = i;
        this.f3913h = z;
        this.f3914i.invalidate();
    }

    /* renamed from: a */
    public void mo4259a(boolean z, int i, int i2) {
        this.f3913h = z;
        this.f3917l = i;
        this.f3918m = i2;
        this.f3921p = true;
        mo4254a();
        this.f3911f = false;
    }

    /* renamed from: b */
    public boolean mo4260b() {
        return this.f3911f;
    }

    /* renamed from: c */
    public boolean mo4261c() {
        boolean z = false;
        if (this.f3906ae != null) {
            return this.f3906ae.mo4297a(this, this.f3883D);
        }
        if (Build.VERSION.SDK_INT >= 14) {
            return C1040ar.m5919b(this.f3883D, -1);
        }
        if (this.f3883D instanceof AbsListView) {
            AbsListView absListView = (AbsListView) this.f3883D;
            return absListView.getChildCount() > 0 && (absListView.getFirstVisiblePosition() > 0 || absListView.getChildAt(0).getTop() < absListView.getPaddingTop());
        }
        if (C1040ar.m5919b(this.f3883D, -1) || this.f3883D.getScrollY() > 0) {
            z = true;
        }
        return z;
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f3888I.mo3566a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f3888I.mo3565a(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f3888I.mo3569a(i, i2, iArr, iArr2);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f3888I.mo3568a(i, i2, i3, i4, iArr);
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        return this.f3899U < 0 ? i2 : i2 == i + -1 ? this.f3899U : i2 >= this.f3899U ? i2 + 1 : i2;
    }

    public int getNestedScrollAxes() {
        return this.f3887H.mo3581a();
    }

    public int getProgressCircleDiameter() {
        return this.f3905ad;
    }

    public int getProgressViewEndOffset() {
        return this.f3918m;
    }

    public int getProgressViewStartOffset() {
        return this.f3917l;
    }

    public boolean hasNestedScrollingParent() {
        return this.f3888I.mo3570b();
    }

    public boolean isNestedScrollingEnabled() {
        return this.f3888I.mo3564a();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo4254a();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        m7475h();
        int a = C1200x.m7131a(motionEvent);
        if (this.f3897R && a == 0) {
            this.f3897R = false;
        }
        if (!isEnabled() || this.f3897R || mo4261c() || this.f3911f || this.f3891L) {
            return false;
        }
        switch (a) {
            case 0:
                mo4256a(this.f3917l - this.f3914i.getTop(), true);
                this.f3896Q = motionEvent.getPointerId(0);
                this.f3895P = false;
                int findPointerIndex = motionEvent.findPointerIndex(this.f3896Q);
                if (findPointerIndex >= 0) {
                    this.f3894O = motionEvent.getY(findPointerIndex);
                    break;
                } else {
                    return false;
                }
            case 1:
            case 3:
                this.f3895P = false;
                this.f3896Q = -1;
                break;
            case 2:
                if (this.f3896Q == -1) {
                    Log.e(f3873q, "Got ACTION_MOVE event but don't have an active pointer id.");
                    return false;
                }
                int findPointerIndex2 = motionEvent.findPointerIndex(this.f3896Q);
                if (findPointerIndex2 >= 0) {
                    m7471d(motionEvent.getY(findPointerIndex2));
                    break;
                } else {
                    return false;
                }
            case 6:
                m7462a(motionEvent);
                break;
        }
        return this.f3895P;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() != 0) {
            if (this.f3883D == null) {
                m7475h();
            }
            if (this.f3883D != null) {
                View view = this.f3883D;
                int paddingLeft = getPaddingLeft();
                int paddingTop = getPaddingTop();
                view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
                int measuredWidth2 = this.f3914i.getMeasuredWidth();
                this.f3914i.layout((measuredWidth / 2) - (measuredWidth2 / 2), this.f3912g, (measuredWidth / 2) + (measuredWidth2 / 2), this.f3912g + this.f3914i.getMeasuredHeight());
            }
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f3883D == null) {
            m7475h();
        }
        if (this.f3883D != null) {
            this.f3883D.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
            this.f3914i.measure(View.MeasureSpec.makeMeasureSpec(this.f3905ad, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f3905ad, 1073741824));
            this.f3899U = -1;
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                if (getChildAt(i3) == this.f3914i) {
                    this.f3899U = i3;
                    return;
                }
            }
        }
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        return dispatchNestedFling(f, f2, z);
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0 && this.f3886G > 0.0f) {
            if (((float) i2) > this.f3886G) {
                iArr[1] = i2 - ((int) this.f3886G);
                this.f3886G = 0.0f;
            } else {
                this.f3886G -= (float) i2;
                iArr[1] = i2;
            }
            m7465b(this.f3886G);
        }
        if (this.f3921p && i2 > 0 && this.f3886G == 0.0f && Math.abs(i2 - iArr[1]) > 0) {
            this.f3914i.setVisibility(8);
        }
        int[] iArr2 = this.f3889J;
        if (dispatchNestedPreScroll(i - iArr[0], i2 - iArr[1], iArr2, (int[]) null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr2[1] + iArr[1];
        }
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        dispatchNestedScroll(i, i2, i3, i4, this.f3890K);
        int i5 = this.f3890K[1] + i4;
        if (i5 < 0 && !mo4261c()) {
            this.f3886G = ((float) Math.abs(i5)) + this.f3886G;
            m7465b(this.f3886G);
        }
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f3887H.mo3583a(view, view2, i);
        startNestedScroll(i & 2);
        this.f3886G = 0.0f;
        this.f3891L = true;
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return isEnabled() && !this.f3897R && !this.f3911f && (i & 2) != 0;
    }

    public void onStopNestedScroll(View view) {
        this.f3887H.mo3582a(view);
        this.f3891L = false;
        if (this.f3886G > 0.0f) {
            m7468c(this.f3886G);
            this.f3886G = 0.0f;
        }
        stopNestedScroll();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int a = C1200x.m7131a(motionEvent);
        if (this.f3897R && a == 0) {
            this.f3897R = false;
        }
        if (!isEnabled() || this.f3897R || mo4261c() || this.f3911f || this.f3891L) {
            return false;
        }
        switch (a) {
            case 0:
                this.f3896Q = motionEvent.getPointerId(0);
                this.f3895P = false;
                break;
            case 1:
                int findPointerIndex = motionEvent.findPointerIndex(this.f3896Q);
                if (findPointerIndex < 0) {
                    Log.e(f3873q, "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                if (this.f3895P) {
                    float y = (motionEvent.getY(findPointerIndex) - this.f3893N) * f3878v;
                    this.f3895P = false;
                    m7468c(y);
                }
                this.f3896Q = -1;
                return false;
            case 2:
                int findPointerIndex2 = motionEvent.findPointerIndex(this.f3896Q);
                if (findPointerIndex2 < 0) {
                    Log.e(f3873q, "Got ACTION_MOVE event but have an invalid active pointer id.");
                    return false;
                }
                float y2 = motionEvent.getY(findPointerIndex2);
                m7471d(y2);
                if (this.f3895P) {
                    float f = (y2 - this.f3893N) * f3878v;
                    if (f > 0.0f) {
                        m7465b(f);
                        break;
                    } else {
                        return false;
                    }
                }
                break;
            case 3:
                return false;
            case 5:
                int b = C1200x.m7133b(motionEvent);
                if (b >= 0) {
                    this.f3896Q = motionEvent.getPointerId(b);
                    break;
                } else {
                    Log.e(f3873q, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                    return false;
                }
            case 6:
                m7462a(motionEvent);
                break;
        }
        return true;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (Build.VERSION.SDK_INT < 21 && (this.f3883D instanceof AbsListView)) {
            return;
        }
        if (this.f3883D == null || C1040ar.m5872V(this.f3883D)) {
            super.requestDisallowInterceptTouchEvent(z);
        }
    }

    /* access modifiers changed from: package-private */
    public void setAnimationProgress(float f) {
        if (m7472e()) {
            setColorViewAlpha((int) (255.0f * f));
            return;
        }
        C1040ar.m5942i((View) this.f3914i, f);
        C1040ar.m5945j((View) this.f3914i, f);
    }

    @Deprecated
    public void setColorScheme(@C0032k int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(@C0032k int... iArr) {
        m7475h();
        this.f3919n.mo4521a(iArr);
    }

    public void setColorSchemeResources(@C0033l int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = C0434d.m2381c(context, iArr[i]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i) {
        this.f3885F = (float) i;
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!z) {
            mo4254a();
        }
    }

    public void setNestedScrollingEnabled(boolean z) {
        this.f3888I.mo3563a(z);
    }

    public void setOnChildScrollUpCallback(@C0003aa C1270a aVar) {
        this.f3906ae = aVar;
    }

    public void setOnRefreshListener(C1271b bVar) {
        this.f3910e = bVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    public void setProgressBackgroundColorSchemeColor(@C0032k int i) {
        this.f3914i.setBackgroundColor(i);
        this.f3919n.mo4524b(i);
    }

    public void setProgressBackgroundColorSchemeResource(@C0033l int i) {
        setProgressBackgroundColorSchemeColor(C0434d.m2381c(getContext(), i));
    }

    public void setRefreshing(boolean z) {
        if (!z || this.f3911f == z) {
            m7463a(z, false);
            return;
        }
        this.f3911f = z;
        mo4256a((!this.f3921p ? this.f3918m + this.f3917l : this.f3918m) - this.f3912g, true);
        this.f3920o = false;
        m7467b(this.f3907af);
    }

    public void setSize(int i) {
        if (i == 0 || i == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i == 0) {
                this.f3905ad = (int) (displayMetrics.density * 56.0f);
            } else {
                this.f3905ad = (int) (displayMetrics.density * 40.0f);
            }
            this.f3914i.setImageDrawable((Drawable) null);
            this.f3919n.mo4519a(i);
            this.f3914i.setImageDrawable(this.f3919n);
        }
    }

    public boolean startNestedScroll(int i) {
        return this.f3888I.mo3567a(i);
    }

    public void stopNestedScroll() {
        this.f3888I.mo3571c();
    }
}
