package android.support.p010v4.widget;

import android.annotation.TargetApi;
import android.support.annotation.C0007ae;
import android.view.View;
import android.widget.ListPopupWindow;

@C0007ae(mo1a = 19)
@TargetApi(19)
/* renamed from: android.support.v4.widget.s */
class C1342s {
    C1342s() {
    }

    /* renamed from: a */
    public static View.OnTouchListener m7876a(Object obj, View view) {
        return ((ListPopupWindow) obj).createDragToOpenListener(view);
    }
}
