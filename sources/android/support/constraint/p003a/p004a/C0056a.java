package android.support.constraint.p003a.p004a;

import android.support.constraint.p003a.p004a.C0060e;
import android.support.constraint.p003a.p004a.C0070h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: android.support.constraint.a.a.a */
public class C0056a {
    private C0056a() {
    }

    /* renamed from: a */
    private static int m64a(C0070h hVar) {
        int i = -1;
        if (hVar.mo229av() == C0070h.C0073b.MATCH_CONSTRAINT) {
            i = hVar.f385ai == 0 ? (int) (((float) hVar.mo175Q()) * hVar.f384ah) : (int) (((float) hVar.mo175Q()) / hVar.f384ah);
            hVar.mo271r(i);
        } else if (hVar.mo230aw() == C0070h.C0073b.MATCH_CONSTRAINT) {
            i = hVar.f385ai == 1 ? (int) (((float) hVar.mo171M()) * hVar.f384ah) : (int) (((float) hVar.mo171M()) / hVar.f384ah);
            hVar.mo274s(i);
        }
        return i;
    }

    /* renamed from: a */
    private static int m65a(C0070h hVar, int i) {
        int i2 = i * 2;
        C0060e eVar = hVar.f352Z[i2];
        C0060e eVar2 = hVar.f352Z[i2 + 1];
        if (eVar.f248f == null || eVar.f248f.f246d != hVar.f381ae || eVar2.f248f == null || eVar2.f248f.f246d != hVar.f381ae) {
            return 0;
        }
        return (int) ((i == 0 ? hVar.f395at : hVar.f396au) * ((float) (((hVar.f381ae.mo260j(i) - eVar.mo122e()) - eVar2.mo122e()) - hVar.mo260j(i))));
    }

    /* renamed from: a */
    private static int m66a(C0070h hVar, int i, boolean z, int i2) {
        int i3;
        int i4;
        int Q;
        int aj;
        int i5;
        int i6;
        int i7;
        int M;
        int i8;
        int i9;
        C0070h B;
        if (!hVar.f358aF) {
            return 0;
        }
        boolean z2 = hVar.f348Q.f248f != null && i == 1;
        if (z) {
            i3 = i * 2;
            i4 = i3 + 1;
            Q = hVar.mo217aj();
            aj = hVar.mo175Q() - hVar.mo217aj();
        } else {
            int i10 = i * 2;
            i3 = i10 + 1;
            i4 = i10;
            Q = hVar.mo175Q() - hVar.mo217aj();
            aj = hVar.mo217aj();
        }
        if (hVar.f352Z[i4].f248f == null || hVar.f352Z[i3].f248f != null) {
            i5 = 1;
            i6 = i4;
            i7 = i3;
        } else {
            i5 = -1;
            i6 = i3;
            i7 = i4;
        }
        if (z2) {
            i2 -= Q;
        }
        int e = (hVar.f352Z[i7].mo122e() * i5) + m65a(hVar, i);
        int i11 = e + i2;
        int M2 = (i == 0 ? hVar.mo171M() : hVar.mo175Q()) * i5;
        Iterator it = hVar.f352Z[i7].mo103a().f523n.iterator();
        int i12 = 0;
        while (it.hasNext()) {
            i12 = Math.max(i12, m66a(((C0081o) ((C0083q) it.next())).f506a.f246d, i, z, i11));
        }
        Iterator it2 = hVar.f352Z[i6].mo103a().f523n.iterator();
        int i13 = 0;
        while (it2.hasNext()) {
            i13 = Math.max(i13, m66a(((C0081o) ((C0083q) it2.next())).f506a.f246d, i, z, M2 + i11));
        }
        if (z2) {
            M = i13 + aj;
            i8 = i12 - Q;
        } else {
            M = ((i == 0 ? hVar.mo171M() : hVar.mo175Q()) * i5) + i13;
            i8 = i12;
        }
        int i14 = 0;
        if (i == 1) {
            Iterator it3 = hVar.f348Q.mo103a().f523n.iterator();
            while (true) {
                i9 = i14;
                if (!it3.hasNext()) {
                    break;
                }
                C0081o oVar = (C0081o) ((C0083q) it3.next());
                i14 = i5 == 1 ? Math.max(i9, m66a(oVar.f506a.f246d, i, z, Q + i11)) : Math.max(i9, m66a(oVar.f506a.f246d, i, z, (aj * i5) + i11));
            }
            if (hVar.f348Q.mo103a().f523n.size() > 0 && !z2) {
                i9 = i5 == 1 ? i9 + Q : i9 - aj;
            }
        } else {
            i9 = 0;
        }
        int max = Math.max(i8, Math.max(M, i9)) + e;
        int i15 = i2 + e;
        int i16 = i15 + M2;
        if (i5 != -1) {
            int i17 = i16;
            i16 = i15;
            i15 = i17;
        }
        if (z) {
            C0079m.m367a(hVar, i, i16);
            hVar.mo188a(i16, i15, i);
        } else {
            hVar.f343L.mo313a(hVar, i);
            hVar.mo259i(i16, i);
        }
        if (hVar.mo161D(i) == C0070h.C0073b.MATCH_CONSTRAINT && hVar.f384ah != 0.0f) {
            hVar.f343L.mo313a(hVar, i);
        }
        if (hVar.f352Z[i7].f248f == null || hVar.f352Z[i6].f248f == null || hVar.f352Z[i7].f248f.f246d != (B = hVar.mo157B()) || hVar.f352Z[i6].f248f.f246d != B) {
            return max;
        }
        hVar.f343L.mo313a(hVar, i);
        return max;
    }

    /* renamed from: a */
    private static int m67a(C0075j jVar, int i) {
        int i2 = i * 2;
        List<C0070h> a = jVar.mo312a(i);
        int size = a.size();
        int i3 = 0;
        int i4 = 0;
        while (i3 < size) {
            C0070h hVar = a.get(i3);
            i3++;
            i4 = Math.max(i4, m66a(hVar, i, hVar.f352Z[i2 + 1].f248f == null || !(hVar.f352Z[i2].f248f == null || hVar.f352Z[i2 + 1].f248f == null), 0));
        }
        jVar.f459e[i] = i4;
        return i4;
    }

    /* renamed from: a */
    private static void m68a(C0060e eVar) {
        C0081o a = eVar.mo103a();
        if (eVar.f248f != null && eVar.f248f.f248f != eVar) {
            eVar.f248f.mo103a().mo356a((C0083q) a);
        }
    }

    /* renamed from: a */
    private static void m69a(C0070h hVar, int i, int i2) {
        int i3 = i * 2;
        C0060e eVar = hVar.f352Z[i3];
        C0060e eVar2 = hVar.f352Z[i3 + 1];
        if ((eVar.f248f == null || eVar2.f248f == null) ? false : true) {
            C0079m.m367a(hVar, i, m65a(hVar, i) + eVar.mo122e());
        } else if (hVar.f384ah == 0.0f || hVar.mo161D(i) != C0070h.C0073b.MATCH_CONSTRAINT) {
            int x = i2 - hVar.mo284x(i);
            int j = x - hVar.mo260j(i);
            hVar.mo188a(j, x, i);
            C0079m.m367a(hVar, i, j);
        } else {
            int a = m64a(hVar);
            int i4 = (int) hVar.f352Z[i3].mo103a().f511f;
            eVar2.mo103a().f510e = eVar.mo103a();
            eVar2.mo103a().f511f = (float) a;
            eVar2.mo103a().f524r = 1;
            hVar.mo188a(i4, i4 + a, i);
        }
    }

    /* renamed from: a */
    public static void m70a(C0074i iVar) {
        if ((iVar.mo295aB() & 32) != 32) {
            m75b(iVar);
            return;
        }
        iVar.f448bg = true;
        iVar.f443bb = false;
        iVar.f444bc = false;
        iVar.f445bd = false;
        ArrayList<C0070h> arrayList = iVar.f535bi;
        List<C0075j> list = iVar.f442ba;
        boolean z = iVar.mo229av() == C0070h.C0073b.WRAP_CONTENT;
        boolean z2 = iVar.mo230aw() == C0070h.C0073b.WRAP_CONTENT;
        boolean z3 = z || z2;
        list.clear();
        for (C0070h hVar : arrayList) {
            hVar.f343L = null;
            hVar.f360aH = false;
            hVar.mo92c();
        }
        for (C0070h hVar2 : arrayList) {
            if (hVar2.f343L == null && !m74a(hVar2, list, z3)) {
                m75b(iVar);
                iVar.f448bg = false;
                return;
            }
        }
        int i = 0;
        int i2 = 0;
        for (C0075j next : list) {
            i2 = Math.max(i2, m67a(next, 0));
            i = Math.max(i, m67a(next, 1));
        }
        if (z) {
            iVar.mo201a(C0070h.C0073b.FIXED);
            iVar.mo271r(i2);
            iVar.f443bb = true;
            iVar.f444bc = true;
            iVar.f446be = i2;
        }
        if (z2) {
            iVar.mo237b(C0070h.C0073b.FIXED);
            iVar.mo274s(i);
            iVar.f443bb = true;
            iVar.f445bd = true;
            iVar.f447bf = i;
        }
        m72a(list, 0, iVar.mo171M());
        m72a(list, 1, iVar.mo175Q());
    }

    /* renamed from: a */
    private static void m71a(C0074i iVar, C0070h hVar, C0075j jVar) {
        jVar.f458d = false;
        iVar.f448bg = false;
        hVar.f358aF = false;
    }

    /* renamed from: a */
    public static void m72a(List<C0075j> list, int i, int i2) {
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            for (C0070h next : list.get(i3).mo314b(i)) {
                if (next.f358aF) {
                    m69a(next, i, i2);
                }
            }
        }
    }

    /* renamed from: a */
    private static boolean m73a(C0070h hVar, C0075j jVar, List<C0075j> list, boolean z) {
        if (hVar == null) {
            return true;
        }
        hVar.f359aG = false;
        C0074i iVar = (C0074i) hVar.mo157B();
        if (hVar.f343L == null) {
            hVar.f358aF = true;
            jVar.f455a.add(hVar);
            hVar.f343L = jVar;
            if (hVar.f344M.f248f == null && hVar.f346O.f248f == null && hVar.f345N.f248f == null && hVar.f347P.f248f == null && hVar.f348Q.f248f == null && hVar.f351T.f248f == null) {
                m71a(iVar, hVar, jVar);
                if (z) {
                    return false;
                }
            }
            if (!(hVar.f345N.f248f == null || hVar.f347P.f248f == null)) {
                if (iVar.mo230aw() == C0070h.C0073b.WRAP_CONTENT) {
                }
                if (z) {
                    m71a(iVar, hVar, jVar);
                    return false;
                } else if (!(hVar.f345N.f248f.f246d == hVar.mo157B() && hVar.f347P.f248f.f246d == hVar.mo157B())) {
                    m71a(iVar, hVar, jVar);
                }
            }
            if (!(hVar.f344M.f248f == null || hVar.f346O.f248f == null)) {
                if (iVar.mo229av() == C0070h.C0073b.WRAP_CONTENT) {
                }
                if (z) {
                    m71a(iVar, hVar, jVar);
                    return false;
                } else if (!(hVar.f344M.f248f.f246d == hVar.mo157B() && hVar.f346O.f248f.f246d == hVar.mo157B())) {
                    m71a(iVar, hVar, jVar);
                }
            }
            if (((hVar.mo229av() == C0070h.C0073b.MATCH_CONSTRAINT) ^ (hVar.mo230aw() == C0070h.C0073b.MATCH_CONSTRAINT)) && hVar.f384ah != 0.0f) {
                m64a(hVar);
            } else if (hVar.mo229av() == C0070h.C0073b.MATCH_CONSTRAINT || hVar.mo230aw() == C0070h.C0073b.MATCH_CONSTRAINT) {
                m71a(iVar, hVar, jVar);
                if (z) {
                    return false;
                }
            }
            if (((hVar.f344M.f248f == null && hVar.f346O.f248f == null) || ((hVar.f344M.f248f != null && hVar.f344M.f248f.f246d == hVar.f381ae && hVar.f346O.f248f == null) || ((hVar.f346O.f248f != null && hVar.f346O.f248f.f246d == hVar.f381ae && hVar.f344M.f248f == null) || (hVar.f344M.f248f != null && hVar.f344M.f248f.f246d == hVar.f381ae && hVar.f346O.f248f != null && hVar.f346O.f248f.f246d == hVar.f381ae)))) && hVar.f351T.f248f == null && !(hVar instanceof C0076k) && !(hVar instanceof C0078l)) {
                jVar.f460f.add(hVar);
            }
            if (((hVar.f345N.f248f == null && hVar.f347P.f248f == null) || ((hVar.f345N.f248f != null && hVar.f345N.f248f.f246d == hVar.f381ae && hVar.f347P.f248f == null) || ((hVar.f347P.f248f != null && hVar.f347P.f248f.f246d == hVar.f381ae && hVar.f345N.f248f == null) || (hVar.f345N.f248f != null && hVar.f345N.f248f.f246d == hVar.f381ae && hVar.f347P.f248f != null && hVar.f347P.f248f.f246d == hVar.f381ae)))) && hVar.f351T.f248f == null && hVar.f348Q.f248f == null && !(hVar instanceof C0076k) && !(hVar instanceof C0078l)) {
                jVar.f461g.add(hVar);
            }
            if (hVar instanceof C0078l) {
                m71a(iVar, hVar, jVar);
                if (z) {
                    return false;
                }
                C0078l lVar = (C0078l) hVar;
                for (int i = 0; i < lVar.f483aS; i++) {
                    if (!m73a(lVar.f482aR[i], jVar, list, z)) {
                        return false;
                    }
                }
            }
            for (C0060e eVar : hVar.f352Z) {
                if (!(eVar.f248f == null || eVar.f248f.f246d == hVar.mo157B())) {
                    if (eVar.f247e == C0060e.C0064c.CENTER) {
                        m71a(iVar, hVar, jVar);
                        if (z) {
                            return false;
                        }
                    } else {
                        m68a(eVar);
                    }
                    if (!m73a(eVar.f248f.f246d, jVar, list, z)) {
                        return false;
                    }
                }
            }
            return true;
        }
        if (hVar.f343L != jVar) {
            jVar.f455a.addAll(hVar.f343L.f455a);
            jVar.f460f.addAll(hVar.f343L.f460f);
            jVar.f461g.addAll(hVar.f343L.f461g);
            if (!hVar.f343L.f458d) {
                jVar.f458d = false;
            }
            list.remove(hVar.f343L);
            for (C0070h hVar2 : hVar.f343L.f455a) {
                hVar2.f343L = jVar;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m74a(C0070h hVar, List<C0075j> list, boolean z) {
        C0075j jVar = new C0075j(new ArrayList(), true);
        list.add(jVar);
        return m73a(hVar, jVar, list, z);
    }

    /* renamed from: b */
    private static void m75b(C0074i iVar) {
        iVar.f442ba.clear();
        iVar.f442ba.add(0, new C0075j(iVar.f535bi));
    }
}
