package android.support.constraint;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.constraint.C0108h;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewGroup;

/* renamed from: android.support.constraint.d */
public class C0103d extends ViewGroup {

    /* renamed from: a */
    public static final String f811a = "Constraints";

    /* renamed from: b */
    C0100c f812b;

    /* renamed from: android.support.constraint.d$a */
    public static class C0104a extends ConstraintLayout.C0052a {

        /* renamed from: aF */
        public float f813aF = 1.0f;

        /* renamed from: aG */
        public boolean f814aG = false;

        /* renamed from: aH */
        public float f815aH = 0.0f;

        /* renamed from: aI */
        public float f816aI = 0.0f;

        /* renamed from: aJ */
        public float f817aJ = 0.0f;

        /* renamed from: aK */
        public float f818aK = 0.0f;

        /* renamed from: aL */
        public float f819aL = 1.0f;

        /* renamed from: aM */
        public float f820aM = 1.0f;

        /* renamed from: aN */
        public float f821aN = 0.0f;

        /* renamed from: aO */
        public float f822aO = 0.0f;

        /* renamed from: aP */
        public float f823aP = 0.0f;

        /* renamed from: aQ */
        public float f824aQ = 0.0f;

        /* renamed from: aR */
        public float f825aR = 0.0f;

        public C0104a(int i, int i2) {
            super(i, i2);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0104a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0108h.C0111c.ConstraintSet);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0108h.C0111c.ConstraintSet_android_alpha) {
                    this.f813aF = obtainStyledAttributes.getFloat(index, this.f813aF);
                } else if (index == C0108h.C0111c.ConstraintSet_android_elevation) {
                    this.f815aH = obtainStyledAttributes.getFloat(index, this.f815aH);
                    this.f814aG = true;
                } else if (index == C0108h.C0111c.ConstraintSet_android_rotationX) {
                    this.f817aJ = obtainStyledAttributes.getFloat(index, this.f817aJ);
                } else if (index == C0108h.C0111c.ConstraintSet_android_rotationY) {
                    this.f818aK = obtainStyledAttributes.getFloat(index, this.f818aK);
                } else if (index == C0108h.C0111c.ConstraintSet_android_rotation) {
                    this.f816aI = obtainStyledAttributes.getFloat(index, this.f816aI);
                } else if (index == C0108h.C0111c.ConstraintSet_android_scaleX) {
                    this.f819aL = obtainStyledAttributes.getFloat(index, this.f819aL);
                } else if (index == C0108h.C0111c.ConstraintSet_android_scaleY) {
                    this.f820aM = obtainStyledAttributes.getFloat(index, this.f820aM);
                } else if (index == C0108h.C0111c.ConstraintSet_android_transformPivotX) {
                    this.f821aN = obtainStyledAttributes.getFloat(index, this.f821aN);
                } else if (index == C0108h.C0111c.ConstraintSet_android_transformPivotY) {
                    this.f822aO = obtainStyledAttributes.getFloat(index, this.f822aO);
                } else if (index == C0108h.C0111c.ConstraintSet_android_translationX) {
                    this.f823aP = obtainStyledAttributes.getFloat(index, this.f823aP);
                } else if (index == C0108h.C0111c.ConstraintSet_android_translationY) {
                    this.f824aQ = obtainStyledAttributes.getFloat(index, this.f824aQ);
                } else if (index == C0108h.C0111c.ConstraintSet_android_translationZ) {
                    this.f823aP = obtainStyledAttributes.getFloat(index, this.f825aR);
                }
            }
        }

        public C0104a(C0104a aVar) {
            super((ConstraintLayout.C0052a) aVar);
        }
    }

    public C0103d(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public C0103d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m621b(attributeSet);
        super.setVisibility(8);
    }

    public C0103d(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m621b(attributeSet);
        super.setVisibility(8);
    }

    /* renamed from: b */
    private void m621b(AttributeSet attributeSet) {
        Log.v(f811a, " ################# init");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0104a generateDefaultLayoutParams() {
        return new C0104a(-2, -2);
    }

    /* renamed from: a */
    public C0104a generateLayoutParams(AttributeSet attributeSet) {
        return new C0104a(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.C0052a(layoutParams);
    }

    public C0100c getConstraintSet() {
        if (this.f812b == null) {
            this.f812b = new C0100c();
        }
        this.f812b.mo477a(this);
        return this.f812b;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
