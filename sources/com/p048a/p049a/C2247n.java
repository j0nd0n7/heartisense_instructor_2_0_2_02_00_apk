package com.p048a.p049a;

import android.widget.AbsListView;
import com.p048a.p049a.p074h.p075a.C2185c;
import com.p048a.p049a.p074h.p076b.C2201b;
import com.p048a.p049a.p074h.p076b.C2210k;
import com.p048a.p049a.p074h.p076b.C2213m;
import com.p048a.p049a.p078j.C2238i;
import java.util.List;
import java.util.Queue;

/* renamed from: com.a.a.n */
public class C2247n<T> implements AbsListView.OnScrollListener {

    /* renamed from: a */
    private final int f7368a;

    /* renamed from: b */
    private final C2253d f7369b;

    /* renamed from: c */
    private final C2250a<T> f7370c;

    /* renamed from: d */
    private final C2251b<T> f7371d;

    /* renamed from: e */
    private int f7372e;

    /* renamed from: f */
    private int f7373f;

    /* renamed from: g */
    private int f7374g;

    /* renamed from: h */
    private int f7375h;

    /* renamed from: i */
    private boolean f7376i;

    /* renamed from: com.a.a.n$a */
    public interface C2250a<U> {
        /* renamed from: a */
        C2178h mo8385a(U u);

        /* renamed from: a */
        List<U> mo8386a(int i);
    }

    /* renamed from: com.a.a.n$b */
    public interface C2251b<T> {
        /* renamed from: a */
        int[] mo8330a(T t, int i, int i2);
    }

    /* renamed from: com.a.a.n$c */
    private static class C2252c extends C2201b<Object> {
        /* access modifiers changed from: private */

        /* renamed from: b */
        public int f7379b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public int f7380c;

        private C2252c() {
        }

        /* renamed from: a */
        public void mo8220a(C2210k kVar) {
            kVar.mo8196a(this.f7380c, this.f7379b);
        }

        /* renamed from: a */
        public void mo8051a(Object obj, C2185c<? super Object> cVar) {
        }
    }

    /* renamed from: com.a.a.n$d */
    private static final class C2253d {

        /* renamed from: a */
        private final Queue<C2252c> f7381a;

        public C2253d(int i) {
            this.f7381a = C2238i.m12728a(i);
            for (int i2 = 0; i2 < i; i2++) {
                this.f7381a.offer(new C2252c());
            }
        }

        /* renamed from: a */
        public C2252c mo8387a(int i, int i2) {
            C2252c poll = this.f7381a.poll();
            this.f7381a.offer(poll);
            int unused = poll.f7380c = i;
            int unused2 = poll.f7379b = i2;
            return poll;
        }
    }

    @Deprecated
    public C2247n(int i) {
        this.f7376i = true;
        this.f7370c = new C2250a<T>() {
            /* renamed from: a */
            public C2178h mo8385a(T t) {
                return C2247n.this.mo8382b(t);
            }

            /* renamed from: a */
            public List<T> mo8386a(int i) {
                return C2247n.this.mo8380a(i, i + 1);
            }
        };
        this.f7371d = new C2251b<T>() {
            /* renamed from: a */
            public int[] mo8330a(T t, int i, int i2) {
                return C2247n.this.mo8381a(t);
            }
        };
        this.f7368a = i;
        this.f7369b = new C2253d(i + 1);
    }

    public C2247n(C2250a<T> aVar, C2251b<T> bVar, int i) {
        this.f7376i = true;
        this.f7370c = aVar;
        this.f7371d = bVar;
        this.f7368a = i;
        this.f7369b = new C2253d(i + 1);
    }

    /* renamed from: a */
    private void m12797a() {
        for (int i = 0; i < this.f7368a; i++) {
            C2243l.m12756a((C2213m<?>) this.f7369b.mo8387a(0, 0));
        }
    }

    /* renamed from: a */
    private void m12798a(int i, boolean z) {
        if (this.f7376i != z) {
            this.f7376i = z;
            m12797a();
        }
        m12801b(i, (z ? this.f7368a : -this.f7368a) + i);
    }

    /* renamed from: a */
    private void m12799a(T t, int i, int i2) {
        int[] a = this.f7371d.mo8330a(t, i, i2);
        if (a != null) {
            this.f7370c.mo8385a(t).mo8181b(this.f7369b.mo8387a(a[0], a[1]));
        }
    }

    /* renamed from: a */
    private void m12800a(List<T> list, int i, boolean z) {
        int size = list.size();
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                m12799a(list.get(i2), i, i2);
            }
            return;
        }
        for (int i3 = size - 1; i3 >= 0; i3--) {
            m12799a(list.get(i3), i, i3);
        }
    }

    /* renamed from: b */
    private void m12801b(int i, int i2) {
        int min;
        int i3;
        if (i < i2) {
            i3 = Math.max(this.f7372e, i);
            min = i2;
        } else {
            min = Math.min(this.f7373f, i);
            i3 = i2;
        }
        int min2 = Math.min(this.f7375h, min);
        int min3 = Math.min(this.f7375h, Math.max(0, i3));
        if (i < i2) {
            for (int i4 = min3; i4 < min2; i4++) {
                m12800a(this.f7370c.mo8386a(i4), i4, true);
            }
        } else {
            for (int i5 = min2 - 1; i5 >= min3; i5--) {
                m12800a(this.f7370c.mo8386a(i5), i5, false);
            }
        }
        this.f7373f = min3;
        this.f7372e = min2;
    }

    /* access modifiers changed from: protected */
    @Deprecated
    /* renamed from: a */
    public List<T> mo8380a(int i, int i2) {
        throw new IllegalStateException("You must either provide a PreloadModelProvider or override getItems()");
    }

    /* access modifiers changed from: protected */
    @Deprecated
    /* renamed from: a */
    public int[] mo8381a(T t) {
        throw new IllegalStateException("You must either provide a PreloadDimensionProvider or override getDimensions()");
    }

    /* access modifiers changed from: protected */
    @Deprecated
    /* renamed from: b */
    public C2178h mo8382b(T t) {
        throw new IllegalStateException("You must either provide a PreloadModelProvider, or override getRequestBuilder()");
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        this.f7375h = i3;
        if (i > this.f7374g) {
            m12798a(i + i2, true);
        } else if (i < this.f7374g) {
            m12798a(i, false);
        }
        this.f7374g = i;
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
    }
}
