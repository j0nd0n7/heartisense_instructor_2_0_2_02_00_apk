package android.support.p036v7.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.C0003aa;
import android.support.annotation.C0016ak;
import android.support.annotation.C0030i;
import android.support.annotation.C0039r;
import android.support.annotation.C0044w;
import android.support.annotation.C0047z;
import android.support.p010v4.p013c.C0194ae;
import android.support.p010v4.p013c.C0251ax;
import android.support.p010v4.p013c.C0362cf;
import android.support.p010v4.p013c.C0370d;
import android.support.p010v4.view.C1167k;
import android.support.p036v7.app.C1402c;
import android.support.p036v7.view.C1522b;
import android.support.p036v7.widget.C1811br;
import android.support.p036v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: android.support.v7.app.f */
public class C1415f extends C0194ae implements C0362cf.C0363a, C1402c.C1405b, C1416g {

    /* renamed from: u */
    private C1417h f4412u;

    /* renamed from: v */
    private int f4413v = 0;

    /* renamed from: w */
    private boolean f4414w;

    /* renamed from: x */
    private Resources f4415x;

    @C0003aa
    /* renamed from: a */
    public C1522b mo4817a(@C0047z C1522b.C1523a aVar) {
        return null;
    }

    /* renamed from: a */
    public void mo4818a(@C0047z C0362cf cfVar) {
        cfVar.mo1627a((Activity) this);
    }

    @C0030i
    /* renamed from: a */
    public void mo4819a(@C0047z C1522b bVar) {
    }

    /* renamed from: a */
    public void mo4820a(@C0003aa Toolbar toolbar) {
        mo4840o().mo4854a(toolbar);
    }

    /* renamed from: a */
    public boolean mo4821a(@C0047z Intent intent) {
        return C0251ax.m1547a((Activity) this, intent);
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        mo4840o().mo4863b(view, layoutParams);
    }

    @C0003aa
    /* renamed from: b */
    public C1402c.C1404a mo4762b() {
        return mo4840o().mo4873h();
    }

    @C0003aa
    /* renamed from: b */
    public C1522b mo4823b(@C0047z C1522b.C1523a aVar) {
        return mo4840o().mo4850a(aVar);
    }

    /* renamed from: b */
    public void mo4824b(@C0047z Intent intent) {
        C0251ax.m1550b((Activity) this, intent);
    }

    /* renamed from: b */
    public void mo4825b(@C0047z C0362cf cfVar) {
    }

    @C0030i
    /* renamed from: b */
    public void mo4826b(@C0047z C1522b bVar) {
    }

    @Deprecated
    /* renamed from: b */
    public void mo4827b(boolean z) {
    }

    @C0003aa
    /* renamed from: b_ */
    public Intent mo1637b_() {
        return C0251ax.m1548b(this);
    }

    @Deprecated
    /* renamed from: c */
    public void mo4828c(boolean z) {
    }

    /* renamed from: c */
    public boolean mo4829c(int i) {
        return mo4840o().mo4866c(i);
    }

    @Deprecated
    /* renamed from: d */
    public void mo4830d(int i) {
    }

    @Deprecated
    /* renamed from: d */
    public void mo4831d(boolean z) {
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (C1167k.m7005d(keyEvent) && keyEvent.getUnicodeChar(keyEvent.getMetaState() & -28673) == 60) {
            int action = keyEvent.getAction();
            if (action == 0) {
                C1385a l = mo4837l();
                if (l != null && l.mo4671o() && l.mo4680x()) {
                    this.f4414w = true;
                    return true;
                }
            } else if (action == 1 && this.f4414w) {
                this.f4414w = false;
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public View findViewById(@C0039r int i) {
        return mo4840o().mo4851a(i);
    }

    public MenuInflater getMenuInflater() {
        return mo4840o().mo4859b();
    }

    public Resources getResources() {
        if (this.f4415x == null && C1811br.m11020a()) {
            this.f4415x = new C1811br(this, super.getResources());
        }
        return this.f4415x == null ? super.getResources() : this.f4415x;
    }

    /* renamed from: h */
    public void mo956h() {
        mo4840o().mo4871f();
    }

    public void invalidateOptionsMenu() {
        mo4840o().mo4871f();
    }

    @C0003aa
    /* renamed from: l */
    public C1385a mo4837l() {
        return mo4840o().mo4849a();
    }

    /* renamed from: m */
    public boolean mo4838m() {
        Intent b_ = mo1637b_();
        if (b_ == null) {
            return false;
        }
        if (mo4821a(b_)) {
            C0362cf a = C0362cf.m2089a((Context) this);
            mo4818a(a);
            mo4825b(a);
            a.mo1634b();
            try {
                C0370d.m2119b((Activity) this);
            } catch (IllegalStateException e) {
                finish();
            }
        } else {
            mo4824b(b_);
        }
        return true;
    }

    @Deprecated
    /* renamed from: n */
    public void mo4839n() {
    }

    @C0047z
    /* renamed from: o */
    public C1417h mo4840o() {
        if (this.f4412u == null) {
            this.f4412u = C1417h.m8336a((Activity) this, (C1416g) this);
        }
        return this.f4412u;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        mo4840o().mo4852a(configuration);
        if (this.f4415x != null) {
            this.f4415x.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
    }

    public void onContentChanged() {
        mo4839n();
    }

    /* access modifiers changed from: protected */
    public void onCreate(@C0003aa Bundle bundle) {
        C1417h o = mo4840o();
        o.mo4874i();
        o.mo4853a(bundle);
        if (o.mo4876k() && this.f4413v != 0) {
            if (Build.VERSION.SDK_INT >= 23) {
                onApplyThemeResource(getTheme(), this.f4413v, false);
            } else {
                setTheme(this.f4413v);
            }
        }
        super.onCreate(bundle);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        mo4840o().mo4872g();
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        C1385a l = mo4837l();
        if (menuItem.getItemId() != 16908332 || l == null || (l.mo4652g() & 4) == 0) {
            return false;
        }
        return mo4838m();
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    /* access modifiers changed from: protected */
    public void onPostCreate(@C0003aa Bundle bundle) {
        super.onPostCreate(bundle);
        mo4840o().mo4862b(bundle);
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        mo4840o().mo4869e();
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        mo4840o().mo4865c(bundle);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        mo4840o().mo4864c();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        mo4840o().mo4867d();
    }

    /* access modifiers changed from: protected */
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        mo4840o().mo4857a(charSequence);
    }

    public void setContentView(@C0044w int i) {
        mo4840o().mo4861b(i);
    }

    public void setContentView(View view) {
        mo4840o().mo4855a(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        mo4840o().mo4856a(view, layoutParams);
    }

    public void setTheme(@C0016ak int i) {
        super.setTheme(i);
        this.f4413v = i;
    }
}
