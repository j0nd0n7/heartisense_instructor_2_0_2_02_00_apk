package com.p048a.p049a.p053d.p060c;

import android.content.Context;
import com.p048a.p049a.p053d.p054a.C1897c;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.a.a.d.c.c */
public class C2039c {

    /* renamed from: c */
    private static final C2055l f6863c = new C2055l() {
        /* renamed from: a */
        public C1897c mo7901a(Object obj, int i, int i2) {
            throw new NoSuchMethodError("This should never be called!");
        }

        public String toString() {
            return "NULL_MODEL_LOADER";
        }
    };

    /* renamed from: a */
    private final Map<Class, Map<Class, C2056m>> f6864a = new HashMap();

    /* renamed from: b */
    private final Map<Class, Map<Class, C2055l>> f6865b = new HashMap();

    /* renamed from: d */
    private final Context f6866d;

    public C2039c(Context context) {
        this.f6866d = context.getApplicationContext();
    }

    /* renamed from: a */
    private <T, Y> void m11882a(Class<T> cls, Class<Y> cls2, C2055l<T, Y> lVar) {
        Map map = this.f6865b.get(cls);
        if (map == null) {
            map = new HashMap();
            this.f6865b.put(cls, map);
        }
        map.put(cls2, lVar);
    }

    /* renamed from: c */
    private <T, Y> void m11883c(Class<T> cls, Class<Y> cls2) {
        m11882a(cls, cls2, f6863c);
    }

    /* renamed from: d */
    private <T, Y> C2055l<T, Y> m11884d(Class<T> cls, Class<Y> cls2) {
        Map map = this.f6865b.get(cls);
        if (map != null) {
            return (C2055l) map.get(cls2);
        }
        return null;
    }

    /* renamed from: e */
    private <T, Y> C2056m<T, Y> m11885e(Class<T> cls, Class<Y> cls2) {
        Map map;
        Map map2 = this.f6864a.get(cls);
        C2056m<T, Y> mVar = map2 != null ? (C2056m) map2.get(cls2) : null;
        if (mVar != null) {
            return mVar;
        }
        Iterator<Class> it = this.f6864a.keySet().iterator();
        while (true) {
            C2056m<T, Y> mVar2 = mVar;
            if (!it.hasNext()) {
                return mVar2;
            }
            Class next = it.next();
            if (!next.isAssignableFrom(cls) || (map = this.f6864a.get(next)) == null) {
                mVar = mVar2;
            } else {
                mVar = (C2056m) map.get(cls2);
                if (mVar != null) {
                    return mVar;
                }
            }
        }
    }

    @Deprecated
    /* renamed from: a */
    public synchronized <T, Y> C2055l<T, Y> mo7907a(Class<T> cls, Class<Y> cls2, Context context) {
        return mo7910b(cls, cls2);
    }

    /* renamed from: a */
    public synchronized <T, Y> C2056m<T, Y> mo7908a(Class<T> cls, Class<Y> cls2) {
        Map map;
        this.f6865b.clear();
        map = this.f6864a.get(cls);
        return map != null ? (C2056m) map.remove(cls2) : null;
    }

    /* renamed from: a */
    public synchronized <T, Y> C2056m<T, Y> mo7909a(Class<T> cls, Class<Y> cls2, C2056m<T, Y> mVar) {
        C2056m<T, Y> mVar2;
        this.f6865b.clear();
        Map map = this.f6864a.get(cls);
        if (map == null) {
            map = new HashMap();
            this.f6864a.put(cls, map);
        }
        mVar2 = (C2056m) map.put(cls2, mVar);
        if (mVar2 != null) {
            Iterator<Map<Class, C2056m>> it = this.f6864a.values().iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().containsValue(mVar2)) {
                        mVar2 = null;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        return mVar2;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Class<Y>, java.lang.Class] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized <T, Y> com.p048a.p049a.p053d.p060c.C2055l<T, Y> mo7910b(java.lang.Class<T> r3, java.lang.Class<Y> r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            com.a.a.d.c.l r0 = r2.m11884d(r3, r4)     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x0012
            com.a.a.d.c.l r1 = f6863c     // Catch:{ all -> 0x0022 }
            boolean r1 = r1.equals(r0)     // Catch:{ all -> 0x0022 }
            if (r1 == 0) goto L_0x0010
            r0 = 0
        L_0x0010:
            monitor-exit(r2)
            return r0
        L_0x0012:
            com.a.a.d.c.m r1 = r2.m11885e(r3, r4)     // Catch:{ all -> 0x0022 }
            if (r1 == 0) goto L_0x0025
            android.content.Context r0 = r2.f6866d     // Catch:{ all -> 0x0022 }
            com.a.a.d.c.l r0 = r1.mo7896a(r0, r2)     // Catch:{ all -> 0x0022 }
            r2.m11882a(r3, r4, r0)     // Catch:{ all -> 0x0022 }
            goto L_0x0010
        L_0x0022:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0025:
            r2.m11883c(r3, r4)     // Catch:{ all -> 0x0022 }
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p048a.p049a.p053d.p060c.C2039c.mo7910b(java.lang.Class, java.lang.Class):com.a.a.d.c.l");
    }
}
