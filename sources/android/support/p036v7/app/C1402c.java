package android.support.p036v7.app;

import android.annotation.TargetApi;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.C0003aa;
import android.support.annotation.C0007ae;
import android.support.annotation.C0015aj;
import android.support.annotation.C0047z;
import android.support.p010v4.view.C1161h;
import android.support.p010v4.widget.C1307j;
import android.support.p036v7.app.C1411d;
import android.support.p036v7.p040c.p041a.C1481b;
import android.support.p036v7.widget.Toolbar;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;

/* renamed from: android.support.v7.app.c */
public class C1402c implements C1307j.C1313f {

    /* renamed from: a */
    boolean f4383a;

    /* renamed from: b */
    View.OnClickListener f4384b;

    /* renamed from: c */
    private final C1404a f4385c;

    /* renamed from: d */
    private final C1307j f4386d;

    /* renamed from: e */
    private C1481b f4387e;

    /* renamed from: f */
    private boolean f4388f;

    /* renamed from: g */
    private Drawable f4389g;

    /* renamed from: h */
    private boolean f4390h;

    /* renamed from: i */
    private final int f4391i;

    /* renamed from: j */
    private final int f4392j;

    /* renamed from: k */
    private boolean f4393k;

    /* renamed from: android.support.v7.app.c$a */
    public interface C1404a {
        /* renamed from: a */
        Drawable mo4757a();

        /* renamed from: a */
        void mo4758a(@C0015aj int i);

        /* renamed from: a */
        void mo4759a(Drawable drawable, @C0015aj int i);

        /* renamed from: b */
        Context mo4760b();

        /* renamed from: c */
        boolean mo4761c();
    }

    /* renamed from: android.support.v7.app.c$b */
    public interface C1405b {
        @C0003aa
        /* renamed from: b */
        C1404a mo4762b();
    }

    /* renamed from: android.support.v7.app.c$c */
    static class C1406c implements C1404a {

        /* renamed from: a */
        final Activity f4395a;

        C1406c(Activity activity) {
            this.f4395a = activity;
        }

        /* renamed from: a */
        public Drawable mo4757a() {
            return null;
        }

        /* renamed from: a */
        public void mo4758a(@C0015aj int i) {
        }

        /* renamed from: a */
        public void mo4759a(Drawable drawable, @C0015aj int i) {
        }

        /* renamed from: b */
        public Context mo4760b() {
            return this.f4395a;
        }

        /* renamed from: c */
        public boolean mo4761c() {
            return true;
        }
    }

    @C0007ae(mo1a = 11)
    @TargetApi(11)
    /* renamed from: android.support.v7.app.c$d */
    private static class C1407d implements C1404a {

        /* renamed from: a */
        final Activity f4396a;

        /* renamed from: b */
        C1411d.C1412a f4397b;

        C1407d(Activity activity) {
            this.f4396a = activity;
        }

        /* renamed from: a */
        public Drawable mo4757a() {
            return C1411d.m8258a(this.f4396a);
        }

        /* renamed from: a */
        public void mo4758a(int i) {
            this.f4397b = C1411d.m8259a(this.f4397b, this.f4396a, i);
        }

        /* renamed from: a */
        public void mo4759a(Drawable drawable, int i) {
            ActionBar actionBar = this.f4396a.getActionBar();
            if (actionBar != null) {
                actionBar.setDisplayShowHomeEnabled(true);
                this.f4397b = C1411d.m8260a(this.f4397b, this.f4396a, drawable, i);
                actionBar.setDisplayShowHomeEnabled(false);
            }
        }

        /* renamed from: b */
        public Context mo4760b() {
            return this.f4396a;
        }

        /* renamed from: c */
        public boolean mo4761c() {
            ActionBar actionBar = this.f4396a.getActionBar();
            return (actionBar == null || (actionBar.getDisplayOptions() & 4) == 0) ? false : true;
        }
    }

    @C0007ae(mo1a = 14)
    @TargetApi(14)
    /* renamed from: android.support.v7.app.c$e */
    private static class C1408e extends C1407d {
        C1408e(Activity activity) {
            super(activity);
        }

        /* renamed from: b */
        public Context mo4760b() {
            ActionBar actionBar = this.f4396a.getActionBar();
            return actionBar != null ? actionBar.getThemedContext() : this.f4396a;
        }
    }

    @C0007ae(mo1a = 18)
    @TargetApi(18)
    /* renamed from: android.support.v7.app.c$f */
    private static class C1409f implements C1404a {

        /* renamed from: a */
        final Activity f4398a;

        C1409f(Activity activity) {
            this.f4398a = activity;
        }

        /* renamed from: a */
        public Drawable mo4757a() {
            TypedArray obtainStyledAttributes = mo4760b().obtainStyledAttributes((AttributeSet) null, new int[]{16843531}, 16843470, 0);
            Drawable drawable = obtainStyledAttributes.getDrawable(0);
            obtainStyledAttributes.recycle();
            return drawable;
        }

        /* renamed from: a */
        public void mo4758a(int i) {
            ActionBar actionBar = this.f4398a.getActionBar();
            if (actionBar != null) {
                actionBar.setHomeActionContentDescription(i);
            }
        }

        /* renamed from: a */
        public void mo4759a(Drawable drawable, int i) {
            ActionBar actionBar = this.f4398a.getActionBar();
            if (actionBar != null) {
                actionBar.setHomeAsUpIndicator(drawable);
                actionBar.setHomeActionContentDescription(i);
            }
        }

        /* renamed from: b */
        public Context mo4760b() {
            ActionBar actionBar = this.f4398a.getActionBar();
            return actionBar != null ? actionBar.getThemedContext() : this.f4398a;
        }

        /* renamed from: c */
        public boolean mo4761c() {
            ActionBar actionBar = this.f4398a.getActionBar();
            return (actionBar == null || (actionBar.getDisplayOptions() & 4) == 0) ? false : true;
        }
    }

    /* renamed from: android.support.v7.app.c$g */
    static class C1410g implements C1404a {

        /* renamed from: a */
        final Toolbar f4399a;

        /* renamed from: b */
        final Drawable f4400b;

        /* renamed from: c */
        final CharSequence f4401c;

        C1410g(Toolbar toolbar) {
            this.f4399a = toolbar;
            this.f4400b = toolbar.getNavigationIcon();
            this.f4401c = toolbar.getNavigationContentDescription();
        }

        /* renamed from: a */
        public Drawable mo4757a() {
            return this.f4400b;
        }

        /* renamed from: a */
        public void mo4758a(@C0015aj int i) {
            if (i == 0) {
                this.f4399a.setNavigationContentDescription(this.f4401c);
            } else {
                this.f4399a.setNavigationContentDescription(i);
            }
        }

        /* renamed from: a */
        public void mo4759a(Drawable drawable, @C0015aj int i) {
            this.f4399a.setNavigationIcon(drawable);
            mo4758a(i);
        }

        /* renamed from: b */
        public Context mo4760b() {
            return this.f4399a.getContext();
        }

        /* renamed from: c */
        public boolean mo4761c() {
            return true;
        }
    }

    public C1402c(Activity activity, C1307j jVar, @C0015aj int i, @C0015aj int i2) {
        this(activity, (Toolbar) null, jVar, (C1481b) null, i, i2);
    }

    public C1402c(Activity activity, C1307j jVar, Toolbar toolbar, @C0015aj int i, @C0015aj int i2) {
        this(activity, toolbar, jVar, (C1481b) null, i, i2);
    }

    C1402c(Activity activity, Toolbar toolbar, C1307j jVar, C1481b bVar, @C0015aj int i, @C0015aj int i2) {
        this.f4388f = true;
        this.f4383a = true;
        this.f4393k = false;
        if (toolbar != null) {
            this.f4385c = new C1410g(toolbar);
            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    if (C1402c.this.f4383a) {
                        C1402c.this.mo4748b();
                    } else if (C1402c.this.f4384b != null) {
                        C1402c.this.f4384b.onClick(view);
                    }
                }
            });
        } else if (activity instanceof C1405b) {
            this.f4385c = ((C1405b) activity).mo4762b();
        } else if (Build.VERSION.SDK_INT >= 18) {
            this.f4385c = new C1409f(activity);
        } else if (Build.VERSION.SDK_INT >= 14) {
            this.f4385c = new C1408e(activity);
        } else if (Build.VERSION.SDK_INT >= 11) {
            this.f4385c = new C1407d(activity);
        } else {
            this.f4385c = new C1406c(activity);
        }
        this.f4386d = jVar;
        this.f4391i = i;
        this.f4392j = i2;
        if (bVar == null) {
            this.f4387e = new C1481b(this.f4385c.mo4760b());
        } else {
            this.f4387e = bVar;
        }
        this.f4389g = mo4755g();
    }

    /* renamed from: a */
    private void m8209a(float f) {
        if (f == 1.0f) {
            this.f4387e.mo5020b(true);
        } else if (f == 0.0f) {
            this.f4387e.mo5020b(false);
        }
        this.f4387e.mo5029f(f);
    }

    /* renamed from: a */
    public void mo4739a() {
        if (this.f4386d.mo4423g((int) C1161h.f3608c)) {
            m8209a(1.0f);
        } else {
            m8209a(0.0f);
        }
        if (this.f4383a) {
            mo4743a((Drawable) this.f4387e, this.f4386d.mo4423g((int) C1161h.f3608c) ? this.f4392j : this.f4391i);
        }
    }

    /* renamed from: a */
    public void mo4740a(int i) {
        Drawable drawable = null;
        if (i != 0) {
            drawable = this.f4386d.getResources().getDrawable(i);
        }
        mo4742a(drawable);
    }

    /* renamed from: a */
    public void mo4741a(Configuration configuration) {
        if (!this.f4390h) {
            this.f4389g = mo4755g();
        }
        mo4739a();
    }

    /* renamed from: a */
    public void mo4742a(Drawable drawable) {
        if (drawable == null) {
            this.f4389g = mo4755g();
            this.f4390h = false;
        } else {
            this.f4389g = drawable;
            this.f4390h = true;
        }
        if (!this.f4383a) {
            mo4743a(this.f4389g, 0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4743a(Drawable drawable, int i) {
        if (!this.f4393k && !this.f4385c.mo4761c()) {
            Log.w("ActionBarDrawerToggle", "DrawerToggle may not show up because NavigationIcon is not visible. You may need to call actionbar.setDisplayHomeAsUpEnabled(true);");
            this.f4393k = true;
        }
        this.f4385c.mo4759a(drawable, i);
    }

    /* renamed from: a */
    public void mo4744a(@C0047z C1481b bVar) {
        this.f4387e = bVar;
        mo4739a();
    }

    /* renamed from: a */
    public void mo4745a(View.OnClickListener onClickListener) {
        this.f4384b = onClickListener;
    }

    /* renamed from: a */
    public void mo743a(View view) {
        m8209a(1.0f);
        if (this.f4383a) {
            mo4750c(this.f4392j);
        }
    }

    /* renamed from: a */
    public void mo744a(View view, float f) {
        if (this.f4388f) {
            m8209a(Math.min(1.0f, Math.max(0.0f, f)));
        } else {
            m8209a(0.0f);
        }
    }

    /* renamed from: a */
    public void mo4746a(boolean z) {
        if (z != this.f4383a) {
            if (z) {
                mo4743a((Drawable) this.f4387e, this.f4386d.mo4423g((int) C1161h.f3608c) ? this.f4392j : this.f4391i);
            } else {
                mo4743a(this.f4389g, 0);
            }
            this.f4383a = z;
        }
    }

    /* renamed from: a */
    public boolean mo4747a(MenuItem menuItem) {
        if (menuItem == null || menuItem.getItemId() != 16908332 || !this.f4383a) {
            return false;
        }
        mo4748b();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo4748b() {
        int a = this.f4386d.mo4385a((int) C1161h.f3608c);
        if (this.f4386d.mo4431h((int) C1161h.f3608c) && a != 2) {
            this.f4386d.mo4421f((int) C1161h.f3608c);
        } else if (a != 1) {
            this.f4386d.mo4420e((int) C1161h.f3608c);
        }
    }

    /* renamed from: b */
    public void mo747b(int i) {
    }

    /* renamed from: b */
    public void mo748b(View view) {
        m8209a(0.0f);
        if (this.f4383a) {
            mo4750c(this.f4391i);
        }
    }

    /* renamed from: b */
    public void mo4749b(boolean z) {
        this.f4388f = z;
        if (!z) {
            m8209a(0.0f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo4750c(int i) {
        this.f4385c.mo4758a(i);
    }

    /* renamed from: c */
    public boolean mo4751c() {
        return this.f4383a;
    }

    @C0047z
    /* renamed from: d */
    public C1481b mo4752d() {
        return this.f4387e;
    }

    /* renamed from: e */
    public boolean mo4753e() {
        return this.f4388f;
    }

    /* renamed from: f */
    public View.OnClickListener mo4754f() {
        return this.f4384b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public Drawable mo4755g() {
        return this.f4385c.mo4757a();
    }
}
