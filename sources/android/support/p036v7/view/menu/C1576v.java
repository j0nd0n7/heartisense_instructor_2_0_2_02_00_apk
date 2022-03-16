package android.support.p036v7.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.C0011ag;
import android.support.p036v7.view.menu.C1550h;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

@C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
/* renamed from: android.support.v7.view.menu.v */
public class C1576v extends C1550h implements SubMenu {

    /* renamed from: i */
    private C1550h f5061i;

    /* renamed from: j */
    private C1555k f5062j;

    public C1576v(Context context, C1550h hVar, C1555k kVar) {
        super(context);
        this.f5061i = hVar;
        this.f5062j = kVar;
    }

    /* renamed from: a */
    public String mo5332a() {
        int itemId = this.f5062j != null ? this.f5062j.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.mo5332a() + ":" + itemId;
    }

    /* renamed from: a */
    public void mo5334a(C1550h.C1551a aVar) {
        this.f5061i.mo5334a(aVar);
    }

    /* renamed from: a */
    public void mo5341a(boolean z) {
        this.f5061i.mo5341a(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo5342a(C1550h hVar, MenuItem menuItem) {
        return super.mo5342a(hVar, menuItem) || this.f5061i.mo5342a(hVar, menuItem);
    }

    /* renamed from: c */
    public boolean mo5363c() {
        return this.f5061i.mo5363c();
    }

    /* renamed from: c */
    public boolean mo5364c(C1555k kVar) {
        return this.f5061i.mo5364c(kVar);
    }

    /* renamed from: d */
    public boolean mo5371d() {
        return this.f5061i.mo5371d();
    }

    /* renamed from: d */
    public boolean mo5372d(C1555k kVar) {
        return this.f5061i.mo5372d(kVar);
    }

    public MenuItem getItem() {
        return this.f5062j;
    }

    /* renamed from: q */
    public C1550h mo5394q() {
        return this.f5061i.mo5394q();
    }

    public SubMenu setHeaderIcon(int i) {
        return (SubMenu) super.mo5377f(i);
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.mo5327a(drawable);
    }

    public SubMenu setHeaderTitle(int i) {
        return (SubMenu) super.mo5374e(i);
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.mo5329a(charSequence);
    }

    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.mo5328a(view);
    }

    public SubMenu setIcon(int i) {
        this.f5062j.setIcon(i);
        return this;
    }

    public SubMenu setIcon(Drawable drawable) {
        this.f5062j.setIcon(drawable);
        return this;
    }

    public void setQwertyMode(boolean z) {
        this.f5061i.setQwertyMode(z);
    }

    /* renamed from: t */
    public Menu mo5570t() {
        return this.f5061i;
    }
}
