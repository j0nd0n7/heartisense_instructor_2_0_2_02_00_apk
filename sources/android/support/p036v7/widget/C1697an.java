package android.support.p036v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.C0011ag;
import android.support.p010v4.view.C1040ar;
import android.support.p010v4.view.C1161h;
import android.support.p010v4.view.C1166j;
import android.support.p036v7.p037a.C1359b;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: android.support.v7.widget.an */
public class C1697an extends ViewGroup {

    /* renamed from: e */
    public static final int f5686e = 0;

    /* renamed from: f */
    public static final int f5687f = 1;

    /* renamed from: g */
    public static final int f5688g = 0;

    /* renamed from: h */
    public static final int f5689h = 1;

    /* renamed from: i */
    public static final int f5690i = 2;

    /* renamed from: j */
    public static final int f5691j = 4;

    /* renamed from: q */
    private static final int f5692q = 4;

    /* renamed from: r */
    private static final int f5693r = 0;

    /* renamed from: s */
    private static final int f5694s = 1;

    /* renamed from: t */
    private static final int f5695t = 2;

    /* renamed from: u */
    private static final int f5696u = 3;

    /* renamed from: a */
    private boolean f5697a;

    /* renamed from: b */
    private int f5698b;

    /* renamed from: c */
    private int f5699c;

    /* renamed from: d */
    private int f5700d;

    /* renamed from: k */
    private int f5701k;

    /* renamed from: l */
    private int f5702l;

    /* renamed from: m */
    private float f5703m;

    /* renamed from: n */
    private boolean f5704n;

    /* renamed from: o */
    private int[] f5705o;

    /* renamed from: p */
    private int[] f5706p;

    /* renamed from: v */
    private Drawable f5707v;

    /* renamed from: w */
    private int f5708w;

    /* renamed from: x */
    private int f5709x;

    /* renamed from: y */
    private int f5710y;

    /* renamed from: z */
    private int f5711z;

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: android.support.v7.widget.an$a */
    public @interface C1698a {
    }

    /* renamed from: android.support.v7.widget.an$b */
    public static class C1699b extends ViewGroup.MarginLayoutParams {

        /* renamed from: g */
        public float f5712g;

        /* renamed from: h */
        public int f5713h;

        public C1699b(int i, int i2) {
            super(i, i2);
            this.f5713h = -1;
            this.f5712g = 0.0f;
        }

        public C1699b(int i, int i2, float f) {
            super(i, i2);
            this.f5713h = -1;
            this.f5712g = f;
        }

        public C1699b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f5713h = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1359b.C1371l.LinearLayoutCompat_Layout);
            this.f5712g = obtainStyledAttributes.getFloat(C1359b.C1371l.LinearLayoutCompat_Layout_android_layout_weight, 0.0f);
            this.f5713h = obtainStyledAttributes.getInt(C1359b.C1371l.LinearLayoutCompat_Layout_android_layout_gravity, -1);
            obtainStyledAttributes.recycle();
        }

        public C1699b(C1699b bVar) {
            super(bVar);
            this.f5713h = -1;
            this.f5712g = bVar.f5712g;
            this.f5713h = bVar.f5713h;
        }

        public C1699b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f5713h = -1;
        }

        public C1699b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f5713h = -1;
        }
    }

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: android.support.v7.widget.an$c */
    public @interface C1700c {
    }

    public C1697an(Context context) {
        this(context, (AttributeSet) null);
    }

    public C1697an(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C1697an(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5697a = true;
        this.f5698b = -1;
        this.f5699c = 0;
        this.f5701k = 8388659;
        C1807bp a = C1807bp.m10923a(context, attributeSet, C1359b.C1371l.LinearLayoutCompat, i, 0);
        int a2 = a.mo7291a(C1359b.C1371l.LinearLayoutCompat_android_orientation, -1);
        if (a2 >= 0) {
            setOrientation(a2);
        }
        int a3 = a.mo7291a(C1359b.C1371l.LinearLayoutCompat_android_gravity, -1);
        if (a3 >= 0) {
            setGravity(a3);
        }
        boolean a4 = a.mo7295a(C1359b.C1371l.LinearLayoutCompat_android_baselineAligned, true);
        if (!a4) {
            setBaselineAligned(a4);
        }
        this.f5703m = a.mo7288a(C1359b.C1371l.LinearLayoutCompat_android_weightSum, -1.0f);
        this.f5698b = a.mo7291a(C1359b.C1371l.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        this.f5704n = a.mo7295a(C1359b.C1371l.LinearLayoutCompat_measureWithLargestChild, false);
        setDividerDrawable(a.mo7293a(C1359b.C1371l.LinearLayoutCompat_divider));
        this.f5710y = a.mo7291a(C1359b.C1371l.LinearLayoutCompat_showDividers, 0);
        this.f5711z = a.mo7306e(C1359b.C1371l.LinearLayoutCompat_dividerPadding, 0);
        a.mo7308e();
    }

    /* renamed from: a */
    private void m10143a(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i + i3, i2 + i4);
    }

    /* renamed from: c */
    private void m10144c(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View b = mo6401b(i3);
            if (b.getVisibility() != 8) {
                C1699b bVar = (C1699b) b.getLayoutParams();
                if (bVar.width == -1) {
                    int i4 = bVar.height;
                    bVar.height = b.getMeasuredHeight();
                    measureChildWithMargins(b, makeMeasureSpec, 0, i2, 0);
                    bVar.height = i4;
                }
            }
        }
    }

    /* renamed from: d */
    private void m10145d(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View b = mo6401b(i3);
            if (b.getVisibility() != 8) {
                C1699b bVar = (C1699b) b.getLayoutParams();
                if (bVar.height == -1) {
                    int i4 = bVar.width;
                    bVar.width = b.getMeasuredWidth();
                    measureChildWithMargins(b, i2, 0, makeMeasureSpec, 0);
                    bVar.width = i4;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo6393a(View view) {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo6394a(View view, int i) {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo6395a(int i, int i2) {
        int i3;
        int i4;
        float f;
        int i5;
        int i6;
        boolean z;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z2;
        boolean z3;
        int max;
        int i11;
        boolean z4;
        int i12;
        int i13;
        int i14;
        this.f5702l = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        boolean z5 = true;
        float f2 = 0.0f;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        boolean z6 = false;
        boolean z7 = false;
        int i19 = this.f5698b;
        boolean z8 = this.f5704n;
        int i20 = Integer.MIN_VALUE;
        int i21 = 0;
        while (i21 < virtualChildCount) {
            View b = mo6401b(i21);
            if (b == null) {
                this.f5702l += mo6407d(i21);
                i13 = i20;
                z4 = z7;
                z3 = z5;
                i14 = i16;
                i12 = i15;
            } else if (b.getVisibility() == 8) {
                i21 += mo6394a(b, i21);
                i13 = i20;
                z4 = z7;
                z3 = z5;
                i14 = i16;
                i12 = i15;
            } else {
                if (mo6406c(i21)) {
                    this.f5702l += this.f5709x;
                }
                C1699b bVar = (C1699b) b.getLayoutParams();
                float f3 = f2 + bVar.f5712g;
                if (mode2 == 1073741824 && bVar.height == 0 && bVar.f5712g > 0.0f) {
                    int i22 = this.f5702l;
                    this.f5702l = Math.max(i22, bVar.topMargin + i22 + bVar.bottomMargin);
                    z7 = true;
                } else {
                    int i23 = Integer.MIN_VALUE;
                    if (bVar.height == 0 && bVar.f5712g > 0.0f) {
                        i23 = 0;
                        bVar.height = -2;
                    }
                    int i24 = i23;
                    mo6399a(b, i21, i, 0, i2, f3 == 0.0f ? this.f5702l : 0);
                    if (i24 != Integer.MIN_VALUE) {
                        bVar.height = i24;
                    }
                    int measuredHeight = b.getMeasuredHeight();
                    int i25 = this.f5702l;
                    this.f5702l = Math.max(i25, i25 + measuredHeight + bVar.topMargin + bVar.bottomMargin + mo6400b(b));
                    if (z8) {
                        i20 = Math.max(measuredHeight, i20);
                    }
                }
                if (i19 >= 0 && i19 == i21 + 1) {
                    this.f5699c = this.f5702l;
                }
                if (i21 >= i19 || bVar.f5712g <= 0.0f) {
                    boolean z9 = false;
                    if (mode == 1073741824 || bVar.width != -1) {
                        z2 = z6;
                    } else {
                        z2 = true;
                        z9 = true;
                    }
                    int i26 = bVar.rightMargin + bVar.leftMargin;
                    int measuredWidth = b.getMeasuredWidth() + i26;
                    int max2 = Math.max(i15, measuredWidth);
                    int a = C1819bu.m11061a(i16, C1040ar.m5958p(b));
                    z3 = z5 && bVar.width == -1;
                    if (bVar.f5712g > 0.0f) {
                        i11 = Math.max(i18, z9 ? i26 : measuredWidth);
                        max = i17;
                    } else {
                        if (!z9) {
                            i26 = measuredWidth;
                        }
                        max = Math.max(i17, i26);
                        i11 = i18;
                    }
                    i21 += mo6394a(b, i21);
                    z4 = z7;
                    i18 = i11;
                    i17 = max;
                    i12 = max2;
                    i13 = i20;
                    i14 = a;
                    z6 = z2;
                    f2 = f3;
                } else {
                    throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                }
            }
            i21++;
            i20 = i13;
            z7 = z4;
            z5 = z3;
            i16 = i14;
            i15 = i12;
        }
        if (this.f5702l > 0 && mo6406c(virtualChildCount)) {
            this.f5702l += this.f5709x;
        }
        if (z8 && (mode2 == Integer.MIN_VALUE || mode2 == 0)) {
            this.f5702l = 0;
            int i27 = 0;
            while (i27 < virtualChildCount) {
                View b2 = mo6401b(i27);
                if (b2 == null) {
                    this.f5702l += mo6407d(i27);
                    i10 = i27;
                } else if (b2.getVisibility() == 8) {
                    i10 = mo6394a(b2, i27) + i27;
                } else {
                    C1699b bVar2 = (C1699b) b2.getLayoutParams();
                    int i28 = this.f5702l;
                    this.f5702l = Math.max(i28, bVar2.bottomMargin + i28 + i20 + bVar2.topMargin + mo6400b(b2));
                    i10 = i27;
                }
                i27 = i10 + 1;
            }
        }
        this.f5702l += getPaddingTop() + getPaddingBottom();
        int a2 = C1040ar.m5878a(Math.max(this.f5702l, getSuggestedMinimumHeight()), i2, 0);
        int i29 = (16777215 & a2) - this.f5702l;
        if (z7 || (i29 != 0 && f2 > 0.0f)) {
            if (this.f5703m > 0.0f) {
                f2 = this.f5703m;
            }
            this.f5702l = 0;
            int i30 = 0;
            float f4 = f2;
            boolean z10 = z5;
            int i31 = i17;
            int i32 = i16;
            int i33 = i15;
            int i34 = i29;
            while (i30 < virtualChildCount) {
                View b3 = mo6401b(i30);
                if (b3.getVisibility() == 8) {
                    i7 = i31;
                    i9 = i32;
                    i8 = i33;
                    z = z10;
                } else {
                    C1699b bVar3 = (C1699b) b3.getLayoutParams();
                    float f5 = bVar3.f5712g;
                    if (f5 > 0.0f) {
                        int i35 = (int) ((((float) i34) * f5) / f4);
                        float f6 = f4 - f5;
                        int i36 = i34 - i35;
                        int childMeasureSpec = getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + bVar3.leftMargin + bVar3.rightMargin, bVar3.width);
                        if (bVar3.height == 0 && mode2 == 1073741824) {
                            if (i35 <= 0) {
                                i35 = 0;
                            }
                            b3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i35, 1073741824));
                        } else {
                            int measuredHeight2 = i35 + b3.getMeasuredHeight();
                            if (measuredHeight2 < 0) {
                                measuredHeight2 = 0;
                            }
                            b3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
                        }
                        float f7 = f6;
                        i5 = i36;
                        i6 = C1819bu.m11061a(i32, C1040ar.m5958p(b3) & C1166j.f3630t);
                        f = f7;
                    } else {
                        f = f4;
                        i5 = i34;
                        i6 = i32;
                    }
                    int i37 = bVar3.leftMargin + bVar3.rightMargin;
                    int measuredWidth2 = b3.getMeasuredWidth() + i37;
                    int max3 = Math.max(i33, measuredWidth2);
                    if (!(mode != 1073741824 && bVar3.width == -1)) {
                        i37 = measuredWidth2;
                    }
                    int max4 = Math.max(i31, i37);
                    z = z10 && bVar3.width == -1;
                    int i38 = this.f5702l;
                    this.f5702l = Math.max(i38, bVar3.bottomMargin + b3.getMeasuredHeight() + i38 + bVar3.topMargin + mo6400b(b3));
                    i7 = max4;
                    i8 = max3;
                    float f8 = f;
                    i9 = i6;
                    i34 = i5;
                    f4 = f8;
                }
                i30++;
                i31 = i7;
                i33 = i8;
                z10 = z;
                i32 = i9;
            }
            this.f5702l += getPaddingTop() + getPaddingBottom();
            z5 = z10;
            i4 = i31;
            i16 = i32;
            i3 = i33;
        } else {
            int max5 = Math.max(i17, i18);
            if (z8 && mode2 != 1073741824) {
                int i39 = 0;
                while (true) {
                    int i40 = i39;
                    if (i40 >= virtualChildCount) {
                        break;
                    }
                    View b4 = mo6401b(i40);
                    if (!(b4 == null || b4.getVisibility() == 8 || ((C1699b) b4.getLayoutParams()).f5712g <= 0.0f)) {
                        b4.measure(View.MeasureSpec.makeMeasureSpec(b4.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i20, 1073741824));
                    }
                    i39 = i40 + 1;
                }
            }
            i4 = max5;
            i3 = i15;
        }
        if (z5 || mode == 1073741824) {
            i4 = i3;
        }
        setMeasuredDimension(C1040ar.m5878a(Math.max(i4 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, i16), a2);
        if (z6) {
            m10144c(virtualChildCount, i2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo6396a(int i, int i2, int i3, int i4) {
        int paddingTop;
        int i5;
        int i6;
        int paddingLeft = getPaddingLeft();
        int i7 = i3 - i;
        int paddingRight = i7 - getPaddingRight();
        int paddingRight2 = (i7 - paddingLeft) - getPaddingRight();
        int virtualChildCount = getVirtualChildCount();
        int i8 = this.f5701k & 112;
        int i9 = this.f5701k & C1161h.f3610e;
        switch (i8) {
            case 16:
                paddingTop = getPaddingTop() + (((i4 - i2) - this.f5702l) / 2);
                break;
            case 80:
                paddingTop = ((getPaddingTop() + i4) - i2) - this.f5702l;
                break;
            default:
                paddingTop = getPaddingTop();
                break;
        }
        int i10 = 0;
        int i11 = paddingTop;
        while (i10 < virtualChildCount) {
            View b = mo6401b(i10);
            if (b == null) {
                i11 += mo6407d(i10);
                i5 = i10;
            } else if (b.getVisibility() != 8) {
                int measuredWidth = b.getMeasuredWidth();
                int measuredHeight = b.getMeasuredHeight();
                C1699b bVar = (C1699b) b.getLayoutParams();
                int i12 = bVar.f5713h;
                if (i12 < 0) {
                    i12 = i9;
                }
                switch (C1161h.m6976a(i12, C1040ar.m5947k(this)) & 7) {
                    case 1:
                        i6 = ((((paddingRight2 - measuredWidth) / 2) + paddingLeft) + bVar.leftMargin) - bVar.rightMargin;
                        break;
                    case 5:
                        i6 = (paddingRight - measuredWidth) - bVar.rightMargin;
                        break;
                    default:
                        i6 = paddingLeft + bVar.leftMargin;
                        break;
                }
                int i13 = (mo6406c(i10) ? this.f5709x + i11 : i11) + bVar.topMargin;
                m10143a(b, i6, i13 + mo6393a(b), measuredWidth, measuredHeight);
                i11 = i13 + bVar.bottomMargin + measuredHeight + mo6400b(b);
                i5 = mo6394a(b, i10) + i10;
            } else {
                i5 = i10;
            }
            i10 = i5 + 1;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo6397a(Canvas canvas) {
        int bottom;
        int virtualChildCount = getVirtualChildCount();
        for (int i = 0; i < virtualChildCount; i++) {
            View b = mo6401b(i);
            if (!(b == null || b.getVisibility() == 8 || !mo6406c(i))) {
                mo6398a(canvas, (b.getTop() - ((C1699b) b.getLayoutParams()).topMargin) - this.f5709x);
            }
        }
        if (mo6406c(virtualChildCount)) {
            View b2 = mo6401b(virtualChildCount - 1);
            if (b2 == null) {
                bottom = (getHeight() - getPaddingBottom()) - this.f5709x;
            } else {
                bottom = ((C1699b) b2.getLayoutParams()).bottomMargin + b2.getBottom();
            }
            mo6398a(canvas, bottom);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo6398a(Canvas canvas, int i) {
        this.f5707v.setBounds(getPaddingLeft() + this.f5711z, i, (getWidth() - getPaddingRight()) - this.f5711z, this.f5709x + i);
        this.f5707v.draw(canvas);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo6399a(View view, int i, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo6400b(View view) {
        return 0;
    }

    /* renamed from: b */
    public C1699b generateLayoutParams(AttributeSet attributeSet) {
        return new C1699b(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C1699b generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C1699b(layoutParams);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public View mo6401b(int i) {
        return getChildAt(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo6402b(int i, int i2) {
        int i3;
        int i4;
        float f;
        int i5;
        int i6;
        int i7;
        boolean z;
        int i8;
        int i9;
        float f2;
        int baseline;
        int i10;
        boolean z2;
        boolean z3;
        int max;
        int i11;
        boolean z4;
        int i12;
        int i13;
        int i14;
        this.f5702l = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        boolean z5 = true;
        float f3 = 0.0f;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        boolean z6 = false;
        boolean z7 = false;
        if (this.f5705o == null || this.f5706p == null) {
            this.f5705o = new int[4];
            this.f5706p = new int[4];
        }
        int[] iArr = this.f5705o;
        int[] iArr2 = this.f5706p;
        iArr[3] = -1;
        iArr[2] = -1;
        iArr[1] = -1;
        iArr[0] = -1;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        boolean z8 = this.f5697a;
        boolean z9 = this.f5704n;
        boolean z10 = mode == 1073741824;
        int i19 = Integer.MIN_VALUE;
        int i20 = 0;
        while (i20 < virtualChildCount) {
            View b = mo6401b(i20);
            if (b == null) {
                this.f5702l += mo6407d(i20);
                i13 = i19;
                z4 = z7;
                z3 = z5;
                i14 = i16;
                i12 = i15;
            } else if (b.getVisibility() == 8) {
                i20 += mo6394a(b, i20);
                i13 = i19;
                z4 = z7;
                z3 = z5;
                i14 = i16;
                i12 = i15;
            } else {
                if (mo6406c(i20)) {
                    this.f5702l += this.f5708w;
                }
                C1699b bVar = (C1699b) b.getLayoutParams();
                float f4 = f3 + bVar.f5712g;
                if (mode == 1073741824 && bVar.width == 0 && bVar.f5712g > 0.0f) {
                    if (z10) {
                        this.f5702l += bVar.leftMargin + bVar.rightMargin;
                    } else {
                        int i21 = this.f5702l;
                        this.f5702l = Math.max(i21, bVar.leftMargin + i21 + bVar.rightMargin);
                    }
                    if (z8) {
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                        b.measure(makeMeasureSpec, makeMeasureSpec);
                    } else {
                        z7 = true;
                    }
                } else {
                    int i22 = Integer.MIN_VALUE;
                    if (bVar.width == 0 && bVar.f5712g > 0.0f) {
                        i22 = 0;
                        bVar.width = -2;
                    }
                    int i23 = i22;
                    mo6399a(b, i20, i, f4 == 0.0f ? this.f5702l : 0, i2, 0);
                    if (i23 != Integer.MIN_VALUE) {
                        bVar.width = i23;
                    }
                    int measuredWidth = b.getMeasuredWidth();
                    if (z10) {
                        this.f5702l += bVar.leftMargin + measuredWidth + bVar.rightMargin + mo6400b(b);
                    } else {
                        int i24 = this.f5702l;
                        this.f5702l = Math.max(i24, i24 + measuredWidth + bVar.leftMargin + bVar.rightMargin + mo6400b(b));
                    }
                    if (z9) {
                        i19 = Math.max(measuredWidth, i19);
                    }
                }
                boolean z11 = false;
                if (mode2 == 1073741824 || bVar.height != -1) {
                    z2 = z6;
                } else {
                    z2 = true;
                    z11 = true;
                }
                int i25 = bVar.bottomMargin + bVar.topMargin;
                int measuredHeight = b.getMeasuredHeight() + i25;
                int a = C1819bu.m11061a(i16, C1040ar.m5958p(b));
                if (z8) {
                    int baseline2 = b.getBaseline();
                    if (baseline2 != -1) {
                        int i26 = ((((bVar.f5713h < 0 ? this.f5701k : bVar.f5713h) & 112) >> 4) & -2) >> 1;
                        iArr[i26] = Math.max(iArr[i26], baseline2);
                        iArr2[i26] = Math.max(iArr2[i26], measuredHeight - baseline2);
                    }
                }
                int max2 = Math.max(i15, measuredHeight);
                z3 = z5 && bVar.height == -1;
                if (bVar.f5712g > 0.0f) {
                    i11 = Math.max(i18, z11 ? i25 : measuredHeight);
                    max = i17;
                } else {
                    if (!z11) {
                        i25 = measuredHeight;
                    }
                    max = Math.max(i17, i25);
                    i11 = i18;
                }
                i20 += mo6394a(b, i20);
                z4 = z7;
                i18 = i11;
                i17 = max;
                i12 = max2;
                i13 = i19;
                i14 = a;
                z6 = z2;
                f3 = f4;
            }
            i20++;
            i19 = i13;
            z7 = z4;
            z5 = z3;
            i16 = i14;
            i15 = i12;
        }
        if (this.f5702l > 0 && mo6406c(virtualChildCount)) {
            this.f5702l += this.f5708w;
        }
        int max3 = (iArr[1] == -1 && iArr[0] == -1 && iArr[2] == -1 && iArr[3] == -1) ? i15 : Math.max(i15, Math.max(iArr[3], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))) + Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))));
        if (z9 && (mode == Integer.MIN_VALUE || mode == 0)) {
            this.f5702l = 0;
            int i27 = 0;
            while (i27 < virtualChildCount) {
                View b2 = mo6401b(i27);
                if (b2 == null) {
                    this.f5702l += mo6407d(i27);
                    i10 = i27;
                } else if (b2.getVisibility() == 8) {
                    i10 = mo6394a(b2, i27) + i27;
                } else {
                    C1699b bVar2 = (C1699b) b2.getLayoutParams();
                    if (z10) {
                        this.f5702l = bVar2.rightMargin + bVar2.leftMargin + i19 + mo6400b(b2) + this.f5702l;
                        i10 = i27;
                    } else {
                        int i28 = this.f5702l;
                        this.f5702l = Math.max(i28, bVar2.rightMargin + i28 + i19 + bVar2.leftMargin + mo6400b(b2));
                        i10 = i27;
                    }
                }
                i27 = i10 + 1;
            }
        }
        this.f5702l += getPaddingLeft() + getPaddingRight();
        int a2 = C1040ar.m5878a(Math.max(this.f5702l, getSuggestedMinimumWidth()), i, 0);
        int i29 = (16777215 & a2) - this.f5702l;
        if (z7 || (i29 != 0 && f3 > 0.0f)) {
            if (this.f5703m > 0.0f) {
                f3 = this.f5703m;
            }
            iArr[3] = -1;
            iArr[2] = -1;
            iArr[1] = -1;
            iArr[0] = -1;
            iArr2[3] = -1;
            iArr2[2] = -1;
            iArr2[1] = -1;
            iArr2[0] = -1;
            this.f5702l = 0;
            int i30 = 0;
            float f5 = f3;
            boolean z12 = z5;
            int i31 = i17;
            int i32 = i16;
            int i33 = i29;
            int i34 = -1;
            while (i30 < virtualChildCount) {
                View b3 = mo6401b(i30);
                if (b3 == null) {
                    f = f5;
                    i5 = i33;
                    i6 = i34;
                    i7 = i31;
                    z = z12;
                } else if (b3.getVisibility() == 8) {
                    f = f5;
                    i5 = i33;
                    i6 = i34;
                    i7 = i31;
                    z = z12;
                } else {
                    C1699b bVar3 = (C1699b) b3.getLayoutParams();
                    float f6 = bVar3.f5712g;
                    if (f6 > 0.0f) {
                        int i35 = (int) ((((float) i33) * f6) / f5);
                        float f7 = f5 - f6;
                        i8 = i33 - i35;
                        int childMeasureSpec = getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom() + bVar3.topMargin + bVar3.bottomMargin, bVar3.height);
                        if (bVar3.width == 0 && mode == 1073741824) {
                            if (i35 <= 0) {
                                i35 = 0;
                            }
                            b3.measure(View.MeasureSpec.makeMeasureSpec(i35, 1073741824), childMeasureSpec);
                        } else {
                            int measuredWidth2 = i35 + b3.getMeasuredWidth();
                            if (measuredWidth2 < 0) {
                                measuredWidth2 = 0;
                            }
                            b3.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824), childMeasureSpec);
                        }
                        i9 = C1819bu.m11061a(i32, C1040ar.m5958p(b3) & C1040ar.f3485s);
                        f2 = f7;
                    } else {
                        i8 = i33;
                        i9 = i32;
                        f2 = f5;
                    }
                    if (z10) {
                        this.f5702l += b3.getMeasuredWidth() + bVar3.leftMargin + bVar3.rightMargin + mo6400b(b3);
                    } else {
                        int i36 = this.f5702l;
                        this.f5702l = Math.max(i36, b3.getMeasuredWidth() + i36 + bVar3.leftMargin + bVar3.rightMargin + mo6400b(b3));
                    }
                    boolean z13 = mode2 != 1073741824 && bVar3.height == -1;
                    int i37 = bVar3.topMargin + bVar3.bottomMargin;
                    int measuredHeight2 = b3.getMeasuredHeight() + i37;
                    int max4 = Math.max(i34, measuredHeight2);
                    int max5 = Math.max(i31, z13 ? i37 : measuredHeight2);
                    boolean z14 = z12 && bVar3.height == -1;
                    if (z8 && (baseline = b3.getBaseline()) != -1) {
                        int i38 = ((((bVar3.f5713h < 0 ? this.f5701k : bVar3.f5713h) & 112) >> 4) & -2) >> 1;
                        iArr[i38] = Math.max(iArr[i38], baseline);
                        iArr2[i38] = Math.max(iArr2[i38], measuredHeight2 - baseline);
                    }
                    f = f2;
                    i7 = max5;
                    z = z14;
                    i32 = i9;
                    i5 = i8;
                    i6 = max4;
                }
                i30++;
                i31 = i7;
                i34 = i6;
                z12 = z;
                i33 = i5;
                f5 = f;
            }
            this.f5702l += getPaddingLeft() + getPaddingRight();
            if (!(iArr[1] == -1 && iArr[0] == -1 && iArr[2] == -1 && iArr[3] == -1)) {
                i34 = Math.max(i34, Math.max(iArr[3], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))) + Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))));
            }
            z5 = z12;
            i4 = i31;
            i16 = i32;
            i3 = i34;
        } else {
            int max6 = Math.max(i17, i18);
            if (z9 && mode != 1073741824) {
                int i39 = 0;
                while (true) {
                    int i40 = i39;
                    if (i40 >= virtualChildCount) {
                        break;
                    }
                    View b4 = mo6401b(i40);
                    if (!(b4 == null || b4.getVisibility() == 8 || ((C1699b) b4.getLayoutParams()).f5712g <= 0.0f)) {
                        b4.measure(View.MeasureSpec.makeMeasureSpec(i19, 1073741824), View.MeasureSpec.makeMeasureSpec(b4.getMeasuredHeight(), 1073741824));
                    }
                    i39 = i40 + 1;
                }
            }
            i4 = max6;
            i3 = max3;
        }
        if (z5 || mode2 == 1073741824) {
            i4 = i3;
        }
        setMeasuredDimension((-16777216 & i16) | a2, C1040ar.m5878a(Math.max(i4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, i16 << 16));
        if (z6) {
            m10145d(virtualChildCount, i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo6403b(int i, int i2, int i3, int i4) {
        int paddingLeft;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean a = C1819bu.m11063a(this);
        int paddingTop = getPaddingTop();
        int i9 = i4 - i2;
        int paddingBottom = i9 - getPaddingBottom();
        int paddingBottom2 = (i9 - paddingTop) - getPaddingBottom();
        int virtualChildCount = getVirtualChildCount();
        int i10 = this.f5701k & C1161h.f3610e;
        int i11 = this.f5701k & 112;
        boolean z = this.f5697a;
        int[] iArr = this.f5705o;
        int[] iArr2 = this.f5706p;
        switch (C1161h.m6976a(i10, C1040ar.m5947k(this))) {
            case 1:
                paddingLeft = getPaddingLeft() + (((i3 - i) - this.f5702l) / 2);
                break;
            case 5:
                paddingLeft = ((getPaddingLeft() + i3) - i) - this.f5702l;
                break;
            default:
                paddingLeft = getPaddingLeft();
                break;
        }
        if (a) {
            i5 = -1;
            i6 = virtualChildCount - 1;
        } else {
            i5 = 1;
            i6 = 0;
        }
        int i12 = 0;
        while (i12 < virtualChildCount) {
            int i13 = i6 + (i5 * i12);
            View b = mo6401b(i13);
            if (b == null) {
                paddingLeft += mo6407d(i13);
                i7 = i12;
            } else if (b.getVisibility() != 8) {
                int measuredWidth = b.getMeasuredWidth();
                int measuredHeight = b.getMeasuredHeight();
                C1699b bVar = (C1699b) b.getLayoutParams();
                int baseline = (!z || bVar.height == -1) ? -1 : b.getBaseline();
                int i14 = bVar.f5713h;
                if (i14 < 0) {
                    i14 = i11;
                }
                switch (i14 & 112) {
                    case 16:
                        i8 = ((((paddingBottom2 - measuredHeight) / 2) + paddingTop) + bVar.topMargin) - bVar.bottomMargin;
                        break;
                    case 48:
                        i8 = paddingTop + bVar.topMargin;
                        if (baseline != -1) {
                            i8 += iArr[1] - baseline;
                            break;
                        }
                        break;
                    case 80:
                        i8 = (paddingBottom - measuredHeight) - bVar.bottomMargin;
                        if (baseline != -1) {
                            i8 -= iArr2[2] - (b.getMeasuredHeight() - baseline);
                            break;
                        }
                        break;
                    default:
                        i8 = paddingTop;
                        break;
                }
                int i15 = (mo6406c(i13) ? this.f5708w + paddingLeft : paddingLeft) + bVar.leftMargin;
                m10143a(b, i15 + mo6393a(b), i8, measuredWidth, measuredHeight);
                paddingLeft = i15 + bVar.rightMargin + measuredWidth + mo6400b(b);
                i7 = mo6394a(b, i13) + i12;
            } else {
                i7 = i12;
            }
            i12 = i7 + 1;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo6404b(Canvas canvas) {
        int left;
        int virtualChildCount = getVirtualChildCount();
        boolean a = C1819bu.m11063a(this);
        for (int i = 0; i < virtualChildCount; i++) {
            View b = mo6401b(i);
            if (!(b == null || b.getVisibility() == 8 || !mo6406c(i))) {
                C1699b bVar = (C1699b) b.getLayoutParams();
                mo6405b(canvas, a ? bVar.rightMargin + b.getRight() : (b.getLeft() - bVar.leftMargin) - this.f5708w);
            }
        }
        if (mo6406c(virtualChildCount)) {
            View b2 = mo6401b(virtualChildCount - 1);
            if (b2 == null) {
                left = a ? getPaddingLeft() : (getWidth() - getPaddingRight()) - this.f5708w;
            } else {
                C1699b bVar2 = (C1699b) b2.getLayoutParams();
                left = a ? (b2.getLeft() - bVar2.leftMargin) - this.f5708w : bVar2.rightMargin + b2.getRight();
            }
            mo6405b(canvas, left);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo6405b(Canvas canvas, int i) {
        this.f5707v.setBounds(i, getPaddingTop() + this.f5711z, this.f5708w + i, (getHeight() - getPaddingBottom()) - this.f5711z);
        this.f5707v.draw(canvas);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo6406c(int i) {
        if (i == 0) {
            return (this.f5710y & 1) != 0;
        }
        if (i == getChildCount()) {
            return (this.f5710y & 4) != 0;
        }
        if ((this.f5710y & 2) == 0) {
            return false;
        }
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (getChildAt(i2).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1699b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo6407d(int i) {
        return 0;
    }

    public int getBaseline() {
        int i;
        int i2;
        if (this.f5698b < 0) {
            return super.getBaseline();
        }
        if (getChildCount() <= this.f5698b) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(this.f5698b);
        int baseline = childAt.getBaseline();
        if (baseline != -1) {
            int i3 = this.f5699c;
            if (this.f5700d == 1 && (i2 = this.f5701k & 112) != 48) {
                switch (i2) {
                    case 16:
                        i = i3 + (((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f5702l) / 2);
                        break;
                    case 80:
                        i = ((getBottom() - getTop()) - getPaddingBottom()) - this.f5702l;
                        break;
                }
            }
            i = i3;
            return ((C1699b) childAt.getLayoutParams()).topMargin + i + baseline;
        } else if (this.f5698b == 0) {
            return -1;
        } else {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
    }

    public int getBaselineAlignedChildIndex() {
        return this.f5698b;
    }

    public Drawable getDividerDrawable() {
        return this.f5707v;
    }

    public int getDividerPadding() {
        return this.f5711z;
    }

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    public int getDividerWidth() {
        return this.f5708w;
    }

    public int getGravity() {
        return this.f5701k;
    }

    public int getOrientation() {
        return this.f5700d;
    }

    public int getShowDividers() {
        return this.f5710y;
    }

    /* access modifiers changed from: package-private */
    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f5703m;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public C1699b generateDefaultLayoutParams() {
        if (this.f5700d == 0) {
            return new C1699b(-2, -2);
        }
        if (this.f5700d == 1) {
            return new C1699b(-1, -2);
        }
        return null;
    }

    /* renamed from: k */
    public boolean mo6418k() {
        return this.f5697a;
    }

    /* renamed from: l */
    public boolean mo6419l() {
        return this.f5704n;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.f5707v != null) {
            if (this.f5700d == 1) {
                mo6397a(canvas);
            } else {
                mo6404b(canvas);
            }
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (Build.VERSION.SDK_INT >= 14) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(C1697an.class.getName());
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        if (Build.VERSION.SDK_INT >= 14) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(C1697an.class.getName());
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f5700d == 1) {
            mo6396a(i, i2, i3, i4);
        } else {
            mo6403b(i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f5700d == 1) {
            mo6395a(i, i2);
        } else {
            mo6402b(i, i2);
        }
    }

    public void setBaselineAligned(boolean z) {
        this.f5697a = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i < 0 || i >= getChildCount()) {
            throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
        }
        this.f5698b = i;
    }

    public void setDividerDrawable(Drawable drawable) {
        boolean z = false;
        if (drawable != this.f5707v) {
            this.f5707v = drawable;
            if (drawable != null) {
                this.f5708w = drawable.getIntrinsicWidth();
                this.f5709x = drawable.getIntrinsicHeight();
            } else {
                this.f5708w = 0;
                this.f5709x = 0;
            }
            if (drawable == null) {
                z = true;
            }
            setWillNotDraw(z);
            requestLayout();
        }
    }

    public void setDividerPadding(int i) {
        this.f5711z = i;
    }

    public void setGravity(int i) {
        if (this.f5701k != i) {
            int i2 = (8388615 & i) == 0 ? 8388611 | i : i;
            if ((i2 & 112) == 0) {
                i2 |= 48;
            }
            this.f5701k = i2;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & C1161h.f3610e;
        if ((this.f5701k & C1161h.f3610e) != i2) {
            this.f5701k = i2 | (this.f5701k & -8388616);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.f5704n = z;
    }

    public void setOrientation(int i) {
        if (this.f5700d != i) {
            this.f5700d = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.f5710y) {
            requestLayout();
        }
        this.f5710y = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        if ((this.f5701k & 112) != i2) {
            this.f5701k = i2 | (this.f5701k & -113);
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.f5703m = Math.max(0.0f, f);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
