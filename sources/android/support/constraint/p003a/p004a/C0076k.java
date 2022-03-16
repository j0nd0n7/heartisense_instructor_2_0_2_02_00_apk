package android.support.constraint.p003a.p004a;

import android.support.constraint.p003a.C0090e;
import android.support.constraint.p003a.C0096h;
import android.support.constraint.p003a.p004a.C0060e;
import android.support.constraint.p003a.p004a.C0070h;
import java.util.ArrayList;

/* renamed from: android.support.constraint.a.a.k */
public class C0076k extends C0070h {

    /* renamed from: a */
    public static final int f466a = 0;

    /* renamed from: aR */
    public static final int f467aR = 2;

    /* renamed from: aS */
    public static final int f468aS = -1;

    /* renamed from: b */
    public static final int f469b = 1;

    /* renamed from: c */
    public static final int f470c = 0;

    /* renamed from: d */
    public static final int f471d = 1;

    /* renamed from: aT */
    protected float f472aT = -1.0f;

    /* renamed from: aU */
    protected int f473aU = -1;

    /* renamed from: aV */
    protected int f474aV = -1;

    /* renamed from: aW */
    private C0060e f475aW = this.f345N;

    /* renamed from: aX */
    private int f476aX = 0;

    /* renamed from: aY */
    private boolean f477aY = false;

    /* renamed from: aZ */
    private int f478aZ = 0;

    /* renamed from: ba */
    private C0080n f479ba = new C0080n();

    /* renamed from: bb */
    private int f480bb = 8;

    public C0076k() {
        this.f379aa.clear();
        this.f379aa.add(this.f475aW);
        int length = this.f352Z.length;
        for (int i = 0; i < length; i++) {
            this.f352Z[i] = this.f475aW;
        }
    }

    /* renamed from: a */
    public C0060e mo185a(C0060e.C0064c cVar) {
        switch (cVar) {
            case LEFT:
            case RIGHT:
                if (this.f476aX == 1) {
                    return this.f475aW;
                }
                break;
            case TOP:
            case BOTTOM:
                if (this.f476aX == 0) {
                    return this.f475aW;
                }
                break;
            case BASELINE:
            case CENTER:
            case CENTER_X:
            case CENTER_Y:
            case NONE:
                return null;
        }
        throw new AssertionError(cVar.name());
    }

    /* renamed from: a */
    public void mo86a(int i) {
        if (this.f476aX != i) {
            this.f476aX = i;
            this.f379aa.clear();
            if (this.f476aX == 1) {
                this.f475aW = this.f344M;
            } else {
                this.f475aW = this.f345N;
            }
            this.f379aa.add(this.f475aW);
            int length = this.f352Z.length;
            for (int i2 = 0; i2 < length; i2++) {
                this.f352Z[i2] = this.f475aW;
            }
        }
    }

    /* renamed from: a */
    public void mo87a(C0090e eVar) {
        C0060e eVar2;
        C0060e eVar3;
        boolean z = true;
        C0074i iVar = (C0074i) mo157B();
        if (iVar != null) {
            C0060e a = iVar.mo185a(C0060e.C0064c.LEFT);
            C0060e a2 = iVar.mo185a(C0060e.C0064c.RIGHT);
            boolean z2 = this.f381ae != null ? this.f381ae.f380ad[0] == C0070h.C0073b.WRAP_CONTENT : false;
            if (this.f476aX == 0) {
                C0060e a3 = iVar.mo185a(C0060e.C0064c.TOP);
                eVar2 = iVar.mo185a(C0060e.C0064c.BOTTOM);
                if (this.f381ae == null) {
                    z = false;
                } else if (this.f381ae.f380ad[1] != C0070h.C0073b.WRAP_CONTENT) {
                    z = false;
                }
                eVar3 = a3;
            } else {
                z = z2;
                eVar2 = a2;
                eVar3 = a;
            }
            if (this.f473aU != -1) {
                C0096h a4 = eVar.mo406a((Object) this.f475aW);
                eVar.mo425c(a4, eVar.mo406a((Object) eVar3), this.f473aU, 6);
                if (z) {
                    eVar.mo416a(eVar.mo406a((Object) eVar2), a4, 0, 5);
                }
            } else if (this.f474aV != -1) {
                C0096h a5 = eVar.mo406a((Object) this.f475aW);
                C0096h a6 = eVar.mo406a((Object) eVar2);
                eVar.mo425c(a5, a6, -this.f474aV, 6);
                if (z) {
                    eVar.mo416a(a5, eVar.mo406a((Object) eVar3), 0, 5);
                    eVar.mo416a(a6, a5, 0, 5);
                }
            } else if (this.f472aT != -1.0f) {
                eVar.mo409a(C0090e.m453a(eVar, eVar.mo406a((Object) this.f475aW), eVar.mo406a((Object) eVar3), eVar.mo406a((Object) eVar2), this.f472aT, this.f477aY));
            }
        }
    }

    /* renamed from: a */
    public void mo316a(boolean z) {
        if (this.f477aY != z) {
            this.f477aY = z;
        }
    }

    /* renamed from: a */
    public boolean mo89a() {
        return true;
    }

    /* renamed from: aB */
    public void mo317aB() {
        if (this.f473aU != -1) {
            mo329l();
        } else if (this.f472aT != -1.0f) {
            mo331n();
        } else if (this.f474aV != -1) {
            mo330m();
        }
    }

    /* renamed from: a_ */
    public String mo139a_() {
        return "Guideline";
    }

    /* renamed from: al */
    public ArrayList<C0060e> mo219al() {
        return this.f379aa;
    }

    /* renamed from: b */
    public void mo90b(int i) {
        C0070h B = mo157B();
        if (B != null) {
            if (mo325h() == 1) {
                this.f345N.mo103a().mo341a(1, B.f345N.mo103a(), 0);
                this.f347P.mo103a().mo341a(1, B.f345N.mo103a(), 0);
                if (this.f473aU != -1) {
                    this.f344M.mo103a().mo341a(1, B.f344M.mo103a(), this.f473aU);
                    this.f346O.mo103a().mo341a(1, B.f344M.mo103a(), this.f473aU);
                } else if (this.f474aV != -1) {
                    this.f344M.mo103a().mo341a(1, B.f346O.mo103a(), -this.f474aV);
                    this.f346O.mo103a().mo341a(1, B.f346O.mo103a(), -this.f474aV);
                } else if (this.f472aT != -1.0f && B.mo229av() == C0070h.C0073b.FIXED) {
                    int i2 = (int) (((float) B.f382af) * this.f472aT);
                    this.f344M.mo103a().mo341a(1, B.f344M.mo103a(), i2);
                    this.f346O.mo103a().mo341a(1, B.f344M.mo103a(), i2);
                }
            } else {
                this.f344M.mo103a().mo341a(1, B.f344M.mo103a(), 0);
                this.f346O.mo103a().mo341a(1, B.f344M.mo103a(), 0);
                if (this.f473aU != -1) {
                    this.f345N.mo103a().mo341a(1, B.f345N.mo103a(), this.f473aU);
                    this.f347P.mo103a().mo341a(1, B.f345N.mo103a(), this.f473aU);
                } else if (this.f474aV != -1) {
                    this.f345N.mo103a().mo341a(1, B.f347P.mo103a(), -this.f474aV);
                    this.f347P.mo103a().mo341a(1, B.f347P.mo103a(), -this.f474aV);
                } else if (this.f472aT != -1.0f && B.mo230aw() == C0070h.C0073b.FIXED) {
                    int i3 = (int) (((float) B.f383ag) * this.f472aT);
                    this.f345N.mo103a().mo341a(1, B.f345N.mo103a(), i3);
                    this.f347P.mo103a().mo341a(1, B.f345N.mo103a(), i3);
                }
            }
        }
    }

    /* renamed from: b */
    public void mo140b(C0090e eVar) {
        if (mo157B() != null) {
            int b = eVar.mo419b((Object) this.f475aW);
            if (this.f476aX == 1) {
                mo262l(b);
                mo263m(0);
                mo274s(mo157B().mo175Q());
                mo271r(0);
                return;
            }
            mo262l(0);
            mo263m(b);
            mo271r(mo157B().mo171M());
            mo274s(0);
        }
    }

    /* renamed from: c */
    public void mo318c(int i) {
        this.f478aZ = i;
    }

    /* renamed from: d */
    public void mo319d(int i) {
        mo320e(((float) i) / 100.0f);
    }

    /* renamed from: d */
    public void mo248d(int i, int i2) {
        if (this.f476aX == 1) {
            int i3 = i - this.f390an;
            if (this.f473aU != -1) {
                mo321e(i3);
            } else if (this.f474aV != -1) {
                mo323f(mo157B().mo171M() - i3);
            } else if (this.f472aT != -1.0f) {
                mo320e(((float) i3) / ((float) mo157B().mo171M()));
            }
        } else {
            int i4 = i2 - this.f391ao;
            if (this.f473aU != -1) {
                mo321e(i4);
            } else if (this.f474aV != -1) {
                mo323f(mo157B().mo175Q() - i4);
            } else if (this.f472aT != -1.0f) {
                mo320e(((float) i4) / ((float) mo157B().mo175Q()));
            }
        }
    }

    /* renamed from: e */
    public int mo143e() {
        if (this.f472aT != -1.0f) {
            return 0;
        }
        if (this.f473aU != -1) {
            return 1;
        }
        return this.f474aV != -1 ? 2 : -1;
    }

    /* renamed from: e */
    public void mo320e(float f) {
        if (f > -1.0f) {
            this.f472aT = f;
            this.f473aU = -1;
            this.f474aV = -1;
        }
    }

    /* renamed from: e */
    public void mo321e(int i) {
        if (i > -1) {
            this.f472aT = -1.0f;
            this.f473aU = i;
            this.f474aV = -1;
        }
    }

    /* renamed from: f */
    public C0080n mo322f() {
        this.f479ba.mo335a(mo177S() - this.f480bb, mo178T() - (this.f480bb * 2), this.f480bb * 2, this.f480bb * 2);
        if (mo325h() == 0) {
            this.f479ba.mo335a(mo177S() - (this.f480bb * 2), mo178T() - this.f480bb, this.f480bb * 2, this.f480bb * 2);
        }
        return this.f479ba;
    }

    /* renamed from: f */
    public void mo323f(int i) {
        if (i > -1) {
            this.f472aT = -1.0f;
            this.f473aU = -1;
            this.f474aV = i;
        }
    }

    /* renamed from: g */
    public C0060e mo324g() {
        return this.f475aW;
    }

    /* renamed from: h */
    public int mo325h() {
        return this.f476aX;
    }

    /* renamed from: i */
    public float mo326i() {
        return this.f472aT;
    }

    /* renamed from: j */
    public int mo327j() {
        return this.f473aU;
    }

    /* renamed from: k */
    public int mo328k() {
        return this.f474aV;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo329l() {
        float K = ((float) mo169K()) / ((float) mo157B().mo171M());
        if (this.f476aX == 0) {
            K = ((float) mo170L()) / ((float) mo157B().mo175Q());
        }
        mo320e(K);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo330m() {
        int K = mo169K();
        if (this.f476aX == 0) {
            K = mo170L();
        }
        mo321e(K);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo331n() {
        int M = mo157B().mo171M() - mo169K();
        if (this.f476aX == 0) {
            M = mo157B().mo175Q() - mo170L();
        }
        mo323f(M);
    }
}
