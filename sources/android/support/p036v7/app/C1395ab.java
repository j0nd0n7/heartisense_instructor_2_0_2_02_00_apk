package android.support.p036v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.C0011ag;
import android.support.p010v4.p013c.C0194ae;
import android.support.p010v4.p013c.C0226aq;
import android.support.p010v4.view.C1040ar;
import android.support.p010v4.view.C1112bo;
import android.support.p010v4.view.C1130bu;
import android.support.p010v4.view.C1131bv;
import android.support.p010v4.view.C1132bw;
import android.support.p036v7.app.C1385a;
import android.support.p036v7.p037a.C1359b;
import android.support.p036v7.p038b.p039a.C1477b;
import android.support.p036v7.view.C1521a;
import android.support.p036v7.view.C1522b;
import android.support.p036v7.view.C1529g;
import android.support.p036v7.view.C1532h;
import android.support.p036v7.view.menu.C1550h;
import android.support.p036v7.view.menu.C1565o;
import android.support.p036v7.view.menu.C1576v;
import android.support.p036v7.widget.ActionBarContainer;
import android.support.p036v7.widget.ActionBarContextView;
import android.support.p036v7.widget.ActionBarOverlayLayout;
import android.support.p036v7.widget.C1669ae;
import android.support.p036v7.widget.C1782be;
import android.support.p036v7.widget.Toolbar;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AdapterView;
import android.widget.SpinnerAdapter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

@C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
/* renamed from: android.support.v7.app.ab */
public class C1395ab extends C1385a implements ActionBarOverlayLayout.C1582a {

    /* renamed from: A */
    static final /* synthetic */ boolean f4327A = (!C1395ab.class.desiredAssertionStatus());

    /* renamed from: B */
    private static final String f4328B = "WindowDecorActionBar";

    /* renamed from: C */
    private static final Interpolator f4329C = new AccelerateInterpolator();

    /* renamed from: D */
    private static final Interpolator f4330D = new DecelerateInterpolator();

    /* renamed from: E */
    private static final boolean f4331E;

    /* renamed from: O */
    private static final int f4332O = -1;

    /* renamed from: P */
    private static final long f4333P = 100;

    /* renamed from: Q */
    private static final long f4334Q = 200;

    /* renamed from: F */
    private Context f4335F;

    /* renamed from: G */
    private Activity f4336G;

    /* renamed from: H */
    private Dialog f4337H;

    /* renamed from: I */
    private ArrayList<C1400b> f4338I = new ArrayList<>();

    /* renamed from: J */
    private C1400b f4339J;

    /* renamed from: K */
    private int f4340K = -1;

    /* renamed from: L */
    private boolean f4341L;

    /* renamed from: M */
    private boolean f4342M;

    /* renamed from: N */
    private ArrayList<C1385a.C1389d> f4343N = new ArrayList<>();

    /* renamed from: R */
    private boolean f4344R;

    /* renamed from: S */
    private int f4345S = 0;

    /* renamed from: T */
    private boolean f4346T;

    /* renamed from: U */
    private boolean f4347U = true;

    /* renamed from: V */
    private boolean f4348V;

    /* renamed from: i */
    Context f4349i;

    /* renamed from: j */
    ActionBarOverlayLayout f4350j;

    /* renamed from: k */
    ActionBarContainer f4351k;

    /* renamed from: l */
    C1669ae f4352l;

    /* renamed from: m */
    ActionBarContextView f4353m;

    /* renamed from: n */
    View f4354n;

    /* renamed from: o */
    C1782be f4355o;

    /* renamed from: p */
    C1399a f4356p;

    /* renamed from: q */
    C1522b f4357q;

    /* renamed from: r */
    C1522b.C1523a f4358r;

    /* renamed from: s */
    boolean f4359s = true;

    /* renamed from: t */
    boolean f4360t;

    /* renamed from: u */
    boolean f4361u;

    /* renamed from: v */
    C1532h f4362v;

    /* renamed from: w */
    boolean f4363w;

    /* renamed from: x */
    final C1130bu f4364x = new C1131bv() {
        /* renamed from: b */
        public void mo3894b(View view) {
            if (C1395ab.this.f4359s && C1395ab.this.f4354n != null) {
                C1040ar.m5914b(C1395ab.this.f4354n, 0.0f);
                C1040ar.m5914b((View) C1395ab.this.f4351k, 0.0f);
            }
            C1395ab.this.f4351k.setVisibility(8);
            C1395ab.this.f4351k.setTransitioning(false);
            C1395ab.this.f4362v = null;
            C1395ab.this.mo4716z();
            if (C1395ab.this.f4350j != null) {
                C1040ar.m5865O(C1395ab.this.f4350j);
            }
        }
    };

    /* renamed from: y */
    final C1130bu f4365y = new C1131bv() {
        /* renamed from: b */
        public void mo3894b(View view) {
            C1395ab.this.f4362v = null;
            C1395ab.this.f4351k.requestLayout();
        }
    };

    /* renamed from: z */
    final C1132bw f4366z = new C1132bw() {
        /* renamed from: a */
        public void mo3903a(View view) {
            ((View) C1395ab.this.f4351k.getParent()).invalidate();
        }
    };

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    /* renamed from: android.support.v7.app.ab$a */
    public class C1399a extends C1522b implements C1550h.C1551a {

        /* renamed from: b */
        private final Context f4371b;

        /* renamed from: c */
        private final C1550h f4372c;

        /* renamed from: d */
        private C1522b.C1523a f4373d;

        /* renamed from: e */
        private WeakReference<View> f4374e;

        public C1399a(Context context, C1522b.C1523a aVar) {
            this.f4371b = context;
            this.f4373d = aVar;
            this.f4372c = new C1550h(context).mo5326a(1);
            this.f4372c.mo5334a((C1550h.C1551a) this);
        }

        /* renamed from: a */
        public MenuInflater mo4717a() {
            return new C1529g(this.f4371b);
        }

        /* renamed from: a */
        public void mo4718a(int i) {
            mo4729b((CharSequence) C1395ab.this.f4349i.getResources().getString(i));
        }

        /* renamed from: a */
        public void mo4719a(C1550h hVar) {
            if (this.f4373d != null) {
                mo4731d();
                C1395ab.this.f4353m.mo5601a();
            }
        }

        /* renamed from: a */
        public void mo4720a(C1550h hVar, boolean z) {
        }

        /* renamed from: a */
        public void mo4721a(View view) {
            C1395ab.this.f4353m.setCustomView(view);
            this.f4374e = new WeakReference<>(view);
        }

        /* renamed from: a */
        public void mo4722a(CharSequence charSequence) {
            C1395ab.this.f4353m.setSubtitle(charSequence);
        }

        /* renamed from: a */
        public void mo4723a(boolean z) {
            super.mo4723a(z);
            C1395ab.this.f4353m.setTitleOptional(z);
        }

        /* renamed from: a */
        public boolean mo4724a(C1550h hVar, MenuItem menuItem) {
            if (this.f4373d != null) {
                return this.f4373d.mo4936a((C1522b) this, menuItem);
            }
            return false;
        }

        /* renamed from: a */
        public boolean mo4725a(C1576v vVar) {
            if (this.f4373d == null) {
                return false;
            }
            if (!vVar.hasVisibleItems()) {
                return true;
            }
            new C1565o(C1395ab.this.mo4672p(), vVar).mo5528c();
            return true;
        }

        /* renamed from: b */
        public Menu mo4726b() {
            return this.f4372c;
        }

        /* renamed from: b */
        public void mo4727b(int i) {
            mo4722a((CharSequence) C1395ab.this.f4349i.getResources().getString(i));
        }

        /* renamed from: b */
        public void mo4728b(C1576v vVar) {
        }

        /* renamed from: b */
        public void mo4729b(CharSequence charSequence) {
            C1395ab.this.f4353m.setTitle(charSequence);
        }

        /* renamed from: c */
        public void mo4730c() {
            if (C1395ab.this.f4356p == this) {
                if (!C1395ab.m8079a(C1395ab.this.f4360t, C1395ab.this.f4361u, false)) {
                    C1395ab.this.f4357q = this;
                    C1395ab.this.f4358r = this.f4373d;
                } else {
                    this.f4373d.mo4934a(this);
                }
                this.f4373d = null;
                C1395ab.this.mo4715n(false);
                C1395ab.this.f4353m.mo5615i();
                C1395ab.this.f4352l.mo6288a().sendAccessibilityEvent(32);
                C1395ab.this.f4350j.setHideOnContentScrollEnabled(C1395ab.this.f4363w);
                C1395ab.this.f4356p = null;
            }
        }

        /* renamed from: d */
        public void mo4731d() {
            if (C1395ab.this.f4356p == this) {
                this.f4372c.mo5381h();
                try {
                    this.f4373d.mo4937b(this, this.f4372c);
                } finally {
                    this.f4372c.mo5383i();
                }
            }
        }

        /* renamed from: e */
        public boolean mo4732e() {
            this.f4372c.mo5381h();
            try {
                return this.f4373d.mo4935a((C1522b) this, (Menu) this.f4372c);
            } finally {
                this.f4372c.mo5383i();
            }
        }

        /* renamed from: f */
        public CharSequence mo4733f() {
            return C1395ab.this.f4353m.getTitle();
        }

        /* renamed from: g */
        public CharSequence mo4734g() {
            return C1395ab.this.f4353m.getSubtitle();
        }

        /* renamed from: h */
        public boolean mo4735h() {
            return C1395ab.this.f4353m.mo5617k();
        }

        /* renamed from: i */
        public View mo4736i() {
            if (this.f4374e != null) {
                return (View) this.f4374e.get();
            }
            return null;
        }
    }

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    /* renamed from: android.support.v7.app.ab$b */
    public class C1400b extends C1385a.C1391f {

        /* renamed from: c */
        private C1385a.C1392g f4376c;

        /* renamed from: d */
        private Object f4377d;

        /* renamed from: e */
        private Drawable f4378e;

        /* renamed from: f */
        private CharSequence f4379f;

        /* renamed from: g */
        private CharSequence f4380g;

        /* renamed from: h */
        private int f4381h = -1;

        /* renamed from: i */
        private View f4382i;

        public C1400b() {
        }

        /* renamed from: a */
        public int mo4684a() {
            return this.f4381h;
        }

        /* renamed from: a */
        public C1385a.C1391f mo4685a(int i) {
            return mo4686a(C1477b.m8692b(C1395ab.this.f4349i, i));
        }

        /* renamed from: a */
        public C1385a.C1391f mo4686a(Drawable drawable) {
            this.f4378e = drawable;
            if (this.f4381h >= 0) {
                C1395ab.this.f4355o.mo7166c(this.f4381h);
            }
            return this;
        }

        /* renamed from: a */
        public C1385a.C1391f mo4687a(C1385a.C1392g gVar) {
            this.f4376c = gVar;
            return this;
        }

        /* renamed from: a */
        public C1385a.C1391f mo4688a(View view) {
            this.f4382i = view;
            if (this.f4381h >= 0) {
                C1395ab.this.f4355o.mo7166c(this.f4381h);
            }
            return this;
        }

        /* renamed from: a */
        public C1385a.C1391f mo4689a(CharSequence charSequence) {
            this.f4379f = charSequence;
            if (this.f4381h >= 0) {
                C1395ab.this.f4355o.mo7166c(this.f4381h);
            }
            return this;
        }

        /* renamed from: a */
        public C1385a.C1391f mo4690a(Object obj) {
            this.f4377d = obj;
            return this;
        }

        /* renamed from: b */
        public Drawable mo4691b() {
            return this.f4378e;
        }

        /* renamed from: b */
        public C1385a.C1391f mo4692b(int i) {
            return mo4689a(C1395ab.this.f4349i.getResources().getText(i));
        }

        /* renamed from: b */
        public C1385a.C1391f mo4693b(CharSequence charSequence) {
            this.f4380g = charSequence;
            if (this.f4381h >= 0) {
                C1395ab.this.f4355o.mo7166c(this.f4381h);
            }
            return this;
        }

        /* renamed from: c */
        public C1385a.C1391f mo4694c(int i) {
            return mo4688a(LayoutInflater.from(C1395ab.this.mo4672p()).inflate(i, (ViewGroup) null));
        }

        /* renamed from: c */
        public CharSequence mo4695c() {
            return this.f4379f;
        }

        /* renamed from: d */
        public C1385a.C1391f mo4696d(int i) {
            return mo4693b(C1395ab.this.f4349i.getResources().getText(i));
        }

        /* renamed from: d */
        public View mo4697d() {
            return this.f4382i;
        }

        /* renamed from: e */
        public Object mo4698e() {
            return this.f4377d;
        }

        /* renamed from: e */
        public void mo4737e(int i) {
            this.f4381h = i;
        }

        /* renamed from: f */
        public void mo4699f() {
            C1395ab.this.mo4636c((C1385a.C1391f) this);
        }

        /* renamed from: g */
        public CharSequence mo4700g() {
            return this.f4380g;
        }

        /* renamed from: h */
        public C1385a.C1392g mo4738h() {
            return this.f4376c;
        }
    }

    static {
        boolean z = true;
        if (Build.VERSION.SDK_INT < 14) {
            z = false;
        }
        f4331E = z;
    }

    public C1395ab(Activity activity, boolean z) {
        this.f4336G = activity;
        View decorView = activity.getWindow().getDecorView();
        m8081b(decorView);
        if (!z) {
            this.f4354n = decorView.findViewById(16908290);
        }
    }

    public C1395ab(Dialog dialog) {
        this.f4337H = dialog;
        m8081b(dialog.getWindow().getDecorView());
    }

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    public C1395ab(View view) {
        if (f4327A || view.isInEditMode()) {
            m8081b(view);
            return;
        }
        throw new AssertionError();
    }

    /* renamed from: G */
    private void m8074G() {
        if (this.f4355o == null) {
            C1782be beVar = new C1782be(this.f4349i);
            if (this.f4344R) {
                beVar.setVisibility(0);
                this.f4352l.mo6292a(beVar);
            } else {
                if (mo4648f() == 2) {
                    beVar.setVisibility(0);
                    if (this.f4350j != null) {
                        C1040ar.m5865O(this.f4350j);
                    }
                } else {
                    beVar.setVisibility(8);
                }
                this.f4351k.setTabContainer(beVar);
            }
            this.f4355o = beVar;
        }
    }

    /* renamed from: H */
    private void m8075H() {
        if (this.f4339J != null) {
            mo4636c((C1385a.C1391f) null);
        }
        this.f4338I.clear();
        if (this.f4355o != null) {
            this.f4355o.mo7161a();
        }
        this.f4340K = -1;
    }

    /* renamed from: I */
    private void m8076I() {
        if (!this.f4346T) {
            this.f4346T = true;
            if (this.f4350j != null) {
                this.f4350j.setShowingForActionMode(true);
            }
            m8084p(false);
        }
    }

    /* renamed from: J */
    private void m8077J() {
        if (this.f4346T) {
            this.f4346T = false;
            if (this.f4350j != null) {
                this.f4350j.setShowingForActionMode(false);
            }
            m8084p(false);
        }
    }

    /* renamed from: K */
    private boolean m8078K() {
        return C1040ar.m5876Z(this.f4351k);
    }

    /* renamed from: a */
    static boolean m8079a(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return !z && !z2;
    }

    /* renamed from: b */
    private void m8080b(C1385a.C1391f fVar, int i) {
        C1400b bVar = (C1400b) fVar;
        if (bVar.mo4738h() == null) {
            throw new IllegalStateException("Action Bar Tab must have a Callback");
        }
        bVar.mo4737e(i);
        this.f4338I.add(i, bVar);
        int size = this.f4338I.size();
        for (int i2 = i + 1; i2 < size; i2++) {
            this.f4338I.get(i2).mo4737e(i2);
        }
    }

    /* renamed from: b */
    private void m8081b(View view) {
        this.f4350j = (ActionBarOverlayLayout) view.findViewById(C1359b.C1366g.decor_content_parent);
        if (this.f4350j != null) {
            this.f4350j.setActionBarVisibilityCallback(this);
        }
        this.f4352l = m8082c(view.findViewById(C1359b.C1366g.action_bar));
        this.f4353m = (ActionBarContextView) view.findViewById(C1359b.C1366g.action_context_bar);
        this.f4351k = (ActionBarContainer) view.findViewById(C1359b.C1366g.action_bar_container);
        if (this.f4352l == null || this.f4353m == null || this.f4351k == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used " + "with a compatible window decor layout");
        }
        this.f4349i = this.f4352l.mo6300b();
        boolean z = (this.f4352l.mo6334r() & 4) != 0;
        if (z) {
            this.f4341L = true;
        }
        C1521a a = C1521a.m8870a(this.f4349i);
        mo4651f(a.mo5118f() || z);
        m8083o(a.mo5116d());
        TypedArray obtainStyledAttributes = this.f4349i.obtainStyledAttributes((AttributeSet) null, C1359b.C1371l.ActionBar, C1359b.C1361b.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(C1359b.C1371l.ActionBar_hideOnContentScroll, false)) {
            mo4654g(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C1359b.C1371l.ActionBar_elevation, 0);
        if (dimensionPixelSize != 0) {
            mo4609a((float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: c */
    private C1669ae m8082c(View view) {
        if (view instanceof C1669ae) {
            return (C1669ae) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException(new StringBuilder().append("Can't make a decor toolbar out of ").append(view).toString() != null ? view.getClass().getSimpleName() : "null");
    }

    /* renamed from: o */
    private void m8083o(boolean z) {
        boolean z2 = true;
        this.f4344R = z;
        if (!this.f4344R) {
            this.f4352l.mo6292a((C1782be) null);
            this.f4351k.setTabContainer(this.f4355o);
        } else {
            this.f4351k.setTabContainer((C1782be) null);
            this.f4352l.mo6292a(this.f4355o);
        }
        boolean z3 = mo4648f() == 2;
        if (this.f4355o != null) {
            if (z3) {
                this.f4355o.setVisibility(0);
                if (this.f4350j != null) {
                    C1040ar.m5865O(this.f4350j);
                }
            } else {
                this.f4355o.setVisibility(8);
            }
        }
        this.f4352l.mo6299a(!this.f4344R && z3);
        ActionBarOverlayLayout actionBarOverlayLayout = this.f4350j;
        if (this.f4344R || !z3) {
            z2 = false;
        }
        actionBarOverlayLayout.setHasNonEmbeddedTabs(z2);
    }

    /* renamed from: p */
    private void m8084p(boolean z) {
        if (m8079a(this.f4360t, this.f4361u, this.f4346T)) {
            if (!this.f4347U) {
                this.f4347U = true;
                mo4712l(z);
            }
        } else if (this.f4347U) {
            this.f4347U = false;
            mo4713m(z);
        }
    }

    /* renamed from: A */
    public void mo4705A() {
        if (this.f4361u) {
            this.f4361u = false;
            m8084p(true);
        }
    }

    /* renamed from: B */
    public void mo4706B() {
        if (!this.f4361u) {
            this.f4361u = true;
            m8084p(true);
        }
    }

    /* renamed from: C */
    public void mo4707C() {
        if (this.f4362v != null) {
            this.f4362v.mo5169c();
            this.f4362v = null;
        }
    }

    /* renamed from: D */
    public void mo4708D() {
    }

    /* renamed from: E */
    public boolean mo4709E() {
        return this.f4352l.mo6324i();
    }

    /* renamed from: F */
    public boolean mo4710F() {
        return this.f4352l.mo6326j();
    }

    /* renamed from: a */
    public int mo4607a() {
        switch (this.f4352l.mo6337u()) {
            case 1:
                return this.f4352l.mo6338v();
            case 2:
                if (this.f4339J != null) {
                    return this.f4339J.mo4684a();
                }
                return -1;
            default:
                return -1;
        }
    }

    /* renamed from: a */
    public C1522b mo4608a(C1522b.C1523a aVar) {
        if (this.f4356p != null) {
            this.f4356p.mo4730c();
        }
        this.f4350j.setHideOnContentScrollEnabled(false);
        this.f4353m.mo5616j();
        C1399a aVar2 = new C1399a(this.f4353m.getContext(), aVar);
        if (!aVar2.mo4732e()) {
            return null;
        }
        this.f4356p = aVar2;
        aVar2.mo4731d();
        this.f4353m.mo5600a((C1522b) aVar2);
        mo4715n(true);
        this.f4353m.sendAccessibilityEvent(32);
        return aVar2;
    }

    /* renamed from: a */
    public void mo4609a(float f) {
        C1040ar.m5952m(this.f4351k, f);
    }

    /* renamed from: a */
    public void mo4610a(int i) {
        mo4619a(LayoutInflater.from(mo4672p()).inflate(i, this.f4352l.mo6288a(), false));
    }

    /* renamed from: a */
    public void mo4611a(int i, int i2) {
        int r = this.f4352l.mo6334r();
        if ((i2 & 4) != 0) {
            this.f4341L = true;
        }
        this.f4352l.mo6306c((r & (i2 ^ -1)) | (i & i2));
    }

    /* renamed from: a */
    public void mo4612a(Configuration configuration) {
        m8083o(C1521a.m8870a(this.f4349i).mo5116d());
    }

    /* renamed from: a */
    public void mo4613a(Drawable drawable) {
        this.f4352l.mo6290a(drawable);
    }

    /* renamed from: a */
    public void mo4614a(C1385a.C1389d dVar) {
        this.f4343N.add(dVar);
    }

    /* renamed from: a */
    public void mo4615a(C1385a.C1391f fVar) {
        mo4618a(fVar, this.f4338I.isEmpty());
    }

    /* renamed from: a */
    public void mo4616a(C1385a.C1391f fVar, int i) {
        mo4617a(fVar, i, this.f4338I.isEmpty());
    }

    /* renamed from: a */
    public void mo4617a(C1385a.C1391f fVar, int i, boolean z) {
        m8074G();
        this.f4355o.mo7163a(fVar, i, z);
        m8080b(fVar, i);
        if (z) {
            mo4636c(fVar);
        }
    }

    /* renamed from: a */
    public void mo4618a(C1385a.C1391f fVar, boolean z) {
        m8074G();
        this.f4355o.mo7165b(fVar, z);
        m8080b(fVar, this.f4338I.size());
        if (z) {
            mo4636c(fVar);
        }
    }

    /* renamed from: a */
    public void mo4619a(View view) {
        this.f4352l.mo6295a(view);
    }

    /* renamed from: a */
    public void mo4620a(View view, C1385a.C1387b bVar) {
        view.setLayoutParams(bVar);
        this.f4352l.mo6295a(view);
    }

    /* renamed from: a */
    public void mo4621a(SpinnerAdapter spinnerAdapter, C1385a.C1390e eVar) {
        this.f4352l.mo6297a(spinnerAdapter, (AdapterView.OnItemSelectedListener) new C1452r(eVar));
    }

    /* renamed from: a */
    public void mo4622a(CharSequence charSequence) {
        this.f4352l.mo6304b(charSequence);
    }

    /* renamed from: a */
    public void mo4623a(boolean z) {
        mo4611a(z ? 1 : 0, 1);
    }

    /* renamed from: b */
    public int mo4626b() {
        switch (this.f4352l.mo6337u()) {
            case 1:
                return this.f4352l.mo6339w();
            case 2:
                return this.f4338I.size();
            default:
                return 0;
        }
    }

    /* renamed from: b */
    public void mo4627b(int i) {
        this.f4352l.mo6289a(i);
    }

    /* renamed from: b */
    public void mo4628b(Drawable drawable) {
        this.f4352l.mo6302b(drawable);
    }

    /* renamed from: b */
    public void mo4629b(C1385a.C1389d dVar) {
        this.f4343N.remove(dVar);
    }

    /* renamed from: b */
    public void mo4630b(C1385a.C1391f fVar) {
        mo4659i(fVar.mo4684a());
    }

    /* renamed from: b */
    public void mo4631b(CharSequence charSequence) {
        this.f4352l.mo6308c(charSequence);
    }

    /* renamed from: b */
    public void mo4632b(boolean z) {
        mo4611a(z ? 2 : 0, 2);
    }

    /* renamed from: c */
    public View mo4633c() {
        return this.f4352l.mo6340x();
    }

    /* renamed from: c */
    public void mo4634c(int i) {
        this.f4352l.mo6301b(i);
    }

    /* renamed from: c */
    public void mo4635c(Drawable drawable) {
        this.f4351k.setPrimaryBackground(drawable);
    }

    /* renamed from: c */
    public void mo4636c(C1385a.C1391f fVar) {
        int i = -1;
        if (mo4648f() != 2) {
            this.f4340K = fVar != null ? fVar.mo4684a() : -1;
            return;
        }
        C0226aq g = (!(this.f4336G instanceof C0194ae) || this.f4352l.mo6288a().isInEditMode()) ? null : ((C0194ae) this.f4336G).mo958j().mo1063a().mo1245g();
        if (this.f4339J != fVar) {
            C1782be beVar = this.f4355o;
            if (fVar != null) {
                i = fVar.mo4684a();
            }
            beVar.setTabSelected(i);
            if (this.f4339J != null) {
                this.f4339J.mo4738h().mo4702b(this.f4339J, g);
            }
            this.f4339J = (C1400b) fVar;
            if (this.f4339J != null) {
                this.f4339J.mo4738h().mo4701a(this.f4339J, g);
            }
        } else if (this.f4339J != null) {
            this.f4339J.mo4738h().mo4703c(this.f4339J, g);
            this.f4355o.mo7164b(fVar.mo4684a());
        }
        if (g != null && !g.mo1250q()) {
            g.mo1246h();
        }
    }

    /* renamed from: c */
    public void mo4637c(CharSequence charSequence) {
        this.f4352l.mo6313d(charSequence);
    }

    /* renamed from: c */
    public void mo4638c(boolean z) {
        mo4611a(z ? 4 : 0, 4);
    }

    /* renamed from: d */
    public CharSequence mo4639d() {
        return this.f4352l.mo6314e();
    }

    /* renamed from: d */
    public void mo4640d(int i) {
        switch (this.f4352l.mo6337u()) {
            case 1:
                this.f4352l.mo6315e(i);
                return;
            case 2:
                mo4636c((C1385a.C1391f) this.f4338I.get(i));
                return;
            default:
                throw new IllegalStateException("setSelectedNavigationIndex not valid for current navigation mode");
        }
    }

    /* renamed from: d */
    public void mo4641d(Drawable drawable) {
        this.f4351k.setStackedBackground(drawable);
    }

    /* renamed from: d */
    public void mo4642d(CharSequence charSequence) {
        this.f4352l.mo6298a(charSequence);
    }

    /* renamed from: d */
    public void mo4643d(boolean z) {
        mo4611a(z ? 8 : 0, 8);
    }

    /* renamed from: e */
    public CharSequence mo4644e() {
        return this.f4352l.mo6317f();
    }

    /* renamed from: e */
    public void mo4645e(int i) {
        mo4622a((CharSequence) this.f4349i.getString(i));
    }

    /* renamed from: e */
    public void mo4646e(Drawable drawable) {
    }

    /* renamed from: e */
    public void mo4647e(boolean z) {
        mo4611a(z ? 16 : 0, 16);
    }

    /* renamed from: f */
    public int mo4648f() {
        return this.f4352l.mo6337u();
    }

    /* renamed from: f */
    public void mo4649f(int i) {
        mo4631b((CharSequence) this.f4349i.getString(i));
    }

    /* renamed from: f */
    public void mo4650f(Drawable drawable) {
        this.f4352l.mo6307c(drawable);
    }

    /* renamed from: f */
    public void mo4651f(boolean z) {
        this.f4352l.mo6305b(z);
    }

    /* renamed from: g */
    public int mo4652g() {
        return this.f4352l.mo6334r();
    }

    /* renamed from: g */
    public void mo4653g(int i) {
        if ((i & 4) != 0) {
            this.f4341L = true;
        }
        this.f4352l.mo6306c(i);
    }

    /* renamed from: g */
    public void mo4654g(boolean z) {
        if (!z || this.f4350j.mo5636a()) {
            this.f4363w = z;
            this.f4350j.setHideOnContentScrollEnabled(z);
            return;
        }
        throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
    }

    /* renamed from: h */
    public C1385a.C1391f mo4655h() {
        return new C1400b();
    }

    /* renamed from: h */
    public void mo4656h(int i) {
        boolean z = true;
        int u = this.f4352l.mo6337u();
        switch (u) {
            case 2:
                this.f4340K = mo4607a();
                mo4636c((C1385a.C1391f) null);
                this.f4355o.setVisibility(8);
                break;
        }
        if (!(u == i || this.f4344R || this.f4350j == null)) {
            C1040ar.m5865O(this.f4350j);
        }
        this.f4352l.mo6311d(i);
        switch (i) {
            case 2:
                m8074G();
                this.f4355o.setVisibility(0);
                if (this.f4340K != -1) {
                    mo4640d(this.f4340K);
                    this.f4340K = -1;
                    break;
                }
                break;
        }
        this.f4352l.mo6299a(i == 2 && !this.f4344R);
        ActionBarOverlayLayout actionBarOverlayLayout = this.f4350j;
        if (i != 2 || this.f4344R) {
            z = false;
        }
        actionBarOverlayLayout.setHasNonEmbeddedTabs(z);
    }

    /* renamed from: h */
    public void mo4657h(boolean z) {
        if (!this.f4341L) {
            mo4638c(z);
        }
    }

    /* renamed from: i */
    public void mo4658i() {
        m8075H();
    }

    /* renamed from: i */
    public void mo4659i(int i) {
        if (this.f4355o != null) {
            int a = this.f4339J != null ? this.f4339J.mo4684a() : this.f4340K;
            this.f4355o.mo7167d(i);
            C1400b remove = this.f4338I.remove(i);
            if (remove != null) {
                remove.mo4737e(-1);
            }
            int size = this.f4338I.size();
            for (int i2 = i; i2 < size; i2++) {
                this.f4338I.get(i2).mo4737e(i2);
            }
            if (a == i) {
                mo4636c((C1385a.C1391f) this.f4338I.isEmpty() ? null : this.f4338I.get(Math.max(0, i - 1)));
            }
        }
    }

    /* renamed from: i */
    public void mo4660i(boolean z) {
        this.f4348V = z;
        if (!z && this.f4362v != null) {
            this.f4362v.mo5169c();
        }
    }

    /* renamed from: j */
    public C1385a.C1391f mo4661j() {
        return this.f4339J;
    }

    /* renamed from: j */
    public C1385a.C1391f mo4662j(int i) {
        return this.f4338I.get(i);
    }

    /* renamed from: j */
    public void mo4663j(boolean z) {
        if (z != this.f4342M) {
            this.f4342M = z;
            int size = this.f4343N.size();
            for (int i = 0; i < size; i++) {
                this.f4343N.get(i).mo4682a(z);
            }
        }
    }

    /* renamed from: k */
    public int mo4664k() {
        return this.f4338I.size();
    }

    /* renamed from: k */
    public void mo4665k(int i) {
        this.f4352l.mo6320g(i);
    }

    /* renamed from: k */
    public void mo4711k(boolean z) {
        this.f4359s = z;
    }

    /* renamed from: l */
    public int mo4666l() {
        return this.f4351k.getHeight();
    }

    /* renamed from: l */
    public void mo4667l(int i) {
        this.f4352l.mo6322h(i);
    }

    /* renamed from: l */
    public void mo4712l(boolean z) {
        if (this.f4362v != null) {
            this.f4362v.mo5169c();
        }
        this.f4351k.setVisibility(0);
        if (this.f4345S != 0 || !f4331E || (!this.f4348V && !z)) {
            C1040ar.m5920c((View) this.f4351k, 1.0f);
            C1040ar.m5914b((View) this.f4351k, 0.0f);
            if (this.f4359s && this.f4354n != null) {
                C1040ar.m5914b(this.f4354n, 0.0f);
            }
            this.f4365y.mo3894b((View) null);
        } else {
            C1040ar.m5914b((View) this.f4351k, 0.0f);
            float f = (float) (-this.f4351k.getHeight());
            if (z) {
                int[] iArr = {0, 0};
                this.f4351k.getLocationInWindow(iArr);
                f -= (float) iArr[1];
            }
            C1040ar.m5914b((View) this.f4351k, f);
            C1532h hVar = new C1532h();
            C1112bo d = C1040ar.m5851A(this.f4351k).mo3830d(0.0f);
            d.mo3821a(this.f4366z);
            hVar.mo5163a(d);
            if (this.f4359s && this.f4354n != null) {
                C1040ar.m5914b(this.f4354n, f);
                hVar.mo5163a(C1040ar.m5851A(this.f4354n).mo3830d(0.0f));
            }
            hVar.mo5166a(f4330D);
            hVar.mo5162a(250);
            hVar.mo5165a(this.f4365y);
            this.f4362v = hVar;
            hVar.mo5167a();
        }
        if (this.f4350j != null) {
            C1040ar.m5865O(this.f4350j);
        }
    }

    /* renamed from: m */
    public void mo4668m() {
        if (this.f4360t) {
            this.f4360t = false;
            m8084p(false);
        }
    }

    /* renamed from: m */
    public void mo4669m(int i) {
        if (i == 0 || this.f4350j.mo5636a()) {
            this.f4350j.setActionBarHideOffset(i);
            return;
        }
        throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to set a non-zero hide offset");
    }

    /* renamed from: m */
    public void mo4713m(boolean z) {
        if (this.f4362v != null) {
            this.f4362v.mo5169c();
        }
        if (this.f4345S != 0 || !f4331E || (!this.f4348V && !z)) {
            this.f4364x.mo3894b((View) null);
            return;
        }
        C1040ar.m5920c((View) this.f4351k, 1.0f);
        this.f4351k.setTransitioning(true);
        C1532h hVar = new C1532h();
        float f = (float) (-this.f4351k.getHeight());
        if (z) {
            int[] iArr = {0, 0};
            this.f4351k.getLocationInWindow(iArr);
            f -= (float) iArr[1];
        }
        C1112bo d = C1040ar.m5851A(this.f4351k).mo3830d(f);
        d.mo3821a(this.f4366z);
        hVar.mo5163a(d);
        if (this.f4359s && this.f4354n != null) {
            hVar.mo5163a(C1040ar.m5851A(this.f4354n).mo3830d(f));
        }
        hVar.mo5166a(f4329C);
        hVar.mo5162a(250);
        hVar.mo5165a(this.f4364x);
        this.f4362v = hVar;
        hVar.mo5167a();
    }

    /* renamed from: n */
    public void mo4670n() {
        if (!this.f4360t) {
            this.f4360t = true;
            m8084p(false);
        }
    }

    /* renamed from: n */
    public void mo4714n(int i) {
        this.f4345S = i;
    }

    /* renamed from: n */
    public void mo4715n(boolean z) {
        C1112bo a;
        C1112bo a2;
        if (z) {
            m8076I();
        } else {
            m8077J();
        }
        if (m8078K()) {
            if (z) {
                a2 = this.f4352l.mo6287a(4, (long) f4333P);
                a = this.f4353m.mo5598a(0, f4334Q);
            } else {
                a = this.f4352l.mo6287a(0, (long) f4334Q);
                a2 = this.f4353m.mo5598a(8, f4333P);
            }
            C1532h hVar = new C1532h();
            hVar.mo5164a(a2, a);
            hVar.mo5167a();
        } else if (z) {
            this.f4352l.mo6325j(4);
            this.f4353m.setVisibility(0);
        } else {
            this.f4352l.mo6325j(0);
            this.f4353m.setVisibility(8);
        }
    }

    /* renamed from: o */
    public boolean mo4671o() {
        int l = mo4666l();
        return this.f4347U && (l == 0 || mo4675s() < l);
    }

    /* renamed from: p */
    public Context mo4672p() {
        if (this.f4335F == null) {
            TypedValue typedValue = new TypedValue();
            this.f4349i.getTheme().resolveAttribute(C1359b.C1361b.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f4335F = new ContextThemeWrapper(this.f4349i, i);
            } else {
                this.f4335F = this.f4349i;
            }
        }
        return this.f4335F;
    }

    /* renamed from: q */
    public boolean mo4673q() {
        return this.f4352l != null && this.f4352l.mo6336t();
    }

    /* renamed from: r */
    public boolean mo4674r() {
        return this.f4350j.mo5641d();
    }

    /* renamed from: s */
    public int mo4675s() {
        return this.f4350j.getActionBarHideOffset();
    }

    /* renamed from: t */
    public float mo4676t() {
        return C1040ar.m5861K(this.f4351k);
    }

    /* renamed from: w */
    public boolean mo4679w() {
        if (this.f4352l == null || !this.f4352l.mo6309c()) {
            return false;
        }
        this.f4352l.mo6310d();
        return true;
    }

    /* renamed from: x */
    public boolean mo4680x() {
        ViewGroup a = this.f4352l.mo6288a();
        if (a == null || a.hasFocus()) {
            return false;
        }
        a.requestFocus();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public void mo4716z() {
        if (this.f4358r != null) {
            this.f4358r.mo4934a(this.f4357q);
            this.f4357q = null;
            this.f4358r = null;
        }
    }
}
