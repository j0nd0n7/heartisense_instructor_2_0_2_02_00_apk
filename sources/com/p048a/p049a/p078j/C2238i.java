package com.p048a.p049a.p078j;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Looper;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;

/* renamed from: com.a.a.j.i */
public final class C2238i {

    /* renamed from: a */
    private static final char[] f7334a = "0123456789abcdef".toCharArray();

    /* renamed from: b */
    private static final char[] f7335b = new char[64];

    /* renamed from: c */
    private static final char[] f7336c = new char[40];

    /* renamed from: com.a.a.j.i$1 */
    static /* synthetic */ class C22391 {

        /* renamed from: a */
        static final /* synthetic */ int[] f7337a = new int[Bitmap.Config.values().length];

        static {
            try {
                f7337a[Bitmap.Config.ALPHA_8.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f7337a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f7337a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                f7337a[Bitmap.Config.ARGB_8888.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
        }
    }

    private C2238i() {
    }

    /* renamed from: a */
    public static int m12722a(int i, int i2, Bitmap.Config config) {
        return i * i2 * m12723a(config);
    }

    /* renamed from: a */
    private static int m12723a(Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        switch (C22391.f7337a[config.ordinal()]) {
            case 1:
                return 1;
            case 2:
            case 3:
                return 2;
            default:
                return 4;
        }
    }

    @Deprecated
    /* renamed from: a */
    public static int m12724a(Bitmap bitmap) {
        return m12731b(bitmap);
    }

    /* renamed from: a */
    public static String m12725a(byte[] bArr) {
        String a;
        synchronized (f7335b) {
            a = m12726a(bArr, f7335b);
        }
        return a;
    }

    /* renamed from: a */
    private static String m12726a(byte[] bArr, char[] cArr) {
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i] & 255;
            cArr[i * 2] = f7334a[b >>> 4];
            cArr[(i * 2) + 1] = f7334a[b & 15];
        }
        return new String(cArr);
    }

    /* renamed from: a */
    public static <T> List<T> m12727a(Collection<T> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (T add : collection) {
            arrayList.add(add);
        }
        return arrayList;
    }

    /* renamed from: a */
    public static <T> Queue<T> m12728a(int i) {
        return new ArrayDeque(i);
    }

    /* renamed from: a */
    public static void m12729a() {
        if (!m12735c()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    /* renamed from: a */
    public static boolean m12730a(int i, int i2) {
        return m12734b(i) && m12734b(i2);
    }

    @TargetApi(19)
    /* renamed from: b */
    public static int m12731b(Bitmap bitmap) {
        if (Build.VERSION.SDK_INT >= 19) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException e) {
            }
        }
        return bitmap.getHeight() * bitmap.getRowBytes();
    }

    /* renamed from: b */
    public static String m12732b(byte[] bArr) {
        String a;
        synchronized (f7336c) {
            a = m12726a(bArr, f7336c);
        }
        return a;
    }

    /* renamed from: b */
    public static void m12733b() {
        if (!m12736d()) {
            throw new IllegalArgumentException("YOu must call this method on a background thread");
        }
    }

    /* renamed from: b */
    private static boolean m12734b(int i) {
        return i > 0 || i == Integer.MIN_VALUE;
    }

    /* renamed from: c */
    public static boolean m12735c() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* renamed from: d */
    public static boolean m12736d() {
        return !m12735c();
    }
}
