package android.support.constraint.p003a.p004a;

import android.support.constraint.p003a.C0087b;
import android.support.constraint.p003a.C0090e;
import android.support.constraint.p003a.C0096h;
import android.support.constraint.p003a.p004a.C0070h;
import java.util.ArrayList;

/* renamed from: android.support.constraint.a.a.c */
class C0058c {

    /* renamed from: a */
    private static final boolean f223a = false;

    C0058c() {
    }

    /* renamed from: a */
    static void m84a(C0074i iVar, C0090e eVar, int i) {
        int i2;
        int i3;
        C0059d[] dVarArr;
        if (i == 0) {
            i3 = iVar.f438aW;
            dVarArr = iVar.f441aZ;
            i2 = 0;
        } else {
            i2 = 2;
            i3 = iVar.f439aX;
            dVarArr = iVar.f440aY;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            C0059d dVar = dVarArr[i4];
            dVar.mo102i();
            if (!iVar.mo291F(4)) {
                m85a(iVar, eVar, i, i2, dVar);
            } else if (!C0079m.m370a(iVar, eVar, i, i2, dVar)) {
                m85a(iVar, eVar, i, i2, dVar);
            }
        }
    }

    /* renamed from: a */
    static void m85a(C0074i iVar, C0090e eVar, int i, int i2, C0059d dVar) {
        boolean z;
        boolean z2;
        boolean z3;
        C0070h hVar;
        boolean z4;
        C0070h hVar2;
        C0096h hVar3;
        C0096h hVar4;
        C0060e eVar2;
        C0096h hVar5;
        C0096h hVar6;
        C0060e eVar3;
        C0060e eVar4;
        C0060e eVar5;
        int size;
        C0070h hVar7;
        C0070h hVar8 = dVar.f224a;
        C0070h hVar9 = dVar.f226c;
        C0070h hVar10 = dVar.f225b;
        C0070h hVar11 = dVar.f227d;
        C0070h hVar12 = dVar.f228e;
        float f = dVar.f234k;
        C0070h hVar13 = dVar.f229f;
        C0070h hVar14 = dVar.f230g;
        boolean z5 = iVar.f380ad[i] == C0070h.C0073b.WRAP_CONTENT;
        if (i == 0) {
            boolean z6 = hVar12.f361aI == 0;
            boolean z7 = hVar12.f361aI == 1;
            z3 = hVar12.f361aI == 2;
            z2 = z7;
            z = z6;
            z4 = false;
            hVar = hVar8;
        } else {
            boolean z8 = hVar12.f362aJ == 0;
            boolean z9 = hVar12.f362aJ == 1;
            z3 = hVar12.f362aJ == 2;
            z2 = z9;
            z = z8;
            z4 = false;
            hVar = hVar8;
        }
        while (!z4) {
            C0060e eVar6 = hVar.f352Z[i2];
            int i3 = 4;
            if (z5 || z3) {
                i3 = 1;
            }
            int e = eVar6.mo122e();
            if (!(eVar6.f248f == null || hVar == hVar8)) {
                e += eVar6.f248f.mo122e();
            }
            if (z3 && hVar != hVar8 && hVar != hVar10) {
                i3 = 6;
            } else if (z && z5) {
                i3 = 4;
            }
            if (eVar6.f248f != null) {
                if (hVar == hVar10) {
                    eVar.mo416a(eVar6.f251i, eVar6.f248f.f251i, e, 5);
                } else {
                    eVar.mo416a(eVar6.f251i, eVar6.f248f.f251i, e, 6);
                }
                eVar.mo425c(eVar6.f251i, eVar6.f248f.f251i, e, i3);
            }
            if (z5) {
                if (hVar.mo163E() != 8 && hVar.f380ad[i] == C0070h.C0073b.MATCH_CONSTRAINT) {
                    eVar.mo416a(hVar.f352Z[i2 + 1].f251i, hVar.f352Z[i2].f251i, 0, 5);
                }
                eVar.mo416a(hVar.f352Z[i2].f251i, iVar.f352Z[i2].f251i, 0, 6);
            }
            C0060e eVar7 = hVar.f352Z[i2 + 1].f248f;
            if (eVar7 != null) {
                hVar7 = eVar7.f246d;
                if (hVar7.f352Z[i2].f248f == null || hVar7.f352Z[i2].f248f.f246d != hVar) {
                    hVar7 = null;
                }
            } else {
                hVar7 = null;
            }
            if (hVar7 == null) {
                z4 = true;
                hVar7 = hVar;
            }
            hVar = hVar7;
        }
        if (!(hVar11 == null || hVar9.f352Z[i2 + 1].f248f == null)) {
            C0060e eVar8 = hVar11.f352Z[i2 + 1];
            eVar.mo422b(eVar8.f251i, hVar9.f352Z[i2 + 1].f248f.f251i, -eVar8.mo122e(), 5);
        }
        if (z5) {
            eVar.mo416a(iVar.f352Z[i2 + 1].f251i, hVar9.f352Z[i2 + 1].f251i, hVar9.f352Z[i2 + 1].mo122e(), 6);
        }
        ArrayList<C0070h> arrayList = dVar.f231h;
        if (arrayList != null && (size = arrayList.size()) > 1) {
            C0070h hVar15 = null;
            float f2 = 0.0f;
            float f3 = (!dVar.f235l || dVar.f237n) ? f : (float) dVar.f233j;
            int i4 = 0;
            while (i4 < size) {
                C0070h hVar16 = arrayList.get(i4);
                float f4 = hVar16.f365aM[i];
                if (f4 < 0.0f) {
                    if (dVar.f237n) {
                        eVar.mo425c(hVar16.f352Z[i2 + 1].f251i, hVar16.f352Z[i2].f251i, 0, 4);
                        hVar16 = hVar15;
                        i4++;
                        hVar15 = hVar16;
                    } else {
                        f4 = 1.0f;
                    }
                }
                if (f4 == 0.0f) {
                    eVar.mo425c(hVar16.f352Z[i2 + 1].f251i, hVar16.f352Z[i2].f251i, 0, 6);
                    hVar16 = hVar15;
                } else {
                    if (hVar15 != null) {
                        C0096h hVar17 = hVar15.f352Z[i2].f251i;
                        C0096h hVar18 = hVar15.f352Z[i2 + 1].f251i;
                        C0096h hVar19 = hVar16.f352Z[i2].f251i;
                        C0096h hVar20 = hVar16.f352Z[i2 + 1].f251i;
                        C0087b c = eVar.mo424c();
                        c.mo374a(f2, f3, f4, hVar17, hVar18, hVar19, hVar20);
                        eVar.mo409a(c);
                    }
                    f2 = f4;
                }
                i4++;
                hVar15 = hVar16;
            }
        }
        if (hVar10 != null && (hVar10 == hVar11 || z3)) {
            C0060e eVar9 = hVar8.f352Z[i2];
            C0060e eVar10 = hVar9.f352Z[i2 + 1];
            C0096h hVar21 = hVar8.f352Z[i2].f248f != null ? hVar8.f352Z[i2].f248f.f251i : null;
            C0096h hVar22 = hVar9.f352Z[i2 + 1].f248f != null ? hVar9.f352Z[i2 + 1].f248f.f251i : null;
            if (hVar10 == hVar11) {
                eVar9 = hVar10.f352Z[i2];
                eVar10 = hVar10.f352Z[i2 + 1];
            }
            if (!(hVar21 == null || hVar22 == null)) {
                eVar.mo415a(eVar9.f251i, hVar21, eVar9.mo122e(), i == 0 ? hVar12.f395at : hVar12.f396au, hVar22, eVar10.f251i, eVar10.mo122e(), 5);
            }
        } else if (z && hVar10 != null) {
            boolean z10 = dVar.f233j > 0 && dVar.f232i == dVar.f233j;
            C0070h hVar23 = hVar10;
            C0070h hVar24 = hVar10;
            while (hVar24 != null) {
                C0070h hVar25 = hVar24.f367aO[i];
                while (hVar25 != null && hVar25.mo163E() == 8) {
                    hVar25 = hVar25.f367aO[i];
                }
                if (hVar25 != null || hVar24 == hVar11) {
                    C0060e eVar11 = hVar24.f352Z[i2];
                    C0096h hVar26 = eVar11.f251i;
                    C0096h hVar27 = eVar11.f248f != null ? eVar11.f248f.f251i : null;
                    if (hVar23 != hVar24) {
                        hVar27 = hVar23.f352Z[i2 + 1].f251i;
                    } else if (hVar24 == hVar10 && hVar23 == hVar24) {
                        hVar27 = hVar8.f352Z[i2].f248f != null ? hVar8.f352Z[i2].f248f.f251i : null;
                    }
                    C0096h hVar28 = null;
                    int e2 = eVar11.mo122e();
                    int e3 = hVar24.f352Z[i2 + 1].mo122e();
                    if (hVar25 != null) {
                        eVar3 = hVar25.f352Z[i2];
                        hVar6 = eVar3.f251i;
                        hVar5 = hVar24.f352Z[i2 + 1].f251i;
                    } else {
                        C0060e eVar12 = hVar9.f352Z[i2 + 1].f248f;
                        if (eVar12 != null) {
                            hVar28 = eVar12.f251i;
                        }
                        hVar5 = hVar24.f352Z[i2 + 1].f251i;
                        hVar6 = hVar28;
                        eVar3 = eVar12;
                    }
                    if (eVar3 != null) {
                        e3 += eVar3.mo122e();
                    }
                    if (hVar23 != null) {
                        e2 += hVar23.f352Z[i2 + 1].mo122e();
                    }
                    if (!(hVar26 == null || hVar27 == null || hVar6 == null || hVar5 == null)) {
                        if (hVar24 == hVar10) {
                            e2 = hVar10.f352Z[i2].mo122e();
                        }
                        if (hVar24 == hVar11) {
                            e3 = hVar11.f352Z[i2 + 1].mo122e();
                        }
                        int i5 = 4;
                        if (z10) {
                            i5 = 6;
                        }
                        eVar.mo415a(hVar26, hVar27, e2, 0.5f, hVar6, hVar5, e3, i5);
                    }
                }
                hVar23 = hVar24.mo163E() != 8 ? hVar24 : hVar23;
                hVar24 = hVar25;
            }
        } else if (z2 && hVar10 != null) {
            boolean z11 = dVar.f233j > 0 && dVar.f232i == dVar.f233j;
            C0070h hVar29 = hVar10;
            for (C0070h hVar30 = hVar10; hVar30 != null; hVar30 = hVar2) {
                C0070h hVar31 = hVar30.f367aO[i];
                while (hVar31 != null && hVar31.mo163E() == 8) {
                    hVar31 = hVar31.f367aO[i];
                }
                if (hVar30 == hVar10 || hVar30 == hVar11 || hVar31 == null) {
                    hVar2 = hVar31;
                } else {
                    hVar2 = hVar31 == hVar11 ? null : hVar31;
                    C0060e eVar13 = hVar30.f352Z[i2];
                    C0096h hVar32 = eVar13.f251i;
                    if (eVar13.f248f != null) {
                        C0096h hVar33 = eVar13.f248f.f251i;
                    }
                    C0096h hVar34 = hVar29.f352Z[i2 + 1].f251i;
                    C0096h hVar35 = null;
                    int e4 = eVar13.mo122e();
                    int e5 = hVar30.f352Z[i2 + 1].mo122e();
                    if (hVar2 != null) {
                        C0060e eVar14 = hVar2.f352Z[i2];
                        hVar4 = eVar14.f251i;
                        hVar3 = eVar14.f248f != null ? eVar14.f248f.f251i : null;
                        eVar2 = eVar14;
                    } else {
                        C0060e eVar15 = hVar30.f352Z[i2 + 1].f248f;
                        if (eVar15 != null) {
                            hVar35 = eVar15.f251i;
                        }
                        hVar3 = hVar30.f352Z[i2 + 1].f251i;
                        hVar4 = hVar35;
                        eVar2 = eVar15;
                    }
                    if (eVar2 != null) {
                        e5 += eVar2.mo122e();
                    }
                    if (hVar29 != null) {
                        e4 += hVar29.f352Z[i2 + 1].mo122e();
                    }
                    int i6 = 4;
                    if (z11) {
                        i6 = 6;
                    }
                    if (!(hVar32 == null || hVar34 == null || hVar4 == null || hVar3 == null)) {
                        eVar.mo415a(hVar32, hVar34, e4, 0.5f, hVar4, hVar3, e5, i6);
                    }
                }
                hVar29 = hVar30.mo163E() != 8 ? hVar30 : hVar29;
            }
            C0060e eVar16 = hVar10.f352Z[i2];
            C0060e eVar17 = hVar8.f352Z[i2].f248f;
            C0060e eVar18 = hVar11.f352Z[i2 + 1];
            C0060e eVar19 = hVar9.f352Z[i2 + 1].f248f;
            if (eVar17 != null) {
                if (hVar10 != hVar11) {
                    eVar.mo425c(eVar16.f251i, eVar17.f251i, eVar16.mo122e(), 5);
                } else if (eVar19 != null) {
                    eVar.mo415a(eVar16.f251i, eVar17.f251i, eVar16.mo122e(), 0.5f, eVar18.f251i, eVar19.f251i, eVar18.mo122e(), 5);
                }
            }
            if (!(eVar19 == null || hVar10 == hVar11)) {
                eVar.mo425c(eVar18.f251i, eVar19.f251i, -eVar18.mo122e(), 5);
            }
        }
        if ((z || z2) && hVar10 != null) {
            C0060e eVar20 = hVar10.f352Z[i2];
            C0060e eVar21 = hVar11.f352Z[i2 + 1];
            C0096h hVar36 = eVar20.f248f != null ? eVar20.f248f.f251i : null;
            C0096h hVar37 = eVar21.f248f != null ? eVar21.f248f.f251i : null;
            if (hVar9 != hVar11) {
                C0060e eVar22 = hVar9.f352Z[i2 + 1];
                hVar37 = eVar22.f248f != null ? eVar22.f248f.f251i : null;
            }
            if (hVar10 == hVar11) {
                eVar5 = hVar10.f352Z[i2];
                eVar4 = hVar10.f352Z[i2 + 1];
            } else {
                eVar4 = eVar21;
                eVar5 = eVar20;
            }
            if (hVar36 != null && hVar37 != null) {
                eVar.mo415a(eVar5.f251i, hVar36, eVar5.mo122e(), 0.5f, hVar37, eVar4.f251i, (hVar11 == null ? hVar9 : hVar11).f352Z[i2 + 1].mo122e(), 5);
            }
        }
    }
}
