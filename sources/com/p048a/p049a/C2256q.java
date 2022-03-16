package com.p048a.p049a;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import com.p048a.p049a.p053d.C2010c;
import com.p048a.p049a.p053d.p055b.C1969c;
import com.p048a.p049a.p053d.p060c.C2055l;
import com.p048a.p049a.p053d.p060c.p061a.C2014b;
import com.p048a.p049a.p053d.p060c.p062b.C2025c;
import com.p048a.p049a.p053d.p060c.p062b.C2026d;
import com.p048a.p049a.p053d.p060c.p062b.C2030f;
import com.p048a.p049a.p071e.C2150c;
import com.p048a.p049a.p071e.C2152d;
import com.p048a.p049a.p071e.C2156g;
import com.p048a.p049a.p071e.C2157h;
import com.p048a.p049a.p071e.C2163l;
import com.p048a.p049a.p071e.C2164m;
import com.p048a.p049a.p077i.C2225a;
import com.p048a.p049a.p077i.C2227c;
import com.p048a.p049a.p077i.C2228d;
import com.p048a.p049a.p078j.C2238i;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.UUID;

/* renamed from: com.a.a.q */
public class C2256q implements C2157h {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f7393a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C2156g f7394b;

    /* renamed from: c */
    private final C2163l f7395c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C2164m f7396d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C2243l f7397e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C2262d f7398f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C2258a f7399g;

    /* renamed from: com.a.a.q$a */
    public interface C2258a {
        /* renamed from: a */
        <T> void mo8420a(C2178h<T, ?, ?, ?> hVar);
    }

    /* renamed from: com.a.a.q$b */
    public final class C2259b<A, T> {
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final C2055l<A, T> f7403b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final Class<T> f7404c;

        /* renamed from: com.a.a.q$b$a */
        public final class C2260a {

            /* renamed from: b */
            private final A f7406b;

            /* renamed from: c */
            private final Class<A> f7407c;

            /* renamed from: d */
            private final boolean f7408d;

            C2260a(Class<A> cls) {
                this.f7408d = false;
                this.f7406b = null;
                this.f7407c = cls;
            }

            C2260a(A a) {
                this.f7408d = true;
                this.f7406b = a;
                this.f7407c = C2256q.m12822c(a);
            }

            /* renamed from: a */
            public <Z> C2224i<A, T, Z> mo8423a(Class<Z> cls) {
                C2224i<A, T, Z> iVar = (C2224i) C2256q.this.f7398f.mo8426a(new C2224i(C2256q.this.f7393a, C2256q.this.f7397e, this.f7407c, C2259b.this.f7403b, C2259b.this.f7404c, cls, C2256q.this.f7396d, C2256q.this.f7394b, C2256q.this.f7398f));
                if (this.f7408d) {
                    iVar.mo7619b(this.f7406b);
                }
                return iVar;
            }
        }

        C2259b(C2055l<A, T> lVar, Class<T> cls) {
            this.f7403b = lVar;
            this.f7404c = cls;
        }

        /* renamed from: a */
        public C2259b<A, T>.a mo8421a(Class<A> cls) {
            return new C2260a(cls);
        }

        /* renamed from: a */
        public C2259b<A, T>.a mo8422a(A a) {
            return new C2260a(a);
        }
    }

    /* renamed from: com.a.a.q$c */
    public final class C2261c<T> {

        /* renamed from: b */
        private final C2055l<T, InputStream> f7410b;

        C2261c(C2055l<T, InputStream> lVar) {
            this.f7410b = lVar;
        }

        /* renamed from: a */
        public C2171g<T> mo8424a(Class<T> cls) {
            return (C2171g) C2256q.this.f7398f.mo8426a(new C2171g(cls, this.f7410b, (C2055l) null, C2256q.this.f7393a, C2256q.this.f7397e, C2256q.this.f7396d, C2256q.this.f7394b, C2256q.this.f7398f));
        }

        /* renamed from: a */
        public C2171g<T> mo8425a(T t) {
            return (C2171g) mo8424a(C2256q.m12822c(t)).mo7619b(t);
        }
    }

    /* renamed from: com.a.a.q$d */
    class C2262d {
        C2262d() {
        }

        /* renamed from: a */
        public <A, X extends C2178h<A, ?, ?, ?>> X mo8426a(X x) {
            if (C2256q.this.f7399g != null) {
                C2256q.this.f7399g.mo8420a(x);
            }
            return x;
        }
    }

    /* renamed from: com.a.a.q$e */
    private static class C2263e implements C2150c.C2151a {

        /* renamed from: a */
        private final C2164m f7412a;

        public C2263e(C2164m mVar) {
            this.f7412a = mVar;
        }

        /* renamed from: a */
        public void mo8087a(boolean z) {
            if (z) {
                this.f7412a.mo8123e();
            }
        }
    }

    /* renamed from: com.a.a.q$f */
    public final class C2264f<T> {

        /* renamed from: b */
        private final C2055l<T, ParcelFileDescriptor> f7414b;

        C2264f(C2055l<T, ParcelFileDescriptor> lVar) {
            this.f7414b = lVar;
        }

        /* renamed from: a */
        public C2171g<T> mo8427a(T t) {
            return (C2171g) ((C2171g) C2256q.this.f7398f.mo8426a(new C2171g(C2256q.m12822c(t), (C2055l) null, this.f7414b, C2256q.this.f7393a, C2256q.this.f7397e, C2256q.this.f7396d, C2256q.this.f7394b, C2256q.this.f7398f))).mo7619b(t);
        }
    }

    public C2256q(Context context, C2156g gVar, C2163l lVar) {
        this(context, gVar, lVar, new C2164m(), new C2152d());
    }

    C2256q(Context context, final C2156g gVar, C2163l lVar, C2164m mVar, C2152d dVar) {
        this.f7393a = context.getApplicationContext();
        this.f7394b = gVar;
        this.f7395c = lVar;
        this.f7396d = mVar;
        this.f7397e = C2243l.m12761b(context);
        this.f7398f = new C2262d();
        C2150c a = dVar.mo8088a(context, new C2263e(mVar));
        if (C2238i.m12736d()) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public void run() {
                    gVar.mo8084a(C2256q.this);
                }
            });
        } else {
            gVar.mo8084a(this);
        }
        gVar.mo8084a(a);
    }

    /* renamed from: b */
    private <T> C2171g<T> m12818b(Class<T> cls) {
        C2055l<T, InputStream> a = C2243l.m12744a(cls, this.f7393a);
        C2055l<T, ParcelFileDescriptor> b = C2243l.m12759b(cls, this.f7393a);
        if (cls != null && a == null && b == null) {
            throw new IllegalArgumentException("Unknown type " + cls + ". You must provide a Model of a type for" + " which there is a registered ModelLoader, if you are using a custom model, you must first call" + " Glide#register with a ModelLoaderFactory for your custom model class");
        }
        return (C2171g) this.f7398f.mo8426a(new C2171g(cls, a, b, this.f7393a, this.f7397e, this.f7396d, this.f7394b, this.f7398f));
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static <T> Class<T> m12822c(T t) {
        if (t != null) {
            return t.getClass();
        }
        return null;
    }

    /* renamed from: a */
    public C2171g<Uri> mo8389a(Uri uri) {
        return (C2171g) mo8413k().mo7619b(uri);
    }

    @Deprecated
    /* renamed from: a */
    public C2171g<Uri> mo8390a(Uri uri, String str, long j, int i) {
        return (C2171g) mo8406b(uri).mo7612b((C2010c) new C2227c(str, j, i));
    }

    /* renamed from: a */
    public C2171g<File> mo8391a(File file) {
        return (C2171g) mo8415m().mo7619b(file);
    }

    /* renamed from: a */
    public <T> C2171g<T> mo8392a(Class<T> cls) {
        return m12818b(cls);
    }

    /* renamed from: a */
    public C2171g<Integer> mo8393a(Integer num) {
        return (C2171g) mo8416n().mo7619b(num);
    }

    /* renamed from: a */
    public <T> C2171g<T> mo8394a(T t) {
        return (C2171g) m12818b(m12822c(t)).mo7619b(t);
    }

    /* renamed from: a */
    public C2171g<String> mo8395a(String str) {
        return (C2171g) mo8412j().mo7619b(str);
    }

    @Deprecated
    /* renamed from: a */
    public C2171g<URL> mo8396a(URL url) {
        return (C2171g) mo8417o().mo7619b(url);
    }

    /* renamed from: a */
    public C2171g<byte[]> mo8397a(byte[] bArr) {
        return (C2171g) mo8418p().mo7619b(bArr);
    }

    @Deprecated
    /* renamed from: a */
    public C2171g<byte[]> mo8398a(byte[] bArr, String str) {
        return (C2171g) mo8397a(bArr).mo7612b((C2010c) new C2228d(str));
    }

    /* renamed from: a */
    public <A, T> C2259b<A, T> mo8399a(C2055l<A, T> lVar, Class<T> cls) {
        return new C2259b<>(lVar, cls);
    }

    /* renamed from: a */
    public C2261c<byte[]> mo8400a(C2026d dVar) {
        return new C2261c<>(dVar);
    }

    /* renamed from: a */
    public <T> C2261c<T> mo8401a(C2030f<T> fVar) {
        return new C2261c<>(fVar);
    }

    /* renamed from: a */
    public <T> C2264f<T> mo8402a(C2014b<T> bVar) {
        return new C2264f<>(bVar);
    }

    /* renamed from: a */
    public void mo8403a() {
        this.f7397e.mo8369k();
    }

    /* renamed from: a */
    public void mo8404a(int i) {
        this.f7397e.mo8355a(i);
    }

    /* renamed from: a */
    public void mo8405a(C2258a aVar) {
        this.f7399g = aVar;
    }

    /* renamed from: b */
    public C2171g<Uri> mo8406b(Uri uri) {
        return (C2171g) mo8414l().mo7619b(uri);
    }

    /* renamed from: b */
    public boolean mo8407b() {
        C2238i.m12729a();
        return this.f7396d.mo8117a();
    }

    /* renamed from: c */
    public void mo8408c() {
        C2238i.m12729a();
        this.f7396d.mo8118b();
    }

    /* renamed from: d */
    public void mo8409d() {
        C2238i.m12729a();
        mo8408c();
        for (C2256q c : this.f7395c.mo8093a()) {
            c.mo8408c();
        }
    }

    /* renamed from: e */
    public void mo8410e() {
        C2238i.m12729a();
        this.f7396d.mo8120c();
    }

    /* renamed from: f */
    public void mo8411f() {
        C2238i.m12729a();
        mo8410e();
        for (C2256q e : this.f7395c.mo8093a()) {
            e.mo8410e();
        }
    }

    /* renamed from: g */
    public void mo8089g() {
        mo8410e();
    }

    /* renamed from: h */
    public void mo8090h() {
        mo8408c();
    }

    /* renamed from: i */
    public void mo8091i() {
        this.f7396d.mo8122d();
    }

    /* renamed from: j */
    public C2171g<String> mo8412j() {
        return m12818b(String.class);
    }

    /* renamed from: k */
    public C2171g<Uri> mo8413k() {
        return m12818b(Uri.class);
    }

    /* renamed from: l */
    public C2171g<Uri> mo8414l() {
        return (C2171g) this.f7398f.mo8426a(new C2171g(Uri.class, new C2025c(this.f7393a, C2243l.m12744a(Uri.class, this.f7393a)), C2243l.m12759b(Uri.class, this.f7393a), this.f7393a, this.f7397e, this.f7396d, this.f7394b, this.f7398f));
    }

    /* renamed from: m */
    public C2171g<File> mo8415m() {
        return m12818b(File.class);
    }

    /* renamed from: n */
    public C2171g<Integer> mo8416n() {
        return (C2171g) m12818b(Integer.class).mo7612b(C2225a.m12610a(this.f7393a));
    }

    @Deprecated
    /* renamed from: o */
    public C2171g<URL> mo8417o() {
        return m12818b(URL.class);
    }

    /* renamed from: p */
    public C2171g<byte[]> mo8418p() {
        return (C2171g) m12818b(byte[].class).mo7612b((C2010c) new C2228d(UUID.randomUUID().toString())).mo7610b(C1969c.NONE).mo7620b(true);
    }
}
