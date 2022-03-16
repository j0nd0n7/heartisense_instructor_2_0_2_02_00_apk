package android.support.p036v7.widget;

import android.support.annotation.C0003aa;
import android.support.p010v4.p028k.C0817o;
import android.support.p036v7.widget.C1732az;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* renamed from: android.support.v7.widget.al */
final class C1692al implements Runnable {

    /* renamed from: a */
    static final ThreadLocal<C1692al> f5656a = new ThreadLocal<>();

    /* renamed from: e */
    static Comparator<C1695b> f5657e = new Comparator<C1695b>() {
        /* renamed from: a */
        public int compare(C1695b bVar, C1695b bVar2) {
            int i = -1;
            if ((bVar.f5669d == null) != (bVar2.f5669d == null)) {
                return bVar.f5669d == null ? 1 : -1;
            }
            if (bVar.f5666a != bVar2.f5666a) {
                if (!bVar.f5666a) {
                    i = 1;
                }
                return i;
            }
            int i2 = bVar2.f5667b - bVar.f5667b;
            if (i2 != 0) {
                return i2;
            }
            int i3 = bVar.f5668c - bVar2.f5668c;
            if (i3 == 0) {
                return 0;
            }
            return i3;
        }
    };

    /* renamed from: b */
    ArrayList<C1732az> f5658b = new ArrayList<>();

    /* renamed from: c */
    long f5659c;

    /* renamed from: d */
    long f5660d;

    /* renamed from: f */
    private ArrayList<C1695b> f5661f = new ArrayList<>();

    /* renamed from: android.support.v7.widget.al$a */
    static class C1694a implements C1732az.C1750h.C1753a {

        /* renamed from: a */
        int f5662a;

        /* renamed from: b */
        int f5663b;

        /* renamed from: c */
        int[] f5664c;

        /* renamed from: d */
        int f5665d;

        C1694a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo6384a() {
            if (this.f5664c != null) {
                Arrays.fill(this.f5664c, -1);
            }
            this.f5665d = 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo6385a(int i, int i2) {
            this.f5662a = i;
            this.f5663b = i2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo6386a(C1732az azVar, boolean z) {
            this.f5665d = 0;
            if (this.f5664c != null) {
                Arrays.fill(this.f5664c, -1);
            }
            C1732az.C1750h hVar = azVar.mLayout;
            if (azVar.mAdapter != null && hVar != null && hVar.mo6832A()) {
                if (z) {
                    if (!azVar.mAdapterHelper.mo7408d()) {
                        hVar.mo5818a(azVar.mAdapter.getItemCount(), (C1732az.C1750h.C1753a) this);
                    }
                } else if (!azVar.hasPendingAdapterUpdates()) {
                    hVar.mo5817a(this.f5662a, this.f5663b, azVar.mState, (C1732az.C1750h.C1753a) this);
                }
                if (this.f5665d > hVar.f5856C) {
                    hVar.f5856C = this.f5665d;
                    hVar.f5857D = z;
                    azVar.mRecycler.mo6991b();
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo6387a(int i) {
            if (this.f5664c == null) {
                return false;
            }
            int i2 = this.f5665d * 2;
            for (int i3 = 0; i3 < i2; i3 += 2) {
                if (this.f5664c[i3] == i) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: b */
        public void mo6388b(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            } else if (i2 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            } else {
                int i3 = this.f5665d * 2;
                if (this.f5664c == null) {
                    this.f5664c = new int[4];
                    Arrays.fill(this.f5664c, -1);
                } else if (i3 >= this.f5664c.length) {
                    int[] iArr = this.f5664c;
                    this.f5664c = new int[(i3 * 2)];
                    System.arraycopy(iArr, 0, this.f5664c, 0, iArr.length);
                }
                this.f5664c[i3] = i;
                this.f5664c[i3 + 1] = i2;
                this.f5665d++;
            }
        }
    }

    /* renamed from: android.support.v7.widget.al$b */
    static class C1695b {

        /* renamed from: a */
        public boolean f5666a;

        /* renamed from: b */
        public int f5667b;

        /* renamed from: c */
        public int f5668c;

        /* renamed from: d */
        public C1732az f5669d;

        /* renamed from: e */
        public int f5670e;

        C1695b() {
        }

        /* renamed from: a */
        public void mo6389a() {
            this.f5666a = false;
            this.f5667b = 0;
            this.f5668c = 0;
            this.f5669d = null;
            this.f5670e = 0;
        }
    }

    C1692al() {
    }

    /* renamed from: a */
    private C1732az.C1774x m10124a(C1732az azVar, int i, long j) {
        if (m10128a(azVar, i)) {
            return null;
        }
        C1732az.C1762o oVar = azVar.mRecycler;
        C1732az.C1774x a = oVar.mo6975a(i, false, j);
        if (a == null) {
            return a;
        }
        if (a.isBound()) {
            oVar.mo6986a(a.itemView);
            return a;
        }
        oVar.mo6985a(a, false);
        return a;
    }

    /* renamed from: a */
    private void m10125a() {
        C1695b bVar;
        int i;
        int size = this.f5658b.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            C1732az azVar = this.f5658b.get(i2);
            if (azVar.getWindowVisibility() == 0) {
                azVar.mPrefetchRegistry.mo6386a(azVar, false);
                i = azVar.mPrefetchRegistry.f5665d + i3;
            } else {
                i = i3;
            }
            i2++;
            i3 = i;
        }
        this.f5661f.ensureCapacity(i3);
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            C1732az azVar2 = this.f5658b.get(i5);
            if (azVar2.getWindowVisibility() == 0) {
                C1694a aVar = azVar2.mPrefetchRegistry;
                int abs = Math.abs(aVar.f5662a) + Math.abs(aVar.f5663b);
                int i6 = i4;
                for (int i7 = 0; i7 < aVar.f5665d * 2; i7 += 2) {
                    if (i6 >= this.f5661f.size()) {
                        bVar = new C1695b();
                        this.f5661f.add(bVar);
                    } else {
                        bVar = this.f5661f.get(i6);
                    }
                    int i8 = aVar.f5664c[i7 + 1];
                    bVar.f5666a = i8 <= abs;
                    bVar.f5667b = abs;
                    bVar.f5668c = i8;
                    bVar.f5669d = azVar2;
                    bVar.f5670e = aVar.f5664c[i7];
                    i6++;
                }
                i4 = i6;
            }
        }
        Collections.sort(this.f5661f, f5657e);
    }

    /* renamed from: a */
    private void m10126a(C1695b bVar, long j) {
        C1732az.C1774x a = m10124a(bVar.f5669d, bVar.f5670e, bVar.f5666a ? Long.MAX_VALUE : j);
        if (a != null && a.mNestedRecyclerView != null) {
            m10127a((C1732az) a.mNestedRecyclerView.get(), j);
        }
    }

    /* renamed from: a */
    private void m10127a(@C0003aa C1732az azVar, long j) {
        if (azVar != null) {
            if (azVar.mDataSetHasChangedAfterLayout && azVar.mChildHelper.mo6258c() != 0) {
                azVar.removeAndRecycleViews();
            }
            C1694a aVar = azVar.mPrefetchRegistry;
            aVar.mo6386a(azVar, true);
            if (aVar.f5665d != 0) {
                try {
                    C0817o.m4100a("RV Nested Prefetch");
                    azVar.mState.mo7046a(azVar.mAdapter);
                    for (int i = 0; i < aVar.f5665d * 2; i += 2) {
                        m10124a(azVar, aVar.f5664c[i], j);
                    }
                } finally {
                    C0817o.m4099a();
                }
            }
        }
    }

    /* renamed from: a */
    static boolean m10128a(C1732az azVar, int i) {
        int c = azVar.mChildHelper.mo6258c();
        for (int i2 = 0; i2 < c; i2++) {
            C1732az.C1774x childViewHolderInt = C1732az.getChildViewHolderInt(azVar.mChildHelper.mo6261d(i2));
            if (childViewHolderInt.mPosition == i && !childViewHolderInt.isInvalid()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private void m10129b(long j) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.f5661f.size()) {
                C1695b bVar = this.f5661f.get(i2);
                if (bVar.f5669d != null) {
                    m10126a(bVar, j);
                    bVar.mo6389a();
                    i = i2 + 1;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo6377a(long j) {
        m10125a();
        m10129b(j);
    }

    /* renamed from: a */
    public void mo6378a(C1732az azVar) {
        this.f5658b.add(azVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo6379a(C1732az azVar, int i, int i2) {
        if (azVar.isAttachedToWindow() && this.f5659c == 0) {
            this.f5659c = azVar.getNanoTime();
            azVar.post(this);
        }
        azVar.mPrefetchRegistry.mo6385a(i, i2);
    }

    /* renamed from: b */
    public void mo6380b(C1732az azVar) {
        this.f5658b.remove(azVar);
    }

    public void run() {
        try {
            C0817o.m4100a("RV Prefetch");
            if (!this.f5658b.isEmpty()) {
                int size = this.f5658b.size();
                int i = 0;
                long j = 0;
                while (i < size) {
                    C1732az azVar = this.f5658b.get(i);
                    i++;
                    j = azVar.getWindowVisibility() == 0 ? Math.max(azVar.getDrawingTime(), j) : j;
                }
                if (j == 0) {
                    this.f5659c = 0;
                    C0817o.m4099a();
                    return;
                }
                mo6377a(TimeUnit.MILLISECONDS.toNanos(j) + this.f5660d);
                this.f5659c = 0;
                C0817o.m4099a();
            }
        } finally {
            this.f5659c = 0;
            C0817o.m4099a();
        }
    }
}
