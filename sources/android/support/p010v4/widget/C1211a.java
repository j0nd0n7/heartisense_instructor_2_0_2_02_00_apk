package android.support.p010v4.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.support.p010v4.view.C1040ar;
import android.support.p010v4.view.C1200x;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

/* renamed from: android.support.v4.widget.a */
public abstract class C1211a implements View.OnTouchListener {

    /* renamed from: A */
    private static final int f3737A = 315;

    /* renamed from: B */
    private static final int f3738B = 1575;

    /* renamed from: C */
    private static final float f3739C = Float.MAX_VALUE;

    /* renamed from: D */
    private static final float f3740D = 0.2f;

    /* renamed from: E */
    private static final float f3741E = 1.0f;

    /* renamed from: F */
    private static final int f3742F = ViewConfiguration.getTapTimeout();

    /* renamed from: G */
    private static final int f3743G = 500;

    /* renamed from: H */
    private static final int f3744H = 500;

    /* renamed from: a */
    public static final float f3745a = 0.0f;

    /* renamed from: b */
    public static final float f3746b = Float.MAX_VALUE;

    /* renamed from: c */
    public static final float f3747c = 0.0f;

    /* renamed from: d */
    public static final int f3748d = 0;

    /* renamed from: e */
    public static final int f3749e = 1;

    /* renamed from: f */
    public static final int f3750f = 2;

    /* renamed from: l */
    private static final int f3751l = 0;

    /* renamed from: m */
    private static final int f3752m = 1;

    /* renamed from: z */
    private static final int f3753z = 1;

    /* renamed from: g */
    final C1212a f3754g = new C1212a();

    /* renamed from: h */
    final View f3755h;

    /* renamed from: i */
    boolean f3756i;

    /* renamed from: j */
    boolean f3757j;

    /* renamed from: k */
    boolean f3758k;

    /* renamed from: n */
    private final Interpolator f3759n = new AccelerateInterpolator();

    /* renamed from: o */
    private Runnable f3760o;

    /* renamed from: p */
    private float[] f3761p = {0.0f, 0.0f};

    /* renamed from: q */
    private float[] f3762q = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: r */
    private int f3763r;

    /* renamed from: s */
    private int f3764s;

    /* renamed from: t */
    private float[] f3765t = {0.0f, 0.0f};

    /* renamed from: u */
    private float[] f3766u = {0.0f, 0.0f};

    /* renamed from: v */
    private float[] f3767v = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: w */
    private boolean f3768w;

    /* renamed from: x */
    private boolean f3769x;

    /* renamed from: y */
    private boolean f3770y;

    /* renamed from: android.support.v4.widget.a$a */
    private static class C1212a {

        /* renamed from: a */
        private int f3771a;

        /* renamed from: b */
        private int f3772b;

        /* renamed from: c */
        private float f3773c;

        /* renamed from: d */
        private float f3774d;

        /* renamed from: e */
        private long f3775e = Long.MIN_VALUE;

        /* renamed from: f */
        private long f3776f = 0;

        /* renamed from: g */
        private int f3777g = 0;

        /* renamed from: h */
        private int f3778h = 0;

        /* renamed from: i */
        private long f3779i = -1;

        /* renamed from: j */
        private float f3780j;

        /* renamed from: k */
        private int f3781k;

        C1212a() {
        }

        /* renamed from: a */
        private float m7216a(float f) {
            return (-4.0f * f * f) + (4.0f * f);
        }

        /* renamed from: a */
        private float m7217a(long j) {
            if (j < this.f3775e) {
                return 0.0f;
            }
            if (this.f3779i < 0 || j < this.f3779i) {
                return C1211a.m7191a(((float) (j - this.f3775e)) / ((float) this.f3771a), 0.0f, (float) C1211a.f3741E) * 0.5f;
            }
            return (C1211a.m7191a(((float) (j - this.f3779i)) / ((float) this.f3781k), 0.0f, (float) C1211a.f3741E) * this.f3780j) + (C1211a.f3741E - this.f3780j);
        }

        /* renamed from: a */
        public void mo4102a() {
            this.f3775e = AnimationUtils.currentAnimationTimeMillis();
            this.f3779i = -1;
            this.f3776f = this.f3775e;
            this.f3780j = 0.5f;
            this.f3777g = 0;
            this.f3778h = 0;
        }

        /* renamed from: a */
        public void mo4103a(float f, float f2) {
            this.f3773c = f;
            this.f3774d = f2;
        }

        /* renamed from: a */
        public void mo4104a(int i) {
            this.f3771a = i;
        }

        /* renamed from: b */
        public void mo4105b() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f3781k = C1211a.m7194a((int) (currentAnimationTimeMillis - this.f3775e), 0, this.f3772b);
            this.f3780j = m7217a(currentAnimationTimeMillis);
            this.f3779i = currentAnimationTimeMillis;
        }

        /* renamed from: b */
        public void mo4106b(int i) {
            this.f3772b = i;
        }

        /* renamed from: c */
        public boolean mo4107c() {
            return this.f3779i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f3779i + ((long) this.f3781k);
        }

        /* renamed from: d */
        public void mo4108d() {
            if (this.f3776f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float a = m7216a(m7217a(currentAnimationTimeMillis));
            long j = currentAnimationTimeMillis - this.f3776f;
            this.f3776f = currentAnimationTimeMillis;
            this.f3777g = (int) (((float) j) * a * this.f3773c);
            this.f3778h = (int) (((float) j) * a * this.f3774d);
        }

        /* renamed from: e */
        public int mo4109e() {
            return (int) (this.f3773c / Math.abs(this.f3773c));
        }

        /* renamed from: f */
        public int mo4110f() {
            return (int) (this.f3774d / Math.abs(this.f3774d));
        }

        /* renamed from: g */
        public int mo4111g() {
            return this.f3777g;
        }

        /* renamed from: h */
        public int mo4112h() {
            return this.f3778h;
        }
    }

    /* renamed from: android.support.v4.widget.a$b */
    private class C1213b implements Runnable {
        C1213b() {
        }

        public void run() {
            if (C1211a.this.f3758k) {
                if (C1211a.this.f3756i) {
                    C1211a.this.f3756i = false;
                    C1211a.this.f3754g.mo4102a();
                }
                C1212a aVar = C1211a.this.f3754g;
                if (aVar.mo4107c() || !C1211a.this.mo4094c()) {
                    C1211a.this.f3758k = false;
                    return;
                }
                if (C1211a.this.f3757j) {
                    C1211a.this.f3757j = false;
                    C1211a.this.mo4097d();
                }
                aVar.mo4108d();
                C1211a.this.mo4086a(aVar.mo4111g(), aVar.mo4112h());
                C1040ar.m5895a(C1211a.this.f3755h, (Runnable) this);
            }
        }
    }

    public C1211a(View view) {
        this.f3755h = view;
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        int i = (int) ((1575.0f * displayMetrics.density) + 0.5f);
        int i2 = (int) ((displayMetrics.density * 315.0f) + 0.5f);
        mo4083a((float) i, (float) i);
        mo4088b((float) i2, (float) i2);
        mo4084a(1);
        mo4098e(Float.MAX_VALUE, Float.MAX_VALUE);
        mo4095d(f3740D, f3740D);
        mo4092c(f3741E, f3741E);
        mo4089b(f3742F);
        mo4093c(500);
        mo4096d(500);
    }

    /* renamed from: a */
    static float m7191a(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* renamed from: a */
    private float m7192a(float f, float f2, float f3, float f4) {
        float interpolation;
        float a = m7191a(f * f2, 0.0f, f3);
        float f5 = m7196f(f2 - f4, a) - m7196f(f4, a);
        if (f5 < 0.0f) {
            interpolation = -this.f3759n.getInterpolation(-f5);
        } else if (f5 <= 0.0f) {
            return 0.0f;
        } else {
            interpolation = this.f3759n.getInterpolation(f5);
        }
        return m7191a(interpolation, -1.0f, (float) f3741E);
    }

    /* renamed from: a */
    private float m7193a(int i, float f, float f2, float f3) {
        float a = m7192a(this.f3761p[i], f2, this.f3762q[i], f);
        if (a == 0.0f) {
            return 0.0f;
        }
        float f4 = this.f3765t[i];
        float f5 = this.f3766u[i];
        float f6 = this.f3767v[i];
        float f7 = f4 * f3;
        return a > 0.0f ? m7191a(a * f7, f5, f6) : -m7191a((-a) * f7, f5, f6);
    }

    /* renamed from: a */
    static int m7194a(int i, int i2, int i3) {
        return i > i3 ? i3 : i < i2 ? i2 : i;
    }

    /* renamed from: e */
    private void m7195e() {
        if (this.f3760o == null) {
            this.f3760o = new C1213b();
        }
        this.f3758k = true;
        this.f3756i = true;
        if (this.f3768w || this.f3764s <= 0) {
            this.f3760o.run();
        } else {
            C1040ar.m5896a(this.f3755h, this.f3760o, (long) this.f3764s);
        }
        this.f3768w = true;
    }

    /* renamed from: f */
    private float m7196f(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        switch (this.f3763r) {
            case 0:
            case 1:
                if (f >= f2) {
                    return 0.0f;
                }
                if (f >= 0.0f) {
                    return f3741E - (f / f2);
                }
                if (!this.f3758k || this.f3763r != 1) {
                    return 0.0f;
                }
                return f3741E;
            case 2:
                if (f < 0.0f) {
                    return f / (-f2);
                }
                return 0.0f;
            default:
                return 0.0f;
        }
    }

    /* renamed from: f */
    private void m7197f() {
        if (this.f3756i) {
            this.f3758k = false;
        } else {
            this.f3754g.mo4105b();
        }
    }

    /* renamed from: a */
    public C1211a mo4083a(float f, float f2) {
        this.f3767v[0] = f / 1000.0f;
        this.f3767v[1] = f2 / 1000.0f;
        return this;
    }

    /* renamed from: a */
    public C1211a mo4084a(int i) {
        this.f3763r = i;
        return this;
    }

    /* renamed from: a */
    public C1211a mo4085a(boolean z) {
        if (this.f3769x && !z) {
            m7197f();
        }
        this.f3769x = z;
        return this;
    }

    /* renamed from: a */
    public abstract void mo4086a(int i, int i2);

    /* renamed from: a */
    public boolean mo4087a() {
        return this.f3769x;
    }

    /* renamed from: b */
    public C1211a mo4088b(float f, float f2) {
        this.f3766u[0] = f / 1000.0f;
        this.f3766u[1] = f2 / 1000.0f;
        return this;
    }

    /* renamed from: b */
    public C1211a mo4089b(int i) {
        this.f3764s = i;
        return this;
    }

    /* renamed from: b */
    public C1211a mo4090b(boolean z) {
        this.f3770y = z;
        return this;
    }

    /* renamed from: b */
    public boolean mo4091b() {
        return this.f3770y;
    }

    /* renamed from: c */
    public C1211a mo4092c(float f, float f2) {
        this.f3765t[0] = f / 1000.0f;
        this.f3765t[1] = f2 / 1000.0f;
        return this;
    }

    /* renamed from: c */
    public C1211a mo4093c(int i) {
        this.f3754g.mo4104a(i);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo4094c() {
        C1212a aVar = this.f3754g;
        int f = aVar.mo4110f();
        int e = aVar.mo4109e();
        return (f != 0 && mo4100f(f)) || (e != 0 && mo4099e(e));
    }

    /* renamed from: d */
    public C1211a mo4095d(float f, float f2) {
        this.f3761p[0] = f;
        this.f3761p[1] = f2;
        return this;
    }

    /* renamed from: d */
    public C1211a mo4096d(int i) {
        this.f3754g.mo4106b(i);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo4097d() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f3755h.onTouchEvent(obtain);
        obtain.recycle();
    }

    /* renamed from: e */
    public C1211a mo4098e(float f, float f2) {
        this.f3762q[0] = f;
        this.f3762q[1] = f2;
        return this;
    }

    /* renamed from: e */
    public abstract boolean mo4099e(int i);

    /* renamed from: f */
    public abstract boolean mo4100f(int i);

    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z = true;
        if (!this.f3769x) {
            return false;
        }
        switch (C1200x.m7131a(motionEvent)) {
            case 0:
                this.f3757j = true;
                this.f3768w = false;
                break;
            case 1:
            case 3:
                m7197f();
                break;
            case 2:
                break;
        }
        this.f3754g.mo4103a(m7193a(0, motionEvent.getX(), (float) view.getWidth(), (float) this.f3755h.getWidth()), m7193a(1, motionEvent.getY(), (float) view.getHeight(), (float) this.f3755h.getHeight()));
        if (!this.f3758k && mo4094c()) {
            m7195e();
        }
        if (!this.f3770y || !this.f3758k) {
            z = false;
        }
        return z;
    }
}
