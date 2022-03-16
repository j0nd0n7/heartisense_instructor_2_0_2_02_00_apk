package android.support.p010v4.p012b;

import android.os.Build;
import android.support.annotation.C0011ag;
import android.view.View;

@C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
/* renamed from: android.support.v4.b.a */
public final class C0163a {

    /* renamed from: a */
    private static final C0165c f1057a;

    static {
        if (Build.VERSION.SDK_INT >= 12) {
            f1057a = new C0170f();
        } else {
            f1057a = new C0167e();
        }
    }

    private C0163a() {
    }

    /* renamed from: a */
    public static C0174g m798a() {
        return f1057a.mo722a();
    }

    /* renamed from: a */
    public static void m799a(View view) {
        f1057a.mo723a(view);
    }
}
