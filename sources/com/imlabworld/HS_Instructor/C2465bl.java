package com.imlabworld.HS_Instructor;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.imlabworld.p079a.C2573ai;
import com.imlabworld.p079a.C2576al;
import com.ssomai.android.scalablelayout.ScalableLayout;
import com.woxthebox.draglistview.C2656R;
import java.util.ArrayList;

/* renamed from: com.imlabworld.HS_Instructor.bl */
public class C2465bl extends Fragment implements View.OnClickListener {

    /* renamed from: b */
    static int f8800b = 0;

    /* renamed from: c */
    static ArrayList<C2527bs> f8801c = null;

    /* renamed from: d */
    static ArrayList<Pair<C2553u, C2339af>> f8802d = null;

    /* renamed from: e */
    static boolean f8803e = false;

    /* renamed from: f */
    static long f8804f = 0;

    /* renamed from: g */
    static long f8805g = 0;

    /* renamed from: h */
    static long f8806h = 0;

    /* renamed from: i */
    static long f8807i = 0;

    /* renamed from: j */
    static final long[] f8808j = new long[6];

    /* renamed from: k */
    private static final String f8809k = "param";

    /* renamed from: A */
    private C2488bp f8810A;

    /* renamed from: a */
    boolean f8811a = true;

    /* renamed from: l */
    private C2468b f8812l;

    /* renamed from: m */
    private boolean f8813m;

    /* renamed from: n */
    private C2338ae[] f8814n;

    /* renamed from: o */
    private ScalableLayout f8815o;

    /* renamed from: p */
    private ScalableLayout f8816p;

    /* renamed from: q */
    private ScalableLayout f8817q;

    /* renamed from: r */
    private ScalableLayout f8818r;

    /* renamed from: s */
    private ScalableLayout f8819s;

    /* renamed from: t */
    private ScalableLayout f8820t;

    /* renamed from: u */
    private FragmentManager f8821u;

    /* renamed from: v */
    private FragmentTransaction f8822v;

    /* renamed from: w */
    private C2472bn f8823w;

    /* renamed from: x */
    private C2482bo f8824x;

    /* renamed from: y */
    private C2507bq f8825y;

    /* renamed from: z */
    private C2469bm f8826z;

    /* renamed from: com.imlabworld.HS_Instructor.bl$a */
    public enum C2467a {
        SETTING,
        START,
        STOP
    }

    /* renamed from: com.imlabworld.HS_Instructor.bl$b */
    public enum C2468b {
        MAIN,
        READY,
        SHEET,
        RESULT
    }

    /* renamed from: a */
    public static C2465bl m13561a(String str) {
        C2465bl blVar = new C2465bl();
        Bundle bundle = new Bundle();
        bundle.putString(f8809k, str);
        blVar.setArguments(bundle);
        return blVar;
    }

    /* renamed from: j */
    private void m13562j() {
        this.f8813m = false;
        this.f8826z.mo9064a();
        this.f8825y.mo9214c();
        this.f8815o.mo10069b(this.f8819s, 0.0f, 1400.0f, 2435.0f, 665.0f);
    }

    /* renamed from: k */
    private void m13563k() {
        this.f8813m = true;
        this.f8826z.mo9067b();
        this.f8825y.mo9215d();
        this.f8815o.mo10069b(this.f8819s, 0.0f, 810.0f, 2435.0f, 665.0f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9044a() {
        this.f8823w.mo9086a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9045a(int i) {
        f8800b = i;
        if (f8800b == -1) {
            this.f8823w.mo9087a(false);
        } else {
            this.f8823w.mo9087a(true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9046a(C2573ai aiVar, int i) {
        switch (this.f8812l) {
            case SHEET:
                this.f8825y.mo9213b();
                if (f8801c.get(0).mo9310b().f9747c != 3) {
                    this.f8826z.mo9065a(f8800b, i);
                    this.f8825y.mo9210a(aiVar, i);
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9047a(C2576al alVar, int i) {
        switch (this.f8812l) {
            case SHEET:
                this.f8825y.mo9213b();
                if (f8801c.get(0).mo9310b().f9747c != 3) {
                    this.f8826z.mo9065a(f8800b, i);
                    this.f8825y.mo9211a(alVar, i);
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9048a(boolean z) {
        this.f8816p.setVisibility(4);
        this.f8817q.setVisibility(0);
        this.f8824x.mo9135a(this.f8814n, z);
        this.f8818r.setVisibility(4);
        this.f8819s.setVisibility(4);
        this.f8820t.setVisibility(4);
        this.f8812l = C2468b.READY;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9049a(C2338ae[] aeVarArr) {
        this.f8814n = aeVarArr;
        mo9050b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo9050b() {
        this.f8816p.setVisibility(0);
        this.f8823w.mo9091b(this.f8814n);
        this.f8817q.setVisibility(4);
        this.f8818r.setVisibility(4);
        this.f8819s.setVisibility(4);
        this.f8820t.setVisibility(4);
        this.f8812l = C2468b.MAIN;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo9051b(int i) {
        switch (this.f8812l) {
            case SHEET:
                if (f8801c.get(0).mo9310b().f9747c != 3) {
                    this.f8826z.mo9068b(f8800b, i);
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo9052b(C2338ae[] aeVarArr) {
        this.f8814n = aeVarArr;
        if (f8800b == -1) {
            mo9050b();
        } else if (!aeVarArr[f8800b].f7851a.f9568a) {
            f8800b = -1;
            mo9050b();
        } else {
            switch (this.f8812l) {
                case MAIN:
                    mo9050b();
                    return;
                case READY:
                    mo9048a(false);
                    return;
                case SHEET:
                    mo9053c();
                    return;
                default:
                    return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo9053c() {
        this.f8816p.setVisibility(4);
        this.f8817q.setVisibility(4);
        this.f8818r.setVisibility(0);
        this.f8825y.mo9212a(this.f8814n);
        if (f8801c.get(0).mo9310b().f9747c != 3) {
            this.f8819s.setVisibility(0);
            this.f8826z.mo9066a(this.f8814n);
        }
        m13562j();
        this.f8820t.setVisibility(4);
        this.f8812l = C2468b.SHEET;
    }

    /* renamed from: c */
    public void mo9054c(int i) {
        if (i == 0) {
            m13562j();
        } else if (i == 1) {
            m13563k();
        } else if (this.f8813m) {
            m13562j();
        } else {
            m13563k();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo9055d() {
        this.f8816p.setVisibility(4);
        this.f8817q.setVisibility(4);
        this.f8818r.setVisibility(4);
        this.f8819s.setVisibility(4);
        this.f8820t.setVisibility(0);
        this.f8810A.mo9151a(this.f8814n);
        this.f8812l = C2468b.RESULT;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo9056e() {
        this.f8823w.mo9089b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo9057f() {
        switch (this.f8812l) {
            case SHEET:
                this.f8825y.mo9209a();
                return;
            default:
                return;
        }
    }

    /* renamed from: g */
    public C2468b mo9058g() {
        return this.f8812l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo9059h() {
        this.f8825y.mo9216e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo9060i() {
        this.f8825y.mo9217f();
    }

    public void onClick(View view) {
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C2656R.layout.test, viewGroup, false);
        f8800b = -1;
        this.f8815o = (ScalableLayout) inflate.findViewById(C2656R.C2657id.test_sc);
        this.f8816p = (ScalableLayout) inflate.findViewById(C2656R.C2657id.test_main_sc);
        this.f8817q = (ScalableLayout) inflate.findViewById(C2656R.C2657id.test_ready_sc);
        this.f8818r = (ScalableLayout) inflate.findViewById(C2656R.C2657id.test_sheet_sc);
        this.f8819s = (ScalableLayout) inflate.findViewById(C2656R.C2657id.test_cpr_graph_sc);
        this.f8820t = (ScalableLayout) inflate.findViewById(C2656R.C2657id.test_result_sc);
        this.f8821u = getChildFragmentManager();
        this.f8823w = C2472bn.m13602a(0);
        this.f8824x = C2482bo.m13646a(0);
        this.f8825y = C2507bq.m13709a(0);
        this.f8826z = C2469bm.m13581a(0);
        this.f8810A = C2488bp.m13663a(0);
        this.f8822v = this.f8821u.beginTransaction();
        this.f8822v.add(this.f8816p.getId(), this.f8823w);
        this.f8822v.add(this.f8817q.getId(), this.f8824x);
        this.f8822v.add(this.f8818r.getId(), this.f8825y);
        this.f8822v.add(this.f8819s.getId(), this.f8826z);
        this.f8822v.add(this.f8820t.getId(), this.f8810A);
        this.f8822v.commit();
        this.f8815o.setOnClickListener(this);
        this.f8812l = C2468b.MAIN;
        return inflate;
    }
}
