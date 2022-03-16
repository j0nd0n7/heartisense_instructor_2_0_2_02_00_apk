package com.p048a.p049a.p053d.p055b.p056a;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import com.p048a.p049a.p078j.C2238i;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

@TargetApi(19)
/* renamed from: com.a.a.d.b.a.j */
public class C1933j implements C1930g {

    /* renamed from: a */
    private static final int f6654a = 8;

    /* renamed from: b */
    private static final Bitmap.Config[] f6655b = {Bitmap.Config.ARGB_8888, null};

    /* renamed from: c */
    private static final Bitmap.Config[] f6656c = {Bitmap.Config.RGB_565};

    /* renamed from: d */
    private static final Bitmap.Config[] f6657d = {Bitmap.Config.ARGB_4444};

    /* renamed from: e */
    private static final Bitmap.Config[] f6658e = {Bitmap.Config.ALPHA_8};

    /* renamed from: f */
    private final C1936b f6659f = new C1936b();

    /* renamed from: g */
    private final C1923e<C1935a, Bitmap> f6660g = new C1923e<>();

    /* renamed from: h */
    private final Map<Bitmap.Config, NavigableMap<Integer, Integer>> f6661h = new HashMap();

    /* renamed from: com.a.a.d.b.a.j$1 */
    static /* synthetic */ class C19341 {

        /* renamed from: a */
        static final /* synthetic */ int[] f6662a = new int[Bitmap.Config.values().length];

        static {
            try {
                f6662a[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f6662a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f6662a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                f6662a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
        }
    }

    /* renamed from: com.a.a.d.b.a.j$a */
    static final class C1935a implements C1931h {

        /* renamed from: a */
        private final C1936b f6663a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public int f6664b;

        /* renamed from: c */
        private Bitmap.Config f6665c;

        public C1935a(C1936b bVar) {
            this.f6663a = bVar;
        }

        C1935a(C1936b bVar, int i, Bitmap.Config config) {
            this(bVar);
            mo7781a(i, config);
        }

        /* renamed from: a */
        public void mo7753a() {
            this.f6663a.mo7761a(this);
        }

        /* renamed from: a */
        public void mo7781a(int i, Bitmap.Config config) {
            this.f6664b = i;
            this.f6665c = config;
        }

        /* JADX WARNING: Removed duplicated region for block: B:8:0x0015 A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r4) {
            /*
                r3 = this;
                r0 = 0
                boolean r1 = r4 instanceof com.p048a.p049a.p053d.p055b.p056a.C1933j.C1935a
                if (r1 == 0) goto L_0x0016
                com.a.a.d.b.a.j$a r4 = (com.p048a.p049a.p053d.p055b.p056a.C1933j.C1935a) r4
                int r1 = r3.f6664b
                int r2 = r4.f6664b
                if (r1 != r2) goto L_0x0016
                android.graphics.Bitmap$Config r1 = r3.f6665c
                if (r1 != 0) goto L_0x0017
                android.graphics.Bitmap$Config r1 = r4.f6665c
                if (r1 != 0) goto L_0x0016
            L_0x0015:
                r0 = 1
            L_0x0016:
                return r0
            L_0x0017:
                android.graphics.Bitmap$Config r1 = r3.f6665c
                android.graphics.Bitmap$Config r2 = r4.f6665c
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0016
                goto L_0x0015
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p048a.p049a.p053d.p055b.p056a.C1933j.C1935a.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            return (this.f6665c != null ? this.f6665c.hashCode() : 0) + (this.f6664b * 31);
        }

        public String toString() {
            return C1933j.m11646b(this.f6664b, this.f6665c);
        }
    }

    /* renamed from: com.a.a.d.b.a.j$b */
    static class C1936b extends C1920b<C1935a> {
        C1936b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C1935a mo7760b() {
            return new C1935a(this);
        }

        /* renamed from: a */
        public C1935a mo7786a(int i, Bitmap.Config config) {
            C1935a aVar = (C1935a) mo7762c();
            aVar.mo7781a(i, config);
            return aVar;
        }
    }

    /* renamed from: a */
    private C1935a m11642a(C1935a aVar, int i, Bitmap.Config config) {
        Bitmap.Config[] b = m11647b(config);
        int length = b.length;
        int i2 = 0;
        while (i2 < length) {
            Bitmap.Config config2 = b[i2];
            Integer ceilingKey = m11644a(config2).ceilingKey(Integer.valueOf(i));
            if (ceilingKey == null || ceilingKey.intValue() > i * 8) {
                i2++;
            } else {
                if (ceilingKey.intValue() == i) {
                    if (config2 == null) {
                        if (config == null) {
                            return aVar;
                        }
                    } else if (config2.equals(config)) {
                        return aVar;
                    }
                }
                this.f6659f.mo7761a(aVar);
                return this.f6659f.mo7786a(ceilingKey.intValue(), config2);
            }
        }
        return aVar;
    }

    /* renamed from: a */
    private NavigableMap<Integer, Integer> m11644a(Bitmap.Config config) {
        NavigableMap<Integer, Integer> navigableMap = this.f6661h.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f6661h.put(config, treeMap);
        return treeMap;
    }

    /* renamed from: a */
    private void m11645a(Integer num, Bitmap.Config config) {
        NavigableMap<Integer, Integer> a = m11644a(config);
        Integer num2 = (Integer) a.get(num);
        if (num2.intValue() == 1) {
            a.remove(num);
        } else {
            a.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static String m11646b(int i, Bitmap.Config config) {
        return "[" + i + "](" + config + ")";
    }

    /* renamed from: b */
    private static Bitmap.Config[] m11647b(Bitmap.Config config) {
        switch (C19341.f6662a[config.ordinal()]) {
            case 1:
                return f6655b;
            case 2:
                return f6656c;
            case 3:
                return f6657d;
            case 4:
                return f6658e;
            default:
                return new Bitmap.Config[]{config};
        }
    }

    /* renamed from: a */
    public Bitmap mo7746a() {
        Bitmap a = this.f6660g.mo7770a();
        if (a != null) {
            m11645a(Integer.valueOf(C2238i.m12731b(a)), a.getConfig());
        }
        return a;
    }

    /* renamed from: a */
    public Bitmap mo7747a(int i, int i2, Bitmap.Config config) {
        int a = C2238i.m12722a(i, i2, config);
        Bitmap a2 = this.f6660g.mo7771a(m11642a(this.f6659f.mo7786a(a, config), a, config));
        if (a2 != null) {
            m11645a(Integer.valueOf(C2238i.m12731b(a2)), a2.getConfig());
            a2.reconfigure(i, i2, a2.getConfig() != null ? a2.getConfig() : Bitmap.Config.ARGB_8888);
        }
        return a2;
    }

    /* renamed from: a */
    public void mo7748a(Bitmap bitmap) {
        C1935a a = this.f6659f.mo7786a(C2238i.m12731b(bitmap), bitmap.getConfig());
        this.f6660g.mo7772a(a, bitmap);
        NavigableMap<Integer, Integer> a2 = m11644a(bitmap.getConfig());
        Integer num = (Integer) a2.get(Integer.valueOf(a.f6664b));
        a2.put(Integer.valueOf(a.f6664b), Integer.valueOf(num == null ? 1 : num.intValue() + 1));
    }

    /* renamed from: b */
    public String mo7749b(int i, int i2, Bitmap.Config config) {
        return m11646b(C2238i.m12722a(i, i2, config), config);
    }

    /* renamed from: b */
    public String mo7750b(Bitmap bitmap) {
        return m11646b(C2238i.m12731b(bitmap), bitmap.getConfig());
    }

    /* renamed from: c */
    public int mo7751c(Bitmap bitmap) {
        return C2238i.m12731b(bitmap);
    }

    public String toString() {
        StringBuilder append = new StringBuilder().append("SizeConfigStrategy{groupedMap=").append(this.f6660g).append(", sortedSizes=(");
        for (Map.Entry next : this.f6661h.entrySet()) {
            append.append(next.getKey()).append('[').append(next.getValue()).append("], ");
        }
        if (!this.f6661h.isEmpty()) {
            append.replace(append.length() - 2, append.length(), "");
        }
        return append.append(")}").toString();
    }
}
