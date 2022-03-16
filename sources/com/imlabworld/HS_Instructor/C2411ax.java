package com.imlabworld.HS_Instructor;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.p036v7.widget.p046a.C1644a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.imlabworld.p079a.C2591b;
import com.imlabworld.p079a.C2614s;
import com.imlabworld.p079a.C2615t;
import com.ssomai.android.scalablelayout.ScalableLayout;
import com.woxthebox.draglistview.C2656R;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* renamed from: com.imlabworld.HS_Instructor.ax */
public class C2411ax extends Fragment implements View.OnClickListener {

    /* renamed from: a */
    private static final String f8253a = "param";

    /* renamed from: b */
    private String f8254b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public int f8255c;

    /* renamed from: d */
    private View f8256d;

    /* renamed from: e */
    private C2417c f8257e;

    /* renamed from: f */
    private C2412a f8258f;

    /* renamed from: com.imlabworld.HS_Instructor.ax$a */
    class C2412a implements View.OnClickListener {

        /* renamed from: a */
        final TextView f8259a;

        /* renamed from: b */
        final TextView f8260b;

        /* renamed from: c */
        final TextView f8261c;

        /* renamed from: d */
        final C2415b f8262d;

        /* renamed from: e */
        final C2413a f8263e;

        /* renamed from: f */
        final View f8264f;

        /* renamed from: com.imlabworld.HS_Instructor.ax$a$a */
        class C2413a {

            /* renamed from: a */
            final ScrollView f8266a;

            /* renamed from: b */
            final ScalableLayout f8267b;

            /* renamed from: c */
            final C2414a f8268c;

            /* renamed from: com.imlabworld.HS_Instructor.ax$a$a$a */
            class C2414a {

                /* renamed from: A */
                TextView[] f8270A;

                /* renamed from: B */
                int f8271B;

                /* renamed from: C */
                int f8272C;

                /* renamed from: D */
                final float f8273D = 0.0f;

                /* renamed from: E */
                final float f8274E = 60.0f;

                /* renamed from: F */
                final float f8275F = 25.0f;

                /* renamed from: G */
                final float f8276G = 250.0f;

                /* renamed from: H */
                float f8277H = 5.0f;

                /* renamed from: I */
                final float f8278I = 626.0f;

                /* renamed from: J */
                final float f8279J = 13.0f;

                /* renamed from: K */
                final float f8280K = 340.0f;

                /* renamed from: L */
                final float f8281L = 50.0f;

                /* renamed from: M */
                final float f8282M = 150.0f;

                /* renamed from: N */
                final float f8283N = 761.0f;

                /* renamed from: O */
                final float f8284O = 13.0f;

                /* renamed from: P */
                final int f8285P = 1795;

                /* renamed from: Q */
                final int f8286Q = 17;

                /* renamed from: a */
                final ScalableLayout f8288a;

                /* renamed from: b */
                final ImageView f8289b;

                /* renamed from: c */
                final ImageView f8290c;

                /* renamed from: d */
                final ImageView f8291d;

                /* renamed from: e */
                final TextView f8292e;

                /* renamed from: f */
                final TextView f8293f;

                /* renamed from: g */
                final TextView f8294g;

                /* renamed from: h */
                final TextView f8295h;

                /* renamed from: i */
                final TextView f8296i;

                /* renamed from: j */
                final TextView f8297j;

                /* renamed from: k */
                final TextView f8298k;

                /* renamed from: l */
                final TextView f8299l;

                /* renamed from: m */
                final TextView f8300m;

                /* renamed from: n */
                final TextView f8301n;

                /* renamed from: o */
                final TextView f8302o;

                /* renamed from: p */
                final TextView f8303p;

                /* renamed from: q */
                final TextView f8304q;

                /* renamed from: r */
                final TextView f8305r;

                /* renamed from: s */
                final TextView f8306s;

                /* renamed from: t */
                final TextView f8307t;

                /* renamed from: u */
                final ScalableLayout f8308u;

                /* renamed from: v */
                final ScalableLayout f8309v;

                /* renamed from: w */
                final ScalableLayout f8310w;

                /* renamed from: x */
                ImageView[] f8311x;

                /* renamed from: y */
                ImageView[][] f8312y;

                /* renamed from: z */
                ImageView[] f8313z;

                public C2414a(View view) {
                    this.f8288a = (ScalableLayout) view.findViewById(C2656R.C2657id.detail_result_graph_sc);
                    this.f8290c = (ImageView) view.findViewById(C2656R.C2657id.detail_result_graph_c_depth_good_line_start);
                    this.f8289b = (ImageView) view.findViewById(C2656R.C2657id.detail_result_graph_c_depth_good_range);
                    this.f8291d = (ImageView) view.findViewById(C2656R.C2657id.detail_result_graph_c_depth_good_line_end);
                    this.f8292e = (TextView) view.findViewById(C2656R.C2657id.detail_result_graph_amount_title);
                    this.f8293f = (TextView) view.findViewById(C2656R.C2657id.detail_result_graph_c_depth_recoil_info);
                    this.f8294g = (TextView) view.findViewById(C2656R.C2657id.detail_result_graph_c_depth_wp_info);
                    this.f8295h = (TextView) view.findViewById(C2656R.C2657id.detail_result_graph_c_depth_recoil_title);
                    this.f8296i = (TextView) view.findViewById(C2656R.C2657id.detail_result_graph_c_depth_good_title);
                    this.f8297j = (TextView) view.findViewById(C2656R.C2657id.detail_result_graph_c_depth_strong_title);
                    this.f8298k = (TextView) view.findViewById(C2656R.C2657id.detail_result_graph_b_volume_strong_title);
                    this.f8299l = (TextView) view.findViewById(C2656R.C2657id.detail_result_graph_b_volume_good_title);
                    this.f8300m = (TextView) view.findViewById(C2656R.C2657id.detail_result_graph_b_volume_weak_title);
                    this.f8301n = (TextView) view.findViewById(C2656R.C2657id.detail_result_graph_rate_title);
                    this.f8302o = (TextView) view.findViewById(C2656R.C2657id.detail_result_graph_c_rate_fast_title);
                    this.f8303p = (TextView) view.findViewById(C2656R.C2657id.detail_result_graph_c_rate_good_title);
                    this.f8304q = (TextView) view.findViewById(C2656R.C2657id.detail_result_graph_c_rate_slow_title);
                    this.f8305r = (TextView) view.findViewById(C2656R.C2657id.detail_result_graph_b_rate_fast_title);
                    this.f8306s = (TextView) view.findViewById(C2656R.C2657id.detail_result_graph_b_rate_good_title);
                    this.f8307t = (TextView) view.findViewById(C2656R.C2657id.detail_result_graph_b_rate_slow_title);
                    this.f8308u = (ScalableLayout) view.findViewById(C2656R.C2657id.detail_result_graph_line_sc);
                    this.f8309v = (ScalableLayout) view.findViewById(C2656R.C2657id.detail_result_graph_txt_sc);
                    this.f8310w = (ScalableLayout) view.findViewById(C2656R.C2657id.detail_result_graph_child_scroll_sc);
                }

                /* renamed from: a */
                public void mo8897a() {
                    String str;
                    String str2;
                    int i;
                    C2552t a = C2557y.f9832d.clone();
                    int d = C2556x.f9805v[C2411ax.this.f8255c].mo9977d();
                    ArrayList<C2614s> b = C2556x.f9805v[C2411ax.this.f8255c].mo9974b();
                    ArrayList<C2615t> c = C2556x.f9805v[C2411ax.this.f8255c].mo9976c();
                    int i2 = 0;
                    int i3 = 0;
                    String str3 = "";
                    if (a.f9747c != 2) {
                        this.f8271B = 58;
                        switch (a.f9755k) {
                            case 1:
                            case 2:
                            case 3:
                            case 7:
                                str3 = " 5~6cm";
                                this.f8272C = 84;
                                this.f8297j.setVisibility(0);
                                break;
                            case 4:
                            case 5:
                            case 6:
                            case 8:
                                str3 = " 5cm~";
                                this.f8272C = 100;
                                this.f8297j.setVisibility(4);
                                break;
                            case 9:
                                str3 = " 4~6cm";
                                this.f8271B = 45;
                                this.f8272C = 84;
                                this.f8297j.setVisibility(0);
                                break;
                            case 10:
                                str3 = " 4cm~";
                                this.f8271B = 45;
                                this.f8272C = 100;
                                this.f8297j.setVisibility(4);
                                break;
                        }
                        str = " 400~700ml";
                        str2 = str3;
                    } else {
                        this.f8272C = 65;
                        this.f8271B = 45;
                        str = " 140~350ml";
                        str2 = " 4~5cm";
                    }
                    if (c == null || b == null) {
                        this.f8310w.setScaleWidth(0.0f);
                    } else {
                        this.f8311x = new ImageView[c.size()];
                        this.f8312y = (ImageView[][]) Array.newInstance(ImageView.class, new int[]{c.size(), 2});
                        this.f8313z = new ImageView[c.size()];
                        for (int i4 = 0; i4 < c.size(); i4++) {
                            this.f8311x[i4] = new ImageView(C2411ax.this.getActivity());
                            this.f8312y[i4][0] = new ImageView(C2411ax.this.getActivity());
                            this.f8312y[i4][1] = new ImageView(C2411ax.this.getActivity());
                            this.f8313z[i4] = new ImageView(C2411ax.this.getActivity());
                        }
                        this.f8310w.removeAllViews();
                        if (c.size() > 0) {
                            double a2 = c.get(0).mo10000a();
                            int i5 = 0;
                            int i6 = 0;
                            while (i6 < d) {
                                C2614s sVar = b.get(i6);
                                int a3 = sVar.mo9979a();
                                int i7 = sVar.mo9992i();
                                if (i6 > 0) {
                                    mo8899a(c.get(i3), c.get(i2), a2, b.get(i6 - 1), 0.0f);
                                    mo8900a(c.get(i5), c.get(i2), a2, b.get(i6 - 1), i6, 0.0f);
                                    i = i2;
                                } else {
                                    i = i5;
                                }
                                int i8 = 0;
                                int i9 = i3;
                                while (true) {
                                    int i10 = i2;
                                    if (i8 < a3) {
                                        mo8898a(c.get(i10), i10, a2);
                                        i2 = i10 + 1;
                                        i8++;
                                        i9 = i10;
                                    } else {
                                        int i11 = 0;
                                        int i12 = i10;
                                        while (true) {
                                            int i13 = i11;
                                            if (i13 < i7) {
                                                mo8902b(c.get(i12), i12, a2);
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
                                mo8899a(c.get(i3), tVar, a2, b.get(d - 1), 50.0f);
                                mo8900a(c.get(i5), tVar, a2, b.get(d - 1), d, 50.0f);
                            }
                            int a4 = (int) ((tVar.mo10000a() - a2) / 5000.0d);
                            this.f8270A = new TextView[(a4 + 1)];
                            for (int i14 = 0; i14 <= a4; i14++) {
                                this.f8270A[i14] = new TextView(C2411ax.this.getActivity());
                                this.f8270A[i14].setText((i14 * 5) + "");
                                this.f8270A[i14].setGravity(16);
                                this.f8310w.mo10058a((View) this.f8270A[i14], (((float) (i14 * 5000)) * 0.105588235f) + 0.0f, 855.0f, 100.0f, 50.0f);
                                this.f8310w.mo10059a(this.f8270A[i14], 25.0f);
                            }
                            this.f8310w.setScaleWidth(0.0f + (((float) (tVar.mo10000a() - a2)) * 0.105588235f) + 50.0f);
                        } else {
                            this.f8310w.setScaleWidth(0.0f);
                        }
                    }
                    this.f8308u.removeView(this.f8290c);
                    this.f8308u.removeView(this.f8289b);
                    this.f8308u.removeView(this.f8291d);
                    this.f8308u.mo10058a((View) this.f8290c, 0.0f, 60.0f + (((float) this.f8271B) * 2.5f), 2095.0f, 1.0f);
                    this.f8308u.mo10058a((View) this.f8289b, 0.0f, 60.0f + (((float) this.f8271B) * 2.5f), 2095.0f, ((float) (this.f8272C - this.f8271B)) * 2.5f);
                    this.f8308u.mo10058a((View) this.f8291d, 0.0f, 60.0f + (((float) this.f8272C) * 2.5f), 2095.0f, 1.0f);
                    this.f8309v.removeView(this.f8296i);
                    this.f8309v.mo10058a((View) this.f8296i, 0.0f, 60.0f + (((float) this.f8271B) * 2.5f), 300.0f, 35.0f);
                    this.f8309v.mo10059a(this.f8296i, 25.0f);
                    this.f8292e.setText(C2557y.f9835g.f10323dK);
                    this.f8292e.setTextColor(-10658467);
                    this.f8293f.setText(C2557y.f9835g.f10392ea);
                    this.f8293f.setTextColor(-13520490);
                    this.f8294g.setText(C2557y.f9835g.f10393eb);
                    this.f8294g.setTextColor(-10658467);
                    this.f8295h.setText(C2557y.f9835g.f10330dR);
                    this.f8295h.setTextColor(-13520490);
                    this.f8296i.setText(C2557y.f9835g.f10331dS + str2);
                    this.f8296i.setTextColor(-13520490);
                    this.f8297j.setText(C2557y.f9835g.f10332dT);
                    this.f8297j.setTextColor(-764642);
                    this.f8298k.setText(C2557y.f9835g.f10336dX);
                    this.f8298k.setTextColor(-764642);
                    this.f8299l.setText(C2557y.f9835g.f10337dY + str);
                    this.f8299l.setTextColor(-13520490);
                    this.f8300m.setText(C2557y.f9835g.f10338dZ);
                    this.f8300m.setTextColor(-12964);
                    this.f8301n.setText(C2557y.f9835g.f10324dL);
                    this.f8301n.setTextColor(-10658467);
                    this.f8302o.setText(C2557y.f9835g.f10333dU);
                    this.f8302o.setTextColor(-764642);
                    this.f8303p.setText(C2557y.f9835g.f10334dV + " 100~120/" + C2557y.f9835g.f10349dk);
                    this.f8303p.setTextColor(-13520490);
                    this.f8304q.setText(C2557y.f9835g.f10335dW);
                    this.f8304q.setTextColor(-12964);
                    this.f8305r.setText(C2557y.f9835g.f10333dU);
                    this.f8305r.setTextColor(-764642);
                    this.f8306s.setText(C2557y.f9835g.f10334dV + " 4~12/" + C2557y.f9835g.f10349dk);
                    this.f8306s.setTextColor(-13520490);
                    this.f8307t.setText(C2557y.f9835g.f10335dW);
                    this.f8307t.setTextColor(-12964);
                }

                /* access modifiers changed from: package-private */
                /* renamed from: a */
                public void mo8898a(C2615t tVar, int i, double d) {
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
                        this.f8312y[i][0].setImageResource(C2656R.drawable.graph_c_x);
                        this.f8312y[i][1].setImageResource(C2656R.drawable.graph_c_x);
                        this.f8310w.mo10058a((View) this.f8312y[i][0], 0.0f + a, 70.0f, 25.0f, 13.0f);
                        this.f8310w.mo10058a((View) this.f8312y[i][1], 0.0f + a, 182.0f, 25.0f, 13.0f);
                        this.f8313z[i].setImageResource(C2656R.drawable.graph_c_x);
                        z = false;
                    } else {
                        if (min < this.f8271B) {
                            this.f8311x[i].setBackgroundResource(C2656R.drawable.graph_c_depth_y);
                        } else if (min > this.f8272C) {
                            this.f8311x[i].setBackgroundResource(C2656R.drawable.graph_c_depth_r);
                        } else {
                            this.f8311x[i].setBackgroundResource(C2656R.drawable.graph_c_depth_g);
                        }
                        if (min2 > 0) {
                            this.f8312y[i][0].setImageResource(C2656R.drawable.graph_c_arrow_u);
                            this.f8310w.mo10058a((View) this.f8312y[i][0], 0.0f + a, (60.0f + f) - 17.0f, 25.0f, 13.0f);
                        }
                        this.f8310w.mo10058a((View) this.f8311x[i], 0.0f + a, 60.0f + f, 25.0f, f2 - f);
                        z = true;
                    }
                    if (g < 0.5d) {
                        if (z) {
                            this.f8313z[i].setImageResource(C2656R.drawable.graph_c_rate_r);
                        }
                        this.f8310w.mo10058a((View) this.f8313z[i], 0.0f + a, 626.0f, 25.0f, 13.0f);
                    } else if (g > 0.6d) {
                        if (z) {
                            this.f8313z[i].setImageResource(C2656R.drawable.graph_c_rate_y);
                        }
                        this.f8310w.mo10058a((View) this.f8313z[i], 0.0f + a, 696.0f, 25.0f, 13.0f);
                    } else {
                        if (z) {
                            this.f8313z[i].setImageResource(C2656R.drawable.graph_c_rate_g);
                        }
                        this.f8310w.mo10058a((View) this.f8313z[i], 0.0f + a, 661.0f, 25.0f, 13.0f);
                    }
                }

                /* access modifiers changed from: package-private */
                /* renamed from: a */
                public void mo8899a(C2615t tVar, C2615t tVar2, double d, C2614s sVar, float f) {
                    float a = ((float) (tVar.mo10000a() - d)) * 0.105588235f;
                    float a2 = (((float) (tVar2.mo10000a() - d)) * 0.105588235f) + f;
                    ImageView imageView = new ImageView(C2411ax.this.getActivity());
                    imageView.setBackgroundColor(-1118225);
                    this.f8310w.mo10058a((View) imageView, 0.0f + a + 25.0f, 105.0f, (a2 - a) - 25.0f, 55.0f);
                    TextView textView = new TextView(C2411ax.this.getActivity());
                    textView.setGravity(16);
                    textView.setTextColor(-10658467);
                    textView.setText(String.format("%.2f", new Object[]{Double.valueOf(sVar.mo9984b())}));
                    this.f8310w.mo10058a((View) textView, 0.0f + a + 25.0f, 260.0f, 120.0f, 50.0f);
                    this.f8310w.mo10059a(textView, 35.0f);
                    TextView textView2 = new TextView(C2411ax.this.getActivity());
                    textView2.setGravity(21);
                    textView2.setTextColor(-10658467);
                    textView2.setText(String.format("%.2f", new Object[]{Double.valueOf(sVar.mo9994k())}));
                    this.f8310w.mo10058a((View) textView2, (0.0f + a2) - 150.0f, 60.0f, 120.0f, 145.0f);
                    this.f8310w.mo10059a(textView2, 45.0f);
                }

                /* access modifiers changed from: package-private */
                /* renamed from: a */
                public void mo8900a(C2615t tVar, C2615t tVar2, double d, C2614s sVar, int i, float f) {
                    float a = ((float) (tVar.mo10000a() - d)) * 0.105588235f;
                    float a2 = (((float) (tVar2.mo10000a() - d)) * 0.105588235f) + f;
                    ImageView imageView = new ImageView(C2411ax.this.getActivity());
                    imageView.setBackgroundResource(C2656R.drawable.img_test_result_line_v);
                    this.f8310w.mo10058a((View) imageView, (0.0f + a2) - 2.0f, 60.0f, 4.0f, 1227.0f);
                    if (sVar.mo9984b() + sVar.mo9994k() > 7.0d) {
                        TextView textView = new TextView(C2411ax.this.getActivity());
                        textView.setGravity(17);
                        textView.setTextColor(-10658467);
                        textView.setText(String.format("%s%d", new Object[]{C2557y.f9835g.f10141O, Integer.valueOf(i)}));
                        this.f8310w.mo10058a((View) textView, 0.0f + a, 915.0f, a2 - a, 70.0f);
                        this.f8310w.mo10059a(textView, 55.0f);
                        TextView textView2 = new TextView(C2411ax.this.getActivity());
                        textView2.setGravity(1);
                        textView2.setTextColor(-10658467);
                        textView2.setText(String.format("[%s]\n%d/%d, %.1fcm, %d/%s", new Object[]{C2557y.f9835g.f10147U, Integer.valueOf(sVar.mo9986c()), Integer.valueOf(sVar.mo9979a()), Double.valueOf(sVar.mo9995l() / 10.0d), Integer.valueOf((int) sVar.mo9996m()), C2557y.f9835g.f10349dk}));
                        this.f8310w.mo10058a((View) textView2, 0.0f + a, 985.0f, a2 - a, 100.0f);
                        this.f8310w.mo10059a(textView2, 40.0f);
                        TextView textView3 = new TextView(C2411ax.this.getActivity());
                        textView3.setGravity(1);
                        textView3.setTextColor(-10658467);
                        textView3.setText(String.format("[%s]\n%d/%d, %dml", new Object[]{C2557y.f9835g.f10148V, Integer.valueOf(sVar.mo9993j()), Integer.valueOf(sVar.mo9992i()), Integer.valueOf((int) sVar.mo9997n())}));
                        this.f8310w.mo10058a((View) textView3, 0.0f + a, 1092.5f, a2 - a, 100.0f);
                        this.f8310w.mo10059a(textView3, 40.0f);
                        TextView textView4 = new TextView(C2411ax.this.getActivity());
                        textView4.setGravity(1);
                        textView4.setTextColor(-10658467);
                        textView4.setText(String.format("[%s]\n%.1f%s", new Object[]{C2557y.f9835g.f10184ae, Double.valueOf(sVar.mo9994k()), C2557y.f9835g.f10348dj}));
                        this.f8310w.mo10058a((View) textView4, 0.0f + a, 1200.0f, a2 - a, 100.0f);
                        this.f8310w.mo10059a(textView4, 40.0f);
                        int[] iArr = new int[5];
                        ImageView imageView2 = new ImageView(C2411ax.this.getActivity());
                        ImageView[] imageViewArr = new ImageView[5];
                        TextView[] textViewArr = new TextView[5];
                        this.f8310w.mo10058a((View) imageView2, 0.0f + a + (((a2 - a) - 413.0f) / 2.0f), 1300.0f, 413.0f, 210.0f);
                        for (int i2 = 0; i2 < 5; i2++) {
                            imageViewArr[i2] = new ImageView(C2411ax.this.getActivity());
                            this.f8310w.mo10058a((View) imageViewArr[i2], 0.0f + a + (((a2 - a) - 413.0f) / 2.0f), 1300.0f, 413.0f, 210.0f);
                            textViewArr[i2] = new TextView(C2411ax.this.getActivity());
                            textViewArr[i2].setGravity(17);
                            textViewArr[i2].setTextColor(-10658467);
                        }
                        imageView2.setImageResource(C2656R.drawable.img_result_manikin_d);
                        imageViewArr[0].setImageResource(C2656R.drawable.img_result_manikin_h);
                        imageViewArr[1].setImageResource(C2656R.drawable.img_result_manikin_la);
                        imageViewArr[2].setImageResource(C2656R.drawable.img_result_manikin_s);
                        imageViewArr[3].setImageResource(C2656R.drawable.img_result_manikin_ra);
                        imageViewArr[4].setImageResource(C2656R.drawable.img_result_manikin_c);
                        this.f8310w.mo10058a((View) textViewArr[0], 0.0f + a + (((a2 - a) - 413.0f) / 2.0f) + 140.0f, 1375.0f, 80.0f, 60.0f);
                        this.f8310w.mo10058a((View) textViewArr[1], 0.0f + a + (((a2 - a) - 413.0f) / 2.0f) + 300.0f, 1375.0f, 80.0f, 60.0f);
                        this.f8310w.mo10058a((View) textViewArr[2], 0.0f + a + (((a2 - a) - 413.0f) / 2.0f) + 220.0f, 1315.0f, 80.0f, 60.0f);
                        this.f8310w.mo10058a((View) textViewArr[3], 0.0f + a + (((a2 - a) - 413.0f) / 2.0f) + 220.0f, 1435.0f, 80.0f, 60.0f);
                        this.f8310w.mo10058a((View) textViewArr[4], 0.0f + a + (((a2 - a) - 413.0f) / 2.0f) + 220.0f, 1375.0f, 80.0f, 60.0f);
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
                                    this.f8310w.mo10059a(textViewArr[i4], 30.0f);
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
                                this.f8310w.mo10059a(textViewArr[i5], 30.0f);
                            }
                        }
                    }
                }

                /* renamed from: b */
                public void mo8901b() {
                    this.f8288a.setVisibility(0);
                }

                /* access modifiers changed from: package-private */
                /* renamed from: b */
                public void mo8902b(C2615t tVar, int i, double d) {
                    int f = tVar.mo10014f();
                    double g = 60.0d / tVar.mo10015g();
                    int min = Math.min(Math.max(f, 0), 100);
                    float f2 = (((float) min) * 150.0f) / 100.0f;
                    float a = ((float) (tVar.mo10000a() - d)) * 0.105588235f;
                    if (min > 0) {
                        if (min < 35) {
                            this.f8311x[i].setBackgroundResource(C2656R.drawable.graph_b_volume_y);
                        } else if (min > 70) {
                            this.f8311x[i].setBackgroundResource(C2656R.drawable.graph_b_volume_r);
                        } else {
                            this.f8311x[i].setBackgroundResource(C2656R.drawable.graph_b_volume_g);
                        }
                        this.f8310w.mo10058a((View) this.f8311x[i], 0.0f + a, 490.0f - f2, 50.0f, f2);
                    }
                    if (g < 5.0d) {
                        this.f8313z[i].setImageResource(C2656R.drawable.graph_b_rate_r);
                        this.f8310w.mo10058a((View) this.f8313z[i], 0.0f + a, 761.0f, 50.0f, 13.0f);
                    } else if (g > 15.0d) {
                        this.f8313z[i].setImageResource(C2656R.drawable.graph_b_rate_y);
                        this.f8310w.mo10058a((View) this.f8313z[i], 0.0f + a, 831.0f, 50.0f, 13.0f);
                    } else {
                        this.f8313z[i].setImageResource(C2656R.drawable.graph_b_rate_g);
                        this.f8310w.mo10058a((View) this.f8313z[i], 0.0f + a, 796.0f, 50.0f, 13.0f);
                    }
                }

                /* renamed from: c */
                public void mo8903c() {
                    this.f8288a.setVisibility(4);
                }
            }

            public C2413a(View view) {
                this.f8266a = (ScrollView) view.findViewById(C2656R.C2657id.detail_result_detail_scroll);
                this.f8267b = (ScalableLayout) view.findViewById(C2656R.C2657id.detail_result_detail_scroll_sc);
                this.f8268c = new C2414a(view);
            }

            /* renamed from: a */
            public void mo8894a() {
                this.f8268c.mo8897a();
                this.f8266a.scrollTo(0, 0);
            }

            /* renamed from: b */
            public void mo8895b() {
                this.f8266a.setVisibility(0);
            }

            /* renamed from: c */
            public void mo8896c() {
                this.f8266a.setVisibility(4);
            }
        }

        /* renamed from: com.imlabworld.HS_Instructor.ax$a$b */
        class C2415b {

            /* renamed from: A */
            final ScalableLayout f8314A;

            /* renamed from: a */
            final ScrollView f8316a;

            /* renamed from: b */
            final ImageView f8317b;

            /* renamed from: c */
            final TextView f8318c;

            /* renamed from: d */
            final TextView f8319d;

            /* renamed from: e */
            final TextView f8320e;

            /* renamed from: f */
            final TextView f8321f;

            /* renamed from: g */
            final TextView f8322g;

            /* renamed from: h */
            final TextView f8323h;

            /* renamed from: i */
            final TextView f8324i;

            /* renamed from: j */
            final TextView f8325j;

            /* renamed from: k */
            final TextView f8326k;

            /* renamed from: l */
            final TextView f8327l;

            /* renamed from: m */
            final TextView f8328m;

            /* renamed from: n */
            final TextView f8329n;

            /* renamed from: o */
            final TextView f8330o;

            /* renamed from: p */
            final TextView f8331p;

            /* renamed from: q */
            final TextView f8332q;

            /* renamed from: r */
            final TextView f8333r;

            /* renamed from: s */
            final TextView f8334s;

            /* renamed from: t */
            final TextView f8335t;

            /* renamed from: u */
            final TextView f8336u;

            /* renamed from: v */
            final TextView f8337v;

            /* renamed from: w */
            final TextView f8338w;

            /* renamed from: x */
            final TextView f8339x;

            /* renamed from: y */
            final ImageView[] f8340y = new ImageView[5];

            /* renamed from: z */
            final TextView[] f8341z = new TextView[5];

            public C2415b(View view) {
                this.f8316a = (ScrollView) view.findViewById(C2656R.C2657id.detail_result_overview_scroll);
                this.f8317b = (ImageView) view.findViewById(C2656R.C2657id.detail_result_overview_result_score_box);
                this.f8318c = (TextView) view.findViewById(C2656R.C2657id.detail_result_overview_result_score_title);
                this.f8319d = (TextView) view.findViewById(C2656R.C2657id.detail_result_overview_result_score_txt);
                this.f8320e = (TextView) view.findViewById(C2656R.C2657id.detail_result_overview_average_title);
                this.f8321f = (TextView) view.findViewById(C2656R.C2657id.detail_result_overview_comp_score_title);
                this.f8322g = (TextView) view.findViewById(C2656R.C2657id.detail_result_overview_comp_score_txt);
                this.f8323h = (TextView) view.findViewById(C2656R.C2657id.detail_result_overview_comp_success_rate_title);
                this.f8324i = (TextView) view.findViewById(C2656R.C2657id.detail_result_overview_comp_success_rate_txt);
                this.f8325j = (TextView) view.findViewById(C2656R.C2657id.detail_result_overview_comp_time_title);
                this.f8326k = (TextView) view.findViewById(C2656R.C2657id.detail_result_overview_comp_time_txt);
                this.f8327l = (TextView) view.findViewById(C2656R.C2657id.detail_result_overview_comp_depth_title);
                this.f8328m = (TextView) view.findViewById(C2656R.C2657id.detail_result_overview_comp_depth_txt);
                this.f8329n = (TextView) view.findViewById(C2656R.C2657id.detail_result_overview_breath_score_title);
                this.f8330o = (TextView) view.findViewById(C2656R.C2657id.detail_result_overview_breath_score_txt);
                this.f8331p = (TextView) view.findViewById(C2656R.C2657id.detail_result_overview_breath_success_rate_title);
                this.f8332q = (TextView) view.findViewById(C2656R.C2657id.detail_result_overview_breath_success_rate_txt);
                this.f8333r = (TextView) view.findViewById(C2656R.C2657id.detail_result_overview_breath_amount_title);
                this.f8334s = (TextView) view.findViewById(C2656R.C2657id.detail_result_overview_breath_amount_txt);
                this.f8335t = (TextView) view.findViewById(C2656R.C2657id.detail_result_overview_hot_score_title);
                this.f8336u = (TextView) view.findViewById(C2656R.C2657id.detail_result_overview_hot_score_txt);
                this.f8337v = (TextView) view.findViewById(C2656R.C2657id.detail_result_overview_hot_time_txt);
                this.f8338w = (TextView) view.findViewById(C2656R.C2657id.detail_result_overview_cpm_txt);
                this.f8339x = (TextView) view.findViewById(C2656R.C2657id.detail_result_overview_compression_position_title);
                this.f8340y[0] = (ImageView) view.findViewById(C2656R.C2657id.detail_result_overview_compression_position_h);
                this.f8340y[1] = (ImageView) view.findViewById(C2656R.C2657id.detail_result_overview_compression_position_la);
                this.f8340y[2] = (ImageView) view.findViewById(C2656R.C2657id.detail_result_overview_compression_position_s);
                this.f8340y[3] = (ImageView) view.findViewById(C2656R.C2657id.detail_result_overview_compression_position_ra);
                this.f8340y[4] = (ImageView) view.findViewById(C2656R.C2657id.detail_result_overview_compression_position_c);
                this.f8341z[0] = (TextView) view.findViewById(C2656R.C2657id.detail_result_overview_compression_position_h_txt);
                this.f8341z[1] = (TextView) view.findViewById(C2656R.C2657id.detail_result_overview_compression_position_la_txt);
                this.f8341z[2] = (TextView) view.findViewById(C2656R.C2657id.detail_result_overview_compression_position_s_txt);
                this.f8341z[3] = (TextView) view.findViewById(C2656R.C2657id.detail_result_overview_compression_position_ra_txt);
                this.f8341z[4] = (TextView) view.findViewById(C2656R.C2657id.detail_result_overview_compression_position_c_txt);
                this.f8314A = (ScalableLayout) view.findViewById(C2656R.C2657id.detail_result_overview_child_scroll_sc);
            }

            /* renamed from: a */
            public void mo8904a() {
                double d;
                double d2;
                double d3;
                double d4;
                C2591b bVar = C2556x.f9807x[C2411ax.this.f8255c];
                int round = (int) Math.round(bVar.mo9904j() * 100.0d);
                this.f8318c.setText(C2557y.f9835g.f10362dx);
                this.f8319d.setText(round + "");
                if (round >= 70) {
                    this.f8317b.setImageResource(C2656R.drawable.img_test_result_box_green);
                } else if (round > 0) {
                    this.f8317b.setImageResource(C2656R.drawable.img_test_result_box_yellow);
                } else {
                    this.f8317b.setImageResource(C2656R.drawable.img_test_result_box_red);
                }
                this.f8320e.setText(C2557y.f9835g.f10569hz);
                int round2 = (int) Math.round(bVar.mo9898g() * 100.0d);
                int round3 = (int) Math.round(bVar.mo9900h() * 100.0d);
                int round4 = (int) Math.round(bVar.mo9902i() * 100.0d);
                this.f8321f.setText(C2557y.f9835g.f10147U);
                this.f8323h.setText(C2557y.f9835g.f10541hQ);
                this.f8325j.setText(C2557y.f9835g.f10185af + "\n(CPM*)");
                this.f8327l.setText(C2557y.f9835g.f10188ai + "\n(cm)");
                this.f8329n.setText(C2557y.f9835g.f10148V);
                this.f8331p.setText(C2557y.f9835g.f10541hQ);
                this.f8333r.setText(C2557y.f9835g.f10572k + "\n(ml)");
                this.f8335t.setText(C2557y.f9835g.f10184ae);
                this.f8339x.setText(C2557y.f9835g.f10314dB);
                if (round2 == -100) {
                    this.f8322g.setText("-");
                } else {
                    this.f8322g.setText(round2 + "");
                }
                if (round3 == -100) {
                    this.f8330o.setText("-");
                } else {
                    this.f8330o.setText(round3 + "");
                }
                if (round4 == -100) {
                    this.f8336u.setText("-");
                } else {
                    this.f8336u.setText(round4 + "");
                }
                this.f8338w.setText(C2557y.f9835g.f10542hR);
                C2552t a = C2557y.f9832d.clone();
                double d5 = 5.0d;
                double d6 = 6.0d;
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
                        d = 700.0d;
                        d2 = 400.0d;
                        d3 = 6.0d;
                        d4 = 5.0d;
                        break;
                }
                int d7 = C2556x.f9805v[C2411ax.this.f8255c].mo9977d();
                ArrayList<C2614s> b = C2556x.f9805v[C2411ax.this.f8255c].mo9974b();
                double d8 = 0.0d;
                int i = 0;
                double d9 = 0.0d;
                int[] iArr = new int[5];
                for (int i2 = 0; i2 < 5; i2++) {
                    iArr[i2] = 0;
                }
                this.f8314A.setScaleWidth((float) (d7 * C1644a.C1650a.f5539b));
                this.f8314A.removeAllViews();
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
                    double b2 = d10 + sVar.mo9984b();
                    double l = d8 + ((sVar.mo9995l() / 10.0d) * ((double) sVar.mo9991h()));
                    int n = (int) (((double) i) + (sVar.mo9997n() * ((double) sVar.mo9992i())));
                    double k = i7 < d7 + -1 ? sVar.mo9994k() + d9 : d9;
                    TextView textView = new TextView(C2411ax.this.getActivity());
                    textView.setGravity(17);
                    textView.setText(String.format("%d", new Object[]{Integer.valueOf(i7 + 1)}));
                    this.f8314A.mo10058a((View) textView, (float) (i7 * C1644a.C1650a.f5539b), 0.0f, 250.0f, 136.0f);
                    this.f8314A.mo10059a(textView, 45.0f);
                    TextView textView2 = new TextView(C2411ax.this.getActivity());
                    textView2.setGravity(17);
                    if (round2 == -100) {
                        textView2.setText("-");
                    } else {
                        textView2.setText(String.format("%d/%d", new Object[]{Integer.valueOf(sVar.mo9986c()), Integer.valueOf(sVar.mo9979a())}));
                    }
                    this.f8314A.mo10058a((View) textView2, (float) (i7 * C1644a.C1650a.f5539b), 150.0f, 250.0f, 100.0f);
                    this.f8314A.mo10059a(textView2, 45.0f);
                    TextView textView3 = new TextView(C2411ax.this.getActivity());
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
                    this.f8314A.mo10058a((View) textView3, (float) (i7 * C1644a.C1650a.f5539b), 250.0f, 250.0f, 160.0f);
                    this.f8314A.mo10059a(textView3, 45.0f);
                    TextView textView4 = new TextView(C2411ax.this.getActivity());
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
                    this.f8314A.mo10058a((View) textView4, (float) (i7 * C1644a.C1650a.f5539b), 410.0f, 250.0f, 160.0f);
                    this.f8314A.mo10059a(textView4, 45.0f);
                    TextView textView5 = new TextView(C2411ax.this.getActivity());
                    textView5.setGravity(17);
                    if (round3 == -100) {
                        textView5.setText("-");
                    } else {
                        textView5.setText(String.format("%d/%d", new Object[]{Integer.valueOf(sVar.mo9993j()), Integer.valueOf(sVar.mo9992i())}));
                    }
                    this.f8314A.mo10058a((View) textView5, (float) (i7 * C1644a.C1650a.f5539b), 590.0f, 250.0f, 160.0f);
                    this.f8314A.mo10059a(textView5, 45.0f);
                    TextView textView6 = new TextView(C2411ax.this.getActivity());
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
                    this.f8314A.mo10058a((View) textView6, (float) (i7 * C1644a.C1650a.f5539b), 750.0f, 250.0f, 160.0f);
                    this.f8314A.mo10059a(textView6, 45.0f);
                    if (i7 < d7 - 1) {
                        TextView textView7 = new TextView(C2411ax.this.getActivity());
                        textView7.setGravity(17);
                        textView7.setText(String.format("%.1fs", new Object[]{Double.valueOf(sVar.mo9994k())}));
                        if (sVar.mo9994k() <= 10.0d) {
                            textView7.setTextColor(-10658467);
                        } else {
                            textView7.setTextColor(-764642);
                        }
                        this.f8314A.mo10058a((View) textView7, (float) ((i7 * C1644a.C1650a.f5539b) + 125), 916.0f, 250.0f, 310.0f);
                        this.f8314A.mo10059a(textView7, 45.0f);
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
                    this.f8324i.setText(String.format("%d", new Object[]{Integer.valueOf((i4 * 100) / i3)}) + "%");
                    this.f8326k.setText(String.format("%.1fs\n(%d)", new Object[]{Double.valueOf(d10 / ((double) d7)), Integer.valueOf((int) (((double) (i3 * 60)) / d10))}));
                    if (((double) (i3 * 60)) / d10 < 100.0d || ((double) (i3 * 60)) / d10 > 120.0d) {
                        this.f8326k.setTextColor(-764642);
                    } else {
                        this.f8326k.setTextColor(-10658467);
                    }
                } else {
                    this.f8324i.setText(String.format("%d", new Object[]{0}) + "%");
                    this.f8326k.setText(String.format("%.1fs\n(%d)", new Object[]{Float.valueOf(0.0f), 0}));
                    this.f8326k.setTextColor(-764642);
                }
                if (iArr[4] != 0) {
                    this.f8328m.setText(String.format("%.1f", new Object[]{Double.valueOf(d8 / ((double) iArr[4]))}));
                    if (d8 / ((double) iArr[4]) < d4) {
                        this.f8328m.setTextColor(-764642);
                    } else if (d8 / ((double) iArr[4]) <= d3) {
                        this.f8328m.setTextColor(-10658467);
                    } else {
                        this.f8328m.setTextColor(-12964);
                    }
                } else {
                    this.f8328m.setText(String.format("%.1f", new Object[]{Float.valueOf(0.0f)}));
                    this.f8328m.setTextColor(-764642);
                }
                if (i5 != 0) {
                    this.f8332q.setText(String.format("%d", new Object[]{Integer.valueOf((i6 * 100) / i5)}) + "%");
                    this.f8334s.setText(String.format("%d", new Object[]{Integer.valueOf(i / i5)}));
                    if (((double) (i / i5)) < d2) {
                        this.f8334s.setTextColor(-764642);
                    } else if (((double) (i / i5)) <= d) {
                        this.f8334s.setTextColor(-10658467);
                    } else {
                        this.f8334s.setTextColor(-12964);
                    }
                } else {
                    this.f8332q.setText(String.format("%d", new Object[]{0}) + "%");
                    this.f8334s.setText(String.format("%d", new Object[]{0}));
                    this.f8334s.setTextColor(-764642);
                }
                if (d7 >= 2) {
                    d9 /= (double) (d7 - 1);
                }
                this.f8337v.setText(String.format("%.1fs", new Object[]{Double.valueOf(d9)}));
                if (d9 <= 10.0d) {
                    this.f8337v.setTextColor(-10658467);
                } else {
                    this.f8337v.setTextColor(-764642);
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
                            this.f8340y[i10].setAlpha(min);
                            this.f8341z[i10].setText(iArr2[i10] + "%");
                            i9 = i10 + 1;
                        }
                    }
                } else {
                    for (int i11 = 0; i11 < 5; i11++) {
                        iArr2[i11] = 0;
                        this.f8340y[i11].setAlpha(0.0f);
                        this.f8341z[i11].setText(iArr2[i11] + "%");
                    }
                }
                this.f8316a.scrollTo(0, 0);
            }

            /* renamed from: b */
            public void mo8905b() {
                this.f8316a.setVisibility(0);
            }

            /* renamed from: c */
            public void mo8906c() {
                this.f8316a.setVisibility(4);
            }
        }

        public C2412a(View view) {
            this.f8264f = view;
            this.f8262d = new C2415b(view);
            this.f8263e = new C2413a(view);
            this.f8259a = (TextView) view.findViewById(C2656R.C2657id.detail_result_overview_btn);
            this.f8260b = (TextView) view.findViewById(C2656R.C2657id.detail_result_detail_btn);
            this.f8261c = (TextView) view.findViewById(C2656R.C2657id.detail_result_name_txt);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo8887a() {
            C2552t a = C2557y.f9832d.clone();
            this.f8259a.setText(C2557y.f9835g.f10540hP);
            this.f8260b.setText(C2557y.f9835g.f10358dt);
            this.f8263e.mo8894a();
            switch (a.f9747c) {
                case 1:
                case 2:
                    this.f8262d.mo8904a();
                    mo8891e();
                    this.f8259a.setOnClickListener(this);
                    this.f8260b.setOnClickListener(this);
                    return;
                default:
                    return;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo8888b() {
            this.f8259a.setAlpha(1.0f);
            this.f8259a.setBackgroundColor(-6434106);
            this.f8260b.setBackgroundColor(-526345);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo8889c() {
            this.f8259a.setAlpha(1.0f);
            this.f8259a.setBackgroundColor(-526345);
            this.f8260b.setBackgroundColor(-6434106);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo8890d() {
            this.f8259a.setAlpha(0.15f);
            this.f8259a.setBackgroundColor(-526345);
            this.f8260b.setBackgroundColor(-6434106);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo8891e() {
            this.f8262d.mo8905b();
            this.f8263e.mo8896c();
            mo8888b();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo8892f() {
            this.f8262d.mo8906c();
            this.f8263e.mo8895b();
            mo8889c();
        }

        public void onClick(View view) {
            switch (view.getId()) {
                case C2656R.C2657id.detail_result_detail_btn /*2131230990*/:
                    mo8892f();
                    return;
                case C2656R.C2657id.detail_result_overview_btn /*2131231028*/:
                    mo8891e();
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: com.imlabworld.HS_Instructor.ax$b */
    public enum C2416b {
        BACK
    }

    /* renamed from: com.imlabworld.HS_Instructor.ax$c */
    public interface C2417c {
        /* renamed from: a */
        void mo8590a(int i, C2416b bVar);
    }

    /* renamed from: a */
    public static C2411ax m13373a(String str) {
        C2411ax axVar = new C2411ax();
        Bundle bundle = new Bundle();
        bundle.putString(f8253a, str);
        axVar.setArguments(bundle);
        return axVar;
    }

    /* renamed from: a */
    public void mo8879a() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo8880a(int i) {
        this.f8255c = i;
        this.f8258f.mo8887a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo8881b(String str) {
        String str2 = "";
        switch (C2557y.f9832d.clone().f9747c) {
            case 1:
                str2 = C2557y.f9835g.f10581t.toUpperCase();
                break;
            case 2:
                str2 = C2557y.f9835g.f10272cM.toUpperCase();
                break;
            case 3:
                str2 = C2557y.f9835g.f10582u.toUpperCase();
                break;
        }
        if (str != null) {
            this.f8258f.f8261c.setText(str + " | " + str2);
        } else {
            this.f8258f.f8261c.setText("- | " + str2);
        }
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (activity instanceof C2417c) {
            this.f8257e = (C2417c) activity;
            return;
        }
        throw new RuntimeException(activity.toString() + " must implement OnFragmentInteractionListener");
    }

    public void onClick(View view) {
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.f8254b = getArguments().getString(f8253a);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f8256d = layoutInflater.inflate(C2656R.layout.detail_result, viewGroup, false);
        this.f8258f = new C2412a(this.f8256d);
        return this.f8256d;
    }

    public void onDetach() {
        super.onDetach();
        this.f8257e = null;
    }
}
