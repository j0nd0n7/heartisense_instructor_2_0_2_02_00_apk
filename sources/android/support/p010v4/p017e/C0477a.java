package android.support.p010v4.p017e;

import android.text.TextUtils;

/* renamed from: android.support.v4.e.a */
public final class C0477a {
    private C0477a() {
    }

    /* renamed from: a */
    public static String m2521a(String str, String str2) {
        return TextUtils.isEmpty(str) ? str2 : TextUtils.isEmpty(str2) ? str : "(" + str + ") AND (" + str2 + ")";
    }

    /* renamed from: a */
    public static String[] m2522a(String[] strArr, String[] strArr2) {
        if (strArr == null || strArr.length == 0) {
            return strArr2;
        }
        String[] strArr3 = new String[(strArr.length + strArr2.length)];
        System.arraycopy(strArr, 0, strArr3, 0, strArr.length);
        System.arraycopy(strArr2, 0, strArr3, strArr.length, strArr2.length);
        return strArr3;
    }
}
