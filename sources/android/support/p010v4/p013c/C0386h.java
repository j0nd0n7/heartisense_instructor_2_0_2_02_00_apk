package android.support.p010v4.p013c;

import android.annotation.TargetApi;
import android.app.Activity;
import android.support.annotation.C0007ae;
import java.io.FileDescriptor;
import java.io.PrintWriter;

@C0007ae(mo1a = 11)
@TargetApi(11)
/* renamed from: android.support.v4.c.h */
class C0386h {
    C0386h() {
    }

    /* renamed from: a */
    static void m2161a(Activity activity) {
        activity.invalidateOptionsMenu();
    }

    /* renamed from: a */
    static void m2162a(Activity activity, String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        activity.dump(str, fileDescriptor, printWriter, strArr);
    }
}
