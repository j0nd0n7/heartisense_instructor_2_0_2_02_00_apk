package android.support.p036v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.C0011ag;
import android.support.p010v4.view.C1040ar;
import android.support.p010v4.view.C1112bo;
import android.support.p036v7.p037a.C1359b;
import android.support.p036v7.view.C1522b;
import android.support.p036v7.view.menu.C1550h;
import android.support.p036v7.view.menu.C1567p;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;

@C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
/* renamed from: android.support.v7.widget.ActionBarContextView */
public class ActionBarContextView extends C1641a {

    /* renamed from: g */
    private static final String f5073g = "ActionBarContextView";

    /* renamed from: h */
    private CharSequence f5074h;

    /* renamed from: i */
    private CharSequence f5075i;

    /* renamed from: j */
    private View f5076j;

    /* renamed from: k */
    private View f5077k;

    /* renamed from: l */
    private LinearLayout f5078l;

    /* renamed from: m */
    private TextView f5079m;

    /* renamed from: n */
    private TextView f5080n;

    /* renamed from: o */
    private int f5081o;

    /* renamed from: p */
    private int f5082p;

    /* renamed from: q */
    private boolean f5083q;

    /* renamed from: r */
    private int f5084r;

    public ActionBarContextView(Context context) {
        this(context, (AttributeSet) null);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1359b.C1361b.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C1807bp a = C1807bp.m10923a(context, attributeSet, C1359b.C1371l.ActionMode, i, 0);
        C1040ar.m5889a((View) this, a.mo7293a(C1359b.C1371l.ActionMode_background));
        this.f5081o = a.mo7312g(C1359b.C1371l.ActionMode_titleTextStyle, 0);
        this.f5082p = a.mo7312g(C1359b.C1371l.ActionMode_subtitleTextStyle, 0);
        this.f5472e = a.mo7310f(C1359b.C1371l.ActionMode_height, 0);
        this.f5084r = a.mo7312g(C1359b.C1371l.ActionMode_closeItemLayout, C1359b.C1368i.abc_action_mode_close_item_material);
        a.mo7308e();
    }

    /* renamed from: l */
    private void m9278l() {
        int i = 8;
        boolean z = true;
        if (this.f5078l == null) {
            LayoutInflater.from(getContext()).inflate(C1359b.C1368i.abc_action_bar_title_item, this);
            this.f5078l = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f5079m = (TextView) this.f5078l.findViewById(C1359b.C1366g.action_bar_title);
            this.f5080n = (TextView) this.f5078l.findViewById(C1359b.C1366g.action_bar_subtitle);
            if (this.f5081o != 0) {
                this.f5079m.setTextAppearance(getContext(), this.f5081o);
            }
            if (this.f5082p != 0) {
                this.f5080n.setTextAppearance(getContext(), this.f5082p);
            }
        }
        this.f5079m.setText(this.f5074h);
        this.f5080n.setText(this.f5075i);
        boolean z2 = !TextUtils.isEmpty(this.f5074h);
        if (TextUtils.isEmpty(this.f5075i)) {
            z = false;
        }
        this.f5080n.setVisibility(z ? 0 : 8);
        LinearLayout linearLayout = this.f5078l;
        if (z2 || z) {
            i = 0;
        }
        linearLayout.setVisibility(i);
        if (this.f5078l.getParent() == null) {
            addView(this.f5078l);
        }
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ C1112bo mo5598a(int i, long j) {
        return super.mo5598a(i, j);
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo5599a(int i) {
        super.mo5599a(i);
    }

    /* renamed from: a */
    public void mo5600a(final C1522b bVar) {
        if (this.f5076j == null) {
            this.f5076j = LayoutInflater.from(getContext()).inflate(this.f5084r, this, false);
            addView(this.f5076j);
        } else if (this.f5076j.getParent() == null) {
            addView(this.f5076j);
        }
        this.f5076j.findViewById(C1359b.C1366g.action_mode_close_button).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                bVar.mo4730c();
            }
        });
        C1550h hVar = (C1550h) bVar.mo4726b();
        if (this.f5471d != null) {
            this.f5471d.mo7356h();
        }
        this.f5471d = new C1821d(getContext());
        this.f5471d.mo7351c(true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        hVar.mo5337a((C1567p) this.f5471d, this.f5469b);
        this.f5470c = (ActionMenuView) this.f5471d.mo5256a((ViewGroup) this);
        C1040ar.m5889a((View) this.f5470c, (Drawable) null);
        addView(this.f5470c, layoutParams);
    }

    /* renamed from: a */
    public boolean mo5601a() {
        if (this.f5471d != null) {
            return this.f5471d.mo7354e();
        }
        return false;
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ void mo5602b() {
        super.mo5602b();
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
    public /* bridge */ /* synthetic */ boolean mo5605e() {
        return super.mo5605e();
    }

    /* renamed from: f */
    public /* bridge */ /* synthetic */ boolean mo5606f() {
        return super.mo5606f();
    }

    /* renamed from: g */
    public /* bridge */ /* synthetic */ boolean mo5607g() {
        return super.mo5607g();
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f5075i;
    }

    public CharSequence getTitle() {
        return this.f5074h;
    }

    /* renamed from: h */
    public /* bridge */ /* synthetic */ void mo5614h() {
        super.mo5614h();
    }

    /* renamed from: i */
    public void mo5615i() {
        if (this.f5076j == null) {
            mo5616j();
        }
    }

    /* renamed from: j */
    public void mo5616j() {
        removeAllViews();
        this.f5077k = null;
        this.f5470c = null;
    }

    /* renamed from: k */
    public boolean mo5617k() {
        return this.f5083q;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f5471d != null) {
            this.f5471d.mo7355g();
            this.f5471d.mo7357i();
        }
    }

    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (Build.VERSION.SDK_INT < 14) {
            return;
        }
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.setSource(this);
            accessibilityEvent.setClassName(getClass().getName());
            accessibilityEvent.setPackageName(getContext().getPackageName());
            accessibilityEvent.setContentDescription(this.f5074h);
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        boolean a = C1819bu.m11063a(this);
        int paddingRight = a ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        if (this.f5076j == null || this.f5076j.getVisibility() == 8) {
            i5 = paddingRight;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f5076j.getLayoutParams();
            int i6 = a ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i7 = a ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int a2 = m9838a(paddingRight, i6, a);
            i5 = m9838a(mo6171a(this.f5076j, a2, paddingTop, paddingTop2, a) + a2, i7, a);
        }
        if (!(this.f5078l == null || this.f5077k != null || this.f5078l.getVisibility() == 8)) {
            i5 += mo6171a(this.f5078l, i5, paddingTop, paddingTop2, a);
        }
        if (this.f5077k != null) {
            int a3 = mo6171a(this.f5077k, i5, paddingTop, paddingTop2, a) + i5;
        }
        int paddingLeft = a ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        if (this.f5470c != null) {
            int a4 = mo6171a(this.f5470c, paddingLeft, paddingTop, paddingTop2, !a) + paddingLeft;
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3 = 1073741824;
        int i4 = 0;
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used " + "with android:layout_width=\"match_parent\" (or fill_parent)");
        } else if (View.MeasureSpec.getMode(i2) == 0) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used " + "with android:layout_height=\"wrap_content\"");
        } else {
            int size = View.MeasureSpec.getSize(i);
            int size2 = this.f5472e > 0 ? this.f5472e : View.MeasureSpec.getSize(i2);
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i5 = size2 - paddingTop;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE);
            if (this.f5076j != null) {
                int a = mo6170a(this.f5076j, paddingLeft, makeMeasureSpec, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f5076j.getLayoutParams();
                paddingLeft = a - (marginLayoutParams.rightMargin + marginLayoutParams.leftMargin);
            }
            if (this.f5470c != null && this.f5470c.getParent() == this) {
                paddingLeft = mo6170a(this.f5470c, paddingLeft, makeMeasureSpec, 0);
            }
            if (this.f5078l != null && this.f5077k == null) {
                if (this.f5083q) {
                    this.f5078l.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.f5078l.getMeasuredWidth();
                    boolean z = measuredWidth <= paddingLeft;
                    if (z) {
                        paddingLeft -= measuredWidth;
                    }
                    this.f5078l.setVisibility(z ? 0 : 8);
                } else {
                    paddingLeft = mo6170a(this.f5078l, paddingLeft, makeMeasureSpec, 0);
                }
            }
            if (this.f5077k != null) {
                ViewGroup.LayoutParams layoutParams = this.f5077k.getLayoutParams();
                int i6 = layoutParams.width != -2 ? 1073741824 : Integer.MIN_VALUE;
                if (layoutParams.width >= 0) {
                    paddingLeft = Math.min(layoutParams.width, paddingLeft);
                }
                if (layoutParams.height == -2) {
                    i3 = Integer.MIN_VALUE;
                }
                this.f5077k.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i6), View.MeasureSpec.makeMeasureSpec(layoutParams.height >= 0 ? Math.min(layoutParams.height, i5) : i5, i3));
            }
            if (this.f5472e <= 0) {
                int childCount = getChildCount();
                int i7 = 0;
                while (i4 < childCount) {
                    int measuredHeight = getChildAt(i4).getMeasuredHeight() + paddingTop;
                    if (measuredHeight <= i7) {
                        measuredHeight = i7;
                    }
                    i4++;
                    i7 = measuredHeight;
                }
                setMeasuredDimension(size, i7);
                return;
            }
            setMeasuredDimension(size, size2);
        }
    }

    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public void setContentHeight(int i) {
        this.f5472e = i;
    }

    public void setCustomView(View view) {
        if (this.f5077k != null) {
            removeView(this.f5077k);
        }
        this.f5077k = view;
        if (!(view == null || this.f5078l == null)) {
            removeView(this.f5078l);
            this.f5078l = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f5075i = charSequence;
        m9278l();
    }

    public void setTitle(CharSequence charSequence) {
        this.f5074h = charSequence;
        m9278l();
    }

    public void setTitleOptional(boolean z) {
        if (z != this.f5083q) {
            requestLayout();
        }
        this.f5083q = z;
    }

    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
