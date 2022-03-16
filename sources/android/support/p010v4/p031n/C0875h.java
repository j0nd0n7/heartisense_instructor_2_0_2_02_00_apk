package android.support.p010v4.p031n;

import android.annotation.TargetApi;
import android.support.annotation.C0003aa;
import android.support.annotation.C0007ae;
import android.support.annotation.C0047z;
import android.text.TextUtils;
import java.util.Locale;

@C0007ae(mo1a = 17)
@TargetApi(17)
/* renamed from: android.support.v4.n.h */
class C0875h {
    C0875h() {
    }

    /* renamed from: a */
    public static int m4352a(@C0003aa Locale locale) {
        return TextUtils.getLayoutDirectionFromLocale(locale);
    }

    @C0047z
    /* renamed from: a */
    public static String m4353a(@C0047z String str) {
        return TextUtils.htmlEncode(str);
    }
}
