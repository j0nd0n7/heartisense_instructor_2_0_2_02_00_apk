package android.support.p036v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.annotation.C0011ag;
import android.support.p010v4.view.C1040ar;
import android.support.p010v4.view.C1112bo;
import android.support.p010v4.view.C1130bu;
import android.support.p010v4.view.C1131bv;
import android.support.p036v7.p037a.C1359b;
import android.support.p036v7.p038b.p039a.C1477b;
import android.support.p036v7.view.menu.C1537a;
import android.support.p036v7.view.menu.C1550h;
import android.support.p036v7.view.menu.C1567p;
import android.support.p036v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

@C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
/* renamed from: android.support.v7.widget.bq */
public class C1808bq implements C1669ae {

    /* renamed from: e */
    private static final String f6108e = "ToolbarWidgetWrapper";

    /* renamed from: f */
    private static final int f6109f = 3;

    /* renamed from: g */
    private static final long f6110g = 200;

    /* renamed from: a */
    Toolbar f6111a;

    /* renamed from: b */
    CharSequence f6112b;

    /* renamed from: c */
    Window.Callback f6113c;

    /* renamed from: d */
    boolean f6114d;

    /* renamed from: h */
    private int f6115h;

    /* renamed from: i */
    private View f6116i;

    /* renamed from: j */
    private Spinner f6117j;

    /* renamed from: k */
    private View f6118k;

    /* renamed from: l */
    private Drawable f6119l;

    /* renamed from: m */
    private Drawable f6120m;

    /* renamed from: n */
    private Drawable f6121n;

    /* renamed from: o */
    private boolean f6122o;

    /* renamed from: p */
    private CharSequence f6123p;

    /* renamed from: q */
    private CharSequence f6124q;

    /* renamed from: r */
    private C1821d f6125r;

    /* renamed from: s */
    private int f6126s;

    /* renamed from: t */
    private int f6127t;

    /* renamed from: u */
    private Drawable f6128u;

    public C1808bq(Toolbar toolbar, boolean z) {
        this(toolbar, z, C1359b.C1369j.abc_action_bar_up_description, C1359b.C1365f.abc_ic_ab_back_material);
    }

    public C1808bq(Toolbar toolbar, boolean z, int i, int i2) {
        this.f6126s = 0;
        this.f6127t = 0;
        this.f6111a = toolbar;
        this.f6112b = toolbar.getTitle();
        this.f6123p = toolbar.getSubtitle();
        this.f6122o = this.f6112b != null;
        this.f6121n = toolbar.getNavigationIcon();
        C1807bp a = C1807bp.m10923a(toolbar.getContext(), (AttributeSet) null, C1359b.C1371l.ActionBar, C1359b.C1361b.actionBarStyle, 0);
        this.f6128u = a.mo7293a(C1359b.C1371l.ActionBar_homeAsUpIndicator);
        if (z) {
            CharSequence d = a.mo7304d(C1359b.C1371l.ActionBar_title);
            if (!TextUtils.isEmpty(d)) {
                mo6304b(d);
            }
            CharSequence d2 = a.mo7304d(C1359b.C1371l.ActionBar_subtitle);
            if (!TextUtils.isEmpty(d2)) {
                mo6308c(d2);
            }
            Drawable a2 = a.mo7293a(C1359b.C1371l.ActionBar_logo);
            if (a2 != null) {
                mo6302b(a2);
            }
            Drawable a3 = a.mo7293a(C1359b.C1371l.ActionBar_icon);
            if (a3 != null) {
                mo6290a(a3);
            }
            if (this.f6121n == null && this.f6128u != null) {
                mo6307c(this.f6128u);
            }
            mo6306c(a.mo7291a(C1359b.C1371l.ActionBar_displayOptions, 0));
            int g = a.mo7312g(C1359b.C1371l.ActionBar_customNavigationLayout, 0);
            if (g != 0) {
                mo6295a(LayoutInflater.from(this.f6111a.getContext()).inflate(g, this.f6111a, false));
                mo6306c(this.f6115h | 16);
            }
            int f = a.mo7310f(C1359b.C1371l.ActionBar_height, 0);
            if (f > 0) {
                ViewGroup.LayoutParams layoutParams = this.f6111a.getLayoutParams();
                layoutParams.height = f;
                this.f6111a.setLayoutParams(layoutParams);
            }
            int d3 = a.mo7303d(C1359b.C1371l.ActionBar_contentInsetStart, -1);
            int d4 = a.mo7303d(C1359b.C1371l.ActionBar_contentInsetEnd, -1);
            if (d3 >= 0 || d4 >= 0) {
                this.f6111a.mo6071a(Math.max(d3, 0), Math.max(d4, 0));
            }
            int g2 = a.mo7312g(C1359b.C1371l.ActionBar_titleTextStyle, 0);
            if (g2 != 0) {
                this.f6111a.mo6073a(this.f6111a.getContext(), g2);
            }
            int g3 = a.mo7312g(C1359b.C1371l.ActionBar_subtitleTextStyle, 0);
            if (g3 != 0) {
                this.f6111a.mo6078b(this.f6111a.getContext(), g3);
            }
            int g4 = a.mo7312g(C1359b.C1371l.ActionBar_popupTheme, 0);
            if (g4 != 0) {
                this.f6111a.setPopupTheme(g4);
            }
        } else {
            this.f6115h = m10954B();
        }
        a.mo7308e();
        mo6323i(i);
        this.f6124q = this.f6111a.getNavigationContentDescription();
        this.f6111a.setNavigationOnClickListener(new View.OnClickListener() {

            /* renamed from: a */
            final C1537a f6129a = new C1537a(C1808bq.this.f6111a.getContext(), 0, 16908332, 0, 0, C1808bq.this.f6112b);

            public void onClick(View view) {
                if (C1808bq.this.f6113c != null && C1808bq.this.f6114d) {
                    C1808bq.this.f6113c.onMenuItemSelected(0, this.f6129a);
                }
            }
        });
    }

    /* renamed from: B */
    private int m10954B() {
        if (this.f6111a.getNavigationIcon() == null) {
            return 11;
        }
        this.f6128u = this.f6111a.getNavigationIcon();
        return 15;
    }

    /* renamed from: C */
    private void m10955C() {
        Drawable drawable = null;
        if ((this.f6115h & 2) != 0) {
            drawable = (this.f6115h & 1) != 0 ? this.f6120m != null ? this.f6120m : this.f6119l : this.f6119l;
        }
        this.f6111a.setLogo(drawable);
    }

    /* renamed from: D */
    private void m10956D() {
        if (this.f6117j == null) {
            this.f6117j = new C1866y(mo6300b(), (AttributeSet) null, C1359b.C1361b.actionDropDownStyle);
            this.f6117j.setLayoutParams(new Toolbar.C1636b(-2, -2, 8388627));
        }
    }

    /* renamed from: E */
    private void m10957E() {
        if ((this.f6115h & 4) != 0) {
            this.f6111a.setNavigationIcon(this.f6121n != null ? this.f6121n : this.f6128u);
        } else {
            this.f6111a.setNavigationIcon((Drawable) null);
        }
    }

    /* renamed from: F */
    private void m10958F() {
        if ((this.f6115h & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.f6124q)) {
            this.f6111a.setNavigationContentDescription(this.f6127t);
        } else {
            this.f6111a.setNavigationContentDescription(this.f6124q);
        }
    }

    /* renamed from: e */
    private void m10959e(CharSequence charSequence) {
        this.f6112b = charSequence;
        if ((this.f6115h & 8) != 0) {
            this.f6111a.setTitle(charSequence);
        }
    }

    /* renamed from: A */
    public Menu mo6286A() {
        return this.f6111a.getMenu();
    }

    /* renamed from: a */
    public C1112bo mo6287a(final int i, long j) {
        return C1040ar.m5851A(this.f6111a).mo3818a(i == 0 ? 1.0f : 0.0f).mo3819a(j).mo3820a((C1130bu) new C1131bv() {

            /* renamed from: c */
            private boolean f6133c = false;

            /* renamed from: a */
            public void mo3893a(View view) {
                C1808bq.this.f6111a.setVisibility(0);
            }

            /* renamed from: b */
            public void mo3894b(View view) {
                if (!this.f6133c) {
                    C1808bq.this.f6111a.setVisibility(i);
                }
            }

            /* renamed from: c */
            public void mo3895c(View view) {
                this.f6133c = true;
            }
        });
    }

    /* renamed from: a */
    public ViewGroup mo6288a() {
        return this.f6111a;
    }

    /* renamed from: a */
    public void mo6289a(int i) {
        mo6290a(i != 0 ? C1477b.m8692b(mo6300b(), i) : null);
    }

    /* renamed from: a */
    public void mo6290a(Drawable drawable) {
        this.f6119l = drawable;
        m10955C();
    }

    /* renamed from: a */
    public void mo6291a(C1567p.C1568a aVar, C1550h.C1551a aVar2) {
        this.f6111a.mo6075a(aVar, aVar2);
    }

    /* renamed from: a */
    public void mo6292a(C1782be beVar) {
        if (this.f6116i != null && this.f6116i.getParent() == this.f6111a) {
            this.f6111a.removeView(this.f6116i);
        }
        this.f6116i = beVar;
        if (beVar != null && this.f6126s == 2) {
            this.f6111a.addView(this.f6116i, 0);
            Toolbar.C1636b bVar = (Toolbar.C1636b) this.f6116i.getLayoutParams();
            bVar.width = -2;
            bVar.height = -2;
            bVar.f4312a = 8388691;
            beVar.setAllowCollapse(true);
        }
    }

    /* renamed from: a */
    public void mo6293a(SparseArray<Parcelable> sparseArray) {
        this.f6111a.saveHierarchyState(sparseArray);
    }

    /* renamed from: a */
    public void mo6294a(Menu menu, C1567p.C1568a aVar) {
        if (this.f6125r == null) {
            this.f6125r = new C1821d(this.f6111a.getContext());
            this.f6125r.mo5258a(C1359b.C1366g.action_menu_presenter);
        }
        this.f6125r.mo5262a(aVar);
        this.f6111a.mo6074a((C1550h) menu, this.f6125r);
    }

    /* renamed from: a */
    public void mo6295a(View view) {
        if (!(this.f6118k == null || (this.f6115h & 16) == 0)) {
            this.f6111a.removeView(this.f6118k);
        }
        this.f6118k = view;
        if (view != null && (this.f6115h & 16) != 0) {
            this.f6111a.addView(this.f6118k);
        }
    }

    /* renamed from: a */
    public void mo6296a(Window.Callback callback) {
        this.f6113c = callback;
    }

    /* renamed from: a */
    public void mo6297a(SpinnerAdapter spinnerAdapter, AdapterView.OnItemSelectedListener onItemSelectedListener) {
        m10956D();
        this.f6117j.setAdapter(spinnerAdapter);
        this.f6117j.setOnItemSelectedListener(onItemSelectedListener);
    }

    /* renamed from: a */
    public void mo6298a(CharSequence charSequence) {
        if (!this.f6122o) {
            m10959e(charSequence);
        }
    }

    /* renamed from: a */
    public void mo6299a(boolean z) {
        this.f6111a.setCollapsible(z);
    }

    /* renamed from: b */
    public Context mo6300b() {
        return this.f6111a.getContext();
    }

    /* renamed from: b */
    public void mo6301b(int i) {
        mo6302b(i != 0 ? C1477b.m8692b(mo6300b(), i) : null);
    }

    /* renamed from: b */
    public void mo6302b(Drawable drawable) {
        this.f6120m = drawable;
        m10955C();
    }

    /* renamed from: b */
    public void mo6303b(SparseArray<Parcelable> sparseArray) {
        this.f6111a.restoreHierarchyState(sparseArray);
    }

    /* renamed from: b */
    public void mo6304b(CharSequence charSequence) {
        this.f6122o = true;
        m10959e(charSequence);
    }

    /* renamed from: b */
    public void mo6305b(boolean z) {
    }

    /* renamed from: c */
    public void mo6306c(int i) {
        int i2 = this.f6115h ^ i;
        this.f6115h = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    m10958F();
                }
                m10957E();
            }
            if ((i2 & 3) != 0) {
                m10955C();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.f6111a.setTitle(this.f6112b);
                    this.f6111a.setSubtitle(this.f6123p);
                } else {
                    this.f6111a.setTitle((CharSequence) null);
                    this.f6111a.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) != 0 && this.f6118k != null) {
                if ((i & 16) != 0) {
                    this.f6111a.addView(this.f6118k);
                } else {
                    this.f6111a.removeView(this.f6118k);
                }
            }
        }
    }

    /* renamed from: c */
    public void mo6307c(Drawable drawable) {
        this.f6121n = drawable;
        m10957E();
    }

    /* renamed from: c */
    public void mo6308c(CharSequence charSequence) {
        this.f6123p = charSequence;
        if ((this.f6115h & 8) != 0) {
            this.f6111a.setSubtitle(charSequence);
        }
    }

    /* renamed from: c */
    public boolean mo6309c() {
        return this.f6111a.mo6113h();
    }

    /* renamed from: d */
    public void mo6310d() {
        this.f6111a.mo6114i();
    }

    /* renamed from: d */
    public void mo6311d(int i) {
        int i2 = this.f6126s;
        if (i != i2) {
            switch (i2) {
                case 1:
                    if (this.f6117j != null && this.f6117j.getParent() == this.f6111a) {
                        this.f6111a.removeView(this.f6117j);
                        break;
                    }
                case 2:
                    if (this.f6116i != null && this.f6116i.getParent() == this.f6111a) {
                        this.f6111a.removeView(this.f6116i);
                        break;
                    }
            }
            this.f6126s = i;
            switch (i) {
                case 0:
                    return;
                case 1:
                    m10956D();
                    this.f6111a.addView(this.f6117j, 0);
                    return;
                case 2:
                    if (this.f6116i != null) {
                        this.f6111a.addView(this.f6116i, 0);
                        Toolbar.C1636b bVar = (Toolbar.C1636b) this.f6116i.getLayoutParams();
                        bVar.width = -2;
                        bVar.height = -2;
                        bVar.f4312a = 8388691;
                        return;
                    }
                    return;
                default:
                    throw new IllegalArgumentException("Invalid navigation mode " + i);
            }
        }
    }

    /* renamed from: d */
    public void mo6312d(Drawable drawable) {
        if (this.f6128u != drawable) {
            this.f6128u = drawable;
            m10957E();
        }
    }

    /* renamed from: d */
    public void mo6313d(CharSequence charSequence) {
        this.f6124q = charSequence;
        m10958F();
    }

    /* renamed from: e */
    public CharSequence mo6314e() {
        return this.f6111a.getTitle();
    }

    /* renamed from: e */
    public void mo6315e(int i) {
        if (this.f6117j == null) {
            throw new IllegalStateException("Can't set dropdown selected position without an adapter");
        }
        this.f6117j.setSelection(i);
    }

    /* renamed from: e */
    public void mo6316e(Drawable drawable) {
        C1040ar.m5889a((View) this.f6111a, drawable);
    }

    /* renamed from: f */
    public CharSequence mo6317f() {
        return this.f6111a.getSubtitle();
    }

    /* renamed from: f */
    public void mo6318f(int i) {
        C1112bo a = mo6287a(i, (long) f6110g);
        if (a != null) {
            a.mo3833e();
        }
    }

    /* renamed from: g */
    public void mo6319g() {
        Log.i(f6108e, "Progress display unsupported");
    }

    /* renamed from: g */
    public void mo6320g(int i) {
        mo6307c(i != 0 ? C1477b.m8692b(mo6300b(), i) : null);
    }

    /* renamed from: h */
    public void mo6321h() {
        Log.i(f6108e, "Progress display unsupported");
    }

    /* renamed from: h */
    public void mo6322h(int i) {
        mo6313d((CharSequence) i == 0 ? null : mo6300b().getString(i));
    }

    /* renamed from: i */
    public void mo6323i(int i) {
        if (i != this.f6127t) {
            this.f6127t = i;
            if (TextUtils.isEmpty(this.f6111a.getNavigationContentDescription())) {
                mo6322h(this.f6127t);
            }
        }
    }

    /* renamed from: i */
    public boolean mo6324i() {
        return this.f6119l != null;
    }

    /* renamed from: j */
    public void mo6325j(int i) {
        this.f6111a.setVisibility(i);
    }

    /* renamed from: j */
    public boolean mo6326j() {
        return this.f6120m != null;
    }

    /* renamed from: k */
    public boolean mo6327k() {
        return this.f6111a.mo6076a();
    }

    /* renamed from: l */
    public boolean mo6328l() {
        return this.f6111a.mo6079b();
    }

    /* renamed from: m */
    public boolean mo6329m() {
        return this.f6111a.mo6080c();
    }

    /* renamed from: n */
    public boolean mo6330n() {
        return this.f6111a.mo6082d();
    }

    /* renamed from: o */
    public boolean mo6331o() {
        return this.f6111a.mo6083e();
    }

    /* renamed from: p */
    public void mo6332p() {
        this.f6114d = true;
    }

    /* renamed from: q */
    public void mo6333q() {
        this.f6111a.mo6084f();
    }

    /* renamed from: r */
    public int mo6334r() {
        return this.f6115h;
    }

    /* renamed from: s */
    public boolean mo6335s() {
        return this.f6116i != null;
    }

    /* renamed from: t */
    public boolean mo6336t() {
        return this.f6111a.mo6085g();
    }

    /* renamed from: u */
    public int mo6337u() {
        return this.f6126s;
    }

    /* renamed from: v */
    public int mo6338v() {
        if (this.f6117j != null) {
            return this.f6117j.getSelectedItemPosition();
        }
        return 0;
    }

    /* renamed from: w */
    public int mo6339w() {
        if (this.f6117j != null) {
            return this.f6117j.getCount();
        }
        return 0;
    }

    /* renamed from: x */
    public View mo6340x() {
        return this.f6118k;
    }

    /* renamed from: y */
    public int mo6341y() {
        return this.f6111a.getHeight();
    }

    /* renamed from: z */
    public int mo6342z() {
        return this.f6111a.getVisibility();
    }
}
