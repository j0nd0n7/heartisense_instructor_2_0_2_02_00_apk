package com.p048a.p049a.p053d.p055b.p057b;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

/* renamed from: com.a.a.d.b.b.k */
public class C1965k {

    /* renamed from: a */
    static final int f6717a = 4;

    /* renamed from: b */
    static final int f6718b = 2;

    /* renamed from: c */
    static final int f6719c = 4;

    /* renamed from: d */
    static final float f6720d = 0.4f;

    /* renamed from: e */
    static final float f6721e = 0.33f;

    /* renamed from: f */
    private static final String f6722f = "MemorySizeCalculator";

    /* renamed from: g */
    private final int f6723g;

    /* renamed from: h */
    private final int f6724h;

    /* renamed from: i */
    private final Context f6725i;

    /* renamed from: com.a.a.d.b.b.k$a */
    private static class C1966a implements C1967b {

        /* renamed from: a */
        private final DisplayMetrics f6726a;

        public C1966a(DisplayMetrics displayMetrics) {
            this.f6726a = displayMetrics;
        }

        /* renamed from: a */
        public int mo7826a() {
            return this.f6726a.widthPixels;
        }

        /* renamed from: b */
        public int mo7827b() {
            return this.f6726a.heightPixels;
        }
    }

    /* renamed from: com.a.a.d.b.b.k$b */
    interface C1967b {
        /* renamed from: a */
        int mo7826a();

        /* renamed from: b */
        int mo7827b();
    }

    public C1965k(Context context) {
        this(context, (ActivityManager) context.getSystemService("activity"), new C1966a(context.getResources().getDisplayMetrics()));
    }

    C1965k(Context context, ActivityManager activityManager, C1967b bVar) {
        this.f6725i = context;
        int a = m11745a(activityManager);
        int a2 = bVar.mo7826a() * bVar.mo7827b() * 4;
        int i = a2 * 4;
        int i2 = a2 * 2;
        if (i2 + i <= a) {
            this.f6724h = i2;
            this.f6723g = i;
        } else {
            int round = Math.round(((float) a) / 6.0f);
            this.f6724h = round * 2;
            this.f6723g = round * 4;
        }
        if (Log.isLoggable(f6722f, 3)) {
            Log.d(f6722f, "Calculated memory cache size: " + m11746a(this.f6724h) + " pool size: " + m11746a(this.f6723g) + " memory class limited? " + (i2 + i > a) + " max size: " + m11746a(a) + " memoryClass: " + activityManager.getMemoryClass() + " isLowMemoryDevice: " + m11747b(activityManager));
        }
    }

    /* renamed from: a */
    private static int m11745a(ActivityManager activityManager) {
        boolean b = m11747b(activityManager);
        return Math.round((b ? f6721e : f6720d) * ((float) (activityManager.getMemoryClass() * 1024 * 1024)));
    }

    /* renamed from: a */
    private String m11746a(int i) {
        return Formatter.formatFileSize(this.f6725i, (long) i);
    }

    @TargetApi(19)
    /* renamed from: b */
    private static boolean m11747b(ActivityManager activityManager) {
        return Build.VERSION.SDK_INT >= 19 ? activityManager.isLowRamDevice() : Build.VERSION.SDK_INT < 11;
    }

    /* renamed from: a */
    public int mo7824a() {
        return this.f6724h;
    }

    /* renamed from: b */
    public int mo7825b() {
        return this.f6723g;
    }
}
