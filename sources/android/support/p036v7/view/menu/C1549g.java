package android.support.p036v7.view.menu;

import android.support.annotation.C0011ag;
import android.support.p036v7.p037a.C1359b;
import android.support.p036v7.view.menu.C1569q;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

@C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
/* renamed from: android.support.v7.view.menu.g */
public class C1549g extends BaseAdapter {

    /* renamed from: a */
    static final int f4940a = C1359b.C1368i.abc_popup_menu_item_layout;

    /* renamed from: b */
    C1550h f4941b;

    /* renamed from: c */
    private int f4942c = -1;

    /* renamed from: d */
    private boolean f4943d;

    /* renamed from: e */
    private final boolean f4944e;

    /* renamed from: f */
    private final LayoutInflater f4945f;

    public C1549g(C1550h hVar, LayoutInflater layoutInflater, boolean z) {
        this.f4944e = z;
        this.f4945f = layoutInflater;
        this.f4941b = hVar;
        mo5319c();
    }

    /* renamed from: a */
    public C1555k getItem(int i) {
        ArrayList<C1555k> m = this.f4944e ? this.f4941b.mo5388m() : this.f4941b.mo5385j();
        if (this.f4942c >= 0 && i >= this.f4942c) {
            i++;
        }
        return m.get(i);
    }

    /* renamed from: a */
    public void mo5316a(boolean z) {
        this.f4943d = z;
    }

    /* renamed from: a */
    public boolean mo5317a() {
        return this.f4943d;
    }

    /* renamed from: b */
    public C1550h mo5318b() {
        return this.f4941b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo5319c() {
        C1555k s = this.f4941b.mo5398s();
        if (s != null) {
            ArrayList<C1555k> m = this.f4941b.mo5388m();
            int size = m.size();
            for (int i = 0; i < size; i++) {
                if (m.get(i) == s) {
                    this.f4942c = i;
                    return;
                }
            }
        }
        this.f4942c = -1;
    }

    public int getCount() {
        ArrayList<C1555k> m = this.f4944e ? this.f4941b.mo5388m() : this.f4941b.mo5385j();
        return this.f4942c < 0 ? m.size() : m.size() - 1;
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        View inflate = view == null ? this.f4945f.inflate(f4940a, viewGroup, false) : view;
        C1569q.C1570a aVar = (C1569q.C1570a) inflate;
        if (this.f4943d) {
            ((ListMenuItemView) inflate).setForceShowIcon(true);
        }
        aVar.mo5184a(getItem(i), 0);
        return inflate;
    }

    public void notifyDataSetChanged() {
        mo5319c();
        super.notifyDataSetChanged();
    }
}
