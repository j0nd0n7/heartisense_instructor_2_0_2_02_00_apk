package android.support.p010v4.view;

import android.annotation.TargetApi;
import android.support.annotation.C0007ae;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;

@C0007ae(mo1a = 21)
@TargetApi(21)
/* renamed from: android.support.v4.view.bn */
class C1111bn {

    /* renamed from: a */
    private static final String f3529a = "ViewParentCompat";

    C1111bn() {
    }

    /* renamed from: a */
    public static void m6605a(ViewParent viewParent, View view) {
        try {
            viewParent.onStopNestedScroll(view);
        } catch (AbstractMethodError e) {
            Log.e(f3529a, "ViewParent " + viewParent + " does not implement interface " + "method onStopNestedScroll", e);
        }
    }

    /* renamed from: a */
    public static void m6606a(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
        try {
            viewParent.onNestedScroll(view, i, i2, i3, i4);
        } catch (AbstractMethodError e) {
            Log.e(f3529a, "ViewParent " + viewParent + " does not implement interface " + "method onNestedScroll", e);
        }
    }

    /* renamed from: a */
    public static void m6607a(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
        try {
            viewParent.onNestedPreScroll(view, i, i2, iArr);
        } catch (AbstractMethodError e) {
            Log.e(f3529a, "ViewParent " + viewParent + " does not implement interface " + "method onNestedPreScroll", e);
        }
    }

    /* renamed from: a */
    public static boolean m6608a(ViewParent viewParent, View view, float f, float f2) {
        try {
            return viewParent.onNestedPreFling(view, f, f2);
        } catch (AbstractMethodError e) {
            Log.e(f3529a, "ViewParent " + viewParent + " does not implement interface " + "method onNestedPreFling", e);
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m6609a(ViewParent viewParent, View view, float f, float f2, boolean z) {
        try {
            return viewParent.onNestedFling(view, f, f2, z);
        } catch (AbstractMethodError e) {
            Log.e(f3529a, "ViewParent " + viewParent + " does not implement interface " + "method onNestedFling", e);
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m6610a(ViewParent viewParent, View view, View view2, int i) {
        try {
            return viewParent.onStartNestedScroll(view, view2, i);
        } catch (AbstractMethodError e) {
            Log.e(f3529a, "ViewParent " + viewParent + " does not implement interface " + "method onStartNestedScroll", e);
            return false;
        }
    }

    /* renamed from: b */
    public static void m6611b(ViewParent viewParent, View view, View view2, int i) {
        try {
            viewParent.onNestedScrollAccepted(view, view2, i);
        } catch (AbstractMethodError e) {
            Log.e(f3529a, "ViewParent " + viewParent + " does not implement interface " + "method onNestedScrollAccepted", e);
        }
    }
}
