package android.support.p036v7.widget;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.SystemClock;
import android.support.annotation.C0007ae;
import android.support.annotation.C0011ag;
import android.support.p010v4.view.C1040ar;
import android.support.p010v4.view.C1200x;
import android.support.p036v7.view.menu.C1573t;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.ViewTreeObserver;

@C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
/* renamed from: android.support.v7.widget.ak */
public abstract class C1687ak implements View.OnTouchListener {

    /* renamed from: a */
    private final float f5642a;

    /* renamed from: b */
    private final int f5643b;

    /* renamed from: c */
    final View f5644c;

    /* renamed from: d */
    private final int f5645d;

    /* renamed from: e */
    private Runnable f5646e;

    /* renamed from: f */
    private Runnable f5647f;

    /* renamed from: g */
    private boolean f5648g;

    /* renamed from: h */
    private int f5649h;

    /* renamed from: i */
    private final int[] f5650i = new int[2];

    /* renamed from: android.support.v7.widget.ak$a */
    private class C1690a implements Runnable {
        C1690a() {
        }

        public void run() {
            ViewParent parent = C1687ak.this.f5644c.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* renamed from: android.support.v7.widget.ak$b */
    private class C1691b implements Runnable {
        C1691b() {
        }

        public void run() {
            C1687ak.this.mo6370d();
        }
    }

    public C1687ak(View view) {
        this.f5644c = view;
        view.setLongClickable(true);
        if (Build.VERSION.SDK_INT >= 12) {
            m10111a(view);
        } else {
            m10115b(view);
        }
        this.f5642a = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f5643b = ViewConfiguration.getTapTimeout();
        this.f5645d = (this.f5643b + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    @C0007ae(mo1a = 12)
    @TargetApi(12)
    /* renamed from: a */
    private void m10111a(View view) {
        view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
            public void onViewAttachedToWindow(View view) {
            }

            public void onViewDetachedFromWindow(View view) {
                C1687ak.this.mo6502e();
            }
        });
    }

    /* renamed from: a */
    private boolean m10112a(MotionEvent motionEvent) {
        View view = this.f5644c;
        if (!view.isEnabled()) {
            return false;
        }
        switch (C1200x.m7131a(motionEvent)) {
            case 0:
                this.f5649h = motionEvent.getPointerId(0);
                if (this.f5646e == null) {
                    this.f5646e = new C1690a();
                }
                view.postDelayed(this.f5646e, (long) this.f5643b);
                if (this.f5647f == null) {
                    this.f5647f = new C1691b();
                }
                view.postDelayed(this.f5647f, (long) this.f5645d);
                return false;
            case 1:
            case 3:
                m10119f();
                return false;
            case 2:
                int findPointerIndex = motionEvent.findPointerIndex(this.f5649h);
                if (findPointerIndex < 0 || m10113a(view, motionEvent.getX(findPointerIndex), motionEvent.getY(findPointerIndex), this.f5642a)) {
                    return false;
                }
                m10119f();
                view.getParent().requestDisallowInterceptTouchEvent(true);
                return true;
            default:
                return false;
        }
    }

    /* renamed from: a */
    private static boolean m10113a(View view, float f, float f2, float f3) {
        return f >= (-f3) && f2 >= (-f3) && f < ((float) (view.getRight() - view.getLeft())) + f3 && f2 < ((float) (view.getBottom() - view.getTop())) + f3;
    }

    /* renamed from: a */
    private boolean m10114a(View view, MotionEvent motionEvent) {
        int[] iArr = this.f5650i;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) (-iArr[0]), (float) (-iArr[1]));
        return true;
    }

    /* renamed from: b */
    private void m10115b(View view) {
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {

            /* renamed from: a */
            boolean f5652a = C1040ar.m5909ad(C1687ak.this.f5644c);

            public void onGlobalLayout() {
                boolean z = this.f5652a;
                this.f5652a = C1040ar.m5909ad(C1687ak.this.f5644c);
                if (z && !this.f5652a) {
                    C1687ak.this.mo6502e();
                }
            }
        });
    }

    /* renamed from: b */
    private boolean m10116b(MotionEvent motionEvent) {
        C1684ai aiVar;
        View view = this.f5644c;
        C1573t a = mo5206a();
        if (a == null || !a.mo5290e() || (aiVar = (C1684ai) a.mo5292g()) == null || !aiVar.isShown()) {
            return false;
        }
        MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        m10117b(view, obtainNoHistory);
        m10114a(aiVar, obtainNoHistory);
        boolean a2 = aiVar.mo6364a(obtainNoHistory, this.f5649h);
        obtainNoHistory.recycle();
        int a3 = C1200x.m7131a(motionEvent);
        return a2 && (a3 != 1 && a3 != 3);
    }

    /* renamed from: b */
    private boolean m10117b(View view, MotionEvent motionEvent) {
        int[] iArr = this.f5650i;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) iArr[0], (float) iArr[1]);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void mo6502e() {
        this.f5648g = false;
        this.f5649h = -1;
        if (this.f5646e != null) {
            this.f5644c.removeCallbacks(this.f5646e);
        }
    }

    /* renamed from: f */
    private void m10119f() {
        if (this.f5647f != null) {
            this.f5644c.removeCallbacks(this.f5647f);
        }
        if (this.f5646e != null) {
            this.f5644c.removeCallbacks(this.f5646e);
        }
    }

    /* renamed from: a */
    public abstract C1573t mo5206a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo5207b() {
        C1573t a = mo5206a();
        if (a == null || a.mo5290e()) {
            return true;
        }
        a.mo5279a();
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo5736c() {
        C1573t a = mo5206a();
        if (a == null || !a.mo5290e()) {
            return true;
        }
        a.mo5289d();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo6370d() {
        m10119f();
        View view = this.f5644c;
        if (view.isEnabled() && !view.isLongClickable() && mo5207b()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.f5648g = true;
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2 = this.f5648g;
        if (z2) {
            z = m10116b(motionEvent) || !mo5736c();
        } else {
            boolean z3 = m10112a(motionEvent) && mo5207b();
            if (z3) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f5644c.onTouchEvent(obtain);
                obtain.recycle();
            }
            z = z3;
        }
        this.f5648g = z;
        return z || z2;
    }
}
