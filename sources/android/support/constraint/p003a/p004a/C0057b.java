package android.support.constraint.p003a.p004a;

import android.support.constraint.p003a.C0090e;
import android.support.constraint.p003a.C0096h;
import android.support.constraint.p003a.p004a.C0070h;
import java.util.ArrayList;

/* renamed from: android.support.constraint.a.a.b */
public class C0057b extends C0078l {

    /* renamed from: a */
    public static final int f216a = 0;

    /* renamed from: b */
    public static final int f217b = 1;

    /* renamed from: c */
    public static final int f218c = 2;

    /* renamed from: d */
    public static final int f219d = 3;

    /* renamed from: aT */
    private int f220aT = 0;

    /* renamed from: aU */
    private ArrayList<C0081o> f221aU = new ArrayList<>(4);

    /* renamed from: aV */
    private boolean f222aV = true;

    /* renamed from: a */
    public void mo86a(int i) {
        this.f220aT = i;
    }

    /* renamed from: a */
    public void mo87a(C0090e eVar) {
        boolean z;
        this.f352Z[0] = this.f344M;
        this.f352Z[2] = this.f345N;
        this.f352Z[1] = this.f346O;
        this.f352Z[3] = this.f347P;
        for (int i = 0; i < this.f352Z.length; i++) {
            this.f352Z[i].f251i = eVar.mo406a((Object) this.f352Z[i]);
        }
        if (this.f220aT >= 0 && this.f220aT < 4) {
            C0060e eVar2 = this.f352Z[this.f220aT];
            int i2 = 0;
            while (true) {
                if (i2 >= this.f483aS) {
                    z = false;
                    break;
                }
                C0070h hVar = this.f482aR[i2];
                if (this.f222aV || hVar.mo89a()) {
                    if ((this.f220aT != 0 && this.f220aT != 1) || hVar.mo229av() != C0070h.C0073b.MATCH_CONSTRAINT) {
                        if ((this.f220aT == 2 || this.f220aT == 3) && hVar.mo230aw() == C0070h.C0073b.MATCH_CONSTRAINT) {
                            z = true;
                            break;
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
                i2++;
            }
            if (this.f220aT == 0 || this.f220aT == 1) {
                if (mo157B().mo229av() == C0070h.C0073b.WRAP_CONTENT) {
                    z = false;
                }
            } else if (mo157B().mo230aw() == C0070h.C0073b.WRAP_CONTENT) {
                z = false;
            }
            for (int i3 = 0; i3 < this.f483aS; i3++) {
                C0070h hVar2 = this.f482aR[i3];
                if (this.f222aV || hVar2.mo89a()) {
                    C0096h a = eVar.mo406a((Object) hVar2.f352Z[this.f220aT]);
                    hVar2.f352Z[this.f220aT].f251i = a;
                    if (this.f220aT == 0 || this.f220aT == 2) {
                        eVar.mo423b(eVar2.f251i, a, z);
                    } else {
                        eVar.mo418a(eVar2.f251i, a, z);
                    }
                }
            }
            if (this.f220aT == 0) {
                eVar.mo425c(this.f346O.f251i, this.f344M.f251i, 0, 6);
                if (!z) {
                    eVar.mo425c(this.f344M.f251i, this.f381ae.f346O.f251i, 0, 5);
                }
            } else if (this.f220aT == 1) {
                eVar.mo425c(this.f344M.f251i, this.f346O.f251i, 0, 6);
                if (!z) {
                    eVar.mo425c(this.f344M.f251i, this.f381ae.f344M.f251i, 0, 5);
                }
            } else if (this.f220aT == 2) {
                eVar.mo425c(this.f347P.f251i, this.f345N.f251i, 0, 6);
                if (!z) {
                    eVar.mo425c(this.f345N.f251i, this.f381ae.f347P.f251i, 0, 5);
                }
            } else if (this.f220aT == 3) {
                eVar.mo425c(this.f345N.f251i, this.f347P.f251i, 0, 6);
                if (!z) {
                    eVar.mo425c(this.f345N.f251i, this.f381ae.f345N.f251i, 0, 5);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo88a(boolean z) {
        this.f222aV = z;
    }

    /* renamed from: a */
    public boolean mo89a() {
        return true;
    }

    /* renamed from: b */
    public void mo90b(int i) {
        C0081o a;
        C0081o a2;
        if (this.f381ae != null && ((C0074i) this.f381ae).mo291F(2)) {
            switch (this.f220aT) {
                case 0:
                    a = this.f344M.mo103a();
                    break;
                case 1:
                    a = this.f346O.mo103a();
                    break;
                case 2:
                    a = this.f345N.mo103a();
                    break;
                case 3:
                    a = this.f347P.mo103a();
                    break;
                default:
                    return;
            }
            a.mo348b(5);
            if (this.f220aT == 0 || this.f220aT == 1) {
                this.f345N.mo103a().mo342a((C0081o) null, 0.0f);
                this.f347P.mo103a().mo342a((C0081o) null, 0.0f);
            } else {
                this.f344M.mo103a().mo342a((C0081o) null, 0.0f);
                this.f346O.mo103a().mo342a((C0081o) null, 0.0f);
            }
            this.f221aU.clear();
            for (int i2 = 0; i2 < this.f483aS; i2++) {
                C0070h hVar = this.f482aR[i2];
                if (this.f222aV || hVar.mo89a()) {
                    switch (this.f220aT) {
                        case 0:
                            a2 = hVar.f344M.mo103a();
                            break;
                        case 1:
                            a2 = hVar.f346O.mo103a();
                            break;
                        case 2:
                            a2 = hVar.f345N.mo103a();
                            break;
                        case 3:
                            a2 = hVar.f347P.mo103a();
                            break;
                        default:
                            a2 = null;
                            break;
                    }
                    if (a2 != null) {
                        this.f221aU.add(a2);
                        a2.mo356a((C0083q) a);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public boolean mo91b() {
        return this.f222aV;
    }

    /* renamed from: c */
    public void mo92c() {
        super.mo92c();
        this.f221aU.clear();
    }

    /* renamed from: d */
    public void mo93d() {
        C0081o a;
        C0081o oVar;
        float f;
        float f2 = Float.MAX_VALUE;
        switch (this.f220aT) {
            case 0:
                a = this.f344M.mo103a();
                break;
            case 1:
                a = this.f346O.mo103a();
                f2 = 0.0f;
                break;
            case 2:
                a = this.f345N.mo103a();
                break;
            case 3:
                a = this.f347P.mo103a();
                f2 = 0.0f;
                break;
            default:
                return;
        }
        int size = this.f221aU.size();
        int i = 0;
        C0081o oVar2 = null;
        float f3 = f2;
        while (i < size) {
            C0081o oVar3 = this.f221aU.get(i);
            if (oVar3.f524r == 1) {
                if (this.f220aT == 0 || this.f220aT == 2) {
                    if (oVar3.f511f < f3) {
                        f = oVar3.f511f;
                        oVar = oVar3.f510e;
                    }
                    oVar = oVar2;
                    f = f3;
                } else {
                    if (oVar3.f511f > f3) {
                        f = oVar3.f511f;
                        oVar = oVar3.f510e;
                    }
                    oVar = oVar2;
                    f = f3;
                }
                i++;
                f3 = f;
                oVar2 = oVar;
            } else {
                return;
            }
        }
        if (C0090e.m454a() != null) {
            C0090e.m454a().f595z++;
        }
        a.f510e = oVar2;
        a.f511f = f3;
        a.mo359g();
        switch (this.f220aT) {
            case 0:
                this.f346O.mo103a().mo342a(oVar2, f3);
                return;
            case 1:
                this.f344M.mo103a().mo342a(oVar2, f3);
                return;
            case 2:
                this.f347P.mo103a().mo342a(oVar2, f3);
                return;
            case 3:
                this.f345N.mo103a().mo342a(oVar2, f3);
                return;
            default:
                return;
        }
    }
}
