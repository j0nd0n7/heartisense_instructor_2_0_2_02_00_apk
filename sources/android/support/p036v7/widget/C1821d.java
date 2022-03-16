package android.support.p036v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.C0003aa;
import android.support.annotation.C0047z;
import android.support.p010v4.p018f.p019a.C0484a;
import android.support.p010v4.view.C1147e;
import android.support.p010v4.view.C1161h;
import android.support.p036v7.p037a.C1359b;
import android.support.p036v7.p044f.C1490a;
import android.support.p036v7.view.C1521a;
import android.support.p036v7.view.menu.ActionMenuItemView;
import android.support.p036v7.view.menu.C1538b;
import android.support.p036v7.view.menu.C1550h;
import android.support.p036v7.view.menu.C1555k;
import android.support.p036v7.view.menu.C1565o;
import android.support.p036v7.view.menu.C1567p;
import android.support.p036v7.view.menu.C1569q;
import android.support.p036v7.view.menu.C1573t;
import android.support.p036v7.view.menu.C1576v;
import android.support.p036v7.widget.ActionMenuView;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* renamed from: android.support.v7.widget.d */
class C1821d extends C1538b implements C1147e.C1148a {

    /* renamed from: m */
    private static final String f6179m = "ActionMenuPresenter";

    /* renamed from: A */
    private View f6180A;

    /* renamed from: B */
    private C1823b f6181B;

    /* renamed from: g */
    C1825d f6182g;

    /* renamed from: h */
    C1827e f6183h;

    /* renamed from: i */
    C1822a f6184i;

    /* renamed from: j */
    C1824c f6185j;

    /* renamed from: k */
    final C1828f f6186k = new C1828f();

    /* renamed from: l */
    int f6187l;

    /* renamed from: n */
    private Drawable f6188n;

    /* renamed from: o */
    private boolean f6189o;

    /* renamed from: p */
    private boolean f6190p;

    /* renamed from: q */
    private boolean f6191q;

    /* renamed from: r */
    private int f6192r;

    /* renamed from: s */
    private int f6193s;

    /* renamed from: t */
    private int f6194t;

    /* renamed from: u */
    private boolean f6195u;

    /* renamed from: v */
    private boolean f6196v;

    /* renamed from: w */
    private boolean f6197w;

    /* renamed from: x */
    private boolean f6198x;

    /* renamed from: y */
    private int f6199y;

    /* renamed from: z */
    private final SparseBooleanArray f6200z = new SparseBooleanArray();

    /* renamed from: android.support.v7.widget.d$a */
    private class C1822a extends C1565o {
        public C1822a(Context context, C1576v vVar, View view) {
            super(context, vVar, view, false, C1359b.C1361b.actionOverflowMenuStyle);
            if (!((C1555k) vVar.getItem()).mo5450k()) {
                mo5523a(C1821d.this.f6182g == null ? (View) C1821d.this.f4880f : C1821d.this.f6182g);
            }
            mo5411a((C1567p.C1568a) C1821d.this.f6186k);
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public void mo5531f() {
            C1821d.this.f6184i = null;
            C1821d.this.f6187l = 0;
            super.mo5531f();
        }
    }

    /* renamed from: android.support.v7.widget.d$b */
    private class C1823b extends ActionMenuItemView.C1536b {
        C1823b() {
        }

        /* renamed from: a */
        public C1573t mo5208a() {
            if (C1821d.this.f6184i != null) {
                return C1821d.this.f6184i.mo5529d();
            }
            return null;
        }
    }

    /* renamed from: android.support.v7.widget.d$c */
    private class C1824c implements Runnable {

        /* renamed from: b */
        private C1827e f6204b;

        public C1824c(C1827e eVar) {
            this.f6204b = eVar;
        }

        public void run() {
            if (C1821d.this.f4877c != null) {
                C1821d.this.f4877c.mo5379g();
            }
            View view = (View) C1821d.this.f4880f;
            if (!(view == null || view.getWindowToken() == null || !this.f6204b.mo5530e())) {
                C1821d.this.f6183h = this.f6204b;
            }
            C1821d.this.f6185j = null;
        }
    }

    /* renamed from: android.support.v7.widget.d$d */
    private class C1825d extends C1857q implements ActionMenuView.C1584a {

        /* renamed from: b */
        private final float[] f6206b = new float[2];

        public C1825d(Context context) {
            super(context, (AttributeSet) null, C1359b.C1361b.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            setOnTouchListener(new C1687ak(this, C1821d.this) {
                /* renamed from: a */
                public C1573t mo5206a() {
                    if (C1821d.this.f6183h == null) {
                        return null;
                    }
                    return C1821d.this.f6183h.mo5529d();
                }

                /* renamed from: b */
                public boolean mo5207b() {
                    C1821d.this.mo7354e();
                    return true;
                }

                /* renamed from: c */
                public boolean mo5736c() {
                    if (C1821d.this.f6185j != null) {
                        return false;
                    }
                    C1821d.this.mo7355g();
                    return true;
                }
            });
        }

        /* renamed from: d */
        public boolean mo5189d() {
            return false;
        }

        /* renamed from: e */
        public boolean mo5190e() {
            return false;
        }

        public boolean performClick() {
            if (!super.performClick()) {
                playSoundEffect(0);
                C1821d.this.mo7354e();
            }
            return true;
        }

        /* access modifiers changed from: protected */
        public boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (!(drawable == null || background == null)) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                C0484a.m2539a(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* renamed from: android.support.v7.widget.d$e */
    private class C1827e extends C1565o {
        public C1827e(Context context, C1550h hVar, View view, boolean z) {
            super(context, hVar, view, z, C1359b.C1361b.actionOverflowMenuStyle);
            mo5521a((int) C1161h.f3609d);
            mo5411a((C1567p.C1568a) C1821d.this.f6186k);
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public void mo5531f() {
            if (C1821d.this.f4877c != null) {
                C1821d.this.f4877c.close();
            }
            C1821d.this.f6183h = null;
            super.mo5531f();
        }
    }

    /* renamed from: android.support.v7.widget.d$f */
    private class C1828f implements C1567p.C1568a {
        C1828f() {
        }

        /* renamed from: a */
        public void mo4932a(C1550h hVar, boolean z) {
            if (hVar instanceof C1576v) {
                hVar.mo5394q().mo5359b(false);
            }
            C1567p.C1568a a = C1821d.this.mo5255a();
            if (a != null) {
                a.mo4932a(hVar, z);
            }
        }

        /* renamed from: a */
        public boolean mo4933a(C1550h hVar) {
            if (hVar == null) {
                return false;
            }
            C1821d.this.f6187l = ((C1576v) hVar).getItem().getItemId();
            C1567p.C1568a a = C1821d.this.mo5255a();
            return a != null ? a.mo4933a(hVar) : false;
        }
    }

    /* renamed from: android.support.v7.widget.d$g */
    private static class C1829g implements Parcelable {
        public static final Parcelable.Creator<C1829g> CREATOR = new Parcelable.Creator<C1829g>() {
            /* renamed from: a */
            public C1829g createFromParcel(Parcel parcel) {
                return new C1829g(parcel);
            }

            /* renamed from: a */
            public C1829g[] newArray(int i) {
                return new C1829g[i];
            }
        };

        /* renamed from: a */
        public int f6211a;

        C1829g() {
        }

        C1829g(Parcel parcel) {
            this.f6211a = parcel.readInt();
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f6211a);
        }
    }

    public C1821d(Context context) {
        super(context, C1359b.C1368i.abc_action_menu_layout, C1359b.C1368i.abc_action_menu_item_layout);
    }

    /* renamed from: a */
    private View m11066a(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f4880f;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof C1569q.C1570a) && ((C1569q.C1570a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: a */
    public C1569q mo5256a(ViewGroup viewGroup) {
        C1569q qVar = this.f4880f;
        C1569q a = super.mo5256a(viewGroup);
        if (qVar != a) {
            ((ActionMenuView) a).setPresenter(this);
        }
        return a;
    }

    /* renamed from: a */
    public View mo5257a(C1555k kVar, View view, ViewGroup viewGroup) {
        View actionView = kVar.getActionView();
        if (actionView == null || kVar.mo5454o()) {
            actionView = super.mo5257a(kVar, view, viewGroup);
        }
        actionView.setVisibility(kVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    /* renamed from: a */
    public void mo7346a(int i, boolean z) {
        this.f6192r = i;
        this.f6196v = z;
        this.f6197w = true;
    }

    /* renamed from: a */
    public void mo5259a(@C0047z Context context, @C0003aa C1550h hVar) {
        super.mo5259a(context, hVar);
        Resources resources = context.getResources();
        C1521a a = C1521a.m8870a(context);
        if (!this.f6191q) {
            this.f6190p = a.mo5114b();
        }
        if (!this.f6197w) {
            this.f6192r = a.mo5115c();
        }
        if (!this.f6195u) {
            this.f6194t = a.mo5113a();
        }
        int i = this.f6192r;
        if (this.f6190p) {
            if (this.f6182g == null) {
                this.f6182g = new C1825d(this.f4875a);
                if (this.f6189o) {
                    this.f6182g.setImageDrawable(this.f6188n);
                    this.f6188n = null;
                    this.f6189o = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f6182g.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.f6182g.getMeasuredWidth();
        } else {
            this.f6182g = null;
        }
        this.f6193s = i;
        this.f6199y = (int) (56.0f * resources.getDisplayMetrics().density);
        this.f6180A = null;
    }

    /* renamed from: a */
    public void mo7347a(Configuration configuration) {
        if (!this.f6195u) {
            this.f6194t = C1521a.m8870a(this.f4876b).mo5113a();
        }
        if (this.f4877c != null) {
            this.f4877c.mo5362c(true);
        }
    }

    /* renamed from: a */
    public void mo7348a(Drawable drawable) {
        if (this.f6182g != null) {
            this.f6182g.setImageDrawable(drawable);
            return;
        }
        this.f6189o = true;
        this.f6188n = drawable;
    }

    /* renamed from: a */
    public void mo5281a(Parcelable parcelable) {
        MenuItem findItem;
        if (parcelable instanceof C1829g) {
            C1829g gVar = (C1829g) parcelable;
            if (gVar.f6211a > 0 && (findItem = this.f4877c.findItem(gVar.f6211a)) != null) {
                mo5266a((C1576v) findItem.getSubMenu());
            }
        }
    }

    /* renamed from: a */
    public void mo5260a(C1550h hVar, boolean z) {
        mo7356h();
        super.mo5260a(hVar, z);
    }

    /* renamed from: a */
    public void mo5261a(C1555k kVar, C1569q.C1570a aVar) {
        aVar.mo5184a(kVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f4880f);
        if (this.f6181B == null) {
            this.f6181B = new C1823b();
        }
        actionMenuItemView.setPopupCallback(this.f6181B);
    }

    /* renamed from: a */
    public void mo7349a(ActionMenuView actionMenuView) {
        this.f4880f = actionMenuView;
        actionMenuView.mo5209a(this.f4877c);
    }

    /* renamed from: a */
    public void mo3970a(boolean z) {
        if (z) {
            super.mo5266a((C1576v) null);
        } else if (this.f4877c != null) {
            this.f4877c.mo5359b(false);
        }
    }

    /* renamed from: a */
    public boolean mo5264a(int i, C1555k kVar) {
        return kVar.mo5450k();
    }

    /* renamed from: a */
    public boolean mo5266a(C1576v vVar) {
        boolean z;
        if (!vVar.hasVisibleItems()) {
            return false;
        }
        C1576v vVar2 = vVar;
        while (vVar2.mo5570t() != this.f4877c) {
            vVar2 = (C1576v) vVar2.mo5570t();
        }
        View a = m11066a(vVar2.getItem());
        if (a == null) {
            return false;
        }
        this.f6187l = vVar.getItem().getItemId();
        int size = vVar.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                z = false;
                break;
            }
            MenuItem item = vVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
            i++;
        }
        this.f6184i = new C1822a(this.f4876b, vVar, a);
        this.f6184i.mo5525a(z);
        this.f6184i.mo5528c();
        super.mo5266a(vVar);
        return true;
    }

    /* renamed from: a */
    public boolean mo5267a(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.f6182g) {
            return false;
        }
        return super.mo5267a(viewGroup, i);
    }

    /* renamed from: b */
    public void mo7350b(int i) {
        this.f6194t = i;
        this.f6195u = true;
    }

    /* renamed from: b */
    public void mo5269b(boolean z) {
        boolean z2 = true;
        boolean z3 = false;
        ViewGroup viewGroup = (ViewGroup) ((View) this.f4880f).getParent();
        if (viewGroup != null) {
            C1490a.m8728a(viewGroup);
        }
        super.mo5269b(z);
        ((View) this.f4880f).requestLayout();
        if (this.f4877c != null) {
            ArrayList<C1555k> l = this.f4877c.mo5387l();
            int size = l.size();
            for (int i = 0; i < size; i++) {
                C1147e a = l.get(i).mo1932a();
                if (a != null) {
                    a.mo3959a((C1147e.C1148a) this);
                }
            }
        }
        ArrayList<C1555k> m = this.f4877c != null ? this.f4877c.mo5388m() : null;
        if (this.f6190p && m != null) {
            int size2 = m.size();
            if (size2 == 1) {
                z3 = !m.get(0).isActionViewExpanded();
            } else {
                if (size2 <= 0) {
                    z2 = false;
                }
                z3 = z2;
            }
        }
        if (z3) {
            if (this.f6182g == null) {
                this.f6182g = new C1825d(this.f4875a);
            }
            ViewGroup viewGroup2 = (ViewGroup) this.f6182g.getParent();
            if (viewGroup2 != this.f4880f) {
                if (viewGroup2 != null) {
                    viewGroup2.removeView(this.f6182g);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f4880f;
                actionMenuView.addView(this.f6182g, actionMenuView.mo5688c());
            }
        } else if (this.f6182g != null && this.f6182g.getParent() == this.f4880f) {
            ((ViewGroup) this.f4880f).removeView(this.f6182g);
        }
        ((ActionMenuView) this.f4880f).setOverflowReserved(this.f6190p);
    }

    /* renamed from: b */
    public boolean mo5270b() {
        int i;
        ArrayList<C1555k> arrayList;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z2;
        if (this.f4877c != null) {
            ArrayList<C1555k> j = this.f4877c.mo5385j();
            i = j.size();
            arrayList = j;
        } else {
            i = 0;
            arrayList = null;
        }
        int i10 = this.f6194t;
        int i11 = this.f6193s;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.f4880f;
        int i12 = 0;
        int i13 = 0;
        boolean z3 = false;
        int i14 = 0;
        while (i14 < i) {
            C1555k kVar = arrayList.get(i14);
            if (kVar.mo5452m()) {
                i12++;
            } else if (kVar.mo5451l()) {
                i13++;
            } else {
                z3 = true;
            }
            i14++;
            i10 = (!this.f6198x || !kVar.isActionViewExpanded()) ? i10 : 0;
        }
        if (this.f6190p && (z3 || i12 + i13 > i10)) {
            i10--;
        }
        int i15 = i10 - i12;
        SparseBooleanArray sparseBooleanArray = this.f6200z;
        sparseBooleanArray.clear();
        int i16 = 0;
        if (this.f6196v) {
            i16 = i11 / this.f6199y;
            i2 = ((i11 % this.f6199y) / i16) + this.f6199y;
        } else {
            i2 = 0;
        }
        int i17 = 0;
        int i18 = 0;
        int i19 = i16;
        while (i17 < i) {
            C1555k kVar2 = arrayList.get(i17);
            if (kVar2.mo5452m()) {
                View a = mo5257a(kVar2, this.f6180A, viewGroup);
                if (this.f6180A == null) {
                    this.f6180A = a;
                }
                if (this.f6196v) {
                    i19 -= ActionMenuView.m9328a(a, i2, i19, makeMeasureSpec, 0);
                } else {
                    a.measure(makeMeasureSpec, makeMeasureSpec);
                }
                i3 = a.getMeasuredWidth();
                int i20 = i11 - i3;
                if (i18 != 0) {
                    i3 = i18;
                }
                int groupId = kVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                kVar2.mo5425d(true);
                i4 = i20;
                i5 = i15;
            } else if (kVar2.mo5451l()) {
                int groupId2 = kVar2.getGroupId();
                boolean z4 = sparseBooleanArray.get(groupId2);
                boolean z5 = (i15 > 0 || z4) && i11 > 0 && (!this.f6196v || i19 > 0);
                if (z5) {
                    View a2 = mo5257a(kVar2, this.f6180A, viewGroup);
                    if (this.f6180A == null) {
                        this.f6180A = a2;
                    }
                    if (this.f6196v) {
                        int a3 = ActionMenuView.m9328a(a2, i2, i19, makeMeasureSpec, 0);
                        int i21 = i19 - a3;
                        z2 = a3 == 0 ? false : z5;
                        i9 = i21;
                    } else {
                        a2.measure(makeMeasureSpec, makeMeasureSpec);
                        boolean z6 = z5;
                        i9 = i19;
                        z2 = z6;
                    }
                    int measuredWidth = a2.getMeasuredWidth();
                    i11 -= measuredWidth;
                    if (i18 == 0) {
                        i18 = measuredWidth;
                    }
                    if (this.f6196v) {
                        z = z2 & (i11 >= 0);
                        i6 = i18;
                        i7 = i9;
                    } else {
                        z = z2 & (i11 + i18 > 0);
                        i6 = i18;
                        i7 = i9;
                    }
                } else {
                    z = z5;
                    i6 = i18;
                    i7 = i19;
                }
                if (z && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                    i8 = i15;
                } else if (z4) {
                    sparseBooleanArray.put(groupId2, false);
                    int i22 = i15;
                    for (int i23 = 0; i23 < i17; i23++) {
                        C1555k kVar3 = arrayList.get(i23);
                        if (kVar3.getGroupId() == groupId2) {
                            if (kVar3.mo5450k()) {
                                i22++;
                            }
                            kVar3.mo5425d(false);
                        }
                    }
                    i8 = i22;
                } else {
                    i8 = i15;
                }
                if (z) {
                    i8--;
                }
                kVar2.mo5425d(z);
                i3 = i6;
                i4 = i11;
                int i24 = i7;
                i5 = i8;
                i19 = i24;
            } else {
                kVar2.mo5425d(false);
                i3 = i18;
                i4 = i11;
                i5 = i15;
            }
            i17++;
            i11 = i4;
            i15 = i5;
            i18 = i3;
        }
        return true;
    }

    /* renamed from: c */
    public void mo7351c(boolean z) {
        this.f6190p = z;
        this.f6191q = true;
    }

    /* renamed from: d */
    public Drawable mo7352d() {
        if (this.f6182g != null) {
            return this.f6182g.getDrawable();
        }
        if (this.f6189o) {
            return this.f6188n;
        }
        return null;
    }

    /* renamed from: d */
    public void mo7353d(boolean z) {
        this.f6198x = z;
    }

    /* renamed from: e */
    public boolean mo7354e() {
        if (!this.f6190p || mo7358j() || this.f4877c == null || this.f4880f == null || this.f6185j != null || this.f4877c.mo5388m().isEmpty()) {
            return false;
        }
        this.f6185j = new C1824c(new C1827e(this.f4876b, this.f4877c, this.f6182g, true));
        ((View) this.f4880f).post(this.f6185j);
        super.mo5266a((C1576v) null);
        return true;
    }

    /* renamed from: f */
    public Parcelable mo5291f() {
        C1829g gVar = new C1829g();
        gVar.f6211a = this.f6187l;
        return gVar;
    }

    /* renamed from: g */
    public boolean mo7355g() {
        if (this.f6185j == null || this.f4880f == null) {
            C1827e eVar = this.f6183h;
            if (eVar == null) {
                return false;
            }
            eVar.mo5410a();
            return true;
        }
        ((View) this.f4880f).removeCallbacks(this.f6185j);
        this.f6185j = null;
        return true;
    }

    /* renamed from: h */
    public boolean mo7356h() {
        return mo7355g() | mo7357i();
    }

    /* renamed from: i */
    public boolean mo7357i() {
        if (this.f6184i == null) {
            return false;
        }
        this.f6184i.mo5410a();
        return true;
    }

    /* renamed from: j */
    public boolean mo7358j() {
        return this.f6183h != null && this.f6183h.mo5532g();
    }

    /* renamed from: k */
    public boolean mo7359k() {
        return this.f6185j != null || mo7358j();
    }

    /* renamed from: l */
    public boolean mo7360l() {
        return this.f6190p;
    }
}
