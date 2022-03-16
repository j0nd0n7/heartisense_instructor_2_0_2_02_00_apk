package android.support.p010v4.view;

import android.os.Build;
import android.view.LayoutInflater;

/* renamed from: android.support.v4.view.m */
public final class C1172m {

    /* renamed from: a */
    static final C1173a f3634a;

    /* renamed from: android.support.v4.view.m$a */
    interface C1173a {
        /* renamed from: a */
        C1182q mo3999a(LayoutInflater layoutInflater);

        /* renamed from: a */
        void mo4000a(LayoutInflater layoutInflater, C1182q qVar);
    }

    /* renamed from: android.support.v4.view.m$b */
    static class C1174b implements C1173a {
        C1174b() {
        }

        /* renamed from: a */
        public C1182q mo3999a(LayoutInflater layoutInflater) {
            return C1177n.m7031a(layoutInflater);
        }

        /* renamed from: a */
        public void mo4000a(LayoutInflater layoutInflater, C1182q qVar) {
            C1177n.m7032a(layoutInflater, qVar);
        }
    }

    /* renamed from: android.support.v4.view.m$c */
    static class C1175c extends C1174b {
        C1175c() {
        }

        /* renamed from: a */
        public void mo4000a(LayoutInflater layoutInflater, C1182q qVar) {
            C1179o.m7033a(layoutInflater, qVar);
        }
    }

    /* renamed from: android.support.v4.view.m$d */
    static class C1176d extends C1175c {
        C1176d() {
        }

        /* renamed from: a */
        public void mo4000a(LayoutInflater layoutInflater, C1182q qVar) {
            C1181p.m7035a(layoutInflater, qVar);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            f3634a = new C1176d();
        } else if (i >= 11) {
            f3634a = new C1175c();
        } else {
            f3634a = new C1174b();
        }
    }

    private C1172m() {
    }

    /* renamed from: a */
    public static C1182q m7023a(LayoutInflater layoutInflater) {
        return f3634a.mo3999a(layoutInflater);
    }

    /* renamed from: a */
    public static void m7024a(LayoutInflater layoutInflater, C1182q qVar) {
        f3634a.mo4000a(layoutInflater, qVar);
    }
}
