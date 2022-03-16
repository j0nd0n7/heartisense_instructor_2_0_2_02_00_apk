package android.support.p010v4.p013c;

import android.os.Parcelable;
import android.support.p010v4.view.C1012af;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: android.support.v4.c.am */
public abstract class C0217am extends C1012af {

    /* renamed from: c */
    private static final String f1290c = "FragmentPagerAdapter";

    /* renamed from: d */
    private static final boolean f1291d = false;

    /* renamed from: e */
    private final C0201ai f1292e;

    /* renamed from: f */
    private C0226aq f1293f = null;

    /* renamed from: g */
    private C0186ad f1294g = null;

    public C0217am(C0201ai aiVar) {
        this.f1292e = aiVar;
    }

    /* renamed from: a */
    private static String m1363a(int i, long j) {
        return "android:switcher:" + i + ":" + j;
    }

    /* renamed from: a */
    public Parcelable mo1188a() {
        return null;
    }

    /* renamed from: a */
    public abstract C0186ad mo1189a(int i);

    /* renamed from: a */
    public Object mo1190a(ViewGroup viewGroup, int i) {
        if (this.f1293f == null) {
            this.f1293f = this.f1292e.mo1063a();
        }
        long b = mo1195b(i);
        C0186ad a = this.f1292e.mo1062a(m1363a(viewGroup.getId(), b));
        if (a != null) {
            this.f1293f.mo1243e(a);
        } else {
            a = mo1189a(i);
            this.f1293f.mo1227a(viewGroup.getId(), a, m1363a(viewGroup.getId(), b));
        }
        if (a != this.f1294g) {
            a.mo890g(false);
            a.mo892h(false);
        }
        return a;
    }

    /* renamed from: a */
    public void mo1191a(Parcelable parcelable, ClassLoader classLoader) {
    }

    /* renamed from: a */
    public void mo1192a(ViewGroup viewGroup) {
        if (viewGroup.getId() == -1) {
            throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
        }
    }

    /* renamed from: a */
    public void mo1193a(ViewGroup viewGroup, int i, Object obj) {
        if (this.f1293f == null) {
            this.f1293f = this.f1292e.mo1063a();
        }
        this.f1293f.mo1242d((C0186ad) obj);
    }

    /* renamed from: a */
    public boolean mo1194a(View view, Object obj) {
        return ((C0186ad) obj).mo798K() == view;
    }

    /* renamed from: b */
    public long mo1195b(int i) {
        return (long) i;
    }

    /* renamed from: b */
    public void mo1196b(ViewGroup viewGroup) {
        if (this.f1293f != null) {
            this.f1293f.mo1249k();
            this.f1293f = null;
        }
    }

    /* renamed from: b */
    public void mo1197b(ViewGroup viewGroup, int i, Object obj) {
        C0186ad adVar = (C0186ad) obj;
        if (adVar != this.f1294g) {
            if (this.f1294g != null) {
                this.f1294g.mo890g(false);
                this.f1294g.mo892h(false);
            }
            if (adVar != null) {
                adVar.mo890g(true);
                adVar.mo892h(true);
            }
            this.f1294g = adVar;
        }
    }
}
