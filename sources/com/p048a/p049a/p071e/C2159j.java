package com.p048a.p049a.p071e;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import com.p048a.p049a.C2256q;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@TargetApi(11)
/* renamed from: com.a.a.e.j */
public class C2159j extends Fragment {

    /* renamed from: a */
    private final C2148a f7119a;

    /* renamed from: b */
    private final C2163l f7120b;

    /* renamed from: c */
    private C2256q f7121c;

    /* renamed from: d */
    private final HashSet<C2159j> f7122d;

    /* renamed from: e */
    private C2159j f7123e;

    /* renamed from: com.a.a.e.j$a */
    private class C2161a implements C2163l {
        private C2161a() {
        }

        /* renamed from: a */
        public Set<C2256q> mo8093a() {
            Set<C2159j> d = C2159j.this.mo8098d();
            HashSet hashSet = new HashSet(d.size());
            for (C2159j next : d) {
                if (next.mo8096b() != null) {
                    hashSet.add(next.mo8096b());
                }
            }
            return hashSet;
        }
    }

    public C2159j() {
        this(new C2148a());
    }

    @SuppressLint({"ValidFragment"})
    C2159j(C2148a aVar) {
        this.f7120b = new C2161a();
        this.f7122d = new HashSet<>();
        this.f7119a = aVar;
    }

    /* renamed from: a */
    private void m12240a(C2159j jVar) {
        this.f7122d.add(jVar);
    }

    @TargetApi(17)
    /* renamed from: a */
    private boolean m12241a(Fragment fragment) {
        Fragment parentFragment = getParentFragment();
        while (fragment.getParentFragment() != null) {
            if (fragment.getParentFragment() == parentFragment) {
                return true;
            }
            fragment = fragment.getParentFragment();
        }
        return false;
    }

    /* renamed from: b */
    private void m12242b(C2159j jVar) {
        this.f7122d.remove(jVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C2148a mo8094a() {
        return this.f7119a;
    }

    /* renamed from: a */
    public void mo8095a(C2256q qVar) {
        this.f7121c = qVar;
    }

    /* renamed from: b */
    public C2256q mo8096b() {
        return this.f7121c;
    }

    /* renamed from: c */
    public C2163l mo8097c() {
        return this.f7120b;
    }

    @TargetApi(17)
    /* renamed from: d */
    public Set<C2159j> mo8098d() {
        if (this.f7123e == this) {
            return Collections.unmodifiableSet(this.f7122d);
        }
        if (this.f7123e == null || Build.VERSION.SDK_INT < 17) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet();
        for (C2159j next : this.f7123e.mo8098d()) {
            if (m12241a(next.getParentFragment())) {
                hashSet.add(next);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f7123e = C2162k.m12249a().mo8106a(getActivity().getFragmentManager());
        if (this.f7123e != this) {
            this.f7123e.m12240a(this);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.f7119a.mo8086c();
    }

    public void onDetach() {
        super.onDetach();
        if (this.f7123e != null) {
            this.f7123e.m12242b(this);
            this.f7123e = null;
        }
    }

    public void onLowMemory() {
        if (this.f7121c != null) {
            this.f7121c.mo8403a();
        }
    }

    public void onStart() {
        super.onStart();
        this.f7119a.mo8083a();
    }

    public void onStop() {
        super.onStop();
        this.f7119a.mo8085b();
    }

    public void onTrimMemory(int i) {
        if (this.f7121c != null) {
            this.f7121c.mo8404a(i);
        }
    }
}
