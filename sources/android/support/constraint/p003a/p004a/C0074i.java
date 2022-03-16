package android.support.constraint.p003a.p004a;

import android.support.constraint.p003a.C0090e;
import android.support.constraint.p003a.C0092f;
import android.support.constraint.p003a.p004a.C0060e;
import android.support.constraint.p003a.p004a.C0070h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: android.support.constraint.a.a.i */
public class C0074i extends C0086s {

    /* renamed from: a */
    private static final boolean f428a = true;

    /* renamed from: b */
    private static final int f429b = 8;

    /* renamed from: bj */
    private static final boolean f430bj = false;

    /* renamed from: c */
    private static final boolean f431c = false;

    /* renamed from: d */
    static final boolean f432d = false;

    /* renamed from: aR */
    protected C0090e f433aR = new C0090e();

    /* renamed from: aS */
    int f434aS;

    /* renamed from: aT */
    int f435aT;

    /* renamed from: aU */
    int f436aU;

    /* renamed from: aV */
    int f437aV;

    /* renamed from: aW */
    int f438aW = 0;

    /* renamed from: aX */
    int f439aX = 0;

    /* renamed from: aY */
    C0059d[] f440aY = new C0059d[4];

    /* renamed from: aZ */
    C0059d[] f441aZ = new C0059d[4];

    /* renamed from: ba */
    public List<C0075j> f442ba = new ArrayList();

    /* renamed from: bb */
    public boolean f443bb = false;

    /* renamed from: bc */
    public boolean f444bc = false;

    /* renamed from: bd */
    public boolean f445bd = false;

    /* renamed from: be */
    public int f446be = 0;

    /* renamed from: bf */
    public int f447bf = 0;

    /* renamed from: bg */
    public boolean f448bg = false;

    /* renamed from: bh */
    int f449bh = 0;

    /* renamed from: bk */
    private boolean f450bk = false;

    /* renamed from: bl */
    private C0084r f451bl;

    /* renamed from: bm */
    private int f452bm = 7;

    /* renamed from: bn */
    private boolean f453bn = false;

    /* renamed from: bo */
    private boolean f454bo = false;

    public C0074i() {
    }

    public C0074i(int i, int i2) {
        super(i, i2);
    }

    public C0074i(int i, int i2, int i3, int i4) {
        super(i, i2, i3, i4);
    }

    /* renamed from: e */
    private void mo143e() {
        this.f438aW = 0;
        this.f439aX = 0;
    }

    /* renamed from: h */
    private void m302h(C0070h hVar) {
        if (this.f438aW + 1 >= this.f441aZ.length) {
            this.f441aZ = (C0059d[]) Arrays.copyOf(this.f441aZ, this.f441aZ.length * 2);
        }
        this.f441aZ[this.f438aW] = new C0059d(hVar, 0, mo298aE());
        this.f438aW++;
    }

    /* renamed from: i */
    private void m303i(C0070h hVar) {
        if (this.f439aX + 1 >= this.f440aY.length) {
            this.f440aY = (C0059d[]) Arrays.copyOf(this.f440aY, this.f440aY.length * 2);
        }
        this.f440aY[this.f439aX] = new C0059d(hVar, 1, mo298aE());
        this.f439aX++;
    }

    /* renamed from: E */
    public void mo290E(int i) {
        this.f452bm = i;
    }

    /* renamed from: F */
    public boolean mo291F(int i) {
        if ((this.f452bm & i) == i) {
            return f428a;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo292a(C0070h hVar, int i) {
        if (i == 0) {
            m302h(hVar);
        } else if (i == 1) {
            m303i(hVar);
        }
    }

    /* renamed from: a */
    public void mo293a(C0090e eVar, boolean[] zArr) {
        zArr[2] = false;
        mo140b(eVar);
        int size = this.f535bi.size();
        for (int i = 0; i < size; i++) {
            C0070h hVar = (C0070h) this.f535bi.get(i);
            hVar.mo140b(eVar);
            if (hVar.f380ad[0] == C0070h.C0073b.MATCH_CONSTRAINT && hVar.mo171M() < hVar.mo174P()) {
                zArr[2] = f428a;
            }
            if (hVar.f380ad[1] == C0070h.C0073b.MATCH_CONSTRAINT && hVar.mo175Q() < hVar.mo176R()) {
                zArr[2] = f428a;
            }
        }
    }

    /* renamed from: a */
    public void mo294a(C0092f fVar) {
        this.f433aR.mo412a(fVar);
    }

    /* renamed from: aB */
    public int mo295aB() {
        return this.f452bm;
    }

    /* renamed from: aC */
    public boolean mo296aC() {
        return this.f453bn;
    }

    /* renamed from: aD */
    public boolean mo297aD() {
        return this.f454bo;
    }

    /* renamed from: aE */
    public boolean mo298aE() {
        return this.f450bk;
    }

    /* renamed from: aF */
    public void mo299aF() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i = this.f386aj;
        int i2 = this.f387ak;
        int max = Math.max(0, mo171M());
        int max2 = Math.max(0, mo175Q());
        this.f453bn = false;
        this.f454bo = false;
        if (this.f381ae != null) {
            if (this.f451bl == null) {
                this.f451bl = new C0084r(this);
            }
            this.f451bl.mo361a(this);
            mo262l(this.f434aS);
            mo263m(this.f435aT);
            mo228au();
            mo203a(this.f433aR.mo436n());
        } else {
            this.f386aj = 0;
            this.f387ak = 0;
        }
        if (this.f452bm != 0) {
            if (!mo291F(8)) {
                mo303aJ();
            }
            if (!mo291F(32)) {
                mo304aK();
            }
            this.f433aR.f552d = f428a;
        } else {
            this.f433aR.f552d = false;
        }
        boolean z5 = false;
        C0070h.C0073b bVar = this.f380ad[1];
        C0070h.C0073b bVar2 = this.f380ad[0];
        mo143e();
        if (this.f442ba.size() == 0) {
            this.f442ba.clear();
            this.f442ba.add(0, new C0075j(this.f535bi));
        }
        int size = this.f442ba.size();
        ArrayList arrayList = this.f535bi;
        boolean z6 = mo229av() == C0070h.C0073b.WRAP_CONTENT || mo230aw() == C0070h.C0073b.WRAP_CONTENT;
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i4 >= size || this.f448bg) {
                this.f535bi = arrayList;
            } else {
                if (!this.f442ba.get(i4).f458d) {
                    if (mo291F(32)) {
                        if (mo229av() == C0070h.C0073b.FIXED && mo230aw() == C0070h.C0073b.FIXED) {
                            this.f535bi = (ArrayList) this.f442ba.get(i4).mo311a();
                        } else {
                            this.f535bi = (ArrayList) this.f442ba.get(i4).f455a;
                        }
                    }
                    mo143e();
                    int size2 = this.f535bi.size();
                    int i5 = 0;
                    while (true) {
                        int i6 = i5;
                        if (i6 >= size2) {
                            break;
                        }
                        C0070h hVar = (C0070h) this.f535bi.get(i6);
                        if (hVar instanceof C0086s) {
                            ((C0086s) hVar).mo299aF();
                        }
                        i5 = i6 + 1;
                    }
                    boolean z7 = f428a;
                    int i7 = 0;
                    while (z7) {
                        int i8 = i7 + 1;
                        try {
                            this.f433aR.mo420b();
                            mo143e();
                            mo244c(this.f433aR);
                            for (int i9 = 0; i9 < size2; i9++) {
                                ((C0070h) this.f535bi.get(i9)).mo244c(this.f433aR);
                            }
                            z7 = mo309d(this.f433aR);
                            if (z7) {
                                this.f433aR.mo429g();
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                            System.out.println("EXCEPTION : " + e);
                        }
                        if (!z7) {
                            mo140b(this.f433aR);
                            int i10 = 0;
                            while (true) {
                                int i11 = i10;
                                if (i11 >= size2) {
                                    break;
                                }
                                C0070h hVar2 = (C0070h) this.f535bi.get(i11);
                                if (hVar2.f380ad[0] != C0070h.C0073b.MATCH_CONSTRAINT || hVar2.mo171M() >= hVar2.mo174P()) {
                                    if (hVar2.f380ad[1] == C0070h.C0073b.MATCH_CONSTRAINT && hVar2.mo175Q() < hVar2.mo176R()) {
                                        C0079m.f492i[2] = f428a;
                                        break;
                                    }
                                    i10 = i11 + 1;
                                } else {
                                    C0079m.f492i[2] = f428a;
                                    break;
                                }
                            }
                        } else {
                            mo293a(this.f433aR, C0079m.f492i);
                        }
                        boolean z8 = false;
                        if (z6 && i8 < 8 && C0079m.f492i[2]) {
                            int i12 = 0;
                            int i13 = 0;
                            int i14 = 0;
                            while (true) {
                                int i15 = i12;
                                if (i15 >= size2) {
                                    break;
                                }
                                C0070h hVar3 = (C0070h) this.f535bi.get(i15);
                                i13 = Math.max(i13, hVar3.f386aj + hVar3.mo171M());
                                i14 = Math.max(i14, hVar3.mo175Q() + hVar3.f387ak);
                                i12 = i15 + 1;
                            }
                            int max3 = Math.max(this.f393aq, i13);
                            int max4 = Math.max(this.f394ar, i14);
                            if (bVar2 != C0070h.C0073b.WRAP_CONTENT || mo171M() >= max3) {
                                z3 = false;
                                z4 = z5;
                            } else {
                                mo271r(max3);
                                this.f380ad[0] = C0070h.C0073b.WRAP_CONTENT;
                                z4 = f428a;
                                z3 = f428a;
                            }
                            if (bVar != C0070h.C0073b.WRAP_CONTENT || mo175Q() >= max4) {
                                z5 = z4;
                                z8 = z3;
                            } else {
                                mo274s(max4);
                                this.f380ad[1] = C0070h.C0073b.WRAP_CONTENT;
                                z5 = f428a;
                                z8 = f428a;
                            }
                        }
                        int max5 = Math.max(this.f393aq, mo171M());
                        if (max5 > mo171M()) {
                            mo271r(max5);
                            this.f380ad[0] = C0070h.C0073b.FIXED;
                            z5 = f428a;
                            z8 = f428a;
                        }
                        int max6 = Math.max(this.f394ar, mo175Q());
                        if (max6 > mo175Q()) {
                            mo274s(max6);
                            this.f380ad[1] = C0070h.C0073b.FIXED;
                            z2 = f428a;
                            z = f428a;
                        } else {
                            z = z8;
                            z2 = z5;
                        }
                        if (!z2) {
                            if (this.f380ad[0] == C0070h.C0073b.WRAP_CONTENT && max > 0 && mo171M() > max) {
                                this.f453bn = f428a;
                                z2 = f428a;
                                this.f380ad[0] = C0070h.C0073b.FIXED;
                                mo271r(max);
                                z = f428a;
                            }
                            if (this.f380ad[1] == C0070h.C0073b.WRAP_CONTENT && max2 > 0 && mo175Q() > max2) {
                                this.f454bo = f428a;
                                z2 = f428a;
                                this.f380ad[1] = C0070h.C0073b.FIXED;
                                mo274s(max2);
                                z = f428a;
                            }
                        }
                        z5 = z2;
                        z7 = z;
                        i7 = i8;
                    }
                    this.f442ba.get(i4).mo315b();
                }
                i3 = i4 + 1;
            }
        }
        this.f535bi = arrayList;
        if (this.f381ae != null) {
            int max7 = Math.max(this.f393aq, mo171M());
            int max8 = Math.max(this.f394ar, mo175Q());
            this.f451bl.mo362b(this);
            mo271r(max7 + this.f434aS + this.f436aU);
            mo274s(this.f435aT + max8 + this.f437aV);
        } else {
            this.f386aj = i;
            this.f387ak = i2;
        }
        if (z5) {
            this.f380ad[0] = bVar2;
            this.f380ad[1] = bVar;
        }
        mo203a(this.f433aR.mo436n());
        if (this == mo368aO()) {
            mo220am();
        }
    }

    /* renamed from: aG */
    public void mo300aG() {
        mo303aJ();
        mo90b(this.f452bm);
    }

    /* renamed from: aH */
    public void mo301aH() {
        C0081o a = mo185a(C0060e.C0064c.LEFT).mo103a();
        C0081o a2 = mo185a(C0060e.C0064c.TOP).mo103a();
        a.mo342a((C0081o) null, 0.0f);
        a2.mo342a((C0081o) null, 0.0f);
    }

    /* renamed from: aI */
    public void mo302aI() {
        C0081o a = mo185a(C0060e.C0064c.LEFT).mo103a();
        C0081o a2 = mo185a(C0060e.C0064c.TOP).mo103a();
        a.mo358f();
        a2.mo358f();
        a.mo342a((C0081o) null, 0.0f);
        a2.mo342a((C0081o) null, 0.0f);
    }

    /* renamed from: aJ */
    public void mo303aJ() {
        int size = this.f535bi.size();
        mo92c();
        for (int i = 0; i < size; i++) {
            ((C0070h) this.f535bi.get(i)).mo92c();
        }
    }

    /* renamed from: aK */
    public void mo304aK() {
        if (!mo291F(8)) {
            mo90b(this.f452bm);
        }
        mo301aH();
    }

    /* renamed from: aL */
    public C0090e mo305aL() {
        return this.f433aR;
    }

    /* renamed from: aM */
    public List<C0075j> mo306aM() {
        return this.f442ba;
    }

    /* renamed from: a_ */
    public String mo139a_() {
        return "ConstraintLayout";
    }

    /* renamed from: b */
    public void mo90b(int i) {
        super.mo90b(i);
        int size = this.f535bi.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((C0070h) this.f535bi.get(i2)).mo90b(i);
        }
    }

    /* renamed from: b */
    public void mo307b(int i, int i2, int i3, int i4) {
        this.f434aS = i;
        this.f435aT = i2;
        this.f436aU = i3;
        this.f437aV = i4;
    }

    /* renamed from: d */
    public void mo308d(boolean z) {
        this.f450bk = z;
    }

    /* renamed from: d */
    public boolean mo309d(C0090e eVar) {
        mo87a(eVar);
        int size = this.f535bi.size();
        for (int i = 0; i < size; i++) {
            C0070h hVar = (C0070h) this.f535bi.get(i);
            if (hVar instanceof C0074i) {
                C0070h.C0073b bVar = hVar.f380ad[0];
                C0070h.C0073b bVar2 = hVar.f380ad[1];
                if (bVar == C0070h.C0073b.WRAP_CONTENT) {
                    hVar.mo201a(C0070h.C0073b.FIXED);
                }
                if (bVar2 == C0070h.C0073b.WRAP_CONTENT) {
                    hVar.mo237b(C0070h.C0073b.FIXED);
                }
                hVar.mo87a(eVar);
                if (bVar == C0070h.C0073b.WRAP_CONTENT) {
                    hVar.mo201a(bVar);
                }
                if (bVar2 == C0070h.C0073b.WRAP_CONTENT) {
                    hVar.mo237b(bVar2);
                }
            } else {
                C0079m.m368a(this, eVar, hVar);
                hVar.mo87a(eVar);
            }
        }
        if (this.f438aW > 0) {
            C0058c.m84a(this, eVar, 0);
        }
        if (this.f439aX > 0) {
            C0058c.m84a(this, eVar, 1);
        }
        return f428a;
    }

    /* renamed from: j */
    public ArrayList<C0076k> mo150j() {
        ArrayList<C0076k> arrayList = new ArrayList<>();
        int size = this.f535bi.size();
        for (int i = 0; i < size; i++) {
            C0070h hVar = (C0070h) this.f535bi.get(i);
            if (hVar instanceof C0076k) {
                C0076k kVar = (C0076k) hVar;
                if (kVar.mo325h() == 1) {
                    arrayList.add(kVar);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: j */
    public void mo310j(int i, int i2) {
        if (!(this.f380ad[0] == C0070h.C0073b.WRAP_CONTENT || this.f408w == null)) {
            this.f408w.mo354a(i);
        }
        if (this.f380ad[1] != C0070h.C0073b.WRAP_CONTENT && this.f409x != null) {
            this.f409x.mo354a(i2);
        }
    }

    /* renamed from: k */
    public ArrayList<C0076k> mo151k() {
        ArrayList<C0076k> arrayList = new ArrayList<>();
        int size = this.f535bi.size();
        for (int i = 0; i < size; i++) {
            C0070h hVar = (C0070h) this.f535bi.get(i);
            if (hVar instanceof C0076k) {
                C0076k kVar = (C0076k) hVar;
                if (kVar.mo325h() == 0) {
                    arrayList.add(kVar);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: m */
    public boolean mo153m() {
        return false;
    }

    /* renamed from: s */
    public void mo273s() {
        this.f433aR.mo420b();
        this.f434aS = 0;
        this.f436aU = 0;
        this.f435aT = 0;
        this.f437aV = 0;
        this.f442ba.clear();
        this.f448bg = false;
        super.mo273s();
    }
}
