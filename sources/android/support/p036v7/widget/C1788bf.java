package android.support.p036v7.widget;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.support.p010v4.view.C1147e;
import android.support.p036v7.p037a.C1359b;
import android.support.p036v7.p038b.p039a.C1477b;
import android.support.p036v7.widget.C1831e;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: android.support.v7.widget.bf */
public class C1788bf extends C1147e {

    /* renamed from: a */
    public static final String f5983a = "share_history.xml";

    /* renamed from: e */
    private static final int f5984e = 4;

    /* renamed from: b */
    final Context f5985b;

    /* renamed from: c */
    String f5986c = f5983a;

    /* renamed from: d */
    C1789a f5987d;

    /* renamed from: f */
    private int f5988f = 4;

    /* renamed from: g */
    private final C1791c f5989g = new C1791c();

    /* renamed from: h */
    private C1831e.C1837f f5990h;

    /* renamed from: android.support.v7.widget.bf$a */
    public interface C1789a {
        /* renamed from: a */
        boolean mo7193a(C1788bf bfVar, Intent intent);
    }

    /* renamed from: android.support.v7.widget.bf$b */
    private class C1790b implements C1831e.C1837f {
        C1790b() {
        }

        /* renamed from: a */
        public boolean mo7194a(C1831e eVar, Intent intent) {
            if (C1788bf.this.f5987d == null) {
                return false;
            }
            C1788bf.this.f5987d.mo7193a(C1788bf.this, intent);
            return false;
        }
    }

    /* renamed from: android.support.v7.widget.bf$c */
    private class C1791c implements MenuItem.OnMenuItemClickListener {
        C1791c() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            Intent b = C1831e.m11112a(C1788bf.this.f5985b, C1788bf.this.f5986c).mo7377b(menuItem.getItemId());
            if (b == null) {
                return true;
            }
            String action = b.getAction();
            if ("android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action)) {
                C1788bf.this.mo7192b(b);
            }
            C1788bf.this.f5985b.startActivity(b);
            return true;
        }
    }

    public C1788bf(Context context) {
        super(context);
        this.f5985b = context;
    }

    /* renamed from: i */
    private void m10820i() {
        if (this.f5987d != null) {
            if (this.f5990h == null) {
                this.f5990h = new C1790b();
            }
            C1831e.m11112a(this.f5985b, this.f5986c).mo7375a(this.f5990h);
        }
    }

    /* renamed from: a */
    public void mo7189a(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if ("android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action)) {
                mo7192b(intent);
            }
        }
        C1831e.m11112a(this.f5985b, this.f5986c).mo7373a(intent);
    }

    /* renamed from: a */
    public void mo7190a(C1789a aVar) {
        this.f5987d = aVar;
        m10820i();
    }

    /* renamed from: a */
    public void mo3961a(SubMenu subMenu) {
        subMenu.clear();
        C1831e a = C1831e.m11112a(this.f5985b, this.f5986c);
        PackageManager packageManager = this.f5985b.getPackageManager();
        int b = a.mo7376b();
        int min = Math.min(b, this.f5988f);
        for (int i = 0; i < min; i++) {
            ResolveInfo a2 = a.mo7372a(i);
            subMenu.add(0, i, i, a2.loadLabel(packageManager)).setIcon(a2.loadIcon(packageManager)).setOnMenuItemClickListener(this.f5989g);
        }
        if (min < b) {
            SubMenu addSubMenu = subMenu.addSubMenu(0, min, min, this.f5985b.getString(C1359b.C1369j.abc_activity_chooser_view_see_all));
            for (int i2 = 0; i2 < b; i2++) {
                ResolveInfo a3 = a.mo7372a(i2);
                addSubMenu.add(0, i2, i2, a3.loadLabel(packageManager)).setIcon(a3.loadIcon(packageManager)).setOnMenuItemClickListener(this.f5989g);
            }
        }
    }

    /* renamed from: a */
    public void mo7191a(String str) {
        this.f5986c = str;
        m10820i();
    }

    /* renamed from: b */
    public View mo3963b() {
        ActivityChooserView activityChooserView = new ActivityChooserView(this.f5985b);
        if (!activityChooserView.isInEditMode()) {
            activityChooserView.setActivityChooserModel(C1831e.m11112a(this.f5985b, this.f5986c));
        }
        TypedValue typedValue = new TypedValue();
        this.f5985b.getTheme().resolveAttribute(C1359b.C1361b.actionModeShareDrawable, typedValue, true);
        activityChooserView.setExpandActivityOverflowButtonDrawable(C1477b.m8692b(this.f5985b, typedValue.resourceId));
        activityChooserView.setProvider(this);
        activityChooserView.setDefaultActionButtonContentDescription(C1359b.C1369j.abc_shareactionprovider_share_with_application);
        activityChooserView.setExpandActivityOverflowButtonContentDescription(C1359b.C1369j.abc_shareactionprovider_share_with);
        return activityChooserView;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo7192b(Intent intent) {
        if (Build.VERSION.SDK_INT >= 21) {
            intent.addFlags(134742016);
        } else {
            intent.addFlags(524288);
        }
    }

    /* renamed from: g */
    public boolean mo3968g() {
        return true;
    }
}
