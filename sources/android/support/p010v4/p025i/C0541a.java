package android.support.p010v4.p025i;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.annotation.C0003aa;
import android.support.annotation.C0011ag;
import android.support.annotation.C0047z;
import android.support.p010v4.p013c.C0411y;
import android.support.p010v4.p025i.C0676b;
import android.support.p010v4.p025i.C0682c;
import android.support.p010v4.p025i.C0685d;
import android.support.p010v4.p025i.p026a.C0618h;
import android.support.p010v4.p028k.C0798c;
import android.support.p010v4.p028k.C0813n;
import android.support.p010v4.p033o.C0876a;
import android.text.TextUtils;
import android.util.Log;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: android.support.v4.i.a */
public final class C0541a {

    /* renamed from: a */
    static final String f2121a = "MediaBrowserCompat";

    /* renamed from: b */
    static final boolean f2122b = Log.isLoggable(f2121a, 3);

    /* renamed from: c */
    public static final String f2123c = "android.media.browse.extra.PAGE";

    /* renamed from: d */
    public static final String f2124d = "android.media.browse.extra.PAGE_SIZE";

    /* renamed from: e */
    private final C0549e f2125e;

    /* renamed from: android.support.v4.i.a$a */
    private static class C0542a extends Handler {

        /* renamed from: a */
        private final WeakReference<C0568j> f2126a;

        /* renamed from: b */
        private WeakReference<Messenger> f2127b;

        C0542a(C0568j jVar) {
            this.f2126a = new WeakReference<>(jVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo1954a(Messenger messenger) {
            this.f2127b = new WeakReference<>(messenger);
        }

        public void handleMessage(Message message) {
            if (this.f2127b != null && this.f2127b.get() != null && this.f2126a.get() != null) {
                Bundle data = message.getData();
                data.setClassLoader(C0618h.class.getClassLoader());
                switch (message.what) {
                    case 1:
                        ((C0568j) this.f2126a.get()).mo1983a((Messenger) this.f2127b.get(), data.getString(C0689f.f2593c), (C0618h.C0640i) data.getParcelable(C0689f.f2595e), data.getBundle(C0689f.f2599i));
                        return;
                    case 2:
                        ((C0568j) this.f2126a.get()).mo1982a((Messenger) this.f2127b.get());
                        return;
                    case 3:
                        ((C0568j) this.f2126a.get()).mo1984a((Messenger) this.f2127b.get(), data.getString(C0689f.f2593c), (List) data.getParcelableArrayList(C0689f.f2594d), data.getBundle(C0689f.f2596f));
                        return;
                    default:
                        Log.w(C0541a.f2121a, "Unhandled message: " + message + "\n  Client version: " + 1 + "\n  Service version: " + message.arg1);
                        return;
                }
            }
        }
    }

    /* renamed from: android.support.v4.i.a$b */
    public static class C0543b {

        /* renamed from: a */
        final Object f2128a;

        /* renamed from: b */
        C0544a f2129b;

        /* renamed from: android.support.v4.i.a$b$a */
        interface C0544a {
            /* renamed from: a */
            void mo1960a();

            /* renamed from: b */
            void mo1961b();

            /* renamed from: c */
            void mo1962c();
        }

        /* renamed from: android.support.v4.i.a$b$b */
        private class C0545b implements C0676b.C0677a {
            C0545b() {
            }

            /* renamed from: a */
            public void mo1963a() {
                if (C0543b.this.f2129b != null) {
                    C0543b.this.f2129b.mo1960a();
                }
                C0543b.this.mo1956a();
            }

            /* renamed from: b */
            public void mo1964b() {
                if (C0543b.this.f2129b != null) {
                    C0543b.this.f2129b.mo1961b();
                }
                C0543b.this.mo1958b();
            }

            /* renamed from: c */
            public void mo1965c() {
                if (C0543b.this.f2129b != null) {
                    C0543b.this.f2129b.mo1962c();
                }
                C0543b.this.mo1959c();
            }
        }

        public C0543b() {
            if (Build.VERSION.SDK_INT >= 21) {
                this.f2128a = C0676b.m3695a((C0676b.C0677a) new C0545b());
            } else {
                this.f2128a = null;
            }
        }

        /* renamed from: a */
        public void mo1956a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo1957a(C0544a aVar) {
            this.f2129b = aVar;
        }

        /* renamed from: b */
        public void mo1958b() {
        }

        /* renamed from: c */
        public void mo1959c() {
        }
    }

    /* renamed from: android.support.v4.i.a$c */
    public static abstract class C0546c {

        /* renamed from: a */
        final Object f2131a;

        /* renamed from: android.support.v4.i.a$c$a */
        private class C0547a implements C0682c.C0683a {
            C0547a() {
            }

            /* renamed from: a */
            public void mo1968a(Parcel parcel) {
                if (parcel == null) {
                    C0546c.this.mo1966a((C0569k) null);
                    return;
                }
                parcel.setDataPosition(0);
                parcel.recycle();
                C0546c.this.mo1966a(C0569k.CREATOR.createFromParcel(parcel));
            }

            /* renamed from: a */
            public void mo1969a(@C0047z String str) {
                C0546c.this.mo1967a(str);
            }
        }

        public C0546c() {
            if (Build.VERSION.SDK_INT >= 23) {
                this.f2131a = C0682c.m3713a(new C0547a());
            } else {
                this.f2131a = null;
            }
        }

        /* renamed from: a */
        public void mo1966a(C0569k kVar) {
        }

        /* renamed from: a */
        public void mo1967a(@C0047z String str) {
        }
    }

    /* renamed from: android.support.v4.i.a$d */
    private static class C0548d extends C0813n {

        /* renamed from: d */
        private final String f2133d;

        /* renamed from: e */
        private final C0546c f2134e;

        C0548d(String str, C0546c cVar, Handler handler) {
            super(handler);
            this.f2133d = str;
            this.f2134e = cVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo1970a(int i, Bundle bundle) {
            if (bundle != null) {
                bundle.setClassLoader(C0541a.class.getClassLoader());
            }
            if (i != 0 || bundle == null || !bundle.containsKey(C0690g.f2620d)) {
                this.f2134e.mo1967a(this.f2133d);
                return;
            }
            Parcelable parcelable = bundle.getParcelable(C0690g.f2620d);
            if (parcelable == null || (parcelable instanceof C0569k)) {
                this.f2134e.mo1966a((C0569k) parcelable);
            } else {
                this.f2134e.mo1967a(this.f2133d);
            }
        }
    }

    /* renamed from: android.support.v4.i.a$e */
    interface C0549e {
        /* renamed from: a */
        void mo1971a(@C0047z String str, Bundle bundle, @C0047z C0572l lVar);

        /* renamed from: a */
        void mo1972a(@C0047z String str, Bundle bundle, @C0047z C0576p pVar);

        /* renamed from: a */
        void mo1973a(@C0047z String str, @C0047z C0546c cVar);

        /* renamed from: a */
        void mo1974a(@C0047z String str, C0576p pVar);

        /* renamed from: d */
        void mo1975d();

        /* renamed from: e */
        void mo1976e();

        /* renamed from: f */
        boolean mo1977f();

        /* renamed from: g */
        ComponentName mo1978g();

        @C0047z
        /* renamed from: h */
        String mo1979h();

        @C0003aa
        /* renamed from: i */
        Bundle mo1980i();

        @C0047z
        /* renamed from: j */
        C0618h.C0640i mo1981j();
    }

    /* renamed from: android.support.v4.i.a$f */
    static class C0550f implements C0543b.C0544a, C0549e, C0568j {

        /* renamed from: a */
        protected final Object f2135a;

        /* renamed from: b */
        protected final Bundle f2136b;

        /* renamed from: c */
        protected final C0542a f2137c = new C0542a(this);

        /* renamed from: d */
        protected C0574n f2138d;

        /* renamed from: e */
        protected Messenger f2139e;

        /* renamed from: f */
        private final C0876a<String, C0575o> f2140f = new C0876a<>();

        public C0550f(Context context, ComponentName componentName, C0543b bVar, Bundle bundle) {
            if (Build.VERSION.SDK_INT <= 25) {
                bundle = bundle == null ? new Bundle() : bundle;
                bundle.putInt(C0689f.f2602l, 1);
                this.f2136b = new Bundle(bundle);
            } else {
                this.f2136b = bundle == null ? null : new Bundle(bundle);
            }
            bVar.mo1957a(this);
            this.f2135a = C0676b.m3694a(context, componentName, bVar.f2128a, this.f2136b);
        }

        /* renamed from: a */
        public void mo1960a() {
            IBinder a;
            Bundle f = C0676b.m3704f(this.f2135a);
            if (f != null && (a = C0411y.m2301a(f, C0689f.f2604n)) != null) {
                this.f2138d = new C0574n(a, this.f2136b);
                this.f2139e = new Messenger(this.f2137c);
                this.f2137c.mo1954a(this.f2139e);
                try {
                    this.f2138d.mo2023b(this.f2139e);
                } catch (RemoteException e) {
                    Log.i(C0541a.f2121a, "Remote error registering client messenger.");
                }
            }
        }

        /* renamed from: a */
        public void mo1982a(Messenger messenger) {
        }

        /* renamed from: a */
        public void mo1983a(Messenger messenger, String str, C0618h.C0640i iVar, Bundle bundle) {
        }

        /* renamed from: a */
        public void mo1984a(Messenger messenger, String str, List list, Bundle bundle) {
            if (this.f2139e == messenger) {
                C0575o oVar = this.f2140f.get(str);
                if (oVar != null) {
                    C0576p a = oVar.mo2025a(bundle);
                    if (a == null) {
                        return;
                    }
                    if (bundle == null) {
                        if (list == null) {
                            a.mo2030a(str);
                        } else {
                            a.mo2032a(str, (List<C0569k>) list);
                        }
                    } else if (list == null) {
                        a.mo2031a(str, bundle);
                    } else {
                        a.mo2033a(str, list, bundle);
                    }
                } else if (C0541a.f2122b) {
                    Log.d(C0541a.f2121a, "onLoadChildren for id that isn't subscribed id=" + str);
                }
            }
        }

        /* renamed from: a */
        public void mo1971a(@C0047z final String str, final Bundle bundle, @C0047z final C0572l lVar) {
            if (!mo1977f()) {
                Log.i(C0541a.f2121a, "Not connected, unable to search.");
                this.f2137c.post(new Runnable() {
                    public void run() {
                        lVar.mo2015a(str, bundle);
                    }
                });
            } else if (this.f2138d == null) {
                Log.i(C0541a.f2121a, "The connected service doesn't support search.");
                this.f2137c.post(new Runnable() {
                    public void run() {
                        lVar.mo2015a(str, bundle);
                    }
                });
            } else {
                try {
                    this.f2138d.mo2019a(str, bundle, (C0813n) new C0573m(str, bundle, lVar, this.f2137c), this.f2139e);
                } catch (RemoteException e) {
                    Log.i(C0541a.f2121a, "Remote error searching items with query: " + str, e);
                    this.f2137c.post(new Runnable() {
                        public void run() {
                            lVar.mo2015a(str, bundle);
                        }
                    });
                }
            }
        }

        /* renamed from: a */
        public void mo1972a(@C0047z String str, Bundle bundle, @C0047z C0576p pVar) {
            C0575o oVar = this.f2140f.get(str);
            if (oVar == null) {
                oVar = new C0575o();
                this.f2140f.put(str, oVar);
            }
            pVar.m2886a(oVar);
            Bundle bundle2 = bundle == null ? null : new Bundle(bundle);
            oVar.mo2026a(bundle2, pVar);
            if (this.f2138d == null) {
                C0676b.m3699a(this.f2135a, str, pVar.f2213b);
                return;
            }
            try {
                this.f2138d.mo2020a(str, pVar.f2214c, bundle2, this.f2139e);
            } catch (RemoteException e) {
                Log.i(C0541a.f2121a, "Remote error subscribing media item: " + str);
            }
        }

        /* renamed from: a */
        public void mo1973a(@C0047z final String str, @C0047z final C0546c cVar) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("mediaId is empty");
            } else if (cVar == null) {
                throw new IllegalArgumentException("cb is null");
            } else if (!C0676b.m3701c(this.f2135a)) {
                Log.i(C0541a.f2121a, "Not connected, unable to retrieve the MediaItem.");
                this.f2137c.post(new Runnable() {
                    public void run() {
                        cVar.mo1967a(str);
                    }
                });
            } else if (this.f2138d == null) {
                this.f2137c.post(new Runnable() {
                    public void run() {
                        cVar.mo1967a(str);
                    }
                });
            } else {
                try {
                    this.f2138d.mo2022a(str, (C0813n) new C0548d(str, cVar, this.f2137c), this.f2139e);
                } catch (RemoteException e) {
                    Log.i(C0541a.f2121a, "Remote error getting media item: " + str);
                    this.f2137c.post(new Runnable() {
                        public void run() {
                            cVar.mo1967a(str);
                        }
                    });
                }
            }
        }

        /* renamed from: a */
        public void mo1974a(@C0047z String str, C0576p pVar) {
            C0575o oVar = this.f2140f.get(str);
            if (oVar != null) {
                if (this.f2138d == null) {
                    if (pVar == null) {
                        C0676b.m3698a(this.f2135a, str);
                    } else {
                        List<C0576p> c = oVar.mo2029c();
                        List<Bundle> b = oVar.mo2028b();
                        for (int size = c.size() - 1; size >= 0; size--) {
                            if (c.get(size) == pVar) {
                                c.remove(size);
                                b.remove(size);
                            }
                        }
                        if (c.size() == 0) {
                            C0676b.m3698a(this.f2135a, str);
                        }
                    }
                } else if (pVar == null) {
                    try {
                        this.f2138d.mo2021a(str, (IBinder) null, this.f2139e);
                    } catch (RemoteException e) {
                        Log.d(C0541a.f2121a, "removeSubscription failed with RemoteException parentId=" + str);
                    }
                } else {
                    List<C0576p> c2 = oVar.mo2029c();
                    List<Bundle> b2 = oVar.mo2028b();
                    for (int size2 = c2.size() - 1; size2 >= 0; size2--) {
                        if (c2.get(size2) == pVar) {
                            this.f2138d.mo2021a(str, pVar.f2214c, this.f2139e);
                            c2.remove(size2);
                            b2.remove(size2);
                        }
                    }
                }
                if (oVar.mo2027a() || pVar == null) {
                    this.f2140f.remove(str);
                }
            }
        }

        /* renamed from: b */
        public void mo1961b() {
            this.f2138d = null;
            this.f2139e = null;
            this.f2137c.mo1954a((Messenger) null);
        }

        /* renamed from: c */
        public void mo1962c() {
        }

        /* renamed from: d */
        public void mo1975d() {
            C0676b.m3697a(this.f2135a);
        }

        /* renamed from: e */
        public void mo1976e() {
            if (!(this.f2138d == null || this.f2139e == null)) {
                try {
                    this.f2138d.mo2024c(this.f2139e);
                } catch (RemoteException e) {
                    Log.i(C0541a.f2121a, "Remote error unregistering client messenger.");
                }
            }
            C0676b.m3700b(this.f2135a);
        }

        /* renamed from: f */
        public boolean mo1977f() {
            return C0676b.m3701c(this.f2135a);
        }

        /* renamed from: g */
        public ComponentName mo1978g() {
            return C0676b.m3702d(this.f2135a);
        }

        @C0047z
        /* renamed from: h */
        public String mo1979h() {
            return C0676b.m3703e(this.f2135a);
        }

        @C0003aa
        /* renamed from: i */
        public Bundle mo1980i() {
            return C0676b.m3704f(this.f2135a);
        }

        @C0047z
        /* renamed from: j */
        public C0618h.C0640i mo1981j() {
            return C0618h.C0640i.m3565a(C0676b.m3705g(this.f2135a));
        }
    }

    /* renamed from: android.support.v4.i.a$g */
    static class C0557g extends C0550f {
        public C0557g(Context context, ComponentName componentName, C0543b bVar, Bundle bundle) {
            super(context, componentName, bVar, bundle);
        }

        /* renamed from: a */
        public void mo1973a(@C0047z String str, @C0047z C0546c cVar) {
            if (this.f2138d == null) {
                C0682c.m3714a(this.f2135a, str, cVar.f2131a);
            } else {
                super.mo1973a(str, cVar);
            }
        }
    }

    /* renamed from: android.support.v4.i.a$h */
    static class C0558h extends C0557g {
        public C0558h(Context context, ComponentName componentName, C0543b bVar, Bundle bundle) {
            super(context, componentName, bVar, bundle);
        }

        /* renamed from: a */
        public void mo1972a(@C0047z String str, @C0047z Bundle bundle, @C0047z C0576p pVar) {
            if (bundle == null) {
                C0676b.m3699a(this.f2135a, str, pVar.f2213b);
            } else {
                C0685d.m3718a(this.f2135a, str, bundle, pVar.f2213b);
            }
        }

        /* renamed from: a */
        public void mo1974a(@C0047z String str, C0576p pVar) {
            if (pVar == null) {
                C0676b.m3698a(this.f2135a, str);
            } else {
                C0685d.m3719a(this.f2135a, str, pVar.f2213b);
            }
        }
    }

    /* renamed from: android.support.v4.i.a$i */
    static class C0559i implements C0549e, C0568j {

        /* renamed from: a */
        static final int f2162a = 0;

        /* renamed from: b */
        static final int f2163b = 1;

        /* renamed from: c */
        static final int f2164c = 3;

        /* renamed from: m */
        private static final int f2165m = 2;

        /* renamed from: d */
        final Context f2166d;

        /* renamed from: e */
        final ComponentName f2167e;

        /* renamed from: f */
        final C0543b f2168f;

        /* renamed from: g */
        final Bundle f2169g;

        /* renamed from: h */
        final C0542a f2170h = new C0542a(this);

        /* renamed from: i */
        int f2171i = 0;

        /* renamed from: j */
        C0565a f2172j;

        /* renamed from: k */
        C0574n f2173k;

        /* renamed from: l */
        Messenger f2174l;

        /* renamed from: n */
        private final C0876a<String, C0575o> f2175n = new C0876a<>();

        /* renamed from: o */
        private String f2176o;

        /* renamed from: p */
        private C0618h.C0640i f2177p;

        /* renamed from: q */
        private Bundle f2178q;

        /* renamed from: android.support.v4.i.a$i$a */
        private class C0565a implements ServiceConnection {
            C0565a() {
            }

            /* renamed from: a */
            private void m2854a(Runnable runnable) {
                if (Thread.currentThread() == C0559i.this.f2170h.getLooper().getThread()) {
                    runnable.run();
                } else {
                    C0559i.this.f2170h.post(runnable);
                }
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public boolean mo1998a(String str) {
                if (C0559i.this.f2172j == this) {
                    return true;
                }
                if (C0559i.this.f2171i != 0) {
                    Log.i(C0541a.f2121a, str + " for " + C0559i.this.f2167e + " with mServiceConnection=" + C0559i.this.f2172j + " this=" + this);
                }
                return false;
            }

            public void onServiceConnected(final ComponentName componentName, final IBinder iBinder) {
                m2854a((Runnable) new Runnable() {
                    public void run() {
                        if (C0541a.f2122b) {
                            Log.d(C0541a.f2121a, "MediaServiceConnection.onServiceConnected name=" + componentName + " binder=" + iBinder);
                            C0559i.this.mo1992b();
                        }
                        if (C0565a.this.mo1998a("onServiceConnected")) {
                            C0559i.this.f2173k = new C0574n(iBinder, C0559i.this.f2169g);
                            C0559i.this.f2174l = new Messenger(C0559i.this.f2170h);
                            C0559i.this.f2170h.mo1954a(C0559i.this.f2174l);
                            C0559i.this.f2171i = 1;
                            try {
                                if (C0541a.f2122b) {
                                    Log.d(C0541a.f2121a, "ServiceCallbacks.onConnect...");
                                    C0559i.this.mo1992b();
                                }
                                C0559i.this.f2173k.mo2017a(C0559i.this.f2166d, C0559i.this.f2174l);
                            } catch (RemoteException e) {
                                Log.w(C0541a.f2121a, "RemoteException during connect for " + C0559i.this.f2167e);
                                if (C0541a.f2122b) {
                                    Log.d(C0541a.f2121a, "ServiceCallbacks.onConnect...");
                                    C0559i.this.mo1992b();
                                }
                            }
                        }
                    }
                });
            }

            public void onServiceDisconnected(final ComponentName componentName) {
                m2854a((Runnable) new Runnable() {
                    public void run() {
                        if (C0541a.f2122b) {
                            Log.d(C0541a.f2121a, "MediaServiceConnection.onServiceDisconnected name=" + componentName + " this=" + this + " mServiceConnection=" + C0559i.this.f2172j);
                            C0559i.this.mo1992b();
                        }
                        if (C0565a.this.mo1998a("onServiceDisconnected")) {
                            C0559i.this.f2173k = null;
                            C0559i.this.f2174l = null;
                            C0559i.this.f2170h.mo1954a((Messenger) null);
                            C0559i.this.f2171i = 3;
                            C0559i.this.f2168f.mo1958b();
                        }
                    }
                });
            }
        }

        public C0559i(Context context, ComponentName componentName, C0543b bVar, Bundle bundle) {
            if (context == null) {
                throw new IllegalArgumentException("context must not be null");
            } else if (componentName == null) {
                throw new IllegalArgumentException("service component must not be null");
            } else if (bVar == null) {
                throw new IllegalArgumentException("connection callback must not be null");
            } else {
                this.f2166d = context;
                this.f2167e = componentName;
                this.f2168f = bVar;
                this.f2169g = bundle == null ? null : new Bundle(bundle);
            }
        }

        /* renamed from: a */
        private static String m2836a(int i) {
            switch (i) {
                case 0:
                    return "CONNECT_STATE_DISCONNECTED";
                case 1:
                    return "CONNECT_STATE_CONNECTING";
                case 2:
                    return "CONNECT_STATE_CONNECTED";
                case 3:
                    return "CONNECT_STATE_SUSPENDED";
                default:
                    return "UNKNOWN/" + i;
            }
        }

        /* renamed from: a */
        private boolean m2837a(Messenger messenger, String str) {
            if (this.f2174l == messenger) {
                return true;
            }
            if (this.f2171i != 0) {
                Log.i(C0541a.f2121a, str + " for " + this.f2167e + " with mCallbacksMessenger=" + this.f2174l + " this=" + this);
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo1991a() {
            if (this.f2172j != null) {
                this.f2166d.unbindService(this.f2172j);
            }
            this.f2171i = 0;
            this.f2172j = null;
            this.f2173k = null;
            this.f2174l = null;
            this.f2170h.mo1954a((Messenger) null);
            this.f2176o = null;
            this.f2177p = null;
        }

        /* renamed from: a */
        public void mo1982a(Messenger messenger) {
            Log.e(C0541a.f2121a, "onConnectFailed for " + this.f2167e);
            if (m2837a(messenger, "onConnectFailed")) {
                if (this.f2171i != 1) {
                    Log.w(C0541a.f2121a, "onConnect from service while mState=" + m2836a(this.f2171i) + "... ignoring");
                    return;
                }
                mo1991a();
                this.f2168f.mo1959c();
            }
        }

        /* renamed from: a */
        public void mo1983a(Messenger messenger, String str, C0618h.C0640i iVar, Bundle bundle) {
            if (m2837a(messenger, "onConnect")) {
                if (this.f2171i != 1) {
                    Log.w(C0541a.f2121a, "onConnect from service while mState=" + m2836a(this.f2171i) + "... ignoring");
                    return;
                }
                this.f2176o = str;
                this.f2177p = iVar;
                this.f2178q = bundle;
                this.f2171i = 2;
                if (C0541a.f2122b) {
                    Log.d(C0541a.f2121a, "ServiceCallbacks.onConnect...");
                    mo1992b();
                }
                this.f2168f.mo1956a();
                try {
                    for (Map.Entry next : this.f2175n.entrySet()) {
                        String str2 = (String) next.getKey();
                        C0575o oVar = (C0575o) next.getValue();
                        List<C0576p> c = oVar.mo2029c();
                        List<Bundle> b = oVar.mo2028b();
                        int i = 0;
                        while (true) {
                            int i2 = i;
                            if (i2 < c.size()) {
                                this.f2173k.mo2020a(str2, c.get(i2).f2214c, b.get(i2), this.f2174l);
                                i = i2 + 1;
                            }
                        }
                    }
                } catch (RemoteException e) {
                    Log.d(C0541a.f2121a, "addSubscription failed with RemoteException.");
                }
            }
        }

        /* renamed from: a */
        public void mo1984a(Messenger messenger, String str, List list, Bundle bundle) {
            if (m2837a(messenger, "onLoadChildren")) {
                if (C0541a.f2122b) {
                    Log.d(C0541a.f2121a, "onLoadChildren for " + this.f2167e + " id=" + str);
                }
                C0575o oVar = this.f2175n.get(str);
                if (oVar != null) {
                    C0576p a = oVar.mo2025a(bundle);
                    if (a == null) {
                        return;
                    }
                    if (bundle == null) {
                        if (list == null) {
                            a.mo2030a(str);
                        } else {
                            a.mo2032a(str, (List<C0569k>) list);
                        }
                    } else if (list == null) {
                        a.mo2031a(str, bundle);
                    } else {
                        a.mo2033a(str, list, bundle);
                    }
                } else if (C0541a.f2122b) {
                    Log.d(C0541a.f2121a, "onLoadChildren for id that isn't subscribed id=" + str);
                }
            }
        }

        /* renamed from: a */
        public void mo1971a(@C0047z final String str, final Bundle bundle, @C0047z final C0572l lVar) {
            if (!mo1977f()) {
                Log.i(C0541a.f2121a, "Not connected, unable to search.");
                this.f2170h.post(new Runnable() {
                    public void run() {
                        lVar.mo2015a(str, bundle);
                    }
                });
                return;
            }
            try {
                this.f2173k.mo2019a(str, bundle, (C0813n) new C0573m(str, bundle, lVar, this.f2170h), this.f2174l);
            } catch (RemoteException e) {
                Log.i(C0541a.f2121a, "Remote error searching items with query: " + str, e);
                this.f2170h.post(new Runnable() {
                    public void run() {
                        lVar.mo2015a(str, bundle);
                    }
                });
            }
        }

        /* renamed from: a */
        public void mo1972a(@C0047z String str, Bundle bundle, @C0047z C0576p pVar) {
            C0575o oVar;
            C0575o oVar2 = this.f2175n.get(str);
            if (oVar2 == null) {
                C0575o oVar3 = new C0575o();
                this.f2175n.put(str, oVar3);
                oVar = oVar3;
            } else {
                oVar = oVar2;
            }
            Bundle bundle2 = bundle == null ? null : new Bundle(bundle);
            oVar.mo2026a(bundle2, pVar);
            if (this.f2171i == 2) {
                try {
                    this.f2173k.mo2020a(str, pVar.f2214c, bundle2, this.f2174l);
                } catch (RemoteException e) {
                    Log.d(C0541a.f2121a, "addSubscription failed with RemoteException parentId=" + str);
                }
            }
        }

        /* renamed from: a */
        public void mo1973a(@C0047z final String str, @C0047z final C0546c cVar) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("mediaId is empty");
            } else if (cVar == null) {
                throw new IllegalArgumentException("cb is null");
            } else if (this.f2171i != 2) {
                Log.i(C0541a.f2121a, "Not connected, unable to retrieve the MediaItem.");
                this.f2170h.post(new Runnable() {
                    public void run() {
                        cVar.mo1967a(str);
                    }
                });
            } else {
                try {
                    this.f2173k.mo2022a(str, (C0813n) new C0548d(str, cVar, this.f2170h), this.f2174l);
                } catch (RemoteException e) {
                    Log.i(C0541a.f2121a, "Remote error getting media item.");
                    this.f2170h.post(new Runnable() {
                        public void run() {
                            cVar.mo1967a(str);
                        }
                    });
                }
            }
        }

        /* renamed from: a */
        public void mo1974a(@C0047z String str, C0576p pVar) {
            C0575o oVar = this.f2175n.get(str);
            if (oVar != null) {
                if (pVar == null) {
                    try {
                        if (this.f2171i == 2) {
                            this.f2173k.mo2021a(str, (IBinder) null, this.f2174l);
                        }
                    } catch (RemoteException e) {
                        Log.d(C0541a.f2121a, "removeSubscription failed with RemoteException parentId=" + str);
                    }
                } else {
                    List<C0576p> c = oVar.mo2029c();
                    List<Bundle> b = oVar.mo2028b();
                    for (int size = c.size() - 1; size >= 0; size--) {
                        if (c.get(size) == pVar) {
                            if (this.f2171i == 2) {
                                this.f2173k.mo2021a(str, pVar.f2214c, this.f2174l);
                            }
                            c.remove(size);
                            b.remove(size);
                        }
                    }
                }
                if (oVar.mo2027a() || pVar == null) {
                    this.f2175n.remove(str);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo1992b() {
            Log.d(C0541a.f2121a, "MediaBrowserCompat...");
            Log.d(C0541a.f2121a, "  mServiceComponent=" + this.f2167e);
            Log.d(C0541a.f2121a, "  mCallback=" + this.f2168f);
            Log.d(C0541a.f2121a, "  mRootHints=" + this.f2169g);
            Log.d(C0541a.f2121a, "  mState=" + m2836a(this.f2171i));
            Log.d(C0541a.f2121a, "  mServiceConnection=" + this.f2172j);
            Log.d(C0541a.f2121a, "  mServiceBinderWrapper=" + this.f2173k);
            Log.d(C0541a.f2121a, "  mCallbacksMessenger=" + this.f2174l);
            Log.d(C0541a.f2121a, "  mRootId=" + this.f2176o);
            Log.d(C0541a.f2121a, "  mMediaSessionToken=" + this.f2177p);
        }

        /* renamed from: d */
        public void mo1975d() {
            if (this.f2171i != 0) {
                throw new IllegalStateException("connect() called while not disconnected (state=" + m2836a(this.f2171i) + ")");
            } else if (C0541a.f2122b && this.f2172j != null) {
                throw new RuntimeException("mServiceConnection should be null. Instead it is " + this.f2172j);
            } else if (this.f2173k != null) {
                throw new RuntimeException("mServiceBinderWrapper should be null. Instead it is " + this.f2173k);
            } else if (this.f2174l != null) {
                throw new RuntimeException("mCallbacksMessenger should be null. Instead it is " + this.f2174l);
            } else {
                this.f2171i = 1;
                Intent intent = new Intent(C0690g.f2619c);
                intent.setComponent(this.f2167e);
                final C0565a aVar = new C0565a();
                this.f2172j = aVar;
                boolean z = false;
                try {
                    z = this.f2166d.bindService(intent, this.f2172j, 1);
                } catch (Exception e) {
                    Log.e(C0541a.f2121a, "Failed binding to service " + this.f2167e);
                }
                if (!z) {
                    this.f2170h.post(new Runnable() {
                        public void run() {
                            if (aVar == C0559i.this.f2172j) {
                                C0559i.this.mo1991a();
                                C0559i.this.f2168f.mo1959c();
                            }
                        }
                    });
                }
                if (C0541a.f2122b) {
                    Log.d(C0541a.f2121a, "connect...");
                    mo1992b();
                }
            }
        }

        /* renamed from: e */
        public void mo1976e() {
            if (this.f2174l != null) {
                try {
                    this.f2173k.mo2018a(this.f2174l);
                } catch (RemoteException e) {
                    Log.w(C0541a.f2121a, "RemoteException during connect for " + this.f2167e);
                }
            }
            mo1991a();
            if (C0541a.f2122b) {
                Log.d(C0541a.f2121a, "disconnect...");
                mo1992b();
            }
        }

        /* renamed from: f */
        public boolean mo1977f() {
            return this.f2171i == 2;
        }

        @C0047z
        /* renamed from: g */
        public ComponentName mo1978g() {
            if (mo1977f()) {
                return this.f2167e;
            }
            throw new IllegalStateException("getServiceComponent() called while not connected (state=" + this.f2171i + ")");
        }

        @C0047z
        /* renamed from: h */
        public String mo1979h() {
            if (mo1977f()) {
                return this.f2176o;
            }
            throw new IllegalStateException("getRoot() called while not connected(state=" + m2836a(this.f2171i) + ")");
        }

        @C0003aa
        /* renamed from: i */
        public Bundle mo1980i() {
            if (mo1977f()) {
                return this.f2178q;
            }
            throw new IllegalStateException("getExtras() called while not connected (state=" + m2836a(this.f2171i) + ")");
        }

        @C0047z
        /* renamed from: j */
        public C0618h.C0640i mo1981j() {
            if (mo1977f()) {
                return this.f2177p;
            }
            throw new IllegalStateException("getSessionToken() called while not connected(state=" + this.f2171i + ")");
        }
    }

    /* renamed from: android.support.v4.i.a$j */
    interface C0568j {
        /* renamed from: a */
        void mo1982a(Messenger messenger);

        /* renamed from: a */
        void mo1983a(Messenger messenger, String str, C0618h.C0640i iVar, Bundle bundle);

        /* renamed from: a */
        void mo1984a(Messenger messenger, String str, List list, Bundle bundle);
    }

    /* renamed from: android.support.v4.i.a$k */
    public static class C0569k implements Parcelable {
        public static final Parcelable.Creator<C0569k> CREATOR = new Parcelable.Creator<C0569k>() {
            /* renamed from: a */
            public C0569k createFromParcel(Parcel parcel) {
                return new C0569k(parcel);
            }

            /* renamed from: a */
            public C0569k[] newArray(int i) {
                return new C0569k[i];
            }
        };

        /* renamed from: a */
        public static final int f2201a = 1;

        /* renamed from: b */
        public static final int f2202b = 2;

        /* renamed from: c */
        private final int f2203c;

        /* renamed from: d */
        private final C0732k f2204d;

        @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
        @Retention(RetentionPolicy.SOURCE)
        /* renamed from: android.support.v4.i.a$k$a */
        public @interface C0571a {
        }

        C0569k(Parcel parcel) {
            this.f2203c = parcel.readInt();
            this.f2204d = C0732k.CREATOR.createFromParcel(parcel);
        }

        public C0569k(@C0047z C0732k kVar, int i) {
            if (kVar == null) {
                throw new IllegalArgumentException("description cannot be null");
            } else if (TextUtils.isEmpty(kVar.mo2509a())) {
                throw new IllegalArgumentException("description must have a non-empty media id");
            } else {
                this.f2203c = i;
                this.f2204d = kVar;
            }
        }

        /* renamed from: a */
        public static C0569k m2859a(Object obj) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            return new C0569k(C0732k.m3824a(C0676b.C0679c.m3710b(obj)), C0676b.C0679c.m3709a(obj));
        }

        /* renamed from: a */
        public static List<C0569k> m2860a(List<?> list) {
            if (list == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (Object a : list) {
                arrayList.add(m2859a((Object) a));
            }
            return arrayList;
        }

        /* renamed from: a */
        public int mo2003a() {
            return this.f2203c;
        }

        /* renamed from: b */
        public boolean mo2004b() {
            return (this.f2203c & 1) != 0;
        }

        /* renamed from: c */
        public boolean mo2005c() {
            return (this.f2203c & 2) != 0;
        }

        @C0047z
        /* renamed from: d */
        public C0732k mo2006d() {
            return this.f2204d;
        }

        public int describeContents() {
            return 0;
        }

        @C0003aa
        /* renamed from: e */
        public String mo2008e() {
            return this.f2204d.mo2509a();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("MediaItem{");
            sb.append("mFlags=").append(this.f2203c);
            sb.append(", mDescription=").append(this.f2204d);
            sb.append('}');
            return sb.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f2203c);
            this.f2204d.writeToParcel(parcel, i);
        }
    }

    /* renamed from: android.support.v4.i.a$l */
    public static abstract class C0572l {
        /* renamed from: a */
        public void mo2015a(@C0047z String str, Bundle bundle) {
        }

        /* renamed from: a */
        public void mo2016a(@C0047z String str, Bundle bundle, @C0047z List<C0569k> list) {
        }
    }

    /* renamed from: android.support.v4.i.a$m */
    private static class C0573m extends C0813n {

        /* renamed from: d */
        private final String f2205d;

        /* renamed from: e */
        private final Bundle f2206e;

        /* renamed from: f */
        private final C0572l f2207f;

        C0573m(String str, Bundle bundle, C0572l lVar, Handler handler) {
            super(handler);
            this.f2205d = str;
            this.f2206e = bundle;
            this.f2207f = lVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo1970a(int i, Bundle bundle) {
            if (i != 0 || bundle == null || !bundle.containsKey(C0690g.f2621e)) {
                this.f2207f.mo2015a(this.f2205d, this.f2206e);
                return;
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray(C0690g.f2621e);
            ArrayList arrayList = null;
            if (parcelableArray != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Parcelable parcelable : parcelableArray) {
                    arrayList2.add((C0569k) parcelable);
                }
                arrayList = arrayList2;
            }
            this.f2207f.mo2016a(this.f2205d, this.f2206e, arrayList);
        }
    }

    /* renamed from: android.support.v4.i.a$n */
    private static class C0574n {

        /* renamed from: a */
        private Messenger f2208a;

        /* renamed from: b */
        private Bundle f2209b;

        public C0574n(IBinder iBinder, Bundle bundle) {
            this.f2208a = new Messenger(iBinder);
            this.f2209b = bundle;
        }

        /* renamed from: a */
        private void m2871a(int i, Bundle bundle, Messenger messenger) {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.arg1 = 1;
            obtain.setData(bundle);
            obtain.replyTo = messenger;
            this.f2208a.send(obtain);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2017a(Context context, Messenger messenger) {
            Bundle bundle = new Bundle();
            bundle.putString(C0689f.f2597g, context.getPackageName());
            bundle.putBundle(C0689f.f2599i, this.f2209b);
            m2871a(1, bundle, messenger);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2018a(Messenger messenger) {
            m2871a(2, (Bundle) null, messenger);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2019a(String str, Bundle bundle, C0813n nVar, Messenger messenger) {
            Bundle bundle2 = new Bundle();
            bundle2.putString(C0689f.f2601k, str);
            bundle2.putBundle(C0689f.f2600j, bundle);
            bundle2.putParcelable(C0689f.f2598h, nVar);
            m2871a(8, bundle2, messenger);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2020a(String str, IBinder iBinder, Bundle bundle, Messenger messenger) {
            Bundle bundle2 = new Bundle();
            bundle2.putString(C0689f.f2593c, str);
            C0411y.m2302a(bundle2, C0689f.f2591a, iBinder);
            bundle2.putBundle(C0689f.f2596f, bundle);
            m2871a(3, bundle2, messenger);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2021a(String str, IBinder iBinder, Messenger messenger) {
            Bundle bundle = new Bundle();
            bundle.putString(C0689f.f2593c, str);
            C0411y.m2302a(bundle, C0689f.f2591a, iBinder);
            m2871a(4, bundle, messenger);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2022a(String str, C0813n nVar, Messenger messenger) {
            Bundle bundle = new Bundle();
            bundle.putString(C0689f.f2593c, str);
            bundle.putParcelable(C0689f.f2598h, nVar);
            m2871a(5, bundle, messenger);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo2023b(Messenger messenger) {
            Bundle bundle = new Bundle();
            bundle.putBundle(C0689f.f2599i, this.f2209b);
            m2871a(6, bundle, messenger);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo2024c(Messenger messenger) {
            m2871a(7, (Bundle) null, messenger);
        }
    }

    /* renamed from: android.support.v4.i.a$o */
    private static class C0575o {

        /* renamed from: a */
        private final List<C0576p> f2210a = new ArrayList();

        /* renamed from: b */
        private final List<Bundle> f2211b = new ArrayList();

        /* renamed from: a */
        public C0576p mo2025a(Bundle bundle) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= this.f2211b.size()) {
                    return null;
                }
                if (C0688e.m3722a(this.f2211b.get(i2), bundle)) {
                    return this.f2210a.get(i2);
                }
                i = i2 + 1;
            }
        }

        /* renamed from: a */
        public void mo2026a(Bundle bundle, C0576p pVar) {
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= this.f2211b.size()) {
                    this.f2210a.add(pVar);
                    this.f2211b.add(bundle);
                    return;
                } else if (C0688e.m3722a(this.f2211b.get(i2), bundle)) {
                    this.f2210a.set(i2, pVar);
                    return;
                } else {
                    i = i2 + 1;
                }
            }
        }

        /* renamed from: a */
        public boolean mo2027a() {
            return this.f2210a.isEmpty();
        }

        /* renamed from: b */
        public List<Bundle> mo2028b() {
            return this.f2211b;
        }

        /* renamed from: c */
        public List<C0576p> mo2029c() {
            return this.f2210a;
        }
    }

    /* renamed from: android.support.v4.i.a$p */
    public static abstract class C0576p {

        /* renamed from: a */
        WeakReference<C0575o> f2212a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final Object f2213b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final IBinder f2214c;

        /* renamed from: android.support.v4.i.a$p$a */
        private class C0577a implements C0676b.C0680d {
            C0577a() {
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public List<C0569k> mo2034a(List<C0569k> list, Bundle bundle) {
                if (list == null) {
                    return null;
                }
                int i = bundle.getInt(C0541a.f2123c, -1);
                int i2 = bundle.getInt(C0541a.f2124d, -1);
                if (i == -1 && i2 == -1) {
                    return list;
                }
                int i3 = i2 * i;
                int i4 = i3 + i2;
                if (i < 0 || i2 < 1 || i3 >= list.size()) {
                    return Collections.EMPTY_LIST;
                }
                if (i4 > list.size()) {
                    i4 = list.size();
                }
                return list.subList(i3, i4);
            }

            /* renamed from: a */
            public void mo2035a(@C0047z String str) {
                C0576p.this.mo2030a(str);
            }

            /* renamed from: a */
            public void mo2036a(@C0047z String str, List<?> list) {
                C0575o oVar = C0576p.this.f2212a == null ? null : (C0575o) C0576p.this.f2212a.get();
                if (oVar == null) {
                    C0576p.this.mo2032a(str, C0569k.m2860a(list));
                    return;
                }
                List<C0569k> a = C0569k.m2860a(list);
                List<C0576p> c = oVar.mo2029c();
                List<Bundle> b = oVar.mo2028b();
                int i = 0;
                while (true) {
                    int i2 = i;
                    if (i2 < c.size()) {
                        Bundle bundle = b.get(i2);
                        if (bundle == null) {
                            C0576p.this.mo2032a(str, a);
                        } else {
                            C0576p.this.mo2033a(str, mo2034a(a, bundle), bundle);
                        }
                        i = i2 + 1;
                    } else {
                        return;
                    }
                }
            }
        }

        /* renamed from: android.support.v4.i.a$p$b */
        private class C0578b extends C0577a implements C0685d.C0686a {
            C0578b() {
                super();
            }

            /* renamed from: a */
            public void mo2037a(@C0047z String str, @C0047z Bundle bundle) {
                C0576p.this.mo2031a(str, bundle);
            }

            /* renamed from: a */
            public void mo2038a(@C0047z String str, List<?> list, @C0047z Bundle bundle) {
                C0576p.this.mo2033a(str, C0569k.m2860a(list), bundle);
            }
        }

        public C0576p() {
            if (Build.VERSION.SDK_INT >= 26 || C0798c.m4074c()) {
                this.f2213b = C0685d.m3717a(new C0578b());
                this.f2214c = null;
            } else if (Build.VERSION.SDK_INT >= 21) {
                this.f2213b = C0676b.m3696a((C0676b.C0680d) new C0577a());
                this.f2214c = new Binder();
            } else {
                this.f2213b = null;
                this.f2214c = new Binder();
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m2886a(C0575o oVar) {
            this.f2212a = new WeakReference<>(oVar);
        }

        /* renamed from: a */
        public void mo2030a(@C0047z String str) {
        }

        /* renamed from: a */
        public void mo2031a(@C0047z String str, @C0047z Bundle bundle) {
        }

        /* renamed from: a */
        public void mo2032a(@C0047z String str, @C0047z List<C0569k> list) {
        }

        /* renamed from: a */
        public void mo2033a(@C0047z String str, @C0047z List<C0569k> list, @C0047z Bundle bundle) {
        }
    }

    public C0541a(Context context, ComponentName componentName, C0543b bVar, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 26 || C0798c.m4074c()) {
            this.f2125e = new C0558h(context, componentName, bVar, bundle);
        } else if (Build.VERSION.SDK_INT >= 23) {
            this.f2125e = new C0557g(context, componentName, bVar, bundle);
        } else if (Build.VERSION.SDK_INT >= 21) {
            this.f2125e = new C0550f(context, componentName, bVar, bundle);
        } else {
            this.f2125e = new C0559i(context, componentName, bVar, bundle);
        }
    }

    /* renamed from: a */
    public void mo1941a() {
        this.f2125e.mo1975d();
    }

    /* renamed from: a */
    public void mo1942a(@C0047z String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("parentId is empty");
        }
        this.f2125e.mo1974a(str, (C0576p) null);
    }

    /* renamed from: a */
    public void mo1943a(@C0047z String str, Bundle bundle, @C0047z C0572l lVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("query cannot be empty");
        } else if (lVar == null) {
            throw new IllegalArgumentException("callback cannot be null");
        } else {
            this.f2125e.mo1971a(str, bundle, lVar);
        }
    }

    /* renamed from: a */
    public void mo1944a(@C0047z String str, @C0047z Bundle bundle, @C0047z C0576p pVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("parentId is empty");
        } else if (pVar == null) {
            throw new IllegalArgumentException("callback is null");
        } else if (bundle == null) {
            throw new IllegalArgumentException("options are null");
        } else {
            this.f2125e.mo1972a(str, bundle, pVar);
        }
    }

    /* renamed from: a */
    public void mo1945a(@C0047z String str, @C0047z C0546c cVar) {
        this.f2125e.mo1973a(str, cVar);
    }

    /* renamed from: a */
    public void mo1946a(@C0047z String str, @C0047z C0576p pVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("parentId is empty");
        } else if (pVar == null) {
            throw new IllegalArgumentException("callback is null");
        } else {
            this.f2125e.mo1972a(str, (Bundle) null, pVar);
        }
    }

    /* renamed from: b */
    public void mo1947b() {
        this.f2125e.mo1976e();
    }

    /* renamed from: b */
    public void mo1948b(@C0047z String str, @C0047z C0576p pVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("parentId is empty");
        } else if (pVar == null) {
            throw new IllegalArgumentException("callback is null");
        } else {
            this.f2125e.mo1974a(str, pVar);
        }
    }

    /* renamed from: c */
    public boolean mo1949c() {
        return this.f2125e.mo1977f();
    }

    @C0047z
    /* renamed from: d */
    public ComponentName mo1950d() {
        return this.f2125e.mo1978g();
    }

    @C0047z
    /* renamed from: e */
    public String mo1951e() {
        return this.f2125e.mo1979h();
    }

    @C0003aa
    /* renamed from: f */
    public Bundle mo1952f() {
        return this.f2125e.mo1980i();
    }

    @C0047z
    /* renamed from: g */
    public C0618h.C0640i mo1953g() {
        return this.f2125e.mo1981j();
    }
}
