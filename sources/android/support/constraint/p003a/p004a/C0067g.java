package android.support.constraint.p003a.p004a;

import android.support.constraint.p003a.C0090e;
import android.support.constraint.p003a.p004a.C0060e;
import android.support.constraint.p003a.p004a.C0070h;
import java.util.ArrayList;

/* renamed from: android.support.constraint.a.a.g */
public class C0067g extends C0074i {

    /* renamed from: a */
    public static final int f284a = 0;

    /* renamed from: b */
    public static final int f285b = 1;

    /* renamed from: br */
    private static final int f286br = 3;

    /* renamed from: c */
    public static final int f287c = 2;

    /* renamed from: bj */
    private boolean f288bj = true;

    /* renamed from: bk */
    private int f289bk = 0;

    /* renamed from: bl */
    private int f290bl = 0;

    /* renamed from: bm */
    private int f291bm = 8;

    /* renamed from: bn */
    private ArrayList<C0069b> f292bn = new ArrayList<>();

    /* renamed from: bo */
    private ArrayList<C0068a> f293bo = new ArrayList<>();

    /* renamed from: bp */
    private ArrayList<C0076k> f294bp = new ArrayList<>();

    /* renamed from: bq */
    private ArrayList<C0076k> f295bq = new ArrayList<>();

    /* renamed from: bs */
    private C0090e f296bs = null;

    /* renamed from: android.support.constraint.a.a.g$a */
    class C0068a {

        /* renamed from: a */
        C0070h f297a;

        /* renamed from: b */
        C0070h f298b;

        /* renamed from: c */
        int f299c;

        C0068a() {
        }
    }

    /* renamed from: android.support.constraint.a.a.g$b */
    class C0069b {

        /* renamed from: a */
        C0070h f301a;

        /* renamed from: b */
        C0070h f302b;

        /* renamed from: c */
        int f303c = 1;

        /* renamed from: d */
        int f304d;

        C0069b() {
        }
    }

    public C0067g() {
    }

    public C0067g(int i, int i2) {
        super(i, i2);
    }

    public C0067g(int i, int i2, int i3, int i4) {
        super(i, i2, i3, i4);
    }

    /* renamed from: aQ */
    private void m130aQ() {
        if (this.f296bs != null) {
            int size = this.f294bp.size();
            for (int i = 0; i < size; i++) {
                this.f294bp.get(i).mo136a(this.f296bs, mo164F() + ".VG" + i);
            }
            int size2 = this.f295bq.size();
            for (int i2 = 0; i2 < size2; i2++) {
                this.f295bq.get(i2).mo136a(this.f296bs, mo164F() + ".HG" + i2);
            }
        }
    }

    /* renamed from: aR */
    private void m131aR() {
        this.f292bn.clear();
        float f = 100.0f / ((float) this.f289bk);
        float f2 = f;
        C0070h hVar = this;
        for (int i = 0; i < this.f289bk; i++) {
            C0069b bVar = new C0069b();
            bVar.f301a = hVar;
            if (i < this.f289bk - 1) {
                C0076k kVar = new C0076k();
                kVar.mo86a(1);
                kVar.mo238b((C0070h) this);
                kVar.mo319d((int) f2);
                f2 += f;
                bVar.f302b = kVar;
                this.f294bp.add(kVar);
            } else {
                bVar.f302b = this;
            }
            hVar = bVar.f302b;
            this.f292bn.add(bVar);
        }
        m130aQ();
    }

    /* renamed from: aS */
    private void m132aS() {
        this.f293bo.clear();
        float f = 100.0f / ((float) this.f290bl);
        C0070h hVar = this;
        float f2 = f;
        for (int i = 0; i < this.f290bl; i++) {
            C0068a aVar = new C0068a();
            aVar.f297a = hVar;
            if (i < this.f290bl - 1) {
                C0076k kVar = new C0076k();
                kVar.mo86a(0);
                kVar.mo238b((C0070h) this);
                kVar.mo319d((int) f2);
                f2 += f;
                aVar.f298b = kVar;
                this.f295bq.add(kVar);
            } else {
                aVar.f298b = this;
            }
            hVar = aVar.f298b;
            this.f293bo.add(aVar);
        }
        m130aQ();
    }

    /* renamed from: aT */
    private void m133aT() {
        int size = this.f535bi.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C0070h hVar = (C0070h) this.f535bi.get(i2);
            int aq = i + hVar.mo224aq();
            int i3 = aq % this.f289bk;
            C0068a aVar = this.f293bo.get(aq / this.f289bk);
            C0069b bVar = this.f292bn.get(i3);
            C0070h hVar2 = bVar.f301a;
            C0070h hVar3 = bVar.f302b;
            C0070h hVar4 = aVar.f297a;
            C0070h hVar5 = aVar.f298b;
            hVar.mo185a(C0060e.C0064c.LEFT).mo109a(hVar2.mo185a(C0060e.C0064c.LEFT), this.f291bm);
            if (hVar3 instanceof C0076k) {
                hVar.mo185a(C0060e.C0064c.RIGHT).mo109a(hVar3.mo185a(C0060e.C0064c.LEFT), this.f291bm);
            } else {
                hVar.mo185a(C0060e.C0064c.RIGHT).mo109a(hVar3.mo185a(C0060e.C0064c.RIGHT), this.f291bm);
            }
            switch (bVar.f303c) {
                case 1:
                    hVar.mo185a(C0060e.C0064c.LEFT).mo106a(C0060e.C0063b.STRONG);
                    hVar.mo185a(C0060e.C0064c.RIGHT).mo106a(C0060e.C0063b.WEAK);
                    break;
                case 2:
                    hVar.mo185a(C0060e.C0064c.LEFT).mo106a(C0060e.C0063b.WEAK);
                    hVar.mo185a(C0060e.C0064c.RIGHT).mo106a(C0060e.C0063b.STRONG);
                    break;
                case 3:
                    hVar.mo201a(C0070h.C0073b.MATCH_CONSTRAINT);
                    break;
            }
            hVar.mo185a(C0060e.C0064c.TOP).mo109a(hVar4.mo185a(C0060e.C0064c.TOP), this.f291bm);
            if (hVar5 instanceof C0076k) {
                hVar.mo185a(C0060e.C0064c.BOTTOM).mo109a(hVar5.mo185a(C0060e.C0064c.TOP), this.f291bm);
            } else {
                hVar.mo185a(C0060e.C0064c.BOTTOM).mo109a(hVar5.mo185a(C0060e.C0064c.BOTTOM), this.f291bm);
            }
            i = aq + 1;
        }
    }

    /* renamed from: a */
    public String mo86a(int i) {
        C0069b bVar = this.f292bn.get(i);
        return bVar.f303c == 1 ? "L" : bVar.f303c == 0 ? "C" : bVar.f303c == 3 ? "F" : bVar.f303c == 2 ? "R" : "!";
    }

    /* renamed from: a */
    public void mo135a(int i, int i2) {
        if (i < this.f292bn.size()) {
            this.f292bn.get(i).f303c = i2;
            m133aT();
        }
    }

    /* renamed from: a */
    public void mo87a(C0090e eVar) {
        super.mo87a(eVar);
        int size = this.f535bi.size();
        if (size != 0) {
            mo152l();
            if (eVar == this.f433aR) {
                int size2 = this.f294bp.size();
                for (int i = 0; i < size2; i++) {
                    C0076k kVar = this.f294bp.get(i);
                    kVar.mo316a(mo229av() == C0070h.C0073b.WRAP_CONTENT);
                    kVar.mo87a(eVar);
                }
                int size3 = this.f295bq.size();
                for (int i2 = 0; i2 < size3; i2++) {
                    C0076k kVar2 = this.f295bq.get(i2);
                    kVar2.mo316a(mo230aw() == C0070h.C0073b.WRAP_CONTENT);
                    kVar2.mo87a(eVar);
                }
                for (int i3 = 0; i3 < size; i3++) {
                    ((C0070h) this.f535bi.get(i3)).mo87a(eVar);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo136a(C0090e eVar, String str) {
        this.f296bs = eVar;
        super.mo136a(eVar, str);
        m130aQ();
    }

    /* renamed from: a */
    public void mo137a(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == 'L') {
                mo135a(i, 1);
            } else if (charAt == 'C') {
                mo135a(i, 0);
            } else if (charAt == 'F') {
                mo135a(i, 3);
            } else if (charAt == 'R') {
                mo135a(i, 2);
            } else {
                mo135a(i, 0);
            }
        }
    }

    /* renamed from: a */
    public void mo138a(boolean z) {
        this.f288bj = z;
    }

    /* renamed from: a_ */
    public String mo139a_() {
        return "ConstraintTableLayout";
    }

    /* renamed from: b */
    public void mo140b(C0090e eVar) {
        super.mo140b(eVar);
        if (eVar == this.f433aR) {
            int size = this.f294bp.size();
            for (int i = 0; i < size; i++) {
                this.f294bp.get(i).mo140b(eVar);
            }
            int size2 = this.f295bq.size();
            for (int i2 = 0; i2 < size2; i2++) {
                this.f295bq.get(i2).mo140b(eVar);
            }
        }
    }

    /* renamed from: c */
    public void mo141c(int i) {
        if (this.f288bj && this.f289bk != i) {
            this.f289bk = i;
            m131aR();
            mo152l();
        }
    }

    /* renamed from: d */
    public void mo142d(int i) {
        if (!this.f288bj && this.f289bk != i) {
            this.f290bl = i;
            m132aS();
            mo152l();
        }
    }

    /* renamed from: e */
    public int mo143e() {
        return this.f290bl;
    }

    /* renamed from: e */
    public void mo144e(int i) {
        if (i > 1) {
            this.f291bm = i;
        }
    }

    /* renamed from: f */
    public int mo145f() {
        return this.f289bk;
    }

    /* renamed from: f */
    public void mo146f(int i) {
        C0069b bVar = this.f292bn.get(i);
        switch (bVar.f303c) {
            case 0:
                bVar.f303c = 2;
                break;
            case 1:
                bVar.f303c = 0;
                break;
            case 2:
                bVar.f303c = 1;
                break;
        }
        m133aT();
    }

    /* renamed from: g */
    public int mo147g() {
        return this.f291bm;
    }

    /* renamed from: h */
    public String mo148h() {
        int size = this.f292bn.size();
        String str = "";
        int i = 0;
        while (i < size) {
            C0069b bVar = this.f292bn.get(i);
            i++;
            str = bVar.f303c == 1 ? str + "L" : bVar.f303c == 0 ? str + "C" : bVar.f303c == 3 ? str + "F" : bVar.f303c == 2 ? str + "R" : str;
        }
        return str;
    }

    /* renamed from: i */
    public boolean mo149i() {
        return this.f288bj;
    }

    /* renamed from: j */
    public ArrayList<C0076k> mo150j() {
        return this.f294bp;
    }

    /* renamed from: k */
    public ArrayList<C0076k> mo151k() {
        return this.f295bq;
    }

    /* renamed from: l */
    public void mo152l() {
        int size = this.f535bi.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((C0070h) this.f535bi.get(i2)).mo224aq();
        }
        int i3 = size + i;
        if (this.f288bj) {
            if (this.f289bk == 0) {
                mo141c(1);
            }
            int i4 = i3 / this.f289bk;
            if (this.f289bk * i4 < i3) {
                i4++;
            }
            if (this.f290bl != i4 || this.f294bp.size() != this.f289bk - 1) {
                this.f290bl = i4;
                m132aS();
            } else {
                return;
            }
        } else {
            if (this.f290bl == 0) {
                mo142d(1);
            }
            int i5 = i3 / this.f290bl;
            if (this.f290bl * i5 < i3) {
                i5++;
            }
            if (this.f289bk != i5 || this.f295bq.size() != this.f290bl - 1) {
                this.f289bk = i5;
                m131aR();
            } else {
                return;
            }
        }
        m133aT();
    }

    /* renamed from: m */
    public boolean mo153m() {
        return true;
    }

    /* renamed from: n */
    public void mo154n() {
        int size = this.f294bp.size();
        for (int i = 0; i < size; i++) {
            this.f294bp.get(i).mo329l();
        }
        int size2 = this.f295bq.size();
        for (int i2 = 0; i2 < size2; i2++) {
            this.f295bq.get(i2).mo329l();
        }
    }
}
