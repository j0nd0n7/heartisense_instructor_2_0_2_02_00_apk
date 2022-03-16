package android.support.p010v4.view;

import android.annotation.TargetApi;
import android.os.Bundle;
import android.support.annotation.C0007ae;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;

@C0007ae(mo1a = 16)
@TargetApi(16)
/* renamed from: android.support.v4.view.d */
class C1144d {

    /* renamed from: android.support.v4.view.d$a */
    public interface C1146a {
        /* renamed from: a */
        Object mo3788a(View view);

        /* renamed from: a */
        void mo3789a(View view, int i);

        /* renamed from: a */
        void mo3790a(View view, Object obj);

        /* renamed from: a */
        boolean mo3791a(View view, int i, Bundle bundle);

        /* renamed from: a */
        boolean mo3792a(View view, AccessibilityEvent accessibilityEvent);

        /* renamed from: a */
        boolean mo3793a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent);

        /* renamed from: b */
        void mo3794b(View view, AccessibilityEvent accessibilityEvent);

        /* renamed from: c */
        void mo3795c(View view, AccessibilityEvent accessibilityEvent);

        /* renamed from: d */
        void mo3796d(View view, AccessibilityEvent accessibilityEvent);
    }

    C1144d() {
    }

    /* renamed from: a */
    public static Object m6922a(final C1146a aVar) {
        return new View.AccessibilityDelegate() {
            public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                return aVar.mo3792a(view, accessibilityEvent);
            }

            public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
                return (AccessibilityNodeProvider) aVar.mo3788a(view);
            }

            public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                aVar.mo3794b(view, accessibilityEvent);
            }

            public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                aVar.mo3790a(view, (Object) accessibilityNodeInfo);
            }

            public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                aVar.mo3795c(view, accessibilityEvent);
            }

            public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
                return aVar.mo3793a(viewGroup, view, accessibilityEvent);
            }

            public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
                return aVar.mo3791a(view, i, bundle);
            }

            public void sendAccessibilityEvent(View view, int i) {
                aVar.mo3789a(view, i);
            }

            public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
                aVar.mo3796d(view, accessibilityEvent);
            }
        };
    }

    /* renamed from: a */
    public static Object m6923a(Object obj, View view) {
        return ((View.AccessibilityDelegate) obj).getAccessibilityNodeProvider(view);
    }

    /* renamed from: a */
    public static boolean m6924a(Object obj, View view, int i, Bundle bundle) {
        return ((View.AccessibilityDelegate) obj).performAccessibilityAction(view, i, bundle);
    }
}
