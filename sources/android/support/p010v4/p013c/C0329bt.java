package android.support.p010v4.p013c;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.C0011ag;
import android.support.p010v4.p013c.C0337bv;
import android.util.Log;

/* renamed from: android.support.v4.c.bt */
public final class C0329bt extends C0337bv.C0338a {

    /* renamed from: a */
    public static final String f1803a = "android.remoteinput.results";

    /* renamed from: b */
    public static final String f1804b = "android.remoteinput.resultsData";
    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})

    /* renamed from: c */
    public static final C0337bv.C0338a.C0339a f1805c = new C0337bv.C0338a.C0339a() {
        /* renamed from: a */
        public C0329bt mo1560b(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z, Bundle bundle) {
            return new C0329bt(str, charSequence, charSequenceArr, z, bundle);
        }

        /* renamed from: a */
        public C0329bt[] mo1561b(int i) {
            return new C0329bt[i];
        }
    };

    /* renamed from: d */
    private static final String f1806d = "RemoteInput";

    /* renamed from: j */
    private static final C0332b f1807j;

    /* renamed from: e */
    private final String f1808e;

    /* renamed from: f */
    private final CharSequence f1809f;

    /* renamed from: g */
    private final CharSequence[] f1810g;

    /* renamed from: h */
    private final boolean f1811h;

    /* renamed from: i */
    private final Bundle f1812i;

    /* renamed from: android.support.v4.c.bt$a */
    public static final class C0331a {

        /* renamed from: a */
        private final String f1813a;

        /* renamed from: b */
        private CharSequence f1814b;

        /* renamed from: c */
        private CharSequence[] f1815c;

        /* renamed from: d */
        private boolean f1816d = true;

        /* renamed from: e */
        private Bundle f1817e = new Bundle();

        public C0331a(String str) {
            if (str == null) {
                throw new IllegalArgumentException("Result key can't be null");
            }
            this.f1813a = str;
        }

        /* renamed from: a */
        public Bundle mo1562a() {
            return this.f1817e;
        }

        /* renamed from: a */
        public C0331a mo1563a(Bundle bundle) {
            if (bundle != null) {
                this.f1817e.putAll(bundle);
            }
            return this;
        }

        /* renamed from: a */
        public C0331a mo1564a(CharSequence charSequence) {
            this.f1814b = charSequence;
            return this;
        }

        /* renamed from: a */
        public C0331a mo1565a(boolean z) {
            this.f1816d = z;
            return this;
        }

        /* renamed from: a */
        public C0331a mo1566a(CharSequence[] charSequenceArr) {
            this.f1815c = charSequenceArr;
            return this;
        }

        /* renamed from: b */
        public C0329bt mo1567b() {
            return new C0329bt(this.f1813a, this.f1814b, this.f1815c, this.f1816d, this.f1817e);
        }
    }

    /* renamed from: android.support.v4.c.bt$b */
    interface C0332b {
        /* renamed from: a */
        Bundle mo1568a(Intent intent);

        /* renamed from: a */
        void mo1569a(C0329bt[] btVarArr, Intent intent, Bundle bundle);
    }

    /* renamed from: android.support.v4.c.bt$c */
    static class C0333c implements C0332b {
        C0333c() {
        }

        /* renamed from: a */
        public Bundle mo1568a(Intent intent) {
            return C0336bu.m1995a(intent);
        }

        /* renamed from: a */
        public void mo1569a(C0329bt[] btVarArr, Intent intent, Bundle bundle) {
            C0336bu.m1996a(btVarArr, intent, bundle);
        }
    }

    /* renamed from: android.support.v4.c.bt$d */
    static class C0334d implements C0332b {
        C0334d() {
        }

        /* renamed from: a */
        public Bundle mo1568a(Intent intent) {
            Log.w(C0329bt.f1806d, "RemoteInput is only supported from API Level 16");
            return null;
        }

        /* renamed from: a */
        public void mo1569a(C0329bt[] btVarArr, Intent intent, Bundle bundle) {
            Log.w(C0329bt.f1806d, "RemoteInput is only supported from API Level 16");
        }
    }

    /* renamed from: android.support.v4.c.bt$e */
    static class C0335e implements C0332b {
        C0335e() {
        }

        /* renamed from: a */
        public Bundle mo1568a(Intent intent) {
            return C0340bw.m2006a(intent);
        }

        /* renamed from: a */
        public void mo1569a(C0329bt[] btVarArr, Intent intent, Bundle bundle) {
            C0340bw.m2009a(btVarArr, intent, bundle);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 20) {
            f1807j = new C0333c();
        } else if (Build.VERSION.SDK_INT >= 16) {
            f1807j = new C0335e();
        } else {
            f1807j = new C0334d();
        }
    }

    C0329bt(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z, Bundle bundle) {
        this.f1808e = str;
        this.f1809f = charSequence;
        this.f1810g = charSequenceArr;
        this.f1811h = z;
        this.f1812i = bundle;
    }

    /* renamed from: a */
    public static Bundle m1970a(Intent intent) {
        return f1807j.mo1568a(intent);
    }

    /* renamed from: a */
    public static void m1971a(C0329bt[] btVarArr, Intent intent, Bundle bundle) {
        f1807j.mo1569a(btVarArr, intent, bundle);
    }

    /* renamed from: a */
    public String mo1553a() {
        return this.f1808e;
    }

    /* renamed from: b */
    public CharSequence mo1554b() {
        return this.f1809f;
    }

    /* renamed from: c */
    public CharSequence[] mo1555c() {
        return this.f1810g;
    }

    /* renamed from: d */
    public boolean mo1556d() {
        return this.f1811h;
    }

    /* renamed from: e */
    public Bundle mo1557e() {
        return this.f1812i;
    }
}
