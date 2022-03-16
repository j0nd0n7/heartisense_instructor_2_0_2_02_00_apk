package com.imlabworld.HS_Instructor;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.ssomai.android.scalablelayout.ScalableLayout;
import com.woxthebox.draglistview.C2656R;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.imlabworld.HS_Instructor.am */
class C2372am extends BaseAdapter {

    /* renamed from: a */
    private ArrayList<C2544l> f8048a = null;

    /* renamed from: b */
    private LayoutInflater f8049b = null;

    /* renamed from: c */
    private C2373a f8050c = null;

    /* renamed from: d */
    private final ArrayList<Boolean> f8051d;

    /* renamed from: com.imlabworld.HS_Instructor.am$a */
    public class C2373a {

        /* renamed from: a */
        public ScalableLayout f8052a;

        /* renamed from: b */
        public ImageView f8053b;

        /* renamed from: c */
        public ImageView f8054c;

        /* renamed from: d */
        public TextView f8055d;

        public C2373a() {
        }
    }

    public C2372am(Context context, ArrayList<C2544l> arrayList) {
        this.f8049b = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f8048a = arrayList;
        this.f8051d = new ArrayList<>();
        Iterator<C2544l> it = arrayList.iterator();
        while (it.hasNext()) {
            C2544l next = it.next();
            this.f8051d.add(false);
        }
        this.f8051d.set(0, true);
    }

    /* renamed from: a */
    public C2544l getItem(int i) {
        return this.f8048a.get(i);
    }

    /* renamed from: a */
    public void mo8776a(int i, boolean z) {
        this.f8051d.set(i, Boolean.valueOf(z));
        notifyDataSetChanged();
    }

    public int getCount() {
        return this.f8048a.size();
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            this.f8050c = new C2373a();
            view = this.f8049b.inflate(C2656R.layout.view_result_slot, viewGroup, false);
            this.f8050c.f8052a = (ScalableLayout) view.findViewById(C2656R.C2657id.view_result_slot_sc);
            this.f8050c.f8053b = (ImageView) view.findViewById(C2656R.C2657id.view_result_rescuer_icon);
            this.f8050c.f8054c = (ImageView) view.findViewById(C2656R.C2657id.view_result_type_icon);
            this.f8050c.f8055d = (TextView) view.findViewById(C2656R.C2657id.view_result_type_name_txt);
            view.setTag(this.f8050c);
        } else {
            this.f8050c = (C2373a) view.getTag();
        }
        C2544l a = getItem(i);
        switch (a.mo9487i()) {
            case 1:
                this.f8050c.f8053b.setImageResource(C2656R.drawable.icon_student_lay);
                break;
            case 2:
                this.f8050c.f8053b.setImageResource(C2656R.drawable.icon_student_bls);
                break;
        }
        switch (a.mo9489j()) {
            case 0:
                switch (a.mo9483g()) {
                    case 1:
                        this.f8050c.f8054c.setImageResource(C2656R.drawable.icon_group_edu_adult);
                        this.f8050c.f8055d.setText(C2557y.f9835g.f10581t + "-" + C2557y.f9835g.f10522gy);
                        break;
                    case 2:
                        this.f8050c.f8054c.setImageResource(C2656R.drawable.icon_group_edu_child);
                        this.f8050c.f8055d.setText(C2557y.f9835g.f10272cM + "-" + C2557y.f9835g.f10522gy);
                        break;
                    case 3:
                        this.f8050c.f8054c.setImageResource(C2656R.drawable.icon_group_edu_infant);
                        this.f8050c.f8055d.setText(C2557y.f9835g.f10582u + "-" + C2557y.f9835g.f10522gy);
                        break;
                }
            case 1:
                switch (a.mo9483g()) {
                    case 1:
                        this.f8050c.f8054c.setImageResource(C2656R.drawable.icon_group_test_adult);
                        this.f8050c.f8055d.setText(C2557y.f9835g.f10581t + "-" + C2557y.f9835g.f10339da);
                        break;
                    case 2:
                        this.f8050c.f8054c.setImageResource(C2656R.drawable.icon_group_test_child);
                        this.f8050c.f8055d.setText(C2557y.f9835g.f10272cM + "-" + C2557y.f9835g.f10339da);
                        break;
                    case 3:
                        this.f8050c.f8054c.setImageResource(C2656R.drawable.icon_group_test_infant);
                        this.f8050c.f8055d.setText(C2557y.f9835g.f10582u + "-" + C2557y.f9835g.f10339da);
                        break;
                }
        }
        if (this.f8051d.get(i).booleanValue()) {
            this.f8050c.f8052a.setBackgroundColor(-1);
        } else {
            this.f8050c.f8052a.setBackgroundColor(-1118482);
        }
        return view;
    }

    public boolean hasStableIds() {
        return false;
    }
}
