package android.support.p036v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.support.annotation.C0011ag;
import android.support.p010v4.view.C1009ac;
import android.support.p010v4.view.C1010ad;
import android.support.p010v4.view.C1040ar;
import android.support.p010v4.view.C1112bo;
import android.support.p010v4.view.C1130bu;
import android.support.p010v4.view.C1131bv;
import android.support.p010v4.widget.C1224af;
import android.support.p036v7.p037a.C1359b;
import android.support.p036v7.view.menu.C1567p;
import android.support.p036v7.widget.ActivityChooserView;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

@C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
/* renamed from: android.support.v7.widget.ActionBarOverlayLayout */
public class ActionBarOverlayLayout extends ViewGroup implements C1009ac, C1668ad {

    /* renamed from: e */
    static final int[] f5087e = {C1359b.C1361b.actionBarSize, 16842841};

    /* renamed from: f */
    private static final String f5088f = "ActionBarOverlayLayout";

    /* renamed from: A */
    private final Runnable f5089A;

    /* renamed from: B */
    private final Runnable f5090B;

    /* renamed from: C */
    private final C1010ad f5091C;

    /* renamed from: a */
    ActionBarContainer f5092a;

    /* renamed from: b */
    boolean f5093b;

    /* renamed from: c */
    C1112bo f5094c;

    /* renamed from: d */
    final C1130bu f5095d;

    /* renamed from: g */
    private int f5096g;

    /* renamed from: h */
    private int f5097h;

    /* renamed from: i */
    private ContentFrameLayout f5098i;

    /* renamed from: j */
    private C1669ae f5099j;

    /* renamed from: k */
    private Drawable f5100k;

    /* renamed from: l */
    private boolean f5101l;

    /* renamed from: m */
    private boolean f5102m;

    /* renamed from: n */
    private boolean f5103n;

    /* renamed from: o */
    private boolean f5104o;

    /* renamed from: p */
    private int f5105p;

    /* renamed from: q */
    private int f5106q;

    /* renamed from: r */
    private final Rect f5107r;

    /* renamed from: s */
    private final Rect f5108s;

    /* renamed from: t */
    private final Rect f5109t;

    /* renamed from: u */
    private final Rect f5110u;

    /* renamed from: v */
    private final Rect f5111v;

    /* renamed from: w */
    private final Rect f5112w;

    /* renamed from: x */
    private C1582a f5113x;

    /* renamed from: y */
    private final int f5114y;

    /* renamed from: z */
    private C1224af f5115z;

    /* renamed from: android.support.v7.widget.ActionBarOverlayLayout$a */
    public interface C1582a {
        /* renamed from: A */
        void mo4705A();

        /* renamed from: B */
        void mo4706B();

        /* renamed from: C */
        void mo4707C();

        /* renamed from: D */
        void mo4708D();

        /* renamed from: k */
        void mo4711k(boolean z);

        /* renamed from: n */
        void mo4714n(int i);
    }

    /* renamed from: android.support.v7.widget.ActionBarOverlayLayout$b */
    public static class C1583b extends ViewGroup.MarginLayoutParams {
        public C1583b(int i, int i2) {
            super(i, i2);
        }

        public C1583b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C1583b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C1583b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5097h = 0;
        this.f5107r = new Rect();
        this.f5108s = new Rect();
        this.f5109t = new Rect();
        this.f5110u = new Rect();
        this.f5111v = new Rect();
        this.f5112w = new Rect();
        this.f5114y = 600;
        this.f5095d = new C1131bv() {
            /* renamed from: b */
            public void mo3894b(View view) {
                ActionBarOverlayLayout.this.f5094c = null;
                ActionBarOverlayLayout.this.f5093b = false;
            }

            /* renamed from: c */
            public void mo3895c(View view) {
                ActionBarOverlayLayout.this.f5094c = null;
                ActionBarOverlayLayout.this.f5093b = false;
            }
        };
        this.f5089A = new Runnable() {
            public void run() {
                ActionBarOverlayLayout.this.mo5643e();
                ActionBarOverlayLayout.this.f5094c = C1040ar.m5851A(ActionBarOverlayLayout.this.f5092a).mo3830d(0.0f).mo3820a(ActionBarOverlayLayout.this.f5095d);
            }
        };
        this.f5090B = new Runnable() {
            public void run() {
                ActionBarOverlayLayout.this.mo5643e();
                ActionBarOverlayLayout.this.f5094c = C1040ar.m5851A(ActionBarOverlayLayout.this.f5092a).mo3830d((float) (-ActionBarOverlayLayout.this.f5092a.getHeight())).mo3820a(ActionBarOverlayLayout.this.f5095d);
            }
        };
        m9294a(context);
        this.f5091C = new C1010ad(this);
    }

    /* renamed from: a */
    private C1669ae m9293a(View view) {
        if (view instanceof C1669ae) {
            return (C1669ae) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    /* renamed from: a */
    private void m9294a(Context context) {
        boolean z = true;
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f5087e);
        this.f5096g = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f5100k = obtainStyledAttributes.getDrawable(1);
        setWillNotDraw(this.f5100k == null);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion >= 19) {
            z = false;
        }
        this.f5101l = z;
        this.f5115z = C1224af.m7262a(context);
    }

    /* renamed from: a */
    private boolean m9295a(float f, float f2) {
        this.f5115z.mo4126a(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, ActivityChooserView.C1593a.f5166a);
        return this.f5115z.mo4134e() > this.f5092a.getHeight();
    }

    /* renamed from: a */
    private boolean m9296a(View view, Rect rect, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5 = false;
        C1583b bVar = (C1583b) view.getLayoutParams();
        if (z && bVar.leftMargin != rect.left) {
            bVar.leftMargin = rect.left;
            z5 = true;
        }
        if (z2 && bVar.topMargin != rect.top) {
            bVar.topMargin = rect.top;
            z5 = true;
        }
        if (z4 && bVar.rightMargin != rect.right) {
            bVar.rightMargin = rect.right;
            z5 = true;
        }
        if (!z3 || bVar.bottomMargin == rect.bottom) {
            return z5;
        }
        bVar.bottomMargin = rect.bottom;
        return true;
    }

    /* renamed from: o */
    private void m9297o() {
        mo5643e();
        postDelayed(this.f5089A, 600);
    }

    /* renamed from: p */
    private void m9298p() {
        mo5643e();
        postDelayed(this.f5090B, 600);
    }

    /* renamed from: q */
    private void m9299q() {
        mo5643e();
        this.f5089A.run();
    }

    /* renamed from: r */
    private void m9300r() {
        mo5643e();
        this.f5090B.run();
    }

    /* renamed from: a */
    public C1583b generateLayoutParams(AttributeSet attributeSet) {
        return new C1583b(getContext(), attributeSet);
    }

    /* renamed from: a */
    public void mo5633a(int i) {
        mo5639c();
        switch (i) {
            case 2:
                this.f5099j.mo6319g();
                return;
            case 5:
                this.f5099j.mo6321h();
                return;
            case 109:
                setOverlayMode(true);
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public void mo5634a(SparseArray<Parcelable> sparseArray) {
        mo5639c();
        this.f5099j.mo6293a(sparseArray);
    }

    /* renamed from: a */
    public void mo5635a(Menu menu, C1567p.C1568a aVar) {
        mo5639c();
        this.f5099j.mo6294a(menu, aVar);
    }

    /* renamed from: a */
    public boolean mo5636a() {
        return this.f5102m;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C1583b generateDefaultLayoutParams() {
        return new C1583b(-1, -1);
    }

    /* renamed from: b */
    public void mo5638b(SparseArray<Parcelable> sparseArray) {
        mo5639c();
        this.f5099j.mo6303b(sparseArray);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo5639c() {
        if (this.f5098i == null) {
            this.f5098i = (ContentFrameLayout) findViewById(C1359b.C1366g.action_bar_activity_content);
            this.f5092a = (ActionBarContainer) findViewById(C1359b.C1366g.action_bar_container);
            this.f5099j = m9293a(findViewById(C1359b.C1366g.action_bar));
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1583b;
    }

    /* renamed from: d */
    public boolean mo5641d() {
        return this.f5104o;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f5100k != null && !this.f5101l) {
            int bottom = this.f5092a.getVisibility() == 0 ? (int) (((float) this.f5092a.getBottom()) + C1040ar.m5965w(this.f5092a) + 0.5f) : 0;
            this.f5100k.setBounds(0, bottom, getWidth(), this.f5100k.getIntrinsicHeight() + bottom);
            this.f5100k.draw(canvas);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo5643e() {
        removeCallbacks(this.f5089A);
        removeCallbacks(this.f5090B);
        if (this.f5094c != null) {
            this.f5094c.mo3831d();
        }
    }

    /* renamed from: f */
    public boolean mo5644f() {
        mo5639c();
        return this.f5099j.mo6324i();
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        mo5639c();
        if ((C1040ar.m5864N(this) & 256) != 0) {
        }
        boolean a = m9296a(this.f5092a, rect, true, true, false, true);
        this.f5110u.set(rect);
        C1819bu.m11062a(this, this.f5110u, this.f5107r);
        if (!this.f5108s.equals(this.f5107r)) {
            this.f5108s.set(this.f5107r);
            a = true;
        }
        if (a) {
            requestLayout();
        }
        return true;
    }

    /* renamed from: g */
    public boolean mo5646g() {
        mo5639c();
        return this.f5099j.mo6326j();
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C1583b(layoutParams);
    }

    public int getActionBarHideOffset() {
        if (this.f5092a != null) {
            return -((int) C1040ar.m5965w(this.f5092a));
        }
        return 0;
    }

    public int getNestedScrollAxes() {
        return this.f5091C.mo3581a();
    }

    public CharSequence getTitle() {
        mo5639c();
        return this.f5099j.mo6314e();
    }

    /* renamed from: h */
    public boolean mo5652h() {
        mo5639c();
        return this.f5099j.mo6327k();
    }

    /* renamed from: i */
    public boolean mo5653i() {
        mo5639c();
        return this.f5099j.mo6328l();
    }

    /* renamed from: j */
    public boolean mo5654j() {
        mo5639c();
        return this.f5099j.mo6329m();
    }

    /* renamed from: k */
    public boolean mo5655k() {
        mo5639c();
        return this.f5099j.mo6330n();
    }

    /* renamed from: l */
    public boolean mo5656l() {
        mo5639c();
        return this.f5099j.mo6331o();
    }

    /* renamed from: m */
    public void mo5657m() {
        mo5639c();
        this.f5099j.mo6332p();
    }

    /* renamed from: n */
    public void mo5658n() {
        mo5639c();
        this.f5099j.mo6333q();
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m9294a(getContext());
        C1040ar.m5865O(this);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo5643e();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingRight = (i3 - i) - getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = (i4 - i2) - getPaddingBottom();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                C1583b bVar = (C1583b) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = bVar.leftMargin + paddingLeft;
                int i7 = bVar.topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int measuredHeight;
        mo5639c();
        measureChildWithMargins(this.f5092a, i, 0, i2, 0);
        C1583b bVar = (C1583b) this.f5092a.getLayoutParams();
        int max = Math.max(0, this.f5092a.getMeasuredWidth() + bVar.leftMargin + bVar.rightMargin);
        int max2 = Math.max(0, bVar.bottomMargin + this.f5092a.getMeasuredHeight() + bVar.topMargin);
        int a = C1819bu.m11061a(0, C1040ar.m5958p(this.f5092a));
        boolean z = (C1040ar.m5864N(this) & 256) != 0;
        if (z) {
            measuredHeight = this.f5096g;
            if (this.f5103n && this.f5092a.getTabContainer() != null) {
                measuredHeight += this.f5096g;
            }
        } else {
            measuredHeight = this.f5092a.getVisibility() != 8 ? this.f5092a.getMeasuredHeight() : 0;
        }
        this.f5109t.set(this.f5107r);
        this.f5111v.set(this.f5110u);
        if (this.f5102m || z) {
            Rect rect = this.f5111v;
            rect.top = measuredHeight + rect.top;
            this.f5111v.bottom += 0;
        } else {
            Rect rect2 = this.f5109t;
            rect2.top = measuredHeight + rect2.top;
            this.f5109t.bottom += 0;
        }
        m9296a(this.f5098i, this.f5109t, true, true, true, true);
        if (!this.f5112w.equals(this.f5111v)) {
            this.f5112w.set(this.f5111v);
            this.f5098i.mo5761a(this.f5111v);
        }
        measureChildWithMargins(this.f5098i, i, 0, i2, 0);
        C1583b bVar2 = (C1583b) this.f5098i.getLayoutParams();
        int max3 = Math.max(max, this.f5098i.getMeasuredWidth() + bVar2.leftMargin + bVar2.rightMargin);
        int max4 = Math.max(max2, bVar2.bottomMargin + this.f5098i.getMeasuredHeight() + bVar2.topMargin);
        int a2 = C1819bu.m11061a(a, C1040ar.m5958p(this.f5098i));
        setMeasuredDimension(C1040ar.m5878a(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, a2), C1040ar.m5878a(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, a2 << 16));
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.f5104o || !z) {
            return false;
        }
        if (m9295a(f, f2)) {
            m9300r();
        } else {
            m9299q();
        }
        this.f5093b = true;
        return true;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        this.f5105p += i2;
        setActionBarHideOffset(this.f5105p);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f5091C.mo3583a(view, view2, i);
        this.f5105p = getActionBarHideOffset();
        mo5643e();
        if (this.f5113x != null) {
            this.f5113x.mo4707C();
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f5092a.getVisibility() != 0) {
            return false;
        }
        return this.f5104o;
    }

    public void onStopNestedScroll(View view) {
        if (this.f5104o && !this.f5093b) {
            if (this.f5105p <= this.f5092a.getHeight()) {
                m9297o();
            } else {
                m9298p();
            }
        }
        if (this.f5113x != null) {
            this.f5113x.mo4708D();
        }
    }

    public void onWindowSystemUiVisibilityChanged(int i) {
        boolean z = true;
        if (Build.VERSION.SDK_INT >= 16) {
            super.onWindowSystemUiVisibilityChanged(i);
        }
        mo5639c();
        int i2 = this.f5106q ^ i;
        this.f5106q = i;
        boolean z2 = (i & 4) == 0;
        boolean z3 = (i & 256) != 0;
        if (this.f5113x != null) {
            C1582a aVar = this.f5113x;
            if (z3) {
                z = false;
            }
            aVar.mo4711k(z);
            if (z2 || !z3) {
                this.f5113x.mo4705A();
            } else {
                this.f5113x.mo4706B();
            }
        }
        if ((i2 & 256) != 0 && this.f5113x != null) {
            C1040ar.m5865O(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f5097h = i;
        if (this.f5113x != null) {
            this.f5113x.mo4714n(i);
        }
    }

    public void setActionBarHideOffset(int i) {
        mo5643e();
        C1040ar.m5914b((View) this.f5092a, (float) (-Math.max(0, Math.min(i, this.f5092a.getHeight()))));
    }

    public void setActionBarVisibilityCallback(C1582a aVar) {
        this.f5113x = aVar;
        if (getWindowToken() != null) {
            this.f5113x.mo4714n(this.f5097h);
            if (this.f5106q != 0) {
                onWindowSystemUiVisibilityChanged(this.f5106q);
                C1040ar.m5865O(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f5103n = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f5104o) {
            this.f5104o = z;
            if (!z) {
                mo5643e();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i) {
        mo5639c();
        this.f5099j.mo6289a(i);
    }

    public void setIcon(Drawable drawable) {
        mo5639c();
        this.f5099j.mo6290a(drawable);
    }

    public void setLogo(int i) {
        mo5639c();
        this.f5099j.mo6301b(i);
    }

    public void setOverlayMode(boolean z) {
        this.f5102m = z;
        this.f5101l = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    public void setWindowCallback(Window.Callback callback) {
        mo5639c();
        this.f5099j.mo6296a(callback);
    }

    public void setWindowTitle(CharSequence charSequence) {
        mo5639c();
        this.f5099j.mo6298a(charSequence);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
