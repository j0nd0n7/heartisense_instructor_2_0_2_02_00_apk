package android.support.p036v7.view;

import android.support.annotation.C0011ag;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* renamed from: android.support.v7.view.b */
public abstract class C1522b {

    /* renamed from: a */
    private Object f4746a;

    /* renamed from: b */
    private boolean f4747b;

    /* renamed from: android.support.v7.view.b$a */
    public interface C1523a {
        /* renamed from: a */
        void mo4934a(C1522b bVar);

        /* renamed from: a */
        boolean mo4935a(C1522b bVar, Menu menu);

        /* renamed from: a */
        boolean mo4936a(C1522b bVar, MenuItem menuItem);

        /* renamed from: b */
        boolean mo4937b(C1522b bVar, Menu menu);
    }

    /* renamed from: a */
    public abstract MenuInflater mo4717a();

    /* renamed from: a */
    public abstract void mo4718a(int i);

    /* renamed from: a */
    public abstract void mo4721a(View view);

    /* renamed from: a */
    public abstract void mo4722a(CharSequence charSequence);

    /* renamed from: a */
    public void mo5120a(Object obj) {
        this.f4746a = obj;
    }

    /* renamed from: a */
    public void mo4723a(boolean z) {
        this.f4747b = z;
    }

    /* renamed from: b */
    public abstract Menu mo4726b();

    /* renamed from: b */
    public abstract void mo4727b(int i);

    /* renamed from: b */
    public abstract void mo4729b(CharSequence charSequence);

    /* renamed from: c */
    public abstract void mo4730c();

    /* renamed from: d */
    public abstract void mo4731d();

    /* renamed from: f */
    public abstract CharSequence mo4733f();

    /* renamed from: g */
    public abstract CharSequence mo4734g();

    /* renamed from: h */
    public boolean mo4735h() {
        return false;
    }

    /* renamed from: i */
    public abstract View mo4736i();

    /* renamed from: j */
    public Object mo5121j() {
        return this.f4746a;
    }

    /* renamed from: k */
    public boolean mo5122k() {
        return this.f4747b;
    }

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    /* renamed from: l */
    public boolean mo5123l() {
        return true;
    }
}
