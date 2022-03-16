package android.support.constraint;

import android.content.Context;
import android.os.Build;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: android.support.constraint.e */
public class C0105e extends C0099b {
    public C0105e(Context context) {
        super(context);
    }

    public C0105e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C0105e(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: a */
    public void mo452a(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = Build.VERSION.SDK_INT >= 21 ? getElevation() : 0.0f;
        for (int i = 0; i < this.f633h; i++) {
            View a = constraintLayout.mo29a(this.f632g[i]);
            if (a != null) {
                a.setVisibility(visibility);
                if (elevation > 0.0f && Build.VERSION.SDK_INT >= 21) {
                    a.setElevation(elevation);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo62a(AttributeSet attributeSet) {
        super.mo62a(attributeSet);
        this.f636k = false;
    }

    /* renamed from: b */
    public void mo454b(ConstraintLayout constraintLayout) {
        ConstraintLayout.C0052a aVar = (ConstraintLayout.C0052a) getLayoutParams();
        aVar.f105aD.mo271r(0);
        aVar.f105aD.mo274s(0);
    }
}
