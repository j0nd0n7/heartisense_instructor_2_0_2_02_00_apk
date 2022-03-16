package android.support.constraint.p003a.p004a;

import android.support.constraint.p003a.C0088c;
import android.support.p036v7.widget.ActivityChooserView;
import java.util.ArrayList;

/* renamed from: android.support.constraint.a.a.s */
public class C0086s extends C0070h {

    /* renamed from: bi */
    protected ArrayList<C0070h> f535bi = new ArrayList<>();

    public C0086s() {
    }

    public C0086s(int i, int i2) {
        super(i, i2);
    }

    public C0086s(int i, int i2, int i3, int i4) {
        super(i, i2, i3, i4);
    }

    /* renamed from: a */
    public static C0080n m406a(ArrayList<C0070h> arrayList) {
        int i = ActivityChooserView.C1593a.f5166a;
        C0080n nVar = new C0080n();
        if (arrayList.size() == 0) {
            return nVar;
        }
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = Integer.MAX_VALUE;
        while (i2 < size) {
            C0070h hVar = arrayList.get(i2);
            if (hVar.mo169K() < i5) {
                i5 = hVar.mo169K();
            }
            if (hVar.mo170L() < i) {
                i = hVar.mo170L();
            }
            if (hVar.mo212ae() > i4) {
                i4 = hVar.mo212ae();
            }
            i2++;
            i3 = hVar.mo213af() > i3 ? hVar.mo213af() : i3;
        }
        nVar.mo335a(i5, i, i4 - i5, i3 - i);
        return nVar;
    }

    /* renamed from: a */
    public C0070h mo365a(float f, float f2) {
        C0070h hVar = null;
        int S = mo177S();
        int T = mo178T();
        int M = mo171M() + S;
        int Q = mo175Q() + T;
        if (f >= ((float) S) && f <= ((float) M) && f2 >= ((float) T) && f2 <= ((float) Q)) {
            hVar = this;
        }
        int size = this.f535bi.size();
        C0070h hVar2 = hVar;
        for (int i = 0; i < size; i++) {
            C0070h hVar3 = this.f535bi.get(i);
            if (hVar3 instanceof C0086s) {
                C0070h a = ((C0086s) hVar3).mo365a(f, f2);
                if (a == null) {
                    a = hVar2;
                }
                hVar2 = a;
            } else {
                int S2 = hVar3.mo177S();
                int T2 = hVar3.mo178T();
                int M2 = hVar3.mo171M() + S2;
                int Q2 = hVar3.mo175Q() + T2;
                if (f >= ((float) S2) && f <= ((float) M2) && f2 >= ((float) T2) && f2 <= ((float) Q2)) {
                    hVar2 = hVar3;
                }
            }
        }
        return hVar2;
    }

    /* renamed from: a */
    public void mo203a(C0088c cVar) {
        super.mo203a(cVar);
        int size = this.f535bi.size();
        for (int i = 0; i < size; i++) {
            this.f535bi.get(i).mo203a(cVar);
        }
    }

    /* renamed from: a */
    public void mo366a(C0070h... hVarArr) {
        for (C0070h f : hVarArr) {
            mo371f(f);
        }
    }

    /* renamed from: aF */
    public void mo299aF() {
        mo220am();
        if (this.f535bi != null) {
            int size = this.f535bi.size();
            for (int i = 0; i < size; i++) {
                C0070h hVar = this.f535bi.get(i);
                if (hVar instanceof C0086s) {
                    ((C0086s) hVar).mo299aF();
                }
            }
        }
    }

    /* renamed from: aN */
    public ArrayList<C0070h> mo367aN() {
        return this.f535bi;
    }

    /* renamed from: aO */
    public C0074i mo368aO() {
        C0074i iVar;
        C0070h hVar;
        C0070h hVar2;
        C0070h B = mo157B();
        if (this instanceof C0074i) {
            iVar = (C0074i) this;
            hVar = B;
        } else {
            iVar = null;
            hVar = B;
        }
        while (hVar != null) {
            C0070h B2 = hVar.mo157B();
            if (hVar instanceof C0074i) {
                iVar = (C0074i) hVar;
                hVar2 = B2;
            } else {
                hVar2 = B2;
            }
        }
        return iVar;
    }

    /* renamed from: aP */
    public void mo369aP() {
        this.f535bi.clear();
    }

    /* renamed from: am */
    public void mo220am() {
        super.mo220am();
        if (this.f535bi != null) {
            int size = this.f535bi.size();
            for (int i = 0; i < size; i++) {
                C0070h hVar = this.f535bi.get(i);
                hVar.mo242c(mo177S(), mo178T());
                if (!(hVar instanceof C0074i)) {
                    hVar.mo220am();
                }
            }
        }
    }

    /* renamed from: c */
    public ArrayList<C0070h> mo370c(int i, int i2, int i3, int i4) {
        ArrayList<C0070h> arrayList = new ArrayList<>();
        C0080n nVar = new C0080n();
        nVar.mo335a(i, i2, i3, i4);
        int size = this.f535bi.size();
        for (int i5 = 0; i5 < size; i5++) {
            C0070h hVar = this.f535bi.get(i5);
            C0080n nVar2 = new C0080n();
            nVar2.mo335a(hVar.mo177S(), hVar.mo178T(), hVar.mo171M(), hVar.mo175Q());
            if (nVar.mo336a(nVar2)) {
                arrayList.add(hVar);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public void mo242c(int i, int i2) {
        super.mo242c(i, i2);
        int size = this.f535bi.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.f535bi.get(i3).mo242c(mo183Y(), mo184Z());
        }
    }

    /* renamed from: f */
    public void mo371f(C0070h hVar) {
        this.f535bi.add(hVar);
        if (hVar.mo157B() != null) {
            ((C0086s) hVar.mo157B()).mo372g(hVar);
        }
        hVar.mo238b((C0070h) this);
    }

    /* renamed from: g */
    public void mo372g(C0070h hVar) {
        this.f535bi.remove(hVar);
        hVar.mo238b((C0070h) null);
    }

    /* renamed from: s */
    public void mo273s() {
        this.f535bi.clear();
        super.mo273s();
    }
}
