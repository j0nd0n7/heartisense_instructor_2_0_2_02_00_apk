package android.support.p010v4.p014d.p016b;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.annotation.C0011ag;
import android.support.annotation.C0017al;
import android.support.annotation.C0024c;
import android.util.TypedValue;

@C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
/* renamed from: android.support.v4.d.b.i */
public class C0432i {
    /* renamed from: a */
    public static int m2360a(Context context, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId != 0 ? i : i2;
    }

    /* renamed from: a */
    public static int m2361a(TypedArray typedArray, @C0017al int i, @C0017al int i2, int i3) {
        return typedArray.getInt(i, typedArray.getInt(i2, i3));
    }

    /* renamed from: a */
    public static Drawable m2362a(TypedArray typedArray, @C0017al int i, @C0017al int i2) {
        Drawable drawable = typedArray.getDrawable(i);
        return drawable == null ? typedArray.getDrawable(i2) : drawable;
    }

    /* renamed from: a */
    public static boolean m2363a(TypedArray typedArray, @C0017al int i, @C0017al int i2, boolean z) {
        return typedArray.getBoolean(i, typedArray.getBoolean(i2, z));
    }

    @C0024c
    /* renamed from: b */
    public static int m2364b(TypedArray typedArray, @C0017al int i, @C0017al int i2, @C0024c int i3) {
        return typedArray.getResourceId(i, typedArray.getResourceId(i2, i3));
    }

    /* renamed from: b */
    public static String m2365b(TypedArray typedArray, @C0017al int i, @C0017al int i2) {
        String string = typedArray.getString(i);
        return string == null ? typedArray.getString(i2) : string;
    }

    /* renamed from: c */
    public static CharSequence m2366c(TypedArray typedArray, @C0017al int i, @C0017al int i2) {
        CharSequence text = typedArray.getText(i);
        return text == null ? typedArray.getText(i2) : text;
    }

    /* renamed from: d */
    public static CharSequence[] m2367d(TypedArray typedArray, @C0017al int i, @C0017al int i2) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        return textArray == null ? typedArray.getTextArray(i2) : textArray;
    }
}
