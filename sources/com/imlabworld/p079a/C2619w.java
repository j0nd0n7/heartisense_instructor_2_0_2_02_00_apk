package com.imlabworld.p079a;

import com.imlabworld.p079a.C2609q;
import java.util.ArrayList;

/* renamed from: com.imlabworld.a.w */
class C2619w {

    /* renamed from: A */
    int f10720A;

    /* renamed from: B */
    int f10721B;

    /* renamed from: C */
    int f10722C;

    /* renamed from: D */
    double f10723D;

    /* renamed from: E */
    double f10724E;

    /* renamed from: F */
    final boolean[] f10725F = new boolean[4];

    /* renamed from: G */
    double f10726G;

    /* renamed from: H */
    boolean f10727H;

    /* renamed from: I */
    long f10728I;

    /* renamed from: J */
    long f10729J;

    /* renamed from: K */
    int f10730K;

    /* renamed from: L */
    int f10731L;

    /* renamed from: M */
    int f10732M;

    /* renamed from: N */
    int f10733N;

    /* renamed from: O */
    int f10734O;

    /* renamed from: P */
    double f10735P;

    /* renamed from: Q */
    double f10736Q;

    /* renamed from: R */
    final C2613r f10737R = new C2613r();

    /* renamed from: S */
    C2609q.C2611b f10738S;

    /* renamed from: a */
    C2614s f10739a;

    /* renamed from: b */
    long f10740b;

    /* renamed from: c */
    C2589ay f10741c = C2589ay.NONE;

    /* renamed from: d */
    long f10742d;

    /* renamed from: e */
    double f10743e;

    /* renamed from: f */
    double f10744f;

    /* renamed from: g */
    boolean f10745g = false;

    /* renamed from: h */
    boolean f10746h = false;

    /* renamed from: i */
    boolean f10747i;

    /* renamed from: j */
    final boolean[] f10748j = new boolean[4];

    /* renamed from: k */
    ArrayList<C2598f> f10749k;

    /* renamed from: l */
    boolean f10750l;

    /* renamed from: m */
    long f10751m;

    /* renamed from: n */
    long f10752n;

    /* renamed from: o */
    long f10753o;

    /* renamed from: p */
    boolean f10754p;

    /* renamed from: q */
    int f10755q;

    /* renamed from: r */
    int f10756r;

    /* renamed from: s */
    int f10757s;

    /* renamed from: t */
    int f10758t;

    /* renamed from: u */
    boolean f10759u;

    /* renamed from: v */
    int f10760v;

    /* renamed from: w */
    boolean f10761w;

    /* renamed from: x */
    int f10762x;

    /* renamed from: y */
    int f10763y;

    /* renamed from: z */
    int f10764z;

    public C2619w(int i, double d, int i2) {
        mo10028a(true, i, d, i2);
        mo10029b();
        this.f10739a = new C2614s();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10027a() {
        this.f10755q = 0;
        this.f10756r = 100;
        for (int i = 0; i < 4; i++) {
            this.f10725F[i] = false;
        }
        this.f10764z = 0;
        this.f10761w = true;
        this.f10763y = 0;
        this.f10762x = 0;
        this.f10759u = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10028a(boolean z, int i, double d, int i2) {
        this.f10745g = false;
        this.f10747i = true;
        for (int i3 = 0; i3 < 4; i3++) {
            this.f10748j[i3] = false;
            this.f10725F[i3] = false;
        }
        this.f10738S = new C2609q.C2611b(i, d, ((double) i2) / 100.0d, 0.05d);
        this.f10750l = false;
        this.f10749k = new ArrayList<>();
        this.f10755q = 0;
        this.f10756r = 100;
        this.f10759u = false;
        this.f10760v = -1;
        this.f10761w = true;
        this.f10762x = 0;
        this.f10763y = 0;
        this.f10764z = 0;
        this.f10720A = 3;
        this.f10721B = 3;
        this.f10722C = 3;
        this.f10723D = 0.0d;
        this.f10724E = 0.0d;
        this.f10726G = 0.0d;
        if (!z) {
            this.f10737R.f10670a.add(this.f10739a);
        }
        this.f10739a = new C2614s();
        this.f10754p = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo10029b() {
        this.f10727H = true;
        this.f10730K = 0;
        this.f10731L = 0;
        this.f10732M = 0;
        this.f10733N = 3;
        this.f10734O = 3;
        this.f10735P = 0.0d;
        this.f10736Q = 0.0d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo10030c() {
        this.f10730K = 0;
        this.f10731L = 0;
    }
}
