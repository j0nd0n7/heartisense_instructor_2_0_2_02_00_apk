package android.support.p036v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.C0011ag;
import android.support.p010v4.view.C1040ar;
import android.support.p036v7.p037a.C1359b;
import android.support.p036v7.widget.ActivityChooserView;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

@C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
/* renamed from: android.support.v7.widget.ActionBarContainer */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: a */
    Drawable f5063a;

    /* renamed from: b */
    Drawable f5064b;

    /* renamed from: c */
    Drawable f5065c;

    /* renamed from: d */
    boolean f5066d;

    /* renamed from: e */
    boolean f5067e;

    /* renamed from: f */
    private boolean f5068f;

    /* renamed from: g */
    private View f5069g;

    /* renamed from: h */
    private View f5070h;

    /* renamed from: i */
    private View f5071i;

    /* renamed from: j */
    private int f5072j;

    public ActionBarContainer(Context context) {
        this(context, (AttributeSet) null);
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C1040ar.m5889a((View) this, Build.VERSION.SDK_INT >= 21 ? new C1820c(this) : new C1775b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1359b.C1371l.ActionBar);
        this.f5063a = obtainStyledAttributes.getDrawable(C1359b.C1371l.ActionBar_background);
        this.f5064b = obtainStyledAttributes.getDrawable(C1359b.C1371l.ActionBar_backgroundStacked);
        this.f5072j = obtainStyledAttributes.getDimensionPixelSize(C1359b.C1371l.ActionBar_height, -1);
        if (getId() == C1359b.C1366g.split_action_bar) {
            this.f5066d = true;
            this.f5065c = obtainStyledAttributes.getDrawable(C1359b.C1371l.ActionBar_backgroundSplit);
        }
        obtainStyledAttributes.recycle();
        setWillNotDraw(this.f5066d ? this.f5065c == null : this.f5063a == null && this.f5064b == null);
    }

    /* renamed from: a */
    private boolean m9276a(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    /* renamed from: b */
    private int m9277b(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return layoutParams.bottomMargin + view.getMeasuredHeight() + layoutParams.topMargin;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f5063a != null && this.f5063a.isStateful()) {
            this.f5063a.setState(getDrawableState());
        }
        if (this.f5064b != null && this.f5064b.isStateful()) {
            this.f5064b.setState(getDrawableState());
        }
        if (this.f5065c != null && this.f5065c.isStateful()) {
            this.f5065c.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return this.f5069g;
    }

    public void jumpDrawablesToCurrentState() {
        if (Build.VERSION.SDK_INT >= 11) {
            super.jumpDrawablesToCurrentState();
            if (this.f5063a != null) {
                this.f5063a.jumpToCurrentState();
            }
            if (this.f5064b != null) {
                this.f5064b.jumpToCurrentState();
            }
            if (this.f5065c != null) {
                this.f5065c.jumpToCurrentState();
            }
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f5070h = findViewById(C1359b.C1366g.action_bar);
        this.f5071i = findViewById(C1359b.C1366g.action_context_bar);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f5068f || super.onInterceptTouchEvent(motionEvent);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        boolean z3 = true;
        super.onLayout(z, i, i2, i3, i4);
        View view = this.f5069g;
        boolean z4 = (view == null || view.getVisibility() == 8) ? false : true;
        if (!(view == null || view.getVisibility() == 8)) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            view.layout(i, (measuredHeight - view.getMeasuredHeight()) - layoutParams.bottomMargin, i3, measuredHeight - layoutParams.bottomMargin);
        }
        if (!this.f5066d) {
            if (this.f5063a != null) {
                if (this.f5070h.getVisibility() == 0) {
                    this.f5063a.setBounds(this.f5070h.getLeft(), this.f5070h.getTop(), this.f5070h.getRight(), this.f5070h.getBottom());
                } else if (this.f5071i == null || this.f5071i.getVisibility() != 0) {
                    this.f5063a.setBounds(0, 0, 0, 0);
                } else {
                    this.f5063a.setBounds(this.f5071i.getLeft(), this.f5071i.getTop(), this.f5071i.getRight(), this.f5071i.getBottom());
                }
                z2 = true;
            } else {
                z2 = false;
            }
            this.f5067e = z4;
            if (!z4 || this.f5064b == null) {
                z3 = z2;
            } else {
                this.f5064b.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
        } else if (this.f5065c != null) {
            this.f5065c.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
        } else {
            z3 = false;
        }
        if (z3) {
            invalidate();
        }
    }

    public void onMeasure(int i, int i2) {
        if (this.f5070h == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && this.f5072j >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(this.f5072j, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.f5070h != null) {
            int mode = View.MeasureSpec.getMode(i2);
            if (this.f5069g != null && this.f5069g.getVisibility() != 8 && mode != 1073741824) {
                setMeasuredDimension(getMeasuredWidth(), Math.min((!m9276a(this.f5070h) ? m9277b(this.f5070h) : !m9276a(this.f5071i) ? m9277b(this.f5071i) : 0) + m9277b(this.f5069g), mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i2) : ActivityChooserView.C1593a.f5166a));
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        boolean z = true;
        if (this.f5063a != null) {
            this.f5063a.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f5063a);
        }
        this.f5063a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f5070h != null) {
                this.f5063a.setBounds(this.f5070h.getLeft(), this.f5070h.getTop(), this.f5070h.getRight(), this.f5070h.getBottom());
            }
        }
        if (this.f5066d) {
            if (this.f5065c != null) {
                z = false;
            }
        } else if (!(this.f5063a == null && this.f5064b == null)) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setSplitBackground(Drawable drawable) {
        boolean z = true;
        if (this.f5065c != null) {
            this.f5065c.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f5065c);
        }
        this.f5065c = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f5066d && this.f5065c != null) {
                this.f5065c.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (this.f5066d) {
            if (this.f5065c != null) {
                z = false;
            }
        } else if (!(this.f5063a == null && this.f5064b == null)) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setStackedBackground(Drawable drawable) {
        boolean z = true;
        if (this.f5064b != null) {
            this.f5064b.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f5064b);
        }
        this.f5064b = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f5067e && this.f5064b != null) {
                this.f5064b.setBounds(this.f5069g.getLeft(), this.f5069g.getTop(), this.f5069g.getRight(), this.f5069g.getBottom());
            }
        }
        if (this.f5066d) {
            if (this.f5065c != null) {
                z = false;
            }
        } else if (!(this.f5063a == null && this.f5064b == null)) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setTabContainer(C1782be beVar) {
        if (this.f5069g != null) {
            removeView(this.f5069g);
        }
        this.f5069g = beVar;
        if (beVar != null) {
            addView(beVar);
            ViewGroup.LayoutParams layoutParams = beVar.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            beVar.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        this.f5068f = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        if (this.f5063a != null) {
            this.f5063a.setVisible(z, false);
        }
        if (this.f5064b != null) {
            this.f5064b.setVisible(z, false);
        }
        if (this.f5065c != null) {
            this.f5065c.setVisible(z, false);
        }
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f5063a && !this.f5066d) || (drawable == this.f5064b && this.f5067e) || ((drawable == this.f5065c && this.f5066d) || super.verifyDrawable(drawable));
    }
}
