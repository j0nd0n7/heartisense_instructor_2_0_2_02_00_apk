package android.support.constraint.p003a;

/* renamed from: android.support.constraint.a.g */
final class C0093g {

    /* renamed from: a */
    private static final boolean f596a = false;

    /* renamed from: android.support.constraint.a.g$a */
    interface C0094a<T> {
        /* renamed from: a */
        T mo439a();

        /* renamed from: a */
        void mo440a(T[] tArr, int i);

        /* renamed from: a */
        boolean mo441a(T t);
    }

    /* renamed from: android.support.constraint.a.g$b */
    static class C0095b<T> implements C0094a<T> {

        /* renamed from: a */
        private final Object[] f597a;

        /* renamed from: b */
        private int f598b;

        C0095b(int i) {
            if (i <= 0) {
                throw new IllegalArgumentException("The max pool size must be > 0");
            }
            this.f597a = new Object[i];
        }

        /* renamed from: b */
        private boolean m515b(T t) {
            for (int i = 0; i < this.f598b; i++) {
                if (this.f597a[i] == t) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        public T mo439a() {
            if (this.f598b <= 0) {
                return null;
            }
            int i = this.f598b - 1;
            T t = this.f597a[i];
            this.f597a[i] = null;
            this.f598b--;
            return t;
        }

        /* renamed from: a */
        public void mo440a(T[] tArr, int i) {
            if (i > tArr.length) {
                i = tArr.length;
            }
            for (int i2 = 0; i2 < i; i2++) {
                T t = tArr[i2];
                if (this.f598b < this.f597a.length) {
                    this.f597a[this.f598b] = t;
                    this.f598b++;
                }
            }
        }

        /* renamed from: a */
        public boolean mo441a(T t) {
            if (this.f598b >= this.f597a.length) {
                return false;
            }
            this.f597a[this.f598b] = t;
            this.f598b++;
            return true;
        }
    }

    private C0093g() {
    }
}
