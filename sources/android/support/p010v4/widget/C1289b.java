package android.support.p010v4.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.support.p010v4.p014d.C0434d;
import android.support.p010v4.view.C1040ar;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;

/* renamed from: android.support.v4.widget.b */
class C1289b extends ImageView {

    /* renamed from: b */
    private static final int f3983b = 503316480;

    /* renamed from: c */
    private static final int f3984c = 1023410176;

    /* renamed from: d */
    private static final float f3985d = 0.0f;

    /* renamed from: e */
    private static final float f3986e = 1.75f;

    /* renamed from: f */
    private static final float f3987f = 3.5f;

    /* renamed from: g */
    private static final int f3988g = 4;

    /* renamed from: a */
    int f3989a;

    /* renamed from: h */
    private Animation.AnimationListener f3990h;

    /* renamed from: android.support.v4.widget.b$a */
    private class C1290a extends OvalShape {

        /* renamed from: b */
        private RadialGradient f3992b;

        /* renamed from: c */
        private Paint f3993c = new Paint();

        C1290a(int i) {
            C1289b.this.f3989a = i;
            m7600a((int) rect().width());
        }

        /* renamed from: a */
        private void m7600a(int i) {
            this.f3992b = new RadialGradient((float) (i / 2), (float) (i / 2), (float) C1289b.this.f3989a, new int[]{C1289b.f3984c, 0}, (float[]) null, Shader.TileMode.CLAMP);
            this.f3993c.setShader(this.f3992b);
        }

        public void draw(Canvas canvas, Paint paint) {
            int width = C1289b.this.getWidth();
            int height = C1289b.this.getHeight();
            canvas.drawCircle((float) (width / 2), (float) (height / 2), (float) (width / 2), this.f3993c);
            canvas.drawCircle((float) (width / 2), (float) (height / 2), (float) ((width / 2) - C1289b.this.f3989a), paint);
        }

        /* access modifiers changed from: protected */
        public void onResize(float f, float f2) {
            super.onResize(f, f2);
            m7600a((int) f);
        }
    }

    C1289b(Context context, int i) {
        super(context);
        ShapeDrawable shapeDrawable;
        float f = getContext().getResources().getDisplayMetrics().density;
        int i2 = (int) (f3986e * f);
        int i3 = (int) (0.0f * f);
        this.f3989a = (int) (f3987f * f);
        if (m7597a()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            C1040ar.m5952m(this, f * 4.0f);
        } else {
            shapeDrawable = new ShapeDrawable(new C1290a(this.f3989a));
            C1040ar.m5884a((View) this, 1, shapeDrawable.getPaint());
            shapeDrawable.getPaint().setShadowLayer((float) this.f3989a, (float) i3, (float) i2, f3983b);
            int i4 = this.f3989a;
            setPadding(i4, i4, i4, i4);
        }
        shapeDrawable.getPaint().setColor(i);
        C1040ar.m5889a((View) this, (Drawable) shapeDrawable);
    }

    /* renamed from: a */
    private boolean m7597a() {
        return Build.VERSION.SDK_INT >= 21;
    }

    /* renamed from: a */
    public void mo4344a(int i) {
        setBackgroundColor(C0434d.m2381c(getContext(), i));
    }

    /* renamed from: a */
    public void mo4345a(Animation.AnimationListener animationListener) {
        this.f3990h = animationListener;
    }

    public void onAnimationEnd() {
        super.onAnimationEnd();
        if (this.f3990h != null) {
            this.f3990h.onAnimationEnd(getAnimation());
        }
    }

    public void onAnimationStart() {
        super.onAnimationStart();
        if (this.f3990h != null) {
            this.f3990h.onAnimationStart(getAnimation());
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!m7597a()) {
            setMeasuredDimension(getMeasuredWidth() + (this.f3989a * 2), getMeasuredHeight() + (this.f3989a * 2));
        }
    }

    public void setBackgroundColor(int i) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i);
        }
    }
}
