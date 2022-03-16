package android.support.p010v4.p027j;

import android.os.Build;
import java.net.DatagramSocket;
import java.net.Socket;

/* renamed from: android.support.v4.j.f */
public final class C0787f {

    /* renamed from: a */
    private static final C0793d f2868a;

    /* renamed from: android.support.v4.j.f$a */
    static class C0788a extends C0792c {
        C0788a() {
        }

        /* renamed from: a */
        public void mo2655a(DatagramSocket datagramSocket) {
            C0794g.m4059a(datagramSocket);
        }

        /* renamed from: b */
        public void mo2656b(DatagramSocket datagramSocket) {
            C0794g.m4060b(datagramSocket);
        }
    }

    /* renamed from: android.support.v4.j.f$b */
    static class C0789b implements C0793d {

        /* renamed from: a */
        private ThreadLocal<C0791a> f2869a = new ThreadLocal<C0791a>() {
            /* access modifiers changed from: protected */
            /* renamed from: a */
            public C0791a initialValue() {
                return new C0791a();
            }
        };

        /* renamed from: android.support.v4.j.f$b$a */
        private static class C0791a {

            /* renamed from: a */
            public int f2871a = -1;

            C0791a() {
            }
        }

        C0789b() {
        }

        /* renamed from: a */
        public void mo2657a() {
            this.f2869a.get().f2871a = -1;
        }

        /* renamed from: a */
        public void mo2658a(int i) {
        }

        /* renamed from: a */
        public void mo2659a(int i, int i2) {
        }

        /* renamed from: a */
        public void mo2655a(DatagramSocket datagramSocket) {
        }

        /* renamed from: a */
        public void mo2660a(Socket socket) {
        }

        /* renamed from: b */
        public int mo2661b() {
            return this.f2869a.get().f2871a;
        }

        /* renamed from: b */
        public void mo2662b(int i) {
            this.f2869a.get().f2871a = i;
        }

        /* renamed from: b */
        public void mo2656b(DatagramSocket datagramSocket) {
        }

        /* renamed from: b */
        public void mo2663b(Socket socket) {
        }
    }

    /* renamed from: android.support.v4.j.f$c */
    static class C0792c implements C0793d {
        C0792c() {
        }

        /* renamed from: a */
        public void mo2657a() {
            C0795h.m4061a();
        }

        /* renamed from: a */
        public void mo2658a(int i) {
            C0795h.m4062a(i);
        }

        /* renamed from: a */
        public void mo2659a(int i, int i2) {
            C0795h.m4063a(i, i2);
        }

        /* renamed from: a */
        public void mo2655a(DatagramSocket datagramSocket) {
            C0795h.m4064a(datagramSocket);
        }

        /* renamed from: a */
        public void mo2660a(Socket socket) {
            C0795h.m4065a(socket);
        }

        /* renamed from: b */
        public int mo2661b() {
            return C0795h.m4066b();
        }

        /* renamed from: b */
        public void mo2662b(int i) {
            C0795h.m4067b(i);
        }

        /* renamed from: b */
        public void mo2656b(DatagramSocket datagramSocket) {
            C0795h.m4068b(datagramSocket);
        }

        /* renamed from: b */
        public void mo2663b(Socket socket) {
            C0795h.m4069b(socket);
        }
    }

    /* renamed from: android.support.v4.j.f$d */
    interface C0793d {
        /* renamed from: a */
        void mo2657a();

        /* renamed from: a */
        void mo2658a(int i);

        /* renamed from: a */
        void mo2659a(int i, int i2);

        /* renamed from: a */
        void mo2655a(DatagramSocket datagramSocket);

        /* renamed from: a */
        void mo2660a(Socket socket);

        /* renamed from: b */
        int mo2661b();

        /* renamed from: b */
        void mo2662b(int i);

        /* renamed from: b */
        void mo2656b(DatagramSocket datagramSocket);

        /* renamed from: b */
        void mo2663b(Socket socket);
    }

    static {
        if ("N".equals(Build.VERSION.CODENAME)) {
            f2868a = new C0788a();
        } else if (Build.VERSION.SDK_INT >= 14) {
            f2868a = new C0792c();
        } else {
            f2868a = new C0789b();
        }
    }

    private C0787f() {
    }

    /* renamed from: a */
    public static void m4020a() {
        f2868a.mo2657a();
    }

    /* renamed from: a */
    public static void m4021a(int i) {
        f2868a.mo2658a(i);
    }

    /* renamed from: a */
    public static void m4022a(int i, int i2) {
        f2868a.mo2659a(i, i2);
    }

    /* renamed from: a */
    public static void m4023a(DatagramSocket datagramSocket) {
        f2868a.mo2655a(datagramSocket);
    }

    /* renamed from: a */
    public static void m4024a(Socket socket) {
        f2868a.mo2660a(socket);
    }

    /* renamed from: b */
    public static int m4025b() {
        return f2868a.mo2661b();
    }

    /* renamed from: b */
    public static void m4026b(int i) {
        f2868a.mo2662b(i);
    }

    /* renamed from: b */
    public static void m4027b(DatagramSocket datagramSocket) {
        f2868a.mo2656b(datagramSocket);
    }

    /* renamed from: b */
    public static void m4028b(Socket socket) {
        f2868a.mo2663b(socket);
    }
}
