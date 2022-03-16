package com.imlabworld.HS_Instructor;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.imlabworld.p079a.C2576al;
import com.imlabworld.p079a.C2589ay;
import com.ssomai.android.scalablelayout.ScalableLayout;
import com.woxthebox.draglistview.C2656R;

/* renamed from: com.imlabworld.HS_Instructor.bh */
public class C2452bh extends Fragment implements View.OnClickListener {

    /* renamed from: a */
    private static final String f8695a = "param1";

    /* renamed from: b */
    private static final String f8696b = "param2";

    /* renamed from: c */
    private static final String f8697c = "param3";

    /* renamed from: A */
    private ImageView f8698A;

    /* renamed from: B */
    private ImageView f8699B;

    /* renamed from: C */
    private ImageView f8700C;

    /* renamed from: D */
    private ScalableLayout f8701D;

    /* renamed from: E */
    private ImageView f8702E;

    /* renamed from: F */
    private boolean f8703F;

    /* renamed from: d */
    private int f8704d;

    /* renamed from: e */
    private int f8705e;

    /* renamed from: f */
    private String f8706f;

    /* renamed from: g */
    private View f8707g;

    /* renamed from: h */
    private C2455b f8708h;

    /* renamed from: i */
    private ScalableLayout f8709i;

    /* renamed from: j */
    private TextView f8710j;

    /* renamed from: k */
    private TextView f8711k;

    /* renamed from: l */
    private TextView f8712l;

    /* renamed from: m */
    private TextView f8713m;

    /* renamed from: n */
    private TextView f8714n;

    /* renamed from: o */
    private TextView f8715o;

    /* renamed from: p */
    private TextView f8716p;

    /* renamed from: q */
    private TextView f8717q;

    /* renamed from: r */
    private ImageView f8718r;

    /* renamed from: s */
    private ImageView f8719s;

    /* renamed from: t */
    private ImageView f8720t;

    /* renamed from: u */
    private ImageView f8721u;

    /* renamed from: v */
    private ImageView f8722v;

    /* renamed from: w */
    private ImageView f8723w;

    /* renamed from: x */
    private ScalableLayout f8724x;

    /* renamed from: y */
    private TextView f8725y;

    /* renamed from: z */
    private TextView f8726z;

    /* renamed from: com.imlabworld.HS_Instructor.bh$a */
    public enum C2454a {
        ASSIGN,
        CALIBRATION,
        SKIP,
        PAUSE,
        UNPAUSE
    }

    /* renamed from: com.imlabworld.HS_Instructor.bh$b */
    public interface C2455b {
        /* renamed from: a */
        void mo8594a(int i, C2454a aVar);
    }

    /* renamed from: a */
    public static C2452bh m13527a(int i, int i2, String str) {
        C2452bh bhVar = new C2452bh();
        Bundle bundle = new Bundle();
        bundle.putInt(f8695a, i);
        bundle.putInt(f8696b, i2);
        bundle.putString(f8697c, str);
        bhVar.setArguments(bundle);
        return bhVar;
    }

    /* renamed from: c */
    private void m13528c() {
        this.f8709i = (ScalableLayout) this.f8707g.findViewById(C2656R.C2657id.compression_gauge_sc);
        this.f8710j = (TextView) this.f8707g.findViewById(C2656R.C2657id.compression_slot_name);
        this.f8711k = (TextView) this.f8707g.findViewById(C2656R.C2657id.compression_student_name);
        this.f8712l = (TextView) this.f8707g.findViewById(C2656R.C2657id.compression_slot_title_txt);
        this.f8713m = (TextView) this.f8707g.findViewById(C2656R.C2657id.compression_slot_cycle_txt);
        this.f8714n = (TextView) this.f8707g.findViewById(C2656R.C2657id.compression_slot_time_txt);
        this.f8715o = (TextView) this.f8707g.findViewById(C2656R.C2657id.compression_slot_num_txt);
        this.f8716p = (TextView) this.f8707g.findViewById(C2656R.C2657id.compression_slot_rate_txt);
        this.f8717q = (TextView) this.f8707g.findViewById(C2656R.C2657id.compression_slot_feedback_txt);
        this.f8724x = (ScalableLayout) this.f8707g.findViewById(C2656R.C2657id.compression_hot_sc);
        this.f8725y = (TextView) this.f8707g.findViewById(C2656R.C2657id.compression_hot_title);
        this.f8726z = (TextView) this.f8707g.findViewById(C2656R.C2657id.compression_hot_txt);
        this.f8698A = (ImageView) this.f8707g.findViewById(C2656R.C2657id.compression_pause_btn);
        this.f8699B = (ImageView) this.f8707g.findViewById(C2656R.C2657id.compression_skip_btn);
        this.f8700C = (ImageView) this.f8707g.findViewById(C2656R.C2657id.compression_calibration_btn);
        this.f8701D = (ScalableLayout) this.f8707g.findViewById(C2656R.C2657id.compression_pause_sc);
        this.f8702E = (ImageView) this.f8707g.findViewById(C2656R.C2657id.compression_unpause_btn);
        this.f8718r = new ImageView(getActivity());
        this.f8719s = new ImageView(getActivity());
        this.f8720t = new ImageView(getActivity());
        this.f8721u = new ImageView(getActivity());
        this.f8722v = new ImageView(getActivity());
        this.f8723w = new ImageView(getActivity());
        this.f8718r.setBackgroundColor(-12964);
        this.f8719s.setBackgroundColor(-13520490);
        this.f8720t.setBackgroundColor(-764642);
        this.f8721u.setBackgroundColor(-1);
        this.f8722v.setBackgroundColor(-1118482);
        this.f8723w.setBackgroundColor(-1);
        this.f8709i.mo10058a((View) this.f8718r, 70.0f, 310.0f, ((float) C2556x.f9788e) * 6.2f, 75.0f);
        this.f8709i.mo10058a((View) this.f8719s, 70.0f + (((float) C2556x.f9788e) * 6.2f), 310.0f, 6.2f * ((float) (C2556x.f9789f - C2556x.f9788e)), 75.0f);
        this.f8709i.mo10058a((View) this.f8720t, 70.0f + (((float) C2556x.f9789f) * 6.2f), 310.0f, 6.2f * ((float) (100 - C2556x.f9789f)), 75.0f);
        this.f8709i.mo10058a((View) this.f8721u, 70.0f, 320.0f, 621.0f, 5.0f);
        this.f8709i.mo10058a((View) this.f8722v, 70.0f, 325.0f, 621.0f, 60.0f);
        this.f8709i.mo10058a((View) this.f8723w, 690.0f, 310.0f, 2.0f, 75.0f);
        this.f8710j.setText(((char) (this.f8704d + 65)) + "");
        this.f8712l.setText(C2557y.f9835g.f10147U);
        this.f8725y.setText(C2557y.f9835g.f10184ae + "(" + C2557y.f9835g.f10348dj + ")");
        this.f8724x.setVisibility(4);
        this.f8711k.setOnClickListener(this);
        this.f8698A.setVisibility(4);
        this.f8698A.setOnClickListener(this);
        this.f8699B.setOnClickListener(this);
        this.f8700C.setOnClickListener(this);
        this.f8701D.setOnClickListener(this);
        this.f8702E.setOnClickListener(this);
        mo9009b();
    }

    /* renamed from: a */
    public void mo9005a() {
        this.f8712l.setText(C2557y.f9835g.f10147U);
        this.f8725y.setText(C2557y.f9835g.f10184ae + "(" + C2557y.f9835g.f10348dj + ")");
    }

    /* renamed from: a */
    public void mo9006a(int i) {
        this.f8705e = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9007a(C2576al alVar, int i, int i2) {
        if (alVar != null) {
            double e = alVar.mo9877e();
            int b = alVar.mo9874b();
            double j = alVar.mo9865j();
            double k = alVar.mo9866k();
            int m = alVar.mo9882m();
            int n = alVar.mo9883n();
            C2589ay i3 = alVar.mo9864i();
            if (this.f8705e == 18) {
                this.f8713m.setVisibility(0);
                if (C2557y.f9832d.f9749e != 6) {
                    this.f8713m.setText(C2557y.f9835g.f10141O + " " + (i + 1) + "/" + i2);
                } else {
                    this.f8713m.setText(C2557y.f9835g.f10141O + " " + (i + 1));
                }
                this.f8699B.setVisibility(0);
            } else {
                this.f8713m.setVisibility(4);
                this.f8699B.setVisibility(4);
            }
            this.f8726z.setText(String.format("%02d", new Object[]{Integer.valueOf((int) k)}));
            if (k < 3.0d || m <= 0) {
                this.f8724x.setVisibility(4);
            } else {
                this.f8724x.setVisibility(0);
                if (k <= 10.0d) {
                    this.f8725y.setTextColor(-13520490);
                    this.f8726z.setTextColor(-10658467);
                } else {
                    this.f8725y.setTextColor(-764642);
                    this.f8726z.setTextColor(-764642);
                }
            }
            this.f8709i.removeView(this.f8722v);
            this.f8709i.mo10058a((View) this.f8722v, 70.0f + (6.2f * ((float) b)), 325.0f, (((float) (100 - b)) * 6.2f) + 1.0f, 60.0f);
            this.f8709i.removeView(this.f8723w);
            this.f8709i.mo10058a((View) this.f8723w, 690.0f, 310.0f, 2.0f, 75.0f);
            this.f8716p.setText(((int) e) + "/" + C2557y.f9835g.f10349dk);
            this.f8714n.setText(((int) j) + C2557y.f9835g.f10348dj);
            this.f8715o.setText(String.format("%02d/%02d", new Object[]{Integer.valueOf(n), Integer.valueOf(m)}));
            switch (i3) {
                case Too_Strong:
                    this.f8717q.setTextColor(-764642);
                    this.f8717q.setText(C2557y.f9835g.f10350dl);
                    return;
                case Too_Weak:
                    this.f8717q.setTextColor(-12964);
                    this.f8717q.setText(C2557y.f9835g.f10351dm);
                    return;
                case Wrong_Position:
                    this.f8717q.setTextColor(-764642);
                    this.f8717q.setText(C2557y.f9835g.f10352dn);
                    return;
                case Not_Recoil:
                    this.f8717q.setTextColor(-764642);
                    this.f8717q.setText(C2557y.f9835g.f10353do);
                    return;
                case Too_Fast:
                    this.f8717q.setTextColor(-764642);
                    this.f8717q.setText(C2557y.f9835g.f10354dp);
                    return;
                case Too_Slow:
                    this.f8717q.setTextColor(-12964);
                    this.f8717q.setText(C2557y.f9835g.f10355dq);
                    return;
                case Good:
                    this.f8717q.setTextColor(-13520490);
                    this.f8717q.setText(C2557y.f9835g.f10356dr);
                    return;
                case NONE:
                    this.f8717q.setText("");
                    return;
                default:
                    return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9008a(String str) {
        this.f8706f = str;
        if (this.f8706f != null) {
            this.f8711k.setText(this.f8706f);
        } else {
            this.f8711k.setText(C2557y.f9835g.f10275cP);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo9009b() {
        if (this.f8705e == 18) {
            this.f8713m.setVisibility(0);
            this.f8713m.setText("");
            this.f8699B.setVisibility(0);
        } else {
            this.f8713m.setVisibility(4);
            this.f8699B.setVisibility(4);
        }
        this.f8724x.setVisibility(4);
        this.f8709i.removeView(this.f8718r);
        this.f8709i.removeView(this.f8719s);
        this.f8709i.removeView(this.f8720t);
        this.f8709i.removeView(this.f8721u);
        this.f8709i.mo10058a((View) this.f8718r, 70.0f, 310.0f, ((float) C2556x.f9788e) * 6.2f, 75.0f);
        this.f8709i.mo10058a((View) this.f8719s, 70.0f + (((float) C2556x.f9788e) * 6.2f), 310.0f, 6.2f * ((float) (C2556x.f9789f - C2556x.f9788e)), 75.0f);
        this.f8709i.mo10058a((View) this.f8720t, 70.0f + (((float) C2556x.f9789f) * 6.2f), 310.0f, 6.2f * ((float) (100 - C2556x.f9789f)), 75.0f);
        this.f8709i.mo10058a((View) this.f8721u, 70.0f, 320.0f, 621.0f, 5.0f);
        this.f8709i.removeView(this.f8722v);
        this.f8709i.mo10058a((View) this.f8722v, 70.0f, 325.0f, 621.0f, 60.0f);
        this.f8709i.removeView(this.f8723w);
        this.f8709i.mo10058a((View) this.f8723w, 690.0f, 310.0f, 2.0f, 75.0f);
        this.f8716p.setText("");
        this.f8714n.setText("");
        this.f8715o.setText("");
        this.f8717q.setText("");
        this.f8703F = false;
        this.f8698A.setImageResource(C2656R.drawable.btn_slot_pause);
        this.f8701D.setVisibility(4);
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (activity instanceof C2455b) {
            this.f8708h = (C2455b) activity;
            return;
        }
        throw new RuntimeException(activity.toString() + " must implement OnFragmentInteractionListener");
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case C2656R.C2657id.compression_calibration_btn /*2131230885*/:
                this.f8708h.mo8594a(this.f8704d, C2454a.CALIBRATION);
                return;
            case C2656R.C2657id.compression_pause_btn /*2131230890*/:
                if (!this.f8703F) {
                    this.f8703F = true;
                    this.f8701D.setVisibility(0);
                    this.f8708h.mo8594a(this.f8704d, C2454a.PAUSE);
                    return;
                }
                return;
            case C2656R.C2657id.compression_skip_btn /*2131230893*/:
                this.f8708h.mo8594a(this.f8704d, C2454a.SKIP);
                return;
            case C2656R.C2657id.compression_student_name /*2131230901*/:
                this.f8708h.mo8594a(this.f8704d, C2454a.ASSIGN);
                return;
            case C2656R.C2657id.compression_unpause_btn /*2131230902*/:
                if (this.f8703F) {
                    this.f8703F = false;
                    this.f8701D.setVisibility(4);
                    this.f8708h.mo8594a(this.f8704d, C2454a.UNPAUSE);
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
            this.f8704d = getArguments().getInt(f8695a);
            this.f8705e = getArguments().getInt(f8696b);
            this.f8706f = getArguments().getString(f8697c);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f8707g = layoutInflater.inflate(C2656R.layout.slot_compression, viewGroup, false);
        m13528c();
        return this.f8707g;
    }

    public void onDetach() {
        super.onDetach();
        this.f8708h = null;
    }
}
