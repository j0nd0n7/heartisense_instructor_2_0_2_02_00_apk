package android.support.p036v7.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.support.annotation.C0011ag;
import android.support.annotation.C0016ak;
import android.support.p036v7.p037a.C1359b;
import android.view.LayoutInflater;

@C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
/* renamed from: android.support.v7.view.d */
public class C1525d extends ContextWrapper {

    /* renamed from: a */
    private int f4748a;

    /* renamed from: b */
    private Resources.Theme f4749b;

    /* renamed from: c */
    private LayoutInflater f4750c;

    public C1525d(Context context, @C0016ak int i) {
        super(context);
        this.f4748a = i;
    }

    public C1525d(Context context, Resources.Theme theme) {
        super(context);
        this.f4749b = theme;
    }

    /* renamed from: b */
    private void m8902b() {
        boolean z = this.f4749b == null;
        if (z) {
            this.f4749b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f4749b.setTo(theme);
            }
        }
        mo5127a(this.f4749b, this.f4748a, z);
    }

    /* renamed from: a */
    public int mo5126a() {
        return this.f4748a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo5127a(Resources.Theme theme, int i, boolean z) {
        theme.applyStyle(i, true);
    }

    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f4750c == null) {
            this.f4750c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f4750c;
    }

    public Resources.Theme getTheme() {
        if (this.f4749b != null) {
            return this.f4749b;
        }
        if (this.f4748a == 0) {
            this.f4748a = C1359b.C1370k.Theme_AppCompat_Light;
        }
        m8902b();
        return this.f4749b;
    }

    public void setTheme(int i) {
        if (this.f4748a != i) {
            this.f4748a = i;
            m8902b();
        }
    }
}
