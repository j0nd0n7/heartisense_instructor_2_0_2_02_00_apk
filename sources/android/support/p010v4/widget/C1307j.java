package android.support.p010v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.annotation.C0003aa;
import android.support.annotation.C0032k;
import android.support.annotation.C0036o;
import android.support.annotation.C0047z;
import android.support.p010v4.p014d.C0434d;
import android.support.p010v4.p018f.p019a.C0484a;
import android.support.p010v4.p028k.C0808j;
import android.support.p010v4.p028k.C0810k;
import android.support.p010v4.view.C0919a;
import android.support.p010v4.view.C1040ar;
import android.support.p010v4.view.C1066b;
import android.support.p010v4.view.C1092bf;
import android.support.p010v4.view.C1161h;
import android.support.p010v4.view.p034a.C0949h;
import android.support.p010v4.widget.C1285av;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v4.widget.j */
public class C1307j extends ViewGroup implements C1322l {

    /* renamed from: a */
    public static final int f4022a = 0;

    /* renamed from: b */
    public static final int f4023b = 1;

    /* renamed from: c */
    public static final int f4024c = 2;

    /* renamed from: d */
    public static final int f4025d = 0;

    /* renamed from: e */
    public static final int f4026e = 1;

    /* renamed from: f */
    public static final int f4027f = 2;

    /* renamed from: g */
    public static final int f4028g = 3;

    /* renamed from: h */
    static final int[] f4029h = {16842931};

    /* renamed from: i */
    static final boolean f4030i = (Build.VERSION.SDK_INT >= 19);

    /* renamed from: j */
    static final C1310c f4031j;

    /* renamed from: k */
    private static final String f4032k = "DrawerLayout";

    /* renamed from: l */
    private static final int f4033l = 64;

    /* renamed from: m */
    private static final int f4034m = 10;

    /* renamed from: n */
    private static final int f4035n = -1728053248;

    /* renamed from: o */
    private static final int f4036o = 160;

    /* renamed from: p */
    private static final int f4037p = 400;

    /* renamed from: q */
    private static final boolean f4038q = false;

    /* renamed from: r */
    private static final boolean f4039r = true;

    /* renamed from: s */
    private static final float f4040s = 1.0f;

    /* renamed from: t */
    private static final boolean f4041t;

    /* renamed from: A */
    private final C1285av f4042A;

    /* renamed from: B */
    private final C1285av f4043B;

    /* renamed from: C */
    private final C1318j f4044C;

    /* renamed from: D */
    private final C1318j f4045D;

    /* renamed from: E */
    private int f4046E;

    /* renamed from: F */
    private boolean f4047F;

    /* renamed from: G */
    private boolean f4048G;

    /* renamed from: H */
    private int f4049H;

    /* renamed from: I */
    private int f4050I;

    /* renamed from: J */
    private int f4051J;

    /* renamed from: K */
    private int f4052K;

    /* renamed from: L */
    private boolean f4053L;

    /* renamed from: M */
    private boolean f4054M;
    @C0003aa

    /* renamed from: N */
    private C1313f f4055N;

    /* renamed from: O */
    private List<C1313f> f4056O;

    /* renamed from: P */
    private float f4057P;

    /* renamed from: Q */
    private float f4058Q;

    /* renamed from: R */
    private Drawable f4059R;

    /* renamed from: S */
    private Drawable f4060S;

    /* renamed from: T */
    private Drawable f4061T;

    /* renamed from: U */
    private CharSequence f4062U;

    /* renamed from: V */
    private CharSequence f4063V;

    /* renamed from: W */
    private Object f4064W;

    /* renamed from: aa */
    private boolean f4065aa;

    /* renamed from: ab */
    private Drawable f4066ab;

    /* renamed from: ac */
    private Drawable f4067ac;

    /* renamed from: ad */
    private Drawable f4068ad;

    /* renamed from: ae */
    private Drawable f4069ae;

    /* renamed from: af */
    private final ArrayList<View> f4070af;

    /* renamed from: u */
    private final C1309b f4071u;

    /* renamed from: v */
    private float f4072v;

    /* renamed from: w */
    private int f4073w;

    /* renamed from: x */
    private int f4074x;

    /* renamed from: y */
    private float f4075y;

    /* renamed from: z */
    private Paint f4076z;

    /* renamed from: android.support.v4.widget.j$a */
    class C1308a extends C1066b {

        /* renamed from: c */
        private final Rect f4078c = new Rect();

        C1308a() {
        }

        /* renamed from: a */
        private void m7701a(C0949h hVar, C0949h hVar2) {
            Rect rect = this.f4078c;
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
        }

        /* renamed from: a */
        private void m7702a(C0949h hVar, ViewGroup viewGroup) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (C1307j.m7659l(childAt)) {
                    hVar.mo3177c(childAt);
                }
            }
        }

        /* renamed from: a */
        public void mo3076a(View view, C0949h hVar) {
            if (C1307j.f4030i) {
                super.mo3076a(view, hVar);
            } else {
                C0949h a = C0949h.m4703a(hVar);
                super.mo3076a(view, a);
                hVar.mo3166b(view);
                ViewParent l = C1040ar.m5950l(view);
                if (l instanceof View) {
                    hVar.mo3190e((View) l);
                }
                m7701a(hVar, a);
                a.mo3245y();
                m7702a(hVar, (ViewGroup) view);
            }
            hVar.mo3168b((CharSequence) C1307j.class.getName());
            hVar.mo3181c(false);
            hVar.mo3186d(false);
            hVar.mo3172b(C0949h.C0950a.f3314a);
            hVar.mo3172b(C0949h.C0950a.f3315b);
        }

        /* renamed from: a */
        public boolean mo3767a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (C1307j.f4030i || C1307j.m7659l(view)) {
                return super.mo3767a(viewGroup, view, accessibilityEvent);
            }
            return false;
        }

        /* renamed from: b */
        public boolean mo3768b(View view, AccessibilityEvent accessibilityEvent) {
            CharSequence b;
            if (accessibilityEvent.getEventType() != 32) {
                return super.mo3768b(view, accessibilityEvent);
            }
            List text = accessibilityEvent.getText();
            View c = C1307j.this.mo4410c();
            if (!(c == null || (b = C1307j.this.mo4402b(C1307j.this.mo4419e(c))) == null)) {
                text.add(b);
            }
            return C1307j.f4039r;
        }

        /* renamed from: d */
        public void mo3078d(View view, AccessibilityEvent accessibilityEvent) {
            super.mo3078d(view, accessibilityEvent);
            accessibilityEvent.setClassName(C1307j.class.getName());
        }
    }

    /* renamed from: android.support.v4.widget.j$b */
    final class C1309b extends C1066b {
        C1309b() {
        }

        /* renamed from: a */
        public void mo3076a(View view, C0949h hVar) {
            super.mo3076a(view, hVar);
            if (!C1307j.m7659l(view)) {
                hVar.mo3190e((View) null);
            }
        }
    }

    /* renamed from: android.support.v4.widget.j$c */
    interface C1310c {
        /* renamed from: a */
        int mo4456a(Object obj);

        /* renamed from: a */
        Drawable mo4457a(Context context);

        /* renamed from: a */
        void mo4458a(View view);

        /* renamed from: a */
        void mo4459a(View view, Object obj, int i);

        /* renamed from: a */
        void mo4460a(ViewGroup.MarginLayoutParams marginLayoutParams, Object obj, int i);
    }

    /* renamed from: android.support.v4.widget.j$d */
    static class C1311d implements C1310c {
        C1311d() {
        }

        /* renamed from: a */
        public int mo4456a(Object obj) {
            return C1320k.m7750a(obj);
        }

        /* renamed from: a */
        public Drawable mo4457a(Context context) {
            return C1320k.m7751a(context);
        }

        /* renamed from: a */
        public void mo4458a(View view) {
            C1320k.m7752a(view);
        }

        /* renamed from: a */
        public void mo4459a(View view, Object obj, int i) {
            C1320k.m7753a(view, obj, i);
        }

        /* renamed from: a */
        public void mo4460a(ViewGroup.MarginLayoutParams marginLayoutParams, Object obj, int i) {
            C1320k.m7754a(marginLayoutParams, obj, i);
        }
    }

    /* renamed from: android.support.v4.widget.j$e */
    static class C1312e implements C1310c {
        C1312e() {
        }

        /* renamed from: a */
        public int mo4456a(Object obj) {
            return 0;
        }

        /* renamed from: a */
        public Drawable mo4457a(Context context) {
            return null;
        }

        /* renamed from: a */
        public void mo4458a(View view) {
        }

        /* renamed from: a */
        public void mo4459a(View view, Object obj, int i) {
        }

        /* renamed from: a */
        public void mo4460a(ViewGroup.MarginLayoutParams marginLayoutParams, Object obj, int i) {
        }
    }

    /* renamed from: android.support.v4.widget.j$f */
    public interface C1313f {
        /* renamed from: a */
        void mo743a(View view);

        /* renamed from: a */
        void mo744a(View view, float f);

        /* renamed from: b */
        void mo747b(int i);

        /* renamed from: b */
        void mo748b(View view);
    }

    /* renamed from: android.support.v4.widget.j$g */
    public static class C1314g extends ViewGroup.MarginLayoutParams {

        /* renamed from: e */
        private static final int f4080e = 1;

        /* renamed from: f */
        private static final int f4081f = 2;

        /* renamed from: g */
        private static final int f4082g = 4;

        /* renamed from: a */
        public int f4083a;

        /* renamed from: b */
        float f4084b;

        /* renamed from: c */
        boolean f4085c;

        /* renamed from: d */
        int f4086d;

        public C1314g(int i, int i2) {
            super(i, i2);
            this.f4083a = 0;
        }

        public C1314g(int i, int i2, int i3) {
            this(i, i2);
            this.f4083a = i3;
        }

        public C1314g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f4083a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1307j.f4029h);
            this.f4083a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public C1314g(C1314g gVar) {
            super(gVar);
            this.f4083a = 0;
            this.f4083a = gVar.f4083a;
        }

        public C1314g(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f4083a = 0;
        }

        public C1314g(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f4083a = 0;
        }
    }

    /* renamed from: android.support.v4.widget.j$h */
    protected static class C1315h extends C0919a {
        public static final Parcelable.Creator<C1315h> CREATOR = C0808j.m4090a(new C0810k<C1315h>() {
            /* renamed from: b */
            public C1315h mo2679a(Parcel parcel, ClassLoader classLoader) {
                return new C1315h(parcel, classLoader);
            }

            /* renamed from: b */
            public C1315h[] mo2680a(int i) {
                return new C1315h[i];
            }
        });

        /* renamed from: b */
        int f4087b = 0;

        /* renamed from: c */
        int f4088c;

        /* renamed from: d */
        int f4089d;

        /* renamed from: e */
        int f4090e;

        /* renamed from: f */
        int f4091f;

        public C1315h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f4087b = parcel.readInt();
            this.f4088c = parcel.readInt();
            this.f4089d = parcel.readInt();
            this.f4090e = parcel.readInt();
            this.f4091f = parcel.readInt();
        }

        public C1315h(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f4087b);
            parcel.writeInt(this.f4088c);
            parcel.writeInt(this.f4089d);
            parcel.writeInt(this.f4090e);
            parcel.writeInt(this.f4091f);
        }
    }

    /* renamed from: android.support.v4.widget.j$i */
    public static abstract class C1317i implements C1313f {
        /* renamed from: a */
        public void mo743a(View view) {
        }

        /* renamed from: a */
        public void mo744a(View view, float f) {
        }

        /* renamed from: b */
        public void mo747b(int i) {
        }

        /* renamed from: b */
        public void mo748b(View view) {
        }
    }

    /* renamed from: android.support.v4.widget.j$j */
    private class C1318j extends C1285av.C1288a {

        /* renamed from: b */
        private final int f4093b;

        /* renamed from: c */
        private C1285av f4094c;

        /* renamed from: d */
        private final Runnable f4095d = new Runnable() {
            public void run() {
                C1318j.this.mo4465b();
            }
        };

        C1318j(int i) {
            this.f4093b = i;
        }

        /* renamed from: c */
        private void m7735c() {
            int i = 3;
            if (this.f4093b == 3) {
                i = 5;
            }
            View c = C1307j.this.mo4411c(i);
            if (c != null) {
                C1307j.this.mo4432i(c);
            }
        }

        /* renamed from: a */
        public int mo4232a(View view) {
            if (C1307j.this.mo4424g(view)) {
                return view.getWidth();
            }
            return 0;
        }

        /* renamed from: a */
        public int mo4233a(View view, int i, int i2) {
            if (C1307j.this.mo4399a(view, 3)) {
                return Math.max(-view.getWidth(), Math.min(i, 0));
            }
            int width = C1307j.this.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i, width));
        }

        /* renamed from: a */
        public void mo4463a() {
            C1307j.this.removeCallbacks(this.f4095d);
        }

        /* renamed from: a */
        public void mo4234a(int i) {
            C1307j.this.mo4389a(this.f4093b, i, this.f4094c.mo4329d());
        }

        /* renamed from: a */
        public void mo4340a(int i, int i2) {
            C1307j.this.postDelayed(this.f4095d, 160);
        }

        /* renamed from: a */
        public void mo4464a(C1285av avVar) {
            this.f4094c = avVar;
        }

        /* renamed from: a */
        public void mo4235a(View view, float f, float f2) {
            int width;
            float d = C1307j.this.mo4416d(view);
            int width2 = view.getWidth();
            if (C1307j.this.mo4399a(view, 3)) {
                width = (f > 0.0f || (f == 0.0f && d > 0.5f)) ? 0 : -width2;
            } else {
                width = C1307j.this.getWidth();
                if (f < 0.0f || (f == 0.0f && d > 0.5f)) {
                    width -= width2;
                }
            }
            this.f4094c.mo4315a(width, view.getTop());
            C1307j.this.invalidate();
        }

        /* renamed from: a */
        public void mo4236a(View view, int i, int i2, int i3, int i4) {
            int width = view.getWidth();
            float width2 = C1307j.this.mo4399a(view, 3) ? ((float) (width + i)) / ((float) width) : ((float) (C1307j.this.getWidth() - i)) / ((float) width);
            C1307j.this.mo4408b(view, width2);
            view.setVisibility(width2 == 0.0f ? 4 : 0);
            C1307j.this.invalidate();
        }

        /* renamed from: a */
        public boolean mo4237a(View view, int i) {
            if (!C1307j.this.mo4424g(view) || !C1307j.this.mo4399a(view, this.f4093b) || C1307j.this.mo4386a(view) != 0) {
                return false;
            }
            return C1307j.f4039r;
        }

        /* renamed from: b */
        public int mo4238b(View view, int i, int i2) {
            return view.getTop();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo4465b() {
            View view;
            int i;
            int i2 = 0;
            int c = this.f4094c.mo4326c();
            boolean z = this.f4093b == 3;
            if (z) {
                View c2 = C1307j.this.mo4411c(3);
                if (c2 != null) {
                    i2 = -c2.getWidth();
                }
                int i3 = i2 + c;
                view = c2;
                i = i3;
            } else {
                View c3 = C1307j.this.mo4411c(5);
                int width = C1307j.this.getWidth() - c;
                view = c3;
                i = width;
            }
            if (view == null) {
                return;
            }
            if (((z && view.getLeft() < i) || (!z && view.getLeft() > i)) && C1307j.this.mo4386a(view) == 0) {
                this.f4094c.mo4317a(view, i, view.getTop());
                ((C1314g) view.getLayoutParams()).f4085c = C1307j.f4039r;
                C1307j.this.invalidate();
                m7735c();
                C1307j.this.mo4417d();
            }
        }

        /* renamed from: b */
        public void mo4239b(int i, int i2) {
            View c = (i & 1) == 1 ? C1307j.this.mo4411c(3) : C1307j.this.mo4411c(5);
            if (c != null && C1307j.this.mo4386a(c) == 0) {
                this.f4094c.mo4314a(c, i2);
            }
        }

        /* renamed from: b */
        public void mo4240b(View view, int i) {
            ((C1314g) view.getLayoutParams()).f4085c = false;
            m7735c();
        }

        /* renamed from: b */
        public boolean mo4342b(int i) {
            return false;
        }
    }

    static {
        boolean z = f4039r;
        if (Build.VERSION.SDK_INT < 21) {
            z = false;
        }
        f4041t = z;
        if (Build.VERSION.SDK_INT >= 21) {
            f4031j = new C1311d();
        } else {
            f4031j = new C1312e();
        }
    }

    public C1307j(Context context) {
        this(context, (AttributeSet) null);
    }

    public C1307j(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C1307j(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4071u = new C1309b();
        this.f4074x = f4035n;
        this.f4076z = new Paint();
        this.f4048G = f4039r;
        this.f4049H = 3;
        this.f4050I = 3;
        this.f4051J = 3;
        this.f4052K = 3;
        this.f4066ab = null;
        this.f4067ac = null;
        this.f4068ad = null;
        this.f4069ae = null;
        setDescendantFocusability(262144);
        float f = getResources().getDisplayMetrics().density;
        this.f4073w = (int) ((64.0f * f) + 0.5f);
        float f2 = 400.0f * f;
        this.f4044C = new C1318j(3);
        this.f4045D = new C1318j(5);
        this.f4042A = C1285av.m7538a((ViewGroup) this, (float) f4040s, (C1285av.C1288a) this.f4044C);
        this.f4042A.mo4312a(1);
        this.f4042A.mo4311a(f2);
        this.f4044C.mo4464a(this.f4042A);
        this.f4043B = C1285av.m7538a((ViewGroup) this, (float) f4040s, (C1285av.C1288a) this.f4045D);
        this.f4043B.mo4312a(2);
        this.f4043B.mo4311a(f2);
        this.f4045D.mo4464a(this.f4043B);
        setFocusableInTouchMode(f4039r);
        C1040ar.m5926d((View) this, 1);
        C1040ar.m5893a((View) this, (C1066b) new C1308a());
        C1092bf.m6534a((ViewGroup) this, false);
        if (C1040ar.m5866P(this)) {
            f4031j.mo4458a((View) this);
            this.f4059R = f4031j.mo4457a(context);
        }
        this.f4072v = f * 10.0f;
        this.f4070af = new ArrayList<>();
    }

    /* renamed from: b */
    private boolean m7651b(Drawable drawable, int i) {
        if (drawable == null || !C0484a.m2545b(drawable)) {
            return false;
        }
        C0484a.m2546b(drawable, i);
        return f4039r;
    }

    /* renamed from: c */
    private void m7652c(View view, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((z || mo4424g(childAt)) && (!z || childAt != view)) {
                C1040ar.m5926d(childAt, 4);
            } else {
                C1040ar.m5926d(childAt, 1);
            }
        }
    }

    /* renamed from: d */
    static String m7653d(int i) {
        return (i & 3) == 3 ? "LEFT" : (i & 5) == 5 ? "RIGHT" : Integer.toHexString(i);
    }

    /* renamed from: e */
    private void m7654e() {
        if (!f4041t) {
            this.f4060S = m7655f();
            this.f4061T = m7656g();
        }
    }

    /* renamed from: f */
    private Drawable m7655f() {
        int k = C1040ar.m5947k(this);
        if (k == 0) {
            if (this.f4066ab != null) {
                m7651b(this.f4066ab, k);
                return this.f4066ab;
            }
        } else if (this.f4067ac != null) {
            m7651b(this.f4067ac, k);
            return this.f4067ac;
        }
        return this.f4068ad;
    }

    /* renamed from: g */
    private Drawable m7656g() {
        int k = C1040ar.m5947k(this);
        if (k == 0) {
            if (this.f4067ac != null) {
                m7651b(this.f4067ac, k);
                return this.f4067ac;
            }
        } else if (this.f4066ab != null) {
            m7651b(this.f4066ab, k);
            return this.f4066ab;
        }
        return this.f4069ae;
    }

    /* renamed from: h */
    private boolean m7657h() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((C1314g) getChildAt(i).getLayoutParams()).f4085c) {
                return f4039r;
            }
        }
        return false;
    }

    /* renamed from: i */
    private boolean m7658i() {
        if (mo4410c() != null) {
            return f4039r;
        }
        return false;
    }

    /* renamed from: l */
    static boolean m7659l(View view) {
        if (C1040ar.m5928e(view) == 4 || C1040ar.m5928e(view) == 2) {
            return false;
        }
        return f4039r;
    }

    /* renamed from: m */
    private static boolean m7660m(View view) {
        Drawable background = view.getBackground();
        if (background == null || background.getOpacity() != -1) {
            return false;
        }
        return f4039r;
    }

    /* renamed from: a */
    public int mo4385a(int i) {
        int k = C1040ar.m5947k(this);
        switch (i) {
            case 3:
                if (this.f4049H != 3) {
                    return this.f4049H;
                }
                int i2 = k == 0 ? this.f4051J : this.f4052K;
                if (i2 != 3) {
                    return i2;
                }
                break;
            case 5:
                if (this.f4050I != 3) {
                    return this.f4050I;
                }
                int i3 = k == 0 ? this.f4052K : this.f4051J;
                if (i3 != 3) {
                    return i3;
                }
                break;
            case C1161h.f3608c:
                if (this.f4051J != 3) {
                    return this.f4051J;
                }
                int i4 = k == 0 ? this.f4049H : this.f4050I;
                if (i4 != 3) {
                    return i4;
                }
                break;
            case C1161h.f3609d:
                if (this.f4052K != 3) {
                    return this.f4052K;
                }
                int i5 = k == 0 ? this.f4050I : this.f4049H;
                if (i5 != 3) {
                    return i5;
                }
                break;
        }
        return 0;
    }

    /* renamed from: a */
    public int mo4386a(View view) {
        if (mo4424g(view)) {
            return mo4385a(((C1314g) view.getLayoutParams()).f4083a);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public View mo4387a() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((((C1314g) childAt.getLayoutParams()).f4086d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo4388a(@C0036o int i, int i2) {
        mo4393a(C0434d.m2370a(getContext(), i), i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4389a(int i, int i2, View view) {
        int b = this.f4042A.mo4320b();
        int b2 = this.f4043B.mo4320b();
        int i3 = (b == 1 || b2 == 1) ? 1 : (b == 2 || b2 == 2) ? 2 : 0;
        if (view != null && i2 == 0) {
            C1314g gVar = (C1314g) view.getLayoutParams();
            if (gVar.f4084b == 0.0f) {
                mo4407b(view);
            } else if (gVar.f4084b == f4040s) {
                mo4412c(view);
            }
        }
        if (i3 != this.f4046E) {
            this.f4046E = i3;
            if (this.f4056O != null) {
                for (int size = this.f4056O.size() - 1; size >= 0; size--) {
                    this.f4056O.get(size).mo747b(i3);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo4390a(int i, View view) {
        if (!mo4424g(view)) {
            throw new IllegalArgumentException("View " + view + " is not a " + "drawer with appropriate layout_gravity");
        }
        mo4404b(i, ((C1314g) view.getLayoutParams()).f4083a);
    }

    /* renamed from: a */
    public void mo4391a(int i, CharSequence charSequence) {
        int a = C1161h.m6976a(i, C1040ar.m5947k(this));
        if (a == 3) {
            this.f4062U = charSequence;
        } else if (a == 5) {
            this.f4063V = charSequence;
        }
    }

    /* renamed from: a */
    public void mo4392a(int i, boolean z) {
        View c = mo4411c(i);
        if (c == null) {
            throw new IllegalArgumentException("No drawer view found with gravity " + m7653d(i));
        }
        mo4396a(c, z);
    }

    /* renamed from: a */
    public void mo4393a(Drawable drawable, int i) {
        if (!f4041t) {
            if ((i & C1161h.f3608c) == 8388611) {
                this.f4066ab = drawable;
            } else if ((i & C1161h.f3609d) == 8388613) {
                this.f4067ac = drawable;
            } else if ((i & 3) == 3) {
                this.f4068ad = drawable;
            } else if ((i & 5) == 5) {
                this.f4069ae = drawable;
            } else {
                return;
            }
            m7654e();
            invalidate();
        }
    }

    /* renamed from: a */
    public void mo4394a(@C0047z C1313f fVar) {
        if (fVar != null) {
            if (this.f4056O == null) {
                this.f4056O = new ArrayList();
            }
            this.f4056O.add(fVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4395a(View view, float f) {
        if (this.f4056O != null) {
            for (int size = this.f4056O.size() - 1; size >= 0; size--) {
                this.f4056O.get(size).mo744a(view, f);
            }
        }
    }

    /* renamed from: a */
    public void mo4396a(View view, boolean z) {
        if (!mo4424g(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        C1314g gVar = (C1314g) view.getLayoutParams();
        if (this.f4048G) {
            gVar.f4084b = f4040s;
            gVar.f4086d = 1;
            m7652c(view, (boolean) f4039r);
        } else if (z) {
            gVar.f4086d |= 2;
            if (mo4399a(view, 3)) {
                this.f4042A.mo4317a(view, 0, view.getTop());
            } else {
                this.f4043B.mo4317a(view, getWidth() - view.getWidth(), view.getTop());
            }
        } else {
            mo4413c(view, (float) f4040s);
            mo4389a(gVar.f4083a, 0, view);
            view.setVisibility(0);
        }
        invalidate();
    }

    /* renamed from: a */
    public void mo4397a(Object obj, boolean z) {
        this.f4064W = obj;
        this.f4065aa = z;
        setWillNotDraw((z || getBackground() != null) ? false : f4039r);
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4398a(boolean z) {
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C1314g gVar = (C1314g) childAt.getLayoutParams();
            if (mo4424g(childAt) && (!z || gVar.f4085c)) {
                z2 = mo4399a(childAt, 3) ? z2 | this.f4042A.mo4317a(childAt, -childAt.getWidth(), childAt.getTop()) : z2 | this.f4043B.mo4317a(childAt, getWidth(), childAt.getTop());
                gVar.f4085c = false;
            }
        }
        this.f4044C.mo4463a();
        this.f4045D.mo4463a();
        if (z2) {
            invalidate();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo4399a(View view, int i) {
        if ((mo4419e(view) & i) == i) {
            return f4039r;
        }
        return false;
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        if (getDescendantFocusability() != 393216) {
            int childCount = getChildCount();
            boolean z = false;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (!mo4424g(childAt)) {
                    this.f4070af.add(childAt);
                } else if (mo4433j(childAt)) {
                    z = f4039r;
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
            if (!z) {
                int size = this.f4070af.size();
                for (int i4 = 0; i4 < size; i4++) {
                    View view = this.f4070af.get(i4);
                    if (view.getVisibility() == 0) {
                        view.addFocusables(arrayList, i, i2);
                    }
                }
            }
            this.f4070af.clear();
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (mo4387a() != null || mo4424g(view)) {
            C1040ar.m5926d(view, 4);
        } else {
            C1040ar.m5926d(view, 1);
        }
        if (!f4030i) {
            C1040ar.m5893a(view, (C1066b) this.f4071u);
        }
    }

    @C0003aa
    /* renamed from: b */
    public CharSequence mo4402b(int i) {
        int a = C1161h.m6976a(i, C1040ar.m5947k(this));
        if (a == 3) {
            return this.f4062U;
        }
        if (a == 5) {
            return this.f4063V;
        }
        return null;
    }

    /* renamed from: b */
    public void mo4403b() {
        mo4398a(false);
    }

    /* renamed from: b */
    public void mo4404b(int i, int i2) {
        int a = C1161h.m6976a(i2, C1040ar.m5947k(this));
        switch (i2) {
            case 3:
                this.f4049H = i;
                break;
            case 5:
                this.f4050I = i;
                break;
            case C1161h.f3608c:
                this.f4051J = i;
                break;
            case C1161h.f3609d:
                this.f4052K = i;
                break;
        }
        if (i != 0) {
            (a == 3 ? this.f4042A : this.f4043B).mo4336g();
        }
        switch (i) {
            case 1:
                View c = mo4411c(a);
                if (c != null) {
                    mo4432i(c);
                    return;
                }
                return;
            case 2:
                View c2 = mo4411c(a);
                if (c2 != null) {
                    mo4430h(c2);
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: b */
    public void mo4405b(int i, boolean z) {
        View c = mo4411c(i);
        if (c == null) {
            throw new IllegalArgumentException("No drawer view found with gravity " + m7653d(i));
        }
        mo4409b(c, z);
    }

    /* renamed from: b */
    public void mo4406b(@C0047z C1313f fVar) {
        if (fVar != null && this.f4056O != null) {
            this.f4056O.remove(fVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo4407b(View view) {
        View rootView;
        C1314g gVar = (C1314g) view.getLayoutParams();
        if ((gVar.f4086d & 1) == 1) {
            gVar.f4086d = 0;
            if (this.f4056O != null) {
                for (int size = this.f4056O.size() - 1; size >= 0; size--) {
                    this.f4056O.get(size).mo748b(view);
                }
            }
            m7652c(view, false);
            if (hasWindowFocus() && (rootView = getRootView()) != null) {
                rootView.sendAccessibilityEvent(32);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo4408b(View view, float f) {
        C1314g gVar = (C1314g) view.getLayoutParams();
        if (f != gVar.f4084b) {
            gVar.f4084b = f;
            mo4395a(view, f);
        }
    }

    /* renamed from: b */
    public void mo4409b(View view, boolean z) {
        if (!mo4424g(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        C1314g gVar = (C1314g) view.getLayoutParams();
        if (this.f4048G) {
            gVar.f4084b = 0.0f;
            gVar.f4086d = 0;
        } else if (z) {
            gVar.f4086d |= 4;
            if (mo4399a(view, 3)) {
                this.f4042A.mo4317a(view, -view.getWidth(), view.getTop());
            } else {
                this.f4043B.mo4317a(view, getWidth(), view.getTop());
            }
        } else {
            mo4413c(view, 0.0f);
            mo4389a(gVar.f4083a, 0, view);
            view.setVisibility(4);
        }
        invalidate();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public View mo4410c() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (mo4424g(childAt) && mo4434k(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public View mo4411c(int i) {
        int a = C1161h.m6976a(i, C1040ar.m5947k(this)) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((mo4419e(childAt) & 7) == a) {
                return childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo4412c(View view) {
        C1314g gVar = (C1314g) view.getLayoutParams();
        if ((gVar.f4086d & 1) == 0) {
            gVar.f4086d = 1;
            if (this.f4056O != null) {
                for (int size = this.f4056O.size() - 1; size >= 0; size--) {
                    this.f4056O.get(size).mo743a(view);
                }
            }
            m7652c(view, (boolean) f4039r);
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo4413c(View view, float f) {
        float d = mo4416d(view);
        int width = view.getWidth();
        int i = ((int) (((float) width) * f)) - ((int) (d * ((float) width)));
        if (!mo4399a(view, 3)) {
            i = -i;
        }
        view.offsetLeftAndRight(i);
        mo4408b(view, f);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof C1314g) || !super.checkLayoutParams(layoutParams)) {
            return false;
        }
        return f4039r;
    }

    public void computeScroll() {
        int childCount = getChildCount();
        float f = 0.0f;
        for (int i = 0; i < childCount; i++) {
            f = Math.max(f, ((C1314g) getChildAt(i).getLayoutParams()).f4084b);
        }
        this.f4075y = f;
        if (this.f4042A.mo4319a((boolean) f4039r) || this.f4043B.mo4319a((boolean) f4039r)) {
            C1040ar.m5924d(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public float mo4416d(View view) {
        return ((C1314g) view.getLayoutParams()).f4084b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo4417d() {
        if (!this.f4054M) {
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                getChildAt(i).dispatchTouchEvent(obtain);
            }
            obtain.recycle();
            this.f4054M = f4039r;
        }
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        int i;
        int height = getHeight();
        boolean f = mo4422f(view);
        int i2 = 0;
        int width = getWidth();
        int save = canvas.save();
        if (f) {
            int childCount = getChildCount();
            int i3 = 0;
            while (i3 < childCount) {
                View childAt = getChildAt(i3);
                if (childAt != view && childAt.getVisibility() == 0 && m7660m(childAt) && mo4424g(childAt)) {
                    if (childAt.getHeight() < height) {
                        i = width;
                    } else if (mo4399a(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right <= i2) {
                            right = i2;
                        }
                        i2 = right;
                        i = width;
                    } else {
                        i = childAt.getLeft();
                        if (i < width) {
                        }
                    }
                    i3++;
                    width = i;
                }
                i = width;
                i3++;
                width = i;
            }
            canvas.clipRect(i2, 0, width, getHeight());
        }
        int i4 = width;
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        if (this.f4075y > 0.0f && f) {
            this.f4076z.setColor((((int) (((float) ((this.f4074x & C1040ar.f3485s) >>> 24)) * this.f4075y)) << 24) | (this.f4074x & C1040ar.f3484r));
            canvas.drawRect((float) i2, 0.0f, (float) i4, (float) getHeight(), this.f4076z);
        } else if (this.f4060S != null && mo4399a(view, 3)) {
            int intrinsicWidth = this.f4060S.getIntrinsicWidth();
            int right2 = view.getRight();
            float max = Math.max(0.0f, Math.min(((float) right2) / ((float) this.f4042A.mo4326c()), f4040s));
            this.f4060S.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
            this.f4060S.setAlpha((int) (255.0f * max));
            this.f4060S.draw(canvas);
        } else if (this.f4061T != null && mo4399a(view, 5)) {
            int intrinsicWidth2 = this.f4061T.getIntrinsicWidth();
            int left = view.getLeft();
            float max2 = Math.max(0.0f, Math.min(((float) (getWidth() - left)) / ((float) this.f4043B.mo4326c()), f4040s));
            this.f4061T.setBounds(left - intrinsicWidth2, view.getTop(), left, view.getBottom());
            this.f4061T.setAlpha((int) (255.0f * max2));
            this.f4061T.draw(canvas);
        }
        return drawChild;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo4419e(View view) {
        return C1161h.m6976a(((C1314g) view.getLayoutParams()).f4083a, C1040ar.m5947k(this));
    }

    /* renamed from: e */
    public void mo4420e(int i) {
        mo4392a(i, (boolean) f4039r);
    }

    /* renamed from: f */
    public void mo4421f(int i) {
        mo4405b(i, (boolean) f4039r);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo4422f(View view) {
        if (((C1314g) view.getLayoutParams()).f4083a == 0) {
            return f4039r;
        }
        return false;
    }

    /* renamed from: g */
    public boolean mo4423g(int i) {
        View c = mo4411c(i);
        if (c != null) {
            return mo4433j(c);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo4424g(View view) {
        int a = C1161h.m6976a(((C1314g) view.getLayoutParams()).f4083a, C1040ar.m5947k(view));
        if ((a & 3) != 0) {
            return f4039r;
        }
        if ((a & 5) != 0) {
            return f4039r;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C1314g(-1, -1);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C1314g(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1314g ? new C1314g((C1314g) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C1314g((ViewGroup.MarginLayoutParams) layoutParams) : new C1314g(layoutParams);
    }

    public float getDrawerElevation() {
        if (f4041t) {
            return this.f4072v;
        }
        return 0.0f;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.f4059R;
    }

    /* renamed from: h */
    public void mo4430h(View view) {
        mo4396a(view, (boolean) f4039r);
    }

    /* renamed from: h */
    public boolean mo4431h(int i) {
        View c = mo4411c(i);
        if (c != null) {
            return mo4434k(c);
        }
        return false;
    }

    /* renamed from: i */
    public void mo4432i(View view) {
        mo4409b(view, (boolean) f4039r);
    }

    /* renamed from: j */
    public boolean mo4433j(View view) {
        if (!mo4424g(view)) {
            throw new IllegalArgumentException("View " + view + " is not a drawer");
        } else if ((((C1314g) view.getLayoutParams()).f4086d & 1) == 1) {
            return f4039r;
        } else {
            return false;
        }
    }

    /* renamed from: k */
    public boolean mo4434k(View view) {
        if (!mo4424g(view)) {
            throw new IllegalArgumentException("View " + view + " is not a drawer");
        } else if (((C1314g) view.getLayoutParams()).f4084b > 0.0f) {
            return f4039r;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f4048G = f4039r;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f4048G = f4039r;
    }

    public void onDraw(Canvas canvas) {
        int a;
        super.onDraw(canvas);
        if (this.f4065aa && this.f4059R != null && (a = f4031j.mo4456a(this.f4064W)) > 0) {
            this.f4059R.setBounds(0, 0, getWidth(), a);
            this.f4059R.draw(canvas);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003a, code lost:
        r0 = r7.f4042A.mo4333e((int) r0, (int) r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            r1 = 1
            r2 = 0
            int r0 = android.support.p010v4.view.C1200x.m7131a(r8)
            android.support.v4.widget.av r3 = r7.f4042A
            boolean r3 = r3.mo4316a((android.view.MotionEvent) r8)
            android.support.v4.widget.av r4 = r7.f4043B
            boolean r4 = r4.mo4316a((android.view.MotionEvent) r8)
            r3 = r3 | r4
            switch(r0) {
                case 0: goto L_0x0027;
                case 1: goto L_0x0065;
                case 2: goto L_0x0050;
                case 3: goto L_0x0065;
                default: goto L_0x0016;
            }
        L_0x0016:
            r0 = r2
        L_0x0017:
            if (r3 != 0) goto L_0x0025
            if (r0 != 0) goto L_0x0025
            boolean r0 = r7.m7657h()
            if (r0 != 0) goto L_0x0025
            boolean r0 = r7.f4054M
            if (r0 == 0) goto L_0x0026
        L_0x0025:
            r2 = r1
        L_0x0026:
            return r2
        L_0x0027:
            float r0 = r8.getX()
            float r4 = r8.getY()
            r7.f4057P = r0
            r7.f4058Q = r4
            float r5 = r7.f4075y
            r6 = 0
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L_0x006d
            android.support.v4.widget.av r5 = r7.f4042A
            int r0 = (int) r0
            int r4 = (int) r4
            android.view.View r0 = r5.mo4333e(r0, r4)
            if (r0 == 0) goto L_0x006d
            boolean r0 = r7.mo4422f((android.view.View) r0)
            if (r0 == 0) goto L_0x006d
            r0 = r1
        L_0x004b:
            r7.f4053L = r2
            r7.f4054M = r2
            goto L_0x0017
        L_0x0050:
            android.support.v4.widget.av r0 = r7.f4042A
            r4 = 3
            boolean r0 = r0.mo4330d(r4)
            if (r0 == 0) goto L_0x0016
            android.support.v4.widget.j$j r0 = r7.f4044C
            r0.mo4463a()
            android.support.v4.widget.j$j r0 = r7.f4045D
            r0.mo4463a()
            r0 = r2
            goto L_0x0017
        L_0x0065:
            r7.mo4398a((boolean) r1)
            r7.f4053L = r2
            r7.f4054M = r2
            goto L_0x0016
        L_0x006d:
            r0 = r2
            goto L_0x004b
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p010v4.widget.C1307j.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || !m7658i()) {
            return super.onKeyDown(i, keyEvent);
        }
        keyEvent.startTracking();
        return f4039r;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        View c = mo4410c();
        if (c != null && mo4386a(c) == 0) {
            mo4403b();
        }
        if (c != null) {
            return f4039r;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        float f;
        this.f4047F = f4039r;
        int i6 = i3 - i;
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                C1314g gVar = (C1314g) childAt.getLayoutParams();
                if (mo4422f(childAt)) {
                    childAt.layout(gVar.leftMargin, gVar.topMargin, gVar.leftMargin + childAt.getMeasuredWidth(), gVar.topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (mo4399a(childAt, 3)) {
                        i5 = ((int) (((float) measuredWidth) * gVar.f4084b)) + (-measuredWidth);
                        f = ((float) (measuredWidth + i5)) / ((float) measuredWidth);
                    } else {
                        i5 = i6 - ((int) (((float) measuredWidth) * gVar.f4084b));
                        f = ((float) (i6 - i5)) / ((float) measuredWidth);
                    }
                    boolean z2 = f != gVar.f4084b ? f4039r : false;
                    switch (gVar.f4083a & 112) {
                        case 16:
                            int i8 = i4 - i2;
                            int i9 = (i8 - measuredHeight) / 2;
                            if (i9 < gVar.topMargin) {
                                i9 = gVar.topMargin;
                            } else if (i9 + measuredHeight > i8 - gVar.bottomMargin) {
                                i9 = (i8 - gVar.bottomMargin) - measuredHeight;
                            }
                            childAt.layout(i5, i9, measuredWidth + i5, measuredHeight + i9);
                            break;
                        case 80:
                            int i10 = i4 - i2;
                            childAt.layout(i5, (i10 - gVar.bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i5, i10 - gVar.bottomMargin);
                            break;
                        default:
                            childAt.layout(i5, gVar.topMargin, measuredWidth + i5, measuredHeight + gVar.topMargin);
                            break;
                    }
                    if (z2) {
                        mo4408b(childAt, f);
                    }
                    int i11 = gVar.f4084b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i11) {
                        childAt.setVisibility(i11);
                    }
                }
            }
        }
        this.f4047F = false;
        this.f4048G = false;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0069  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r14, int r15) {
        /*
            r13 = this;
            int r2 = android.view.View.MeasureSpec.getMode(r14)
            int r3 = android.view.View.MeasureSpec.getMode(r15)
            int r1 = android.view.View.MeasureSpec.getSize(r14)
            int r0 = android.view.View.MeasureSpec.getSize(r15)
            r4 = 1073741824(0x40000000, float:2.0)
            if (r2 != r4) goto L_0x0018
            r4 = 1073741824(0x40000000, float:2.0)
            if (r3 == r4) goto L_0x0169
        L_0x0018:
            boolean r4 = r13.isInEditMode()
            if (r4 == 0) goto L_0x0061
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 != r4) goto L_0x0055
        L_0x0022:
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 != r2) goto L_0x005a
            r2 = r1
            r1 = r0
        L_0x0028:
            r13.setMeasuredDimension(r2, r1)
            java.lang.Object r0 = r13.f4064W
            if (r0 == 0) goto L_0x0069
            boolean r0 = android.support.p010v4.view.C1040ar.m5866P(r13)
            if (r0 == 0) goto L_0x0069
            r0 = 1
            r3 = r0
        L_0x0037:
            int r8 = android.support.p010v4.view.C1040ar.m5947k(r13)
            r5 = 0
            r4 = 0
            int r9 = r13.getChildCount()
            r0 = 0
            r7 = r0
        L_0x0043:
            if (r7 >= r9) goto L_0x0168
            android.view.View r10 = r13.getChildAt(r7)
            int r0 = r10.getVisibility()
            r6 = 8
            if (r0 != r6) goto L_0x006c
        L_0x0051:
            int r0 = r7 + 1
            r7 = r0
            goto L_0x0043
        L_0x0055:
            if (r2 != 0) goto L_0x0022
            r1 = 300(0x12c, float:4.2E-43)
            goto L_0x0022
        L_0x005a:
            if (r3 != 0) goto L_0x0169
            r0 = 300(0x12c, float:4.2E-43)
            r2 = r1
            r1 = r0
            goto L_0x0028
        L_0x0061:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "DrawerLayout must be measured with MeasureSpec.EXACTLY."
            r0.<init>(r1)
            throw r0
        L_0x0069:
            r0 = 0
            r3 = r0
            goto L_0x0037
        L_0x006c:
            android.view.ViewGroup$LayoutParams r0 = r10.getLayoutParams()
            android.support.v4.widget.j$g r0 = (android.support.p010v4.widget.C1307j.C1314g) r0
            if (r3 == 0) goto L_0x0087
            int r6 = r0.f4083a
            int r6 = android.support.p010v4.view.C1161h.m6976a(r6, r8)
            boolean r11 = android.support.p010v4.view.C1040ar.m5866P(r10)
            if (r11 == 0) goto L_0x00ac
            android.support.v4.widget.j$c r11 = f4031j
            java.lang.Object r12 = r13.f4064W
            r11.mo4459a((android.view.View) r10, (java.lang.Object) r12, (int) r6)
        L_0x0087:
            boolean r6 = r13.mo4422f((android.view.View) r10)
            if (r6 == 0) goto L_0x00b4
            int r6 = r0.leftMargin
            int r6 = r2 - r6
            int r11 = r0.rightMargin
            int r6 = r6 - r11
            r11 = 1073741824(0x40000000, float:2.0)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r11)
            int r11 = r0.topMargin
            int r11 = r1 - r11
            int r0 = r0.bottomMargin
            int r0 = r11 - r0
            r11 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r11)
            r10.measure(r6, r0)
            goto L_0x0051
        L_0x00ac:
            android.support.v4.widget.j$c r11 = f4031j
            java.lang.Object r12 = r13.f4064W
            r11.mo4460a((android.view.ViewGroup.MarginLayoutParams) r0, (java.lang.Object) r12, (int) r6)
            goto L_0x0087
        L_0x00b4:
            boolean r6 = r13.mo4424g((android.view.View) r10)
            if (r6 == 0) goto L_0x0139
            boolean r6 = f4041t
            if (r6 == 0) goto L_0x00cd
            float r6 = android.support.p010v4.view.C1040ar.m5861K(r10)
            float r11 = r13.f4072v
            int r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r6 == 0) goto L_0x00cd
            float r6 = r13.f4072v
            android.support.p010v4.view.C1040ar.m5952m(r10, r6)
        L_0x00cd:
            int r6 = r13.mo4419e((android.view.View) r10)
            r11 = r6 & 7
            r6 = 3
            if (r11 != r6) goto L_0x0114
            r6 = 1
        L_0x00d7:
            if (r6 == 0) goto L_0x00db
            if (r5 != 0) goto L_0x00df
        L_0x00db:
            if (r6 != 0) goto L_0x0116
            if (r4 == 0) goto L_0x0116
        L_0x00df:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Child drawer has absolute gravity "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = m7653d((int) r11)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " but this "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "DrawerLayout"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " already has a "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "drawer view along that edge"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0114:
            r6 = 0
            goto L_0x00d7
        L_0x0116:
            if (r6 == 0) goto L_0x0137
            r5 = 1
        L_0x0119:
            int r6 = r13.f4073w
            int r11 = r0.leftMargin
            int r6 = r6 + r11
            int r11 = r0.rightMargin
            int r6 = r6 + r11
            int r11 = r0.width
            int r6 = getChildMeasureSpec(r14, r6, r11)
            int r11 = r0.topMargin
            int r12 = r0.bottomMargin
            int r11 = r11 + r12
            int r0 = r0.height
            int r0 = getChildMeasureSpec(r15, r11, r0)
            r10.measure(r6, r0)
            goto L_0x0051
        L_0x0137:
            r4 = 1
            goto L_0x0119
        L_0x0139:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Child "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r10)
            java.lang.String r2 = " at index "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r7)
            java.lang.String r2 = " does not have a valid layout_gravity - must be Gravity.LEFT, "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "Gravity.RIGHT or Gravity.NO_GRAVITY"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0168:
            return
        L_0x0169:
            r2 = r1
            r1 = r0
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p010v4.widget.C1307j.onMeasure(int, int):void");
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        View c;
        if (!(parcelable instanceof C1315h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1315h hVar = (C1315h) parcelable;
        super.onRestoreInstanceState(hVar.mo3092a());
        if (!(hVar.f4087b == 0 || (c = mo4411c(hVar.f4087b)) == null)) {
            mo4430h(c);
        }
        if (hVar.f4088c != 3) {
            mo4404b(hVar.f4088c, 3);
        }
        if (hVar.f4089d != 3) {
            mo4404b(hVar.f4089d, 5);
        }
        if (hVar.f4090e != 3) {
            mo4404b(hVar.f4090e, (int) C1161h.f3608c);
        }
        if (hVar.f4091f != 3) {
            mo4404b(hVar.f4091f, (int) C1161h.f3609d);
        }
    }

    public void onRtlPropertiesChanged(int i) {
        m7654e();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C1314g gVar;
        C1315h hVar = new C1315h(super.onSaveInstanceState());
        int childCount = getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            }
            gVar = (C1314g) getChildAt(i).getLayoutParams();
            boolean z = gVar.f4086d == 1;
            boolean z2 = gVar.f4086d == 2;
            if (z || z2) {
                hVar.f4087b = gVar.f4083a;
            } else {
                i++;
            }
        }
        hVar.f4087b = gVar.f4083a;
        hVar.f4088c = this.f4049H;
        hVar.f4089d = this.f4050I;
        hVar.f4090e = this.f4051J;
        hVar.f4091f = this.f4052K;
        return hVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View a;
        this.f4042A.mo4321b(motionEvent);
        this.f4043B.mo4321b(motionEvent);
        switch (motionEvent.getAction() & 255) {
            case 0:
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                this.f4057P = x;
                this.f4058Q = y;
                this.f4053L = false;
                this.f4054M = false;
                break;
            case 1:
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                View e = this.f4042A.mo4333e((int) x2, (int) y2);
                if (e != null && mo4422f(e)) {
                    float f = x2 - this.f4057P;
                    float f2 = y2 - this.f4058Q;
                    int f3 = this.f4042A.mo4335f();
                    if ((f * f) + (f2 * f2) < ((float) (f3 * f3)) && (a = mo4387a()) != null) {
                        z = mo4386a(a) == 2;
                        mo4398a(z);
                        this.f4053L = false;
                        break;
                    }
                }
                z = true;
                mo4398a(z);
                this.f4053L = false;
            case 3:
                mo4398a((boolean) f4039r);
                this.f4053L = false;
                this.f4054M = false;
                break;
        }
        return f4039r;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        this.f4053L = z;
        if (z) {
            mo4398a((boolean) f4039r);
        }
    }

    public void requestLayout() {
        if (!this.f4047F) {
            super.requestLayout();
        }
    }

    public void setDrawerElevation(float f) {
        this.f4072v = f;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (mo4424g(childAt)) {
                C1040ar.m5952m(childAt, this.f4072v);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(C1313f fVar) {
        if (this.f4055N != null) {
            mo4406b(this.f4055N);
        }
        if (fVar != null) {
            mo4394a(fVar);
        }
        this.f4055N = fVar;
    }

    public void setDrawerLockMode(int i) {
        mo4404b(i, 3);
        mo4404b(i, 5);
    }

    public void setScrimColor(@C0032k int i) {
        this.f4074x = i;
        invalidate();
    }

    public void setStatusBarBackground(int i) {
        this.f4059R = i != 0 ? C0434d.m2370a(getContext(), i) : null;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.f4059R = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(@C0032k int i) {
        this.f4059R = new ColorDrawable(i);
        invalidate();
    }
}
