package android.support.p010v4.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.C0032k;
import android.support.annotation.C0037p;
import android.support.p010v4.view.ViewPager;
import android.support.p010v4.widget.C1272ao;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import java.lang.ref.WeakReference;

@ViewPager.C0907a
/* renamed from: android.support.v4.view.ah */
public class C1016ah extends ViewGroup {

    /* renamed from: g */
    private static final String f3409g = "PagerTitleStrip";

    /* renamed from: o */
    private static final int[] f3410o = {16842804, 16842901, 16842904, 16842927};

    /* renamed from: p */
    private static final int[] f3411p = {16843660};

    /* renamed from: q */
    private static final float f3412q = 0.6f;

    /* renamed from: r */
    private static final int f3413r = 16;

    /* renamed from: t */
    private static final C1018b f3414t;

    /* renamed from: a */
    ViewPager f3415a;

    /* renamed from: b */
    TextView f3416b;

    /* renamed from: c */
    TextView f3417c;

    /* renamed from: d */
    TextView f3418d;

    /* renamed from: e */
    float f3419e;

    /* renamed from: f */
    int f3420f;

    /* renamed from: h */
    private int f3421h;

    /* renamed from: i */
    private int f3422i;

    /* renamed from: j */
    private int f3423j;

    /* renamed from: k */
    private boolean f3424k;

    /* renamed from: l */
    private boolean f3425l;

    /* renamed from: m */
    private final C1017a f3426m;

    /* renamed from: n */
    private WeakReference<C1012af> f3427n;

    /* renamed from: s */
    private int f3428s;

    /* renamed from: android.support.v4.view.ah$a */
    private class C1017a extends DataSetObserver implements ViewPager.C0911e, ViewPager.C0912f {

        /* renamed from: b */
        private int f3430b;

        C1017a() {
        }

        /* renamed from: a */
        public void mo3080a(int i) {
            float f = 0.0f;
            if (this.f3430b == 0) {
                C1016ah.this.mo3614a(C1016ah.this.f3415a.getCurrentItem(), C1016ah.this.f3415a.getAdapter());
                if (C1016ah.this.f3419e >= 0.0f) {
                    f = C1016ah.this.f3419e;
                }
                C1016ah.this.mo3597a(C1016ah.this.f3415a.getCurrentItem(), f, true);
            }
        }

        /* renamed from: a */
        public void mo3081a(int i, float f, int i2) {
            if (f > 0.5f) {
                i++;
            }
            C1016ah.this.mo3597a(i, f, false);
        }

        /* renamed from: a */
        public void mo3079a(ViewPager viewPager, C1012af afVar, C1012af afVar2) {
            C1016ah.this.mo3615a(afVar, afVar2);
        }

        /* renamed from: b */
        public void mo3082b(int i) {
            this.f3430b = i;
        }

        public void onChanged() {
            float f = 0.0f;
            C1016ah.this.mo3614a(C1016ah.this.f3415a.getCurrentItem(), C1016ah.this.f3415a.getAdapter());
            if (C1016ah.this.f3419e >= 0.0f) {
                f = C1016ah.this.f3419e;
            }
            C1016ah.this.mo3597a(C1016ah.this.f3415a.getCurrentItem(), f, true);
        }
    }

    /* renamed from: android.support.v4.view.ah$b */
    interface C1018b {
        /* renamed from: a */
        void mo3626a(TextView textView);
    }

    /* renamed from: android.support.v4.view.ah$c */
    static class C1019c implements C1018b {
        C1019c() {
        }

        /* renamed from: a */
        public void mo3626a(TextView textView) {
            textView.setSingleLine();
        }
    }

    /* renamed from: android.support.v4.view.ah$d */
    static class C1020d implements C1018b {
        C1020d() {
        }

        /* renamed from: a */
        public void mo3626a(TextView textView) {
            C1021ai.m5814a(textView);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 14) {
            f3414t = new C1020d();
        } else {
            f3414t = new C1019c();
        }
    }

    public C1016ah(Context context) {
        this(context, (AttributeSet) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1016ah(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        boolean z = false;
        this.f3421h = -1;
        this.f3419e = -1.0f;
        this.f3426m = new C1017a();
        TextView textView = new TextView(context);
        this.f3416b = textView;
        addView(textView);
        TextView textView2 = new TextView(context);
        this.f3417c = textView2;
        addView(textView2);
        TextView textView3 = new TextView(context);
        this.f3418d = textView3;
        addView(textView3);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f3410o);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            C1272ao.m7487a(this.f3416b, resourceId);
            C1272ao.m7487a(this.f3417c, resourceId);
            C1272ao.m7487a(this.f3418d, resourceId);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        if (dimensionPixelSize != 0) {
            mo3613a(0, (float) dimensionPixelSize);
        }
        if (obtainStyledAttributes.hasValue(2)) {
            int color = obtainStyledAttributes.getColor(2, 0);
            this.f3416b.setTextColor(color);
            this.f3417c.setTextColor(color);
            this.f3418d.setTextColor(color);
        }
        this.f3423j = obtainStyledAttributes.getInteger(3, 80);
        obtainStyledAttributes.recycle();
        this.f3420f = this.f3417c.getTextColors().getDefaultColor();
        setNonPrimaryAlpha(f3412q);
        this.f3416b.setEllipsize(TextUtils.TruncateAt.END);
        this.f3417c.setEllipsize(TextUtils.TruncateAt.END);
        this.f3418d.setEllipsize(TextUtils.TruncateAt.END);
        if (resourceId != 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, f3411p);
            z = obtainStyledAttributes2.getBoolean(0, false);
            obtainStyledAttributes2.recycle();
        }
        if (z) {
            setSingleLineAllCaps(this.f3416b);
            setSingleLineAllCaps(this.f3417c);
            setSingleLineAllCaps(this.f3418d);
        } else {
            this.f3416b.setSingleLine();
            this.f3417c.setSingleLine();
            this.f3418d.setSingleLine();
        }
        this.f3422i = (int) (context.getResources().getDisplayMetrics().density * 16.0f);
    }

    private static void setSingleLineAllCaps(TextView textView) {
        f3414t.mo3626a(textView);
    }

    /* renamed from: a */
    public void mo3613a(int i, float f) {
        this.f3416b.setTextSize(i, f);
        this.f3417c.setTextSize(i, f);
        this.f3418d.setTextSize(i, f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3597a(int i, float f, boolean z) {
        int i2;
        int i3;
        int i4;
        if (i != this.f3421h) {
            mo3614a(i, this.f3415a.getAdapter());
        } else if (!z && f == this.f3419e) {
            return;
        }
        this.f3425l = true;
        int measuredWidth = this.f3416b.getMeasuredWidth();
        int measuredWidth2 = this.f3417c.getMeasuredWidth();
        int measuredWidth3 = this.f3418d.getMeasuredWidth();
        int i5 = measuredWidth2 / 2;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i6 = paddingRight + i5;
        int i7 = (width - (paddingLeft + i5)) - i6;
        float f2 = 0.5f + f;
        if (f2 > 1.0f) {
            f2 -= 1.0f;
        }
        int i8 = ((width - i6) - ((int) (f2 * ((float) i7)))) - (measuredWidth2 / 2);
        int i9 = i8 + measuredWidth2;
        int baseline = this.f3416b.getBaseline();
        int baseline2 = this.f3417c.getBaseline();
        int baseline3 = this.f3418d.getBaseline();
        int max = Math.max(Math.max(baseline, baseline2), baseline3);
        int i10 = max - baseline;
        int i11 = max - baseline2;
        int i12 = max - baseline3;
        int max2 = Math.max(Math.max(this.f3416b.getMeasuredHeight() + i10, this.f3417c.getMeasuredHeight() + i11), this.f3418d.getMeasuredHeight() + i12);
        switch (this.f3423j & 112) {
            case 16:
                int i13 = (((height - paddingTop) - paddingBottom) - max2) / 2;
                i2 = i13 + i10;
                i3 = i11 + i13;
                i4 = i13 + i12;
                break;
            case 80:
                int i14 = (height - paddingBottom) - max2;
                i2 = i14 + i10;
                i3 = i11 + i14;
                i4 = i14 + i12;
                break;
            default:
                i2 = paddingTop + i10;
                i3 = i11 + paddingTop;
                i4 = paddingTop + i12;
                break;
        }
        this.f3417c.layout(i8, i3, i9, this.f3417c.getMeasuredHeight() + i3);
        int min = Math.min(paddingLeft, (i8 - this.f3422i) - measuredWidth);
        this.f3416b.layout(min, i2, measuredWidth + min, this.f3416b.getMeasuredHeight() + i2);
        int max3 = Math.max((width - paddingRight) - measuredWidth3, this.f3422i + i9);
        this.f3418d.layout(max3, i4, max3 + measuredWidth3, this.f3418d.getMeasuredHeight() + i4);
        this.f3419e = f;
        this.f3425l = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3614a(int i, C1012af afVar) {
        CharSequence charSequence = null;
        int b = afVar != null ? afVar.mo3589b() : 0;
        this.f3424k = true;
        this.f3416b.setText((i < 1 || afVar == null) ? null : afVar.mo3593c(i - 1));
        this.f3417c.setText((afVar == null || i >= b) ? null : afVar.mo3593c(i));
        if (i + 1 < b && afVar != null) {
            charSequence = afVar.mo3593c(i + 1);
        }
        this.f3418d.setText(charSequence);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, (int) (((float) ((getWidth() - getPaddingLeft()) - getPaddingRight())) * 0.8f)), Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.max(0, (getHeight() - getPaddingTop()) - getPaddingBottom()), Integer.MIN_VALUE);
        this.f3416b.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f3417c.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f3418d.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f3421h = i;
        if (!this.f3425l) {
            mo3597a(i, this.f3419e, false);
        }
        this.f3424k = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3615a(C1012af afVar, C1012af afVar2) {
        if (afVar != null) {
            afVar.mo3590b((DataSetObserver) this.f3426m);
            this.f3427n = null;
        }
        if (afVar2 != null) {
            afVar2.mo3586a((DataSetObserver) this.f3426m);
            this.f3427n = new WeakReference<>(afVar2);
        }
        if (this.f3415a != null) {
            this.f3421h = -1;
            this.f3419e = -1.0f;
            mo3614a(this.f3415a.getCurrentItem(), afVar2);
            requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    public int getMinHeight() {
        Drawable background = getBackground();
        if (background != null) {
            return background.getIntrinsicHeight();
        }
        return 0;
    }

    public int getTextSpacing() {
        return this.f3422i;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (!(parent instanceof ViewPager)) {
            throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
        }
        ViewPager viewPager = (ViewPager) parent;
        C1012af adapter = viewPager.getAdapter();
        viewPager.mo3025c((ViewPager.C0912f) this.f3426m);
        viewPager.mo3009a((ViewPager.C0911e) this.f3426m);
        this.f3415a = viewPager;
        mo3615a(this.f3427n != null ? (C1012af) this.f3427n.get() : null, adapter);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f3415a != null) {
            mo3615a(this.f3415a.getAdapter(), (C1012af) null);
            this.f3415a.mo3025c((ViewPager.C0912f) null);
            this.f3415a.mo3023b((ViewPager.C0911e) this.f3426m);
            this.f3415a = null;
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f = 0.0f;
        if (this.f3415a != null) {
            if (this.f3419e >= 0.0f) {
                f = this.f3419e;
            }
            mo3597a(this.f3421h, f, true);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int max;
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException("Must measure with an exact width");
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = getChildMeasureSpec(i2, paddingTop, -2);
        int size = View.MeasureSpec.getSize(i);
        int childMeasureSpec2 = getChildMeasureSpec(i, (int) (((float) size) * 0.2f), -2);
        this.f3416b.measure(childMeasureSpec2, childMeasureSpec);
        this.f3417c.measure(childMeasureSpec2, childMeasureSpec);
        this.f3418d.measure(childMeasureSpec2, childMeasureSpec);
        if (View.MeasureSpec.getMode(i2) == 1073741824) {
            max = View.MeasureSpec.getSize(i2);
        } else {
            max = Math.max(getMinHeight(), paddingTop + this.f3417c.getMeasuredHeight());
        }
        setMeasuredDimension(size, C1040ar.m5878a(max, i2, C1040ar.m5958p(this.f3417c) << 16));
    }

    public void requestLayout() {
        if (!this.f3424k) {
            super.requestLayout();
        }
    }

    public void setGravity(int i) {
        this.f3423j = i;
        requestLayout();
    }

    public void setNonPrimaryAlpha(@C0037p(mo18a = 0.0d, mo19b = 1.0d) float f) {
        this.f3428s = ((int) (255.0f * f)) & 255;
        int i = (this.f3428s << 24) | (this.f3420f & C1040ar.f3484r);
        this.f3416b.setTextColor(i);
        this.f3418d.setTextColor(i);
    }

    public void setTextColor(@C0032k int i) {
        this.f3420f = i;
        this.f3417c.setTextColor(i);
        int i2 = (this.f3428s << 24) | (this.f3420f & C1040ar.f3484r);
        this.f3416b.setTextColor(i2);
        this.f3418d.setTextColor(i2);
    }

    public void setTextSpacing(int i) {
        this.f3422i = i;
        requestLayout();
    }
}
