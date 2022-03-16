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

/* renamed from: com.imlabworld.HS_Instructor.al */
class C2365al extends BaseExpandableListAdapter {

    /* renamed from: a */
    private ArrayList<C2543k> f8006a = null;

    /* renamed from: b */
    private ArrayList<ArrayList<C2554v>> f8007b = null;

    /* renamed from: c */
    private LayoutInflater f8008c = null;

    /* renamed from: d */
    private LayoutInflater f8009d = null;

    /* renamed from: e */
    private C2369a f8010e = null;

    /* renamed from: f */
    private C2371c f8011f = null;

    /* renamed from: g */
    private final ArrayList<Boolean> f8012g;

    /* renamed from: h */
    private final ArrayList<ArrayList<Boolean>> f8013h;

    /* renamed from: i */
    private final int[] f8014i;

    /* renamed from: j */
    private final int[] f8015j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C2370b f8016k;

    /* renamed from: com.imlabworld.HS_Instructor.al$a */
    public class C2369a {

        /* renamed from: a */
        public ScalableLayout f8025a;

        /* renamed from: b */
        public ImageView f8026b;

        /* renamed from: c */
        public TextView f8027c;

        /* renamed from: d */
        public ImageView f8028d;

        /* renamed from: e */
        public int f8029e;

        public C2369a() {
        }
    }

    /* renamed from: com.imlabworld.HS_Instructor.al$b */
    public interface C2370b {
        /* renamed from: a */
        void mo8772a(int i);

        /* renamed from: a */
        void mo8773a(int i, int i2);

        /* renamed from: b */
        void mo8774b(int i, int i2);
    }

    /* renamed from: com.imlabworld.HS_Instructor.al$c */
    public class C2371c {

        /* renamed from: a */
        public ScalableLayout f8031a;

        /* renamed from: b */
        public ImageView f8032b;

        /* renamed from: c */
        public TextView f8033c;

        /* renamed from: d */
        public TextView f8034d;

        /* renamed from: e */
        public ImageView f8035e;

        /* renamed from: f */
        public ImageView f8036f;

        /* renamed from: g */
        public ImageView f8037g;

        /* renamed from: h */
        public ImageView f8038h;

        /* renamed from: i */
        public ImageView f8039i;

        /* renamed from: j */
        public ImageView f8040j;

        /* renamed from: k */
        public ImageView f8041k;

        /* renamed from: l */
        public TextView f8042l;

        /* renamed from: m */
        public ImageView f8043m;

        /* renamed from: n */
        public ImageView f8044n;

        /* renamed from: o */
        public int f8045o;

        /* renamed from: p */
        public int f8046p;

        public C2371c() {
        }
    }

    public C2365al(Context context, ArrayList<C2543k> arrayList, ArrayList<ArrayList<C2554v>> arrayList2, C2370b bVar) {
        this.f8008c = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f8009d = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f8006a = arrayList;
        this.f8007b = arrayList2;
        this.f8012g = new ArrayList<>();
        this.f8013h = new ArrayList<>();
        this.f8014i = new int[arrayList.size()];
        this.f8015j = new int[arrayList.size()];
        this.f8016k = bVar;
        Iterator<ArrayList<C2554v>> it = arrayList2.iterator();
        int i = 0;
        while (it.hasNext()) {
            ArrayList next = it.next();
            ArrayList arrayList3 = new ArrayList();
            for (int i2 = 0; i2 < next.size(); i2++) {
                arrayList3.add(false);
            }
            this.f8012g.add(false);
            this.f8013h.add(arrayList3);
            this.f8014i[i] = next.size();
            this.f8015j[i] = 0;
            i++;
        }
    }

    /* renamed from: a */
    public C2543k getGroup(int i) {
        return this.f8006a.get(i);
    }

    /* renamed from: a */
    public C2554v getChild(int i, int i2) {
        return (C2554v) this.f8007b.get(i).get(i2);
    }

    /* renamed from: a */
    public ArrayList<ArrayList<Boolean>> mo8756a() {
        return this.f8013h;
    }

    /* renamed from: b */
    public void mo8757b(int i) {
        if (this.f8012g.get(i).booleanValue()) {
            this.f8012g.set(i, false);
            this.f8015j[i] = 0;
            for (int i2 = 0; i2 < this.f8013h.get(i).size(); i2++) {
                this.f8013h.get(i).set(i2, false);
            }
        } else {
            this.f8012g.set(i, true);
            this.f8015j[i] = this.f8014i[i];
            for (int i3 = 0; i3 < this.f8013h.get(i).size(); i3++) {
                this.f8013h.get(i).set(i3, true);
            }
        }
        notifyDataSetChanged();
    }

    /* renamed from: b */
    public void mo8758b(int i, int i2) {
        if (((Boolean) this.f8013h.get(i).get(i2)).booleanValue()) {
            if (this.f8014i[i] == this.f8015j[i]) {
                this.f8012g.set(i, false);
            }
            int[] iArr = this.f8015j;
            iArr[i] = iArr[i] - 1;
            this.f8013h.get(i).set(i2, false);
        } else {
            int[] iArr2 = this.f8015j;
            iArr2[i] = iArr2[i] + 1;
            if (this.f8014i[i] == this.f8015j[i]) {
                this.f8012g.set(i, true);
            }
            this.f8013h.get(i).set(i2, true);
        }
        notifyDataSetChanged();
    }

    public long getChildId(int i, int i2) {
        return (long) i2;
    }

    public View getChildView(final int i, final int i2, boolean z, View view, ViewGroup viewGroup) {
        if (view == null) {
            this.f8011f = new C2371c();
            view = this.f8009d.inflate(C2656R.layout.data_management_student_slot, viewGroup, false);
            this.f8011f.f8031a = (ScalableLayout) view.findViewById(C2656R.C2657id.data_management_student_slot_sc);
            this.f8011f.f8032b = (ImageView) view.findViewById(C2656R.C2657id.data_management_student_check_btn);
            this.f8011f.f8033c = (TextView) view.findViewById(C2656R.C2657id.data_management_student_name_txt);
            this.f8011f.f8034d = (TextView) view.findViewById(C2656R.C2657id.data_management_student_email_txt);
            this.f8011f.f8035e = (ImageView) view.findViewById(C2656R.C2657id.data_management_student_rescuer_img);
            this.f8011f.f8036f = (ImageView) view.findViewById(C2656R.C2657id.data_management_student_edu_adult_img);
            this.f8011f.f8037g = (ImageView) view.findViewById(C2656R.C2657id.data_management_student_edu_child_img);
            this.f8011f.f8038h = (ImageView) view.findViewById(C2656R.C2657id.data_management_student_edu_infant_img);
            this.f8011f.f8039i = (ImageView) view.findViewById(C2656R.C2657id.data_management_student_test_adult_img);
            this.f8011f.f8040j = (ImageView) view.findViewById(C2656R.C2657id.data_management_student_test_child_img);
            this.f8011f.f8041k = (ImageView) view.findViewById(C2656R.C2657id.data_management_student_test_infant_img);
            this.f8011f.f8042l = (TextView) view.findViewById(C2656R.C2657id.data_management_student_view_btn);
            this.f8011f.f8043m = (ImageView) view.findViewById(C2656R.C2657id.data_management_student_view_btn_real);
            this.f8011f.f8044n = (ImageView) view.findViewById(C2656R.C2657id.data_management_student_delete_btn);
            this.f8011f.f8045o = i;
            this.f8011f.f8046p = i2;
            view.setTag(this.f8011f);
        } else {
            this.f8011f = (C2371c) view.getTag();
        }
        if (((Boolean) this.f8013h.get(i).get(i2)).booleanValue()) {
            this.f8011f.f8032b.setImageResource(C2656R.drawable.btn_check);
            this.f8011f.f8031a.setBackgroundColor(-2493203);
        } else {
            this.f8011f.f8032b.setImageResource(C2656R.drawable.btn_uncheck);
            this.f8011f.f8031a.setBackgroundColor(-1);
        }
        C2554v a = getChild(i, i2);
        this.f8011f.f8033c.setText(a.mo9734c());
        this.f8011f.f8034d.setText(a.mo9737d());
        if (a.mo9747i() == 2) {
            this.f8011f.f8035e.setVisibility(0);
            this.f8011f.f8035e.setImageResource(C2656R.drawable.icon_student_bls);
        } else if (a.mo9747i() == 1) {
            this.f8011f.f8035e.setVisibility(0);
            this.f8011f.f8035e.setImageResource(C2656R.drawable.icon_student_lay);
        } else {
            this.f8011f.f8035e.setVisibility(4);
        }
        if (a.mo9749j() == 1) {
            this.f8011f.f8036f.setImageResource(C2656R.drawable.icon_student_green);
        } else if (a.mo9749j() == 2) {
            this.f8011f.f8036f.setImageResource(C2656R.drawable.icon_student_orange);
        } else {
            this.f8011f.f8036f.setImageResource(C2656R.drawable.icon_student_gray);
        }
        if (a.mo9751k() == 1) {
            this.f8011f.f8037g.setImageResource(C2656R.drawable.icon_student_green);
        } else if (a.mo9751k() == 2) {
            this.f8011f.f8037g.setImageResource(C2656R.drawable.icon_student_orange);
        } else {
            this.f8011f.f8037g.setImageResource(C2656R.drawable.icon_student_gray);
        }
        if (a.mo9752l() == 1) {
            this.f8011f.f8038h.setImageResource(C2656R.drawable.icon_student_green);
        } else if (a.mo9752l() == 2) {
            this.f8011f.f8038h.setImageResource(C2656R.drawable.icon_student_orange);
        } else {
            this.f8011f.f8038h.setImageResource(C2656R.drawable.icon_student_gray);
        }
        if (a.mo9753m() == 1) {
            this.f8011f.f8039i.setImageResource(C2656R.drawable.icon_student_green);
        } else if (a.mo9753m() == 2) {
            this.f8011f.f8039i.setImageResource(C2656R.drawable.icon_student_orange);
        } else {
            this.f8011f.f8039i.setImageResource(C2656R.drawable.icon_student_gray);
        }
        if (a.mo9754n() == 1) {
            this.f8011f.f8040j.setImageResource(C2656R.drawable.icon_student_green);
        } else if (a.mo9754n() == 2) {
            this.f8011f.f8040j.setImageResource(C2656R.drawable.icon_student_orange);
        } else {
            this.f8011f.f8040j.setImageResource(C2656R.drawable.icon_student_gray);
        }
        if (a.mo9755o() == 1) {
            this.f8011f.f8041k.setImageResource(C2656R.drawable.icon_student_green);
        } else if (a.mo9755o() == 2) {
            this.f8011f.f8041k.setImageResource(C2656R.drawable.icon_student_orange);
        } else {
            this.f8011f.f8041k.setImageResource(C2656R.drawable.icon_student_gray);
        }
        this.f8011f.f8042l.setText(C2557y.f9835g.f10520gw);
        this.f8011f.f8043m.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                C2365al.this.f8016k.mo8774b(i, i2);
            }
        });
        this.f8011f.f8044n.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                C2365al.this.f8016k.mo8773a(i, i2);
            }
        });
        return view;
    }

    public int getChildrenCount(int i) {
        return this.f8007b.get(i).size();
    }

    public int getGroupCount() {
        return this.f8006a.size();
    }

    public long getGroupId(int i) {
        return (long) i;
    }

    public View getGroupView(final int i, boolean z, View view, ViewGroup viewGroup) {
        if (view == null) {
            this.f8010e = new C2369a();
            view = this.f8008c.inflate(C2656R.layout.data_management_group_slot, viewGroup, false);
            this.f8010e.f8025a = (ScalableLayout) view.findViewById(C2656R.C2657id.data_management_group_slot_sc);
            this.f8010e.f8026b = (ImageView) view.findViewById(C2656R.C2657id.data_management_group_check_btn);
            this.f8010e.f8027c = (TextView) view.findViewById(C2656R.C2657id.data_management_group_name_txt);
            this.f8010e.f8028d = (ImageView) view.findViewById(C2656R.C2657id.data_management_group_arrow_img);
            this.f8010e.f8029e = i;
            view.setTag(this.f8010e);
        } else {
            this.f8010e = (C2369a) view.getTag();
        }
        if (z) {
            this.f8010e.f8028d.setImageResource(C2656R.drawable.icon_group_open);
        } else {
            this.f8010e.f8028d.setImageResource(C2656R.drawable.icon_group_close);
        }
        if (this.f8012g.get(i).booleanValue()) {
            this.f8010e.f8026b.setImageResource(C2656R.drawable.btn_check);
        } else {
            this.f8010e.f8026b.setImageResource(C2656R.drawable.btn_uncheck);
        }
        this.f8010e.f8027c.setText(getGroup(i).mo9459b());
        this.f8010e.f8026b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                C2365al.this.f8016k.mo8772a(i);
            }
        });
        return view;
    }

    public boolean hasStableIds() {
        return false;
    }

    public boolean isChildSelectable(int i, int i2) {
        return true;
    }
}
