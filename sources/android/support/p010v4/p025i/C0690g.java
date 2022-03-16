package android.support.p010v4.p025i;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
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
import android.support.p010v4.p025i.C0541a;
import android.support.p010v4.p025i.C0720h;
import android.support.p010v4.p025i.C0725i;
import android.support.p010v4.p025i.C0728j;
import android.support.p010v4.p025i.p026a.C0618h;
import android.support.p010v4.p028k.C0798c;
import android.support.p010v4.p028k.C0813n;
import android.support.p010v4.p033o.C0876a;
import android.support.p010v4.p033o.C0894l;
import android.text.TextUtils;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: android.support.v4.i.g */
public abstract class C0690g extends Service {

    /* renamed from: a */
    static final String f2617a = "MBServiceCompat";

    /* renamed from: b */
    static final boolean f2618b = Log.isLoggable(f2617a, 3);

    /* renamed from: c */
    public static final String f2619c = "android.media.browse.MediaBrowserService";
    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})

    /* renamed from: d */
    public static final String f2620d = "media_item";
    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})

    /* renamed from: e */
    public static final String f2621e = "search_results";

    /* renamed from: f */
    static final int f2622f = 1;

    /* renamed from: g */
    static final int f2623g = 2;

    /* renamed from: h */
    static final int f2624h = 4;

    /* renamed from: i */
    static final int f2625i = -1;

    /* renamed from: j */
    static final int f2626j = 0;

    /* renamed from: k */
    final C0876a<IBinder, C0695b> f2627k = new C0876a<>();

    /* renamed from: l */
    C0695b f2628l;

    /* renamed from: m */
    final C0719l f2629m = new C0719l();

    /* renamed from: n */
    C0618h.C0640i f2630n;

    /* renamed from: o */
    private C0696c f2631o;

    /* renamed from: android.support.v4.i.g$a */
    public static final class C0694a {

        /* renamed from: a */
        public static final String f2640a = "android.service.media.extra.RECENT";

        /* renamed from: b */
        public static final String f2641b = "android.service.media.extra.OFFLINE";

        /* renamed from: c */
        public static final String f2642c = "android.service.media.extra.SUGGESTED";
        @Deprecated

        /* renamed from: d */
        public static final String f2643d = "android.service.media.extra.SUGGESTION_KEYWORDS";

        /* renamed from: e */
        private final String f2644e;

        /* renamed from: f */
        private final Bundle f2645f;

        public C0694a(@C0047z String str, @C0003aa Bundle bundle) {
            if (str == null) {
                throw new IllegalArgumentException("The root id in BrowserRoot cannot be null. Use null for BrowserRoot instead.");
            }
            this.f2644e = str;
            this.f2645f = bundle;
        }

        /* renamed from: a */
        public String mo2455a() {
            return this.f2644e;
        }

        /* renamed from: b */
        public Bundle mo2456b() {
            return this.f2645f;
        }
    }

    /* renamed from: android.support.v4.i.g$b */
    private class C0695b {

        /* renamed from: a */
        String f2646a;

        /* renamed from: b */
        Bundle f2647b;

        /* renamed from: c */
        C0717j f2648c;

        /* renamed from: d */
        C0694a f2649d;

        /* renamed from: e */
        HashMap<String, List<C0894l<IBinder, Bundle>>> f2650e = new HashMap<>();

        C0695b() {
        }
    }

    /* renamed from: android.support.v4.i.g$c */
    interface C0696c {
        /* renamed from: a */
        IBinder mo2457a(Intent intent);

        /* renamed from: a */
        void mo2458a();

        /* renamed from: a */
        void mo2459a(C0618h.C0640i iVar);

        /* renamed from: a */
        void mo2460a(String str, Bundle bundle);

        /* renamed from: b */
        Bundle mo2461b();
    }

    /* renamed from: android.support.v4.i.g$d */
    class C0697d implements C0696c, C0720h.C0724d {

        /* renamed from: a */
        Object f2652a;

        /* renamed from: b */
        Messenger f2653b;

        C0697d() {
        }

        /* renamed from: a */
        public IBinder mo2457a(Intent intent) {
            return C0720h.m3804a(this.f2652a, intent);
        }

        /* renamed from: a */
        public C0720h.C0721a mo2462a(String str, int i, Bundle bundle) {
            Bundle bundle2;
            if (bundle == null || bundle.getInt(C0689f.f2602l, 0) == 0) {
                bundle2 = null;
            } else {
                bundle.remove(C0689f.f2602l);
                this.f2653b = new Messenger(C0690g.this.f2629m);
                bundle2 = new Bundle();
                bundle2.putInt(C0689f.f2603m, 1);
                C0411y.m2302a(bundle2, C0689f.f2604n, this.f2653b.getBinder());
            }
            C0694a a = C0690g.this.mo2432a(str, i, bundle);
            if (a == null) {
                return null;
            }
            if (bundle2 == null) {
                bundle2 = a.mo2456b();
            } else if (a.mo2456b() != null) {
                bundle2.putAll(a.mo2456b());
            }
            return new C0720h.C0721a(a.mo2455a(), bundle2);
        }

        /* renamed from: a */
        public void mo2458a() {
            this.f2652a = C0720h.m3805a((Context) C0690g.this, (C0720h.C0724d) this);
            C0720h.m3806a(this.f2652a);
        }

        /* renamed from: a */
        public void mo2459a(C0618h.C0640i iVar) {
            C0720h.m3807a(this.f2652a, iVar.mo2341a());
        }

        /* renamed from: a */
        public void mo2460a(final String str, final Bundle bundle) {
            if (this.f2653b == null) {
                C0720h.m3808a(this.f2652a, str);
            } else {
                C0690g.this.f2629m.post(new Runnable() {
                    public void run() {
                        for (IBinder iBinder : C0690g.this.f2627k.keySet()) {
                            C0695b bVar = C0690g.this.f2627k.get(iBinder);
                            List<C0894l> list = bVar.f2650e.get(str);
                            if (list != null) {
                                for (C0894l lVar : list) {
                                    if (C0688e.m3723b(bundle, (Bundle) lVar.f3082b)) {
                                        C0690g.this.mo2439a(str, bVar, (Bundle) lVar.f3082b);
                                    }
                                }
                            }
                        }
                    }
                });
            }
        }

        /* renamed from: a */
        public void mo2463a(String str, final C0720h.C0723c<List<Parcel>> cVar) {
            C0690g.this.mo2442a(str, (C0707h<List<C0541a.C0569k>>) new C0707h<List<C0541a.C0569k>>(str) {
                /* renamed from: a */
                public void mo2465a() {
                    cVar.mo2502a();
                }

                /* access modifiers changed from: package-private */
                /* renamed from: a */
                public void mo2451a(List<C0541a.C0569k> list, int i) {
                    ArrayList arrayList = null;
                    if (list != null) {
                        ArrayList arrayList2 = new ArrayList();
                        for (C0541a.C0569k writeToParcel : list) {
                            Parcel obtain = Parcel.obtain();
                            writeToParcel.writeToParcel(obtain, 0);
                            arrayList2.add(obtain);
                        }
                        arrayList = arrayList2;
                    }
                    cVar.mo2503a(arrayList);
                }
            });
        }

        /* renamed from: b */
        public Bundle mo2461b() {
            if (this.f2653b == null) {
                return null;
            }
            if (C0690g.this.f2628l == null) {
                throw new IllegalStateException("This should be called inside of onLoadChildren or onLoadItem methods");
            } else if (C0690g.this.f2628l.f2647b != null) {
                return new Bundle(C0690g.this.f2628l.f2647b);
            } else {
                return null;
            }
        }
    }

    /* renamed from: android.support.v4.i.g$e */
    class C0700e extends C0697d implements C0725i.C0727b {
        C0700e() {
            super();
        }

        /* renamed from: a */
        public void mo2458a() {
            this.f2652a = C0725i.m3814a(C0690g.this, this);
            C0720h.m3806a(this.f2652a);
        }

        /* renamed from: b */
        public void mo2467b(String str, final C0720h.C0723c<Parcel> cVar) {
            C0690g.this.mo2447b(str, new C0707h<C0541a.C0569k>(str) {
                /* renamed from: a */
                public void mo2465a() {
                    cVar.mo2502a();
                }

                /* access modifiers changed from: package-private */
                /* renamed from: a */
                public void mo2451a(C0541a.C0569k kVar, int i) {
                    if (kVar == null) {
                        cVar.mo2503a(null);
                        return;
                    }
                    Parcel obtain = Parcel.obtain();
                    kVar.writeToParcel(obtain, 0);
                    cVar.mo2503a(obtain);
                }
            });
        }
    }

    /* renamed from: android.support.v4.i.g$f */
    class C0702f extends C0700e implements C0728j.C0731c {
        C0702f() {
            super();
        }

        /* renamed from: a */
        public void mo2458a() {
            this.f2652a = C0728j.m3817a(C0690g.this, this);
            C0720h.m3806a(this.f2652a);
        }

        /* renamed from: a */
        public void mo2460a(String str, Bundle bundle) {
            if (bundle == null) {
                C0720h.m3808a(this.f2652a, str);
            } else {
                C0728j.m3819a(this.f2652a, str, bundle);
            }
        }

        /* renamed from: a */
        public void mo2469a(String str, final C0728j.C0730b bVar, Bundle bundle) {
            C0690g.this.mo2443a(str, (C0707h<List<C0541a.C0569k>>) new C0707h<List<C0541a.C0569k>>(str) {
                /* renamed from: a */
                public void mo2465a() {
                    bVar.mo2507a();
                }

                /* access modifiers changed from: package-private */
                /* renamed from: a */
                public void mo2451a(List<C0541a.C0569k> list, int i) {
                    ArrayList arrayList = null;
                    if (list != null) {
                        ArrayList arrayList2 = new ArrayList();
                        for (C0541a.C0569k writeToParcel : list) {
                            Parcel obtain = Parcel.obtain();
                            writeToParcel.writeToParcel(obtain, 0);
                            arrayList2.add(obtain);
                        }
                        arrayList = arrayList2;
                    }
                    bVar.mo2508a(arrayList, i);
                }
            }, bundle);
        }

        /* renamed from: b */
        public Bundle mo2461b() {
            if (C0690g.this.f2628l == null) {
                return C0728j.m3816a(this.f2652a);
            }
            if (C0690g.this.f2628l.f2647b == null) {
                return null;
            }
            return new Bundle(C0690g.this.f2628l.f2647b);
        }
    }

    /* renamed from: android.support.v4.i.g$g */
    class C0704g implements C0696c {

        /* renamed from: b */
        private Messenger f2667b;

        C0704g() {
        }

        /* renamed from: a */
        public IBinder mo2457a(Intent intent) {
            if (C0690g.f2619c.equals(intent.getAction())) {
                return this.f2667b.getBinder();
            }
            return null;
        }

        /* renamed from: a */
        public void mo2458a() {
            this.f2667b = new Messenger(C0690g.this.f2629m);
        }

        /* renamed from: a */
        public void mo2459a(final C0618h.C0640i iVar) {
            C0690g.this.f2629m.post(new Runnable() {
                public void run() {
                    Iterator<C0695b> it = C0690g.this.f2627k.values().iterator();
                    while (it.hasNext()) {
                        C0695b next = it.next();
                        try {
                            next.f2648c.mo2493a(next.f2649d.mo2455a(), iVar, next.f2649d.mo2456b());
                        } catch (RemoteException e) {
                            Log.w(C0690g.f2617a, "Connection for " + next.f2646a + " is no longer valid.");
                            it.remove();
                        }
                    }
                }
            });
        }

        /* renamed from: a */
        public void mo2460a(@C0047z final String str, final Bundle bundle) {
            C0690g.this.f2629m.post(new Runnable() {
                public void run() {
                    for (IBinder iBinder : C0690g.this.f2627k.keySet()) {
                        C0695b bVar = C0690g.this.f2627k.get(iBinder);
                        List<C0894l> list = bVar.f2650e.get(str);
                        if (list != null) {
                            for (C0894l lVar : list) {
                                if (C0688e.m3723b(bundle, (Bundle) lVar.f3082b)) {
                                    C0690g.this.mo2439a(str, bVar, (Bundle) lVar.f3082b);
                                }
                            }
                        }
                    }
                }
            });
        }

        /* renamed from: b */
        public Bundle mo2461b() {
            if (C0690g.this.f2628l == null) {
                throw new IllegalStateException("This should be called inside of onLoadChildren or onLoadItem methods");
            } else if (C0690g.this.f2628l.f2647b == null) {
                return null;
            } else {
                return new Bundle(C0690g.this.f2628l.f2647b);
            }
        }
    }

    /* renamed from: android.support.v4.i.g$h */
    public static class C0707h<T> {

        /* renamed from: a */
        private Object f2673a;

        /* renamed from: b */
        private boolean f2674b;

        /* renamed from: c */
        private boolean f2675c;

        /* renamed from: d */
        private int f2676d;

        C0707h(Object obj) {
            this.f2673a = obj;
        }

        /* renamed from: a */
        public void mo2465a() {
            if (this.f2674b) {
                throw new IllegalStateException("detach() called when detach() had already been called for: " + this.f2673a);
            } else if (this.f2675c) {
                throw new IllegalStateException("detach() called when sendResult() had already been called for: " + this.f2673a);
            } else {
                this.f2674b = true;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2473a(int i) {
            this.f2676d = i;
        }

        /* renamed from: a */
        public void mo2474a(T t) {
            if (this.f2675c) {
                throw new IllegalStateException("sendResult() called twice for: " + this.f2673a);
            }
            this.f2675c = true;
            mo2451a(t, this.f2676d);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2451a(T t, int i) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo2475b() {
            return this.f2674b || this.f2675c;
        }
    }

    /* renamed from: android.support.v4.i.g$i */
    private class C0708i {
        C0708i() {
        }

        /* renamed from: a */
        public void mo2476a(final C0717j jVar) {
            C0690g.this.f2629m.mo2496a(new Runnable() {
                public void run() {
                    if (C0690g.this.f2627k.remove(jVar.mo2492a()) != null) {
                    }
                }
            });
        }

        /* renamed from: a */
        public void mo2477a(final C0717j jVar, final Bundle bundle) {
            C0690g.this.f2629m.mo2496a(new Runnable() {
                public void run() {
                    IBinder a = jVar.mo2492a();
                    C0690g.this.f2627k.remove(a);
                    C0695b bVar = new C0695b();
                    bVar.f2648c = jVar;
                    bVar.f2647b = bundle;
                    C0690g.this.f2627k.put(a, bVar);
                }
            });
        }

        /* renamed from: a */
        public void mo2478a(String str, int i, Bundle bundle, C0717j jVar) {
            if (!C0690g.this.mo2444a(str, i)) {
                throw new IllegalArgumentException("Package/uid mismatch: uid=" + i + " package=" + str);
            }
            final C0717j jVar2 = jVar;
            final String str2 = str;
            final Bundle bundle2 = bundle;
            final int i2 = i;
            C0690g.this.f2629m.mo2496a(new Runnable() {
                public void run() {
                    IBinder a = jVar2.mo2492a();
                    C0690g.this.f2627k.remove(a);
                    C0695b bVar = new C0695b();
                    bVar.f2646a = str2;
                    bVar.f2647b = bundle2;
                    bVar.f2648c = jVar2;
                    bVar.f2649d = C0690g.this.mo2432a(str2, i2, bundle2);
                    if (bVar.f2649d == null) {
                        Log.i(C0690g.f2617a, "No root for client " + str2 + " from service " + getClass().getName());
                        try {
                            jVar2.mo2495b();
                        } catch (RemoteException e) {
                            Log.w(C0690g.f2617a, "Calling onConnectFailed() failed. Ignoring. pkg=" + str2);
                        }
                    } else {
                        try {
                            C0690g.this.f2627k.put(a, bVar);
                            if (C0690g.this.f2630n != null) {
                                jVar2.mo2493a(bVar.f2649d.mo2455a(), C0690g.this.f2630n, bVar.f2649d.mo2456b());
                            }
                        } catch (RemoteException e2) {
                            Log.w(C0690g.f2617a, "Calling onConnect() failed. Dropping client. pkg=" + str2);
                            C0690g.this.f2627k.remove(a);
                        }
                    }
                }
            });
        }

        /* renamed from: a */
        public void mo2479a(String str, Bundle bundle, C0813n nVar, C0717j jVar) {
            if (!TextUtils.isEmpty(str) && nVar != null) {
                final C0717j jVar2 = jVar;
                final String str2 = str;
                final Bundle bundle2 = bundle;
                final C0813n nVar2 = nVar;
                C0690g.this.f2629m.mo2496a(new Runnable() {
                    public void run() {
                        C0695b bVar = C0690g.this.f2627k.get(jVar2.mo2492a());
                        if (bVar == null) {
                            Log.w(C0690g.f2617a, "search for callback that isn't registered query=" + str2);
                        } else {
                            C0690g.this.mo2437a(str2, bundle2, bVar, nVar2);
                        }
                    }
                });
            }
        }

        /* renamed from: a */
        public void mo2480a(String str, IBinder iBinder, Bundle bundle, C0717j jVar) {
            final C0717j jVar2 = jVar;
            final String str2 = str;
            final IBinder iBinder2 = iBinder;
            final Bundle bundle2 = bundle;
            C0690g.this.f2629m.mo2496a(new Runnable() {
                public void run() {
                    C0695b bVar = C0690g.this.f2627k.get(jVar2.mo2492a());
                    if (bVar == null) {
                        Log.w(C0690g.f2617a, "addSubscription for callback that isn't registered id=" + str2);
                    } else {
                        C0690g.this.mo2440a(str2, bVar, iBinder2, bundle2);
                    }
                }
            });
        }

        /* renamed from: a */
        public void mo2481a(final String str, final IBinder iBinder, final C0717j jVar) {
            C0690g.this.f2629m.mo2496a(new Runnable() {
                public void run() {
                    C0695b bVar = C0690g.this.f2627k.get(jVar.mo2492a());
                    if (bVar == null) {
                        Log.w(C0690g.f2617a, "removeSubscription for callback that isn't registered id=" + str);
                    } else if (!C0690g.this.mo2445a(str, bVar, iBinder)) {
                        Log.w(C0690g.f2617a, "removeSubscription called for " + str + " which is not subscribed");
                    }
                }
            });
        }

        /* renamed from: a */
        public void mo2482a(final String str, final C0813n nVar, final C0717j jVar) {
            if (!TextUtils.isEmpty(str) && nVar != null) {
                C0690g.this.f2629m.mo2496a(new Runnable() {
                    public void run() {
                        C0695b bVar = C0690g.this.f2627k.get(jVar.mo2492a());
                        if (bVar == null) {
                            Log.w(C0690g.f2617a, "getMediaItem for callback that isn't registered id=" + str);
                        } else {
                            C0690g.this.mo2441a(str, bVar, nVar);
                        }
                    }
                });
            }
        }

        /* renamed from: b */
        public void mo2483b(final C0717j jVar) {
            C0690g.this.f2629m.mo2496a(new Runnable() {
                public void run() {
                    C0690g.this.f2627k.remove(jVar.mo2492a());
                }
            });
        }
    }

    /* renamed from: android.support.v4.i.g$j */
    private interface C0717j {
        /* renamed from: a */
        IBinder mo2492a();

        /* renamed from: a */
        void mo2493a(String str, C0618h.C0640i iVar, Bundle bundle);

        /* renamed from: a */
        void mo2494a(String str, List<C0541a.C0569k> list, Bundle bundle);

        /* renamed from: b */
        void mo2495b();
    }

    /* renamed from: android.support.v4.i.g$k */
    private class C0718k implements C0717j {

        /* renamed from: a */
        final Messenger f2708a;

        C0718k(Messenger messenger) {
            this.f2708a = messenger;
        }

        /* renamed from: a */
        private void m3798a(int i, Bundle bundle) {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.arg1 = 1;
            obtain.setData(bundle);
            this.f2708a.send(obtain);
        }

        /* renamed from: a */
        public IBinder mo2492a() {
            return this.f2708a.getBinder();
        }

        /* renamed from: a */
        public void mo2493a(String str, C0618h.C0640i iVar, Bundle bundle) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putInt(C0689f.f2603m, 1);
            Bundle bundle2 = new Bundle();
            bundle2.putString(C0689f.f2593c, str);
            bundle2.putParcelable(C0689f.f2595e, iVar);
            bundle2.putBundle(C0689f.f2599i, bundle);
            m3798a(1, bundle2);
        }

        /* renamed from: a */
        public void mo2494a(String str, List<C0541a.C0569k> list, Bundle bundle) {
            Bundle bundle2 = new Bundle();
            bundle2.putString(C0689f.f2593c, str);
            bundle2.putBundle(C0689f.f2596f, bundle);
            if (list != null) {
                bundle2.putParcelableArrayList(C0689f.f2594d, list instanceof ArrayList ? (ArrayList) list : new ArrayList(list));
            }
            m3798a(3, bundle2);
        }

        /* renamed from: b */
        public void mo2495b() {
            m3798a(2, (Bundle) null);
        }
    }

    /* renamed from: android.support.v4.i.g$l */
    private final class C0719l extends Handler {

        /* renamed from: b */
        private final C0708i f2711b = new C0708i();

        C0719l() {
        }

        /* renamed from: a */
        public void mo2496a(Runnable runnable) {
            if (Thread.currentThread() == getLooper().getThread()) {
                runnable.run();
            } else {
                post(runnable);
            }
        }

        public void handleMessage(Message message) {
            Bundle data = message.getData();
            switch (message.what) {
                case 1:
                    this.f2711b.mo2478a(data.getString(C0689f.f2597g), data.getInt(C0689f.f2592b), data.getBundle(C0689f.f2599i), (C0717j) new C0718k(message.replyTo));
                    return;
                case 2:
                    this.f2711b.mo2476a(new C0718k(message.replyTo));
                    return;
                case 3:
                    this.f2711b.mo2480a(data.getString(C0689f.f2593c), C0411y.m2301a(data, C0689f.f2591a), data.getBundle(C0689f.f2596f), (C0717j) new C0718k(message.replyTo));
                    return;
                case 4:
                    this.f2711b.mo2481a(data.getString(C0689f.f2593c), C0411y.m2301a(data, C0689f.f2591a), (C0717j) new C0718k(message.replyTo));
                    return;
                case 5:
                    this.f2711b.mo2482a(data.getString(C0689f.f2593c), (C0813n) data.getParcelable(C0689f.f2598h), (C0717j) new C0718k(message.replyTo));
                    return;
                case 6:
                    this.f2711b.mo2477a(new C0718k(message.replyTo), data.getBundle(C0689f.f2599i));
                    return;
                case 7:
                    this.f2711b.mo2483b(new C0718k(message.replyTo));
                    return;
                case 8:
                    this.f2711b.mo2479a(data.getString(C0689f.f2601k), data.getBundle(C0689f.f2600j), (C0813n) data.getParcelable(C0689f.f2598h), (C0717j) new C0718k(message.replyTo));
                    return;
                default:
                    Log.w(C0690g.f2617a, "Unhandled message: " + message + "\n  Service version: " + 1 + "\n  Client version: " + message.arg1);
                    return;
            }
        }

        public boolean sendMessageAtTime(Message message, long j) {
            Bundle data = message.getData();
            data.setClassLoader(C0541a.class.getClassLoader());
            data.putInt(C0689f.f2592b, Binder.getCallingUid());
            return super.sendMessageAtTime(message, j);
        }
    }

    @C0003aa
    /* renamed from: a */
    public C0618h.C0640i mo2431a() {
        return this.f2630n;
    }

    @C0003aa
    /* renamed from: a */
    public abstract C0694a mo2432a(@C0047z String str, int i, @C0003aa Bundle bundle);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public List<C0541a.C0569k> mo2433a(List<C0541a.C0569k> list, Bundle bundle) {
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
    public void mo2434a(C0618h.C0640i iVar) {
        if (iVar == null) {
            throw new IllegalArgumentException("Session token may not be null.");
        } else if (this.f2630n != null) {
            throw new IllegalStateException("The session token has already been set.");
        } else {
            this.f2630n = iVar;
            this.f2631o.mo2459a(iVar);
        }
    }

    /* renamed from: a */
    public void mo2435a(@C0047z String str) {
        if (str == null) {
            throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
        }
        this.f2631o.mo2460a(str, (Bundle) null);
    }

    /* renamed from: a */
    public void mo2436a(@C0047z String str, @C0047z Bundle bundle) {
        if (str == null) {
            throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
        } else if (bundle == null) {
            throw new IllegalArgumentException("options cannot be null in notifyChildrenChanged");
        } else {
            this.f2631o.mo2460a(str, bundle);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2437a(String str, Bundle bundle, C0695b bVar, final C0813n nVar) {
        C06933 r0 = new C0707h<List<C0541a.C0569k>>(str) {
            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public void mo2451a(List<C0541a.C0569k> list, int i) {
                if ((i & 4) != 0 || list == null) {
                    nVar.mo2684b(-1, (Bundle) null);
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putParcelableArray(C0690g.f2621e, (Parcelable[]) list.toArray(new C0541a.C0569k[0]));
                nVar.mo2684b(0, bundle);
            }
        };
        this.f2628l = bVar;
        mo2438a(str, bundle, (C0707h<List<C0541a.C0569k>>) r0);
        this.f2628l = null;
        if (!r0.mo2475b()) {
            throw new IllegalStateException("onSearch must call detach() or sendResult() before returning for query=" + str);
        }
    }

    /* renamed from: a */
    public void mo2438a(@C0047z String str, Bundle bundle, @C0047z C0707h<List<C0541a.C0569k>> hVar) {
        hVar.mo2473a(4);
        hVar.mo2474a(null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2439a(String str, C0695b bVar, Bundle bundle) {
        final C0695b bVar2 = bVar;
        final String str2 = str;
        final Bundle bundle2 = bundle;
        C06911 r0 = new C0707h<List<C0541a.C0569k>>(str) {
            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public void mo2451a(List<C0541a.C0569k> list, int i) {
                if (C0690g.this.f2627k.get(bVar2.f2648c.mo2492a()) == bVar2) {
                    if ((i & 1) != 0) {
                        list = C0690g.this.mo2433a(list, bundle2);
                    }
                    try {
                        bVar2.f2648c.mo2494a(str2, list, bundle2);
                    } catch (RemoteException e) {
                        Log.w(C0690g.f2617a, "Calling onLoadChildren() failed for id=" + str2 + " package=" + bVar2.f2646a);
                    }
                } else if (C0690g.f2618b) {
                    Log.d(C0690g.f2617a, "Not sending onLoadChildren result for connection that has been disconnected. pkg=" + bVar2.f2646a + " id=" + str2);
                }
            }
        };
        this.f2628l = bVar;
        if (bundle == null) {
            mo2442a(str, (C0707h<List<C0541a.C0569k>>) r0);
        } else {
            mo2443a(str, (C0707h<List<C0541a.C0569k>>) r0, bundle);
        }
        this.f2628l = null;
        if (!r0.mo2475b()) {
            throw new IllegalStateException("onLoadChildren must call detach() or sendResult() before returning for package=" + bVar.f2646a + " id=" + str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2440a(String str, C0695b bVar, IBinder iBinder, Bundle bundle) {
        List list = bVar.f2650e.get(str);
        List<C0894l> arrayList = list == null ? new ArrayList<>() : list;
        for (C0894l lVar : arrayList) {
            if (iBinder == lVar.f3081a && C0688e.m3722a(bundle, (Bundle) lVar.f3082b)) {
                return;
            }
        }
        arrayList.add(new C0894l(iBinder, bundle));
        bVar.f2650e.put(str, arrayList);
        mo2439a(str, bVar, bundle);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2441a(String str, C0695b bVar, final C0813n nVar) {
        C06922 r0 = new C0707h<C0541a.C0569k>(str) {
            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public void mo2451a(C0541a.C0569k kVar, int i) {
                if ((i & 2) != 0) {
                    nVar.mo2684b(-1, (Bundle) null);
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putParcelable(C0690g.f2620d, kVar);
                nVar.mo2684b(0, bundle);
            }
        };
        this.f2628l = bVar;
        mo2447b(str, r0);
        this.f2628l = null;
        if (!r0.mo2475b()) {
            throw new IllegalStateException("onLoadItem must call detach() or sendResult() before returning for id=" + str);
        }
    }

    /* renamed from: a */
    public abstract void mo2442a(@C0047z String str, @C0047z C0707h<List<C0541a.C0569k>> hVar);

    /* renamed from: a */
    public void mo2443a(@C0047z String str, @C0047z C0707h<List<C0541a.C0569k>> hVar, @C0047z Bundle bundle) {
        hVar.mo2473a(1);
        mo2442a(str, hVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo2444a(String str, int i) {
        if (str == null) {
            return false;
        }
        for (String equals : getPackageManager().getPackagesForUid(i)) {
            if (equals.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo2445a(String str, C0695b bVar, IBinder iBinder) {
        boolean z;
        if (iBinder == null) {
            return bVar.f2650e.remove(str) != null;
        }
        List list = bVar.f2650e.get(str);
        if (list != null) {
            Iterator it = list.iterator();
            z = false;
            while (it.hasNext()) {
                if (iBinder == ((C0894l) it.next()).f3081a) {
                    it.remove();
                    z = true;
                }
            }
            if (list.size() == 0) {
                bVar.f2650e.remove(str);
            }
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: b */
    public final Bundle mo2446b() {
        return this.f2631o.mo2461b();
    }

    /* renamed from: b */
    public void mo2447b(String str, @C0047z C0707h<C0541a.C0569k> hVar) {
        hVar.mo2473a(2);
        hVar.mo2474a(null);
    }

    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public IBinder onBind(Intent intent) {
        return this.f2631o.mo2457a(intent);
    }

    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26 || C0798c.m4074c()) {
            this.f2631o = new C0702f();
        } else if (Build.VERSION.SDK_INT >= 23) {
            this.f2631o = new C0700e();
        } else if (Build.VERSION.SDK_INT >= 21) {
            this.f2631o = new C0697d();
        } else {
            this.f2631o = new C0704g();
        }
        this.f2631o.mo2458a();
    }
}
