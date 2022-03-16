package com.imlabworld.HS_Instructor;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.p036v7.widget.p046a.C1644a;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.ssomai.android.scalablelayout.ScalableLayout;
import com.woxthebox.draglistview.C2656R;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* renamed from: com.imlabworld.HS_Instructor.br */
public class C2515br extends Fragment implements View.OnClickListener, AdapterView.OnItemClickListener {

    /* renamed from: a */
    private static final String f9370a = "param";

    /* renamed from: b */
    private String f9371b;

    /* renamed from: c */
    private View f9372c;

    /* renamed from: d */
    private C2526c f9373d;

    /* renamed from: e */
    private ScalableLayout f9374e;

    /* renamed from: f */
    private C2372am f9375f;

    /* renamed from: g */
    private int f9376g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C2548p f9377h;

    /* renamed from: i */
    private ArrayList<C2544l> f9378i;

    /* renamed from: j */
    private C2525b f9379j;

    /* renamed from: k */
    private C2516a f9380k;

    /* renamed from: com.imlabworld.HS_Instructor.br$a */
    class C2516a implements View.OnClickListener {

        /* renamed from: a */
        final ScalableLayout f9381a;

        /* renamed from: b */
        final TextView f9382b;

        /* renamed from: c */
        final TextView f9383c;

        /* renamed from: d */
        final TextView f9384d;

        /* renamed from: e */
        final C2524b f9385e;

        /* renamed from: f */
        final C2517a f9386f;

        /* renamed from: g */
        final View f9387g;

        /* renamed from: com.imlabworld.HS_Instructor.br$a$a */
        class C2517a {

            /* renamed from: a */
            final ScrollView f9389a;

            /* renamed from: b */
            final ScalableLayout f9390b;

            /* renamed from: c */
            final C2518a f9391c;

            /* renamed from: d */
            final C2519b f9392d;

            /* renamed from: e */
            final TextView f9393e;

            /* renamed from: f */
            final TextView f9394f;

            /* renamed from: com.imlabworld.HS_Instructor.br$a$a$a */
            class C2518a {

                /* renamed from: A */
                TextView[] f9396A;

                /* renamed from: B */
                int f9397B;

                /* renamed from: C */
                int f9398C;

                /* renamed from: D */
                final float f9399D = 0.0f;

                /* renamed from: E */
                final float f9400E = 60.0f;

                /* renamed from: F */
                final float f9401F = 25.0f;

                /* renamed from: G */
                final float f9402G = 250.0f;

                /* renamed from: H */
                float f9403H = 5.0f;

                /* renamed from: I */
                final float f9404I = 626.0f;

                /* renamed from: J */
                final float f9405J = 13.0f;

                /* renamed from: K */
                final float f9406K = 340.0f;

                /* renamed from: L */
                final float f9407L = 50.0f;

                /* renamed from: M */
                final float f9408M = 150.0f;

                /* renamed from: N */
                final float f9409N = 761.0f;

                /* renamed from: O */
                final float f9410O = 13.0f;

                /* renamed from: P */
                final int f9411P = 1795;

                /* renamed from: Q */
                final int f9412Q = 17;

                /* renamed from: a */
                final ScalableLayout f9414a;

                /* renamed from: b */
                final ImageView f9415b;

                /* renamed from: c */
                final ImageView f9416c;

                /* renamed from: d */
                final ImageView f9417d;

                /* renamed from: e */
                final TextView f9418e;

                /* renamed from: f */
                final TextView f9419f;

                /* renamed from: g */
                final TextView f9420g;

                /* renamed from: h */
                final TextView f9421h;

                /* renamed from: i */
                final TextView f9422i;

                /* renamed from: j */
                final TextView f9423j;

                /* renamed from: k */
                final TextView f9424k;

                /* renamed from: l */
                final TextView f9425l;

                /* renamed from: m */
                final TextView f9426m;

                /* renamed from: n */
                final TextView f9427n;

                /* renamed from: o */
                final TextView f9428o;

                /* renamed from: p */
                final TextView f9429p;

                /* renamed from: q */
                final TextView f9430q;

                /* renamed from: r */
                final TextView f9431r;

                /* renamed from: s */
                final TextView f9432s;

                /* renamed from: t */
                final TextView f9433t;

                /* renamed from: u */
                final ScalableLayout f9434u;

                /* renamed from: v */
                final ScalableLayout f9435v;

                /* renamed from: w */
                final ScalableLayout f9436w;

                /* renamed from: x */
                ImageView[] f9437x;

                /* renamed from: y */
                ImageView[][] f9438y;

                /* renamed from: z */
                ImageView[] f9439z;

                public C2518a(View view) {
                    this.f9414a = (ScalableLayout) view.findViewById(C2656R.C2657id.view_result_graph_sc);
                    this.f9416c = (ImageView) view.findViewById(C2656R.C2657id.view_result_graph_c_depth_good_line_start);
                    this.f9415b = (ImageView) view.findViewById(C2656R.C2657id.view_result_graph_c_depth_good_range);
                    this.f9417d = (ImageView) view.findViewById(C2656R.C2657id.view_result_graph_c_depth_good_line_end);
                    this.f9418e = (TextView) view.findViewById(C2656R.C2657id.view_result_graph_amount_title);
                    this.f9419f = (TextView) view.findViewById(C2656R.C2657id.view_result_graph_c_depth_recoil_info);
                    this.f9420g = (TextView) view.findViewById(C2656R.C2657id.view_result_graph_c_depth_wp_info);
                    this.f9421h = (TextView) view.findViewById(C2656R.C2657id.view_result_graph_c_depth_recoil_title);
                    this.f9422i = (TextView) view.findViewById(C2656R.C2657id.view_result_graph_c_depth_good_title);
                    this.f9423j = (TextView) view.findViewById(C2656R.C2657id.view_result_graph_c_depth_strong_title);
                    this.f9424k = (TextView) view.findViewById(C2656R.C2657id.view_result_graph_b_volume_strong_title);
                    this.f9425l = (TextView) view.findViewById(C2656R.C2657id.view_result_graph_b_volume_good_title);
                    this.f9426m = (TextView) view.findViewById(C2656R.C2657id.view_result_graph_b_volume_weak_title);
                    this.f9427n = (TextView) view.findViewById(C2656R.C2657id.view_result_graph_rate_title);
                    this.f9428o = (TextView) view.findViewById(C2656R.C2657id.view_result_graph_c_rate_fast_title);
                    this.f9429p = (TextView) view.findViewById(C2656R.C2657id.view_result_graph_c_rate_good_title);
                    this.f9430q = (TextView) view.findViewById(C2656R.C2657id.view_result_graph_c_rate_slow_title);
                    this.f9431r = (TextView) view.findViewById(C2656R.C2657id.view_result_graph_b_rate_fast_title);
                    this.f9432s = (TextView) view.findViewById(C2656R.C2657id.view_result_graph_b_rate_good_title);
                    this.f9433t = (TextView) view.findViewById(C2656R.C2657id.view_result_graph_b_rate_slow_title);
                    this.f9434u = (ScalableLayout) view.findViewById(C2656R.C2657id.view_result_graph_line_sc);
                    this.f9435v = (ScalableLayout) view.findViewById(C2656R.C2657id.view_result_graph_txt_sc);
                    this.f9436w = (ScalableLayout) view.findViewById(C2656R.C2657id.view_result_graph_child_scroll_sc);
                }

                /* renamed from: a */
                public void mo9278a() {
                    this.f9414a.setVisibility(0);
                }

                /* access modifiers changed from: package-private */
                /* renamed from: a */
                public void mo9279a(C2542j jVar, int i, double d) {
                    boolean z;
                    int g = jVar.mo9447g();
                    int h = jVar.mo9449h();
                    double j = 60.0d / jVar.mo9453j();
                    int min = Math.min(Math.max(g, 0), 100);
                    int min2 = Math.min(Math.max(h, 0), 100);
                    float f = (((float) min2) * 250.0f) / 100.0f;
                    float f2 = (((float) min) * 250.0f) / 100.0f;
                    float d2 = ((float) (jVar.mo9441d() - d)) * 0.105588235f;
                    if (min == 0) {
                        this.f9438y[i][0].setImageResource(C2656R.drawable.graph_c_x);
                        this.f9438y[i][1].setImageResource(C2656R.drawable.graph_c_x);
                        this.f9436w.mo10058a((View) this.f9438y[i][0], 0.0f + d2, 70.0f, 25.0f, 13.0f);
                        this.f9436w.mo10058a((View) this.f9438y[i][1], 0.0f + d2, 182.0f, 25.0f, 13.0f);
                        this.f9439z[i].setImageResource(C2656R.drawable.graph_c_x);
                        z = false;
                    } else {
                        if (min < this.f9397B) {
                            this.f9437x[i].setBackgroundResource(C2656R.drawable.graph_c_depth_y);
                        } else if (min > this.f9398C) {
                            this.f9437x[i].setBackgroundResource(C2656R.drawable.graph_c_depth_r);
                        } else {
                            this.f9437x[i].setBackgroundResource(C2656R.drawable.graph_c_depth_g);
                        }
                        if (min2 > 0) {
                            this.f9438y[i][0].setImageResource(C2656R.drawable.graph_c_arrow_u);
                            this.f9436w.mo10058a((View) this.f9438y[i][0], 0.0f + d2, (60.0f + f) - 17.0f, 25.0f, 13.0f);
                        }
                        this.f9436w.mo10058a((View) this.f9437x[i], 0.0f + d2, 60.0f + f, 25.0f, f2 - f);
                        z = true;
                    }
                    if (j < 0.5d) {
                        if (z) {
                            this.f9439z[i].setImageResource(C2656R.drawable.graph_c_rate_r);
                        }
                        this.f9436w.mo10058a((View) this.f9439z[i], 0.0f + d2, 626.0f, 25.0f, 13.0f);
                    } else if (j > 0.6d) {
                        if (z) {
                            this.f9439z[i].setImageResource(C2656R.drawable.graph_c_rate_y);
                        }
                        this.f9436w.mo10058a((View) this.f9439z[i], 0.0f + d2, 696.0f, 25.0f, 13.0f);
                    } else {
                        if (z) {
                            this.f9439z[i].setImageResource(C2656R.drawable.graph_c_rate_g);
                        }
                        this.f9436w.mo10058a((View) this.f9439z[i], 0.0f + d2, 661.0f, 25.0f, 13.0f);
                    }
                }

                /* access modifiers changed from: package-private */
                /* renamed from: a */
                public void mo9280a(C2542j jVar, C2542j jVar2, double d, C2541i iVar, float f) {
                    float d2 = ((float) (jVar.mo9441d() - d)) * 0.105588235f;
                    float d3 = (((float) (jVar2.mo9441d() - d)) * 0.105588235f) + f;
                    ImageView imageView = new ImageView(C2515br.this.getActivity());
                    imageView.setBackgroundColor(-1118225);
                    this.f9436w.mo10058a((View) imageView, 0.0f + d2 + 25.0f, 105.0f, (d3 - d2) - 25.0f, 55.0f);
                    TextView textView = new TextView(C2515br.this.getActivity());
                    textView.setGravity(16);
                    textView.setTextColor(-10658467);
                    textView.setText(String.format("%.2f", new Object[]{Double.valueOf(iVar.mo9417f())}));
                    this.f9436w.mo10058a((View) textView, 0.0f + d2 + 25.0f, 260.0f, 120.0f, 50.0f);
                    this.f9436w.mo10059a(textView, 30.0f);
                    TextView textView2 = new TextView(C2515br.this.getActivity());
                    textView2.setGravity(21);
                    textView2.setTextColor(-10658467);
                    textView2.setText(String.format("%.2f", new Object[]{Double.valueOf(iVar.mo9423i())}));
                    this.f9436w.mo10058a((View) textView2, (0.0f + d3) - 150.0f, 60.0f, 120.0f, 145.0f);
                    this.f9436w.mo10059a(textView2, 45.0f);
                }

                /* access modifiers changed from: package-private */
                /* renamed from: a */
                public void mo9281a(C2542j jVar, C2542j jVar2, double d, C2541i iVar, int i, float f, double d2, int i2, int i3) {
                    float d3 = ((float) (jVar.mo9441d() - d)) * 0.105588235f;
                    float d4 = (((float) (jVar2.mo9441d() - d)) * 0.105588235f) + f;
                    ImageView imageView = new ImageView(C2515br.this.getActivity());
                    imageView.setBackgroundResource(C2656R.drawable.img_test_result_line_v);
                    this.f9436w.mo10058a((View) imageView, (0.0f + d4) - 2.0f, 60.0f, 4.0f, 1227.0f);
                    if (iVar.mo9417f() + iVar.mo9423i() > 7.0d) {
                        TextView textView = new TextView(C2515br.this.getActivity());
                        textView.setGravity(17);
                        textView.setTextColor(-10658467);
                        textView.setText(String.format("%s%d", new Object[]{C2557y.f9835g.f10141O, Integer.valueOf(i)}));
                        this.f9436w.mo10058a((View) textView, 0.0f + d3, 915.0f, d4 - d3, 70.0f);
                        this.f9436w.mo10059a(textView, 55.0f);
                        TextView textView2 = new TextView(C2515br.this.getActivity());
                        textView2.setGravity(1);
                        textView2.setTextColor(-10658467);
                        textView2.setText(String.format("[%s]\n%d/%d, %.1fcm, %d/%s", new Object[]{C2557y.f9835g.f10147U, Integer.valueOf(iVar.mo9415e()), Integer.valueOf(iVar.mo9413d()), Double.valueOf(d2), Integer.valueOf(i2), C2557y.f9835g.f10349dk}));
                        this.f9436w.mo10058a((View) textView2, 0.0f + d3, 985.0f, d4 - d3, 100.0f);
                        this.f9436w.mo10059a(textView2, 40.0f);
                        TextView textView3 = new TextView(C2515br.this.getActivity());
                        textView3.setGravity(1);
                        textView3.setTextColor(-10658467);
                        textView3.setText(String.format("[%s]\n%d/%d, %dml", new Object[]{C2557y.f9835g.f10148V, Integer.valueOf(iVar.mo9421h()), Integer.valueOf(iVar.mo9419g()), Integer.valueOf(i3)}));
                        this.f9436w.mo10058a((View) textView3, 0.0f + d3, 1092.5f, d4 - d3, 100.0f);
                        this.f9436w.mo10059a(textView3, 40.0f);
                        TextView textView4 = new TextView(C2515br.this.getActivity());
                        textView4.setGravity(1);
                        textView4.setTextColor(-10658467);
                        textView4.setText(String.format("[%s]\n%.1f%s", new Object[]{C2557y.f9835g.f10184ae, Double.valueOf(iVar.mo9423i()), C2557y.f9835g.f10348dj}));
                        this.f9436w.mo10058a((View) textView4, 0.0f + d3, 1200.0f, d4 - d3, 100.0f);
                        this.f9436w.mo10059a(textView4, 40.0f);
                        int[] iArr = new int[5];
                        ImageView imageView2 = new ImageView(C2515br.this.getActivity());
                        ImageView[] imageViewArr = new ImageView[5];
                        TextView[] textViewArr = new TextView[5];
                        this.f9436w.mo10058a((View) imageView2, 0.0f + d3 + (((d4 - d3) - 413.0f) / 2.0f), 1300.0f, 413.0f, 210.0f);
                        for (int i4 = 0; i4 < 5; i4++) {
                            imageViewArr[i4] = new ImageView(C2515br.this.getActivity());
                            this.f9436w.mo10058a((View) imageViewArr[i4], 0.0f + d3 + (((d4 - d3) - 413.0f) / 2.0f), 1300.0f, 413.0f, 210.0f);
                            textViewArr[i4] = new TextView(C2515br.this.getActivity());
                            textViewArr[i4].setGravity(17);
                            textViewArr[i4].setTextColor(-10658467);
                        }
                        imageView2.setImageResource(C2656R.drawable.img_result_manikin_d);
                        imageViewArr[0].setImageResource(C2656R.drawable.img_result_manikin_h);
                        imageViewArr[1].setImageResource(C2656R.drawable.img_result_manikin_la);
                        imageViewArr[2].setImageResource(C2656R.drawable.img_result_manikin_s);
                        imageViewArr[3].setImageResource(C2656R.drawable.img_result_manikin_ra);
                        imageViewArr[4].setImageResource(C2656R.drawable.img_result_manikin_c);
                        this.f9436w.mo10058a((View) textViewArr[0], 0.0f + d3 + (((d4 - d3) - 413.0f) / 2.0f) + 140.0f, 1375.0f, 80.0f, 60.0f);
                        this.f9436w.mo10058a((View) textViewArr[1], 0.0f + d3 + (((d4 - d3) - 413.0f) / 2.0f) + 220.0f, 1315.0f, 80.0f, 60.0f);
                        this.f9436w.mo10058a((View) textViewArr[2], 0.0f + d3 + (((d4 - d3) - 413.0f) / 2.0f) + 300.0f, 1375.0f, 80.0f, 60.0f);
                        this.f9436w.mo10058a((View) textViewArr[3], 0.0f + d3 + (((d4 - d3) - 413.0f) / 2.0f) + 220.0f, 1435.0f, 80.0f, 60.0f);
                        this.f9436w.mo10058a((View) textViewArr[4], 0.0f + d3 + (((d4 - d3) - 413.0f) / 2.0f) + 220.0f, 1375.0f, 80.0f, 60.0f);
                        if (iVar.mo9413d() != 0) {
                            iArr[0] = (iVar.mo9425j() * 100) / iVar.mo9413d();
                            iArr[1] = (iVar.mo9427k() * 100) / iVar.mo9413d();
                            iArr[2] = (iVar.mo9429l() * 100) / iVar.mo9413d();
                            iArr[3] = (iVar.mo9431m() * 100) / iVar.mo9413d();
                            iArr[4] = (iVar.mo9432n() * 100) / iVar.mo9413d();
                            int i5 = 0;
                            while (true) {
                                int i6 = i5;
                                if (i6 < 5) {
                                    float min = Math.min((((float) iArr[i6]) / 100.0f) + 0.2f, 1.0f);
                                    if (iArr[i6] == 0) {
                                        min = 0.0f;
                                    }
                                    imageViewArr[i6].setAlpha(min);
                                    textViewArr[i6].setText(iArr[i6] + "%");
                                    this.f9436w.mo10059a(textViewArr[i6], 30.0f);
                                    i5 = i6 + 1;
                                } else {
                                    return;
                                }
                            }
                        } else {
                            for (int i7 = 0; i7 < 5; i7++) {
                                iArr[i7] = 0;
                                imageViewArr[i7].setAlpha(0.0f);
                                textViewArr[i7].setText(iArr[i7] + "%");
                                this.f9436w.mo10059a(textViewArr[i7], 30.0f);
                            }
                        }
                    }
                }

                /* renamed from: a */
                public void mo9282a(C2544l lVar) {
                    String str;
                    String str2;
                    int i;
                    double d;
                    double d2;
                    double d3;
                    double d4;
                    ArrayList<C2541i> r = C2515br.this.f9377h.mo9613r(lVar.mo9470a());
                    ArrayList<C2542j> s = C2515br.this.f9377h.mo9614s(lVar.mo9470a());
                    int i2 = 0;
                    String str3 = "";
                    if (lVar.mo9483g() != 2) {
                        this.f9397B = 58;
                        switch (lVar.mo9485h()) {
                            case 1:
                            case 2:
                            case 3:
                            case 7:
                                str3 = " 5~6cm";
                                this.f9398C = 84;
                                this.f9423j.setVisibility(0);
                                break;
                            case 4:
                            case 5:
                            case 6:
                            case 8:
                                str3 = " 5cm~";
                                this.f9398C = 100;
                                this.f9423j.setVisibility(4);
                                break;
                            case 9:
                                str3 = " 4~6cm";
                                this.f9397B = 45;
                                this.f9398C = 84;
                                this.f9423j.setVisibility(0);
                                break;
                            case 10:
                                str3 = " 4cm~";
                                this.f9397B = 45;
                                this.f9398C = 100;
                                this.f9423j.setVisibility(4);
                                break;
                        }
                        str = " 400~700ml";
                        str2 = str3;
                    } else {
                        this.f9398C = 65;
                        this.f9397B = 45;
                        str = " 140~350ml";
                        str2 = " 4~5cm";
                    }
                    if (s == null || r == null) {
                        this.f9436w.setScaleWidth(0.0f);
                    } else {
                        int size = r.size();
                        this.f9437x = new ImageView[s.size()];
                        this.f9438y = (ImageView[][]) Array.newInstance(ImageView.class, new int[]{s.size(), 2});
                        this.f9439z = new ImageView[s.size()];
                        for (int i3 = 0; i3 < s.size(); i3++) {
                            this.f9437x[i3] = new ImageView(C2515br.this.getActivity());
                            this.f9438y[i3][0] = new ImageView(C2515br.this.getActivity());
                            this.f9438y[i3][1] = new ImageView(C2515br.this.getActivity());
                            this.f9439z[i3] = new ImageView(C2515br.this.getActivity());
                        }
                        this.f9436w.removeAllViews();
                        double d5 = 0.0d;
                        double d6 = 0.0d;
                        double d7 = 0.0d;
                        double d8 = 0.0d;
                        double d9 = 0.0d;
                        int i4 = 0;
                        if (s.size() > 0) {
                            double d10 = s.get(0).mo9441d();
                            int i5 = 0;
                            int i6 = 0;
                            while (i6 < size) {
                                C2541i iVar = r.get(i6);
                                int d11 = iVar.mo9413d();
                                int g = iVar.mo9419g();
                                if (i6 > 0) {
                                    mo9280a(s.get(i4), s.get(i2), d10, r.get(i6 - 1), 0.0f);
                                    mo9281a(s.get(i5), s.get(i2), d10, r.get(i6 - 1), i6, 0.0f, d7 / 10.0d, (int) d8, (int) d9);
                                    d = 0.0d;
                                    d3 = 0.0d;
                                    d2 = 0.0d;
                                    d4 = 0.0d;
                                    i = i2;
                                } else {
                                    i = i5;
                                    d = d5;
                                    d2 = d8;
                                    d3 = d6;
                                    d4 = d9;
                                }
                                int i7 = i4;
                                d8 = d2;
                                int i8 = i2;
                                double d12 = d3;
                                double d13 = d;
                                int i9 = 0;
                                while (i9 < d11) {
                                    C2542j jVar = s.get(i8);
                                    mo9279a(jVar, i8, d10);
                                    int i10 = i8 + 1;
                                    if (jVar.mo9447g() != 0) {
                                        d13 += C2515br.m13768c((double) jVar.mo9447g(), lVar.mo9483g());
                                        d12 += 1.0d;
                                    }
                                    i9++;
                                    d8 = (jVar.mo9453j() / ((double) d11)) + d8;
                                    i7 = i8;
                                    i8 = i10;
                                }
                                d7 = d12 != 0.0d ? d13 / d12 : 0.0d;
                                double d14 = d4;
                                int i11 = i8;
                                double d15 = d14;
                                for (int i12 = 0; i12 < g; i12++) {
                                    C2542j jVar2 = s.get(i11);
                                    mo9284b(jVar2, i11, d10);
                                    i11++;
                                    d15 += C2515br.m13769d((double) jVar2.mo9451i(), lVar.mo9483g()) / ((double) g);
                                }
                                i6++;
                                i4 = i7;
                                d9 = d15;
                                i2 = i11;
                                d6 = d12;
                                d5 = d13;
                                i5 = i;
                            }
                            double i13 = r.get(size - 1).mo9423i();
                            C2542j jVar3 = s.get(i2 - 1);
                            if (i13 > 0.0d) {
                                mo9280a(s.get(i4), jVar3, d10, r.get(size - 1), 50.0f);
                                mo9281a(s.get(i5), jVar3, d10, r.get(size - 1), size, 50.0f, d7 / 10.0d, (int) d8, (int) d9);
                            }
                            int d16 = (int) ((jVar3.mo9441d() - d10) / 5000.0d);
                            this.f9396A = new TextView[(d16 + 1)];
                            for (int i14 = 0; i14 <= d16; i14++) {
                                this.f9396A[i14] = new TextView(C2515br.this.getActivity());
                                this.f9396A[i14].setText((i14 * 5) + "");
                                this.f9396A[i14].setGravity(16);
                                this.f9436w.mo10058a((View) this.f9396A[i14], (((float) (i14 * 5000)) * 0.105588235f) + 0.0f, 855.0f, 100.0f, 50.0f);
                                this.f9436w.mo10059a(this.f9396A[i14], 25.0f);
                            }
                            this.f9436w.setScaleWidth(0.0f + (((float) (jVar3.mo9441d() - d10)) * 0.105588235f) + 50.0f);
                        } else {
                            this.f9436w.setScaleWidth(0.0f);
                        }
                    }
                    this.f9434u.removeView(this.f9416c);
                    this.f9434u.removeView(this.f9415b);
                    this.f9434u.removeView(this.f9417d);
                    this.f9434u.mo10058a((View) this.f9416c, 0.0f, 60.0f + (((float) this.f9397B) * 2.5f), 2095.0f, 1.0f);
                    this.f9434u.mo10058a((View) this.f9415b, 0.0f, 60.0f + (((float) this.f9397B) * 2.5f), 2095.0f, ((float) (this.f9398C - this.f9397B)) * 2.5f);
                    this.f9434u.mo10058a((View) this.f9417d, 0.0f, 60.0f + (((float) this.f9398C) * 2.5f), 2095.0f, 1.0f);
                    this.f9435v.removeView(this.f9422i);
                    this.f9435v.mo10058a((View) this.f9422i, 0.0f, 60.0f + (((float) this.f9397B) * 2.5f), 300.0f, 35.0f);
                    this.f9435v.mo10059a(this.f9422i, 25.0f);
                    this.f9418e.setText(C2557y.f9835g.f10323dK);
                    this.f9418e.setTextColor(-10658467);
                    this.f9419f.setText(C2557y.f9835g.f10392ea);
                    this.f9419f.setTextColor(-13520490);
                    this.f9420g.setText(C2557y.f9835g.f10393eb);
                    this.f9420g.setTextColor(-10658467);
                    this.f9421h.setText(C2557y.f9835g.f10330dR);
                    this.f9421h.setTextColor(-13520490);
                    this.f9422i.setText(C2557y.f9835g.f10331dS + str2);
                    this.f9422i.setTextColor(-13520490);
                    this.f9423j.setText(C2557y.f9835g.f10332dT);
                    this.f9423j.setTextColor(-764642);
                    this.f9424k.setText(C2557y.f9835g.f10336dX);
                    this.f9424k.setTextColor(-764642);
                    this.f9425l.setText(C2557y.f9835g.f10337dY + str);
                    this.f9425l.setTextColor(-13520490);
                    this.f9426m.setText(C2557y.f9835g.f10338dZ);
                    this.f9426m.setTextColor(-12964);
                    this.f9427n.setText(C2557y.f9835g.f10324dL);
                    this.f9427n.setTextColor(-10658467);
                    this.f9428o.setText(C2557y.f9835g.f10333dU);
                    this.f9428o.setTextColor(-764642);
                    this.f9429p.setText(C2557y.f9835g.f10334dV + " 100~120/" + C2557y.f9835g.f10349dk);
                    this.f9429p.setTextColor(-13520490);
                    this.f9430q.setText(C2557y.f9835g.f10335dW);
                    this.f9430q.setTextColor(-12964);
                    this.f9431r.setText(C2557y.f9835g.f10333dU);
                    this.f9431r.setTextColor(-764642);
                    this.f9432s.setText(C2557y.f9835g.f10334dV + " 4~12/" + C2557y.f9835g.f10349dk);
                    this.f9432s.setTextColor(-13520490);
                    this.f9433t.setText(C2557y.f9835g.f10335dW);
                    this.f9433t.setTextColor(-12964);
                }

                /* renamed from: b */
                public void mo9283b() {
                    this.f9414a.setVisibility(4);
                }

                /* access modifiers changed from: package-private */
                /* renamed from: b */
                public void mo9284b(C2542j jVar, int i, double d) {
                    int i2 = jVar.mo9451i();
                    double j = 60.0d / jVar.mo9453j();
                    int min = Math.min(Math.max(i2, 0), 100);
                    float f = (((float) min) * 150.0f) / 100.0f;
                    float d2 = ((float) (jVar.mo9441d() - d)) * 0.105588235f;
                    if (min > 0) {
                        if (min < 35) {
                            this.f9437x[i].setBackgroundResource(C2656R.drawable.graph_b_volume_y);
                        } else if (min > 70) {
                            this.f9437x[i].setBackgroundResource(C2656R.drawable.graph_b_volume_r);
                        } else {
                            this.f9437x[i].setBackgroundResource(C2656R.drawable.graph_b_volume_g);
                        }
                        this.f9436w.mo10058a((View) this.f9437x[i], 0.0f + d2, 490.0f - f, 50.0f, f);
                    }
                    if (j < 5.0d) {
                        this.f9439z[i].setImageResource(C2656R.drawable.graph_b_rate_r);
                        this.f9436w.mo10058a((View) this.f9439z[i], 0.0f + d2, 761.0f, 50.0f, 13.0f);
                    } else if (j > 15.0d) {
                        this.f9439z[i].setImageResource(C2656R.drawable.graph_b_rate_y);
                        this.f9436w.mo10058a((View) this.f9439z[i], 0.0f + d2, 831.0f, 50.0f, 13.0f);
                    } else {
                        this.f9439z[i].setImageResource(C2656R.drawable.graph_b_rate_g);
                        this.f9436w.mo10058a((View) this.f9439z[i], 0.0f + d2, 796.0f, 50.0f, 13.0f);
                    }
                }
            }

            /* renamed from: com.imlabworld.HS_Instructor.br$a$a$b */
            class C2519b {

                /* renamed from: a */
                final C2520a f9440a;

                /* renamed from: b */
                final C2521b f9441b;

                /* renamed from: c */
                final C2522c f9442c;

                /* renamed from: d */
                final C2523d f9443d;

                /* renamed from: e */
                int f9444e;

                /* renamed from: com.imlabworld.HS_Instructor.br$a$a$b$a */
                class C2520a {

                    /* renamed from: a */
                    final ScalableLayout f9446a;

                    /* renamed from: b */
                    final ScalableLayout[] f9447b = new ScalableLayout[5];

                    /* renamed from: c */
                    final TextView[] f9448c = new TextView[4];

                    /* renamed from: d */
                    final ScalableLayout[][] f9449d = ((ScalableLayout[][]) Array.newInstance(ScalableLayout.class, new int[]{4, 5}));

                    /* renamed from: e */
                    final TextView[][] f9450e = ((TextView[][]) Array.newInstance(TextView.class, new int[]{4, 5}));

                    /* renamed from: f */
                    final ImageView[][] f9451f = ((ImageView[][]) Array.newInstance(ImageView.class, new int[]{4, 5}));

                    /* renamed from: g */
                    final ImageView[][] f9452g = ((ImageView[][]) Array.newInstance(ImageView.class, new int[]{4, 5}));

                    /* renamed from: h */
                    final TextView f9453h;

                    /* renamed from: i */
                    final TextView[] f9454i = new TextView[2];

                    /* renamed from: j */
                    final ImageView[] f9455j = new ImageView[2];

                    /* renamed from: k */
                    final TextView f9456k;

                    /* renamed from: l */
                    final TextView f9457l;

                    /* renamed from: m */
                    final TextView[] f9458m = new TextView[2];

                    /* renamed from: n */
                    final TextView[] f9459n = new TextView[2];

                    /* renamed from: o */
                    final TextView[] f9460o = new TextView[2];

                    /* renamed from: p */
                    final TextView[] f9461p = new TextView[2];

                    /* renamed from: q */
                    final TextView[] f9462q = new TextView[2];

                    /* renamed from: r */
                    final TextView[] f9463r = new TextView[2];

                    /* renamed from: s */
                    final TextView f9464s;

                    /* renamed from: t */
                    final TextView f9465t;

                    /* renamed from: u */
                    final TextView f9466u;

                    /* renamed from: v */
                    final int[] f9467v = new int[4];

                    /* renamed from: w */
                    int f9468w;

                    public C2520a(View view) {
                        this.f9446a = (ScalableLayout) view.findViewById(C2656R.C2657id.view_result_sheet_adult_bls_sc);
                        this.f9447b[0] = (ScalableLayout) view.findViewById(C2656R.C2657id.view_result_sheet_adult_bls_part1_sc);
                        this.f9447b[1] = (ScalableLayout) view.findViewById(C2656R.C2657id.view_result_sheet_adult_bls_part2_sc);
                        this.f9447b[2] = (ScalableLayout) view.findViewById(C2656R.C2657id.view_result_sheet_adult_bls_part3_sc);
                        this.f9447b[3] = (ScalableLayout) view.findViewById(C2656R.C2657id.view_result_sheet_adult_bls_part4_sc);
                        this.f9447b[4] = (ScalableLayout) view.findViewById(C2656R.C2657id.view_result_sheet_adult_bls_part5_sc);
                        this.f9448c[0] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_bls_g1_txt);
                        this.f9448c[1] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_bls_g2_txt);
                        this.f9448c[2] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_bls_g3_txt);
                        this.f9448c[3] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_bls_g4_txt);
                        this.f9449d[0][0] = (ScalableLayout) view.findViewById(C2656R.C2657id.view_result_sheet_adult_bls_g1q1_sc);
                        this.f9449d[0][1] = (ScalableLayout) view.findViewById(C2656R.C2657id.view_result_sheet_adult_bls_g1q2_sc);
                        this.f9449d[0][2] = (ScalableLayout) view.findViewById(C2656R.C2657id.view_result_sheet_adult_bls_g1q3_sc);
                        this.f9449d[0][3] = (ScalableLayout) view.findViewById(C2656R.C2657id.view_result_sheet_adult_bls_g1q4_sc);
                        this.f9449d[0][4] = (ScalableLayout) view.findViewById(C2656R.C2657id.view_result_sheet_adult_bls_g1q5_sc);
                        this.f9449d[1][0] = (ScalableLayout) view.findViewById(C2656R.C2657id.view_result_sheet_adult_bls_g2q1_sc);
                        this.f9449d[1][1] = (ScalableLayout) view.findViewById(C2656R.C2657id.view_result_sheet_adult_bls_g2q2_sc);
                        this.f9449d[1][2] = (ScalableLayout) view.findViewById(C2656R.C2657id.view_result_sheet_adult_bls_g2q3_sc);
                        this.f9449d[1][3] = (ScalableLayout) view.findViewById(C2656R.C2657id.view_result_sheet_adult_bls_g2q4_sc);
                        this.f9449d[1][4] = (ScalableLayout) view.findViewById(C2656R.C2657id.view_result_sheet_adult_bls_g2q5_sc);
                        this.f9449d[2][0] = (ScalableLayout) view.findViewById(C2656R.C2657id.view_result_sheet_adult_bls_g3q1_sc);
                        this.f9449d[2][1] = (ScalableLayout) view.findViewById(C2656R.C2657id.view_result_sheet_adult_bls_g3q2_sc);
                        this.f9449d[2][2] = (ScalableLayout) view.findViewById(C2656R.C2657id.view_result_sheet_adult_bls_g3q3_sc);
                        this.f9449d[2][3] = (ScalableLayout) view.findViewById(C2656R.C2657id.view_result_sheet_adult_bls_g3q4_sc);
                        this.f9449d[2][4] = (ScalableLayout) view.findViewById(C2656R.C2657id.view_result_sheet_adult_bls_g3q5_sc);
                        this.f9449d[3][0] = (ScalableLayout) view.findViewById(C2656R.C2657id.view_result_sheet_adult_bls_g4q1_sc);
                        this.f9450e[0][0] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_bls_g1q1_txt);
                        this.f9450e[0][1] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_bls_g1q2_txt);
                        this.f9450e[0][2] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_bls_g1q3_txt);
                        this.f9450e[0][3] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_bls_g1q4_txt);
                        this.f9450e[0][4] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_bls_g1q5_txt);
                        this.f9450e[1][0] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_bls_g2q1_txt);
                        this.f9450e[1][1] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_bls_g2q2_txt);
                        this.f9450e[1][2] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_bls_g2q3_txt);
                        this.f9450e[1][3] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_bls_g2q4_txt);
                        this.f9450e[1][4] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_bls_g2q5_txt);
                        this.f9450e[2][0] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_bls_g3q1_txt);
                        this.f9450e[2][1] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_bls_g3q2_txt);
                        this.f9450e[2][2] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_bls_g3q3_txt);
                        this.f9450e[2][3] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_bls_g3q4_txt);
                        this.f9450e[2][4] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_bls_g3q5_txt);
                        this.f9450e[3][0] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_bls_g4q1_txt);
                        this.f9451f[0][0] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_bls_g1q1_btn);
                        this.f9451f[0][1] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_bls_g1q2_btn);
                        this.f9451f[0][2] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_bls_g1q3_btn);
                        this.f9451f[0][3] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_bls_g1q4_btn);
                        this.f9451f[0][4] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_bls_g1q5_btn);
                        this.f9451f[1][0] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_bls_g2q1_btn);
                        this.f9451f[1][1] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_bls_g2q2_btn);
                        this.f9451f[1][2] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_bls_g2q3_btn);
                        this.f9451f[1][3] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_bls_g2q4_btn);
                        this.f9451f[1][4] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_bls_g2q5_btn);
                        this.f9451f[2][0] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_bls_g3q1_btn);
                        this.f9451f[2][1] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_bls_g3q2_btn);
                        this.f9451f[2][2] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_bls_g3q3_btn);
                        this.f9451f[2][3] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_bls_g3q4_btn);
                        this.f9451f[2][4] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_bls_g3q5_btn);
                        this.f9451f[3][0] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_bls_g4q1_btn);
                        this.f9452g[0][0] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_bls_g1q1_click_btn);
                        this.f9452g[0][1] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_bls_g1q2_click_btn);
                        this.f9452g[0][2] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_bls_g1q3_click_btn);
                        this.f9452g[0][3] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_bls_g1q4_click_btn);
                        this.f9452g[0][4] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_bls_g1q5_click_btn);
                        this.f9452g[1][0] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_bls_g2q1_click_btn);
                        this.f9452g[1][1] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_bls_g2q2_click_btn);
                        this.f9452g[1][2] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_bls_g2q3_click_btn);
                        this.f9452g[1][3] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_bls_g2q4_click_btn);
                        this.f9452g[1][4] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_bls_g2q5_click_btn);
                        this.f9452g[2][0] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_bls_g3q1_click_btn);
                        this.f9452g[2][1] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_bls_g3q2_click_btn);
                        this.f9452g[2][2] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_bls_g3q3_click_btn);
                        this.f9452g[2][3] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_bls_g3q4_click_btn);
                        this.f9452g[2][4] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_bls_g3q5_click_btn);
                        this.f9452g[3][0] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_bls_g4q1_click_btn);
                        this.f9453h = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_bls_mibi_txt);
                        this.f9454i[0] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_bls_mibi1_txt);
                        this.f9454i[1] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_bls_mibi2_txt);
                        this.f9455j[0] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_bls_mibi1_btn);
                        this.f9455j[1] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_bls_mibi2_btn);
                        this.f9456k = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_bls_g2_average_txt);
                        this.f9457l = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_bls_g2_time_txt);
                        this.f9458m[0] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_bls_g2q1_timer_value_txt);
                        this.f9458m[1] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_bls_g2q3_timer_value_txt);
                        this.f9459n[0] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_bls_g2q2_timer_value_txt);
                        this.f9459n[1] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_bls_g2q4_timer_value_txt);
                        this.f9460o[0] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_bls_g2q1_average_depth_txt);
                        this.f9460o[1] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_bls_g2q3_average_depth_txt);
                        this.f9461p[0] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_bls_g2q1_average_rate_txt);
                        this.f9461p[1] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_bls_g2q3_average_rate_txt);
                        this.f9462q[0] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_bls_g2q2_average_volume_txt);
                        this.f9462q[1] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_bls_g2q4_average_volume_txt);
                        this.f9463r[0] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_bls_g2q2_average_rate_txt);
                        this.f9463r[1] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_bls_g2q4_average_rate_txt);
                        this.f9464s = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_bls_g1q4_timer_value_txt);
                        this.f9465t = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_bls_pass_txt);
                        this.f9466u = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_bls_fail_txt);
                        this.f9467v[0] = 5;
                        this.f9467v[1] = 5;
                        this.f9467v[2] = 5;
                        this.f9467v[3] = 1;
                    }

                    /* renamed from: a */
                    public void mo9291a() {
                        this.f9446a.setVisibility(0);
                    }

                    /* renamed from: a */
                    public void mo9292a(C2544l lVar) {
                        int i;
                        C2538f t = C2515br.this.f9377h.mo9615t(lVar.mo9470a());
                        boolean[][] zArr = (boolean[][]) Array.newInstance(Boolean.TYPE, new int[]{this.f9467v.length, 5});
                        zArr[0][0] = t.mo9348c() == 1;
                        zArr[0][1] = t.mo9350d() == 1;
                        zArr[0][2] = t.mo9352e() == 1;
                        zArr[0][3] = t.mo9354f() == 1;
                        zArr[0][4] = t.mo9356g() == 1;
                        zArr[1][0] = t.mo9358h() == 1;
                        zArr[1][1] = t.mo9360i() == 1;
                        zArr[1][2] = t.mo9362j() == 1;
                        zArr[1][3] = t.mo9364k() == 1;
                        zArr[1][4] = t.mo9366l() == 1;
                        zArr[2][0] = t.mo9370n() == 1;
                        zArr[2][1] = t.mo9372o() == 1;
                        zArr[2][2] = t.mo9374p() == 1;
                        zArr[2][3] = t.mo9376q() == 1;
                        zArr[2][4] = t.mo9378r() == 1;
                        zArr[3][0] = t.mo9382t() == 1;
                        for (int i2 = 0; i2 < this.f9467v.length; i2++) {
                            for (int i3 = 0; i3 < this.f9467v[i2]; i3++) {
                                if (zArr[i2][i3]) {
                                    this.f9449d[i2][i3].setBackgroundResource(C2656R.drawable.bg_test_selected);
                                    this.f9451f[i2][i3].setImageResource(C2656R.drawable.img_test_check);
                                } else {
                                    this.f9449d[i2][i3].setBackgroundResource(C2656R.drawable.bg_test_unselected);
                                    this.f9451f[i2][i3].setImageResource(C2656R.drawable.img_test_uncheck);
                                }
                            }
                        }
                        int[] iArr = {50, 50, 50, 50, 100};
                        int[] iArr2 = {750, 1050, 900, 300, 250};
                        switch (lVar.mo9485h()) {
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
                        this.f9447b[0].setScaleHeight((float) iArr2[0]);
                        int i4 = 0;
                        int i5 = 0;
                        while (true) {
                            int i6 = i5;
                            int i7 = i4;
                            if (i6 < iArr.length) {
                                int i8 = i7 + iArr[i6];
                                this.f9446a.mo10069b(this.f9447b[i6], 100.0f, (float) i8, 2095.0f, (float) iArr2[i6]);
                                i4 = i8 + iArr2[i6];
                                i5 = i6 + 1;
                            } else {
                                this.f9446a.mo10069b(this.f9464s, 1780.0f, 650.0f, 200.0f, 150.0f);
                                this.f9468w = i7;
                                this.f9446a.setScaleHeight((float) i7);
                                this.f9448c[0].setText(C2557y.f9835g.f10401ej);
                                this.f9448c[1].setText(C2557y.f9835g.f10149W);
                                this.f9448c[2].setText(C2557y.f9835g.f10372eG);
                                this.f9448c[3].setText(C2557y.f9835g.f10378eM);
                                this.f9464s.setVisibility(4);
                                this.f9451f[0][3].setVisibility(0);
                                switch (lVar.mo9485h()) {
                                    case 1:
                                    case 4:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                        this.f9450e[0][0].setText(C2557y.f9835g.f10403el);
                                        this.f9450e[0][1].setText(C2557y.f9835g.f10404em);
                                        this.f9450e[0][2].setText(C2557y.f9835g.f10406eo);
                                        this.f9450e[0][3].setText(C2557y.f9835g.f10407ep);
                                        this.f9464s.setVisibility(0);
                                        this.f9464s.setText(String.format("%.1f%s", new Object[]{Double.valueOf(t.mo9388w()), C2557y.f9835g.f10348dj}));
                                        break;
                                    case 2:
                                    case 5:
                                        this.f9450e[0][0].setText(C2557y.f9835g.f10402ek);
                                        this.f9450e[0][1].setText(C2557y.f9835g.f10403el);
                                        this.f9450e[0][2].setText(C2557y.f9835g.f10405en);
                                        this.f9450e[0][3].setText(C2557y.f9835g.f10406eo);
                                        this.f9450e[0][4].setText(C2557y.f9835g.f10404em);
                                        break;
                                    case 3:
                                    case 6:
                                        this.f9450e[0][0].setText(C2557y.f9835g.f10402ek);
                                        this.f9450e[0][1].setText(C2557y.f9835g.f10403el);
                                        this.f9450e[0][2].setText(C2557y.f9835g.f10404em);
                                        this.f9450e[0][3].setText(C2557y.f9835g.f10405en);
                                        this.f9450e[0][4].setText(C2557y.f9835g.f10406eo);
                                        break;
                                }
                                this.f9450e[1][0].setText(C2557y.f9835g.f10141O + "1: " + C2557y.f9835g.f10415ex);
                                this.f9450e[1][1].setText(C2557y.f9835g.f10141O + "1: " + C2557y.f9835g.f10417ez);
                                this.f9450e[1][2].setText(C2557y.f9835g.f10141O + "2: " + C2557y.f9835g.f10368eC);
                                this.f9450e[1][3].setText(C2557y.f9835g.f10141O + "2: " + C2557y.f9835g.f10369eD);
                                this.f9450e[1][4].setText(C2557y.f9835g.f10141O + "2: " + C2557y.f9835g.f10370eE);
                                this.f9450e[2][0].setText(C2557y.f9835g.f10373eH);
                                this.f9450e[2][1].setText(C2557y.f9835g.f10374eI);
                                this.f9450e[2][2].setText(C2557y.f9835g.f10375eJ);
                                this.f9450e[2][3].setText(C2557y.f9835g.f10376eK);
                                this.f9450e[2][4].setText(C2557y.f9835g.f10377eL);
                                this.f9450e[3][0].setText(C2557y.f9835g.f10379eN);
                                this.f9453h.setText(C2557y.f9835g.f10533hI);
                                this.f9454i[0].setText(C2557y.f9835g.f10534hJ);
                                this.f9454i[1].setText(C2557y.f9835g.f10535hK);
                                if (t.mo9384u() == 1) {
                                    this.f9455j[0].setImageResource(C2656R.drawable.img_test_mibi_check);
                                } else {
                                    this.f9455j[0].setImageResource(C2656R.drawable.img_test_mibi_uncheck);
                                }
                                if (t.mo9386v() == 1) {
                                    this.f9455j[1].setImageResource(C2656R.drawable.img_test_mibi_check);
                                } else {
                                    this.f9455j[1].setImageResource(C2656R.drawable.img_test_mibi_uncheck);
                                }
                                this.f9456k.setText(C2557y.f9835g.f10569hz);
                                this.f9457l.setText(C2557y.f9835g.f10185af);
                                ArrayList<C2541i> r = C2515br.this.f9377h.mo9613r(lVar.mo9470a());
                                ArrayList<C2542j> s = C2515br.this.f9377h.mo9614s(lVar.mo9470a());
                                int size = r == null ? 0 : r.size();
                                int i9 = 0;
                                int i10 = 0;
                                while (i10 < 2) {
                                    if (i10 < size) {
                                        C2541i iVar = r.get(i10);
                                        double f = iVar.mo9417f();
                                        double i11 = iVar.mo9423i();
                                        int d = iVar.mo9413d();
                                        int g = iVar.mo9419g();
                                        double d2 = 0.0d;
                                        double d3 = 0.0d;
                                        double d4 = 0.0d;
                                        double d5 = 0.0d;
                                        int i12 = i9;
                                        int i13 = 0;
                                        int i14 = 0;
                                        while (i14 < d) {
                                            C2542j jVar = s.get(i12);
                                            int i15 = i12 + 1;
                                            if (jVar.mo9447g() != 0) {
                                                d5 += C2515br.m13768c((double) jVar.mo9447g(), lVar.mo9483g());
                                                i13++;
                                            }
                                            i14++;
                                            d4 = (jVar.mo9453j() / ((double) d)) + d4;
                                            i12 = i15;
                                        }
                                        double d6 = i13 != 0 ? d5 / ((double) i13) : 0.0d;
                                        int i16 = i12;
                                        for (int i17 = 0; i17 < g; i17++) {
                                            C2542j jVar2 = s.get(i16);
                                            i16++;
                                            d2 += C2515br.m13769d((double) jVar2.mo9451i(), lVar.mo9483g()) / ((double) g);
                                            d3 += jVar2.mo9453j() / ((double) g);
                                        }
                                        this.f9458m[i10].setText(String.format("%.1f%s", new Object[]{Double.valueOf(f), C2557y.f9835g.f10348dj}));
                                        this.f9460o[i10].setText(String.format("%s: %.1fcm", new Object[]{C2557y.f9835g.f10188ai, Double.valueOf(d6 / 10.0d)}));
                                        this.f9461p[i10].setText(String.format("%s: %d/%s", new Object[]{C2557y.f9835g.f10189aj, Integer.valueOf((int) d4), C2557y.f9835g.f10349dk}));
                                        this.f9459n[i10].setText(String.format("%.1f%s", new Object[]{Double.valueOf(i11), C2557y.f9835g.f10348dj}));
                                        this.f9462q[i10].setText(String.format("%s: %dml", new Object[]{C2557y.f9835g.f10190ak, Integer.valueOf((int) d2)}));
                                        this.f9463r[i10].setText(String.format("%s: %d/%s", new Object[]{C2557y.f9835g.f10189aj, Integer.valueOf((int) d3), C2557y.f9835g.f10349dk}));
                                        i = i16;
                                    } else {
                                        this.f9458m[i10].setText("");
                                        this.f9460o[i10].setText("");
                                        this.f9461p[i10].setText("");
                                        this.f9459n[i10].setText("");
                                        this.f9462q[i10].setText("");
                                        this.f9463r[i10].setText("");
                                        i = i9;
                                    }
                                    i10++;
                                    i9 = i;
                                }
                                this.f9465t.setText(C2557y.f9835g.f10139M);
                                this.f9466u.setText(C2557y.f9835g.f10225bS);
                                if (lVar.mo9477d() == 0) {
                                    this.f9465t.setTextColor(-10658467);
                                    this.f9466u.setTextColor(-1);
                                    this.f9465t.setAlpha(0.3f);
                                    this.f9466u.setAlpha(1.0f);
                                    return;
                                }
                                this.f9465t.setTextColor(-1);
                                this.f9466u.setTextColor(-10658467);
                                this.f9465t.setAlpha(1.0f);
                                this.f9466u.setAlpha(0.3f);
                                return;
                            }
                        }
                    }

                    /* renamed from: b */
                    public void mo9293b() {
                        this.f9446a.setVisibility(4);
                    }
                }

                /* renamed from: com.imlabworld.HS_Instructor.br$a$a$b$b */
                class C2521b {

                    /* renamed from: a */
                    final ScalableLayout f9470a;

                    /* renamed from: b */
                    final ScalableLayout[] f9471b = new ScalableLayout[5];

                    /* renamed from: c */
                    final TextView[] f9472c = new TextView[4];

                    /* renamed from: d */
                    final ScalableLayout[][] f9473d = ((ScalableLayout[][]) Array.newInstance(ScalableLayout.class, new int[]{4, 6}));

                    /* renamed from: e */
                    final TextView[][] f9474e = ((TextView[][]) Array.newInstance(TextView.class, new int[]{4, 6}));

                    /* renamed from: f */
                    final ImageView[][] f9475f = ((ImageView[][]) Array.newInstance(ImageView.class, new int[]{4, 6}));

                    /* renamed from: g */
                    final ImageView[][] f9476g = ((ImageView[][]) Array.newInstance(ImageView.class, new int[]{4, 6}));

                    /* renamed from: h */
                    final TextView f9477h;

                    /* renamed from: i */
                    final TextView[] f9478i = new TextView[2];

                    /* renamed from: j */
                    final ImageView[] f9479j = new ImageView[2];

                    /* renamed from: k */
                    final TextView f9480k;

                    /* renamed from: l */
                    final TextView f9481l;

                    /* renamed from: m */
                    final TextView[] f9482m = new TextView[3];

                    /* renamed from: n */
                    final TextView[] f9483n = new TextView[3];

                    /* renamed from: o */
                    final TextView[] f9484o = new TextView[3];

                    /* renamed from: p */
                    final TextView[] f9485p = new TextView[3];

                    /* renamed from: q */
                    final TextView[] f9486q = new TextView[3];

                    /* renamed from: r */
                    final TextView[] f9487r = new TextView[3];

                    /* renamed from: s */
                    final TextView f9488s;

                    /* renamed from: t */
                    final TextView f9489t;

                    /* renamed from: u */
                    final TextView f9490u;

                    /* renamed from: v */
                    final int[] f9491v = new int[4];

                    /* renamed from: w */
                    int f9492w;

                    public C2521b(View view) {
                        this.f9470a = (ScalableLayout) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_sc);
                        this.f9471b[0] = (ScalableLayout) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_part1_sc);
                        this.f9471b[1] = (ScalableLayout) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_part2_sc);
                        this.f9471b[2] = (ScalableLayout) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_part3_sc);
                        this.f9471b[3] = (ScalableLayout) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_part4_sc);
                        this.f9471b[4] = (ScalableLayout) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_part5_sc);
                        this.f9472c[0] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_g1_txt);
                        this.f9472c[1] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_g2_txt);
                        this.f9472c[2] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_g3_txt);
                        this.f9472c[3] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_g4_txt);
                        this.f9473d[0][0] = (ScalableLayout) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_g1q1_sc);
                        this.f9473d[0][1] = (ScalableLayout) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_g1q2_sc);
                        this.f9473d[0][2] = (ScalableLayout) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_g1q3_sc);
                        this.f9473d[0][3] = (ScalableLayout) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_g1q4_sc);
                        this.f9473d[0][4] = (ScalableLayout) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_g1q5_sc);
                        this.f9473d[1][0] = (ScalableLayout) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_g2q1_sc);
                        this.f9473d[1][1] = (ScalableLayout) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_g2q2_sc);
                        this.f9473d[1][2] = (ScalableLayout) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_g2q3_sc);
                        this.f9473d[1][3] = (ScalableLayout) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_g2q4_sc);
                        this.f9473d[1][4] = (ScalableLayout) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_g2q5_sc);
                        this.f9473d[1][5] = (ScalableLayout) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_g2q6_sc);
                        this.f9473d[2][0] = (ScalableLayout) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_g3q1_sc);
                        this.f9473d[2][1] = (ScalableLayout) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_g3q2_sc);
                        this.f9473d[2][2] = (ScalableLayout) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_g3q3_sc);
                        this.f9473d[2][3] = (ScalableLayout) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_g3q4_sc);
                        this.f9473d[2][4] = (ScalableLayout) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_g3q5_sc);
                        this.f9473d[2][5] = (ScalableLayout) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_g3q6_sc);
                        this.f9473d[3][0] = (ScalableLayout) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_g4q1_sc);
                        this.f9474e[0][0] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_g1q1_txt);
                        this.f9474e[0][1] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_g1q2_txt);
                        this.f9474e[0][2] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_g1q3_txt);
                        this.f9474e[0][3] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_g1q4_txt);
                        this.f9474e[0][4] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_g1q5_txt);
                        this.f9474e[1][0] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_g2q1_txt);
                        this.f9474e[1][1] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_g2q2_txt);
                        this.f9474e[1][2] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_g2q3_txt);
                        this.f9474e[1][3] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_g2q4_txt);
                        this.f9474e[1][4] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_g2q5_txt);
                        this.f9474e[1][5] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_g2q6_txt);
                        this.f9474e[2][0] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_g3q1_txt);
                        this.f9474e[2][1] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_g3q2_txt);
                        this.f9474e[2][2] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_g3q3_txt);
                        this.f9474e[2][3] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_g3q4_txt);
                        this.f9474e[2][4] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_g3q5_txt);
                        this.f9474e[2][5] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_g3q6_txt);
                        this.f9474e[3][0] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_g4q1_txt);
                        this.f9475f[0][0] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_g1q1_btn);
                        this.f9475f[0][1] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_g1q2_btn);
                        this.f9475f[0][2] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_g1q3_btn);
                        this.f9475f[0][3] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_g1q4_btn);
                        this.f9475f[0][4] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_g1q5_btn);
                        this.f9475f[1][0] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_g2q1_btn);
                        this.f9475f[1][1] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_g2q2_btn);
                        this.f9475f[1][2] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_g2q3_btn);
                        this.f9475f[1][3] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_g2q4_btn);
                        this.f9475f[1][4] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_g2q5_btn);
                        this.f9475f[1][5] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_g2q6_btn);
                        this.f9475f[2][0] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_g3q1_btn);
                        this.f9475f[2][1] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_g3q2_btn);
                        this.f9475f[2][2] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_g3q3_btn);
                        this.f9475f[2][3] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_g3q4_btn);
                        this.f9475f[2][4] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_g3q5_btn);
                        this.f9475f[2][5] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_g3q6_btn);
                        this.f9475f[3][0] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_g4q1_btn);
                        this.f9476g[0][0] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_g1q1_click_btn);
                        this.f9476g[0][1] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_g1q2_click_btn);
                        this.f9476g[0][2] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_g1q3_click_btn);
                        this.f9476g[0][3] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_g1q4_click_btn);
                        this.f9476g[0][4] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_g1q5_click_btn);
                        this.f9476g[1][0] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_g2q1_click_btn);
                        this.f9476g[1][1] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_g2q2_click_btn);
                        this.f9476g[1][2] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_g2q3_click_btn);
                        this.f9476g[1][3] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_g2q4_click_btn);
                        this.f9476g[1][4] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_g2q5_click_btn);
                        this.f9476g[1][5] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_g2q6_click_btn);
                        this.f9476g[2][0] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_g3q1_click_btn);
                        this.f9476g[2][1] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_g3q2_click_btn);
                        this.f9476g[2][2] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_g3q3_click_btn);
                        this.f9476g[2][3] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_g3q4_click_btn);
                        this.f9476g[2][4] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_g3q5_click_btn);
                        this.f9476g[2][5] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_g3q6_click_btn);
                        this.f9476g[3][0] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_g4q1_click_btn);
                        this.f9477h = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_mibi_txt);
                        this.f9478i[0] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_mibi1_txt);
                        this.f9478i[1] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_mibi2_txt);
                        this.f9479j[0] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_mibi1_btn);
                        this.f9479j[1] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_mibi2_btn);
                        this.f9480k = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_g2_average_txt);
                        this.f9481l = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_g2_time_txt);
                        this.f9482m[0] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_g2q1_timer_value_txt);
                        this.f9482m[1] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_g2q3_timer_value_txt);
                        this.f9482m[2] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_g2q5_timer_value_txt);
                        this.f9483n[0] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_g2q2_timer_value_txt);
                        this.f9483n[1] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_g2q4_timer_value_txt);
                        this.f9483n[2] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_g2q6_timer_value_txt);
                        this.f9484o[0] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_g2q1_average_depth_txt);
                        this.f9484o[1] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_g2q3_average_depth_txt);
                        this.f9484o[2] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_g2q5_average_depth_txt);
                        this.f9485p[0] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_g2q1_average_rate_txt);
                        this.f9485p[1] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_g2q3_average_rate_txt);
                        this.f9485p[2] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_g2q5_average_rate_txt);
                        this.f9486q[0] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_g2q2_average_volume_txt);
                        this.f9486q[1] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_g2q4_average_volume_txt);
                        this.f9486q[2] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_g2q6_average_volume_txt);
                        this.f9487r[0] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_g2q2_average_rate_txt);
                        this.f9487r[1] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_g2q4_average_rate_txt);
                        this.f9487r[2] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_g2q6_average_rate_txt);
                        this.f9488s = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_g1q3_timer_value_txt);
                        this.f9489t = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_pass_txt);
                        this.f9490u = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_adult_lay_fail_txt);
                        this.f9491v[0] = 5;
                        this.f9491v[1] = 6;
                        this.f9491v[2] = 6;
                        this.f9491v[3] = 1;
                    }

                    /* renamed from: a */
                    public void mo9294a() {
                        this.f9470a.setVisibility(0);
                    }

                    /* renamed from: a */
                    public void mo9295a(C2544l lVar) {
                        int i;
                        C2538f t = C2515br.this.f9377h.mo9615t(lVar.mo9470a());
                        Log.e("Data IDx", lVar.mo9470a() + "");
                        boolean[][] zArr = (boolean[][]) Array.newInstance(Boolean.TYPE, new int[]{this.f9491v.length, 6});
                        zArr[0][0] = t.mo9348c() == 1;
                        zArr[0][1] = t.mo9350d() == 1;
                        zArr[0][2] = t.mo9352e() == 1;
                        zArr[0][3] = t.mo9354f() == 1;
                        zArr[0][4] = t.mo9356g() == 1;
                        zArr[1][0] = t.mo9358h() == 1;
                        zArr[1][1] = t.mo9360i() == 1;
                        zArr[1][2] = t.mo9362j() == 1;
                        zArr[1][3] = t.mo9364k() == 1;
                        zArr[1][4] = t.mo9366l() == 1;
                        zArr[1][5] = t.mo9368m() == 1;
                        zArr[2][0] = t.mo9370n() == 1;
                        zArr[2][1] = t.mo9372o() == 1;
                        zArr[2][2] = t.mo9374p() == 1;
                        zArr[2][3] = t.mo9376q() == 1;
                        zArr[2][4] = t.mo9378r() == 1;
                        zArr[2][5] = t.mo9380s() == 1;
                        zArr[3][0] = t.mo9382t() == 1;
                        for (int i2 = 0; i2 < this.f9491v.length; i2++) {
                            for (int i3 = 0; i3 < this.f9491v[i2]; i3++) {
                                if (zArr[i2][i3]) {
                                    this.f9473d[i2][i3].setBackgroundResource(C2656R.drawable.bg_test_selected);
                                    this.f9475f[i2][i3].setImageResource(C2656R.drawable.img_test_check);
                                } else {
                                    this.f9473d[i2][i3].setBackgroundResource(C2656R.drawable.bg_test_unselected);
                                    this.f9475f[i2][i3].setImageResource(C2656R.drawable.img_test_uncheck);
                                }
                            }
                        }
                        int[] iArr = {50, 50, 50, 50, 100};
                        int[] iArr2 = {750, 1200, 1050, 300, 250};
                        switch (lVar.mo9485h()) {
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
                        this.f9471b[0].setScaleHeight((float) iArr2[0]);
                        int i4 = 0;
                        int i5 = 0;
                        while (true) {
                            int i6 = i5;
                            int i7 = i4;
                            if (i6 < iArr.length) {
                                int i8 = i7 + iArr[i6];
                                this.f9470a.mo10069b(this.f9471b[i6], 100.0f, (float) i8, 2095.0f, (float) iArr2[i6]);
                                i4 = i8 + iArr2[i6];
                                i5 = i6 + 1;
                            } else {
                                this.f9470a.mo10069b(this.f9488s, 1780.0f, 500.0f, 200.0f, 150.0f);
                                this.f9492w = i7;
                                this.f9470a.setScaleHeight((float) i7);
                                this.f9472c[0].setText(C2557y.f9835g.f10401ej);
                                this.f9472c[1].setText(C2557y.f9835g.f10149W);
                                if (C2557y.f9832d.f9754j.equals("kr")) {
                                    this.f9472c[2].setText(C2557y.f9835g.f10452fh);
                                } else {
                                    this.f9472c[2].setText(C2557y.f9835g.f10372eG);
                                }
                                this.f9472c[3].setText(C2557y.f9835g.f10378eM);
                                this.f9488s.setVisibility(4);
                                this.f9475f[0][2].setVisibility(0);
                                switch (lVar.mo9485h()) {
                                    case 1:
                                    case 4:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                        this.f9474e[0][0].setText(C2557y.f9835g.f10383eR);
                                        this.f9474e[0][1].setText(C2557y.f9835g.f10384eS);
                                        this.f9474e[0][2].setText(C2557y.f9835g.f10386eU);
                                        this.f9488s.setVisibility(0);
                                        this.f9488s.setText(String.format("%.1f%s", new Object[]{Double.valueOf(t.mo9388w()), C2557y.f9835g.f10348dj}));
                                        break;
                                    case 2:
                                    case 5:
                                        this.f9474e[0][0].setText(C2557y.f9835g.f10382eQ);
                                        this.f9474e[0][1].setText(C2557y.f9835g.f10383eR);
                                        this.f9474e[0][2].setText(C2557y.f9835g.f10385eT);
                                        this.f9474e[0][3].setText(C2557y.f9835g.f10386eU);
                                        this.f9474e[0][4].setText(C2557y.f9835g.f10384eS);
                                        break;
                                    case 3:
                                    case 6:
                                        this.f9474e[0][0].setText(C2557y.f9835g.f10382eQ);
                                        this.f9474e[0][1].setText(C2557y.f9835g.f10383eR);
                                        this.f9474e[0][2].setText(C2557y.f9835g.f10384eS);
                                        this.f9474e[0][3].setText(C2557y.f9835g.f10385eT);
                                        this.f9474e[0][4].setText(C2557y.f9835g.f10386eU);
                                        break;
                                }
                                this.f9474e[1][0].setText(C2557y.f9835g.f10141O + "1: " + C2557y.f9835g.f10387eV);
                                this.f9474e[1][1].setText(C2557y.f9835g.f10141O + "1: " + C2557y.f9835g.f10389eX);
                                this.f9474e[1][2].setText(C2557y.f9835g.f10141O + "2: " + C2557y.f9835g.f10391eZ);
                                this.f9474e[1][3].setText(C2557y.f9835g.f10141O + "2: " + C2557y.f9835g.f10446fb);
                                this.f9474e[1][4].setText(C2557y.f9835g.f10141O + "3: " + C2557y.f9835g.f10448fd);
                                this.f9474e[1][5].setText(C2557y.f9835g.f10141O + "3: " + C2557y.f9835g.f10450ff);
                                this.f9474e[2][0].setText(C2557y.f9835g.f10453fi);
                                this.f9474e[2][1].setText(C2557y.f9835g.f10455fk);
                                this.f9474e[2][2].setText(C2557y.f9835g.f10456fl);
                                this.f9474e[2][3].setText(C2557y.f9835g.f10458fn);
                                this.f9474e[2][4].setText(C2557y.f9835g.f10460fp);
                                this.f9474e[2][5].setText(C2557y.f9835g.f10461fq);
                                this.f9474e[3][0].setText(C2557y.f9835g.f10463fs);
                                this.f9477h.setText(C2557y.f9835g.f10533hI);
                                this.f9478i[0].setText(C2557y.f9835g.f10534hJ);
                                this.f9478i[1].setText(C2557y.f9835g.f10535hK);
                                if (t.mo9384u() == 1) {
                                    this.f9479j[0].setImageResource(C2656R.drawable.img_test_mibi_check);
                                } else {
                                    this.f9479j[0].setImageResource(C2656R.drawable.img_test_mibi_uncheck);
                                }
                                if (t.mo9386v() == 2) {
                                    this.f9479j[1].setImageResource(C2656R.drawable.img_test_mibi_check);
                                } else {
                                    this.f9479j[1].setImageResource(C2656R.drawable.img_test_mibi_uncheck);
                                }
                                this.f9480k.setText(C2557y.f9835g.f10569hz);
                                this.f9481l.setText(C2557y.f9835g.f10185af);
                                ArrayList<C2541i> r = C2515br.this.f9377h.mo9613r(lVar.mo9470a());
                                ArrayList<C2542j> s = C2515br.this.f9377h.mo9614s(lVar.mo9470a());
                                int size = r == null ? 0 : r.size();
                                int i9 = 0;
                                int i10 = 0;
                                while (i10 < 3) {
                                    if (i10 < size) {
                                        C2541i iVar = r.get(i10);
                                        double f = iVar.mo9417f();
                                        double i11 = iVar.mo9423i();
                                        int d = iVar.mo9413d();
                                        int g = iVar.mo9419g();
                                        double d2 = 0.0d;
                                        double d3 = 0.0d;
                                        double d4 = 0.0d;
                                        double d5 = 0.0d;
                                        int i12 = i9;
                                        int i13 = 0;
                                        int i14 = 0;
                                        while (i14 < d) {
                                            C2542j jVar = s.get(i12);
                                            int i15 = i12 + 1;
                                            if (jVar.mo9447g() != 0) {
                                                d5 += C2515br.m13768c((double) jVar.mo9447g(), lVar.mo9483g());
                                                i13++;
                                            }
                                            i14++;
                                            d4 = (jVar.mo9453j() / ((double) d)) + d4;
                                            i12 = i15;
                                        }
                                        double d6 = i13 != 0 ? d5 / ((double) i13) : 0.0d;
                                        int i16 = i12;
                                        for (int i17 = 0; i17 < g; i17++) {
                                            C2542j jVar2 = s.get(i16);
                                            i16++;
                                            d2 += C2515br.m13769d((double) jVar2.mo9451i(), lVar.mo9483g()) / ((double) g);
                                            d3 += jVar2.mo9453j() / ((double) g);
                                        }
                                        this.f9482m[i10].setText(String.format("%.1f%s", new Object[]{Double.valueOf(f), C2557y.f9835g.f10348dj}));
                                        this.f9484o[i10].setText(String.format("%s: %.1fcm", new Object[]{C2557y.f9835g.f10188ai, Double.valueOf(d6 / 10.0d)}));
                                        this.f9485p[i10].setText(String.format("%s: %d/%s", new Object[]{C2557y.f9835g.f10189aj, Integer.valueOf((int) d4), C2557y.f9835g.f10349dk}));
                                        this.f9483n[i10].setText(String.format("%.1f%s", new Object[]{Double.valueOf(i11), C2557y.f9835g.f10348dj}));
                                        this.f9486q[i10].setText(String.format("%s: %dml", new Object[]{C2557y.f9835g.f10190ak, Integer.valueOf((int) d2)}));
                                        this.f9487r[i10].setText(String.format("%s: %d/%s", new Object[]{C2557y.f9835g.f10189aj, Integer.valueOf((int) d3), C2557y.f9835g.f10349dk}));
                                        i = i16;
                                    } else {
                                        this.f9482m[i10].setText("");
                                        this.f9484o[i10].setText("");
                                        this.f9485p[i10].setText("");
                                        this.f9483n[i10].setText("");
                                        this.f9486q[i10].setText("");
                                        this.f9487r[i10].setText("");
                                        i = i9;
                                    }
                                    i10++;
                                    i9 = i;
                                }
                                this.f9489t.setText(C2557y.f9835g.f10139M);
                                this.f9490u.setText(C2557y.f9835g.f10225bS);
                                if (lVar.mo9477d() == 0) {
                                    this.f9489t.setTextColor(-10658467);
                                    this.f9490u.setTextColor(-1);
                                    this.f9489t.setAlpha(0.3f);
                                    this.f9490u.setAlpha(1.0f);
                                    return;
                                }
                                this.f9489t.setTextColor(-1);
                                this.f9490u.setTextColor(-10658467);
                                this.f9489t.setAlpha(1.0f);
                                this.f9490u.setAlpha(0.3f);
                                return;
                            }
                        }
                    }

                    /* renamed from: b */
                    public void mo9296b() {
                        this.f9470a.setVisibility(4);
                    }
                }

                /* renamed from: com.imlabworld.HS_Instructor.br$a$a$b$c */
                class C2522c {

                    /* renamed from: a */
                    final ScalableLayout f9494a;

                    /* renamed from: b */
                    final ScalableLayout[] f9495b = new ScalableLayout[4];

                    /* renamed from: c */
                    final TextView[] f9496c = new TextView[3];

                    /* renamed from: d */
                    final ScalableLayout[][] f9497d = ((ScalableLayout[][]) Array.newInstance(ScalableLayout.class, new int[]{3, 5}));

                    /* renamed from: e */
                    final TextView[][] f9498e = ((TextView[][]) Array.newInstance(TextView.class, new int[]{3, 5}));

                    /* renamed from: f */
                    final ImageView[][] f9499f = ((ImageView[][]) Array.newInstance(ImageView.class, new int[]{3, 5}));

                    /* renamed from: g */
                    final ImageView[][] f9500g = ((ImageView[][]) Array.newInstance(ImageView.class, new int[]{3, 5}));

                    /* renamed from: h */
                    final TextView f9501h;

                    /* renamed from: i */
                    final TextView[] f9502i = new TextView[2];

                    /* renamed from: j */
                    final ImageView[] f9503j = new ImageView[2];

                    /* renamed from: k */
                    final TextView f9504k;

                    /* renamed from: l */
                    final TextView[] f9505l = new TextView[5];

                    /* renamed from: m */
                    final TextView f9506m;

                    /* renamed from: n */
                    final TextView f9507n;

                    /* renamed from: o */
                    final int[] f9508o = new int[3];

                    /* renamed from: p */
                    int f9509p;

                    public C2522c(View view) {
                        this.f9494a = (ScalableLayout) view.findViewById(C2656R.C2657id.view_result_sheet_infant_bls_sc);
                        this.f9495b[0] = (ScalableLayout) view.findViewById(C2656R.C2657id.view_result_sheet_infant_bls_part1_sc);
                        this.f9495b[1] = (ScalableLayout) view.findViewById(C2656R.C2657id.view_result_sheet_infant_bls_part2_sc);
                        this.f9495b[2] = (ScalableLayout) view.findViewById(C2656R.C2657id.view_result_sheet_infant_bls_part3_sc);
                        this.f9495b[3] = (ScalableLayout) view.findViewById(C2656R.C2657id.view_result_sheet_infant_bls_part4_sc);
                        this.f9496c[0] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_bls_g1_txt);
                        this.f9496c[1] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_bls_g2_txt);
                        this.f9496c[2] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_bls_g3_txt);
                        this.f9497d[0][0] = (ScalableLayout) view.findViewById(C2656R.C2657id.view_result_sheet_infant_bls_g1q1_sc);
                        this.f9497d[0][1] = (ScalableLayout) view.findViewById(C2656R.C2657id.view_result_sheet_infant_bls_g1q2_sc);
                        this.f9497d[0][2] = (ScalableLayout) view.findViewById(C2656R.C2657id.view_result_sheet_infant_bls_g1q3_sc);
                        this.f9497d[0][3] = (ScalableLayout) view.findViewById(C2656R.C2657id.view_result_sheet_infant_bls_g1q4_sc);
                        this.f9497d[0][4] = (ScalableLayout) view.findViewById(C2656R.C2657id.view_result_sheet_infant_bls_g1q5_sc);
                        this.f9497d[1][0] = (ScalableLayout) view.findViewById(C2656R.C2657id.view_result_sheet_infant_bls_g2q1_sc);
                        this.f9497d[1][1] = (ScalableLayout) view.findViewById(C2656R.C2657id.view_result_sheet_infant_bls_g2q2_sc);
                        this.f9497d[1][2] = (ScalableLayout) view.findViewById(C2656R.C2657id.view_result_sheet_infant_bls_g2q3_sc);
                        this.f9497d[1][3] = (ScalableLayout) view.findViewById(C2656R.C2657id.view_result_sheet_infant_bls_g2q4_sc);
                        this.f9497d[1][4] = (ScalableLayout) view.findViewById(C2656R.C2657id.view_result_sheet_infant_bls_g2q5_sc);
                        this.f9497d[2][0] = (ScalableLayout) view.findViewById(C2656R.C2657id.view_result_sheet_infant_bls_g3q1_sc);
                        this.f9497d[2][1] = (ScalableLayout) view.findViewById(C2656R.C2657id.view_result_sheet_infant_bls_g3q2_sc);
                        this.f9498e[0][0] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_bls_g1q1_txt);
                        this.f9498e[0][1] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_bls_g1q2_txt);
                        this.f9498e[0][2] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_bls_g1q3_txt);
                        this.f9498e[0][3] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_bls_g1q4_txt);
                        this.f9498e[0][4] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_bls_g1q5_txt);
                        this.f9498e[1][0] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_bls_g2q1_txt);
                        this.f9498e[1][1] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_bls_g2q2_txt);
                        this.f9498e[1][2] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_bls_g2q3_txt);
                        this.f9498e[1][3] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_bls_g2q4_txt);
                        this.f9498e[1][4] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_bls_g2q5_txt);
                        this.f9498e[2][0] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_bls_g3q1_txt);
                        this.f9498e[2][1] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_bls_g3q2_txt);
                        this.f9499f[0][0] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_bls_g1q1_btn);
                        this.f9499f[0][1] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_bls_g1q2_btn);
                        this.f9499f[0][2] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_bls_g1q3_btn);
                        this.f9499f[0][3] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_bls_g1q4_btn);
                        this.f9499f[0][4] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_bls_g1q5_btn);
                        this.f9499f[1][0] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_bls_g2q1_btn);
                        this.f9499f[1][1] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_bls_g2q2_btn);
                        this.f9499f[1][2] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_bls_g2q3_btn);
                        this.f9499f[1][3] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_bls_g2q4_btn);
                        this.f9499f[1][4] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_bls_g2q5_btn);
                        this.f9499f[2][0] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_bls_g3q1_btn);
                        this.f9499f[2][1] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_bls_g3q2_btn);
                        this.f9500g[0][0] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_bls_g1q1_click_btn);
                        this.f9500g[0][1] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_bls_g1q2_click_btn);
                        this.f9500g[0][2] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_bls_g1q3_click_btn);
                        this.f9500g[0][3] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_bls_g1q4_click_btn);
                        this.f9500g[0][4] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_bls_g1q5_click_btn);
                        this.f9500g[1][0] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_bls_g2q1_click_btn);
                        this.f9500g[1][1] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_bls_g2q2_click_btn);
                        this.f9500g[1][2] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_bls_g2q3_click_btn);
                        this.f9500g[1][3] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_bls_g2q4_click_btn);
                        this.f9500g[1][4] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_bls_g2q5_click_btn);
                        this.f9500g[2][0] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_bls_g3q1_click_btn);
                        this.f9500g[2][1] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_bls_g3q2_click_btn);
                        this.f9501h = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_bls_mibi_txt);
                        this.f9502i[0] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_bls_mibi1_txt);
                        this.f9502i[1] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_bls_mibi2_txt);
                        this.f9503j[0] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_bls_mibi1_btn);
                        this.f9503j[1] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_bls_mibi2_btn);
                        this.f9504k = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_bls_g1q4_timer_value_txt);
                        this.f9505l[0] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_bls_g2q1_timer_value_txt);
                        this.f9505l[1] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_bls_g2q2_timer_value_txt);
                        this.f9505l[2] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_bls_g2q3_timer_value_txt);
                        this.f9505l[3] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_bls_g2q4_timer_value_txt);
                        this.f9505l[4] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_bls_g3q1_timer_value_txt);
                        this.f9506m = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_bls_pass_txt);
                        this.f9507n = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_bls_fail_txt);
                        this.f9508o[0] = 5;
                        this.f9508o[1] = 5;
                        this.f9508o[2] = 2;
                    }

                    /* renamed from: a */
                    public void mo9297a() {
                        this.f9494a.setVisibility(0);
                    }

                    /* renamed from: a */
                    public void mo9298a(C2544l lVar) {
                        C2545m u = C2515br.this.f9377h.mo9616u(lVar.mo9470a());
                        boolean[][] zArr = (boolean[][]) Array.newInstance(Boolean.TYPE, new int[]{this.f9508o.length, 5});
                        zArr[0][0] = u.mo9501c() == 1;
                        zArr[0][1] = u.mo9504d() == 1;
                        zArr[0][2] = u.mo9507e() == 1;
                        zArr[0][3] = u.mo9510f() == 1;
                        zArr[0][4] = u.mo9513g() == 1;
                        zArr[1][0] = u.mo9516h() == 1;
                        zArr[1][1] = u.mo9518i() == 1;
                        zArr[1][2] = u.mo9520j() == 1;
                        zArr[1][3] = u.mo9522k() == 1;
                        zArr[1][4] = u.mo9524l() == 1;
                        zArr[2][0] = u.mo9526m() == 1;
                        zArr[2][1] = u.mo9528n() == 1;
                        for (int i = 0; i < this.f9508o.length; i++) {
                            for (int i2 = 0; i2 < this.f9508o[i]; i2++) {
                                if (zArr[i][i2]) {
                                    this.f9497d[i][i2].setBackgroundResource(C2656R.drawable.bg_test_selected);
                                    this.f9499f[i][i2].setImageResource(C2656R.drawable.img_test_check);
                                } else {
                                    this.f9497d[i][i2].setBackgroundResource(C2656R.drawable.bg_test_unselected);
                                    this.f9499f[i][i2].setImageResource(C2656R.drawable.img_test_uncheck);
                                }
                            }
                        }
                        int[] iArr = {50, 50, 50, 100};
                        int[] iArr2 = {750, 1050, 450, 250};
                        switch (lVar.mo9485h()) {
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
                        this.f9495b[0].setScaleHeight((float) iArr2[0]);
                        int i3 = 0;
                        int i4 = 0;
                        while (true) {
                            int i5 = i4;
                            int i6 = i3;
                            if (i5 < iArr.length) {
                                int i7 = i6 + iArr[i5];
                                this.f9494a.mo10069b(this.f9495b[i5], 100.0f, (float) i7, 2095.0f, (float) iArr2[i5]);
                                i3 = i7 + iArr2[i5];
                                i4 = i5 + 1;
                            } else {
                                this.f9494a.mo10069b(this.f9504k, 1780.0f, 650.0f, 200.0f, 150.0f);
                                this.f9509p = i6;
                                this.f9494a.setScaleHeight((float) i6);
                                this.f9496c[0].setText(C2557y.f9835g.f10419fA);
                                this.f9496c[1].setText(C2557y.f9835g.f10149W);
                                this.f9496c[2].setText(C2557y.f9835g.f10149W + C2557y.f9835g.f10487gP);
                                this.f9504k.setVisibility(4);
                                this.f9499f[0][3].setVisibility(0);
                                switch (lVar.mo9485h()) {
                                    case 1:
                                    case 4:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                        this.f9498e[0][0].setText(C2557y.f9835g.f10421fC);
                                        this.f9498e[0][1].setText(C2557y.f9835g.f10422fD);
                                        this.f9498e[0][2].setText(C2557y.f9835g.f10424fF);
                                        this.f9498e[0][3].setText(C2557y.f9835g.f10425fG);
                                        this.f9504k.setVisibility(0);
                                        this.f9504k.setText(String.format("%.1f%s", new Object[]{Double.valueOf(u.mo9534q()), C2557y.f9835g.f10348dj}));
                                        break;
                                    case 2:
                                    case 5:
                                        this.f9498e[0][0].setText(C2557y.f9835g.f10420fB);
                                        this.f9498e[0][1].setText(C2557y.f9835g.f10421fC);
                                        this.f9498e[0][2].setText(C2557y.f9835g.f10423fE);
                                        this.f9498e[0][3].setText(C2557y.f9835g.f10424fF);
                                        this.f9498e[0][4].setText(C2557y.f9835g.f10422fD);
                                        break;
                                    case 3:
                                    case 6:
                                        this.f9498e[0][0].setText(C2557y.f9835g.f10420fB);
                                        this.f9498e[0][1].setText(C2557y.f9835g.f10421fC);
                                        this.f9498e[0][2].setText(C2557y.f9835g.f10422fD);
                                        this.f9498e[0][3].setText(C2557y.f9835g.f10423fE);
                                        this.f9498e[0][4].setText(C2557y.f9835g.f10424fF);
                                        break;
                                }
                                this.f9498e[1][0].setText(C2557y.f9835g.f10141O + "1: " + C2557y.f9835g.f10428fJ);
                                this.f9498e[1][1].setText(C2557y.f9835g.f10141O + "1: " + C2557y.f9835g.f10430fL);
                                this.f9498e[1][2].setText(C2557y.f9835g.f10141O + "2: " + C2557y.f9835g.f10433fO);
                                this.f9498e[1][3].setText(C2557y.f9835g.f10141O + "2: " + C2557y.f9835g.f10434fP);
                                this.f9498e[1][4].setText(C2557y.f9835g.f10141O + "2: " + C2557y.f9835g.f10435fQ);
                                this.f9498e[2][0].setText(C2557y.f9835g.f10141O + "3: " + C2557y.f9835g.f10438fT);
                                this.f9498e[2][1].setText(C2557y.f9835g.f10141O + "4: " + C2557y.f9835g.f10443fY);
                                this.f9501h.setText(C2557y.f9835g.f10533hI);
                                this.f9502i[0].setText(C2557y.f9835g.f10534hJ);
                                this.f9502i[1].setText(C2557y.f9835g.f10535hK);
                                if (u.mo9530o() == 1) {
                                    this.f9503j[0].setImageResource(C2656R.drawable.img_test_mibi_check);
                                } else {
                                    this.f9503j[0].setImageResource(C2656R.drawable.img_test_mibi_uncheck);
                                }
                                if (u.mo9532p() == 1) {
                                    this.f9503j[1].setImageResource(C2656R.drawable.img_test_mibi_check);
                                } else {
                                    this.f9503j[1].setImageResource(C2656R.drawable.img_test_mibi_uncheck);
                                }
                                this.f9505l[0].setText(String.format("%.2f%s", new Object[]{Double.valueOf(u.f9687a), C2557y.f9835g.f10348dj}));
                                this.f9505l[1].setText(String.format("%.2f%s", new Object[]{Double.valueOf(u.f9688b), C2557y.f9835g.f10348dj}));
                                this.f9505l[2].setText(String.format("%.2f%s", new Object[]{Double.valueOf(u.f9689c), C2557y.f9835g.f10348dj}));
                                this.f9505l[3].setText(String.format("%.2f%s", new Object[]{Double.valueOf(u.f9690d), C2557y.f9835g.f10348dj}));
                                this.f9505l[4].setText(String.format("%.2f%s", new Object[]{Double.valueOf(u.f9691e), C2557y.f9835g.f10348dj}));
                                this.f9506m.setText(C2557y.f9835g.f10139M);
                                this.f9507n.setText(C2557y.f9835g.f10225bS);
                                if (lVar.mo9477d() == 0) {
                                    this.f9506m.setTextColor(-10658467);
                                    this.f9507n.setTextColor(-1);
                                    this.f9506m.setAlpha(0.3f);
                                    this.f9507n.setAlpha(1.0f);
                                    return;
                                }
                                this.f9506m.setTextColor(-1);
                                this.f9507n.setTextColor(-10658467);
                                this.f9506m.setAlpha(1.0f);
                                this.f9507n.setAlpha(0.3f);
                                return;
                            }
                        }
                    }

                    /* renamed from: b */
                    public void mo9299b() {
                        this.f9494a.setVisibility(4);
                    }
                }

                /* renamed from: com.imlabworld.HS_Instructor.br$a$a$b$d */
                class C2523d {

                    /* renamed from: a */
                    final ScalableLayout f9511a;

                    /* renamed from: b */
                    final ScalableLayout[] f9512b = new ScalableLayout[3];

                    /* renamed from: c */
                    final TextView[] f9513c = new TextView[2];

                    /* renamed from: d */
                    final ScalableLayout[][] f9514d = ((ScalableLayout[][]) Array.newInstance(ScalableLayout.class, new int[]{2, 6}));

                    /* renamed from: e */
                    final TextView[][] f9515e = ((TextView[][]) Array.newInstance(TextView.class, new int[]{2, 6}));

                    /* renamed from: f */
                    final ImageView[][] f9516f = ((ImageView[][]) Array.newInstance(ImageView.class, new int[]{2, 6}));

                    /* renamed from: g */
                    final ImageView[][] f9517g = ((ImageView[][]) Array.newInstance(ImageView.class, new int[]{2, 6}));

                    /* renamed from: h */
                    final TextView f9518h;

                    /* renamed from: i */
                    final TextView[] f9519i = new TextView[2];

                    /* renamed from: j */
                    final ImageView[] f9520j = new ImageView[2];

                    /* renamed from: k */
                    final TextView f9521k;

                    /* renamed from: l */
                    final TextView[] f9522l = new TextView[6];

                    /* renamed from: m */
                    final TextView f9523m;

                    /* renamed from: n */
                    final TextView f9524n;

                    /* renamed from: o */
                    final int[] f9525o = new int[2];

                    /* renamed from: p */
                    int f9526p;

                    public C2523d(View view) {
                        this.f9511a = (ScalableLayout) view.findViewById(C2656R.C2657id.view_result_sheet_infant_lay_sc);
                        this.f9512b[0] = (ScalableLayout) view.findViewById(C2656R.C2657id.view_result_sheet_infant_lay_part1_sc);
                        this.f9512b[1] = (ScalableLayout) view.findViewById(C2656R.C2657id.view_result_sheet_infant_lay_part2_sc);
                        this.f9512b[2] = (ScalableLayout) view.findViewById(C2656R.C2657id.view_result_sheet_infant_lay_part3_sc);
                        this.f9513c[0] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_lay_g1_txt);
                        this.f9513c[1] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_lay_g2_txt);
                        this.f9514d[0][0] = (ScalableLayout) view.findViewById(C2656R.C2657id.view_result_sheet_infant_lay_g1q1_sc);
                        this.f9514d[0][1] = (ScalableLayout) view.findViewById(C2656R.C2657id.view_result_sheet_infant_lay_g1q2_sc);
                        this.f9514d[0][2] = (ScalableLayout) view.findViewById(C2656R.C2657id.view_result_sheet_infant_lay_g1q3_sc);
                        this.f9514d[0][3] = (ScalableLayout) view.findViewById(C2656R.C2657id.view_result_sheet_infant_lay_g1q4_sc);
                        this.f9514d[0][4] = (ScalableLayout) view.findViewById(C2656R.C2657id.view_result_sheet_infant_lay_g1q5_sc);
                        this.f9514d[1][0] = (ScalableLayout) view.findViewById(C2656R.C2657id.view_result_sheet_infant_lay_g2q1_sc);
                        this.f9514d[1][1] = (ScalableLayout) view.findViewById(C2656R.C2657id.view_result_sheet_infant_lay_g2q2_sc);
                        this.f9514d[1][2] = (ScalableLayout) view.findViewById(C2656R.C2657id.view_result_sheet_infant_lay_g2q3_sc);
                        this.f9514d[1][3] = (ScalableLayout) view.findViewById(C2656R.C2657id.view_result_sheet_infant_lay_g2q4_sc);
                        this.f9514d[1][4] = (ScalableLayout) view.findViewById(C2656R.C2657id.view_result_sheet_infant_lay_g2q5_sc);
                        this.f9514d[1][5] = (ScalableLayout) view.findViewById(C2656R.C2657id.view_result_sheet_infant_lay_g2q6_sc);
                        this.f9515e[0][0] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_lay_g1q1_txt);
                        this.f9515e[0][1] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_lay_g1q2_txt);
                        this.f9515e[0][2] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_lay_g1q3_txt);
                        this.f9515e[0][3] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_lay_g1q4_txt);
                        this.f9515e[0][4] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_lay_g1q5_txt);
                        this.f9515e[1][0] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_lay_g2q1_txt);
                        this.f9515e[1][1] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_lay_g2q2_txt);
                        this.f9515e[1][2] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_lay_g2q3_txt);
                        this.f9515e[1][3] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_lay_g2q4_txt);
                        this.f9515e[1][4] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_lay_g2q5_txt);
                        this.f9515e[1][5] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_lay_g2q6_txt);
                        this.f9516f[0][0] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_lay_g1q1_btn);
                        this.f9516f[0][1] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_lay_g1q2_btn);
                        this.f9516f[0][2] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_lay_g1q3_btn);
                        this.f9516f[0][3] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_lay_g1q4_btn);
                        this.f9516f[0][4] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_lay_g1q5_btn);
                        this.f9516f[1][0] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_lay_g2q1_btn);
                        this.f9516f[1][1] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_lay_g2q2_btn);
                        this.f9516f[1][2] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_lay_g2q3_btn);
                        this.f9516f[1][3] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_lay_g2q4_btn);
                        this.f9516f[1][4] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_lay_g2q5_btn);
                        this.f9516f[1][5] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_lay_g2q6_btn);
                        this.f9517g[0][0] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_lay_g1q1_click_btn);
                        this.f9517g[0][1] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_lay_g1q2_click_btn);
                        this.f9517g[0][2] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_lay_g1q3_click_btn);
                        this.f9517g[0][3] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_lay_g1q4_click_btn);
                        this.f9517g[0][4] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_lay_g1q5_click_btn);
                        this.f9517g[1][0] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_lay_g2q1_click_btn);
                        this.f9517g[1][1] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_lay_g2q2_click_btn);
                        this.f9517g[1][2] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_lay_g2q3_click_btn);
                        this.f9517g[1][3] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_lay_g2q4_click_btn);
                        this.f9517g[1][4] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_lay_g2q5_click_btn);
                        this.f9517g[1][5] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_lay_g2q6_click_btn);
                        this.f9518h = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_lay_mibi_txt);
                        this.f9519i[0] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_lay_mibi1_txt);
                        this.f9519i[1] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_lay_mibi2_txt);
                        this.f9520j[0] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_lay_mibi1_btn);
                        this.f9520j[1] = (ImageView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_lay_mibi2_btn);
                        this.f9521k = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_lay_g1q3_timer_value_txt);
                        this.f9522l[0] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_lay_g2q1_timer_value_txt);
                        this.f9522l[1] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_lay_g2q2_timer_value_txt);
                        this.f9522l[2] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_lay_g2q3_timer_value_txt);
                        this.f9522l[3] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_lay_g2q4_timer_value_txt);
                        this.f9522l[4] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_lay_g2q5_timer_value_txt);
                        this.f9522l[5] = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_lay_g2q6_timer_value_txt);
                        this.f9523m = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_lay_pass_txt);
                        this.f9524n = (TextView) view.findViewById(C2656R.C2657id.view_result_sheet_infant_lay_fail_txt);
                        this.f9525o[0] = 5;
                        this.f9525o[1] = 6;
                    }

                    /* renamed from: a */
                    public void mo9300a() {
                        this.f9511a.setVisibility(0);
                    }

                    /* renamed from: a */
                    public void mo9301a(C2544l lVar) {
                        C2545m u = C2515br.this.f9377h.mo9616u(lVar.mo9470a());
                        boolean[][] zArr = (boolean[][]) Array.newInstance(Boolean.TYPE, new int[]{this.f9525o.length, 6});
                        zArr[0][0] = u.mo9501c() == 1;
                        zArr[0][1] = u.mo9504d() == 1;
                        zArr[0][2] = u.mo9507e() == 1;
                        zArr[0][3] = u.mo9510f() == 1;
                        zArr[0][4] = u.mo9513g() == 1;
                        zArr[1][0] = u.mo9516h() == 1;
                        zArr[1][1] = u.mo9518i() == 1;
                        zArr[1][2] = u.mo9520j() == 1;
                        zArr[1][3] = u.mo9522k() == 1;
                        zArr[1][4] = u.mo9526m() == 1;
                        zArr[1][5] = u.mo9528n() == 1;
                        for (int i = 0; i < this.f9525o.length; i++) {
                            for (int i2 = 0; i2 < this.f9525o[i]; i2++) {
                                if (zArr[i][i2]) {
                                    this.f9514d[i][i2].setBackgroundResource(C2656R.drawable.bg_test_selected);
                                    this.f9516f[i][i2].setImageResource(C2656R.drawable.img_test_check);
                                } else {
                                    this.f9514d[i][i2].setBackgroundResource(C2656R.drawable.bg_test_unselected);
                                    this.f9516f[i][i2].setImageResource(C2656R.drawable.img_test_uncheck);
                                }
                            }
                        }
                        int[] iArr = {50, 50, 100};
                        int[] iArr2 = {750, 1200, 250};
                        switch (lVar.mo9485h()) {
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
                        this.f9512b[0].setScaleHeight((float) iArr2[0]);
                        int i3 = 0;
                        int i4 = 0;
                        while (true) {
                            int i5 = i4;
                            int i6 = i3;
                            if (i5 < iArr.length) {
                                int i7 = i6 + iArr[i5];
                                this.f9511a.mo10069b(this.f9512b[i5], 100.0f, (float) i7, 2095.0f, (float) iArr2[i5]);
                                i3 = i7 + iArr2[i5];
                                i4 = i5 + 1;
                            } else {
                                this.f9511a.mo10069b(this.f9521k, 1780.0f, 500.0f, 200.0f, 150.0f);
                                this.f9526p = i6;
                                this.f9511a.setScaleHeight((float) i6);
                                this.f9513c[0].setText(C2557y.f9835g.f10419fA);
                                this.f9513c[1].setText(C2557y.f9835g.f10149W);
                                this.f9521k.setVisibility(4);
                                this.f9516f[0][2].setVisibility(0);
                                switch (lVar.mo9485h()) {
                                    case 1:
                                    case 4:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                        this.f9515e[0][0].setText(C2557y.f9835g.f10500gc);
                                        this.f9515e[0][1].setText(C2557y.f9835g.f10501gd);
                                        this.f9515e[0][2].setText(C2557y.f9835g.f10503gf);
                                        this.f9521k.setVisibility(0);
                                        this.f9521k.setText(String.format("%.1f%s", new Object[]{Double.valueOf(u.mo9534q()), C2557y.f9835g.f10348dj}));
                                        break;
                                    case 2:
                                    case 5:
                                        this.f9515e[0][0].setText(C2557y.f9835g.f10499gb);
                                        this.f9515e[0][1].setText(C2557y.f9835g.f10500gc);
                                        this.f9515e[0][2].setText(C2557y.f9835g.f10502ge);
                                        this.f9515e[0][3].setText(C2557y.f9835g.f10503gf);
                                        this.f9515e[0][4].setText(C2557y.f9835g.f10501gd);
                                        break;
                                    case 3:
                                    case 6:
                                        this.f9515e[0][0].setText(C2557y.f9835g.f10499gb);
                                        this.f9515e[0][1].setText(C2557y.f9835g.f10500gc);
                                        this.f9515e[0][2].setText(C2557y.f9835g.f10501gd);
                                        this.f9515e[0][3].setText(C2557y.f9835g.f10502ge);
                                        this.f9515e[0][4].setText(C2557y.f9835g.f10503gf);
                                        break;
                                }
                                this.f9515e[1][0].setText(C2557y.f9835g.f10141O + "1: " + C2557y.f9835g.f10504gg);
                                this.f9515e[1][1].setText(C2557y.f9835g.f10141O + "1: " + C2557y.f9835g.f10506gi);
                                this.f9515e[1][2].setText(C2557y.f9835g.f10141O + "2: " + C2557y.f9835g.f10508gk);
                                this.f9515e[1][3].setText(C2557y.f9835g.f10141O + "2: " + C2557y.f9835g.f10510gm);
                                this.f9515e[1][4].setText(C2557y.f9835g.f10141O + "3: " + C2557y.f9835g.f10512go);
                                this.f9515e[1][5].setText(C2557y.f9835g.f10141O + "3: " + C2557y.f9835g.f10514gq);
                                this.f9518h.setText(C2557y.f9835g.f10533hI);
                                this.f9519i[0].setText(C2557y.f9835g.f10534hJ);
                                this.f9519i[1].setText(C2557y.f9835g.f10535hK);
                                if (u.mo9530o() == 1) {
                                    this.f9520j[0].setImageResource(C2656R.drawable.img_test_mibi_check);
                                } else {
                                    this.f9520j[0].setImageResource(C2656R.drawable.img_test_mibi_uncheck);
                                }
                                if (u.mo9532p() == 1) {
                                    this.f9520j[1].setImageResource(C2656R.drawable.img_test_mibi_check);
                                } else {
                                    this.f9520j[1].setImageResource(C2656R.drawable.img_test_mibi_uncheck);
                                }
                                this.f9522l[0].setText(String.format("%.2f%s", new Object[]{Double.valueOf(u.f9687a), C2557y.f9835g.f10348dj}));
                                this.f9522l[1].setText(String.format("%.2f%s", new Object[]{Double.valueOf(u.f9688b), C2557y.f9835g.f10348dj}));
                                this.f9522l[2].setText(String.format("%.2f%s", new Object[]{Double.valueOf(u.f9689c), C2557y.f9835g.f10348dj}));
                                this.f9522l[3].setText(String.format("%.2f%s", new Object[]{Double.valueOf(u.f9690d), C2557y.f9835g.f10348dj}));
                                this.f9522l[4].setText(String.format("%.2f%s", new Object[]{Double.valueOf(u.f9691e), C2557y.f9835g.f10348dj}));
                                this.f9522l[5].setText(String.format("%.2f%s", new Object[]{Double.valueOf(u.f9692f), C2557y.f9835g.f10348dj}));
                                this.f9523m.setText(C2557y.f9835g.f10139M);
                                this.f9524n.setText(C2557y.f9835g.f10225bS);
                                if (lVar.mo9477d() == 0) {
                                    this.f9523m.setTextColor(-10658467);
                                    this.f9524n.setTextColor(-1);
                                    this.f9523m.setAlpha(0.3f);
                                    this.f9524n.setAlpha(1.0f);
                                    return;
                                }
                                this.f9523m.setTextColor(-1);
                                this.f9524n.setTextColor(-10658467);
                                this.f9523m.setAlpha(1.0f);
                                this.f9524n.setAlpha(0.3f);
                                return;
                            }
                        }
                    }

                    /* renamed from: b */
                    public void mo9302b() {
                        this.f9511a.setVisibility(4);
                    }
                }

                public C2519b(View view) {
                    this.f9440a = new C2520a(view);
                    this.f9441b = new C2521b(view);
                    this.f9442c = new C2522c(view);
                    this.f9443d = new C2523d(view);
                }

                /* access modifiers changed from: package-private */
                /* renamed from: a */
                public void mo9285a() {
                    this.f9440a.mo9291a();
                    this.f9441b.mo9296b();
                    this.f9442c.mo9299b();
                    this.f9443d.mo9302b();
                }

                /* access modifiers changed from: package-private */
                /* renamed from: a */
                public void mo9286a(C2544l lVar) {
                    switch (lVar.mo9487i()) {
                        case 1:
                            switch (lVar.mo9483g()) {
                                case 1:
                                case 2:
                                    this.f9441b.mo9295a(lVar);
                                    mo9287b();
                                    this.f9444e = this.f9441b.f9492w;
                                    C2517a.this.f9390b.mo10069b(this.f9441b.f9470a, 0.0f, 1710.0f, 2295.0f, (float) this.f9444e);
                                    return;
                                case 3:
                                    this.f9443d.mo9301a(lVar);
                                    mo9289d();
                                    this.f9444e = this.f9443d.f9526p;
                                    C2517a.this.f9390b.mo10069b(this.f9443d.f9511a, 0.0f, 100.0f, 2295.0f, (float) this.f9444e);
                                    return;
                                default:
                                    return;
                            }
                        case 2:
                            switch (lVar.mo9483g()) {
                                case 1:
                                case 2:
                                    this.f9440a.mo9292a(lVar);
                                    mo9285a();
                                    this.f9444e = this.f9440a.f9468w;
                                    C2517a.this.f9390b.mo10069b(this.f9440a.f9446a, 0.0f, 1710.0f, 2295.0f, (float) this.f9444e);
                                    return;
                                case 3:
                                    this.f9442c.mo9298a(lVar);
                                    mo9288c();
                                    this.f9444e = this.f9442c.f9509p;
                                    C2517a.this.f9390b.mo10069b(this.f9442c.f9494a, 0.0f, 100.0f, 2295.0f, (float) this.f9444e);
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
                public void mo9287b() {
                    this.f9440a.mo9293b();
                    this.f9441b.mo9294a();
                    this.f9442c.mo9299b();
                    this.f9443d.mo9302b();
                }

                /* access modifiers changed from: package-private */
                /* renamed from: c */
                public void mo9288c() {
                    this.f9440a.mo9293b();
                    this.f9441b.mo9296b();
                    this.f9442c.mo9297a();
                    this.f9443d.mo9302b();
                }

                /* access modifiers changed from: package-private */
                /* renamed from: d */
                public void mo9289d() {
                    this.f9440a.mo9293b();
                    this.f9441b.mo9296b();
                    this.f9442c.mo9299b();
                    this.f9443d.mo9300a();
                }

                /* access modifiers changed from: package-private */
                /* renamed from: e */
                public void mo9290e() {
                    this.f9440a.mo9293b();
                    this.f9441b.mo9296b();
                    this.f9442c.mo9299b();
                    this.f9443d.mo9302b();
                }
            }

            public C2517a(View view) {
                this.f9389a = (ScrollView) view.findViewById(C2656R.C2657id.view_result_detail_scroll);
                this.f9390b = (ScalableLayout) view.findViewById(C2656R.C2657id.view_result_detail_scroll_sc);
                this.f9391c = new C2518a(view);
                this.f9392d = new C2519b(view);
                this.f9393e = (TextView) view.findViewById(C2656R.C2657id.view_result_detail_graph_title);
                this.f9394f = (TextView) view.findViewById(C2656R.C2657id.view_result_detail_sheet_title);
            }

            /* renamed from: a */
            public void mo9275a() {
                this.f9389a.setVisibility(0);
            }

            /* renamed from: a */
            public void mo9276a(C2544l lVar) {
                this.f9393e.setText(C2557y.f9835g.f10396ee);
                this.f9394f.setText(C2557y.f9835g.f10397ef);
                switch (lVar.mo9483g()) {
                    case 1:
                    case 2:
                        this.f9393e.setVisibility(0);
                        this.f9391c.mo9278a();
                        this.f9391c.mo9282a(lVar);
                        if (lVar.mo9489j() != 1) {
                            this.f9394f.setVisibility(4);
                            this.f9392d.mo9290e();
                            this.f9390b.setScaleHeight(1610.0f);
                            break;
                        } else {
                            this.f9394f.setVisibility(0);
                            this.f9392d.mo9286a(lVar);
                            this.f9390b.mo10057a((View) this.f9394f, 100.0f, 1610.0f);
                            this.f9390b.setScaleHeight((float) (this.f9392d.f9444e + 1710));
                            break;
                        }
                    case 3:
                        this.f9393e.setVisibility(4);
                        this.f9391c.mo9283b();
                        if (lVar.mo9489j() != 1) {
                            this.f9394f.setVisibility(4);
                            this.f9392d.mo9290e();
                            this.f9390b.setScaleHeight(0.0f);
                            break;
                        } else {
                            this.f9394f.setVisibility(0);
                            this.f9392d.mo9286a(lVar);
                            this.f9390b.mo10057a((View) this.f9394f, 100.0f, 0.0f);
                            this.f9390b.setScaleHeight((float) (this.f9392d.f9444e + 100));
                            break;
                        }
                }
                this.f9389a.scrollTo(0, 0);
            }

            /* renamed from: b */
            public void mo9277b() {
                this.f9389a.setVisibility(4);
            }
        }

        /* renamed from: com.imlabworld.HS_Instructor.br$a$b */
        class C2524b {

            /* renamed from: A */
            final ImageView[] f9528A = new ImageView[5];

            /* renamed from: B */
            final TextView[] f9529B = new TextView[5];

            /* renamed from: C */
            final ScalableLayout f9530C;

            /* renamed from: a */
            final ScrollView f9532a;

            /* renamed from: b */
            final ImageView f9533b;

            /* renamed from: c */
            final TextView f9534c;

            /* renamed from: d */
            final TextView f9535d;

            /* renamed from: e */
            final TextView f9536e;

            /* renamed from: f */
            final TextView f9537f;

            /* renamed from: g */
            final TextView f9538g;

            /* renamed from: h */
            final TextView f9539h;

            /* renamed from: i */
            final TextView f9540i;

            /* renamed from: j */
            final TextView f9541j;

            /* renamed from: k */
            final TextView f9542k;

            /* renamed from: l */
            final TextView f9543l;

            /* renamed from: m */
            final TextView f9544m;

            /* renamed from: n */
            final TextView f9545n;

            /* renamed from: o */
            final TextView f9546o;

            /* renamed from: p */
            final TextView f9547p;

            /* renamed from: q */
            final TextView f9548q;

            /* renamed from: r */
            final TextView f9549r;

            /* renamed from: s */
            final TextView f9550s;

            /* renamed from: t */
            final TextView f9551t;

            /* renamed from: u */
            final TextView f9552u;

            /* renamed from: v */
            final TextView f9553v;

            /* renamed from: w */
            final TextView f9554w;

            /* renamed from: x */
            final TextView f9555x;

            /* renamed from: y */
            final TextView f9556y;

            /* renamed from: z */
            final TextView f9557z;

            public C2524b(View view) {
                this.f9532a = (ScrollView) view.findViewById(C2656R.C2657id.view_result_overview_scroll);
                this.f9533b = (ImageView) view.findViewById(C2656R.C2657id.view_result_overview_result_score_box);
                this.f9534c = (TextView) view.findViewById(C2656R.C2657id.view_result_overview_result_score_title);
                this.f9535d = (TextView) view.findViewById(C2656R.C2657id.view_result_overview_result_score_txt);
                this.f9536e = (TextView) view.findViewById(C2656R.C2657id.view_result_overview_result_pass_txt);
                this.f9537f = (TextView) view.findViewById(C2656R.C2657id.view_result_overview_result_fail_txt);
                this.f9538g = (TextView) view.findViewById(C2656R.C2657id.view_result_overview_average_title);
                this.f9539h = (TextView) view.findViewById(C2656R.C2657id.view_result_overview_comp_score_title);
                this.f9540i = (TextView) view.findViewById(C2656R.C2657id.view_result_overview_comp_score_txt);
                this.f9541j = (TextView) view.findViewById(C2656R.C2657id.view_result_overview_comp_success_rate_title);
                this.f9542k = (TextView) view.findViewById(C2656R.C2657id.view_result_overview_comp_success_rate_txt);
                this.f9543l = (TextView) view.findViewById(C2656R.C2657id.view_result_overview_comp_time_title);
                this.f9544m = (TextView) view.findViewById(C2656R.C2657id.view_result_overview_comp_time_txt);
                this.f9545n = (TextView) view.findViewById(C2656R.C2657id.view_result_overview_comp_depth_title);
                this.f9546o = (TextView) view.findViewById(C2656R.C2657id.view_result_overview_comp_depth_txt);
                this.f9547p = (TextView) view.findViewById(C2656R.C2657id.view_result_overview_breath_score_title);
                this.f9548q = (TextView) view.findViewById(C2656R.C2657id.view_result_overview_breath_score_txt);
                this.f9549r = (TextView) view.findViewById(C2656R.C2657id.view_result_overview_breath_success_rate_title);
                this.f9550s = (TextView) view.findViewById(C2656R.C2657id.view_result_overview_breath_success_rate_txt);
                this.f9551t = (TextView) view.findViewById(C2656R.C2657id.view_result_overview_breath_amount_title);
                this.f9552u = (TextView) view.findViewById(C2656R.C2657id.view_result_overview_breath_amount_txt);
                this.f9553v = (TextView) view.findViewById(C2656R.C2657id.view_result_overview_hot_score_title);
                this.f9554w = (TextView) view.findViewById(C2656R.C2657id.view_result_overview_hot_score_txt);
                this.f9555x = (TextView) view.findViewById(C2656R.C2657id.view_result_overview_hot_time_txt);
                this.f9556y = (TextView) view.findViewById(C2656R.C2657id.view_result_overview_cpm_txt);
                this.f9557z = (TextView) view.findViewById(C2656R.C2657id.view_result_overview_compression_position_title);
                this.f9528A[0] = (ImageView) view.findViewById(C2656R.C2657id.view_result_overview_compression_position_h);
                this.f9528A[1] = (ImageView) view.findViewById(C2656R.C2657id.view_result_overview_compression_position_la);
                this.f9528A[2] = (ImageView) view.findViewById(C2656R.C2657id.view_result_overview_compression_position_s);
                this.f9528A[3] = (ImageView) view.findViewById(C2656R.C2657id.view_result_overview_compression_position_ra);
                this.f9528A[4] = (ImageView) view.findViewById(C2656R.C2657id.view_result_overview_compression_position_c);
                this.f9529B[0] = (TextView) view.findViewById(C2656R.C2657id.view_result_overview_compression_position_h_txt);
                this.f9529B[1] = (TextView) view.findViewById(C2656R.C2657id.view_result_overview_compression_position_la_txt);
                this.f9529B[2] = (TextView) view.findViewById(C2656R.C2657id.view_result_overview_compression_position_s_txt);
                this.f9529B[3] = (TextView) view.findViewById(C2656R.C2657id.view_result_overview_compression_position_ra_txt);
                this.f9529B[4] = (TextView) view.findViewById(C2656R.C2657id.view_result_overview_compression_position_c_txt);
                this.f9530C = (ScalableLayout) view.findViewById(C2656R.C2657id.view_result_overview_child_scroll_sc);
            }

            /* renamed from: a */
            public void mo9303a() {
                this.f9532a.setVisibility(0);
            }

            /* renamed from: a */
            public void mo9304a(C2544l lVar) {
                double d;
                double d2;
                double d3;
                double d4;
                C2550r q = C2515br.this.f9377h.mo9612q(lVar.mo9470a());
                if (lVar.mo9489j() == 0) {
                    this.f9536e.setVisibility(4);
                    this.f9537f.setVisibility(4);
                } else {
                    this.f9536e.setVisibility(0);
                    this.f9537f.setVisibility(0);
                    this.f9536e.setText(C2557y.f9835g.f10139M);
                    this.f9537f.setText(C2557y.f9835g.f10225bS);
                    if (lVar.mo9477d() == 0) {
                        this.f9536e.setTextColor(-10658467);
                        this.f9537f.setTextColor(-1);
                        this.f9536e.setAlpha(0.3f);
                        this.f9537f.setAlpha(1.0f);
                    } else {
                        this.f9536e.setTextColor(-1);
                        this.f9537f.setTextColor(-10658467);
                        this.f9536e.setAlpha(1.0f);
                        this.f9537f.setAlpha(0.3f);
                    }
                }
                int round = (int) Math.round(q.mo9640c() * 100.0d);
                this.f9534c.setText(C2557y.f9835g.f10362dx);
                this.f9535d.setText(round + "");
                if (round >= 70) {
                    this.f9533b.setImageResource(C2656R.drawable.img_test_result_box_green);
                } else if (round > 0) {
                    this.f9533b.setImageResource(C2656R.drawable.img_test_result_box_yellow);
                } else {
                    this.f9533b.setImageResource(C2656R.drawable.img_test_result_box_red);
                }
                this.f9538g.setText(C2557y.f9835g.f10569hz);
                int round2 = (int) Math.round(q.mo9642d() * 100.0d);
                int round3 = (int) Math.round(q.mo9644e() * 100.0d);
                int round4 = (int) Math.round(q.mo9646f() * 100.0d);
                this.f9539h.setText(C2557y.f9835g.f10147U);
                this.f9541j.setText(C2557y.f9835g.f10541hQ);
                this.f9543l.setText(C2557y.f9835g.f10185af + "\n(CPM*)");
                this.f9545n.setText(C2557y.f9835g.f10188ai + "\n(cm)");
                this.f9547p.setText(C2557y.f9835g.f10148V);
                this.f9549r.setText(C2557y.f9835g.f10541hQ);
                this.f9551t.setText(C2557y.f9835g.f10572k + "\n(ml)");
                this.f9553v.setText(C2557y.f9835g.f10184ae);
                this.f9557z.setText(C2557y.f9835g.f10314dB);
                if (round2 == -100) {
                    this.f9540i.setText("-");
                } else {
                    this.f9540i.setText(round2 + "");
                }
                if (round3 == -100) {
                    this.f9548q.setText("-");
                } else {
                    this.f9548q.setText(round3 + "");
                }
                if (round4 == -100) {
                    this.f9554w.setText("-");
                } else {
                    this.f9554w.setText(round4 + "");
                }
                this.f9556y.setText(C2557y.f9835g.f10542hR);
                double d5 = 5.0d;
                double d6 = 6.0d;
                switch (lVar.mo9483g()) {
                    case 1:
                        switch (lVar.mo9485h()) {
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
                ArrayList<C2541i> r = C2515br.this.f9377h.mo9613r(lVar.mo9470a());
                ArrayList<C2542j> s = C2515br.this.f9377h.mo9614s(lVar.mo9470a());
                int size = r == null ? 0 : r.size();
                double d7 = 0.0d;
                int[] iArr = new int[5];
                for (int i = 0; i < 5; i++) {
                    iArr[i] = 0;
                }
                int i2 = 0;
                this.f9530C.setScaleWidth((float) (size * C1644a.C1650a.f5539b));
                this.f9530C.removeAllViews();
                int i3 = 0;
                int i4 = 0;
                double d8 = 0.0d;
                double d9 = 0.0d;
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                while (i3 < size) {
                    C2541i iVar = r.get(i3);
                    int e = i8 + iVar.mo9415e();
                    int d10 = i7 + iVar.mo9413d();
                    int h = i6 + iVar.mo9421h();
                    int g = i5 + iVar.mo9419g();
                    iArr[0] = iArr[0] + iVar.mo9425j();
                    iArr[1] = iArr[1] + iVar.mo9427k();
                    iArr[2] = iArr[2] + iVar.mo9429l();
                    iArr[3] = iArr[3] + iVar.mo9431m();
                    iArr[4] = iArr[4] + iVar.mo9432n();
                    int d11 = iVar.mo9413d();
                    int g2 = iVar.mo9419g();
                    int i9 = 0;
                    double d12 = 0.0d;
                    double d13 = 0.0d;
                    double d14 = 0.0d;
                    int i10 = 0;
                    while (i10 < d11) {
                        C2542j jVar = s.get(i2);
                        int i11 = i2 + 1;
                        if (jVar.mo9447g() != 0) {
                            d14 += C2515br.m13768c((double) jVar.mo9447g(), lVar.mo9483g());
                            i9++;
                        }
                        i10++;
                        d13 = (jVar.mo9453j() / ((double) d11)) + d13;
                        i2 = i11;
                    }
                    double d15 = i9 != 0 ? d14 / ((double) i9) : 0.0d;
                    int i12 = 0;
                    double d16 = 0.0d;
                    while (i12 < g2) {
                        C2542j jVar2 = s.get(i2);
                        i2++;
                        double b = (C2515br.m13769d((double) jVar2.mo9451i(), lVar.mo9483g()) / ((double) g2)) + d12;
                        d16 += jVar2.mo9453j() / ((double) g2);
                        i12++;
                        d12 = b;
                    }
                    d9 += iVar.mo9417f();
                    d8 += (d15 / 10.0d) * ((double) iVar.mo9432n());
                    int g3 = (int) (((double) i4) + (((double) iVar.mo9419g()) * d12));
                    double i13 = i3 < size + -1 ? iVar.mo9423i() + d7 : d7;
                    TextView textView = new TextView(C2515br.this.getActivity());
                    textView.setGravity(17);
                    textView.setText(String.format("%d", new Object[]{Integer.valueOf(i3 + 1)}));
                    this.f9530C.mo10058a((View) textView, (float) (i3 * C1644a.C1650a.f5539b), 0.0f, 250.0f, 136.0f);
                    this.f9530C.mo10059a(textView, 45.0f);
                    TextView textView2 = new TextView(C2515br.this.getActivity());
                    textView2.setGravity(17);
                    if (round2 == -100) {
                        textView2.setText("-");
                    } else {
                        textView2.setText(String.format("%d/%d", new Object[]{Integer.valueOf(iVar.mo9415e()), Integer.valueOf(iVar.mo9413d())}));
                    }
                    this.f9530C.mo10058a((View) textView2, (float) (i3 * C1644a.C1650a.f5539b), 150.0f, 250.0f, 100.0f);
                    this.f9530C.mo10059a(textView2, 45.0f);
                    TextView textView3 = new TextView(C2515br.this.getActivity());
                    textView3.setGravity(17);
                    if (round2 == -100) {
                        textView3.setText("-");
                        textView3.setTextColor(-10658467);
                    } else {
                        textView3.setText(String.format("%.1fs\n(%d)", new Object[]{Double.valueOf(iVar.mo9417f()), Integer.valueOf((int) d13)}));
                        if (d13 < 100.0d || d13 > 120.0d) {
                            textView3.setTextColor(-764642);
                        } else {
                            textView3.setTextColor(-10658467);
                        }
                    }
                    this.f9530C.mo10058a((View) textView3, (float) (i3 * C1644a.C1650a.f5539b), 250.0f, 250.0f, 160.0f);
                    this.f9530C.mo10059a(textView3, 45.0f);
                    TextView textView4 = new TextView(C2515br.this.getActivity());
                    textView4.setGravity(17);
                    if (round2 == -100) {
                        textView4.setText("-");
                        textView4.setTextColor(-10658467);
                    } else {
                        textView4.setText(String.format("%.1f", new Object[]{Double.valueOf(d15 / 10.0d)}));
                        if (d15 / 10.0d < d4) {
                            textView4.setTextColor(-764642);
                        } else if (d15 / 10.0d <= d3) {
                            textView4.setTextColor(-10658467);
                        } else {
                            textView4.setTextColor(-12964);
                        }
                    }
                    this.f9530C.mo10058a((View) textView4, (float) (i3 * C1644a.C1650a.f5539b), 410.0f, 250.0f, 160.0f);
                    this.f9530C.mo10059a(textView4, 45.0f);
                    TextView textView5 = new TextView(C2515br.this.getActivity());
                    textView5.setGravity(17);
                    if (round3 == -100) {
                        textView5.setText("-");
                    } else {
                        textView5.setText(String.format("%d/%d", new Object[]{Integer.valueOf(iVar.mo9421h()), Integer.valueOf(iVar.mo9419g())}));
                    }
                    this.f9530C.mo10058a((View) textView5, (float) (i3 * C1644a.C1650a.f5539b), 590.0f, 250.0f, 160.0f);
                    this.f9530C.mo10059a(textView5, 45.0f);
                    TextView textView6 = new TextView(C2515br.this.getActivity());
                    textView6.setGravity(17);
                    if (round3 == -100) {
                        textView6.setText("-");
                        textView6.setTextColor(-10658467);
                    } else {
                        textView6.setText(String.format("%d", new Object[]{Integer.valueOf((int) d12)}));
                        if (d12 < d2) {
                            textView6.setTextColor(-764642);
                        } else if (d12 <= d) {
                            textView6.setTextColor(-10658467);
                        } else {
                            textView6.setTextColor(-12964);
                        }
                    }
                    this.f9530C.mo10058a((View) textView6, (float) (i3 * C1644a.C1650a.f5539b), 750.0f, 250.0f, 160.0f);
                    this.f9530C.mo10059a(textView6, 45.0f);
                    if (i3 < size - 1) {
                        TextView textView7 = new TextView(C2515br.this.getActivity());
                        textView7.setGravity(17);
                        textView7.setText(String.format("%.1fs", new Object[]{Double.valueOf(iVar.mo9423i())}));
                        if (iVar.mo9423i() <= 10.0d) {
                            textView7.setTextColor(-10658467);
                        } else {
                            textView7.setTextColor(-764642);
                        }
                        this.f9530C.mo10058a((View) textView7, (float) ((i3 * C1644a.C1650a.f5539b) + 125), 916.0f, 250.0f, 310.0f);
                        this.f9530C.mo10059a(textView7, 45.0f);
                    }
                    i3++;
                    d7 = i13;
                    i4 = g3;
                    i5 = g;
                    i6 = h;
                    i7 = d10;
                    i8 = e;
                }
                if (i7 != 0) {
                    this.f9542k.setText(String.format("%d", new Object[]{Integer.valueOf((i8 * 100) / i7)}) + "%");
                    this.f9544m.setText(String.format("%.1fs\n(%d)", new Object[]{Double.valueOf(d9 / ((double) size)), Integer.valueOf((int) (((double) (i7 * 60)) / d9))}));
                    if (((double) (i7 * 60)) / d9 < 100.0d || ((double) (i7 * 60)) / d9 > 120.0d) {
                        this.f9544m.setTextColor(-764642);
                    } else {
                        this.f9544m.setTextColor(-10658467);
                    }
                } else {
                    this.f9542k.setText(String.format("%d", new Object[]{0}) + "%");
                    this.f9544m.setText(String.format("%.1fs\n(%d)", new Object[]{Float.valueOf(0.0f), 0}));
                    this.f9544m.setTextColor(-764642);
                }
                if (iArr[4] != 0) {
                    this.f9546o.setText(String.format("%.1f", new Object[]{Double.valueOf(d8 / ((double) iArr[4]))}));
                    if (d8 / ((double) iArr[4]) < d4) {
                        this.f9546o.setTextColor(-764642);
                    } else if (d8 / ((double) iArr[4]) <= d3) {
                        this.f9546o.setTextColor(-10658467);
                    } else {
                        this.f9546o.setTextColor(-12964);
                    }
                } else {
                    this.f9546o.setText(String.format("%.1f", new Object[]{Float.valueOf(0.0f)}));
                    this.f9546o.setTextColor(-764642);
                }
                if (i5 != 0) {
                    this.f9550s.setText(String.format("%d", new Object[]{Integer.valueOf((i6 * 100) / i5)}) + "%");
                    this.f9552u.setText(String.format("%d", new Object[]{Integer.valueOf(i4 / i5)}));
                    if (((double) (i4 / i5)) < d2) {
                        this.f9552u.setTextColor(-764642);
                    } else if (((double) (i4 / i5)) <= d) {
                        this.f9552u.setTextColor(-10658467);
                    } else {
                        this.f9552u.setTextColor(-12964);
                    }
                } else {
                    this.f9550s.setText(String.format("%d", new Object[]{0}) + "%");
                    this.f9552u.setText(String.format("%d", new Object[]{0}));
                    this.f9552u.setTextColor(-764642);
                }
                if (size >= 2) {
                    d7 /= (double) (size - 1);
                }
                this.f9555x.setText(String.format("%.1fs", new Object[]{Double.valueOf(d7)}));
                if (d7 <= 10.0d) {
                    this.f9555x.setTextColor(-10658467);
                } else {
                    this.f9555x.setTextColor(-764642);
                }
                int[] iArr2 = new int[5];
                if (i7 != 0) {
                    int i14 = 0;
                    while (true) {
                        int i15 = i14;
                        if (i15 < 5) {
                            iArr2[i15] = (iArr[i15] * 100) / i7;
                            float min = Math.min((((float) iArr2[i15]) / 100.0f) + 0.2f, 1.0f);
                            if (iArr2[i15] == 0) {
                                min = 0.0f;
                            }
                            this.f9528A[i15].setAlpha(min);
                            this.f9529B[i15].setText(iArr2[i15] + "%");
                            i14 = i15 + 1;
                        }
                    }
                } else {
                    for (int i16 = 0; i16 < 5; i16++) {
                        iArr2[i16] = 0;
                        this.f9528A[i16].setAlpha(0.0f);
                        this.f9529B[i16].setText(iArr2[i16] + "%");
                    }
                }
                this.f9532a.scrollTo(0, 0);
            }

            /* renamed from: b */
            public void mo9305b() {
                this.f9532a.setVisibility(4);
            }
        }

        public C2516a(View view) {
            this.f9387g = view;
            this.f9385e = new C2524b(view);
            this.f9386f = new C2517a(view);
            this.f9381a = (ScalableLayout) view.findViewById(C2656R.C2657id.view_result_sc);
            this.f9382b = (TextView) view.findViewById(C2656R.C2657id.view_result_overview_btn);
            this.f9383c = (TextView) view.findViewById(C2656R.C2657id.view_result_detail_btn);
            this.f9384d = (TextView) view.findViewById(C2656R.C2657id.view_result_name_txt);
            this.f9381a.setOnClickListener(this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo9268a() {
            this.f9382b.setAlpha(1.0f);
            this.f9382b.setBackgroundColor(-6434106);
            this.f9383c.setBackgroundColor(-526345);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo9269a(C2544l lVar) {
            C2553u j = C2515br.this.f9377h.mo9602j(lVar.mo9475c());
            String str = "";
            switch (lVar.mo9483g()) {
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
            this.f9382b.setText(C2557y.f9835g.f10540hP);
            this.f9383c.setText(C2557y.f9835g.f10358dt);
            this.f9384d.setText(j.mo9718c() + " | " + str);
            this.f9386f.mo9276a(lVar);
            switch (lVar.mo9483g()) {
                case 1:
                case 2:
                    this.f9385e.mo9304a(lVar);
                    mo9272d();
                    this.f9382b.setOnClickListener(this);
                    this.f9383c.setOnClickListener(this);
                    return;
                case 3:
                    mo9273e();
                    mo9271c();
                    this.f9382b.setOnClickListener((View.OnClickListener) null);
                    this.f9383c.setOnClickListener((View.OnClickListener) null);
                    return;
                default:
                    return;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo9270b() {
            this.f9382b.setAlpha(1.0f);
            this.f9382b.setBackgroundColor(-526345);
            this.f9383c.setBackgroundColor(-6434106);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo9271c() {
            this.f9382b.setAlpha(0.15f);
            this.f9382b.setBackgroundColor(-526345);
            this.f9383c.setBackgroundColor(-6434106);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo9272d() {
            this.f9385e.mo9303a();
            this.f9386f.mo9277b();
            mo9268a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo9273e() {
            this.f9385e.mo9305b();
            this.f9386f.mo9275a();
            mo9270b();
        }

        public void onClick(View view) {
            switch (view.getId()) {
                case C2656R.C2657id.view_result_detail_btn /*2131232867*/:
                    mo9273e();
                    return;
                case C2656R.C2657id.view_result_overview_btn /*2131232909*/:
                    mo9272d();
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: com.imlabworld.HS_Instructor.br$b */
    class C2525b {

        /* renamed from: a */
        final ListView f9558a;

        /* renamed from: b */
        final ImageView f9559b;

        public C2525b(View view) {
            this.f9558a = (ListView) view.findViewById(C2656R.C2657id.view_result_listview);
            this.f9559b = (ImageView) view.findViewById(C2656R.C2657id.view_result_close_btn);
            this.f9559b.setOnClickListener(C2515br.this);
            this.f9558a.setOnItemClickListener(C2515br.this);
        }
    }

    /* renamed from: com.imlabworld.HS_Instructor.br$c */
    public interface C2526c {
        /* renamed from: s */
        void mo8641s();
    }

    /* renamed from: a */
    public static C2515br m13764a(String str) {
        C2515br brVar = new C2515br();
        Bundle bundle = new Bundle();
        bundle.putString(f9370a, str);
        brVar.setArguments(bundle);
        return brVar;
    }

    /* renamed from: a */
    private void m13766a() {
        this.f9380k.mo9269a(this.f9378i.get(this.f9376g));
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static double m13768c(double d, int i) {
        return (i != 2 ? d < 58.0d ? (d * 5.0d) / 58.0d : d <= 84.0d ? (((d - 58.0d) * 1.0d) / 26.0d) + 5.0d : (6.0d * d) / 84.0d : d < 45.0d ? (d * 4.0d) / 45.0d : d <= 65.0d ? (((d - 45.0d) * 1.0d) / 20.0d) + 4.0d : (d * 5.0d) / 65.0d) * 10.0d;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static double m13769d(double d, int i) {
        return i != 2 ? d < 35.0d ? (d * 400.0d) / 35.0d : d <= 70.0d ? (((d - 35.0d) * 300.0d) / 35.0d) + 400.0d : (700.0d * d) / 70.0d : d < 35.0d ? (d * 140.0d) / 35.0d : d <= 70.0d ? (((d - 35.0d) * 210.0d) / 35.0d) + 140.0d : (350.0d * d) / 70.0d;
    }

    /* renamed from: a */
    public void mo9261a(int i) {
        this.f9378i = this.f9377h.mo9607o(i);
        if (this.f9378i != null) {
            this.f9375f = new C2372am(getActivity(), this.f9378i);
            this.f9379j.f9558a.setAdapter(this.f9375f);
            this.f9376g = 0;
            m13766a();
            return;
        }
        this.f9373d.mo8641s();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (activity instanceof C2526c) {
            this.f9373d = (C2526c) activity;
            return;
        }
        throw new RuntimeException(activity.toString() + " must implement OnFragmentInteractionListener");
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case C2656R.C2657id.view_result_close_btn /*2131232866*/:
                this.f9373d.mo8641s();
                return;
            default:
                return;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.f9371b = getArguments().getString(f9370a);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f9377h = new C2548p(getActivity());
        this.f9372c = layoutInflater.inflate(C2656R.layout.view_result, viewGroup, false);
        this.f9374e = (ScalableLayout) this.f9372c.findViewById(C2656R.C2657id.view_result_sc);
        this.f9379j = new C2525b(this.f9372c);
        this.f9380k = new C2516a(this.f9372c);
        this.f9374e.setOnClickListener(this);
        return this.f9372c;
    }

    public void onDetach() {
        super.onDetach();
        this.f9373d = null;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f9375f.mo8776a(this.f9376g, false);
        this.f9375f.mo8776a(i, true);
        this.f9376g = i;
        m13766a();
    }
}
