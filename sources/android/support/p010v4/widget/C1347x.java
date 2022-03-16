package android.support.p010v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.support.annotation.C0047z;
import android.support.p010v4.view.p035b.C1074b;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;

/* renamed from: android.support.v4.widget.x */
class C1347x extends Drawable implements Animatable {

    /* renamed from: A */
    private static final int f4123A = 6;

    /* renamed from: B */
    private static final float f4124B = 0.8f;

    /* renamed from: a */
    static final Interpolator f4125a = new C1074b();

    /* renamed from: b */
    static final int f4126b = 0;

    /* renamed from: c */
    static final int f4127c = 1;

    /* renamed from: f */
    private static final Interpolator f4128f = new LinearInterpolator();

    /* renamed from: g */
    private static final float f4129g = 1080.0f;

    /* renamed from: h */
    private static final int f4130h = 40;

    /* renamed from: i */
    private static final float f4131i = 8.75f;

    /* renamed from: j */
    private static final float f4132j = 2.5f;

    /* renamed from: k */
    private static final int f4133k = 56;

    /* renamed from: l */
    private static final float f4134l = 12.5f;

    /* renamed from: m */
    private static final float f4135m = 3.0f;

    /* renamed from: n */
    private static final int[] f4136n = {-16777216};

    /* renamed from: o */
    private static final float f4137o = 0.75f;

    /* renamed from: p */
    private static final float f4138p = 0.5f;

    /* renamed from: q */
    private static final float f4139q = 0.5f;

    /* renamed from: r */
    private static final int f4140r = 1332;

    /* renamed from: s */
    private static final float f4141s = 5.0f;

    /* renamed from: w */
    private static final int f4142w = 10;

    /* renamed from: x */
    private static final int f4143x = 5;

    /* renamed from: y */
    private static final float f4144y = 5.0f;

    /* renamed from: z */
    private static final int f4145z = 12;

    /* renamed from: C */
    private Resources f4146C;

    /* renamed from: D */
    private View f4147D;

    /* renamed from: E */
    private Animation f4148E;

    /* renamed from: F */
    private double f4149F;

    /* renamed from: G */
    private double f4150G;

    /* renamed from: H */
    private final Drawable.Callback f4151H = new Drawable.Callback() {
        public void invalidateDrawable(Drawable drawable) {
            C1347x.this.invalidateSelf();
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            C1347x.this.scheduleSelf(runnable, j);
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            C1347x.this.unscheduleSelf(runnable);
        }
    };

    /* renamed from: d */
    float f4152d;

    /* renamed from: e */
    boolean f4153e;

    /* renamed from: t */
    private final ArrayList<Animation> f4154t = new ArrayList<>();

    /* renamed from: u */
    private final C1352b f4155u;

    /* renamed from: v */
    private float f4156v;

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: android.support.v4.widget.x$a */
    public @interface C1351a {
    }

    /* renamed from: android.support.v4.widget.x$b */
    private static class C1352b {

        /* renamed from: a */
        private final RectF f4162a = new RectF();

        /* renamed from: b */
        private final Paint f4163b = new Paint();

        /* renamed from: c */
        private final Paint f4164c = new Paint();

        /* renamed from: d */
        private final Drawable.Callback f4165d;

        /* renamed from: e */
        private float f4166e = 0.0f;

        /* renamed from: f */
        private float f4167f = 0.0f;

        /* renamed from: g */
        private float f4168g = 0.0f;

        /* renamed from: h */
        private float f4169h = 5.0f;

        /* renamed from: i */
        private float f4170i = C1347x.f4132j;

        /* renamed from: j */
        private int[] f4171j;

        /* renamed from: k */
        private int f4172k;

        /* renamed from: l */
        private float f4173l;

        /* renamed from: m */
        private float f4174m;

        /* renamed from: n */
        private float f4175n;

        /* renamed from: o */
        private boolean f4176o;

        /* renamed from: p */
        private Path f4177p;

        /* renamed from: q */
        private float f4178q;

        /* renamed from: r */
        private double f4179r;

        /* renamed from: s */
        private int f4180s;

        /* renamed from: t */
        private int f4181t;

        /* renamed from: u */
        private int f4182u;

        /* renamed from: v */
        private final Paint f4183v = new Paint(1);

        /* renamed from: w */
        private int f4184w;

        /* renamed from: x */
        private int f4185x;

        C1352b(Drawable.Callback callback) {
            this.f4165d = callback;
            this.f4163b.setStrokeCap(Paint.Cap.SQUARE);
            this.f4163b.setAntiAlias(true);
            this.f4163b.setStyle(Paint.Style.STROKE);
            this.f4164c.setStyle(Paint.Style.FILL);
            this.f4164c.setAntiAlias(true);
        }

        /* renamed from: a */
        private void m7898a(Canvas canvas, float f, float f2, Rect rect) {
            if (this.f4176o) {
                if (this.f4177p == null) {
                    this.f4177p = new Path();
                    this.f4177p.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    this.f4177p.reset();
                }
                float f3 = ((float) (((int) this.f4170i) / 2)) * this.f4178q;
                float cos = (float) ((this.f4179r * Math.cos(0.0d)) + ((double) rect.exactCenterX()));
                this.f4177p.moveTo(0.0f, 0.0f);
                this.f4177p.lineTo(((float) this.f4180s) * this.f4178q, 0.0f);
                this.f4177p.lineTo((((float) this.f4180s) * this.f4178q) / 2.0f, ((float) this.f4181t) * this.f4178q);
                this.f4177p.offset(cos - f3, (float) ((this.f4179r * Math.sin(0.0d)) + ((double) rect.exactCenterY())));
                this.f4177p.close();
                this.f4164c.setColor(this.f4185x);
                canvas.rotate((f + f2) - 5.0f, rect.exactCenterX(), rect.exactCenterY());
                canvas.drawPath(this.f4177p, this.f4164c);
            }
        }

        /* renamed from: p */
        private int m7899p() {
            return (this.f4172k + 1) % this.f4171j.length;
        }

        /* renamed from: q */
        private void m7900q() {
            this.f4165d.invalidateDrawable((Drawable) null);
        }

        /* renamed from: a */
        public int mo4543a() {
            return this.f4171j[m7899p()];
        }

        /* renamed from: a */
        public void mo4544a(double d) {
            this.f4179r = d;
        }

        /* renamed from: a */
        public void mo4545a(float f) {
            this.f4169h = f;
            this.f4163b.setStrokeWidth(f);
            m7900q();
        }

        /* renamed from: a */
        public void mo4546a(float f, float f2) {
            this.f4180s = (int) f;
            this.f4181t = (int) f2;
        }

        /* renamed from: a */
        public void mo4547a(int i) {
            this.f4184w = i;
        }

        /* renamed from: a */
        public void mo4548a(int i, int i2) {
            float min = (float) Math.min(i, i2);
            this.f4170i = (this.f4179r <= 0.0d || min < 0.0f) ? (float) Math.ceil((double) (this.f4169h / 2.0f)) : (float) (((double) (min / 2.0f)) - this.f4179r);
        }

        /* renamed from: a */
        public void mo4549a(Canvas canvas, Rect rect) {
            RectF rectF = this.f4162a;
            rectF.set(rect);
            rectF.inset(this.f4170i, this.f4170i);
            float f = (this.f4166e + this.f4168g) * 360.0f;
            float f2 = ((this.f4167f + this.f4168g) * 360.0f) - f;
            this.f4163b.setColor(this.f4185x);
            canvas.drawArc(rectF, f, f2, false, this.f4163b);
            m7898a(canvas, f, f2, rect);
            if (this.f4182u < 255) {
                this.f4183v.setColor(this.f4184w);
                this.f4183v.setAlpha(255 - this.f4182u);
                canvas.drawCircle(rect.exactCenterX(), rect.exactCenterY(), (float) (rect.width() / 2), this.f4183v);
            }
        }

        /* renamed from: a */
        public void mo4550a(ColorFilter colorFilter) {
            this.f4163b.setColorFilter(colorFilter);
            m7900q();
        }

        /* renamed from: a */
        public void mo4551a(boolean z) {
            if (this.f4176o != z) {
                this.f4176o = z;
                m7900q();
            }
        }

        /* renamed from: a */
        public void mo4552a(@C0047z int[] iArr) {
            this.f4171j = iArr;
            mo4558c(0);
        }

        /* renamed from: b */
        public void mo4553b() {
            mo4558c(m7899p());
        }

        /* renamed from: b */
        public void mo4554b(float f) {
            this.f4166e = f;
            m7900q();
        }

        /* renamed from: b */
        public void mo4555b(int i) {
            this.f4185x = i;
        }

        /* renamed from: c */
        public int mo4556c() {
            return this.f4182u;
        }

        /* renamed from: c */
        public void mo4557c(float f) {
            this.f4167f = f;
            m7900q();
        }

        /* renamed from: c */
        public void mo4558c(int i) {
            this.f4172k = i;
            this.f4185x = this.f4171j[this.f4172k];
        }

        /* renamed from: d */
        public float mo4559d() {
            return this.f4169h;
        }

        /* renamed from: d */
        public void mo4560d(float f) {
            this.f4168g = f;
            m7900q();
        }

        /* renamed from: d */
        public void mo4561d(int i) {
            this.f4182u = i;
        }

        /* renamed from: e */
        public float mo4562e() {
            return this.f4166e;
        }

        /* renamed from: e */
        public void mo4563e(float f) {
            if (f != this.f4178q) {
                this.f4178q = f;
                m7900q();
            }
        }

        /* renamed from: f */
        public float mo4564f() {
            return this.f4173l;
        }

        /* renamed from: g */
        public float mo4565g() {
            return this.f4174m;
        }

        /* renamed from: h */
        public int mo4566h() {
            return this.f4171j[this.f4172k];
        }

        /* renamed from: i */
        public float mo4567i() {
            return this.f4167f;
        }

        /* renamed from: j */
        public float mo4568j() {
            return this.f4168g;
        }

        /* renamed from: k */
        public float mo4569k() {
            return this.f4170i;
        }

        /* renamed from: l */
        public double mo4570l() {
            return this.f4179r;
        }

        /* renamed from: m */
        public float mo4571m() {
            return this.f4175n;
        }

        /* renamed from: n */
        public void mo4572n() {
            this.f4173l = this.f4166e;
            this.f4174m = this.f4167f;
            this.f4175n = this.f4168g;
        }

        /* renamed from: o */
        public void mo4573o() {
            this.f4173l = 0.0f;
            this.f4174m = 0.0f;
            this.f4175n = 0.0f;
            mo4554b(0.0f);
            mo4557c(0.0f);
            mo4560d(0.0f);
        }
    }

    C1347x(Context context, View view) {
        this.f4147D = view;
        this.f4146C = context.getResources();
        this.f4155u = new C1352b(this.f4151H);
        this.f4155u.mo4552a(f4136n);
        mo4519a(1);
        m7886b();
    }

    /* renamed from: a */
    private float m7883a() {
        return this.f4156v;
    }

    /* renamed from: a */
    private int m7884a(float f, int i, int i2) {
        int intValue = Integer.valueOf(i).intValue();
        int i3 = (intValue >> 24) & 255;
        int i4 = (intValue >> 16) & 255;
        int i5 = (intValue >> 8) & 255;
        int i6 = intValue & 255;
        int intValue2 = Integer.valueOf(i2).intValue();
        return (i6 + ((int) (((float) ((intValue2 & 255) - i6)) * f))) | ((i3 + ((int) (((float) (((intValue2 >> 24) & 255) - i3)) * f))) << 24) | ((i4 + ((int) (((float) (((intValue2 >> 16) & 255) - i4)) * f))) << 16) | ((((int) (((float) (((intValue2 >> 8) & 255) - i5)) * f)) + i5) << 8);
    }

    /* renamed from: a */
    private void m7885a(double d, double d2, double d3, double d4, float f, float f2) {
        C1352b bVar = this.f4155u;
        float f3 = this.f4146C.getDisplayMetrics().density;
        this.f4149F = ((double) f3) * d;
        this.f4150G = ((double) f3) * d2;
        bVar.mo4545a(((float) d4) * f3);
        bVar.mo4544a(((double) f3) * d3);
        bVar.mo4558c(0);
        bVar.mo4546a(f * f3, f3 * f2);
        bVar.mo4548a((int) this.f4149F, (int) this.f4150G);
    }

    /* renamed from: b */
    private void m7886b() {
        final C1352b bVar = this.f4155u;
        C13481 r1 = new Animation() {
            public void applyTransformation(float f, Transformation transformation) {
                if (C1347x.this.f4153e) {
                    C1347x.this.mo4523b(f, bVar);
                    return;
                }
                float a = C1347x.this.mo4515a(bVar);
                float g = bVar.mo4565g();
                float f2 = bVar.mo4564f();
                float m = bVar.mo4571m();
                C1347x.this.mo4518a(f, bVar);
                if (f <= 0.5f) {
                    bVar.mo4554b(f2 + (C1347x.f4125a.getInterpolation(f / 0.5f) * (C1347x.f4124B - a)));
                }
                if (f > 0.5f) {
                    bVar.mo4557c(((C1347x.f4124B - a) * C1347x.f4125a.getInterpolation((f - 0.5f) / 0.5f)) + g);
                }
                bVar.mo4560d((0.25f * f) + m);
                C1347x.this.mo4525c((216.0f * f) + (C1347x.f4129g * (C1347x.this.f4152d / 5.0f)));
            }
        };
        r1.setRepeatCount(-1);
        r1.setRepeatMode(1);
        r1.setInterpolator(f4128f);
        r1.setAnimationListener(new Animation.AnimationListener() {
            public void onAnimationEnd(Animation animation) {
            }

            public void onAnimationRepeat(Animation animation) {
                bVar.mo4572n();
                bVar.mo4553b();
                bVar.mo4554b(bVar.mo4567i());
                if (C1347x.this.f4153e) {
                    C1347x.this.f4153e = false;
                    animation.setDuration(1332);
                    bVar.mo4551a(false);
                    return;
                }
                C1347x.this.f4152d = (C1347x.this.f4152d + 1.0f) % 5.0f;
            }

            public void onAnimationStart(Animation animation) {
                C1347x.this.f4152d = 0.0f;
            }
        });
        this.f4148E = r1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public float mo4515a(C1352b bVar) {
        return (float) Math.toRadians(((double) bVar.mo4559d()) / (6.283185307179586d * bVar.mo4570l()));
    }

    /* renamed from: a */
    public void mo4516a(float f) {
        this.f4155u.mo4563e(f);
    }

    /* renamed from: a */
    public void mo4517a(float f, float f2) {
        this.f4155u.mo4554b(f);
        this.f4155u.mo4557c(f2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4518a(float f, C1352b bVar) {
        if (f > f4137o) {
            bVar.mo4555b(m7884a((f - f4137o) / 0.25f, bVar.mo4566h(), bVar.mo4543a()));
        }
    }

    /* renamed from: a */
    public void mo4519a(int i) {
        if (i == 0) {
            m7885a(56.0d, 56.0d, 12.5d, 3.0d, 12.0f, 6.0f);
        } else {
            m7885a(40.0d, 40.0d, 8.75d, 2.5d, 10.0f, 5.0f);
        }
    }

    /* renamed from: a */
    public void mo4520a(boolean z) {
        this.f4155u.mo4551a(z);
    }

    /* renamed from: a */
    public void mo4521a(int... iArr) {
        this.f4155u.mo4552a(iArr);
        this.f4155u.mo4558c(0);
    }

    /* renamed from: b */
    public void mo4522b(float f) {
        this.f4155u.mo4560d(f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo4523b(float f, C1352b bVar) {
        mo4518a(f, bVar);
        float a = mo4515a(bVar);
        bVar.mo4554b((((bVar.mo4565g() - a) - bVar.mo4564f()) * f) + bVar.mo4564f());
        bVar.mo4557c(bVar.mo4565g());
        bVar.mo4560d(((((float) (Math.floor((double) (bVar.mo4571m() / f4124B)) + 1.0d)) - bVar.mo4571m()) * f) + bVar.mo4571m());
    }

    /* renamed from: b */
    public void mo4524b(int i) {
        this.f4155u.mo4547a(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo4525c(float f) {
        this.f4156v = f;
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int save = canvas.save();
        canvas.rotate(this.f4156v, bounds.exactCenterX(), bounds.exactCenterY());
        this.f4155u.mo4549a(canvas, bounds);
        canvas.restoreToCount(save);
    }

    public int getAlpha() {
        return this.f4155u.mo4556c();
    }

    public int getIntrinsicHeight() {
        return (int) this.f4150G;
    }

    public int getIntrinsicWidth() {
        return (int) this.f4149F;
    }

    public int getOpacity() {
        return -3;
    }

    public boolean isRunning() {
        ArrayList<Animation> arrayList = this.f4154t;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animation animation = arrayList.get(i);
            if (animation.hasStarted() && !animation.hasEnded()) {
                return true;
            }
        }
        return false;
    }

    public void setAlpha(int i) {
        this.f4155u.mo4561d(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f4155u.mo4550a(colorFilter);
    }

    public void start() {
        this.f4148E.reset();
        this.f4155u.mo4572n();
        if (this.f4155u.mo4567i() != this.f4155u.mo4562e()) {
            this.f4153e = true;
            this.f4148E.setDuration(666);
            this.f4147D.startAnimation(this.f4148E);
            return;
        }
        this.f4155u.mo4558c(0);
        this.f4155u.mo4573o();
        this.f4148E.setDuration(1332);
        this.f4147D.startAnimation(this.f4148E);
    }

    public void stop() {
        this.f4147D.clearAnimation();
        mo4525c(0.0f);
        this.f4155u.mo4551a(false);
        this.f4155u.mo4558c(0);
        this.f4155u.mo4573o();
    }
}
