package android.support.constraint.p003a;

import android.support.constraint.p003a.C0096h;
import java.util.Arrays;

/* renamed from: android.support.constraint.a.a */
public class C0055a {

    /* renamed from: b */
    private static final boolean f202b = false;

    /* renamed from: c */
    private static final int f203c = -1;

    /* renamed from: d */
    private static final boolean f204d = false;

    /* renamed from: a */
    int f205a = 0;

    /* renamed from: e */
    private final C0087b f206e;

    /* renamed from: f */
    private final C0088c f207f;

    /* renamed from: g */
    private int f208g = 8;

    /* renamed from: h */
    private C0096h f209h = null;

    /* renamed from: i */
    private int[] f210i = new int[this.f208g];

    /* renamed from: j */
    private int[] f211j = new int[this.f208g];

    /* renamed from: k */
    private float[] f212k = new float[this.f208g];

    /* renamed from: l */
    private int f213l = -1;

    /* renamed from: m */
    private int f214m = -1;

    /* renamed from: n */
    private boolean f215n = false;

    C0055a(C0087b bVar, C0088c cVar) {
        this.f206e = bVar;
        this.f207f = cVar;
    }

    /* renamed from: a */
    private boolean m45a(C0096h hVar, C0090e eVar) {
        return hVar.f622r <= 1;
    }

    /* renamed from: a */
    public final float mo67a(C0096h hVar, boolean z) {
        if (this.f209h == hVar) {
            this.f209h = null;
        }
        if (this.f213l == -1) {
            return 0.0f;
        }
        int i = this.f213l;
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f205a) {
            if (this.f210i[i] == hVar.f614i) {
                if (i == this.f213l) {
                    this.f213l = this.f211j[i];
                } else {
                    this.f211j[i3] = this.f211j[i];
                }
                if (z) {
                    hVar.mo446b(this.f206e);
                }
                hVar.f622r--;
                this.f205a--;
                this.f210i[i] = -1;
                if (this.f215n) {
                    this.f214m = i;
                }
                return this.f212k[i];
            }
            i2++;
            int i4 = i;
            i = this.f211j[i];
            i3 = i4;
        }
        return 0.0f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C0096h mo68a(int i) {
        int i2 = this.f213l;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f205a) {
            if (i3 == i) {
                return this.f207f.f545c[this.f210i[i2]];
            }
            i2 = this.f211j[i2];
            i3++;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0096h mo69a(C0090e eVar) {
        C0096h hVar;
        C0096h hVar2 = null;
        boolean z = false;
        int i = 0;
        int i2 = this.f213l;
        float f = 0.0f;
        float f2 = 0.0f;
        C0096h hVar3 = null;
        boolean z2 = false;
        while (i2 != -1 && i < this.f205a) {
            float f3 = this.f212k[i2];
            C0096h hVar4 = this.f207f.f545c[this.f210i[i2]];
            if (f3 < 0.0f) {
                if (f3 > (-0.001f)) {
                    this.f212k[i2] = 0.0f;
                    hVar4.mo446b(this.f206e);
                    f3 = 0.0f;
                }
            } else if (f3 < 0.001f) {
                this.f212k[i2] = 0.0f;
                hVar4.mo446b(this.f206e);
                f3 = 0.0f;
            }
            if (f3 != 0.0f) {
                if (hVar4.f619o == C0096h.C0098a.UNRESTRICTED) {
                    if (hVar2 == null) {
                        z2 = m45a(hVar4, eVar);
                        hVar = hVar4;
                        hVar4 = hVar3;
                    } else if (f2 > f3) {
                        z2 = m45a(hVar4, eVar);
                        hVar = hVar4;
                        hVar4 = hVar3;
                    } else if (!z2 && m45a(hVar4, eVar)) {
                        z2 = true;
                        hVar = hVar4;
                        hVar4 = hVar3;
                    }
                    i++;
                    i2 = this.f211j[i2];
                    hVar2 = hVar;
                    hVar3 = hVar4;
                    f2 = f3;
                } else if (hVar2 == null && f3 < 0.0f) {
                    if (hVar3 == null) {
                        z = m45a(hVar4, eVar);
                        f = f3;
                        f3 = f2;
                        hVar = hVar2;
                    } else if (f > f3) {
                        z = m45a(hVar4, eVar);
                        f = f3;
                        f3 = f2;
                        hVar = hVar2;
                    } else if (!z && m45a(hVar4, eVar)) {
                        z = true;
                        f = f3;
                        f3 = f2;
                        hVar = hVar2;
                    }
                    i++;
                    i2 = this.f211j[i2];
                    hVar2 = hVar;
                    hVar3 = hVar4;
                    f2 = f3;
                }
            }
            f3 = f2;
            hVar4 = hVar3;
            hVar = hVar2;
            i++;
            i2 = this.f211j[i2];
            hVar2 = hVar;
            hVar3 = hVar4;
            f2 = f3;
        }
        return hVar2 != null ? hVar2 : hVar3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0096h mo70a(boolean[] zArr, C0096h hVar) {
        C0096h hVar2;
        C0096h hVar3 = null;
        int i = 0;
        int i2 = this.f213l;
        float f = 0.0f;
        while (i2 != -1 && i < this.f205a) {
            if (this.f212k[i2] < 0.0f) {
                C0096h hVar4 = this.f207f.f545c[this.f210i[i2]];
                if ((zArr == null || !zArr[hVar4.f614i]) && hVar4 != hVar && (hVar4.f619o == C0096h.C0098a.SLACK || hVar4.f619o == C0096h.C0098a.ERROR)) {
                    float f2 = this.f212k[i2];
                    if (f2 < f) {
                        f = f2;
                        hVar2 = hVar4;
                        i++;
                        i2 = this.f211j[i2];
                        hVar3 = hVar2;
                    }
                }
            }
            hVar2 = hVar3;
            i++;
            i2 = this.f211j[i2];
            hVar3 = hVar2;
        }
        return hVar3;
    }

    /* renamed from: a */
    public final void mo71a() {
        int i = this.f213l;
        int i2 = 0;
        while (i != -1 && i2 < this.f205a) {
            C0096h hVar = this.f207f.f545c[this.f210i[i]];
            if (hVar != null) {
                hVar.mo446b(this.f206e);
            }
            i = this.f211j[i];
            i2++;
        }
        this.f213l = -1;
        this.f214m = -1;
        this.f215n = false;
        this.f205a = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo72a(float f) {
        int i = this.f213l;
        int i2 = 0;
        while (i != -1 && i2 < this.f205a) {
            float[] fArr = this.f212k;
            fArr[i] = fArr[i] / f;
            i = this.f211j[i];
            i2++;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo73a(C0087b bVar, C0087b bVar2, boolean z) {
        int i = this.f213l;
        int i2 = 0;
        while (i != -1 && i2 < this.f205a) {
            if (this.f210i[i] == bVar2.f538a.f614i) {
                float f = this.f212k[i];
                mo67a(bVar2.f538a, z);
                C0055a aVar = bVar2.f541d;
                int i3 = aVar.f213l;
                int i4 = 0;
                while (i3 != -1 && i4 < aVar.f205a) {
                    mo76a(this.f207f.f545c[aVar.f210i[i3]], aVar.f212k[i3] * f, z);
                    i3 = aVar.f211j[i3];
                    i4++;
                }
                bVar.f539b += bVar2.f539b * f;
                if (z) {
                    bVar2.f538a.mo446b(bVar);
                }
                i = this.f213l;
                i2 = 0;
            } else {
                i = this.f211j[i];
                i2++;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo74a(C0087b bVar, C0087b[] bVarArr) {
        int i = this.f213l;
        int i2 = 0;
        while (i != -1 && i2 < this.f205a) {
            C0096h hVar = this.f207f.f545c[this.f210i[i]];
            if (hVar.f615j != -1) {
                float f = this.f212k[i];
                mo67a(hVar, true);
                C0087b bVar2 = bVarArr[hVar.f615j];
                if (!bVar2.f542e) {
                    C0055a aVar = bVar2.f541d;
                    int i3 = aVar.f213l;
                    int i4 = 0;
                    while (i3 != -1 && i4 < aVar.f205a) {
                        mo76a(this.f207f.f545c[aVar.f210i[i3]], aVar.f212k[i3] * f, true);
                        i3 = aVar.f211j[i3];
                        i4++;
                    }
                }
                bVar.f539b += bVar2.f539b * f;
                bVar2.f538a.mo446b(bVar);
                i = this.f213l;
                i2 = 0;
            } else {
                i = this.f211j[i];
                i2++;
            }
        }
    }

    /* renamed from: a */
    public final void mo75a(C0096h hVar, float f) {
        if (f == 0.0f) {
            mo67a(hVar, true);
        } else if (this.f213l == -1) {
            this.f213l = 0;
            this.f212k[this.f213l] = f;
            this.f210i[this.f213l] = hVar.f614i;
            this.f211j[this.f213l] = -1;
            hVar.f622r++;
            hVar.mo442a(this.f206e);
            this.f205a++;
            if (!this.f215n) {
                this.f214m++;
                if (this.f214m >= this.f210i.length) {
                    this.f215n = true;
                    this.f214m = this.f210i.length - 1;
                }
            }
        } else {
            int i = this.f213l;
            int i2 = 0;
            int i3 = -1;
            while (i != -1 && i2 < this.f205a) {
                if (this.f210i[i] == hVar.f614i) {
                    this.f212k[i] = f;
                    return;
                }
                if (this.f210i[i] < hVar.f614i) {
                    i3 = i;
                }
                i2++;
                i = this.f211j[i];
            }
            int i4 = this.f214m + 1;
            if (this.f215n) {
                i4 = this.f210i[this.f214m] == -1 ? this.f214m : this.f210i.length;
            }
            if (i4 >= this.f210i.length && this.f205a < this.f210i.length) {
                int i5 = 0;
                while (true) {
                    if (i5 >= this.f210i.length) {
                        break;
                    } else if (this.f210i[i5] == -1) {
                        i4 = i5;
                        break;
                    } else {
                        i5++;
                    }
                }
            }
            if (i4 >= this.f210i.length) {
                i4 = this.f210i.length;
                this.f208g *= 2;
                this.f215n = false;
                this.f214m = i4 - 1;
                this.f212k = Arrays.copyOf(this.f212k, this.f208g);
                this.f210i = Arrays.copyOf(this.f210i, this.f208g);
                this.f211j = Arrays.copyOf(this.f211j, this.f208g);
            }
            this.f210i[i4] = hVar.f614i;
            this.f212k[i4] = f;
            if (i3 != -1) {
                this.f211j[i4] = this.f211j[i3];
                this.f211j[i3] = i4;
            } else {
                this.f211j[i4] = this.f213l;
                this.f213l = i4;
            }
            hVar.f622r++;
            hVar.mo442a(this.f206e);
            this.f205a++;
            if (!this.f215n) {
                this.f214m++;
            }
            if (this.f205a >= this.f210i.length) {
                this.f215n = true;
            }
            if (this.f214m >= this.f210i.length) {
                this.f215n = true;
                this.f214m = this.f210i.length - 1;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo76a(C0096h hVar, float f, boolean z) {
        if (f != 0.0f) {
            if (this.f213l == -1) {
                this.f213l = 0;
                this.f212k[this.f213l] = f;
                this.f210i[this.f213l] = hVar.f614i;
                this.f211j[this.f213l] = -1;
                hVar.f622r++;
                hVar.mo442a(this.f206e);
                this.f205a++;
                if (!this.f215n) {
                    this.f214m++;
                    if (this.f214m >= this.f210i.length) {
                        this.f215n = true;
                        this.f214m = this.f210i.length - 1;
                        return;
                    }
                    return;
                }
                return;
            }
            int i = this.f213l;
            int i2 = 0;
            int i3 = -1;
            while (i != -1 && i2 < this.f205a) {
                if (this.f210i[i] == hVar.f614i) {
                    float[] fArr = this.f212k;
                    fArr[i] = fArr[i] + f;
                    if (this.f212k[i] == 0.0f) {
                        if (i == this.f213l) {
                            this.f213l = this.f211j[i];
                        } else {
                            this.f211j[i3] = this.f211j[i];
                        }
                        if (z) {
                            hVar.mo446b(this.f206e);
                        }
                        if (this.f215n) {
                            this.f214m = i;
                        }
                        hVar.f622r--;
                        this.f205a--;
                        return;
                    }
                    return;
                }
                if (this.f210i[i] < hVar.f614i) {
                    i3 = i;
                }
                i2++;
                i = this.f211j[i];
            }
            int i4 = this.f214m + 1;
            if (this.f215n) {
                i4 = this.f210i[this.f214m] == -1 ? this.f214m : this.f210i.length;
            }
            if (i4 >= this.f210i.length && this.f205a < this.f210i.length) {
                int i5 = 0;
                while (true) {
                    if (i5 >= this.f210i.length) {
                        break;
                    } else if (this.f210i[i5] == -1) {
                        i4 = i5;
                        break;
                    } else {
                        i5++;
                    }
                }
            }
            if (i4 >= this.f210i.length) {
                i4 = this.f210i.length;
                this.f208g *= 2;
                this.f215n = false;
                this.f214m = i4 - 1;
                this.f212k = Arrays.copyOf(this.f212k, this.f208g);
                this.f210i = Arrays.copyOf(this.f210i, this.f208g);
                this.f211j = Arrays.copyOf(this.f211j, this.f208g);
            }
            this.f210i[i4] = hVar.f614i;
            this.f212k[i4] = f;
            if (i3 != -1) {
                this.f211j[i4] = this.f211j[i3];
                this.f211j[i3] = i4;
            } else {
                this.f211j[i4] = this.f213l;
                this.f213l = i4;
            }
            hVar.f622r++;
            hVar.mo442a(this.f206e);
            this.f205a++;
            if (!this.f215n) {
                this.f214m++;
            }
            if (this.f214m >= this.f210i.length) {
                this.f215n = true;
                this.f214m = this.f210i.length - 1;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo77a(C0096h hVar) {
        if (this.f213l == -1) {
            return false;
        }
        int i = this.f213l;
        int i2 = 0;
        while (i != -1 && i2 < this.f205a) {
            if (this.f210i[i] == hVar.f614i) {
                return true;
            }
            i = this.f211j[i];
            i2++;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final float mo78b(int i) {
        int i2 = this.f213l;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f205a) {
            if (i3 == i) {
                return this.f212k[i2];
            }
            i2 = this.f211j[i2];
            i3++;
        }
        return 0.0f;
    }

    /* renamed from: b */
    public final float mo79b(C0096h hVar) {
        int i = this.f213l;
        int i2 = 0;
        while (i != -1 && i2 < this.f205a) {
            if (this.f210i[i] == hVar.f614i) {
                return this.f212k[i];
            }
            i = this.f211j[i];
            i2++;
        }
        return 0.0f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo80b() {
        int i = this.f213l;
        int i2 = 0;
        while (i != -1 && i2 < this.f205a) {
            if (this.f212k[i] > 0.0f) {
                return true;
            }
            i = this.f211j[i];
            i2++;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo81c() {
        int i = this.f213l;
        int i2 = 0;
        while (i != -1 && i2 < this.f205a) {
            float[] fArr = this.f212k;
            fArr[i] = fArr[i] * -1.0f;
            i = this.f211j[i];
            i2++;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C0096h mo82d() {
        if (this.f209h != null) {
            return this.f209h;
        }
        int i = 0;
        C0096h hVar = null;
        int i2 = this.f213l;
        while (true) {
            int i3 = i;
            if (i2 == -1 || i3 >= this.f205a) {
                return hVar;
            }
            if (this.f212k[i2] < 0.0f) {
                C0096h hVar2 = this.f207f.f545c[this.f210i[i2]];
                if (hVar == null || hVar.f616k < hVar2.f616k) {
                    hVar = hVar2;
                }
            }
            i2 = this.f211j[i2];
            i = i3 + 1;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo83e() {
        return 0 + (this.f210i.length * 4 * 3) + 36;
    }

    /* renamed from: f */
    public void mo84f() {
        int i = this.f205a;
        System.out.print("{ ");
        for (int i2 = 0; i2 < i; i2++) {
            C0096h a = mo68a(i2);
            if (a != null) {
                System.out.print(a + " = " + mo78b(i2) + " ");
            }
        }
        System.out.println(" }");
    }

    public String toString() {
        String str = "";
        int i = this.f213l;
        int i2 = 0;
        while (i != -1 && i2 < this.f205a) {
            str = ((str + " -> ") + this.f212k[i] + " : ") + this.f207f.f545c[this.f210i[i]];
            i = this.f211j[i];
            i2++;
        }
        return str;
    }
}
