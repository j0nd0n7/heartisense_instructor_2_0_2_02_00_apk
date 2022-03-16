package android.support.p010v4.widget;

import android.os.Build;
import android.support.annotation.C0047z;
import android.widget.ListView;

/* renamed from: android.support.v4.widget.u */
public final class C1344u {
    private C1344u() {
    }

    /* renamed from: a */
    public static void m7880a(@C0047z ListView listView, int i) {
        if (Build.VERSION.SDK_INT >= 19) {
            C1346w.m7882a(listView, i);
        } else {
            C1345v.m7881a(listView, i);
        }
    }
}
