package android.support.p010v4.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.support.annotation.C0007ae;
import android.view.PointerIcon;

@C0007ae(mo1a = 24)
@TargetApi(24)
/* renamed from: android.support.v4.view.ak */
class C1027ak {
    C1027ak() {
    }

    /* renamed from: a */
    public static Object m5828a(Context context, int i) {
        return PointerIcon.getSystemIcon(context, i);
    }

    /* renamed from: a */
    public static Object m5829a(Resources resources, int i) {
        return PointerIcon.load(resources, i);
    }

    /* renamed from: a */
    public static Object m5830a(Bitmap bitmap, float f, float f2) {
        return PointerIcon.create(bitmap, f, f2);
    }
}
