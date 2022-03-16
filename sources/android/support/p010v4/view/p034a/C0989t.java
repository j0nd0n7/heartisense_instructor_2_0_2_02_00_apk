package android.support.p010v4.view.p034a;

import android.annotation.TargetApi;
import android.os.Bundle;
import android.support.annotation.C0007ae;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

@C0007ae(mo1a = 19)
@TargetApi(19)
/* renamed from: android.support.v4.view.a.t */
class C0989t {

    /* renamed from: android.support.v4.view.a.t$a */
    interface C0991a {
        /* renamed from: a */
        Object mo3416a(int i);

        /* renamed from: a */
        List<Object> mo3417a(String str, int i);

        /* renamed from: a */
        boolean mo3418a(int i, int i2, Bundle bundle);

        /* renamed from: b */
        Object mo3419b(int i);
    }

    C0989t() {
    }

    /* renamed from: a */
    public static Object m5450a(final C0991a aVar) {
        return new AccessibilityNodeProvider() {
            public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
                return (AccessibilityNodeInfo) aVar.mo3416a(i);
            }

            public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
                return aVar.mo3417a(str, i);
            }

            public AccessibilityNodeInfo findFocus(int i) {
                return (AccessibilityNodeInfo) aVar.mo3419b(i);
            }

            public boolean performAction(int i, int i2, Bundle bundle) {
                return aVar.mo3418a(i, i2, bundle);
            }
        };
    }
}
