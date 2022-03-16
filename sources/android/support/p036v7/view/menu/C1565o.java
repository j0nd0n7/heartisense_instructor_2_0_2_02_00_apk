package android.support.p036v7.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.support.annotation.C0003aa;
import android.support.annotation.C0011ag;
import android.support.annotation.C0016ak;
import android.support.annotation.C0027f;
import android.support.annotation.C0047z;
import android.support.p010v4.view.C1040ar;
import android.support.p010v4.view.C1161h;
import android.support.p036v7.p037a.C1359b;
import android.support.p036v7.view.menu.C1567p;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;

@C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
/* renamed from: android.support.v7.view.menu.o */
public class C1565o implements C1554j {

    /* renamed from: a */
    private static final int f5027a = 48;

    /* renamed from: b */
    private final Context f5028b;

    /* renamed from: c */
    private final C1550h f5029c;

    /* renamed from: d */
    private final boolean f5030d;

    /* renamed from: e */
    private final int f5031e;

    /* renamed from: f */
    private final int f5032f;

    /* renamed from: g */
    private View f5033g;

    /* renamed from: h */
    private int f5034h;

    /* renamed from: i */
    private boolean f5035i;

    /* renamed from: j */
    private C1567p.C1568a f5036j;

    /* renamed from: k */
    private C1564n f5037k;

    /* renamed from: l */
    private PopupWindow.OnDismissListener f5038l;

    /* renamed from: m */
    private final PopupWindow.OnDismissListener f5039m;

    public C1565o(@C0047z Context context, @C0047z C1550h hVar) {
        this(context, hVar, (View) null, false, C1359b.C1361b.popupMenuStyle, 0);
    }

    public C1565o(@C0047z Context context, @C0047z C1550h hVar, @C0047z View view) {
        this(context, hVar, view, false, C1359b.C1361b.popupMenuStyle, 0);
    }

    public C1565o(@C0047z Context context, @C0047z C1550h hVar, @C0047z View view, boolean z, @C0027f int i) {
        this(context, hVar, view, z, i, 0);
    }

    public C1565o(@C0047z Context context, @C0047z C1550h hVar, @C0047z View view, boolean z, @C0027f int i, @C0016ak int i2) {
        this.f5034h = C1161h.f3608c;
        this.f5039m = new PopupWindow.OnDismissListener() {
            public void onDismiss() {
                C1565o.this.mo5531f();
            }
        };
        this.f5028b = context;
        this.f5029c = hVar;
        this.f5033g = view;
        this.f5030d = z;
        this.f5031e = i;
        this.f5032f = i2;
    }

    /* renamed from: a */
    private void m9202a(int i, int i2, boolean z, boolean z2) {
        C1564n d = mo5529d();
        d.mo5288c(z2);
        if (z) {
            if ((C1161h.m6976a(this.f5034h, C1040ar.m5947k(this.f5033g)) & 7) == 5) {
                i -= this.f5033g.getWidth();
            }
            d.mo5286b(i);
            d.mo5287c(i2);
            int i3 = (int) ((this.f5028b.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            d.mo5518a(new Rect(i - i3, i2 - i3, i + i3, i3 + i2));
        }
        d.mo5279a();
    }

    @C0047z
    /* renamed from: h */
    private C1564n m9203h() {
        Display defaultDisplay = ((WindowManager) this.f5028b.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        if (Build.VERSION.SDK_INT >= 17) {
            defaultDisplay.getRealSize(point);
        } else if (Build.VERSION.SDK_INT >= 13) {
            defaultDisplay.getSize(point);
        } else {
            point.set(defaultDisplay.getWidth(), defaultDisplay.getHeight());
        }
        C1564n eVar = Math.min(point.x, point.y) >= this.f5028b.getResources().getDimensionPixelSize(C1359b.C1364e.abc_cascading_menus_min_smallest_width) ? new C1541e(this.f5028b, this.f5033g, this.f5031e, this.f5032f, this.f5030d) : new C1574u(this.f5028b, this.f5029c, this.f5033g, this.f5031e, this.f5032f, this.f5030d);
        eVar.mo5282a(this.f5029c);
        eVar.mo5284a(this.f5039m);
        eVar.mo5283a(this.f5033g);
        eVar.mo5262a(this.f5036j);
        eVar.mo5285a(this.f5035i);
        eVar.mo5280a(this.f5034h);
        return eVar;
    }

    /* renamed from: a */
    public void mo5410a() {
        if (mo5532g()) {
            this.f5037k.mo5289d();
        }
    }

    /* renamed from: a */
    public void mo5521a(int i) {
        this.f5034h = i;
    }

    /* renamed from: a */
    public void mo5522a(int i, int i2) {
        if (!mo5527b(i, i2)) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    /* renamed from: a */
    public void mo5411a(@C0003aa C1567p.C1568a aVar) {
        this.f5036j = aVar;
        if (this.f5037k != null) {
            this.f5037k.mo5262a(aVar);
        }
    }

    /* renamed from: a */
    public void mo5523a(@C0047z View view) {
        this.f5033g = view;
    }

    /* renamed from: a */
    public void mo5524a(@C0003aa PopupWindow.OnDismissListener onDismissListener) {
        this.f5038l = onDismissListener;
    }

    /* renamed from: a */
    public void mo5525a(boolean z) {
        this.f5035i = z;
        if (this.f5037k != null) {
            this.f5037k.mo5285a(z);
        }
    }

    /* renamed from: b */
    public int mo5526b() {
        return this.f5034h;
    }

    /* renamed from: b */
    public boolean mo5527b(int i, int i2) {
        if (mo5532g()) {
            return true;
        }
        if (this.f5033g == null) {
            return false;
        }
        m9202a(i, i2, true, true);
        return true;
    }

    /* renamed from: c */
    public void mo5528c() {
        if (!mo5530e()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    @C0047z
    /* renamed from: d */
    public C1564n mo5529d() {
        if (this.f5037k == null) {
            this.f5037k = m9203h();
        }
        return this.f5037k;
    }

    /* renamed from: e */
    public boolean mo5530e() {
        if (mo5532g()) {
            return true;
        }
        if (this.f5033g == null) {
            return false;
        }
        m9202a(0, 0, false, false);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo5531f() {
        this.f5037k = null;
        if (this.f5038l != null) {
            this.f5038l.onDismiss();
        }
    }

    /* renamed from: g */
    public boolean mo5532g() {
        return this.f5037k != null && this.f5037k.mo5290e();
    }
}
