package android.support.p036v7.view.menu;

import android.content.Context;
import android.support.annotation.C0011ag;
import android.support.p036v7.view.menu.C1550h;
import android.support.p036v7.widget.C1807bp;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

@C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
/* renamed from: android.support.v7.view.menu.ExpandedMenuView */
public final class ExpandedMenuView extends ListView implements C1550h.C1552b, C1569q, AdapterView.OnItemClickListener {

    /* renamed from: a */
    private static final int[] f4836a = {16842964, 16843049};

    /* renamed from: b */
    private C1550h f4837b;

    /* renamed from: c */
    private int f4838c;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C1807bp a = C1807bp.m10923a(context, attributeSet, f4836a, i, 0);
        if (a.mo7316j(0)) {
            setBackgroundDrawable(a.mo7293a(0));
        }
        if (a.mo7316j(1)) {
            setDivider(a.mo7293a(1));
        }
        a.mo7308e();
    }

    /* renamed from: a */
    public void mo5209a(C1550h hVar) {
        this.f4837b = hVar;
    }

    /* renamed from: a */
    public boolean mo5210a(C1555k kVar) {
        return this.f4837b.mo5343a((MenuItem) kVar, 0);
    }

    public int getWindowAnimations() {
        return this.f4838c;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        mo5210a((C1555k) getAdapter().getItem(i));
    }
}
