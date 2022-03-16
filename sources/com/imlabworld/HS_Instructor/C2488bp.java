package com.imlabworld.HS_Instructor;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Fragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.p036v7.widget.p046a.C1644a;
import android.util.Log;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.imlabworld.HS_Instructor.C2334ac;
import com.imlabworld.p079a.C2591b;
import com.imlabworld.p079a.C2614s;
import com.imlabworld.p079a.C2615t;
import com.p048a.p049a.C2243l;
import com.p048a.p049a.p074h.p076b.C2204e;
import com.ssomai.android.scalablelayout.ScalableLayout;
import com.woxthebox.draglistview.C2656R;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.imlabworld.HS_Instructor.bp */
public class C2488bp extends Fragment {

    /* renamed from: b */
    private static final String f9025b = "param";

    /* renamed from: a */
    boolean f9026a = true;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C2490a f9027c;

    /* renamed from: d */
    private C2491b f9028d;

    /* renamed from: e */
    private C2338ae[] f9029e;

    /* renamed from: com.imlabworld.HS_Instructor.bp$a */
    public interface C2490a {
        /* renamed from: a */
        void mo8599a(int i, C2553u uVar, C2552t tVar, boolean z);

        /* renamed from: k */
        void mo8631k(int i);
    }

    /* renamed from: com.imlabworld.HS_Instructor.bp$b */
    class C2491b implements View.OnClickListener {

        /* renamed from: a */
        final ScalableLayout f9031a;

        /* renamed from: b */
        final ImageView f9032b;

        /* renamed from: c */
        final TextView f9033c;

        /* renamed from: d */
        final TextView f9034d;

        /* renamed from: e */
        final ImageView f9035e;

        /* renamed from: f */
        final TextView f9036f;

        /* renamed from: g */
        final TextView f9037g;

        /* renamed from: h */
        final TextView f9038h;

        /* renamed from: i */
        final TextView f9039i;

        /* renamed from: j */
        final TextView f9040j;

        /* renamed from: k */
        final C2506b f9041k;

        /* renamed from: l */
        final C2495a f9042l;

        /* renamed from: m */
        final View f9043m;

        /* renamed from: n */
        final ScalableLayout f9044n;

        /* renamed from: o */
        final ImageView f9045o;

        /* renamed from: p */
        final TextView f9046p;

        /* renamed from: q */
        final Handler f9047q = new Handler() {
            public void handleMessage(Message message) {
                C2556x.f9806w[C2465bl.f8800b].f7770o = 1;
                C2527bs bsVar = C2465bl.f8801c.get(0);
                C2465bl.f8801c.remove(0);
                if (!C2465bl.f8803e) {
                    if (bsVar.mo9311c()) {
                        for (int size = C2465bl.f8801c.size() - 1; size >= 0; size--) {
                            C2527bs bsVar2 = C2465bl.f8801c.get(size);
                            if (bsVar.mo9306a().mo9715b() == bsVar2.mo9306a().mo9715b() && bsVar.mo9310b().mo9690g() == bsVar2.mo9310b().mo9690g()) {
                                C2465bl.f8801c.remove(size);
                            }
                        }
                    }
                    Iterator<Pair<C2553u, C2339af>> it = C2465bl.f8802d.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Pair next = it.next();
                        if (bsVar.mo9306a().mo9715b() == ((C2553u) next.first).mo9715b()) {
                            switch (bsVar.mo9310b().f9747c) {
                                case 1:
                                    ((C2339af) next.second).f7877a = 1;
                                    break;
                                case 2:
                                    ((C2339af) next.second).f7878b = 1;
                                    break;
                                case 3:
                                    ((C2339af) next.second).f7879c = 1;
                                    break;
                            }
                        }
                    }
                } else {
                    C2465bl.f8801c.add(new C2527bs(new C2553u("", ""), bsVar.mo9310b(), false));
                }
                if (bsVar.mo9310b().f9755k == 8 || bsVar.mo9310b().f9755k == 7) {
                    C2491b.this.mo9157a(bsVar);
                }
                C2488bp.this.f9027c.mo8599a(C2465bl.f8800b, bsVar.mo9306a(), bsVar.mo9310b(), C2465bl.f8801c.isEmpty());
            }
        };

        /* renamed from: r */
        final Handler f9048r = new Handler() {
            public void handleMessage(Message message) {
                C2556x.f9806w[C2465bl.f8800b].f7770o = 0;
                C2527bs bsVar = C2465bl.f8801c.get(0);
                C2465bl.f8801c.remove(0);
                if (!C2465bl.f8803e) {
                    if (bsVar.mo9311c()) {
                        for (int size = C2465bl.f8801c.size() - 1; size >= 0; size--) {
                            C2527bs bsVar2 = C2465bl.f8801c.get(size);
                            if (bsVar.mo9306a().mo9715b() == bsVar2.mo9306a().mo9715b() && bsVar.mo9310b().mo9690g() == bsVar2.mo9310b().mo9690g()) {
                                C2465bl.f8801c.remove(size);
                            }
                        }
                    }
                    bsVar.mo9309a(false);
                    C2465bl.f8801c.add(bsVar);
                    Iterator<Pair<C2553u, C2339af>> it = C2465bl.f8802d.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Pair next = it.next();
                        if (bsVar.mo9306a().mo9715b() == ((C2553u) next.first).mo9715b()) {
                            switch (bsVar.mo9310b().f9747c) {
                                case 1:
                                    ((C2339af) next.second).f7877a = 0;
                                    break;
                                case 2:
                                    ((C2339af) next.second).f7878b = 0;
                                    break;
                                case 3:
                                    ((C2339af) next.second).f7879c = 0;
                                    break;
                            }
                        }
                    }
                } else {
                    C2465bl.f8801c.add(new C2527bs(new C2553u("", ""), bsVar.mo9310b(), false));
                }
                if (bsVar.mo9310b().f9755k == 8 || bsVar.mo9310b().f9755k == 7) {
                    C2491b.this.mo9157a(bsVar);
                }
                C2488bp.this.f9027c.mo8599a(C2465bl.f8800b, bsVar.mo9306a(), bsVar.mo9310b(), C2465bl.f8801c.isEmpty());
            }
        };

        /* renamed from: com.imlabworld.HS_Instructor.bp$b$a */
        class C2495a {

            /* renamed from: a */
            final ScrollView f9053a;

            /* renamed from: b */
            final ScalableLayout f9054b;

            /* renamed from: c */
            final C2496a f9055c;

            /* renamed from: d */
            final C2497b f9056d;

            /* renamed from: e */
            final TextView f9057e;

            /* renamed from: f */
            final TextView f9058f;

            /* renamed from: com.imlabworld.HS_Instructor.bp$b$a$a */
            class C2496a {

                /* renamed from: A */
                TextView[] f9060A;

                /* renamed from: B */
                int f9061B;

                /* renamed from: C */
                int f9062C;

                /* renamed from: D */
                final float f9063D = 0.0f;

                /* renamed from: E */
                final float f9064E = 60.0f;

                /* renamed from: F */
                final float f9065F = 25.0f;

                /* renamed from: G */
                final float f9066G = 250.0f;

                /* renamed from: H */
                float f9067H = 5.0f;

                /* renamed from: I */
                final float f9068I = 626.0f;

                /* renamed from: J */
                final float f9069J = 13.0f;

                /* renamed from: K */
                final float f9070K = 340.0f;

                /* renamed from: L */
                final float f9071L = 50.0f;

                /* renamed from: M */
                final float f9072M = 150.0f;

                /* renamed from: N */
                final float f9073N = 761.0f;

                /* renamed from: O */
                final float f9074O = 13.0f;

                /* renamed from: P */
                final int f9075P = 1795;

                /* renamed from: Q */
                final int f9076Q = 17;

                /* renamed from: a */
                final ScalableLayout f9078a;

                /* renamed from: b */
                final ImageView f9079b;

                /* renamed from: c */
                final ImageView f9080c;

                /* renamed from: d */
                final ImageView f9081d;

                /* renamed from: e */
                final TextView f9082e;

                /* renamed from: f */
                final TextView f9083f;

                /* renamed from: g */
                final TextView f9084g;

                /* renamed from: h */
                final TextView f9085h;

                /* renamed from: i */
                final TextView f9086i;

                /* renamed from: j */
                final TextView f9087j;

                /* renamed from: k */
                final TextView f9088k;

                /* renamed from: l */
                final TextView f9089l;

                /* renamed from: m */
                final TextView f9090m;

                /* renamed from: n */
                final TextView f9091n;

                /* renamed from: o */
                final TextView f9092o;

                /* renamed from: p */
                final TextView f9093p;

                /* renamed from: q */
                final TextView f9094q;

                /* renamed from: r */
                final TextView f9095r;

                /* renamed from: s */
                final TextView f9096s;

                /* renamed from: t */
                final TextView f9097t;

                /* renamed from: u */
                final ScalableLayout f9098u;

                /* renamed from: v */
                final ScalableLayout f9099v;

                /* renamed from: w */
                final ScalableLayout f9100w;

                /* renamed from: x */
                ImageView[] f9101x;

                /* renamed from: y */
                ImageView[][] f9102y;

                /* renamed from: z */
                ImageView[] f9103z;

                public C2496a(View view) {
                    this.f9078a = (ScalableLayout) view.findViewById(C2656R.C2657id.test_result_graph_sc);
                    this.f9080c = (ImageView) view.findViewById(C2656R.C2657id.test_result_graph_c_depth_good_line_start);
                    this.f9079b = (ImageView) view.findViewById(C2656R.C2657id.test_result_graph_c_depth_good_range);
                    this.f9081d = (ImageView) view.findViewById(C2656R.C2657id.test_result_graph_c_depth_good_line_end);
                    this.f9082e = (TextView) view.findViewById(C2656R.C2657id.test_result_graph_amount_title);
                    this.f9083f = (TextView) view.findViewById(C2656R.C2657id.test_result_graph_c_depth_recoil_info);
                    this.f9084g = (TextView) view.findViewById(C2656R.C2657id.test_result_graph_c_depth_wp_info);
                    this.f9085h = (TextView) view.findViewById(C2656R.C2657id.test_result_graph_c_depth_recoil_title);
                    this.f9086i = (TextView) view.findViewById(C2656R.C2657id.test_result_graph_c_depth_good_title);
                    this.f9087j = (TextView) view.findViewById(C2656R.C2657id.test_result_graph_c_depth_strong_title);
                    this.f9088k = (TextView) view.findViewById(C2656R.C2657id.test_result_graph_b_volume_strong_title);
                    this.f9089l = (TextView) view.findViewById(C2656R.C2657id.test_result_graph_b_volume_good_title);
                    this.f9090m = (TextView) view.findViewById(C2656R.C2657id.test_result_graph_b_volume_weak_title);
                    this.f9091n = (TextView) view.findViewById(C2656R.C2657id.test_result_graph_rate_title);
                    this.f9092o = (TextView) view.findViewById(C2656R.C2657id.test_result_graph_c_rate_fast_title);
                    this.f9093p = (TextView) view.findViewById(C2656R.C2657id.test_result_graph_c_rate_good_title);
                    this.f9094q = (TextView) view.findViewById(C2656R.C2657id.test_result_graph_c_rate_slow_title);
                    this.f9095r = (TextView) view.findViewById(C2656R.C2657id.test_result_graph_b_rate_fast_title);
                    this.f9096s = (TextView) view.findViewById(C2656R.C2657id.test_result_graph_b_rate_good_title);
                    this.f9097t = (TextView) view.findViewById(C2656R.C2657id.test_result_graph_b_rate_slow_title);
                    this.f9098u = (ScalableLayout) view.findViewById(C2656R.C2657id.test_result_graph_line_sc);
                    this.f9099v = (ScalableLayout) view.findViewById(C2656R.C2657id.test_result_graph_txt_sc);
                    this.f9100w = (ScalableLayout) view.findViewById(C2656R.C2657id.test_result_graph_child_scroll_sc);
                }

                /* renamed from: a */
                public void mo9170a() {
                    String str;
                    String str2;
                    int i;
                    String str3;
                    C2552t a = C2557y.f9832d.clone();
                    if (C2465bl.f8801c != null && C2465bl.f8801c.size() > 0) {
                        a = C2465bl.f8801c.get(0).mo9310b();
                    }
                    int d = C2556x.f9805v[C2465bl.f8800b].mo9977d();
                    ArrayList<C2614s> b = C2556x.f9805v[C2465bl.f8800b].mo9974b();
                    ArrayList<C2615t> c = C2556x.f9805v[C2465bl.f8800b].mo9976c();
                    int i2 = 0;
                    int i3 = 0;
                    if (a.f9747c != 2) {
                        this.f9061B = 58;
                        switch (a.f9755k) {
                            case 1:
                            case 2:
                            case 3:
                            case 7:
                                str3 = " 5~6cm";
                                this.f9062C = 84;
                                this.f9087j.setVisibility(0);
                                break;
                            case 4:
                            case 5:
                            case 6:
                            case 8:
                                str3 = " 5cm~";
                                this.f9062C = 100;
                                this.f9087j.setVisibility(4);
                                break;
                            case 9:
                                str3 = " 4~6cm";
                                this.f9061B = 45;
                                this.f9062C = 84;
                                this.f9087j.setVisibility(0);
                                break;
                            case 10:
                                str3 = " 4cm~";
                                this.f9061B = 45;
                                this.f9062C = 100;
                                this.f9087j.setVisibility(4);
                                break;
                            default:
                                str3 = "";
                                break;
                        }
                        str = " 400~700ml";
                        str2 = str3;
                    } else {
                        this.f9062C = 65;
                        this.f9061B = 45;
                        str = " 140~350ml";
                        str2 = " 4~5cm";
                    }
                    if (c == null || b == null) {
                        this.f9100w.setScaleWidth(0.0f);
                    } else {
                        this.f9101x = new ImageView[c.size()];
                        this.f9102y = (ImageView[][]) Array.newInstance(ImageView.class, new int[]{c.size(), 2});
                        this.f9103z = new ImageView[c.size()];
                        for (int i4 = 0; i4 < c.size(); i4++) {
                            this.f9101x[i4] = new ImageView(C2488bp.this.getActivity());
                            this.f9102y[i4][0] = new ImageView(C2488bp.this.getActivity());
                            this.f9102y[i4][1] = new ImageView(C2488bp.this.getActivity());
                            this.f9103z[i4] = new ImageView(C2488bp.this.getActivity());
                        }
                        this.f9100w.removeAllViews();
                        if (c.size() > 0) {
                            double a2 = c.get(0).mo10000a();
                            int i5 = 0;
                            int i6 = 0;
                            while (i6 < d) {
                                C2614s sVar = b.get(i6);
                                int a3 = sVar.mo9979a();
                                int i7 = sVar.mo9992i();
                                if (i6 > 0) {
                                    mo9172a(c.get(i3), c.get(i2), a2, b.get(i6 - 1), 0.0f);
                                    mo9173a(c.get(i5), c.get(i2), a2, b.get(i6 - 1), i6, 0.0f);
                                    i = i2;
                                } else {
                                    i = i5;
                                }
                                int i8 = 0;
                                int i9 = i3;
                                while (true) {
                                    int i10 = i2;
                                    if (i8 < a3) {
                                        mo9171a(c.get(i10), i10, a2);
                                        i2 = i10 + 1;
                                        i8++;
                                        i9 = i10;
                                    } else {
                                        int i11 = 0;
                                        int i12 = i10;
                                        while (true) {
                                            int i13 = i11;
                                            if (i13 < i7) {
                                                mo9175b(c.get(i12), i12, a2);
                                                i12++;
                                                i11 = i13 + 1;
                                            } else {
                                                i6++;
                                                i5 = i;
                                                i3 = i9;
                                                i2 = i12;
                                            }
                                        }
                                    }
                                }
                            }
                            double k = b.get(d - 1).mo9994k();
                            C2615t tVar = c.get(i2 - 1);
                            if (k > 0.0d) {
                                mo9172a(c.get(i3), tVar, a2, b.get(d - 1), 50.0f);
                                mo9173a(c.get(i5), tVar, a2, b.get(d - 1), d, 50.0f);
                            }
                            int a4 = (int) ((tVar.mo10000a() - a2) / 5000.0d);
                            this.f9060A = new TextView[(a4 + 1)];
                            for (int i14 = 0; i14 <= a4; i14++) {
                                this.f9060A[i14] = new TextView(C2488bp.this.getActivity());
                                this.f9060A[i14].setText((i14 * 5) + "");
                                this.f9060A[i14].setGravity(16);
                                this.f9100w.mo10058a((View) this.f9060A[i14], (((float) (i14 * 5000)) * 0.105588235f) + 0.0f, 855.0f, 100.0f, 50.0f);
                                this.f9100w.mo10059a(this.f9060A[i14], 25.0f);
                            }
                            this.f9100w.setScaleWidth(0.0f + (((float) (tVar.mo10000a() - a2)) * 0.105588235f) + 50.0f);
                        } else {
                            this.f9100w.setScaleWidth(0.0f);
                        }
                    }
                    this.f9098u.removeView(this.f9080c);
                    this.f9098u.removeView(this.f9079b);
                    this.f9098u.removeView(this.f9081d);
                    this.f9098u.mo10058a((View) this.f9080c, 0.0f, 60.0f + (((float) this.f9061B) * 2.5f), 2095.0f, 1.0f);
                    this.f9098u.mo10058a((View) this.f9079b, 0.0f, 60.0f + (((float) this.f9061B) * 2.5f), 2095.0f, ((float) (this.f9062C - this.f9061B)) * 2.5f);
                    this.f9098u.mo10058a((View) this.f9081d, 0.0f, 60.0f + (((float) this.f9062C) * 2.5f), 2095.0f, 1.0f);
                    this.f9099v.removeView(this.f9086i);
                    this.f9099v.mo10058a((View) this.f9086i, 0.0f, 60.0f + (((float) this.f9061B) * 2.5f), 300.0f, 35.0f);
                    this.f9099v.mo10059a(this.f9086i, 25.0f);
                    this.f9082e.setText(C2557y.f9835g.f10323dK);
                    this.f9082e.setTextColor(-10658467);
                    this.f9083f.setText(C2557y.f9835g.f10392ea);
                    this.f9083f.setTextColor(-13520490);
                    this.f9084g.setText(C2557y.f9835g.f10393eb);
                    this.f9084g.setTextColor(-10658467);
                    this.f9085h.setText(C2557y.f9835g.f10330dR);
                    this.f9085h.setTextColor(-13520490);
                    this.f9086i.setText(C2557y.f9835g.f10331dS + str2);
                    this.f9086i.setTextColor(-13520490);
                    this.f9087j.setText(C2557y.f9835g.f10332dT);
                    this.f9087j.setTextColor(-764642);
                    this.f9088k.setText(C2557y.f9835g.f10336dX);
                    this.f9088k.setTextColor(-764642);
                    this.f9089l.setText(C2557y.f9835g.f10337dY + str);
                    this.f9089l.setTextColor(-13520490);
                    this.f9090m.setText(C2557y.f9835g.f10338dZ);
                    this.f9090m.setTextColor(-12964);
                    this.f9091n.setText(C2557y.f9835g.f10324dL);
                    this.f9091n.setTextColor(-10658467);
                    this.f9092o.setText(C2557y.f9835g.f10333dU);
                    this.f9092o.setTextColor(-764642);
                    this.f9093p.setText(C2557y.f9835g.f10334dV + " 100~120/" + C2557y.f9835g.f10349dk);
                    this.f9093p.setTextColor(-13520490);
                    this.f9094q.setText(C2557y.f9835g.f10335dW);
                    this.f9094q.setTextColor(-12964);
                    this.f9095r.setText(C2557y.f9835g.f10333dU);
                    this.f9095r.setTextColor(-764642);
                    this.f9096s.setText(C2557y.f9835g.f10334dV + " 4~12/" + C2557y.f9835g.f10349dk);
                    this.f9096s.setTextColor(-13520490);
                    this.f9097t.setText(C2557y.f9835g.f10335dW);
                    this.f9097t.setTextColor(-12964);
                }

                /* access modifiers changed from: package-private */
                /* renamed from: a */
                public void mo9171a(C2615t tVar, int i, double d) {
                    boolean z;
                    int d2 = tVar.mo10010d();
                    int e = tVar.mo10012e();
                    double g = 60.0d / tVar.mo10015g();
                    int min = Math.min(Math.max(d2, 0), 100);
                    int min2 = Math.min(Math.max(e, 0), 100);
                    float f = (((float) min2) * 250.0f) / 100.0f;
                    float f2 = (((float) min) * 250.0f) / 100.0f;
                    float a = ((float) (tVar.mo10000a() - d)) * 0.105588235f;
                    if (min == 0) {
                        this.f9102y[i][0].setImageResource(C2656R.drawable.graph_c_x);
                        this.f9102y[i][1].setImageResource(C2656R.drawable.graph_c_x);
                        this.f9100w.mo10058a((View) this.f9102y[i][0], 0.0f + a, 70.0f, 25.0f, 13.0f);
                        this.f9100w.mo10058a((View) this.f9102y[i][1], 0.0f + a, 182.0f, 25.0f, 13.0f);
                        this.f9103z[i].setImageResource(C2656R.drawable.graph_c_x);
                        z = false;
                    } else {
                        if (min < this.f9061B) {
                            this.f9101x[i].setBackgroundResource(C2656R.drawable.graph_c_depth_y);
                        } else if (min > this.f9062C) {
                            this.f9101x[i].setBackgroundResource(C2656R.drawable.graph_c_depth_r);
                        } else {
                            this.f9101x[i].setBackgroundResource(C2656R.drawable.graph_c_depth_g);
                        }
                        if (min2 > 0) {
                            this.f9102y[i][0].setImageResource(C2656R.drawable.graph_c_arrow_u);
                            this.f9100w.mo10058a((View) this.f9102y[i][0], 0.0f + a, (60.0f + f) - 17.0f, 25.0f, 13.0f);
                        }
                        this.f9100w.mo10058a((View) this.f9101x[i], 0.0f + a, 60.0f + f, 25.0f, f2 - f);
                        z = true;
                    }
                    if (g < 0.5d) {
                        if (z) {
                            this.f9103z[i].setImageResource(C2656R.drawable.graph_c_rate_r);
                        }
                        this.f9100w.mo10058a((View) this.f9103z[i], 0.0f + a, 626.0f, 25.0f, 13.0f);
                    } else if (g > 0.6d) {
                        if (z) {
                            this.f9103z[i].setImageResource(C2656R.drawable.graph_c_rate_y);
                        }
                        this.f9100w.mo10058a((View) this.f9103z[i], 0.0f + a, 696.0f, 25.0f, 13.0f);
                    } else {
                        if (z) {
                            this.f9103z[i].setImageResource(C2656R.drawable.graph_c_rate_g);
                        }
                        this.f9100w.mo10058a((View) this.f9103z[i], 0.0f + a, 661.0f, 25.0f, 13.0f);
                    }
                }

                /* access modifiers changed from: package-private */
                /* renamed from: a */
                public void mo9172a(C2615t tVar, C2615t tVar2, double d, C2614s sVar, float f) {
                    float a = ((float) (tVar.mo10000a() - d)) * 0.105588235f;
                    float a2 = (((float) (tVar2.mo10000a() - d)) * 0.105588235f) + f;
                    ImageView imageView = new ImageView(C2488bp.this.getActivity());
                    imageView.setBackgroundColor(-1118225);
                    this.f9100w.mo10058a((View) imageView, 0.0f + a + 25.0f, 105.0f, (a2 - a) - 25.0f, 55.0f);
                    TextView textView = new TextView(C2488bp.this.getActivity());
                    textView.setGravity(16);
                    textView.setTextColor(-10658467);
                    textView.setText(String.format("%.2f", new Object[]{Double.valueOf(sVar.mo9984b())}));
                    this.f9100w.mo10058a((View) textView, 0.0f + a + 25.0f, 260.0f, 120.0f, 50.0f);
                    this.f9100w.mo10059a(textView, 30.0f);
                    TextView textView2 = new TextView(C2488bp.this.getActivity());
                    textView2.setGravity(21);
                    textView2.setTextColor(-10658467);
                    textView2.setText(String.format("%.2f", new Object[]{Double.valueOf(sVar.mo9994k())}));
                    this.f9100w.mo10058a((View) textView2, (0.0f + a2) - 150.0f, 60.0f, 120.0f, 145.0f);
                    this.f9100w.mo10059a(textView2, 45.0f);
                }

                /* access modifiers changed from: package-private */
                /* renamed from: a */
                public void mo9173a(C2615t tVar, C2615t tVar2, double d, C2614s sVar, int i, float f) {
                    float a = ((float) (tVar.mo10000a() - d)) * 0.105588235f;
                    float a2 = (((float) (tVar2.mo10000a() - d)) * 0.105588235f) + f;
                    ImageView imageView = new ImageView(C2488bp.this.getActivity());
                    imageView.setBackgroundResource(C2656R.drawable.img_test_result_line_v);
                    this.f9100w.mo10058a((View) imageView, (0.0f + a2) - 2.0f, 60.0f, 4.0f, 1227.0f);
                    if (sVar.mo9984b() + sVar.mo9994k() > 7.0d) {
                        TextView textView = new TextView(C2488bp.this.getActivity());
                        textView.setGravity(17);
                        textView.setTextColor(-10658467);
                        textView.setText(String.format("%s%d", new Object[]{C2557y.f9835g.f10141O, Integer.valueOf(i)}));
                        this.f9100w.mo10058a((View) textView, 0.0f + a, 915.0f, a2 - a, 70.0f);
                        this.f9100w.mo10059a(textView, 55.0f);
                        TextView textView2 = new TextView(C2488bp.this.getActivity());
                        textView2.setGravity(1);
                        textView2.setTextColor(-10658467);
                        textView2.setText(String.format("[%s]\n%d/%d, %.1fcm, %d/%s", new Object[]{C2557y.f9835g.f10147U, Integer.valueOf(sVar.mo9986c()), Integer.valueOf(sVar.mo9979a()), Double.valueOf(sVar.mo9995l() / 10.0d), Integer.valueOf((int) sVar.mo9996m()), C2557y.f9835g.f10349dk}));
                        this.f9100w.mo10058a((View) textView2, 0.0f + a, 985.0f, a2 - a, 100.0f);
                        this.f9100w.mo10059a(textView2, 40.0f);
                        TextView textView3 = new TextView(C2488bp.this.getActivity());
                        textView3.setGravity(1);
                        textView3.setTextColor(-10658467);
                        textView3.setText(String.format("[%s]\n%d/%d, %dml", new Object[]{C2557y.f9835g.f10148V, Integer.valueOf(sVar.mo9993j()), Integer.valueOf(sVar.mo9992i()), Integer.valueOf((int) sVar.mo9997n())}));
                        this.f9100w.mo10058a((View) textView3, 0.0f + a, 1092.5f, a2 - a, 100.0f);
                        this.f9100w.mo10059a(textView3, 40.0f);
                        TextView textView4 = new TextView(C2488bp.this.getActivity());
                        textView4.setGravity(1);
                        textView4.setTextColor(-10658467);
                        textView4.setText(String.format("[%s]\n%.1f%s", new Object[]{C2557y.f9835g.f10184ae, Double.valueOf(sVar.mo9994k()), C2557y.f9835g.f10348dj}));
                        this.f9100w.mo10058a((View) textView4, 0.0f + a, 1200.0f, a2 - a, 100.0f);
                        this.f9100w.mo10059a(textView4, 40.0f);
                        int[] iArr = new int[5];
                        ImageView imageView2 = new ImageView(C2488bp.this.getActivity());
                        ImageView[] imageViewArr = new ImageView[5];
                        TextView[] textViewArr = new TextView[5];
                        this.f9100w.mo10058a((View) imageView2, 0.0f + a + (((a2 - a) - 413.0f) / 2.0f), 1300.0f, 413.0f, 210.0f);
                        for (int i2 = 0; i2 < 5; i2++) {
                            imageViewArr[i2] = new ImageView(C2488bp.this.getActivity());
                            this.f9100w.mo10058a((View) imageViewArr[i2], 0.0f + a + (((a2 - a) - 413.0f) / 2.0f), 1300.0f, 413.0f, 210.0f);
                            textViewArr[i2] = new TextView(C2488bp.this.getActivity());
                            textViewArr[i2].setGravity(17);
                            textViewArr[i2].setTextColor(-10658467);
                        }
                        imageView2.setImageResource(C2656R.drawable.img_result_manikin_d);
                        imageViewArr[0].setImageResource(C2656R.drawable.img_result_manikin_h);
                        imageViewArr[1].setImageResource(C2656R.drawable.img_result_manikin_la);
                        imageViewArr[2].setImageResource(C2656R.drawable.img_result_manikin_s);
                        imageViewArr[3].setImageResource(C2656R.drawable.img_result_manikin_ra);
                        imageViewArr[4].setImageResource(C2656R.drawable.img_result_manikin_c);
                        this.f9100w.mo10058a((View) textViewArr[0], 0.0f + a + (((a2 - a) - 413.0f) / 2.0f) + 140.0f, 1375.0f, 80.0f, 60.0f);
                        this.f9100w.mo10058a((View) textViewArr[1], 0.0f + a + (((a2 - a) - 413.0f) / 2.0f) + 220.0f, 1315.0f, 80.0f, 60.0f);
                        this.f9100w.mo10058a((View) textViewArr[2], 0.0f + a + (((a2 - a) - 413.0f) / 2.0f) + 300.0f, 1375.0f, 80.0f, 60.0f);
                        this.f9100w.mo10058a((View) textViewArr[3], 0.0f + a + (((a2 - a) - 413.0f) / 2.0f) + 220.0f, 1435.0f, 80.0f, 60.0f);
                        this.f9100w.mo10058a((View) textViewArr[4], 0.0f + a + (((a2 - a) - 413.0f) / 2.0f) + 220.0f, 1375.0f, 80.0f, 60.0f);
                        if (sVar.mo9979a() != 0) {
                            iArr[0] = (sVar.mo9987d()[0] * 100) / sVar.mo9979a();
                            iArr[1] = (sVar.mo9987d()[1] * 100) / sVar.mo9979a();
                            iArr[2] = (sVar.mo9987d()[2] * 100) / sVar.mo9979a();
                            iArr[3] = (sVar.mo9987d()[3] * 100) / sVar.mo9979a();
                            iArr[4] = (sVar.mo9991h() * 100) / sVar.mo9979a();
                            int i3 = 0;
                            while (true) {
                                int i4 = i3;
                                if (i4 < 5) {
                                    float min = Math.min((((float) iArr[i4]) / 100.0f) + 0.2f, 1.0f);
                                    if (iArr[i4] == 0) {
                                        min = 0.0f;
                                    }
                                    imageViewArr[i4].setAlpha(min);
                                    textViewArr[i4].setText(iArr[i4] + "%");
                                    this.f9100w.mo10059a(textViewArr[i4], 30.0f);
                                    i3 = i4 + 1;
                                } else {
                                    return;
                                }
                            }
                        } else {
                            for (int i5 = 0; i5 < 5; i5++) {
                                iArr[i5] = 0;
                                imageViewArr[i5].setAlpha(0.0f);
                                textViewArr[i5].setText(iArr[i5] + "%");
                                this.f9100w.mo10059a(textViewArr[i5], 30.0f);
                            }
                        }
                    }
                }

                /* renamed from: b */
                public void mo9174b() {
                    this.f9078a.setVisibility(0);
                }

                /* access modifiers changed from: package-private */
                /* renamed from: b */
                public void mo9175b(C2615t tVar, int i, double d) {
                    int f = tVar.mo10014f();
                    double g = 60.0d / tVar.mo10015g();
                    int min = Math.min(Math.max(f, 0), 100);
                    float f2 = (((float) min) * 150.0f) / 100.0f;
                    float a = ((float) (tVar.mo10000a() - d)) * 0.105588235f;
                    if (min > 0) {
                        if (min < 35) {
                            this.f9101x[i].setBackgroundResource(C2656R.drawable.graph_b_volume_y);
                        } else if (min > 70) {
                            this.f9101x[i].setBackgroundResource(C2656R.drawable.graph_b_volume_r);
                        } else {
                            this.f9101x[i].setBackgroundResource(C2656R.drawable.graph_b_volume_g);
                        }
                        this.f9100w.mo10058a((View) this.f9101x[i], 0.0f + a, 490.0f - f2, 50.0f, f2);
                    }
                    if (g < 5.0d) {
                        this.f9103z[i].setImageResource(C2656R.drawable.graph_b_rate_r);
                        this.f9100w.mo10058a((View) this.f9103z[i], 0.0f + a, 761.0f, 50.0f, 13.0f);
                    } else if (g > 15.0d) {
                        this.f9103z[i].setImageResource(C2656R.drawable.graph_b_rate_y);
                        this.f9100w.mo10058a((View) this.f9103z[i], 0.0f + a, 831.0f, 50.0f, 13.0f);
                    } else {
                        this.f9103z[i].setImageResource(C2656R.drawable.graph_b_rate_g);
                        this.f9100w.mo10058a((View) this.f9103z[i], 0.0f + a, 796.0f, 50.0f, 13.0f);
                    }
                }

                /* renamed from: c */
                public void mo9176c() {
                    this.f9078a.setVisibility(4);
                }
            }

            /* renamed from: com.imlabworld.HS_Instructor.bp$b$a$b */
            class C2497b {

                /* renamed from: a */
                final C2498a f9104a;

                /* renamed from: b */
                final C2500b f9105b;

                /* renamed from: c */
                final C2502c f9106c;

                /* renamed from: d */
                final C2504d f9107d;

                /* renamed from: e */
                int f9108e;

                /* renamed from: com.imlabworld.HS_Instructor.bp$b$a$b$a */
                class C2498a implements View.OnClickListener {

                    /* renamed from: a */
                    final ScalableLayout f9110a;

                    /* renamed from: b */
                    final ScalableLayout[] f9111b = new ScalableLayout[5];

                    /* renamed from: c */
                    final TextView[] f9112c = new TextView[4];

                    /* renamed from: d */
                    final ScalableLayout[][] f9113d = ((ScalableLayout[][]) Array.newInstance(ScalableLayout.class, new int[]{4, 5}));

                    /* renamed from: e */
                    final TextView[][] f9114e = ((TextView[][]) Array.newInstance(TextView.class, new int[]{4, 5}));

                    /* renamed from: f */
                    final ImageView[][] f9115f = ((ImageView[][]) Array.newInstance(ImageView.class, new int[]{4, 5}));

                    /* renamed from: g */
                    final ImageView[][] f9116g = ((ImageView[][]) Array.newInstance(ImageView.class, new int[]{4, 5}));

                    /* renamed from: h */
                    final TextView f9117h;

                    /* renamed from: i */
                    final TextView[] f9118i = new TextView[2];

                    /* renamed from: j */
                    final ImageView[] f9119j = new ImageView[2];

                    /* renamed from: k */
                    final TextView f9120k;

                    /* renamed from: l */
                    final TextView f9121l;

                    /* renamed from: m */
                    final TextView[] f9122m = new TextView[2];

                    /* renamed from: n */
                    final TextView[] f9123n = new TextView[2];

                    /* renamed from: o */
                    final TextView[] f9124o = new TextView[2];

                    /* renamed from: p */
                    final TextView[] f9125p = new TextView[2];

                    /* renamed from: q */
                    final TextView[] f9126q = new TextView[2];

                    /* renamed from: r */
                    final TextView[] f9127r = new TextView[2];

                    /* renamed from: s */
                    final TextView f9128s;

                    /* renamed from: t */
                    final int[] f9129t = new int[4];

                    /* renamed from: u */
                    int f9130u;

                    public C2498a(View view) {
                        this.f9110a = (ScalableLayout) view.findViewById(C2656R.C2657id.test_result_sheet_adult_bls_sc);
                        this.f9111b[0] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_result_sheet_adult_bls_part1_sc);
                        this.f9111b[1] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_result_sheet_adult_bls_part2_sc);
                        this.f9111b[2] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_result_sheet_adult_bls_part3_sc);
                        this.f9111b[3] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_result_sheet_adult_bls_part4_sc);
                        this.f9111b[4] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_result_sheet_adult_bls_part5_sc);
                        this.f9112c[0] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_bls_g1_txt);
                        this.f9112c[1] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_bls_g2_txt);
                        this.f9112c[2] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_bls_g3_txt);
                        this.f9112c[3] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_bls_g4_txt);
                        this.f9113d[0][0] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_result_sheet_adult_bls_g1q1_sc);
                        this.f9113d[0][1] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_result_sheet_adult_bls_g1q2_sc);
                        this.f9113d[0][2] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_result_sheet_adult_bls_g1q3_sc);
                        this.f9113d[0][3] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_result_sheet_adult_bls_g1q4_sc);
                        this.f9113d[0][4] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_result_sheet_adult_bls_g1q5_sc);
                        this.f9113d[1][0] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_result_sheet_adult_bls_g2q1_sc);
                        this.f9113d[1][1] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_result_sheet_adult_bls_g2q2_sc);
                        this.f9113d[1][2] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_result_sheet_adult_bls_g2q3_sc);
                        this.f9113d[1][3] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_result_sheet_adult_bls_g2q4_sc);
                        this.f9113d[1][4] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_result_sheet_adult_bls_g2q5_sc);
                        this.f9113d[2][0] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_result_sheet_adult_bls_g3q1_sc);
                        this.f9113d[2][1] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_result_sheet_adult_bls_g3q2_sc);
                        this.f9113d[2][2] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_result_sheet_adult_bls_g3q3_sc);
                        this.f9113d[2][3] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_result_sheet_adult_bls_g3q4_sc);
                        this.f9113d[2][4] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_result_sheet_adult_bls_g3q5_sc);
                        this.f9113d[3][0] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_result_sheet_adult_bls_g4q1_sc);
                        this.f9114e[0][0] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_bls_g1q1_txt);
                        this.f9114e[0][1] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_bls_g1q2_txt);
                        this.f9114e[0][2] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_bls_g1q3_txt);
                        this.f9114e[0][3] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_bls_g1q4_txt);
                        this.f9114e[0][4] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_bls_g1q5_txt);
                        this.f9114e[1][0] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_bls_g2q1_txt);
                        this.f9114e[1][1] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_bls_g2q2_txt);
                        this.f9114e[1][2] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_bls_g2q3_txt);
                        this.f9114e[1][3] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_bls_g2q4_txt);
                        this.f9114e[1][4] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_bls_g2q5_txt);
                        this.f9114e[2][0] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_bls_g3q1_txt);
                        this.f9114e[2][1] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_bls_g3q2_txt);
                        this.f9114e[2][2] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_bls_g3q3_txt);
                        this.f9114e[2][3] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_bls_g3q4_txt);
                        this.f9114e[2][4] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_bls_g3q5_txt);
                        this.f9114e[3][0] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_bls_g4q1_txt);
                        this.f9115f[0][0] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_bls_g1q1_btn);
                        this.f9115f[0][1] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_bls_g1q2_btn);
                        this.f9115f[0][2] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_bls_g1q3_btn);
                        this.f9115f[0][3] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_bls_g1q4_btn);
                        this.f9115f[0][4] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_bls_g1q5_btn);
                        this.f9115f[1][0] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_bls_g2q1_btn);
                        this.f9115f[1][1] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_bls_g2q2_btn);
                        this.f9115f[1][2] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_bls_g2q3_btn);
                        this.f9115f[1][3] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_bls_g2q4_btn);
                        this.f9115f[1][4] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_bls_g2q5_btn);
                        this.f9115f[2][0] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_bls_g3q1_btn);
                        this.f9115f[2][1] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_bls_g3q2_btn);
                        this.f9115f[2][2] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_bls_g3q3_btn);
                        this.f9115f[2][3] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_bls_g3q4_btn);
                        this.f9115f[2][4] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_bls_g3q5_btn);
                        this.f9115f[3][0] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_bls_g4q1_btn);
                        this.f9116g[0][0] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_bls_g1q1_click_btn);
                        this.f9116g[0][1] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_bls_g1q2_click_btn);
                        this.f9116g[0][2] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_bls_g1q3_click_btn);
                        this.f9116g[0][3] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_bls_g1q4_click_btn);
                        this.f9116g[0][4] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_bls_g1q5_click_btn);
                        this.f9116g[1][0] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_bls_g2q1_click_btn);
                        this.f9116g[1][1] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_bls_g2q2_click_btn);
                        this.f9116g[1][2] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_bls_g2q3_click_btn);
                        this.f9116g[1][3] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_bls_g2q4_click_btn);
                        this.f9116g[1][4] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_bls_g2q5_click_btn);
                        this.f9116g[2][0] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_bls_g3q1_click_btn);
                        this.f9116g[2][1] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_bls_g3q2_click_btn);
                        this.f9116g[2][2] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_bls_g3q3_click_btn);
                        this.f9116g[2][3] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_bls_g3q4_click_btn);
                        this.f9116g[2][4] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_bls_g3q5_click_btn);
                        this.f9116g[3][0] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_bls_g4q1_click_btn);
                        this.f9117h = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_bls_mibi_txt);
                        this.f9118i[0] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_bls_mibi1_txt);
                        this.f9118i[1] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_bls_mibi2_txt);
                        this.f9119j[0] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_bls_mibi1_btn);
                        this.f9119j[1] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_bls_mibi2_btn);
                        this.f9120k = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_bls_g2_average_txt);
                        this.f9121l = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_bls_g2_time_txt);
                        this.f9122m[0] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_bls_g2q1_timer_value_txt);
                        this.f9122m[1] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_bls_g2q3_timer_value_txt);
                        this.f9123n[0] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_bls_g2q2_timer_value_txt);
                        this.f9123n[1] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_bls_g2q4_timer_value_txt);
                        this.f9124o[0] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_bls_g2q1_average_depth_txt);
                        this.f9124o[1] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_bls_g2q3_average_depth_txt);
                        this.f9125p[0] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_bls_g2q1_average_rate_txt);
                        this.f9125p[1] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_bls_g2q3_average_rate_txt);
                        this.f9126q[0] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_bls_g2q2_average_volume_txt);
                        this.f9126q[1] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_bls_g2q4_average_volume_txt);
                        this.f9127r[0] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_bls_g2q2_average_rate_txt);
                        this.f9127r[1] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_bls_g2q4_average_rate_txt);
                        this.f9128s = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_bls_g1q4_timer_value_txt);
                        this.f9129t[0] = 5;
                        this.f9129t[1] = 5;
                        this.f9129t[2] = 5;
                        this.f9129t[3] = 1;
                        for (int i = 0; i < this.f9129t.length; i++) {
                            for (int i2 = 0; i2 < this.f9129t[i]; i2++) {
                                this.f9116g[i][i2].setOnClickListener(this);
                            }
                        }
                        this.f9119j[0].setOnClickListener(this);
                        this.f9119j[1].setOnClickListener(this);
                    }

                    /* renamed from: a */
                    public void mo9182a() {
                        String str;
                        String str2 = "";
                        ArrayList<C2334ac.C2335a> b = C2556x.f9806w[C2465bl.f8800b].mo8688b(C2465bl.f8801c.get(0).mo9310b());
                        if (b.isEmpty()) {
                            C2491b.this.f9044n.setVisibility(0);
                            C2491b.this.f9047q.sendEmptyMessageDelayed(0, 1000);
                            return;
                        }
                        Iterator<C2334ac.C2335a> it = b.iterator();
                        while (it.hasNext()) {
                            switch (it.next()) {
                                case CHECKDANGER:
                                    str = str2 + " - " + C2557y.f9835g.f10304cs + "\n";
                                    break;
                                case CHECKRESPONSE:
                                    str = str2 + " - " + C2557y.f9835g.f10144R + "\n";
                                    break;
                                case EMERGENCY:
                                    str = str2 + " - " + C2557y.f9835g.f10145S + "\n";
                                    break;
                                case AIRWAY:
                                    str = str2 + " - " + C2557y.f9835g.f10305ct + "\n";
                                    break;
                                case CHECKBREATH:
                                    str = str2 + " - " + C2557y.f9835g.f10306cu + "\n";
                                    break;
                                case CHECKPULSE:
                                    str = str2 + " - " + C2557y.f9835g.f10146T + "\n";
                                    break;
                                case COMP1:
                                    str = str2 + " - " + C2557y.f9835g.f10141O + "1 " + C2557y.f9835g.f10147U + "\n";
                                    break;
                                case COMP2:
                                    str = str2 + " - " + C2557y.f9835g.f10141O + "2 " + C2557y.f9835g.f10147U + "\n";
                                    break;
                                case COMP3:
                                    str = str2 + " - " + C2557y.f9835g.f10141O + "3 " + C2557y.f9835g.f10147U + "\n";
                                    break;
                                case BREATH1:
                                    str = str2 + " - " + C2557y.f9835g.f10141O + "1 " + C2557y.f9835g.f10148V + "\n";
                                    break;
                                case BREATH2:
                                    str = str2 + " - " + C2557y.f9835g.f10141O + "2 " + C2557y.f9835g.f10148V + "\n";
                                    break;
                                case BREATH3:
                                    str = str2 + " - " + C2557y.f9835g.f10141O + "3 " + C2557y.f9835g.f10148V + "\n";
                                    break;
                                case BREATH4:
                                    str = str2 + " - " + C2557y.f9835g.f10141O + "4 " + C2557y.f9835g.f10148V + "\n";
                                    break;
                                case HOT2:
                                    str = str2 + " - " + C2557y.f9835g.f10141O + "2 " + C2557y.f9835g.f10184ae + "\n";
                                    break;
                                case AED1_BLS:
                                    str = str2 + " - " + C2557y.f9835g.f10373eH + "\n";
                                    break;
                                case AED2_BLS:
                                    str = str2 + " - " + C2557y.f9835g.f10374eI + "\n";
                                    break;
                                case AED3_BLS:
                                    str = str2 + " - " + C2557y.f9835g.f10375eJ + "\n";
                                    break;
                                case AED4_BLS:
                                    str = str2 + " - " + C2557y.f9835g.f10376eK + "\n";
                                    break;
                                case AED5_BLS:
                                    str = str2 + " - " + C2557y.f9835g.f10377eL + "\n";
                                    break;
                                case AED1_LAY:
                                    str = str2 + " - " + C2557y.f9835g.f10453fi + "\n";
                                    break;
                                case AED2_LAY:
                                    str = str2 + " - " + C2557y.f9835g.f10455fk + "\n";
                                    break;
                                case AED3_LAY:
                                    str = str2 + " - " + C2557y.f9835g.f10456fl + "\n";
                                    break;
                                case AED4_LAY:
                                    str = str2 + " - " + C2557y.f9835g.f10458fn + "\n";
                                    break;
                                case AED5_LAY:
                                    str = str2 + " - " + C2557y.f9835g.f10460fp + "\n";
                                    break;
                                case AED6_LAY:
                                    str = str2 + " - " + C2557y.f9835g.f10461fq + "\n";
                                    break;
                                case CONT_CPR_BLS:
                                    str = str2 + " - " + C2557y.f9835g.f10379eN + "\n";
                                    break;
                                case CONT_CPR_LAY:
                                    str = str2 + " - " + C2557y.f9835g.f10463fs + "\n";
                                    break;
                                default:
                                    str = str2;
                                    break;
                            }
                            str2 = str;
                        }
                        new AlertDialog.Builder(C2488bp.this.getActivity()).setTitle(C2557y.f9835g.f10530hF).setMessage(C2557y.f9835g.f10531hG + "\n\n" + str2 + "\n\n" + C2557y.f9835g.f10532hH).setNegativeButton(C2557y.f9835g.f10545hb, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialogInterface, int i) {
                                C2491b.this.f9044n.setVisibility(0);
                                C2491b.this.f9047q.sendEmptyMessageDelayed(0, 1000);
                            }
                        }).setPositiveButton(C2557y.f9835g.f10210bD, (DialogInterface.OnClickListener) null).show().setCanceledOnTouchOutside(false);
                    }

                    /* renamed from: b */
                    public void mo9183b() {
                        C2552t b = C2465bl.f8801c.get(0).mo9310b();
                        int i = 0;
                        while (true) {
                            int i2 = i;
                            if (i2 >= this.f9129t.length) {
                                break;
                            }
                            int i3 = 0;
                            while (true) {
                                int i4 = i3;
                                if (i4 >= this.f9129t[i2]) {
                                    break;
                                }
                                if (((Boolean) C2556x.f9806w[C2465bl.f8800b].f7757b[i2][i4].first).booleanValue()) {
                                    this.f9113d[i2][i4].setBackgroundResource(C2656R.drawable.bg_test_selected);
                                    this.f9115f[i2][i4].setImageResource(C2656R.drawable.img_test_check);
                                } else {
                                    this.f9113d[i2][i4].setBackgroundResource(C2656R.drawable.bg_test_unselected);
                                    this.f9115f[i2][i4].setImageResource(C2656R.drawable.img_test_uncheck);
                                }
                                i3 = i4 + 1;
                            }
                            i = i2 + 1;
                        }
                        int[] iArr = {50, 50, 50, 50, 100};
                        int[] iArr2 = {750, 1050, 900, 300, 0};
                        switch (b.f9755k) {
                            case 1:
                            case 4:
                                iArr2[0] = 750;
                                break;
                            case 2:
                            case 3:
                            case 5:
                            case 6:
                                iArr2[0] = 900;
                                break;
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                iArr2[0] = 750;
                                break;
                        }
                        this.f9111b[0].setScaleHeight((float) iArr2[0]);
                        int i5 = 0;
                        int i6 = 0;
                        while (true) {
                            int i7 = i6;
                            int i8 = i5;
                            if (i7 < iArr.length) {
                                int i9 = i8 + iArr[i7];
                                this.f9110a.mo10069b(this.f9111b[i7], 100.0f, (float) i9, 2095.0f, (float) iArr2[i7]);
                                i5 = i9 + iArr2[i7];
                                i6 = i7 + 1;
                            } else {
                                this.f9110a.mo10069b(this.f9128s, 1780.0f, 650.0f, 200.0f, 150.0f);
                                this.f9130u = i8;
                                this.f9110a.setScaleHeight((float) i8);
                                C2556x.f9806w[C2465bl.f8800b].f7756a = C2334ac.C2336b.TEST;
                                this.f9112c[0].setText(C2557y.f9835g.f10401ej);
                                this.f9112c[1].setText(C2557y.f9835g.f10149W);
                                this.f9112c[2].setText(C2557y.f9835g.f10372eG);
                                this.f9112c[3].setText(C2557y.f9835g.f10378eM);
                                this.f9128s.setVisibility(4);
                                this.f9115f[0][3].setVisibility(0);
                                switch (b.f9755k) {
                                    case 1:
                                    case 4:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                        this.f9114e[0][0].setText(C2557y.f9835g.f10403el);
                                        this.f9114e[0][1].setText(C2557y.f9835g.f10404em);
                                        this.f9114e[0][2].setText(C2557y.f9835g.f10406eo);
                                        this.f9114e[0][3].setText(C2557y.f9835g.f10407ep);
                                        this.f9128s.setVisibility(0);
                                        if (C2465bl.f8807i < C2465bl.f8806h) {
                                            this.f9128s.setText("");
                                            break;
                                        } else {
                                            this.f9128s.setText(String.format("%.1f%s", new Object[]{Float.valueOf(((float) ((int) (C2465bl.f8807i - C2465bl.f8806h))) * 0.001f), C2557y.f9835g.f10348dj}));
                                            break;
                                        }
                                    case 2:
                                    case 5:
                                        this.f9114e[0][0].setText(C2557y.f9835g.f10402ek);
                                        this.f9114e[0][1].setText(C2557y.f9835g.f10403el);
                                        this.f9114e[0][2].setText(C2557y.f9835g.f10405en);
                                        this.f9114e[0][3].setText(C2557y.f9835g.f10406eo);
                                        this.f9114e[0][4].setText(C2557y.f9835g.f10404em);
                                        break;
                                    case 3:
                                    case 6:
                                        this.f9114e[0][0].setText(C2557y.f9835g.f10402ek);
                                        this.f9114e[0][1].setText(C2557y.f9835g.f10403el);
                                        this.f9114e[0][2].setText(C2557y.f9835g.f10404em);
                                        this.f9114e[0][3].setText(C2557y.f9835g.f10405en);
                                        this.f9114e[0][4].setText(C2557y.f9835g.f10406eo);
                                        break;
                                }
                                this.f9114e[1][0].setText(C2557y.f9835g.f10141O + "1: " + C2557y.f9835g.f10415ex);
                                this.f9114e[1][1].setText(C2557y.f9835g.f10141O + "1: " + C2557y.f9835g.f10417ez);
                                this.f9114e[1][2].setText(C2557y.f9835g.f10141O + "2: " + C2557y.f9835g.f10368eC);
                                this.f9114e[1][3].setText(C2557y.f9835g.f10141O + "2: " + C2557y.f9835g.f10369eD);
                                this.f9114e[1][4].setText(C2557y.f9835g.f10141O + "2: " + C2557y.f9835g.f10370eE);
                                this.f9114e[2][0].setText(C2557y.f9835g.f10373eH);
                                this.f9114e[2][1].setText(C2557y.f9835g.f10374eI);
                                this.f9114e[2][2].setText(C2557y.f9835g.f10375eJ);
                                this.f9114e[2][3].setText(C2557y.f9835g.f10376eK);
                                this.f9114e[2][4].setText(C2557y.f9835g.f10377eL);
                                this.f9114e[3][0].setText(C2557y.f9835g.f10379eN);
                                this.f9117h.setText(C2557y.f9835g.f10533hI);
                                this.f9118i[0].setText(C2557y.f9835g.f10534hJ);
                                this.f9118i[1].setText(C2557y.f9835g.f10535hK);
                                if (C2556x.f9806w[C2465bl.f8800b].f7761f) {
                                    this.f9119j[0].setImageResource(C2656R.drawable.img_test_mibi_check);
                                } else {
                                    this.f9119j[0].setImageResource(C2656R.drawable.img_test_mibi_uncheck);
                                }
                                if (C2556x.f9806w[C2465bl.f8800b].f7762g) {
                                    this.f9119j[1].setImageResource(C2656R.drawable.img_test_mibi_check);
                                } else {
                                    this.f9119j[1].setImageResource(C2656R.drawable.img_test_mibi_uncheck);
                                }
                                this.f9120k.setText(C2557y.f9835g.f10569hz);
                                this.f9121l.setText(C2557y.f9835g.f10185af);
                                int i10 = 0;
                                while (true) {
                                    int i11 = i10;
                                    if (i11 < 2) {
                                        if (i11 < C2556x.f9805v[C2465bl.f8800b].mo9977d()) {
                                            C2614s sVar = C2556x.f9805v[C2465bl.f8800b].mo9974b().get(i11);
                                            double b2 = sVar.mo9984b();
                                            double k = sVar.mo9994k();
                                            this.f9122m[i11].setText(String.format("%.1f%s", new Object[]{Double.valueOf(b2), C2557y.f9835g.f10348dj}));
                                            this.f9124o[i11].setText(String.format("%s: %.1fcm", new Object[]{C2557y.f9835g.f10188ai, Double.valueOf(sVar.mo9995l() / 10.0d)}));
                                            this.f9125p[i11].setText(String.format("%s: %d/%s", new Object[]{C2557y.f9835g.f10189aj, Integer.valueOf((int) sVar.mo9996m()), C2557y.f9835g.f10349dk}));
                                            this.f9123n[i11].setText(String.format("%.1f%s", new Object[]{Double.valueOf(k), C2557y.f9835g.f10348dj}));
                                            this.f9126q[i11].setText(String.format("%s: %dml", new Object[]{C2557y.f9835g.f10190ak, Integer.valueOf((int) sVar.mo9997n())}));
                                            this.f9127r[i11].setText(String.format("%s: %d/%s", new Object[]{C2557y.f9835g.f10189aj, Integer.valueOf((int) sVar.mo9998o()), C2557y.f9835g.f10349dk}));
                                        } else {
                                            this.f9122m[i11].setText("");
                                            this.f9124o[i11].setText("");
                                            this.f9125p[i11].setText("");
                                            this.f9123n[i11].setText("");
                                            this.f9126q[i11].setText("");
                                            this.f9127r[i11].setText("");
                                        }
                                        i10 = i11 + 1;
                                    } else {
                                        return;
                                    }
                                }
                            }
                        }
                    }

                    /* renamed from: c */
                    public void mo9184c() {
                        this.f9110a.setVisibility(0);
                    }

                    /* renamed from: d */
                    public void mo9185d() {
                        this.f9110a.setVisibility(4);
                    }

                    /* JADX WARNING: Removed duplicated region for block: B:14:0x0046  */
                    /* JADX WARNING: Removed duplicated region for block: B:17:0x0080  */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public void onClick(android.view.View r10) {
                        /*
                            r9 = this;
                            r5 = 2131165517(0x7f07014d, float:1.7945253E38)
                            r4 = 2131165516(0x7f07014c, float:1.7945251E38)
                            r3 = -1
                            r8 = 1
                            r1 = 0
                            int r6 = r10.getId()
                            switch(r6) {
                                case 2131232129: goto L_0x0011;
                                case 2131232133: goto L_0x0011;
                                case 2131232137: goto L_0x0011;
                                case 2131232141: goto L_0x0011;
                                case 2131232146: goto L_0x0011;
                                case 2131232155: goto L_0x0011;
                                case 2131232162: goto L_0x0011;
                                case 2131232169: goto L_0x0011;
                                case 2131232176: goto L_0x0011;
                                case 2131232181: goto L_0x0011;
                                case 2131232186: goto L_0x0011;
                                case 2131232190: goto L_0x0011;
                                case 2131232194: goto L_0x0011;
                                case 2131232198: goto L_0x0011;
                                case 2131232202: goto L_0x0011;
                                case 2131232207: goto L_0x0011;
                                case 2131232210: goto L_0x00b5;
                                case 2131232212: goto L_0x00e1;
                                default: goto L_0x0010;
                            }
                        L_0x0010:
                            return
                        L_0x0011:
                            r0 = r1
                            r2 = r3
                            r4 = r3
                        L_0x0014:
                            int[] r5 = r9.f9129t
                            int r5 = r5.length
                            if (r0 >= r5) goto L_0x0030
                            r5 = r1
                        L_0x001a:
                            int[] r7 = r9.f9129t
                            r7 = r7[r0]
                            if (r5 >= r7) goto L_0x002e
                            android.widget.ImageView[][] r7 = r9.f9116g
                            r7 = r7[r0]
                            r7 = r7[r5]
                            int r7 = r7.getId()
                            if (r7 != r6) goto L_0x007a
                            r2 = r5
                            r4 = r0
                        L_0x002e:
                            if (r4 == r3) goto L_0x007d
                        L_0x0030:
                            com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                            int r3 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                            r0 = r0[r3]
                            android.util.Pair<java.lang.Boolean, java.lang.Long>[][] r0 = r0.f7757b
                            r0 = r0[r4]
                            r0 = r0[r2]
                            java.lang.Object r0 = r0.first
                            java.lang.Boolean r0 = (java.lang.Boolean) r0
                            boolean r0 = r0.booleanValue()
                            if (r0 == 0) goto L_0x0080
                            com.ssomai.android.scalablelayout.ScalableLayout[][] r0 = r9.f9113d
                            r0 = r0[r4]
                            r0 = r0[r2]
                            r3 = 2131165280(0x7f070060, float:1.7944773E38)
                            r0.setBackgroundResource(r3)
                            android.widget.ImageView[][] r0 = r9.f9115f
                            r0 = r0[r4]
                            r0 = r0[r2]
                            r3 = 2131165531(0x7f07015b, float:1.7945282E38)
                            r0.setImageResource(r3)
                            com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                            int r3 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                            r0 = r0[r3]
                            android.util.Pair<java.lang.Boolean, java.lang.Long>[][] r0 = r0.f7757b
                            r0 = r0[r4]
                            android.util.Pair r3 = new android.util.Pair
                            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                            r4 = 0
                            java.lang.Long r4 = java.lang.Long.valueOf(r4)
                            r3.<init>(r1, r4)
                            r0[r2] = r3
                            goto L_0x0010
                        L_0x007a:
                            int r5 = r5 + 1
                            goto L_0x001a
                        L_0x007d:
                            int r0 = r0 + 1
                            goto L_0x0014
                        L_0x0080:
                            com.ssomai.android.scalablelayout.ScalableLayout[][] r0 = r9.f9113d
                            r0 = r0[r4]
                            r0 = r0[r2]
                            r1 = 2131165277(0x7f07005d, float:1.7944767E38)
                            r0.setBackgroundResource(r1)
                            android.widget.ImageView[][] r0 = r9.f9115f
                            r0 = r0[r4]
                            r0 = r0[r2]
                            r1 = 2131165512(0x7f070148, float:1.7945243E38)
                            r0.setImageResource(r1)
                            com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                            int r1 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                            r0 = r0[r1]
                            android.util.Pair<java.lang.Boolean, java.lang.Long>[][] r0 = r0.f7757b
                            r0 = r0[r4]
                            android.util.Pair r1 = new android.util.Pair
                            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r8)
                            r4 = 0
                            java.lang.Long r4 = java.lang.Long.valueOf(r4)
                            r1.<init>(r3, r4)
                            r0[r2] = r1
                            goto L_0x0010
                        L_0x00b5:
                            com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                            int r2 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                            r0 = r0[r2]
                            boolean r0 = r0.f7761f
                            if (r0 == 0) goto L_0x00d0
                            com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                            int r2 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                            r0 = r0[r2]
                            r0.f7761f = r1
                            android.widget.ImageView[] r0 = r9.f9119j
                            r0 = r0[r1]
                            r0.setImageResource(r5)
                            goto L_0x0010
                        L_0x00d0:
                            com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                            int r2 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                            r0 = r0[r2]
                            r0.f7761f = r8
                            android.widget.ImageView[] r0 = r9.f9119j
                            r0 = r0[r1]
                            r0.setImageResource(r4)
                            goto L_0x0010
                        L_0x00e1:
                            com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                            int r2 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                            r0 = r0[r2]
                            boolean r0 = r0.f7762g
                            if (r0 == 0) goto L_0x00fc
                            com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                            int r2 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                            r0 = r0[r2]
                            r0.f7762g = r1
                            android.widget.ImageView[] r0 = r9.f9119j
                            r0 = r0[r8]
                            r0.setImageResource(r5)
                            goto L_0x0010
                        L_0x00fc:
                            com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                            int r1 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                            r0 = r0[r1]
                            r0.f7762g = r8
                            android.widget.ImageView[] r0 = r9.f9119j
                            r0 = r0[r8]
                            r0.setImageResource(r4)
                            goto L_0x0010
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.imlabworld.HS_Instructor.C2488bp.C2491b.C2495a.C2497b.C2498a.onClick(android.view.View):void");
                    }
                }

                /* renamed from: com.imlabworld.HS_Instructor.bp$b$a$b$b */
                class C2500b implements View.OnClickListener {

                    /* renamed from: a */
                    final ScalableLayout f9133a;

                    /* renamed from: b */
                    final ScalableLayout[] f9134b = new ScalableLayout[5];

                    /* renamed from: c */
                    final TextView[] f9135c = new TextView[4];

                    /* renamed from: d */
                    final ScalableLayout[][] f9136d = ((ScalableLayout[][]) Array.newInstance(ScalableLayout.class, new int[]{4, 6}));

                    /* renamed from: e */
                    final TextView[][] f9137e = ((TextView[][]) Array.newInstance(TextView.class, new int[]{4, 6}));

                    /* renamed from: f */
                    final ImageView[][] f9138f = ((ImageView[][]) Array.newInstance(ImageView.class, new int[]{4, 6}));

                    /* renamed from: g */
                    final ImageView[][] f9139g = ((ImageView[][]) Array.newInstance(ImageView.class, new int[]{4, 6}));

                    /* renamed from: h */
                    final TextView f9140h;

                    /* renamed from: i */
                    final TextView[] f9141i = new TextView[2];

                    /* renamed from: j */
                    final ImageView[] f9142j = new ImageView[2];

                    /* renamed from: k */
                    final TextView f9143k;

                    /* renamed from: l */
                    final TextView f9144l;

                    /* renamed from: m */
                    final TextView[] f9145m = new TextView[3];

                    /* renamed from: n */
                    final TextView[] f9146n = new TextView[3];

                    /* renamed from: o */
                    final TextView[] f9147o = new TextView[3];

                    /* renamed from: p */
                    final TextView[] f9148p = new TextView[3];

                    /* renamed from: q */
                    final TextView[] f9149q = new TextView[3];

                    /* renamed from: r */
                    final TextView[] f9150r = new TextView[3];

                    /* renamed from: s */
                    final TextView f9151s;

                    /* renamed from: t */
                    final int[] f9152t = new int[4];

                    /* renamed from: u */
                    int f9153u;

                    public C2500b(View view) {
                        this.f9133a = (ScalableLayout) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_sc);
                        this.f9134b[0] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_part1_sc);
                        this.f9134b[1] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_part2_sc);
                        this.f9134b[2] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_part3_sc);
                        this.f9134b[3] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_part4_sc);
                        this.f9134b[4] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_part5_sc);
                        this.f9135c[0] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_g1_txt);
                        this.f9135c[1] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_g2_txt);
                        this.f9135c[2] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_g3_txt);
                        this.f9135c[3] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_g4_txt);
                        this.f9136d[0][0] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_g1q1_sc);
                        this.f9136d[0][1] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_g1q2_sc);
                        this.f9136d[0][2] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_g1q3_sc);
                        this.f9136d[0][3] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_g1q4_sc);
                        this.f9136d[0][4] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_g1q5_sc);
                        this.f9136d[1][0] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_g2q1_sc);
                        this.f9136d[1][1] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_g2q2_sc);
                        this.f9136d[1][2] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_g2q3_sc);
                        this.f9136d[1][3] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_g2q4_sc);
                        this.f9136d[1][4] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_g2q5_sc);
                        this.f9136d[1][5] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_g2q6_sc);
                        this.f9136d[2][0] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_g3q1_sc);
                        this.f9136d[2][1] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_g3q2_sc);
                        this.f9136d[2][2] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_g3q3_sc);
                        this.f9136d[2][3] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_g3q4_sc);
                        this.f9136d[2][4] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_g3q5_sc);
                        this.f9136d[2][5] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_g3q6_sc);
                        this.f9136d[3][0] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_g4q1_sc);
                        this.f9137e[0][0] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_g1q1_txt);
                        this.f9137e[0][1] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_g1q2_txt);
                        this.f9137e[0][2] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_g1q3_txt);
                        this.f9137e[0][3] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_g1q4_txt);
                        this.f9137e[0][4] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_g1q5_txt);
                        this.f9137e[1][0] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_g2q1_txt);
                        this.f9137e[1][1] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_g2q2_txt);
                        this.f9137e[1][2] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_g2q3_txt);
                        this.f9137e[1][3] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_g2q4_txt);
                        this.f9137e[1][4] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_g2q5_txt);
                        this.f9137e[1][5] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_g2q6_txt);
                        this.f9137e[2][0] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_g3q1_txt);
                        this.f9137e[2][1] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_g3q2_txt);
                        this.f9137e[2][2] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_g3q3_txt);
                        this.f9137e[2][3] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_g3q4_txt);
                        this.f9137e[2][4] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_g3q5_txt);
                        this.f9137e[2][5] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_g3q6_txt);
                        this.f9137e[3][0] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_g4q1_txt);
                        this.f9138f[0][0] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_g1q1_btn);
                        this.f9138f[0][1] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_g1q2_btn);
                        this.f9138f[0][2] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_g1q3_btn);
                        this.f9138f[0][3] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_g1q4_btn);
                        this.f9138f[0][4] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_g1q5_btn);
                        this.f9138f[1][0] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_g2q1_btn);
                        this.f9138f[1][1] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_g2q2_btn);
                        this.f9138f[1][2] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_g2q3_btn);
                        this.f9138f[1][3] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_g2q4_btn);
                        this.f9138f[1][4] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_g2q5_btn);
                        this.f9138f[1][5] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_g2q6_btn);
                        this.f9138f[2][0] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_g3q1_btn);
                        this.f9138f[2][1] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_g3q2_btn);
                        this.f9138f[2][2] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_g3q3_btn);
                        this.f9138f[2][3] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_g3q4_btn);
                        this.f9138f[2][4] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_g3q5_btn);
                        this.f9138f[2][5] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_g3q6_btn);
                        this.f9138f[3][0] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_g4q1_btn);
                        this.f9139g[0][0] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_g1q1_click_btn);
                        this.f9139g[0][1] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_g1q2_click_btn);
                        this.f9139g[0][2] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_g1q3_click_btn);
                        this.f9139g[0][3] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_g1q4_click_btn);
                        this.f9139g[0][4] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_g1q5_click_btn);
                        this.f9139g[1][0] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_g2q1_click_btn);
                        this.f9139g[1][1] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_g2q2_click_btn);
                        this.f9139g[1][2] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_g2q3_click_btn);
                        this.f9139g[1][3] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_g2q4_click_btn);
                        this.f9139g[1][4] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_g2q5_click_btn);
                        this.f9139g[1][5] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_g2q6_click_btn);
                        this.f9139g[2][0] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_g3q1_click_btn);
                        this.f9139g[2][1] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_g3q2_click_btn);
                        this.f9139g[2][2] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_g3q3_click_btn);
                        this.f9139g[2][3] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_g3q4_click_btn);
                        this.f9139g[2][4] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_g3q5_click_btn);
                        this.f9139g[2][5] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_g3q6_click_btn);
                        this.f9139g[3][0] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_g4q1_click_btn);
                        this.f9140h = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_mibi_txt);
                        this.f9141i[0] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_mibi1_txt);
                        this.f9141i[1] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_mibi2_txt);
                        this.f9142j[0] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_mibi1_btn);
                        this.f9142j[1] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_mibi2_btn);
                        this.f9143k = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_g2_average_txt);
                        this.f9144l = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_g2_time_txt);
                        this.f9145m[0] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_g2q1_timer_value_txt);
                        this.f9145m[1] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_g2q3_timer_value_txt);
                        this.f9145m[2] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_g2q5_timer_value_txt);
                        this.f9146n[0] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_g2q2_timer_value_txt);
                        this.f9146n[1] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_g2q4_timer_value_txt);
                        this.f9146n[2] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_g2q6_timer_value_txt);
                        this.f9147o[0] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_g2q1_average_depth_txt);
                        this.f9147o[1] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_g2q3_average_depth_txt);
                        this.f9147o[2] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_g2q5_average_depth_txt);
                        this.f9148p[0] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_g2q1_average_rate_txt);
                        this.f9148p[1] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_g2q3_average_rate_txt);
                        this.f9148p[2] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_g2q5_average_rate_txt);
                        this.f9149q[0] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_g2q2_average_volume_txt);
                        this.f9149q[1] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_g2q4_average_volume_txt);
                        this.f9149q[2] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_g2q6_average_volume_txt);
                        this.f9150r[0] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_g2q2_average_rate_txt);
                        this.f9150r[1] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_g2q4_average_rate_txt);
                        this.f9150r[2] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_g2q6_average_rate_txt);
                        this.f9151s = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_adult_lay_g1q3_timer_value_txt);
                        this.f9152t[0] = 5;
                        this.f9152t[1] = 6;
                        this.f9152t[2] = 6;
                        this.f9152t[3] = 1;
                        for (int i = 0; i < this.f9152t.length; i++) {
                            for (int i2 = 0; i2 < this.f9152t[i]; i2++) {
                                this.f9139g[i][i2].setOnClickListener(this);
                            }
                        }
                        this.f9142j[0].setOnClickListener(this);
                        this.f9142j[1].setOnClickListener(this);
                    }

                    /* renamed from: a */
                    public void mo9188a() {
                        String str;
                        String str2 = "";
                        ArrayList<C2334ac.C2335a> b = C2556x.f9806w[C2465bl.f8800b].mo8688b(C2465bl.f8801c.get(0).mo9310b());
                        if (b.isEmpty()) {
                            C2491b.this.f9044n.setVisibility(0);
                            C2491b.this.f9047q.sendEmptyMessageDelayed(0, 1000);
                            return;
                        }
                        Iterator<C2334ac.C2335a> it = b.iterator();
                        while (it.hasNext()) {
                            switch (it.next()) {
                                case CHECKDANGER:
                                    str = str2 + " - " + C2557y.f9835g.f10304cs + "\n";
                                    break;
                                case CHECKRESPONSE:
                                    str = str2 + " - " + C2557y.f9835g.f10144R + "\n";
                                    break;
                                case EMERGENCY:
                                    str = str2 + " - " + C2557y.f9835g.f10145S + "\n";
                                    break;
                                case AIRWAY:
                                    str = str2 + " - " + C2557y.f9835g.f10305ct + "\n";
                                    break;
                                case CHECKBREATH:
                                    str = str2 + " - " + C2557y.f9835g.f10306cu + "\n";
                                    break;
                                case CHECKPULSE:
                                    str = str2 + " - " + C2557y.f9835g.f10146T + "\n";
                                    break;
                                case COMP1:
                                    str = str2 + " - " + C2557y.f9835g.f10141O + "1 " + C2557y.f9835g.f10147U + "\n";
                                    break;
                                case COMP2:
                                    str = str2 + " - " + C2557y.f9835g.f10141O + "2 " + C2557y.f9835g.f10147U + "\n";
                                    break;
                                case COMP3:
                                    str = str2 + " - " + C2557y.f9835g.f10141O + "3 " + C2557y.f9835g.f10147U + "\n";
                                    break;
                                case BREATH1:
                                    str = str2 + " - " + C2557y.f9835g.f10141O + "1 " + C2557y.f9835g.f10148V + "\n";
                                    break;
                                case BREATH2:
                                    str = str2 + " - " + C2557y.f9835g.f10141O + "2 " + C2557y.f9835g.f10148V + "\n";
                                    break;
                                case BREATH3:
                                    str = str2 + " - " + C2557y.f9835g.f10141O + "3 " + C2557y.f9835g.f10148V + "\n";
                                    break;
                                case BREATH4:
                                    str = str2 + " - " + C2557y.f9835g.f10141O + "4 " + C2557y.f9835g.f10148V + "\n";
                                    break;
                                case HOT2:
                                    str = str2 + " - " + C2557y.f9835g.f10141O + "2 " + C2557y.f9835g.f10184ae + "\n";
                                    break;
                                case AED1_BLS:
                                    str = str2 + " - " + C2557y.f9835g.f10373eH + "\n";
                                    break;
                                case AED2_BLS:
                                    str = str2 + " - " + C2557y.f9835g.f10374eI + "\n";
                                    break;
                                case AED3_BLS:
                                    str = str2 + " - " + C2557y.f9835g.f10375eJ + "\n";
                                    break;
                                case AED4_BLS:
                                    str = str2 + " - " + C2557y.f9835g.f10376eK + "\n";
                                    break;
                                case AED5_BLS:
                                    str = str2 + " - " + C2557y.f9835g.f10377eL + "\n";
                                    break;
                                case AED1_LAY:
                                    str = str2 + " - " + C2557y.f9835g.f10453fi + "\n";
                                    break;
                                case AED2_LAY:
                                    str = str2 + " - " + C2557y.f9835g.f10455fk + "\n";
                                    break;
                                case AED3_LAY:
                                    str = str2 + " - " + C2557y.f9835g.f10456fl + "\n";
                                    break;
                                case AED4_LAY:
                                    str = str2 + " - " + C2557y.f9835g.f10458fn + "\n";
                                    break;
                                case AED5_LAY:
                                    str = str2 + " - " + C2557y.f9835g.f10460fp + "\n";
                                    break;
                                case AED6_LAY:
                                    str = str2 + " - " + C2557y.f9835g.f10461fq + "\n";
                                    break;
                                case CONT_CPR_BLS:
                                    str = str2 + " - " + C2557y.f9835g.f10379eN + "\n";
                                    break;
                                case CONT_CPR_LAY:
                                    str = str2 + " - " + C2557y.f9835g.f10463fs + "\n";
                                    break;
                                default:
                                    str = str2;
                                    break;
                            }
                            str2 = str;
                        }
                        new AlertDialog.Builder(C2488bp.this.getActivity()).setTitle(C2557y.f9835g.f10530hF).setMessage(C2557y.f9835g.f10531hG + "\n\n" + str2 + "\n\n" + C2557y.f9835g.f10532hH).setNegativeButton(C2557y.f9835g.f10545hb, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialogInterface, int i) {
                                C2491b.this.f9044n.setVisibility(0);
                                C2491b.this.f9047q.sendEmptyMessageDelayed(0, 1000);
                            }
                        }).setPositiveButton(C2557y.f9835g.f10210bD, (DialogInterface.OnClickListener) null).show().setCanceledOnTouchOutside(false);
                    }

                    /* renamed from: b */
                    public void mo9189b() {
                        C2552t b = C2465bl.f8801c.get(0).mo9310b();
                        int i = 0;
                        while (true) {
                            int i2 = i;
                            if (i2 >= this.f9152t.length) {
                                break;
                            }
                            int i3 = 0;
                            while (true) {
                                int i4 = i3;
                                if (i4 >= this.f9152t[i2]) {
                                    break;
                                }
                                if (((Boolean) C2556x.f9806w[C2465bl.f8800b].f7758c[i2][i4].first).booleanValue()) {
                                    this.f9136d[i2][i4].setBackgroundResource(C2656R.drawable.bg_test_selected);
                                    this.f9138f[i2][i4].setImageResource(C2656R.drawable.img_test_check);
                                } else {
                                    this.f9136d[i2][i4].setBackgroundResource(C2656R.drawable.bg_test_unselected);
                                    this.f9138f[i2][i4].setImageResource(C2656R.drawable.img_test_uncheck);
                                }
                                i3 = i4 + 1;
                            }
                            i = i2 + 1;
                        }
                        int[] iArr = {50, 50, 50, 50, 100};
                        int[] iArr2 = {750, 1200, 1050, 300, 0};
                        switch (b.f9755k) {
                            case 1:
                            case 4:
                                iArr2[0] = 600;
                                break;
                            case 2:
                            case 3:
                            case 5:
                            case 6:
                                iArr2[0] = 900;
                                break;
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                iArr2[0] = 600;
                                break;
                        }
                        this.f9134b[0].setScaleHeight((float) iArr2[0]);
                        int i5 = 0;
                        int i6 = 0;
                        while (true) {
                            int i7 = i6;
                            int i8 = i5;
                            if (i7 < iArr.length) {
                                int i9 = i8 + iArr[i7];
                                this.f9133a.mo10069b(this.f9134b[i7], 100.0f, (float) i9, 2095.0f, (float) iArr2[i7]);
                                i5 = i9 + iArr2[i7];
                                i6 = i7 + 1;
                            } else {
                                this.f9133a.mo10069b(this.f9151s, 1780.0f, 500.0f, 200.0f, 150.0f);
                                this.f9153u = i8;
                                this.f9133a.setScaleHeight((float) i8);
                                C2556x.f9806w[C2465bl.f8800b].f7756a = C2334ac.C2336b.TEST;
                                this.f9135c[0].setText(C2557y.f9835g.f10401ej);
                                this.f9135c[1].setText(C2557y.f9835g.f10149W);
                                if (b.f9754j.equals("kr")) {
                                    this.f9135c[2].setText(C2557y.f9835g.f10452fh);
                                } else {
                                    this.f9135c[2].setText(C2557y.f9835g.f10372eG);
                                }
                                this.f9135c[3].setText(C2557y.f9835g.f10378eM);
                                this.f9151s.setVisibility(4);
                                this.f9138f[0][2].setVisibility(0);
                                switch (b.f9755k) {
                                    case 1:
                                    case 4:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                        this.f9137e[0][0].setText(C2557y.f9835g.f10383eR);
                                        this.f9137e[0][1].setText(C2557y.f9835g.f10384eS);
                                        this.f9137e[0][2].setText(C2557y.f9835g.f10386eU);
                                        this.f9151s.setVisibility(0);
                                        if (C2465bl.f8807i < C2465bl.f8806h) {
                                            this.f9151s.setText("");
                                            break;
                                        } else {
                                            this.f9151s.setText(String.format("%.1f%s", new Object[]{Float.valueOf(((float) ((int) (C2465bl.f8807i - C2465bl.f8806h))) * 0.001f), C2557y.f9835g.f10348dj}));
                                            break;
                                        }
                                    case 2:
                                    case 5:
                                        this.f9137e[0][0].setText(C2557y.f9835g.f10382eQ);
                                        this.f9137e[0][1].setText(C2557y.f9835g.f10383eR);
                                        this.f9137e[0][2].setText(C2557y.f9835g.f10385eT);
                                        this.f9137e[0][3].setText(C2557y.f9835g.f10386eU);
                                        this.f9137e[0][4].setText(C2557y.f9835g.f10384eS);
                                        break;
                                    case 3:
                                    case 6:
                                        this.f9137e[0][0].setText(C2557y.f9835g.f10382eQ);
                                        this.f9137e[0][1].setText(C2557y.f9835g.f10383eR);
                                        this.f9137e[0][2].setText(C2557y.f9835g.f10384eS);
                                        this.f9137e[0][3].setText(C2557y.f9835g.f10385eT);
                                        this.f9137e[0][4].setText(C2557y.f9835g.f10386eU);
                                        break;
                                }
                                this.f9137e[1][0].setText(C2557y.f9835g.f10141O + "1: " + C2557y.f9835g.f10387eV);
                                this.f9137e[1][1].setText(C2557y.f9835g.f10141O + "1: " + C2557y.f9835g.f10389eX);
                                this.f9137e[1][2].setText(C2557y.f9835g.f10141O + "2: " + C2557y.f9835g.f10391eZ);
                                this.f9137e[1][3].setText(C2557y.f9835g.f10141O + "2: " + C2557y.f9835g.f10446fb);
                                this.f9137e[1][4].setText(C2557y.f9835g.f10141O + "3: " + C2557y.f9835g.f10448fd);
                                this.f9137e[1][5].setText(C2557y.f9835g.f10141O + "3: " + C2557y.f9835g.f10450ff);
                                this.f9137e[2][0].setText(C2557y.f9835g.f10453fi);
                                this.f9137e[2][1].setText(C2557y.f9835g.f10455fk);
                                this.f9137e[2][2].setText(C2557y.f9835g.f10456fl);
                                this.f9137e[2][3].setText(C2557y.f9835g.f10458fn);
                                this.f9137e[2][4].setText(C2557y.f9835g.f10460fp);
                                this.f9137e[2][5].setText(C2557y.f9835g.f10461fq);
                                this.f9137e[3][0].setText(C2557y.f9835g.f10463fs);
                                this.f9140h.setText(C2557y.f9835g.f10533hI);
                                this.f9141i[0].setText(C2557y.f9835g.f10534hJ);
                                this.f9141i[1].setText(C2557y.f9835g.f10535hK);
                                if (C2556x.f9806w[C2465bl.f8800b].f7761f) {
                                    this.f9142j[0].setImageResource(C2656R.drawable.img_test_mibi_check);
                                } else {
                                    this.f9142j[0].setImageResource(C2656R.drawable.img_test_mibi_uncheck);
                                }
                                if (C2556x.f9806w[C2465bl.f8800b].f7762g) {
                                    this.f9142j[1].setImageResource(C2656R.drawable.img_test_mibi_check);
                                } else {
                                    this.f9142j[1].setImageResource(C2656R.drawable.img_test_mibi_uncheck);
                                }
                                this.f9143k.setText(C2557y.f9835g.f10569hz);
                                this.f9144l.setText(C2557y.f9835g.f10185af);
                                int i10 = 0;
                                while (true) {
                                    int i11 = i10;
                                    if (i11 < 3) {
                                        if (i11 < C2556x.f9805v[C2465bl.f8800b].mo9977d()) {
                                            C2614s sVar = C2556x.f9805v[C2465bl.f8800b].mo9974b().get(i11);
                                            double b2 = sVar.mo9984b();
                                            double k = sVar.mo9994k();
                                            this.f9145m[i11].setText(String.format("%.1f%s", new Object[]{Double.valueOf(b2), C2557y.f9835g.f10348dj}));
                                            this.f9147o[i11].setText(String.format("%s: %.1fcm", new Object[]{C2557y.f9835g.f10188ai, Double.valueOf(sVar.mo9995l() / 10.0d)}));
                                            this.f9148p[i11].setText(String.format("%s: %d/%s", new Object[]{C2557y.f9835g.f10189aj, Integer.valueOf((int) sVar.mo9996m()), C2557y.f9835g.f10349dk}));
                                            this.f9146n[i11].setText(String.format("%.1f%s", new Object[]{Double.valueOf(k), C2557y.f9835g.f10348dj}));
                                            this.f9149q[i11].setText(String.format("%s: %dml", new Object[]{C2557y.f9835g.f10190ak, Integer.valueOf((int) sVar.mo9997n())}));
                                            this.f9150r[i11].setText(String.format("%s: %d/%s", new Object[]{C2557y.f9835g.f10189aj, Integer.valueOf((int) sVar.mo9998o()), C2557y.f9835g.f10349dk}));
                                        } else {
                                            this.f9145m[i11].setText("");
                                            this.f9147o[i11].setText("");
                                            this.f9148p[i11].setText("");
                                            this.f9146n[i11].setText("");
                                            this.f9149q[i11].setText("");
                                            this.f9150r[i11].setText("");
                                        }
                                        i10 = i11 + 1;
                                    } else {
                                        return;
                                    }
                                }
                            }
                        }
                    }

                    /* renamed from: c */
                    public void mo9190c() {
                        this.f9133a.setVisibility(0);
                    }

                    /* renamed from: d */
                    public void mo9191d() {
                        this.f9133a.setVisibility(4);
                    }

                    /* JADX WARNING: Removed duplicated region for block: B:14:0x0046  */
                    /* JADX WARNING: Removed duplicated region for block: B:17:0x0080  */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public void onClick(android.view.View r10) {
                        /*
                            r9 = this;
                            r5 = 2131165517(0x7f07014d, float:1.7945253E38)
                            r4 = 2131165516(0x7f07014c, float:1.7945251E38)
                            r3 = -1
                            r8 = 1
                            r1 = 0
                            int r6 = r10.getId()
                            switch(r6) {
                                case 2131232224: goto L_0x0011;
                                case 2131232228: goto L_0x0011;
                                case 2131232232: goto L_0x0011;
                                case 2131232237: goto L_0x0011;
                                case 2131232241: goto L_0x0011;
                                case 2131232250: goto L_0x0011;
                                case 2131232257: goto L_0x0011;
                                case 2131232264: goto L_0x0011;
                                case 2131232271: goto L_0x0011;
                                case 2131232278: goto L_0x0011;
                                case 2131232285: goto L_0x0011;
                                case 2131232291: goto L_0x0011;
                                case 2131232295: goto L_0x0011;
                                case 2131232299: goto L_0x0011;
                                case 2131232303: goto L_0x0011;
                                case 2131232307: goto L_0x0011;
                                case 2131232311: goto L_0x0011;
                                case 2131232316: goto L_0x0011;
                                case 2131232319: goto L_0x00b5;
                                case 2131232321: goto L_0x00e1;
                                default: goto L_0x0010;
                            }
                        L_0x0010:
                            return
                        L_0x0011:
                            r0 = r1
                            r2 = r3
                            r4 = r3
                        L_0x0014:
                            int[] r5 = r9.f9152t
                            int r5 = r5.length
                            if (r0 >= r5) goto L_0x0030
                            r5 = r1
                        L_0x001a:
                            int[] r7 = r9.f9152t
                            r7 = r7[r0]
                            if (r5 >= r7) goto L_0x002e
                            android.widget.ImageView[][] r7 = r9.f9139g
                            r7 = r7[r0]
                            r7 = r7[r5]
                            int r7 = r7.getId()
                            if (r7 != r6) goto L_0x007a
                            r2 = r5
                            r4 = r0
                        L_0x002e:
                            if (r4 == r3) goto L_0x007d
                        L_0x0030:
                            com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                            int r3 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                            r0 = r0[r3]
                            android.util.Pair<java.lang.Boolean, java.lang.Long>[][] r0 = r0.f7758c
                            r0 = r0[r4]
                            r0 = r0[r2]
                            java.lang.Object r0 = r0.first
                            java.lang.Boolean r0 = (java.lang.Boolean) r0
                            boolean r0 = r0.booleanValue()
                            if (r0 == 0) goto L_0x0080
                            com.ssomai.android.scalablelayout.ScalableLayout[][] r0 = r9.f9136d
                            r0 = r0[r4]
                            r0 = r0[r2]
                            r3 = 2131165280(0x7f070060, float:1.7944773E38)
                            r0.setBackgroundResource(r3)
                            android.widget.ImageView[][] r0 = r9.f9138f
                            r0 = r0[r4]
                            r0 = r0[r2]
                            r3 = 2131165531(0x7f07015b, float:1.7945282E38)
                            r0.setImageResource(r3)
                            com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                            int r3 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                            r0 = r0[r3]
                            android.util.Pair<java.lang.Boolean, java.lang.Long>[][] r0 = r0.f7758c
                            r0 = r0[r4]
                            android.util.Pair r3 = new android.util.Pair
                            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                            r4 = 0
                            java.lang.Long r4 = java.lang.Long.valueOf(r4)
                            r3.<init>(r1, r4)
                            r0[r2] = r3
                            goto L_0x0010
                        L_0x007a:
                            int r5 = r5 + 1
                            goto L_0x001a
                        L_0x007d:
                            int r0 = r0 + 1
                            goto L_0x0014
                        L_0x0080:
                            com.ssomai.android.scalablelayout.ScalableLayout[][] r0 = r9.f9136d
                            r0 = r0[r4]
                            r0 = r0[r2]
                            r1 = 2131165277(0x7f07005d, float:1.7944767E38)
                            r0.setBackgroundResource(r1)
                            android.widget.ImageView[][] r0 = r9.f9138f
                            r0 = r0[r4]
                            r0 = r0[r2]
                            r1 = 2131165512(0x7f070148, float:1.7945243E38)
                            r0.setImageResource(r1)
                            com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                            int r1 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                            r0 = r0[r1]
                            android.util.Pair<java.lang.Boolean, java.lang.Long>[][] r0 = r0.f7758c
                            r0 = r0[r4]
                            android.util.Pair r1 = new android.util.Pair
                            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r8)
                            r4 = 0
                            java.lang.Long r4 = java.lang.Long.valueOf(r4)
                            r1.<init>(r3, r4)
                            r0[r2] = r1
                            goto L_0x0010
                        L_0x00b5:
                            com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                            int r2 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                            r0 = r0[r2]
                            boolean r0 = r0.f7761f
                            if (r0 == 0) goto L_0x00d0
                            com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                            int r2 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                            r0 = r0[r2]
                            r0.f7761f = r1
                            android.widget.ImageView[] r0 = r9.f9142j
                            r0 = r0[r1]
                            r0.setImageResource(r5)
                            goto L_0x0010
                        L_0x00d0:
                            com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                            int r2 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                            r0 = r0[r2]
                            r0.f7761f = r8
                            android.widget.ImageView[] r0 = r9.f9142j
                            r0 = r0[r1]
                            r0.setImageResource(r4)
                            goto L_0x0010
                        L_0x00e1:
                            com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                            int r2 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                            r0 = r0[r2]
                            boolean r0 = r0.f7762g
                            if (r0 == 0) goto L_0x00fc
                            com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                            int r2 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                            r0 = r0[r2]
                            r0.f7762g = r1
                            android.widget.ImageView[] r0 = r9.f9142j
                            r0 = r0[r8]
                            r0.setImageResource(r5)
                            goto L_0x0010
                        L_0x00fc:
                            com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                            int r1 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                            r0 = r0[r1]
                            r0.f7762g = r8
                            android.widget.ImageView[] r0 = r9.f9142j
                            r0 = r0[r8]
                            r0.setImageResource(r4)
                            goto L_0x0010
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.imlabworld.HS_Instructor.C2488bp.C2491b.C2495a.C2497b.C2500b.onClick(android.view.View):void");
                    }
                }

                /* renamed from: com.imlabworld.HS_Instructor.bp$b$a$b$c */
                class C2502c implements View.OnClickListener {

                    /* renamed from: a */
                    final ScalableLayout f9156a;

                    /* renamed from: b */
                    final ScalableLayout[] f9157b = new ScalableLayout[4];

                    /* renamed from: c */
                    final TextView[] f9158c = new TextView[3];

                    /* renamed from: d */
                    final ScalableLayout[][] f9159d = ((ScalableLayout[][]) Array.newInstance(ScalableLayout.class, new int[]{3, 5}));

                    /* renamed from: e */
                    final TextView[][] f9160e = ((TextView[][]) Array.newInstance(TextView.class, new int[]{3, 5}));

                    /* renamed from: f */
                    final ImageView[][] f9161f = ((ImageView[][]) Array.newInstance(ImageView.class, new int[]{3, 5}));

                    /* renamed from: g */
                    final ImageView[][] f9162g = ((ImageView[][]) Array.newInstance(ImageView.class, new int[]{3, 5}));

                    /* renamed from: h */
                    final TextView f9163h;

                    /* renamed from: i */
                    final TextView[] f9164i = new TextView[2];

                    /* renamed from: j */
                    final ImageView[] f9165j = new ImageView[2];

                    /* renamed from: k */
                    final TextView f9166k;

                    /* renamed from: l */
                    final TextView[] f9167l = new TextView[5];

                    /* renamed from: m */
                    final int[] f9168m = new int[3];

                    /* renamed from: n */
                    int f9169n;

                    public C2502c(View view) {
                        this.f9156a = (ScalableLayout) view.findViewById(C2656R.C2657id.test_result_sheet_infant_bls_sc);
                        this.f9157b[0] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_result_sheet_infant_bls_part1_sc);
                        this.f9157b[1] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_result_sheet_infant_bls_part2_sc);
                        this.f9157b[2] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_result_sheet_infant_bls_part3_sc);
                        this.f9157b[3] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_result_sheet_infant_bls_part4_sc);
                        this.f9158c[0] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_infant_bls_g1_txt);
                        this.f9158c[1] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_infant_bls_g2_txt);
                        this.f9158c[2] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_infant_bls_g3_txt);
                        this.f9159d[0][0] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_result_sheet_infant_bls_g1q1_sc);
                        this.f9159d[0][1] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_result_sheet_infant_bls_g1q2_sc);
                        this.f9159d[0][2] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_result_sheet_infant_bls_g1q3_sc);
                        this.f9159d[0][3] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_result_sheet_infant_bls_g1q4_sc);
                        this.f9159d[0][4] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_result_sheet_infant_bls_g1q5_sc);
                        this.f9159d[1][0] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_result_sheet_infant_bls_g2q1_sc);
                        this.f9159d[1][1] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_result_sheet_infant_bls_g2q2_sc);
                        this.f9159d[1][2] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_result_sheet_infant_bls_g2q3_sc);
                        this.f9159d[1][3] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_result_sheet_infant_bls_g2q4_sc);
                        this.f9159d[1][4] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_result_sheet_infant_bls_g2q5_sc);
                        this.f9159d[2][0] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_result_sheet_infant_bls_g3q1_sc);
                        this.f9159d[2][1] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_result_sheet_infant_bls_g3q2_sc);
                        this.f9160e[0][0] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_infant_bls_g1q1_txt);
                        this.f9160e[0][1] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_infant_bls_g1q2_txt);
                        this.f9160e[0][2] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_infant_bls_g1q3_txt);
                        this.f9160e[0][3] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_infant_bls_g1q4_txt);
                        this.f9160e[0][4] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_infant_bls_g1q5_txt);
                        this.f9160e[1][0] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_infant_bls_g2q1_txt);
                        this.f9160e[1][1] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_infant_bls_g2q2_txt);
                        this.f9160e[1][2] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_infant_bls_g2q3_txt);
                        this.f9160e[1][3] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_infant_bls_g2q4_txt);
                        this.f9160e[1][4] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_infant_bls_g2q5_txt);
                        this.f9160e[2][0] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_infant_bls_g3q1_txt);
                        this.f9160e[2][1] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_infant_bls_g3q2_txt);
                        this.f9161f[0][0] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_infant_bls_g1q1_btn);
                        this.f9161f[0][1] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_infant_bls_g1q2_btn);
                        this.f9161f[0][2] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_infant_bls_g1q3_btn);
                        this.f9161f[0][3] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_infant_bls_g1q4_btn);
                        this.f9161f[0][4] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_infant_bls_g1q5_btn);
                        this.f9161f[1][0] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_infant_bls_g2q1_btn);
                        this.f9161f[1][1] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_infant_bls_g2q2_btn);
                        this.f9161f[1][2] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_infant_bls_g2q3_btn);
                        this.f9161f[1][3] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_infant_bls_g2q4_btn);
                        this.f9161f[1][4] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_infant_bls_g2q5_btn);
                        this.f9161f[2][0] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_infant_bls_g3q1_btn);
                        this.f9161f[2][1] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_infant_bls_g3q2_btn);
                        this.f9162g[0][0] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_infant_bls_g1q1_click_btn);
                        this.f9162g[0][1] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_infant_bls_g1q2_click_btn);
                        this.f9162g[0][2] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_infant_bls_g1q3_click_btn);
                        this.f9162g[0][3] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_infant_bls_g1q4_click_btn);
                        this.f9162g[0][4] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_infant_bls_g1q5_click_btn);
                        this.f9162g[1][0] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_infant_bls_g2q1_click_btn);
                        this.f9162g[1][1] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_infant_bls_g2q2_click_btn);
                        this.f9162g[1][2] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_infant_bls_g2q3_click_btn);
                        this.f9162g[1][3] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_infant_bls_g2q4_click_btn);
                        this.f9162g[1][4] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_infant_bls_g2q5_click_btn);
                        this.f9162g[2][0] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_infant_bls_g3q1_click_btn);
                        this.f9162g[2][1] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_infant_bls_g3q2_click_btn);
                        this.f9163h = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_infant_bls_mibi_txt);
                        this.f9164i[0] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_infant_bls_mibi1_txt);
                        this.f9164i[1] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_infant_bls_mibi2_txt);
                        this.f9165j[0] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_infant_bls_mibi1_btn);
                        this.f9165j[1] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_infant_bls_mibi2_btn);
                        this.f9166k = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_infant_bls_g1q4_timer_value_txt);
                        this.f9167l[0] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_infant_bls_g2q1_timer_value_txt);
                        this.f9167l[1] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_infant_bls_g2q2_timer_value_txt);
                        this.f9167l[2] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_infant_bls_g2q3_timer_value_txt);
                        this.f9167l[3] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_infant_bls_g2q4_timer_value_txt);
                        this.f9167l[4] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_infant_bls_g3q1_timer_value_txt);
                        this.f9168m[0] = 5;
                        this.f9168m[1] = 5;
                        this.f9168m[2] = 2;
                        for (int i = 0; i < this.f9168m.length; i++) {
                            for (int i2 = 0; i2 < this.f9168m[i]; i2++) {
                                this.f9162g[i][i2].setOnClickListener(this);
                            }
                        }
                        this.f9165j[0].setOnClickListener(this);
                        this.f9165j[1].setOnClickListener(this);
                    }

                    /* renamed from: a */
                    public void mo9194a() {
                        String str;
                        String str2 = "";
                        ArrayList<C2334ac.C2335a> b = C2556x.f9806w[C2465bl.f8800b].mo8688b(C2465bl.f8801c.get(0).mo9310b());
                        if (b.isEmpty()) {
                            C2491b.this.f9044n.setVisibility(0);
                            C2491b.this.f9047q.sendEmptyMessageDelayed(0, 1000);
                            return;
                        }
                        Iterator<C2334ac.C2335a> it = b.iterator();
                        while (it.hasNext()) {
                            switch (it.next()) {
                                case CHECKDANGER:
                                    str = str2 + " - " + C2557y.f9835g.f10304cs + "\n";
                                    break;
                                case CHECKRESPONSE:
                                    str = str2 + " - " + C2557y.f9835g.f10144R + "\n";
                                    break;
                                case EMERGENCY:
                                    str = str2 + " - " + C2557y.f9835g.f10145S + "\n";
                                    break;
                                case AIRWAY:
                                    str = str2 + " - " + C2557y.f9835g.f10305ct + "\n";
                                    break;
                                case CHECKBREATH:
                                    str = str2 + " - " + C2557y.f9835g.f10306cu + "\n";
                                    break;
                                case CHECKPULSE:
                                    str = str2 + " - " + C2557y.f9835g.f10146T + "\n";
                                    break;
                                case COMP1:
                                    str = str2 + " - " + C2557y.f9835g.f10141O + "1 " + C2557y.f9835g.f10147U + "\n";
                                    break;
                                case COMP2:
                                    str = str2 + " - " + C2557y.f9835g.f10141O + "2 " + C2557y.f9835g.f10147U + "\n";
                                    break;
                                case COMP3:
                                    str = str2 + " - " + C2557y.f9835g.f10141O + "3 " + C2557y.f9835g.f10147U + "\n";
                                    break;
                                case BREATH1:
                                    str = str2 + " - " + C2557y.f9835g.f10141O + "1 " + C2557y.f9835g.f10148V + "\n";
                                    break;
                                case BREATH2:
                                    str = str2 + " - " + C2557y.f9835g.f10141O + "2 " + C2557y.f9835g.f10148V + "\n";
                                    break;
                                case BREATH3:
                                    str = str2 + " - " + C2557y.f9835g.f10141O + "3 " + C2557y.f9835g.f10148V + "\n";
                                    break;
                                case BREATH4:
                                    str = str2 + " - " + C2557y.f9835g.f10141O + "4 " + C2557y.f9835g.f10148V + "\n";
                                    break;
                                case HOT2:
                                    str = str2 + " - " + C2557y.f9835g.f10141O + "2 " + C2557y.f9835g.f10184ae + "\n";
                                    break;
                                case AED1_BLS:
                                    str = str2 + " - " + C2557y.f9835g.f10373eH + "\n";
                                    break;
                                case AED2_BLS:
                                    str = str2 + " - " + C2557y.f9835g.f10374eI + "\n";
                                    break;
                                case AED3_BLS:
                                    str = str2 + " - " + C2557y.f9835g.f10375eJ + "\n";
                                    break;
                                case AED4_BLS:
                                    str = str2 + " - " + C2557y.f9835g.f10376eK + "\n";
                                    break;
                                case AED5_BLS:
                                    str = str2 + " - " + C2557y.f9835g.f10377eL + "\n";
                                    break;
                                case AED1_LAY:
                                    str = str2 + " - " + C2557y.f9835g.f10453fi + "\n";
                                    break;
                                case AED2_LAY:
                                    str = str2 + " - " + C2557y.f9835g.f10455fk + "\n";
                                    break;
                                case AED3_LAY:
                                    str = str2 + " - " + C2557y.f9835g.f10456fl + "\n";
                                    break;
                                case AED4_LAY:
                                    str = str2 + " - " + C2557y.f9835g.f10458fn + "\n";
                                    break;
                                case AED5_LAY:
                                    str = str2 + " - " + C2557y.f9835g.f10460fp + "\n";
                                    break;
                                case AED6_LAY:
                                    str = str2 + " - " + C2557y.f9835g.f10461fq + "\n";
                                    break;
                                case CONT_CPR_BLS:
                                    str = str2 + " - " + C2557y.f9835g.f10379eN + "\n";
                                    break;
                                case CONT_CPR_LAY:
                                    str = str2 + " - " + C2557y.f9835g.f10463fs + "\n";
                                    break;
                                default:
                                    str = str2;
                                    break;
                            }
                            str2 = str;
                        }
                        new AlertDialog.Builder(C2488bp.this.getActivity()).setTitle(C2557y.f9835g.f10530hF).setMessage(C2557y.f9835g.f10531hG + "\n\n" + str2 + "\n\n" + C2557y.f9835g.f10532hH).setNegativeButton(C2557y.f9835g.f10545hb, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialogInterface, int i) {
                                C2491b.this.f9044n.setVisibility(0);
                                C2491b.this.f9047q.sendEmptyMessageDelayed(0, 1000);
                            }
                        }).setPositiveButton(C2557y.f9835g.f10210bD, (DialogInterface.OnClickListener) null).show().setCanceledOnTouchOutside(false);
                    }

                    /* renamed from: b */
                    public void mo9195b() {
                        C2552t b = C2465bl.f8801c.get(0).mo9310b();
                        int i = 0;
                        while (true) {
                            int i2 = i;
                            if (i2 >= this.f9168m.length) {
                                break;
                            }
                            int i3 = 0;
                            while (true) {
                                int i4 = i3;
                                if (i4 >= this.f9168m[i2]) {
                                    break;
                                }
                                if (((Boolean) C2556x.f9806w[C2465bl.f8800b].f7759d[i2][i4].first).booleanValue()) {
                                    this.f9159d[i2][i4].setBackgroundResource(C2656R.drawable.bg_test_selected);
                                    this.f9161f[i2][i4].setImageResource(C2656R.drawable.img_test_check);
                                } else {
                                    this.f9159d[i2][i4].setBackgroundResource(C2656R.drawable.bg_test_unselected);
                                    this.f9161f[i2][i4].setImageResource(C2656R.drawable.img_test_uncheck);
                                }
                                i3 = i4 + 1;
                            }
                            i = i2 + 1;
                        }
                        int[] iArr = {50, 50, 50, 100};
                        int[] iArr2 = {750, 1050, 450, 0};
                        switch (b.f9755k) {
                            case 1:
                            case 4:
                                iArr2[0] = 750;
                                break;
                            case 2:
                            case 3:
                            case 5:
                            case 6:
                                iArr2[0] = 900;
                                break;
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                iArr2[0] = 750;
                                break;
                        }
                        this.f9157b[0].setScaleHeight((float) iArr2[0]);
                        int i5 = 0;
                        int i6 = 0;
                        while (true) {
                            int i7 = i6;
                            int i8 = i5;
                            if (i7 < iArr.length) {
                                int i9 = i8 + iArr[i7];
                                this.f9156a.mo10069b(this.f9157b[i7], 100.0f, (float) i9, 2095.0f, (float) iArr2[i7]);
                                i5 = i9 + iArr2[i7];
                                i6 = i7 + 1;
                            } else {
                                this.f9156a.mo10069b(this.f9166k, 1780.0f, 650.0f, 200.0f, 150.0f);
                                this.f9169n = i8;
                                this.f9156a.setScaleHeight((float) i8);
                                C2556x.f9806w[C2465bl.f8800b].f7756a = C2334ac.C2336b.TEST;
                                this.f9158c[0].setText(C2557y.f9835g.f10419fA);
                                this.f9158c[1].setText(C2557y.f9835g.f10149W);
                                this.f9158c[2].setText(C2557y.f9835g.f10149W + C2557y.f9835g.f10487gP);
                                this.f9166k.setVisibility(4);
                                this.f9161f[0][3].setVisibility(0);
                                switch (b.f9755k) {
                                    case 1:
                                    case 4:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                        this.f9160e[0][0].setText(C2557y.f9835g.f10421fC);
                                        this.f9160e[0][1].setText(C2557y.f9835g.f10422fD);
                                        this.f9160e[0][2].setText(C2557y.f9835g.f10424fF);
                                        this.f9160e[0][3].setText(C2557y.f9835g.f10425fG);
                                        this.f9166k.setVisibility(0);
                                        if (C2465bl.f8807i < C2465bl.f8806h) {
                                            this.f9166k.setText("");
                                            break;
                                        } else {
                                            this.f9166k.setText(String.format("%.1f%s", new Object[]{Float.valueOf(((float) ((int) (C2465bl.f8807i - C2465bl.f8806h))) * 0.001f), C2557y.f9835g.f10348dj}));
                                            break;
                                        }
                                    case 2:
                                    case 5:
                                        this.f9160e[0][0].setText(C2557y.f9835g.f10420fB);
                                        this.f9160e[0][1].setText(C2557y.f9835g.f10421fC);
                                        this.f9160e[0][2].setText(C2557y.f9835g.f10423fE);
                                        this.f9160e[0][3].setText(C2557y.f9835g.f10424fF);
                                        this.f9160e[0][4].setText(C2557y.f9835g.f10422fD);
                                        break;
                                    case 3:
                                    case 6:
                                        this.f9160e[0][0].setText(C2557y.f9835g.f10420fB);
                                        this.f9160e[0][1].setText(C2557y.f9835g.f10421fC);
                                        this.f9160e[0][2].setText(C2557y.f9835g.f10422fD);
                                        this.f9160e[0][3].setText(C2557y.f9835g.f10423fE);
                                        this.f9160e[0][4].setText(C2557y.f9835g.f10424fF);
                                        break;
                                }
                                this.f9160e[1][0].setText(C2557y.f9835g.f10141O + "1: " + C2557y.f9835g.f10428fJ);
                                this.f9160e[1][1].setText(C2557y.f9835g.f10141O + "1: " + C2557y.f9835g.f10430fL);
                                this.f9160e[1][2].setText(C2557y.f9835g.f10141O + "2: " + C2557y.f9835g.f10433fO);
                                this.f9160e[1][3].setText(C2557y.f9835g.f10141O + "2: " + C2557y.f9835g.f10434fP);
                                this.f9160e[1][4].setText(C2557y.f9835g.f10141O + "2: " + C2557y.f9835g.f10435fQ);
                                this.f9160e[2][0].setText(C2557y.f9835g.f10141O + "3: " + C2557y.f9835g.f10438fT);
                                this.f9160e[2][1].setText(C2557y.f9835g.f10141O + "4: " + C2557y.f9835g.f10443fY);
                                this.f9163h.setText(C2557y.f9835g.f10533hI);
                                this.f9164i[0].setText(C2557y.f9835g.f10534hJ);
                                this.f9164i[1].setText(C2557y.f9835g.f10535hK);
                                if (C2556x.f9806w[C2465bl.f8800b].f7761f) {
                                    this.f9165j[0].setImageResource(C2656R.drawable.img_test_mibi_check);
                                } else {
                                    this.f9165j[0].setImageResource(C2656R.drawable.img_test_mibi_uncheck);
                                }
                                if (C2556x.f9806w[C2465bl.f8800b].f7762g) {
                                    this.f9165j[1].setImageResource(C2656R.drawable.img_test_mibi_check);
                                } else {
                                    this.f9165j[1].setImageResource(C2656R.drawable.img_test_mibi_uncheck);
                                }
                                this.f9167l[0].setText(String.format("%.2f%s", new Object[]{Double.valueOf(C2556x.f9806w[C2465bl.f8800b].f7764i), C2557y.f9835g.f10348dj}));
                                this.f9167l[1].setText(String.format("%.2f%s", new Object[]{Double.valueOf(C2556x.f9806w[C2465bl.f8800b].f7765j), C2557y.f9835g.f10348dj}));
                                this.f9167l[2].setText(String.format("%.2f%s", new Object[]{Double.valueOf(C2556x.f9806w[C2465bl.f8800b].f7766k), C2557y.f9835g.f10348dj}));
                                this.f9167l[3].setText(String.format("%.2f%s", new Object[]{Double.valueOf(C2556x.f9806w[C2465bl.f8800b].f7767l), C2557y.f9835g.f10348dj}));
                                this.f9167l[4].setText(String.format("%.2f%s", new Object[]{Double.valueOf(C2556x.f9806w[C2465bl.f8800b].f7768m), C2557y.f9835g.f10348dj}));
                                return;
                            }
                        }
                    }

                    /* renamed from: c */
                    public void mo9196c() {
                        this.f9156a.setVisibility(0);
                    }

                    /* renamed from: d */
                    public void mo9197d() {
                        this.f9156a.setVisibility(4);
                    }

                    /* JADX WARNING: Removed duplicated region for block: B:14:0x0046  */
                    /* JADX WARNING: Removed duplicated region for block: B:17:0x0080  */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public void onClick(android.view.View r10) {
                        /*
                            r9 = this;
                            r5 = 2131165517(0x7f07014d, float:1.7945253E38)
                            r4 = 2131165516(0x7f07014c, float:1.7945251E38)
                            r3 = -1
                            r8 = 1
                            r1 = 0
                            int r6 = r10.getId()
                            switch(r6) {
                                case 2131232333: goto L_0x0011;
                                case 2131232337: goto L_0x0011;
                                case 2131232341: goto L_0x0011;
                                case 2131232345: goto L_0x0011;
                                case 2131232350: goto L_0x0011;
                                case 2131232355: goto L_0x0011;
                                case 2131232360: goto L_0x0011;
                                case 2131232365: goto L_0x0011;
                                case 2131232370: goto L_0x0011;
                                case 2131232375: goto L_0x0011;
                                case 2131232380: goto L_0x0011;
                                case 2131232385: goto L_0x0011;
                                case 2131232388: goto L_0x00b5;
                                case 2131232390: goto L_0x00e1;
                                default: goto L_0x0010;
                            }
                        L_0x0010:
                            return
                        L_0x0011:
                            r0 = r1
                            r2 = r3
                            r4 = r3
                        L_0x0014:
                            int[] r5 = r9.f9168m
                            int r5 = r5.length
                            if (r0 >= r5) goto L_0x0030
                            r5 = r1
                        L_0x001a:
                            int[] r7 = r9.f9168m
                            r7 = r7[r0]
                            if (r5 >= r7) goto L_0x002e
                            android.widget.ImageView[][] r7 = r9.f9162g
                            r7 = r7[r0]
                            r7 = r7[r5]
                            int r7 = r7.getId()
                            if (r7 != r6) goto L_0x007a
                            r2 = r5
                            r4 = r0
                        L_0x002e:
                            if (r4 == r3) goto L_0x007d
                        L_0x0030:
                            com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                            int r3 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                            r0 = r0[r3]
                            android.util.Pair<java.lang.Boolean, java.lang.Long>[][] r0 = r0.f7759d
                            r0 = r0[r4]
                            r0 = r0[r2]
                            java.lang.Object r0 = r0.first
                            java.lang.Boolean r0 = (java.lang.Boolean) r0
                            boolean r0 = r0.booleanValue()
                            if (r0 == 0) goto L_0x0080
                            com.ssomai.android.scalablelayout.ScalableLayout[][] r0 = r9.f9159d
                            r0 = r0[r4]
                            r0 = r0[r2]
                            r3 = 2131165280(0x7f070060, float:1.7944773E38)
                            r0.setBackgroundResource(r3)
                            android.widget.ImageView[][] r0 = r9.f9161f
                            r0 = r0[r4]
                            r0 = r0[r2]
                            r3 = 2131165531(0x7f07015b, float:1.7945282E38)
                            r0.setImageResource(r3)
                            com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                            int r3 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                            r0 = r0[r3]
                            android.util.Pair<java.lang.Boolean, java.lang.Long>[][] r0 = r0.f7759d
                            r0 = r0[r4]
                            android.util.Pair r3 = new android.util.Pair
                            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                            r4 = 0
                            java.lang.Long r4 = java.lang.Long.valueOf(r4)
                            r3.<init>(r1, r4)
                            r0[r2] = r3
                            goto L_0x0010
                        L_0x007a:
                            int r5 = r5 + 1
                            goto L_0x001a
                        L_0x007d:
                            int r0 = r0 + 1
                            goto L_0x0014
                        L_0x0080:
                            com.ssomai.android.scalablelayout.ScalableLayout[][] r0 = r9.f9159d
                            r0 = r0[r4]
                            r0 = r0[r2]
                            r1 = 2131165277(0x7f07005d, float:1.7944767E38)
                            r0.setBackgroundResource(r1)
                            android.widget.ImageView[][] r0 = r9.f9161f
                            r0 = r0[r4]
                            r0 = r0[r2]
                            r1 = 2131165512(0x7f070148, float:1.7945243E38)
                            r0.setImageResource(r1)
                            com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                            int r1 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                            r0 = r0[r1]
                            android.util.Pair<java.lang.Boolean, java.lang.Long>[][] r0 = r0.f7759d
                            r0 = r0[r4]
                            android.util.Pair r1 = new android.util.Pair
                            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r8)
                            r4 = 0
                            java.lang.Long r4 = java.lang.Long.valueOf(r4)
                            r1.<init>(r3, r4)
                            r0[r2] = r1
                            goto L_0x0010
                        L_0x00b5:
                            com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                            int r2 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                            r0 = r0[r2]
                            boolean r0 = r0.f7761f
                            if (r0 == 0) goto L_0x00d0
                            com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                            int r2 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                            r0 = r0[r2]
                            r0.f7761f = r1
                            android.widget.ImageView[] r0 = r9.f9165j
                            r0 = r0[r1]
                            r0.setImageResource(r5)
                            goto L_0x0010
                        L_0x00d0:
                            com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                            int r2 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                            r0 = r0[r2]
                            r0.f7761f = r8
                            android.widget.ImageView[] r0 = r9.f9165j
                            r0 = r0[r1]
                            r0.setImageResource(r4)
                            goto L_0x0010
                        L_0x00e1:
                            com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                            int r2 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                            r0 = r0[r2]
                            boolean r0 = r0.f7762g
                            if (r0 == 0) goto L_0x00fc
                            com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                            int r2 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                            r0 = r0[r2]
                            r0.f7762g = r1
                            android.widget.ImageView[] r0 = r9.f9165j
                            r0 = r0[r8]
                            r0.setImageResource(r5)
                            goto L_0x0010
                        L_0x00fc:
                            com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                            int r1 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                            r0 = r0[r1]
                            r0.f7762g = r8
                            android.widget.ImageView[] r0 = r9.f9165j
                            r0 = r0[r8]
                            r0.setImageResource(r4)
                            goto L_0x0010
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.imlabworld.HS_Instructor.C2488bp.C2491b.C2495a.C2497b.C2502c.onClick(android.view.View):void");
                    }
                }

                /* renamed from: com.imlabworld.HS_Instructor.bp$b$a$b$d */
                class C2504d implements View.OnClickListener {

                    /* renamed from: a */
                    final ScalableLayout f9172a;

                    /* renamed from: b */
                    final ScalableLayout[] f9173b = new ScalableLayout[3];

                    /* renamed from: c */
                    final TextView[] f9174c = new TextView[2];

                    /* renamed from: d */
                    final ScalableLayout[][] f9175d = ((ScalableLayout[][]) Array.newInstance(ScalableLayout.class, new int[]{2, 6}));

                    /* renamed from: e */
                    final TextView[][] f9176e = ((TextView[][]) Array.newInstance(TextView.class, new int[]{2, 6}));

                    /* renamed from: f */
                    final ImageView[][] f9177f = ((ImageView[][]) Array.newInstance(ImageView.class, new int[]{2, 6}));

                    /* renamed from: g */
                    final ImageView[][] f9178g = ((ImageView[][]) Array.newInstance(ImageView.class, new int[]{2, 6}));

                    /* renamed from: h */
                    final TextView f9179h;

                    /* renamed from: i */
                    final TextView[] f9180i = new TextView[2];

                    /* renamed from: j */
                    final ImageView[] f9181j = new ImageView[2];

                    /* renamed from: k */
                    final TextView f9182k;

                    /* renamed from: l */
                    final int[] f9183l = new int[2];

                    /* renamed from: m */
                    final TextView[] f9184m = new TextView[6];

                    /* renamed from: n */
                    int f9185n;

                    public C2504d(View view) {
                        this.f9172a = (ScalableLayout) view.findViewById(C2656R.C2657id.test_result_sheet_infant_lay_sc);
                        this.f9173b[0] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_result_sheet_infant_lay_part1_sc);
                        this.f9173b[1] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_result_sheet_infant_lay_part2_sc);
                        this.f9173b[2] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_result_sheet_infant_lay_part3_sc);
                        this.f9174c[0] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_infant_lay_g1_txt);
                        this.f9174c[1] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_infant_lay_g2_txt);
                        this.f9175d[0][0] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_result_sheet_infant_lay_g1q1_sc);
                        this.f9175d[0][1] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_result_sheet_infant_lay_g1q2_sc);
                        this.f9175d[0][2] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_result_sheet_infant_lay_g1q3_sc);
                        this.f9175d[0][3] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_result_sheet_infant_lay_g1q4_sc);
                        this.f9175d[0][4] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_result_sheet_infant_lay_g1q5_sc);
                        this.f9175d[1][0] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_result_sheet_infant_lay_g2q1_sc);
                        this.f9175d[1][1] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_result_sheet_infant_lay_g2q2_sc);
                        this.f9175d[1][2] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_result_sheet_infant_lay_g2q3_sc);
                        this.f9175d[1][3] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_result_sheet_infant_lay_g2q4_sc);
                        this.f9175d[1][4] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_result_sheet_infant_lay_g2q5_sc);
                        this.f9175d[1][5] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_result_sheet_infant_lay_g2q6_sc);
                        this.f9176e[0][0] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_infant_lay_g1q1_txt);
                        this.f9176e[0][1] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_infant_lay_g1q2_txt);
                        this.f9176e[0][2] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_infant_lay_g1q3_txt);
                        this.f9176e[0][3] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_infant_lay_g1q4_txt);
                        this.f9176e[0][4] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_infant_lay_g1q5_txt);
                        this.f9176e[1][0] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_infant_lay_g2q1_txt);
                        this.f9176e[1][1] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_infant_lay_g2q2_txt);
                        this.f9176e[1][2] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_infant_lay_g2q3_txt);
                        this.f9176e[1][3] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_infant_lay_g2q4_txt);
                        this.f9176e[1][4] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_infant_lay_g2q5_txt);
                        this.f9176e[1][5] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_infant_lay_g2q6_txt);
                        this.f9177f[0][0] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_infant_lay_g1q1_btn);
                        this.f9177f[0][1] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_infant_lay_g1q2_btn);
                        this.f9177f[0][2] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_infant_lay_g1q3_btn);
                        this.f9177f[0][3] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_infant_lay_g1q4_btn);
                        this.f9177f[0][4] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_infant_lay_g1q5_btn);
                        this.f9177f[1][0] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_infant_lay_g2q1_btn);
                        this.f9177f[1][1] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_infant_lay_g2q2_btn);
                        this.f9177f[1][2] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_infant_lay_g2q3_btn);
                        this.f9177f[1][3] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_infant_lay_g2q4_btn);
                        this.f9177f[1][4] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_infant_lay_g2q5_btn);
                        this.f9177f[1][5] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_infant_lay_g2q6_btn);
                        this.f9178g[0][0] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_infant_lay_g1q1_click_btn);
                        this.f9178g[0][1] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_infant_lay_g1q2_click_btn);
                        this.f9178g[0][2] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_infant_lay_g1q3_click_btn);
                        this.f9178g[0][3] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_infant_lay_g1q4_click_btn);
                        this.f9178g[0][4] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_infant_lay_g1q5_click_btn);
                        this.f9178g[1][0] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_infant_lay_g2q1_click_btn);
                        this.f9178g[1][1] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_infant_lay_g2q2_click_btn);
                        this.f9178g[1][2] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_infant_lay_g2q3_click_btn);
                        this.f9178g[1][3] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_infant_lay_g2q4_click_btn);
                        this.f9178g[1][4] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_infant_lay_g2q5_click_btn);
                        this.f9178g[1][5] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_infant_lay_g2q6_click_btn);
                        this.f9179h = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_infant_lay_mibi_txt);
                        this.f9180i[0] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_infant_lay_mibi1_txt);
                        this.f9180i[1] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_infant_lay_mibi2_txt);
                        this.f9181j[0] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_infant_lay_mibi1_btn);
                        this.f9181j[1] = (ImageView) view.findViewById(C2656R.C2657id.test_result_sheet_infant_lay_mibi2_btn);
                        this.f9182k = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_infant_lay_g1q3_timer_value_txt);
                        this.f9184m[0] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_infant_lay_g2q1_timer_value_txt);
                        this.f9184m[1] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_infant_lay_g2q2_timer_value_txt);
                        this.f9184m[2] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_infant_lay_g2q3_timer_value_txt);
                        this.f9184m[3] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_infant_lay_g2q4_timer_value_txt);
                        this.f9184m[4] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_infant_lay_g2q5_timer_value_txt);
                        this.f9184m[5] = (TextView) view.findViewById(C2656R.C2657id.test_result_sheet_infant_lay_g2q6_timer_value_txt);
                        this.f9183l[0] = 5;
                        this.f9183l[1] = 6;
                        for (int i = 0; i < this.f9183l.length; i++) {
                            for (int i2 = 0; i2 < this.f9183l[i]; i2++) {
                                this.f9178g[i][i2].setOnClickListener(this);
                            }
                        }
                        this.f9181j[0].setOnClickListener(this);
                        this.f9181j[1].setOnClickListener(this);
                    }

                    /* renamed from: a */
                    public void mo9200a() {
                        String str;
                        String str2 = "";
                        ArrayList<C2334ac.C2335a> b = C2556x.f9806w[C2465bl.f8800b].mo8688b(C2465bl.f8801c.get(0).mo9310b());
                        if (b.isEmpty()) {
                            C2491b.this.f9044n.setVisibility(0);
                            C2491b.this.f9047q.sendEmptyMessageDelayed(0, 1000);
                            return;
                        }
                        Iterator<C2334ac.C2335a> it = b.iterator();
                        while (it.hasNext()) {
                            switch (it.next()) {
                                case CHECKDANGER:
                                    str = str2 + " - " + C2557y.f9835g.f10304cs + "\n";
                                    break;
                                case CHECKRESPONSE:
                                    str = str2 + " - " + C2557y.f9835g.f10144R + "\n";
                                    break;
                                case EMERGENCY:
                                    str = str2 + " - " + C2557y.f9835g.f10145S + "\n";
                                    break;
                                case AIRWAY:
                                    str = str2 + " - " + C2557y.f9835g.f10305ct + "\n";
                                    break;
                                case CHECKBREATH:
                                    str = str2 + " - " + C2557y.f9835g.f10306cu + "\n";
                                    break;
                                case CHECKPULSE:
                                    str = str2 + " - " + C2557y.f9835g.f10146T + "\n";
                                    break;
                                case COMP1:
                                    str = str2 + " - " + C2557y.f9835g.f10141O + "1 " + C2557y.f9835g.f10147U + "\n";
                                    break;
                                case COMP2:
                                    str = str2 + " - " + C2557y.f9835g.f10141O + "2 " + C2557y.f9835g.f10147U + "\n";
                                    break;
                                case COMP3:
                                    str = str2 + " - " + C2557y.f9835g.f10141O + "3 " + C2557y.f9835g.f10147U + "\n";
                                    break;
                                case BREATH1:
                                    str = str2 + " - " + C2557y.f9835g.f10141O + "1 " + C2557y.f9835g.f10148V + "\n";
                                    break;
                                case BREATH2:
                                    str = str2 + " - " + C2557y.f9835g.f10141O + "2 " + C2557y.f9835g.f10148V + "\n";
                                    break;
                                case BREATH3:
                                    str = str2 + " - " + C2557y.f9835g.f10141O + "3 " + C2557y.f9835g.f10148V + "\n";
                                    break;
                                case BREATH4:
                                    str = str2 + " - " + C2557y.f9835g.f10141O + "4 " + C2557y.f9835g.f10148V + "\n";
                                    break;
                                case HOT2:
                                    str = str2 + " - " + C2557y.f9835g.f10141O + "2 " + C2557y.f9835g.f10184ae + "\n";
                                    break;
                                case AED1_BLS:
                                    str = str2 + " - " + C2557y.f9835g.f10373eH + "\n";
                                    break;
                                case AED2_BLS:
                                    str = str2 + " - " + C2557y.f9835g.f10374eI + "\n";
                                    break;
                                case AED3_BLS:
                                    str = str2 + " - " + C2557y.f9835g.f10375eJ + "\n";
                                    break;
                                case AED4_BLS:
                                    str = str2 + " - " + C2557y.f9835g.f10376eK + "\n";
                                    break;
                                case AED5_BLS:
                                    str = str2 + " - " + C2557y.f9835g.f10377eL + "\n";
                                    break;
                                case AED1_LAY:
                                    str = str2 + " - " + C2557y.f9835g.f10453fi + "\n";
                                    break;
                                case AED2_LAY:
                                    str = str2 + " - " + C2557y.f9835g.f10455fk + "\n";
                                    break;
                                case AED3_LAY:
                                    str = str2 + " - " + C2557y.f9835g.f10456fl + "\n";
                                    break;
                                case AED4_LAY:
                                    str = str2 + " - " + C2557y.f9835g.f10458fn + "\n";
                                    break;
                                case AED5_LAY:
                                    str = str2 + " - " + C2557y.f9835g.f10460fp + "\n";
                                    break;
                                case AED6_LAY:
                                    str = str2 + " - " + C2557y.f9835g.f10461fq + "\n";
                                    break;
                                case CONT_CPR_BLS:
                                    str = str2 + " - " + C2557y.f9835g.f10379eN + "\n";
                                    break;
                                case CONT_CPR_LAY:
                                    str = str2 + " - " + C2557y.f9835g.f10463fs + "\n";
                                    break;
                                default:
                                    str = str2;
                                    break;
                            }
                            str2 = str;
                        }
                        new AlertDialog.Builder(C2488bp.this.getActivity()).setTitle(C2557y.f9835g.f10530hF).setMessage(C2557y.f9835g.f10531hG + "\n\n" + str2 + "\n\n" + C2557y.f9835g.f10532hH).setNegativeButton(C2557y.f9835g.f10545hb, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialogInterface, int i) {
                                C2491b.this.f9044n.setVisibility(0);
                                C2491b.this.f9047q.sendEmptyMessageDelayed(0, 1000);
                            }
                        }).setPositiveButton(C2557y.f9835g.f10210bD, (DialogInterface.OnClickListener) null).show().setCanceledOnTouchOutside(false);
                    }

                    /* renamed from: b */
                    public void mo9201b() {
                        C2552t b = C2465bl.f8801c.get(0).mo9310b();
                        int i = 0;
                        while (true) {
                            int i2 = i;
                            if (i2 >= this.f9183l.length) {
                                break;
                            }
                            int i3 = 0;
                            while (true) {
                                int i4 = i3;
                                if (i4 >= this.f9183l[i2]) {
                                    break;
                                }
                                if (((Boolean) C2556x.f9806w[C2465bl.f8800b].f7760e[i2][i4].first).booleanValue()) {
                                    this.f9175d[i2][i4].setBackgroundResource(C2656R.drawable.bg_test_selected);
                                    this.f9177f[i2][i4].setImageResource(C2656R.drawable.img_test_check);
                                } else {
                                    this.f9175d[i2][i4].setBackgroundResource(C2656R.drawable.bg_test_unselected);
                                    this.f9177f[i2][i4].setImageResource(C2656R.drawable.img_test_uncheck);
                                }
                                i3 = i4 + 1;
                            }
                            i = i2 + 1;
                        }
                        int[] iArr = {50, 50, 100};
                        int[] iArr2 = {750, 1200, 0};
                        switch (b.f9755k) {
                            case 1:
                            case 4:
                                iArr2[0] = 600;
                                break;
                            case 2:
                            case 3:
                            case 5:
                            case 6:
                                iArr2[0] = 900;
                                break;
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                iArr2[0] = 600;
                                break;
                        }
                        this.f9173b[0].setScaleHeight((float) iArr2[0]);
                        int i5 = 0;
                        int i6 = 0;
                        while (true) {
                            int i7 = i6;
                            int i8 = i5;
                            if (i7 < iArr.length) {
                                int i9 = i8 + iArr[i7];
                                this.f9172a.mo10069b(this.f9173b[i7], 100.0f, (float) i9, 2095.0f, (float) iArr2[i7]);
                                i5 = i9 + iArr2[i7];
                                i6 = i7 + 1;
                            } else {
                                this.f9172a.mo10069b(this.f9182k, 1780.0f, 500.0f, 200.0f, 150.0f);
                                this.f9185n = i8;
                                this.f9172a.setScaleHeight((float) i8);
                                C2556x.f9806w[C2465bl.f8800b].f7756a = C2334ac.C2336b.TEST;
                                this.f9174c[0].setText(C2557y.f9835g.f10419fA);
                                this.f9174c[1].setText(C2557y.f9835g.f10149W);
                                this.f9182k.setVisibility(4);
                                this.f9177f[0][2].setVisibility(0);
                                switch (b.f9755k) {
                                    case 1:
                                    case 4:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                        this.f9176e[0][0].setText(C2557y.f9835g.f10500gc);
                                        this.f9176e[0][1].setText(C2557y.f9835g.f10501gd);
                                        this.f9176e[0][2].setText(C2557y.f9835g.f10503gf);
                                        this.f9182k.setVisibility(0);
                                        if (C2465bl.f8807i < C2465bl.f8806h) {
                                            this.f9182k.setText("");
                                            break;
                                        } else {
                                            this.f9182k.setText(String.format("%.1f%s", new Object[]{Float.valueOf(((float) ((int) (C2465bl.f8807i - C2465bl.f8806h))) * 0.001f), C2557y.f9835g.f10348dj}));
                                            break;
                                        }
                                    case 2:
                                    case 5:
                                        this.f9176e[0][0].setText(C2557y.f9835g.f10499gb);
                                        this.f9176e[0][1].setText(C2557y.f9835g.f10500gc);
                                        this.f9176e[0][2].setText(C2557y.f9835g.f10502ge);
                                        this.f9176e[0][3].setText(C2557y.f9835g.f10503gf);
                                        this.f9176e[0][4].setText(C2557y.f9835g.f10501gd);
                                        break;
                                    case 3:
                                    case 6:
                                        this.f9176e[0][0].setText(C2557y.f9835g.f10499gb);
                                        this.f9176e[0][1].setText(C2557y.f9835g.f10500gc);
                                        this.f9176e[0][2].setText(C2557y.f9835g.f10501gd);
                                        this.f9176e[0][3].setText(C2557y.f9835g.f10502ge);
                                        this.f9176e[0][4].setText(C2557y.f9835g.f10503gf);
                                        break;
                                }
                                this.f9176e[1][0].setText(C2557y.f9835g.f10141O + "1: " + C2557y.f9835g.f10504gg);
                                this.f9176e[1][1].setText(C2557y.f9835g.f10141O + "1: " + C2557y.f9835g.f10506gi);
                                this.f9176e[1][2].setText(C2557y.f9835g.f10141O + "2: " + C2557y.f9835g.f10508gk);
                                this.f9176e[1][3].setText(C2557y.f9835g.f10141O + "2: " + C2557y.f9835g.f10510gm);
                                this.f9176e[1][4].setText(C2557y.f9835g.f10141O + "3: " + C2557y.f9835g.f10512go);
                                this.f9176e[1][5].setText(C2557y.f9835g.f10141O + "3: " + C2557y.f9835g.f10514gq);
                                this.f9179h.setText(C2557y.f9835g.f10533hI);
                                this.f9180i[0].setText(C2557y.f9835g.f10534hJ);
                                this.f9180i[1].setText(C2557y.f9835g.f10535hK);
                                if (C2556x.f9806w[C2465bl.f8800b].f7761f) {
                                    this.f9181j[0].setImageResource(C2656R.drawable.img_test_mibi_check);
                                } else {
                                    this.f9181j[0].setImageResource(C2656R.drawable.img_test_mibi_uncheck);
                                }
                                if (C2556x.f9806w[C2465bl.f8800b].f7762g) {
                                    this.f9181j[1].setImageResource(C2656R.drawable.img_test_mibi_check);
                                } else {
                                    this.f9181j[1].setImageResource(C2656R.drawable.img_test_mibi_uncheck);
                                }
                                this.f9184m[0].setText(String.format("%.2f%s", new Object[]{Double.valueOf(C2556x.f9806w[C2465bl.f8800b].f7764i), C2557y.f9835g.f10348dj}));
                                this.f9184m[1].setText(String.format("%.2f%s", new Object[]{Double.valueOf(C2556x.f9806w[C2465bl.f8800b].f7765j), C2557y.f9835g.f10348dj}));
                                this.f9184m[2].setText(String.format("%.2f%s", new Object[]{Double.valueOf(C2556x.f9806w[C2465bl.f8800b].f7766k), C2557y.f9835g.f10348dj}));
                                this.f9184m[3].setText(String.format("%.2f%s", new Object[]{Double.valueOf(C2556x.f9806w[C2465bl.f8800b].f7767l), C2557y.f9835g.f10348dj}));
                                this.f9184m[4].setText(String.format("%.2f%s", new Object[]{Double.valueOf(C2556x.f9806w[C2465bl.f8800b].f7768m), C2557y.f9835g.f10348dj}));
                                this.f9184m[5].setText(String.format("%.2f%s", new Object[]{Double.valueOf(C2556x.f9806w[C2465bl.f8800b].f7769n), C2557y.f9835g.f10348dj}));
                                return;
                            }
                        }
                    }

                    /* renamed from: c */
                    public void mo9202c() {
                        this.f9172a.setVisibility(0);
                    }

                    /* renamed from: d */
                    public void mo9203d() {
                        this.f9172a.setVisibility(4);
                    }

                    /* JADX WARNING: Removed duplicated region for block: B:14:0x0046  */
                    /* JADX WARNING: Removed duplicated region for block: B:17:0x0080  */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public void onClick(android.view.View r10) {
                        /*
                            r9 = this;
                            r5 = 2131165517(0x7f07014d, float:1.7945253E38)
                            r4 = 2131165516(0x7f07014c, float:1.7945251E38)
                            r3 = -1
                            r8 = 1
                            r1 = 0
                            int r6 = r10.getId()
                            switch(r6) {
                                case 2131232401: goto L_0x0011;
                                case 2131232405: goto L_0x0011;
                                case 2131232409: goto L_0x0011;
                                case 2131232414: goto L_0x0011;
                                case 2131232418: goto L_0x0011;
                                case 2131232423: goto L_0x0011;
                                case 2131232428: goto L_0x0011;
                                case 2131232433: goto L_0x0011;
                                case 2131232438: goto L_0x0011;
                                case 2131232443: goto L_0x0011;
                                case 2131232448: goto L_0x0011;
                                case 2131232452: goto L_0x00b5;
                                case 2131232454: goto L_0x00e1;
                                default: goto L_0x0010;
                            }
                        L_0x0010:
                            return
                        L_0x0011:
                            r0 = r1
                            r2 = r3
                            r4 = r3
                        L_0x0014:
                            int[] r5 = r9.f9183l
                            int r5 = r5.length
                            if (r0 >= r5) goto L_0x0030
                            r5 = r1
                        L_0x001a:
                            int[] r7 = r9.f9183l
                            r7 = r7[r0]
                            if (r5 >= r7) goto L_0x002e
                            android.widget.ImageView[][] r7 = r9.f9178g
                            r7 = r7[r0]
                            r7 = r7[r5]
                            int r7 = r7.getId()
                            if (r7 != r6) goto L_0x007a
                            r2 = r5
                            r4 = r0
                        L_0x002e:
                            if (r4 == r3) goto L_0x007d
                        L_0x0030:
                            com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                            int r3 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                            r0 = r0[r3]
                            android.util.Pair<java.lang.Boolean, java.lang.Long>[][] r0 = r0.f7760e
                            r0 = r0[r4]
                            r0 = r0[r2]
                            java.lang.Object r0 = r0.first
                            java.lang.Boolean r0 = (java.lang.Boolean) r0
                            boolean r0 = r0.booleanValue()
                            if (r0 == 0) goto L_0x0080
                            com.ssomai.android.scalablelayout.ScalableLayout[][] r0 = r9.f9175d
                            r0 = r0[r4]
                            r0 = r0[r2]
                            r3 = 2131165280(0x7f070060, float:1.7944773E38)
                            r0.setBackgroundResource(r3)
                            android.widget.ImageView[][] r0 = r9.f9177f
                            r0 = r0[r4]
                            r0 = r0[r2]
                            r3 = 2131165531(0x7f07015b, float:1.7945282E38)
                            r0.setImageResource(r3)
                            com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                            int r3 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                            r0 = r0[r3]
                            android.util.Pair<java.lang.Boolean, java.lang.Long>[][] r0 = r0.f7760e
                            r0 = r0[r4]
                            android.util.Pair r3 = new android.util.Pair
                            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                            r4 = 0
                            java.lang.Long r4 = java.lang.Long.valueOf(r4)
                            r3.<init>(r1, r4)
                            r0[r2] = r3
                            goto L_0x0010
                        L_0x007a:
                            int r5 = r5 + 1
                            goto L_0x001a
                        L_0x007d:
                            int r0 = r0 + 1
                            goto L_0x0014
                        L_0x0080:
                            com.ssomai.android.scalablelayout.ScalableLayout[][] r0 = r9.f9175d
                            r0 = r0[r4]
                            r0 = r0[r2]
                            r1 = 2131165277(0x7f07005d, float:1.7944767E38)
                            r0.setBackgroundResource(r1)
                            android.widget.ImageView[][] r0 = r9.f9177f
                            r0 = r0[r4]
                            r0 = r0[r2]
                            r1 = 2131165512(0x7f070148, float:1.7945243E38)
                            r0.setImageResource(r1)
                            com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                            int r1 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                            r0 = r0[r1]
                            android.util.Pair<java.lang.Boolean, java.lang.Long>[][] r0 = r0.f7760e
                            r0 = r0[r4]
                            android.util.Pair r1 = new android.util.Pair
                            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r8)
                            r4 = 0
                            java.lang.Long r4 = java.lang.Long.valueOf(r4)
                            r1.<init>(r3, r4)
                            r0[r2] = r1
                            goto L_0x0010
                        L_0x00b5:
                            com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                            int r2 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                            r0 = r0[r2]
                            boolean r0 = r0.f7761f
                            if (r0 == 0) goto L_0x00d0
                            com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                            int r2 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                            r0 = r0[r2]
                            r0.f7761f = r1
                            android.widget.ImageView[] r0 = r9.f9181j
                            r0 = r0[r1]
                            r0.setImageResource(r5)
                            goto L_0x0010
                        L_0x00d0:
                            com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                            int r2 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                            r0 = r0[r2]
                            r0.f7761f = r8
                            android.widget.ImageView[] r0 = r9.f9181j
                            r0 = r0[r1]
                            r0.setImageResource(r4)
                            goto L_0x0010
                        L_0x00e1:
                            com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                            int r2 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                            r0 = r0[r2]
                            boolean r0 = r0.f7762g
                            if (r0 == 0) goto L_0x00fc
                            com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                            int r2 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                            r0 = r0[r2]
                            r0.f7762g = r1
                            android.widget.ImageView[] r0 = r9.f9181j
                            r0 = r0[r8]
                            r0.setImageResource(r5)
                            goto L_0x0010
                        L_0x00fc:
                            com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                            int r1 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                            r0 = r0[r1]
                            r0.f7762g = r8
                            android.widget.ImageView[] r0 = r9.f9181j
                            r0 = r0[r8]
                            r0.setImageResource(r4)
                            goto L_0x0010
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.imlabworld.HS_Instructor.C2488bp.C2491b.C2495a.C2497b.C2504d.onClick(android.view.View):void");
                    }
                }

                public C2497b(View view) {
                    this.f9104a = new C2498a(view);
                    this.f9105b = new C2500b(view);
                    this.f9106c = new C2502c(view);
                    this.f9107d = new C2504d(view);
                }

                /* access modifiers changed from: package-private */
                /* renamed from: a */
                public void mo9177a() {
                    C2465bl.f8801c.get(0).mo9306a();
                    C2552t b = C2465bl.f8801c.get(0).mo9310b();
                    switch (b.f9748d) {
                        case 1:
                            switch (b.f9747c) {
                                case 1:
                                case 2:
                                    this.f9105b.mo9189b();
                                    mo9179c();
                                    this.f9108e = this.f9105b.f9153u;
                                    C2495a.this.f9054b.mo10069b(this.f9105b.f9133a, 0.0f, 1710.0f, 2295.0f, (float) this.f9108e);
                                    return;
                                case 3:
                                    this.f9107d.mo9201b();
                                    mo9181e();
                                    this.f9108e = this.f9107d.f9185n;
                                    C2495a.this.f9054b.mo10069b(this.f9107d.f9172a, 0.0f, 100.0f, 2295.0f, (float) this.f9108e);
                                    return;
                                default:
                                    return;
                            }
                        case 2:
                            switch (b.f9747c) {
                                case 1:
                                case 2:
                                    this.f9104a.mo9183b();
                                    mo9178b();
                                    this.f9108e = this.f9104a.f9130u;
                                    C2495a.this.f9054b.mo10069b(this.f9104a.f9110a, 0.0f, 1710.0f, 2295.0f, (float) this.f9108e);
                                    return;
                                case 3:
                                    this.f9106c.mo9195b();
                                    mo9180d();
                                    this.f9108e = this.f9106c.f9169n;
                                    C2495a.this.f9054b.mo10069b(this.f9106c.f9156a, 0.0f, 100.0f, 2295.0f, (float) this.f9108e);
                                    return;
                                default:
                                    return;
                            }
                        default:
                            return;
                    }
                }

                /* access modifiers changed from: package-private */
                /* renamed from: b */
                public void mo9178b() {
                    this.f9104a.mo9184c();
                    this.f9105b.mo9191d();
                    this.f9106c.mo9197d();
                    this.f9107d.mo9203d();
                }

                /* access modifiers changed from: package-private */
                /* renamed from: c */
                public void mo9179c() {
                    this.f9104a.mo9185d();
                    this.f9105b.mo9190c();
                    this.f9106c.mo9197d();
                    this.f9107d.mo9203d();
                }

                /* access modifiers changed from: package-private */
                /* renamed from: d */
                public void mo9180d() {
                    this.f9104a.mo9185d();
                    this.f9105b.mo9191d();
                    this.f9106c.mo9196c();
                    this.f9107d.mo9203d();
                }

                /* access modifiers changed from: package-private */
                /* renamed from: e */
                public void mo9181e() {
                    this.f9104a.mo9185d();
                    this.f9105b.mo9191d();
                    this.f9106c.mo9197d();
                    this.f9107d.mo9202c();
                }
            }

            public C2495a(View view) {
                this.f9053a = (ScrollView) view.findViewById(C2656R.C2657id.test_result_detail_scroll);
                this.f9054b = (ScalableLayout) view.findViewById(C2656R.C2657id.test_result_detail_scroll_sc);
                this.f9055c = new C2496a(view);
                this.f9056d = new C2497b(view);
                this.f9057e = (TextView) view.findViewById(C2656R.C2657id.test_result_detail_graph_title);
                this.f9058f = (TextView) view.findViewById(C2656R.C2657id.test_result_detail_sheet_title);
            }

            /* renamed from: a */
            public void mo9167a() {
                C2552t b = C2465bl.f8801c.get(0).mo9310b();
                this.f9057e.setText(C2557y.f9835g.f10396ee);
                this.f9058f.setText(C2557y.f9835g.f10397ef);
                this.f9056d.mo9177a();
                switch (b.f9747c) {
                    case 1:
                    case 2:
                        this.f9057e.setVisibility(0);
                        this.f9055c.mo9170a();
                        this.f9055c.mo9174b();
                        this.f9054b.mo10057a((View) this.f9058f, 100.0f, 1610.0f);
                        this.f9054b.setScaleHeight((float) (this.f9056d.f9108e + 1710));
                        break;
                    case 3:
                        this.f9057e.setVisibility(4);
                        this.f9055c.mo9176c();
                        this.f9054b.mo10057a((View) this.f9058f, 100.0f, 0.0f);
                        this.f9054b.setScaleHeight((float) (this.f9056d.f9108e + 100));
                        break;
                }
                this.f9053a.scrollTo(0, 0);
            }

            /* renamed from: b */
            public void mo9168b() {
                this.f9053a.setVisibility(0);
            }

            /* renamed from: c */
            public void mo9169c() {
                this.f9053a.setVisibility(4);
            }
        }

        /* renamed from: com.imlabworld.HS_Instructor.bp$b$b */
        class C2506b {

            /* renamed from: A */
            final ScalableLayout f9188A;

            /* renamed from: a */
            final ScrollView f9190a;

            /* renamed from: b */
            final ImageView f9191b;

            /* renamed from: c */
            final TextView f9192c;

            /* renamed from: d */
            final TextView f9193d;

            /* renamed from: e */
            final TextView f9194e;

            /* renamed from: f */
            final TextView f9195f;

            /* renamed from: g */
            final TextView f9196g;

            /* renamed from: h */
            final TextView f9197h;

            /* renamed from: i */
            final TextView f9198i;

            /* renamed from: j */
            final TextView f9199j;

            /* renamed from: k */
            final TextView f9200k;

            /* renamed from: l */
            final TextView f9201l;

            /* renamed from: m */
            final TextView f9202m;

            /* renamed from: n */
            final TextView f9203n;

            /* renamed from: o */
            final TextView f9204o;

            /* renamed from: p */
            final TextView f9205p;

            /* renamed from: q */
            final TextView f9206q;

            /* renamed from: r */
            final TextView f9207r;

            /* renamed from: s */
            final TextView f9208s;

            /* renamed from: t */
            final TextView f9209t;

            /* renamed from: u */
            final TextView f9210u;

            /* renamed from: v */
            final TextView f9211v;

            /* renamed from: w */
            final TextView f9212w;

            /* renamed from: x */
            final TextView f9213x;

            /* renamed from: y */
            final ImageView[] f9214y = new ImageView[5];

            /* renamed from: z */
            final TextView[] f9215z = new TextView[5];

            public C2506b(View view) {
                this.f9190a = (ScrollView) view.findViewById(C2656R.C2657id.test_result_overview_scroll);
                this.f9191b = (ImageView) view.findViewById(C2656R.C2657id.test_result_overview_result_score_box);
                this.f9192c = (TextView) view.findViewById(C2656R.C2657id.test_result_overview_result_score_title);
                this.f9193d = (TextView) view.findViewById(C2656R.C2657id.test_result_overview_result_score_txt);
                this.f9194e = (TextView) view.findViewById(C2656R.C2657id.test_result_overview_average_title);
                this.f9195f = (TextView) view.findViewById(C2656R.C2657id.test_result_overview_comp_score_title);
                this.f9196g = (TextView) view.findViewById(C2656R.C2657id.test_result_overview_comp_score_txt);
                this.f9197h = (TextView) view.findViewById(C2656R.C2657id.test_result_overview_comp_success_rate_title);
                this.f9198i = (TextView) view.findViewById(C2656R.C2657id.test_result_overview_comp_success_rate_txt);
                this.f9199j = (TextView) view.findViewById(C2656R.C2657id.test_result_overview_comp_time_title);
                this.f9200k = (TextView) view.findViewById(C2656R.C2657id.test_result_overview_comp_time_txt);
                this.f9201l = (TextView) view.findViewById(C2656R.C2657id.test_result_overview_comp_depth_title);
                this.f9202m = (TextView) view.findViewById(C2656R.C2657id.test_result_overview_comp_depth_txt);
                this.f9203n = (TextView) view.findViewById(C2656R.C2657id.test_result_overview_breath_score_title);
                this.f9204o = (TextView) view.findViewById(C2656R.C2657id.test_result_overview_breath_score_txt);
                this.f9205p = (TextView) view.findViewById(C2656R.C2657id.test_result_overview_breath_success_rate_title);
                this.f9206q = (TextView) view.findViewById(C2656R.C2657id.test_result_overview_breath_success_rate_txt);
                this.f9207r = (TextView) view.findViewById(C2656R.C2657id.test_result_overview_breath_amount_title);
                this.f9208s = (TextView) view.findViewById(C2656R.C2657id.test_result_overview_breath_amount_txt);
                this.f9209t = (TextView) view.findViewById(C2656R.C2657id.test_result_overview_hot_score_title);
                this.f9210u = (TextView) view.findViewById(C2656R.C2657id.test_result_overview_hot_score_txt);
                this.f9211v = (TextView) view.findViewById(C2656R.C2657id.test_result_overview_hot_time_txt);
                this.f9212w = (TextView) view.findViewById(C2656R.C2657id.test_result_overview_cpm_txt);
                this.f9213x = (TextView) view.findViewById(C2656R.C2657id.test_result_overview_compression_position_title);
                this.f9214y[0] = (ImageView) view.findViewById(C2656R.C2657id.test_result_overview_compression_position_h);
                this.f9214y[1] = (ImageView) view.findViewById(C2656R.C2657id.test_result_overview_compression_position_la);
                this.f9214y[2] = (ImageView) view.findViewById(C2656R.C2657id.test_result_overview_compression_position_s);
                this.f9214y[3] = (ImageView) view.findViewById(C2656R.C2657id.test_result_overview_compression_position_ra);
                this.f9214y[4] = (ImageView) view.findViewById(C2656R.C2657id.test_result_overview_compression_position_c);
                this.f9215z[0] = (TextView) view.findViewById(C2656R.C2657id.test_result_overview_compression_position_h_txt);
                this.f9215z[1] = (TextView) view.findViewById(C2656R.C2657id.test_result_overview_compression_position_la_txt);
                this.f9215z[2] = (TextView) view.findViewById(C2656R.C2657id.test_result_overview_compression_position_s_txt);
                this.f9215z[3] = (TextView) view.findViewById(C2656R.C2657id.test_result_overview_compression_position_ra_txt);
                this.f9215z[4] = (TextView) view.findViewById(C2656R.C2657id.test_result_overview_compression_position_c_txt);
                this.f9188A = (ScalableLayout) view.findViewById(C2656R.C2657id.test_result_overview_child_scroll_sc);
            }

            /* renamed from: a */
            public void mo9206a() {
                double d;
                double d2;
                double d3;
                double d4;
                double d5;
                double d6;
                C2591b bVar = C2556x.f9807x[C2465bl.f8800b];
                int round = (int) Math.round(bVar.mo9904j() * 100.0d);
                this.f9192c.setText(C2557y.f9835g.f10362dx);
                this.f9193d.setText(round + "");
                if (round >= 70) {
                    this.f9191b.setImageResource(C2656R.drawable.img_test_result_box_green);
                } else if (round > 0) {
                    this.f9191b.setImageResource(C2656R.drawable.img_test_result_box_yellow);
                } else {
                    this.f9191b.setImageResource(C2656R.drawable.img_test_result_box_red);
                }
                this.f9194e.setText(C2557y.f9835g.f10569hz);
                int round2 = (int) Math.round(bVar.mo9898g() * 100.0d);
                int round3 = (int) Math.round(bVar.mo9900h() * 100.0d);
                int round4 = (int) Math.round(bVar.mo9902i() * 100.0d);
                this.f9195f.setText(C2557y.f9835g.f10147U);
                this.f9197h.setText(C2557y.f9835g.f10541hQ);
                this.f9199j.setText(C2557y.f9835g.f10185af + "\n(CPM*)");
                this.f9201l.setText(C2557y.f9835g.f10188ai + "\n(cm)");
                this.f9203n.setText(C2557y.f9835g.f10148V);
                this.f9205p.setText(C2557y.f9835g.f10541hQ);
                this.f9207r.setText(C2557y.f9835g.f10572k + "\n(ml)");
                this.f9209t.setText(C2557y.f9835g.f10184ae);
                this.f9213x.setText(C2557y.f9835g.f10314dB);
                if (round2 == -100) {
                    this.f9196g.setText("-");
                } else {
                    this.f9196g.setText(round2 + "");
                }
                if (round3 == -100) {
                    this.f9204o.setText("-");
                } else {
                    this.f9204o.setText(round3 + "");
                }
                if (round4 == -100) {
                    this.f9210u.setText("-");
                } else {
                    this.f9210u.setText(round4 + "");
                }
                this.f9212w.setText(C2557y.f9835g.f10542hR);
                C2552t a = C2557y.f9832d.clone();
                if (C2465bl.f8801c != null && C2465bl.f8801c.size() > 0) {
                    a = C2465bl.f8801c.get(0).mo9310b();
                }
                switch (a.f9747c) {
                    case 1:
                        switch (a.f9755k) {
                            case 1:
                            case 2:
                            case 3:
                            case 7:
                                d5 = 5.0d;
                                d6 = 6.0d;
                                break;
                            case 4:
                            case 5:
                            case 6:
                            case 8:
                                d5 = 5.0d;
                                d6 = 100.0d;
                                break;
                            case 9:
                                d5 = 4.0d;
                                d6 = 6.0d;
                                break;
                            case 10:
                                d5 = 4.0d;
                                d6 = 100.0d;
                                break;
                            default:
                                d6 = 6.0d;
                                d5 = 5.0d;
                                break;
                        }
                        d = 700.0d;
                        d2 = 400.0d;
                        d3 = d6;
                        d4 = d5;
                        break;
                    case 2:
                        d = 350.0d;
                        d2 = 140.0d;
                        d3 = 5.0d;
                        d4 = 4.0d;
                        break;
                    default:
                        d2 = 400.0d;
                        d3 = 6.0d;
                        d4 = 5.0d;
                        d = 700.0d;
                        break;
                }
                int d7 = C2556x.f9805v[C2465bl.f8800b].mo9977d();
                ArrayList<C2614s> b = C2556x.f9805v[C2465bl.f8800b].mo9974b();
                double d8 = 0.0d;
                int i = 0;
                double d9 = 0.0d;
                int[] iArr = new int[5];
                for (int i2 = 0; i2 < 5; i2++) {
                    iArr[i2] = 0;
                }
                this.f9188A.setScaleWidth((float) (d7 * C1644a.C1650a.f5539b));
                this.f9188A.removeAllViews();
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                double d10 = 0.0d;
                int i7 = 0;
                while (i7 < d7) {
                    C2614s sVar = b.get(i7);
                    int c = i4 + sVar.mo9986c();
                    int a2 = i3 + sVar.mo9979a();
                    int j = i6 + sVar.mo9993j();
                    int i8 = i5 + sVar.mo9992i();
                    int[] d11 = sVar.mo9987d();
                    iArr[0] = iArr[0] + d11[0];
                    iArr[1] = iArr[1] + d11[1];
                    iArr[2] = iArr[2] + d11[2];
                    iArr[3] = d11[3] + iArr[3];
                    iArr[4] = iArr[4] + sVar.mo9991h();
                    Log.e("POS0", sVar.mo9987d().toString());
                    double b2 = d10 + sVar.mo9984b();
                    double l = d8 + ((sVar.mo9995l() / 10.0d) * ((double) sVar.mo9991h()));
                    int n = (int) (((double) i) + (sVar.mo9997n() * ((double) sVar.mo9992i())));
                    double k = i7 < d7 + -1 ? sVar.mo9994k() + d9 : d9;
                    TextView textView = new TextView(C2488bp.this.getActivity());
                    textView.setGravity(17);
                    textView.setText(String.format("%d", new Object[]{Integer.valueOf(i7 + 1)}));
                    this.f9188A.mo10058a((View) textView, (float) (i7 * C1644a.C1650a.f5539b), 0.0f, 250.0f, 136.0f);
                    this.f9188A.mo10059a(textView, 45.0f);
                    TextView textView2 = new TextView(C2488bp.this.getActivity());
                    textView2.setGravity(17);
                    if (round2 == -100) {
                        textView2.setText("-");
                    } else {
                        textView2.setText(String.format("%d/%d", new Object[]{Integer.valueOf(sVar.mo9986c()), Integer.valueOf(sVar.mo9979a())}));
                    }
                    this.f9188A.mo10058a((View) textView2, (float) (i7 * C1644a.C1650a.f5539b), 150.0f, 250.0f, 100.0f);
                    this.f9188A.mo10059a(textView2, 45.0f);
                    TextView textView3 = new TextView(C2488bp.this.getActivity());
                    textView3.setGravity(17);
                    if (round2 == -100) {
                        textView3.setText("-");
                        textView3.setTextColor(-10658467);
                    } else {
                        textView3.setText(String.format("%.1fs\n(%d)", new Object[]{Double.valueOf(sVar.mo9984b()), Integer.valueOf((int) sVar.mo9996m())}));
                        if (sVar.mo9996m() < 100.0d || sVar.mo9996m() > 120.0d) {
                            textView3.setTextColor(-764642);
                        } else {
                            textView3.setTextColor(-10658467);
                        }
                    }
                    this.f9188A.mo10058a((View) textView3, (float) (i7 * C1644a.C1650a.f5539b), 250.0f, 250.0f, 160.0f);
                    this.f9188A.mo10059a(textView3, 45.0f);
                    TextView textView4 = new TextView(C2488bp.this.getActivity());
                    textView4.setGravity(17);
                    if (round2 == -100) {
                        textView4.setText("-");
                        textView4.setTextColor(-10658467);
                    } else {
                        textView4.setText(String.format("%.1f", new Object[]{Double.valueOf(sVar.mo9995l() / 10.0d)}));
                        if (sVar.mo9995l() / 10.0d < d4) {
                            textView4.setTextColor(-764642);
                        } else if (sVar.mo9995l() / 10.0d <= d3) {
                            textView4.setTextColor(-10658467);
                        } else {
                            textView4.setTextColor(-12964);
                        }
                    }
                    this.f9188A.mo10058a((View) textView4, (float) (i7 * C1644a.C1650a.f5539b), 410.0f, 250.0f, 160.0f);
                    this.f9188A.mo10059a(textView4, 45.0f);
                    TextView textView5 = new TextView(C2488bp.this.getActivity());
                    textView5.setGravity(17);
                    if (round3 == -100) {
                        textView5.setText("-");
                    } else {
                        textView5.setText(String.format("%d/%d", new Object[]{Integer.valueOf(sVar.mo9993j()), Integer.valueOf(sVar.mo9992i())}));
                    }
                    this.f9188A.mo10058a((View) textView5, (float) (i7 * C1644a.C1650a.f5539b), 590.0f, 250.0f, 160.0f);
                    this.f9188A.mo10059a(textView5, 45.0f);
                    TextView textView6 = new TextView(C2488bp.this.getActivity());
                    textView6.setGravity(17);
                    if (round3 == -100) {
                        textView6.setText("-");
                        textView6.setTextColor(-10658467);
                    } else {
                        textView6.setText(String.format("%d", new Object[]{Integer.valueOf((int) sVar.mo9997n())}));
                        if (sVar.mo9997n() < d2) {
                            textView6.setTextColor(-764642);
                        } else if (sVar.mo9997n() <= d) {
                            textView6.setTextColor(-10658467);
                        } else {
                            textView6.setTextColor(-12964);
                        }
                    }
                    this.f9188A.mo10058a((View) textView6, (float) (i7 * C1644a.C1650a.f5539b), 750.0f, 250.0f, 160.0f);
                    this.f9188A.mo10059a(textView6, 45.0f);
                    if (i7 < d7 - 1) {
                        TextView textView7 = new TextView(C2488bp.this.getActivity());
                        textView7.setGravity(17);
                        textView7.setText(String.format("%.1fs", new Object[]{Double.valueOf(sVar.mo9994k())}));
                        if (sVar.mo9994k() <= 10.0d) {
                            textView7.setTextColor(-10658467);
                        } else {
                            textView7.setTextColor(-764642);
                        }
                        this.f9188A.mo10058a((View) textView7, (float) ((i7 * C1644a.C1650a.f5539b) + 125), 916.0f, 250.0f, 310.0f);
                        this.f9188A.mo10059a(textView7, 45.0f);
                    }
                    i7++;
                    d9 = k;
                    i = n;
                    d8 = l;
                    d10 = b2;
                    i5 = i8;
                    i3 = a2;
                    i4 = c;
                    i6 = j;
                }
                if (i3 != 0) {
                    this.f9198i.setText(String.format("%d", new Object[]{Integer.valueOf((i4 * 100) / i3)}) + "%");
                    this.f9200k.setText(String.format("%.1fs\n(%d)", new Object[]{Double.valueOf(d10 / ((double) d7)), Integer.valueOf((int) (((double) (i3 * 60)) / d10))}));
                    if (((double) (i3 * 60)) / d10 < 100.0d || ((double) (i3 * 60)) / d10 > 120.0d) {
                        this.f9200k.setTextColor(-764642);
                    } else {
                        this.f9200k.setTextColor(-10658467);
                    }
                } else {
                    this.f9198i.setText(String.format("%d", new Object[]{0}) + "%");
                    this.f9200k.setText(String.format("%.1fs\n(%d)", new Object[]{Float.valueOf(0.0f), 0}));
                    this.f9200k.setTextColor(-764642);
                }
                if (iArr[4] != 0) {
                    this.f9202m.setText(String.format("%.1f", new Object[]{Double.valueOf(d8 / ((double) iArr[4]))}));
                    if (d8 / ((double) iArr[4]) < d4) {
                        this.f9202m.setTextColor(-764642);
                    } else if (d8 / ((double) iArr[4]) <= d3) {
                        this.f9202m.setTextColor(-10658467);
                    } else {
                        this.f9202m.setTextColor(-12964);
                    }
                } else {
                    this.f9202m.setText(String.format("%.1f", new Object[]{Float.valueOf(0.0f)}));
                    this.f9202m.setTextColor(-764642);
                }
                if (i5 != 0) {
                    this.f9206q.setText(String.format("%d", new Object[]{Integer.valueOf((i6 * 100) / i5)}) + "%");
                    this.f9208s.setText(String.format("%d", new Object[]{Integer.valueOf(i / i5)}));
                    if (((double) (i / i5)) < d2) {
                        this.f9208s.setTextColor(-764642);
                    } else if (((double) (i / i5)) <= d) {
                        this.f9208s.setTextColor(-10658467);
                    } else {
                        this.f9208s.setTextColor(-12964);
                    }
                } else {
                    this.f9206q.setText(String.format("%d", new Object[]{0}) + "%");
                    this.f9208s.setText(String.format("%d", new Object[]{0}));
                    this.f9208s.setTextColor(-764642);
                }
                if (d7 >= 2) {
                    d9 /= (double) (d7 - 1);
                }
                this.f9211v.setText(String.format("%.1fs", new Object[]{Double.valueOf(d9)}));
                if (d9 <= 10.0d) {
                    this.f9211v.setTextColor(-10658467);
                } else {
                    this.f9211v.setTextColor(-764642);
                }
                int[] iArr2 = new int[5];
                if (i3 != 0) {
                    int i9 = 0;
                    while (true) {
                        int i10 = i9;
                        if (i10 < 5) {
                            iArr2[i10] = (iArr[i10] * 100) / i3;
                            float min = Math.min((((float) iArr2[i10]) / 100.0f) + 0.2f, 1.0f);
                            if (iArr2[i10] == 0) {
                                min = 0.0f;
                            }
                            this.f9214y[i10].setAlpha(min);
                            this.f9215z[i10].setText(iArr2[i10] + "%");
                            i9 = i10 + 1;
                        }
                    }
                } else {
                    for (int i11 = 0; i11 < 5; i11++) {
                        iArr2[i11] = 0;
                        this.f9214y[i11].setAlpha(0.0f);
                        this.f9215z[i11].setText(iArr2[i11] + "%");
                    }
                }
                this.f9190a.scrollTo(0, 0);
            }

            /* renamed from: b */
            public void mo9207b() {
                this.f9190a.setVisibility(0);
            }

            /* renamed from: c */
            public void mo9208c() {
                this.f9190a.setVisibility(4);
            }
        }

        public C2491b(View view) {
            this.f9043m = view;
            this.f9041k = new C2506b(view);
            this.f9042l = new C2495a(view);
            this.f9031a = (ScalableLayout) view.findViewById(C2656R.C2657id.test_result_sc);
            this.f9032b = (ImageView) view.findViewById(C2656R.C2657id.test_result_pause_btn);
            this.f9033c = (TextView) view.findViewById(C2656R.C2657id.test_result_title_txt);
            this.f9034d = (TextView) view.findViewById(C2656R.C2657id.test_result_timer_txt);
            this.f9035e = (ImageView) view.findViewById(C2656R.C2657id.test_result_guideline_img);
            this.f9036f = (TextView) view.findViewById(C2656R.C2657id.test_result_overview_btn);
            this.f9037g = (TextView) view.findViewById(C2656R.C2657id.test_result_detail_btn);
            this.f9038h = (TextView) view.findViewById(C2656R.C2657id.test_result_name_txt);
            this.f9039i = (TextView) view.findViewById(C2656R.C2657id.test_result_pass_btn);
            this.f9040j = (TextView) view.findViewById(C2656R.C2657id.test_result_nr_btn);
            this.f9044n = (ScalableLayout) view.findViewById(C2656R.C2657id.test_result_saving_sc);
            this.f9045o = (ImageView) view.findViewById(C2656R.C2657id.test_result_saving_img1);
            this.f9046p = (TextView) view.findViewById(C2656R.C2657id.test_result_saving_txt);
            this.f9031a.setOnClickListener(this);
            this.f9032b.setOnClickListener(this);
            this.f9039i.setOnClickListener(this);
            this.f9040j.setOnClickListener(this);
            this.f9044n.setOnClickListener(this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo9156a() {
            C2553u a = C2465bl.f8801c.get(0).mo9306a();
            C2552t b = C2465bl.f8801c.get(0).mo9310b();
            this.f9039i.setOnClickListener(this);
            this.f9040j.setOnClickListener(this);
            String str = "";
            switch (b.f9747c) {
                case 1:
                    str = C2557y.f9835g.f10581t.toUpperCase();
                    break;
                case 2:
                    str = C2557y.f9835g.f10272cM.toUpperCase();
                    break;
                case 3:
                    str = C2557y.f9835g.f10582u.toUpperCase();
                    break;
            }
            this.f9033c.setText(a.mo9718c() + " " + str);
            int i = (int) (C2465bl.f8805g - C2465bl.f8804f);
            this.f9034d.setText(String.format("%02d:%02d.%02d", new Object[]{Integer.valueOf((i / 1000) / 60), Integer.valueOf((i / 1000) % 60), Integer.valueOf((i % 1000) / 10)}));
            this.f9036f.setText(C2557y.f9835g.f10540hP);
            this.f9037g.setText(C2557y.f9835g.f10358dt);
            this.f9038h.setText(a.mo9718c() + " | " + str);
            this.f9039i.setText(C2557y.f9835g.f10139M);
            this.f9040j.setText(C2557y.f9835g.f10225bS);
            new C2204e(this.f9045o);
            C2243l.m12748a(C2488bp.this.getActivity()).mo8393a(Integer.valueOf(C2656R.raw.img_test_save_data)).mo7603a(this.f9045o);
            this.f9044n.setVisibility(4);
            this.f9046p.setText(C2557y.f9835g.f10529hE);
            switch (b.f9755k) {
                case 1:
                case 4:
                    this.f9035e.setImageResource(C2656R.drawable.img_mark_aha);
                    break;
                case 2:
                case 5:
                    this.f9035e.setImageResource(C2656R.drawable.img_mark_erc);
                    break;
                case 3:
                case 6:
                    this.f9035e.setImageResource(C2656R.drawable.img_mark_anzcor);
                    break;
                case 7:
                case 8:
                    this.f9035e.setImageResource(C2656R.drawable.img_mark_kacpr_full);
                    break;
                case 9:
                case 10:
                    this.f9035e.setImageResource(C2656R.drawable.srac_logo);
                    break;
            }
            this.f9042l.mo9167a();
            switch (b.f9747c) {
                case 1:
                case 2:
                    this.f9041k.mo9206a();
                    mo9161e();
                    this.f9036f.setOnClickListener(this);
                    this.f9037g.setOnClickListener(this);
                    return;
                case 3:
                    mo9162f();
                    mo9160d();
                    this.f9036f.setOnClickListener((View.OnClickListener) null);
                    this.f9037g.setOnClickListener((View.OnClickListener) null);
                    return;
                default:
                    return;
            }
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo9157a(com.imlabworld.HS_Instructor.C2527bs r21) {
            /*
                r20 = this;
                r0 = r20
                android.view.View r2 = r0.f9043m     // Catch:{ Exception -> 0x0326 }
                r3 = 2131231940(0x7f0804c4, float:1.8079975E38)
                android.view.View r2 = r2.findViewById(r3)     // Catch:{ Exception -> 0x0326 }
                com.imlabworld.HS_Instructor.t r3 = r21.mo9310b()     // Catch:{ Exception -> 0x0326 }
                int r3 = r3.f9748d     // Catch:{ Exception -> 0x0326 }
                switch(r3) {
                    case 1: goto L_0x02eb;
                    case 2: goto L_0x02c7;
                    default: goto L_0x0014;
                }     // Catch:{ Exception -> 0x0326 }
            L_0x0014:
                r9 = r2
            L_0x0015:
                java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x0326 }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0326 }
                r3.<init>()     // Catch:{ Exception -> 0x0326 }
                java.io.File r4 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ Exception -> 0x0326 }
                java.io.File r4 = r4.getAbsoluteFile()     // Catch:{ Exception -> 0x0326 }
                java.lang.StringBuilder r3 = r3.append(r4)     // Catch:{ Exception -> 0x0326 }
                java.lang.String r4 = "/HeartiSense/pdf/"
                java.lang.StringBuilder r3 = r3.append(r4)     // Catch:{ Exception -> 0x0326 }
                java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0326 }
                r2.<init>(r3)     // Catch:{ Exception -> 0x0326 }
                r2.mkdirs()     // Catch:{ Exception -> 0x0326 }
                java.text.SimpleDateFormat r3 = new java.text.SimpleDateFormat     // Catch:{ Exception -> 0x0326 }
                java.lang.String r2 = "yyMMdd_HHmmss"
                r3.<init>(r2)     // Catch:{ Exception -> 0x0326 }
                java.util.Date r4 = new java.util.Date     // Catch:{ Exception -> 0x0326 }
                long r6 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0326 }
                r4.<init>(r6)     // Catch:{ Exception -> 0x0326 }
                com.imlabworld.HS_Instructor.u r2 = r21.mo9306a()     // Catch:{ Exception -> 0x0326 }
                java.lang.String r2 = r2.mo9718c()     // Catch:{ Exception -> 0x0326 }
                java.lang.String r5 = ""
                boolean r2 = r2.equals(r5)     // Catch:{ Exception -> 0x0326 }
                if (r2 == 0) goto L_0x0312
                java.lang.String r2 = "User"
                r8 = r2
            L_0x005b:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0326 }
                r2.<init>()     // Catch:{ Exception -> 0x0326 }
                java.lang.String r5 = "HS_"
                java.lang.StringBuilder r2 = r2.append(r5)     // Catch:{ Exception -> 0x0326 }
                java.lang.String r3 = r3.format(r4)     // Catch:{ Exception -> 0x0326 }
                java.lang.StringBuilder r2 = r2.append(r3)     // Catch:{ Exception -> 0x0326 }
                java.lang.String r3 = "_"
                java.lang.StringBuilder r2 = r2.append(r3)     // Catch:{ Exception -> 0x0326 }
                java.lang.StringBuilder r2 = r2.append(r8)     // Catch:{ Exception -> 0x0326 }
                java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0326 }
                java.io.File r10 = new java.io.File     // Catch:{ Exception -> 0x0326 }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0326 }
                r3.<init>()     // Catch:{ Exception -> 0x0326 }
                java.io.File r4 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ Exception -> 0x0326 }
                java.io.File r4 = r4.getAbsoluteFile()     // Catch:{ Exception -> 0x0326 }
                java.lang.StringBuilder r3 = r3.append(r4)     // Catch:{ Exception -> 0x0326 }
                java.lang.String r4 = "/HeartiSense/Pdf/"
                java.lang.StringBuilder r3 = r3.append(r4)     // Catch:{ Exception -> 0x0326 }
                java.lang.StringBuilder r2 = r3.append(r2)     // Catch:{ Exception -> 0x0326 }
                java.lang.String r3 = ".pdf"
                java.lang.StringBuilder r2 = r2.append(r3)     // Catch:{ Exception -> 0x0326 }
                java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0326 }
                r10.<init>(r2)     // Catch:{ Exception -> 0x0326 }
                android.print.PrintAttributes$Builder r2 = new android.print.PrintAttributes$Builder     // Catch:{ Exception -> 0x0326 }
                r2.<init>()     // Catch:{ Exception -> 0x0326 }
                r3 = 2
                android.print.PrintAttributes$Builder r2 = r2.setColorMode(r3)     // Catch:{ Exception -> 0x0326 }
                android.print.PrintAttributes$MediaSize r3 = android.print.PrintAttributes.MediaSize.ISO_A4     // Catch:{ Exception -> 0x0326 }
                android.print.PrintAttributes$Builder r2 = r2.setMediaSize(r3)     // Catch:{ Exception -> 0x0326 }
                android.print.PrintAttributes$Resolution r3 = new android.print.PrintAttributes$Resolution     // Catch:{ Exception -> 0x0326 }
                java.lang.String r4 = "zooey"
                java.lang.String r5 = "print"
                r6 = 300(0x12c, float:4.2E-43)
                r7 = 300(0x12c, float:4.2E-43)
                r3.<init>(r4, r5, r6, r7)     // Catch:{ Exception -> 0x0326 }
                android.print.PrintAttributes$Builder r2 = r2.setResolution(r3)     // Catch:{ Exception -> 0x0326 }
                android.print.PrintAttributes$Margins r3 = android.print.PrintAttributes.Margins.NO_MARGINS     // Catch:{ Exception -> 0x0326 }
                android.print.PrintAttributes$Builder r2 = r2.setMinMargins(r3)     // Catch:{ Exception -> 0x0326 }
                android.print.PrintAttributes r2 = r2.build()     // Catch:{ Exception -> 0x0326 }
                android.print.pdf.PrintedPdfDocument r11 = new android.print.pdf.PrintedPdfDocument     // Catch:{ Exception -> 0x0326 }
                r0 = r20
                com.imlabworld.HS_Instructor.bp r3 = com.imlabworld.HS_Instructor.C2488bp.this     // Catch:{ Exception -> 0x0326 }
                android.app.Activity r3 = r3.getActivity()     // Catch:{ Exception -> 0x0326 }
                r11.<init>(r3, r2)     // Catch:{ Exception -> 0x0326 }
                android.graphics.pdf.PdfDocument$PageInfo$Builder r2 = new android.graphics.pdf.PdfDocument$PageInfo$Builder     // Catch:{ Exception -> 0x0326 }
                int r3 = r9.getMeasuredWidth()     // Catch:{ Exception -> 0x0326 }
                int r4 = r9.getMeasuredHeight()     // Catch:{ Exception -> 0x0326 }
                r5 = 1
                r2.<init>(r3, r4, r5)     // Catch:{ Exception -> 0x0326 }
                android.graphics.pdf.PdfDocument$PageInfo r2 = r2.create()     // Catch:{ Exception -> 0x0326 }
                android.graphics.pdf.PdfDocument$Page r12 = r11.startPage(r2)     // Catch:{ Exception -> 0x0326 }
                if (r12 == 0) goto L_0x037e
                java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat     // Catch:{ Exception -> 0x0326 }
                java.lang.String r3 = "dd/MM/yyyy HH:mm:ss"
                r2.<init>(r3)     // Catch:{ Exception -> 0x0326 }
                com.imlabworld.HS_Instructor.t r3 = r21.mo9310b()     // Catch:{ Exception -> 0x0326 }
                int r3 = r3.f9756l     // Catch:{ Exception -> 0x0326 }
                switch(r3) {
                    case 1: goto L_0x031d;
                    case 2: goto L_0x0331;
                    case 3: goto L_0x033a;
                    default: goto L_0x0106;
                }     // Catch:{ Exception -> 0x0326 }
            L_0x0106:
                java.text.SimpleDateFormat r3 = new java.text.SimpleDateFormat     // Catch:{ Exception -> 0x0326 }
                java.lang.String r4 = "yyyy"
                r3.<init>(r4)     // Catch:{ Exception -> 0x0326 }
                java.text.SimpleDateFormat r4 = new java.text.SimpleDateFormat     // Catch:{ Exception -> 0x0326 }
                java.lang.String r5 = "MM"
                r4.<init>(r5)     // Catch:{ Exception -> 0x0326 }
                java.text.SimpleDateFormat r5 = new java.text.SimpleDateFormat     // Catch:{ Exception -> 0x0326 }
                java.lang.String r6 = "dd"
                r5.<init>(r6)     // Catch:{ Exception -> 0x0326 }
                java.util.Date r6 = new java.util.Date     // Catch:{ Exception -> 0x0326 }
                long r14 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0326 }
                r6.<init>(r14)     // Catch:{ Exception -> 0x0326 }
                java.lang.String r13 = r2.format(r6)     // Catch:{ Exception -> 0x0326 }
                java.lang.String r14 = r3.format(r6)     // Catch:{ Exception -> 0x0326 }
                java.lang.String r15 = r4.format(r6)     // Catch:{ Exception -> 0x0326 }
                java.lang.String r16 = r5.format(r6)     // Catch:{ Exception -> 0x0326 }
                com.imlabworld.HS_Instructor.t r2 = r21.mo9310b()     // Catch:{ Exception -> 0x0326 }
                int r2 = r2.f9748d     // Catch:{ Exception -> 0x0326 }
                r3 = 2
                if (r2 != r3) goto L_0x0520
                com.imlabworld.HS_Instructor.t r2 = r21.mo9310b()     // Catch:{ Exception -> 0x0326 }
                int r2 = r2.f9747c     // Catch:{ Exception -> 0x0326 }
                r3 = 1
                if (r2 == r3) goto L_0x014f
                com.imlabworld.HS_Instructor.t r2 = r21.mo9310b()     // Catch:{ Exception -> 0x0326 }
                int r2 = r2.f9747c     // Catch:{ Exception -> 0x0326 }
                r3 = 2
                if (r2 != r3) goto L_0x03a6
            L_0x014f:
                r2 = 4
                r3 = 5
                int[] r2 = new int[]{r2, r3}     // Catch:{ Exception -> 0x0326 }
                java.lang.Class<android.widget.ImageView> r3 = android.widget.ImageView.class
                java.lang.Object r2 = java.lang.reflect.Array.newInstance(r3, r2)     // Catch:{ Exception -> 0x0326 }
                android.widget.ImageView[][] r2 = (android.widget.ImageView[][]) r2     // Catch:{ Exception -> 0x0326 }
                r3 = 2
                android.widget.ImageView[] r14 = new android.widget.ImageView[r3]     // Catch:{ Exception -> 0x0326 }
                r3 = 4
                int[] r15 = new int[r3]     // Catch:{ Exception -> 0x0326 }
                r3 = 2131231959(0x7f0804d7, float:1.8080014E38)
                android.view.View r3 = r9.findViewById(r3)     // Catch:{ Exception -> 0x0326 }
                android.widget.TextView r3 = (android.widget.TextView) r3     // Catch:{ Exception -> 0x0326 }
                r4 = 2131231958(0x7f0804d6, float:1.8080012E38)
                android.view.View r4 = r9.findViewById(r4)     // Catch:{ Exception -> 0x0326 }
                android.widget.TextView r4 = (android.widget.TextView) r4     // Catch:{ Exception -> 0x0326 }
                r5 = 0
                r6 = r2[r5]     // Catch:{ Exception -> 0x0326 }
                r7 = 0
                r5 = 2131231942(0x7f0804c6, float:1.807998E38)
                android.view.View r5 = r9.findViewById(r5)     // Catch:{ Exception -> 0x0326 }
                android.widget.ImageView r5 = (android.widget.ImageView) r5     // Catch:{ Exception -> 0x0326 }
                r6[r7] = r5     // Catch:{ Exception -> 0x0326 }
                r5 = 0
                r6 = r2[r5]     // Catch:{ Exception -> 0x0326 }
                r7 = 1
                r5 = 2131231943(0x7f0804c7, float:1.8079981E38)
                android.view.View r5 = r9.findViewById(r5)     // Catch:{ Exception -> 0x0326 }
                android.widget.ImageView r5 = (android.widget.ImageView) r5     // Catch:{ Exception -> 0x0326 }
                r6[r7] = r5     // Catch:{ Exception -> 0x0326 }
                r5 = 0
                r6 = r2[r5]     // Catch:{ Exception -> 0x0326 }
                r7 = 2
                r5 = 2131231944(0x7f0804c8, float:1.8079983E38)
                android.view.View r5 = r9.findViewById(r5)     // Catch:{ Exception -> 0x0326 }
                android.widget.ImageView r5 = (android.widget.ImageView) r5     // Catch:{ Exception -> 0x0326 }
                r6[r7] = r5     // Catch:{ Exception -> 0x0326 }
                r5 = 0
                r6 = r2[r5]     // Catch:{ Exception -> 0x0326 }
                r7 = 3
                r5 = 2131231945(0x7f0804c9, float:1.8079985E38)
                android.view.View r5 = r9.findViewById(r5)     // Catch:{ Exception -> 0x0326 }
                android.widget.ImageView r5 = (android.widget.ImageView) r5     // Catch:{ Exception -> 0x0326 }
                r6[r7] = r5     // Catch:{ Exception -> 0x0326 }
                r5 = 1
                r6 = r2[r5]     // Catch:{ Exception -> 0x0326 }
                r7 = 0
                r5 = 2131231946(0x7f0804ca, float:1.8079987E38)
                android.view.View r5 = r9.findViewById(r5)     // Catch:{ Exception -> 0x0326 }
                android.widget.ImageView r5 = (android.widget.ImageView) r5     // Catch:{ Exception -> 0x0326 }
                r6[r7] = r5     // Catch:{ Exception -> 0x0326 }
                r5 = 1
                r6 = r2[r5]     // Catch:{ Exception -> 0x0326 }
                r7 = 1
                r5 = 2131231947(0x7f0804cb, float:1.807999E38)
                android.view.View r5 = r9.findViewById(r5)     // Catch:{ Exception -> 0x0326 }
                android.widget.ImageView r5 = (android.widget.ImageView) r5     // Catch:{ Exception -> 0x0326 }
                r6[r7] = r5     // Catch:{ Exception -> 0x0326 }
                r5 = 1
                r6 = r2[r5]     // Catch:{ Exception -> 0x0326 }
                r7 = 2
                r5 = 2131231948(0x7f0804cc, float:1.8079991E38)
                android.view.View r5 = r9.findViewById(r5)     // Catch:{ Exception -> 0x0326 }
                android.widget.ImageView r5 = (android.widget.ImageView) r5     // Catch:{ Exception -> 0x0326 }
                r6[r7] = r5     // Catch:{ Exception -> 0x0326 }
                r5 = 1
                r6 = r2[r5]     // Catch:{ Exception -> 0x0326 }
                r7 = 3
                r5 = 2131231949(0x7f0804cd, float:1.8079993E38)
                android.view.View r5 = r9.findViewById(r5)     // Catch:{ Exception -> 0x0326 }
                android.widget.ImageView r5 = (android.widget.ImageView) r5     // Catch:{ Exception -> 0x0326 }
                r6[r7] = r5     // Catch:{ Exception -> 0x0326 }
                r5 = 1
                r6 = r2[r5]     // Catch:{ Exception -> 0x0326 }
                r7 = 4
                r5 = 2131231950(0x7f0804ce, float:1.8079995E38)
                android.view.View r5 = r9.findViewById(r5)     // Catch:{ Exception -> 0x0326 }
                android.widget.ImageView r5 = (android.widget.ImageView) r5     // Catch:{ Exception -> 0x0326 }
                r6[r7] = r5     // Catch:{ Exception -> 0x0326 }
                r5 = 2
                r6 = r2[r5]     // Catch:{ Exception -> 0x0326 }
                r7 = 0
                r5 = 2131231951(0x7f0804cf, float:1.8079998E38)
                android.view.View r5 = r9.findViewById(r5)     // Catch:{ Exception -> 0x0326 }
                android.widget.ImageView r5 = (android.widget.ImageView) r5     // Catch:{ Exception -> 0x0326 }
                r6[r7] = r5     // Catch:{ Exception -> 0x0326 }
                r5 = 2
                r6 = r2[r5]     // Catch:{ Exception -> 0x0326 }
                r7 = 1
                r5 = 2131231952(0x7f0804d0, float:1.808E38)
                android.view.View r5 = r9.findViewById(r5)     // Catch:{ Exception -> 0x0326 }
                android.widget.ImageView r5 = (android.widget.ImageView) r5     // Catch:{ Exception -> 0x0326 }
                r6[r7] = r5     // Catch:{ Exception -> 0x0326 }
                r5 = 2
                r6 = r2[r5]     // Catch:{ Exception -> 0x0326 }
                r7 = 2
                r5 = 2131231953(0x7f0804d1, float:1.8080002E38)
                android.view.View r5 = r9.findViewById(r5)     // Catch:{ Exception -> 0x0326 }
                android.widget.ImageView r5 = (android.widget.ImageView) r5     // Catch:{ Exception -> 0x0326 }
                r6[r7] = r5     // Catch:{ Exception -> 0x0326 }
                r5 = 2
                r6 = r2[r5]     // Catch:{ Exception -> 0x0326 }
                r7 = 3
                r5 = 2131231954(0x7f0804d2, float:1.8080004E38)
                android.view.View r5 = r9.findViewById(r5)     // Catch:{ Exception -> 0x0326 }
                android.widget.ImageView r5 = (android.widget.ImageView) r5     // Catch:{ Exception -> 0x0326 }
                r6[r7] = r5     // Catch:{ Exception -> 0x0326 }
                r5 = 2
                r6 = r2[r5]     // Catch:{ Exception -> 0x0326 }
                r7 = 4
                r5 = 2131231955(0x7f0804d3, float:1.8080006E38)
                android.view.View r5 = r9.findViewById(r5)     // Catch:{ Exception -> 0x0326 }
                android.widget.ImageView r5 = (android.widget.ImageView) r5     // Catch:{ Exception -> 0x0326 }
                r6[r7] = r5     // Catch:{ Exception -> 0x0326 }
                r5 = 3
                r6 = r2[r5]     // Catch:{ Exception -> 0x0326 }
                r7 = 0
                r5 = 2131231956(0x7f0804d4, float:1.8080008E38)
                android.view.View r5 = r9.findViewById(r5)     // Catch:{ Exception -> 0x0326 }
                android.widget.ImageView r5 = (android.widget.ImageView) r5     // Catch:{ Exception -> 0x0326 }
                r6[r7] = r5     // Catch:{ Exception -> 0x0326 }
                r6 = 0
                r5 = 2131231957(0x7f0804d5, float:1.808001E38)
                android.view.View r5 = r9.findViewById(r5)     // Catch:{ Exception -> 0x0326 }
                android.widget.ImageView r5 = (android.widget.ImageView) r5     // Catch:{ Exception -> 0x0326 }
                r14[r6] = r5     // Catch:{ Exception -> 0x0326 }
                r6 = 1
                r5 = 2131231941(0x7f0804c5, float:1.8079977E38)
                android.view.View r5 = r9.findViewById(r5)     // Catch:{ Exception -> 0x0326 }
                android.widget.ImageView r5 = (android.widget.ImageView) r5     // Catch:{ Exception -> 0x0326 }
                r14[r6] = r5     // Catch:{ Exception -> 0x0326 }
                r5 = 2131231939(0x7f0804c3, float:1.8079973E38)
                android.view.View r5 = r9.findViewById(r5)     // Catch:{ Exception -> 0x0326 }
                android.widget.TextView r5 = (android.widget.TextView) r5     // Catch:{ Exception -> 0x0326 }
                r6 = 2131231938(0x7f0804c2, float:1.8079971E38)
                android.view.View r6 = r9.findViewById(r6)     // Catch:{ Exception -> 0x0326 }
                android.widget.TextView r6 = (android.widget.TextView) r6     // Catch:{ Exception -> 0x0326 }
                r7 = 0
                r16 = 4
                r15[r7] = r16     // Catch:{ Exception -> 0x0326 }
                r7 = 1
                r16 = 5
                r15[r7] = r16     // Catch:{ Exception -> 0x0326 }
                r7 = 2
                r16 = 5
                r15[r7] = r16     // Catch:{ Exception -> 0x0326 }
                r7 = 3
                r16 = 1
                r15[r7] = r16     // Catch:{ Exception -> 0x0326 }
                r3.setText(r8)     // Catch:{ Exception -> 0x0326 }
                r4.setText(r13)     // Catch:{ Exception -> 0x0326 }
                r3 = 0
                r7 = r3
            L_0x029c:
                int r3 = r15.length     // Catch:{ Exception -> 0x0326 }
                if (r7 >= r3) goto L_0x0352
                r3 = 0
                r4 = r3
            L_0x02a1:
                r3 = r15[r7]     // Catch:{ Exception -> 0x0326 }
                if (r4 >= r3) goto L_0x034d
                com.imlabworld.HS_Instructor.ac[] r3 = com.imlabworld.HS_Instructor.C2556x.f9806w     // Catch:{ Exception -> 0x0326 }
                int r8 = com.imlabworld.HS_Instructor.C2465bl.f8800b     // Catch:{ Exception -> 0x0326 }
                r3 = r3[r8]     // Catch:{ Exception -> 0x0326 }
                android.util.Pair<java.lang.Boolean, java.lang.Long>[][] r3 = r3.f7757b     // Catch:{ Exception -> 0x0326 }
                r3 = r3[r7]     // Catch:{ Exception -> 0x0326 }
                r3 = r3[r4]     // Catch:{ Exception -> 0x0326 }
                java.lang.Object r3 = r3.first     // Catch:{ Exception -> 0x0326 }
                java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ Exception -> 0x0326 }
                boolean r3 = r3.booleanValue()     // Catch:{ Exception -> 0x0326 }
                if (r3 == 0) goto L_0x0343
                r3 = r2[r7]     // Catch:{ Exception -> 0x0326 }
                r3 = r3[r4]     // Catch:{ Exception -> 0x0326 }
                r8 = 0
                r3.setVisibility(r8)     // Catch:{ Exception -> 0x0326 }
            L_0x02c3:
                int r3 = r4 + 1
                r4 = r3
                goto L_0x02a1
            L_0x02c7:
                com.imlabworld.HS_Instructor.t r3 = r21.mo9310b()     // Catch:{ Exception -> 0x0326 }
                int r3 = r3.f9747c     // Catch:{ Exception -> 0x0326 }
                switch(r3) {
                    case 1: goto L_0x02d3;
                    case 2: goto L_0x02d3;
                    case 3: goto L_0x02df;
                    default: goto L_0x02d0;
                }     // Catch:{ Exception -> 0x0326 }
            L_0x02d0:
                r9 = r2
                goto L_0x0015
            L_0x02d3:
                r0 = r20
                android.view.View r2 = r0.f9043m     // Catch:{ Exception -> 0x0326 }
                r3 = 2131231940(0x7f0804c4, float:1.8079975E38)
                android.view.View r2 = r2.findViewById(r3)     // Catch:{ Exception -> 0x0326 }
                goto L_0x02d0
            L_0x02df:
                r0 = r20
                android.view.View r2 = r0.f9043m     // Catch:{ Exception -> 0x0326 }
                r3 = 2131231986(0x7f0804f2, float:1.8080068E38)
                android.view.View r2 = r2.findViewById(r3)     // Catch:{ Exception -> 0x0326 }
                goto L_0x02d0
            L_0x02eb:
                com.imlabworld.HS_Instructor.t r3 = r21.mo9310b()     // Catch:{ Exception -> 0x0326 }
                int r3 = r3.f9747c     // Catch:{ Exception -> 0x0326 }
                switch(r3) {
                    case 1: goto L_0x02f6;
                    case 2: goto L_0x02f6;
                    case 3: goto L_0x0304;
                    default: goto L_0x02f4;
                }     // Catch:{ Exception -> 0x0326 }
            L_0x02f4:
                goto L_0x0014
            L_0x02f6:
                r0 = r20
                android.view.View r2 = r0.f9043m     // Catch:{ Exception -> 0x0326 }
                r3 = 2131231961(0x7f0804d9, float:1.8080018E38)
                android.view.View r2 = r2.findViewById(r3)     // Catch:{ Exception -> 0x0326 }
                r9 = r2
                goto L_0x0015
            L_0x0304:
                r0 = r20
                android.view.View r2 = r0.f9043m     // Catch:{ Exception -> 0x0326 }
                r3 = 2131232003(0x7f080503, float:1.8080103E38)
                android.view.View r2 = r2.findViewById(r3)     // Catch:{ Exception -> 0x0326 }
                r9 = r2
                goto L_0x0015
            L_0x0312:
                com.imlabworld.HS_Instructor.u r2 = r21.mo9306a()     // Catch:{ Exception -> 0x0326 }
                java.lang.String r2 = r2.mo9718c()     // Catch:{ Exception -> 0x0326 }
                r8 = r2
                goto L_0x005b
            L_0x031d:
                java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat     // Catch:{ Exception -> 0x0326 }
                java.lang.String r3 = "dd/MM/yyyy HH:mm:ss"
                r2.<init>(r3)     // Catch:{ Exception -> 0x0326 }
                goto L_0x0106
            L_0x0326:
                r2 = move-exception
                java.lang.String r3 = "pdfpdferror"
                java.lang.String r2 = r2.getMessage()
                android.util.Log.e(r3, r2)
            L_0x0330:
                return
            L_0x0331:
                java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat     // Catch:{ Exception -> 0x0326 }
                java.lang.String r3 = "MM/dd/yyyy HH:mm:ss"
                r2.<init>(r3)     // Catch:{ Exception -> 0x0326 }
                goto L_0x0106
            L_0x033a:
                java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat     // Catch:{ Exception -> 0x0326 }
                java.lang.String r3 = "yyyy/MM/dd HH:mm:ss"
                r2.<init>(r3)     // Catch:{ Exception -> 0x0326 }
                goto L_0x0106
            L_0x0343:
                r3 = r2[r7]     // Catch:{ Exception -> 0x0326 }
                r3 = r3[r4]     // Catch:{ Exception -> 0x0326 }
                r8 = 4
                r3.setVisibility(r8)     // Catch:{ Exception -> 0x0326 }
                goto L_0x02c3
            L_0x034d:
                int r3 = r7 + 1
                r7 = r3
                goto L_0x029c
            L_0x0352:
                com.imlabworld.HS_Instructor.ac[] r2 = com.imlabworld.HS_Instructor.C2556x.f9806w     // Catch:{ Exception -> 0x0326 }
                int r3 = com.imlabworld.HS_Instructor.C2465bl.f8800b     // Catch:{ Exception -> 0x0326 }
                r2 = r2[r3]     // Catch:{ Exception -> 0x0326 }
                int r2 = r2.f7770o     // Catch:{ Exception -> 0x0326 }
                r3 = 1
                if (r2 != r3) goto L_0x0397
                r2 = 0
                r2 = r14[r2]     // Catch:{ Exception -> 0x0326 }
                r3 = 0
                r2.setVisibility(r3)     // Catch:{ Exception -> 0x0326 }
                r2 = 1
                r2 = r14[r2]     // Catch:{ Exception -> 0x0326 }
                r3 = 4
                r2.setVisibility(r3)     // Catch:{ Exception -> 0x0326 }
            L_0x036b:
                com.imlabworld.HS_Instructor.n r2 = com.imlabworld.HS_Instructor.C2557y.f9811B     // Catch:{ Exception -> 0x0326 }
                java.lang.String r2 = r2.mo9549d()     // Catch:{ Exception -> 0x0326 }
                r5.setText(r2)     // Catch:{ Exception -> 0x0326 }
                r6.setText(r13)     // Catch:{ Exception -> 0x0326 }
            L_0x0377:
                android.graphics.Canvas r2 = r12.getCanvas()     // Catch:{ Exception -> 0x0326 }
                r9.draw(r2)     // Catch:{ Exception -> 0x0326 }
            L_0x037e:
                r11.finishPage(r12)     // Catch:{ Exception -> 0x0326 }
                java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0326 }
                r2.<init>(r10)     // Catch:{ Exception -> 0x0326 }
                r11.writeTo(r2)     // Catch:{ Exception -> 0x0326 }
                r11.close()     // Catch:{ Exception -> 0x0326 }
                r2.close()     // Catch:{ Exception -> 0x0326 }
                java.lang.String r2 = "pdfpdf"
                java.lang.String r3 = "done"
                android.util.Log.e(r2, r3)     // Catch:{ Exception -> 0x0326 }
                goto L_0x0330
            L_0x0397:
                r2 = 0
                r2 = r14[r2]     // Catch:{ Exception -> 0x0326 }
                r3 = 4
                r2.setVisibility(r3)     // Catch:{ Exception -> 0x0326 }
                r2 = 1
                r2 = r14[r2]     // Catch:{ Exception -> 0x0326 }
                r3 = 0
                r2.setVisibility(r3)     // Catch:{ Exception -> 0x0326 }
                goto L_0x036b
            L_0x03a6:
                r2 = 3
                r3 = 5
                int[] r2 = new int[]{r2, r3}     // Catch:{ Exception -> 0x0326 }
                java.lang.Class<android.widget.ImageView> r3 = android.widget.ImageView.class
                java.lang.Object r2 = java.lang.reflect.Array.newInstance(r3, r2)     // Catch:{ Exception -> 0x0326 }
                android.widget.ImageView[][] r2 = (android.widget.ImageView[][]) r2     // Catch:{ Exception -> 0x0326 }
                r3 = 2
                android.widget.ImageView[] r14 = new android.widget.ImageView[r3]     // Catch:{ Exception -> 0x0326 }
                r3 = 3
                int[] r15 = new int[r3]     // Catch:{ Exception -> 0x0326 }
                r3 = 2131232001(0x7f080501, float:1.8080099E38)
                android.view.View r3 = r9.findViewById(r3)     // Catch:{ Exception -> 0x0326 }
                android.widget.TextView r3 = (android.widget.TextView) r3     // Catch:{ Exception -> 0x0326 }
                r4 = 2131232000(0x7f080500, float:1.8080097E38)
                android.view.View r4 = r9.findViewById(r4)     // Catch:{ Exception -> 0x0326 }
                android.widget.TextView r4 = (android.widget.TextView) r4     // Catch:{ Exception -> 0x0326 }
                r5 = 0
                r6 = r2[r5]     // Catch:{ Exception -> 0x0326 }
                r7 = 0
                r5 = 2131231988(0x7f0804f4, float:1.8080073E38)
                android.view.View r5 = r9.findViewById(r5)     // Catch:{ Exception -> 0x0326 }
                android.widget.ImageView r5 = (android.widget.ImageView) r5     // Catch:{ Exception -> 0x0326 }
                r6[r7] = r5     // Catch:{ Exception -> 0x0326 }
                r5 = 0
                r6 = r2[r5]     // Catch:{ Exception -> 0x0326 }
                r7 = 1
                r5 = 2131231989(0x7f0804f5, float:1.8080075E38)
                android.view.View r5 = r9.findViewById(r5)     // Catch:{ Exception -> 0x0326 }
                android.widget.ImageView r5 = (android.widget.ImageView) r5     // Catch:{ Exception -> 0x0326 }
                r6[r7] = r5     // Catch:{ Exception -> 0x0326 }
                r5 = 0
                r6 = r2[r5]     // Catch:{ Exception -> 0x0326 }
                r7 = 2
                r5 = 2131231990(0x7f0804f6, float:1.8080077E38)
                android.view.View r5 = r9.findViewById(r5)     // Catch:{ Exception -> 0x0326 }
                android.widget.ImageView r5 = (android.widget.ImageView) r5     // Catch:{ Exception -> 0x0326 }
                r6[r7] = r5     // Catch:{ Exception -> 0x0326 }
                r5 = 0
                r6 = r2[r5]     // Catch:{ Exception -> 0x0326 }
                r7 = 3
                r5 = 2131231991(0x7f0804f7, float:1.8080079E38)
                android.view.View r5 = r9.findViewById(r5)     // Catch:{ Exception -> 0x0326 }
                android.widget.ImageView r5 = (android.widget.ImageView) r5     // Catch:{ Exception -> 0x0326 }
                r6[r7] = r5     // Catch:{ Exception -> 0x0326 }
                r5 = 1
                r6 = r2[r5]     // Catch:{ Exception -> 0x0326 }
                r7 = 0
                r5 = 2131231992(0x7f0804f8, float:1.808008E38)
                android.view.View r5 = r9.findViewById(r5)     // Catch:{ Exception -> 0x0326 }
                android.widget.ImageView r5 = (android.widget.ImageView) r5     // Catch:{ Exception -> 0x0326 }
                r6[r7] = r5     // Catch:{ Exception -> 0x0326 }
                r5 = 1
                r6 = r2[r5]     // Catch:{ Exception -> 0x0326 }
                r7 = 1
                r5 = 2131231993(0x7f0804f9, float:1.8080083E38)
                android.view.View r5 = r9.findViewById(r5)     // Catch:{ Exception -> 0x0326 }
                android.widget.ImageView r5 = (android.widget.ImageView) r5     // Catch:{ Exception -> 0x0326 }
                r6[r7] = r5     // Catch:{ Exception -> 0x0326 }
                r5 = 1
                r6 = r2[r5]     // Catch:{ Exception -> 0x0326 }
                r7 = 2
                r5 = 2131231994(0x7f0804fa, float:1.8080085E38)
                android.view.View r5 = r9.findViewById(r5)     // Catch:{ Exception -> 0x0326 }
                android.widget.ImageView r5 = (android.widget.ImageView) r5     // Catch:{ Exception -> 0x0326 }
                r6[r7] = r5     // Catch:{ Exception -> 0x0326 }
                r5 = 1
                r6 = r2[r5]     // Catch:{ Exception -> 0x0326 }
                r7 = 3
                r5 = 2131231995(0x7f0804fb, float:1.8080087E38)
                android.view.View r5 = r9.findViewById(r5)     // Catch:{ Exception -> 0x0326 }
                android.widget.ImageView r5 = (android.widget.ImageView) r5     // Catch:{ Exception -> 0x0326 }
                r6[r7] = r5     // Catch:{ Exception -> 0x0326 }
                r5 = 1
                r6 = r2[r5]     // Catch:{ Exception -> 0x0326 }
                r7 = 4
                r5 = 2131231996(0x7f0804fc, float:1.8080089E38)
                android.view.View r5 = r9.findViewById(r5)     // Catch:{ Exception -> 0x0326 }
                android.widget.ImageView r5 = (android.widget.ImageView) r5     // Catch:{ Exception -> 0x0326 }
                r6[r7] = r5     // Catch:{ Exception -> 0x0326 }
                r5 = 2
                r6 = r2[r5]     // Catch:{ Exception -> 0x0326 }
                r7 = 0
                r5 = 2131231997(0x7f0804fd, float:1.808009E38)
                android.view.View r5 = r9.findViewById(r5)     // Catch:{ Exception -> 0x0326 }
                android.widget.ImageView r5 = (android.widget.ImageView) r5     // Catch:{ Exception -> 0x0326 }
                r6[r7] = r5     // Catch:{ Exception -> 0x0326 }
                r5 = 2
                r6 = r2[r5]     // Catch:{ Exception -> 0x0326 }
                r7 = 1
                r5 = 2131231998(0x7f0804fe, float:1.8080093E38)
                android.view.View r5 = r9.findViewById(r5)     // Catch:{ Exception -> 0x0326 }
                android.widget.ImageView r5 = (android.widget.ImageView) r5     // Catch:{ Exception -> 0x0326 }
                r6[r7] = r5     // Catch:{ Exception -> 0x0326 }
                r6 = 0
                r5 = 2131231999(0x7f0804ff, float:1.8080095E38)
                android.view.View r5 = r9.findViewById(r5)     // Catch:{ Exception -> 0x0326 }
                android.widget.ImageView r5 = (android.widget.ImageView) r5     // Catch:{ Exception -> 0x0326 }
                r14[r6] = r5     // Catch:{ Exception -> 0x0326 }
                r6 = 1
                r5 = 2131231987(0x7f0804f3, float:1.808007E38)
                android.view.View r5 = r9.findViewById(r5)     // Catch:{ Exception -> 0x0326 }
                android.widget.ImageView r5 = (android.widget.ImageView) r5     // Catch:{ Exception -> 0x0326 }
                r14[r6] = r5     // Catch:{ Exception -> 0x0326 }
                r5 = 2131231985(0x7f0804f1, float:1.8080066E38)
                android.view.View r5 = r9.findViewById(r5)     // Catch:{ Exception -> 0x0326 }
                android.widget.TextView r5 = (android.widget.TextView) r5     // Catch:{ Exception -> 0x0326 }
                r6 = 2131231984(0x7f0804f0, float:1.8080064E38)
                android.view.View r6 = r9.findViewById(r6)     // Catch:{ Exception -> 0x0326 }
                android.widget.TextView r6 = (android.widget.TextView) r6     // Catch:{ Exception -> 0x0326 }
                r7 = 0
                r16 = 4
                r15[r7] = r16     // Catch:{ Exception -> 0x0326 }
                r7 = 1
                r16 = 5
                r15[r7] = r16     // Catch:{ Exception -> 0x0326 }
                r7 = 2
                r16 = 2
                r15[r7] = r16     // Catch:{ Exception -> 0x0326 }
                r3.setText(r8)     // Catch:{ Exception -> 0x0326 }
                r4.setText(r13)     // Catch:{ Exception -> 0x0326 }
                r3 = 0
                r7 = r3
            L_0x04b2:
                int r3 = r15.length     // Catch:{ Exception -> 0x0326 }
                if (r7 >= r3) goto L_0x04ea
                r3 = 0
                r4 = r3
            L_0x04b7:
                r3 = r15[r7]     // Catch:{ Exception -> 0x0326 }
                if (r4 >= r3) goto L_0x04e6
                com.imlabworld.HS_Instructor.ac[] r3 = com.imlabworld.HS_Instructor.C2556x.f9806w     // Catch:{ Exception -> 0x0326 }
                int r8 = com.imlabworld.HS_Instructor.C2465bl.f8800b     // Catch:{ Exception -> 0x0326 }
                r3 = r3[r8]     // Catch:{ Exception -> 0x0326 }
                android.util.Pair<java.lang.Boolean, java.lang.Long>[][] r3 = r3.f7759d     // Catch:{ Exception -> 0x0326 }
                r3 = r3[r7]     // Catch:{ Exception -> 0x0326 }
                r3 = r3[r4]     // Catch:{ Exception -> 0x0326 }
                java.lang.Object r3 = r3.first     // Catch:{ Exception -> 0x0326 }
                java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ Exception -> 0x0326 }
                boolean r3 = r3.booleanValue()     // Catch:{ Exception -> 0x0326 }
                if (r3 == 0) goto L_0x04dd
                r3 = r2[r7]     // Catch:{ Exception -> 0x0326 }
                r3 = r3[r4]     // Catch:{ Exception -> 0x0326 }
                r8 = 0
                r3.setVisibility(r8)     // Catch:{ Exception -> 0x0326 }
            L_0x04d9:
                int r3 = r4 + 1
                r4 = r3
                goto L_0x04b7
            L_0x04dd:
                r3 = r2[r7]     // Catch:{ Exception -> 0x0326 }
                r3 = r3[r4]     // Catch:{ Exception -> 0x0326 }
                r8 = 4
                r3.setVisibility(r8)     // Catch:{ Exception -> 0x0326 }
                goto L_0x04d9
            L_0x04e6:
                int r3 = r7 + 1
                r7 = r3
                goto L_0x04b2
            L_0x04ea:
                com.imlabworld.HS_Instructor.ac[] r2 = com.imlabworld.HS_Instructor.C2556x.f9806w     // Catch:{ Exception -> 0x0326 }
                int r3 = com.imlabworld.HS_Instructor.C2465bl.f8800b     // Catch:{ Exception -> 0x0326 }
                r2 = r2[r3]     // Catch:{ Exception -> 0x0326 }
                int r2 = r2.f7770o     // Catch:{ Exception -> 0x0326 }
                r3 = 1
                if (r2 != r3) goto L_0x0511
                r2 = 0
                r2 = r14[r2]     // Catch:{ Exception -> 0x0326 }
                r3 = 0
                r2.setVisibility(r3)     // Catch:{ Exception -> 0x0326 }
                r2 = 1
                r2 = r14[r2]     // Catch:{ Exception -> 0x0326 }
                r3 = 4
                r2.setVisibility(r3)     // Catch:{ Exception -> 0x0326 }
            L_0x0503:
                com.imlabworld.HS_Instructor.n r2 = com.imlabworld.HS_Instructor.C2557y.f9811B     // Catch:{ Exception -> 0x0326 }
                java.lang.String r2 = r2.mo9549d()     // Catch:{ Exception -> 0x0326 }
                r5.setText(r2)     // Catch:{ Exception -> 0x0326 }
                r6.setText(r13)     // Catch:{ Exception -> 0x0326 }
                goto L_0x0377
            L_0x0511:
                r2 = 0
                r2 = r14[r2]     // Catch:{ Exception -> 0x0326 }
                r3 = 4
                r2.setVisibility(r3)     // Catch:{ Exception -> 0x0326 }
                r2 = 1
                r2 = r14[r2]     // Catch:{ Exception -> 0x0326 }
                r3 = 0
                r2.setVisibility(r3)     // Catch:{ Exception -> 0x0326 }
                goto L_0x0503
            L_0x0520:
                com.imlabworld.HS_Instructor.t r2 = r21.mo9310b()     // Catch:{ Exception -> 0x0326 }
                int r2 = r2.f9747c     // Catch:{ Exception -> 0x0326 }
                r3 = 1
                if (r2 == r3) goto L_0x0532
                com.imlabworld.HS_Instructor.t r2 = r21.mo9310b()     // Catch:{ Exception -> 0x0326 }
                int r2 = r2.f9747c     // Catch:{ Exception -> 0x0326 }
                r3 = 2
                if (r2 != r3) goto L_0x0724
            L_0x0532:
                r2 = 4
                r3 = 6
                int[] r2 = new int[]{r2, r3}     // Catch:{ Exception -> 0x0326 }
                java.lang.Class<android.widget.ImageView> r3 = android.widget.ImageView.class
                java.lang.Object r2 = java.lang.reflect.Array.newInstance(r3, r2)     // Catch:{ Exception -> 0x0326 }
                android.widget.ImageView[][] r2 = (android.widget.ImageView[][]) r2     // Catch:{ Exception -> 0x0326 }
                r3 = 2
                android.widget.ImageView[] r13 = new android.widget.ImageView[r3]     // Catch:{ Exception -> 0x0326 }
                r3 = 4
                int[] r0 = new int[r3]     // Catch:{ Exception -> 0x0326 }
                r17 = r0
                r3 = 2131231982(0x7f0804ee, float:1.808006E38)
                android.view.View r3 = r9.findViewById(r3)     // Catch:{ Exception -> 0x0326 }
                android.widget.TextView r3 = (android.widget.TextView) r3     // Catch:{ Exception -> 0x0326 }
                r4 = 2131231981(0x7f0804ed, float:1.8080058E38)
                android.view.View r4 = r9.findViewById(r4)     // Catch:{ Exception -> 0x0326 }
                android.widget.TextView r4 = (android.widget.TextView) r4     // Catch:{ Exception -> 0x0326 }
                r5 = 2131231980(0x7f0804ec, float:1.8080056E38)
                android.view.View r5 = r9.findViewById(r5)     // Catch:{ Exception -> 0x0326 }
                android.widget.TextView r5 = (android.widget.TextView) r5     // Catch:{ Exception -> 0x0326 }
                r6 = 2131231983(0x7f0804ef, float:1.8080062E38)
                android.view.View r6 = r9.findViewById(r6)     // Catch:{ Exception -> 0x0326 }
                android.widget.TextView r6 = (android.widget.TextView) r6     // Catch:{ Exception -> 0x0326 }
                r7 = 0
                r18 = r2[r7]     // Catch:{ Exception -> 0x0326 }
                r19 = 0
                r7 = 2131231963(0x7f0804db, float:1.8080022E38)
                android.view.View r7 = r9.findViewById(r7)     // Catch:{ Exception -> 0x0326 }
                android.widget.ImageView r7 = (android.widget.ImageView) r7     // Catch:{ Exception -> 0x0326 }
                r18[r19] = r7     // Catch:{ Exception -> 0x0326 }
                r7 = 0
                r18 = r2[r7]     // Catch:{ Exception -> 0x0326 }
                r19 = 1
                r7 = 2131231964(0x7f0804dc, float:1.8080024E38)
                android.view.View r7 = r9.findViewById(r7)     // Catch:{ Exception -> 0x0326 }
                android.widget.ImageView r7 = (android.widget.ImageView) r7     // Catch:{ Exception -> 0x0326 }
                r18[r19] = r7     // Catch:{ Exception -> 0x0326 }
                r7 = 0
                r18 = r2[r7]     // Catch:{ Exception -> 0x0326 }
                r19 = 2
                r7 = 2131231965(0x7f0804dd, float:1.8080026E38)
                android.view.View r7 = r9.findViewById(r7)     // Catch:{ Exception -> 0x0326 }
                android.widget.ImageView r7 = (android.widget.ImageView) r7     // Catch:{ Exception -> 0x0326 }
                r18[r19] = r7     // Catch:{ Exception -> 0x0326 }
                r7 = 1
                r18 = r2[r7]     // Catch:{ Exception -> 0x0326 }
                r19 = 0
                r7 = 2131231966(0x7f0804de, float:1.8080028E38)
                android.view.View r7 = r9.findViewById(r7)     // Catch:{ Exception -> 0x0326 }
                android.widget.ImageView r7 = (android.widget.ImageView) r7     // Catch:{ Exception -> 0x0326 }
                r18[r19] = r7     // Catch:{ Exception -> 0x0326 }
                r7 = 1
                r18 = r2[r7]     // Catch:{ Exception -> 0x0326 }
                r19 = 1
                r7 = 2131231967(0x7f0804df, float:1.808003E38)
                android.view.View r7 = r9.findViewById(r7)     // Catch:{ Exception -> 0x0326 }
                android.widget.ImageView r7 = (android.widget.ImageView) r7     // Catch:{ Exception -> 0x0326 }
                r18[r19] = r7     // Catch:{ Exception -> 0x0326 }
                r7 = 1
                r18 = r2[r7]     // Catch:{ Exception -> 0x0326 }
                r19 = 2
                r7 = 2131231968(0x7f0804e0, float:1.8080032E38)
                android.view.View r7 = r9.findViewById(r7)     // Catch:{ Exception -> 0x0326 }
                android.widget.ImageView r7 = (android.widget.ImageView) r7     // Catch:{ Exception -> 0x0326 }
                r18[r19] = r7     // Catch:{ Exception -> 0x0326 }
                r7 = 1
                r18 = r2[r7]     // Catch:{ Exception -> 0x0326 }
                r19 = 3
                r7 = 2131231969(0x7f0804e1, float:1.8080034E38)
                android.view.View r7 = r9.findViewById(r7)     // Catch:{ Exception -> 0x0326 }
                android.widget.ImageView r7 = (android.widget.ImageView) r7     // Catch:{ Exception -> 0x0326 }
                r18[r19] = r7     // Catch:{ Exception -> 0x0326 }
                r7 = 1
                r18 = r2[r7]     // Catch:{ Exception -> 0x0326 }
                r19 = 4
                r7 = 2131231970(0x7f0804e2, float:1.8080036E38)
                android.view.View r7 = r9.findViewById(r7)     // Catch:{ Exception -> 0x0326 }
                android.widget.ImageView r7 = (android.widget.ImageView) r7     // Catch:{ Exception -> 0x0326 }
                r18[r19] = r7     // Catch:{ Exception -> 0x0326 }
                r7 = 1
                r18 = r2[r7]     // Catch:{ Exception -> 0x0326 }
                r19 = 5
                r7 = 2131231971(0x7f0804e3, float:1.8080038E38)
                android.view.View r7 = r9.findViewById(r7)     // Catch:{ Exception -> 0x0326 }
                android.widget.ImageView r7 = (android.widget.ImageView) r7     // Catch:{ Exception -> 0x0326 }
                r18[r19] = r7     // Catch:{ Exception -> 0x0326 }
                r7 = 2
                r18 = r2[r7]     // Catch:{ Exception -> 0x0326 }
                r19 = 0
                r7 = 2131231972(0x7f0804e4, float:1.808004E38)
                android.view.View r7 = r9.findViewById(r7)     // Catch:{ Exception -> 0x0326 }
                android.widget.ImageView r7 = (android.widget.ImageView) r7     // Catch:{ Exception -> 0x0326 }
                r18[r19] = r7     // Catch:{ Exception -> 0x0326 }
                r7 = 2
                r18 = r2[r7]     // Catch:{ Exception -> 0x0326 }
                r19 = 1
                r7 = 2131231973(0x7f0804e5, float:1.8080042E38)
                android.view.View r7 = r9.findViewById(r7)     // Catch:{ Exception -> 0x0326 }
                android.widget.ImageView r7 = (android.widget.ImageView) r7     // Catch:{ Exception -> 0x0326 }
                r18[r19] = r7     // Catch:{ Exception -> 0x0326 }
                r7 = 2
                r18 = r2[r7]     // Catch:{ Exception -> 0x0326 }
                r19 = 2
                r7 = 2131231974(0x7f0804e6, float:1.8080044E38)
                android.view.View r7 = r9.findViewById(r7)     // Catch:{ Exception -> 0x0326 }
                android.widget.ImageView r7 = (android.widget.ImageView) r7     // Catch:{ Exception -> 0x0326 }
                r18[r19] = r7     // Catch:{ Exception -> 0x0326 }
                r7 = 2
                r18 = r2[r7]     // Catch:{ Exception -> 0x0326 }
                r19 = 3
                r7 = 2131231975(0x7f0804e7, float:1.8080046E38)
                android.view.View r7 = r9.findViewById(r7)     // Catch:{ Exception -> 0x0326 }
                android.widget.ImageView r7 = (android.widget.ImageView) r7     // Catch:{ Exception -> 0x0326 }
                r18[r19] = r7     // Catch:{ Exception -> 0x0326 }
                r7 = 2
                r18 = r2[r7]     // Catch:{ Exception -> 0x0326 }
                r19 = 4
                r7 = 2131231976(0x7f0804e8, float:1.8080048E38)
                android.view.View r7 = r9.findViewById(r7)     // Catch:{ Exception -> 0x0326 }
                android.widget.ImageView r7 = (android.widget.ImageView) r7     // Catch:{ Exception -> 0x0326 }
                r18[r19] = r7     // Catch:{ Exception -> 0x0326 }
                r7 = 2
                r18 = r2[r7]     // Catch:{ Exception -> 0x0326 }
                r19 = 5
                r7 = 2131231977(0x7f0804e9, float:1.808005E38)
                android.view.View r7 = r9.findViewById(r7)     // Catch:{ Exception -> 0x0326 }
                android.widget.ImageView r7 = (android.widget.ImageView) r7     // Catch:{ Exception -> 0x0326 }
                r18[r19] = r7     // Catch:{ Exception -> 0x0326 }
                r7 = 3
                r18 = r2[r7]     // Catch:{ Exception -> 0x0326 }
                r19 = 0
                r7 = 2131231978(0x7f0804ea, float:1.8080052E38)
                android.view.View r7 = r9.findViewById(r7)     // Catch:{ Exception -> 0x0326 }
                android.widget.ImageView r7 = (android.widget.ImageView) r7     // Catch:{ Exception -> 0x0326 }
                r18[r19] = r7     // Catch:{ Exception -> 0x0326 }
                r18 = 0
                r7 = 2131231979(0x7f0804eb, float:1.8080054E38)
                android.view.View r7 = r9.findViewById(r7)     // Catch:{ Exception -> 0x0326 }
                android.widget.ImageView r7 = (android.widget.ImageView) r7     // Catch:{ Exception -> 0x0326 }
                r13[r18] = r7     // Catch:{ Exception -> 0x0326 }
                r18 = 1
                r7 = 2131231962(0x7f0804da, float:1.808002E38)
                android.view.View r7 = r9.findViewById(r7)     // Catch:{ Exception -> 0x0326 }
                android.widget.ImageView r7 = (android.widget.ImageView) r7     // Catch:{ Exception -> 0x0326 }
                r13[r18] = r7     // Catch:{ Exception -> 0x0326 }
                r7 = 2131231960(0x7f0804d8, float:1.8080016E38)
                android.view.View r7 = r9.findViewById(r7)     // Catch:{ Exception -> 0x0326 }
                android.widget.TextView r7 = (android.widget.TextView) r7     // Catch:{ Exception -> 0x0326 }
                r18 = 0
                r19 = 3
                r17[r18] = r19     // Catch:{ Exception -> 0x0326 }
                r18 = 1
                r19 = 6
                r17[r18] = r19     // Catch:{ Exception -> 0x0326 }
                r18 = 2
                r19 = 6
                r17[r18] = r19     // Catch:{ Exception -> 0x0326 }
                r18 = 3
                r19 = 1
                r17[r18] = r19     // Catch:{ Exception -> 0x0326 }
                r3.setText(r14)     // Catch:{ Exception -> 0x0326 }
                r4.setText(r15)     // Catch:{ Exception -> 0x0326 }
                r0 = r16
                r5.setText(r0)     // Catch:{ Exception -> 0x0326 }
                r6.setText(r8)     // Catch:{ Exception -> 0x0326 }
                r3 = 0
                r5 = r3
            L_0x06b7:
                r0 = r17
                int r3 = r0.length     // Catch:{ Exception -> 0x0326 }
                if (r5 >= r3) goto L_0x06f1
                r3 = 0
                r4 = r3
            L_0x06be:
                r3 = r17[r5]     // Catch:{ Exception -> 0x0326 }
                if (r4 >= r3) goto L_0x06ed
                com.imlabworld.HS_Instructor.ac[] r3 = com.imlabworld.HS_Instructor.C2556x.f9806w     // Catch:{ Exception -> 0x0326 }
                int r6 = com.imlabworld.HS_Instructor.C2465bl.f8800b     // Catch:{ Exception -> 0x0326 }
                r3 = r3[r6]     // Catch:{ Exception -> 0x0326 }
                android.util.Pair<java.lang.Boolean, java.lang.Long>[][] r3 = r3.f7758c     // Catch:{ Exception -> 0x0326 }
                r3 = r3[r5]     // Catch:{ Exception -> 0x0326 }
                r3 = r3[r4]     // Catch:{ Exception -> 0x0326 }
                java.lang.Object r3 = r3.first     // Catch:{ Exception -> 0x0326 }
                java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ Exception -> 0x0326 }
                boolean r3 = r3.booleanValue()     // Catch:{ Exception -> 0x0326 }
                if (r3 == 0) goto L_0x06e4
                r3 = r2[r5]     // Catch:{ Exception -> 0x0326 }
                r3 = r3[r4]     // Catch:{ Exception -> 0x0326 }
                r6 = 0
                r3.setVisibility(r6)     // Catch:{ Exception -> 0x0326 }
            L_0x06e0:
                int r3 = r4 + 1
                r4 = r3
                goto L_0x06be
            L_0x06e4:
                r3 = r2[r5]     // Catch:{ Exception -> 0x0326 }
                r3 = r3[r4]     // Catch:{ Exception -> 0x0326 }
                r6 = 4
                r3.setVisibility(r6)     // Catch:{ Exception -> 0x0326 }
                goto L_0x06e0
            L_0x06ed:
                int r3 = r5 + 1
                r5 = r3
                goto L_0x06b7
            L_0x06f1:
                com.imlabworld.HS_Instructor.ac[] r2 = com.imlabworld.HS_Instructor.C2556x.f9806w     // Catch:{ Exception -> 0x0326 }
                int r3 = com.imlabworld.HS_Instructor.C2465bl.f8800b     // Catch:{ Exception -> 0x0326 }
                r2 = r2[r3]     // Catch:{ Exception -> 0x0326 }
                int r2 = r2.f7770o     // Catch:{ Exception -> 0x0326 }
                r3 = 1
                if (r2 != r3) goto L_0x0715
                r2 = 0
                r2 = r13[r2]     // Catch:{ Exception -> 0x0326 }
                r3 = 0
                r2.setVisibility(r3)     // Catch:{ Exception -> 0x0326 }
                r2 = 1
                r2 = r13[r2]     // Catch:{ Exception -> 0x0326 }
                r3 = 4
                r2.setVisibility(r3)     // Catch:{ Exception -> 0x0326 }
            L_0x070a:
                com.imlabworld.HS_Instructor.n r2 = com.imlabworld.HS_Instructor.C2557y.f9811B     // Catch:{ Exception -> 0x0326 }
                java.lang.String r2 = r2.mo9549d()     // Catch:{ Exception -> 0x0326 }
                r7.setText(r2)     // Catch:{ Exception -> 0x0326 }
                goto L_0x0377
            L_0x0715:
                r2 = 0
                r2 = r13[r2]     // Catch:{ Exception -> 0x0326 }
                r3 = 4
                r2.setVisibility(r3)     // Catch:{ Exception -> 0x0326 }
                r2 = 1
                r2 = r13[r2]     // Catch:{ Exception -> 0x0326 }
                r3 = 0
                r2.setVisibility(r3)     // Catch:{ Exception -> 0x0326 }
                goto L_0x070a
            L_0x0724:
                r2 = 2
                r3 = 6
                int[] r2 = new int[]{r2, r3}     // Catch:{ Exception -> 0x0326 }
                java.lang.Class<android.widget.ImageView> r3 = android.widget.ImageView.class
                java.lang.Object r2 = java.lang.reflect.Array.newInstance(r3, r2)     // Catch:{ Exception -> 0x0326 }
                android.widget.ImageView[][] r2 = (android.widget.ImageView[][]) r2     // Catch:{ Exception -> 0x0326 }
                r3 = 2
                android.widget.ImageView[] r13 = new android.widget.ImageView[r3]     // Catch:{ Exception -> 0x0326 }
                r3 = 2
                int[] r0 = new int[r3]     // Catch:{ Exception -> 0x0326 }
                r17 = r0
                r3 = 2131232017(0x7f080511, float:1.8080131E38)
                android.view.View r3 = r9.findViewById(r3)     // Catch:{ Exception -> 0x0326 }
                android.widget.TextView r3 = (android.widget.TextView) r3     // Catch:{ Exception -> 0x0326 }
                r4 = 2131232016(0x7f080510, float:1.808013E38)
                android.view.View r4 = r9.findViewById(r4)     // Catch:{ Exception -> 0x0326 }
                android.widget.TextView r4 = (android.widget.TextView) r4     // Catch:{ Exception -> 0x0326 }
                r5 = 2131232015(0x7f08050f, float:1.8080127E38)
                android.view.View r5 = r9.findViewById(r5)     // Catch:{ Exception -> 0x0326 }
                android.widget.TextView r5 = (android.widget.TextView) r5     // Catch:{ Exception -> 0x0326 }
                r6 = 2131232018(0x7f080512, float:1.8080133E38)
                android.view.View r6 = r9.findViewById(r6)     // Catch:{ Exception -> 0x0326 }
                android.widget.TextView r6 = (android.widget.TextView) r6     // Catch:{ Exception -> 0x0326 }
                r7 = 0
                r18 = r2[r7]     // Catch:{ Exception -> 0x0326 }
                r19 = 0
                r7 = 2131232005(0x7f080505, float:1.8080107E38)
                android.view.View r7 = r9.findViewById(r7)     // Catch:{ Exception -> 0x0326 }
                android.widget.ImageView r7 = (android.widget.ImageView) r7     // Catch:{ Exception -> 0x0326 }
                r18[r19] = r7     // Catch:{ Exception -> 0x0326 }
                r7 = 0
                r18 = r2[r7]     // Catch:{ Exception -> 0x0326 }
                r19 = 1
                r7 = 2131232006(0x7f080506, float:1.808011E38)
                android.view.View r7 = r9.findViewById(r7)     // Catch:{ Exception -> 0x0326 }
                android.widget.ImageView r7 = (android.widget.ImageView) r7     // Catch:{ Exception -> 0x0326 }
                r18[r19] = r7     // Catch:{ Exception -> 0x0326 }
                r7 = 0
                r18 = r2[r7]     // Catch:{ Exception -> 0x0326 }
                r19 = 2
                r7 = 2131232007(0x7f080507, float:1.8080111E38)
                android.view.View r7 = r9.findViewById(r7)     // Catch:{ Exception -> 0x0326 }
                android.widget.ImageView r7 = (android.widget.ImageView) r7     // Catch:{ Exception -> 0x0326 }
                r18[r19] = r7     // Catch:{ Exception -> 0x0326 }
                r7 = 1
                r18 = r2[r7]     // Catch:{ Exception -> 0x0326 }
                r19 = 0
                r7 = 2131232008(0x7f080508, float:1.8080113E38)
                android.view.View r7 = r9.findViewById(r7)     // Catch:{ Exception -> 0x0326 }
                android.widget.ImageView r7 = (android.widget.ImageView) r7     // Catch:{ Exception -> 0x0326 }
                r18[r19] = r7     // Catch:{ Exception -> 0x0326 }
                r7 = 1
                r18 = r2[r7]     // Catch:{ Exception -> 0x0326 }
                r19 = 1
                r7 = 2131232009(0x7f080509, float:1.8080115E38)
                android.view.View r7 = r9.findViewById(r7)     // Catch:{ Exception -> 0x0326 }
                android.widget.ImageView r7 = (android.widget.ImageView) r7     // Catch:{ Exception -> 0x0326 }
                r18[r19] = r7     // Catch:{ Exception -> 0x0326 }
                r7 = 1
                r18 = r2[r7]     // Catch:{ Exception -> 0x0326 }
                r19 = 2
                r7 = 2131232010(0x7f08050a, float:1.8080117E38)
                android.view.View r7 = r9.findViewById(r7)     // Catch:{ Exception -> 0x0326 }
                android.widget.ImageView r7 = (android.widget.ImageView) r7     // Catch:{ Exception -> 0x0326 }
                r18[r19] = r7     // Catch:{ Exception -> 0x0326 }
                r7 = 1
                r18 = r2[r7]     // Catch:{ Exception -> 0x0326 }
                r19 = 3
                r7 = 2131232011(0x7f08050b, float:1.808012E38)
                android.view.View r7 = r9.findViewById(r7)     // Catch:{ Exception -> 0x0326 }
                android.widget.ImageView r7 = (android.widget.ImageView) r7     // Catch:{ Exception -> 0x0326 }
                r18[r19] = r7     // Catch:{ Exception -> 0x0326 }
                r7 = 1
                r18 = r2[r7]     // Catch:{ Exception -> 0x0326 }
                r19 = 4
                r7 = 2131232012(0x7f08050c, float:1.8080121E38)
                android.view.View r7 = r9.findViewById(r7)     // Catch:{ Exception -> 0x0326 }
                android.widget.ImageView r7 = (android.widget.ImageView) r7     // Catch:{ Exception -> 0x0326 }
                r18[r19] = r7     // Catch:{ Exception -> 0x0326 }
                r7 = 1
                r18 = r2[r7]     // Catch:{ Exception -> 0x0326 }
                r19 = 5
                r7 = 2131232013(0x7f08050d, float:1.8080123E38)
                android.view.View r7 = r9.findViewById(r7)     // Catch:{ Exception -> 0x0326 }
                android.widget.ImageView r7 = (android.widget.ImageView) r7     // Catch:{ Exception -> 0x0326 }
                r18[r19] = r7     // Catch:{ Exception -> 0x0326 }
                r18 = 0
                r7 = 2131232014(0x7f08050e, float:1.8080125E38)
                android.view.View r7 = r9.findViewById(r7)     // Catch:{ Exception -> 0x0326 }
                android.widget.ImageView r7 = (android.widget.ImageView) r7     // Catch:{ Exception -> 0x0326 }
                r13[r18] = r7     // Catch:{ Exception -> 0x0326 }
                r18 = 1
                r7 = 2131232004(0x7f080504, float:1.8080105E38)
                android.view.View r7 = r9.findViewById(r7)     // Catch:{ Exception -> 0x0326 }
                android.widget.ImageView r7 = (android.widget.ImageView) r7     // Catch:{ Exception -> 0x0326 }
                r13[r18] = r7     // Catch:{ Exception -> 0x0326 }
                r7 = 2131232002(0x7f080502, float:1.80801E38)
                android.view.View r7 = r9.findViewById(r7)     // Catch:{ Exception -> 0x0326 }
                android.widget.TextView r7 = (android.widget.TextView) r7     // Catch:{ Exception -> 0x0326 }
                r18 = 0
                r19 = 3
                r17[r18] = r19     // Catch:{ Exception -> 0x0326 }
                r18 = 1
                r19 = 6
                r17[r18] = r19     // Catch:{ Exception -> 0x0326 }
                r3.setText(r14)     // Catch:{ Exception -> 0x0326 }
                r4.setText(r15)     // Catch:{ Exception -> 0x0326 }
                r0 = r16
                r5.setText(r0)     // Catch:{ Exception -> 0x0326 }
                r6.setText(r8)     // Catch:{ Exception -> 0x0326 }
                r3 = 0
                r5 = r3
            L_0x082d:
                r0 = r17
                int r3 = r0.length     // Catch:{ Exception -> 0x0326 }
                if (r5 >= r3) goto L_0x0867
                r3 = 0
                r4 = r3
            L_0x0834:
                r3 = r17[r5]     // Catch:{ Exception -> 0x0326 }
                if (r4 >= r3) goto L_0x0863
                com.imlabworld.HS_Instructor.ac[] r3 = com.imlabworld.HS_Instructor.C2556x.f9806w     // Catch:{ Exception -> 0x0326 }
                int r6 = com.imlabworld.HS_Instructor.C2465bl.f8800b     // Catch:{ Exception -> 0x0326 }
                r3 = r3[r6]     // Catch:{ Exception -> 0x0326 }
                android.util.Pair<java.lang.Boolean, java.lang.Long>[][] r3 = r3.f7760e     // Catch:{ Exception -> 0x0326 }
                r3 = r3[r5]     // Catch:{ Exception -> 0x0326 }
                r3 = r3[r4]     // Catch:{ Exception -> 0x0326 }
                java.lang.Object r3 = r3.first     // Catch:{ Exception -> 0x0326 }
                java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ Exception -> 0x0326 }
                boolean r3 = r3.booleanValue()     // Catch:{ Exception -> 0x0326 }
                if (r3 == 0) goto L_0x085a
                r3 = r2[r5]     // Catch:{ Exception -> 0x0326 }
                r3 = r3[r4]     // Catch:{ Exception -> 0x0326 }
                r6 = 0
                r3.setVisibility(r6)     // Catch:{ Exception -> 0x0326 }
            L_0x0856:
                int r3 = r4 + 1
                r4 = r3
                goto L_0x0834
            L_0x085a:
                r3 = r2[r5]     // Catch:{ Exception -> 0x0326 }
                r3 = r3[r4]     // Catch:{ Exception -> 0x0326 }
                r6 = 4
                r3.setVisibility(r6)     // Catch:{ Exception -> 0x0326 }
                goto L_0x0856
            L_0x0863:
                int r3 = r5 + 1
                r5 = r3
                goto L_0x082d
            L_0x0867:
                com.imlabworld.HS_Instructor.ac[] r2 = com.imlabworld.HS_Instructor.C2556x.f9806w     // Catch:{ Exception -> 0x0326 }
                int r3 = com.imlabworld.HS_Instructor.C2465bl.f8800b     // Catch:{ Exception -> 0x0326 }
                r2 = r2[r3]     // Catch:{ Exception -> 0x0326 }
                int r2 = r2.f7770o     // Catch:{ Exception -> 0x0326 }
                r3 = 1
                if (r2 != r3) goto L_0x088b
                r2 = 0
                r2 = r13[r2]     // Catch:{ Exception -> 0x0326 }
                r3 = 0
                r2.setVisibility(r3)     // Catch:{ Exception -> 0x0326 }
                r2 = 1
                r2 = r13[r2]     // Catch:{ Exception -> 0x0326 }
                r3 = 4
                r2.setVisibility(r3)     // Catch:{ Exception -> 0x0326 }
            L_0x0880:
                com.imlabworld.HS_Instructor.n r2 = com.imlabworld.HS_Instructor.C2557y.f9811B     // Catch:{ Exception -> 0x0326 }
                java.lang.String r2 = r2.mo9549d()     // Catch:{ Exception -> 0x0326 }
                r7.setText(r2)     // Catch:{ Exception -> 0x0326 }
                goto L_0x0377
            L_0x088b:
                r2 = 0
                r2 = r13[r2]     // Catch:{ Exception -> 0x0326 }
                r3 = 4
                r2.setVisibility(r3)     // Catch:{ Exception -> 0x0326 }
                r2 = 1
                r2 = r13[r2]     // Catch:{ Exception -> 0x0326 }
                r3 = 0
                r2.setVisibility(r3)     // Catch:{ Exception -> 0x0326 }
                goto L_0x0880
            */
            throw new UnsupportedOperationException("Method not decompiled: com.imlabworld.HS_Instructor.C2488bp.C2491b.mo9157a(com.imlabworld.HS_Instructor.bs):void");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo9158b() {
            this.f9036f.setAlpha(1.0f);
            this.f9036f.setBackgroundColor(-6434106);
            this.f9037g.setBackgroundColor(-526345);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo9159c() {
            this.f9036f.setAlpha(1.0f);
            this.f9036f.setBackgroundColor(-526345);
            this.f9037g.setBackgroundColor(-6434106);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo9160d() {
            this.f9036f.setAlpha(0.15f);
            this.f9036f.setBackgroundColor(-526345);
            this.f9037g.setBackgroundColor(-6434106);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo9161e() {
            this.f9041k.mo9207b();
            this.f9042l.mo9169c();
            mo9158b();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo9162f() {
            this.f9041k.mo9208c();
            this.f9042l.mo9168b();
            mo9159c();
        }

        public void onClick(View view) {
            switch (view.getId()) {
                case C2656R.C2657id.test_result_detail_btn /*2131232048*/:
                    mo9162f();
                    return;
                case C2656R.C2657id.test_result_nr_btn /*2131232082*/:
                    this.f9044n.setVisibility(0);
                    this.f9048r.sendEmptyMessageDelayed(0, 1000);
                    return;
                case C2656R.C2657id.test_result_overview_btn /*2131232090*/:
                    mo9161e();
                    return;
                case C2656R.C2657id.test_result_pass_btn /*2131232121*/:
                    C2552t b = C2465bl.f8801c.get(0).mo9310b();
                    switch (b.f9748d) {
                        case 1:
                            switch (b.f9747c) {
                                case 1:
                                case 2:
                                    this.f9042l.f9056d.f9105b.mo9188a();
                                    return;
                                case 3:
                                    this.f9042l.f9056d.f9107d.mo9200a();
                                    return;
                                default:
                                    return;
                            }
                        case 2:
                            switch (b.f9747c) {
                                case 1:
                                case 2:
                                    this.f9042l.f9056d.f9104a.mo9182a();
                                    return;
                                case 3:
                                    this.f9042l.f9056d.f9106c.mo9194a();
                                    return;
                                default:
                                    return;
                            }
                        default:
                            return;
                    }
                case C2656R.C2657id.test_result_pause_btn /*2131232122*/:
                    new AlertDialog.Builder(C2488bp.this.getActivity()).setTitle(C2557y.f9835g.f10494gW).setMessage(C2557y.f9835g.f10548he).setPositiveButton(C2557y.f9835g.f10545hb, new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialogInterface, int i) {
                            C2488bp.this.f9027c.mo8631k(C2465bl.f8800b);
                        }
                    }).setNegativeButton(C2557y.f9835g.f10210bD, (DialogInterface.OnClickListener) null).show().setCanceledOnTouchOutside(false);
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: a */
    public static C2488bp m13663a(int i) {
        C2488bp bpVar = new C2488bp();
        Bundle bundle = new Bundle();
        bundle.putInt(f9025b, i);
        bpVar.setArguments(bundle);
        return bpVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9151a(C2338ae[] aeVarArr) {
        this.f9029e = aeVarArr;
        this.f9028d.mo9156a();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (activity instanceof C2490a) {
            this.f9027c = (C2490a) activity;
            return;
        }
        throw new RuntimeException(activity.toString() + " must implement OnFragmentInteractionListener");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C2656R.layout.test_result, viewGroup, false);
        this.f9028d = new C2491b(inflate);
        return inflate;
    }

    public void onDetach() {
        super.onDetach();
        this.f9027c = null;
    }
}
