package android.support.p010v4.view;

import android.annotation.TargetApi;
import android.support.annotation.C0007ae;
import android.view.MenuItem;
import android.view.View;

@C0007ae(mo1a = 11)
@TargetApi(11)
/* renamed from: android.support.v4.view.v */
class C1196v {
    C1196v() {
    }

    /* renamed from: a */
    public static MenuItem m7120a(MenuItem menuItem, View view) {
        return menuItem.setActionView(view);
    }

    /* renamed from: a */
    public static View m7121a(MenuItem menuItem) {
        return menuItem.getActionView();
    }

    /* renamed from: a */
    public static void m7122a(MenuItem menuItem, int i) {
        menuItem.setShowAsAction(i);
    }

    /* renamed from: b */
    public static MenuItem m7123b(MenuItem menuItem, int i) {
        return menuItem.setActionView(i);
    }
}
