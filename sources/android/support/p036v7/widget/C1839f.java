package android.support.p036v7.widget;

import android.support.p010v4.p033o.C0896n;
import android.support.p036v7.widget.C1717au;
import android.support.p036v7.widget.C1732az;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: android.support.v7.widget.f */
class C1839f implements C1717au.C1718a {

    /* renamed from: a */
    static final int f6250a = 0;

    /* renamed from: b */
    static final int f6251b = 1;

    /* renamed from: i */
    private static final boolean f6252i = false;

    /* renamed from: j */
    private static final String f6253j = "AHT";

    /* renamed from: c */
    final ArrayList<C1841b> f6254c;

    /* renamed from: d */
    final ArrayList<C1841b> f6255d;

    /* renamed from: e */
    final C1840a f6256e;

    /* renamed from: f */
    Runnable f6257f;

    /* renamed from: g */
    final boolean f6258g;

    /* renamed from: h */
    final C1717au f6259h;

    /* renamed from: k */
    private C0896n.C0897a<C1841b> f6260k;

    /* renamed from: l */
    private int f6261l;

    /* renamed from: android.support.v7.widget.f$a */
    interface C1840a {
        /* renamed from: a */
        C1732az.C1774x mo6751a(int i);

        /* renamed from: a */
        void mo6752a(int i, int i2);

        /* renamed from: a */
        void mo6753a(int i, int i2, Object obj);

        /* renamed from: a */
        void mo6754a(C1841b bVar);

        /* renamed from: b */
        void mo6755b(int i, int i2);

        /* renamed from: b */
        void mo6756b(C1841b bVar);

        /* renamed from: c */
        void mo6757c(int i, int i2);

        /* renamed from: d */
        void mo6759d(int i, int i2);
    }

    /* renamed from: android.support.v7.widget.f$b */
    static class C1841b {

        /* renamed from: a */
        static final int f6262a = 1;

        /* renamed from: b */
        static final int f6263b = 2;

        /* renamed from: c */
        static final int f6264c = 4;

        /* renamed from: d */
        static final int f6265d = 8;

        /* renamed from: e */
        static final int f6266e = 30;

        /* renamed from: f */
        int f6267f;

        /* renamed from: g */
        int f6268g;

        /* renamed from: h */
        Object f6269h;

        /* renamed from: i */
        int f6270i;

        C1841b(int i, int i2, int i3, Object obj) {
            this.f6267f = i;
            this.f6268g = i2;
            this.f6270i = i3;
            this.f6269h = obj;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public String mo7411a() {
            switch (this.f6267f) {
                case 1:
                    return "add";
                case 2:
                    return "rm";
                case 4:
                    return "up";
                case 8:
                    return "mv";
                default:
                    return "??";
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C1841b bVar = (C1841b) obj;
            if (this.f6267f != bVar.f6267f) {
                return false;
            }
            if (this.f6267f == 8 && Math.abs(this.f6270i - this.f6268g) == 1 && this.f6270i == bVar.f6268g && this.f6268g == bVar.f6270i) {
                return true;
            }
            if (this.f6270i != bVar.f6270i) {
                return false;
            }
            if (this.f6268g != bVar.f6268g) {
                return false;
            }
            return this.f6269h != null ? this.f6269h.equals(bVar.f6269h) : bVar.f6269h == null;
        }

        public int hashCode() {
            return (((this.f6267f * 31) + this.f6268g) * 31) + this.f6270i;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + mo7411a() + ",s:" + this.f6268g + "c:" + this.f6270i + ",p:" + this.f6269h + "]";
        }
    }

    C1839f(C1840a aVar) {
        this(aVar, false);
    }

    C1839f(C1840a aVar, boolean z) {
        this.f6260k = new C0896n.C0898b(30);
        this.f6254c = new ArrayList<>();
        this.f6255d = new ArrayList<>();
        this.f6261l = 0;
        this.f6256e = aVar;
        this.f6258g = z;
        this.f6259h = new C1717au(this);
    }

    /* renamed from: b */
    private void m11139b(C1841b bVar) {
        m11146g(bVar);
    }

    /* renamed from: c */
    private void m11140c(C1841b bVar) {
        boolean z;
        int i;
        int i2;
        int i3;
        boolean z2;
        int i4 = bVar.f6268g;
        int i5 = bVar.f6268g + bVar.f6270i;
        char c = 65535;
        int i6 = bVar.f6268g;
        int i7 = 0;
        while (i6 < i5) {
            if (this.f6256e.mo6751a(i6) != null || m11143d(i6)) {
                if (c == 0) {
                    m11144e(mo6538a(2, i4, i7, (Object) null));
                    z2 = true;
                } else {
                    z2 = false;
                }
                c = 1;
            } else {
                if (c == 1) {
                    m11146g(mo6538a(2, i4, i7, (Object) null));
                    z = true;
                } else {
                    z = false;
                }
                c = 0;
            }
            if (z) {
                i3 = i6 - i7;
                i = i5 - i7;
                i2 = 1;
            } else {
                int i8 = i6;
                i = i5;
                i2 = i7 + 1;
                i3 = i8;
            }
            i7 = i2;
            i5 = i;
            i6 = i3 + 1;
        }
        if (i7 != bVar.f6270i) {
            mo6539a(bVar);
            bVar = mo6538a(2, i4, i7, (Object) null);
        }
        if (c == 0) {
            m11144e(bVar);
        } else {
            m11146g(bVar);
        }
    }

    /* renamed from: d */
    private int m11141d(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6 = i;
        for (int size = this.f6255d.size() - 1; size >= 0; size--) {
            C1841b bVar = this.f6255d.get(size);
            if (bVar.f6267f == 8) {
                if (bVar.f6268g < bVar.f6270i) {
                    i3 = bVar.f6268g;
                    i4 = bVar.f6270i;
                } else {
                    i3 = bVar.f6270i;
                    i4 = bVar.f6268g;
                }
                if (i6 < i3 || i6 > i4) {
                    if (i6 < bVar.f6268g) {
                        if (i2 == 1) {
                            bVar.f6268g++;
                            bVar.f6270i++;
                            i5 = i6;
                        } else if (i2 == 2) {
                            bVar.f6268g--;
                            bVar.f6270i--;
                        }
                    }
                    i5 = i6;
                } else if (i3 == bVar.f6268g) {
                    if (i2 == 1) {
                        bVar.f6270i++;
                    } else if (i2 == 2) {
                        bVar.f6270i--;
                    }
                    i5 = i6 + 1;
                } else {
                    if (i2 == 1) {
                        bVar.f6268g++;
                    } else if (i2 == 2) {
                        bVar.f6268g--;
                    }
                    i5 = i6 - 1;
                }
                i6 = i5;
            } else if (bVar.f6268g <= i6) {
                if (bVar.f6267f == 1) {
                    i6 -= bVar.f6270i;
                } else if (bVar.f6267f == 2) {
                    i6 += bVar.f6270i;
                }
            } else if (i2 == 1) {
                bVar.f6268g++;
            } else if (i2 == 2) {
                bVar.f6268g--;
            }
        }
        for (int size2 = this.f6255d.size() - 1; size2 >= 0; size2--) {
            C1841b bVar2 = this.f6255d.get(size2);
            if (bVar2.f6267f == 8) {
                if (bVar2.f6270i == bVar2.f6268g || bVar2.f6270i < 0) {
                    this.f6255d.remove(size2);
                    mo6539a(bVar2);
                }
            } else if (bVar2.f6270i <= 0) {
                this.f6255d.remove(size2);
                mo6539a(bVar2);
            }
        }
        return i6;
    }

    /* renamed from: d */
    private void m11142d(C1841b bVar) {
        int i;
        int i2;
        boolean z;
        int i3 = bVar.f6268g;
        int i4 = bVar.f6268g + bVar.f6270i;
        int i5 = bVar.f6268g;
        boolean z2 = true;
        int i6 = 0;
        while (i5 < i4) {
            if (this.f6256e.mo6751a(i5) != null || m11143d(i5)) {
                if (!z2) {
                    m11144e(mo6538a(4, i3, i6, bVar.f6269h));
                    i6 = 0;
                    i3 = i5;
                }
                i = i3;
                i2 = i6;
                z = true;
            } else {
                if (z2) {
                    m11146g(mo6538a(4, i3, i6, bVar.f6269h));
                    i6 = 0;
                    i3 = i5;
                }
                i = i3;
                i2 = i6;
                z = false;
            }
            i5++;
            boolean z3 = z;
            i6 = i2 + 1;
            i3 = i;
            z2 = z3;
        }
        if (i6 != bVar.f6270i) {
            Object obj = bVar.f6269h;
            mo6539a(bVar);
            bVar = mo6538a(4, i3, i6, obj);
        }
        if (!z2) {
            m11144e(bVar);
        } else {
            m11146g(bVar);
        }
    }

    /* renamed from: d */
    private boolean m11143d(int i) {
        int size = this.f6255d.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1841b bVar = this.f6255d.get(i2);
            if (bVar.f6267f == 8) {
                if (mo7394a(bVar.f6270i, i2 + 1) == i) {
                    return true;
                }
            } else if (bVar.f6267f == 1) {
                int i3 = bVar.f6268g + bVar.f6270i;
                for (int i4 = bVar.f6268g; i4 < i3; i4++) {
                    if (mo7394a(i4, i2 + 1) == i) {
                        return true;
                    }
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    /* renamed from: e */
    private void m11144e(C1841b bVar) {
        int i;
        boolean z;
        if (bVar.f6267f == 1 || bVar.f6267f == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int d = m11141d(bVar.f6268g, bVar.f6267f);
        int i2 = bVar.f6268g;
        switch (bVar.f6267f) {
            case 2:
                i = 0;
                break;
            case 4:
                i = 1;
                break;
            default:
                throw new IllegalArgumentException("op should be remove or update." + bVar);
        }
        int i3 = 1;
        int i4 = d;
        int i5 = i2;
        for (int i6 = 1; i6 < bVar.f6270i; i6++) {
            int d2 = m11141d(bVar.f6268g + (i * i6), bVar.f6267f);
            switch (bVar.f6267f) {
                case 2:
                    if (d2 != i4) {
                        z = false;
                        break;
                    } else {
                        z = true;
                        break;
                    }
                case 4:
                    if (d2 != i4 + 1) {
                        z = false;
                        break;
                    } else {
                        z = true;
                        break;
                    }
                default:
                    z = false;
                    break;
            }
            if (z) {
                i3++;
            } else {
                C1841b a = mo6538a(bVar.f6267f, i4, i3, bVar.f6269h);
                mo7397a(a, i5);
                mo6539a(a);
                if (bVar.f6267f == 4) {
                    i5 += i3;
                }
                i3 = 1;
                i4 = d2;
            }
        }
        Object obj = bVar.f6269h;
        mo6539a(bVar);
        if (i3 > 0) {
            C1841b a2 = mo6538a(bVar.f6267f, i4, i3, obj);
            mo7397a(a2, i5);
            mo6539a(a2);
        }
    }

    /* renamed from: f */
    private void m11145f(C1841b bVar) {
        m11146g(bVar);
    }

    /* renamed from: g */
    private void m11146g(C1841b bVar) {
        this.f6255d.add(bVar);
        switch (bVar.f6267f) {
            case 1:
                this.f6256e.mo6757c(bVar.f6268g, bVar.f6270i);
                return;
            case 2:
                this.f6256e.mo6755b(bVar.f6268g, bVar.f6270i);
                return;
            case 4:
                this.f6256e.mo6753a(bVar.f6268g, bVar.f6270i, bVar.f6269h);
                return;
            case 8:
                this.f6256e.mo6759d(bVar.f6268g, bVar.f6270i);
                return;
            default:
                throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo7394a(int i, int i2) {
        int size = this.f6255d.size();
        int i3 = i;
        while (i2 < size) {
            C1841b bVar = this.f6255d.get(i2);
            if (bVar.f6267f == 8) {
                if (bVar.f6268g == i3) {
                    i3 = bVar.f6270i;
                } else {
                    if (bVar.f6268g < i3) {
                        i3--;
                    }
                    if (bVar.f6270i <= i3) {
                        i3++;
                    }
                }
            } else if (bVar.f6268g > i3) {
                continue;
            } else if (bVar.f6267f == 2) {
                if (i3 < bVar.f6268g + bVar.f6270i) {
                    return -1;
                }
                i3 -= bVar.f6270i;
            } else if (bVar.f6267f == 1) {
                i3 += bVar.f6270i;
            }
            i2++;
        }
        return i3;
    }

    /* renamed from: a */
    public C1841b mo6538a(int i, int i2, int i3, Object obj) {
        C1841b a = this.f6260k.mo2958a();
        if (a == null) {
            return new C1841b(i, i2, i3, obj);
        }
        a.f6267f = i;
        a.f6268g = i2;
        a.f6270i = i3;
        a.f6269h = obj;
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C1839f mo7395a(C1841b... bVarArr) {
        Collections.addAll(this.f6254c, bVarArr);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7396a() {
        mo7398a((List<C1841b>) this.f6254c);
        mo7398a((List<C1841b>) this.f6255d);
        this.f6261l = 0;
    }

    /* renamed from: a */
    public void mo6539a(C1841b bVar) {
        if (!this.f6258g) {
            bVar.f6269h = null;
            this.f6260k.mo2959a(bVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7397a(C1841b bVar, int i) {
        this.f6256e.mo6754a(bVar);
        switch (bVar.f6267f) {
            case 2:
                this.f6256e.mo6752a(i, bVar.f6270i);
                return;
            case 4:
                this.f6256e.mo6753a(i, bVar.f6270i, bVar.f6269h);
                return;
            default:
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7398a(List<C1841b> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            mo6539a(list.get(i));
        }
        list.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo7399a(int i) {
        return (this.f6261l & i) != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo7400a(int i, int i2, int i3) {
        boolean z = true;
        if (i == i2) {
            return false;
        }
        if (i3 != 1) {
            throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
        }
        this.f6254c.add(mo6538a(8, i, i2, (Object) null));
        this.f6261l |= 8;
        if (this.f6254c.size() != 1) {
            z = false;
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo7401a(int i, int i2, Object obj) {
        boolean z = true;
        if (i2 < 1) {
            return false;
        }
        this.f6254c.add(mo6538a(4, i, i2, obj));
        this.f6261l |= 4;
        if (this.f6254c.size() != 1) {
            z = false;
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo7402b(int i) {
        return mo7394a(i, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo7403b() {
        this.f6259h.mo6535a(this.f6254c);
        int size = this.f6254c.size();
        for (int i = 0; i < size; i++) {
            C1841b bVar = this.f6254c.get(i);
            switch (bVar.f6267f) {
                case 1:
                    m11145f(bVar);
                    break;
                case 2:
                    m11140c(bVar);
                    break;
                case 4:
                    m11142d(bVar);
                    break;
                case 8:
                    m11139b(bVar);
                    break;
            }
            if (this.f6257f != null) {
                this.f6257f.run();
            }
        }
        this.f6254c.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo7404b(int i, int i2) {
        boolean z = true;
        if (i2 < 1) {
            return false;
        }
        this.f6254c.add(mo6538a(1, i, i2, (Object) null));
        this.f6261l |= 1;
        if (this.f6254c.size() != 1) {
            z = false;
        }
        return z;
    }

    /* renamed from: c */
    public int mo7405c(int i) {
        int size = this.f6254c.size();
        int i2 = i;
        for (int i3 = 0; i3 < size; i3++) {
            C1841b bVar = this.f6254c.get(i3);
            switch (bVar.f6267f) {
                case 1:
                    if (bVar.f6268g > i2) {
                        break;
                    } else {
                        i2 += bVar.f6270i;
                        break;
                    }
                case 2:
                    if (bVar.f6268g <= i2) {
                        if (bVar.f6268g + bVar.f6270i <= i2) {
                            i2 -= bVar.f6270i;
                            break;
                        } else {
                            return -1;
                        }
                    } else {
                        continue;
                    }
                case 8:
                    if (bVar.f6268g != i2) {
                        if (bVar.f6268g < i2) {
                            i2--;
                        }
                        if (bVar.f6270i > i2) {
                            break;
                        } else {
                            i2++;
                            break;
                        }
                    } else {
                        i2 = bVar.f6270i;
                        break;
                    }
            }
        }
        return i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo7406c() {
        int size = this.f6255d.size();
        for (int i = 0; i < size; i++) {
            this.f6256e.mo6756b(this.f6255d.get(i));
        }
        mo7398a((List<C1841b>) this.f6255d);
        this.f6261l = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo7407c(int i, int i2) {
        boolean z = true;
        if (i2 < 1) {
            return false;
        }
        this.f6254c.add(mo6538a(2, i, i2, (Object) null));
        this.f6261l |= 2;
        if (this.f6254c.size() != 1) {
            z = false;
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo7408d() {
        return this.f6254c.size() > 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo7409e() {
        mo7406c();
        int size = this.f6254c.size();
        for (int i = 0; i < size; i++) {
            C1841b bVar = this.f6254c.get(i);
            switch (bVar.f6267f) {
                case 1:
                    this.f6256e.mo6756b(bVar);
                    this.f6256e.mo6757c(bVar.f6268g, bVar.f6270i);
                    break;
                case 2:
                    this.f6256e.mo6756b(bVar);
                    this.f6256e.mo6752a(bVar.f6268g, bVar.f6270i);
                    break;
                case 4:
                    this.f6256e.mo6756b(bVar);
                    this.f6256e.mo6753a(bVar.f6268g, bVar.f6270i, bVar.f6269h);
                    break;
                case 8:
                    this.f6256e.mo6756b(bVar);
                    this.f6256e.mo6759d(bVar.f6268g, bVar.f6270i);
                    break;
            }
            if (this.f6257f != null) {
                this.f6257f.run();
            }
        }
        mo7398a((List<C1841b>) this.f6254c);
        this.f6261l = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo7410f() {
        return !this.f6255d.isEmpty() && !this.f6254c.isEmpty();
    }
}
