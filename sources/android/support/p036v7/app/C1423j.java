package android.support.p036v7.app;

import android.annotation.TargetApi;
import android.content.Context;
import android.support.annotation.C0007ae;
import android.support.p036v7.app.C1430m;
import android.support.p036v7.app.C1432n;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.Window;
import java.util.List;

@C0007ae(mo1a = 24)
@TargetApi(24)
/* renamed from: android.support.v7.app.j */
class C1423j extends C1430m {

    /* renamed from: android.support.v7.app.j$a */
    class C1424a extends C1430m.C1431a {
        C1424a(Window.Callback callback) {
            super(callback);
        }

        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            C1432n.C1444d a = C1423j.this.mo4911a(0, true);
            if (a == null || a.f4512j == null) {
                super.onProvideKeyboardShortcuts(list, menu, i);
            } else {
                super.onProvideKeyboardShortcuts(list, a.f4512j, i);
            }
        }
    }

    C1423j(Context context, Window window, C1416g gVar) {
        super(context, window, gVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Window.Callback mo4877a(Window.Callback callback) {
        return new C1424a(callback);
    }
}
