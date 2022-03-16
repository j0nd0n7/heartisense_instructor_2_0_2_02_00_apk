package com.p048a.p049a.p053d.p063d.p064a;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import com.p048a.p049a.p053d.p063d.p066c.C2097b;

/* renamed from: com.a.a.d.d.a.k */
public class C2077k extends C2097b {

    /* renamed from: c */
    private final Rect f6937c;

    /* renamed from: d */
    private int f6938d;

    /* renamed from: e */
    private int f6939e;

    /* renamed from: f */
    private boolean f6940f;

    /* renamed from: g */
    private boolean f6941g;

    /* renamed from: h */
    private C2078a f6942h;

    /* renamed from: com.a.a.d.d.a.k$a */
    static class C2078a extends Drawable.ConstantState {

        /* renamed from: d */
        private static final int f6943d = 6;

        /* renamed from: e */
        private static final Paint f6944e = new Paint(6);

        /* renamed from: f */
        private static final int f6945f = 119;

        /* renamed from: a */
        final Bitmap f6946a;

        /* renamed from: b */
        int f6947b;

        /* renamed from: c */
        Paint f6948c;

        public C2078a(Bitmap bitmap) {
            this.f6948c = f6944e;
            this.f6946a = bitmap;
        }

        C2078a(C2078a aVar) {
            this(aVar.f6946a);
            this.f6947b = aVar.f6947b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo7979a() {
            if (f6944e == this.f6948c) {
                this.f6948c = new Paint(6);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo7980a(int i) {
            mo7979a();
            this.f6948c.setAlpha(i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo7981a(ColorFilter colorFilter) {
            mo7979a();
            this.f6948c.setColorFilter(colorFilter);
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public Drawable newDrawable() {
            return new C2077k((Resources) null, this);
        }

        public Drawable newDrawable(Resources resources) {
            return new C2077k(resources, this);
        }
    }

    public C2077k(Resources resources, Bitmap bitmap) {
        this(resources, new C2078a(bitmap));
    }

    C2077k(Resources resources, C2078a aVar) {
        int i;
        this.f6937c = new Rect();
        if (aVar == null) {
            throw new NullPointerException("BitmapState must not be null");
        }
        this.f6942h = aVar;
        if (resources != null) {
            i = resources.getDisplayMetrics().densityDpi;
            i = i == 0 ? 160 : i;
            aVar.f6947b = i;
        } else {
            i = aVar.f6947b;
        }
        this.f6938d = aVar.f6946a.getScaledWidth(i);
        this.f6939e = aVar.f6946a.getScaledHeight(i);
    }

    /* renamed from: a */
    public void mo7964a(int i) {
    }

    /* renamed from: a */
    public boolean mo7965a() {
        return false;
    }

    /* renamed from: b */
    public Bitmap mo7966b() {
        return this.f6942h.f6946a;
    }

    public void draw(Canvas canvas) {
        if (this.f6940f) {
            Gravity.apply(119, this.f6938d, this.f6939e, getBounds(), this.f6937c);
            this.f6940f = false;
        }
        canvas.drawBitmap(this.f6942h.f6946a, (Rect) null, this.f6937c, this.f6942h.f6948c);
    }

    public Drawable.ConstantState getConstantState() {
        return this.f6942h;
    }

    public int getIntrinsicHeight() {
        return this.f6939e;
    }

    public int getIntrinsicWidth() {
        return this.f6938d;
    }

    public int getOpacity() {
        Bitmap bitmap = this.f6942h.f6946a;
        return (bitmap == null || bitmap.hasAlpha() || this.f6942h.f6948c.getAlpha() < 255) ? -3 : -1;
    }

    public boolean isRunning() {
        return false;
    }

    public Drawable mutate() {
        if (!this.f6941g && super.mutate() == this) {
            this.f6942h = new C2078a(this.f6942h);
            this.f6941g = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f6940f = true;
    }

    public void setAlpha(int i) {
        if (this.f6942h.f6948c.getAlpha() != i) {
            this.f6942h.mo7980a(i);
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f6942h.mo7981a(colorFilter);
        invalidateSelf();
    }

    public void start() {
    }

    public void stop() {
    }
}
