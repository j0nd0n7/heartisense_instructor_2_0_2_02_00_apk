package android.support.p010v4.widget;

import android.content.Context;
import android.support.p010v4.view.C1035ap;
import android.support.p010v4.view.C1040ar;
import android.support.p010v4.view.C1200x;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import java.util.Arrays;

/* renamed from: android.support.v4.widget.av */
public class C1285av {

    /* renamed from: L */
    private static final Interpolator f3943L = new Interpolator() {
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };

    /* renamed from: a */
    public static final int f3944a = -1;

    /* renamed from: b */
    public static final int f3945b = 0;

    /* renamed from: c */
    public static final int f3946c = 1;

    /* renamed from: d */
    public static final int f3947d = 2;

    /* renamed from: e */
    public static final int f3948e = 1;

    /* renamed from: f */
    public static final int f3949f = 2;

    /* renamed from: g */
    public static final int f3950g = 4;

    /* renamed from: h */
    public static final int f3951h = 8;

    /* renamed from: i */
    public static final int f3952i = 15;

    /* renamed from: j */
    public static final int f3953j = 1;

    /* renamed from: k */
    public static final int f3954k = 2;

    /* renamed from: l */
    public static final int f3955l = 3;

    /* renamed from: m */
    private static final String f3956m = "ViewDragHelper";

    /* renamed from: n */
    private static final int f3957n = 20;

    /* renamed from: o */
    private static final int f3958o = 256;

    /* renamed from: p */
    private static final int f3959p = 600;

    /* renamed from: A */
    private int f3960A;

    /* renamed from: B */
    private VelocityTracker f3961B;

    /* renamed from: C */
    private float f3962C;

    /* renamed from: D */
    private float f3963D;

    /* renamed from: E */
    private int f3964E;

    /* renamed from: F */
    private int f3965F;

    /* renamed from: G */
    private C1224af f3966G;

    /* renamed from: H */
    private final C1288a f3967H;

    /* renamed from: I */
    private View f3968I;

    /* renamed from: J */
    private boolean f3969J;

    /* renamed from: K */
    private final ViewGroup f3970K;

    /* renamed from: M */
    private final Runnable f3971M = new Runnable() {
        public void run() {
            C1285av.this.mo4327c(0);
        }
    };

    /* renamed from: q */
    private int f3972q;

    /* renamed from: r */
    private int f3973r;

    /* renamed from: s */
    private int f3974s = -1;

    /* renamed from: t */
    private float[] f3975t;

    /* renamed from: u */
    private float[] f3976u;

    /* renamed from: v */
    private float[] f3977v;

    /* renamed from: w */
    private float[] f3978w;

    /* renamed from: x */
    private int[] f3979x;

    /* renamed from: y */
    private int[] f3980y;

    /* renamed from: z */
    private int[] f3981z;

    /* renamed from: android.support.v4.widget.av$a */
    public static abstract class C1288a {
        /* renamed from: a */
        public int mo4232a(View view) {
            return 0;
        }

        /* renamed from: a */
        public int mo4233a(View view, int i, int i2) {
            return 0;
        }

        /* renamed from: a */
        public void mo4234a(int i) {
        }

        /* renamed from: a */
        public void mo4340a(int i, int i2) {
        }

        /* renamed from: a */
        public void mo4235a(View view, float f, float f2) {
        }

        /* renamed from: a */
        public void mo4236a(View view, int i, int i2, int i3, int i4) {
        }

        /* renamed from: a */
        public abstract boolean mo4237a(View view, int i);

        /* renamed from: b */
        public int mo4341b(View view) {
            return 0;
        }

        /* renamed from: b */
        public int mo4238b(View view, int i, int i2) {
            return 0;
        }

        /* renamed from: b */
        public void mo4239b(int i, int i2) {
        }

        /* renamed from: b */
        public void mo4240b(View view, int i) {
        }

        /* renamed from: b */
        public boolean mo4342b(int i) {
            return false;
        }

        /* renamed from: c */
        public int mo4343c(int i) {
            return i;
        }
    }

    private C1285av(Context context, ViewGroup viewGroup, C1288a aVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        } else if (aVar == null) {
            throw new IllegalArgumentException("Callback may not be null");
        } else {
            this.f3970K = viewGroup;
            this.f3967H = aVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.f3964E = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f3973r = viewConfiguration.getScaledTouchSlop();
            this.f3962C = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.f3963D = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.f3966G = C1224af.m7263a(context, f3943L);
        }
    }

    /* renamed from: a */
    private float m7535a(float f, float f2, float f3) {
        float abs = Math.abs(f);
        if (abs < f2) {
            return 0.0f;
        }
        return abs > f3 ? f <= 0.0f ? -f3 : f3 : f;
    }

    /* renamed from: a */
    private int m7536a(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        int width = this.f3970K.getWidth();
        int i4 = width / 2;
        float b = (m7544b(Math.min(1.0f, ((float) Math.abs(i)) / ((float) width))) * ((float) i4)) + ((float) i4);
        int abs = Math.abs(i2);
        return Math.min(abs > 0 ? Math.round(Math.abs(b / ((float) abs)) * 1000.0f) * 4 : (int) (((((float) Math.abs(i)) / ((float) i3)) + 1.0f) * 256.0f), f3959p);
    }

    /* renamed from: a */
    private int m7537a(View view, int i, int i2, int i3, int i4) {
        int b = m7545b(i3, (int) this.f3963D, (int) this.f3962C);
        int b2 = m7545b(i4, (int) this.f3963D, (int) this.f3962C);
        int abs = Math.abs(i);
        int abs2 = Math.abs(i2);
        int abs3 = Math.abs(b);
        int abs4 = Math.abs(b2);
        int i5 = abs3 + abs4;
        int i6 = abs + abs2;
        return (int) (((b2 != 0 ? ((float) abs4) / ((float) i5) : ((float) abs2) / ((float) i6)) * ((float) m7536a(i2, b2, this.f3967H.mo4341b(view)))) + ((b != 0 ? ((float) abs3) / ((float) i5) : ((float) abs) / ((float) i6)) * ((float) m7536a(i, b, this.f3967H.mo4232a(view)))));
    }

    /* renamed from: a */
    public static C1285av m7538a(ViewGroup viewGroup, float f, C1288a aVar) {
        C1285av a = m7539a(viewGroup, aVar);
        a.f3973r = (int) (((float) a.f3973r) * (1.0f / f));
        return a;
    }

    /* renamed from: a */
    public static C1285av m7539a(ViewGroup viewGroup, C1288a aVar) {
        return new C1285av(viewGroup.getContext(), viewGroup, aVar);
    }

    /* renamed from: a */
    private void m7540a(float f, float f2) {
        this.f3969J = true;
        this.f3967H.mo4235a(this.f3968I, f, f2);
        this.f3969J = false;
        if (this.f3972q == 1) {
            mo4327c(0);
        }
    }

    /* renamed from: a */
    private void m7541a(float f, float f2, int i) {
        m7552g(i);
        float[] fArr = this.f3975t;
        this.f3977v[i] = f;
        fArr[i] = f;
        float[] fArr2 = this.f3976u;
        this.f3978w[i] = f2;
        fArr2[i] = f2;
        this.f3979x[i] = m7550f((int) f, (int) f2);
        this.f3960A |= 1 << i;
    }

    /* renamed from: a */
    private boolean m7542a(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if ((this.f3979x[i] & i2) != i2 || (this.f3965F & i2) == 0 || (this.f3981z[i] & i2) == i2 || (this.f3980y[i] & i2) == i2) {
            return false;
        }
        if (abs <= ((float) this.f3973r) && abs2 <= ((float) this.f3973r)) {
            return false;
        }
        if (abs >= abs2 * 0.5f || !this.f3967H.mo4342b(i2)) {
            return (this.f3980y[i] & i2) == 0 && abs > ((float) this.f3973r);
        }
        int[] iArr = this.f3981z;
        iArr[i] = iArr[i] | i2;
        return false;
    }

    /* renamed from: a */
    private boolean m7543a(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        boolean z = this.f3967H.mo4232a(view) > 0;
        boolean z2 = this.f3967H.mo4341b(view) > 0;
        if (z && z2) {
            return (f * f) + (f2 * f2) > ((float) (this.f3973r * this.f3973r));
        }
        if (z) {
            return Math.abs(f) > ((float) this.f3973r);
        }
        if (z2) {
            return Math.abs(f2) > ((float) this.f3973r);
        }
        return false;
    }

    /* renamed from: b */
    private float m7544b(float f) {
        return (float) Math.sin((double) ((float) (((double) (f - 0.5f)) * 0.4712389167638204d)));
    }

    /* renamed from: b */
    private int m7545b(int i, int i2, int i3) {
        int abs = Math.abs(i);
        if (abs < i2) {
            return 0;
        }
        return abs > i3 ? i <= 0 ? -i3 : i3 : i;
    }

    /* renamed from: b */
    private void m7546b(float f, float f2, int i) {
        int i2 = 1;
        if (!m7542a(f, f2, i, 1)) {
            i2 = 0;
        }
        if (m7542a(f2, f, i, 4)) {
            i2 |= 4;
        }
        if (m7542a(f, f2, i, 2)) {
            i2 |= 2;
        }
        if (m7542a(f2, f, i, 8)) {
            i2 |= 8;
        }
        if (i2 != 0) {
            int[] iArr = this.f3980y;
            iArr[i] = iArr[i] | i2;
            this.f3967H.mo4239b(i2, i);
        }
    }

    /* renamed from: b */
    private boolean m7547b(int i, int i2, int i3, int i4) {
        int left = this.f3968I.getLeft();
        int top = this.f3968I.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.f3966G.mo4137h();
            mo4327c(0);
            return false;
        }
        this.f3966G.mo4125a(left, top, i5, i6, m7537a(this.f3968I, i5, i6, i3, i4));
        mo4327c(2);
        return true;
    }

    /* renamed from: c */
    private void m7548c(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int left = this.f3968I.getLeft();
        int top = this.f3968I.getTop();
        if (i3 != 0) {
            i5 = this.f3967H.mo4233a(this.f3968I, i, i3);
            C1040ar.m5946j(this.f3968I, i5 - left);
        } else {
            i5 = i;
        }
        if (i4 != 0) {
            i6 = this.f3967H.mo4238b(this.f3968I, i2, i4);
            C1040ar.m5943i(this.f3968I, i6 - top);
        } else {
            i6 = i2;
        }
        if (i3 != 0 || i4 != 0) {
            this.f3967H.mo4236a(this.f3968I, i5, i6, i5 - left, i6 - top);
        }
    }

    /* renamed from: c */
    private void m7549c(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (m7553h(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f3977v[pointerId] = x;
                this.f3978w[pointerId] = y;
            }
        }
    }

    /* renamed from: f */
    private int m7550f(int i, int i2) {
        int i3 = 0;
        if (i < this.f3970K.getLeft() + this.f3964E) {
            i3 = 1;
        }
        if (i2 < this.f3970K.getTop() + this.f3964E) {
            i3 |= 4;
        }
        if (i > this.f3970K.getRight() - this.f3964E) {
            i3 |= 2;
        }
        return i2 > this.f3970K.getBottom() - this.f3964E ? i3 | 8 : i3;
    }

    /* renamed from: f */
    private void m7551f(int i) {
        if (this.f3975t != null && mo4322b(i)) {
            this.f3975t[i] = 0.0f;
            this.f3976u[i] = 0.0f;
            this.f3977v[i] = 0.0f;
            this.f3978w[i] = 0.0f;
            this.f3979x[i] = 0;
            this.f3980y[i] = 0;
            this.f3981z[i] = 0;
            this.f3960A &= (1 << i) ^ -1;
        }
    }

    /* renamed from: g */
    private void m7552g(int i) {
        if (this.f3975t == null || this.f3975t.length <= i) {
            float[] fArr = new float[(i + 1)];
            float[] fArr2 = new float[(i + 1)];
            float[] fArr3 = new float[(i + 1)];
            float[] fArr4 = new float[(i + 1)];
            int[] iArr = new int[(i + 1)];
            int[] iArr2 = new int[(i + 1)];
            int[] iArr3 = new int[(i + 1)];
            if (this.f3975t != null) {
                System.arraycopy(this.f3975t, 0, fArr, 0, this.f3975t.length);
                System.arraycopy(this.f3976u, 0, fArr2, 0, this.f3976u.length);
                System.arraycopy(this.f3977v, 0, fArr3, 0, this.f3977v.length);
                System.arraycopy(this.f3978w, 0, fArr4, 0, this.f3978w.length);
                System.arraycopy(this.f3979x, 0, iArr, 0, this.f3979x.length);
                System.arraycopy(this.f3980y, 0, iArr2, 0, this.f3980y.length);
                System.arraycopy(this.f3981z, 0, iArr3, 0, this.f3981z.length);
            }
            this.f3975t = fArr;
            this.f3976u = fArr2;
            this.f3977v = fArr3;
            this.f3978w = fArr4;
            this.f3979x = iArr;
            this.f3980y = iArr2;
            this.f3981z = iArr3;
        }
    }

    /* renamed from: h */
    private boolean m7553h(int i) {
        if (mo4322b(i)) {
            return true;
        }
        Log.e(f3956m, "Ignoring pointerId=" + i + " because ACTION_DOWN was not received " + "for this pointer before ACTION_MOVE. It likely happened because " + " ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    /* renamed from: i */
    private void m7554i() {
        if (this.f3975t != null) {
            Arrays.fill(this.f3975t, 0.0f);
            Arrays.fill(this.f3976u, 0.0f);
            Arrays.fill(this.f3977v, 0.0f);
            Arrays.fill(this.f3978w, 0.0f);
            Arrays.fill(this.f3979x, 0);
            Arrays.fill(this.f3980y, 0);
            Arrays.fill(this.f3981z, 0);
            this.f3960A = 0;
        }
    }

    /* renamed from: j */
    private void m7555j() {
        this.f3961B.computeCurrentVelocity(1000, this.f3962C);
        m7540a(m7535a(C1035ap.m5841a(this.f3961B, this.f3974s), this.f3963D, this.f3962C), m7535a(C1035ap.m5842b(this.f3961B, this.f3974s), this.f3963D, this.f3962C));
    }

    /* renamed from: a */
    public float mo4310a() {
        return this.f3963D;
    }

    /* renamed from: a */
    public void mo4311a(float f) {
        this.f3963D = f;
    }

    /* renamed from: a */
    public void mo4312a(int i) {
        this.f3965F = i;
    }

    /* renamed from: a */
    public void mo4313a(int i, int i2, int i3, int i4) {
        if (!this.f3969J) {
            throw new IllegalStateException("Cannot flingCapturedView outside of a call to Callback#onViewReleased");
        }
        this.f3966G.mo4126a(this.f3968I.getLeft(), this.f3968I.getTop(), (int) C1035ap.m5841a(this.f3961B, this.f3974s), (int) C1035ap.m5842b(this.f3961B, this.f3974s), i, i3, i2, i4);
        mo4327c(2);
    }

    /* renamed from: a */
    public void mo4314a(View view, int i) {
        if (view.getParent() != this.f3970K) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f3970K + ")");
        }
        this.f3968I = view;
        this.f3974s = i;
        this.f3967H.mo4240b(view, i);
        mo4327c(1);
    }

    /* renamed from: a */
    public boolean mo4315a(int i, int i2) {
        if (this.f3969J) {
            return m7547b(i, i2, (int) C1035ap.m5841a(this.f3961B, this.f3974s), (int) C1035ap.m5842b(this.f3961B, this.f3974s));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ff, code lost:
        if (r8 != r7) goto L_0x010e;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo4316a(android.view.MotionEvent r14) {
        /*
            r13 = this;
            int r0 = android.support.p010v4.view.C1200x.m7131a(r14)
            int r1 = android.support.p010v4.view.C1200x.m7133b(r14)
            if (r0 != 0) goto L_0x000d
            r13.mo4336g()
        L_0x000d:
            android.view.VelocityTracker r2 = r13.f3961B
            if (r2 != 0) goto L_0x0017
            android.view.VelocityTracker r2 = android.view.VelocityTracker.obtain()
            r13.f3961B = r2
        L_0x0017:
            android.view.VelocityTracker r2 = r13.f3961B
            r2.addMovement(r14)
            switch(r0) {
                case 0: goto L_0x0026;
                case 1: goto L_0x0128;
                case 2: goto L_0x0092;
                case 3: goto L_0x0128;
                case 4: goto L_0x001f;
                case 5: goto L_0x005a;
                case 6: goto L_0x011f;
                default: goto L_0x001f;
            }
        L_0x001f:
            int r0 = r13.f3972q
            r1 = 1
            if (r0 != r1) goto L_0x012d
            r0 = 1
        L_0x0025:
            return r0
        L_0x0026:
            float r0 = r14.getX()
            float r1 = r14.getY()
            r2 = 0
            int r2 = r14.getPointerId(r2)
            r13.m7541a((float) r0, (float) r1, (int) r2)
            int r0 = (int) r0
            int r1 = (int) r1
            android.view.View r0 = r13.mo4333e(r0, r1)
            android.view.View r1 = r13.f3968I
            if (r0 != r1) goto L_0x0048
            int r1 = r13.f3972q
            r3 = 2
            if (r1 != r3) goto L_0x0048
            r13.mo4324b((android.view.View) r0, (int) r2)
        L_0x0048:
            int[] r0 = r13.f3979x
            r0 = r0[r2]
            int r1 = r13.f3965F
            r1 = r1 & r0
            if (r1 == 0) goto L_0x001f
            android.support.v4.widget.av$a r1 = r13.f3967H
            int r3 = r13.f3965F
            r0 = r0 & r3
            r1.mo4340a((int) r0, (int) r2)
            goto L_0x001f
        L_0x005a:
            int r0 = r14.getPointerId(r1)
            float r2 = r14.getX(r1)
            float r1 = r14.getY(r1)
            r13.m7541a((float) r2, (float) r1, (int) r0)
            int r3 = r13.f3972q
            if (r3 != 0) goto L_0x007f
            int[] r1 = r13.f3979x
            r1 = r1[r0]
            int r2 = r13.f3965F
            r2 = r2 & r1
            if (r2 == 0) goto L_0x001f
            android.support.v4.widget.av$a r2 = r13.f3967H
            int r3 = r13.f3965F
            r1 = r1 & r3
            r2.mo4340a((int) r1, (int) r0)
            goto L_0x001f
        L_0x007f:
            int r3 = r13.f3972q
            r4 = 2
            if (r3 != r4) goto L_0x001f
            int r2 = (int) r2
            int r1 = (int) r1
            android.view.View r1 = r13.mo4333e(r2, r1)
            android.view.View r2 = r13.f3968I
            if (r1 != r2) goto L_0x001f
            r13.mo4324b((android.view.View) r1, (int) r0)
            goto L_0x001f
        L_0x0092:
            float[] r0 = r13.f3975t
            if (r0 == 0) goto L_0x001f
            float[] r0 = r13.f3976u
            if (r0 == 0) goto L_0x001f
            int r2 = r14.getPointerCount()
            r0 = 0
            r1 = r0
        L_0x00a0:
            if (r1 >= r2) goto L_0x0107
            int r3 = r14.getPointerId(r1)
            boolean r0 = r13.m7553h(r3)
            if (r0 != 0) goto L_0x00b0
        L_0x00ac:
            int r0 = r1 + 1
            r1 = r0
            goto L_0x00a0
        L_0x00b0:
            float r0 = r14.getX(r1)
            float r4 = r14.getY(r1)
            float[] r5 = r13.f3975t
            r5 = r5[r3]
            float r5 = r0 - r5
            float[] r6 = r13.f3976u
            r6 = r6[r3]
            float r6 = r4 - r6
            int r0 = (int) r0
            int r4 = (int) r4
            android.view.View r4 = r13.mo4333e(r0, r4)
            if (r4 == 0) goto L_0x010c
            boolean r0 = r13.m7543a((android.view.View) r4, (float) r5, (float) r6)
            if (r0 == 0) goto L_0x010c
            r0 = 1
        L_0x00d3:
            if (r0 == 0) goto L_0x010e
            int r7 = r4.getLeft()
            int r8 = (int) r5
            int r8 = r8 + r7
            android.support.v4.widget.av$a r9 = r13.f3967H
            int r10 = (int) r5
            int r8 = r9.mo4233a((android.view.View) r4, (int) r8, (int) r10)
            int r9 = r4.getTop()
            int r10 = (int) r6
            int r10 = r10 + r9
            android.support.v4.widget.av$a r11 = r13.f3967H
            int r12 = (int) r6
            int r10 = r11.mo4238b(r4, r10, r12)
            android.support.v4.widget.av$a r11 = r13.f3967H
            int r11 = r11.mo4232a((android.view.View) r4)
            android.support.v4.widget.av$a r12 = r13.f3967H
            int r12 = r12.mo4341b((android.view.View) r4)
            if (r11 == 0) goto L_0x0101
            if (r11 <= 0) goto L_0x010e
            if (r8 != r7) goto L_0x010e
        L_0x0101:
            if (r12 == 0) goto L_0x0107
            if (r12 <= 0) goto L_0x010e
            if (r10 != r9) goto L_0x010e
        L_0x0107:
            r13.m7549c((android.view.MotionEvent) r14)
            goto L_0x001f
        L_0x010c:
            r0 = 0
            goto L_0x00d3
        L_0x010e:
            r13.m7546b((float) r5, (float) r6, (int) r3)
            int r5 = r13.f3972q
            r6 = 1
            if (r5 == r6) goto L_0x0107
            if (r0 == 0) goto L_0x00ac
            boolean r0 = r13.mo4324b((android.view.View) r4, (int) r3)
            if (r0 == 0) goto L_0x00ac
            goto L_0x0107
        L_0x011f:
            int r0 = r14.getPointerId(r1)
            r13.m7551f(r0)
            goto L_0x001f
        L_0x0128:
            r13.mo4336g()
            goto L_0x001f
        L_0x012d:
            r0 = 0
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p010v4.widget.C1285av.mo4316a(android.view.MotionEvent):boolean");
    }

    /* renamed from: a */
    public boolean mo4317a(View view, int i, int i2) {
        this.f3968I = view;
        this.f3974s = -1;
        boolean b = m7547b(i, i2, 0, 0);
        if (!b && this.f3972q == 0 && this.f3968I != null) {
            this.f3968I = null;
        }
        return b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo4318a(View view, boolean z, int i, int i2, int i3, int i4) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (i3 + scrollX >= childAt.getLeft() && i3 + scrollX < childAt.getRight() && i4 + scrollY >= childAt.getTop() && i4 + scrollY < childAt.getBottom()) {
                    if (mo4318a(childAt, true, i, i2, (i3 + scrollX) - childAt.getLeft(), (i4 + scrollY) - childAt.getTop())) {
                        return true;
                    }
                }
            }
        }
        return z && (C1040ar.m5902a(view, -i) || C1040ar.m5919b(view, -i2));
    }

    /* renamed from: a */
    public boolean mo4319a(boolean z) {
        boolean z2;
        if (this.f3972q == 2) {
            boolean g = this.f3966G.mo4136g();
            int b = this.f3966G.mo4130b();
            int c = this.f3966G.mo4132c();
            int left = b - this.f3968I.getLeft();
            int top = c - this.f3968I.getTop();
            if (left != 0) {
                C1040ar.m5946j(this.f3968I, left);
            }
            if (top != 0) {
                C1040ar.m5943i(this.f3968I, top);
            }
            if (!(left == 0 && top == 0)) {
                this.f3967H.mo4236a(this.f3968I, b, c, left, top);
            }
            if (g && b == this.f3966G.mo4133d() && c == this.f3966G.mo4134e()) {
                this.f3966G.mo4137h();
                z2 = false;
            } else {
                z2 = g;
            }
            if (!z2) {
                if (z) {
                    this.f3970K.post(this.f3971M);
                } else {
                    mo4327c(0);
                }
            }
        }
        return this.f3972q == 2;
    }

    /* renamed from: b */
    public int mo4320b() {
        return this.f3972q;
    }

    /* renamed from: b */
    public void mo4321b(MotionEvent motionEvent) {
        int i;
        int i2 = 0;
        int a = C1200x.m7131a(motionEvent);
        int b = C1200x.m7133b(motionEvent);
        if (a == 0) {
            mo4336g();
        }
        if (this.f3961B == null) {
            this.f3961B = VelocityTracker.obtain();
        }
        this.f3961B.addMovement(motionEvent);
        switch (a) {
            case 0:
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                int pointerId = motionEvent.getPointerId(0);
                View e = mo4333e((int) x, (int) y);
                m7541a(x, y, pointerId);
                mo4324b(e, pointerId);
                int i3 = this.f3979x[pointerId];
                if ((this.f3965F & i3) != 0) {
                    this.f3967H.mo4340a(i3 & this.f3965F, pointerId);
                    return;
                }
                return;
            case 1:
                if (this.f3972q == 1) {
                    m7555j();
                }
                mo4336g();
                return;
            case 2:
                if (this.f3972q != 1) {
                    int pointerCount = motionEvent.getPointerCount();
                    while (i2 < pointerCount) {
                        int pointerId2 = motionEvent.getPointerId(i2);
                        if (m7553h(pointerId2)) {
                            float x2 = motionEvent.getX(i2);
                            float y2 = motionEvent.getY(i2);
                            float f = x2 - this.f3975t[pointerId2];
                            float f2 = y2 - this.f3976u[pointerId2];
                            m7546b(f, f2, pointerId2);
                            if (this.f3972q != 1) {
                                View e2 = mo4333e((int) x2, (int) y2);
                                if (m7543a(e2, f, f2) && mo4324b(e2, pointerId2)) {
                                }
                            }
                            m7549c(motionEvent);
                            return;
                        }
                        i2++;
                    }
                    m7549c(motionEvent);
                    return;
                } else if (m7553h(this.f3974s)) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f3974s);
                    float x3 = motionEvent.getX(findPointerIndex);
                    float y3 = motionEvent.getY(findPointerIndex);
                    int i4 = (int) (x3 - this.f3977v[this.f3974s]);
                    int i5 = (int) (y3 - this.f3978w[this.f3974s]);
                    m7548c(this.f3968I.getLeft() + i4, this.f3968I.getTop() + i5, i4, i5);
                    m7549c(motionEvent);
                    return;
                } else {
                    return;
                }
            case 3:
                if (this.f3972q == 1) {
                    m7540a(0.0f, 0.0f);
                }
                mo4336g();
                return;
            case 5:
                int pointerId3 = motionEvent.getPointerId(b);
                float x4 = motionEvent.getX(b);
                float y4 = motionEvent.getY(b);
                m7541a(x4, y4, pointerId3);
                if (this.f3972q == 0) {
                    mo4324b(mo4333e((int) x4, (int) y4), pointerId3);
                    int i6 = this.f3979x[pointerId3];
                    if ((this.f3965F & i6) != 0) {
                        this.f3967H.mo4340a(i6 & this.f3965F, pointerId3);
                        return;
                    }
                    return;
                } else if (mo4331d((int) x4, (int) y4)) {
                    mo4324b(this.f3968I, pointerId3);
                    return;
                } else {
                    return;
                }
            case 6:
                int pointerId4 = motionEvent.getPointerId(b);
                if (this.f3972q == 1 && pointerId4 == this.f3974s) {
                    int pointerCount2 = motionEvent.getPointerCount();
                    while (true) {
                        if (i2 >= pointerCount2) {
                            i = -1;
                        } else {
                            int pointerId5 = motionEvent.getPointerId(i2);
                            if (pointerId5 != this.f3974s) {
                                if (mo4333e((int) motionEvent.getX(i2), (int) motionEvent.getY(i2)) == this.f3968I && mo4324b(this.f3968I, pointerId5)) {
                                    i = this.f3974s;
                                }
                            }
                            i2++;
                        }
                    }
                    if (i == -1) {
                        m7555j();
                    }
                }
                m7551f(pointerId4);
                return;
            default:
                return;
        }
    }

    /* renamed from: b */
    public boolean mo4322b(int i) {
        return (this.f3960A & (1 << i)) != 0;
    }

    /* renamed from: b */
    public boolean mo4323b(int i, int i2) {
        if (!mo4322b(i2)) {
            return false;
        }
        boolean z = (i & 1) == 1;
        boolean z2 = (i & 2) == 2;
        float f = this.f3977v[i2] - this.f3975t[i2];
        float f2 = this.f3978w[i2] - this.f3976u[i2];
        if (z && z2) {
            return (f * f) + (f2 * f2) > ((float) (this.f3973r * this.f3973r));
        }
        if (z) {
            return Math.abs(f) > ((float) this.f3973r);
        }
        if (z2) {
            return Math.abs(f2) > ((float) this.f3973r);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo4324b(View view, int i) {
        if (view == this.f3968I && this.f3974s == i) {
            return true;
        }
        if (view == null || !this.f3967H.mo4237a(view, i)) {
            return false;
        }
        this.f3974s = i;
        mo4314a(view, i);
        return true;
    }

    /* renamed from: b */
    public boolean mo4325b(View view, int i, int i2) {
        return view != null && i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom();
    }

    /* renamed from: c */
    public int mo4326c() {
        return this.f3964E;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo4327c(int i) {
        this.f3970K.removeCallbacks(this.f3971M);
        if (this.f3972q != i) {
            this.f3972q = i;
            this.f3967H.mo4234a(i);
            if (this.f3972q == 0) {
                this.f3968I = null;
            }
        }
    }

    /* renamed from: c */
    public boolean mo4328c(int i, int i2) {
        return mo4322b(i2) && (this.f3979x[i2] & i) != 0;
    }

    /* renamed from: d */
    public View mo4329d() {
        return this.f3968I;
    }

    /* renamed from: d */
    public boolean mo4330d(int i) {
        int length = this.f3975t.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (mo4323b(i, i2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public boolean mo4331d(int i, int i2) {
        return mo4325b(this.f3968I, i, i2);
    }

    /* renamed from: e */
    public int mo4332e() {
        return this.f3974s;
    }

    /* renamed from: e */
    public View mo4333e(int i, int i2) {
        for (int childCount = this.f3970K.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f3970K.getChildAt(this.f3967H.mo4343c(childCount));
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: e */
    public boolean mo4334e(int i) {
        int length = this.f3979x.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (mo4328c(i, i2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public int mo4335f() {
        return this.f3973r;
    }

    /* renamed from: g */
    public void mo4336g() {
        this.f3974s = -1;
        m7554i();
        if (this.f3961B != null) {
            this.f3961B.recycle();
            this.f3961B = null;
        }
    }

    /* renamed from: h */
    public void mo4337h() {
        mo4336g();
        if (this.f3972q == 2) {
            int b = this.f3966G.mo4130b();
            int c = this.f3966G.mo4132c();
            this.f3966G.mo4137h();
            int b2 = this.f3966G.mo4130b();
            int c2 = this.f3966G.mo4132c();
            this.f3967H.mo4236a(this.f3968I, b2, c2, b2 - b, c2 - c);
        }
        mo4327c(0);
    }
}
