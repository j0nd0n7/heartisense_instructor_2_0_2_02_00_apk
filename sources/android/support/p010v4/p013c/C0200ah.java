package android.support.p010v4.p013c;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.C0003aa;
import android.support.annotation.C0047z;
import android.support.p010v4.p033o.C0900o;
import android.view.LayoutInflater;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: android.support.v4.c.ah */
public abstract class C0200ah<E> extends C0198af {

    /* renamed from: a */
    private final Activity f1209a;

    /* renamed from: b */
    final Context f1210b;

    /* renamed from: c */
    final int f1211c;

    /* renamed from: d */
    final C0205aj f1212d;

    /* renamed from: e */
    private final Handler f1213e;

    /* renamed from: f */
    private C0900o<String, C0247av> f1214f;

    /* renamed from: g */
    private boolean f1215g;

    /* renamed from: h */
    private C0249aw f1216h;

    /* renamed from: i */
    private boolean f1217i;

    /* renamed from: j */
    private boolean f1218j;

    C0200ah(Activity activity, Context context, Handler handler, int i) {
        this.f1212d = new C0205aj();
        this.f1209a = activity;
        this.f1210b = context;
        this.f1213e = handler;
        this.f1211c = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C0200ah(Context context, Handler handler, int i) {
        this(context instanceof Activity ? (Activity) context : null, context, handler, i);
    }

    C0200ah(C0194ae aeVar) {
        this(aeVar, aeVar, aeVar.f1192j, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0249aw mo1043a(String str, boolean z, boolean z2) {
        if (this.f1214f == null) {
            this.f1214f = new C0900o<>();
        }
        C0249aw awVar = (C0249aw) this.f1214f.get(str);
        if (awVar == null && z2) {
            C0249aw awVar2 = new C0249aw(str, this, z);
            this.f1214f.put(str, awVar2);
            return awVar2;
        } else if (!z || awVar == null || awVar.f1412f) {
            return awVar;
        } else {
            awVar.mo1298b();
            return awVar;
        }
    }

    @C0003aa
    /* renamed from: a */
    public View mo926a(int i) {
        return null;
    }

    /* renamed from: a */
    public void mo989a(C0186ad adVar, Intent intent, int i) {
        mo990a(adVar, intent, i, (Bundle) null);
    }

    /* renamed from: a */
    public void mo990a(C0186ad adVar, Intent intent, int i, @C0003aa Bundle bundle) {
        if (i != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        this.f1210b.startActivity(intent);
    }

    /* renamed from: a */
    public void mo991a(C0186ad adVar, IntentSender intentSender, int i, @C0003aa Intent intent, int i2, int i3, int i4, Bundle bundle) {
        if (i != -1) {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        C0370d.m2113a(this.f1209a, intentSender, i, intent, i2, i3, i4, bundle);
    }

    /* renamed from: a */
    public void mo992a(@C0047z C0186ad adVar, @C0047z String[] strArr, int i) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1044a(C0900o<String, C0247av> oVar) {
        if (oVar != null) {
            int size = oVar.size();
            for (int i = 0; i < size; i++) {
                ((C0249aw) oVar.mo2968c(i)).mo1296a(this);
            }
        }
        this.f1214f = oVar;
    }

    /* renamed from: a */
    public void mo993a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1045a(boolean z) {
        this.f1215g = z;
        if (this.f1216h != null && this.f1218j) {
            this.f1218j = false;
            if (z) {
                this.f1216h.mo1300d();
            } else {
                this.f1216h.mo1299c();
            }
        }
    }

    /* renamed from: a */
    public boolean mo927a() {
        return true;
    }

    /* renamed from: a */
    public boolean mo994a(C0186ad adVar) {
        return true;
    }

    /* renamed from: a */
    public boolean mo995a(@C0047z String str) {
        return false;
    }

    /* renamed from: b */
    public LayoutInflater mo996b() {
        return (LayoutInflater) this.f1210b.getSystemService("layout_inflater");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo997b(C0186ad adVar) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo1046b(String str) {
        C0249aw awVar;
        if (this.f1214f != null && (awVar = (C0249aw) this.f1214f.get(str)) != null && !awVar.f1413g) {
            awVar.mo1304h();
            this.f1214f.remove(str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo1047b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mLoadersStarted=");
        printWriter.println(this.f1218j);
        if (this.f1216h != null) {
            printWriter.print(str);
            printWriter.print("Loader Manager ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this.f1216h)));
            printWriter.println(":");
            this.f1216h.mo1289a(str + "  ", fileDescriptor, printWriter, strArr);
        }
    }

    /* renamed from: d */
    public void mo999d() {
    }

    /* renamed from: e */
    public boolean mo1000e() {
        return true;
    }

    /* renamed from: f */
    public int mo1001f() {
        return this.f1211c;
    }

    @C0003aa
    /* renamed from: g */
    public abstract E mo1002g();

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public Activity mo1048h() {
        return this.f1209a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public Context mo1049i() {
        return this.f1210b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public Handler mo1050j() {
        return this.f1213e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public C0205aj mo1051k() {
        return this.f1212d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public C0249aw mo1052l() {
        if (this.f1216h != null) {
            return this.f1216h;
        }
        this.f1217i = true;
        this.f1216h = mo1043a("(root)", this.f1218j, true);
        return this.f1216h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean mo1053m() {
        return this.f1215g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo1054n() {
        if (!this.f1218j) {
            this.f1218j = true;
            if (this.f1216h != null) {
                this.f1216h.mo1298b();
            } else if (!this.f1217i) {
                this.f1216h = mo1043a("(root)", this.f1218j, false);
                if (this.f1216h != null && !this.f1216h.f1412f) {
                    this.f1216h.mo1298b();
                }
            }
            this.f1217i = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo1055o() {
        if (this.f1216h != null) {
            this.f1216h.mo1300d();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo1056p() {
        if (this.f1216h != null) {
            this.f1216h.mo1304h();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo1057q() {
        if (this.f1214f != null) {
            int size = this.f1214f.size();
            C0249aw[] awVarArr = new C0249aw[size];
            for (int i = size - 1; i >= 0; i--) {
                awVarArr[i] = (C0249aw) this.f1214f.mo2968c(i);
            }
            for (int i2 = 0; i2 < size; i2++) {
                C0249aw awVar = awVarArr[i2];
                awVar.mo1301e();
                awVar.mo1303g();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public C0900o<String, C0247av> mo1058r() {
        boolean z;
        if (this.f1214f != null) {
            int size = this.f1214f.size();
            C0249aw[] awVarArr = new C0249aw[size];
            for (int i = size - 1; i >= 0; i--) {
                awVarArr[i] = (C0249aw) this.f1214f.mo2968c(i);
            }
            boolean m = mo1053m();
            z = false;
            for (int i2 = 0; i2 < size; i2++) {
                C0249aw awVar = awVarArr[i2];
                if (!awVar.f1413g && m) {
                    if (!awVar.f1412f) {
                        awVar.mo1298b();
                    }
                    awVar.mo1300d();
                }
                if (awVar.f1413g) {
                    z = true;
                } else {
                    awVar.mo1304h();
                    this.f1214f.remove(awVar.f1411e);
                }
            }
        } else {
            z = false;
        }
        if (z) {
            return this.f1214f;
        }
        return null;
    }
}
