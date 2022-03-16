package android.support.p010v4.p018f;

import android.graphics.Paint;
import android.graphics.Rect;
import android.support.annotation.C0007ae;
import android.support.annotation.C0047z;
import android.support.p010v4.p033o.C0894l;

@C0007ae(mo1a = 9)
/* renamed from: android.support.v4.f.h */
class C0519h {

    /* renamed from: a */
    private static final String f2093a = "󟿽";

    /* renamed from: b */
    private static final ThreadLocal<C0894l<Rect, Rect>> f2094b = new ThreadLocal<>();

    C0519h() {
    }

    /* renamed from: a */
    private static C0894l<Rect, Rect> m2713a() {
        C0894l<Rect, Rect> lVar = f2094b.get();
        if (lVar == null) {
            C0894l<Rect, Rect> lVar2 = new C0894l<>(new Rect(), new Rect());
            f2094b.set(lVar2);
            return lVar2;
        }
        ((Rect) lVar.f3081a).setEmpty();
        ((Rect) lVar.f3082b).setEmpty();
        return lVar;
    }

    /* renamed from: a */
    static boolean m2714a(@C0047z Paint paint, @C0047z String str) {
        int length = str.length();
        if (length == 1 && Character.isWhitespace(str.charAt(0))) {
            return true;
        }
        float measureText = paint.measureText(f2093a);
        float measureText2 = paint.measureText(str);
        if (measureText2 == 0.0f) {
            return false;
        }
        if (str.codePointCount(0, str.length()) > 1) {
            if (measureText2 > 2.0f * measureText) {
                return false;
            }
            float f = 0.0f;
            int i = 0;
            while (i < length) {
                int charCount = Character.charCount(str.codePointAt(i));
                f += paint.measureText(str, i, i + charCount);
                i += charCount;
            }
            if (measureText2 >= f) {
                return false;
            }
        }
        if (measureText2 != measureText) {
            return true;
        }
        C0894l<Rect, Rect> a = m2713a();
        paint.getTextBounds(f2093a, 0, f2093a.length(), (Rect) a.f3081a);
        paint.getTextBounds(str, 0, length, (Rect) a.f3082b);
        return !((Rect) a.f3081a).equals(a.f3082b);
    }
}
