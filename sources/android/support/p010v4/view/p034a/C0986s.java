package android.support.p010v4.view.p034a;

import android.annotation.TargetApi;
import android.os.Bundle;
import android.support.annotation.C0007ae;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

@C0007ae(mo1a = 16)
@TargetApi(16)
/* renamed from: android.support.v4.view.a.s */
class C0986s {

    /* renamed from: android.support.v4.view.a.s$a */
    interface C0988a {
        /* renamed from: a */
        Object mo3413a(int i);

        /* renamed from: a */
        List<Object> mo3414a(String str, int i);

        /* renamed from: a */
        boolean mo3415a(int i, int i2, Bundle bundle);
    }

    C0986s() {
    }

    /* renamed from: a */
    public static Object m5446a(final C0988a aVar) {
        return new AccessibilityNodeProvider() {
            public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
                return (AccessibilityNodeInfo) aVar.mo3413a(i);
            }

            public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
                return aVar.mo3414a(str, i);
            }

            public boolean performAction(int i, int i2, Bundle bundle) {
                return aVar.mo3415a(i, i2, bundle);
            }
        };
    }
}
