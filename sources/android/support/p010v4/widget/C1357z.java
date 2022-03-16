package android.support.p010v4.widget;

import android.annotation.TargetApi;
import android.support.annotation.C0007ae;
import android.view.View;
import android.widget.PopupMenu;

@C0007ae(mo1a = 19)
@TargetApi(19)
/* renamed from: android.support.v4.widget.z */
class C1357z {
    C1357z() {
    }

    /* renamed from: a */
    public static View.OnTouchListener m7936a(Object obj) {
        return ((PopupMenu) obj).getDragToOpenListener();
    }
}
