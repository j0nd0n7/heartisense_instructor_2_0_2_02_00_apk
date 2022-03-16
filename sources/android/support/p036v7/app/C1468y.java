package android.support.p036v7.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.annotation.C0003aa;
import android.support.p010v4.view.C1040ar;
import android.support.p036v7.app.C1385a;
import android.support.p036v7.p037a.C1359b;
import android.support.p036v7.view.C1534i;
import android.support.p036v7.view.menu.C1547f;
import android.support.p036v7.view.menu.C1550h;
import android.support.p036v7.view.menu.C1567p;
import android.support.p036v7.widget.C1669ae;
import android.support.p036v7.widget.C1808bq;
import android.support.p036v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.SpinnerAdapter;
import java.util.ArrayList;

/* renamed from: android.support.v7.app.y */
class C1468y extends C1385a {

    /* renamed from: i */
    C1669ae f4556i;

    /* renamed from: j */
    boolean f4557j;

    /* renamed from: k */
    Window.Callback f4558k;

    /* renamed from: l */
    private boolean f4559l;

    /* renamed from: m */
    private boolean f4560m;

    /* renamed from: n */
    private ArrayList<C1385a.C1389d> f4561n = new ArrayList<>();

    /* renamed from: o */
    private C1547f f4562o;

    /* renamed from: p */
    private final Runnable f4563p = new Runnable() {
        public void run() {
            C1468y.this.mo4972A();
        }
    };

    /* renamed from: q */
    private final Toolbar.C1637c f4564q = new Toolbar.C1637c() {
        /* renamed from: a */
        public boolean mo4976a(MenuItem menuItem) {
            return C1468y.this.f4558k.onMenuItemSelected(0, menuItem);
        }
    };

    /* renamed from: android.support.v7.app.y$a */
    private final class C1471a implements C1567p.C1568a {

        /* renamed from: b */
        private boolean f4568b;

        C1471a() {
        }

        /* renamed from: a */
        public void mo4932a(C1550h hVar, boolean z) {
            if (!this.f4568b) {
                this.f4568b = true;
                C1468y.this.f4556i.mo6333q();
                if (C1468y.this.f4558k != null) {
                    C1468y.this.f4558k.onPanelClosed(108, hVar);
                }
                this.f4568b = false;
            }
        }

        /* renamed from: a */
        public boolean mo4933a(C1550h hVar) {
            if (C1468y.this.f4558k == null) {
                return false;
            }
            C1468y.this.f4558k.onMenuOpened(108, hVar);
            return true;
        }
    }

    /* renamed from: android.support.v7.app.y$b */
    private final class C1472b implements C1550h.C1551a {
        C1472b() {
        }

        /* renamed from: a */
        public void mo4719a(C1550h hVar) {
            if (C1468y.this.f4558k == null) {
                return;
            }
            if (C1468y.this.f4556i.mo6328l()) {
                C1468y.this.f4558k.onPanelClosed(108, hVar);
            } else if (C1468y.this.f4558k.onPreparePanel(0, (View) null, hVar)) {
                C1468y.this.f4558k.onMenuOpened(108, hVar);
            }
        }

        /* renamed from: a */
        public boolean mo4724a(C1550h hVar, MenuItem menuItem) {
            return false;
        }
    }

    /* renamed from: android.support.v7.app.y$c */
    private final class C1473c implements C1567p.C1568a {
        C1473c() {
        }

        /* renamed from: a */
        public void mo4932a(C1550h hVar, boolean z) {
            if (C1468y.this.f4558k != null) {
                C1468y.this.f4558k.onPanelClosed(0, hVar);
            }
        }

        /* renamed from: a */
        public boolean mo4933a(C1550h hVar) {
            if (hVar != null || C1468y.this.f4558k == null) {
                return true;
            }
            C1468y.this.f4558k.onMenuOpened(0, hVar);
            return true;
        }
    }

    /* renamed from: android.support.v7.app.y$d */
    private class C1474d extends C1534i {
        public C1474d(Window.Callback callback) {
            super(callback);
        }

        public View onCreatePanelView(int i) {
            switch (i) {
                case 0:
                    Menu A = C1468y.this.f4556i.mo6286A();
                    if (onPreparePanel(i, (View) null, A) && onMenuOpened(i, A)) {
                        return C1468y.this.mo4973a(A);
                    }
            }
            return super.onCreatePanelView(i);
        }

        public boolean onPreparePanel(int i, View view, Menu menu) {
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (onPreparePanel && !C1468y.this.f4557j) {
                C1468y.this.f4556i.mo6332p();
                C1468y.this.f4557j = true;
            }
            return onPreparePanel;
        }
    }

    public C1468y(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        this.f4556i = new C1808bq(toolbar, false);
        this.f4558k = new C1474d(callback);
        this.f4556i.mo6296a(this.f4558k);
        toolbar.setOnMenuItemClickListener(this.f4564q);
        this.f4556i.mo6298a(charSequence);
    }

    /* renamed from: B */
    private Menu m8600B() {
        if (!this.f4559l) {
            this.f4556i.mo6291a((C1567p.C1568a) new C1471a(), (C1550h.C1551a) new C1472b());
            this.f4559l = true;
        }
        return this.f4556i.mo6286A();
    }

    /* renamed from: b */
    private void m8601b(Menu menu) {
        if (this.f4562o == null && (menu instanceof C1550h)) {
            C1550h hVar = (C1550h) menu;
            Context b = this.f4556i.mo6300b();
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = b.getResources().newTheme();
            newTheme.setTo(b.getTheme());
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
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(b, 0);
            contextThemeWrapper.getTheme().setTo(newTheme);
            this.f4562o = new C1547f((Context) contextThemeWrapper, C1359b.C1368i.abc_list_menu_item_layout);
            this.f4562o.mo5262a((C1567p.C1568a) new C1473c());
            hVar.mo5336a((C1567p) this.f4562o);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public void mo4972A() {
        Menu B = m8600B();
        C1550h hVar = B instanceof C1550h ? (C1550h) B : null;
        if (hVar != null) {
            hVar.mo5381h();
        }
        try {
            B.clear();
            if (!this.f4558k.onCreatePanelMenu(0, B) || !this.f4558k.onPreparePanel(0, (View) null, B)) {
                B.clear();
            }
        } finally {
            if (hVar != null) {
                hVar.mo5383i();
            }
        }
    }

    /* renamed from: a */
    public int mo4607a() {
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public View mo4973a(Menu menu) {
        m8601b(menu);
        if (menu == null || this.f4562o == null || this.f4562o.mo5301a().getCount() <= 0) {
            return null;
        }
        return (View) this.f4562o.mo5256a(this.f4556i.mo6288a());
    }

    /* renamed from: a */
    public void mo4609a(float f) {
        C1040ar.m5952m(this.f4556i.mo6288a(), f);
    }

    /* renamed from: a */
    public void mo4610a(int i) {
        mo4619a(LayoutInflater.from(this.f4556i.mo6300b()).inflate(i, this.f4556i.mo6288a(), false));
    }

    /* renamed from: a */
    public void mo4611a(int i, int i2) {
        this.f4556i.mo6306c((this.f4556i.mo6334r() & (i2 ^ -1)) | (i & i2));
    }

    /* renamed from: a */
    public void mo4612a(Configuration configuration) {
        super.mo4612a(configuration);
    }

    /* renamed from: a */
    public void mo4613a(Drawable drawable) {
        this.f4556i.mo6290a(drawable);
    }

    /* renamed from: a */
    public void mo4614a(C1385a.C1389d dVar) {
        this.f4561n.add(dVar);
    }

    /* renamed from: a */
    public void mo4615a(C1385a.C1391f fVar) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    /* renamed from: a */
    public void mo4616a(C1385a.C1391f fVar, int i) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    /* renamed from: a */
    public void mo4617a(C1385a.C1391f fVar, int i, boolean z) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    /* renamed from: a */
    public void mo4618a(C1385a.C1391f fVar, boolean z) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    /* renamed from: a */
    public void mo4619a(View view) {
        mo4620a(view, new C1385a.C1387b(-2, -2));
    }

    /* renamed from: a */
    public void mo4620a(View view, C1385a.C1387b bVar) {
        if (view != null) {
            view.setLayoutParams(bVar);
        }
        this.f4556i.mo6295a(view);
    }

    /* renamed from: a */
    public void mo4621a(SpinnerAdapter spinnerAdapter, C1385a.C1390e eVar) {
        this.f4556i.mo6297a(spinnerAdapter, (AdapterView.OnItemSelectedListener) new C1452r(eVar));
    }

    /* renamed from: a */
    public void mo4622a(CharSequence charSequence) {
        this.f4556i.mo6304b(charSequence);
    }

    /* renamed from: a */
    public void mo4623a(boolean z) {
        mo4611a(z ? 1 : 0, 1);
    }

    /* renamed from: a */
    public boolean mo4624a(int i, KeyEvent keyEvent) {
        Menu B = m8600B();
        if (B != null) {
            B.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            B.performShortcut(i, keyEvent, 0);
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo4625a(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            mo4677u();
        }
        return true;
    }

    /* renamed from: b */
    public int mo4626b() {
        return 0;
    }

    /* renamed from: b */
    public void mo4627b(int i) {
        this.f4556i.mo6289a(i);
    }

    /* renamed from: b */
    public void mo4628b(Drawable drawable) {
        this.f4556i.mo6302b(drawable);
    }

    /* renamed from: b */
    public void mo4629b(C1385a.C1389d dVar) {
        this.f4561n.remove(dVar);
    }

    /* renamed from: b */
    public void mo4630b(C1385a.C1391f fVar) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    /* renamed from: b */
    public void mo4631b(CharSequence charSequence) {
        this.f4556i.mo6308c(charSequence);
    }

    /* renamed from: b */
    public void mo4632b(boolean z) {
        mo4611a(z ? 2 : 0, 2);
    }

    /* renamed from: c */
    public View mo4633c() {
        return this.f4556i.mo6340x();
    }

    /* renamed from: c */
    public void mo4634c(int i) {
        this.f4556i.mo6301b(i);
    }

    /* renamed from: c */
    public void mo4635c(@C0003aa Drawable drawable) {
        this.f4556i.mo6316e(drawable);
    }

    /* renamed from: c */
    public void mo4636c(C1385a.C1391f fVar) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    /* renamed from: c */
    public void mo4637c(CharSequence charSequence) {
        this.f4556i.mo6313d(charSequence);
    }

    /* renamed from: c */
    public void mo4638c(boolean z) {
        mo4611a(z ? 4 : 0, 4);
    }

    /* renamed from: d */
    public CharSequence mo4639d() {
        return this.f4556i.mo6314e();
    }

    /* renamed from: d */
    public void mo4640d(int i) {
        switch (this.f4556i.mo6337u()) {
            case 1:
                this.f4556i.mo6315e(i);
                return;
            default:
                throw new IllegalStateException("setSelectedNavigationIndex not valid for current navigation mode");
        }
    }

    /* renamed from: d */
    public void mo4641d(Drawable drawable) {
    }

    /* renamed from: d */
    public void mo4642d(CharSequence charSequence) {
        this.f4556i.mo6298a(charSequence);
    }

    /* renamed from: d */
    public void mo4643d(boolean z) {
        mo4611a(z ? 8 : 0, 8);
    }

    /* renamed from: e */
    public CharSequence mo4644e() {
        return this.f4556i.mo6317f();
    }

    /* renamed from: e */
    public void mo4645e(int i) {
        this.f4556i.mo6304b(i != 0 ? this.f4556i.mo6300b().getText(i) : null);
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
        return 0;
    }

    /* renamed from: f */
    public void mo4649f(int i) {
        this.f4556i.mo6308c(i != 0 ? this.f4556i.mo6300b().getText(i) : null);
    }

    /* renamed from: f */
    public void mo4650f(Drawable drawable) {
        this.f4556i.mo6307c(drawable);
    }

    /* renamed from: f */
    public void mo4651f(boolean z) {
    }

    /* renamed from: g */
    public int mo4652g() {
        return this.f4556i.mo6334r();
    }

    /* renamed from: g */
    public void mo4653g(int i) {
        mo4611a(i, -1);
    }

    /* renamed from: h */
    public C1385a.C1391f mo4655h() {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    /* renamed from: h */
    public void mo4656h(int i) {
        if (i == 2) {
            throw new IllegalArgumentException("Tabs not supported in this configuration");
        }
        this.f4556i.mo6311d(i);
    }

    /* renamed from: h */
    public void mo4657h(boolean z) {
    }

    /* renamed from: i */
    public void mo4658i() {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    /* renamed from: i */
    public void mo4659i(int i) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    /* renamed from: i */
    public void mo4660i(boolean z) {
    }

    /* renamed from: j */
    public C1385a.C1391f mo4661j() {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    /* renamed from: j */
    public C1385a.C1391f mo4662j(int i) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    /* renamed from: j */
    public void mo4663j(boolean z) {
        if (z != this.f4560m) {
            this.f4560m = z;
            int size = this.f4561n.size();
            for (int i = 0; i < size; i++) {
                this.f4561n.get(i).mo4682a(z);
            }
        }
    }

    /* renamed from: k */
    public int mo4664k() {
        return 0;
    }

    /* renamed from: k */
    public void mo4665k(int i) {
        this.f4556i.mo6320g(i);
    }

    /* renamed from: l */
    public int mo4666l() {
        return this.f4556i.mo6341y();
    }

    /* renamed from: l */
    public void mo4667l(int i) {
        this.f4556i.mo6322h(i);
    }

    /* renamed from: m */
    public void mo4668m() {
        this.f4556i.mo6325j(0);
    }

    /* renamed from: n */
    public void mo4670n() {
        this.f4556i.mo6325j(8);
    }

    /* renamed from: o */
    public boolean mo4671o() {
        return this.f4556i.mo6342z() == 0;
    }

    /* renamed from: p */
    public Context mo4672p() {
        return this.f4556i.mo6300b();
    }

    /* renamed from: q */
    public boolean mo4673q() {
        return super.mo4673q();
    }

    /* renamed from: t */
    public float mo4676t() {
        return C1040ar.m5861K(this.f4556i.mo6288a());
    }

    /* renamed from: u */
    public boolean mo4677u() {
        return this.f4556i.mo6330n();
    }

    /* renamed from: v */
    public boolean mo4678v() {
        this.f4556i.mo6288a().removeCallbacks(this.f4563p);
        C1040ar.m5895a((View) this.f4556i.mo6288a(), this.f4563p);
        return true;
    }

    /* renamed from: w */
    public boolean mo4679w() {
        if (!this.f4556i.mo6309c()) {
            return false;
        }
        this.f4556i.mo6310d();
        return true;
    }

    /* renamed from: x */
    public boolean mo4680x() {
        ViewGroup a = this.f4556i.mo6288a();
        if (a == null || a.hasFocus()) {
            return false;
        }
        a.requestFocus();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo4681y() {
        this.f4556i.mo6288a().removeCallbacks(this.f4563p);
    }

    /* renamed from: z */
    public Window.Callback mo4974z() {
        return this.f4558k;
    }
}
