package com.imlabworld.HS_Instructor;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.ssomai.android.scalablelayout.ScalableLayout;
import com.woxthebox.draglistview.C2656R;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.imlabworld.HS_Instructor.aj */
class C2358aj extends BaseExpandableListAdapter {

    /* renamed from: a */
    private ArrayList<C2543k> f7970a = null;

    /* renamed from: b */
    private ArrayList<ArrayList<C2554v>> f7971b = null;

    /* renamed from: c */
    private LayoutInflater f7972c = null;

    /* renamed from: d */
    private LayoutInflater f7973d = null;

    /* renamed from: e */
    private C2360a f7974e = null;

    /* renamed from: f */
    private C2362c f7975f = null;

    /* renamed from: g */
    private final ArrayList<ArrayList<Boolean>> f7976g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C2361b f7977h;

    /* renamed from: com.imlabworld.HS_Instructor.aj$a */
    public class C2360a {

        /* renamed from: a */
        public ScalableLayout f7981a;

        /* renamed from: b */
        public TextView f7982b;

        /* renamed from: c */
        public ImageView f7983c;

        public C2360a() {
        }
    }

    /* renamed from: com.imlabworld.HS_Instructor.aj$b */
    public interface C2361b {
        /* renamed from: a */
        void mo8746a(int i, int i2);
    }

    /* renamed from: com.imlabworld.HS_Instructor.aj$c */
    public class C2362c {

        /* renamed from: a */
        public ScalableLayout f7985a;

        /* renamed from: b */
        public ImageView f7986b;

        /* renamed from: c */
        public TextView f7987c;

        /* renamed from: d */
        public TextView f7988d;

        /* renamed from: e */
        public ImageView f7989e;

        /* renamed from: f */
        public ImageView f7990f;

        /* renamed from: g */
        public ImageView f7991g;

        /* renamed from: h */
        public ImageView f7992h;

        /* renamed from: i */
        public ImageView f7993i;

        /* renamed from: j */
        public ImageView f7994j;

        /* renamed from: k */
        public ImageView f7995k;

        /* renamed from: l */
        public ImageView f7996l;

        public C2362c() {
        }
    }

    public C2358aj(Context context, ArrayList<C2543k> arrayList, ArrayList<ArrayList<C2554v>> arrayList2, C2361b bVar) {
        this.f7972c = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f7973d = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f7970a = arrayList;
        this.f7971b = arrayList2;
        this.f7976g = new ArrayList<>();
        this.f7977h = bVar;
        Iterator<ArrayList<C2554v>> it = arrayList2.iterator();
        int i = 0;
        while (it.hasNext()) {
            ArrayList next = it.next();
            ArrayList arrayList3 = new ArrayList();
            for (int i2 = 0; i2 < next.size(); i2++) {
                arrayList3.add(false);
            }
            this.f7976g.add(arrayList3);
            i++;
        }
    }

    /* renamed from: a */
    public C2543k getGroup(int i) {
        return this.f7970a.get(i);
    }

    /* renamed from: a */
    public C2554v getChild(int i, int i2) {
        return (C2554v) this.f7971b.get(i).get(i2);
    }

    /* renamed from: a */
    public void mo8734a(int i, int i2, boolean z) {
        this.f7976g.get(i).set(i2, Boolean.valueOf(z));
        notifyDataSetChanged();
    }

    public long getChildId(int i, int i2) {
        return (long) i2;
    }

    public View getChildView(final int i, final int i2, boolean z, View view, ViewGroup viewGroup) {
        if (view == null) {
            this.f7975f = new C2362c();
            view = this.f7973d.inflate(C2656R.layout.assign_student_slot, viewGroup, false);
            this.f7975f.f7985a = (ScalableLayout) view.findViewById(C2656R.C2657id.assign_student_slot_sc);
            this.f7975f.f7986b = (ImageView) view.findViewById(C2656R.C2657id.assign_student_check_btn);
            this.f7975f.f7987c = (TextView) view.findViewById(C2656R.C2657id.assign_student_name_txt);
            this.f7975f.f7988d = (TextView) view.findViewById(C2656R.C2657id.assign_student_email_txt);
            this.f7975f.f7989e = (ImageView) view.findViewById(C2656R.C2657id.assign_student_rescuer_img);
            this.f7975f.f7990f = (ImageView) view.findViewById(C2656R.C2657id.assign_student_edu_adult_img);
            this.f7975f.f7991g = (ImageView) view.findViewById(C2656R.C2657id.assign_student_edu_child_img);
            this.f7975f.f7992h = (ImageView) view.findViewById(C2656R.C2657id.assign_student_edu_infant_img);
            this.f7975f.f7993i = (ImageView) view.findViewById(C2656R.C2657id.assign_student_test_adult_img);
            this.f7975f.f7994j = (ImageView) view.findViewById(C2656R.C2657id.assign_student_test_child_img);
            this.f7975f.f7995k = (ImageView) view.findViewById(C2656R.C2657id.assign_student_test_infant_img);
            this.f7975f.f7996l = (ImageView) view.findViewById(C2656R.C2657id.assign_student_delete_btn);
            view.setTag(this.f7975f);
        } else {
            this.f7975f = (C2362c) view.getTag();
        }
        if (((Boolean) this.f7976g.get(i).get(i2)).booleanValue()) {
            this.f7975f.f7986b.setImageResource(C2656R.drawable.btn_check);
            this.f7975f.f7985a.setBackgroundColor(-2493203);
        } else {
            this.f7975f.f7986b.setImageResource(C2656R.drawable.btn_uncheck);
            this.f7975f.f7985a.setBackgroundColor(-1);
        }
        C2554v a = getChild(i, i2);
        this.f7975f.f7987c.setText(a.mo9734c());
        this.f7975f.f7988d.setText(a.mo9737d());
        if (a.mo9747i() == 2) {
            this.f7975f.f7989e.setVisibility(0);
            this.f7975f.f7989e.setImageResource(C2656R.drawable.icon_student_bls);
        } else if (a.mo9747i() == 1) {
            this.f7975f.f7989e.setVisibility(0);
            this.f7975f.f7989e.setImageResource(C2656R.drawable.icon_student_lay);
        } else {
            this.f7975f.f7989e.setVisibility(4);
        }
        if (a.mo9749j() == 1) {
            this.f7975f.f7990f.setImageResource(C2656R.drawable.icon_student_green);
        } else {
            this.f7975f.f7990f.setImageResource(C2656R.drawable.icon_student_gray);
        }
        if (a.mo9751k() == 1) {
            this.f7975f.f7991g.setImageResource(C2656R.drawable.icon_student_green);
        } else {
            this.f7975f.f7991g.setImageResource(C2656R.drawable.icon_student_gray);
        }
        if (a.mo9752l() == 1) {
            this.f7975f.f7992h.setImageResource(C2656R.drawable.icon_student_green);
        } else {
            this.f7975f.f7992h.setImageResource(C2656R.drawable.icon_student_gray);
        }
        if (a.mo9753m() == 1) {
            this.f7975f.f7993i.setImageResource(C2656R.drawable.icon_student_green);
        } else {
            this.f7975f.f7993i.setImageResource(C2656R.drawable.icon_student_gray);
        }
        if (a.mo9754n() == 1) {
            this.f7975f.f7994j.setImageResource(C2656R.drawable.icon_student_green);
        } else {
            this.f7975f.f7994j.setImageResource(C2656R.drawable.icon_student_gray);
        }
        if (a.mo9755o() == 1) {
            this.f7975f.f7995k.setImageResource(C2656R.drawable.icon_student_green);
        } else {
            this.f7975f.f7995k.setImageResource(C2656R.drawable.icon_student_gray);
        }
        this.f7975f.f7996l.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                C2358aj.this.f7977h.mo8746a(i, i2);
            }
        });
        return view;
    }

    public int getChildrenCount(int i) {
        return this.f7971b.get(i).size();
    }

    public int getGroupCount() {
        return this.f7970a.size();
    }

    public long getGroupId(int i) {
        return (long) i;
    }

    public View getGroupView(int i, boolean z, View view, ViewGroup viewGroup) {
        if (view == null) {
            this.f7974e = new C2360a();
            view = this.f7972c.inflate(C2656R.layout.assign_group_slot, viewGroup, false);
            this.f7974e.f7981a = (ScalableLayout) view.findViewById(C2656R.C2657id.assign_group_slot_sc);
            this.f7974e.f7982b = (TextView) view.findViewById(C2656R.C2657id.assign_group_name_txt);
            this.f7974e.f7983c = (ImageView) view.findViewById(C2656R.C2657id.assign_group_arrow_img);
            view.setTag(this.f7974e);
        } else {
            this.f7974e = (C2360a) view.getTag();
        }
        if (z) {
            this.f7974e.f7983c.setImageResource(C2656R.drawable.icon_group_open);
        } else {
            this.f7974e.f7983c.setImageResource(C2656R.drawable.icon_group_close);
        }
        this.f7974e.f7982b.setText(getGroup(i).mo9459b());
        return view;
    }

    public boolean hasStableIds() {
        return false;
    }

    public boolean isChildSelectable(int i, int i2) {
        return true;
    }
}
