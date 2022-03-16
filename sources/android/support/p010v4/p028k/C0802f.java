package android.support.p010v4.p028k;

import android.os.Build;
import android.os.Environment;
import android.util.Log;
import java.io.File;
import java.io.IOException;

/* renamed from: android.support.v4.k.f */
public final class C0802f {

    /* renamed from: a */
    public static final String f2876a = "unknown";

    /* renamed from: b */
    private static final String f2877b = "EnvironmentCompat";

    private C0802f() {
    }

    /* renamed from: a */
    public static String m4084a(File file) {
        if (Build.VERSION.SDK_INT >= 19) {
            return C0803g.m4085a(file);
        }
        try {
            if (file.getCanonicalPath().startsWith(Environment.getExternalStorageDirectory().getCanonicalPath())) {
                return Environment.getExternalStorageState();
            }
        } catch (IOException e) {
            Log.w(f2877b, "Failed to resolve canonical path: " + e);
        }
        return f2876a;
    }
}
