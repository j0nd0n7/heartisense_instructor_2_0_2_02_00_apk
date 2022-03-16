package android.support.constraint.p003a.p004a;

import android.support.constraint.p003a.C0090e;
import android.support.constraint.p003a.C0096h;
import android.support.constraint.p003a.p004a.C0060e;

/* renamed from: android.support.constraint.a.a.o */
public class C0081o extends C0083q {

    /* renamed from: h */
    public static final int f500h = 0;

    /* renamed from: i */
    public static final int f501i = 1;

    /* renamed from: j */
    public static final int f502j = 2;

    /* renamed from: k */
    public static final int f503k = 3;

    /* renamed from: l */
    public static final int f504l = 4;

    /* renamed from: m */
    public static final int f505m = 5;

    /* renamed from: a */
    C0060e f506a;

    /* renamed from: b */
    float f507b;

    /* renamed from: c */
    C0081o f508c;

    /* renamed from: d */
    float f509d;

    /* renamed from: e */
    C0081o f510e;

    /* renamed from: f */
    float f511f;

    /* renamed from: g */
    int f512g = 0;

    /* renamed from: s */
    private C0081o f513s;

    /* renamed from: t */
    private float f514t;

    /* renamed from: u */
    private C0082p f515u = null;

    /* renamed from: v */
    private int f516v = 1;

    /* renamed from: w */
    private C0082p f517w = null;

    /* renamed from: x */
    private int f518x = 1;

    public C0081o(C0060e eVar) {
        this.f506a = eVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo339a(int i) {
        return i == 1 ? "DIRECT" : i == 2 ? "CENTER" : i == 3 ? "MATCH" : i == 4 ? "CHAIN" : i == 5 ? "BARRIER" : "UNCONNECTED";
    }

    /* renamed from: a */
    public void mo340a() {
        float f;
        float f2;
        float f3;
        int i;
        int i2 = 0;
        if (this.f524r != 1 && this.f512g != 4) {
            if (this.f515u != null) {
                if (this.f515u.f524r == 1) {
                    this.f509d = ((float) this.f516v) * this.f515u.f519a;
                } else {
                    return;
                }
            }
            if (this.f517w != null) {
                if (this.f517w.f524r == 1) {
                    this.f514t = ((float) this.f518x) * this.f517w.f519a;
                } else {
                    return;
                }
            }
            if (this.f512g == 1 && (this.f508c == null || this.f508c.f524r == 1)) {
                if (this.f508c == null) {
                    this.f510e = this;
                    this.f511f = this.f509d;
                } else {
                    this.f510e = this.f508c.f510e;
                    this.f511f = this.f508c.f511f + this.f509d;
                }
                mo359g();
            } else if (this.f512g == 2 && this.f508c != null && this.f508c.f524r == 1 && this.f513s != null && this.f513s.f508c != null && this.f513s.f508c.f524r == 1) {
                if (C0090e.m454a() != null) {
                    C0090e.m454a().f592w++;
                }
                this.f510e = this.f508c.f510e;
                this.f513s.f510e = this.f513s.f508c.f510e;
                boolean z = this.f506a.f247e == C0060e.C0064c.RIGHT || this.f506a.f247e == C0060e.C0064c.BOTTOM;
                float f4 = z ? this.f508c.f511f - this.f513s.f508c.f511f : this.f513s.f508c.f511f - this.f508c.f511f;
                if (this.f506a.f247e == C0060e.C0064c.LEFT || this.f506a.f247e == C0060e.C0064c.RIGHT) {
                    f = f4 - ((float) this.f506a.f246d.mo171M());
                    f2 = this.f506a.f246d.f395at;
                } else {
                    f = f4 - ((float) this.f506a.f246d.mo175Q());
                    f2 = this.f506a.f246d.f396au;
                }
                int e = this.f506a.mo122e();
                int e2 = this.f513s.f506a.mo122e();
                if (this.f506a.mo124g() == this.f513s.f506a.mo124g()) {
                    f3 = 0.5f;
                    i = 0;
                } else {
                    i2 = e;
                    int i3 = e2;
                    f3 = f2;
                    i = i3;
                }
                float f5 = (f - ((float) i2)) - ((float) i);
                if (z) {
                    this.f513s.f511f = ((float) i) + this.f513s.f508c.f511f + (f5 * f3);
                    this.f511f = (this.f508c.f511f - ((float) i2)) - (f5 * (1.0f - f3));
                } else {
                    this.f511f = ((float) i2) + this.f508c.f511f + (f5 * f3);
                    this.f513s.f511f = (this.f513s.f508c.f511f - ((float) i)) - (f5 * (1.0f - f3));
                }
                mo359g();
                this.f513s.mo359g();
            } else if (this.f512g == 3 && this.f508c != null && this.f508c.f524r == 1 && this.f513s != null && this.f513s.f508c != null && this.f513s.f508c.f524r == 1) {
                if (C0090e.m454a() != null) {
                    C0090e.m454a().f593x++;
                }
                this.f510e = this.f508c.f510e;
                this.f513s.f510e = this.f513s.f508c.f510e;
                this.f511f = this.f508c.f511f + this.f509d;
                this.f513s.f511f = this.f513s.f508c.f511f + this.f513s.f509d;
                mo359g();
                this.f513s.mo359g();
            } else if (this.f512g == 5) {
                this.f506a.f246d.mo93d();
            }
        }
    }

    /* renamed from: a */
    public void mo341a(int i, C0081o oVar, int i2) {
        this.f512g = i;
        this.f508c = oVar;
        this.f509d = (float) i2;
        this.f508c.mo356a((C0083q) this);
    }

    /* renamed from: a */
    public void mo342a(C0081o oVar, float f) {
        if (this.f524r == 0 || !(this.f510e == oVar || this.f511f == f)) {
            this.f510e = oVar;
            this.f511f = f;
            if (this.f524r == 1) {
                mo357e();
            }
            mo359g();
        }
    }

    /* renamed from: a */
    public void mo343a(C0081o oVar, int i) {
        this.f508c = oVar;
        this.f509d = (float) i;
        this.f508c.mo356a((C0083q) this);
    }

    /* renamed from: a */
    public void mo344a(C0081o oVar, int i, C0082p pVar) {
        this.f508c = oVar;
        this.f508c.mo356a((C0083q) this);
        this.f515u = pVar;
        this.f516v = i;
        this.f515u.mo356a((C0083q) this);
    }

    /* renamed from: a */
    public void mo345a(C0082p pVar) {
        if (this.f515u == pVar) {
            this.f515u = null;
            this.f509d = (float) this.f516v;
        } else if (this.f515u == this.f517w) {
            this.f517w = null;
            this.f514t = (float) this.f518x;
        }
        mo340a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo346a(C0090e eVar) {
        C0096h b = this.f506a.mo115b();
        if (this.f510e == null) {
            eVar.mo421b(b, (int) (this.f511f + 0.5f));
        } else {
            eVar.mo425c(b, eVar.mo406a((Object) this.f510e.f506a), (int) (this.f511f + 0.5f), 6);
        }
    }

    /* renamed from: b */
    public void mo347b() {
        super.mo347b();
        this.f508c = null;
        this.f509d = 0.0f;
        this.f515u = null;
        this.f516v = 1;
        this.f517w = null;
        this.f518x = 1;
        this.f510e = null;
        this.f511f = 0.0f;
        this.f507b = 0.0f;
        this.f513s = null;
        this.f514t = 0.0f;
        this.f512g = 0;
    }

    /* renamed from: b */
    public void mo348b(int i) {
        this.f512g = i;
    }

    /* renamed from: b */
    public void mo349b(C0081o oVar, float f) {
        this.f513s = oVar;
        this.f514t = f;
    }

    /* renamed from: b */
    public void mo350b(C0081o oVar, int i, C0082p pVar) {
        this.f513s = oVar;
        this.f517w = pVar;
        this.f518x = i;
    }

    /* renamed from: c */
    public void mo351c() {
        C0060e g = this.f506a.mo124g();
        if (g != null) {
            if (g.mo124g() == this.f506a) {
                this.f512g = 4;
                g.mo103a().f512g = 4;
            }
            int e = this.f506a.mo122e();
            if (this.f506a.f247e == C0060e.C0064c.RIGHT || this.f506a.f247e == C0060e.C0064c.BOTTOM) {
                e = -e;
            }
            mo343a(g.mo103a(), e);
        }
    }

    /* renamed from: d */
    public float mo352d() {
        return this.f511f;
    }

    public String toString() {
        return this.f524r == 1 ? this.f510e == this ? "[" + this.f506a + ", RESOLVED: " + this.f511f + "]  type: " + mo339a(this.f512g) : "[" + this.f506a + ", RESOLVED: " + this.f510e + ":" + this.f511f + "] type: " + mo339a(this.f512g) : "{ " + this.f506a + " UNRESOLVED} type: " + mo339a(this.f512g);
    }
}
