package android.support.p010v4.view.p034a;

import android.annotation.TargetApi;
import android.graphics.Rect;
import android.support.annotation.C0007ae;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.List;

@C0007ae(mo1a = 14)
@TargetApi(14)
/* renamed from: android.support.v4.view.a.m */
class C0971m {
    C0971m() {
    }

    /* renamed from: a */
    public static Object m5316a() {
        return AccessibilityNodeInfo.obtain();
    }

    /* renamed from: a */
    public static Object m5317a(View view) {
        return AccessibilityNodeInfo.obtain(view);
    }

    /* renamed from: a */
    public static Object m5318a(Object obj) {
        return AccessibilityNodeInfo.obtain((AccessibilityNodeInfo) obj);
    }

    /* renamed from: a */
    public static List<Object> m5319a(Object obj, String str) {
        return ((AccessibilityNodeInfo) obj).findAccessibilityNodeInfosByText(str);
    }

    /* renamed from: a */
    public static void m5320a(Object obj, int i) {
        ((AccessibilityNodeInfo) obj).addAction(i);
    }

    /* renamed from: a */
    public static void m5321a(Object obj, Rect rect) {
        ((AccessibilityNodeInfo) obj).getBoundsInParent(rect);
    }

    /* renamed from: a */
    public static void m5322a(Object obj, View view) {
        ((AccessibilityNodeInfo) obj).addChild(view);
    }

    /* renamed from: a */
    public static void m5323a(Object obj, CharSequence charSequence) {
        ((AccessibilityNodeInfo) obj).setClassName(charSequence);
    }

    /* renamed from: a */
    public static void m5324a(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setCheckable(z);
    }

    /* renamed from: b */
    public static int m5325b(Object obj) {
        return ((AccessibilityNodeInfo) obj).getActions();
    }

    /* renamed from: b */
    public static Object m5326b(Object obj, int i) {
        return ((AccessibilityNodeInfo) obj).getChild(i);
    }

    /* renamed from: b */
    public static void m5327b(Object obj, Rect rect) {
        ((AccessibilityNodeInfo) obj).getBoundsInScreen(rect);
    }

    /* renamed from: b */
    public static void m5328b(Object obj, View view) {
        ((AccessibilityNodeInfo) obj).setParent(view);
    }

    /* renamed from: b */
    public static void m5329b(Object obj, CharSequence charSequence) {
        ((AccessibilityNodeInfo) obj).setContentDescription(charSequence);
    }

    /* renamed from: b */
    public static void m5330b(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setChecked(z);
    }

    /* renamed from: c */
    public static int m5331c(Object obj) {
        return ((AccessibilityNodeInfo) obj).getChildCount();
    }

    /* renamed from: c */
    public static void m5332c(Object obj, Rect rect) {
        ((AccessibilityNodeInfo) obj).setBoundsInParent(rect);
    }

    /* renamed from: c */
    public static void m5333c(Object obj, View view) {
        ((AccessibilityNodeInfo) obj).setSource(view);
    }

    /* renamed from: c */
    public static void m5334c(Object obj, CharSequence charSequence) {
        ((AccessibilityNodeInfo) obj).setPackageName(charSequence);
    }

    /* renamed from: c */
    public static void m5335c(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setClickable(z);
    }

    /* renamed from: c */
    public static boolean m5336c(Object obj, int i) {
        return ((AccessibilityNodeInfo) obj).performAction(i);
    }

    /* renamed from: d */
    public static CharSequence m5337d(Object obj) {
        return ((AccessibilityNodeInfo) obj).getClassName();
    }

    /* renamed from: d */
    public static void m5338d(Object obj, Rect rect) {
        ((AccessibilityNodeInfo) obj).setBoundsInScreen(rect);
    }

    /* renamed from: d */
    public static void m5339d(Object obj, CharSequence charSequence) {
        ((AccessibilityNodeInfo) obj).setText(charSequence);
    }

    /* renamed from: d */
    public static void m5340d(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setEnabled(z);
    }

    /* renamed from: e */
    public static CharSequence m5341e(Object obj) {
        return ((AccessibilityNodeInfo) obj).getContentDescription();
    }

    /* renamed from: e */
    public static void m5342e(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setFocusable(z);
    }

    /* renamed from: f */
    public static CharSequence m5343f(Object obj) {
        return ((AccessibilityNodeInfo) obj).getPackageName();
    }

    /* renamed from: f */
    public static void m5344f(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setFocused(z);
    }

    /* renamed from: g */
    public static Object m5345g(Object obj) {
        return ((AccessibilityNodeInfo) obj).getParent();
    }

    /* renamed from: g */
    public static void m5346g(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setLongClickable(z);
    }

    /* renamed from: h */
    public static CharSequence m5347h(Object obj) {
        return ((AccessibilityNodeInfo) obj).getText();
    }

    /* renamed from: h */
    public static void m5348h(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setPassword(z);
    }

    /* renamed from: i */
    public static int m5349i(Object obj) {
        return ((AccessibilityNodeInfo) obj).getWindowId();
    }

    /* renamed from: i */
    public static void m5350i(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setScrollable(z);
    }

    /* renamed from: j */
    public static void m5351j(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setSelected(z);
    }

    /* renamed from: j */
    public static boolean m5352j(Object obj) {
        return ((AccessibilityNodeInfo) obj).isCheckable();
    }

    /* renamed from: k */
    public static boolean m5353k(Object obj) {
        return ((AccessibilityNodeInfo) obj).isChecked();
    }

    /* renamed from: l */
    public static boolean m5354l(Object obj) {
        return ((AccessibilityNodeInfo) obj).isClickable();
    }

    /* renamed from: m */
    public static boolean m5355m(Object obj) {
        return ((AccessibilityNodeInfo) obj).isEnabled();
    }

    /* renamed from: n */
    public static boolean m5356n(Object obj) {
        return ((AccessibilityNodeInfo) obj).isFocusable();
    }

    /* renamed from: o */
    public static boolean m5357o(Object obj) {
        return ((AccessibilityNodeInfo) obj).isFocused();
    }

    /* renamed from: p */
    public static boolean m5358p(Object obj) {
        return ((AccessibilityNodeInfo) obj).isLongClickable();
    }

    /* renamed from: q */
    public static boolean m5359q(Object obj) {
        return ((AccessibilityNodeInfo) obj).isPassword();
    }

    /* renamed from: r */
    public static boolean m5360r(Object obj) {
        return ((AccessibilityNodeInfo) obj).isScrollable();
    }

    /* renamed from: s */
    public static boolean m5361s(Object obj) {
        return ((AccessibilityNodeInfo) obj).isSelected();
    }

    /* renamed from: t */
    public static void m5362t(Object obj) {
        ((AccessibilityNodeInfo) obj).recycle();
    }
}
