package com.imlabworld.HS_Instructor;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.imlabworld.p079a.C2575ak;
import com.ssomai.android.scalablelayout.ScalableLayout;
import com.woxthebox.draglistview.C2656R;

/* renamed from: com.imlabworld.HS_Instructor.bg */
public class C2449bg extends Fragment implements View.OnClickListener {

    /* renamed from: a */
    static final int f8643a = 0;

    /* renamed from: b */
    static final int f8644b = 1;

    /* renamed from: c */
    static final int f8645c = 2;

    /* renamed from: e */
    private static final String f8646e = "param1";

    /* renamed from: f */
    private static final String f8647f = "param2";

    /* renamed from: g */
    private static final String f8648g = "param3";

    /* renamed from: A */
    private ImageView f8649A;

    /* renamed from: B */
    private ImageView f8650B;

    /* renamed from: C */
    private ImageView f8651C;

    /* renamed from: D */
    private ImageView f8652D;

    /* renamed from: E */
    private ImageView f8653E;

    /* renamed from: F */
    private ImageView f8654F;

    /* renamed from: G */
    private ScalableLayout f8655G;

    /* renamed from: H */
    private ImageView f8656H;

    /* renamed from: I */
    private ImageView f8657I;

    /* renamed from: J */
    private TextView f8658J;

    /* renamed from: K */
    private ImageView f8659K;

    /* renamed from: L */
    private TextView f8660L;

    /* renamed from: M */
    private ImageView f8661M;

    /* renamed from: N */
    private TextView f8662N;

    /* renamed from: O */
    private ImageView f8663O;

    /* renamed from: P */
    private ImageView f8664P;

    /* renamed from: Q */
    private ImageView f8665Q;

    /* renamed from: R */
    private ImageView f8666R;

    /* renamed from: S */
    private ImageView f8667S;

    /* renamed from: T */
    private ImageView f8668T;

    /* renamed from: U */
    private int f8669U;

    /* renamed from: V */
    private int f8670V;

    /* renamed from: d */
    int f8671d;

    /* renamed from: h */
    private int f8672h;

    /* renamed from: i */
    private int f8673i;

    /* renamed from: j */
    private String f8674j;

    /* renamed from: k */
    private View f8675k;

    /* renamed from: l */
    private C2451b f8676l;

    /* renamed from: m */
    private TextView f8677m;

    /* renamed from: n */
    private TextView f8678n;

    /* renamed from: o */
    private ScalableLayout f8679o;

    /* renamed from: p */
    private TextView f8680p;

    /* renamed from: q */
    private TextView f8681q;

    /* renamed from: r */
    private ImageView f8682r;

    /* renamed from: s */
    private TextView f8683s;

    /* renamed from: t */
    private ImageView f8684t;

    /* renamed from: u */
    private ScalableLayout f8685u;

    /* renamed from: v */
    private TextView f8686v;

    /* renamed from: w */
    private ImageView f8687w;

    /* renamed from: x */
    private TextView f8688x;

    /* renamed from: y */
    private ImageView f8689y;

    /* renamed from: z */
    private TextView f8690z;

    /* renamed from: com.imlabworld.HS_Instructor.bg$a */
    public enum C2450a {
        NEW_CANCEL,
        COMPLETE_COMPLETE,
        ASSIGN
    }

    /* renamed from: com.imlabworld.HS_Instructor.bg$b */
    public interface C2451b {
        /* renamed from: a */
        void mo8593a(int i, C2450a aVar);
    }

    /* renamed from: a */
    public static C2449bg m13515a(int i, int i2, String str) {
        C2449bg bgVar = new C2449bg();
        Bundle bundle = new Bundle();
        bundle.putInt(f8646e, i);
        bundle.putInt(f8647f, i2);
        bundle.putString(f8648g, str);
        bgVar.setArguments(bundle);
        return bgVar;
    }

    /* renamed from: f */
    private void m13516f() {
        this.f8673i = 2;
        this.f8669U = 0;
        this.f8658J.setText("0");
        this.f8679o.setVisibility(4);
        this.f8685u.setVisibility(4);
        this.f8655G.setVisibility(0);
    }

    /* renamed from: g */
    private void m13517g() {
        this.f8677m = (TextView) this.f8675k.findViewById(C2656R.C2657id.calibration_slot_name);
        this.f8678n = (TextView) this.f8675k.findViewById(C2656R.C2657id.calibration_student_name);
        this.f8679o = (ScalableLayout) this.f8675k.findViewById(C2656R.C2657id.calibration_new_sc);
        this.f8680p = (TextView) this.f8675k.findViewById(C2656R.C2657id.calibration_new_count_txt);
        this.f8681q = (TextView) this.f8675k.findViewById(C2656R.C2657id.calibration_new_info_txt);
        this.f8682r = (ImageView) this.f8675k.findViewById(C2656R.C2657id.calibration_new_cancel_btn);
        this.f8683s = (TextView) this.f8675k.findViewById(C2656R.C2657id.calibration_new_cancel_txt);
        this.f8685u = (ScalableLayout) this.f8675k.findViewById(C2656R.C2657id.calibration_complete_sc);
        this.f8686v = (TextView) this.f8675k.findViewById(C2656R.C2657id.calibration_complete_info_txt);
        this.f8687w = (ImageView) this.f8675k.findViewById(C2656R.C2657id.calibration_complete_complete_btn);
        this.f8688x = (TextView) this.f8675k.findViewById(C2656R.C2657id.calibration_complete_complete_txt);
        this.f8689y = (ImageView) this.f8675k.findViewById(C2656R.C2657id.calibration_complete_edit_btn);
        this.f8690z = (TextView) this.f8675k.findViewById(C2656R.C2657id.calibration_complete_edit_txt);
        this.f8655G = (ScalableLayout) this.f8675k.findViewById(C2656R.C2657id.calibration_edit_sc);
        this.f8656H = (ImageView) this.f8675k.findViewById(C2656R.C2657id.calibration_edit_dec_btn);
        this.f8657I = (ImageView) this.f8675k.findViewById(C2656R.C2657id.calibration_edit_inc_btn);
        this.f8658J = (TextView) this.f8675k.findViewById(C2656R.C2657id.calibration_edit_value_txt);
        this.f8659K = (ImageView) this.f8675k.findViewById(C2656R.C2657id.calibration_edit_complete_btn);
        this.f8660L = (TextView) this.f8675k.findViewById(C2656R.C2657id.calibration_edit_complete_txt);
        this.f8661M = (ImageView) this.f8675k.findViewById(C2656R.C2657id.calibration_edit_cancel_btn);
        this.f8662N = (TextView) this.f8675k.findViewById(C2656R.C2657id.calibration_edit_cancel_txt);
        this.f8684t = new ImageView(getActivity());
        this.f8684t.setBackgroundColor(-10658467);
        this.f8679o.mo10058a((View) this.f8684t, 60.0f, 230.0f, 641.0f, 100.0f);
        this.f8649A = new ImageView(getActivity());
        this.f8650B = new ImageView(getActivity());
        this.f8651C = new ImageView(getActivity());
        this.f8652D = new ImageView(getActivity());
        this.f8653E = new ImageView(getActivity());
        this.f8654F = new ImageView(getActivity());
        this.f8649A.setBackgroundColor(-12964);
        this.f8650B.setBackgroundColor(-13520490);
        this.f8651C.setBackgroundColor(-764642);
        this.f8652D.setBackgroundColor(-1);
        this.f8653E.setBackgroundColor(-1);
        this.f8654F.setBackgroundColor(-1118482);
        this.f8685u.mo10058a((View) this.f8649A, 60.0f, 230.0f, 224.0f, 100.0f);
        this.f8685u.mo10058a((View) this.f8650B, 284.0f, 230.0f, 224.0f, 100.0f);
        this.f8685u.mo10058a((View) this.f8651C, 508.0f, 230.0f, 192.0f, 100.0f);
        this.f8685u.mo10058a((View) this.f8652D, 60.0f, 240.0f, 641.0f, 5.0f);
        this.f8685u.mo10058a((View) this.f8654F, 60.0f, 245.0f, 641.0f, 85.0f);
        this.f8685u.mo10058a((View) this.f8653E, 700.0f, 230.0f, 2.0f, 100.0f);
        this.f8663O = new ImageView(getActivity());
        this.f8664P = new ImageView(getActivity());
        this.f8665Q = new ImageView(getActivity());
        this.f8666R = new ImageView(getActivity());
        this.f8667S = new ImageView(getActivity());
        this.f8668T = new ImageView(getActivity());
        this.f8663O.setBackgroundColor(-12964);
        this.f8664P.setBackgroundColor(-13520490);
        this.f8665Q.setBackgroundColor(-764642);
        this.f8666R.setBackgroundColor(-1);
        this.f8667S.setBackgroundColor(-1);
        this.f8668T.setBackgroundColor(-1118482);
        this.f8655G.mo10058a((View) this.f8663O, 60.0f, 230.0f, 224.0f, 100.0f);
        this.f8655G.mo10058a((View) this.f8664P, 284.0f, 230.0f, 224.0f, 100.0f);
        this.f8655G.mo10058a((View) this.f8665Q, 508.0f, 230.0f, 192.0f, 100.0f);
        this.f8655G.mo10058a((View) this.f8666R, 60.0f, 240.0f, 641.0f, 5.0f);
        this.f8655G.mo10058a((View) this.f8668T, 60.0f, 245.0f, 641.0f, 85.0f);
        this.f8655G.mo10058a((View) this.f8667S, 700.0f, 230.0f, 2.0f, 100.0f);
        this.f8681q.setText(C2557y.f9835g.f10577p);
        this.f8683s.setText(C2557y.f9835g.f10210bD);
        this.f8686v.setText(C2557y.f9835g.f10148V);
        this.f8688x.setText(C2557y.f9835g.f10204ay);
        this.f8690z.setText(C2557y.f9835g.f10573l);
        this.f8660L.setText(C2557y.f9835g.f10204ay);
        this.f8662N.setText(C2557y.f9835g.f10210bD);
        this.f8682r.setOnClickListener(this);
        this.f8687w.setOnClickListener(this);
        this.f8689y.setOnClickListener(this);
        this.f8656H.setOnClickListener(this);
        this.f8657I.setOnClickListener(this);
        this.f8659K.setOnClickListener(this);
        this.f8661M.setOnClickListener(this);
        this.f8677m.setText(((char) (this.f8672h + 65)) + "");
        this.f8678n.setOnClickListener(this);
    }

    /* renamed from: a */
    public void mo8992a() {
        this.f8680p.setText("00/05");
        this.f8673i = 0;
        this.f8679o.setVisibility(0);
        this.f8685u.setVisibility(4);
        this.f8655G.setVisibility(4);
    }

    /* renamed from: a */
    public void mo8993a(int i) {
        this.f8670V = i;
    }

    /* renamed from: a */
    public void mo8994a(C2575ak akVar) {
        switch (this.f8673i) {
            case 0:
                this.f8679o.removeView(this.f8684t);
                this.f8679o.mo10058a((View) this.f8684t, 60.0f, 230.0f, ((float) akVar.mo9868c()) * 6.4f, 100.0f);
                this.f8680p.setText(String.format("%02d/%02d", new Object[]{Integer.valueOf(akVar.mo9870e()), 5}));
                return;
            case 1:
                this.f8685u.removeView(this.f8654F);
                this.f8685u.mo10058a((View) this.f8654F, 60.0f + (((float) akVar.mo9868c()) * 6.4f), 245.0f, (((float) (100 - akVar.mo9868c())) * 6.4f) + 1.0f, 85.0f);
                this.f8685u.removeView(this.f8653E);
                this.f8685u.mo10058a((View) this.f8653E, 700.0f, 230.0f, 2.0f, 100.0f);
                return;
            case 2:
                this.f8655G.removeView(this.f8668T);
                this.f8655G.mo10058a((View) this.f8668T, 60.0f + (((float) akVar.mo9868c()) * 6.4f), 245.0f, (((float) (100 - akVar.mo9868c())) * 6.4f) + 1.0f, 85.0f);
                this.f8655G.removeView(this.f8667S);
                this.f8655G.mo10058a((View) this.f8667S, 700.0f, 230.0f, 2.0f, 100.0f);
                return;
            default:
                return;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo8995a(String str) {
        this.f8674j = str;
        if (this.f8674j != null) {
            this.f8678n.setText(this.f8674j);
        } else {
            this.f8678n.setText(C2557y.f9835g.f10275cP);
        }
    }

    /* renamed from: b */
    public void mo8996b() {
        this.f8673i = 1;
        this.f8679o.setVisibility(4);
        this.f8685u.setVisibility(0);
        this.f8655G.setVisibility(4);
    }

    /* renamed from: c */
    public void mo8997c() {
        this.f8681q.setText(C2557y.f9835g.f10577p);
        this.f8683s.setText(C2557y.f9835g.f10210bD);
        this.f8686v.setText(C2557y.f9835g.f10148V);
        this.f8688x.setText(C2557y.f9835g.f10204ay);
        this.f8690z.setText(C2557y.f9835g.f10573l);
        this.f8660L.setText(C2557y.f9835g.f10204ay);
        this.f8662N.setText(C2557y.f9835g.f10210bD);
    }

    /* renamed from: d */
    public int mo8998d() {
        return this.f8673i;
    }

    /* renamed from: e */
    public int mo8999e() {
        return this.f8670V;
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (activity instanceof C2451b) {
            this.f8676l = (C2451b) activity;
            return;
        }
        throw new RuntimeException(activity.toString() + " must implement OnFragmentInteractionListener");
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case C2656R.C2657id.calibration_complete_complete_btn /*2131230855*/:
                this.f8676l.mo8593a(this.f8672h, C2450a.COMPLETE_COMPLETE);
                return;
            case C2656R.C2657id.calibration_complete_edit_btn /*2131230857*/:
                m13516f();
                return;
            case C2656R.C2657id.calibration_edit_cancel_btn /*2131230861*/:
                this.f8670V += this.f8669U * 10;
                mo8996b();
                return;
            case C2656R.C2657id.calibration_edit_complete_btn /*2131230863*/:
                mo8996b();
                return;
            case C2656R.C2657id.calibration_edit_dec_btn /*2131230865*/:
                if (this.f8670V < 1050) {
                    this.f8669U--;
                    this.f8670V += 10;
                    if (this.f8670V > 1050) {
                        this.f8670V = 1050;
                    }
                    this.f8658J.setText(this.f8669U + "");
                    return;
                }
                return;
            case C2656R.C2657id.calibration_edit_inc_btn /*2131230866*/:
                if (this.f8670V > 50) {
                    this.f8669U++;
                    this.f8670V -= 10;
                    if (this.f8670V < 50) {
                        this.f8670V = 50;
                    }
                    this.f8658J.setText(this.f8669U + "");
                    return;
                }
                return;
            case C2656R.C2657id.calibration_new_cancel_btn /*2131230869*/:
                this.f8676l.mo8593a(this.f8672h, C2450a.NEW_CANCEL);
                return;
            case C2656R.C2657id.calibration_student_name /*2131230876*/:
                this.f8676l.mo8593a(this.f8672h, C2450a.ASSIGN);
                return;
            default:
                return;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.f8672h = getArguments().getInt(f8646e);
            this.f8673i = getArguments().getInt(f8647f);
            this.f8674j = getArguments().getString(f8648g);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f8675k = layoutInflater.inflate(C2656R.layout.slot_calibration, viewGroup, false);
        m13517g();
        return this.f8675k;
    }

    public void onDetach() {
        super.onDetach();
        this.f8676l = null;
    }
}
