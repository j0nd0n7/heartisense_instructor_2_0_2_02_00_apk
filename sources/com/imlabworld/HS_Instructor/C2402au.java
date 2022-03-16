package com.imlabworld.HS_Instructor;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.DialogInterface;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ExpandableListView;
import android.widget.TextView;
import com.imlabworld.HS_Instructor.C2365al;
import com.ssomai.android.scalablelayout.ScalableLayout;
import com.woxthebox.draglistview.C2656R;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.imlabworld.HS_Instructor.au */
public class C2402au extends Fragment implements View.OnClickListener, AdapterView.OnItemClickListener, ExpandableListView.OnChildClickListener, ExpandableListView.OnGroupClickListener, ExpandableListView.OnGroupCollapseListener, ExpandableListView.OnGroupExpandListener, C2365al.C2370b {

    /* renamed from: a */
    private static final String f8168a = "param";

    /* renamed from: b */
    private String f8169b;

    /* renamed from: c */
    private View f8170c;

    /* renamed from: d */
    private C2404a f8171d;

    /* renamed from: e */
    private ScalableLayout f8172e;

    /* renamed from: f */
    private ExpandableListView f8173f;

    /* renamed from: g */
    private ScalableLayout f8174g;

    /* renamed from: h */
    private TextView f8175h;

    /* renamed from: i */
    private FragmentManager f8176i;

    /* renamed from: j */
    private FragmentTransaction f8177j;

    /* renamed from: k */
    private C2515br f8178k;

    /* renamed from: l */
    private C2365al f8179l;

    /* renamed from: m */
    private int f8180m;

    /* renamed from: n */
    private ArrayList<C2543k> f8181n = null;

    /* renamed from: o */
    private ArrayList<ArrayList<C2554v>> f8182o = null;

    /* renamed from: p */
    private C2548p f8183p;

    /* renamed from: com.imlabworld.HS_Instructor.au$a */
    public interface C2404a {
        /* renamed from: a */
        void mo8609a(ArrayList<C2543k> arrayList, ArrayList<C2553u> arrayList2, ArrayList<C2539g> arrayList3, ArrayList<C2544l> arrayList4);
    }

    /* renamed from: a */
    public static C2402au m13344a(String str) {
        C2402au auVar = new C2402au();
        Bundle bundle = new Bundle();
        bundle.putString(f8168a, str);
        auVar.setArguments(bundle);
        return auVar;
    }

    /* renamed from: a */
    private static boolean m13345a(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        NetworkInfo networkInfo = connectivityManager.getNetworkInfo(0);
        NetworkInfo networkInfo2 = connectivityManager.getNetworkInfo(1);
        NetworkInfo networkInfo3 = connectivityManager.getNetworkInfo(6);
        boolean isConnected = networkInfo3 != null ? networkInfo3.isConnected() : false;
        if (networkInfo != null) {
            if (networkInfo.isConnected() || networkInfo2.isConnected() || isConnected) {
                return true;
            }
        } else if (networkInfo2.isConnected() || isConnected) {
            return true;
        }
        new AlertDialog.Builder(context).setTitle(C2557y.f9835g.f10221bO).setMessage(C2557y.f9835g.f10177aX).setPositiveButton(C2557y.f9835g.f10209bC, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }).show().setCanceledOnTouchOutside(false);
        return false;
    }

    /* renamed from: a */
    public void mo8843a() {
        this.f8175h.setText(C2557y.f9835g.f10208bB);
    }

    /* renamed from: a */
    public void mo8772a(int i) {
        Log.e("Click!!", i + " ");
        this.f8179l.mo8757b(i);
    }

    /* renamed from: a */
    public void mo8773a(int i, int i2) {
        Log.e("Delete Click!!", i + " " + i2);
        this.f8183p.mo9601i(((C2554v) this.f8182o.get(i).get(i2)).mo9731b());
        mo8844b();
    }

    /* renamed from: b */
    public void mo8844b() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        this.f8181n = this.f8183p.mo9572a();
        this.f8182o = new ArrayList<>();
        Iterator<C2543k> it = this.f8181n.iterator();
        while (it.hasNext()) {
            ArrayList arrayList = new ArrayList();
            ArrayList<C2539g> e = this.f8183p.mo9594e(it.next().mo9455a());
            if (e != null) {
                Iterator<C2539g> it2 = e.iterator();
                while (it2.hasNext()) {
                    C2553u j = this.f8183p.mo9602j(it2.next().mo9393c());
                    ArrayList<C2544l> m = this.f8183p.mo9605m(j.mo9715b());
                    int i7 = m != null ? m.get(m.size() - 1).mo9487i() : -1;
                    ArrayList<C2544l> a = this.f8183p.mo9573a(j.mo9715b(), 1, 0);
                    if (a == null || a.size() <= 0) {
                        i = 0;
                    } else {
                        ArrayList<C2544l> b = this.f8183p.mo9579b(j.mo9715b(), 1, 0);
                        i = (b == null || b.size() <= 0) ? 1 : 2;
                    }
                    ArrayList<C2544l> a2 = this.f8183p.mo9573a(j.mo9715b(), 2, 0);
                    if (a2 == null || a2.size() <= 0) {
                        i2 = 0;
                    } else {
                        ArrayList<C2544l> b2 = this.f8183p.mo9579b(j.mo9715b(), 2, 0);
                        i2 = (b2 == null || b2.size() <= 0) ? 1 : 2;
                    }
                    ArrayList<C2544l> a3 = this.f8183p.mo9573a(j.mo9715b(), 3, 0);
                    if (a3 == null || a3.size() <= 0) {
                        i3 = 0;
                    } else {
                        ArrayList<C2544l> b3 = this.f8183p.mo9579b(j.mo9715b(), 3, 0);
                        i3 = (b3 == null || b3.size() <= 0) ? 1 : 2;
                    }
                    ArrayList<C2544l> a4 = this.f8183p.mo9573a(j.mo9715b(), 1, 1);
                    if (a4 == null || a4.size() <= 0) {
                        i4 = 0;
                    } else {
                        ArrayList<C2544l> b4 = this.f8183p.mo9579b(j.mo9715b(), 1, 1);
                        i4 = (b4 == null || b4.size() <= 0) ? 1 : 2;
                    }
                    ArrayList<C2544l> a5 = this.f8183p.mo9573a(j.mo9715b(), 2, 1);
                    if (a5 == null || a5.size() <= 0) {
                        i5 = 0;
                    } else {
                        ArrayList<C2544l> b5 = this.f8183p.mo9579b(j.mo9715b(), 2, 1);
                        i5 = (b5 == null || b5.size() <= 0) ? 1 : 2;
                    }
                    ArrayList<C2544l> a6 = this.f8183p.mo9573a(j.mo9715b(), 3, 1);
                    if (a6 == null || a6.size() <= 0) {
                        i6 = 0;
                    } else {
                        ArrayList<C2544l> b6 = this.f8183p.mo9579b(j.mo9715b(), 3, 1);
                        i6 = (b6 == null || b6.size() <= 0) ? 1 : 2;
                    }
                    arrayList.add(new C2554v(j.mo9715b(), j.mo9718c(), j.mo9722d(), j.mo9723e(), j.mo9726h(), j.mo9724f(), j.mo9725g(), i7, i, i2, i3, i4, i5, i6));
                }
            }
            this.f8182o.add(arrayList);
        }
        this.f8179l = new C2365al(getActivity(), this.f8181n, this.f8182o, this);
        this.f8173f.setAdapter(this.f8179l);
        this.f8173f.expandGroup(0);
        this.f8174g.setVisibility(4);
    }

    /* renamed from: b */
    public void mo8774b(int i, int i2) {
        Log.e("Click!!", i + " " + i2);
        this.f8174g.setVisibility(0);
        this.f8178k.mo9261a(((C2554v) this.f8182o.get(i).get(i2)).mo9731b());
    }

    /* renamed from: c */
    public void mo8845c() {
        this.f8174g.setVisibility(4);
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (activity instanceof C2404a) {
            this.f8171d = (C2404a) activity;
            return;
        }
        throw new RuntimeException(activity.toString() + " must implement OnFragmentInteractionListener");
    }

    public boolean onChildClick(ExpandableListView expandableListView, View view, int i, int i2, long j) {
        this.f8179l.mo8758b(i, i2);
        return true;
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case C2656R.C2657id.data_management_send_btn /*2131230938*/:
                if (m13345a((Context) getActivity()) && C2557y.f9811B.mo9548c() != -1) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList<ArrayList<Boolean>> a = this.f8179l.mo8756a();
                    ArrayList arrayList4 = new ArrayList();
                    int i = 0;
                    while (true) {
                        int i2 = i;
                        if (i2 < this.f8182o.size()) {
                            C2543k kVar = this.f8181n.get(i2);
                            ArrayList arrayList5 = this.f8182o.get(i2);
                            ArrayList arrayList6 = a.get(i2);
                            boolean z = kVar.mo9468g() == 0;
                            for (int i3 = 0; i3 < arrayList5.size(); i3++) {
                                if (((Boolean) arrayList6.get(i3)).booleanValue()) {
                                    C2554v vVar = (C2554v) arrayList5.get(i3);
                                    ArrayList<C2544l> n = this.f8183p.mo9606n(vVar.mo9731b());
                                    C2553u j = this.f8183p.mo9602j(vVar.mo9731b());
                                    C2539g c = this.f8183p.mo9585c(kVar.mo9455a(), vVar.mo9731b());
                                    if (j.f9761c == 0) {
                                        arrayList2.add(j);
                                    }
                                    if (c.f9636b == 0) {
                                        arrayList3.add(c);
                                    }
                                    if (z) {
                                        arrayList.add(kVar);
                                        z = false;
                                    }
                                    if (n != null) {
                                        Iterator<C2544l> it = n.iterator();
                                        while (it.hasNext()) {
                                            arrayList4.add(it.next());
                                        }
                                    }
                                }
                            }
                            i = i2 + 1;
                        } else {
                            this.f8171d.mo8609a(arrayList, arrayList2, arrayList3, arrayList4);
                            return;
                        }
                    }
                } else {
                    return;
                }
                break;
            default:
                return;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.f8169b = getArguments().getString(f8168a);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f8183p = new C2548p(getActivity());
        this.f8170c = layoutInflater.inflate(C2656R.layout.data_management, viewGroup, false);
        this.f8172e = (ScalableLayout) this.f8170c.findViewById(C2656R.C2657id.data_management_sc);
        this.f8175h = (TextView) this.f8170c.findViewById(C2656R.C2657id.data_management_send_btn);
        this.f8173f = (ExpandableListView) this.f8170c.findViewById(C2656R.C2657id.data_management_listview);
        this.f8174g = (ScalableLayout) this.f8170c.findViewById(C2656R.C2657id.fragment_view_result);
        this.f8176i = getFragmentManager();
        this.f8178k = C2515br.m13764a("");
        this.f8177j = this.f8176i.beginTransaction();
        this.f8177j.add(this.f8174g.getId(), this.f8178k);
        this.f8177j.commit();
        this.f8174g.setVisibility(4);
        this.f8175h.setText(C2557y.f9835g.f10208bB);
        this.f8172e.setOnClickListener(this);
        this.f8175h.setOnClickListener(this);
        this.f8173f.setOnGroupClickListener(this);
        this.f8173f.setOnChildClickListener(this);
        this.f8173f.setOnGroupCollapseListener(this);
        this.f8173f.setOnGroupExpandListener(this);
        mo8844b();
        return this.f8170c;
    }

    public void onDetach() {
        super.onDetach();
        this.f8171d = null;
    }

    public boolean onGroupClick(ExpandableListView expandableListView, View view, int i, long j) {
        if (Boolean.valueOf(!expandableListView.isGroupExpanded(i)).booleanValue()) {
            expandableListView.expandGroup(i);
        } else {
            expandableListView.collapseGroup(i);
        }
        return true;
    }

    public void onGroupCollapse(int i) {
    }

    public void onGroupExpand(int i) {
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f8180m = i;
    }
}
