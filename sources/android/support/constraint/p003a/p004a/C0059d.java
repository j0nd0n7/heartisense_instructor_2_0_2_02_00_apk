package android.support.constraint.p003a.p004a;

import android.support.constraint.p003a.p004a.C0070h;
import java.util.ArrayList;

/* renamed from: android.support.constraint.a.a.d */
public class C0059d {

    /* renamed from: a */
    protected C0070h f224a;

    /* renamed from: b */
    protected C0070h f225b;

    /* renamed from: c */
    protected C0070h f226c;

    /* renamed from: d */
    protected C0070h f227d;

    /* renamed from: e */
    protected C0070h f228e;

    /* renamed from: f */
    protected C0070h f229f;

    /* renamed from: g */
    protected C0070h f230g;

    /* renamed from: h */
    protected ArrayList<C0070h> f231h;

    /* renamed from: i */
    protected int f232i;

    /* renamed from: j */
    protected int f233j;

    /* renamed from: k */
    protected float f234k = 0.0f;

    /* renamed from: l */
    protected boolean f235l;

    /* renamed from: m */
    protected boolean f236m;

    /* renamed from: n */
    protected boolean f237n;

    /* renamed from: o */
    private int f238o;

    /* renamed from: p */
    private boolean f239p = false;

    /* renamed from: q */
    private boolean f240q;

    public C0059d(C0070h hVar, int i, boolean z) {
        this.f224a = hVar;
        this.f238o = i;
        this.f239p = z;
    }

    /* renamed from: a */
    private static boolean m86a(C0070h hVar, int i) {
        return hVar.mo163E() != 8 && hVar.f380ad[i] == C0070h.C0073b.MATCH_CONSTRAINT && (hVar.f332A[i] == 0 || hVar.f332A[i] == 3);
    }

    /* renamed from: j */
    private void m87j() {
        C0070h hVar;
        boolean z = true;
        int i = this.f238o * 2;
        C0070h hVar2 = this.f224a;
        C0070h hVar3 = this.f224a;
        C0070h hVar4 = this.f224a;
        C0070h hVar5 = hVar2;
        boolean z2 = false;
        while (!z2) {
            this.f232i++;
            hVar3.f367aO[this.f238o] = null;
            hVar3.f366aN[this.f238o] = null;
            if (hVar3.mo163E() != 8) {
                if (this.f225b == null) {
                    this.f225b = hVar3;
                }
                this.f227d = hVar3;
                if (hVar3.f380ad[this.f238o] == C0070h.C0073b.MATCH_CONSTRAINT && (hVar3.f332A[this.f238o] == 0 || hVar3.f332A[this.f238o] == 3 || hVar3.f332A[this.f238o] == 2)) {
                    this.f233j++;
                    float f = hVar3.f365aM[this.f238o];
                    if (f > 0.0f) {
                        this.f234k += hVar3.f365aM[this.f238o];
                    }
                    if (m86a(hVar3, this.f238o)) {
                        if (f < 0.0f) {
                            this.f235l = true;
                        } else {
                            this.f236m = true;
                        }
                        if (this.f231h == null) {
                            this.f231h = new ArrayList<>();
                        }
                        this.f231h.add(hVar3);
                    }
                    if (this.f229f == null) {
                        this.f229f = hVar3;
                    }
                    if (this.f230g != null) {
                        this.f230g.f366aN[this.f238o] = hVar3;
                    }
                    this.f230g = hVar3;
                }
            }
            if (hVar5 != hVar3) {
                hVar5.f367aO[this.f238o] = hVar3;
            }
            C0060e eVar = hVar3.f352Z[i + 1].f248f;
            if (eVar != null) {
                hVar = eVar.f246d;
                if (hVar.f352Z[i].f248f == null || hVar.f352Z[i].f248f.f246d != hVar3) {
                    hVar = null;
                }
            } else {
                hVar = null;
            }
            if (hVar == null) {
                z2 = true;
                hVar = hVar3;
            }
            C0070h hVar6 = hVar;
            hVar5 = hVar3;
            hVar3 = hVar6;
        }
        this.f226c = hVar3;
        if (this.f238o != 0 || !this.f239p) {
            this.f228e = this.f224a;
        } else {
            this.f228e = this.f226c;
        }
        if (!this.f236m || !this.f235l) {
            z = false;
        }
        this.f237n = z;
    }

    /* renamed from: a */
    public C0070h mo94a() {
        return this.f224a;
    }

    /* renamed from: b */
    public C0070h mo95b() {
        return this.f225b;
    }

    /* renamed from: c */
    public C0070h mo96c() {
        return this.f226c;
    }

    /* renamed from: d */
    public C0070h mo97d() {
        return this.f227d;
    }

    /* renamed from: e */
    public C0070h mo98e() {
        return this.f228e;
    }

    /* renamed from: f */
    public C0070h mo99f() {
        return this.f229f;
    }

    /* renamed from: g */
    public C0070h mo100g() {
        return this.f230g;
    }

    /* renamed from: h */
    public float mo101h() {
        return this.f234k;
    }

    /* renamed from: i */
    public void mo102i() {
        if (!this.f240q) {
            m87j();
        }
        this.f240q = true;
    }
}
