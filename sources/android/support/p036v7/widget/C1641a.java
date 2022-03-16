package android.support.p036v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.support.p010v4.view.C1040ar;
import android.support.p010v4.view.C1112bo;
import android.support.p010v4.view.C1130bu;
import android.support.p010v4.view.C1200x;
import android.support.p036v7.p037a.C1359b;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: android.support.v7.widget.a */
abstract class C1641a extends ViewGroup {

    /* renamed from: g */
    private static final int f5467g = 200;

    /* renamed from: a */
    protected final C1643a f5468a;

    /* renamed from: b */
    protected final Context f5469b;

    /* renamed from: c */
    protected ActionMenuView f5470c;

    /* renamed from: d */
    protected C1821d f5471d;

    /* renamed from: e */
    protected int f5472e;

    /* renamed from: f */
    protected C1112bo f5473f;

    /* renamed from: h */
    private boolean f5474h;

    /* renamed from: i */
    private boolean f5475i;

    /* renamed from: android.support.v7.widget.a$a */
    protected class C1643a implements C1130bu {

        /* renamed from: a */
        int f5477a;

        /* renamed from: c */
        private boolean f5479c = false;

        protected C1643a() {
        }

        /* renamed from: a */
        public C1643a mo6174a(C1112bo boVar, int i) {
            C1641a.this.f5473f = boVar;
            this.f5477a = i;
            return this;
        }

        /* renamed from: a */
        public void mo3893a(View view) {
            C1641a.super.setVisibility(0);
            this.f5479c = false;
        }

        /* renamed from: b */
        public void mo3894b(View view) {
            if (!this.f5479c) {
                C1641a.this.f5473f = null;
                C1641a.super.setVisibility(this.f5477a);
            }
        }

        /* renamed from: c */
        public void mo3895c(View view) {
            this.f5479c = true;
        }
    }

    C1641a(Context context) {
        this(context, (AttributeSet) null);
    }

    C1641a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    C1641a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5468a = new C1643a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(C1359b.C1361b.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f5469b = context;
        } else {
            this.f5469b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    /* renamed from: a */
    protected static int m9838a(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo6170a(View view, int i, int i2, int i3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - i3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo6171a(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = ((i3 - measuredHeight) / 2) + i2;
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    /* renamed from: a */
    public C1112bo mo5598a(int i, long j) {
        if (this.f5473f != null) {
            this.f5473f.mo3831d();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                C1040ar.m5920c((View) this, 0.0f);
            }
            C1112bo a = C1040ar.m5851A(this).mo3818a(1.0f);
            a.mo3819a(j);
            a.mo3820a((C1130bu) this.f5468a.mo6174a(a, i));
            return a;
        }
        C1112bo a2 = C1040ar.m5851A(this).mo3818a(0.0f);
        a2.mo3819a(j);
        a2.mo3820a((C1130bu) this.f5468a.mo6174a(a2, i));
        return a2;
    }

    /* renamed from: a */
    public void mo5599a(int i) {
        mo5598a(i, 200).mo3833e();
    }

    /* renamed from: a */
    public boolean mo5601a() {
        if (this.f5471d != null) {
            return this.f5471d.mo7354e();
        }
        return false;
    }

    /* renamed from: b */
    public void mo5602b() {
        post(new Runnable() {
            public void run() {
                C1641a.this.mo5601a();
            }
        });
    }

    /* renamed from: c */
    public boolean mo5603c() {
        if (this.f5471d != null) {
            return this.f5471d.mo7355g();
        }
        return false;
    }

    /* renamed from: d */
    public boolean mo5604d() {
        if (this.f5471d != null) {
            return this.f5471d.mo7358j();
        }
        return false;
    }

    /* renamed from: e */
    public boolean mo5605e() {
        if (this.f5471d != null) {
            return this.f5471d.mo7359k();
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo5606f() {
        return this.f5471d != null && this.f5471d.mo7360l();
    }

    /* renamed from: g */
    public boolean mo5607g() {
        return mo5606f() && getVisibility() == 0;
    }

    public int getAnimatedVisibility() {
        return this.f5473f != null ? this.f5468a.f5477a : getVisibility();
    }

    public int getContentHeight() {
        return this.f5472e;
    }

    /* renamed from: h */
    public void mo5614h() {
        if (this.f5471d != null) {
            this.f5471d.mo7356h();
        }
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes((AttributeSet) null, C1359b.C1371l.ActionBar, C1359b.C1361b.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(C1359b.C1371l.ActionBar_height, 0));
        obtainStyledAttributes.recycle();
        if (this.f5471d != null) {
            this.f5471d.mo7347a(configuration);
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int a = C1200x.m7131a(motionEvent);
        if (a == 9) {
            this.f5475i = false;
        }
        if (!this.f5475i) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (a == 9 && !onHoverEvent) {
                this.f5475i = true;
            }
        }
        if (a == 10 || a == 3) {
            this.f5475i = false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int a = C1200x.m7131a(motionEvent);
        if (a == 0) {
            this.f5474h = false;
        }
        if (!this.f5474h) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (a == 0 && !onTouchEvent) {
                this.f5474h = true;
            }
        }
        if (a == 1 || a == 3) {
            this.f5474h = false;
        }
        return true;
    }

    public void setContentHeight(int i) {
        this.f5472e = i;
        requestLayout();
    }

    public void setVisibility(int i) {
        if (i != getVisibility()) {
            if (this.f5473f != null) {
                this.f5473f.mo3831d();
            }
            super.setVisibility(i);
        }
    }
}
