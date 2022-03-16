package com.imlabworld.HS_Instructor;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.ssomai.android.scalablelayout.ScalableLayout;
import com.woxthebox.draglistview.C2656R;

/* renamed from: com.imlabworld.HS_Instructor.bd */
public class C2439bd extends Fragment implements View.OnClickListener {

    /* renamed from: a */
    private static final String f8561a = "param1";

    /* renamed from: A */
    private ImageView f8562A;

    /* renamed from: B */
    private C2551s f8563B;

    /* renamed from: C */
    private int f8564C;

    /* renamed from: D */
    private int f8565D;

    /* renamed from: E */
    private C2549q f8566E;

    /* renamed from: b */
    private String f8567b;

    /* renamed from: c */
    private C2441b f8568c;

    /* renamed from: d */
    private View f8569d;

    /* renamed from: e */
    private ScalableLayout f8570e;

    /* renamed from: f */
    private TextView f8571f;

    /* renamed from: g */
    private ImageView f8572g;

    /* renamed from: h */
    private ImageView f8573h;

    /* renamed from: i */
    private TextView f8574i;

    /* renamed from: j */
    private TextView f8575j;

    /* renamed from: k */
    private TextView f8576k;

    /* renamed from: l */
    private ImageView f8577l;

    /* renamed from: m */
    private TextView f8578m;

    /* renamed from: n */
    private ImageView f8579n;

    /* renamed from: o */
    private TextView f8580o;

    /* renamed from: p */
    private ImageView f8581p;

    /* renamed from: q */
    private TextView f8582q;

    /* renamed from: r */
    private ImageView f8583r;

    /* renamed from: s */
    private ImageView f8584s;

    /* renamed from: t */
    private TextView f8585t;

    /* renamed from: u */
    private TextView f8586u;

    /* renamed from: v */
    private TextView f8587v;

    /* renamed from: w */
    private ImageView f8588w;

    /* renamed from: x */
    private TextView f8589x;

    /* renamed from: y */
    private ImageView f8590y;

    /* renamed from: z */
    private TextView f8591z;

    /* renamed from: com.imlabworld.HS_Instructor.bd$a */
    public enum C2440a {
        SAVE
    }

    /* renamed from: com.imlabworld.HS_Instructor.bd$b */
    public interface C2441b {
        /* renamed from: a */
        void mo8606a(C2440a aVar);
    }

    /* renamed from: a */
    public static C2439bd m13495a(String str) {
        C2439bd bdVar = new C2439bd();
        Bundle bundle = new Bundle();
        bundle.putString(f8561a, str);
        bdVar.setArguments(bundle);
        return bdVar;
    }

    /* renamed from: a */
    private void m13496a(C2551s sVar, int i, int i2) {
        this.f8574i.setText(i + "");
        if (sVar.mo9668e() == 1) {
            this.f8577l.setImageResource(C2656R.drawable.toggle_on);
        } else {
            this.f8577l.setImageResource(C2656R.drawable.toggle_off);
        }
        if (sVar.mo9664c() == 1) {
            this.f8579n.setImageResource(C2656R.drawable.toggle_on);
        } else {
            this.f8579n.setImageResource(C2656R.drawable.toggle_off);
        }
        if (sVar.mo9662b() == 1) {
            this.f8581p.setImageResource(C2656R.drawable.toggle_on);
        } else {
            this.f8581p.setImageResource(C2656R.drawable.toggle_off);
        }
        this.f8585t.setText(i2 + "");
        if (sVar.mo9672g() == 1) {
            this.f8588w.setImageResource(C2656R.drawable.toggle_on);
        } else {
            this.f8588w.setImageResource(C2656R.drawable.toggle_off);
        }
    }

    /* renamed from: b */
    private void m13497b() {
        this.f8563B = this.f8566E.mo9627b();
        this.f8564C = (int) (this.f8563B.mo9674h() * 100.0d);
        this.f8565D = 100 - this.f8564C;
        m13496a(this.f8563B, this.f8564C, this.f8565D);
    }

    /* renamed from: c */
    private void m13498c() {
        this.f8566E.mo9625a(this.f8563B);
        C2557y.f9853y = this.f8566E.mo9627b();
    }

    /* renamed from: d */
    private void m13499d() {
        this.f8563B.mo9667d(1);
        this.f8563B.mo9663b(1);
        this.f8563B.mo9665c(1);
        this.f8563B.mo9669e(1);
        this.f8563B.mo9671f(1);
        this.f8563B.mo9673g(0);
        this.f8563B.mo9660a(0.75d);
        this.f8564C = (int) (this.f8563B.mo9674h() * 100.0d);
        this.f8565D = 100 - this.f8564C;
        m13496a(this.f8563B, this.f8564C, this.f8565D);
        m13498c();
    }

    /* renamed from: a */
    public void mo8969a() {
        this.f8571f.setText(C2557y.f9835g.f10147U);
        this.f8575j.setText(C2557y.f9835g.f10188ai);
        this.f8576k.setText(C2557y.f9835g.f10330dR);
        this.f8578m.setText(C2557y.f9835g.f10189aj);
        this.f8580o.setText(C2557y.f9835g.f10187ah);
        this.f8582q.setText(C2557y.f9835g.f10148V);
        this.f8586u.setText(C2557y.f9835g.f10190ak);
        this.f8587v.setText(C2557y.f9835g.f10189aj);
        this.f8589x.setText(C2557y.f9835g.f10475gD);
        this.f8591z.setText(C2557y.f9835g.f10574m);
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (activity instanceof C2441b) {
            this.f8568c = (C2441b) activity;
            return;
        }
        throw new RuntimeException(activity.toString() + " must implement OnFragmentInteractionListener");
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case C2656R.C2657id.b_dec_btn /*2131230810*/:
            case C2656R.C2657id.c_inc_btn /*2131230846*/:
                if (this.f8564C < 100) {
                    this.f8564C++;
                    this.f8565D--;
                    this.f8574i.setText(this.f8564C + "");
                    this.f8585t.setText(this.f8565D + "");
                    this.f8563B.mo9660a(((double) this.f8564C) / 100.0d);
                    return;
                }
                return;
            case C2656R.C2657id.b_inc_btn /*2131230811*/:
            case C2656R.C2657id.c_dec_btn /*2131230843*/:
                if (this.f8564C > 0) {
                    this.f8564C--;
                    this.f8565D++;
                    this.f8574i.setText(this.f8564C + "");
                    this.f8585t.setText(this.f8565D + "");
                    this.f8563B.mo9660a(((double) this.f8564C) / 100.0d);
                    return;
                }
                return;
            case C2656R.C2657id.b_rate_btn /*2131230812*/:
                if (this.f8563B.mo9672g() == 0) {
                    this.f8563B.mo9673g(1);
                    this.f8588w.setImageResource(C2656R.drawable.toggle_on);
                    return;
                }
                this.f8563B.mo9673g(0);
                this.f8588w.setImageResource(C2656R.drawable.toggle_off);
                return;
            case C2656R.C2657id.c_pos_btn /*2131230847*/:
                if (this.f8563B.mo9662b() == 0) {
                    this.f8563B.mo9663b(1);
                    this.f8581p.setImageResource(C2656R.drawable.toggle_on);
                    return;
                }
                this.f8563B.mo9663b(0);
                this.f8581p.setImageResource(C2656R.drawable.toggle_off);
                return;
            case C2656R.C2657id.c_rate_btn /*2131230849*/:
                if (this.f8563B.mo9664c() == 0) {
                    this.f8563B.mo9665c(1);
                    this.f8579n.setImageResource(C2656R.drawable.toggle_on);
                    return;
                }
                this.f8563B.mo9665c(0);
                this.f8579n.setImageResource(C2656R.drawable.toggle_off);
                return;
            case C2656R.C2657id.c_recoil_btn /*2131230851*/:
                if (this.f8563B.mo9668e() == 0) {
                    this.f8563B.mo9669e(1);
                    this.f8577l.setImageResource(C2656R.drawable.toggle_on);
                    return;
                }
                this.f8563B.mo9669e(0);
                this.f8577l.setImageResource(C2656R.drawable.toggle_off);
                return;
            case C2656R.C2657id.reset_settings_btn /*2131231694*/:
                m13499d();
                return;
            case C2656R.C2657id.save_btn /*2131231713*/:
                m13498c();
                this.f8568c.mo8606a(C2440a.SAVE);
                return;
            default:
                return;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.f8567b = getArguments().getString(f8561a);
        }
        this.f8566E = new C2549q(getActivity());
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f8569d = layoutInflater.inflate(C2656R.layout.setting_scoresetting, viewGroup, false);
        this.f8570e = (ScalableLayout) this.f8569d.findViewById(C2656R.C2657id.score_setting);
        this.f8571f = (TextView) this.f8569d.findViewById(C2656R.C2657id.c_title_txt);
        this.f8572g = (ImageView) this.f8569d.findViewById(C2656R.C2657id.c_dec_btn);
        this.f8573h = (ImageView) this.f8569d.findViewById(C2656R.C2657id.c_inc_btn);
        this.f8574i = (TextView) this.f8569d.findViewById(C2656R.C2657id.c_value_txt);
        this.f8575j = (TextView) this.f8569d.findViewById(C2656R.C2657id.c_depth_txt);
        this.f8576k = (TextView) this.f8569d.findViewById(C2656R.C2657id.c_recoil_txt);
        this.f8578m = (TextView) this.f8569d.findViewById(C2656R.C2657id.c_rate_txt);
        this.f8580o = (TextView) this.f8569d.findViewById(C2656R.C2657id.c_pos_txt);
        this.f8577l = (ImageView) this.f8569d.findViewById(C2656R.C2657id.c_recoil_btn);
        this.f8579n = (ImageView) this.f8569d.findViewById(C2656R.C2657id.c_rate_btn);
        this.f8581p = (ImageView) this.f8569d.findViewById(C2656R.C2657id.c_pos_btn);
        this.f8582q = (TextView) this.f8569d.findViewById(C2656R.C2657id.b_title_txt);
        this.f8583r = (ImageView) this.f8569d.findViewById(C2656R.C2657id.b_dec_btn);
        this.f8584s = (ImageView) this.f8569d.findViewById(C2656R.C2657id.b_inc_btn);
        this.f8585t = (TextView) this.f8569d.findViewById(C2656R.C2657id.b_value_txt);
        this.f8586u = (TextView) this.f8569d.findViewById(C2656R.C2657id.b_volume_txt);
        this.f8587v = (TextView) this.f8569d.findViewById(C2656R.C2657id.b_rate_txt);
        this.f8588w = (ImageView) this.f8569d.findViewById(C2656R.C2657id.b_rate_btn);
        this.f8590y = (ImageView) this.f8569d.findViewById(C2656R.C2657id.reset_settings_btn);
        this.f8589x = (TextView) this.f8569d.findViewById(C2656R.C2657id.reset_settings_txt);
        this.f8562A = (ImageView) this.f8569d.findViewById(C2656R.C2657id.save_btn);
        this.f8591z = (TextView) this.f8569d.findViewById(C2656R.C2657id.save_txt);
        this.f8571f.setText(C2557y.f9835g.f10147U);
        this.f8575j.setText(C2557y.f9835g.f10188ai);
        this.f8576k.setText(C2557y.f9835g.f10330dR);
        this.f8578m.setText(C2557y.f9835g.f10189aj);
        this.f8580o.setText(C2557y.f9835g.f10187ah);
        this.f8582q.setText(C2557y.f9835g.f10148V);
        this.f8586u.setText(C2557y.f9835g.f10190ak);
        this.f8587v.setText(C2557y.f9835g.f10189aj);
        this.f8589x.setText(C2557y.f9835g.f10475gD);
        this.f8591z.setText(C2557y.f9835g.f10574m);
        this.f8570e.setOnClickListener(this);
        this.f8572g.setOnClickListener(this);
        this.f8573h.setOnClickListener(this);
        this.f8577l.setOnClickListener(this);
        this.f8579n.setOnClickListener(this);
        this.f8581p.setOnClickListener(this);
        this.f8588w.setOnClickListener(this);
        this.f8583r.setOnClickListener(this);
        this.f8584s.setOnClickListener(this);
        this.f8590y.setOnClickListener(this);
        this.f8562A.setOnClickListener(this);
        m13497b();
        return this.f8569d;
    }

    public void onDetach() {
        super.onDetach();
        this.f8568c = null;
    }
}
