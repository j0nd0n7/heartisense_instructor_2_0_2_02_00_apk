package android.support.p036v7.view.menu;

import android.content.Context;
import android.os.Build;
import android.support.annotation.C0011ag;
import android.support.p010v4.p023h.p024a.C0538a;
import android.support.p010v4.p023h.p024a.C0539b;
import android.support.p010v4.p023h.p024a.C0540c;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

@C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
/* renamed from: android.support.v7.view.menu.r */
public final class C1571r {
    private C1571r() {
    }

    /* renamed from: a */
    public static Menu m9237a(Context context, C0538a aVar) {
        if (Build.VERSION.SDK_INT >= 14) {
            return new C1572s(context, aVar);
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public static MenuItem m9238a(Context context, C0539b bVar) {
        if (Build.VERSION.SDK_INT >= 16) {
            return new C1562m(context, bVar);
        }
        if (Build.VERSION.SDK_INT >= 14) {
            return new C1557l(context, bVar);
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public static SubMenu m9239a(Context context, C0540c cVar) {
        if (Build.VERSION.SDK_INT >= 14) {
            return new C1577w(context, cVar);
        }
        throw new UnsupportedOperationException();
    }
}
