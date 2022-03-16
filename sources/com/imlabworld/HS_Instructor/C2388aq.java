package com.imlabworld.HS_Instructor;

import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.ssomai.android.scalablelayout.ScalableLayout;
import com.woxthebox.draglistview.C2656R;
import com.woxthebox.draglistview.DragItemAdapter;
import java.util.ArrayList;

/* renamed from: com.imlabworld.HS_Instructor.aq */
public class C2388aq extends DragItemAdapter<Pair<Integer, C2553u>, C2389a> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final int f8094a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final boolean f8095b;

    /* renamed from: com.imlabworld.HS_Instructor.aq$a */
    public class C2389a extends DragItemAdapter.ViewHolder {

        /* renamed from: a */
        public final ScalableLayout f8096a;

        /* renamed from: b */
        public final TextView f8097b;

        /* renamed from: c */
        public final TextView f8098c;

        C2389a(View view) {
            super(view, C2388aq.this.f8094a, C2388aq.this.f8095b);
            this.f8096a = (ScalableLayout) view.findViewById(C2656R.C2657id.test_assign_student_normal_slot_sc);
            this.f8097b = (TextView) view.findViewById(C2656R.C2657id.test_assign_student_normal_name_txt);
            this.f8098c = (TextView) view.findViewById(C2656R.C2657id.test_assign_student_normal_email_txt);
        }

        public void onItemClicked(View view) {
        }

        public boolean onItemLongClicked(View view) {
            return true;
        }
    }

    public C2388aq(ArrayList<Pair<Integer, C2553u>> arrayList, int i, boolean z) {
        this.f8094a = i;
        this.f8095b = z;
        setHasStableIds(true);
        setItemList(arrayList);
    }

    /* renamed from: a */
    public C2389a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C2389a(LayoutInflater.from(viewGroup.getContext()).inflate(C2656R.layout.test_assign_student_normal_slot, viewGroup, false));
    }

    /* renamed from: a */
    public void onBindViewHolder(C2389a aVar, int i) {
        super.onBindViewHolder(aVar, i);
        C2553u uVar = (C2553u) ((Pair) this.mItemList.get(i)).second;
        aVar.f8097b.setText(uVar.mo9718c());
        aVar.f8098c.setText(uVar.mo9722d());
        aVar.itemView.setTag(this.mItemList.get(i));
    }

    public long getItemId(int i) {
        return (long) ((Integer) ((Pair) this.mItemList.get(i)).first).intValue();
    }
}
