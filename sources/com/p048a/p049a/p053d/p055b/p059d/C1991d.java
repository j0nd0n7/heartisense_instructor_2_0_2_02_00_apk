package com.p048a.p049a.p053d.p055b.p059d;

import android.graphics.Bitmap;

/* renamed from: com.a.a.d.b.d.d */
public final class C1991d {

    /* renamed from: a */
    static final Bitmap.Config f6788a = Bitmap.Config.RGB_565;

    /* renamed from: b */
    private final int f6789b;

    /* renamed from: c */
    private final int f6790c;

    /* renamed from: d */
    private final Bitmap.Config f6791d;

    /* renamed from: e */
    private final int f6792e;

    /* renamed from: com.a.a.d.b.d.d$a */
    public static class C1992a {

        /* renamed from: a */
        private final int f6793a;

        /* renamed from: b */
        private final int f6794b;

        /* renamed from: c */
        private Bitmap.Config f6795c;

        /* renamed from: d */
        private int f6796d;

        public C1992a(int i) {
            this(i, i);
        }

        public C1992a(int i, int i2) {
            this.f6796d = 1;
            if (i <= 0) {
                throw new IllegalArgumentException("Width must be > 0");
            } else if (i2 <= 0) {
                throw new IllegalArgumentException("Height must be > 0");
            } else {
                this.f6793a = i;
                this.f6794b = i2;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public Bitmap.Config mo7866a() {
            return this.f6795c;
        }

        /* renamed from: a */
        public C1992a mo7867a(int i) {
            if (i <= 0) {
                throw new IllegalArgumentException("Weight must be > 0");
            }
            this.f6796d = i;
            return this;
        }

        /* renamed from: a */
        public C1992a mo7868a(Bitmap.Config config) {
            this.f6795c = config;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C1991d mo7869b() {
            return new C1991d(this.f6793a, this.f6794b, this.f6795c, this.f6796d);
        }
    }

    C1991d(int i, int i2, Bitmap.Config config, int i3) {
        if (config == null) {
            throw new NullPointerException("Config must not be null");
        }
        this.f6789b = i;
        this.f6790c = i2;
        this.f6791d = config;
        this.f6792e = i3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo7859a() {
        return this.f6789b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo7860b() {
        return this.f6790c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Bitmap.Config mo7861c() {
        return this.f6791d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo7862d() {
        return this.f6792e;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1991d)) {
            return false;
        }
        C1991d dVar = (C1991d) obj;
        return this.f6790c == dVar.f6790c && this.f6789b == dVar.f6789b && this.f6792e == dVar.f6792e && this.f6791d == dVar.f6791d;
    }

    public int hashCode() {
        return (((((this.f6789b * 31) + this.f6790c) * 31) + this.f6791d.hashCode()) * 31) + this.f6792e;
    }

    public String toString() {
        return "PreFillSize{width=" + this.f6789b + ", height=" + this.f6790c + ", config=" + this.f6791d + ", weight=" + this.f6792e + '}';
    }
}
