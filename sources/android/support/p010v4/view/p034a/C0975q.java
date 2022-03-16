package android.support.p010v4.view.p034a;

import android.annotation.TargetApi;
import android.os.Bundle;
import android.support.annotation.C0007ae;
import android.view.accessibility.AccessibilityNodeInfo;

@C0007ae(mo1a = 19)
@TargetApi(19)
/* renamed from: android.support.v4.view.a.q */
class C0975q {

    /* renamed from: a */
    private static final byte f3350a = -1;

    /* renamed from: b */
    private static final String f3351b = "android.view.accessibility.AccessibilityNodeInfo.traits";

    /* renamed from: c */
    private static final long f3352c = 1;

    /* renamed from: d */
    private static final String f3353d = "AccessibilityNodeInfo.roleDescription";

    /* renamed from: android.support.v4.view.a.q$a */
    static class C0976a {
        C0976a() {
        }

        /* renamed from: a */
        static int m5418a(Object obj) {
            return ((AccessibilityNodeInfo.CollectionInfo) obj).getColumnCount();
        }

        /* renamed from: b */
        static int m5419b(Object obj) {
            return ((AccessibilityNodeInfo.CollectionInfo) obj).getRowCount();
        }

        /* renamed from: c */
        static boolean m5420c(Object obj) {
            return ((AccessibilityNodeInfo.CollectionInfo) obj).isHierarchical();
        }
    }

    /* renamed from: android.support.v4.view.a.q$b */
    static class C0977b {
        C0977b() {
        }

        /* renamed from: a */
        static int m5421a(Object obj) {
            return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnIndex();
        }

        /* renamed from: b */
        static int m5422b(Object obj) {
            return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnSpan();
        }

        /* renamed from: c */
        static int m5423c(Object obj) {
            return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowIndex();
        }

        /* renamed from: d */
        static int m5424d(Object obj) {
            return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowSpan();
        }

        /* renamed from: e */
        static boolean m5425e(Object obj) {
            return ((AccessibilityNodeInfo.CollectionItemInfo) obj).isHeading();
        }
    }

    /* renamed from: android.support.v4.view.a.q$c */
    static class C0978c {
        C0978c() {
        }

        /* renamed from: a */
        static float m5426a(Object obj) {
            return ((AccessibilityNodeInfo.RangeInfo) obj).getCurrent();
        }

        /* renamed from: b */
        static float m5427b(Object obj) {
            return ((AccessibilityNodeInfo.RangeInfo) obj).getMax();
        }

        /* renamed from: c */
        static float m5428c(Object obj) {
            return ((AccessibilityNodeInfo.RangeInfo) obj).getMin();
        }

        /* renamed from: d */
        static int m5429d(Object obj) {
            return ((AccessibilityNodeInfo.RangeInfo) obj).getType();
        }
    }

    C0975q() {
    }

    /* renamed from: a */
    static int m5391a(Object obj) {
        return ((AccessibilityNodeInfo) obj).getLiveRegion();
    }

    /* renamed from: a */
    public static Object m5392a(int i, float f, float f2, float f3) {
        return AccessibilityNodeInfo.RangeInfo.obtain(i, f, f2, f3);
    }

    /* renamed from: a */
    public static Object m5393a(int i, int i2, int i3, int i4, boolean z) {
        return AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z);
    }

    /* renamed from: a */
    public static Object m5394a(int i, int i2, boolean z) {
        return AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z);
    }

    /* renamed from: a */
    public static Object m5395a(int i, int i2, boolean z, int i3) {
        return AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z);
    }

    /* renamed from: a */
    static void m5396a(Object obj, int i) {
        ((AccessibilityNodeInfo) obj).setLiveRegion(i);
    }

    /* renamed from: a */
    private static void m5397a(Object obj, long j) {
        Bundle g = m5412g(obj);
        g.putLong(f3351b, g.getLong(f3351b, 0) | j);
    }

    /* renamed from: a */
    public static void m5398a(Object obj, CharSequence charSequence) {
        m5412g(obj).putCharSequence(f3353d, charSequence);
    }

    /* renamed from: a */
    public static void m5399a(Object obj, Object obj2) {
        ((AccessibilityNodeInfo) obj).setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) obj2);
    }

    /* renamed from: a */
    public static void m5400a(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setContentInvalid(z);
    }

    /* renamed from: b */
    static Object m5401b(Object obj) {
        return ((AccessibilityNodeInfo) obj).getCollectionInfo();
    }

    /* renamed from: b */
    public static void m5402b(Object obj, int i) {
        ((AccessibilityNodeInfo) obj).setInputType(i);
    }

    /* renamed from: b */
    public static void m5403b(Object obj, Object obj2) {
        ((AccessibilityNodeInfo) obj).setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) obj2);
    }

    /* renamed from: b */
    public static void m5404b(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setCanOpenPopup(z);
    }

    /* renamed from: c */
    static Object m5405c(Object obj) {
        return ((AccessibilityNodeInfo) obj).getCollectionItemInfo();
    }

    /* renamed from: c */
    public static void m5406c(Object obj, Object obj2) {
        ((AccessibilityNodeInfo) obj).setRangeInfo((AccessibilityNodeInfo.RangeInfo) obj2);
    }

    /* renamed from: c */
    public static void m5407c(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setDismissable(z);
    }

    /* renamed from: d */
    static Object m5408d(Object obj) {
        return ((AccessibilityNodeInfo) obj).getRangeInfo();
    }

    /* renamed from: d */
    public static void m5409d(Object obj, boolean z) {
        ((AccessibilityNodeInfo) obj).setMultiLine(z);
    }

    /* renamed from: e */
    public static boolean m5410e(Object obj) {
        return ((AccessibilityNodeInfo) obj).isContentInvalid();
    }

    /* renamed from: f */
    public static boolean m5411f(Object obj) {
        return ((AccessibilityNodeInfo) obj).canOpenPopup();
    }

    /* renamed from: g */
    public static Bundle m5412g(Object obj) {
        return ((AccessibilityNodeInfo) obj).getExtras();
    }

    /* renamed from: h */
    public static int m5413h(Object obj) {
        return ((AccessibilityNodeInfo) obj).getInputType();
    }

    /* renamed from: i */
    public static boolean m5414i(Object obj) {
        return ((AccessibilityNodeInfo) obj).isDismissable();
    }

    /* renamed from: j */
    public static boolean m5415j(Object obj) {
        return ((AccessibilityNodeInfo) obj).isMultiLine();
    }

    /* renamed from: k */
    public static CharSequence m5416k(Object obj) {
        return m5412g(obj).getCharSequence(f3353d);
    }

    /* renamed from: l */
    private static long m5417l(Object obj) {
        return m5412g(obj).getLong(f3351b, -1);
    }
}
