package com.p048a.p049a.p053d.p055b.p056a;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.a.a.d.b.a.f */
public class C1925f implements C1921c {

    /* renamed from: a */
    private static final String f6641a = "LruBitmapPool";

    /* renamed from: b */
    private static final Bitmap.Config f6642b = Bitmap.Config.ARGB_8888;

    /* renamed from: c */
    private final C1930g f6643c;

    /* renamed from: d */
    private final Set<Bitmap.Config> f6644d;

    /* renamed from: e */
    private final int f6645e;

    /* renamed from: f */
    private final C1927a f6646f;

    /* renamed from: g */
    private int f6647g;

    /* renamed from: h */
    private int f6648h;

    /* renamed from: i */
    private int f6649i;

    /* renamed from: j */
    private int f6650j;

    /* renamed from: k */
    private int f6651k;

    /* renamed from: l */
    private int f6652l;

    /* renamed from: com.a.a.d.b.a.f$a */
    private interface C1927a {
        /* renamed from: a */
        void mo7777a(Bitmap bitmap);

        /* renamed from: b */
        void mo7778b(Bitmap bitmap);
    }

    /* renamed from: com.a.a.d.b.a.f$b */
    private static class C1928b implements C1927a {
        private C1928b() {
        }

        /* renamed from: a */
        public void mo7777a(Bitmap bitmap) {
        }

        /* renamed from: b */
        public void mo7778b(Bitmap bitmap) {
        }
    }

    /* renamed from: com.a.a.d.b.a.f$c */
    private static class C1929c implements C1927a {

        /* renamed from: a */
        private final Set<Bitmap> f6653a = Collections.synchronizedSet(new HashSet());

        private C1929c() {
        }

        /* renamed from: a */
        public void mo7777a(Bitmap bitmap) {
            if (this.f6653a.contains(bitmap)) {
                throw new IllegalStateException("Can't add already added bitmap: " + bitmap + " [" + bitmap.getWidth() + "x" + bitmap.getHeight() + "]");
            }
            this.f6653a.add(bitmap);
        }

        /* renamed from: b */
        public void mo7778b(Bitmap bitmap) {
            if (!this.f6653a.contains(bitmap)) {
                throw new IllegalStateException("Cannot remove bitmap not in tracker");
            }
            this.f6653a.remove(bitmap);
        }
    }

    public C1925f(int i) {
        this(i, m11620f(), m11621g());
    }

    C1925f(int i, C1930g gVar, Set<Bitmap.Config> set) {
        this.f6645e = i;
        this.f6647g = i;
        this.f6643c = gVar;
        this.f6644d = set;
        this.f6646f = new C1928b();
    }

    public C1925f(int i, Set<Bitmap.Config> set) {
        this(i, m11620f(), set);
    }

    /* renamed from: b */
    private synchronized void m11616b(int i) {
        while (true) {
            if (this.f6648h <= i) {
                break;
            }
            Bitmap a = this.f6643c.mo7746a();
            if (a == null) {
                if (Log.isLoggable(f6641a, 5)) {
                    Log.w(f6641a, "Size mismatch, resetting");
                    m11619e();
                }
                this.f6648h = 0;
            } else {
                this.f6646f.mo7778b(a);
                this.f6648h -= this.f6643c.mo7751c(a);
                a.recycle();
                this.f6652l++;
                if (Log.isLoggable(f6641a, 3)) {
                    Log.d(f6641a, "Evicting bitmap=" + this.f6643c.mo7750b(a));
                }
                m11618d();
            }
        }
    }

    /* renamed from: c */
    private void m11617c() {
        m11616b(this.f6647g);
    }

    /* renamed from: d */
    private void m11618d() {
        if (Log.isLoggable(f6641a, 2)) {
            m11619e();
        }
    }

    /* renamed from: e */
    private void m11619e() {
        Log.v(f6641a, "Hits=" + this.f6649i + ", misses=" + this.f6650j + ", puts=" + this.f6651k + ", evictions=" + this.f6652l + ", currentSize=" + this.f6648h + ", maxSize=" + this.f6647g + "\nStrategy=" + this.f6643c);
    }

    /* renamed from: f */
    private static C1930g m11620f() {
        return Build.VERSION.SDK_INT >= 19 ? new C1933j() : new C1917a();
    }

    /* renamed from: g */
    private static Set<Bitmap.Config> m11621g() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(Arrays.asList(Bitmap.Config.values()));
        if (Build.VERSION.SDK_INT >= 19) {
            hashSet.add((Object) null);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: a */
    public int mo7763a() {
        return this.f6647g;
    }

    /* renamed from: a */
    public synchronized Bitmap mo7764a(int i, int i2, Bitmap.Config config) {
        Bitmap b;
        b = mo7768b(i, i2, config);
        if (b != null) {
            b.eraseColor(0);
        }
        return b;
    }

    /* renamed from: a */
    public synchronized void mo7765a(float f) {
        this.f6647g = Math.round(((float) this.f6645e) * f);
        m11617c();
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: a */
    public void mo7766a(int i) {
        if (Log.isLoggable(f6641a, 3)) {
            Log.d(f6641a, "trimMemory, level=" + i);
        }
        if (i >= 60) {
            mo7769b();
        } else if (i >= 40) {
            m11616b(this.f6647g / 2);
        }
    }

    /* renamed from: a */
    public synchronized boolean mo7767a(Bitmap bitmap) {
        boolean z;
        if (bitmap == null) {
            throw new NullPointerException("Bitmap must not be null");
        } else if (!bitmap.isMutable() || this.f6643c.mo7751c(bitmap) > this.f6647g || !this.f6644d.contains(bitmap.getConfig())) {
            if (Log.isLoggable(f6641a, 2)) {
                Log.v(f6641a, "Reject bitmap from pool, bitmap: " + this.f6643c.mo7750b(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.f6644d.contains(bitmap.getConfig()));
            }
            z = false;
        } else {
            int c = this.f6643c.mo7751c(bitmap);
            this.f6643c.mo7748a(bitmap);
            this.f6646f.mo7777a(bitmap);
            this.f6651k++;
            this.f6648h = c + this.f6648h;
            if (Log.isLoggable(f6641a, 2)) {
                Log.v(f6641a, "Put bitmap in pool=" + this.f6643c.mo7750b(bitmap));
            }
            m11618d();
            m11617c();
            z = true;
        }
        return z;
    }

    @TargetApi(12)
    /* renamed from: b */
    public synchronized Bitmap mo7768b(int i, int i2, Bitmap.Config config) {
        Bitmap a;
        a = this.f6643c.mo7747a(i, i2, config != null ? config : f6642b);
        if (a == null) {
            if (Log.isLoggable(f6641a, 3)) {
                Log.d(f6641a, "Missing bitmap=" + this.f6643c.mo7749b(i, i2, config));
            }
            this.f6650j++;
        } else {
            this.f6649i++;
            this.f6648h -= this.f6643c.mo7751c(a);
            this.f6646f.mo7778b(a);
            if (Build.VERSION.SDK_INT >= 12) {
                a.setHasAlpha(true);
            }
        }
        if (Log.isLoggable(f6641a, 2)) {
            Log.v(f6641a, "Get bitmap=" + this.f6643c.mo7749b(i, i2, config));
        }
        m11618d();
        return a;
    }

    /* renamed from: b */
    public void mo7769b() {
        if (Log.isLoggable(f6641a, 3)) {
            Log.d(f6641a, "clearMemory");
        }
        m11616b(0);
    }
}
