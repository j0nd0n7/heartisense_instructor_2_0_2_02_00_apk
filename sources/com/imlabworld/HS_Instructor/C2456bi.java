package com.imlabworld.HS_Instructor;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.p010v4.view.C1040ar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.ssomai.android.scalablelayout.ScalableLayout;
import com.woxthebox.draglistview.C2656R;

/* renamed from: com.imlabworld.HS_Instructor.bi */
public class C2456bi extends Fragment implements View.OnClickListener {

    /* renamed from: a */
    private static final String f8734a = "param1";

    /* renamed from: b */
    private static final String f8735b = "param2";

    /* renamed from: c */
    private static final String f8736c = "param3";

    /* renamed from: d */
    private int f8737d;

    /* renamed from: e */
    private int f8738e;

    /* renamed from: f */
    private String f8739f;

    /* renamed from: g */
    private String f8740g;

    /* renamed from: h */
    private boolean f8741h;

    /* renamed from: i */
    private View f8742i;

    /* renamed from: j */
    private C2458b f8743j;

    /* renamed from: k */
    private TextView f8744k;

    /* renamed from: l */
    private TextView f8745l;

    /* renamed from: m */
    private ImageView f8746m;

    /* renamed from: n */
    private ScalableLayout f8747n;

    /* renamed from: o */
    private ImageView f8748o;

    /* renamed from: p */
    private TextView f8749p;

    /* renamed from: q */
    private TextView f8750q;

    /* renamed from: r */
    private ImageView f8751r;

    /* renamed from: s */
    private ImageView f8752s;

    /* renamed from: t */
    private ScalableLayout f8753t;

    /* renamed from: u */
    private final ImageView[] f8754u = new ImageView[3];

    /* renamed from: com.imlabworld.HS_Instructor.bi$a */
    public enum C2457a {
        REGISTER,
        PREV,
        CHANGE,
        CALIBRATION,
        DISCONNECT,
        ASSIGN,
        START
    }

    /* renamed from: com.imlabworld.HS_Instructor.bi$b */
    public interface C2458b {
        /* renamed from: a */
        void mo8595a(int i, C2457a aVar);
    }

    /* renamed from: a */
    public static C2456bi m13535a(int i, int i2, String str) {
        C2456bi biVar = new C2456bi();
        Bundle bundle = new Bundle();
        bundle.putInt(f8734a, i);
        bundle.putInt(f8735b, i2);
        bundle.putString(f8736c, str);
        Log.e("Connect", i + "");
        biVar.setArguments(bundle);
        return biVar;
    }

    /* renamed from: d */
    private void m13536d() {
        this.f8744k = (TextView) this.f8742i.findViewById(C2656R.C2657id.connect_slot_name);
        this.f8745l = (TextView) this.f8742i.findViewById(C2656R.C2657id.connect_student_name);
        this.f8746m = (ImageView) this.f8742i.findViewById(C2656R.C2657id.connect_close_btn);
        this.f8747n = (ScalableLayout) this.f8742i.findViewById(C2656R.C2657id.connect_connect_sc);
        this.f8748o = (ImageView) this.f8742i.findViewById(C2656R.C2657id.connect_connect_btn);
        this.f8749p = (TextView) this.f8742i.findViewById(C2656R.C2657id.connect_connect_txt);
        this.f8750q = (TextView) this.f8742i.findViewById(C2656R.C2657id.connect_change_btn);
        this.f8751r = (ImageView) this.f8742i.findViewById(C2656R.C2657id.connect_calibration_btn);
        this.f8752s = (ImageView) this.f8742i.findViewById(C2656R.C2657id.connect_start_btn);
        this.f8753t = (ScalableLayout) this.f8742i.findViewById(C2656R.C2657id.connect_conneting_sc);
        this.f8754u[0] = (ImageView) this.f8742i.findViewById(C2656R.C2657id.connect_loading1_img);
        this.f8754u[1] = (ImageView) this.f8742i.findViewById(C2656R.C2657id.connect_loading2_img);
        this.f8754u[2] = (ImageView) this.f8742i.findViewById(C2656R.C2657id.connect_loading3_img);
        this.f8744k.setText(((char) (this.f8737d + 65)) + "");
        if (this.f8738e == 4) {
            this.f8745l.setBackgroundResource(C2656R.drawable.btn_name);
            if (this.f8739f != null) {
                this.f8745l.setText(this.f8739f);
            } else {
                this.f8745l.setText(C2557y.f9835g.f10275cP);
            }
        } else {
            this.f8745l.setBackgroundColor(C1040ar.f3484r);
            this.f8745l.setText("");
        }
        this.f8749p.setText(C2557y.f9835g.f10471g);
        this.f8750q.setText(C2557y.f9835g.f10133G);
        this.f8745l.setOnClickListener(this);
        this.f8746m.setOnClickListener(this);
        this.f8748o.setOnClickListener(this);
        this.f8750q.setOnClickListener(this);
        this.f8751r.setOnClickListener(this);
        this.f8752s.setOnClickListener(this);
        m13537e();
    }

    /* renamed from: e */
    private void m13537e() {
        switch (this.f8738e) {
            case 1:
                this.f8747n.setVisibility(0);
                this.f8753t.setVisibility(4);
                this.f8746m.setVisibility(4);
                this.f8745l.setVisibility(4);
                this.f8749p.setVisibility(4);
                this.f8748o.setImageResource(C2656R.drawable.btn_bt_disconnected);
                this.f8750q.setVisibility(4);
                this.f8751r.setVisibility(4);
                return;
            case 2:
                this.f8747n.setVisibility(0);
                this.f8753t.setVisibility(4);
                this.f8746m.setVisibility(4);
                this.f8745l.setVisibility(4);
                this.f8749p.setVisibility(0);
                this.f8749p.setTextColor(-3750202);
                this.f8748o.setImageResource(C2656R.drawable.btn_bt_disconnected);
                this.f8750q.setVisibility(0);
                this.f8750q.setText(C2557y.f9835g.f10133G);
                this.f8750q.setTextColor(-3750202);
                this.f8751r.setVisibility(4);
                return;
            case 3:
                this.f8747n.setVisibility(4);
                this.f8753t.setVisibility(0);
                this.f8746m.setVisibility(4);
                this.f8745l.setVisibility(4);
                mo9016a(0);
                return;
            case 4:
                this.f8747n.setVisibility(0);
                this.f8753t.setVisibility(4);
                this.f8746m.setVisibility(0);
                this.f8745l.setVisibility(0);
                this.f8745l.setBackgroundResource(C2656R.drawable.btn_name);
                if (this.f8739f != null) {
                    this.f8745l.setText(this.f8739f);
                } else {
                    this.f8745l.setText(C2557y.f9835g.f10275cP);
                }
                this.f8749p.setVisibility(0);
                this.f8749p.setTextColor(-13520490);
                this.f8748o.setImageResource(C2656R.drawable.btn_bt_connected);
                this.f8750q.setVisibility(0);
                this.f8751r.setVisibility(0);
                if (this.f8741h) {
                    this.f8751r.setImageResource(C2656R.drawable.btn_cali_disable);
                    this.f8750q.setText(C2557y.f9835g.f10277cR);
                    this.f8750q.setTextColor(-3750202);
                    return;
                }
                this.f8751r.setImageResource(C2656R.drawable.btn_cali_able);
                this.f8750q.setText(C2557y.f9835g.f10278cS);
                this.f8750q.setTextColor(-13520490);
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public void mo9015a() {
        if (this.f8740g != null) {
            this.f8749p.setText(C2557y.f9835g.f10471g + this.f8740g);
        } else {
            this.f8749p.setText(C2557y.f9835g.f10471g);
        }
        m13537e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9016a(int i) {
        switch (i % 9) {
            case 0:
            case 1:
            case 2:
                this.f8754u[0].setImageResource(C2656R.drawable.img_loading_c6);
                this.f8754u[1].setImageResource(C2656R.drawable.img_loading_f4);
                this.f8754u[2].setImageResource(C2656R.drawable.img_loading_f4);
                return;
            case 3:
            case 4:
            case 5:
                this.f8754u[0].setImageResource(C2656R.drawable.img_loading_f4);
                this.f8754u[1].setImageResource(C2656R.drawable.img_loading_c6);
                this.f8754u[2].setImageResource(C2656R.drawable.img_loading_f4);
                return;
            case 6:
            case 7:
            case 8:
                this.f8754u[0].setImageResource(C2656R.drawable.img_loading_f4);
                this.f8754u[1].setImageResource(C2656R.drawable.img_loading_f4);
                this.f8754u[2].setImageResource(C2656R.drawable.img_loading_c6);
                return;
            default:
                return;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9017a(String str) {
        this.f8739f = str;
        if (this.f8739f != null) {
            this.f8745l.setText(this.f8739f);
        } else {
            this.f8745l.setText(C2557y.f9835g.f10275cP);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9018a(boolean z) {
        this.f8741h = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo9019b() {
        this.f8752s.setVisibility(0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo9020b(int i) {
        this.f8738e = i;
        m13537e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo9021b(String str) {
        this.f8740g = str;
        if (this.f8740g != null) {
            this.f8749p.setText(C2557y.f9835g.f10471g + this.f8740g);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo9022c() {
        this.f8752s.setVisibility(4);
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (activity instanceof C2458b) {
            this.f8743j = (C2458b) activity;
            return;
        }
        throw new RuntimeException(activity.toString() + " must implement OnFragmentInteractionListener");
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case C2656R.C2657id.connect_calibration_btn /*2131230903*/:
                if (this.f8738e == 4) {
                    this.f8743j.mo8595a(this.f8737d, C2457a.CALIBRATION);
                    return;
                }
                return;
            case C2656R.C2657id.connect_change_btn /*2131230904*/:
                switch (this.f8738e) {
                    case 1:
                    case 2:
                        this.f8743j.mo8595a(this.f8737d, C2457a.CHANGE);
                        return;
                    default:
                        return;
                }
            case C2656R.C2657id.connect_close_btn /*2131230905*/:
                this.f8743j.mo8595a(this.f8737d, C2457a.DISCONNECT);
                return;
            case C2656R.C2657id.connect_connect_btn /*2131230906*/:
                switch (this.f8738e) {
                    case 1:
                        this.f8743j.mo8595a(this.f8737d, C2457a.REGISTER);
                        return;
                    case 2:
                        this.f8743j.mo8595a(this.f8737d, C2457a.PREV);
                        return;
                    default:
                        return;
                }
            case C2656R.C2657id.connect_start_btn /*2131230922*/:
                this.f8743j.mo8595a(this.f8737d, C2457a.START);
                return;
            case C2656R.C2657id.connect_student_name /*2131230924*/:
                this.f8743j.mo8595a(this.f8737d, C2457a.ASSIGN);
                return;
            default:
                return;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.f8737d = getArguments().getInt(f8734a);
            this.f8738e = getArguments().getInt(f8735b);
            this.f8739f = getArguments().getString(f8736c);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f8742i = layoutInflater.inflate(C2656R.layout.slot_connect, viewGroup, false);
        this.f8741h = false;
        m13536d();
        Log.e("Connect Complete", this.f8737d + "");
        return this.f8742i;
    }

    public void onDetach() {
        super.onDetach();
        this.f8743j = null;
    }
}
