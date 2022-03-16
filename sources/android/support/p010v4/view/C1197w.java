package android.support.p010v4.view;

import android.annotation.TargetApi;
import android.support.annotation.C0007ae;
import android.view.MenuItem;

@C0007ae(mo1a = 14)
@TargetApi(14)
/* renamed from: android.support.v4.view.w */
class C1197w {

    /* renamed from: android.support.v4.view.w$a */
    static class C1198a implements MenuItem.OnActionExpandListener {

        /* renamed from: a */
        private C1199b f3649a;

        public C1198a(C1199b bVar) {
            this.f3649a = bVar;
        }

        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f3649a.mo4021b(menuItem);
        }

        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f3649a.mo4020a(menuItem);
        }
    }

    /* renamed from: android.support.v4.view.w$b */
    interface C1199b {
        /* renamed from: a */
        boolean mo4020a(MenuItem menuItem);

        /* renamed from: b */
        boolean mo4021b(MenuItem menuItem);
    }

    C1197w() {
    }

    /* renamed from: a */
    public static MenuItem m7124a(MenuItem menuItem, C1199b bVar) {
        return menuItem.setOnActionExpandListener(new C1198a(bVar));
    }

    /* renamed from: a */
    public static boolean m7125a(MenuItem menuItem) {
        return menuItem.expandActionView();
    }

    /* renamed from: b */
    public static boolean m7126b(MenuItem menuItem) {
        return menuItem.collapseActionView();
    }

    /* renamed from: c */
    public static boolean m7127c(MenuItem menuItem) {
        return menuItem.isActionViewExpanded();
    }
}
