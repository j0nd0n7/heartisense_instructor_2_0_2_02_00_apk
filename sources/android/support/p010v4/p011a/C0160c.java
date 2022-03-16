package android.support.p010v4.p011a;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.annotation.TargetApi;
import android.content.pm.PackageManager;
import android.support.annotation.C0007ae;

@C0007ae(mo1a = 16)
@TargetApi(16)
/* renamed from: android.support.v4.a.c */
class C0160c {
    C0160c() {
    }

    /* renamed from: a */
    public static String m796a(AccessibilityServiceInfo accessibilityServiceInfo, PackageManager packageManager) {
        return accessibilityServiceInfo.loadDescription(packageManager);
    }
}
