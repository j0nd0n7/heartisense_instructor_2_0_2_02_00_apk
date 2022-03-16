package android.support.p010v4.p025i;

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;

@Deprecated
/* renamed from: android.support.v4.i.t */
public class C0755t extends C0754s {
    @Deprecated

    /* renamed from: i */
    public static final int f2802i = 126;
    @Deprecated

    /* renamed from: j */
    public static final int f2803j = 127;
    @Deprecated

    /* renamed from: k */
    public static final int f2804k = 130;
    @Deprecated

    /* renamed from: l */
    public static final int f2805l = 1;
    @Deprecated

    /* renamed from: m */
    public static final int f2806m = 2;
    @Deprecated

    /* renamed from: n */
    public static final int f2807n = 4;
    @Deprecated

    /* renamed from: o */
    public static final int f2808o = 8;
    @Deprecated

    /* renamed from: p */
    public static final int f2809p = 16;
    @Deprecated

    /* renamed from: q */
    public static final int f2810q = 32;
    @Deprecated

    /* renamed from: r */
    public static final int f2811r = 64;
    @Deprecated

    /* renamed from: s */
    public static final int f2812s = 128;

    /* renamed from: a */
    final Context f2813a;

    /* renamed from: b */
    final C0766w f2814b;

    /* renamed from: c */
    final AudioManager f2815c;

    /* renamed from: d */
    final View f2816d;

    /* renamed from: e */
    final Object f2817e;

    /* renamed from: f */
    final C0759v f2818f;

    /* renamed from: g */
    final ArrayList<C0767x> f2819g;

    /* renamed from: h */
    final C0758u f2820h;

    /* renamed from: t */
    final KeyEvent.Callback f2821t;

    @Deprecated
    public C0755t(Activity activity, C0766w wVar) {
        this(activity, (View) null, wVar);
    }

    private C0755t(Activity activity, View view, C0766w wVar) {
        this.f2819g = new ArrayList<>();
        this.f2820h = new C0758u() {
            /* renamed from: a */
            public long mo2586a() {
                return C0755t.this.f2814b.mo2621e();
            }

            /* renamed from: a */
            public void mo2587a(int i) {
                C0755t.this.f2814b.mo2614a(i);
            }

            /* renamed from: a */
            public void mo2588a(long j) {
                C0755t.this.f2814b.mo2615a(j);
            }

            /* renamed from: a */
            public void mo2589a(KeyEvent keyEvent) {
                keyEvent.dispatch(C0755t.this.f2821t);
            }
        };
        this.f2821t = new KeyEvent.Callback() {
            public boolean onKeyDown(int i, KeyEvent keyEvent) {
                if (C0755t.m3938a(i)) {
                    return C0755t.this.f2814b.mo2616a(i, keyEvent);
                }
                return false;
            }

            public boolean onKeyLongPress(int i, KeyEvent keyEvent) {
                return false;
            }

            public boolean onKeyMultiple(int i, int i2, KeyEvent keyEvent) {
                return false;
            }

            public boolean onKeyUp(int i, KeyEvent keyEvent) {
                if (C0755t.m3938a(i)) {
                    return C0755t.this.f2814b.mo2618b(i, keyEvent);
                }
                return false;
            }
        };
        this.f2813a = activity != null ? activity : view.getContext();
        this.f2814b = wVar;
        this.f2815c = (AudioManager) this.f2813a.getSystemService("audio");
        this.f2816d = activity != null ? activity.getWindow().getDecorView() : view;
        this.f2817e = this.f2816d.getKeyDispatcherState();
        if (Build.VERSION.SDK_INT >= 18) {
            this.f2818f = new C0759v(this.f2813a, this.f2815c, this.f2816d, this.f2820h);
        } else {
            this.f2818f = null;
        }
    }

    @Deprecated
    public C0755t(View view, C0766w wVar) {
        this((Activity) null, view, wVar);
    }

    /* renamed from: a */
    static boolean m3938a(int i) {
        switch (i) {
            case 79:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case f2802i /*126*/:
            case f2803j /*127*/:
            case f2804k /*130*/:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: l */
    private C0767x[] m3939l() {
        if (this.f2819g.size() <= 0) {
            return null;
        }
        C0767x[] xVarArr = new C0767x[this.f2819g.size()];
        this.f2819g.toArray(xVarArr);
        return xVarArr;
    }

    /* renamed from: m */
    private void m3940m() {
        C0767x[] l = m3939l();
        if (l != null) {
            for (C0767x a : l) {
                a.mo2625a(this);
            }
        }
    }

    /* renamed from: n */
    private void m3941n() {
        C0767x[] l = m3939l();
        if (l != null) {
            for (C0767x b : l) {
                b.mo2626b(this);
            }
        }
    }

    /* renamed from: o */
    private void m3942o() {
        if (this.f2818f != null) {
            this.f2818f.mo2595a(this.f2814b.mo2622f(), this.f2814b.mo2621e(), this.f2814b.mo2624h());
        }
    }

    @Deprecated
    /* renamed from: a */
    public void mo2571a() {
        if (this.f2818f != null) {
            this.f2818f.mo2600f();
        }
        this.f2814b.mo2613a();
        m3942o();
        m3940m();
    }

    @Deprecated
    /* renamed from: a */
    public void mo2572a(long j) {
        this.f2814b.mo2615a(j);
    }

    @Deprecated
    /* renamed from: a */
    public void mo2573a(C0767x xVar) {
        this.f2819g.add(xVar);
    }

    @Deprecated
    /* renamed from: a */
    public boolean mo2582a(KeyEvent keyEvent) {
        return keyEvent.dispatch(this.f2821t, (KeyEvent.DispatcherState) this.f2817e, this);
    }

    @Deprecated
    /* renamed from: b */
    public void mo2574b() {
        if (this.f2818f != null) {
            this.f2818f.mo2601g();
        }
        this.f2814b.mo2617b();
        m3942o();
        m3940m();
    }

    @Deprecated
    /* renamed from: b */
    public void mo2575b(C0767x xVar) {
        this.f2819g.remove(xVar);
    }

    @Deprecated
    /* renamed from: c */
    public void mo2576c() {
        if (this.f2818f != null) {
            this.f2818f.mo2602h();
        }
        this.f2814b.mo2619c();
        m3942o();
        m3940m();
    }

    @Deprecated
    /* renamed from: d */
    public long mo2577d() {
        return this.f2814b.mo2620d();
    }

    @Deprecated
    /* renamed from: e */
    public long mo2578e() {
        return this.f2814b.mo2621e();
    }

    @Deprecated
    /* renamed from: f */
    public boolean mo2579f() {
        return this.f2814b.mo2622f();
    }

    @Deprecated
    /* renamed from: g */
    public int mo2580g() {
        return this.f2814b.mo2623g();
    }

    @Deprecated
    /* renamed from: h */
    public int mo2581h() {
        return this.f2814b.mo2624h();
    }

    @Deprecated
    /* renamed from: i */
    public Object mo2583i() {
        if (this.f2818f != null) {
            return this.f2818f.mo2594a();
        }
        return null;
    }

    @Deprecated
    /* renamed from: j */
    public void mo2584j() {
        m3942o();
        m3940m();
        m3941n();
    }

    @Deprecated
    /* renamed from: k */
    public void mo2585k() {
        this.f2818f.mo2596b();
    }
}
