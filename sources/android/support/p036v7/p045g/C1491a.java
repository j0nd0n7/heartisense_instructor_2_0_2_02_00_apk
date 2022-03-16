package android.support.p036v7.p045g;

import android.support.annotation.C0019an;
import android.support.annotation.C0021ap;
import android.support.p036v7.p045g.C1516g;
import android.support.p036v7.p045g.C1519h;
import android.util.Log;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;

/* renamed from: android.support.v7.g.a */
public class C1491a<T> {

    /* renamed from: a */
    static final String f4621a = "AsyncListUtil";

    /* renamed from: b */
    static final boolean f4622b = false;

    /* renamed from: c */
    final Class<T> f4623c;

    /* renamed from: d */
    final int f4624d;

    /* renamed from: e */
    final C1494a<T> f4625e;

    /* renamed from: f */
    final C1495b f4626f;

    /* renamed from: g */
    final C1519h<T> f4627g;

    /* renamed from: h */
    final C1516g.C1518b<T> f4628h;

    /* renamed from: i */
    final C1516g.C1517a<T> f4629i;

    /* renamed from: j */
    final int[] f4630j = new int[2];

    /* renamed from: k */
    final int[] f4631k = new int[2];

    /* renamed from: l */
    final int[] f4632l = new int[2];

    /* renamed from: m */
    boolean f4633m;

    /* renamed from: n */
    int f4634n = 0;

    /* renamed from: o */
    int f4635o = 0;

    /* renamed from: p */
    int f4636p = this.f4635o;

    /* renamed from: q */
    final SparseIntArray f4637q = new SparseIntArray();

    /* renamed from: r */
    private int f4638r = 0;

    /* renamed from: s */
    private final C1516g.C1518b<T> f4639s = new C1516g.C1518b<T>() {
        /* renamed from: a */
        private void m8736a() {
            for (int i = 0; i < C1491a.this.f4627g.mo5105a(); i++) {
                C1491a.this.f4629i.mo5053a(C1491a.this.f4627g.mo5108b(i));
            }
            C1491a.this.f4627g.mo5109b();
        }

        /* renamed from: a */
        private boolean m8737a(int i) {
            return i == C1491a.this.f4636p;
        }

        /* renamed from: a */
        public void mo5047a(int i, int i2) {
            if (m8737a(i)) {
                C1491a.this.f4634n = i2;
                C1491a.this.f4626f.mo5058a();
                C1491a.this.f4635o = C1491a.this.f4636p;
                m8736a();
                C1491a.this.f4633m = false;
                C1491a.this.mo5046d();
            }
        }

        /* renamed from: a */
        public void mo5048a(int i, C1519h.C1520a<T> aVar) {
            if (!m8737a(i)) {
                C1491a.this.f4629i.mo5053a(aVar);
                return;
            }
            C1519h.C1520a<T> a = C1491a.this.f4627g.mo5106a(aVar);
            if (a != null) {
                Log.e(C1491a.f4621a, "duplicate tile @" + a.f4742b);
                C1491a.this.f4629i.mo5053a(a);
            }
            int i2 = aVar.f4743c + aVar.f4742b;
            int i3 = 0;
            while (i3 < C1491a.this.f4637q.size()) {
                int keyAt = C1491a.this.f4637q.keyAt(i3);
                if (aVar.f4742b > keyAt || keyAt >= i2) {
                    i3++;
                } else {
                    C1491a.this.f4637q.removeAt(i3);
                    C1491a.this.f4626f.mo5059a(keyAt);
                }
            }
        }

        /* renamed from: b */
        public void mo5049b(int i, int i2) {
            if (m8737a(i)) {
                C1519h.C1520a<T> c = C1491a.this.f4627g.mo5110c(i2);
                if (c == null) {
                    Log.e(C1491a.f4621a, "tile not found @" + i2);
                } else {
                    C1491a.this.f4629i.mo5053a(c);
                }
            }
        }
    };

    /* renamed from: t */
    private final C1516g.C1517a<T> f4640t = new C1516g.C1517a<T>() {

        /* renamed from: a */
        final SparseBooleanArray f4642a = new SparseBooleanArray();

        /* renamed from: c */
        private C1519h.C1520a<T> f4644c;

        /* renamed from: d */
        private int f4645d;

        /* renamed from: e */
        private int f4646e;

        /* renamed from: f */
        private int f4647f;

        /* renamed from: g */
        private int f4648g;

        /* renamed from: a */
        private C1519h.C1520a<T> m8741a() {
            if (this.f4644c == null) {
                return new C1519h.C1520a<>(C1491a.this.f4623c, C1491a.this.f4624d);
            }
            C1519h.C1520a<T> aVar = this.f4644c;
            this.f4644c = this.f4644c.f4744d;
            return aVar;
        }

        /* renamed from: a */
        private void m8742a(int i, int i2, int i3, boolean z) {
            int i4 = i;
            while (i4 <= i2) {
                C1491a.this.f4629i.mo5051a(z ? (i2 + i) - i4 : i4, i3);
                i4 += C1491a.this.f4624d;
            }
        }

        /* renamed from: a */
        private void m8743a(String str, Object... objArr) {
            Log.d(C1491a.f4621a, "[BKGR] " + String.format(str, objArr));
        }

        /* renamed from: b */
        private int m8744b(int i) {
            return i - (i % C1491a.this.f4624d);
        }

        /* renamed from: b */
        private void m8745b(C1519h.C1520a<T> aVar) {
            this.f4642a.put(aVar.f4742b, true);
            C1491a.this.f4628h.mo5048a(this.f4645d, aVar);
        }

        /* renamed from: c */
        private boolean m8746c(int i) {
            return this.f4642a.get(i);
        }

        /* renamed from: d */
        private void m8747d(int i) {
            this.f4642a.delete(i);
            C1491a.this.f4628h.mo5049b(this.f4645d, i);
        }

        /* renamed from: e */
        private void m8748e(int i) {
            int b = C1491a.this.f4625e.mo5057b();
            while (this.f4642a.size() >= b) {
                int keyAt = this.f4642a.keyAt(0);
                int keyAt2 = this.f4642a.keyAt(this.f4642a.size() - 1);
                int i2 = this.f4647f - keyAt;
                int i3 = keyAt2 - this.f4648g;
                if (i2 > 0 && (i2 >= i3 || i == 2)) {
                    m8747d(keyAt);
                } else if (i3 <= 0) {
                    return;
                } else {
                    if (i2 < i3 || i == 1) {
                        m8747d(keyAt2);
                    } else {
                        return;
                    }
                }
            }
        }

        /* renamed from: a */
        public void mo5050a(int i) {
            this.f4645d = i;
            this.f4642a.clear();
            this.f4646e = C1491a.this.f4625e.mo5054a();
            C1491a.this.f4628h.mo5047a(this.f4645d, this.f4646e);
        }

        /* renamed from: a */
        public void mo5051a(int i, int i2) {
            if (!m8746c(i)) {
                C1519h.C1520a a = m8741a();
                a.f4742b = i;
                a.f4743c = Math.min(C1491a.this.f4624d, this.f4646e - a.f4742b);
                C1491a.this.f4625e.mo5056a(a.f4741a, a.f4742b, a.f4743c);
                m8748e(i2);
                m8745b(a);
            }
        }

        /* renamed from: a */
        public void mo5052a(int i, int i2, int i3, int i4, int i5) {
            if (i <= i2) {
                int b = m8744b(i);
                int b2 = m8744b(i2);
                this.f4647f = m8744b(i3);
                this.f4648g = m8744b(i4);
                if (i5 == 1) {
                    m8742a(this.f4647f, b2, i5, true);
                    m8742a(C1491a.this.f4624d + b2, this.f4648g, i5, false);
                    return;
                }
                m8742a(b, this.f4648g, i5, false);
                m8742a(this.f4647f, b - C1491a.this.f4624d, i5, true);
            }
        }

        /* renamed from: a */
        public void mo5053a(C1519h.C1520a<T> aVar) {
            C1491a.this.f4625e.mo5055a(aVar.f4741a, aVar.f4743c);
            aVar.f4744d = this.f4644c;
            this.f4644c = aVar;
        }
    };

    /* renamed from: android.support.v7.g.a$a */
    public static abstract class C1494a<T> {
        @C0021ap
        /* renamed from: a */
        public abstract int mo5054a();

        @C0021ap
        /* renamed from: a */
        public void mo5055a(T[] tArr, int i) {
        }

        @C0021ap
        /* renamed from: a */
        public abstract void mo5056a(T[] tArr, int i, int i2);

        @C0021ap
        /* renamed from: b */
        public int mo5057b() {
            return 10;
        }
    }

    /* renamed from: android.support.v7.g.a$b */
    public static abstract class C1495b {

        /* renamed from: a */
        public static final int f4649a = 0;

        /* renamed from: b */
        public static final int f4650b = 1;

        /* renamed from: c */
        public static final int f4651c = 2;

        @C0019an
        /* renamed from: a */
        public abstract void mo5058a();

        @C0019an
        /* renamed from: a */
        public abstract void mo5059a(int i);

        @C0019an
        /* renamed from: a */
        public abstract void mo5060a(int[] iArr);

        @C0019an
        /* renamed from: a */
        public void mo5061a(int[] iArr, int[] iArr2, int i) {
            int i2 = (iArr[1] - iArr[0]) + 1;
            int i3 = i2 / 2;
            iArr2[0] = iArr[0] - (i == 1 ? i2 : i3);
            int i4 = iArr[1];
            if (i != 2) {
                i2 = i3;
            }
            iArr2[1] = i4 + i2;
        }
    }

    public C1491a(Class<T> cls, int i, C1494a<T> aVar, C1495b bVar) {
        this.f4623c = cls;
        this.f4624d = i;
        this.f4625e = aVar;
        this.f4626f = bVar;
        this.f4627g = new C1519h<>(this.f4624d);
        C1506e eVar = new C1506e();
        this.f4628h = eVar.mo5078a(this.f4639s);
        this.f4629i = eVar.mo5077a(this.f4640t);
        mo5044b();
    }

    /* renamed from: e */
    private boolean m8729e() {
        return this.f4636p != this.f4635o;
    }

    /* renamed from: a */
    public T mo5041a(int i) {
        if (i < 0 || i >= this.f4634n) {
            throw new IndexOutOfBoundsException(i + " is not within 0 and " + this.f4634n);
        }
        T a = this.f4627g.mo5107a(i);
        if (a == null && !m8729e()) {
            this.f4637q.put(i, 0);
        }
        return a;
    }

    /* renamed from: a */
    public void mo5042a() {
        if (!m8729e()) {
            mo5046d();
            this.f4633m = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo5043a(String str, Object... objArr) {
        Log.d(f4621a, "[MAIN] " + String.format(str, objArr));
    }

    /* renamed from: b */
    public void mo5044b() {
        this.f4637q.clear();
        C1516g.C1517a<T> aVar = this.f4629i;
        int i = this.f4636p + 1;
        this.f4636p = i;
        aVar.mo5050a(i);
    }

    /* renamed from: c */
    public int mo5045c() {
        return this.f4634n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo5046d() {
        this.f4626f.mo5060a(this.f4630j);
        if (this.f4630j[0] <= this.f4630j[1] && this.f4630j[0] >= 0 && this.f4630j[1] < this.f4634n) {
            if (!this.f4633m) {
                this.f4638r = 0;
            } else if (this.f4630j[0] > this.f4631k[1] || this.f4631k[0] > this.f4630j[1]) {
                this.f4638r = 0;
            } else if (this.f4630j[0] < this.f4631k[0]) {
                this.f4638r = 1;
            } else if (this.f4630j[0] > this.f4631k[0]) {
                this.f4638r = 2;
            }
            this.f4631k[0] = this.f4630j[0];
            this.f4631k[1] = this.f4630j[1];
            this.f4626f.mo5061a(this.f4630j, this.f4632l, this.f4638r);
            this.f4632l[0] = Math.min(this.f4630j[0], Math.max(this.f4632l[0], 0));
            this.f4632l[1] = Math.max(this.f4630j[1], Math.min(this.f4632l[1], this.f4634n - 1));
            this.f4629i.mo5052a(this.f4630j[0], this.f4630j[1], this.f4632l[0], this.f4632l[1], this.f4638r);
        }
    }
}
