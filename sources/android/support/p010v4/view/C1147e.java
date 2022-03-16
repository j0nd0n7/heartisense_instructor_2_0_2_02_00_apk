package android.support.p010v4.view;

import android.content.Context;
import android.support.annotation.C0011ag;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: android.support.v4.view.e */
public abstract class C1147e {

    /* renamed from: a */
    private static final String f3557a = "ActionProvider(support)";

    /* renamed from: b */
    private final Context f3558b;

    /* renamed from: c */
    private C1148a f3559c;

    /* renamed from: d */
    private C1149b f3560d;

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    /* renamed from: android.support.v4.view.e$a */
    public interface C1148a {
        /* renamed from: a */
        void mo3970a(boolean z);
    }

    /* renamed from: android.support.v4.view.e$b */
    public interface C1149b {
        /* renamed from: a */
        void mo3971a(boolean z);
    }

    public C1147e(Context context) {
        this.f3558b = context;
    }

    /* renamed from: a */
    public Context mo3957a() {
        return this.f3558b;
    }

    /* renamed from: a */
    public View mo3958a(MenuItem menuItem) {
        return mo3963b();
    }

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    /* renamed from: a */
    public void mo3959a(C1148a aVar) {
        this.f3559c = aVar;
    }

    /* renamed from: a */
    public void mo3960a(C1149b bVar) {
        if (!(this.f3560d == null || bVar == null)) {
            Log.w(f3557a, "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f3560d = bVar;
    }

    /* renamed from: a */
    public void mo3961a(SubMenu subMenu) {
    }

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    /* renamed from: a */
    public void mo3962a(boolean z) {
        if (this.f3559c != null) {
            this.f3559c.mo3970a(z);
        }
    }

    /* renamed from: b */
    public abstract View mo3963b();

    /* renamed from: c */
    public boolean mo3964c() {
        return false;
    }

    /* renamed from: d */
    public boolean mo3965d() {
        return true;
    }

    /* renamed from: e */
    public void mo3966e() {
        if (this.f3560d != null && mo3964c()) {
            this.f3560d.mo3971a(mo3965d());
        }
    }

    /* renamed from: f */
    public boolean mo3967f() {
        return false;
    }

    /* renamed from: g */
    public boolean mo3968g() {
        return false;
    }

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    /* renamed from: h */
    public void mo3969h() {
        this.f3560d = null;
        this.f3559c = null;
    }
}
