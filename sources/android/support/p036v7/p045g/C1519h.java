package android.support.p036v7.p045g;

import android.util.SparseArray;
import java.lang.reflect.Array;

/* renamed from: android.support.v7.g.h */
class C1519h<T> {

    /* renamed from: a */
    final int f4738a;

    /* renamed from: b */
    C1520a<T> f4739b;

    /* renamed from: c */
    private final SparseArray<C1520a<T>> f4740c = new SparseArray<>(10);

    /* renamed from: android.support.v7.g.h$a */
    public static class C1520a<T> {

        /* renamed from: a */
        public final T[] f4741a;

        /* renamed from: b */
        public int f4742b;

        /* renamed from: c */
        public int f4743c;

        /* renamed from: d */
        C1520a<T> f4744d;

        public C1520a(Class<T> cls, int i) {
            this.f4741a = (Object[]) Array.newInstance(cls, i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo5111a(int i) {
            return this.f4742b <= i && i < this.f4742b + this.f4743c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public T mo5112b(int i) {
            return this.f4741a[i - this.f4742b];
        }
    }

    public C1519h(int i) {
        this.f4738a = i;
    }

    /* renamed from: a */
    public int mo5105a() {
        return this.f4740c.size();
    }

    /* renamed from: a */
    public C1520a<T> mo5106a(C1520a<T> aVar) {
        int indexOfKey = this.f4740c.indexOfKey(aVar.f4742b);
        if (indexOfKey < 0) {
            this.f4740c.put(aVar.f4742b, aVar);
            return null;
        }
        C1520a<T> valueAt = this.f4740c.valueAt(indexOfKey);
        this.f4740c.setValueAt(indexOfKey, aVar);
        if (this.f4739b != valueAt) {
            return valueAt;
        }
        this.f4739b = aVar;
        return valueAt;
    }

    /* renamed from: a */
    public T mo5107a(int i) {
        if (this.f4739b == null || !this.f4739b.mo5111a(i)) {
            int indexOfKey = this.f4740c.indexOfKey(i - (i % this.f4738a));
            if (indexOfKey < 0) {
                return null;
            }
            this.f4739b = this.f4740c.valueAt(indexOfKey);
        }
        return this.f4739b.mo5112b(i);
    }

    /* renamed from: b */
    public C1520a<T> mo5108b(int i) {
        return this.f4740c.valueAt(i);
    }

    /* renamed from: b */
    public void mo5109b() {
        this.f4740c.clear();
    }

    /* renamed from: c */
    public C1520a<T> mo5110c(int i) {
        C1520a<T> aVar = this.f4740c.get(i);
        if (this.f4739b == aVar) {
            this.f4739b = null;
        }
        this.f4740c.delete(i);
        return aVar;
    }
}
