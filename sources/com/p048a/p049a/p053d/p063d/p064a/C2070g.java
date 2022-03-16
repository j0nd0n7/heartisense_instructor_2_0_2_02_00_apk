package com.p048a.p049a.p053d.p063d.p064a;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import com.p048a.p049a.p053d.C1894a;
import com.p048a.p049a.p053d.p055b.p056a.C1921c;
import com.p048a.p049a.p053d.p063d.p064a.C2080m;
import com.p048a.p049a.p078j.C2230a;
import com.p048a.p049a.p078j.C2232c;
import com.p048a.p049a.p078j.C2236g;
import com.p048a.p049a.p078j.C2238i;
import java.io.IOException;
import java.io.InputStream;
import java.util.EnumSet;
import java.util.Queue;
import java.util.Set;

/* renamed from: com.a.a.d.d.a.g */
public abstract class C2070g implements C2064a<InputStream> {

    /* renamed from: a */
    public static final C2070g f6923a = new C2070g() {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo7956a(int i, int i2, int i3, int i4) {
            return Math.min(i2 / i4, i / i3);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Bitmap mo7951a(Object obj, C1921c cVar, int i, int i2, C1894a aVar) {
            return C2070g.super.mo7951a((InputStream) obj, cVar, i, i2, aVar);
        }

        /* renamed from: a */
        public String mo7952a() {
            return "AT_LEAST.com.bumptech.glide.load.data.bitmap";
        }
    };

    /* renamed from: b */
    public static final C2070g f6924b = new C2070g() {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo7956a(int i, int i2, int i3, int i4) {
            int i5 = 1;
            int ceil = (int) Math.ceil((double) Math.max(((float) i2) / ((float) i4), ((float) i) / ((float) i3)));
            int max = Math.max(1, Integer.highestOneBit(ceil));
            if (max >= ceil) {
                i5 = 0;
            }
            return max << i5;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Bitmap mo7951a(Object obj, C1921c cVar, int i, int i2, C1894a aVar) {
            return C2070g.super.mo7951a((InputStream) obj, cVar, i, i2, aVar);
        }

        /* renamed from: a */
        public String mo7952a() {
            return "AT_MOST.com.bumptech.glide.load.data.bitmap";
        }
    };

    /* renamed from: c */
    public static final C2070g f6925c = new C2070g() {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo7956a(int i, int i2, int i3, int i4) {
            return 0;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Bitmap mo7951a(Object obj, C1921c cVar, int i, int i2, C1894a aVar) {
            return C2070g.super.mo7951a((InputStream) obj, cVar, i, i2, aVar);
        }

        /* renamed from: a */
        public String mo7952a() {
            return "NONE.com.bumptech.glide.load.data.bitmap";
        }
    };

    /* renamed from: d */
    private static final String f6926d = "Downsampler";

    /* renamed from: e */
    private static final Set<C2080m.C2081a> f6927e = EnumSet.of(C2080m.C2081a.JPEG, C2080m.C2081a.PNG_A, C2080m.C2081a.PNG);

    /* renamed from: f */
    private static final Queue<BitmapFactory.Options> f6928f = C2238i.m12728a(0);

    /* renamed from: g */
    private static final int f6929g = 5242880;

    /* renamed from: a */
    private int m11969a(int i, int i2, int i3, int i4, int i5) {
        if (i5 == Integer.MIN_VALUE) {
            i5 = i3;
        }
        if (i4 == Integer.MIN_VALUE) {
            i4 = i2;
        }
        int a = (i == 90 || i == 270) ? mo7956a(i3, i2, i4, i5) : mo7956a(i2, i3, i4, i5);
        return Math.max(1, a == 0 ? 0 : Integer.highestOneBit(a));
    }

    /* renamed from: a */
    private static Bitmap.Config m11970a(InputStream inputStream, C1894a aVar) {
        boolean z;
        if (aVar == C1894a.ALWAYS_ARGB_8888 || aVar == C1894a.PREFER_ARGB_8888 || Build.VERSION.SDK_INT == 16) {
            return Bitmap.Config.ARGB_8888;
        }
        inputStream.mark(1024);
        try {
            z = new C2080m(inputStream).mo7985a();
            try {
                inputStream.reset();
            } catch (IOException e) {
                if (Log.isLoggable(f6926d, 5)) {
                    Log.w(f6926d, "Cannot reset the input stream", e);
                }
            }
        } catch (IOException e2) {
            if (Log.isLoggable(f6926d, 5)) {
                Log.w(f6926d, "Cannot determine whether the image has alpha or not from header for format " + aVar, e2);
            }
            try {
                inputStream.reset();
                z = false;
            } catch (IOException e3) {
                if (Log.isLoggable(f6926d, 5)) {
                    Log.w(f6926d, "Cannot reset the input stream", e3);
                }
                z = false;
            }
        } catch (Throwable th) {
            try {
                inputStream.reset();
            } catch (IOException e4) {
                if (Log.isLoggable(f6926d, 5)) {
                    Log.w(f6926d, "Cannot reset the input stream", e4);
                }
            }
            throw th;
        }
        return z ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
    }

    /* renamed from: a */
    private Bitmap m11971a(C2236g gVar, C2086p pVar, BitmapFactory.Options options, C1921c cVar, int i, int i2, int i3, C1894a aVar) {
        Bitmap.Config a = m11970a((InputStream) gVar, aVar);
        options.inSampleSize = i3;
        options.inPreferredConfig = a;
        if ((options.inSampleSize == 1 || 19 <= Build.VERSION.SDK_INT) && m11974a((InputStream) gVar)) {
            m11973a(options, cVar.mo7768b((int) Math.ceil(((double) i) / ((double) i3)), (int) Math.ceil(((double) i2) / ((double) i3)), a));
        }
        return m11975b(gVar, pVar, options);
    }

    /* renamed from: a */
    private static void m11972a(BitmapFactory.Options options) {
        m11977b(options);
        synchronized (f6928f) {
            f6928f.offer(options);
        }
    }

    @TargetApi(11)
    /* renamed from: a */
    private static void m11973a(BitmapFactory.Options options, Bitmap bitmap) {
        if (11 <= Build.VERSION.SDK_INT) {
            options.inBitmap = bitmap;
        }
    }

    /* renamed from: a */
    private static boolean m11974a(InputStream inputStream) {
        if (19 <= Build.VERSION.SDK_INT) {
            return true;
        }
        inputStream.mark(1024);
        try {
            boolean contains = f6927e.contains(new C2080m(inputStream).mo7986b());
            try {
                inputStream.reset();
                return contains;
            } catch (IOException e) {
                if (!Log.isLoggable(f6926d, 5)) {
                    return contains;
                }
                Log.w(f6926d, "Cannot reset the input stream", e);
                return contains;
            }
        } catch (IOException e2) {
            if (Log.isLoggable(f6926d, 5)) {
                Log.w(f6926d, "Cannot determine the image type from header", e2);
            }
            try {
                inputStream.reset();
            } catch (IOException e3) {
                if (Log.isLoggable(f6926d, 5)) {
                    Log.w(f6926d, "Cannot reset the input stream", e3);
                }
            }
            return false;
        } catch (Throwable th) {
            try {
                inputStream.reset();
            } catch (IOException e4) {
                if (Log.isLoggable(f6926d, 5)) {
                    Log.w(f6926d, "Cannot reset the input stream", e4);
                }
            }
            throw th;
        }
    }

    /* renamed from: b */
    private static Bitmap m11975b(C2236g gVar, C2086p pVar, BitmapFactory.Options options) {
        if (options.inJustDecodeBounds) {
            gVar.mark(f6929g);
        } else {
            pVar.mo7999a();
        }
        Bitmap decodeStream = BitmapFactory.decodeStream(gVar, (Rect) null, options);
        try {
            if (options.inJustDecodeBounds) {
                gVar.reset();
            }
        } catch (IOException e) {
            if (Log.isLoggable(f6926d, 6)) {
                Log.e(f6926d, "Exception loading inDecodeBounds=" + options.inJustDecodeBounds + " sample=" + options.inSampleSize, e);
            }
        }
        return decodeStream;
    }

    @TargetApi(11)
    /* renamed from: b */
    private static synchronized BitmapFactory.Options m11976b() {
        BitmapFactory.Options poll;
        synchronized (C2070g.class) {
            synchronized (f6928f) {
                poll = f6928f.poll();
            }
            if (poll == null) {
                poll = new BitmapFactory.Options();
                m11977b(poll);
            }
        }
        return poll;
    }

    @TargetApi(11)
    /* renamed from: b */
    private static void m11977b(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        if (11 <= Build.VERSION.SDK_INT) {
            options.inBitmap = null;
            options.inMutable = true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo7956a(int i, int i2, int i3, int i4);

    /* renamed from: a */
    public Bitmap mo7951a(InputStream inputStream, C1921c cVar, int i, int i2, C1894a aVar) {
        int i3;
        int c;
        C2230a a = C2230a.m12691a();
        byte[] c2 = a.mo8313c();
        byte[] c3 = a.mo8313c();
        BitmapFactory.Options b = m11976b();
        C2086p pVar = new C2086p(inputStream, c3);
        C2232c a2 = C2232c.m12699a(pVar);
        C2236g gVar = new C2236g(a2);
        try {
            a2.mark(f6929g);
            try {
                c = new C2080m(a2).mo7987c();
                a2.reset();
                i3 = c;
            } catch (IOException e) {
                if (Log.isLoggable(f6926d, 5)) {
                    Log.w(f6926d, "Cannot determine the image orientation from header", e);
                }
                try {
                    a2.reset();
                    i3 = 0;
                } catch (IOException e2) {
                    if (Log.isLoggable(f6926d, 5)) {
                        Log.w(f6926d, "Cannot reset the input stream", e2);
                    }
                    i3 = 0;
                }
            } catch (Throwable th) {
                try {
                    a2.reset();
                } catch (IOException e3) {
                    if (Log.isLoggable(f6926d, 5)) {
                        Log.w(f6926d, "Cannot reset the input stream", e3);
                    }
                }
                throw th;
            }
        } catch (IOException e4) {
            if (Log.isLoggable(f6926d, 5)) {
                Log.w(f6926d, "Cannot reset the input stream", e4);
            }
            i3 = c;
        } catch (Throwable th2) {
            a.mo8311a(c2);
            a.mo8311a(c3);
            a2.mo8321c();
            m11972a(b);
            throw th2;
        }
        b.inTempStorage = c2;
        int[] a3 = mo7958a(gVar, pVar, b);
        int i4 = a3[0];
        int i5 = a3[1];
        Bitmap a4 = m11971a(gVar, pVar, b, cVar, i4, i5, m11969a(C2090s.m12042a(i3), i4, i5, i, i2), aVar);
        IOException b2 = a2.mo8319b();
        if (b2 != null) {
            throw new RuntimeException(b2);
        }
        Bitmap bitmap = null;
        if (a4 != null) {
            bitmap = C2090s.m12047a(a4, cVar, i3);
            if (!a4.equals(bitmap) && !cVar.mo7767a(a4)) {
                a4.recycle();
            }
        }
        a.mo8311a(c2);
        a.mo8311a(c3);
        a2.mo8321c();
        m11972a(b);
        return bitmap;
    }

    /* renamed from: a */
    public int[] mo7958a(C2236g gVar, C2086p pVar, BitmapFactory.Options options) {
        options.inJustDecodeBounds = true;
        m11975b(gVar, pVar, options);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }
}
