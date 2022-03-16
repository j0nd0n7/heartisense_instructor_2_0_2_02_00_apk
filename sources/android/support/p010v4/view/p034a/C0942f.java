package android.support.p010v4.view.p034a;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.annotation.TargetApi;
import android.support.annotation.C0007ae;
import android.view.accessibility.AccessibilityManager;
import java.util.List;

@C0007ae(mo1a = 14)
@TargetApi(14)
/* renamed from: android.support.v4.view.a.f */
class C0942f {

    /* renamed from: android.support.v4.view.a.f$a */
    interface C0943a {
        /* renamed from: a */
        void mo3115a(boolean z);
    }

    /* renamed from: android.support.v4.view.a.f$b */
    public static class C0944b implements AccessibilityManager.AccessibilityStateChangeListener {

        /* renamed from: a */
        Object f3264a;

        /* renamed from: b */
        C0943a f3265b;

        public C0944b(Object obj, C0943a aVar) {
            this.f3264a = obj;
            this.f3265b = aVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C0944b bVar = (C0944b) obj;
            return this.f3264a == null ? bVar.f3264a == null : this.f3264a.equals(bVar.f3264a);
        }

        public int hashCode() {
            if (this.f3264a == null) {
                return 0;
            }
            return this.f3264a.hashCode();
        }

        public void onAccessibilityStateChanged(boolean z) {
            this.f3265b.mo3115a(z);
        }
    }

    C0942f() {
    }

    /* renamed from: a */
    public static List<AccessibilityServiceInfo> m4693a(AccessibilityManager accessibilityManager) {
        return accessibilityManager.getInstalledAccessibilityServiceList();
    }

    /* renamed from: a */
    public static List<AccessibilityServiceInfo> m4694a(AccessibilityManager accessibilityManager, int i) {
        return accessibilityManager.getEnabledAccessibilityServiceList(i);
    }

    /* renamed from: a */
    public static boolean m4695a(AccessibilityManager accessibilityManager, C0944b bVar) {
        return accessibilityManager.addAccessibilityStateChangeListener(bVar);
    }

    /* renamed from: b */
    public static boolean m4696b(AccessibilityManager accessibilityManager) {
        return accessibilityManager.isTouchExplorationEnabled();
    }

    /* renamed from: b */
    public static boolean m4697b(AccessibilityManager accessibilityManager, C0944b bVar) {
        return accessibilityManager.removeAccessibilityStateChangeListener(bVar);
    }
}
