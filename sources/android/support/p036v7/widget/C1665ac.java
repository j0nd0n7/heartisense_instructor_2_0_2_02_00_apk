package android.support.p036v7.widget;

import android.support.p036v7.widget.C1732az;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v7.widget.ac */
class C1665ac {

    /* renamed from: d */
    private static final boolean f5571d = false;

    /* renamed from: e */
    private static final String f5572e = "ChildrenHelper";

    /* renamed from: a */
    final C1667b f5573a;

    /* renamed from: b */
    final C1666a f5574b = new C1666a();

    /* renamed from: c */
    final List<View> f5575c = new ArrayList();

    /* renamed from: android.support.v7.widget.ac$a */
    static class C1666a {

        /* renamed from: a */
        static final int f5576a = 64;

        /* renamed from: b */
        static final long f5577b = Long.MIN_VALUE;

        /* renamed from: c */
        long f5578c = 0;

        /* renamed from: d */
        C1666a f5579d;

        C1666a() {
        }

        /* renamed from: b */
        private void m9972b() {
            if (this.f5579d == null) {
                this.f5579d = new C1666a();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo6267a() {
            this.f5578c = 0;
            if (this.f5579d != null) {
                this.f5579d.mo6267a();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo6268a(int i) {
            if (i >= 64) {
                m9972b();
                this.f5579d.mo6268a(i - 64);
                return;
            }
            this.f5578c |= 1 << i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo6269a(int i, boolean z) {
            if (i >= 64) {
                m9972b();
                this.f5579d.mo6269a(i - 64, z);
                return;
            }
            boolean z2 = (this.f5578c & f5577b) != 0;
            long j = (1 << i) - 1;
            this.f5578c = (((j ^ -1) & this.f5578c) << 1) | (this.f5578c & j);
            if (z) {
                mo6268a(i);
            } else {
                mo6270b(i);
            }
            if (z2 || this.f5579d != null) {
                m9972b();
                this.f5579d.mo6269a(0, z2);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo6270b(int i) {
            if (i < 64) {
                this.f5578c &= (1 << i) ^ -1;
            } else if (this.f5579d != null) {
                this.f5579d.mo6270b(i - 64);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo6271c(int i) {
            if (i < 64) {
                return (this.f5578c & (1 << i)) != 0;
            }
            m9972b();
            return this.f5579d.mo6271c(i - 64);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public boolean mo6272d(int i) {
            if (i >= 64) {
                m9972b();
                return this.f5579d.mo6272d(i - 64);
            }
            long j = 1 << i;
            boolean z = (this.f5578c & j) != 0;
            this.f5578c &= j ^ -1;
            long j2 = j - 1;
            this.f5578c = Long.rotateRight((j2 ^ -1) & this.f5578c, 1) | (this.f5578c & j2);
            if (this.f5579d == null) {
                return z;
            }
            if (this.f5579d.mo6271c(0)) {
                mo6268a(63);
            }
            this.f5579d.mo6272d(0);
            return z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public int mo6273e(int i) {
            return this.f5579d == null ? i >= 64 ? Long.bitCount(this.f5578c) : Long.bitCount(this.f5578c & ((1 << i) - 1)) : i < 64 ? Long.bitCount(this.f5578c & ((1 << i) - 1)) : this.f5579d.mo6273e(i - 64) + Long.bitCount(this.f5578c);
        }

        public String toString() {
            return this.f5579d == null ? Long.toBinaryString(this.f5578c) : this.f5579d.toString() + "xx" + Long.toBinaryString(this.f5578c);
        }
    }

    /* renamed from: android.support.v7.widget.ac$b */
    interface C1667b {
        /* renamed from: a */
        int mo6275a();

        /* renamed from: a */
        int mo6276a(View view);

        /* renamed from: a */
        void mo6277a(int i);

        /* renamed from: a */
        void mo6278a(View view, int i);

        /* renamed from: a */
        void mo6279a(View view, int i, ViewGroup.LayoutParams layoutParams);

        /* renamed from: b */
        C1732az.C1774x mo6280b(View view);

        /* renamed from: b */
        View mo6281b(int i);

        /* renamed from: b */
        void mo6282b();

        /* renamed from: c */
        void mo6283c(int i);

        /* renamed from: c */
        void mo6284c(View view);

        /* renamed from: d */
        void mo6285d(View view);
    }

    C1665ac(C1667b bVar) {
        this.f5573a = bVar;
    }

    /* renamed from: f */
    private int m9952f(int i) {
        if (i < 0) {
            return -1;
        }
        int a = this.f5573a.mo6275a();
        int i2 = i;
        while (i2 < a) {
            int e = i - (i2 - this.f5574b.mo6273e(i2));
            if (e == 0) {
                while (this.f5574b.mo6271c(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += e;
        }
        return -1;
    }

    /* renamed from: g */
    private void m9953g(View view) {
        this.f5575c.add(view);
        this.f5573a.mo6284c(view);
    }

    /* renamed from: h */
    private boolean m9954h(View view) {
        if (!this.f5575c.remove(view)) {
            return false;
        }
        this.f5573a.mo6285d(view);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo6249a() {
        this.f5574b.mo6267a();
        for (int size = this.f5575c.size() - 1; size >= 0; size--) {
            this.f5573a.mo6285d(this.f5575c.get(size));
            this.f5575c.remove(size);
        }
        this.f5573a.mo6282b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo6250a(int i) {
        int f = m9952f(i);
        View b = this.f5573a.mo6281b(f);
        if (b != null) {
            if (this.f5574b.mo6272d(f)) {
                m9954h(b);
            }
            this.f5573a.mo6277a(f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo6251a(View view) {
        int a = this.f5573a.mo6276a(view);
        if (a >= 0) {
            if (this.f5574b.mo6272d(a)) {
                m9954h(view);
            }
            this.f5573a.mo6277a(a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo6252a(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int a = i < 0 ? this.f5573a.mo6275a() : m9952f(i);
        this.f5574b.mo6269a(a, z);
        if (z) {
            m9953g(view);
        }
        this.f5573a.mo6279a(view, a, layoutParams);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo6253a(View view, int i, boolean z) {
        int a = i < 0 ? this.f5573a.mo6275a() : m9952f(i);
        this.f5574b.mo6269a(a, z);
        if (z) {
            m9953g(view);
        }
        this.f5573a.mo6278a(view, a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo6254a(View view, boolean z) {
        mo6253a(view, -1, z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo6255b() {
        return this.f5573a.mo6275a() - this.f5575c.size();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo6256b(View view) {
        int a = this.f5573a.mo6276a(view);
        if (a != -1 && !this.f5574b.mo6271c(a)) {
            return a - this.f5574b.mo6273e(a);
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public View mo6257b(int i) {
        return this.f5573a.mo6281b(m9952f(i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo6258c() {
        return this.f5573a.mo6275a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public View mo6259c(int i) {
        int size = this.f5575c.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = this.f5575c.get(i2);
            C1732az.C1774x b = this.f5573a.mo6280b(view);
            if (b.getLayoutPosition() == i && !b.isInvalid() && !b.isRemoved()) {
                return view;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo6260c(View view) {
        return this.f5575c.contains(view);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public View mo6261d(int i) {
        return this.f5573a.mo6281b(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo6262d(View view) {
        int a = this.f5573a.mo6276a(view);
        if (a < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        this.f5574b.mo6268a(a);
        m9953g(view);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo6263e(int i) {
        int f = m9952f(i);
        this.f5574b.mo6272d(f);
        this.f5573a.mo6283c(f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo6264e(View view) {
        int a = this.f5573a.mo6276a(view);
        if (a < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        } else if (!this.f5574b.mo6271c(a)) {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        } else {
            this.f5574b.mo6270b(a);
            m9954h(view);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo6265f(View view) {
        int a = this.f5573a.mo6276a(view);
        if (a == -1) {
            if (m9954h(view)) {
            }
            return true;
        } else if (!this.f5574b.mo6271c(a)) {
            return false;
        } else {
            this.f5574b.mo6272d(a);
            if (!m9954h(view)) {
            }
            this.f5573a.mo6277a(a);
            return true;
        }
    }

    public String toString() {
        return this.f5574b.toString() + ", hidden list:" + this.f5575c.size();
    }
}
