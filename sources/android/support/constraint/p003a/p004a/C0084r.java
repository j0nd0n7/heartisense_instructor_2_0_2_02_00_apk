package android.support.constraint.p003a.p004a;

import android.support.constraint.p003a.p004a.C0060e;
import java.util.ArrayList;

/* renamed from: android.support.constraint.a.a.r */
public class C0084r {

    /* renamed from: a */
    private int f525a;

    /* renamed from: b */
    private int f526b;

    /* renamed from: c */
    private int f527c;

    /* renamed from: d */
    private int f528d;

    /* renamed from: e */
    private ArrayList<C0085a> f529e = new ArrayList<>();

    /* renamed from: android.support.constraint.a.a.r$a */
    static class C0085a {

        /* renamed from: a */
        private C0060e f530a;

        /* renamed from: b */
        private C0060e f531b;

        /* renamed from: c */
        private int f532c;

        /* renamed from: d */
        private C0060e.C0063b f533d;

        /* renamed from: e */
        private int f534e;

        public C0085a(C0060e eVar) {
            this.f530a = eVar;
            this.f531b = eVar.mo124g();
            this.f532c = eVar.mo122e();
            this.f533d = eVar.mo123f();
            this.f534e = eVar.mo126i();
        }

        /* renamed from: a */
        public void mo363a(C0070h hVar) {
            this.f530a = hVar.mo185a(this.f530a.mo121d());
            if (this.f530a != null) {
                this.f531b = this.f530a.mo124g();
                this.f532c = this.f530a.mo122e();
                this.f533d = this.f530a.mo123f();
                this.f534e = this.f530a.mo126i();
                return;
            }
            this.f531b = null;
            this.f532c = 0;
            this.f533d = C0060e.C0063b.STRONG;
            this.f534e = 0;
        }

        /* renamed from: b */
        public void mo364b(C0070h hVar) {
            hVar.mo185a(this.f530a.mo121d()).mo112a(this.f531b, this.f532c, this.f533d, this.f534e);
        }
    }

    public C0084r(C0070h hVar) {
        this.f525a = hVar.mo169K();
        this.f526b = hVar.mo170L();
        this.f527c = hVar.mo171M();
        this.f528d = hVar.mo175Q();
        ArrayList<C0060e> al = hVar.mo219al();
        int size = al.size();
        for (int i = 0; i < size; i++) {
            this.f529e.add(new C0085a(al.get(i)));
        }
    }

    /* renamed from: a */
    public void mo361a(C0070h hVar) {
        this.f525a = hVar.mo169K();
        this.f526b = hVar.mo170L();
        this.f527c = hVar.mo171M();
        this.f528d = hVar.mo175Q();
        int size = this.f529e.size();
        for (int i = 0; i < size; i++) {
            this.f529e.get(i).mo363a(hVar);
        }
    }

    /* renamed from: b */
    public void mo362b(C0070h hVar) {
        hVar.mo262l(this.f525a);
        hVar.mo263m(this.f526b);
        hVar.mo271r(this.f527c);
        hVar.mo274s(this.f528d);
        int size = this.f529e.size();
        for (int i = 0; i < size; i++) {
            this.f529e.get(i).mo364b(hVar);
        }
    }
}
