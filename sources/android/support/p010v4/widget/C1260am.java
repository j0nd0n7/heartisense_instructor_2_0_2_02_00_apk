package android.support.p010v4.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.p010v4.view.C1040ar;
import android.support.p010v4.view.p035b.C1074b;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

/* renamed from: android.support.v4.widget.am */
final class C1260am {

    /* renamed from: a */
    private static final int f3846a = -1291845632;

    /* renamed from: b */
    private static final int f3847b = Integer.MIN_VALUE;

    /* renamed from: c */
    private static final int f3848c = 1291845632;

    /* renamed from: d */
    private static final int f3849d = 436207616;

    /* renamed from: e */
    private static final int f3850e = 2000;

    /* renamed from: f */
    private static final int f3851f = 1000;

    /* renamed from: g */
    private static final Interpolator f3852g = new C1074b();

    /* renamed from: h */
    private final Paint f3853h = new Paint();

    /* renamed from: i */
    private final RectF f3854i = new RectF();

    /* renamed from: j */
    private float f3855j;

    /* renamed from: k */
    private long f3856k;

    /* renamed from: l */
    private long f3857l;

    /* renamed from: m */
    private boolean f3858m;

    /* renamed from: n */
    private int f3859n;

    /* renamed from: o */
    private int f3860o;

    /* renamed from: p */
    private int f3861p;

    /* renamed from: q */
    private int f3862q;

    /* renamed from: r */
    private View f3863r;

    /* renamed from: s */
    private Rect f3864s = new Rect();

    C1260am(View view) {
        this.f3863r = view;
        this.f3859n = f3846a;
        this.f3860o = Integer.MIN_VALUE;
        this.f3861p = f3848c;
        this.f3862q = f3849d;
    }

    /* renamed from: a */
    private void m7451a(Canvas canvas, float f, float f2, int i, float f3) {
        this.f3853h.setColor(i);
        canvas.save();
        canvas.translate(f, f2);
        float interpolation = f3852g.getInterpolation(f3);
        canvas.scale(interpolation, interpolation);
        canvas.drawCircle(0.0f, 0.0f, f, this.f3853h);
        canvas.restore();
    }

    /* renamed from: a */
    private void m7452a(Canvas canvas, int i, int i2) {
        this.f3853h.setColor(this.f3859n);
        canvas.drawCircle((float) i, (float) i2, ((float) i) * this.f3855j, this.f3853h);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4247a() {
        if (!this.f3858m) {
            this.f3855j = 0.0f;
            this.f3856k = AnimationUtils.currentAnimationTimeMillis();
            this.f3858m = true;
            this.f3863r.postInvalidate();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4248a(float f) {
        this.f3855j = f;
        this.f3856k = 0;
        C1040ar.m5883a(this.f3863r, this.f3864s.left, this.f3864s.top, this.f3864s.right, this.f3864s.bottom);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4249a(int i, int i2, int i3, int i4) {
        this.f3859n = i;
        this.f3860o = i2;
        this.f3861p = i3;
        this.f3862q = i4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4250a(Canvas canvas) {
        boolean z;
        int i;
        int width = this.f3864s.width();
        int height = this.f3864s.height();
        int i2 = width / 2;
        int i3 = height / 2;
        int save = canvas.save();
        canvas.clipRect(this.f3864s);
        if (this.f3858m || this.f3857l > 0) {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            long j = (currentAnimationTimeMillis - this.f3856k) / 2000;
            float f = ((float) ((currentAnimationTimeMillis - this.f3856k) % 2000)) / 20.0f;
            if (this.f3858m) {
                z = false;
            } else if (currentAnimationTimeMillis - this.f3857l >= 1000) {
                this.f3857l = 0;
                return;
            } else {
                float interpolation = f3852g.getInterpolation((((float) ((currentAnimationTimeMillis - this.f3857l) % 1000)) / 10.0f) / 100.0f) * ((float) (width / 2));
                this.f3854i.set(((float) i2) - interpolation, 0.0f, interpolation + ((float) i2), (float) height);
                canvas.saveLayerAlpha(this.f3854i, 0, 0);
                z = true;
            }
            if (j == 0) {
                canvas.drawColor(this.f3859n);
            } else if (f >= 0.0f && f < 25.0f) {
                canvas.drawColor(this.f3862q);
            } else if (f >= 25.0f && f < 50.0f) {
                canvas.drawColor(this.f3859n);
            } else if (f < 50.0f || f >= 75.0f) {
                canvas.drawColor(this.f3861p);
            } else {
                canvas.drawColor(this.f3860o);
            }
            if (f >= 0.0f && f <= 25.0f) {
                m7451a(canvas, (float) i2, (float) i3, this.f3859n, ((25.0f + f) * 2.0f) / 100.0f);
            }
            if (f >= 0.0f && f <= 50.0f) {
                m7451a(canvas, (float) i2, (float) i3, this.f3860o, (2.0f * f) / 100.0f);
            }
            if (f >= 25.0f && f <= 75.0f) {
                m7451a(canvas, (float) i2, (float) i3, this.f3861p, ((f - 25.0f) * 2.0f) / 100.0f);
            }
            if (f >= 50.0f && f <= 100.0f) {
                m7451a(canvas, (float) i2, (float) i3, this.f3862q, ((f - 50.0f) * 2.0f) / 100.0f);
            }
            if (f >= 75.0f && f <= 100.0f) {
                m7451a(canvas, (float) i2, (float) i3, this.f3859n, ((f - 75.0f) * 2.0f) / 100.0f);
            }
            if (this.f3855j <= 0.0f || !z) {
                i = save;
            } else {
                canvas.restoreToCount(save);
                i = canvas.save();
                canvas.clipRect(this.f3864s);
                m7452a(canvas, i2, i3);
            }
            C1040ar.m5883a(this.f3863r, this.f3864s.left, this.f3864s.top, this.f3864s.right, this.f3864s.bottom);
            save = i;
        } else if (this.f3855j > 0.0f && ((double) this.f3855j) <= 1.0d) {
            m7452a(canvas, i2, i3);
        }
        canvas.restoreToCount(save);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo4251b() {
        if (this.f3858m) {
            this.f3855j = 0.0f;
            this.f3857l = AnimationUtils.currentAnimationTimeMillis();
            this.f3858m = false;
            this.f3863r.postInvalidate();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo4252b(int i, int i2, int i3, int i4) {
        this.f3864s.left = i;
        this.f3864s.top = i2;
        this.f3864s.right = i3;
        this.f3864s.bottom = i4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo4253c() {
        return this.f3858m || this.f3857l > 0;
    }
}
