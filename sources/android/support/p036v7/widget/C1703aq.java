package android.support.p036v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.support.annotation.C0003aa;
import android.support.annotation.C0011ag;
import android.support.annotation.C0016ak;
import android.support.annotation.C0027f;
import android.support.annotation.C0047z;
import android.support.p010v4.view.C1023aj;
import android.support.p010v4.view.C1040ar;
import android.support.p010v4.widget.C1214aa;
import android.support.p036v7.p037a.C1359b;
import android.support.p036v7.view.menu.C1573t;
import android.support.p036v7.widget.ActivityChooserView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* renamed from: android.support.v7.widget.aq */
public class C1703aq implements C1573t {

    /* renamed from: a */
    private static final String f5731a = "ListPopupWindow";

    /* renamed from: b */
    private static final boolean f5732b = false;

    /* renamed from: c */
    static final int f5733c = 250;

    /* renamed from: i */
    public static final int f5734i = 0;

    /* renamed from: j */
    public static final int f5735j = 1;

    /* renamed from: k */
    public static final int f5736k = -1;

    /* renamed from: l */
    public static final int f5737l = -2;

    /* renamed from: m */
    public static final int f5738m = 0;

    /* renamed from: n */
    public static final int f5739n = 1;

    /* renamed from: o */
    public static final int f5740o = 2;

    /* renamed from: p */
    private static Method f5741p;

    /* renamed from: q */
    private static Method f5742q;

    /* renamed from: r */
    private static Method f5743r;

    /* renamed from: A */
    private boolean f5744A;

    /* renamed from: B */
    private int f5745B;

    /* renamed from: C */
    private boolean f5746C;

    /* renamed from: D */
    private boolean f5747D;

    /* renamed from: E */
    private View f5748E;

    /* renamed from: F */
    private int f5749F;

    /* renamed from: G */
    private DataSetObserver f5750G;

    /* renamed from: H */
    private View f5751H;

    /* renamed from: I */
    private Drawable f5752I;

    /* renamed from: J */
    private AdapterView.OnItemClickListener f5753J;

    /* renamed from: K */
    private AdapterView.OnItemSelectedListener f5754K;

    /* renamed from: L */
    private final C1710d f5755L;

    /* renamed from: M */
    private final C1709c f5756M;

    /* renamed from: N */
    private final C1707a f5757N;

    /* renamed from: O */
    private Runnable f5758O;

    /* renamed from: P */
    private final Rect f5759P;

    /* renamed from: Q */
    private Rect f5760Q;

    /* renamed from: R */
    private boolean f5761R;

    /* renamed from: d */
    C1684ai f5762d;

    /* renamed from: e */
    int f5763e;

    /* renamed from: f */
    final C1711e f5764f;

    /* renamed from: g */
    final Handler f5765g;

    /* renamed from: h */
    PopupWindow f5766h;

    /* renamed from: s */
    private Context f5767s;

    /* renamed from: t */
    private ListAdapter f5768t;

    /* renamed from: u */
    private int f5769u;

    /* renamed from: v */
    private int f5770v;

    /* renamed from: w */
    private int f5771w;

    /* renamed from: x */
    private int f5772x;

    /* renamed from: y */
    private int f5773y;

    /* renamed from: z */
    private boolean f5774z;

    /* renamed from: android.support.v7.widget.aq$a */
    private class C1707a implements Runnable {
        C1707a() {
        }

        public void run() {
            C1703aq.this.mo6496t();
        }
    }

    /* renamed from: android.support.v7.widget.aq$b */
    private class C1708b extends DataSetObserver {
        C1708b() {
        }

        public void onChanged() {
            if (C1703aq.this.mo5290e()) {
                C1703aq.this.mo5279a();
            }
        }

        public void onInvalidated() {
            C1703aq.this.mo5289d();
        }
    }

    /* renamed from: android.support.v7.widget.aq$c */
    private class C1709c implements AbsListView.OnScrollListener {
        C1709c() {
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (i == 1 && !C1703aq.this.mo6497u() && C1703aq.this.f5766h.getContentView() != null) {
                C1703aq.this.f5765g.removeCallbacks(C1703aq.this.f5764f);
                C1703aq.this.f5764f.run();
            }
        }
    }

    /* renamed from: android.support.v7.widget.aq$d */
    private class C1710d implements View.OnTouchListener {
        C1710d() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && C1703aq.this.f5766h != null && C1703aq.this.f5766h.isShowing() && x >= 0 && x < C1703aq.this.f5766h.getWidth() && y >= 0 && y < C1703aq.this.f5766h.getHeight()) {
                C1703aq.this.f5765g.postDelayed(C1703aq.this.f5764f, 250);
                return false;
            } else if (action != 1) {
                return false;
            } else {
                C1703aq.this.f5765g.removeCallbacks(C1703aq.this.f5764f);
                return false;
            }
        }
    }

    /* renamed from: android.support.v7.widget.aq$e */
    private class C1711e implements Runnable {
        C1711e() {
        }

        public void run() {
            if (C1703aq.this.f5762d != null && C1040ar.m5909ad(C1703aq.this.f5762d) && C1703aq.this.f5762d.getCount() > C1703aq.this.f5762d.getChildCount() && C1703aq.this.f5762d.getChildCount() <= C1703aq.this.f5763e) {
                C1703aq.this.f5766h.setInputMethodMode(2);
                C1703aq.this.mo5279a();
            }
        }
    }

    static {
        Class<PopupWindow> cls = PopupWindow.class;
        try {
            f5741p = cls.getDeclaredMethod("setClipToScreenEnabled", new Class[]{Boolean.TYPE});
        } catch (NoSuchMethodException e) {
            Log.i(f5731a, "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
        }
        Class<PopupWindow> cls2 = PopupWindow.class;
        try {
            f5742q = cls2.getDeclaredMethod("getMaxAvailableHeight", new Class[]{View.class, Integer.TYPE, Boolean.TYPE});
        } catch (NoSuchMethodException e2) {
            Log.i(f5731a, "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
        }
        try {
            f5743r = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", new Class[]{Rect.class});
        } catch (NoSuchMethodException e3) {
            Log.i(f5731a, "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
        }
    }

    public C1703aq(@C0047z Context context) {
        this(context, (AttributeSet) null, C1359b.C1361b.listPopupWindowStyle);
    }

    public C1703aq(@C0047z Context context, @C0003aa AttributeSet attributeSet) {
        this(context, attributeSet, C1359b.C1361b.listPopupWindowStyle);
    }

    public C1703aq(@C0047z Context context, @C0003aa AttributeSet attributeSet, @C0027f int i) {
        this(context, attributeSet, i, 0);
    }

    public C1703aq(@C0047z Context context, @C0003aa AttributeSet attributeSet, @C0027f int i, @C0016ak int i2) {
        this.f5769u = -2;
        this.f5770v = -2;
        this.f5773y = C1023aj.f3436d;
        this.f5744A = true;
        this.f5745B = 0;
        this.f5746C = false;
        this.f5747D = false;
        this.f5763e = ActivityChooserView.C1593a.f5166a;
        this.f5749F = 0;
        this.f5764f = new C1711e();
        this.f5755L = new C1710d();
        this.f5756M = new C1709c();
        this.f5757N = new C1707a();
        this.f5759P = new Rect();
        this.f5767s = context;
        this.f5765g = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1359b.C1371l.ListPopupWindow, i, i2);
        this.f5771w = obtainStyledAttributes.getDimensionPixelOffset(C1359b.C1371l.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        this.f5772x = obtainStyledAttributes.getDimensionPixelOffset(C1359b.C1371l.ListPopupWindow_android_dropDownVerticalOffset, 0);
        if (this.f5772x != 0) {
            this.f5774z = true;
        }
        obtainStyledAttributes.recycle();
        if (Build.VERSION.SDK_INT >= 11) {
            this.f5766h = new C1859s(context, attributeSet, i, i2);
        } else {
            this.f5766h = new C1859s(context, attributeSet, i);
        }
        this.f5766h.setInputMethodMode(1);
    }

    /* renamed from: a */
    private int m10190a(View view, int i, boolean z) {
        if (f5742q != null) {
            try {
                return ((Integer) f5742q.invoke(this.f5766h, new Object[]{view, Integer.valueOf(i), Boolean.valueOf(z)})).intValue();
            } catch (Exception e) {
                Log.i(f5731a, "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
            }
        }
        return this.f5766h.getMaxAvailableHeight(view, i);
    }

    /* renamed from: b */
    private void mo7542b() {
        if (this.f5748E != null) {
            ViewParent parent = this.f5748E.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f5748E);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v15, resolved type: android.support.v7.widget.ai} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v16, resolved type: android.support.v7.widget.ai} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: android.widget.LinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v22, resolved type: android.support.v7.widget.ai} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int mo7543c() {
        /*
            r10 = this;
            r9 = 1073741824(0x40000000, float:2.0)
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = -1
            r1 = 1
            r2 = 0
            android.support.v7.widget.ai r0 = r10.f5762d
            if (r0 != 0) goto L_0x010c
            android.content.Context r5 = r10.f5767s
            android.support.v7.widget.aq$2 r0 = new android.support.v7.widget.aq$2
            r0.<init>()
            r10.f5758O = r0
            boolean r0 = r10.f5761R
            if (r0 != 0) goto L_0x00f8
            r0 = r1
        L_0x0019:
            android.support.v7.widget.ai r0 = r10.mo6452a((android.content.Context) r5, (boolean) r0)
            r10.f5762d = r0
            android.graphics.drawable.Drawable r0 = r10.f5752I
            if (r0 == 0) goto L_0x002a
            android.support.v7.widget.ai r0 = r10.f5762d
            android.graphics.drawable.Drawable r6 = r10.f5752I
            r0.setSelector(r6)
        L_0x002a:
            android.support.v7.widget.ai r0 = r10.f5762d
            android.widget.ListAdapter r6 = r10.f5768t
            r0.setAdapter(r6)
            android.support.v7.widget.ai r0 = r10.f5762d
            android.widget.AdapterView$OnItemClickListener r6 = r10.f5753J
            r0.setOnItemClickListener(r6)
            android.support.v7.widget.ai r0 = r10.f5762d
            r0.setFocusable(r1)
            android.support.v7.widget.ai r0 = r10.f5762d
            r0.setFocusableInTouchMode(r1)
            android.support.v7.widget.ai r0 = r10.f5762d
            android.support.v7.widget.aq$3 r6 = new android.support.v7.widget.aq$3
            r6.<init>()
            r0.setOnItemSelectedListener(r6)
            android.support.v7.widget.ai r0 = r10.f5762d
            android.support.v7.widget.aq$c r6 = r10.f5756M
            r0.setOnScrollListener(r6)
            android.widget.AdapterView$OnItemSelectedListener r0 = r10.f5754K
            if (r0 == 0) goto L_0x005e
            android.support.v7.widget.ai r0 = r10.f5762d
            android.widget.AdapterView$OnItemSelectedListener r6 = r10.f5754K
            r0.setOnItemSelectedListener(r6)
        L_0x005e:
            android.support.v7.widget.ai r0 = r10.f5762d
            android.view.View r7 = r10.f5748E
            if (r7 == 0) goto L_0x0196
            android.widget.LinearLayout r6 = new android.widget.LinearLayout
            r6.<init>(r5)
            r6.setOrientation(r1)
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r8 = 1065353216(0x3f800000, float:1.0)
            r5.<init>(r3, r2, r8)
            int r8 = r10.f5749F
            switch(r8) {
                case 0: goto L_0x0102;
                case 1: goto L_0x00fb;
                default: goto L_0x0078;
            }
        L_0x0078:
            java.lang.String r0 = "ListPopupWindow"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r8 = "Invalid hint position "
            java.lang.StringBuilder r5 = r5.append(r8)
            int r8 = r10.f5749F
            java.lang.StringBuilder r5 = r5.append(r8)
            java.lang.String r5 = r5.toString()
            android.util.Log.e(r0, r5)
        L_0x0092:
            int r0 = r10.f5770v
            if (r0 < 0) goto L_0x0109
            int r0 = r10.f5770v
            r5 = r0
            r0 = r4
        L_0x009a:
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r0)
            r7.measure(r0, r2)
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            int r5 = r7.getMeasuredHeight()
            int r7 = r0.topMargin
            int r5 = r5 + r7
            int r0 = r0.bottomMargin
            int r0 = r0 + r5
            r5 = r6
        L_0x00b2:
            android.widget.PopupWindow r6 = r10.f5766h
            r6.setContentView(r5)
            r6 = r0
        L_0x00b8:
            android.widget.PopupWindow r0 = r10.f5766h
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            if (r0 == 0) goto L_0x012a
            android.graphics.Rect r5 = r10.f5759P
            r0.getPadding(r5)
            android.graphics.Rect r0 = r10.f5759P
            int r0 = r0.top
            android.graphics.Rect r5 = r10.f5759P
            int r5 = r5.bottom
            int r0 = r0 + r5
            boolean r5 = r10.f5774z
            if (r5 != 0) goto L_0x0190
            android.graphics.Rect r5 = r10.f5759P
            int r5 = r5.top
            int r5 = -r5
            r10.f5772x = r5
            r7 = r0
        L_0x00da:
            android.widget.PopupWindow r0 = r10.f5766h
            int r0 = r0.getInputMethodMode()
            r5 = 2
            if (r0 != r5) goto L_0x0131
        L_0x00e3:
            android.view.View r0 = r10.mo6487m()
            int r5 = r10.f5772x
            int r5 = r10.m10190a(r0, r5, r1)
            boolean r0 = r10.f5746C
            if (r0 != 0) goto L_0x00f5
            int r0 = r10.f5769u
            if (r0 != r3) goto L_0x0133
        L_0x00f5:
            int r0 = r5 + r7
        L_0x00f7:
            return r0
        L_0x00f8:
            r0 = r2
            goto L_0x0019
        L_0x00fb:
            r6.addView(r0, r5)
            r6.addView(r7)
            goto L_0x0092
        L_0x0102:
            r6.addView(r7)
            r6.addView(r0, r5)
            goto L_0x0092
        L_0x0109:
            r0 = r2
            r5 = r2
            goto L_0x009a
        L_0x010c:
            android.widget.PopupWindow r0 = r10.f5766h
            android.view.View r0 = r0.getContentView()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View r5 = r10.f5748E
            if (r5 == 0) goto L_0x0193
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            int r5 = r5.getMeasuredHeight()
            int r6 = r0.topMargin
            int r5 = r5 + r6
            int r0 = r0.bottomMargin
            int r0 = r0 + r5
            r6 = r0
            goto L_0x00b8
        L_0x012a:
            android.graphics.Rect r0 = r10.f5759P
            r0.setEmpty()
            r7 = r2
            goto L_0x00da
        L_0x0131:
            r1 = r2
            goto L_0x00e3
        L_0x0133:
            int r0 = r10.f5770v
            switch(r0) {
                case -2: goto L_0x015a;
                case -1: goto L_0x0175;
                default: goto L_0x0138;
            }
        L_0x0138:
            int r0 = r10.f5770v
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r9)
        L_0x013e:
            android.support.v7.widget.ai r0 = r10.f5762d
            int r4 = r5 - r6
            r5 = r3
            int r0 = r0.mo6513a(r1, r2, r3, r4, r5)
            if (r0 <= 0) goto L_0x0158
            android.support.v7.widget.ai r1 = r10.f5762d
            int r1 = r1.getPaddingTop()
            android.support.v7.widget.ai r2 = r10.f5762d
            int r2 = r2.getPaddingBottom()
            int r1 = r1 + r2
            int r1 = r1 + r7
            int r6 = r6 + r1
        L_0x0158:
            int r0 = r0 + r6
            goto L_0x00f7
        L_0x015a:
            android.content.Context r0 = r10.f5767s
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.widthPixels
            android.graphics.Rect r1 = r10.f5759P
            int r1 = r1.left
            android.graphics.Rect r8 = r10.f5759P
            int r8 = r8.right
            int r1 = r1 + r8
            int r0 = r0 - r1
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r4)
            goto L_0x013e
        L_0x0175:
            android.content.Context r0 = r10.f5767s
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.widthPixels
            android.graphics.Rect r1 = r10.f5759P
            int r1 = r1.left
            android.graphics.Rect r4 = r10.f5759P
            int r4 = r4.right
            int r1 = r1 + r4
            int r0 = r0 - r1
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r9)
            goto L_0x013e
        L_0x0190:
            r7 = r0
            goto L_0x00da
        L_0x0193:
            r6 = r2
            goto L_0x00b8
        L_0x0196:
            r5 = r0
            r0 = r2
            goto L_0x00b2
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p036v7.widget.C1703aq.mo7543c():int");
    }

    /* renamed from: d */
    private void mo6530d(boolean z) {
        if (f5741p != null) {
            try {
                f5741p.invoke(this.f5766h, new Object[]{Boolean.valueOf(z)});
            } catch (Exception e) {
                Log.i(f5731a, "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
    }

    /* renamed from: o */
    private static boolean m10194o(int i) {
        return i == 66 || i == 23;
    }

    /* access modifiers changed from: package-private */
    @C0047z
    /* renamed from: a */
    public C1684ai mo6452a(Context context, boolean z) {
        return new C1684ai(context, z);
    }

    /* renamed from: a */
    public void mo5279a() {
        int i;
        boolean z = true;
        boolean z2 = false;
        int i2 = -1;
        int c = mo7543c();
        boolean u = mo6497u();
        C1214aa.m7229a(this.f5766h, this.f5773y);
        if (this.f5766h.isShowing()) {
            int width = this.f5770v == -1 ? -1 : this.f5770v == -2 ? mo6487m().getWidth() : this.f5770v;
            if (this.f5769u == -1) {
                if (!u) {
                    c = -1;
                }
                if (u) {
                    this.f5766h.setWidth(this.f5770v == -1 ? -1 : 0);
                    this.f5766h.setHeight(0);
                    i = c;
                } else {
                    this.f5766h.setWidth(this.f5770v == -1 ? -1 : 0);
                    this.f5766h.setHeight(-1);
                    i = c;
                }
            } else {
                i = this.f5769u == -2 ? c : this.f5769u;
            }
            PopupWindow popupWindow = this.f5766h;
            if (!this.f5747D && !this.f5746C) {
                z2 = true;
            }
            popupWindow.setOutsideTouchable(z2);
            PopupWindow popupWindow2 = this.f5766h;
            View m = mo6487m();
            int i3 = this.f5771w;
            int i4 = this.f5772x;
            if (width < 0) {
                width = -1;
            }
            if (i >= 0) {
                i2 = i;
            }
            popupWindow2.update(m, i3, i4, width, i2);
            return;
        }
        int width2 = this.f5770v == -1 ? -1 : this.f5770v == -2 ? mo6487m().getWidth() : this.f5770v;
        if (this.f5769u == -1) {
            c = -1;
        } else if (this.f5769u != -2) {
            c = this.f5769u;
        }
        this.f5766h.setWidth(width2);
        this.f5766h.setHeight(c);
        mo6530d(true);
        PopupWindow popupWindow3 = this.f5766h;
        if (this.f5747D || this.f5746C) {
            z = false;
        }
        popupWindow3.setOutsideTouchable(z);
        this.f5766h.setTouchInterceptor(this.f5755L);
        if (f5743r != null) {
            try {
                f5743r.invoke(this.f5766h, new Object[]{this.f5760Q});
            } catch (Exception e) {
                Log.e(f5731a, "Could not invoke setEpicenterBounds on PopupWindow", e);
            }
        }
        C1214aa.m7230a(this.f5766h, mo6487m(), this.f5771w, this.f5772x, this.f5745B);
        this.f5762d.setSelection(-1);
        if (!this.f5761R || this.f5762d.isInTouchMode()) {
            mo6496t();
        }
        if (!this.f5761R) {
            this.f5765g.post(this.f5757N);
        }
    }

    /* renamed from: a */
    public void mo6453a(int i) {
        this.f5749F = i;
    }

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    /* renamed from: a */
    public void mo6454a(Rect rect) {
        this.f5760Q = rect;
    }

    /* renamed from: a */
    public void mo6455a(Drawable drawable) {
        this.f5752I = drawable;
    }

    /* renamed from: a */
    public void mo6456a(@C0003aa AdapterView.OnItemClickListener onItemClickListener) {
        this.f5753J = onItemClickListener;
    }

    /* renamed from: a */
    public void mo6457a(@C0003aa AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.f5754K = onItemSelectedListener;
    }

    /* renamed from: a */
    public void mo6458a(@C0003aa ListAdapter listAdapter) {
        if (this.f5750G == null) {
            this.f5750G = new C1708b();
        } else if (this.f5768t != null) {
            this.f5768t.unregisterDataSetObserver(this.f5750G);
        }
        this.f5768t = listAdapter;
        if (this.f5768t != null) {
            listAdapter.registerDataSetObserver(this.f5750G);
        }
        if (this.f5762d != null) {
            this.f5762d.setAdapter(this.f5768t);
        }
    }

    /* renamed from: a */
    public void mo6459a(@C0003aa PopupWindow.OnDismissListener onDismissListener) {
        this.f5766h.setOnDismissListener(onDismissListener);
    }

    /* renamed from: a */
    public void mo6460a(boolean z) {
        this.f5761R = z;
        this.f5766h.setFocusable(z);
    }

    /* renamed from: a */
    public boolean mo6461a(int i, @C0047z KeyEvent keyEvent) {
        if (mo5290e() && i != 62 && (this.f5762d.getSelectedItemPosition() >= 0 || !m10194o(i))) {
            int selectedItemPosition = this.f5762d.getSelectedItemPosition();
            boolean z = !this.f5766h.isAboveAnchor();
            ListAdapter listAdapter = this.f5768t;
            int i2 = ActivityChooserView.C1593a.f5166a;
            int i3 = Integer.MIN_VALUE;
            if (listAdapter != null) {
                boolean areAllItemsEnabled = listAdapter.areAllItemsEnabled();
                i2 = areAllItemsEnabled ? 0 : this.f5762d.mo6514a(0, true);
                i3 = areAllItemsEnabled ? listAdapter.getCount() - 1 : this.f5762d.mo6514a(listAdapter.getCount() - 1, false);
            }
            if ((!z || i != 19 || selectedItemPosition > i2) && (z || i != 20 || selectedItemPosition < i3)) {
                this.f5762d.setListSelectionHidden(false);
                if (this.f5762d.onKeyDown(i, keyEvent)) {
                    this.f5766h.setInputMethodMode(2);
                    this.f5762d.requestFocusFromTouch();
                    mo5279a();
                    switch (i) {
                        case 19:
                        case 20:
                        case 23:
                        case 66:
                            return true;
                    }
                } else if (!z || i != 20) {
                    if (!z && i == 19 && selectedItemPosition == i2) {
                        return true;
                    }
                } else if (selectedItemPosition == i3) {
                    return true;
                }
            } else {
                mo6496t();
                this.f5766h.setInputMethodMode(1);
                mo5279a();
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public void mo6462b(int i) {
        this.f5766h.setSoftInputMode(i);
    }

    /* renamed from: b */
    public void mo6463b(@C0003aa Drawable drawable) {
        this.f5766h.setBackgroundDrawable(drawable);
    }

    /* renamed from: b */
    public void mo6464b(@C0003aa View view) {
        this.f5751H = view;
    }

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    /* renamed from: b */
    public void mo6465b(boolean z) {
        this.f5747D = z;
    }

    /* renamed from: b */
    public boolean mo6466b(int i, @C0047z KeyEvent keyEvent) {
        if (!mo5290e() || this.f5762d.getSelectedItemPosition() < 0) {
            return false;
        }
        boolean onKeyUp = this.f5762d.onKeyUp(i, keyEvent);
        if (!onKeyUp || !m10194o(i)) {
            return onKeyUp;
        }
        mo5289d();
        return onKeyUp;
    }

    /* renamed from: c */
    public void mo6467c(@C0016ak int i) {
        this.f5766h.setAnimationStyle(i);
    }

    /* renamed from: c */
    public void mo6468c(@C0003aa View view) {
        boolean e = mo5290e();
        if (e) {
            mo7542b();
        }
        this.f5748E = view;
        if (e) {
            mo5279a();
        }
    }

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    /* renamed from: c */
    public void mo6469c(boolean z) {
        this.f5746C = z;
    }

    /* renamed from: c */
    public boolean mo6470c(int i, @C0047z KeyEvent keyEvent) {
        if (i == 4 && mo5290e()) {
            View view = this.f5751H;
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState = view.getKeyDispatcherState();
                if (keyDispatcherState == null) {
                    return true;
                }
                keyDispatcherState.startTracking(keyEvent, this);
                return true;
            } else if (keyEvent.getAction() == 1) {
                KeyEvent.DispatcherState keyDispatcherState2 = view.getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.handleUpEvent(keyEvent);
                }
                if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                    mo5289d();
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: d */
    public View.OnTouchListener mo6471d(View view) {
        return new C1687ak(view) {
            /* renamed from: e */
            public C1703aq mo5206a() {
                return C1703aq.this;
            }
        };
    }

    /* renamed from: d */
    public void mo5289d() {
        this.f5766h.dismiss();
        mo7542b();
        this.f5766h.setContentView((View) null);
        this.f5762d = null;
        this.f5765g.removeCallbacks(this.f5764f);
    }

    /* renamed from: d */
    public void mo6472d(int i) {
        this.f5771w = i;
    }

    /* renamed from: e */
    public void mo6473e(int i) {
        this.f5772x = i;
        this.f5774z = true;
    }

    /* renamed from: e */
    public boolean mo5290e() {
        return this.f5766h.isShowing();
    }

    /* renamed from: f */
    public int mo6474f() {
        return this.f5749F;
    }

    /* renamed from: f */
    public void mo6475f(int i) {
        this.f5745B = i;
    }

    @C0003aa
    /* renamed from: g */
    public ListView mo5292g() {
        return this.f5762d;
    }

    /* renamed from: g */
    public void mo6476g(int i) {
        this.f5770v = i;
    }

    /* renamed from: h */
    public void mo6477h(int i) {
        Drawable background = this.f5766h.getBackground();
        if (background != null) {
            background.getPadding(this.f5759P);
            this.f5770v = this.f5759P.left + this.f5759P.right + i;
            return;
        }
        mo6476g(i);
    }

    /* renamed from: h */
    public boolean mo6478h() {
        return this.f5761R;
    }

    /* renamed from: i */
    public void mo6479i(int i) {
        this.f5769u = i;
    }

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    /* renamed from: i */
    public boolean mo6480i() {
        return this.f5746C;
    }

    /* renamed from: j */
    public int mo6481j() {
        return this.f5766h.getSoftInputMode();
    }

    /* renamed from: j */
    public void mo6482j(int i) {
        this.f5773y = i;
    }

    @C0003aa
    /* renamed from: k */
    public Drawable mo6483k() {
        return this.f5766h.getBackground();
    }

    /* renamed from: k */
    public void mo6484k(int i) {
        this.f5766h.setInputMethodMode(i);
    }

    @C0016ak
    /* renamed from: l */
    public int mo6485l() {
        return this.f5766h.getAnimationStyle();
    }

    /* renamed from: l */
    public void mo6486l(int i) {
        C1684ai aiVar = this.f5762d;
        if (mo5290e() && aiVar != null) {
            aiVar.setListSelectionHidden(false);
            aiVar.setSelection(i);
            if (Build.VERSION.SDK_INT >= 11 && aiVar.getChoiceMode() != 0) {
                aiVar.setItemChecked(i, true);
            }
        }
    }

    @C0003aa
    /* renamed from: m */
    public View mo6487m() {
        return this.f5751H;
    }

    /* renamed from: m */
    public boolean mo6488m(int i) {
        if (!mo5290e()) {
            return false;
        }
        if (this.f5753J != null) {
            C1684ai aiVar = this.f5762d;
            View childAt = aiVar.getChildAt(i - aiVar.getFirstVisiblePosition());
            ListAdapter adapter = aiVar.getAdapter();
            this.f5753J.onItemClick(aiVar, childAt, i, adapter.getItemId(i));
        }
        return true;
    }

    /* renamed from: n */
    public int mo6489n() {
        return this.f5771w;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo6490n(int i) {
        this.f5763e = i;
    }

    /* renamed from: o */
    public int mo6491o() {
        if (!this.f5774z) {
            return 0;
        }
        return this.f5772x;
    }

    /* renamed from: p */
    public int mo6492p() {
        return this.f5770v;
    }

    /* renamed from: q */
    public int mo6493q() {
        return this.f5769u;
    }

    /* renamed from: r */
    public void mo6494r() {
        this.f5765g.post(this.f5758O);
    }

    /* renamed from: s */
    public int mo6495s() {
        return this.f5766h.getInputMethodMode();
    }

    /* renamed from: t */
    public void mo6496t() {
        C1684ai aiVar = this.f5762d;
        if (aiVar != null) {
            aiVar.setListSelectionHidden(true);
            aiVar.requestLayout();
        }
    }

    /* renamed from: u */
    public boolean mo6497u() {
        return this.f5766h.getInputMethodMode() == 2;
    }

    @C0003aa
    /* renamed from: v */
    public Object mo6498v() {
        if (!mo5290e()) {
            return null;
        }
        return this.f5762d.getSelectedItem();
    }

    /* renamed from: w */
    public int mo6499w() {
        if (!mo5290e()) {
            return -1;
        }
        return this.f5762d.getSelectedItemPosition();
    }

    /* renamed from: x */
    public long mo6500x() {
        if (!mo5290e()) {
            return Long.MIN_VALUE;
        }
        return this.f5762d.getSelectedItemId();
    }

    @C0003aa
    /* renamed from: y */
    public View mo6501y() {
        if (!mo5290e()) {
            return null;
        }
        return this.f5762d.getSelectedView();
    }
}
