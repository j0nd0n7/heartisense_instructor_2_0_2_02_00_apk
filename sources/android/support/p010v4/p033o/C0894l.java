package android.support.p010v4.p033o;

/* renamed from: android.support.v4.o.l */
public class C0894l<F, S> {

    /* renamed from: a */
    public final F f3081a;

    /* renamed from: b */
    public final S f3082b;

    public C0894l(F f, S s) {
        this.f3081a = f;
        this.f3082b = s;
    }

    /* renamed from: a */
    public static <A, B> C0894l<A, B> m4484a(A a, B b) {
        return new C0894l<>(a, b);
    }

    /* renamed from: b */
    private static boolean m4485b(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0894l)) {
            return false;
        }
        C0894l lVar = (C0894l) obj;
        return m4485b(lVar.f3081a, this.f3081a) && m4485b(lVar.f3082b, this.f3082b);
    }

    public int hashCode() {
        int i = 0;
        int hashCode = this.f3081a == null ? 0 : this.f3081a.hashCode();
        if (this.f3082b != null) {
            i = this.f3082b.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "Pair{" + String.valueOf(this.f3081a) + " " + String.valueOf(this.f3082b) + "}";
    }
}
