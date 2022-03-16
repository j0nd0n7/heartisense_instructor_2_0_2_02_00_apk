package android.support.p006e.p007a;

import android.content.res.TypedArray;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: android.support.e.a.g */
class C0130g {

    /* renamed from: a */
    private static final String f914a = "http://schemas.android.com/apk/res/android";

    C0130g() {
    }

    /* renamed from: a */
    public static float m668a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        return !m671a(xmlPullParser, str) ? f : typedArray.getFloat(i, f);
    }

    /* renamed from: a */
    public static int m669a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !m671a(xmlPullParser, str) ? i2 : typedArray.getInt(i, i2);
    }

    /* renamed from: a */
    public static boolean m670a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, boolean z) {
        return !m671a(xmlPullParser, str) ? z : typedArray.getBoolean(i, z);
    }

    /* renamed from: a */
    public static boolean m671a(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue(f914a, str) != null;
    }

    /* renamed from: b */
    public static int m672b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !m671a(xmlPullParser, str) ? i2 : typedArray.getColor(i, i2);
    }
}
