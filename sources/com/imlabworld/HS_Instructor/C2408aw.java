package com.imlabworld.HS_Instructor;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.imlabworld.p079a.C2573ai;
import com.imlabworld.p079a.C2576al;
import com.imlabworld.p079a.C2589ay;
import com.ssomai.android.scalablelayout.ScalableLayout;
import com.woxthebox.draglistview.C2656R;

/* renamed from: com.imlabworld.HS_Instructor.aw */
public class C2408aw extends Fragment implements View.OnClickListener {

    /* renamed from: a */
    private static final String f8205a = "param";

    /* renamed from: A */
    private TextView f8206A;

    /* renamed from: B */
    private TextView f8207B;

    /* renamed from: C */
    private TextView f8208C;

    /* renamed from: D */
    private ImageView f8209D;

    /* renamed from: E */
    private ImageView f8210E;

    /* renamed from: F */
    private ImageView f8211F;

    /* renamed from: G */
    private ImageView f8212G;

    /* renamed from: H */
    private ImageView f8213H;

    /* renamed from: I */
    private ImageView f8214I;

    /* renamed from: J */
    private ImageView f8215J;

    /* renamed from: K */
    private ImageView f8216K;

    /* renamed from: L */
    private ImageView f8217L;

    /* renamed from: M */
    private ImageView f8218M;

    /* renamed from: N */
    private ImageView f8219N;

    /* renamed from: O */
    private ImageView f8220O;

    /* renamed from: P */
    private ImageView f8221P;

    /* renamed from: Q */
    private ImageView f8222Q;

    /* renamed from: R */
    private ImageView f8223R;

    /* renamed from: S */
    private ImageView f8224S;

    /* renamed from: T */
    private View f8225T;

    /* renamed from: b */
    private String f8226b;

    /* renamed from: c */
    private ScalableLayout f8227c;

    /* renamed from: d */
    private TextView f8228d;

    /* renamed from: e */
    private TextView f8229e;

    /* renamed from: f */
    private TextView f8230f;

    /* renamed from: g */
    private TextView f8231g;

    /* renamed from: h */
    private TextView f8232h;

    /* renamed from: i */
    private TextView f8233i;

    /* renamed from: j */
    private ScalableLayout f8234j;

    /* renamed from: k */
    private final ImageView[] f8235k = new ImageView[4];

    /* renamed from: l */
    private ScalableLayout f8236l;

    /* renamed from: m */
    private TextView f8237m;

    /* renamed from: n */
    private TextView f8238n;

    /* renamed from: o */
    private ScalableLayout f8239o;

    /* renamed from: p */
    private ScalableLayout f8240p;

    /* renamed from: q */
    private TextView f8241q;

    /* renamed from: r */
    private TextView f8242r;

    /* renamed from: s */
    private TextView f8243s;

    /* renamed from: t */
    private TextView f8244t;

    /* renamed from: u */
    private TextView f8245u;

    /* renamed from: v */
    private TextView f8246v;

    /* renamed from: w */
    private TextView f8247w;

    /* renamed from: x */
    private ImageView f8248x;

    /* renamed from: y */
    private ImageView f8249y;

    /* renamed from: z */
    private ImageView f8250z;

    /* renamed from: com.imlabworld.HS_Instructor.aw$a */
    private enum C2410a {
    }

    /* renamed from: a */
    public static C2408aw m13365a(String str) {
        C2408aw awVar = new C2408aw();
        Bundle bundle = new Bundle();
        bundle.putString(f8205a, str);
        awVar.setArguments(bundle);
        return awVar;
    }

    /* renamed from: a */
    public void mo8870a() {
        this.f8231g.setText(C2557y.f9835g.f10141O);
        this.f8233i.setText(C2557y.f9835g.f10348dj);
        this.f8243s.setText(C2557y.f9835g.f10191al);
        this.f8245u.setText(C2557y.f9835g.f10147U);
        this.f8206A.setText(C2557y.f9835g.f10148V);
        this.f8237m.setText(C2557y.f9835g.f10184ae);
    }

    /* renamed from: a */
    public void mo8871a(int i) {
        this.f8228d.setText(((char) (i + 65)) + "");
        this.f8227c.removeView(this.f8212G);
        this.f8227c.removeView(this.f8213H);
        this.f8227c.removeView(this.f8214I);
        this.f8227c.removeView(this.f8215J);
        this.f8227c.mo10058a((View) this.f8212G, 700.0f, 600.0f, (float) (C2556x.f9788e * 8), 100.0f);
        this.f8227c.mo10058a((View) this.f8213H, (float) ((C2556x.f9788e * 8) + 700), 600.0f, (float) ((C2556x.f9789f - C2556x.f9788e) * 8), 100.0f);
        this.f8227c.mo10058a((View) this.f8214I, (float) ((C2556x.f9789f * 8) + 700), 600.0f, (float) ((100 - C2556x.f9789f) * 8), 100.0f);
        this.f8227c.mo10058a((View) this.f8215J, 700.0f, 610.0f, 801.0f, 5.0f);
        this.f8234j.setVisibility(0);
        this.f8236l.setVisibility(4);
        this.f8239o.setVisibility(4);
        this.f8242r.setVisibility(0);
        this.f8230f.setText("");
        this.f8232h.setText("");
        this.f8244t.setText("");
        this.f8238n.setText("");
        this.f8246v.setText("");
        this.f8247w.setText("");
        this.f8248x.setVisibility(4);
        this.f8249y.setVisibility(4);
        this.f8250z.setVisibility(4);
        this.f8207B.setText("");
        this.f8208C.setText("");
        this.f8209D.setVisibility(4);
        this.f8210E.setVisibility(4);
        this.f8211F.setVisibility(4);
        this.f8242r.setBackgroundColor(-1118482);
        this.f8242r.setText("");
        this.f8241q.setBackgroundColor(-1118482);
        this.f8241q.setText("");
        this.f8227c.removeView(this.f8216K);
        this.f8227c.removeView(this.f8217L);
        this.f8227c.mo10058a((View) this.f8216K, 700.0f, 615.0f, 801.0f, 85.0f);
        this.f8227c.mo10058a((View) this.f8217L, 1500.0f, 600.0f, 2.0f, 100.0f);
        this.f8227c.removeView(this.f8222Q);
        this.f8227c.removeView(this.f8223R);
        this.f8227c.mo10058a((View) this.f8222Q, 700.0f, 915.0f, 801.0f, 85.0f);
        this.f8227c.mo10058a((View) this.f8223R, 1500.0f, 900.0f, 2.0f, 100.0f);
        for (int i2 = 0; i2 < 4; i2++) {
            this.f8235k[i2].setVisibility(4);
        }
    }

    /* renamed from: a */
    public void mo8872a(int i, C2573ai aiVar, int i2, int i3, int i4) {
        this.f8228d.setText(((char) (i + 65)) + "");
        this.f8234j.setVisibility(4);
        this.f8236l.setVisibility(4);
        this.f8239o.setVisibility(0);
        this.f8242r.setVisibility(4);
        if (aiVar != null) {
            double d = aiVar.mo9859d();
            int b = aiVar.mo9857b();
            double c = aiVar.mo9858c();
            double j = aiVar.mo9865j();
            int g = aiVar.mo9862g();
            int h = aiVar.mo9863h();
            double d2 = g == 0 ? 7.0d : 60.0d / d;
            C2589ay i5 = aiVar.mo9864i();
            if (i4 == 19) {
                this.f8230f.setVisibility(0);
                this.f8231g.setVisibility(0);
                if (C2557y.f9832d.f9749e != 6) {
                    this.f8230f.setText((i2 + 1) + "/" + i3);
                } else {
                    this.f8230f.setText((i2 + 1) + "");
                }
            } else {
                this.f8230f.setVisibility(4);
                this.f8231g.setVisibility(4);
            }
            this.f8232h.setText(((int) j) + "");
            this.f8244t.setText(String.format("%02d/%02d", new Object[]{Integer.valueOf(h), Integer.valueOf(g)}));
            this.f8227c.removeView(this.f8222Q);
            this.f8227c.mo10058a((View) this.f8222Q, (float) ((b * 8) + 700), 915.0f, (float) (((100 - b) * 8) + 1), 85.0f);
            this.f8227c.removeView(this.f8223R);
            this.f8227c.mo10058a((View) this.f8223R, 1500.0f, 900.0f, 2.0f, 100.0f);
            this.f8240p.removeView(this.f8224S);
            this.f8240p.mo10058a((View) this.f8224S, 0.0f, 0.0f + (2.1f * ((float) (100 - b))), 240.0f, 2.1f * ((float) b));
            this.f8246v.setText("");
            this.f8247w.setText("");
            this.f8207B.setText(String.format("%dml", new Object[]{Integer.valueOf((int) c)}));
            this.f8248x.setVisibility(4);
            this.f8249y.setVisibility(4);
            this.f8250z.setVisibility(4);
            if (d2 < 5.0d) {
                this.f8209D.setVisibility(4);
                this.f8210E.setVisibility(4);
                this.f8211F.setVisibility(0);
            } else if (d2 <= 15.0d) {
                this.f8209D.setVisibility(4);
                this.f8210E.setVisibility(0);
                this.f8211F.setVisibility(4);
            } else {
                this.f8209D.setVisibility(0);
                this.f8210E.setVisibility(4);
                this.f8211F.setVisibility(4);
            }
            this.f8208C.setText(((int) d) + "/" + C2557y.f9835g.f10349dk);
            switch (i5) {
                case Too_Strong:
                    this.f8241q.setBackgroundColor(-14868344);
                    this.f8241q.setText(C2557y.f9835g.f10350dl);
                    return;
                case Too_Weak:
                    this.f8241q.setBackgroundColor(-4269339);
                    this.f8241q.setText(C2557y.f9835g.f10351dm);
                    return;
                case Good:
                    this.f8241q.setBackgroundColor(-13719584);
                    this.f8241q.setText(C2557y.f9835g.f10356dr);
                    return;
                case NONE:
                    this.f8241q.setBackgroundColor(-1118482);
                    this.f8241q.setText("");
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: a */
    public void mo8873a(int i, C2576al alVar, int i2, int i3, int i4) {
        this.f8228d.setText(((char) (i + 65)) + "");
        this.f8234j.setVisibility(0);
        this.f8236l.setVisibility(4);
        this.f8239o.setVisibility(4);
        if (alVar != null) {
            double e = alVar.mo9877e();
            int b = alVar.mo9874b();
            double d = alVar.mo9876d();
            boolean[] c = alVar.mo9875c();
            double j = alVar.mo9865j();
            double k = alVar.mo9866k();
            int h = alVar.mo9880h();
            int m = alVar.mo9882m();
            int n = alVar.mo9883n();
            double d2 = m == 0 ? 0.55d : 60.0d / e;
            C2589ay i5 = alVar.mo9864i();
            if (i4 == 18) {
                this.f8230f.setVisibility(0);
                this.f8231g.setVisibility(0);
                if (C2557y.f9832d.f9749e != 6) {
                    this.f8230f.setText((i2 + 1) + "/" + i3);
                } else {
                    this.f8230f.setText((i2 + 1) + "");
                }
            } else {
                this.f8230f.setVisibility(4);
                this.f8231g.setVisibility(4);
            }
            this.f8232h.setText(((int) j) + "");
            this.f8244t.setText(String.format("%02d/%02d", new Object[]{Integer.valueOf(n), Integer.valueOf(m)}));
            this.f8238n.setText(String.format("%02d%s", new Object[]{Integer.valueOf((int) k), C2557y.f9835g.f10348dj}));
            if (k < 3.0d || m <= 0) {
                this.f8236l.setVisibility(4);
                this.f8234j.setVisibility(0);
            } else {
                this.f8236l.setVisibility(0);
                this.f8234j.setVisibility(4);
                if (k <= 10.0d) {
                    this.f8237m.setTextColor(-13520490);
                    this.f8238n.setTextColor(-10658467);
                } else {
                    this.f8237m.setTextColor(-764642);
                    this.f8238n.setTextColor(-764642);
                }
            }
            for (int i6 = 0; i6 < 4; i6++) {
                if (!c[i6]) {
                    this.f8235k[i6].setVisibility(4);
                } else {
                    this.f8235k[i6].setVisibility(0);
                }
            }
            this.f8227c.removeView(this.f8216K);
            this.f8227c.mo10058a((View) this.f8216K, (float) ((b * 8) + 700), 615.0f, (float) (((100 - b) * 8) + 1), 85.0f);
            this.f8227c.removeView(this.f8217L);
            this.f8227c.mo10058a((View) this.f8217L, 1500.0f, 600.0f, 2.0f, 100.0f);
            this.f8207B.setText("");
            this.f8208C.setText("");
            this.f8246v.setText(String.format("%.1fcm", new Object[]{Double.valueOf(d)}));
            this.f8209D.setVisibility(4);
            this.f8210E.setVisibility(4);
            this.f8211F.setVisibility(4);
            if (d2 < 0.5d) {
                this.f8248x.setVisibility(4);
                this.f8249y.setVisibility(4);
                this.f8250z.setVisibility(0);
            } else if (d2 <= 0.6d) {
                this.f8248x.setVisibility(4);
                this.f8249y.setVisibility(0);
                this.f8250z.setVisibility(4);
            } else {
                this.f8248x.setVisibility(0);
                this.f8249y.setVisibility(4);
                this.f8250z.setVisibility(4);
            }
            this.f8247w.setText(((int) e) + "/" + C2557y.f9835g.f10349dk);
            switch (i5) {
                case Too_Strong:
                    this.f8241q.setBackgroundColor(-764642);
                    this.f8241q.setText(C2557y.f9835g.f10350dl);
                    break;
                case Too_Weak:
                    this.f8241q.setBackgroundColor(-12964);
                    this.f8241q.setText(C2557y.f9835g.f10351dm);
                    break;
                case Wrong_Position:
                    this.f8241q.setBackgroundColor(-764642);
                    this.f8241q.setText(C2557y.f9835g.f10352dn);
                    break;
                case Too_Fast:
                    this.f8241q.setBackgroundColor(-764642);
                    this.f8241q.setText(C2557y.f9835g.f10354dp);
                    break;
                case Too_Slow:
                    this.f8241q.setBackgroundColor(-12964);
                    this.f8241q.setText(C2557y.f9835g.f10355dq);
                    break;
                case Good:
                    this.f8241q.setBackgroundColor(-13520490);
                    this.f8241q.setText(C2557y.f9835g.f10356dr);
                    break;
                case NONE:
                    this.f8241q.setBackgroundColor(-1118482);
                    this.f8241q.setText("");
                    break;
            }
            this.f8242r.setVisibility(0);
            switch (h) {
                case 0:
                    this.f8242r.setBackgroundColor(-13520490);
                    this.f8242r.setText(C2557y.f9835g.f10356dr);
                    return;
                case 1:
                    this.f8242r.setBackgroundColor(-764642);
                    this.f8242r.setText(C2557y.f9835g.f10353do);
                    return;
                case 3:
                    this.f8242r.setBackgroundColor(-1118482);
                    this.f8242r.setText("");
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: b */
    public void mo8874b(int i) {
        this.f8228d.setText(((char) (i + 65)) + "");
        this.f8234j.setVisibility(4);
        this.f8236l.setVisibility(4);
        this.f8239o.setVisibility(0);
        this.f8242r.setVisibility(4);
        this.f8230f.setText("");
        this.f8232h.setText("");
        this.f8244t.setText("");
        this.f8238n.setText("");
        this.f8246v.setText("");
        this.f8247w.setText("");
        this.f8248x.setVisibility(4);
        this.f8249y.setVisibility(4);
        this.f8250z.setVisibility(4);
        this.f8207B.setText("");
        this.f8208C.setText("");
        this.f8209D.setVisibility(4);
        this.f8210E.setVisibility(4);
        this.f8211F.setVisibility(4);
        this.f8242r.setBackgroundColor(-1118482);
        this.f8242r.setText("");
        this.f8241q.setBackgroundColor(-1118482);
        this.f8241q.setText("");
        this.f8227c.removeView(this.f8216K);
        this.f8227c.removeView(this.f8217L);
        this.f8227c.mo10058a((View) this.f8216K, 700.0f, 615.0f, 801.0f, 85.0f);
        this.f8227c.mo10058a((View) this.f8217L, 1500.0f, 600.0f, 2.0f, 100.0f);
        this.f8227c.removeView(this.f8222Q);
        this.f8227c.removeView(this.f8223R);
        this.f8227c.mo10058a((View) this.f8222Q, 700.0f, 915.0f, 801.0f, 85.0f);
        this.f8227c.mo10058a((View) this.f8223R, 1500.0f, 900.0f, 2.0f, 100.0f);
        for (int i2 = 0; i2 < 4; i2++) {
            this.f8235k[i2].setVisibility(4);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo8875b(String str) {
        if (str != null) {
            this.f8229e.setText(str);
        } else {
            this.f8229e.setText("-");
        }
    }

    public void onClick(View view) {
        view.getId();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.f8226b = getArguments().getString(f8205a);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f8225T = layoutInflater.inflate(C2656R.layout.detail_education, viewGroup, false);
        this.f8227c = (ScalableLayout) this.f8225T.findViewById(C2656R.C2657id.detail_education_sc);
        this.f8228d = (TextView) this.f8225T.findViewById(C2656R.C2657id.detail_education_group_name_txt);
        this.f8229e = (TextView) this.f8225T.findViewById(C2656R.C2657id.detail_education_student_name_txt);
        this.f8230f = (TextView) this.f8225T.findViewById(C2656R.C2657id.detail_education_cycle_num_txt);
        this.f8231g = (TextView) this.f8225T.findViewById(C2656R.C2657id.detail_education_cycle_txt);
        this.f8232h = (TextView) this.f8225T.findViewById(C2656R.C2657id.detail_education_time_num_txt);
        this.f8233i = (TextView) this.f8225T.findViewById(C2656R.C2657id.detail_education_time_txt);
        this.f8234j = (ScalableLayout) this.f8225T.findViewById(C2656R.C2657id.detail_education_manikin_comp_normal_sc);
        this.f8235k[0] = (ImageView) this.f8225T.findViewById(C2656R.C2657id.detail_education_manikin_comp_normal_head);
        this.f8235k[1] = (ImageView) this.f8225T.findViewById(C2656R.C2657id.detail_education_manikin_comp_normal_left_arm);
        this.f8235k[2] = (ImageView) this.f8225T.findViewById(C2656R.C2657id.detail_education_manikin_comp_normal_stomach);
        this.f8235k[3] = (ImageView) this.f8225T.findViewById(C2656R.C2657id.detail_education_manikin_comp_normal_right_arm);
        this.f8236l = (ScalableLayout) this.f8225T.findViewById(C2656R.C2657id.detail_education_manikin_comp_hot_sc);
        this.f8237m = (TextView) this.f8225T.findViewById(C2656R.C2657id.detail_education_manikin_comp_hot_title);
        this.f8238n = (TextView) this.f8225T.findViewById(C2656R.C2657id.detail_education_manikin_comp_hot_txt);
        this.f8239o = (ScalableLayout) this.f8225T.findViewById(C2656R.C2657id.detail_education_manikin_breath_sc);
        this.f8240p = (ScalableLayout) this.f8225T.findViewById(C2656R.C2657id.detail_education_manikin_breath_gauge_sc);
        this.f8241q = (TextView) this.f8225T.findViewById(C2656R.C2657id.detail_education_feedback_txt);
        this.f8242r = (TextView) this.f8225T.findViewById(C2656R.C2657id.detail_education_recoil_feedback_txt);
        this.f8243s = (TextView) this.f8225T.findViewById(C2656R.C2657id.detail_education_count_title);
        this.f8244t = (TextView) this.f8225T.findViewById(C2656R.C2657id.detail_education_count_txt);
        this.f8245u = (TextView) this.f8225T.findViewById(C2656R.C2657id.detail_education_compression_txt);
        this.f8246v = (TextView) this.f8225T.findViewById(C2656R.C2657id.detail_education_compression_depth_txt);
        this.f8247w = (TextView) this.f8225T.findViewById(C2656R.C2657id.detail_education_compression_rate_txt);
        this.f8212G = new ImageView(getActivity());
        this.f8213H = new ImageView(getActivity());
        this.f8214I = new ImageView(getActivity());
        this.f8215J = new ImageView(getActivity());
        this.f8216K = new ImageView(getActivity());
        this.f8217L = new ImageView(getActivity());
        this.f8212G.setBackgroundColor(-12964);
        this.f8213H.setBackgroundColor(-13520490);
        this.f8214I.setBackgroundColor(-764642);
        this.f8215J.setBackgroundColor(-1);
        this.f8216K.setBackgroundColor(-1118482);
        this.f8217L.setBackgroundColor(-1);
        this.f8227c.mo10058a((View) this.f8212G, 700.0f, 600.0f, (float) (C2556x.f9788e * 8), 100.0f);
        this.f8227c.mo10058a((View) this.f8213H, (float) ((C2556x.f9788e * 8) + 700), 600.0f, (float) ((C2556x.f9789f - C2556x.f9788e) * 8), 100.0f);
        this.f8227c.mo10058a((View) this.f8214I, (float) ((C2556x.f9789f * 8) + 700), 600.0f, (float) ((100 - C2556x.f9789f) * 8), 100.0f);
        this.f8227c.mo10058a((View) this.f8215J, 700.0f, 610.0f, 801.0f, 5.0f);
        this.f8227c.mo10058a((View) this.f8216K, 700.0f, 615.0f, 801.0f, 85.0f);
        this.f8227c.mo10058a((View) this.f8217L, 1500.0f, 600.0f, 2.0f, 100.0f);
        this.f8248x = (ImageView) this.f8225T.findViewById(C2656R.C2657id.detail_education_compression_rate_slow);
        this.f8249y = (ImageView) this.f8225T.findViewById(C2656R.C2657id.detail_education_compression_rate_good);
        this.f8250z = (ImageView) this.f8225T.findViewById(C2656R.C2657id.detail_education_compression_rate_fast);
        this.f8206A = (TextView) this.f8225T.findViewById(C2656R.C2657id.detail_education_breath_txt);
        this.f8207B = (TextView) this.f8225T.findViewById(C2656R.C2657id.detail_education_breath_volume_txt);
        this.f8208C = (TextView) this.f8225T.findViewById(C2656R.C2657id.detail_education_breath_rate_txt);
        this.f8218M = new ImageView(getActivity());
        this.f8219N = new ImageView(getActivity());
        this.f8220O = new ImageView(getActivity());
        this.f8221P = new ImageView(getActivity());
        this.f8222Q = new ImageView(getActivity());
        this.f8223R = new ImageView(getActivity());
        this.f8218M.setBackgroundColor(-4269339);
        this.f8219N.setBackgroundColor(-13719584);
        this.f8220O.setBackgroundColor(-14868344);
        this.f8221P.setBackgroundColor(-1);
        this.f8222Q.setBackgroundColor(-1118482);
        this.f8223R.setBackgroundColor(-1);
        this.f8227c.mo10058a((View) this.f8218M, 700.0f, 900.0f, 280.0f, 100.0f);
        this.f8227c.mo10058a((View) this.f8219N, 980.0f, 900.0f, 280.0f, 100.0f);
        this.f8227c.mo10058a((View) this.f8220O, 1260.0f, 900.0f, 240.0f, 100.0f);
        this.f8227c.mo10058a((View) this.f8221P, 700.0f, 910.0f, 801.0f, 5.0f);
        this.f8227c.mo10058a((View) this.f8222Q, 700.0f, 915.0f, 801.0f, 85.0f);
        this.f8227c.mo10058a((View) this.f8223R, 1500.0f, 900.0f, 2.0f, 100.0f);
        this.f8224S = new ImageView(getActivity());
        this.f8224S.setBackgroundColor(-13719584);
        this.f8240p.mo10058a((View) this.f8224S, 0.0f, 0.0f, 0.0f, 240.0f);
        this.f8209D = (ImageView) this.f8225T.findViewById(C2656R.C2657id.detail_education_breath_rate_slow);
        this.f8210E = (ImageView) this.f8225T.findViewById(C2656R.C2657id.detail_education_breath_rate_good);
        this.f8211F = (ImageView) this.f8225T.findViewById(C2656R.C2657id.detail_education_breath_rate_fast);
        this.f8231g.setText(C2557y.f9835g.f10141O);
        this.f8233i.setText(C2557y.f9835g.f10348dj);
        this.f8243s.setText(C2557y.f9835g.f10191al);
        this.f8245u.setText(C2557y.f9835g.f10147U);
        this.f8206A.setText(C2557y.f9835g.f10148V);
        this.f8237m.setText(C2557y.f9835g.f10184ae);
        return this.f8225T;
    }
}
