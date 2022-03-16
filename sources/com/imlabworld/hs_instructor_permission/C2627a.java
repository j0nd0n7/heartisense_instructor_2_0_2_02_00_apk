package com.imlabworld.hs_instructor_permission;

import android.content.Context;
import android.support.p010v4.view.C1012af;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.woxthebox.draglistview.C2656R;

/* renamed from: com.imlabworld.hs_instructor_permission.a */
public class C2627a extends C1012af {

    /* renamed from: c */
    Context f10803c;

    /* renamed from: d */
    LayoutInflater f10804d = ((LayoutInflater) this.f10803c.getSystemService("layout_inflater"));

    public C2627a(Context context) {
        this.f10803c = context;
    }

    /* renamed from: a */
    public Object mo1190a(ViewGroup viewGroup, int i) {
        switch (i) {
            case 0:
                View inflate = this.f10804d.inflate(C2656R.layout.activity_permission_tutorial_viewpager_cell, viewGroup, false);
                inflate.findViewById(C2656R.C2657id.activity_permssion_tutorial_cell_imageview).setBackground(this.f10803c.getDrawable(C2656R.drawable.tutorial_image0));
                viewGroup.addView(inflate);
                return inflate;
            case 1:
                View inflate2 = this.f10804d.inflate(C2656R.layout.activity_permission_tutorial_viewpager_cell, viewGroup, false);
                inflate2.findViewById(C2656R.C2657id.activity_permssion_tutorial_cell_imageview).setBackground(this.f10803c.getDrawable(C2656R.drawable.tutorial_image1));
                viewGroup.addView(inflate2);
                return inflate2;
            case 2:
                View inflate3 = this.f10804d.inflate(C2656R.layout.activity_permission_tutorial_viewpager_cell, viewGroup, false);
                inflate3.findViewById(C2656R.C2657id.activity_permssion_tutorial_cell_imageview).setBackground(this.f10803c.getDrawable(C2656R.drawable.tutorial_image2));
                viewGroup.addView(inflate3);
                return inflate3;
            case 3:
                View inflate4 = this.f10804d.inflate(C2656R.layout.activity_permission_tutorial_viewpager_cell, viewGroup, false);
                inflate4.findViewById(C2656R.C2657id.activity_permssion_tutorial_cell_imageview).setBackground(this.f10803c.getDrawable(C2656R.drawable.tutorial_image3));
                viewGroup.addView(inflate4);
                return inflate4;
            case 4:
                View inflate5 = this.f10804d.inflate(C2656R.layout.activity_permission_tutorial_viewpager_cell, viewGroup, false);
                inflate5.findViewById(C2656R.C2657id.activity_permssion_tutorial_cell_imageview).setBackground(this.f10803c.getDrawable(C2656R.drawable.tutorial_image4));
                viewGroup.addView(inflate5);
                return inflate5;
            case 5:
                View inflate6 = this.f10804d.inflate(C2656R.layout.activity_permission_tutorial_viewpager_cell, viewGroup, false);
                inflate6.findViewById(C2656R.C2657id.activity_permssion_tutorial_cell_imageview).setBackground(this.f10803c.getDrawable(C2656R.drawable.tutorial_image5));
                viewGroup.addView(inflate6);
                return inflate6;
            default:
                return null;
        }
    }

    /* renamed from: a */
    public void mo1193a(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    /* renamed from: a */
    public boolean mo1194a(View view, Object obj) {
        return view == obj;
    }

    /* renamed from: b */
    public int mo3589b() {
        return 6;
    }
}
