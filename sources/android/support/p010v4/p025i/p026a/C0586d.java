package android.support.p010v4.p025i.p026a;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.annotation.C0020ao;
import android.support.p010v4.p013c.C0360ce;
import android.support.p010v4.p013c.C0411y;
import android.support.p010v4.p025i.C0732k;
import android.support.p010v4.p025i.C0739n;
import android.support.p010v4.p025i.C0749q;
import android.support.p010v4.p025i.p026a.C0579a;
import android.support.p010v4.p025i.p026a.C0582b;
import android.support.p010v4.p025i.p026a.C0609e;
import android.support.p010v4.p025i.p026a.C0614f;
import android.support.p010v4.p025i.p026a.C0616g;
import android.support.p010v4.p025i.p026a.C0618h;
import android.support.p010v4.p025i.p026a.C0662q;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: android.support.v4.i.a.d */
public final class C0586d {

    /* renamed from: a */
    static final String f2276a = "MediaControllerCompat";

    /* renamed from: b */
    static final String f2277b = "android.support.v4.media.session.command.GET_EXTRA_BINDER";

    /* renamed from: c */
    static final String f2278c = "android.support.v4.media.session.command.ADD_QUEUE_ITEM";

    /* renamed from: d */
    static final String f2279d = "android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT";

    /* renamed from: e */
    static final String f2280e = "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM";

    /* renamed from: f */
    static final String f2281f = "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT";

    /* renamed from: g */
    static final String f2282g = "android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION";

    /* renamed from: h */
    static final String f2283h = "android.support.v4.media.session.command.ARGUMENT_INDEX";

    /* renamed from: i */
    private final C0592c f2284i;

    /* renamed from: j */
    private final C0618h.C0640i f2285j;

    /* renamed from: android.support.v4.i.a.d$a */
    public static abstract class C0587a implements IBinder.DeathRecipient {

        /* renamed from: a */
        C0588a f2286a;

        /* renamed from: b */
        boolean f2287b;

        /* renamed from: c */
        boolean f2288c = false;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final Object f2289d;

        /* renamed from: android.support.v4.i.a.d$a$a */
        private class C0588a extends Handler {

            /* renamed from: b */
            private static final int f2290b = 1;

            /* renamed from: c */
            private static final int f2291c = 2;

            /* renamed from: d */
            private static final int f2292d = 3;

            /* renamed from: e */
            private static final int f2293e = 4;

            /* renamed from: f */
            private static final int f2294f = 5;

            /* renamed from: g */
            private static final int f2295g = 6;

            /* renamed from: h */
            private static final int f2296h = 7;

            /* renamed from: i */
            private static final int f2297i = 8;

            /* renamed from: j */
            private static final int f2298j = 9;

            /* renamed from: k */
            private static final int f2299k = 10;

            public C0588a(Looper looper) {
                super(looper);
            }

            /* renamed from: a */
            public void mo2140a(int i, Object obj, Bundle bundle) {
                Message obtainMessage = obtainMessage(i, obj);
                obtainMessage.setData(bundle);
                obtainMessage.sendToTarget();
            }

            public void handleMessage(Message message) {
                if (C0587a.this.f2288c) {
                    switch (message.what) {
                        case 1:
                            C0587a.this.mo2136a((String) message.obj, message.getData());
                            return;
                        case 2:
                            C0587a.this.mo2133a((C0662q) message.obj);
                            return;
                        case 3:
                            C0587a.this.mo2134a((C0739n) message.obj);
                            return;
                        case 4:
                            C0587a.this.mo2132a((C0603h) message.obj);
                            return;
                        case 5:
                            C0587a.this.mo2137a((List<C0618h.C0635f>) (List) message.obj);
                            return;
                        case 6:
                            C0587a.this.mo2135a((CharSequence) message.obj);
                            return;
                        case 7:
                            C0587a.this.mo2131a((Bundle) message.obj);
                            return;
                        case 8:
                            C0587a.this.mo2129a();
                            return;
                        case 9:
                            C0587a.this.mo2130a(((Integer) message.obj).intValue());
                            return;
                        case 10:
                            C0587a.this.mo2138a(((Boolean) message.obj).booleanValue());
                            return;
                        default:
                            return;
                    }
                }
            }
        }

        /* renamed from: android.support.v4.i.a.d$a$b */
        private class C0589b implements C0609e.C0610a {
            C0589b() {
            }

            /* renamed from: a */
            public void mo2142a() {
                C0587a.this.mo2129a();
            }

            /* renamed from: a */
            public void mo2143a(int i, int i2, int i3, int i4, int i5) {
                C0587a.this.mo2132a(new C0603h(i, i2, i3, i4, i5));
            }

            /* renamed from: a */
            public void mo2144a(Bundle bundle) {
                C0587a.this.mo2131a(bundle);
            }

            /* renamed from: a */
            public void mo2145a(CharSequence charSequence) {
                C0587a.this.mo2135a(charSequence);
            }

            /* renamed from: a */
            public void mo2146a(Object obj) {
                if (!C0587a.this.f2287b) {
                    C0587a.this.mo2133a(C0662q.m3641a(obj));
                }
            }

            /* renamed from: a */
            public void mo2147a(String str, Bundle bundle) {
                if (!C0587a.this.f2287b || Build.VERSION.SDK_INT >= 23) {
                    C0587a.this.mo2136a(str, bundle);
                }
            }

            /* renamed from: a */
            public void mo2148a(List<?> list) {
                C0587a.this.mo2137a(C0618h.C0635f.m3555a(list));
            }

            /* renamed from: b */
            public void mo2149b(Object obj) {
                C0587a.this.mo2134a(C0739n.m3865a(obj));
            }
        }

        /* renamed from: android.support.v4.i.a.d$a$c */
        private class C0590c extends C0579a.C0580a {
            C0590c() {
            }

            /* renamed from: a */
            public void mo2039a() {
                C0587a.this.f2286a.mo2140a(8, (Object) null, (Bundle) null);
            }

            /* renamed from: a */
            public void mo2040a(int i) {
                C0587a.this.f2286a.mo2140a(9, Integer.valueOf(i), (Bundle) null);
            }

            /* renamed from: a */
            public void mo2041a(Bundle bundle) {
                C0587a.this.f2286a.mo2140a(7, bundle, (Bundle) null);
            }

            /* renamed from: a */
            public void mo2042a(C0660p pVar) {
                C0587a.this.f2286a.mo2140a(4, pVar != null ? new C0603h(pVar.f2497a, pVar.f2498b, pVar.f2499c, pVar.f2500d, pVar.f2501e) : null, (Bundle) null);
            }

            /* renamed from: a */
            public void mo2043a(C0662q qVar) {
                C0587a.this.f2286a.mo2140a(2, qVar, (Bundle) null);
            }

            /* renamed from: a */
            public void mo2044a(C0739n nVar) {
                C0587a.this.f2286a.mo2140a(3, nVar, (Bundle) null);
            }

            /* renamed from: a */
            public void mo2045a(CharSequence charSequence) {
                C0587a.this.f2286a.mo2140a(6, charSequence, (Bundle) null);
            }

            /* renamed from: a */
            public void mo2046a(String str, Bundle bundle) {
                C0587a.this.f2286a.mo2140a(1, str, bundle);
            }

            /* renamed from: a */
            public void mo2047a(List<C0618h.C0635f> list) {
                C0587a.this.f2286a.mo2140a(5, list, (Bundle) null);
            }

            /* renamed from: a */
            public void mo2048a(boolean z) {
                C0587a.this.f2286a.mo2140a(10, Boolean.valueOf(z), (Bundle) null);
            }
        }

        public C0587a() {
            if (Build.VERSION.SDK_INT >= 21) {
                this.f2289d = C0609e.m3241a((C0609e.C0610a) new C0589b());
            } else {
                this.f2289d = new C0590c();
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m3044a(Handler handler) {
            this.f2286a = new C0588a(handler.getLooper());
        }

        /* renamed from: a */
        public void mo2129a() {
        }

        /* renamed from: a */
        public void mo2130a(int i) {
        }

        /* renamed from: a */
        public void mo2131a(Bundle bundle) {
        }

        /* renamed from: a */
        public void mo2132a(C0603h hVar) {
        }

        /* renamed from: a */
        public void mo2133a(C0662q qVar) {
        }

        /* renamed from: a */
        public void mo2134a(C0739n nVar) {
        }

        /* renamed from: a */
        public void mo2135a(CharSequence charSequence) {
        }

        /* renamed from: a */
        public void mo2136a(String str, Bundle bundle) {
        }

        /* renamed from: a */
        public void mo2137a(List<C0618h.C0635f> list) {
        }

        /* renamed from: a */
        public void mo2138a(boolean z) {
        }

        public void binderDied() {
            mo2129a();
        }
    }

    /* renamed from: android.support.v4.i.a.d$b */
    private static class C0591b extends C0360ce.C0361a {

        /* renamed from: a */
        private final C0586d f2303a;

        C0591b(C0586d dVar) {
            this.f2303a = dVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0586d mo2150a() {
            return this.f2303a;
        }
    }

    /* renamed from: android.support.v4.i.a.d$c */
    interface C0592c {
        /* renamed from: a */
        C0604i mo2151a();

        /* renamed from: a */
        void mo2152a(int i);

        /* renamed from: a */
        void mo2153a(int i, int i2);

        /* renamed from: a */
        void mo2154a(C0587a aVar);

        /* renamed from: a */
        void mo2155a(C0587a aVar, Handler handler);

        /* renamed from: a */
        void mo2156a(C0732k kVar);

        /* renamed from: a */
        void mo2157a(C0732k kVar, int i);

        /* renamed from: a */
        void mo2158a(String str, Bundle bundle, ResultReceiver resultReceiver);

        /* renamed from: a */
        boolean mo2159a(KeyEvent keyEvent);

        /* renamed from: b */
        C0662q mo2160b();

        /* renamed from: b */
        void mo2161b(int i, int i2);

        /* renamed from: b */
        void mo2162b(C0732k kVar);

        /* renamed from: c */
        C0739n mo2163c();

        /* renamed from: d */
        List<C0618h.C0635f> mo2164d();

        /* renamed from: e */
        CharSequence mo2165e();

        /* renamed from: f */
        Bundle mo2166f();

        /* renamed from: g */
        int mo2167g();

        /* renamed from: h */
        int mo2168h();

        /* renamed from: i */
        boolean mo2169i();

        /* renamed from: j */
        long mo2170j();

        /* renamed from: k */
        C0603h mo2171k();

        /* renamed from: l */
        PendingIntent mo2172l();

        /* renamed from: m */
        String mo2173m();

        /* renamed from: n */
        Object mo2174n();
    }

    /* renamed from: android.support.v4.i.a.d$d */
    static class C0593d implements C0592c {

        /* renamed from: a */
        protected final Object f2304a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public C0582b f2305b;

        /* renamed from: c */
        private HashMap<C0587a, C0595b> f2306c = new HashMap<>();

        /* renamed from: d */
        private List<C0587a> f2307d = new ArrayList();

        /* renamed from: android.support.v4.i.a.d$d$a */
        private static class C0594a extends ResultReceiver {

            /* renamed from: a */
            private WeakReference<C0593d> f2308a;

            public C0594a(C0593d dVar, Handler handler) {
                super(handler);
                this.f2308a = new WeakReference<>(dVar);
            }

            /* access modifiers changed from: protected */
            public void onReceiveResult(int i, Bundle bundle) {
                C0593d dVar = (C0593d) this.f2308a.get();
                if (dVar != null && bundle != null) {
                    C0582b unused = dVar.f2305b = C0582b.C0583a.m2964a(C0411y.m2301a(bundle, "android.support.v4.media.session.EXTRA_BINDER"));
                    dVar.m3104p();
                }
            }
        }

        /* renamed from: android.support.v4.i.a.d$d$b */
        private class C0595b extends C0579a.C0580a {
            /* access modifiers changed from: private */

            /* renamed from: l */
            public C0587a f2310l;

            C0595b(C0587a aVar) {
                this.f2310l = aVar;
            }

            /* renamed from: a */
            public void mo2039a() {
                throw new AssertionError();
            }

            /* renamed from: a */
            public void mo2040a(final int i) {
                this.f2310l.f2286a.post(new Runnable() {
                    public void run() {
                        C0595b.this.f2310l.mo2130a(i);
                    }
                });
            }

            /* renamed from: a */
            public void mo2041a(Bundle bundle) {
                throw new AssertionError();
            }

            /* renamed from: a */
            public void mo2042a(C0660p pVar) {
                throw new AssertionError();
            }

            /* renamed from: a */
            public void mo2043a(final C0662q qVar) {
                this.f2310l.f2286a.post(new Runnable() {
                    public void run() {
                        C0595b.this.f2310l.mo2133a(qVar);
                    }
                });
            }

            /* renamed from: a */
            public void mo2044a(C0739n nVar) {
                throw new AssertionError();
            }

            /* renamed from: a */
            public void mo2045a(CharSequence charSequence) {
                throw new AssertionError();
            }

            /* renamed from: a */
            public void mo2046a(final String str, final Bundle bundle) {
                this.f2310l.f2286a.post(new Runnable() {
                    public void run() {
                        C0595b.this.f2310l.mo2136a(str, bundle);
                    }
                });
            }

            /* renamed from: a */
            public void mo2047a(List<C0618h.C0635f> list) {
                throw new AssertionError();
            }

            /* renamed from: a */
            public void mo2048a(final boolean z) {
                this.f2310l.f2286a.post(new Runnable() {
                    public void run() {
                        C0595b.this.f2310l.mo2138a(z);
                    }
                });
            }
        }

        public C0593d(Context context, C0618h.C0640i iVar) {
            this.f2304a = C0609e.m3240a(context, iVar.mo2341a());
            if (this.f2304a == null) {
                throw new RemoteException();
            }
            m3103o();
        }

        public C0593d(Context context, C0618h hVar) {
            this.f2304a = C0609e.m3240a(context, hVar.mo2233c().mo2341a());
            m3103o();
        }

        /* renamed from: o */
        private void m3103o() {
            mo2158a(C0586d.f2277b, (Bundle) null, new C0594a(this, new Handler()));
        }

        /* access modifiers changed from: private */
        /* renamed from: p */
        public void m3104p() {
            if (this.f2305b != null) {
                synchronized (this.f2307d) {
                    for (C0587a next : this.f2307d) {
                        C0595b bVar = new C0595b(next);
                        this.f2306c.put(next, bVar);
                        next.f2287b = true;
                        try {
                            this.f2305b.mo2057a((C0579a) bVar);
                        } catch (RemoteException e) {
                            Log.e(C0586d.f2276a, "Dead object in registerCallback.", e);
                        }
                    }
                    this.f2307d.clear();
                }
            }
        }

        /* renamed from: a */
        public C0604i mo2151a() {
            Object b = C0609e.m3249b(this.f2304a);
            if (b != null) {
                return new C0605j(b);
            }
            return null;
        }

        /* renamed from: a */
        public void mo2152a(int i) {
            if ((mo2170j() & 4) == 0) {
                throw new UnsupportedOperationException("This session doesn't support queue management operations");
            }
            Bundle bundle = new Bundle();
            bundle.putInt(C0586d.f2283h, i);
            mo2158a(C0586d.f2281f, bundle, (ResultReceiver) null);
        }

        /* renamed from: a */
        public void mo2153a(int i, int i2) {
            C0609e.m3244a(this.f2304a, i, i2);
        }

        /* renamed from: a */
        public final void mo2154a(C0587a aVar) {
            C0609e.m3245a(this.f2304a, aVar.f2289d);
            if (this.f2305b != null) {
                try {
                    C0595b remove = this.f2306c.remove(aVar);
                    if (remove != null) {
                        this.f2305b.mo2071b((C0579a) remove);
                    }
                } catch (RemoteException e) {
                    Log.e(C0586d.f2276a, "Dead object in unregisterCallback.", e);
                }
            } else {
                synchronized (this.f2307d) {
                    this.f2307d.remove(aVar);
                }
            }
        }

        /* renamed from: a */
        public final void mo2155a(C0587a aVar, Handler handler) {
            C0609e.m3246a(this.f2304a, aVar.f2289d, handler);
            if (this.f2305b != null) {
                aVar.m3044a(handler);
                C0595b bVar = new C0595b(aVar);
                this.f2306c.put(aVar, bVar);
                aVar.f2287b = true;
                try {
                    this.f2305b.mo2057a((C0579a) bVar);
                } catch (RemoteException e) {
                    Log.e(C0586d.f2276a, "Dead object in registerCallback.", e);
                }
            } else {
                aVar.m3044a(handler);
                synchronized (this.f2307d) {
                    this.f2307d.add(aVar);
                }
            }
        }

        /* renamed from: a */
        public void mo2156a(C0732k kVar) {
            if ((mo2170j() & 4) == 0) {
                throw new UnsupportedOperationException("This session doesn't support queue management operations");
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable(C0586d.f2282g, kVar);
            mo2158a(C0586d.f2278c, bundle, (ResultReceiver) null);
        }

        /* renamed from: a */
        public void mo2157a(C0732k kVar, int i) {
            if ((mo2170j() & 4) == 0) {
                throw new UnsupportedOperationException("This session doesn't support queue management operations");
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable(C0586d.f2282g, kVar);
            bundle.putInt(C0586d.f2283h, i);
            mo2158a(C0586d.f2279d, bundle, (ResultReceiver) null);
        }

        /* renamed from: a */
        public void mo2158a(String str, Bundle bundle, ResultReceiver resultReceiver) {
            C0609e.m3247a(this.f2304a, str, bundle, resultReceiver);
        }

        /* renamed from: a */
        public boolean mo2159a(KeyEvent keyEvent) {
            return C0609e.m3248a(this.f2304a, keyEvent);
        }

        /* renamed from: b */
        public C0662q mo2160b() {
            if (this.f2305b != null) {
                try {
                    return this.f2305b.mo2082h();
                } catch (RemoteException e) {
                    Log.e(C0586d.f2276a, "Dead object in getPlaybackState.", e);
                }
            }
            Object c = C0609e.m3251c(this.f2304a);
            if (c != null) {
                return C0662q.m3641a(c);
            }
            return null;
        }

        /* renamed from: b */
        public void mo2161b(int i, int i2) {
            C0609e.m3250b(this.f2304a, i, i2);
        }

        /* renamed from: b */
        public void mo2162b(C0732k kVar) {
            if ((mo2170j() & 4) == 0) {
                throw new UnsupportedOperationException("This session doesn't support queue management operations");
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable(C0586d.f2282g, kVar);
            mo2158a(C0586d.f2280e, bundle, (ResultReceiver) null);
        }

        /* renamed from: c */
        public C0739n mo2163c() {
            Object d = C0609e.m3252d(this.f2304a);
            if (d != null) {
                return C0739n.m3865a(d);
            }
            return null;
        }

        /* renamed from: d */
        public List<C0618h.C0635f> mo2164d() {
            List<Object> e = C0609e.m3253e(this.f2304a);
            if (e != null) {
                return C0618h.C0635f.m3555a((List<?>) e);
            }
            return null;
        }

        /* renamed from: e */
        public CharSequence mo2165e() {
            return C0609e.m3254f(this.f2304a);
        }

        /* renamed from: f */
        public Bundle mo2166f() {
            return C0609e.m3255g(this.f2304a);
        }

        /* renamed from: g */
        public int mo2167g() {
            if (Build.VERSION.SDK_INT < 22 && this.f2305b != null) {
                try {
                    return this.f2305b.mo2086l();
                } catch (RemoteException e) {
                    Log.e(C0586d.f2276a, "Dead object in getRatingType.", e);
                }
            }
            return C0609e.m3256h(this.f2304a);
        }

        /* renamed from: h */
        public int mo2168h() {
            if (this.f2305b != null) {
                try {
                    return this.f2305b.mo2087m();
                } catch (RemoteException e) {
                    Log.e(C0586d.f2276a, "Dead object in getRepeatMode.", e);
                }
            }
            return 0;
        }

        /* renamed from: i */
        public boolean mo2169i() {
            if (this.f2305b != null) {
                try {
                    return this.f2305b.mo2088n();
                } catch (RemoteException e) {
                    Log.e(C0586d.f2276a, "Dead object in isShuffleModeEnabled.", e);
                }
            }
            return false;
        }

        /* renamed from: j */
        public long mo2170j() {
            return C0609e.m3257i(this.f2304a);
        }

        /* renamed from: k */
        public C0603h mo2171k() {
            Object j = C0609e.m3258j(this.f2304a);
            if (j != null) {
                return new C0603h(C0609e.C0612c.m3270a(j), C0609e.C0612c.m3272c(j), C0609e.C0612c.m3273d(j), C0609e.C0612c.m3274e(j), C0609e.C0612c.m3275f(j));
            }
            return null;
        }

        /* renamed from: l */
        public PendingIntent mo2172l() {
            return C0609e.m3259k(this.f2304a);
        }

        /* renamed from: m */
        public String mo2173m() {
            return C0609e.m3260l(this.f2304a);
        }

        /* renamed from: n */
        public Object mo2174n() {
            return this.f2304a;
        }
    }

    /* renamed from: android.support.v4.i.a.d$e */
    static class C0600e extends C0593d {
        public C0600e(Context context, C0618h.C0640i iVar) {
            super(context, iVar);
        }

        public C0600e(Context context, C0618h hVar) {
            super(context, hVar);
        }

        /* renamed from: a */
        public C0604i mo2151a() {
            Object b = C0609e.m3249b(this.f2304a);
            if (b != null) {
                return new C0606k(b);
            }
            return null;
        }
    }

    /* renamed from: android.support.v4.i.a.d$f */
    static class C0601f extends C0600e {
        public C0601f(Context context, C0618h.C0640i iVar) {
            super(context, iVar);
        }

        public C0601f(Context context, C0618h hVar) {
            super(context, hVar);
        }

        /* renamed from: a */
        public C0604i mo2151a() {
            Object b = C0609e.m3249b(this.f2304a);
            if (b != null) {
                return new C0607l(b);
            }
            return null;
        }
    }

    /* renamed from: android.support.v4.i.a.d$g */
    static class C0602g implements C0592c {

        /* renamed from: a */
        private C0618h.C0640i f2320a;

        /* renamed from: b */
        private C0582b f2321b;

        /* renamed from: c */
        private C0604i f2322c;

        public C0602g(C0618h.C0640i iVar) {
            this.f2320a = iVar;
            this.f2321b = C0582b.C0583a.m2964a((IBinder) iVar.mo2341a());
        }

        /* renamed from: a */
        public C0604i mo2151a() {
            if (this.f2322c == null) {
                this.f2322c = new C0608m(this.f2321b);
            }
            return this.f2322c;
        }

        /* renamed from: a */
        public void mo2152a(int i) {
            try {
                if ((this.f2321b.mo2078e() & 4) == 0) {
                    throw new UnsupportedOperationException("This session doesn't support queue management operations");
                }
                this.f2321b.mo2053a(i);
            } catch (RemoteException e) {
                Log.e(C0586d.f2276a, "Dead object in removeQueueItemAt.", e);
            }
        }

        /* renamed from: a */
        public void mo2153a(int i, int i2) {
            try {
                this.f2321b.mo2068b(i, i2, (String) null);
            } catch (RemoteException e) {
                Log.e(C0586d.f2276a, "Dead object in setVolumeTo.", e);
            }
        }

        /* renamed from: a */
        public void mo2154a(C0587a aVar) {
            if (aVar == null) {
                throw new IllegalArgumentException("callback may not be null.");
            }
            try {
                this.f2321b.mo2071b((C0579a) aVar.f2289d);
                this.f2321b.asBinder().unlinkToDeath(aVar, 0);
                aVar.f2288c = false;
            } catch (RemoteException e) {
                Log.e(C0586d.f2276a, "Dead object in unregisterCallback.", e);
            }
        }

        /* renamed from: a */
        public void mo2155a(C0587a aVar, Handler handler) {
            if (aVar == null) {
                throw new IllegalArgumentException("callback may not be null.");
            }
            try {
                this.f2321b.asBinder().linkToDeath(aVar, 0);
                this.f2321b.mo2057a((C0579a) aVar.f2289d);
                aVar.m3044a(handler);
                aVar.f2288c = true;
            } catch (RemoteException e) {
                Log.e(C0586d.f2276a, "Dead object in registerCallback.", e);
                aVar.mo2129a();
            }
        }

        /* renamed from: a */
        public void mo2156a(C0732k kVar) {
            try {
                if ((this.f2321b.mo2078e() & 4) == 0) {
                    throw new UnsupportedOperationException("This session doesn't support queue management operations");
                }
                this.f2321b.mo2058a(kVar);
            } catch (RemoteException e) {
                Log.e(C0586d.f2276a, "Dead object in addQueueItem.", e);
            }
        }

        /* renamed from: a */
        public void mo2157a(C0732k kVar, int i) {
            try {
                if ((this.f2321b.mo2078e() & 4) == 0) {
                    throw new UnsupportedOperationException("This session doesn't support queue management operations");
                }
                this.f2321b.mo2059a(kVar, i);
            } catch (RemoteException e) {
                Log.e(C0586d.f2276a, "Dead object in addQueueItemAt.", e);
            }
        }

        /* renamed from: a */
        public void mo2158a(String str, Bundle bundle, ResultReceiver resultReceiver) {
            try {
                this.f2321b.mo2062a(str, bundle, new C0618h.C0637g(resultReceiver));
            } catch (RemoteException e) {
                Log.e(C0586d.f2276a, "Dead object in sendCommand.", e);
            }
        }

        /* renamed from: a */
        public boolean mo2159a(KeyEvent keyEvent) {
            if (keyEvent == null) {
                throw new IllegalArgumentException("event may not be null.");
            }
            try {
                this.f2321b.mo2065a(keyEvent);
                return false;
            } catch (RemoteException e) {
                Log.e(C0586d.f2276a, "Dead object in dispatchMediaButtonEvent.", e);
                return false;
            }
        }

        /* renamed from: b */
        public C0662q mo2160b() {
            try {
                return this.f2321b.mo2082h();
            } catch (RemoteException e) {
                Log.e(C0586d.f2276a, "Dead object in getPlaybackState.", e);
                return null;
            }
        }

        /* renamed from: b */
        public void mo2161b(int i, int i2) {
            try {
                this.f2321b.mo2054a(i, i2, (String) null);
            } catch (RemoteException e) {
                Log.e(C0586d.f2276a, "Dead object in adjustVolume.", e);
            }
        }

        /* renamed from: b */
        public void mo2162b(C0732k kVar) {
            try {
                if ((this.f2321b.mo2078e() & 4) == 0) {
                    throw new UnsupportedOperationException("This session doesn't support queue management operations");
                }
                this.f2321b.mo2072b(kVar);
            } catch (RemoteException e) {
                Log.e(C0586d.f2276a, "Dead object in removeQueueItem.", e);
            }
        }

        /* renamed from: c */
        public C0739n mo2163c() {
            try {
                return this.f2321b.mo2081g();
            } catch (RemoteException e) {
                Log.e(C0586d.f2276a, "Dead object in getMetadata.", e);
                return null;
            }
        }

        /* renamed from: d */
        public List<C0618h.C0635f> mo2164d() {
            try {
                return this.f2321b.mo2083i();
            } catch (RemoteException e) {
                Log.e(C0586d.f2276a, "Dead object in getQueue.", e);
                return null;
            }
        }

        /* renamed from: e */
        public CharSequence mo2165e() {
            try {
                return this.f2321b.mo2084j();
            } catch (RemoteException e) {
                Log.e(C0586d.f2276a, "Dead object in getQueueTitle.", e);
                return null;
            }
        }

        /* renamed from: f */
        public Bundle mo2166f() {
            try {
                return this.f2321b.mo2085k();
            } catch (RemoteException e) {
                Log.e(C0586d.f2276a, "Dead object in getExtras.", e);
                return null;
            }
        }

        /* renamed from: g */
        public int mo2167g() {
            try {
                return this.f2321b.mo2086l();
            } catch (RemoteException e) {
                Log.e(C0586d.f2276a, "Dead object in getRatingType.", e);
                return 0;
            }
        }

        /* renamed from: h */
        public int mo2168h() {
            try {
                return this.f2321b.mo2087m();
            } catch (RemoteException e) {
                Log.e(C0586d.f2276a, "Dead object in getRepeatMode.", e);
                return 0;
            }
        }

        /* renamed from: i */
        public boolean mo2169i() {
            try {
                return this.f2321b.mo2088n();
            } catch (RemoteException e) {
                Log.e(C0586d.f2276a, "Dead object in isShuffleModeEnabled.", e);
                return false;
            }
        }

        /* renamed from: j */
        public long mo2170j() {
            try {
                return this.f2321b.mo2078e();
            } catch (RemoteException e) {
                Log.e(C0586d.f2276a, "Dead object in getFlags.", e);
                return 0;
            }
        }

        /* renamed from: k */
        public C0603h mo2171k() {
            try {
                C0660p f = this.f2321b.mo2080f();
                return new C0603h(f.f2497a, f.f2498b, f.f2499c, f.f2500d, f.f2501e);
            } catch (RemoteException e) {
                Log.e(C0586d.f2276a, "Dead object in getPlaybackInfo.", e);
                return null;
            }
        }

        /* renamed from: l */
        public PendingIntent mo2172l() {
            try {
                return this.f2321b.mo2076d();
            } catch (RemoteException e) {
                Log.e(C0586d.f2276a, "Dead object in getSessionActivity.", e);
                return null;
            }
        }

        /* renamed from: m */
        public String mo2173m() {
            try {
                return this.f2321b.mo2066b();
            } catch (RemoteException e) {
                Log.e(C0586d.f2276a, "Dead object in getPackageName.", e);
                return null;
            }
        }

        /* renamed from: n */
        public Object mo2174n() {
            return null;
        }
    }

    /* renamed from: android.support.v4.i.a.d$h */
    public static final class C0603h {

        /* renamed from: a */
        public static final int f2323a = 1;

        /* renamed from: b */
        public static final int f2324b = 2;

        /* renamed from: c */
        private final int f2325c;

        /* renamed from: d */
        private final int f2326d;

        /* renamed from: e */
        private final int f2327e;

        /* renamed from: f */
        private final int f2328f;

        /* renamed from: g */
        private final int f2329g;

        C0603h(int i, int i2, int i3, int i4, int i5) {
            this.f2325c = i;
            this.f2326d = i2;
            this.f2327e = i3;
            this.f2328f = i4;
            this.f2329g = i5;
        }

        /* renamed from: a */
        public int mo2180a() {
            return this.f2325c;
        }

        /* renamed from: b */
        public int mo2181b() {
            return this.f2326d;
        }

        /* renamed from: c */
        public int mo2182c() {
            return this.f2327e;
        }

        /* renamed from: d */
        public int mo2183d() {
            return this.f2328f;
        }

        /* renamed from: e */
        public int mo2184e() {
            return this.f2329g;
        }
    }

    /* renamed from: android.support.v4.i.a.d$i */
    public static abstract class C0604i {
        C0604i() {
        }

        /* renamed from: a */
        public abstract void mo2185a();

        /* renamed from: a */
        public abstract void mo2186a(int i);

        /* renamed from: a */
        public abstract void mo2187a(long j);

        /* renamed from: a */
        public abstract void mo2188a(Uri uri, Bundle bundle);

        /* renamed from: a */
        public abstract void mo2189a(C0662q.C0666c cVar, Bundle bundle);

        /* renamed from: a */
        public abstract void mo2190a(C0749q qVar);

        /* renamed from: a */
        public abstract void mo2191a(String str, Bundle bundle);

        /* renamed from: a */
        public abstract void mo2192a(boolean z);

        /* renamed from: b */
        public abstract void mo2193b();

        /* renamed from: b */
        public abstract void mo2194b(long j);

        /* renamed from: b */
        public abstract void mo2195b(Uri uri, Bundle bundle);

        /* renamed from: b */
        public abstract void mo2196b(String str, Bundle bundle);

        /* renamed from: c */
        public abstract void mo2197c();

        /* renamed from: c */
        public abstract void mo2198c(String str, Bundle bundle);

        /* renamed from: d */
        public abstract void mo2199d();

        /* renamed from: d */
        public abstract void mo2200d(String str, Bundle bundle);

        /* renamed from: e */
        public abstract void mo2201e();

        /* renamed from: e */
        public abstract void mo2202e(String str, Bundle bundle);

        /* renamed from: f */
        public abstract void mo2203f();

        /* renamed from: g */
        public abstract void mo2204g();

        /* renamed from: h */
        public abstract void mo2205h();
    }

    /* renamed from: android.support.v4.i.a.d$j */
    static class C0605j extends C0604i {

        /* renamed from: a */
        protected final Object f2330a;

        public C0605j(Object obj) {
            this.f2330a = obj;
        }

        /* renamed from: a */
        public void mo2185a() {
            mo2202e("android.support.v4.media.session.action.PREPARE", (Bundle) null);
        }

        /* renamed from: a */
        public void mo2186a(int i) {
            Bundle bundle = new Bundle();
            bundle.putInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE", i);
            mo2202e("android.support.v4.media.session.action.SET_REPEAT_MODE", bundle);
        }

        /* renamed from: a */
        public void mo2187a(long j) {
            C0609e.C0613d.m3281b(this.f2330a, j);
        }

        /* renamed from: a */
        public void mo2188a(Uri uri, Bundle bundle) {
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("android.support.v4.media.session.action.ARGUMENT_URI", uri);
            bundle2.putBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS", bundle);
            mo2202e("android.support.v4.media.session.action.PREPARE_FROM_URI", bundle2);
        }

        /* renamed from: a */
        public void mo2189a(C0662q.C0666c cVar, Bundle bundle) {
            C0609e.C0613d.m3284c(this.f2330a, cVar.mo2409b(), bundle);
        }

        /* renamed from: a */
        public void mo2190a(C0749q qVar) {
            C0609e.C0613d.m3278a(this.f2330a, qVar != null ? qVar.mo2564g() : null);
        }

        /* renamed from: a */
        public void mo2191a(String str, Bundle bundle) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID", str);
            bundle2.putBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS", bundle);
            mo2202e("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID", bundle2);
        }

        /* renamed from: a */
        public void mo2192a(boolean z) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE_ENABLED", z);
            mo2202e("android.support.v4.media.session.action.SET_SHUFFLE_MODE_ENABLED", bundle);
        }

        /* renamed from: b */
        public void mo2193b() {
            C0609e.C0613d.m3276a(this.f2330a);
        }

        /* renamed from: b */
        public void mo2194b(long j) {
            C0609e.C0613d.m3277a(this.f2330a, j);
        }

        /* renamed from: b */
        public void mo2195b(Uri uri, Bundle bundle) {
            if (uri == null || Uri.EMPTY.equals(uri)) {
                throw new IllegalArgumentException("You must specify a non-empty Uri for playFromUri.");
            }
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("android.support.v4.media.session.action.ARGUMENT_URI", uri);
            bundle2.putParcelable("android.support.v4.media.session.action.ARGUMENT_EXTRAS", bundle);
            mo2202e("android.support.v4.media.session.action.PLAY_FROM_URI", bundle2);
        }

        /* renamed from: b */
        public void mo2196b(String str, Bundle bundle) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("android.support.v4.media.session.action.ARGUMENT_QUERY", str);
            bundle2.putBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS", bundle);
            mo2202e("android.support.v4.media.session.action.PREPARE_FROM_SEARCH", bundle2);
        }

        /* renamed from: c */
        public void mo2197c() {
            C0609e.C0613d.m3280b(this.f2330a);
        }

        /* renamed from: c */
        public void mo2198c(String str, Bundle bundle) {
            C0609e.C0613d.m3279a(this.f2330a, str, bundle);
        }

        /* renamed from: d */
        public void mo2199d() {
            C0609e.C0613d.m3283c(this.f2330a);
        }

        /* renamed from: d */
        public void mo2200d(String str, Bundle bundle) {
            C0609e.C0613d.m3282b(this.f2330a, str, bundle);
        }

        /* renamed from: e */
        public void mo2201e() {
            C0609e.C0613d.m3285d(this.f2330a);
        }

        /* renamed from: e */
        public void mo2202e(String str, Bundle bundle) {
            C0609e.C0613d.m3284c(this.f2330a, str, bundle);
        }

        /* renamed from: f */
        public void mo2203f() {
            C0609e.C0613d.m3287f(this.f2330a);
        }

        /* renamed from: g */
        public void mo2204g() {
            C0609e.C0613d.m3286e(this.f2330a);
        }

        /* renamed from: h */
        public void mo2205h() {
            C0609e.C0613d.m3288g(this.f2330a);
        }
    }

    /* renamed from: android.support.v4.i.a.d$k */
    static class C0606k extends C0605j {
        public C0606k(Object obj) {
            super(obj);
        }

        /* renamed from: b */
        public void mo2195b(Uri uri, Bundle bundle) {
            C0614f.C0615a.m3289a(this.f2330a, uri, bundle);
        }
    }

    /* renamed from: android.support.v4.i.a.d$l */
    static class C0607l extends C0606k {
        public C0607l(Object obj) {
            super(obj);
        }

        /* renamed from: a */
        public void mo2185a() {
            C0616g.C0617a.m3293h(this.f2330a);
        }

        /* renamed from: a */
        public void mo2188a(Uri uri, Bundle bundle) {
            C0616g.C0617a.m3290b(this.f2330a, uri, bundle);
        }

        /* renamed from: a */
        public void mo2191a(String str, Bundle bundle) {
            C0616g.C0617a.m3291d(this.f2330a, str, bundle);
        }

        /* renamed from: b */
        public void mo2196b(String str, Bundle bundle) {
            C0616g.C0617a.m3292e(this.f2330a, str, bundle);
        }
    }

    /* renamed from: android.support.v4.i.a.d$m */
    static class C0608m extends C0604i {

        /* renamed from: a */
        private C0582b f2331a;

        public C0608m(C0582b bVar) {
            this.f2331a = bVar;
        }

        /* renamed from: a */
        public void mo2185a() {
            try {
                this.f2331a.mo2089o();
            } catch (RemoteException e) {
                Log.e(C0586d.f2276a, "Dead object in prepare.", e);
            }
        }

        /* renamed from: a */
        public void mo2186a(int i) {
            try {
                this.f2331a.mo2067b(i);
            } catch (RemoteException e) {
                Log.e(C0586d.f2276a, "Dead object in setRepeatMode.", e);
            }
        }

        /* renamed from: a */
        public void mo2187a(long j) {
            try {
                this.f2331a.mo2055a(j);
            } catch (RemoteException e) {
                Log.e(C0586d.f2276a, "Dead object in skipToQueueItem.", e);
            }
        }

        /* renamed from: a */
        public void mo2188a(Uri uri, Bundle bundle) {
            try {
                this.f2331a.mo2056a(uri, bundle);
            } catch (RemoteException e) {
                Log.e(C0586d.f2276a, "Dead object in prepareFromUri.", e);
            }
        }

        /* renamed from: a */
        public void mo2189a(C0662q.C0666c cVar, Bundle bundle) {
            mo2202e(cVar.mo2409b(), bundle);
        }

        /* renamed from: a */
        public void mo2190a(C0749q qVar) {
            try {
                this.f2331a.mo2060a(qVar);
            } catch (RemoteException e) {
                Log.e(C0586d.f2276a, "Dead object in setRating.", e);
            }
        }

        /* renamed from: a */
        public void mo2191a(String str, Bundle bundle) {
            try {
                this.f2331a.mo2061a(str, bundle);
            } catch (RemoteException e) {
                Log.e(C0586d.f2276a, "Dead object in prepareFromMediaId.", e);
            }
        }

        /* renamed from: a */
        public void mo2192a(boolean z) {
            try {
                this.f2331a.mo2063a(z);
            } catch (RemoteException e) {
                Log.e(C0586d.f2276a, "Dead object in setShuffleModeEnabled.", e);
            }
        }

        /* renamed from: b */
        public void mo2193b() {
            try {
                this.f2331a.mo2090p();
            } catch (RemoteException e) {
                Log.e(C0586d.f2276a, "Dead object in play.", e);
            }
        }

        /* renamed from: b */
        public void mo2194b(long j) {
            try {
                this.f2331a.mo2069b(j);
            } catch (RemoteException e) {
                Log.e(C0586d.f2276a, "Dead object in seekTo.", e);
            }
        }

        /* renamed from: b */
        public void mo2195b(Uri uri, Bundle bundle) {
            try {
                this.f2331a.mo2070b(uri, bundle);
            } catch (RemoteException e) {
                Log.e(C0586d.f2276a, "Dead object in playFromUri.", e);
            }
        }

        /* renamed from: b */
        public void mo2196b(String str, Bundle bundle) {
            try {
                this.f2331a.mo2073b(str, bundle);
            } catch (RemoteException e) {
                Log.e(C0586d.f2276a, "Dead object in prepareFromSearch.", e);
            }
        }

        /* renamed from: c */
        public void mo2197c() {
            try {
                this.f2331a.mo2091q();
            } catch (RemoteException e) {
                Log.e(C0586d.f2276a, "Dead object in pause.", e);
            }
        }

        /* renamed from: c */
        public void mo2198c(String str, Bundle bundle) {
            try {
                this.f2331a.mo2075c(str, bundle);
            } catch (RemoteException e) {
                Log.e(C0586d.f2276a, "Dead object in playFromMediaId.", e);
            }
        }

        /* renamed from: d */
        public void mo2199d() {
            try {
                this.f2331a.mo2092r();
            } catch (RemoteException e) {
                Log.e(C0586d.f2276a, "Dead object in stop.", e);
            }
        }

        /* renamed from: d */
        public void mo2200d(String str, Bundle bundle) {
            try {
                this.f2331a.mo2077d(str, bundle);
            } catch (RemoteException e) {
                Log.e(C0586d.f2276a, "Dead object in playFromSearch.", e);
            }
        }

        /* renamed from: e */
        public void mo2201e() {
            try {
                this.f2331a.mo2095u();
            } catch (RemoteException e) {
                Log.e(C0586d.f2276a, "Dead object in fastForward.", e);
            }
        }

        /* renamed from: e */
        public void mo2202e(String str, Bundle bundle) {
            try {
                this.f2331a.mo2079e(str, bundle);
            } catch (RemoteException e) {
                Log.e(C0586d.f2276a, "Dead object in sendCustomAction.", e);
            }
        }

        /* renamed from: f */
        public void mo2203f() {
            try {
                this.f2331a.mo2093s();
            } catch (RemoteException e) {
                Log.e(C0586d.f2276a, "Dead object in skipToNext.", e);
            }
        }

        /* renamed from: g */
        public void mo2204g() {
            try {
                this.f2331a.mo2096v();
            } catch (RemoteException e) {
                Log.e(C0586d.f2276a, "Dead object in rewind.", e);
            }
        }

        /* renamed from: h */
        public void mo2205h() {
            try {
                this.f2331a.mo2094t();
            } catch (RemoteException e) {
                Log.e(C0586d.f2276a, "Dead object in skipToPrevious.", e);
            }
        }
    }

    public C0586d(Context context, C0618h.C0640i iVar) {
        if (iVar == null) {
            throw new IllegalArgumentException("sessionToken must not be null");
        }
        this.f2285j = iVar;
        if (Build.VERSION.SDK_INT >= 24) {
            this.f2284i = new C0601f(context, iVar);
        } else if (Build.VERSION.SDK_INT >= 23) {
            this.f2284i = new C0600e(context, iVar);
        } else if (Build.VERSION.SDK_INT >= 21) {
            this.f2284i = new C0593d(context, iVar);
        } else {
            this.f2284i = new C0602g(this.f2285j);
        }
    }

    public C0586d(Context context, C0618h hVar) {
        if (hVar == null) {
            throw new IllegalArgumentException("session must not be null");
        }
        this.f2285j = hVar.mo2233c();
        if (Build.VERSION.SDK_INT >= 24) {
            this.f2284i = new C0601f(context, hVar);
        } else if (Build.VERSION.SDK_INT >= 23) {
            this.f2284i = new C0600e(context, hVar);
        } else if (Build.VERSION.SDK_INT >= 21) {
            this.f2284i = new C0593d(context, hVar);
        } else {
            this.f2284i = new C0602g(this.f2285j);
        }
    }

    /* renamed from: a */
    public static C0586d m3014a(Activity activity) {
        Object a;
        if (activity instanceof C0360ce) {
            C0591b bVar = (C0591b) ((C0360ce) activity).mo1621a(C0591b.class);
            return bVar != null ? bVar.mo2150a() : null;
        } else if (Build.VERSION.SDK_INT < 21 || (a = C0609e.m3239a(activity)) == null) {
            return null;
        } else {
            try {
                return new C0586d((Context) activity, C0618h.C0640i.m3565a(C0609e.m3242a(a)));
            } catch (RemoteException e) {
                Log.e(f2276a, "Dead object in getMediaController.", e);
                return null;
            }
        }
    }

    /* renamed from: a */
    public static void m3015a(Activity activity, C0586d dVar) {
        if (activity instanceof C0360ce) {
            ((C0360ce) activity).mo1622a((C0360ce.C0361a) new C0591b(dVar));
        }
        if (Build.VERSION.SDK_INT >= 21) {
            Object obj = null;
            if (dVar != null) {
                obj = C0609e.m3240a((Context) activity, dVar.mo2125m().mo2341a());
            }
            C0609e.m3243a(activity, obj);
        }
    }

    /* renamed from: a */
    public C0604i mo2102a() {
        return this.f2284i.mo2151a();
    }

    /* renamed from: a */
    public void mo2103a(int i) {
        this.f2284i.mo2152a(i);
    }

    /* renamed from: a */
    public void mo2104a(int i, int i2) {
        this.f2284i.mo2153a(i, i2);
    }

    /* renamed from: a */
    public void mo2105a(C0587a aVar) {
        mo2106a(aVar, (Handler) null);
    }

    /* renamed from: a */
    public void mo2106a(C0587a aVar, Handler handler) {
        if (aVar == null) {
            throw new IllegalArgumentException("callback cannot be null");
        }
        if (handler == null) {
            handler = new Handler();
        }
        this.f2284i.mo2155a(aVar, handler);
    }

    /* renamed from: a */
    public void mo2107a(C0732k kVar) {
        this.f2284i.mo2156a(kVar);
    }

    /* renamed from: a */
    public void mo2108a(C0732k kVar, int i) {
        this.f2284i.mo2157a(kVar, i);
    }

    /* renamed from: a */
    public void mo2109a(String str, Bundle bundle, ResultReceiver resultReceiver) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("command cannot be null or empty");
        }
        this.f2284i.mo2158a(str, bundle, resultReceiver);
    }

    /* renamed from: a */
    public boolean mo2110a(KeyEvent keyEvent) {
        if (keyEvent != null) {
            return this.f2284i.mo2159a(keyEvent);
        }
        throw new IllegalArgumentException("KeyEvent may not be null");
    }

    /* renamed from: b */
    public C0662q mo2111b() {
        return this.f2284i.mo2160b();
    }

    /* renamed from: b */
    public void mo2112b(int i, int i2) {
        this.f2284i.mo2161b(i, i2);
    }

    /* renamed from: b */
    public void mo2113b(C0587a aVar) {
        if (aVar == null) {
            throw new IllegalArgumentException("callback cannot be null");
        }
        this.f2284i.mo2154a(aVar);
    }

    /* renamed from: b */
    public void mo2114b(C0732k kVar) {
        this.f2284i.mo2162b(kVar);
    }

    /* renamed from: c */
    public C0739n mo2115c() {
        return this.f2284i.mo2163c();
    }

    /* renamed from: d */
    public List<C0618h.C0635f> mo2116d() {
        return this.f2284i.mo2164d();
    }

    /* renamed from: e */
    public CharSequence mo2117e() {
        return this.f2284i.mo2165e();
    }

    /* renamed from: f */
    public Bundle mo2118f() {
        return this.f2284i.mo2166f();
    }

    /* renamed from: g */
    public int mo2119g() {
        return this.f2284i.mo2167g();
    }

    /* renamed from: h */
    public int mo2120h() {
        return this.f2284i.mo2168h();
    }

    /* renamed from: i */
    public boolean mo2121i() {
        return this.f2284i.mo2169i();
    }

    /* renamed from: j */
    public long mo2122j() {
        return this.f2284i.mo2170j();
    }

    /* renamed from: k */
    public C0603h mo2123k() {
        return this.f2284i.mo2171k();
    }

    /* renamed from: l */
    public PendingIntent mo2124l() {
        return this.f2284i.mo2172l();
    }

    /* renamed from: m */
    public C0618h.C0640i mo2125m() {
        return this.f2285j;
    }

    /* renamed from: n */
    public String mo2126n() {
        return this.f2284i.mo2173m();
    }

    /* access modifiers changed from: package-private */
    @C0020ao
    /* renamed from: o */
    public boolean mo2127o() {
        if (this.f2284i instanceof C0593d) {
            return ((C0593d) this.f2284i).f2305b != null;
        }
        return false;
    }

    /* renamed from: p */
    public Object mo2128p() {
        return this.f2284i.mo2174n();
    }
}
