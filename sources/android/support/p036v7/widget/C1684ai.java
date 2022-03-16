package android.support.p036v7.widget;

import android.content.Context;
import android.os.Build;
import android.support.p010v4.view.C1112bo;
import android.support.p010v4.view.C1200x;
import android.support.p010v4.widget.C1343t;
import android.support.p036v7.p037a.C1359b;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: android.support.v7.widget.ai */
class C1684ai extends C1712ar {

    /* renamed from: i */
    private boolean f5637i;

    /* renamed from: j */
    private boolean f5638j;

    /* renamed from: k */
    private boolean f5639k;

    /* renamed from: l */
    private C1112bo f5640l;

    /* renamed from: m */
    private C1343t f5641m;

    public C1684ai(Context context, boolean z) {
        super(context, (AttributeSet) null, C1359b.C1361b.dropDownListViewStyle);
        this.f5638j = z;
        setCacheColorHint(0);
    }

    /* renamed from: a */
    private void m10104a(View view, int i) {
        performItemClick(view, i, getItemIdAtPosition(i));
    }

    /* renamed from: a */
    private void m10105a(View view, int i, float f, float f2) {
        View childAt;
        this.f5639k = true;
        if (Build.VERSION.SDK_INT >= 21) {
            drawableHotspotChanged(f, f2);
        }
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        if (!(this.f5791h == -1 || (childAt = getChildAt(this.f5791h - getFirstVisiblePosition())) == null || childAt == view || !childAt.isPressed())) {
            childAt.setPressed(false);
        }
        this.f5791h = i;
        float left = f - ((float) view.getLeft());
        float top = f2 - ((float) view.getTop());
        if (Build.VERSION.SDK_INT >= 21) {
            view.drawableHotspotChanged(left, top);
        }
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        mo6516a(i, view, f, f2);
        setSelectorEnabled(false);
        refreshDrawableState();
    }

    /* renamed from: d */
    private void mo6531d() {
        this.f5639k = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f5791h - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        if (this.f5640l != null) {
            this.f5640l.mo3831d();
            this.f5640l = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo6363a() {
        return this.f5639k || super.mo6363a();
    }

    /* renamed from: a */
    public boolean mo6364a(MotionEvent motionEvent, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        int a = C1200x.m7131a(motionEvent);
        switch (a) {
            case 1:
                z = false;
                break;
            case 2:
                z = true;
                break;
            case 3:
                z3 = false;
                z2 = false;
                break;
            default:
                z3 = false;
                z2 = true;
                break;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i);
        if (findPointerIndex < 0) {
            z3 = false;
            z2 = false;
        } else {
            int x = (int) motionEvent.getX(findPointerIndex);
            int y = (int) motionEvent.getY(findPointerIndex);
            int pointToPosition = pointToPosition(x, y);
            if (pointToPosition == -1) {
                z2 = z;
                z3 = true;
            } else {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                m10105a(childAt, pointToPosition, (float) x, (float) y);
                if (a == 1) {
                    m10104a(childAt, pointToPosition);
                }
                z3 = false;
                z2 = true;
            }
        }
        if (!z2 || z3) {
            mo6531d();
        }
        if (z2) {
            if (this.f5641m == null) {
                this.f5641m = new C1343t(this);
            }
            this.f5641m.mo4085a(true);
            this.f5641m.onTouch(this, motionEvent);
        } else if (this.f5641m != null) {
            this.f5641m.mo4085a(false);
        }
        return z2;
    }

    public boolean hasFocus() {
        return this.f5638j || super.hasFocus();
    }

    public boolean hasWindowFocus() {
        return this.f5638j || super.hasWindowFocus();
    }

    public boolean isFocused() {
        return this.f5638j || super.isFocused();
    }

    public boolean isInTouchMode() {
        return (this.f5638j && this.f5637i) || super.isInTouchMode();
    }

    /* access modifiers changed from: package-private */
    public void setListSelectionHidden(boolean z) {
        this.f5637i = z;
    }
}
