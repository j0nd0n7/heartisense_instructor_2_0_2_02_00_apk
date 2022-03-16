package android.support.p010v4.widget;

import android.annotation.TargetApi;
import android.support.annotation.C0007ae;
import android.view.View;
import android.widget.ListView;

@C0007ae(mo1a = 9)
@TargetApi(9)
/* renamed from: android.support.v4.widget.v */
class C1345v {
    C1345v() {
    }

    /* renamed from: a */
    static void m7881a(ListView listView, int i) {
        View childAt;
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        if (firstVisiblePosition != -1 && (childAt = listView.getChildAt(0)) != null) {
            listView.setSelectionFromTop(firstVisiblePosition, childAt.getTop() - i);
        }
    }
}
