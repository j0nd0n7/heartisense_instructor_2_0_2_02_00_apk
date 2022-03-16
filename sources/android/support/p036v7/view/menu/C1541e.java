package android.support.p036v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.annotation.C0003aa;
import android.support.annotation.C0016ak;
import android.support.annotation.C0027f;
import android.support.annotation.C0047z;
import android.support.p010v4.view.C1040ar;
import android.support.p010v4.view.C1161h;
import android.support.p036v7.p037a.C1359b;
import android.support.p036v7.view.menu.C1567p;
import android.support.p036v7.widget.C1714as;
import android.support.p036v7.widget.C1715at;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* renamed from: android.support.v7.view.menu.e */
final class C1541e extends C1564n implements C1567p, View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: a */
    static final int f4889a = 0;

    /* renamed from: b */
    static final int f4890b = 1;

    /* renamed from: c */
    static final int f4891c = 200;

    /* renamed from: A */
    private ViewTreeObserver f4892A;

    /* renamed from: B */
    private PopupWindow.OnDismissListener f4893B;

    /* renamed from: d */
    final Handler f4894d;

    /* renamed from: e */
    final List<C1545a> f4895e = new ArrayList();

    /* renamed from: f */
    View f4896f;

    /* renamed from: g */
    boolean f4897g;

    /* renamed from: h */
    private final Context f4898h;

    /* renamed from: i */
    private final int f4899i;

    /* renamed from: j */
    private final int f4900j;

    /* renamed from: k */
    private final int f4901k;

    /* renamed from: l */
    private final boolean f4902l;

    /* renamed from: m */
    private final List<C1550h> f4903m = new LinkedList();

    /* renamed from: n */
    private final ViewTreeObserver.OnGlobalLayoutListener f4904n = new ViewTreeObserver.OnGlobalLayoutListener() {
        public void onGlobalLayout() {
            if (C1541e.this.mo5290e() && C1541e.this.f4895e.size() > 0 && !C1541e.this.f4895e.get(0).f4923a.mo6478h()) {
                View view = C1541e.this.f4896f;
                if (view == null || !view.isShown()) {
                    C1541e.this.mo5289d();
                    return;
                }
                for (C1545a aVar : C1541e.this.f4895e) {
                    aVar.f4923a.mo5279a();
                }
            }
        }
    };

    /* renamed from: o */
    private final C1714as f4905o = new C1714as() {
        /* renamed from: a */
        public void mo5297a(@C0047z C1550h hVar, @C0047z MenuItem menuItem) {
            C1541e.this.f4894d.removeCallbacksAndMessages(hVar);
        }

        /* renamed from: b */
        public void mo5298b(@C0047z final C1550h hVar, @C0047z final MenuItem menuItem) {
            int i;
            C1541e.this.f4894d.removeCallbacksAndMessages((Object) null);
            int i2 = 0;
            int size = C1541e.this.f4895e.size();
            while (true) {
                if (i2 >= size) {
                    i = -1;
                    break;
                } else if (hVar == C1541e.this.f4895e.get(i2).f4924b) {
                    i = i2;
                    break;
                } else {
                    i2++;
                }
            }
            if (i != -1) {
                int i3 = i + 1;
                final C1545a aVar = i3 < C1541e.this.f4895e.size() ? C1541e.this.f4895e.get(i3) : null;
                C1541e.this.f4894d.postAtTime(new Runnable() {
                    public void run() {
                        if (aVar != null) {
                            C1541e.this.f4897g = true;
                            aVar.f4924b.mo5359b(false);
                            C1541e.this.f4897g = false;
                        }
                        if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
                            hVar.mo5343a(menuItem, 4);
                        }
                    }
                }, hVar, SystemClock.uptimeMillis() + 200);
            }
        }
    };

    /* renamed from: p */
    private int f4906p = 0;

    /* renamed from: q */
    private int f4907q = 0;

    /* renamed from: r */
    private View f4908r;

    /* renamed from: s */
    private int f4909s;

    /* renamed from: t */
    private boolean f4910t;

    /* renamed from: u */
    private boolean f4911u;

    /* renamed from: v */
    private int f4912v;

    /* renamed from: w */
    private int f4913w;

    /* renamed from: x */
    private boolean f4914x;

    /* renamed from: y */
    private boolean f4915y;

    /* renamed from: z */
    private C1567p.C1568a f4916z;

    /* renamed from: android.support.v7.view.menu.e$a */
    private static class C1545a {

        /* renamed from: a */
        public final C1715at f4923a;

        /* renamed from: b */
        public final C1550h f4924b;

        /* renamed from: c */
        public final int f4925c;

        public C1545a(@C0047z C1715at atVar, @C0047z C1550h hVar, int i) {
            this.f4923a = atVar;
            this.f4924b = hVar;
            this.f4925c = i;
        }

        /* renamed from: a */
        public ListView mo5300a() {
            return this.f4923a.mo5292g();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: android.support.v7.view.menu.e$b */
    public @interface C1546b {
    }

    public C1541e(@C0047z Context context, @C0047z View view, @C0027f int i, @C0016ak int i2, boolean z) {
        this.f4898h = context;
        this.f4908r = view;
        this.f4900j = i;
        this.f4901k = i2;
        this.f4902l = z;
        this.f4914x = false;
        this.f4909s = m9013k();
        Resources resources = context.getResources();
        this.f4899i = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C1359b.C1364e.abc_config_prefDialogWidth));
        this.f4894d = new Handler();
    }

    /* renamed from: a */
    private MenuItem m9007a(@C0047z C1550h hVar, @C0047z C1550h hVar2) {
        int size = hVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = hVar.getItem(i);
            if (item.hasSubMenu() && hVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    @C0003aa
    /* renamed from: a */
    private View m9008a(@C0047z C1545a aVar, @C0047z C1550h hVar) {
        C1549g gVar;
        int i;
        int i2;
        int i3 = 0;
        MenuItem a = m9007a(aVar.f4924b, hVar);
        if (a == null) {
            return null;
        }
        ListView a2 = aVar.mo5300a();
        ListAdapter adapter = a2.getAdapter();
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i = headerViewListAdapter.getHeadersCount();
            gVar = (C1549g) headerViewListAdapter.getWrappedAdapter();
        } else {
            gVar = (C1549g) adapter;
            i = 0;
        }
        int count = gVar.getCount();
        while (true) {
            if (i3 >= count) {
                i2 = -1;
                break;
            } else if (a == gVar.getItem(i3)) {
                i2 = i3;
                break;
            } else {
                i3++;
            }
        }
        if (i2 == -1) {
            return null;
        }
        int firstVisiblePosition = (i2 + i) - a2.getFirstVisiblePosition();
        if (firstVisiblePosition < 0 || firstVisiblePosition >= a2.getChildCount()) {
            return null;
        }
        return a2.getChildAt(firstVisiblePosition);
    }

    /* renamed from: c */
    private void m9009c(@C0047z C1550h hVar) {
        View view;
        C1545a aVar;
        LayoutInflater from = LayoutInflater.from(this.f4898h);
        C1549g gVar = new C1549g(hVar, from, this.f4902l);
        if (!mo5290e() && this.f4914x) {
            gVar.mo5316a(true);
        } else if (mo5290e()) {
            gVar.mo5316a(C1564n.m9185b(hVar));
        }
        int a = m9183a(gVar, (ViewGroup) null, this.f4898h, this.f4899i);
        C1715at j = m9012j();
        j.mo6458a((ListAdapter) gVar);
        j.mo6477h(a);
        j.mo6475f(this.f4907q);
        if (this.f4895e.size() > 0) {
            C1545a aVar2 = this.f4895e.get(this.f4895e.size() - 1);
            view = m9008a(aVar2, hVar);
            aVar = aVar2;
        } else {
            view = null;
            aVar = null;
        }
        if (view != null) {
            j.mo6530d(false);
            j.mo6528a((Object) null);
            int d = m9010d(a);
            boolean z = d == 1;
            this.f4909s = d;
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            int n = aVar.f4923a.mo6489n() + iArr[0];
            int o = iArr[1] + aVar.f4923a.mo6491o();
            j.mo6472d((this.f4907q & 5) == 5 ? z ? n + a : n - view.getWidth() : z ? view.getWidth() + n : n - a);
            j.mo6473e(o);
        } else {
            if (this.f4910t) {
                j.mo6472d(this.f4912v);
            }
            if (this.f4911u) {
                j.mo6473e(this.f4913w);
            }
            j.mo6454a(mo5519i());
        }
        this.f4895e.add(new C1545a(j, hVar, this.f4909s));
        j.mo5279a();
        if (aVar == null && this.f4915y && hVar.mo5389n() != null) {
            ListView g = j.mo5292g();
            FrameLayout frameLayout = (FrameLayout) from.inflate(C1359b.C1368i.abc_popup_menu_header_item_layout, g, false);
            frameLayout.setEnabled(false);
            ((TextView) frameLayout.findViewById(16908310)).setText(hVar.mo5389n());
            g.addHeaderView(frameLayout, (Object) null, false);
            j.mo5279a();
        }
    }

    /* renamed from: d */
    private int m9010d(int i) {
        ListView a = this.f4895e.get(this.f4895e.size() - 1).mo5300a();
        int[] iArr = new int[2];
        a.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f4896f.getWindowVisibleDisplayFrame(rect);
        if (this.f4909s != 1) {
            return iArr[0] - i < 0 ? 1 : 0;
        }
        return (a.getWidth() + iArr[0]) + i > rect.right ? 0 : 1;
    }

    /* renamed from: d */
    private int m9011d(@C0047z C1550h hVar) {
        int size = this.f4895e.size();
        for (int i = 0; i < size; i++) {
            if (hVar == this.f4895e.get(i).f4924b) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: j */
    private C1715at m9012j() {
        C1715at atVar = new C1715at(this.f4898h, (AttributeSet) null, this.f4900j, this.f4901k);
        atVar.mo6527a(this.f4905o);
        atVar.mo6456a((AdapterView.OnItemClickListener) this);
        atVar.mo6459a((PopupWindow.OnDismissListener) this);
        atVar.mo6464b(this.f4908r);
        atVar.mo6475f(this.f4907q);
        atVar.mo6460a(true);
        return atVar;
    }

    /* renamed from: k */
    private int m9013k() {
        return C1040ar.m5947k(this.f4908r) == 1 ? 0 : 1;
    }

    /* renamed from: a */
    public void mo5279a() {
        if (!mo5290e()) {
            for (C1550h c : this.f4903m) {
                m9009c(c);
            }
            this.f4903m.clear();
            this.f4896f = this.f4908r;
            if (this.f4896f != null) {
                boolean z = this.f4892A == null;
                this.f4892A = this.f4896f.getViewTreeObserver();
                if (z) {
                    this.f4892A.addOnGlobalLayoutListener(this.f4904n);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo5280a(int i) {
        if (this.f4906p != i) {
            this.f4906p = i;
            this.f4907q = C1161h.m6976a(i, C1040ar.m5947k(this.f4908r));
        }
    }

    /* renamed from: a */
    public void mo5281a(Parcelable parcelable) {
    }

    /* renamed from: a */
    public void mo5282a(C1550h hVar) {
        hVar.mo5337a((C1567p) this, this.f4898h);
        if (mo5290e()) {
            m9009c(hVar);
        } else {
            this.f4903m.add(hVar);
        }
    }

    /* renamed from: a */
    public void mo5260a(C1550h hVar, boolean z) {
        int d = m9011d(hVar);
        if (d >= 0) {
            int i = d + 1;
            if (i < this.f4895e.size()) {
                this.f4895e.get(i).f4924b.mo5359b(false);
            }
            C1545a remove = this.f4895e.remove(d);
            remove.f4924b.mo5358b((C1567p) this);
            if (this.f4897g) {
                remove.f4923a.mo6529b((Object) null);
                remove.f4923a.mo6467c(0);
            }
            remove.f4923a.mo5289d();
            int size = this.f4895e.size();
            if (size > 0) {
                this.f4909s = this.f4895e.get(size - 1).f4925c;
            } else {
                this.f4909s = m9013k();
            }
            if (size == 0) {
                mo5289d();
                if (this.f4916z != null) {
                    this.f4916z.mo4932a(hVar, true);
                }
                if (this.f4892A != null) {
                    if (this.f4892A.isAlive()) {
                        this.f4892A.removeGlobalOnLayoutListener(this.f4904n);
                    }
                    this.f4892A = null;
                }
                this.f4893B.onDismiss();
            } else if (z) {
                this.f4895e.get(0).f4924b.mo5359b(false);
            }
        }
    }

    /* renamed from: a */
    public void mo5262a(C1567p.C1568a aVar) {
        this.f4916z = aVar;
    }

    /* renamed from: a */
    public void mo5283a(@C0047z View view) {
        if (this.f4908r != view) {
            this.f4908r = view;
            this.f4907q = C1161h.m6976a(this.f4906p, C1040ar.m5947k(this.f4908r));
        }
    }

    /* renamed from: a */
    public void mo5284a(PopupWindow.OnDismissListener onDismissListener) {
        this.f4893B = onDismissListener;
    }

    /* renamed from: a */
    public void mo5285a(boolean z) {
        this.f4914x = z;
    }

    /* renamed from: a */
    public boolean mo5266a(C1576v vVar) {
        for (C1545a next : this.f4895e) {
            if (vVar == next.f4924b) {
                next.mo5300a().requestFocus();
                return true;
            }
        }
        if (!vVar.hasVisibleItems()) {
            return false;
        }
        mo5282a((C1550h) vVar);
        if (this.f4916z != null) {
            this.f4916z.mo4933a(vVar);
        }
        return true;
    }

    /* renamed from: b */
    public void mo5286b(int i) {
        this.f4910t = true;
        this.f4912v = i;
    }

    /* renamed from: b */
    public void mo5269b(boolean z) {
        for (C1545a a : this.f4895e) {
            m9184a(a.mo5300a().getAdapter()).notifyDataSetChanged();
        }
    }

    /* renamed from: b */
    public boolean mo5270b() {
        return false;
    }

    /* renamed from: c */
    public void mo5287c(int i) {
        this.f4911u = true;
        this.f4913w = i;
    }

    /* renamed from: c */
    public void mo5288c(boolean z) {
        this.f4915y = z;
    }

    /* renamed from: d */
    public void mo5289d() {
        int size = this.f4895e.size();
        if (size > 0) {
            C1545a[] aVarArr = (C1545a[]) this.f4895e.toArray(new C1545a[size]);
            for (int i = size - 1; i >= 0; i--) {
                C1545a aVar = aVarArr[i];
                if (aVar.f4923a.mo5290e()) {
                    aVar.f4923a.mo5289d();
                }
            }
        }
    }

    /* renamed from: e */
    public boolean mo5290e() {
        return this.f4895e.size() > 0 && this.f4895e.get(0).f4923a.mo5290e();
    }

    /* renamed from: f */
    public Parcelable mo5291f() {
        return null;
    }

    /* renamed from: g */
    public ListView mo5292g() {
        if (this.f4895e.isEmpty()) {
            return null;
        }
        return this.f4895e.get(this.f4895e.size() - 1).mo5300a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public boolean mo5293h() {
        return false;
    }

    public void onDismiss() {
        C1545a aVar;
        int size = this.f4895e.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                aVar = null;
                break;
            }
            aVar = this.f4895e.get(i);
            if (!aVar.f4923a.mo5290e()) {
                break;
            }
            i++;
        }
        if (aVar != null) {
            aVar.f4924b.mo5359b(false);
        }
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        mo5289d();
        return true;
    }
}
