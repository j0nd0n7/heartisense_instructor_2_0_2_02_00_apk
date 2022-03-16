package android.support.p010v4.view.p034a;

import android.annotation.TargetApi;
import android.support.annotation.C0007ae;
import android.view.accessibility.AccessibilityManager;

@C0007ae(mo1a = 19)
@TargetApi(19)
/* renamed from: android.support.v4.view.a.g */
class C0945g {

    /* renamed from: android.support.v4.view.a.g$a */
    interface C0947a {
        /* renamed from: a */
        void mo3119a(boolean z);
    }

    /* renamed from: android.support.v4.view.a.g$b */
    public static class C0948b implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* renamed from: a */
        final Object f3267a;

        /* renamed from: b */
        final C0947a f3268b;

        public C0948b(Object obj, C0947a aVar) {
            this.f3267a = obj;
            this.f3268b = aVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C0948b bVar = (C0948b) obj;
            return this.f3267a == null ? bVar.f3267a == null : this.f3267a.equals(bVar.f3267a);
        }

        public int hashCode() {
            if (this.f3267a == null) {
                return 0;
            }
            return this.f3267a.hashCode();
        }

        public void onTouchExplorationStateChanged(boolean z) {
            this.f3268b.mo3119a(z);
        }
    }

    C0945g() {
    }

    /* renamed from: a */
    public static Object m4699a(final C0947a aVar) {
        return new AccessibilityManager.TouchExplorationStateChangeListener() {
            public void onTouchExplorationStateChanged(boolean z) {
                aVar.mo3119a(z);
            }
        };
    }

    /* renamed from: a */
    public static boolean m4700a(AccessibilityManager accessibilityManager, Object obj) {
        return accessibilityManager.addTouchExplorationStateChangeListener((AccessibilityManager.TouchExplorationStateChangeListener) obj);
    }

    /* renamed from: b */
    public static boolean m4701b(AccessibilityManager accessibilityManager, Object obj) {
        return accessibilityManager.removeTouchExplorationStateChangeListener((AccessibilityManager.TouchExplorationStateChangeListener) obj);
    }
}
