package android.support.p036v7.app;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.C0007ae;
import android.support.annotation.C0020ao;
import android.support.p036v7.app.C1419i;
import android.support.p036v7.view.C1522b;
import android.support.p036v7.view.C1527f;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.ActionMode;
import android.view.Window;

@C0007ae(mo1a = 14)
@TargetApi(14)
/* renamed from: android.support.v7.app.l */
class C1426l extends C1425k {

    /* renamed from: E */
    private static final String f4451E = "appcompat:local_night_mode";

    /* renamed from: F */
    private int f4452F = -100;

    /* renamed from: G */
    private boolean f4453G;

    /* renamed from: H */
    private boolean f4454H = true;

    /* renamed from: I */
    private C1428b f4455I;

    /* renamed from: android.support.v7.app.l$a */
    class C1427a extends C1419i.C1422b {
        C1427a(Window.Callback callback) {
            super(callback);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final ActionMode mo4903a(ActionMode.Callback callback) {
            C1527f.C1528a aVar = new C1527f.C1528a(C1426l.this.f4435l, callback);
            C1522b a = C1426l.this.mo4850a((C1522b.C1523a) aVar);
            if (a != null) {
                return aVar.mo5152b(a);
            }
            return null;
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return C1426l.this.mo4875j() ? mo4903a(callback) : super.onWindowStartingActionMode(callback);
        }
    }

    @C0020ao
    /* renamed from: android.support.v7.app.l$b */
    final class C1428b {

        /* renamed from: b */
        private C1393aa f4458b;

        /* renamed from: c */
        private boolean f4459c;

        /* renamed from: d */
        private BroadcastReceiver f4460d;

        /* renamed from: e */
        private IntentFilter f4461e;

        C1428b(C1393aa aaVar) {
            this.f4458b = aaVar;
            this.f4459c = aaVar.mo4704a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final int mo4905a() {
            this.f4459c = this.f4458b.mo4704a();
            return this.f4459c ? 2 : 1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final void mo4906b() {
            boolean a = this.f4458b.mo4704a();
            if (a != this.f4459c) {
                this.f4459c = a;
                C1426l.this.mo4876k();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public final void mo4907c() {
            mo4908d();
            if (this.f4460d == null) {
                this.f4460d = new BroadcastReceiver() {
                    public void onReceive(Context context, Intent intent) {
                        C1428b.this.mo4906b();
                    }
                };
            }
            if (this.f4461e == null) {
                this.f4461e = new IntentFilter();
                this.f4461e.addAction("android.intent.action.TIME_SET");
                this.f4461e.addAction("android.intent.action.TIMEZONE_CHANGED");
                this.f4461e.addAction("android.intent.action.TIME_TICK");
            }
            C1426l.this.f4435l.registerReceiver(this.f4460d, this.f4461e);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public final void mo4908d() {
            if (this.f4460d != null) {
                C1426l.this.f4435l.unregisterReceiver(this.f4460d);
                this.f4460d = null;
            }
        }
    }

    C1426l(Context context, Window window, C1416g gVar) {
        super(context, window, gVar);
    }

    /* renamed from: A */
    private int m8406A() {
        return this.f4452F != -100 ? this.f4452F : m8341l();
    }

    /* renamed from: B */
    private void m8407B() {
        if (this.f4455I == null) {
            this.f4455I = new C1428b(C1393aa.m8068a(this.f4435l));
        }
    }

    /* renamed from: C */
    private boolean m8408C() {
        if (!this.f4453G || !(this.f4435l instanceof Activity)) {
            return false;
        }
        try {
            return (this.f4435l.getPackageManager().getActivityInfo(new ComponentName(this.f4435l, this.f4435l.getClass()), 0).configChanges & 512) == 0;
        } catch (PackageManager.NameNotFoundException e) {
            Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e);
            return true;
        }
    }

    /* renamed from: k */
    private boolean m8409k(int i) {
        Resources resources = this.f4435l.getResources();
        Configuration configuration = resources.getConfiguration();
        int i2 = configuration.uiMode & 48;
        int i3 = i == 2 ? 32 : 16;
        if (i2 == i3) {
            return false;
        }
        if (m8408C()) {
            ((Activity) this.f4435l).recreate();
        } else {
            Configuration configuration2 = new Configuration(configuration);
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            configuration2.uiMode = i3 | (configuration2.uiMode & -49);
            resources.updateConfiguration(configuration2, displayMetrics);
            C1467x.m8595a(resources);
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Window.Callback mo4877a(Window.Callback callback) {
        return new C1427a(callback);
    }

    /* renamed from: a */
    public void mo4853a(Bundle bundle) {
        super.mo4853a(bundle);
        if (bundle != null && this.f4452F == -100) {
            this.f4452F = bundle.getInt(f4451E, -100);
        }
    }

    /* renamed from: a */
    public void mo4858a(boolean z) {
        this.f4454H = z;
    }

    /* renamed from: c */
    public void mo4864c() {
        super.mo4864c();
        mo4876k();
    }

    /* renamed from: c */
    public void mo4865c(Bundle bundle) {
        super.mo4865c(bundle);
        if (this.f4452F != -100) {
            bundle.putInt(f4451E, this.f4452F);
        }
    }

    /* renamed from: d */
    public void mo4867d() {
        super.mo4867d();
        if (this.f4455I != null) {
            this.f4455I.mo4908d();
        }
    }

    /* renamed from: e */
    public void mo4870e(int i) {
        switch (i) {
            case -1:
            case 0:
            case 1:
            case 2:
                if (this.f4452F != i) {
                    this.f4452F = i;
                    if (this.f4453G) {
                        mo4876k();
                        return;
                    }
                    return;
                }
                return;
            default:
                Log.i("AppCompatDelegate", "setLocalNightMode() called with an unknown mode");
                return;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo4901g(int i) {
        switch (i) {
            case -100:
                return -1;
            case 0:
                m8407B();
                return this.f4455I.mo4905a();
            default:
                return i;
        }
    }

    /* renamed from: g */
    public void mo4872g() {
        super.mo4872g();
        if (this.f4455I != null) {
            this.f4455I.mo4908d();
        }
    }

    /* renamed from: j */
    public boolean mo4875j() {
        return this.f4454H;
    }

    /* renamed from: k */
    public boolean mo4876k() {
        boolean z = false;
        int A = m8406A();
        int g = mo4901g(A);
        if (g != -1) {
            z = m8409k(g);
        }
        if (A == 0) {
            m8407B();
            this.f4455I.mo4907c();
        }
        this.f4453G = true;
        return z;
    }

    /* access modifiers changed from: package-private */
    @C0020ao
    /* renamed from: u */
    public final C1428b mo4902u() {
        m8407B();
        return this.f4455I;
    }
}
