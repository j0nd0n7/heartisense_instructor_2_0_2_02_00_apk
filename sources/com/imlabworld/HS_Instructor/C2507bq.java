package com.imlabworld.HS_Instructor;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.imlabworld.HS_Instructor.C2334ac;
import com.imlabworld.p079a.C2573ai;
import com.imlabworld.p079a.C2576al;
import com.imlabworld.p079a.C2614s;
import com.ssomai.android.scalablelayout.ScalableLayout;
import com.woxthebox.draglistview.C2656R;
import java.lang.reflect.Array;

/* renamed from: com.imlabworld.HS_Instructor.bq */
public class C2507bq extends Fragment {

    /* renamed from: b */
    private static final String f9216b = "param";

    /* renamed from: a */
    boolean f9217a = true;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C2509b f9218c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C2338ae[] f9219d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public long f9220e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public long f9221f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public long f9222g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f9223h;

    /* renamed from: i */
    private C2510c f9224i;

    /* renamed from: com.imlabworld.HS_Instructor.bq$a */
    public enum C2508a {
        PAUSE,
        READY,
        NEXT,
        CHANGE_ROLE
    }

    /* renamed from: com.imlabworld.HS_Instructor.bq$b */
    public interface C2509b {
        /* renamed from: a */
        void mo8598a(int i, C2508a aVar, String str, String str2);
    }

    /* renamed from: com.imlabworld.HS_Instructor.bq$c */
    class C2510c implements View.OnClickListener {

        /* renamed from: a */
        final ScalableLayout f9230a;

        /* renamed from: b */
        final ImageView f9231b;

        /* renamed from: c */
        final TextView f9232c;

        /* renamed from: d */
        final TextView f9233d;

        /* renamed from: e */
        final ImageView f9234e;

        /* renamed from: f */
        final TextView f9235f;

        /* renamed from: g */
        final ImageView f9236g;

        /* renamed from: h */
        final C2511a f9237h;

        /* renamed from: i */
        final C2512b f9238i;

        /* renamed from: j */
        final C2513c f9239j;

        /* renamed from: k */
        final C2514d f9240k;

        /* renamed from: com.imlabworld.HS_Instructor.bq$c$a */
        class C2511a implements View.OnClickListener {

            /* renamed from: A */
            final TextView f9242A;

            /* renamed from: B */
            final ImageView f9243B;

            /* renamed from: C */
            final TextView f9244C;

            /* renamed from: D */
            final TextView f9245D;

            /* renamed from: E */
            final TextView f9246E;

            /* renamed from: F */
            final int[] f9247F = new int[4];

            /* renamed from: G */
            boolean f9248G;

            /* renamed from: H */
            boolean f9249H;

            /* renamed from: I */
            boolean f9250I;

            /* renamed from: J */
            boolean f9251J;

            /* renamed from: K */
            boolean f9252K;

            /* renamed from: a */
            final ScrollView f9254a;

            /* renamed from: b */
            final ScalableLayout f9255b;

            /* renamed from: c */
            final ScalableLayout[] f9256c = new ScalableLayout[5];

            /* renamed from: d */
            final TextView[] f9257d = new TextView[4];

            /* renamed from: e */
            final ScalableLayout[][] f9258e = ((ScalableLayout[][]) Array.newInstance(ScalableLayout.class, new int[]{4, 5}));

            /* renamed from: f */
            final TextView[][] f9259f = ((TextView[][]) Array.newInstance(TextView.class, new int[]{4, 5}));

            /* renamed from: g */
            final ImageView[][] f9260g = ((ImageView[][]) Array.newInstance(ImageView.class, new int[]{4, 5}));

            /* renamed from: h */
            final ImageView[][] f9261h = ((ImageView[][]) Array.newInstance(ImageView.class, new int[]{4, 5}));

            /* renamed from: i */
            final TextView f9262i;

            /* renamed from: j */
            final TextView[] f9263j = new TextView[2];

            /* renamed from: k */
            final ImageView[] f9264k = new ImageView[2];

            /* renamed from: l */
            final TextView f9265l;

            /* renamed from: m */
            final TextView f9266m;

            /* renamed from: n */
            final TextView f9267n;

            /* renamed from: o */
            final TextView f9268o;

            /* renamed from: p */
            final TextView f9269p;

            /* renamed from: q */
            final TextView f9270q;

            /* renamed from: r */
            final TextView f9271r;

            /* renamed from: s */
            final TextView f9272s;

            /* renamed from: t */
            final TextView f9273t;

            /* renamed from: u */
            final TextView f9274u;

            /* renamed from: v */
            final TextView f9275v;

            /* renamed from: w */
            final TextView f9276w;

            /* renamed from: x */
            final TextView f9277x;

            /* renamed from: y */
            final TextView f9278y;

            /* renamed from: z */
            final TextView f9279z;

            public C2511a(View view) {
                this.f9254a = (ScrollView) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_scroll);
                this.f9255b = (ScalableLayout) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_scroll_sc);
                this.f9256c[0] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_part1_sc);
                this.f9256c[1] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_part2_sc);
                this.f9256c[2] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_part3_sc);
                this.f9256c[3] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_part4_sc);
                this.f9256c[4] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_part5_sc);
                this.f9257d[0] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_g1_txt);
                this.f9257d[1] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_g2_txt);
                this.f9257d[2] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_g3_txt);
                this.f9257d[3] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_g4_txt);
                this.f9258e[0][0] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_g1q1_sc);
                this.f9258e[0][1] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_g1q2_sc);
                this.f9258e[0][2] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_g1q3_sc);
                this.f9258e[0][3] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_g1q4_sc);
                this.f9258e[0][4] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_g1q5_sc);
                this.f9258e[1][0] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_g2q1_sc);
                this.f9258e[1][1] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_g2q2_sc);
                this.f9258e[1][2] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_g2q3_sc);
                this.f9258e[1][3] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_g2q4_sc);
                this.f9258e[1][4] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_g2q5_sc);
                this.f9258e[2][0] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_g3q1_sc);
                this.f9258e[2][1] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_g3q2_sc);
                this.f9258e[2][2] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_g3q3_sc);
                this.f9258e[2][3] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_g3q4_sc);
                this.f9258e[2][4] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_g3q5_sc);
                this.f9258e[3][0] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_g4q1_sc);
                this.f9259f[0][0] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_g1q1_txt);
                this.f9259f[0][1] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_g1q2_txt);
                this.f9259f[0][2] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_g1q3_txt);
                this.f9259f[0][3] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_g1q4_txt);
                this.f9259f[0][4] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_g1q5_txt);
                this.f9259f[1][0] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_g2q1_txt);
                this.f9259f[1][1] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_g2q2_txt);
                this.f9259f[1][2] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_g2q3_txt);
                this.f9259f[1][3] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_g2q4_txt);
                this.f9259f[1][4] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_g2q5_txt);
                this.f9259f[2][0] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_g3q1_txt);
                this.f9259f[2][1] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_g3q2_txt);
                this.f9259f[2][2] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_g3q3_txt);
                this.f9259f[2][3] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_g3q4_txt);
                this.f9259f[2][4] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_g3q5_txt);
                this.f9259f[3][0] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_g4q1_txt);
                this.f9260g[0][0] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_g1q1_btn);
                this.f9260g[0][1] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_g1q2_btn);
                this.f9260g[0][2] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_g1q3_btn);
                this.f9260g[0][3] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_g1q4_btn);
                this.f9260g[0][4] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_g1q5_btn);
                this.f9260g[1][0] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_g2q1_btn);
                this.f9260g[1][1] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_g2q2_btn);
                this.f9260g[1][2] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_g2q3_btn);
                this.f9260g[1][3] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_g2q4_btn);
                this.f9260g[1][4] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_g2q5_btn);
                this.f9260g[2][0] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_g3q1_btn);
                this.f9260g[2][1] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_g3q2_btn);
                this.f9260g[2][2] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_g3q3_btn);
                this.f9260g[2][3] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_g3q4_btn);
                this.f9260g[2][4] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_g3q5_btn);
                this.f9260g[3][0] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_g4q1_btn);
                this.f9261h[0][0] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_g1q1_click_btn);
                this.f9261h[0][1] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_g1q2_click_btn);
                this.f9261h[0][2] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_g1q3_click_btn);
                this.f9261h[0][3] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_g1q4_click_btn);
                this.f9261h[0][4] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_g1q5_click_btn);
                this.f9261h[1][0] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_g2q1_click_btn);
                this.f9261h[1][1] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_g2q2_click_btn);
                this.f9261h[1][2] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_g2q3_click_btn);
                this.f9261h[1][3] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_g2q4_click_btn);
                this.f9261h[1][4] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_g2q5_click_btn);
                this.f9261h[2][0] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_g3q1_click_btn);
                this.f9261h[2][1] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_g3q2_click_btn);
                this.f9261h[2][2] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_g3q3_click_btn);
                this.f9261h[2][3] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_g3q4_click_btn);
                this.f9261h[2][4] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_g3q5_click_btn);
                this.f9261h[3][0] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_g4q1_click_btn);
                this.f9262i = (TextView) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_mibi_txt);
                this.f9263j[0] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_mibi1_txt);
                this.f9263j[1] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_mibi2_txt);
                this.f9264k[0] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_mibi1_btn);
                this.f9264k[1] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_mibi2_btn);
                this.f9245D = (TextView) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_hot_txt);
                this.f9266m = (TextView) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_g2_average_txt);
                this.f9267n = (TextView) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_g2_time_txt);
                this.f9268o = (TextView) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_g2q1_timer_value_txt);
                this.f9269p = (TextView) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_g2q3_timer_value_txt);
                this.f9270q = (TextView) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_g2q2_timer_value_txt);
                this.f9271r = (TextView) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_g2q4_timer_value_txt);
                this.f9272s = (TextView) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_g2q1_average_depth_txt);
                this.f9273t = (TextView) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_g2q3_average_depth_txt);
                this.f9274u = (TextView) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_g2q1_average_rate_txt);
                this.f9275v = (TextView) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_g2q3_average_rate_txt);
                this.f9276w = (TextView) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_g2q2_average_volume_txt);
                this.f9277x = (TextView) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_g2q4_average_volume_txt);
                this.f9278y = (TextView) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_g2q2_average_rate_txt);
                this.f9279z = (TextView) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_g2q4_average_rate_txt);
                this.f9242A = (TextView) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_g1q4_timer_value_txt);
                this.f9243B = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_g1q4_timer_btn);
                this.f9244C = (TextView) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_g1q4_timer_btn_txt);
                this.f9265l = (TextView) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_g2_stop_btn);
                this.f9246E = (TextView) view.findViewById(C2656R.C2657id.test_sheet_adult_bls_next_btn);
                this.f9247F[0] = 5;
                this.f9247F[1] = 5;
                this.f9247F[2] = 5;
                this.f9247F[3] = 1;
                for (int i = 0; i < this.f9247F.length; i++) {
                    for (int i2 = 0; i2 < this.f9247F[i]; i2++) {
                        this.f9261h[i][i2].setOnClickListener(this);
                    }
                }
                this.f9264k[0].setOnClickListener(this);
                this.f9264k[1].setOnClickListener(this);
                this.f9265l.setOnClickListener(this);
                this.f9246E.setOnClickListener(this);
                this.f9243B.setOnClickListener(this);
            }

            /* renamed from: a */
            public void mo9233a() {
                C2552t b = C2465bl.f8801c.get(0).mo9310b();
                C2556x.f9806w[C2465bl.f8800b] = new C2334ac();
                for (int i = 0; i < this.f9247F.length; i++) {
                    for (int i2 = 0; i2 < this.f9247F[i]; i2++) {
                        this.f9258e[i][i2].setBackgroundResource(C2656R.drawable.bg_test_unselected);
                        this.f9260g[i][i2].setImageResource(C2656R.drawable.img_test_uncheck);
                    }
                }
                int[] iArr = {50, 50, 50, 50, 0};
                int[] iArr2 = {750, 1250, 900, 300, 200};
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
                this.f9256c[0].setScaleHeight((float) iArr2[0]);
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    int i5 = i4;
                    int i6 = i3;
                    if (i5 < iArr.length) {
                        int i7 = i6 + iArr[i5];
                        this.f9255b.mo10069b(this.f9256c[i5], 100.0f, (float) i7, 2095.0f, (float) iArr2[i5]);
                        i3 = i7 + iArr2[i5];
                        i4 = i5 + 1;
                    } else {
                        this.f9255b.mo10069b(this.f9242A, 1780.0f, 650.0f, 200.0f, 150.0f);
                        this.f9255b.mo10069b(this.f9243B, 1980.0f, 500.0f, 200.0f, 300.0f);
                        this.f9255b.mo10069b(this.f9244C, 1980.0f, 500.0f, 200.0f, 300.0f);
                        this.f9255b.setScaleHeight((float) i6);
                        C2556x.f9806w[C2465bl.f8800b].f7756a = C2334ac.C2336b.TEST;
                        this.f9257d[0].setText(C2557y.f9835g.f10401ej);
                        this.f9257d[1].setText(C2557y.f9835g.f10149W);
                        this.f9257d[2].setText(C2557y.f9835g.f10372eG);
                        this.f9257d[3].setText(C2557y.f9835g.f10378eM);
                        this.f9242A.setVisibility(4);
                        this.f9243B.setVisibility(4);
                        this.f9244C.setVisibility(4);
                        this.f9260g[0][2].setVisibility(0);
                        this.f9260g[0][3].setVisibility(0);
                        switch (b.f9755k) {
                            case 1:
                            case 4:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                this.f9259f[0][0].setText(C2557y.f9835g.f10403el);
                                this.f9259f[0][1].setText(C2557y.f9835g.f10404em);
                                this.f9259f[0][2].setText(C2557y.f9835g.f10406eo);
                                this.f9259f[0][3].setText(C2557y.f9835g.f10407ep);
                                this.f9242A.setVisibility(0);
                                this.f9243B.setVisibility(0);
                                this.f9244C.setVisibility(0);
                                this.f9260g[0][2].setVisibility(4);
                                this.f9260g[0][3].setVisibility(4);
                                this.f9261h[0][2].setOnClickListener((View.OnClickListener) null);
                                this.f9261h[0][3].setOnClickListener((View.OnClickListener) null);
                                this.f9242A.setText(String.format("%.2f%s", new Object[]{Float.valueOf(0.0f), C2557y.f9835g.f10348dj}));
                                this.f9244C.setText(C2557y.f9835g.f10473gB);
                                this.f9248G = false;
                                break;
                            case 2:
                            case 5:
                                this.f9259f[0][0].setText(C2557y.f9835g.f10402ek);
                                this.f9259f[0][1].setText(C2557y.f9835g.f10403el);
                                this.f9259f[0][2].setText(C2557y.f9835g.f10405en);
                                this.f9259f[0][3].setText(C2557y.f9835g.f10406eo);
                                this.f9259f[0][4].setText(C2557y.f9835g.f10404em);
                                break;
                            case 3:
                            case 6:
                                this.f9259f[0][0].setText(C2557y.f9835g.f10402ek);
                                this.f9259f[0][1].setText(C2557y.f9835g.f10403el);
                                this.f9259f[0][2].setText(C2557y.f9835g.f10404em);
                                this.f9259f[0][3].setText(C2557y.f9835g.f10405en);
                                this.f9259f[0][4].setText(C2557y.f9835g.f10406eo);
                                break;
                        }
                        this.f9259f[1][0].setText(C2557y.f9835g.f10141O + "1: " + C2557y.f9835g.f10415ex);
                        this.f9259f[1][1].setText(C2557y.f9835g.f10141O + "1: " + C2557y.f9835g.f10417ez);
                        this.f9259f[1][2].setText(C2557y.f9835g.f10141O + "2: " + C2557y.f9835g.f10368eC);
                        this.f9259f[1][3].setText(C2557y.f9835g.f10141O + "2: " + C2557y.f9835g.f10369eD);
                        this.f9259f[1][4].setText(C2557y.f9835g.f10141O + "2: " + C2557y.f9835g.f10370eE);
                        this.f9259f[2][0].setText(C2557y.f9835g.f10373eH);
                        this.f9259f[2][1].setText(C2557y.f9835g.f10374eI);
                        this.f9259f[2][2].setText(C2557y.f9835g.f10375eJ);
                        this.f9259f[2][3].setText(C2557y.f9835g.f10376eK);
                        this.f9259f[2][4].setText(C2557y.f9835g.f10377eL);
                        this.f9259f[3][0].setText(C2557y.f9835g.f10379eN);
                        this.f9266m.setText(C2557y.f9835g.f10569hz);
                        this.f9267n.setText(C2557y.f9835g.f10185af);
                        this.f9268o.setText("");
                        this.f9269p.setText("");
                        this.f9270q.setText("");
                        this.f9271r.setText("");
                        this.f9272s.setText("");
                        this.f9273t.setText("");
                        this.f9274u.setText("");
                        this.f9275v.setText("");
                        this.f9276w.setText("");
                        this.f9277x.setText("");
                        this.f9278y.setText("");
                        this.f9279z.setText("");
                        this.f9262i.setText(C2557y.f9835g.f10533hI);
                        this.f9263j[0].setText(C2557y.f9835g.f10534hJ);
                        this.f9263j[1].setText(C2557y.f9835g.f10535hK);
                        this.f9264k[0].setImageResource(C2656R.drawable.img_test_mibi_uncheck);
                        this.f9264k[1].setImageResource(C2656R.drawable.img_test_mibi_uncheck);
                        this.f9245D.setText("= " + C2557y.f9835g.f10184ae);
                        this.f9249H = false;
                        this.f9250I = false;
                        this.f9251J = false;
                        this.f9252K = false;
                        this.f9265l.setOnClickListener(this);
                        this.f9265l.setAlpha(1.0f);
                        this.f9265l.setText(C2557y.f9835g.f10526hB);
                        this.f9246E.setText(C2557y.f9835g.f10395ed);
                        this.f9254a.scrollTo(0, 0);
                        return;
                    }
                }
            }

            /* renamed from: a */
            public void mo9234a(long j) {
                if (this.f9248G) {
                    this.f9242A.setText(String.format("%.2f%s", new Object[]{Double.valueOf(((double) (j - C2465bl.f8806h)) * 0.001d), C2557y.f9835g.f10348dj}));
                }
            }

            /* renamed from: a */
            public void mo9235a(C2573ai aiVar, int i) {
                if (i == 0) {
                    if (!this.f9249H) {
                        C2614s x = C2507bq.this.f9219d[C2465bl.f8800b].f7846S.mo9828x();
                        this.f9268o.setText(String.format("%.2f%s", new Object[]{Double.valueOf(x.mo9984b()), C2557y.f9835g.f10348dj}));
                        this.f9249H = true;
                    }
                    double j = aiVar.mo9865j();
                    C2614s x2 = C2507bq.this.f9219d[C2465bl.f8800b].f7846S.mo9828x();
                    Log.e("HandsOffTime22", "0 " + j);
                    this.f9270q.setText(String.format("%.2f%s", new Object[]{Double.valueOf(j), C2557y.f9835g.f10348dj}));
                    this.f9276w.setText(String.format("%s: %dml", new Object[]{C2557y.f9835g.f10190ak, Integer.valueOf((int) x2.mo9997n())}));
                    this.f9278y.setText(String.format("%s: %d/%s", new Object[]{C2557y.f9835g.f10189aj, Integer.valueOf((int) x2.mo9998o()), C2557y.f9835g.f10349dk}));
                } else if (i == 1) {
                    if (!this.f9250I) {
                        C2614s x3 = C2507bq.this.f9219d[C2465bl.f8800b].f7846S.mo9828x();
                        this.f9269p.setText(String.format("%.2f%s", new Object[]{Double.valueOf(x3.mo9984b()), C2557y.f9835g.f10348dj}));
                        this.f9250I = true;
                    }
                    double j2 = aiVar.mo9865j();
                    Log.e("HandsOffTime22", "1 " + j2);
                    C2614s x4 = C2507bq.this.f9219d[C2465bl.f8800b].f7846S.mo9828x();
                    this.f9271r.setText(String.format("%.2f%s", new Object[]{Double.valueOf(j2), C2557y.f9835g.f10348dj}));
                    this.f9277x.setText(String.format("%s: %dml", new Object[]{C2557y.f9835g.f10190ak, Integer.valueOf((int) x4.mo9997n())}));
                    this.f9279z.setText(String.format("%s: %d/%s", new Object[]{C2557y.f9835g.f10189aj, Integer.valueOf((int) x4.mo9998o()), C2557y.f9835g.f10349dk}));
                }
            }

            /* renamed from: a */
            public void mo9236a(C2576al alVar, int i) {
                if (i == 0) {
                    double j = alVar.mo9865j();
                    C2614s x = C2507bq.this.f9219d[C2465bl.f8800b].f7846S.mo9828x();
                    this.f9268o.setText(String.format("%.2f%s", new Object[]{Double.valueOf(j), C2557y.f9835g.f10348dj}));
                    this.f9272s.setText(String.format("%s: %.1fcm", new Object[]{C2557y.f9835g.f10188ai, Double.valueOf(x.mo9995l() / 10.0d)}));
                    this.f9274u.setText(String.format("%s: %d/%s", new Object[]{C2557y.f9835g.f10189aj, Integer.valueOf((int) x.mo9996m()), C2557y.f9835g.f10349dk}));
                } else if (i == 1) {
                    if (!this.f9249H) {
                        this.f9268o.setText(String.format("%.2f%s", new Object[]{Double.valueOf(C2556x.f9805v[C2465bl.f8800b].mo9974b().get(0).mo9984b()), C2557y.f9835g.f10348dj}));
                        this.f9249H = true;
                    }
                    if (!this.f9251J) {
                        C2614s sVar = C2556x.f9805v[C2465bl.f8800b].mo9974b().get(0);
                        this.f9270q.setText(String.format("%.2f%s", new Object[]{Double.valueOf(sVar.mo9994k()), C2557y.f9835g.f10348dj}));
                        Log.e("HandsOffTime21", "0 " + sVar.mo9994k());
                        this.f9251J = true;
                    }
                    double j2 = alVar.mo9865j();
                    C2614s x2 = C2507bq.this.f9219d[C2465bl.f8800b].f7846S.mo9828x();
                    this.f9269p.setText(String.format("%.2f%s", new Object[]{Double.valueOf(j2), C2557y.f9835g.f10348dj}));
                    this.f9273t.setText(String.format("%s: %.1fcm", new Object[]{C2557y.f9835g.f10188ai, Double.valueOf(x2.mo9995l() / 10.0d)}));
                    this.f9275v.setText(String.format("%s: %d/%s", new Object[]{C2557y.f9835g.f10189aj, Integer.valueOf((int) x2.mo9996m()), C2557y.f9835g.f10349dk}));
                } else if (i == 2) {
                    if (!this.f9250I) {
                        this.f9269p.setText(String.format("%.2f%s", new Object[]{Double.valueOf(C2556x.f9805v[C2465bl.f8800b].mo9974b().get(1).mo9984b()), C2557y.f9835g.f10348dj}));
                        this.f9250I = true;
                    }
                    if (!this.f9252K) {
                        C2614s sVar2 = C2556x.f9805v[C2465bl.f8800b].mo9974b().get(1);
                        this.f9271r.setText(String.format("%.2f%s", new Object[]{Double.valueOf(sVar2.mo9994k()), C2557y.f9835g.f10348dj}));
                        Log.e("HandsOffTime21", "1 " + sVar2.mo9994k());
                        this.f9252K = true;
                    }
                }
            }

            /* renamed from: a */
            public void mo9237a(boolean z) {
                int i = 0;
                int[] iArr = {50, 50, 50, 50, 0};
                int[] iArr2 = {750, 1250, 900, 300, 200};
                switch (C2465bl.f8801c.get(0).mo9310b().f9755k) {
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
                for (int i2 = 0; i2 < iArr.length; i2++) {
                    i = i + iArr[i2] + iArr2[i2];
                }
                if (z) {
                    i += 590;
                }
                this.f9255b.setScaleHeight((float) i);
            }

            /* renamed from: b */
            public void mo9238b() {
                this.f9254a.setVisibility(0);
            }

            /* renamed from: c */
            public void mo9239c() {
                this.f9254a.setVisibility(4);
            }

            /* JADX WARNING: Removed duplicated region for block: B:14:0x0042  */
            /* JADX WARNING: Removed duplicated region for block: B:17:0x007c  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onClick(android.view.View r12) {
                /*
                    r11 = this;
                    r3 = -1
                    r10 = 3
                    r9 = 2
                    r8 = 1
                    r1 = 0
                    int r6 = r12.getId()
                    switch(r6) {
                        case 2131232467: goto L_0x000d;
                        case 2131232471: goto L_0x000d;
                        case 2131232475: goto L_0x000d;
                        case 2131232479: goto L_0x000d;
                        case 2131232481: goto L_0x0144;
                        case 2131232486: goto L_0x000d;
                        case 2131232490: goto L_0x0287;
                        case 2131232496: goto L_0x000d;
                        case 2131232503: goto L_0x000d;
                        case 2131232510: goto L_0x000d;
                        case 2131232517: goto L_0x000d;
                        case 2131232522: goto L_0x000d;
                        case 2131232527: goto L_0x000d;
                        case 2131232531: goto L_0x000d;
                        case 2131232535: goto L_0x000d;
                        case 2131232539: goto L_0x000d;
                        case 2131232543: goto L_0x000d;
                        case 2131232548: goto L_0x000d;
                        case 2131232552: goto L_0x00c1;
                        case 2131232554: goto L_0x00f3;
                        case 2131232558: goto L_0x0125;
                        default: goto L_0x000c;
                    }
                L_0x000c:
                    return
                L_0x000d:
                    r0 = r1
                    r2 = r3
                    r4 = r3
                L_0x0010:
                    int[] r5 = r11.f9247F
                    int r5 = r5.length
                    if (r0 >= r5) goto L_0x002c
                    r5 = r1
                L_0x0016:
                    int[] r7 = r11.f9247F
                    r7 = r7[r0]
                    if (r5 >= r7) goto L_0x002a
                    android.widget.ImageView[][] r7 = r11.f9261h
                    r7 = r7[r0]
                    r7 = r7[r5]
                    int r7 = r7.getId()
                    if (r7 != r6) goto L_0x0076
                    r2 = r5
                    r4 = r0
                L_0x002a:
                    if (r4 == r3) goto L_0x0079
                L_0x002c:
                    com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                    int r3 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    r0 = r0[r3]
                    android.util.Pair<java.lang.Boolean, java.lang.Long>[][] r0 = r0.f7757b
                    r0 = r0[r4]
                    r0 = r0[r2]
                    java.lang.Object r0 = r0.first
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    if (r0 == 0) goto L_0x007c
                    com.ssomai.android.scalablelayout.ScalableLayout[][] r0 = r11.f9258e
                    r0 = r0[r4]
                    r0 = r0[r2]
                    r3 = 2131165280(0x7f070060, float:1.7944773E38)
                    r0.setBackgroundResource(r3)
                    android.widget.ImageView[][] r0 = r11.f9260g
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
                    goto L_0x000c
                L_0x0076:
                    int r5 = r5 + 1
                    goto L_0x0016
                L_0x0079:
                    int r0 = r0 + 1
                    goto L_0x0010
                L_0x007c:
                    com.ssomai.android.scalablelayout.ScalableLayout[][] r0 = r11.f9258e
                    r0 = r0[r4]
                    r0 = r0[r2]
                    r1 = 2131165277(0x7f07005d, float:1.7944767E38)
                    r0.setBackgroundResource(r1)
                    android.widget.ImageView[][] r0 = r11.f9260g
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
                    com.imlabworld.HS_Instructor.bq$c r4 = com.imlabworld.HS_Instructor.C2507bq.C2510c.this
                    com.imlabworld.HS_Instructor.bq r4 = com.imlabworld.HS_Instructor.C2507bq.this
                    com.imlabworld.HS_Instructor.ae[] r4 = r4.f9219d
                    int r5 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    r4 = r4[r5]
                    com.imlabworld.a.y r4 = r4.f7846S
                    long r4 = r4.mo10036d()
                    java.lang.Long r4 = java.lang.Long.valueOf(r4)
                    r1.<init>(r3, r4)
                    r0[r2] = r1
                    goto L_0x000c
                L_0x00c1:
                    com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                    int r2 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    r0 = r0[r2]
                    boolean r0 = r0.f7761f
                    if (r0 == 0) goto L_0x00df
                    com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                    int r2 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    r0 = r0[r2]
                    r0.f7761f = r1
                    android.widget.ImageView[] r0 = r11.f9264k
                    r0 = r0[r1]
                    r1 = 2131165517(0x7f07014d, float:1.7945253E38)
                    r0.setImageResource(r1)
                    goto L_0x000c
                L_0x00df:
                    com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                    int r2 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    r0 = r0[r2]
                    r0.f7761f = r8
                    android.widget.ImageView[] r0 = r11.f9264k
                    r0 = r0[r1]
                    r1 = 2131165516(0x7f07014c, float:1.7945251E38)
                    r0.setImageResource(r1)
                    goto L_0x000c
                L_0x00f3:
                    com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                    int r2 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    r0 = r0[r2]
                    boolean r0 = r0.f7762g
                    if (r0 == 0) goto L_0x0111
                    com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                    int r2 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    r0 = r0[r2]
                    r0.f7762g = r1
                    android.widget.ImageView[] r0 = r11.f9264k
                    r0 = r0[r8]
                    r1 = 2131165517(0x7f07014d, float:1.7945253E38)
                    r0.setImageResource(r1)
                    goto L_0x000c
                L_0x0111:
                    com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                    int r1 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    r0 = r0[r1]
                    r0.f7762g = r8
                    android.widget.ImageView[] r0 = r11.f9264k
                    r0 = r0[r8]
                    r1 = 2131165516(0x7f07014c, float:1.7945251E38)
                    r0.setImageResource(r1)
                    goto L_0x000c
                L_0x0125:
                    com.imlabworld.HS_Instructor.bq$c r0 = com.imlabworld.HS_Instructor.C2507bq.C2510c.this
                    com.imlabworld.HS_Instructor.bq r0 = com.imlabworld.HS_Instructor.C2507bq.this
                    long r0 = r0.f9220e
                    com.imlabworld.HS_Instructor.C2465bl.f8805g = r0
                    com.imlabworld.HS_Instructor.bq$c r0 = com.imlabworld.HS_Instructor.C2507bq.C2510c.this
                    com.imlabworld.HS_Instructor.bq r0 = com.imlabworld.HS_Instructor.C2507bq.this
                    com.imlabworld.HS_Instructor.bq$b r0 = r0.f9218c
                    int r1 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    com.imlabworld.HS_Instructor.bq$a r2 = com.imlabworld.HS_Instructor.C2507bq.C2508a.NEXT
                    java.lang.String r3 = ""
                    java.lang.String r4 = ""
                    r0.mo8598a(r1, r2, r3, r4)
                    goto L_0x000c
                L_0x0144:
                    boolean r0 = r11.f9248G
                    if (r0 == 0) goto L_0x0270
                    r11.f9248G = r1
                    android.widget.TextView r0 = r11.f9242A
                    r0.setVisibility(r1)
                    android.widget.ImageView r0 = r11.f9243B
                    r2 = 4
                    r0.setVisibility(r2)
                    android.widget.TextView r0 = r11.f9244C
                    r2 = 4
                    r0.setVisibility(r2)
                    android.widget.ImageView[][] r0 = r11.f9260g
                    r0 = r0[r1]
                    r0 = r0[r9]
                    r0.setVisibility(r1)
                    android.widget.ImageView[][] r0 = r11.f9260g
                    r0 = r0[r1]
                    r0 = r0[r10]
                    r0.setVisibility(r1)
                    android.widget.ImageView[][] r0 = r11.f9261h
                    r0 = r0[r1]
                    r0 = r0[r9]
                    r0.setOnClickListener(r11)
                    android.widget.ImageView[][] r0 = r11.f9261h
                    r0 = r0[r1]
                    r0 = r0[r10]
                    r0.setOnClickListener(r11)
                    com.imlabworld.HS_Instructor.bq$c r0 = com.imlabworld.HS_Instructor.C2507bq.C2510c.this
                    com.imlabworld.HS_Instructor.bq r0 = com.imlabworld.HS_Instructor.C2507bq.this
                    long r2 = r0.f9220e
                    long r4 = com.imlabworld.HS_Instructor.C2465bl.f8806h
                    long r2 = r2 - r4
                    double r2 = (double) r2
                    r4 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
                    double r2 = r2 * r4
                    com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                    int r4 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    r0 = r0[r4]
                    r0.f7763h = r2
                    android.widget.TextView r0 = r11.f9242A
                    java.lang.String r4 = "%.2f%s"
                    java.lang.Object[] r5 = new java.lang.Object[r9]
                    java.lang.Double r6 = java.lang.Double.valueOf(r2)
                    r5[r1] = r6
                    com.imlabworld.a.g r6 = com.imlabworld.HS_Instructor.C2557y.f9835g
                    java.lang.String r6 = r6.f10348dj
                    r5[r8] = r6
                    java.lang.String r4 = java.lang.String.format(r4, r5)
                    r0.setText(r4)
                    com.ssomai.android.scalablelayout.ScalableLayout[][] r0 = r11.f9258e
                    r0 = r0[r1]
                    r0 = r0[r9]
                    r4 = 2131165277(0x7f07005d, float:1.7944767E38)
                    r0.setBackgroundResource(r4)
                    android.widget.ImageView[][] r0 = r11.f9260g
                    r0 = r0[r1]
                    r0 = r0[r9]
                    r4 = 2131165512(0x7f070148, float:1.7945243E38)
                    r0.setImageResource(r4)
                    com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                    int r4 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    r0 = r0[r4]
                    android.util.Pair<java.lang.Boolean, java.lang.Long>[][] r0 = r0.f7757b
                    r0 = r0[r1]
                    android.util.Pair r4 = new android.util.Pair
                    java.lang.Boolean r5 = java.lang.Boolean.valueOf(r8)
                    com.imlabworld.HS_Instructor.bq$c r6 = com.imlabworld.HS_Instructor.C2507bq.C2510c.this
                    com.imlabworld.HS_Instructor.bq r6 = com.imlabworld.HS_Instructor.C2507bq.this
                    long r6 = r6.f9220e
                    java.lang.Long r6 = java.lang.Long.valueOf(r6)
                    r4.<init>(r5, r6)
                    r0[r9] = r4
                    r4 = 4617315517961601024(0x4014000000000000, double:5.0)
                    int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                    if (r0 < 0) goto L_0x023c
                    r4 = 4621819117588971520(0x4024000000000000, double:10.0)
                    int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                    if (r0 >= 0) goto L_0x023c
                    com.ssomai.android.scalablelayout.ScalableLayout[][] r0 = r11.f9258e
                    r0 = r0[r1]
                    r0 = r0[r10]
                    r2 = 2131165277(0x7f07005d, float:1.7944767E38)
                    r0.setBackgroundResource(r2)
                    android.widget.ImageView[][] r0 = r11.f9260g
                    r0 = r0[r1]
                    r0 = r0[r10]
                    r2 = 2131165512(0x7f070148, float:1.7945243E38)
                    r0.setImageResource(r2)
                    com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                    int r2 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    r0 = r0[r2]
                    android.util.Pair<java.lang.Boolean, java.lang.Long>[][] r0 = r0.f7757b
                    r0 = r0[r1]
                    android.util.Pair r1 = new android.util.Pair
                    java.lang.Boolean r2 = java.lang.Boolean.valueOf(r8)
                    com.imlabworld.HS_Instructor.bq$c r3 = com.imlabworld.HS_Instructor.C2507bq.C2510c.this
                    com.imlabworld.HS_Instructor.bq r3 = com.imlabworld.HS_Instructor.C2507bq.this
                    long r4 = r3.f9220e
                    java.lang.Long r3 = java.lang.Long.valueOf(r4)
                    r1.<init>(r2, r3)
                    r0[r10] = r1
                L_0x0230:
                    com.imlabworld.HS_Instructor.bq$c r0 = com.imlabworld.HS_Instructor.C2507bq.C2510c.this
                    com.imlabworld.HS_Instructor.bq r0 = com.imlabworld.HS_Instructor.C2507bq.this
                    long r0 = r0.f9220e
                    com.imlabworld.HS_Instructor.C2465bl.f8807i = r0
                    goto L_0x000c
                L_0x023c:
                    com.ssomai.android.scalablelayout.ScalableLayout[][] r0 = r11.f9258e
                    r0 = r0[r1]
                    r0 = r0[r10]
                    r2 = 2131165280(0x7f070060, float:1.7944773E38)
                    r0.setBackgroundResource(r2)
                    android.widget.ImageView[][] r0 = r11.f9260g
                    r0 = r0[r1]
                    r0 = r0[r10]
                    r2 = 2131165531(0x7f07015b, float:1.7945282E38)
                    r0.setImageResource(r2)
                    com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                    int r2 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    r0 = r0[r2]
                    android.util.Pair<java.lang.Boolean, java.lang.Long>[][] r0 = r0.f7757b
                    r0 = r0[r1]
                    android.util.Pair r2 = new android.util.Pair
                    java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                    r4 = 0
                    java.lang.Long r3 = java.lang.Long.valueOf(r4)
                    r2.<init>(r1, r3)
                    r0[r10] = r2
                    goto L_0x0230
                L_0x0270:
                    r11.f9248G = r8
                    com.imlabworld.HS_Instructor.bq$c r0 = com.imlabworld.HS_Instructor.C2507bq.C2510c.this
                    com.imlabworld.HS_Instructor.bq r0 = com.imlabworld.HS_Instructor.C2507bq.this
                    long r0 = r0.f9220e
                    com.imlabworld.HS_Instructor.C2465bl.f8806h = r0
                    android.widget.TextView r0 = r11.f9244C
                    com.imlabworld.a.g r1 = com.imlabworld.HS_Instructor.C2557y.f9835g
                    java.lang.String r1 = r1.f10204ay
                    r0.setText(r1)
                    goto L_0x000c
                L_0x0287:
                    com.imlabworld.HS_Instructor.bq$c r0 = com.imlabworld.HS_Instructor.C2507bq.C2510c.this
                    com.imlabworld.HS_Instructor.bq r0 = com.imlabworld.HS_Instructor.C2507bq.this
                    com.imlabworld.HS_Instructor.bq$b r0 = r0.f9218c
                    int r2 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    com.imlabworld.HS_Instructor.bq$a r3 = com.imlabworld.HS_Instructor.C2507bq.C2508a.CHANGE_ROLE
                    java.lang.String r4 = ""
                    java.lang.String r5 = ""
                    r0.mo8598a(r2, r3, r4, r5)
                    com.imlabworld.a.r[] r0 = com.imlabworld.HS_Instructor.C2556x.f9805v
                    int r2 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    r0 = r0[r2]
                    int r0 = r0.mo9977d()
                    if (r0 <= 0) goto L_0x0328
                    boolean r0 = r11.f9249H
                    if (r0 != 0) goto L_0x02d9
                    com.imlabworld.a.r[] r0 = com.imlabworld.HS_Instructor.C2556x.f9805v
                    int r2 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    r0 = r0[r2]
                    java.util.ArrayList r0 = r0.mo9974b()
                    java.lang.Object r0 = r0.get(r1)
                    com.imlabworld.a.s r0 = (com.imlabworld.p079a.C2614s) r0
                    android.widget.TextView r2 = r11.f9268o
                    java.lang.String r3 = "%.2f%s"
                    java.lang.Object[] r4 = new java.lang.Object[r9]
                    double r6 = r0.mo9984b()
                    java.lang.Double r0 = java.lang.Double.valueOf(r6)
                    r4[r1] = r0
                    com.imlabworld.a.g r0 = com.imlabworld.HS_Instructor.C2557y.f9835g
                    java.lang.String r0 = r0.f10348dj
                    r4[r8] = r0
                    java.lang.String r0 = java.lang.String.format(r3, r4)
                    r2.setText(r0)
                    r11.f9249H = r8
                L_0x02d9:
                    boolean r0 = r11.f9251J
                    if (r0 != 0) goto L_0x0328
                    com.imlabworld.a.r[] r0 = com.imlabworld.HS_Instructor.C2556x.f9805v
                    int r2 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    r0 = r0[r2]
                    java.util.ArrayList r0 = r0.mo9974b()
                    java.lang.Object r0 = r0.get(r1)
                    com.imlabworld.a.s r0 = (com.imlabworld.p079a.C2614s) r0
                    android.widget.TextView r2 = r11.f9270q
                    java.lang.String r3 = "%.2f%s"
                    java.lang.Object[] r4 = new java.lang.Object[r9]
                    double r6 = r0.mo9994k()
                    java.lang.Double r5 = java.lang.Double.valueOf(r6)
                    r4[r1] = r5
                    com.imlabworld.a.g r5 = com.imlabworld.HS_Instructor.C2557y.f9835g
                    java.lang.String r5 = r5.f10348dj
                    r4[r8] = r5
                    java.lang.String r3 = java.lang.String.format(r3, r4)
                    r2.setText(r3)
                    java.lang.String r2 = "HandsOffTime23"
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder
                    r3.<init>()
                    java.lang.String r4 = "0 "
                    java.lang.StringBuilder r3 = r3.append(r4)
                    double r4 = r0.mo9994k()
                    java.lang.StringBuilder r0 = r3.append(r4)
                    java.lang.String r0 = r0.toString()
                    android.util.Log.e(r2, r0)
                    r11.f9251J = r8
                L_0x0328:
                    com.imlabworld.a.r[] r0 = com.imlabworld.HS_Instructor.C2556x.f9805v
                    int r2 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    r0 = r0[r2]
                    int r0 = r0.mo9977d()
                    if (r0 <= r8) goto L_0x03b6
                    boolean r0 = r11.f9250I
                    if (r0 != 0) goto L_0x0367
                    com.imlabworld.a.r[] r0 = com.imlabworld.HS_Instructor.C2556x.f9805v
                    int r2 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    r0 = r0[r2]
                    java.util.ArrayList r0 = r0.mo9974b()
                    java.lang.Object r0 = r0.get(r8)
                    com.imlabworld.a.s r0 = (com.imlabworld.p079a.C2614s) r0
                    android.widget.TextView r2 = r11.f9269p
                    java.lang.String r3 = "%.2f%s"
                    java.lang.Object[] r4 = new java.lang.Object[r9]
                    double r6 = r0.mo9984b()
                    java.lang.Double r0 = java.lang.Double.valueOf(r6)
                    r4[r1] = r0
                    com.imlabworld.a.g r0 = com.imlabworld.HS_Instructor.C2557y.f9835g
                    java.lang.String r0 = r0.f10348dj
                    r4[r8] = r0
                    java.lang.String r0 = java.lang.String.format(r3, r4)
                    r2.setText(r0)
                    r11.f9250I = r8
                L_0x0367:
                    boolean r0 = r11.f9252K
                    if (r0 != 0) goto L_0x03b6
                    com.imlabworld.a.r[] r0 = com.imlabworld.HS_Instructor.C2556x.f9805v
                    int r2 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    r0 = r0[r2]
                    java.util.ArrayList r0 = r0.mo9974b()
                    java.lang.Object r0 = r0.get(r8)
                    com.imlabworld.a.s r0 = (com.imlabworld.p079a.C2614s) r0
                    android.widget.TextView r2 = r11.f9271r
                    java.lang.String r3 = "%.2f%s"
                    java.lang.Object[] r4 = new java.lang.Object[r9]
                    double r6 = r0.mo9994k()
                    java.lang.Double r5 = java.lang.Double.valueOf(r6)
                    r4[r1] = r5
                    com.imlabworld.a.g r1 = com.imlabworld.HS_Instructor.C2557y.f9835g
                    java.lang.String r1 = r1.f10348dj
                    r4[r8] = r1
                    java.lang.String r1 = java.lang.String.format(r3, r4)
                    r2.setText(r1)
                    java.lang.String r1 = "HandsOffTime23"
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    java.lang.String r3 = "1 "
                    java.lang.StringBuilder r2 = r2.append(r3)
                    double r4 = r0.mo9994k()
                    java.lang.StringBuilder r0 = r2.append(r4)
                    java.lang.String r0 = r0.toString()
                    android.util.Log.e(r1, r0)
                    r11.f9252K = r8
                L_0x03b6:
                    android.widget.TextView r0 = r11.f9265l
                    r1 = 0
                    r0.setOnClickListener(r1)
                    android.widget.TextView r0 = r11.f9265l
                    r1 = 1041865114(0x3e19999a, float:0.15)
                    r0.setAlpha(r1)
                    android.widget.TextView r0 = r11.f9265l
                    com.imlabworld.a.g r1 = com.imlabworld.HS_Instructor.C2557y.f9835g
                    java.lang.String r1 = r1.f10528hD
                    r0.setText(r1)
                    goto L_0x000c
                */
                throw new UnsupportedOperationException("Method not decompiled: com.imlabworld.HS_Instructor.C2507bq.C2510c.C2511a.onClick(android.view.View):void");
            }
        }

        /* renamed from: com.imlabworld.HS_Instructor.bq$c$b */
        class C2512b implements View.OnClickListener {

            /* renamed from: A */
            final TextView f9280A;

            /* renamed from: B */
            final TextView f9281B;

            /* renamed from: C */
            final TextView f9282C;

            /* renamed from: D */
            final TextView f9283D;

            /* renamed from: E */
            final TextView f9284E;

            /* renamed from: F */
            final TextView f9285F;

            /* renamed from: G */
            final TextView f9286G;

            /* renamed from: H */
            final TextView f9287H;

            /* renamed from: I */
            final ImageView f9288I;

            /* renamed from: J */
            final TextView f9289J;

            /* renamed from: K */
            final TextView f9290K;

            /* renamed from: L */
            final int[] f9291L = new int[4];

            /* renamed from: M */
            boolean f9292M;

            /* renamed from: N */
            boolean f9293N;

            /* renamed from: O */
            boolean f9294O;

            /* renamed from: P */
            boolean f9295P;

            /* renamed from: Q */
            boolean f9296Q;

            /* renamed from: R */
            boolean f9297R;

            /* renamed from: S */
            boolean f9298S;

            /* renamed from: a */
            final ScrollView f9300a;

            /* renamed from: b */
            final ScalableLayout f9301b;

            /* renamed from: c */
            final ScalableLayout[] f9302c = new ScalableLayout[5];

            /* renamed from: d */
            final TextView[] f9303d = new TextView[4];

            /* renamed from: e */
            final ScalableLayout[][] f9304e = ((ScalableLayout[][]) Array.newInstance(ScalableLayout.class, new int[]{4, 6}));

            /* renamed from: f */
            final TextView[][] f9305f = ((TextView[][]) Array.newInstance(TextView.class, new int[]{4, 6}));

            /* renamed from: g */
            final ImageView[][] f9306g = ((ImageView[][]) Array.newInstance(ImageView.class, new int[]{4, 6}));

            /* renamed from: h */
            final ImageView[][] f9307h = ((ImageView[][]) Array.newInstance(ImageView.class, new int[]{4, 6}));

            /* renamed from: i */
            final TextView f9308i;

            /* renamed from: j */
            final TextView[] f9309j = new TextView[2];

            /* renamed from: k */
            final ImageView[] f9310k = new ImageView[2];

            /* renamed from: l */
            final TextView f9311l;

            /* renamed from: m */
            final TextView f9312m;

            /* renamed from: n */
            final TextView f9313n;

            /* renamed from: o */
            final TextView f9314o;

            /* renamed from: p */
            final TextView f9315p;

            /* renamed from: q */
            final TextView f9316q;

            /* renamed from: r */
            final TextView f9317r;

            /* renamed from: s */
            final TextView f9318s;

            /* renamed from: t */
            final TextView f9319t;

            /* renamed from: u */
            final TextView f9320u;

            /* renamed from: v */
            final TextView f9321v;

            /* renamed from: w */
            final TextView f9322w;

            /* renamed from: x */
            final TextView f9323x;

            /* renamed from: y */
            final TextView f9324y;

            /* renamed from: z */
            final TextView f9325z;

            public C2512b(View view) {
                this.f9300a = (ScrollView) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_scroll);
                this.f9301b = (ScalableLayout) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_scroll_sc);
                this.f9302c[0] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_part1_sc);
                this.f9302c[1] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_part2_sc);
                this.f9302c[2] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_part3_sc);
                this.f9302c[3] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_part4_sc);
                this.f9302c[4] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_part5_sc);
                this.f9303d[0] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g1_txt);
                this.f9303d[1] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g2_txt);
                this.f9303d[2] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g3_txt);
                this.f9303d[3] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g4_txt);
                this.f9304e[0][0] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g1q1_sc);
                this.f9304e[0][1] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g1q2_sc);
                this.f9304e[0][2] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g1q3_sc);
                this.f9304e[0][3] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g1q4_sc);
                this.f9304e[0][4] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g1q5_sc);
                this.f9304e[1][0] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g2q1_sc);
                this.f9304e[1][1] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g2q2_sc);
                this.f9304e[1][2] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g2q3_sc);
                this.f9304e[1][3] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g2q4_sc);
                this.f9304e[1][4] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g2q5_sc);
                this.f9304e[1][5] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g2q6_sc);
                this.f9304e[2][0] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g3q1_sc);
                this.f9304e[2][1] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g3q2_sc);
                this.f9304e[2][2] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g3q3_sc);
                this.f9304e[2][3] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g3q4_sc);
                this.f9304e[2][4] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g3q5_sc);
                this.f9304e[2][5] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g3q6_sc);
                this.f9304e[3][0] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g4q1_sc);
                this.f9305f[0][0] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g1q1_txt);
                this.f9305f[0][1] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g1q2_txt);
                this.f9305f[0][2] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g1q3_txt);
                this.f9305f[0][3] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g1q4_txt);
                this.f9305f[0][4] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g1q5_txt);
                this.f9305f[1][0] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g2q1_txt);
                this.f9305f[1][1] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g2q2_txt);
                this.f9305f[1][2] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g2q3_txt);
                this.f9305f[1][3] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g2q4_txt);
                this.f9305f[1][4] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g2q5_txt);
                this.f9305f[1][5] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g2q6_txt);
                this.f9305f[2][0] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g3q1_txt);
                this.f9305f[2][1] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g3q2_txt);
                this.f9305f[2][2] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g3q3_txt);
                this.f9305f[2][3] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g3q4_txt);
                this.f9305f[2][4] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g3q5_txt);
                this.f9305f[2][5] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g3q6_txt);
                this.f9305f[3][0] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g4q1_txt);
                this.f9306g[0][0] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g1q1_btn);
                this.f9306g[0][1] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g1q2_btn);
                this.f9306g[0][2] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g1q3_btn);
                this.f9306g[0][3] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g1q4_btn);
                this.f9306g[0][4] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g1q5_btn);
                this.f9306g[1][0] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g2q1_btn);
                this.f9306g[1][1] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g2q2_btn);
                this.f9306g[1][2] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g2q3_btn);
                this.f9306g[1][3] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g2q4_btn);
                this.f9306g[1][4] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g2q5_btn);
                this.f9306g[1][5] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g2q6_btn);
                this.f9306g[2][0] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g3q1_btn);
                this.f9306g[2][1] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g3q2_btn);
                this.f9306g[2][2] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g3q3_btn);
                this.f9306g[2][3] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g3q4_btn);
                this.f9306g[2][4] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g3q5_btn);
                this.f9306g[2][5] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g3q6_btn);
                this.f9306g[3][0] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g4q1_btn);
                this.f9307h[0][0] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g1q1_click_btn);
                this.f9307h[0][1] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g1q2_click_btn);
                this.f9307h[0][2] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g1q3_click_btn);
                this.f9307h[0][3] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g1q4_click_btn);
                this.f9307h[0][4] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g1q5_click_btn);
                this.f9307h[1][0] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g2q1_click_btn);
                this.f9307h[1][1] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g2q2_click_btn);
                this.f9307h[1][2] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g2q3_click_btn);
                this.f9307h[1][3] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g2q4_click_btn);
                this.f9307h[1][4] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g2q5_click_btn);
                this.f9307h[1][5] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g2q6_click_btn);
                this.f9307h[2][0] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g3q1_click_btn);
                this.f9307h[2][1] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g3q2_click_btn);
                this.f9307h[2][2] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g3q3_click_btn);
                this.f9307h[2][3] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g3q4_click_btn);
                this.f9307h[2][4] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g3q5_click_btn);
                this.f9307h[2][5] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g3q6_click_btn);
                this.f9307h[3][0] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g4q1_click_btn);
                this.f9308i = (TextView) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_mibi_txt);
                this.f9309j[0] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_mibi1_txt);
                this.f9309j[1] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_mibi2_txt);
                this.f9310k[0] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_mibi1_btn);
                this.f9310k[1] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_mibi2_btn);
                this.f9311l = (TextView) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_hot_txt);
                this.f9313n = (TextView) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g2_average_txt);
                this.f9314o = (TextView) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g2_time_txt);
                this.f9315p = (TextView) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g2q1_timer_value_txt);
                this.f9316q = (TextView) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g2q3_timer_value_txt);
                this.f9317r = (TextView) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g2q5_timer_value_txt);
                this.f9318s = (TextView) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g2q1_average_depth_txt);
                this.f9319t = (TextView) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g2q3_average_depth_txt);
                this.f9320u = (TextView) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g2q5_average_depth_txt);
                this.f9321v = (TextView) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g2q1_average_rate_txt);
                this.f9322w = (TextView) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g2q3_average_rate_txt);
                this.f9323x = (TextView) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g2q5_average_rate_txt);
                this.f9324y = (TextView) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g2q2_timer_value_txt);
                this.f9325z = (TextView) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g2q4_timer_value_txt);
                this.f9280A = (TextView) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g2q6_timer_value_txt);
                this.f9281B = (TextView) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g2q2_average_volume_txt);
                this.f9282C = (TextView) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g2q4_average_volume_txt);
                this.f9283D = (TextView) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g2q6_average_volume_txt);
                this.f9284E = (TextView) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g2q2_average_rate_txt);
                this.f9285F = (TextView) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g2q4_average_rate_txt);
                this.f9286G = (TextView) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g2q6_average_rate_txt);
                this.f9287H = (TextView) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g1q3_timer_value_txt);
                this.f9288I = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g1q3_timer_btn);
                this.f9289J = (TextView) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g1q3_timer_btn_txt);
                this.f9312m = (TextView) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_g2_stop_btn);
                this.f9290K = (TextView) view.findViewById(C2656R.C2657id.test_sheet_adult_lay_next_btn);
                this.f9291L[0] = 5;
                this.f9291L[1] = 6;
                this.f9291L[2] = 6;
                this.f9291L[3] = 1;
                for (int i = 0; i < this.f9291L.length; i++) {
                    for (int i2 = 0; i2 < this.f9291L[i]; i2++) {
                        this.f9307h[i][i2].setOnClickListener(this);
                    }
                }
                this.f9310k[0].setOnClickListener(this);
                this.f9310k[1].setOnClickListener(this);
                this.f9312m.setOnClickListener(this);
                this.f9290K.setOnClickListener(this);
                this.f9288I.setOnClickListener(this);
            }

            /* renamed from: a */
            public void mo9241a() {
                C2552t b = C2465bl.f8801c.get(0).mo9310b();
                C2556x.f9806w[C2465bl.f8800b] = new C2334ac();
                for (int i = 0; i < this.f9291L.length; i++) {
                    for (int i2 = 0; i2 < this.f9291L[i]; i2++) {
                        this.f9304e[i][i2].setBackgroundResource(C2656R.drawable.bg_test_unselected);
                        this.f9306g[i][i2].setImageResource(C2656R.drawable.img_test_uncheck);
                    }
                }
                int[] iArr = {50, 50, 50, 50, 0};
                int[] iArr2 = {750, 1400, 1050, 300, 200};
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
                this.f9302c[0].setScaleHeight((float) iArr2[0]);
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    int i5 = i4;
                    int i6 = i3;
                    if (i5 < iArr.length) {
                        int i7 = i6 + iArr[i5];
                        this.f9301b.mo10069b(this.f9302c[i5], 100.0f, (float) i7, 2095.0f, (float) iArr2[i5]);
                        i3 = i7 + iArr2[i5];
                        i4 = i5 + 1;
                    } else {
                        this.f9301b.mo10069b(this.f9287H, 1780.0f, 500.0f, 200.0f, 150.0f);
                        this.f9301b.mo10069b(this.f9288I, 1980.0f, 500.0f, 200.0f, 150.0f);
                        this.f9301b.mo10069b(this.f9289J, 1980.0f, 500.0f, 200.0f, 150.0f);
                        this.f9301b.setScaleHeight((float) i6);
                        C2556x.f9806w[C2465bl.f8800b].f7756a = C2334ac.C2336b.TEST;
                        this.f9303d[0].setText(C2557y.f9835g.f10401ej);
                        this.f9303d[1].setText(C2557y.f9835g.f10149W);
                        if (b.f9754j.equals("kr")) {
                            this.f9303d[2].setText(C2557y.f9835g.f10452fh);
                        } else {
                            this.f9303d[2].setText(C2557y.f9835g.f10372eG);
                        }
                        this.f9303d[3].setText(C2557y.f9835g.f10378eM);
                        this.f9287H.setVisibility(4);
                        this.f9288I.setVisibility(4);
                        this.f9289J.setVisibility(4);
                        this.f9306g[0][2].setVisibility(0);
                        switch (b.f9755k) {
                            case 1:
                            case 4:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                this.f9305f[0][0].setText(C2557y.f9835g.f10383eR);
                                this.f9305f[0][1].setText(C2557y.f9835g.f10384eS);
                                this.f9305f[0][2].setText(C2557y.f9835g.f10386eU);
                                this.f9287H.setVisibility(0);
                                this.f9288I.setVisibility(0);
                                this.f9289J.setVisibility(0);
                                this.f9306g[0][2].setVisibility(4);
                                this.f9307h[0][2].setOnClickListener((View.OnClickListener) null);
                                this.f9287H.setText(String.format("%.2f%s", new Object[]{Float.valueOf(0.0f), C2557y.f9835g.f10348dj}));
                                this.f9289J.setText(C2557y.f9835g.f10473gB);
                                this.f9292M = false;
                                break;
                            case 2:
                            case 5:
                                this.f9305f[0][0].setText(C2557y.f9835g.f10382eQ);
                                this.f9305f[0][1].setText(C2557y.f9835g.f10383eR);
                                this.f9305f[0][2].setText(C2557y.f9835g.f10385eT);
                                this.f9305f[0][3].setText(C2557y.f9835g.f10386eU);
                                this.f9305f[0][4].setText(C2557y.f9835g.f10384eS);
                                break;
                            case 3:
                            case 6:
                                this.f9305f[0][0].setText(C2557y.f9835g.f10382eQ);
                                this.f9305f[0][1].setText(C2557y.f9835g.f10383eR);
                                this.f9305f[0][2].setText(C2557y.f9835g.f10384eS);
                                this.f9305f[0][3].setText(C2557y.f9835g.f10385eT);
                                this.f9305f[0][4].setText(C2557y.f9835g.f10386eU);
                                break;
                        }
                        this.f9305f[1][0].setText(C2557y.f9835g.f10141O + "1: " + C2557y.f9835g.f10387eV);
                        this.f9305f[1][1].setText(C2557y.f9835g.f10141O + "1: " + C2557y.f9835g.f10389eX);
                        this.f9305f[1][2].setText(C2557y.f9835g.f10141O + "2: " + C2557y.f9835g.f10391eZ);
                        this.f9305f[1][3].setText(C2557y.f9835g.f10141O + "2: " + C2557y.f9835g.f10446fb);
                        this.f9305f[1][4].setText(C2557y.f9835g.f10141O + "3: " + C2557y.f9835g.f10448fd);
                        this.f9305f[1][5].setText(C2557y.f9835g.f10141O + "3: " + C2557y.f9835g.f10450ff);
                        this.f9305f[2][0].setText(C2557y.f9835g.f10453fi);
                        this.f9305f[2][1].setText(C2557y.f9835g.f10455fk);
                        this.f9305f[2][2].setText(C2557y.f9835g.f10456fl);
                        this.f9305f[2][3].setText(C2557y.f9835g.f10458fn);
                        this.f9305f[2][4].setText(C2557y.f9835g.f10460fp);
                        this.f9305f[2][5].setText(C2557y.f9835g.f10461fq);
                        this.f9305f[3][0].setText(C2557y.f9835g.f10463fs);
                        this.f9308i.setText(C2557y.f9835g.f10533hI);
                        this.f9309j[0].setText(C2557y.f9835g.f10534hJ);
                        this.f9309j[1].setText(C2557y.f9835g.f10535hK);
                        this.f9310k[0].setImageResource(C2656R.drawable.img_test_mibi_uncheck);
                        this.f9310k[1].setImageResource(C2656R.drawable.img_test_mibi_uncheck);
                        this.f9311l.setText("= " + C2557y.f9835g.f10184ae);
                        this.f9313n.setText(C2557y.f9835g.f10569hz);
                        this.f9314o.setText(C2557y.f9835g.f10185af);
                        this.f9315p.setText("");
                        this.f9316q.setText("");
                        this.f9317r.setText("");
                        this.f9318s.setText("");
                        this.f9319t.setText("");
                        this.f9320u.setText("");
                        this.f9321v.setText("");
                        this.f9322w.setText("");
                        this.f9323x.setText("");
                        this.f9324y.setText("");
                        this.f9325z.setText("");
                        this.f9280A.setText("");
                        this.f9281B.setText("");
                        this.f9282C.setText("");
                        this.f9283D.setText("");
                        this.f9284E.setText("");
                        this.f9285F.setText("");
                        this.f9286G.setText("");
                        this.f9293N = false;
                        this.f9294O = false;
                        this.f9295P = false;
                        this.f9296Q = false;
                        this.f9297R = false;
                        this.f9298S = false;
                        this.f9312m.setOnClickListener(this);
                        this.f9312m.setAlpha(1.0f);
                        this.f9312m.setText(C2557y.f9835g.f10526hB);
                        this.f9290K.setText(C2557y.f9835g.f10395ed);
                        this.f9300a.scrollTo(0, 0);
                        return;
                    }
                }
            }

            /* renamed from: a */
            public void mo9242a(long j) {
                if (this.f9292M) {
                    this.f9287H.setText(String.format("%.2f%s", new Object[]{Double.valueOf(((double) (j - C2465bl.f8806h)) * 0.001d), C2557y.f9835g.f10348dj}));
                }
            }

            /* renamed from: a */
            public void mo9243a(C2573ai aiVar, int i) {
                if (i == 0) {
                    if (!this.f9293N) {
                        C2614s x = C2507bq.this.f9219d[C2465bl.f8800b].f7846S.mo9828x();
                        this.f9315p.setText(String.format("%.2f%s", new Object[]{Double.valueOf(x.mo9984b()), C2557y.f9835g.f10348dj}));
                        this.f9293N = true;
                    }
                    double j = aiVar.mo9865j();
                    C2614s x2 = C2507bq.this.f9219d[C2465bl.f8800b].f7846S.mo9828x();
                    this.f9324y.setText(String.format("%.2f%s", new Object[]{Double.valueOf(j), C2557y.f9835g.f10348dj}));
                    this.f9281B.setText(String.format("%s: %dml", new Object[]{C2557y.f9835g.f10190ak, Integer.valueOf((int) x2.mo9997n())}));
                    this.f9284E.setText(String.format("%s: %d/%s", new Object[]{C2557y.f9835g.f10189aj, Integer.valueOf((int) x2.mo9998o()), C2557y.f9835g.f10349dk}));
                } else if (i == 1) {
                    if (!this.f9294O) {
                        C2614s x3 = C2507bq.this.f9219d[C2465bl.f8800b].f7846S.mo9828x();
                        this.f9316q.setText(String.format("%.2f%s", new Object[]{Double.valueOf(x3.mo9984b()), C2557y.f9835g.f10348dj}));
                        this.f9294O = true;
                    }
                    double j2 = aiVar.mo9865j();
                    C2614s x4 = C2507bq.this.f9219d[C2465bl.f8800b].f7846S.mo9828x();
                    this.f9325z.setText(String.format("%.2f%s", new Object[]{Double.valueOf(j2), C2557y.f9835g.f10348dj}));
                    this.f9282C.setText(String.format("%s: %dml", new Object[]{C2557y.f9835g.f10190ak, Integer.valueOf((int) x4.mo9997n())}));
                    this.f9285F.setText(String.format("%s: %d/%s", new Object[]{C2557y.f9835g.f10189aj, Integer.valueOf((int) x4.mo9998o()), C2557y.f9835g.f10349dk}));
                } else if (i == 2) {
                    if (!this.f9295P) {
                        C2614s x5 = C2507bq.this.f9219d[C2465bl.f8800b].f7846S.mo9828x();
                        this.f9317r.setText(String.format("%.2f%s", new Object[]{Double.valueOf(x5.mo9984b()), C2557y.f9835g.f10348dj}));
                        this.f9295P = true;
                    }
                    double j3 = aiVar.mo9865j();
                    C2614s x6 = C2507bq.this.f9219d[C2465bl.f8800b].f7846S.mo9828x();
                    this.f9280A.setText(String.format("%.2f%s", new Object[]{Double.valueOf(j3), C2557y.f9835g.f10348dj}));
                    this.f9283D.setText(String.format("%s: %dml", new Object[]{C2557y.f9835g.f10190ak, Integer.valueOf((int) x6.mo9997n())}));
                    this.f9286G.setText(String.format("%s: %d/%s", new Object[]{C2557y.f9835g.f10189aj, Integer.valueOf((int) x6.mo9998o()), C2557y.f9835g.f10349dk}));
                }
            }

            /* renamed from: a */
            public void mo9244a(C2576al alVar, int i) {
                if (i == 0) {
                    double j = alVar.mo9865j();
                    C2614s x = C2507bq.this.f9219d[C2465bl.f8800b].f7846S.mo9828x();
                    this.f9315p.setText(String.format("%.2f%s", new Object[]{Double.valueOf(j), C2557y.f9835g.f10348dj}));
                    this.f9318s.setText(String.format("%s: %.1fcm", new Object[]{C2557y.f9835g.f10188ai, Double.valueOf(x.mo9995l() / 10.0d)}));
                    this.f9321v.setText(String.format("%s: %d/%s", new Object[]{C2557y.f9835g.f10189aj, Integer.valueOf((int) x.mo9996m()), C2557y.f9835g.f10349dk}));
                } else if (i == 1) {
                    if (!this.f9293N) {
                        this.f9315p.setText(String.format("%.2f%s", new Object[]{Double.valueOf(C2556x.f9805v[C2465bl.f8800b].mo9974b().get(0).mo9984b()), C2557y.f9835g.f10348dj}));
                        this.f9293N = true;
                    }
                    if (!this.f9296Q) {
                        this.f9324y.setText(String.format("%.2f%s", new Object[]{Double.valueOf(C2556x.f9805v[C2465bl.f8800b].mo9974b().get(0).mo9994k()), C2557y.f9835g.f10348dj}));
                        this.f9296Q = true;
                    }
                    double j2 = alVar.mo9865j();
                    C2614s x2 = C2507bq.this.f9219d[C2465bl.f8800b].f7846S.mo9828x();
                    this.f9316q.setText(String.format("%.2f%s", new Object[]{Double.valueOf(j2), C2557y.f9835g.f10348dj}));
                    this.f9319t.setText(String.format("%s: %.1fcm", new Object[]{C2557y.f9835g.f10188ai, Double.valueOf(x2.mo9995l() / 10.0d)}));
                    this.f9322w.setText(String.format("%s: %d/%s", new Object[]{C2557y.f9835g.f10189aj, Integer.valueOf((int) x2.mo9996m()), C2557y.f9835g.f10349dk}));
                } else if (i == 2) {
                    if (!this.f9294O) {
                        this.f9316q.setText(String.format("%.2f%s", new Object[]{Double.valueOf(C2556x.f9805v[C2465bl.f8800b].mo9974b().get(1).mo9984b()), C2557y.f9835g.f10348dj}));
                        this.f9294O = true;
                    }
                    if (!this.f9297R) {
                        this.f9325z.setText(String.format("%.2f%s", new Object[]{Double.valueOf(C2556x.f9805v[C2465bl.f8800b].mo9974b().get(1).mo9994k()), C2557y.f9835g.f10348dj}));
                        this.f9297R = true;
                    }
                    double j3 = alVar.mo9865j();
                    C2614s x3 = C2507bq.this.f9219d[C2465bl.f8800b].f7846S.mo9828x();
                    this.f9317r.setText(String.format("%.2f%s", new Object[]{Double.valueOf(j3), C2557y.f9835g.f10348dj}));
                    this.f9320u.setText(String.format("%s: %.1fcm", new Object[]{C2557y.f9835g.f10188ai, Double.valueOf(x3.mo9995l() / 10.0d)}));
                    this.f9323x.setText(String.format("%s: %d/%s", new Object[]{C2557y.f9835g.f10189aj, Integer.valueOf((int) x3.mo9996m()), C2557y.f9835g.f10349dk}));
                } else if (i == 3) {
                    if (!this.f9295P) {
                        this.f9317r.setText(String.format("%.2f%s", new Object[]{Double.valueOf(C2556x.f9805v[C2465bl.f8800b].mo9974b().get(2).mo9984b()), C2557y.f9835g.f10348dj}));
                        this.f9295P = true;
                    }
                    if (!this.f9298S) {
                        this.f9280A.setText(String.format("%.2f%s", new Object[]{Double.valueOf(C2556x.f9805v[C2465bl.f8800b].mo9974b().get(2).mo9994k()), C2557y.f9835g.f10348dj}));
                        this.f9298S = true;
                    }
                }
            }

            /* renamed from: a */
            public void mo9245a(boolean z) {
                int i = 0;
                int[] iArr = {50, 50, 50, 50, 0};
                int[] iArr2 = {750, 1400, 1050, 300, 200};
                switch (C2465bl.f8801c.get(0).mo9310b().f9755k) {
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
                for (int i2 = 0; i2 < iArr.length; i2++) {
                    i = i + iArr[i2] + iArr2[i2];
                }
                if (z) {
                    i += 590;
                }
                this.f9301b.setScaleHeight((float) i);
            }

            /* renamed from: b */
            public void mo9246b() {
                this.f9300a.setVisibility(0);
            }

            /* renamed from: c */
            public void mo9247c() {
                this.f9300a.setVisibility(4);
            }

            /* JADX WARNING: Removed duplicated region for block: B:14:0x0042  */
            /* JADX WARNING: Removed duplicated region for block: B:17:0x007c  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onClick(android.view.View r11) {
                /*
                    r10 = this;
                    r2 = 4
                    r3 = -1
                    r9 = 2
                    r8 = 1
                    r1 = 0
                    int r6 = r11.getId()
                    switch(r6) {
                        case 2131232568: goto L_0x000d;
                        case 2131232572: goto L_0x000d;
                        case 2131232576: goto L_0x000d;
                        case 2131232578: goto L_0x0144;
                        case 2131232583: goto L_0x000d;
                        case 2131232587: goto L_0x000d;
                        case 2131232591: goto L_0x01fa;
                        case 2131232597: goto L_0x000d;
                        case 2131232604: goto L_0x000d;
                        case 2131232611: goto L_0x000d;
                        case 2131232618: goto L_0x000d;
                        case 2131232625: goto L_0x000d;
                        case 2131232632: goto L_0x000d;
                        case 2131232638: goto L_0x000d;
                        case 2131232642: goto L_0x000d;
                        case 2131232646: goto L_0x000d;
                        case 2131232650: goto L_0x000d;
                        case 2131232654: goto L_0x000d;
                        case 2131232658: goto L_0x000d;
                        case 2131232663: goto L_0x000d;
                        case 2131232667: goto L_0x00c1;
                        case 2131232669: goto L_0x00f3;
                        case 2131232673: goto L_0x0125;
                        default: goto L_0x000c;
                    }
                L_0x000c:
                    return
                L_0x000d:
                    r0 = r1
                    r2 = r3
                    r4 = r3
                L_0x0010:
                    int[] r5 = r10.f9291L
                    int r5 = r5.length
                    if (r0 >= r5) goto L_0x002c
                    r5 = r1
                L_0x0016:
                    int[] r7 = r10.f9291L
                    r7 = r7[r0]
                    if (r5 >= r7) goto L_0x002a
                    android.widget.ImageView[][] r7 = r10.f9307h
                    r7 = r7[r0]
                    r7 = r7[r5]
                    int r7 = r7.getId()
                    if (r7 != r6) goto L_0x0076
                    r2 = r5
                    r4 = r0
                L_0x002a:
                    if (r4 == r3) goto L_0x0079
                L_0x002c:
                    com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                    int r3 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    r0 = r0[r3]
                    android.util.Pair<java.lang.Boolean, java.lang.Long>[][] r0 = r0.f7758c
                    r0 = r0[r4]
                    r0 = r0[r2]
                    java.lang.Object r0 = r0.first
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    if (r0 == 0) goto L_0x007c
                    com.ssomai.android.scalablelayout.ScalableLayout[][] r0 = r10.f9304e
                    r0 = r0[r4]
                    r0 = r0[r2]
                    r3 = 2131165280(0x7f070060, float:1.7944773E38)
                    r0.setBackgroundResource(r3)
                    android.widget.ImageView[][] r0 = r10.f9306g
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
                    goto L_0x000c
                L_0x0076:
                    int r5 = r5 + 1
                    goto L_0x0016
                L_0x0079:
                    int r0 = r0 + 1
                    goto L_0x0010
                L_0x007c:
                    com.ssomai.android.scalablelayout.ScalableLayout[][] r0 = r10.f9304e
                    r0 = r0[r4]
                    r0 = r0[r2]
                    r1 = 2131165277(0x7f07005d, float:1.7944767E38)
                    r0.setBackgroundResource(r1)
                    android.widget.ImageView[][] r0 = r10.f9306g
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
                    com.imlabworld.HS_Instructor.bq$c r4 = com.imlabworld.HS_Instructor.C2507bq.C2510c.this
                    com.imlabworld.HS_Instructor.bq r4 = com.imlabworld.HS_Instructor.C2507bq.this
                    com.imlabworld.HS_Instructor.ae[] r4 = r4.f9219d
                    int r5 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    r4 = r4[r5]
                    com.imlabworld.a.y r4 = r4.f7846S
                    long r4 = r4.mo10036d()
                    java.lang.Long r4 = java.lang.Long.valueOf(r4)
                    r1.<init>(r3, r4)
                    r0[r2] = r1
                    goto L_0x000c
                L_0x00c1:
                    com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                    int r2 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    r0 = r0[r2]
                    boolean r0 = r0.f7761f
                    if (r0 == 0) goto L_0x00df
                    com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                    int r2 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    r0 = r0[r2]
                    r0.f7761f = r1
                    android.widget.ImageView[] r0 = r10.f9310k
                    r0 = r0[r1]
                    r1 = 2131165517(0x7f07014d, float:1.7945253E38)
                    r0.setImageResource(r1)
                    goto L_0x000c
                L_0x00df:
                    com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                    int r2 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    r0 = r0[r2]
                    r0.f7761f = r8
                    android.widget.ImageView[] r0 = r10.f9310k
                    r0 = r0[r1]
                    r1 = 2131165516(0x7f07014c, float:1.7945251E38)
                    r0.setImageResource(r1)
                    goto L_0x000c
                L_0x00f3:
                    com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                    int r2 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    r0 = r0[r2]
                    boolean r0 = r0.f7762g
                    if (r0 == 0) goto L_0x0111
                    com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                    int r2 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    r0 = r0[r2]
                    r0.f7762g = r1
                    android.widget.ImageView[] r0 = r10.f9310k
                    r0 = r0[r8]
                    r1 = 2131165517(0x7f07014d, float:1.7945253E38)
                    r0.setImageResource(r1)
                    goto L_0x000c
                L_0x0111:
                    com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                    int r1 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    r0 = r0[r1]
                    r0.f7762g = r8
                    android.widget.ImageView[] r0 = r10.f9310k
                    r0 = r0[r8]
                    r1 = 2131165516(0x7f07014c, float:1.7945251E38)
                    r0.setImageResource(r1)
                    goto L_0x000c
                L_0x0125:
                    com.imlabworld.HS_Instructor.bq$c r0 = com.imlabworld.HS_Instructor.C2507bq.C2510c.this
                    com.imlabworld.HS_Instructor.bq r0 = com.imlabworld.HS_Instructor.C2507bq.this
                    long r0 = r0.f9220e
                    com.imlabworld.HS_Instructor.C2465bl.f8805g = r0
                    com.imlabworld.HS_Instructor.bq$c r0 = com.imlabworld.HS_Instructor.C2507bq.C2510c.this
                    com.imlabworld.HS_Instructor.bq r0 = com.imlabworld.HS_Instructor.C2507bq.this
                    com.imlabworld.HS_Instructor.bq$b r0 = r0.f9218c
                    int r1 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    com.imlabworld.HS_Instructor.bq$a r2 = com.imlabworld.HS_Instructor.C2507bq.C2508a.NEXT
                    java.lang.String r3 = ""
                    java.lang.String r4 = ""
                    r0.mo8598a(r1, r2, r3, r4)
                    goto L_0x000c
                L_0x0144:
                    boolean r0 = r10.f9292M
                    if (r0 == 0) goto L_0x01e3
                    r10.f9292M = r1
                    android.widget.TextView r0 = r10.f9287H
                    r0.setVisibility(r1)
                    android.widget.ImageView r0 = r10.f9288I
                    r0.setVisibility(r2)
                    android.widget.TextView r0 = r10.f9289J
                    r0.setVisibility(r2)
                    android.widget.ImageView[][] r0 = r10.f9306g
                    r0 = r0[r1]
                    r0 = r0[r9]
                    r0.setVisibility(r1)
                    android.widget.ImageView[][] r0 = r10.f9307h
                    r0 = r0[r1]
                    r0 = r0[r9]
                    r0.setOnClickListener(r10)
                    com.imlabworld.HS_Instructor.bq$c r0 = com.imlabworld.HS_Instructor.C2507bq.C2510c.this
                    com.imlabworld.HS_Instructor.bq r0 = com.imlabworld.HS_Instructor.C2507bq.this
                    long r2 = r0.f9220e
                    long r4 = com.imlabworld.HS_Instructor.C2465bl.f8806h
                    long r2 = r2 - r4
                    double r2 = (double) r2
                    r4 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
                    double r2 = r2 * r4
                    com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                    int r4 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    r0 = r0[r4]
                    r0.f7763h = r2
                    android.widget.TextView r0 = r10.f9287H
                    java.lang.String r4 = "%.2f%s"
                    java.lang.Object[] r5 = new java.lang.Object[r9]
                    java.lang.Double r2 = java.lang.Double.valueOf(r2)
                    r5[r1] = r2
                    com.imlabworld.a.g r2 = com.imlabworld.HS_Instructor.C2557y.f9835g
                    java.lang.String r2 = r2.f10348dj
                    r5[r8] = r2
                    java.lang.String r2 = java.lang.String.format(r4, r5)
                    r0.setText(r2)
                    com.ssomai.android.scalablelayout.ScalableLayout[][] r0 = r10.f9304e
                    r0 = r0[r1]
                    r0 = r0[r9]
                    r2 = 2131165277(0x7f07005d, float:1.7944767E38)
                    r0.setBackgroundResource(r2)
                    android.widget.ImageView[][] r0 = r10.f9306g
                    r0 = r0[r1]
                    r0 = r0[r9]
                    r2 = 2131165512(0x7f070148, float:1.7945243E38)
                    r0.setImageResource(r2)
                    com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                    int r2 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    r0 = r0[r2]
                    android.util.Pair<java.lang.Boolean, java.lang.Long>[][] r0 = r0.f7758c
                    r0 = r0[r1]
                    android.util.Pair r1 = new android.util.Pair
                    java.lang.Boolean r2 = java.lang.Boolean.valueOf(r8)
                    com.imlabworld.HS_Instructor.bq$c r3 = com.imlabworld.HS_Instructor.C2507bq.C2510c.this
                    com.imlabworld.HS_Instructor.bq r3 = com.imlabworld.HS_Instructor.C2507bq.this
                    long r4 = r3.f9220e
                    java.lang.Long r3 = java.lang.Long.valueOf(r4)
                    r1.<init>(r2, r3)
                    r0[r9] = r1
                    com.imlabworld.HS_Instructor.bq$c r0 = com.imlabworld.HS_Instructor.C2507bq.C2510c.this
                    com.imlabworld.HS_Instructor.bq r0 = com.imlabworld.HS_Instructor.C2507bq.this
                    long r0 = r0.f9220e
                    com.imlabworld.HS_Instructor.C2465bl.f8807i = r0
                    goto L_0x000c
                L_0x01e3:
                    r10.f9292M = r8
                    com.imlabworld.HS_Instructor.bq$c r0 = com.imlabworld.HS_Instructor.C2507bq.C2510c.this
                    com.imlabworld.HS_Instructor.bq r0 = com.imlabworld.HS_Instructor.C2507bq.this
                    long r0 = r0.f9220e
                    com.imlabworld.HS_Instructor.C2465bl.f8806h = r0
                    android.widget.TextView r0 = r10.f9289J
                    com.imlabworld.a.g r1 = com.imlabworld.HS_Instructor.C2557y.f9835g
                    java.lang.String r1 = r1.f10204ay
                    r0.setText(r1)
                    goto L_0x000c
                L_0x01fa:
                    com.imlabworld.HS_Instructor.bq$c r0 = com.imlabworld.HS_Instructor.C2507bq.C2510c.this
                    com.imlabworld.HS_Instructor.bq r0 = com.imlabworld.HS_Instructor.C2507bq.this
                    com.imlabworld.HS_Instructor.bq$b r0 = r0.f9218c
                    int r2 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    com.imlabworld.HS_Instructor.bq$a r3 = com.imlabworld.HS_Instructor.C2507bq.C2508a.CHANGE_ROLE
                    java.lang.String r4 = ""
                    java.lang.String r5 = ""
                    r0.mo8598a(r2, r3, r4, r5)
                    com.imlabworld.a.r[] r0 = com.imlabworld.HS_Instructor.C2556x.f9805v
                    int r2 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    r0 = r0[r2]
                    int r0 = r0.mo9977d()
                    if (r0 <= 0) goto L_0x027f
                    boolean r0 = r10.f9293N
                    if (r0 != 0) goto L_0x024c
                    com.imlabworld.a.r[] r0 = com.imlabworld.HS_Instructor.C2556x.f9805v
                    int r2 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    r0 = r0[r2]
                    java.util.ArrayList r0 = r0.mo9974b()
                    java.lang.Object r0 = r0.get(r1)
                    com.imlabworld.a.s r0 = (com.imlabworld.p079a.C2614s) r0
                    android.widget.TextView r2 = r10.f9315p
                    java.lang.String r3 = "%.2f%s"
                    java.lang.Object[] r4 = new java.lang.Object[r9]
                    double r6 = r0.mo9984b()
                    java.lang.Double r0 = java.lang.Double.valueOf(r6)
                    r4[r1] = r0
                    com.imlabworld.a.g r0 = com.imlabworld.HS_Instructor.C2557y.f9835g
                    java.lang.String r0 = r0.f10348dj
                    r4[r8] = r0
                    java.lang.String r0 = java.lang.String.format(r3, r4)
                    r2.setText(r0)
                    r10.f9293N = r8
                L_0x024c:
                    boolean r0 = r10.f9296Q
                    if (r0 != 0) goto L_0x027f
                    com.imlabworld.a.r[] r0 = com.imlabworld.HS_Instructor.C2556x.f9805v
                    int r2 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    r0 = r0[r2]
                    java.util.ArrayList r0 = r0.mo9974b()
                    java.lang.Object r0 = r0.get(r1)
                    com.imlabworld.a.s r0 = (com.imlabworld.p079a.C2614s) r0
                    android.widget.TextView r2 = r10.f9324y
                    java.lang.String r3 = "%.2f%s"
                    java.lang.Object[] r4 = new java.lang.Object[r9]
                    double r6 = r0.mo9994k()
                    java.lang.Double r0 = java.lang.Double.valueOf(r6)
                    r4[r1] = r0
                    com.imlabworld.a.g r0 = com.imlabworld.HS_Instructor.C2557y.f9835g
                    java.lang.String r0 = r0.f10348dj
                    r4[r8] = r0
                    java.lang.String r0 = java.lang.String.format(r3, r4)
                    r2.setText(r0)
                    r10.f9296Q = r8
                L_0x027f:
                    com.imlabworld.a.r[] r0 = com.imlabworld.HS_Instructor.C2556x.f9805v
                    int r2 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    r0 = r0[r2]
                    int r0 = r0.mo9977d()
                    if (r0 <= r8) goto L_0x02f1
                    boolean r0 = r10.f9294O
                    if (r0 != 0) goto L_0x02be
                    com.imlabworld.a.r[] r0 = com.imlabworld.HS_Instructor.C2556x.f9805v
                    int r2 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    r0 = r0[r2]
                    java.util.ArrayList r0 = r0.mo9974b()
                    java.lang.Object r0 = r0.get(r8)
                    com.imlabworld.a.s r0 = (com.imlabworld.p079a.C2614s) r0
                    android.widget.TextView r2 = r10.f9316q
                    java.lang.String r3 = "%.2f%s"
                    java.lang.Object[] r4 = new java.lang.Object[r9]
                    double r6 = r0.mo9984b()
                    java.lang.Double r0 = java.lang.Double.valueOf(r6)
                    r4[r1] = r0
                    com.imlabworld.a.g r0 = com.imlabworld.HS_Instructor.C2557y.f9835g
                    java.lang.String r0 = r0.f10348dj
                    r4[r8] = r0
                    java.lang.String r0 = java.lang.String.format(r3, r4)
                    r2.setText(r0)
                    r10.f9294O = r8
                L_0x02be:
                    boolean r0 = r10.f9297R
                    if (r0 != 0) goto L_0x02f1
                    com.imlabworld.a.r[] r0 = com.imlabworld.HS_Instructor.C2556x.f9805v
                    int r2 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    r0 = r0[r2]
                    java.util.ArrayList r0 = r0.mo9974b()
                    java.lang.Object r0 = r0.get(r8)
                    com.imlabworld.a.s r0 = (com.imlabworld.p079a.C2614s) r0
                    android.widget.TextView r2 = r10.f9325z
                    java.lang.String r3 = "%.2f%s"
                    java.lang.Object[] r4 = new java.lang.Object[r9]
                    double r6 = r0.mo9994k()
                    java.lang.Double r0 = java.lang.Double.valueOf(r6)
                    r4[r1] = r0
                    com.imlabworld.a.g r0 = com.imlabworld.HS_Instructor.C2557y.f9835g
                    java.lang.String r0 = r0.f10348dj
                    r4[r8] = r0
                    java.lang.String r0 = java.lang.String.format(r3, r4)
                    r2.setText(r0)
                    r10.f9297R = r8
                L_0x02f1:
                    com.imlabworld.a.r[] r0 = com.imlabworld.HS_Instructor.C2556x.f9805v
                    int r2 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    r0 = r0[r2]
                    int r0 = r0.mo9977d()
                    if (r0 <= r9) goto L_0x0363
                    boolean r0 = r10.f9295P
                    if (r0 != 0) goto L_0x0330
                    com.imlabworld.a.r[] r0 = com.imlabworld.HS_Instructor.C2556x.f9805v
                    int r2 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    r0 = r0[r2]
                    java.util.ArrayList r0 = r0.mo9974b()
                    java.lang.Object r0 = r0.get(r9)
                    com.imlabworld.a.s r0 = (com.imlabworld.p079a.C2614s) r0
                    android.widget.TextView r2 = r10.f9317r
                    java.lang.String r3 = "%.2f%s"
                    java.lang.Object[] r4 = new java.lang.Object[r9]
                    double r6 = r0.mo9984b()
                    java.lang.Double r0 = java.lang.Double.valueOf(r6)
                    r4[r1] = r0
                    com.imlabworld.a.g r0 = com.imlabworld.HS_Instructor.C2557y.f9835g
                    java.lang.String r0 = r0.f10348dj
                    r4[r8] = r0
                    java.lang.String r0 = java.lang.String.format(r3, r4)
                    r2.setText(r0)
                    r10.f9295P = r8
                L_0x0330:
                    boolean r0 = r10.f9298S
                    if (r0 != 0) goto L_0x0363
                    com.imlabworld.a.r[] r0 = com.imlabworld.HS_Instructor.C2556x.f9805v
                    int r2 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    r0 = r0[r2]
                    java.util.ArrayList r0 = r0.mo9974b()
                    java.lang.Object r0 = r0.get(r9)
                    com.imlabworld.a.s r0 = (com.imlabworld.p079a.C2614s) r0
                    android.widget.TextView r2 = r10.f9280A
                    java.lang.String r3 = "%.2f%s"
                    java.lang.Object[] r4 = new java.lang.Object[r9]
                    double r6 = r0.mo9994k()
                    java.lang.Double r0 = java.lang.Double.valueOf(r6)
                    r4[r1] = r0
                    com.imlabworld.a.g r0 = com.imlabworld.HS_Instructor.C2557y.f9835g
                    java.lang.String r0 = r0.f10348dj
                    r4[r8] = r0
                    java.lang.String r0 = java.lang.String.format(r3, r4)
                    r2.setText(r0)
                    r10.f9298S = r8
                L_0x0363:
                    android.widget.TextView r0 = r10.f9312m
                    r1 = 0
                    r0.setOnClickListener(r1)
                    android.widget.TextView r0 = r10.f9312m
                    r1 = 1041865114(0x3e19999a, float:0.15)
                    r0.setAlpha(r1)
                    android.widget.TextView r0 = r10.f9312m
                    com.imlabworld.a.g r1 = com.imlabworld.HS_Instructor.C2557y.f9835g
                    java.lang.String r1 = r1.f10528hD
                    r0.setText(r1)
                    goto L_0x000c
                */
                throw new UnsupportedOperationException("Method not decompiled: com.imlabworld.HS_Instructor.C2507bq.C2510c.C2512b.onClick(android.view.View):void");
            }
        }

        /* renamed from: com.imlabworld.HS_Instructor.bq$c$c */
        class C2513c implements View.OnClickListener {

            /* renamed from: a */
            final ScrollView f9326a;

            /* renamed from: b */
            final ScalableLayout f9327b;

            /* renamed from: c */
            final ScalableLayout[] f9328c = new ScalableLayout[4];

            /* renamed from: d */
            final TextView[] f9329d = new TextView[3];

            /* renamed from: e */
            final ScalableLayout[][] f9330e = ((ScalableLayout[][]) Array.newInstance(ScalableLayout.class, new int[]{3, 5}));

            /* renamed from: f */
            final TextView[][] f9331f = ((TextView[][]) Array.newInstance(TextView.class, new int[]{3, 5}));

            /* renamed from: g */
            final ImageView[][] f9332g = ((ImageView[][]) Array.newInstance(ImageView.class, new int[]{3, 5}));

            /* renamed from: h */
            final ImageView[][] f9333h = ((ImageView[][]) Array.newInstance(ImageView.class, new int[]{3, 5}));

            /* renamed from: i */
            final TextView f9334i;

            /* renamed from: j */
            final TextView[] f9335j = new TextView[2];

            /* renamed from: k */
            final ImageView[] f9336k = new ImageView[2];

            /* renamed from: l */
            final TextView f9337l;

            /* renamed from: m */
            final ImageView f9338m;

            /* renamed from: n */
            final TextView f9339n;

            /* renamed from: o */
            final TextView[] f9340o = new TextView[5];

            /* renamed from: p */
            final ImageView[] f9341p = new ImageView[6];

            /* renamed from: q */
            final TextView[] f9342q = new TextView[6];

            /* renamed from: r */
            final boolean[] f9343r = new boolean[5];

            /* renamed from: s */
            final TextView f9344s;

            /* renamed from: t */
            final int[] f9345t = new int[3];

            /* renamed from: u */
            boolean f9346u;

            /* renamed from: v */
            final /* synthetic */ C2510c f9347v;

            public C2513c(C2510c cVar, View view) {
                this.f9347v = cVar;
                this.f9326a = (ScrollView) view.findViewById(C2656R.C2657id.test_sheet_infant_bls_scroll);
                this.f9327b = (ScalableLayout) view.findViewById(C2656R.C2657id.test_sheet_infant_bls_scroll_sc);
                this.f9328c[0] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_sheet_infant_bls_part1_sc);
                this.f9328c[1] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_sheet_infant_bls_part2_sc);
                this.f9328c[2] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_sheet_infant_bls_part3_sc);
                this.f9328c[3] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_sheet_infant_bls_part4_sc);
                this.f9329d[0] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_infant_bls_g1_txt);
                this.f9329d[1] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_infant_bls_g2_txt);
                this.f9329d[2] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_infant_bls_g3_txt);
                this.f9330e[0][0] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_sheet_infant_bls_g1q1_sc);
                this.f9330e[0][1] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_sheet_infant_bls_g1q2_sc);
                this.f9330e[0][2] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_sheet_infant_bls_g1q3_sc);
                this.f9330e[0][3] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_sheet_infant_bls_g1q4_sc);
                this.f9330e[0][4] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_sheet_infant_bls_g1q5_sc);
                this.f9330e[1][0] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_sheet_infant_bls_g2q1_sc);
                this.f9330e[1][1] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_sheet_infant_bls_g2q2_sc);
                this.f9330e[1][2] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_sheet_infant_bls_g2q3_sc);
                this.f9330e[1][3] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_sheet_infant_bls_g2q4_sc);
                this.f9330e[1][4] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_sheet_infant_bls_g2q5_sc);
                this.f9330e[2][0] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_sheet_infant_bls_g3q1_sc);
                this.f9330e[2][1] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_sheet_infant_bls_g3q2_sc);
                this.f9331f[0][0] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_infant_bls_g1q1_txt);
                this.f9331f[0][1] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_infant_bls_g1q2_txt);
                this.f9331f[0][2] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_infant_bls_g1q3_txt);
                this.f9331f[0][3] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_infant_bls_g1q4_txt);
                this.f9331f[0][4] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_infant_bls_g1q5_txt);
                this.f9331f[1][0] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_infant_bls_g2q1_txt);
                this.f9331f[1][1] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_infant_bls_g2q2_txt);
                this.f9331f[1][2] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_infant_bls_g2q3_txt);
                this.f9331f[1][3] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_infant_bls_g2q4_txt);
                this.f9331f[1][4] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_infant_bls_g2q5_txt);
                this.f9331f[2][0] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_infant_bls_g3q1_txt);
                this.f9331f[2][1] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_infant_bls_g3q2_txt);
                this.f9332g[0][0] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_infant_bls_g1q1_btn);
                this.f9332g[0][1] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_infant_bls_g1q2_btn);
                this.f9332g[0][2] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_infant_bls_g1q3_btn);
                this.f9332g[0][3] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_infant_bls_g1q4_btn);
                this.f9332g[0][4] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_infant_bls_g1q5_btn);
                this.f9332g[1][0] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_infant_bls_g2q1_btn);
                this.f9332g[1][1] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_infant_bls_g2q2_btn);
                this.f9332g[1][2] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_infant_bls_g2q3_btn);
                this.f9332g[1][3] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_infant_bls_g2q4_btn);
                this.f9332g[1][4] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_infant_bls_g2q5_btn);
                this.f9332g[2][0] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_infant_bls_g3q1_btn);
                this.f9332g[2][1] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_infant_bls_g3q2_btn);
                this.f9333h[0][0] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_infant_bls_g1q1_click_btn);
                this.f9333h[0][1] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_infant_bls_g1q2_click_btn);
                this.f9333h[0][2] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_infant_bls_g1q3_click_btn);
                this.f9333h[0][3] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_infant_bls_g1q4_click_btn);
                this.f9333h[0][4] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_infant_bls_g1q5_click_btn);
                this.f9333h[1][0] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_infant_bls_g2q1_click_btn);
                this.f9333h[1][1] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_infant_bls_g2q2_click_btn);
                this.f9333h[1][2] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_infant_bls_g2q3_click_btn);
                this.f9333h[1][3] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_infant_bls_g2q4_click_btn);
                this.f9333h[1][4] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_infant_bls_g2q5_click_btn);
                this.f9333h[2][0] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_infant_bls_g3q1_click_btn);
                this.f9333h[2][1] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_infant_bls_g3q2_click_btn);
                this.f9334i = (TextView) view.findViewById(C2656R.C2657id.test_sheet_infant_bls_mibi_txt);
                this.f9335j[0] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_infant_bls_mibi1_txt);
                this.f9335j[1] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_infant_bls_mibi2_txt);
                this.f9336k[0] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_infant_bls_mibi1_btn);
                this.f9336k[1] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_infant_bls_mibi2_btn);
                this.f9337l = (TextView) view.findViewById(C2656R.C2657id.test_sheet_infant_bls_g1q4_timer_value_txt);
                this.f9338m = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_infant_bls_g1q4_timer_btn);
                this.f9339n = (TextView) view.findViewById(C2656R.C2657id.test_sheet_infant_bls_g1q4_timer_btn_txt);
                this.f9340o[0] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_infant_bls_g2q1_timer_value_txt);
                this.f9340o[1] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_infant_bls_g2q2_timer_value_txt);
                this.f9340o[2] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_infant_bls_g2q3_timer_value_txt);
                this.f9340o[3] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_infant_bls_g2q4_timer_value_txt);
                this.f9340o[4] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_infant_bls_g3q1_timer_value_txt);
                this.f9341p[0] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_infant_bls_g2q1_timer_btn);
                this.f9341p[1] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_infant_bls_g2q2_timer_btn);
                this.f9341p[2] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_infant_bls_g2q3_timer_btn);
                this.f9341p[3] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_infant_bls_g2q4_timer_btn);
                this.f9341p[4] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_infant_bls_g3q1_timer_btn);
                this.f9341p[5] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_infant_bls_g2q0_timer_btn);
                this.f9342q[0] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_infant_bls_g2q1_timer_btn_txt);
                this.f9342q[1] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_infant_bls_g2q2_timer_btn_txt);
                this.f9342q[2] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_infant_bls_g2q3_timer_btn_txt);
                this.f9342q[3] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_infant_bls_g2q4_timer_btn_txt);
                this.f9342q[4] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_infant_bls_g3q1_timer_btn_txt);
                this.f9342q[5] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_infant_bls_g2q0_timer_btn_txt);
                this.f9344s = (TextView) view.findViewById(C2656R.C2657id.test_sheet_infant_bls_next_btn);
                this.f9345t[0] = 5;
                this.f9345t[1] = 5;
                this.f9345t[2] = 2;
                for (int i = 0; i < this.f9345t.length; i++) {
                    for (int i2 = 0; i2 < this.f9345t[i]; i2++) {
                        this.f9333h[i][i2].setOnClickListener(this);
                    }
                }
                this.f9336k[0].setOnClickListener(this);
                this.f9336k[1].setOnClickListener(this);
                for (int i3 = 0; i3 < 6; i3++) {
                    this.f9341p[i3].setOnClickListener(this);
                }
                this.f9344s.setOnClickListener(this);
                this.f9338m.setOnClickListener(this);
            }

            /* renamed from: a */
            public void mo9249a() {
                C2552t b = C2465bl.f8801c.get(0).mo9310b();
                C2556x.f9806w[C2465bl.f8800b] = new C2334ac();
                for (int i = 0; i < this.f9345t.length; i++) {
                    for (int i2 = 0; i2 < this.f9345t[i]; i2++) {
                        this.f9330e[i][i2].setBackgroundResource(C2656R.drawable.bg_test_unselected);
                        this.f9332g[i][i2].setImageResource(C2656R.drawable.img_test_uncheck);
                    }
                }
                int[] iArr = {50, 50, 50, 0};
                int[] iArr2 = {750, 1050, 450, 200};
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
                this.f9328c[0].setScaleHeight((float) iArr2[0]);
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    int i5 = i4;
                    int i6 = i3;
                    if (i5 < iArr.length) {
                        int i7 = i6 + iArr[i5];
                        this.f9327b.mo10069b(this.f9328c[i5], 100.0f, (float) i7, 2095.0f, (float) iArr2[i5]);
                        i3 = i7 + iArr2[i5];
                        i4 = i5 + 1;
                    } else {
                        this.f9327b.mo10069b(this.f9337l, 1780.0f, 650.0f, 200.0f, 150.0f);
                        this.f9327b.mo10069b(this.f9338m, 1980.0f, 500.0f, 200.0f, 300.0f);
                        this.f9327b.mo10069b(this.f9339n, 1980.0f, 500.0f, 200.0f, 300.0f);
                        this.f9327b.setScaleHeight((float) i6);
                        C2556x.f9806w[C2465bl.f8800b].f7756a = C2334ac.C2336b.TEST;
                        this.f9329d[0].setText(C2557y.f9835g.f10419fA);
                        this.f9329d[1].setText(C2557y.f9835g.f10149W);
                        this.f9329d[2].setText(C2557y.f9835g.f10149W + C2557y.f9835g.f10487gP);
                        this.f9337l.setVisibility(4);
                        this.f9338m.setVisibility(4);
                        this.f9339n.setVisibility(4);
                        this.f9332g[0][2].setVisibility(0);
                        this.f9332g[0][3].setVisibility(0);
                        for (int i8 = 0; i8 < 5; i8++) {
                            this.f9341p[i8].setVisibility(4);
                            this.f9342q[i8].setVisibility(4);
                            this.f9340o[i8].setText(String.format("%.2f%s", new Object[]{Float.valueOf(0.0f), C2557y.f9835g.f10348dj}));
                            this.f9343r[i8] = false;
                        }
                        for (int i9 = 0; i9 < 4; i9++) {
                            this.f9332g[1][i9].setVisibility(4);
                        }
                        for (int i10 = 0; i10 < 1; i10++) {
                            this.f9332g[2][i10].setVisibility(4);
                        }
                        this.f9341p[5].setVisibility(0);
                        this.f9342q[5].setVisibility(0);
                        this.f9341p[4].setVisibility(0);
                        this.f9342q[4].setVisibility(0);
                        this.f9342q[5].setText(C2557y.f9835g.f10536hL);
                        this.f9342q[0].setText(C2557y.f9835g.f10538hN + "\n\n" + C2557y.f9835g.f10537hM);
                        this.f9342q[1].setText(C2557y.f9835g.f10539hO + "\n\n" + C2557y.f9835g.f10536hL);
                        this.f9342q[2].setText(C2557y.f9835g.f10538hN + "\n\n" + C2557y.f9835g.f10537hM);
                        this.f9342q[3].setText(C2557y.f9835g.f10539hO);
                        this.f9342q[4].setText(C2557y.f9835g.f10536hL);
                        switch (b.f9755k) {
                            case 1:
                            case 4:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                this.f9331f[0][0].setText(C2557y.f9835g.f10421fC);
                                this.f9331f[0][1].setText(C2557y.f9835g.f10422fD);
                                this.f9331f[0][2].setText(C2557y.f9835g.f10424fF);
                                this.f9331f[0][3].setText(C2557y.f9835g.f10425fG);
                                this.f9337l.setVisibility(0);
                                this.f9338m.setVisibility(0);
                                this.f9339n.setVisibility(0);
                                this.f9332g[0][2].setVisibility(4);
                                this.f9332g[0][3].setVisibility(4);
                                this.f9333h[0][2].setOnClickListener((View.OnClickListener) null);
                                this.f9333h[0][3].setOnClickListener((View.OnClickListener) null);
                                this.f9337l.setText(String.format("%.2f%s", new Object[]{Float.valueOf(0.0f), C2557y.f9835g.f10348dj}));
                                this.f9339n.setText(C2557y.f9835g.f10473gB);
                                this.f9346u = false;
                                break;
                            case 2:
                            case 5:
                                this.f9331f[0][0].setText(C2557y.f9835g.f10420fB);
                                this.f9331f[0][1].setText(C2557y.f9835g.f10421fC);
                                this.f9331f[0][2].setText(C2557y.f9835g.f10423fE);
                                this.f9331f[0][3].setText(C2557y.f9835g.f10424fF);
                                this.f9331f[0][4].setText(C2557y.f9835g.f10422fD);
                                break;
                            case 3:
                            case 6:
                                this.f9331f[0][0].setText(C2557y.f9835g.f10420fB);
                                this.f9331f[0][1].setText(C2557y.f9835g.f10421fC);
                                this.f9331f[0][2].setText(C2557y.f9835g.f10422fD);
                                this.f9331f[0][3].setText(C2557y.f9835g.f10423fE);
                                this.f9331f[0][4].setText(C2557y.f9835g.f10424fF);
                                break;
                        }
                        this.f9331f[1][0].setText(C2557y.f9835g.f10141O + "1: " + C2557y.f9835g.f10428fJ);
                        this.f9331f[1][1].setText(C2557y.f9835g.f10141O + "1: " + C2557y.f9835g.f10430fL);
                        this.f9331f[1][2].setText(C2557y.f9835g.f10141O + "2: " + C2557y.f9835g.f10433fO);
                        this.f9331f[1][3].setText(C2557y.f9835g.f10141O + "2: " + C2557y.f9835g.f10434fP);
                        this.f9331f[1][4].setText(C2557y.f9835g.f10141O + "2: " + C2557y.f9835g.f10435fQ);
                        this.f9331f[2][0].setText(C2557y.f9835g.f10141O + "3: " + C2557y.f9835g.f10438fT);
                        this.f9331f[2][1].setText(C2557y.f9835g.f10141O + "4: " + C2557y.f9835g.f10443fY);
                        this.f9334i.setText(C2557y.f9835g.f10533hI);
                        this.f9335j[0].setText(C2557y.f9835g.f10534hJ);
                        this.f9335j[1].setText(C2557y.f9835g.f10535hK);
                        this.f9336k[0].setImageResource(C2656R.drawable.img_test_mibi_uncheck);
                        this.f9336k[1].setImageResource(C2656R.drawable.img_test_mibi_uncheck);
                        this.f9344s.setText(C2557y.f9835g.f10395ed);
                        this.f9326a.scrollTo(0, 0);
                        return;
                    }
                }
            }

            /* renamed from: a */
            public void mo9250a(long j) {
                if (this.f9346u) {
                    this.f9337l.setText(String.format("%.2f%s", new Object[]{Double.valueOf(((double) (j - C2465bl.f8806h)) * 0.001d), C2557y.f9835g.f10348dj}));
                }
            }

            /* renamed from: b */
            public void mo9251b() {
                this.f9326a.setVisibility(0);
            }

            /* renamed from: b */
            public void mo9252b(long j) {
                for (int i = 0; i < 5; i++) {
                    if (this.f9343r[i]) {
                        this.f9340o[i].setText(String.format("%.2f%s", new Object[]{Double.valueOf(((double) (j - C2465bl.f8808j[i])) * 0.001d), C2557y.f9835g.f10348dj}));
                        return;
                    }
                }
            }

            /* renamed from: c */
            public void mo9253c() {
                this.f9326a.setVisibility(4);
            }

            /* JADX WARNING: Removed duplicated region for block: B:15:0x0045  */
            /* JADX WARNING: Removed duplicated region for block: B:18:0x007f  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onClick(android.view.View r13) {
                /*
                    r12 = this;
                    r11 = 3
                    r10 = 4
                    r9 = 2
                    r8 = 1
                    r1 = 0
                    int r5 = r13.getId()
                    r2 = -1
                    r0 = -1
                    switch(r5) {
                        case 2131232684: goto L_0x000f;
                        case 2131232688: goto L_0x000f;
                        case 2131232692: goto L_0x000f;
                        case 2131232696: goto L_0x000f;
                        case 2131232698: goto L_0x0147;
                        case 2131232703: goto L_0x000f;
                        case 2131232707: goto L_0x0288;
                        case 2131232710: goto L_0x000f;
                        case 2131232712: goto L_0x02b8;
                        case 2131232717: goto L_0x000f;
                        case 2131232719: goto L_0x0381;
                        case 2131232724: goto L_0x000f;
                        case 2131232726: goto L_0x0479;
                        case 2131232731: goto L_0x000f;
                        case 2131232733: goto L_0x0542;
                        case 2131232738: goto L_0x000f;
                        case 2131232743: goto L_0x000f;
                        case 2131232745: goto L_0x05b4;
                        case 2131232750: goto L_0x000f;
                        case 2131232753: goto L_0x00c4;
                        case 2131232755: goto L_0x00f6;
                        case 2131232759: goto L_0x0128;
                        default: goto L_0x000e;
                    }
                L_0x000e:
                    return
                L_0x000f:
                    r3 = r2
                    r2 = r0
                    r0 = r1
                L_0x0012:
                    int[] r4 = r12.f9345t
                    int r4 = r4.length
                    if (r0 >= r4) goto L_0x002f
                    r4 = r1
                L_0x0018:
                    int[] r6 = r12.f9345t
                    r6 = r6[r0]
                    if (r4 >= r6) goto L_0x002c
                    android.widget.ImageView[][] r6 = r12.f9333h
                    r6 = r6[r0]
                    r6 = r6[r4]
                    int r6 = r6.getId()
                    if (r6 != r5) goto L_0x0079
                    r2 = r4
                    r3 = r0
                L_0x002c:
                    r4 = -1
                    if (r3 == r4) goto L_0x007c
                L_0x002f:
                    com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                    int r4 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    r0 = r0[r4]
                    android.util.Pair<java.lang.Boolean, java.lang.Long>[][] r0 = r0.f7759d
                    r0 = r0[r3]
                    r0 = r0[r2]
                    java.lang.Object r0 = r0.first
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    if (r0 == 0) goto L_0x007f
                    com.ssomai.android.scalablelayout.ScalableLayout[][] r0 = r12.f9330e
                    r0 = r0[r3]
                    r0 = r0[r2]
                    r4 = 2131165280(0x7f070060, float:1.7944773E38)
                    r0.setBackgroundResource(r4)
                    android.widget.ImageView[][] r0 = r12.f9332g
                    r0 = r0[r3]
                    r0 = r0[r2]
                    r4 = 2131165531(0x7f07015b, float:1.7945282E38)
                    r0.setImageResource(r4)
                    com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                    int r4 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    r0 = r0[r4]
                    android.util.Pair<java.lang.Boolean, java.lang.Long>[][] r0 = r0.f7759d
                    r0 = r0[r3]
                    android.util.Pair r3 = new android.util.Pair
                    java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                    r4 = 0
                    java.lang.Long r4 = java.lang.Long.valueOf(r4)
                    r3.<init>(r1, r4)
                    r0[r2] = r3
                    goto L_0x000e
                L_0x0079:
                    int r4 = r4 + 1
                    goto L_0x0018
                L_0x007c:
                    int r0 = r0 + 1
                    goto L_0x0012
                L_0x007f:
                    com.ssomai.android.scalablelayout.ScalableLayout[][] r0 = r12.f9330e
                    r0 = r0[r3]
                    r0 = r0[r2]
                    r1 = 2131165277(0x7f07005d, float:1.7944767E38)
                    r0.setBackgroundResource(r1)
                    android.widget.ImageView[][] r0 = r12.f9332g
                    r0 = r0[r3]
                    r0 = r0[r2]
                    r1 = 2131165512(0x7f070148, float:1.7945243E38)
                    r0.setImageResource(r1)
                    com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                    int r1 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    r0 = r0[r1]
                    android.util.Pair<java.lang.Boolean, java.lang.Long>[][] r0 = r0.f7759d
                    r0 = r0[r3]
                    android.util.Pair r1 = new android.util.Pair
                    java.lang.Boolean r3 = java.lang.Boolean.valueOf(r8)
                    com.imlabworld.HS_Instructor.bq$c r4 = r12.f9347v
                    com.imlabworld.HS_Instructor.bq r4 = com.imlabworld.HS_Instructor.C2507bq.this
                    com.imlabworld.HS_Instructor.ae[] r4 = r4.f9219d
                    int r5 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    r4 = r4[r5]
                    com.imlabworld.a.y r4 = r4.f7846S
                    long r4 = r4.mo10036d()
                    java.lang.Long r4 = java.lang.Long.valueOf(r4)
                    r1.<init>(r3, r4)
                    r0[r2] = r1
                    goto L_0x000e
                L_0x00c4:
                    com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                    int r2 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    r0 = r0[r2]
                    boolean r0 = r0.f7761f
                    if (r0 == 0) goto L_0x00e2
                    com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                    int r2 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    r0 = r0[r2]
                    r0.f7761f = r1
                    android.widget.ImageView[] r0 = r12.f9336k
                    r0 = r0[r1]
                    r1 = 2131165517(0x7f07014d, float:1.7945253E38)
                    r0.setImageResource(r1)
                    goto L_0x000e
                L_0x00e2:
                    com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                    int r2 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    r0 = r0[r2]
                    r0.f7761f = r8
                    android.widget.ImageView[] r0 = r12.f9336k
                    r0 = r0[r1]
                    r1 = 2131165516(0x7f07014c, float:1.7945251E38)
                    r0.setImageResource(r1)
                    goto L_0x000e
                L_0x00f6:
                    com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                    int r2 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    r0 = r0[r2]
                    boolean r0 = r0.f7762g
                    if (r0 == 0) goto L_0x0114
                    com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                    int r2 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    r0 = r0[r2]
                    r0.f7762g = r1
                    android.widget.ImageView[] r0 = r12.f9336k
                    r0 = r0[r8]
                    r1 = 2131165517(0x7f07014d, float:1.7945253E38)
                    r0.setImageResource(r1)
                    goto L_0x000e
                L_0x0114:
                    com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                    int r1 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    r0 = r0[r1]
                    r0.f7762g = r8
                    android.widget.ImageView[] r0 = r12.f9336k
                    r0 = r0[r8]
                    r1 = 2131165516(0x7f07014c, float:1.7945251E38)
                    r0.setImageResource(r1)
                    goto L_0x000e
                L_0x0128:
                    com.imlabworld.HS_Instructor.bq$c r0 = r12.f9347v
                    com.imlabworld.HS_Instructor.bq r0 = com.imlabworld.HS_Instructor.C2507bq.this
                    long r0 = r0.f9220e
                    com.imlabworld.HS_Instructor.C2465bl.f8805g = r0
                    com.imlabworld.HS_Instructor.bq$c r0 = r12.f9347v
                    com.imlabworld.HS_Instructor.bq r0 = com.imlabworld.HS_Instructor.C2507bq.this
                    com.imlabworld.HS_Instructor.bq$b r0 = r0.f9218c
                    int r1 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    com.imlabworld.HS_Instructor.bq$a r2 = com.imlabworld.HS_Instructor.C2507bq.C2508a.NEXT
                    java.lang.String r3 = ""
                    java.lang.String r4 = ""
                    r0.mo8598a(r1, r2, r3, r4)
                    goto L_0x000e
                L_0x0147:
                    boolean r0 = r12.f9346u
                    if (r0 == 0) goto L_0x0271
                    r12.f9346u = r1
                    android.widget.TextView r0 = r12.f9337l
                    r0.setVisibility(r1)
                    android.widget.ImageView r0 = r12.f9338m
                    r0.setVisibility(r10)
                    android.widget.TextView r0 = r12.f9339n
                    r0.setVisibility(r10)
                    android.widget.ImageView[][] r0 = r12.f9332g
                    r0 = r0[r1]
                    r0 = r0[r9]
                    r0.setVisibility(r1)
                    android.widget.ImageView[][] r0 = r12.f9332g
                    r0 = r0[r1]
                    r0 = r0[r11]
                    r0.setVisibility(r1)
                    android.widget.ImageView[][] r0 = r12.f9333h
                    r0 = r0[r1]
                    r0 = r0[r9]
                    r0.setOnClickListener(r12)
                    android.widget.ImageView[][] r0 = r12.f9333h
                    r0 = r0[r1]
                    r0 = r0[r11]
                    r0.setOnClickListener(r12)
                    com.imlabworld.HS_Instructor.bq$c r0 = r12.f9347v
                    com.imlabworld.HS_Instructor.bq r0 = com.imlabworld.HS_Instructor.C2507bq.this
                    long r2 = r0.f9220e
                    long r4 = com.imlabworld.HS_Instructor.C2465bl.f8806h
                    long r2 = r2 - r4
                    double r2 = (double) r2
                    r4 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
                    double r2 = r2 * r4
                    com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                    int r4 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    r0 = r0[r4]
                    r0.f7763h = r2
                    android.widget.TextView r0 = r12.f9337l
                    java.lang.String r4 = "%.2f%s"
                    java.lang.Object[] r5 = new java.lang.Object[r9]
                    java.lang.Double r6 = java.lang.Double.valueOf(r2)
                    r5[r1] = r6
                    com.imlabworld.a.g r6 = com.imlabworld.HS_Instructor.C2557y.f9835g
                    java.lang.String r6 = r6.f10348dj
                    r5[r8] = r6
                    java.lang.String r4 = java.lang.String.format(r4, r5)
                    r0.setText(r4)
                    com.ssomai.android.scalablelayout.ScalableLayout[][] r0 = r12.f9330e
                    r0 = r0[r1]
                    r0 = r0[r9]
                    r4 = 2131165277(0x7f07005d, float:1.7944767E38)
                    r0.setBackgroundResource(r4)
                    android.widget.ImageView[][] r0 = r12.f9332g
                    r0 = r0[r1]
                    r0 = r0[r9]
                    r4 = 2131165512(0x7f070148, float:1.7945243E38)
                    r0.setImageResource(r4)
                    com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                    int r4 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    r0 = r0[r4]
                    android.util.Pair<java.lang.Boolean, java.lang.Long>[][] r0 = r0.f7759d
                    r0 = r0[r1]
                    android.util.Pair r4 = new android.util.Pair
                    java.lang.Boolean r5 = java.lang.Boolean.valueOf(r8)
                    com.imlabworld.HS_Instructor.bq$c r6 = r12.f9347v
                    com.imlabworld.HS_Instructor.bq r6 = com.imlabworld.HS_Instructor.C2507bq.this
                    long r6 = r6.f9220e
                    java.lang.Long r6 = java.lang.Long.valueOf(r6)
                    r4.<init>(r5, r6)
                    r0[r9] = r4
                    r4 = 4617315517961601024(0x4014000000000000, double:5.0)
                    int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                    if (r0 < 0) goto L_0x023d
                    r4 = 4621819117588971520(0x4024000000000000, double:10.0)
                    int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                    if (r0 >= 0) goto L_0x023d
                    com.ssomai.android.scalablelayout.ScalableLayout[][] r0 = r12.f9330e
                    r0 = r0[r1]
                    r0 = r0[r11]
                    r2 = 2131165277(0x7f07005d, float:1.7944767E38)
                    r0.setBackgroundResource(r2)
                    android.widget.ImageView[][] r0 = r12.f9332g
                    r0 = r0[r1]
                    r0 = r0[r11]
                    r2 = 2131165512(0x7f070148, float:1.7945243E38)
                    r0.setImageResource(r2)
                    com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                    int r2 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    r0 = r0[r2]
                    android.util.Pair<java.lang.Boolean, java.lang.Long>[][] r0 = r0.f7759d
                    r0 = r0[r1]
                    android.util.Pair r1 = new android.util.Pair
                    java.lang.Boolean r2 = java.lang.Boolean.valueOf(r8)
                    com.imlabworld.HS_Instructor.bq$c r3 = r12.f9347v
                    com.imlabworld.HS_Instructor.bq r3 = com.imlabworld.HS_Instructor.C2507bq.this
                    long r4 = r3.f9220e
                    java.lang.Long r3 = java.lang.Long.valueOf(r4)
                    r1.<init>(r2, r3)
                    r0[r11] = r1
                L_0x0231:
                    com.imlabworld.HS_Instructor.bq$c r0 = r12.f9347v
                    com.imlabworld.HS_Instructor.bq r0 = com.imlabworld.HS_Instructor.C2507bq.this
                    long r0 = r0.f9220e
                    com.imlabworld.HS_Instructor.C2465bl.f8807i = r0
                    goto L_0x000e
                L_0x023d:
                    com.ssomai.android.scalablelayout.ScalableLayout[][] r0 = r12.f9330e
                    r0 = r0[r1]
                    r0 = r0[r11]
                    r2 = 2131165280(0x7f070060, float:1.7944773E38)
                    r0.setBackgroundResource(r2)
                    android.widget.ImageView[][] r0 = r12.f9332g
                    r0 = r0[r1]
                    r0 = r0[r11]
                    r2 = 2131165531(0x7f07015b, float:1.7945282E38)
                    r0.setImageResource(r2)
                    com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                    int r2 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    r0 = r0[r2]
                    android.util.Pair<java.lang.Boolean, java.lang.Long>[][] r0 = r0.f7759d
                    r0 = r0[r1]
                    android.util.Pair r2 = new android.util.Pair
                    java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                    r4 = 0
                    java.lang.Long r3 = java.lang.Long.valueOf(r4)
                    r2.<init>(r1, r3)
                    r0[r11] = r2
                    goto L_0x0231
                L_0x0271:
                    r12.f9346u = r8
                    com.imlabworld.HS_Instructor.bq$c r0 = r12.f9347v
                    com.imlabworld.HS_Instructor.bq r0 = com.imlabworld.HS_Instructor.C2507bq.this
                    long r0 = r0.f9220e
                    com.imlabworld.HS_Instructor.C2465bl.f8806h = r0
                    android.widget.TextView r0 = r12.f9339n
                    com.imlabworld.a.g r1 = com.imlabworld.HS_Instructor.C2557y.f9835g
                    java.lang.String r1 = r1.f10204ay
                    r0.setText(r1)
                    goto L_0x000e
                L_0x0288:
                    long[] r0 = com.imlabworld.HS_Instructor.C2465bl.f8808j
                    com.imlabworld.HS_Instructor.bq$c r2 = r12.f9347v
                    com.imlabworld.HS_Instructor.bq r2 = com.imlabworld.HS_Instructor.C2507bq.this
                    long r2 = r2.f9220e
                    r0[r1] = r2
                    boolean[] r0 = r12.f9343r
                    r0[r1] = r8
                    android.widget.ImageView[] r0 = r12.f9341p
                    r2 = 5
                    r0 = r0[r2]
                    r0.setVisibility(r10)
                    android.widget.TextView[] r0 = r12.f9342q
                    r2 = 5
                    r0 = r0[r2]
                    r0.setVisibility(r10)
                    android.widget.ImageView[] r0 = r12.f9341p
                    r0 = r0[r1]
                    r0.setVisibility(r1)
                    android.widget.TextView[] r0 = r12.f9342q
                    r0 = r0[r1]
                    r0.setVisibility(r1)
                    goto L_0x000e
                L_0x02b8:
                    long[] r0 = com.imlabworld.HS_Instructor.C2465bl.f8808j
                    com.imlabworld.HS_Instructor.bq$c r2 = r12.f9347v
                    com.imlabworld.HS_Instructor.bq r2 = com.imlabworld.HS_Instructor.C2507bq.this
                    long r2 = r2.f9220e
                    r0[r8] = r2
                    boolean[] r0 = r12.f9343r
                    r0[r1] = r1
                    boolean[] r0 = r12.f9343r
                    r0[r8] = r8
                    android.widget.ImageView[] r0 = r12.f9341p
                    r0 = r0[r1]
                    r0.setVisibility(r10)
                    android.widget.TextView[] r0 = r12.f9342q
                    r0 = r0[r1]
                    r0.setVisibility(r10)
                    android.widget.ImageView[] r0 = r12.f9341p
                    r0 = r0[r8]
                    r0.setVisibility(r1)
                    android.widget.TextView[] r0 = r12.f9342q
                    r0 = r0[r8]
                    r0.setVisibility(r1)
                    android.widget.ImageView[][] r0 = r12.f9332g
                    r0 = r0[r8]
                    r0 = r0[r1]
                    r0.setVisibility(r1)
                    long[] r0 = com.imlabworld.HS_Instructor.C2465bl.f8808j
                    r2 = r0[r8]
                    long[] r0 = com.imlabworld.HS_Instructor.C2465bl.f8808j
                    r4 = r0[r1]
                    long r2 = r2 - r4
                    double r2 = (double) r2
                    r4 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
                    double r2 = r2 * r4
                    com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                    int r4 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    r0 = r0[r4]
                    r0.f7764i = r2
                    r4 = 4624633867356078080(0x402e000000000000, double:15.0)
                    int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                    if (r0 < 0) goto L_0x034c
                    r4 = 4625759767262920704(0x4032000000000000, double:18.0)
                    int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                    if (r0 > 0) goto L_0x034c
                    com.ssomai.android.scalablelayout.ScalableLayout[][] r0 = r12.f9330e
                    r0 = r0[r8]
                    r0 = r0[r1]
                    r2 = 2131165277(0x7f07005d, float:1.7944767E38)
                    r0.setBackgroundResource(r2)
                    android.widget.ImageView[][] r0 = r12.f9332g
                    r0 = r0[r8]
                    r0 = r0[r1]
                    r2 = 2131165512(0x7f070148, float:1.7945243E38)
                    r0.setImageResource(r2)
                    com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                    int r2 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    r0 = r0[r2]
                    android.util.Pair<java.lang.Boolean, java.lang.Long>[][] r0 = r0.f7759d
                    r0 = r0[r8]
                    android.util.Pair r2 = new android.util.Pair
                    java.lang.Boolean r3 = java.lang.Boolean.valueOf(r8)
                    long[] r4 = com.imlabworld.HS_Instructor.C2465bl.f8808j
                    r4 = r4[r8]
                    java.lang.Long r4 = java.lang.Long.valueOf(r4)
                    r2.<init>(r3, r4)
                    r0[r1] = r2
                    goto L_0x000e
                L_0x034c:
                    com.ssomai.android.scalablelayout.ScalableLayout[][] r0 = r12.f9330e
                    r0 = r0[r8]
                    r0 = r0[r1]
                    r2 = 2131165280(0x7f070060, float:1.7944773E38)
                    r0.setBackgroundResource(r2)
                    android.widget.ImageView[][] r0 = r12.f9332g
                    r0 = r0[r8]
                    r0 = r0[r1]
                    r2 = 2131165531(0x7f07015b, float:1.7945282E38)
                    r0.setImageResource(r2)
                    com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                    int r2 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    r0 = r0[r2]
                    android.util.Pair<java.lang.Boolean, java.lang.Long>[][] r0 = r0.f7759d
                    r0 = r0[r8]
                    android.util.Pair r2 = new android.util.Pair
                    java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
                    r4 = 0
                    java.lang.Long r4 = java.lang.Long.valueOf(r4)
                    r2.<init>(r3, r4)
                    r0[r1] = r2
                    goto L_0x000e
                L_0x0381:
                    long[] r0 = com.imlabworld.HS_Instructor.C2465bl.f8808j
                    com.imlabworld.HS_Instructor.bq$c r2 = r12.f9347v
                    com.imlabworld.HS_Instructor.bq r2 = com.imlabworld.HS_Instructor.C2507bq.this
                    long r2 = r2.f9220e
                    r0[r9] = r2
                    boolean[] r0 = r12.f9343r
                    r0[r8] = r1
                    boolean[] r0 = r12.f9343r
                    r0[r9] = r8
                    android.widget.ImageView[] r0 = r12.f9341p
                    r0 = r0[r8]
                    r0.setVisibility(r10)
                    android.widget.TextView[] r0 = r12.f9342q
                    r0 = r0[r8]
                    r0.setVisibility(r10)
                    android.widget.ImageView[] r0 = r12.f9341p
                    r0 = r0[r9]
                    r0.setVisibility(r1)
                    android.widget.TextView[] r0 = r12.f9342q
                    r0 = r0[r9]
                    r0.setVisibility(r1)
                    android.widget.ImageView[][] r0 = r12.f9332g
                    r0 = r0[r8]
                    r0 = r0[r8]
                    r0.setVisibility(r1)
                    long[] r0 = com.imlabworld.HS_Instructor.C2465bl.f8808j
                    r2 = r0[r9]
                    long[] r0 = com.imlabworld.HS_Instructor.C2465bl.f8808j
                    r4 = r0[r8]
                    long r2 = r2 - r4
                    double r2 = (double) r2
                    r4 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
                    double r2 = r2 * r4
                    com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                    int r4 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    r0 = r0[r4]
                    r0.f7765j = r2
                    com.ssomai.android.scalablelayout.ScalableLayout[][] r0 = r12.f9330e
                    r0 = r0[r8]
                    r0 = r0[r8]
                    r4 = 2131165277(0x7f07005d, float:1.7944767E38)
                    r0.setBackgroundResource(r4)
                    android.widget.ImageView[][] r0 = r12.f9332g
                    r0 = r0[r8]
                    r0 = r0[r8]
                    r4 = 2131165512(0x7f070148, float:1.7945243E38)
                    r0.setImageResource(r4)
                    com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                    int r4 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    r0 = r0[r4]
                    android.util.Pair<java.lang.Boolean, java.lang.Long>[][] r0 = r0.f7759d
                    r0 = r0[r8]
                    android.util.Pair r4 = new android.util.Pair
                    java.lang.Boolean r5 = java.lang.Boolean.valueOf(r8)
                    long[] r6 = com.imlabworld.HS_Instructor.C2465bl.f8808j
                    r6 = r6[r9]
                    java.lang.Long r6 = java.lang.Long.valueOf(r6)
                    r4.<init>(r5, r6)
                    r0[r8] = r4
                    r4 = 4621819117588971520(0x4024000000000000, double:10.0)
                    int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                    if (r0 > 0) goto L_0x0444
                    com.ssomai.android.scalablelayout.ScalableLayout[][] r0 = r12.f9330e
                    r0 = r0[r8]
                    r0 = r0[r10]
                    r1 = 2131165277(0x7f07005d, float:1.7944767E38)
                    r0.setBackgroundResource(r1)
                    android.widget.ImageView[][] r0 = r12.f9332g
                    r0 = r0[r8]
                    r0 = r0[r10]
                    r1 = 2131165512(0x7f070148, float:1.7945243E38)
                    r0.setImageResource(r1)
                    com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                    int r1 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    r0 = r0[r1]
                    android.util.Pair<java.lang.Boolean, java.lang.Long>[][] r0 = r0.f7759d
                    r0 = r0[r8]
                    android.util.Pair r1 = new android.util.Pair
                    java.lang.Boolean r2 = java.lang.Boolean.valueOf(r8)
                    long[] r3 = com.imlabworld.HS_Instructor.C2465bl.f8808j
                    r4 = r3[r9]
                    java.lang.Long r3 = java.lang.Long.valueOf(r4)
                    r1.<init>(r2, r3)
                    r0[r10] = r1
                    goto L_0x000e
                L_0x0444:
                    com.ssomai.android.scalablelayout.ScalableLayout[][] r0 = r12.f9330e
                    r0 = r0[r8]
                    r0 = r0[r10]
                    r2 = 2131165280(0x7f070060, float:1.7944773E38)
                    r0.setBackgroundResource(r2)
                    android.widget.ImageView[][] r0 = r12.f9332g
                    r0 = r0[r8]
                    r0 = r0[r10]
                    r2 = 2131165531(0x7f07015b, float:1.7945282E38)
                    r0.setImageResource(r2)
                    com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                    int r2 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    r0 = r0[r2]
                    android.util.Pair<java.lang.Boolean, java.lang.Long>[][] r0 = r0.f7759d
                    r0 = r0[r8]
                    android.util.Pair r2 = new android.util.Pair
                    java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                    r4 = 0
                    java.lang.Long r3 = java.lang.Long.valueOf(r4)
                    r2.<init>(r1, r3)
                    r0[r10] = r2
                    goto L_0x000e
                L_0x0479:
                    long[] r0 = com.imlabworld.HS_Instructor.C2465bl.f8808j
                    com.imlabworld.HS_Instructor.bq$c r2 = r12.f9347v
                    com.imlabworld.HS_Instructor.bq r2 = com.imlabworld.HS_Instructor.C2507bq.this
                    long r2 = r2.f9220e
                    r0[r11] = r2
                    boolean[] r0 = r12.f9343r
                    r0[r9] = r1
                    boolean[] r0 = r12.f9343r
                    r0[r11] = r8
                    android.widget.ImageView[] r0 = r12.f9341p
                    r0 = r0[r9]
                    r0.setVisibility(r10)
                    android.widget.TextView[] r0 = r12.f9342q
                    r0 = r0[r9]
                    r0.setVisibility(r10)
                    android.widget.ImageView[] r0 = r12.f9341p
                    r0 = r0[r11]
                    r0.setVisibility(r1)
                    android.widget.TextView[] r0 = r12.f9342q
                    r0 = r0[r11]
                    r0.setVisibility(r1)
                    android.widget.ImageView[][] r0 = r12.f9332g
                    r0 = r0[r8]
                    r0 = r0[r9]
                    r0.setVisibility(r1)
                    long[] r0 = com.imlabworld.HS_Instructor.C2465bl.f8808j
                    r2 = r0[r11]
                    long[] r0 = com.imlabworld.HS_Instructor.C2465bl.f8808j
                    r4 = r0[r9]
                    long r2 = r2 - r4
                    double r2 = (double) r2
                    r4 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
                    double r2 = r2 * r4
                    com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                    int r4 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    r0 = r0[r4]
                    r0.f7766k = r2
                    r4 = 4624633867356078080(0x402e000000000000, double:15.0)
                    int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                    if (r0 < 0) goto L_0x050d
                    r4 = 4625759767262920704(0x4032000000000000, double:18.0)
                    int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                    if (r0 > 0) goto L_0x050d
                    com.ssomai.android.scalablelayout.ScalableLayout[][] r0 = r12.f9330e
                    r0 = r0[r8]
                    r0 = r0[r9]
                    r1 = 2131165277(0x7f07005d, float:1.7944767E38)
                    r0.setBackgroundResource(r1)
                    android.widget.ImageView[][] r0 = r12.f9332g
                    r0 = r0[r8]
                    r0 = r0[r9]
                    r1 = 2131165512(0x7f070148, float:1.7945243E38)
                    r0.setImageResource(r1)
                    com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                    int r1 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    r0 = r0[r1]
                    android.util.Pair<java.lang.Boolean, java.lang.Long>[][] r0 = r0.f7759d
                    r0 = r0[r8]
                    android.util.Pair r1 = new android.util.Pair
                    java.lang.Boolean r2 = java.lang.Boolean.valueOf(r8)
                    long[] r3 = com.imlabworld.HS_Instructor.C2465bl.f8808j
                    r4 = r3[r11]
                    java.lang.Long r3 = java.lang.Long.valueOf(r4)
                    r1.<init>(r2, r3)
                    r0[r9] = r1
                    goto L_0x000e
                L_0x050d:
                    com.ssomai.android.scalablelayout.ScalableLayout[][] r0 = r12.f9330e
                    r0 = r0[r8]
                    r0 = r0[r9]
                    r2 = 2131165280(0x7f070060, float:1.7944773E38)
                    r0.setBackgroundResource(r2)
                    android.widget.ImageView[][] r0 = r12.f9332g
                    r0 = r0[r8]
                    r0 = r0[r9]
                    r2 = 2131165531(0x7f07015b, float:1.7945282E38)
                    r0.setImageResource(r2)
                    com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                    int r2 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    r0 = r0[r2]
                    android.util.Pair<java.lang.Boolean, java.lang.Long>[][] r0 = r0.f7759d
                    r0 = r0[r8]
                    android.util.Pair r2 = new android.util.Pair
                    java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                    r4 = 0
                    java.lang.Long r3 = java.lang.Long.valueOf(r4)
                    r2.<init>(r1, r3)
                    r0[r9] = r2
                    goto L_0x000e
                L_0x0542:
                    boolean[] r0 = r12.f9343r
                    r0[r11] = r1
                    android.widget.ImageView[] r0 = r12.f9341p
                    r0 = r0[r11]
                    r0.setVisibility(r10)
                    android.widget.TextView[] r0 = r12.f9342q
                    r0 = r0[r11]
                    r0.setVisibility(r10)
                    android.widget.ImageView[][] r0 = r12.f9332g
                    r0 = r0[r8]
                    r0 = r0[r11]
                    r0.setVisibility(r1)
                    com.imlabworld.HS_Instructor.bq$c r0 = r12.f9347v
                    com.imlabworld.HS_Instructor.bq r0 = com.imlabworld.HS_Instructor.C2507bq.this
                    long r0 = r0.f9220e
                    long[] r2 = com.imlabworld.HS_Instructor.C2465bl.f8808j
                    r2 = r2[r11]
                    long r0 = r0 - r2
                    double r0 = (double) r0
                    r2 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
                    double r0 = r0 * r2
                    com.imlabworld.HS_Instructor.ac[] r2 = com.imlabworld.HS_Instructor.C2556x.f9806w
                    int r3 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    r2 = r2[r3]
                    r2.f7767l = r0
                    com.ssomai.android.scalablelayout.ScalableLayout[][] r0 = r12.f9330e
                    r0 = r0[r8]
                    r0 = r0[r11]
                    r1 = 2131165277(0x7f07005d, float:1.7944767E38)
                    r0.setBackgroundResource(r1)
                    android.widget.ImageView[][] r0 = r12.f9332g
                    r0 = r0[r8]
                    r0 = r0[r11]
                    r1 = 2131165512(0x7f070148, float:1.7945243E38)
                    r0.setImageResource(r1)
                    com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                    int r1 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    r0 = r0[r1]
                    android.util.Pair<java.lang.Boolean, java.lang.Long>[][] r0 = r0.f7759d
                    r0 = r0[r8]
                    android.util.Pair r1 = new android.util.Pair
                    java.lang.Boolean r2 = java.lang.Boolean.valueOf(r8)
                    com.imlabworld.HS_Instructor.bq$c r3 = r12.f9347v
                    com.imlabworld.HS_Instructor.bq r3 = com.imlabworld.HS_Instructor.C2507bq.this
                    long r4 = r3.f9220e
                    java.lang.Long r3 = java.lang.Long.valueOf(r4)
                    r1.<init>(r2, r3)
                    r0[r11] = r1
                    goto L_0x000e
                L_0x05b4:
                    boolean[] r0 = r12.f9343r
                    boolean r0 = r0[r10]
                    if (r0 != 0) goto L_0x05d7
                    long[] r0 = com.imlabworld.HS_Instructor.C2465bl.f8808j
                    com.imlabworld.HS_Instructor.bq$c r1 = r12.f9347v
                    com.imlabworld.HS_Instructor.bq r1 = com.imlabworld.HS_Instructor.C2507bq.this
                    long r2 = r1.f9220e
                    r0[r10] = r2
                    boolean[] r0 = r12.f9343r
                    r0[r10] = r8
                    android.widget.TextView[] r0 = r12.f9342q
                    r0 = r0[r10]
                    com.imlabworld.a.g r1 = com.imlabworld.HS_Instructor.C2557y.f9835g
                    java.lang.String r1 = r1.f10538hN
                    r0.setText(r1)
                    goto L_0x000e
                L_0x05d7:
                    boolean[] r0 = r12.f9343r
                    r0[r10] = r1
                    android.widget.ImageView[] r0 = r12.f9341p
                    r0 = r0[r10]
                    r0.setVisibility(r10)
                    android.widget.TextView[] r0 = r12.f9342q
                    r0 = r0[r10]
                    r0.setVisibility(r10)
                    android.widget.ImageView[][] r0 = r12.f9332g
                    r0 = r0[r9]
                    r0 = r0[r1]
                    r0.setVisibility(r1)
                    com.imlabworld.HS_Instructor.bq$c r0 = r12.f9347v
                    com.imlabworld.HS_Instructor.bq r0 = com.imlabworld.HS_Instructor.C2507bq.this
                    long r2 = r0.f9220e
                    long[] r0 = com.imlabworld.HS_Instructor.C2465bl.f8808j
                    r4 = r0[r10]
                    long r2 = r2 - r4
                    double r2 = (double) r2
                    r4 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
                    double r2 = r2 * r4
                    com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                    int r4 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    r0 = r0[r4]
                    r0.f7768m = r2
                    r4 = 4620130267728707584(0x401e000000000000, double:7.5)
                    int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                    if (r0 < 0) goto L_0x0655
                    r4 = 4621256167635550208(0x4022000000000000, double:9.0)
                    int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                    if (r0 > 0) goto L_0x0655
                    com.ssomai.android.scalablelayout.ScalableLayout[][] r0 = r12.f9330e
                    r0 = r0[r9]
                    r0 = r0[r1]
                    r2 = 2131165277(0x7f07005d, float:1.7944767E38)
                    r0.setBackgroundResource(r2)
                    android.widget.ImageView[][] r0 = r12.f9332g
                    r0 = r0[r9]
                    r0 = r0[r1]
                    r2 = 2131165512(0x7f070148, float:1.7945243E38)
                    r0.setImageResource(r2)
                    com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                    int r2 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    r0 = r0[r2]
                    android.util.Pair<java.lang.Boolean, java.lang.Long>[][] r0 = r0.f7759d
                    r0 = r0[r9]
                    android.util.Pair r2 = new android.util.Pair
                    java.lang.Boolean r3 = java.lang.Boolean.valueOf(r8)
                    com.imlabworld.HS_Instructor.bq$c r4 = r12.f9347v
                    com.imlabworld.HS_Instructor.bq r4 = com.imlabworld.HS_Instructor.C2507bq.this
                    long r4 = r4.f9220e
                    java.lang.Long r4 = java.lang.Long.valueOf(r4)
                    r2.<init>(r3, r4)
                    r0[r1] = r2
                    goto L_0x000e
                L_0x0655:
                    com.ssomai.android.scalablelayout.ScalableLayout[][] r0 = r12.f9330e
                    r0 = r0[r9]
                    r0 = r0[r1]
                    r2 = 2131165280(0x7f070060, float:1.7944773E38)
                    r0.setBackgroundResource(r2)
                    android.widget.ImageView[][] r0 = r12.f9332g
                    r0 = r0[r9]
                    r0 = r0[r1]
                    r2 = 2131165531(0x7f07015b, float:1.7945282E38)
                    r0.setImageResource(r2)
                    com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                    int r2 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    r0 = r0[r2]
                    android.util.Pair<java.lang.Boolean, java.lang.Long>[][] r0 = r0.f7759d
                    r0 = r0[r9]
                    android.util.Pair r2 = new android.util.Pair
                    java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
                    r4 = 0
                    java.lang.Long r4 = java.lang.Long.valueOf(r4)
                    r2.<init>(r3, r4)
                    r0[r1] = r2
                    goto L_0x000e
                */
                throw new UnsupportedOperationException("Method not decompiled: com.imlabworld.HS_Instructor.C2507bq.C2510c.C2513c.onClick(android.view.View):void");
            }
        }

        /* renamed from: com.imlabworld.HS_Instructor.bq$c$d */
        class C2514d implements View.OnClickListener {

            /* renamed from: a */
            final ScrollView f9348a;

            /* renamed from: b */
            final ScalableLayout f9349b;

            /* renamed from: c */
            final ScalableLayout[] f9350c = new ScalableLayout[3];

            /* renamed from: d */
            final TextView[] f9351d = new TextView[2];

            /* renamed from: e */
            final ScalableLayout[][] f9352e = ((ScalableLayout[][]) Array.newInstance(ScalableLayout.class, new int[]{2, 6}));

            /* renamed from: f */
            final TextView[][] f9353f = ((TextView[][]) Array.newInstance(TextView.class, new int[]{2, 6}));

            /* renamed from: g */
            final ImageView[][] f9354g = ((ImageView[][]) Array.newInstance(ImageView.class, new int[]{2, 6}));

            /* renamed from: h */
            final ImageView[][] f9355h = ((ImageView[][]) Array.newInstance(ImageView.class, new int[]{2, 6}));

            /* renamed from: i */
            final TextView f9356i;

            /* renamed from: j */
            final TextView[] f9357j = new TextView[2];

            /* renamed from: k */
            final ImageView[] f9358k = new ImageView[2];

            /* renamed from: l */
            final TextView f9359l;

            /* renamed from: m */
            final ImageView f9360m;

            /* renamed from: n */
            final TextView f9361n;

            /* renamed from: o */
            final TextView[] f9362o = new TextView[6];

            /* renamed from: p */
            final ImageView[] f9363p = new ImageView[7];

            /* renamed from: q */
            final TextView[] f9364q = new TextView[7];

            /* renamed from: r */
            final boolean[] f9365r = new boolean[6];

            /* renamed from: s */
            final TextView f9366s;

            /* renamed from: t */
            final int[] f9367t = new int[2];

            /* renamed from: u */
            boolean f9368u;

            /* renamed from: v */
            final /* synthetic */ C2510c f9369v;

            public C2514d(C2510c cVar, View view) {
                this.f9369v = cVar;
                this.f9348a = (ScrollView) view.findViewById(C2656R.C2657id.test_sheet_infant_lay_scroll);
                this.f9349b = (ScalableLayout) view.findViewById(C2656R.C2657id.test_sheet_infant_lay_scroll_sc);
                this.f9350c[0] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_sheet_infant_lay_part1_sc);
                this.f9350c[1] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_sheet_infant_lay_part2_sc);
                this.f9350c[2] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_sheet_infant_lay_part3_sc);
                this.f9351d[0] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_infant_lay_g1_txt);
                this.f9351d[1] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_infant_lay_g2_txt);
                this.f9352e[0][0] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_sheet_infant_lay_g1q1_sc);
                this.f9352e[0][1] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_sheet_infant_lay_g1q2_sc);
                this.f9352e[0][2] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_sheet_infant_lay_g1q3_sc);
                this.f9352e[0][3] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_sheet_infant_lay_g1q4_sc);
                this.f9352e[0][4] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_sheet_infant_lay_g1q5_sc);
                this.f9352e[1][0] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_sheet_infant_lay_g2q1_sc);
                this.f9352e[1][1] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_sheet_infant_lay_g2q2_sc);
                this.f9352e[1][2] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_sheet_infant_lay_g2q3_sc);
                this.f9352e[1][3] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_sheet_infant_lay_g2q4_sc);
                this.f9352e[1][4] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_sheet_infant_lay_g2q5_sc);
                this.f9352e[1][5] = (ScalableLayout) view.findViewById(C2656R.C2657id.test_sheet_infant_lay_g2q6_sc);
                this.f9353f[0][0] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_infant_lay_g1q1_txt);
                this.f9353f[0][1] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_infant_lay_g1q2_txt);
                this.f9353f[0][2] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_infant_lay_g1q3_txt);
                this.f9353f[0][3] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_infant_lay_g1q4_txt);
                this.f9353f[0][4] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_infant_lay_g1q5_txt);
                this.f9353f[1][0] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_infant_lay_g2q1_txt);
                this.f9353f[1][1] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_infant_lay_g2q2_txt);
                this.f9353f[1][2] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_infant_lay_g2q3_txt);
                this.f9353f[1][3] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_infant_lay_g2q4_txt);
                this.f9353f[1][4] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_infant_lay_g2q5_txt);
                this.f9353f[1][5] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_infant_lay_g2q6_txt);
                this.f9354g[0][0] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_infant_lay_g1q1_btn);
                this.f9354g[0][1] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_infant_lay_g1q2_btn);
                this.f9354g[0][2] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_infant_lay_g1q3_btn);
                this.f9354g[0][3] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_infant_lay_g1q4_btn);
                this.f9354g[0][4] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_infant_lay_g1q5_btn);
                this.f9354g[1][0] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_infant_lay_g2q1_btn);
                this.f9354g[1][1] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_infant_lay_g2q2_btn);
                this.f9354g[1][2] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_infant_lay_g2q3_btn);
                this.f9354g[1][3] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_infant_lay_g2q4_btn);
                this.f9354g[1][4] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_infant_lay_g2q5_btn);
                this.f9354g[1][5] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_infant_lay_g2q6_btn);
                this.f9355h[0][0] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_infant_lay_g1q1_click_btn);
                this.f9355h[0][1] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_infant_lay_g1q2_click_btn);
                this.f9355h[0][2] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_infant_lay_g1q3_click_btn);
                this.f9355h[0][3] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_infant_lay_g1q4_click_btn);
                this.f9355h[0][4] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_infant_lay_g1q5_click_btn);
                this.f9355h[1][0] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_infant_lay_g2q1_click_btn);
                this.f9355h[1][1] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_infant_lay_g2q2_click_btn);
                this.f9355h[1][2] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_infant_lay_g2q3_click_btn);
                this.f9355h[1][3] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_infant_lay_g2q4_click_btn);
                this.f9355h[1][4] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_infant_lay_g2q5_click_btn);
                this.f9355h[1][5] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_infant_lay_g2q6_click_btn);
                this.f9356i = (TextView) view.findViewById(C2656R.C2657id.test_sheet_infant_lay_mibi_txt);
                this.f9357j[0] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_infant_lay_mibi1_txt);
                this.f9357j[1] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_infant_lay_mibi2_txt);
                this.f9358k[0] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_infant_lay_mibi1_btn);
                this.f9358k[1] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_infant_lay_mibi2_btn);
                this.f9359l = (TextView) view.findViewById(C2656R.C2657id.test_sheet_infant_lay_g1q3_timer_value_txt);
                this.f9360m = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_infant_lay_g1q3_timer_btn);
                this.f9361n = (TextView) view.findViewById(C2656R.C2657id.test_sheet_infant_lay_g1q3_timer_btn_txt);
                this.f9362o[0] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_infant_lay_g2q1_timer_value_txt);
                this.f9362o[1] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_infant_lay_g2q2_timer_value_txt);
                this.f9362o[2] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_infant_lay_g2q3_timer_value_txt);
                this.f9362o[3] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_infant_lay_g2q4_timer_value_txt);
                this.f9362o[4] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_infant_lay_g2q5_timer_value_txt);
                this.f9362o[5] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_infant_lay_g2q6_timer_value_txt);
                this.f9363p[0] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_infant_lay_g2q1_timer_btn);
                this.f9363p[1] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_infant_lay_g2q2_timer_btn);
                this.f9363p[2] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_infant_lay_g2q3_timer_btn);
                this.f9363p[3] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_infant_lay_g2q4_timer_btn);
                this.f9363p[4] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_infant_lay_g2q5_timer_btn);
                this.f9363p[5] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_infant_lay_g2q6_timer_btn);
                this.f9363p[6] = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_infant_lay_g2q0_timer_btn);
                this.f9364q[0] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_infant_lay_g2q1_timer_btn_txt);
                this.f9364q[1] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_infant_lay_g2q2_timer_btn_txt);
                this.f9364q[2] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_infant_lay_g2q3_timer_btn_txt);
                this.f9364q[3] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_infant_lay_g2q4_timer_btn_txt);
                this.f9364q[4] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_infant_lay_g2q5_timer_btn_txt);
                this.f9364q[5] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_infant_lay_g2q6_timer_btn_txt);
                this.f9364q[6] = (TextView) view.findViewById(C2656R.C2657id.test_sheet_infant_lay_g2q0_timer_btn_txt);
                this.f9366s = (TextView) view.findViewById(C2656R.C2657id.test_sheet_infant_lay_next_btn);
                this.f9367t[0] = 5;
                this.f9367t[1] = 6;
                for (int i = 0; i < this.f9367t.length; i++) {
                    for (int i2 = 0; i2 < this.f9367t[i]; i2++) {
                        this.f9355h[i][i2].setOnClickListener(this);
                    }
                }
                this.f9358k[0].setOnClickListener(this);
                this.f9358k[1].setOnClickListener(this);
                for (int i3 = 0; i3 < 6; i3++) {
                    this.f9363p[i3].setOnClickListener(this);
                }
                for (int i4 = 0; i4 < 7; i4++) {
                    this.f9363p[i4].setOnClickListener(this);
                }
                this.f9366s.setOnClickListener(this);
                this.f9360m.setOnClickListener(this);
            }

            /* renamed from: a */
            public void mo9255a() {
                C2552t b = C2465bl.f8801c.get(0).mo9310b();
                C2556x.f9806w[C2465bl.f8800b] = new C2334ac();
                for (int i = 0; i < this.f9367t.length; i++) {
                    for (int i2 = 0; i2 < this.f9367t[i]; i2++) {
                        this.f9352e[i][i2].setBackgroundResource(C2656R.drawable.bg_test_unselected);
                        this.f9354g[i][i2].setImageResource(C2656R.drawable.img_test_uncheck);
                    }
                }
                int[] iArr = {50, 50, 0};
                int[] iArr2 = {750, 1200, 200};
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
                this.f9350c[0].setScaleHeight((float) iArr2[0]);
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    int i5 = i4;
                    int i6 = i3;
                    if (i5 < iArr.length) {
                        int i7 = i6 + iArr[i5];
                        this.f9349b.mo10069b(this.f9350c[i5], 100.0f, (float) i7, 2095.0f, (float) iArr2[i5]);
                        i3 = i7 + iArr2[i5];
                        i4 = i5 + 1;
                    } else {
                        this.f9349b.mo10069b(this.f9359l, 1780.0f, 500.0f, 200.0f, 150.0f);
                        this.f9349b.mo10069b(this.f9360m, 1980.0f, 500.0f, 200.0f, 150.0f);
                        this.f9349b.mo10069b(this.f9361n, 1980.0f, 500.0f, 200.0f, 150.0f);
                        this.f9349b.setScaleHeight((float) i6);
                        C2556x.f9806w[C2465bl.f8800b].f7756a = C2334ac.C2336b.TEST;
                        this.f9351d[0].setText(C2557y.f9835g.f10419fA);
                        this.f9351d[1].setText(C2557y.f9835g.f10149W);
                        this.f9359l.setVisibility(4);
                        this.f9360m.setVisibility(4);
                        this.f9361n.setVisibility(4);
                        this.f9354g[0][2].setVisibility(0);
                        for (int i8 = 0; i8 < 6; i8++) {
                            this.f9363p[i8].setVisibility(4);
                            this.f9364q[i8].setVisibility(4);
                            this.f9362o[i8].setText(String.format("%.2f%s", new Object[]{Float.valueOf(0.0f), C2557y.f9835g.f10348dj}));
                            this.f9365r[i8] = false;
                        }
                        for (int i9 = 0; i9 < 6; i9++) {
                            this.f9354g[1][i9].setVisibility(4);
                        }
                        this.f9363p[6].setVisibility(0);
                        this.f9364q[6].setVisibility(0);
                        this.f9364q[6].setText(C2557y.f9835g.f10536hL);
                        this.f9364q[0].setText(C2557y.f9835g.f10538hN + "\n\n" + C2557y.f9835g.f10537hM);
                        this.f9364q[1].setText(C2557y.f9835g.f10539hO + "\n\n" + C2557y.f9835g.f10536hL);
                        this.f9364q[2].setText(C2557y.f9835g.f10538hN + "\n\n" + C2557y.f9835g.f10537hM);
                        this.f9364q[3].setText(C2557y.f9835g.f10539hO + "\n\n" + C2557y.f9835g.f10536hL);
                        this.f9364q[4].setText(C2557y.f9835g.f10538hN + "\n\n" + C2557y.f9835g.f10537hM);
                        this.f9364q[5].setText(C2557y.f9835g.f10539hO);
                        switch (b.f9755k) {
                            case 1:
                            case 4:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                this.f9353f[0][0].setText(C2557y.f9835g.f10500gc);
                                this.f9353f[0][1].setText(C2557y.f9835g.f10501gd);
                                this.f9353f[0][2].setText(C2557y.f9835g.f10503gf);
                                this.f9359l.setVisibility(0);
                                this.f9360m.setVisibility(0);
                                this.f9361n.setVisibility(0);
                                this.f9354g[0][2].setVisibility(4);
                                this.f9355h[0][2].setOnClickListener((View.OnClickListener) null);
                                this.f9359l.setText(String.format("%.2f%s", new Object[]{Float.valueOf(0.0f), C2557y.f9835g.f10348dj}));
                                this.f9361n.setText(C2557y.f9835g.f10473gB);
                                this.f9368u = false;
                                break;
                            case 2:
                            case 5:
                                this.f9353f[0][0].setText(C2557y.f9835g.f10499gb);
                                this.f9353f[0][1].setText(C2557y.f9835g.f10500gc);
                                this.f9353f[0][2].setText(C2557y.f9835g.f10502ge);
                                this.f9353f[0][3].setText(C2557y.f9835g.f10503gf);
                                this.f9353f[0][4].setText(C2557y.f9835g.f10501gd);
                                break;
                            case 3:
                            case 6:
                                this.f9353f[0][0].setText(C2557y.f9835g.f10499gb);
                                this.f9353f[0][1].setText(C2557y.f9835g.f10500gc);
                                this.f9353f[0][2].setText(C2557y.f9835g.f10501gd);
                                this.f9353f[0][3].setText(C2557y.f9835g.f10502ge);
                                this.f9353f[0][4].setText(C2557y.f9835g.f10503gf);
                                break;
                        }
                        this.f9353f[1][0].setText(C2557y.f9835g.f10141O + "1: " + C2557y.f9835g.f10504gg);
                        this.f9353f[1][1].setText(C2557y.f9835g.f10141O + "1: " + C2557y.f9835g.f10506gi);
                        this.f9353f[1][2].setText(C2557y.f9835g.f10141O + "2: " + C2557y.f9835g.f10508gk);
                        this.f9353f[1][3].setText(C2557y.f9835g.f10141O + "2: " + C2557y.f9835g.f10510gm);
                        this.f9353f[1][4].setText(C2557y.f9835g.f10141O + "3: " + C2557y.f9835g.f10512go);
                        this.f9353f[1][5].setText(C2557y.f9835g.f10141O + "3: " + C2557y.f9835g.f10514gq);
                        this.f9356i.setText(C2557y.f9835g.f10533hI);
                        this.f9357j[0].setText(C2557y.f9835g.f10534hJ);
                        this.f9357j[1].setText(C2557y.f9835g.f10535hK);
                        this.f9358k[0].setImageResource(C2656R.drawable.img_test_mibi_uncheck);
                        this.f9358k[1].setImageResource(C2656R.drawable.img_test_mibi_uncheck);
                        this.f9366s.setText(C2557y.f9835g.f10395ed);
                        this.f9348a.scrollTo(0, 0);
                        return;
                    }
                }
            }

            /* renamed from: a */
            public void mo9256a(long j) {
                if (this.f9368u) {
                    this.f9359l.setText(String.format("%.2f%s", new Object[]{Double.valueOf(((double) (j - C2465bl.f8806h)) * 0.001d), C2557y.f9835g.f10348dj}));
                }
            }

            /* renamed from: b */
            public void mo9257b() {
                this.f9348a.setVisibility(0);
            }

            /* renamed from: b */
            public void mo9258b(long j) {
                for (int i = 0; i < 6; i++) {
                    if (this.f9365r[i]) {
                        this.f9362o[i].setText(String.format("%.2f%s", new Object[]{Double.valueOf(((double) (j - C2465bl.f8808j[i])) * 0.001d), C2557y.f9835g.f10348dj}));
                        return;
                    }
                }
            }

            /* renamed from: c */
            public void mo9259c() {
                this.f9348a.setVisibility(4);
            }

            /* JADX WARNING: Removed duplicated region for block: B:15:0x0045  */
            /* JADX WARNING: Removed duplicated region for block: B:18:0x007f  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onClick(android.view.View r11) {
                /*
                    r10 = this;
                    r9 = 3
                    r8 = 2
                    r6 = 4
                    r1 = 0
                    r7 = 1
                    int r5 = r11.getId()
                    r2 = -1
                    r0 = -1
                    switch(r5) {
                        case 2131232768: goto L_0x000f;
                        case 2131232772: goto L_0x000f;
                        case 2131232776: goto L_0x000f;
                        case 2131232778: goto L_0x0147;
                        case 2131232783: goto L_0x000f;
                        case 2131232787: goto L_0x000f;
                        case 2131232791: goto L_0x01fd;
                        case 2131232794: goto L_0x000f;
                        case 2131232796: goto L_0x022d;
                        case 2131232801: goto L_0x000f;
                        case 2131232803: goto L_0x02f6;
                        case 2131232808: goto L_0x000f;
                        case 2131232810: goto L_0x037e;
                        case 2131232815: goto L_0x000f;
                        case 2131232817: goto L_0x0447;
                        case 2131232822: goto L_0x000f;
                        case 2131232824: goto L_0x04cf;
                        case 2131232829: goto L_0x000f;
                        case 2131232831: goto L_0x059e;
                        case 2131232835: goto L_0x00c4;
                        case 2131232837: goto L_0x00f6;
                        case 2131232841: goto L_0x0128;
                        default: goto L_0x000e;
                    }
                L_0x000e:
                    return
                L_0x000f:
                    r3 = r2
                    r2 = r0
                    r0 = r1
                L_0x0012:
                    int[] r4 = r10.f9367t
                    int r4 = r4.length
                    if (r0 >= r4) goto L_0x002f
                    r4 = r1
                L_0x0018:
                    int[] r6 = r10.f9367t
                    r6 = r6[r0]
                    if (r4 >= r6) goto L_0x002c
                    android.widget.ImageView[][] r6 = r10.f9355h
                    r6 = r6[r0]
                    r6 = r6[r4]
                    int r6 = r6.getId()
                    if (r6 != r5) goto L_0x0079
                    r2 = r4
                    r3 = r0
                L_0x002c:
                    r4 = -1
                    if (r3 == r4) goto L_0x007c
                L_0x002f:
                    com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                    int r4 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    r0 = r0[r4]
                    android.util.Pair<java.lang.Boolean, java.lang.Long>[][] r0 = r0.f7760e
                    r0 = r0[r3]
                    r0 = r0[r2]
                    java.lang.Object r0 = r0.first
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    if (r0 == 0) goto L_0x007f
                    com.ssomai.android.scalablelayout.ScalableLayout[][] r0 = r10.f9352e
                    r0 = r0[r3]
                    r0 = r0[r2]
                    r4 = 2131165280(0x7f070060, float:1.7944773E38)
                    r0.setBackgroundResource(r4)
                    android.widget.ImageView[][] r0 = r10.f9354g
                    r0 = r0[r3]
                    r0 = r0[r2]
                    r4 = 2131165531(0x7f07015b, float:1.7945282E38)
                    r0.setImageResource(r4)
                    com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                    int r4 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    r0 = r0[r4]
                    android.util.Pair<java.lang.Boolean, java.lang.Long>[][] r0 = r0.f7760e
                    r0 = r0[r3]
                    android.util.Pair r3 = new android.util.Pair
                    java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                    r4 = 0
                    java.lang.Long r4 = java.lang.Long.valueOf(r4)
                    r3.<init>(r1, r4)
                    r0[r2] = r3
                    goto L_0x000e
                L_0x0079:
                    int r4 = r4 + 1
                    goto L_0x0018
                L_0x007c:
                    int r0 = r0 + 1
                    goto L_0x0012
                L_0x007f:
                    com.ssomai.android.scalablelayout.ScalableLayout[][] r0 = r10.f9352e
                    r0 = r0[r3]
                    r0 = r0[r2]
                    r1 = 2131165277(0x7f07005d, float:1.7944767E38)
                    r0.setBackgroundResource(r1)
                    android.widget.ImageView[][] r0 = r10.f9354g
                    r0 = r0[r3]
                    r0 = r0[r2]
                    r1 = 2131165512(0x7f070148, float:1.7945243E38)
                    r0.setImageResource(r1)
                    com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                    int r1 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    r0 = r0[r1]
                    android.util.Pair<java.lang.Boolean, java.lang.Long>[][] r0 = r0.f7760e
                    r0 = r0[r3]
                    android.util.Pair r1 = new android.util.Pair
                    java.lang.Boolean r3 = java.lang.Boolean.valueOf(r7)
                    com.imlabworld.HS_Instructor.bq$c r4 = r10.f9369v
                    com.imlabworld.HS_Instructor.bq r4 = com.imlabworld.HS_Instructor.C2507bq.this
                    com.imlabworld.HS_Instructor.ae[] r4 = r4.f9219d
                    int r5 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    r4 = r4[r5]
                    com.imlabworld.a.y r4 = r4.f7846S
                    long r4 = r4.mo10036d()
                    java.lang.Long r4 = java.lang.Long.valueOf(r4)
                    r1.<init>(r3, r4)
                    r0[r2] = r1
                    goto L_0x000e
                L_0x00c4:
                    com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                    int r2 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    r0 = r0[r2]
                    boolean r0 = r0.f7761f
                    if (r0 == 0) goto L_0x00e2
                    com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                    int r2 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    r0 = r0[r2]
                    r0.f7761f = r1
                    android.widget.ImageView[] r0 = r10.f9358k
                    r0 = r0[r1]
                    r1 = 2131165517(0x7f07014d, float:1.7945253E38)
                    r0.setImageResource(r1)
                    goto L_0x000e
                L_0x00e2:
                    com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                    int r2 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    r0 = r0[r2]
                    r0.f7761f = r7
                    android.widget.ImageView[] r0 = r10.f9358k
                    r0 = r0[r1]
                    r1 = 2131165516(0x7f07014c, float:1.7945251E38)
                    r0.setImageResource(r1)
                    goto L_0x000e
                L_0x00f6:
                    com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                    int r2 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    r0 = r0[r2]
                    boolean r0 = r0.f7762g
                    if (r0 == 0) goto L_0x0114
                    com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                    int r2 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    r0 = r0[r2]
                    r0.f7762g = r1
                    android.widget.ImageView[] r0 = r10.f9358k
                    r0 = r0[r7]
                    r1 = 2131165517(0x7f07014d, float:1.7945253E38)
                    r0.setImageResource(r1)
                    goto L_0x000e
                L_0x0114:
                    com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                    int r1 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    r0 = r0[r1]
                    r0.f7762g = r7
                    android.widget.ImageView[] r0 = r10.f9358k
                    r0 = r0[r7]
                    r1 = 2131165516(0x7f07014c, float:1.7945251E38)
                    r0.setImageResource(r1)
                    goto L_0x000e
                L_0x0128:
                    com.imlabworld.HS_Instructor.bq$c r0 = r10.f9369v
                    com.imlabworld.HS_Instructor.bq r0 = com.imlabworld.HS_Instructor.C2507bq.this
                    long r0 = r0.f9220e
                    com.imlabworld.HS_Instructor.C2465bl.f8805g = r0
                    com.imlabworld.HS_Instructor.bq$c r0 = r10.f9369v
                    com.imlabworld.HS_Instructor.bq r0 = com.imlabworld.HS_Instructor.C2507bq.this
                    com.imlabworld.HS_Instructor.bq$b r0 = r0.f9218c
                    int r1 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    com.imlabworld.HS_Instructor.bq$a r2 = com.imlabworld.HS_Instructor.C2507bq.C2508a.NEXT
                    java.lang.String r3 = ""
                    java.lang.String r4 = ""
                    r0.mo8598a(r1, r2, r3, r4)
                    goto L_0x000e
                L_0x0147:
                    boolean r0 = r10.f9368u
                    if (r0 == 0) goto L_0x01e6
                    r10.f9368u = r1
                    android.widget.TextView r0 = r10.f9359l
                    r0.setVisibility(r1)
                    android.widget.ImageView r0 = r10.f9360m
                    r0.setVisibility(r6)
                    android.widget.TextView r0 = r10.f9361n
                    r0.setVisibility(r6)
                    android.widget.ImageView[][] r0 = r10.f9354g
                    r0 = r0[r1]
                    r0 = r0[r8]
                    r0.setVisibility(r1)
                    android.widget.ImageView[][] r0 = r10.f9355h
                    r0 = r0[r1]
                    r0 = r0[r8]
                    r0.setOnClickListener(r10)
                    com.imlabworld.HS_Instructor.bq$c r0 = r10.f9369v
                    com.imlabworld.HS_Instructor.bq r0 = com.imlabworld.HS_Instructor.C2507bq.this
                    long r2 = r0.f9220e
                    long r4 = com.imlabworld.HS_Instructor.C2465bl.f8806h
                    long r2 = r2 - r4
                    double r2 = (double) r2
                    r4 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
                    double r2 = r2 * r4
                    com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                    int r4 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    r0 = r0[r4]
                    r0.f7763h = r2
                    android.widget.TextView r0 = r10.f9359l
                    java.lang.String r4 = "%.2f%s"
                    java.lang.Object[] r5 = new java.lang.Object[r8]
                    java.lang.Double r2 = java.lang.Double.valueOf(r2)
                    r5[r1] = r2
                    com.imlabworld.a.g r2 = com.imlabworld.HS_Instructor.C2557y.f9835g
                    java.lang.String r2 = r2.f10348dj
                    r5[r7] = r2
                    java.lang.String r2 = java.lang.String.format(r4, r5)
                    r0.setText(r2)
                    com.ssomai.android.scalablelayout.ScalableLayout[][] r0 = r10.f9352e
                    r0 = r0[r1]
                    r0 = r0[r8]
                    r2 = 2131165277(0x7f07005d, float:1.7944767E38)
                    r0.setBackgroundResource(r2)
                    android.widget.ImageView[][] r0 = r10.f9354g
                    r0 = r0[r1]
                    r0 = r0[r8]
                    r2 = 2131165512(0x7f070148, float:1.7945243E38)
                    r0.setImageResource(r2)
                    com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                    int r2 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    r0 = r0[r2]
                    android.util.Pair<java.lang.Boolean, java.lang.Long>[][] r0 = r0.f7760e
                    r0 = r0[r1]
                    android.util.Pair r1 = new android.util.Pair
                    java.lang.Boolean r2 = java.lang.Boolean.valueOf(r7)
                    com.imlabworld.HS_Instructor.bq$c r3 = r10.f9369v
                    com.imlabworld.HS_Instructor.bq r3 = com.imlabworld.HS_Instructor.C2507bq.this
                    long r4 = r3.f9220e
                    java.lang.Long r3 = java.lang.Long.valueOf(r4)
                    r1.<init>(r2, r3)
                    r0[r8] = r1
                    com.imlabworld.HS_Instructor.bq$c r0 = r10.f9369v
                    com.imlabworld.HS_Instructor.bq r0 = com.imlabworld.HS_Instructor.C2507bq.this
                    long r0 = r0.f9220e
                    com.imlabworld.HS_Instructor.C2465bl.f8807i = r0
                    goto L_0x000e
                L_0x01e6:
                    r10.f9368u = r7
                    com.imlabworld.HS_Instructor.bq$c r0 = r10.f9369v
                    com.imlabworld.HS_Instructor.bq r0 = com.imlabworld.HS_Instructor.C2507bq.this
                    long r0 = r0.f9220e
                    com.imlabworld.HS_Instructor.C2465bl.f8806h = r0
                    android.widget.TextView r0 = r10.f9361n
                    com.imlabworld.a.g r1 = com.imlabworld.HS_Instructor.C2557y.f9835g
                    java.lang.String r1 = r1.f10204ay
                    r0.setText(r1)
                    goto L_0x000e
                L_0x01fd:
                    long[] r0 = com.imlabworld.HS_Instructor.C2465bl.f8808j
                    com.imlabworld.HS_Instructor.bq$c r2 = r10.f9369v
                    com.imlabworld.HS_Instructor.bq r2 = com.imlabworld.HS_Instructor.C2507bq.this
                    long r2 = r2.f9220e
                    r0[r1] = r2
                    boolean[] r0 = r10.f9365r
                    r0[r1] = r7
                    android.widget.ImageView[] r0 = r10.f9363p
                    r2 = 6
                    r0 = r0[r2]
                    r0.setVisibility(r6)
                    android.widget.TextView[] r0 = r10.f9364q
                    r2 = 6
                    r0 = r0[r2]
                    r0.setVisibility(r6)
                    android.widget.ImageView[] r0 = r10.f9363p
                    r0 = r0[r1]
                    r0.setVisibility(r1)
                    android.widget.TextView[] r0 = r10.f9364q
                    r0 = r0[r1]
                    r0.setVisibility(r1)
                    goto L_0x000e
                L_0x022d:
                    long[] r0 = com.imlabworld.HS_Instructor.C2465bl.f8808j
                    com.imlabworld.HS_Instructor.bq$c r2 = r10.f9369v
                    com.imlabworld.HS_Instructor.bq r2 = com.imlabworld.HS_Instructor.C2507bq.this
                    long r2 = r2.f9220e
                    r0[r7] = r2
                    boolean[] r0 = r10.f9365r
                    r0[r1] = r1
                    boolean[] r0 = r10.f9365r
                    r0[r7] = r7
                    android.widget.ImageView[] r0 = r10.f9363p
                    r0 = r0[r1]
                    r0.setVisibility(r6)
                    android.widget.TextView[] r0 = r10.f9364q
                    r0 = r0[r1]
                    r0.setVisibility(r6)
                    android.widget.ImageView[] r0 = r10.f9363p
                    r0 = r0[r7]
                    r0.setVisibility(r1)
                    android.widget.TextView[] r0 = r10.f9364q
                    r0 = r0[r7]
                    r0.setVisibility(r1)
                    android.widget.ImageView[][] r0 = r10.f9354g
                    r0 = r0[r7]
                    r0 = r0[r1]
                    r0.setVisibility(r1)
                    long[] r0 = com.imlabworld.HS_Instructor.C2465bl.f8808j
                    r2 = r0[r7]
                    long[] r0 = com.imlabworld.HS_Instructor.C2465bl.f8808j
                    r4 = r0[r1]
                    long r2 = r2 - r4
                    double r2 = (double) r2
                    r4 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
                    double r2 = r2 * r4
                    com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                    int r4 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    r0 = r0[r4]
                    r0.f7764i = r2
                    r4 = 4624633867356078080(0x402e000000000000, double:15.0)
                    int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                    if (r0 < 0) goto L_0x02c1
                    r4 = 4625759767262920704(0x4032000000000000, double:18.0)
                    int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                    if (r0 > 0) goto L_0x02c1
                    com.ssomai.android.scalablelayout.ScalableLayout[][] r0 = r10.f9352e
                    r0 = r0[r7]
                    r0 = r0[r1]
                    r2 = 2131165277(0x7f07005d, float:1.7944767E38)
                    r0.setBackgroundResource(r2)
                    android.widget.ImageView[][] r0 = r10.f9354g
                    r0 = r0[r7]
                    r0 = r0[r1]
                    r2 = 2131165512(0x7f070148, float:1.7945243E38)
                    r0.setImageResource(r2)
                    com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                    int r2 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    r0 = r0[r2]
                    android.util.Pair<java.lang.Boolean, java.lang.Long>[][] r0 = r0.f7760e
                    r0 = r0[r7]
                    android.util.Pair r2 = new android.util.Pair
                    java.lang.Boolean r3 = java.lang.Boolean.valueOf(r7)
                    long[] r4 = com.imlabworld.HS_Instructor.C2465bl.f8808j
                    r4 = r4[r7]
                    java.lang.Long r4 = java.lang.Long.valueOf(r4)
                    r2.<init>(r3, r4)
                    r0[r1] = r2
                    goto L_0x000e
                L_0x02c1:
                    com.ssomai.android.scalablelayout.ScalableLayout[][] r0 = r10.f9352e
                    r0 = r0[r7]
                    r0 = r0[r1]
                    r2 = 2131165280(0x7f070060, float:1.7944773E38)
                    r0.setBackgroundResource(r2)
                    android.widget.ImageView[][] r0 = r10.f9354g
                    r0 = r0[r7]
                    r0 = r0[r1]
                    r2 = 2131165531(0x7f07015b, float:1.7945282E38)
                    r0.setImageResource(r2)
                    com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                    int r2 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    r0 = r0[r2]
                    android.util.Pair<java.lang.Boolean, java.lang.Long>[][] r0 = r0.f7760e
                    r0 = r0[r7]
                    android.util.Pair r2 = new android.util.Pair
                    java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
                    r4 = 0
                    java.lang.Long r4 = java.lang.Long.valueOf(r4)
                    r2.<init>(r3, r4)
                    r0[r1] = r2
                    goto L_0x000e
                L_0x02f6:
                    long[] r0 = com.imlabworld.HS_Instructor.C2465bl.f8808j
                    com.imlabworld.HS_Instructor.bq$c r2 = r10.f9369v
                    com.imlabworld.HS_Instructor.bq r2 = com.imlabworld.HS_Instructor.C2507bq.this
                    long r2 = r2.f9220e
                    r0[r8] = r2
                    boolean[] r0 = r10.f9365r
                    r0[r7] = r1
                    boolean[] r0 = r10.f9365r
                    r0[r8] = r7
                    android.widget.ImageView[] r0 = r10.f9363p
                    r0 = r0[r7]
                    r0.setVisibility(r6)
                    android.widget.TextView[] r0 = r10.f9364q
                    r0 = r0[r7]
                    r0.setVisibility(r6)
                    android.widget.ImageView[] r0 = r10.f9363p
                    r0 = r0[r8]
                    r0.setVisibility(r1)
                    android.widget.TextView[] r0 = r10.f9364q
                    r0 = r0[r8]
                    r0.setVisibility(r1)
                    android.widget.ImageView[][] r0 = r10.f9354g
                    r0 = r0[r7]
                    r0 = r0[r7]
                    r0.setVisibility(r1)
                    long[] r0 = com.imlabworld.HS_Instructor.C2465bl.f8808j
                    r0 = r0[r8]
                    long[] r2 = com.imlabworld.HS_Instructor.C2465bl.f8808j
                    r2 = r2[r7]
                    long r0 = r0 - r2
                    double r0 = (double) r0
                    r2 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
                    double r0 = r0 * r2
                    com.imlabworld.HS_Instructor.ac[] r2 = com.imlabworld.HS_Instructor.C2556x.f9806w
                    int r3 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    r2 = r2[r3]
                    r2.f7765j = r0
                    com.ssomai.android.scalablelayout.ScalableLayout[][] r0 = r10.f9352e
                    r0 = r0[r7]
                    r0 = r0[r7]
                    r1 = 2131165277(0x7f07005d, float:1.7944767E38)
                    r0.setBackgroundResource(r1)
                    android.widget.ImageView[][] r0 = r10.f9354g
                    r0 = r0[r7]
                    r0 = r0[r7]
                    r1 = 2131165512(0x7f070148, float:1.7945243E38)
                    r0.setImageResource(r1)
                    com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                    int r1 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    r0 = r0[r1]
                    android.util.Pair<java.lang.Boolean, java.lang.Long>[][] r0 = r0.f7760e
                    r0 = r0[r7]
                    android.util.Pair r1 = new android.util.Pair
                    java.lang.Boolean r2 = java.lang.Boolean.valueOf(r7)
                    long[] r3 = com.imlabworld.HS_Instructor.C2465bl.f8808j
                    r4 = r3[r8]
                    java.lang.Long r3 = java.lang.Long.valueOf(r4)
                    r1.<init>(r2, r3)
                    r0[r7] = r1
                    goto L_0x000e
                L_0x037e:
                    long[] r0 = com.imlabworld.HS_Instructor.C2465bl.f8808j
                    com.imlabworld.HS_Instructor.bq$c r2 = r10.f9369v
                    com.imlabworld.HS_Instructor.bq r2 = com.imlabworld.HS_Instructor.C2507bq.this
                    long r2 = r2.f9220e
                    r0[r9] = r2
                    boolean[] r0 = r10.f9365r
                    r0[r8] = r1
                    boolean[] r0 = r10.f9365r
                    r0[r9] = r7
                    android.widget.ImageView[] r0 = r10.f9363p
                    r0 = r0[r8]
                    r0.setVisibility(r6)
                    android.widget.TextView[] r0 = r10.f9364q
                    r0 = r0[r8]
                    r0.setVisibility(r6)
                    android.widget.ImageView[] r0 = r10.f9363p
                    r0 = r0[r9]
                    r0.setVisibility(r1)
                    android.widget.TextView[] r0 = r10.f9364q
                    r0 = r0[r9]
                    r0.setVisibility(r1)
                    android.widget.ImageView[][] r0 = r10.f9354g
                    r0 = r0[r7]
                    r0 = r0[r8]
                    r0.setVisibility(r1)
                    long[] r0 = com.imlabworld.HS_Instructor.C2465bl.f8808j
                    r2 = r0[r9]
                    long[] r0 = com.imlabworld.HS_Instructor.C2465bl.f8808j
                    r4 = r0[r8]
                    long r2 = r2 - r4
                    double r2 = (double) r2
                    r4 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
                    double r2 = r2 * r4
                    com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                    int r4 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    r0 = r0[r4]
                    r0.f7766k = r2
                    r4 = 4624633867356078080(0x402e000000000000, double:15.0)
                    int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                    if (r0 < 0) goto L_0x0412
                    r4 = 4625759767262920704(0x4032000000000000, double:18.0)
                    int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                    if (r0 > 0) goto L_0x0412
                    com.ssomai.android.scalablelayout.ScalableLayout[][] r0 = r10.f9352e
                    r0 = r0[r7]
                    r0 = r0[r8]
                    r1 = 2131165277(0x7f07005d, float:1.7944767E38)
                    r0.setBackgroundResource(r1)
                    android.widget.ImageView[][] r0 = r10.f9354g
                    r0 = r0[r7]
                    r0 = r0[r8]
                    r1 = 2131165512(0x7f070148, float:1.7945243E38)
                    r0.setImageResource(r1)
                    com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                    int r1 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    r0 = r0[r1]
                    android.util.Pair<java.lang.Boolean, java.lang.Long>[][] r0 = r0.f7760e
                    r0 = r0[r7]
                    android.util.Pair r1 = new android.util.Pair
                    java.lang.Boolean r2 = java.lang.Boolean.valueOf(r7)
                    long[] r3 = com.imlabworld.HS_Instructor.C2465bl.f8808j
                    r4 = r3[r9]
                    java.lang.Long r3 = java.lang.Long.valueOf(r4)
                    r1.<init>(r2, r3)
                    r0[r8] = r1
                    goto L_0x000e
                L_0x0412:
                    com.ssomai.android.scalablelayout.ScalableLayout[][] r0 = r10.f9352e
                    r0 = r0[r7]
                    r0 = r0[r8]
                    r2 = 2131165280(0x7f070060, float:1.7944773E38)
                    r0.setBackgroundResource(r2)
                    android.widget.ImageView[][] r0 = r10.f9354g
                    r0 = r0[r7]
                    r0 = r0[r8]
                    r2 = 2131165531(0x7f07015b, float:1.7945282E38)
                    r0.setImageResource(r2)
                    com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                    int r2 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    r0 = r0[r2]
                    android.util.Pair<java.lang.Boolean, java.lang.Long>[][] r0 = r0.f7760e
                    r0 = r0[r7]
                    android.util.Pair r2 = new android.util.Pair
                    java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                    r4 = 0
                    java.lang.Long r3 = java.lang.Long.valueOf(r4)
                    r2.<init>(r1, r3)
                    r0[r8] = r2
                    goto L_0x000e
                L_0x0447:
                    long[] r0 = com.imlabworld.HS_Instructor.C2465bl.f8808j
                    com.imlabworld.HS_Instructor.bq$c r2 = r10.f9369v
                    com.imlabworld.HS_Instructor.bq r2 = com.imlabworld.HS_Instructor.C2507bq.this
                    long r2 = r2.f9220e
                    r0[r6] = r2
                    boolean[] r0 = r10.f9365r
                    r0[r9] = r1
                    boolean[] r0 = r10.f9365r
                    r0[r6] = r7
                    android.widget.ImageView[] r0 = r10.f9363p
                    r0 = r0[r9]
                    r0.setVisibility(r6)
                    android.widget.TextView[] r0 = r10.f9364q
                    r0 = r0[r9]
                    r0.setVisibility(r6)
                    android.widget.ImageView[] r0 = r10.f9363p
                    r0 = r0[r6]
                    r0.setVisibility(r1)
                    android.widget.TextView[] r0 = r10.f9364q
                    r0 = r0[r6]
                    r0.setVisibility(r1)
                    android.widget.ImageView[][] r0 = r10.f9354g
                    r0 = r0[r7]
                    r0 = r0[r9]
                    r0.setVisibility(r1)
                    long[] r0 = com.imlabworld.HS_Instructor.C2465bl.f8808j
                    r0 = r0[r6]
                    long[] r2 = com.imlabworld.HS_Instructor.C2465bl.f8808j
                    r2 = r2[r9]
                    long r0 = r0 - r2
                    double r0 = (double) r0
                    r2 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
                    double r0 = r0 * r2
                    com.imlabworld.HS_Instructor.ac[] r2 = com.imlabworld.HS_Instructor.C2556x.f9806w
                    int r3 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    r2 = r2[r3]
                    r2.f7767l = r0
                    com.ssomai.android.scalablelayout.ScalableLayout[][] r0 = r10.f9352e
                    r0 = r0[r7]
                    r0 = r0[r9]
                    r1 = 2131165277(0x7f07005d, float:1.7944767E38)
                    r0.setBackgroundResource(r1)
                    android.widget.ImageView[][] r0 = r10.f9354g
                    r0 = r0[r7]
                    r0 = r0[r9]
                    r1 = 2131165512(0x7f070148, float:1.7945243E38)
                    r0.setImageResource(r1)
                    com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                    int r1 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    r0 = r0[r1]
                    android.util.Pair<java.lang.Boolean, java.lang.Long>[][] r0 = r0.f7760e
                    r0 = r0[r7]
                    android.util.Pair r1 = new android.util.Pair
                    java.lang.Boolean r2 = java.lang.Boolean.valueOf(r7)
                    long[] r3 = com.imlabworld.HS_Instructor.C2465bl.f8808j
                    r4 = r3[r8]
                    java.lang.Long r3 = java.lang.Long.valueOf(r4)
                    r1.<init>(r2, r3)
                    r0[r9] = r1
                    goto L_0x000e
                L_0x04cf:
                    long[] r0 = com.imlabworld.HS_Instructor.C2465bl.f8808j
                    r2 = 5
                    com.imlabworld.HS_Instructor.bq$c r3 = r10.f9369v
                    com.imlabworld.HS_Instructor.bq r3 = com.imlabworld.HS_Instructor.C2507bq.this
                    long r4 = r3.f9220e
                    r0[r2] = r4
                    boolean[] r0 = r10.f9365r
                    r0[r6] = r1
                    boolean[] r0 = r10.f9365r
                    r2 = 5
                    r0[r2] = r7
                    android.widget.ImageView[] r0 = r10.f9363p
                    r0 = r0[r6]
                    r0.setVisibility(r6)
                    android.widget.TextView[] r0 = r10.f9364q
                    r0 = r0[r6]
                    r0.setVisibility(r6)
                    android.widget.ImageView[] r0 = r10.f9363p
                    r2 = 5
                    r0 = r0[r2]
                    r0.setVisibility(r1)
                    android.widget.TextView[] r0 = r10.f9364q
                    r2 = 5
                    r0 = r0[r2]
                    r0.setVisibility(r1)
                    android.widget.ImageView[][] r0 = r10.f9354g
                    r0 = r0[r7]
                    r0 = r0[r6]
                    r0.setVisibility(r1)
                    long[] r0 = com.imlabworld.HS_Instructor.C2465bl.f8808j
                    r2 = 5
                    r2 = r0[r2]
                    long[] r0 = com.imlabworld.HS_Instructor.C2465bl.f8808j
                    r4 = r0[r6]
                    long r2 = r2 - r4
                    double r2 = (double) r2
                    r4 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
                    double r2 = r2 * r4
                    com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                    int r4 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    r0 = r0[r4]
                    r0.f7768m = r2
                    r4 = 4624633867356078080(0x402e000000000000, double:15.0)
                    int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                    if (r0 < 0) goto L_0x0569
                    r4 = 4625759767262920704(0x4032000000000000, double:18.0)
                    int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                    if (r0 > 0) goto L_0x0569
                    com.ssomai.android.scalablelayout.ScalableLayout[][] r0 = r10.f9352e
                    r0 = r0[r7]
                    r0 = r0[r6]
                    r1 = 2131165277(0x7f07005d, float:1.7944767E38)
                    r0.setBackgroundResource(r1)
                    android.widget.ImageView[][] r0 = r10.f9354g
                    r0 = r0[r7]
                    r0 = r0[r6]
                    r1 = 2131165512(0x7f070148, float:1.7945243E38)
                    r0.setImageResource(r1)
                    com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                    int r1 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    r0 = r0[r1]
                    android.util.Pair<java.lang.Boolean, java.lang.Long>[][] r0 = r0.f7760e
                    r0 = r0[r7]
                    android.util.Pair r1 = new android.util.Pair
                    java.lang.Boolean r2 = java.lang.Boolean.valueOf(r7)
                    long[] r3 = com.imlabworld.HS_Instructor.C2465bl.f8808j
                    r4 = 5
                    r4 = r3[r4]
                    java.lang.Long r3 = java.lang.Long.valueOf(r4)
                    r1.<init>(r2, r3)
                    r0[r6] = r1
                    goto L_0x000e
                L_0x0569:
                    com.ssomai.android.scalablelayout.ScalableLayout[][] r0 = r10.f9352e
                    r0 = r0[r7]
                    r0 = r0[r6]
                    r2 = 2131165280(0x7f070060, float:1.7944773E38)
                    r0.setBackgroundResource(r2)
                    android.widget.ImageView[][] r0 = r10.f9354g
                    r0 = r0[r7]
                    r0 = r0[r6]
                    r2 = 2131165531(0x7f07015b, float:1.7945282E38)
                    r0.setImageResource(r2)
                    com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                    int r2 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    r0 = r0[r2]
                    android.util.Pair<java.lang.Boolean, java.lang.Long>[][] r0 = r0.f7760e
                    r0 = r0[r7]
                    android.util.Pair r2 = new android.util.Pair
                    java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                    r4 = 0
                    java.lang.Long r3 = java.lang.Long.valueOf(r4)
                    r2.<init>(r1, r3)
                    r0[r6] = r2
                    goto L_0x000e
                L_0x059e:
                    boolean[] r0 = r10.f9365r
                    r2 = 5
                    r0[r2] = r1
                    android.widget.ImageView[] r0 = r10.f9363p
                    r2 = 5
                    r0 = r0[r2]
                    r0.setVisibility(r6)
                    android.widget.TextView[] r0 = r10.f9364q
                    r2 = 5
                    r0 = r0[r2]
                    r0.setVisibility(r6)
                    android.widget.ImageView[][] r0 = r10.f9354g
                    r0 = r0[r7]
                    r2 = 5
                    r0 = r0[r2]
                    r0.setVisibility(r1)
                    com.imlabworld.HS_Instructor.bq$c r0 = r10.f9369v
                    com.imlabworld.HS_Instructor.bq r0 = com.imlabworld.HS_Instructor.C2507bq.this
                    long r0 = r0.f9220e
                    long[] r2 = com.imlabworld.HS_Instructor.C2465bl.f8808j
                    r3 = 5
                    r2 = r2[r3]
                    long r0 = r0 - r2
                    double r0 = (double) r0
                    r2 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
                    double r0 = r0 * r2
                    com.imlabworld.HS_Instructor.ac[] r2 = com.imlabworld.HS_Instructor.C2556x.f9806w
                    int r3 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    r2 = r2[r3]
                    r2.f7769n = r0
                    com.ssomai.android.scalablelayout.ScalableLayout[][] r0 = r10.f9352e
                    r0 = r0[r7]
                    r1 = 5
                    r0 = r0[r1]
                    r1 = 2131165277(0x7f07005d, float:1.7944767E38)
                    r0.setBackgroundResource(r1)
                    android.widget.ImageView[][] r0 = r10.f9354g
                    r0 = r0[r7]
                    r1 = 5
                    r0 = r0[r1]
                    r1 = 2131165512(0x7f070148, float:1.7945243E38)
                    r0.setImageResource(r1)
                    com.imlabworld.HS_Instructor.ac[] r0 = com.imlabworld.HS_Instructor.C2556x.f9806w
                    int r1 = com.imlabworld.HS_Instructor.C2465bl.f8800b
                    r0 = r0[r1]
                    android.util.Pair<java.lang.Boolean, java.lang.Long>[][] r0 = r0.f7760e
                    r0 = r0[r7]
                    r1 = 5
                    android.util.Pair r2 = new android.util.Pair
                    java.lang.Boolean r3 = java.lang.Boolean.valueOf(r7)
                    com.imlabworld.HS_Instructor.bq$c r4 = r10.f9369v
                    com.imlabworld.HS_Instructor.bq r4 = com.imlabworld.HS_Instructor.C2507bq.this
                    long r4 = r4.f9220e
                    java.lang.Long r4 = java.lang.Long.valueOf(r4)
                    r2.<init>(r3, r4)
                    r0[r1] = r2
                    goto L_0x000e
                */
                throw new UnsupportedOperationException("Method not decompiled: com.imlabworld.HS_Instructor.C2507bq.C2510c.C2514d.onClick(android.view.View):void");
            }
        }

        public C2510c(View view) {
            this.f9230a = (ScalableLayout) view.findViewById(C2656R.C2657id.test_sheet_sc);
            this.f9231b = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_pause_btn);
            this.f9232c = (TextView) view.findViewById(C2656R.C2657id.test_sheet_title_txt);
            this.f9233d = (TextView) view.findViewById(C2656R.C2657id.test_sheet_timer_txt);
            this.f9234e = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_lap_btn);
            this.f9235f = (TextView) view.findViewById(C2656R.C2657id.test_sheet_lap_btn_txt);
            this.f9236g = (ImageView) view.findViewById(C2656R.C2657id.test_sheet_guideline_img);
            this.f9237h = new C2511a(view);
            this.f9238i = new C2512b(view);
            this.f9239j = new C2513c(this, view);
            this.f9240k = new C2514d(this, view);
            this.f9230a.setOnClickListener(this);
            this.f9231b.setOnClickListener(this);
            this.f9234e.setOnClickListener(this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo9222a() {
            C2553u a = C2465bl.f8801c.get(0).mo9306a();
            C2552t b = C2465bl.f8801c.get(0).mo9310b();
            switch (b.f9748d) {
                case 1:
                    switch (b.f9747c) {
                        case 1:
                        case 2:
                            this.f9238i.mo9241a();
                            mo9226c();
                            break;
                        case 3:
                            this.f9240k.mo9255a();
                            mo9228e();
                            break;
                    }
                case 2:
                    switch (b.f9747c) {
                        case 1:
                        case 2:
                            this.f9237h.mo9233a();
                            mo9225b();
                            break;
                        case 3:
                            this.f9239j.mo9249a();
                            mo9227d();
                            break;
                    }
            }
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
            this.f9232c.setText(a.mo9718c() + " " + str);
            this.f9233d.setText("00:00.00");
            this.f9235f.setText("LAP");
            switch (b.f9755k) {
                case 1:
                case 4:
                    this.f9236g.setImageResource(C2656R.drawable.img_mark_aha);
                    break;
                case 2:
                case 5:
                    this.f9236g.setImageResource(C2656R.drawable.img_mark_erc);
                    break;
                case 3:
                case 6:
                    this.f9236g.setImageResource(C2656R.drawable.img_mark_anzcor);
                    break;
                case 7:
                case 8:
                    this.f9236g.setImageResource(C2656R.drawable.img_mark_kacpr_full);
                    break;
                case 9:
                case 10:
                    this.f9236g.setImageResource(C2656R.drawable.srac_logo);
                    break;
            }
            C2465bl.f8804f = 0;
            long unused = C2507bq.this.f9220e = 0;
            long unused2 = C2507bq.this.f9221f = System.currentTimeMillis();
            long unused3 = C2507bq.this.f9222g = 0;
            boolean unused4 = C2507bq.this.f9223h = false;
        }

        /* renamed from: a */
        public void mo9223a(C2573ai aiVar, int i) {
            switch (C2465bl.f8801c.get(0).mo9310b().f9748d) {
                case 1:
                    this.f9238i.mo9243a(aiVar, i);
                    return;
                case 2:
                    this.f9237h.mo9235a(aiVar, i);
                    return;
                default:
                    return;
            }
        }

        /* renamed from: a */
        public void mo9224a(C2576al alVar, int i) {
            switch (C2465bl.f8801c.get(0).mo9310b().f9748d) {
                case 1:
                    this.f9238i.mo9244a(alVar, i);
                    return;
                case 2:
                    this.f9237h.mo9236a(alVar, i);
                    return;
                default:
                    return;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo9225b() {
            this.f9237h.mo9238b();
            this.f9238i.mo9247c();
            this.f9239j.mo9253c();
            this.f9240k.mo9259c();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo9226c() {
            this.f9237h.mo9239c();
            this.f9238i.mo9246b();
            this.f9239j.mo9253c();
            this.f9240k.mo9259c();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo9227d() {
            this.f9237h.mo9239c();
            this.f9238i.mo9247c();
            this.f9239j.mo9251b();
            this.f9240k.mo9259c();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo9228e() {
            this.f9237h.mo9239c();
            this.f9238i.mo9247c();
            this.f9239j.mo9253c();
            this.f9240k.mo9257b();
        }

        /* renamed from: f */
        public void mo9229f() {
            if (C2465bl.f8800b != -1 && !C2507bq.this.f9223h) {
                long currentTimeMillis = System.currentTimeMillis();
                long unused = C2507bq.this.f9220e = C2507bq.this.f9220e + (currentTimeMillis - C2507bq.this.f9221f);
                long unused2 = C2507bq.this.f9221f = currentTimeMillis;
                int b = (int) (C2507bq.this.f9220e - C2465bl.f8804f);
                this.f9233d.setText(String.format("%02d:%02d.%02d", new Object[]{Integer.valueOf((b / 1000) / 60), Integer.valueOf((b / 1000) % 60), Integer.valueOf((b % 1000) / 10)}));
                C2552t b2 = C2465bl.f8801c.get(0).mo9310b();
                switch (b2.f9748d) {
                    case 1:
                        switch (b2.f9747c) {
                            case 1:
                            case 2:
                                this.f9238i.mo9242a(C2507bq.this.f9220e);
                                return;
                            case 3:
                                this.f9240k.mo9256a(C2507bq.this.f9220e);
                                this.f9240k.mo9258b(C2507bq.this.f9220e);
                                return;
                            default:
                                return;
                        }
                    case 2:
                        switch (b2.f9747c) {
                            case 1:
                            case 2:
                                this.f9237h.mo9234a(C2507bq.this.f9220e);
                                return;
                            case 3:
                                this.f9239j.mo9250a(C2507bq.this.f9220e);
                                this.f9239j.mo9252b(C2507bq.this.f9220e);
                                return;
                            default:
                                return;
                        }
                    default:
                        return;
                }
            }
        }

        /* renamed from: g */
        public void mo9230g() {
            this.f9230a.setVisibility(0);
        }

        /* renamed from: h */
        public void mo9231h() {
            this.f9230a.setVisibility(4);
        }

        public void onClick(View view) {
            String str;
            switch (view.getId()) {
                case C2656R.C2657id.test_sheet_pause_btn /*2131232849*/:
                    C2527bs bsVar = C2465bl.f8801c.get(0);
                    String c = bsVar.mo9306a().mo9718c();
                    switch (bsVar.mo9310b().f9747c) {
                        case 1:
                            str = C2557y.f9835g.f10581t;
                            break;
                        case 2:
                            str = C2557y.f9835g.f10272cM;
                            break;
                        case 3:
                            str = C2557y.f9835g.f10582u;
                            break;
                        default:
                            str = "";
                            break;
                    }
                    C2507bq.this.f9218c.mo8598a(C2465bl.f8800b, C2508a.PAUSE, c, str);
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: a */
    public static C2507bq m13709a(int i) {
        C2507bq bqVar = new C2507bq();
        Bundle bundle = new Bundle();
        bundle.putInt(f9216b, i);
        bqVar.setArguments(bundle);
        return bqVar;
    }

    /* renamed from: g */
    private void m13718g() {
        this.f9224i.mo9230g();
        this.f9224i.mo9222a();
        mo9214c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9209a() {
        this.f9224i.mo9229f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9210a(C2573ai aiVar, int i) {
        this.f9224i.mo9223a(aiVar, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9211a(C2576al alVar, int i) {
        this.f9224i.mo9224a(alVar, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9212a(C2338ae[] aeVarArr) {
        this.f9219d = aeVarArr;
        m13718g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo9213b() {
        this.f9224i.mo9229f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo9214c() {
        this.f9224i.f9237h.mo9237a(false);
        this.f9224i.f9238i.mo9245a(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo9215d() {
        this.f9224i.f9237h.mo9237a(true);
        this.f9224i.f9238i.mo9245a(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo9216e() {
        this.f9223h = true;
        this.f9222g = System.currentTimeMillis();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo9217f() {
        this.f9223h = false;
        this.f9221f += System.currentTimeMillis() - this.f9222g;
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (activity instanceof C2509b) {
            this.f9218c = (C2509b) activity;
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
        View inflate = layoutInflater.inflate(C2656R.layout.test_sheet, viewGroup, false);
        this.f9224i = new C2510c(inflate);
        return inflate;
    }

    public void onDetach() {
        super.onDetach();
        this.f9218c = null;
    }
}
