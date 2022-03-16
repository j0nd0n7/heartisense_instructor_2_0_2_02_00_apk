package android.support.p010v4.p028k;

import android.annotation.TargetApi;
import android.os.Environment;
import android.support.annotation.C0007ae;
import java.io.File;

@C0007ae(mo1a = 19)
@TargetApi(19)
/* renamed from: android.support.v4.k.g */
class C0803g {
    C0803g() {
    }

    /* renamed from: a */
    public static String m4085a(File file) {
        return Environment.getStorageState(file);
    }
}
