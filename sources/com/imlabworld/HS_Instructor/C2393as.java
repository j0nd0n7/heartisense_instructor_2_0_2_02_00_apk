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

/* renamed from: com.imlabworld.HS_Instructor.as */
public class C2393as extends DragItemAdapter<Pair<Integer, Pair<C2553u, C2339af>>, C2395b> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final int f8108a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final boolean f8109b;

    /* renamed from: c */
    private final int[] f8110c = new int[3];
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C2394a f8111d;

    /* renamed from: com.imlabworld.HS_Instructor.as$a */
    public interface C2394a {
        /* renamed from: a */
        void mo8813a(C2553u uVar);
    }

    /* renamed from: com.imlabworld.HS_Instructor.as$b */
    public class C2395b extends DragItemAdapter.ViewHolder {

        /* renamed from: a */
        public final ScalableLayout f8112a;

        /* renamed from: b */
        public final TextView f8113b;

        /* renamed from: c */
        public final ImageView[] f8114c = new ImageView[3];

        C2395b(View view) {
            super(view, C2393as.this.f8108a, C2393as.this.f8109b);
            this.f8112a = (ScalableLayout) view.findViewById(C2656R.C2657id.test_ready_waiting_student_slot_sc);
            this.f8113b = (TextView) view.findViewById(C2656R.C2657id.test_ready_waiting_student_slot_name_txt);
            this.f8114c[0] = (ImageView) view.findViewById(C2656R.C2657id.test_ready_waiting_student_slot_icon1);
            this.f8114c[1] = (ImageView) view.findViewById(C2656R.C2657id.test_ready_waiting_student_slot_icon2);
            this.f8114c[2] = (ImageView) view.findViewById(C2656R.C2657id.test_ready_waiting_student_slot_icon3);
        }

        public void onItemClicked(View view) {
            C2393as.this.f8111d.mo8813a((C2553u) ((Pair) ((Pair) view.getTag()).second).first);
        }

        public boolean onItemLongClicked(View view) {
            return true;
        }
    }

    public C2393as(C2394a aVar, ArrayList<Pair<Integer, Pair<C2553u, C2339af>>> arrayList, int i, boolean z, boolean[] zArr) {
        int i2 = 2;
        this.f8108a = i;
        this.f8109b = z;
        setHasStableIds(true);
        setItemList(arrayList);
        this.f8111d = aVar;
        for (int i3 = 0; i3 < 3; i3++) {
            this.f8110c[i3] = 0;
        }
        for (int i4 = 2; i4 >= 0; i4--) {
            if (zArr[i4]) {
                this.f8110c[i2] = i4 + 1;
                i2--;
            }
        }
    }

    /* renamed from: a */
    public C2395b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C2395b(LayoutInflater.from(viewGroup.getContext()).inflate(C2656R.layout.test_ready_waiting_student_slot, viewGroup, false));
    }

    /* renamed from: a */
    public void onBindViewHolder(C2395b bVar, int i) {
        super.onBindViewHolder(bVar, i);
        Pair pair = (Pair) ((Pair) this.mItemList.get(i)).second;
        C2339af afVar = (C2339af) pair.second;
        bVar.f8113b.setText(((C2553u) pair.first).mo9718c());
        for (int i2 = 0; i2 < 3; i2++) {
            switch (this.f8110c[i2]) {
                case 0:
                    bVar.f8114c[i2].setImageResource(C2656R.drawable.icon_test_none);
                    break;
                case 1:
                    switch (afVar.f7877a) {
                        case -1:
                            bVar.f8114c[i2].setImageResource(C2656R.drawable.icon_test_adult_none);
                            break;
                        case 0:
                            bVar.f8114c[i2].setImageResource(C2656R.drawable.icon_test_adult_fail);
                            break;
                        case 1:
                            bVar.f8114c[i2].setImageResource(C2656R.drawable.icon_test_adult_pass);
                            break;
                        case 2:
                            bVar.f8114c[i2].setImageResource(C2656R.drawable.icon_test_adult_remediation);
                            break;
                    }
                case 2:
                    switch (afVar.f7878b) {
                        case -1:
                            bVar.f8114c[i2].setImageResource(C2656R.drawable.icon_test_child_none);
                            break;
                        case 0:
                            bVar.f8114c[i2].setImageResource(C2656R.drawable.icon_test_child_fail);
                            break;
                        case 1:
                            bVar.f8114c[i2].setImageResource(C2656R.drawable.icon_test_child_pass);
                            break;
                        case 2:
                            bVar.f8114c[i2].setImageResource(C2656R.drawable.icon_test_child_remediation);
                            break;
                    }
                case 3:
                    switch (afVar.f7879c) {
                        case -1:
                            bVar.f8114c[i2].setImageResource(C2656R.drawable.icon_test_infant_none);
                            break;
                        case 0:
                            bVar.f8114c[i2].setImageResource(C2656R.drawable.icon_test_infant_fail);
                            break;
                        case 1:
                            bVar.f8114c[i2].setImageResource(C2656R.drawable.icon_test_infant_pass);
                            break;
                        case 2:
                            bVar.f8114c[i2].setImageResource(C2656R.drawable.icon_test_infant_remediation);
                            break;
                    }
            }
        }
        bVar.itemView.setTag(this.mItemList.get(i));
    }

    public long getItemId(int i) {
        return (long) ((Integer) ((Pair) this.mItemList.get(i)).first).intValue();
    }
}
