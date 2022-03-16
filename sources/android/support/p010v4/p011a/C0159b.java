package android.support.p010v4.p011a;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.annotation.TargetApi;
import android.content.pm.ResolveInfo;
import android.support.annotation.C0007ae;

@C0007ae(mo1a = 14)
@TargetApi(14)
/* renamed from: android.support.v4.a.b */
class C0159b {
    C0159b() {
    }

    /* renamed from: a */
    public static boolean m791a(AccessibilityServiceInfo accessibilityServiceInfo) {
        return accessibilityServiceInfo.getCanRetrieveWindowContent();
    }

    /* renamed from: b */
    public static String m792b(AccessibilityServiceInfo accessibilityServiceInfo) {
        return accessibilityServiceInfo.getDescription();
    }

    /* renamed from: c */
    public static String m793c(AccessibilityServiceInfo accessibilityServiceInfo) {
        return accessibilityServiceInfo.getId();
    }

    /* renamed from: d */
    public static ResolveInfo m794d(AccessibilityServiceInfo accessibilityServiceInfo) {
        return accessibilityServiceInfo.getResolveInfo();
    }

    /* renamed from: e */
    public static String m795e(AccessibilityServiceInfo accessibilityServiceInfo) {
        return accessibilityServiceInfo.getSettingsActivityName();
    }
}
