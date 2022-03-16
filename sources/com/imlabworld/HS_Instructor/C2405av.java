package com.imlabworld.HS_Instructor;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.imlabworld.p079a.C2573ai;
import com.imlabworld.p079a.C2576al;
import com.ssomai.android.scalablelayout.ScalableLayout;
import com.woxthebox.draglistview.C2656R;

/* renamed from: com.imlabworld.HS_Instructor.av */
public class C2405av extends Fragment implements View.OnClickListener {

    /* renamed from: a */
    private static final String f8184a = "param";

    /* renamed from: b */
    private String f8185b;

    /* renamed from: c */
    private final TextView[] f8186c = new TextView[6];

    /* renamed from: d */
    private final ScalableLayout[] f8187d = new ScalableLayout[6];

    /* renamed from: e */
    private final TextView[] f8188e = new TextView[6];

    /* renamed from: f */
    private final TextView[] f8189f = new TextView[6];

    /* renamed from: g */
    private final TextView[] f8190g = new TextView[6];

    /* renamed from: h */
    private ScalableLayout f8191h;

    /* renamed from: i */
    private ScalableLayout f8192i;

    /* renamed from: j */
    private ScalableLayout f8193j;

    /* renamed from: k */
    private FragmentManager f8194k;

    /* renamed from: l */
    private FragmentTransaction f8195l;

    /* renamed from: m */
    private C2411ax f8196m;

    /* renamed from: n */
    private C2408aw f8197n;

    /* renamed from: o */
    private C2338ae[] f8198o;

    /* renamed from: p */
    private int f8199p;

    /* renamed from: q */
    private View f8200q;

    /* renamed from: com.imlabworld.HS_Instructor.av$a */
    public enum C2407a {
        CHANGE,
        COMPLETE
    }

    /* renamed from: a */
    public static C2405av m13353a(String str) {
        C2405av avVar = new C2405av();
        Bundle bundle = new Bundle();
        bundle.putString(f8184a, str);
        avVar.setArguments(bundle);
        return avVar;
    }

    /* renamed from: d */
    private void m13354d(int i) {
        if (C2557y.f9854z[i] != null) {
            mo8861a(i, C2557y.f9854z[i].mo9718c());
        } else {
            mo8861a(i, (String) null);
        }
    }

    /* renamed from: a */
    public void mo8857a() {
        for (int i = 0; i < 6; i++) {
            this.f8186c[i].setText(C2557y.f9835g.f10357ds);
        }
        this.f8197n.mo8870a();
        this.f8196m.mo8879a();
    }

    /* renamed from: a */
    public void mo8858a(int i) {
        this.f8199p = i;
        for (int i2 = 0; i2 < 6; i2++) {
            if (i2 != i) {
                this.f8187d[i2].setBackgroundResource(C2656R.drawable.img_detail_slot_unselected);
            } else {
                this.f8187d[i2].setBackgroundResource(C2656R.drawable.img_detail_slot_selected);
            }
        }
        this.f8192i.setVisibility(4);
        this.f8193j.setVisibility(0);
        this.f8196m.mo8880a(i);
        m13354d(i);
    }

    /* renamed from: a */
    public void mo8859a(int i, C2573ai aiVar, int i2, int i3) {
        if (this.f8199p == i) {
            this.f8197n.mo8872a(i, aiVar, i2, i3, this.f8198o[i].f7874x);
            if (this.f8192i.getVisibility() == 4) {
                this.f8192i.setVisibility(0);
            }
        }
        if (aiVar != null) {
            switch (aiVar.mo9864i()) {
                case Too_Strong:
                    this.f8190g[i].setTextColor(-14868344);
                    this.f8190g[i].setText(C2557y.f9835g.f10350dl);
                    return;
                case Too_Weak:
                    this.f8190g[i].setTextColor(-4269339);
                    this.f8190g[i].setText(C2557y.f9835g.f10351dm);
                    return;
                case Good:
                    this.f8190g[i].setTextColor(-13719584);
                    this.f8190g[i].setText(C2557y.f9835g.f10356dr);
                    return;
                case NONE:
                    this.f8190g[i].setText("");
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: a */
    public void mo8860a(int i, C2576al alVar, int i2, int i3) {
        if (this.f8199p == i) {
            this.f8197n.mo8873a(i, alVar, i2, i3, this.f8198o[i].f7874x);
            if (this.f8192i.getVisibility() == 4) {
                this.f8192i.setVisibility(0);
            }
        }
        if (alVar != null) {
            switch (alVar.mo9864i()) {
                case Too_Strong:
                    this.f8190g[i].setTextColor(-764642);
                    this.f8190g[i].setText(C2557y.f9835g.f10350dl);
                    return;
                case Too_Weak:
                    this.f8190g[i].setTextColor(-12964);
                    this.f8190g[i].setText(C2557y.f9835g.f10351dm);
                    return;
                case Wrong_Position:
                    this.f8190g[i].setTextColor(-764642);
                    this.f8190g[i].setText(C2557y.f9835g.f10352dn);
                    return;
                case Not_Recoil:
                    this.f8190g[i].setTextColor(-764642);
                    this.f8190g[i].setText(C2557y.f9835g.f10353do);
                    return;
                case Too_Fast:
                    this.f8190g[i].setTextColor(-764642);
                    this.f8190g[i].setText(C2557y.f9835g.f10354dp);
                    return;
                case Too_Slow:
                    this.f8190g[i].setTextColor(-12964);
                    this.f8190g[i].setText(C2557y.f9835g.f10355dq);
                    return;
                case Good:
                    this.f8190g[i].setTextColor(-13520490);
                    this.f8190g[i].setText(C2557y.f9835g.f10356dr);
                    return;
                case NONE:
                    this.f8190g[i].setText("");
                    return;
                default:
                    return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo8861a(int i, String str) {
        if (str != null) {
            this.f8189f[i].setText(str);
        } else {
            this.f8189f[i].setText("-");
        }
        if (this.f8199p == i) {
            this.f8197n.mo8875b(str);
            this.f8196m.mo8881b(str);
        }
    }

    /* renamed from: a */
    public void mo8862a(int i, C2338ae[] aeVarArr) {
        this.f8198o = aeVarArr;
        mo8863a(aeVarArr);
        if (aeVarArr[i].f7874x == 18 || aeVarArr[i].f7874x == 16) {
            this.f8190g[i].setText("");
            this.f8190g[i].setTextColor(-10658467);
        } else if (aeVarArr[i].f7874x == 19 || aeVarArr[i].f7874x == 17) {
            this.f8190g[i].setText("");
            this.f8190g[i].setTextColor(-10658467);
        } else if (aeVarArr[i].f7874x == 10) {
            this.f8190g[i].setText(C2557y.f9835g.f10142P);
            this.f8190g[i].setTextColor(-10658467);
        } else if (aeVarArr[i].f7874x == 20) {
            this.f8190g[i].setText(C2557y.f9835g.f10150X);
            this.f8190g[i].setTextColor(-10658467);
        }
        if (i == this.f8199p) {
            mo8866c(i);
        }
    }

    /* renamed from: a */
    public void mo8863a(C2338ae[] aeVarArr) {
        for (int i = 0; i < 6; i++) {
            if (aeVarArr[i].f7851a.f9568a) {
                this.f8187d[i].setVisibility(0);
            } else {
                this.f8187d[i].setVisibility(4);
            }
        }
    }

    /* renamed from: b */
    public void mo8864b(int i) {
        this.f8199p = i;
        for (int i2 = 0; i2 < 6; i2++) {
            if (i2 != i) {
                this.f8187d[i2].setBackgroundResource(C2656R.drawable.img_detail_slot_unselected);
            } else {
                this.f8187d[i2].setBackgroundResource(C2656R.drawable.img_detail_slot_selected);
            }
        }
        this.f8192i.setVisibility(4);
        this.f8193j.setVisibility(0);
        this.f8196m.mo8880a(i);
        m13354d(i);
    }

    /* renamed from: b */
    public void mo8865b(int i, C2338ae[] aeVarArr) {
        this.f8198o = aeVarArr;
        mo8863a(aeVarArr);
        this.f8190g[i].setText(C2557y.f9835g.f10204ay);
        this.f8190g[i].setTextColor(-10658467);
        if (i == this.f8199p) {
            mo8858a(i);
        }
    }

    /* renamed from: c */
    public void mo8866c(int i) {
        this.f8199p = i;
        for (int i2 = 0; i2 < 6; i2++) {
            if (i2 != i) {
                this.f8187d[i2].setBackgroundResource(C2656R.drawable.img_detail_slot_unselected);
            } else {
                this.f8187d[i2].setBackgroundResource(C2656R.drawable.img_detail_slot_selected);
            }
        }
        this.f8192i.setVisibility(0);
        this.f8193j.setVisibility(4);
        if (this.f8198o[i].f7874x == 18 || this.f8198o[i].f7874x == 16) {
            this.f8197n.mo8871a(i);
        } else if (this.f8198o[i].f7874x == 19 || this.f8198o[i].f7874x == 17) {
            this.f8197n.mo8871a(i);
            this.f8197n.mo8874b(i);
        } else if (this.f8198o[i].f7874x == 10) {
            this.f8197n.mo8871a(i);
            this.f8192i.setVisibility(4);
        } else if (this.f8198o[i].f7874x == 20) {
            this.f8197n.mo8871a(i);
            this.f8192i.setVisibility(4);
        }
        m13354d(i);
    }

    public void onClick(View view) {
        int id = view.getId();
        switch (id) {
            case C2656R.C2657id.detail_slot1_sc /*2131231064*/:
            case C2656R.C2657id.detail_slot2_sc /*2131231069*/:
            case C2656R.C2657id.detail_slot3_sc /*2131231074*/:
            case C2656R.C2657id.detail_slot4_sc /*2131231079*/:
            case C2656R.C2657id.detail_slot5_sc /*2131231084*/:
            case C2656R.C2657id.detail_slot6_sc /*2131231089*/:
                int i = 0;
                while (true) {
                    if (i >= 6) {
                        i = 0;
                    } else if (this.f8187d[i].getId() != id) {
                        i++;
                    }
                }
                if (i != this.f8199p) {
                    if (this.f8198o[i].f7874x == 11) {
                        mo8858a(i);
                    } else if (this.f8198o[i].f7874x != 13) {
                        mo8866c(i);
                    }
                    m13354d(i);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.f8185b = getArguments().getString(f8184a);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f8200q = layoutInflater.inflate(C2656R.layout.detail, viewGroup, false);
        this.f8191h = (ScalableLayout) this.f8200q.findViewById(C2656R.C2657id.detail_sc);
        this.f8186c[0] = (TextView) this.f8200q.findViewById(C2656R.C2657id.detail_slot1_default_txt);
        this.f8186c[1] = (TextView) this.f8200q.findViewById(C2656R.C2657id.detail_slot2_default_txt);
        this.f8186c[2] = (TextView) this.f8200q.findViewById(C2656R.C2657id.detail_slot3_default_txt);
        this.f8186c[3] = (TextView) this.f8200q.findViewById(C2656R.C2657id.detail_slot4_default_txt);
        this.f8186c[4] = (TextView) this.f8200q.findViewById(C2656R.C2657id.detail_slot5_default_txt);
        this.f8186c[5] = (TextView) this.f8200q.findViewById(C2656R.C2657id.detail_slot6_default_txt);
        this.f8187d[0] = (ScalableLayout) this.f8200q.findViewById(C2656R.C2657id.detail_slot1_sc);
        this.f8187d[1] = (ScalableLayout) this.f8200q.findViewById(C2656R.C2657id.detail_slot2_sc);
        this.f8187d[2] = (ScalableLayout) this.f8200q.findViewById(C2656R.C2657id.detail_slot3_sc);
        this.f8187d[3] = (ScalableLayout) this.f8200q.findViewById(C2656R.C2657id.detail_slot4_sc);
        this.f8187d[4] = (ScalableLayout) this.f8200q.findViewById(C2656R.C2657id.detail_slot5_sc);
        this.f8187d[5] = (ScalableLayout) this.f8200q.findViewById(C2656R.C2657id.detail_slot6_sc);
        this.f8188e[0] = (TextView) this.f8200q.findViewById(C2656R.C2657id.detail_slot1_group_txt);
        this.f8188e[1] = (TextView) this.f8200q.findViewById(C2656R.C2657id.detail_slot2_group_txt);
        this.f8188e[2] = (TextView) this.f8200q.findViewById(C2656R.C2657id.detail_slot3_group_txt);
        this.f8188e[3] = (TextView) this.f8200q.findViewById(C2656R.C2657id.detail_slot4_group_txt);
        this.f8188e[4] = (TextView) this.f8200q.findViewById(C2656R.C2657id.detail_slot5_group_txt);
        this.f8188e[5] = (TextView) this.f8200q.findViewById(C2656R.C2657id.detail_slot6_group_txt);
        this.f8189f[0] = (TextView) this.f8200q.findViewById(C2656R.C2657id.detail_slot1_student_txt);
        this.f8189f[1] = (TextView) this.f8200q.findViewById(C2656R.C2657id.detail_slot2_student_txt);
        this.f8189f[2] = (TextView) this.f8200q.findViewById(C2656R.C2657id.detail_slot3_student_txt);
        this.f8189f[3] = (TextView) this.f8200q.findViewById(C2656R.C2657id.detail_slot4_student_txt);
        this.f8189f[4] = (TextView) this.f8200q.findViewById(C2656R.C2657id.detail_slot5_student_txt);
        this.f8189f[5] = (TextView) this.f8200q.findViewById(C2656R.C2657id.detail_slot6_student_txt);
        this.f8190g[0] = (TextView) this.f8200q.findViewById(C2656R.C2657id.detail_slot1_feedback_txt);
        this.f8190g[1] = (TextView) this.f8200q.findViewById(C2656R.C2657id.detail_slot2_feedback_txt);
        this.f8190g[2] = (TextView) this.f8200q.findViewById(C2656R.C2657id.detail_slot3_feedback_txt);
        this.f8190g[3] = (TextView) this.f8200q.findViewById(C2656R.C2657id.detail_slot4_feedback_txt);
        this.f8190g[4] = (TextView) this.f8200q.findViewById(C2656R.C2657id.detail_slot5_feedback_txt);
        this.f8190g[5] = (TextView) this.f8200q.findViewById(C2656R.C2657id.detail_slot6_feedback_txt);
        this.f8191h.setOnClickListener(this);
        for (int i = 0; i < 6; i++) {
            this.f8190g[i].setText("");
            this.f8190g[i].setTextColor(-10658467);
            this.f8187d[i].setOnClickListener(this);
        }
        for (int i2 = 0; i2 < 6; i2++) {
            this.f8186c[i2].setText(C2557y.f9835g.f10357ds);
        }
        this.f8193j = (ScalableLayout) this.f8200q.findViewById(C2656R.C2657id.detail_graph_sc);
        this.f8192i = (ScalableLayout) this.f8200q.findViewById(C2656R.C2657id.detail_feedback_sc);
        this.f8194k = getChildFragmentManager();
        this.f8196m = C2411ax.m13373a("1");
        this.f8197n = C2408aw.m13365a("1");
        this.f8195l = this.f8194k.beginTransaction();
        this.f8195l.add(this.f8193j.getId(), this.f8196m);
        this.f8195l.add(this.f8192i.getId(), this.f8197n);
        this.f8195l.commit();
        return this.f8200q;
    }
}
