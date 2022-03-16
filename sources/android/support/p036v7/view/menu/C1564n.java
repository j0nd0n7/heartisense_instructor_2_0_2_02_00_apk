package android.support.p036v7.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.support.annotation.C0003aa;
import android.support.annotation.C0047z;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* renamed from: android.support.v7.view.menu.n */
abstract class C1564n implements C1567p, C1573t, AdapterView.OnItemClickListener {

    /* renamed from: a */
    private Rect f5026a;

    C1564n() {
    }

    /* renamed from: a */
    protected static int m9183a(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i2 = 0;
        int i3 = 0;
        View view = null;
        int i4 = 0;
        ViewGroup viewGroup2 = viewGroup;
        while (i2 < count) {
            int itemViewType = listAdapter.getItemViewType(i2);
            if (itemViewType != i3) {
                i3 = itemViewType;
                view = null;
            }
            FrameLayout frameLayout = viewGroup2 == null ? new FrameLayout(context) : viewGroup2;
            view = listAdapter.getView(i2, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth <= i4) {
                measuredWidth = i4;
            }
            i2++;
            i4 = measuredWidth;
            viewGroup2 = frameLayout;
        }
        return i4;
    }

    /* renamed from: a */
    protected static C1549g m9184a(ListAdapter listAdapter) {
        return listAdapter instanceof HeaderViewListAdapter ? (C1549g) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C1549g) listAdapter;
    }

    /* renamed from: b */
    protected static boolean m9185b(C1550h hVar) {
        int size = hVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = hVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public C1569q mo5256a(ViewGroup viewGroup) {
        throw new UnsupportedOperationException("MenuPopups manage their own views");
    }

    /* renamed from: a */
    public abstract void mo5280a(int i);

    /* renamed from: a */
    public void mo5259a(@C0047z Context context, @C0003aa C1550h hVar) {
    }

    /* renamed from: a */
    public void mo5518a(Rect rect) {
        this.f5026a = rect;
    }

    /* renamed from: a */
    public abstract void mo5282a(C1550h hVar);

    /* renamed from: a */
    public abstract void mo5283a(View view);

    /* renamed from: a */
    public abstract void mo5284a(PopupWindow.OnDismissListener onDismissListener);

    /* renamed from: a */
    public abstract void mo5285a(boolean z);

    /* renamed from: a */
    public boolean mo5265a(C1550h hVar, C1555k kVar) {
        return false;
    }

    /* renamed from: b */
    public abstract void mo5286b(int i);

    /* renamed from: b */
    public boolean mo5271b(C1550h hVar, C1555k kVar) {
        return false;
    }

    /* renamed from: c */
    public int mo5272c() {
        return 0;
    }

    /* renamed from: c */
    public abstract void mo5287c(int i);

    /* renamed from: c */
    public abstract void mo5288c(boolean z);

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public boolean mo5293h() {
        return true;
    }

    /* renamed from: i */
    public Rect mo5519i() {
        return this.f5026a;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        m9184a(listAdapter).f4941b.mo5344a((MenuItem) listAdapter.getItem(i), (C1567p) this, mo5293h() ? 0 : 4);
    }
}
