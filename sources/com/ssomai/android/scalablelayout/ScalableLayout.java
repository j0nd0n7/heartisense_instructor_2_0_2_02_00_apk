package com.ssomai.android.scalablelayout;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.p010v4.view.C1040ar;
import android.support.p036v7.widget.p046a.C1644a;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.ssomai.android.scalablelayout.C2635b;

public class ScalableLayout extends FrameLayout {

    /* renamed from: a */
    private static final float f10805a = 100.0f;

    /* renamed from: b */
    private static final float f10806b = 100.0f;

    /* renamed from: c */
    private static final float f10807c = 0.0f;

    /* renamed from: d */
    private static final int f10808d = 0;

    /* renamed from: e */
    private static final float f10809e = 0.0f;

    /* renamed from: f */
    private static final int f10810f = 0;

    /* renamed from: g */
    private static final float f10811g = 100.0f;

    /* renamed from: h */
    private static final float f10812h = 100.0f;

    /* renamed from: i */
    private static final float f10813i = -1.0f;

    /* renamed from: j */
    private static final float f10814j = 100.0f;

    /* renamed from: r */
    private static String f10815r = null;

    /* renamed from: k */
    private float f10816k;

    /* renamed from: l */
    private float f10817l;

    /* renamed from: m */
    private float f10818m;

    /* renamed from: n */
    private Runnable f10819n;

    /* renamed from: o */
    private long f10820o;

    /* renamed from: p */
    private TextWatcher f10821p;

    /* renamed from: q */
    private String f10822q;

    /* renamed from: com.ssomai.android.scalablelayout.ScalableLayout$a */
    public static class C2631a extends FrameLayout.LayoutParams {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public float f10827a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public int f10828b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public float f10829c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public int f10830d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public float f10831e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public float f10832f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public float f10833g;

        /* renamed from: h */
        private float f10834h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public C2632b f10835i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public boolean f10836j;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public boolean f10837k;

        public C2631a(float f, float f2, float f3, float f4) {
            this(f, 0, f2, 0, f3, f4);
        }

        public C2631a(float f, int i, float f2, int i2, float f3, float f4) {
            this(f, i, f2, i2, f3, f4, 100.0f, C2632b.None, false, true);
        }

        private C2631a(float f, int i, float f2, int i2, float f3, float f4, float f5, C2632b bVar, boolean z, boolean z2) {
            super(-2, -2, 51);
            this.f10827a = 0.0f;
            this.f10829c = 0.0f;
            this.f10831e = 100.0f;
            this.f10832f = 100.0f;
            this.f10833g = ScalableLayout.f10813i;
            this.f10834h = ScalableLayout.f10813i;
            this.f10835i = C2632b.None;
            this.f10836j = false;
            this.f10837k = true;
            mo10086a(f);
            mo10087a(i);
            mo10090b(f2);
            mo10091b(i2);
            mo10093c(f3);
            mo10095d(f4);
            mo10097e(f5);
            mo10088a(bVar, z, z2);
        }

        public C2631a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            C2632b bVar;
            this.f10827a = 0.0f;
            this.f10829c = 0.0f;
            this.f10831e = 100.0f;
            this.f10832f = 100.0f;
            this.f10833g = ScalableLayout.f10813i;
            this.f10834h = ScalableLayout.f10813i;
            this.f10835i = C2632b.None;
            this.f10836j = false;
            this.f10837k = true;
            C2632b bVar2 = C2632b.None;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2635b.C2638c.View2);
            float f = obtainStyledAttributes.getFloat(C2635b.C2638c.View2_scale_left, 0.0f);
            int integer = obtainStyledAttributes.getInteger(C2635b.C2638c.View2_scale_left_baseposition, 0);
            float f2 = obtainStyledAttributes.getFloat(C2635b.C2638c.View2_scale_top, 0.0f);
            int integer2 = obtainStyledAttributes.getInteger(C2635b.C2638c.View2_scale_top_baseposition, 0);
            mo10086a(f);
            mo10087a(integer);
            mo10090b(f2);
            mo10091b(integer2);
            mo10093c(obtainStyledAttributes.getFloat(C2635b.C2638c.View2_scale_width, 100.0f));
            mo10095d(obtainStyledAttributes.getFloat(C2635b.C2638c.View2_scale_height, 100.0f));
            mo10097e(obtainStyledAttributes.getFloat(C2635b.C2638c.View2_scale_textsize, 100.0f));
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C2635b.C2638c.TextView);
            int integer3 = obtainStyledAttributes2.getInteger(C2635b.C2638c.TextView_textview_wrapcontent_direction, 0);
            C2632b[] values = C2632b.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    bVar = bVar2;
                    break;
                }
                bVar = values[i];
                if (bVar.f10846h == integer3) {
                    break;
                }
                i++;
            }
            mo10088a(bVar, obtainStyledAttributes2.getBoolean(C2635b.C2638c.TextView_textview_wrapcontent_resizesurrounded, false), obtainStyledAttributes2.getBoolean(C2635b.C2638c.TextView_textview_wrapcontent_movesiblings, true));
            mo10099f(obtainStyledAttributes2.getFloat(C2635b.C2638c.TextView_textview_wrapcontent_scale_maxwidth, ScalableLayout.f10813i));
        }

        private C2631a(ViewGroup.LayoutParams layoutParams) {
            this(0.0f, 0.0f, 100.0f, 100.0f);
            this.width = layoutParams.width;
            this.height = layoutParams.height;
            this.layoutAnimationParameters = layoutParams.layoutAnimationParameters;
            this.gravity = 51;
        }

        /* renamed from: a */
        public float mo10085a() {
            return this.f10827a;
        }

        /* renamed from: a */
        public void mo10086a(float f) {
            this.f10827a = f;
        }

        /* renamed from: a */
        public void mo10087a(int i) {
            this.f10828b = i;
        }

        /* renamed from: a */
        public void mo10088a(C2632b bVar, boolean z, boolean z2) {
            this.f10835i = bVar;
            this.f10836j = z;
            this.f10837k = z2;
        }

        /* renamed from: b */
        public float mo10089b() {
            return mo10085a() + mo10100g();
        }

        /* renamed from: b */
        public void mo10090b(float f) {
            this.f10829c = f;
        }

        /* renamed from: b */
        public void mo10091b(int i) {
            this.f10830d = i;
        }

        /* renamed from: c */
        public int mo10092c() {
            return this.f10828b;
        }

        /* renamed from: c */
        public void mo10093c(float f) {
            this.f10831e = f;
        }

        /* renamed from: d */
        public float mo10094d() {
            return this.f10829c;
        }

        /* renamed from: d */
        public void mo10095d(float f) {
            this.f10832f = f;
        }

        /* renamed from: e */
        public float mo10096e() {
            return mo10094d() + mo10101h();
        }

        /* renamed from: e */
        public void mo10097e(float f) {
            this.f10833g = f;
        }

        /* renamed from: f */
        public int mo10098f() {
            return this.f10830d;
        }

        /* renamed from: f */
        public void mo10099f(float f) {
            this.f10834h = f;
        }

        /* renamed from: g */
        public float mo10100g() {
            return this.f10831e;
        }

        /* renamed from: h */
        public float mo10101h() {
            return this.f10832f;
        }

        /* renamed from: i */
        public float mo10102i() {
            return this.f10833g;
        }

        /* renamed from: j */
        public float mo10103j() {
            return this.f10834h;
        }

        public String toString() {
            return String.format("%08x (%6.3f, %6.3f) (%6.3f, %6.3f)", new Object[]{Integer.valueOf(hashCode()), Float.valueOf(mo10085a()), Float.valueOf(mo10094d()), Float.valueOf(mo10089b()), Float.valueOf(mo10096e())});
        }
    }

    /* renamed from: com.ssomai.android.scalablelayout.ScalableLayout$b */
    public enum C2632b {
        None(0),
        Left(10),
        Center_Horizontal(20),
        Right(30),
        Top(100),
        Center_Vertical(C1644a.C1650a.f5538a),
        Bottom(300);
        

        /* renamed from: h */
        int f10846h;

        private C2632b(int i) {
            this.f10846h = 0;
            this.f10846h = i;
        }
    }

    /* renamed from: com.ssomai.android.scalablelayout.ScalableLayout$c */
    private enum C2633c {
        Top,
        Bottom,
        Left,
        Right,
        Surrounded,
        Nothing
    }

    public ScalableLayout(Context context) {
        this(context, 100.0f, 100.0f);
    }

    public ScalableLayout(Context context, float f, float f2) {
        this(context, (AttributeSet) null, f, f2);
    }

    public ScalableLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, context.obtainStyledAttributes(attributeSet, C2635b.C2638c.ScalableLayout).getFloat(C2635b.C2638c.ScalableLayout_scale_base_width, 100.0f), context.obtainStyledAttributes(attributeSet, C2635b.C2638c.ScalableLayout).getFloat(C2635b.C2638c.ScalableLayout_scale_base_height, 100.0f));
    }

    private ScalableLayout(Context context, AttributeSet attributeSet, float f, float f2) {
        super(context, attributeSet);
        this.f10816k = 100.0f;
        this.f10817l = 100.0f;
        this.f10818m = this.f10817l / this.f10816k;
        this.f10819n = new Runnable() {
            public void run() {
                ScalableLayout.this.requestLayout();
                ScalableLayout.this.forceLayout();
            }
        };
        this.f10820o = 0;
        this.f10821p = new TextWatcher() {
            public void afterTextChanged(Editable editable) {
                ScalableLayout.this.m14629d();
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                ScalableLayout.this.m14629d();
            }
        };
        this.f10822q = null;
        m14620a(f, f2, true);
    }

    /* renamed from: a */
    private C2633c m14618a(C2631a aVar, C2631a aVar2) {
        return (aVar.mo10094d() < aVar2.mo10096e() || ((aVar.mo10085a() > aVar2.mo10085a() || aVar2.mo10085a() > aVar.mo10089b()) && ((aVar.mo10085a() > aVar2.mo10089b() || aVar2.mo10089b() > aVar.mo10089b()) && (aVar2.mo10085a() > aVar.mo10085a() || aVar.mo10089b() > aVar2.mo10089b())))) ? (aVar.mo10096e() > aVar2.mo10094d() || ((aVar.mo10085a() > aVar2.mo10085a() || aVar2.mo10085a() > aVar.mo10089b()) && ((aVar.mo10085a() > aVar2.mo10089b() || aVar2.mo10089b() > aVar.mo10089b()) && (aVar2.mo10085a() > aVar.mo10085a() || aVar.mo10089b() > aVar2.mo10089b())))) ? (aVar.mo10085a() < aVar2.mo10089b() || ((aVar.mo10094d() > aVar2.mo10094d() || aVar2.mo10094d() > aVar.mo10096e()) && ((aVar.mo10094d() > aVar2.mo10096e() || aVar2.mo10096e() > aVar.mo10096e()) && (aVar.mo10094d() < aVar2.mo10094d() || aVar2.mo10096e() < aVar.mo10096e())))) ? (aVar.mo10089b() > aVar2.mo10085a() || ((aVar.mo10094d() > aVar2.mo10094d() || aVar2.mo10094d() > aVar.mo10096e()) && ((aVar.mo10094d() > aVar2.mo10096e() || aVar2.mo10096e() > aVar.mo10096e()) && (aVar.mo10094d() < aVar2.mo10094d() || aVar2.mo10096e() < aVar.mo10096e())))) ? (aVar2.mo10094d() > aVar.mo10094d() || aVar2.mo10085a() > aVar.mo10085a() || aVar2.mo10089b() < aVar.mo10089b() || aVar2.mo10096e() < aVar.mo10096e()) ? C2633c.Nothing : C2633c.Surrounded : C2633c.Right : C2633c.Left : C2633c.Bottom : C2633c.Top;
    }

    /* renamed from: a */
    private static String m14619a(StackTraceElement[] stackTraceElementArr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < stackTraceElementArr.length; i++) {
            sb.append("\t" + stackTraceElementArr[i].toString() + "\n");
        }
        return sb.toString();
    }

    /* renamed from: a */
    private void m14620a(float f, float f2, boolean z) {
        this.f10816k = f;
        this.f10817l = f2;
        this.f10818m = this.f10817l / this.f10816k;
        if (z) {
            m14629d();
        }
    }

    /* renamed from: a */
    private final void m14621a(View view, int i, C2631a aVar) {
        super.addView(view, i, aVar);
    }

    /* renamed from: a */
    private void m14622a(TextView textView) {
        C2631a a = mo10054a((View) textView);
        try {
            textView.removeTextChangedListener(this.f10821p);
        } catch (Throwable th) {
            m14624a(th);
        }
        if (a.f10835i != C2632b.None) {
            textView.addTextChangedListener(this.f10821p);
        }
    }

    /* renamed from: a */
    private static void m14624a(Throwable th) {
    }

    /* renamed from: a */
    private boolean m14625a(float f, float f2, float f3) {
        return f < f2 / f3 || f2 * f3 < f;
    }

    /* renamed from: b */
    private void m14626b(TextView textView, float f) {
        float f2;
        float f3;
        m14622a(textView);
        C2631a a = mo10054a((View) textView);
        C2632b a2 = a.f10835i;
        if (a2 != C2632b.None) {
            float g = a.mo10100g();
            float h = a.mo10101h();
            float d = a.f10833g * f;
            if (m14627b(d, textView.getTextSize())) {
                textView.setTextSize(0, d);
            }
            switch (a2) {
                case Top:
                case Bottom:
                case Center_Vertical:
                    textView.measure(View.MeasureSpec.makeMeasureSpec((int) (g * f), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                    f2 = (((float) textView.getMeasuredHeight()) * 1.01f) / f;
                    f3 = g;
                    break;
                case Left:
                case Right:
                case Center_Horizontal:
                    textView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec((int) (h * f), 1073741824));
                    float measuredWidth = (((float) textView.getMeasuredWidth()) * 1.01f) / f;
                    if (a.mo10103j() != f10813i && measuredWidth > a.mo10103j()) {
                        measuredWidth = a.mo10103j();
                    }
                    f2 = h;
                    f3 = measuredWidth;
                    break;
                default:
                    f2 = h;
                    f3 = g;
                    break;
            }
            if (m14627b(f3, g) || m14627b(f2, h)) {
                float f4 = f3 - g;
                float f5 = f2 - h;
                if (a.f10837k) {
                    int i = 0;
                    while (true) {
                        int i2 = i;
                        if (i2 < getChildCount()) {
                            View childAt = getChildAt(i2);
                            if (childAt != textView) {
                                C2631a a3 = mo10054a(childAt);
                                C2633c a4 = m14618a(a, a3);
                                switch (a2) {
                                    case Top:
                                        if (!a.f10836j) {
                                            switch (a4) {
                                                case Top:
                                                    mo10057a(childAt, a3.mo10085a(), a3.mo10094d() - f5);
                                                    break;
                                            }
                                        } else {
                                            switch (a4) {
                                                case Top:
                                                    break;
                                                case Surrounded:
                                                    mo10069b(childAt, a3.mo10085a(), a3.mo10094d(), a3.mo10100g(), a3.mo10101h() + f5);
                                                    break;
                                                default:
                                                    mo10057a(childAt, a3.mo10085a(), a3.mo10094d() + f5);
                                                    break;
                                            }
                                        }
                                    case Bottom:
                                        if (!a.f10836j) {
                                            switch (a4) {
                                                case Bottom:
                                                    mo10057a(childAt, a3.mo10085a(), a3.mo10094d() + f5);
                                                    break;
                                            }
                                        } else {
                                            switch (a4) {
                                                case Surrounded:
                                                    mo10069b(childAt, a3.mo10085a(), a3.mo10094d(), a3.mo10100g(), a3.mo10101h() + f5);
                                                    break;
                                                case Bottom:
                                                    mo10057a(childAt, a3.mo10085a(), a3.mo10094d() + f5);
                                                    break;
                                            }
                                        }
                                    case Center_Vertical:
                                        if (!a.f10836j) {
                                            switch (a4) {
                                                case Top:
                                                    mo10057a(childAt, a3.mo10085a(), a3.mo10094d() - (f5 / 2.0f));
                                                    break;
                                                case Bottom:
                                                    mo10057a(childAt, a3.mo10085a(), a3.mo10094d() + (f5 / 2.0f));
                                                    break;
                                            }
                                        } else {
                                            switch (a4) {
                                                case Top:
                                                    break;
                                                case Surrounded:
                                                    mo10069b(childAt, a3.mo10085a(), a3.mo10094d(), a3.mo10100g(), a3.mo10101h() + f5);
                                                    break;
                                                case Bottom:
                                                    mo10057a(childAt, a3.mo10085a(), a3.mo10094d() + f5);
                                                    break;
                                                default:
                                                    mo10069b(childAt, a3.mo10085a(), a3.mo10094d() + (f5 / 2.0f), a3.mo10100g(), a3.mo10101h());
                                                    break;
                                            }
                                        }
                                    case Left:
                                        if (!a.f10836j) {
                                            switch (a4) {
                                                case Left:
                                                    mo10057a(childAt, a3.mo10085a() - f4, a3.mo10094d());
                                                    break;
                                            }
                                        } else {
                                            switch (a4) {
                                                case Surrounded:
                                                    float h2 = a3.mo10101h();
                                                    mo10069b(childAt, a3.mo10085a(), a3.mo10094d(), a3.mo10100g() + f4, h2);
                                                    break;
                                                case Left:
                                                    break;
                                                default:
                                                    mo10057a(childAt, a3.mo10085a() + f4, a3.mo10094d());
                                                    break;
                                            }
                                        }
                                    case Right:
                                        if (!a.f10836j) {
                                            switch (a4) {
                                                case Right:
                                                    mo10057a(childAt, a3.mo10085a() + f4, a3.mo10094d());
                                                    break;
                                            }
                                        } else {
                                            switch (a4) {
                                                case Surrounded:
                                                    float h3 = a3.mo10101h();
                                                    mo10069b(childAt, a3.mo10085a(), a3.mo10094d(), a3.mo10100g() + f4, h3);
                                                    break;
                                                case Right:
                                                    mo10057a(childAt, a3.mo10085a() + f4, a3.mo10094d());
                                                    break;
                                            }
                                        }
                                    case Center_Horizontal:
                                        if (!a.f10836j) {
                                            switch (a4) {
                                                case Left:
                                                    mo10057a(childAt, a3.mo10085a() - (f4 / 2.0f), a3.mo10094d());
                                                    break;
                                                case Right:
                                                    mo10057a(childAt, a3.mo10085a() + (f4 / 2.0f), a3.mo10094d());
                                                    break;
                                            }
                                        } else {
                                            switch (a4) {
                                                case Surrounded:
                                                    float h4 = a3.mo10101h();
                                                    mo10069b(childAt, a3.mo10085a(), a3.mo10094d(), a3.mo10100g() + f4, h4);
                                                    break;
                                                case Left:
                                                    break;
                                                case Right:
                                                    mo10057a(childAt, a3.mo10085a() + f4, a3.mo10094d());
                                                    break;
                                                default:
                                                    mo10069b(childAt, a3.mo10085a() + (f4 / 2.0f), a3.mo10094d(), a3.mo10100g(), a3.mo10101h());
                                                    break;
                                            }
                                        }
                                }
                            }
                            i = i2 + 1;
                        }
                    }
                } else {
                    int i3 = 0;
                    while (true) {
                        int i4 = i3;
                        if (i4 < getChildCount()) {
                            View childAt2 = getChildAt(i4);
                            if (childAt2 != textView) {
                                C2631a a5 = mo10054a(childAt2);
                                C2633c a6 = m14618a(a, a5);
                                switch (a2) {
                                    case Top:
                                        if (!a.f10836j) {
                                            break;
                                        } else {
                                            switch (a6) {
                                                case Surrounded:
                                                    mo10069b(childAt2, a5.mo10085a(), a5.mo10094d(), a5.mo10100g(), a5.mo10101h() + f5);
                                                    break;
                                                default:
                                                    mo10057a(childAt2, a5.mo10085a(), a5.mo10094d() + f5);
                                                    break;
                                            }
                                        }
                                    case Bottom:
                                        if (!a.f10836j) {
                                            break;
                                        } else {
                                            switch (a6) {
                                                case Surrounded:
                                                    mo10069b(childAt2, a5.mo10085a(), a5.mo10094d(), a5.mo10100g(), a5.mo10101h() + f5);
                                                    break;
                                            }
                                        }
                                        break;
                                    case Center_Vertical:
                                        if (!a.f10836j) {
                                            break;
                                        } else {
                                            switch (a6) {
                                                case Surrounded:
                                                    mo10069b(childAt2, a5.mo10085a(), a5.mo10094d(), a5.mo10100g(), a5.mo10101h() + f5);
                                                    break;
                                                default:
                                                    mo10069b(childAt2, a5.mo10085a(), a5.mo10094d() + (f5 / 2.0f), a5.mo10100g(), a5.mo10101h());
                                                    break;
                                            }
                                        }
                                    case Left:
                                        if (!a.f10836j) {
                                            break;
                                        } else {
                                            switch (a6) {
                                                case Surrounded:
                                                    float h5 = a5.mo10101h();
                                                    mo10069b(childAt2, a5.mo10085a(), a5.mo10094d(), a5.mo10100g() + f4, h5);
                                                    break;
                                                default:
                                                    mo10057a(childAt2, a5.mo10085a() + f4, a5.mo10094d());
                                                    break;
                                            }
                                        }
                                    case Right:
                                        if (!a.f10836j) {
                                            break;
                                        } else {
                                            switch (a6) {
                                                case Surrounded:
                                                    float h6 = a5.mo10101h();
                                                    mo10069b(childAt2, a5.mo10085a(), a5.mo10094d(), a5.mo10100g() + f4, h6);
                                                    break;
                                            }
                                        }
                                        break;
                                    case Center_Horizontal:
                                        if (!a.f10836j) {
                                            break;
                                        } else {
                                            switch (a6) {
                                                case Surrounded:
                                                    float h7 = a5.mo10101h();
                                                    mo10069b(childAt2, a5.mo10085a(), a5.mo10094d(), a5.mo10100g() + f4, h7);
                                                    break;
                                                default:
                                                    mo10069b(childAt2, a5.mo10085a() + (f4 / 2.0f), a5.mo10094d(), a5.mo10100g(), a5.mo10101h());
                                                    break;
                                            }
                                        }
                                }
                            }
                            i3 = i4 + 1;
                        }
                    }
                }
                switch (a2) {
                    case Top:
                        if (!a.f10836j) {
                            mo10069b(textView, a.mo10085a(), a.mo10094d() - f5, a.mo10100g(), f2);
                            break;
                        } else {
                            mo10069b(textView, a.mo10085a(), a.mo10094d(), a.mo10100g(), f2);
                            break;
                        }
                    case Bottom:
                        mo10069b(textView, a.mo10085a(), a.mo10094d(), a.mo10100g(), f2);
                        break;
                    case Center_Vertical:
                        if (!a.f10836j) {
                            mo10069b(textView, a.mo10085a(), a.mo10094d() - (f5 / 2.0f), a.mo10100g(), f2);
                            break;
                        } else {
                            mo10069b(textView, a.mo10085a(), a.mo10094d(), a.mo10100g(), f2);
                            break;
                        }
                    case Left:
                        if (!a.f10836j) {
                            mo10069b(textView, a.mo10085a() - f4, a.mo10094d(), f3, a.mo10101h());
                            break;
                        } else {
                            mo10069b(textView, a.mo10085a(), a.mo10094d(), f3, a.mo10101h());
                            break;
                        }
                    case Right:
                        mo10069b(textView, a.mo10085a(), a.mo10094d(), f3, a.mo10101h());
                        break;
                    case Center_Horizontal:
                        if (!a.f10836j) {
                            mo10069b(textView, a.mo10085a() - (f4 / 2.0f), a.mo10094d(), f3, a.mo10101h());
                            break;
                        } else {
                            mo10069b(textView, a.mo10085a(), a.mo10094d(), f3, a.mo10101h());
                            break;
                        }
                }
                if (a.f10836j) {
                    m14620a(getScaleWidth() + f4, getScaleHeight() + f5, false);
                }
            }
        }
    }

    /* renamed from: b */
    private boolean m14627b(float f, float f2) {
        return m14625a(f, f2, 1.1f);
    }

    /* renamed from: c */
    public static void m14628c() {
        setLoggable("ScalableLayout");
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m14629d() {
        if (!isInEditMode()) {
            long currentTimeMillis = System.currentTimeMillis();
            if (this.f10820o < currentTimeMillis - 50 || currentTimeMillis < this.f10820o) {
                this.f10820o = currentTimeMillis;
                postDelayed(this.f10819n, 10);
            }
        }
    }

    public static void setLoggable(String str) {
        f10815r = str;
    }

    /* renamed from: a */
    public EditText mo10043a(float f, float f2, float f3, float f4, float f5) {
        EditText editText = new EditText(getContext());
        mo10058a((View) editText, f2, f3, f4, f5);
        mo10059a((TextView) editText, f);
        editText.setGravity(17);
        editText.setTextColor(C1040ar.f3485s);
        return editText;
    }

    /* renamed from: a */
    public ImageView mo10044a(float f, float f2, float f3, float f4) {
        return mo10049a((Drawable) null, f, f2, f3, f4, false);
    }

    /* renamed from: a */
    public ImageView mo10045a(int i, float f, float f2, float f3, float f4) {
        return mo10046a(i, f, f2, f3, f4, false);
    }

    /* renamed from: a */
    public ImageView mo10046a(int i, float f, float f2, float f3, float f4, boolean z) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        return mo10049a((Drawable) new BitmapDrawable(getResources(), BitmapFactory.decodeResource(getResources(), i, options)), f, f2, f3, f4, z);
    }

    /* renamed from: a */
    public ImageView mo10047a(Bitmap bitmap, float f, float f2, float f3, float f4) {
        return mo10049a((Drawable) new BitmapDrawable(getResources(), bitmap), f, f2, f3, f4, false);
    }

    /* renamed from: a */
    public ImageView mo10048a(Drawable drawable, float f, float f2, float f3, float f4) {
        return mo10049a(drawable, f, f2, f3, f4, false);
    }

    /* renamed from: a */
    public ImageView mo10049a(Drawable drawable, float f, float f2, float f3, float f4, boolean z) {
        ImageView imageView = new ImageView(getContext());
        imageView.setImageDrawable(drawable);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setDuplicateParentStateEnabled(z);
        mo10058a((View) imageView, f, f2, f3, f4);
        return imageView;
    }

    /* renamed from: a */
    public TextView mo10050a(String str, float f, float f2, float f3, float f4, float f5) {
        return mo10051a(str, f, f2, f3, f4, f5, false);
    }

    /* renamed from: a */
    public TextView mo10051a(String str, float f, float f2, float f3, float f4, float f5, boolean z) {
        TextView textView = new TextView(getContext());
        mo10058a((View) textView, f2, f3, f4, f5);
        mo10059a(textView, f);
        textView.setText(str);
        textView.setGravity(17);
        textView.setTextColor(C1040ar.f3485s);
        textView.setDuplicateParentStateEnabled(z);
        return textView;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C2631a generateDefaultLayoutParams() {
        return new C2631a(0.0f, 0.0f, getScaleWidth(), getScaleHeight());
    }

    /* renamed from: a */
    public C2631a generateLayoutParams(AttributeSet attributeSet) {
        return new C2631a(getContext(), attributeSet);
    }

    /* renamed from: a */
    public C2631a mo10054a(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
            view.setLayoutParams(layoutParams);
        }
        if (layoutParams instanceof C2631a) {
            return (C2631a) view.getLayoutParams();
        }
        throw new IllegalArgumentException("pChild has not ScalableLayout.LayoutParams " + view.getLayoutParams());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C2631a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C2631a ? (C2631a) layoutParams : new C2631a(layoutParams);
    }

    /* renamed from: a */
    public void mo10056a(float f, float f2) {
        m14620a(f, f2, true);
    }

    /* renamed from: a */
    public void mo10057a(View view, float f, float f2) {
        C2631a a = mo10054a(view);
        float unused = a.f10827a = f;
        float unused2 = a.f10829c = f2;
        postInvalidate();
    }

    /* renamed from: a */
    public void mo10058a(View view, float f, float f2, float f3, float f4) {
        m14621a(view, getChildCount(), new C2631a(f, f2, f3, f4));
    }

    /* renamed from: a */
    public void mo10059a(TextView textView, float f) {
        mo10054a((View) textView).mo10097e(f);
    }

    /* renamed from: a */
    public void mo10060a(TextView textView, C2632b bVar, boolean z) {
        mo10061a(textView, bVar, z, true);
    }

    /* renamed from: a */
    public void mo10061a(TextView textView, C2632b bVar, boolean z, boolean z2) {
        mo10054a((View) textView).mo10088a(bVar, z, z2);
        m14622a(textView);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10062a(String str) {
        if (f10815r != null) {
            Log.e(f10815r, this + "] " + str);
        }
        if (this.f10822q != null) {
            Log.e(this.f10822q, this + "] " + str);
        }
    }

    public void addView(View view) {
        addView(view, getChildCount());
    }

    public void addView(View view, int i) {
        addView(view, i, (ViewGroup.LayoutParams) generateDefaultLayoutParams());
    }

    public void addView(View view, int i, int i2) {
        addView(view, new ViewGroup.LayoutParams(i, i2));
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C2631a) {
            m14621a(view, i, (C2631a) layoutParams);
        } else {
            m14621a(view, i, generateLayoutParams(layoutParams));
        }
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addView(view, getChildCount(), layoutParams);
    }

    /* renamed from: b */
    public void mo10068b() {
        setThisLoggable("ScalableLayout");
    }

    /* renamed from: b */
    public void mo10069b(View view, float f, float f2, float f3, float f4) {
        C2631a a = mo10054a(view);
        float unused = a.f10827a = f;
        float unused2 = a.f10829c = f2;
        float unused3 = a.f10831e = f3;
        float unused4 = a.f10832f = f4;
        postInvalidate();
    }

    public String getLogTag_This() {
        return this.f10822q;
    }

    public float getScaleHeight() {
        return this.f10817l;
    }

    public float getScaleWidth() {
        return this.f10816k;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        float f;
        float f2;
        float f3;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        switch (mode) {
            case Integer.MIN_VALUE:
                if (mode2 != 1073741824) {
                    f = (float) size;
                    break;
                } else {
                    f = Float.MAX_VALUE;
                    break;
                }
            case 1073741824:
                f = (float) size;
                break;
            default:
                f = Float.MAX_VALUE;
                break;
        }
        switch (mode2) {
            case Integer.MIN_VALUE:
                if (mode != 1073741824) {
                    f2 = (float) size2;
                    break;
                } else {
                    f2 = Float.MAX_VALUE;
                    break;
                }
            case 1073741824:
                f2 = (float) size2;
                break;
            default:
                f2 = Float.MAX_VALUE;
                break;
        }
        float f4 = 0.0f;
        float f5 = 0.0f;
        int i3 = 0;
        while (true) {
            f3 = f5;
            if (i3 < 3) {
                float min = Math.min(f / this.f10816k, f2 / this.f10817l);
                int i4 = 0;
                while (true) {
                    int i5 = i4;
                    if (i5 < getChildCount()) {
                        View childAt = getChildAt(i5);
                        if (childAt instanceof TextView) {
                            m14626b((TextView) childAt, min);
                        }
                        i4 = i5 + 1;
                    } else {
                        float min2 = Math.min(f / this.f10816k, f2 / this.f10817l);
                        float f6 = this.f10816k * min2;
                        f5 = this.f10817l * min2;
                        int i6 = 0;
                        while (true) {
                            int i7 = i6;
                            if (i7 < getChildCount()) {
                                View childAt2 = getChildAt(i7);
                                C2631a a = mo10054a(childAt2);
                                boolean z = false;
                                int round = Math.round(a.mo10085a() * min2);
                                if (a.leftMargin != round) {
                                    z = true;
                                }
                                a.leftMargin = round;
                                int round2 = Math.round(a.mo10100g() * min2);
                                if (a.width != round2) {
                                    z = true;
                                }
                                a.width = round2;
                                switch (a.f10828b) {
                                    case 1:
                                        a.leftMargin -= a.width / 2;
                                        break;
                                    case 2:
                                        a.leftMargin -= a.width;
                                        break;
                                }
                                int round3 = Math.round(a.mo10094d() * min2);
                                if (a.topMargin != round3) {
                                    z = true;
                                }
                                a.topMargin = round3;
                                int round4 = Math.round(a.mo10101h() * min2);
                                boolean z2 = a.height != round4 ? true : z;
                                a.height = round4;
                                switch (a.f10830d) {
                                    case 1:
                                        a.topMargin -= a.height / 2;
                                        break;
                                    case 2:
                                        a.topMargin -= a.height;
                                        break;
                                }
                                if (a.f10833g != f10813i && (childAt2 instanceof TextView)) {
                                    TextView textView = (TextView) childAt2;
                                    if (m14627b(a.f10833g * min2, textView.getTextSize())) {
                                        textView.setTextSize(0, a.f10833g * min2);
                                    }
                                }
                                if (z2) {
                                    childAt2.setLayoutParams(a);
                                }
                                i6 = i7 + 1;
                            } else if (!m14625a(min2, min, 1.01f)) {
                                f3 = f5;
                                f4 = f6;
                            } else {
                                i3++;
                                f4 = f6;
                            }
                        }
                    }
                }
            }
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.round(f4), mode), View.MeasureSpec.makeMeasureSpec(Math.round(f3), mode2));
        setMeasuredDimension(Math.round(f4), Math.round(f3));
    }

    public void setScaleHeight(float f) {
        mo10056a(this.f10816k, f);
    }

    public void setScaleWidth(float f) {
        mo10056a(f, this.f10817l);
    }

    public void setThisLoggable(String str) {
        this.f10822q = str;
    }

    public String toString() {
        return String.format("{ScalableLayout:%08x}", new Object[]{Integer.valueOf(hashCode())});
    }
}
