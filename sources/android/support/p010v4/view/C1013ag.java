package android.support.p010v4.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.annotation.C0032k;
import android.support.annotation.C0033l;
import android.support.annotation.C0036o;
import android.support.p010v4.p014d.C0434d;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: android.support.v4.view.ag */
public class C1013ag extends C1016ah {

    /* renamed from: g */
    private static final String f3383g = "PagerTabStrip";

    /* renamed from: h */
    private static final int f3384h = 3;

    /* renamed from: i */
    private static final int f3385i = 6;

    /* renamed from: j */
    private static final int f3386j = 16;

    /* renamed from: k */
    private static final int f3387k = 32;

    /* renamed from: l */
    private static final int f3388l = 64;

    /* renamed from: m */
    private static final int f3389m = 1;

    /* renamed from: n */
    private static final int f3390n = 32;

    /* renamed from: A */
    private boolean f3391A;

    /* renamed from: B */
    private float f3392B;

    /* renamed from: C */
    private float f3393C;

    /* renamed from: D */
    private int f3394D;

    /* renamed from: o */
    private int f3395o;

    /* renamed from: p */
    private int f3396p;

    /* renamed from: q */
    private int f3397q;

    /* renamed from: r */
    private int f3398r;

    /* renamed from: s */
    private int f3399s;

    /* renamed from: t */
    private int f3400t;

    /* renamed from: u */
    private final Paint f3401u;

    /* renamed from: v */
    private final Rect f3402v;

    /* renamed from: w */
    private int f3403w;

    /* renamed from: x */
    private boolean f3404x;

    /* renamed from: y */
    private boolean f3405y;

    /* renamed from: z */
    private int f3406z;

    public C1013ag(Context context) {
        this(context, (AttributeSet) null);
    }

    public C1013ag(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3401u = new Paint();
        this.f3402v = new Rect();
        this.f3403w = 255;
        this.f3404x = false;
        this.f3405y = false;
        this.f3395o = this.f3420f;
        this.f3401u.setColor(this.f3395o);
        float f = context.getResources().getDisplayMetrics().density;
        this.f3396p = (int) ((3.0f * f) + 0.5f);
        this.f3397q = (int) ((6.0f * f) + 0.5f);
        this.f3398r = (int) (64.0f * f);
        this.f3400t = (int) ((16.0f * f) + 0.5f);
        this.f3406z = (int) ((1.0f * f) + 0.5f);
        this.f3399s = (int) ((f * 32.0f) + 0.5f);
        this.f3394D = ViewConfiguration.get(context).getScaledTouchSlop();
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        setTextSpacing(getTextSpacing());
        setWillNotDraw(false);
        this.f3416b.setFocusable(true);
        this.f3416b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                C1013ag.this.f3415a.setCurrentItem(C1013ag.this.f3415a.getCurrentItem() - 1);
            }
        });
        this.f3418d.setFocusable(true);
        this.f3418d.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                C1013ag.this.f3415a.setCurrentItem(C1013ag.this.f3415a.getCurrentItem() + 1);
            }
        });
        if (getBackground() == null) {
            this.f3404x = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3597a(int i, float f, boolean z) {
        Rect rect = this.f3402v;
        int height = getHeight();
        int left = this.f3417c.getLeft() - this.f3400t;
        int right = this.f3417c.getRight() + this.f3400t;
        int i2 = height - this.f3396p;
        rect.set(left, i2, right, height);
        super.mo3597a(i, f, z);
        this.f3403w = (int) (Math.abs(f - 0.5f) * 2.0f * 255.0f);
        rect.union(this.f3417c.getLeft() - this.f3400t, i2, this.f3417c.getRight() + this.f3400t, height);
        invalidate(rect);
    }

    public boolean getDrawFullUnderline() {
        return this.f3404x;
    }

    /* access modifiers changed from: package-private */
    public int getMinHeight() {
        return Math.max(super.getMinHeight(), this.f3399s);
    }

    @C0032k
    public int getTabIndicatorColor() {
        return this.f3395o;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        int left = this.f3417c.getLeft() - this.f3400t;
        int right = this.f3417c.getRight() + this.f3400t;
        int i = height - this.f3396p;
        this.f3401u.setColor((this.f3403w << 24) | (this.f3395o & C1040ar.f3484r));
        canvas.drawRect((float) left, (float) i, (float) right, (float) height, this.f3401u);
        if (this.f3404x) {
            this.f3401u.setColor(-16777216 | (this.f3395o & C1040ar.f3484r));
            canvas.drawRect((float) getPaddingLeft(), (float) (height - this.f3406z), (float) (getWidth() - getPaddingRight()), (float) height, this.f3401u);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0 && this.f3391A) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        switch (action) {
            case 0:
                this.f3392B = x;
                this.f3393C = y;
                this.f3391A = false;
                break;
            case 1:
                if (x >= ((float) (this.f3417c.getLeft() - this.f3400t))) {
                    if (x > ((float) (this.f3417c.getRight() + this.f3400t))) {
                        this.f3415a.setCurrentItem(this.f3415a.getCurrentItem() + 1);
                        break;
                    }
                } else {
                    this.f3415a.setCurrentItem(this.f3415a.getCurrentItem() - 1);
                    break;
                }
                break;
            case 2:
                if (Math.abs(x - this.f3392B) > ((float) this.f3394D) || Math.abs(y - this.f3393C) > ((float) this.f3394D)) {
                    this.f3391A = true;
                    break;
                }
        }
        return true;
    }

    public void setBackgroundColor(@C0032k int i) {
        super.setBackgroundColor(i);
        if (!this.f3405y) {
            this.f3404x = (-16777216 & i) == 0;
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (!this.f3405y) {
            this.f3404x = drawable == null;
        }
    }

    public void setBackgroundResource(@C0036o int i) {
        super.setBackgroundResource(i);
        if (!this.f3405y) {
            this.f3404x = i == 0;
        }
    }

    public void setDrawFullUnderline(boolean z) {
        this.f3404x = z;
        this.f3405y = true;
        invalidate();
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        if (i4 < this.f3397q) {
            i4 = this.f3397q;
        }
        super.setPadding(i, i2, i3, i4);
    }

    public void setTabIndicatorColor(@C0032k int i) {
        this.f3395o = i;
        this.f3401u.setColor(this.f3395o);
        invalidate();
    }

    public void setTabIndicatorColorResource(@C0033l int i) {
        setTabIndicatorColor(C0434d.m2381c(getContext(), i));
    }

    public void setTextSpacing(int i) {
        if (i < this.f3398r) {
            i = this.f3398r;
        }
        super.setTextSpacing(i);
    }
}
