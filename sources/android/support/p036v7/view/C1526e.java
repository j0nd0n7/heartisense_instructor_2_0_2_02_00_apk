package android.support.p036v7.view;

import android.content.Context;
import android.support.annotation.C0011ag;
import android.support.p036v7.view.C1522b;
import android.support.p036v7.view.menu.C1550h;
import android.support.p036v7.view.menu.C1565o;
import android.support.p036v7.view.menu.C1576v;
import android.support.p036v7.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;

@C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
/* renamed from: android.support.v7.view.e */
public class C1526e extends C1522b implements C1550h.C1551a {

    /* renamed from: a */
    private Context f4751a;

    /* renamed from: b */
    private ActionBarContextView f4752b;

    /* renamed from: c */
    private C1522b.C1523a f4753c;

    /* renamed from: d */
    private WeakReference<View> f4754d;

    /* renamed from: e */
    private boolean f4755e;

    /* renamed from: f */
    private boolean f4756f;

    /* renamed from: g */
    private C1550h f4757g;

    public C1526e(Context context, ActionBarContextView actionBarContextView, C1522b.C1523a aVar, boolean z) {
        this.f4751a = context;
        this.f4752b = actionBarContextView;
        this.f4753c = aVar;
        this.f4757g = new C1550h(actionBarContextView.getContext()).mo5326a(1);
        this.f4757g.mo5334a((C1550h.C1551a) this);
        this.f4756f = z;
    }

    /* renamed from: a */
    public MenuInflater mo4717a() {
        return new C1529g(this.f4752b.getContext());
    }

    /* renamed from: a */
    public void mo4718a(int i) {
        mo4729b((CharSequence) this.f4751a.getString(i));
    }

    /* renamed from: a */
    public void mo4719a(C1550h hVar) {
        mo4731d();
        this.f4752b.mo5601a();
    }

    /* renamed from: a */
    public void mo5132a(C1550h hVar, boolean z) {
    }

    /* renamed from: a */
    public void mo4721a(View view) {
        this.f4752b.setCustomView(view);
        this.f4754d = view != null ? new WeakReference<>(view) : null;
    }

    /* renamed from: a */
    public void mo4722a(CharSequence charSequence) {
        this.f4752b.setSubtitle(charSequence);
    }

    /* renamed from: a */
    public void mo4723a(boolean z) {
        super.mo4723a(z);
        this.f4752b.setTitleOptional(z);
    }

    /* renamed from: a */
    public boolean mo4724a(C1550h hVar, MenuItem menuItem) {
        return this.f4753c.mo4936a((C1522b) this, menuItem);
    }

    /* renamed from: a */
    public boolean mo5133a(C1576v vVar) {
        if (vVar.hasVisibleItems()) {
            new C1565o(this.f4752b.getContext(), vVar).mo5528c();
        }
        return true;
    }

    /* renamed from: b */
    public Menu mo4726b() {
        return this.f4757g;
    }

    /* renamed from: b */
    public void mo4727b(int i) {
        mo4722a((CharSequence) this.f4751a.getString(i));
    }

    /* renamed from: b */
    public void mo5134b(C1576v vVar) {
    }

    /* renamed from: b */
    public void mo4729b(CharSequence charSequence) {
        this.f4752b.setTitle(charSequence);
    }

    /* renamed from: c */
    public void mo4730c() {
        if (!this.f4755e) {
            this.f4755e = true;
            this.f4752b.sendAccessibilityEvent(32);
            this.f4753c.mo4934a(this);
        }
    }

    /* renamed from: d */
    public void mo4731d() {
        this.f4753c.mo4937b(this, this.f4757g);
    }

    /* renamed from: f */
    public CharSequence mo4733f() {
        return this.f4752b.getTitle();
    }

    /* renamed from: g */
    public CharSequence mo4734g() {
        return this.f4752b.getSubtitle();
    }

    /* renamed from: h */
    public boolean mo4735h() {
        return this.f4752b.mo5617k();
    }

    /* renamed from: i */
    public View mo4736i() {
        if (this.f4754d != null) {
            return (View) this.f4754d.get();
        }
        return null;
    }

    /* renamed from: l */
    public boolean mo5123l() {
        return this.f4756f;
    }
}
