package android.support.p036v7.view.menu;

import android.content.Context;
import android.support.p010v4.p023h.p024a.C0539b;
import android.support.p010v4.p023h.p024a.C0540c;
import android.support.p010v4.p033o.C0876a;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Iterator;
import java.util.Map;

/* renamed from: android.support.v7.view.menu.c */
abstract class C1539c<T> extends C1540d<T> {

    /* renamed from: a */
    final Context f4885a;

    /* renamed from: c */
    private Map<C0539b, MenuItem> f4886c;

    /* renamed from: d */
    private Map<C0540c, SubMenu> f4887d;

    C1539c(Context context, T t) {
        super(t);
        this.f4885a = context;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final MenuItem mo5273a(MenuItem menuItem) {
        if (!(menuItem instanceof C0539b)) {
            return menuItem;
        }
        C0539b bVar = (C0539b) menuItem;
        if (this.f4886c == null) {
            this.f4886c = new C0876a();
        }
        MenuItem menuItem2 = this.f4886c.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItem a = C1571r.m9238a(this.f4885a, bVar);
        this.f4886c.put(bVar, a);
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final SubMenu mo5274a(SubMenu subMenu) {
        if (!(subMenu instanceof C0540c)) {
            return subMenu;
        }
        C0540c cVar = (C0540c) subMenu;
        if (this.f4887d == null) {
            this.f4887d = new C0876a();
        }
        SubMenu subMenu2 = this.f4887d.get(cVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        SubMenu a = C1571r.m9239a(this.f4885a, cVar);
        this.f4887d.put(cVar, a);
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo5275a() {
        if (this.f4886c != null) {
            this.f4886c.clear();
        }
        if (this.f4887d != null) {
            this.f4887d.clear();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo5276a(int i) {
        if (this.f4886c != null) {
            Iterator<C0539b> it = this.f4886c.keySet().iterator();
            while (it.hasNext()) {
                if (i == it.next().getGroupId()) {
                    it.remove();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo5277b(int i) {
        if (this.f4886c != null) {
            Iterator<C0539b> it = this.f4886c.keySet().iterator();
            while (it.hasNext()) {
                if (i == it.next().getItemId()) {
                    it.remove();
                    return;
                }
            }
        }
    }
}
