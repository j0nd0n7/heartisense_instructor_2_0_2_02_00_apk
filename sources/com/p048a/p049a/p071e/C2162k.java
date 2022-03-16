package com.p048a.p049a.p071e;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.p010v4.p013c.C0186ad;
import android.support.p010v4.p013c.C0194ae;
import android.support.p010v4.p013c.C0201ai;
import android.util.Log;
import com.p048a.p049a.C2256q;
import com.p048a.p049a.p078j.C2238i;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.a.a.e.k */
public class C2162k implements Handler.Callback {

    /* renamed from: a */
    static final String f7125a = "com.bumptech.glide.manager";

    /* renamed from: d */
    private static final String f7126d = "RMRetriever";

    /* renamed from: e */
    private static final C2162k f7127e = new C2162k();

    /* renamed from: f */
    private static final int f7128f = 1;

    /* renamed from: g */
    private static final int f7129g = 2;

    /* renamed from: b */
    final Map<FragmentManager, C2159j> f7130b = new HashMap();

    /* renamed from: c */
    final Map<C0201ai, C2165n> f7131c = new HashMap();

    /* renamed from: h */
    private volatile C2256q f7132h;

    /* renamed from: i */
    private final Handler f7133i = new Handler(Looper.getMainLooper(), this);

    C2162k() {
    }

    /* renamed from: a */
    public static C2162k m12249a() {
        return f7127e;
    }

    /* renamed from: b */
    private C2256q m12250b(Context context) {
        if (this.f7132h == null) {
            synchronized (this) {
                if (this.f7132h == null) {
                    this.f7132h = new C2256q(context.getApplicationContext(), new C2149b(), new C2155f());
                }
            }
        }
        return this.f7132h;
    }

    @TargetApi(17)
    /* renamed from: b */
    private static void m12251b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 17 && activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    /* access modifiers changed from: package-private */
    @TargetApi(17)
    /* renamed from: a */
    public C2159j mo8106a(FragmentManager fragmentManager) {
        C2159j jVar = (C2159j) fragmentManager.findFragmentByTag(f7125a);
        if (jVar != null) {
            return jVar;
        }
        C2159j jVar2 = this.f7130b.get(fragmentManager);
        if (jVar2 != null) {
            return jVar2;
        }
        C2159j jVar3 = new C2159j();
        this.f7130b.put(fragmentManager, jVar3);
        fragmentManager.beginTransaction().add(jVar3, f7125a).commitAllowingStateLoss();
        this.f7133i.obtainMessage(1, fragmentManager).sendToTarget();
        return jVar3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C2165n mo8107a(C0201ai aiVar) {
        C2165n nVar = (C2165n) aiVar.mo1062a(f7125a);
        if (nVar != null) {
            return nVar;
        }
        C2165n nVar2 = this.f7131c.get(aiVar);
        if (nVar2 != null) {
            return nVar2;
        }
        C2165n nVar3 = new C2165n();
        this.f7131c.put(aiVar, nVar3);
        aiVar.mo1063a().mo1229a((C0186ad) nVar3, f7125a).mo1247i();
        this.f7133i.obtainMessage(2, aiVar).sendToTarget();
        return nVar3;
    }

    @TargetApi(11)
    /* renamed from: a */
    public C2256q mo8108a(Activity activity) {
        if (C2238i.m12736d() || Build.VERSION.SDK_INT < 11) {
            return mo8110a(activity.getApplicationContext());
        }
        m12251b(activity);
        return mo8111a((Context) activity, activity.getFragmentManager());
    }

    @TargetApi(17)
    /* renamed from: a */
    public C2256q mo8109a(Fragment fragment) {
        if (fragment.getActivity() == null) {
            throw new IllegalArgumentException("You cannot start a load on a fragment before it is attached");
        } else if (C2238i.m12736d() || Build.VERSION.SDK_INT < 17) {
            return mo8110a(fragment.getActivity().getApplicationContext());
        } else {
            return mo8111a((Context) fragment.getActivity(), fragment.getChildFragmentManager());
        }
    }

    /* renamed from: a */
    public C2256q mo8110a(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        if (C2238i.m12735c() && !(context instanceof Application)) {
            if (context instanceof C0194ae) {
                return mo8114a((C0194ae) context);
            }
            if (context instanceof Activity) {
                return mo8108a((Activity) context);
            }
            if (context instanceof ContextWrapper) {
                return mo8110a(((ContextWrapper) context).getBaseContext());
            }
        }
        return m12250b(context);
    }

    /* access modifiers changed from: package-private */
    @TargetApi(11)
    /* renamed from: a */
    public C2256q mo8111a(Context context, FragmentManager fragmentManager) {
        C2159j a = mo8106a(fragmentManager);
        C2256q b = a.mo8096b();
        if (b != null) {
            return b;
        }
        C2256q qVar = new C2256q(context, a.mo8094a(), a.mo8097c());
        a.mo8095a(qVar);
        return qVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C2256q mo8112a(Context context, C0201ai aiVar) {
        C2165n a = mo8107a(aiVar);
        C2256q b = a.mo772b();
        if (b != null) {
            return b;
        }
        C2256q qVar = new C2256q(context, a.mo764a(), a.mo8125c());
        a.mo8124a(qVar);
        return qVar;
    }

    /* renamed from: a */
    public C2256q mo8113a(C0186ad adVar) {
        if (adVar.mo915r() == null) {
            throw new IllegalArgumentException("You cannot start a load on a fragment before it is attached");
        } else if (C2238i.m12736d()) {
            return mo8110a(adVar.mo915r().getApplicationContext());
        } else {
            return mo8112a((Context) adVar.mo915r(), adVar.mo920v());
        }
    }

    /* renamed from: a */
    public C2256q mo8114a(C0194ae aeVar) {
        if (C2238i.m12736d()) {
            return mo8110a(aeVar.getApplicationContext());
        }
        m12251b((Activity) aeVar);
        return mo8112a((Context) aeVar, aeVar.mo958j());
    }

    public boolean handleMessage(Message message) {
        Object remove;
        Object obj = null;
        boolean z = true;
        switch (message.what) {
            case 1:
                obj = (FragmentManager) message.obj;
                remove = this.f7130b.remove(obj);
                break;
            case 2:
                obj = (C0201ai) message.obj;
                remove = this.f7131c.remove(obj);
                break;
            default:
                z = false;
                remove = null;
                break;
        }
        if (z && remove == null && Log.isLoggable(f7126d, 5)) {
            Log.w(f7126d, "Failed to remove expected request manager fragment, manager: " + obj);
        }
        return z;
    }
}
