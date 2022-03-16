package android.support.p010v4.p020g.p022b;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.support.annotation.C0003aa;
import android.support.annotation.C0047z;
import android.support.p010v4.p020g.p022b.C0532b;
import android.support.p010v4.p028k.C0799d;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* renamed from: android.support.v4.g.b.a */
public final class C0524a {

    /* renamed from: a */
    static final C0530e f2099a;

    /* renamed from: b */
    private Context f2100b;

    /* renamed from: android.support.v4.g.b.a$a */
    private static class C0525a implements C0530e {
        /* renamed from: a */
        static C0529d m2733a(C0532b.C0536c cVar) {
            if (cVar == null) {
                return null;
            }
            if (cVar.mo1928b() != null) {
                return new C0529d(cVar.mo1928b());
            }
            if (cVar.mo1927a() != null) {
                return new C0529d(cVar.mo1927a());
            }
            if (cVar.mo1929c() != null) {
                return new C0529d(cVar.mo1929c());
            }
            return null;
        }

        /* renamed from: a */
        private static C0532b.C0534a m2734a(final C0527b bVar) {
            return new C0532b.C0534a() {
                /* renamed from: a */
                public void mo1910a() {
                    bVar.mo1914a();
                }

                /* renamed from: a */
                public void mo1911a(int i, CharSequence charSequence) {
                    bVar.mo1915a(i, charSequence);
                }

                /* renamed from: a */
                public void mo1912a(C0532b.C0535b bVar) {
                    bVar.mo1916a(new C0528c(C0525a.m2733a(bVar.mo1926a())));
                }

                /* renamed from: b */
                public void mo1913b(int i, CharSequence charSequence) {
                    bVar.mo1917b(i, charSequence);
                }
            };
        }

        /* renamed from: a */
        private static C0532b.C0536c m2735a(C0529d dVar) {
            if (dVar == null) {
                return null;
            }
            if (dVar.mo1920b() != null) {
                return new C0532b.C0536c(dVar.mo1920b());
            }
            if (dVar.mo1919a() != null) {
                return new C0532b.C0536c(dVar.mo1919a());
            }
            if (dVar.mo1921c() != null) {
                return new C0532b.C0536c(dVar.mo1921c());
            }
            return null;
        }

        /* renamed from: a */
        public void mo1907a(Context context, C0529d dVar, int i, C0799d dVar2, C0527b bVar, Handler handler) {
            C0532b.m2760a(context, m2735a(dVar), i, dVar2 != null ? dVar2.mo2670d() : null, m2734a(bVar), handler);
        }

        /* renamed from: a */
        public boolean mo1908a(Context context) {
            return C0532b.m2761a(context);
        }

        /* renamed from: b */
        public boolean mo1909b(Context context) {
            return C0532b.m2763b(context);
        }
    }

    /* renamed from: android.support.v4.g.b.a$b */
    public static abstract class C0527b {
        /* renamed from: a */
        public void mo1914a() {
        }

        /* renamed from: a */
        public void mo1915a(int i, CharSequence charSequence) {
        }

        /* renamed from: a */
        public void mo1916a(C0528c cVar) {
        }

        /* renamed from: b */
        public void mo1917b(int i, CharSequence charSequence) {
        }
    }

    /* renamed from: android.support.v4.g.b.a$c */
    public static final class C0528c {

        /* renamed from: a */
        private C0529d f2102a;

        public C0528c(C0529d dVar) {
            this.f2102a = dVar;
        }

        /* renamed from: a */
        public C0529d mo1918a() {
            return this.f2102a;
        }
    }

    /* renamed from: android.support.v4.g.b.a$d */
    public static class C0529d {

        /* renamed from: a */
        private final Signature f2103a;

        /* renamed from: b */
        private final Cipher f2104b;

        /* renamed from: c */
        private final Mac f2105c;

        public C0529d(Signature signature) {
            this.f2103a = signature;
            this.f2104b = null;
            this.f2105c = null;
        }

        public C0529d(Cipher cipher) {
            this.f2104b = cipher;
            this.f2103a = null;
            this.f2105c = null;
        }

        public C0529d(Mac mac) {
            this.f2105c = mac;
            this.f2104b = null;
            this.f2103a = null;
        }

        /* renamed from: a */
        public Signature mo1919a() {
            return this.f2103a;
        }

        /* renamed from: b */
        public Cipher mo1920b() {
            return this.f2104b;
        }

        /* renamed from: c */
        public Mac mo1921c() {
            return this.f2105c;
        }
    }

    /* renamed from: android.support.v4.g.b.a$e */
    private interface C0530e {
        /* renamed from: a */
        void mo1907a(Context context, C0529d dVar, int i, C0799d dVar2, C0527b bVar, Handler handler);

        /* renamed from: a */
        boolean mo1908a(Context context);

        /* renamed from: b */
        boolean mo1909b(Context context);
    }

    /* renamed from: android.support.v4.g.b.a$f */
    private static class C0531f implements C0530e {
        /* renamed from: a */
        public void mo1907a(Context context, C0529d dVar, int i, C0799d dVar2, C0527b bVar, Handler handler) {
        }

        /* renamed from: a */
        public boolean mo1908a(Context context) {
            return false;
        }

        /* renamed from: b */
        public boolean mo1909b(Context context) {
            return false;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 23) {
            f2099a = new C0525a();
        } else {
            f2099a = new C0531f();
        }
    }

    private C0524a(Context context) {
        this.f2100b = context;
    }

    /* renamed from: a */
    public static C0524a m2729a(Context context) {
        return new C0524a(context);
    }

    /* renamed from: a */
    public void mo1904a(@C0003aa C0529d dVar, int i, @C0003aa C0799d dVar2, @C0047z C0527b bVar, @C0003aa Handler handler) {
        f2099a.mo1907a(this.f2100b, dVar, i, dVar2, bVar, handler);
    }

    /* renamed from: a */
    public boolean mo1905a() {
        return f2099a.mo1908a(this.f2100b);
    }

    /* renamed from: b */
    public boolean mo1906b() {
        return f2099a.mo1909b(this.f2100b);
    }
}
