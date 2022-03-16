package android.support.p036v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.C0003aa;
import android.support.annotation.C0011ag;
import android.support.p010v4.view.C1040ar;
import android.support.p010v4.view.C1161h;
import android.support.p036v7.p037a.C1359b;
import android.support.p036v7.widget.C1697an;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

@C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
/* renamed from: android.support.v7.widget.AlertDialogLayout */
public class AlertDialogLayout extends C1697an {
    public AlertDialogLayout(@C0003aa Context context) {
        super(context);
    }

    public AlertDialogLayout(@C0003aa Context context, @C0003aa AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    private void m9374a(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i + i3, i2 + i4);
    }

    /* renamed from: c */
    private static int m9375c(View view) {
        int z = C1040ar.m5968z(view);
        if (z > 0) {
            return z;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return m9375c(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    /* renamed from: c */
    private boolean m9376c(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        View view;
        View view2 = null;
        View view3 = null;
        int childCount = getChildCount();
        int i10 = 0;
        View view4 = null;
        while (i10 < childCount) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 8) {
                childAt = view3;
                view = view2;
            } else {
                int id = childAt.getId();
                if (id == C1359b.C1366g.topPanel) {
                    View view5 = view3;
                    view = childAt;
                    childAt = view5;
                } else if (id == C1359b.C1366g.buttonPanel) {
                    view = view2;
                } else if ((id != C1359b.C1366g.contentPanel && id != C1359b.C1366g.customPanel) || view4 != null) {
                    return false;
                } else {
                    view4 = childAt;
                    childAt = view3;
                    view = view2;
                }
            }
            i10++;
            view2 = view;
            view3 = childAt;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i);
        int i11 = 0;
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (view2 != null) {
            view2.measure(i, 0);
            paddingBottom += view2.getMeasuredHeight();
            i11 = C1040ar.m5877a(0, C1040ar.m5958p(view2));
        }
        int i12 = 0;
        if (view3 != null) {
            view3.measure(i, 0);
            i12 = m9375c(view3);
            paddingBottom += i12;
            i11 = C1040ar.m5877a(i11, C1040ar.m5958p(view3));
            i3 = view3.getMeasuredHeight() - i12;
        } else {
            i3 = 0;
        }
        if (view4 != null) {
            view4.measure(i, mode == 0 ? 0 : View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingBottom), mode));
            int measuredHeight = view4.getMeasuredHeight();
            paddingBottom += measuredHeight;
            i11 = C1040ar.m5877a(i11, C1040ar.m5958p(view4));
            i4 = measuredHeight;
        } else {
            i4 = 0;
        }
        int i13 = size - paddingBottom;
        if (view3 != null) {
            int i14 = paddingBottom - i12;
            int min = Math.min(i13, i3);
            if (min > 0) {
                i13 -= min;
                i12 += min;
            }
            view3.measure(i, View.MeasureSpec.makeMeasureSpec(i12, 1073741824));
            i6 = C1040ar.m5877a(i11, C1040ar.m5958p(view3));
            int i15 = i13;
            i7 = view3.getMeasuredHeight() + i14;
            i5 = i15;
        } else {
            i5 = i13;
            i6 = i11;
            i7 = paddingBottom;
        }
        if (view4 == null || i5 <= 0) {
            i8 = i7;
            i9 = i6;
        } else {
            int i16 = i5 - i5;
            view4.measure(i, View.MeasureSpec.makeMeasureSpec(i5 + i4, mode));
            int measuredHeight2 = (i7 - i4) + view4.getMeasuredHeight();
            i9 = C1040ar.m5877a(i6, C1040ar.m5958p(view4));
            i8 = measuredHeight2;
        }
        int i17 = 0;
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt2 = getChildAt(i18);
            if (childAt2.getVisibility() != 8) {
                i17 = Math.max(i17, childAt2.getMeasuredWidth());
            }
        }
        setMeasuredDimension(C1040ar.m5878a(i17 + getPaddingLeft() + getPaddingRight(), i, i9), C1040ar.m5878a(i8, i2, 0));
        if (mode2 != 1073741824) {
            m9377d(childCount, i2);
        }
        return true;
    }

    /* renamed from: d */
    private void m9377d(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                C1697an.C1699b bVar = (C1697an.C1699b) childAt.getLayoutParams();
                if (bVar.width == -1) {
                    int i4 = bVar.height;
                    bVar.height = childAt.getMeasuredHeight();
                    measureChildWithMargins(childAt, makeMeasureSpec, 0, i2, 0);
                    bVar.height = i4;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingTop;
        int i5;
        int paddingLeft = getPaddingLeft();
        int i6 = i3 - i;
        int paddingRight = i6 - getPaddingRight();
        int paddingRight2 = (i6 - paddingLeft) - getPaddingRight();
        int measuredHeight = getMeasuredHeight();
        int childCount = getChildCount();
        int gravity = getGravity();
        int i7 = gravity & 112;
        int i8 = gravity & C1161h.f3610e;
        switch (i7) {
            case 16:
                paddingTop = (((i4 - i2) - measuredHeight) / 2) + getPaddingTop();
                break;
            case 80:
                paddingTop = ((getPaddingTop() + i4) - i2) - measuredHeight;
                break;
            default:
                paddingTop = getPaddingTop();
                break;
        }
        Drawable dividerDrawable = getDividerDrawable();
        int intrinsicHeight = dividerDrawable == null ? 0 : dividerDrawable.getIntrinsicHeight();
        int i9 = paddingTop;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (!(childAt == null || childAt.getVisibility() == 8)) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                C1697an.C1699b bVar = (C1697an.C1699b) childAt.getLayoutParams();
                int i11 = bVar.f5713h;
                if (i11 < 0) {
                    i11 = i8;
                }
                switch (C1161h.m6976a(i11, C1040ar.m5947k(this)) & 7) {
                    case 1:
                        i5 = ((((paddingRight2 - measuredWidth) / 2) + paddingLeft) + bVar.leftMargin) - bVar.rightMargin;
                        break;
                    case 5:
                        i5 = (paddingRight - measuredWidth) - bVar.rightMargin;
                        break;
                    default:
                        i5 = paddingLeft + bVar.leftMargin;
                        break;
                }
                int i12 = bVar.topMargin + (mo6406c(i10) ? i9 + intrinsicHeight : i9);
                m9374a(childAt, i5, i12, measuredWidth, measuredHeight2);
                i9 = i12 + bVar.bottomMargin + measuredHeight2;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (!m9376c(i, i2)) {
            super.onMeasure(i, i2);
        }
    }
}
