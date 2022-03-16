package com.imlabworld.HS_Instructor;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import com.ssomai.android.scalablelayout.ScalableLayout;
import com.woxthebox.draglistview.C2656R;

/* renamed from: com.imlabworld.HS_Instructor.bc */
public class C2436bc extends Fragment implements View.OnClickListener, AdapterView.OnItemSelectedListener {

    /* renamed from: a */
    private static final String f8514a = "param";

    /* renamed from: A */
    private TextView f8515A;

    /* renamed from: B */
    private ImageView f8516B;

    /* renamed from: C */
    private TextView f8517C;

    /* renamed from: D */
    private TextView f8518D;

    /* renamed from: E */
    private ImageView f8519E;

    /* renamed from: F */
    private TextView f8520F;

    /* renamed from: G */
    private ImageView f8521G;

    /* renamed from: H */
    private TextView f8522H;

    /* renamed from: I */
    private TextView f8523I;

    /* renamed from: J */
    private Spinner f8524J;

    /* renamed from: K */
    private TextView f8525K;

    /* renamed from: L */
    private ImageView f8526L;

    /* renamed from: M */
    private TextView f8527M;

    /* renamed from: N */
    private final String[] f8528N = new String[6];

    /* renamed from: O */
    private ArrayAdapter<String> f8529O;

    /* renamed from: P */
    private C2552t f8530P;

    /* renamed from: Q */
    private C2549q f8531Q;

    /* renamed from: R */
    private C2340ag f8532R;

    /* renamed from: b */
    private String f8533b;

    /* renamed from: c */
    private View f8534c;

    /* renamed from: d */
    private C2438b f8535d;

    /* renamed from: e */
    private ScalableLayout f8536e;

    /* renamed from: f */
    private TextView f8537f;

    /* renamed from: g */
    private ImageView f8538g;

    /* renamed from: h */
    private TextView f8539h;

    /* renamed from: i */
    private TextView f8540i;

    /* renamed from: j */
    private ImageView f8541j;

    /* renamed from: k */
    private TextView f8542k;

    /* renamed from: l */
    private ImageView f8543l;

    /* renamed from: m */
    private TextView f8544m;

    /* renamed from: n */
    private ImageView f8545n;

    /* renamed from: o */
    private TextView f8546o;

    /* renamed from: p */
    private TextView f8547p;

    /* renamed from: q */
    private ImageView f8548q;

    /* renamed from: r */
    private TextView f8549r;

    /* renamed from: s */
    private ImageView f8550s;

    /* renamed from: t */
    private TextView f8551t;

    /* renamed from: u */
    private ImageView f8552u;

    /* renamed from: v */
    private TextView f8553v;

    /* renamed from: w */
    private TextView f8554w;

    /* renamed from: x */
    private ImageView f8555x;

    /* renamed from: y */
    private TextView f8556y;

    /* renamed from: z */
    private ImageView f8557z;

    /* renamed from: com.imlabworld.HS_Instructor.bc$a */
    public enum C2437a {
        CHANGE,
        COMPLETE
    }

    /* renamed from: com.imlabworld.HS_Instructor.bc$b */
    public interface C2438b {
        /* renamed from: a */
        void mo8605a(C2437a aVar);
    }

    /* renamed from: a */
    public static C2436bc m13475a(String str) {
        C2436bc bcVar = new C2436bc();
        Bundle bundle = new Bundle();
        bundle.putString(f8514a, str);
        bcVar.setArguments(bundle);
        return bcVar;
    }

    /* renamed from: a */
    private void m13476a(int i) {
        this.f8530P.f9749e = i + 1;
        this.f8525K.setText(this.f8528N[i] + "");
    }

    /* renamed from: c */
    private void m13477c() {
        this.f8528N[0] = "1";
        this.f8528N[1] = "2";
        this.f8528N[2] = "3";
        this.f8528N[3] = "4";
        this.f8528N[4] = "5";
        this.f8528N[5] = C2557y.f9835g.f10341dc;
        this.f8529O = new ArrayAdapter<>(getActivity(), 17367049, this.f8528N);
        this.f8524J.setAdapter(this.f8529O);
        this.f8524J.setOnItemSelectedListener(this);
    }

    /* renamed from: d */
    private void m13478d() {
        this.f8541j.setImageResource(C2656R.drawable.btn_setting_specific_selected);
        this.f8543l.setImageResource(C2656R.drawable.btn_setting_fullcpr_unselected);
        this.f8545n.setImageResource(C2656R.drawable.btn_setting_test_unselected);
        this.f8542k.setTextColor(-764642);
        this.f8544m.setTextColor(-5263441);
        this.f8546o.setTextColor(-5263441);
        this.f8530P.f9745a = 1;
        if (this.f8530P.f9747c == 3) {
            this.f8555x.setImageResource(C2656R.drawable.btn_setting_adult_selected);
            this.f8557z.setImageResource(C2656R.drawable.btn_setting_child_unselected);
            this.f8516B.setImageResource(C2656R.drawable.btn_setting_infant_unselected);
            this.f8556y.setTextColor(-764642);
            this.f8515A.setTextColor(-5263441);
            this.f8517C.setTextColor(-5263441);
            this.f8530P.f9747c = 1;
        }
    }

    /* renamed from: e */
    private void m13479e() {
        this.f8541j.setImageResource(C2656R.drawable.btn_setting_specific_unselected);
        this.f8543l.setImageResource(C2656R.drawable.btn_setting_fullcpr_selected);
        this.f8545n.setImageResource(C2656R.drawable.btn_setting_test_unselected);
        this.f8542k.setTextColor(-5263441);
        this.f8544m.setTextColor(-764642);
        this.f8546o.setTextColor(-5263441);
        this.f8530P.f9745a = 2;
        if (this.f8530P.f9747c == 3) {
            this.f8555x.setImageResource(C2656R.drawable.btn_setting_adult_selected);
            this.f8557z.setImageResource(C2656R.drawable.btn_setting_child_unselected);
            this.f8516B.setImageResource(C2656R.drawable.btn_setting_infant_unselected);
            this.f8556y.setTextColor(-764642);
            this.f8515A.setTextColor(-5263441);
            this.f8517C.setTextColor(-5263441);
            this.f8530P.f9747c = 1;
        }
    }

    /* renamed from: f */
    private void m13480f() {
        this.f8541j.setImageResource(C2656R.drawable.btn_setting_specific_unselected);
        this.f8543l.setImageResource(C2656R.drawable.btn_setting_fullcpr_unselected);
        this.f8545n.setImageResource(C2656R.drawable.btn_setting_test_selected);
        this.f8542k.setTextColor(-5263441);
        this.f8544m.setTextColor(-5263441);
        this.f8546o.setTextColor(-764642);
        this.f8530P.f9745a = 3;
    }

    /* renamed from: g */
    private void m13481g() {
        this.f8548q.setImageResource(C2656R.drawable.btn_setting_comp_selected);
        this.f8550s.setImageResource(C2656R.drawable.btn_setting_breath_unselected);
        this.f8552u.setImageResource(C2656R.drawable.btn_setting_all_unselected);
        this.f8549r.setTextColor(-764642);
        this.f8551t.setTextColor(-5263441);
        this.f8553v.setTextColor(-5263441);
        this.f8530P.f9746b = 1;
    }

    /* renamed from: h */
    private void m13482h() {
        this.f8548q.setImageResource(C2656R.drawable.btn_setting_comp_unselected);
        this.f8550s.setImageResource(C2656R.drawable.btn_setting_breath_selected);
        this.f8552u.setImageResource(C2656R.drawable.btn_setting_all_unselected);
        this.f8549r.setTextColor(-5263441);
        this.f8551t.setTextColor(-764642);
        this.f8553v.setTextColor(-5263441);
        this.f8530P.f9746b = 2;
    }

    /* renamed from: i */
    private void m13483i() {
        this.f8548q.setImageResource(C2656R.drawable.btn_setting_comp_unselected);
        this.f8550s.setImageResource(C2656R.drawable.btn_setting_breath_unselected);
        this.f8552u.setImageResource(C2656R.drawable.btn_setting_all_selected);
        this.f8549r.setTextColor(-5263441);
        this.f8551t.setTextColor(-5263441);
        this.f8553v.setTextColor(-764642);
        this.f8530P.f9746b = 3;
    }

    /* renamed from: j */
    private void m13484j() {
        int i;
        boolean z = true;
        if (this.f8532R.f7880a) {
            this.f8555x.setImageResource(C2656R.drawable.btn_setting_adult_selected);
            this.f8556y.setTextColor(-764642);
        } else {
            this.f8555x.setImageResource(C2656R.drawable.btn_setting_adult_unselected);
            this.f8556y.setTextColor(-5263441);
        }
        if (this.f8532R.f7881b) {
            this.f8557z.setImageResource(C2656R.drawable.btn_setting_child_selected);
            this.f8515A.setTextColor(-764642);
        } else {
            this.f8557z.setImageResource(C2656R.drawable.btn_setting_child_unselected);
            this.f8515A.setTextColor(-5263441);
        }
        if (this.f8532R.f7882c) {
            this.f8516B.setImageResource(C2656R.drawable.btn_setting_infant_selected);
            this.f8517C.setTextColor(-764642);
        } else {
            this.f8516B.setImageResource(C2656R.drawable.btn_setting_infant_unselected);
            this.f8517C.setTextColor(-5263441);
        }
        switch (this.f8530P.f9755k) {
            case 4:
                i = 1;
                break;
            case 5:
                i = 2;
                break;
            case 6:
                i = 3;
                break;
            case 8:
                i = 7;
                break;
            default:
                i = this.f8530P.f9755k;
                z = false;
                break;
        }
        this.f8530P.f9755k = i;
        if (z) {
            m13491q();
        }
    }

    /* renamed from: k */
    private void m13485k() {
        this.f8555x.setImageResource(C2656R.drawable.btn_setting_adult_selected);
        this.f8557z.setImageResource(C2656R.drawable.btn_setting_child_unselected);
        this.f8516B.setImageResource(C2656R.drawable.btn_setting_infant_unselected);
        this.f8556y.setTextColor(-764642);
        this.f8515A.setTextColor(-5263441);
        this.f8517C.setTextColor(-5263441);
        this.f8530P.f9747c = 1;
    }

    /* renamed from: l */
    private void m13486l() {
        int i;
        boolean z = true;
        this.f8555x.setImageResource(C2656R.drawable.btn_setting_adult_unselected);
        this.f8557z.setImageResource(C2656R.drawable.btn_setting_child_selected);
        this.f8516B.setImageResource(C2656R.drawable.btn_setting_infant_unselected);
        this.f8556y.setTextColor(-5263441);
        this.f8515A.setTextColor(-764642);
        this.f8517C.setTextColor(-5263441);
        this.f8530P.f9747c = 2;
        switch (this.f8530P.f9755k) {
            case 4:
                i = 1;
                break;
            case 5:
                i = 2;
                break;
            case 6:
                i = 3;
                break;
            case 8:
                i = 7;
                break;
            default:
                i = this.f8530P.f9755k;
                z = false;
                break;
        }
        this.f8530P.f9755k = i;
        if (z) {
            m13491q();
        }
    }

    /* renamed from: m */
    private void m13487m() {
        int i;
        boolean z = true;
        this.f8555x.setImageResource(C2656R.drawable.btn_setting_adult_unselected);
        this.f8557z.setImageResource(C2656R.drawable.btn_setting_child_unselected);
        this.f8516B.setImageResource(C2656R.drawable.btn_setting_infant_selected);
        this.f8556y.setTextColor(-5263441);
        this.f8515A.setTextColor(-5263441);
        this.f8517C.setTextColor(-764642);
        this.f8530P.f9747c = 3;
        switch (this.f8530P.f9755k) {
            case 4:
                i = 1;
                break;
            case 5:
                i = 2;
                break;
            case 6:
                i = 3;
                break;
            case 8:
                i = 7;
                break;
            default:
                i = this.f8530P.f9755k;
                z = false;
                break;
        }
        this.f8530P.f9755k = i;
        if (z) {
            m13491q();
        }
    }

    /* renamed from: n */
    private void m13488n() {
        this.f8519E.setImageResource(C2656R.drawable.btn_setting_bls_selected);
        this.f8521G.setImageResource(C2656R.drawable.btn_setting_lay_unselected);
        this.f8520F.setTextColor(-764642);
        this.f8522H.setTextColor(-5263441);
        this.f8530P.f9748d = 2;
    }

    /* renamed from: o */
    private void m13489o() {
        this.f8519E.setImageResource(C2656R.drawable.btn_setting_bls_unselected);
        this.f8521G.setImageResource(C2656R.drawable.btn_setting_lay_selected);
        this.f8520F.setTextColor(-5263441);
        this.f8522H.setTextColor(-764642);
        this.f8530P.f9748d = 1;
    }

    /* renamed from: p */
    private int m13490p() {
        int i = 0;
        if (this.f8532R.f7880a) {
            i = 1;
        }
        if (this.f8532R.f7881b) {
            i++;
        }
        return this.f8532R.f7882c ? i + 1 : i;
    }

    /* renamed from: q */
    private void m13491q() {
        this.f8531Q.mo9626a(this.f8530P);
        C2557y.f9832d = this.f8531Q.mo9622a();
        C2557y.f9833e = this.f8532R;
    }

    /* renamed from: a */
    public void mo8960a() {
        this.f8537f.setText(C2557y.f9835g.f10279cT);
        this.f8539h.setText(C2557y.f9835g.f10342dd + " ▶");
        this.f8540i.setText(C2557y.f9835g.f10280cU);
        this.f8542k.setText(C2557y.f9835g.f10284cY);
        this.f8544m.setText(C2557y.f9835g.f10285cZ);
        this.f8546o.setText(C2557y.f9835g.f10339da);
        this.f8547p.setText(C2557y.f9835g.f10281cV);
        this.f8549r.setText(C2557y.f9835g.f10147U);
        this.f8551t.setText(C2557y.f9835g.f10148V);
        this.f8553v.setText(C2557y.f9835g.f10340db);
        this.f8554w.setText(C2557y.f9835g.f10282cW);
        this.f8556y.setText(C2557y.f9835g.f10581t);
        this.f8515A.setText(C2557y.f9835g.f10272cM);
        this.f8517C.setText(C2557y.f9835g.f10582u);
        this.f8518D.setText(C2557y.f9835g.f10578q);
        this.f8520F.setText(C2557y.f9835g.f10580s);
        this.f8522H.setText(C2557y.f9835g.f10579r);
        this.f8523I.setText(C2557y.f9835g.f10141O);
        this.f8527M.setText(C2557y.f9835g.f10283cX);
        this.f8528N[0] = "1";
        this.f8528N[1] = "2";
        this.f8528N[2] = "3";
        this.f8528N[3] = "4";
        this.f8528N[4] = "5";
        this.f8528N[5] = C2557y.f9835g.f10341dc;
        m13476a(this.f8530P.f9749e - 1);
    }

    /* renamed from: b */
    public void mo8961b() {
        this.f8530P = this.f8531Q.mo9622a();
        this.f8532R = C2557y.f9833e.clone();
        m13476a(this.f8530P.f9749e - 1);
        this.f8524J.setSelection(this.f8530P.f9749e - 1);
        switch (this.f8530P.f9748d) {
            case 1:
                m13489o();
                break;
            case 2:
                m13488n();
                break;
        }
        switch (this.f8530P.f9746b) {
            case 1:
                m13481g();
                break;
            case 2:
                m13482h();
                break;
            case 3:
                m13483i();
                break;
        }
        switch (this.f8530P.f9745a) {
            case 1:
                m13478d();
                break;
            case 2:
                m13479e();
                break;
            case 3:
                m13480f();
                break;
        }
        if (this.f8530P.f9745a == 3) {
            this.f8532R = C2557y.f9833e.clone();
            m13484j();
            return;
        }
        switch (this.f8530P.f9747c) {
            case 1:
                m13485k();
                return;
            case 2:
                m13486l();
                return;
            case 3:
                m13487m();
                return;
            default:
                return;
        }
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (activity instanceof C2438b) {
            this.f8535d = (C2438b) activity;
            return;
        }
        throw new RuntimeException(activity.toString() + " must implement OnFragmentInteractionListener");
    }

    public void onClick(View view) {
        boolean z = true;
        switch (view.getId()) {
            case C2656R.C2657id.setting_education_change_btn /*2131231775*/:
                m13491q();
                this.f8535d.mo8605a(C2437a.CHANGE);
                return;
            case C2656R.C2657id.setting_education_complete_btn /*2131231777*/:
                m13491q();
                this.f8535d.mo8605a(C2437a.COMPLETE);
                return;
            case C2656R.C2657id.setting_education_cpr_all_btn /*2131231779*/:
                m13483i();
                return;
            case C2656R.C2657id.setting_education_cpr_breath_btn /*2131231781*/:
                m13482h();
                return;
            case C2656R.C2657id.setting_education_cpr_compression_btn /*2131231783*/:
                m13481g();
                return;
            case C2656R.C2657id.setting_education_mode_fullcpr_btn /*2131231789*/:
                m13479e();
                switch (this.f8530P.f9747c) {
                    case 1:
                        m13485k();
                        return;
                    case 2:
                        m13486l();
                        return;
                    case 3:
                        m13487m();
                        return;
                    default:
                        return;
                }
            case C2656R.C2657id.setting_education_mode_specific_btn /*2131231791*/:
                m13478d();
                switch (this.f8530P.f9747c) {
                    case 1:
                        m13485k();
                        return;
                    case 2:
                        m13486l();
                        return;
                    case 3:
                        m13487m();
                        return;
                    default:
                        return;
                }
            case C2656R.C2657id.setting_education_mode_test_btn /*2131231793*/:
                if (this.f8530P.f9745a != 3) {
                    m13480f();
                    this.f8532R = new C2340ag();
                    m13484j();
                    return;
                }
                return;
            case C2656R.C2657id.setting_education_patient_adult_btn /*2131231796*/:
                if (this.f8530P.f9745a == 3) {
                    this.f8532R.f7880a = !this.f8532R.f7880a;
                    if (m13490p() == 0) {
                        C2340ag agVar = this.f8532R;
                        if (this.f8532R.f7880a) {
                            z = false;
                        }
                        agVar.f7880a = z;
                        return;
                    }
                    m13484j();
                    return;
                }
                m13485k();
                return;
            case C2656R.C2657id.setting_education_patient_child_btn /*2131231798*/:
                if (this.f8530P.f9745a == 3) {
                    this.f8532R.f7881b = !this.f8532R.f7881b;
                    if (m13490p() == 0) {
                        C2340ag agVar2 = this.f8532R;
                        if (this.f8532R.f7881b) {
                            z = false;
                        }
                        agVar2.f7881b = z;
                        return;
                    }
                    m13484j();
                    return;
                }
                m13486l();
                return;
            case C2656R.C2657id.setting_education_patient_infant_btn /*2131231800*/:
                if (this.f8530P.f9745a == 3) {
                    this.f8532R.f7882c = !this.f8532R.f7882c;
                    if (m13490p() == 0) {
                        C2340ag agVar3 = this.f8532R;
                        if (this.f8532R.f7882c) {
                            z = false;
                        }
                        agVar3.f7882c = z;
                        return;
                    }
                    m13484j();
                    return;
                }
                return;
            case C2656R.C2657id.setting_education_rescuer_bls_btn /*2131231803*/:
                m13488n();
                return;
            case C2656R.C2657id.setting_education_rescuer_lay_btn /*2131231805*/:
                m13489o();
                return;
            default:
                return;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.f8533b = getArguments().getString(f8514a);
        }
        this.f8531Q = new C2549q(getActivity());
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f8534c = layoutInflater.inflate(C2656R.layout.setting_education, viewGroup, false);
        this.f8536e = (ScalableLayout) this.f8534c.findViewById(C2656R.C2657id.setting_education_sc);
        this.f8537f = (TextView) this.f8534c.findViewById(C2656R.C2657id.setting_education_title);
        this.f8538g = (ImageView) this.f8534c.findViewById(C2656R.C2657id.setting_education_change_btn);
        this.f8539h = (TextView) this.f8534c.findViewById(C2656R.C2657id.setting_education_change_txt);
        this.f8540i = (TextView) this.f8534c.findViewById(C2656R.C2657id.setting_education_mode_txt);
        this.f8541j = (ImageView) this.f8534c.findViewById(C2656R.C2657id.setting_education_mode_specific_btn);
        this.f8542k = (TextView) this.f8534c.findViewById(C2656R.C2657id.setting_education_mode_specific_txt);
        this.f8543l = (ImageView) this.f8534c.findViewById(C2656R.C2657id.setting_education_mode_fullcpr_btn);
        this.f8544m = (TextView) this.f8534c.findViewById(C2656R.C2657id.setting_education_mode_fullcpr_txt);
        this.f8545n = (ImageView) this.f8534c.findViewById(C2656R.C2657id.setting_education_mode_test_btn);
        this.f8546o = (TextView) this.f8534c.findViewById(C2656R.C2657id.setting_education_mode_test_txt);
        this.f8547p = (TextView) this.f8534c.findViewById(C2656R.C2657id.setting_education_cpr_txt);
        this.f8548q = (ImageView) this.f8534c.findViewById(C2656R.C2657id.setting_education_cpr_compression_btn);
        this.f8549r = (TextView) this.f8534c.findViewById(C2656R.C2657id.setting_education_cpr_compression_txt);
        this.f8550s = (ImageView) this.f8534c.findViewById(C2656R.C2657id.setting_education_cpr_breath_btn);
        this.f8551t = (TextView) this.f8534c.findViewById(C2656R.C2657id.setting_education_cpr_breath_txt);
        this.f8552u = (ImageView) this.f8534c.findViewById(C2656R.C2657id.setting_education_cpr_all_btn);
        this.f8553v = (TextView) this.f8534c.findViewById(C2656R.C2657id.setting_education_cpr_all_txt);
        this.f8554w = (TextView) this.f8534c.findViewById(C2656R.C2657id.setting_education_patient_txt);
        this.f8555x = (ImageView) this.f8534c.findViewById(C2656R.C2657id.setting_education_patient_adult_btn);
        this.f8556y = (TextView) this.f8534c.findViewById(C2656R.C2657id.setting_education_patient_adult_txt);
        this.f8557z = (ImageView) this.f8534c.findViewById(C2656R.C2657id.setting_education_patient_child_btn);
        this.f8515A = (TextView) this.f8534c.findViewById(C2656R.C2657id.setting_education_patient_child_txt);
        this.f8516B = (ImageView) this.f8534c.findViewById(C2656R.C2657id.setting_education_patient_infant_btn);
        this.f8517C = (TextView) this.f8534c.findViewById(C2656R.C2657id.setting_education_patient_infant_txt);
        this.f8518D = (TextView) this.f8534c.findViewById(C2656R.C2657id.setting_education_rescuer_txt);
        this.f8519E = (ImageView) this.f8534c.findViewById(C2656R.C2657id.setting_education_rescuer_bls_btn);
        this.f8520F = (TextView) this.f8534c.findViewById(C2656R.C2657id.setting_education_rescuer_bls_txt);
        this.f8521G = (ImageView) this.f8534c.findViewById(C2656R.C2657id.setting_education_rescuer_lay_btn);
        this.f8522H = (TextView) this.f8534c.findViewById(C2656R.C2657id.setting_education_rescuer_lay_txt);
        this.f8523I = (TextView) this.f8534c.findViewById(C2656R.C2657id.setting_education_cyclenum_txt);
        this.f8524J = (Spinner) this.f8534c.findViewById(C2656R.C2657id.setting_education_cyclenum_btn);
        this.f8525K = (TextView) this.f8534c.findViewById(C2656R.C2657id.setting_education_cyclenum_value_txt);
        this.f8526L = (ImageView) this.f8534c.findViewById(C2656R.C2657id.setting_education_complete_btn);
        this.f8527M = (TextView) this.f8534c.findViewById(C2656R.C2657id.setting_education_complete_txt);
        this.f8537f.setText(C2557y.f9835g.f10279cT);
        this.f8539h.setText(C2557y.f9835g.f10342dd + " ▶");
        this.f8540i.setText(C2557y.f9835g.f10280cU);
        this.f8542k.setText(C2557y.f9835g.f10284cY);
        this.f8544m.setText(C2557y.f9835g.f10285cZ);
        this.f8546o.setText(C2557y.f9835g.f10339da);
        this.f8547p.setText(C2557y.f9835g.f10281cV);
        this.f8549r.setText(C2557y.f9835g.f10147U);
        this.f8551t.setText(C2557y.f9835g.f10148V);
        this.f8553v.setText(C2557y.f9835g.f10340db);
        this.f8554w.setText(C2557y.f9835g.f10282cW);
        this.f8556y.setText(C2557y.f9835g.f10581t);
        this.f8515A.setText(C2557y.f9835g.f10272cM);
        this.f8517C.setText(C2557y.f9835g.f10582u);
        this.f8518D.setText(C2557y.f9835g.f10578q);
        this.f8520F.setText(C2557y.f9835g.f10580s);
        this.f8522H.setText(C2557y.f9835g.f10579r);
        this.f8523I.setText(C2557y.f9835g.f10141O);
        this.f8527M.setText(C2557y.f9835g.f10283cX);
        this.f8536e.setOnClickListener(this);
        this.f8538g.setOnClickListener(this);
        this.f8541j.setOnClickListener(this);
        this.f8543l.setOnClickListener(this);
        this.f8545n.setOnClickListener(this);
        this.f8548q.setOnClickListener(this);
        this.f8550s.setOnClickListener(this);
        this.f8552u.setOnClickListener(this);
        this.f8555x.setOnClickListener(this);
        this.f8557z.setOnClickListener(this);
        this.f8516B.setOnClickListener(this);
        this.f8519E.setOnClickListener(this);
        this.f8521G.setOnClickListener(this);
        this.f8526L.setOnClickListener(this);
        m13477c();
        mo8961b();
        return this.f8534c;
    }

    public void onDetach() {
        super.onDetach();
        this.f8535d = null;
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        switch (adapterView.getId()) {
            case C2656R.C2657id.setting_education_cyclenum_btn /*2131231786*/:
                m13476a(i);
                return;
            default:
                return;
        }
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
