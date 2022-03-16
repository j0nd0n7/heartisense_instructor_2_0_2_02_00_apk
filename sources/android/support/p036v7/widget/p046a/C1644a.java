package android.support.p036v7.widget.p046a;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.support.annotation.C0003aa;
import android.support.p010v4.p012b.C0163a;
import android.support.p010v4.p012b.C0164b;
import android.support.p010v4.p012b.C0166d;
import android.support.p010v4.p012b.C0174g;
import android.support.p010v4.view.C1035ap;
import android.support.p010v4.view.C1040ar;
import android.support.p010v4.view.C1156g;
import android.support.p010v4.view.C1200x;
import android.support.p036v7.p042d.C1484b;
import android.support.p036v7.widget.C1732az;
import android.support.p036v7.widget.p046a.C1659c;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v7.widget.a.a */
public class C1644a extends C1732az.C1749g implements C1732az.C1756j {

    /* renamed from: N */
    private static final int f5480N = 255;

    /* renamed from: O */
    private static final int f5481O = 1000;

    /* renamed from: a */
    public static final int f5482a = 1;

    /* renamed from: b */
    public static final int f5483b = 2;

    /* renamed from: c */
    public static final int f5484c = 4;

    /* renamed from: d */
    public static final int f5485d = 8;

    /* renamed from: e */
    public static final int f5486e = 16;

    /* renamed from: f */
    public static final int f5487f = 32;

    /* renamed from: g */
    public static final int f5488g = 0;

    /* renamed from: h */
    public static final int f5489h = 1;

    /* renamed from: i */
    public static final int f5490i = 2;

    /* renamed from: j */
    public static final int f5491j = 2;

    /* renamed from: k */
    public static final int f5492k = 4;

    /* renamed from: l */
    public static final int f5493l = 8;

    /* renamed from: m */
    static final String f5494m = "ItemTouchHelper";

    /* renamed from: n */
    static final boolean f5495n = false;

    /* renamed from: o */
    static final int f5496o = -1;

    /* renamed from: p */
    static final int f5497p = 8;

    /* renamed from: q */
    static final int f5498q = 65280;

    /* renamed from: r */
    static final int f5499r = 16711680;

    /* renamed from: A */
    float f5500A;

    /* renamed from: B */
    float f5501B;

    /* renamed from: C */
    int f5502C = -1;

    /* renamed from: D */
    C1650a f5503D;

    /* renamed from: E */
    int f5504E = 0;

    /* renamed from: F */
    int f5505F;

    /* renamed from: G */
    List<C1654c> f5506G = new ArrayList();

    /* renamed from: H */
    C1732az f5507H;

    /* renamed from: I */
    final Runnable f5508I = new Runnable() {
        public void run() {
            if (C1644a.this.f5522t != null && C1644a.this.mo6188b()) {
                if (C1644a.this.f5522t != null) {
                    C1644a.this.mo6178a(C1644a.this.f5522t);
                }
                C1644a.this.f5507H.removeCallbacks(C1644a.this.f5508I);
                C1040ar.m5895a((View) C1644a.this.f5507H, (Runnable) this);
            }
        }
    };

    /* renamed from: J */
    VelocityTracker f5509J;

    /* renamed from: K */
    View f5510K = null;

    /* renamed from: L */
    int f5511L = -1;

    /* renamed from: M */
    C1156g f5512M;

    /* renamed from: P */
    private final float[] f5513P = new float[2];

    /* renamed from: Q */
    private int f5514Q;

    /* renamed from: R */
    private List<C1732az.C1774x> f5515R;

    /* renamed from: S */
    private List<Integer> f5516S;

    /* renamed from: T */
    private C1732az.C1742d f5517T = null;

    /* renamed from: U */
    private final C1732az.C1758l f5518U = new C1732az.C1758l() {
        public boolean onInterceptTouchEvent(C1732az azVar, MotionEvent motionEvent) {
            int findPointerIndex;
            C1654c b;
            C1644a.this.f5512M.mo3984a(motionEvent);
            int a = C1200x.m7131a(motionEvent);
            if (a == 0) {
                C1644a.this.f5502C = motionEvent.getPointerId(0);
                C1644a.this.f5523u = motionEvent.getX();
                C1644a.this.f5524v = motionEvent.getY();
                C1644a.this.mo6189c();
                if (C1644a.this.f5522t == null && (b = C1644a.this.mo6185b(motionEvent)) != null) {
                    C1644a.this.f5523u -= b.f5558l;
                    C1644a.this.f5524v -= b.f5559m;
                    C1644a.this.mo6175a(b.f5554h, true);
                    if (C1644a.this.f5521s.remove(b.f5554h.itemView)) {
                        C1644a.this.f5503D.mo6225e(C1644a.this.f5507H, b.f5554h);
                    }
                    C1644a.this.mo6179a(b.f5554h, b.f5555i);
                    C1644a.this.mo6181a(motionEvent, C1644a.this.f5505F, 0);
                }
            } else if (a == 3 || a == 1) {
                C1644a.this.f5502C = -1;
                C1644a.this.mo6179a((C1732az.C1774x) null, 0);
            } else if (C1644a.this.f5502C != -1 && (findPointerIndex = motionEvent.findPointerIndex(C1644a.this.f5502C)) >= 0) {
                C1644a.this.mo6184a(a, motionEvent, findPointerIndex);
            }
            if (C1644a.this.f5509J != null) {
                C1644a.this.f5509J.addMovement(motionEvent);
            }
            return C1644a.this.f5522t != null;
        }

        public void onRequestDisallowInterceptTouchEvent(boolean z) {
            if (z) {
                C1644a.this.mo6179a((C1732az.C1774x) null, 0);
            }
        }

        public void onTouchEvent(C1732az azVar, MotionEvent motionEvent) {
            int i = 0;
            C1644a.this.f5512M.mo3984a(motionEvent);
            if (C1644a.this.f5509J != null) {
                C1644a.this.f5509J.addMovement(motionEvent);
            }
            if (C1644a.this.f5502C != -1) {
                int a = C1200x.m7131a(motionEvent);
                int findPointerIndex = motionEvent.findPointerIndex(C1644a.this.f5502C);
                if (findPointerIndex >= 0) {
                    C1644a.this.mo6184a(a, motionEvent, findPointerIndex);
                }
                C1732az.C1774x xVar = C1644a.this.f5522t;
                if (xVar != null) {
                    switch (a) {
                        case 1:
                            break;
                        case 2:
                            if (findPointerIndex >= 0) {
                                C1644a.this.mo6181a(motionEvent, C1644a.this.f5505F, findPointerIndex);
                                C1644a.this.mo6178a(xVar);
                                C1644a.this.f5507H.removeCallbacks(C1644a.this.f5508I);
                                C1644a.this.f5508I.run();
                                C1644a.this.f5507H.invalidate();
                                return;
                            }
                            return;
                        case 3:
                            if (C1644a.this.f5509J != null) {
                                C1644a.this.f5509J.clear();
                                break;
                            }
                            break;
                        case 6:
                            int b = C1200x.m7133b(motionEvent);
                            if (motionEvent.getPointerId(b) == C1644a.this.f5502C) {
                                if (b == 0) {
                                    i = 1;
                                }
                                C1644a.this.f5502C = motionEvent.getPointerId(i);
                                C1644a.this.mo6181a(motionEvent, C1644a.this.f5505F, b);
                                return;
                            }
                            return;
                        default:
                            return;
                    }
                    C1644a.this.mo6179a((C1732az.C1774x) null, 0);
                    C1644a.this.f5502C = -1;
                }
            }
        }
    };

    /* renamed from: V */
    private Rect f5519V;

    /* renamed from: W */
    private long f5520W;

    /* renamed from: s */
    final List<View> f5521s = new ArrayList();

    /* renamed from: t */
    C1732az.C1774x f5522t = null;

    /* renamed from: u */
    float f5523u;

    /* renamed from: v */
    float f5524v;

    /* renamed from: w */
    float f5525w;

    /* renamed from: x */
    float f5526x;

    /* renamed from: y */
    float f5527y;

    /* renamed from: z */
    float f5528z;

    /* renamed from: android.support.v7.widget.a.a$a */
    public static abstract class C1650a {

        /* renamed from: a */
        public static final int f5538a = 200;

        /* renamed from: b */
        public static final int f5539b = 250;

        /* renamed from: c */
        static final int f5540c = 3158064;

        /* renamed from: d */
        private static final C1658b f5541d;

        /* renamed from: e */
        private static final int f5542e = 789516;

        /* renamed from: f */
        private static final Interpolator f5543f = new Interpolator() {
            public float getInterpolation(float f) {
                return f * f * f * f * f;
            }
        };

        /* renamed from: g */
        private static final Interpolator f5544g = new Interpolator() {
            public float getInterpolation(float f) {
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
            }
        };

        /* renamed from: h */
        private static final long f5545h = 2000;

        /* renamed from: i */
        private int f5546i = -1;

        static {
            if (Build.VERSION.SDK_INT >= 21) {
                f5541d = new C1659c.C1662c();
            } else if (Build.VERSION.SDK_INT >= 11) {
                f5541d = new C1659c.C1661b();
            } else {
                f5541d = new C1659c.C1660a();
            }
        }

        /* renamed from: a */
        public static int m9888a(int i, int i2) {
            int i3 = i & f5542e;
            if (i3 == 0) {
                return i;
            }
            int i4 = (i3 ^ -1) & i;
            return i2 == 0 ? i4 | (i3 << 2) : i4 | ((i3 << 1) & -789517) | (((i3 << 1) & f5542e) << 2);
        }

        /* renamed from: a */
        private int m9889a(C1732az azVar) {
            if (this.f5546i == -1) {
                this.f5546i = azVar.getResources().getDimensionPixelSize(C1484b.C1486b.item_touch_helper_max_drag_scroll_per_frame);
            }
            return this.f5546i;
        }

        /* renamed from: a */
        public static C1658b m9890a() {
            return f5541d;
        }

        /* renamed from: b */
        public static int m9891b(int i, int i2) {
            return m9892c(0, i2 | i) | m9892c(1, i2) | m9892c(2, i);
        }

        /* renamed from: c */
        public static int m9892c(int i, int i2) {
            return i2 << (i * 8);
        }

        /* renamed from: a */
        public float mo6201a(float f) {
            return f;
        }

        /* renamed from: a */
        public float mo6202a(C1732az.C1774x xVar) {
            return 0.5f;
        }

        /* renamed from: a */
        public int mo6203a(C1732az azVar, int i, int i2, int i3, long j) {
            float f = 1.0f;
            int a = (int) (((float) (m9889a(azVar) * ((int) Math.signum((float) i2)))) * f5544g.getInterpolation(Math.min(1.0f, (((float) Math.abs(i2)) * 1.0f) / ((float) i))));
            if (j <= f5545h) {
                f = ((float) j) / 2000.0f;
            }
            int interpolation = (int) (f5543f.getInterpolation(f) * ((float) a));
            return interpolation == 0 ? i2 > 0 ? 1 : -1 : interpolation;
        }

        /* renamed from: a */
        public abstract int mo6204a(C1732az azVar, C1732az.C1774x xVar);

        /* renamed from: a */
        public long mo6205a(C1732az azVar, int i, float f, float f2) {
            C1732az.C1743e itemAnimator = azVar.getItemAnimator();
            return itemAnimator == null ? i == 8 ? 200 : 250 : i == 8 ? itemAnimator.mo6814e() : itemAnimator.mo6817g();
        }

        /* renamed from: a */
        public C1732az.C1774x mo6206a(C1732az.C1774x xVar, List<C1732az.C1774x> list, int i, int i2) {
            C1732az.C1774x xVar2;
            int i3;
            int i4;
            int i5;
            int i6;
            C1732az.C1774x xVar3;
            int bottom;
            int abs;
            int top;
            int left;
            int right;
            int abs2;
            int width = i + xVar.itemView.getWidth();
            int height = i2 + xVar.itemView.getHeight();
            C1732az.C1774x xVar4 = null;
            int i7 = -1;
            int left2 = i - xVar.itemView.getLeft();
            int top2 = i2 - xVar.itemView.getTop();
            int size = list.size();
            int i8 = 0;
            while (i8 < size) {
                C1732az.C1774x xVar5 = list.get(i8);
                if (left2 <= 0 || (right = xVar5.itemView.getRight() - width) >= 0 || xVar5.itemView.getRight() <= xVar.itemView.getRight() || (abs2 = Math.abs(right)) <= i7) {
                    xVar2 = xVar4;
                    i3 = i7;
                } else {
                    i3 = abs2;
                    xVar2 = xVar5;
                }
                if (left2 >= 0 || (left = xVar5.itemView.getLeft() - i) <= 0 || xVar5.itemView.getLeft() >= xVar.itemView.getLeft() || (i4 = Math.abs(left)) <= i3) {
                    i4 = i3;
                } else {
                    xVar2 = xVar5;
                }
                if (top2 >= 0 || (top = xVar5.itemView.getTop() - i2) <= 0 || xVar5.itemView.getTop() >= xVar.itemView.getTop() || (i5 = Math.abs(top)) <= i4) {
                    i5 = i4;
                } else {
                    xVar2 = xVar5;
                }
                if (top2 <= 0 || (bottom = xVar5.itemView.getBottom() - height) >= 0 || xVar5.itemView.getBottom() <= xVar.itemView.getBottom() || (abs = Math.abs(bottom)) <= i5) {
                    i6 = i5;
                    xVar3 = xVar2;
                } else {
                    int i9 = abs;
                    xVar3 = xVar5;
                    i6 = i9;
                }
                i8++;
                xVar4 = xVar3;
                i7 = i6;
            }
            return xVar4;
        }

        /* renamed from: a */
        public void mo6207a(Canvas canvas, C1732az azVar, C1732az.C1774x xVar, float f, float f2, int i, boolean z) {
            f5541d.mo6239a(canvas, azVar, xVar.itemView, f, f2, i, z);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo6208a(Canvas canvas, C1732az azVar, C1732az.C1774x xVar, List<C1654c> list, int i, float f, float f2) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C1654c cVar = list.get(i2);
                cVar.mo6234c();
                int save = canvas.save();
                mo6207a(canvas, azVar, cVar.f5554h, cVar.f5558l, cVar.f5559m, cVar.f5555i, false);
                canvas.restoreToCount(save);
            }
            if (xVar != null) {
                int save2 = canvas.save();
                mo6207a(canvas, azVar, xVar, f, f2, i, true);
                canvas.restoreToCount(save2);
            }
        }

        /* renamed from: a */
        public abstract void mo6209a(C1732az.C1774x xVar, int i);

        /* renamed from: a */
        public void mo6210a(C1732az azVar, C1732az.C1774x xVar, int i, C1732az.C1774x xVar2, int i2, int i3, int i4) {
            C1732az.C1750h layoutManager = azVar.getLayoutManager();
            if (layoutManager instanceof C1657e) {
                ((C1657e) layoutManager).mo5822a(xVar.itemView, xVar2.itemView, i3, i4);
                return;
            }
            if (layoutManager.mo5845g()) {
                if (layoutManager.mo6934o(xVar2.itemView) <= azVar.getPaddingLeft()) {
                    azVar.scrollToPosition(i2);
                }
                if (layoutManager.mo6936q(xVar2.itemView) >= azVar.getWidth() - azVar.getPaddingRight()) {
                    azVar.scrollToPosition(i2);
                }
            }
            if (layoutManager.mo5847h()) {
                if (layoutManager.mo6935p(xVar2.itemView) <= azVar.getPaddingTop()) {
                    azVar.scrollToPosition(i2);
                }
                if (layoutManager.mo6937r(xVar2.itemView) >= azVar.getHeight() - azVar.getPaddingBottom()) {
                    azVar.scrollToPosition(i2);
                }
            }
        }

        /* renamed from: a */
        public boolean mo6211a(C1732az azVar, C1732az.C1774x xVar, C1732az.C1774x xVar2) {
            return true;
        }

        /* renamed from: b */
        public float mo6212b(float f) {
            return f;
        }

        /* renamed from: b */
        public float mo6213b(C1732az.C1774x xVar) {
            return 0.5f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final int mo6214b(C1732az azVar, C1732az.C1774x xVar) {
            return mo6223d(mo6204a(azVar, xVar), C1040ar.m5947k(azVar));
        }

        /* renamed from: b */
        public void mo6215b(Canvas canvas, C1732az azVar, C1732az.C1774x xVar, float f, float f2, int i, boolean z) {
            f5541d.mo6241b(canvas, azVar, xVar.itemView, f, f2, i, z);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo6216b(Canvas canvas, C1732az azVar, C1732az.C1774x xVar, List<C1654c> list, int i, float f, float f2) {
            boolean z;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C1654c cVar = list.get(i2);
                int save = canvas.save();
                mo6215b(canvas, azVar, cVar.f5554h, cVar.f5558l, cVar.f5559m, cVar.f5555i, false);
                canvas.restoreToCount(save);
            }
            if (xVar != null) {
                int save2 = canvas.save();
                mo6215b(canvas, azVar, xVar, f, f2, i, true);
                canvas.restoreToCount(save2);
            }
            boolean z2 = false;
            int i3 = size - 1;
            while (i3 >= 0) {
                C1654c cVar2 = list.get(i3);
                if (!cVar2.f5561o || cVar2.f5557k) {
                    z = !cVar2.f5561o ? true : z2;
                } else {
                    list.remove(i3);
                    z = z2;
                }
                i3--;
                z2 = z;
            }
            if (z2) {
                azVar.invalidate();
            }
        }

        /* renamed from: b */
        public void mo6217b(C1732az.C1774x xVar, int i) {
            if (xVar != null) {
                f5541d.mo6242b(xVar.itemView);
            }
        }

        /* renamed from: b */
        public boolean mo6218b() {
            return true;
        }

        /* renamed from: b */
        public abstract boolean mo6219b(C1732az azVar, C1732az.C1774x xVar, C1732az.C1774x xVar2);

        /* renamed from: c */
        public boolean mo6220c() {
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo6221c(C1732az azVar, C1732az.C1774x xVar) {
            return (mo6214b(azVar, xVar) & C1644a.f5499r) != 0;
        }

        /* renamed from: d */
        public int mo6222d() {
            return 0;
        }

        /* renamed from: d */
        public int mo6223d(int i, int i2) {
            int i3 = i & f5540c;
            if (i3 == 0) {
                return i;
            }
            int i4 = (i3 ^ -1) & i;
            return i2 == 0 ? i4 | (i3 >> 2) : i4 | ((i3 >> 1) & -3158065) | (((i3 >> 1) & f5540c) >> 2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public boolean mo6224d(C1732az azVar, C1732az.C1774x xVar) {
            return (mo6214b(azVar, xVar) & 65280) != 0;
        }

        /* renamed from: e */
        public void mo6225e(C1732az azVar, C1732az.C1774x xVar) {
            f5541d.mo6240a(xVar.itemView);
        }
    }

    /* renamed from: android.support.v7.widget.a.a$b */
    private class C1653b extends GestureDetector.SimpleOnGestureListener {
        C1653b() {
        }

        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        public void onLongPress(MotionEvent motionEvent) {
            C1732az.C1774x childViewHolder;
            View a = C1644a.this.mo6176a(motionEvent);
            if (a != null && (childViewHolder = C1644a.this.f5507H.getChildViewHolder(a)) != null && C1644a.this.f5503D.mo6221c(C1644a.this.f5507H, childViewHolder) && motionEvent.getPointerId(0) == C1644a.this.f5502C) {
                int findPointerIndex = motionEvent.findPointerIndex(C1644a.this.f5502C);
                float x = motionEvent.getX(findPointerIndex);
                float y = motionEvent.getY(findPointerIndex);
                C1644a.this.f5523u = x;
                C1644a.this.f5524v = y;
                C1644a aVar = C1644a.this;
                C1644a.this.f5528z = 0.0f;
                aVar.f5527y = 0.0f;
                if (C1644a.this.f5503D.mo6218b()) {
                    C1644a.this.mo6179a(childViewHolder, 2);
                }
            }
        }
    }

    /* renamed from: android.support.v7.widget.a.a$c */
    private class C1654c implements C0164b {

        /* renamed from: a */
        private final C0174g f5548a;

        /* renamed from: b */
        private float f5549b;

        /* renamed from: d */
        final float f5550d;

        /* renamed from: e */
        final float f5551e;

        /* renamed from: f */
        final float f5552f;

        /* renamed from: g */
        final float f5553g;

        /* renamed from: h */
        final C1732az.C1774x f5554h;

        /* renamed from: i */
        final int f5555i;

        /* renamed from: j */
        final int f5556j;

        /* renamed from: k */
        public boolean f5557k;

        /* renamed from: l */
        float f5558l;

        /* renamed from: m */
        float f5559m;

        /* renamed from: n */
        boolean f5560n = false;

        /* renamed from: o */
        boolean f5561o = false;

        public C1654c(C1732az.C1774x xVar, int i, int i2, float f, float f2, float f3, float f4) {
            this.f5555i = i2;
            this.f5556j = i;
            this.f5554h = xVar;
            this.f5550d = f;
            this.f5551e = f2;
            this.f5552f = f3;
            this.f5553g = f4;
            this.f5548a = C0163a.m798a();
            this.f5548a.mo728a((C0166d) new C0166d(C1644a.this) {
                /* renamed from: a */
                public void mo724a(C0174g gVar) {
                    C1654c.this.mo6231a(gVar.mo731c());
                }
            });
            this.f5548a.mo729a(xVar.itemView);
            this.f5548a.mo727a((C0164b) this);
            mo6231a(0.0f);
        }

        /* renamed from: a */
        public void mo6230a() {
            this.f5554h.setIsRecyclable(false);
            this.f5548a.mo725a();
        }

        /* renamed from: a */
        public void mo6231a(float f) {
            this.f5549b = f;
        }

        /* renamed from: a */
        public void mo6232a(long j) {
            this.f5548a.mo726a(j);
        }

        /* renamed from: a */
        public void mo718a(C0174g gVar) {
        }

        /* renamed from: b */
        public void mo6233b() {
            this.f5548a.mo730b();
        }

        /* renamed from: b */
        public void mo719b(C0174g gVar) {
            if (!this.f5561o) {
                this.f5554h.setIsRecyclable(true);
            }
            this.f5561o = true;
        }

        /* renamed from: c */
        public void mo6234c() {
            if (this.f5550d == this.f5552f) {
                this.f5558l = C1040ar.m5964v(this.f5554h.itemView);
            } else {
                this.f5558l = this.f5550d + (this.f5549b * (this.f5552f - this.f5550d));
            }
            if (this.f5551e == this.f5553g) {
                this.f5559m = C1040ar.m5965w(this.f5554h.itemView);
            } else {
                this.f5559m = this.f5551e + (this.f5549b * (this.f5553g - this.f5551e));
            }
        }

        /* renamed from: c */
        public void mo720c(C0174g gVar) {
            mo6231a(1.0f);
        }

        /* renamed from: d */
        public void mo721d(C0174g gVar) {
        }
    }

    /* renamed from: android.support.v7.widget.a.a$d */
    public static abstract class C1656d extends C1650a {

        /* renamed from: d */
        private int f5565d;

        /* renamed from: e */
        private int f5566e;

        public C1656d(int i, int i2) {
            this.f5565d = i2;
            this.f5566e = i;
        }

        /* renamed from: a */
        public int mo6204a(C1732az azVar, C1732az.C1774x xVar) {
            return m9891b(mo6238g(azVar, xVar), mo6237f(azVar, xVar));
        }

        /* renamed from: a */
        public void mo6235a(int i) {
            this.f5565d = i;
        }

        /* renamed from: b */
        public void mo6236b(int i) {
            this.f5566e = i;
        }

        /* renamed from: f */
        public int mo6237f(C1732az azVar, C1732az.C1774x xVar) {
            return this.f5565d;
        }

        /* renamed from: g */
        public int mo6238g(C1732az azVar, C1732az.C1774x xVar) {
            return this.f5566e;
        }
    }

    /* renamed from: android.support.v7.widget.a.a$e */
    public interface C1657e {
        /* renamed from: a */
        void mo5822a(View view, View view2, int i, int i2);
    }

    public C1644a(C1650a aVar) {
        this.f5503D = aVar;
    }

    /* renamed from: a */
    private void m9857a(float[] fArr) {
        if ((this.f5505F & 12) != 0) {
            fArr[0] = (this.f5500A + this.f5527y) - ((float) this.f5522t.itemView.getLeft());
        } else {
            fArr[0] = C1040ar.m5964v(this.f5522t.itemView);
        }
        if ((this.f5505F & 3) != 0) {
            fArr[1] = (this.f5501B + this.f5528z) - ((float) this.f5522t.itemView.getTop());
        } else {
            fArr[1] = C1040ar.m5965w(this.f5522t.itemView);
        }
    }

    /* renamed from: a */
    private static boolean m9858a(View view, float f, float f2, float f3, float f4) {
        return f >= f3 && f <= ((float) view.getWidth()) + f3 && f2 >= f4 && f2 <= ((float) view.getHeight()) + f4;
    }

    /* renamed from: b */
    private int m9859b(C1732az.C1774x xVar, int i) {
        int i2 = 8;
        if ((i & 12) != 0) {
            int i3 = this.f5527y > 0.0f ? 8 : 4;
            if (this.f5509J != null && this.f5502C > -1) {
                this.f5509J.computeCurrentVelocity(1000, this.f5503D.mo6212b(this.f5526x));
                float a = C1035ap.m5841a(this.f5509J, this.f5502C);
                float b = C1035ap.m5842b(this.f5509J, this.f5502C);
                if (a <= 0.0f) {
                    i2 = 4;
                }
                float abs = Math.abs(a);
                if ((i2 & i) != 0 && i3 == i2 && abs >= this.f5503D.mo6201a(this.f5525w) && abs > Math.abs(b)) {
                    return i2;
                }
            }
            float width = ((float) this.f5507H.getWidth()) * this.f5503D.mo6202a(xVar);
            if ((i & i3) != 0 && Math.abs(this.f5527y) > width) {
                return i3;
            }
        }
        return 0;
    }

    /* renamed from: c */
    private int m9860c(C1732az.C1774x xVar, int i) {
        int i2 = 2;
        if ((i & 3) != 0) {
            int i3 = this.f5528z > 0.0f ? 2 : 1;
            if (this.f5509J != null && this.f5502C > -1) {
                this.f5509J.computeCurrentVelocity(1000, this.f5503D.mo6212b(this.f5526x));
                float a = C1035ap.m5841a(this.f5509J, this.f5502C);
                float b = C1035ap.m5842b(this.f5509J, this.f5502C);
                if (b <= 0.0f) {
                    i2 = 1;
                }
                float abs = Math.abs(b);
                if ((i2 & i) != 0 && i2 == i3 && abs >= this.f5503D.mo6201a(this.f5525w) && abs > Math.abs(a)) {
                    return i2;
                }
            }
            float height = ((float) this.f5507H.getHeight()) * this.f5503D.mo6202a(xVar);
            if ((i & i3) != 0 && Math.abs(this.f5528z) > height) {
                return i3;
            }
        }
        return 0;
    }

    /* renamed from: c */
    private C1732az.C1774x m9861c(MotionEvent motionEvent) {
        View a;
        C1732az.C1750h layoutManager = this.f5507H.getLayoutManager();
        if (this.f5502C == -1) {
            return null;
        }
        int findPointerIndex = motionEvent.findPointerIndex(this.f5502C);
        float abs = Math.abs(motionEvent.getX(findPointerIndex) - this.f5523u);
        float abs2 = Math.abs(motionEvent.getY(findPointerIndex) - this.f5524v);
        if (abs < ((float) this.f5514Q) && abs2 < ((float) this.f5514Q)) {
            return null;
        }
        if (abs > abs2 && layoutManager.mo5845g()) {
            return null;
        }
        if ((abs2 <= abs || !layoutManager.mo5847h()) && (a = mo6176a(motionEvent)) != null) {
            return this.f5507H.getChildViewHolder(a);
        }
        return null;
    }

    /* renamed from: d */
    private List<C1732az.C1774x> m9862d(C1732az.C1774x xVar) {
        if (this.f5515R == null) {
            this.f5515R = new ArrayList();
            this.f5516S = new ArrayList();
        } else {
            this.f5515R.clear();
            this.f5516S.clear();
        }
        int d = this.f5503D.mo6222d();
        int round = Math.round(this.f5500A + this.f5527y) - d;
        int round2 = Math.round(this.f5501B + this.f5528z) - d;
        int width = xVar.itemView.getWidth() + round + (d * 2);
        int height = xVar.itemView.getHeight() + round2 + (d * 2);
        int i = (round + width) / 2;
        int i2 = (round2 + height) / 2;
        C1732az.C1750h layoutManager = this.f5507H.getLayoutManager();
        int H = layoutManager.mo6839H();
        for (int i3 = 0; i3 < H; i3++) {
            View j = layoutManager.mo6928j(i3);
            if (j != xVar.itemView && j.getBottom() >= round2 && j.getTop() <= height && j.getRight() >= round && j.getLeft() <= width) {
                C1732az.C1774x childViewHolder = this.f5507H.getChildViewHolder(j);
                if (this.f5503D.mo6211a(this.f5507H, this.f5522t, childViewHolder)) {
                    int abs = Math.abs(i - ((j.getLeft() + j.getRight()) / 2));
                    int abs2 = Math.abs(i2 - ((j.getBottom() + j.getTop()) / 2));
                    int i4 = (abs * abs) + (abs2 * abs2);
                    int size = this.f5515R.size();
                    int i5 = 0;
                    int i6 = 0;
                    while (i6 < size && i4 > this.f5516S.get(i6).intValue()) {
                        i5++;
                        i6++;
                    }
                    this.f5515R.add(i5, childViewHolder);
                    this.f5516S.add(i5, Integer.valueOf(i4));
                }
            }
        }
        return this.f5515R;
    }

    /* renamed from: d */
    private void m9863d() {
        this.f5514Q = ViewConfiguration.get(this.f5507H.getContext()).getScaledTouchSlop();
        this.f5507H.addItemDecoration(this);
        this.f5507H.addOnItemTouchListener(this.f5518U);
        this.f5507H.addOnChildAttachStateChangeListener(this);
        m9866f();
    }

    /* renamed from: e */
    private int m9864e(C1732az.C1774x xVar) {
        if (this.f5504E == 2) {
            return 0;
        }
        int a = this.f5503D.mo6204a(this.f5507H, xVar);
        int d = (this.f5503D.mo6223d(a, C1040ar.m5947k(this.f5507H)) & 65280) >> 8;
        if (d == 0) {
            return 0;
        }
        int i = (a & 65280) >> 8;
        if (Math.abs(this.f5527y) > Math.abs(this.f5528z)) {
            int b = m9859b(xVar, d);
            if (b > 0) {
                return (i & b) == 0 ? C1650a.m9888a(b, C1040ar.m5947k(this.f5507H)) : b;
            }
            int c = m9860c(xVar, d);
            if (c > 0) {
                return c;
            }
            return 0;
        }
        int c2 = m9860c(xVar, d);
        if (c2 > 0) {
            return c2;
        }
        int b2 = m9859b(xVar, d);
        if (b2 > 0) {
            return (i & b2) == 0 ? C1650a.m9888a(b2, C1040ar.m5947k(this.f5507H)) : b2;
        }
        return 0;
    }

    /* renamed from: e */
    private void m9865e() {
        this.f5507H.removeItemDecoration(this);
        this.f5507H.removeOnItemTouchListener(this.f5518U);
        this.f5507H.removeOnChildAttachStateChangeListener(this);
        for (int size = this.f5506G.size() - 1; size >= 0; size--) {
            this.f5503D.mo6225e(this.f5507H, this.f5506G.get(0).f5554h);
        }
        this.f5506G.clear();
        this.f5510K = null;
        this.f5511L = -1;
        m9867g();
    }

    /* renamed from: f */
    private void m9866f() {
        if (this.f5512M == null) {
            this.f5512M = new C1156g(this.f5507H.getContext(), new C1653b());
        }
    }

    /* renamed from: g */
    private void m9867g() {
        if (this.f5509J != null) {
            this.f5509J.recycle();
            this.f5509J = null;
        }
    }

    /* renamed from: h */
    private void m9868h() {
        if (Build.VERSION.SDK_INT < 21) {
            if (this.f5517T == null) {
                this.f5517T = new C1732az.C1742d() {
                    /* renamed from: a */
                    public int mo6200a(int i, int i2) {
                        if (C1644a.this.f5510K == null) {
                            return i2;
                        }
                        int i3 = C1644a.this.f5511L;
                        if (i3 == -1) {
                            i3 = C1644a.this.f5507H.indexOfChild(C1644a.this.f5510K);
                            C1644a.this.f5511L = i3;
                        }
                        return i2 == i + -1 ? i3 : i2 >= i3 ? i2 + 1 : i2;
                    }
                };
            }
            this.f5507H.setChildDrawingOrderCallback(this.f5517T);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo6175a(C1732az.C1774x xVar, boolean z) {
        for (int size = this.f5506G.size() - 1; size >= 0; size--) {
            C1654c cVar = this.f5506G.get(size);
            if (cVar.f5554h == xVar) {
                cVar.f5560n |= z;
                if (!cVar.f5561o) {
                    cVar.mo6233b();
                }
                this.f5506G.remove(size);
                return cVar.f5556j;
            }
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public View mo6176a(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (this.f5522t != null) {
            View view = this.f5522t.itemView;
            if (m9858a(view, x, y, this.f5500A + this.f5527y, this.f5501B + this.f5528z)) {
                return view;
            }
        }
        for (int size = this.f5506G.size() - 1; size >= 0; size--) {
            C1654c cVar = this.f5506G.get(size);
            View view2 = cVar.f5554h.itemView;
            if (m9858a(view2, x, y, cVar.f5558l, cVar.f5559m)) {
                return view2;
            }
        }
        return this.f5507H.findChildViewUnder(x, y);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo6177a(final C1654c cVar, final int i) {
        this.f5507H.post(new Runnable() {
            public void run() {
                if (C1644a.this.f5507H != null && C1644a.this.f5507H.isAttachedToWindow() && !cVar.f5560n && cVar.f5554h.getAdapterPosition() != -1) {
                    C1732az.C1743e itemAnimator = C1644a.this.f5507H.getItemAnimator();
                    if ((itemAnimator == null || !itemAnimator.mo6806a((C1732az.C1743e.C1745b) null)) && !C1644a.this.mo6183a()) {
                        C1644a.this.f5503D.mo6209a(cVar.f5554h, i);
                    } else {
                        C1644a.this.f5507H.post(this);
                    }
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo6178a(C1732az.C1774x xVar) {
        if (!this.f5507H.isLayoutRequested() && this.f5504E == 2) {
            float b = this.f5503D.mo6213b(xVar);
            int i = (int) (this.f5500A + this.f5527y);
            int i2 = (int) (this.f5501B + this.f5528z);
            if (((float) Math.abs(i2 - xVar.itemView.getTop())) >= ((float) xVar.itemView.getHeight()) * b || ((float) Math.abs(i - xVar.itemView.getLeft())) >= b * ((float) xVar.itemView.getWidth())) {
                List<C1732az.C1774x> d = m9862d(xVar);
                if (d.size() != 0) {
                    C1732az.C1774x a = this.f5503D.mo6206a(xVar, d, i, i2);
                    if (a == null) {
                        this.f5515R.clear();
                        this.f5516S.clear();
                        return;
                    }
                    int adapterPosition = a.getAdapterPosition();
                    int adapterPosition2 = xVar.getAdapterPosition();
                    if (this.f5503D.mo6219b(this.f5507H, xVar, a)) {
                        this.f5503D.mo6210a(this.f5507H, xVar, adapterPosition2, a, adapterPosition, i, i2);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo6179a(C1732az.C1774x xVar, int i) {
        float f;
        float signum;
        if (xVar != this.f5522t || i != this.f5504E) {
            this.f5520W = Long.MIN_VALUE;
            int i2 = this.f5504E;
            mo6175a(xVar, true);
            this.f5504E = i;
            if (i == 2) {
                this.f5510K = xVar.itemView;
                m9868h();
            }
            int i3 = (1 << ((i * 8) + 8)) - 1;
            boolean z = false;
            if (this.f5522t != null) {
                C1732az.C1774x xVar2 = this.f5522t;
                if (xVar2.itemView.getParent() != null) {
                    final int e = i2 == 2 ? 0 : m9864e(xVar2);
                    m9867g();
                    switch (e) {
                        case 1:
                        case 2:
                            f = 0.0f;
                            signum = Math.signum(this.f5528z) * ((float) this.f5507H.getHeight());
                            break;
                        case 4:
                        case 8:
                        case 16:
                        case 32:
                            signum = 0.0f;
                            f = Math.signum(this.f5527y) * ((float) this.f5507H.getWidth());
                            break;
                        default:
                            f = 0.0f;
                            signum = 0.0f;
                            break;
                    }
                    int i4 = i2 == 2 ? 8 : e > 0 ? 2 : 4;
                    m9857a(this.f5513P);
                    float f2 = this.f5513P[0];
                    float f3 = this.f5513P[1];
                    final C1732az.C1774x xVar3 = xVar2;
                    C16473 r0 = new C1654c(xVar2, i4, i2, f2, f3, f, signum) {
                        /* renamed from: b */
                        public void mo719b(C0174g gVar) {
                            super.mo719b(gVar);
                            if (!this.f5560n) {
                                if (e <= 0) {
                                    C1644a.this.f5503D.mo6225e(C1644a.this.f5507H, xVar3);
                                } else {
                                    C1644a.this.f5521s.add(xVar3.itemView);
                                    this.f5557k = true;
                                    if (e > 0) {
                                        C1644a.this.mo6177a((C1654c) this, e);
                                    }
                                }
                                if (C1644a.this.f5510K == xVar3.itemView) {
                                    C1644a.this.mo6191c(xVar3.itemView);
                                }
                            }
                        }
                    };
                    r0.mo6232a(this.f5503D.mo6205a(this.f5507H, i4, f - f2, signum - f3));
                    this.f5506G.add(r0);
                    r0.mo6230a();
                    z = true;
                } else {
                    mo6191c(xVar2.itemView);
                    this.f5503D.mo6225e(this.f5507H, xVar2);
                }
                this.f5522t = null;
            }
            boolean z2 = z;
            if (xVar != null) {
                this.f5505F = (this.f5503D.mo6214b(this.f5507H, xVar) & i3) >> (this.f5504E * 8);
                this.f5500A = (float) xVar.itemView.getLeft();
                this.f5501B = (float) xVar.itemView.getTop();
                this.f5522t = xVar;
                if (i == 2) {
                    this.f5522t.itemView.performHapticFeedback(0);
                }
            }
            ViewParent parent = this.f5507H.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(this.f5522t != null);
            }
            if (!z2) {
                this.f5507H.getLayoutManager().mo6887aa();
            }
            this.f5503D.mo6217b(this.f5522t, this.f5504E);
            this.f5507H.invalidate();
        }
    }

    /* renamed from: a */
    public void mo6180a(@C0003aa C1732az azVar) {
        if (this.f5507H != azVar) {
            if (this.f5507H != null) {
                m9865e();
            }
            this.f5507H = azVar;
            if (this.f5507H != null) {
                Resources resources = azVar.getResources();
                this.f5525w = resources.getDimension(C1484b.C1486b.item_touch_helper_swipe_escape_velocity);
                this.f5526x = resources.getDimension(C1484b.C1486b.item_touch_helper_swipe_escape_max_velocity);
                m9863d();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo6181a(MotionEvent motionEvent, int i, int i2) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        this.f5527y = x - this.f5523u;
        this.f5528z = y - this.f5524v;
        if ((i & 4) == 0) {
            this.f5527y = Math.max(0.0f, this.f5527y);
        }
        if ((i & 8) == 0) {
            this.f5527y = Math.min(0.0f, this.f5527y);
        }
        if ((i & 1) == 0) {
            this.f5528z = Math.max(0.0f, this.f5528z);
        }
        if ((i & 2) == 0) {
            this.f5528z = Math.min(0.0f, this.f5528z);
        }
    }

    /* renamed from: a */
    public void mo6182a(View view) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo6183a() {
        int size = this.f5506G.size();
        for (int i = 0; i < size; i++) {
            if (!this.f5506G.get(i).f5561o) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo6184a(int i, MotionEvent motionEvent, int i2) {
        C1732az.C1774x c;
        int b;
        if (this.f5522t != null || i != 2 || this.f5504E == 2 || !this.f5503D.mo6220c() || this.f5507H.getScrollState() == 1 || (c = m9861c(motionEvent)) == null || (b = (this.f5503D.mo6214b(this.f5507H, c) & 65280) >> 8) == 0) {
            return false;
        }
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float f = x - this.f5523u;
        float f2 = y - this.f5524v;
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if (abs < ((float) this.f5514Q) && abs2 < ((float) this.f5514Q)) {
            return false;
        }
        if (abs > abs2) {
            if (f < 0.0f && (b & 4) == 0) {
                return false;
            }
            if (f > 0.0f && (b & 8) == 0) {
                return false;
            }
        } else if (f2 < 0.0f && (b & 1) == 0) {
            return false;
        } else {
            if (f2 > 0.0f && (b & 2) == 0) {
                return false;
            }
        }
        this.f5528z = 0.0f;
        this.f5527y = 0.0f;
        this.f5502C = motionEvent.getPointerId(0);
        mo6179a(c, 1);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C1654c mo6185b(MotionEvent motionEvent) {
        if (this.f5506G.isEmpty()) {
            return null;
        }
        View a = mo6176a(motionEvent);
        for (int size = this.f5506G.size() - 1; size >= 0; size--) {
            C1654c cVar = this.f5506G.get(size);
            if (cVar.f5554h.itemView == a) {
                return cVar;
            }
        }
        return null;
    }

    /* renamed from: b */
    public void mo6186b(C1732az.C1774x xVar) {
        if (!this.f5503D.mo6221c(this.f5507H, xVar)) {
            Log.e(f5494m, "Start drag has been called but swiping is not enabled");
        } else if (xVar.itemView.getParent() != this.f5507H) {
            Log.e(f5494m, "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.");
        } else {
            mo6189c();
            this.f5528z = 0.0f;
            this.f5527y = 0.0f;
            mo6179a(xVar, 2);
        }
    }

    /* renamed from: b */
    public void mo6187b(View view) {
        mo6191c(view);
        C1732az.C1774x childViewHolder = this.f5507H.getChildViewHolder(view);
        if (childViewHolder != null) {
            if (this.f5522t == null || childViewHolder != this.f5522t) {
                mo6175a(childViewHolder, false);
                if (this.f5521s.remove(childViewHolder.itemView)) {
                    this.f5503D.mo6225e(this.f5507H, childViewHolder);
                    return;
                }
                return;
            }
            mo6179a((C1732az.C1774x) null, 0);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0051, code lost:
        if (r4 < 0) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0073, code lost:
        if (r8 < 0) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00e4, code lost:
        if (r4 > 0) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x010c, code lost:
        if (r8 > 0) goto L_0x0075;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo6188b() {
        /*
            r14 = this;
            r12 = -9223372036854775808
            r0 = 0
            r5 = 0
            android.support.v7.widget.az$x r1 = r14.f5522t
            if (r1 != 0) goto L_0x000b
            r14.f5520W = r12
        L_0x000a:
            return r0
        L_0x000b:
            long r10 = java.lang.System.currentTimeMillis()
            long r2 = r14.f5520W
            int r1 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r1 != 0) goto L_0x00bb
            r6 = 0
        L_0x0017:
            android.support.v7.widget.az r1 = r14.f5507H
            android.support.v7.widget.az$h r1 = r1.getLayoutManager()
            android.graphics.Rect r2 = r14.f5519V
            if (r2 != 0) goto L_0x0028
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r14.f5519V = r2
        L_0x0028:
            android.support.v7.widget.az$x r2 = r14.f5522t
            android.view.View r2 = r2.itemView
            android.graphics.Rect r3 = r14.f5519V
            r1.mo6897b((android.view.View) r2, (android.graphics.Rect) r3)
            boolean r2 = r1.mo5845g()
            if (r2 == 0) goto L_0x00e6
            float r2 = r14.f5500A
            float r3 = r14.f5527y
            float r2 = r2 + r3
            int r2 = (int) r2
            android.graphics.Rect r3 = r14.f5519V
            int r3 = r3.left
            int r3 = r2 - r3
            android.support.v7.widget.az r4 = r14.f5507H
            int r4 = r4.getPaddingLeft()
            int r4 = r3 - r4
            float r3 = r14.f5527y
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 >= 0) goto L_0x00c1
            if (r4 >= 0) goto L_0x00c1
        L_0x0053:
            boolean r1 = r1.mo5847h()
            if (r1 == 0) goto L_0x010e
            float r1 = r14.f5501B
            float r2 = r14.f5528z
            float r1 = r1 + r2
            int r1 = (int) r1
            android.graphics.Rect r2 = r14.f5519V
            int r2 = r2.top
            int r2 = r1 - r2
            android.support.v7.widget.az r3 = r14.f5507H
            int r3 = r3.getPaddingTop()
            int r8 = r2 - r3
            float r2 = r14.f5528z
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 >= 0) goto L_0x00e9
            if (r8 >= 0) goto L_0x00e9
        L_0x0075:
            if (r4 == 0) goto L_0x0117
            android.support.v7.widget.a.a$a r1 = r14.f5503D
            android.support.v7.widget.az r2 = r14.f5507H
            android.support.v7.widget.az$x r3 = r14.f5522t
            android.view.View r3 = r3.itemView
            int r3 = r3.getWidth()
            android.support.v7.widget.az r5 = r14.f5507H
            int r5 = r5.getWidth()
            int r4 = r1.mo6203a(r2, r3, r4, r5, r6)
            r9 = r4
        L_0x008e:
            if (r8 == 0) goto L_0x0115
            android.support.v7.widget.a.a$a r1 = r14.f5503D
            android.support.v7.widget.az r2 = r14.f5507H
            android.support.v7.widget.az$x r3 = r14.f5522t
            android.view.View r3 = r3.itemView
            int r3 = r3.getHeight()
            android.support.v7.widget.az r4 = r14.f5507H
            int r5 = r4.getHeight()
            r4 = r8
            int r1 = r1.mo6203a(r2, r3, r4, r5, r6)
        L_0x00a7:
            if (r9 != 0) goto L_0x00ab
            if (r1 == 0) goto L_0x0111
        L_0x00ab:
            long r2 = r14.f5520W
            int r0 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r0 != 0) goto L_0x00b3
            r14.f5520W = r10
        L_0x00b3:
            android.support.v7.widget.az r0 = r14.f5507H
            r0.scrollBy(r9, r1)
            r0 = 1
            goto L_0x000a
        L_0x00bb:
            long r2 = r14.f5520W
            long r6 = r10 - r2
            goto L_0x0017
        L_0x00c1:
            float r3 = r14.f5527y
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x00e6
            android.support.v7.widget.az$x r3 = r14.f5522t
            android.view.View r3 = r3.itemView
            int r3 = r3.getWidth()
            int r2 = r2 + r3
            android.graphics.Rect r3 = r14.f5519V
            int r3 = r3.right
            int r2 = r2 + r3
            android.support.v7.widget.az r3 = r14.f5507H
            int r3 = r3.getWidth()
            android.support.v7.widget.az r4 = r14.f5507H
            int r4 = r4.getPaddingRight()
            int r3 = r3 - r4
            int r4 = r2 - r3
            if (r4 > 0) goto L_0x0053
        L_0x00e6:
            r4 = r0
            goto L_0x0053
        L_0x00e9:
            float r2 = r14.f5528z
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 <= 0) goto L_0x010e
            android.support.v7.widget.az$x r2 = r14.f5522t
            android.view.View r2 = r2.itemView
            int r2 = r2.getHeight()
            int r1 = r1 + r2
            android.graphics.Rect r2 = r14.f5519V
            int r2 = r2.bottom
            int r1 = r1 + r2
            android.support.v7.widget.az r2 = r14.f5507H
            int r2 = r2.getHeight()
            android.support.v7.widget.az r3 = r14.f5507H
            int r3 = r3.getPaddingBottom()
            int r2 = r2 - r3
            int r8 = r1 - r2
            if (r8 > 0) goto L_0x0075
        L_0x010e:
            r8 = r0
            goto L_0x0075
        L_0x0111:
            r14.f5520W = r12
            goto L_0x000a
        L_0x0115:
            r1 = r8
            goto L_0x00a7
        L_0x0117:
            r9 = r4
            goto L_0x008e
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p036v7.widget.p046a.C1644a.mo6188b():boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo6189c() {
        if (this.f5509J != null) {
            this.f5509J.recycle();
        }
        this.f5509J = VelocityTracker.obtain();
    }

    /* renamed from: c */
    public void mo6190c(C1732az.C1774x xVar) {
        if (!this.f5503D.mo6224d(this.f5507H, xVar)) {
            Log.e(f5494m, "Start swipe has been called but dragging is not enabled");
        } else if (xVar.itemView.getParent() != this.f5507H) {
            Log.e(f5494m, "Start swipe has been called with a view holder which is not a child of the RecyclerView controlled by this ItemTouchHelper.");
        } else {
            mo6189c();
            this.f5528z = 0.0f;
            this.f5527y = 0.0f;
            mo6179a(xVar, 1);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo6191c(View view) {
        if (view == this.f5510K) {
            this.f5510K = null;
            if (this.f5517T != null) {
                this.f5507H.setChildDrawingOrderCallback((C1732az.C1742d) null);
            }
        }
    }

    public void getItemOffsets(Rect rect, View view, C1732az azVar, C1732az.C1771u uVar) {
        rect.setEmpty();
    }

    public void onDraw(Canvas canvas, C1732az azVar, C1732az.C1771u uVar) {
        float f;
        float f2 = 0.0f;
        this.f5511L = -1;
        if (this.f5522t != null) {
            m9857a(this.f5513P);
            f = this.f5513P[0];
            f2 = this.f5513P[1];
        } else {
            f = 0.0f;
        }
        this.f5503D.mo6208a(canvas, azVar, this.f5522t, this.f5506G, this.f5504E, f, f2);
    }

    public void onDrawOver(Canvas canvas, C1732az azVar, C1732az.C1771u uVar) {
        float f;
        float f2 = 0.0f;
        if (this.f5522t != null) {
            m9857a(this.f5513P);
            f = this.f5513P[0];
            f2 = this.f5513P[1];
        } else {
            f = 0.0f;
        }
        this.f5503D.mo6216b(canvas, azVar, this.f5522t, this.f5506G, this.f5504E, f, f2);
    }
}
