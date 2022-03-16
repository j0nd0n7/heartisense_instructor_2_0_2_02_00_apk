package android.support.p036v7.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.support.annotation.C0011ag;
import android.support.p036v7.p037a.C1359b;
import android.support.p036v7.view.menu.C1567p;
import android.support.p036v7.view.menu.C1569q;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import java.util.ArrayList;

@C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
/* renamed from: android.support.v7.view.menu.f */
public class C1547f implements C1567p, AdapterView.OnItemClickListener {

    /* renamed from: i */
    public static final String f4926i = "android:menu:list";

    /* renamed from: j */
    private static final String f4927j = "ListMenuPresenter";

    /* renamed from: a */
    Context f4928a;

    /* renamed from: b */
    LayoutInflater f4929b;

    /* renamed from: c */
    C1550h f4930c;

    /* renamed from: d */
    ExpandedMenuView f4931d;

    /* renamed from: e */
    int f4932e;

    /* renamed from: f */
    int f4933f;

    /* renamed from: g */
    int f4934g;

    /* renamed from: h */
    C1548a f4935h;

    /* renamed from: k */
    private C1567p.C1568a f4936k;

    /* renamed from: l */
    private int f4937l;

    /* renamed from: android.support.v7.view.menu.f$a */
    private class C1548a extends BaseAdapter {

        /* renamed from: b */
        private int f4939b = -1;

        public C1548a() {
            mo5309a();
        }

        /* renamed from: a */
        public C1555k getItem(int i) {
            ArrayList<C1555k> m = C1547f.this.f4930c.mo5388m();
            int i2 = C1547f.this.f4932e + i;
            if (this.f4939b >= 0 && i2 >= this.f4939b) {
                i2++;
            }
            return m.get(i2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo5309a() {
            C1555k s = C1547f.this.f4930c.mo5398s();
            if (s != null) {
                ArrayList<C1555k> m = C1547f.this.f4930c.mo5388m();
                int size = m.size();
                for (int i = 0; i < size; i++) {
                    if (m.get(i) == s) {
                        this.f4939b = i;
                        return;
                    }
                }
            }
            this.f4939b = -1;
        }

        public int getCount() {
            int size = C1547f.this.f4930c.mo5388m().size() - C1547f.this.f4932e;
            return this.f4939b < 0 ? size : size - 1;
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            View inflate = view == null ? C1547f.this.f4929b.inflate(C1547f.this.f4934g, viewGroup, false) : view;
            ((C1569q.C1570a) inflate).mo5184a(getItem(i), 0);
            return inflate;
        }

        public void notifyDataSetChanged() {
            mo5309a();
            super.notifyDataSetChanged();
        }
    }

    public C1547f(int i, int i2) {
        this.f4934g = i;
        this.f4933f = i2;
    }

    public C1547f(Context context, int i) {
        this(i, 0);
        this.f4928a = context;
        this.f4929b = LayoutInflater.from(this.f4928a);
    }

    /* renamed from: a */
    public C1569q mo5256a(ViewGroup viewGroup) {
        if (this.f4931d == null) {
            this.f4931d = (ExpandedMenuView) this.f4929b.inflate(C1359b.C1368i.abc_expanded_menu_layout, viewGroup, false);
            if (this.f4935h == null) {
                this.f4935h = new C1548a();
            }
            this.f4931d.setAdapter(this.f4935h);
            this.f4931d.setOnItemClickListener(this);
        }
        return this.f4931d;
    }

    /* renamed from: a */
    public ListAdapter mo5301a() {
        if (this.f4935h == null) {
            this.f4935h = new C1548a();
        }
        return this.f4935h;
    }

    /* renamed from: a */
    public void mo5302a(int i) {
        this.f4932e = i;
        if (this.f4931d != null) {
            mo5269b(false);
        }
    }

    /* renamed from: a */
    public void mo5259a(Context context, C1550h hVar) {
        if (this.f4933f != 0) {
            this.f4928a = new ContextThemeWrapper(context, this.f4933f);
            this.f4929b = LayoutInflater.from(this.f4928a);
        } else if (this.f4928a != null) {
            this.f4928a = context;
            if (this.f4929b == null) {
                this.f4929b = LayoutInflater.from(this.f4928a);
            }
        }
        this.f4930c = hVar;
        if (this.f4935h != null) {
            this.f4935h.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public void mo5303a(Bundle bundle) {
        SparseArray sparseArray = new SparseArray();
        if (this.f4931d != null) {
            this.f4931d.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray(f4926i, sparseArray);
    }

    /* renamed from: a */
    public void mo5281a(Parcelable parcelable) {
        mo5305b((Bundle) parcelable);
    }

    /* renamed from: a */
    public void mo5260a(C1550h hVar, boolean z) {
        if (this.f4936k != null) {
            this.f4936k.mo4932a(hVar, z);
        }
    }

    /* renamed from: a */
    public void mo5262a(C1567p.C1568a aVar) {
        this.f4936k = aVar;
    }

    /* renamed from: a */
    public boolean mo5265a(C1550h hVar, C1555k kVar) {
        return false;
    }

    /* renamed from: a */
    public boolean mo5266a(C1576v vVar) {
        if (!vVar.hasVisibleItems()) {
            return false;
        }
        new C1553i(vVar).mo5405a((IBinder) null);
        if (this.f4936k != null) {
            this.f4936k.mo4933a(vVar);
        }
        return true;
    }

    /* renamed from: b */
    public void mo5304b(int i) {
        this.f4937l = i;
    }

    /* renamed from: b */
    public void mo5305b(Bundle bundle) {
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(f4926i);
        if (sparseParcelableArray != null) {
            this.f4931d.restoreHierarchyState(sparseParcelableArray);
        }
    }

    /* renamed from: b */
    public void mo5269b(boolean z) {
        if (this.f4935h != null) {
            this.f4935h.notifyDataSetChanged();
        }
    }

    /* renamed from: b */
    public boolean mo5270b() {
        return false;
    }

    /* renamed from: b */
    public boolean mo5271b(C1550h hVar, C1555k kVar) {
        return false;
    }

    /* renamed from: c */
    public int mo5272c() {
        return this.f4937l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo5306d() {
        return this.f4932e;
    }

    /* renamed from: f */
    public Parcelable mo5291f() {
        if (this.f4931d == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        mo5303a(bundle);
        return bundle;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f4930c.mo5344a((MenuItem) this.f4935h.getItem(i), (C1567p) this, 0);
    }
}
