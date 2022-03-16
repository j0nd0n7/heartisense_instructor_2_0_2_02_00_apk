package android.support.p010v4.view.p035b;

import android.view.animation.Interpolator;

/* renamed from: android.support.v4.view.b.d */
abstract class C1076d implements Interpolator {

    /* renamed from: a */
    private final float[] f3517a;

    /* renamed from: b */
    private final float f3518b = (1.0f / ((float) (this.f3517a.length - 1)));

    public C1076d(float[] fArr) {
        this.f3517a = fArr;
    }

    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        int min = Math.min((int) (((float) (this.f3517a.length - 1)) * f), this.f3517a.length - 2);
        float f2 = (f - (((float) min) * this.f3518b)) / this.f3518b;
        return ((this.f3517a[min + 1] - this.f3517a[min]) * f2) + this.f3517a[min];
    }
}
