package com.imlabworld.HS_Instructor;

import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.ssomai.android.scalablelayout.ScalableLayout;
import com.woxthebox.draglistview.C2656R;
import com.woxthebox.draglistview.DragItemAdapter;
import java.util.ArrayList;

/* renamed from: com.imlabworld.HS_Instructor.ar */
public class C2390ar extends DragItemAdapter<Pair<Integer, Pair<Integer, Integer>>, C2392b> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final int f8100a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final boolean f8101b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C2391a f8102c;

    /* renamed from: com.imlabworld.HS_Instructor.ar$a */
    public interface C2391a {
        /* renamed from: a */
        void mo8810a(int i);
    }

    /* renamed from: com.imlabworld.HS_Instructor.ar$b */
    public class C2392b extends DragItemAdapter.ViewHolder {

        /* renamed from: a */
        public final ScalableLayout f8103a;

        /* renamed from: b */
        public final TextView f8104b;

        /* renamed from: c */
        public final ImageView f8105c;

        /* renamed from: d */
        public final TextView f8106d;

        C2392b(View view) {
            super(view, C2390ar.this.f8100a, C2390ar.this.f8101b);
            this.f8103a = (ScalableLayout) view.findViewById(C2656R.C2657id.test_ready_waiting_patient_slot_sc);
            this.f8105c = (ImageView) view.findViewById(C2656R.C2657id.test_ready_waiting_patient_slot_icon);
            this.f8104b = (TextView) view.findViewById(C2656R.C2657id.test_ready_waiting_patient_slot_name_txt);
            this.f8106d = (TextView) view.findViewById(C2656R.C2657id.test_ready_waiting_patient_slot_result_txt);
        }

        public void onItemClicked(View view) {
            C2390ar.this.f8102c.mo8810a(((Integer) ((Pair) ((Pair) view.getTag()).second).first).intValue());
        }

        public boolean onItemLongClicked(View view) {
            return true;
        }
    }

    public C2390ar(C2391a aVar, ArrayList<Pair<Integer, Pair<Integer, Integer>>> arrayList, int i, boolean z) {
        this.f8100a = i;
        this.f8101b = z;
        setHasStableIds(true);
        setItemList(arrayList);
        this.f8102c = aVar;
    }

    /* renamed from: a */
    public C2392b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C2392b(LayoutInflater.from(viewGroup.getContext()).inflate(C2656R.layout.test_ready_waiting_patient_slot, viewGroup, false));
    }

    /* renamed from: a */
    public void onBindViewHolder(C2392b bVar, int i) {
        super.onBindViewHolder(bVar, i);
        Pair pair = (Pair) ((Pair) this.mItemList.get(i)).second;
        int intValue = ((Integer) pair.first).intValue();
        int intValue2 = ((Integer) pair.second).intValue();
        switch (intValue) {
            case 1:
                bVar.f8104b.setText(C2557y.f9835g.f10581t);
                switch (intValue2) {
                    case -1:
                        bVar.f8105c.setImageResource(C2656R.drawable.icon_test_adult_none);
                        bVar.f8106d.setText(C2557y.f9835g.f10551hh);
                        bVar.f8106d.setTextColor(-4934475);
                        break;
                    case 0:
                        bVar.f8105c.setImageResource(C2656R.drawable.icon_test_adult_fail);
                        bVar.f8106d.setText(C2557y.f9835g.f10140N);
                        bVar.f8106d.setTextColor(-2475222);
                        break;
                    case 1:
                        bVar.f8105c.setImageResource(C2656R.drawable.icon_test_adult_pass);
                        bVar.f8106d.setText(C2557y.f9835g.f10139M);
                        bVar.f8106d.setTextColor(-13326194);
                        break;
                    case 2:
                        bVar.f8105c.setImageResource(C2656R.drawable.icon_test_adult_remediation);
                        bVar.f8106d.setText(C2557y.f9835g.f10550hg);
                        bVar.f8106d.setTextColor(-2975078);
                        break;
                }
            case 2:
                bVar.f8104b.setText(C2557y.f9835g.f10272cM);
                switch (intValue2) {
                    case -1:
                        bVar.f8105c.setImageResource(C2656R.drawable.icon_test_child_none);
                        bVar.f8106d.setText(C2557y.f9835g.f10551hh);
                        bVar.f8106d.setTextColor(-4934475);
                        break;
                    case 0:
                        bVar.f8105c.setImageResource(C2656R.drawable.icon_test_child_fail);
                        bVar.f8106d.setText(C2557y.f9835g.f10140N);
                        bVar.f8106d.setTextColor(-2475222);
                        break;
                    case 1:
                        bVar.f8105c.setImageResource(C2656R.drawable.icon_test_child_pass);
                        bVar.f8106d.setText(C2557y.f9835g.f10139M);
                        bVar.f8106d.setTextColor(-13326194);
                        break;
                    case 2:
                        bVar.f8105c.setImageResource(C2656R.drawable.icon_test_child_remediation);
                        bVar.f8106d.setText(C2557y.f9835g.f10550hg);
                        bVar.f8106d.setTextColor(-2975078);
                        break;
                }
            case 3:
                bVar.f8104b.setText(C2557y.f9835g.f10582u);
                switch (intValue2) {
                    case -1:
                        bVar.f8105c.setImageResource(C2656R.drawable.icon_test_infant_none);
                        bVar.f8106d.setText(C2557y.f9835g.f10551hh);
                        bVar.f8106d.setTextColor(-4934475);
                        break;
                    case 0:
                        bVar.f8105c.setImageResource(C2656R.drawable.icon_test_infant_fail);
                        bVar.f8106d.setText(C2557y.f9835g.f10140N);
                        bVar.f8106d.setTextColor(-2475222);
                        break;
                    case 1:
                        bVar.f8105c.setImageResource(C2656R.drawable.icon_test_infant_pass);
                        bVar.f8106d.setText(C2557y.f9835g.f10139M);
                        bVar.f8106d.setTextColor(-13326194);
                        break;
                    case 2:
                        bVar.f8105c.setImageResource(C2656R.drawable.icon_test_infant_remediation);
                        bVar.f8106d.setText(C2557y.f9835g.f10550hg);
                        bVar.f8106d.setTextColor(-2975078);
                        break;
                }
        }
        bVar.itemView.setTag(this.mItemList.get(i));
    }

    public long getItemId(int i) {
        return (long) ((Integer) ((Pair) this.mItemList.get(i)).first).intValue();
    }
}
