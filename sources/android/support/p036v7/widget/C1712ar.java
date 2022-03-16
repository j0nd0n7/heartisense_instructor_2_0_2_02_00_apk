package android.support.p036v7.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.annotation.C0011ag;
import android.support.p010v4.p018f.p019a.C0484a;
import android.support.p036v7.p040c.p041a.C1480a;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;

@C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
/* renamed from: android.support.v7.widget.ar */
public class C1712ar extends ListView {

    /* renamed from: a */
    public static final int f5783a = -1;

    /* renamed from: b */
    public static final int f5784b = -1;

    /* renamed from: i */
    private static final int[] f5785i = {0};

    /* renamed from: c */
    final Rect f5786c;

    /* renamed from: d */
    int f5787d;

    /* renamed from: e */
    int f5788e;

    /* renamed from: f */
    int f5789f;

    /* renamed from: g */
    int f5790g;

    /* renamed from: h */
    protected int f5791h;

    /* renamed from: j */
    private Field f5792j;

    /* renamed from: k */
    private C1713a f5793k;

    /* renamed from: android.support.v7.widget.ar$a */
    private static class C1713a extends C1480a {

        /* renamed from: a */
        private boolean f5794a = true;

        public C1713a(Drawable drawable) {
            super(drawable);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo6526a(boolean z) {
            this.f5794a = z;
        }

        public void draw(Canvas canvas) {
            if (this.f5794a) {
                super.draw(canvas);
            }
        }

        public void setHotspot(float f, float f2) {
            if (this.f5794a) {
                super.setHotspot(f, f2);
            }
        }

        public void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.f5794a) {
                super.setHotspotBounds(i, i2, i3, i4);
            }
        }

        public boolean setState(int[] iArr) {
            if (this.f5794a) {
                return super.setState(iArr);
            }
            return false;
        }

        public boolean setVisible(boolean z, boolean z2) {
            if (this.f5794a) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    public C1712ar(Context context) {
        this(context, (AttributeSet) null);
    }

    public C1712ar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C1712ar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5786c = new Rect();
        this.f5787d = 0;
        this.f5788e = 0;
        this.f5789f = 0;
        this.f5790g = 0;
        try {
            this.f5792j = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f5792j.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public int mo6513a(int i, int i2, int i3, int i4, int i5) {
        View view;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        getListPaddingLeft();
        getListPaddingRight();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i6 = listPaddingBottom + listPaddingTop;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int i7 = 0;
        View view2 = null;
        int i8 = 0;
        int count = adapter.getCount();
        int i9 = 0;
        while (i9 < count) {
            int itemViewType = adapter.getItemViewType(i9);
            if (itemViewType != i8) {
                int i10 = itemViewType;
                view = null;
                i8 = i10;
            } else {
                view = view2;
            }
            view2 = adapter.getView(i9, view, this);
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view2.setLayoutParams(layoutParams);
            }
            view2.measure(i, layoutParams.height > 0 ? View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view2.forceLayout();
            int measuredHeight = (i9 > 0 ? i6 + dividerHeight : i6) + view2.getMeasuredHeight();
            if (measuredHeight >= i4) {
                return (i5 < 0 || i9 <= i5 || i7 <= 0 || measuredHeight == i4) ? i4 : i7;
            }
            if (i5 >= 0 && i9 >= i5) {
                i7 = measuredHeight;
            }
            i9++;
            i6 = measuredHeight;
        }
        return i6;
    }

    /* renamed from: a */
    public int mo6514a(int i, boolean z) {
        int i2;
        ListAdapter adapter = getAdapter();
        if (adapter == null || isInTouchMode()) {
            return -1;
        }
        int count = adapter.getCount();
        if (!getAdapter().areAllItemsEnabled()) {
            if (z) {
                i2 = Math.max(0, i);
                while (i2 < count && !adapter.isEnabled(i2)) {
                    i2++;
                }
            } else {
                int min = Math.min(i, count - 1);
                while (i2 >= 0 && !adapter.isEnabled(i2)) {
                    min = i2 - 1;
                }
            }
            if (i2 < 0 || i2 >= count) {
                return -1;
            }
            return i2;
        } else if (i < 0 || i >= count) {
            return -1;
        } else {
            return i;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6515a(int i, View view) {
        boolean z = true;
        Drawable selector = getSelector();
        boolean z2 = (selector == null || i == -1) ? false : true;
        if (z2) {
            selector.setVisible(false, false);
        }
        mo6519b(i, view);
        if (z2) {
            Rect rect = this.f5786c;
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            if (getVisibility() != 0) {
                z = false;
            }
            selector.setVisible(z, false);
            C0484a.m2537a(selector, exactCenterX, exactCenterY);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6516a(int i, View view, float f, float f2) {
        mo6515a(i, view);
        Drawable selector = getSelector();
        if (selector != null && i != -1) {
            C0484a.m2537a(selector, f, f2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6517a(Canvas canvas) {
        Drawable selector;
        if (!this.f5786c.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.f5786c);
            selector.draw(canvas);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo6363a() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo6518b() {
        Drawable selector = getSelector();
        if (selector != null && mo6520c()) {
            selector.setState(getDrawableState());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo6519b(int i, View view) {
        Rect rect = this.f5786c;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f5787d;
        rect.top -= this.f5788e;
        rect.right += this.f5789f;
        rect.bottom += this.f5790g;
        try {
            boolean z = this.f5792j.getBoolean(this);
            if (view.isEnabled() != z) {
                this.f5792j.set(this, Boolean.valueOf(!z));
                if (i != -1) {
                    refreshDrawableState();
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo6520c() {
        return mo6363a() && isPressed();
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        mo6517a(canvas);
        super.dispatchDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        setSelectorEnabled(true);
        mo6518b();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 0:
                this.f5791h = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setSelector(Drawable drawable) {
        this.f5793k = drawable != null ? new C1713a(drawable) : null;
        super.setSelector(this.f5793k);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f5787d = rect.left;
        this.f5788e = rect.top;
        this.f5789f = rect.right;
        this.f5790g = rect.bottom;
    }

    /* access modifiers changed from: protected */
    public void setSelectorEnabled(boolean z) {
        if (this.f5793k != null) {
            this.f5793k.mo6526a(z);
        }
    }
}
