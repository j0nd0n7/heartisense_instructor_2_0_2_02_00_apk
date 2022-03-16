package android.support.p010v4.p013c;

import android.os.Build;
import android.support.p010v4.p013c.C0186ad;
import android.support.p010v4.p013c.C0201ai;
import android.support.p010v4.p013c.C0205aj;
import android.support.p010v4.p033o.C0885h;
import android.support.p010v4.view.C1040ar;
import android.util.Log;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* renamed from: android.support.v4.c.t */
final class C0404t extends C0226aq implements C0201ai.C0202a, C0205aj.C0211c {

    /* renamed from: a */
    static final String f1885a = "FragmentManager";

    /* renamed from: b */
    static final boolean f1886b = (Build.VERSION.SDK_INT >= 21);

    /* renamed from: d */
    static final int f1887d = 0;

    /* renamed from: e */
    static final int f1888e = 1;

    /* renamed from: f */
    static final int f1889f = 2;

    /* renamed from: g */
    static final int f1890g = 3;

    /* renamed from: h */
    static final int f1891h = 4;

    /* renamed from: i */
    static final int f1892i = 5;

    /* renamed from: j */
    static final int f1893j = 6;

    /* renamed from: k */
    static final int f1894k = 7;

    /* renamed from: A */
    CharSequence f1895A;

    /* renamed from: B */
    ArrayList<String> f1896B;

    /* renamed from: C */
    ArrayList<String> f1897C;

    /* renamed from: D */
    boolean f1898D = false;

    /* renamed from: c */
    final C0205aj f1899c;

    /* renamed from: l */
    ArrayList<C0405a> f1900l = new ArrayList<>();

    /* renamed from: m */
    int f1901m;

    /* renamed from: n */
    int f1902n;

    /* renamed from: o */
    int f1903o;

    /* renamed from: p */
    int f1904p;

    /* renamed from: q */
    int f1905q;

    /* renamed from: r */
    int f1906r;

    /* renamed from: s */
    boolean f1907s;

    /* renamed from: t */
    boolean f1908t = true;

    /* renamed from: u */
    String f1909u;

    /* renamed from: v */
    boolean f1910v;

    /* renamed from: w */
    int f1911w = -1;

    /* renamed from: x */
    int f1912x;

    /* renamed from: y */
    CharSequence f1913y;

    /* renamed from: z */
    int f1914z;

    /* renamed from: android.support.v4.c.t$a */
    static final class C0405a {

        /* renamed from: a */
        int f1915a;

        /* renamed from: b */
        C0186ad f1916b;

        /* renamed from: c */
        int f1917c;

        /* renamed from: d */
        int f1918d;

        /* renamed from: e */
        int f1919e;

        /* renamed from: f */
        int f1920f;

        C0405a() {
        }
    }

    public C0404t(C0205aj ajVar) {
        this.f1899c = ajVar;
    }

    /* renamed from: a */
    private void m2244a(int i, C0186ad adVar, String str, int i2) {
        Class<?> cls = adVar.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from" + " instance state.");
        }
        adVar.f1130J = this.f1899c;
        if (str != null) {
            if (adVar.f1137Q == null || str.equals(adVar.f1137Q)) {
                adVar.f1137Q = str;
            } else {
                throw new IllegalStateException("Can't change tag of fragment " + adVar + ": was " + adVar.f1137Q + " now " + str);
            }
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + adVar + " with tag " + str + " to container view with no id");
            } else if (adVar.f1135O == 0 || adVar.f1135O == i) {
                adVar.f1135O = i;
                adVar.f1136P = i;
            } else {
                throw new IllegalStateException("Can't change container ID of fragment " + adVar + ": was " + adVar.f1135O + " now " + i);
            }
        }
        C0405a aVar = new C0405a();
        aVar.f1915a = i2;
        aVar.f1916b = adVar;
        mo1682a(aVar);
    }

    /* renamed from: b */
    private static boolean m2245b(C0405a aVar) {
        C0186ad adVar = aVar.f1916b;
        return adVar.f1124D && adVar.f1146Z != null && !adVar.f1139S && !adVar.f1138R && adVar.mo861ar();
    }

    /* renamed from: a */
    public int mo1082a() {
        return this.f1911w;
    }

    /* renamed from: a */
    public C0226aq mo1223a(int i) {
        this.f1905q = i;
        return this;
    }

    /* renamed from: a */
    public C0226aq mo1224a(int i, int i2) {
        return mo1225a(i, i2, 0, 0);
    }

    /* renamed from: a */
    public C0226aq mo1225a(int i, int i2, int i3, int i4) {
        this.f1901m = i;
        this.f1902n = i2;
        this.f1903o = i3;
        this.f1904p = i4;
        return this;
    }

    /* renamed from: a */
    public C0226aq mo1226a(int i, C0186ad adVar) {
        m2244a(i, adVar, (String) null, 1);
        return this;
    }

    /* renamed from: a */
    public C0226aq mo1227a(int i, C0186ad adVar, String str) {
        m2244a(i, adVar, str, 1);
        return this;
    }

    /* renamed from: a */
    public C0226aq mo1228a(C0186ad adVar) {
        C0405a aVar = new C0405a();
        aVar.f1915a = 3;
        aVar.f1916b = adVar;
        mo1682a(aVar);
        return this;
    }

    /* renamed from: a */
    public C0226aq mo1229a(C0186ad adVar, String str) {
        m2244a(0, adVar, str, 1);
        return this;
    }

    /* renamed from: a */
    public C0226aq mo1230a(View view, String str) {
        if (f1886b) {
            String M = C1040ar.m5863M(view);
            if (M == null) {
                throw new IllegalArgumentException("Unique transitionNames are required for all sharedElements");
            }
            if (this.f1896B == null) {
                this.f1896B = new ArrayList<>();
                this.f1897C = new ArrayList<>();
            } else if (this.f1897C.contains(str)) {
                throw new IllegalArgumentException("A shared element with the target name '" + str + "' has already been added to the transaction.");
            } else if (this.f1896B.contains(M)) {
                throw new IllegalArgumentException("A shared element with the source name '" + M + " has already been added to the transaction.");
            }
            this.f1896B.add(M);
            this.f1897C.add(str);
        }
        return this;
    }

    /* renamed from: a */
    public C0226aq mo1231a(CharSequence charSequence) {
        this.f1912x = 0;
        this.f1913y = charSequence;
        return this;
    }

    /* renamed from: a */
    public C0226aq mo1232a(String str) {
        if (!this.f1908t) {
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
        this.f1907s = true;
        this.f1909u = str;
        return this;
    }

    /* renamed from: a */
    public C0226aq mo1233a(boolean z) {
        this.f1898D = z;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1681a(C0186ad.C0191c cVar) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.f1900l.size()) {
                C0405a aVar = this.f1900l.get(i2);
                if (m2245b(aVar)) {
                    aVar.f1916b.mo830a(cVar);
                }
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1682a(C0405a aVar) {
        this.f1900l.add(aVar);
        aVar.f1917c = this.f1901m;
        aVar.f1918d = this.f1902n;
        aVar.f1919e = this.f1903o;
        aVar.f1920f = this.f1904p;
    }

    /* renamed from: a */
    public void mo1683a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        mo1684a(str, printWriter, true);
    }

    /* renamed from: a */
    public void mo1684a(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f1909u);
            printWriter.print(" mIndex=");
            printWriter.print(this.f1911w);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f1910v);
            if (this.f1905q != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f1905q));
                printWriter.print(" mTransitionStyle=#");
                printWriter.println(Integer.toHexString(this.f1906r));
            }
            if (!(this.f1901m == 0 && this.f1902n == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1901m));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1902n));
            }
            if (!(this.f1903o == 0 && this.f1904p == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1903o));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1904p));
            }
            if (!(this.f1912x == 0 && this.f1913y == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1912x));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f1913y);
            }
            if (!(this.f1914z == 0 && this.f1895A == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1914z));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f1895A);
            }
        }
        if (!this.f1900l.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            str + "    ";
            int size = this.f1900l.size();
            for (int i = 0; i < size; i++) {
                C0405a aVar = this.f1900l.get(i);
                switch (aVar.f1915a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    default:
                        str2 = "cmd=" + aVar.f1915a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.f1916b);
                if (z) {
                    if (!(aVar.f1917c == 0 && aVar.f1918d == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f1917c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f1918d));
                    }
                    if (aVar.f1919e != 0 || aVar.f1920f != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f1919e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f1920f));
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1685a(ArrayList<C0186ad> arrayList) {
        boolean z;
        int i;
        int i2 = 0;
        while (i2 < this.f1900l.size()) {
            C0405a aVar = this.f1900l.get(i2);
            switch (aVar.f1915a) {
                case 1:
                case 7:
                    arrayList.add(aVar.f1916b);
                    break;
                case 2:
                    C0186ad adVar = aVar.f1916b;
                    int i3 = adVar.f1136P;
                    int size = arrayList.size() - 1;
                    int i4 = i2;
                    boolean z2 = false;
                    while (size >= 0) {
                        C0186ad adVar2 = arrayList.get(size);
                        if (adVar2.f1136P != i3) {
                            z = z2;
                            i = i4;
                        } else if (adVar2 == adVar) {
                            z = true;
                            i = i4;
                        } else {
                            C0405a aVar2 = new C0405a();
                            aVar2.f1915a = 3;
                            aVar2.f1916b = adVar2;
                            aVar2.f1917c = aVar.f1917c;
                            aVar2.f1919e = aVar.f1919e;
                            aVar2.f1918d = aVar.f1918d;
                            aVar2.f1920f = aVar.f1920f;
                            this.f1900l.add(i4, aVar2);
                            arrayList.remove(adVar2);
                            boolean z3 = z2;
                            i = i4 + 1;
                            z = z3;
                        }
                        size--;
                        i4 = i;
                        z2 = z;
                    }
                    if (!z2) {
                        aVar.f1915a = 1;
                        arrayList.add(adVar);
                        i2 = i4;
                        break;
                    } else {
                        this.f1900l.remove(i4);
                        i2 = i4 - 1;
                        break;
                    }
                case 3:
                case 6:
                    arrayList.remove(aVar.f1916b);
                    break;
            }
            i2++;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo1686a(ArrayList<C0404t> arrayList, int i, int i2) {
        int i3;
        if (i2 == i) {
            return false;
        }
        int size = this.f1900l.size();
        int i4 = -1;
        int i5 = 0;
        while (i5 < size) {
            int i6 = this.f1900l.get(i5).f1916b.f1136P;
            if (i6 == 0 || i6 == i4) {
                i3 = i4;
            } else {
                for (int i7 = i; i7 < i2; i7++) {
                    C0404t tVar = arrayList.get(i7);
                    int size2 = tVar.f1900l.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        if (tVar.f1900l.get(i8).f1916b.f1136P == i6) {
                            return true;
                        }
                    }
                }
                i3 = i6;
            }
            i5++;
            i4 = i3;
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo1176a(ArrayList<C0404t> arrayList, ArrayList<Boolean> arrayList2) {
        if (C0205aj.f1231b) {
            Log.v(f1885a, "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(false);
        if (!this.f1907s) {
            return true;
        }
        this.f1899c.mo1126b(this);
        return true;
    }

    /* renamed from: b */
    public int mo1083b() {
        return this.f1912x;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo1687b(boolean z) {
        if (this.f1910v) {
            throw new IllegalStateException("commit already called");
        }
        if (C0205aj.f1231b) {
            Log.v(f1885a, "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new C0885h(f1885a));
            mo1683a("  ", (FileDescriptor) null, printWriter, (String[]) null);
            printWriter.close();
        }
        this.f1910v = true;
        if (this.f1907s) {
            this.f1911w = this.f1899c.mo1102a(this);
        } else {
            this.f1911w = -1;
        }
        this.f1899c.mo1115a((C0205aj.C0211c) this, z);
        return this.f1911w;
    }

    /* renamed from: b */
    public C0226aq mo1234b(int i) {
        this.f1906r = i;
        return this;
    }

    /* renamed from: b */
    public C0226aq mo1235b(int i, C0186ad adVar) {
        return mo1236b(i, adVar, (String) null);
    }

    /* renamed from: b */
    public C0226aq mo1236b(int i, C0186ad adVar, String str) {
        if (i == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        m2244a(i, adVar, str, 2);
        return this;
    }

    /* renamed from: b */
    public C0226aq mo1237b(C0186ad adVar) {
        C0405a aVar = new C0405a();
        aVar.f1915a = 4;
        aVar.f1916b = adVar;
        mo1682a(aVar);
        return this;
    }

    /* renamed from: b */
    public C0226aq mo1238b(CharSequence charSequence) {
        this.f1914z = 0;
        this.f1895A = charSequence;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo1688b(ArrayList<C0186ad> arrayList) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.f1900l.size()) {
                C0405a aVar = this.f1900l.get(i2);
                switch (aVar.f1915a) {
                    case 1:
                    case 7:
                        arrayList.remove(aVar.f1916b);
                        break;
                    case 3:
                    case 6:
                        arrayList.add(aVar.f1916b);
                        break;
                }
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public int mo1084c() {
        return this.f1914z;
    }

    /* renamed from: c */
    public C0226aq mo1239c(int i) {
        this.f1912x = i;
        this.f1913y = null;
        return this;
    }

    /* renamed from: c */
    public C0226aq mo1240c(C0186ad adVar) {
        C0405a aVar = new C0405a();
        aVar.f1915a = 5;
        aVar.f1916b = adVar;
        mo1682a(aVar);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo1689c(boolean z) {
        for (int size = this.f1900l.size() - 1; size >= 0; size--) {
            C0405a aVar = this.f1900l.get(size);
            C0186ad adVar = aVar.f1916b;
            adVar.mo866b(C0205aj.m1258e(this.f1905q), this.f1906r);
            switch (aVar.f1915a) {
                case 1:
                    adVar.mo873c(aVar.f1920f);
                    this.f1899c.mo1144h(adVar);
                    break;
                case 3:
                    adVar.mo873c(aVar.f1919e);
                    this.f1899c.mo1113a(adVar, false);
                    break;
                case 4:
                    adVar.mo873c(aVar.f1919e);
                    this.f1899c.mo1148j(adVar);
                    break;
                case 5:
                    adVar.mo873c(aVar.f1920f);
                    this.f1899c.mo1147i(adVar);
                    break;
                case 6:
                    adVar.mo873c(aVar.f1919e);
                    this.f1899c.mo1153l(adVar);
                    break;
                case 7:
                    adVar.mo873c(aVar.f1920f);
                    this.f1899c.mo1151k(adVar);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f1915a);
            }
            if (!this.f1898D && aVar.f1915a != 3) {
                this.f1899c.mo1138e(adVar);
            }
        }
        if (!this.f1898D && z) {
            this.f1899c.mo1106a(this.f1899c.f1261t, true);
        }
    }

    /* renamed from: d */
    public C0226aq mo1241d(int i) {
        this.f1914z = i;
        this.f1895A = null;
        return this;
    }

    /* renamed from: d */
    public C0226aq mo1242d(C0186ad adVar) {
        C0405a aVar = new C0405a();
        aVar.f1915a = 6;
        aVar.f1916b = adVar;
        mo1682a(aVar);
        return this;
    }

    /* renamed from: d */
    public CharSequence mo1085d() {
        return this.f1912x != 0 ? this.f1899c.f1262u.mo1049i().getText(this.f1912x) : this.f1913y;
    }

    /* renamed from: e */
    public C0226aq mo1243e(C0186ad adVar) {
        C0405a aVar = new C0405a();
        aVar.f1915a = 7;
        aVar.f1916b = adVar;
        mo1682a(aVar);
        return this;
    }

    /* renamed from: e */
    public CharSequence mo1086e() {
        return this.f1914z != 0 ? this.f1899c.f1262u.mo1049i().getText(this.f1914z) : this.f1895A;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo1690e(int i) {
        if (this.f1907s) {
            if (C0205aj.f1231b) {
                Log.v(f1885a, "Bump nesting in " + this + " by " + i);
            }
            int size = this.f1900l.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0405a aVar = this.f1900l.get(i2);
                if (aVar.f1916b != null) {
                    aVar.f1916b.f1129I += i;
                    if (C0205aj.f1231b) {
                        Log.v(f1885a, "Bump nesting of " + aVar.f1916b + " to " + aVar.f1916b.f1129I);
                    }
                }
            }
        }
    }

    /* renamed from: f */
    public boolean mo1244f() {
        return this.f1908t;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo1691f(int i) {
        int size = this.f1900l.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f1900l.get(i2).f1916b.f1136P == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public C0226aq mo1245g() {
        if (this.f1907s) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f1908t = false;
        return this;
    }

    /* renamed from: h */
    public int mo1246h() {
        return mo1687b(false);
    }

    /* renamed from: i */
    public int mo1247i() {
        return mo1687b(true);
    }

    /* renamed from: j */
    public void mo1248j() {
        mo1245g();
        this.f1899c.mo1125b((C0205aj.C0211c) this, false);
    }

    /* renamed from: k */
    public void mo1249k() {
        mo1245g();
        this.f1899c.mo1125b((C0205aj.C0211c) this, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo1692l() {
        int size = this.f1900l.size();
        for (int i = 0; i < size; i++) {
            C0405a aVar = this.f1900l.get(i);
            C0186ad adVar = aVar.f1916b;
            adVar.mo866b(this.f1905q, this.f1906r);
            switch (aVar.f1915a) {
                case 1:
                    adVar.mo873c(aVar.f1917c);
                    this.f1899c.mo1113a(adVar, false);
                    break;
                case 3:
                    adVar.mo873c(aVar.f1918d);
                    this.f1899c.mo1144h(adVar);
                    break;
                case 4:
                    adVar.mo873c(aVar.f1918d);
                    this.f1899c.mo1147i(adVar);
                    break;
                case 5:
                    adVar.mo873c(aVar.f1917c);
                    this.f1899c.mo1148j(adVar);
                    break;
                case 6:
                    adVar.mo873c(aVar.f1918d);
                    this.f1899c.mo1151k(adVar);
                    break;
                case 7:
                    adVar.mo873c(aVar.f1917c);
                    this.f1899c.mo1153l(adVar);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f1915a);
            }
            if (!this.f1898D && aVar.f1915a != 1) {
                this.f1899c.mo1138e(adVar);
            }
        }
        if (!this.f1898D) {
            this.f1899c.mo1106a(this.f1899c.f1261t, true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean mo1693m() {
        for (int i = 0; i < this.f1900l.size(); i++) {
            if (m2245b(this.f1900l.get(i))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: n */
    public String mo1087n() {
        return this.f1909u;
    }

    /* renamed from: o */
    public int mo1694o() {
        return this.f1905q;
    }

    /* renamed from: p */
    public int mo1695p() {
        return this.f1906r;
    }

    /* renamed from: q */
    public boolean mo1250q() {
        return this.f1900l.isEmpty();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f1911w >= 0) {
            sb.append(" #");
            sb.append(this.f1911w);
        }
        if (this.f1909u != null) {
            sb.append(" ");
            sb.append(this.f1909u);
        }
        sb.append("}");
        return sb.toString();
    }
}
