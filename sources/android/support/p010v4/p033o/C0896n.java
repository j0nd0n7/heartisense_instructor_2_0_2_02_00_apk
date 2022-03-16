package android.support.p010v4.p033o;

/* renamed from: android.support.v4.o.n */
public final class C0896n {

    /* renamed from: android.support.v4.o.n$a */
    public interface C0897a<T> {
        /* renamed from: a */
        T mo2958a();

        /* renamed from: a */
        boolean mo2959a(T t);
    }

    /* renamed from: android.support.v4.o.n$b */
    public static class C0898b<T> implements C0897a<T> {

        /* renamed from: a */
        private final Object[] f3111a;

        /* renamed from: b */
        private int f3112b;

        public C0898b(int i) {
            if (i <= 0) {
                throw new IllegalArgumentException("The max pool size must be > 0");
            }
            this.f3111a = new Object[i];
        }

        /* renamed from: b */
        private boolean m4488b(T t) {
            for (int i = 0; i < this.f3112b; i++) {
                if (this.f3111a[i] == t) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        public T mo2958a() {
            if (this.f3112b <= 0) {
                return null;
            }
            int i = this.f3112b - 1;
            T t = this.f3111a[i];
            this.f3111a[i] = null;
            this.f3112b--;
            return t;
        }

        /* renamed from: a */
        public boolean mo2959a(T t) {
            if (m4488b(t)) {
                throw new IllegalStateException("Already in the pool!");
            } else if (this.f3112b >= this.f3111a.length) {
                return false;
            } else {
                this.f3111a[this.f3112b] = t;
                this.f3112b++;
                return true;
            }
        }
    }

    /* renamed from: android.support.v4.o.n$c */
    public static class C0899c<T> extends C0898b<T> {

        /* renamed from: a */
        private final Object f3113a = new Object();

        public C0899c(int i) {
            super(i);
        }

        /* renamed from: a */
        public T mo2958a() {
            T a;
            synchronized (this.f3113a) {
                a = super.mo2958a();
            }
            return a;
        }

        /* renamed from: a */
        public boolean mo2959a(T t) {
            boolean a;
            synchronized (this.f3113a) {
                a = super.mo2959a(t);
            }
            return a;
        }
    }

    private C0896n() {
    }
}
