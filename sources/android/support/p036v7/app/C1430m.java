package android.support.p036v7.app;

import android.annotation.TargetApi;
import android.app.UiModeManager;
import android.content.Context;
import android.support.annotation.C0007ae;
import android.support.p036v7.app.C1426l;
import android.view.ActionMode;
import android.view.Window;

@C0007ae(mo1a = 23)
@TargetApi(23)
/* renamed from: android.support.v7.app.m */
class C1430m extends C1426l {

    /* renamed from: E */
    private final UiModeManager f4463E;

    /* renamed from: android.support.v7.app.m$a */
    class C1431a extends C1426l.C1427a {
        C1431a(Window.Callback callback) {
            super(callback);
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            if (C1430m.this.mo4875j()) {
                switch (i) {
                    case 0:
                        return mo4903a(callback);
                }
            }
            return super.onWindowStartingActionMode(callback, i);
        }
    }

    C1430m(Context context, Window window, C1416g gVar) {
        super(context, window, gVar);
        this.f4463E = (UiModeManager) context.getSystemService("uimode");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Window.Callback mo4877a(Window.Callback callback) {
        return new C1431a(callback);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo4901g(int i) {
        if (i == 0 && this.f4463E.getNightMode() == 0) {
            return -1;
        }
        return super.mo4901g(i);
    }
}
