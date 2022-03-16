package com.p048a.p049a.p053d.p055b.p056a;

import android.graphics.Bitmap;
import com.p048a.p049a.p078j.C2238i;

/* renamed from: com.a.a.d.b.a.a */
class C1917a implements C1930g {

    /* renamed from: a */
    private final C1919b f6627a = new C1919b();

    /* renamed from: b */
    private final C1923e<C1918a, Bitmap> f6628b = new C1923e<>();

    /* renamed from: com.a.a.d.b.a.a$a */
    static class C1918a implements C1931h {

        /* renamed from: a */
        private final C1919b f6629a;

        /* renamed from: b */
        private int f6630b;

        /* renamed from: c */
        private int f6631c;

        /* renamed from: d */
        private Bitmap.Config f6632d;

        public C1918a(C1919b bVar) {
            this.f6629a = bVar;
        }

        /* renamed from: a */
        public void mo7753a() {
            this.f6629a.mo7761a(this);
        }

        /* renamed from: a */
        public void mo7754a(int i, int i2, Bitmap.Config config) {
            this.f6630b = i;
            this.f6631c = i2;
            this.f6632d = config;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C1918a)) {
                return false;
            }
            C1918a aVar = (C1918a) obj;
            return this.f6630b == aVar.f6630b && this.f6631c == aVar.f6631c && this.f6632d == aVar.f6632d;
        }

        public int hashCode() {
            return (this.f6632d != null ? this.f6632d.hashCode() : 0) + (((this.f6630b * 31) + this.f6631c) * 31);
        }

        public String toString() {
            return C1917a.m11575d(this.f6630b, this.f6631c, this.f6632d);
        }
    }

    /* renamed from: com.a.a.d.b.a.a$b */
    static class C1919b extends C1920b<C1918a> {
        C1919b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C1918a mo7760b() {
            return new C1918a(this);
        }

        /* renamed from: a */
        public C1918a mo7759a(int i, int i2, Bitmap.Config config) {
            C1918a aVar = (C1918a) mo7762c();
            aVar.mo7754a(i, i2, config);
            return aVar;
        }
    }

    C1917a() {
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static String m11575d(int i, int i2, Bitmap.Config config) {
        return "[" + i + "x" + i2 + "], " + config;
    }

    /* renamed from: d */
    private static String m11576d(Bitmap bitmap) {
        return m11575d(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
    }

    /* renamed from: a */
    public Bitmap mo7746a() {
        return this.f6628b.mo7770a();
    }

    /* renamed from: a */
    public Bitmap mo7747a(int i, int i2, Bitmap.Config config) {
        return this.f6628b.mo7771a(this.f6627a.mo7759a(i, i2, config));
    }

    /* renamed from: a */
    public void mo7748a(Bitmap bitmap) {
        this.f6628b.mo7772a(this.f6627a.mo7759a(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig()), bitmap);
    }

    /* renamed from: b */
    public String mo7749b(int i, int i2, Bitmap.Config config) {
        return m11575d(i, i2, config);
    }

    /* renamed from: b */
    public String mo7750b(Bitmap bitmap) {
        return m11576d(bitmap);
    }

    /* renamed from: c */
    public int mo7751c(Bitmap bitmap) {
        return C2238i.m12731b(bitmap);
    }

    public String toString() {
        return "AttributeStrategy:\n  " + this.f6628b;
    }
}
