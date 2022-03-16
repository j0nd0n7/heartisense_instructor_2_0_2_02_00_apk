package com.imlabworld.HS_Instructor;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.woxthebox.draglistview.C2656R;

/* renamed from: com.imlabworld.HS_Instructor.be */
public class C2442be extends Fragment implements View.OnClickListener {

    /* renamed from: a */
    private static final String f8594a = "param1";

    /* renamed from: b */
    private static final String f8595b = "param2";

    /* renamed from: c */
    private static final String f8596c = "param3";

    /* renamed from: d */
    private int f8597d;

    /* renamed from: e */
    private int f8598e;

    /* renamed from: f */
    private String f8599f;

    /* renamed from: g */
    private View f8600g;

    /* renamed from: h */
    private C2444b f8601h;

    /* renamed from: i */
    private TextView f8602i;

    /* renamed from: j */
    private TextView f8603j;

    /* renamed from: k */
    private TextView f8604k;

    /* renamed from: com.imlabworld.HS_Instructor.be$a */
    public enum C2443a {
        ASSIGN
    }

    /* renamed from: com.imlabworld.HS_Instructor.be$b */
    public interface C2444b {
        /* renamed from: a */
        void mo8591a(int i, C2443a aVar);
    }

    /* renamed from: a */
    public static C2442be m13502a(int i, int i2, String str) {
        C2442be beVar = new C2442be();
        Bundle bundle = new Bundle();
        bundle.putInt(f8594a, i);
        bundle.putInt(f8595b, i2);
        bundle.putString(f8596c, str);
        beVar.setArguments(bundle);
        return beVar;
    }

    /* renamed from: a */
    private void m13503a() {
        this.f8602i = (TextView) this.f8600g.findViewById(C2656R.C2657id.basic_slot_name);
        this.f8603j = (TextView) this.f8600g.findViewById(C2656R.C2657id.basic_student_name);
        this.f8604k = (TextView) this.f8600g.findViewById(C2656R.C2657id.basic_content_txt);
        this.f8602i.setText(((char) (this.f8597d + 65)) + "");
        this.f8604k.setText("");
        this.f8603j.setOnClickListener(this);
    }

    /* renamed from: a */
    public void mo8975a(int i) {
        this.f8598e = i;
        switch (i) {
            case 1:
                this.f8604k.setText(C2557y.f9835g.f10302cq);
                return;
            case 2:
                this.f8604k.setText(C2557y.f9835g.f10227bU);
                return;
            case 3:
                this.f8604k.setText(C2557y.f9835g.f10229bW);
                return;
            case 4:
                this.f8604k.setText(C2557y.f9835g.f10300co);
                return;
            case 5:
                this.f8604k.setText(C2557y.f9835g.f10302cq);
                return;
            case 6:
                this.f8604k.setText(C2557y.f9835g.f10231bY);
                return;
            case 7:
                this.f8604k.setText(C2557y.f9835g.f10394ec);
                return;
            case 8:
                this.f8604k.setText(C2557y.f9835g.f10150X);
                return;
            case 9:
                this.f8604k.setText(C2557y.f9835g.f10143Q);
                return;
            case 10:
                this.f8604k.setText(C2557y.f9835g.f10394ec);
                return;
            case 20:
                this.f8604k.setText(C2557y.f9835g.f10150X);
                return;
            default:
                this.f8604k.setText("");
                return;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo8976a(String str) {
        this.f8599f = str;
        if (this.f8599f != null) {
            this.f8603j.setText(this.f8599f);
        } else {
            this.f8603j.setText(C2557y.f9835g.f10275cP);
        }
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (activity instanceof C2444b) {
            this.f8601h = (C2444b) activity;
            return;
        }
        throw new RuntimeException(activity.toString() + " must implement OnFragmentInteractionListener");
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case C2656R.C2657id.basic_student_name /*2131230822*/:
                this.f8601h.mo8591a(this.f8597d, C2443a.ASSIGN);
                return;
            default:
                return;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.f8597d = getArguments().getInt(f8594a);
            this.f8598e = getArguments().getInt(f8595b);
            this.f8599f = getArguments().getString(f8596c);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f8600g = layoutInflater.inflate(C2656R.layout.slot_basic, viewGroup, false);
        m13503a();
        return this.f8600g;
    }

    public void onDetach() {
        super.onDetach();
        this.f8601h = null;
    }
}
