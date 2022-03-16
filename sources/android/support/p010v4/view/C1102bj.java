package android.support.p010v4.view;

import android.annotation.TargetApi;
import android.support.annotation.C0007ae;
import android.view.ViewGroup;

@C0007ae(mo1a = 21)
@TargetApi(21)
/* renamed from: android.support.v4.view.bj */
class C1102bj {
    C1102bj() {
    }

    /* renamed from: a */
    public static void m6564a(ViewGroup viewGroup, boolean z) {
        viewGroup.setTransitionGroup(z);
    }

    /* renamed from: a */
    public static boolean m6565a(ViewGroup viewGroup) {
        return viewGroup.isTransitionGroup();
    }

    /* renamed from: b */
    public static int m6566b(ViewGroup viewGroup) {
        return viewGroup.getNestedScrollAxes();
    }
}
