package android.support.p036v7.widget;

import android.content.Context;
import android.support.annotation.C0003aa;
import android.support.annotation.C0016ak;
import android.support.annotation.C0027f;
import android.support.annotation.C0046y;
import android.support.annotation.C0047z;
import android.support.p036v7.p037a.C1359b;
import android.support.p036v7.view.C1529g;
import android.support.p036v7.view.menu.C1550h;
import android.support.p036v7.view.menu.C1565o;
import android.support.p036v7.view.menu.C1573t;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupWindow;

/* renamed from: android.support.v7.widget.ax */
public class C1724ax {

    /* renamed from: a */
    final C1565o f5813a;

    /* renamed from: b */
    C1729b f5814b;

    /* renamed from: c */
    C1728a f5815c;

    /* renamed from: d */
    private final Context f5816d;

    /* renamed from: e */
    private final C1550h f5817e;

    /* renamed from: f */
    private final View f5818f;

    /* renamed from: g */
    private View.OnTouchListener f5819g;

    /* renamed from: android.support.v7.widget.ax$a */
    public interface C1728a {
        /* renamed from: a */
        void mo6569a(C1724ax axVar);
    }

    /* renamed from: android.support.v7.widget.ax$b */
    public interface C1729b {
        /* renamed from: a */
        boolean mo6570a(MenuItem menuItem);
    }

    public C1724ax(@C0047z Context context, @C0047z View view) {
        this(context, view, 0);
    }

    public C1724ax(@C0047z Context context, @C0047z View view, int i) {
        this(context, view, i, C1359b.C1361b.popupMenuStyle, 0);
    }

    public C1724ax(@C0047z Context context, @C0047z View view, int i, @C0027f int i2, @C0016ak int i3) {
        this.f5816d = context;
        this.f5818f = view;
        this.f5817e = new C1550h(context);
        this.f5817e.mo5334a((C1550h.C1551a) new C1550h.C1551a() {
            /* renamed from: a */
            public void mo4719a(C1550h hVar) {
            }

            /* renamed from: a */
            public boolean mo4724a(C1550h hVar, MenuItem menuItem) {
                if (C1724ax.this.f5814b != null) {
                    return C1724ax.this.f5814b.mo6570a(menuItem);
                }
                return false;
            }
        });
        this.f5813a = new C1565o(context, this.f5817e, view, false, i2, i3);
        this.f5813a.mo5521a(i);
        this.f5813a.mo5524a((PopupWindow.OnDismissListener) new PopupWindow.OnDismissListener() {
            public void onDismiss() {
                if (C1724ax.this.f5815c != null) {
                    C1724ax.this.f5815c.mo6569a(C1724ax.this);
                }
            }
        });
    }

    /* renamed from: a */
    public int mo6558a() {
        return this.f5813a.mo5526b();
    }

    /* renamed from: a */
    public void mo6559a(int i) {
        this.f5813a.mo5521a(i);
    }

    /* renamed from: a */
    public void mo6560a(@C0003aa C1728a aVar) {
        this.f5815c = aVar;
    }

    /* renamed from: a */
    public void mo6561a(@C0003aa C1729b bVar) {
        this.f5814b = bVar;
    }

    @C0047z
    /* renamed from: b */
    public View.OnTouchListener mo6562b() {
        if (this.f5819g == null) {
            this.f5819g = new C1687ak(this.f5818f) {
                /* renamed from: a */
                public C1573t mo5206a() {
                    return C1724ax.this.f5813a.mo5529d();
                }

                /* access modifiers changed from: protected */
                /* renamed from: b */
                public boolean mo5207b() {
                    C1724ax.this.mo6566e();
                    return true;
                }

                /* access modifiers changed from: protected */
                /* renamed from: c */
                public boolean mo5736c() {
                    C1724ax.this.mo6567f();
                    return true;
                }
            };
        }
        return this.f5819g;
    }

    /* renamed from: b */
    public void mo6563b(@C0046y int i) {
        mo6565d().inflate(i, this.f5817e);
    }

    @C0047z
    /* renamed from: c */
    public Menu mo6564c() {
        return this.f5817e;
    }

    @C0047z
    /* renamed from: d */
    public MenuInflater mo6565d() {
        return new C1529g(this.f5816d);
    }

    /* renamed from: e */
    public void mo6566e() {
        this.f5813a.mo5528c();
    }

    /* renamed from: f */
    public void mo6567f() {
        this.f5813a.mo5410a();
    }
}
