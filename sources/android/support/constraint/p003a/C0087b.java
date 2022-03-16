package android.support.constraint.p003a;

import android.support.constraint.p003a.C0090e;
import android.support.constraint.p003a.C0096h;

/* renamed from: android.support.constraint.a.b */
public class C0087b implements C0090e.C0091a {

    /* renamed from: f */
    private static final boolean f536f = false;

    /* renamed from: g */
    private static final float f537g = 0.001f;

    /* renamed from: a */
    C0096h f538a = null;

    /* renamed from: b */
    float f539b = 0.0f;

    /* renamed from: c */
    boolean f540c = false;

    /* renamed from: d */
    public final C0055a f541d;

    /* renamed from: e */
    boolean f542e = false;

    public C0087b(C0088c cVar) {
        this.f541d = new C0055a(this, cVar);
    }

    /* renamed from: a */
    public C0087b mo373a(float f, float f2, float f3, C0096h hVar, int i, C0096h hVar2, int i2, C0096h hVar3, int i3, C0096h hVar4, int i4) {
        if (f2 == 0.0f || f == f3) {
            this.f539b = (float) (((-i) - i2) + i3 + i4);
            this.f541d.mo75a(hVar, 1.0f);
            this.f541d.mo75a(hVar2, -1.0f);
            this.f541d.mo75a(hVar4, 1.0f);
            this.f541d.mo75a(hVar3, -1.0f);
        } else {
            float f4 = (f / f2) / (f3 / f2);
            this.f539b = ((float) ((-i) - i2)) + (((float) i3) * f4) + (((float) i4) * f4);
            this.f541d.mo75a(hVar, 1.0f);
            this.f541d.mo75a(hVar2, -1.0f);
            this.f541d.mo75a(hVar4, f4);
            this.f541d.mo75a(hVar3, -f4);
        }
        return this;
    }

    /* renamed from: a */
    public C0087b mo374a(float f, float f2, float f3, C0096h hVar, C0096h hVar2, C0096h hVar3, C0096h hVar4) {
        this.f539b = 0.0f;
        if (f2 == 0.0f || f == f3) {
            this.f541d.mo75a(hVar, 1.0f);
            this.f541d.mo75a(hVar2, -1.0f);
            this.f541d.mo75a(hVar4, 1.0f);
            this.f541d.mo75a(hVar3, -1.0f);
        } else if (f == 0.0f) {
            this.f541d.mo75a(hVar, 1.0f);
            this.f541d.mo75a(hVar2, -1.0f);
        } else if (f3 == 0.0f) {
            this.f541d.mo75a(hVar3, 1.0f);
            this.f541d.mo75a(hVar4, -1.0f);
        } else {
            float f4 = (f / f2) / (f3 / f2);
            this.f541d.mo75a(hVar, 1.0f);
            this.f541d.mo75a(hVar2, -1.0f);
            this.f541d.mo75a(hVar4, f4);
            this.f541d.mo75a(hVar3, -f4);
        }
        return this;
    }

    /* renamed from: a */
    public C0087b mo375a(C0090e eVar, int i) {
        this.f541d.mo75a(eVar.mo405a(i, "ep"), 1.0f);
        this.f541d.mo75a(eVar.mo405a(i, "em"), -1.0f);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0087b mo376a(C0096h hVar, int i) {
        this.f538a = hVar;
        hVar.f617l = (float) i;
        this.f539b = (float) i;
        this.f542e = true;
        return this;
    }

    /* renamed from: a */
    public C0087b mo377a(C0096h hVar, int i, C0096h hVar2) {
        this.f539b = (float) i;
        this.f541d.mo75a(hVar, -1.0f);
        return this;
    }

    /* renamed from: a */
    public C0087b mo378a(C0096h hVar, C0096h hVar2, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f539b = (float) i;
        }
        if (!z) {
            this.f541d.mo75a(hVar, -1.0f);
            this.f541d.mo75a(hVar2, 1.0f);
        } else {
            this.f541d.mo75a(hVar, 1.0f);
            this.f541d.mo75a(hVar2, -1.0f);
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0087b mo379a(C0096h hVar, C0096h hVar2, int i, float f, C0096h hVar3, C0096h hVar4, int i2) {
        if (hVar2 == hVar3) {
            this.f541d.mo75a(hVar, 1.0f);
            this.f541d.mo75a(hVar4, 1.0f);
            this.f541d.mo75a(hVar2, -2.0f);
        } else if (f == 0.5f) {
            this.f541d.mo75a(hVar, 1.0f);
            this.f541d.mo75a(hVar2, -1.0f);
            this.f541d.mo75a(hVar3, -1.0f);
            this.f541d.mo75a(hVar4, 1.0f);
            if (i > 0 || i2 > 0) {
                this.f539b = (float) ((-i) + i2);
            }
        } else if (f <= 0.0f) {
            this.f541d.mo75a(hVar, -1.0f);
            this.f541d.mo75a(hVar2, 1.0f);
            this.f539b = (float) i;
        } else if (f >= 1.0f) {
            this.f541d.mo75a(hVar3, -1.0f);
            this.f541d.mo75a(hVar4, 1.0f);
            this.f539b = (float) i2;
        } else {
            this.f541d.mo75a(hVar, (1.0f - f) * 1.0f);
            this.f541d.mo75a(hVar2, (1.0f - f) * -1.0f);
            this.f541d.mo75a(hVar3, -1.0f * f);
            this.f541d.mo75a(hVar4, 1.0f * f);
            if (i > 0 || i2 > 0) {
                this.f539b = (((float) (-i)) * (1.0f - f)) + (((float) i2) * f);
            }
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0087b mo380a(C0096h hVar, C0096h hVar2, C0096h hVar3, float f) {
        this.f541d.mo75a(hVar, -1.0f);
        this.f541d.mo75a(hVar2, 1.0f - f);
        this.f541d.mo75a(hVar3, f);
        return this;
    }

    /* renamed from: a */
    public C0087b mo381a(C0096h hVar, C0096h hVar2, C0096h hVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f539b = (float) i;
        }
        if (!z) {
            this.f541d.mo75a(hVar, -1.0f);
            this.f541d.mo75a(hVar2, 1.0f);
            this.f541d.mo75a(hVar3, 1.0f);
        } else {
            this.f541d.mo75a(hVar, 1.0f);
            this.f541d.mo75a(hVar2, -1.0f);
            this.f541d.mo75a(hVar3, -1.0f);
        }
        return this;
    }

    /* renamed from: a */
    public C0087b mo382a(C0096h hVar, C0096h hVar2, C0096h hVar3, C0096h hVar4, float f) {
        this.f541d.mo75a(hVar, -1.0f);
        this.f541d.mo75a(hVar2, 1.0f);
        this.f541d.mo75a(hVar3, f);
        this.f541d.mo75a(hVar4, -f);
        return this;
    }

    /* renamed from: a */
    public C0096h mo383a(C0090e eVar, boolean[] zArr) {
        return this.f541d.mo70a(zArr, (C0096h) null);
    }

    /* renamed from: a */
    public void mo384a(C0090e.C0091a aVar) {
        if (aVar instanceof C0087b) {
            C0087b bVar = (C0087b) aVar;
            this.f538a = null;
            this.f541d.mo71a();
            for (int i = 0; i < bVar.f541d.f205a; i++) {
                this.f541d.mo76a(bVar.f541d.mo68a(i), bVar.f541d.mo78b(i), true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo385a() {
        return this.f538a != null && (this.f538a.f619o == C0096h.C0098a.UNRESTRICTED || this.f539b >= 0.0f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo386a(C0090e eVar) {
        boolean z = false;
        C0096h a = this.f541d.mo69a(eVar);
        if (a == null) {
            z = true;
        } else {
            mo395c(a);
        }
        if (this.f541d.f205a == 0) {
            this.f542e = true;
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo387a(C0096h hVar) {
        return this.f541d.mo77a(hVar);
    }

    /* renamed from: b */
    public C0087b mo388b(C0096h hVar, int i) {
        if (i < 0) {
            this.f539b = (float) (i * -1);
            this.f541d.mo75a(hVar, 1.0f);
        } else {
            this.f539b = (float) i;
            this.f541d.mo75a(hVar, -1.0f);
        }
        return this;
    }

    /* renamed from: b */
    public C0087b mo389b(C0096h hVar, C0096h hVar2, C0096h hVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f539b = (float) i;
        }
        if (!z) {
            this.f541d.mo75a(hVar, -1.0f);
            this.f541d.mo75a(hVar2, 1.0f);
            this.f541d.mo75a(hVar3, -1.0f);
        } else {
            this.f541d.mo75a(hVar, 1.0f);
            this.f541d.mo75a(hVar2, -1.0f);
            this.f541d.mo75a(hVar3, 1.0f);
        }
        return this;
    }

    /* renamed from: b */
    public C0087b mo390b(C0096h hVar, C0096h hVar2, C0096h hVar3, C0096h hVar4, float f) {
        this.f541d.mo75a(hVar3, 0.5f);
        this.f541d.mo75a(hVar4, 0.5f);
        this.f541d.mo75a(hVar, -0.5f);
        this.f541d.mo75a(hVar2, -0.5f);
        this.f539b = -f;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0096h mo391b(C0096h hVar) {
        return this.f541d.mo70a((boolean[]) null, hVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo392b() {
        String str;
        boolean z;
        float f;
        String str2 = (this.f538a == null ? "" + "0" : "" + this.f538a) + " = ";
        if (this.f539b != 0.0f) {
            str = str2 + this.f539b;
            z = true;
        } else {
            str = str2;
            z = false;
        }
        int i = this.f541d.f205a;
        String str3 = str;
        for (int i2 = 0; i2 < i; i2++) {
            C0096h a = this.f541d.mo68a(i2);
            if (a != null) {
                float b = this.f541d.mo78b(i2);
                if (b != 0.0f) {
                    String hVar = a.toString();
                    if (!z) {
                        if (b < 0.0f) {
                            str3 = str3 + "- ";
                            f = b * -1.0f;
                        } else {
                            f = b;
                        }
                    } else if (b > 0.0f) {
                        str3 = str3 + " + ";
                        f = b;
                    } else {
                        str3 = str3 + " - ";
                        f = b * -1.0f;
                    }
                    str3 = f == 1.0f ? str3 + hVar : str3 + f + " " + hVar;
                    z = true;
                }
            }
        }
        return !z ? str3 + "0.0" : str3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C0087b mo393c(C0096h hVar, int i) {
        this.f541d.mo75a(hVar, (float) i);
        return this;
    }

    /* renamed from: c */
    public void mo394c() {
        this.f538a = null;
        this.f541d.mo71a();
        this.f539b = 0.0f;
        this.f542e = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo395c(C0096h hVar) {
        if (this.f538a != null) {
            this.f541d.mo75a(this.f538a, -1.0f);
            this.f538a = null;
        }
        float a = this.f541d.mo67a(hVar, true) * -1.0f;
        this.f538a = hVar;
        if (a != 1.0f) {
            this.f539b /= a;
            this.f541d.mo72a(a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo396d() {
        int i = 0;
        if (this.f538a != null) {
            i = 4;
        }
        return i + 4 + 4 + this.f541d.mo83e();
    }

    /* renamed from: d */
    public void mo397d(C0096h hVar) {
        float f = 1.0f;
        if (hVar.f616k != 1) {
            if (hVar.f616k == 2) {
                f = 1000.0f;
            } else if (hVar.f616k == 3) {
                f = 1000000.0f;
            } else if (hVar.f616k == 4) {
                f = 1.0E9f;
            } else if (hVar.f616k == 5) {
                f = 1.0E12f;
            }
        }
        this.f541d.mo75a(hVar, f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo398e() {
        if (this.f539b < 0.0f) {
            this.f539b *= -1.0f;
            this.f541d.mo81c();
        }
    }

    /* renamed from: f */
    public boolean mo399f() {
        return this.f538a == null && this.f539b == 0.0f && this.f541d.f205a == 0;
    }

    /* renamed from: g */
    public void mo400g() {
        this.f541d.mo71a();
        this.f538a = null;
        this.f539b = 0.0f;
    }

    /* renamed from: h */
    public C0096h mo401h() {
        return this.f538a;
    }

    public String toString() {
        return mo392b();
    }
}
