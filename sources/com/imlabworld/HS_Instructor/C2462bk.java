package com.imlabworld.HS_Instructor;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.woxthebox.draglistview.C2656R;

/* renamed from: com.imlabworld.HS_Instructor.bk */
public class C2462bk extends Fragment implements View.OnClickListener, View.OnLongClickListener {

    /* renamed from: a */
    private static final String f8789a = "param1";

    /* renamed from: b */
    private View f8790b;

    /* renamed from: c */
    private C2464b f8791c;

    /* renamed from: d */
    private final TextView[] f8792d = new TextView[6];

    /* renamed from: e */
    private final String[] f8793e = new String[6];

    /* renamed from: f */
    private int f8794f;

    /* renamed from: g */
    private C2338ae[] f8795g;

    /* renamed from: com.imlabworld.HS_Instructor.bk$a */
    public enum C2463a {
        CHANGE_KIT,
        CONNECT,
        DISCONNECT
    }

    /* renamed from: com.imlabworld.HS_Instructor.bk$b */
    public interface C2464b {
        /* renamed from: a */
        void mo8597a(int i, C2463a aVar);
    }

    /* renamed from: a */
    public static C2462bk m13555a() {
        C2462bk bkVar = new C2462bk();
        bkVar.setArguments(new Bundle());
        return bkVar;
    }

    /* renamed from: a */
    private void m13556a(int i) {
        if (i != this.f8794f) {
            this.f8794f = i;
            Log.e("selectedKit", "input " + i);
            this.f8791c.mo8597a(i, C2463a.CHANGE_KIT);
        }
    }

    /* renamed from: b */
    private void m13557b() {
        this.f8792d[0] = (TextView) this.f8790b.findViewById(C2656R.C2657id.connect_slot1);
        this.f8792d[1] = (TextView) this.f8790b.findViewById(C2656R.C2657id.connect_slot2);
        this.f8792d[2] = (TextView) this.f8790b.findViewById(C2656R.C2657id.connect_slot3);
        this.f8792d[3] = (TextView) this.f8790b.findViewById(C2656R.C2657id.connect_slot4);
        this.f8792d[4] = (TextView) this.f8790b.findViewById(C2656R.C2657id.connect_slot5);
        this.f8792d[5] = (TextView) this.f8790b.findViewById(C2656R.C2657id.connect_slot6);
        for (int i = 0; i < 6; i++) {
            this.f8792d[i].setOnClickListener(this);
        }
    }

    /* renamed from: b */
    private void m13558b(int i, C2338ae[] aeVarArr) {
        this.f8795g = aeVarArr;
        if (this.f8795g[i].f7851a.f9568a) {
            this.f8793e[i] = this.f8795g[i].f7848U.mo9553b();
            if (this.f8794f == i) {
                this.f8792d[i].setBackgroundResource(C2656R.drawable.btn_connect_temp_selected);
            } else {
                this.f8792d[i].setBackgroundResource(C2656R.drawable.btn_connect_temp_unselected);
            }
            this.f8792d[i].setText(this.f8793e[i]);
            this.f8792d[i].setTextColor(-13260401);
            return;
        }
        this.f8793e[i] = null;
        this.f8792d[i].setBackgroundResource(C2656R.drawable.btn_connect_temp_unselected);
        if (i == this.f8794f || this.f8794f == -1) {
            int i2 = 0;
            while (true) {
                if (i2 >= 6) {
                    i2 = -1;
                    break;
                } else if (this.f8793e[i2] != null) {
                    this.f8792d[i2].setBackgroundResource(C2656R.drawable.btn_connect_temp_selected);
                    break;
                } else {
                    i2++;
                }
            }
            m13556a(i2);
        }
        this.f8792d[i].setText(C2557y.f9835g.f10132F);
        this.f8792d[i].setTextColor(-4868683);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9037a(int i, C2338ae[] aeVarArr) {
        this.f8795g = aeVarArr;
        this.f8794f = i;
        Log.e("?!", "TEMP CONNECT");
        for (int i2 = 0; i2 < 6; i2++) {
            this.f8792d[i2].setOnClickListener(this);
            this.f8792d[i2].setOnLongClickListener(this);
            m13558b(i2, aeVarArr);
        }
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (activity instanceof C2464b) {
            this.f8791c = (C2464b) activity;
            return;
        }
        throw new RuntimeException(activity.toString() + " must implement OnFragmentInteractionListener");
    }

    public void onClick(View view) {
        int id = view.getId();
        switch (id) {
            case C2656R.C2657id.connect_slot1 /*2131230915*/:
            case C2656R.C2657id.connect_slot2 /*2131230916*/:
            case C2656R.C2657id.connect_slot3 /*2131230917*/:
            case C2656R.C2657id.connect_slot4 /*2131230918*/:
            case C2656R.C2657id.connect_slot5 /*2131230919*/:
            case C2656R.C2657id.connect_slot6 /*2131230920*/:
                int i = 0;
                while (true) {
                    if (i >= 6) {
                        i = 0;
                    } else if (this.f8792d[i].getId() != id) {
                        i++;
                    }
                }
                if (!this.f8795g[i].f7851a.f9568a) {
                    this.f8791c.mo8597a(i, C2463a.CONNECT);
                    this.f8792d[i].setOnClickListener((View.OnClickListener) null);
                    this.f8792d[i].setText(C2557y.f9835g.f10134H);
                    return;
                } else if (i != this.f8794f) {
                    int i2 = this.f8794f;
                    m13556a(i);
                    m13558b(i, this.f8795g);
                    if (i2 != -1) {
                        m13558b(i2, this.f8795g);
                        return;
                    }
                    return;
                } else {
                    return;
                }
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
        this.f8790b = layoutInflater.inflate(C2656R.layout.temp_connect, viewGroup, false);
        for (int i = 0; i < 6; i++) {
            this.f8793e[i] = null;
        }
        m13557b();
        return this.f8790b;
    }

    public void onDetach() {
        super.onDetach();
        this.f8791c = null;
    }

    public boolean onLongClick(View view) {
        int id = view.getId();
        switch (id) {
            case C2656R.C2657id.connect_slot1 /*2131230915*/:
            case C2656R.C2657id.connect_slot2 /*2131230916*/:
            case C2656R.C2657id.connect_slot3 /*2131230917*/:
            case C2656R.C2657id.connect_slot4 /*2131230918*/:
            case C2656R.C2657id.connect_slot5 /*2131230919*/:
            case C2656R.C2657id.connect_slot6 /*2131230920*/:
                int i = 0;
                while (true) {
                    if (i >= 6) {
                        i = 0;
                    } else if (this.f8792d[i].getId() != id) {
                        i++;
                    }
                }
                if (!this.f8795g[i].f7851a.f9568a) {
                    return false;
                }
                this.f8791c.mo8597a(i, C2463a.DISCONNECT);
                return true;
            default:
                return false;
        }
    }
}
