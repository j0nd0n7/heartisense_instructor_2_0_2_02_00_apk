package android.support.p036v7.p038b.p039a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.support.annotation.C0003aa;
import android.support.annotation.C0047z;
import android.support.p010v4.p018f.C0516e;
import android.support.p036v7.p037a.C1359b;
import android.util.AttributeSet;
import android.util.StateSet;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: android.support.v7.b.a.a */
final class C1476a {

    /* renamed from: a */
    private static final int f4586a = -65536;

    private C1476a() {
    }

    /* renamed from: a */
    private static int m8684a(int i, float f) {
        return C0516e.m2709c(i, Math.round(((float) Color.alpha(i)) * f));
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0010  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0018  */
    @android.support.annotation.C0047z
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList m8685a(@android.support.annotation.C0047z android.content.res.Resources r4, @android.support.annotation.C0047z org.xmlpull.v1.XmlPullParser r5, @android.support.annotation.C0003aa android.content.res.Resources.Theme r6) {
        /*
            r3 = 2
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r5)
        L_0x0005:
            int r1 = r5.next()
            if (r1 == r3) goto L_0x000e
            r2 = 1
            if (r1 != r2) goto L_0x0005
        L_0x000e:
            if (r1 == r3) goto L_0x0018
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r1 = "No start tag found"
            r0.<init>(r1)
            throw r0
        L_0x0018:
            android.content.res.ColorStateList r0 = m8686a((android.content.res.Resources) r4, (org.xmlpull.v1.XmlPullParser) r5, (android.util.AttributeSet) r0, (android.content.res.Resources.Theme) r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p036v7.p038b.p039a.C1476a.m8685a(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.content.res.Resources$Theme):android.content.res.ColorStateList");
    }

    @C0047z
    /* renamed from: a */
    private static ColorStateList m8686a(@C0047z Resources resources, @C0047z XmlPullParser xmlPullParser, @C0047z AttributeSet attributeSet, @C0003aa Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            return m8688b(resources, xmlPullParser, attributeSet, theme);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
    }

    /* renamed from: a */
    private static TypedArray m8687a(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* renamed from: b */
    private static ColorStateList m8688b(@C0047z Resources resources, @C0047z XmlPullParser xmlPullParser, @C0047z AttributeSet attributeSet, @C0003aa Resources.Theme theme) {
        int depth;
        int i;
        int depth2 = xmlPullParser.getDepth() + 1;
        int[][] iArr = new int[20][];
        int[][] iArr2 = iArr;
        int i2 = 0;
        int[] iArr3 = new int[iArr.length];
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                int[] iArr4 = new int[i2];
                int[][] iArr5 = new int[i2][];
                System.arraycopy(iArr3, 0, iArr4, 0, i2);
                System.arraycopy(iArr2, 0, iArr5, 0, i2);
            } else if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                TypedArray a = m8687a(resources, theme, attributeSet, C1359b.C1371l.ColorStateListItem);
                int color = a.getColor(C1359b.C1371l.ColorStateListItem_android_color, -65281);
                float f = 1.0f;
                if (a.hasValue(C1359b.C1371l.ColorStateListItem_android_alpha)) {
                    f = a.getFloat(C1359b.C1371l.ColorStateListItem_android_alpha, 1.0f);
                } else if (a.hasValue(C1359b.C1371l.ColorStateListItem_alpha)) {
                    f = a.getFloat(C1359b.C1371l.ColorStateListItem_alpha, 1.0f);
                }
                a.recycle();
                int i3 = 0;
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr6 = new int[attributeCount];
                int i4 = 0;
                while (i4 < attributeCount) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i4);
                    if (attributeNameResource == 16843173 || attributeNameResource == 16843551 || attributeNameResource == C1359b.C1361b.alpha) {
                        i = i3;
                    } else {
                        int i5 = i3 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i4, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr6[i3] = attributeNameResource;
                        i = i5;
                    }
                    i4++;
                    i3 = i;
                }
                int[] trimStateSet = StateSet.trimStateSet(iArr6, i3);
                int a2 = m8684a(color, f);
                if (i2 == 0 || trimStateSet.length == 0) {
                }
                int[] a3 = C1479c.m8697a(iArr3, i2, a2);
                i2++;
                iArr2 = (int[][]) C1479c.m8702a((T[]) iArr2, i2, trimStateSet);
                iArr3 = a3;
            }
        }
        int[] iArr42 = new int[i2];
        int[][] iArr52 = new int[i2][];
        System.arraycopy(iArr3, 0, iArr42, 0, i2);
        System.arraycopy(iArr2, 0, iArr52, 0, i2);
        return new ColorStateList(iArr52, iArr42);
    }
}
