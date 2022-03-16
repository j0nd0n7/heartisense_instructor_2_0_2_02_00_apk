package com.imlabworld.HS_Instructor;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.imlabworld.p079a.C2573ai;
import com.imlabworld.p079a.C2589ay;
import com.ssomai.android.scalablelayout.ScalableLayout;
import com.woxthebox.draglistview.C2656R;

/* renamed from: com.imlabworld.HS_Instructor.bf */
public class C2445bf extends Fragment implements View.OnClickListener {

    /* renamed from: a */
    private static final String f8607a = "param1";

    /* renamed from: b */
    private static final String f8608b = "param2";

    /* renamed from: c */
    private static final String f8609c = "param3";

    /* renamed from: A */
    private ScalableLayout f8610A;

    /* renamed from: B */
    private ImageView f8611B;

    /* renamed from: C */
    private boolean f8612C;

    /* renamed from: d */
    private int f8613d;

    /* renamed from: e */
    private int f8614e;

    /* renamed from: f */
    private String f8615f;

    /* renamed from: g */
    private View f8616g;

    /* renamed from: h */
    private C2448b f8617h;

    /* renamed from: i */
    private ScalableLayout f8618i;

    /* renamed from: j */
    private TextView f8619j;

    /* renamed from: k */
    private TextView f8620k;

    /* renamed from: l */
    private TextView f8621l;

    /* renamed from: m */
    private TextView f8622m;

    /* renamed from: n */
    private TextView f8623n;

    /* renamed from: o */
    private TextView f8624o;

    /* renamed from: p */
    private TextView f8625p;

    /* renamed from: q */
    private TextView f8626q;

    /* renamed from: r */
    private ImageView f8627r;

    /* renamed from: s */
    private ImageView f8628s;

    /* renamed from: t */
    private ImageView f8629t;

    /* renamed from: u */
    private ImageView f8630u;

    /* renamed from: v */
    private ImageView f8631v;

    /* renamed from: w */
    private ImageView f8632w;

    /* renamed from: x */
    private ImageView f8633x;

    /* renamed from: y */
    private ImageView f8634y;

    /* renamed from: z */
    private ImageView f8635z;

    /* renamed from: com.imlabworld.HS_Instructor.bf$a */
    public enum C2447a {
        ASSIGN,
        CALIBRATION,
        SKIP,
        PAUSE,
        UNPAUSE
    }

    /* renamed from: com.imlabworld.HS_Instructor.bf$b */
    public interface C2448b {
        /* renamed from: a */
        void mo8592a(int i, C2447a aVar);
    }

    /* renamed from: a */
    public static C2445bf m13507a(int i, int i2, String str) {
        C2445bf bfVar = new C2445bf();
        Bundle bundle = new Bundle();
        bundle.putInt(f8607a, i);
        bundle.putInt(f8608b, i2);
        bundle.putString(f8609c, str);
        bfVar.setArguments(bundle);
        return bfVar;
    }

    /* renamed from: c */
    private void m13508c() {
        this.f8618i = (ScalableLayout) this.f8616g.findViewById(C2656R.C2657id.breath_gauge_sc);
        this.f8619j = (TextView) this.f8616g.findViewById(C2656R.C2657id.breath_slot_name);
        this.f8620k = (TextView) this.f8616g.findViewById(C2656R.C2657id.breath_student_name);
        this.f8621l = (TextView) this.f8616g.findViewById(C2656R.C2657id.breath_slot_title_txt);
        this.f8622m = (TextView) this.f8616g.findViewById(C2656R.C2657id.breath_slot_cycle_txt);
        this.f8623n = (TextView) this.f8616g.findViewById(C2656R.C2657id.breath_slot_time_txt);
        this.f8624o = (TextView) this.f8616g.findViewById(C2656R.C2657id.breath_slot_num_txt);
        this.f8625p = (TextView) this.f8616g.findViewById(C2656R.C2657id.breath_slot_rate_txt);
        this.f8626q = (TextView) this.f8616g.findViewById(C2656R.C2657id.breath_slot_feedback_txt);
        this.f8633x = (ImageView) this.f8616g.findViewById(C2656R.C2657id.breath_pause_btn);
        this.f8634y = (ImageView) this.f8616g.findViewById(C2656R.C2657id.breath_skip_btn);
        this.f8635z = (ImageView) this.f8616g.findViewById(C2656R.C2657id.breath_calibration_btn);
        this.f8610A = (ScalableLayout) this.f8616g.findViewById(C2656R.C2657id.breath_pause_sc);
        this.f8611B = (ImageView) this.f8616g.findViewById(C2656R.C2657id.breath_unpause_btn);
        this.f8627r = new ImageView(getActivity());
        this.f8628s = new ImageView(getActivity());
        this.f8629t = new ImageView(getActivity());
        this.f8630u = new ImageView(getActivity());
        this.f8631v = new ImageView(getActivity());
        this.f8632w = new ImageView(getActivity());
        this.f8627r.setBackgroundColor(-4269339);
        this.f8628s.setBackgroundColor(-13719584);
        this.f8629t.setBackgroundColor(-14868344);
        this.f8630u.setBackgroundColor(-1);
        this.f8631v.setBackgroundColor(-1118482);
        this.f8632w.setBackgroundColor(-1);
        this.f8618i.mo10058a((View) this.f8627r, 70.0f, 310.0f, 217.0f, 75.0f);
        this.f8618i.mo10058a((View) this.f8628s, 287.0f, 310.0f, 217.0f, 75.0f);
        this.f8618i.mo10058a((View) this.f8629t, 504.0f, 310.0f, 186.0f, 75.0f);
        this.f8618i.mo10058a((View) this.f8630u, 70.0f, 320.0f, 621.0f, 5.0f);
        this.f8618i.mo10058a((View) this.f8631v, 70.0f, 325.0f, 621.0f, 60.0f);
        this.f8618i.mo10058a((View) this.f8632w, 690.0f, 310.0f, 2.0f, 75.0f);
        this.f8619j.setText(((char) (this.f8613d + 65)) + "");
        this.f8621l.setText(C2557y.f9835g.f10148V);
        this.f8620k.setOnClickListener(this);
        this.f8633x.setVisibility(4);
        this.f8633x.setOnClickListener(this);
        this.f8634y.setOnClickListener(this);
        this.f8635z.setOnClickListener(this);
        this.f8610A.setOnClickListener(this);
        this.f8611B.setOnClickListener(this);
        mo8986b();
    }

    /* renamed from: a */
    public void mo8982a() {
        this.f8621l.setText(C2557y.f9835g.f10148V);
    }

    /* renamed from: a */
    public void mo8983a(int i) {
        this.f8614e = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo8984a(C2573ai aiVar, int i, int i2) {
        if (aiVar != null) {
            double d = aiVar.mo9859d();
            int b = aiVar.mo9857b();
            double j = aiVar.mo9865j();
            int g = aiVar.mo9862g();
            int h = aiVar.mo9863h();
            C2589ay i3 = aiVar.mo9864i();
            if (this.f8614e == 19) {
                this.f8622m.setVisibility(0);
                if (C2557y.f9832d.f9749e != 6) {
                    this.f8622m.setText(C2557y.f9835g.f10141O + " " + (i + 1) + "/" + i2);
                } else {
                    this.f8622m.setText(C2557y.f9835g.f10141O + " " + (i + 1));
                }
                this.f8634y.setVisibility(0);
            } else {
                this.f8622m.setVisibility(4);
                this.f8634y.setVisibility(4);
            }
            this.f8618i.removeView(this.f8631v);
            this.f8618i.mo10058a((View) this.f8631v, 70.0f + (6.2f * ((float) b)), 325.0f, (((float) (100 - b)) * 6.2f) + 1.0f, 60.0f);
            this.f8618i.removeView(this.f8632w);
            this.f8618i.mo10058a((View) this.f8632w, 690.0f, 310.0f, 2.0f, 75.0f);
            this.f8625p.setText(((int) d) + "/" + C2557y.f9835g.f10349dk);
            this.f8623n.setText(((int) j) + C2557y.f9835g.f10348dj);
            this.f8624o.setText(String.format("%02d/%02d", new Object[]{Integer.valueOf(h), Integer.valueOf(g)}));
            switch (i3) {
                case Too_Strong:
                    this.f8626q.setTextColor(-14868344);
                    this.f8626q.setText(C2557y.f9835g.f10350dl);
                    return;
                case Too_Weak:
                    this.f8626q.setTextColor(-4269339);
                    this.f8626q.setText(C2557y.f9835g.f10351dm);
                    return;
                case Good:
                    this.f8626q.setTextColor(-13719584);
                    this.f8626q.setText(C2557y.f9835g.f10356dr);
                    return;
                case NONE:
                    this.f8626q.setText("");
                    return;
                default:
                    return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo8985a(String str) {
        this.f8615f = str;
        if (this.f8615f != null) {
            this.f8620k.setText(this.f8615f);
        } else {
            this.f8620k.setText(C2557y.f9835g.f10275cP);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo8986b() {
        if (this.f8614e == 19) {
            this.f8622m.setVisibility(0);
            this.f8622m.setText("");
            this.f8634y.setVisibility(0);
        } else {
            this.f8622m.setVisibility(4);
            this.f8634y.setVisibility(4);
        }
        this.f8618i.removeView(this.f8631v);
        this.f8618i.mo10058a((View) this.f8631v, 70.0f, 325.0f, 621.0f, 60.0f);
        this.f8618i.removeView(this.f8632w);
        this.f8618i.mo10058a((View) this.f8632w, 690.0f, 310.0f, 2.0f, 75.0f);
        this.f8625p.setText("");
        this.f8623n.setText("");
        this.f8624o.setText("");
        this.f8626q.setText("");
        this.f8612C = false;
        this.f8633x.setImageResource(C2656R.drawable.btn_slot_pause);
        this.f8610A.setVisibility(4);
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (activity instanceof C2448b) {
            this.f8617h = (C2448b) activity;
            return;
        }
        throw new RuntimeException(activity.toString() + " must implement OnFragmentInteractionListener");
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case C2656R.C2657id.breath_calibration_btn /*2131230825*/:
                this.f8617h.mo8592a(this.f8613d, C2447a.CALIBRATION);
                return;
            case C2656R.C2657id.breath_pause_btn /*2131230827*/:
                if (!this.f8612C) {
                    this.f8612C = true;
                    this.f8610A.setVisibility(0);
                    this.f8617h.mo8592a(this.f8613d, C2447a.PAUSE);
                    return;
                }
                return;
            case C2656R.C2657id.breath_skip_btn /*2131230830*/:
                this.f8617h.mo8592a(this.f8613d, C2447a.SKIP);
                return;
            case C2656R.C2657id.breath_student_name /*2131230838*/:
                this.f8617h.mo8592a(this.f8613d, C2447a.ASSIGN);
                return;
            case C2656R.C2657id.breath_unpause_btn /*2131230839*/:
                if (this.f8612C) {
                    this.f8612C = false;
                    this.f8610A.setVisibility(4);
                    this.f8617h.mo8592a(this.f8613d, C2447a.UNPAUSE);
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
            this.f8613d = getArguments().getInt(f8607a);
            this.f8614e = getArguments().getInt(f8608b);
            this.f8615f = getArguments().getString(f8609c);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f8616g = layoutInflater.inflate(C2656R.layout.slot_breath, viewGroup, false);
        m13508c();
        return this.f8616g;
    }

    public void onDetach() {
        super.onDetach();
        this.f8617h = null;
    }
}
