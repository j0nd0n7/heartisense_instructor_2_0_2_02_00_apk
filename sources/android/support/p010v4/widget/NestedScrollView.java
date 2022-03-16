package android.support.p010v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.C0011ag;
import android.support.p010v4.p025i.C0755t;
import android.support.p010v4.view.C1007aa;
import android.support.p010v4.view.C1008ab;
import android.support.p010v4.view.C1009ac;
import android.support.p010v4.view.C1010ad;
import android.support.p010v4.view.C1033an;
import android.support.p010v4.view.C1035ap;
import android.support.p010v4.view.C1040ar;
import android.support.p010v4.view.C1066b;
import android.support.p010v4.view.C1200x;
import android.support.p010v4.view.p034a.C0922a;
import android.support.p010v4.view.p034a.C0949h;
import android.support.p010v4.view.p034a.C0992u;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import java.util.ArrayList;

/* renamed from: android.support.v4.widget.NestedScrollView */
public class NestedScrollView extends FrameLayout implements C1007aa, C1009ac, C1033an {

    /* renamed from: A */
    private static final int[] f3705A = {16843130};

    /* renamed from: a */
    static final int f3706a = 250;

    /* renamed from: b */
    static final float f3707b = 0.5f;

    /* renamed from: c */
    private static final String f3708c = "NestedScrollView";

    /* renamed from: x */
    private static final int f3709x = -1;

    /* renamed from: z */
    private static final C1207a f3710z = new C1207a();

    /* renamed from: B */
    private final C1010ad f3711B;

    /* renamed from: C */
    private final C1008ab f3712C;

    /* renamed from: D */
    private float f3713D;

    /* renamed from: E */
    private C1208b f3714E;

    /* renamed from: d */
    private long f3715d;

    /* renamed from: e */
    private final Rect f3716e;

    /* renamed from: f */
    private C1224af f3717f;

    /* renamed from: g */
    private C1323m f3718g;

    /* renamed from: h */
    private C1323m f3719h;

    /* renamed from: i */
    private int f3720i;

    /* renamed from: j */
    private boolean f3721j;

    /* renamed from: k */
    private boolean f3722k;

    /* renamed from: l */
    private View f3723l;

    /* renamed from: m */
    private boolean f3724m;

    /* renamed from: n */
    private VelocityTracker f3725n;

    /* renamed from: o */
    private boolean f3726o;

    /* renamed from: p */
    private boolean f3727p;

    /* renamed from: q */
    private int f3728q;

    /* renamed from: r */
    private int f3729r;

    /* renamed from: s */
    private int f3730s;

    /* renamed from: t */
    private int f3731t;

    /* renamed from: u */
    private final int[] f3732u;

    /* renamed from: v */
    private final int[] f3733v;

    /* renamed from: w */
    private int f3734w;

    /* renamed from: y */
    private C1209c f3735y;

    /* renamed from: android.support.v4.widget.NestedScrollView$a */
    static class C1207a extends C1066b {
        C1207a() {
        }

        /* renamed from: a */
        public void mo3076a(View view, C0949h hVar) {
            int scrollRange;
            super.mo3076a(view, hVar);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            hVar.mo3168b((CharSequence) ScrollView.class.getName());
            if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                hVar.mo3223l(true);
                if (nestedScrollView.getScrollY() > 0) {
                    hVar.mo3183d(8192);
                }
                if (nestedScrollView.getScrollY() < scrollRange) {
                    hVar.mo3183d(4096);
                }
            }
        }

        /* renamed from: a */
        public boolean mo3077a(View view, int i, Bundle bundle) {
            if (super.mo3077a(view, i, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            switch (i) {
                case 4096:
                    int min = Math.min(((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()) + nestedScrollView.getScrollY(), nestedScrollView.getScrollRange());
                    if (min == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.mo4039b(0, min);
                    return true;
                case 8192:
                    int max = Math.max(nestedScrollView.getScrollY() - ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (max == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.mo4039b(0, max);
                    return true;
                default:
                    return false;
            }
        }

        /* renamed from: d */
        public void mo3078d(View view, AccessibilityEvent accessibilityEvent) {
            super.mo3078d(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            C0992u b = C0922a.m4609b(accessibilityEvent);
            b.mo3445e(nestedScrollView.getScrollRange() > 0);
            b.mo3444e(nestedScrollView.getScrollX());
            b.mo3448f(nestedScrollView.getScrollY());
            b.mo3450g(nestedScrollView.getScrollX());
            b.mo3452h(nestedScrollView.getScrollRange());
        }
    }

    /* renamed from: android.support.v4.widget.NestedScrollView$b */
    public interface C1208b {
        /* renamed from: a */
        void mo4074a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4);
    }

    /* renamed from: android.support.v4.widget.NestedScrollView$c */
    static class C1209c extends View.BaseSavedState {
        public static final Parcelable.Creator<C1209c> CREATOR = new Parcelable.Creator<C1209c>() {
            /* renamed from: a */
            public C1209c createFromParcel(Parcel parcel) {
                return new C1209c(parcel);
            }

            /* renamed from: a */
            public C1209c[] newArray(int i) {
                return new C1209c[i];
            }
        };

        /* renamed from: a */
        public int f3736a;

        C1209c(Parcel parcel) {
            super(parcel);
            this.f3736a = parcel.readInt();
        }

        C1209c(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f3736a + "}";
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f3736a);
        }
    }

    public NestedScrollView(Context context) {
        this(context, (AttributeSet) null);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3716e = new Rect();
        this.f3721j = true;
        this.f3722k = false;
        this.f3723l = null;
        this.f3724m = false;
        this.f3727p = true;
        this.f3731t = -1;
        this.f3732u = new int[2];
        this.f3733v = new int[2];
        m7163c();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f3705A, i, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f3711B = new C1010ad(this);
        this.f3712C = new C1008ab(this);
        setNestedScrollingEnabled(true);
        C1040ar.m5893a((View) this, (C1066b) f3710z);
    }

    /* renamed from: a */
    private View m7154a(boolean z, int i, int i2) {
        boolean z2;
        View view;
        ArrayList focusables = getFocusables(2);
        View view2 = null;
        boolean z3 = false;
        int size = focusables.size();
        int i3 = 0;
        while (i3 < size) {
            View view3 = (View) focusables.get(i3);
            int top = view3.getTop();
            int bottom = view3.getBottom();
            if (i < bottom && top < i2) {
                boolean z4 = i < top && bottom < i2;
                if (view2 == null) {
                    boolean z5 = z4;
                    view = view3;
                    z2 = z5;
                } else {
                    boolean z6 = (z && top < view2.getTop()) || (!z && bottom > view2.getBottom());
                    if (z3) {
                        if (z4 && z6) {
                            view = view3;
                            z2 = z3;
                        }
                    } else if (z4) {
                        view = view3;
                        z2 = true;
                    } else if (z6) {
                        view = view3;
                        z2 = z3;
                    }
                }
                i3++;
                view2 = view;
                z3 = z2;
            }
            z2 = z3;
            view = view2;
            i3++;
            view2 = view;
            z3 = z2;
        }
        return view2;
    }

    /* renamed from: a */
    private void m7155a(MotionEvent motionEvent) {
        int action = (motionEvent.getAction() & C1200x.f3685g) >> 8;
        if (motionEvent.getPointerId(action) == this.f3731t) {
            int i = action == 0 ? 1 : 0;
            this.f3720i = (int) motionEvent.getY(i);
            this.f3731t = motionEvent.getPointerId(i);
            if (this.f3725n != null) {
                this.f3725n.clear();
            }
        }
    }

    /* renamed from: a */
    private boolean m7156a(int i, int i2, int i3) {
        boolean z = false;
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = scrollY + height;
        boolean z2 = i == 33;
        View a = m7154a(z2, i2, i3);
        if (a == null) {
            a = this;
        }
        if (i2 < scrollY || i3 > i4) {
            m7167e(z2 ? i2 - scrollY : i3 - i4);
            z = true;
        }
        if (a != findFocus()) {
            a.requestFocus(i);
        }
        return z;
    }

    /* renamed from: a */
    private boolean m7157a(Rect rect, boolean z) {
        int a = mo4029a(rect);
        boolean z2 = a != 0;
        if (z2) {
            if (z) {
                scrollBy(0, a);
            } else {
                mo4030a(0, a);
            }
        }
        return z2;
    }

    /* renamed from: a */
    private boolean m7158a(View view) {
        return !m7159a(view, 0, getHeight());
    }

    /* renamed from: a */
    private boolean m7159a(View view, int i, int i2) {
        view.getDrawingRect(this.f3716e);
        offsetDescendantRectToMyCoords(view, this.f3716e);
        return this.f3716e.bottom + i >= getScrollY() && this.f3716e.top - i <= getScrollY() + i2;
    }

    /* renamed from: a */
    private static boolean m7160a(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        return (parent instanceof ViewGroup) && m7160a((View) parent, view2);
    }

    /* renamed from: b */
    private static int m7161b(int i, int i2, int i3) {
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        return i2 + i > i3 ? i3 - i2 : i;
    }

    /* renamed from: b */
    private void m7162b(View view) {
        view.getDrawingRect(this.f3716e);
        offsetDescendantRectToMyCoords(view, this.f3716e);
        int a = mo4029a(this.f3716e);
        if (a != 0) {
            scrollBy(0, a);
        }
    }

    /* renamed from: c */
    private void m7163c() {
        this.f3717f = C1224af.m7263a(getContext(), (Interpolator) null);
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f3728q = viewConfiguration.getScaledTouchSlop();
        this.f3729r = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f3730s = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    /* renamed from: c */
    private boolean m7164c(int i, int i2) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        return i2 >= childAt.getTop() - scrollY && i2 < childAt.getBottom() - scrollY && i >= childAt.getLeft() && i < childAt.getRight();
    }

    /* renamed from: d */
    private boolean m7165d() {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return false;
        }
        return getHeight() < (childAt.getHeight() + getPaddingTop()) + getPaddingBottom();
    }

    /* renamed from: e */
    private void m7166e() {
        if (this.f3725n == null) {
            this.f3725n = VelocityTracker.obtain();
        } else {
            this.f3725n.clear();
        }
    }

    /* renamed from: e */
    private void m7167e(int i) {
        if (i == 0) {
            return;
        }
        if (this.f3727p) {
            mo4030a(0, i);
        } else {
            scrollBy(0, i);
        }
    }

    /* renamed from: f */
    private void m7168f() {
        if (this.f3725n == null) {
            this.f3725n = VelocityTracker.obtain();
        }
    }

    /* renamed from: f */
    private void m7169f(int i) {
        int scrollY = getScrollY();
        boolean z = (scrollY > 0 || i > 0) && (scrollY < getScrollRange() || i < 0);
        if (!dispatchNestedPreFling(0.0f, (float) i)) {
            dispatchNestedFling(0.0f, (float) i, z);
            if (z) {
                mo4044d(i);
            }
        }
    }

    /* renamed from: g */
    private void m7170g() {
        if (this.f3725n != null) {
            this.f3725n.recycle();
            this.f3725n = null;
        }
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f3713D == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f3713D = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f3713D;
    }

    /* renamed from: h */
    private void m7171h() {
        this.f3724m = false;
        m7170g();
        stopNestedScroll();
        if (this.f3718g != null) {
            this.f3718g.mo4475c();
            this.f3719h.mo4475c();
        }
    }

    /* renamed from: i */
    private void m7172i() {
        if (getOverScrollMode() == 2) {
            this.f3718g = null;
            this.f3719h = null;
        } else if (this.f3718g == null) {
            Context context = getContext();
            this.f3718g = new C1323m(context);
            this.f3719h = new C1323m(context);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo4029a(Rect rect) {
        int i;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i2 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        if (rect.bottom < getChildAt(0).getHeight()) {
            i2 -= verticalFadingEdgeLength;
        }
        if (rect.bottom > i2 && rect.top > scrollY) {
            i = Math.min(rect.height() > height ? (rect.top - scrollY) + 0 : (rect.bottom - i2) + 0, getChildAt(0).getBottom() - i2);
        } else if (rect.top >= scrollY || rect.bottom >= i2) {
            i = 0;
        } else {
            i = Math.max(rect.height() > height ? 0 - (i2 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
        }
        return i;
    }

    /* renamed from: a */
    public final void mo4030a(int i, int i2) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.f3715d > 250) {
                int max = Math.max(0, getChildAt(0).getHeight() - ((getHeight() - getPaddingBottom()) - getPaddingTop()));
                int scrollY = getScrollY();
                this.f3717f.mo4124a(getScrollX(), scrollY, 0, Math.max(0, Math.min(scrollY + i2, max)) - scrollY);
                C1040ar.m5924d(this);
            } else {
                if (!this.f3717f.mo4128a()) {
                    this.f3717f.mo4137h();
                }
                scrollBy(i, i2);
            }
            this.f3715d = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    /* renamed from: a */
    public boolean mo4031a() {
        return this.f3726o;
    }

    /* renamed from: a */
    public boolean mo4032a(int i) {
        boolean z = i == 130;
        int height = getHeight();
        if (z) {
            this.f3716e.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                if (this.f3716e.top + height > childAt.getBottom()) {
                    this.f3716e.top = childAt.getBottom() - height;
                }
            }
        } else {
            this.f3716e.top = getScrollY() - height;
            if (this.f3716e.top < 0) {
                this.f3716e.top = 0;
            }
        }
        this.f3716e.bottom = this.f3716e.top + height;
        return m7156a(i, this.f3716e.top, this.f3716e.bottom);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo4033a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        boolean z2;
        boolean z3;
        int overScrollMode = getOverScrollMode();
        boolean z4 = computeHorizontalScrollRange() > computeHorizontalScrollExtent();
        boolean z5 = computeVerticalScrollRange() > computeVerticalScrollExtent();
        boolean z6 = overScrollMode == 0 || (overScrollMode == 1 && z4);
        boolean z7 = overScrollMode == 0 || (overScrollMode == 1 && z5);
        int i9 = i3 + i;
        if (!z6) {
            i7 = 0;
        }
        int i10 = i4 + i2;
        if (!z7) {
            i8 = 0;
        }
        int i11 = -i7;
        int i12 = i7 + i5;
        int i13 = -i8;
        int i14 = i8 + i6;
        if (i9 > i12) {
            z2 = true;
        } else if (i9 < i11) {
            z2 = true;
            i12 = i11;
        } else {
            z2 = false;
            i12 = i9;
        }
        if (i10 > i14) {
            z3 = true;
        } else if (i10 < i13) {
            z3 = true;
            i14 = i13;
        } else {
            z3 = false;
            i14 = i10;
        }
        if (z3) {
            this.f3717f.mo4129a(i12, i14, 0, 0, 0, getScrollRange());
        }
        onOverScrolled(i12, i14, z2, z3);
        return z2 || z3;
    }

    /* renamed from: a */
    public boolean mo4034a(KeyEvent keyEvent) {
        int i = 33;
        this.f3716e.setEmpty();
        if (!m7165d()) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, C0755t.f2804k);
            return (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(C0755t.f2804k)) ? false : true;
        } else if (keyEvent.getAction() != 0) {
            return false;
        } else {
            switch (keyEvent.getKeyCode()) {
                case 19:
                    return !keyEvent.isAltPressed() ? mo4042c(33) : mo4041b(33);
                case 20:
                    return !keyEvent.isAltPressed() ? mo4042c(C0755t.f2804k) : mo4041b((int) C0755t.f2804k);
                case 62:
                    if (!keyEvent.isShiftPressed()) {
                        i = 130;
                    }
                    mo4032a(i);
                    return false;
                default:
                    return false;
            }
        }
    }

    public void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    public void addView(View view, int i) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i);
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i, layoutParams);
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, layoutParams);
    }

    /* renamed from: b */
    public final void mo4039b(int i, int i2) {
        mo4030a(i - getScrollX(), i2 - getScrollY());
    }

    /* renamed from: b */
    public boolean mo4040b() {
        return this.f3727p;
    }

    /* renamed from: b */
    public boolean mo4041b(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        this.f3716e.top = 0;
        this.f3716e.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            this.f3716e.bottom = getChildAt(childCount - 1).getBottom() + getPaddingBottom();
            this.f3716e.top = this.f3716e.bottom - height;
        }
        return m7156a(i, this.f3716e.top, this.f3716e.bottom);
    }

    /* renamed from: c */
    public boolean mo4042c(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !m7159a(findNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                int bottom = getChildAt(0).getBottom();
                int scrollY = (getScrollY() + getHeight()) - getPaddingBottom();
                if (bottom - scrollY < maxScrollAmount) {
                    maxScrollAmount = bottom - scrollY;
                }
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            m7167e(maxScrollAmount);
        } else {
            findNextFocus.getDrawingRect(this.f3716e);
            offsetDescendantRectToMyCoords(findNextFocus, this.f3716e);
            m7167e(mo4029a(this.f3716e));
            findNextFocus.requestFocus(i);
        }
        if (findFocus != null && findFocus.isFocused() && m7158a(findFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    public void computeScroll() {
        if (this.f3717f.mo4136g()) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int b = this.f3717f.mo4130b();
            int c = this.f3717f.mo4132c();
            if (scrollX != b || scrollY != c) {
                int scrollRange = getScrollRange();
                int overScrollMode = getOverScrollMode();
                boolean z = overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0);
                mo4033a(b - scrollX, c - scrollY, scrollX, scrollY, 0, scrollRange, 0, 0, false);
                if (z) {
                    m7172i();
                    if (c <= 0 && scrollY > 0) {
                        this.f3718g.mo4472a((int) this.f3717f.mo4135f());
                    } else if (c >= scrollRange && scrollY < scrollRange) {
                        this.f3719h.mo4472a((int) this.f3717f.mo4135f());
                    }
                }
            }
        }
    }

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        int bottom = getChildAt(0).getBottom();
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    /* renamed from: d */
    public void mo4044d(int i) {
        if (getChildCount() > 0) {
            int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
            int i2 = height / 2;
            int i3 = i;
            this.f3717f.mo4127a(getScrollX(), getScrollY(), 0, i3, 0, 0, 0, Math.max(0, getChildAt(0).getHeight() - height), 0, i2);
            C1040ar.m5924d(this);
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || mo4034a(keyEvent);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f3712C.mo3566a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f3712C.mo3565a(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f3712C.mo3569a(i, i2, iArr, iArr2);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f3712C.mo3568a(i, i2, i3, i4, iArr);
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f3718g != null) {
            int scrollY = getScrollY();
            if (!this.f3718g.mo4469a()) {
                int save = canvas.save();
                int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
                canvas.translate((float) getPaddingLeft(), (float) Math.min(0, scrollY));
                this.f3718g.mo4468a(width, getHeight());
                if (this.f3718g.mo4473a(canvas)) {
                    C1040ar.m5924d(this);
                }
                canvas.restoreToCount(save);
            }
            if (!this.f3719h.mo4469a()) {
                int save2 = canvas.save();
                int width2 = (getWidth() - getPaddingLeft()) - getPaddingRight();
                int height = getHeight();
                canvas.translate((float) ((-width2) + getPaddingLeft()), (float) (Math.max(getScrollRange(), scrollY) + height));
                canvas.rotate(180.0f, (float) width2, 0.0f);
                this.f3719h.mo4468a(width2, height);
                if (this.f3719h.mo4473a(canvas)) {
                    C1040ar.m5924d(this);
                }
                canvas.restoreToCount(save2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = (getChildAt(0).getBottom() - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return ((float) bottom) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (f3707b * ((float) getHeight()));
    }

    public int getNestedScrollAxes() {
        return this.f3711B.mo3581a();
    }

    /* access modifiers changed from: package-private */
    public int getScrollRange() {
        if (getChildCount() > 0) {
            return Math.max(0, getChildAt(0).getHeight() - ((getHeight() - getPaddingBottom()) - getPaddingTop()));
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return ((float) scrollY) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public boolean hasNestedScrollingParent() {
        return this.f3712C.mo3570b();
    }

    public boolean isNestedScrollingEnabled() {
        return this.f3712C.mo3564a();
    }

    /* access modifiers changed from: protected */
    public void measureChild(View view, int i, int i2) {
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    /* access modifiers changed from: protected */
    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.bottomMargin + marginLayoutParams.topMargin, 0));
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3722k = false;
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) == 0) {
            return false;
        }
        switch (motionEvent.getAction()) {
            case 8:
                if (this.f3724m) {
                    return false;
                }
                float f = C1200x.m7141f(motionEvent, 9);
                if (f == 0.0f) {
                    return false;
                }
                int verticalScrollFactorCompat = (int) (f * getVerticalScrollFactorCompat());
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int i = scrollY - verticalScrollFactorCompat;
                if (i < 0) {
                    scrollRange = 0;
                } else if (i <= scrollRange) {
                    scrollRange = i;
                }
                if (scrollRange == scrollY) {
                    return false;
                }
                super.scrollTo(getScrollX(), scrollRange);
                return true;
            default:
                return false;
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        int action = motionEvent.getAction();
        if (action == 2 && this.f3724m) {
            return true;
        }
        switch (action & 255) {
            case 0:
                int y = (int) motionEvent.getY();
                if (m7164c((int) motionEvent.getX(), y)) {
                    this.f3720i = y;
                    this.f3731t = motionEvent.getPointerId(0);
                    m7166e();
                    this.f3725n.addMovement(motionEvent);
                    this.f3717f.mo4136g();
                    if (!this.f3717f.mo4128a()) {
                        z = true;
                    }
                    this.f3724m = z;
                    startNestedScroll(2);
                    break;
                } else {
                    this.f3724m = false;
                    m7170g();
                    break;
                }
            case 1:
            case 3:
                this.f3724m = false;
                this.f3731t = -1;
                m7170g();
                if (this.f3717f.mo4129a(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    C1040ar.m5924d(this);
                }
                stopNestedScroll();
                break;
            case 2:
                int i = this.f3731t;
                if (i != -1) {
                    int findPointerIndex = motionEvent.findPointerIndex(i);
                    if (findPointerIndex != -1) {
                        int y2 = (int) motionEvent.getY(findPointerIndex);
                        if (Math.abs(y2 - this.f3720i) > this.f3728q && (getNestedScrollAxes() & 2) == 0) {
                            this.f3724m = true;
                            this.f3720i = y2;
                            m7168f();
                            this.f3725n.addMovement(motionEvent);
                            this.f3734w = 0;
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                                break;
                            }
                        }
                    } else {
                        Log.e(f3708c, "Invalid pointerId=" + i + " in onInterceptTouchEvent");
                        break;
                    }
                }
                break;
            case 6:
                m7155a(motionEvent);
                break;
        }
        return this.f3724m;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f3721j = false;
        if (this.f3723l != null && m7160a(this.f3723l, (View) this)) {
            m7162b(this.f3723l);
        }
        this.f3723l = null;
        if (!this.f3722k) {
            if (this.f3735y != null) {
                scrollTo(getScrollX(), this.f3735y.f3736a);
                this.f3735y = null;
            }
            int max = Math.max(0, (getChildCount() > 0 ? getChildAt(0).getMeasuredHeight() : 0) - (((i4 - i2) - getPaddingBottom()) - getPaddingTop()));
            if (getScrollY() > max) {
                scrollTo(getScrollX(), max);
            } else if (getScrollY() < 0) {
                scrollTo(getScrollX(), 0);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f3722k = true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f3726o && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            int measuredHeight = getMeasuredHeight();
            if (childAt.getMeasuredHeight() < measuredHeight) {
                childAt.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), ((FrameLayout.LayoutParams) childAt.getLayoutParams()).width), View.MeasureSpec.makeMeasureSpec((measuredHeight - getPaddingTop()) - getPaddingBottom(), 1073741824));
            }
        }
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        m7169f((int) f2);
        return true;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        dispatchNestedPreScroll(i, i2, iArr, (int[]) null);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int scrollY = getScrollY();
        scrollBy(0, i4);
        int scrollY2 = getScrollY() - scrollY;
        dispatchNestedScroll(0, scrollY2, 0, i4 - scrollY2, (int[]) null);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f3711B.mo3583a(view, view2, i);
        startNestedScroll(2);
    }

    /* access modifiers changed from: protected */
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = C0755t.f2804k;
        } else if (i == 1) {
            i = 33;
        }
        View findNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, (View) null, i) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        if (findNextFocus != null && !m7158a(findNextFocus)) {
            return findNextFocus.requestFocus(i, rect);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C1209c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1209c cVar = (C1209c) parcelable;
        super.onRestoreInstanceState(cVar.getSuperState());
        this.f3735y = cVar;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C1209c cVar = new C1209c(super.onSaveInstanceState());
        cVar.f3736a = getScrollY();
        return cVar;
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (this.f3714E != null) {
            this.f3714E.mo4074a(this, i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && m7159a(findFocus, 0, i4)) {
            findFocus.getDrawingRect(this.f3716e);
            offsetDescendantRectToMyCoords(findFocus, this.f3716e);
            m7167e(mo4029a(this.f3716e));
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return (i & 2) != 0;
    }

    public void onStopNestedScroll(View view) {
        this.f3711B.mo3582a(view);
        stopNestedScroll();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        ViewParent parent;
        m7168f();
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        int a = C1200x.m7131a(motionEvent);
        if (a == 0) {
            this.f3734w = 0;
        }
        obtain.offsetLocation(0.0f, (float) this.f3734w);
        switch (a) {
            case 0:
                if (getChildCount() != 0) {
                    boolean z = !this.f3717f.mo4128a();
                    this.f3724m = z;
                    if (z && (parent = getParent()) != null) {
                        parent.requestDisallowInterceptTouchEvent(true);
                    }
                    if (!this.f3717f.mo4128a()) {
                        this.f3717f.mo4137h();
                    }
                    this.f3720i = (int) motionEvent.getY();
                    this.f3731t = motionEvent.getPointerId(0);
                    startNestedScroll(2);
                    break;
                } else {
                    return false;
                }
            case 1:
                if (this.f3724m) {
                    VelocityTracker velocityTracker = this.f3725n;
                    velocityTracker.computeCurrentVelocity(1000, (float) this.f3730s);
                    int b = (int) C1035ap.m5842b(velocityTracker, this.f3731t);
                    if (Math.abs(b) > this.f3729r) {
                        m7169f(-b);
                    } else if (this.f3717f.mo4129a(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                        C1040ar.m5924d(this);
                    }
                }
                this.f3731t = -1;
                m7171h();
                break;
            case 2:
                int findPointerIndex = motionEvent.findPointerIndex(this.f3731t);
                if (findPointerIndex != -1) {
                    int y = (int) motionEvent.getY(findPointerIndex);
                    int i2 = this.f3720i - y;
                    if (dispatchNestedPreScroll(0, i2, this.f3733v, this.f3732u)) {
                        i2 -= this.f3733v[1];
                        obtain.offsetLocation(0.0f, (float) this.f3732u[1]);
                        this.f3734w += this.f3732u[1];
                    }
                    if (this.f3724m || Math.abs(i2) <= this.f3728q) {
                        i = i2;
                    } else {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f3724m = true;
                        i = i2 > 0 ? i2 - this.f3728q : i2 + this.f3728q;
                    }
                    if (this.f3724m) {
                        this.f3720i = y - this.f3732u[1];
                        int scrollY = getScrollY();
                        int scrollRange = getScrollRange();
                        int overScrollMode = getOverScrollMode();
                        boolean z2 = overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0);
                        if (mo4033a(0, i, 0, getScrollY(), 0, scrollRange, 0, 0, true) && !hasNestedScrollingParent()) {
                            this.f3725n.clear();
                        }
                        int scrollY2 = getScrollY() - scrollY;
                        if (!dispatchNestedScroll(0, scrollY2, 0, i - scrollY2, this.f3732u)) {
                            if (z2) {
                                m7172i();
                                int i3 = scrollY + i;
                                if (i3 < 0) {
                                    this.f3718g.mo4471a(((float) i) / ((float) getHeight()), motionEvent.getX(findPointerIndex) / ((float) getWidth()));
                                    if (!this.f3719h.mo4469a()) {
                                        this.f3719h.mo4475c();
                                    }
                                } else if (i3 > scrollRange) {
                                    this.f3719h.mo4471a(((float) i) / ((float) getHeight()), 1.0f - (motionEvent.getX(findPointerIndex) / ((float) getWidth())));
                                    if (!this.f3718g.mo4469a()) {
                                        this.f3718g.mo4475c();
                                    }
                                }
                                if (this.f3718g != null && (!this.f3718g.mo4469a() || !this.f3719h.mo4469a())) {
                                    C1040ar.m5924d(this);
                                    break;
                                }
                            }
                        } else {
                            this.f3720i -= this.f3732u[1];
                            obtain.offsetLocation(0.0f, (float) this.f3732u[1]);
                            this.f3734w += this.f3732u[1];
                            break;
                        }
                    }
                } else {
                    Log.e(f3708c, "Invalid pointerId=" + this.f3731t + " in onTouchEvent");
                    break;
                }
                break;
            case 3:
                if (this.f3724m && getChildCount() > 0 && this.f3717f.mo4129a(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    C1040ar.m5924d(this);
                }
                this.f3731t = -1;
                m7171h();
                break;
            case 5:
                int b2 = C1200x.m7133b(motionEvent);
                this.f3720i = (int) motionEvent.getY(b2);
                this.f3731t = motionEvent.getPointerId(b2);
                break;
            case 6:
                m7155a(motionEvent);
                this.f3720i = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f3731t));
                break;
        }
        if (this.f3725n != null) {
            this.f3725n.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.f3721j) {
            m7162b(view2);
        } else {
            this.f3723l = view2;
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return m7157a(rect, z);
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            m7170g();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void requestLayout() {
        this.f3721j = true;
        super.requestLayout();
    }

    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            int b = m7161b(i, (getWidth() - getPaddingRight()) - getPaddingLeft(), childAt.getWidth());
            int b2 = m7161b(i2, (getHeight() - getPaddingBottom()) - getPaddingTop(), childAt.getHeight());
            if (b != getScrollX() || b2 != getScrollY()) {
                super.scrollTo(b, b2);
            }
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.f3726o) {
            this.f3726o = z;
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean z) {
        this.f3712C.mo3563a(z);
    }

    public void setOnScrollChangeListener(C1208b bVar) {
        this.f3714E = bVar;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.f3727p = z;
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public boolean startNestedScroll(int i) {
        return this.f3712C.mo3567a(i);
    }

    public void stopNestedScroll() {
        this.f3712C.mo3571c();
    }
}
