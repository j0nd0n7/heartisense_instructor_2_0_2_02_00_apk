package android.support.p010v4.p020g.p021a;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.support.annotation.C0007ae;
import android.view.Display;

@C0007ae(mo1a = 17)
@TargetApi(17)
/* renamed from: android.support.v4.g.a.b */
final class C0523b {
    C0523b() {
    }

    /* renamed from: a */
    public static Display m2725a(Object obj, int i) {
        return ((DisplayManager) obj).getDisplay(i);
    }

    /* renamed from: a */
    public static Object m2726a(Context context) {
        return context.getSystemService("display");
    }

    /* renamed from: a */
    public static Display[] m2727a(Object obj) {
        return ((DisplayManager) obj).getDisplays();
    }

    /* renamed from: a */
    public static Display[] m2728a(Object obj, String str) {
        return ((DisplayManager) obj).getDisplays(str);
    }
}
