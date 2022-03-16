package com.imlabworld.HS_Instructor;

import android.app.Activity;
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
import java.util.regex.Pattern;

/* renamed from: com.imlabworld.HS_Instructor.ap */
public class C2382ap extends DragItemAdapter<Pair<Integer, C2553u>, C2387b> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final int f8077a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final boolean f8078b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C2386a f8079c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Activity f8080d;

    /* renamed from: com.imlabworld.HS_Instructor.ap$a */
    public interface C2386a {
        /* renamed from: a */
        void mo8805a(C2553u uVar);
    }

    /* renamed from: com.imlabworld.HS_Instructor.ap$b */
    public class C2387b extends DragItemAdapter.ViewHolder {

        /* renamed from: a */
        public final ScalableLayout f8089a;

        /* renamed from: b */
        public final ImageView f8090b;

        /* renamed from: c */
        public final EditText f8091c;

        /* renamed from: d */
        public final EditText f8092d;

        C2387b(View view) {
            super(view, C2382ap.this.f8077a, C2382ap.this.f8078b);
            this.f8089a = (ScalableLayout) view.findViewById(C2656R.C2657id.test_assign_student_edit_slot_sc);
            this.f8090b = (ImageView) view.findViewById(C2656R.C2657id.test_assign_student_edit_delete_btn);
            this.f8091c = (EditText) view.findViewById(C2656R.C2657id.test_assign_student_edit_name_txt);
            this.f8092d = (EditText) view.findViewById(C2656R.C2657id.test_assign_student_edit_email_txt);
        }

        public void onItemClicked(View view) {
        }

        public boolean onItemLongClicked(View view) {
            return true;
        }
    }

    public C2382ap(Activity activity, C2386a aVar, ArrayList<Pair<Integer, C2553u>> arrayList, int i, boolean z) {
        this.f8080d = activity;
        this.f8077a = i;
        this.f8078b = z;
        setHasStableIds(true);
        setItemList(arrayList);
        this.f8079c = aVar;
    }

    /* renamed from: a */
    public C2387b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C2387b(LayoutInflater.from(viewGroup.getContext()).inflate(C2656R.layout.test_assign_student_edit_slot, viewGroup, false));
    }

    /* renamed from: a */
    public void onBindViewHolder(final C2387b bVar, int i) {
        super.onBindViewHolder(bVar, i);
        final C2553u uVar = (C2553u) ((Pair) this.mItemList.get(i)).second;
        bVar.f8091c.setText(uVar.mo9718c());
        bVar.f8092d.setText(uVar.mo9722d());
        bVar.f8091c.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable editable) {
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                String charSequence2;
                if (C2382ap.this.f8080d.getCurrentFocus().getId() == bVar.f8091c.getId() && (charSequence2 = charSequence.toString()) != null && !charSequence2.replaceAll("\\s", "").equals("")) {
                    uVar.mo9713a(charSequence2);
                }
            }
        });
        bVar.f8092d.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable editable) {
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                String charSequence2;
                if (C2382ap.this.f8080d.getCurrentFocus().getId() == bVar.f8092d.getId() && (charSequence2 = charSequence.toString()) != null && !charSequence2.replaceAll("\\s", "").equals("") && Pattern.compile("[a-zA-Z0-9_\\.-]+@{1}+[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_]+)+").matcher(charSequence2).matches()) {
                    uVar.mo9717b(charSequence2);
                }
            }
        });
        bVar.f8090b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                C2382ap.this.f8079c.mo8805a(uVar);
            }
        });
        bVar.itemView.setTag(this.mItemList.get(i));
    }

    public long getItemId(int i) {
        return (long) ((Integer) ((Pair) this.mItemList.get(i)).first).intValue();
    }
}
