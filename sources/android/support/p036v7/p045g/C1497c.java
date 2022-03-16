package android.support.p036v7.p045g;

import android.support.annotation.C0003aa;
import android.support.annotation.C0020ao;
import android.support.p036v7.widget.C1732az;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: android.support.v7.g.c */
public class C1497c {

    /* renamed from: a */
    private static final Comparator<C1504e> f4661a = new Comparator<C1504e>() {
        /* renamed from: a */
        public int compare(C1504e eVar, C1504e eVar2) {
            int i = eVar.f4685a - eVar2.f4685a;
            return i == 0 ? eVar.f4686b - eVar2.f4686b : i;
        }
    };

    /* renamed from: android.support.v7.g.c$a */
    public static abstract class C1499a {
        /* renamed from: a */
        public abstract int mo5069a();

        /* renamed from: a */
        public abstract boolean mo5070a(int i, int i2);

        /* renamed from: b */
        public abstract int mo5071b();

        /* renamed from: b */
        public abstract boolean mo5072b(int i, int i2);

        @C0003aa
        /* renamed from: c */
        public Object mo5073c(int i, int i2) {
            return null;
        }
    }

    /* renamed from: android.support.v7.g.c$b */
    public static class C1500b {

        /* renamed from: a */
        private static final int f4662a = 1;

        /* renamed from: b */
        private static final int f4663b = 2;

        /* renamed from: c */
        private static final int f4664c = 4;

        /* renamed from: d */
        private static final int f4665d = 8;

        /* renamed from: e */
        private static final int f4666e = 16;

        /* renamed from: f */
        private static final int f4667f = 5;

        /* renamed from: g */
        private static final int f4668g = 31;

        /* renamed from: h */
        private final List<C1504e> f4669h;

        /* renamed from: i */
        private final int[] f4670i;

        /* renamed from: j */
        private final int[] f4671j;

        /* renamed from: k */
        private final C1499a f4672k;

        /* renamed from: l */
        private final int f4673l;

        /* renamed from: m */
        private final int f4674m;

        /* renamed from: n */
        private final boolean f4675n;

        C1500b(C1499a aVar, List<C1504e> list, int[] iArr, int[] iArr2, boolean z) {
            this.f4669h = list;
            this.f4670i = iArr;
            this.f4671j = iArr2;
            Arrays.fill(this.f4670i, 0);
            Arrays.fill(this.f4671j, 0);
            this.f4672k = aVar;
            this.f4673l = aVar.mo5069a();
            this.f4674m = aVar.mo5071b();
            this.f4675n = z;
            m8779b();
            m8782c();
        }

        /* renamed from: a */
        private static C1502c m8775a(List<C1502c> list, int i, boolean z) {
            int size = list.size() - 1;
            while (size >= 0) {
                C1502c cVar = list.get(size);
                if (cVar.f4678a == i && cVar.f4680c == z) {
                    list.remove(size);
                    while (true) {
                        int i2 = size;
                        if (i2 >= list.size()) {
                            return cVar;
                        }
                        C1502c cVar2 = list.get(i2);
                        cVar2.f4679b = (z ? 1 : -1) + cVar2.f4679b;
                        size = i2 + 1;
                    }
                } else {
                    size--;
                }
            }
            return null;
        }

        /* renamed from: a */
        private void m8776a(int i, int i2, int i3) {
            if (this.f4670i[i - 1] == 0) {
                m8778a(i, i2, i3, false);
            }
        }

        /* renamed from: a */
        private void m8777a(List<C1502c> list, C1505d dVar, int i, int i2, int i3) {
            if (!this.f4675n) {
                dVar.mo5063a(i, i2);
                return;
            }
            for (int i4 = i2 - 1; i4 >= 0; i4--) {
                int i5 = this.f4671j[i3 + i4] & 31;
                switch (i5) {
                    case 0:
                        dVar.mo5063a(i, 1);
                        for (C1502c cVar : list) {
                            cVar.f4679b++;
                        }
                        break;
                    case 4:
                    case 8:
                        int i6 = this.f4671j[i3 + i4] >> 5;
                        dVar.mo5066c(m8775a(list, i6, true).f4679b, i);
                        if (i5 != 4) {
                            break;
                        } else {
                            dVar.mo5064a(i, 1, this.f4672k.mo5073c(i6, i3 + i4));
                            break;
                        }
                    case 16:
                        list.add(new C1502c(i3 + i4, i, false));
                        break;
                    default:
                        throw new IllegalStateException("unknown flag for pos " + (i4 + i3) + " " + Long.toBinaryString((long) i5));
                }
            }
        }

        /* renamed from: a */
        private boolean m8778a(int i, int i2, int i3, boolean z) {
            int i4;
            int i5;
            int i6 = 8;
            if (z) {
                int i7 = i2 - 1;
                i2--;
                i4 = i7;
                i5 = i;
            } else {
                i4 = i - 1;
                i5 = i - 1;
            }
            int i8 = i5;
            while (i3 >= 0) {
                C1504e eVar = this.f4669h.get(i3);
                int i9 = eVar.f4685a + eVar.f4687c;
                int i10 = eVar.f4686b + eVar.f4687c;
                if (z) {
                    for (int i11 = i8 - 1; i11 >= i9; i11--) {
                        if (this.f4672k.mo5070a(i11, i4)) {
                            int i12 = this.f4672k.mo5072b(i11, i4) ? 8 : 4;
                            this.f4671j[i4] = (i11 << 5) | 16;
                            this.f4670i[i11] = i12 | (i4 << 5);
                            return true;
                        }
                    }
                    continue;
                } else {
                    for (int i13 = i2 - 1; i13 >= i10; i13--) {
                        if (this.f4672k.mo5070a(i4, i13)) {
                            if (!this.f4672k.mo5072b(i4, i13)) {
                                i6 = 4;
                            }
                            this.f4670i[i - 1] = (i13 << 5) | 16;
                            this.f4671j[i13] = ((i - 1) << 5) | i6;
                            return true;
                        }
                    }
                    continue;
                }
                i8 = eVar.f4685a;
                i2 = eVar.f4686b;
                i3--;
            }
            return false;
        }

        /* renamed from: b */
        private void m8779b() {
            C1504e eVar = this.f4669h.isEmpty() ? null : this.f4669h.get(0);
            if (eVar == null || eVar.f4685a != 0 || eVar.f4686b != 0) {
                C1504e eVar2 = new C1504e();
                eVar2.f4685a = 0;
                eVar2.f4686b = 0;
                eVar2.f4688d = false;
                eVar2.f4687c = 0;
                eVar2.f4689e = false;
                this.f4669h.add(0, eVar2);
            }
        }

        /* renamed from: b */
        private void m8780b(int i, int i2, int i3) {
            if (this.f4671j[i2 - 1] == 0) {
                m8778a(i, i2, i3, true);
            }
        }

        /* renamed from: b */
        private void m8781b(List<C1502c> list, C1505d dVar, int i, int i2, int i3) {
            if (!this.f4675n) {
                dVar.mo5065b(i, i2);
                return;
            }
            for (int i4 = i2 - 1; i4 >= 0; i4--) {
                int i5 = this.f4670i[i3 + i4] & 31;
                switch (i5) {
                    case 0:
                        dVar.mo5065b(i + i4, 1);
                        for (C1502c next : list) {
                            next.f4679b--;
                        }
                        break;
                    case 4:
                    case 8:
                        int i6 = this.f4670i[i3 + i4] >> 5;
                        C1502c a = m8775a(list, i6, false);
                        dVar.mo5066c(i + i4, a.f4679b - 1);
                        if (i5 != 4) {
                            break;
                        } else {
                            dVar.mo5064a(a.f4679b - 1, 1, this.f4672k.mo5073c(i3 + i4, i6));
                            break;
                        }
                    case 16:
                        list.add(new C1502c(i3 + i4, i + i4, true));
                        break;
                    default:
                        throw new IllegalStateException("unknown flag for pos " + (i4 + i3) + " " + Long.toBinaryString((long) i5));
                }
            }
        }

        /* renamed from: c */
        private void m8782c() {
            int i = this.f4673l;
            int i2 = this.f4674m;
            for (int size = this.f4669h.size() - 1; size >= 0; size--) {
                C1504e eVar = this.f4669h.get(size);
                int i3 = eVar.f4685a + eVar.f4687c;
                int i4 = eVar.f4686b + eVar.f4687c;
                if (this.f4675n) {
                    while (i > i3) {
                        m8776a(i, i2, size);
                        i--;
                    }
                    while (i2 > i4) {
                        m8780b(i, i2, size);
                        i2--;
                    }
                }
                for (int i5 = 0; i5 < eVar.f4687c; i5++) {
                    int i6 = eVar.f4685a + i5;
                    int i7 = eVar.f4686b + i5;
                    int i8 = this.f4672k.mo5072b(i6, i7) ? 1 : 2;
                    this.f4670i[i6] = (i7 << 5) | i8;
                    this.f4671j[i7] = i8 | (i6 << 5);
                }
                i = eVar.f4685a;
                i2 = eVar.f4686b;
            }
        }

        /* access modifiers changed from: package-private */
        @C0020ao
        /* renamed from: a */
        public List<C1504e> mo5074a() {
            return this.f4669h;
        }

        /* renamed from: a */
        public void mo5075a(C1505d dVar) {
            C1496b bVar = dVar instanceof C1496b ? (C1496b) dVar : new C1496b(dVar);
            ArrayList arrayList = new ArrayList();
            int i = this.f4673l;
            int i2 = this.f4674m;
            int size = this.f4669h.size() - 1;
            int i3 = i2;
            while (size >= 0) {
                C1504e eVar = this.f4669h.get(size);
                int i4 = eVar.f4687c;
                int i5 = eVar.f4685a + i4;
                int i6 = eVar.f4686b + i4;
                if (i5 < i) {
                    m8781b(arrayList, bVar, i5, i - i5, i5);
                }
                if (i6 < i3) {
                    m8777a(arrayList, bVar, i5, i3 - i6, i6);
                }
                for (int i7 = i4 - 1; i7 >= 0; i7--) {
                    if ((this.f4670i[eVar.f4685a + i7] & 31) == 2) {
                        bVar.mo5064a(eVar.f4685a + i7, 1, this.f4672k.mo5073c(eVar.f4685a + i7, eVar.f4686b + i7));
                    }
                }
                i = eVar.f4685a;
                size--;
                i3 = eVar.f4686b;
            }
            bVar.mo5062a();
        }

        /* renamed from: a */
        public void mo5076a(final C1732az.C1739a aVar) {
            mo5075a((C1505d) new C1505d() {
                /* renamed from: a */
                public void mo5063a(int i, int i2) {
                    aVar.notifyItemRangeInserted(i, i2);
                }

                /* renamed from: a */
                public void mo5064a(int i, int i2, Object obj) {
                    aVar.notifyItemRangeChanged(i, i2, obj);
                }

                /* renamed from: b */
                public void mo5065b(int i, int i2) {
                    aVar.notifyItemRangeRemoved(i, i2);
                }

                /* renamed from: c */
                public void mo5066c(int i, int i2) {
                    aVar.notifyItemMoved(i, i2);
                }
            });
        }
    }

    /* renamed from: android.support.v7.g.c$c */
    private static class C1502c {

        /* renamed from: a */
        int f4678a;

        /* renamed from: b */
        int f4679b;

        /* renamed from: c */
        boolean f4680c;

        public C1502c(int i, int i2, boolean z) {
            this.f4678a = i;
            this.f4679b = i2;
            this.f4680c = z;
        }
    }

    /* renamed from: android.support.v7.g.c$d */
    static class C1503d {

        /* renamed from: a */
        int f4681a;

        /* renamed from: b */
        int f4682b;

        /* renamed from: c */
        int f4683c;

        /* renamed from: d */
        int f4684d;

        public C1503d() {
        }

        public C1503d(int i, int i2, int i3, int i4) {
            this.f4681a = i;
            this.f4682b = i2;
            this.f4683c = i3;
            this.f4684d = i4;
        }
    }

    /* renamed from: android.support.v7.g.c$e */
    static class C1504e {

        /* renamed from: a */
        int f4685a;

        /* renamed from: b */
        int f4686b;

        /* renamed from: c */
        int f4687c;

        /* renamed from: d */
        boolean f4688d;

        /* renamed from: e */
        boolean f4689e;

        C1504e() {
        }
    }

    private C1497c() {
    }

    /* renamed from: a */
    public static C1500b m8766a(C1499a aVar) {
        return m8767a(aVar, true);
    }

    /* renamed from: a */
    public static C1500b m8767a(C1499a aVar, boolean z) {
        int a = aVar.mo5069a();
        int b = aVar.mo5071b();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new C1503d(0, a, 0, b));
        int abs = a + b + Math.abs(a - b);
        int[] iArr = new int[(abs * 2)];
        int[] iArr2 = new int[(abs * 2)];
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            C1503d dVar = (C1503d) arrayList2.remove(arrayList2.size() - 1);
            C1504e a2 = m8768a(aVar, dVar.f4681a, dVar.f4682b, dVar.f4683c, dVar.f4684d, iArr, iArr2, abs);
            if (a2 != null) {
                if (a2.f4687c > 0) {
                    arrayList.add(a2);
                }
                a2.f4685a += dVar.f4681a;
                a2.f4686b += dVar.f4683c;
                C1503d dVar2 = arrayList3.isEmpty() ? new C1503d() : (C1503d) arrayList3.remove(arrayList3.size() - 1);
                dVar2.f4681a = dVar.f4681a;
                dVar2.f4683c = dVar.f4683c;
                if (a2.f4689e) {
                    dVar2.f4682b = a2.f4685a;
                    dVar2.f4684d = a2.f4686b;
                } else if (a2.f4688d) {
                    dVar2.f4682b = a2.f4685a - 1;
                    dVar2.f4684d = a2.f4686b;
                } else {
                    dVar2.f4682b = a2.f4685a;
                    dVar2.f4684d = a2.f4686b - 1;
                }
                arrayList2.add(dVar2);
                if (!a2.f4689e) {
                    dVar.f4681a = a2.f4685a + a2.f4687c;
                    dVar.f4683c = a2.f4686b + a2.f4687c;
                } else if (a2.f4688d) {
                    dVar.f4681a = a2.f4685a + a2.f4687c + 1;
                    dVar.f4683c = a2.f4686b + a2.f4687c;
                } else {
                    dVar.f4681a = a2.f4685a + a2.f4687c;
                    dVar.f4683c = a2.f4686b + a2.f4687c + 1;
                }
                arrayList2.add(dVar);
            } else {
                arrayList3.add(dVar);
            }
        }
        Collections.sort(arrayList, f4661a);
        return new C1500b(aVar, arrayList, iArr, iArr2, z);
    }

    /* renamed from: a */
    private static C1504e m8768a(C1499a aVar, int i, int i2, int i3, int i4, int[] iArr, int[] iArr2, int i5) {
        int i6;
        boolean z;
        int i7;
        boolean z2;
        int i8 = i2 - i;
        int i9 = i4 - i3;
        if (i2 - i < 1 || i4 - i3 < 1) {
            return null;
        }
        int i10 = i8 - i9;
        int i11 = ((i8 + i9) + 1) / 2;
        Arrays.fill(iArr, (i5 - i11) - 1, i5 + i11 + 1, 0);
        Arrays.fill(iArr2, ((i5 - i11) - 1) + i10, i5 + i11 + 1 + i10, i8);
        boolean z3 = i10 % 2 != 0;
        for (int i12 = 0; i12 <= i11; i12++) {
            int i13 = -i12;
            while (i13 <= i12) {
                if (i13 == (-i12) || (i13 != i12 && iArr[(i5 + i13) - 1] < iArr[i5 + i13 + 1])) {
                    i7 = iArr[i5 + i13 + 1];
                    z2 = false;
                } else {
                    i7 = iArr[(i5 + i13) - 1] + 1;
                    z2 = true;
                }
                int i14 = i7;
                int i15 = i7 - i13;
                while (i14 < i8 && i15 < i9 && aVar.mo5070a(i + i14, i3 + i15)) {
                    i14++;
                    i15++;
                }
                iArr[i5 + i13] = i14;
                if (!z3 || i13 < (i10 - i12) + 1 || i13 > (i10 + i12) - 1 || iArr[i5 + i13] < iArr2[i5 + i13]) {
                    i13 += 2;
                } else {
                    C1504e eVar = new C1504e();
                    eVar.f4685a = iArr2[i5 + i13];
                    eVar.f4686b = eVar.f4685a - i13;
                    eVar.f4687c = iArr[i5 + i13] - iArr2[i5 + i13];
                    eVar.f4688d = z2;
                    eVar.f4689e = false;
                    return eVar;
                }
            }
            int i16 = -i12;
            while (i16 <= i12) {
                int i17 = i16 + i10;
                if (i17 == i12 + i10 || (i17 != (-i12) + i10 && iArr2[(i5 + i17) - 1] < iArr2[i5 + i17 + 1])) {
                    i6 = iArr2[(i5 + i17) - 1];
                    z = false;
                } else {
                    i6 = iArr2[(i5 + i17) + 1] - 1;
                    z = true;
                }
                int i18 = i6;
                int i19 = i6 - i17;
                while (i18 > 0 && i19 > 0 && aVar.mo5070a((i + i18) - 1, (i3 + i19) - 1)) {
                    i18--;
                    i19--;
                }
                iArr2[i5 + i17] = i18;
                if (z3 || i16 + i10 < (-i12) || i16 + i10 > i12 || iArr[i5 + i17] < iArr2[i5 + i17]) {
                    i16 += 2;
                } else {
                    C1504e eVar2 = new C1504e();
                    eVar2.f4685a = iArr2[i5 + i17];
                    eVar2.f4686b = eVar2.f4685a - i17;
                    eVar2.f4687c = iArr[i5 + i17] - iArr2[i5 + i17];
                    eVar2.f4688d = z;
                    eVar2.f4689e = true;
                    return eVar2;
                }
            }
        }
        throw new IllegalStateException("DiffUtil hit an unexpected case while trying to calculate the optimal path. Please make sure your data is not changing during the diff calculation.");
    }
}
