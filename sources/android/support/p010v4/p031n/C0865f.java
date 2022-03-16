package android.support.p010v4.p031n;

import java.nio.CharBuffer;
import java.util.Locale;

/* renamed from: android.support.v4.n.f */
public final class C0865f {

    /* renamed from: a */
    public static final C0864e f3000a = new C0870e((C0868c) null, false);

    /* renamed from: b */
    public static final C0864e f3001b = new C0870e((C0868c) null, true);

    /* renamed from: c */
    public static final C0864e f3002c = new C0870e(C0867b.f3012a, false);

    /* renamed from: d */
    public static final C0864e f3003d = new C0870e(C0867b.f3012a, true);

    /* renamed from: e */
    public static final C0864e f3004e = new C0870e(C0866a.f3009a, false);

    /* renamed from: f */
    public static final C0864e f3005f = C0871f.f3015a;

    /* renamed from: g */
    private static final int f3006g = 0;

    /* renamed from: h */
    private static final int f3007h = 1;

    /* renamed from: i */
    private static final int f3008i = 2;

    /* renamed from: android.support.v4.n.f$a */
    private static class C0866a implements C0868c {

        /* renamed from: a */
        public static final C0866a f3009a = new C0866a(true);

        /* renamed from: b */
        public static final C0866a f3010b = new C0866a(false);

        /* renamed from: c */
        private final boolean f3011c;

        private C0866a(boolean z) {
            this.f3011c = z;
        }

        /* renamed from: a */
        public int mo2781a(CharSequence charSequence, int i, int i2) {
            int i3 = i + i2;
            boolean z = false;
            while (i < i3) {
                switch (C0865f.m4334a(Character.getDirectionality(charSequence.charAt(i)))) {
                    case 0:
                        if (!this.f3011c) {
                            z = true;
                            break;
                        } else {
                            return 0;
                        }
                    case 1:
                        if (this.f3011c) {
                            z = true;
                            break;
                        } else {
                            return 1;
                        }
                }
                i++;
            }
            if (z) {
                return !this.f3011c ? 0 : 1;
            }
            return 2;
        }
    }

    /* renamed from: android.support.v4.n.f$b */
    private static class C0867b implements C0868c {

        /* renamed from: a */
        public static final C0867b f3012a = new C0867b();

        private C0867b() {
        }

        /* renamed from: a */
        public int mo2781a(CharSequence charSequence, int i, int i2) {
            int i3 = i + i2;
            int i4 = 2;
            while (i < i3 && i4 == 2) {
                i4 = C0865f.m4335b(Character.getDirectionality(charSequence.charAt(i)));
                i++;
            }
            return i4;
        }
    }

    /* renamed from: android.support.v4.n.f$c */
    private interface C0868c {
        /* renamed from: a */
        int mo2781a(CharSequence charSequence, int i, int i2);
    }

    /* renamed from: android.support.v4.n.f$d */
    private static abstract class C0869d implements C0864e {

        /* renamed from: a */
        private final C0868c f3013a;

        public C0869d(C0868c cVar) {
            this.f3013a = cVar;
        }

        /* renamed from: b */
        private boolean m4339b(CharSequence charSequence, int i, int i2) {
            switch (this.f3013a.mo2781a(charSequence, i, i2)) {
                case 0:
                    return true;
                case 1:
                    return false;
                default:
                    return mo2782a();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract boolean mo2782a();

        /* renamed from: a */
        public boolean mo2779a(CharSequence charSequence, int i, int i2) {
            if (charSequence != null && i >= 0 && i2 >= 0 && charSequence.length() - i2 >= i) {
                return this.f3013a == null ? mo2782a() : m4339b(charSequence, i, i2);
            }
            throw new IllegalArgumentException();
        }

        /* renamed from: a */
        public boolean mo2780a(char[] cArr, int i, int i2) {
            return mo2779a((CharSequence) CharBuffer.wrap(cArr), i, i2);
        }
    }

    /* renamed from: android.support.v4.n.f$e */
    private static class C0870e extends C0869d {

        /* renamed from: a */
        private final boolean f3014a;

        C0870e(C0868c cVar, boolean z) {
            super(cVar);
            this.f3014a = z;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo2782a() {
            return this.f3014a;
        }
    }

    /* renamed from: android.support.v4.n.f$f */
    private static class C0871f extends C0869d {

        /* renamed from: a */
        public static final C0871f f3015a = new C0871f();

        public C0871f() {
            super((C0868c) null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo2782a() {
            return C0872g.m4345a(Locale.getDefault()) == 1;
        }
    }

    private C0865f() {
    }

    /* renamed from: a */
    static int m4334a(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
            case 2:
                return 0;
            default:
                return 2;
        }
    }

    /* renamed from: b */
    static int m4335b(int i) {
        switch (i) {
            case 0:
            case 14:
            case 15:
                return 1;
            case 1:
            case 2:
            case 16:
            case 17:
                return 0;
            default:
                return 2;
        }
    }
}
