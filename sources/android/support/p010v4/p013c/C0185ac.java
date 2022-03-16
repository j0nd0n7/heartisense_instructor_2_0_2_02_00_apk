package android.support.p010v4.p013c;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.C0003aa;
import android.support.annotation.C0011ag;
import android.support.annotation.C0016ak;
import android.support.annotation.C0047z;
import android.view.LayoutInflater;
import android.view.View;

/* renamed from: android.support.v4.c.ac */
public class C0185ac extends C0186ad implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: a */
    public static final int f1094a = 0;

    /* renamed from: ak */
    private static final String f1095ak = "android:savedDialogState";

    /* renamed from: al */
    private static final String f1096al = "android:style";

    /* renamed from: am */
    private static final String f1097am = "android:theme";

    /* renamed from: an */
    private static final String f1098an = "android:cancelable";

    /* renamed from: ao */
    private static final String f1099ao = "android:showsDialog";

    /* renamed from: ap */
    private static final String f1100ap = "android:backStackId";

    /* renamed from: b */
    public static final int f1101b = 1;

    /* renamed from: c */
    public static final int f1102c = 2;

    /* renamed from: d */
    public static final int f1103d = 3;

    /* renamed from: e */
    int f1104e = 0;

    /* renamed from: f */
    int f1105f = 0;

    /* renamed from: g */
    boolean f1106g = true;

    /* renamed from: h */
    boolean f1107h = true;

    /* renamed from: i */
    int f1108i = -1;

    /* renamed from: j */
    Dialog f1109j;

    /* renamed from: k */
    boolean f1110k;

    /* renamed from: l */
    boolean f1111l;

    /* renamed from: m */
    boolean f1112m;

    /* renamed from: a */
    public int mo763a(C0226aq aqVar, String str) {
        this.f1111l = false;
        this.f1112m = true;
        aqVar.mo1229a((C0186ad) this, str);
        this.f1110k = false;
        this.f1108i = aqVar.mo1246h();
        return this.f1108i;
    }

    /* renamed from: a */
    public void mo764a() {
        mo770a(false);
    }

    /* renamed from: a */
    public void mo765a(int i, @C0016ak int i2) {
        this.f1104e = i;
        if (this.f1104e == 2 || this.f1104e == 3) {
            this.f1105f = 16973913;
        }
        if (i2 != 0) {
            this.f1105f = i2;
        }
    }

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    /* renamed from: a */
    public void mo766a(Dialog dialog, int i) {
        switch (i) {
            case 1:
            case 2:
                break;
            case 3:
                dialog.getWindow().addFlags(24);
                break;
            default:
                return;
        }
        dialog.requestWindowFeature(1);
    }

    /* renamed from: a */
    public void mo767a(Context context) {
        super.mo767a(context);
        if (!this.f1112m) {
            this.f1111l = false;
        }
    }

    /* renamed from: a */
    public void mo768a(@C0003aa Bundle bundle) {
        super.mo768a(bundle);
        this.f1107h = this.f1136P == 0;
        if (bundle != null) {
            this.f1104e = bundle.getInt(f1096al, 0);
            this.f1105f = bundle.getInt(f1097am, 0);
            this.f1106g = bundle.getBoolean(f1098an, true);
            this.f1107h = bundle.getBoolean(f1099ao, this.f1107h);
            this.f1108i = bundle.getInt(f1100ap, -1);
        }
    }

    /* renamed from: a */
    public void mo769a(C0201ai aiVar, String str) {
        this.f1111l = false;
        this.f1112m = true;
        C0226aq a = aiVar.mo1063a();
        a.mo1229a((C0186ad) this, str);
        a.mo1246h();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo770a(boolean z) {
        if (!this.f1111l) {
            this.f1111l = true;
            this.f1112m = false;
            if (this.f1109j != null) {
                this.f1109j.dismiss();
                this.f1109j = null;
            }
            this.f1110k = true;
            if (this.f1108i >= 0) {
                mo919u().mo1064a(this.f1108i, 1);
                this.f1108i = -1;
                return;
            }
            C0226aq a = mo919u().mo1063a();
            a.mo1228a((C0186ad) this);
            if (z) {
                a.mo1247i();
            } else {
                a.mo1246h();
            }
        }
    }

    @C0011ag(mo9a = {C0011ag.C0012a.LIBRARY_GROUP})
    /* renamed from: b */
    public LayoutInflater mo771b(Bundle bundle) {
        if (!this.f1107h) {
            return super.mo771b(bundle);
        }
        this.f1109j = mo775c(bundle);
        if (this.f1109j == null) {
            return (LayoutInflater) this.f1131K.mo1049i().getSystemService("layout_inflater");
        }
        mo766a(this.f1109j, this.f1104e);
        return (LayoutInflater) this.f1109j.getContext().getSystemService("layout_inflater");
    }

    /* renamed from: b */
    public void mo772b() {
        mo770a(true);
    }

    /* renamed from: b */
    public void mo773b(boolean z) {
        this.f1106g = z;
        if (this.f1109j != null) {
            this.f1109j.setCancelable(z);
        }
    }

    /* renamed from: c */
    public Dialog mo774c() {
        return this.f1109j;
    }

    @C0047z
    /* renamed from: c */
    public Dialog mo775c(Bundle bundle) {
        return new Dialog(mo915r(), mo777d());
    }

    /* renamed from: c */
    public void mo776c(boolean z) {
        this.f1107h = z;
    }

    @C0016ak
    /* renamed from: d */
    public int mo777d() {
        return this.f1105f;
    }

    /* renamed from: d */
    public void mo778d(Bundle bundle) {
        Bundle bundle2;
        super.mo778d(bundle);
        if (this.f1107h) {
            View K = mo798K();
            if (K != null) {
                if (K.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
                this.f1109j.setContentView(K);
            }
            C0194ae r = mo915r();
            if (r != null) {
                this.f1109j.setOwnerActivity(r);
            }
            this.f1109j.setCancelable(this.f1106g);
            this.f1109j.setOnCancelListener(this);
            this.f1109j.setOnDismissListener(this);
            if (bundle != null && (bundle2 = bundle.getBundle(f1095ak)) != null) {
                this.f1109j.onRestoreInstanceState(bundle2);
            }
        }
    }

    /* renamed from: e */
    public void mo779e(Bundle bundle) {
        Bundle onSaveInstanceState;
        super.mo779e(bundle);
        if (!(this.f1109j == null || (onSaveInstanceState = this.f1109j.onSaveInstanceState()) == null)) {
            bundle.putBundle(f1095ak, onSaveInstanceState);
        }
        if (this.f1104e != 0) {
            bundle.putInt(f1096al, this.f1104e);
        }
        if (this.f1105f != 0) {
            bundle.putInt(f1097am, this.f1105f);
        }
        if (!this.f1106g) {
            bundle.putBoolean(f1098an, this.f1106g);
        }
        if (!this.f1107h) {
            bundle.putBoolean(f1099ao, this.f1107h);
        }
        if (this.f1108i != -1) {
            bundle.putInt(f1100ap, this.f1108i);
        }
    }

    /* renamed from: e */
    public boolean mo780e() {
        return this.f1106g;
    }

    /* renamed from: f */
    public boolean mo781f() {
        return this.f1107h;
    }

    /* renamed from: g */
    public void mo782g() {
        super.mo782g();
        if (!this.f1112m && !this.f1111l) {
            this.f1111l = true;
        }
    }

    /* renamed from: h */
    public void mo783h() {
        super.mo783h();
        if (this.f1109j != null) {
            this.f1110k = false;
            this.f1109j.show();
        }
    }

    /* renamed from: i */
    public void mo784i() {
        super.mo784i();
        if (this.f1109j != null) {
            this.f1109j.hide();
        }
    }

    /* renamed from: j */
    public void mo785j() {
        super.mo785j();
        if (this.f1109j != null) {
            this.f1110k = true;
            this.f1109j.dismiss();
            this.f1109j = null;
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.f1110k) {
            mo770a(true);
        }
    }
}
