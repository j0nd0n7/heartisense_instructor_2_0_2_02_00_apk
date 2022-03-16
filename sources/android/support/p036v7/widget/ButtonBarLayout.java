package android.support.p036v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.support.annotation.C0011ag;
import android.support.p010v4.p014d.p016b.C0420a;
import android.support.p010v4.view.C1040ar;
import android.support.p036v7.p037a.C1359b;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

@C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
/* renamed from: android.support.v7.widget.ButtonBarLayout */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: a */
    private static final int f5178a = 320;

    /* renamed from: b */
    private static final int f5179b = 16;

    /* renamed from: c */
    private boolean f5180c;

    /* renamed from: d */
    private int f5181d = -1;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        boolean z = C0420a.m2327a(getResources()) >= f5178a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1359b.C1371l.ButtonBarLayout);
        this.f5180c = obtainStyledAttributes.getBoolean(C1359b.C1371l.ButtonBarLayout_allowStacking, z);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private int m9378a(int i) {
        int childCount = getChildCount();
        for (int i2 = i; i2 < childCount; i2++) {
            if (getChildAt(i2).getVisibility() == 0) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: a */
    private boolean m9379a() {
        return getOrientation() == 1;
    }

    private void setStacked(boolean z) {
        setOrientation(z ? 1 : 0);
        setGravity(z ? 5 : 80);
        View findViewById = findViewById(C1359b.C1366g.spacer);
        if (findViewById != null) {
            findViewById.setVisibility(z ? 8 : 4);
        }
        for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
            bringChildToFront(getChildAt(childCount));
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        boolean z;
        int i4;
        boolean z2;
        int size = View.MeasureSpec.getSize(i);
        if (this.f5180c) {
            if (size > this.f5181d && m9379a()) {
                setStacked(false);
            }
            this.f5181d = size;
        }
        if (m9379a() || View.MeasureSpec.getMode(i) != 1073741824) {
            i3 = i;
            z = false;
        } else {
            i3 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z = true;
        }
        super.onMeasure(i3, i2);
        if (this.f5180c && !m9379a()) {
            if (Build.VERSION.SDK_INT >= 11) {
                z2 = (C1040ar.m5954n(this) & C1040ar.f3485s) == 16777216;
            } else {
                int childCount = getChildCount();
                int i5 = 0;
                for (int i6 = 0; i6 < childCount; i6++) {
                    i5 += getChildAt(i6).getMeasuredWidth();
                }
                z2 = (getPaddingLeft() + i5) + getPaddingRight() > size;
            }
            if (z2) {
                setStacked(true);
                z = true;
            }
        }
        if (z) {
            super.onMeasure(i, i2);
        }
        int a = m9378a(0);
        if (a >= 0) {
            View childAt = getChildAt(a);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            i4 = layoutParams.bottomMargin + childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + 0;
            if (m9379a()) {
                int a2 = m9378a(a + 1);
                if (a2 >= 0) {
                    i4 = (int) (((float) i4) + ((float) getChildAt(a2).getPaddingTop()) + (16.0f * getResources().getDisplayMetrics().density));
                }
            } else {
                i4 += getPaddingBottom();
            }
        } else {
            i4 = 0;
        }
        if (C1040ar.m5968z(this) != i4) {
            setMinimumHeight(i4);
        }
    }

    public void setAllowStacking(boolean z) {
        if (this.f5180c != z) {
            this.f5180c = z;
            if (!this.f5180c && getOrientation() == 1) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
