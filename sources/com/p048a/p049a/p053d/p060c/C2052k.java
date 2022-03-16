package com.p048a.p049a.p053d.p060c;

import com.p048a.p049a.p078j.C2235f;
import com.p048a.p049a.p078j.C2238i;
import java.util.Queue;

/* renamed from: com.a.a.d.c.k */
public class C2052k<A, B> {

    /* renamed from: a */
    private static final int f6897a = 250;

    /* renamed from: b */
    private final C2235f<C2054a<A>, B> f6898b;

    /* renamed from: com.a.a.d.c.k$a */
    static final class C2054a<A> {

        /* renamed from: a */
        private static final Queue<C2054a<?>> f6900a = C2238i.m12728a(0);

        /* renamed from: b */
        private int f6901b;

        /* renamed from: c */
        private int f6902c;

        /* renamed from: d */
        private A f6903d;

        private C2054a() {
        }

        /* renamed from: a */
        static <A> C2054a<A> m11926a(A a, int i, int i2) {
            C2054a<A> poll = f6900a.poll();
            if (poll == null) {
                poll = new C2054a<>();
            }
            poll.m11927b(a, i, i2);
            return poll;
        }

        /* renamed from: b */
        private void m11927b(A a, int i, int i2) {
            this.f6903d = a;
            this.f6902c = i;
            this.f6901b = i2;
        }

        /* renamed from: a */
        public void mo7939a() {
            f6900a.offer(this);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C2054a)) {
                return false;
            }
            C2054a aVar = (C2054a) obj;
            return this.f6902c == aVar.f6902c && this.f6901b == aVar.f6901b && this.f6903d.equals(aVar.f6903d);
        }

        public int hashCode() {
            return (((this.f6901b * 31) + this.f6902c) * 31) + this.f6903d.hashCode();
        }
    }

    public C2052k() {
        this(250);
    }

    public C2052k(int i) {
        this.f6898b = new C2235f<C2054a<A>, B>(i) {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo7817a(C2054a<A> aVar, B b) {
                aVar.mo7939a();
            }
        };
    }

    /* renamed from: a */
    public B mo7936a(A a, int i, int i2) {
        C2054a a2 = C2054a.m11926a(a, i, i2);
        B c = this.f6898b.mo8337c(a2);
        a2.mo7939a();
        return c;
    }

    /* renamed from: a */
    public void mo7937a(A a, int i, int i2, B b) {
        this.f6898b.mo8334b(C2054a.m11926a(a, i, i2), b);
    }
}
