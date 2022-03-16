package android.support.p036v7.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.C0011ag;
import android.support.p010v4.p023h.p024a.C0539b;
import android.support.p010v4.view.C1147e;
import android.support.p010v4.view.C1189u;
import android.support.p036v7.p038b.p039a.C1477b;
import android.support.p036v7.view.menu.C1569q;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug;
import android.widget.LinearLayout;

@C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
/* renamed from: android.support.v7.view.menu.k */
public final class C1555k implements C0539b {

    /* renamed from: A */
    private static final int f4981A = 4;

    /* renamed from: B */
    private static final int f4982B = 8;

    /* renamed from: C */
    private static final int f4983C = 16;

    /* renamed from: D */
    private static final int f4984D = 32;

    /* renamed from: K */
    private static String f4985K = null;

    /* renamed from: L */
    private static String f4986L = null;

    /* renamed from: M */
    private static String f4987M = null;

    /* renamed from: N */
    private static String f4988N = null;

    /* renamed from: g */
    static final int f4989g = 0;

    /* renamed from: h */
    private static final String f4990h = "MenuItemImpl";

    /* renamed from: i */
    private static final int f4991i = 3;

    /* renamed from: y */
    private static final int f4992y = 1;

    /* renamed from: z */
    private static final int f4993z = 2;

    /* renamed from: E */
    private int f4994E = 0;

    /* renamed from: F */
    private View f4995F;

    /* renamed from: G */
    private C1147e f4996G;

    /* renamed from: H */
    private C1189u.C1195e f4997H;

    /* renamed from: I */
    private boolean f4998I = false;

    /* renamed from: J */
    private ContextMenu.ContextMenuInfo f4999J;

    /* renamed from: f */
    C1550h f5000f;

    /* renamed from: j */
    private final int f5001j;

    /* renamed from: k */
    private final int f5002k;

    /* renamed from: l */
    private final int f5003l;

    /* renamed from: m */
    private final int f5004m;

    /* renamed from: n */
    private CharSequence f5005n;

    /* renamed from: o */
    private CharSequence f5006o;

    /* renamed from: p */
    private Intent f5007p;

    /* renamed from: q */
    private char f5008q;

    /* renamed from: r */
    private char f5009r;

    /* renamed from: s */
    private Drawable f5010s;

    /* renamed from: t */
    private int f5011t = 0;

    /* renamed from: u */
    private C1576v f5012u;

    /* renamed from: v */
    private Runnable f5013v;

    /* renamed from: w */
    private MenuItem.OnMenuItemClickListener f5014w;

    /* renamed from: x */
    private int f5015x = 16;

    C1555k(C1550h hVar, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f5000f = hVar;
        this.f5001j = i2;
        this.f5002k = i;
        this.f5003l = i3;
        this.f5004m = i4;
        this.f5005n = charSequence;
        this.f4994E = i5;
    }

    /* renamed from: a */
    public C0539b setActionView(int i) {
        Context f = this.f5000f.mo5376f();
        setActionView(LayoutInflater.from(f).inflate(i, new LinearLayout(f), false));
        return this;
    }

    /* renamed from: a */
    public C0539b mo1930a(C1147e eVar) {
        if (this.f4996G != null) {
            this.f4996G.mo3969h();
        }
        this.f4995F = null;
        this.f4996G = eVar;
        this.f5000f.mo5362c(true);
        if (this.f4996G != null) {
            this.f4996G.mo3960a((C1147e.C1149b) new C1147e.C1149b() {
                /* renamed from: a */
                public void mo3971a(boolean z) {
                    C1555k.this.f5000f.mo5335a(C1555k.this);
                }
            });
        }
        return this;
    }

    /* renamed from: a */
    public C0539b mo1931a(C1189u.C1195e eVar) {
        this.f4997H = eVar;
        return this;
    }

    /* renamed from: a */
    public C0539b setActionView(View view) {
        this.f4995F = view;
        this.f4996G = null;
        if (view != null && view.getId() == -1 && this.f5001j > 0) {
            view.setId(this.f5001j);
        }
        this.f5000f.mo5357b(this);
        return this;
    }

    /* renamed from: a */
    public C1147e mo1932a() {
        return this.f4996G;
    }

    /* renamed from: a */
    public MenuItem mo5414a(Runnable runnable) {
        this.f5013v = runnable;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public CharSequence mo5415a(C1569q.C1570a aVar) {
        return (aVar == null || !aVar.mo5186a()) ? getTitle() : getTitleCondensed();
    }

    /* renamed from: a */
    public void mo5416a(C1576v vVar) {
        this.f5012u = vVar;
        vVar.setHeaderTitle(getTitle());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo5417a(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f4999J = contextMenuInfo;
    }

    /* renamed from: a */
    public void mo5418a(boolean z) {
        this.f5015x = (z ? 4 : 0) | (this.f5015x & -5);
    }

    /* renamed from: b */
    public C0539b setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo5420b(boolean z) {
        int i = this.f5015x;
        this.f5015x = (z ? 2 : 0) | (this.f5015x & -3);
        if (i != this.f5015x) {
            this.f5000f.mo5362c(false);
        }
    }

    /* renamed from: b */
    public boolean mo5421b() {
        if ((this.f5014w != null && this.f5014w.onMenuItemClick(this)) || this.f5000f.mo5342a(this.f5000f.mo5394q(), (MenuItem) this)) {
            return true;
        }
        if (this.f5013v != null) {
            this.f5013v.run();
            return true;
        }
        if (this.f5007p != null) {
            try {
                this.f5000f.mo5376f().startActivity(this.f5007p);
                return true;
            } catch (ActivityNotFoundException e) {
                Log.e(f4990h, "Can't find activity to handle intent; ignoring", e);
            }
        }
        return this.f4996G != null && this.f4996G.mo3967f();
    }

    /* renamed from: c */
    public int mo5422c() {
        return this.f5004m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo5423c(boolean z) {
        int i = this.f5015x;
        this.f5015x = (z ? 0 : 8) | (this.f5015x & -9);
        return i != this.f5015x;
    }

    public boolean collapseActionView() {
        if ((this.f4994E & 8) == 0) {
            return false;
        }
        if (this.f4995F == null) {
            return true;
        }
        if (this.f4997H == null || this.f4997H.mo4023b(this)) {
            return this.f5000f.mo5372d(this);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Runnable mo5424d() {
        return this.f5013v;
    }

    /* renamed from: d */
    public void mo5425d(boolean z) {
        if (z) {
            this.f5015x |= 32;
        } else {
            this.f5015x &= -33;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public char mo5426e() {
        return this.f5000f.mo5363c() ? this.f5009r : this.f5008q;
    }

    /* renamed from: e */
    public void mo5427e(boolean z) {
        this.f4998I = z;
        this.f5000f.mo5362c(false);
    }

    public boolean expandActionView() {
        if (!mo5454o()) {
            return false;
        }
        if (this.f4997H == null || this.f4997H.mo4022a(this)) {
            return this.f5000f.mo5364c(this);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public String mo5428f() {
        char e = mo5426e();
        if (e == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(f4985K);
        switch (e) {
            case 8:
                sb.append(f4987M);
                break;
            case 10:
                sb.append(f4986L);
                break;
            case ' ':
                sb.append(f4988N);
                break;
            default:
                sb.append(e);
                break;
        }
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo5429g() {
        return this.f5000f.mo5371d() && mo5426e() != 0;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public View getActionView() {
        if (this.f4995F != null) {
            return this.f4995F;
        }
        if (this.f4996G == null) {
            return null;
        }
        this.f4995F = this.f4996G.mo3958a((MenuItem) this);
        return this.f4995F;
    }

    public char getAlphabeticShortcut() {
        return this.f5009r;
    }

    public int getGroupId() {
        return this.f5002k;
    }

    public Drawable getIcon() {
        if (this.f5010s != null) {
            return this.f5010s;
        }
        if (this.f5011t == 0) {
            return null;
        }
        Drawable b = C1477b.m8692b(this.f5000f.mo5376f(), this.f5011t);
        this.f5011t = 0;
        this.f5010s = b;
        return b;
    }

    public Intent getIntent() {
        return this.f5007p;
    }

    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f5001j;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f4999J;
    }

    public char getNumericShortcut() {
        return this.f5008q;
    }

    public int getOrder() {
        return this.f5003l;
    }

    public SubMenu getSubMenu() {
        return this.f5012u;
    }

    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f5005n;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f5006o != null ? this.f5006o : this.f5005n;
        return (Build.VERSION.SDK_INT >= 18 || charSequence == null || (charSequence instanceof String)) ? charSequence : charSequence.toString();
    }

    /* renamed from: h */
    public boolean mo5442h() {
        return (this.f5015x & 4) != 0;
    }

    public boolean hasSubMenu() {
        return this.f5012u != null;
    }

    /* renamed from: i */
    public void mo5444i() {
        this.f5000f.mo5357b(this);
    }

    public boolean isActionViewExpanded() {
        return this.f4998I;
    }

    public boolean isCheckable() {
        return (this.f5015x & 1) == 1;
    }

    public boolean isChecked() {
        return (this.f5015x & 2) == 2;
    }

    public boolean isEnabled() {
        return (this.f5015x & 16) != 0;
    }

    public boolean isVisible() {
        return (this.f4996G == null || !this.f4996G.mo3964c()) ? (this.f5015x & 8) == 0 : (this.f5015x & 8) == 0 && this.f4996G.mo3965d();
    }

    /* renamed from: j */
    public boolean mo5449j() {
        return this.f5000f.mo5395r();
    }

    /* renamed from: k */
    public boolean mo5450k() {
        return (this.f5015x & 32) == 32;
    }

    /* renamed from: l */
    public boolean mo5451l() {
        return (this.f4994E & 1) == 1;
    }

    /* renamed from: m */
    public boolean mo5452m() {
        return (this.f4994E & 2) == 2;
    }

    /* renamed from: n */
    public boolean mo5453n() {
        return (this.f4994E & 4) == 4;
    }

    /* renamed from: o */
    public boolean mo5454o() {
        if ((this.f4994E & 8) == 0) {
            return false;
        }
        if (this.f4995F == null && this.f4996G != null) {
            this.f4995F = this.f4996G.mo3958a((MenuItem) this);
        }
        return this.f4995F != null;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public MenuItem setAlphabeticShortcut(char c) {
        if (this.f5009r != c) {
            this.f5009r = Character.toLowerCase(c);
            this.f5000f.mo5362c(false);
        }
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        int i = this.f5015x;
        this.f5015x = (z ? 1 : 0) | (this.f5015x & -2);
        if (i != this.f5015x) {
            this.f5000f.mo5362c(false);
        }
        return this;
    }

    public MenuItem setChecked(boolean z) {
        if ((this.f5015x & 4) != 0) {
            this.f5000f.mo5339a((MenuItem) this);
        } else {
            mo5420b(z);
        }
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        if (z) {
            this.f5015x |= 16;
        } else {
            this.f5015x &= -17;
        }
        this.f5000f.mo5362c(false);
        return this;
    }

    public MenuItem setIcon(int i) {
        this.f5010s = null;
        this.f5011t = i;
        this.f5000f.mo5362c(false);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f5011t = 0;
        this.f5010s = drawable;
        this.f5000f.mo5362c(false);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f5007p = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        if (this.f5008q != c) {
            this.f5008q = c;
            this.f5000f.mo5362c(false);
        }
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setOnActionExpandListener()");
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f5014w = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f5008q = c;
        this.f5009r = Character.toLowerCase(c2);
        this.f5000f.mo5362c(false);
        return this;
    }

    public void setShowAsAction(int i) {
        switch (i & 3) {
            case 0:
            case 1:
            case 2:
                this.f4994E = i;
                this.f5000f.mo5357b(this);
                return;
            default:
                throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
    }

    public MenuItem setTitle(int i) {
        return setTitle((CharSequence) this.f5000f.mo5376f().getString(i));
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f5005n = charSequence;
        this.f5000f.mo5362c(false);
        if (this.f5012u != null) {
            this.f5012u.setHeaderTitle(charSequence);
        }
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f5006o = charSequence;
        if (charSequence == null) {
            CharSequence charSequence2 = this.f5005n;
        }
        this.f5000f.mo5362c(false);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        if (mo5423c(z)) {
            this.f5000f.mo5335a(this);
        }
        return this;
    }

    public String toString() {
        if (this.f5005n != null) {
            return this.f5005n.toString();
        }
        return null;
    }
}
