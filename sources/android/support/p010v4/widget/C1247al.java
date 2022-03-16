package android.support.p010v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.C0032k;
import android.support.annotation.C0036o;
import android.support.p010v4.p014d.C0434d;
import android.support.p010v4.p028k.C0808j;
import android.support.p010v4.p028k.C0810k;
import android.support.p010v4.view.C0919a;
import android.support.p010v4.view.C1040ar;
import android.support.p010v4.view.C1066b;
import android.support.p010v4.view.p034a.C0949h;
import android.support.p010v4.widget.C1285av;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* renamed from: android.support.v4.widget.al */
public class C1247al extends ViewGroup {

    /* renamed from: h */
    static final C1256h f3808h;

    /* renamed from: i */
    private static final String f3809i = "SlidingPaneLayout";

    /* renamed from: j */
    private static final int f3810j = 32;

    /* renamed from: k */
    private static final int f3811k = -858993460;

    /* renamed from: m */
    private static final int f3812m = 400;

    /* renamed from: a */
    View f3813a;

    /* renamed from: b */
    float f3814b;

    /* renamed from: c */
    int f3815c;

    /* renamed from: d */
    boolean f3816d;

    /* renamed from: e */
    final C1285av f3817e;

    /* renamed from: f */
    boolean f3818f;

    /* renamed from: g */
    final ArrayList<C1249b> f3819g;

    /* renamed from: l */
    private int f3820l;

    /* renamed from: n */
    private int f3821n;

    /* renamed from: o */
    private Drawable f3822o;

    /* renamed from: p */
    private Drawable f3823p;

    /* renamed from: q */
    private final int f3824q;

    /* renamed from: r */
    private boolean f3825r;

    /* renamed from: s */
    private float f3826s;

    /* renamed from: t */
    private int f3827t;

    /* renamed from: u */
    private float f3828u;

    /* renamed from: v */
    private float f3829v;

    /* renamed from: w */
    private C1252e f3830w;

    /* renamed from: x */
    private boolean f3831x;

    /* renamed from: y */
    private final Rect f3832y;

    /* renamed from: android.support.v4.widget.al$a */
    class C1248a extends C1066b {

        /* renamed from: c */
        private final Rect f3834c = new Rect();

        C1248a() {
        }

        /* renamed from: a */
        private void m7423a(C0949h hVar, C0949h hVar2) {
            Rect rect = this.f3834c;
            hVar2.mo3158a(rect);
            hVar.mo3165b(rect);
            hVar2.mo3176c(rect);
            hVar.mo3184d(rect);
            hVar.mo3193e(hVar2.mo3224l());
            hVar.mo3161a(hVar2.mo3241u());
            hVar.mo3168b(hVar2.mo3242v());
            hVar.mo3185d(hVar2.mo3244x());
            hVar.mo3219j(hVar2.mo3234q());
            hVar.mo3210h(hVar2.mo3230o());
            hVar.mo3181c(hVar2.mo3220j());
            hVar.mo3186d(hVar2.mo3222k());
            hVar.mo3201f(hVar2.mo3226m());
            hVar.mo3206g(hVar2.mo3228n());
            hVar.mo3216i(hVar2.mo3232p());
            hVar.mo3183d(hVar2.mo3189e());
            hVar.mo3197f(hVar2.mo3196f());
        }

        /* renamed from: a */
        public void mo3076a(View view, C0949h hVar) {
            C0949h a = C0949h.m4703a(hVar);
            super.mo3076a(view, a);
            m7423a(hVar, a);
            a.mo3245y();
            hVar.mo3168b((CharSequence) C1247al.class.getName());
            hVar.mo3166b(view);
            ViewParent l = C1040ar.m5950l(view);
            if (l instanceof View) {
                hVar.mo3190e((View) l);
            }
            int childCount = C1247al.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = C1247al.this.getChildAt(i);
                if (!mo4230b(childAt) && childAt.getVisibility() == 0) {
                    C1040ar.m5926d(childAt, 1);
                    hVar.mo3177c(childAt);
                }
            }
        }

        /* renamed from: a */
        public boolean mo3767a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (!mo4230b(view)) {
                return super.mo3767a(viewGroup, view, accessibilityEvent);
            }
            return false;
        }

        /* renamed from: b */
        public boolean mo4230b(View view) {
            return C1247al.this.mo4200f(view);
        }

        /* renamed from: d */
        public void mo3078d(View view, AccessibilityEvent accessibilityEvent) {
            super.mo3078d(view, accessibilityEvent);
            accessibilityEvent.setClassName(C1247al.class.getName());
        }
    }

    /* renamed from: android.support.v4.widget.al$b */
    private class C1249b implements Runnable {

        /* renamed from: a */
        final View f3835a;

        C1249b(View view) {
            this.f3835a = view;
        }

        public void run() {
            if (this.f3835a.getParent() == C1247al.this) {
                C1040ar.m5884a(this.f3835a, 0, (Paint) null);
                C1247al.this.mo4197e(this.f3835a);
            }
            C1247al.this.f3819g.remove(this);
        }
    }

    /* renamed from: android.support.v4.widget.al$c */
    private class C1250c extends C1285av.C1288a {
        C1250c() {
        }

        /* renamed from: a */
        public int mo4232a(View view) {
            return C1247al.this.f3815c;
        }

        /* renamed from: a */
        public int mo4233a(View view, int i, int i2) {
            C1251d dVar = (C1251d) C1247al.this.f3813a.getLayoutParams();
            if (C1247al.this.mo4209i()) {
                int width = C1247al.this.getWidth() - ((dVar.rightMargin + C1247al.this.getPaddingRight()) + C1247al.this.f3813a.getWidth());
                return Math.max(Math.min(i, width), width - C1247al.this.f3815c);
            }
            int paddingLeft = dVar.leftMargin + C1247al.this.getPaddingLeft();
            return Math.min(Math.max(i, paddingLeft), C1247al.this.f3815c + paddingLeft);
        }

        /* renamed from: a */
        public void mo4234a(int i) {
            if (C1247al.this.f3817e.mo4320b() != 0) {
                return;
            }
            if (C1247al.this.f3814b == 0.0f) {
                C1247al.this.mo4194d(C1247al.this.f3813a);
                C1247al.this.mo4189c(C1247al.this.f3813a);
                C1247al.this.f3818f = false;
                return;
            }
            C1247al.this.mo4188b(C1247al.this.f3813a);
            C1247al.this.f3818f = true;
        }

        /* renamed from: a */
        public void mo4235a(View view, float f, float f2) {
            int paddingLeft;
            C1251d dVar = (C1251d) view.getLayoutParams();
            if (C1247al.this.mo4209i()) {
                int paddingRight = dVar.rightMargin + C1247al.this.getPaddingRight();
                if (f < 0.0f || (f == 0.0f && C1247al.this.f3814b > 0.5f)) {
                    paddingRight += C1247al.this.f3815c;
                }
                paddingLeft = (C1247al.this.getWidth() - paddingRight) - C1247al.this.f3813a.getWidth();
            } else {
                paddingLeft = dVar.leftMargin + C1247al.this.getPaddingLeft();
                if (f > 0.0f || (f == 0.0f && C1247al.this.f3814b > 0.5f)) {
                    paddingLeft += C1247al.this.f3815c;
                }
            }
            C1247al.this.f3817e.mo4315a(paddingLeft, view.getTop());
            C1247al.this.invalidate();
        }

        /* renamed from: a */
        public void mo4236a(View view, int i, int i2, int i3, int i4) {
            C1247al.this.mo4183a(i);
            C1247al.this.invalidate();
        }

        /* renamed from: a */
        public boolean mo4237a(View view, int i) {
            if (C1247al.this.f3816d) {
                return false;
            }
            return ((C1251d) view.getLayoutParams()).f3840b;
        }

        /* renamed from: b */
        public int mo4238b(View view, int i, int i2) {
            return view.getTop();
        }

        /* renamed from: b */
        public void mo4239b(int i, int i2) {
            C1247al.this.f3817e.mo4314a(C1247al.this.f3813a, i2);
        }

        /* renamed from: b */
        public void mo4240b(View view, int i) {
            C1247al.this.mo4182a();
        }
    }

    /* renamed from: android.support.v4.widget.al$d */
    public static class C1251d extends ViewGroup.MarginLayoutParams {

        /* renamed from: e */
        private static final int[] f3838e = {16843137};

        /* renamed from: a */
        public float f3839a = 0.0f;

        /* renamed from: b */
        boolean f3840b;

        /* renamed from: c */
        boolean f3841c;

        /* renamed from: d */
        Paint f3842d;

        public C1251d() {
            super(-1, -1);
        }

        public C1251d(int i, int i2) {
            super(i, i2);
        }

        public C1251d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f3838e);
            this.f3839a = obtainStyledAttributes.getFloat(0, 0.0f);
            obtainStyledAttributes.recycle();
        }

        public C1251d(C1251d dVar) {
            super(dVar);
            this.f3839a = dVar.f3839a;
        }

        public C1251d(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C1251d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    /* renamed from: android.support.v4.widget.al$e */
    public interface C1252e {
        /* renamed from: a */
        void mo4241a(View view);

        /* renamed from: a */
        void mo4242a(View view, float f);

        /* renamed from: b */
        void mo4243b(View view);
    }

    /* renamed from: android.support.v4.widget.al$f */
    static class C1253f extends C0919a {
        public static final Parcelable.Creator<C1253f> CREATOR = C0808j.m4090a(new C0810k<C1253f>() {
            /* renamed from: b */
            public C1253f mo2679a(Parcel parcel, ClassLoader classLoader) {
                return new C1253f(parcel, classLoader);
            }

            /* renamed from: b */
            public C1253f[] mo2680a(int i) {
                return new C1253f[i];
            }
        });

        /* renamed from: b */
        boolean f3843b;

        C1253f(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3843b = parcel.readInt() != 0;
        }

        C1253f(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f3843b ? 1 : 0);
        }
    }

    /* renamed from: android.support.v4.widget.al$g */
    public static class C1255g implements C1252e {
        /* renamed from: a */
        public void mo4241a(View view) {
        }

        /* renamed from: a */
        public void mo4242a(View view, float f) {
        }

        /* renamed from: b */
        public void mo4243b(View view) {
        }
    }

    /* renamed from: android.support.v4.widget.al$h */
    interface C1256h {
        /* renamed from: a */
        void mo4246a(C1247al alVar, View view);
    }

    /* renamed from: android.support.v4.widget.al$i */
    static class C1257i implements C1256h {
        C1257i() {
        }

        /* renamed from: a */
        public void mo4246a(C1247al alVar, View view) {
            C1040ar.m5883a((View) alVar, view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: android.support.v4.widget.al$j */
    static class C1258j extends C1257i {

        /* renamed from: a */
        private Method f3844a;

        /* renamed from: b */
        private Field f3845b;

        C1258j() {
            try {
                this.f3844a = View.class.getDeclaredMethod("getDisplayList", (Class[]) null);
            } catch (NoSuchMethodException e) {
                Log.e(C1247al.f3809i, "Couldn't fetch getDisplayList method; dimming won't work right.", e);
            }
            try {
                this.f3845b = View.class.getDeclaredField("mRecreateDisplayList");
                this.f3845b.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e(C1247al.f3809i, "Couldn't fetch mRecreateDisplayList field; dimming will be slow.", e2);
            }
        }

        /* renamed from: a */
        public void mo4246a(C1247al alVar, View view) {
            if (this.f3844a == null || this.f3845b == null) {
                view.invalidate();
                return;
            }
            try {
                this.f3845b.setBoolean(view, true);
                this.f3844a.invoke(view, (Object[]) null);
            } catch (Exception e) {
                Log.e(C1247al.f3809i, "Error refreshing display list state", e);
            }
            super.mo4246a(alVar, view);
        }
    }

    /* renamed from: android.support.v4.widget.al$k */
    static class C1259k extends C1257i {
        C1259k() {
        }

        /* renamed from: a */
        public void mo4246a(C1247al alVar, View view) {
            C1040ar.m5886a(view, ((C1251d) view.getLayoutParams()).f3842d);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 17) {
            f3808h = new C1259k();
        } else if (i >= 16) {
            f3808h = new C1258j();
        } else {
            f3808h = new C1257i();
        }
    }

    public C1247al(Context context) {
        this(context, (AttributeSet) null);
    }

    public C1247al(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C1247al(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3820l = f3811k;
        this.f3831x = true;
        this.f3832y = new Rect();
        this.f3819g = new ArrayList<>();
        float f = context.getResources().getDisplayMetrics().density;
        this.f3824q = (int) ((32.0f * f) + 0.5f);
        ViewConfiguration.get(context);
        setWillNotDraw(false);
        C1040ar.m5893a((View) this, (C1066b) new C1248a());
        C1040ar.m5926d((View) this, 1);
        this.f3817e = C1285av.m7538a((ViewGroup) this, 0.5f, (C1285av.C1288a) new C1250c());
        this.f3817e.mo4311a(f * 400.0f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m7400a(float r10) {
        /*
            r9 = this;
            r1 = 0
            r8 = 1065353216(0x3f800000, float:1.0)
            boolean r3 = r9.mo4209i()
            android.view.View r0 = r9.f3813a
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.support.v4.widget.al$d r0 = (android.support.p010v4.widget.C1247al.C1251d) r0
            boolean r2 = r0.f3841c
            if (r2 == 0) goto L_0x0030
            if (r3 == 0) goto L_0x002d
            int r0 = r0.rightMargin
        L_0x0017:
            if (r0 > 0) goto L_0x0030
            r0 = 1
        L_0x001a:
            int r4 = r9.getChildCount()
            r2 = r1
        L_0x001f:
            if (r2 >= r4) goto L_0x005d
            android.view.View r5 = r9.getChildAt(r2)
            android.view.View r1 = r9.f3813a
            if (r5 != r1) goto L_0x0032
        L_0x0029:
            int r1 = r2 + 1
            r2 = r1
            goto L_0x001f
        L_0x002d:
            int r0 = r0.leftMargin
            goto L_0x0017
        L_0x0030:
            r0 = r1
            goto L_0x001a
        L_0x0032:
            float r1 = r9.f3826s
            float r1 = r8 - r1
            int r6 = r9.f3827t
            float r6 = (float) r6
            float r1 = r1 * r6
            int r1 = (int) r1
            r9.f3826s = r10
            float r6 = r8 - r10
            int r7 = r9.f3827t
            float r7 = (float) r7
            float r6 = r6 * r7
            int r6 = (int) r6
            int r1 = r1 - r6
            if (r3 == 0) goto L_0x0048
            int r1 = -r1
        L_0x0048:
            r5.offsetLeftAndRight(r1)
            if (r0 == 0) goto L_0x0029
            if (r3 == 0) goto L_0x0058
            float r1 = r9.f3826s
            float r1 = r1 - r8
        L_0x0052:
            int r6 = r9.f3821n
            r9.m7401a(r5, r1, r6)
            goto L_0x0029
        L_0x0058:
            float r1 = r9.f3826s
            float r1 = r8 - r1
            goto L_0x0052
        L_0x005d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p010v4.widget.C1247al.m7400a(float):void");
    }

    /* renamed from: a */
    private void m7401a(View view, float f, int i) {
        C1251d dVar = (C1251d) view.getLayoutParams();
        if (f > 0.0f && i != 0) {
            int i2 = (((int) (((float) ((-16777216 & i) >>> 24)) * f)) << 24) | (16777215 & i);
            if (dVar.f3842d == null) {
                dVar.f3842d = new Paint();
            }
            dVar.f3842d.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_OVER));
            if (C1040ar.m5941i(view) != 2) {
                C1040ar.m5884a(view, 2, dVar.f3842d);
            }
            mo4197e(view);
        } else if (C1040ar.m5941i(view) != 0) {
            if (dVar.f3842d != null) {
                dVar.f3842d.setColorFilter((ColorFilter) null);
            }
            C1249b bVar = new C1249b(view);
            this.f3819g.add(bVar);
            C1040ar.m5895a((View) this, (Runnable) bVar);
        }
    }

    /* renamed from: a */
    private boolean m7402a(View view, int i) {
        if (!this.f3831x && !mo4185a(0.0f, i)) {
            return false;
        }
        this.f3818f = false;
        return true;
    }

    /* renamed from: b */
    private boolean m7403b(View view, int i) {
        if (!this.f3831x && !mo4185a(1.0f, i)) {
            return false;
        }
        this.f3818f = true;
        return true;
    }

    /* renamed from: g */
    private static boolean m7404g(View view) {
        if (view.isOpaque()) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 18) {
            return false;
        }
        Drawable background = view.getBackground();
        if (background != null) {
            return background.getOpacity() == -1;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4182a() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4183a(int i) {
        if (this.f3813a == null) {
            this.f3814b = 0.0f;
            return;
        }
        boolean i2 = mo4209i();
        C1251d dVar = (C1251d) this.f3813a.getLayoutParams();
        int width = this.f3813a.getWidth();
        if (i2) {
            i = (getWidth() - i) - width;
        }
        this.f3814b = ((float) (i - ((i2 ? dVar.rightMargin : dVar.leftMargin) + (i2 ? getPaddingRight() : getPaddingLeft())))) / ((float) this.f3815c);
        if (this.f3827t != 0) {
            m7400a(this.f3814b);
        }
        if (dVar.f3841c) {
            m7401a(this.f3813a, this.f3814b, this.f3820l);
        }
        mo4184a(this.f3813a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4184a(View view) {
        if (this.f3830w != null) {
            this.f3830w.mo4242a(view, this.f3814b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo4185a(float f, int i) {
        int paddingLeft;
        if (!this.f3825r) {
            return false;
        }
        boolean i2 = mo4209i();
        C1251d dVar = (C1251d) this.f3813a.getLayoutParams();
        if (i2) {
            paddingLeft = (int) (((float) getWidth()) - ((((float) (dVar.rightMargin + getPaddingRight())) + (((float) this.f3815c) * f)) + ((float) this.f3813a.getWidth())));
        } else {
            paddingLeft = (int) (((float) (dVar.leftMargin + getPaddingLeft())) + (((float) this.f3815c) * f));
        }
        if (!this.f3817e.mo4317a(this.f3813a, paddingLeft, this.f3813a.getTop())) {
            return false;
        }
        mo4182a();
        C1040ar.m5924d(this);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo4186a(View view, boolean z, int i, int i2, int i3) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (i2 + scrollX >= childAt.getLeft() && i2 + scrollX < childAt.getRight() && i3 + scrollY >= childAt.getTop() && i3 + scrollY < childAt.getBottom()) {
                    if (mo4186a(childAt, true, i, (i2 + scrollX) - childAt.getLeft(), (i3 + scrollY) - childAt.getTop())) {
                        return true;
                    }
                }
            }
        }
        if (z) {
            if (!mo4209i()) {
                i = -i;
            }
            return C1040ar.m5902a(view, i);
        }
    }

    @Deprecated
    /* renamed from: b */
    public void mo4187b() {
        mo4190c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo4188b(View view) {
        if (this.f3830w != null) {
            this.f3830w.mo4241a(view);
        }
        sendAccessibilityEvent(32);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo4189c(View view) {
        if (this.f3830w != null) {
            this.f3830w.mo4243b(view);
        }
        sendAccessibilityEvent(32);
    }

    /* renamed from: c */
    public boolean mo4190c() {
        return m7403b(this.f3813a, 0);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C1251d) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        if (!this.f3817e.mo4319a(true)) {
            return;
        }
        if (!this.f3825r) {
            this.f3817e.mo4337h();
        } else {
            C1040ar.m5924d(this);
        }
    }

    @Deprecated
    /* renamed from: d */
    public void mo4193d() {
        mo4198e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo4194d(View view) {
        int i;
        int i2;
        int i3;
        int i4;
        boolean i5 = mo4209i();
        int width = i5 ? getWidth() - getPaddingRight() : getPaddingLeft();
        int paddingLeft = i5 ? getPaddingLeft() : getWidth() - getPaddingRight();
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (view == null || !m7404g(view)) {
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
        } else {
            i4 = view.getLeft();
            i3 = view.getRight();
            i2 = view.getTop();
            i = view.getBottom();
        }
        int childCount = getChildCount();
        int i6 = 0;
        while (i6 < childCount) {
            View childAt = getChildAt(i6);
            if (childAt != view) {
                if (childAt.getVisibility() != 8) {
                    childAt.setVisibility((Math.max(i5 ? paddingLeft : width, childAt.getLeft()) < i4 || Math.max(paddingTop, childAt.getTop()) < i2 || Math.min(i5 ? width : paddingLeft, childAt.getRight()) > i3 || Math.min(height, childAt.getBottom()) > i) ? 0 : 4);
                }
                i6++;
            } else {
                return;
            }
        }
    }

    public void draw(Canvas canvas) {
        int left;
        int i;
        super.draw(canvas);
        Drawable drawable = mo4209i() ? this.f3823p : this.f3822o;
        View childAt = getChildCount() > 1 ? getChildAt(1) : null;
        if (childAt != null && drawable != null) {
            int top = childAt.getTop();
            int bottom = childAt.getBottom();
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (mo4209i()) {
                i = childAt.getRight();
                left = i + intrinsicWidth;
            } else {
                left = childAt.getLeft();
                i = left - intrinsicWidth;
            }
            drawable.setBounds(i, top, left, bottom);
            drawable.draw(canvas);
        }
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        boolean drawChild;
        C1251d dVar = (C1251d) view.getLayoutParams();
        int save = canvas.save(2);
        if (this.f3825r && !dVar.f3840b && this.f3813a != null) {
            canvas.getClipBounds(this.f3832y);
            if (mo4209i()) {
                this.f3832y.left = Math.max(this.f3832y.left, this.f3813a.getRight());
            } else {
                this.f3832y.right = Math.min(this.f3832y.right, this.f3813a.getLeft());
            }
            canvas.clipRect(this.f3832y);
        }
        if (Build.VERSION.SDK_INT >= 11) {
            drawChild = super.drawChild(canvas, view, j);
        } else if (!dVar.f3841c || this.f3814b <= 0.0f) {
            if (view.isDrawingCacheEnabled()) {
                view.setDrawingCacheEnabled(false);
            }
            drawChild = super.drawChild(canvas, view, j);
        } else {
            if (!view.isDrawingCacheEnabled()) {
                view.setDrawingCacheEnabled(true);
            }
            Bitmap drawingCache = view.getDrawingCache();
            if (drawingCache != null) {
                canvas.drawBitmap(drawingCache, (float) view.getLeft(), (float) view.getTop(), dVar.f3842d);
                drawChild = false;
            } else {
                Log.e(f3809i, "drawChild: child view " + view + " returned null drawing cache");
                drawChild = super.drawChild(canvas, view, j);
            }
        }
        canvas.restoreToCount(save);
        return drawChild;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo4197e(View view) {
        f3808h.mo4246a(this, view);
    }

    /* renamed from: e */
    public boolean mo4198e() {
        return m7402a(this.f3813a, 0);
    }

    /* renamed from: f */
    public boolean mo4199f() {
        return !this.f3825r || this.f3814b == 1.0f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo4200f(View view) {
        if (view == null) {
            return false;
        }
        return this.f3825r && ((C1251d) view.getLayoutParams()).f3841c && this.f3814b > 0.0f;
    }

    @Deprecated
    /* renamed from: g */
    public boolean mo4201g() {
        return this.f3825r;
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C1251d();
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C1251d(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C1251d((ViewGroup.MarginLayoutParams) layoutParams) : new C1251d(layoutParams);
    }

    @C0032k
    public int getCoveredFadeColor() {
        return this.f3821n;
    }

    public int getParallaxDistance() {
        return this.f3827t;
    }

    @C0032k
    public int getSliderFadeColor() {
        return this.f3820l;
    }

    /* renamed from: h */
    public boolean mo4208h() {
        return this.f3825r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo4209i() {
        return C1040ar.m5947k(this) == 1;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3831x = true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f3831x = true;
        int size = this.f3819g.size();
        for (int i = 0; i < size; i++) {
            this.f3819g.get(i).run();
        }
        this.f3819g.clear();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            r2 = 0
            r1 = 1
            int r3 = android.support.p010v4.view.C1200x.m7131a(r8)
            boolean r0 = r7.f3825r
            if (r0 != 0) goto L_0x002d
            if (r3 != 0) goto L_0x002d
            int r0 = r7.getChildCount()
            if (r0 <= r1) goto L_0x002d
            android.view.View r0 = r7.getChildAt(r1)
            if (r0 == 0) goto L_0x002d
            android.support.v4.widget.av r4 = r7.f3817e
            float r5 = r8.getX()
            int r5 = (int) r5
            float r6 = r8.getY()
            int r6 = (int) r6
            boolean r0 = r4.mo4325b((android.view.View) r0, (int) r5, (int) r6)
            if (r0 != 0) goto L_0x0041
            r0 = r1
        L_0x002b:
            r7.f3818f = r0
        L_0x002d:
            boolean r0 = r7.f3825r
            if (r0 == 0) goto L_0x0037
            boolean r0 = r7.f3816d
            if (r0 == 0) goto L_0x0043
            if (r3 == 0) goto L_0x0043
        L_0x0037:
            android.support.v4.widget.av r0 = r7.f3817e
            r0.mo4336g()
            boolean r2 = super.onInterceptTouchEvent(r8)
        L_0x0040:
            return r2
        L_0x0041:
            r0 = r2
            goto L_0x002b
        L_0x0043:
            r0 = 3
            if (r3 == r0) goto L_0x0048
            if (r3 != r1) goto L_0x004e
        L_0x0048:
            android.support.v4.widget.av r0 = r7.f3817e
            r0.mo4336g()
            goto L_0x0040
        L_0x004e:
            switch(r3) {
                case 0: goto L_0x005e;
                case 1: goto L_0x0051;
                case 2: goto L_0x0082;
                default: goto L_0x0051;
            }
        L_0x0051:
            r0 = r2
        L_0x0052:
            android.support.v4.widget.av r3 = r7.f3817e
            boolean r3 = r3.mo4316a((android.view.MotionEvent) r8)
            if (r3 != 0) goto L_0x005c
            if (r0 == 0) goto L_0x0040
        L_0x005c:
            r2 = r1
            goto L_0x0040
        L_0x005e:
            r7.f3816d = r2
            float r0 = r8.getX()
            float r3 = r8.getY()
            r7.f3828u = r0
            r7.f3829v = r3
            android.support.v4.widget.av r4 = r7.f3817e
            android.view.View r5 = r7.f3813a
            int r0 = (int) r0
            int r3 = (int) r3
            boolean r0 = r4.mo4325b((android.view.View) r5, (int) r0, (int) r3)
            if (r0 == 0) goto L_0x0051
            android.view.View r0 = r7.f3813a
            boolean r0 = r7.mo4200f(r0)
            if (r0 == 0) goto L_0x0051
            r0 = r1
            goto L_0x0052
        L_0x0082:
            float r0 = r8.getX()
            float r3 = r8.getY()
            float r4 = r7.f3828u
            float r0 = r0 - r4
            float r0 = java.lang.Math.abs(r0)
            float r4 = r7.f3829v
            float r3 = r3 - r4
            float r3 = java.lang.Math.abs(r3)
            android.support.v4.widget.av r4 = r7.f3817e
            int r4 = r4.mo4335f()
            float r4 = (float) r4
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x0051
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0051
            android.support.v4.widget.av r0 = r7.f3817e
            r0.mo4336g()
            r7.f3816d = r1
            goto L_0x0040
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p010v4.widget.C1247al.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int width;
        int i9;
        boolean i10 = mo4209i();
        if (i10) {
            this.f3817e.mo4312a(2);
        } else {
            this.f3817e.mo4312a(1);
        }
        int i11 = i3 - i;
        int paddingRight = i10 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = i10 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.f3831x) {
            this.f3814b = (!this.f3825r || !this.f3818f) ? 0.0f : 1.0f;
        }
        int i12 = 0;
        int i13 = paddingRight;
        while (i12 < childCount) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() == 8) {
                width = paddingRight;
                i9 = i13;
            } else {
                C1251d dVar = (C1251d) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                if (dVar.f3840b) {
                    int min = (Math.min(paddingRight, (i11 - paddingLeft) - this.f3824q) - i13) - (dVar.leftMargin + dVar.rightMargin);
                    this.f3815c = min;
                    int i14 = i10 ? dVar.rightMargin : dVar.leftMargin;
                    dVar.f3841c = ((i13 + i14) + min) + (measuredWidth / 2) > i11 - paddingLeft;
                    int i15 = (int) (((float) min) * this.f3814b);
                    i6 = i13 + i14 + i15;
                    this.f3814b = ((float) i15) / ((float) this.f3815c);
                    i5 = 0;
                } else if (!this.f3825r || this.f3827t == 0) {
                    i5 = 0;
                    i6 = paddingRight;
                } else {
                    i5 = (int) ((1.0f - this.f3814b) * ((float) this.f3827t));
                    i6 = paddingRight;
                }
                if (i10) {
                    i8 = (i11 - i6) + i5;
                    i7 = i8 - measuredWidth;
                } else {
                    i7 = i6 - i5;
                    i8 = i7 + measuredWidth;
                }
                childAt.layout(i7, paddingTop, i8, childAt.getMeasuredHeight() + paddingTop);
                width = childAt.getWidth() + paddingRight;
                i9 = i6;
            }
            i12++;
            paddingRight = width;
            i13 = i9;
        }
        if (this.f3831x) {
            if (this.f3825r) {
                if (this.f3827t != 0) {
                    m7400a(this.f3814b);
                }
                if (((C1251d) this.f3813a.getLayoutParams()).f3841c) {
                    m7401a(this.f3813a, this.f3814b, this.f3820l);
                }
            } else {
                for (int i16 = 0; i16 < childCount; i16++) {
                    m7401a(getChildAt(i16), 0.0f, this.f3820l);
                }
            }
            mo4194d(this.f3813a);
        }
        this.f3831x = false;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int paddingTop;
        int i7;
        int i8;
        boolean z;
        float f;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode == 1073741824) {
            if (mode2 == 0) {
                if (!isInEditMode()) {
                    throw new IllegalStateException("Height must not be UNSPECIFIED");
                } else if (mode2 == 0) {
                    i3 = Integer.MIN_VALUE;
                    i4 = size;
                    i5 = 300;
                }
            }
            i3 = mode2;
            i4 = size;
            i5 = size2;
        } else if (!isInEditMode()) {
            throw new IllegalStateException("Width must have an exact value or MATCH_PARENT");
        } else if (mode == Integer.MIN_VALUE) {
            i3 = mode2;
            i4 = size;
            i5 = size2;
        } else {
            if (mode == 0) {
                i3 = mode2;
                i4 = 300;
                i5 = size2;
            }
            i3 = mode2;
            i4 = size;
            i5 = size2;
        }
        switch (i3) {
            case Integer.MIN_VALUE:
                i6 = 0;
                paddingTop = (i5 - getPaddingTop()) - getPaddingBottom();
                break;
            case 1073741824:
                i6 = (i5 - getPaddingTop()) - getPaddingBottom();
                paddingTop = i6;
                break;
            default:
                i6 = 0;
                paddingTop = -1;
                break;
        }
        boolean z2 = false;
        int paddingLeft = (i4 - getPaddingLeft()) - getPaddingRight();
        int childCount = getChildCount();
        if (childCount > 2) {
            Log.e(f3809i, "onMeasure: More than two child views are not supported.");
        }
        this.f3813a = null;
        int i9 = 0;
        int i10 = paddingLeft;
        int i11 = i6;
        float f2 = 0.0f;
        while (i9 < childCount) {
            View childAt = getChildAt(i9);
            C1251d dVar = (C1251d) childAt.getLayoutParams();
            if (childAt.getVisibility() == 8) {
                dVar.f3841c = false;
                i7 = i10;
                f = f2;
                i8 = i11;
                z = z2;
            } else {
                if (dVar.f3839a > 0.0f) {
                    f2 += dVar.f3839a;
                    if (dVar.width == 0) {
                        i7 = i10;
                        f = f2;
                        i8 = i11;
                        z = z2;
                    }
                }
                int i12 = dVar.leftMargin + dVar.rightMargin;
                childAt.measure(dVar.width == -2 ? View.MeasureSpec.makeMeasureSpec(paddingLeft - i12, Integer.MIN_VALUE) : dVar.width == -1 ? View.MeasureSpec.makeMeasureSpec(paddingLeft - i12, 1073741824) : View.MeasureSpec.makeMeasureSpec(dVar.width, 1073741824), dVar.height == -2 ? View.MeasureSpec.makeMeasureSpec(paddingTop, Integer.MIN_VALUE) : dVar.height == -1 ? View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824) : View.MeasureSpec.makeMeasureSpec(dVar.height, 1073741824));
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (i3 == Integer.MIN_VALUE && measuredHeight > i11) {
                    i11 = Math.min(measuredHeight, paddingTop);
                }
                int i13 = i10 - measuredWidth;
                boolean z3 = i13 < 0;
                dVar.f3840b = z3;
                boolean z4 = z3 | z2;
                if (dVar.f3840b) {
                    this.f3813a = childAt;
                }
                i7 = i13;
                i8 = i11;
                float f3 = f2;
                z = z4;
                f = f3;
            }
            i9++;
            z2 = z;
            i11 = i8;
            f2 = f;
            i10 = i7;
        }
        if (z2 || f2 > 0.0f) {
            int i14 = paddingLeft - this.f3824q;
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt2 = getChildAt(i15);
                if (childAt2.getVisibility() != 8) {
                    C1251d dVar2 = (C1251d) childAt2.getLayoutParams();
                    if (childAt2.getVisibility() != 8) {
                        boolean z5 = dVar2.width == 0 && dVar2.f3839a > 0.0f;
                        int measuredWidth2 = z5 ? 0 : childAt2.getMeasuredWidth();
                        if (!z2 || childAt2 == this.f3813a) {
                            if (dVar2.f3839a > 0.0f) {
                                int makeMeasureSpec = dVar2.width == 0 ? dVar2.height == -2 ? View.MeasureSpec.makeMeasureSpec(paddingTop, Integer.MIN_VALUE) : dVar2.height == -1 ? View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824) : View.MeasureSpec.makeMeasureSpec(dVar2.height, 1073741824) : View.MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), 1073741824);
                                if (z2) {
                                    int i16 = paddingLeft - (dVar2.rightMargin + dVar2.leftMargin);
                                    int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i16, 1073741824);
                                    if (measuredWidth2 != i16) {
                                        childAt2.measure(makeMeasureSpec2, makeMeasureSpec);
                                    }
                                } else {
                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(((int) ((dVar2.f3839a * ((float) Math.max(0, i10))) / f2)) + measuredWidth2, 1073741824), makeMeasureSpec);
                                }
                            }
                        } else if (dVar2.width < 0 && (measuredWidth2 > i14 || dVar2.f3839a > 0.0f)) {
                            childAt2.measure(View.MeasureSpec.makeMeasureSpec(i14, 1073741824), z5 ? dVar2.height == -2 ? View.MeasureSpec.makeMeasureSpec(paddingTop, Integer.MIN_VALUE) : dVar2.height == -1 ? View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824) : View.MeasureSpec.makeMeasureSpec(dVar2.height, 1073741824) : View.MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), 1073741824));
                        }
                    }
                }
            }
        }
        setMeasuredDimension(i4, getPaddingTop() + i11 + getPaddingBottom());
        this.f3825r = z2;
        if (this.f3817e.mo4320b() != 0 && !z2) {
            this.f3817e.mo4337h();
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C1253f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1253f fVar = (C1253f) parcelable;
        super.onRestoreInstanceState(fVar.mo3092a());
        if (fVar.f3843b) {
            mo4190c();
        } else {
            mo4198e();
        }
        this.f3818f = fVar.f3843b;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C1253f fVar = new C1253f(super.onSaveInstanceState());
        fVar.f3843b = mo4208h() ? mo4199f() : this.f3818f;
        return fVar;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            this.f3831x = true;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f3825r) {
            return super.onTouchEvent(motionEvent);
        }
        this.f3817e.mo4321b(motionEvent);
        switch (motionEvent.getAction() & 255) {
            case 0:
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                this.f3828u = x;
                this.f3829v = y;
                return true;
            case 1:
                if (!mo4200f(this.f3813a)) {
                    return true;
                }
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                float f = x2 - this.f3828u;
                float f2 = y2 - this.f3829v;
                int f3 = this.f3817e.mo4335f();
                if ((f * f) + (f2 * f2) >= ((float) (f3 * f3)) || !this.f3817e.mo4325b(this.f3813a, (int) x2, (int) y2)) {
                    return true;
                }
                m7402a(this.f3813a, 0);
                return true;
            default:
                return true;
        }
    }

    public void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        if (!isInTouchMode() && !this.f3825r) {
            this.f3818f = view == this.f3813a;
        }
    }

    public void setCoveredFadeColor(@C0032k int i) {
        this.f3821n = i;
    }

    public void setPanelSlideListener(C1252e eVar) {
        this.f3830w = eVar;
    }

    public void setParallaxDistance(int i) {
        this.f3827t = i;
        requestLayout();
    }

    @Deprecated
    public void setShadowDrawable(Drawable drawable) {
        setShadowDrawableLeft(drawable);
    }

    public void setShadowDrawableLeft(Drawable drawable) {
        this.f3822o = drawable;
    }

    public void setShadowDrawableRight(Drawable drawable) {
        this.f3823p = drawable;
    }

    @Deprecated
    public void setShadowResource(@C0036o int i) {
        setShadowDrawable(getResources().getDrawable(i));
    }

    public void setShadowResourceLeft(int i) {
        setShadowDrawableLeft(C0434d.m2370a(getContext(), i));
    }

    public void setShadowResourceRight(int i) {
        setShadowDrawableRight(C0434d.m2370a(getContext(), i));
    }

    public void setSliderFadeColor(@C0032k int i) {
        this.f3820l = i;
    }
}
