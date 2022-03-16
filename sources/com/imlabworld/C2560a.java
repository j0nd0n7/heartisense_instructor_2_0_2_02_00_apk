package com.imlabworld;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.support.p010v4.view.C1040ar;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: com.imlabworld.a */
public class C2560a extends FrameLayout {

    /* renamed from: A */
    private final Matrix f9857A = new Matrix();

    /* renamed from: B */
    private final Paint f9858B = new Paint();

    /* renamed from: C */
    private C2561a f9859C;

    /* renamed from: D */
    private Bitmap f9860D;

    /* renamed from: a */
    private float f9861a = 1.0f;

    /* renamed from: b */
    private float f9862b = 2.0f;

    /* renamed from: c */
    private float f9863c = 1.0f;

    /* renamed from: d */
    private float f9864d;

    /* renamed from: e */
    private float f9865e;

    /* renamed from: f */
    private float f9866f;

    /* renamed from: g */
    private float f9867g;

    /* renamed from: h */
    private boolean f9868h;

    /* renamed from: i */
    private boolean f9869i = false;

    /* renamed from: j */
    private int f9870j = C1040ar.f3485s;

    /* renamed from: k */
    private int f9871k = -1;

    /* renamed from: l */
    private String f9872l;

    /* renamed from: m */
    private float f9873m = 10.0f;

    /* renamed from: n */
    private int f9874n = -1;

    /* renamed from: o */
    private long f9875o;

    /* renamed from: p */
    private float f9876p;

    /* renamed from: q */
    private float f9877q;

    /* renamed from: r */
    private float f9878r;

    /* renamed from: s */
    private float f9879s;

    /* renamed from: t */
    private float f9880t;

    /* renamed from: u */
    private boolean f9881u;

    /* renamed from: v */
    private float f9882v;

    /* renamed from: w */
    private float f9883w;

    /* renamed from: x */
    private float f9884x;

    /* renamed from: y */
    private float f9885y;

    /* renamed from: z */
    private float f9886z;

    /* renamed from: com.imlabworld.a$a */
    public interface C2561a {
        /* renamed from: a */
        void mo9787a(float f, float f2, float f3);

        /* renamed from: b */
        void mo9788b(float f, float f2, float f3);

        /* renamed from: c */
        void mo9789c(float f, float f2, float f3);
    }

    public C2560a(Context context) {
        super(context);
    }

    public C2560a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    private void m14295a(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        boolean z = x >= 10.0f && x <= ((((float) this.f9871k) * ((float) getWidth())) / ((float) getHeight())) + 10.0f && y >= 10.0f && y <= 10.0f + ((float) this.f9871k);
        if (!this.f9869i || this.f9863c <= 1.0f || !z) {
            m14299c(motionEvent);
        } else {
            m14297b(motionEvent);
        }
    }

    /* renamed from: b */
    private void m14296b(float f, float f2, float f3) {
        this.f9863c = m14298c(1.0f, f, this.f9862b);
        this.f9866f = f2;
        this.f9867g = f3;
        if (this.f9859C != null) {
            this.f9859C.mo9787a(this.f9863c, f2, f3);
        }
    }

    /* renamed from: b */
    private void m14297b(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        m14296b(this.f9863c, ((x - 10.0f) / ((((float) this.f9871k) * ((float) getWidth())) / ((float) getHeight()))) * ((float) getWidth()), ((y - 10.0f) / ((float) this.f9871k)) * ((float) getHeight()));
    }

    /* renamed from: c */
    private float m14298c(float f, float f2, float f3) {
        return Math.max(f, Math.min(f2, f3));
    }

    /* renamed from: c */
    private void m14299c(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        float hypot = (float) Math.hypot((double) (x - this.f9876p), (double) (y - this.f9877q));
        float f = x - this.f9878r;
        float f2 = y - this.f9879s;
        this.f9878r = x;
        this.f9879s = y;
        switch (motionEvent.getAction()) {
            case 0:
                this.f9876p = x;
                this.f9877q = y;
                this.f9878r = x;
                this.f9879s = y;
                this.f9868h = false;
                break;
            case 1:
            case 4:
                if (hypot < 30.0f) {
                    if (System.currentTimeMillis() - this.f9875o >= 500) {
                        this.f9875o = System.currentTimeMillis();
                        performClick();
                        break;
                    } else {
                        if (this.f9863c == 1.0f) {
                            m14296b(this.f9862b, x, y);
                        } else {
                            m14296b(1.0f, ((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f);
                        }
                        this.f9875o = 0;
                        motionEvent.setAction(3);
                        super.dispatchTouchEvent(motionEvent);
                        return;
                    }
                }
                break;
            case 2:
                if (this.f9868h || (this.f9863c > 1.0f && hypot > 30.0f)) {
                    if (!this.f9868h) {
                        this.f9868h = true;
                        motionEvent.setAction(3);
                        super.dispatchTouchEvent(motionEvent);
                    }
                    this.f9866f -= f / this.f9861a;
                    this.f9867g -= f2 / this.f9861a;
                    return;
                }
        }
        motionEvent.setLocation(((x - (((float) getWidth()) * 0.5f)) / this.f9861a) + this.f9864d, ((y - (((float) getHeight()) * 0.5f)) / this.f9861a) + this.f9865e);
        motionEvent.getX();
        motionEvent.getY();
        super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: d */
    private float m14300d(float f, float f2, float f3) {
        return ((f2 - f) * f3) + f;
    }

    /* renamed from: d */
    private void m14301d(MotionEvent motionEvent) {
        float x = motionEvent.getX(0);
        float f = x - this.f9883w;
        this.f9883w = x;
        float y = motionEvent.getY(0);
        float f2 = y - this.f9884x;
        this.f9884x = y;
        float x2 = motionEvent.getX(1);
        float f3 = x2 - this.f9885y;
        this.f9885y = x2;
        float y2 = motionEvent.getY(1);
        float f4 = y2 - this.f9886z;
        this.f9886z = y2;
        float hypot = (float) Math.hypot((double) (x2 - x), (double) (y2 - y));
        float f5 = hypot - this.f9882v;
        this.f9882v = hypot;
        float abs = Math.abs(hypot - this.f9880t);
        Math.atan2((double) (y2 - y), (double) (x2 - x));
        switch (motionEvent.getAction()) {
            case 0:
                this.f9880t = hypot;
                this.f9881u = false;
                break;
            case 2:
                if (this.f9881u || abs > 30.0f) {
                    this.f9881u = true;
                    m14296b(Math.max(1.0f, (this.f9861a * hypot) / (hypot - f5)), this.f9864d - ((0.5f * (f + f3)) / this.f9861a), this.f9865e - ((0.5f * (f2 + f4)) / this.f9861a));
                    break;
                }
            default:
                this.f9881u = false;
                break;
        }
        motionEvent.setAction(3);
        super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: e */
    private float m14302e(float f, float f2, float f3) {
        return Math.abs(f2 - f) >= f3 ? f + (Math.signum(f2 - f) * f3) : f2;
    }

    /* renamed from: a */
    public void mo9765a(float f, float f2, float f3) {
        this.f9861a = Math.min(f, this.f9862b);
        this.f9864d = f2;
        this.f9865e = f3;
        m14296b(this.f9861a, f2, f3);
    }

    /* renamed from: a */
    public boolean mo9766a() {
        return this.f9869i;
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        this.f9861a = m14300d(m14302e(this.f9861a, this.f9863c, 0.05f), this.f9863c, 0.2f);
        this.f9866f = m14298c((((float) getWidth()) * 0.5f) / this.f9863c, this.f9866f, ((float) getWidth()) - ((((float) getWidth()) * 0.5f) / this.f9863c));
        this.f9867g = m14298c((((float) getHeight()) * 0.5f) / this.f9863c, this.f9867g, ((float) getHeight()) - ((((float) getHeight()) * 0.5f) / this.f9863c));
        this.f9864d = m14300d(m14302e(this.f9864d, this.f9866f, 0.1f), this.f9866f, 0.35f);
        this.f9865e = m14300d(m14302e(this.f9865e, this.f9867g, 0.1f), this.f9867g, 0.35f);
        if (!(this.f9861a == this.f9863c || this.f9859C == null)) {
            this.f9859C.mo9788b(this.f9861a, this.f9864d, this.f9865e);
        }
        boolean z = Math.abs(this.f9861a - this.f9863c) > 1.0E-7f || Math.abs(this.f9864d - this.f9866f) > 1.0E-7f || Math.abs(this.f9865e - this.f9867g) > 1.0E-7f;
        if (getChildCount() != 0) {
            this.f9857A.setTranslate(((float) getWidth()) * 0.5f, ((float) getHeight()) * 0.5f);
            this.f9857A.preScale(this.f9861a, this.f9861a);
            this.f9857A.preTranslate(-m14298c((((float) getWidth()) * 0.5f) / this.f9861a, this.f9864d, ((float) getWidth()) - ((((float) getWidth()) * 0.5f) / this.f9861a)), -m14298c((((float) getHeight()) * 0.5f) / this.f9861a, this.f9865e, ((float) getHeight()) - ((((float) getHeight()) * 0.5f) / this.f9861a)));
            View childAt = getChildAt(0);
            this.f9857A.preTranslate((float) childAt.getLeft(), (float) childAt.getTop());
            if (z && this.f9860D == null && isAnimationCacheEnabled()) {
                childAt.setDrawingCacheEnabled(true);
                this.f9860D = childAt.getDrawingCache();
            }
            if (!z || !isAnimationCacheEnabled() || this.f9860D == null) {
                this.f9860D = null;
                canvas.save();
                canvas.concat(this.f9857A);
                childAt.draw(canvas);
                canvas.restore();
            } else {
                this.f9858B.setColor(-1);
                canvas.drawBitmap(this.f9860D, this.f9857A, this.f9858B);
            }
            if (this.f9869i) {
                if (this.f9871k < 0) {
                    this.f9871k = getHeight() / 4;
                }
                canvas.translate(10.0f, 10.0f);
                this.f9858B.setColor(Integer.MIN_VALUE | (16777215 & this.f9870j));
                float width = (((float) this.f9871k) * ((float) getWidth())) / ((float) getHeight());
                float f = (float) this.f9871k;
                canvas.drawRect(0.0f, 0.0f, width, f, this.f9858B);
                if (this.f9872l != null && this.f9872l.length() > 0) {
                    this.f9858B.setTextSize(this.f9873m);
                    this.f9858B.setColor(this.f9874n);
                    this.f9858B.setAntiAlias(true);
                    canvas.drawText(this.f9872l, 10.0f, this.f9873m + 10.0f, this.f9858B);
                    this.f9858B.setAntiAlias(false);
                }
                this.f9858B.setColor(Integer.MIN_VALUE | (16777215 & this.f9870j));
                float width2 = (this.f9864d * width) / ((float) getWidth());
                float height = (this.f9865e * f) / ((float) getHeight());
                canvas.drawRect(width2 - ((0.5f * width) / this.f9861a), height - ((0.5f * f) / this.f9861a), ((width * 0.5f) / this.f9861a) + width2, height + ((0.5f * f) / this.f9861a), this.f9858B);
                canvas.translate(-10.0f, -10.0f);
            }
            getRootView().invalidate();
            invalidate();
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() == 1) {
            m14295a(motionEvent);
        }
        if (motionEvent.getPointerCount() == 2) {
            m14301d(motionEvent);
        }
        getRootView().invalidate();
        invalidate();
        return true;
    }

    public C2561a getListener() {
        return this.f9859C;
    }

    public float getMaxZoom() {
        return this.f9862b;
    }

    public String getMiniMapCaption() {
        return this.f9872l;
    }

    public int getMiniMapCaptionColor() {
        return this.f9874n;
    }

    public float getMiniMapCaptionSize() {
        return this.f9873m;
    }

    public int getMiniMapColor() {
        return this.f9870j;
    }

    public int getMiniMapHeight() {
        return this.f9871k;
    }

    public float getZoom() {
        return this.f9861a;
    }

    public float getZoomFocusX() {
        return this.f9864d * this.f9861a;
    }

    public float getZoomFocusY() {
        return this.f9865e * this.f9861a;
    }

    public void setListner(C2561a aVar) {
        this.f9859C = aVar;
    }

    public void setMaxZoom(float f) {
        if (f >= 1.0f) {
            this.f9862b = f;
        }
    }

    public void setMiniMapCaption(String str) {
        this.f9872l = str;
    }

    public void setMiniMapCaptionColor(int i) {
        this.f9874n = i;
    }

    public void setMiniMapCaptionSize(float f) {
        this.f9873m = f;
    }

    public void setMiniMapColor(int i) {
        this.f9870j = i;
    }

    public void setMiniMapEnabled(boolean z) {
        this.f9869i = z;
    }

    public void setMiniMapHeight(int i) {
        if (i >= 0) {
            this.f9871k = i;
        }
    }
}
