package android.support.constraint.p003a;

import java.util.Arrays;

/* renamed from: android.support.constraint.a.h */
public class C0096h {

    /* renamed from: a */
    public static final int f599a = 0;

    /* renamed from: b */
    public static final int f600b = 1;

    /* renamed from: c */
    public static final int f601c = 2;

    /* renamed from: d */
    public static final int f602d = 3;

    /* renamed from: e */
    public static final int f603e = 4;

    /* renamed from: f */
    public static final int f604f = 5;

    /* renamed from: g */
    public static final int f605g = 6;

    /* renamed from: h */
    public static final int f606h = 7;

    /* renamed from: m */
    static final int f607m = 7;

    /* renamed from: s */
    private static final boolean f608s = false;

    /* renamed from: t */
    private static int f609t = 1;

    /* renamed from: u */
    private static int f610u = 1;

    /* renamed from: v */
    private static int f611v = 1;

    /* renamed from: w */
    private static int f612w = 1;

    /* renamed from: x */
    private static int f613x = 1;

    /* renamed from: i */
    public int f614i = -1;

    /* renamed from: j */
    int f615j = -1;

    /* renamed from: k */
    public int f616k = 0;

    /* renamed from: l */
    public float f617l;

    /* renamed from: n */
    float[] f618n = new float[7];

    /* renamed from: o */
    C0098a f619o;

    /* renamed from: p */
    C0087b[] f620p = new C0087b[8];

    /* renamed from: q */
    int f621q = 0;

    /* renamed from: r */
    public int f622r = 0;

    /* renamed from: y */
    private String f623y;

    /* renamed from: android.support.constraint.a.h$a */
    public enum C0098a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public C0096h(C0098a aVar, String str) {
        this.f619o = aVar;
    }

    public C0096h(String str, C0098a aVar) {
        this.f623y = str;
        this.f619o = aVar;
    }

    /* renamed from: a */
    static void m519a() {
        f610u++;
    }

    /* renamed from: b */
    private static String m520b(C0098a aVar, String str) {
        if (str != null) {
            return str + f610u;
        }
        switch (aVar) {
            case UNRESTRICTED:
                StringBuilder append = new StringBuilder().append("U");
                int i = f611v + 1;
                f611v = i;
                return append.append(i).toString();
            case CONSTANT:
                StringBuilder append2 = new StringBuilder().append("C");
                int i2 = f612w + 1;
                f612w = i2;
                return append2.append(i2).toString();
            case SLACK:
                StringBuilder append3 = new StringBuilder().append("S");
                int i3 = f609t + 1;
                f609t = i3;
                return append3.append(i3).toString();
            case ERROR:
                StringBuilder append4 = new StringBuilder().append("e");
                int i4 = f610u + 1;
                f610u = i4;
                return append4.append(i4).toString();
            case UNKNOWN:
                StringBuilder append5 = new StringBuilder().append("V");
                int i5 = f613x + 1;
                f613x = i5;
                return append5.append(i5).toString();
            default:
                throw new AssertionError(aVar.name());
        }
    }

    /* renamed from: a */
    public final void mo442a(C0087b bVar) {
        int i = 0;
        while (i < this.f621q) {
            if (this.f620p[i] != bVar) {
                i++;
            } else {
                return;
            }
        }
        if (this.f621q >= this.f620p.length) {
            this.f620p = (C0087b[]) Arrays.copyOf(this.f620p, this.f620p.length * 2);
        }
        this.f620p[this.f621q] = bVar;
        this.f621q++;
    }

    /* renamed from: a */
    public void mo443a(C0098a aVar, String str) {
        this.f619o = aVar;
    }

    /* renamed from: a */
    public void mo444a(String str) {
        this.f623y = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo445b() {
        for (int i = 0; i < 7; i++) {
            this.f618n[i] = 0.0f;
        }
    }

    /* renamed from: b */
    public final void mo446b(C0087b bVar) {
        int i = this.f621q;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f620p[i2] == bVar) {
                for (int i3 = 0; i3 < (i - i2) - 1; i3++) {
                    this.f620p[i2 + i3] = this.f620p[i2 + i3 + 1];
                }
                this.f621q--;
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public String mo447c() {
        boolean z = true;
        boolean z2 = false;
        String str = this + "[";
        int i = 0;
        while (i < this.f618n.length) {
            String str2 = str + this.f618n[i];
            if (this.f618n[i] > 0.0f) {
                z2 = false;
            } else if (this.f618n[i] < 0.0f) {
                z2 = true;
            }
            if (this.f618n[i] != 0.0f) {
                z = false;
            }
            str = i < this.f618n.length + -1 ? str2 + ", " : str2 + "] ";
            i++;
        }
        String str3 = z2 ? str + " (-)" : str;
        return z ? str3 + " (*)" : str3;
    }

    /* renamed from: c */
    public final void mo448c(C0087b bVar) {
        int i = this.f621q;
        for (int i2 = 0; i2 < i; i2++) {
            this.f620p[i2].f541d.mo73a(this.f620p[i2], bVar, false);
        }
        this.f621q = 0;
    }

    /* renamed from: d */
    public void mo449d() {
        this.f623y = null;
        this.f619o = C0098a.UNKNOWN;
        this.f616k = 0;
        this.f614i = -1;
        this.f615j = -1;
        this.f617l = 0.0f;
        this.f621q = 0;
        this.f622r = 0;
    }

    /* renamed from: e */
    public String mo450e() {
        return this.f623y;
    }

    public String toString() {
        return "" + this.f623y;
    }
}
