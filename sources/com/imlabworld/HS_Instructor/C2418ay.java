package com.imlabworld.HS_Instructor;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.ssomai.android.scalablelayout.ScalableLayout;
import com.woxthebox.draglistview.C2656R;

/* renamed from: com.imlabworld.HS_Instructor.ay */
public class C2418ay extends Fragment implements View.OnClickListener {

    /* renamed from: a */
    private static final String f8344a = "param";

    /* renamed from: b */
    private String f8345b;

    /* renamed from: c */
    private ScalableLayout f8346c;

    /* renamed from: d */
    private TextView f8347d;

    /* renamed from: e */
    private ImageView f8348e;

    /* renamed from: f */
    private TextView f8349f;

    /* renamed from: g */
    private ImageView f8350g;

    /* renamed from: h */
    private TextView f8351h;

    /* renamed from: i */
    private ImageView f8352i;

    /* renamed from: j */
    private TextView f8353j;

    /* renamed from: k */
    private ImageView f8354k;

    /* renamed from: l */
    private ImageView f8355l;

    /* renamed from: m */
    private ImageView f8356m;

    /* renamed from: n */
    private ImageView f8357n;

    /* renamed from: o */
    private ImageView f8358o;

    /* renamed from: p */
    private TextView f8359p;

    /* renamed from: q */
    private C2420b f8360q;

    /* renamed from: r */
    private View f8361r;

    /* renamed from: com.imlabworld.HS_Instructor.ay$a */
    public enum C2419a {
        SETTING,
        DATAMANAGEMENT,
        START,
        ASSIGN,
        OPEN,
        CLOSE
    }

    /* renamed from: com.imlabworld.HS_Instructor.ay$b */
    public interface C2420b {
        /* renamed from: a */
        void mo8601a(C2419a aVar);
    }

    /* renamed from: a */
    public static C2418ay m13397a(String str) {
        C2418ay ayVar = new C2418ay();
        Bundle bundle = new Bundle();
        bundle.putString(f8344a, str);
        ayVar.setArguments(bundle);
        return ayVar;
    }

    /* renamed from: d */
    private void m13398d() {
        this.f8346c = (ScalableLayout) this.f8361r.findViewById(C2656R.C2657id.navigation_sc);
        this.f8347d = (TextView) this.f8361r.findViewById(C2656R.C2657id.navigation_setting_title);
        this.f8348e = (ImageView) this.f8361r.findViewById(C2656R.C2657id.navigation_setting_btn);
        this.f8349f = (TextView) this.f8361r.findViewById(C2656R.C2657id.navigation_datamanagement_title);
        this.f8350g = (ImageView) this.f8361r.findViewById(C2656R.C2657id.navigation_datamanagement_btn);
        this.f8351h = (TextView) this.f8361r.findViewById(C2656R.C2657id.navigation_start_title);
        this.f8352i = (ImageView) this.f8361r.findViewById(C2656R.C2657id.navigation_start_btn);
        this.f8353j = (TextView) this.f8361r.findViewById(C2656R.C2657id.navigation_assign_title);
        this.f8354k = (ImageView) this.f8361r.findViewById(C2656R.C2657id.navigation_assign_btn);
        this.f8355l = (ImageView) this.f8361r.findViewById(C2656R.C2657id.navigation_open_btn);
        this.f8357n = (ImageView) this.f8361r.findViewById(C2656R.C2657id.navigation_open2_btn);
        this.f8356m = (ImageView) this.f8361r.findViewById(C2656R.C2657id.navigation_close_btn);
        this.f8358o = (ImageView) this.f8361r.findViewById(C2656R.C2657id.navigation_close2_btn);
        this.f8359p = (TextView) this.f8361r.findViewById(C2656R.C2657id.navigation_version_txt);
        this.f8347d.setText(C2557y.f9835g.f10516gs);
        this.f8349f.setText(C2557y.f9835g.f10519gv);
        if (C2557y.f9832d.f9745a == 3) {
            this.f8351h.setText(C2557y.f9835g.f10518gu);
        } else {
            this.f8351h.setText(C2557y.f9835g.f10517gt);
        }
        this.f8353j.setText(C2557y.f9835g.f10131E);
        this.f8359p.setText("V " + this.f8345b);
        this.f8355l.setVisibility(0);
        this.f8357n.setVisibility(0);
        this.f8356m.setVisibility(4);
        this.f8358o.setVisibility(4);
        this.f8346c.setOnClickListener(this);
        this.f8347d.setOnClickListener(this);
        this.f8348e.setOnClickListener(this);
        this.f8349f.setOnClickListener(this);
        this.f8350g.setOnClickListener(this);
        this.f8351h.setOnClickListener(this);
        this.f8352i.setOnClickListener(this);
        this.f8353j.setOnClickListener(this);
        this.f8354k.setOnClickListener(this);
        this.f8355l.setOnClickListener(this);
        this.f8357n.setOnClickListener(this);
        this.f8356m.setOnClickListener(this);
        this.f8358o.setOnClickListener(this);
    }

    /* renamed from: a */
    public void mo8907a() {
        this.f8349f.setOnClickListener((View.OnClickListener) null);
        this.f8350g.setOnClickListener((View.OnClickListener) null);
        this.f8351h.setOnClickListener((View.OnClickListener) null);
        this.f8352i.setOnClickListener((View.OnClickListener) null);
        this.f8353j.setOnClickListener((View.OnClickListener) null);
        this.f8354k.setOnClickListener((View.OnClickListener) null);
        this.f8349f.setAlpha(0.15f);
        this.f8350g.setAlpha(0.15f);
        this.f8351h.setAlpha(0.15f);
        this.f8352i.setAlpha(0.15f);
        this.f8353j.setAlpha(0.15f);
        this.f8354k.setAlpha(0.15f);
    }

    /* renamed from: b */
    public void mo8908b() {
        this.f8349f.setOnClickListener(this);
        this.f8350g.setOnClickListener(this);
        this.f8351h.setOnClickListener(this);
        this.f8352i.setOnClickListener(this);
        this.f8353j.setOnClickListener(this);
        this.f8354k.setOnClickListener(this);
        this.f8349f.setAlpha(1.0f);
        this.f8350g.setAlpha(1.0f);
        this.f8351h.setAlpha(1.0f);
        this.f8352i.setAlpha(1.0f);
        this.f8353j.setAlpha(1.0f);
        this.f8354k.setAlpha(1.0f);
    }

    /* renamed from: c */
    public void mo8909c() {
        this.f8347d.setText(C2557y.f9835g.f10516gs);
        this.f8349f.setText(C2557y.f9835g.f10519gv);
        if (C2557y.f9832d.f9745a == 3) {
            this.f8351h.setText(C2557y.f9835g.f10518gu);
        } else {
            this.f8351h.setText(C2557y.f9835g.f10517gt);
        }
        this.f8353j.setText(C2557y.f9835g.f10131E);
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (activity instanceof C2420b) {
            this.f8360q = (C2420b) activity;
            return;
        }
        throw new RuntimeException(activity.toString() + " must implement OnFragmentInteractionListener");
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case C2656R.C2657id.navigation_assign_btn /*2131231664*/:
            case C2656R.C2657id.navigation_assign_title /*2131231665*/:
                this.f8360q.mo8601a(C2419a.ASSIGN);
                return;
            case C2656R.C2657id.navigation_close2_btn /*2131231667*/:
            case C2656R.C2657id.navigation_close_btn /*2131231668*/:
                this.f8355l.setVisibility(0);
                this.f8357n.setVisibility(0);
                this.f8356m.setVisibility(4);
                this.f8358o.setVisibility(4);
                this.f8360q.mo8601a(C2419a.CLOSE);
                return;
            case C2656R.C2657id.navigation_datamanagement_btn /*2131231669*/:
            case C2656R.C2657id.navigation_datamanagement_title /*2131231670*/:
                this.f8360q.mo8601a(C2419a.DATAMANAGEMENT);
                return;
            case C2656R.C2657id.navigation_open2_btn /*2131231671*/:
            case C2656R.C2657id.navigation_open_btn /*2131231672*/:
                this.f8355l.setVisibility(4);
                this.f8357n.setVisibility(4);
                this.f8356m.setVisibility(0);
                this.f8358o.setVisibility(0);
                this.f8360q.mo8601a(C2419a.OPEN);
                return;
            case C2656R.C2657id.navigation_setting_btn /*2131231674*/:
            case C2656R.C2657id.navigation_setting_title /*2131231675*/:
                this.f8360q.mo8601a(C2419a.SETTING);
                return;
            case C2656R.C2657id.navigation_start_btn /*2131231676*/:
            case C2656R.C2657id.navigation_start_title /*2131231677*/:
                this.f8360q.mo8601a(C2419a.START);
                return;
            default:
                return;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.f8345b = getArguments().getString(f8344a);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f8361r = layoutInflater.inflate(C2656R.layout.navigation_bar, viewGroup, false);
        m13398d();
        return this.f8361r;
    }

    public void onDetach() {
        super.onDetach();
        this.f8360q = null;
    }
}
