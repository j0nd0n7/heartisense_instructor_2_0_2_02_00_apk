package android.support.p010v4.p013c;

import android.graphics.Rect;
import android.os.Build;
import android.support.p010v4.p013c.C0404t;
import android.support.p010v4.p033o.C0876a;
import android.support.p010v4.view.C1040ar;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: android.support.v4.c.ar */
class C0227ar {

    /* renamed from: a */
    private static final int[] f1335a = {0, 3, 0, 1, 5, 4, 7, 6};

    /* renamed from: android.support.v4.c.ar$a */
    static class C0232a {

        /* renamed from: a */
        public C0186ad f1361a;

        /* renamed from: b */
        public boolean f1362b;

        /* renamed from: c */
        public C0404t f1363c;

        /* renamed from: d */
        public C0186ad f1364d;

        /* renamed from: e */
        public boolean f1365e;

        /* renamed from: f */
        public C0404t f1366f;

        C0232a() {
        }
    }

    C0227ar() {
    }

    /* renamed from: a */
    private static C0232a m1424a(C0232a aVar, SparseArray<C0232a> sparseArray, int i) {
        if (aVar != null) {
            return aVar;
        }
        C0232a aVar2 = new C0232a();
        sparseArray.put(i, aVar2);
        return aVar2;
    }

    /* renamed from: a */
    private static C0876a<String, String> m1425a(int i, ArrayList<C0404t> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        ArrayList<String> arrayList3;
        ArrayList<String> arrayList4;
        C0876a<String, String> aVar = new C0876a<>();
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            C0404t tVar = arrayList.get(i4);
            if (tVar.mo1691f(i)) {
                boolean booleanValue = arrayList2.get(i4).booleanValue();
                if (tVar.f1896B != null) {
                    int size = tVar.f1896B.size();
                    if (booleanValue) {
                        arrayList3 = tVar.f1896B;
                        arrayList4 = tVar.f1897C;
                    } else {
                        ArrayList<String> arrayList5 = tVar.f1896B;
                        arrayList3 = tVar.f1897C;
                        arrayList4 = arrayList5;
                    }
                    for (int i5 = 0; i5 < size; i5++) {
                        String str = arrayList4.get(i5);
                        String str2 = arrayList3.get(i5);
                        String remove = aVar.remove(str2);
                        if (remove != null) {
                            aVar.put(str, remove);
                        } else {
                            aVar.put(str, str2);
                        }
                    }
                }
            }
        }
        return aVar;
    }

    /* renamed from: a */
    private static Object m1428a(C0186ad adVar, C0186ad adVar2, boolean z) {
        if (adVar == null || adVar2 == null) {
            return null;
        }
        return C0233as.m1476b(C0233as.m1455a(z ? adVar2.mo809V() : adVar.mo808U()));
    }

    /* renamed from: a */
    private static Object m1429a(C0186ad adVar, boolean z) {
        if (adVar == null) {
            return null;
        }
        return C0233as.m1455a(z ? adVar.mo807T() : adVar.mo804Q());
    }

    /* renamed from: a */
    private static Object m1430a(ViewGroup viewGroup, View view, C0876a<String, String> aVar, C0232a aVar2, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        final Rect rect;
        final View view2 = null;
        final C0186ad adVar = aVar2.f1361a;
        final C0186ad adVar2 = aVar2.f1364d;
        if (adVar != null) {
            adVar.mo798K().setVisibility(0);
        }
        if (adVar == null || adVar2 == null) {
            return null;
        }
        final boolean z = aVar2.f1362b;
        Object a = aVar.isEmpty() ? null : m1428a(adVar, adVar2, z);
        C0876a<String, View> b = m1445b(aVar, a, aVar2);
        final C0876a<String, View> c = m1454c(aVar, a, aVar2);
        if (aVar.isEmpty()) {
            if (b != null) {
                b.clear();
            }
            if (c != null) {
                c.clear();
                obj3 = null;
            } else {
                obj3 = null;
            }
        } else {
            m1444a(arrayList, b, (Collection<String>) aVar.keySet());
            m1444a(arrayList2, c, aVar.values());
            obj3 = a;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        m1450b(adVar, adVar2, z, b, true);
        if (obj3 != null) {
            arrayList2.add(view);
            C0233as.m1466a(obj3, view, arrayList);
            m1442a(obj3, obj2, b, aVar2.f1365e, aVar2.f1366f);
            rect = new Rect();
            view2 = m1446b(c, aVar2, obj, z);
            if (view2 != null) {
                C0233as.m1464a(obj, rect);
            }
        } else {
            rect = null;
        }
        C0328bs.m1968a(viewGroup, new Runnable() {
            public void run() {
                C0227ar.m1450b(adVar, adVar2, z, (C0876a<String, View>) c, false);
                if (view2 != null) {
                    C0233as.m1459a(view2, rect);
                }
            }
        });
        return obj3;
    }

    /* renamed from: a */
    private static Object m1431a(Object obj, Object obj2, Object obj3, C0186ad adVar, boolean z) {
        boolean z2 = true;
        if (!(obj == null || obj2 == null || adVar == null)) {
            z2 = z ? adVar.mo811X() : adVar.mo810W();
        }
        return z2 ? C0233as.m1456a(obj2, obj, obj3) : C0233as.m1477b(obj2, obj, obj3);
    }

    /* renamed from: a */
    private static String m1432a(C0876a<String, String> aVar, String str) {
        int size = aVar.size();
        for (int i = 0; i < size; i++) {
            if (str.equals(aVar.mo2968c(i))) {
                return aVar.mo2967b(i);
            }
        }
        return null;
    }

    /* renamed from: a */
    private static void m1435a(C0205aj ajVar, int i, C0232a aVar, View view, C0876a<String, String> aVar2) {
        ViewGroup viewGroup = null;
        if (ajVar.f1263v.mo927a()) {
            viewGroup = (ViewGroup) ajVar.f1263v.mo926a(i);
        }
        if (viewGroup != null) {
            C0186ad adVar = aVar.f1361a;
            C0186ad adVar2 = aVar.f1364d;
            boolean z = aVar.f1362b;
            boolean z2 = aVar.f1365e;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Object a = m1429a(adVar, z);
            Object b = m1447b(adVar2, z2);
            Object a2 = m1430a(viewGroup, view, aVar2, aVar, (ArrayList<View>) arrayList2, (ArrayList<View>) arrayList, a, b);
            if (a != null || a2 != null || b != null) {
                ArrayList<View> b2 = m1449b(b, adVar2, (ArrayList<View>) arrayList2, view);
                ArrayList<View> b3 = m1449b(a, adVar, (ArrayList<View>) arrayList, view);
                m1453b(b3, 4);
                Object a3 = m1431a(a, b, a2, adVar, z);
                if (a3 != null) {
                    m1441a(b, adVar2, b2);
                    ArrayList<String> a4 = C0233as.m1458a((ArrayList<View>) arrayList);
                    C0233as.m1467a(a3, a, b3, b, b2, a2, arrayList);
                    C0233as.m1462a(viewGroup, a3);
                    C0233as.m1460a(viewGroup, arrayList2, arrayList, a4, aVar2);
                    m1453b(b3, 0);
                    C0233as.m1469a(a2, (ArrayList<View>) arrayList2, (ArrayList<View>) arrayList);
                }
            }
        }
    }

    /* renamed from: a */
    static void m1436a(C0205aj ajVar, ArrayList<C0404t> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, boolean z) {
        if (ajVar.f1261t >= 1 && Build.VERSION.SDK_INT >= 21) {
            SparseArray sparseArray = new SparseArray();
            for (int i3 = i; i3 < i2; i3++) {
                C0404t tVar = arrayList.get(i3);
                if (arrayList2.get(i3).booleanValue()) {
                    m1452b(tVar, (SparseArray<C0232a>) sparseArray, z);
                } else {
                    m1438a(tVar, (SparseArray<C0232a>) sparseArray, z);
                }
            }
            if (sparseArray.size() != 0) {
                View view = new View(ajVar.f1262u.mo1049i());
                int size = sparseArray.size();
                for (int i4 = 0; i4 < size; i4++) {
                    int keyAt = sparseArray.keyAt(i4);
                    C0876a<String, String> a = m1425a(keyAt, arrayList, arrayList2, i, i2);
                    C0232a aVar = (C0232a) sparseArray.valueAt(i4);
                    if (z) {
                        m1435a(ajVar, keyAt, aVar, view, a);
                    } else {
                        m1451b(ajVar, keyAt, aVar, view, a);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static void m1437a(C0404t tVar, C0404t.C0405a aVar, SparseArray<C0232a> sparseArray, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        C0232a aVar2;
        C0232a aVar3;
        C0186ad adVar = aVar.f1916b;
        int i = adVar.f1136P;
        if (i != 0) {
            switch (z ? f1335a[aVar.f1915a] : aVar.f1915a) {
                case 1:
                case 7:
                    z3 = true;
                    z4 = false;
                    z5 = false;
                    z6 = z2 ? adVar.f1154ah : !adVar.f1124D && !adVar.f1138R;
                    break;
                case 3:
                case 6:
                    z3 = false;
                    z4 = z2 ? !adVar.f1124D && adVar.f1146Z != null && adVar.f1146Z.getVisibility() == 0 && adVar.f1156aj >= 0.0f : adVar.f1124D && !adVar.f1138R;
                    z5 = true;
                    z6 = false;
                    break;
                case 4:
                    z3 = false;
                    z4 = z2 ? adVar.f1155ai && adVar.f1124D && adVar.f1138R : adVar.f1124D && !adVar.f1138R;
                    z5 = true;
                    z6 = false;
                    break;
                case 5:
                    z3 = true;
                    z4 = false;
                    z5 = false;
                    z6 = z2 ? adVar.f1155ai && !adVar.f1138R && adVar.f1124D : adVar.f1138R;
                    break;
                default:
                    z3 = false;
                    z4 = false;
                    z5 = false;
                    z6 = false;
                    break;
            }
            C0232a aVar4 = sparseArray.get(i);
            if (z6) {
                aVar2 = m1424a(aVar4, sparseArray, i);
                aVar2.f1361a = adVar;
                aVar2.f1362b = z;
                aVar2.f1363c = tVar;
            } else {
                aVar2 = aVar4;
            }
            if (!z2 && z3) {
                if (aVar2 != null && aVar2.f1364d == adVar) {
                    aVar2.f1364d = null;
                }
                C0205aj ajVar = tVar.f1899c;
                if (adVar.f1157u < 1 && ajVar.f1261t >= 1 && !tVar.f1898D) {
                    ajVar.mo1140f(adVar);
                    ajVar.mo1109a(adVar, 1, 0, 0, false);
                }
            }
            if (!z4 || !(aVar2 == null || aVar2.f1364d == null)) {
                aVar3 = aVar2;
            } else {
                aVar3 = m1424a(aVar2, sparseArray, i);
                aVar3.f1364d = adVar;
                aVar3.f1365e = z;
                aVar3.f1366f = tVar;
            }
            if (!z2 && z5 && aVar3 != null && aVar3.f1361a == adVar) {
                aVar3.f1361a = null;
            }
        }
    }

    /* renamed from: a */
    public static void m1438a(C0404t tVar, SparseArray<C0232a> sparseArray, boolean z) {
        int size = tVar.f1900l.size();
        for (int i = 0; i < size; i++) {
            m1437a(tVar, tVar.f1900l.get(i), sparseArray, false, z);
        }
    }

    /* renamed from: a */
    private static void m1439a(C0876a<String, String> aVar, C0876a<String, View> aVar2) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            if (!aVar2.containsKey(aVar.mo2968c(size))) {
                aVar.mo2972d(size);
            }
        }
    }

    /* renamed from: a */
    private static void m1440a(ViewGroup viewGroup, C0186ad adVar, View view, ArrayList<View> arrayList, Object obj, ArrayList<View> arrayList2, Object obj2, ArrayList<View> arrayList3) {
        final Object obj3 = obj;
        final View view2 = view;
        final C0186ad adVar2 = adVar;
        final ArrayList<View> arrayList4 = arrayList;
        final ArrayList<View> arrayList5 = arrayList2;
        final ArrayList<View> arrayList6 = arrayList3;
        final Object obj4 = obj2;
        C0328bs.m1968a(viewGroup, new Runnable() {
            public void run() {
                if (obj3 != null) {
                    C0233as.m1482c(obj3, view2);
                    arrayList5.addAll(C0227ar.m1449b(obj3, adVar2, (ArrayList<View>) arrayList4, view2));
                }
                if (arrayList6 != null) {
                    if (obj4 != null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(view2);
                        C0233as.m1481b(obj4, (ArrayList<View>) arrayList6, (ArrayList<View>) arrayList);
                    }
                    arrayList6.clear();
                    arrayList6.add(view2);
                }
            }
        });
    }

    /* renamed from: a */
    private static void m1441a(Object obj, C0186ad adVar, final ArrayList<View> arrayList) {
        if (adVar != null && obj != null && adVar.f1124D && adVar.f1138R && adVar.f1155ai) {
            adVar.mo909o(true);
            C0233as.m1480b(obj, adVar.mo798K(), arrayList);
            C0328bs.m1968a(adVar.f1145Y, new Runnable() {
                public void run() {
                    C0227ar.m1453b((ArrayList<View>) arrayList, 4);
                }
            });
        }
    }

    /* renamed from: a */
    private static void m1442a(Object obj, Object obj2, C0876a<String, View> aVar, boolean z, C0404t tVar) {
        if (tVar.f1896B != null && !tVar.f1896B.isEmpty()) {
            View view = aVar.get(z ? tVar.f1897C.get(0) : tVar.f1896B.get(0));
            C0233as.m1465a(obj, view);
            if (obj2 != null) {
                C0233as.m1465a(obj2, view);
            }
        }
    }

    /* renamed from: a */
    private static void m1444a(ArrayList<View> arrayList, C0876a<String, View> aVar, Collection<String> collection) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View c = aVar.mo2968c(size);
            if (collection.contains(C1040ar.m5863M(c))) {
                arrayList.add(c);
            }
        }
    }

    /* renamed from: b */
    private static C0876a<String, View> m1445b(C0876a<String, String> aVar, Object obj, C0232a aVar2) {
        ArrayList<String> arrayList;
        C0357cc ccVar;
        if (aVar.isEmpty() || obj == null) {
            aVar.clear();
            return null;
        }
        C0186ad adVar = aVar2.f1364d;
        C0876a<String, View> aVar3 = new C0876a<>();
        C0233as.m1472a((Map<String, View>) aVar3, adVar.mo798K());
        C0404t tVar = aVar2.f1366f;
        if (aVar2.f1365e) {
            C0357cc an = adVar.mo857an();
            arrayList = tVar.f1897C;
            ccVar = an;
        } else {
            C0357cc ao = adVar.mo858ao();
            arrayList = tVar.f1896B;
            ccVar = ao;
        }
        aVar3.mo2787c(arrayList);
        if (ccVar != null) {
            ccVar.mo1618a((List<String>) arrayList, (Map<String, View>) aVar3);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = arrayList.get(size);
                View view = aVar3.get(str);
                if (view == null) {
                    aVar.remove(str);
                } else if (!str.equals(C1040ar.m5863M(view))) {
                    aVar.put(C1040ar.m5863M(view), aVar.remove(str));
                }
            }
        } else {
            aVar.mo2787c(aVar3.keySet());
        }
        return aVar3;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static View m1446b(C0876a<String, View> aVar, C0232a aVar2, Object obj, boolean z) {
        C0404t tVar = aVar2.f1363c;
        if (obj == null || aVar == null || tVar.f1896B == null || tVar.f1896B.isEmpty()) {
            return null;
        }
        return aVar.get(z ? tVar.f1896B.get(0) : tVar.f1897C.get(0));
    }

    /* renamed from: b */
    private static Object m1447b(C0186ad adVar, boolean z) {
        if (adVar == null) {
            return null;
        }
        return C0233as.m1455a(z ? adVar.mo805R() : adVar.mo806S());
    }

    /* renamed from: b */
    private static Object m1448b(ViewGroup viewGroup, View view, C0876a<String, String> aVar, C0232a aVar2, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        final Object obj3;
        final Rect rect;
        final C0186ad adVar = aVar2.f1361a;
        final C0186ad adVar2 = aVar2.f1364d;
        if (adVar == null || adVar2 == null) {
            return null;
        }
        final boolean z = aVar2.f1362b;
        Object a = aVar.isEmpty() ? null : m1428a(adVar, adVar2, z);
        C0876a<String, View> b = m1445b(aVar, a, aVar2);
        if (aVar.isEmpty()) {
            obj3 = null;
        } else {
            arrayList.addAll(b.values());
            obj3 = a;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        m1450b(adVar, adVar2, z, b, true);
        if (obj3 != null) {
            rect = new Rect();
            C0233as.m1466a(obj3, view, arrayList);
            m1442a(obj3, obj2, b, aVar2.f1365e, aVar2.f1366f);
            if (obj != null) {
                C0233as.m1464a(obj, rect);
            }
        } else {
            rect = null;
        }
        final C0876a<String, String> aVar3 = aVar;
        final C0232a aVar4 = aVar2;
        final ArrayList<View> arrayList3 = arrayList2;
        final View view2 = view;
        final ArrayList<View> arrayList4 = arrayList;
        final Object obj4 = obj;
        C0328bs.m1968a(viewGroup, new Runnable() {
            public void run() {
                C0876a a = C0227ar.m1454c(aVar3, obj3, aVar4);
                if (a != null) {
                    arrayList3.addAll(a.values());
                    arrayList3.add(view2);
                }
                C0227ar.m1450b(adVar, adVar2, z, (C0876a<String, View>) a, false);
                if (obj3 != null) {
                    C0233as.m1469a(obj3, (ArrayList<View>) arrayList4, (ArrayList<View>) arrayList3);
                    View a2 = C0227ar.m1446b((C0876a<String, View>) a, aVar4, obj4, z);
                    if (a2 != null) {
                        C0233as.m1459a(a2, rect);
                    }
                }
            }
        });
        return obj3;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static ArrayList<View> m1449b(Object obj, C0186ad adVar, ArrayList<View> arrayList, View view) {
        ArrayList<View> arrayList2 = null;
        if (obj != null) {
            arrayList2 = new ArrayList<>();
            View K = adVar.mo798K();
            if (K != null) {
                C0233as.m1470a(arrayList2, K);
            }
            if (arrayList != null) {
                arrayList2.removeAll(arrayList);
            }
            if (!arrayList2.isEmpty()) {
                arrayList2.add(view);
                C0233as.m1468a(obj, arrayList2);
            }
        }
        return arrayList2;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m1450b(C0186ad adVar, C0186ad adVar2, boolean z, C0876a<String, View> aVar, boolean z2) {
        C0357cc an = z ? adVar2.mo857an() : adVar.mo857an();
        if (an != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = aVar == null ? 0 : aVar.size();
            for (int i = 0; i < size; i++) {
                arrayList2.add(aVar.mo2967b(i));
                arrayList.add(aVar.mo2968c(i));
            }
            if (z2) {
                an.mo1617a((List<String>) arrayList2, (List<View>) arrayList, (List<View>) null);
            } else {
                an.mo1619b(arrayList2, arrayList, (List<View>) null);
            }
        }
    }

    /* renamed from: b */
    private static void m1451b(C0205aj ajVar, int i, C0232a aVar, View view, C0876a<String, String> aVar2) {
        ViewGroup viewGroup = null;
        if (ajVar.f1263v.mo927a()) {
            viewGroup = (ViewGroup) ajVar.f1263v.mo926a(i);
        }
        if (viewGroup != null) {
            C0186ad adVar = aVar.f1361a;
            C0186ad adVar2 = aVar.f1364d;
            boolean z = aVar.f1362b;
            boolean z2 = aVar.f1365e;
            Object a = m1429a(adVar, z);
            Object b = m1447b(adVar2, z2);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Object b2 = m1448b(viewGroup, view, aVar2, aVar, arrayList, arrayList2, a, b);
            if (a != null || b2 != null || b != null) {
                ArrayList<View> b3 = m1449b(b, adVar2, (ArrayList<View>) arrayList, view);
                Object obj = (b3 == null || b3.isEmpty()) ? null : b;
                C0233as.m1479b(a, view);
                Object a2 = m1431a(a, obj, b2, adVar, aVar.f1362b);
                if (a2 != null) {
                    ArrayList arrayList3 = new ArrayList();
                    C0233as.m1467a(a2, a, arrayList3, obj, b3, b2, arrayList2);
                    m1440a(viewGroup, adVar, view, (ArrayList<View>) arrayList2, a, (ArrayList<View>) arrayList3, obj, b3);
                    C0233as.m1461a((View) viewGroup, (ArrayList<View>) arrayList2, (Map<String, String>) aVar2);
                    C0233as.m1462a(viewGroup, a2);
                    C0233as.m1463a(viewGroup, (ArrayList<View>) arrayList2, (Map<String, String>) aVar2);
                }
            }
        }
    }

    /* renamed from: b */
    public static void m1452b(C0404t tVar, SparseArray<C0232a> sparseArray, boolean z) {
        if (tVar.f1899c.f1263v.mo927a()) {
            for (int size = tVar.f1900l.size() - 1; size >= 0; size--) {
                m1437a(tVar, tVar.f1900l.get(size), sparseArray, true, z);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m1453b(ArrayList<View> arrayList, int i) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).setVisibility(i);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static C0876a<String, View> m1454c(C0876a<String, String> aVar, Object obj, C0232a aVar2) {
        ArrayList<String> arrayList;
        C0357cc ccVar;
        String a;
        C0186ad adVar = aVar2.f1361a;
        View K = adVar.mo798K();
        if (aVar.isEmpty() || obj == null || K == null) {
            aVar.clear();
            return null;
        }
        C0876a<String, View> aVar3 = new C0876a<>();
        C0233as.m1472a((Map<String, View>) aVar3, K);
        C0404t tVar = aVar2.f1363c;
        if (aVar2.f1362b) {
            C0357cc ao = adVar.mo858ao();
            arrayList = tVar.f1896B;
            ccVar = ao;
        } else {
            C0357cc an = adVar.mo857an();
            arrayList = tVar.f1897C;
            ccVar = an;
        }
        if (arrayList != null) {
            aVar3.mo2787c(arrayList);
        }
        if (ccVar != null) {
            ccVar.mo1618a((List<String>) arrayList, (Map<String, View>) aVar3);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = arrayList.get(size);
                View view = aVar3.get(str);
                if (view == null) {
                    String a2 = m1432a(aVar, str);
                    if (a2 != null) {
                        aVar.remove(a2);
                    }
                } else if (!str.equals(C1040ar.m5863M(view)) && (a = m1432a(aVar, str)) != null) {
                    aVar.put(a, C1040ar.m5863M(view));
                }
            }
        } else {
            m1439a(aVar, aVar3);
        }
        return aVar3;
    }
}
