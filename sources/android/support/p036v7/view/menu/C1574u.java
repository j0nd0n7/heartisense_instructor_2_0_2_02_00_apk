package android.support.p036v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.support.p036v7.p037a.C1359b;
import android.support.p036v7.view.menu.C1567p;
import android.support.p036v7.widget.C1715at;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;

/* renamed from: android.support.v7.view.menu.u */
final class C1574u extends C1564n implements C1567p, View.OnKeyListener, AdapterView.OnItemClickListener, PopupWindow.OnDismissListener {

    /* renamed from: a */
    final C1715at f5041a;

    /* renamed from: b */
    View f5042b;

    /* renamed from: c */
    private final Context f5043c;

    /* renamed from: d */
    private final C1550h f5044d;

    /* renamed from: e */
    private final C1549g f5045e;

    /* renamed from: f */
    private final boolean f5046f;

    /* renamed from: g */
    private final int f5047g;

    /* renamed from: h */
    private final int f5048h;

    /* renamed from: i */
    private final int f5049i;

    /* renamed from: j */
    private final ViewTreeObserver.OnGlobalLayoutListener f5050j = new ViewTreeObserver.OnGlobalLayoutListener() {
        public void onGlobalLayout() {
            if (C1574u.this.mo5290e() && !C1574u.this.f5041a.mo6478h()) {
                View view = C1574u.this.f5042b;
                if (view == null || !view.isShown()) {
                    C1574u.this.mo5289d();
                } else {
                    C1574u.this.f5041a.mo5279a();
                }
            }
        }
    };

    /* renamed from: k */
    private PopupWindow.OnDismissListener f5051k;

    /* renamed from: l */
    private View f5052l;

    /* renamed from: m */
    private C1567p.C1568a f5053m;

    /* renamed from: n */
    private ViewTreeObserver f5054n;

    /* renamed from: o */
    private boolean f5055o;

    /* renamed from: p */
    private boolean f5056p;

    /* renamed from: q */
    private int f5057q;

    /* renamed from: r */
    private int f5058r = 0;

    /* renamed from: s */
    private boolean f5059s;

    public C1574u(Context context, C1550h hVar, View view, int i, int i2, boolean z) {
        this.f5043c = context;
        this.f5044d = hVar;
        this.f5046f = z;
        this.f5045e = new C1549g(hVar, LayoutInflater.from(context), this.f5046f);
        this.f5048h = i;
        this.f5049i = i2;
        Resources resources = context.getResources();
        this.f5047g = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C1359b.C1364e.abc_config_prefDialogWidth));
        this.f5052l = view;
        this.f5041a = new C1715at(this.f5043c, (AttributeSet) null, this.f5048h, this.f5049i);
        hVar.mo5337a((C1567p) this, context);
    }

    /* renamed from: j */
    private boolean m9244j() {
        if (mo5290e()) {
            return true;
        }
        if (this.f5055o || this.f5052l == null) {
            return false;
        }
        this.f5042b = this.f5052l;
        this.f5041a.mo6459a((PopupWindow.OnDismissListener) this);
        this.f5041a.mo6456a((AdapterView.OnItemClickListener) this);
        this.f5041a.mo6460a(true);
        View view = this.f5042b;
        boolean z = this.f5054n == null;
        this.f5054n = view.getViewTreeObserver();
        if (z) {
            this.f5054n.addOnGlobalLayoutListener(this.f5050j);
        }
        this.f5041a.mo6464b(view);
        this.f5041a.mo6475f(this.f5058r);
        if (!this.f5056p) {
            this.f5057q = m9183a(this.f5045e, (ViewGroup) null, this.f5043c, this.f5047g);
            this.f5056p = true;
        }
        this.f5041a.mo6477h(this.f5057q);
        this.f5041a.mo6484k(2);
        this.f5041a.mo6454a(mo5519i());
        this.f5041a.mo5279a();
        ListView g = this.f5041a.mo5292g();
        g.setOnKeyListener(this);
        if (this.f5059s && this.f5044d.mo5389n() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f5043c).inflate(C1359b.C1368i.abc_popup_menu_header_item_layout, g, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            if (textView != null) {
                textView.setText(this.f5044d.mo5389n());
            }
            frameLayout.setEnabled(false);
            g.addHeaderView(frameLayout, (Object) null, false);
        }
        this.f5041a.mo6458a((ListAdapter) this.f5045e);
        this.f5041a.mo5279a();
        return true;
    }

    /* renamed from: a */
    public void mo5279a() {
        if (!m9244j()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    /* renamed from: a */
    public void mo5280a(int i) {
        this.f5058r = i;
    }

    /* renamed from: a */
    public void mo5281a(Parcelable parcelable) {
    }

    /* renamed from: a */
    public void mo5282a(C1550h hVar) {
    }

    /* renamed from: a */
    public void mo5260a(C1550h hVar, boolean z) {
        if (hVar == this.f5044d) {
            mo5289d();
            if (this.f5053m != null) {
                this.f5053m.mo4932a(hVar, z);
            }
        }
    }

    /* renamed from: a */
    public void mo5262a(C1567p.C1568a aVar) {
        this.f5053m = aVar;
    }

    /* renamed from: a */
    public void mo5283a(View view) {
        this.f5052l = view;
    }

    /* renamed from: a */
    public void mo5284a(PopupWindow.OnDismissListener onDismissListener) {
        this.f5051k = onDismissListener;
    }

    /* renamed from: a */
    public void mo5285a(boolean z) {
        this.f5045e.mo5316a(z);
    }

    /* renamed from: a */
    public boolean mo5266a(C1576v vVar) {
        if (vVar.hasVisibleItems()) {
            C1565o oVar = new C1565o(this.f5043c, vVar, this.f5042b, this.f5046f, this.f5048h, this.f5049i);
            oVar.mo5411a(this.f5053m);
            oVar.mo5525a(C1564n.m9185b((C1550h) vVar));
            oVar.mo5524a(this.f5051k);
            this.f5051k = null;
            this.f5044d.mo5359b(false);
            if (oVar.mo5527b(this.f5041a.mo6489n(), this.f5041a.mo6491o())) {
                if (this.f5053m != null) {
                    this.f5053m.mo4933a(vVar);
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public void mo5286b(int i) {
        this.f5041a.mo6472d(i);
    }

    /* renamed from: b */
    public void mo5269b(boolean z) {
        this.f5056p = false;
        if (this.f5045e != null) {
            this.f5045e.notifyDataSetChanged();
        }
    }

    /* renamed from: b */
    public boolean mo5270b() {
        return false;
    }

    /* renamed from: c */
    public void mo5287c(int i) {
        this.f5041a.mo6473e(i);
    }

    /* renamed from: c */
    public void mo5288c(boolean z) {
        this.f5059s = z;
    }

    /* renamed from: d */
    public void mo5289d() {
        if (mo5290e()) {
            this.f5041a.mo5289d();
        }
    }

    /* renamed from: e */
    public boolean mo5290e() {
        return !this.f5055o && this.f5041a.mo5290e();
    }

    /* renamed from: f */
    public Parcelable mo5291f() {
        return null;
    }

    /* renamed from: g */
    public ListView mo5292g() {
        return this.f5041a.mo5292g();
    }

    public void onDismiss() {
        this.f5055o = true;
        this.f5044d.close();
        if (this.f5054n != null) {
            if (!this.f5054n.isAlive()) {
                this.f5054n = this.f5042b.getViewTreeObserver();
            }
            this.f5054n.removeGlobalOnLayoutListener(this.f5050j);
            this.f5054n = null;
        }
        if (this.f5051k != null) {
            this.f5051k.onDismiss();
        }
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        mo5289d();
        return true;
    }
}
