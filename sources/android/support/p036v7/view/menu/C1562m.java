package android.support.p036v7.view.menu;

import android.annotation.TargetApi;
import android.content.Context;
import android.support.annotation.C0007ae;
import android.support.annotation.C0011ag;
import android.support.p010v4.p023h.p024a.C0539b;
import android.support.p010v4.view.C1147e;
import android.support.p036v7.view.menu.C1557l;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;

@C0007ae(mo1a = 16)
@C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
@TargetApi(16)
/* renamed from: android.support.v7.view.menu.m */
class C1562m extends C1557l {

    /* renamed from: android.support.v7.view.menu.m$a */
    class C1563a extends C1557l.C1558a implements ActionProvider.VisibilityListener {

        /* renamed from: c */
        C1147e.C1149b f5024c;

        public C1563a(Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        /* renamed from: a */
        public View mo3958a(MenuItem menuItem) {
            return this.f5019a.onCreateActionView(menuItem);
        }

        /* renamed from: a */
        public void mo3960a(C1147e.C1149b bVar) {
            this.f5024c = bVar;
            ActionProvider actionProvider = this.f5019a;
            if (bVar == null) {
                this = null;
            }
            actionProvider.setVisibilityListener(this);
        }

        /* renamed from: c */
        public boolean mo3964c() {
            return this.f5019a.overridesItemVisibility();
        }

        /* renamed from: d */
        public boolean mo3965d() {
            return this.f5019a.isVisible();
        }

        /* renamed from: e */
        public void mo3966e() {
            this.f5019a.refreshVisibility();
        }

        public void onActionProviderVisibilityChanged(boolean z) {
            if (this.f5024c != null) {
                this.f5024c.mo3971a(z);
            }
        }
    }

    C1562m(Context context, C0539b bVar) {
        super(context, bVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C1557l.C1558a mo5472a(ActionProvider actionProvider) {
        return new C1563a(this.f4885a, actionProvider);
    }
}
