package android.support.p010v4.view.p035b;

import android.annotation.TargetApi;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.support.annotation.C0007ae;
import android.view.animation.Interpolator;

@C0007ae(mo1a = 9)
@TargetApi(9)
/* renamed from: android.support.v4.view.b.h */
class C1080h implements Interpolator {

    /* renamed from: a */
    private static final float f3519a = 0.002f;

    /* renamed from: b */
    private final float[] f3520b;

    /* renamed from: c */
    private final float[] f3521c;

    public C1080h(float f, float f2) {
        this(m6483a(f, f2));
    }

    public C1080h(float f, float f2, float f3, float f4) {
        this(m6484a(f, f2, f3, f4));
    }

    public C1080h(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int i = ((int) (length / f3519a)) + 1;
        this.f3520b = new float[i];
        this.f3521c = new float[i];
        float[] fArr = new float[2];
        for (int i2 = 0; i2 < i; i2++) {
            pathMeasure.getPosTan((((float) i2) * length) / ((float) (i - 1)), fArr, (float[]) null);
            this.f3520b[i2] = fArr[0];
            this.f3521c[i2] = fArr[1];
        }
    }

    /* renamed from: a */
    private static Path m6483a(float f, float f2) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(f, f2, 1.0f, 1.0f);
        return path;
    }

    /* renamed from: a */
    private static Path m6484a(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f, f2, f3, f4, 1.0f, 1.0f);
        return path;
    }

    public float getInterpolation(float f) {
        int i;
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int i2 = 0;
        int length = this.f3520b.length - 1;
        while (length - i2 > 1) {
            int i3 = (i2 + length) / 2;
            if (f < this.f3520b[i3]) {
                i = i2;
            } else {
                int i4 = length;
                i = i3;
                i3 = i4;
            }
            i2 = i;
            length = i3;
        }
        float f2 = this.f3520b[length] - this.f3520b[i2];
        if (f2 == 0.0f) {
            return this.f3521c[i2];
        }
        float f3 = (f - this.f3520b[i2]) / f2;
        float f4 = this.f3521c[i2];
        return (f3 * (this.f3521c[length] - f4)) + f4;
    }
}
