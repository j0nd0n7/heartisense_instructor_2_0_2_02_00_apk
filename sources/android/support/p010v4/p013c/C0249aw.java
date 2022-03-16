package android.support.p010v4.p013c;

import android.os.Bundle;
import android.support.p010v4.p013c.C0247av;
import android.support.p010v4.p014d.C0453q;
import android.support.p010v4.p033o.C0884g;
import android.support.p010v4.p033o.C0901p;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

/* renamed from: android.support.v4.c.aw */
class C0249aw extends C0247av {

    /* renamed from: a */
    static final String f1407a = "LoaderManager";

    /* renamed from: b */
    static boolean f1408b = false;

    /* renamed from: c */
    final C0901p<C0250a> f1409c = new C0901p<>();

    /* renamed from: d */
    final C0901p<C0250a> f1410d = new C0901p<>();

    /* renamed from: e */
    final String f1411e;

    /* renamed from: f */
    boolean f1412f;

    /* renamed from: g */
    boolean f1413g;

    /* renamed from: h */
    boolean f1414h;

    /* renamed from: i */
    boolean f1415i;

    /* renamed from: j */
    C0200ah f1416j;

    /* renamed from: android.support.v4.c.aw$a */
    final class C0250a implements C0453q.C0455b<Object>, C0453q.C0456c<Object> {

        /* renamed from: a */
        final int f1417a;

        /* renamed from: b */
        final Bundle f1418b;

        /* renamed from: c */
        C0247av.C0248a<Object> f1419c;

        /* renamed from: d */
        C0453q<Object> f1420d;

        /* renamed from: e */
        boolean f1421e;

        /* renamed from: f */
        boolean f1422f;

        /* renamed from: g */
        Object f1423g;

        /* renamed from: h */
        boolean f1424h;

        /* renamed from: i */
        boolean f1425i;

        /* renamed from: j */
        boolean f1426j;

        /* renamed from: k */
        boolean f1427k;

        /* renamed from: l */
        boolean f1428l;

        /* renamed from: m */
        boolean f1429m;

        /* renamed from: n */
        C0250a f1430n;

        public C0250a(int i, Bundle bundle, C0247av.C0248a<Object> aVar) {
            this.f1417a = i;
            this.f1418b = bundle;
            this.f1419c = aVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo1306a() {
            if (this.f1425i && this.f1426j) {
                this.f1424h = true;
            } else if (!this.f1424h) {
                this.f1424h = true;
                if (C0249aw.f1408b) {
                    Log.v(C0249aw.f1407a, "  Starting: " + this);
                }
                if (this.f1420d == null && this.f1419c != null) {
                    this.f1420d = this.f1419c.mo1293a(this.f1417a, this.f1418b);
                }
                if (this.f1420d == null) {
                    return;
                }
                if (!this.f1420d.getClass().isMemberClass() || Modifier.isStatic(this.f1420d.getClass().getModifiers())) {
                    if (!this.f1429m) {
                        this.f1420d.mo1767a(this.f1417a, this);
                        this.f1420d.mo1768a(this);
                        this.f1429m = true;
                    }
                    this.f1420d.mo1779x();
                    return;
                }
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + this.f1420d);
            }
        }

        /* renamed from: a */
        public void mo1307a(C0453q<Object> qVar) {
            if (C0249aw.f1408b) {
                Log.v(C0249aw.f1407a, "onLoadCanceled: " + this);
            }
            if (this.f1428l) {
                if (C0249aw.f1408b) {
                    Log.v(C0249aw.f1407a, "  Ignoring load canceled -- destroyed");
                }
            } else if (C0249aw.this.f1409c.mo2983a(this.f1417a) == this) {
                C0250a aVar = this.f1430n;
                if (aVar != null) {
                    if (C0249aw.f1408b) {
                        Log.v(C0249aw.f1407a, "  Switching to pending loader: " + aVar);
                    }
                    this.f1430n = null;
                    C0249aw.this.f1409c.mo2988b(this.f1417a, null);
                    mo1316g();
                    C0249aw.this.mo1297a(aVar);
                }
            } else if (C0249aw.f1408b) {
                Log.v(C0249aw.f1407a, "  Ignoring load canceled -- not active");
            }
        }

        /* renamed from: a */
        public void mo1308a(C0453q<Object> qVar, Object obj) {
            if (C0249aw.f1408b) {
                Log.v(C0249aw.f1407a, "onLoadComplete: " + this);
            }
            if (this.f1428l) {
                if (C0249aw.f1408b) {
                    Log.v(C0249aw.f1407a, "  Ignoring load complete -- destroyed");
                }
            } else if (C0249aw.this.f1409c.mo2983a(this.f1417a) == this) {
                C0250a aVar = this.f1430n;
                if (aVar != null) {
                    if (C0249aw.f1408b) {
                        Log.v(C0249aw.f1407a, "  Switching to pending loader: " + aVar);
                    }
                    this.f1430n = null;
                    C0249aw.this.f1409c.mo2988b(this.f1417a, null);
                    mo1316g();
                    C0249aw.this.mo1297a(aVar);
                    return;
                }
                if (this.f1423g != obj || !this.f1421e) {
                    this.f1423g = obj;
                    this.f1421e = true;
                    if (this.f1424h) {
                        mo1311b(qVar, obj);
                    }
                }
                C0250a a = C0249aw.this.f1410d.mo2983a(this.f1417a);
                if (!(a == null || a == this)) {
                    a.f1422f = false;
                    a.mo1316g();
                    C0249aw.this.f1410d.mo2990c(this.f1417a);
                }
                if (C0249aw.this.f1416j != null && !C0249aw.this.mo1290a()) {
                    C0249aw.this.f1416j.f1212d.mo1146i();
                }
            } else if (C0249aw.f1408b) {
                Log.v(C0249aw.f1407a, "  Ignoring load complete -- not active");
            }
        }

        /* renamed from: a */
        public void mo1309a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f1417a);
            printWriter.print(" mArgs=");
            printWriter.println(this.f1418b);
            printWriter.print(str);
            printWriter.print("mCallbacks=");
            printWriter.println(this.f1419c);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f1420d);
            if (this.f1420d != null) {
                this.f1420d.mo1708a(str + "  ", fileDescriptor, printWriter, strArr);
            }
            if (this.f1421e || this.f1422f) {
                printWriter.print(str);
                printWriter.print("mHaveData=");
                printWriter.print(this.f1421e);
                printWriter.print("  mDeliveredData=");
                printWriter.println(this.f1422f);
                printWriter.print(str);
                printWriter.print("mData=");
                printWriter.println(this.f1423g);
            }
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f1424h);
            printWriter.print(" mReportNextStart=");
            printWriter.print(this.f1427k);
            printWriter.print(" mDestroyed=");
            printWriter.println(this.f1428l);
            printWriter.print(str);
            printWriter.print("mRetaining=");
            printWriter.print(this.f1425i);
            printWriter.print(" mRetainingStarted=");
            printWriter.print(this.f1426j);
            printWriter.print(" mListenerRegistered=");
            printWriter.println(this.f1429m);
            if (this.f1430n != null) {
                printWriter.print(str);
                printWriter.println("Pending Loader ");
                printWriter.print(this.f1430n);
                printWriter.println(":");
                this.f1430n.mo1309a(str + "  ", fileDescriptor, printWriter, strArr);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo1310b() {
            if (C0249aw.f1408b) {
                Log.v(C0249aw.f1407a, "  Retaining: " + this);
            }
            this.f1425i = true;
            this.f1426j = this.f1424h;
            this.f1424h = false;
            this.f1419c = null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo1311b(C0453q<Object> qVar, Object obj) {
            String str;
            if (this.f1419c != null) {
                if (C0249aw.this.f1416j != null) {
                    String str2 = C0249aw.this.f1416j.f1212d.f1240B;
                    C0249aw.this.f1416j.f1212d.f1240B = "onLoadFinished";
                    str = str2;
                } else {
                    str = null;
                }
                try {
                    if (C0249aw.f1408b) {
                        Log.v(C0249aw.f1407a, "  onLoadFinished in " + qVar + ": " + qVar.mo1771c(obj));
                    }
                    this.f1419c.mo1295a(qVar, obj);
                    this.f1422f = true;
                } finally {
                    if (C0249aw.this.f1416j != null) {
                        C0249aw.this.f1416j.f1212d.f1240B = str;
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo1312c() {
            if (this.f1425i) {
                if (C0249aw.f1408b) {
                    Log.v(C0249aw.f1407a, "  Finished Retaining: " + this);
                }
                this.f1425i = false;
                if (this.f1424h != this.f1426j && !this.f1424h) {
                    mo1314e();
                }
            }
            if (this.f1424h && this.f1421e && !this.f1427k) {
                mo1311b(this.f1420d, this.f1423g);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo1313d() {
            if (this.f1424h && this.f1427k) {
                this.f1427k = false;
                if (this.f1421e && !this.f1425i) {
                    mo1311b(this.f1420d, this.f1423g);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo1314e() {
            if (C0249aw.f1408b) {
                Log.v(C0249aw.f1407a, "  Stopping: " + this);
            }
            this.f1424h = false;
            if (!this.f1425i && this.f1420d != null && this.f1429m) {
                this.f1429m = false;
                this.f1420d.mo1769a(this);
                this.f1420d.mo1770b(this);
                this.f1420d.mo1759A();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public boolean mo1315f() {
            if (C0249aw.f1408b) {
                Log.v(C0249aw.f1407a, "  Canceling: " + this);
            }
            if (!this.f1424h || this.f1420d == null || !this.f1429m) {
                return false;
            }
            boolean y = this.f1420d.mo1780y();
            if (y) {
                return y;
            }
            mo1307a(this.f1420d);
            return y;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo1316g() {
            String str;
            if (C0249aw.f1408b) {
                Log.v(C0249aw.f1407a, "  Destroying: " + this);
            }
            this.f1428l = true;
            boolean z = this.f1422f;
            this.f1422f = false;
            if (this.f1419c != null && this.f1420d != null && this.f1421e && z) {
                if (C0249aw.f1408b) {
                    Log.v(C0249aw.f1407a, "  Resetting: " + this);
                }
                if (C0249aw.this.f1416j != null) {
                    String str2 = C0249aw.this.f1416j.f1212d.f1240B;
                    C0249aw.this.f1416j.f1212d.f1240B = "onLoaderReset";
                    str = str2;
                } else {
                    str = null;
                }
                try {
                    this.f1419c.mo1294a(this.f1420d);
                } finally {
                    if (C0249aw.this.f1416j != null) {
                        C0249aw.this.f1416j.f1212d.f1240B = str;
                    }
                }
            }
            this.f1419c = null;
            this.f1423g = null;
            this.f1421e = false;
            if (this.f1420d != null) {
                if (this.f1429m) {
                    this.f1429m = false;
                    this.f1420d.mo1769a(this);
                    this.f1420d.mo1770b(this);
                }
                this.f1420d.mo1762D();
            }
            if (this.f1430n != null) {
                this.f1430n.mo1316g();
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f1417a);
            sb.append(" : ");
            C0884g.m4428a(this.f1420d, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    C0249aw(String str, C0200ah ahVar, boolean z) {
        this.f1411e = str;
        this.f1416j = ahVar;
        this.f1412f = z;
    }

    /* renamed from: c */
    private C0250a m1516c(int i, Bundle bundle, C0247av.C0248a<Object> aVar) {
        C0250a aVar2 = new C0250a(i, bundle, aVar);
        aVar2.f1420d = aVar.mo1293a(i, bundle);
        return aVar2;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: d */
    private C0250a m1517d(int i, Bundle bundle, C0247av.C0248a<Object> aVar) {
        try {
            this.f1415i = true;
            C0250a c = m1516c(i, bundle, aVar);
            mo1297a(c);
            this.f1415i = false;
            return c;
        } catch (Throwable th) {
            this.f1415i = false;
            throw th;
        }
    }

    /* renamed from: a */
    public <D> C0453q<D> mo1287a(int i, Bundle bundle, C0247av.C0248a<D> aVar) {
        if (this.f1415i) {
            throw new IllegalStateException("Called while creating a loader");
        }
        C0250a a = this.f1409c.mo2983a(i);
        if (f1408b) {
            Log.v(f1407a, "initLoader in " + this + ": args=" + bundle);
        }
        if (a == null) {
            a = m1517d(i, bundle, aVar);
            if (f1408b) {
                Log.v(f1407a, "  Created new loader " + a);
            }
        } else {
            if (f1408b) {
                Log.v(f1407a, "  Re-using existing loader " + a);
            }
            a.f1419c = aVar;
        }
        if (a.f1421e && this.f1412f) {
            a.mo1311b(a.f1420d, a.f1423g);
        }
        return a.f1420d;
    }

    /* renamed from: a */
    public void mo1288a(int i) {
        if (this.f1415i) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (f1408b) {
            Log.v(f1407a, "destroyLoader in " + this + " of " + i);
        }
        int g = this.f1409c.mo2997g(i);
        if (g >= 0) {
            this.f1409c.mo2993d(g);
            this.f1409c.mo2996f(g).mo1316g();
        }
        int g2 = this.f1410d.mo2997g(i);
        if (g2 >= 0) {
            this.f1410d.mo2993d(g2);
            this.f1410d.mo2996f(g2).mo1316g();
        }
        if (this.f1416j != null && !mo1290a()) {
            this.f1416j.f1212d.mo1146i();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1296a(C0200ah ahVar) {
        this.f1416j = ahVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1297a(C0250a aVar) {
        this.f1409c.mo2988b(aVar.f1417a, aVar);
        if (this.f1412f) {
            aVar.mo1306a();
        }
    }

    /* renamed from: a */
    public void mo1289a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        if (this.f1409c.mo2986b() > 0) {
            printWriter.print(str);
            printWriter.println("Active Loaders:");
            String str2 = str + "    ";
            for (int i = 0; i < this.f1409c.mo2986b(); i++) {
                C0250a f = this.f1409c.mo2996f(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(this.f1409c.mo2995e(i));
                printWriter.print(": ");
                printWriter.println(f.toString());
                f.mo1309a(str2, fileDescriptor, printWriter, strArr);
            }
        }
        if (this.f1410d.mo2986b() > 0) {
            printWriter.print(str);
            printWriter.println("Inactive Loaders:");
            String str3 = str + "    ";
            for (int i2 = 0; i2 < this.f1410d.mo2986b(); i2++) {
                C0250a f2 = this.f1410d.mo2996f(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(this.f1410d.mo2995e(i2));
                printWriter.print(": ");
                printWriter.println(f2.toString());
                f2.mo1309a(str3, fileDescriptor, printWriter, strArr);
            }
        }
    }

    /* renamed from: a */
    public boolean mo1290a() {
        int b = this.f1409c.mo2986b();
        boolean z = false;
        for (int i = 0; i < b; i++) {
            C0250a f = this.f1409c.mo2996f(i);
            z |= f.f1424h && !f.f1422f;
        }
        return z;
    }

    /* renamed from: b */
    public <D> C0453q<D> mo1291b(int i) {
        if (this.f1415i) {
            throw new IllegalStateException("Called while creating a loader");
        }
        C0250a a = this.f1409c.mo2983a(i);
        if (a != null) {
            return a.f1430n != null ? a.f1430n.f1420d : a.f1420d;
        }
        return null;
    }

    /* renamed from: b */
    public <D> C0453q<D> mo1292b(int i, Bundle bundle, C0247av.C0248a<D> aVar) {
        if (this.f1415i) {
            throw new IllegalStateException("Called while creating a loader");
        }
        C0250a a = this.f1409c.mo2983a(i);
        if (f1408b) {
            Log.v(f1407a, "restartLoader in " + this + ": args=" + bundle);
        }
        if (a != null) {
            C0250a a2 = this.f1410d.mo2983a(i);
            if (a2 == null) {
                if (f1408b) {
                    Log.v(f1407a, "  Making last loader inactive: " + a);
                }
                a.f1420d.mo1760B();
                this.f1410d.mo2988b(i, a);
            } else if (a.f1421e) {
                if (f1408b) {
                    Log.v(f1407a, "  Removing last inactive loader: " + a);
                }
                a2.f1422f = false;
                a2.mo1316g();
                a.f1420d.mo1760B();
                this.f1410d.mo2988b(i, a);
            } else if (!a.mo1315f()) {
                if (f1408b) {
                    Log.v(f1407a, "  Current loader is stopped; replacing");
                }
                this.f1409c.mo2988b(i, null);
                a.mo1316g();
            } else {
                if (f1408b) {
                    Log.v(f1407a, "  Current loader is running; configuring pending loader");
                }
                if (a.f1430n != null) {
                    if (f1408b) {
                        Log.v(f1407a, "  Removing pending loader: " + a.f1430n);
                    }
                    a.f1430n.mo1316g();
                    a.f1430n = null;
                }
                if (f1408b) {
                    Log.v(f1407a, "  Enqueuing as new pending loader");
                }
                a.f1430n = m1516c(i, bundle, aVar);
                return a.f1430n.f1420d;
            }
        }
        return m1517d(i, bundle, aVar).f1420d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo1298b() {
        if (f1408b) {
            Log.v(f1407a, "Starting in " + this);
        }
        if (this.f1412f) {
            RuntimeException runtimeException = new RuntimeException("here");
            runtimeException.fillInStackTrace();
            Log.w(f1407a, "Called doStart when already started: " + this, runtimeException);
            return;
        }
        this.f1412f = true;
        for (int b = this.f1409c.mo2986b() - 1; b >= 0; b--) {
            this.f1409c.mo2996f(b).mo1306a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo1299c() {
        if (f1408b) {
            Log.v(f1407a, "Stopping in " + this);
        }
        if (!this.f1412f) {
            RuntimeException runtimeException = new RuntimeException("here");
            runtimeException.fillInStackTrace();
            Log.w(f1407a, "Called doStop when not started: " + this, runtimeException);
            return;
        }
        for (int b = this.f1409c.mo2986b() - 1; b >= 0; b--) {
            this.f1409c.mo2996f(b).mo1314e();
        }
        this.f1412f = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo1300d() {
        if (f1408b) {
            Log.v(f1407a, "Retaining in " + this);
        }
        if (!this.f1412f) {
            RuntimeException runtimeException = new RuntimeException("here");
            runtimeException.fillInStackTrace();
            Log.w(f1407a, "Called doRetain when not started: " + this, runtimeException);
            return;
        }
        this.f1413g = true;
        this.f1412f = false;
        for (int b = this.f1409c.mo2986b() - 1; b >= 0; b--) {
            this.f1409c.mo2996f(b).mo1310b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo1301e() {
        if (this.f1413g) {
            if (f1408b) {
                Log.v(f1407a, "Finished Retaining in " + this);
            }
            this.f1413g = false;
            for (int b = this.f1409c.mo2986b() - 1; b >= 0; b--) {
                this.f1409c.mo2996f(b).mo1312c();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo1302f() {
        for (int b = this.f1409c.mo2986b() - 1; b >= 0; b--) {
            this.f1409c.mo2996f(b).f1427k = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo1303g() {
        for (int b = this.f1409c.mo2986b() - 1; b >= 0; b--) {
            this.f1409c.mo2996f(b).mo1313d();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo1304h() {
        if (!this.f1413g) {
            if (f1408b) {
                Log.v(f1407a, "Destroying Active in " + this);
            }
            for (int b = this.f1409c.mo2986b() - 1; b >= 0; b--) {
                this.f1409c.mo2996f(b).mo1316g();
            }
            this.f1409c.mo2989c();
        }
        if (f1408b) {
            Log.v(f1407a, "Destroying Inactive in " + this);
        }
        for (int b2 = this.f1410d.mo2986b() - 1; b2 >= 0; b2--) {
            this.f1410d.mo2996f(b2).mo1316g();
        }
        this.f1410d.mo2989c();
        this.f1416j = null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        C0884g.m4428a(this.f1416j, sb);
        sb.append("}}");
        return sb.toString();
    }
}
