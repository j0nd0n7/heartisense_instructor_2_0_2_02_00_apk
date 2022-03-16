package com.imlabworld.hs_instructor_permission;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.p010v4.view.ViewPager;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.imlabworld.HS_Instructor.UI_A_Init;
import com.woxthebox.draglistview.C2656R;

public class PermissionTutorialActivity extends Activity {

    /* renamed from: a */
    private LinearLayout f10790a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public ImageView f10791b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public ImageView f10792c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public ImageView f10793d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public ImageView f10794e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public ImageView f10795f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public ImageView f10796g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public Button f10797h;

    /* renamed from: i */
    private View.OnClickListener f10798i = new View.OnClickListener() {
        public void onClick(View view) {
            PermissionTutorialActivity.this.startActivity(new Intent(PermissionTutorialActivity.this, UI_A_Init.class));
            PermissionTutorialActivity.this.finish();
        }
    };

    /* renamed from: j */
    private ViewPager.C0912f f10799j = new ViewPager.C0912f() {
        /* renamed from: a */
        public void mo3080a(int i) {
            switch (i) {
                case 0:
                    PermissionTutorialActivity.this.f10797h.setVisibility(4);
                    PermissionTutorialActivity.this.f10791b.setBackgroundResource(C2656R.drawable.baseline_lens_black_18dp);
                    PermissionTutorialActivity.this.f10792c.setBackgroundResource(C2656R.drawable.outline_lens_black_18dp);
                    PermissionTutorialActivity.this.f10793d.setBackgroundResource(C2656R.drawable.outline_lens_black_18dp);
                    PermissionTutorialActivity.this.f10794e.setBackgroundResource(C2656R.drawable.outline_lens_black_18dp);
                    PermissionTutorialActivity.this.f10795f.setBackgroundResource(C2656R.drawable.outline_lens_black_18dp);
                    PermissionTutorialActivity.this.f10796g.setBackgroundResource(C2656R.drawable.outline_lens_black_18dp);
                    return;
                case 1:
                    PermissionTutorialActivity.this.f10797h.setVisibility(4);
                    PermissionTutorialActivity.this.f10791b.setBackgroundResource(C2656R.drawable.outline_lens_black_18dp);
                    PermissionTutorialActivity.this.f10792c.setBackgroundResource(C2656R.drawable.baseline_lens_black_18dp);
                    PermissionTutorialActivity.this.f10793d.setBackgroundResource(C2656R.drawable.outline_lens_black_18dp);
                    PermissionTutorialActivity.this.f10794e.setBackgroundResource(C2656R.drawable.outline_lens_black_18dp);
                    PermissionTutorialActivity.this.f10795f.setBackgroundResource(C2656R.drawable.outline_lens_black_18dp);
                    PermissionTutorialActivity.this.f10796g.setBackgroundResource(C2656R.drawable.outline_lens_black_18dp);
                    return;
                case 2:
                    PermissionTutorialActivity.this.f10797h.setVisibility(4);
                    PermissionTutorialActivity.this.f10791b.setBackgroundResource(C2656R.drawable.outline_lens_black_18dp);
                    PermissionTutorialActivity.this.f10792c.setBackgroundResource(C2656R.drawable.outline_lens_black_18dp);
                    PermissionTutorialActivity.this.f10793d.setBackgroundResource(C2656R.drawable.baseline_lens_black_18dp);
                    PermissionTutorialActivity.this.f10794e.setBackgroundResource(C2656R.drawable.outline_lens_black_18dp);
                    PermissionTutorialActivity.this.f10795f.setBackgroundResource(C2656R.drawable.outline_lens_black_18dp);
                    PermissionTutorialActivity.this.f10796g.setBackgroundResource(C2656R.drawable.outline_lens_black_18dp);
                    return;
                case 3:
                    PermissionTutorialActivity.this.f10797h.setVisibility(4);
                    PermissionTutorialActivity.this.f10791b.setBackgroundResource(C2656R.drawable.outline_lens_black_18dp);
                    PermissionTutorialActivity.this.f10792c.setBackgroundResource(C2656R.drawable.outline_lens_black_18dp);
                    PermissionTutorialActivity.this.f10793d.setBackgroundResource(C2656R.drawable.outline_lens_black_18dp);
                    PermissionTutorialActivity.this.f10794e.setBackgroundResource(C2656R.drawable.baseline_lens_black_18dp);
                    PermissionTutorialActivity.this.f10795f.setBackgroundResource(C2656R.drawable.outline_lens_black_18dp);
                    PermissionTutorialActivity.this.f10796g.setBackgroundResource(C2656R.drawable.outline_lens_black_18dp);
                    return;
                case 4:
                    PermissionTutorialActivity.this.f10797h.setVisibility(4);
                    PermissionTutorialActivity.this.f10791b.setBackgroundResource(C2656R.drawable.outline_lens_black_18dp);
                    PermissionTutorialActivity.this.f10792c.setBackgroundResource(C2656R.drawable.outline_lens_black_18dp);
                    PermissionTutorialActivity.this.f10793d.setBackgroundResource(C2656R.drawable.outline_lens_black_18dp);
                    PermissionTutorialActivity.this.f10794e.setBackgroundResource(C2656R.drawable.outline_lens_black_18dp);
                    PermissionTutorialActivity.this.f10795f.setBackgroundResource(C2656R.drawable.baseline_lens_black_18dp);
                    PermissionTutorialActivity.this.f10796g.setBackgroundResource(C2656R.drawable.outline_lens_black_18dp);
                    return;
                case 5:
                    PermissionTutorialActivity.this.f10797h.setVisibility(0);
                    PermissionTutorialActivity.this.f10791b.setBackgroundResource(C2656R.drawable.outline_lens_black_18dp);
                    PermissionTutorialActivity.this.f10792c.setBackgroundResource(C2656R.drawable.outline_lens_black_18dp);
                    PermissionTutorialActivity.this.f10793d.setBackgroundResource(C2656R.drawable.outline_lens_black_18dp);
                    PermissionTutorialActivity.this.f10794e.setBackgroundResource(C2656R.drawable.outline_lens_black_18dp);
                    PermissionTutorialActivity.this.f10795f.setBackgroundResource(C2656R.drawable.outline_lens_black_18dp);
                    PermissionTutorialActivity.this.f10796g.setBackgroundResource(C2656R.drawable.baseline_lens_black_18dp);
                    return;
                default:
                    return;
            }
        }

        /* renamed from: a */
        public void mo3081a(int i, float f, int i2) {
        }

        /* renamed from: b */
        public void mo3082b(int i) {
        }
    };

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C2656R.layout.activity_permission_tutorial);
        this.f10790a = (LinearLayout) findViewById(C2656R.C2657id.activity_permssion_tutorial_indicator_layout);
        this.f10791b = (ImageView) findViewById(C2656R.C2657id.activity_permssion_tutorial_indicator_0_imageview);
        this.f10792c = (ImageView) findViewById(C2656R.C2657id.activity_permssion_tutorial_indicator_1_imageview);
        this.f10793d = (ImageView) findViewById(C2656R.C2657id.activity_permssion_tutorial_indicator_2_imageview);
        this.f10794e = (ImageView) findViewById(C2656R.C2657id.activity_permssion_tutorial_indicator_3_imageview);
        this.f10795f = (ImageView) findViewById(C2656R.C2657id.activity_permssion_tutorial_indicator_4_imageview);
        this.f10796g = (ImageView) findViewById(C2656R.C2657id.activity_permssion_tutorial_indicator_5_imageview);
        this.f10797h = (Button) findViewById(C2656R.C2657id.activity_permssion_tutorial_okay_button);
        this.f10797h.setVisibility(4);
        this.f10797h.setOnClickListener(this.f10798i);
        ViewPager viewPager = (ViewPager) findViewById(C2656R.C2657id.activity_permssion_tutorial_viewpager);
        viewPager.setAdapter(new C2627a(this));
        viewPager.setOnPageChangeListener(this.f10799j);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Permission Tutorial").setMessage("HS Instructor 2.0 need Location and Storage permission for running application.").setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        builder.show();
    }
}
