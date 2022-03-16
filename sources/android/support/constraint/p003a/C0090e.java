package android.support.constraint.p003a;

import android.support.constraint.p003a.C0096h;
import android.support.constraint.p003a.p004a.C0060e;
import android.support.constraint.p003a.p004a.C0070h;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: android.support.constraint.a.e */
public class C0090e {

    /* renamed from: a */
    public static final boolean f546a = false;

    /* renamed from: h */
    public static C0092f f547h;

    /* renamed from: i */
    private static final boolean f548i = false;

    /* renamed from: j */
    private static int f549j = 1000;

    /* renamed from: b */
    int f550b;

    /* renamed from: c */
    C0087b[] f551c;

    /* renamed from: d */
    public boolean f552d;

    /* renamed from: e */
    int f553e;

    /* renamed from: f */
    int f554f;

    /* renamed from: g */
    final C0088c f555g;

    /* renamed from: k */
    private HashMap<String, C0096h> f556k;

    /* renamed from: l */
    private C0091a f557l;

    /* renamed from: m */
    private int f558m;

    /* renamed from: n */
    private int f559n;

    /* renamed from: o */
    private boolean[] f560o;

    /* renamed from: p */
    private int f561p;

    /* renamed from: q */
    private C0096h[] f562q;

    /* renamed from: r */
    private int f563r;

    /* renamed from: s */
    private C0087b[] f564s;

    /* renamed from: t */
    private final C0091a f565t;

    /* renamed from: android.support.constraint.a.e$a */
    interface C0091a {
        /* renamed from: a */
        C0096h mo383a(C0090e eVar, boolean[] zArr);

        /* renamed from: a */
        void mo384a(C0091a aVar);

        /* renamed from: d */
        void mo397d(C0096h hVar);

        /* renamed from: f */
        boolean mo399f();

        /* renamed from: g */
        void mo400g();

        /* renamed from: h */
        C0096h mo401h();
    }

    public C0090e() {
        this.f550b = 0;
        this.f556k = null;
        this.f558m = 32;
        this.f559n = this.f558m;
        this.f551c = null;
        this.f552d = false;
        this.f560o = new boolean[this.f558m];
        this.f553e = 1;
        this.f554f = 0;
        this.f561p = this.f558m;
        this.f562q = new C0096h[f549j];
        this.f563r = 0;
        this.f564s = new C0087b[this.f558m];
        this.f551c = new C0087b[this.f558m];
        m467p();
        this.f555g = new C0088c();
        this.f557l = new C0089d(this.f555g);
        this.f565t = new C0087b(this.f555g);
    }

    /* renamed from: a */
    private final int m450a(C0091a aVar, boolean z) {
        boolean z2;
        if (f547h != null) {
            f547h.f577h++;
        }
        boolean z3 = false;
        for (int i = 0; i < this.f553e; i++) {
            this.f560o[i] = false;
        }
        int i2 = 0;
        while (!z3) {
            if (f547h != null) {
                f547h.f578i++;
            }
            int i3 = i2 + 1;
            if (i3 >= this.f553e * 2) {
                return i3;
            }
            if (aVar.mo401h() != null) {
                this.f560o[aVar.mo401h().f614i] = true;
            }
            C0096h a = aVar.mo383a(this, this.f560o);
            if (a != null) {
                if (this.f560o[a.f614i]) {
                    return i3;
                }
                this.f560o[a.f614i] = true;
            }
            if (a != null) {
                float f = Float.MAX_VALUE;
                int i4 = -1;
                for (int i5 = 0; i5 < this.f554f; i5++) {
                    C0087b bVar = this.f551c[i5];
                    if (bVar.f538a.f619o != C0096h.C0098a.UNRESTRICTED && !bVar.f542e && bVar.mo387a(a)) {
                        float b = bVar.f541d.mo79b(a);
                        if (b < 0.0f) {
                            float f2 = (-bVar.f539b) / b;
                            if (f2 < f) {
                                i4 = i5;
                                f = f2;
                            }
                        }
                    }
                }
                if (i4 > -1) {
                    C0087b bVar2 = this.f551c[i4];
                    bVar2.f538a.f615j = -1;
                    if (f547h != null) {
                        f547h.f579j++;
                    }
                    bVar2.mo395c(a);
                    bVar2.f538a.f615j = i4;
                    bVar2.f538a.mo448c(bVar2);
                    z2 = z3;
                } else {
                    z2 = true;
                }
            } else {
                z2 = true;
            }
            z3 = z2;
            i2 = i3;
        }
        return i2;
    }

    /* renamed from: a */
    public static C0087b m451a(C0090e eVar, C0096h hVar, C0096h hVar2, int i, float f, C0096h hVar3, C0096h hVar4, int i2, boolean z) {
        C0087b c = eVar.mo424c();
        c.mo379a(hVar, hVar2, i, f, hVar3, hVar4, i2);
        if (z) {
            c.mo375a(eVar, 4);
        }
        return c;
    }

    /* renamed from: a */
    public static C0087b m452a(C0090e eVar, C0096h hVar, C0096h hVar2, int i, boolean z) {
        C0087b c = eVar.mo424c();
        c.mo378a(hVar, hVar2, i);
        if (z) {
            eVar.m456a(c, 1);
        }
        return c;
    }

    /* renamed from: a */
    public static C0087b m453a(C0090e eVar, C0096h hVar, C0096h hVar2, C0096h hVar3, float f, boolean z) {
        C0087b c = eVar.mo424c();
        if (z) {
            eVar.m461b(c);
        }
        return c.mo380a(hVar, hVar2, hVar3, f);
    }

    /* renamed from: a */
    public static C0092f m454a() {
        return f547h;
    }

    /* renamed from: a */
    private C0096h m455a(C0096h.C0098a aVar, String str) {
        C0096h hVar;
        C0096h a = this.f555g.f544b.mo439a();
        if (a == null) {
            C0096h hVar2 = new C0096h(aVar, str);
            hVar2.mo443a(aVar, str);
            hVar = hVar2;
        } else {
            a.mo449d();
            a.mo443a(aVar, str);
            hVar = a;
        }
        if (this.f563r >= f549j) {
            f549j *= 2;
            this.f562q = (C0096h[]) Arrays.copyOf(this.f562q, f549j);
        }
        C0096h[] hVarArr = this.f562q;
        int i = this.f563r;
        this.f563r = i + 1;
        hVarArr[i] = hVar;
        return hVar;
    }

    /* renamed from: a */
    private void m456a(C0087b bVar, int i) {
        mo410a(bVar, i, 0);
    }

    /* renamed from: b */
    private int m457b(C0091a aVar) {
        boolean z;
        boolean z2;
        int i = 0;
        while (true) {
            if (i >= this.f554f) {
                z = false;
                break;
            } else if (this.f551c[i].f538a.f619o != C0096h.C0098a.UNRESTRICTED && this.f551c[i].f539b < 0.0f) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (!z) {
            return 0;
        }
        boolean z3 = false;
        int i2 = 0;
        while (!z3) {
            if (f547h != null) {
                f547h.f580k++;
            }
            int i3 = i2 + 1;
            float f = Float.MAX_VALUE;
            int i4 = 0;
            int i5 = -1;
            int i6 = -1;
            for (int i7 = 0; i7 < this.f554f; i7++) {
                C0087b bVar = this.f551c[i7];
                if (bVar.f538a.f619o != C0096h.C0098a.UNRESTRICTED && !bVar.f542e && bVar.f539b < 0.0f) {
                    float f2 = f;
                    int i8 = i4;
                    int i9 = i5;
                    int i10 = i6;
                    for (int i11 = 1; i11 < this.f553e; i11++) {
                        C0096h hVar = this.f555g.f545c[i11];
                        float b = bVar.f541d.mo79b(hVar);
                        if (b > 0.0f) {
                            float f3 = f2;
                            int i12 = 0;
                            while (i12 < 7) {
                                float f4 = hVar.f618n[i12] / b;
                                if ((f4 >= f3 || i12 != i8) && i12 <= i8) {
                                    f4 = f3;
                                } else {
                                    i10 = i11;
                                    i9 = i7;
                                    i8 = i12;
                                }
                                i12++;
                                f3 = f4;
                            }
                            f2 = f3;
                        }
                    }
                    i6 = i10;
                    i5 = i9;
                    i4 = i8;
                    f = f2;
                }
            }
            if (i5 != -1) {
                C0087b bVar2 = this.f551c[i5];
                bVar2.f538a.f615j = -1;
                if (f547h != null) {
                    f547h.f579j++;
                }
                bVar2.mo395c(this.f555g.f545c[i6]);
                bVar2.f538a.f615j = i5;
                bVar2.f538a.mo448c(bVar2);
                z2 = z3;
            } else {
                z2 = true;
            }
            if (i3 > this.f553e / 2) {
                z2 = true;
            }
            z3 = z2;
            i2 = i3;
        }
        return i2;
    }

    /* renamed from: b */
    public static C0087b m458b(C0090e eVar, C0096h hVar, C0096h hVar2, int i, boolean z) {
        C0096h d = eVar.mo426d();
        C0087b c = eVar.mo424c();
        c.mo381a(hVar, hVar2, d, i);
        if (z) {
            eVar.m456a(c, (int) (c.f541d.mo79b(d) * -1.0f));
        }
        return c;
    }

    /* renamed from: b */
    private C0096h m459b(String str, C0096h.C0098a aVar) {
        if (f547h != null) {
            f547h.f581l++;
        }
        if (this.f553e + 1 >= this.f559n) {
            m466o();
        }
        C0096h a = m455a(aVar, (String) null);
        a.mo444a(str);
        this.f550b++;
        this.f553e++;
        a.f614i = this.f550b;
        if (this.f556k == null) {
            this.f556k = new HashMap<>();
        }
        this.f556k.put(str, a);
        this.f555g.f545c[this.f550b] = a;
        return a;
    }

    /* renamed from: b */
    private String m460b(int i) {
        int i2 = ((i * 4) / 1024) / 1024;
        if (i2 > 0) {
            return "" + i2 + " Mb";
        }
        int i3 = (i * 4) / 1024;
        return i3 > 0 ? "" + i3 + " Kb" : "" + (i * 4) + " bytes";
    }

    /* renamed from: b */
    private void m461b(C0087b bVar) {
        bVar.mo375a(this, 0);
    }

    /* renamed from: c */
    public static C0087b m462c(C0090e eVar, C0096h hVar, C0096h hVar2, int i, boolean z) {
        C0096h d = eVar.mo426d();
        C0087b c = eVar.mo424c();
        c.mo389b(hVar, hVar2, d, i);
        if (z) {
            eVar.m456a(c, (int) (c.f541d.mo79b(d) * -1.0f));
        }
        return c;
    }

    /* renamed from: c */
    private String m463c(int i) {
        return i == 1 ? "LOW" : i == 2 ? "MEDIUM" : i == 3 ? "HIGH" : i == 4 ? "HIGHEST" : i == 5 ? "EQUALITY" : i == 6 ? "FIXED" : "NONE";
    }

    /* renamed from: c */
    private final void m464c(C0087b bVar) {
        if (this.f554f > 0) {
            bVar.f541d.mo74a(bVar, this.f551c);
            if (bVar.f541d.f205a == 0) {
                bVar.f542e = true;
            }
        }
    }

    /* renamed from: d */
    private final void m465d(C0087b bVar) {
        if (this.f551c[this.f554f] != null) {
            this.f555g.f543a.mo441a(this.f551c[this.f554f]);
        }
        this.f551c[this.f554f] = bVar;
        bVar.f538a.f615j = this.f554f;
        this.f554f++;
        bVar.f538a.mo448c(bVar);
    }

    /* renamed from: o */
    private void m466o() {
        this.f558m *= 2;
        this.f551c = (C0087b[]) Arrays.copyOf(this.f551c, this.f558m);
        this.f555g.f545c = (C0096h[]) Arrays.copyOf(this.f555g.f545c, this.f558m);
        this.f560o = new boolean[this.f558m];
        this.f559n = this.f558m;
        this.f561p = this.f558m;
        if (f547h != null) {
            f547h.f573d++;
            f547h.f585p = Math.max(f547h.f585p, (long) this.f558m);
            f547h.f569D = f547h.f585p;
        }
    }

    /* renamed from: p */
    private void m467p() {
        for (int i = 0; i < this.f551c.length; i++) {
            C0087b bVar = this.f551c[i];
            if (bVar != null) {
                this.f555g.f543a.mo441a(bVar);
            }
            this.f551c[i] = null;
        }
    }

    /* renamed from: q */
    private void m468q() {
        for (int i = 0; i < this.f554f; i++) {
            C0087b bVar = this.f551c[i];
            bVar.f538a.f617l = bVar.f539b;
        }
    }

    /* renamed from: r */
    private void m469r() {
        m470s();
        String str = "";
        for (int i = 0; i < this.f554f; i++) {
            str = (str + this.f551c[i]) + "\n";
        }
        System.out.println(str + this.f557l + "\n");
    }

    /* renamed from: s */
    private void m470s() {
        System.out.println("Display Rows (" + this.f554f + "x" + this.f553e + ")\n");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public float mo403a(String str) {
        C0096h a = mo407a(str, C0096h.C0098a.UNRESTRICTED);
        if (a == null) {
            return 0.0f;
        }
        return a.f617l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0087b mo404a(int i) {
        return this.f551c[i];
    }

    /* renamed from: a */
    public C0096h mo405a(int i, String str) {
        if (f547h != null) {
            f547h.f582m++;
        }
        if (this.f553e + 1 >= this.f559n) {
            m466o();
        }
        C0096h a = m455a(C0096h.C0098a.ERROR, str);
        this.f550b++;
        this.f553e++;
        a.f614i = this.f550b;
        a.f616k = i;
        this.f555g.f545c[this.f550b] = a;
        this.f557l.mo397d(a);
        return a;
    }

    /* renamed from: a */
    public C0096h mo406a(Object obj) {
        C0096h hVar = null;
        if (obj != null) {
            if (this.f553e + 1 >= this.f559n) {
                m466o();
            }
            if (obj instanceof C0060e) {
                hVar = ((C0060e) obj).mo115b();
                if (hVar == null) {
                    ((C0060e) obj).mo107a(this.f555g);
                    hVar = ((C0060e) obj).mo115b();
                }
                if (hVar.f614i == -1 || hVar.f614i > this.f550b || this.f555g.f545c[hVar.f614i] == null) {
                    if (hVar.f614i != -1) {
                        hVar.mo449d();
                    }
                    this.f550b++;
                    this.f553e++;
                    hVar.f614i = this.f550b;
                    hVar.f619o = C0096h.C0098a.UNRESTRICTED;
                    this.f555g.f545c[this.f550b] = hVar;
                }
            }
        }
        return hVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0096h mo407a(String str, C0096h.C0098a aVar) {
        if (this.f556k == null) {
            this.f556k = new HashMap<>();
        }
        C0096h hVar = this.f556k.get(str);
        return hVar == null ? m459b(str, aVar) : hVar;
    }

    /* renamed from: a */
    public void mo408a(C0070h hVar, C0070h hVar2, float f, int i) {
        C0096h a = mo406a((Object) hVar.mo185a(C0060e.C0064c.LEFT));
        C0096h a2 = mo406a((Object) hVar.mo185a(C0060e.C0064c.TOP));
        C0096h a3 = mo406a((Object) hVar.mo185a(C0060e.C0064c.RIGHT));
        C0096h a4 = mo406a((Object) hVar.mo185a(C0060e.C0064c.BOTTOM));
        C0096h a5 = mo406a((Object) hVar2.mo185a(C0060e.C0064c.LEFT));
        C0096h a6 = mo406a((Object) hVar2.mo185a(C0060e.C0064c.TOP));
        C0096h a7 = mo406a((Object) hVar2.mo185a(C0060e.C0064c.RIGHT));
        C0096h a8 = mo406a((Object) hVar2.mo185a(C0060e.C0064c.BOTTOM));
        C0087b c = mo424c();
        c.mo390b(a2, a4, a6, a8, (float) (Math.sin((double) f) * ((double) i)));
        mo409a(c);
        C0087b c2 = mo424c();
        c2.mo390b(a, a3, a5, a7, (float) (Math.cos((double) f) * ((double) i)));
        mo409a(c2);
    }

    /* renamed from: a */
    public void mo409a(C0087b bVar) {
        C0096h b;
        boolean z = true;
        if (bVar != null) {
            if (f547h != null) {
                f547h.f575f++;
                if (bVar.f542e) {
                    f547h.f576g++;
                }
            }
            if (this.f554f + 1 >= this.f561p || this.f553e + 1 >= this.f559n) {
                m466o();
            }
            if (!bVar.f542e) {
                m464c(bVar);
                if (!bVar.mo399f()) {
                    bVar.mo398e();
                    if (bVar.mo386a(this)) {
                        C0096h e = mo427e();
                        bVar.f538a = e;
                        m465d(bVar);
                        this.f565t.mo384a(bVar);
                        m450a(this.f565t, true);
                        if (e.f615j == -1) {
                            if (bVar.f538a == e && (b = bVar.mo391b(e)) != null) {
                                if (f547h != null) {
                                    f547h.f579j++;
                                }
                                bVar.mo395c(b);
                            }
                            if (!bVar.f542e) {
                                bVar.f538a.mo448c(bVar);
                            }
                            this.f554f--;
                        }
                    } else {
                        z = false;
                    }
                    if (!bVar.mo385a()) {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                z = false;
            }
            if (!z) {
                m465d(bVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo410a(C0087b bVar, int i, int i2) {
        bVar.mo393c(mo405a(i2, (String) null), i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo411a(C0091a aVar) {
        if (f547h != null) {
            f547h.f589t++;
            f547h.f590u = Math.max(f547h.f590u, (long) this.f553e);
            f547h.f591v = Math.max(f547h.f591v, (long) this.f554f);
        }
        m464c((C0087b) aVar);
        m457b(aVar);
        m450a(aVar, false);
        m468q();
    }

    /* renamed from: a */
    public void mo412a(C0092f fVar) {
        f547h = fVar;
    }

    /* renamed from: a */
    public void mo413a(C0096h hVar, int i) {
        C0087b c = mo424c();
        C0096h d = mo426d();
        d.f616k = 0;
        c.mo377a(hVar, i, d);
        mo409a(c);
    }

    /* renamed from: a */
    public void mo414a(C0096h hVar, int i, int i2) {
        int i3 = hVar.f615j;
        if (hVar.f615j != -1) {
            C0087b bVar = this.f551c[i3];
            if (bVar.f542e) {
                bVar.f539b = (float) i;
                return;
            }
            C0087b c = mo424c();
            c.mo388b(hVar, i);
            c.mo375a(this, i2);
            mo409a(c);
            return;
        }
        C0087b c2 = mo424c();
        c2.mo376a(hVar, i);
        c2.mo375a(this, i2);
        mo409a(c2);
    }

    /* renamed from: a */
    public void mo415a(C0096h hVar, C0096h hVar2, int i, float f, C0096h hVar3, C0096h hVar4, int i2, int i3) {
        C0087b c = mo424c();
        c.mo379a(hVar, hVar2, i, f, hVar3, hVar4, i2);
        if (i3 != 6) {
            c.mo375a(this, i3);
        }
        mo409a(c);
    }

    /* renamed from: a */
    public void mo416a(C0096h hVar, C0096h hVar2, int i, int i2) {
        C0087b c = mo424c();
        C0096h d = mo426d();
        d.f616k = 0;
        c.mo381a(hVar, hVar2, d, i);
        if (i2 != 6) {
            mo410a(c, (int) (c.f541d.mo79b(d) * -1.0f), i2);
        }
        mo409a(c);
    }

    /* renamed from: a */
    public void mo417a(C0096h hVar, C0096h hVar2, C0096h hVar3, C0096h hVar4, float f, int i) {
        C0087b c = mo424c();
        c.mo382a(hVar, hVar2, hVar3, hVar4, f);
        if (i != 6) {
            c.mo375a(this, i);
        }
        mo409a(c);
    }

    /* renamed from: a */
    public void mo418a(C0096h hVar, C0096h hVar2, boolean z) {
        C0087b c = mo424c();
        C0096h d = mo426d();
        d.f616k = 0;
        c.mo381a(hVar, hVar2, d, 0);
        if (z) {
            mo410a(c, (int) (c.f541d.mo79b(d) * -1.0f), 1);
        }
        mo409a(c);
    }

    /* renamed from: b */
    public int mo419b(Object obj) {
        C0096h b = ((C0060e) obj).mo115b();
        if (b != null) {
            return (int) (b.f617l + 0.5f);
        }
        return 0;
    }

    /* renamed from: b */
    public void mo420b() {
        for (C0096h hVar : this.f555g.f545c) {
            if (hVar != null) {
                hVar.mo449d();
            }
        }
        this.f555g.f544b.mo440a(this.f562q, this.f563r);
        this.f563r = 0;
        Arrays.fill(this.f555g.f545c, (Object) null);
        if (this.f556k != null) {
            this.f556k.clear();
        }
        this.f550b = 0;
        this.f557l.mo400g();
        this.f553e = 1;
        for (int i = 0; i < this.f554f; i++) {
            this.f551c[i].f540c = false;
        }
        m467p();
        this.f554f = 0;
    }

    /* renamed from: b */
    public void mo421b(C0096h hVar, int i) {
        int i2 = hVar.f615j;
        if (hVar.f615j != -1) {
            C0087b bVar = this.f551c[i2];
            if (bVar.f542e) {
                bVar.f539b = (float) i;
            } else if (bVar.f541d.f205a == 0) {
                bVar.f542e = true;
                bVar.f539b = (float) i;
            } else {
                C0087b c = mo424c();
                c.mo388b(hVar, i);
                mo409a(c);
            }
        } else {
            C0087b c2 = mo424c();
            c2.mo376a(hVar, i);
            mo409a(c2);
        }
    }

    /* renamed from: b */
    public void mo422b(C0096h hVar, C0096h hVar2, int i, int i2) {
        C0087b c = mo424c();
        C0096h d = mo426d();
        d.f616k = 0;
        c.mo389b(hVar, hVar2, d, i);
        if (i2 != 6) {
            mo410a(c, (int) (c.f541d.mo79b(d) * -1.0f), i2);
        }
        mo409a(c);
    }

    /* renamed from: b */
    public void mo423b(C0096h hVar, C0096h hVar2, boolean z) {
        C0087b c = mo424c();
        C0096h d = mo426d();
        d.f616k = 0;
        c.mo389b(hVar, hVar2, d, 0);
        if (z) {
            mo410a(c, (int) (c.f541d.mo79b(d) * -1.0f), 1);
        }
        mo409a(c);
    }

    /* renamed from: c */
    public C0087b mo424c() {
        C0087b a = this.f555g.f543a.mo439a();
        if (a == null) {
            a = new C0087b(this.f555g);
        } else {
            a.mo394c();
        }
        C0096h.m519a();
        return a;
    }

    /* renamed from: c */
    public C0087b mo425c(C0096h hVar, C0096h hVar2, int i, int i2) {
        C0087b c = mo424c();
        c.mo378a(hVar, hVar2, i);
        if (i2 != 6) {
            c.mo375a(this, i2);
        }
        mo409a(c);
        return c;
    }

    /* renamed from: d */
    public C0096h mo426d() {
        if (f547h != null) {
            f547h.f583n++;
        }
        if (this.f553e + 1 >= this.f559n) {
            m466o();
        }
        C0096h a = m455a(C0096h.C0098a.SLACK, (String) null);
        this.f550b++;
        this.f553e++;
        a.f614i = this.f550b;
        this.f555g.f545c[this.f550b] = a;
        return a;
    }

    /* renamed from: e */
    public C0096h mo427e() {
        if (f547h != null) {
            f547h.f584o++;
        }
        if (this.f553e + 1 >= this.f559n) {
            m466o();
        }
        C0096h a = m455a(C0096h.C0098a.SLACK, (String) null);
        this.f550b++;
        this.f553e++;
        a.f614i = this.f550b;
        this.f555g.f545c[this.f550b] = a;
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C0091a mo428f() {
        return this.f557l;
    }

    /* renamed from: g */
    public void mo429g() {
        boolean z = false;
        if (f547h != null) {
            f547h.f574e++;
        }
        if (this.f552d) {
            if (f547h != null) {
                f547h.f587r++;
            }
            int i = 0;
            while (true) {
                if (i >= this.f554f) {
                    z = true;
                    break;
                } else if (!this.f551c[i].f542e) {
                    break;
                } else {
                    i++;
                }
            }
            if (!z) {
                mo411a(this.f557l);
                return;
            }
            if (f547h != null) {
                f547h.f586q++;
            }
            m468q();
            return;
        }
        mo411a(this.f557l);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo430h() {
        m470s();
        String str = " #  ";
        for (int i = 0; i < this.f554f; i++) {
            str = (str + this.f551c[i].mo392b()) + "\n #  ";
        }
        if (this.f557l != null) {
            str = str + this.f557l + "\n";
        }
        System.out.println(str);
    }

    /* renamed from: i */
    public void mo431i() {
        m470s();
        String str = "";
        for (int i = 0; i < this.f554f; i++) {
            if (this.f551c[i].f538a.f619o == C0096h.C0098a.UNRESTRICTED) {
                str = (str + this.f551c[i].mo392b()) + "\n";
            }
        }
        System.out.println(str + this.f557l + "\n");
    }

    /* renamed from: j */
    public int mo432j() {
        int i = 0;
        for (int i2 = 0; i2 < this.f554f; i2++) {
            if (this.f551c[i2] != null) {
                i += this.f551c[i2].mo396d();
            }
        }
        return i;
    }

    /* renamed from: k */
    public int mo433k() {
        return this.f554f;
    }

    /* renamed from: l */
    public int mo434l() {
        return this.f550b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo435m() {
        int i = 0;
        for (int i2 = 0; i2 < this.f558m; i2++) {
            if (this.f551c[i2] != null) {
                i += this.f551c[i2].mo396d();
            }
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f554f; i4++) {
            if (this.f551c[i4] != null) {
                i3 += this.f551c[i4].mo396d();
            }
        }
        System.out.println("Linear System -> Table size: " + this.f558m + " (" + m460b(this.f558m * this.f558m) + ") -- row sizes: " + m460b(i) + ", actual size: " + m460b(i3) + " rows: " + this.f554f + "/" + this.f561p + " cols: " + this.f553e + "/" + this.f559n + " " + 0 + " occupied cells, " + m460b(0));
    }

    /* renamed from: n */
    public C0088c mo436n() {
        return this.f555g;
    }
}
