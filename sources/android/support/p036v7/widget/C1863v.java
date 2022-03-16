package android.support.p036v7.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.p010v4.view.C1040ar;
import android.support.p036v7.p037a.C1359b;
import android.util.AttributeSet;
import android.widget.RatingBar;

/* renamed from: android.support.v7.widget.v */
public class C1863v extends RatingBar {

    /* renamed from: a */
    private C1861t f6331a;

    public C1863v(Context context) {
        this(context, (AttributeSet) null);
    }

    public C1863v(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1359b.C1361b.ratingBarStyle);
    }

    public C1863v(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6331a = new C1861t(this);
        this.f6331a.mo7488a(attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap a = this.f6331a.mo7487a();
        if (a != null) {
            setMeasuredDimension(C1040ar.m5878a(a.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
