package com.imlabworld.HS_Instructor;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.ssomai.android.scalablelayout.ScalableLayout;
import com.woxthebox.draglistview.C2656R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

/* renamed from: com.imlabworld.HS_Instructor.ak */
class C2363ak extends BaseAdapter {

    /* renamed from: a */
    private ArrayList<C2543k> f7998a = null;

    /* renamed from: b */
    private LayoutInflater f7999b = null;

    /* renamed from: c */
    private C2364a f8000c = null;

    /* renamed from: d */
    private final ArrayList<Boolean> f8001d;

    /* renamed from: com.imlabworld.HS_Instructor.ak$a */
    public class C2364a {

        /* renamed from: a */
        public ScalableLayout f8002a;

        /* renamed from: b */
        public TextView f8003b;

        /* renamed from: c */
        public TextView f8004c;

        public C2364a() {
        }
    }

    public C2363ak(Context context, ArrayList<C2543k> arrayList) {
        this.f7999b = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f7998a = arrayList;
        this.f8001d = new ArrayList<>();
        Iterator<C2543k> it = arrayList.iterator();
        while (it.hasNext()) {
            C2543k next = it.next();
            this.f8001d.add(false);
        }
    }

    /* renamed from: a */
    public C2543k getItem(int i) {
        return this.f7998a.get(i);
    }

    /* renamed from: a */
    public void mo8748a(int i, boolean z) {
        this.f8001d.set(i, Boolean.valueOf(z));
        notifyDataSetChanged();
    }

    public int getCount() {
        return this.f7998a.size();
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            this.f8000c = new C2364a();
            view = this.f7999b.inflate(C2656R.layout.assign_server_group_slot, viewGroup, false);
            this.f8000c.f8002a = (ScalableLayout) view.findViewById(C2656R.C2657id.assign_server_group_slot_sc);
            this.f8000c.f8003b = (TextView) view.findViewById(C2656R.C2657id.assign_server_group_name_txt);
            this.f8000c.f8004c = (TextView) view.findViewById(C2656R.C2657id.assign_server_group_date_txt);
            view.setTag(this.f8000c);
        } else {
            this.f8000c = (C2364a) view.getTag();
        }
        C2543k a = getItem(i);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        switch (C2557y.f9832d.f9756l) {
            case 1:
                simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                break;
            case 2:
                simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
                break;
            case 3:
                simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                break;
        }
        Date date = new Date(a.mo9462c().getTime());
        this.f8000c.f8003b.setText(a.mo9459b());
        this.f8000c.f8004c.setText(simpleDateFormat.format(date));
        if (this.f8001d.get(i).booleanValue()) {
            this.f8000c.f8002a.setBackgroundResource(C2656R.drawable.img_import_group_selected);
            this.f8000c.f8003b.setTextColor(-1);
            this.f8000c.f8004c.setTextColor(-1);
        } else {
            this.f8000c.f8002a.setBackgroundResource(C2656R.drawable.img_import_group_unselected);
            this.f8000c.f8003b.setTextColor(-10658467);
            this.f8000c.f8004c.setTextColor(-10658467);
        }
        return view;
    }

    public boolean hasStableIds() {
        return false;
    }
}
