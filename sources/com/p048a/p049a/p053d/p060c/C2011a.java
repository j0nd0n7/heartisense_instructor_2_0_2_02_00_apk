package com.p048a.p049a.p053d.p060c;

import android.net.Uri;

/* renamed from: com.a.a.d.c.a */
final class C2011a {

    /* renamed from: a */
    private static final String f6852a = "android_asset";

    /* renamed from: b */
    private static final String f6853b = "file:///android_asset/";

    /* renamed from: c */
    private static final int f6854c = f6853b.length();

    private C2011a() {
    }

    /* renamed from: a */
    public static boolean m11843a(Uri uri) {
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && f6852a.equals(uri.getPathSegments().get(0));
    }

    /* renamed from: b */
    public static String m11844b(Uri uri) {
        return uri.toString().substring(f6854c);
    }
}
