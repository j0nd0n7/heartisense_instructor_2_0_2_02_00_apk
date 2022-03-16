package android.support.p036v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.C0003aa;
import android.support.p010v4.p018f.p019a.C0484a;
import android.support.p010v4.view.C1040ar;
import android.support.p010v4.view.C1200x;
import android.support.p036v7.p037a.C1359b;
import android.support.p036v7.p038b.p039a.C1477b;
import android.support.p036v7.p043e.C1489a;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.CompoundButton;

/* renamed from: android.support.v7.widget.bj */
public class C1798bj extends CompoundButton {

    /* renamed from: U */
    private static final int[] f6030U = {16842912};

    /* renamed from: b */
    private static final int f6031b = 250;

    /* renamed from: c */
    private static final int f6032c = 0;

    /* renamed from: d */
    private static final int f6033d = 1;

    /* renamed from: e */
    private static final int f6034e = 2;

    /* renamed from: f */
    private static final String f6035f = "android.widget.Switch";

    /* renamed from: g */
    private static final int f6036g = 1;

    /* renamed from: h */
    private static final int f6037h = 2;

    /* renamed from: i */
    private static final int f6038i = 3;

    /* renamed from: A */
    private int f6039A;

    /* renamed from: B */
    private int f6040B;

    /* renamed from: C */
    private float f6041C;

    /* renamed from: D */
    private float f6042D;

    /* renamed from: E */
    private VelocityTracker f6043E;

    /* renamed from: F */
    private int f6044F;

    /* renamed from: G */
    private float f6045G;

    /* renamed from: H */
    private int f6046H;

    /* renamed from: I */
    private int f6047I;

    /* renamed from: J */
    private int f6048J;

    /* renamed from: K */
    private int f6049K;

    /* renamed from: L */
    private int f6050L;

    /* renamed from: M */
    private int f6051M;

    /* renamed from: N */
    private int f6052N;

    /* renamed from: O */
    private TextPaint f6053O;

    /* renamed from: P */
    private ColorStateList f6054P;

    /* renamed from: Q */
    private Layout f6055Q;

    /* renamed from: R */
    private Layout f6056R;

    /* renamed from: S */
    private TransformationMethod f6057S;

    /* renamed from: T */
    private final Rect f6058T;

    /* renamed from: a */
    C1800a f6059a;

    /* renamed from: j */
    private Drawable f6060j;

    /* renamed from: k */
    private ColorStateList f6061k;

    /* renamed from: l */
    private PorterDuff.Mode f6062l;

    /* renamed from: m */
    private boolean f6063m;

    /* renamed from: n */
    private boolean f6064n;

    /* renamed from: o */
    private Drawable f6065o;

    /* renamed from: p */
    private ColorStateList f6066p;

    /* renamed from: q */
    private PorterDuff.Mode f6067q;

    /* renamed from: r */
    private boolean f6068r;

    /* renamed from: s */
    private boolean f6069s;

    /* renamed from: t */
    private int f6070t;

    /* renamed from: u */
    private int f6071u;

    /* renamed from: v */
    private int f6072v;

    /* renamed from: w */
    private boolean f6073w;

    /* renamed from: x */
    private CharSequence f6074x;

    /* renamed from: y */
    private CharSequence f6075y;

    /* renamed from: z */
    private boolean f6076z;

    /* renamed from: android.support.v7.widget.bj$a */
    private class C1800a extends Animation {

        /* renamed from: a */
        final float f6079a;

        /* renamed from: b */
        final float f6080b;

        /* renamed from: c */
        final float f6081c;

        C1800a(float f, float f2) {
            this.f6079a = f;
            this.f6080b = f2;
            this.f6081c = f2 - f;
        }

        /* access modifiers changed from: protected */
        public void applyTransformation(float f, Transformation transformation) {
            C1798bj.this.setThumbPosition(this.f6079a + (this.f6081c * f));
        }
    }

    public C1798bj(Context context) {
        this(context, (AttributeSet) null);
    }

    public C1798bj(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1359b.C1361b.switchStyle);
    }

    public C1798bj(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6061k = null;
        this.f6062l = null;
        this.f6063m = false;
        this.f6064n = false;
        this.f6066p = null;
        this.f6067q = null;
        this.f6068r = false;
        this.f6069s = false;
        this.f6043E = VelocityTracker.obtain();
        this.f6058T = new Rect();
        this.f6053O = new TextPaint(1);
        Resources resources = getResources();
        this.f6053O.density = resources.getDisplayMetrics().density;
        C1807bp a = C1807bp.m10923a(context, attributeSet, C1359b.C1371l.SwitchCompat, i, 0);
        this.f6060j = a.mo7293a(C1359b.C1371l.SwitchCompat_android_thumb);
        if (this.f6060j != null) {
            this.f6060j.setCallback(this);
        }
        this.f6065o = a.mo7293a(C1359b.C1371l.SwitchCompat_track);
        if (this.f6065o != null) {
            this.f6065o.setCallback(this);
        }
        this.f6074x = a.mo7304d(C1359b.C1371l.SwitchCompat_android_textOn);
        this.f6075y = a.mo7304d(C1359b.C1371l.SwitchCompat_android_textOff);
        this.f6076z = a.mo7295a(C1359b.C1371l.SwitchCompat_showText, true);
        this.f6070t = a.mo7306e(C1359b.C1371l.SwitchCompat_thumbTextPadding, 0);
        this.f6071u = a.mo7306e(C1359b.C1371l.SwitchCompat_switchMinWidth, 0);
        this.f6072v = a.mo7306e(C1359b.C1371l.SwitchCompat_switchPadding, 0);
        this.f6073w = a.mo7295a(C1359b.C1371l.SwitchCompat_splitTrack, false);
        ColorStateList g = a.mo7313g(C1359b.C1371l.SwitchCompat_thumbTint);
        if (g != null) {
            this.f6061k = g;
            this.f6063m = true;
        }
        PorterDuff.Mode a2 = C1683ah.m10099a(a.mo7291a(C1359b.C1371l.SwitchCompat_thumbTintMode, -1), (PorterDuff.Mode) null);
        if (this.f6062l != a2) {
            this.f6062l = a2;
            this.f6064n = true;
        }
        if (this.f6063m || this.f6064n) {
            m10902b();
        }
        ColorStateList g2 = a.mo7313g(C1359b.C1371l.SwitchCompat_trackTint);
        if (g2 != null) {
            this.f6066p = g2;
            this.f6068r = true;
        }
        PorterDuff.Mode a3 = C1683ah.m10099a(a.mo7291a(C1359b.C1371l.SwitchCompat_trackTintMode, -1), (PorterDuff.Mode) null);
        if (this.f6067q != a3) {
            this.f6067q = a3;
            this.f6069s = true;
        }
        if (this.f6068r || this.f6069s) {
            m10897a();
        }
        int g3 = a.mo7312g(C1359b.C1371l.SwitchCompat_switchTextAppearance, 0);
        if (g3 != 0) {
            mo7225a(context, g3);
        }
        a.mo7308e();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f6040B = viewConfiguration.getScaledTouchSlop();
        this.f6044F = viewConfiguration.getScaledMinimumFlingVelocity();
        refreshDrawableState();
        setChecked(isChecked());
    }

    /* renamed from: a */
    private static float m10895a(float f, float f2, float f3) {
        return f < f2 ? f2 : f > f3 ? f3 : f;
    }

    /* renamed from: a */
    private Layout m10896a(CharSequence charSequence) {
        CharSequence transformation = this.f6057S != null ? this.f6057S.getTransformation(charSequence, this) : charSequence;
        return new StaticLayout(transformation, this.f6053O, transformation != null ? (int) Math.ceil((double) Layout.getDesiredWidth(transformation, this.f6053O)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    /* renamed from: a */
    private void m10897a() {
        if (this.f6065o == null) {
            return;
        }
        if (this.f6068r || this.f6069s) {
            this.f6065o = this.f6065o.mutate();
            if (this.f6068r) {
                C0484a.m2540a(this.f6065o, this.f6066p);
            }
            if (this.f6069s) {
                C0484a.m2543a(this.f6065o, this.f6067q);
            }
            if (this.f6065o.isStateful()) {
                this.f6065o.setState(getDrawableState());
            }
        }
    }

    /* renamed from: a */
    private void m10898a(int i, int i2) {
        Typeface typeface = null;
        switch (i) {
            case 1:
                typeface = Typeface.SANS_SERIF;
                break;
            case 2:
                typeface = Typeface.SERIF;
                break;
            case 3:
                typeface = Typeface.MONOSPACE;
                break;
        }
        mo7226a(typeface, i2);
    }

    /* renamed from: a */
    private void m10899a(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        super.onTouchEvent(obtain);
        obtain.recycle();
    }

    /* renamed from: a */
    private void m10900a(final boolean z) {
        if (this.f6059a != null) {
            m10904c();
        }
        this.f6059a = new C1800a(this.f6045G, z ? 1.0f : 0.0f);
        this.f6059a.setDuration(250);
        this.f6059a.setAnimationListener(new Animation.AnimationListener() {
            public void onAnimationEnd(Animation animation) {
                if (C1798bj.this.f6059a == animation) {
                    C1798bj.this.setThumbPosition(z ? 1.0f : 0.0f);
                    C1798bj.this.f6059a = null;
                }
            }

            public void onAnimationRepeat(Animation animation) {
            }

            public void onAnimationStart(Animation animation) {
            }
        });
        startAnimation(this.f6059a);
    }

    /* renamed from: a */
    private boolean m10901a(float f, float f2) {
        if (this.f6060j == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.f6060j.getPadding(this.f6058T);
        int i = this.f6050L - this.f6040B;
        int i2 = (thumbOffset + this.f6049K) - this.f6040B;
        return f > ((float) i2) && f < ((float) ((((this.f6048J + i2) + this.f6058T.left) + this.f6058T.right) + this.f6040B)) && f2 > ((float) i) && f2 < ((float) (this.f6052N + this.f6040B));
    }

    /* renamed from: b */
    private void m10902b() {
        if (this.f6060j == null) {
            return;
        }
        if (this.f6063m || this.f6064n) {
            this.f6060j = this.f6060j.mutate();
            if (this.f6063m) {
                C0484a.m2540a(this.f6060j, this.f6061k);
            }
            if (this.f6064n) {
                C0484a.m2543a(this.f6060j, this.f6062l);
            }
            if (this.f6060j.isStateful()) {
                this.f6060j.setState(getDrawableState());
            }
        }
    }

    /* renamed from: b */
    private void m10903b(MotionEvent motionEvent) {
        boolean z = true;
        this.f6039A = 0;
        boolean z2 = motionEvent.getAction() == 1 && isEnabled();
        boolean isChecked = isChecked();
        if (z2) {
            this.f6043E.computeCurrentVelocity(1000);
            float xVelocity = this.f6043E.getXVelocity();
            if (Math.abs(xVelocity) <= ((float) this.f6044F)) {
                z = getTargetCheckedState();
            } else if (C1819bu.m11063a(this)) {
                if (xVelocity >= 0.0f) {
                    z = false;
                }
            } else if (xVelocity <= 0.0f) {
                z = false;
            }
        } else {
            z = isChecked;
        }
        if (z != isChecked) {
            playSoundEffect(0);
        }
        setChecked(z);
        m10899a(motionEvent);
    }

    /* renamed from: c */
    private void m10904c() {
        if (this.f6059a != null) {
            clearAnimation();
            this.f6059a = null;
        }
    }

    private boolean getTargetCheckedState() {
        return this.f6045G > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((C1819bu.m11063a(this) ? 1.0f - this.f6045G : this.f6045G) * ((float) getThumbScrollRange())) + 0.5f);
    }

    private int getThumbScrollRange() {
        if (this.f6065o == null) {
            return 0;
        }
        Rect rect = this.f6058T;
        this.f6065o.getPadding(rect);
        Rect a = this.f6060j != null ? C1683ah.m10100a(this.f6060j) : C1683ah.f5633a;
        return ((((this.f6046H - this.f6048J) - rect.left) - rect.right) - a.left) - a.right;
    }

    /* renamed from: a */
    public void mo7225a(Context context, int i) {
        C1807bp a = C1807bp.m10921a(context, i, C1359b.C1371l.TextAppearance);
        ColorStateList g = a.mo7313g(C1359b.C1371l.TextAppearance_android_textColor);
        if (g != null) {
            this.f6054P = g;
        } else {
            this.f6054P = getTextColors();
        }
        int e = a.mo7306e(C1359b.C1371l.TextAppearance_android_textSize, 0);
        if (!(e == 0 || ((float) e) == this.f6053O.getTextSize())) {
            this.f6053O.setTextSize((float) e);
            requestLayout();
        }
        m10898a(a.mo7291a(C1359b.C1371l.TextAppearance_android_typeface, -1), a.mo7291a(C1359b.C1371l.TextAppearance_android_textStyle, -1));
        if (a.mo7295a(C1359b.C1371l.TextAppearance_textAllCaps, false)) {
            this.f6057S = new C1489a(getContext());
        } else {
            this.f6057S = null;
        }
        a.mo7308e();
    }

    /* renamed from: a */
    public void mo7226a(Typeface typeface, int i) {
        boolean z = false;
        if (i > 0) {
            Typeface defaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i) : Typeface.create(typeface, i);
            setSwitchTypeface(defaultFromStyle);
            int style = ((defaultFromStyle != null ? defaultFromStyle.getStyle() : 0) ^ -1) & i;
            TextPaint textPaint = this.f6053O;
            if ((style & 1) != 0) {
                z = true;
            }
            textPaint.setFakeBoldText(z);
            this.f6053O.setTextSkewX((style & 2) != 0 ? -0.25f : 0.0f);
            return;
        }
        this.f6053O.setFakeBoldText(false);
        this.f6053O.setTextSkewX(0.0f);
        setSwitchTypeface(typeface);
    }

    public void draw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        Rect rect = this.f6058T;
        int i4 = this.f6049K;
        int i5 = this.f6050L;
        int i6 = this.f6051M;
        int i7 = this.f6052N;
        int thumbOffset = i4 + getThumbOffset();
        Rect a = this.f6060j != null ? C1683ah.m10100a(this.f6060j) : C1683ah.f5633a;
        if (this.f6065o != null) {
            this.f6065o.getPadding(rect);
            int i8 = rect.left + thumbOffset;
            if (a != null) {
                if (a.left > rect.left) {
                    i4 += a.left - rect.left;
                }
                i3 = a.top > rect.top ? (a.top - rect.top) + i5 : i5;
                if (a.right > rect.right) {
                    i6 -= a.right - rect.right;
                }
                i2 = a.bottom > rect.bottom ? i7 - (a.bottom - rect.bottom) : i7;
            } else {
                i2 = i7;
                i3 = i5;
            }
            this.f6065o.setBounds(i4, i3, i6, i2);
            i = i8;
        } else {
            i = thumbOffset;
        }
        if (this.f6060j != null) {
            this.f6060j.getPadding(rect);
            int i9 = i - rect.left;
            int i10 = i + this.f6048J + rect.right;
            this.f6060j.setBounds(i9, i5, i10, i7);
            Drawable background = getBackground();
            if (background != null) {
                C0484a.m2539a(background, i9, i5, i10, i7);
            }
        }
        super.draw(canvas);
    }

    public void drawableHotspotChanged(float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            super.drawableHotspotChanged(f, f2);
        }
        if (this.f6060j != null) {
            C0484a.m2537a(this.f6060j, f, f2);
        }
        if (this.f6065o != null) {
            C0484a.m2537a(this.f6065o, f, f2);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        boolean z = false;
        Drawable drawable = this.f6060j;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f6065o;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    public int getCompoundPaddingLeft() {
        if (!C1819bu.m11063a(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f6046H;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f6072v : compoundPaddingLeft;
    }

    public int getCompoundPaddingRight() {
        if (C1819bu.m11063a(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f6046H;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f6072v : compoundPaddingRight;
    }

    public boolean getShowText() {
        return this.f6076z;
    }

    public boolean getSplitTrack() {
        return this.f6073w;
    }

    public int getSwitchMinWidth() {
        return this.f6071u;
    }

    public int getSwitchPadding() {
        return this.f6072v;
    }

    public CharSequence getTextOff() {
        return this.f6075y;
    }

    public CharSequence getTextOn() {
        return this.f6074x;
    }

    public Drawable getThumbDrawable() {
        return this.f6060j;
    }

    public int getThumbTextPadding() {
        return this.f6070t;
    }

    @C0003aa
    public ColorStateList getThumbTintList() {
        return this.f6061k;
    }

    @C0003aa
    public PorterDuff.Mode getThumbTintMode() {
        return this.f6062l;
    }

    public Drawable getTrackDrawable() {
        return this.f6065o;
    }

    @C0003aa
    public ColorStateList getTrackTintList() {
        return this.f6066p;
    }

    @C0003aa
    public PorterDuff.Mode getTrackTintMode() {
        return this.f6067q;
    }

    public void jumpDrawablesToCurrentState() {
        if (Build.VERSION.SDK_INT >= 11) {
            super.jumpDrawablesToCurrentState();
            if (this.f6060j != null) {
                this.f6060j.jumpToCurrentState();
            }
            if (this.f6065o != null) {
                this.f6065o.jumpToCurrentState();
            }
            m10904c();
            setThumbPosition(isChecked() ? 1.0f : 0.0f);
        }
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            mergeDrawableStates(onCreateDrawableState, f6030U);
        }
        return onCreateDrawableState;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Rect rect = this.f6058T;
        Drawable drawable = this.f6065o;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.f6050L;
        int i2 = this.f6052N;
        int i3 = i + rect.top;
        int i4 = i2 - rect.bottom;
        Drawable drawable2 = this.f6060j;
        if (drawable != null) {
            if (!this.f6073w || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect a = C1683ah.m10100a(drawable2);
                drawable2.copyBounds(rect);
                rect.left += a.left;
                rect.right -= a.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = getTargetCheckedState() ? this.f6055Q : this.f6056R;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            if (this.f6054P != null) {
                this.f6053O.setColor(this.f6054P.getColorForState(drawableState, 0));
            }
            this.f6053O.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.right + bounds.left;
            } else {
                width = getWidth();
            }
            canvas.translate((float) ((width / 2) - (layout.getWidth() / 2)), (float) (((i3 + i4) / 2) - (layout.getHeight() / 2)));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(f6035f);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        if (Build.VERSION.SDK_INT >= 14) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(f6035f);
            CharSequence charSequence = isChecked() ? this.f6074x : this.f6075y;
            if (!TextUtils.isEmpty(charSequence)) {
                CharSequence text = accessibilityNodeInfo.getText();
                if (TextUtils.isEmpty(text)) {
                    accessibilityNodeInfo.setText(charSequence);
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(text).append(' ').append(charSequence);
                accessibilityNodeInfo.setText(sb);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int height;
        int i8;
        int i9 = 0;
        super.onLayout(z, i, i2, i3, i4);
        if (this.f6060j != null) {
            Rect rect = this.f6058T;
            if (this.f6065o != null) {
                this.f6065o.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect a = C1683ah.m10100a(this.f6060j);
            i5 = Math.max(0, a.left - rect.left);
            i9 = Math.max(0, a.right - rect.right);
        } else {
            i5 = 0;
        }
        if (C1819bu.m11063a(this)) {
            int paddingLeft = getPaddingLeft() + i5;
            i7 = ((this.f6046H + paddingLeft) - i5) - i9;
            i6 = paddingLeft;
        } else {
            int width = (getWidth() - getPaddingRight()) - i9;
            i6 = i9 + i5 + (width - this.f6046H);
            i7 = width;
        }
        switch (getGravity() & 112) {
            case 16:
                i8 = (((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2) - (this.f6047I / 2);
                height = this.f6047I + i8;
                break;
            case 80:
                height = getHeight() - getPaddingBottom();
                i8 = height - this.f6047I;
                break;
            default:
                i8 = getPaddingTop();
                height = this.f6047I + i8;
                break;
        }
        this.f6049K = i6;
        this.f6050L = i8;
        this.f6052N = height;
        this.f6051M = i7;
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5 = 0;
        if (this.f6076z) {
            if (this.f6055Q == null) {
                this.f6055Q = m10896a(this.f6074x);
            }
            if (this.f6056R == null) {
                this.f6056R = m10896a(this.f6075y);
            }
        }
        Rect rect = this.f6058T;
        if (this.f6060j != null) {
            this.f6060j.getPadding(rect);
            i4 = (this.f6060j.getIntrinsicWidth() - rect.left) - rect.right;
            i3 = this.f6060j.getIntrinsicHeight();
        } else {
            i3 = 0;
            i4 = 0;
        }
        this.f6048J = Math.max(this.f6076z ? Math.max(this.f6055Q.getWidth(), this.f6056R.getWidth()) + (this.f6070t * 2) : 0, i4);
        if (this.f6065o != null) {
            this.f6065o.getPadding(rect);
            i5 = this.f6065o.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i6 = rect.left;
        int i7 = rect.right;
        if (this.f6060j != null) {
            Rect a = C1683ah.m10100a(this.f6060j);
            i6 = Math.max(i6, a.left);
            i7 = Math.max(i7, a.right);
        }
        int max = Math.max(this.f6071u, i7 + i6 + (this.f6048J * 2));
        int max2 = Math.max(i5, i3);
        this.f6046H = max;
        this.f6047I = max2;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(C1040ar.m5954n(this), max2);
        }
    }

    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f6074x : this.f6075y;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f6043E.addMovement(motionEvent);
        switch (C1200x.m7131a(motionEvent)) {
            case 0:
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (isEnabled() && m10901a(x, y)) {
                    this.f6039A = 1;
                    this.f6041C = x;
                    this.f6042D = y;
                    break;
                }
            case 1:
            case 3:
                if (this.f6039A != 2) {
                    this.f6039A = 0;
                    this.f6043E.clear();
                    break;
                } else {
                    m10903b(motionEvent);
                    super.onTouchEvent(motionEvent);
                    return true;
                }
            case 2:
                switch (this.f6039A) {
                    case 1:
                        float x2 = motionEvent.getX();
                        float y2 = motionEvent.getY();
                        if (Math.abs(x2 - this.f6041C) > ((float) this.f6040B) || Math.abs(y2 - this.f6042D) > ((float) this.f6040B)) {
                            this.f6039A = 2;
                            getParent().requestDisallowInterceptTouchEvent(true);
                            this.f6041C = x2;
                            this.f6042D = y2;
                            return true;
                        }
                    case 2:
                        float x3 = motionEvent.getX();
                        int thumbScrollRange = getThumbScrollRange();
                        float f = x3 - this.f6041C;
                        float f2 = thumbScrollRange != 0 ? f / ((float) thumbScrollRange) : f > 0.0f ? 1.0f : -1.0f;
                        if (C1819bu.m11063a(this)) {
                            f2 = -f2;
                        }
                        float a = m10895a(f2 + this.f6045G, 0.0f, 1.0f);
                        if (a != this.f6045G) {
                            this.f6041C = x3;
                            setThumbPosition(a);
                        }
                        return true;
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean isChecked = isChecked();
        if (getWindowToken() == null || !C1040ar.m5876Z(this) || !isShown()) {
            m10904c();
            setThumbPosition(isChecked ? 1.0f : 0.0f);
            return;
        }
        m10900a(isChecked);
    }

    public void setShowText(boolean z) {
        if (this.f6076z != z) {
            this.f6076z = z;
            requestLayout();
        }
    }

    public void setSplitTrack(boolean z) {
        this.f6073w = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.f6071u = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.f6072v = i;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if (this.f6053O.getTypeface() != typeface) {
            this.f6053O.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }

    public void setTextOff(CharSequence charSequence) {
        this.f6075y = charSequence;
        requestLayout();
    }

    public void setTextOn(CharSequence charSequence) {
        this.f6074x = charSequence;
        requestLayout();
    }

    public void setThumbDrawable(Drawable drawable) {
        if (this.f6060j != null) {
            this.f6060j.setCallback((Drawable.Callback) null);
        }
        this.f6060j = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    public void setThumbPosition(float f) {
        this.f6045G = f;
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(C1477b.m8692b(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.f6070t = i;
        requestLayout();
    }

    public void setThumbTintList(@C0003aa ColorStateList colorStateList) {
        this.f6061k = colorStateList;
        this.f6063m = true;
        m10902b();
    }

    public void setThumbTintMode(@C0003aa PorterDuff.Mode mode) {
        this.f6062l = mode;
        this.f6064n = true;
        m10902b();
    }

    public void setTrackDrawable(Drawable drawable) {
        if (this.f6065o != null) {
            this.f6065o.setCallback((Drawable.Callback) null);
        }
        this.f6065o = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(C1477b.m8692b(getContext(), i));
    }

    public void setTrackTintList(@C0003aa ColorStateList colorStateList) {
        this.f6066p = colorStateList;
        this.f6068r = true;
        m10897a();
    }

    public void setTrackTintMode(@C0003aa PorterDuff.Mode mode) {
        this.f6067q = mode;
        this.f6069s = true;
        m10897a();
    }

    public void toggle() {
        setChecked(!isChecked());
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f6060j || drawable == this.f6065o;
    }
}
