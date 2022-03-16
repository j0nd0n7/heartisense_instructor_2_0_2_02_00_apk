package android.support.p010v4.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.support.annotation.C0007ae;
import android.view.View;
import android.widget.SearchView;

@C0007ae(mo1a = 14)
@TargetApi(14)
/* renamed from: android.support.v4.widget.aj */
class C1242aj {

    /* renamed from: android.support.v4.widget.aj$a */
    public static class C1243a extends SearchView {
        public C1243a(Context context) {
            super(context);
        }

        public void onActionViewCollapsed() {
            setQuery("", false);
            super.onActionViewCollapsed();
        }
    }

    C1242aj() {
    }

    /* renamed from: a */
    public static View m7382a(Context context) {
        return new C1243a(context);
    }

    /* renamed from: a */
    public static void m7383a(View view, int i) {
        ((SearchView) view).setImeOptions(i);
    }

    /* renamed from: b */
    public static void m7384b(View view, int i) {
        ((SearchView) view).setInputType(i);
    }
}
