package android.support.p010v4.view;

import android.annotation.TargetApi;
import android.support.annotation.C0007ae;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

@C0007ae(mo1a = 14)
@TargetApi(14)
/* renamed from: android.support.v4.view.c */
class C1140c {

    /* renamed from: android.support.v4.view.c$a */
    public interface C1142a {
        /* renamed from: a */
        void mo3779a(View view, int i);

        /* renamed from: a */
        void mo3780a(View view, Object obj);

        /* renamed from: a */
        boolean mo3781a(View view, AccessibilityEvent accessibilityEvent);

        /* renamed from: a */
        boolean mo3782a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent);

        /* renamed from: b */
        void mo3783b(View view, AccessibilityEvent accessibilityEvent);

        /* renamed from: c */
        void mo3784c(View view, AccessibilityEvent accessibilityEvent);

        /* renamed from: d */
        void mo3785d(View view, AccessibilityEvent accessibilityEvent);
    }

    C1140c() {
    }

    /* renamed from: a */
    public static Object m6898a() {
        return new View.AccessibilityDelegate();
    }

    /* renamed from: a */
    public static Object m6899a(final C1142a aVar) {
        return new View.AccessibilityDelegate() {
            public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                return aVar.mo3781a(view, accessibilityEvent);
            }

            public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                aVar.mo3783b(view, accessibilityEvent);
            }

            public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                aVar.mo3780a(view, (Object) accessibilityNodeInfo);
            }

            public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                aVar.mo3784c(view, accessibilityEvent);
            }

            public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
                return aVar.mo3782a(viewGroup, view, accessibilityEvent);
            }

            public void sendAccessibilityEvent(View view, int i) {
                aVar.mo3779a(view, i);
            }

            public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
                aVar.mo3785d(view, accessibilityEvent);
            }
        };
    }

    /* renamed from: a */
    public static void m6900a(Object obj, View view, int i) {
        ((View.AccessibilityDelegate) obj).sendAccessibilityEvent(view, i);
    }

    /* renamed from: a */
    public static void m6901a(Object obj, View view, Object obj2) {
        ((View.AccessibilityDelegate) obj).onInitializeAccessibilityNodeInfo(view, (AccessibilityNodeInfo) obj2);
    }

    /* renamed from: a */
    public static boolean m6902a(Object obj, View view, AccessibilityEvent accessibilityEvent) {
        return ((View.AccessibilityDelegate) obj).dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: a */
    public static boolean m6903a(Object obj, ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return ((View.AccessibilityDelegate) obj).onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* renamed from: b */
    public static void m6904b(Object obj, View view, AccessibilityEvent accessibilityEvent) {
        ((View.AccessibilityDelegate) obj).onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: c */
    public static void m6905c(Object obj, View view, AccessibilityEvent accessibilityEvent) {
        ((View.AccessibilityDelegate) obj).onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: d */
    public static void m6906d(Object obj, View view, AccessibilityEvent accessibilityEvent) {
        ((View.AccessibilityDelegate) obj).sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
