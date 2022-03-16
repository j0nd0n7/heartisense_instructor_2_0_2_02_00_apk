package android.support.p036v7.app;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.C0003aa;
import android.support.annotation.C0007ae;
import android.support.annotation.C0039r;
import android.support.annotation.C0047z;
import android.support.p010v4.p013c.C0251ax;
import android.support.p010v4.p028k.C0808j;
import android.support.p010v4.p028k.C0810k;
import android.support.p010v4.view.C1011ae;
import android.support.p010v4.view.C1023aj;
import android.support.p010v4.view.C1040ar;
import android.support.p010v4.view.C1086bd;
import android.support.p010v4.view.C1112bo;
import android.support.p010v4.view.C1130bu;
import android.support.p010v4.view.C1131bv;
import android.support.p010v4.view.C1134by;
import android.support.p010v4.view.C1172m;
import android.support.p010v4.view.C1182q;
import android.support.p010v4.widget.C1214aa;
import android.support.p036v7.p037a.C1359b;
import android.support.p036v7.p038b.p039a.C1477b;
import android.support.p036v7.view.C1522b;
import android.support.p036v7.view.C1525d;
import android.support.p036v7.view.C1526e;
import android.support.p036v7.view.menu.C1547f;
import android.support.p036v7.view.menu.C1550h;
import android.support.p036v7.view.menu.C1567p;
import android.support.p036v7.view.menu.C1569q;
import android.support.p036v7.widget.ActionBarContextView;
import android.support.p036v7.widget.C1668ad;
import android.support.p036v7.widget.C1685aj;
import android.support.p036v7.widget.C1811br;
import android.support.p036v7.widget.C1819bu;
import android.support.p036v7.widget.C1849m;
import android.support.p036v7.widget.ContentFrameLayout;
import android.support.p036v7.widget.Toolbar;
import android.support.p036v7.widget.ViewStubCompat;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import org.xmlpull.v1.XmlPullParser;

@C0007ae(mo1a = 9)
@TargetApi(9)
/* renamed from: android.support.v7.app.n */
class C1432n extends C1419i implements C1182q, C1550h.C1551a {

    /* renamed from: E */
    private static final boolean f4465E = (Build.VERSION.SDK_INT < 21);

    /* renamed from: A */
    Runnable f4466A;

    /* renamed from: B */
    C1112bo f4467B = null;

    /* renamed from: C */
    boolean f4468C;

    /* renamed from: D */
    int f4469D;

    /* renamed from: F */
    private C1668ad f4470F;

    /* renamed from: G */
    private C1440a f4471G;

    /* renamed from: H */
    private C1447e f4472H;

    /* renamed from: I */
    private boolean f4473I;

    /* renamed from: J */
    private ViewGroup f4474J;

    /* renamed from: K */
    private TextView f4475K;

    /* renamed from: L */
    private View f4476L;

    /* renamed from: M */
    private boolean f4477M;

    /* renamed from: N */
    private boolean f4478N;

    /* renamed from: O */
    private boolean f4479O;

    /* renamed from: P */
    private C1444d[] f4480P;

    /* renamed from: Q */
    private C1444d f4481Q;

    /* renamed from: R */
    private boolean f4482R;

    /* renamed from: S */
    private final Runnable f4483S = new Runnable() {
        public void run() {
            if ((C1432n.this.f4469D & 1) != 0) {
                C1432n.this.mo4920i(0);
            }
            if ((C1432n.this.f4469D & 4096) != 0) {
                C1432n.this.mo4920i(108);
            }
            C1432n.this.f4468C = false;
            C1432n.this.f4469D = 0;
        }
    };

    /* renamed from: T */
    private boolean f4484T;

    /* renamed from: U */
    private Rect f4485U;

    /* renamed from: V */
    private Rect f4486V;

    /* renamed from: W */
    private C1450q f4487W;

    /* renamed from: x */
    C1522b f4488x;

    /* renamed from: y */
    ActionBarContextView f4489y;

    /* renamed from: z */
    PopupWindow f4490z;

    /* renamed from: android.support.v7.app.n$a */
    private final class C1440a implements C1567p.C1568a {
        C1440a() {
        }

        /* renamed from: a */
        public void mo4932a(C1550h hVar, boolean z) {
            C1432n.this.mo4916b(hVar);
        }

        /* renamed from: a */
        public boolean mo4933a(C1550h hVar) {
            Window.Callback s = C1432n.this.mo4889s();
            if (s == null) {
                return true;
            }
            s.onMenuOpened(108, hVar);
            return true;
        }
    }

    /* renamed from: android.support.v7.app.n$b */
    class C1441b implements C1522b.C1523a {

        /* renamed from: b */
        private C1522b.C1523a f4500b;

        public C1441b(C1522b.C1523a aVar) {
            this.f4500b = aVar;
        }

        /* renamed from: a */
        public void mo4934a(C1522b bVar) {
            this.f4500b.mo4934a(bVar);
            if (C1432n.this.f4490z != null) {
                C1432n.this.f4436m.getDecorView().removeCallbacks(C1432n.this.f4466A);
            }
            if (C1432n.this.f4489y != null) {
                C1432n.this.mo4923w();
                C1432n.this.f4467B = C1040ar.m5851A(C1432n.this.f4489y).mo3818a(0.0f);
                C1432n.this.f4467B.mo3820a((C1130bu) new C1131bv() {
                    /* renamed from: b */
                    public void mo3894b(View view) {
                        C1432n.this.f4489y.setVisibility(8);
                        if (C1432n.this.f4490z != null) {
                            C1432n.this.f4490z.dismiss();
                        } else if (C1432n.this.f4489y.getParent() instanceof View) {
                            C1040ar.m5865O((View) C1432n.this.f4489y.getParent());
                        }
                        C1432n.this.f4489y.removeAllViews();
                        C1432n.this.f4467B.mo3820a((C1130bu) null);
                        C1432n.this.f4467B = null;
                    }
                });
            }
            if (C1432n.this.f4439p != null) {
                C1432n.this.f4439p.mo4826b(C1432n.this.f4488x);
            }
            C1432n.this.f4488x = null;
        }

        /* renamed from: a */
        public boolean mo4935a(C1522b bVar, Menu menu) {
            return this.f4500b.mo4935a(bVar, menu);
        }

        /* renamed from: a */
        public boolean mo4936a(C1522b bVar, MenuItem menuItem) {
            return this.f4500b.mo4936a(bVar, menuItem);
        }

        /* renamed from: b */
        public boolean mo4937b(C1522b bVar, Menu menu) {
            return this.f4500b.mo4937b(bVar, menu);
        }
    }

    /* renamed from: android.support.v7.app.n$c */
    private class C1443c extends ContentFrameLayout {
        public C1443c(Context context) {
            super(context);
        }

        /* renamed from: a */
        private boolean m8505a(int i, int i2) {
            return i < -5 || i2 < -5 || i > getWidth() + 5 || i2 > getHeight() + 5;
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return C1432n.this.mo4880a(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !m8505a((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            C1432n.this.mo4919h(0);
            return true;
        }

        public void setBackgroundResource(int i) {
            setBackgroundDrawable(C1477b.m8692b(getContext(), i));
        }
    }

    /* renamed from: android.support.v7.app.n$d */
    protected static final class C1444d {

        /* renamed from: a */
        int f4503a;

        /* renamed from: b */
        int f4504b;

        /* renamed from: c */
        int f4505c;

        /* renamed from: d */
        int f4506d;

        /* renamed from: e */
        int f4507e;

        /* renamed from: f */
        int f4508f;

        /* renamed from: g */
        ViewGroup f4509g;

        /* renamed from: h */
        View f4510h;

        /* renamed from: i */
        View f4511i;

        /* renamed from: j */
        C1550h f4512j;

        /* renamed from: k */
        C1547f f4513k;

        /* renamed from: l */
        Context f4514l;

        /* renamed from: m */
        boolean f4515m;

        /* renamed from: n */
        boolean f4516n;

        /* renamed from: o */
        boolean f4517o;

        /* renamed from: p */
        public boolean f4518p;

        /* renamed from: q */
        boolean f4519q = false;

        /* renamed from: r */
        boolean f4520r;

        /* renamed from: s */
        boolean f4521s;

        /* renamed from: t */
        Bundle f4522t;

        /* renamed from: u */
        Bundle f4523u;

        /* renamed from: android.support.v7.app.n$d$a */
        private static class C1445a implements Parcelable {
            public static final Parcelable.Creator<C1445a> CREATOR = C0808j.m4090a(new C0810k<C1445a>() {
                /* renamed from: b */
                public C1445a mo2679a(Parcel parcel, ClassLoader classLoader) {
                    return C1445a.m8514a(parcel, classLoader);
                }

                /* renamed from: b */
                public C1445a[] mo2680a(int i) {
                    return new C1445a[i];
                }
            });

            /* renamed from: a */
            int f4524a;

            /* renamed from: b */
            boolean f4525b;

            /* renamed from: c */
            Bundle f4526c;

            C1445a() {
            }

            /* renamed from: a */
            static C1445a m8514a(Parcel parcel, ClassLoader classLoader) {
                boolean z = true;
                C1445a aVar = new C1445a();
                aVar.f4524a = parcel.readInt();
                if (parcel.readInt() != 1) {
                    z = false;
                }
                aVar.f4525b = z;
                if (aVar.f4525b) {
                    aVar.f4526c = parcel.readBundle(classLoader);
                }
                return aVar;
            }

            public int describeContents() {
                return 0;
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f4524a);
                parcel.writeInt(this.f4525b ? 1 : 0);
                if (this.f4525b) {
                    parcel.writeBundle(this.f4526c);
                }
            }
        }

        C1444d(int i) {
            this.f4503a = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C1569q mo4941a(C1567p.C1568a aVar) {
            if (this.f4512j == null) {
                return null;
            }
            if (this.f4513k == null) {
                this.f4513k = new C1547f(this.f4514l, C1359b.C1368i.abc_list_menu_item_layout);
                this.f4513k.mo5262a(aVar);
                this.f4512j.mo5336a((C1567p) this.f4513k);
            }
            return this.f4513k.mo5256a(this.f4509g);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4942a(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(C1359b.C1361b.actionBarPopupTheme, typedValue, true);
            if (typedValue.resourceId != 0) {
                newTheme.applyStyle(typedValue.resourceId, true);
            }
            newTheme.resolveAttribute(C1359b.C1361b.panelMenuListTheme, typedValue, true);
            if (typedValue.resourceId != 0) {
                newTheme.applyStyle(typedValue.resourceId, true);
            } else {
                newTheme.applyStyle(C1359b.C1370k.Theme_AppCompat_CompactMenu, true);
            }
            C1525d dVar = new C1525d(context, 0);
            dVar.getTheme().setTo(newTheme);
            this.f4514l = dVar;
            TypedArray obtainStyledAttributes = dVar.obtainStyledAttributes(C1359b.C1371l.AppCompatTheme);
            this.f4504b = obtainStyledAttributes.getResourceId(C1359b.C1371l.AppCompatTheme_panelBackground, 0);
            this.f4508f = obtainStyledAttributes.getResourceId(C1359b.C1371l.AppCompatTheme_android_windowAnimationStyle, 0);
            obtainStyledAttributes.recycle();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4943a(Parcelable parcelable) {
            C1445a aVar = (C1445a) parcelable;
            this.f4503a = aVar.f4524a;
            this.f4521s = aVar.f4525b;
            this.f4522t = aVar.f4526c;
            this.f4510h = null;
            this.f4509g = null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4944a(C1550h hVar) {
            if (hVar != this.f4512j) {
                if (this.f4512j != null) {
                    this.f4512j.mo5358b((C1567p) this.f4513k);
                }
                this.f4512j = hVar;
                if (hVar != null && this.f4513k != null) {
                    hVar.mo5336a((C1567p) this.f4513k);
                }
            }
        }

        /* renamed from: a */
        public boolean mo4945a() {
            if (this.f4510h == null) {
                return false;
            }
            return this.f4511i != null || this.f4513k.mo5301a().getCount() > 0;
        }

        /* renamed from: b */
        public void mo4946b() {
            if (this.f4512j != null) {
                this.f4512j.mo5358b((C1567p) this.f4513k);
            }
            this.f4513k = null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public Parcelable mo4947c() {
            C1445a aVar = new C1445a();
            aVar.f4524a = this.f4503a;
            aVar.f4525b = this.f4517o;
            if (this.f4512j != null) {
                aVar.f4526c = new Bundle();
                this.f4512j.mo5333a(aVar.f4526c);
            }
            return aVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo4948d() {
            if (this.f4512j != null && this.f4522t != null) {
                this.f4512j.mo5356b(this.f4522t);
                this.f4522t = null;
            }
        }
    }

    /* renamed from: android.support.v7.app.n$e */
    private final class C1447e implements C1567p.C1568a {
        C1447e() {
        }

        /* renamed from: a */
        public void mo4932a(C1550h hVar, boolean z) {
            C1550h q = hVar.mo5394q();
            boolean z2 = q != hVar;
            C1432n nVar = C1432n.this;
            if (z2) {
                hVar = q;
            }
            C1444d a = nVar.mo4912a((Menu) hVar);
            if (a == null) {
                return;
            }
            if (z2) {
                C1432n.this.mo4913a(a.f4503a, a, q);
                C1432n.this.mo4914a(a, true);
                return;
            }
            C1432n.this.mo4914a(a, z);
        }

        /* renamed from: a */
        public boolean mo4933a(C1550h hVar) {
            Window.Callback s;
            if (hVar != null || !C1432n.this.f4442s || (s = C1432n.this.mo4889s()) == null || C1432n.this.mo4887q()) {
                return true;
            }
            s.onMenuOpened(108, hVar);
            return true;
        }
    }

    C1432n(Context context, Window window, C1416g gVar) {
        super(context, window, gVar);
    }

    /* renamed from: A */
    private ViewGroup m8429A() {
        ViewGroup viewGroup;
        TypedArray obtainStyledAttributes = this.f4435l.obtainStyledAttributes(C1359b.C1371l.AppCompatTheme);
        if (!obtainStyledAttributes.hasValue(C1359b.C1371l.AppCompatTheme_windowActionBar)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (obtainStyledAttributes.getBoolean(C1359b.C1371l.AppCompatTheme_windowNoTitle, false)) {
            mo4866c(1);
        } else if (obtainStyledAttributes.getBoolean(C1359b.C1371l.AppCompatTheme_windowActionBar, false)) {
            mo4866c(108);
        }
        if (obtainStyledAttributes.getBoolean(C1359b.C1371l.AppCompatTheme_windowActionBarOverlay, false)) {
            mo4866c(109);
        }
        if (obtainStyledAttributes.getBoolean(C1359b.C1371l.AppCompatTheme_windowActionModeOverlay, false)) {
            mo4866c(10);
        }
        this.f4445v = obtainStyledAttributes.getBoolean(C1359b.C1371l.AppCompatTheme_android_windowIsFloating, false);
        obtainStyledAttributes.recycle();
        this.f4436m.getDecorView();
        LayoutInflater from = LayoutInflater.from(this.f4435l);
        if (this.f4446w) {
            ViewGroup viewGroup2 = this.f4444u ? (ViewGroup) from.inflate(C1359b.C1368i.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(C1359b.C1368i.abc_screen_simple, (ViewGroup) null);
            if (Build.VERSION.SDK_INT >= 21) {
                C1040ar.m5891a((View) viewGroup2, (C1011ae) new C1011ae() {
                    /* renamed from: a */
                    public C1134by mo3075a(View view, C1134by byVar) {
                        int b = byVar.mo3907b();
                        int j = C1432n.this.mo4921j(b);
                        if (b != j) {
                            byVar = byVar.mo3905a(byVar.mo3904a(), j, byVar.mo3908c(), byVar.mo3909d());
                        }
                        return C1040ar.m5880a(view, byVar);
                    }
                });
                viewGroup = viewGroup2;
            } else {
                ((C1685aj) viewGroup2).setOnFitSystemWindowsListener(new C1685aj.C1686a() {
                    /* renamed from: a */
                    public void mo4928a(Rect rect) {
                        rect.top = C1432n.this.mo4921j(rect.top);
                    }
                });
                viewGroup = viewGroup2;
            }
        } else if (this.f4445v) {
            this.f4443t = false;
            this.f4442s = false;
            viewGroup = (ViewGroup) from.inflate(C1359b.C1368i.abc_dialog_title_material, (ViewGroup) null);
        } else if (this.f4442s) {
            TypedValue typedValue = new TypedValue();
            this.f4435l.getTheme().resolveAttribute(C1359b.C1361b.actionBarTheme, typedValue, true);
            ViewGroup viewGroup3 = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C1525d(this.f4435l, typedValue.resourceId) : this.f4435l).inflate(C1359b.C1368i.abc_screen_toolbar, (ViewGroup) null);
            this.f4470F = (C1668ad) viewGroup3.findViewById(C1359b.C1366g.decor_content_parent);
            this.f4470F.setWindowCallback(mo4889s());
            if (this.f4443t) {
                this.f4470F.mo5633a(109);
            }
            if (this.f4477M) {
                this.f4470F.mo5633a(2);
            }
            if (this.f4478N) {
                this.f4470F.mo5633a(5);
            }
            viewGroup = viewGroup3;
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f4442s + ", windowActionBarOverlay: " + this.f4443t + ", android:windowIsFloating: " + this.f4445v + ", windowActionModeOverlay: " + this.f4444u + ", windowNoTitle: " + this.f4446w + " }");
        }
        if (this.f4470F == null) {
            this.f4475K = (TextView) viewGroup.findViewById(C1359b.C1366g.title);
        }
        C1819bu.m11064b(viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(C1359b.C1366g.action_bar_activity_content);
        ViewGroup viewGroup4 = (ViewGroup) this.f4436m.findViewById(16908290);
        if (viewGroup4 != null) {
            while (viewGroup4.getChildCount() > 0) {
                View childAt = viewGroup4.getChildAt(0);
                viewGroup4.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup4.setId(-1);
            contentFrameLayout.setId(16908290);
            if (viewGroup4 instanceof FrameLayout) {
                ((FrameLayout) viewGroup4).setForeground((Drawable) null);
            }
        }
        this.f4436m.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new ContentFrameLayout.C1595a() {
            /* renamed from: a */
            public void mo4929a() {
            }

            /* renamed from: b */
            public void mo4930b() {
                C1432n.this.mo4926z();
            }
        });
        return viewGroup;
    }

    /* renamed from: B */
    private void m8430B() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f4474J.findViewById(16908290);
        View decorView = this.f4436m.getDecorView();
        contentFrameLayout.mo5760a(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f4435l.obtainStyledAttributes(C1359b.C1371l.AppCompatTheme);
        obtainStyledAttributes.getValue(C1359b.C1371l.AppCompatTheme_windowMinWidthMajor, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(C1359b.C1371l.AppCompatTheme_windowMinWidthMinor, contentFrameLayout.getMinWidthMinor());
        if (obtainStyledAttributes.hasValue(C1359b.C1371l.AppCompatTheme_windowFixedWidthMajor)) {
            obtainStyledAttributes.getValue(C1359b.C1371l.AppCompatTheme_windowFixedWidthMajor, contentFrameLayout.getFixedWidthMajor());
        }
        if (obtainStyledAttributes.hasValue(C1359b.C1371l.AppCompatTheme_windowFixedWidthMinor)) {
            obtainStyledAttributes.getValue(C1359b.C1371l.AppCompatTheme_windowFixedWidthMinor, contentFrameLayout.getFixedWidthMinor());
        }
        if (obtainStyledAttributes.hasValue(C1359b.C1371l.AppCompatTheme_windowFixedHeightMajor)) {
            obtainStyledAttributes.getValue(C1359b.C1371l.AppCompatTheme_windowFixedHeightMajor, contentFrameLayout.getFixedHeightMajor());
        }
        if (obtainStyledAttributes.hasValue(C1359b.C1371l.AppCompatTheme_windowFixedHeightMinor)) {
            obtainStyledAttributes.getValue(C1359b.C1371l.AppCompatTheme_windowFixedHeightMinor, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    /* renamed from: C */
    private void m8431C() {
        if (this.f4473I) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* renamed from: a */
    private void m8432a(C1444d dVar, KeyEvent keyEvent) {
        ViewGroup.LayoutParams layoutParams;
        int i = -1;
        if (!dVar.f4517o && !mo4887q()) {
            if (dVar.f4503a == 0) {
                Context context = this.f4435l;
                boolean z = (context.getResources().getConfiguration().screenLayout & 15) == 4;
                boolean z2 = context.getApplicationInfo().targetSdkVersion >= 11;
                if (z && z2) {
                    return;
                }
            }
            Window.Callback s = mo4889s();
            if (s == null || s.onMenuOpened(dVar.f4503a, dVar.f4512j)) {
                WindowManager windowManager = (WindowManager) this.f4435l.getSystemService("window");
                if (windowManager != null && m8438b(dVar, keyEvent)) {
                    if (dVar.f4509g == null || dVar.f4519q) {
                        if (dVar.f4509g == null) {
                            if (!m8434a(dVar) || dVar.f4509g == null) {
                                return;
                            }
                        } else if (dVar.f4519q && dVar.f4509g.getChildCount() > 0) {
                            dVar.f4509g.removeAllViews();
                        }
                        if (m8439c(dVar) && dVar.mo4945a()) {
                            ViewGroup.LayoutParams layoutParams2 = dVar.f4510h.getLayoutParams();
                            ViewGroup.LayoutParams layoutParams3 = layoutParams2 == null ? new ViewGroup.LayoutParams(-2, -2) : layoutParams2;
                            dVar.f4509g.setBackgroundResource(dVar.f4504b);
                            ViewParent parent = dVar.f4510h.getParent();
                            if (parent != null && (parent instanceof ViewGroup)) {
                                ((ViewGroup) parent).removeView(dVar.f4510h);
                            }
                            dVar.f4509g.addView(dVar.f4510h, layoutParams3);
                            if (!dVar.f4510h.hasFocus()) {
                                dVar.f4510h.requestFocus();
                            }
                            i = -2;
                        } else {
                            return;
                        }
                    } else if (dVar.f4511i == null || (layoutParams = dVar.f4511i.getLayoutParams()) == null || layoutParams.width != -1) {
                        i = -2;
                    }
                    dVar.f4516n = false;
                    WindowManager.LayoutParams layoutParams4 = new WindowManager.LayoutParams(i, -2, dVar.f4506d, dVar.f4507e, C1023aj.f3436d, 8519680, -3);
                    layoutParams4.gravity = dVar.f4505c;
                    layoutParams4.windowAnimations = dVar.f4508f;
                    windowManager.addView(dVar.f4509g, layoutParams4);
                    dVar.f4517o = true;
                    return;
                }
                return;
            }
            mo4914a(dVar, true);
        }
    }

    /* renamed from: a */
    private void m8433a(C1550h hVar, boolean z) {
        if (this.f4470F == null || !this.f4470F.mo5652h() || (C1086bd.m6526b(ViewConfiguration.get(this.f4435l)) && !this.f4470F.mo5654j())) {
            C1444d a = mo4911a(0, true);
            a.f4519q = true;
            mo4914a(a, false);
            m8432a(a, (KeyEvent) null);
            return;
        }
        Window.Callback s = mo4889s();
        if (this.f4470F.mo5653i() && z) {
            this.f4470F.mo5656l();
            if (!mo4887q()) {
                s.onPanelClosed(108, mo4911a(0, true).f4512j);
            }
        } else if (s != null && !mo4887q()) {
            if (this.f4468C && (this.f4469D & 1) != 0) {
                this.f4436m.getDecorView().removeCallbacks(this.f4483S);
                this.f4483S.run();
            }
            C1444d a2 = mo4911a(0, true);
            if (a2.f4512j != null && !a2.f4520r && s.onPreparePanel(0, a2.f4511i, a2.f4512j)) {
                s.onMenuOpened(108, a2.f4512j);
                this.f4470F.mo5655k();
            }
        }
    }

    /* renamed from: a */
    private boolean m8434a(C1444d dVar) {
        dVar.mo4942a(mo4886p());
        dVar.f4509g = new C1443c(dVar.f4514l);
        dVar.f4505c = 81;
        return true;
    }

    /* renamed from: a */
    private boolean m8435a(C1444d dVar, int i, KeyEvent keyEvent, int i2) {
        boolean z = false;
        if (!keyEvent.isSystem()) {
            if ((dVar.f4515m || m8438b(dVar, keyEvent)) && dVar.f4512j != null) {
                z = dVar.f4512j.performShortcut(i, keyEvent, i2);
            }
            if (z && (i2 & 1) == 0 && this.f4470F == null) {
                mo4914a(dVar, true);
            }
        }
        return z;
    }

    /* renamed from: a */
    private boolean m8436a(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f4436m.getDecorView();
        for (ViewParent viewParent2 = viewParent; viewParent2 != null; viewParent2 = viewParent2.getParent()) {
            if (viewParent2 == decorView || !(viewParent2 instanceof View) || C1040ar.m5909ad((View) viewParent2)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    private boolean m8437b(C1444d dVar) {
        Context context;
        Context context2 = this.f4435l;
        if ((dVar.f4503a == 0 || dVar.f4503a == 108) && this.f4470F != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context2.getTheme();
            theme.resolveAttribute(C1359b.C1361b.actionBarTheme, typedValue, true);
            Resources.Theme theme2 = null;
            if (typedValue.resourceId != 0) {
                theme2 = context2.getResources().newTheme();
                theme2.setTo(theme);
                theme2.applyStyle(typedValue.resourceId, true);
                theme2.resolveAttribute(C1359b.C1361b.actionBarWidgetTheme, typedValue, true);
            } else {
                theme.resolveAttribute(C1359b.C1361b.actionBarWidgetTheme, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (theme2 == null) {
                    theme2 = context2.getResources().newTheme();
                    theme2.setTo(theme);
                }
                theme2.applyStyle(typedValue.resourceId, true);
            }
            Resources.Theme theme3 = theme2;
            if (theme3 != null) {
                context = new C1525d(context2, 0);
                context.getTheme().setTo(theme3);
                C1550h hVar = new C1550h(context);
                hVar.mo5334a((C1550h.C1551a) this);
                dVar.mo4944a(hVar);
                return true;
            }
        }
        context = context2;
        C1550h hVar2 = new C1550h(context);
        hVar2.mo5334a((C1550h.C1551a) this);
        dVar.mo4944a(hVar2);
        return true;
    }

    /* renamed from: b */
    private boolean m8438b(C1444d dVar, KeyEvent keyEvent) {
        if (mo4887q()) {
            return false;
        }
        if (dVar.f4515m) {
            return true;
        }
        if (!(this.f4481Q == null || this.f4481Q == dVar)) {
            mo4914a(this.f4481Q, false);
        }
        Window.Callback s = mo4889s();
        if (s != null) {
            dVar.f4511i = s.onCreatePanelView(dVar.f4503a);
        }
        boolean z = dVar.f4503a == 0 || dVar.f4503a == 108;
        if (z && this.f4470F != null) {
            this.f4470F.mo5657m();
        }
        if (dVar.f4511i == null && (!z || !(mo4885o() instanceof C1468y))) {
            if (dVar.f4512j == null || dVar.f4520r) {
                if (dVar.f4512j == null && (!m8437b(dVar) || dVar.f4512j == null)) {
                    return false;
                }
                if (z && this.f4470F != null) {
                    if (this.f4471G == null) {
                        this.f4471G = new C1440a();
                    }
                    this.f4470F.mo5635a(dVar.f4512j, this.f4471G);
                }
                dVar.f4512j.mo5381h();
                if (!s.onCreatePanelMenu(dVar.f4503a, dVar.f4512j)) {
                    dVar.mo4944a((C1550h) null);
                    if (!z || this.f4470F == null) {
                        return false;
                    }
                    this.f4470F.mo5635a((Menu) null, this.f4471G);
                    return false;
                }
                dVar.f4520r = false;
            }
            dVar.f4512j.mo5381h();
            if (dVar.f4523u != null) {
                dVar.f4512j.mo5369d(dVar.f4523u);
                dVar.f4523u = null;
            }
            if (!s.onPreparePanel(0, dVar.f4511i, dVar.f4512j)) {
                if (z && this.f4470F != null) {
                    this.f4470F.mo5635a((Menu) null, this.f4471G);
                }
                dVar.f4512j.mo5383i();
                return false;
            }
            dVar.f4518p = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            dVar.f4512j.setQwertyMode(dVar.f4518p);
            dVar.f4512j.mo5383i();
        }
        dVar.f4515m = true;
        dVar.f4516n = false;
        this.f4481Q = dVar;
        return true;
    }

    /* renamed from: c */
    private boolean m8439c(C1444d dVar) {
        if (dVar.f4511i != null) {
            dVar.f4510h = dVar.f4511i;
            return true;
        } else if (dVar.f4512j == null) {
            return false;
        } else {
            if (this.f4472H == null) {
                this.f4472H = new C1447e();
            }
            dVar.f4510h = (View) dVar.mo4941a((C1567p.C1568a) this.f4472H);
            return dVar.f4510h != null;
        }
    }

    /* renamed from: d */
    private boolean m8440d(int i, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() == 0) {
            C1444d a = mo4911a(i, true);
            if (!a.f4517o) {
                return m8438b(a, keyEvent);
            }
        }
        return false;
    }

    /* renamed from: e */
    private boolean m8441e(int i, KeyEvent keyEvent) {
        boolean z;
        boolean z2 = true;
        if (this.f4488x != null) {
            return false;
        }
        C1444d a = mo4911a(i, true);
        if (i != 0 || this.f4470F == null || !this.f4470F.mo5652h() || C1086bd.m6526b(ViewConfiguration.get(this.f4435l))) {
            if (a.f4517o || a.f4516n) {
                boolean z3 = a.f4517o;
                mo4914a(a, true);
                z2 = z3;
            } else {
                if (a.f4515m) {
                    if (a.f4520r) {
                        a.f4515m = false;
                        z = m8438b(a, keyEvent);
                    } else {
                        z = true;
                    }
                    if (z) {
                        m8432a(a, keyEvent);
                    }
                }
                z2 = false;
            }
        } else if (!this.f4470F.mo5653i()) {
            if (!mo4887q() && m8438b(a, keyEvent)) {
                z2 = this.f4470F.mo5655k();
            }
            z2 = false;
        } else {
            z2 = this.f4470F.mo5656l();
        }
        if (z2) {
            AudioManager audioManager = (AudioManager) this.f4435l.getSystemService("audio");
            if (audioManager != null) {
                audioManager.playSoundEffect(0);
            } else {
                Log.w("AppCompatDelegate", "Couldn't get audio manager");
            }
        }
        return z2;
    }

    /* renamed from: g */
    private void mo4901g(int i) {
        this.f4469D |= 1 << i;
        if (!this.f4468C) {
            C1040ar.m5895a(this.f4436m.getDecorView(), this.f4483S);
            this.f4468C = true;
        }
    }

    /* renamed from: k */
    private int m8443k(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        } else if (i != 9) {
            return i;
        } else {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            return 109;
        }
    }

    /* renamed from: u */
    private void mo4902u() {
        if (!this.f4473I) {
            this.f4474J = m8429A();
            CharSequence t = mo4890t();
            if (!TextUtils.isEmpty(t)) {
                mo4882b(t);
            }
            m8430B();
            mo4915a(this.f4474J);
            this.f4473I = true;
            C1444d a = mo4911a(0, false);
            if (mo4887q()) {
                return;
            }
            if (a == null || a.f4512j == null) {
                mo4901g(108);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C1444d mo4911a(int i, boolean z) {
        C1444d[] dVarArr = this.f4480P;
        if (dVarArr == null || dVarArr.length <= i) {
            C1444d[] dVarArr2 = new C1444d[(i + 1)];
            if (dVarArr != null) {
                System.arraycopy(dVarArr, 0, dVarArr2, 0, dVarArr.length);
            }
            this.f4480P = dVarArr2;
            dVarArr = dVarArr2;
        }
        C1444d dVar = dVarArr[i];
        if (dVar != null) {
            return dVar;
        }
        C1444d dVar2 = new C1444d(i);
        dVarArr[i] = dVar2;
        return dVar2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C1444d mo4912a(Menu menu) {
        C1444d[] dVarArr = this.f4480P;
        int length = dVarArr != null ? dVarArr.length : 0;
        for (int i = 0; i < length; i++) {
            C1444d dVar = dVarArr[i];
            if (dVar != null && dVar.f4512j == menu) {
                return dVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    public C1522b mo4850a(@C0047z C1522b.C1523a aVar) {
        if (aVar == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        if (this.f4488x != null) {
            this.f4488x.mo4730c();
        }
        C1441b bVar = new C1441b(aVar);
        C1385a a = mo4849a();
        if (a != null) {
            this.f4488x = a.mo4608a((C1522b.C1523a) bVar);
            if (!(this.f4488x == null || this.f4439p == null)) {
                this.f4439p.mo4819a(this.f4488x);
            }
        }
        if (this.f4488x == null) {
            this.f4488x = mo4881b((C1522b.C1523a) bVar);
        }
        return this.f4488x;
    }

    @C0003aa
    /* renamed from: a */
    public View mo4851a(@C0039r int i) {
        mo4902u();
        return this.f4436m.findViewById(i);
    }

    /* renamed from: a */
    public final View mo1103a(View view, String str, Context context, AttributeSet attributeSet) {
        View c = mo4900c(view, str, context, attributeSet);
        return c != null ? c : mo4860b(view, str, context, attributeSet);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4913a(int i, C1444d dVar, Menu menu) {
        if (menu == null) {
            if (dVar == null && i >= 0 && i < this.f4480P.length) {
                dVar = this.f4480P[i];
            }
            if (dVar != null) {
                menu = dVar.f4512j;
            }
        }
        if ((dVar == null || dVar.f4517o) && !mo4887q()) {
            this.f4437n.onPanelClosed(i, menu);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4878a(int i, Menu menu) {
        if (i == 108) {
            C1385a a = mo4849a();
            if (a != null) {
                a.mo4663j(false);
            }
        } else if (i == 0) {
            C1444d a2 = mo4911a(i, true);
            if (a2.f4517o) {
                mo4914a(a2, false);
            }
        }
    }

    /* renamed from: a */
    public void mo4852a(Configuration configuration) {
        C1385a a;
        if (this.f4442s && this.f4473I && (a = mo4849a()) != null) {
            a.mo4612a(configuration);
        }
        C1849m.m11201a().mo7454a(this.f4435l);
        mo4876k();
    }

    /* renamed from: a */
    public void mo4853a(Bundle bundle) {
        if ((this.f4437n instanceof Activity) && C0251ax.m1551c((Activity) this.f4437n) != null) {
            C1385a o = mo4885o();
            if (o == null) {
                this.f4484T = true;
            } else {
                o.mo4657h(true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4914a(C1444d dVar, boolean z) {
        if (!z || dVar.f4503a != 0 || this.f4470F == null || !this.f4470F.mo5653i()) {
            WindowManager windowManager = (WindowManager) this.f4435l.getSystemService("window");
            if (!(windowManager == null || !dVar.f4517o || dVar.f4509g == null)) {
                windowManager.removeView(dVar.f4509g);
                if (z) {
                    mo4913a(dVar.f4503a, dVar, (Menu) null);
                }
            }
            dVar.f4515m = false;
            dVar.f4516n = false;
            dVar.f4517o = false;
            dVar.f4510h = null;
            dVar.f4519q = true;
            if (this.f4481Q == dVar) {
                this.f4481Q = null;
                return;
            }
            return;
        }
        mo4916b(dVar.f4512j);
    }

    /* renamed from: a */
    public void mo4719a(C1550h hVar) {
        m8433a(hVar, true);
    }

    /* renamed from: a */
    public void mo4854a(Toolbar toolbar) {
        if (this.f4437n instanceof Activity) {
            C1385a a = mo4849a();
            if (a instanceof C1395ab) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.f4441r = null;
            if (a != null) {
                a.mo4681y();
            }
            if (toolbar != null) {
                C1468y yVar = new C1468y(toolbar, ((Activity) this.f4437n).getTitle(), this.f4438o);
                this.f4440q = yVar;
                this.f4436m.setCallback(yVar.mo4974z());
            } else {
                this.f4440q = null;
                this.f4436m.setCallback(this.f4438o);
            }
            mo4871f();
        }
    }

    /* renamed from: a */
    public void mo4855a(View view) {
        mo4902u();
        ViewGroup viewGroup = (ViewGroup) this.f4474J.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f4437n.onContentChanged();
    }

    /* renamed from: a */
    public void mo4856a(View view, ViewGroup.LayoutParams layoutParams) {
        mo4902u();
        ViewGroup viewGroup = (ViewGroup) this.f4474J.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f4437n.onContentChanged();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4915a(ViewGroup viewGroup) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo4879a(int i, KeyEvent keyEvent) {
        C1385a a = mo4849a();
        if (a != null && a.mo4624a(i, keyEvent)) {
            return true;
        }
        if (this.f4481Q == null || !m8435a(this.f4481Q, keyEvent.getKeyCode(), keyEvent, 1)) {
            if (this.f4481Q == null) {
                C1444d a2 = mo4911a(0, true);
                m8438b(a2, keyEvent);
                boolean a3 = m8435a(a2, keyEvent.getKeyCode(), keyEvent, 1);
                a2.f4515m = false;
                if (a3) {
                    return true;
                }
            }
            return false;
        } else if (this.f4481Q == null) {
            return true;
        } else {
            this.f4481Q.f4516n = true;
            return true;
        }
    }

    /* renamed from: a */
    public boolean mo4724a(C1550h hVar, MenuItem menuItem) {
        C1444d a;
        Window.Callback s = mo4889s();
        if (s == null || mo4887q() || (a = mo4912a((Menu) hVar.mo5394q())) == null) {
            return false;
        }
        return s.onMenuItemSelected(a.f4503a, menuItem);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo4880a(KeyEvent keyEvent) {
        boolean z = true;
        if (keyEvent.getKeyCode() == 82 && this.f4437n.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() != 0) {
            z = false;
        }
        return z ? mo4918c(keyCode, keyEvent) : mo4917b(keyCode, keyEvent);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C1522b mo4881b(@C0047z C1522b.C1523a aVar) {
        C1522b bVar;
        Context context;
        mo4923w();
        if (this.f4488x != null) {
            this.f4488x.mo4730c();
        }
        if (!(aVar instanceof C1441b)) {
            aVar = new C1441b(aVar);
        }
        if (this.f4439p == null || mo4887q()) {
            bVar = null;
        } else {
            try {
                bVar = this.f4439p.mo4817a(aVar);
            } catch (AbstractMethodError e) {
                bVar = null;
            }
        }
        if (bVar != null) {
            this.f4488x = bVar;
        } else {
            if (this.f4489y == null) {
                if (this.f4445v) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = this.f4435l.getTheme();
                    theme.resolveAttribute(C1359b.C1361b.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme newTheme = this.f4435l.getResources().newTheme();
                        newTheme.setTo(theme);
                        newTheme.applyStyle(typedValue.resourceId, true);
                        context = new C1525d(this.f4435l, 0);
                        context.getTheme().setTo(newTheme);
                    } else {
                        context = this.f4435l;
                    }
                    this.f4489y = new ActionBarContextView(context);
                    this.f4490z = new PopupWindow(context, (AttributeSet) null, C1359b.C1361b.actionModePopupWindowStyle);
                    C1214aa.m7229a(this.f4490z, 2);
                    this.f4490z.setContentView(this.f4489y);
                    this.f4490z.setWidth(-1);
                    context.getTheme().resolveAttribute(C1359b.C1361b.actionBarSize, typedValue, true);
                    this.f4489y.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                    this.f4490z.setHeight(-2);
                    this.f4466A = new Runnable() {
                        public void run() {
                            C1432n.this.f4490z.showAtLocation(C1432n.this.f4489y, 55, 0, 0);
                            C1432n.this.mo4923w();
                            if (C1432n.this.mo4922v()) {
                                C1040ar.m5920c((View) C1432n.this.f4489y, 0.0f);
                                C1432n.this.f4467B = C1040ar.m5851A(C1432n.this.f4489y).mo3818a(1.0f);
                                C1432n.this.f4467B.mo3820a((C1130bu) new C1131bv() {
                                    /* renamed from: a */
                                    public void mo3893a(View view) {
                                        C1432n.this.f4489y.setVisibility(0);
                                    }

                                    /* renamed from: b */
                                    public void mo3894b(View view) {
                                        C1040ar.m5920c((View) C1432n.this.f4489y, 1.0f);
                                        C1432n.this.f4467B.mo3820a((C1130bu) null);
                                        C1432n.this.f4467B = null;
                                    }
                                });
                                return;
                            }
                            C1040ar.m5920c((View) C1432n.this.f4489y, 1.0f);
                            C1432n.this.f4489y.setVisibility(0);
                        }
                    };
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) this.f4474J.findViewById(C1359b.C1366g.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(mo4886p()));
                        this.f4489y = (ActionBarContextView) viewStubCompat.mo6157a();
                    }
                }
            }
            if (this.f4489y != null) {
                mo4923w();
                this.f4489y.mo5616j();
                C1526e eVar = new C1526e(this.f4489y.getContext(), this.f4489y, aVar, this.f4490z == null);
                if (aVar.mo4935a((C1522b) eVar, eVar.mo4726b())) {
                    eVar.mo4731d();
                    this.f4489y.mo5600a((C1522b) eVar);
                    this.f4488x = eVar;
                    if (mo4922v()) {
                        C1040ar.m5920c((View) this.f4489y, 0.0f);
                        this.f4467B = C1040ar.m5851A(this.f4489y).mo3818a(1.0f);
                        this.f4467B.mo3820a((C1130bu) new C1131bv() {
                            /* renamed from: a */
                            public void mo3893a(View view) {
                                C1432n.this.f4489y.setVisibility(0);
                                C1432n.this.f4489y.sendAccessibilityEvent(32);
                                if (C1432n.this.f4489y.getParent() instanceof View) {
                                    C1040ar.m5865O((View) C1432n.this.f4489y.getParent());
                                }
                            }

                            /* renamed from: b */
                            public void mo3894b(View view) {
                                C1040ar.m5920c((View) C1432n.this.f4489y, 1.0f);
                                C1432n.this.f4467B.mo3820a((C1130bu) null);
                                C1432n.this.f4467B = null;
                            }
                        });
                    } else {
                        C1040ar.m5920c((View) this.f4489y, 1.0f);
                        this.f4489y.setVisibility(0);
                        this.f4489y.sendAccessibilityEvent(32);
                        if (this.f4489y.getParent() instanceof View) {
                            C1040ar.m5865O((View) this.f4489y.getParent());
                        }
                    }
                    if (this.f4490z != null) {
                        this.f4436m.getDecorView().post(this.f4466A);
                    }
                } else {
                    this.f4488x = null;
                }
            }
        }
        if (!(this.f4488x == null || this.f4439p == null)) {
            this.f4439p.mo4819a(this.f4488x);
        }
        return this.f4488x;
    }

    /* renamed from: b */
    public View mo4860b(View view, String str, @C0047z Context context, @C0047z AttributeSet attributeSet) {
        boolean z;
        if (this.f4487W == null) {
            this.f4487W = new C1450q();
        }
        if (f4465E) {
            z = attributeSet instanceof XmlPullParser ? ((XmlPullParser) attributeSet).getDepth() > 1 : m8436a((ViewParent) view);
        } else {
            z = false;
        }
        return this.f4487W.mo4964a(view, str, context, attributeSet, z, f4465E, true, C1811br.m11020a());
    }

    /* renamed from: b */
    public void mo4861b(int i) {
        mo4902u();
        ViewGroup viewGroup = (ViewGroup) this.f4474J.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f4435l).inflate(i, viewGroup);
        this.f4437n.onContentChanged();
    }

    /* renamed from: b */
    public void mo4862b(Bundle bundle) {
        mo4902u();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo4916b(C1550h hVar) {
        if (!this.f4479O) {
            this.f4479O = true;
            this.f4470F.mo5658n();
            Window.Callback s = mo4889s();
            if (s != null && !mo4887q()) {
                s.onPanelClosed(108, hVar);
            }
            this.f4479O = false;
        }
    }

    /* renamed from: b */
    public void mo4863b(View view, ViewGroup.LayoutParams layoutParams) {
        mo4902u();
        ((ViewGroup) this.f4474J.findViewById(16908290)).addView(view, layoutParams);
        this.f4437n.onContentChanged();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo4882b(CharSequence charSequence) {
        if (this.f4470F != null) {
            this.f4470F.setWindowTitle(charSequence);
        } else if (mo4885o() != null) {
            mo4885o().mo4642d(charSequence);
        } else if (this.f4475K != null) {
            this.f4475K.setText(charSequence);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo4917b(int i, KeyEvent keyEvent) {
        switch (i) {
            case 4:
                boolean z = this.f4482R;
                this.f4482R = false;
                C1444d a = mo4911a(0, false);
                if (a == null || !a.f4517o) {
                    if (mo4924x()) {
                        return true;
                    }
                } else if (z) {
                    return true;
                } else {
                    mo4914a(a, true);
                    return true;
                }
                break;
            case 82:
                m8441e(0, keyEvent);
                return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo4883b(int i, Menu menu) {
        if (i != 108) {
            return false;
        }
        C1385a a = mo4849a();
        if (a == null) {
            return true;
        }
        a.mo4663j(true);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public View mo4900c(View view, String str, Context context, AttributeSet attributeSet) {
        View onCreateView;
        if (!(this.f4437n instanceof LayoutInflater.Factory) || (onCreateView = ((LayoutInflater.Factory) this.f4437n).onCreateView(str, context, attributeSet)) == null) {
            return null;
        }
        return onCreateView;
    }

    /* renamed from: c */
    public boolean mo4866c(int i) {
        int k = m8443k(i);
        if (this.f4446w && k == 108) {
            return false;
        }
        if (this.f4442s && k == 1) {
            this.f4442s = false;
        }
        switch (k) {
            case 1:
                m8431C();
                this.f4446w = true;
                return true;
            case 2:
                m8431C();
                this.f4477M = true;
                return true;
            case 5:
                m8431C();
                this.f4478N = true;
                return true;
            case 10:
                m8431C();
                this.f4444u = true;
                return true;
            case 108:
                m8431C();
                this.f4442s = true;
                return true;
            case 109:
                m8431C();
                this.f4443t = true;
                return true;
            default:
                return this.f4436m.requestFeature(k);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo4918c(int i, KeyEvent keyEvent) {
        boolean z = true;
        switch (i) {
            case 4:
                if ((keyEvent.getFlags() & 128) == 0) {
                    z = false;
                }
                this.f4482R = z;
                break;
            case 82:
                m8440d(0, keyEvent);
                return true;
        }
        if (Build.VERSION.SDK_INT < 11) {
            mo4879a(i, keyEvent);
        }
        return false;
    }

    /* renamed from: d */
    public void mo4867d() {
        C1385a a = mo4849a();
        if (a != null) {
            a.mo4660i(false);
        }
    }

    /* renamed from: d */
    public boolean mo4868d(int i) {
        switch (m8443k(i)) {
            case 1:
                return this.f4446w;
            case 2:
                return this.f4477M;
            case 5:
                return this.f4478N;
            case 10:
                return this.f4444u;
            case 108:
                return this.f4442s;
            case 109:
                return this.f4443t;
            default:
                return false;
        }
    }

    /* renamed from: e */
    public void mo4869e() {
        C1385a a = mo4849a();
        if (a != null) {
            a.mo4660i(true);
        }
    }

    /* renamed from: f */
    public void mo4871f() {
        C1385a a = mo4849a();
        if (a == null || !a.mo4678v()) {
            mo4901g(0);
        }
    }

    /* renamed from: g */
    public void mo4872g() {
        if (this.f4468C) {
            this.f4436m.getDecorView().removeCallbacks(this.f4483S);
        }
        super.mo4872g();
        if (this.f4440q != null) {
            this.f4440q.mo4681y();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo4919h(int i) {
        mo4914a(mo4911a(i, true), true);
    }

    /* renamed from: i */
    public void mo4874i() {
        LayoutInflater from = LayoutInflater.from(this.f4435l);
        if (from.getFactory() == null) {
            C1172m.m7024a(from, this);
        } else if (!(C1172m.m7023a(from) instanceof C1432n)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo4920i(int i) {
        C1444d a;
        C1444d a2 = mo4911a(i, true);
        if (a2.f4512j != null) {
            Bundle bundle = new Bundle();
            a2.f4512j.mo5361c(bundle);
            if (bundle.size() > 0) {
                a2.f4523u = bundle;
            }
            a2.f4512j.mo5381h();
            a2.f4512j.clear();
        }
        a2.f4520r = true;
        a2.f4519q = true;
        if ((i == 108 || i == 0) && this.f4470F != null && (a = mo4911a(0, false)) != null) {
            a.f4515m = false;
            m8438b(a, (KeyEvent) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo4921j(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = true;
        int i2 = 0;
        if (this.f4489y == null || !(this.f4489y.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f4489y.getLayoutParams();
            if (this.f4489y.isShown()) {
                if (this.f4485U == null) {
                    this.f4485U = new Rect();
                    this.f4486V = new Rect();
                }
                Rect rect = this.f4485U;
                Rect rect2 = this.f4486V;
                rect.set(0, i, 0, 0);
                C1819bu.m11062a(this.f4474J, rect, rect2);
                if (marginLayoutParams.topMargin != (rect2.top == 0 ? i : 0)) {
                    marginLayoutParams.topMargin = i;
                    if (this.f4476L == null) {
                        this.f4476L = new View(this.f4435l);
                        this.f4476L.setBackgroundColor(this.f4435l.getResources().getColor(C1359b.C1363d.abc_input_method_navigation_guard));
                        this.f4474J.addView(this.f4476L, -1, new ViewGroup.LayoutParams(-1, i));
                        z3 = true;
                    } else {
                        ViewGroup.LayoutParams layoutParams = this.f4476L.getLayoutParams();
                        if (layoutParams.height != i) {
                            layoutParams.height = i;
                            this.f4476L.setLayoutParams(layoutParams);
                        }
                        z3 = true;
                    }
                } else {
                    z3 = false;
                }
                if (this.f4476L == null) {
                    z4 = false;
                }
                if (!this.f4444u && z4) {
                    i = 0;
                }
                boolean z5 = z3;
                z2 = z4;
                z4 = z5;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z2 = false;
            } else {
                z4 = false;
                z2 = false;
            }
            if (z4) {
                this.f4489y.setLayoutParams(marginLayoutParams);
            }
            z = z2;
        }
        if (this.f4476L != null) {
            View view = this.f4476L;
            if (!z) {
                i2 = 8;
            }
            view.setVisibility(i2);
        }
        return i;
    }

    /* renamed from: n */
    public void mo4884n() {
        mo4902u();
        if (this.f4442s && this.f4440q == null) {
            if (this.f4437n instanceof Activity) {
                this.f4440q = new C1395ab((Activity) this.f4437n, this.f4443t);
            } else if (this.f4437n instanceof Dialog) {
                this.f4440q = new C1395ab((Dialog) this.f4437n);
            }
            if (this.f4440q != null) {
                this.f4440q.mo4657h(this.f4484T);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final boolean mo4922v() {
        return this.f4473I && this.f4474J != null && C1040ar.m5876Z(this.f4474J);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo4923w() {
        if (this.f4467B != null) {
            this.f4467B.mo3831d();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public boolean mo4924x() {
        if (this.f4488x != null) {
            this.f4488x.mo4730c();
            return true;
        }
        C1385a a = mo4849a();
        return a != null && a.mo4679w();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public ViewGroup mo4925y() {
        return this.f4474J;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public void mo4926z() {
        if (this.f4470F != null) {
            this.f4470F.mo5658n();
        }
        if (this.f4490z != null) {
            this.f4436m.getDecorView().removeCallbacks(this.f4466A);
            if (this.f4490z.isShowing()) {
                try {
                    this.f4490z.dismiss();
                } catch (IllegalArgumentException e) {
                }
            }
            this.f4490z = null;
        }
        mo4923w();
        C1444d a = mo4911a(0, false);
        if (a != null && a.f4512j != null) {
            a.f4512j.close();
        }
    }
}
