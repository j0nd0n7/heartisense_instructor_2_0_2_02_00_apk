package android.support.p036v7.widget;

import android.support.p036v7.widget.C1839f;
import java.util.List;

/* renamed from: android.support.v7.widget.au */
class C1717au {

    /* renamed from: a */
    final C1718a f5802a;

    /* renamed from: android.support.v7.widget.au$a */
    interface C1718a {
        /* renamed from: a */
        C1839f.C1841b mo6538a(int i, int i2, int i3, Object obj);

        /* renamed from: a */
        void mo6539a(C1839f.C1841b bVar);
    }

    public C1717au(C1718a aVar) {
        this.f5802a = aVar;
    }

    /* renamed from: a */
    private void m10272a(List<C1839f.C1841b> list, int i, int i2) {
        C1839f.C1841b bVar = list.get(i);
        C1839f.C1841b bVar2 = list.get(i2);
        switch (bVar2.f6267f) {
            case 1:
                m10274c(list, i, bVar, i2, bVar2);
                return;
            case 2:
                mo6536a(list, i, bVar, i2, bVar2);
                return;
            case 4:
                mo6537b(list, i, bVar, i2, bVar2);
                return;
            default:
                return;
        }
    }

    /* renamed from: b */
    private int m10273b(List<C1839f.C1841b> list) {
        boolean z;
        boolean z2 = false;
        int size = list.size() - 1;
        while (size >= 0) {
            if (list.get(size).f6267f != 8) {
                z = true;
            } else if (z2) {
                return size;
            } else {
                z = z2;
            }
            size--;
            z2 = z;
        }
        return -1;
    }

    /* renamed from: c */
    private void m10274c(List<C1839f.C1841b> list, int i, C1839f.C1841b bVar, int i2, C1839f.C1841b bVar2) {
        int i3 = 0;
        if (bVar.f6270i < bVar2.f6268g) {
            i3 = -1;
        }
        if (bVar.f6268g < bVar2.f6268g) {
            i3++;
        }
        if (bVar2.f6268g <= bVar.f6268g) {
            bVar.f6268g += bVar2.f6270i;
        }
        if (bVar2.f6268g <= bVar.f6270i) {
            bVar.f6270i += bVar2.f6270i;
        }
        bVar2.f6268g = i3 + bVar2.f6268g;
        list.set(i, bVar2);
        list.set(i2, bVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo6535a(List<C1839f.C1841b> list) {
        while (true) {
            int b = m10273b(list);
            if (b != -1) {
                m10272a(list, b, b + 1);
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo6536a(List<C1839f.C1841b> list, int i, C1839f.C1841b bVar, int i2, C1839f.C1841b bVar2) {
        boolean z;
        C1839f.C1841b bVar3;
        boolean z2 = false;
        if (bVar.f6268g < bVar.f6270i) {
            z = bVar2.f6268g == bVar.f6268g && bVar2.f6270i == bVar.f6270i - bVar.f6268g;
        } else if (bVar2.f6268g == bVar.f6270i + 1 && bVar2.f6270i == bVar.f6268g - bVar.f6270i) {
            z2 = true;
            z = true;
        } else {
            z = false;
            z2 = true;
        }
        if (bVar.f6270i < bVar2.f6268g) {
            bVar2.f6268g--;
        } else if (bVar.f6270i < bVar2.f6268g + bVar2.f6270i) {
            bVar2.f6270i--;
            bVar.f6267f = 2;
            bVar.f6270i = 1;
            if (bVar2.f6270i == 0) {
                list.remove(i2);
                this.f5802a.mo6539a(bVar2);
                return;
            }
            return;
        }
        if (bVar.f6268g <= bVar2.f6268g) {
            bVar2.f6268g++;
            bVar3 = null;
        } else if (bVar.f6268g < bVar2.f6268g + bVar2.f6270i) {
            bVar3 = this.f5802a.mo6538a(2, bVar.f6268g + 1, (bVar2.f6268g + bVar2.f6270i) - bVar.f6268g, (Object) null);
            bVar2.f6270i = bVar.f6268g - bVar2.f6268g;
        } else {
            bVar3 = null;
        }
        if (z) {
            list.set(i, bVar2);
            list.remove(i2);
            this.f5802a.mo6539a(bVar);
            return;
        }
        if (z2) {
            if (bVar3 != null) {
                if (bVar.f6268g > bVar3.f6268g) {
                    bVar.f6268g -= bVar3.f6270i;
                }
                if (bVar.f6270i > bVar3.f6268g) {
                    bVar.f6270i -= bVar3.f6270i;
                }
            }
            if (bVar.f6268g > bVar2.f6268g) {
                bVar.f6268g -= bVar2.f6270i;
            }
            if (bVar.f6270i > bVar2.f6268g) {
                bVar.f6270i -= bVar2.f6270i;
            }
        } else {
            if (bVar3 != null) {
                if (bVar.f6268g >= bVar3.f6268g) {
                    bVar.f6268g -= bVar3.f6270i;
                }
                if (bVar.f6270i >= bVar3.f6268g) {
                    bVar.f6270i -= bVar3.f6270i;
                }
            }
            if (bVar.f6268g >= bVar2.f6268g) {
                bVar.f6268g -= bVar2.f6270i;
            }
            if (bVar.f6270i >= bVar2.f6268g) {
                bVar.f6270i -= bVar2.f6270i;
            }
        }
        list.set(i, bVar2);
        if (bVar.f6268g != bVar.f6270i) {
            list.set(i2, bVar);
        } else {
            list.remove(i2);
        }
        if (bVar3 != null) {
            list.add(i, bVar3);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo6537b(List<C1839f.C1841b> list, int i, C1839f.C1841b bVar, int i2, C1839f.C1841b bVar2) {
        C1839f.C1841b bVar3;
        C1839f.C1841b bVar4 = null;
        if (bVar.f6270i < bVar2.f6268g) {
            bVar2.f6268g--;
            bVar3 = null;
        } else if (bVar.f6270i < bVar2.f6268g + bVar2.f6270i) {
            bVar2.f6270i--;
            bVar3 = this.f5802a.mo6538a(4, bVar.f6268g, 1, bVar2.f6269h);
        } else {
            bVar3 = null;
        }
        if (bVar.f6268g <= bVar2.f6268g) {
            bVar2.f6268g++;
        } else if (bVar.f6268g < bVar2.f6268g + bVar2.f6270i) {
            int i3 = (bVar2.f6268g + bVar2.f6270i) - bVar.f6268g;
            bVar4 = this.f5802a.mo6538a(4, bVar.f6268g + 1, i3, bVar2.f6269h);
            bVar2.f6270i -= i3;
        }
        list.set(i2, bVar);
        if (bVar2.f6270i > 0) {
            list.set(i, bVar2);
        } else {
            list.remove(i);
            this.f5802a.mo6539a(bVar2);
        }
        if (bVar3 != null) {
            list.add(i, bVar3);
        }
        if (bVar4 != null) {
            list.add(i, bVar4);
        }
    }
}
