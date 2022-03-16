package android.support.p010v4.p013c;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.p010v4.p013c.C0186ad;
import android.support.p010v4.view.C1012af;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* renamed from: android.support.v4.c.ao */
public abstract class C0220ao extends C1012af {

    /* renamed from: c */
    private static final String f1307c = "FragmentStatePagerAdapter";

    /* renamed from: d */
    private static final boolean f1308d = false;

    /* renamed from: e */
    private final C0201ai f1309e;

    /* renamed from: f */
    private C0226aq f1310f = null;

    /* renamed from: g */
    private ArrayList<C0186ad.C0192d> f1311g = new ArrayList<>();

    /* renamed from: h */
    private ArrayList<C0186ad> f1312h = new ArrayList<>();

    /* renamed from: i */
    private C0186ad f1313i = null;

    public C0220ao(C0201ai aiVar) {
        this.f1309e = aiVar;
    }

    /* renamed from: a */
    public Parcelable mo1188a() {
        Bundle bundle = null;
        if (this.f1311g.size() > 0) {
            bundle = new Bundle();
            C0186ad.C0192d[] dVarArr = new C0186ad.C0192d[this.f1311g.size()];
            this.f1311g.toArray(dVarArr);
            bundle.putParcelableArray("states", dVarArr);
        }
        Bundle bundle2 = bundle;
        for (int i = 0; i < this.f1312h.size(); i++) {
            C0186ad adVar = this.f1312h.get(i);
            if (adVar != null && adVar.mo923y()) {
                if (bundle2 == null) {
                    bundle2 = new Bundle();
                }
                this.f1309e.mo1065a(bundle2, "f" + i, adVar);
            }
        }
        return bundle2;
    }

    /* renamed from: a */
    public abstract C0186ad mo1205a(int i);

    /* renamed from: a */
    public Object mo1190a(ViewGroup viewGroup, int i) {
        C0186ad.C0192d dVar;
        C0186ad adVar;
        if (this.f1312h.size() > i && (adVar = this.f1312h.get(i)) != null) {
            return adVar;
        }
        if (this.f1310f == null) {
            this.f1310f = this.f1309e.mo1063a();
        }
        C0186ad a = mo1205a(i);
        if (this.f1311g.size() > i && (dVar = this.f1311g.get(i)) != null) {
            a.mo831a(dVar);
        }
        while (this.f1312h.size() <= i) {
            this.f1312h.add((Object) null);
        }
        a.mo890g(false);
        a.mo892h(false);
        this.f1312h.set(i, a);
        this.f1310f.mo1226a(viewGroup.getId(), a);
        return a;
    }

    /* renamed from: a */
    public void mo1191a(Parcelable parcelable, ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            this.f1311g.clear();
            this.f1312h.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    this.f1311g.add((C0186ad.C0192d) parcelable2);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith("f")) {
                    int parseInt = Integer.parseInt(str.substring(1));
                    C0186ad a = this.f1309e.mo1061a(bundle, str);
                    if (a != null) {
                        while (this.f1312h.size() <= parseInt) {
                            this.f1312h.add((Object) null);
                        }
                        a.mo890g(false);
                        this.f1312h.set(parseInt, a);
                    } else {
                        Log.w(f1307c, "Bad fragment at key " + str);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void mo1192a(ViewGroup viewGroup) {
        if (viewGroup.getId() == -1) {
            throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
        }
    }

    /* renamed from: a */
    public void mo1193a(ViewGroup viewGroup, int i, Object obj) {
        C0186ad adVar = (C0186ad) obj;
        if (this.f1310f == null) {
            this.f1310f = this.f1309e.mo1063a();
        }
        while (this.f1311g.size() <= i) {
            this.f1311g.add((Object) null);
        }
        this.f1311g.set(i, adVar.mo923y() ? this.f1309e.mo1059a(adVar) : null);
        this.f1312h.set(i, (Object) null);
        this.f1310f.mo1228a(adVar);
    }

    /* renamed from: a */
    public boolean mo1194a(View view, Object obj) {
        return ((C0186ad) obj).mo798K() == view;
    }

    /* renamed from: b */
    public void mo1196b(ViewGroup viewGroup) {
        if (this.f1310f != null) {
            this.f1310f.mo1249k();
            this.f1310f = null;
        }
    }

    /* renamed from: b */
    public void mo1197b(ViewGroup viewGroup, int i, Object obj) {
        C0186ad adVar = (C0186ad) obj;
        if (adVar != this.f1313i) {
            if (this.f1313i != null) {
                this.f1313i.mo890g(false);
                this.f1313i.mo892h(false);
            }
            if (adVar != null) {
                adVar.mo890g(true);
                adVar.mo892h(true);
            }
            this.f1313i = adVar;
        }
    }
}
