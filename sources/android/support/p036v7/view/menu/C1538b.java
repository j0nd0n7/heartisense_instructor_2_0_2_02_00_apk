package android.support.p036v7.view.menu;

import android.content.Context;
import android.support.annotation.C0011ag;
import android.support.p010v4.view.C1040ar;
import android.support.p036v7.view.menu.C1567p;
import android.support.p036v7.view.menu.C1569q;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

@C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
/* renamed from: android.support.v7.view.menu.b */
public abstract class C1538b implements C1567p {

    /* renamed from: a */
    protected Context f4875a;

    /* renamed from: b */
    protected Context f4876b;

    /* renamed from: c */
    protected C1550h f4877c;

    /* renamed from: d */
    protected LayoutInflater f4878d;

    /* renamed from: e */
    protected LayoutInflater f4879e;

    /* renamed from: f */
    protected C1569q f4880f;

    /* renamed from: g */
    private C1567p.C1568a f4881g;

    /* renamed from: h */
    private int f4882h;

    /* renamed from: i */
    private int f4883i;

    /* renamed from: j */
    private int f4884j;

    public C1538b(Context context, int i, int i2) {
        this.f4875a = context;
        this.f4878d = LayoutInflater.from(context);
        this.f4882h = i;
        this.f4883i = i2;
    }

    /* renamed from: a */
    public C1567p.C1568a mo5255a() {
        return this.f4881g;
    }

    /* renamed from: a */
    public C1569q mo5256a(ViewGroup viewGroup) {
        if (this.f4880f == null) {
            this.f4880f = (C1569q) this.f4878d.inflate(this.f4882h, viewGroup, false);
            this.f4880f.mo5209a(this.f4877c);
            mo5269b(true);
        }
        return this.f4880f;
    }

    /* renamed from: a */
    public View mo5257a(C1555k kVar, View view, ViewGroup viewGroup) {
        C1569q.C1570a b = view instanceof C1569q.C1570a ? (C1569q.C1570a) view : mo5268b(viewGroup);
        mo5261a(kVar, b);
        return (View) b;
    }

    /* renamed from: a */
    public void mo5258a(int i) {
        this.f4884j = i;
    }

    /* renamed from: a */
    public void mo5259a(Context context, C1550h hVar) {
        this.f4876b = context;
        this.f4879e = LayoutInflater.from(this.f4876b);
        this.f4877c = hVar;
    }

    /* renamed from: a */
    public void mo5260a(C1550h hVar, boolean z) {
        if (this.f4881g != null) {
            this.f4881g.mo4932a(hVar, z);
        }
    }

    /* renamed from: a */
    public abstract void mo5261a(C1555k kVar, C1569q.C1570a aVar);

    /* renamed from: a */
    public void mo5262a(C1567p.C1568a aVar) {
        this.f4881g = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo5263a(View view, int i) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f4880f).addView(view, i);
    }

    /* renamed from: a */
    public boolean mo5264a(int i, C1555k kVar) {
        return true;
    }

    /* renamed from: a */
    public boolean mo5265a(C1550h hVar, C1555k kVar) {
        return false;
    }

    /* renamed from: a */
    public boolean mo5266a(C1576v vVar) {
        if (this.f4881g != null) {
            return this.f4881g.mo4933a(vVar);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo5267a(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    /* renamed from: b */
    public C1569q.C1570a mo5268b(ViewGroup viewGroup) {
        return (C1569q.C1570a) this.f4878d.inflate(this.f4883i, viewGroup, false);
    }

    /* renamed from: b */
    public void mo5269b(boolean z) {
        int i;
        int i2;
        ViewGroup viewGroup = (ViewGroup) this.f4880f;
        if (viewGroup != null) {
            if (this.f4877c != null) {
                this.f4877c.mo5386k();
                ArrayList<C1555k> j = this.f4877c.mo5385j();
                int size = j.size();
                int i3 = 0;
                i = 0;
                while (i3 < size) {
                    C1555k kVar = j.get(i3);
                    if (mo5264a(i, kVar)) {
                        View childAt = viewGroup.getChildAt(i);
                        C1555k itemData = childAt instanceof C1569q.C1570a ? ((C1569q.C1570a) childAt).getItemData() : null;
                        View a = mo5257a(kVar, childAt, viewGroup);
                        if (kVar != itemData) {
                            a.setPressed(false);
                            C1040ar.m5867Q(a);
                        }
                        if (a != childAt) {
                            mo5263a(a, i);
                        }
                        i2 = i + 1;
                    } else {
                        i2 = i;
                    }
                    i3++;
                    i = i2;
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (!mo5267a(viewGroup, i)) {
                    i++;
                }
            }
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
        return this.f4884j;
    }
}
