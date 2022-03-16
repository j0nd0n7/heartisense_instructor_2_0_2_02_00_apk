package android.support.p010v4.view.p034a;

import android.annotation.TargetApi;
import android.support.annotation.C0007ae;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.List;

@C0007ae(mo1a = 21)
@TargetApi(21)
/* renamed from: android.support.v4.view.a.i */
class C0965i {

    /* renamed from: android.support.v4.view.a.i$a */
    static class C0966a {
        C0966a() {
        }

        /* renamed from: a */
        public static int m5294a(Object obj) {
            return ((AccessibilityNodeInfo.CollectionInfo) obj).getSelectionMode();
        }
    }

    /* renamed from: android.support.v4.view.a.i$b */
    static class C0967b {
        C0967b() {
        }

        /* renamed from: a */
        public static boolean m5295a(Object obj) {
            return ((AccessibilityNodeInfo.CollectionItemInfo) obj).isSelected();
        }
    }

    C0965i() {
    }

    /* renamed from: a */
    public static Object m5279a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        return AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2);
    }

    /* renamed from: a */
    public static Object m5280a(int i, int i2, boolean z, int i3) {
        return AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z, i3);
    }

    /* renamed from: a */
    static Object m5281a(int i, CharSequence charSequence) {
        return new AccessibilityNodeInfo.AccessibilityAction(i, charSequence);
    }

    /* renamed from: a */
    static List<Object> m5282a(Object obj) {
        return ((AccessibilityNodeInfo) obj).getActionList();
    }

    /* renamed from: a */
    public static void m5283a(Object obj, int i) {
        ((AccessibilityNodeInfo) obj).setMaxTextLength(i);
    }

    /* renamed from: a */
    public static void m5284a(Object obj, CharSequence charSequence) {
        ((AccessibilityNodeInfo) obj).setError(charSequence);
    }

    /* renamed from: a */
    static void m5285a(Object obj, Object obj2) {
        ((AccessibilityNodeInfo) obj).addAction((AccessibilityNodeInfo.AccessibilityAction) obj2);
    }

    /* renamed from: a */
    public static boolean m5286a(Object obj, View view) {
        return ((AccessibilityNodeInfo) obj).removeChild(view);
    }

    /* renamed from: a */
    public static boolean m5287a(Object obj, View view, int i) {
        return ((AccessibilityNodeInfo) obj).removeChild(view, i);
    }

    /* renamed from: b */
    public static CharSequence m5288b(Object obj) {
        return ((AccessibilityNodeInfo) obj).getError();
    }

    /* renamed from: b */
    public static boolean m5289b(Object obj, Object obj2) {
        return ((AccessibilityNodeInfo) obj).removeAction((AccessibilityNodeInfo.AccessibilityAction) obj2);
    }

    /* renamed from: c */
    public static int m5290c(Object obj) {
        return ((AccessibilityNodeInfo) obj).getMaxTextLength();
    }

    /* renamed from: d */
    public static Object m5291d(Object obj) {
        return ((AccessibilityNodeInfo) obj).getWindow();
    }

    /* renamed from: e */
    static int m5292e(Object obj) {
        return ((AccessibilityNodeInfo.AccessibilityAction) obj).getId();
    }

    /* renamed from: f */
    static CharSequence m5293f(Object obj) {
        return ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel();
    }
}
