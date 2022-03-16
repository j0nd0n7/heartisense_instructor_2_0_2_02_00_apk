package com.imlabworld.HS_Instructor;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
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

/* renamed from: com.imlabworld.HS_Instructor.bb */
public class C2433bb extends Fragment implements View.OnClickListener, AdapterView.OnItemSelectedListener {

    /* renamed from: a */
    private static final String f8465a = "param";

    /* renamed from: A */
    private TextView f8466A;

    /* renamed from: B */
    private ImageView f8467B;

    /* renamed from: C */
    private TextView f8468C;

    /* renamed from: D */
    private ImageView f8469D;

    /* renamed from: E */
    private TextView f8470E;

    /* renamed from: F */
    private final String[] f8471F = new String[3];

    /* renamed from: G */
    private ArrayAdapter<String> f8472G;

    /* renamed from: H */
    private final String[] f8473H = new String[2];

    /* renamed from: I */
    private ArrayAdapter<String> f8474I;

    /* renamed from: J */
    private final String[] f8475J = new String[2];

    /* renamed from: K */
    private ArrayAdapter<String> f8476K;

    /* renamed from: L */
    private final String[] f8477L = new String[6];

    /* renamed from: M */
    private ArrayAdapter<String> f8478M;

    /* renamed from: N */
    private String[] f8479N = new String[8];

    /* renamed from: O */
    private ArrayAdapter<String> f8480O;

    /* renamed from: P */
    private final String[] f8481P = new String[3];

    /* renamed from: Q */
    private ArrayAdapter<String> f8482Q;

    /* renamed from: R */
    private C2552t f8483R;

    /* renamed from: S */
    private C2549q f8484S;

    /* renamed from: b */
    private String f8485b;

    /* renamed from: c */
    private View f8486c;

    /* renamed from: d */
    private C2435b f8487d;

    /* renamed from: e */
    private ScalableLayout f8488e;

    /* renamed from: f */
    private TextView f8489f;

    /* renamed from: g */
    private ImageView f8490g;

    /* renamed from: h */
    private TextView f8491h;

    /* renamed from: i */
    private TextView f8492i;

    /* renamed from: j */
    private Spinner f8493j;

    /* renamed from: k */
    private TextView f8494k;

    /* renamed from: l */
    private TextView f8495l;

    /* renamed from: m */
    private TextView f8496m;

    /* renamed from: n */
    private Spinner f8497n;

    /* renamed from: o */
    private TextView f8498o;

    /* renamed from: p */
    private TextView f8499p;

    /* renamed from: q */
    private Spinner f8500q;

    /* renamed from: r */
    private TextView f8501r;

    /* renamed from: s */
    private TextView f8502s;

    /* renamed from: t */
    private Spinner f8503t;

    /* renamed from: u */
    private TextView f8504u;

    /* renamed from: v */
    private TextView f8505v;

    /* renamed from: w */
    private Spinner f8506w;

    /* renamed from: x */
    private TextView f8507x;

    /* renamed from: y */
    private TextView f8508y;

    /* renamed from: z */
    private Spinner f8509z;

    /* renamed from: com.imlabworld.HS_Instructor.bb$a */
    public enum C2434a {
        CHANGE,
        COMPLETE,
        SCORE
    }

    /* renamed from: com.imlabworld.HS_Instructor.bb$b */
    public interface C2435b {
        /* renamed from: a */
        void mo8604a(C2434a aVar);
    }

    /* renamed from: a */
    public static C2433bb m13458a(String str) {
        C2433bb bbVar = new C2433bb();
        Bundle bundle = new Bundle();
        bundle.putString(f8465a, str);
        bbVar.setArguments(bundle);
        return bbVar;
    }

    /* renamed from: a */
    private void m13459a(int i) {
        this.f8483R.f9750f = i;
        this.f8494k.setText(this.f8471F[i] + "");
    }

    /* renamed from: b */
    private void m13460b(int i) {
        this.f8483R.f9751g = i + 1;
        this.f8498o.setText(this.f8473H[i] + "");
    }

    /* renamed from: c */
    private void m13461c() {
        this.f8471F[0] = "100/" + C2557y.f9835g.f10349dk;
        this.f8471F[1] = "110/" + C2557y.f9835g.f10349dk;
        this.f8471F[2] = "120/" + C2557y.f9835g.f10349dk;
        this.f8472G = new ArrayAdapter<>(getActivity(), 17367049, this.f8471F);
        this.f8493j.setAdapter(this.f8472G);
        this.f8493j.setOnItemSelectedListener(this);
    }

    /* renamed from: c */
    private void m13462c(int i) {
        this.f8483R.f9752h = i + 1;
        this.f8501r.setText(this.f8475J[i] + "");
    }

    /* renamed from: d */
    private void m13463d() {
        this.f8473H[0] = "Anne";
        this.f8473H[1] = "Prestan";
        this.f8474I = new ArrayAdapter<>(getActivity(), 17367049, this.f8473H);
        this.f8497n.setAdapter(this.f8474I);
        this.f8497n.setOnItemSelectedListener(this);
    }

    /* renamed from: d */
    private void m13464d(int i) {
        switch (i) {
            case 0:
                this.f8483R.f9754j = "en";
                C2557y.f9835g = C2557y.f9836h;
                break;
            case 1:
                this.f8483R.f9754j = "de";
                C2557y.f9835g = C2557y.f9838j;
                break;
            case 2:
                this.f8483R.f9754j = "es";
                C2557y.f9835g = C2557y.f9839k;
                break;
            case 3:
                this.f8483R.f9754j = "fr";
                C2557y.f9835g = C2557y.f9840l;
                break;
            case 4:
                this.f8483R.f9754j = "kr";
                C2557y.f9835g = C2557y.f9837i;
                break;
            case 5:
                this.f8483R.f9754j = "cn";
                C2557y.f9835g = C2557y.f9841m;
                break;
        }
        Log.e("Lang34", this.f8477L[i]);
        this.f8504u.setText(this.f8477L[i] + "");
    }

    /* renamed from: e */
    private void m13465e() {
        this.f8475J[0] = "Anne";
        this.f8475J[1] = "Prestan";
        this.f8476K = new ArrayAdapter<>(getActivity(), 17367049, this.f8475J);
        this.f8500q.setAdapter(this.f8476K);
        this.f8500q.setOnItemSelectedListener(this);
    }

    /* renamed from: e */
    private void m13466e(int i) {
        int i2 = 1;
        switch (i) {
            case 1:
                i2 = 7;
                break;
            case 2:
                i2 = 2;
                break;
            case 3:
                i2 = 3;
                break;
            case 4:
                i2 = 9;
                break;
            case 5:
                i2 = 4;
                break;
            case 6:
                i2 = 8;
                break;
            case 7:
                i2 = 5;
                break;
            case 8:
                i2 = 6;
                break;
            case 9:
                i2 = 10;
                break;
        }
        this.f8483R.f9755k = i2;
        this.f8507x.setText(this.f8479N[i] + "");
    }

    /* renamed from: f */
    private void m13467f() {
        this.f8477L[0] = "English";
        this.f8477L[1] = "Deutsch";
        this.f8477L[2] = "Español";
        this.f8477L[3] = "Français";
        this.f8477L[4] = "한국어";
        this.f8477L[5] = "中文";
        this.f8478M = new ArrayAdapter<>(getActivity(), 17367049, this.f8477L);
        this.f8503t.setAdapter(this.f8478M);
        this.f8503t.setOnItemSelectedListener(this);
    }

    /* renamed from: f */
    private void m13468f(int i) {
        this.f8483R.f9756l = i + 1;
        this.f8466A.setText(this.f8481P[i] + "");
    }

    /* renamed from: g */
    private void m13469g() {
        if (C2557y.f9832d.f9747c == 1) {
            this.f8479N = new String[10];
            this.f8479N[0] = "AHA 5~6cm";
            this.f8479N[1] = "KACPR 5~6cm";
            this.f8479N[2] = "ERC 5~6cm";
            this.f8479N[3] = "ANZCOR 5~6cm";
            this.f8479N[4] = "SRFAC 4~6cm";
            this.f8479N[5] = "AHA 5cm~";
            this.f8479N[6] = "KACPR 5cm~";
            this.f8479N[7] = "ERC 5cm~";
            this.f8479N[8] = "ANZCOR 5cm~";
            this.f8479N[9] = "SRFAC 4cm~";
        } else {
            this.f8479N = new String[4];
            this.f8479N[0] = "AHA 4~5cm";
            this.f8479N[1] = "KACPR 4~5cm";
            this.f8479N[2] = "ERC 4~5cm";
            this.f8479N[3] = "ANZCOR 4~5cm";
        }
        this.f8480O = new ArrayAdapter<>(getActivity(), 17367049, this.f8479N);
        this.f8506w.setAdapter(this.f8480O);
        this.f8506w.setOnItemSelectedListener(this);
    }

    /* renamed from: h */
    private void m13470h() {
        this.f8481P[0] = "yyyy/mm/dd";
        this.f8481P[1] = "dd/mm/yyyy";
        this.f8481P[2] = "mm/dd/yyyy";
        this.f8482Q = new ArrayAdapter<>(getActivity(), 17367049, this.f8481P);
        this.f8509z.setAdapter(this.f8482Q);
        this.f8509z.setOnItemSelectedListener(this);
    }

    /* renamed from: i */
    private void m13471i() {
        this.f8484S.mo9626a(this.f8483R);
        C2557y.f9832d = this.f8484S.mo9622a();
    }

    /* renamed from: a */
    public void mo8951a() {
        int i = 0;
        this.f8483R = this.f8484S.mo9622a();
        m13461c();
        m13463d();
        m13465e();
        m13467f();
        m13469g();
        m13470h();
        Log.e("Lang11", this.f8483R.mo9706o());
        m13459a(this.f8483R.f9750f);
        this.f8493j.setSelection(this.f8483R.f9750f);
        m13460b(this.f8483R.f9751g - 1);
        this.f8497n.setSelection(this.f8483R.f9751g - 1);
        m13462c(this.f8483R.f9752h - 1);
        this.f8500q.setSelection(this.f8483R.f9752h - 1);
        int i2 = this.f8483R.f9754j.equals("en") ? 0 : this.f8483R.f9754j.equals("de") ? 1 : this.f8483R.f9754j.equals("es") ? 2 : this.f8483R.f9754j.equals("fr") ? 3 : this.f8483R.f9754j.equals("kr") ? 4 : this.f8483R.f9754j.equals("cn") ? 5 : 0;
        Log.e("Lang12", i2 + this.f8483R.mo9706o());
        m13464d(i2);
        this.f8503t.setSelection(i2);
        Log.e("Lang13", i2 + this.f8483R.mo9706o());
        switch (this.f8483R.f9755k) {
            case 2:
                i = 2;
                break;
            case 3:
                i = 3;
                break;
            case 4:
                i = 5;
                break;
            case 5:
                i = 7;
                break;
            case 6:
                i = 8;
                break;
            case 7:
                i = 1;
                break;
            case 8:
                i = 6;
                break;
            case 9:
                i = 4;
                break;
            case 10:
                i = 9;
                break;
        }
        m13466e(i);
        this.f8506w.setSelection(i);
        if (this.f8483R.f9756l == 0) {
            this.f8483R.f9756l = 1;
        }
        m13468f(this.f8483R.f9756l - 1);
        this.f8509z.setSelection(this.f8483R.f9756l - 1);
    }

    /* renamed from: b */
    public void mo8952b() {
        this.f8489f.setText(C2557y.f9835g.f10342dd);
        this.f8491h.setText("◀ " + C2557y.f9835g.f10279cT);
        this.f8492i.setText(C2557y.f9835g.f10343de);
        this.f8495l.setText(C2557y.f9835g.f10346dh);
        this.f8496m.setText(C2557y.f9835g.f10581t);
        this.f8499p.setText(C2557y.f9835g.f10272cM);
        this.f8502s.setText(C2557y.f9835g.f10345dg);
        this.f8505v.setText(C2557y.f9835g.f10344df);
        this.f8508y.setText(C2557y.f9835g.f10347di);
        this.f8468C.setText(C2557y.f9835g.f10274cO);
        this.f8470E.setText(C2557y.f9835g.f10283cX);
        this.f8471F[0] = "100/" + C2557y.f9835g.f10349dk;
        this.f8471F[1] = "110/" + C2557y.f9835g.f10349dk;
        this.f8471F[2] = "120/" + C2557y.f9835g.f10349dk;
        m13459a(this.f8483R.f9750f);
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (activity instanceof C2435b) {
            this.f8487d = (C2435b) activity;
            return;
        }
        throw new RuntimeException(activity.toString() + " must implement OnFragmentInteractionListener");
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case C2656R.C2657id.setting_basic_change_btn /*2131231748*/:
                m13471i();
                this.f8487d.mo8604a(C2434a.CHANGE);
                return;
            case C2656R.C2657id.setting_basic_complete_btn /*2131231750*/:
                m13471i();
                this.f8487d.mo8604a(C2434a.COMPLETE);
                return;
            case C2656R.C2657id.setting_basic_score_btn /*2131231772*/:
                this.f8487d.mo8604a(C2434a.SCORE);
                return;
            default:
                return;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.f8485b = getArguments().getString(f8465a);
        }
        this.f8484S = new C2549q(getActivity());
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f8486c = layoutInflater.inflate(C2656R.layout.setting_basic, viewGroup, false);
        this.f8488e = (ScalableLayout) this.f8486c.findViewById(C2656R.C2657id.setting_basic_sc);
        this.f8489f = (TextView) this.f8486c.findViewById(C2656R.C2657id.setting_basic_title);
        this.f8490g = (ImageView) this.f8486c.findViewById(C2656R.C2657id.setting_basic_change_btn);
        this.f8491h = (TextView) this.f8486c.findViewById(C2656R.C2657id.setting_basic_change_txt);
        this.f8492i = (TextView) this.f8486c.findViewById(C2656R.C2657id.setting_basic_compression_guide_txt);
        this.f8493j = (Spinner) this.f8486c.findViewById(C2656R.C2657id.setting_basic_compression_guide_btn);
        this.f8494k = (TextView) this.f8486c.findViewById(C2656R.C2657id.setting_basic_compression_guide_value_txt);
        this.f8495l = (TextView) this.f8486c.findViewById(C2656R.C2657id.setting_basic_manikin_txt);
        this.f8496m = (TextView) this.f8486c.findViewById(C2656R.C2657id.setting_basic_manikin_adult_txt);
        this.f8497n = (Spinner) this.f8486c.findViewById(C2656R.C2657id.setting_basic_manikin_adult_btn);
        this.f8498o = (TextView) this.f8486c.findViewById(C2656R.C2657id.setting_basic_manikin_adult_value_txt);
        this.f8499p = (TextView) this.f8486c.findViewById(C2656R.C2657id.setting_basic_manikin_child_txt);
        this.f8500q = (Spinner) this.f8486c.findViewById(C2656R.C2657id.setting_basic_manikin_child_btn);
        this.f8501r = (TextView) this.f8486c.findViewById(C2656R.C2657id.setting_basic_manikin_child_value_txt);
        this.f8502s = (TextView) this.f8486c.findViewById(C2656R.C2657id.setting_basic_language_txt);
        this.f8503t = (Spinner) this.f8486c.findViewById(C2656R.C2657id.setting_basic_language_btn);
        this.f8504u = (TextView) this.f8486c.findViewById(C2656R.C2657id.setting_basic_language_value_txt);
        this.f8505v = (TextView) this.f8486c.findViewById(C2656R.C2657id.setting_basic_cprguideline_txt);
        this.f8506w = (Spinner) this.f8486c.findViewById(C2656R.C2657id.setting_basic_cprguideline_btn);
        this.f8507x = (TextView) this.f8486c.findViewById(C2656R.C2657id.setting_basic_cprguideline_value_txt);
        this.f8508y = (TextView) this.f8486c.findViewById(C2656R.C2657id.setting_basic_datetype_txt);
        this.f8509z = (Spinner) this.f8486c.findViewById(C2656R.C2657id.setting_basic_datetype_btn);
        this.f8466A = (TextView) this.f8486c.findViewById(C2656R.C2657id.setting_basic_datetype_value_txt);
        this.f8467B = (ImageView) this.f8486c.findViewById(C2656R.C2657id.setting_basic_score_btn);
        this.f8468C = (TextView) this.f8486c.findViewById(C2656R.C2657id.setting_basic_score_txt);
        this.f8469D = (ImageView) this.f8486c.findViewById(C2656R.C2657id.setting_basic_complete_btn);
        this.f8470E = (TextView) this.f8486c.findViewById(C2656R.C2657id.setting_basic_complete_txt);
        this.f8489f.setText(C2557y.f9835g.f10342dd);
        this.f8491h.setText("◀ " + C2557y.f9835g.f10279cT);
        this.f8492i.setText(C2557y.f9835g.f10343de);
        this.f8495l.setText(C2557y.f9835g.f10346dh);
        this.f8496m.setText(C2557y.f9835g.f10581t);
        this.f8499p.setText(C2557y.f9835g.f10272cM);
        this.f8502s.setText(C2557y.f9835g.f10345dg);
        this.f8505v.setText(C2557y.f9835g.f10344df);
        this.f8508y.setText(C2557y.f9835g.f10347di);
        this.f8468C.setText(C2557y.f9835g.f10274cO);
        this.f8470E.setText(C2557y.f9835g.f10283cX);
        this.f8488e.setOnClickListener(this);
        this.f8490g.setOnClickListener(this);
        this.f8467B.setOnClickListener(this);
        this.f8469D.setOnClickListener(this);
        mo8951a();
        return this.f8486c;
    }

    public void onDetach() {
        super.onDetach();
        this.f8487d = null;
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        switch (adapterView.getId()) {
            case C2656R.C2657id.setting_basic_compression_guide_btn /*2131231752*/:
                m13459a(i);
                return;
            case C2656R.C2657id.setting_basic_cprguideline_btn /*2131231755*/:
                m13466e(i);
                return;
            case C2656R.C2657id.setting_basic_datetype_btn /*2131231758*/:
                m13468f(i);
                return;
            case C2656R.C2657id.setting_basic_language_btn /*2131231761*/:
                Log.e("Lang55", i + " ");
                m13464d(i);
                mo8952b();
                return;
            case C2656R.C2657id.setting_basic_manikin_adult_btn /*2131231764*/:
                m13460b(i);
                return;
            case C2656R.C2657id.setting_basic_manikin_child_btn /*2131231767*/:
                m13462c(i);
                return;
            default:
                return;
        }
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
