package android.support.p036v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.support.annotation.C0011ag;
import android.support.p036v7.p037a.C1359b;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;

@C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
/* renamed from: android.support.v7.widget.ViewStubCompat */
public final class ViewStubCompat extends View {

    /* renamed from: a */
    private int f5462a;

    /* renamed from: b */
    private int f5463b;

    /* renamed from: c */
    private WeakReference<View> f5464c;

    /* renamed from: d */
    private LayoutInflater f5465d;

    /* renamed from: e */
    private C1640a f5466e;

    /* renamed from: android.support.v7.widget.ViewStubCompat$a */
    public interface C1640a {
        /* renamed from: a */
        void mo6169a(ViewStubCompat viewStubCompat, View view);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5462a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1359b.C1371l.ViewStubCompat, i, 0);
        this.f5463b = obtainStyledAttributes.getResourceId(C1359b.C1371l.ViewStubCompat_android_inflatedId, -1);
        this.f5462a = obtainStyledAttributes.getResourceId(C1359b.C1371l.ViewStubCompat_android_layout, 0);
        setId(obtainStyledAttributes.getResourceId(C1359b.C1371l.ViewStubCompat_android_id, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    /* renamed from: a */
    public View mo6157a() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        } else if (this.f5462a != 0) {
            ViewGroup viewGroup = (ViewGroup) parent;
            View inflate = (this.f5465d != null ? this.f5465d : LayoutInflater.from(getContext())).inflate(this.f5462a, viewGroup, false);
            if (this.f5463b != -1) {
                inflate.setId(this.f5463b);
            }
            int indexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(inflate, indexOfChild, layoutParams);
            } else {
                viewGroup.addView(inflate, indexOfChild);
            }
            this.f5464c = new WeakReference<>(inflate);
            if (this.f5466e != null) {
                this.f5466e.mo6169a(this, inflate);
            }
            return inflate;
        } else {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
    }

    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f5463b;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f5465d;
    }

    public int getLayoutResource() {
        return this.f5462a;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i) {
        this.f5463b = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f5465d = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.f5462a = i;
    }

    public void setOnInflateListener(C1640a aVar) {
        this.f5466e = aVar;
    }

    public void setVisibility(int i) {
        if (this.f5464c != null) {
            View view = (View) this.f5464c.get();
            if (view != null) {
                view.setVisibility(i);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            mo6157a();
        }
    }
}
