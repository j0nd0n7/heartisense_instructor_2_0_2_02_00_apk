package android.support.p010v4.view;

import android.annotation.TargetApi;
import android.graphics.Rect;
import android.support.annotation.C0007ae;
import android.view.View;

@C0007ae(mo1a = 18)
@TargetApi(18)
/* renamed from: android.support.v4.view.az */
class C1065az {
    C1065az() {
    }

    /* renamed from: a */
    public static Rect m6411a(View view) {
        return view.getClipBounds();
    }

    /* renamed from: a */
    public static void m6412a(View view, Rect rect) {
        view.setClipBounds(rect);
    }

    /* renamed from: b */
    public static boolean m6413b(View view) {
        return view.isInLayout();
    }
}
