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

/* renamed from: com.imlabworld.HS_Instructor.ao */
public class C2379ao extends DragItemAdapter<Pair<Integer, C2543k>, C2381b> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final int f8068a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final boolean f8069b;

    /* renamed from: c */
    private boolean f8070c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public int f8071d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C2380a f8072e;

    /* renamed from: com.imlabworld.HS_Instructor.ao$a */
    public interface C2380a {
        /* renamed from: a */
        void mo8795a(int i, C2543k kVar);
    }

    /* renamed from: com.imlabworld.HS_Instructor.ao$b */
    public class C2381b extends DragItemAdapter.ViewHolder {

        /* renamed from: a */
        public final ScalableLayout f8073a;

        /* renamed from: b */
        public final ImageView f8074b;

        /* renamed from: c */
        public final TextView f8075c;

        C2381b(View view) {
            super(view, C2379ao.this.f8068a, C2379ao.this.f8069b);
            this.f8073a = (ScalableLayout) view.findViewById(C2656R.C2657id.test_assign_group_normal_slot_sc);
            this.f8074b = (ImageView) view.findViewById(C2656R.C2657id.test_assign_group_normal_check_btn);
            this.f8075c = (TextView) view.findViewById(C2656R.C2657id.test_assign_group_normal_name_txt);
        }

        public void onItemClicked(View view) {
            Pair pair = (Pair) view.getTag();
            if (C2379ao.this.f8071d != ((Integer) pair.first).intValue()) {
                int unused = C2379ao.this.f8071d = ((Integer) pair.first).intValue();
            } else {
                int unused2 = C2379ao.this.f8071d = -1;
            }
            C2379ao.this.f8072e.mo8795a(((Integer) pair.first).intValue(), (C2543k) pair.second);
            C2379ao.this.notifyDataSetChanged();
        }

        public boolean onItemLongClicked(View view) {
            return true;
        }
    }

    public C2379ao(C2380a aVar, ArrayList<Pair<Integer, C2543k>> arrayList, int i, boolean z, boolean z2, int i2) {
        this.f8068a = i;
        this.f8069b = z;
        setHasStableIds(true);
        setItemList(arrayList);
        this.f8072e = aVar;
        this.f8070c = z2;
        this.f8071d = i2;
    }

    /* renamed from: a */
    public C2381b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C2381b(LayoutInflater.from(viewGroup.getContext()).inflate(C2656R.layout.test_assign_group_normal_slot, viewGroup, false));
    }

    /* renamed from: a */
    public void onBindViewHolder(C2381b bVar, int i) {
        super.onBindViewHolder(bVar, i);
        C2543k kVar = (C2543k) ((Pair) this.mItemList.get(i)).second;
        if (i == this.f8071d) {
            bVar.f8073a.setAlpha(1.0f);
            bVar.f8073a.setBackgroundResource(C2656R.drawable.bg_test_group_selected);
            bVar.f8074b.setImageResource(C2656R.drawable.btn_option_selected2);
            bVar.f8075c.setTextColor(-1);
        } else {
            if (this.f8070c) {
                bVar.f8073a.setAlpha(0.2f);
            } else {
                bVar.f8073a.setAlpha(1.0f);
            }
            bVar.f8073a.setBackgroundResource(C2656R.drawable.bg_test_group_unselected);
            bVar.f8074b.setImageResource(C2656R.drawable.btn_option_unselected2);
            bVar.f8075c.setText(kVar.mo9459b());
            bVar.f8075c.setTextColor(-10658467);
        }
        bVar.f8075c.setText(kVar.mo9459b());
        bVar.itemView.setTag(this.mItemList.get(i));
    }

    /* renamed from: a */
    public void mo8794a(boolean z) {
        this.f8070c = z;
        notifyDataSetChanged();
    }

    public long getItemId(int i) {
        return (long) ((Integer) ((Pair) this.mItemList.get(i)).first).intValue();
    }
}
