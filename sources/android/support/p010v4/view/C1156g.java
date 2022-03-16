package android.support.p010v4.view;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

/* renamed from: android.support.v4.view.g */
public final class C1156g {

    /* renamed from: a */
    private final C1157a f3576a;

    /* renamed from: android.support.v4.view.g$a */
    interface C1157a {
        /* renamed from: a */
        void mo3985a(GestureDetector.OnDoubleTapListener onDoubleTapListener);

        /* renamed from: a */
        void mo3986a(boolean z);

        /* renamed from: a */
        boolean mo3987a();

        /* renamed from: a */
        boolean mo3988a(MotionEvent motionEvent);
    }

    /* renamed from: android.support.v4.view.g$b */
    static class C1158b implements C1157a {

        /* renamed from: j */
        private static final int f3577j = ViewConfiguration.getLongPressTimeout();

        /* renamed from: k */
        private static final int f3578k = ViewConfiguration.getTapTimeout();

        /* renamed from: l */
        private static final int f3579l = ViewConfiguration.getDoubleTapTimeout();

        /* renamed from: m */
        private static final int f3580m = 1;

        /* renamed from: n */
        private static final int f3581n = 2;

        /* renamed from: o */
        private static final int f3582o = 3;

        /* renamed from: A */
        private VelocityTracker f3583A;

        /* renamed from: a */
        final GestureDetector.OnGestureListener f3584a;

        /* renamed from: b */
        GestureDetector.OnDoubleTapListener f3585b;

        /* renamed from: c */
        boolean f3586c;

        /* renamed from: d */
        boolean f3587d;

        /* renamed from: e */
        MotionEvent f3588e;

        /* renamed from: f */
        private int f3589f;

        /* renamed from: g */
        private int f3590g;

        /* renamed from: h */
        private int f3591h;

        /* renamed from: i */
        private int f3592i;

        /* renamed from: p */
        private final Handler f3593p;

        /* renamed from: q */
        private boolean f3594q;

        /* renamed from: r */
        private boolean f3595r;

        /* renamed from: s */
        private boolean f3596s;

        /* renamed from: t */
        private MotionEvent f3597t;

        /* renamed from: u */
        private boolean f3598u;

        /* renamed from: v */
        private float f3599v;

        /* renamed from: w */
        private float f3600w;

        /* renamed from: x */
        private float f3601x;

        /* renamed from: y */
        private float f3602y;

        /* renamed from: z */
        private boolean f3603z;

        /* renamed from: android.support.v4.view.g$b$a */
        private class C1159a extends Handler {
            C1159a() {
            }

            C1159a(Handler handler) {
                super(handler.getLooper());
            }

            public void handleMessage(Message message) {
                switch (message.what) {
                    case 1:
                        C1158b.this.f3584a.onShowPress(C1158b.this.f3588e);
                        return;
                    case 2:
                        C1158b.this.mo3989b();
                        return;
                    case 3:
                        if (C1158b.this.f3585b == null) {
                            return;
                        }
                        if (!C1158b.this.f3586c) {
                            C1158b.this.f3585b.onSingleTapConfirmed(C1158b.this.f3588e);
                            return;
                        } else {
                            C1158b.this.f3587d = true;
                            return;
                        }
                    default:
                        throw new RuntimeException("Unknown message " + message);
                }
            }
        }

        public C1158b(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
            if (handler != null) {
                this.f3593p = new C1159a(handler);
            } else {
                this.f3593p = new C1159a();
            }
            this.f3584a = onGestureListener;
            if (onGestureListener instanceof GestureDetector.OnDoubleTapListener) {
                mo3985a((GestureDetector.OnDoubleTapListener) onGestureListener);
            }
            m6963a(context);
        }

        /* renamed from: a */
        private void m6963a(Context context) {
            if (context == null) {
                throw new IllegalArgumentException("Context must not be null");
            } else if (this.f3584a == null) {
                throw new IllegalArgumentException("OnGestureListener must not be null");
            } else {
                this.f3603z = true;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
                int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
                this.f3591h = viewConfiguration.getScaledMinimumFlingVelocity();
                this.f3592i = viewConfiguration.getScaledMaximumFlingVelocity();
                this.f3589f = scaledTouchSlop * scaledTouchSlop;
                this.f3590g = scaledDoubleTapSlop * scaledDoubleTapSlop;
            }
        }

        /* renamed from: a */
        private boolean m6964a(MotionEvent motionEvent, MotionEvent motionEvent2, MotionEvent motionEvent3) {
            if (!this.f3596s || motionEvent3.getEventTime() - motionEvent2.getEventTime() > ((long) f3579l)) {
                return false;
            }
            int x = ((int) motionEvent.getX()) - ((int) motionEvent3.getX());
            int y = ((int) motionEvent.getY()) - ((int) motionEvent3.getY());
            return (x * x) + (y * y) < this.f3590g;
        }

        /* renamed from: c */
        private void m6965c() {
            this.f3593p.removeMessages(1);
            this.f3593p.removeMessages(2);
            this.f3593p.removeMessages(3);
            this.f3583A.recycle();
            this.f3583A = null;
            this.f3598u = false;
            this.f3586c = false;
            this.f3595r = false;
            this.f3596s = false;
            this.f3587d = false;
            if (this.f3594q) {
                this.f3594q = false;
            }
        }

        /* renamed from: d */
        private void m6966d() {
            this.f3593p.removeMessages(1);
            this.f3593p.removeMessages(2);
            this.f3593p.removeMessages(3);
            this.f3598u = false;
            this.f3595r = false;
            this.f3596s = false;
            this.f3587d = false;
            if (this.f3594q) {
                this.f3594q = false;
            }
        }

        /* renamed from: a */
        public void mo3985a(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
            this.f3585b = onDoubleTapListener;
        }

        /* renamed from: a */
        public void mo3986a(boolean z) {
            this.f3603z = z;
        }

        /* renamed from: a */
        public boolean mo3987a() {
            return this.f3603z;
        }

        /* JADX WARNING: Removed duplicated region for block: B:43:0x00eb  */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x0104  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo3988a(android.view.MotionEvent r14) {
            /*
                r13 = this;
                r6 = 0
                r12 = 2
                r11 = 3
                r8 = 1
                r3 = 0
                int r9 = r14.getAction()
                android.view.VelocityTracker r0 = r13.f3583A
                if (r0 != 0) goto L_0x0013
                android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
                r13.f3583A = r0
            L_0x0013:
                android.view.VelocityTracker r0 = r13.f3583A
                r0.addMovement(r14)
                r0 = r9 & 255(0xff, float:3.57E-43)
                r1 = 6
                if (r0 != r1) goto L_0x0032
                r7 = r8
            L_0x001e:
                if (r7 == 0) goto L_0x0034
                int r0 = android.support.p010v4.view.C1200x.m7133b(r14)
            L_0x0024:
                int r4 = r14.getPointerCount()
                r5 = r3
                r1 = r6
                r2 = r6
            L_0x002b:
                if (r5 >= r4) goto L_0x0041
                if (r0 != r5) goto L_0x0036
            L_0x002f:
                int r5 = r5 + 1
                goto L_0x002b
            L_0x0032:
                r7 = r3
                goto L_0x001e
            L_0x0034:
                r0 = -1
                goto L_0x0024
            L_0x0036:
                float r10 = r14.getX(r5)
                float r2 = r2 + r10
                float r10 = r14.getY(r5)
                float r1 = r1 + r10
                goto L_0x002f
            L_0x0041:
                if (r7 == 0) goto L_0x004f
                int r0 = r4 + -1
            L_0x0045:
                float r5 = (float) r0
                float r2 = r2 / r5
                float r0 = (float) r0
                float r1 = r1 / r0
                r0 = r9 & 255(0xff, float:3.57E-43)
                switch(r0) {
                    case 0: goto L_0x00a8;
                    case 1: goto L_0x01b3;
                    case 2: goto L_0x013f;
                    case 3: goto L_0x0247;
                    case 4: goto L_0x004e;
                    case 5: goto L_0x0051;
                    case 6: goto L_0x005d;
                    default: goto L_0x004e;
                }
            L_0x004e:
                return r3
            L_0x004f:
                r0 = r4
                goto L_0x0045
            L_0x0051:
                r13.f3599v = r2
                r13.f3601x = r2
                r13.f3600w = r1
                r13.f3602y = r1
                r13.m6966d()
                goto L_0x004e
            L_0x005d:
                r13.f3599v = r2
                r13.f3601x = r2
                r13.f3600w = r1
                r13.f3602y = r1
                android.view.VelocityTracker r0 = r13.f3583A
                r1 = 1000(0x3e8, float:1.401E-42)
                int r2 = r13.f3592i
                float r2 = (float) r2
                r0.computeCurrentVelocity(r1, r2)
                int r1 = android.support.p010v4.view.C1200x.m7133b(r14)
                int r0 = r14.getPointerId(r1)
                android.view.VelocityTracker r2 = r13.f3583A
                float r2 = android.support.p010v4.view.C1035ap.m5841a(r2, r0)
                android.view.VelocityTracker r5 = r13.f3583A
                float r5 = android.support.p010v4.view.C1035ap.m5842b(r5, r0)
                r0 = r3
            L_0x0084:
                if (r0 >= r4) goto L_0x004e
                if (r0 != r1) goto L_0x008b
            L_0x0088:
                int r0 = r0 + 1
                goto L_0x0084
            L_0x008b:
                int r7 = r14.getPointerId(r0)
                android.view.VelocityTracker r8 = r13.f3583A
                float r8 = android.support.p010v4.view.C1035ap.m5841a(r8, r7)
                float r8 = r8 * r2
                android.view.VelocityTracker r9 = r13.f3583A
                float r7 = android.support.p010v4.view.C1035ap.m5842b(r9, r7)
                float r7 = r7 * r5
                float r7 = r7 + r8
                int r7 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
                if (r7 >= 0) goto L_0x0088
                android.view.VelocityTracker r0 = r13.f3583A
                r0.clear()
                goto L_0x004e
            L_0x00a8:
                android.view.GestureDetector$OnDoubleTapListener r0 = r13.f3585b
                if (r0 == 0) goto L_0x013d
                android.os.Handler r0 = r13.f3593p
                boolean r0 = r0.hasMessages(r11)
                if (r0 == 0) goto L_0x00b9
                android.os.Handler r4 = r13.f3593p
                r4.removeMessages(r11)
            L_0x00b9:
                android.view.MotionEvent r4 = r13.f3588e
                if (r4 == 0) goto L_0x0135
                android.view.MotionEvent r4 = r13.f3597t
                if (r4 == 0) goto L_0x0135
                if (r0 == 0) goto L_0x0135
                android.view.MotionEvent r0 = r13.f3588e
                android.view.MotionEvent r4 = r13.f3597t
                boolean r0 = r13.m6964a(r0, r4, r14)
                if (r0 == 0) goto L_0x0135
                r13.f3598u = r8
                android.view.GestureDetector$OnDoubleTapListener r0 = r13.f3585b
                android.view.MotionEvent r4 = r13.f3588e
                boolean r0 = r0.onDoubleTap(r4)
                r0 = r0 | r3
                android.view.GestureDetector$OnDoubleTapListener r4 = r13.f3585b
                boolean r4 = r4.onDoubleTapEvent(r14)
                r0 = r0 | r4
            L_0x00df:
                r13.f3599v = r2
                r13.f3601x = r2
                r13.f3600w = r1
                r13.f3602y = r1
                android.view.MotionEvent r1 = r13.f3588e
                if (r1 == 0) goto L_0x00f0
                android.view.MotionEvent r1 = r13.f3588e
                r1.recycle()
            L_0x00f0:
                android.view.MotionEvent r1 = android.view.MotionEvent.obtain(r14)
                r13.f3588e = r1
                r13.f3595r = r8
                r13.f3596s = r8
                r13.f3586c = r8
                r13.f3594q = r3
                r13.f3587d = r3
                boolean r1 = r13.f3603z
                if (r1 == 0) goto L_0x011c
                android.os.Handler r1 = r13.f3593p
                r1.removeMessages(r12)
                android.os.Handler r1 = r13.f3593p
                android.view.MotionEvent r2 = r13.f3588e
                long r2 = r2.getDownTime()
                int r4 = f3578k
                long r4 = (long) r4
                long r2 = r2 + r4
                int r4 = f3577j
                long r4 = (long) r4
                long r2 = r2 + r4
                r1.sendEmptyMessageAtTime(r12, r2)
            L_0x011c:
                android.os.Handler r1 = r13.f3593p
                android.view.MotionEvent r2 = r13.f3588e
                long r2 = r2.getDownTime()
                int r4 = f3578k
                long r4 = (long) r4
                long r2 = r2 + r4
                r1.sendEmptyMessageAtTime(r8, r2)
                android.view.GestureDetector$OnGestureListener r1 = r13.f3584a
                boolean r1 = r1.onDown(r14)
                r3 = r0 | r1
                goto L_0x004e
            L_0x0135:
                android.os.Handler r0 = r13.f3593p
                int r4 = f3579l
                long r4 = (long) r4
                r0.sendEmptyMessageDelayed(r11, r4)
            L_0x013d:
                r0 = r3
                goto L_0x00df
            L_0x013f:
                boolean r0 = r13.f3594q
                if (r0 != 0) goto L_0x004e
                float r0 = r13.f3599v
                float r0 = r0 - r2
                float r4 = r13.f3600w
                float r4 = r4 - r1
                boolean r5 = r13.f3598u
                if (r5 == 0) goto L_0x0156
                android.view.GestureDetector$OnDoubleTapListener r0 = r13.f3585b
                boolean r0 = r0.onDoubleTapEvent(r14)
                r3 = r3 | r0
                goto L_0x004e
            L_0x0156:
                boolean r5 = r13.f3595r
                if (r5 == 0) goto L_0x0191
                float r5 = r13.f3601x
                float r5 = r2 - r5
                int r5 = (int) r5
                float r6 = r13.f3602y
                float r6 = r1 - r6
                int r6 = (int) r6
                int r5 = r5 * r5
                int r6 = r6 * r6
                int r5 = r5 + r6
                int r6 = r13.f3589f
                if (r5 <= r6) goto L_0x024f
                android.view.GestureDetector$OnGestureListener r6 = r13.f3584a
                android.view.MotionEvent r7 = r13.f3588e
                boolean r0 = r6.onScroll(r7, r14, r0, r4)
                r13.f3599v = r2
                r13.f3600w = r1
                r13.f3595r = r3
                android.os.Handler r1 = r13.f3593p
                r1.removeMessages(r11)
                android.os.Handler r1 = r13.f3593p
                r1.removeMessages(r8)
                android.os.Handler r1 = r13.f3593p
                r1.removeMessages(r12)
            L_0x0188:
                int r1 = r13.f3589f
                if (r5 <= r1) goto L_0x018e
                r13.f3596s = r3
            L_0x018e:
                r3 = r0
                goto L_0x004e
            L_0x0191:
                float r5 = java.lang.Math.abs(r0)
                r6 = 1065353216(0x3f800000, float:1.0)
                int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
                if (r5 >= 0) goto L_0x01a5
                float r5 = java.lang.Math.abs(r4)
                r6 = 1065353216(0x3f800000, float:1.0)
                int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
                if (r5 < 0) goto L_0x004e
            L_0x01a5:
                android.view.GestureDetector$OnGestureListener r3 = r13.f3584a
                android.view.MotionEvent r5 = r13.f3588e
                boolean r3 = r3.onScroll(r5, r14, r0, r4)
                r13.f3599v = r2
                r13.f3600w = r1
                goto L_0x004e
            L_0x01b3:
                r13.f3586c = r3
                android.view.MotionEvent r1 = android.view.MotionEvent.obtain(r14)
                boolean r0 = r13.f3598u
                if (r0 == 0) goto L_0x01ec
                android.view.GestureDetector$OnDoubleTapListener r0 = r13.f3585b
                boolean r0 = r0.onDoubleTapEvent(r14)
                r0 = r0 | r3
            L_0x01c4:
                android.view.MotionEvent r2 = r13.f3597t
                if (r2 == 0) goto L_0x01cd
                android.view.MotionEvent r2 = r13.f3597t
                r2.recycle()
            L_0x01cd:
                r13.f3597t = r1
                android.view.VelocityTracker r1 = r13.f3583A
                if (r1 == 0) goto L_0x01db
                android.view.VelocityTracker r1 = r13.f3583A
                r1.recycle()
                r1 = 0
                r13.f3583A = r1
            L_0x01db:
                r13.f3598u = r3
                r13.f3587d = r3
                android.os.Handler r1 = r13.f3593p
                r1.removeMessages(r8)
                android.os.Handler r1 = r13.f3593p
                r1.removeMessages(r12)
                r3 = r0
                goto L_0x004e
            L_0x01ec:
                boolean r0 = r13.f3594q
                if (r0 == 0) goto L_0x01f9
                android.os.Handler r0 = r13.f3593p
                r0.removeMessages(r11)
                r13.f3594q = r3
                r0 = r3
                goto L_0x01c4
            L_0x01f9:
                boolean r0 = r13.f3595r
                if (r0 == 0) goto L_0x0211
                android.view.GestureDetector$OnGestureListener r0 = r13.f3584a
                boolean r0 = r0.onSingleTapUp(r14)
                boolean r2 = r13.f3587d
                if (r2 == 0) goto L_0x01c4
                android.view.GestureDetector$OnDoubleTapListener r2 = r13.f3585b
                if (r2 == 0) goto L_0x01c4
                android.view.GestureDetector$OnDoubleTapListener r2 = r13.f3585b
                r2.onSingleTapConfirmed(r14)
                goto L_0x01c4
            L_0x0211:
                android.view.VelocityTracker r0 = r13.f3583A
                int r2 = r14.getPointerId(r3)
                r4 = 1000(0x3e8, float:1.401E-42)
                int r5 = r13.f3592i
                float r5 = (float) r5
                r0.computeCurrentVelocity(r4, r5)
                float r4 = android.support.p010v4.view.C1035ap.m5842b(r0, r2)
                float r0 = android.support.p010v4.view.C1035ap.m5841a(r0, r2)
                float r2 = java.lang.Math.abs(r4)
                int r5 = r13.f3591h
                float r5 = (float) r5
                int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
                if (r2 > 0) goto L_0x023d
                float r2 = java.lang.Math.abs(r0)
                int r5 = r13.f3591h
                float r5 = (float) r5
                int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
                if (r2 <= 0) goto L_0x024c
            L_0x023d:
                android.view.GestureDetector$OnGestureListener r2 = r13.f3584a
                android.view.MotionEvent r5 = r13.f3588e
                boolean r0 = r2.onFling(r5, r14, r0, r4)
                goto L_0x01c4
            L_0x0247:
                r13.m6965c()
                goto L_0x004e
            L_0x024c:
                r0 = r3
                goto L_0x01c4
            L_0x024f:
                r0 = r3
                goto L_0x0188
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p010v4.view.C1156g.C1158b.mo3988a(android.view.MotionEvent):boolean");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo3989b() {
            this.f3593p.removeMessages(3);
            this.f3587d = false;
            this.f3594q = true;
            this.f3584a.onLongPress(this.f3588e);
        }
    }

    /* renamed from: android.support.v4.view.g$c */
    static class C1160c implements C1157a {

        /* renamed from: a */
        private final GestureDetector f3605a;

        public C1160c(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
            this.f3605a = new GestureDetector(context, onGestureListener, handler);
        }

        /* renamed from: a */
        public void mo3985a(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
            this.f3605a.setOnDoubleTapListener(onDoubleTapListener);
        }

        /* renamed from: a */
        public void mo3986a(boolean z) {
            this.f3605a.setIsLongpressEnabled(z);
        }

        /* renamed from: a */
        public boolean mo3987a() {
            return this.f3605a.isLongpressEnabled();
        }

        /* renamed from: a */
        public boolean mo3988a(MotionEvent motionEvent) {
            return this.f3605a.onTouchEvent(motionEvent);
        }
    }

    public C1156g(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this(context, onGestureListener, (Handler) null);
    }

    public C1156g(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
        if (Build.VERSION.SDK_INT > 17) {
            this.f3576a = new C1160c(context, onGestureListener, handler);
        } else {
            this.f3576a = new C1158b(context, onGestureListener, handler);
        }
    }

    /* renamed from: a */
    public void mo3981a(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.f3576a.mo3985a(onDoubleTapListener);
    }

    /* renamed from: a */
    public void mo3982a(boolean z) {
        this.f3576a.mo3986a(z);
    }

    /* renamed from: a */
    public boolean mo3983a() {
        return this.f3576a.mo3987a();
    }

    /* renamed from: a */
    public boolean mo3984a(MotionEvent motionEvent) {
        return this.f3576a.mo3988a(motionEvent);
    }
}
