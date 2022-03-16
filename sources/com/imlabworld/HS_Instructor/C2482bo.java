package com.imlabworld.HS_Instructor;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.p036v7.widget.LinearLayoutManager;
import android.util.Log;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.imlabworld.HS_Instructor.C2390ar;
import com.imlabworld.HS_Instructor.C2393as;
import com.ssomai.android.scalablelayout.ScalableLayout;
import com.woxthebox.draglistview.C2656R;
import com.woxthebox.draglistview.DragItem;
import com.woxthebox.draglistview.DragListView;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.imlabworld.HS_Instructor.bo */
public class C2482bo extends Fragment {

    /* renamed from: b */
    private static final String f8991b = "param";

    /* renamed from: a */
    boolean f8992a = true;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C2484b f8993c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C2338ae[] f8994d;

    /* renamed from: e */
    private C2485c f8995e;

    /* renamed from: com.imlabworld.HS_Instructor.bo$a */
    public enum C2483a {
        START,
        QUIT
    }

    /* renamed from: com.imlabworld.HS_Instructor.bo$b */
    public interface C2484b {
        /* renamed from: a */
        void mo8608a(C2483a aVar, int i, int i2);
    }

    /* renamed from: com.imlabworld.HS_Instructor.bo$c */
    class C2485c implements View.OnClickListener, C2390ar.C2391a, C2393as.C2394a {

        /* renamed from: a */
        final ScalableLayout f8999a;

        /* renamed from: b */
        final ImageView f9000b;

        /* renamed from: c */
        final ScalableLayout f9001c;

        /* renamed from: d */
        final TextView f9002d;

        /* renamed from: e */
        final ImageView f9003e;

        /* renamed from: f */
        final TextView f9004f;

        /* renamed from: g */
        final ImageView f9005g;

        /* renamed from: h */
        final TextView f9006h;

        /* renamed from: i */
        final TextView f9007i;

        /* renamed from: j */
        final ImageView f9008j;

        /* renamed from: k */
        final TextView f9009k;

        /* renamed from: l */
        final ImageView f9010l;

        /* renamed from: m */
        final TextView f9011m;

        /* renamed from: n */
        final TextView f9012n;

        /* renamed from: o */
        final ScalableLayout f9013o;

        /* renamed from: p */
        final DragListView f9014p;

        /* renamed from: q */
        C2393as f9015q;

        /* renamed from: r */
        final ScalableLayout f9016r;

        /* renamed from: s */
        final DragListView f9017s;

        /* renamed from: t */
        C2390ar f9018t;

        /* renamed from: u */
        final C2462bk f9019u = C2462bk.m13555a();

        /* renamed from: v */
        final FragmentManager f9020v;

        /* renamed from: w */
        final FragmentTransaction f9021w = this.f9020v.beginTransaction();

        public C2485c(View view) {
            this.f8999a = (ScalableLayout) view.findViewById(C2656R.C2657id.test_ready_sc);
            this.f9000b = (ImageView) view.findViewById(C2656R.C2657id.test_ready_pause_btn);
            this.f9001c = (ScalableLayout) view.findViewById(C2656R.C2657id.test_ready_connect_sc);
            this.f9002d = (TextView) view.findViewById(C2656R.C2657id.test_ready_info1_txt);
            this.f9003e = (ImageView) view.findViewById(C2656R.C2657id.test_ready_change_name_btn);
            this.f9004f = (TextView) view.findViewById(C2656R.C2657id.test_ready_change_name_btn_txt);
            this.f9005g = (ImageView) view.findViewById(C2656R.C2657id.test_ready_change_patient_btn);
            this.f9006h = (TextView) view.findViewById(C2656R.C2657id.test_ready_change_patient_btn_txt);
            this.f9007i = (TextView) view.findViewById(C2656R.C2657id.test_ready_info2_txt);
            this.f9008j = (ImageView) view.findViewById(C2656R.C2657id.test_ready_quit_btn);
            this.f9009k = (TextView) view.findViewById(C2656R.C2657id.test_ready_quit_btn_txt);
            this.f9010l = (ImageView) view.findViewById(C2656R.C2657id.test_ready_start_btn);
            this.f9011m = (TextView) view.findViewById(C2656R.C2657id.test_ready_start_btn_txt);
            this.f9012n = (TextView) view.findViewById(C2656R.C2657id.test_ready_tip_txt);
            this.f9013o = (ScalableLayout) view.findViewById(C2656R.C2657id.test_ready_waiting_student_sc);
            this.f9014p = (DragListView) view.findViewById(C2656R.C2657id.test_ready_waiting_student_listview);
            this.f9016r = (ScalableLayout) view.findViewById(C2656R.C2657id.test_ready_waiting_patient_sc);
            this.f9017s = (DragListView) view.findViewById(C2656R.C2657id.test_ready_waiting_patient_listview);
            this.f9020v = C2482bo.this.getFragmentManager();
            this.f9021w.add(this.f9001c.getId(), this.f9019u);
            this.f9021w.commit();
            this.f9014p.getRecyclerView().setVerticalScrollBarEnabled(true);
            this.f9014p.setDragListListener((DragListView.DragListListener) null);
            this.f9017s.getRecyclerView().setVerticalScrollBarEnabled(true);
            this.f9017s.setDragListListener((DragListView.DragListListener) null);
            this.f8999a.setOnClickListener(this);
            this.f9013o.setOnClickListener(this);
            this.f9016r.setOnClickListener(this);
            this.f9000b.setOnClickListener(this);
            this.f9003e.setOnClickListener(this);
            this.f9005g.setOnClickListener(this);
            this.f9008j.setOnClickListener(this);
            this.f9010l.setOnClickListener(this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo9141a() {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < C2465bl.f8802d.size(); i++) {
                arrayList.add(new Pair(Integer.valueOf(i), C2465bl.f8802d.get(i)));
            }
            boolean[] zArr = {C2557y.f9833e.f7880a, C2557y.f9833e.f7881b, C2557y.f9833e.f7882c};
            this.f9013o.setVisibility(0);
            this.f9014p.setLayoutManager(new LinearLayoutManager(C2482bo.this.getActivity()));
            this.f9015q = new C2393as(this, arrayList, C2656R.C2657id.test_ready_waiting_student_slot_move_btn, false, zArr);
            this.f9014p.setAdapter(this.f9015q, true);
            this.f9014p.setCanDragHorizontally(false);
            this.f9014p.setCustomDragItem((DragItem) null);
        }

        /* renamed from: a */
        public void mo8810a(int i) {
            C2553u a = C2465bl.f8801c.get(0).mo9306a();
            C2552t a2 = C2465bl.f8801c.get(0).mo9310b().clone();
            a2.mo9689f(i);
            if (C2465bl.f8803e) {
                for (int size = C2465bl.f8801c.size() - 1; size >= 0; size--) {
                    C2465bl.f8801c.remove(size);
                }
                boolean z = C2557y.f9833e.f7880a;
                int i2 = i - 1;
                C2552t tVar = a2;
                for (int i3 = 0; i3 < 3; i3++) {
                    switch (i2 + 1) {
                        case 1:
                            z = C2557y.f9833e.f7880a;
                            break;
                        case 2:
                            z = C2557y.f9833e.f7881b;
                            break;
                        case 3:
                            z = C2557y.f9833e.f7882c;
                            break;
                    }
                    if (z) {
                        tVar = tVar.clone();
                        tVar.mo9689f(i2 + 1);
                        C2465bl.f8801c.add(new C2527bs(a, tVar, true));
                    }
                    i2 = (i2 + 1) % 3;
                }
            } else if (C2465bl.f8801c != null && !C2465bl.f8803e) {
                C2465bl.f8801c.add(0, new C2527bs(a, a2, true));
            }
            mo9142a(false);
            mo9145d();
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo8813a(com.imlabworld.HS_Instructor.C2553u r10) {
            /*
                r9 = this;
                r8 = 3
                r3 = 0
                r4 = 1
                r5 = 2
                java.util.ArrayList[] r7 = new java.util.ArrayList[r8]
                r0 = r3
            L_0x0007:
                if (r0 >= r8) goto L_0x0013
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r7[r0] = r1
                int r0 = r0 + 1
                goto L_0x0007
            L_0x0013:
                r2 = r3
            L_0x0014:
                java.util.ArrayList<android.util.Pair<com.imlabworld.HS_Instructor.u, com.imlabworld.HS_Instructor.af>> r0 = com.imlabworld.HS_Instructor.C2465bl.f8802d
                int r0 = r0.size()
                if (r2 >= r0) goto L_0x0062
                java.util.ArrayList<android.util.Pair<com.imlabworld.HS_Instructor.u, com.imlabworld.HS_Instructor.af>> r0 = com.imlabworld.HS_Instructor.C2465bl.f8802d
                java.lang.Object r0 = r0.get(r2)
                android.util.Pair r0 = (android.util.Pair) r0
                int r6 = r10.mo9715b()
                java.lang.Object r1 = r0.first
                com.imlabworld.HS_Instructor.u r1 = (com.imlabworld.HS_Instructor.C2553u) r1
                int r1 = r1.mo9715b()
                if (r6 != r1) goto L_0x010f
                java.lang.Object r0 = r0.second
                com.imlabworld.HS_Instructor.af r0 = (com.imlabworld.HS_Instructor.C2339af) r0
                com.imlabworld.HS_Instructor.ag r1 = com.imlabworld.HS_Instructor.C2557y.f9833e
                boolean r1 = r1.f7882c
                if (r1 == 0) goto L_0x0041
                int r1 = r0.f7878b
                switch(r1) {
                    case -1: goto L_0x00a0;
                    case 0: goto L_0x00ac;
                    case 1: goto L_0x00ac;
                    case 2: goto L_0x00b8;
                    default: goto L_0x0041;
                }
            L_0x0041:
                r1 = r3
                r2 = r5
            L_0x0043:
                com.imlabworld.HS_Instructor.ag r6 = com.imlabworld.HS_Instructor.C2557y.f9833e
                boolean r6 = r6.f7881b
                if (r6 == 0) goto L_0x004e
                int r6 = r0.f7878b
                switch(r6) {
                    case -1: goto L_0x00c4;
                    case 0: goto L_0x00cf;
                    case 1: goto L_0x00cf;
                    case 2: goto L_0x00de;
                    default: goto L_0x004e;
                }
            L_0x004e:
                r6 = r5
            L_0x004f:
                com.imlabworld.HS_Instructor.ag r8 = com.imlabworld.HS_Instructor.C2557y.f9833e
                boolean r8 = r8.f7880a
                if (r8 == 0) goto L_0x005a
                int r0 = r0.f7877a
                switch(r0) {
                    case -1: goto L_0x00ea;
                    case 0: goto L_0x00f6;
                    case 1: goto L_0x00f6;
                    case 2: goto L_0x0103;
                    default: goto L_0x005a;
                }
            L_0x005a:
                int r0 = java.lang.Math.min(r5, r6)
                int r5 = java.lang.Math.min(r0, r2)
            L_0x0062:
                java.util.ArrayList<com.imlabworld.HS_Instructor.bs> r0 = com.imlabworld.HS_Instructor.C2465bl.f8801c
                if (r0 == 0) goto L_0x0114
                java.util.ArrayList<com.imlabworld.HS_Instructor.bs> r0 = com.imlabworld.HS_Instructor.C2465bl.f8801c
                int r0 = r0.size()
                int r0 = r0 + -1
                r1 = r0
            L_0x006f:
                if (r1 < 0) goto L_0x0114
                java.util.ArrayList<com.imlabworld.HS_Instructor.bs> r0 = com.imlabworld.HS_Instructor.C2465bl.f8801c
                java.lang.Object r0 = r0.get(r1)
                com.imlabworld.HS_Instructor.bs r0 = (com.imlabworld.HS_Instructor.C2527bs) r0
                boolean r0 = r0.mo9311c()
                if (r0 == 0) goto L_0x009c
                java.util.ArrayList<com.imlabworld.HS_Instructor.bs> r0 = com.imlabworld.HS_Instructor.C2465bl.f8801c
                r0.remove(r1)
                java.lang.String r0 = "Remove item"
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.StringBuilder r2 = r2.append(r1)
                java.lang.String r6 = ""
                java.lang.StringBuilder r2 = r2.append(r6)
                java.lang.String r2 = r2.toString()
                android.util.Log.e(r0, r2)
            L_0x009c:
                int r0 = r1 + -1
                r1 = r0
                goto L_0x006f
            L_0x00a0:
                r1 = r7[r3]
                java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
                r1.add(r2)
                r1 = r3
                r2 = r3
                goto L_0x0043
            L_0x00ac:
                r1 = r7[r5]
                java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
                r1.add(r2)
                r1 = r4
                r2 = r5
                goto L_0x0043
            L_0x00b8:
                r1 = r7[r4]
                java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
                r1.add(r2)
                r1 = r3
                r2 = r4
                goto L_0x0043
            L_0x00c4:
                r6 = r7[r3]
                java.lang.Integer r8 = java.lang.Integer.valueOf(r5)
                r6.add(r8)
                r6 = r3
                goto L_0x004f
            L_0x00cf:
                if (r1 != 0) goto L_0x004e
                r1 = r7[r5]
                java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
                r1.add(r6)
                r1 = r4
                r6 = r5
                goto L_0x004f
            L_0x00de:
                r6 = r7[r4]
                java.lang.Integer r8 = java.lang.Integer.valueOf(r5)
                r6.add(r8)
                r6 = r4
                goto L_0x004f
            L_0x00ea:
                r0 = r7[r3]
                java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
                r0.add(r1)
                r5 = r3
                goto L_0x005a
            L_0x00f6:
                if (r1 != 0) goto L_0x005a
                r0 = r7[r5]
                java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
                r0.add(r1)
                goto L_0x005a
            L_0x0103:
                r0 = r7[r4]
                java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
                r0.add(r1)
                r5 = r4
                goto L_0x005a
            L_0x010f:
                int r0 = r2 + 1
                r2 = r0
                goto L_0x0014
            L_0x0114:
                r0 = r7[r5]
                java.util.Iterator r1 = r0.iterator()
            L_0x011a:
                boolean r0 = r1.hasNext()
                if (r0 == 0) goto L_0x013d
                java.lang.Object r0 = r1.next()
                java.lang.Integer r0 = (java.lang.Integer) r0
                int r0 = r0.intValue()
                com.imlabworld.HS_Instructor.t r2 = com.imlabworld.HS_Instructor.C2557y.f9832d
                com.imlabworld.HS_Instructor.t r2 = r2.clone()
                r2.f9747c = r0
                java.util.ArrayList<com.imlabworld.HS_Instructor.bs> r0 = com.imlabworld.HS_Instructor.C2465bl.f8801c
                com.imlabworld.HS_Instructor.bs r5 = new com.imlabworld.HS_Instructor.bs
                r5.<init>(r10, r2, r4)
                r0.add(r3, r5)
                goto L_0x011a
            L_0x013d:
                r9.mo9142a((boolean) r3)
                r9.mo9143b()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.imlabworld.HS_Instructor.C2482bo.C2485c.mo8813a(com.imlabworld.HS_Instructor.u):void");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo9142a(boolean z) {
            if (!C2465bl.f8803e && z && C2465bl.f8801c != null) {
                for (int size = C2465bl.f8801c.size() - 1; size >= 0; size--) {
                    if (C2465bl.f8801c.get(size).mo9311c()) {
                        C2465bl.f8801c.remove(size);
                        Log.e("Remove item", size + "");
                    }
                }
            }
            Iterator<C2527bs> it = C2465bl.f8801c.iterator();
            while (it.hasNext()) {
                Log.e("List", it.next().toString());
            }
            this.f9002d.setText(C2557y.f9835g.f10485gN);
            if (!C2465bl.f8803e && C2465bl.f8801c != null && C2465bl.f8801c.size() > 0) {
                C2527bs bsVar = C2465bl.f8801c.get(0);
                Iterator<Pair<C2553u, C2339af>> it2 = C2465bl.f8802d.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Pair next = it2.next();
                    if (bsVar.mo9306a().mo9715b() == ((C2553u) next.first).mo9715b()) {
                        switch (bsVar.mo9310b().f9747c) {
                            case 1:
                                if (((C2339af) next.second).f7877a == 2) {
                                    this.f9002d.setText(C2557y.f9835g.f10549hf);
                                    break;
                                }
                                break;
                            case 2:
                                if (((C2339af) next.second).f7878b == 2) {
                                    this.f9002d.setText(C2557y.f9835g.f10549hf);
                                    break;
                                }
                                break;
                            case 3:
                                if (((C2339af) next.second).f7879c == 2) {
                                    this.f9002d.setText(C2557y.f9835g.f10549hf);
                                    break;
                                }
                                break;
                        }
                    }
                }
            }
            this.f9007i.setText(C2557y.f9835g.f10486gO);
            this.f9009k.setText(C2557y.f9835g.f10258bz);
            this.f9011m.setText(C2557y.f9835g.f10473gB);
            this.f9012n.setText(C2557y.f9835g.f10547hd);
            if (C2465bl.f8801c != null && C2465bl.f8801c.size() > 0) {
                C2527bs bsVar2 = C2465bl.f8801c.get(0);
                int i = C2557y.f9833e.f7880a ? 1 : 0;
                if (C2557y.f9833e.f7881b) {
                    i++;
                }
                if (C2557y.f9833e.f7882c) {
                    i++;
                }
                if (C2465bl.f8803e) {
                    this.f9004f.setText("User");
                    this.f9003e.setOnClickListener((View.OnClickListener) null);
                    this.f9003e.setAlpha(0.15f);
                } else {
                    this.f9004f.setText(bsVar2.mo9306a().mo9718c());
                    this.f9003e.setOnClickListener(this);
                    this.f9003e.setAlpha(1.0f);
                }
                if (i > 1) {
                    this.f9005g.setOnClickListener(this);
                    this.f9005g.setAlpha(1.0f);
                } else {
                    this.f9005g.setOnClickListener((View.OnClickListener) null);
                    this.f9005g.setAlpha(0.15f);
                }
                switch (bsVar2.mo9310b().f9747c) {
                    case 1:
                        this.f9006h.setText(C2557y.f9835g.f10581t);
                        break;
                    case 2:
                        this.f9006h.setText(C2557y.f9835g.f10272cM);
                        break;
                    case 3:
                        this.f9006h.setText(C2557y.f9835g.f10582u);
                        break;
                }
            }
            if (C2482bo.this.f8994d != null) {
                Log.e("?!", "TEST MAIN");
                this.f9019u.mo9037a(C2465bl.f8800b, C2482bo.this.f8994d);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo9143b() {
            this.f9013o.setVisibility(4);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo9144c() {
            int i;
            int i2;
            C2527bs bsVar = C2465bl.f8801c.get(0);
            ArrayList arrayList = new ArrayList();
            if (C2465bl.f8802d != null && C2465bl.f8802d.size() != 0) {
                int i3 = 0;
                while (true) {
                    if (i3 >= C2465bl.f8802d.size()) {
                        break;
                    }
                    Pair pair = C2465bl.f8802d.get(i3);
                    if (bsVar.mo9306a().mo9715b() == ((C2553u) pair.first).mo9715b()) {
                        if (C2557y.f9833e.f7880a) {
                            arrayList.add(new Pair(0, new Pair(1, Integer.valueOf(((C2339af) pair.second).f7877a))));
                            i2 = 1;
                        } else {
                            i2 = 0;
                        }
                        if (C2557y.f9833e.f7881b) {
                            arrayList.add(new Pair(Integer.valueOf(i2), new Pair(2, Integer.valueOf(((C2339af) pair.second).f7878b))));
                            i2++;
                        }
                        if (C2557y.f9833e.f7882c) {
                            arrayList.add(new Pair(Integer.valueOf(i2), new Pair(3, Integer.valueOf(((C2339af) pair.second).f7879c))));
                            int i4 = i2 + 1;
                        }
                    } else {
                        i3++;
                    }
                }
            } else {
                if (C2557y.f9833e.f7880a) {
                    arrayList.add(new Pair(0, new Pair(1, -1)));
                    i = 1;
                } else {
                    i = 0;
                }
                if (C2557y.f9833e.f7881b) {
                    arrayList.add(new Pair(Integer.valueOf(i), new Pair(2, -1)));
                    i++;
                }
                if (C2557y.f9833e.f7882c) {
                    arrayList.add(new Pair(Integer.valueOf(i), new Pair(3, -1)));
                    int i5 = i + 1;
                }
            }
            this.f9016r.setVisibility(0);
            this.f9017s.setLayoutManager(new LinearLayoutManager(C2482bo.this.getActivity()));
            this.f9018t = new C2390ar(this, arrayList, C2656R.C2657id.test_ready_waiting_patient_slot_move_btn, false);
            this.f9017s.setAdapter(this.f9018t, true);
            this.f9017s.setCanDragHorizontally(false);
            this.f9017s.setCustomDragItem((DragItem) null);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo9145d() {
            this.f9016r.setVisibility(4);
        }

        /* renamed from: e */
        public void mo9146e() {
            this.f8999a.setVisibility(0);
        }

        /* renamed from: f */
        public void mo9147f() {
            this.f8999a.setVisibility(4);
        }

        public void onClick(View view) {
            switch (view.getId()) {
                case C2656R.C2657id.test_ready_change_name_btn /*2131232019*/:
                    mo9141a();
                    return;
                case C2656R.C2657id.test_ready_change_patient_btn /*2131232021*/:
                    mo9144c();
                    return;
                case C2656R.C2657id.test_ready_pause_btn /*2131232026*/:
                case C2656R.C2657id.test_ready_quit_btn /*2131232027*/:
                    if (C2465bl.f8803e) {
                        new AlertDialog.Builder(C2482bo.this.getActivity()).setTitle(C2557y.f9835g.f10494gW).setMessage(C2557y.f9835g.f10496gY).setPositiveButton(C2557y.f9835g.f10258bz, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialogInterface, int i) {
                                C2482bo.this.f8993c.mo8608a(C2483a.QUIT, C2465bl.f8800b, 0);
                            }
                        }).setNegativeButton(C2557y.f9835g.f10210bD, (DialogInterface.OnClickListener) null).show().setCanceledOnTouchOutside(false);
                        return;
                    } else {
                        new AlertDialog.Builder(C2482bo.this.getActivity()).setTitle(C2557y.f9835g.f10494gW).setMessage(C2557y.f9835g.f10495gX).setPositiveButton(C2557y.f9835g.f10258bz, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialogInterface, int i) {
                                C2482bo.this.f8993c.mo8608a(C2483a.QUIT, C2465bl.f8800b, 0);
                            }
                        }).setNegativeButton(C2557y.f9835g.f10210bD, (DialogInterface.OnClickListener) null).show().setCanceledOnTouchOutside(false);
                        return;
                    }
                case C2656R.C2657id.test_ready_start_btn /*2131232030*/:
                    if (C2465bl.f8800b != -1) {
                        C2482bo.this.f8993c.mo8608a(C2483a.START, C2465bl.f8800b, C2465bl.f8801c.get(0).mo9310b().mo9690g());
                        return;
                    }
                    return;
                case C2656R.C2657id.test_ready_waiting_patient_sc /*2131232034*/:
                    mo9145d();
                    return;
                case C2656R.C2657id.test_ready_waiting_student_sc /*2131232041*/:
                    mo9143b();
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: a */
    public static C2482bo m13646a(int i) {
        C2482bo boVar = new C2482bo();
        Bundle bundle = new Bundle();
        bundle.putInt(f8991b, i);
        boVar.setArguments(bundle);
        return boVar;
    }

    /* renamed from: a */
    private void m13647a(boolean z) {
        this.f8995e.mo9146e();
        this.f8995e.mo9142a(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo9135a(C2338ae[] aeVarArr, boolean z) {
        this.f8994d = aeVarArr;
        m13647a(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo9136b(int i) {
        C2465bl.f8800b = i;
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (activity instanceof C2484b) {
            this.f8993c = (C2484b) activity;
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
        View inflate = layoutInflater.inflate(C2656R.layout.test_ready, viewGroup, false);
        this.f8995e = new C2485c(inflate);
        return inflate;
    }

    public void onDetach() {
        super.onDetach();
        this.f8993c = null;
    }
}
