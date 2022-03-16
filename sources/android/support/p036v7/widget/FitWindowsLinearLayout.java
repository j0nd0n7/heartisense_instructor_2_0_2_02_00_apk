package android.support.p036v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.annotation.C0011ag;
import android.support.p036v7.widget.C1685aj;
import android.util.AttributeSet;
import android.widget.LinearLayout;

@C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
/* renamed from: android.support.v7.widget.FitWindowsLinearLayout */
public class FitWindowsLinearLayout extends LinearLayout implements C1685aj {

    /* renamed from: a */
    private C1685aj.C1686a f5191a;

    public FitWindowsLinearLayout(Context context) {
        super(context);
    }

    public FitWindowsLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        if (this.f5191a != null) {
            this.f5191a.mo4928a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    public void setOnFitSystemWindowsListener(C1685aj.C1686a aVar) {
        this.f5191a = aVar;
    }
}
