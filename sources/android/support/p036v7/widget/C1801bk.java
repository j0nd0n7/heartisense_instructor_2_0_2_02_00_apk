package android.support.p036v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.support.p010v4.p018f.C0516e;
import android.util.AttributeSet;
import android.util.TypedValue;

/* renamed from: android.support.v7.widget.bk */
class C1801bk {

    /* renamed from: a */
    static final int[] f6083a = {-16842910};

    /* renamed from: b */
    static final int[] f6084b = {16842908};

    /* renamed from: c */
    static final int[] f6085c = {16843518};

    /* renamed from: d */
    static final int[] f6086d = {16842919};

    /* renamed from: e */
    static final int[] f6087e = {16842912};

    /* renamed from: f */
    static final int[] f6088f = {16842913};

    /* renamed from: g */
    static final int[] f6089g = {-16842919, -16842908};

    /* renamed from: h */
    static final int[] f6090h = new int[0];

    /* renamed from: i */
    private static final ThreadLocal<TypedValue> f6091i = new ThreadLocal<>();

    /* renamed from: j */
    private static final int[] f6092j = new int[1];

    C1801bk() {
    }

    /* renamed from: a */
    public static int m10907a(Context context, int i) {
        f6092j[0] = i;
        C1807bp a = C1807bp.m10922a(context, (AttributeSet) null, f6092j);
        try {
            return a.mo7298b(0, 0);
        } finally {
            a.mo7308e();
        }
    }

    /* renamed from: a */
    static int m10908a(Context context, int i, float f) {
        int a = m10907a(context, i);
        return C0516e.m2709c(a, Math.round(((float) Color.alpha(a)) * f));
    }

    /* renamed from: a */
    public static ColorStateList m10909a(int i, int i2) {
        return new ColorStateList(new int[][]{f6083a, f6090h}, new int[]{i2, i});
    }

    /* renamed from: a */
    private static TypedValue m10910a() {
        TypedValue typedValue = f6091i.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        f6091i.set(typedValue2);
        return typedValue2;
    }

    /* renamed from: b */
    public static ColorStateList m10911b(Context context, int i) {
        f6092j[0] = i;
        C1807bp a = C1807bp.m10922a(context, (AttributeSet) null, f6092j);
        try {
            return a.mo7313g(0);
        } finally {
            a.mo7308e();
        }
    }

    /* renamed from: c */
    public static int m10912c(Context context, int i) {
        ColorStateList b = m10911b(context, i);
        if (b != null && b.isStateful()) {
            return b.getColorForState(f6083a, b.getDefaultColor());
        }
        TypedValue a = m10910a();
        context.getTheme().resolveAttribute(16842803, a, true);
        return m10908a(context, i, a.getFloat());
    }
}
