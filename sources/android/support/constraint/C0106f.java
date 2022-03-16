package android.support.constraint;

import android.content.Context;
import android.graphics.Canvas;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: android.support.constraint.f */
public class C0106f extends View {
    public C0106f(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public C0106f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public C0106f(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }

    public C0106f(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }

    public void draw(Canvas canvas) {
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int i) {
        ConstraintLayout.C0052a aVar = (ConstraintLayout.C0052a) getLayoutParams();
        aVar.f133s = i;
        setLayoutParams(aVar);
    }

    public void setGuidelineEnd(int i) {
        ConstraintLayout.C0052a aVar = (ConstraintLayout.C0052a) getLayoutParams();
        aVar.f134t = i;
        setLayoutParams(aVar);
    }

    public void setGuidelinePercent(float f) {
        ConstraintLayout.C0052a aVar = (ConstraintLayout.C0052a) getLayoutParams();
        aVar.f135u = f;
        setLayoutParams(aVar);
    }

    public void setVisibility(int i) {
    }
}
