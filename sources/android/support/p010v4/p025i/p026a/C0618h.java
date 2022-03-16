package android.support.p010v4.p025i.p026a;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.annotation.C0011ag;
import android.support.p010v4.p013c.C0411y;
import android.support.p010v4.p025i.C0732k;
import android.support.p010v4.p025i.C0739n;
import android.support.p010v4.p025i.C0749q;
import android.support.p010v4.p025i.C0768y;
import android.support.p010v4.p025i.p026a.C0582b;
import android.support.p010v4.p025i.p026a.C0643j;
import android.support.p010v4.p025i.p026a.C0646k;
import android.support.p010v4.p025i.p026a.C0649l;
import android.support.p010v4.p025i.p026a.C0654n;
import android.support.p010v4.p025i.p026a.C0657o;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: android.support.v4.i.a.h */
public class C0618h {

    /* renamed from: a */
    static final String f2336a = "MediaSessionCompat";

    /* renamed from: b */
    public static final int f2337b = 1;

    /* renamed from: c */
    public static final int f2338c = 2;

    /* renamed from: d */
    public static final int f2339d = 4;

    /* renamed from: e */
    static final String f2340e = "android.support.v4.media.session.action.PLAY_FROM_URI";

    /* renamed from: f */
    static final String f2341f = "android.support.v4.media.session.action.PREPARE";

    /* renamed from: g */
    static final String f2342g = "android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID";

    /* renamed from: h */
    static final String f2343h = "android.support.v4.media.session.action.PREPARE_FROM_SEARCH";

    /* renamed from: i */
    static final String f2344i = "android.support.v4.media.session.action.PREPARE_FROM_URI";

    /* renamed from: j */
    static final String f2345j = "android.support.v4.media.session.action.SET_REPEAT_MODE";

    /* renamed from: k */
    static final String f2346k = "android.support.v4.media.session.action.SET_SHUFFLE_MODE_ENABLED";

    /* renamed from: l */
    static final String f2347l = "android.support.v4.media.session.action.ARGUMENT_MEDIA_ID";

    /* renamed from: m */
    static final String f2348m = "android.support.v4.media.session.action.ARGUMENT_QUERY";

    /* renamed from: n */
    static final String f2349n = "android.support.v4.media.session.action.ARGUMENT_URI";

    /* renamed from: o */
    static final String f2350o = "android.support.v4.media.session.action.ARGUMENT_EXTRAS";

    /* renamed from: p */
    static final String f2351p = "android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE";

    /* renamed from: q */
    static final String f2352q = "android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE_ENABLED";

    /* renamed from: r */
    static final String f2353r = "android.support.v4.media.session.EXTRA_BINDER";

    /* renamed from: s */
    static int f2354s = 0;

    /* renamed from: w */
    private static final int f2355w = 320;

    /* renamed from: t */
    private final C0625b f2356t;

    /* renamed from: u */
    private final C0586d f2357u;

    /* renamed from: v */
    private final ArrayList<C0634e> f2358v;

    /* renamed from: android.support.v4.i.a.h$a */
    public static abstract class C0621a {

        /* renamed from: b */
        final Object f2361b;

        /* renamed from: c */
        WeakReference<C0625b> f2362c;

        /* renamed from: android.support.v4.i.a.h$a$a */
        private class C0622a implements C0649l.C0650a {
            C0622a() {
            }

            /* renamed from: a */
            public void mo2266a() {
                C0621a.this.mo2251b();
            }

            /* renamed from: a */
            public void mo2267a(long j) {
                C0621a.this.mo2242a(j);
            }

            /* renamed from: a */
            public void mo2268a(Object obj) {
                C0621a.this.mo2246a(C0749q.m3904a(obj));
            }

            /* renamed from: a */
            public void mo2269a(String str, Bundle bundle) {
                C0621a.this.mo2258c(str, bundle);
            }

            /* renamed from: a */
            public void mo2270a(String str, Bundle bundle, ResultReceiver resultReceiver) {
                if (str.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                    C0626c cVar = (C0626c) C0621a.this.f2362c.get();
                    if (cVar != null) {
                        Bundle bundle2 = new Bundle();
                        C0411y.m2302a(bundle2, C0618h.f2353r, cVar.mo2308g());
                        resultReceiver.send(0, bundle2);
                    }
                } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM")) {
                    bundle.setClassLoader(C0732k.class.getClassLoader());
                    C0621a.this.mo2244a((C0732k) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"));
                } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                    bundle.setClassLoader(C0732k.class.getClassLoader());
                    C0621a.this.mo2245a((C0732k) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX"));
                } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
                    bundle.setClassLoader(C0732k.class.getClassLoader());
                    C0621a.this.mo2255b((C0732k) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"));
                } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT")) {
                    C0621a.this.mo2252b(bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX"));
                } else {
                    C0621a.this.mo2248a(str, bundle, resultReceiver);
                }
            }

            /* renamed from: a */
            public boolean mo2271a(Intent intent) {
                return C0621a.this.mo2250a(intent);
            }

            /* renamed from: b */
            public void mo2272b() {
                C0621a.this.mo2257c();
            }

            /* renamed from: b */
            public void mo2273b(long j) {
                C0621a.this.mo2253b(j);
            }

            /* renamed from: b */
            public void mo2274b(String str, Bundle bundle) {
                C0621a.this.mo2260d(str, bundle);
            }

            /* renamed from: c */
            public void mo2275c() {
                C0621a.this.mo2259d();
            }

            /* renamed from: c */
            public void mo2276c(String str, Bundle bundle) {
                if (str.equals(C0618h.f2340e)) {
                    C0621a.this.mo2254b((Uri) bundle.getParcelable(C0618h.f2349n), (Bundle) bundle.getParcelable(C0618h.f2350o));
                } else if (str.equals(C0618h.f2341f)) {
                    C0621a.this.mo2240a();
                } else if (str.equals(C0618h.f2342g)) {
                    C0621a.this.mo2247a(bundle.getString(C0618h.f2347l), bundle.getBundle(C0618h.f2350o));
                } else if (str.equals(C0618h.f2343h)) {
                    C0621a.this.mo2256b(bundle.getString(C0618h.f2348m), bundle.getBundle(C0618h.f2350o));
                } else if (str.equals(C0618h.f2344i)) {
                    Bundle bundle2 = bundle.getBundle(C0618h.f2350o);
                    C0621a.this.mo2243a((Uri) bundle.getParcelable(C0618h.f2349n), bundle2);
                } else if (str.equals(C0618h.f2345j)) {
                    C0621a.this.mo2241a(bundle.getInt(C0618h.f2351p));
                } else if (str.equals(C0618h.f2346k)) {
                    C0621a.this.mo2249a(bundle.getBoolean(C0618h.f2352q));
                } else {
                    C0621a.this.mo2262e(str, bundle);
                }
            }

            /* renamed from: d */
            public void mo2277d() {
                C0621a.this.mo2261e();
            }

            /* renamed from: e */
            public void mo2278e() {
                C0621a.this.mo2263f();
            }

            /* renamed from: f */
            public void mo2279f() {
                C0621a.this.mo2264g();
            }

            /* renamed from: g */
            public void mo2280g() {
                C0621a.this.mo2265h();
            }
        }

        /* renamed from: android.support.v4.i.a.h$a$b */
        private class C0623b extends C0622a implements C0654n.C0655a {
            C0623b() {
                super();
            }

            /* renamed from: a */
            public void mo2281a(Uri uri, Bundle bundle) {
                C0621a.this.mo2254b(uri, bundle);
            }
        }

        /* renamed from: android.support.v4.i.a.h$a$c */
        private class C0624c extends C0623b implements C0657o.C0658a {
            C0624c() {
                super();
            }

            /* renamed from: b */
            public void mo2282b(Uri uri, Bundle bundle) {
                C0621a.this.mo2243a(uri, bundle);
            }

            /* renamed from: d */
            public void mo2283d(String str, Bundle bundle) {
                C0621a.this.mo2247a(str, bundle);
            }

            /* renamed from: e */
            public void mo2284e(String str, Bundle bundle) {
                C0621a.this.mo2256b(str, bundle);
            }

            /* renamed from: h */
            public void mo2285h() {
                C0621a.this.mo2240a();
            }
        }

        public C0621a() {
            if (Build.VERSION.SDK_INT >= 24) {
                this.f2361b = C0657o.m3632a((C0657o.C0658a) new C0624c());
            } else if (Build.VERSION.SDK_INT >= 23) {
                this.f2361b = C0654n.m3630a(new C0623b());
            } else if (Build.VERSION.SDK_INT >= 21) {
                this.f2361b = C0649l.m3594a((C0649l.C0650a) new C0622a());
            } else {
                this.f2361b = null;
            }
        }

        /* renamed from: a */
        public void mo2240a() {
        }

        /* renamed from: a */
        public void mo2241a(int i) {
        }

        /* renamed from: a */
        public void mo2242a(long j) {
        }

        /* renamed from: a */
        public void mo2243a(Uri uri, Bundle bundle) {
        }

        /* renamed from: a */
        public void mo2244a(C0732k kVar) {
        }

        /* renamed from: a */
        public void mo2245a(C0732k kVar, int i) {
        }

        /* renamed from: a */
        public void mo2246a(C0749q qVar) {
        }

        /* renamed from: a */
        public void mo2247a(String str, Bundle bundle) {
        }

        /* renamed from: a */
        public void mo2248a(String str, Bundle bundle, ResultReceiver resultReceiver) {
        }

        /* renamed from: a */
        public void mo2249a(boolean z) {
        }

        /* renamed from: a */
        public boolean mo2250a(Intent intent) {
            return false;
        }

        /* renamed from: b */
        public void mo2251b() {
        }

        /* renamed from: b */
        public void mo2252b(int i) {
        }

        /* renamed from: b */
        public void mo2253b(long j) {
        }

        /* renamed from: b */
        public void mo2254b(Uri uri, Bundle bundle) {
        }

        /* renamed from: b */
        public void mo2255b(C0732k kVar) {
        }

        /* renamed from: b */
        public void mo2256b(String str, Bundle bundle) {
        }

        /* renamed from: c */
        public void mo2257c() {
        }

        /* renamed from: c */
        public void mo2258c(String str, Bundle bundle) {
        }

        /* renamed from: d */
        public void mo2259d() {
        }

        /* renamed from: d */
        public void mo2260d(String str, Bundle bundle) {
        }

        /* renamed from: e */
        public void mo2261e() {
        }

        /* renamed from: e */
        public void mo2262e(String str, Bundle bundle) {
        }

        /* renamed from: f */
        public void mo2263f() {
        }

        /* renamed from: g */
        public void mo2264g() {
        }

        /* renamed from: h */
        public void mo2265h() {
        }
    }

    /* renamed from: android.support.v4.i.a.h$b */
    interface C0625b {
        /* renamed from: a */
        void mo2286a(int i);

        /* renamed from: a */
        void mo2287a(PendingIntent pendingIntent);

        /* renamed from: a */
        void mo2288a(Bundle bundle);

        /* renamed from: a */
        void mo2289a(C0621a aVar, Handler handler);

        /* renamed from: a */
        void mo2290a(C0662q qVar);

        /* renamed from: a */
        void mo2291a(C0739n nVar);

        /* renamed from: a */
        void mo2292a(C0768y yVar);

        /* renamed from: a */
        void mo2293a(CharSequence charSequence);

        /* renamed from: a */
        void mo2294a(String str, Bundle bundle);

        /* renamed from: a */
        void mo2295a(List<C0635f> list);

        /* renamed from: a */
        void mo2296a(boolean z);

        /* renamed from: a */
        boolean mo2297a();

        /* renamed from: b */
        void mo2298b();

        /* renamed from: b */
        void mo2299b(int i);

        /* renamed from: b */
        void mo2300b(PendingIntent pendingIntent);

        /* renamed from: b */
        void mo2301b(boolean z);

        /* renamed from: c */
        C0640i mo2302c();

        /* renamed from: c */
        void mo2303c(int i);

        /* renamed from: d */
        Object mo2304d();

        /* renamed from: d */
        void mo2305d(int i);

        /* renamed from: e */
        Object mo2306e();

        /* renamed from: f */
        String mo2307f();
    }

    /* renamed from: android.support.v4.i.a.h$c */
    static class C0626c implements C0625b {

        /* renamed from: a */
        int f2366a;

        /* renamed from: b */
        int f2367b;

        /* renamed from: c */
        boolean f2368c;

        /* renamed from: d */
        private final Object f2369d;

        /* renamed from: e */
        private final C0640i f2370e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public boolean f2371f = false;

        /* renamed from: g */
        private C0627a f2372g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public final RemoteCallbackList<C0579a> f2373h = new RemoteCallbackList<>();
        /* access modifiers changed from: private */

        /* renamed from: i */
        public C0662q f2374i;

        /* renamed from: android.support.v4.i.a.h$c$a */
        class C0627a extends C0582b.C0583a {
            C0627a() {
            }

            /* renamed from: a */
            public void mo2053a(int i) {
                throw new AssertionError();
            }

            /* renamed from: a */
            public void mo2054a(int i, int i2, String str) {
                throw new AssertionError();
            }

            /* renamed from: a */
            public void mo2055a(long j) {
                throw new AssertionError();
            }

            /* renamed from: a */
            public void mo2056a(Uri uri, Bundle bundle) {
                throw new AssertionError();
            }

            /* renamed from: a */
            public void mo2057a(C0579a aVar) {
                if (!C0626c.this.f2371f) {
                    C0626c.this.f2373h.register(aVar);
                }
            }

            /* renamed from: a */
            public void mo2058a(C0732k kVar) {
                throw new AssertionError();
            }

            /* renamed from: a */
            public void mo2059a(C0732k kVar, int i) {
                throw new AssertionError();
            }

            /* renamed from: a */
            public void mo2060a(C0749q qVar) {
                throw new AssertionError();
            }

            /* renamed from: a */
            public void mo2061a(String str, Bundle bundle) {
                throw new AssertionError();
            }

            /* renamed from: a */
            public void mo2062a(String str, Bundle bundle, C0637g gVar) {
                throw new AssertionError();
            }

            /* renamed from: a */
            public void mo2063a(boolean z) {
                throw new AssertionError();
            }

            /* renamed from: a */
            public boolean mo2064a() {
                throw new AssertionError();
            }

            /* renamed from: a */
            public boolean mo2065a(KeyEvent keyEvent) {
                throw new AssertionError();
            }

            /* renamed from: b */
            public String mo2066b() {
                throw new AssertionError();
            }

            /* renamed from: b */
            public void mo2067b(int i) {
                throw new AssertionError();
            }

            /* renamed from: b */
            public void mo2068b(int i, int i2, String str) {
                throw new AssertionError();
            }

            /* renamed from: b */
            public void mo2069b(long j) {
                throw new AssertionError();
            }

            /* renamed from: b */
            public void mo2070b(Uri uri, Bundle bundle) {
                throw new AssertionError();
            }

            /* renamed from: b */
            public void mo2071b(C0579a aVar) {
                C0626c.this.f2373h.unregister(aVar);
            }

            /* renamed from: b */
            public void mo2072b(C0732k kVar) {
                throw new AssertionError();
            }

            /* renamed from: b */
            public void mo2073b(String str, Bundle bundle) {
                throw new AssertionError();
            }

            /* renamed from: c */
            public String mo2074c() {
                throw new AssertionError();
            }

            /* renamed from: c */
            public void mo2075c(String str, Bundle bundle) {
                throw new AssertionError();
            }

            /* renamed from: d */
            public PendingIntent mo2076d() {
                throw new AssertionError();
            }

            /* renamed from: d */
            public void mo2077d(String str, Bundle bundle) {
                throw new AssertionError();
            }

            /* renamed from: e */
            public long mo2078e() {
                throw new AssertionError();
            }

            /* renamed from: e */
            public void mo2079e(String str, Bundle bundle) {
                throw new AssertionError();
            }

            /* renamed from: f */
            public C0660p mo2080f() {
                throw new AssertionError();
            }

            /* renamed from: g */
            public C0739n mo2081g() {
                throw new AssertionError();
            }

            /* renamed from: h */
            public C0662q mo2082h() {
                return C0626c.this.f2374i;
            }

            /* renamed from: i */
            public List<C0635f> mo2083i() {
                return null;
            }

            /* renamed from: j */
            public CharSequence mo2084j() {
                throw new AssertionError();
            }

            /* renamed from: k */
            public Bundle mo2085k() {
                throw new AssertionError();
            }

            /* renamed from: l */
            public int mo2086l() {
                return C0626c.this.f2366a;
            }

            /* renamed from: m */
            public int mo2087m() {
                return C0626c.this.f2367b;
            }

            /* renamed from: n */
            public boolean mo2088n() {
                return C0626c.this.f2368c;
            }

            /* renamed from: o */
            public void mo2089o() {
                throw new AssertionError();
            }

            /* renamed from: p */
            public void mo2090p() {
                throw new AssertionError();
            }

            /* renamed from: q */
            public void mo2091q() {
                throw new AssertionError();
            }

            /* renamed from: r */
            public void mo2092r() {
                throw new AssertionError();
            }

            /* renamed from: s */
            public void mo2093s() {
                throw new AssertionError();
            }

            /* renamed from: t */
            public void mo2094t() {
                throw new AssertionError();
            }

            /* renamed from: u */
            public void mo2095u() {
                throw new AssertionError();
            }

            /* renamed from: v */
            public void mo2096v() {
                throw new AssertionError();
            }
        }

        public C0626c(Context context, String str) {
            this.f2369d = C0649l.m3593a(context, str);
            this.f2370e = new C0640i(C0649l.m3612e(this.f2369d));
        }

        public C0626c(Object obj) {
            this.f2369d = C0649l.m3595a(obj);
            this.f2370e = new C0640i(C0649l.m3612e(this.f2369d));
        }

        /* renamed from: a */
        public void mo2286a(int i) {
            C0649l.m3596a(this.f2369d, i);
        }

        /* renamed from: a */
        public void mo2287a(PendingIntent pendingIntent) {
            C0649l.m3597a(this.f2369d, pendingIntent);
        }

        /* renamed from: a */
        public void mo2288a(Bundle bundle) {
            C0649l.m3598a(this.f2369d, bundle);
        }

        /* renamed from: a */
        public void mo2289a(C0621a aVar, Handler handler) {
            C0649l.m3601a(this.f2369d, aVar == null ? null : aVar.f2361b, handler);
            if (aVar != null) {
                aVar.f2362c = new WeakReference<>(this);
            }
        }

        /* renamed from: a */
        public void mo2290a(C0662q qVar) {
            this.f2374i = qVar;
            for (int beginBroadcast = this.f2373h.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f2373h.getBroadcastItem(beginBroadcast).mo2043a(qVar);
                } catch (RemoteException e) {
                }
            }
            this.f2373h.finishBroadcast();
            C0649l.m3608b(this.f2369d, qVar == null ? null : qVar.mo2390l());
        }

        /* renamed from: a */
        public void mo2291a(C0739n nVar) {
            C0649l.m3609c(this.f2369d, nVar == null ? null : nVar.mo2544e());
        }

        /* renamed from: a */
        public void mo2292a(C0768y yVar) {
            C0649l.m3600a(this.f2369d, yVar.mo2634d());
        }

        /* renamed from: a */
        public void mo2293a(CharSequence charSequence) {
            C0649l.m3599a(this.f2369d, charSequence);
        }

        /* renamed from: a */
        public void mo2294a(String str, Bundle bundle) {
            if (Build.VERSION.SDK_INT < 23) {
                for (int beginBroadcast = this.f2373h.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        this.f2373h.getBroadcastItem(beginBroadcast).mo2046a(str, bundle);
                    } catch (RemoteException e) {
                    }
                }
                this.f2373h.finishBroadcast();
            }
            C0649l.m3602a(this.f2369d, str, bundle);
        }

        /* renamed from: a */
        public void mo2295a(List<C0635f> list) {
            ArrayList arrayList = null;
            if (list != null) {
                ArrayList arrayList2 = new ArrayList();
                for (C0635f c : list) {
                    arrayList2.add(c.mo2327c());
                }
                arrayList = arrayList2;
            }
            C0649l.m3603a(this.f2369d, (List<Object>) arrayList);
        }

        /* renamed from: a */
        public void mo2296a(boolean z) {
            C0649l.m3604a(this.f2369d, z);
        }

        /* renamed from: a */
        public boolean mo2297a() {
            return C0649l.m3610c(this.f2369d);
        }

        /* renamed from: b */
        public void mo2298b() {
            this.f2371f = true;
            C0649l.m3611d(this.f2369d);
        }

        /* renamed from: b */
        public void mo2299b(int i) {
            C0649l.m3606b(this.f2369d, i);
        }

        /* renamed from: b */
        public void mo2300b(PendingIntent pendingIntent) {
            C0649l.m3607b(this.f2369d, pendingIntent);
        }

        /* renamed from: b */
        public void mo2301b(boolean z) {
            if (this.f2368c != z) {
                this.f2368c = z;
                for (int beginBroadcast = this.f2373h.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        this.f2373h.getBroadcastItem(beginBroadcast).mo2048a(z);
                    } catch (RemoteException e) {
                    }
                }
                this.f2373h.finishBroadcast();
            }
        }

        /* renamed from: c */
        public C0640i mo2302c() {
            return this.f2370e;
        }

        /* renamed from: c */
        public void mo2303c(int i) {
            if (Build.VERSION.SDK_INT < 22) {
                this.f2366a = i;
            } else {
                C0653m.m3629a(this.f2369d, i);
            }
        }

        /* renamed from: d */
        public Object mo2304d() {
            return this.f2369d;
        }

        /* renamed from: d */
        public void mo2305d(int i) {
            if (this.f2367b != i) {
                this.f2367b = i;
                for (int beginBroadcast = this.f2373h.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        this.f2373h.getBroadcastItem(beginBroadcast).mo2040a(i);
                    } catch (RemoteException e) {
                    }
                }
                this.f2373h.finishBroadcast();
            }
        }

        /* renamed from: e */
        public Object mo2306e() {
            return null;
        }

        /* renamed from: f */
        public String mo2307f() {
            if (Build.VERSION.SDK_INT < 24) {
                return null;
            }
            return C0657o.m3633a(this.f2369d);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public C0627a mo2308g() {
            if (this.f2372g == null) {
                this.f2372g = new C0627a();
            }
            return this.f2372g;
        }
    }

    /* renamed from: android.support.v4.i.a.h$d */
    static class C0628d implements C0625b {

        /* renamed from: A */
        private C0633c f2376A;

        /* renamed from: B */
        private boolean f2377B = false;

        /* renamed from: C */
        private boolean f2378C = false;

        /* renamed from: D */
        private boolean f2379D = false;

        /* renamed from: E */
        private C0768y.C0770a f2380E = new C0768y.C0770a() {
            /* renamed from: a */
            public void mo2318a(C0768y yVar) {
                if (C0628d.this.f2400t == yVar) {
                    C0628d.this.mo2313a(new C0660p(C0628d.this.f2398r, C0628d.this.f2399s, yVar.mo2630b(), yVar.mo2632c(), yVar.mo2627a()));
                }
            }
        };

        /* renamed from: a */
        final String f2381a;

        /* renamed from: b */
        final String f2382b;

        /* renamed from: c */
        final AudioManager f2383c;

        /* renamed from: d */
        final Object f2384d = new Object();

        /* renamed from: e */
        final RemoteCallbackList<C0579a> f2385e = new RemoteCallbackList<>();

        /* renamed from: f */
        boolean f2386f = false;

        /* renamed from: g */
        volatile C0621a f2387g;

        /* renamed from: h */
        int f2388h;

        /* renamed from: i */
        C0739n f2389i;

        /* renamed from: j */
        C0662q f2390j;

        /* renamed from: k */
        PendingIntent f2391k;

        /* renamed from: l */
        List<C0635f> f2392l;

        /* renamed from: m */
        CharSequence f2393m;

        /* renamed from: n */
        int f2394n;

        /* renamed from: o */
        int f2395o;

        /* renamed from: p */
        boolean f2396p;

        /* renamed from: q */
        Bundle f2397q;

        /* renamed from: r */
        int f2398r;

        /* renamed from: s */
        int f2399s;

        /* renamed from: t */
        C0768y f2400t;

        /* renamed from: u */
        private final Context f2401u;

        /* renamed from: v */
        private final ComponentName f2402v;

        /* renamed from: w */
        private final PendingIntent f2403w;

        /* renamed from: x */
        private final Object f2404x;

        /* renamed from: y */
        private final C0632b f2405y;

        /* renamed from: z */
        private final C0640i f2406z;

        /* renamed from: android.support.v4.i.a.h$d$a */
        private static final class C0631a {

            /* renamed from: a */
            public final String f2409a;

            /* renamed from: b */
            public final Bundle f2410b;

            /* renamed from: c */
            public final ResultReceiver f2411c;

            public C0631a(String str, Bundle bundle, ResultReceiver resultReceiver) {
                this.f2409a = str;
                this.f2410b = bundle;
                this.f2411c = resultReceiver;
            }
        }

        /* renamed from: android.support.v4.i.a.h$d$b */
        class C0632b extends C0582b.C0583a {
            C0632b() {
            }

            /* renamed from: a */
            public void mo2053a(int i) {
                C0628d.this.mo2309a(28, i);
            }

            /* renamed from: a */
            public void mo2054a(int i, int i2, String str) {
                C0628d.this.mo2314b(i, i2);
            }

            /* renamed from: a */
            public void mo2055a(long j) {
                C0628d.this.mo2310a(11, (Object) Long.valueOf(j));
            }

            /* renamed from: a */
            public void mo2056a(Uri uri, Bundle bundle) {
                C0628d.this.mo2312a(6, (Object) uri, bundle);
            }

            /* renamed from: a */
            public void mo2057a(C0579a aVar) {
                if (C0628d.this.f2386f) {
                    try {
                        aVar.mo2039a();
                    } catch (Exception e) {
                    }
                } else {
                    C0628d.this.f2385e.register(aVar);
                }
            }

            /* renamed from: a */
            public void mo2058a(C0732k kVar) {
                C0628d.this.mo2310a(25, (Object) kVar);
            }

            /* renamed from: a */
            public void mo2059a(C0732k kVar, int i) {
                C0628d.this.mo2311a(26, (Object) kVar, i);
            }

            /* renamed from: a */
            public void mo2060a(C0749q qVar) {
                C0628d.this.mo2310a(19, (Object) qVar);
            }

            /* renamed from: a */
            public void mo2061a(String str, Bundle bundle) {
                C0628d.this.mo2312a(4, (Object) str, bundle);
            }

            /* renamed from: a */
            public void mo2062a(String str, Bundle bundle, C0637g gVar) {
                C0628d.this.mo2310a(1, (Object) new C0631a(str, bundle, gVar.f2448a));
            }

            /* renamed from: a */
            public void mo2063a(boolean z) {
                C0628d.this.mo2310a(24, (Object) Boolean.valueOf(z));
            }

            /* renamed from: a */
            public boolean mo2064a() {
                return (C0628d.this.f2388h & 2) != 0;
            }

            /* renamed from: a */
            public boolean mo2065a(KeyEvent keyEvent) {
                boolean z = (C0628d.this.f2388h & 1) != 0;
                if (z) {
                    C0628d.this.mo2310a(21, (Object) keyEvent);
                }
                return z;
            }

            /* renamed from: b */
            public String mo2066b() {
                return C0628d.this.f2381a;
            }

            /* renamed from: b */
            public void mo2067b(int i) {
                C0628d.this.mo2309a(23, i);
            }

            /* renamed from: b */
            public void mo2068b(int i, int i2, String str) {
                C0628d.this.mo2315c(i, i2);
            }

            /* renamed from: b */
            public void mo2069b(long j) {
                C0628d.this.mo2310a(18, (Object) Long.valueOf(j));
            }

            /* renamed from: b */
            public void mo2070b(Uri uri, Bundle bundle) {
                C0628d.this.mo2312a(10, (Object) uri, bundle);
            }

            /* renamed from: b */
            public void mo2071b(C0579a aVar) {
                C0628d.this.f2385e.unregister(aVar);
            }

            /* renamed from: b */
            public void mo2072b(C0732k kVar) {
                C0628d.this.mo2310a(27, (Object) kVar);
            }

            /* renamed from: b */
            public void mo2073b(String str, Bundle bundle) {
                C0628d.this.mo2312a(5, (Object) str, bundle);
            }

            /* renamed from: c */
            public String mo2074c() {
                return C0628d.this.f2382b;
            }

            /* renamed from: c */
            public void mo2075c(String str, Bundle bundle) {
                C0628d.this.mo2312a(8, (Object) str, bundle);
            }

            /* renamed from: d */
            public PendingIntent mo2076d() {
                PendingIntent pendingIntent;
                synchronized (C0628d.this.f2384d) {
                    pendingIntent = C0628d.this.f2391k;
                }
                return pendingIntent;
            }

            /* renamed from: d */
            public void mo2077d(String str, Bundle bundle) {
                C0628d.this.mo2312a(9, (Object) str, bundle);
            }

            /* renamed from: e */
            public long mo2078e() {
                long j;
                synchronized (C0628d.this.f2384d) {
                    j = (long) C0628d.this.f2388h;
                }
                return j;
            }

            /* renamed from: e */
            public void mo2079e(String str, Bundle bundle) {
                C0628d.this.mo2312a(20, (Object) str, bundle);
            }

            /* renamed from: f */
            public C0660p mo2080f() {
                int i;
                int i2;
                int streamMaxVolume;
                int streamVolume;
                int i3 = 2;
                synchronized (C0628d.this.f2384d) {
                    i = C0628d.this.f2398r;
                    i2 = C0628d.this.f2399s;
                    C0768y yVar = C0628d.this.f2400t;
                    if (i == 2) {
                        i3 = yVar.mo2630b();
                        streamMaxVolume = yVar.mo2632c();
                        streamVolume = yVar.mo2627a();
                    } else {
                        streamMaxVolume = C0628d.this.f2383c.getStreamMaxVolume(i2);
                        streamVolume = C0628d.this.f2383c.getStreamVolume(i2);
                    }
                }
                return new C0660p(i, i2, i3, streamMaxVolume, streamVolume);
            }

            /* renamed from: g */
            public C0739n mo2081g() {
                return C0628d.this.f2389i;
            }

            /* renamed from: h */
            public C0662q mo2082h() {
                return C0628d.this.mo2317g();
            }

            /* renamed from: i */
            public List<C0635f> mo2083i() {
                List<C0635f> list;
                synchronized (C0628d.this.f2384d) {
                    list = C0628d.this.f2392l;
                }
                return list;
            }

            /* renamed from: j */
            public CharSequence mo2084j() {
                return C0628d.this.f2393m;
            }

            /* renamed from: k */
            public Bundle mo2085k() {
                Bundle bundle;
                synchronized (C0628d.this.f2384d) {
                    bundle = C0628d.this.f2397q;
                }
                return bundle;
            }

            /* renamed from: l */
            public int mo2086l() {
                return C0628d.this.f2394n;
            }

            /* renamed from: m */
            public int mo2087m() {
                return C0628d.this.f2395o;
            }

            /* renamed from: n */
            public boolean mo2088n() {
                return C0628d.this.f2396p;
            }

            /* renamed from: o */
            public void mo2089o() {
                C0628d.this.mo2316e(3);
            }

            /* renamed from: p */
            public void mo2090p() {
                C0628d.this.mo2316e(7);
            }

            /* renamed from: q */
            public void mo2091q() {
                C0628d.this.mo2316e(12);
            }

            /* renamed from: r */
            public void mo2092r() {
                C0628d.this.mo2316e(13);
            }

            /* renamed from: s */
            public void mo2093s() {
                C0628d.this.mo2316e(14);
            }

            /* renamed from: t */
            public void mo2094t() {
                C0628d.this.mo2316e(15);
            }

            /* renamed from: u */
            public void mo2095u() {
                C0628d.this.mo2316e(16);
            }

            /* renamed from: v */
            public void mo2096v() {
                C0628d.this.mo2316e(17);
            }
        }

        /* renamed from: android.support.v4.i.a.h$d$c */
        private class C0633c extends Handler {

            /* renamed from: A */
            private static final int f2413A = 26;

            /* renamed from: B */
            private static final int f2414B = 27;

            /* renamed from: C */
            private static final int f2415C = 28;

            /* renamed from: D */
            private static final int f2416D = 127;

            /* renamed from: E */
            private static final int f2417E = 126;

            /* renamed from: b */
            private static final int f2418b = 1;

            /* renamed from: c */
            private static final int f2419c = 2;

            /* renamed from: d */
            private static final int f2420d = 3;

            /* renamed from: e */
            private static final int f2421e = 4;

            /* renamed from: f */
            private static final int f2422f = 5;

            /* renamed from: g */
            private static final int f2423g = 6;

            /* renamed from: h */
            private static final int f2424h = 7;

            /* renamed from: i */
            private static final int f2425i = 8;

            /* renamed from: j */
            private static final int f2426j = 9;

            /* renamed from: k */
            private static final int f2427k = 10;

            /* renamed from: l */
            private static final int f2428l = 11;

            /* renamed from: m */
            private static final int f2429m = 12;

            /* renamed from: n */
            private static final int f2430n = 13;

            /* renamed from: o */
            private static final int f2431o = 14;

            /* renamed from: p */
            private static final int f2432p = 15;

            /* renamed from: q */
            private static final int f2433q = 16;

            /* renamed from: r */
            private static final int f2434r = 17;

            /* renamed from: s */
            private static final int f2435s = 18;

            /* renamed from: t */
            private static final int f2436t = 19;

            /* renamed from: u */
            private static final int f2437u = 20;

            /* renamed from: v */
            private static final int f2438v = 21;

            /* renamed from: w */
            private static final int f2439w = 22;

            /* renamed from: x */
            private static final int f2440x = 23;

            /* renamed from: y */
            private static final int f2441y = 24;

            /* renamed from: z */
            private static final int f2442z = 25;

            public C0633c(Looper looper) {
                super(looper);
            }

            /* renamed from: a */
            private void m3548a(KeyEvent keyEvent, C0621a aVar) {
                if (keyEvent != null && keyEvent.getAction() == 0) {
                    long e = C0628d.this.f2390j == null ? 0 : C0628d.this.f2390j.mo2383e();
                    switch (keyEvent.getKeyCode()) {
                        case 79:
                        case 85:
                            boolean z = C0628d.this.f2390j != null && C0628d.this.f2390j.mo2378a() == 3;
                            boolean z2 = (516 & e) != 0;
                            boolean z3 = (e & 514) != 0;
                            if (z && z3) {
                                aVar.mo2257c();
                                return;
                            } else if (!z && z2) {
                                aVar.mo2251b();
                                return;
                            } else {
                                return;
                            }
                        case 86:
                            if ((e & 1) != 0) {
                                aVar.mo2265h();
                                return;
                            }
                            return;
                        case 87:
                            if ((e & 32) != 0) {
                                aVar.mo2259d();
                                return;
                            }
                            return;
                        case 88:
                            if ((e & 16) != 0) {
                                aVar.mo2261e();
                                return;
                            }
                            return;
                        case 89:
                            if ((e & 8) != 0) {
                                aVar.mo2264g();
                                return;
                            }
                            return;
                        case 90:
                            if ((e & 64) != 0) {
                                aVar.mo2263f();
                                return;
                            }
                            return;
                        case 126:
                            if ((e & 4) != 0) {
                                aVar.mo2251b();
                                return;
                            }
                            return;
                        case 127:
                            if ((e & 2) != 0) {
                                aVar.mo2257c();
                                return;
                            }
                            return;
                        default:
                            return;
                    }
                }
            }

            /* renamed from: a */
            public void mo2319a(int i) {
                mo2320a(i, (Object) null);
            }

            /* renamed from: a */
            public void mo2320a(int i, Object obj) {
                obtainMessage(i, obj).sendToTarget();
            }

            /* renamed from: a */
            public void mo2321a(int i, Object obj, int i2) {
                obtainMessage(i, i2, 0, obj).sendToTarget();
            }

            /* renamed from: a */
            public void mo2322a(int i, Object obj, Bundle bundle) {
                Message obtainMessage = obtainMessage(i, obj);
                obtainMessage.setData(bundle);
                obtainMessage.sendToTarget();
            }

            public void handleMessage(Message message) {
                C0621a aVar = C0628d.this.f2387g;
                if (aVar != null) {
                    switch (message.what) {
                        case 1:
                            C0631a aVar2 = (C0631a) message.obj;
                            aVar.mo2248a(aVar2.f2409a, aVar2.f2410b, aVar2.f2411c);
                            return;
                        case 2:
                            C0628d.this.mo2314b(message.arg1, 0);
                            return;
                        case 3:
                            aVar.mo2240a();
                            return;
                        case 4:
                            aVar.mo2247a((String) message.obj, message.getData());
                            return;
                        case 5:
                            aVar.mo2256b((String) message.obj, message.getData());
                            return;
                        case 6:
                            aVar.mo2243a((Uri) message.obj, message.getData());
                            return;
                        case 7:
                            aVar.mo2251b();
                            return;
                        case 8:
                            aVar.mo2258c((String) message.obj, message.getData());
                            return;
                        case 9:
                            aVar.mo2260d((String) message.obj, message.getData());
                            return;
                        case 10:
                            aVar.mo2254b((Uri) message.obj, message.getData());
                            return;
                        case 11:
                            aVar.mo2242a(((Long) message.obj).longValue());
                            return;
                        case 12:
                            aVar.mo2257c();
                            return;
                        case 13:
                            aVar.mo2265h();
                            return;
                        case 14:
                            aVar.mo2259d();
                            return;
                        case 15:
                            aVar.mo2261e();
                            return;
                        case 16:
                            aVar.mo2263f();
                            return;
                        case 17:
                            aVar.mo2264g();
                            return;
                        case 18:
                            aVar.mo2253b(((Long) message.obj).longValue());
                            return;
                        case 19:
                            aVar.mo2246a((C0749q) message.obj);
                            return;
                        case 20:
                            aVar.mo2262e((String) message.obj, message.getData());
                            return;
                        case 21:
                            KeyEvent keyEvent = (KeyEvent) message.obj;
                            Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                            intent.putExtra("android.intent.extra.KEY_EVENT", keyEvent);
                            if (!aVar.mo2250a(intent)) {
                                m3548a(keyEvent, aVar);
                                return;
                            }
                            return;
                        case 22:
                            C0628d.this.mo2315c(message.arg1, 0);
                            return;
                        case 23:
                            aVar.mo2241a(message.arg1);
                            return;
                        case 24:
                            aVar.mo2249a(((Boolean) message.obj).booleanValue());
                            return;
                        case 25:
                            aVar.mo2244a((C0732k) message.obj);
                            return;
                        case 26:
                            aVar.mo2245a((C0732k) message.obj, message.arg1);
                            return;
                        case 27:
                            aVar.mo2255b((C0732k) message.obj);
                            return;
                        case 28:
                            aVar.mo2252b(message.arg1);
                            return;
                        default:
                            return;
                    }
                }
            }
        }

        public C0628d(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
            if (componentName == null) {
                throw new IllegalArgumentException("MediaButtonReceiver component may not be null.");
            }
            this.f2401u = context;
            this.f2381a = context.getPackageName();
            this.f2383c = (AudioManager) context.getSystemService("audio");
            this.f2382b = str;
            this.f2402v = componentName;
            this.f2403w = pendingIntent;
            this.f2405y = new C0632b();
            this.f2406z = new C0640i(this.f2405y);
            this.f2394n = 0;
            this.f2398r = 1;
            this.f2399s = 3;
            if (Build.VERSION.SDK_INT >= 14) {
                this.f2404x = C0642i.m3571a(pendingIntent);
            } else {
                this.f2404x = null;
            }
        }

        /* renamed from: b */
        private void m3460b(Bundle bundle) {
            for (int beginBroadcast = this.f2385e.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f2385e.getBroadcastItem(beginBroadcast).mo2041a(bundle);
                } catch (RemoteException e) {
                }
            }
            this.f2385e.finishBroadcast();
        }

        /* renamed from: b */
        private void m3461b(C0662q qVar) {
            for (int beginBroadcast = this.f2385e.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f2385e.getBroadcastItem(beginBroadcast).mo2043a(qVar);
                } catch (RemoteException e) {
                }
            }
            this.f2385e.finishBroadcast();
        }

        /* renamed from: b */
        private void m3462b(C0739n nVar) {
            for (int beginBroadcast = this.f2385e.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f2385e.getBroadcastItem(beginBroadcast).mo2044a(nVar);
                } catch (RemoteException e) {
                }
            }
            this.f2385e.finishBroadcast();
        }

        /* renamed from: b */
        private void m3463b(CharSequence charSequence) {
            for (int beginBroadcast = this.f2385e.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f2385e.getBroadcastItem(beginBroadcast).mo2045a(charSequence);
                } catch (RemoteException e) {
                }
            }
            this.f2385e.finishBroadcast();
        }

        /* renamed from: b */
        private void m3464b(String str, Bundle bundle) {
            for (int beginBroadcast = this.f2385e.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f2385e.getBroadcastItem(beginBroadcast).mo2046a(str, bundle);
                } catch (RemoteException e) {
                }
            }
            this.f2385e.finishBroadcast();
        }

        /* renamed from: b */
        private void m3465b(List<C0635f> list) {
            for (int beginBroadcast = this.f2385e.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f2385e.getBroadcastItem(beginBroadcast).mo2047a(list);
                } catch (RemoteException e) {
                }
            }
            this.f2385e.finishBroadcast();
        }

        /* renamed from: c */
        private void m3466c(boolean z) {
            for (int beginBroadcast = this.f2385e.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f2385e.getBroadcastItem(beginBroadcast).mo2048a(z);
                } catch (RemoteException e) {
                }
            }
            this.f2385e.finishBroadcast();
        }

        /* renamed from: f */
        private void m3467f(int i) {
            for (int beginBroadcast = this.f2385e.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f2385e.getBroadcastItem(beginBroadcast).mo2040a(i);
                } catch (RemoteException e) {
                }
            }
            this.f2385e.finishBroadcast();
        }

        /* renamed from: h */
        private boolean m3468h() {
            if (this.f2377B) {
                if (!this.f2379D && (this.f2388h & 1) != 0) {
                    if (Build.VERSION.SDK_INT >= 18) {
                        C0643j.m3580a(this.f2401u, this.f2403w, this.f2402v);
                    } else {
                        ((AudioManager) this.f2401u.getSystemService("audio")).registerMediaButtonEventReceiver(this.f2402v);
                    }
                    this.f2379D = true;
                } else if (this.f2379D && (this.f2388h & 1) == 0) {
                    if (Build.VERSION.SDK_INT >= 18) {
                        C0643j.m3584b(this.f2401u, this.f2403w, this.f2402v);
                    } else {
                        ((AudioManager) this.f2401u.getSystemService("audio")).unregisterMediaButtonEventReceiver(this.f2402v);
                    }
                    this.f2379D = false;
                }
                if (Build.VERSION.SDK_INT >= 14) {
                    if (!this.f2378C && (this.f2388h & 2) != 0) {
                        C0642i.m3572a(this.f2401u, this.f2404x);
                        this.f2378C = true;
                        return true;
                    } else if (this.f2378C && (this.f2388h & 2) == 0) {
                        C0642i.m3574a(this.f2404x, 0);
                        C0642i.m3577b(this.f2401u, this.f2404x);
                        this.f2378C = false;
                        return false;
                    }
                }
            } else {
                if (this.f2379D) {
                    if (Build.VERSION.SDK_INT >= 18) {
                        C0643j.m3584b(this.f2401u, this.f2403w, this.f2402v);
                    } else {
                        ((AudioManager) this.f2401u.getSystemService("audio")).unregisterMediaButtonEventReceiver(this.f2402v);
                    }
                    this.f2379D = false;
                }
                if (this.f2378C) {
                    C0642i.m3574a(this.f2404x, 0);
                    C0642i.m3577b(this.f2401u, this.f2404x);
                    this.f2378C = false;
                }
            }
            return false;
        }

        /* renamed from: i */
        private void m3469i() {
            for (int beginBroadcast = this.f2385e.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f2385e.getBroadcastItem(beginBroadcast).mo2039a();
                } catch (RemoteException e) {
                }
            }
            this.f2385e.finishBroadcast();
            this.f2385e.kill();
        }

        /* renamed from: a */
        public void mo2286a(int i) {
            synchronized (this.f2384d) {
                this.f2388h = i;
            }
            m3468h();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2309a(int i, int i2) {
            mo2311a(i, (Object) null, i2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2310a(int i, Object obj) {
            mo2312a(i, obj, (Bundle) null);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2311a(int i, Object obj, int i2) {
            synchronized (this.f2384d) {
                if (this.f2376A != null) {
                    this.f2376A.mo2321a(i, obj, i2);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2312a(int i, Object obj, Bundle bundle) {
            synchronized (this.f2384d) {
                if (this.f2376A != null) {
                    this.f2376A.mo2322a(i, obj, bundle);
                }
            }
        }

        /* renamed from: a */
        public void mo2287a(PendingIntent pendingIntent) {
            synchronized (this.f2384d) {
                this.f2391k = pendingIntent;
            }
        }

        /* renamed from: a */
        public void mo2288a(Bundle bundle) {
            this.f2397q = bundle;
            m3460b(bundle);
        }

        /* renamed from: a */
        public void mo2289a(C0621a aVar, Handler handler) {
            this.f2387g = aVar;
            if (aVar == null) {
                if (Build.VERSION.SDK_INT >= 18) {
                    C0643j.m3583a(this.f2404x, (Object) null);
                }
                if (Build.VERSION.SDK_INT >= 19) {
                    C0646k.m3591a(this.f2404x, (Object) null);
                    return;
                }
                return;
            }
            if (handler == null) {
                handler = new Handler();
            }
            synchronized (this.f2384d) {
                this.f2376A = new C0633c(handler.getLooper());
            }
            C06302 r0 = new C0646k.C0647a() {
                /* renamed from: a */
                public void mo2268a(Object obj) {
                    C0628d.this.mo2310a(19, (Object) C0749q.m3904a(obj));
                }

                /* renamed from: b */
                public void mo2273b(long j) {
                    C0628d.this.mo2310a(18, (Object) Long.valueOf(j));
                }
            };
            if (Build.VERSION.SDK_INT >= 18) {
                C0643j.m3583a(this.f2404x, C0643j.m3579a((C0643j.C0644a) r0));
            }
            if (Build.VERSION.SDK_INT >= 19) {
                C0646k.m3591a(this.f2404x, C0646k.m3587a((C0646k.C0647a) r0));
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2313a(C0660p pVar) {
            for (int beginBroadcast = this.f2385e.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f2385e.getBroadcastItem(beginBroadcast).mo2042a(pVar);
                } catch (RemoteException e) {
                }
            }
            this.f2385e.finishBroadcast();
        }

        /* renamed from: a */
        public void mo2290a(C0662q qVar) {
            synchronized (this.f2384d) {
                this.f2390j = qVar;
            }
            m3461b(qVar);
            if (this.f2377B) {
                if (qVar != null) {
                    if (Build.VERSION.SDK_INT >= 18) {
                        C0643j.m3581a(this.f2404x, qVar.mo2378a(), qVar.mo2379b(), qVar.mo2381d(), qVar.mo2387i());
                    } else if (Build.VERSION.SDK_INT >= 14) {
                        C0642i.m3574a(this.f2404x, qVar.mo2378a());
                    }
                    if (Build.VERSION.SDK_INT >= 19) {
                        C0646k.m3589a(this.f2404x, qVar.mo2383e());
                    } else if (Build.VERSION.SDK_INT >= 18) {
                        C0643j.m3582a(this.f2404x, qVar.mo2383e());
                    } else if (Build.VERSION.SDK_INT >= 14) {
                        C0642i.m3575a(this.f2404x, qVar.mo2383e());
                    }
                } else if (Build.VERSION.SDK_INT >= 14) {
                    C0642i.m3574a(this.f2404x, 0);
                    C0642i.m3575a(this.f2404x, 0);
                }
            }
        }

        /* renamed from: a */
        public void mo2291a(C0739n nVar) {
            Bundle bundle = null;
            if (nVar != null) {
                nVar = new C0739n.C0742b(nVar, C0618h.f2354s).mo2556a();
            }
            synchronized (this.f2384d) {
                this.f2389i = nVar;
            }
            m3462b(nVar);
            if (this.f2377B) {
                if (Build.VERSION.SDK_INT >= 19) {
                    Object obj = this.f2404x;
                    if (nVar != null) {
                        bundle = nVar.mo2541d();
                    }
                    C0646k.m3590a(obj, bundle, this.f2390j == null ? 0 : this.f2390j.mo2383e());
                } else if (Build.VERSION.SDK_INT >= 14) {
                    Object obj2 = this.f2404x;
                    if (nVar != null) {
                        bundle = nVar.mo2541d();
                    }
                    C0642i.m3576a(obj2, bundle);
                }
            }
        }

        /* renamed from: a */
        public void mo2292a(C0768y yVar) {
            if (yVar == null) {
                throw new IllegalArgumentException("volumeProvider may not be null");
            }
            if (this.f2400t != null) {
                this.f2400t.mo2629a((C0768y.C0770a) null);
            }
            this.f2398r = 2;
            this.f2400t = yVar;
            mo2313a(new C0660p(this.f2398r, this.f2399s, this.f2400t.mo2630b(), this.f2400t.mo2632c(), this.f2400t.mo2627a()));
            yVar.mo2629a(this.f2380E);
        }

        /* renamed from: a */
        public void mo2293a(CharSequence charSequence) {
            this.f2393m = charSequence;
            m3463b(charSequence);
        }

        /* renamed from: a */
        public void mo2294a(String str, Bundle bundle) {
            m3464b(str, bundle);
        }

        /* renamed from: a */
        public void mo2295a(List<C0635f> list) {
            this.f2392l = list;
            m3465b(list);
        }

        /* renamed from: a */
        public void mo2296a(boolean z) {
            if (z != this.f2377B) {
                this.f2377B = z;
                if (m3468h()) {
                    mo2291a(this.f2389i);
                    mo2290a(this.f2390j);
                }
            }
        }

        /* renamed from: a */
        public boolean mo2297a() {
            return this.f2377B;
        }

        /* renamed from: b */
        public void mo2298b() {
            this.f2377B = false;
            this.f2386f = true;
            m3468h();
            m3469i();
        }

        /* renamed from: b */
        public void mo2299b(int i) {
            if (this.f2400t != null) {
                this.f2400t.mo2629a((C0768y.C0770a) null);
            }
            this.f2398r = 1;
            mo2313a(new C0660p(this.f2398r, this.f2399s, 2, this.f2383c.getStreamMaxVolume(this.f2399s), this.f2383c.getStreamVolume(this.f2399s)));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo2314b(int i, int i2) {
            if (this.f2398r != 2) {
                this.f2383c.adjustStreamVolume(this.f2399s, i, i2);
            } else if (this.f2400t != null) {
                this.f2400t.mo2633c(i);
            }
        }

        /* renamed from: b */
        public void mo2300b(PendingIntent pendingIntent) {
        }

        /* renamed from: b */
        public void mo2301b(boolean z) {
            if (this.f2396p != z) {
                this.f2396p = z;
                m3466c(z);
            }
        }

        /* renamed from: c */
        public C0640i mo2302c() {
            return this.f2406z;
        }

        /* renamed from: c */
        public void mo2303c(int i) {
            this.f2394n = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo2315c(int i, int i2) {
            if (this.f2398r != 2) {
                this.f2383c.setStreamVolume(this.f2399s, i, i2);
            } else if (this.f2400t != null) {
                this.f2400t.mo2631b(i);
            }
        }

        /* renamed from: d */
        public Object mo2304d() {
            return null;
        }

        /* renamed from: d */
        public void mo2305d(int i) {
            if (this.f2395o != i) {
                this.f2395o = i;
                m3467f(i);
            }
        }

        /* renamed from: e */
        public Object mo2306e() {
            return this.f2404x;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo2316e(int i) {
            mo2310a(i, (Object) null);
        }

        /* renamed from: f */
        public String mo2307f() {
            return null;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0070  */
        /* JADX WARNING: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
        /* renamed from: g */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.support.p010v4.p025i.p026a.C0662q mo2317g() {
            /*
                r12 = this;
                r0 = 0
                r2 = -1
                java.lang.Object r4 = r12.f2384d
                monitor-enter(r4)
                android.support.v4.i.a.q r7 = r12.f2390j     // Catch:{ all -> 0x0072 }
                android.support.v4.i.n r5 = r12.f2389i     // Catch:{ all -> 0x0072 }
                if (r5 == 0) goto L_0x001f
                android.support.v4.i.n r5 = r12.f2389i     // Catch:{ all -> 0x0072 }
                java.lang.String r6 = "android.media.metadata.DURATION"
                boolean r5 = r5.mo2535a((java.lang.String) r6)     // Catch:{ all -> 0x0072 }
                if (r5 == 0) goto L_0x001f
                android.support.v4.i.n r2 = r12.f2389i     // Catch:{ all -> 0x0072 }
                java.lang.String r3 = "android.media.metadata.DURATION"
                long r2 = r2.mo2540d(r3)     // Catch:{ all -> 0x0072 }
            L_0x001f:
                monitor-exit(r4)     // Catch:{ all -> 0x0072 }
                r4 = 0
                if (r7 == 0) goto L_0x007d
                int r5 = r7.mo2378a()
                r6 = 3
                if (r5 == r6) goto L_0x0038
                int r5 = r7.mo2378a()
                r6 = 4
                if (r5 == r6) goto L_0x0038
                int r5 = r7.mo2378a()
                r6 = 5
                if (r5 != r6) goto L_0x007d
            L_0x0038:
                long r8 = r7.mo2387i()
                long r5 = android.os.SystemClock.elapsedRealtime()
                int r10 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r10 <= 0) goto L_0x007d
                float r4 = r7.mo2381d()
                long r8 = r5 - r8
                float r8 = (float) r8
                float r4 = r4 * r8
                long r8 = (long) r4
                long r10 = r7.mo2379b()
                long r8 = r8 + r10
                int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r4 < 0) goto L_0x0075
                int r4 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                if (r4 <= 0) goto L_0x0075
            L_0x005a:
                android.support.v4.i.a.q$b r0 = new android.support.v4.i.a.q$b
                r0.<init>(r7)
                int r1 = r7.mo2378a()
                float r4 = r7.mo2381d()
                r0.mo2398a(r1, r2, r4, r5)
                android.support.v4.i.a.q r0 = r0.mo2405a()
            L_0x006e:
                if (r0 != 0) goto L_0x0071
                r0 = r7
            L_0x0071:
                return r0
            L_0x0072:
                r0 = move-exception
                monitor-exit(r4)     // Catch:{ all -> 0x0072 }
                throw r0
            L_0x0075:
                int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r2 >= 0) goto L_0x007b
                r2 = r0
                goto L_0x005a
            L_0x007b:
                r2 = r8
                goto L_0x005a
            L_0x007d:
                r0 = r4
                goto L_0x006e
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p010v4.p025i.p026a.C0618h.C0628d.mo2317g():android.support.v4.i.a.q");
        }
    }

    /* renamed from: android.support.v4.i.a.h$e */
    public interface C0634e {
        /* renamed from: a */
        void mo2324a();
    }

    /* renamed from: android.support.v4.i.a.h$f */
    public static final class C0635f implements Parcelable {
        public static final Parcelable.Creator<C0635f> CREATOR = new Parcelable.Creator<C0635f>() {
            /* renamed from: a */
            public C0635f createFromParcel(Parcel parcel) {
                return new C0635f(parcel);
            }

            /* renamed from: a */
            public C0635f[] newArray(int i) {
                return new C0635f[i];
            }
        };

        /* renamed from: a */
        public static final int f2444a = -1;

        /* renamed from: b */
        private final C0732k f2445b;

        /* renamed from: c */
        private final long f2446c;

        /* renamed from: d */
        private Object f2447d;

        C0635f(Parcel parcel) {
            this.f2445b = C0732k.CREATOR.createFromParcel(parcel);
            this.f2446c = parcel.readLong();
        }

        public C0635f(C0732k kVar, long j) {
            this((Object) null, kVar, j);
        }

        private C0635f(Object obj, C0732k kVar, long j) {
            if (kVar == null) {
                throw new IllegalArgumentException("Description cannot be null.");
            } else if (j == -1) {
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            } else {
                this.f2445b = kVar;
                this.f2446c = j;
                this.f2447d = obj;
            }
        }

        @Deprecated
        /* renamed from: a */
        public static C0635f m3554a(Object obj) {
            return m3556b(obj);
        }

        /* renamed from: a */
        public static List<C0635f> m3555a(List<?> list) {
            if (list == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Object b : list) {
                arrayList.add(m3556b(b));
            }
            return arrayList;
        }

        /* renamed from: b */
        public static C0635f m3556b(Object obj) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            return new C0635f(obj, C0732k.m3824a(C0649l.C0652c.m3626a(obj)), C0649l.C0652c.m3628b(obj));
        }

        /* renamed from: a */
        public C0732k mo2325a() {
            return this.f2445b;
        }

        /* renamed from: b */
        public long mo2326b() {
            return this.f2446c;
        }

        /* renamed from: c */
        public Object mo2327c() {
            if (this.f2447d != null || Build.VERSION.SDK_INT < 21) {
                return this.f2447d;
            }
            this.f2447d = C0649l.C0652c.m3627a(this.f2445b.mo2518i(), this.f2446c);
            return this.f2447d;
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "MediaSession.QueueItem {Description=" + this.f2445b + ", Id=" + this.f2446c + " }";
        }

        public void writeToParcel(Parcel parcel, int i) {
            this.f2445b.writeToParcel(parcel, i);
            parcel.writeLong(this.f2446c);
        }
    }

    /* renamed from: android.support.v4.i.a.h$g */
    static final class C0637g implements Parcelable {
        public static final Parcelable.Creator<C0637g> CREATOR = new Parcelable.Creator<C0637g>() {
            /* renamed from: a */
            public C0637g createFromParcel(Parcel parcel) {
                return new C0637g(parcel);
            }

            /* renamed from: a */
            public C0637g[] newArray(int i) {
                return new C0637g[i];
            }
        };
        /* access modifiers changed from: private */

        /* renamed from: a */
        public ResultReceiver f2448a;

        C0637g(Parcel parcel) {
            this.f2448a = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        public C0637g(ResultReceiver resultReceiver) {
            this.f2448a = resultReceiver;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            this.f2448a.writeToParcel(parcel, i);
        }
    }

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: android.support.v4.i.a.h$h */
    public @interface C0639h {
    }

    /* renamed from: android.support.v4.i.a.h$i */
    public static final class C0640i implements Parcelable {
        public static final Parcelable.Creator<C0640i> CREATOR = new Parcelable.Creator<C0640i>() {
            /* renamed from: a */
            public C0640i createFromParcel(Parcel parcel) {
                return new C0640i(Build.VERSION.SDK_INT >= 21 ? parcel.readParcelable((ClassLoader) null) : parcel.readStrongBinder());
            }

            /* renamed from: a */
            public C0640i[] newArray(int i) {
                return new C0640i[i];
            }
        };

        /* renamed from: a */
        private final Object f2449a;

        C0640i(Object obj) {
            this.f2449a = obj;
        }

        /* renamed from: a */
        public static C0640i m3565a(Object obj) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            return new C0640i(C0649l.m3605b(obj));
        }

        /* renamed from: a */
        public Object mo2341a() {
            return this.f2449a;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0640i)) {
                return false;
            }
            C0640i iVar = (C0640i) obj;
            if (this.f2449a == null) {
                return iVar.f2449a == null;
            }
            if (iVar.f2449a == null) {
                return false;
            }
            return this.f2449a.equals(iVar.f2449a);
        }

        public int hashCode() {
            if (this.f2449a == null) {
                return 0;
            }
            return this.f2449a.hashCode();
        }

        public void writeToParcel(Parcel parcel, int i) {
            if (Build.VERSION.SDK_INT >= 21) {
                parcel.writeParcelable((Parcelable) this.f2449a, i);
            } else {
                parcel.writeStrongBinder((IBinder) this.f2449a);
            }
        }
    }

    private C0618h(Context context, C0625b bVar) {
        this.f2358v = new ArrayList<>();
        this.f2356t = bVar;
        if (Build.VERSION.SDK_INT >= 21) {
            mo2217a((C0621a) new C0621a() {
            });
        }
        this.f2357u = new C0586d(context, this);
    }

    public C0618h(Context context, String str) {
        this(context, str, (ComponentName) null, (PendingIntent) null);
    }

    public C0618h(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
        this.f2358v = new ArrayList<>();
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        } else if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("tag must not be null or empty");
        } else {
            if (componentName == null && (componentName = C0585c.m3012a(context)) == null) {
                Log.w(f2336a, "Couldn't find a unique registered media button receiver in the given context.");
            }
            if (componentName != null && pendingIntent == null) {
                Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                intent.setComponent(componentName);
                pendingIntent = PendingIntent.getBroadcast(context, 0, intent, 0);
            }
            if (Build.VERSION.SDK_INT >= 21) {
                this.f2356t = new C0626c(context, str);
                this.f2356t.mo2300b(pendingIntent);
                mo2217a((C0621a) new C0621a() {
                });
            } else {
                this.f2356t = new C0628d(context, str, componentName, pendingIntent);
            }
            this.f2357u = new C0586d(context, this);
            if (f2354s == 0) {
                f2354s = (int) TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics());
            }
        }
    }

    @Deprecated
    /* renamed from: a */
    public static C0618h m3294a(Context context, Object obj) {
        return m3295b(context, obj);
    }

    /* renamed from: b */
    public static C0618h m3295b(Context context, Object obj) {
        if (context == null || obj == null || Build.VERSION.SDK_INT < 21) {
            return null;
        }
        return new C0618h(context, (C0625b) new C0626c(obj));
    }

    /* renamed from: a */
    public void mo2214a(int i) {
        this.f2356t.mo2286a(i);
    }

    /* renamed from: a */
    public void mo2215a(PendingIntent pendingIntent) {
        this.f2356t.mo2287a(pendingIntent);
    }

    /* renamed from: a */
    public void mo2216a(Bundle bundle) {
        this.f2356t.mo2288a(bundle);
    }

    /* renamed from: a */
    public void mo2217a(C0621a aVar) {
        mo2218a(aVar, (Handler) null);
    }

    /* renamed from: a */
    public void mo2218a(C0621a aVar, Handler handler) {
        C0625b bVar = this.f2356t;
        if (handler == null) {
            handler = new Handler();
        }
        bVar.mo2289a(aVar, handler);
    }

    /* renamed from: a */
    public void mo2219a(C0634e eVar) {
        if (eVar == null) {
            throw new IllegalArgumentException("Listener may not be null");
        }
        this.f2358v.add(eVar);
    }

    /* renamed from: a */
    public void mo2220a(C0662q qVar) {
        this.f2356t.mo2290a(qVar);
    }

    /* renamed from: a */
    public void mo2221a(C0739n nVar) {
        this.f2356t.mo2291a(nVar);
    }

    /* renamed from: a */
    public void mo2222a(C0768y yVar) {
        if (yVar == null) {
            throw new IllegalArgumentException("volumeProvider may not be null!");
        }
        this.f2356t.mo2292a(yVar);
    }

    /* renamed from: a */
    public void mo2223a(CharSequence charSequence) {
        this.f2356t.mo2293a(charSequence);
    }

    /* renamed from: a */
    public void mo2224a(String str, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("event cannot be null or empty");
        }
        this.f2356t.mo2294a(str, bundle);
    }

    /* renamed from: a */
    public void mo2225a(List<C0635f> list) {
        this.f2356t.mo2295a(list);
    }

    /* renamed from: a */
    public void mo2226a(boolean z) {
        this.f2356t.mo2296a(z);
        Iterator<C0634e> it = this.f2358v.iterator();
        while (it.hasNext()) {
            it.next().mo2324a();
        }
    }

    /* renamed from: a */
    public boolean mo2227a() {
        return this.f2356t.mo2297a();
    }

    /* renamed from: b */
    public void mo2228b() {
        this.f2356t.mo2298b();
    }

    /* renamed from: b */
    public void mo2229b(int i) {
        this.f2356t.mo2299b(i);
    }

    /* renamed from: b */
    public void mo2230b(PendingIntent pendingIntent) {
        this.f2356t.mo2300b(pendingIntent);
    }

    /* renamed from: b */
    public void mo2231b(C0634e eVar) {
        if (eVar == null) {
            throw new IllegalArgumentException("Listener may not be null");
        }
        this.f2358v.remove(eVar);
    }

    /* renamed from: b */
    public void mo2232b(boolean z) {
        this.f2356t.mo2301b(z);
    }

    /* renamed from: c */
    public C0640i mo2233c() {
        return this.f2356t.mo2302c();
    }

    /* renamed from: c */
    public void mo2234c(int i) {
        this.f2356t.mo2303c(i);
    }

    /* renamed from: d */
    public C0586d mo2235d() {
        return this.f2357u;
    }

    /* renamed from: d */
    public void mo2236d(int i) {
        this.f2356t.mo2305d(i);
    }

    /* renamed from: e */
    public Object mo2237e() {
        return this.f2356t.mo2304d();
    }

    /* renamed from: f */
    public Object mo2238f() {
        return this.f2356t.mo2306e();
    }

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    /* renamed from: g */
    public String mo2239g() {
        return this.f2356t.mo2307f();
    }
}
