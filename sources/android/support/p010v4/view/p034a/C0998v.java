package android.support.p010v4.view.p034a;

import android.annotation.TargetApi;
import android.os.Parcelable;
import android.support.annotation.C0007ae;
import android.view.View;
import android.view.accessibility.AccessibilityRecord;
import java.util.List;

@C0007ae(mo1a = 14)
@TargetApi(14)
/* renamed from: android.support.v4.view.a.v */
class C0998v {
    C0998v() {
    }

    /* renamed from: a */
    public static Object m5640a() {
        return AccessibilityRecord.obtain();
    }

    /* renamed from: a */
    public static Object m5641a(Object obj) {
        return AccessibilityRecord.obtain((AccessibilityRecord) obj);
    }

    /* renamed from: a */
    public static void m5642a(Object obj, int i) {
        ((AccessibilityRecord) obj).setAddedCount(i);
    }

    /* renamed from: a */
    public static void m5643a(Object obj, Parcelable parcelable) {
        ((AccessibilityRecord) obj).setParcelableData(parcelable);
    }

    /* renamed from: a */
    public static void m5644a(Object obj, View view) {
        ((AccessibilityRecord) obj).setSource(view);
    }

    /* renamed from: a */
    public static void m5645a(Object obj, CharSequence charSequence) {
        ((AccessibilityRecord) obj).setBeforeText(charSequence);
    }

    /* renamed from: a */
    public static void m5646a(Object obj, boolean z) {
        ((AccessibilityRecord) obj).setChecked(z);
    }

    /* renamed from: b */
    public static int m5647b(Object obj) {
        return ((AccessibilityRecord) obj).getAddedCount();
    }

    /* renamed from: b */
    public static void m5648b(Object obj, int i) {
        ((AccessibilityRecord) obj).setCurrentItemIndex(i);
    }

    /* renamed from: b */
    public static void m5649b(Object obj, CharSequence charSequence) {
        ((AccessibilityRecord) obj).setClassName(charSequence);
    }

    /* renamed from: b */
    public static void m5650b(Object obj, boolean z) {
        ((AccessibilityRecord) obj).setEnabled(z);
    }

    /* renamed from: c */
    public static CharSequence m5651c(Object obj) {
        return ((AccessibilityRecord) obj).getBeforeText();
    }

    /* renamed from: c */
    public static void m5652c(Object obj, int i) {
        ((AccessibilityRecord) obj).setFromIndex(i);
    }

    /* renamed from: c */
    public static void m5653c(Object obj, CharSequence charSequence) {
        ((AccessibilityRecord) obj).setContentDescription(charSequence);
    }

    /* renamed from: c */
    public static void m5654c(Object obj, boolean z) {
        ((AccessibilityRecord) obj).setFullScreen(z);
    }

    /* renamed from: d */
    public static CharSequence m5655d(Object obj) {
        return ((AccessibilityRecord) obj).getClassName();
    }

    /* renamed from: d */
    public static void m5656d(Object obj, int i) {
        ((AccessibilityRecord) obj).setItemCount(i);
    }

    /* renamed from: d */
    public static void m5657d(Object obj, boolean z) {
        ((AccessibilityRecord) obj).setPassword(z);
    }

    /* renamed from: e */
    public static CharSequence m5658e(Object obj) {
        return ((AccessibilityRecord) obj).getContentDescription();
    }

    /* renamed from: e */
    public static void m5659e(Object obj, int i) {
        ((AccessibilityRecord) obj).setRemovedCount(i);
    }

    /* renamed from: e */
    public static void m5660e(Object obj, boolean z) {
        ((AccessibilityRecord) obj).setScrollable(z);
    }

    /* renamed from: f */
    public static int m5661f(Object obj) {
        return ((AccessibilityRecord) obj).getCurrentItemIndex();
    }

    /* renamed from: f */
    public static void m5662f(Object obj, int i) {
        ((AccessibilityRecord) obj).setScrollX(i);
    }

    /* renamed from: g */
    public static int m5663g(Object obj) {
        return ((AccessibilityRecord) obj).getFromIndex();
    }

    /* renamed from: g */
    public static void m5664g(Object obj, int i) {
        ((AccessibilityRecord) obj).setScrollY(i);
    }

    /* renamed from: h */
    public static int m5665h(Object obj) {
        return ((AccessibilityRecord) obj).getItemCount();
    }

    /* renamed from: h */
    public static void m5666h(Object obj, int i) {
        ((AccessibilityRecord) obj).setToIndex(i);
    }

    /* renamed from: i */
    public static Parcelable m5667i(Object obj) {
        return ((AccessibilityRecord) obj).getParcelableData();
    }

    /* renamed from: j */
    public static int m5668j(Object obj) {
        return ((AccessibilityRecord) obj).getRemovedCount();
    }

    /* renamed from: k */
    public static int m5669k(Object obj) {
        return ((AccessibilityRecord) obj).getScrollX();
    }

    /* renamed from: l */
    public static int m5670l(Object obj) {
        return ((AccessibilityRecord) obj).getScrollY();
    }

    /* renamed from: m */
    public static Object m5671m(Object obj) {
        return ((AccessibilityRecord) obj).getSource();
    }

    /* renamed from: n */
    public static List<CharSequence> m5672n(Object obj) {
        return ((AccessibilityRecord) obj).getText();
    }

    /* renamed from: o */
    public static int m5673o(Object obj) {
        return ((AccessibilityRecord) obj).getToIndex();
    }

    /* renamed from: p */
    public static int m5674p(Object obj) {
        return ((AccessibilityRecord) obj).getWindowId();
    }

    /* renamed from: q */
    public static boolean m5675q(Object obj) {
        return ((AccessibilityRecord) obj).isChecked();
    }

    /* renamed from: r */
    public static boolean m5676r(Object obj) {
        return ((AccessibilityRecord) obj).isEnabled();
    }

    /* renamed from: s */
    public static boolean m5677s(Object obj) {
        return ((AccessibilityRecord) obj).isFullScreen();
    }

    /* renamed from: t */
    public static boolean m5678t(Object obj) {
        return ((AccessibilityRecord) obj).isPassword();
    }

    /* renamed from: u */
    public static boolean m5679u(Object obj) {
        return ((AccessibilityRecord) obj).isScrollable();
    }

    /* renamed from: v */
    public static void m5680v(Object obj) {
        ((AccessibilityRecord) obj).recycle();
    }
}
