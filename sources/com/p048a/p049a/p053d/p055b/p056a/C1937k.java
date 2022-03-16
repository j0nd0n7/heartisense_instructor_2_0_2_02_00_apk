package com.p048a.p049a.p053d.p055b.p056a;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import com.p048a.p049a.p078j.C2238i;
import java.util.TreeMap;

@TargetApi(19)
/* renamed from: com.a.a.d.b.a.k */
class C1937k implements C1930g {

    /* renamed from: a */
    private static final int f6666a = 8;

    /* renamed from: b */
    private final C1939b f6667b = new C1939b();

    /* renamed from: c */
    private final C1923e<C1938a, Bitmap> f6668c = new C1923e<>();

    /* renamed from: d */
    private final TreeMap<Integer, Integer> f6669d = new C1932i();

    /* renamed from: com.a.a.d.b.a.k$a */
    static final class C1938a implements C1931h {

        /* renamed from: a */
        private final C1939b f6670a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public int f6671b;

        C1938a(C1939b bVar) {
            this.f6670a = bVar;
        }

        /* renamed from: a */
        public void mo7753a() {
            this.f6670a.mo7761a(this);
        }

        /* renamed from: a */
        public void mo7788a(int i) {
            this.f6671b = i;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C1938a) && this.f6671b == ((C1938a) obj).f6671b;
        }

        public int hashCode() {
            return this.f6671b;
        }

        public String toString() {
            return C1937k.m11662b(this.f6671b);
        }
    }

    /* renamed from: com.a.a.d.b.a.k$b */
    static class C1939b extends C1920b<C1938a> {
        C1939b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C1938a mo7760b() {
            return new C1938a(this);
        }

        /* renamed from: a */
        public C1938a mo7793a(int i) {
            C1938a aVar = (C1938a) mo7762c();
            aVar.mo7788a(i);
            return aVar;
        }
    }

    C1937k() {
    }

    /* renamed from: a */
    private void m11661a(Integer num) {
        Integer num2 = this.f6669d.get(num);
        if (num2.intValue() == 1) {
            this.f6669d.remove(num);
        } else {
            this.f6669d.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static String m11662b(int i) {
        return "[" + i + "]";
    }

    /* renamed from: d */
    private static String m11663d(Bitmap bitmap) {
        return m11662b(C2238i.m12731b(bitmap));
    }

    /* renamed from: a */
    public Bitmap mo7746a() {
        Bitmap a = this.f6668c.mo7770a();
        if (a != null) {
            m11661a(Integer.valueOf(C2238i.m12731b(a)));
        }
        return a;
    }

    /* renamed from: a */
    public Bitmap mo7747a(int i, int i2, Bitmap.Config config) {
        int a = C2238i.m12722a(i, i2, config);
        C1938a a2 = this.f6667b.mo7793a(a);
        Integer ceilingKey = this.f6669d.ceilingKey(Integer.valueOf(a));
        if (!(ceilingKey == null || ceilingKey.intValue() == a || ceilingKey.intValue() > a * 8)) {
            this.f6667b.mo7761a(a2);
            a2 = this.f6667b.mo7793a(ceilingKey.intValue());
        }
        Bitmap a3 = this.f6668c.mo7771a(a2);
        if (a3 != null) {
            a3.reconfigure(i, i2, config);
            m11661a(ceilingKey);
        }
        return a3;
    }

    /* renamed from: a */
    public void mo7748a(Bitmap bitmap) {
        C1938a a = this.f6667b.mo7793a(C2238i.m12731b(bitmap));
        this.f6668c.mo7772a(a, bitmap);
        Integer num = this.f6669d.get(Integer.valueOf(a.f6671b));
        this.f6669d.put(Integer.valueOf(a.f6671b), Integer.valueOf(num == null ? 1 : num.intValue() + 1));
    }

    /* renamed from: b */
    public String mo7749b(int i, int i2, Bitmap.Config config) {
        return m11662b(C2238i.m12722a(i, i2, config));
    }

    /* renamed from: b */
    public String mo7750b(Bitmap bitmap) {
        return m11663d(bitmap);
    }

    /* renamed from: c */
    public int mo7751c(Bitmap bitmap) {
        return C2238i.m12731b(bitmap);
    }

    public String toString() {
        return "SizeStrategy:\n  " + this.f6668c + "\n" + "  SortedSizes" + this.f6669d;
    }
}
