package com.imlabworld.HS_Instructor;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.TextView;
import com.imlabworld.p079a.C2615t;
import com.ssomai.android.scalablelayout.ScalableLayout;
import com.woxthebox.draglistview.C2656R;
import java.util.ArrayList;

/* renamed from: com.imlabworld.HS_Instructor.bm */
public class C2469bm extends Fragment implements View.OnClickListener {

    /* renamed from: b */
    private static final String f8837b = "param";

    /* renamed from: a */
    boolean f8838a = true;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C2470a f8839c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C2338ae[] f8840d;

    /* renamed from: e */
    private C2471b f8841e;

    /* renamed from: com.imlabworld.HS_Instructor.bm$a */
    public interface C2470a {
        /* renamed from: j */
        void mo8628j(int i);
    }

    /* renamed from: com.imlabworld.HS_Instructor.bm$b */
    class C2471b {

        /* renamed from: A */
        ImageView[] f8842A;

        /* renamed from: B */
        final float f8843B = 1375.0f;

        /* renamed from: C */
        final float f8844C = 0.0f;

        /* renamed from: D */
        final float f8845D = 0.0f;

        /* renamed from: E */
        final float f8846E = 25.0f;

        /* renamed from: F */
        final float f8847F = 250.0f;

        /* renamed from: G */
        final float f8848G = 280.0f;

        /* renamed from: H */
        final float f8849H = 50.0f;

        /* renamed from: I */
        final float f8850I = 150.0f;

        /* renamed from: J */
        final int f8851J = 13;

        /* renamed from: K */
        int f8852K;

        /* renamed from: L */
        int f8853L;

        /* renamed from: M */
        int f8854M;

        /* renamed from: N */
        int f8855N;

        /* renamed from: O */
        int f8856O;

        /* renamed from: P */
        boolean f8857P;

        /* renamed from: Q */
        boolean f8858Q;

        /* renamed from: R */
        int f8859R;

        /* renamed from: S */
        int f8860S;

        /* renamed from: T */
        final int f8861T = 70;

        /* renamed from: U */
        final int f8862U = 35;

        /* renamed from: a */
        final ScalableLayout f8864a;

        /* renamed from: b */
        final ImageView f8865b;

        /* renamed from: c */
        final ImageView f8866c;

        /* renamed from: d */
        final ScalableLayout f8867d;

        /* renamed from: e */
        final ImageView f8868e;

        /* renamed from: f */
        final ImageView f8869f;

        /* renamed from: g */
        final ImageView f8870g;

        /* renamed from: h */
        final ImageView f8871h;

        /* renamed from: i */
        final ImageView f8872i;

        /* renamed from: j */
        final ImageView f8873j;

        /* renamed from: k */
        final ScalableLayout f8874k;

        /* renamed from: l */
        final TextView f8875l;

        /* renamed from: m */
        final TextView f8876m;

        /* renamed from: n */
        final TextView f8877n;

        /* renamed from: o */
        final TextView f8878o;

        /* renamed from: p */
        final TextView f8879p;

        /* renamed from: q */
        final TextView f8880q;

        /* renamed from: r */
        final TextView f8881r;

        /* renamed from: s */
        final TextView f8882s;

        /* renamed from: t */
        final ImageView[] f8883t = new ImageView[5];

        /* renamed from: u */
        final TextView f8884u;

        /* renamed from: v */
        final HorizontalScrollView f8885v;

        /* renamed from: w */
        final ScalableLayout f8886w;

        /* renamed from: x */
        final TextView f8887x;

        /* renamed from: y */
        final ImageView f8888y;

        /* renamed from: z */
        ImageView f8889z;

        public C2471b(View view) {
            this.f8864a = (ScalableLayout) view.findViewById(C2656R.C2657id.test_cpr_graph_sc);
            this.f8865b = (ImageView) view.findViewById(C2656R.C2657id.test_cpr_graph_img);
            this.f8866c = (ImageView) view.findViewById(C2656R.C2657id.test_cpr_graph_btn);
            this.f8867d = (ScalableLayout) view.findViewById(C2656R.C2657id.test_cpr_graph_line_sc);
            this.f8868e = (ImageView) view.findViewById(C2656R.C2657id.test_cpr_graph_c_depth_good_range);
            this.f8869f = (ImageView) view.findViewById(C2656R.C2657id.test_cpr_graph_c_depth_good_line_start);
            this.f8870g = (ImageView) view.findViewById(C2656R.C2657id.test_cpr_graph_c_depth_good_line_end);
            this.f8871h = (ImageView) view.findViewById(C2656R.C2657id.test_cpr_graph_b_volume_good_range);
            this.f8872i = (ImageView) view.findViewById(C2656R.C2657id.test_cpr_graph_b_volume_good_line_start);
            this.f8873j = (ImageView) view.findViewById(C2656R.C2657id.test_cpr_graph_b_volume_good_line_end);
            this.f8874k = (ScalableLayout) view.findViewById(C2656R.C2657id.test_cpr_graph_txt_sc);
            this.f8875l = (TextView) view.findViewById(C2656R.C2657id.test_cpr_graph_c_depth_recoil_info);
            this.f8876m = (TextView) view.findViewById(C2656R.C2657id.test_cpr_graph_c_depth_wp_info);
            this.f8877n = (TextView) view.findViewById(C2656R.C2657id.test_cpr_graph_c_depth_recoil_title);
            this.f8878o = (TextView) view.findViewById(C2656R.C2657id.test_cpr_graph_c_depth_good_title);
            this.f8879p = (TextView) view.findViewById(C2656R.C2657id.test_cpr_graph_c_depth_strong_title);
            this.f8880q = (TextView) view.findViewById(C2656R.C2657id.test_cpr_graph_b_volume_strong_title);
            this.f8881r = (TextView) view.findViewById(C2656R.C2657id.test_cpr_graph_b_volume_good_title);
            this.f8882s = (TextView) view.findViewById(C2656R.C2657id.test_cpr_graph_b_volume_weak_title);
            this.f8883t[0] = (ImageView) view.findViewById(C2656R.C2657id.test_cpr_graph_pos_h);
            this.f8883t[1] = (ImageView) view.findViewById(C2656R.C2657id.test_cpr_graph_pos_la);
            this.f8883t[2] = (ImageView) view.findViewById(C2656R.C2657id.test_cpr_graph_pos_s);
            this.f8883t[3] = (ImageView) view.findViewById(C2656R.C2657id.test_cpr_graph_pos_ra);
            this.f8883t[4] = (ImageView) view.findViewById(C2656R.C2657id.test_cpr_graph_pos_center);
            this.f8884u = (TextView) view.findViewById(C2656R.C2657id.test_cpr_graph_pos_title);
            this.f8885v = (HorizontalScrollView) view.findViewById(C2656R.C2657id.test_cpr_graph_child_scroll);
            this.f8886w = (ScalableLayout) view.findViewById(C2656R.C2657id.test_cpr_graph_child_sc);
            this.f8887x = (TextView) view.findViewById(C2656R.C2657id.test_cpr_graph_hands_off_time_txt);
            this.f8888y = (ImageView) view.findViewById(C2656R.C2657id.test_cpr_graph_scroll_end_btn);
            this.f8866c.setOnClickListener(C2469bm.this);
            this.f8864a.setOnClickListener(C2469bm.this);
            this.f8888y.setOnClickListener(C2469bm.this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo9074a() {
            String str;
            String str2;
            C2552t b = C2465bl.f8801c.get(0).mo9310b();
            this.f8853L = 0;
            this.f8854M = 0;
            this.f8856O = 0;
            this.f8857P = false;
            this.f8858Q = true;
            String str3 = "";
            if (b.f9747c != 2) {
                this.f8860S = 58;
                switch (C2557y.f9832d.f9755k) {
                    case 1:
                    case 2:
                    case 3:
                    case 7:
                        str3 = " 5~6cm";
                        this.f8859R = 84;
                        this.f8879p.setVisibility(0);
                        break;
                    case 4:
                    case 5:
                    case 6:
                    case 8:
                        str3 = " 5cm~";
                        this.f8859R = 100;
                        this.f8879p.setVisibility(4);
                        break;
                    case 9:
                        str3 = " 4~6cm";
                        this.f8860S = 45;
                        this.f8859R = 84;
                        this.f8879p.setVisibility(0);
                        break;
                    case 10:
                        str3 = " 4cm~";
                        this.f8860S = 45;
                        this.f8859R = 100;
                        this.f8879p.setVisibility(4);
                        break;
                }
                str = " 400~700ml";
                str2 = str3;
            } else {
                this.f8859R = 65;
                this.f8860S = 45;
                str = " 140~350ml";
                str2 = " 4~5cm";
            }
            Log.e("LINE", this.f8859R + "");
            this.f8867d.removeView(this.f8869f);
            this.f8867d.mo10058a((View) this.f8869f, 0.0f, (((float) this.f8860S) * 2.5f) + 70.0f, 1725.0f, 2.0f);
            this.f8867d.removeView(this.f8868e);
            this.f8867d.mo10058a((View) this.f8868e, 0.0f, (((float) this.f8860S) * 2.5f) + 70.0f, 1725.0f, ((float) (this.f8859R - this.f8860S)) * 2.5f);
            this.f8867d.removeView(this.f8870g);
            this.f8867d.mo10058a((View) this.f8870g, 0.0f, 68.0f + (((float) this.f8859R) * 2.5f), 1725.0f, 2.0f);
            this.f8874k.removeView(this.f8878o);
            this.f8874k.mo10058a((View) this.f8878o, 0.0f, (((float) this.f8860S) * 2.5f) + 70.0f, 200.0f, 35.0f);
            this.f8874k.mo10059a(this.f8878o, 25.0f);
            this.f8887x.setText("");
            for (int i = 0; i < 5; i++) {
                this.f8883t[i].setAlpha(0.0f);
            }
            this.f8875l.setText(C2557y.f9835g.f10392ea);
            this.f8875l.setTextColor(-10658467);
            this.f8876m.setText(C2557y.f9835g.f10393eb);
            this.f8876m.setTextColor(-10658467);
            this.f8877n.setText(C2557y.f9835g.f10330dR);
            this.f8877n.setTextColor(-13520490);
            this.f8878o.setText(C2557y.f9835g.f10331dS + str2);
            this.f8878o.setTextColor(-13520490);
            this.f8879p.setText(C2557y.f9835g.f10332dT);
            this.f8879p.setTextColor(-764642);
            this.f8880q.setText(C2557y.f9835g.f10336dX);
            this.f8880q.setTextColor(-764642);
            this.f8881r.setText(C2557y.f9835g.f10337dY + str);
            this.f8881r.setTextColor(-13520490);
            this.f8882s.setText(C2557y.f9835g.f10338dZ);
            this.f8882s.setTextColor(-12964);
            this.f8884u.setText(C2557y.f9835g.f10314dB + "(%)");
            this.f8884u.setTextColor(-10658467);
            this.f8887x.setVisibility(4);
            this.f8888y.setVisibility(4);
            this.f8886w.removeAllViews();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo9075a(int i, int i2) {
            if (C2556x.f9805v[i].mo9978e() > 0) {
                ArrayList<C2615t> c = C2556x.f9805v[i].mo9976c();
                double a = c.get(0).mo10000a();
                float d = ((float) (((double) C2469bm.this.f8840d[i].f7846S.mo10036d()) - c.get(this.f8856O).mo10000a())) / 1000.0f;
                if (d > 1.0f) {
                    this.f8887x.setText(String.format("%.02f", new Object[]{Float.valueOf(d)}));
                    if (this.f8888y.getVisibility() == 4) {
                        this.f8887x.setVisibility(0);
                    } else {
                        this.f8887x.setVisibility(4);
                    }
                }
                if (i2 > this.f8853L) {
                    this.f8852K = this.f8853L;
                    this.f8857P = true;
                }
                this.f8853L = i2;
                if (this.f8854M < C2556x.f9805v[i].mo9978e()) {
                    if (c != null && c.size() > 0) {
                        int size = c.size();
                        this.f8889z = new ImageView(C2469bm.this.getActivity());
                        this.f8842A = new ImageView[2];
                        this.f8842A[0] = new ImageView(C2469bm.this.getActivity());
                        this.f8842A[1] = new ImageView(C2469bm.this.getActivity());
                        C2615t tVar = c.get(size - 1);
                        boolean[] zArr = new boolean[5];
                        for (int i3 = 0; i3 < 5; i3++) {
                            zArr[i3] = false;
                            this.f8883t[i3].setAlpha(0.0f);
                        }
                        int i4 = size - 1;
                        while (true) {
                            int i5 = i4;
                            if (i5 < Math.max(size - 5, 0)) {
                                break;
                            }
                            C2615t tVar2 = c.get(i5);
                            if (tVar2.mo10016h()) {
                                float f = 1.0f - (((float) ((size - 1) - i5)) * 0.2f);
                                boolean[] i6 = tVar2.mo10017i();
                                if (tVar2.mo10010d() == 0 || zArr[4]) {
                                    for (int i7 = 0; i7 < 4; i7++) {
                                        if (i6[i7] && !zArr[i7]) {
                                            this.f8883t[i7].setAlpha(f);
                                            zArr[i7] = true;
                                        }
                                    }
                                } else {
                                    this.f8883t[4].setAlpha(f);
                                    zArr[4] = true;
                                }
                            }
                            i4 = i5 - 1;
                        }
                        if (this.f8857P) {
                            this.f8887x.setText("");
                            this.f8887x.setVisibility(4);
                            this.f8857P = false;
                            Log.e("HandsOffTime11", this.f8852K + " " + C2556x.f9805v[i].mo9974b().get(this.f8852K).mo9994k());
                            mo9077a(c.get(this.f8856O), tVar, a, C2556x.f9805v[i].mo9974b().get(this.f8852K).mo9994k(), 0.0f);
                        }
                        if (tVar.mo10016h()) {
                            mo9076a(tVar, a);
                        } else {
                            mo9080b(tVar, a);
                        }
                    }
                    if (this.f8854M == 0) {
                        C2469bm.this.f8839c.mo8628j(1);
                    }
                    this.f8854M = C2556x.f9805v[i].mo9978e();
                    if (c.get(c.size() - 1).mo10016h()) {
                        this.f8856O = c.size() - 1;
                    }
                }
                double d2 = ((double) C2469bm.this.f8840d[i].f7846S.mo10036d()) - a;
                int width = this.f8886w.getWidth();
                this.f8886w.setScaleWidth(0.0f + (((float) d2) * 0.10576923f) + 50.0f);
                if (Math.abs((width - this.f8885v.getWidth()) - this.f8885v.getScrollX()) <= 50 || width - this.f8885v.getWidth() < 0) {
                    mo9081c();
                } else {
                    this.f8888y.setVisibility(0);
                }
                int i8 = (int) (d2 / 5000.0d);
                if (i8 - this.f8855N == 1) {
                    TextView textView = new TextView(C2469bm.this.getActivity());
                    textView.setText((i8 * 5) + "");
                    textView.setGravity(16);
                    this.f8886w.mo10058a((View) textView, 0.0f + (((float) (i8 * 5000)) * 0.10576923f), 430.0f, 100.0f, 50.0f);
                    this.f8886w.mo10059a(textView, 25.0f);
                }
                this.f8855N = i8;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo9076a(C2615t tVar, double d) {
            int d2 = tVar.mo10010d();
            int e = tVar.mo10012e();
            int min = Math.min(Math.max(d2, 0), 100);
            int min2 = Math.min(Math.max(e, 0), 100);
            float f = (((float) min2) * 250.0f) / 100.0f;
            float f2 = (((float) min) * 250.0f) / 100.0f;
            float a = ((float) (tVar.mo10000a() - d)) * 0.10576923f;
            if (min == 0) {
                this.f8842A[0].setImageResource(C2656R.drawable.graph_c_x);
                this.f8842A[1].setImageResource(C2656R.drawable.graph_c_x);
                this.f8886w.mo10058a((View) this.f8842A[0], 0.0f + a, 10.0f, 25.0f, 13.0f);
                this.f8886w.mo10058a((View) this.f8842A[1], 0.0f + a, 122.0f, 25.0f, 13.0f);
                return;
            }
            if (min < this.f8860S) {
                this.f8889z.setBackgroundResource(C2656R.drawable.graph_c_depth_y);
            } else if (min > this.f8859R) {
                this.f8889z.setBackgroundResource(C2656R.drawable.graph_c_depth_r);
            } else {
                this.f8889z.setBackgroundResource(C2656R.drawable.graph_c_depth_g);
            }
            if (min2 > 0) {
                this.f8842A[0].setImageResource(C2656R.drawable.graph_c_arrow_u);
                this.f8886w.mo10058a((View) this.f8842A[0], 0.0f + a, (0.0f + f) - 17.0f, 25.0f, 13.0f);
            }
            this.f8886w.mo10058a((View) this.f8889z, 0.0f + a, 0.0f + f, 25.0f, f2 - f);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo9077a(C2615t tVar, C2615t tVar2, double d, double d2, float f) {
            float a = ((float) (tVar.mo10000a() - d)) * 0.10576923f;
            float a2 = (((float) (tVar2.mo10000a() - d)) * 0.10576923f) + f;
            ImageView imageView = new ImageView(C2469bm.this.getActivity());
            imageView.setBackgroundColor(-1118225);
            this.f8886w.mo10058a((View) imageView, 0.0f + a + 25.0f, 45.0f, (a2 - a) - 25.0f, 55.0f);
            TextView textView = new TextView(C2469bm.this.getActivity());
            textView.setGravity(21);
            textView.setTextColor(-10658467);
            textView.setText(String.format("%.2f", new Object[]{Double.valueOf(d2)}));
            this.f8886w.mo10058a((View) textView, (0.0f + a2) - 150.0f, 0.0f, 120.0f, 145.0f);
            this.f8886w.mo10059a(textView, 45.0f);
        }

        /* renamed from: b */
        public void mo9078b() {
            String str;
            String str2;
            String str3 = "";
            if (C2465bl.f8801c.get(0).mo9310b().f9747c != 2) {
                this.f8860S = 58;
                switch (C2557y.f9832d.f9755k) {
                    case 1:
                    case 2:
                    case 3:
                    case 7:
                        str3 = " 5~6cm";
                        this.f8859R = 84;
                        this.f8879p.setVisibility(0);
                        break;
                    case 4:
                    case 5:
                    case 6:
                    case 8:
                        str3 = " 5cm~";
                        this.f8859R = 100;
                        this.f8879p.setVisibility(4);
                        break;
                    case 9:
                        str3 = " 4~6cm";
                        this.f8860S = 45;
                        this.f8859R = 84;
                        this.f8879p.setVisibility(0);
                        break;
                    case 10:
                        str3 = " 4cm~";
                        this.f8860S = 45;
                        this.f8859R = 100;
                        this.f8879p.setVisibility(4);
                        break;
                }
                str = str3;
                str2 = " 400~700ml";
            } else {
                str = " 4~5cm";
                str2 = " 140~350ml";
                this.f8859R = 65;
                this.f8860S = 45;
            }
            this.f8875l.setText(C2557y.f9835g.f10392ea);
            this.f8875l.setTextColor(-10658467);
            this.f8876m.setText(C2557y.f9835g.f10393eb);
            this.f8876m.setTextColor(-10658467);
            this.f8877n.setText(C2557y.f9835g.f10330dR);
            this.f8877n.setTextColor(-13520490);
            this.f8878o.setText(C2557y.f9835g.f10331dS + str);
            this.f8878o.setTextColor(-13520490);
            this.f8879p.setText(C2557y.f9835g.f10332dT);
            this.f8879p.setTextColor(-764642);
            this.f8880q.setText(C2557y.f9835g.f10336dX);
            this.f8880q.setTextColor(-764642);
            this.f8881r.setText(C2557y.f9835g.f10337dY + str2);
            this.f8881r.setTextColor(-13520490);
            this.f8882s.setText(C2557y.f9835g.f10338dZ);
            this.f8882s.setTextColor(-12964);
            this.f8884u.setText(C2557y.f9835g.f10314dB + "(%)");
            this.f8884u.setTextColor(-10658467);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo9079b(int i, int i2) {
            if (C2556x.f9805v[i].mo9978e() > 0) {
                ArrayList<C2615t> c = C2556x.f9805v[i].mo9976c();
                double a = c.get(0).mo10000a();
                this.f8887x.setVisibility(4);
                if (this.f8854M < C2556x.f9805v[i].mo9978e()) {
                    if (c != null && c.size() > 0) {
                        int size = c.size();
                        this.f8889z = new ImageView(C2469bm.this.getActivity());
                        this.f8842A = new ImageView[2];
                        this.f8842A[0] = new ImageView(C2469bm.this.getActivity());
                        this.f8842A[1] = new ImageView(C2469bm.this.getActivity());
                        C2615t tVar = c.get(size - 1);
                        boolean[] zArr = new boolean[5];
                        for (int i3 = 0; i3 < 5; i3++) {
                            zArr[i3] = false;
                            this.f8883t[i3].setAlpha(0.0f);
                        }
                        int i4 = size - 1;
                        while (true) {
                            int i5 = i4;
                            if (i5 < Math.max(size - 5, 0)) {
                                break;
                            }
                            C2615t tVar2 = c.get(i5);
                            if (tVar2.mo10016h()) {
                                float f = 1.0f - (((float) ((size - 1) - i5)) * 0.2f);
                                boolean[] i6 = tVar2.mo10017i();
                                if (tVar2.mo10010d() == 0 || zArr[4]) {
                                    for (int i7 = 0; i7 < 4; i7++) {
                                        if (i6[i7] && !zArr[i7]) {
                                            this.f8883t[i7].setAlpha(f);
                                            zArr[i7] = true;
                                        }
                                    }
                                } else {
                                    this.f8883t[4].setAlpha(f);
                                    zArr[4] = true;
                                }
                            }
                            i4 = i5 - 1;
                        }
                        double k = C2556x.f9805v[i].mo9974b().get(C2556x.f9805v[i].mo9977d() - 1).mo9994k();
                        if (k > 0.0d && this.f8857P) {
                            this.f8887x.setText("");
                            this.f8887x.setVisibility(4);
                            this.f8857P = false;
                            Log.e("HandsOffTime12", this.f8852K + " " + C2556x.f9805v[i].mo9974b().get(this.f8852K).mo9994k());
                            mo9077a(c.get(this.f8856O), tVar, a, k, 50.0f);
                        }
                        if (tVar.mo10016h()) {
                            mo9076a(tVar, a);
                        } else {
                            mo9080b(tVar, a);
                        }
                    }
                    if (this.f8854M == 0) {
                        C2469bm.this.f8839c.mo8628j(1);
                    }
                    this.f8854M = C2556x.f9805v[i].mo9978e();
                    if (c.get(c.size() - 1).mo10016h()) {
                        this.f8856O = c.size() - 1;
                    }
                } else {
                    double k2 = C2556x.f9805v[i].mo9974b().get(C2556x.f9805v[i].mo9977d() - 1).mo9994k();
                    if (k2 > 0.0d && this.f8858Q) {
                        this.f8887x.setText("");
                        this.f8887x.setVisibility(4);
                        this.f8858Q = false;
                        Log.e("HandsOffTime12", this.f8852K + " " + C2556x.f9805v[i].mo9974b().get(this.f8852K).mo9994k());
                        mo9077a(c.get(this.f8856O), c.get(c.size() - 1), a, k2, 50.0f);
                    }
                }
                double d = ((double) C2469bm.this.f8840d[i].f7846S.mo10036d()) - a;
                int width = this.f8886w.getWidth();
                this.f8886w.setScaleWidth(0.0f + (((float) d) * 0.10576923f) + 50.0f);
                if (Math.abs((width - this.f8885v.getWidth()) - this.f8885v.getScrollX()) <= 50 || width - this.f8885v.getWidth() < 0) {
                    mo9081c();
                } else {
                    this.f8888y.setVisibility(0);
                }
                int i8 = (int) (d / 5000.0d);
                if (i8 - this.f8855N == 1) {
                    TextView textView = new TextView(C2469bm.this.getActivity());
                    textView.setText((i8 * 5) + "");
                    textView.setGravity(16);
                    this.f8886w.mo10058a((View) textView, 0.0f + (((float) (i8 * 5000)) * 0.10576923f), 430.0f, 100.0f, 50.0f);
                    this.f8886w.mo10059a(textView, 25.0f);
                }
                this.f8855N = i8;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo9080b(C2615t tVar, double d) {
            int min = Math.min(Math.max(tVar.mo10014f(), 0), 100);
            float f = (((float) min) * 150.0f) / 100.0f;
            float a = 0.10576923f * ((float) (tVar.mo10000a() - d));
            if (min > 0) {
                if (min < 35) {
                    this.f8889z.setBackgroundResource(C2656R.drawable.graph_b_volume_y);
                } else if (min > 70) {
                    this.f8889z.setBackgroundResource(C2656R.drawable.graph_b_volume_r);
                } else {
                    this.f8889z.setBackgroundResource(C2656R.drawable.graph_b_volume_g);
                }
                this.f8886w.mo10058a((View) this.f8889z, a + 0.0f, 430.0f - f, 50.0f, f);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo9081c() {
            this.f8885v.scrollTo(this.f8886w.getWidth() - this.f8885v.getWidth(), 0);
            this.f8888y.setVisibility(4);
        }

        /* renamed from: d */
        public void mo9082d() {
            this.f8865b.setBackgroundResource(C2656R.drawable.btn_test_realtime_graph_opened);
        }

        /* renamed from: e */
        public void mo9083e() {
            this.f8865b.setBackgroundResource(C2656R.drawable.btn_test_realtime_graph_closed);
        }

        /* renamed from: f */
        public void mo9084f() {
            this.f8864a.setVisibility(0);
        }

        /* renamed from: g */
        public void mo9085g() {
            this.f8864a.setVisibility(4);
        }
    }

    /* renamed from: a */
    public static C2469bm m13581a(int i) {
        C2469bm bmVar = new C2469bm();
        Bundle bundle = new Bundle();
        bundle.putInt(f8837b, i);
        bmVar.setArguments(bundle);
        return bmVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9064a() {
        this.f8841e.mo9083e();
    }

    /* renamed from: a */
    public void mo9065a(int i, int i2) {
        this.f8841e.mo9075a(i, i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9066a(C2338ae[] aeVarArr) {
        this.f8840d = aeVarArr;
        this.f8841e.mo9084f();
        this.f8841e.mo9074a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo9067b() {
        this.f8841e.mo9082d();
    }

    /* renamed from: b */
    public void mo9068b(int i, int i2) {
        this.f8841e.mo9079b(i, i2);
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (activity instanceof C2470a) {
            this.f8839c = (C2470a) activity;
            return;
        }
        throw new RuntimeException(activity.toString() + " must implement OnFragmentInteractionListener");
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case C2656R.C2657id.test_cpr_graph_btn /*2131231858*/:
                this.f8839c.mo8628j(2);
                return;
            case C2656R.C2657id.test_cpr_graph_scroll_end_btn /*2131231879*/:
                this.f8841e.mo9081c();
                return;
            default:
                return;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C2656R.layout.test_graph, viewGroup, false);
        this.f8841e = new C2471b(inflate);
        return inflate;
    }

    public void onDetach() {
        super.onDetach();
        this.f8839c = null;
    }
}
