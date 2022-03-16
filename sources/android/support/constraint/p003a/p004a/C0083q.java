package android.support.constraint.p003a.p004a;

import java.util.HashSet;
import java.util.Iterator;

/* renamed from: android.support.constraint.a.a.q */
public class C0083q {

    /* renamed from: o */
    public static final int f520o = 0;

    /* renamed from: p */
    public static final int f521p = 1;

    /* renamed from: q */
    public static final int f522q = 2;

    /* renamed from: n */
    HashSet<C0083q> f523n = new HashSet<>(2);

    /* renamed from: r */
    int f524r = 0;

    /* renamed from: a */
    public void mo340a() {
    }

    /* renamed from: a */
    public void mo345a(C0082p pVar) {
    }

    /* renamed from: a */
    public void mo356a(C0083q qVar) {
        this.f523n.add(qVar);
    }

    /* renamed from: b */
    public void mo347b() {
        this.f524r = 0;
        this.f523n.clear();
    }

    /* renamed from: e */
    public void mo357e() {
        this.f524r = 0;
        Iterator<C0083q> it = this.f523n.iterator();
        while (it.hasNext()) {
            it.next().mo357e();
        }
    }

    /* renamed from: f */
    public void mo358f() {
        if (this instanceof C0081o) {
            this.f524r = 0;
        }
        Iterator<C0083q> it = this.f523n.iterator();
        while (it.hasNext()) {
            it.next().mo358f();
        }
    }

    /* renamed from: g */
    public void mo359g() {
        this.f524r = 1;
        Iterator<C0083q> it = this.f523n.iterator();
        while (it.hasNext()) {
            it.next().mo340a();
        }
    }

    /* renamed from: h */
    public boolean mo360h() {
        return this.f524r == 1;
    }
}
