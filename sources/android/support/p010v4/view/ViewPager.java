package android.support.p010v4.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.annotation.C0003aa;
import android.support.annotation.C0030i;
import android.support.annotation.C0036o;
import android.support.annotation.C0047z;
import android.support.p010v4.p014d.C0434d;
import android.support.p010v4.p028k.C0808j;
import android.support.p010v4.p028k.C0810k;
import android.support.p010v4.view.p034a.C0922a;
import android.support.p010v4.view.p034a.C0949h;
import android.support.p010v4.view.p034a.C0992u;
import android.support.p010v4.widget.C1323m;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: android.support.v4.view.ViewPager */
public class ViewPager extends ViewGroup {

    /* renamed from: W */
    private static final int f3136W = -1;

    /* renamed from: a */
    static final int[] f3137a = {16842931};

    /* renamed from: aA */
    private static final C0918k f3138aA = new C0918k();

    /* renamed from: af */
    private static final int f3139af = 2;

    /* renamed from: av */
    private static final int f3140av = 0;

    /* renamed from: aw */
    private static final int f3141aw = 1;

    /* renamed from: ax */
    private static final int f3142ax = 2;

    /* renamed from: d */
    public static final int f3143d = 0;

    /* renamed from: e */
    public static final int f3144e = 1;

    /* renamed from: f */
    public static final int f3145f = 2;

    /* renamed from: g */
    private static final String f3146g = "ViewPager";

    /* renamed from: h */
    private static final boolean f3147h = false;

    /* renamed from: i */
    private static final boolean f3148i = false;

    /* renamed from: j */
    private static final int f3149j = 1;

    /* renamed from: k */
    private static final int f3150k = 600;

    /* renamed from: l */
    private static final int f3151l = 25;

    /* renamed from: m */
    private static final int f3152m = 16;

    /* renamed from: n */
    private static final int f3153n = 400;

    /* renamed from: p */
    private static final Comparator<C0908b> f3154p = new Comparator<C0908b>() {
        /* renamed from: a */
        public int compare(C0908b bVar, C0908b bVar2) {
            return bVar.f3218b - bVar2.f3218b;
        }
    };

    /* renamed from: q */
    private static final Interpolator f3155q = new Interpolator() {
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };

    /* renamed from: A */
    private int f3156A;

    /* renamed from: B */
    private Drawable f3157B;

    /* renamed from: C */
    private int f3158C;

    /* renamed from: D */
    private int f3159D;

    /* renamed from: E */
    private float f3160E = -3.4028235E38f;

    /* renamed from: F */
    private float f3161F = Float.MAX_VALUE;

    /* renamed from: G */
    private int f3162G;

    /* renamed from: H */
    private int f3163H;

    /* renamed from: I */
    private boolean f3164I;

    /* renamed from: J */
    private boolean f3165J;

    /* renamed from: K */
    private boolean f3166K;

    /* renamed from: L */
    private int f3167L = 1;

    /* renamed from: M */
    private boolean f3168M;

    /* renamed from: N */
    private boolean f3169N;

    /* renamed from: O */
    private int f3170O;

    /* renamed from: P */
    private int f3171P;

    /* renamed from: Q */
    private int f3172Q;

    /* renamed from: R */
    private float f3173R;

    /* renamed from: S */
    private float f3174S;

    /* renamed from: T */
    private float f3175T;

    /* renamed from: U */
    private float f3176U;

    /* renamed from: V */
    private int f3177V = -1;

    /* renamed from: aB */
    private final Runnable f3178aB = new Runnable() {
        public void run() {
            ViewPager.this.setScrollState(0);
            ViewPager.this.mo3031d();
        }
    };

    /* renamed from: aC */
    private int f3179aC = 0;

    /* renamed from: aa */
    private VelocityTracker f3180aa;

    /* renamed from: ab */
    private int f3181ab;

    /* renamed from: ac */
    private int f3182ac;

    /* renamed from: ad */
    private int f3183ad;

    /* renamed from: ae */
    private int f3184ae;

    /* renamed from: ag */
    private boolean f3185ag;

    /* renamed from: ah */
    private long f3186ah;

    /* renamed from: ai */
    private C1323m f3187ai;

    /* renamed from: aj */
    private C1323m f3188aj;

    /* renamed from: ak */
    private boolean f3189ak = true;

    /* renamed from: al */
    private boolean f3190al = false;

    /* renamed from: am */
    private boolean f3191am;

    /* renamed from: an */
    private int f3192an;

    /* renamed from: ao */
    private List<C0912f> f3193ao;

    /* renamed from: ap */
    private C0912f f3194ap;

    /* renamed from: aq */
    private C0912f f3195aq;

    /* renamed from: ar */
    private List<C0911e> f3196ar;

    /* renamed from: as */
    private C0913g f3197as;

    /* renamed from: at */
    private int f3198at;

    /* renamed from: au */
    private Method f3199au;

    /* renamed from: ay */
    private int f3200ay;

    /* renamed from: az */
    private ArrayList<View> f3201az;

    /* renamed from: b */
    C1012af f3202b;

    /* renamed from: c */
    int f3203c;

    /* renamed from: o */
    private int f3204o;

    /* renamed from: r */
    private final ArrayList<C0908b> f3205r = new ArrayList<>();

    /* renamed from: s */
    private final C0908b f3206s = new C0908b();

    /* renamed from: t */
    private final Rect f3207t = new Rect();

    /* renamed from: u */
    private int f3208u = -1;

    /* renamed from: v */
    private Parcelable f3209v = null;

    /* renamed from: w */
    private ClassLoader f3210w = null;

    /* renamed from: x */
    private Scroller f3211x;

    /* renamed from: y */
    private boolean f3212y;

    /* renamed from: z */
    private C0914h f3213z;

    @Inherited
    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: android.support.v4.view.ViewPager$a */
    public @interface C0907a {
    }

    /* renamed from: android.support.v4.view.ViewPager$b */
    static class C0908b {

        /* renamed from: a */
        Object f3217a;

        /* renamed from: b */
        int f3218b;

        /* renamed from: c */
        boolean f3219c;

        /* renamed from: d */
        float f3220d;

        /* renamed from: e */
        float f3221e;

        C0908b() {
        }
    }

    /* renamed from: android.support.v4.view.ViewPager$c */
    public static class C0909c extends ViewGroup.LayoutParams {

        /* renamed from: a */
        public boolean f3222a;

        /* renamed from: b */
        public int f3223b;

        /* renamed from: c */
        float f3224c = 0.0f;

        /* renamed from: d */
        boolean f3225d;

        /* renamed from: e */
        int f3226e;

        /* renamed from: f */
        int f3227f;

        public C0909c() {
            super(-1, -1);
        }

        public C0909c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.f3137a);
            this.f3223b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: android.support.v4.view.ViewPager$d */
    class C0910d extends C1066b {
        C0910d() {
        }

        /* renamed from: b */
        private boolean m4584b() {
            return ViewPager.this.f3202b != null && ViewPager.this.f3202b.mo3589b() > 1;
        }

        /* renamed from: a */
        public void mo3076a(View view, C0949h hVar) {
            super.mo3076a(view, hVar);
            hVar.mo3168b((CharSequence) ViewPager.class.getName());
            hVar.mo3223l(m4584b());
            if (ViewPager.this.canScrollHorizontally(1)) {
                hVar.mo3183d(4096);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                hVar.mo3183d(8192);
            }
        }

        /* renamed from: a */
        public boolean mo3077a(View view, int i, Bundle bundle) {
            if (super.mo3077a(view, i, bundle)) {
                return true;
            }
            switch (i) {
                case 4096:
                    if (!ViewPager.this.canScrollHorizontally(1)) {
                        return false;
                    }
                    ViewPager.this.setCurrentItem(ViewPager.this.f3203c + 1);
                    return true;
                case 8192:
                    if (!ViewPager.this.canScrollHorizontally(-1)) {
                        return false;
                    }
                    ViewPager.this.setCurrentItem(ViewPager.this.f3203c - 1);
                    return true;
                default:
                    return false;
            }
        }

        /* renamed from: d */
        public void mo3078d(View view, AccessibilityEvent accessibilityEvent) {
            super.mo3078d(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            C0992u b = C0922a.m4609b(accessibilityEvent);
            b.mo3445e(m4584b());
            if (accessibilityEvent.getEventType() == 4096 && ViewPager.this.f3202b != null) {
                b.mo3428a(ViewPager.this.f3202b.mo3589b());
                b.mo3438c(ViewPager.this.f3203c);
                b.mo3442d(ViewPager.this.f3203c);
            }
        }
    }

    /* renamed from: android.support.v4.view.ViewPager$e */
    public interface C0911e {
        /* renamed from: a */
        void mo3079a(@C0047z ViewPager viewPager, @C0003aa C1012af afVar, @C0003aa C1012af afVar2);
    }

    /* renamed from: android.support.v4.view.ViewPager$f */
    public interface C0912f {
        /* renamed from: a */
        void mo3080a(int i);

        /* renamed from: a */
        void mo3081a(int i, float f, int i2);

        /* renamed from: b */
        void mo3082b(int i);
    }

    /* renamed from: android.support.v4.view.ViewPager$g */
    public interface C0913g {
        /* renamed from: a */
        void mo3083a(View view, float f);
    }

    /* renamed from: android.support.v4.view.ViewPager$h */
    private class C0914h extends DataSetObserver {
        C0914h() {
        }

        public void onChanged() {
            ViewPager.this.mo3026c();
        }

        public void onInvalidated() {
            ViewPager.this.mo3026c();
        }
    }

    /* renamed from: android.support.v4.view.ViewPager$i */
    public static class C0915i extends C0919a {
        public static final Parcelable.Creator<C0915i> CREATOR = C0808j.m4090a(new C0810k<C0915i>() {
            /* renamed from: b */
            public C0915i mo2679a(Parcel parcel, ClassLoader classLoader) {
                return new C0915i(parcel, classLoader);
            }

            /* renamed from: b */
            public C0915i[] mo2680a(int i) {
                return new C0915i[i];
            }
        });

        /* renamed from: b */
        int f3230b;

        /* renamed from: c */
        Parcelable f3231c;

        /* renamed from: d */
        ClassLoader f3232d;

        C0915i(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f3230b = parcel.readInt();
            this.f3231c = parcel.readParcelable(classLoader);
            this.f3232d = classLoader;
        }

        public C0915i(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f3230b + "}";
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f3230b);
            parcel.writeParcelable(this.f3231c, i);
        }
    }

    /* renamed from: android.support.v4.view.ViewPager$j */
    public static class C0917j implements C0912f {
        /* renamed from: a */
        public void mo3080a(int i) {
        }

        /* renamed from: a */
        public void mo3081a(int i, float f, int i2) {
        }

        /* renamed from: b */
        public void mo3082b(int i) {
        }
    }

    /* renamed from: android.support.v4.view.ViewPager$k */
    static class C0918k implements Comparator<View> {
        C0918k() {
        }

        /* renamed from: a */
        public int compare(View view, View view2) {
            C0909c cVar = (C0909c) view.getLayoutParams();
            C0909c cVar2 = (C0909c) view2.getLayoutParams();
            return cVar.f3222a != cVar2.f3222a ? cVar.f3222a ? 1 : -1 : cVar.f3226e - cVar2.f3226e;
        }
    }

    public ViewPager(Context context) {
        super(context);
        mo3001a();
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo3001a();
    }

    /* renamed from: a */
    private int m4529a(int i, float f, int i2, int i3) {
        if (Math.abs(i3) <= this.f3183ad || Math.abs(i2) <= this.f3181ab) {
            i += (int) ((i >= this.f3203c ? 0.4f : 0.6f) + f);
        } else if (i2 <= 0) {
            i++;
        }
        return this.f3205r.size() > 0 ? Math.max(this.f3205r.get(0).f3218b, Math.min(i, this.f3205r.get(this.f3205r.size() - 1).f3218b)) : i;
    }

    /* renamed from: a */
    private Rect m4530a(Rect rect, View view) {
        Rect rect2 = rect == null ? new Rect() : rect;
        if (view == null) {
            rect2.set(0, 0, 0, 0);
            return rect2;
        }
        rect2.left = view.getLeft();
        rect2.right = view.getRight();
        rect2.top = view.getTop();
        rect2.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect2.left += viewGroup.getLeft();
            rect2.right += viewGroup.getRight();
            rect2.top += viewGroup.getTop();
            rect2.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect2;
    }

    /* renamed from: a */
    private void m4531a(int i, int i2, int i3, int i4) {
        if (i2 <= 0 || this.f3205r.isEmpty()) {
            C0908b b = mo3018b(this.f3203c);
            int min = (int) ((b != null ? Math.min(b.f3221e, this.f3161F) : 0.0f) * ((float) ((i - getPaddingLeft()) - getPaddingRight())));
            if (min != getScrollX()) {
                m4535a(false);
                scrollTo(min, getScrollY());
            }
        } else if (!this.f3211x.isFinished()) {
            this.f3211x.setFinalX(getCurrentItem() * getClientWidth());
        } else {
            scrollTo((int) (((float) (((i - getPaddingLeft()) - getPaddingRight()) + i3)) * (((float) getScrollX()) / ((float) (((i2 - getPaddingLeft()) - getPaddingRight()) + i4)))), getScrollY());
        }
    }

    /* renamed from: a */
    private void m4532a(int i, boolean z, int i2, boolean z2) {
        int i3;
        C0908b b = mo3018b(i);
        if (b != null) {
            i3 = (int) (Math.max(this.f3160E, Math.min(b.f3221e, this.f3161F)) * ((float) getClientWidth()));
        } else {
            i3 = 0;
        }
        if (z) {
            mo3005a(i3, 0, i2);
            if (z2) {
                m4543e(i);
                return;
            }
            return;
        }
        if (z2) {
            m4543e(i);
        }
        m4535a(false);
        scrollTo(i3, 0);
        m4542d(i3);
    }

    /* renamed from: a */
    private void m4533a(C0908b bVar, int i, C0908b bVar2) {
        C0908b bVar3;
        C0908b bVar4;
        int b = this.f3202b.mo3589b();
        int clientWidth = getClientWidth();
        float f = clientWidth > 0 ? ((float) this.f3156A) / ((float) clientWidth) : 0.0f;
        if (bVar2 != null) {
            int i2 = bVar2.f3218b;
            if (i2 < bVar.f3218b) {
                float f2 = bVar2.f3221e + bVar2.f3220d + f;
                int i3 = i2 + 1;
                int i4 = 0;
                while (i3 <= bVar.f3218b && i4 < this.f3205r.size()) {
                    Object obj = this.f3205r.get(i4);
                    while (true) {
                        bVar4 = (C0908b) obj;
                        if (i3 > bVar4.f3218b && i4 < this.f3205r.size() - 1) {
                            i4++;
                            obj = this.f3205r.get(i4);
                        }
                    }
                    while (i3 < bVar4.f3218b) {
                        f2 += this.f3202b.mo3596d(i3) + f;
                        i3++;
                    }
                    bVar4.f3221e = f2;
                    f2 += bVar4.f3220d + f;
                    i3++;
                }
            } else if (i2 > bVar.f3218b) {
                int size = this.f3205r.size() - 1;
                float f3 = bVar2.f3221e;
                int i5 = i2 - 1;
                while (i5 >= bVar.f3218b && size >= 0) {
                    Object obj2 = this.f3205r.get(size);
                    while (true) {
                        bVar3 = (C0908b) obj2;
                        if (i5 < bVar3.f3218b && size > 0) {
                            size--;
                            obj2 = this.f3205r.get(size);
                        }
                    }
                    while (i5 > bVar3.f3218b) {
                        f3 -= this.f3202b.mo3596d(i5) + f;
                        i5--;
                    }
                    f3 -= bVar3.f3220d + f;
                    bVar3.f3221e = f3;
                    i5--;
                }
            }
        }
        int size2 = this.f3205r.size();
        float f4 = bVar.f3221e;
        int i6 = bVar.f3218b - 1;
        this.f3160E = bVar.f3218b == 0 ? bVar.f3221e : -3.4028235E38f;
        this.f3161F = bVar.f3218b == b + -1 ? (bVar.f3221e + bVar.f3220d) - 1.0f : Float.MAX_VALUE;
        for (int i7 = i - 1; i7 >= 0; i7--) {
            C0908b bVar5 = this.f3205r.get(i7);
            float f5 = f4;
            while (i6 > bVar5.f3218b) {
                f5 -= this.f3202b.mo3596d(i6) + f;
                i6--;
            }
            f4 = f5 - (bVar5.f3220d + f);
            bVar5.f3221e = f4;
            if (bVar5.f3218b == 0) {
                this.f3160E = f4;
            }
            i6--;
        }
        float f6 = bVar.f3221e + bVar.f3220d + f;
        int i8 = bVar.f3218b + 1;
        for (int i9 = i + 1; i9 < size2; i9++) {
            C0908b bVar6 = this.f3205r.get(i9);
            float f7 = f6;
            while (i8 < bVar6.f3218b) {
                f7 = this.f3202b.mo3596d(i8) + f + f7;
                i8++;
            }
            if (bVar6.f3218b == b - 1) {
                this.f3161F = (bVar6.f3220d + f7) - 1.0f;
            }
            bVar6.f3221e = f7;
            f6 = f7 + bVar6.f3220d + f;
            i8++;
        }
        this.f3190al = false;
    }

    /* renamed from: a */
    private void m4534a(MotionEvent motionEvent) {
        int b = C1200x.m7133b(motionEvent);
        if (motionEvent.getPointerId(b) == this.f3177V) {
            int i = b == 0 ? 1 : 0;
            this.f3173R = motionEvent.getX(i);
            this.f3177V = motionEvent.getPointerId(i);
            if (this.f3180aa != null) {
                this.f3180aa.clear();
            }
        }
    }

    /* renamed from: a */
    private void m4535a(boolean z) {
        boolean z2 = this.f3179aC == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!this.f3211x.isFinished()) {
                this.f3211x.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f3211x.getCurrX();
                int currY = this.f3211x.getCurrY();
                if (!(scrollX == currX && scrollY == currY)) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        m4542d(currX);
                    }
                }
            }
        }
        this.f3166K = false;
        boolean z3 = z2;
        for (int i = 0; i < this.f3205r.size(); i++) {
            C0908b bVar = this.f3205r.get(i);
            if (bVar.f3219c) {
                bVar.f3219c = false;
                z3 = true;
            }
        }
        if (!z3) {
            return;
        }
        if (z) {
            C1040ar.m5895a((View) this, this.f3178aB);
        } else {
            this.f3178aB.run();
        }
    }

    /* renamed from: a */
    private boolean m4536a(float f, float f2) {
        return (f < ((float) this.f3171P) && f2 > 0.0f) || (f > ((float) (getWidth() - this.f3171P)) && f2 < 0.0f);
    }

    /* renamed from: b */
    private void m4537b(int i, float f, int i2) {
        if (this.f3194ap != null) {
            this.f3194ap.mo3081a(i, f, i2);
        }
        if (this.f3193ao != null) {
            int size = this.f3193ao.size();
            for (int i3 = 0; i3 < size; i3++) {
                C0912f fVar = this.f3193ao.get(i3);
                if (fVar != null) {
                    fVar.mo3081a(i, f, i2);
                }
            }
        }
        if (this.f3195aq != null) {
            this.f3195aq.mo3081a(i, f, i2);
        }
    }

    /* renamed from: b */
    private void m4538b(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            C1040ar.m5884a(getChildAt(i), z ? this.f3198at : 0, (Paint) null);
        }
    }

    /* renamed from: c */
    private void m4539c(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    /* renamed from: c */
    private boolean m4540c(float f) {
        boolean z;
        float f2;
        boolean z2 = true;
        boolean z3 = false;
        this.f3173R = f;
        float scrollX = ((float) getScrollX()) + (this.f3173R - f);
        int clientWidth = getClientWidth();
        float f3 = ((float) clientWidth) * this.f3160E;
        float f4 = ((float) clientWidth) * this.f3161F;
        C0908b bVar = this.f3205r.get(0);
        C0908b bVar2 = this.f3205r.get(this.f3205r.size() - 1);
        if (bVar.f3218b != 0) {
            f3 = bVar.f3221e * ((float) clientWidth);
            z = false;
        } else {
            z = true;
        }
        if (bVar2.f3218b != this.f3202b.mo3589b() - 1) {
            f2 = bVar2.f3221e * ((float) clientWidth);
            z2 = false;
        } else {
            f2 = f4;
        }
        if (scrollX < f3) {
            if (z) {
                z3 = this.f3187ai.mo4470a(Math.abs(f3 - scrollX) / ((float) clientWidth));
            }
        } else if (scrollX > f2) {
            if (z2) {
                z3 = this.f3188aj.mo4470a(Math.abs(scrollX - f2) / ((float) clientWidth));
            }
            f3 = f2;
        } else {
            f3 = scrollX;
        }
        this.f3173R += f3 - ((float) ((int) f3));
        scrollTo((int) f3, getScrollY());
        m4542d((int) f3);
        return z3;
    }

    /* renamed from: c */
    private static boolean m4541c(@C0047z View view) {
        return view.getClass().getAnnotation(C0907a.class) != null;
    }

    /* renamed from: d */
    private boolean m4542d(int i) {
        if (this.f3205r.size() != 0) {
            C0908b m = m4548m();
            int clientWidth = getClientWidth();
            int i2 = this.f3156A + clientWidth;
            float f = ((float) this.f3156A) / ((float) clientWidth);
            int i3 = m.f3218b;
            float f2 = ((((float) i) / ((float) clientWidth)) - m.f3221e) / (m.f3220d + f);
            this.f3191am = false;
            mo3003a(i3, f2, (int) (((float) i2) * f2));
            if (this.f3191am) {
                return true;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        } else if (this.f3189ak) {
            return false;
        } else {
            this.f3191am = false;
            mo3003a(0, 0.0f, 0);
            if (this.f3191am) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
    }

    /* renamed from: e */
    private void m4543e(int i) {
        if (this.f3194ap != null) {
            this.f3194ap.mo3080a(i);
        }
        if (this.f3193ao != null) {
            int size = this.f3193ao.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0912f fVar = this.f3193ao.get(i2);
                if (fVar != null) {
                    fVar.mo3080a(i);
                }
            }
        }
        if (this.f3195aq != null) {
            this.f3195aq.mo3080a(i);
        }
    }

    /* renamed from: f */
    private void m4544f(int i) {
        if (this.f3194ap != null) {
            this.f3194ap.mo3082b(i);
        }
        if (this.f3193ao != null) {
            int size = this.f3193ao.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0912f fVar = this.f3193ao.get(i2);
                if (fVar != null) {
                    fVar.mo3082b(i);
                }
            }
        }
        if (this.f3195aq != null) {
            this.f3195aq.mo3082b(i);
        }
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    /* renamed from: j */
    private void m4545j() {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < getChildCount()) {
                if (!((C0909c) getChildAt(i2).getLayoutParams()).f3222a) {
                    removeViewAt(i2);
                    i2--;
                }
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    /* renamed from: k */
    private void m4546k() {
        if (this.f3200ay != 0) {
            if (this.f3201az == null) {
                this.f3201az = new ArrayList<>();
            } else {
                this.f3201az.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.f3201az.add(getChildAt(i));
            }
            Collections.sort(this.f3201az, f3138aA);
        }
    }

    /* renamed from: l */
    private boolean m4547l() {
        this.f3177V = -1;
        m4549n();
        return this.f3187ai.mo4475c() | this.f3188aj.mo4475c();
    }

    /* renamed from: m */
    private C0908b m4548m() {
        int i;
        C0908b bVar;
        int clientWidth = getClientWidth();
        float scrollX = clientWidth > 0 ? ((float) getScrollX()) / ((float) clientWidth) : 0.0f;
        float f = clientWidth > 0 ? ((float) this.f3156A) / ((float) clientWidth) : 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i2 = -1;
        int i3 = 0;
        boolean z = true;
        C0908b bVar2 = null;
        while (i3 < this.f3205r.size()) {
            C0908b bVar3 = this.f3205r.get(i3);
            if (z || bVar3.f3218b == i2 + 1) {
                C0908b bVar4 = bVar3;
                i = i3;
                bVar = bVar4;
            } else {
                C0908b bVar5 = this.f3206s;
                bVar5.f3221e = f2 + f3 + f;
                bVar5.f3218b = i2 + 1;
                bVar5.f3220d = this.f3202b.mo3596d(bVar5.f3218b);
                C0908b bVar6 = bVar5;
                i = i3 - 1;
                bVar = bVar6;
            }
            float f4 = bVar.f3221e;
            float f5 = bVar.f3220d + f4 + f;
            if (!z && scrollX < f4) {
                return bVar2;
            }
            if (scrollX < f5 || i == this.f3205r.size() - 1) {
                return bVar;
            }
            f3 = f4;
            i2 = bVar.f3218b;
            z = false;
            f2 = bVar.f3220d;
            bVar2 = bVar;
            i3 = i + 1;
        }
        return bVar2;
    }

    /* renamed from: n */
    private void m4549n() {
        this.f3168M = false;
        this.f3169N = false;
        if (this.f3180aa != null) {
            this.f3180aa.recycle();
            this.f3180aa = null;
        }
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.f3165J != z) {
            this.f3165J = z;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public float mo2999a(float f) {
        return (float) Math.sin((double) ((float) (((double) (f - 0.5f)) * 0.4712389167638204d)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0908b mo3000a(View view) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.f3205r.size()) {
                return null;
            }
            C0908b bVar = this.f3205r.get(i2);
            if (this.f3202b.mo1194a(view, bVar.f3217a)) {
                return bVar;
            }
            i = i2 + 1;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3001a() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f3211x = new Scroller(context, f3155q);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.f3172Q = viewConfiguration.getScaledPagingTouchSlop();
        this.f3181ab = (int) (400.0f * f);
        this.f3182ac = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f3187ai = new C1323m(context);
        this.f3188aj = new C1323m(context);
        this.f3183ad = (int) (25.0f * f);
        this.f3184ae = (int) (2.0f * f);
        this.f3170O = (int) (16.0f * f);
        C1040ar.m5893a((View) this, (C1066b) new C0910d());
        if (C1040ar.m5928e(this) == 0) {
            C1040ar.m5926d((View) this, 1);
        }
        C1040ar.m5891a((View) this, (C1011ae) new C1011ae() {

            /* renamed from: b */
            private final Rect f3216b = new Rect();

            /* renamed from: a */
            public C1134by mo3075a(View view, C1134by byVar) {
                C1134by a = C1040ar.m5880a(view, byVar);
                if (a.mo3913g()) {
                    return a;
                }
                Rect rect = this.f3216b;
                rect.left = a.mo3904a();
                rect.top = a.mo3907b();
                rect.right = a.mo3908c();
                rect.bottom = a.mo3909d();
                int childCount = ViewPager.this.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    C1134by b = C1040ar.m5913b(ViewPager.this.getChildAt(i), a);
                    rect.left = Math.min(b.mo3904a(), rect.left);
                    rect.top = Math.min(b.mo3907b(), rect.top);
                    rect.right = Math.min(b.mo3908c(), rect.right);
                    rect.bottom = Math.min(b.mo3909d(), rect.bottom);
                }
                return a.mo3905a(rect.left, rect.top, rect.right, rect.bottom);
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00f0, code lost:
        if (r2.f3218b == r17.f3203c) goto L_0x00f2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3002a(int r18) {
        /*
            r17 = this;
            r2 = 0
            r0 = r17
            int r3 = r0.f3203c
            r0 = r18
            if (r3 == r0) goto L_0x0323
            r0 = r17
            int r2 = r0.f3203c
            r0 = r17
            android.support.v4.view.ViewPager$b r2 = r0.mo3018b((int) r2)
            r0 = r18
            r1 = r17
            r1.f3203c = r0
            r3 = r2
        L_0x001a:
            r0 = r17
            android.support.v4.view.af r2 = r0.f3202b
            if (r2 != 0) goto L_0x0024
            r17.m4546k()
        L_0x0023:
            return
        L_0x0024:
            r0 = r17
            boolean r2 = r0.f3166K
            if (r2 == 0) goto L_0x002e
            r17.m4546k()
            goto L_0x0023
        L_0x002e:
            android.os.IBinder r2 = r17.getWindowToken()
            if (r2 == 0) goto L_0x0023
            r0 = r17
            android.support.v4.view.af r2 = r0.f3202b
            r0 = r17
            r2.mo1192a((android.view.ViewGroup) r0)
            r0 = r17
            int r2 = r0.f3167L
            r4 = 0
            r0 = r17
            int r5 = r0.f3203c
            int r5 = r5 - r2
            int r10 = java.lang.Math.max(r4, r5)
            r0 = r17
            android.support.v4.view.af r4 = r0.f3202b
            int r11 = r4.mo3589b()
            int r4 = r11 + -1
            r0 = r17
            int r5 = r0.f3203c
            int r2 = r2 + r5
            int r12 = java.lang.Math.min(r4, r2)
            r0 = r17
            int r2 = r0.f3204o
            if (r11 == r2) goto L_0x00cb
            android.content.res.Resources r2 = r17.getResources()     // Catch:{ NotFoundException -> 0x00c1 }
            int r3 = r17.getId()     // Catch:{ NotFoundException -> 0x00c1 }
            java.lang.String r2 = r2.getResourceName(r3)     // Catch:{ NotFoundException -> 0x00c1 }
        L_0x0070:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: "
            java.lang.StringBuilder r4 = r4.append(r5)
            r0 = r17
            int r5 = r0.f3204o
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = ", found: "
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r4 = r4.append(r11)
            java.lang.String r5 = " Pager id: "
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r2 = r4.append(r2)
            java.lang.String r4 = " Pager class: "
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.Class r4 = r17.getClass()
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r4 = " Problematic adapter: "
            java.lang.StringBuilder r2 = r2.append(r4)
            r0 = r17
            android.support.v4.view.af r4 = r0.f3202b
            java.lang.Class r4 = r4.getClass()
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
        L_0x00c1:
            r2 = move-exception
            int r2 = r17.getId()
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            goto L_0x0070
        L_0x00cb:
            r5 = 0
            r2 = 0
            r4 = r2
        L_0x00ce:
            r0 = r17
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r2 = r0.f3205r
            int r2 = r2.size()
            if (r4 >= r2) goto L_0x0320
            r0 = r17
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r2 = r0.f3205r
            java.lang.Object r2 = r2.get(r4)
            android.support.v4.view.ViewPager$b r2 = (android.support.p010v4.view.ViewPager.C0908b) r2
            int r6 = r2.f3218b
            r0 = r17
            int r7 = r0.f3203c
            if (r6 < r7) goto L_0x01bc
            int r6 = r2.f3218b
            r0 = r17
            int r7 = r0.f3203c
            if (r6 != r7) goto L_0x0320
        L_0x00f2:
            if (r2 != 0) goto L_0x031d
            if (r11 <= 0) goto L_0x031d
            r0 = r17
            int r2 = r0.f3203c
            r0 = r17
            android.support.v4.view.ViewPager$b r2 = r0.mo3019b(r2, r4)
            r9 = r2
        L_0x0101:
            if (r9 == 0) goto L_0x016d
            r8 = 0
            int r7 = r4 + -1
            if (r7 < 0) goto L_0x01c1
            r0 = r17
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r2 = r0.f3205r
            java.lang.Object r2 = r2.get(r7)
            android.support.v4.view.ViewPager$b r2 = (android.support.p010v4.view.ViewPager.C0908b) r2
        L_0x0112:
            int r13 = r17.getClientWidth()
            if (r13 > 0) goto L_0x01c4
            r5 = 0
        L_0x0119:
            r0 = r17
            int r6 = r0.f3203c
            int r6 = r6 + -1
            r15 = r6
            r6 = r8
            r8 = r15
            r16 = r7
            r7 = r4
            r4 = r16
        L_0x0127:
            if (r8 < 0) goto L_0x0131
            int r14 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r14 < 0) goto L_0x0203
            if (r8 >= r10) goto L_0x0203
            if (r2 != 0) goto L_0x01d3
        L_0x0131:
            float r5 = r9.f3220d
            int r8 = r7 + 1
            r2 = 1073741824(0x40000000, float:2.0)
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x0168
            r0 = r17
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r2 = r0.f3205r
            int r2 = r2.size()
            if (r8 >= r2) goto L_0x0239
            r0 = r17
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r2 = r0.f3205r
            java.lang.Object r2 = r2.get(r8)
            android.support.v4.view.ViewPager$b r2 = (android.support.p010v4.view.ViewPager.C0908b) r2
            r6 = r2
        L_0x0150:
            if (r13 > 0) goto L_0x023c
            r2 = 0
            r4 = r2
        L_0x0154:
            r0 = r17
            int r2 = r0.f3203c
            int r2 = r2 + 1
            r15 = r2
            r2 = r6
            r6 = r8
            r8 = r15
        L_0x015e:
            if (r8 >= r11) goto L_0x0168
            int r10 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r10 < 0) goto L_0x0283
            if (r8 <= r12) goto L_0x0283
            if (r2 != 0) goto L_0x0249
        L_0x0168:
            r0 = r17
            r0.m4533a((android.support.p010v4.view.ViewPager.C0908b) r9, (int) r7, (android.support.p010v4.view.ViewPager.C0908b) r3)
        L_0x016d:
            r0 = r17
            android.support.v4.view.af r3 = r0.f3202b
            r0 = r17
            int r4 = r0.f3203c
            if (r9 == 0) goto L_0x02cd
            java.lang.Object r2 = r9.f3217a
        L_0x0179:
            r0 = r17
            r3.mo1197b((android.view.ViewGroup) r0, (int) r4, (java.lang.Object) r2)
            r0 = r17
            android.support.v4.view.af r2 = r0.f3202b
            r0 = r17
            r2.mo1196b((android.view.ViewGroup) r0)
            int r4 = r17.getChildCount()
            r2 = 0
            r3 = r2
        L_0x018d:
            if (r3 >= r4) goto L_0x02d0
            r0 = r17
            android.view.View r5 = r0.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r2 = r5.getLayoutParams()
            android.support.v4.view.ViewPager$c r2 = (android.support.p010v4.view.ViewPager.C0909c) r2
            r2.f3227f = r3
            boolean r6 = r2.f3222a
            if (r6 != 0) goto L_0x01b8
            float r6 = r2.f3224c
            r7 = 0
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 != 0) goto L_0x01b8
            r0 = r17
            android.support.v4.view.ViewPager$b r5 = r0.mo3000a((android.view.View) r5)
            if (r5 == 0) goto L_0x01b8
            float r6 = r5.f3220d
            r2.f3224c = r6
            int r5 = r5.f3218b
            r2.f3226e = r5
        L_0x01b8:
            int r2 = r3 + 1
            r3 = r2
            goto L_0x018d
        L_0x01bc:
            int r2 = r4 + 1
            r4 = r2
            goto L_0x00ce
        L_0x01c1:
            r2 = 0
            goto L_0x0112
        L_0x01c4:
            r5 = 1073741824(0x40000000, float:2.0)
            float r6 = r9.f3220d
            float r5 = r5 - r6
            int r6 = r17.getPaddingLeft()
            float r6 = (float) r6
            float r14 = (float) r13
            float r6 = r6 / r14
            float r5 = r5 + r6
            goto L_0x0119
        L_0x01d3:
            int r14 = r2.f3218b
            if (r8 != r14) goto L_0x01fd
            boolean r14 = r2.f3219c
            if (r14 != 0) goto L_0x01fd
            r0 = r17
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r14 = r0.f3205r
            r14.remove(r4)
            r0 = r17
            android.support.v4.view.af r14 = r0.f3202b
            java.lang.Object r2 = r2.f3217a
            r0 = r17
            r14.mo1193a((android.view.ViewGroup) r0, (int) r8, (java.lang.Object) r2)
            int r4 = r4 + -1
            int r7 = r7 + -1
            if (r4 < 0) goto L_0x0201
            r0 = r17
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r2 = r0.f3205r
            java.lang.Object r2 = r2.get(r4)
            android.support.v4.view.ViewPager$b r2 = (android.support.p010v4.view.ViewPager.C0908b) r2
        L_0x01fd:
            int r8 = r8 + -1
            goto L_0x0127
        L_0x0201:
            r2 = 0
            goto L_0x01fd
        L_0x0203:
            if (r2 == 0) goto L_0x021d
            int r14 = r2.f3218b
            if (r8 != r14) goto L_0x021d
            float r2 = r2.f3220d
            float r6 = r6 + r2
            int r4 = r4 + -1
            if (r4 < 0) goto L_0x021b
            r0 = r17
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r2 = r0.f3205r
            java.lang.Object r2 = r2.get(r4)
            android.support.v4.view.ViewPager$b r2 = (android.support.p010v4.view.ViewPager.C0908b) r2
            goto L_0x01fd
        L_0x021b:
            r2 = 0
            goto L_0x01fd
        L_0x021d:
            int r2 = r4 + 1
            r0 = r17
            android.support.v4.view.ViewPager$b r2 = r0.mo3019b(r8, r2)
            float r2 = r2.f3220d
            float r6 = r6 + r2
            int r7 = r7 + 1
            if (r4 < 0) goto L_0x0237
            r0 = r17
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r2 = r0.f3205r
            java.lang.Object r2 = r2.get(r4)
            android.support.v4.view.ViewPager$b r2 = (android.support.p010v4.view.ViewPager.C0908b) r2
            goto L_0x01fd
        L_0x0237:
            r2 = 0
            goto L_0x01fd
        L_0x0239:
            r6 = 0
            goto L_0x0150
        L_0x023c:
            int r2 = r17.getPaddingRight()
            float r2 = (float) r2
            float r4 = (float) r13
            float r2 = r2 / r4
            r4 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 + r4
            r4 = r2
            goto L_0x0154
        L_0x0249:
            int r10 = r2.f3218b
            if (r8 != r10) goto L_0x0318
            boolean r10 = r2.f3219c
            if (r10 != 0) goto L_0x0318
            r0 = r17
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r10 = r0.f3205r
            r10.remove(r6)
            r0 = r17
            android.support.v4.view.af r10 = r0.f3202b
            java.lang.Object r2 = r2.f3217a
            r0 = r17
            r10.mo1193a((android.view.ViewGroup) r0, (int) r8, (java.lang.Object) r2)
            r0 = r17
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r2 = r0.f3205r
            int r2 = r2.size()
            if (r6 >= r2) goto L_0x0281
            r0 = r17
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r2 = r0.f3205r
            java.lang.Object r2 = r2.get(r6)
            android.support.v4.view.ViewPager$b r2 = (android.support.p010v4.view.ViewPager.C0908b) r2
        L_0x0277:
            r15 = r5
            r5 = r2
            r2 = r15
        L_0x027a:
            int r8 = r8 + 1
            r15 = r2
            r2 = r5
            r5 = r15
            goto L_0x015e
        L_0x0281:
            r2 = 0
            goto L_0x0277
        L_0x0283:
            if (r2 == 0) goto L_0x02a8
            int r10 = r2.f3218b
            if (r8 != r10) goto L_0x02a8
            float r2 = r2.f3220d
            float r5 = r5 + r2
            int r6 = r6 + 1
            r0 = r17
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r2 = r0.f3205r
            int r2 = r2.size()
            if (r6 >= r2) goto L_0x02a6
            r0 = r17
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r2 = r0.f3205r
            java.lang.Object r2 = r2.get(r6)
            android.support.v4.view.ViewPager$b r2 = (android.support.p010v4.view.ViewPager.C0908b) r2
        L_0x02a2:
            r15 = r5
            r5 = r2
            r2 = r15
            goto L_0x027a
        L_0x02a6:
            r2 = 0
            goto L_0x02a2
        L_0x02a8:
            r0 = r17
            android.support.v4.view.ViewPager$b r2 = r0.mo3019b(r8, r6)
            int r6 = r6 + 1
            float r2 = r2.f3220d
            float r5 = r5 + r2
            r0 = r17
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r2 = r0.f3205r
            int r2 = r2.size()
            if (r6 >= r2) goto L_0x02cb
            r0 = r17
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r2 = r0.f3205r
            java.lang.Object r2 = r2.get(r6)
            android.support.v4.view.ViewPager$b r2 = (android.support.p010v4.view.ViewPager.C0908b) r2
        L_0x02c7:
            r15 = r5
            r5 = r2
            r2 = r15
            goto L_0x027a
        L_0x02cb:
            r2 = 0
            goto L_0x02c7
        L_0x02cd:
            r2 = 0
            goto L_0x0179
        L_0x02d0:
            r17.m4546k()
            boolean r2 = r17.hasFocus()
            if (r2 == 0) goto L_0x0023
            android.view.View r2 = r17.findFocus()
            if (r2 == 0) goto L_0x0316
            r0 = r17
            android.support.v4.view.ViewPager$b r2 = r0.mo3020b((android.view.View) r2)
        L_0x02e5:
            if (r2 == 0) goto L_0x02ef
            int r2 = r2.f3218b
            r0 = r17
            int r3 = r0.f3203c
            if (r2 == r3) goto L_0x0023
        L_0x02ef:
            r2 = 0
        L_0x02f0:
            int r3 = r17.getChildCount()
            if (r2 >= r3) goto L_0x0023
            r0 = r17
            android.view.View r3 = r0.getChildAt(r2)
            r0 = r17
            android.support.v4.view.ViewPager$b r4 = r0.mo3000a((android.view.View) r3)
            if (r4 == 0) goto L_0x0313
            int r4 = r4.f3218b
            r0 = r17
            int r5 = r0.f3203c
            if (r4 != r5) goto L_0x0313
            r4 = 2
            boolean r3 = r3.requestFocus(r4)
            if (r3 != 0) goto L_0x0023
        L_0x0313:
            int r2 = r2 + 1
            goto L_0x02f0
        L_0x0316:
            r2 = 0
            goto L_0x02e5
        L_0x0318:
            r15 = r5
            r5 = r2
            r2 = r15
            goto L_0x027a
        L_0x031d:
            r9 = r2
            goto L_0x0101
        L_0x0320:
            r2 = r5
            goto L_0x00f2
        L_0x0323:
            r3 = r2
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p010v4.view.ViewPager.mo3002a(int):void");
    }

    /* access modifiers changed from: protected */
    @C0030i
    /* renamed from: a */
    public void mo3003a(int i, float f, int i2) {
        int measuredWidth;
        int i3;
        int i4;
        if (this.f3192an > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width = getWidth();
            int childCount = getChildCount();
            int i5 = 0;
            while (i5 < childCount) {
                View childAt = getChildAt(i5);
                C0909c cVar = (C0909c) childAt.getLayoutParams();
                if (!cVar.f3222a) {
                    int i6 = paddingRight;
                    i3 = paddingLeft;
                    i4 = i6;
                } else {
                    switch (cVar.f3223b & 7) {
                        case 1:
                            measuredWidth = Math.max((width - childAt.getMeasuredWidth()) / 2, paddingLeft);
                            int i7 = paddingRight;
                            i3 = paddingLeft;
                            i4 = i7;
                            break;
                        case 3:
                            int width2 = childAt.getWidth() + paddingLeft;
                            int i8 = paddingLeft;
                            i4 = paddingRight;
                            i3 = width2;
                            measuredWidth = i8;
                            break;
                        case 5:
                            measuredWidth = (width - paddingRight) - childAt.getMeasuredWidth();
                            int measuredWidth2 = paddingRight + childAt.getMeasuredWidth();
                            i3 = paddingLeft;
                            i4 = measuredWidth2;
                            break;
                        default:
                            measuredWidth = paddingLeft;
                            int i9 = paddingRight;
                            i3 = paddingLeft;
                            i4 = i9;
                            break;
                    }
                    int left = (measuredWidth + scrollX) - childAt.getLeft();
                    if (left != 0) {
                        childAt.offsetLeftAndRight(left);
                    }
                }
                i5++;
                int i10 = i4;
                paddingLeft = i3;
                paddingRight = i10;
            }
        }
        m4537b(i, f, i2);
        if (this.f3197as != null) {
            int scrollX2 = getScrollX();
            int childCount2 = getChildCount();
            for (int i11 = 0; i11 < childCount2; i11++) {
                View childAt2 = getChildAt(i11);
                if (!((C0909c) childAt2.getLayoutParams()).f3222a) {
                    this.f3197as.mo3083a(childAt2, ((float) (childAt2.getLeft() - scrollX2)) / ((float) getClientWidth()));
                }
            }
        }
        this.f3191am = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3004a(int i, int i2) {
        mo3005a(i, i2, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3005a(int i, int i2, int i3) {
        int scrollX;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (this.f3211x != null && !this.f3211x.isFinished()) {
            int currX = this.f3212y ? this.f3211x.getCurrX() : this.f3211x.getStartX();
            this.f3211x.abortAnimation();
            setScrollingCacheEnabled(false);
            scrollX = currX;
        } else {
            scrollX = getScrollX();
        }
        int scrollY = getScrollY();
        int i4 = i - scrollX;
        int i5 = i2 - scrollY;
        if (i4 == 0 && i5 == 0) {
            m4535a(false);
            mo3031d();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i6 = clientWidth / 2;
        float a = (((float) i6) * mo2999a(Math.min(1.0f, (((float) Math.abs(i4)) * 1.0f) / ((float) clientWidth)))) + ((float) i6);
        int abs = Math.abs(i3);
        int min = Math.min(abs > 0 ? Math.round(1000.0f * Math.abs(a / ((float) abs))) * 4 : (int) (((((float) Math.abs(i4)) / ((((float) clientWidth) * this.f3202b.mo3596d(this.f3203c)) + ((float) this.f3156A))) + 1.0f) * 100.0f), f3150k);
        this.f3212y = false;
        this.f3211x.startScroll(scrollX, scrollY, i4, i5, min);
        C1040ar.m5924d(this);
    }

    /* renamed from: a */
    public void mo3006a(int i, boolean z) {
        this.f3166K = false;
        mo3007a(i, z, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3007a(int i, boolean z, boolean z2) {
        mo3008a(i, z, z2, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3008a(int i, boolean z, boolean z2, int i2) {
        boolean z3 = false;
        if (this.f3202b == null || this.f3202b.mo3589b() <= 0) {
            setScrollingCacheEnabled(false);
        } else if (z2 || this.f3203c != i || this.f3205r.size() == 0) {
            if (i < 0) {
                i = 0;
            } else if (i >= this.f3202b.mo3589b()) {
                i = this.f3202b.mo3589b() - 1;
            }
            int i3 = this.f3167L;
            if (i > this.f3203c + i3 || i < this.f3203c - i3) {
                for (int i4 = 0; i4 < this.f3205r.size(); i4++) {
                    this.f3205r.get(i4).f3219c = true;
                }
            }
            if (this.f3203c != i) {
                z3 = true;
            }
            if (this.f3189ak) {
                this.f3203c = i;
                if (z3) {
                    m4543e(i);
                }
                requestLayout();
                return;
            }
            mo3002a(i);
            m4532a(i, z, i2, z3);
        } else {
            setScrollingCacheEnabled(false);
        }
    }

    /* renamed from: a */
    public void mo3009a(@C0047z C0911e eVar) {
        if (this.f3196ar == null) {
            this.f3196ar = new ArrayList();
        }
        this.f3196ar.add(eVar);
    }

    /* renamed from: a */
    public void mo3010a(C0912f fVar) {
        if (this.f3193ao == null) {
            this.f3193ao = new ArrayList();
        }
        this.f3193ao.add(fVar);
    }

    /* renamed from: a */
    public void mo3011a(boolean z, C0913g gVar) {
        mo3012a(z, gVar, 2);
    }

    /* renamed from: a */
    public void mo3012a(boolean z, C0913g gVar, int i) {
        int i2 = 1;
        if (Build.VERSION.SDK_INT >= 11) {
            boolean z2 = gVar != null;
            boolean z3 = z2 != (this.f3197as != null);
            this.f3197as = gVar;
            setChildrenDrawingOrderEnabledCompat(z2);
            if (z2) {
                if (z) {
                    i2 = 2;
                }
                this.f3200ay = i2;
                this.f3198at = i;
            } else {
                this.f3200ay = 0;
            }
            if (z3) {
                mo3031d();
            }
        }
    }

    /* renamed from: a */
    public boolean mo3013a(KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0) {
            return false;
        }
        switch (keyEvent.getKeyCode()) {
            case 21:
                return mo3027c(17);
            case 22:
                return mo3027c(66);
            case 61:
                if (Build.VERSION.SDK_INT < 11) {
                    return false;
                }
                if (C1167k.m6999a(keyEvent)) {
                    return mo3027c(2);
                }
                if (C1167k.m7000a(keyEvent, 1)) {
                    return mo3027c(1);
                }
                return false;
            default:
                return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo3014a(View view, boolean z, int i, int i2, int i3) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (i2 + scrollX >= childAt.getLeft() && i2 + scrollX < childAt.getRight() && i3 + scrollY >= childAt.getTop() && i3 + scrollY < childAt.getBottom()) {
                    if (mo3014a(childAt, true, i, (i2 + scrollX) - childAt.getLeft(), (i3 + scrollY) - childAt.getTop())) {
                        return true;
                    }
                }
            }
        }
        return z && C1040ar.m5902a(view, -i);
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        C0908b a;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (a = mo3000a(childAt)) != null && a.f3218b == this.f3203c) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
        }
        if ((descendantFocusability == 262144 && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if (((i2 & 1) != 1 || !isInTouchMode() || isFocusableInTouchMode()) && arrayList != null) {
            arrayList.add(this);
        }
    }

    public void addTouchables(ArrayList<View> arrayList) {
        C0908b a;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (a = mo3000a(childAt)) != null && a.f3218b == this.f3203c) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        ViewGroup.LayoutParams generateLayoutParams = !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : layoutParams;
        C0909c cVar = (C0909c) generateLayoutParams;
        cVar.f3222a |= m4541c(view);
        if (!this.f3164I) {
            super.addView(view, i, generateLayoutParams);
        } else if (cVar == null || !cVar.f3222a) {
            cVar.f3225d = true;
            addViewInLayout(view, i, generateLayoutParams);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0908b mo3018b(int i) {
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= this.f3205r.size()) {
                return null;
            }
            C0908b bVar = this.f3205r.get(i3);
            if (bVar.f3218b == i) {
                return bVar;
            }
            i2 = i3 + 1;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0908b mo3019b(int i, int i2) {
        C0908b bVar = new C0908b();
        bVar.f3218b = i;
        bVar.f3217a = this.f3202b.mo1190a((ViewGroup) this, i);
        bVar.f3220d = this.f3202b.mo3596d(i);
        if (i2 < 0 || i2 >= this.f3205r.size()) {
            this.f3205r.add(bVar);
        } else {
            this.f3205r.add(i2, bVar);
        }
        return bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0908b mo3020b(View view) {
        while (true) {
            ViewParent parent = view.getParent();
            if (parent == this) {
                return mo3000a(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
        return null;
    }

    /* renamed from: b */
    public void mo3021b() {
        if (this.f3193ao != null) {
            this.f3193ao.clear();
        }
    }

    /* renamed from: b */
    public void mo3022b(float f) {
        if (!this.f3185ag) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        } else if (this.f3202b != null) {
            this.f3173R += f;
            float scrollX = ((float) getScrollX()) - f;
            int clientWidth = getClientWidth();
            float f2 = ((float) clientWidth) * this.f3160E;
            float f3 = ((float) clientWidth) * this.f3161F;
            C0908b bVar = this.f3205r.get(0);
            C0908b bVar2 = this.f3205r.get(this.f3205r.size() - 1);
            float f4 = bVar.f3218b != 0 ? bVar.f3221e * ((float) clientWidth) : f2;
            float f5 = bVar2.f3218b != this.f3202b.mo3589b() + -1 ? bVar2.f3221e * ((float) clientWidth) : f3;
            if (scrollX >= f4) {
                f4 = scrollX > f5 ? f5 : scrollX;
            }
            this.f3173R += f4 - ((float) ((int) f4));
            scrollTo((int) f4, getScrollY());
            m4542d((int) f4);
            MotionEvent obtain = MotionEvent.obtain(this.f3186ah, SystemClock.uptimeMillis(), 2, this.f3173R, 0.0f, 0);
            this.f3180aa.addMovement(obtain);
            obtain.recycle();
        }
    }

    /* renamed from: b */
    public void mo3023b(@C0047z C0911e eVar) {
        if (this.f3196ar != null) {
            this.f3196ar.remove(eVar);
        }
    }

    /* renamed from: b */
    public void mo3024b(C0912f fVar) {
        if (this.f3193ao != null) {
            this.f3193ao.remove(fVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C0912f mo3025c(C0912f fVar) {
        C0912f fVar2 = this.f3195aq;
        this.f3195aq = fVar;
        return fVar2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo3026c() {
        int i;
        boolean z;
        int i2;
        boolean z2;
        int b = this.f3202b.mo3589b();
        this.f3204o = b;
        boolean z3 = this.f3205r.size() < (this.f3167L * 2) + 1 && this.f3205r.size() < b;
        boolean z4 = false;
        int i3 = this.f3203c;
        boolean z5 = z3;
        int i4 = 0;
        while (i4 < this.f3205r.size()) {
            C0908b bVar = this.f3205r.get(i4);
            int a = this.f3202b.mo3584a(bVar.f3217a);
            if (a == -1) {
                i = i4;
                z = z4;
                i2 = i3;
                z2 = z5;
            } else if (a == -2) {
                this.f3205r.remove(i4);
                int i5 = i4 - 1;
                if (!z4) {
                    this.f3202b.mo1192a((ViewGroup) this);
                    z4 = true;
                }
                this.f3202b.mo1193a((ViewGroup) this, bVar.f3218b, bVar.f3217a);
                if (this.f3203c == bVar.f3218b) {
                    i = i5;
                    z = z4;
                    i2 = Math.max(0, Math.min(this.f3203c, b - 1));
                    z2 = true;
                } else {
                    i = i5;
                    z = z4;
                    i2 = i3;
                    z2 = true;
                }
            } else if (bVar.f3218b != a) {
                if (bVar.f3218b == this.f3203c) {
                    i3 = a;
                }
                bVar.f3218b = a;
                i = i4;
                z = z4;
                i2 = i3;
                z2 = true;
            } else {
                i = i4;
                z = z4;
                i2 = i3;
                z2 = z5;
            }
            z5 = z2;
            i3 = i2;
            z4 = z;
            i4 = i + 1;
        }
        if (z4) {
            this.f3202b.mo1196b((ViewGroup) this);
        }
        Collections.sort(this.f3205r, f3154p);
        if (z5) {
            int childCount = getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                C0909c cVar = (C0909c) getChildAt(i6).getLayoutParams();
                if (!cVar.f3222a) {
                    cVar.f3224c = 0.0f;
                }
            }
            mo3007a(i3, false, true);
            requestLayout();
        }
    }

    /* renamed from: c */
    public boolean mo3027c(int i) {
        View view;
        boolean z;
        boolean z2;
        View findFocus = findFocus();
        if (findFocus == this) {
            view = null;
        } else {
            if (findFocus != null) {
                ViewParent parent = findFocus.getParent();
                while (true) {
                    if (!(parent instanceof ViewGroup)) {
                        z = false;
                        break;
                    } else if (parent == this) {
                        z = true;
                        break;
                    } else {
                        parent = parent.getParent();
                    }
                }
                if (!z) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(findFocus.getClass().getSimpleName());
                    for (ViewParent parent2 = findFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                        sb.append(" => ").append(parent2.getClass().getSimpleName());
                    }
                    Log.e(f3146g, "arrowScroll tried to find focus based on non-child current focused view " + sb.toString());
                    view = null;
                }
            }
            view = findFocus;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i);
        if (findNextFocus == null || findNextFocus == view) {
            if (i == 17 || i == 1) {
                z2 = mo3047h();
            } else {
                if (i == 66 || i == 2) {
                    z2 = mo3048i();
                }
                z2 = false;
            }
        } else if (i == 17) {
            z2 = (view == null || m4530a(this.f3207t, findNextFocus).left < m4530a(this.f3207t, view).left) ? findNextFocus.requestFocus() : mo3047h();
        } else {
            if (i == 66) {
                z2 = (view == null || m4530a(this.f3207t, findNextFocus).left > m4530a(this.f3207t, view).left) ? findNextFocus.requestFocus() : mo3048i();
            }
            z2 = false;
        }
        if (z2) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i));
        }
        return z2;
    }

    public boolean canScrollHorizontally(int i) {
        boolean z = true;
        if (this.f3202b == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i < 0) {
            if (scrollX <= ((int) (((float) clientWidth) * this.f3160E))) {
                z = false;
            }
            return z;
        } else if (i <= 0) {
            return false;
        } else {
            if (scrollX >= ((int) (((float) clientWidth) * this.f3161F))) {
                z = false;
            }
            return z;
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0909c) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        this.f3212y = true;
        if (this.f3211x.isFinished() || !this.f3211x.computeScrollOffset()) {
            m4535a(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f3211x.getCurrX();
        int currY = this.f3211x.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!m4542d(currX)) {
                this.f3211x.abortAnimation();
                scrollTo(0, currY);
            }
        }
        C1040ar.m5924d(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo3031d() {
        mo3002a(this.f3203c);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || mo3013a(keyEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        C0908b a;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (a = mo3000a(childAt)) != null && a.f3218b == this.f3203c && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        boolean z = false;
        int overScrollMode = getOverScrollMode();
        if (overScrollMode == 0 || (overScrollMode == 1 && this.f3202b != null && this.f3202b.mo3589b() > 1)) {
            if (!this.f3187ai.mo4469a()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((float) ((-height) + getPaddingTop()), this.f3160E * ((float) width));
                this.f3187ai.mo4468a(height, width);
                z = false | this.f3187ai.mo4473a(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.f3188aj.mo4469a()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate((float) (-getPaddingTop()), (-(this.f3161F + 1.0f)) * ((float) width2));
                this.f3188aj.mo4468a(height2, width2);
                z |= this.f3188aj.mo4473a(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            this.f3187ai.mo4474b();
            this.f3188aj.mo4474b();
        }
        if (z) {
            C1040ar.m5924d(this);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f3157B;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    /* renamed from: e */
    public boolean mo3036e() {
        if (this.f3168M) {
            return false;
        }
        this.f3185ag = true;
        setScrollState(1);
        this.f3173R = 0.0f;
        this.f3175T = 0.0f;
        if (this.f3180aa == null) {
            this.f3180aa = VelocityTracker.obtain();
        } else {
            this.f3180aa.clear();
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
        this.f3180aa.addMovement(obtain);
        obtain.recycle();
        this.f3186ah = uptimeMillis;
        return true;
    }

    /* renamed from: f */
    public void mo3037f() {
        if (!this.f3185ag) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        if (this.f3202b != null) {
            VelocityTracker velocityTracker = this.f3180aa;
            velocityTracker.computeCurrentVelocity(1000, (float) this.f3182ac);
            int a = (int) C1035ap.m5841a(velocityTracker, this.f3177V);
            this.f3166K = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            C0908b m = m4548m();
            mo3008a(m4529a(m.f3218b, ((((float) scrollX) / ((float) clientWidth)) - m.f3221e) / m.f3220d, a, (int) (this.f3173R - this.f3175T)), true, true, a);
        }
        m4549n();
        this.f3185ag = false;
    }

    /* renamed from: g */
    public boolean mo3038g() {
        return this.f3185ag;
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0909c();
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0909c(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public C1012af getAdapter() {
        return this.f3202b;
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        if (this.f3200ay == 2) {
            i2 = (i - 1) - i2;
        }
        return ((C0909c) this.f3201az.get(i2).getLayoutParams()).f3227f;
    }

    public int getCurrentItem() {
        return this.f3203c;
    }

    public int getOffscreenPageLimit() {
        return this.f3167L;
    }

    public int getPageMargin() {
        return this.f3156A;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo3047h() {
        if (this.f3203c <= 0) {
            return false;
        }
        mo3006a(this.f3203c - 1, true);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo3048i() {
        if (this.f3202b == null || this.f3203c >= this.f3202b.mo3589b() - 1) {
            return false;
        }
        mo3006a(this.f3203c + 1, true);
        return true;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3189ak = true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.f3178aB);
        if (this.f3211x != null && !this.f3211x.isFinished()) {
            this.f3211x.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f;
        super.onDraw(canvas);
        if (this.f3156A > 0 && this.f3157B != null && this.f3205r.size() > 0 && this.f3202b != null) {
            int scrollX = getScrollX();
            int width = getWidth();
            float f2 = ((float) this.f3156A) / ((float) width);
            C0908b bVar = this.f3205r.get(0);
            float f3 = bVar.f3221e;
            int size = this.f3205r.size();
            int i = bVar.f3218b;
            int i2 = this.f3205r.get(size - 1).f3218b;
            int i3 = 0;
            int i4 = i;
            while (i4 < i2) {
                while (i4 > bVar.f3218b && i3 < size) {
                    i3++;
                    bVar = this.f3205r.get(i3);
                }
                if (i4 == bVar.f3218b) {
                    f = (bVar.f3221e + bVar.f3220d) * ((float) width);
                    f3 = bVar.f3221e + bVar.f3220d + f2;
                } else {
                    float d = this.f3202b.mo3596d(i4);
                    f = (f3 + d) * ((float) width);
                    f3 += d + f2;
                }
                if (((float) this.f3156A) + f > ((float) scrollX)) {
                    this.f3157B.setBounds(Math.round(f), this.f3158C, Math.round(((float) this.f3156A) + f), this.f3159D);
                    this.f3157B.draw(canvas);
                }
                if (f <= ((float) (scrollX + width))) {
                    i4++;
                } else {
                    return;
                }
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            m4547l();
            return false;
        }
        if (action != 0) {
            if (this.f3168M) {
                return true;
            }
            if (this.f3169N) {
                return false;
            }
        }
        switch (action) {
            case 0:
                float x = motionEvent.getX();
                this.f3175T = x;
                this.f3173R = x;
                float y = motionEvent.getY();
                this.f3176U = y;
                this.f3174S = y;
                this.f3177V = motionEvent.getPointerId(0);
                this.f3169N = false;
                this.f3212y = true;
                this.f3211x.computeScrollOffset();
                if (this.f3179aC == 2 && Math.abs(this.f3211x.getFinalX() - this.f3211x.getCurrX()) > this.f3184ae) {
                    this.f3211x.abortAnimation();
                    this.f3166K = false;
                    mo3031d();
                    this.f3168M = true;
                    m4539c(true);
                    setScrollState(1);
                    break;
                } else {
                    m4535a(false);
                    this.f3168M = false;
                    break;
                }
            case 2:
                int i = this.f3177V;
                if (i != -1) {
                    int findPointerIndex = motionEvent.findPointerIndex(i);
                    float x2 = motionEvent.getX(findPointerIndex);
                    float f = x2 - this.f3173R;
                    float abs = Math.abs(f);
                    float y2 = motionEvent.getY(findPointerIndex);
                    float abs2 = Math.abs(y2 - this.f3176U);
                    if (f != 0.0f && !m4536a(this.f3173R, f)) {
                        if (mo3014a(this, false, (int) f, (int) x2, (int) y2)) {
                            this.f3173R = x2;
                            this.f3174S = y2;
                            this.f3169N = true;
                            return false;
                        }
                    }
                    if (abs > ((float) this.f3172Q) && 0.5f * abs > abs2) {
                        this.f3168M = true;
                        m4539c(true);
                        setScrollState(1);
                        this.f3173R = f > 0.0f ? this.f3175T + ((float) this.f3172Q) : this.f3175T - ((float) this.f3172Q);
                        this.f3174S = y2;
                        setScrollingCacheEnabled(true);
                    } else if (abs2 > ((float) this.f3172Q)) {
                        this.f3169N = true;
                    }
                    if (this.f3168M && m4540c(x2)) {
                        C1040ar.m5924d(this);
                        break;
                    }
                }
                break;
            case 6:
                m4534a(motionEvent);
                break;
        }
        if (this.f3180aa == null) {
            this.f3180aa = VelocityTracker.obtain();
        }
        this.f3180aa.addMovement(motionEvent);
        return this.f3168M;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C0908b a;
        int i5;
        int i6;
        int i7;
        int measuredHeight;
        int i8;
        int i9;
        int childCount = getChildCount();
        int i10 = i3 - i;
        int i11 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i12 = 0;
        int i13 = 0;
        while (i13 < childCount) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                C0909c cVar = (C0909c) childAt.getLayoutParams();
                if (cVar.f3222a) {
                    int i14 = cVar.f3223b & 7;
                    int i15 = cVar.f3223b & 112;
                    switch (i14) {
                        case 1:
                            i7 = Math.max((i10 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                            break;
                        case 3:
                            i7 = paddingLeft;
                            paddingLeft = childAt.getMeasuredWidth() + paddingLeft;
                            break;
                        case 5:
                            int measuredWidth = (i10 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                            i7 = measuredWidth;
                            break;
                        default:
                            i7 = paddingLeft;
                            break;
                    }
                    switch (i15) {
                        case 16:
                            measuredHeight = Math.max((i11 - childAt.getMeasuredHeight()) / 2, paddingTop);
                            int i16 = paddingBottom;
                            i8 = paddingTop;
                            i9 = i16;
                            break;
                        case 48:
                            int measuredHeight2 = childAt.getMeasuredHeight() + paddingTop;
                            int i17 = paddingTop;
                            i9 = paddingBottom;
                            i8 = measuredHeight2;
                            measuredHeight = i17;
                            break;
                        case 80:
                            measuredHeight = (i11 - paddingBottom) - childAt.getMeasuredHeight();
                            int measuredHeight3 = paddingBottom + childAt.getMeasuredHeight();
                            i8 = paddingTop;
                            i9 = measuredHeight3;
                            break;
                        default:
                            measuredHeight = paddingTop;
                            int i18 = paddingBottom;
                            i8 = paddingTop;
                            i9 = i18;
                            break;
                    }
                    int i19 = i7 + scrollX;
                    childAt.layout(i19, measuredHeight, childAt.getMeasuredWidth() + i19, childAt.getMeasuredHeight() + measuredHeight);
                    i5 = i12 + 1;
                    i6 = i8;
                    paddingBottom = i9;
                    i13++;
                    paddingLeft = paddingLeft;
                    paddingRight = paddingRight;
                    paddingTop = i6;
                    i12 = i5;
                }
            }
            i5 = i12;
            i6 = paddingTop;
            i13++;
            paddingLeft = paddingLeft;
            paddingRight = paddingRight;
            paddingTop = i6;
            i12 = i5;
        }
        int i20 = (i10 - paddingLeft) - paddingRight;
        for (int i21 = 0; i21 < childCount; i21++) {
            View childAt2 = getChildAt(i21);
            if (childAt2.getVisibility() != 8) {
                C0909c cVar2 = (C0909c) childAt2.getLayoutParams();
                if (!cVar2.f3222a && (a = mo3000a(childAt2)) != null) {
                    int i22 = ((int) (a.f3221e * ((float) i20))) + paddingLeft;
                    if (cVar2.f3225d) {
                        cVar2.f3225d = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (cVar2.f3224c * ((float) i20)), 1073741824), View.MeasureSpec.makeMeasureSpec((i11 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i22, paddingTop, childAt2.getMeasuredWidth() + i22, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.f3158C = paddingTop;
        this.f3159D = i11 - paddingBottom;
        this.f3192an = i12;
        if (this.f3189ak) {
            m4532a(this.f3203c, false, 0, false);
        }
        this.f3189ak = false;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r14, int r15) {
        /*
            r13 = this;
            r0 = 0
            int r0 = getDefaultSize(r0, r14)
            r1 = 0
            int r1 = getDefaultSize(r1, r15)
            r13.setMeasuredDimension(r0, r1)
            int r0 = r13.getMeasuredWidth()
            int r1 = r0 / 10
            int r2 = r13.f3170O
            int r1 = java.lang.Math.min(r1, r2)
            r13.f3171P = r1
            int r1 = r13.getPaddingLeft()
            int r0 = r0 - r1
            int r1 = r13.getPaddingRight()
            int r3 = r0 - r1
            int r0 = r13.getMeasuredHeight()
            int r1 = r13.getPaddingTop()
            int r0 = r0 - r1
            int r1 = r13.getPaddingBottom()
            int r5 = r0 - r1
            int r9 = r13.getChildCount()
            r0 = 0
            r8 = r0
        L_0x003b:
            if (r8 >= r9) goto L_0x00bc
            android.view.View r10 = r13.getChildAt(r8)
            int r0 = r10.getVisibility()
            r1 = 8
            if (r0 == r1) goto L_0x00a5
            android.view.ViewGroup$LayoutParams r0 = r10.getLayoutParams()
            android.support.v4.view.ViewPager$c r0 = (android.support.p010v4.view.ViewPager.C0909c) r0
            if (r0 == 0) goto L_0x00a5
            boolean r1 = r0.f3222a
            if (r1 == 0) goto L_0x00a5
            int r1 = r0.f3223b
            r6 = r1 & 7
            int r1 = r0.f3223b
            r4 = r1 & 112(0x70, float:1.57E-43)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = 48
            if (r4 == r7) goto L_0x0069
            r7 = 80
            if (r4 != r7) goto L_0x00a9
        L_0x0069:
            r4 = 1
            r7 = r4
        L_0x006b:
            r4 = 3
            if (r6 == r4) goto L_0x0071
            r4 = 5
            if (r6 != r4) goto L_0x00ac
        L_0x0071:
            r4 = 1
            r6 = r4
        L_0x0073:
            if (r7 == 0) goto L_0x00af
            r2 = 1073741824(0x40000000, float:2.0)
        L_0x0077:
            int r4 = r0.width
            r11 = -2
            if (r4 == r11) goto L_0x010f
            r4 = 1073741824(0x40000000, float:2.0)
            int r2 = r0.width
            r11 = -1
            if (r2 == r11) goto L_0x010c
            int r2 = r0.width
        L_0x0085:
            int r11 = r0.height
            r12 = -2
            if (r11 == r12) goto L_0x010a
            r1 = 1073741824(0x40000000, float:2.0)
            int r11 = r0.height
            r12 = -1
            if (r11 == r12) goto L_0x010a
            int r0 = r0.height
        L_0x0093:
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r4)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r10.measure(r2, r0)
            if (r7 == 0) goto L_0x00b4
            int r0 = r10.getMeasuredHeight()
            int r5 = r5 - r0
        L_0x00a5:
            int r0 = r8 + 1
            r8 = r0
            goto L_0x003b
        L_0x00a9:
            r4 = 0
            r7 = r4
            goto L_0x006b
        L_0x00ac:
            r4 = 0
            r6 = r4
            goto L_0x0073
        L_0x00af:
            if (r6 == 0) goto L_0x0077
            r1 = 1073741824(0x40000000, float:2.0)
            goto L_0x0077
        L_0x00b4:
            if (r6 == 0) goto L_0x00a5
            int r0 = r10.getMeasuredWidth()
            int r3 = r3 - r0
            goto L_0x00a5
        L_0x00bc:
            r0 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r0)
            r13.f3162G = r0
            r0 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r0)
            r13.f3163H = r0
            r0 = 1
            r13.f3164I = r0
            r13.mo3031d()
            r0 = 0
            r13.f3164I = r0
            int r2 = r13.getChildCount()
            r0 = 0
            r1 = r0
        L_0x00db:
            if (r1 >= r2) goto L_0x0109
            android.view.View r4 = r13.getChildAt(r1)
            int r0 = r4.getVisibility()
            r5 = 8
            if (r0 == r5) goto L_0x0105
            android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
            android.support.v4.view.ViewPager$c r0 = (android.support.p010v4.view.ViewPager.C0909c) r0
            if (r0 == 0) goto L_0x00f5
            boolean r5 = r0.f3222a
            if (r5 != 0) goto L_0x0105
        L_0x00f5:
            float r5 = (float) r3
            float r0 = r0.f3224c
            float r0 = r0 * r5
            int r0 = (int) r0
            r5 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r5)
            int r5 = r13.f3163H
            r4.measure(r0, r5)
        L_0x0105:
            int r0 = r1 + 1
            r1 = r0
            goto L_0x00db
        L_0x0109:
            return
        L_0x010a:
            r0 = r5
            goto L_0x0093
        L_0x010c:
            r2 = r3
            goto L_0x0085
        L_0x010f:
            r4 = r2
            r2 = r3
            goto L_0x0085
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p010v4.view.ViewPager.onMeasure(int, int):void");
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        C0908b a;
        int i3 = -1;
        int childCount = getChildCount();
        if ((i & 2) != 0) {
            i3 = 1;
            i2 = 0;
        } else {
            i2 = childCount - 1;
            childCount = -1;
        }
        while (i2 != childCount) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (a = mo3000a(childAt)) != null && a.f3218b == this.f3203c && childAt.requestFocus(i, rect)) {
                return true;
            }
            i2 += i3;
        }
        return false;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0915i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0915i iVar = (C0915i) parcelable;
        super.onRestoreInstanceState(iVar.mo3092a());
        if (this.f3202b != null) {
            this.f3202b.mo1191a(iVar.f3231c, iVar.f3232d);
            mo3007a(iVar.f3230b, false, true);
            return;
        }
        this.f3208u = iVar.f3230b;
        this.f3209v = iVar.f3231c;
        this.f3210w = iVar.f3232d;
    }

    public Parcelable onSaveInstanceState() {
        C0915i iVar = new C0915i(super.onSaveInstanceState());
        iVar.f3230b = this.f3203c;
        if (this.f3202b != null) {
            iVar.f3231c = this.f3202b.mo1188a();
        }
        return iVar;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            m4531a(i, i3, this.f3156A, this.f3156A);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        if (this.f3185ag) {
            return true;
        }
        if (motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) {
            return false;
        }
        if (this.f3202b == null || this.f3202b.mo3589b() == 0) {
            return false;
        }
        if (this.f3180aa == null) {
            this.f3180aa = VelocityTracker.obtain();
        }
        this.f3180aa.addMovement(motionEvent);
        switch (motionEvent.getAction() & 255) {
            case 0:
                this.f3211x.abortAnimation();
                this.f3166K = false;
                mo3031d();
                float x = motionEvent.getX();
                this.f3175T = x;
                this.f3173R = x;
                float y = motionEvent.getY();
                this.f3176U = y;
                this.f3174S = y;
                this.f3177V = motionEvent.getPointerId(0);
                break;
            case 1:
                if (this.f3168M) {
                    VelocityTracker velocityTracker = this.f3180aa;
                    velocityTracker.computeCurrentVelocity(1000, (float) this.f3182ac);
                    int a = (int) C1035ap.m5841a(velocityTracker, this.f3177V);
                    this.f3166K = true;
                    int clientWidth = getClientWidth();
                    int scrollX = getScrollX();
                    C0908b m = m4548m();
                    mo3008a(m4529a(m.f3218b, ((((float) scrollX) / ((float) clientWidth)) - m.f3221e) / (m.f3220d + (((float) this.f3156A) / ((float) clientWidth))), a, (int) (motionEvent.getX(motionEvent.findPointerIndex(this.f3177V)) - this.f3175T)), true, true, a);
                    z = m4547l();
                    break;
                }
                break;
            case 2:
                if (!this.f3168M) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f3177V);
                    if (findPointerIndex == -1) {
                        z = m4547l();
                        break;
                    } else {
                        float x2 = motionEvent.getX(findPointerIndex);
                        float abs = Math.abs(x2 - this.f3173R);
                        float y2 = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y2 - this.f3174S);
                        if (abs > ((float) this.f3172Q) && abs > abs2) {
                            this.f3168M = true;
                            m4539c(true);
                            this.f3173R = x2 - this.f3175T > 0.0f ? this.f3175T + ((float) this.f3172Q) : this.f3175T - ((float) this.f3172Q);
                            this.f3174S = y2;
                            setScrollState(1);
                            setScrollingCacheEnabled(true);
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                }
                if (this.f3168M) {
                    z = false | m4540c(motionEvent.getX(motionEvent.findPointerIndex(this.f3177V)));
                    break;
                }
                break;
            case 3:
                if (this.f3168M) {
                    m4532a(this.f3203c, true, 0, false);
                    z = m4547l();
                    break;
                }
                break;
            case 5:
                int b = C1200x.m7133b(motionEvent);
                this.f3173R = motionEvent.getX(b);
                this.f3177V = motionEvent.getPointerId(b);
                break;
            case 6:
                m4534a(motionEvent);
                this.f3173R = motionEvent.getX(motionEvent.findPointerIndex(this.f3177V));
                break;
        }
        if (z) {
            C1040ar.m5924d(this);
        }
        return true;
    }

    public void removeView(View view) {
        if (this.f3164I) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(C1012af afVar) {
        if (this.f3202b != null) {
            this.f3202b.mo3595c((DataSetObserver) null);
            this.f3202b.mo1192a((ViewGroup) this);
            for (int i = 0; i < this.f3205r.size(); i++) {
                C0908b bVar = this.f3205r.get(i);
                this.f3202b.mo1193a((ViewGroup) this, bVar.f3218b, bVar.f3217a);
            }
            this.f3202b.mo1196b((ViewGroup) this);
            this.f3205r.clear();
            m4545j();
            this.f3203c = 0;
            scrollTo(0, 0);
        }
        C1012af afVar2 = this.f3202b;
        this.f3202b = afVar;
        this.f3204o = 0;
        if (this.f3202b != null) {
            if (this.f3213z == null) {
                this.f3213z = new C0914h();
            }
            this.f3202b.mo3595c((DataSetObserver) this.f3213z);
            this.f3166K = false;
            boolean z = this.f3189ak;
            this.f3189ak = true;
            this.f3204o = this.f3202b.mo3589b();
            if (this.f3208u >= 0) {
                this.f3202b.mo1191a(this.f3209v, this.f3210w);
                mo3007a(this.f3208u, false, true);
                this.f3208u = -1;
                this.f3209v = null;
                this.f3210w = null;
            } else if (!z) {
                mo3031d();
            } else {
                requestLayout();
            }
        }
        if (this.f3196ar != null && !this.f3196ar.isEmpty()) {
            int size = this.f3196ar.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f3196ar.get(i2).mo3079a(this, afVar2, afVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void setChildrenDrawingOrderEnabledCompat(boolean z) {
        if (Build.VERSION.SDK_INT >= 7) {
            if (this.f3199au == null) {
                Class<ViewGroup> cls = ViewGroup.class;
                try {
                    this.f3199au = cls.getDeclaredMethod("setChildrenDrawingOrderEnabled", new Class[]{Boolean.TYPE});
                } catch (NoSuchMethodException e) {
                    Log.e(f3146g, "Can't find setChildrenDrawingOrderEnabled", e);
                }
            }
            try {
                this.f3199au.invoke(this, new Object[]{Boolean.valueOf(z)});
            } catch (Exception e2) {
                Log.e(f3146g, "Error changing children drawing order", e2);
            }
        }
    }

    public void setCurrentItem(int i) {
        this.f3166K = false;
        mo3007a(i, !this.f3189ak, false);
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            Log.w(f3146g, "Requested offscreen page limit " + i + " too small; defaulting to " + 1);
            i = 1;
        }
        if (i != this.f3167L) {
            this.f3167L = i;
            mo3031d();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(C0912f fVar) {
        this.f3194ap = fVar;
    }

    public void setPageMargin(int i) {
        int i2 = this.f3156A;
        this.f3156A = i;
        int width = getWidth();
        m4531a(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(@C0036o int i) {
        setPageMarginDrawable(C0434d.m2370a(getContext(), i));
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f3157B = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    /* access modifiers changed from: package-private */
    public void setScrollState(int i) {
        if (this.f3179aC != i) {
            this.f3179aC = i;
            if (this.f3197as != null) {
                m4538b(i != 0);
            }
            m4544f(i);
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f3157B;
    }
}
