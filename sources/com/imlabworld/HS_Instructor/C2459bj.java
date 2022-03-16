package com.imlabworld.HS_Instructor;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.imlabworld.p079a.C2562a;
import com.imlabworld.p079a.C2591b;
import com.imlabworld.p079a.C2596d;
import com.imlabworld.p079a.C2597e;
import com.imlabworld.p079a.C2614s;
import com.imlabworld.p079a.C2615t;
import com.woxthebox.draglistview.C2656R;
import java.util.ArrayList;

/* renamed from: com.imlabworld.HS_Instructor.bj */
public class C2459bj extends Fragment implements View.OnClickListener {

    /* renamed from: a */
    private static final String f8763a = "param1";

    /* renamed from: b */
    private static final String f8764b = "param2";

    /* renamed from: c */
    private static final String f8765c = "param3";

    /* renamed from: d */
    private int f8766d;

    /* renamed from: e */
    private int f8767e;

    /* renamed from: f */
    private String f8768f;

    /* renamed from: g */
    private View f8769g;

    /* renamed from: h */
    private C2461b f8770h;

    /* renamed from: i */
    private TextView f8771i;

    /* renamed from: j */
    private TextView f8772j;

    /* renamed from: k */
    private TextView f8773k;

    /* renamed from: l */
    private TextView f8774l;

    /* renamed from: m */
    private TextView f8775m;

    /* renamed from: n */
    private TextView f8776n;

    /* renamed from: o */
    private TextView f8777o;

    /* renamed from: p */
    private TextView f8778p;

    /* renamed from: q */
    private TextView f8779q;

    /* renamed from: r */
    private TextView f8780r;

    /* renamed from: s */
    private TextView f8781s;

    /* renamed from: t */
    private ImageView f8782t;

    /* renamed from: u */
    private ImageView f8783u;

    /* renamed from: com.imlabworld.HS_Instructor.bj$a */
    public enum C2460a {
        DISCONNECT,
        ASSIGN,
        DETAIL,
        RETRY
    }

    /* renamed from: com.imlabworld.HS_Instructor.bj$b */
    public interface C2461b {
        /* renamed from: a */
        void mo8596a(int i, C2460a aVar);
    }

    /* renamed from: a */
    public static C2459bj m13547a(int i, int i2, String str) {
        C2459bj bjVar = new C2459bj();
        Bundle bundle = new Bundle();
        bundle.putInt(f8763a, i);
        bundle.putInt(f8764b, i2);
        bundle.putString(f8765c, str);
        bjVar.setArguments(bundle);
        return bjVar;
    }

    /* renamed from: b */
    private C2591b m13548b(ArrayList<C2615t> arrayList, ArrayList<C2614s> arrayList2) {
        return new C2562a(new C2596d(C2557y.f9853y.mo9662b() == 1, C2557y.f9853y.mo9664c() == 1, C2557y.f9853y.mo9666d() == 1, C2557y.f9853y.mo9668e() == 1, C2557y.f9853y.mo9670f() == 1, C2557y.f9853y.mo9672g() == 1, C2557y.f9853y.mo9674h()), new C2597e(C2557y.f9832d.mo9680b(), C2557y.f9832d.mo9681c(), C2557y.f9832d.f9755k, C2557y.f9832d.f9747c, C2557y.f9832d.f9751g, C2557y.f9832d.f9752h, C2557y.f9832d.f9753i)).mo9790a(arrayList, arrayList2);
    }

    /* renamed from: b */
    private void m13549b() {
        this.f8771i = (TextView) this.f8769g.findViewById(C2656R.C2657id.result_slot_name);
        this.f8772j = (TextView) this.f8769g.findViewById(C2656R.C2657id.result_student_name);
        this.f8773k = (TextView) this.f8769g.findViewById(C2656R.C2657id.result_total_score_title);
        this.f8774l = (TextView) this.f8769g.findViewById(C2656R.C2657id.result_total_score_txt);
        this.f8775m = (TextView) this.f8769g.findViewById(C2656R.C2657id.result_compression_score_title);
        this.f8776n = (TextView) this.f8769g.findViewById(C2656R.C2657id.result_compression_score_txt);
        this.f8777o = (TextView) this.f8769g.findViewById(C2656R.C2657id.result_breath_score_title);
        this.f8778p = (TextView) this.f8769g.findViewById(C2656R.C2657id.result_breath_score_txt);
        this.f8779q = (TextView) this.f8769g.findViewById(C2656R.C2657id.result_fraction_score_title);
        this.f8780r = (TextView) this.f8769g.findViewById(C2656R.C2657id.result_fraction_score_txt);
        this.f8781s = (TextView) this.f8769g.findViewById(C2656R.C2657id.result_view_detail_txt);
        this.f8782t = (ImageView) this.f8769g.findViewById(C2656R.C2657id.result_retry_btn);
        this.f8783u = (ImageView) this.f8769g.findViewById(C2656R.C2657id.result_calibration_btn);
        this.f8771i.setText(((char) (this.f8766d + 65)) + "");
        this.f8773k.setText(C2557y.f9835g.f10362dx);
        this.f8775m.setText(C2557y.f9835g.f10147U);
        this.f8777o.setText(C2557y.f9835g.f10148V);
        this.f8779q.setText(C2557y.f9835g.f10570i);
        this.f8781s.setText(C2557y.f9835g.f10358dt);
        this.f8772j.setOnClickListener(this);
        this.f8781s.setOnClickListener(this);
        this.f8782t.setOnClickListener(this);
        this.f8783u.setOnClickListener(this);
    }

    /* renamed from: a */
    public void mo9028a() {
        this.f8773k.setText(C2557y.f9835g.f10362dx);
        this.f8775m.setText(C2557y.f9835g.f10147U);
        this.f8777o.setText(C2557y.f9835g.f10148V);
        this.f8779q.setText(C2557y.f9835g.f10570i);
        this.f8781s.setText(C2557y.f9835g.f10358dt);
    }

    /* renamed from: a */
    public void mo9029a(int i) {
        this.f8767e = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9030a(String str) {
        this.f8768f = str;
        if (this.f8768f != null) {
            this.f8772j.setText(this.f8768f);
        } else {
            this.f8772j.setText(C2557y.f9835g.f10275cP);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9031a(ArrayList<C2615t> arrayList, ArrayList<C2614s> arrayList2) {
        C2556x.f9807x[this.f8766d] = m13548b(arrayList, arrayList2);
        C2591b bVar = C2556x.f9807x[this.f8766d];
        int j = (int) (bVar.mo9904j() * 100.0d);
        int g = (int) (bVar.mo9898g() * 100.0d);
        int h = (int) (bVar.mo9900h() * 100.0d);
        int i = (int) (bVar.mo9902i() * 100.0d);
        this.f8774l.setText(String.format("%d", new Object[]{Integer.valueOf(j)}));
        if (j >= 70) {
            this.f8773k.setTextColor(-13520490);
            this.f8774l.setTextColor(-13520490);
            this.f8781s.setTextColor(-13520490);
        } else {
            this.f8773k.setTextColor(-764642);
            this.f8774l.setTextColor(-764642);
            this.f8781s.setTextColor(-764642);
        }
        this.f8776n.setText(String.format("%d", new Object[]{Integer.valueOf(g)}) + "%");
        if (g >= 70) {
            this.f8775m.setTextColor(-13520490);
            this.f8776n.setTextColor(-13520490);
        } else {
            this.f8775m.setTextColor(-764642);
            this.f8776n.setTextColor(-764642);
        }
        this.f8778p.setText(String.format("%d", new Object[]{Integer.valueOf(h)}) + "%");
        if (h >= 70) {
            this.f8777o.setTextColor(-13520490);
            this.f8778p.setTextColor(-13520490);
        } else {
            this.f8777o.setTextColor(-764642);
            this.f8778p.setTextColor(-764642);
        }
        this.f8780r.setText(String.format("%d", new Object[]{Integer.valueOf(i)}) + "%");
        if (i >= 70) {
            this.f8779q.setTextColor(-13520490);
            this.f8780r.setTextColor(-13520490);
        } else {
            this.f8779q.setTextColor(-764642);
            this.f8780r.setTextColor(-764642);
        }
        if (g == -100) {
            this.f8775m.setTextColor(-10658467);
            this.f8776n.setText("-  ");
            this.f8776n.setTextColor(-10658467);
        }
        if (h == -100) {
            this.f8777o.setTextColor(-10658467);
            this.f8778p.setText("-  ");
            this.f8778p.setTextColor(-10658467);
        }
        if (i == -100) {
            this.f8779q.setTextColor(-10658467);
            this.f8780r.setText("-  ");
            this.f8780r.setTextColor(-10658467);
        }
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (activity instanceof C2461b) {
            this.f8770h = (C2461b) activity;
            return;
        }
        throw new RuntimeException(activity.toString() + " must implement OnFragmentInteractionListener");
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case C2656R.C2657id.result_retry_btn /*2131231703*/:
                this.f8770h.mo8596a(this.f8766d, C2460a.RETRY);
                return;
            case C2656R.C2657id.result_student_name /*2131231706*/:
                this.f8770h.mo8596a(this.f8766d, C2460a.ASSIGN);
                return;
            case C2656R.C2657id.result_view_detail_txt /*2131231709*/:
                this.f8770h.mo8596a(this.f8766d, C2460a.DETAIL);
                return;
            default:
                return;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.f8766d = getArguments().getInt(f8763a);
            this.f8767e = getArguments().getInt(f8764b);
            this.f8768f = getArguments().getString(f8765c);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f8769g = layoutInflater.inflate(C2656R.layout.slot_result, viewGroup, false);
        m13549b();
        return this.f8769g;
    }

    public void onDetach() {
        super.onDetach();
        this.f8770h = null;
    }
}
