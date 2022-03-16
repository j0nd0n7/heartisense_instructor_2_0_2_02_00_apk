package com.p048a.p049a.p053d.p060c;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.a.a.d.c.j */
public final class C2049j implements C2042e {

    /* renamed from: c */
    private final Map<String, List<C2048i>> f6885c;

    /* renamed from: d */
    private volatile Map<String, String> f6886d;

    /* renamed from: com.a.a.d.c.j$a */
    public static final class C2050a {

        /* renamed from: a */
        private static final String f6887a = "User-Agent";

        /* renamed from: b */
        private static final String f6888b = System.getProperty("http.agent");

        /* renamed from: c */
        private static final String f6889c = "Accept-Encoding";

        /* renamed from: d */
        private static final String f6890d = "identity";

        /* renamed from: e */
        private static final Map<String, List<C2048i>> f6891e;

        /* renamed from: f */
        private boolean f6892f = true;

        /* renamed from: g */
        private Map<String, List<C2048i>> f6893g = f6891e;

        /* renamed from: h */
        private boolean f6894h = true;

        /* renamed from: i */
        private boolean f6895i = true;

        static {
            HashMap hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(f6888b)) {
                hashMap.put(f6887a, Collections.singletonList(new C2051b(f6888b)));
            }
            hashMap.put(f6889c, Collections.singletonList(new C2051b(f6890d)));
            f6891e = Collections.unmodifiableMap(hashMap);
        }

        /* renamed from: a */
        private List<C2048i> m11913a(String str) {
            List<C2048i> list = this.f6893g.get(str);
            if (list != null) {
                return list;
            }
            ArrayList arrayList = new ArrayList();
            this.f6893g.put(str, arrayList);
            return arrayList;
        }

        /* renamed from: b */
        private void m11914b() {
            if (this.f6892f) {
                this.f6892f = false;
                this.f6893g = m11915c();
            }
        }

        /* renamed from: c */
        private Map<String, List<C2048i>> m11915c() {
            HashMap hashMap = new HashMap(this.f6893g.size());
            for (Map.Entry next : this.f6893g.entrySet()) {
                hashMap.put(next.getKey(), new ArrayList((Collection) next.getValue()));
            }
            return hashMap;
        }

        /* renamed from: a */
        public C2050a mo7928a(String str, C2048i iVar) {
            if ((this.f6894h && f6889c.equalsIgnoreCase(str)) || (this.f6895i && f6887a.equalsIgnoreCase(str))) {
                return mo7931b(str, iVar);
            }
            m11914b();
            m11913a(str).add(iVar);
            return this;
        }

        /* renamed from: a */
        public C2050a mo7929a(String str, String str2) {
            return mo7928a(str, (C2048i) new C2051b(str2));
        }

        /* renamed from: a */
        public C2049j mo7930a() {
            this.f6892f = true;
            return new C2049j(this.f6893g);
        }

        /* renamed from: b */
        public C2050a mo7931b(String str, C2048i iVar) {
            m11914b();
            if (iVar == null) {
                this.f6893g.remove(str);
            } else {
                List<C2048i> a = m11913a(str);
                a.clear();
                a.add(iVar);
            }
            if (this.f6894h && f6889c.equalsIgnoreCase(str)) {
                this.f6894h = false;
            }
            if (this.f6895i && f6887a.equalsIgnoreCase(str)) {
                this.f6895i = false;
            }
            return this;
        }

        /* renamed from: b */
        public C2050a mo7932b(String str, String str2) {
            return mo7931b(str, (C2048i) str2 == null ? null : new C2051b(str2));
        }
    }

    /* renamed from: com.a.a.d.c.j$b */
    static final class C2051b implements C2048i {

        /* renamed from: a */
        private final String f6896a;

        C2051b(String str) {
            this.f6896a = str;
        }

        /* renamed from: a */
        public String mo7924a() {
            return this.f6896a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C2051b) {
                return this.f6896a.equals(((C2051b) obj).f6896a);
            }
            return false;
        }

        public int hashCode() {
            return this.f6896a.hashCode();
        }

        public String toString() {
            return "StringHeaderFactory{value='" + this.f6896a + '\'' + '}';
        }
    }

    C2049j(Map<String, List<C2048i>> map) {
        this.f6885c = Collections.unmodifiableMap(map);
    }

    /* renamed from: b */
    private Map<String, String> m11911b() {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.f6885c.entrySet()) {
            StringBuilder sb = new StringBuilder();
            List list = (List) next.getValue();
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= list.size()) {
                    break;
                }
                sb.append(((C2048i) list.get(i2)).mo7924a());
                if (i2 != list.size() - 1) {
                    sb.append(',');
                }
                i = i2 + 1;
            }
            hashMap.put(next.getKey(), sb.toString());
        }
        return hashMap;
    }

    /* renamed from: a */
    public Map<String, String> mo7919a() {
        if (this.f6886d == null) {
            synchronized (this) {
                if (this.f6886d == null) {
                    this.f6886d = Collections.unmodifiableMap(m11911b());
                }
            }
        }
        return this.f6886d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C2049j) {
            return this.f6885c.equals(((C2049j) obj).f6885c);
        }
        return false;
    }

    public int hashCode() {
        return this.f6885c.hashCode();
    }

    public String toString() {
        return "LazyHeaders{headers=" + this.f6885c + '}';
    }
}
