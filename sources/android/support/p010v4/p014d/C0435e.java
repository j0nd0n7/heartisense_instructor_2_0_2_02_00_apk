package android.support.p010v4.p014d;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.C0007ae;
import java.io.File;

@C0007ae(mo1a = 21)
@TargetApi(21)
/* renamed from: android.support.v4.d.e */
class C0435e {
    C0435e() {
    }

    /* renamed from: a */
    public static Drawable m2387a(Context context, int i) {
        return context.getDrawable(i);
    }

    /* renamed from: a */
    public static File m2388a(Context context) {
        return context.getNoBackupFilesDir();
    }

    /* renamed from: b */
    public static File m2389b(Context context) {
        return context.getCodeCacheDir();
    }
}
