package com.imlabworld.HS_Instructor;

import android.text.Editable;
import android.text.TextWatcher;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import com.ssomai.android.scalablelayout.ScalableLayout;
import com.woxthebox.draglistview.C2656R;
import com.woxthebox.draglistview.DragItemAdapter;
import java.util.ArrayList;

/* renamed from: com.imlabworld.HS_Instructor.an */
public class C2374an extends DragItemAdapter<Pair<Integer, C2543k>, C2378b> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final int f8057a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final boolean f8058b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C2377a f8059c;

    /* renamed from: com.imlabworld.HS_Instructor.an$a */
    public interface C2377a {
        /* renamed from: a */
        void mo8789a(C2543k kVar);
    }

    /* renamed from: com.imlabworld.HS_Instructor.an$b */
    public class C2378b extends DragItemAdapter.ViewHolder {

        /* renamed from: a */
        public final ScalableLayout f8064a;

        /* renamed from: b */
        public final ImageView f8065b;

        /* renamed from: c */
        public final EditText f8066c;

        C2378b(View view) {
            super(view, C2374an.this.f8057a, C2374an.this.f8058b);
            this.f8064a = (ScalableLayout) view.findViewById(C2656R.C2657id.test_assign_group_edit_slot_sc);
            this.f8065b = (ImageView) view.findViewById(C2656R.C2657id.test_assign_group_edit_delete_btn);
            this.f8066c = (EditText) view.findViewById(C2656R.C2657id.test_assign_group_edit_name_txt);
        }

        public void onItemClicked(View view) {
        }

        public boolean onItemLongClicked(View view) {
            return true;
        }
    }

    public C2374an(C2377a aVar, ArrayList<Pair<Integer, C2543k>> arrayList, int i, boolean z) {
        this.f8057a = i;
        this.f8058b = z;
        setHasStableIds(true);
        setItemList(arrayList);
        this.f8059c = aVar;
    }

    /* renamed from: a */
    public C2378b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C2378b(LayoutInflater.from(viewGroup.getContext()).inflate(C2656R.layout.test_assign_group_edit_slot, viewGroup, false));
    }

    /* renamed from: a */
    public void onBindViewHolder(C2378b bVar, int i) {
        super.onBindViewHolder(bVar, i);
        final C2543k kVar = (C2543k) ((Pair) this.mItemList.get(i)).second;
        bVar.f8066c.setText(kVar.mo9459b());
        bVar.f8066c.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable editable) {
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                kVar.mo9457a(charSequence.toString());
            }
        });
        bVar.f8065b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                C2374an.this.f8059c.mo8789a(kVar);
            }
        });
        bVar.itemView.setTag(this.mItemList.get(i));
    }

    public long getItemId(int i) {
        return (long) ((Integer) ((Pair) this.mItemList.get(i)).first).intValue();
    }
}
