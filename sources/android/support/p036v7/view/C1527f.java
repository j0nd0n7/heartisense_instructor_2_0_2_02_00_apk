package android.support.p036v7.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.support.annotation.C0011ag;
import android.support.p010v4.p023h.p024a.C0538a;
import android.support.p010v4.p023h.p024a.C0539b;
import android.support.p010v4.p033o.C0900o;
import android.support.p036v7.view.C1522b;
import android.support.p036v7.view.menu.C1571r;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;

@TargetApi(11)
@C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
/* renamed from: android.support.v7.view.f */
public class C1527f extends ActionMode {

    /* renamed from: a */
    final Context f4758a;

    /* renamed from: b */
    final C1522b f4759b;

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    /* renamed from: android.support.v7.view.f$a */
    public static class C1528a implements C1522b.C1523a {

        /* renamed from: a */
        final ActionMode.Callback f4760a;

        /* renamed from: b */
        final Context f4761b;

        /* renamed from: c */
        final ArrayList<C1527f> f4762c = new ArrayList<>();

        /* renamed from: d */
        final C0900o<Menu, Menu> f4763d = new C0900o<>();

        public C1528a(Context context, ActionMode.Callback callback) {
            this.f4761b = context;
            this.f4760a = callback;
        }

        /* renamed from: a */
        private Menu m8925a(Menu menu) {
            Menu menu2 = this.f4763d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            Menu a = C1571r.m9237a(this.f4761b, (C0538a) menu);
            this.f4763d.put(menu, a);
            return a;
        }

        /* renamed from: a */
        public void mo4934a(C1522b bVar) {
            this.f4760a.onDestroyActionMode(mo5152b(bVar));
        }

        /* renamed from: a */
        public boolean mo4935a(C1522b bVar, Menu menu) {
            return this.f4760a.onCreateActionMode(mo5152b(bVar), m8925a(menu));
        }

        /* renamed from: a */
        public boolean mo4936a(C1522b bVar, MenuItem menuItem) {
            return this.f4760a.onActionItemClicked(mo5152b(bVar), C1571r.m9238a(this.f4761b, (C0539b) menuItem));
        }

        /* renamed from: b */
        public ActionMode mo5152b(C1522b bVar) {
            int size = this.f4762c.size();
            for (int i = 0; i < size; i++) {
                C1527f fVar = this.f4762c.get(i);
                if (fVar != null && fVar.f4759b == bVar) {
                    return fVar;
                }
            }
            C1527f fVar2 = new C1527f(this.f4761b, bVar);
            this.f4762c.add(fVar2);
            return fVar2;
        }

        /* renamed from: b */
        public boolean mo4937b(C1522b bVar, Menu menu) {
            return this.f4760a.onPrepareActionMode(mo5152b(bVar), m8925a(menu));
        }
    }

    public C1527f(Context context, C1522b bVar) {
        this.f4758a = context;
        this.f4759b = bVar;
    }

    public void finish() {
        this.f4759b.mo4730c();
    }

    public View getCustomView() {
        return this.f4759b.mo4736i();
    }

    public Menu getMenu() {
        return C1571r.m9237a(this.f4758a, (C0538a) this.f4759b.mo4726b());
    }

    public MenuInflater getMenuInflater() {
        return this.f4759b.mo4717a();
    }

    public CharSequence getSubtitle() {
        return this.f4759b.mo4734g();
    }

    public Object getTag() {
        return this.f4759b.mo5121j();
    }

    public CharSequence getTitle() {
        return this.f4759b.mo4733f();
    }

    public boolean getTitleOptionalHint() {
        return this.f4759b.mo5122k();
    }

    public void invalidate() {
        this.f4759b.mo4731d();
    }

    public boolean isTitleOptional() {
        return this.f4759b.mo4735h();
    }

    public void setCustomView(View view) {
        this.f4759b.mo4721a(view);
    }

    public void setSubtitle(int i) {
        this.f4759b.mo4727b(i);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f4759b.mo4722a(charSequence);
    }

    public void setTag(Object obj) {
        this.f4759b.mo5120a(obj);
    }

    public void setTitle(int i) {
        this.f4759b.mo4718a(i);
    }

    public void setTitle(CharSequence charSequence) {
        this.f4759b.mo4729b(charSequence);
    }

    public void setTitleOptionalHint(boolean z) {
        this.f4759b.mo4723a(z);
    }
}
