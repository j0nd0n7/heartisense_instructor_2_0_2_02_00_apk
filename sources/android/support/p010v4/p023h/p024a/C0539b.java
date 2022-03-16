package android.support.p010v4.p023h.p024a;

import android.support.annotation.C0011ag;
import android.support.p010v4.view.C1147e;
import android.support.p010v4.view.C1189u;
import android.view.MenuItem;
import android.view.View;

@C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
/* renamed from: android.support.v4.h.a.b */
public interface C0539b extends MenuItem {

    /* renamed from: a */
    public static final int f2116a = 0;

    /* renamed from: b */
    public static final int f2117b = 1;

    /* renamed from: c */
    public static final int f2118c = 2;

    /* renamed from: d */
    public static final int f2119d = 4;

    /* renamed from: e */
    public static final int f2120e = 8;

    /* renamed from: a */
    C0539b mo1930a(C1147e eVar);

    /* renamed from: a */
    C0539b mo1931a(C1189u.C1195e eVar);

    /* renamed from: a */
    C1147e mo1932a();

    boolean collapseActionView();

    boolean expandActionView();

    View getActionView();

    boolean isActionViewExpanded();

    MenuItem setActionView(int i);

    MenuItem setActionView(View view);

    void setShowAsAction(int i);

    MenuItem setShowAsActionFlags(int i);
}
