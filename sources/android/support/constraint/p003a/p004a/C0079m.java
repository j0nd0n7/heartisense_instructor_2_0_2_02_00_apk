package android.support.constraint.p003a.p004a;

import android.support.constraint.p003a.C0090e;
import android.support.constraint.p003a.p004a.C0070h;

/* renamed from: android.support.constraint.a.a.m */
public class C0079m {

    /* renamed from: a */
    public static final int f484a = 0;

    /* renamed from: b */
    public static final int f485b = 1;

    /* renamed from: c */
    public static final int f486c = 2;

    /* renamed from: d */
    public static final int f487d = 4;

    /* renamed from: e */
    public static final int f488e = 8;

    /* renamed from: f */
    public static final int f489f = 16;

    /* renamed from: g */
    public static final int f490g = 32;

    /* renamed from: h */
    public static final int f491h = 7;

    /* renamed from: i */
    static boolean[] f492i = new boolean[3];

    /* renamed from: j */
    static final int f493j = 0;

    /* renamed from: k */
    static final int f494k = 1;

    /* renamed from: l */
    static final int f495l = 2;

    /* renamed from: a */
    static void m366a(int i, C0070h hVar) {
        boolean z = false;
        hVar.mo275t();
        C0081o a = hVar.f344M.mo103a();
        C0081o a2 = hVar.f345N.mo103a();
        C0081o a3 = hVar.f346O.mo103a();
        C0081o a4 = hVar.f347P.mo103a();
        boolean z2 = (i & 8) == 8;
        boolean z3 = hVar.f380ad[0] == C0070h.C0073b.MATCH_CONSTRAINT && m369a(hVar, 0);
        if (!(a.f512g == 4 || a3.f512g == 4)) {
            if (hVar.f380ad[0] == C0070h.C0073b.FIXED || (z3 && hVar.mo163E() == 8)) {
                if (hVar.f344M.f248f == null && hVar.f346O.f248f == null) {
                    a.mo348b(1);
                    a3.mo348b(1);
                    if (z2) {
                        a3.mo344a(a, 1, hVar.mo280v());
                    } else {
                        a3.mo343a(a, hVar.mo171M());
                    }
                } else if (hVar.f344M.f248f != null && hVar.f346O.f248f == null) {
                    a.mo348b(1);
                    a3.mo348b(1);
                    if (z2) {
                        a3.mo344a(a, 1, hVar.mo280v());
                    } else {
                        a3.mo343a(a, hVar.mo171M());
                    }
                } else if (hVar.f344M.f248f == null && hVar.f346O.f248f != null) {
                    a.mo348b(1);
                    a3.mo348b(1);
                    a.mo343a(a3, -hVar.mo171M());
                    if (z2) {
                        a.mo344a(a3, -1, hVar.mo280v());
                    } else {
                        a.mo343a(a3, -hVar.mo171M());
                    }
                } else if (!(hVar.f344M.f248f == null || hVar.f346O.f248f == null)) {
                    a.mo348b(2);
                    a3.mo348b(2);
                    if (z2) {
                        hVar.mo280v().mo356a((C0083q) a);
                        hVar.mo280v().mo356a((C0083q) a3);
                        a.mo350b(a3, -1, hVar.mo280v());
                        a3.mo350b(a, 1, hVar.mo280v());
                    } else {
                        a.mo349b(a3, (float) (-hVar.mo171M()));
                        a3.mo349b(a, (float) hVar.mo171M());
                    }
                }
            } else if (z3) {
                int M = hVar.mo171M();
                a.mo348b(1);
                a3.mo348b(1);
                if (hVar.f344M.f248f == null && hVar.f346O.f248f == null) {
                    if (z2) {
                        a3.mo344a(a, 1, hVar.mo280v());
                    } else {
                        a3.mo343a(a, M);
                    }
                } else if (hVar.f344M.f248f == null || hVar.f346O.f248f != null) {
                    if (hVar.f344M.f248f != null || hVar.f346O.f248f == null) {
                        if (!(hVar.f344M.f248f == null || hVar.f346O.f248f == null)) {
                            if (z2) {
                                hVar.mo280v().mo356a((C0083q) a);
                                hVar.mo280v().mo356a((C0083q) a3);
                            }
                            if (hVar.f384ah == 0.0f) {
                                a.mo348b(3);
                                a3.mo348b(3);
                                a.mo349b(a3, 0.0f);
                                a3.mo349b(a, 0.0f);
                            } else {
                                a.mo348b(2);
                                a3.mo348b(2);
                                a.mo349b(a3, (float) (-M));
                                a3.mo349b(a, (float) M);
                                hVar.mo271r(M);
                            }
                        }
                    } else if (z2) {
                        a.mo344a(a3, -1, hVar.mo280v());
                    } else {
                        a.mo343a(a3, -M);
                    }
                } else if (z2) {
                    a3.mo344a(a, 1, hVar.mo280v());
                } else {
                    a3.mo343a(a, M);
                }
            }
        }
        if (hVar.f380ad[1] == C0070h.C0073b.MATCH_CONSTRAINT && m369a(hVar, 1)) {
            z = true;
        }
        if (a2.f512g != 4 && a4.f512g != 4) {
            if (hVar.f380ad[1] == C0070h.C0073b.FIXED || (z && hVar.mo163E() == 8)) {
                if (hVar.f345N.f248f == null && hVar.f347P.f248f == null) {
                    a2.mo348b(1);
                    a4.mo348b(1);
                    if (z2) {
                        a4.mo344a(a2, 1, hVar.mo282w());
                    } else {
                        a4.mo343a(a2, hVar.mo175Q());
                    }
                    if (hVar.f348Q.f248f != null) {
                        hVar.f348Q.mo103a().mo348b(1);
                        a2.mo341a(1, hVar.f348Q.mo103a(), -hVar.f392ap);
                    }
                } else if (hVar.f345N.f248f != null && hVar.f347P.f248f == null) {
                    a2.mo348b(1);
                    a4.mo348b(1);
                    if (z2) {
                        a4.mo344a(a2, 1, hVar.mo282w());
                    } else {
                        a4.mo343a(a2, hVar.mo175Q());
                    }
                    if (hVar.f392ap > 0) {
                        hVar.f348Q.mo103a().mo341a(1, a2, hVar.f392ap);
                    }
                } else if (hVar.f345N.f248f == null && hVar.f347P.f248f != null) {
                    a2.mo348b(1);
                    a4.mo348b(1);
                    if (z2) {
                        a2.mo344a(a4, -1, hVar.mo282w());
                    } else {
                        a2.mo343a(a4, -hVar.mo175Q());
                    }
                    if (hVar.f392ap > 0) {
                        hVar.f348Q.mo103a().mo341a(1, a2, hVar.f392ap);
                    }
                } else if (hVar.f345N.f248f != null && hVar.f347P.f248f != null) {
                    a2.mo348b(2);
                    a4.mo348b(2);
                    if (z2) {
                        a2.mo350b(a4, -1, hVar.mo282w());
                        a4.mo350b(a2, 1, hVar.mo282w());
                        hVar.mo282w().mo356a((C0083q) a2);
                        hVar.mo280v().mo356a((C0083q) a4);
                    } else {
                        a2.mo349b(a4, (float) (-hVar.mo175Q()));
                        a4.mo349b(a2, (float) hVar.mo175Q());
                    }
                    if (hVar.f392ap > 0) {
                        hVar.f348Q.mo103a().mo341a(1, a2, hVar.f392ap);
                    }
                }
            } else if (z) {
                int Q = hVar.mo175Q();
                a2.mo348b(1);
                a4.mo348b(1);
                if (hVar.f345N.f248f == null && hVar.f347P.f248f == null) {
                    if (z2) {
                        a4.mo344a(a2, 1, hVar.mo282w());
                    } else {
                        a4.mo343a(a2, Q);
                    }
                } else if (hVar.f345N.f248f == null || hVar.f347P.f248f != null) {
                    if (hVar.f345N.f248f != null || hVar.f347P.f248f == null) {
                        if (hVar.f345N.f248f != null && hVar.f347P.f248f != null) {
                            if (z2) {
                                hVar.mo282w().mo356a((C0083q) a2);
                                hVar.mo280v().mo356a((C0083q) a4);
                            }
                            if (hVar.f384ah == 0.0f) {
                                a2.mo348b(3);
                                a4.mo348b(3);
                                a2.mo349b(a4, 0.0f);
                                a4.mo349b(a2, 0.0f);
                                return;
                            }
                            a2.mo348b(2);
                            a4.mo348b(2);
                            a2.mo349b(a4, (float) (-Q));
                            a4.mo349b(a2, (float) Q);
                            hVar.mo274s(Q);
                            if (hVar.f392ap > 0) {
                                hVar.f348Q.mo103a().mo341a(1, a2, hVar.f392ap);
                            }
                        }
                    } else if (z2) {
                        a2.mo344a(a4, -1, hVar.mo282w());
                    } else {
                        a2.mo343a(a4, -Q);
                    }
                } else if (z2) {
                    a4.mo344a(a2, 1, hVar.mo282w());
                } else {
                    a4.mo343a(a2, Q);
                }
            }
        }
    }

    /* renamed from: a */
    static void m367a(C0070h hVar, int i, int i2) {
        int i3 = i * 2;
        int i4 = i3 + 1;
        hVar.f352Z[i3].mo103a().f510e = hVar.mo157B().f344M.mo103a();
        hVar.f352Z[i3].mo103a().f511f = (float) i2;
        hVar.f352Z[i3].mo103a().f524r = 1;
        hVar.f352Z[i4].mo103a().f510e = hVar.f352Z[i3].mo103a();
        hVar.f352Z[i4].mo103a().f511f = (float) hVar.mo260j(i);
        hVar.f352Z[i4].mo103a().f524r = 1;
    }

    /* renamed from: a */
    static void m368a(C0074i iVar, C0090e eVar, C0070h hVar) {
        if (iVar.f380ad[0] != C0070h.C0073b.WRAP_CONTENT && hVar.f380ad[0] == C0070h.C0073b.MATCH_PARENT) {
            int i = hVar.f344M.f249g;
            int M = iVar.mo171M() - hVar.f346O.f249g;
            hVar.f344M.f251i = eVar.mo406a((Object) hVar.f344M);
            hVar.f346O.f251i = eVar.mo406a((Object) hVar.f346O);
            eVar.mo421b(hVar.f344M.f251i, i);
            eVar.mo421b(hVar.f346O.f251i, M);
            hVar.f406u = 2;
            hVar.mo255g(i, M);
        }
        if (iVar.f380ad[1] != C0070h.C0073b.WRAP_CONTENT && hVar.f380ad[1] == C0070h.C0073b.MATCH_PARENT) {
            int i2 = hVar.f345N.f249g;
            int Q = iVar.mo175Q() - hVar.f347P.f249g;
            hVar.f345N.f251i = eVar.mo406a((Object) hVar.f345N);
            hVar.f347P.f251i = eVar.mo406a((Object) hVar.f347P);
            eVar.mo421b(hVar.f345N.f251i, i2);
            eVar.mo421b(hVar.f347P.f251i, Q);
            if (hVar.f392ap > 0 || hVar.mo163E() == 8) {
                hVar.f348Q.f251i = eVar.mo406a((Object) hVar.f348Q);
                eVar.mo421b(hVar.f348Q.f251i, hVar.f392ap + i2);
            }
            hVar.f407v = 2;
            hVar.mo257h(i2, Q);
        }
    }

    /* renamed from: a */
    private static boolean m369a(C0070h hVar, int i) {
        char c = 1;
        if (hVar.f380ad[i] != C0070h.C0073b.MATCH_CONSTRAINT) {
            return false;
        }
        if (hVar.f384ah != 0.0f) {
            C0070h.C0073b[] bVarArr = hVar.f380ad;
            if (i != 0) {
                c = 0;
            }
            if (bVarArr[c] == C0070h.C0073b.MATCH_CONSTRAINT) {
            }
            return false;
        }
        if (i == 0) {
            if (!(hVar.f410y == 0 && hVar.f333B == 0 && hVar.f334C == 0)) {
                return false;
            }
        } else if (!(hVar.f411z == 0 && hVar.f336E == 0 && hVar.f337F == 0)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    static boolean m370a(C0074i iVar, C0090e eVar, int i, int i2, C0059d dVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        C0070h hVar;
        float f;
        float f2;
        int i3;
        C0070h hVar2;
        C0070h hVar3 = dVar.f224a;
        C0070h hVar4 = dVar.f226c;
        C0070h hVar5 = dVar.f225b;
        C0070h hVar6 = dVar.f227d;
        C0070h hVar7 = dVar.f228e;
        boolean z6 = false;
        int i4 = 0;
        float f3 = dVar.f234k;
        C0070h hVar8 = dVar.f229f;
        C0070h hVar9 = dVar.f230g;
        if (iVar.f380ad[i] == C0070h.C0073b.WRAP_CONTENT) {
        }
        if (i == 0) {
            z = hVar7.f361aI == 0;
            z2 = hVar7.f361aI == 1;
            z3 = hVar7.f361aI == 2;
        } else {
            z = hVar7.f362aJ == 0;
            z2 = hVar7.f362aJ == 1;
            z3 = hVar7.f362aJ == 2;
        }
        float f4 = 0.0f;
        float f5 = 0.0f;
        int i5 = 0;
        C0070h hVar10 = hVar3;
        while (!z6) {
            if (hVar10.mo163E() != 8) {
                i3 = i5 + 1;
                float M = i == 0 ? ((float) hVar10.mo171M()) + f4 : ((float) hVar10.mo175Q()) + f4;
                if (hVar10 != hVar5) {
                    M += (float) hVar10.f352Z[i2].mo122e();
                }
                if (hVar10 != hVar6) {
                    M += (float) hVar10.f352Z[i2 + 1].mo122e();
                }
                f5 = f5 + ((float) hVar10.f352Z[i2].mo122e()) + ((float) hVar10.f352Z[i2 + 1].mo122e());
                f4 = M;
            } else {
                i3 = i5;
            }
            C0060e eVar2 = hVar10.f352Z[i2];
            if (hVar10.mo163E() != 8 && hVar10.f380ad[i] == C0070h.C0073b.MATCH_CONSTRAINT) {
                int i6 = i4 + 1;
                if (i == 0) {
                    if (!(hVar10.f410y == 0 && hVar10.f333B == 0 && hVar10.f334C == 0)) {
                        return false;
                    }
                } else if (!(hVar10.f411z == 0 && hVar10.f336E == 0 && hVar10.f337F == 0)) {
                    return false;
                }
                if (hVar10.f384ah != 0.0f) {
                    return false;
                }
                i4 = i6;
            }
            C0060e eVar3 = hVar10.f352Z[i2 + 1].f248f;
            if (eVar3 != null) {
                hVar2 = eVar3.f246d;
                if (hVar2.f352Z[i2].f248f == null || hVar2.f352Z[i2].f248f.f246d != hVar10) {
                    hVar2 = null;
                }
            } else {
                hVar2 = null;
            }
            if (hVar2 == null) {
                z6 = true;
                hVar2 = hVar10;
            }
            hVar10 = hVar2;
            i5 = i3;
        }
        C0081o a = hVar3.f352Z[i2].mo103a();
        C0081o a2 = hVar4.f352Z[i2 + 1].mo103a();
        if (a.f508c == null || a2.f508c == null || a.f508c.f524r != 1 || a2.f508c.f524r != 1) {
            return false;
        }
        if (i4 > 0 && i4 != i5) {
            return false;
        }
        float f6 = 0.0f;
        if (z3 || z || z2) {
            if (hVar5 != null) {
                f6 = (float) hVar5.f352Z[i2].mo122e();
            }
            if (hVar6 != null) {
                f6 += (float) hVar6.f352Z[i2 + 1].mo122e();
            }
        }
        float f7 = a.f508c.f511f;
        float f8 = a2.f508c.f511f;
        float f9 = f7 < f8 ? (f8 - f7) - f4 : (f7 - f8) - f4;
        if (i4 <= 0 || i4 != i5) {
            if (f9 < 0.0f) {
                z3 = true;
                z4 = false;
                z5 = false;
            } else {
                z4 = z2;
                z5 = z;
            }
            if (z3) {
                float k = f7 + ((f9 - f6) * hVar3.mo261k(i));
                while (hVar3 != null) {
                    if (C0090e.f547h != null) {
                        C0090e.f547h.f567B--;
                        C0090e.f547h.f588s++;
                        C0090e.f547h.f594y++;
                    }
                    C0070h hVar11 = hVar3.f367aO[i];
                    if (hVar11 != null || hVar3 == hVar4) {
                        float M2 = i == 0 ? (float) hVar3.mo171M() : (float) hVar3.mo175Q();
                        float e = k + ((float) hVar3.f352Z[i2].mo122e());
                        hVar3.f352Z[i2].mo103a().mo342a(a.f510e, e);
                        hVar3.f352Z[i2 + 1].mo103a().mo342a(a.f510e, e + M2);
                        hVar3.f352Z[i2].mo103a().mo346a(eVar);
                        hVar3.f352Z[i2 + 1].mo103a().mo346a(eVar);
                        f = M2 + e + ((float) hVar3.f352Z[i2 + 1].mo122e());
                    } else {
                        f = k;
                    }
                    k = f;
                    hVar3 = hVar11;
                }
            } else if (z5 || z4) {
                float f10 = z5 ? f9 - f6 : z4 ? f9 - f6 : f9;
                float f11 = f10 / ((float) (i5 + 1));
                if (z4) {
                    f11 = i5 > 1 ? f10 / ((float) (i5 - 1)) : f10 / 2.0f;
                }
                float f12 = hVar3.mo163E() != 8 ? f7 + f11 : f7;
                if (z4 && i5 > 1) {
                    f12 = ((float) hVar5.f352Z[i2].mo122e()) + f7;
                }
                if (!z5 || hVar5 == null) {
                    hVar = hVar3;
                } else {
                    f12 += (float) hVar5.f352Z[i2].mo122e();
                    hVar = hVar3;
                }
                while (hVar != null) {
                    if (C0090e.f547h != null) {
                        C0090e.f547h.f567B--;
                        C0090e.f547h.f588s++;
                        C0090e.f547h.f594y++;
                    }
                    C0070h hVar12 = hVar.f367aO[i];
                    if (hVar12 != null || hVar == hVar4) {
                        float M3 = i == 0 ? (float) hVar.mo171M() : (float) hVar.mo175Q();
                        if (hVar != hVar5) {
                            f12 += (float) hVar.f352Z[i2].mo122e();
                        }
                        hVar.f352Z[i2].mo103a().mo342a(a.f510e, f12);
                        hVar.f352Z[i2 + 1].mo103a().mo342a(a.f510e, f12 + M3);
                        hVar.f352Z[i2].mo103a().mo346a(eVar);
                        hVar.f352Z[i2 + 1].mo103a().mo346a(eVar);
                        f12 += M3 + ((float) hVar.f352Z[i2 + 1].mo122e());
                        if (!(hVar12 == null || hVar12.mo163E() == 8)) {
                            f12 += f11;
                        }
                    }
                    hVar = hVar12;
                }
            }
            return true;
        } else if (hVar10.mo157B() != null && hVar10.mo157B().f380ad[i] == C0070h.C0073b.WRAP_CONTENT) {
            return false;
        } else {
            float f13 = (f9 + f4) - f5;
            float f14 = f7;
            while (hVar3 != null) {
                if (C0090e.f547h != null) {
                    C0090e.f547h.f567B--;
                    C0090e.f547h.f588s++;
                    C0090e.f547h.f594y++;
                }
                C0070h hVar13 = hVar3.f367aO[i];
                if (hVar13 != null || hVar3 == hVar4) {
                    float f15 = f13 / ((float) i4);
                    if (f3 > 0.0f) {
                        f15 = hVar3.f365aM[i] == -1.0f ? 0.0f : (hVar3.f365aM[i] * f13) / f3;
                    }
                    if (hVar3.mo163E() == 8) {
                        f15 = 0.0f;
                    }
                    float e2 = f14 + ((float) hVar3.f352Z[i2].mo122e());
                    hVar3.f352Z[i2].mo103a().mo342a(a.f510e, e2);
                    hVar3.f352Z[i2 + 1].mo103a().mo342a(a.f510e, e2 + f15);
                    hVar3.f352Z[i2].mo103a().mo346a(eVar);
                    hVar3.f352Z[i2 + 1].mo103a().mo346a(eVar);
                    f2 = f15 + e2 + ((float) hVar3.f352Z[i2 + 1].mo122e());
                } else {
                    f2 = f14;
                }
                f14 = f2;
                hVar3 = hVar13;
            }
            return true;
        }
    }
}
